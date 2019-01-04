package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pph_templates extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.pph_templates";
    public static final String myFingerPrint = "43ea588dec239bb4bbe3afdee693be3510a067f94afb232c6f116b57e2b7e5a9";
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 847L)
    private static SubLSymbol $within_initialize_gen_template_storeP$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 5611L)
    private static SubLSymbol $pph_kappa_justification_template_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 6301L)
    private static SubLSymbol $rephrase_gen_template_for_kappa_pred_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 14545L)
    private static SubLSymbol $pph_template_bound_vars$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 22505L)
    private static SubLSymbol $phrase_naut_arg_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 49311L)
    private static SubLSymbol $pph_dnf_clausal_form_cached_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 86299L)
    private static SubLSymbol $gen_template_verbosity_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 95446L)
    private static SubLSymbol $phrase_naut_deepening_inference_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 96776L)
    private static SubLSymbol $do_pph_expand_phrase_nauts_stack$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 104723L)
    private static SubLSymbol $meta_template_null$;
    private static final SubLString $str0$_PPH_error_level_;
    private static final SubLString $str1$__;
    private static final SubLString $str2$Recursive_call_to_INITIALIZE_GEN_;
    private static final SubLSymbol $kw3$NEW;
    private static final SubLSymbol $kw4$INITIALIZED;
    private static final SubLString $str5$gen_template_store_length_of__S_i;
    private static final SubLSymbol $sym6$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const7$EverythingPSC;
    private static final SubLObject $const8$NLTemplateGenerationPredicate;
    private static final SubLObject $const9$isa;
    private static final SubLSymbol $kw10$BREADTH;
    private static final SubLSymbol $kw11$QUEUE;
    private static final SubLSymbol $kw12$STACK;
    private static final SubLSymbol $sym13$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw14$ERROR;
    private static final SubLString $str15$_A_is_not_a__A;
    private static final SubLSymbol $sym16$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw17$CERROR;
    private static final SubLString $str18$continue_anyway;
    private static final SubLSymbol $kw19$WARN;
    private static final SubLString $str20$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLString $str21$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str22$attempting_to_bind_direction_link;
    private static final SubLList $list23;
    private static final SubLString $str24$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLString $str25$gen_template_store_length__S_is_i;
    private static final SubLString $str26$gen_template_store_length__S_is_u;
    private static final SubLObject $const27$Relation;
    private static final SubLSymbol $sym28$SPEC_;
    private static final SubLSymbol $kw29$DONE;
    private static final SubLString $str30$Initializing__S___;
    private static final SubLSymbol $kw31$GAF;
    private static final SubLSymbol $kw32$OFF;
    private static final SubLSymbol $kw33$FAST;
    private static final SubLSymbol $sym34$ADD_GEN_TEMPLATE;
    private static final SubLSymbol $kw35$TRUE;
    private static final SubLString $str36$Unable_to_add_assertion_to_gen_te;
    private static final SubLSymbol $sym37$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str38$___Top_level_CycL___S;
    private static final SubLList $list39;
    private static final SubLSymbol $sym40$PPH_KAPPA_JUSTIFICATION_TEMPLATE;
    private static final SubLSymbol $sym41$REPHRASE_GEN_TEMPLATE_FOR_KAPPA_PRED;
    private static final SubLSymbol $kw42$ANYTHING;
    private static final SubLSymbol $sym43$_PPH_KAPPA_JUSTIFICATION_TEMPLATE_CACHING_STATE_;
    private static final SubLObject $const44$Kappa;
    private static final SubLList $list45;
    private static final SubLSymbol $sym46$TEMPLATE;
    private static final SubLSymbol $sym47$VARS;
    private static final SubLSymbol $sym48$_REPHRASE_GEN_TEMPLATE_FOR_KAPPA_PRED_CACHING_STATE_;
    private static final SubLInteger $int49$1024;
    private static final SubLString $str50$kappaGenTemplateRuleForArity;
    private static final SubLSymbol $sym51$_RULE;
    private static final SubLList $list52;
    private static final SubLObject $const53$InferencePSC;
    private static final SubLSymbol $sym54$ASSERTION_P;
    private static final SubLSymbol $kw55$REINITIALIZED;
    private static final SubLSymbol $sym56$REMOVE_GEN_TEMPLATE;
    private static final SubLString $str57$PPH_PHRASE_FROM_ASSERTION_passed_;
    private static final SubLString $str58$PPH_PHRASE_FROM_ASSERTION_passed_;
    private static final SubLSymbol $kw59$SLOW;
    private static final SubLSymbol $sym60$EL_FORMULA_P;
    private static final SubLString $str61$______expanded_template_for__S___;
    private static final SubLSymbol $sym62$REPEATED_ARGS_PHRASE_NAUT_P;
    private static final SubLSymbol $sym63$GENERIC_ARG_P;
    private static final SubLSymbol $sym64$PPH_NON_TEMPLATE_BOUND_EL_VAR_;
    private static final SubLObject $const65$TheNthFn;
    private static final SubLString $str66$_S_can_t_begin_a___GenTemplateRec;
    private static final SubLSymbol $kw67$IGNORE;
    private static final SubLString $str68$Wf_problem_with__S;
    private static final SubLString $str69$_S_expects_a_closed_formula_for_i;
    private static final SubLString $str70$_S_expects_a_cycl_sentence_askabl;
    private static final SubLObject $const71$SententialConstituent;
    private static final SubLSymbol $sym72$PPH_SPEC_;
    private static final SubLObject $const73$LexicalWord;
    private static final SubLString $str74$_S_is_required_to_be_a___LexicalW;
    private static final SubLString $str75$_S_exceeds_the_maxArity___S__allo;
    private static final SubLObject $const76$argIsa;
    private static final SubLObject $const77$GeneralLexiconMt;
    private static final SubLList $list78;
    private static final SubLObject $const79$Thing;
    private static final SubLString $str80$_S_isn_t_a__S_w_r_t___S;
    private static final SubLString $str81$__Self_referential___genTemplate_;
    private static final SubLString $str82$__Bad_generic_arg_keyword___S__in;
    private static final SubLObject $const83$genTemplate;
    private static final SubLObject $const84$genTemplate_QuerySentence;
    private static final SubLObject $const85$genTemplate_Constrained;
    private static final SubLObject $const86$detailedIsaParaphrase;
    private static final SubLString $str87$_non_wf__needs_instructions_for_i;
    private static final SubLSymbol $sym88$PHRASE_NAUT_ARG;
    private static final SubLString $str89$_S_has_no_known_arity___;
    private static final SubLSymbol $sym90$_PHRASE_NAUT_ARG_CACHING_STATE_;
    private static final SubLInteger $int91$128;
    private static final SubLList $list92;
    private static final SubLString $str93$_S_is_not_a_well_formed_genTempla;
    private static final SubLString $str94$PPH_PHRASE_FROM_GENTEMPLATE_PHRAS;
    private static final SubLList $list95;
    private static final SubLSymbol $kw96$ARG1;
    private static final SubLSymbol $sym97$PPH_ARG_POSITION_SPECIFIER_;
    private static final SubLObject $const98$PossessivePhrase;
    private static final SubLString $str99$Don_t_know_how_to_make_a_PPH_PHRA;
    private static final SubLString $str100$Couldn_t_make_PPH_phrase_from__S;
    private static final SubLSymbol $kw101$SUBJECT_VERB;
    private static final SubLString $str102$Bad_Nth_phrase___S__Dtr_count_is_;
    private static final SubLString $str103$Phrase_specified_to_agree_with_it;
    private static final SubLString $str104$Can_t_dereference__S_in____S;
    private static final SubLString $str105$Potentially_recursive_agr___S____;
    private static final SubLString $str106$Dereferenced__S_to__S;
    private static final SubLSymbol $sym107$PPH_HEAD_DTR_NAUT_;
    private static final SubLSymbol $kw108$ARG2;
    private static final SubLString $str109$Incompatible_constraint__S_on__S;
    private static final SubLString $str110$NthPhraseAgrFn;
    private static final SubLSymbol $kw111$PEER;
    private static final SubLString $str112$__Warning__null_constraint_on__S_;
    private static final SubLString $str113$Don_t_know_what_to_do_with__S_con;
    private static final SubLObject $const114$Verb;
    private static final SubLList $list115;
    private static final SubLObject $const116$Determiner;
    private static final SubLList $list117;
    private static final SubLList $list118;
    private static final SubLSymbol $kw119$DET_NBAR;
    private static final SubLSymbol $kw120$ANY;
    private static final SubLSymbol $kw121$NL_PREDS;
    private static final SubLSymbol $kw122$POS_PRED;
    private static final SubLString $str123$__Agr_preds_for_the_determiner__S;
    private static final SubLString $str124$Using_default_agr_preds__S_for__S;
    private static final SubLSymbol $sym125$PPH_AGR_PREDS_FOR_DET_CYCL;
    private static final SubLList $list126;
    private static final SubLObject $const127$denotation;
    private static final SubLSymbol $sym128$PPH_GENL_POS_PRED_;
    private static final SubLObject $const129$genFormat_ArgFixed;
    private static final SubLObject $const130$equals;
    private static final SubLSymbol $sym131$PPH_DNF_CLAUSAL_FORM_CACHED;
    private static final SubLSymbol $sym132$_PPH_DNF_CLAUSAL_FORM_CACHED_CACHING_STATE_;
    private static final SubLSymbol $sym133$PPH_DNF_CLAUSAL_FORM;
    private static final SubLList $list134;
    private static final SubLSymbol $sym135$FORT_P;
    private static final SubLSymbol $sym136$GENERALITY_ESTIMATE;
    private static final SubLList $list137;
    private static final SubLString $str138$Don_t_know_how_to_convert__S_to__;
    private static final SubLObject $const139$Determiner_Indefinite;
    private static final SubLSymbol $kw140$INDEFINITE;
    private static final SubLObject $const141$Determiner_Definite;
    private static final SubLSymbol $kw142$DEFINITE;
    private static final SubLObject $const143$nounStrings;
    private static final SubLObject $const144$plural_Generic;
    private static final SubLObject $const145$nonSingular_Generic;
    private static final SubLObject $const146$nonPlural_Generic;
    private static final SubLSymbol $sym147$GENTEMPLATE_PHRASE_FROM_PPH_PHRASE_INT;
    private static final SubLObject $const148$verbStrings;
    private static final SubLSymbol $sym149$PPH_CUSTOMIZE_TEMPLATE_MACRO_HELPER;
    private static final SubLSymbol $sym150$DO_PPH_PHRASES_FOR_FORMULA;
    private static final SubLSymbol $kw151$UNSPECIFIED;
    private static final SubLList $list152;
    private static final SubLString $str153$__Found_PPH_PHRASE_for__S_____S__;
    private static final SubLSymbol $sym154$GENERATE_PHRASE_FROM_TEMPLATE;
    private static final SubLSymbol $sym155$_;
    private static final SubLSymbol $sym156$PPH_PHRASE_TOP_LEVEL_DEMERITS;
    private static final SubLSymbol $kw157$RANDOM;
    private static final SubLSymbol $sym158$_;
    private static final SubLSymbol $sym159$GEN_TEMPLATE_VERBOSITY;
    private static final SubLSymbol $sym160$GET_GEN_TEMPLATE_ASSERTION;
    private static final SubLSymbol $kw161$GEN_FORMAT;
    private static final SubLString $str162$Couldn_t_use_gen_template_____S__;
    private static final SubLString $str163$Expected_gen_template__got__S__;
    private static final SubLString $str164$Skipping_forbidden_lexical_assert;
    private static final SubLSymbol $kw165$INVERSE;
    private static final SubLString $str166$__Reinitializing_relns_to_use___;
    private static final SubLObject $const167$genlPreds;
    private static final SubLSymbol $kw168$DEPTH;
    private static final SubLObject $const169$True_JustificationTruth;
    private static final SubLString $str170$Inverting_templates_for__S;
    private static final SubLSymbol $sym171$PPH_GENL_RELATION_;
    private static final SubLString $str172$Relns_to_use___S__;
    private static final SubLSymbol $sym173$PPH_GENL_PREDS_DISTANCE;
    private static final SubLObject $const174$genlInverse;
    private static final SubLSymbol $kw175$ASSERTION;
    private static final SubLString $str176$__Using_inferior_templates___;
    private static final SubLSymbol $sym177$GENERATION_TEMPLATE_P;
    private static final SubLString $str178$__Head_of_queue_____S__;
    private static final SubLString $str179$Sending_inferior_templates_to_end;
    private static final SubLString $str180$Couldn_t_use_any_gen_templates_fr;
    private static final SubLString $str181$__Reverting_to___genFormat_for__S;
    private static final SubLSymbol $kw182$INFERIOR;
    private static final SubLString $str183$__Populating_gen_template_sets_wi;
    private static final SubLSymbol $kw184$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym185$IGNORE_ERRORS_HANDLER;
    private static final SubLString $str186$Adding__GEN_FORMAT_at_end_of_queu;
    private static final SubLSymbol $sym187$CAND;
    private static final SubLList $list188;
    private static final SubLList $list189;
    private static final SubLSymbol $sym190$RELEVANT_PRED_IS_EVERYTHING;
    private static final SubLList $list191;
    private static final SubLString $str192$__Couldn_t_find_paraphrase_templa;
    private static final SubLString $str193$Infinite_recursion_for__S_using__;
    private static final SubLSymbol $sym194$PPH_GFAF_ASSERTIONS_FOR_RELN;
    private static final SubLInteger $int195$250;
    private static final SubLSymbol $sym196$CAR;
    private static final SubLObject $const197$genFormat_Precise;
    private static final SubLString $str198$Template_doesn_t_apply_to_input_f;
    private static final SubLString $str199$___S_is_a_symmetric_binary_predic;
    private static final SubLString $str200$__Switching_arg1_and_arg2_in_phra;
    private static final SubLString $str201$wrong_focal_argnum__wanted__S_;
    private static final SubLString $str202$Template_has_wrong_scope_for__S;
    private static final SubLSymbol $sym203$_GEN_TEMPLATE_VERBOSITY_CACHING_STATE_;
    private static final SubLInteger $int204$10000;
    private static final SubLString $str205$Couldn_t_swtich_arg1_and_arg2___i;
    private static final SubLString $str206$Gen_template_mt__S_not_visible_fr;
    private static final SubLString $str207$Gen_template_preds__S_not_compati;
    private static final SubLList $list208;
    private static final SubLSymbol $kw209$UNKNOWN;
    private static final SubLString $str210$__Checking_precision_of__S_vs___S;
    private static final SubLString $str211$Not_using___genTemplate_because_o;
    private static final SubLString $str212$__Template_judged_imprecise_becau;
    private static final SubLList $list213;
    private static final SubLList $list214;
    private static final SubLString $str215$Deepened____S___to__S;
    private static final SubLObject $const216$deeperGenTemplateRecipe;
    private static final SubLList $list217;
    private static final SubLSymbol $kw218$MAX_TRANSFORMATION_DEPTH;
    private static final SubLSymbol $kw219$MAX_NUMBER;
    private static final SubLSymbol $kw220$MAX_TIME;
    private static final SubLSymbol $kw221$CACHE_INFERENCE_RESULTS_;
    private static final SubLSymbol $kw222$ANSWER_LANGUAGE;
    private static final SubLSymbol $kw223$HL;
    private static final SubLSymbol $kw224$CONTINUABLE_;
    private static final SubLSymbol $kw225$RETURN;
    private static final SubLList $list226;
    private static final SubLSymbol $kw227$ALLOW_INDETERMINATE_RESULTS_;
    private static final SubLSymbol $kw228$DISJUNCTION_FREE_EL_VARS_POLICY;
    private static final SubLSymbol $kw229$COMPUTE_INTERSECTION;
    private static final SubLSymbol $kw230$PROBLEM_STORE;
    private static final SubLSymbol $kw231$INTERMEDIATE_STEP_VALIDATION_LEVEL;
    private static final SubLSymbol $kw232$NONE;
    private static final SubLString $str233$__Phrasifying__S___;
    private static final SubLList $list234;
    private static final SubLSymbol $kw235$DO_PPH_EXPAND_PHRASE_NAUTS_RECURSION_LIMIT;
    private static final SubLString $str236$__Expanded_form_is__S___;
    private static final SubLSymbol $sym237$_EXIT;
    private static final SubLString $str238$Recursion_limit_exceeded_expandin;
    private static final SubLInteger $int239$50;
    private static final SubLString $str240$Already_expanded__S;
    private static final SubLSymbol $sym241$DO_PPH_EXPAND_PHRASE_NAUTS;
    private static final SubLSymbol $sym242$PPH_IDENTITY_TEMPLATE_P;
    private static final SubLString $str243$Expansions_that_refer_to__S_tend_;
    private static final SubLString $str244$Checking__gen_template_store____;
    private static final SubLList $list245;
    private static final SubLString $str246$checking__S;
    private static final SubLString $str247$non_wff_template__S___S;
    private static final SubLString $str248$Checking_the_misc__extent_of___Be;
    private static final SubLString $str249$____;
    private static final SubLObject $const250$Function;
    private static final SubLSymbol $sym251$CONSTANT_P;
    private static final SubLString $str252$Searching___genTemplate_Constrain;
    private static final SubLSymbol $kw253$NULL;
    private static final SubLSymbol $sym254$META_GEN_TEMPLATE_P;
    private static final SubLSymbol $sym255$UPDATE_TEMPLATE_OPERATOR;
    private static final SubLObject $const256$metaGenTemplate_QuerySentence;
    private static final SubLSymbol $kw257$OR;
    private static final SubLSymbol $sym258$NON_NEGATIVE_INTEGER_P;
    private static final SubLSymbol $sym259$MTEMPLATE_DISJUNCTION_P;
    private static final SubLSymbol $kw260$AND;
    private static final SubLString $str261$dependent_disjunction__a_has_vary;
    private static final SubLString $str262$PPH_Template_Supercategory;
    private static final SubLString $str263$Gen_Template_Subcategory;
    private static final SubLString $str264$Gen_Template_Recipe_Test_Battery;
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 963L)
    public static SubLObject initialize_gen_template_store() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_templates.NIL != pph_templates.$within_initialize_gen_template_storeP$.getDynamicValue(thread)) {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_templates.$str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_templates.ONE_INTEGER), pph_templates.$str1$__, format_nil.format_nil_a_no_copy((SubLObject)pph_templates.$str2$Recursive_call_to_INITIALIZE_GEN_) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(pph_templates.EMPTY_SUBL_OBJECT_ARRAY));
        }
        final SubLObject _prev_bind_0 = pph_templates.$within_initialize_gen_template_storeP$.currentBinding(thread);
        try {
            pph_templates.$within_initialize_gen_template_storeP$.bind((SubLObject)pph_templates.T, thread);
            final SubLObject halt_agenda_during_initializationP = (SubLObject)SubLObjectFactory.makeBoolean(pph_templates.NIL != agenda.agenda_running() && pph_templates.NIL == agenda.current_process_is_agenda());
            if (pph_templates.NIL != halt_agenda_during_initializationP) {
                agenda.halt_agenda((SubLObject)pph_templates.TWO_INTEGER);
            }
            try {
                SubLObject release = (SubLObject)pph_templates.NIL;
                try {
                    release = Locks.seize_lock(pph_vars.$gen_template_store_lock$.getGlobalValue());
                    pph_data_structures.clear_gen_template_store();
                    pph_functions.initialize_pph_phrase_fns();
                    final SubLObject _prev_bind_0_$1 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
                    try {
                        pph_macros.$free_pph_problem_store_pointers$.bind((SubLObject)pph_templates.NIL, thread);
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$2 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                        try {
                            pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                            final SubLObject reuseP = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            try {
                                thread.resetMultipleValues();
                                final SubLObject _prev_bind_0_$3 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                try {
                                    pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                    final SubLObject new_or_reused = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    final SubLObject _prev_bind_0_$4 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                    try {
                                        pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                        final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                        final SubLObject _prev_bind_0_$5 = memoization_state.$memoization_state$.currentBinding(thread);
                                        try {
                                            memoization_state.$memoization_state$.bind(local_state, thread);
                                            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                            try {
                                                do_initialize_gen_template_store();
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_templates.T, thread);
                                                    final SubLObject _values = Values.getValuesAsVector();
                                                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                                    Values.restoreValuesFromVector(_values);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                                                }
                                            }
                                        }
                                        finally {
                                            memoization_state.$memoization_state$.rebind(_prev_bind_0_$5, thread);
                                        }
                                    }
                                    finally {
                                        pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$4, thread);
                                    }
                                    if (new_or_reused == pph_templates.$kw3$NEW && pph_templates.NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread))) {
                                        memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                    }
                                }
                                finally {
                                    pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$3, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_templates.T, thread);
                                    final SubLObject _values2 = Values.getValuesAsVector();
                                    if (pph_templates.NIL == reuseP) {
                                        pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                    }
                                    Values.restoreValuesFromVector(_values2);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                                }
                            }
                        }
                        finally {
                            pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$2, thread);
                        }
                    }
                    finally {
                        pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0_$1, thread);
                    }
                }
                finally {
                    if (pph_templates.NIL != release) {
                        Locks.release_lock(pph_vars.$gen_template_store_lock$.getGlobalValue());
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_templates.T, thread);
                    final SubLObject _values3 = Values.getValuesAsVector();
                    if (pph_templates.NIL != halt_agenda_during_initializationP) {
                        agenda.start_agenda((SubLObject)pph_templates.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values3);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                }
            }
        }
        finally {
            pph_templates.$within_initialize_gen_template_storeP$.rebind(_prev_bind_0, thread);
        }
        pph_main.clear_paraphrase_caches((SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
        pph_data_structures.note_gen_template_store_initialized();
        return (SubLObject)pph_templates.$kw4$INITIALIZED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 1825L)
    public static SubLObject gen_template_store_length_saneP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject num_templates_in_kb = (SubLObject)pph_templates.ZERO_INTEGER;
        final SubLObject length = pph_data_structures.gen_template_store_length();
        if (pph_templates.NIL == subl_promotions.positive_integer_p(length)) {
            Errors.warn((SubLObject)pph_templates.$str5$gen_template_store_length_of__S_i, length);
            return (SubLObject)pph_templates.NIL;
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)pph_templates.$sym6$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(pph_templates.$const7$EverythingPSC, thread);
            final SubLObject node_var = pph_templates.$const8$NLTemplateGenerationPredicate;
            final SubLObject _prev_bind_0_$9 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            final SubLObject _prev_bind_1_$10 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(pph_templates.$const9$isa), thread);
                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    SubLObject node_var_$11 = node_var;
                    final SubLObject deck_type = (SubLObject)pph_templates.$kw12$STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$10 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject tv_var = (SubLObject)pph_templates.NIL;
                            final SubLObject _prev_bind_0_$11 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$11 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind((pph_templates.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((pph_templates.NIL != tv_var) ? pph_templates.$sym13$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                if (pph_templates.NIL != tv_var && pph_templates.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && pph_templates.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql((SubLObject)pph_templates.$kw14$ERROR)) {
                                        sbhl_paranoia.sbhl_error((SubLObject)pph_templates.ONE_INTEGER, (SubLObject)pph_templates.$str15$_A_is_not_a__A, tv_var, (SubLObject)pph_templates.$sym16$SBHL_TRUE_TV_P, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)pph_templates.$kw17$CERROR)) {
                                        sbhl_paranoia.sbhl_cerror((SubLObject)pph_templates.ONE_INTEGER, (SubLObject)pph_templates.$str18$continue_anyway, (SubLObject)pph_templates.$str15$_A_is_not_a__A, tv_var, (SubLObject)pph_templates.$sym16$SBHL_TRUE_TV_P, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)pph_templates.$kw19$WARN)) {
                                        Errors.warn((SubLObject)pph_templates.$str15$_A_is_not_a__A, tv_var, (SubLObject)pph_templates.$sym16$SBHL_TRUE_TV_P);
                                    }
                                    else {
                                        Errors.warn((SubLObject)pph_templates.$str20$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror((SubLObject)pph_templates.$str18$continue_anyway, (SubLObject)pph_templates.$str15$_A_is_not_a__A, tv_var, (SubLObject)pph_templates.$sym16$SBHL_TRUE_TV_P);
                                    }
                                }
                                final SubLObject _prev_bind_0_$12 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$12 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(pph_templates.$const9$isa)), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(pph_templates.$const9$isa))), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(pph_templates.$const9$isa))), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)pph_templates.NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(pph_templates.$const9$isa)), thread);
                                    if (pph_templates.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || pph_templates.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module((SubLObject)pph_templates.UNPROVIDED))) {
                                        final SubLObject _prev_bind_0_$13 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$13 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$19 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(pph_templates.$const9$isa))), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)pph_templates.NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$11, (SubLObject)pph_templates.UNPROVIDED);
                                            while (pph_templates.NIL != node_var_$11) {
                                                final SubLObject tt_node_var = node_var_$11;
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(pph_templates.$const9$isa));
                                                SubLObject module_var = (SubLObject)pph_templates.NIL;
                                                module_var = cdolist_list_var.first();
                                                while (pph_templates.NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$14 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$14 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((pph_templates.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(pph_templates.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                        if (pph_templates.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)pph_templates.UNPROVIDED));
                                                            if (pph_templates.NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(pph_templates.$const9$isa)), sbhl_module_vars.get_sbhl_module((SubLObject)pph_templates.UNPROVIDED));
                                                                if (pph_templates.NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); pph_templates.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (pph_templates.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            final SubLObject _prev_bind_0_$15 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$23;
                                                                                for (iteration_state_$23 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); pph_templates.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$23); iteration_state_$23 = dictionary_contents.do_dictionary_contents_next(iteration_state_$23)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$23);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (pph_templates.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$16 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (pph_templates.NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject pred;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)pph_templates.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); pph_templates.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    pred = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (pph_templates.NIL != set_contents.do_set_contents_element_validP(state, pred) && pph_templates.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (pph_templates.NIL != forts.fort_p(pred)) {
                                                                                                            num_templates_in_kb = Numbers.add(num_templates_in_kb, kb_indexing.num_predicate_extent_index(pred, (SubLObject)pph_templates.UNPROVIDED));
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject pred2 = (SubLObject)pph_templates.NIL;
                                                                                                pred2 = csome_list_var.first();
                                                                                                while (pph_templates.NIL != csome_list_var) {
                                                                                                    if (pph_templates.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (pph_templates.NIL != forts.fort_p(pred2)) {
                                                                                                            num_templates_in_kb = Numbers.add(num_templates_in_kb, kb_indexing.num_predicate_extent_index(pred2, (SubLObject)pph_templates.UNPROVIDED));
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    pred2 = csome_list_var.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)pph_templates.$str21$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$16, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$23);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$15, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)pph_templates.FIVE_INTEGER, (SubLObject)pph_templates.$str22$attempting_to_bind_direction_link, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
                                                            }
                                                            if (pph_templates.NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module((SubLObject)pph_templates.UNPROVIDED))) {
                                                                SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                SubLObject instance_tuple = (SubLObject)pph_templates.NIL;
                                                                instance_tuple = csome_list_var2.first();
                                                                while (pph_templates.NIL != csome_list_var2) {
                                                                    SubLObject current;
                                                                    final SubLObject datum = current = instance_tuple;
                                                                    SubLObject link_node = (SubLObject)pph_templates.NIL;
                                                                    SubLObject mt2 = (SubLObject)pph_templates.NIL;
                                                                    SubLObject tv2 = (SubLObject)pph_templates.NIL;
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_templates.$list23);
                                                                    link_node = current.first();
                                                                    current = current.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_templates.$list23);
                                                                    mt2 = current.first();
                                                                    current = current.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_templates.$list23);
                                                                    tv2 = current.first();
                                                                    current = current.rest();
                                                                    if (pph_templates.NIL == current) {
                                                                        if (pph_templates.NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                            final SubLObject _prev_bind_0_$17 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                if (pph_templates.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$18 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol;
                                                                                        final SubLObject link_nodes2 = sol = (SubLObject)ConsesLow.list(link_node);
                                                                                        if (pph_templates.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject pred;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)pph_templates.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); pph_templates.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                pred = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (pph_templates.NIL != set_contents.do_set_contents_element_validP(state, pred) && pph_templates.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (pph_templates.NIL != forts.fort_p(pred)) {
                                                                                                        num_templates_in_kb = Numbers.add(num_templates_in_kb, kb_indexing.num_predicate_extent_index(pred, (SubLObject)pph_templates.UNPROVIDED));
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var_$27 = sol;
                                                                                            SubLObject pred2 = (SubLObject)pph_templates.NIL;
                                                                                            pred2 = csome_list_var_$27.first();
                                                                                            while (pph_templates.NIL != csome_list_var_$27) {
                                                                                                if (pph_templates.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (pph_templates.NIL != forts.fort_p(pred2)) {
                                                                                                        num_templates_in_kb = Numbers.add(num_templates_in_kb, kb_indexing.num_predicate_extent_index(pred2, (SubLObject)pph_templates.UNPROVIDED));
                                                                                                    }
                                                                                                }
                                                                                                csome_list_var_$27 = csome_list_var_$27.rest();
                                                                                                pred2 = csome_list_var_$27.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)pph_templates.$str21$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$18, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$17, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_templates.$list23);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    instance_tuple = csome_list_var2.first();
                                                                }
                                                            }
                                                        }
                                                        else if (pph_templates.NIL != obsolete.cnat_p(node, (SubLObject)pph_templates.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$28;
                                                            final SubLObject new_list = cdolist_list_var_$28 = ((pph_templates.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(pph_templates.$const9$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)pph_templates.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(pph_templates.$const9$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)pph_templates.UNPROVIDED)));
                                                            SubLObject generating_fn = (SubLObject)pph_templates.NIL;
                                                            generating_fn = cdolist_list_var_$28.first();
                                                            while (pph_templates.NIL != cdolist_list_var_$28) {
                                                                final SubLObject _prev_bind_0_$19 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes3 = sol2 = Functions.funcall(generating_fn, node);
                                                                    if (pph_templates.NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject pred3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)pph_templates.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); pph_templates.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            pred3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if (pph_templates.NIL != set_contents.do_set_contents_element_validP(state2, pred3) && pph_templates.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(pred3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                if (pph_templates.NIL != forts.fort_p(pred3)) {
                                                                                    num_templates_in_kb = Numbers.add(num_templates_in_kb, kb_indexing.num_predicate_extent_index(pred3, (SubLObject)pph_templates.UNPROVIDED));
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol2.isList()) {
                                                                        SubLObject csome_list_var3 = sol2;
                                                                        SubLObject pred4 = (SubLObject)pph_templates.NIL;
                                                                        pred4 = csome_list_var3.first();
                                                                        while (pph_templates.NIL != csome_list_var3) {
                                                                            if (pph_templates.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(pred4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                if (pph_templates.NIL != forts.fort_p(pred4)) {
                                                                                    num_templates_in_kb = Numbers.add(num_templates_in_kb, kb_indexing.num_predicate_extent_index(pred4, (SubLObject)pph_templates.UNPROVIDED));
                                                                                }
                                                                            }
                                                                            csome_list_var3 = csome_list_var3.rest();
                                                                            pred4 = csome_list_var3.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)pph_templates.$str21$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$19, thread);
                                                                }
                                                                cdolist_list_var_$28 = cdolist_list_var_$28.rest();
                                                                generating_fn = cdolist_list_var_$28.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$14, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$14, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                }
                                                SubLObject cdolist_list_var2;
                                                final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(pph_templates.$const9$isa)));
                                                SubLObject module_var2 = (SubLObject)pph_templates.NIL;
                                                module_var2 = cdolist_list_var2.first();
                                                while (pph_templates.NIL != cdolist_list_var2) {
                                                    final SubLObject _prev_bind_0_$20 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$15 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((pph_templates.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(pph_templates.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node2 = function_terms.naut_to_nart(node_var_$11);
                                                        if (pph_templates.NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                            final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module((SubLObject)pph_templates.UNPROVIDED));
                                                            if (pph_templates.NIL != d_link2) {
                                                                final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)pph_templates.UNPROVIDED));
                                                                if (pph_templates.NIL != mt_links2) {
                                                                    SubLObject iteration_state2;
                                                                    for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); pph_templates.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                        final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (pph_templates.NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                            final SubLObject _prev_bind_0_$21 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                SubLObject iteration_state_$24;
                                                                                for (iteration_state_$24 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); pph_templates.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$24); iteration_state_$24 = dictionary_contents.do_dictionary_contents_next(iteration_state_$24)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$24);
                                                                                    final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (pph_templates.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$22 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol3 = link_nodes4;
                                                                                            if (pph_templates.NIL != set.set_p(sol3)) {
                                                                                                final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                SubLObject basis_object3;
                                                                                                SubLObject state3;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)pph_templates.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); pph_templates.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                    if (pph_templates.NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node) && pph_templates.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)pph_templates.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)pph_templates.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol3.isList()) {
                                                                                                SubLObject csome_list_var4 = sol3;
                                                                                                SubLObject node_vars_link_node2 = (SubLObject)pph_templates.NIL;
                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                                while (pph_templates.NIL != csome_list_var4) {
                                                                                                    if (pph_templates.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)pph_templates.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)pph_templates.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var4 = csome_list_var4.rest();
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)pph_templates.$str21$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$22, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$24);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$21, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)pph_templates.FIVE_INTEGER, (SubLObject)pph_templates.$str22$attempting_to_bind_direction_link, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (pph_templates.NIL != obsolete.cnat_p(node2, (SubLObject)pph_templates.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$29;
                                                            final SubLObject new_list2 = cdolist_list_var_$29 = ((pph_templates.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)pph_templates.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)pph_templates.UNPROVIDED)));
                                                            SubLObject generating_fn2 = (SubLObject)pph_templates.NIL;
                                                            generating_fn2 = cdolist_list_var_$29.first();
                                                            while (pph_templates.NIL != cdolist_list_var_$29) {
                                                                final SubLObject _prev_bind_0_$23 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                    final SubLObject sol4;
                                                                    final SubLObject link_nodes5 = sol4 = Functions.funcall(generating_fn2, node2);
                                                                    if (pph_templates.NIL != set.set_p(sol4)) {
                                                                        final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                        SubLObject basis_object4;
                                                                        SubLObject state4;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = (SubLObject)pph_templates.NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); pph_templates.NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                            if (pph_templates.NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3) && pph_templates.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)pph_templates.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)pph_templates.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol4.isList()) {
                                                                        SubLObject csome_list_var5 = sol4;
                                                                        SubLObject node_vars_link_node4 = (SubLObject)pph_templates.NIL;
                                                                        node_vars_link_node4 = csome_list_var5.first();
                                                                        while (pph_templates.NIL != csome_list_var5) {
                                                                            if (pph_templates.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)pph_templates.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)pph_templates.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                            }
                                                                            csome_list_var5 = csome_list_var5.rest();
                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)pph_templates.$str21$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$23, thread);
                                                                }
                                                                cdolist_list_var_$29 = cdolist_list_var_$29.rest();
                                                                generating_fn2 = cdolist_list_var_$29.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$15, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$20, thread);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    module_var2 = cdolist_list_var2.first();
                                                }
                                                node_var_$11 = deck.deck_pop(recur_deck);
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$19, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$13, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$13, thread);
                                        }
                                    }
                                    else {
                                        sbhl_paranoia.sbhl_warn((SubLObject)pph_templates.TWO_INTEGER, (SubLObject)pph_templates.$str24$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)pph_templates.UNPROVIDED)), (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
                                    }
                                }
                                finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$12, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$12, thread);
                                }
                            }
                            finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$11, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$11, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$24 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_templates.T, thread);
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
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$10, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$25 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_templates.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$10, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$9, thread);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        final SubLObject ratio = Numbers.divide(num_templates_in_kb, length);
        if (ratio.numL((SubLObject)pph_templates.ONE_INTEGER)) {
            Errors.warn((SubLObject)pph_templates.$str25$gen_template_store_length__S_is_i, length, num_templates_in_kb);
            return (SubLObject)pph_templates.NIL;
        }
        if (ratio.numG((SubLObject)pph_templates.TEN_INTEGER)) {
            Errors.warn((SubLObject)pph_templates.$str26$gen_template_store_length__S_is_u, length, num_templates_in_kb);
            return (SubLObject)pph_templates.NIL;
        }
        return (SubLObject)pph_templates.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 2658L)
    public static SubLObject do_initialize_gen_template_store() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)pph_templates.$sym6$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(pph_templates.$const7$EverythingPSC, thread);
            final SubLObject node_var = pph_templates.$const8$NLTemplateGenerationPredicate;
            final SubLObject _prev_bind_0_$39 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            final SubLObject _prev_bind_1_$40 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(pph_templates.$const9$isa), thread);
                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    SubLObject node_var_$41 = node_var;
                    final SubLObject deck_type = (SubLObject)pph_templates.$kw12$STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$40 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject tv_var = (SubLObject)pph_templates.NIL;
                            final SubLObject _prev_bind_0_$41 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$41 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind((pph_templates.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((pph_templates.NIL != tv_var) ? pph_templates.$sym13$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                if (pph_templates.NIL != tv_var && pph_templates.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && pph_templates.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql((SubLObject)pph_templates.$kw14$ERROR)) {
                                        sbhl_paranoia.sbhl_error((SubLObject)pph_templates.ONE_INTEGER, (SubLObject)pph_templates.$str15$_A_is_not_a__A, tv_var, (SubLObject)pph_templates.$sym16$SBHL_TRUE_TV_P, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)pph_templates.$kw17$CERROR)) {
                                        sbhl_paranoia.sbhl_cerror((SubLObject)pph_templates.ONE_INTEGER, (SubLObject)pph_templates.$str18$continue_anyway, (SubLObject)pph_templates.$str15$_A_is_not_a__A, tv_var, (SubLObject)pph_templates.$sym16$SBHL_TRUE_TV_P, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)pph_templates.$kw19$WARN)) {
                                        Errors.warn((SubLObject)pph_templates.$str15$_A_is_not_a__A, tv_var, (SubLObject)pph_templates.$sym16$SBHL_TRUE_TV_P);
                                    }
                                    else {
                                        Errors.warn((SubLObject)pph_templates.$str20$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror((SubLObject)pph_templates.$str18$continue_anyway, (SubLObject)pph_templates.$str15$_A_is_not_a__A, tv_var, (SubLObject)pph_templates.$sym16$SBHL_TRUE_TV_P);
                                    }
                                }
                                final SubLObject _prev_bind_0_$42 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$42 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(pph_templates.$const9$isa)), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(pph_templates.$const9$isa))), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(pph_templates.$const9$isa))), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)pph_templates.NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(pph_templates.$const9$isa)), thread);
                                    if (pph_templates.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || pph_templates.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module((SubLObject)pph_templates.UNPROVIDED))) {
                                        final SubLObject _prev_bind_0_$43 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$43 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$49 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(pph_templates.$const9$isa))), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)pph_templates.NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$41, (SubLObject)pph_templates.UNPROVIDED);
                                            while (pph_templates.NIL != node_var_$41) {
                                                final SubLObject tt_node_var = node_var_$41;
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(pph_templates.$const9$isa));
                                                SubLObject module_var = (SubLObject)pph_templates.NIL;
                                                module_var = cdolist_list_var.first();
                                                while (pph_templates.NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$44 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$44 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((pph_templates.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(pph_templates.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                        if (pph_templates.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)pph_templates.UNPROVIDED));
                                                            if (pph_templates.NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(pph_templates.$const9$isa)), sbhl_module_vars.get_sbhl_module((SubLObject)pph_templates.UNPROVIDED));
                                                                if (pph_templates.NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); pph_templates.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (pph_templates.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            final SubLObject _prev_bind_0_$45 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$53;
                                                                                for (iteration_state_$53 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); pph_templates.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$53); iteration_state_$53 = dictionary_contents.do_dictionary_contents_next(iteration_state_$53)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$53);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (pph_templates.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$46 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (pph_templates.NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject pred;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)pph_templates.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); pph_templates.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    pred = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (pph_templates.NIL != set_contents.do_set_contents_element_validP(state, pred) && pph_templates.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (pph_templates.NIL != forts.fort_p(pred) && pph_templates.NIL != subl_promotions.memberP(pph_templates.$const27$Relation, kb_accessors.arg1_isa(pred, (SubLObject)pph_templates.UNPROVIDED), (SubLObject)pph_templates.$sym28$SPEC_, (SubLObject)pph_templates.UNPROVIDED)) {
                                                                                                            initialize_gen_templates_for_pred(pred);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject pred2 = (SubLObject)pph_templates.NIL;
                                                                                                pred2 = csome_list_var.first();
                                                                                                while (pph_templates.NIL != csome_list_var) {
                                                                                                    if (pph_templates.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (pph_templates.NIL != forts.fort_p(pred2) && pph_templates.NIL != subl_promotions.memberP(pph_templates.$const27$Relation, kb_accessors.arg1_isa(pred2, (SubLObject)pph_templates.UNPROVIDED), (SubLObject)pph_templates.$sym28$SPEC_, (SubLObject)pph_templates.UNPROVIDED)) {
                                                                                                            initialize_gen_templates_for_pred(pred2);
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    pred2 = csome_list_var.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)pph_templates.$str21$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$46, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$53);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$45, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)pph_templates.FIVE_INTEGER, (SubLObject)pph_templates.$str22$attempting_to_bind_direction_link, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
                                                            }
                                                            if (pph_templates.NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module((SubLObject)pph_templates.UNPROVIDED))) {
                                                                SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                SubLObject instance_tuple = (SubLObject)pph_templates.NIL;
                                                                instance_tuple = csome_list_var2.first();
                                                                while (pph_templates.NIL != csome_list_var2) {
                                                                    SubLObject current;
                                                                    final SubLObject datum = current = instance_tuple;
                                                                    SubLObject link_node = (SubLObject)pph_templates.NIL;
                                                                    SubLObject mt2 = (SubLObject)pph_templates.NIL;
                                                                    SubLObject tv2 = (SubLObject)pph_templates.NIL;
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_templates.$list23);
                                                                    link_node = current.first();
                                                                    current = current.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_templates.$list23);
                                                                    mt2 = current.first();
                                                                    current = current.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_templates.$list23);
                                                                    tv2 = current.first();
                                                                    current = current.rest();
                                                                    if (pph_templates.NIL == current) {
                                                                        if (pph_templates.NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                            final SubLObject _prev_bind_0_$47 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                if (pph_templates.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$48 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol;
                                                                                        final SubLObject link_nodes2 = sol = (SubLObject)ConsesLow.list(link_node);
                                                                                        if (pph_templates.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject pred;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)pph_templates.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); pph_templates.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                pred = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (pph_templates.NIL != set_contents.do_set_contents_element_validP(state, pred) && pph_templates.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (pph_templates.NIL != forts.fort_p(pred) && pph_templates.NIL != subl_promotions.memberP(pph_templates.$const27$Relation, kb_accessors.arg1_isa(pred, (SubLObject)pph_templates.UNPROVIDED), (SubLObject)pph_templates.$sym28$SPEC_, (SubLObject)pph_templates.UNPROVIDED)) {
                                                                                                        initialize_gen_templates_for_pred(pred);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var_$57 = sol;
                                                                                            SubLObject pred2 = (SubLObject)pph_templates.NIL;
                                                                                            pred2 = csome_list_var_$57.first();
                                                                                            while (pph_templates.NIL != csome_list_var_$57) {
                                                                                                if (pph_templates.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (pph_templates.NIL != forts.fort_p(pred2) && pph_templates.NIL != subl_promotions.memberP(pph_templates.$const27$Relation, kb_accessors.arg1_isa(pred2, (SubLObject)pph_templates.UNPROVIDED), (SubLObject)pph_templates.$sym28$SPEC_, (SubLObject)pph_templates.UNPROVIDED)) {
                                                                                                        initialize_gen_templates_for_pred(pred2);
                                                                                                    }
                                                                                                }
                                                                                                csome_list_var_$57 = csome_list_var_$57.rest();
                                                                                                pred2 = csome_list_var_$57.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)pph_templates.$str21$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$48, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$47, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_templates.$list23);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    instance_tuple = csome_list_var2.first();
                                                                }
                                                            }
                                                        }
                                                        else if (pph_templates.NIL != obsolete.cnat_p(node, (SubLObject)pph_templates.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$58;
                                                            final SubLObject new_list = cdolist_list_var_$58 = ((pph_templates.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(pph_templates.$const9$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)pph_templates.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(pph_templates.$const9$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)pph_templates.UNPROVIDED)));
                                                            SubLObject generating_fn = (SubLObject)pph_templates.NIL;
                                                            generating_fn = cdolist_list_var_$58.first();
                                                            while (pph_templates.NIL != cdolist_list_var_$58) {
                                                                final SubLObject _prev_bind_0_$49 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes3 = sol2 = Functions.funcall(generating_fn, node);
                                                                    if (pph_templates.NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject pred3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)pph_templates.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); pph_templates.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            pred3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if (pph_templates.NIL != set_contents.do_set_contents_element_validP(state2, pred3) && pph_templates.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(pred3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                if (pph_templates.NIL != forts.fort_p(pred3) && pph_templates.NIL != subl_promotions.memberP(pph_templates.$const27$Relation, kb_accessors.arg1_isa(pred3, (SubLObject)pph_templates.UNPROVIDED), (SubLObject)pph_templates.$sym28$SPEC_, (SubLObject)pph_templates.UNPROVIDED)) {
                                                                                    initialize_gen_templates_for_pred(pred3);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol2.isList()) {
                                                                        SubLObject csome_list_var3 = sol2;
                                                                        SubLObject pred4 = (SubLObject)pph_templates.NIL;
                                                                        pred4 = csome_list_var3.first();
                                                                        while (pph_templates.NIL != csome_list_var3) {
                                                                            if (pph_templates.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(pred4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                if (pph_templates.NIL != forts.fort_p(pred4) && pph_templates.NIL != subl_promotions.memberP(pph_templates.$const27$Relation, kb_accessors.arg1_isa(pred4, (SubLObject)pph_templates.UNPROVIDED), (SubLObject)pph_templates.$sym28$SPEC_, (SubLObject)pph_templates.UNPROVIDED)) {
                                                                                    initialize_gen_templates_for_pred(pred4);
                                                                                }
                                                                            }
                                                                            csome_list_var3 = csome_list_var3.rest();
                                                                            pred4 = csome_list_var3.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)pph_templates.$str21$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$49, thread);
                                                                }
                                                                cdolist_list_var_$58 = cdolist_list_var_$58.rest();
                                                                generating_fn = cdolist_list_var_$58.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$44, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$44, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                }
                                                SubLObject cdolist_list_var2;
                                                final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(pph_templates.$const9$isa)));
                                                SubLObject module_var2 = (SubLObject)pph_templates.NIL;
                                                module_var2 = cdolist_list_var2.first();
                                                while (pph_templates.NIL != cdolist_list_var2) {
                                                    final SubLObject _prev_bind_0_$50 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$45 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((pph_templates.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(pph_templates.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node2 = function_terms.naut_to_nart(node_var_$41);
                                                        if (pph_templates.NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                            final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module((SubLObject)pph_templates.UNPROVIDED));
                                                            if (pph_templates.NIL != d_link2) {
                                                                final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)pph_templates.UNPROVIDED));
                                                                if (pph_templates.NIL != mt_links2) {
                                                                    SubLObject iteration_state2;
                                                                    for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); pph_templates.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                        final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (pph_templates.NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                            final SubLObject _prev_bind_0_$51 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                SubLObject iteration_state_$54;
                                                                                for (iteration_state_$54 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); pph_templates.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$54); iteration_state_$54 = dictionary_contents.do_dictionary_contents_next(iteration_state_$54)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$54);
                                                                                    final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (pph_templates.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$52 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol3 = link_nodes4;
                                                                                            if (pph_templates.NIL != set.set_p(sol3)) {
                                                                                                final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                SubLObject basis_object3;
                                                                                                SubLObject state3;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)pph_templates.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); pph_templates.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                    if (pph_templates.NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node) && pph_templates.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)pph_templates.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)pph_templates.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol3.isList()) {
                                                                                                SubLObject csome_list_var4 = sol3;
                                                                                                SubLObject node_vars_link_node2 = (SubLObject)pph_templates.NIL;
                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                                while (pph_templates.NIL != csome_list_var4) {
                                                                                                    if (pph_templates.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)pph_templates.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)pph_templates.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var4 = csome_list_var4.rest();
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)pph_templates.$str21$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$52, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$54);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$51, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)pph_templates.FIVE_INTEGER, (SubLObject)pph_templates.$str22$attempting_to_bind_direction_link, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (pph_templates.NIL != obsolete.cnat_p(node2, (SubLObject)pph_templates.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$59;
                                                            final SubLObject new_list2 = cdolist_list_var_$59 = ((pph_templates.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)pph_templates.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)pph_templates.UNPROVIDED)));
                                                            SubLObject generating_fn2 = (SubLObject)pph_templates.NIL;
                                                            generating_fn2 = cdolist_list_var_$59.first();
                                                            while (pph_templates.NIL != cdolist_list_var_$59) {
                                                                final SubLObject _prev_bind_0_$53 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                    final SubLObject sol4;
                                                                    final SubLObject link_nodes5 = sol4 = Functions.funcall(generating_fn2, node2);
                                                                    if (pph_templates.NIL != set.set_p(sol4)) {
                                                                        final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                        SubLObject basis_object4;
                                                                        SubLObject state4;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = (SubLObject)pph_templates.NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); pph_templates.NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                            if (pph_templates.NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3) && pph_templates.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)pph_templates.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)pph_templates.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol4.isList()) {
                                                                        SubLObject csome_list_var5 = sol4;
                                                                        SubLObject node_vars_link_node4 = (SubLObject)pph_templates.NIL;
                                                                        node_vars_link_node4 = csome_list_var5.first();
                                                                        while (pph_templates.NIL != csome_list_var5) {
                                                                            if (pph_templates.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)pph_templates.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)pph_templates.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                            }
                                                                            csome_list_var5 = csome_list_var5.rest();
                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)pph_templates.$str21$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$53, thread);
                                                                }
                                                                cdolist_list_var_$59 = cdolist_list_var_$59.rest();
                                                                generating_fn2 = cdolist_list_var_$59.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$45, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$50, thread);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    module_var2 = cdolist_list_var2.first();
                                                }
                                                node_var_$41 = deck.deck_pop(recur_deck);
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$49, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$43, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$43, thread);
                                        }
                                    }
                                    else {
                                        sbhl_paranoia.sbhl_warn((SubLObject)pph_templates.TWO_INTEGER, (SubLObject)pph_templates.$str24$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)pph_templates.UNPROVIDED)), (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
                                    }
                                }
                                finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$42, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$42, thread);
                                }
                            }
                            finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$41, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$41, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$54 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_templates.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$54, thread);
                            }
                        }
                    }
                    finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$40, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$55 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_templates.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$55, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$40, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$39, thread);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        pph_data_structures.optimize_pph_phrase_id_index((SubLObject)pph_templates.UNPROVIDED);
        return (SubLObject)pph_templates.$kw29$DONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 2975L)
    public static SubLObject initialize_gen_templates_for_pred(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject progress_note = PrintLow.format((SubLObject)pph_templates.NIL, (SubLObject)pph_templates.$str30$Initializing__S___, pred);
        final SubLObject total = kb_indexing.num_predicate_extent_index(pred, (SubLObject)pph_templates.UNPROVIDED);
        SubLObject sofar = (SubLObject)pph_templates.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)pph_templates.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)pph_templates.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)pph_templates.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(progress_note);
                if (pph_templates.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred)) {
                    final SubLObject str = (SubLObject)pph_templates.NIL;
                    final SubLObject _prev_bind_0_$69 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$70 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$71 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_3_$72 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind((SubLObject)pph_templates.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)pph_templates.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)pph_templates.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)pph_templates.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((pph_templates.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : pph_templates.T), thread);
                        utilities_macros.noting_progress_preamble(str);
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred);
                        SubLObject done_var = (SubLObject)pph_templates.NIL;
                        final SubLObject token_var = (SubLObject)pph_templates.NIL;
                        while (pph_templates.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (pph_templates.NIL != valid) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator = (SubLObject)pph_templates.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)pph_templates.$kw31$GAF, (SubLObject)pph_templates.NIL, (SubLObject)pph_templates.NIL);
                                    SubLObject done_var_$73 = (SubLObject)pph_templates.NIL;
                                    final SubLObject token_var_$74 = (SubLObject)pph_templates.NIL;
                                    while (pph_templates.NIL == done_var_$73) {
                                        final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$74);
                                        final SubLObject valid_$75 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$74.eql(as));
                                        if (pph_templates.NIL != valid_$75) {
                                            final SubLObject wff_checking_mode = (SubLObject)pph_templates.$kw32$OFF;
                                            add_gen_template_int(as, wff_checking_mode);
                                            sofar = Numbers.add(sofar, (SubLObject)pph_templates.ONE_INTEGER);
                                            utilities_macros.note_percent_progress(sofar, total);
                                        }
                                        done_var_$73 = (SubLObject)SubLObjectFactory.makeBoolean(pph_templates.NIL == valid_$75);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$70 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_templates.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (pph_templates.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$70, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(pph_templates.NIL == valid);
                        }
                        utilities_macros.noting_progress_postamble();
                    }
                    finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_3_$72, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$71, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$70, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$69, thread);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$71 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_templates.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$71, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)pph_templates.$kw4$INITIALIZED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 3398L)
    public static SubLObject add_gen_template(final SubLObject argument, final SubLObject assertion, SubLObject reinit_phrase_fnsP, SubLObject wff_checking_mode, SubLObject clear_paraphrase_cachesP) {
        if (reinit_phrase_fnsP == pph_templates.UNPROVIDED) {
            reinit_phrase_fnsP = (SubLObject)pph_templates.T;
        }
        if (wff_checking_mode == pph_templates.UNPROVIDED) {
            wff_checking_mode = (SubLObject)pph_templates.$kw33$FAST;
        }
        if (clear_paraphrase_cachesP == pph_templates.UNPROVIDED) {
            clear_paraphrase_cachesP = (SubLObject)pph_templates.T;
        }
        if (pph_templates.NIL != list_utilities.singletonP(assertions_high.assertion_arguments(assertion))) {
            if (pph_templates.NIL != wff_utilities.non_wff_cached_p(assertion)) {
                wff_utilities.wff_check_assertion(assertion);
            }
            if (pph_templates.NIL == wff_utilities.non_wff_cached_p(assertion)) {
                final SubLObject reln = assertions_high.gaf_arg1(assertion);
                lexicon_utilities.remove_cached_lexifications_for_term(reln, (SubLObject)pph_templates.T, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
                lexicon_utilities.remove_cached_lexifications_for_term(reln, (SubLObject)pph_templates.NIL, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
                if (pph_templates.NIL != reinit_phrase_fnsP) {
                    pph_functions.initialize_pph_phrase_fns();
                }
                if (pph_templates.NIL != clear_paraphrase_cachesP) {
                    pph_main.clear_paraphrase_caches((SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
                }
                add_gen_template_int(assertion, wff_checking_mode);
            }
        }
        return (SubLObject)pph_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 4424L)
    public static SubLObject add_gen_template_int(final SubLObject assertion, final SubLObject wff_checking_mode) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (assertions_high.assertion_truth(assertion) != pph_templates.$kw35$TRUE) {
            return (SubLObject)pph_templates.NIL;
        }
        final SubLObject _prev_bind_0 = pph_macros.$new_pph_phrases$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_macros.$creating_permanent_pph_phraseP$.currentBinding(thread);
        try {
            pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
            pph_macros.$new_pph_phrase_count$.bind((SubLObject)pph_templates.ZERO_INTEGER, thread);
            pph_macros.$creating_permanent_pph_phraseP$.bind((SubLObject)pph_templates.T, thread);
            SubLObject error_message = (SubLObject)pph_templates.NIL;
            final SubLObject _prev_bind_0_$78 = Errors.$continue_cerrorP$.currentBinding(thread);
            final SubLObject _prev_bind_1_$79 = pph_error.$pph_error_handling_onP$.currentBinding(thread);
            try {
                Errors.$continue_cerrorP$.bind((SubLObject)pph_templates.NIL, thread);
                pph_error.$pph_error_handling_onP$.bind((SubLObject)pph_templates.T, thread);
                if (pph_templates.NIL != pph_error.pph_break_on_errorP()) {
                    final SubLObject new_gen_template = new_gen_template_from_assertion(assertion, wff_checking_mode);
                    if (pph_templates.NIL != new_gen_template) {
                        final SubLObject reln = assertions_high.gaf_arg1(assertion);
                        final SubLObject existing_sets = gen_template_sets_for_reln(reln, (SubLObject)pph_templates.NIL);
                        final SubLObject new_sets = add_gen_template_to_sets(new_gen_template, existing_sets);
                        if (pph_templates.NIL != new_sets) {
                            pph_data_structures.set_gen_template_store_value(reln, new_sets);
                        }
                    }
                    else {
                        final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_templates.$str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_templates.TWO_INTEGER), pph_templates.$str1$__, format_nil.format_nil_a_no_copy((SubLObject)pph_templates.$str36$Unable_to_add_assertion_to_gen_te) });
                        pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(assertion));
                    }
                }
                else {
                    try {
                        thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0_$79 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind((SubLObject)pph_templates.$sym37$CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                final SubLObject new_gen_template2 = new_gen_template_from_assertion(assertion, wff_checking_mode);
                                if (pph_templates.NIL != new_gen_template2) {
                                    final SubLObject reln2 = assertions_high.gaf_arg1(assertion);
                                    final SubLObject existing_sets2 = gen_template_sets_for_reln(reln2, (SubLObject)pph_templates.NIL);
                                    final SubLObject new_sets2 = add_gen_template_to_sets(new_gen_template2, existing_sets2);
                                    if (pph_templates.NIL != new_sets2) {
                                        pph_data_structures.set_gen_template_store_value(reln2, new_sets2);
                                    }
                                }
                                else {
                                    final SubLObject new_format_string2 = Sequences.cconcatenate((SubLObject)pph_templates.$str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_templates.TWO_INTEGER), pph_templates.$str1$__, format_nil.format_nil_a_no_copy((SubLObject)pph_templates.$str36$Unable_to_add_assertion_to_gen_te) });
                                    pph_error.pph_handle_error(new_format_string2, (SubLObject)ConsesLow.list(assertion));
                                }
                            }
                            catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, (SubLObject)pph_templates.NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$79, thread);
                        }
                    }
                    catch (Throwable ccatch_env_var) {
                        error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                    if (error_message.isString() && pph_templates.NIL == pph_error.suppress_pph_warningsP()) {
                        Errors.warn(Sequences.cconcatenate(pph_error_message_truncator.truncate_pph_error_message(error_message), (SubLObject)pph_templates.$str38$___Top_level_CycL___S), pph_vars.pph_top_level_cycl());
                    }
                }
            }
            finally {
                pph_error.$pph_error_handling_onP$.rebind(_prev_bind_1_$79, thread);
                Errors.$continue_cerrorP$.rebind(_prev_bind_0_$78, thread);
            }
        }
        finally {
            pph_macros.$creating_permanent_pph_phraseP$.rebind(_prev_bind_3, thread);
            pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_2, thread);
            pph_macros.$new_pph_phrases$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)pph_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 5134L)
    public static SubLObject gen_template_sets_for_reln(final SubLObject reln, SubLObject check_initializedP) {
        if (check_initializedP == pph_templates.UNPROVIDED) {
            check_initializedP = (SubLObject)pph_templates.T;
        }
        SubLObject ans = pph_data_structures.gen_template_sets_for_reln_from_store(reln, check_initializedP);
        if (pph_templates.NIL != formula_pattern_match.formula_matches_pattern(reln, (SubLObject)pph_templates.$list39)) {
            ans = add_gen_template_to_sets(rephrase_gen_template_for_kappa_pred(reln), ans);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 5611L)
    public static SubLObject clear_pph_kappa_justification_template() {
        final SubLObject cs = pph_templates.$pph_kappa_justification_template_caching_state$.getGlobalValue();
        if (pph_templates.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)pph_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 5611L)
    public static SubLObject remove_pph_kappa_justification_template() {
        return memoization_state.caching_state_remove_function_results_with_args(pph_templates.$pph_kappa_justification_template_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(pph_templates.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 5611L)
    public static SubLObject pph_kappa_justification_template_internal() {
        final SubLObject template = pph_phrase.pph_code_justification((SubLObject)pph_templates.$sym41$REPHRASE_GEN_TEMPLATE_FOR_KAPPA_PRED, (SubLObject)pph_templates.UNPROVIDED);
        ConsesLow.rplacd(conses_high.nthcdr((SubLObject)pph_templates.ONE_INTEGER, template), (SubLObject)pph_templates.$kw42$ANYTHING);
        return template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 5611L)
    public static SubLObject pph_kappa_justification_template() {
        SubLObject caching_state = pph_templates.$pph_kappa_justification_template_caching_state$.getGlobalValue();
        if (pph_templates.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)pph_templates.$sym40$PPH_KAPPA_JUSTIFICATION_TEMPLATE, (SubLObject)pph_templates.$sym43$_PPH_KAPPA_JUSTIFICATION_TEMPLATE_CACHING_STATE_, (SubLObject)pph_templates.NIL, (SubLObject)pph_templates.EQL, (SubLObject)pph_templates.ZERO_INTEGER, (SubLObject)pph_templates.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)pph_templates.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_kappa_justification_template_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)pph_templates.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 5836L)
    public static SubLObject rephrase_gen_template_for_kappa_predP(final SubLObject gen_template) {
        SubLObject cdolist_list_var = pph_phrase.pph_phrase_justification(pph_data_structures.get_gen_template_phrase(gen_template));
        SubLObject just = (SubLObject)pph_templates.NIL;
        just = cdolist_list_var.first();
        while (pph_templates.NIL != cdolist_list_var) {
            if (pph_templates.NIL != looks_like_kappa_rephrase_ruleP(just) || pph_templates.NIL != pattern_match.tree_matches_pattern(just, pph_kappa_justification_template())) {
                return (SubLObject)pph_templates.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            just = cdolist_list_var.first();
        }
        return (SubLObject)pph_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 6142L)
    public static SubLObject looks_like_kappa_rephrase_ruleP(final SubLObject just) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_templates.NIL != assertion_handles.assertion_p(just) && pph_templates.NIL != assertions_high.rule_assertionP(just) && pph_templates.NIL != cycl_utilities.expression_find(pph_templates.$const44$Kappa, just, (SubLObject)pph_templates.T, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 6301L)
    public static SubLObject clear_rephrase_gen_template_for_kappa_pred() {
        final SubLObject cs = pph_templates.$rephrase_gen_template_for_kappa_pred_caching_state$.getGlobalValue();
        if (pph_templates.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)pph_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 6301L)
    public static SubLObject remove_rephrase_gen_template_for_kappa_pred(final SubLObject reln) {
        return memoization_state.caching_state_remove_function_results_with_args(pph_templates.$rephrase_gen_template_for_kappa_pred_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(reln), (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 6301L)
    public static SubLObject rephrase_gen_template_for_kappa_pred_internal(final SubLObject reln) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject gen_template = (SubLObject)pph_templates.NIL;
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(reln, (SubLObject)pph_templates.$list45);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (pph_templates.NIL != success) {
            final SubLObject template = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)pph_templates.$sym46$TEMPLATE, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
            final SubLObject vars = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)pph_templates.$sym47$VARS, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
            SubLObject pph_template = el_utilities.copy_expression(template);
            SubLObject list_var = (SubLObject)pph_templates.NIL;
            SubLObject var = (SubLObject)pph_templates.NIL;
            SubLObject i = (SubLObject)pph_templates.NIL;
            list_var = vars;
            var = list_var.first();
            for (i = (SubLObject)pph_templates.ZERO_INTEGER; pph_templates.NIL != list_var; list_var = list_var.rest(), var = list_var.first(), i = Numbers.add((SubLObject)pph_templates.ONE_INTEGER, i)) {
                final SubLObject generic_arg = at_utilities.get_generic_arg(number_utilities.f_1X(i));
                pph_template = cycl_utilities.formula_nsubst(generic_arg, var, pph_template, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
            }
            final SubLObject phrase_naut = (SubLObject)ConsesLow.list(pph_functions.termparaphrasefn(), pph_template);
            final SubLObject _prev_bind_0 = pph_vars.$pph_current_arg0$.currentBinding(thread);
            try {
                pph_vars.$pph_current_arg0$.bind(reln, thread);
                final SubLObject justification_as = kappa_gen_template_rule_for_arity(Sequences.length(vars));
                SubLObject v_pph_phrase = (SubLObject)pph_templates.NIL;
                final SubLObject _prev_bind_0_$81 = pph_macros.$new_pph_phrases$.currentBinding(thread);
                final SubLObject _prev_bind_2 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
                final SubLObject _prev_bind_3 = pph_macros.$creating_permanent_pph_phraseP$.currentBinding(thread);
                try {
                    pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
                    pph_macros.$new_pph_phrase_count$.bind((SubLObject)pph_templates.ZERO_INTEGER, thread);
                    pph_macros.$creating_permanent_pph_phraseP$.bind((SubLObject)pph_templates.T, thread);
                    v_pph_phrase = pph_phrasify_phrase_naut(phrase_naut, pph_utilities.pph_new_empty_map());
                }
                finally {
                    pph_macros.$creating_permanent_pph_phraseP$.rebind(_prev_bind_3, thread);
                    pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_2, thread);
                    pph_macros.$new_pph_phrases$.rebind(_prev_bind_0_$81, thread);
                }
                if (pph_templates.NIL != justification_as) {
                    pph_phrase.pph_phrase_add_justification(v_pph_phrase, justification_as);
                }
                pph_phrase.pph_phrase_add_justification(v_pph_phrase, pph_phrase.pph_code_justification((SubLObject)pph_templates.$sym41$REPHRASE_GEN_TEMPLATE_FOR_KAPPA_PRED, (SubLObject)ConsesLow.list(reln)));
                gen_template = pph_data_structures.new_gen_template(v_pph_phrase, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
            }
            finally {
                pph_vars.$pph_current_arg0$.rebind(_prev_bind_0, thread);
            }
        }
        return gen_template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 6301L)
    public static SubLObject rephrase_gen_template_for_kappa_pred(final SubLObject reln) {
        SubLObject caching_state = pph_templates.$rephrase_gen_template_for_kappa_pred_caching_state$.getGlobalValue();
        if (pph_templates.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)pph_templates.$sym41$REPHRASE_GEN_TEMPLATE_FOR_KAPPA_PRED, (SubLObject)pph_templates.$sym48$_REPHRASE_GEN_TEMPLATE_FOR_KAPPA_PRED_CACHING_STATE_, (SubLObject)pph_templates.$int49$1024, (SubLObject)pph_templates.EQUAL, (SubLObject)pph_templates.ONE_INTEGER, (SubLObject)pph_templates.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, reln, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rephrase_gen_template_for_kappa_pred_internal(reln)));
            memoization_state.caching_state_put(caching_state, reln, results, (SubLObject)pph_templates.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 7482L)
    public static SubLObject kappa_gen_template_rule_for_arity(final SubLObject v_arity) {
        final SubLObject pred = constants_high.find_constant((SubLObject)pph_templates.$str50$kappaGenTemplateRuleForArity);
        SubLObject as = (SubLObject)pph_templates.NIL;
        if (pph_templates.NIL != constant_handles.valid_constantP(pred, (SubLObject)pph_templates.UNPROVIDED)) {
            as = pph_utilities.pph_removal_ask_variable((SubLObject)pph_templates.$sym51$_RULE, (SubLObject)ConsesLow.listS(pred, v_arity, (SubLObject)pph_templates.$list52), pph_templates.$const53$InferencePSC, (SubLObject)pph_templates.UNPROVIDED).first();
        }
        return as;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 7768L)
    public static SubLObject new_gen_template_from_assertion(final SubLObject assertion, SubLObject wff_checking_mode) {
        if (wff_checking_mode == pph_templates.UNPROVIDED) {
            wff_checking_mode = (SubLObject)pph_templates.$kw33$FAST;
        }
        assert pph_templates.NIL != assertion_handles.assertion_p(assertion) : assertion;
        final SubLObject phrase = pph_phrase_from_assertion(assertion, wff_checking_mode);
        if (pph_templates.NIL != phrase) {
            final SubLObject constraint = pph_template_constraint_from_assertion(assertion);
            final SubLObject new_gen_template = pph_data_structures.new_gen_template(phrase, constraint, assertion);
            return new_gen_template;
        }
        return (SubLObject)pph_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 8188L)
    public static SubLObject reinitialize_gen_templates_for_reln(final SubLObject reln, SubLObject assertions_to_omit) {
        if (assertions_to_omit == pph_templates.UNPROVIDED) {
            assertions_to_omit = (SubLObject)pph_templates.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = (SubLObject)pph_templates.NIL;
        try {
            release = Locks.seize_lock(pph_vars.$gen_template_store_lock$.getGlobalValue());
            pph_data_structures.clear_gen_template_store_value(reln);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)pph_templates.$sym6$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(pph_templates.$const7$EverythingPSC, thread);
                final SubLObject node_var = pph_templates.$const8$NLTemplateGenerationPredicate;
                final SubLObject _prev_bind_0_$82 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                final SubLObject _prev_bind_1_$83 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(pph_templates.$const9$isa), thread);
                    sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        SubLObject node_var_$84 = node_var;
                        final SubLObject deck_type = (SubLObject)pph_templates.$kw12$STACK;
                        final SubLObject recur_deck = deck.create_deck(deck_type);
                        final SubLObject _prev_bind_0_$83 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                final SubLObject tv_var = (SubLObject)pph_templates.NIL;
                                final SubLObject _prev_bind_0_$84 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$84 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind((pph_templates.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((pph_templates.NIL != tv_var) ? pph_templates.$sym13$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                    if (pph_templates.NIL != tv_var && pph_templates.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && pph_templates.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var.eql((SubLObject)pph_templates.$kw14$ERROR)) {
                                            sbhl_paranoia.sbhl_error((SubLObject)pph_templates.ONE_INTEGER, (SubLObject)pph_templates.$str15$_A_is_not_a__A, tv_var, (SubLObject)pph_templates.$sym16$SBHL_TRUE_TV_P, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
                                        }
                                        else if (pcase_var.eql((SubLObject)pph_templates.$kw17$CERROR)) {
                                            sbhl_paranoia.sbhl_cerror((SubLObject)pph_templates.ONE_INTEGER, (SubLObject)pph_templates.$str18$continue_anyway, (SubLObject)pph_templates.$str15$_A_is_not_a__A, tv_var, (SubLObject)pph_templates.$sym16$SBHL_TRUE_TV_P, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
                                        }
                                        else if (pcase_var.eql((SubLObject)pph_templates.$kw19$WARN)) {
                                            Errors.warn((SubLObject)pph_templates.$str15$_A_is_not_a__A, tv_var, (SubLObject)pph_templates.$sym16$SBHL_TRUE_TV_P);
                                        }
                                        else {
                                            Errors.warn((SubLObject)pph_templates.$str20$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror((SubLObject)pph_templates.$str18$continue_anyway, (SubLObject)pph_templates.$str15$_A_is_not_a__A, tv_var, (SubLObject)pph_templates.$sym16$SBHL_TRUE_TV_P);
                                        }
                                    }
                                    final SubLObject _prev_bind_0_$85 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$85 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(pph_templates.$const9$isa)), thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(pph_templates.$const9$isa))), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(pph_templates.$const9$isa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)pph_templates.NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(pph_templates.$const9$isa)), thread);
                                        if (pph_templates.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || pph_templates.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module((SubLObject)pph_templates.UNPROVIDED))) {
                                            final SubLObject _prev_bind_0_$86 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$86 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$92 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(pph_templates.$const9$isa))), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)pph_templates.NIL, thread);
                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$84, (SubLObject)pph_templates.UNPROVIDED);
                                                while (pph_templates.NIL != node_var_$84) {
                                                    final SubLObject tt_node_var = node_var_$84;
                                                    SubLObject cdolist_list_var;
                                                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(pph_templates.$const9$isa));
                                                    SubLObject module_var = (SubLObject)pph_templates.NIL;
                                                    module_var = cdolist_list_var.first();
                                                    while (pph_templates.NIL != cdolist_list_var) {
                                                        final SubLObject _prev_bind_0_$87 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$87 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((pph_templates.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(pph_templates.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                            final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                            if (pph_templates.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)pph_templates.UNPROVIDED));
                                                                if (pph_templates.NIL != d_link) {
                                                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(pph_templates.$const9$isa)), sbhl_module_vars.get_sbhl_module((SubLObject)pph_templates.UNPROVIDED));
                                                                    if (pph_templates.NIL != mt_links) {
                                                                        SubLObject iteration_state;
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); pph_templates.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            final SubLObject tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (pph_templates.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                final SubLObject _prev_bind_0_$88 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                    SubLObject iteration_state_$96;
                                                                                    for (iteration_state_$96 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); pph_templates.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$96); iteration_state_$96 = dictionary_contents.do_dictionary_contents_next(iteration_state_$96)) {
                                                                                        thread.resetMultipleValues();
                                                                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$96);
                                                                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (pph_templates.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                            final SubLObject _prev_bind_0_$89 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                final SubLObject sol = link_nodes;
                                                                                                if (pph_templates.NIL != set.set_p(sol)) {
                                                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                    SubLObject basis_object;
                                                                                                    SubLObject state;
                                                                                                    SubLObject pred;
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)pph_templates.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); pph_templates.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        pred = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if (pph_templates.NIL != set_contents.do_set_contents_element_validP(state, pred) && pph_templates.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (pph_templates.NIL != forts.fort_p(pred)) {
                                                                                                                initialize_gen_templates_for_relnXpred(reln, pred, assertions_to_omit);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else if (sol.isList()) {
                                                                                                    SubLObject csome_list_var = sol;
                                                                                                    SubLObject pred2 = (SubLObject)pph_templates.NIL;
                                                                                                    pred2 = csome_list_var.first();
                                                                                                    while (pph_templates.NIL != csome_list_var) {
                                                                                                        if (pph_templates.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (pph_templates.NIL != forts.fort_p(pred2)) {
                                                                                                                initialize_gen_templates_for_relnXpred(reln, pred2, assertions_to_omit);
                                                                                                            }
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        pred2 = csome_list_var.first();
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    Errors.error((SubLObject)pph_templates.$str21$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$89, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$96);
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$88, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                }
                                                                else {
                                                                    sbhl_paranoia.sbhl_error((SubLObject)pph_templates.FIVE_INTEGER, (SubLObject)pph_templates.$str22$attempting_to_bind_direction_link, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
                                                                }
                                                                if (pph_templates.NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module((SubLObject)pph_templates.UNPROVIDED))) {
                                                                    SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                    SubLObject instance_tuple = (SubLObject)pph_templates.NIL;
                                                                    instance_tuple = csome_list_var2.first();
                                                                    while (pph_templates.NIL != csome_list_var2) {
                                                                        SubLObject current;
                                                                        final SubLObject datum = current = instance_tuple;
                                                                        SubLObject link_node = (SubLObject)pph_templates.NIL;
                                                                        SubLObject mt2 = (SubLObject)pph_templates.NIL;
                                                                        SubLObject tv2 = (SubLObject)pph_templates.NIL;
                                                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_templates.$list23);
                                                                        link_node = current.first();
                                                                        current = current.rest();
                                                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_templates.$list23);
                                                                        mt2 = current.first();
                                                                        current = current.rest();
                                                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_templates.$list23);
                                                                        tv2 = current.first();
                                                                        current = current.rest();
                                                                        if (pph_templates.NIL == current) {
                                                                            if (pph_templates.NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                                final SubLObject _prev_bind_0_$90 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                    if (pph_templates.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$91 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol;
                                                                                            final SubLObject link_nodes2 = sol = (SubLObject)ConsesLow.list(link_node);
                                                                                            if (pph_templates.NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject pred;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)pph_templates.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); pph_templates.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    pred = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (pph_templates.NIL != set_contents.do_set_contents_element_validP(state, pred) && pph_templates.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (pph_templates.NIL != forts.fort_p(pred)) {
                                                                                                            initialize_gen_templates_for_relnXpred(reln, pred, assertions_to_omit);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                SubLObject csome_list_var_$100 = sol;
                                                                                                SubLObject pred2 = (SubLObject)pph_templates.NIL;
                                                                                                pred2 = csome_list_var_$100.first();
                                                                                                while (pph_templates.NIL != csome_list_var_$100) {
                                                                                                    if (pph_templates.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (pph_templates.NIL != forts.fort_p(pred2)) {
                                                                                                            initialize_gen_templates_for_relnXpred(reln, pred2, assertions_to_omit);
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var_$100 = csome_list_var_$100.rest();
                                                                                                    pred2 = csome_list_var_$100.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)pph_templates.$str21$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$91, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$90, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        else {
                                                                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_templates.$list23);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        instance_tuple = csome_list_var2.first();
                                                                    }
                                                                }
                                                            }
                                                            else if (pph_templates.NIL != obsolete.cnat_p(node, (SubLObject)pph_templates.UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$101;
                                                                final SubLObject new_list = cdolist_list_var_$101 = ((pph_templates.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(pph_templates.$const9$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)pph_templates.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(pph_templates.$const9$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)pph_templates.UNPROVIDED)));
                                                                SubLObject generating_fn = (SubLObject)pph_templates.NIL;
                                                                generating_fn = cdolist_list_var_$101.first();
                                                                while (pph_templates.NIL != cdolist_list_var_$101) {
                                                                    final SubLObject _prev_bind_0_$92 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        final SubLObject sol2;
                                                                        final SubLObject link_nodes3 = sol2 = Functions.funcall(generating_fn, node);
                                                                        if (pph_templates.NIL != set.set_p(sol2)) {
                                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                            SubLObject basis_object2;
                                                                            SubLObject state2;
                                                                            SubLObject pred3;
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)pph_templates.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); pph_templates.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                pred3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if (pph_templates.NIL != set_contents.do_set_contents_element_validP(state2, pred3) && pph_templates.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(pred3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    if (pph_templates.NIL != forts.fort_p(pred3)) {
                                                                                        initialize_gen_templates_for_relnXpred(reln, pred3, assertions_to_omit);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        else if (sol2.isList()) {
                                                                            SubLObject csome_list_var3 = sol2;
                                                                            SubLObject pred4 = (SubLObject)pph_templates.NIL;
                                                                            pred4 = csome_list_var3.first();
                                                                            while (pph_templates.NIL != csome_list_var3) {
                                                                                if (pph_templates.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(pred4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    if (pph_templates.NIL != forts.fort_p(pred4)) {
                                                                                        initialize_gen_templates_for_relnXpred(reln, pred4, assertions_to_omit);
                                                                                    }
                                                                                }
                                                                                csome_list_var3 = csome_list_var3.rest();
                                                                                pred4 = csome_list_var3.first();
                                                                            }
                                                                        }
                                                                        else {
                                                                            Errors.error((SubLObject)pph_templates.$str21$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$92, thread);
                                                                    }
                                                                    cdolist_list_var_$101 = cdolist_list_var_$101.rest();
                                                                    generating_fn = cdolist_list_var_$101.first();
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$87, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$87, thread);
                                                        }
                                                        cdolist_list_var = cdolist_list_var.rest();
                                                        module_var = cdolist_list_var.first();
                                                    }
                                                    SubLObject cdolist_list_var2;
                                                    final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(pph_templates.$const9$isa)));
                                                    SubLObject module_var2 = (SubLObject)pph_templates.NIL;
                                                    module_var2 = cdolist_list_var2.first();
                                                    while (pph_templates.NIL != cdolist_list_var2) {
                                                        final SubLObject _prev_bind_0_$93 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$88 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((pph_templates.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(pph_templates.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                            final SubLObject node2 = function_terms.naut_to_nart(node_var_$84);
                                                            if (pph_templates.NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                                final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module((SubLObject)pph_templates.UNPROVIDED));
                                                                if (pph_templates.NIL != d_link2) {
                                                                    final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)pph_templates.UNPROVIDED));
                                                                    if (pph_templates.NIL != mt_links2) {
                                                                        SubLObject iteration_state2;
                                                                        for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); pph_templates.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                            final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (pph_templates.NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                                final SubLObject _prev_bind_0_$94 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                    SubLObject iteration_state_$97;
                                                                                    for (iteration_state_$97 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); pph_templates.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$97); iteration_state_$97 = dictionary_contents.do_dictionary_contents_next(iteration_state_$97)) {
                                                                                        thread.resetMultipleValues();
                                                                                        final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$97);
                                                                                        final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (pph_templates.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                            final SubLObject _prev_bind_0_$95 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                                final SubLObject sol3 = link_nodes4;
                                                                                                if (pph_templates.NIL != set.set_p(sol3)) {
                                                                                                    final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                    SubLObject basis_object3;
                                                                                                    SubLObject state3;
                                                                                                    SubLObject node_vars_link_node;
                                                                                                    for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)pph_templates.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); pph_templates.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                        if (pph_templates.NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node) && pph_templates.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)pph_templates.UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)pph_templates.UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else if (sol3.isList()) {
                                                                                                    SubLObject csome_list_var4 = sol3;
                                                                                                    SubLObject node_vars_link_node2 = (SubLObject)pph_templates.NIL;
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                    while (pph_templates.NIL != csome_list_var4) {
                                                                                                        if (pph_templates.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)pph_templates.UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)pph_templates.UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                        }
                                                                                                        csome_list_var4 = csome_list_var4.rest();
                                                                                                        node_vars_link_node2 = csome_list_var4.first();
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    Errors.error((SubLObject)pph_templates.$str21$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$95, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$97);
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$94, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                    }
                                                                }
                                                                else {
                                                                    sbhl_paranoia.sbhl_error((SubLObject)pph_templates.FIVE_INTEGER, (SubLObject)pph_templates.$str22$attempting_to_bind_direction_link, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
                                                                }
                                                            }
                                                            else if (pph_templates.NIL != obsolete.cnat_p(node2, (SubLObject)pph_templates.UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$102;
                                                                final SubLObject new_list2 = cdolist_list_var_$102 = ((pph_templates.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)pph_templates.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)pph_templates.UNPROVIDED)));
                                                                SubLObject generating_fn2 = (SubLObject)pph_templates.NIL;
                                                                generating_fn2 = cdolist_list_var_$102.first();
                                                                while (pph_templates.NIL != cdolist_list_var_$102) {
                                                                    final SubLObject _prev_bind_0_$96 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                        final SubLObject sol4;
                                                                        final SubLObject link_nodes5 = sol4 = Functions.funcall(generating_fn2, node2);
                                                                        if (pph_templates.NIL != set.set_p(sol4)) {
                                                                            final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                            SubLObject basis_object4;
                                                                            SubLObject state4;
                                                                            SubLObject node_vars_link_node3;
                                                                            for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = (SubLObject)pph_templates.NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); pph_templates.NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                                if (pph_templates.NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3) && pph_templates.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)pph_templates.UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)pph_templates.UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                }
                                                                            }
                                                                        }
                                                                        else if (sol4.isList()) {
                                                                            SubLObject csome_list_var5 = sol4;
                                                                            SubLObject node_vars_link_node4 = (SubLObject)pph_templates.NIL;
                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                            while (pph_templates.NIL != csome_list_var5) {
                                                                                if (pph_templates.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)pph_templates.UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)pph_templates.UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                }
                                                                                csome_list_var5 = csome_list_var5.rest();
                                                                                node_vars_link_node4 = csome_list_var5.first();
                                                                            }
                                                                        }
                                                                        else {
                                                                            Errors.error((SubLObject)pph_templates.$str21$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$96, thread);
                                                                    }
                                                                    cdolist_list_var_$102 = cdolist_list_var_$102.rest();
                                                                    generating_fn2 = cdolist_list_var_$102.first();
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$88, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$93, thread);
                                                        }
                                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                                        module_var2 = cdolist_list_var2.first();
                                                    }
                                                    node_var_$84 = deck.deck_pop(recur_deck);
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$92, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$86, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$86, thread);
                                            }
                                        }
                                        else {
                                            sbhl_paranoia.sbhl_warn((SubLObject)pph_templates.TWO_INTEGER, (SubLObject)pph_templates.$str24$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)pph_templates.UNPROVIDED)), (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
                                        }
                                    }
                                    finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$85, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$85, thread);
                                    }
                                }
                                finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$84, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$84, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$97 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_templates.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$97, thread);
                                }
                            }
                        }
                        finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$83, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$98 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_templates.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$98, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$83, thread);
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$82, thread);
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            if (pph_templates.NIL != release) {
                Locks.release_lock(pph_vars.$gen_template_store_lock$.getGlobalValue());
            }
        }
        remove_rephrase_gen_template_for_kappa_pred(reln);
        return (SubLObject)pph_templates.$kw55$REINITIALIZED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 8690L)
    public static SubLObject reinitialize_gen_templates_referencing_phrase_fn(final SubLObject phrase_fn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject relns = (SubLObject)pph_templates.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)pph_templates.$sym6$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(pph_templates.$const7$EverythingPSC, thread);
            if (pph_templates.NIL != kb_mapping_macros.do_other_index_key_validator(phrase_fn, (SubLObject)pph_templates.$kw31$GAF)) {
                final SubLObject final_index_spec = kb_mapping_macros.other_final_index_spec(phrase_fn);
                SubLObject final_index_iterator = (SubLObject)pph_templates.NIL;
                try {
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)pph_templates.$kw31$GAF, (SubLObject)pph_templates.NIL, (SubLObject)pph_templates.NIL);
                    SubLObject done_var = (SubLObject)pph_templates.NIL;
                    final SubLObject token_var = (SubLObject)pph_templates.NIL;
                    while (pph_templates.NIL == done_var) {
                        final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(as));
                        if (pph_templates.NIL != valid && pph_templates.NIL != kb_mapping_macros.do_other_index_assertion_match_p(as)) {
                            final SubLObject reln = assertions_high.gaf_arg1(as);
                            if (pph_templates.NIL != kb_accessors.relationP(reln)) {
                                reinitialize_gen_templates_for_reln(reln, (SubLObject)pph_templates.UNPROVIDED);
                                relns = (SubLObject)ConsesLow.cons(reln, relns);
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(pph_templates.NIL == valid);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$112 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_templates.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        if (pph_templates.NIL != final_index_iterator) {
                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                        }
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$112, thread);
                    }
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return relns;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 9068L)
    public static SubLObject initialize_gen_templates_for_relnXpred(final SubLObject reln, final SubLObject pred, final SubLObject assertions_to_omit) {
        if (pph_templates.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(reln, (SubLObject)pph_templates.ONE_INTEGER, pred)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(reln, (SubLObject)pph_templates.ONE_INTEGER, pred);
            SubLObject done_var = (SubLObject)pph_templates.NIL;
            final SubLObject token_var = (SubLObject)pph_templates.NIL;
            while (pph_templates.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (pph_templates.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)pph_templates.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)pph_templates.$kw31$GAF, (SubLObject)pph_templates.NIL, (SubLObject)pph_templates.NIL);
                        SubLObject done_var_$113 = (SubLObject)pph_templates.NIL;
                        final SubLObject token_var_$114 = (SubLObject)pph_templates.NIL;
                        while (pph_templates.NIL == done_var_$113) {
                            final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$114);
                            final SubLObject valid_$115 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$114.eql(as));
                            if (pph_templates.NIL != valid_$115 && pph_templates.NIL == subl_promotions.memberP(as, assertions_to_omit, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED)) {
                                add_gen_template_int(as, (SubLObject)pph_templates.$kw32$OFF);
                            }
                            done_var_$113 = (SubLObject)SubLObjectFactory.makeBoolean(pph_templates.NIL == valid_$115);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)pph_templates.T);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (pph_templates.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(pph_templates.NIL == valid);
            }
        }
        return reln;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 9308L)
    public static SubLObject remove_gen_template(final SubLObject argument, final SubLObject assertion, SubLObject reinit_phrase_fnsP) {
        if (reinit_phrase_fnsP == pph_templates.UNPROVIDED) {
            reinit_phrase_fnsP = (SubLObject)pph_templates.T;
        }
        if (pph_templates.NIL == kb_accessors.assertion_still_thereP(assertion, (SubLObject)pph_templates.$kw35$TRUE) && pph_templates.NIL != pph_data_structures.gen_template_store_initializedP()) {
            if (pph_templates.NIL != reinit_phrase_fnsP) {
                pph_functions.initialize_pph_phrase_fns();
            }
            pph_main.clear_paraphrase_caches((SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
            final SubLObject reln = assertions_high.gaf_arg1(assertion);
            lexicon_utilities.remove_cached_lexifications_for_term(reln, (SubLObject)pph_templates.T, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
            lexicon_utilities.remove_cached_lexifications_for_term(reln, (SubLObject)pph_templates.NIL, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
            reinitialize_gen_templates_for_reln(reln, (SubLObject)ConsesLow.list(assertion));
        }
        return (SubLObject)pph_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 10035L)
    public static SubLObject pph_phrase_from_assertion(final SubLObject as, SubLObject wff_checking_mode) {
        if (wff_checking_mode == pph_templates.UNPROVIDED) {
            wff_checking_mode = (SubLObject)pph_templates.$kw33$FAST;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)pph_templates.NIL;
        SubLObject error_message = (SubLObject)pph_templates.NIL;
        final SubLObject _prev_bind_0 = Errors.$continue_cerrorP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_error.$pph_error_handling_onP$.currentBinding(thread);
        try {
            Errors.$continue_cerrorP$.bind((SubLObject)pph_templates.NIL, thread);
            pph_error.$pph_error_handling_onP$.bind((SubLObject)pph_templates.T, thread);
            if (pph_templates.NIL != pph_error.pph_break_on_errorP()) {
                if (pph_templates.NIL == assertions_high.gaf_assertionP(as)) {
                    final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_templates.$str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_templates.ONE_INTEGER), pph_templates.$str1$__, format_nil.format_nil_a_no_copy((SubLObject)pph_templates.$str57$PPH_PHRASE_FROM_ASSERTION_passed_) });
                    pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(as));
                }
                else if (pph_templates.NIL != pph_template_non_wfP(as, wff_checking_mode)) {
                    final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_templates.$str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_templates.ONE_INTEGER), pph_templates.$str1$__, format_nil.format_nil_a_no_copy((SubLObject)pph_templates.$str58$PPH_PHRASE_FROM_ASSERTION_passed_) });
                    pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(as));
                }
                else {
                    final SubLObject phrase_naut = phrase_naut_from_as(as);
                    final SubLObject arg_position_map = pph_utilities.pph_new_empty_map();
                    final SubLObject _prev_bind_0_$116 = pph_vars.$pph_current_arg0$.currentBinding(thread);
                    try {
                        pph_vars.$pph_current_arg0$.bind(assertions_high.gaf_arg1(as), thread);
                        if (pph_templates.NIL != phrase_naut) {
                            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
                            final SubLObject _prev_bind_0_$117 = mt_relevance_macros.$mt$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$118 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                ans = pph_phrasify_phrase_naut(phrase_naut, arg_position_map);
                                if (pph_templates.NIL != pph_phrase.pph_phrase_p(ans, (SubLObject)pph_templates.UNPROVIDED)) {
                                    pph_phrase.pph_phrase_add_justification(ans, as);
                                    if (pph_templates.NIL != pph_phrase.pph_unknown_cycl_p(pph_phrase.pph_phrase_cycl(ans, (SubLObject)pph_templates.UNPROVIDED))) {
                                        pph_phrase.pph_phrase_set_cycl(ans, pph_dummy_cycl_from_as(as));
                                    }
                                }
                            }
                            finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$118, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$117, thread);
                            }
                        }
                    }
                    finally {
                        pph_vars.$pph_current_arg0$.rebind(_prev_bind_0_$116, thread);
                    }
                }
            }
            else {
                try {
                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0_$118 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind((SubLObject)pph_templates.$sym37$CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            if (pph_templates.NIL == assertions_high.gaf_assertionP(as)) {
                                final SubLObject new_format_string2 = Sequences.cconcatenate((SubLObject)pph_templates.$str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_templates.ONE_INTEGER), pph_templates.$str1$__, format_nil.format_nil_a_no_copy((SubLObject)pph_templates.$str57$PPH_PHRASE_FROM_ASSERTION_passed_) });
                                pph_error.pph_handle_error(new_format_string2, (SubLObject)ConsesLow.list(as));
                            }
                            else if (pph_templates.NIL != pph_template_non_wfP(as, wff_checking_mode)) {
                                final SubLObject new_format_string2 = Sequences.cconcatenate((SubLObject)pph_templates.$str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_templates.ONE_INTEGER), pph_templates.$str1$__, format_nil.format_nil_a_no_copy((SubLObject)pph_templates.$str58$PPH_PHRASE_FROM_ASSERTION_passed_) });
                                pph_error.pph_handle_error(new_format_string2, (SubLObject)ConsesLow.list(as));
                            }
                            else {
                                final SubLObject phrase_naut2 = phrase_naut_from_as(as);
                                final SubLObject arg_position_map2 = pph_utilities.pph_new_empty_map();
                                final SubLObject _prev_bind_0_$119 = pph_vars.$pph_current_arg0$.currentBinding(thread);
                                try {
                                    pph_vars.$pph_current_arg0$.bind(assertions_high.gaf_arg1(as), thread);
                                    if (pph_templates.NIL != phrase_naut2) {
                                        final SubLObject mt_var2 = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
                                        final SubLObject _prev_bind_0_$120 = mt_relevance_macros.$mt$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$119 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                        final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                        try {
                                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var2), thread);
                                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var2), thread);
                                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var2), thread);
                                            ans = pph_phrasify_phrase_naut(phrase_naut2, arg_position_map2);
                                            if (pph_templates.NIL != pph_phrase.pph_phrase_p(ans, (SubLObject)pph_templates.UNPROVIDED)) {
                                                pph_phrase.pph_phrase_add_justification(ans, as);
                                                if (pph_templates.NIL != pph_phrase.pph_unknown_cycl_p(pph_phrase.pph_phrase_cycl(ans, (SubLObject)pph_templates.UNPROVIDED))) {
                                                    pph_phrase.pph_phrase_set_cycl(ans, pph_dummy_cycl_from_as(as));
                                                }
                                            }
                                        }
                                        finally {
                                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_4, thread);
                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$119, thread);
                                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_$120, thread);
                                        }
                                    }
                                }
                                finally {
                                    pph_vars.$pph_current_arg0$.rebind(_prev_bind_0_$119, thread);
                                }
                            }
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)pph_templates.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$118, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                }
                finally {
                    thread.throwStack.pop();
                }
                if (error_message.isString() && pph_templates.NIL == pph_error.suppress_pph_warningsP()) {
                    Errors.warn(Sequences.cconcatenate(pph_error_message_truncator.truncate_pph_error_message(error_message), (SubLObject)pph_templates.$str38$___Top_level_CycL___S), pph_vars.pph_top_level_cycl());
                }
            }
        }
        finally {
            pph_error.$pph_error_handling_onP$.rebind(_prev_bind_2, thread);
            Errors.$continue_cerrorP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 11125L)
    public static SubLObject pph_dummy_cycl_from_as(final SubLObject as) {
        if (pph_templates.NIL != assertions_high.gaf_assertionP(as)) {
            final SubLObject reln = assertions_high.gaf_arg1(as);
            final SubLObject dummy_formula = pph_utilities.pph_dummy_formula(reln, (SubLObject)pph_templates.UNPROVIDED);
            return dummy_formula;
        }
        return (SubLObject)pph_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 11690L)
    public static SubLObject gen_template_recipe_p(final SubLObject candidate, SubLObject predicate, SubLObject wff_checking_mode, SubLObject constraint) {
        if (predicate == pph_templates.UNPROVIDED) {
            predicate = (SubLObject)pph_templates.NIL;
        }
        if (wff_checking_mode == pph_templates.UNPROVIDED) {
            wff_checking_mode = (SubLObject)pph_templates.$kw33$FAST;
        }
        if (constraint == pph_templates.UNPROVIDED) {
            constraint = (SubLObject)pph_templates.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)pph_templates.NIL;
        if (pph_templates.NIL != el_utilities.el_formula_p(candidate)) {
            final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
            try {
                pph_macros.$free_pph_problem_store_pointers$.bind((SubLObject)pph_templates.NIL, thread);
                thread.resetMultipleValues();
                final SubLObject _prev_bind_0_$123 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                try {
                    pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                    final SubLObject reuseP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    try {
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$124 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                            final SubLObject new_or_reused = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            final SubLObject _prev_bind_0_$125 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                            try {
                                pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                final SubLObject _prev_bind_0_$126 = memoization_state.$memoization_state$.currentBinding(thread);
                                try {
                                    memoization_state.$memoization_state$.bind(local_state, thread);
                                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                    try {
                                        final SubLObject post_expansion = pph_expand_phrase_nauts(candidate);
                                        ans = ((wff_checking_mode == pph_templates.$kw59$SLOW) ? pph_expanded_template_formula_wfP(post_expansion, predicate, constraint) : pph_expanded_template_formula_wfP_fast(post_expansion, predicate));
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$127 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_templates.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$127, thread);
                                        }
                                    }
                                }
                                finally {
                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$126, thread);
                                }
                            }
                            finally {
                                pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$125, thread);
                            }
                            if (new_or_reused == pph_templates.$kw3$NEW && pph_templates.NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread))) {
                                memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                            }
                        }
                        finally {
                            pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$124, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$128 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_templates.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            if (pph_templates.NIL == reuseP) {
                                pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                            }
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$128, thread);
                        }
                    }
                }
                finally {
                    pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$123, thread);
                }
            }
            finally {
                pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 12617L)
    public static SubLObject pph_expanded_template_formula_wfP(final SubLObject candidate, SubLObject predicate, SubLObject constraint) {
        if (predicate == pph_templates.UNPROVIDED) {
            predicate = (SubLObject)pph_templates.NIL;
        }
        if (constraint == pph_templates.UNPROVIDED) {
            constraint = (SubLObject)pph_templates.NIL;
        }
        assert pph_templates.NIL != el_utilities.el_formula_p(candidate) : candidate;
        final SubLObject gaps = pph_find_generic_arg_gaps(candidate, pph_utilities.pph_arity(predicate), constraint);
        if (pph_templates.NIL == set.empty_set_p(gaps)) {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_templates.$str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_templates.ONE_INTEGER), pph_templates.$str1$__, format_nil.format_nil_a_no_copy((SubLObject)pph_templates.$str61$______expanded_template_for__S___) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(predicate, candidate, set.set_element_list(gaps)));
        }
        if (pph_templates.NIL != pph_expanded_template_formula_wfP_fast_problemP(candidate, pph_utilities.pph_arity(predicate))) {
            return (SubLObject)pph_templates.NIL;
        }
        return list_utilities.sublisp_boolean(pph_phrase_from_gentemplate_phrase(candidate, (SubLObject)pph_templates.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 13181L)
    public static SubLObject pph_find_generic_arg_gaps(final SubLObject formula, final SubLObject v_arity, SubLObject check_constraint) {
        if (check_constraint == pph_templates.UNPROVIDED) {
            check_constraint = (SubLObject)pph_templates.NIL;
        }
        final SubLObject gaps = set.new_set((SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
        if (pph_templates.NIL != v_arity) {
            SubLObject stopP = (SubLObject)pph_templates.NIL;
            final SubLObject repeated_args_phrase_nauts = cycl_utilities.expression_gather(formula, (SubLObject)pph_templates.$sym62$REPEATED_ARGS_PHRASE_NAUT_P, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
            final SubLObject repeated_generic_args = list_utilities.tree_gather(repeated_args_phrase_nauts, (SubLObject)pph_templates.$sym63$GENERIC_ARG_P, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
            if (pph_templates.NIL == stopP) {
                SubLObject end_var;
                SubLObject i;
                SubLObject gen_arg;
                for (end_var = number_utilities.f_1X(v_arity), i = (SubLObject)pph_templates.NIL, i = (SubLObject)pph_templates.ONE_INTEGER; pph_templates.NIL == stopP && !i.numGE(end_var); i = number_utilities.f_1X(i)) {
                    gen_arg = at_utilities.get_generic_arg(i);
                    if (pph_templates.NIL != Sequences.find(gen_arg, repeated_generic_args, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED)) {
                        stopP = (SubLObject)pph_templates.T;
                    }
                    else if (pph_templates.NIL == cycl_utilities.formula_find(gen_arg, formula, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED)) {
                        if (pph_templates.NIL == check_constraint || pph_templates.NIL == cycl_utilities.formula_find(gen_arg, check_constraint, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED)) {
                            set.set_add(gen_arg, gaps);
                        }
                    }
                }
            }
        }
        return gaps;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 13951L)
    public static SubLObject repeated_args_phrase_naut_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_templates.NIL != el_utilities.possibly_naut_p(v_object) && cycl_utilities.nat_functor(v_object).eql(pph_functions.repeatforsubsequentargsfn()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 14195L)
    public static SubLObject pph_expanded_template_formula_wfP_fast(final SubLObject candidate, SubLObject predicate) {
        if (predicate == pph_templates.UNPROVIDED) {
            predicate = (SubLObject)pph_templates.NIL;
        }
        assert pph_templates.NIL != el_utilities.el_formula_p(candidate) : candidate;
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_templates.NIL == pph_expanded_template_formula_wfP_fast_problemP(candidate, pph_utilities.pph_arity(predicate)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 14598L)
    public static SubLObject pph_non_template_bound_el_varP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_templates.NIL != cycl_variables.el_varP(v_object) && pph_templates.NIL == subl_promotions.memberP(v_object, pph_templates.$pph_template_bound_vars$.getDynamicValue(thread), (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 14752L)
    public static SubLObject pph_template_bound_vars(final SubLObject formula) {
        if (pph_templates.NIL != formula_pattern_match.formula_matches_pattern(formula, reader.bq_cons(pph_functions.bestbindingsphrasefn(), (SubLObject)pph_templates.$kw42$ANYTHING))) {
            return el_utilities.sentence_free_variables(cycl_utilities.formula_arg1(formula, (SubLObject)pph_templates.UNPROVIDED), (SubLObject)pph_templates.NIL, (SubLObject)pph_templates.$sym64$PPH_NON_TEMPLATE_BOUND_EL_VAR_, (SubLObject)pph_templates.UNPROVIDED);
        }
        return (SubLObject)pph_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 15004L)
    public static SubLObject pph_expanded_template_formula_wfP_fast_problemP(final SubLObject candidate, final SubLObject arity_known) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject this_func = cycl_utilities.formula_arg0(candidate);
        SubLObject problemP = (SubLObject)SubLObjectFactory.makeBoolean(pph_templates.NIL == pph_functions.pph_phrase_fnP(this_func, (SubLObject)pph_templates.UNPROVIDED) && !this_func.eql(pph_templates.$const65$TheNthFn));
        if (pph_templates.NIL != problemP) {
            if (pph_templates.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_templates.ONE_INTEGER) && pph_templates.NIL == pph_error.suppress_pph_warningsP()) {
                Errors.warn((SubLObject)pph_templates.$str66$_S_can_t_begin_a___GenTemplateRec, this_func);
                streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
        }
        else {
            final SubLObject _prev_bind_0 = pph_templates.$pph_template_bound_vars$.currentBinding(thread);
            try {
                pph_templates.$pph_template_bound_vars$.bind(ConsesLow.append(pph_template_bound_vars(candidate), pph_templates.$pph_template_bound_vars$.getDynamicValue(thread)), thread);
                SubLObject this_arg_num = (SubLObject)pph_templates.ZERO_INTEGER;
                final SubLObject args = cycl_utilities.formula_args(candidate, (SubLObject)pph_templates.$kw67$IGNORE);
                SubLObject rest;
                SubLObject this_arg;
                for (rest = (SubLObject)pph_templates.NIL, rest = args; pph_templates.NIL == problemP && pph_templates.NIL != rest; rest = rest.rest()) {
                    this_arg = rest.first();
                    this_arg_num = Numbers.add(this_arg_num, (SubLObject)pph_templates.ONE_INTEGER);
                    if (pph_templates.NIL != pph_expanded_template_formula_arg_wfP_fast_problemP(this_arg, this_arg_num, this_func, arity_known)) {
                        if (pph_templates.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_templates.ONE_INTEGER) && pph_templates.NIL == pph_error.suppress_pph_warningsP()) {
                            Errors.warn((SubLObject)pph_templates.$str68$Wf_problem_with__S, this_arg);
                            streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                        }
                        problemP = (SubLObject)pph_templates.T;
                    }
                }
            }
            finally {
                pph_templates.$pph_template_bound_vars$.rebind(_prev_bind_0, thread);
            }
        }
        return problemP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 15946L)
    public static SubLObject pph_expanded_template_formula_arg_wfP_fast_problemP(SubLObject this_arg, final SubLObject this_arg_num, final SubLObject this_func, final SubLObject arity_known) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_templates.NIL != canon_tl.tl_varP(this_arg)) {
            this_arg = cycl_variables.make_el_var(cycl_utilities.formula_arg2(this_arg, (SubLObject)pph_templates.UNPROVIDED));
        }
        SubLObject problemP = (SubLObject)pph_templates.NIL;
        if (this_arg_num.numE((SubLObject)pph_templates.ONE_INTEGER) && (this_func.equalp(pph_functions.conditionalphrasefn()) || this_func.equalp(pph_functions.bestbindingsphrasefn()))) {
            if (pph_templates.NIL != collection_defns.cycl_sentence_askableP(this_arg)) {
                final SubLObject closedP = el_utilities.closedP(this_arg, (SubLObject)pph_templates.$sym64$PPH_NON_TEMPLATE_BOUND_EL_VAR_);
                if (pph_templates.NIL != kb_utilities.kbeq(this_func, pph_functions.conditionalphrasefn()) && pph_templates.NIL == closedP) {
                    final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_templates.$str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_templates.ONE_INTEGER), pph_templates.$str1$__, format_nil.format_nil_a_no_copy((SubLObject)pph_templates.$str69$_S_expects_a_closed_formula_for_i) });
                    pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(this_func, this_arg));
                    problemP = (SubLObject)pph_templates.T;
                }
            }
            else {
                final SubLObject new_format_string2 = Sequences.cconcatenate((SubLObject)pph_templates.$str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_templates.ONE_INTEGER), pph_templates.$str1$__, format_nil.format_nil_a_no_copy((SubLObject)pph_templates.$str70$_S_expects_a_cycl_sentence_askabl) });
                pph_error.pph_handle_error(new_format_string2, (SubLObject)ConsesLow.list(this_func, this_arg_num, this_arg));
                problemP = (SubLObject)pph_templates.T;
            }
        }
        else if (!this_arg_num.numE((SubLObject)pph_templates.ONE_INTEGER) || !this_func.equalp(pph_functions.repeatforsubsequentargsfn())) {
            if (!this_arg_num.numE((SubLObject)pph_templates.ONE_INTEGER) || !this_func.equalp(pph_functions.phraseformfn()) || pph_templates.NIL == el_utilities.el_formula_p(this_arg)) {
                if (pph_templates.NIL != el_utilities.el_formula_p(this_arg) && pph_templates.NIL != subl_promotions.memberP(pph_templates.$const71$SententialConstituent, kb_accessors.argn_isa(this_func, this_arg_num, (SubLObject)pph_templates.UNPROVIDED), (SubLObject)pph_templates.$sym72$PPH_SPEC_, (SubLObject)pph_templates.UNPROVIDED)) {
                    if (!this_func.equalp(pph_functions.termparaphrasefn())) {
                        problemP = pph_expanded_template_formula_wfP_fast_problemP(this_arg, arity_known);
                    }
                }
                else if (pph_templates.NIL == cycl_grammar.cycl_variable_p(this_arg) && pph_templates.NIL == pph_utilities.pph_arg_position_specifierP(this_arg) && pph_templates.NIL == pph_phrase.pph_phrase_wu_p(function_terms.naut_to_nart(this_arg)) && pph_templates.NIL != subl_promotions.memberP(pph_templates.$const73$LexicalWord, kb_accessors.argn_isa(this_func, this_arg_num, (SubLObject)pph_templates.UNPROVIDED), (SubLObject)pph_templates.$sym72$PPH_SPEC_, (SubLObject)pph_templates.UNPROVIDED)) {
                    final SubLObject new_format_string2 = Sequences.cconcatenate((SubLObject)pph_templates.$str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_templates.ONE_INTEGER), pph_templates.$str1$__, format_nil.format_nil_a_no_copy((SubLObject)pph_templates.$str74$_S_is_required_to_be_a___LexicalW) });
                    pph_error.pph_handle_error(new_format_string2, (SubLObject)ConsesLow.list(this_arg));
                    problemP = (SubLObject)pph_templates.T;
                }
                else if (pph_templates.NIL != at_admitted.generic_arg_p(this_arg)) {
                    if (pph_templates.NIL != arity_known && arity_known.numG((SubLObject)pph_templates.ZERO_INTEGER) && at_utilities.generic_arg_num(this_arg).numG(arity_known)) {
                        final SubLObject new_format_string2 = Sequences.cconcatenate((SubLObject)pph_templates.$str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_templates.ONE_INTEGER), pph_templates.$str1$__, format_nil.format_nil_a_no_copy((SubLObject)pph_templates.$str75$_S_exceeds_the_maxArity___S__allo) });
                        pph_error.pph_handle_error(new_format_string2, (SubLObject)ConsesLow.list(at_utilities.generic_arg_num(this_arg), arity_known));
                        problemP = (SubLObject)pph_templates.T;
                    }
                }
                else if (pph_templates.NIL != constant_handles.constant_p(this_arg)) {
                    SubLObject cdolist_list_var;
                    final SubLObject gafs = cdolist_list_var = kb_mapping.gather_gaf_arg_index_with_predicate(this_func, (SubLObject)pph_templates.ONE_INTEGER, pph_templates.$const76$argIsa, pph_templates.$const77$GeneralLexiconMt, (SubLObject)pph_templates.UNPROVIDED);
                    SubLObject this_gaf = (SubLObject)pph_templates.NIL;
                    this_gaf = cdolist_list_var.first();
                    while (pph_templates.NIL != cdolist_list_var) {
                        SubLObject current;
                        final SubLObject datum = current = assertions_high.assertion_formula(this_gaf);
                        SubLObject foo = (SubLObject)pph_templates.NIL;
                        SubLObject bar = (SubLObject)pph_templates.NIL;
                        SubLObject argn = (SubLObject)pph_templates.NIL;
                        SubLObject coll = (SubLObject)pph_templates.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_templates.$list78);
                        foo = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_templates.$list78);
                        bar = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_templates.$list78);
                        argn = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_templates.$list78);
                        coll = current.first();
                        current = current.rest();
                        if (pph_templates.NIL == current) {
                            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
                            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                if ((argn.numE((SubLObject)pph_templates.ZERO_INTEGER) || argn.numE(this_arg_num)) && !coll.equalp(pph_templates.$const79$Thing) && pph_templates.NIL == isa.isaP(this_arg, coll, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED)) {
                                    final SubLObject new_format_string3 = Sequences.cconcatenate((SubLObject)pph_templates.$str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_templates.ONE_INTEGER), pph_templates.$str1$__, format_nil.format_nil_a_no_copy((SubLObject)pph_templates.$str80$_S_isn_t_a__S_w_r_t___S) });
                                    pph_error.pph_handle_error(new_format_string3, (SubLObject)ConsesLow.list(this_arg, coll, pph_vars.$pph_language_mt$.getDynamicValue(thread)));
                                    problemP = (SubLObject)pph_templates.T;
                                }
                            }
                            finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_templates.$list78);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        this_gaf = cdolist_list_var.first();
                    }
                }
            }
        }
        return problemP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 19308L)
    public static SubLObject pph_template_non_wfP(final SubLObject as, SubLObject wff_checking_mode) {
        if (wff_checking_mode == pph_templates.UNPROVIDED) {
            wff_checking_mode = (SubLObject)pph_templates.$kw33$FAST;
        }
        return pph_template_formula_non_wfP(assertions_high.gaf_formula(as), wff_checking_mode);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 19497L)
    public static SubLObject pph_template_formula_non_wfP(final SubLObject formula, SubLObject wff_checking_mode) {
        if (wff_checking_mode == pph_templates.UNPROVIDED) {
            wff_checking_mode = (SubLObject)pph_templates.$kw33$FAST;
        }
        if (wff_checking_mode == pph_templates.$kw32$OFF) {
            return (SubLObject)pph_templates.NIL;
        }
        if (pph_templates.NIL != self_referential_gen_template_formulaP(formula)) {
            Errors.warn((SubLObject)pph_templates.$str81$__Self_referential___genTemplate_, formula);
            return (SubLObject)pph_templates.T;
        }
        if (pph_templates.NIL != bad_generic_arg_in_gen_template_formula(formula)) {
            Errors.warn((SubLObject)pph_templates.$str82$__Bad_generic_arg_keyword___S__in, bad_generic_arg_in_gen_template_formula(formula), formula);
            return (SubLObject)pph_templates.T;
        }
        if (cycl_utilities.formula_arg0(formula).equalp(pph_templates.$const83$genTemplate)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(pph_templates.NIL == gen_template_recipe_p(cycl_utilities.formula_arg(formula, (SubLObject)pph_templates.TWO_INTEGER, (SubLObject)pph_templates.UNPROVIDED), cycl_utilities.formula_arg(formula, (SubLObject)pph_templates.ONE_INTEGER, (SubLObject)pph_templates.UNPROVIDED), wff_checking_mode, (SubLObject)pph_templates.UNPROVIDED));
        }
        if (cycl_utilities.formula_arg0(formula).equalp(pph_templates.$const84$genTemplate_QuerySentence)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(pph_templates.NIL == gen_template_recipe_p(cycl_utilities.formula_arg(formula, (SubLObject)pph_templates.TWO_INTEGER, (SubLObject)pph_templates.UNPROVIDED), (SubLObject)pph_templates.NIL, wff_checking_mode, (SubLObject)pph_templates.UNPROVIDED));
        }
        if (cycl_utilities.formula_arg0(formula).equalp(pph_templates.$const85$genTemplate_Constrained)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(pph_templates.NIL == gen_template_recipe_p(cycl_utilities.formula_arg(formula, (SubLObject)pph_templates.THREE_INTEGER, (SubLObject)pph_templates.UNPROVIDED), cycl_utilities.formula_arg(formula, (SubLObject)pph_templates.ONE_INTEGER, (SubLObject)pph_templates.UNPROVIDED), wff_checking_mode, cycl_utilities.formula_arg(formula, (SubLObject)pph_templates.TWO_INTEGER, (SubLObject)pph_templates.UNPROVIDED)));
        }
        if (cycl_utilities.formula_arg0(formula).equalp(pph_templates.$const86$detailedIsaParaphrase)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(pph_templates.NIL == gen_template_recipe_p(cycl_utilities.formula_arg(formula, (SubLObject)pph_templates.TWO_INTEGER, (SubLObject)pph_templates.UNPROVIDED), cycl_utilities.formula_arg(formula, (SubLObject)pph_templates.ONE_INTEGER, (SubLObject)pph_templates.UNPROVIDED), wff_checking_mode, (SubLObject)pph_templates.UNPROVIDED));
        }
        final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_templates.$str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_templates.ONE_INTEGER), pph_templates.$str1$__, format_nil.format_nil_a_no_copy((SubLObject)pph_templates.$str87$_non_wf__needs_instructions_for_i) });
        pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(cycl_utilities.formula_arg0(formula)));
        return (SubLObject)pph_templates.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 20990L)
    public static SubLObject self_referential_gen_template_formulaP(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject reln = cycl_utilities.formula_operator(formula);
        final SubLObject phrase_naut = phrase_naut_from_formula(formula);
        SubLObject okP = (SubLObject)pph_templates.NIL;
        if (!cycl_utilities.formula_arg0(phrase_naut).eql(pph_functions.termparaphrasefn()) || !cycl_utilities.formula_arg0(cycl_utilities.formula_arg1(phrase_naut, (SubLObject)pph_templates.UNPROVIDED)).eql(reln)) {
            return (SubLObject)pph_templates.NIL;
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)pph_templates.$sym6$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(pph_templates.$const7$EverythingPSC, thread);
            if (pph_templates.NIL == okP) {
                SubLObject end_var;
                SubLObject i;
                for (end_var = number_utilities.f_1X(pph_utilities.pph_arity(reln)), i = (SubLObject)pph_templates.NIL, i = (SubLObject)pph_templates.ONE_INTEGER; pph_templates.NIL == okP && !i.numGE(end_var); i = number_utilities.f_1X(i)) {
                    if (!cycl_utilities.formula_arg(cycl_utilities.formula_arg1(phrase_naut, (SubLObject)pph_templates.UNPROVIDED), i, (SubLObject)pph_templates.UNPROVIDED).eql(at_utilities.get_generic_arg(i))) {
                        okP = (SubLObject)pph_templates.T;
                    }
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_templates.NIL == okP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 21617L)
    public static SubLObject bad_generic_arg_in_gen_template_formula(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject bad = (SubLObject)pph_templates.NIL;
        SubLObject v_arity = (SubLObject)pph_templates.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)pph_templates.$sym6$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(pph_templates.$const7$EverythingPSC, thread);
            v_arity = arity.max_arity(cycl_utilities.formula_arg1(formula, (SubLObject)pph_templates.UNPROVIDED));
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (v_arity.isInteger() && pph_templates.NIL == bad) {
            SubLObject csome_list_var = cycl_utilities.expression_gather(formula, (SubLObject)pph_templates.$sym63$GENERIC_ARG_P, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
            SubLObject arg = (SubLObject)pph_templates.NIL;
            arg = csome_list_var.first();
            while (pph_templates.NIL == bad && pph_templates.NIL != csome_list_var) {
                if (at_utilities.generic_arg_num(arg).numG(v_arity)) {
                    bad = arg;
                }
                csome_list_var = csome_list_var.rest();
                arg = csome_list_var.first();
            }
        }
        return bad;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 22024L)
    public static SubLObject assertion_has_phrase_naut_argP(final SubLObject as) {
        return pph_types.pph_phrase_nautP(phrase_naut_from_as(as));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 22134L)
    public static SubLObject phrase_naut_from_as(final SubLObject as) {
        return phrase_naut_from_formula(assertions_high.gaf_formula(as));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 22302L)
    public static SubLObject phrase_naut_from_formula(final SubLObject formula) {
        final SubLObject phrase_naut_arg = phrase_naut_arg(cycl_utilities.formula_operator(formula));
        return (SubLObject)((pph_templates.NIL != phrase_naut_arg) ? cycl_utilities.formula_arg(formula, phrase_naut_arg, (SubLObject)pph_templates.UNPROVIDED) : pph_templates.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 22505L)
    public static SubLObject clear_phrase_naut_arg() {
        final SubLObject cs = pph_templates.$phrase_naut_arg_caching_state$.getGlobalValue();
        if (pph_templates.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)pph_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 22505L)
    public static SubLObject remove_phrase_naut_arg(final SubLObject pred) {
        return memoization_state.caching_state_remove_function_results_with_args(pph_templates.$phrase_naut_arg_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(pred), (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 22505L)
    public static SubLObject phrase_naut_arg_internal(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)pph_templates.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)pph_templates.$sym6$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(pph_templates.$const7$EverythingPSC, thread);
            final SubLObject pred_arity = pph_utilities.pph_arity(pred);
            if (pred_arity.isInteger()) {
                if (pph_templates.NIL == ans) {
                    SubLObject end_var;
                    SubLObject n;
                    SubLObject csome_list_var;
                    SubLObject type;
                    for (end_var = number_utilities.f_1X(pred_arity), n = (SubLObject)pph_templates.NIL, n = (SubLObject)pph_templates.ONE_INTEGER; pph_templates.NIL == ans && !n.numGE(end_var); n = number_utilities.f_1X(n)) {
                        if (pph_templates.NIL == ans) {
                            csome_list_var = kb_accessors.argn_isa(pred, n, (SubLObject)pph_templates.UNPROVIDED);
                            type = (SubLObject)pph_templates.NIL;
                            type = csome_list_var.first();
                            while (pph_templates.NIL == ans && pph_templates.NIL != csome_list_var) {
                                if (pph_templates.NIL != nl_phrase_typeP(type)) {
                                    ans = n;
                                }
                                csome_list_var = csome_list_var.rest();
                                type = csome_list_var.first();
                            }
                        }
                    }
                }
            }
            else {
                final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_templates.$str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_templates.ONE_INTEGER), pph_templates.$str1$__, format_nil.format_nil_a_no_copy((SubLObject)pph_templates.$str89$_S_has_no_known_arity___) });
                pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(pred));
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 22505L)
    public static SubLObject phrase_naut_arg(final SubLObject pred) {
        SubLObject caching_state = pph_templates.$phrase_naut_arg_caching_state$.getGlobalValue();
        if (pph_templates.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)pph_templates.$sym88$PHRASE_NAUT_ARG, (SubLObject)pph_templates.$sym90$_PHRASE_NAUT_ARG_CACHING_STATE_, (SubLObject)pph_templates.$int91$128, (SubLObject)pph_templates.EQL, (SubLObject)pph_templates.ONE_INTEGER, (SubLObject)pph_templates.SIXTEEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(phrase_naut_arg_internal(pred)));
            memoization_state.caching_state_put(caching_state, pred, results, (SubLObject)pph_templates.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 22988L)
    public static SubLObject nl_phrase_typeP(final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return pph_utilities.pph_genlP(type, pph_templates.$const71$SententialConstituent, pph_vars.$pph_language_mt$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 23098L)
    public static SubLObject strip_generic_arg_hall_passes(final SubLObject cycl_phrase) {
        if (!cycl_utilities.formula_arg0(cycl_phrase).equal(pph_functions.gentemplaterecipeomitsargfn())) {
            return cycl_phrase;
        }
        SubLObject pred = (SubLObject)pph_templates.NIL;
        SubLObject gen_arg = (SubLObject)pph_templates.NIL;
        SubLObject remainder = (SubLObject)pph_templates.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(cycl_phrase, cycl_phrase, (SubLObject)pph_templates.$list92);
        pred = cycl_phrase.first();
        SubLObject current = cycl_phrase.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, cycl_phrase, (SubLObject)pph_templates.$list92);
        gen_arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, cycl_phrase, (SubLObject)pph_templates.$list92);
        remainder = current.first();
        current = current.rest();
        if (pph_templates.NIL == current) {
            return strip_generic_arg_hall_passes(remainder);
        }
        cdestructuring_bind.cdestructuring_bind_error(cycl_phrase, (SubLObject)pph_templates.$list92);
        return (SubLObject)pph_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 23398L)
    public static SubLObject pph_phrase_from_gentemplate_phrase(final SubLObject phrase_naut, SubLObject arg_position_map) {
        if (arg_position_map == pph_templates.UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_empty_map();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_templates.NIL != at_admitted.generic_arg_p(phrase_naut)) {
            return pph_phrase.pph_phrase_copy(pph_phrase.new_pph_phrase_for_cycl(phrase_naut, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED), (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
        }
        final SubLObject phrase_naut_with_narts = narts_high.nart_substitute(phrase_naut);
        SubLObject v_pph_phrase = (SubLObject)pph_templates.NIL;
        final SubLObject local_state = pph_macros.find_or_create_pph_external_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                if (pph_templates.NIL != el_utilities.el_formula_p(phrase_naut_with_narts) && pph_templates.NIL == wff.memoized_syntactically_wf_formulaP(phrase_naut_with_narts)) {
                    final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_templates.$str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_templates.ONE_INTEGER), pph_templates.$str1$__, format_nil.format_nil_a_no_copy((SubLObject)pph_templates.$str93$_S_is_not_a_well_formed_genTempla) });
                    pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(phrase_naut_with_narts));
                }
            }
            finally {
                final SubLObject _prev_bind_0_$129 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_templates.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$129, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        final SubLObject raw_phrase_naut = strip_generic_arg_hall_passes(phrase_naut_with_narts);
        final SubLObject plist = pph_plist_for_phrase_naut(raw_phrase_naut);
        thread.resetMultipleValues();
        final SubLObject expanded_phrase_naut = pph_expand_phrase_nauts_top_level(raw_phrase_naut, arg_position_map);
        final SubLObject new_arg_position_map = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (pph_templates.NIL == pph_types.pph_phrase_nautP(expanded_phrase_naut)) {
            if (pph_templates.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_templates.ONE_INTEGER) && pph_templates.NIL == pph_error.suppress_pph_warningsP()) {
                Errors.warn((SubLObject)pph_templates.$str94$PPH_PHRASE_FROM_GENTEMPLATE_PHRAS, phrase_naut, expanded_phrase_naut);
                streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
            return (SubLObject)pph_templates.NIL;
        }
        final SubLObject fn = cycl_utilities.nat_function(expanded_phrase_naut);
        if (pph_templates.NIL != kb_utilities.kbeq(fn, pph_functions.typeclarifyingphrasefn())) {
            final SubLObject ans = pph_phrase.new_pph_type_clarifying_phrase(expanded_phrase_naut, (SubLObject)pph_templates.UNPROVIDED);
            final SubLObject arg_position = pph_utilities.pph_arg_position_lookup((SubLObject)pph_templates.$list95, new_arg_position_map);
            pph_phrase.pph_phrase_set_arg_position(ans, arg_position);
            v_pph_phrase = ans;
        }
        else if (pph_templates.NIL != kb_utilities.kbeq(fn, pph_functions.bestsymbolphrasefn())) {
            final SubLObject ans = pph_phrase.new_pph_symbol_phrase(expanded_phrase_naut);
            final SubLObject arg_position = pph_utilities.pph_arg_position_lookup((SubLObject)pph_templates.$list95, new_arg_position_map);
            pph_phrase.pph_phrase_set_arg_position(ans, arg_position);
            v_pph_phrase = ans;
        }
        else if (pph_templates.NIL != kb_utilities.kbeq(fn, pph_functions.percentparaphrasefn())) {
            final SubLObject ans = pph_phrase.new_pph_percent_phrase(expanded_phrase_naut);
            final SubLObject arg_position = pph_utilities.pph_arg_position_lookup((SubLObject)pph_templates.$list95, new_arg_position_map);
            pph_phrase.pph_phrase_set_arg_position(ans, arg_position);
            v_pph_phrase = ans;
        }
        else if (pph_templates.NIL != kb_utilities.kbeq(fn, pph_functions.bestcyclphrasefn())) {
            final SubLObject ans = pph_phrase.new_pph_cycl_phrase(expanded_phrase_naut);
            final SubLObject arg_position = pph_utilities.pph_arg_position_lookup((SubLObject)pph_templates.$list95, new_arg_position_map);
            pph_phrase.pph_phrase_set_arg_position(ans, arg_position);
            v_pph_phrase = ans;
        }
        else if (pph_templates.NIL != kb_utilities.kbeq(fn, pph_functions.bestbindingsphrasefn())) {
            final SubLObject ans = pph_phrase.new_pph_variable_binding_phrase(expanded_phrase_naut);
            final SubLObject arg_position = pph_utilities.pph_arg_position_lookup((SubLObject)pph_templates.$list95, new_arg_position_map);
            pph_phrase.pph_phrase_set_arg_position(ans, arg_position);
            v_pph_phrase = ans;
        }
        else if (pph_templates.NIL != kb_utilities.kbeq(fn, pph_functions.concatenatephrasesfn())) {
            v_pph_phrase = pph_phrase_from_concatenate_phrases_naut(expanded_phrase_naut, new_arg_position_map);
        }
        else if (pph_templates.NIL != kb_utilities.kbeq(fn, pph_functions.concatenatephrasesfn_nospaces())) {
            v_pph_phrase = pph_phrase.new_pph_nospace_phrase(expanded_phrase_naut, new_arg_position_map);
        }
        else if (pph_templates.NIL != kb_utilities.kbeq(fn, pph_functions.bestnlphraseofstringfn())) {
            final SubLObject string_arg = cycl_utilities.nat_arg1(expanded_phrase_naut, (SubLObject)pph_templates.UNPROVIDED);
            final SubLObject string_specifiedP = cycl_string.cycl_string_p(string_arg);
            final SubLObject arg_position_specifiedP = pph_utilities.pph_arg_position_specifierP(string_arg);
            final SubLObject string = (SubLObject)((pph_templates.NIL != string_specifiedP) ? pph_string.pph_string_from_cycl_string(string_arg) : pph_templates.NIL);
            final SubLObject cycl = (pph_templates.NIL != arg_position_specifiedP) ? string_arg : pph_phrase.pph_unknown_cycl();
            final SubLObject arg_position2 = pph_utilities.pph_arg_position_lookup((SubLObject)pph_templates.$list95, new_arg_position_map);
            final SubLObject ans2 = pph_data_structures.new_pph_phrase(string, cycl, (SubLObject)pph_templates.UNPROVIDED);
            pph_phrase.pph_phrase_set_arg_position(ans2, arg_position2);
            if (pph_templates.NIL == arg_position_specifiedP) {
                pph_phrase_resolution.pph_phrase_reserve_matrix_arg0_cycl(ans2);
            }
            if (pph_templates.NIL != string_utilities.non_empty_stringP(string)) {
                pph_phrase.pph_phrase_note_done(ans2);
            }
            v_pph_phrase = ans2;
        }
        else if (pph_templates.NIL != kb_utilities.kbeq(fn, pph_functions.stringmentionfn())) {
            v_pph_phrase = pph_phrase.new_pph_string_mention_phrase(expanded_phrase_naut);
        }
        else if (pph_templates.NIL != kb_utilities.kbeq(fn, pph_functions.quotedparaphrasefn())) {
            v_pph_phrase = pph_phrase.new_pph_quoted_paraphrase_phrase(expanded_phrase_naut);
        }
        else if (pph_templates.NIL != kb_utilities.kbeq(fn, pph_functions.terseparaphrasefn())) {
            v_pph_phrase = pph_phrase.new_pph_terse_phrase(expanded_phrase_naut);
        }
        else if (pph_templates.NIL != kb_utilities.kbeq(fn, pph_functions.preciseparaphrasefn())) {
            v_pph_phrase = pph_phrase.new_pph_precise_phrase(expanded_phrase_naut, new_arg_position_map);
        }
        else if (pph_templates.NIL != kb_utilities.kbeq(fn, pph_functions.phraseformfn())) {
            v_pph_phrase = pph_phrase_from_phrase_form_naut(expanded_phrase_naut, new_arg_position_map);
        }
        else if (pph_templates.NIL != kb_utilities.kbeq(fn, pph_functions.phrasecyclfn())) {
            v_pph_phrase = pph_phrase_from_phrase_cycl_fn_naut(expanded_phrase_naut, new_arg_position_map);
        }
        else if (pph_templates.NIL != kb_utilities.kbeq(fn, pph_functions.termparaphrasefn())) {
            final SubLObject denot = cycl_utilities.nat_arg1(expanded_phrase_naut, (SubLObject)pph_templates.UNPROVIDED);
            final SubLObject new_map = pph_utilities.pph_figure_new_arg_position_map(new_arg_position_map, (SubLObject)pph_templates.$kw96$ARG1);
            final SubLObject ans3 = pph_phrase.pph_phrase_copy(pph_phrase.new_pph_phrase_for_cycl(denot, new_map, (SubLObject)pph_templates.UNPROVIDED), (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
            if (pph_templates.NIL == cycl_utilities.expression_find_if((SubLObject)pph_templates.$sym97$PPH_ARG_POSITION_SPECIFIER_, denot, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED)) {
                pph_phrase_resolution.pph_phrase_reserve_matrix_arg0_cycl(ans3);
            }
            v_pph_phrase = ans3;
        }
        else if (pph_templates.NIL != kb_utilities.kbeq(fn, pph_functions.termparaphrasefn_possessive())) {
            final SubLObject cycl2 = cycl_utilities.nat_arg1(expanded_phrase_naut, (SubLObject)pph_templates.UNPROVIDED);
            final SubLObject ans4 = pph_phrase.pph_phrase_copy(pph_phrase.new_pph_phrase_for_cycl(cycl2, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED), (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
            final SubLObject arg_position3 = pph_utilities.pph_arg_position_lookup((SubLObject)pph_templates.$list95, new_arg_position_map);
            final SubLObject new_map2 = pph_utilities.pph_figure_new_arg_position_map(new_arg_position_map, (SubLObject)pph_templates.$kw96$ARG1);
            pph_phrase.pph_phrase_set_arg_position(ans4, arg_position3);
            pph_phrase.pph_phrase_set_arg_position_map(ans4, new_map2);
            if (pph_templates.NIL != pph_phrase.pph_phrase_doneP(ans4)) {
                pph_main.possessivize_pph_phrase(ans4);
            }
            else {
                pph_phrase.pph_phrase_update_category(ans4, pph_templates.$const98$PossessivePhrase, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
            }
            if (pph_templates.NIL == pph_utilities.pph_arg_position_specifierP(cycl2)) {
                pph_phrase_resolution.pph_phrase_reserve_matrix_arg0_cycl(ans4);
            }
            v_pph_phrase = ans4;
        }
        else if (pph_templates.NIL != kb_utilities.kbeq(fn, pph_functions.bestverbformforsubjectfn())) {
            v_pph_phrase = pph_phrase_from_best_verb_form_for_subject_naut(expanded_phrase_naut);
        }
        else if (pph_templates.NIL != kb_utilities.kbeq(fn, pph_functions.bestnlwordformoflexemefn())) {
            final SubLObject ans = pph_data_structures.new_pph_phrase((SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
            final SubLObject arg_position = pph_utilities.pph_arg_position_lookup((SubLObject)pph_templates.$list95, new_arg_position_map);
            pph_phrase.pph_phrase_set_arg_position(ans, arg_position);
            pph_phrase.pph_phrase_set_wu(ans, function_terms.naut_to_nart(cycl_utilities.nat_arg1(expanded_phrase_naut, (SubLObject)pph_templates.UNPROVIDED)));
            pph_phrase_resolution.pph_phrase_reserve_matrix_arg0_cycl(ans);
            v_pph_phrase = ans;
        }
        else if (pph_templates.NIL != kb_utilities.kbeq(fn, pph_functions.conditionalphrasefn())) {
            v_pph_phrase = pph_phrase.new_pph_conditional_phrase(expanded_phrase_naut, arg_position_map);
        }
        else if (pph_templates.NIL != kb_utilities.kbeq(fn, pph_functions.nlconjunctionfn()) || pph_templates.NIL != kb_utilities.kbeq(fn, pph_functions.nlconjunctionfn_but()) || pph_templates.NIL != kb_utilities.kbeq(fn, pph_functions.nldisjunctionfn())) {
            v_pph_phrase = pph_phrase.new_pph_coordination_phrase(expanded_phrase_naut);
        }
        else if (pph_templates.NIL != kb_utilities.kbeq(fn, pph_functions.bestnumberedlistparaphrasefn_constrained())) {
            v_pph_phrase = pph_phrase.new_pph_numbered_list_phrase(expanded_phrase_naut);
        }
        else if (pph_templates.NIL != kb_utilities.kbeq(fn, pph_functions.bestchemicalformulafn())) {
            v_pph_phrase = pph_phrase.new_pph_chemical_formula_from_lists_phrase(expanded_phrase_naut);
        }
        else if (pph_templates.NIL != kb_utilities.kbeq(fn, pph_functions.repeatforsubsequentargsfn())) {
            v_pph_phrase = pph_phrase.new_pph_repeated_phrase(expanded_phrase_naut);
        }
        else if (pph_templates.NIL != kb_utilities.kbeq(fn, pph_functions.bestdetnbarfn())) {
            v_pph_phrase = pph_phrase_from_best_det_nbar_naut(expanded_phrase_naut, new_arg_position_map);
        }
        else if (pph_templates.NIL != kb_utilities.kbeq(fn, pph_functions.headwordofphrasefn())) {
            final SubLObject ans = pph_phrase_from_gentemplate_phrase(cycl_utilities.nat_arg1(expanded_phrase_naut, (SubLObject)pph_templates.UNPROVIDED), (SubLObject)pph_templates.UNPROVIDED);
            final SubLObject arg_position = pph_utilities.pph_arg_position_lookup((SubLObject)pph_templates.$list95, new_arg_position_map);
            pph_phrase.pph_phrase_set_arg_position(ans, arg_position);
            v_pph_phrase = ans;
        }
        else if (pph_templates.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_templates.ONE_INTEGER) && pph_templates.NIL == pph_error.suppress_pph_warningsP()) {
            Errors.warn((SubLObject)pph_templates.$str99$Don_t_know_how_to_make_a_PPH_PHRA, expanded_phrase_naut);
            streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        }
        if (pph_templates.NIL != pph_phrase.pph_phrase_p(v_pph_phrase, (SubLObject)pph_templates.UNPROVIDED)) {
            SubLObject remainder;
            SubLObject property;
            SubLObject value;
            for (remainder = (SubLObject)pph_templates.NIL, remainder = plist; pph_templates.NIL != remainder; remainder = conses_high.cddr(remainder)) {
                property = remainder.first();
                value = conses_high.cadr(remainder);
                pph_data_structures.pph_phrase_info_set(v_pph_phrase, property, value);
            }
        }
        if (pph_templates.NIL != pph_phrase.pph_phrase_p(v_pph_phrase, (SubLObject)pph_templates.UNPROVIDED)) {
            pph_phrase.pph_phrase_set_cases_recursively(v_pph_phrase);
        }
        return Values.values(v_pph_phrase, (SubLObject)((pph_templates.NIL != pph_phrase.pph_phrase_p(v_pph_phrase, (SubLObject)pph_templates.UNPROVIDED)) ? pph_data_structures.pph_phrase_plist(v_pph_phrase) : pph_templates.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 30992L)
    public static SubLObject pph_phrase_from_concatenate_phrases_naut(final SubLObject phrase_naut, SubLObject arg_position_map) {
        if (arg_position_map == pph_templates.UNPROVIDED) {
            arg_position_map = (SubLObject)pph_templates.NIL;
        }
        final SubLObject phrase = pph_data_structures.new_pph_phrase((SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
        SubLObject head_dtr_num = (SubLObject)pph_templates.NIL;
        SubLObject new_dtrs = (SubLObject)pph_templates.NIL;
        SubLObject list_var = (SubLObject)pph_templates.NIL;
        SubLObject sub_phrase_cycl = (SubLObject)pph_templates.NIL;
        SubLObject i = (SubLObject)pph_templates.NIL;
        list_var = cycl_utilities.nat_args(phrase_naut, (SubLObject)pph_templates.UNPROVIDED);
        sub_phrase_cycl = list_var.first();
        for (i = (SubLObject)pph_templates.ZERO_INTEGER; pph_templates.NIL != list_var; list_var = list_var.rest(), sub_phrase_cycl = list_var.first(), i = Numbers.add((SubLObject)pph_templates.ONE_INTEGER, i)) {
            if (pph_templates.NIL != pph_head_dtr_nautP(sub_phrase_cycl)) {
                sub_phrase_cycl = pph_remove_head_dtr_marker(sub_phrase_cycl);
                head_dtr_num = i;
            }
            final SubLObject dtr_map = pph_utilities.pph_figure_new_arg_position_map(arg_position_map, at_utilities.get_generic_arg(number_utilities.f_1X(i)));
            final SubLObject nth_dtr = pph_phrase_from_gentemplate_phrase(sub_phrase_cycl, dtr_map);
            final SubLObject dtr_num = number_utilities.f_1X(i);
            final SubLObject local_arg_position = (SubLObject)ConsesLow.list(dtr_num);
            final SubLObject arg_position = pph_utilities.pph_arg_position_lookup(local_arg_position, arg_position_map);
            if (pph_templates.NIL == nth_dtr) {
                final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_templates.$str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_templates.ONE_INTEGER), pph_templates.$str1$__, format_nil.format_nil_a_no_copy((SubLObject)pph_templates.$str100$Couldn_t_make_PPH_phrase_from__S) });
                pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(sub_phrase_cycl));
            }
            pph_phrase.pph_phrase_set_arg_position(nth_dtr, arg_position);
            new_dtrs = (SubLObject)ConsesLow.cons(nth_dtr, new_dtrs);
        }
        pph_phrase.set_pph_phrase_dtrs_from_list(phrase, Sequences.nreverse(new_dtrs), head_dtr_num);
        pph_phrase_sanity_check_agr(phrase);
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 32088L)
    public static SubLObject pph_phrase_sanity_check_agr(final SubLObject phrase) {
        final SubLObject dtr_count = pph_phrase.pph_phrase_dtr_count(phrase);
        SubLObject dtr_num = (SubLObject)pph_templates.ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = (SubLObject)pph_templates.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            SubLObject subj_verb_constraint;
            SubLObject new_format_string;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_templates.NIL, v_iteration = (SubLObject)pph_templates.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_templates.ONE_INTEGER)) {
                element_num = ((pph_templates.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_templates.ONE_INTEGER) : v_iteration);
                dtr = Vectors.aref(vector_var, element_num);
                subj_verb_constraint = pph_phrase.pph_phrase_agr_constraint_of_type(dtr, (SubLObject)pph_templates.$kw101$SUBJECT_VERB);
                if (pph_templates.NIL != pph_utilities.pph_agr_constraint_p(subj_verb_constraint) && pph_templates.NIL == pph_phrase.pph_conditional_phrase_p(phrase) && pph_templates.NIL != pph_utilities.pph_nth_phrase_p(pph_utilities.pph_agr_constraint_target(subj_verb_constraint)) && pph_templates.NIL != pph_bad_nth_phraseP(pph_utilities.pph_agr_constraint_target(subj_verb_constraint), dtr_count)) {
                    new_format_string = Sequences.cconcatenate((SubLObject)pph_templates.$str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_templates.ONE_INTEGER), pph_templates.$str1$__, format_nil.format_nil_a_no_copy((SubLObject)pph_templates.$str102$Bad_Nth_phrase___S__Dtr_count_is_) });
                    pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(subj_verb_constraint, dtr_count));
                }
                if (pph_templates.NIL != pph_phrase.pph_phrase_has_dtrsP(dtr)) {
                    pph_phrase_sanity_check_agr(dtr);
                }
                dtr_num = Numbers.add(dtr_num, (SubLObject)pph_templates.ONE_INTEGER);
            }
        }
        return (SubLObject)pph_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 32828L)
    public static SubLObject pph_bad_nth_phraseP(final SubLObject nth_phrase, final SubLObject dtr_count) {
        return Numbers.numGE(pph_utilities.pph_nth_phrase_num(nth_phrase), dtr_count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 33036L)
    public static SubLObject pph_phrase_dereference_nth_phrases(final SubLObject phrase) {
        SubLObject dtr_num = (SubLObject)pph_templates.ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = (SubLObject)pph_templates.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            SubLObject phrase_agr;
            SubLObject relative_constraint;
            SubLObject logical_mother;
            SubLObject agr_target;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_templates.NIL, v_iteration = (SubLObject)pph_templates.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_templates.ONE_INTEGER)) {
                element_num = ((pph_templates.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_templates.ONE_INTEGER) : v_iteration);
                dtr = Vectors.aref(vector_var, element_num);
                phrase_agr = pph_phrase.pph_phrase_agr(dtr);
                if (pph_templates.NIL != pph_data_structures.pph_phrase_agr_p(phrase_agr)) {
                    relative_constraint = pph_data_structures.pph_phrase_agr_relative_constraint(phrase_agr);
                    logical_mother = pph_phrase.pph_phrase_logical_mother(dtr);
                    if (pph_templates.NIL != pph_phrase.pph_phrase_p(logical_mother, (SubLObject)pph_templates.UNPROVIDED) && pph_templates.NIL != pph_utilities.pph_agr_constraint_p(relative_constraint)) {
                        agr_target = pph_utilities.pph_agr_constraint_target(relative_constraint);
                        if (pph_templates.NIL != pph_utilities.pph_nth_phrase_p(agr_target)) {
                            pph_phrase_dereference_nth_phrase(dtr, phrase, agr_target, logical_mother, relative_constraint);
                        }
                    }
                }
                if (pph_templates.NIL != pph_phrase.pph_phrase_has_dtrsP(dtr)) {
                    pph_phrase_dereference_nth_phrases(dtr);
                }
                dtr_num = Numbers.add(dtr_num, (SubLObject)pph_templates.ONE_INTEGER);
            }
        }
        return (SubLObject)pph_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 33873L)
    public static SubLObject pph_phrase_dereference_nth_phrase(final SubLObject dtr, final SubLObject phrase, final SubLObject agr_target, SubLObject logical_mother, final SubLObject relative_constraint) {
        if (pph_templates.$kw101$SUBJECT_VERB == pph_utilities.pph_agr_constraint_type(relative_constraint)) {
            logical_mother = pph_phrase.pph_verb_find_sentential_mother(dtr);
        }
        final SubLObject absolute_constraints = pph_utilities.pph_nth_phrase_constraints(agr_target);
        final SubLObject dereferenced_agr_target = pph_phrase.pph_phrase_nth_dtr(logical_mother, pph_utilities.pph_nth_phrase_num(agr_target));
        if (dereferenced_agr_target.eql(dtr)) {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_templates.$str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_templates.ONE_INTEGER), pph_templates.$str1$__, format_nil.format_nil_a_no_copy((SubLObject)pph_templates.$str103$Phrase_specified_to_agree_with_it) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(dtr));
        }
        else if (pph_templates.NIL == pph_phrase.pph_phrase_p(dereferenced_agr_target, (SubLObject)pph_templates.UNPROVIDED)) {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_templates.$str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_templates.TWO_INTEGER), pph_templates.$str1$__, format_nil.format_nil_a_no_copy((SubLObject)pph_templates.$str104$Can_t_dereference__S_in____S) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(agr_target, phrase));
        }
        else if (pph_templates.NIL != pph_phrase.pph_phrase_has_agr_constraint_type_p(dereferenced_agr_target, pph_utilities.pph_agr_constraint_type(relative_constraint))) {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_templates.$str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_templates.ONE_INTEGER), pph_templates.$str1$__, format_nil.format_nil_a_no_copy((SubLObject)pph_templates.$str105$Potentially_recursive_agr___S____) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(pph_phrase.pph_phrase_agr(dtr), dereferenced_agr_target));
        }
        else {
            if (pph_templates.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_templates.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_templates.T, (SubLObject)pph_templates.$str106$Dereferenced__S_to__S, agr_target, dereferenced_agr_target, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
            }
            pph_phrase.pph_phrase_set_relative_agr_target(dtr, dereferenced_agr_target);
            pph_phrase.pph_phrase_add_agr_preds(dtr, absolute_constraints, (SubLObject)pph_templates.UNPROVIDED);
        }
        return dtr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 35048L)
    public static SubLObject pph_head_dtr_nautP(SubLObject sub_phrase_cycl) {
        if (pph_templates.NIL == term.nautP(sub_phrase_cycl, (SubLObject)pph_templates.UNPROVIDED)) {
            return (SubLObject)pph_templates.NIL;
        }
        sub_phrase_cycl = pph_expand_phrase_nauts_top_level(sub_phrase_cycl, (SubLObject)pph_templates.UNPROVIDED);
        final SubLObject fn = cycl_utilities.nat_functor(sub_phrase_cycl);
        if (pph_templates.NIL != kb_utilities.kbeq(fn, pph_functions.headwordofphrasefn())) {
            return (SubLObject)pph_templates.T;
        }
        if (pph_templates.NIL != kb_utilities.kbeq(fn, pph_functions.phraseformfn()) || pph_templates.NIL != kb_utilities.kbeq(fn, pph_functions.phrasecyclfn())) {
            return pph_head_dtr_nautP(cycl_utilities.nat_arg2(sub_phrase_cycl, (SubLObject)pph_templates.UNPROVIDED));
        }
        if (pph_templates.NIL != kb_utilities.kbeq(fn, pph_functions.conditionalphrasefn())) {
            return Types.sublisp_null(list_utilities.find_if_not((SubLObject)pph_templates.$sym107$PPH_HEAD_DTR_NAUT_, cycl_utilities.nat_args(sub_phrase_cycl, (SubLObject)pph_templates.UNPROVIDED).rest(), (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED));
        }
        if (pph_templates.NIL != kb_utilities.kbeq(fn, pph_functions.nlconjunctionfn()) || pph_templates.NIL != kb_utilities.kbeq(fn, pph_functions.nldisjunctionfn())) {
            return Types.sublisp_null(list_utilities.find_if_not((SubLObject)pph_templates.$sym107$PPH_HEAD_DTR_NAUT_, cycl_utilities.nat_args(sub_phrase_cycl, (SubLObject)pph_templates.UNPROVIDED), (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED));
        }
        return (SubLObject)pph_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 35848L)
    public static SubLObject pph_remove_head_dtr_marker(SubLObject sub_phrase_cycl) {
        sub_phrase_cycl = pph_expand_phrase_nauts_top_level(sub_phrase_cycl, (SubLObject)pph_templates.UNPROVIDED);
        final SubLObject fn = cycl_utilities.nat_function(sub_phrase_cycl);
        if (pph_templates.NIL != kb_utilities.kbeq(fn, pph_functions.headwordofphrasefn())) {
            return pph_remove_head_dtr_marker(cycl_utilities.nat_arg1(sub_phrase_cycl, (SubLObject)pph_templates.UNPROVIDED));
        }
        if (pph_templates.NIL != kb_utilities.kbeq(fn, pph_functions.phraseformfn())) {
            return (SubLObject)ConsesLow.list(fn, cycl_utilities.nat_arg1(sub_phrase_cycl, (SubLObject)pph_templates.UNPROVIDED), pph_remove_head_dtr_marker(cycl_utilities.nat_arg2(sub_phrase_cycl, (SubLObject)pph_templates.UNPROVIDED)));
        }
        return sub_phrase_cycl;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 36324L)
    public static SubLObject pph_phrase_from_phrase_form_naut(final SubLObject phrase_naut, SubLObject arg_position_map) {
        if (arg_position_map == pph_templates.UNPROVIDED) {
            arg_position_map = (SubLObject)pph_templates.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject constraint = cycl_utilities.nat_arg1(phrase_naut, (SubLObject)pph_templates.UNPROVIDED);
        final SubLObject kernel_arg_position_map = pph_utilities.pph_figure_new_arg_position_map(arg_position_map, (SubLObject)pph_templates.$kw108$ARG2);
        SubLObject phrase = pph_phrase_from_gentemplate_phrase(cycl_utilities.nat_arg2(phrase_naut, (SubLObject)pph_templates.UNPROVIDED), kernel_arg_position_map);
        if (pph_templates.NIL == phrase) {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_templates.$str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_templates.ONE_INTEGER), pph_templates.$str1$__, format_nil.format_nil_a_no_copy((SubLObject)pph_templates.$str100$Couldn_t_make_PPH_phrase_from__S) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(cycl_utilities.nat_arg2(phrase_naut, (SubLObject)pph_templates.UNPROVIDED)));
        }
        else {
            if (pph_templates.NIL != pph_phrase.pph_cycl_phrase_p(phrase)) {
                return phrase;
            }
            if (pph_templates.NIL != pph_utilities.pph_speech_partP(constraint) || pph_templates.NIL != pph_utilities.pph_collectionP(constraint)) {
                pph_phrase.pph_phrase_update_category(phrase, constraint, (SubLObject)pph_templates.T, (SubLObject)pph_templates.NIL);
                if (pph_templates.NIL == pph_utilities.pph_genl_categoryP(pph_phrase.pph_phrase_category(phrase, (SubLObject)pph_templates.NIL), constraint, (SubLObject)pph_templates.UNPROVIDED) && pph_templates.NIL == pph_utilities.pph_genl_categoryP(pph_phrase.pph_phrase_category(phrase, (SubLObject)pph_templates.T), constraint, (SubLObject)pph_templates.UNPROVIDED)) {
                    if (pph_templates.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_templates.ONE_INTEGER) && pph_templates.NIL == pph_error.suppress_pph_warningsP()) {
                        Errors.warn((SubLObject)pph_templates.$str109$Incompatible_constraint__S_on__S, constraint, phrase);
                        streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                    }
                    phrase = (SubLObject)pph_templates.NIL;
                }
            }
            else if (pph_templates.NIL != pph_utilities.pph_speech_part_predP(constraint) || pph_templates.NIL != pph_utilities.pph_name_string_predP(constraint)) {
                pph_phrase.pph_phrase_add_agr_pred(phrase, constraint);
            }
            else if (pph_templates.NIL != term.nautP(constraint, (SubLObject)pph_templates.UNPROVIDED) && cycl_utilities.nat_function(constraint).eql(constants_high.find_constant((SubLObject)pph_templates.$str110$NthPhraseAgrFn))) {
                final SubLObject new_agr_target = pph_utilities.new_pph_nth_phrase(number_utilities.f_1_(cycl_utilities.nat_arg1(constraint, (SubLObject)pph_templates.UNPROVIDED)), (SubLObject)pph_templates.UNPROVIDED);
                final SubLObject new_agr = pph_utilities.new_pph_agr_constraint((SubLObject)pph_templates.$kw111$PEER, new_agr_target);
                pph_phrase.pph_phrase_set_agr_constraint(phrase, new_agr, (SubLObject)pph_templates.UNPROVIDED);
            }
            else {
                if (pph_templates.NIL == constraint) {
                    if (pph_templates.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_templates.ONE_INTEGER) && pph_templates.NIL == pph_error.suppress_pph_warningsP()) {
                        Errors.warn((SubLObject)pph_templates.$str112$__Warning__null_constraint_on__S_, phrase_naut);
                        streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                    }
                    return phrase;
                }
                final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_templates.$str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_templates.ONE_INTEGER), pph_templates.$str1$__, format_nil.format_nil_a_no_copy((SubLObject)pph_templates.$str113$Don_t_know_what_to_do_with__S_con) });
                pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(constraint));
            }
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 38136L)
    public static SubLObject pph_phrase_from_phrase_cycl_fn_naut(final SubLObject phrase_naut, SubLObject arg_position_map) {
        if (arg_position_map == pph_templates.UNPROVIDED) {
            arg_position_map = (SubLObject)pph_templates.NIL;
        }
        final SubLObject cycl = cycl_utilities.nat_arg1(phrase_naut, (SubLObject)pph_templates.UNPROVIDED);
        final SubLObject kernel_arg_position_map = pph_utilities.pph_figure_new_arg_position_map(arg_position_map, (SubLObject)pph_templates.$kw108$ARG2);
        final SubLObject phrase = pph_phrase_from_gentemplate_phrase(cycl_utilities.nat_arg2(phrase_naut, (SubLObject)pph_templates.UNPROVIDED), kernel_arg_position_map);
        pph_phrase.pph_phrase_set_cycl(phrase, cycl);
        pph_phrase.pph_phrase_set_output_list_cycl(phrase, cycl);
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 38618L)
    public static SubLObject pph_phrase_from_best_verb_form_for_subject_naut(final SubLObject phrase_naut) {
        final SubLObject phrase = pph_data_structures.new_pph_phrase((SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
        pph_phrase.pph_phrase_set_wu(phrase, cycl_utilities.nat_arg1(phrase_naut, (SubLObject)pph_templates.UNPROVIDED));
        pph_phrase.pph_phrase_set_category(phrase, pph_templates.$const114$Verb, (SubLObject)pph_templates.UNPROVIDED);
        pph_phrase_resolution.pph_phrase_reserve_matrix_arg0_cycl(phrase);
        final SubLObject subj_phrase = pph_expand_phrase_nauts_top_level(cycl_utilities.nat_arg2(phrase_naut, (SubLObject)pph_templates.UNPROVIDED), (SubLObject)pph_templates.UNPROVIDED);
        final SubLObject nth_phrase_agrP = nth_phrase_naut_p(subj_phrase);
        final SubLObject agr_target = (pph_templates.NIL != nth_phrase_agrP) ? pph_utilities.new_pph_nth_phrase(number_utilities.f_1_(cycl_utilities.nat_arg2(subj_phrase, (SubLObject)pph_templates.UNPROVIDED)), (SubLObject)pph_templates.UNPROVIDED) : pph_phrase_from_gentemplate_phrase(subj_phrase, (SubLObject)pph_templates.UNPROVIDED);
        final SubLObject agr_constraint = pph_utilities.new_pph_agr_constraint((SubLObject)pph_templates.$kw101$SUBJECT_VERB, agr_target);
        pph_phrase.pph_phrase_set_agr_constraint(phrase, agr_constraint, (SubLObject)pph_templates.UNPROVIDED);
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 39384L)
    public static SubLObject nth_phrase_naut_p(final SubLObject phrase_naut) {
        final SubLObject expanded_phrase = pph_expand_phrase_nauts_top_level(phrase_naut, (SubLObject)pph_templates.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_utilities.nat_function(expanded_phrase).eql(pph_templates.$const65$TheNthFn) && cycl_utilities.nat_arg1(expanded_phrase, (SubLObject)pph_templates.UNPROVIDED).eql(pph_templates.$const71$SententialConstituent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 39639L)
    public static SubLObject pph_phrase_from_best_det_nbar_naut(final SubLObject phrase_naut, SubLObject arg_position_map) {
        if (arg_position_map == pph_templates.UNPROVIDED) {
            arg_position_map = (SubLObject)pph_templates.NIL;
        }
        final SubLObject det_dtr = pph_phrase_from_gentemplate_phrase(el_utilities.make_binary_formula(pph_functions.phraseformfn(), czer_main.canonicalize_term((SubLObject)pph_templates.$list115, (SubLObject)pph_templates.UNPROVIDED), cycl_utilities.nat_arg1(phrase_naut, (SubLObject)pph_templates.UNPROVIDED)), (SubLObject)pph_templates.UNPROVIDED);
        final SubLObject nbar_arg_position_map = pph_utilities.pph_figure_new_arg_position_map(arg_position_map, (SubLObject)pph_templates.$kw108$ARG2);
        final SubLObject nbar_dtr = pph_phrasify_phrase_naut(cycl_utilities.nat_arg2(phrase_naut, (SubLObject)pph_templates.UNPROVIDED), nbar_arg_position_map);
        return pph_new_np_from_det_and_nbar(det_dtr, nbar_dtr, arg_position_map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 40227L)
    public static SubLObject pph_new_np_from_det_and_nbar(final SubLObject det_dtr, final SubLObject nbar_dtr, SubLObject arg_position_map) {
        if (arg_position_map == pph_templates.UNPROVIDED) {
            arg_position_map = (SubLObject)pph_templates.NIL;
        }
        final SubLObject phrase = pph_data_structures.new_pph_phrase((SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
        pph_phrase.pph_phrase_set_arg_position_map(phrase, arg_position_map);
        pph_phrase.pph_phrase_set_category_to_np(phrase);
        pph_phrase.pph_phrase_set_head_dtr_num(phrase, (SubLObject)pph_templates.ONE_INTEGER);
        pph_phrase.pph_phrase_maybe_reserve_for_arg0(det_dtr);
        pph_phrase.pph_phrase_maybe_reserve_for_arg0(nbar_dtr);
        pph_phrase.pph_phrase_update_category(det_dtr, pph_templates.$const116$Determiner, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
        pph_phrase.pph_phrase_update_category(nbar_dtr, narts_high.find_nart((SubLObject)pph_templates.$list117), (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
        if (pph_templates.NIL != pph_phrase.pph_phrase_doneP(det_dtr)) {
            final SubLObject det_string_agr_preds = pph_agr_of_det_string(pph_phrase.pph_phrase_string(det_dtr, (SubLObject)pph_templates.UNPROVIDED));
            final SubLObject agr_preds = (SubLObject)((pph_templates.NIL != det_string_agr_preds) ? det_string_agr_preds : pph_templates.$list118);
            pph_phrase.pph_phrase_update_agr_preds(nbar_dtr, agr_preds, (SubLObject)pph_templates.T);
            pph_phrase.pph_phrase_set_agr_constraint(det_dtr, pph_utilities.new_pph_agr_constraint((SubLObject)pph_templates.$kw119$DET_NBAR, pph_utilities.new_pph_nth_phrase((SubLObject)pph_templates.ONE_INTEGER, (SubLObject)pph_templates.UNPROVIDED)), (SubLObject)pph_templates.UNPROVIDED);
        }
        else if (pph_templates.NIL == pph_utilities.pph_dont_care_agr_constraint_p(pph_data_structures.pph_phrase_agr_absolute_constraint(pph_phrase.pph_phrase_agr(det_dtr)))) {
            pph_phrase.pph_phrase_set_agr_constraint(nbar_dtr, pph_utilities.new_pph_agr_constraint((SubLObject)pph_templates.$kw119$DET_NBAR, pph_utilities.new_pph_nth_phrase((SubLObject)pph_templates.ZERO_INTEGER, (SubLObject)pph_templates.UNPROVIDED)), (SubLObject)pph_templates.UNPROVIDED);
        }
        else {
            pph_phrase.pph_phrase_set_agr_constraint(det_dtr, pph_utilities.new_pph_agr_constraint((SubLObject)pph_templates.$kw119$DET_NBAR, pph_utilities.new_pph_nth_phrase((SubLObject)pph_templates.ONE_INTEGER, (SubLObject)pph_templates.UNPROVIDED)), (SubLObject)pph_templates.UNPROVIDED);
            if (pph_templates.NIL == cycl_grammar.el_variable_p(pph_phrase.pph_phrase_cycl(nbar_dtr, (SubLObject)pph_templates.UNPROVIDED)) && !pph_phrase.pph_phrase_cycl(nbar_dtr, (SubLObject)pph_templates.UNPROVIDED).isKeyword()) {
                final SubLObject det_dtr_agr_preds = pph_det_phrase_agr_preds(det_dtr);
                pph_phrase.pph_phrase_set_agr_preds(nbar_dtr, pph_utilities.pph_filter_preds(det_dtr_agr_preds, pph_phrase.pph_phrase_agr_preds(nbar_dtr, (SubLObject)pph_templates.UNPROVIDED), (SubLObject)pph_templates.UNPROVIDED), (SubLObject)pph_templates.UNPROVIDED);
            }
        }
        pph_phrase.set_pph_phrase_dtrs_from_list(phrase, (SubLObject)ConsesLow.list(det_dtr, nbar_dtr), (SubLObject)pph_templates.UNPROVIDED);
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 41979L)
    public static SubLObject pph_agr_of_det_string(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject agr = (SubLObject)pph_templates.NIL;
        final SubLObject local_state = pph_macros.find_or_create_pph_external_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                agr = lexicon_accessors.agr_of_det_string(string);
            }
            finally {
                final SubLObject _prev_bind_0_$130 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_templates.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$130, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return agr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 42168L)
    public static SubLObject pph_det_phrase_agr_preds(final SubLObject det_phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject phrase_agr = pph_phrase.pph_phrase_agr(det_phrase);
        final SubLObject absolute_constraint = pph_data_structures.pph_phrase_agr_absolute_constraint(phrase_agr);
        SubLObject agr_preds = (SubLObject)pph_templates.$kw120$ANY;
        if (pph_templates.NIL == pph_utilities.pph_dont_care_agr_constraint_p(absolute_constraint)) {
            final SubLObject pcase_var = pph_utilities.pph_agr_constraint_type(absolute_constraint);
            if (pcase_var.eql((SubLObject)pph_templates.$kw121$NL_PREDS)) {
                agr_preds = pph_utilities.pph_agr_constraint_target(absolute_constraint);
            }
            else if (pcase_var.eql((SubLObject)pph_templates.$kw122$POS_PRED)) {
                agr_preds = (SubLObject)ConsesLow.list(pph_utilities.pph_agr_constraint_target(absolute_constraint));
            }
            return agr_preds;
        }
        final SubLObject wu = pph_phrase.pph_phrase_wu(det_phrase, (SubLObject)pph_templates.UNPROVIDED);
        final SubLObject wu_preds = (SubLObject)((pph_templates.NIL != wu) ? lexicon_accessors.agreement_lookup(wu) : pph_templates.NIL);
        if (pph_templates.NIL != wu) {
            return (SubLObject)((pph_templates.NIL != wu_preds) ? wu_preds : pph_templates.$list118);
        }
        final SubLObject cycl = pph_phrase.pph_phrase_cycl(det_phrase, (SubLObject)pph_templates.UNPROVIDED);
        if (pph_templates.NIL != pph_phrase.pph_known_cycl_p(cycl) && pph_templates.NIL == pph_utilities.pph_arg_position_specifierP(cycl)) {
            final SubLObject preds = pph_agr_preds_for_det_cycl(cycl);
            if (pph_templates.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_templates.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_templates.T, (SubLObject)pph_templates.$str123$__Agr_preds_for_the_determiner__S, cycl, preds, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
            }
            return preds;
        }
        if (pph_templates.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_templates.ONE_INTEGER) && pph_templates.NIL == pph_error.suppress_pph_warningsP()) {
            Errors.warn((SubLObject)pph_templates.$str124$Using_default_agr_preds__S_for__S, agr_preds, det_phrase);
            streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        }
        return agr_preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 43299L)
    public static SubLObject pph_agr_preds_for_det_cycl_internal(final SubLObject cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cycl.isNumber()) {
            return (SubLObject)ConsesLow.list(pph_utilities.numeric_det_agr_pred(cycl));
        }
        if (pph_templates.NIL != subl_promotions.memberP(cycl_utilities.nat_function(cycl), (SubLObject)pph_templates.$list126, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED)) {
            return pph_agr_preds_for_det_cycl(cycl_utilities.nat_arg1(cycl, (SubLObject)pph_templates.UNPROVIDED));
        }
        SubLObject preds = (SubLObject)pph_templates.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = kb_mapping.gather_gaf_arg_index_with_predicate(cycl, (SubLObject)pph_templates.FOUR_INTEGER, pph_templates.$const127$denotation, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
            SubLObject denotation_assertion = (SubLObject)pph_templates.NIL;
            denotation_assertion = cdolist_list_var.first();
            while (pph_templates.NIL != cdolist_list_var) {
                if (pph_templates.NIL != pph_utilities.pph_genl_posP(assertions_high.gaf_arg2(denotation_assertion), pph_templates.$const116$Determiner, (SubLObject)pph_templates.UNPROVIDED)) {
                    SubLObject cdolist_list_var_$131 = lexicon_accessors.agreement_lookup(assertions_high.gaf_arg1(denotation_assertion));
                    SubLObject pred = (SubLObject)pph_templates.NIL;
                    pred = cdolist_list_var_$131.first();
                    while (pph_templates.NIL != cdolist_list_var_$131) {
                        final SubLObject item_var = pred;
                        if (pph_templates.NIL == conses_high.member(item_var, preds, Symbols.symbol_function((SubLObject)pph_templates.EQL), Symbols.symbol_function((SubLObject)pph_templates.IDENTITY))) {
                            preds = (SubLObject)ConsesLow.cons(item_var, preds);
                        }
                        cdolist_list_var_$131 = cdolist_list_var_$131.rest();
                        pred = cdolist_list_var_$131.first();
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                denotation_assertion = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return remove_spec_preds(preds, (SubLObject)pph_templates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 43299L)
    public static SubLObject pph_agr_preds_for_det_cycl(final SubLObject cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_templates.NIL;
        if (pph_templates.NIL == v_memoization_state) {
            return pph_agr_preds_for_det_cycl_internal(cycl);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_templates.$sym125$PPH_AGR_PREDS_FOR_DET_CYCL, (SubLObject)pph_templates.UNPROVIDED);
        if (pph_templates.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_templates.$sym125$PPH_AGR_PREDS_FOR_DET_CYCL, (SubLObject)pph_templates.ONE_INTEGER, (SubLObject)pph_templates.NIL, (SubLObject)pph_templates.EQUAL, (SubLObject)pph_templates.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_templates.$sym125$PPH_AGR_PREDS_FOR_DET_CYCL, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, cycl, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_agr_preds_for_det_cycl_internal(cycl)));
            memoization_state.caching_state_put(caching_state, cycl, results, (SubLObject)pph_templates.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 43965L)
    public static SubLObject remove_spec_preds(final SubLObject preds, SubLObject key) {
        if (key == pph_templates.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)pph_templates.IDENTITY);
        }
        if (!preds.isList()) {
            return (SubLObject)pph_templates.NIL;
        }
        SubLObject ans = (SubLObject)pph_templates.NIL;
        SubLObject cdolist_list_var = preds;
        SubLObject pred = (SubLObject)pph_templates.NIL;
        pred = cdolist_list_var.first();
        while (pph_templates.NIL != cdolist_list_var) {
            final SubLObject others = Sequences.remove(pred, preds, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
            if (pph_templates.NIL == subl_promotions.memberP(Functions.funcall(key, pred), others, (SubLObject)pph_templates.$sym128$PPH_GENL_POS_PRED_, key)) {
                ans = (SubLObject)ConsesLow.cons(pred, ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 44349L)
    public static SubLObject pph_template_constraint_from_assertion(final SubLObject as) {
        SubLObject constraint_formula = (SubLObject)pph_templates.NIL;
        final SubLObject pcase_var = assertions_high.gaf_arg0(as);
        if (pcase_var.eql(pph_templates.$const129$genFormat_ArgFixed)) {
            final SubLObject constrained_arg_num = assertions_high.gaf_arg2(as);
            final SubLObject constrained_arg_key = at_utilities.get_generic_arg(constrained_arg_num);
            final SubLObject target = assertions_high.gaf_arg3(as);
            constraint_formula = (SubLObject)ConsesLow.list(pph_templates.$const130$equals, constrained_arg_key, target);
        }
        else if (pcase_var.eql(pph_templates.$const85$genTemplate_Constrained)) {
            constraint_formula = assertions_high.gaf_arg2(as);
        }
        return constraint_formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 44925L)
    public static SubLObject add_gen_template_to_sets(final SubLObject gen_template, final SubLObject sets) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_sets = (SubLObject)pph_templates.NIL;
        thread.resetMultipleValues();
        final SubLObject set_num = place_gen_template_in_sets(gen_template, sets);
        final SubLObject new_setP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject i;
        for (i = (SubLObject)pph_templates.NIL, i = (SubLObject)pph_templates.ZERO_INTEGER; i.numL(set_num); i = Numbers.add(i, (SubLObject)pph_templates.ONE_INTEGER)) {
            new_sets = (SubLObject)ConsesLow.cons(ConsesLow.nth(i, sets), new_sets);
        }
        if (pph_templates.NIL != new_setP) {
            final SubLObject new_set = set.new_set((SubLObject)pph_templates.EQUAL, (SubLObject)pph_templates.UNPROVIDED);
            set.set_add(gen_template, new_set);
            new_sets = (SubLObject)ConsesLow.cons(new_set, new_sets);
        }
        else {
            set.set_add(gen_template, ConsesLow.nth(set_num, sets));
        }
        SubLObject cdolist_list_var = Sequences.subseq(sets, set_num, (SubLObject)pph_templates.UNPROVIDED);
        SubLObject v_set = (SubLObject)pph_templates.NIL;
        v_set = cdolist_list_var.first();
        while (pph_templates.NIL != cdolist_list_var) {
            new_sets = (SubLObject)ConsesLow.cons(v_set, new_sets);
            cdolist_list_var = cdolist_list_var.rest();
            v_set = cdolist_list_var.first();
        }
        return Sequences.nreverse(new_sets);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 45495L)
    public static SubLObject remove_gen_template_as_from_sets(final SubLObject gen_template_as, final SubLObject sets) {
        SubLObject cdolist_list_var = sets;
        SubLObject v_set = (SubLObject)pph_templates.NIL;
        v_set = cdolist_list_var.first();
        while (pph_templates.NIL != cdolist_list_var) {
            SubLObject gen_templates_to_remove = (SubLObject)pph_templates.NIL;
            final SubLObject set_contents_var = set.do_set_internal(v_set);
            SubLObject basis_object;
            SubLObject state;
            SubLObject gen_template;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)pph_templates.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); pph_templates.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                gen_template = set_contents.do_set_contents_next(basis_object, state);
                if (pph_templates.NIL != set_contents.do_set_contents_element_validP(state, gen_template) && gen_template_as.eql(pph_data_structures.get_gen_template_assertion(gen_template))) {
                    gen_templates_to_remove = (SubLObject)ConsesLow.cons(gen_template, gen_templates_to_remove);
                }
            }
            SubLObject cdolist_list_var_$132 = gen_templates_to_remove;
            SubLObject gen_template2 = (SubLObject)pph_templates.NIL;
            gen_template2 = cdolist_list_var_$132.first();
            while (pph_templates.NIL != cdolist_list_var_$132) {
                set.set_remove(gen_template2, v_set);
                cdolist_list_var_$132 = cdolist_list_var_$132.rest();
                gen_template2 = cdolist_list_var_$132.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_set = cdolist_list_var.first();
        }
        return sets;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 45958L)
    public static SubLObject place_gen_template_in_sets(final SubLObject gen_template, final SubLObject sets) {
        SubLObject new_setP = Types.sublisp_null(sets);
        SubLObject set_num = (SubLObject)((pph_templates.NIL != new_setP) ? pph_templates.ZERO_INTEGER : pph_templates.NIL);
        SubLObject list_var = (SubLObject)pph_templates.NIL;
        SubLObject v_set = (SubLObject)pph_templates.NIL;
        SubLObject i = (SubLObject)pph_templates.NIL;
        list_var = sets;
        v_set = list_var.first();
        for (i = (SubLObject)pph_templates.ZERO_INTEGER; pph_templates.NIL == set_num && pph_templates.NIL != list_var; list_var = list_var.rest(), v_set = list_var.first(), i = Numbers.add((SubLObject)pph_templates.ONE_INTEGER, i)) {
            if (pph_templates.NIL == gen_template_too_broadP(gen_template, v_set)) {
                if (pph_templates.NIL != gen_template_too_specificP(gen_template, v_set)) {
                    set_num = i;
                    new_setP = (SubLObject)pph_templates.T;
                }
                else if (pph_templates.NIL == gen_template_dispreferredP(gen_template, v_set)) {
                    if (pph_templates.NIL != gen_template_preferredP(gen_template, v_set)) {
                        set_num = i;
                        new_setP = (SubLObject)pph_templates.T;
                    }
                    else {
                        set_num = i;
                    }
                }
            }
        }
        if (!set_num.isInteger()) {
            set_num = Sequences.length(sets);
            new_setP = (SubLObject)pph_templates.T;
        }
        return Values.values(set_num, new_setP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 47046L)
    public static SubLObject gen_template_too_specificP(final SubLObject gen_template, final SubLObject v_set) {
        SubLObject doneP = (SubLObject)pph_templates.NIL;
        SubLObject ans = (SubLObject)pph_templates.NIL;
        final SubLObject set_contents_var = set.do_set_internal(v_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject elem;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)pph_templates.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); pph_templates.NIL == doneP && pph_templates.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            elem = set_contents.do_set_contents_next(basis_object, state);
            if (pph_templates.NIL != set_contents.do_set_contents_element_validP(state, elem)) {
                ans = gen_template_more_specificP(gen_template, elem);
                doneP = (SubLObject)pph_templates.T;
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 47355L)
    public static SubLObject gen_template_too_broadP(final SubLObject gen_template, final SubLObject v_set) {
        SubLObject doneP = (SubLObject)pph_templates.NIL;
        SubLObject ans = (SubLObject)pph_templates.NIL;
        final SubLObject set_contents_var = set.do_set_internal(v_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject elem;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)pph_templates.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); pph_templates.NIL == doneP && pph_templates.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            elem = set_contents.do_set_contents_next(basis_object, state);
            if (pph_templates.NIL != set_contents.do_set_contents_element_validP(state, elem)) {
                ans = gen_template_more_specificP(elem, gen_template);
                doneP = (SubLObject)pph_templates.T;
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 47661L)
    public static SubLObject gen_template_more_specificP(final SubLObject t1, final SubLObject t2) {
        final SubLObject c1 = pph_data_structures.get_gen_template_constraint(t1);
        final SubLObject c2 = pph_data_structures.get_gen_template_constraint(t2);
        return gen_template_constraint_more_specificP(c1, c2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 47917L)
    public static SubLObject gen_template_preferredP(final SubLObject gen_template, final SubLObject v_set) {
        SubLObject doneP = (SubLObject)pph_templates.NIL;
        SubLObject ans = (SubLObject)pph_templates.NIL;
        final SubLObject set_contents_var = set.do_set_internal(v_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject elem;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)pph_templates.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); pph_templates.NIL == doneP && pph_templates.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            elem = set_contents.do_set_contents_next(basis_object, state);
            if (pph_templates.NIL != set_contents.do_set_contents_element_validP(state, elem)) {
                ans = gen_template_assertion_preferredP(gen_template, elem);
                doneP = (SubLObject)pph_templates.T;
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 48225L)
    public static SubLObject gen_template_dispreferredP(final SubLObject gen_template, final SubLObject v_set) {
        SubLObject doneP = (SubLObject)pph_templates.NIL;
        SubLObject ans = (SubLObject)pph_templates.NIL;
        final SubLObject set_contents_var = set.do_set_internal(v_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject elem;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)pph_templates.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); pph_templates.NIL == doneP && pph_templates.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            elem = set_contents.do_set_contents_next(basis_object, state);
            if (pph_templates.NIL != set_contents.do_set_contents_element_validP(state, elem)) {
                ans = gen_template_assertion_preferredP(elem, gen_template);
                doneP = (SubLObject)pph_templates.T;
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 48537L)
    public static SubLObject gen_template_assertion_preferredP(final SubLObject t1, final SubLObject t2) {
        final SubLObject as1 = pph_data_structures.get_gen_template_assertion(t1);
        final SubLObject as2 = pph_data_structures.get_gen_template_assertion(t2);
        return pph_utilities.pph_prefer_assertionP(as1, as2, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 48798L)
    public static SubLObject gen_template_constraint_more_specificP(final SubLObject c1, final SubLObject c2) {
        if (pph_templates.NIL != c1 && pph_templates.NIL == c2) {
            return (SubLObject)pph_templates.T;
        }
        if (pph_templates.NIL == c1) {
            return (SubLObject)pph_templates.NIL;
        }
        if (gen_template_constraint_generality_estimate(c1).numL(gen_template_constraint_generality_estimate(c2))) {
            return (SubLObject)pph_templates.T;
        }
        if (gen_template_constraint_generality_estimate(c2).numL(gen_template_constraint_generality_estimate(c1))) {
            return (SubLObject)pph_templates.NIL;
        }
        return pph_dnf_has_more_clausesP(pph_dnf_clausal_form_cached(c1), pph_dnf_clausal_form_cached(c2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 49311L)
    public static SubLObject clear_pph_dnf_clausal_form_cached() {
        final SubLObject cs = pph_templates.$pph_dnf_clausal_form_cached_caching_state$.getGlobalValue();
        if (pph_templates.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)pph_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 49311L)
    public static SubLObject remove_pph_dnf_clausal_form_cached(final SubLObject expression) {
        return memoization_state.caching_state_remove_function_results_with_args(pph_templates.$pph_dnf_clausal_form_cached_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(expression), (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 49311L)
    public static SubLObject pph_dnf_clausal_form_cached_internal(final SubLObject expression) {
        return get_pph_dnf_clausal_form(expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 49311L)
    public static SubLObject pph_dnf_clausal_form_cached(final SubLObject expression) {
        SubLObject caching_state = pph_templates.$pph_dnf_clausal_form_cached_caching_state$.getGlobalValue();
        if (pph_templates.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)pph_templates.$sym131$PPH_DNF_CLAUSAL_FORM_CACHED, (SubLObject)pph_templates.$sym132$_PPH_DNF_CLAUSAL_FORM_CACHED_CACHING_STATE_, (SubLObject)pph_templates.$int49$1024, (SubLObject)pph_templates.EQUAL, (SubLObject)pph_templates.ONE_INTEGER, (SubLObject)pph_templates.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, expression, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_dnf_clausal_form_cached_internal(expression)));
            memoization_state.caching_state_put(caching_state, expression, results, (SubLObject)pph_templates.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 49546L)
    public static SubLObject pph_dnf_clausal_form_internal(final SubLObject expression) {
        return get_pph_dnf_clausal_form(expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 49546L)
    public static SubLObject pph_dnf_clausal_form(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_templates.NIL;
        if (pph_templates.NIL == v_memoization_state) {
            return pph_dnf_clausal_form_internal(expression);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_templates.$sym133$PPH_DNF_CLAUSAL_FORM, (SubLObject)pph_templates.UNPROVIDED);
        if (pph_templates.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_templates.$sym133$PPH_DNF_CLAUSAL_FORM, (SubLObject)pph_templates.ONE_INTEGER, (SubLObject)pph_templates.$int49$1024, (SubLObject)pph_templates.EQUAL, (SubLObject)pph_templates.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_templates.$sym133$PPH_DNF_CLAUSAL_FORM, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, expression, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_dnf_clausal_form_internal(expression)));
            memoization_state.caching_state_put(caching_state, expression, results, (SubLObject)pph_templates.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 49678L)
    public static SubLObject get_pph_dnf_clausal_form(final SubLObject expression) {
        SubLObject v_clauses = (SubLObject)pph_templates.NIL;
        if (pph_templates.NIL != el_utilities.el_conjunction_p(expression)) {
            SubLObject neg_lits = (SubLObject)pph_templates.NIL;
            SubLObject pos_lits = (SubLObject)pph_templates.NIL;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(expression, (SubLObject)pph_templates.$kw67$IGNORE);
            SubLObject conjunct = (SubLObject)pph_templates.NIL;
            conjunct = cdolist_list_var.first();
            while (pph_templates.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$133 = pph_dnf_clausal_form(conjunct);
                SubLObject conjunct_clause = (SubLObject)pph_templates.NIL;
                conjunct_clause = cdolist_list_var_$133.first();
                while (pph_templates.NIL != cdolist_list_var_$133) {
                    SubLObject cdolist_list_var_$134 = clauses.neg_lits(conjunct_clause);
                    SubLObject neg_lit = (SubLObject)pph_templates.NIL;
                    neg_lit = cdolist_list_var_$134.first();
                    while (pph_templates.NIL != cdolist_list_var_$134) {
                        neg_lits = (SubLObject)ConsesLow.cons(neg_lit, neg_lits);
                        cdolist_list_var_$134 = cdolist_list_var_$134.rest();
                        neg_lit = cdolist_list_var_$134.first();
                    }
                    SubLObject cdolist_list_var_$135 = clauses.pos_lits(conjunct_clause);
                    SubLObject pos_lit = (SubLObject)pph_templates.NIL;
                    pos_lit = cdolist_list_var_$135.first();
                    while (pph_templates.NIL != cdolist_list_var_$135) {
                        pos_lits = (SubLObject)ConsesLow.cons(pos_lit, pos_lits);
                        cdolist_list_var_$135 = cdolist_list_var_$135.rest();
                        pos_lit = cdolist_list_var_$135.first();
                    }
                    cdolist_list_var_$133 = cdolist_list_var_$133.rest();
                    conjunct_clause = cdolist_list_var_$133.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                conjunct = cdolist_list_var.first();
            }
            v_clauses = (SubLObject)ConsesLow.cons(clauses.make_clause(neg_lits, pos_lits), v_clauses);
        }
        else if (pph_templates.NIL != el_utilities.el_disjunction_p(expression)) {
            SubLObject cdolist_list_var2;
            final SubLObject args2 = cdolist_list_var2 = cycl_utilities.formula_args(expression, (SubLObject)pph_templates.$kw67$IGNORE);
            SubLObject disjunct = (SubLObject)pph_templates.NIL;
            disjunct = cdolist_list_var2.first();
            while (pph_templates.NIL != cdolist_list_var2) {
                SubLObject neg_lits2 = (SubLObject)pph_templates.NIL;
                SubLObject pos_lits2 = (SubLObject)pph_templates.NIL;
                SubLObject cdolist_list_var_$136 = pph_dnf_clausal_form(disjunct);
                SubLObject disjunct_clause = (SubLObject)pph_templates.NIL;
                disjunct_clause = cdolist_list_var_$136.first();
                while (pph_templates.NIL != cdolist_list_var_$136) {
                    SubLObject cdolist_list_var_$137 = clauses.neg_lits(disjunct_clause);
                    SubLObject neg_lit = (SubLObject)pph_templates.NIL;
                    neg_lit = cdolist_list_var_$137.first();
                    while (pph_templates.NIL != cdolist_list_var_$137) {
                        neg_lits2 = (SubLObject)ConsesLow.cons(neg_lit, neg_lits2);
                        cdolist_list_var_$137 = cdolist_list_var_$137.rest();
                        neg_lit = cdolist_list_var_$137.first();
                    }
                    SubLObject cdolist_list_var_$138 = clauses.pos_lits(disjunct_clause);
                    SubLObject pos_lit = (SubLObject)pph_templates.NIL;
                    pos_lit = cdolist_list_var_$138.first();
                    while (pph_templates.NIL != cdolist_list_var_$138) {
                        pos_lits2 = (SubLObject)ConsesLow.cons(pos_lit, pos_lits2);
                        cdolist_list_var_$138 = cdolist_list_var_$138.rest();
                        pos_lit = cdolist_list_var_$138.first();
                    }
                    cdolist_list_var_$136 = cdolist_list_var_$136.rest();
                    disjunct_clause = cdolist_list_var_$136.first();
                }
                v_clauses = (SubLObject)ConsesLow.cons(clauses.make_clause(neg_lits2, pos_lits2), v_clauses);
                cdolist_list_var2 = cdolist_list_var2.rest();
                disjunct = cdolist_list_var2.first();
            }
        }
        else if (pph_templates.NIL != el_utilities.el_negation_p(expression)) {
            final SubLObject negated = cycl_utilities.formula_arg1(expression, (SubLObject)pph_templates.UNPROVIDED);
            final SubLObject negated_clauses = pph_dnf_clausal_form(negated);
            SubLObject neg_lits3 = (SubLObject)pph_templates.NIL;
            SubLObject pos_lits3 = (SubLObject)pph_templates.NIL;
            SubLObject cdolist_list_var3 = negated_clauses;
            SubLObject negated_clause = (SubLObject)pph_templates.NIL;
            negated_clause = cdolist_list_var3.first();
            while (pph_templates.NIL != cdolist_list_var3) {
                SubLObject current;
                final SubLObject datum = current = negated_clause;
                SubLObject negated_neg_lits = (SubLObject)pph_templates.NIL;
                SubLObject negated_pos_lits = (SubLObject)pph_templates.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_templates.$list134);
                negated_neg_lits = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_templates.$list134);
                negated_pos_lits = current.first();
                current = current.rest();
                if (pph_templates.NIL == current) {
                    pos_lits3 = ConsesLow.append(pos_lits3, negated_neg_lits);
                    neg_lits3 = ConsesLow.append(neg_lits3, negated_pos_lits);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_templates.$list134);
                }
                cdolist_list_var3 = cdolist_list_var3.rest();
                negated_clause = cdolist_list_var3.first();
            }
            v_clauses = (SubLObject)ConsesLow.cons(clauses.make_clause(neg_lits3, pos_lits3), v_clauses);
        }
        else {
            final SubLObject neg_lits = (SubLObject)pph_templates.NIL;
            final SubLObject pos_lits = (SubLObject)ConsesLow.list(expression);
            v_clauses = (SubLObject)ConsesLow.cons(clauses.make_clause(neg_lits, pos_lits), v_clauses);
        }
        return v_clauses;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 51190L)
    public static SubLObject gen_template_constraint_generality_estimate(final SubLObject constraint) {
        final SubLObject all_forts = cycl_utilities.expression_gather(constraint, (SubLObject)pph_templates.$sym135$FORT_P, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
        final SubLObject all_generality_estimates = Mapping.mapcar((SubLObject)pph_templates.$sym136$GENERALITY_ESTIMATE, all_forts);
        final SubLObject non_zero_generality_estimates = Sequences.remove((SubLObject)pph_templates.ZERO_INTEGER, all_generality_estimates, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
        return (SubLObject)((pph_templates.NIL == non_zero_generality_estimates) ? pph_templates.ZERO_INTEGER : number_utilities.minimum(non_zero_generality_estimates, (SubLObject)pph_templates.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 51564L)
    public static SubLObject pph_dnf_has_more_clausesP(final SubLObject dnf1, final SubLObject dnf2) {
        return Numbers.numG(dnf_clause_count(dnf1), dnf_clause_count(dnf2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 51683L)
    public static SubLObject dnf_clause_count(final SubLObject dnf) {
        SubLObject count = (SubLObject)pph_templates.ZERO_INTEGER;
        SubLObject cdolist_list_var = dnf;
        SubLObject disjunct = (SubLObject)pph_templates.NIL;
        disjunct = cdolist_list_var.first();
        while (pph_templates.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = disjunct;
            SubLObject neglits = (SubLObject)pph_templates.NIL;
            SubLObject poslits = (SubLObject)pph_templates.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_templates.$list137);
            neglits = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_templates.$list137);
            poslits = current.first();
            current = current.rest();
            if (pph_templates.NIL == current) {
                count = Numbers.add(count, Sequences.length(neglits));
                count = Numbers.add(count, Sequences.length(poslits));
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_templates.$list137);
            }
            cdolist_list_var = cdolist_list_var.rest();
            disjunct = cdolist_list_var.first();
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 51907L)
    public static SubLObject gentemplate_phrase_from_pph_phrase(final SubLObject rel, final SubLObject v_pph_phrase) {
        return pph_tersify_gentemplate_formula((SubLObject)ConsesLow.list(pph_templates.$const83$genTemplate, rel, pph_deepen_phrase_naut(gentemplate_phrase_from_pph_phrase_int(v_pph_phrase))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 52193L)
    public static SubLObject gentemplate_phrase_from_pph_phrase_int(final SubLObject v_pph_phrase) {
        if (pph_templates.NIL != pph_phrase.pph_conditional_phrase_p(v_pph_phrase)) {
            return pph_conditional_phrase_to_gentemplate(v_pph_phrase);
        }
        if (pph_templates.NIL != pph_phrase.pph_det_nbarP(v_pph_phrase)) {
            return pph_det_nbar_to_gentemplate(v_pph_phrase);
        }
        if (pph_templates.NIL != pph_phrase.pph_quoted_paraphrase_phrase_p(v_pph_phrase)) {
            return pph_quoted_phrase_to_gentemplate(v_pph_phrase);
        }
        if (pph_templates.NIL != pph_phrase.pph_phrase_has_dtrsP(v_pph_phrase)) {
            return pph_phrase_to_concatenate_phrases(v_pph_phrase);
        }
        if (pph_templates.NIL != pph_phrase.pph_phrase_head_verbP(v_pph_phrase)) {
            return pph_verb_to_gentemplate(v_pph_phrase);
        }
        if (pph_templates.NIL != pph_phrase.pph_phrase_has_known_cyclP(v_pph_phrase)) {
            return pph_phrase_wXcycl_to_term_paraphrase(v_pph_phrase);
        }
        if (pph_templates.NIL != pph_phrase.pph_phrase_has_stringP(v_pph_phrase)) {
            return pph_phrase_wXstring_only_to_gentemplate(v_pph_phrase);
        }
        if (pph_templates.NIL != pph_phrase.pph_phrase_has_wu_onlyP(v_pph_phrase)) {
            return pph_phrase_wXwu_only_to_gentemplate(v_pph_phrase);
        }
        final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_templates.$str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_templates.ONE_INTEGER), pph_templates.$str1$__, format_nil.format_nil_a_no_copy((SubLObject)pph_templates.$str138$Don_t_know_how_to_convert__S_to__) });
        pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(v_pph_phrase));
        return (SubLObject)pph_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 53216L)
    public static SubLObject pph_conditional_phrase_to_gentemplate(final SubLObject phrase) {
        return (SubLObject)ConsesLow.list(pph_functions.conditionalphrasefn(), pph_phrase.pph_conditional_phrase_test(phrase), gentemplate_phrase_from_pph_phrase_int(pph_phrase.pph_phrase_nth_dtr(phrase, (SubLObject)pph_templates.ZERO_INTEGER)), gentemplate_phrase_from_pph_phrase_int(pph_phrase.pph_phrase_nth_dtr(phrase, (SubLObject)pph_templates.ONE_INTEGER)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 53552L)
    public static SubLObject pph_quoted_phrase_to_gentemplate(final SubLObject phrase) {
        return (SubLObject)ConsesLow.list(pph_functions.quotedparaphrasefn(), gentemplate_phrase_from_pph_phrase_int(pph_phrase.pph_phrase_nth_dtr(phrase, (SubLObject)pph_templates.ZERO_INTEGER)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 54030L)
    public static SubLObject pph_det_nbar_to_gentemplate(final SubLObject phrase) {
        final SubLObject det_dtr = pph_phrase.pph_phrase_nth_dtr(phrase, (SubLObject)pph_templates.ZERO_INTEGER);
        final SubLObject det_string = pph_phrase.pph_phrase_string(det_dtr, (SubLObject)pph_templates.UNPROVIDED);
        final SubLObject definiteness = (SubLObject)(det_string.isString() ? ((pph_templates.NIL != lexicon_accessors.string_is_posP(det_string, pph_templates.$const139$Determiner_Indefinite, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED)) ? pph_templates.$kw140$INDEFINITE : ((pph_templates.NIL != lexicon_accessors.string_is_posP(det_string, pph_templates.$const141$Determiner_Definite, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED)) ? pph_templates.$kw142$DEFINITE : pph_templates.NIL)) : pph_templates.NIL);
        final SubLObject nbar_dtr = pph_phrase.pph_phrase_nth_dtr(phrase, (SubLObject)pph_templates.ONE_INTEGER);
        final SubLObject det_dtr_template = (SubLObject)((pph_templates.NIL != definiteness) ? pph_templates.NIL : ((pph_templates.NIL != pph_phrase.pph_phrase_has_known_cyclP(det_dtr)) ? ConsesLow.list(pph_functions.termparaphrasefn(), pph_phrase.pph_phrase_cycl(det_dtr, (SubLObject)pph_templates.UNPROVIDED)) : ConsesLow.list(pph_functions.bestnlphraseofstringfn(), det_string)));
        final SubLObject real_nbar_cycl = pph_phrase.pph_phrase_cycl(nbar_dtr, (SubLObject)pph_templates.UNPROVIDED);
        final SubLObject nbar_cycl = (pph_templates.NIL != real_nbar_cycl) ? real_nbar_cycl : pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_templates.UNPROVIDED);
        final SubLObject nbar_agr = pph_phrase.pph_phrase_absolute_agr_preds(nbar_dtr);
        final SubLObject mother_agr = pph_phrase.pph_phrase_absolute_agr_preds(phrase);
        final SubLObject det_agr = pph_phrase.pph_phrase_absolute_agr_preds(det_dtr);
        final SubLObject filtered_preds = pph_utilities.pph_filter_preds(pph_utilities.pph_filter_preds(nbar_agr, det_agr, (SubLObject)pph_templates.UNPROVIDED), mother_agr, (SubLObject)pph_templates.UNPROVIDED);
        final SubLObject unified_pred = generic_nominal_agr_pred((SubLObject)((pph_templates.NIL != list_utilities.singletonP(filtered_preds)) ? filtered_preds.first() : pph_templates.NIL));
        final SubLObject nbar_dtr_template = (SubLObject)((pph_templates.NIL != unified_pred) ? ConsesLow.list(pph_functions.phraseformfn(), unified_pred, (SubLObject)ConsesLow.list(pph_functions.termparaphrasefn(), nbar_cycl)) : ConsesLow.list(pph_functions.termparaphrasefn(), nbar_cycl));
        final SubLObject pcase_var = definiteness;
        if (pcase_var.eql((SubLObject)pph_templates.$kw140$INDEFINITE)) {
            return (SubLObject)ConsesLow.list(pph_functions.bestdetnbarfn_indefinite(), nbar_dtr_template);
        }
        if (pcase_var.eql((SubLObject)pph_templates.$kw142$DEFINITE)) {
            return (SubLObject)ConsesLow.list(pph_functions.bestdetnbarfn_definite(), nbar_dtr_template);
        }
        return (SubLObject)ConsesLow.list(pph_functions.bestdetnbarfn(), det_dtr_template, nbar_dtr_template);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 55752L)
    public static SubLObject generic_nominal_agr_pred(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_templates.NIL == pph_utilities.pph_genl_predicateP(pred, pph_templates.$const143$nounStrings, pph_vars.$pph_language_mt$.getDynamicValue(thread))) {
            return (SubLObject)pph_templates.NIL;
        }
        if (pph_templates.NIL != pph_utilities.pph_genl_predicateP(pred, pph_templates.$const144$plural_Generic, pph_vars.$pph_language_mt$.getDynamicValue(thread))) {
            return pph_templates.$const145$nonSingular_Generic;
        }
        return pph_templates.$const146$nonPlural_Generic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 56029L)
    public static SubLObject pph_phrase_to_concatenate_phrases(final SubLObject phrase) {
        final SubLObject nospaceP = pph_phrase.pph_nospace_phrase_p(phrase);
        final SubLObject dtr_phrases = (pph_templates.NIL != nospaceP) ? pph_phrase.pph_phrase_dtr_list(pph_phrase.pph_phrase_nth_dtr(phrase, (SubLObject)pph_templates.ZERO_INTEGER)) : pph_phrase.pph_phrase_dtr_list(phrase);
        final SubLObject fn = (pph_templates.NIL != nospaceP) ? pph_functions.concatenatephrasesfn_nospaces() : pph_functions.concatenatephrasesfn();
        return el_utilities.make_formula(fn, Mapping.mapcar((SubLObject)pph_templates.$sym147$GENTEMPLATE_PHRASE_FROM_PPH_PHRASE_INT, dtr_phrases), (SubLObject)pph_templates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 56505L)
    public static SubLObject pph_verb_to_gentemplate(final SubLObject phrase) {
        final SubLObject verb = pph_phrase.pph_phrase_wu(phrase, (SubLObject)pph_templates.UNPROVIDED);
        final SubLObject agr_pred = pph_phrase.pph_phrase_agr_pred(phrase);
        final SubLObject subject_phrase = pph_phrase.pph_phrase_agr_target_of_type(phrase, (SubLObject)pph_templates.$kw101$SUBJECT_VERB);
        final SubLObject mother = pph_phrase.pph_phrase_mother(phrase);
        SubLObject ans = (SubLObject)pph_templates.NIL;
        if (pph_templates.NIL != pph_phrase.pph_phrase_p(subject_phrase, (SubLObject)pph_templates.UNPROVIDED) && pph_templates.NIL != pph_phrase.pph_phrase_p(mother, (SubLObject)pph_templates.UNPROVIDED)) {
            final SubLObject zero_indexed_subject_num = Sequences.position(subject_phrase, pph_phrase.pph_phrase_dtr_list(mother), (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
            if (pph_templates.ZERO_INTEGER.eql(zero_indexed_subject_num)) {
                ans = (SubLObject)ConsesLow.list(pph_functions.bestheadverbforinitialsubjectfn(), verb);
            }
            else if (zero_indexed_subject_num.isInteger()) {
                final SubLObject subject_num = number_utilities.f_1X(zero_indexed_subject_num);
                ans = (SubLObject)ConsesLow.list(pph_functions.headwordofphrasefn(), (SubLObject)ConsesLow.list(pph_functions.bestverbformforsubjectfn(), verb, (SubLObject)ConsesLow.list(pph_functions.nthphrasefn(), subject_num)));
            }
        }
        if (pph_templates.NIL == ans) {
            ans = (SubLObject)ConsesLow.list(pph_functions.bestnlwordformoflexemefn_constrained(), pph_templates.$const114$Verb, verb);
        }
        if (pph_templates.NIL == list_utilities.sublisp_boolean(subject_phrase) && pph_templates.NIL == pph_utilities.pph_genl_pos_predP(pph_templates.$const148$verbStrings, agr_pred, (SubLObject)pph_templates.UNPROVIDED) && pph_templates.NIL != agr_pred) {
            ans = (SubLObject)ConsesLow.list(pph_functions.phraseformfn(), agr_pred, ans);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 57593L)
    public static SubLObject pph_phrase_wXcycl_to_term_paraphrase(final SubLObject phrase) {
        if (pph_templates.NIL != pph_phrase.pph_phrase_agr_pred(phrase)) {
            return (SubLObject)ConsesLow.list(pph_functions.termparaphrasefn_constrained(), pph_phrase.pph_phrase_agr_pred(phrase), pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_templates.UNPROVIDED));
        }
        if (pph_templates.NIL != kb_indexing_datastructures.indexed_term_p(pph_phrase.pph_phrase_category(phrase, (SubLObject)pph_templates.T))) {
            return (SubLObject)ConsesLow.list(pph_functions.termparaphrasefn_constrained(), pph_phrase.pph_phrase_category(phrase, (SubLObject)pph_templates.T), pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_templates.UNPROVIDED));
        }
        return (SubLObject)ConsesLow.list(pph_functions.termparaphrasefn(), pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_templates.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 58072L)
    public static SubLObject pph_phrase_wXstring_only_to_gentemplate(final SubLObject phrase) {
        return pph_types.pph_phrase_naut_for_string(pph_phrase.pph_phrase_string(phrase, (SubLObject)pph_templates.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 58251L)
    public static SubLObject pph_phrase_wXwu_only_to_gentemplate(final SubLObject phrase) {
        SubLObject cycl = (SubLObject)ConsesLow.list(pph_functions.bestnlwordformoflexemefn(), pph_phrase.pph_phrase_wu(phrase, (SubLObject)pph_templates.UNPROVIDED));
        final SubLObject agr_preds = pph_phrase.pph_phrase_agr_preds(phrase, (SubLObject)pph_templates.UNPROVIDED);
        SubLObject agr_info = (SubLObject)pph_templates.NIL;
        if (pph_templates.NIL != list_utilities.singletonP(agr_preds)) {
            agr_info = agr_preds.first();
        }
        else if (pph_templates.NIL != kb_indexing_datastructures.indexed_term_p(pph_phrase.pph_phrase_category(phrase, (SubLObject)pph_templates.T))) {
            agr_info = pph_phrase.pph_phrase_category(phrase, (SubLObject)pph_templates.T);
        }
        if (pph_templates.NIL != agr_info) {
            cycl = (SubLObject)ConsesLow.list(pph_functions.phraseformfn(), agr_info, cycl);
        }
        return cycl;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 58776L)
    public static SubLObject pph_template_best_pph_phrase_for_formula(final SubLObject formula, SubLObject wide_scope_arg, SubLObject arg_position_map, SubLObject nl_preds) {
        if (wide_scope_arg == pph_templates.UNPROVIDED) {
            wide_scope_arg = (SubLObject)pph_templates.NIL;
        }
        if (arg_position_map == pph_templates.UNPROVIDED) {
            arg_position_map = (SubLObject)pph_templates.NIL;
        }
        if (nl_preds == pph_templates.UNPROVIDED) {
            nl_preds = (SubLObject)pph_templates.$kw120$ANY;
        }
        final SubLObject ans = pph_phrase_template_for_formula(formula, wide_scope_arg, nl_preds);
        return pph_template_customize_template_for_formula(ans, formula, arg_position_map, nl_preds);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 59270L)
    public static SubLObject pph_customize_template_macro_helper(final SubLObject template, final SubLObject formula, final SubLObject arg_position_map, final SubLObject nl_preds) {
        return pph_template_customize_template_for_formula(template, formula, arg_position_map, nl_preds);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 59509L)
    public static SubLObject pph_template_customize_template_for_formula(final SubLObject template, final SubLObject formula, final SubLObject arg_position_map, final SubLObject nl_preds) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject formula_template = (SubLObject)((pph_templates.NIL != pph_phrase.pph_phrase_p(template, (SubLObject)pph_templates.UNPROVIDED)) ? pph_phrase.pph_phrase_cycl(template, (SubLObject)pph_templates.UNPROVIDED) : pph_templates.NIL);
        final SubLObject formula_arg0 = cycl_utilities.formula_arg0(formula);
        if (pph_templates.NIL != pph_template_formula_rephraseP(template)) {
            final SubLObject _prev_bind_0 = pph_vars.$pph_current_arg0$.currentBinding(thread);
            try {
                pph_vars.$pph_current_arg0$.bind((SubLObject)((pph_templates.NIL != pph_macros.pph_ok_arg0_for_linkingP(formula_arg0)) ? formula_arg0 : pph_templates.$kw151$UNSPECIFIED), thread);
                final SubLObject new_template_phrase = pph_template_phrase_from_arg0(formula, formula_template, arg_position_map);
                final SubLObject justs = pph_phrase.pph_phrase_justification(template);
                if (pph_templates.NIL != pph_phrase.pph_phrase_p(new_template_phrase, (SubLObject)pph_templates.UNPROVIDED)) {
                    pph_phrase.pph_phrase_copy(new_template_phrase, template, (SubLObject)pph_templates.UNPROVIDED);
                    SubLObject cdolist_list_var = justs;
                    SubLObject just = (SubLObject)pph_templates.NIL;
                    just = cdolist_list_var.first();
                    while (pph_templates.NIL != cdolist_list_var) {
                        pph_phrase.pph_phrase_add_justification(template, just);
                        cdolist_list_var = cdolist_list_var.rest();
                        just = cdolist_list_var.first();
                    }
                }
            }
            finally {
                pph_vars.$pph_current_arg0$.rebind(_prev_bind_0, thread);
            }
        }
        if (pph_templates.NIL != pph_phrase.pph_phrase_p(template, (SubLObject)pph_templates.UNPROVIDED)) {
            if (!formula_arg0.equal(pph_phrase.pph_current_arg0()) && pph_templates.NIL == pph_utilities.pph_arg_position_lookup((SubLObject)pph_templates.$list152, arg_position_map)) {
                pph_phrase_resolution.pph_phrase_reset_arg0_reservations(template, formula_arg0, pph_vars.$pph_current_arg0$.getDynamicValue(thread), arg_position_map);
            }
            pph_variable_handling.pph_register_scoped_vars(formula_template);
            final SubLObject formula_is_templateP = (SubLObject)pph_templates.NIL;
            pph_template_phrase_set_cycl(template, formula, arg_position_map, formula_is_templateP);
            pph_phrase.pph_phrase_update_agr_preds(template, nl_preds, (SubLObject)pph_templates.UNPROVIDED);
            if (pph_templates.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_templates.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_templates.T, (SubLObject)pph_templates.$str153$__Found_PPH_PHRASE_for__S_____S__, formula, template, pph_phrase.pph_phrase_justification(template), template, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
            }
        }
        return template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 61039L)
    public static SubLObject pph_template_phrase_from_arg0(final SubLObject formula, final SubLObject formula_template, final SubLObject arg_position_map) {
        final SubLObject formula_template_args = cycl_utilities.formula_args(formula_template, (SubLObject)pph_templates.UNPROVIDED);
        final SubLObject arg0_template = cycl_utilities.formula_arg0(formula_template);
        final SubLObject arg0 = pph_utilities.pph_apply_template(arg0_template, formula);
        final SubLObject dummy_formula = el_utilities.make_el_formula(arg0, formula_template_args, (SubLObject)pph_templates.UNPROVIDED);
        final SubLObject revised_formula = pph_utilities.pph_apply_template(dummy_formula, formula);
        final SubLObject best_phrase = pph_phrase_template_for_formula(revised_formula, (SubLObject)pph_templates.NIL, (SubLObject)pph_templates.UNPROVIDED);
        if (pph_templates.NIL != pph_phrase.pph_phrase_p(best_phrase, (SubLObject)pph_templates.UNPROVIDED)) {
            final SubLObject temp_arg_position_map = pph_utilities.pph_figure_new_arg_position_map(arg_position_map, formula_template);
            pph_template_phrase_set_cycl(best_phrase, formula_template, temp_arg_position_map, (SubLObject)pph_templates.T);
            return best_phrase;
        }
        return (SubLObject)pph_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 62036L)
    public static SubLObject pph_template_formula_rephraseP(final SubLObject phrase) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_templates.NIL != pph_phrase.pph_phrase_p(phrase, (SubLObject)pph_templates.UNPROVIDED) && pph_templates.NIL == pph_phrase.pph_phrase_has_dtrsP(phrase) && pph_templates.NIL != pph_arg0_rephrase_templateP(pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_templates.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 62247L)
    public static SubLObject pph_arg0_rephrase_templateP(final SubLObject cycl) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_templates.NIL != el_utilities.el_formula_p(cycl) && pph_templates.NIL != at_admitted.generic_arg_p(cycl_utilities.formula_arg0(cycl)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 62379L)
    public static SubLObject expanded_gen_template_sets_for_reln(SubLObject reln, final SubLObject arg_position_map, SubLObject used_relns) {
        if (used_relns == pph_templates.UNPROVIDED) {
            used_relns = (SubLObject)pph_templates.NIL;
        }
        reln = function_terms.naut_to_nart(reln);
        used_relns = (SubLObject)ConsesLow.cons(reln, used_relns);
        final SubLObject raw_sets = gen_template_sets_for_reln(reln, (SubLObject)pph_templates.UNPROVIDED);
        return pph_expand_gen_template_sets(raw_sets, used_relns, arg_position_map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 62904L)
    public static SubLObject pph_expand_gen_template_sets(final SubLObject sets, final SubLObject used_relns, final SubLObject arg_position_map) {
        SubLObject expanded = (SubLObject)pph_templates.NIL;
        SubLObject cdolist_list_var = sets;
        SubLObject v_set = (SubLObject)pph_templates.NIL;
        v_set = cdolist_list_var.first();
        while (pph_templates.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$139 = pph_expand_gen_template_set(v_set, used_relns, arg_position_map);
            SubLObject expanded_set = (SubLObject)pph_templates.NIL;
            expanded_set = cdolist_list_var_$139.first();
            while (pph_templates.NIL != cdolist_list_var_$139) {
                expanded = (SubLObject)ConsesLow.cons(expanded_set, expanded);
                cdolist_list_var_$139 = cdolist_list_var_$139.rest();
                expanded_set = cdolist_list_var_$139.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_set = cdolist_list_var.first();
        }
        return Sequences.nreverse(expanded);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 63205L)
    public static SubLObject pph_expand_gen_template_set(final SubLObject v_set, final SubLObject used_relns, final SubLObject arg_position_map) {
        SubLObject expanded = (SubLObject)pph_templates.NIL;
        final SubLObject set_contents_var = set.do_set_internal(v_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject gen_template;
        SubLObject cdolist_list_var;
        SubLObject new_template;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)pph_templates.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); pph_templates.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            gen_template = set_contents.do_set_contents_next(basis_object, state);
            if (pph_templates.NIL != set_contents.do_set_contents_element_validP(state, gen_template)) {
                cdolist_list_var = pph_expand_gen_template(gen_template, used_relns, arg_position_map);
                new_template = (SubLObject)pph_templates.NIL;
                new_template = cdolist_list_var.first();
                while (pph_templates.NIL != cdolist_list_var) {
                    expanded = add_gen_template_to_sets(new_template, expanded);
                    cdolist_list_var = cdolist_list_var.rest();
                    new_template = cdolist_list_var.first();
                }
            }
        }
        return expanded;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 63603L)
    public static SubLObject pph_expand_gen_template(final SubLObject gen_template, final SubLObject used_relns, final SubLObject arg_position_map) {
        final SubLObject phrase = pph_data_structures.get_gen_template_phrase(gen_template);
        SubLObject recursiveP = (SubLObject)pph_templates.NIL;
        SubLObject expanded = (SubLObject)pph_templates.NIL;
        if (pph_templates.NIL != pph_phrase.pph_phrase_p(phrase, (SubLObject)pph_templates.UNPROVIDED)) {
            final SubLObject phrase_cycl = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_templates.UNPROVIDED);
            final SubLObject constraint = pph_data_structures.get_gen_template_constraint(gen_template);
            if (pph_templates.NIL == pph_phrase.pph_phrase_has_dtrsP(phrase) && pph_templates.NIL != el_utilities.el_formula_p(phrase_cycl) && pph_templates.NIL == pph_variable_handling.pph_formula_free_variables(phrase_cycl, (SubLObject)pph_templates.UNPROVIDED)) {
                final SubLObject original_arg0 = list_utilities.last_one(used_relns);
                final SubLObject new_arg0 = cycl_utilities.formula_arg0(phrase_cycl);
                if (pph_templates.NIL == subl_promotions.memberP(new_arg0, used_relns, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED) && pph_templates.NIL == fort_types_interface.variable_arity_relation_p(new_arg0) && pph_templates.$sym154$GENERATE_PHRASE_FROM_TEMPLATE.eql(pph_types.get_paraphrase_methods(phrase_cycl).first().first())) {
                    SubLObject cdolist_list_var = expanded_gen_template_sets_for_reln(new_arg0, arg_position_map, used_relns);
                    SubLObject v_set = (SubLObject)pph_templates.NIL;
                    v_set = cdolist_list_var.first();
                    while (pph_templates.NIL != cdolist_list_var) {
                        final SubLObject set_contents_var = set.do_set_internal(v_set);
                        SubLObject basis_object;
                        SubLObject state;
                        SubLObject expanded_gen_template;
                        SubLObject rephrased_template;
                        SubLObject rephrased_template_phrase;
                        SubLObject new_new_arg0;
                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)pph_templates.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); pph_templates.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                            expanded_gen_template = set_contents.do_set_contents_next(basis_object, state);
                            if (pph_templates.NIL != set_contents.do_set_contents_element_validP(state, expanded_gen_template)) {
                                rephrased_template = pph_rephrase_expanded_gen_template(expanded_gen_template, phrase_cycl);
                                rephrased_template_phrase = pph_data_structures.get_gen_template_phrase(rephrased_template);
                                new_new_arg0 = cycl_utilities.formula_arg0(pph_phrase.pph_phrase_cycl(rephrased_template_phrase, (SubLObject)pph_templates.UNPROVIDED));
                                if (pph_templates.NIL != conses_high.member(new_new_arg0, used_relns, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED)) {
                                    recursiveP = (SubLObject)pph_templates.T;
                                }
                                else {
                                    pph_phrase_resolution.pph_phrase_reset_arg0_reservations(rephrased_template_phrase, new_arg0, original_arg0, arg_position_map);
                                    if (pph_templates.NIL != constraint) {
                                        gen_template_add_constraint(rephrased_template, constraint);
                                    }
                                    expanded = (SubLObject)ConsesLow.cons(rephrased_template, expanded);
                                }
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        v_set = cdolist_list_var.first();
                    }
                }
            }
        }
        if (pph_templates.NIL != list_utilities.empty_list_p(expanded) && pph_templates.NIL == recursiveP) {
            expanded = (SubLObject)ConsesLow.list(gen_template);
        }
        return expanded;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 65684L)
    public static SubLObject gen_template_add_constraint(final SubLObject gen_template, SubLObject constraint) {
        if (pph_templates.NIL != clauses.clauses_p(constraint)) {
            constraint = clauses.dnf_formula_from_clauses(constraint);
        }
        final SubLObject existing_el_constraint = pph_data_structures.gen_template_el_constraint(gen_template);
        if (pph_templates.NIL == el_utilities.el_formula_p(existing_el_constraint)) {
            pph_data_structures.gen_template_set_constraint(gen_template, constraint);
        }
        else if (pph_templates.NIL != el_utilities.el_formula_p(constraint)) {
            pph_data_structures.gen_template_set_constraint(gen_template, simplifier.conjoin(existing_el_constraint, constraint));
        }
        return pph_data_structures.get_gen_template_constraint(gen_template);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 66270L)
    public static SubLObject pph_rephrase_expanded_gen_template(final SubLObject gen_template, final SubLObject formula) {
        final SubLObject phrase = pph_phrase.pph_phrase_copy(pph_data_structures.get_gen_template_phrase(gen_template), (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
        final SubLObject dummy_cycl = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_templates.UNPROVIDED);
        final SubLObject constraint = pph_data_structures.get_gen_template_constraint(gen_template);
        final SubLObject assertion = pph_data_structures.get_gen_template_assertion(gen_template);
        pph_phrase.pph_phrase_set_cycl(phrase, formula);
        pph_phrase.pph_phrase_reset_cycl(phrase, dummy_cycl);
        final SubLObject new_constraint = pph_utilities.pph_apply_template(constraint, formula);
        return pph_data_structures.new_gen_template(phrase, new_constraint, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 66921L)
    public static SubLObject pph_phrase_templates_for_formula_wXreln(final SubLObject formula, final SubLObject reln, final SubLObject arg_position_map, SubLObject inverseP, SubLObject wide_scope_argnum, SubLObject nl_preds) {
        if (inverseP == pph_templates.UNPROVIDED) {
            inverseP = (SubLObject)pph_templates.NIL;
        }
        if (wide_scope_argnum == pph_templates.UNPROVIDED) {
            wide_scope_argnum = (SubLObject)pph_templates.NIL;
        }
        if (nl_preds == pph_templates.UNPROVIDED) {
            nl_preds = (SubLObject)pph_templates.$kw120$ANY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)pph_templates.NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_formula_for_generic_arg_replacement$.currentBinding(thread);
        try {
            pph_vars.$pph_formula_for_generic_arg_replacement$.bind(formula, thread);
            final SubLObject sets = expanded_gen_template_sets_for_reln(reln, arg_position_map, (SubLObject)pph_templates.UNPROVIDED);
            SubLObject imprecise_templates = (SubLObject)pph_templates.NIL;
            SubLObject cdolist_list_var = sets;
            SubLObject v_set = (SubLObject)pph_templates.NIL;
            v_set = cdolist_list_var.first();
            while (pph_templates.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$140;
                final SubLObject templates = cdolist_list_var_$140 = pph_sort_gen_templates_by_verbosity(set.set_element_list(v_set));
                SubLObject template = (SubLObject)pph_templates.NIL;
                template = cdolist_list_var_$140.first();
                while (pph_templates.NIL != cdolist_list_var_$140) {
                    if (pph_templates.NIL != pph_template_not_precise_enoughP(template, formula)) {
                        imprecise_templates = (SubLObject)ConsesLow.cons(template, imprecise_templates);
                    }
                    else {
                        final SubLObject phrase_or_problem_string = pph_phrase_from_gen_template_satisfying_constraints(template, formula, inverseP, wide_scope_argnum, nl_preds);
                        if (pph_templates.NIL != pph_phrase.pph_phrase_p(phrase_or_problem_string, (SubLObject)pph_templates.UNPROVIDED)) {
                            ans = (SubLObject)ConsesLow.cons(phrase_or_problem_string, ans);
                        }
                        else if (pph_templates.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_templates.ONE_INTEGER) && pph_templates.NIL == pph_error.suppress_pph_warningsP()) {
                            Errors.warn(phrase_or_problem_string);
                            streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                        }
                    }
                    cdolist_list_var_$140 = cdolist_list_var_$140.rest();
                    template = cdolist_list_var_$140.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_set = cdolist_list_var.first();
            }
            cdolist_list_var = Sequences.nreverse(imprecise_templates);
            SubLObject template2 = (SubLObject)pph_templates.NIL;
            template2 = cdolist_list_var.first();
            while (pph_templates.NIL != cdolist_list_var) {
                final SubLObject phrase_or_problem_string2 = pph_phrase_from_gen_template_satisfying_constraints(template2, formula, inverseP, wide_scope_argnum, nl_preds);
                if (pph_templates.NIL != pph_phrase.pph_phrase_p(phrase_or_problem_string2, (SubLObject)pph_templates.UNPROVIDED)) {
                    ans = (SubLObject)ConsesLow.cons(phrase_or_problem_string2, ans);
                }
                else if (pph_templates.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_templates.ONE_INTEGER) && pph_templates.NIL == pph_error.suppress_pph_warningsP()) {
                    Errors.warn(phrase_or_problem_string2);
                    streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                }
                cdolist_list_var = cdolist_list_var.rest();
                template2 = cdolist_list_var.first();
            }
        }
        finally {
            pph_vars.$pph_formula_for_generic_arg_replacement$.rebind(_prev_bind_0, thread);
        }
        return Sort.stable_sort(Sequences.nreverse(Sequences.remove((SubLObject)pph_templates.NIL, ans, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED)), Symbols.symbol_function((SubLObject)pph_templates.$sym155$_), (SubLObject)pph_templates.$sym156$PPH_PHRASE_TOP_LEVEL_DEMERITS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 68395L)
    public static SubLObject pph_sort_gen_templates_by_verbosity(final SubLObject templates) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject maybe_randomized = (pph_templates.$kw157$RANDOM == pph_vars.$pph_ceteris_paribus_choice_method$.getDynamicValue(thread)) ? list_utilities.randomize_list(templates) : templates;
        SubLObject sorted = Sort.stable_sort(maybe_randomized, (pph_templates.NIL != pph_utilities.pph_precise_in_argP((SubLObject)pph_templates.ZERO_INTEGER)) ? Symbols.symbol_function((SubLObject)pph_templates.$sym158$_) : Symbols.symbol_function((SubLObject)pph_templates.$sym155$_), (SubLObject)pph_templates.$sym159$GEN_TEMPLATE_VERBOSITY);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            sorted = pph_utilities.pph_stable_sort_assertions(sorted, (SubLObject)pph_templates.$sym160$GET_GEN_TEMPLATE_ASSERTION, (SubLObject)pph_templates.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return sorted;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 68855L)
    public static SubLObject pph_phrase_template_generator_next(final SubLObject generator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_templates.NIL != pph_data_structures.pph_phrase_template_generator_done_p(generator)) {
            return (SubLObject)pph_templates.$kw29$DONE;
        }
        SubLObject ans = (SubLObject)pph_templates.NIL;
        SubLObject inverseP = (SubLObject)pph_templates.NIL;
        while (pph_templates.NIL == ans) {
            thread.resetMultipleValues();
            final SubLObject gen_template = pph_phrase_template_generator_next_gen_template(generator);
            final SubLObject this_inverseP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (pph_templates.NIL == gen_template) {
                ans = (SubLObject)pph_templates.$kw29$DONE;
            }
            else if (pph_templates.$kw161$GEN_FORMAT == gen_template) {
                ans = (SubLObject)pph_templates.$kw161$GEN_FORMAT;
            }
            else if (pph_templates.NIL != pph_data_structures.generation_template_p(gen_template)) {
                final SubLObject formula = pph_data_structures.pph_phrase_template_generator_formula(generator);
                final SubLObject focus_arg = pph_data_structures.pph_phrase_template_generator_focus_arg(generator);
                final SubLObject nl_preds = pph_data_structures.pph_phrase_template_generator_nl_preds(generator);
                ans = pph_phrase_from_gen_template_satisfying_constraints(gen_template, formula, this_inverseP, focus_arg, nl_preds);
                inverseP = this_inverseP;
                if (pph_templates.NIL != pph_phrase.pph_phrase_p(ans, (SubLObject)pph_templates.UNPROVIDED) || pph_templates.NIL == pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_templates.ONE_INTEGER)) {
                    continue;
                }
                format_nil.force_format((SubLObject)pph_templates.T, (SubLObject)pph_templates.$str162$Couldn_t_use_gen_template_____S__, gen_template, ans, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
            }
            else {
                final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_templates.$str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_templates.ONE_INTEGER), pph_templates.$str1$__, format_nil.format_nil_a_no_copy((SubLObject)pph_templates.$str163$Expected_gen_template__got__S__) });
                pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(gen_template));
            }
        }
        return Values.values(ans, inverseP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 70008L)
    public static SubLObject pph_phrase_template_generator_next_gen_template(final SubLObject generator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject ans = pph_phrase_template_generator_next_gen_template_internal(generator);
        SubLObject inverseP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        while (pph_templates.NIL != pph_data_structures.generation_template_p(ans) && pph_templates.NIL != pph_vars.pph_forbidden_lexical_assertionP(pph_data_structures.get_gen_template_assertion(ans))) {
            if (pph_templates.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_templates.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_templates.T, (SubLObject)pph_templates.$str164$Skipping_forbidden_lexical_assert, ans, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
            }
            thread.resetMultipleValues();
            final SubLObject ans_$141 = pph_phrase_template_generator_next_gen_template_internal(generator);
            final SubLObject inverseP_$142 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            ans = ans_$141;
            inverseP = inverseP_$142;
        }
        if (pph_templates.NIL == pph_data_structures.generation_template_p(ans)) {
            pph_data_structures._csetf_pph_phrase_template_generator_doneP(generator, (SubLObject)pph_templates.T);
        }
        return Values.values(ans, inverseP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 70698L)
    public static SubLObject pph_phrase_template_generator_next_gen_template_internal(final SubLObject generator) {
        SubLObject ans = queues.dequeue(pph_phrase_template_generator_gen_template_queue(generator));
        SubLObject inverseP = (SubLObject)pph_templates.NIL;
        if (ans.isList() && pph_templates.$kw165$INVERSE == ans.first()) {
            ans = conses_high.second(ans);
            inverseP = (SubLObject)pph_templates.T;
        }
        return Values.values(ans, inverseP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 71021L)
    public static SubLObject pph_phrase_template_generator_initialize_queues(final SubLObject generator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject specified_reln = pph_data_structures.pph_phrase_template_generator_specified_reln(generator);
        final SubLObject formula = pph_data_structures.pph_phrase_template_generator_formula(generator);
        final SubLObject mt = pph_data_structures.pph_phrase_template_generator_mt(generator);
        final SubLObject actual_reln = function_terms.naut_to_nart(cycl_utilities.formula_operator(formula));
        final SubLObject relns_to_use = pph_data_structures.pph_phrase_template_generator_relns_to_use(generator);
        queues.clear_queue(relns_to_use);
        if (pph_templates.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_templates.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_templates.T, (SubLObject)pph_templates.$str166$__Reinitializing_relns_to_use___, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
        }
        if (pph_templates.NIL != specified_reln) {
            queues.enqueue(specified_reln, relns_to_use);
        }
        else {
            queues.enqueue(actual_reln, relns_to_use);
            final SubLObject search_limit = pph_data_structures.pph_phrase_template_generator_search_limit(generator);
            SubLObject enoughP = (SubLObject)SubLObjectFactory.makeBoolean(pph_templates.NIL == number_utilities.positive_number_p(search_limit));
            if (pph_templates.NIL == enoughP) {
                if (pph_templates.NIL != fort_types_interface.predicate_in_any_mtP(actual_reln)) {
                    SubLObject cdolist_list_var = Sequences.remove(actual_reln, pph_utilities.pph_typed_genl_preds(actual_reln, mt), Symbols.symbol_function((SubLObject)pph_templates.EQUAL), (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
                    SubLObject tgp = (SubLObject)pph_templates.NIL;
                    tgp = cdolist_list_var.first();
                    while (pph_templates.NIL != cdolist_list_var) {
                        queues.enqueue(tgp, relns_to_use);
                        cdolist_list_var = cdolist_list_var.rest();
                        tgp = cdolist_list_var.first();
                    }
                    if (pph_templates.NIL == enoughP) {
                        final SubLObject module = sbhl_module_vars.get_sbhl_module(pph_templates.$const167$genlPreds);
                        final SubLObject node_var = actual_reln;
                        final SubLObject deck_type = (SubLObject)((pph_templates.$kw10$BREADTH == pph_templates.$kw168$DEPTH) ? pph_templates.$kw12$STACK : pph_templates.$kw11$QUEUE);
                        final SubLObject recur_deck = deck.create_deck(deck_type);
                        SubLObject node_and_predicate_mode = (SubLObject)pph_templates.NIL;
                        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                final SubLObject mt_var = mt;
                                final SubLObject _prev_bind_0_$143 = mt_relevance_macros.$mt$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    final SubLObject tv_var = pph_templates.$const169$True_JustificationTruth;
                                    final SubLObject _prev_bind_0_$144 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$145 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_tv$.bind((pph_templates.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((pph_templates.NIL != tv_var) ? pph_templates.$sym13$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                        if (pph_templates.NIL != tv_var && pph_templates.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && pph_templates.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                            if (pcase_var.eql((SubLObject)pph_templates.$kw14$ERROR)) {
                                                sbhl_paranoia.sbhl_error((SubLObject)pph_templates.ONE_INTEGER, (SubLObject)pph_templates.$str15$_A_is_not_a__A, tv_var, (SubLObject)pph_templates.$sym16$SBHL_TRUE_TV_P, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
                                            }
                                            else if (pcase_var.eql((SubLObject)pph_templates.$kw17$CERROR)) {
                                                sbhl_paranoia.sbhl_cerror((SubLObject)pph_templates.ONE_INTEGER, (SubLObject)pph_templates.$str18$continue_anyway, (SubLObject)pph_templates.$str15$_A_is_not_a__A, tv_var, (SubLObject)pph_templates.$sym16$SBHL_TRUE_TV_P, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
                                            }
                                            else if (pcase_var.eql((SubLObject)pph_templates.$kw19$WARN)) {
                                                Errors.warn((SubLObject)pph_templates.$str15$_A_is_not_a__A, tv_var, (SubLObject)pph_templates.$sym16$SBHL_TRUE_TV_P);
                                            }
                                            else {
                                                Errors.warn((SubLObject)pph_templates.$str20$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror((SubLObject)pph_templates.$str18$continue_anyway, (SubLObject)pph_templates.$str15$_A_is_not_a__A, tv_var, (SubLObject)pph_templates.$sym16$SBHL_TRUE_TV_P);
                                            }
                                        }
                                        final SubLObject _prev_bind_0_$145 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$146 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$148 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)pph_templates.NIL, thread);
                                            sbhl_module_vars.$sbhl_module$.bind(module, thread);
                                            if (pph_templates.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || pph_templates.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(actual_reln, sbhl_module_vars.get_sbhl_module((SubLObject)pph_templates.UNPROVIDED))) {
                                                final SubLObject _prev_bind_0_$146 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$147 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                final SubLObject _prev_bind_2_$149 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), module), thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)pph_templates.NIL, thread);
                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)pph_templates.UNPROVIDED);
                                                    for (node_and_predicate_mode = (SubLObject)ConsesLow.list(actual_reln, sbhl_search_vars.genl_inverse_mode_p()); pph_templates.NIL != node_and_predicate_mode && pph_templates.NIL == enoughP; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                                        final SubLObject node_var_$152 = node_and_predicate_mode.first();
                                                        final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                                        SubLObject pred = node_var_$152;
                                                        final SubLObject _prev_bind_0_$147 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                            final SubLObject inverseP = predicate_mode;
                                                            final SubLObject distance = pph_genl_preds_distance(actual_reln, pred, inverseP, (SubLObject)pph_templates.UNPROVIDED);
                                                            if (pph_templates.NIL != distance && distance.numG(search_limit)) {
                                                                enoughP = (SubLObject)pph_templates.T;
                                                            }
                                                            else if (pph_templates.NIL == queues.queue_find(pred, relns_to_use, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED)) {
                                                                if (pph_templates.NIL != inverseP) {
                                                                    if (pph_templates.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_templates.ONE_INTEGER)) {
                                                                        format_nil.force_format((SubLObject)pph_templates.T, (SubLObject)pph_templates.$str170$Inverting_templates_for__S, pred, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
                                                                    }
                                                                    pred = (SubLObject)ConsesLow.list((SubLObject)pph_templates.$kw165$INVERSE, pred);
                                                                }
                                                                queues.enqueue(pred, relns_to_use);
                                                            }
                                                            final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(module);
                                                            SubLObject rest;
                                                            SubLObject module_var;
                                                            SubLObject _prev_bind_0_$148;
                                                            SubLObject _prev_bind_1_$148;
                                                            SubLObject node;
                                                            SubLObject d_link;
                                                            SubLObject mt_links;
                                                            SubLObject iteration_state;
                                                            SubLObject mt_$156;
                                                            SubLObject tv_links;
                                                            SubLObject _prev_bind_0_$149;
                                                            SubLObject iteration_state_$158;
                                                            SubLObject tv;
                                                            SubLObject link_nodes;
                                                            SubLObject _prev_bind_0_$150;
                                                            SubLObject sol;
                                                            SubLObject set_contents_var;
                                                            SubLObject basis_object;
                                                            SubLObject state;
                                                            SubLObject node_vars_link_node;
                                                            SubLObject csome_list_var;
                                                            SubLObject node_vars_link_node2;
                                                            SubLObject new_list;
                                                            SubLObject rest_$160;
                                                            SubLObject generating_fn;
                                                            SubLObject _prev_bind_0_$151;
                                                            SubLObject sol2;
                                                            SubLObject link_nodes2;
                                                            SubLObject set_contents_var2;
                                                            SubLObject basis_object2;
                                                            SubLObject state2;
                                                            SubLObject node_vars_link_node3;
                                                            SubLObject csome_list_var2;
                                                            SubLObject node_vars_link_node4;
                                                            for (rest = (SubLObject)pph_templates.NIL, rest = accessible_modules; pph_templates.NIL == enoughP && pph_templates.NIL != rest; rest = rest.rest()) {
                                                                module_var = rest.first();
                                                                _prev_bind_0_$148 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                _prev_bind_1_$148 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                try {
                                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((pph_templates.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(pph_templates.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                                    node = function_terms.naut_to_nart(node_var_$152);
                                                                    if (pph_templates.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                        d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)pph_templates.UNPROVIDED));
                                                                        if (pph_templates.NIL != d_link) {
                                                                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)pph_templates.UNPROVIDED));
                                                                            if (pph_templates.NIL != mt_links) {
                                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); pph_templates.NIL == enoughP && pph_templates.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                                    thread.resetMultipleValues();
                                                                                    mt_$156 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                    tv_links = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (pph_templates.NIL != mt_relevance_macros.relevant_mtP(mt_$156)) {
                                                                                        _prev_bind_0_$149 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$156, thread);
                                                                                            for (iteration_state_$158 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); pph_templates.NIL == enoughP && pph_templates.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$158); iteration_state_$158 = dictionary_contents.do_dictionary_contents_next(iteration_state_$158)) {
                                                                                                thread.resetMultipleValues();
                                                                                                tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$158);
                                                                                                link_nodes = thread.secondMultipleValue();
                                                                                                thread.resetMultipleValues();
                                                                                                if (pph_templates.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                    _prev_bind_0_$150 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                        sol = link_nodes;
                                                                                                        if (pph_templates.NIL != set.set_p(sol)) {
                                                                                                            set_contents_var = set.do_set_internal(sol);
                                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)pph_templates.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); pph_templates.NIL == enoughP && pph_templates.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                                if (pph_templates.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && pph_templates.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)pph_templates.UNPROVIDED)) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)pph_templates.UNPROVIDED);
                                                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        else if (sol.isList()) {
                                                                                                            if (pph_templates.NIL == enoughP) {
                                                                                                                csome_list_var = sol;
                                                                                                                node_vars_link_node2 = (SubLObject)pph_templates.NIL;
                                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                                while (pph_templates.NIL == enoughP && pph_templates.NIL != csome_list_var) {
                                                                                                                    if (pph_templates.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)pph_templates.UNPROVIDED)) {
                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)pph_templates.UNPROVIDED);
                                                                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                    }
                                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        else {
                                                                                                            Errors.error((SubLObject)pph_templates.$str21$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                        }
                                                                                                    }
                                                                                                    finally {
                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$150, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$158);
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$149, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                            }
                                                                        }
                                                                        else {
                                                                            sbhl_paranoia.sbhl_error((SubLObject)pph_templates.FIVE_INTEGER, (SubLObject)pph_templates.$str22$attempting_to_bind_direction_link, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
                                                                        }
                                                                    }
                                                                    else if (pph_templates.NIL != obsolete.cnat_p(node, (SubLObject)pph_templates.UNPROVIDED)) {
                                                                        new_list = ((pph_templates.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)pph_templates.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)pph_templates.UNPROVIDED)));
                                                                        for (rest_$160 = (SubLObject)pph_templates.NIL, rest_$160 = new_list; pph_templates.NIL == enoughP && pph_templates.NIL != rest_$160; rest_$160 = rest_$160.rest()) {
                                                                            generating_fn = rest_$160.first();
                                                                            _prev_bind_0_$151 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                link_nodes2 = (sol2 = Functions.funcall(generating_fn, node));
                                                                                if (pph_templates.NIL != set.set_p(sol2)) {
                                                                                    set_contents_var2 = set.do_set_internal(sol2);
                                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)pph_templates.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); pph_templates.NIL == enoughP && pph_templates.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                        if (pph_templates.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && pph_templates.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)pph_templates.UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)pph_templates.UNPROVIDED);
                                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (sol2.isList()) {
                                                                                    if (pph_templates.NIL == enoughP) {
                                                                                        csome_list_var2 = sol2;
                                                                                        node_vars_link_node4 = (SubLObject)pph_templates.NIL;
                                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                                        while (pph_templates.NIL == enoughP && pph_templates.NIL != csome_list_var2) {
                                                                                            if (pph_templates.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)pph_templates.UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)pph_templates.UNPROVIDED);
                                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                            }
                                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)pph_templates.$str21$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$151, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$148, thread);
                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$148, thread);
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$147, thread);
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$149, thread);
                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$147, thread);
                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$146, thread);
                                                }
                                            }
                                            else {
                                                sbhl_paranoia.sbhl_warn((SubLObject)pph_templates.TWO_INTEGER, (SubLObject)pph_templates.$str24$Node__a_does_not_pass_sbhl_type_t, actual_reln, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)pph_templates.UNPROVIDED)), (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
                                            }
                                        }
                                        finally {
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$148, thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$146, thread);
                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$145, thread);
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$145, thread);
                                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$144, thread);
                                    }
                                }
                                finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$143, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$152 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_templates.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$152, thread);
                                }
                            }
                        }
                        finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                else {
                    final SubLObject genl_funcs = Sort.sort(pph_utilities.pph_all_genl_relations(actual_reln), (SubLObject)pph_templates.$sym171$PPH_GENL_RELATION_, (SubLObject)pph_templates.UNPROVIDED);
                    if (pph_templates.NIL == enoughP) {
                        SubLObject csome_list_var3 = genl_funcs;
                        SubLObject reln = (SubLObject)pph_templates.NIL;
                        reln = csome_list_var3.first();
                        while (pph_templates.NIL == enoughP && pph_templates.NIL != csome_list_var3) {
                            if (pph_templates.NIL == queues.queue_find(reln, relns_to_use, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED)) {
                                queues.enqueue(reln, relns_to_use);
                                if (queues.queue_size(relns_to_use).numGE(search_limit)) {
                                    enoughP = (SubLObject)pph_templates.T;
                                }
                            }
                            csome_list_var3 = csome_list_var3.rest();
                            reln = csome_list_var3.first();
                        }
                    }
                }
            }
        }
        if (pph_templates.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_templates.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_templates.T, (SubLObject)pph_templates.$str172$Relns_to_use___S__, queues.queue_elements(relns_to_use), (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
        }
        queues.clear_queue(pph_data_structures.pph_phrase_template_generator_gen_template_sets(generator));
        pph_phrase_template_generator_populate_gen_template_sets_queue(generator);
        queues.clear_queue(pph_data_structures.pph_phrase_template_generator_gen_templates(generator));
        pph_phrase_template_generator_populate_gen_template_queue(generator);
        return generator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 73254L)
    public static SubLObject pph_genl_preds_distance_internal(final SubLObject sub, final SubLObject v_super, final SubLObject inverseP, SubLObject mt) {
        if (mt == pph_templates.UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLObject pred = (pph_templates.NIL != inverseP) ? pph_templates.$const174$genlInverse : pph_templates.$const167$genlPreds;
        final SubLObject supports = sbhl_search_methods.why_sbhl_relationP(sbhl_module_vars.get_sbhl_module(pred), sub, v_super, mt, pph_templates.$const169$True_JustificationTruth, (SubLObject)pph_templates.$kw175$ASSERTION);
        SubLObject distance = (SubLObject)pph_templates.ZERO_INTEGER;
        if (pph_templates.NIL == supports) {
            return (SubLObject)pph_templates.NIL;
        }
        SubLObject cdolist_list_var = supports;
        SubLObject support = (SubLObject)pph_templates.NIL;
        support = cdolist_list_var.first();
        while (pph_templates.NIL != cdolist_list_var) {
            if (pred.eql(cycl_utilities.formula_arg0(arguments.support_sentence(support)))) {
                distance = Numbers.add(distance, (SubLObject)pph_templates.ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        }
        return distance;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 73254L)
    public static SubLObject pph_genl_preds_distance(final SubLObject sub, final SubLObject v_super, final SubLObject inverseP, SubLObject mt) {
        if (mt == pph_templates.UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_templates.NIL;
        if (pph_templates.NIL == v_memoization_state) {
            return pph_genl_preds_distance_internal(sub, v_super, inverseP, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_templates.$sym173$PPH_GENL_PREDS_DISTANCE, (SubLObject)pph_templates.UNPROVIDED);
        if (pph_templates.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_templates.$sym173$PPH_GENL_PREDS_DISTANCE, (SubLObject)pph_templates.FOUR_INTEGER, (SubLObject)pph_templates.NIL, (SubLObject)pph_templates.EQUAL, (SubLObject)pph_templates.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_templates.$sym173$PPH_GENL_PREDS_DISTANCE, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(sub, v_super, inverseP, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)pph_templates.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)pph_templates.NIL;
            collision = cdolist_list_var.first();
            while (pph_templates.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (sub.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (v_super.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (inverseP.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (pph_templates.NIL != cached_args && pph_templates.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_genl_preds_distance_internal(sub, v_super, inverseP, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(sub, v_super, inverseP, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 73736L)
    public static SubLObject pph_phrase_template_generator_populate_gen_template_queue(final SubLObject generator) {
        final SubLObject sets_queue = pph_phrase_template_generator_gen_template_sets_queue(generator);
        SubLObject head = queues.dequeue(sets_queue);
        final SubLObject formula = pph_data_structures.pph_phrase_template_generator_formula(generator);
        final SubLObject inferior_setP = pph_inferior_template_set_p(head);
        final SubLObject inferior_templates = (SubLObject)((pph_templates.NIL != inferior_setP) ? pph_templates.NIL : new_pph_inferior_template_set());
        final SubLObject gen_templates_queue = pph_data_structures.pph_phrase_template_generator_gen_templates(generator);
        SubLObject inverseP = (SubLObject)pph_templates.NIL;
        if (head.isList() && pph_templates.$kw165$INVERSE == head.first()) {
            inverseP = (SubLObject)pph_templates.T;
            head = conses_high.second(head);
        }
        if (pph_templates.NIL != inferior_setP && pph_templates.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_templates.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_templates.T, (SubLObject)pph_templates.$str176$__Using_inferior_templates___, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
        }
        if (pph_templates.NIL != set.set_p(head)) {
            final SubLObject sorted_gen_templates = pph_sort_gen_templates_by_verbosity(list_utilities.remove_if_not((SubLObject)pph_templates.$sym177$GENERATION_TEMPLATE_P, set.set_element_list(head), (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED));
            if (pph_templates.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_templates.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_templates.T, (SubLObject)pph_templates.$str178$__Head_of_queue_____S__, sorted_gen_templates, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
            }
            SubLObject cdolist_list_var = sorted_gen_templates;
            SubLObject gen_template = (SubLObject)pph_templates.NIL;
            gen_template = cdolist_list_var.first();
            while (pph_templates.NIL != cdolist_list_var) {
                if (pph_templates.NIL == inferior_setP && (pph_templates.NIL != pph_template_not_precise_enoughP(gen_template, formula) || pph_templates.NIL == pph_methods_formulas.pph_phrase_has_focal_argnumP(pph_data_structures.get_gen_template_phrase(gen_template), pph_data_structures.pph_phrase_template_generator_focus_arg(generator)))) {
                    set.set_add(gen_template, inferior_templates);
                }
                else {
                    queues.enqueue((SubLObject)((pph_templates.NIL != inverseP) ? ConsesLow.list((SubLObject)pph_templates.$kw165$INVERSE, gen_template) : gen_template), gen_templates_queue);
                }
                cdolist_list_var = cdolist_list_var.rest();
                gen_template = cdolist_list_var.first();
            }
            if (pph_templates.NIL == inferior_setP && pph_templates.NIL == pph_inferior_template_set_emptyP(inferior_templates)) {
                if (pph_templates.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_templates.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_templates.T, (SubLObject)pph_templates.$str179$Sending_inferior_templates_to_end, set.set_element_list(inferior_templates), (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
                }
                queues.enqueue(inferior_templates, sets_queue);
            }
            if (pph_templates.NIL != queues.queue_empty_p(gen_templates_queue)) {
                if (pph_templates.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_templates.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_templates.T, (SubLObject)pph_templates.$str180$Couldn_t_use_any_gen_templates_fr, set.set_element_list(head), (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
                }
                pph_phrase_template_generator_populate_gen_template_queue(generator);
            }
        }
        else if (pph_templates.$kw161$GEN_FORMAT == head) {
            if (pph_templates.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_templates.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_templates.T, (SubLObject)pph_templates.$str181$__Reverting_to___genFormat_for__S, formula, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
            }
            queues.enqueue((SubLObject)pph_templates.$kw161$GEN_FORMAT, gen_templates_queue);
        }
        return gen_templates_queue;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 75889L)
    public static SubLObject new_pph_inferior_template_set() {
        return set_utilities.new_singleton_set((SubLObject)pph_templates.$kw182$INFERIOR, (SubLObject)pph_templates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 75978L)
    public static SubLObject pph_inferior_template_set_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_templates.NIL != set.set_p(v_object) && pph_templates.NIL != set.set_memberP((SubLObject)pph_templates.$kw182$INFERIOR, v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 76100L)
    public static SubLObject pph_inferior_template_set_emptyP(final SubLObject inferior_templates) {
        return Numbers.numLE(set.set_size(inferior_templates), (SubLObject)pph_templates.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 76217L)
    public static SubLObject pph_phrase_template_generator_populate_gen_template_sets_queue(final SubLObject generator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject next_reln = queues.dequeue(pph_phrase_template_generator_relns_to_use_queue(generator));
        final SubLObject gen_template_sets_queue = pph_data_structures.pph_phrase_template_generator_gen_template_sets(generator);
        SubLObject inverseP = (SubLObject)pph_templates.NIL;
        if (pph_templates.NIL != next_reln) {
            if (pph_templates.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_templates.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_templates.T, (SubLObject)pph_templates.$str183$__Populating_gen_template_sets_wi, next_reln, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
            }
            if (next_reln.isList() && pph_templates.$kw165$INVERSE == next_reln.first()) {
                inverseP = (SubLObject)pph_templates.T;
                next_reln = conses_high.second(next_reln);
            }
            final SubLObject formula = pph_data_structures.pph_phrase_template_generator_formula(generator);
            final SubLObject _prev_bind_0 = pph_vars.$pph_formula_for_generic_arg_replacement$.currentBinding(thread);
            try {
                pph_vars.$pph_formula_for_generic_arg_replacement$.bind(formula, thread);
                SubLObject arg_position_map = (SubLObject)pph_templates.NIL;
                SubLObject ignore_errors_tag = (SubLObject)pph_templates.NIL;
                try {
                    thread.throwStack.push(pph_templates.$kw184$IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_0_$163 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)pph_templates.$sym185$IGNORE_ERRORS_HANDLER), thread);
                        try {
                            arg_position_map = pph_data_structures.pph_phrase_template_generator_arg_position_map(generator);
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)pph_templates.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$163, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)pph_templates.$kw184$IGNORE_ERRORS_TARGET);
                }
                finally {
                    thread.throwStack.pop();
                }
                SubLObject cdolist_list_var = expanded_gen_template_sets_for_reln(next_reln, arg_position_map, (SubLObject)pph_templates.UNPROVIDED);
                SubLObject v_set = (SubLObject)pph_templates.NIL;
                v_set = cdolist_list_var.first();
                while (pph_templates.NIL != cdolist_list_var) {
                    queues.enqueue((SubLObject)((pph_templates.NIL != inverseP) ? ConsesLow.list((SubLObject)pph_templates.$kw165$INVERSE, v_set) : v_set), gen_template_sets_queue);
                    cdolist_list_var = cdolist_list_var.rest();
                    v_set = cdolist_list_var.first();
                }
                if (pph_templates.NIL != genformat_availableP(next_reln, formula, pph_data_structures.pph_phrase_template_generator_nl_preds(generator))) {
                    if (pph_templates.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_templates.ONE_INTEGER)) {
                        format_nil.force_format((SubLObject)pph_templates.T, (SubLObject)pph_templates.$str186$Adding__GEN_FORMAT_at_end_of_queu, next_reln, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
                    }
                    queues.enqueue((SubLObject)pph_templates.$kw161$GEN_FORMAT, gen_template_sets_queue);
                }
            }
            finally {
                pph_vars.$pph_formula_for_generic_arg_replacement$.rebind(_prev_bind_0, thread);
            }
        }
        return generator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 77580L)
    public static SubLObject pph_phrase_template_generator_gen_template_queue(final SubLObject generator) {
        final SubLObject queue = pph_data_structures.pph_phrase_template_generator_gen_templates(generator);
        if (pph_templates.NIL != queues.queue_empty_p(queue)) {
            pph_phrase_template_generator_populate_gen_template_queue(generator);
            return pph_data_structures.pph_phrase_template_generator_gen_templates(generator);
        }
        return queue;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 78286L)
    public static SubLObject pph_phrase_template_generator_gen_template_sets_queue(final SubLObject generator) {
        final SubLObject queue = pph_data_structures.pph_phrase_template_generator_gen_template_sets(generator);
        if (pph_templates.NIL != queues.queue_empty_p(queue)) {
            pph_phrase_template_generator_populate_gen_template_sets_queue(generator);
            return pph_data_structures.pph_phrase_template_generator_gen_template_sets(generator);
        }
        return queue;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 78814L)
    public static SubLObject pph_phrase_template_generator_relns_to_use_queue(final SubLObject generator) {
        return pph_data_structures.pph_phrase_template_generator_relns_to_use(generator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 79020L)
    public static SubLObject pph_phrase_templates_for_formula(final SubLObject formula, SubLObject wide_scope_arg, SubLObject best_onlyP, SubLObject nl_preds) {
        if (wide_scope_arg == pph_templates.UNPROVIDED) {
            wide_scope_arg = (SubLObject)pph_templates.NIL;
        }
        if (best_onlyP == pph_templates.UNPROVIDED) {
            best_onlyP = (SubLObject)pph_templates.NIL;
        }
        if (nl_preds == pph_templates.UNPROVIDED) {
            nl_preds = (SubLObject)pph_templates.$kw120$ANY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject templates = (SubLObject)pph_templates.NIL;
        SubLObject ans = (SubLObject)pph_templates.NIL;
        SubLObject doneP = (SubLObject)pph_templates.NIL;
        final SubLObject generator = pph_data_structures.get_pph_phrase_template_generator(formula, wide_scope_arg, (SubLObject)pph_templates.NIL, nl_preds, (SubLObject)pph_templates.NIL, (SubLObject)pph_templates.UNPROVIDED);
        while (pph_templates.NIL == doneP && pph_templates.NIL == pph_data_structures.pph_phrase_template_generator_done_p(generator)) {
            thread.resetMultipleValues();
            final SubLObject template = pph_phrase_template_generator_next(generator);
            final SubLObject ignore_me = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (pph_templates.NIL != pph_phrase.pph_phrase_p(template, (SubLObject)pph_templates.UNPROVIDED)) {
                if (template == pph_templates.$kw161$GEN_FORMAT) {
                    ans = (SubLObject)pph_templates.$kw161$GEN_FORMAT;
                    doneP = (SubLObject)pph_templates.T;
                }
                else if (pph_templates.NIL != best_onlyP) {
                    ans = (SubLObject)ConsesLow.list(template);
                    doneP = (SubLObject)pph_templates.T;
                }
                else {
                    templates = (SubLObject)ConsesLow.cons(template, templates);
                }
            }
        }
        pph_data_structures.free_pph_phrase_template_generator(generator);
        if (pph_templates.NIL != doneP) {
            return ans;
        }
        return Sequences.nreverse(templates);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 79741L)
    public static SubLObject pph_phrase_template_for_formula(final SubLObject formula, SubLObject wide_scope_arg, SubLObject nl_preds) {
        if (wide_scope_arg == pph_templates.UNPROVIDED) {
            wide_scope_arg = (SubLObject)pph_templates.NIL;
        }
        if (nl_preds == pph_templates.UNPROVIDED) {
            nl_preds = (SubLObject)pph_templates.$kw120$ANY;
        }
        final SubLObject pcase_var;
        final SubLObject result = pcase_var = pph_phrase_templates_for_formula(formula, wide_scope_arg, (SubLObject)pph_templates.T, nl_preds);
        if (pcase_var.eql((SubLObject)pph_templates.$kw161$GEN_FORMAT) || pcase_var.eql((SubLObject)pph_templates.NIL)) {
            return result;
        }
        if (pcase_var.eql((SubLObject)pph_templates.$sym187$CAND) || pcase_var.eql((SubLObject)pph_templates.$list188) || pcase_var.eql((SubLObject)pph_templates.$list189)) {
            return pph_phrase_templates_for_formula(formula, wide_scope_arg, (SubLObject)pph_templates.NIL, (SubLObject)pph_templates.UNPROVIDED);
        }
        return result.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 80350L)
    public static SubLObject pph_best_phrase_template_for_formula_wXreln(final SubLObject formula, final SubLObject reln, final SubLObject arg_position_map, SubLObject inverseP, SubLObject wide_scope_argnum) {
        if (inverseP == pph_templates.UNPROVIDED) {
            inverseP = (SubLObject)pph_templates.NIL;
        }
        if (wide_scope_argnum == pph_templates.UNPROVIDED) {
            wide_scope_argnum = (SubLObject)pph_templates.NIL;
        }
        SubLObject result = pph_phrase_templates_for_formula_wXreln(formula, reln, arg_position_map, inverseP, wide_scope_argnum, (SubLObject)pph_templates.UNPROVIDED);
        if (pph_templates.NIL == result && pph_templates.NIL != genformat_availableP(reln, formula, (SubLObject)pph_templates.UNPROVIDED)) {
            result = (SubLObject)pph_templates.$kw161$GEN_FORMAT;
        }
        return result.isList() ? result.first() : result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 80923L)
    public static SubLObject genformat_availableP(final SubLObject reln, SubLObject formula, SubLObject nl_preds) {
        if (formula == pph_templates.UNPROVIDED) {
            formula = (SubLObject)pph_templates.NIL;
        }
        if (nl_preds == pph_templates.UNPROVIDED) {
            nl_preds = (SubLObject)pph_templates.$kw120$ANY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)pph_templates.NIL;
        if (pph_templates.NIL != kb_indexing_datastructures.indexed_term_p(reln)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (pph_templates.NIL == ans) {
                    SubLObject csome_list_var = (SubLObject)pph_templates.$list191;
                    SubLObject gf_pred = (SubLObject)pph_templates.NIL;
                    gf_pred = csome_list_var.first();
                    while (pph_templates.NIL == ans && pph_templates.NIL != csome_list_var) {
                        final SubLObject _prev_bind_0_$164 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                        try {
                            pred_relevance_macros.$relevant_pred_function$.bind((SubLObject)pph_templates.$sym190$RELEVANT_PRED_IS_EVERYTHING, thread);
                            final SubLObject pred_var = gf_pred;
                            if (pph_templates.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(reln, (SubLObject)pph_templates.NIL, pred_var)) {
                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(reln, (SubLObject)pph_templates.NIL, pred_var);
                                SubLObject done_var = ans;
                                final SubLObject token_var = (SubLObject)pph_templates.NIL;
                                while (pph_templates.NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                    if (pph_templates.NIL != valid) {
                                        SubLObject final_index_iterator = (SubLObject)pph_templates.NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)pph_templates.$kw31$GAF, (SubLObject)pph_templates.$kw35$TRUE, (SubLObject)pph_templates.NIL);
                                            SubLObject done_var_$165 = ans;
                                            final SubLObject token_var_$166 = (SubLObject)pph_templates.NIL;
                                            while (pph_templates.NIL == done_var_$165) {
                                                final SubLObject gf_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$166);
                                                final SubLObject valid_$167 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$166.eql(gf_gaf));
                                                if (pph_templates.NIL != valid_$167) {
                                                    ans = (SubLObject)SubLObjectFactory.makeBoolean(pph_templates.NIL == formula || pph_templates.NIL != pph_methods_formulas.genformat_assertion_fits_formulaP(gf_gaf, formula, nl_preds));
                                                }
                                                done_var_$165 = (SubLObject)SubLObjectFactory.makeBoolean(pph_templates.NIL == valid_$167 || pph_templates.NIL != ans);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$165 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_templates.T, thread);
                                                final SubLObject _values = Values.getValuesAsVector();
                                                if (pph_templates.NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                Values.restoreValuesFromVector(_values);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$165, thread);
                                            }
                                        }
                                    }
                                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(pph_templates.NIL == valid || pph_templates.NIL != ans);
                                }
                            }
                        }
                        finally {
                            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0_$164, thread);
                        }
                        csome_list_var = csome_list_var.rest();
                        gf_pred = csome_list_var.first();
                    }
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 81526L)
    public static SubLObject pph_template_phrase_set_cycl(final SubLObject phrase, final SubLObject formula, SubLObject arg_position_map, SubLObject formula_is_templateP) {
        if (arg_position_map == pph_templates.UNPROVIDED) {
            arg_position_map = (SubLObject)pph_templates.NIL;
        }
        if (formula_is_templateP == pph_templates.UNPROVIDED) {
            formula_is_templateP = (SubLObject)pph_templates.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_templates.NIL == pph_phrase.pph_phrase_p(phrase, (SubLObject)pph_templates.UNPROVIDED)) {
            return phrase;
        }
        if (pph_templates.NIL != pph_phrase.pph_phrase_has_dtrsP(phrase)) {
            pph_phrase.pph_phrase_set_arg_position_map(phrase, arg_position_map);
            if (pph_templates.NIL == formula_is_templateP) {
                pph_phrase.pph_phrase_set_cycl(phrase, formula);
                pph_phrase.pph_phrase_try_to_resolve_binding_phrases(phrase, (SubLObject)pph_templates.UNPROVIDED);
            }
            final SubLObject _prev_bind_0 = pph_vars.$pph_keep_generic_argsP$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pph_vars.$pph_formula_for_generic_arg_replacement$.currentBinding(thread);
            try {
                pph_vars.$pph_keep_generic_argsP$.bind((SubLObject)SubLObjectFactory.makeBoolean(pph_templates.NIL == formula_is_templateP), thread);
                pph_vars.$pph_formula_for_generic_arg_replacement$.bind(formula, thread);
                pph_phrase_resolution.pph_phrase_replace_generic_args(phrase, formula, arg_position_map);
            }
            finally {
                pph_vars.$pph_formula_for_generic_arg_replacement$.rebind(_prev_bind_2, thread);
                pph_vars.$pph_keep_generic_argsP$.rebind(_prev_bind_0, thread);
            }
            pph_phrase.pph_phrase_sanity_check_cycl(phrase);
        }
        else {
            final SubLObject template_cycl = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_templates.UNPROVIDED);
            if (pph_templates.NIL == pph_types.pph_phrase_nautP(template_cycl)) {
                pph_utilities.pph_reset_precision(template_cycl);
            }
            pph_phrase.pph_phrase_set_cycl(phrase, formula);
            pph_phrase.pph_phrase_set_arg_position_map(phrase, arg_position_map);
            pph_phrase.pph_phrase_try_to_resolve_binding_phrases(phrase, (SubLObject)pph_templates.UNPROVIDED);
            pph_phrase.pph_phrase_reset_cycl(phrase, template_cycl);
            if (pph_templates.NIL != formula_is_templateP) {
                pph_phrase_check_for_infinite_recursion(phrase, formula);
            }
        }
        return pph_phrase.pph_phrase_arg_position_map(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 82931L)
    public static SubLObject pph_template_note_reln_used(final SubLObject formula, final SubLObject reln_used) {
        final SubLObject actual_reln = function_terms.naut_to_nart(cycl_utilities.formula_operator(formula));
        if (pph_templates.NIL != reln_used && !reln_used.eql(actual_reln) && pph_templates.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_templates.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_templates.T, (SubLObject)pph_templates.$str192$__Couldn_t_find_paraphrase_templa, actual_reln, reln_used, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
        }
        return (SubLObject)pph_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 83322L)
    public static SubLObject pph_phrase_check_for_infinite_recursion(final SubLObject phrase, final SubLObject formula) {
        if (formula.equal(pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_templates.UNPROVIDED))) {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_templates.$str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_templates.ONE_INTEGER), pph_templates.$str1$__, format_nil.format_nil_a_no_copy((SubLObject)pph_templates.$str193$Infinite_recursion_for__S_using__) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(formula, pph_phrase.pph_phrase_justification(phrase)));
        }
        return (SubLObject)pph_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 83641L)
    public static SubLObject pph_formula_has_gf_arg_fixedP(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject csome_list_var = pph_gfaf_assertions_for_reln(cycl_utilities.formula_operator(formula), pph_vars.$pph_language_mt$.getDynamicValue(thread));
        SubLObject as = (SubLObject)pph_templates.NIL;
        as = csome_list_var.first();
        while (pph_templates.NIL != csome_list_var) {
            if (pph_templates.NIL != pph_utilities.genformat_arg_fixed_matches_argsP(as, cycl_utilities.formula_args(formula, (SubLObject)pph_templates.UNPROVIDED)) && pph_templates.NIL != genformat_arg_fixed_precision_okP(as)) {
                return (SubLObject)pph_templates.T;
            }
            csome_list_var = csome_list_var.rest();
            as = csome_list_var.first();
        }
        return (SubLObject)pph_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 83944L)
    public static SubLObject pph_gfaf_assertions_for_reln_internal(final SubLObject reln, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)pph_templates.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            ans = kb_mapping.gather_gaf_arg_index_with_predicate(reln, (SubLObject)pph_templates.ONE_INTEGER, pph_templates.$const129$genFormat_ArgFixed, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 83944L)
    public static SubLObject pph_gfaf_assertions_for_reln(final SubLObject reln, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_templates.NIL;
        if (pph_templates.NIL == v_memoization_state) {
            return pph_gfaf_assertions_for_reln_internal(reln, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_templates.$sym194$PPH_GFAF_ASSERTIONS_FOR_RELN, (SubLObject)pph_templates.UNPROVIDED);
        if (pph_templates.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_templates.$sym194$PPH_GFAF_ASSERTIONS_FOR_RELN, (SubLObject)pph_templates.TWO_INTEGER, (SubLObject)pph_templates.$int195$250, (SubLObject)pph_templates.EQL, (SubLObject)pph_templates.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_templates.$sym194$PPH_GFAF_ASSERTIONS_FOR_RELN, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(reln, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)pph_templates.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)pph_templates.NIL;
            collision = cdolist_list_var.first();
            while (pph_templates.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (reln.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pph_templates.NIL != cached_args && pph_templates.NIL == cached_args.rest() && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_gfaf_assertions_for_reln_internal(reln, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(reln, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 84182L)
    public static SubLObject genformat_arg_fixed_precision_okP(final SubLObject as) {
        final SubLObject precision = pph_utilities.pph_current_precision();
        SubLObject badP = (SubLObject)pph_templates.NIL;
        if (pph_templates.NIL != precision) {
            SubLObject arg_order_list = Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)pph_templates.ONE_INTEGER), pph_methods_formulas.get_genformat_string_and_list(as));
            final SubLObject reln = assertions_high.gaf_arg1(as);
            final SubLObject v_arity = pph_utilities.pph_arity(reln);
            arg_order_list = pph_methods_formulas.regularize_genformat_arglist(arg_order_list, v_arity);
            SubLObject argnum;
            for (argnum = (SubLObject)pph_templates.NIL, argnum = (SubLObject)pph_templates.ONE_INTEGER; !argnum.numG(v_arity) && pph_templates.NIL == badP; argnum = number_utilities.f_1X(argnum)) {}
            if (pph_templates.NIL == subl_promotions.memberP(argnum, arg_order_list, Symbols.symbol_function((SubLObject)pph_templates.EQL), Symbols.symbol_function((SubLObject)pph_templates.$sym196$CAR))) {
                badP = (SubLObject)pph_templates.T;
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_templates.NIL == badP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 84717L)
    public static SubLObject pph_relation_has_gf_preciseP(final SubLObject relation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)pph_templates.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            ans = kb_mapping_utilities.some_pred_value(relation, pph_templates.$const197$genFormat_Precise, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 84915L)
    public static SubLObject pph_phrase_from_gen_template_satisfying_constraints(final SubLObject template, final SubLObject formula, final SubLObject inverseP, final SubLObject focus_argnum, final SubLObject nl_preds) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_templates.NIL == pph_template_appliesP(template, formula, inverseP, nl_preds)) {
            return (SubLObject)pph_templates.$str198$Template_doesn_t_apply_to_input_f;
        }
        final SubLObject phrase = pph_phrase_from_gen_template(template, inverseP);
        if (pph_templates.NIL != pph_methods_formulas.pph_phrase_has_focal_argnumP(phrase, focus_argnum)) {
            return phrase;
        }
        if (pph_templates.NIL == focus_argnum || pph_templates.NIL == fort_types_interface.symmetric_binary_predicate_p(cycl_utilities.formula_arg0(formula))) {
            pph_phrase.pph_phrase_increment_top_level_demerits(phrase, (SubLObject)pph_templates.TWO_INTEGER, PrintLow.format((SubLObject)pph_templates.NIL, (SubLObject)pph_templates.$str201$wrong_focal_argnum__wanted__S_, focus_argnum));
            if (pph_templates.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_templates.ONE_INTEGER) && pph_templates.NIL == pph_error.suppress_pph_warningsP()) {
                Errors.warn((SubLObject)pph_templates.$str202$Template_has_wrong_scope_for__S, focus_argnum);
                streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
            return phrase;
        }
        if (pph_templates.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_templates.TWO_INTEGER)) {
            format_nil.force_format((SubLObject)pph_templates.T, (SubLObject)pph_templates.$str199$___S_is_a_symmetric_binary_predic, cycl_utilities.formula_arg0(formula), (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
        }
        final SubLObject switched = pph_phrase_from_gen_template(template, (SubLObject)SubLObjectFactory.makeBoolean(pph_templates.NIL == inverseP));
        if (pph_templates.NIL != pph_methods_formulas.pph_phrase_has_focal_argnumP(switched, focus_argnum)) {
            if (pph_templates.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_templates.TWO_INTEGER)) {
                format_nil.force_format((SubLObject)pph_templates.T, (SubLObject)pph_templates.$str200$__Switching_arg1_and_arg2_in_phra, cycl_utilities.formula_arg0(pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_templates.UNPROVIDED)), (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
            }
            return switched;
        }
        return (SubLObject)pph_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 86299L)
    public static SubLObject clear_gen_template_verbosity() {
        final SubLObject cs = pph_templates.$gen_template_verbosity_caching_state$.getGlobalValue();
        if (pph_templates.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)pph_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 86299L)
    public static SubLObject remove_gen_template_verbosity(final SubLObject template) {
        return memoization_state.caching_state_remove_function_results_with_args(pph_templates.$gen_template_verbosity_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(template), (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 86299L)
    public static SubLObject gen_template_verbosity_internal(final SubLObject template) {
        return pph_phrase.pph_phrase_verbosity(pph_data_structures.get_gen_template_phrase(template));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 86299L)
    public static SubLObject gen_template_verbosity(final SubLObject template) {
        SubLObject caching_state = pph_templates.$gen_template_verbosity_caching_state$.getGlobalValue();
        if (pph_templates.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)pph_templates.$sym159$GEN_TEMPLATE_VERBOSITY, (SubLObject)pph_templates.$sym203$_GEN_TEMPLATE_VERBOSITY_CACHING_STATE_, (SubLObject)pph_templates.$int204$10000, (SubLObject)pph_templates.EQL, (SubLObject)pph_templates.ONE_INTEGER, (SubLObject)pph_templates.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, template, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(gen_template_verbosity_internal(template)));
            memoization_state.caching_state_put(caching_state, template, results, (SubLObject)pph_templates.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 86453L)
    public static SubLObject pph_template_has_constraintP(final SubLObject template) {
        return list_utilities.sublisp_boolean(pph_data_structures.get_gen_template_constraint(template));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 86570L)
    public static SubLObject pph_phrase_from_gen_template(final SubLObject template, final SubLObject inverseP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject old_phrase = pph_data_structures.get_gen_template_phrase(template);
        SubLObject new_phrase = (SubLObject)pph_templates.NIL;
        if (pph_templates.NIL != pph_phrase.pph_phrase_p(old_phrase, (SubLObject)pph_templates.UNPROVIDED)) {
            new_phrase = pph_phrase.pph_phrase_copy(old_phrase, (SubLObject)pph_templates.NIL, (SubLObject)pph_templates.T);
            if (pph_templates.NIL != inverseP) {
                final SubLObject successP = pph_phrase_resolution.pph_phrase_switch_arg1_and_arg2_in_dtrs(new_phrase);
                if (pph_templates.NIL == successP) {
                    if (pph_templates.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_templates.ONE_INTEGER) && pph_templates.NIL == pph_error.suppress_pph_warningsP()) {
                        Errors.warn((SubLObject)pph_templates.$str205$Couldn_t_swtich_arg1_and_arg2___i, new_phrase);
                        streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                    }
                    new_phrase = (SubLObject)pph_templates.NIL;
                }
            }
            pph_phrase.pph_phrase_check_impossible(old_phrase, (SubLObject)pph_templates.UNPROVIDED);
        }
        return new_phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 87099L)
    public static SubLObject pph_template_appliesP(final SubLObject template, final SubLObject formula, final SubLObject inverseP, SubLObject nl_preds) {
        if (nl_preds == pph_templates.UNPROVIDED) {
            nl_preds = (SubLObject)pph_templates.$kw120$ANY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject phrase = pph_data_structures.get_gen_template_phrase(template);
        if (pph_templates.NIL == pph_utilities.pph_genl_mtP(pph_vars.$pph_language_mt$.getDynamicValue(thread), pph_data_structures.get_gen_template_mt(template))) {
            if (pph_templates.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_templates.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_templates.T, (SubLObject)pph_templates.$str206$Gen_template_mt__S_not_visible_fr, pph_data_structures.get_gen_template_mt(template), pph_vars.$pph_language_mt$.getDynamicValue(thread), (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
            }
            return (SubLObject)pph_templates.NIL;
        }
        if (pph_templates.NIL == pph_template_phrase_ok_for_predsP(phrase, nl_preds)) {
            if (pph_templates.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_templates.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_templates.T, (SubLObject)pph_templates.$str207$Gen_template_preds__S_not_compati, pph_phrase.pph_phrase_compatible_agr_preds(phrase), nl_preds, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
            }
            return (SubLObject)pph_templates.NIL;
        }
        if (pph_templates.NIL == pph_template_has_constraintP(template)) {
            return (SubLObject)pph_templates.T;
        }
        return gen_template_constraint_passesP(template, formula, inverseP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 87953L)
    public static SubLObject pph_template_phrase_ok_for_predsP(final SubLObject phrase, final SubLObject nl_preds) {
        if (pph_templates.$kw120$ANY.eql(nl_preds)) {
            return (SubLObject)pph_templates.T;
        }
        if (pph_templates.NIL != pph_phrase_resolution.pph_phrase_determinerP(phrase) || pph_templates.NIL != pph_phrase_resolution.pph_phrase_detpP(phrase)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(pph_templates.NIL != pph_utilities.pph_filter_preds(pph_phrase.pph_phrase_compatible_agr_preds(phrase), (SubLObject)pph_templates.$list208, (SubLObject)pph_templates.UNPROVIDED));
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_templates.NIL != pph_utilities.pph_filter_preds(pph_phrase.pph_phrase_compatible_agr_preds(phrase), nl_preds, (SubLObject)pph_templates.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 88374L)
    public static SubLObject gen_template_constraint_passesP(final SubLObject template, final SubLObject formula, final SubLObject inverseP) {
        final SubLObject constraint_template = pph_data_structures.get_gen_template_constraint(template);
        return gen_template_constraint_passesP_internal(constraint_template, formula, inverseP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 88690L)
    public static SubLObject gen_template_constraint_passesP_internal(final SubLObject constraint_template, final SubLObject formula, final SubLObject inverseP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject constraint = pph_utilities.pph_apply_template(constraint_template, formula);
        if (pph_templates.NIL != inverseP) {
            constraint = pph_utilities.pph_switch_arg1_and_arg2(constraint);
        }
        final SubLObject test_result = (SubLObject)((pph_templates.NIL != clauses.clauses_p(constraint)) ? pph_utilities.pph_test_dnf(constraint) : ((pph_templates.NIL != pph_utilities.pph_ask_boolean(constraint, pph_vars.$pph_domain_mt$.getDynamicValue(thread), (SubLObject)pph_templates.UNPROVIDED)) ? pph_templates.$kw35$TRUE : pph_templates.$kw209$UNKNOWN));
        return Equality.eq(test_result, (SubLObject)pph_templates.$kw35$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 89140L)
    public static SubLObject pph_template_not_precise_enoughP(final SubLObject template, final SubLObject formula) {
        if (pph_templates.NIL != pph_utilities.pph_current_precision() && pph_templates.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_templates.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_templates.T, (SubLObject)pph_templates.$str210$__Checking_precision_of__S_vs___S, pph_phrase.pph_phrase_justification(pph_data_structures.get_gen_template_phrase(template)), pph_utilities.pph_current_precision(), (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
        }
        if (pph_templates.NIL != pph_formula_has_gf_arg_fixedP(formula) && pph_templates.NIL == pph_template_has_constraintP(template)) {
            if (pph_templates.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_templates.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_templates.T, (SubLObject)pph_templates.$str211$Not_using___genTemplate_because_o, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
            }
            return (SubLObject)pph_templates.T;
        }
        if (pph_templates.NIL == formula || (pph_templates.NIL == pph_utilities.pph_current_precision() && pph_templates.NIL == pph_vars.pph_maximize_linksP())) {
            return (SubLObject)pph_templates.NIL;
        }
        final SubLObject phrase = pph_data_structures.get_gen_template_phrase(template);
        if (pph_templates.NIL != pph_utilities.pph_precise_in_argP((SubLObject)pph_templates.ZERO_INTEGER) || pph_templates.NIL != pph_vars.pph_maximize_linksP()) {
            return (SubLObject)SubLObjectFactory.makeBoolean(pph_templates.NIL == pph_phrase_references_all_argsP(phrase, formula));
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_templates.NIL == pph_phrase_references_precise_argsP(phrase, formula));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 90026L)
    public static SubLObject pph_phrase_references_all_argsP(final SubLObject phrase, final SubLObject formula) {
        return pph_phrase_references_argsP(phrase, formula, (SubLObject)pph_templates.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 90150L)
    public static SubLObject pph_phrase_references_precise_argsP(final SubLObject phrase, final SubLObject formula) {
        return pph_phrase_references_argsP(phrase, formula, (SubLObject)pph_templates.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 90280L)
    public static SubLObject pph_phrase_references_argsP(final SubLObject phrase, final SubLObject formula, final SubLObject allP) {
        SubLObject i = (SubLObject)pph_templates.NIL;
        SubLObject curr_arg = (SubLObject)pph_templates.NIL;
        i = (SubLObject)pph_templates.ONE_INTEGER;
        curr_arg = at_utilities.get_generic_arg(i);
        while (!i.numG(el_utilities.formula_arity(formula, (SubLObject)pph_templates.UNPROVIDED))) {
            final SubLObject skipP = (SubLObject)SubLObjectFactory.makeBoolean(pph_templates.NIL == allP && pph_templates.NIL == pph_utilities.pph_precise_in_argP(i));
            final SubLObject okP = (SubLObject)SubLObjectFactory.makeBoolean(pph_templates.NIL != skipP || pph_templates.NIL != pph_phrase_references_argP(phrase, curr_arg));
            if (pph_templates.NIL == okP) {
                if (pph_templates.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_templates.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_templates.T, (SubLObject)pph_templates.$str212$__Template_judged_imprecise_becau, curr_arg, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
                }
                return (SubLObject)pph_templates.NIL;
            }
            i = number_utilities.f_1X(i);
            curr_arg = at_utilities.get_generic_arg(i);
        }
        return (SubLObject)pph_templates.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 90798L)
    public static SubLObject pph_phrase_references_argP(final SubLObject phrase, final SubLObject arg) {
        SubLObject okP = (SubLObject)pph_templates.NIL;
        if (pph_templates.NIL != pph_phrase.pph_repeated_phrase_p(phrase)) {
            okP = pph_phrase.pph_repeated_phrase_references_argP(phrase, arg);
        }
        else if (pph_templates.NIL != pph_phrase.pph_phrase_has_dtrsP(phrase)) {
            SubLObject dtr_num = (SubLObject)pph_templates.ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = (SubLObject)pph_templates.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_templates.NIL, v_iteration = (SubLObject)pph_templates.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_templates.ONE_INTEGER)) {
                    element_num = ((pph_templates.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_templates.ONE_INTEGER) : v_iteration);
                    dtr = Vectors.aref(vector_var, element_num);
                    if (pph_templates.NIL == okP) {
                        if (pph_templates.NIL == pph_phrase.pph_phrase_equal(dtr, phrase)) {
                            okP = pph_phrase_references_argP(dtr, arg);
                        }
                    }
                    dtr_num = Numbers.add(dtr_num, (SubLObject)pph_templates.ONE_INTEGER);
                }
            }
        }
        else if (pph_templates.NIL != cycl_utilities.expression_find(arg, pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_templates.UNPROVIDED), (SubLObject)pph_templates.NIL, Symbols.symbol_function((SubLObject)pph_templates.EQUAL), (SubLObject)pph_templates.UNPROVIDED)) {
            okP = (SubLObject)pph_templates.T;
        }
        else if (pph_templates.NIL != pph_utilities.pph_cycl_template_p(arg) && pph_templates.NIL != pph_phrase_references_arg_positionP(phrase, pph_utilities.pph_arg_position_from_template(arg))) {
            okP = (SubLObject)pph_templates.T;
        }
        return okP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 91565L)
    public static SubLObject pph_phrase_references_arg_positionP(final SubLObject phrase, final SubLObject arg_position) {
        SubLObject cdolist_list_var;
        final SubLObject olist = cdolist_list_var = pph_phrase.pph_phrase_output_list(phrase);
        SubLObject item = (SubLObject)pph_templates.NIL;
        item = cdolist_list_var.first();
        while (pph_templates.NIL != cdolist_list_var) {
            if (arg_position.equal(pph_data_structures.pph_phrase_output_item_arg_position(item))) {
                return (SubLObject)pph_templates.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return (SubLObject)pph_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 91818L)
    public static SubLObject formula_has_gen_template_constrainedP(final SubLObject formula) {
        final SubLObject reln = cycl_utilities.formula_arg0(formula);
        SubLObject ans = (SubLObject)pph_templates.NIL;
        if (pph_templates.NIL == ans) {
            SubLObject csome_list_var = gen_template_sets_for_reln(reln, (SubLObject)pph_templates.UNPROVIDED);
            SubLObject v_set = (SubLObject)pph_templates.NIL;
            v_set = csome_list_var.first();
            while (pph_templates.NIL == ans && pph_templates.NIL != csome_list_var) {
                final SubLObject set_contents_var = set.do_set_internal(v_set);
                SubLObject basis_object;
                SubLObject state;
                SubLObject template;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)pph_templates.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); pph_templates.NIL == ans && pph_templates.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    template = set_contents.do_set_contents_next(basis_object, state);
                    if (pph_templates.NIL != set_contents.do_set_contents_element_validP(state, template)) {
                        ans = (SubLObject)SubLObjectFactory.makeBoolean(pph_templates.NIL != pph_template_has_constraintP(template) && pph_templates.NIL != pph_template_appliesP(template, formula, (SubLObject)pph_templates.NIL, (SubLObject)pph_templates.UNPROVIDED));
                    }
                }
                csome_list_var = csome_list_var.rest();
                v_set = csome_list_var.first();
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 92903L)
    public static SubLObject pph_tersify(final SubLObject original) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return reformulator_hub.reformulate_cycl(original, pph_vars.$pph_language_mt$.getDynamicValue(thread), (SubLObject)pph_templates.$list213);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 94235L)
    public static SubLObject pph_tersify_gentemplate_formula(final SubLObject original) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_new = pph_tersify(original);
        final SubLObject history = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return (pph_templates.NIL == history || pph_templates.NIL != pph_template_formula_non_wfP(v_new, (SubLObject)pph_templates.UNPROVIDED)) ? Values.values(original, (SubLObject)pph_templates.NIL) : Values.values(v_new, history);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 94565L)
    public static SubLObject pph_deepen_phrase_naut(final SubLObject phrase_naut) {
        SubLObject deepest = phrase_naut;
        SubLObject history = (SubLObject)pph_templates.NIL;
        SubLObject store = (SubLObject)pph_templates.NIL;
        try {
            for (store = inference_datastructures_problem_store.new_problem_store((SubLObject)pph_templates.$list214); pph_templates.NIL == Sequences.find(deepest, history, Symbols.symbol_function((SubLObject)pph_templates.EQUAL), (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED); history = (SubLObject)ConsesLow.cons(deepest, history), deepest = pph_deepen_phrase_naut_once(deepest, store)) {}
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)pph_templates.T);
                final SubLObject _values = Values.getValuesAsVector();
                inference_datastructures_problem_store.destroy_problem_store(store);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return deepest;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 94891L)
    public static SubLObject pph_deepen_phrase_naut_once(final SubLObject phrase_naut, SubLObject problem_store) {
        if (problem_store == pph_templates.UNPROVIDED) {
            problem_store = (SubLObject)pph_templates.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject deeper = pph_phrase_naut_deepening_candidates(phrase_naut, pph_vars.$pph_language_mt$.getDynamicValue(thread), problem_store).first();
        if (pph_templates.NIL != deeper) {
            Errors.warn((SubLObject)pph_templates.$str215$Deepened____S___to__S, phrase_naut, deeper);
        }
        return (pph_templates.NIL != deeper) ? deeper : phrase_naut;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 95191L)
    public static SubLObject pph_phrase_naut_deepening_candidates(final SubLObject phrase_naut, SubLObject mt, SubLObject problem_store) {
        if (mt == pph_templates.UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (problem_store == pph_templates.UNPROVIDED) {
            problem_store = (SubLObject)pph_templates.NIL;
        }
        return pph_utilities.pph_query((SubLObject)ConsesLow.listS(pph_templates.$const216$deeperGenTemplateRecipe, phrase_naut, (SubLObject)pph_templates.$list217), mt, phrase_naut_deepening_inference_properties(problem_store));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 95857L)
    public static SubLObject phrase_naut_deepening_inference_properties(final SubLObject problem_store) {
        SubLObject v_properties = conses_high.copy_list(pph_templates.$phrase_naut_deepening_inference_properties$.getGlobalValue());
        if (pph_templates.NIL != inference_datastructures_problem_store.valid_problem_store_p(problem_store)) {
            v_properties = conses_high.putf(v_properties, (SubLObject)pph_templates.$kw230$PROBLEM_STORE, problem_store);
        }
        else {
            v_properties = conses_high.putf(v_properties, (SubLObject)pph_templates.$kw231$INTERMEDIATE_STEP_VALIDATION_LEVEL, (SubLObject)pph_templates.$kw232$NONE);
        }
        return v_properties;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 96209L)
    public static SubLObject pph_phrasify_phrase_naut(final SubLObject phrase_naut, SubLObject arg_position_map) {
        if (arg_position_map == pph_templates.UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_empty_map();
        }
        if (pph_templates.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_templates.TWO_INTEGER)) {
            format_nil.force_format((SubLObject)pph_templates.T, (SubLObject)pph_templates.$str233$__Phrasifying__S___, phrase_naut, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
        }
        final SubLObject v_pph_phrase = pph_phrase_from_gentemplate_phrase(phrase_naut, arg_position_map);
        if (pph_templates.NIL != pph_phrase.pph_phrase_p(v_pph_phrase, (SubLObject)pph_templates.UNPROVIDED)) {
            pph_phrase_dereference_nth_phrases(v_pph_phrase);
        }
        return v_pph_phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 96584L)
    public static SubLObject pph_plist_for_phrase_naut(final SubLObject phrase_naut) {
        if (pph_templates.NIL != kb_utilities.kbeq(cycl_utilities.nat_functor(phrase_naut), pph_functions.termparaphrasefn_temporallocation())) {
            return (SubLObject)pph_templates.$list234;
        }
        return (SubLObject)pph_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 96838L)
    public static SubLObject pph_expand_phrase_nauts(final SubLObject cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans_var = (SubLObject)pph_templates.NIL;
        try {
            thread.throwStack.push(pph_templates.$kw235$DO_PPH_EXPAND_PHRASE_NAUTS_RECURSION_LIMIT);
            final SubLObject expanded = do_pph_expand_phrase_nauts(cycl);
            if (!cycl.equal(expanded) && pph_templates.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_templates.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_templates.T, (SubLObject)pph_templates.$str236$__Expanded_form_is__S___, expanded, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
            }
            return expanded;
        }
        catch (Throwable ccatch_env_var) {
            ans_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)pph_templates.$kw235$DO_PPH_EXPAND_PHRASE_NAUTS_RECURSION_LIMIT);
            thread.throwStack.pop();
            if (pph_templates.NIL != ans_var) {
                final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_templates.$str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_templates.ONE_INTEGER), pph_templates.$str1$__, format_nil.format_nil_a_no_copy((SubLObject)pph_templates.$str238$Recursion_limit_exceeded_expandin) });
                pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(cycl, ans_var));
            }
            return cycl;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 97293L)
    public static SubLObject do_pph_expand_phrase_nauts(final SubLObject cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cycl.isAtom()) {
            return cycl;
        }
        final SubLObject expanded_cycl = pph_expand_phrase_nauts_top_level(cycl, (SubLObject)pph_templates.UNPROVIDED);
        if (pph_templates.NIL != list_utilities.lengthGE(pph_templates.$do_pph_expand_phrase_nauts_stack$.getDynamicValue(thread), (SubLObject)pph_templates.$int239$50, (SubLObject)pph_templates.UNPROVIDED)) {
            Dynamic.sublisp_throw((SubLObject)pph_templates.$kw235$DO_PPH_EXPAND_PHRASE_NAUTS_RECURSION_LIMIT, expanded_cycl);
            return (SubLObject)pph_templates.NIL;
        }
        if (pph_templates.NIL != subl_promotions.memberP(cycl, pph_templates.$do_pph_expand_phrase_nauts_stack$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)pph_templates.EQUAL), (SubLObject)pph_templates.UNPROVIDED)) {
            if (pph_templates.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_templates.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_templates.T, (SubLObject)pph_templates.$str240$Already_expanded__S, expanded_cycl, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
            }
            return cycl;
        }
        if (pph_templates.NIL != el_utilities.el_formula_p(expanded_cycl)) {
            final SubLObject _prev_bind_0 = pph_templates.$do_pph_expand_phrase_nauts_stack$.currentBinding(thread);
            try {
                pph_templates.$do_pph_expand_phrase_nauts_stack$.bind((SubLObject)ConsesLow.cons(cycl, pph_templates.$do_pph_expand_phrase_nauts_stack$.getDynamicValue(thread)), thread);
                return el_utilities.map_formula_terms((SubLObject)pph_templates.$sym241$DO_PPH_EXPAND_PHRASE_NAUTS, expanded_cycl, (SubLObject)pph_templates.UNPROVIDED);
            }
            finally {
                pph_templates.$do_pph_expand_phrase_nauts_stack$.rebind(_prev_bind_0, thread);
            }
        }
        return expanded_cycl;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 98018L)
    public static SubLObject pph_expand_phrase_nauts_top_level(SubLObject cycl, SubLObject arg_position_map) {
        if (arg_position_map == pph_templates.UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_empty_map();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stopP = (SubLObject)pph_templates.NIL;
        while (pph_templates.NIL == stopP && pph_templates.NIL != pph_types.pph_expandible_phrase_nautP(cycl, pph_vars.$pph_language_mt$.getDynamicValue(thread))) {
            final SubLObject expansion_template = pph_utilities.find_el_macro_expansion(cycl, pph_vars.$pph_language_mt$.getDynamicValue(thread));
            if (pph_templates.NIL != cycl_utilities.expression_find_if((SubLObject)pph_templates.$sym242$PPH_IDENTITY_TEMPLATE_P, expansion_template, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED)) {
                final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_templates.$str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_templates.ONE_INTEGER), pph_templates.$str1$__, format_nil.format_nil_a_no_copy((SubLObject)pph_templates.$str243$Expansions_that_refer_to__S_tend_) });
                pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(pph_utilities.pph_identity_template(), cycl, expansion_template));
            }
            else if (pph_templates.NIL != pph_utilities.pph_cycl_template_p(expansion_template)) {
                final SubLObject _prev_bind_0 = pph_vars.$pph_error_on_bad_templatesP$.currentBinding(thread);
                try {
                    pph_vars.$pph_error_on_bad_templatesP$.bind((SubLObject)pph_templates.T, thread);
                    SubLObject error_message = (SubLObject)pph_templates.NIL;
                    try {
                        thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0_$169 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind((SubLObject)pph_templates.$sym37$CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                final SubLObject expanded = cycl = pph_utilities.pph_apply_template(expansion_template, cycl);
                            }
                            catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, (SubLObject)pph_templates.NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$169, thread);
                        }
                    }
                    catch (Throwable ccatch_env_var) {
                        error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                    if (error_message.isString()) {
                        stopP = (SubLObject)pph_templates.T;
                        final SubLObject new_format_string2 = Sequences.cconcatenate((SubLObject)pph_templates.$str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_templates.ONE_INTEGER), pph_templates.$str1$__, format_nil.format_nil_a_no_copy(error_message) });
                        pph_error.pph_handle_error(new_format_string2, (SubLObject)ConsesLow.list(pph_templates.EMPTY_SUBL_OBJECT_ARRAY));
                    }
                    else {
                        arg_position_map = pph_utilities.pph_figure_new_arg_position_map(arg_position_map, expansion_template);
                    }
                }
                finally {
                    pph_vars.$pph_error_on_bad_templatesP$.rebind(_prev_bind_0, thread);
                }
            }
            else {
                stopP = (SubLObject)pph_templates.T;
            }
        }
        return Values.values(cycl, arg_position_map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 99116L)
    public static SubLObject gen_template_store_proof(SubLObject verboseP, SubLObject do_wffP, SubLObject do_recipeP) {
        if (verboseP == pph_templates.UNPROVIDED) {
            verboseP = (SubLObject)pph_templates.NIL;
        }
        if (do_wffP == pph_templates.UNPROVIDED) {
            do_wffP = (SubLObject)pph_templates.T;
        }
        if (do_recipeP == pph_templates.UNPROVIDED) {
            do_recipeP = (SubLObject)pph_templates.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject errors = (SubLObject)pph_templates.ZERO_INTEGER;
        final SubLObject total_preds = pph_data_structures.gen_template_store_length();
        SubLObject sofar = (SubLObject)pph_templates.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)pph_templates.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)pph_templates.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)pph_templates.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(PrintLow.format((SubLObject)pph_templates.NIL, (SubLObject)pph_templates.$str244$Checking__gen_template_store____));
                final SubLObject iterator_var = pph_data_structures.new_gen_template_store_iterator();
                SubLObject valid;
                for (SubLObject done_var = (SubLObject)pph_templates.NIL; pph_templates.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(pph_templates.NIL == valid)) {
                    thread.resetMultipleValues();
                    final SubLObject the_entry = iteration.iteration_next(iterator_var);
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (pph_templates.NIL != valid) {
                        errors = Numbers.add(errors, gen_template_store_proof_int(the_entry, verboseP, do_wffP, do_recipeP));
                        sofar = Numbers.add(sofar, (SubLObject)pph_templates.ONE_INTEGER);
                        utilities_macros.note_percent_progress(sofar, total_preds);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$170 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_templates.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$170, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return errors;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 99990L)
    public static SubLObject gen_template_store_proof_int(final SubLObject the_entry, final SubLObject verboseP, final SubLObject do_wffP, final SubLObject do_recipeP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject the_reln = (SubLObject)pph_templates.NIL;
        SubLObject all_its_templates = (SubLObject)pph_templates.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(the_entry, the_entry, (SubLObject)pph_templates.$list245);
        the_reln = the_entry.first();
        SubLObject current = the_entry.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, the_entry, (SubLObject)pph_templates.$list245);
        all_its_templates = current.first();
        current = current.rest();
        if (pph_templates.NIL == current) {
            if (pph_templates.NIL != verboseP) {
                Errors.warn((SubLObject)pph_templates.$str246$checking__S, the_reln);
            }
            SubLObject cdolist_list_var = all_its_templates;
            SubLObject all_of_this_kind = (SubLObject)pph_templates.NIL;
            all_of_this_kind = cdolist_list_var.first();
            while (pph_templates.NIL != cdolist_list_var) {
                final SubLObject iterator_var = set.new_set_iterator(all_of_this_kind);
                SubLObject valid;
                for (SubLObject done_var = (SubLObject)pph_templates.NIL; pph_templates.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(pph_templates.NIL == valid)) {
                    thread.resetMultipleValues();
                    final SubLObject the_template = iteration.iteration_next(iterator_var);
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (pph_templates.NIL != valid) {
                        final SubLObject the_assertion = pph_data_structures.get_gen_template_assertion(the_template);
                        final SubLObject the_formula = assertions_high.assertion_formula(the_assertion);
                        final SubLObject the_mt = assertions_high.assertion_mt(the_assertion);
                        final SubLObject the_explanation = (SubLObject)((pph_templates.NIL != do_wffP) ? wff.explanation_of_why_not_wff(the_formula, the_mt, (SubLObject)pph_templates.UNPROVIDED) : pph_templates.NIL);
                        SubLObject errors = (SubLObject)pph_templates.ZERO_INTEGER;
                        if (pph_templates.NIL != the_explanation) {
                            Errors.warn((SubLObject)pph_templates.$str247$non_wff_template__S___S, the_formula, the_explanation);
                            errors = Numbers.add(errors, (SubLObject)pph_templates.ONE_INTEGER);
                        }
                        else if (pph_templates.NIL != do_recipeP && pph_templates.NIL != pph_template_formula_non_wfP(the_formula, (SubLObject)pph_templates.$kw59$SLOW)) {
                            errors = Numbers.add(errors, (SubLObject)pph_templates.ONE_INTEGER);
                        }
                        return errors;
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                all_of_this_kind = cdolist_list_var.first();
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(the_entry, (SubLObject)pph_templates.$list245);
        }
        return (SubLObject)pph_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 100984L)
    public static SubLObject gen_template_store_grep(final SubLObject the_string, SubLObject get_gafsP, SubLObject any_substringP) {
        if (get_gafsP == pph_templates.UNPROVIDED) {
            get_gafsP = (SubLObject)pph_templates.NIL;
        }
        if (any_substringP == pph_templates.UNPROVIDED) {
            any_substringP = (SubLObject)pph_templates.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject the_refs = kb_mapping.gather_other_index(pph_functions.bestnlphraseofstringfn());
        final SubLObject total_refs = Sequences.length(the_refs);
        SubLObject sofar = (SubLObject)pph_templates.ZERO_INTEGER;
        final SubLObject the_matches = set.new_set((SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)pph_templates.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)pph_templates.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)pph_templates.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(PrintLow.format((SubLObject)pph_templates.NIL, (SubLObject)pph_templates.$str248$Checking_the_misc__extent_of___Be));
                SubLObject cdolist_list_var = the_refs;
                SubLObject this_ref = (SubLObject)pph_templates.NIL;
                this_ref = cdolist_list_var.first();
                while (pph_templates.NIL != cdolist_list_var) {
                    final SubLObject the_formula = assertions_high.assertion_formula(this_ref);
                    if (pph_templates.NIL != pph_utilities.pph_isaP(cycl_utilities.formula_arg0(the_formula), pph_templates.$const8$NLTemplateGenerationPredicate, (SubLObject)pph_templates.UNPROVIDED) && pph_templates.NIL != gen_template_store_grep_int(cycl_utilities.formula_arg2(the_formula, (SubLObject)pph_templates.UNPROVIDED), the_string, any_substringP)) {
                        set.set_add((pph_templates.NIL != get_gafsP) ? the_formula : cycl_utilities.formula_arg1(the_formula, (SubLObject)pph_templates.UNPROVIDED), the_matches);
                    }
                    sofar = Numbers.add(sofar, (SubLObject)pph_templates.ONE_INTEGER);
                    utilities_macros.note_percent_progress(sofar, total_refs);
                    cdolist_list_var = cdolist_list_var.rest();
                    this_ref = cdolist_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$171 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_templates.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$171, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return set.set_element_list(the_matches);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 102554L)
    public static SubLObject gen_template_store_grep_int(final SubLObject fragment, final SubLObject the_string, final SubLObject any_substringP) {
        if (cycl_utilities.formula_arg0(fragment).equal(pph_functions.bestnlphraseofstringfn()) && pph_templates.NIL == cycl_variables.el_varP(cycl_utilities.formula_arg1(fragment, (SubLObject)pph_templates.UNPROVIDED)) && pph_templates.NIL != ((pph_templates.NIL != any_substringP) ? string_utilities.substringP(the_string, cycl_utilities.formula_arg1(fragment, (SubLObject)pph_templates.UNPROVIDED), (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED) : string_utilities.subwordP(the_string, cycl_utilities.formula_arg1(fragment, (SubLObject)pph_templates.UNPROVIDED), (SubLObject)pph_templates.$str249$____, (SubLObject)pph_templates.UNPROVIDED))) {
            return (SubLObject)pph_templates.T;
        }
        if (pph_templates.NIL != pph_utilities.pph_isaP(cycl_utilities.formula_arg0(fragment), pph_templates.$const250$Function, (SubLObject)pph_templates.UNPROVIDED)) {
            return (SubLObject)pph_templates.NIL;
        }
        SubLObject cdolist_list_var = fragment;
        SubLObject this_item = (SubLObject)pph_templates.NIL;
        this_item = cdolist_list_var.first();
        while (pph_templates.NIL != cdolist_list_var) {
            if (this_item.isList() && pph_templates.NIL != gen_template_store_grep_int(this_item, the_string, any_substringP)) {
                return (SubLObject)pph_templates.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_item = cdolist_list_var.first();
        }
        return (SubLObject)pph_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 103651L)
    public static SubLObject gen_template_store_get_constraints_mentioning(final SubLObject the_term, SubLObject get_gafsP) {
        if (get_gafsP == pph_templates.UNPROVIDED) {
            get_gafsP = (SubLObject)pph_templates.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert pph_templates.NIL != constant_handles.constant_p(the_term) : the_term;
        final SubLObject total = kb_indexing.num_predicate_extent_index(pph_templates.$const85$genTemplate_Constrained, (SubLObject)pph_templates.UNPROVIDED);
        SubLObject sofar = (SubLObject)pph_templates.ZERO_INTEGER;
        SubLObject the_matches = (SubLObject)pph_templates.NIL;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)pph_templates.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)pph_templates.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)pph_templates.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(PrintLow.format((SubLObject)pph_templates.NIL, (SubLObject)pph_templates.$str252$Searching___genTemplate_Constrain));
                final SubLObject _prev_bind_0_$172 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$173 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)pph_templates.$sym6$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(pph_templates.$const7$EverythingPSC, thread);
                    final SubLObject pred_var = pph_templates.$const85$genTemplate_Constrained;
                    if (pph_templates.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                        final SubLObject str = (SubLObject)pph_templates.NIL;
                        final SubLObject _prev_bind_0_$173 = utilities_macros.$progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$174 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$176 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_3_$177 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                        try {
                            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                            utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                            utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                            utilities_macros.$progress_notification_count$.bind((SubLObject)pph_templates.ZERO_INTEGER, thread);
                            utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)pph_templates.ZERO_INTEGER, thread);
                            utilities_macros.$progress_count$.bind((SubLObject)pph_templates.ZERO_INTEGER, thread);
                            utilities_macros.$is_noting_progressP$.bind((SubLObject)pph_templates.T, thread);
                            utilities_macros.$silent_progressP$.bind((SubLObject)((pph_templates.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : pph_templates.T), thread);
                            utilities_macros.noting_progress_preamble(str);
                            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                            SubLObject done_var = (SubLObject)pph_templates.NIL;
                            final SubLObject token_var = (SubLObject)pph_templates.NIL;
                            while (pph_templates.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (pph_templates.NIL != valid) {
                                    utilities_macros.note_progress();
                                    SubLObject final_index_iterator = (SubLObject)pph_templates.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)pph_templates.$kw31$GAF, (SubLObject)pph_templates.NIL, (SubLObject)pph_templates.NIL);
                                        SubLObject done_var_$178 = (SubLObject)pph_templates.NIL;
                                        final SubLObject token_var_$179 = (SubLObject)pph_templates.NIL;
                                        while (pph_templates.NIL == done_var_$178) {
                                            final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$179);
                                            final SubLObject valid_$180 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$179.eql(as));
                                            if (pph_templates.NIL != valid_$180) {
                                                final SubLObject the_formula = assertions_high.assertion_formula(as);
                                                final SubLObject the_constraint = cycl_utilities.formula_arg2(the_formula, (SubLObject)pph_templates.UNPROVIDED);
                                                if (pph_templates.NIL != cycl_utilities.formula_find(the_term, the_constraint, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED)) {
                                                    the_matches = (SubLObject)ConsesLow.cons((pph_templates.NIL != get_gafsP) ? the_formula : the_constraint, the_matches);
                                                }
                                                sofar = Numbers.add(sofar, (SubLObject)pph_templates.ONE_INTEGER);
                                                utilities_macros.note_percent_progress(sofar, total);
                                            }
                                            done_var_$178 = (SubLObject)SubLObjectFactory.makeBoolean(pph_templates.NIL == valid_$180);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$174 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_templates.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            if (pph_templates.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$174, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(pph_templates.NIL == valid);
                            }
                            utilities_macros.noting_progress_postamble();
                        }
                        finally {
                            utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                            utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                            utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                            utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                            utilities_macros.$progress_notification_count$.rebind(_prev_bind_3_$177, thread);
                            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$176, thread);
                            utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$174, thread);
                            utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$173, thread);
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$173, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$172, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$175 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_templates.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$175, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return the_matches;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 105012L)
    public static SubLObject expand_meta_template(final SubLObject mtemplate) {
        assert pph_templates.NIL != meta_gen_template_p(mtemplate) : mtemplate;
        final SubLObject dependent_disjunctions = gather_dependent_disjunction_info(mtemplate);
        SubLObject partial_templates = (SubLObject)ConsesLow.list(mtemplate);
        SubLObject new_partial_templates = (SubLObject)pph_templates.NIL;
        SubLObject name = (SubLObject)pph_templates.NIL;
        SubLObject v_arity = (SubLObject)pph_templates.NIL;
        SubLObject cdolist_list_var = dependent_disjunctions;
        SubLObject dd = (SubLObject)pph_templates.NIL;
        dd = cdolist_list_var.first();
        while (pph_templates.NIL != cdolist_list_var) {
            name = dd.first();
            v_arity = dd.rest();
            SubLObject cdolist_list_var_$183 = partial_templates;
            SubLObject pt = (SubLObject)pph_templates.NIL;
            pt = cdolist_list_var_$183.first();
            while (pph_templates.NIL != cdolist_list_var_$183) {
                SubLObject alternative;
                for (alternative = (SubLObject)pph_templates.NIL, alternative = (SubLObject)pph_templates.ZERO_INTEGER; alternative.numL(v_arity); alternative = Numbers.add(alternative, (SubLObject)pph_templates.ONE_INTEGER)) {
                    new_partial_templates = (SubLObject)ConsesLow.cons(expand_meta_template_disjunction(pt, name, alternative), new_partial_templates);
                }
                cdolist_list_var_$183 = cdolist_list_var_$183.rest();
                pt = cdolist_list_var_$183.first();
            }
            partial_templates = new_partial_templates;
            new_partial_templates = (SubLObject)pph_templates.NIL;
            cdolist_list_var = cdolist_list_var.rest();
            dd = cdolist_list_var.first();
        }
        return simplifier.conjoin(Mapping.mapcar((SubLObject)pph_templates.$sym255$UPDATE_TEMPLATE_OPERATOR, partial_templates), (SubLObject)pph_templates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 105791L)
    public static SubLObject meta_gen_template_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_templates.NIL != el_utilities.el_formula_p(v_object) && cycl_utilities.formula_operator(v_object).eql(pph_templates.$const256$metaGenTemplate_QuerySentence) && pph_templates.NIL != el_utilities.el_binary_formula_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 106051L)
    public static SubLObject mtemplate_special_form_p(final SubLObject v_object, final SubLObject operator) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isList() && v_object.first().eql(operator));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 106227L)
    public static SubLObject mtemplate_special_form_operator(final SubLObject mtsf) {
        return mtsf.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 106360L)
    public static SubLObject mtemplate_disjunction_name(final SubLObject mtd) {
        return conses_high.second(mtd);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 106485L)
    public static SubLObject mtemplate_disjunction_arg(final SubLObject mtd, final SubLObject arg) {
        return ConsesLow.nth(Numbers.add(arg, (SubLObject)pph_templates.TWO_INTEGER), mtd);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 106653L)
    public static SubLObject mtemplate_disjunction_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_templates.NIL != mtemplate_special_form_p(v_object, (SubLObject)pph_templates.$kw257$OR) && pph_templates.NIL != subl_promotions.non_negative_integer_p(conses_high.second(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 106860L)
    public static SubLObject update_template_operator(final SubLObject mt) {
        return (SubLObject)ConsesLow.cons(pph_templates.$const84$genTemplate_QuerySentence, mt.rest());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 107094L)
    public static SubLObject expand_meta_template_disjunction(final SubLObject mtemplate, final SubLObject name, final SubLObject alternative) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert pph_templates.NIL != subl_promotions.non_negative_integer_p(name) : name;
        assert pph_templates.NIL != subl_promotions.non_negative_integer_p(alternative) : alternative;
        SubLObject substitutions = (SubLObject)pph_templates.NIL;
        SubLObject new_mtemplate = mtemplate;
        SubLObject old = (SubLObject)pph_templates.NIL;
        SubLObject v_new = (SubLObject)pph_templates.NIL;
        SubLObject cdolist_list_var = list_utilities.tree_gather(mtemplate, (SubLObject)pph_templates.$sym259$MTEMPLATE_DISJUNCTION_P, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
        SubLObject mtd = (SubLObject)pph_templates.NIL;
        mtd = cdolist_list_var.first();
        while (pph_templates.NIL != cdolist_list_var) {
            if (mtemplate_disjunction_name(mtd).eql(name)) {
                substitutions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(mtd, mtemplate_disjunction_arg(mtd, alternative)), substitutions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mtd = cdolist_list_var.first();
        }
        cdolist_list_var = substitutions;
        SubLObject subs = (SubLObject)pph_templates.NIL;
        subs = cdolist_list_var.first();
        while (pph_templates.NIL != cdolist_list_var) {
            old = subs.first();
            v_new = subs.rest();
            if (v_new.eql(pph_templates.$meta_template_null$.getDynamicValue(thread))) {
                new_mtemplate = list_utilities.tree_delete(old, conses_high.copy_tree(new_mtemplate), (SubLObject)pph_templates.EQUAL, (SubLObject)pph_templates.UNPROVIDED);
            }
            else if (v_new.first().eql((SubLObject)pph_templates.$kw260$AND)) {
                new_mtemplate = list_utilities.tree_splice(new_mtemplate, old, v_new.rest());
            }
            else {
                new_mtemplate = list_utilities.tree_substitute(new_mtemplate, old, v_new);
            }
            cdolist_list_var = cdolist_list_var.rest();
            subs = cdolist_list_var.first();
        }
        return new_mtemplate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 108129L)
    public static SubLObject gather_dependent_disjunction_info(final SubLObject mtemplate) {
        SubLObject infos = (SubLObject)pph_templates.NIL;
        SubLObject name = (SubLObject)pph_templates.NIL;
        SubLObject v_arity = (SubLObject)pph_templates.NIL;
        SubLObject previous = (SubLObject)pph_templates.NIL;
        SubLObject cdolist_list_var = list_utilities.tree_gather(mtemplate, (SubLObject)pph_templates.$sym259$MTEMPLATE_DISJUNCTION_P, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
        SubLObject disjunction = (SubLObject)pph_templates.NIL;
        disjunction = cdolist_list_var.first();
        while (pph_templates.NIL != cdolist_list_var) {
            name = conses_high.second(disjunction);
            v_arity = Numbers.subtract(Sequences.length(disjunction), (SubLObject)pph_templates.TWO_INTEGER);
            previous = conses_high.assoc(name, infos, (SubLObject)pph_templates.EQL, (SubLObject)pph_templates.UNPROVIDED);
            if (pph_templates.NIL != previous) {
                if (!previous.rest().numE(v_arity)) {
                    Errors.error((SubLObject)pph_templates.$str261$dependent_disjunction__a_has_vary, name, mtemplate);
                }
            }
            else {
                infos = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(conses_high.second(disjunction), Numbers.subtract(Sequences.length(disjunction), (SubLObject)pph_templates.TWO_INTEGER)), infos);
            }
            cdolist_list_var = cdolist_list_var.rest();
            disjunction = cdolist_list_var.first();
        }
        return infos;
    }
    
    public static SubLObject declare_pph_templates_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "initialize_gen_template_store", "INITIALIZE-GEN-TEMPLATE-STORE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "gen_template_store_length_saneP", "GEN-TEMPLATE-STORE-LENGTH-SANE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "do_initialize_gen_template_store", "DO-INITIALIZE-GEN-TEMPLATE-STORE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "initialize_gen_templates_for_pred", "INITIALIZE-GEN-TEMPLATES-FOR-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "add_gen_template", "ADD-GEN-TEMPLATE", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "add_gen_template_int", "ADD-GEN-TEMPLATE-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "gen_template_sets_for_reln", "GEN-TEMPLATE-SETS-FOR-RELN", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "clear_pph_kappa_justification_template", "CLEAR-PPH-KAPPA-JUSTIFICATION-TEMPLATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "remove_pph_kappa_justification_template", "REMOVE-PPH-KAPPA-JUSTIFICATION-TEMPLATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_kappa_justification_template_internal", "PPH-KAPPA-JUSTIFICATION-TEMPLATE-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_kappa_justification_template", "PPH-KAPPA-JUSTIFICATION-TEMPLATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "rephrase_gen_template_for_kappa_predP", "REPHRASE-GEN-TEMPLATE-FOR-KAPPA-PRED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "looks_like_kappa_rephrase_ruleP", "LOOKS-LIKE-KAPPA-REPHRASE-RULE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "clear_rephrase_gen_template_for_kappa_pred", "CLEAR-REPHRASE-GEN-TEMPLATE-FOR-KAPPA-PRED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "remove_rephrase_gen_template_for_kappa_pred", "REMOVE-REPHRASE-GEN-TEMPLATE-FOR-KAPPA-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "rephrase_gen_template_for_kappa_pred_internal", "REPHRASE-GEN-TEMPLATE-FOR-KAPPA-PRED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "rephrase_gen_template_for_kappa_pred", "REPHRASE-GEN-TEMPLATE-FOR-KAPPA-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "kappa_gen_template_rule_for_arity", "KAPPA-GEN-TEMPLATE-RULE-FOR-ARITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "new_gen_template_from_assertion", "NEW-GEN-TEMPLATE-FROM-ASSERTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "reinitialize_gen_templates_for_reln", "REINITIALIZE-GEN-TEMPLATES-FOR-RELN", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "reinitialize_gen_templates_referencing_phrase_fn", "REINITIALIZE-GEN-TEMPLATES-REFERENCING-PHRASE-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "initialize_gen_templates_for_relnXpred", "INITIALIZE-GEN-TEMPLATES-FOR-RELN&PRED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "remove_gen_template", "REMOVE-GEN-TEMPLATE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_phrase_from_assertion", "PPH-PHRASE-FROM-ASSERTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_dummy_cycl_from_as", "PPH-DUMMY-CYCL-FROM-AS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "gen_template_recipe_p", "GEN-TEMPLATE-RECIPE-P", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_expanded_template_formula_wfP", "PPH-EXPANDED-TEMPLATE-FORMULA-WF?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_find_generic_arg_gaps", "PPH-FIND-GENERIC-ARG-GAPS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "repeated_args_phrase_naut_p", "REPEATED-ARGS-PHRASE-NAUT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_expanded_template_formula_wfP_fast", "PPH-EXPANDED-TEMPLATE-FORMULA-WF?-FAST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_non_template_bound_el_varP", "PPH-NON-TEMPLATE-BOUND-EL-VAR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_template_bound_vars", "PPH-TEMPLATE-BOUND-VARS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_expanded_template_formula_wfP_fast_problemP", "PPH-EXPANDED-TEMPLATE-FORMULA-WF?-FAST-PROBLEM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_expanded_template_formula_arg_wfP_fast_problemP", "PPH-EXPANDED-TEMPLATE-FORMULA-ARG-WF?-FAST-PROBLEM?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_template_non_wfP", "PPH-TEMPLATE-NON-WF?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_template_formula_non_wfP", "PPH-TEMPLATE-FORMULA-NON-WF?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "self_referential_gen_template_formulaP", "SELF-REFERENTIAL-GEN-TEMPLATE-FORMULA?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "bad_generic_arg_in_gen_template_formula", "BAD-GENERIC-ARG-IN-GEN-TEMPLATE-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "assertion_has_phrase_naut_argP", "ASSERTION-HAS-PHRASE-NAUT-ARG?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "phrase_naut_from_as", "PHRASE-NAUT-FROM-AS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "phrase_naut_from_formula", "PHRASE-NAUT-FROM-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "clear_phrase_naut_arg", "CLEAR-PHRASE-NAUT-ARG", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "remove_phrase_naut_arg", "REMOVE-PHRASE-NAUT-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "phrase_naut_arg_internal", "PHRASE-NAUT-ARG-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "phrase_naut_arg", "PHRASE-NAUT-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "nl_phrase_typeP", "NL-PHRASE-TYPE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "strip_generic_arg_hall_passes", "STRIP-GENERIC-ARG-HALL-PASSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_phrase_from_gentemplate_phrase", "PPH-PHRASE-FROM-GENTEMPLATE-PHRASE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_phrase_from_concatenate_phrases_naut", "PPH-PHRASE-FROM-CONCATENATE-PHRASES-NAUT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_phrase_sanity_check_agr", "PPH-PHRASE-SANITY-CHECK-AGR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_bad_nth_phraseP", "PPH-BAD-NTH-PHRASE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_phrase_dereference_nth_phrases", "PPH-PHRASE-DEREFERENCE-NTH-PHRASES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_phrase_dereference_nth_phrase", "PPH-PHRASE-DEREFERENCE-NTH-PHRASE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_head_dtr_nautP", "PPH-HEAD-DTR-NAUT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_remove_head_dtr_marker", "PPH-REMOVE-HEAD-DTR-MARKER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_phrase_from_phrase_form_naut", "PPH-PHRASE-FROM-PHRASE-FORM-NAUT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_phrase_from_phrase_cycl_fn_naut", "PPH-PHRASE-FROM-PHRASE-CYCL-FN-NAUT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_phrase_from_best_verb_form_for_subject_naut", "PPH-PHRASE-FROM-BEST-VERB-FORM-FOR-SUBJECT-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "nth_phrase_naut_p", "NTH-PHRASE-NAUT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_phrase_from_best_det_nbar_naut", "PPH-PHRASE-FROM-BEST-DET-NBAR-NAUT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_new_np_from_det_and_nbar", "PPH-NEW-NP-FROM-DET-AND-NBAR", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_agr_of_det_string", "PPH-AGR-OF-DET-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_det_phrase_agr_preds", "PPH-DET-PHRASE-AGR-PREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_agr_preds_for_det_cycl_internal", "PPH-AGR-PREDS-FOR-DET-CYCL-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_agr_preds_for_det_cycl", "PPH-AGR-PREDS-FOR-DET-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "remove_spec_preds", "REMOVE-SPEC-PREDS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_template_constraint_from_assertion", "PPH-TEMPLATE-CONSTRAINT-FROM-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "add_gen_template_to_sets", "ADD-GEN-TEMPLATE-TO-SETS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "remove_gen_template_as_from_sets", "REMOVE-GEN-TEMPLATE-AS-FROM-SETS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "place_gen_template_in_sets", "PLACE-GEN-TEMPLATE-IN-SETS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "gen_template_too_specificP", "GEN-TEMPLATE-TOO-SPECIFIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "gen_template_too_broadP", "GEN-TEMPLATE-TOO-BROAD?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "gen_template_more_specificP", "GEN-TEMPLATE-MORE-SPECIFIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "gen_template_preferredP", "GEN-TEMPLATE-PREFERRED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "gen_template_dispreferredP", "GEN-TEMPLATE-DISPREFERRED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "gen_template_assertion_preferredP", "GEN-TEMPLATE-ASSERTION-PREFERRED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "gen_template_constraint_more_specificP", "GEN-TEMPLATE-CONSTRAINT-MORE-SPECIFIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "clear_pph_dnf_clausal_form_cached", "CLEAR-PPH-DNF-CLAUSAL-FORM-CACHED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "remove_pph_dnf_clausal_form_cached", "REMOVE-PPH-DNF-CLAUSAL-FORM-CACHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_dnf_clausal_form_cached_internal", "PPH-DNF-CLAUSAL-FORM-CACHED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_dnf_clausal_form_cached", "PPH-DNF-CLAUSAL-FORM-CACHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_dnf_clausal_form_internal", "PPH-DNF-CLAUSAL-FORM-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_dnf_clausal_form", "PPH-DNF-CLAUSAL-FORM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "get_pph_dnf_clausal_form", "GET-PPH-DNF-CLAUSAL-FORM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "gen_template_constraint_generality_estimate", "GEN-TEMPLATE-CONSTRAINT-GENERALITY-ESTIMATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_dnf_has_more_clausesP", "PPH-DNF-HAS-MORE-CLAUSES?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "dnf_clause_count", "DNF-CLAUSE-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "gentemplate_phrase_from_pph_phrase", "GENTEMPLATE-PHRASE-FROM-PPH-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "gentemplate_phrase_from_pph_phrase_int", "GENTEMPLATE-PHRASE-FROM-PPH-PHRASE-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_conditional_phrase_to_gentemplate", "PPH-CONDITIONAL-PHRASE-TO-GENTEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_quoted_phrase_to_gentemplate", "PPH-QUOTED-PHRASE-TO-GENTEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_det_nbar_to_gentemplate", "PPH-DET-NBAR-TO-GENTEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "generic_nominal_agr_pred", "GENERIC-NOMINAL-AGR-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_phrase_to_concatenate_phrases", "PPH-PHRASE-TO-CONCATENATE-PHRASES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_verb_to_gentemplate", "PPH-VERB-TO-GENTEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_phrase_wXcycl_to_term_paraphrase", "PPH-PHRASE-W/CYCL-TO-TERM-PARAPHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_phrase_wXstring_only_to_gentemplate", "PPH-PHRASE-W/STRING-ONLY-TO-GENTEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_phrase_wXwu_only_to_gentemplate", "PPH-PHRASE-W/WU-ONLY-TO-GENTEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_template_best_pph_phrase_for_formula", "PPH-TEMPLATE-BEST-PPH-PHRASE-FOR-FORMULA", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_customize_template_macro_helper", "PPH-CUSTOMIZE-TEMPLATE-MACRO-HELPER", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_template_customize_template_for_formula", "PPH-TEMPLATE-CUSTOMIZE-TEMPLATE-FOR-FORMULA", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_template_phrase_from_arg0", "PPH-TEMPLATE-PHRASE-FROM-ARG0", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_template_formula_rephraseP", "PPH-TEMPLATE-FORMULA-REPHRASE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_arg0_rephrase_templateP", "PPH-ARG0-REPHRASE-TEMPLATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "expanded_gen_template_sets_for_reln", "EXPANDED-GEN-TEMPLATE-SETS-FOR-RELN", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_expand_gen_template_sets", "PPH-EXPAND-GEN-TEMPLATE-SETS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_expand_gen_template_set", "PPH-EXPAND-GEN-TEMPLATE-SET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_expand_gen_template", "PPH-EXPAND-GEN-TEMPLATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "gen_template_add_constraint", "GEN-TEMPLATE-ADD-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_rephrase_expanded_gen_template", "PPH-REPHRASE-EXPANDED-GEN-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_phrase_templates_for_formula_wXreln", "PPH-PHRASE-TEMPLATES-FOR-FORMULA-W/RELN", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_sort_gen_templates_by_verbosity", "PPH-SORT-GEN-TEMPLATES-BY-VERBOSITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_phrase_template_generator_next", "PPH-PHRASE-TEMPLATE-GENERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_phrase_template_generator_next_gen_template", "PPH-PHRASE-TEMPLATE-GENERATOR-NEXT-GEN-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_phrase_template_generator_next_gen_template_internal", "PPH-PHRASE-TEMPLATE-GENERATOR-NEXT-GEN-TEMPLATE-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_phrase_template_generator_initialize_queues", "PPH-PHRASE-TEMPLATE-GENERATOR-INITIALIZE-QUEUES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_genl_preds_distance_internal", "PPH-GENL-PREDS-DISTANCE-INTERNAL", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_genl_preds_distance", "PPH-GENL-PREDS-DISTANCE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_phrase_template_generator_populate_gen_template_queue", "PPH-PHRASE-TEMPLATE-GENERATOR-POPULATE-GEN-TEMPLATE-QUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "new_pph_inferior_template_set", "NEW-PPH-INFERIOR-TEMPLATE-SET", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_inferior_template_set_p", "PPH-INFERIOR-TEMPLATE-SET-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_inferior_template_set_emptyP", "PPH-INFERIOR-TEMPLATE-SET-EMPTY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_phrase_template_generator_populate_gen_template_sets_queue", "PPH-PHRASE-TEMPLATE-GENERATOR-POPULATE-GEN-TEMPLATE-SETS-QUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_phrase_template_generator_gen_template_queue", "PPH-PHRASE-TEMPLATE-GENERATOR-GEN-TEMPLATE-QUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_phrase_template_generator_gen_template_sets_queue", "PPH-PHRASE-TEMPLATE-GENERATOR-GEN-TEMPLATE-SETS-QUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_phrase_template_generator_relns_to_use_queue", "PPH-PHRASE-TEMPLATE-GENERATOR-RELNS-TO-USE-QUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_phrase_templates_for_formula", "PPH-PHRASE-TEMPLATES-FOR-FORMULA", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_phrase_template_for_formula", "PPH-PHRASE-TEMPLATE-FOR-FORMULA", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_best_phrase_template_for_formula_wXreln", "PPH-BEST-PHRASE-TEMPLATE-FOR-FORMULA-W/RELN", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "genformat_availableP", "GENFORMAT-AVAILABLE?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_template_phrase_set_cycl", "PPH-TEMPLATE-PHRASE-SET-CYCL", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_template_note_reln_used", "PPH-TEMPLATE-NOTE-RELN-USED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_phrase_check_for_infinite_recursion", "PPH-PHRASE-CHECK-FOR-INFINITE-RECURSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_formula_has_gf_arg_fixedP", "PPH-FORMULA-HAS-GF-ARG-FIXED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_gfaf_assertions_for_reln_internal", "PPH-GFAF-ASSERTIONS-FOR-RELN-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_gfaf_assertions_for_reln", "PPH-GFAF-ASSERTIONS-FOR-RELN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "genformat_arg_fixed_precision_okP", "GENFORMAT-ARG-FIXED-PRECISION-OK?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_relation_has_gf_preciseP", "PPH-RELATION-HAS-GF-PRECISE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_phrase_from_gen_template_satisfying_constraints", "PPH-PHRASE-FROM-GEN-TEMPLATE-SATISFYING-CONSTRAINTS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "clear_gen_template_verbosity", "CLEAR-GEN-TEMPLATE-VERBOSITY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "remove_gen_template_verbosity", "REMOVE-GEN-TEMPLATE-VERBOSITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "gen_template_verbosity_internal", "GEN-TEMPLATE-VERBOSITY-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "gen_template_verbosity", "GEN-TEMPLATE-VERBOSITY", 1, 0, false);
        new $gen_template_verbosity$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_template_has_constraintP", "PPH-TEMPLATE-HAS-CONSTRAINT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_phrase_from_gen_template", "PPH-PHRASE-FROM-GEN-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_template_appliesP", "PPH-TEMPLATE-APPLIES?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_template_phrase_ok_for_predsP", "PPH-TEMPLATE-PHRASE-OK-FOR-PREDS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "gen_template_constraint_passesP", "GEN-TEMPLATE-CONSTRAINT-PASSES?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "gen_template_constraint_passesP_internal", "GEN-TEMPLATE-CONSTRAINT-PASSES?-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_template_not_precise_enoughP", "PPH-TEMPLATE-NOT-PRECISE-ENOUGH?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_phrase_references_all_argsP", "PPH-PHRASE-REFERENCES-ALL-ARGS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_phrase_references_precise_argsP", "PPH-PHRASE-REFERENCES-PRECISE-ARGS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_phrase_references_argsP", "PPH-PHRASE-REFERENCES-ARGS?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_phrase_references_argP", "PPH-PHRASE-REFERENCES-ARG?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_phrase_references_arg_positionP", "PPH-PHRASE-REFERENCES-ARG-POSITION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "formula_has_gen_template_constrainedP", "FORMULA-HAS-GEN-TEMPLATE-CONSTRAINED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_tersify", "PPH-TERSIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_tersify_gentemplate_formula", "PPH-TERSIFY-GENTEMPLATE-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_deepen_phrase_naut", "PPH-DEEPEN-PHRASE-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_deepen_phrase_naut_once", "PPH-DEEPEN-PHRASE-NAUT-ONCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_phrase_naut_deepening_candidates", "PPH-PHRASE-NAUT-DEEPENING-CANDIDATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "phrase_naut_deepening_inference_properties", "PHRASE-NAUT-DEEPENING-INFERENCE-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_phrasify_phrase_naut", "PPH-PHRASIFY-PHRASE-NAUT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_plist_for_phrase_naut", "PPH-PLIST-FOR-PHRASE-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_expand_phrase_nauts", "PPH-EXPAND-PHRASE-NAUTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "do_pph_expand_phrase_nauts", "DO-PPH-EXPAND-PHRASE-NAUTS", 1, 0, false);
        new $do_pph_expand_phrase_nauts$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "pph_expand_phrase_nauts_top_level", "PPH-EXPAND-PHRASE-NAUTS-TOP-LEVEL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "gen_template_store_proof", "GEN-TEMPLATE-STORE-PROOF", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "gen_template_store_proof_int", "GEN-TEMPLATE-STORE-PROOF-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "gen_template_store_grep", "GEN-TEMPLATE-STORE-GREP", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "gen_template_store_grep_int", "GEN-TEMPLATE-STORE-GREP-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "gen_template_store_get_constraints_mentioning", "GEN-TEMPLATE-STORE-GET-CONSTRAINTS-MENTIONING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "expand_meta_template", "EXPAND-META-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "meta_gen_template_p", "META-GEN-TEMPLATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "mtemplate_special_form_p", "MTEMPLATE-SPECIAL-FORM-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "mtemplate_special_form_operator", "MTEMPLATE-SPECIAL-FORM-OPERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "mtemplate_disjunction_name", "MTEMPLATE-DISJUNCTION-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "mtemplate_disjunction_arg", "MTEMPLATE-DISJUNCTION-ARG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "mtemplate_disjunction_p", "MTEMPLATE-DISJUNCTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "update_template_operator", "UPDATE-TEMPLATE-OPERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "expand_meta_template_disjunction", "EXPAND-META-TEMPLATE-DISJUNCTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_templates", "gather_dependent_disjunction_info", "GATHER-DEPENDENT-DISJUNCTION-INFO", 1, 0, false);
        return (SubLObject)pph_templates.NIL;
    }
    
    public static SubLObject init_pph_templates_file() {
        pph_templates.$within_initialize_gen_template_storeP$ = SubLFiles.defparameter("*WITHIN-INITIALIZE-GEN-TEMPLATE-STORE?*", (SubLObject)pph_templates.NIL);
        pph_templates.$pph_kappa_justification_template_caching_state$ = SubLFiles.deflexical("*PPH-KAPPA-JUSTIFICATION-TEMPLATE-CACHING-STATE*", (SubLObject)pph_templates.NIL);
        pph_templates.$rephrase_gen_template_for_kappa_pred_caching_state$ = SubLFiles.deflexical("*REPHRASE-GEN-TEMPLATE-FOR-KAPPA-PRED-CACHING-STATE*", (SubLObject)pph_templates.NIL);
        pph_templates.$pph_template_bound_vars$ = SubLFiles.defparameter("*PPH-TEMPLATE-BOUND-VARS*", (SubLObject)pph_templates.NIL);
        pph_templates.$phrase_naut_arg_caching_state$ = SubLFiles.deflexical("*PHRASE-NAUT-ARG-CACHING-STATE*", (SubLObject)pph_templates.NIL);
        pph_templates.$pph_dnf_clausal_form_cached_caching_state$ = SubLFiles.deflexical("*PPH-DNF-CLAUSAL-FORM-CACHED-CACHING-STATE*", (SubLObject)pph_templates.NIL);
        pph_templates.$gen_template_verbosity_caching_state$ = SubLFiles.deflexical("*GEN-TEMPLATE-VERBOSITY-CACHING-STATE*", (SubLObject)pph_templates.NIL);
        pph_templates.$phrase_naut_deepening_inference_properties$ = SubLFiles.deflexical("*PHRASE-NAUT-DEEPENING-INFERENCE-PROPERTIES*", (SubLObject)ConsesLow.list(new SubLObject[] { pph_templates.$kw218$MAX_TRANSFORMATION_DEPTH, pph_templates.TWO_INTEGER, pph_templates.$kw219$MAX_NUMBER, pph_templates.ONE_INTEGER, pph_templates.$kw220$MAX_TIME, pph_templates.TEN_INTEGER, pph_templates.$kw221$CACHE_INFERENCE_RESULTS_, pph_templates.NIL, pph_templates.$kw222$ANSWER_LANGUAGE, pph_templates.$kw223$HL, pph_templates.$kw224$CONTINUABLE_, pph_templates.NIL, pph_templates.$kw225$RETURN, pph_templates.$list226, pph_templates.$kw227$ALLOW_INDETERMINATE_RESULTS_, pph_templates.T, pph_templates.$kw228$DISJUNCTION_FREE_EL_VARS_POLICY, pph_templates.$kw229$COMPUTE_INTERSECTION }));
        pph_templates.$do_pph_expand_phrase_nauts_stack$ = SubLFiles.defparameter("*DO-PPH-EXPAND-PHRASE-NAUTS-STACK*", (SubLObject)pph_templates.NIL);
        pph_templates.$meta_template_null$ = SubLFiles.defparameter("*META-TEMPLATE-NULL*", (SubLObject)pph_templates.$kw253$NULL);
        return (SubLObject)pph_templates.NIL;
    }
    
    public static SubLObject setup_pph_templates_file() {
        utilities_macros.register_kb_function((SubLObject)pph_templates.$sym34$ADD_GEN_TEMPLATE);
        memoization_state.note_globally_cached_function((SubLObject)pph_templates.$sym40$PPH_KAPPA_JUSTIFICATION_TEMPLATE);
        memoization_state.note_globally_cached_function((SubLObject)pph_templates.$sym41$REPHRASE_GEN_TEMPLATE_FOR_KAPPA_PRED);
        utilities_macros.register_kb_function((SubLObject)pph_templates.$sym56$REMOVE_GEN_TEMPLATE);
        utilities_macros.note_funcall_helper_function((SubLObject)pph_templates.$sym64$PPH_NON_TEMPLATE_BOUND_EL_VAR_);
        memoization_state.note_globally_cached_function((SubLObject)pph_templates.$sym88$PHRASE_NAUT_ARG);
        memoization_state.note_memoized_function((SubLObject)pph_templates.$sym125$PPH_AGR_PREDS_FOR_DET_CYCL);
        memoization_state.note_globally_cached_function((SubLObject)pph_templates.$sym131$PPH_DNF_CLAUSAL_FORM_CACHED);
        memoization_state.note_memoized_function((SubLObject)pph_templates.$sym133$PPH_DNF_CLAUSAL_FORM);
        access_macros.register_macro_helper((SubLObject)pph_templates.$sym149$PPH_CUSTOMIZE_TEMPLATE_MACRO_HELPER, (SubLObject)pph_templates.$sym150$DO_PPH_PHRASES_FOR_FORMULA);
        memoization_state.note_memoized_function((SubLObject)pph_templates.$sym173$PPH_GENL_PREDS_DISTANCE);
        memoization_state.note_memoized_function((SubLObject)pph_templates.$sym194$PPH_GFAF_ASSERTIONS_FOR_RELN);
        memoization_state.note_globally_cached_function((SubLObject)pph_templates.$sym159$GEN_TEMPLATE_VERBOSITY);
        sunit_external.define_test_category((SubLObject)pph_templates.$str262$PPH_Template_Supercategory, (SubLObject)pph_templates.UNPROVIDED);
        sunit_external.define_test_category((SubLObject)pph_templates.$str263$Gen_Template_Subcategory, (SubLObject)ConsesLow.list((SubLObject)pph_templates.$str262$PPH_Template_Supercategory));
        sunit_external.define_test_suite((SubLObject)pph_templates.$str264$Gen_Template_Recipe_Test_Battery, (SubLObject)ConsesLow.list((SubLObject)pph_templates.$str263$Gen_Template_Subcategory), (SubLObject)pph_templates.UNPROVIDED, (SubLObject)pph_templates.UNPROVIDED);
        return (SubLObject)pph_templates.NIL;
    }
    
    public void declareFunctions() {
        declare_pph_templates_file();
    }
    
    public void initializeVariables() {
        init_pph_templates_file();
    }
    
    public void runTopLevelForms() {
        setup_pph_templates_file();
    }
    
    static {
        me = (SubLFile)new pph_templates();
        pph_templates.$within_initialize_gen_template_storeP$ = null;
        pph_templates.$pph_kappa_justification_template_caching_state$ = null;
        pph_templates.$rephrase_gen_template_for_kappa_pred_caching_state$ = null;
        pph_templates.$pph_template_bound_vars$ = null;
        pph_templates.$phrase_naut_arg_caching_state$ = null;
        pph_templates.$pph_dnf_clausal_form_cached_caching_state$ = null;
        pph_templates.$gen_template_verbosity_caching_state$ = null;
        pph_templates.$phrase_naut_deepening_inference_properties$ = null;
        pph_templates.$do_pph_expand_phrase_nauts_stack$ = null;
        pph_templates.$meta_template_null$ = null;
        $str0$_PPH_error_level_ = SubLObjectFactory.makeString("(PPH error level ");
        $str1$__ = SubLObjectFactory.makeString(") ");
        $str2$Recursive_call_to_INITIALIZE_GEN_ = SubLObjectFactory.makeString("Recursive call to INITIALIZE-GEN-TEMPLATE-STORE.");
        $kw3$NEW = SubLObjectFactory.makeKeyword("NEW");
        $kw4$INITIALIZED = SubLObjectFactory.makeKeyword("INITIALIZED");
        $str5$gen_template_store_length_of__S_i = SubLObjectFactory.makeString("gen-template-store length of ~S is not good.");
        $sym6$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const7$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const8$NLTemplateGenerationPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLTemplateGenerationPredicate"));
        $const9$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $kw10$BREADTH = SubLObjectFactory.makeKeyword("BREADTH");
        $kw11$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $kw12$STACK = SubLObjectFactory.makeKeyword("STACK");
        $sym13$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw14$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str15$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym16$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw17$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str18$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw19$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str20$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $str21$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str22$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("LINK-NODE"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("MT"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("TV"));
        $str24$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $str25$gen_template_store_length__S_is_i = SubLObjectFactory.makeString("gen-template-store length ~S is implausibly large, compared to only ~S relevant assertions in the KB.");
        $str26$gen_template_store_length__S_is_u = SubLObjectFactory.makeString("gen-template-store length ~S is unsettlingly small, compared to only ~S relevant assertions in the KB.");
        $const27$Relation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Relation"));
        $sym28$SPEC_ = SubLObjectFactory.makeSymbol("SPEC?");
        $kw29$DONE = SubLObjectFactory.makeKeyword("DONE");
        $str30$Initializing__S___ = SubLObjectFactory.makeString("Initializing ~S...");
        $kw31$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw32$OFF = SubLObjectFactory.makeKeyword("OFF");
        $kw33$FAST = SubLObjectFactory.makeKeyword("FAST");
        $sym34$ADD_GEN_TEMPLATE = SubLObjectFactory.makeSymbol("ADD-GEN-TEMPLATE");
        $kw35$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $str36$Unable_to_add_assertion_to_gen_te = SubLObjectFactory.makeString("Unable to add assertion to gen-template store:~% ~S~%");
        $sym37$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str38$___Top_level_CycL___S = SubLObjectFactory.makeString("~% Top-level CycL: ~S");
        $list39 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Kappa")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $sym40$PPH_KAPPA_JUSTIFICATION_TEMPLATE = SubLObjectFactory.makeSymbol("PPH-KAPPA-JUSTIFICATION-TEMPLATE");
        $sym41$REPHRASE_GEN_TEMPLATE_FOR_KAPPA_PRED = SubLObjectFactory.makeSymbol("REPHRASE-GEN-TEMPLATE-FOR-KAPPA-PRED");
        $kw42$ANYTHING = SubLObjectFactory.makeKeyword("ANYTHING");
        $sym43$_PPH_KAPPA_JUSTIFICATION_TEMPLATE_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*PPH-KAPPA-JUSTIFICATION-TEMPLATE-CACHING-STATE*");
        $const44$Kappa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Kappa"));
        $list45 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Kappa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("VARS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE")));
        $sym46$TEMPLATE = SubLObjectFactory.makeSymbol("TEMPLATE");
        $sym47$VARS = SubLObjectFactory.makeSymbol("VARS");
        $sym48$_REPHRASE_GEN_TEMPLATE_FOR_KAPPA_PRED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*REPHRASE-GEN-TEMPLATE-FOR-KAPPA-PRED-CACHING-STATE*");
        $int49$1024 = SubLObjectFactory.makeInteger(1024);
        $str50$kappaGenTemplateRuleForArity = SubLObjectFactory.makeString("kappaGenTemplateRuleForArity");
        $sym51$_RULE = SubLObjectFactory.makeSymbol("?RULE");
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?RULE"));
        $const53$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $sym54$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $kw55$REINITIALIZED = SubLObjectFactory.makeKeyword("REINITIALIZED");
        $sym56$REMOVE_GEN_TEMPLATE = SubLObjectFactory.makeSymbol("REMOVE-GEN-TEMPLATE");
        $str57$PPH_PHRASE_FROM_ASSERTION_passed_ = SubLObjectFactory.makeString("PPH-PHRASE-FROM-ASSERTION passed a non-GAF: ~S");
        $str58$PPH_PHRASE_FROM_ASSERTION_passed_ = SubLObjectFactory.makeString("PPH-PHRASE-FROM-ASSERTION passed a bad template:~% ~S");
        $kw59$SLOW = SubLObjectFactory.makeKeyword("SLOW");
        $sym60$EL_FORMULA_P = SubLObjectFactory.makeSymbol("EL-FORMULA-P");
        $str61$______expanded_template_for__S___ = SubLObjectFactory.makeString("~%*** expanded template for ~S...~%~S~%... is missing generic args ~S");
        $sym62$REPEATED_ARGS_PHRASE_NAUT_P = SubLObjectFactory.makeSymbol("REPEATED-ARGS-PHRASE-NAUT-P");
        $sym63$GENERIC_ARG_P = SubLObjectFactory.makeSymbol("GENERIC-ARG-P");
        $sym64$PPH_NON_TEMPLATE_BOUND_EL_VAR_ = SubLObjectFactory.makeSymbol("PPH-NON-TEMPLATE-BOUND-EL-VAR?");
        $const65$TheNthFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheNthFn"));
        $str66$_S_can_t_begin_a___GenTemplateRec = SubLObjectFactory.makeString("~S can't begin a #$GenTemplateRecipe clause");
        $kw67$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $str68$Wf_problem_with__S = SubLObjectFactory.makeString("Wf problem with ~S");
        $str69$_S_expects_a_closed_formula_for_i = SubLObjectFactory.makeString("~S expects a closed formula for its arg1, not ~S");
        $str70$_S_expects_a_cycl_sentence_askabl = SubLObjectFactory.makeString("~S expects a cycl-sentence-askable? as in arg-pos ~S, not ~S");
        $const71$SententialConstituent = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SententialConstituent"));
        $sym72$PPH_SPEC_ = SubLObjectFactory.makeSymbol("PPH-SPEC?");
        $const73$LexicalWord = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LexicalWord"));
        $str74$_S_is_required_to_be_a___LexicalW = SubLObjectFactory.makeString("~S is required to be a #$LexicalWord");
        $str75$_S_exceeds_the_maxArity___S__allo = SubLObjectFactory.makeString("~S exceeds the maxArity (~S) allowed by the predicate");
        $const76$argIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argIsa"));
        $const77$GeneralLexiconMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeneralLexiconMt"));
        $list78 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FOO"), (SubLObject)SubLObjectFactory.makeSymbol("BAR"), (SubLObject)SubLObjectFactory.makeSymbol("ARGN"), (SubLObject)SubLObjectFactory.makeSymbol("COLL"));
        $const79$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $str80$_S_isn_t_a__S_w_r_t___S = SubLObjectFactory.makeString("~S isn't a ~S w.r.t. ~S");
        $str81$__Self_referential___genTemplate_ = SubLObjectFactory.makeString("~&Self-referential #$genTemplate formula:~% ~S.~%");
        $str82$__Bad_generic_arg_keyword___S__in = SubLObjectFactory.makeString("~&Bad generic arg keyword (~S) in~% ~S~%");
        $const83$genTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genTemplate"));
        $const84$genTemplate_QuerySentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genTemplate-QuerySentence"));
        $const85$genTemplate_Constrained = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genTemplate-Constrained"));
        $const86$detailedIsaParaphrase = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("detailedIsaParaphrase"));
        $str87$_non_wf__needs_instructions_for_i = SubLObjectFactory.makeString("-non-wf? needs instructions for invoking gen-template-recipe-p on ~S");
        $sym88$PHRASE_NAUT_ARG = SubLObjectFactory.makeSymbol("PHRASE-NAUT-ARG");
        $str89$_S_has_no_known_arity___ = SubLObjectFactory.makeString("~S has no known arity.~%");
        $sym90$_PHRASE_NAUT_ARG_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*PHRASE-NAUT-ARG-CACHING-STATE*");
        $int91$128 = SubLObjectFactory.makeInteger(128);
        $list92 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("GEN-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("REMAINDER"));
        $str93$_S_is_not_a_well_formed_genTempla = SubLObjectFactory.makeString("~S is not a well-formed genTemplate recipe.");
        $str94$PPH_PHRASE_FROM_GENTEMPLATE_PHRAS = SubLObjectFactory.makeString("PPH-PHRASE-FROM-GENTEMPLATE-PHRASE passed a non-PPH-PHRASE-NAUT: ~S.~% Expansion: ~S");
        $list95 = ConsesLow.list((SubLObject)pph_templates.ONE_INTEGER);
        $kw96$ARG1 = SubLObjectFactory.makeKeyword("ARG1");
        $sym97$PPH_ARG_POSITION_SPECIFIER_ = SubLObjectFactory.makeSymbol("PPH-ARG-POSITION-SPECIFIER?");
        $const98$PossessivePhrase = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PossessivePhrase"));
        $str99$Don_t_know_how_to_make_a_PPH_PHRA = SubLObjectFactory.makeString("Don't know how to make a PPH-PHRASE from ~S.");
        $str100$Couldn_t_make_PPH_phrase_from__S = SubLObjectFactory.makeString("Couldn't make PPH phrase from ~S");
        $kw101$SUBJECT_VERB = SubLObjectFactory.makeKeyword("SUBJECT-VERB");
        $str102$Bad_Nth_phrase___S__Dtr_count_is_ = SubLObjectFactory.makeString("Bad Nth phrase: ~S. Dtr count is ~S");
        $str103$Phrase_specified_to_agree_with_it = SubLObjectFactory.makeString("Phrase specified to agree with itself!~% ~S");
        $str104$Can_t_dereference__S_in____S = SubLObjectFactory.makeString("Can't dereference ~S in~% ~S");
        $str105$Potentially_recursive_agr___S____ = SubLObjectFactory.makeString("Potentially recursive agr: ~S~% ~S");
        $str106$Dereferenced__S_to__S = SubLObjectFactory.makeString("Dereferenced ~S to ~S");
        $sym107$PPH_HEAD_DTR_NAUT_ = SubLObjectFactory.makeSymbol("PPH-HEAD-DTR-NAUT?");
        $kw108$ARG2 = SubLObjectFactory.makeKeyword("ARG2");
        $str109$Incompatible_constraint__S_on__S = SubLObjectFactory.makeString("Incompatible constraint ~S on ~S");
        $str110$NthPhraseAgrFn = SubLObjectFactory.makeString("NthPhraseAgrFn");
        $kw111$PEER = SubLObjectFactory.makeKeyword("PEER");
        $str112$__Warning__null_constraint_on__S_ = SubLObjectFactory.makeString("~&Warning: null constraint on ~S.~%");
        $str113$Don_t_know_what_to_do_with__S_con = SubLObjectFactory.makeString("Don't know what to do with ~S constraint.");
        $const114$Verb = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb"));
        $list115 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhraseFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Determiner")));
        $const116$Determiner = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Determiner"));
        $list117 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhraseFn-Bar1")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun")));
        $list118 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nounStrings")));
        $kw119$DET_NBAR = SubLObjectFactory.makeKeyword("DET-NBAR");
        $kw120$ANY = SubLObjectFactory.makeKeyword("ANY");
        $kw121$NL_PREDS = SubLObjectFactory.makeKeyword("NL-PREDS");
        $kw122$POS_PRED = SubLObjectFactory.makeKeyword("POS-PRED");
        $str123$__Agr_preds_for_the_determiner__S = SubLObjectFactory.makeString("~&Agr preds for the determiner ~S are ~S.~%");
        $str124$Using_default_agr_preds__S_for__S = SubLObjectFactory.makeString("Using default agr preds ~S for ~S");
        $sym125$PPH_AGR_PREDS_FOR_DET_CYCL = SubLObjectFactory.makeSymbol("PPH-AGR-PREDS-FOR-DET-CYCL");
        $list126 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntervalMaxFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntervalMinFn")));
        $const127$denotation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotation"));
        $sym128$PPH_GENL_POS_PRED_ = SubLObjectFactory.makeSymbol("PPH-GENL-POS-PRED?");
        $const129$genFormat_ArgFixed = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genFormat-ArgFixed"));
        $const130$equals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"));
        $sym131$PPH_DNF_CLAUSAL_FORM_CACHED = SubLObjectFactory.makeSymbol("PPH-DNF-CLAUSAL-FORM-CACHED");
        $sym132$_PPH_DNF_CLAUSAL_FORM_CACHED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*PPH-DNF-CLAUSAL-FORM-CACHED-CACHING-STATE*");
        $sym133$PPH_DNF_CLAUSAL_FORM = SubLObjectFactory.makeSymbol("PPH-DNF-CLAUSAL-FORM");
        $list134 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEGATED-NEG-LITS"), (SubLObject)SubLObjectFactory.makeSymbol("NEGATED-POS-LITS"));
        $sym135$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym136$GENERALITY_ESTIMATE = SubLObjectFactory.makeSymbol("GENERALITY-ESTIMATE");
        $list137 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEGLITS"), (SubLObject)SubLObjectFactory.makeSymbol("POSLITS"));
        $str138$Don_t_know_how_to_convert__S_to__ = SubLObjectFactory.makeString("Don't know how to convert ~S to #$genTemplate.");
        $const139$Determiner_Indefinite = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Determiner-Indefinite"));
        $kw140$INDEFINITE = SubLObjectFactory.makeKeyword("INDEFINITE");
        $const141$Determiner_Definite = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Determiner-Definite"));
        $kw142$DEFINITE = SubLObjectFactory.makeKeyword("DEFINITE");
        $const143$nounStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nounStrings"));
        $const144$plural_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("plural-Generic"));
        $const145$nonSingular_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonSingular-Generic"));
        $const146$nonPlural_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic"));
        $sym147$GENTEMPLATE_PHRASE_FROM_PPH_PHRASE_INT = SubLObjectFactory.makeSymbol("GENTEMPLATE-PHRASE-FROM-PPH-PHRASE-INT");
        $const148$verbStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("verbStrings"));
        $sym149$PPH_CUSTOMIZE_TEMPLATE_MACRO_HELPER = SubLObjectFactory.makeSymbol("PPH-CUSTOMIZE-TEMPLATE-MACRO-HELPER");
        $sym150$DO_PPH_PHRASES_FOR_FORMULA = SubLObjectFactory.makeSymbol("DO-PPH-PHRASES-FOR-FORMULA");
        $kw151$UNSPECIFIED = SubLObjectFactory.makeKeyword("UNSPECIFIED");
        $list152 = ConsesLow.list((SubLObject)pph_templates.ZERO_INTEGER);
        $str153$__Found_PPH_PHRASE_for__S_____S__ = SubLObjectFactory.makeString("~&Found PPH-PHRASE for ~S:~% ~S~% Justification:~% ~S~% Copied from~% ~S~%");
        $sym154$GENERATE_PHRASE_FROM_TEMPLATE = SubLObjectFactory.makeSymbol("GENERATE-PHRASE-FROM-TEMPLATE");
        $sym155$_ = SubLObjectFactory.makeSymbol("<");
        $sym156$PPH_PHRASE_TOP_LEVEL_DEMERITS = SubLObjectFactory.makeSymbol("PPH-PHRASE-TOP-LEVEL-DEMERITS");
        $kw157$RANDOM = SubLObjectFactory.makeKeyword("RANDOM");
        $sym158$_ = SubLObjectFactory.makeSymbol(">");
        $sym159$GEN_TEMPLATE_VERBOSITY = SubLObjectFactory.makeSymbol("GEN-TEMPLATE-VERBOSITY");
        $sym160$GET_GEN_TEMPLATE_ASSERTION = SubLObjectFactory.makeSymbol("GET-GEN-TEMPLATE-ASSERTION");
        $kw161$GEN_FORMAT = SubLObjectFactory.makeKeyword("GEN-FORMAT");
        $str162$Couldn_t_use_gen_template_____S__ = SubLObjectFactory.makeString("Couldn't use gen-template:~% ~S~% Explanation ~S");
        $str163$Expected_gen_template__got__S__ = SubLObjectFactory.makeString("Expected gen-template, got ~S~%");
        $str164$Skipping_forbidden_lexical_assert = SubLObjectFactory.makeString("Skipping forbidden lexical assertion:~% ~S");
        $kw165$INVERSE = SubLObjectFactory.makeKeyword("INVERSE");
        $str166$__Reinitializing_relns_to_use___ = SubLObjectFactory.makeString("~&Reinitializing relns-to-use.~%");
        $const167$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $kw168$DEPTH = SubLObjectFactory.makeKeyword("DEPTH");
        $const169$True_JustificationTruth = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True-JustificationTruth"));
        $str170$Inverting_templates_for__S = SubLObjectFactory.makeString("Inverting templates for ~S");
        $sym171$PPH_GENL_RELATION_ = SubLObjectFactory.makeSymbol("PPH-GENL-RELATION?");
        $str172$Relns_to_use___S__ = SubLObjectFactory.makeString("Relns to use: ~S~%");
        $sym173$PPH_GENL_PREDS_DISTANCE = SubLObjectFactory.makeSymbol("PPH-GENL-PREDS-DISTANCE");
        $const174$genlInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $kw175$ASSERTION = SubLObjectFactory.makeKeyword("ASSERTION");
        $str176$__Using_inferior_templates___ = SubLObjectFactory.makeString("~&Using inferior templates.~%");
        $sym177$GENERATION_TEMPLATE_P = SubLObjectFactory.makeSymbol("GENERATION-TEMPLATE-P");
        $str178$__Head_of_queue_____S__ = SubLObjectFactory.makeString("~&Head of queue:~% ~S~%");
        $str179$Sending_inferior_templates_to_end = SubLObjectFactory.makeString("Sending inferior templates to end of queue:~% ~S");
        $str180$Couldn_t_use_any_gen_templates_fr = SubLObjectFactory.makeString("Couldn't use any gen-templates from ~S");
        $str181$__Reverting_to___genFormat_for__S = SubLObjectFactory.makeString("~&Reverting to #$genFormat for ~S~%");
        $kw182$INFERIOR = SubLObjectFactory.makeKeyword("INFERIOR");
        $str183$__Populating_gen_template_sets_wi = SubLObjectFactory.makeString("~&Populating gen-template sets with ~S~%");
        $kw184$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym185$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $str186$Adding__GEN_FORMAT_at_end_of_queu = SubLObjectFactory.makeString("Adding :GEN-FORMAT at end of queue for ~S~%");
        $sym187$CAND = SubLObjectFactory.makeSymbol("CAND");
        $list188 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"));
        $list189 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("NL-PREDS")));
        $sym190$RELEVANT_PRED_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-PRED-IS-EVERYTHING");
        $list191 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genFormat")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genFormat-Precise")));
        $str192$__Couldn_t_find_paraphrase_templa = SubLObjectFactory.makeString("~&Couldn't find paraphrase template for ~S. Using one for ~S instead.~%");
        $str193$Infinite_recursion_for__S_using__ = SubLObjectFactory.makeString("Infinite recursion for ~S using:~% ~S.~%");
        $sym194$PPH_GFAF_ASSERTIONS_FOR_RELN = SubLObjectFactory.makeSymbol("PPH-GFAF-ASSERTIONS-FOR-RELN");
        $int195$250 = SubLObjectFactory.makeInteger(250);
        $sym196$CAR = SubLObjectFactory.makeSymbol("CAR");
        $const197$genFormat_Precise = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genFormat-Precise"));
        $str198$Template_doesn_t_apply_to_input_f = SubLObjectFactory.makeString("Template doesn't apply to input formula.");
        $str199$___S_is_a_symmetric_binary_predic = SubLObjectFactory.makeString("~&~S is a symmetric binary predicate, so looking for a reversed template~%");
        $str200$__Switching_arg1_and_arg2_in_phra = SubLObjectFactory.makeString("~&Switching arg1 and arg2 in phrase.~%");
        $str201$wrong_focal_argnum__wanted__S_ = SubLObjectFactory.makeString("wrong focal argnum (wanted ~S)");
        $str202$Template_has_wrong_scope_for__S = SubLObjectFactory.makeString("Template has wrong scope for ~S");
        $sym203$_GEN_TEMPLATE_VERBOSITY_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*GEN-TEMPLATE-VERBOSITY-CACHING-STATE*");
        $int204$10000 = SubLObjectFactory.makeInteger(10000);
        $str205$Couldn_t_swtich_arg1_and_arg2___i = SubLObjectFactory.makeString("Couldn't swtich arg1 and arg2~% in ~S");
        $str206$Gen_template_mt__S_not_visible_fr = SubLObjectFactory.makeString("Gen-template mt ~S not visible from ~S");
        $str207$Gen_template_preds__S_not_compati = SubLObjectFactory.makeString("Gen-template preds ~S not compatible with ~S");
        $list208 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nounStrings")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("determinerStrings")));
        $kw209$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $str210$__Checking_precision_of__S_vs___S = SubLObjectFactory.makeString("~&Checking precision of ~S vs. ~S.~%");
        $str211$Not_using___genTemplate_because_o = SubLObjectFactory.makeString("Not using #$genTemplate because of existing #$genFormat-ArgFixed.");
        $str212$__Template_judged_imprecise_becau = SubLObjectFactory.makeString("~&Template judged imprecise because it did not reference ~S.~%");
        $list213 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MODES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReformulatorMode-Tersify"))));
        $list214 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("NONE"));
        $str215$Deepened____S___to__S = SubLObjectFactory.makeString("Deepened~% ~S~% to ~S");
        $const216$deeperGenTemplateRecipe = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("deeperGenTemplateRecipe"));
        $list217 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?DEEPER"));
        $kw218$MAX_TRANSFORMATION_DEPTH = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $kw219$MAX_NUMBER = SubLObjectFactory.makeKeyword("MAX-NUMBER");
        $kw220$MAX_TIME = SubLObjectFactory.makeKeyword("MAX-TIME");
        $kw221$CACHE_INFERENCE_RESULTS_ = SubLObjectFactory.makeKeyword("CACHE-INFERENCE-RESULTS?");
        $kw222$ANSWER_LANGUAGE = SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE");
        $kw223$HL = SubLObjectFactory.makeKeyword("HL");
        $kw224$CONTINUABLE_ = SubLObjectFactory.makeKeyword("CONTINUABLE?");
        $kw225$RETURN = SubLObjectFactory.makeKeyword("RETURN");
        $list226 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("?DEEPER"));
        $kw227$ALLOW_INDETERMINATE_RESULTS_ = SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?");
        $kw228$DISJUNCTION_FREE_EL_VARS_POLICY = SubLObjectFactory.makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY");
        $kw229$COMPUTE_INTERSECTION = SubLObjectFactory.makeKeyword("COMPUTE-INTERSECTION");
        $kw230$PROBLEM_STORE = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $kw231$INTERMEDIATE_STEP_VALIDATION_LEVEL = SubLObjectFactory.makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL");
        $kw232$NONE = SubLObjectFactory.makeKeyword("NONE");
        $str233$__Phrasifying__S___ = SubLObjectFactory.makeString("~&Phrasifying ~S.~%");
        $list234 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPORAL-LOCATION"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE"));
        $kw235$DO_PPH_EXPAND_PHRASE_NAUTS_RECURSION_LIMIT = SubLObjectFactory.makeKeyword("DO-PPH-EXPAND-PHRASE-NAUTS-RECURSION-LIMIT");
        $str236$__Expanded_form_is__S___ = SubLObjectFactory.makeString("~&Expanded form is ~S.~%");
        $sym237$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $str238$Recursion_limit_exceeded_expandin = SubLObjectFactory.makeString("Recursion limit exceeded expanding ~S~% ~S");
        $int239$50 = SubLObjectFactory.makeInteger(50);
        $str240$Already_expanded__S = SubLObjectFactory.makeString("Already expanded ~S");
        $sym241$DO_PPH_EXPAND_PHRASE_NAUTS = SubLObjectFactory.makeSymbol("DO-PPH-EXPAND-PHRASE-NAUTS");
        $sym242$PPH_IDENTITY_TEMPLATE_P = SubLObjectFactory.makeSymbol("PPH-IDENTITY-TEMPLATE-P");
        $str243$Expansions_that_refer_to__S_tend_ = SubLObjectFactory.makeString("Expansions that refer to ~S tend to cause infinite recursion.~%Can't expand ~S~%Expansion template: ~S~%");
        $str244$Checking__gen_template_store____ = SubLObjectFactory.makeString("Checking *gen-template-store*...");
        $list245 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THE-RELN"), (SubLObject)SubLObjectFactory.makeSymbol("ALL-ITS-TEMPLATES"));
        $str246$checking__S = SubLObjectFactory.makeString("checking ~S");
        $str247$non_wff_template__S___S = SubLObjectFactory.makeString("non-wff template ~S~%~S");
        $str248$Checking_the_misc__extent_of___Be = SubLObjectFactory.makeString("Checking the misc. extent of #$BestNLStringOfFn...");
        $str249$____ = SubLObjectFactory.makeString(".,;?");
        $const250$Function = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Function"));
        $sym251$CONSTANT_P = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $str252$Searching___genTemplate_Constrain = SubLObjectFactory.makeString("Searching #$genTemplate-Constrained...");
        $kw253$NULL = SubLObjectFactory.makeKeyword("NULL");
        $sym254$META_GEN_TEMPLATE_P = SubLObjectFactory.makeSymbol("META-GEN-TEMPLATE-P");
        $sym255$UPDATE_TEMPLATE_OPERATOR = SubLObjectFactory.makeSymbol("UPDATE-TEMPLATE-OPERATOR");
        $const256$metaGenTemplate_QuerySentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("metaGenTemplate-QuerySentence"));
        $kw257$OR = SubLObjectFactory.makeKeyword("OR");
        $sym258$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $sym259$MTEMPLATE_DISJUNCTION_P = SubLObjectFactory.makeSymbol("MTEMPLATE-DISJUNCTION-P");
        $kw260$AND = SubLObjectFactory.makeKeyword("AND");
        $str261$dependent_disjunction__a_has_vary = SubLObjectFactory.makeString("dependent disjunction ~a has varying arities in ~a");
        $str262$PPH_Template_Supercategory = SubLObjectFactory.makeString("PPH Template Supercategory");
        $str263$Gen_Template_Subcategory = SubLObjectFactory.makeString("Gen Template Subcategory");
        $str264$Gen_Template_Recipe_Test_Battery = SubLObjectFactory.makeString("Gen Template Recipe Test Battery");
    }
    
    public static final class $gen_template_verbosity$UnaryFunction extends UnaryFunction
    {
        public $gen_template_verbosity$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("GEN-TEMPLATE-VERBOSITY"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return pph_templates.gen_template_verbosity(arg1);
        }
    }
    
    public static final class $do_pph_expand_phrase_nauts$UnaryFunction extends UnaryFunction
    {
        public $do_pph_expand_phrase_nauts$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("DO-PPH-EXPAND-PHRASE-NAUTS"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return pph_templates.do_pph_expand_phrase_nauts(arg1);
        }
    }
}

/*

	Total time: 4707 ms
	
*/