package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_candidate_noun_compounds;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class candidate_nc_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.candidate_nc_utilities";
    public static final String myFingerPrint = "523c5e8d73556e4b484b9928d4ac4cc42e790febfd8baf818a4cbc67abc3f26f";
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 1026L)
    public static SubLSymbol $cnc_test_size$;
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 1119L)
    public static SubLSymbol $cnc_fast_test_size$;
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 1169L)
    public static SubLSymbol $cnc_query_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 1228L)
    public static SubLSymbol $cnc_paraphrase_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 1362L)
    public static SubLSymbol $cnc_running_query_total$;
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 1410L)
    public static SubLSymbol $cnc_default_search_engine$;
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 1470L)
    public static SubLSymbol $cnc_max_string_search_attempts$;
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 1531L)
    public static SubLSymbol $cnc_compound_threshold$;
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 1583L)
    public static SubLSymbol $cnc_component_threshold$;
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 1638L)
    public static SubLSymbol $cnc_string_hits_table$;
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 2099L)
    public static SubLSymbol $scored_ncr_table$;
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 2213L)
    public static SubLSymbol $unscored_ncr_table$;
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 2331L)
    public static SubLSymbol $use_cnc_iteratorP$;
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 2413L)
    public static SubLSymbol $cnc_remove_duplicatesP$;
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 7633L)
    private static SubLSymbol $nc_rule_constraint_predicate_map$;
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 8449L)
    private static SubLSymbol $run_cnc_query_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 11423L)
    private static SubLSymbol $popcorn_timer_pool$;
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 11483L)
    private static SubLSymbol $popcorn_timer_pool_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 12257L)
    private static SubLSymbol $cnc_popcorn_window$;
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 12413L)
    private static SubLSymbol $cnc_popcorn_minimum$;
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 12592L)
    public static SubLSymbol $dtp_candidate_nc_popcorn_timer$;
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 14467L)
    public static SubLSymbol $dtp_candidate_nc_iterator_state$;
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 15563L)
    private static SubLSymbol $cnc_rule_fort$;
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 16020L)
    public static SubLSymbol $dtp_candidate_nc_sub_iterator_state$;
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 20018L)
    private static SubLSymbol $cnc_max_tries$;
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 23407L)
    private static SubLSymbol $cnc_pph_demerit_cutoff$;
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 27411L)
    private static SubLSymbol $cnc_max_string_length$;
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 35727L)
    private static SubLSymbol $store_w_method_test_keyP$;
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 35783L)
    private static SubLSymbol $cnc_method_test_keyword$;
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 43112L)
    public static SubLSymbol $cnc_search_string_hits_bkup_file_prefix$;
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 43312L)
    public static SubLSymbol $scored_ncr_bkup_file_prefix$;
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 43438L)
    public static SubLSymbol $unscored_ncr_bkup_file_prefix$;
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 43568L)
    public static SubLSymbol $cnc_bkup_pairs$;
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 45765L)
    public static SubLSymbol $create_cnc_testP$;
    private static final SubLInteger $int0$1000;
    private static final SubLInteger $int1$300;
    private static final SubLObject $const2$GeneralEnglishMt;
    private static final SubLObject $const3$EnglishParaphraseMt;
    private static final SubLSymbol $kw4$YAHOO;
    private static final SubLInteger $int5$100;
    private static final SubLString $str6$_cyc_top_data_nl_cnc_tests_fht_da;
    private static final SubLString $str7$_cyc_top_data_nl_cnc_tests_fht_da;
    private static final SubLString $str8$_cyc_top_data_nl_cnc_tests_fht_da;
    private static final SubLObject $const9$TheNCHead;
    private static final SubLObject $const10$TheNCModifier;
    private static final SubLSymbol $kw11$PRODUCTIVITY_LIMIT;
    private static final SubLSymbol $kw12$POSITIVE_INFINITY;
    private static final SubLSymbol $kw13$WU;
    private static final SubLSymbol $kw14$EQL;
    private static final SubLSymbol $kw15$GENL;
    private static final SubLSymbol $kw16$ISA;
    private static final SubLSymbol $kw17$POS;
    private static final SubLSymbol $kw18$PRED;
    private static final SubLObject $const19$wordForms;
    private static final SubLList $list20;
    private static final SubLObject $const21$ist;
    private static final SubLList $list22;
    private static final SubLObject $const23$equals;
    private static final SubLSymbol $sym24$_DENOT;
    private static final SubLObject $const25$genls;
    private static final SubLObject $const26$FirstOrderCollection;
    private static final SubLList $list27;
    private static final SubLObject $const28$isa;
    private static final SubLObject $const29$termPhrases;
    private static final SubLList $list30;
    private static final SubLList $list31;
    private static final SubLString $str32$___The_modifier_is_underconstrain;
    private static final SubLList $list33;
    private static final SubLString $str34$___The_modifier_is_underconstrain;
    private static final SubLList $list35;
    private static final SubLString $str36$___The_head_is_underconstrained__;
    private static final SubLObject $const37$Noun;
    private static final SubLString $str38$___Added___nonPlural_Generic_cons;
    private static final SubLString $str39$___The_query_for__S_is___S__;
    private static final SubLList $list40;
    private static final SubLSymbol $sym41$_CONSTRAINT;
    private static final SubLObject $const42$InferencePSC;
    private static final SubLSymbol $sym43$RUN_CNC_QUERY;
    private static final SubLList $list44;
    private static final SubLSymbol $sym45$_RUN_CNC_QUERY_CACHING_STATE_;
    private static final SubLSymbol $kw46$MODIFIER;
    private static final SubLSymbol $kw47$HEAD;
    private static final SubLString $str48$___These_candidate_NCs_were_rejec;
    private static final SubLList $list49;
    private static final SubLList $list50;
    private static final SubLString $str51$_;
    private static final SubLSymbol $sym52$POSITIVE_INTEGER_P;
    private static final SubLString $str53$Popcorn_timer_minimum_must_be_les;
    private static final SubLString $str54$Popcorn_Timer_Pool_Lock;
    private static final SubLSymbol $kw55$FREE;
    private static final SubLInteger $int56$50;
    private static final SubLSymbol $sym57$CANDIDATE_NC_POPCORN_TIMER;
    private static final SubLSymbol $sym58$CANDIDATE_NC_POPCORN_TIMER_P;
    private static final SubLList $list59;
    private static final SubLList $list60;
    private static final SubLList $list61;
    private static final SubLList $list62;
    private static final SubLSymbol $sym63$PRINT_CNC_POPCORN_TIMER;
    private static final SubLSymbol $sym64$CANDIDATE_NC_POPCORN_TIMER_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list65;
    private static final SubLSymbol $sym66$CNC_POPCORN_TIMER_WINDOW;
    private static final SubLSymbol $sym67$_CSETF_CNC_POPCORN_TIMER_WINDOW;
    private static final SubLSymbol $sym68$CNC_POPCORN_TIMER_MINIMUM;
    private static final SubLSymbol $sym69$_CSETF_CNC_POPCORN_TIMER_MINIMUM;
    private static final SubLSymbol $sym70$CNC_POPCORN_TIMER_INDEX;
    private static final SubLSymbol $sym71$_CSETF_CNC_POPCORN_TIMER_INDEX;
    private static final SubLSymbol $sym72$CNC_POPCORN_TIMER_RECENT_FAILURE_COUNT;
    private static final SubLSymbol $sym73$_CSETF_CNC_POPCORN_TIMER_RECENT_FAILURE_COUNT;
    private static final SubLSymbol $sym74$CNC_POPCORN_TIMER_HISTORY;
    private static final SubLSymbol $sym75$_CSETF_CNC_POPCORN_TIMER_HISTORY;
    private static final SubLSymbol $kw76$WINDOW;
    private static final SubLSymbol $kw77$MINIMUM;
    private static final SubLSymbol $kw78$INDEX;
    private static final SubLSymbol $kw79$RECENT_FAILURE_COUNT;
    private static final SubLSymbol $kw80$HISTORY;
    private static final SubLString $str81$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw82$BEGIN;
    private static final SubLSymbol $sym83$MAKE_CANDIDATE_NC_POPCORN_TIMER;
    private static final SubLSymbol $kw84$SLOT;
    private static final SubLSymbol $kw85$END;
    private static final SubLSymbol $sym86$VISIT_DEFSTRUCT_OBJECT_CANDIDATE_NC_POPCORN_TIMER_METHOD;
    private static final SubLString $str87$_CNC_POPCORN_TIMER__S_of__S_;
    private static final SubLSymbol $sym88$CANDIDATE_NC_ITERATOR_STATE;
    private static final SubLSymbol $sym89$CANDIDATE_NC_ITERATOR_STATE_P;
    private static final SubLList $list90;
    private static final SubLList $list91;
    private static final SubLList $list92;
    private static final SubLList $list93;
    private static final SubLSymbol $sym94$PRINT_CNC_STATE;
    private static final SubLSymbol $sym95$CANDIDATE_NC_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list96;
    private static final SubLSymbol $sym97$CNC_STATE_RULE_FORT;
    private static final SubLSymbol $sym98$_CSETF_CNC_STATE_RULE_FORT;
    private static final SubLSymbol $sym99$CNC_STATE_MOD_ITERATOR;
    private static final SubLSymbol $sym100$_CSETF_CNC_STATE_MOD_ITERATOR;
    private static final SubLSymbol $sym101$CNC_STATE_HEAD_ITERATOR;
    private static final SubLSymbol $sym102$_CSETF_CNC_STATE_HEAD_ITERATOR;
    private static final SubLSymbol $sym103$CNC_STATE_MT;
    private static final SubLSymbol $sym104$_CSETF_CNC_STATE_MT;
    private static final SubLSymbol $sym105$CNC_STATE_DONE_;
    private static final SubLSymbol $sym106$_CSETF_CNC_STATE_DONE_;
    private static final SubLSymbol $kw107$RULE_FORT;
    private static final SubLSymbol $kw108$MOD_ITERATOR;
    private static final SubLSymbol $kw109$HEAD_ITERATOR;
    private static final SubLSymbol $kw110$MT;
    private static final SubLSymbol $kw111$DONE_;
    private static final SubLSymbol $sym112$MAKE_CANDIDATE_NC_ITERATOR_STATE;
    private static final SubLSymbol $sym113$VISIT_DEFSTRUCT_OBJECT_CANDIDATE_NC_ITERATOR_STATE_METHOD;
    private static final SubLString $str114$_CNC_STATE__S_;
    private static final SubLObject $const115$ncRuleConstraint;
    private static final SubLSymbol $sym116$CANDIDATE_NC_ITERATOR_DONE_;
    private static final SubLSymbol $sym117$CANDIDATE_NC_ITERATOR_NEXT;
    private static final SubLSymbol $sym118$CANDIDATE_NC_SUB_ITERATOR_STATE;
    private static final SubLSymbol $sym119$CANDIDATE_NC_SUB_ITERATOR_STATE_P;
    private static final SubLList $list120;
    private static final SubLList $list121;
    private static final SubLList $list122;
    private static final SubLList $list123;
    private static final SubLSymbol $sym124$PRINT_CNC_SUBSTATE;
    private static final SubLSymbol $sym125$CANDIDATE_NC_SUB_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list126;
    private static final SubLSymbol $sym127$CNC_SUBSTATE_WU_CONSTRAINTS;
    private static final SubLSymbol $sym128$_CSETF_CNC_SUBSTATE_WU_CONSTRAINTS;
    private static final SubLSymbol $sym129$CNC_SUBSTATE_EQUALS_CONSTRAINTS;
    private static final SubLSymbol $sym130$_CSETF_CNC_SUBSTATE_EQUALS_CONSTRAINTS;
    private static final SubLSymbol $sym131$CNC_SUBSTATE_GENLS_CONSTRAINTS;
    private static final SubLSymbol $sym132$_CSETF_CNC_SUBSTATE_GENLS_CONSTRAINTS;
    private static final SubLSymbol $sym133$CNC_SUBSTATE_ISA_CONSTRAINTS;
    private static final SubLSymbol $sym134$_CSETF_CNC_SUBSTATE_ISA_CONSTRAINTS;
    private static final SubLSymbol $sym135$CNC_SUBSTATE_POS_CONSTRAINTS;
    private static final SubLSymbol $sym136$_CSETF_CNC_SUBSTATE_POS_CONSTRAINTS;
    private static final SubLSymbol $sym137$CNC_SUBSTATE_POS_PRED_CONSTRAINTS;
    private static final SubLSymbol $sym138$_CSETF_CNC_SUBSTATE_POS_PRED_CONSTRAINTS;
    private static final SubLSymbol $sym139$CNC_SUBSTATE_MT;
    private static final SubLSymbol $sym140$_CSETF_CNC_SUBSTATE_MT;
    private static final SubLSymbol $sym141$CNC_SUBSTATE_PLIST;
    private static final SubLSymbol $sym142$_CSETF_CNC_SUBSTATE_PLIST;
    private static final SubLSymbol $sym143$CNC_SUBSTATE_DONE_;
    private static final SubLSymbol $sym144$_CSETF_CNC_SUBSTATE_DONE_;
    private static final SubLSymbol $kw145$WU_CONSTRAINTS;
    private static final SubLSymbol $kw146$EQUALS_CONSTRAINTS;
    private static final SubLSymbol $kw147$GENLS_CONSTRAINTS;
    private static final SubLSymbol $kw148$ISA_CONSTRAINTS;
    private static final SubLSymbol $kw149$POS_CONSTRAINTS;
    private static final SubLSymbol $kw150$POS_PRED_CONSTRAINTS;
    private static final SubLSymbol $kw151$PLIST;
    private static final SubLSymbol $sym152$MAKE_CANDIDATE_NC_SUB_ITERATOR_STATE;
    private static final SubLSymbol $sym153$VISIT_DEFSTRUCT_OBJECT_CANDIDATE_NC_SUB_ITERATOR_STATE_METHOD;
    private static final SubLString $str154$_CNC_SUBSTATE_;
    private static final SubLSymbol $sym155$CNC_MOD_ITERATOR_DONE_;
    private static final SubLSymbol $sym156$CNC_MOD_ITERATOR_NEXT;
    private static final SubLSymbol $sym157$CNC_HEAD_ITERATOR_DONE_;
    private static final SubLSymbol $sym158$CNC_HEAD_ITERATOR_NEXT;
    private static final SubLString $str159$Don_t_know_how_to_get__S_pair_fro;
    private static final SubLString $str160$_CNC_RULE_FORT__is_a_non_FORT___S;
    private static final SubLSymbol $kw161$QUERY_PAIRS;
    private static final SubLList $list162;
    private static final SubLSymbol $kw163$NO_DENOT;
    private static final SubLString $str164$More_than_one_equals_constraint__;
    private static final SubLString $str165$Couldn_t_find_string_for__S_match;
    private static final SubLSymbol $kw166$CHEAPEST_CONSTRAINT;
    private static final SubLSymbol $kw167$CHEAPEST_CONSTRAINT_MATCHES;
    private static final SubLString $str168$_S_tries___;
    private static final SubLString $str169$Couldn_t_find_a_string_denot_pair;
    private static final SubLSymbol $kw170$GENLS;
    private static final SubLList $list171;
    private static final SubLList $list172;
    private static final SubLList $list173;
    private static final SubLSymbol $kw174$RANDOM;
    private static final SubLInteger $int175$30;
    private static final SubLObject $const176$Adjective;
    private static final SubLList $list177;
    private static final SubLObject $const178$NounCompoundRule;
    private static final SubLString $str179$_S__;
    private static final SubLString $str180$Started_scoring__S_at__S_____;
    private static final SubLSymbol $kw181$TEST;
    private static final SubLSymbol $kw182$RUN_AGAINST;
    private static final SubLSymbol $kw183$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym184$IGNORE_ERRORS_HANDLER;
    private static final SubLSymbol $sym185$YAHOO_COUNT;
    private static final SubLSymbol $kw186$HIT_COUNT;
    private static final SubLSymbol $kw187$TIMESTAMP;
    private static final SubLSymbol $kw188$IMAGE_INDEPENDENT_CFASL;
    private static final SubLSymbol $sym189$CNC_GET_ENGINE;
    private static final SubLSymbol $kw190$ENGINE;
    private static final SubLSymbol $kw191$ITERATOR_TEST5;
    private static final SubLSymbol $sym192$STRING_HITS_KNOWN_;
    private static final SubLSymbol $sym193$NULL;
    private static final SubLSymbol $kw194$GOOGLE;
    private static final SubLSymbol $sym195$GOOGLE_COUNT;
    private static final SubLString $str196$Searched__A_for___S___Number_of_h;
    private static final SubLString $str197$_cyc_top_data_nl_cnc_tests_bkup_f;
    private static final SubLString $str198$_cyc_top_data_nl_cnc_tests_bkup_f;
    private static final SubLString $str199$_cyc_top_data_nl_cnc_tests_bkup_f;
    private static final SubLString $str200$_lisp;
    private static final SubLSymbol $kw201$OUTPUT;
    private static final SubLString $str202$Unable_to_open__S;
    private static final SubLString $str203$_S;
    private static final SubLSymbol $sym204$_;
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 1295L)
    public static SubLObject cnc_paraphrase_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return candidate_nc_utilities.$cnc_paraphrase_mt$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 2466L)
    public static SubLObject generate_cnc_test_strings(final SubLObject rule, SubLObject number, SubLObject mt, SubLObject remove_duplicatesP) {
        if (number == candidate_nc_utilities.UNPROVIDED) {
            number = candidate_nc_utilities.$cnc_test_size$.getDynamicValue();
        }
        if (mt == candidate_nc_utilities.UNPROVIDED) {
            mt = candidate_nc_utilities.$cnc_query_mt$.getDynamicValue();
        }
        if (remove_duplicatesP == candidate_nc_utilities.UNPROVIDED) {
            remove_duplicatesP = candidate_nc_utilities.$cnc_remove_duplicatesP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject compound_list = (candidate_nc_utilities.NIL != candidate_nc_utilities.$use_cnc_iteratorP$.getDynamicValue(thread)) ? generate_cnc_test_strings_from_iterator(czer_main.canonicalize_term(rule, (SubLObject)candidate_nc_utilities.UNPROVIDED), number, mt, remove_duplicatesP) : generate_cnc_test_strings_via_query(czer_main.canonicalize_term(rule, (SubLObject)candidate_nc_utilities.UNPROVIDED), number, mt, remove_duplicatesP);
        if (candidate_nc_utilities.NIL != compound_list) {
            compound_list = filter_cnc_semantics(czer_main.canonicalize_term(rule, (SubLObject)candidate_nc_utilities.UNPROVIDED), compound_list);
        }
        return compound_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 3069L)
    public static SubLObject generate_cnc_test_strings_via_query(final SubLObject rule, final SubLObject number, final SubLObject mt, final SubLObject remove_duplicatesP) {
        SubLObject compound_list = (SubLObject)candidate_nc_utilities.NIL;
        final SubLObject headword_results = cnc_string_denot_pairs(rule, candidate_nc_utilities.$const9$TheNCHead, mt);
        final SubLObject modifier_results = cnc_string_denot_pairs(rule, candidate_nc_utilities.$const10$TheNCModifier, mt);
        final SubLObject selected_headwords = get_random_n(number, headword_results);
        final SubLObject selected_modifiers = get_random_n(number, modifier_results);
        if (candidate_nc_utilities.NIL != selected_headwords && candidate_nc_utilities.NIL != selected_modifiers) {
            compound_list = combine_cnc_modifier_head_lists(selected_modifiers, selected_headwords, remove_duplicatesP);
        }
        return compound_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 3663L)
    public static SubLObject generate_cnc_test_strings_from_iterator(final SubLObject rule, final SubLObject number, final SubLObject mt, final SubLObject remove_duplicatesP) {
        SubLObject compound_list = (SubLObject)candidate_nc_utilities.NIL;
        final SubLObject cnc_it = new_candidate_nc_iterator(rule, mt);
        final SubLObject popcorn_timer = new_cnc_popcorn_timer((SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED);
        while (candidate_nc_utilities.NIL == iteration.iteration_done(cnc_it) && candidate_nc_utilities.NIL == list_utilities.lengthGE(compound_list, number, (SubLObject)candidate_nc_utilities.UNPROVIDED) && candidate_nc_utilities.NIL == cnc_popcorn_poppedP(popcorn_timer)) {
            final SubLObject next = iteration.iteration_next(cnc_it);
            final SubLObject failP = (SubLObject)SubLObjectFactory.makeBoolean(candidate_nc_utilities.NIL == remove_duplicatesP || candidate_nc_utilities.NIL != conses_high.member(next, compound_list, Symbols.symbol_function((SubLObject)candidate_nc_utilities.EQUAL), (SubLObject)candidate_nc_utilities.UNPROVIDED));
            if (candidate_nc_utilities.NIL != failP) {
                cnc_popcorn_note_failure(popcorn_timer);
            }
            else {
                if (!next.isCons()) {
                    continue;
                }
                compound_list = (SubLObject)ConsesLow.cons(next, compound_list);
                cnc_popcorn_note_success(popcorn_timer);
            }
        }
        free_popcorn_timer(popcorn_timer);
        return compound_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 4343L)
    public static SubLObject cnc_string_denot_pairs(final SubLObject rule, final SubLObject v_term, final SubLObject mt) {
        final SubLObject query_properties = (SubLObject)ConsesLow.list((SubLObject)candidate_nc_utilities.$kw11$PRODUCTIVITY_LIMIT, (SubLObject)candidate_nc_utilities.$kw12$POSITIVE_INFINITY);
        final SubLObject query_sentence = construct_cnc_query(rule, v_term);
        return run_cnc_query(query_sentence, mt, query_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 4587L)
    public static SubLObject construct_cnc_query(final SubLObject rule, final SubLObject v_term) {
        final SubLObject wu_constraints = nc_rule_term_constraints_of_type(rule, v_term, (SubLObject)candidate_nc_utilities.$kw13$WU);
        final SubLObject equals_constraints = nc_rule_term_constraints_of_type(rule, v_term, (SubLObject)candidate_nc_utilities.$kw14$EQL);
        final SubLObject genls_constraints = nc_rule_term_constraints_of_type(rule, v_term, (SubLObject)candidate_nc_utilities.$kw15$GENL);
        final SubLObject isa_constraints = nc_rule_term_constraints_of_type(rule, v_term, (SubLObject)candidate_nc_utilities.$kw16$ISA);
        final SubLObject pos_constraints = nc_rule_term_constraints_of_type(rule, v_term, (SubLObject)candidate_nc_utilities.$kw17$POS);
        final SubLObject pos_pred_constraints = nc_rule_term_constraints_of_type(rule, v_term, (SubLObject)candidate_nc_utilities.$kw18$PRED);
        SubLObject query_conjuncts = (SubLObject)candidate_nc_utilities.NIL;
        SubLObject cdolist_list_var = wu_constraints;
        SubLObject word = (SubLObject)candidate_nc_utilities.NIL;
        word = cdolist_list_var.first();
        while (candidate_nc_utilities.NIL != cdolist_list_var) {
            query_conjuncts = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(candidate_nc_utilities.$const19$wordForms, word, (SubLObject)candidate_nc_utilities.$list20), query_conjuncts);
            query_conjuncts = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(candidate_nc_utilities.$const21$ist, cnc_paraphrase_mt(), (SubLObject)candidate_nc_utilities.$list22), query_conjuncts);
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        }
        cdolist_list_var = equals_constraints;
        SubLObject v_equals = (SubLObject)candidate_nc_utilities.NIL;
        v_equals = cdolist_list_var.first();
        while (candidate_nc_utilities.NIL != cdolist_list_var) {
            query_conjuncts = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(candidate_nc_utilities.$const23$equals, (SubLObject)candidate_nc_utilities.$sym24$_DENOT, v_equals), query_conjuncts);
            cdolist_list_var = cdolist_list_var.rest();
            v_equals = cdolist_list_var.first();
        }
        cdolist_list_var = genls_constraints;
        SubLObject v_genls = (SubLObject)candidate_nc_utilities.NIL;
        v_genls = cdolist_list_var.first();
        while (candidate_nc_utilities.NIL != cdolist_list_var) {
            query_conjuncts = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(candidate_nc_utilities.$const25$genls, (SubLObject)candidate_nc_utilities.$sym24$_DENOT, v_genls), query_conjuncts);
            cdolist_list_var = cdolist_list_var.rest();
            v_genls = cdolist_list_var.first();
        }
        cdolist_list_var = isa_constraints;
        SubLObject v_isa = (SubLObject)candidate_nc_utilities.NIL;
        v_isa = cdolist_list_var.first();
        while (candidate_nc_utilities.NIL != cdolist_list_var) {
            if (candidate_nc_utilities.NIL != isa.isaP(v_isa, candidate_nc_utilities.$const26$FirstOrderCollection, (SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED)) {
                query_conjuncts = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(candidate_nc_utilities.$const21$ist, cnc_paraphrase_mt(), (SubLObject)candidate_nc_utilities.$list27), query_conjuncts);
            }
            query_conjuncts = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(candidate_nc_utilities.$const28$isa, (SubLObject)candidate_nc_utilities.$sym24$_DENOT, v_isa), query_conjuncts);
            cdolist_list_var = cdolist_list_var.rest();
            v_isa = cdolist_list_var.first();
        }
        cdolist_list_var = pos_constraints;
        SubLObject pos = (SubLObject)candidate_nc_utilities.NIL;
        pos = cdolist_list_var.first();
        while (candidate_nc_utilities.NIL != cdolist_list_var) {
            query_conjuncts = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(candidate_nc_utilities.$const21$ist, cnc_paraphrase_mt(), (SubLObject)ConsesLow.listS(candidate_nc_utilities.$const29$termPhrases, (SubLObject)candidate_nc_utilities.$sym24$_DENOT, pos, (SubLObject)candidate_nc_utilities.$list30)), query_conjuncts);
            cdolist_list_var = cdolist_list_var.rest();
            pos = cdolist_list_var.first();
        }
        cdolist_list_var = pos_pred_constraints;
        SubLObject pred = (SubLObject)candidate_nc_utilities.NIL;
        pred = cdolist_list_var.first();
        while (candidate_nc_utilities.NIL != cdolist_list_var) {
            query_conjuncts = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(candidate_nc_utilities.$const21$ist, cnc_paraphrase_mt(), (SubLObject)ConsesLow.listS(candidate_nc_utilities.$const29$termPhrases, (SubLObject)candidate_nc_utilities.$sym24$_DENOT, pred, (SubLObject)candidate_nc_utilities.$list30)), query_conjuncts);
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        }
        if (candidate_nc_utilities.NIL == isa_constraints && candidate_nc_utilities.NIL == genls_constraints && candidate_nc_utilities.NIL == equals_constraints && v_term.equal(candidate_nc_utilities.$const10$TheNCModifier)) {
            query_conjuncts = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(candidate_nc_utilities.$const21$ist, cnc_paraphrase_mt(), (SubLObject)candidate_nc_utilities.$list31), query_conjuncts);
            Errors.warn((SubLObject)candidate_nc_utilities.$str32$___The_modifier_is_underconstrain, v_term);
        }
        if (candidate_nc_utilities.NIL == pos_constraints && candidate_nc_utilities.NIL == pos_pred_constraints) {
            if (v_term.equal(candidate_nc_utilities.$const10$TheNCModifier)) {
                query_conjuncts = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(candidate_nc_utilities.$const21$ist, cnc_paraphrase_mt(), (SubLObject)candidate_nc_utilities.$list33), query_conjuncts);
                Errors.warn((SubLObject)candidate_nc_utilities.$str34$___The_modifier_is_underconstrain, v_term);
            }
            if (v_term.equal(candidate_nc_utilities.$const9$TheNCHead)) {
                query_conjuncts = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(candidate_nc_utilities.$const21$ist, cnc_paraphrase_mt(), (SubLObject)candidate_nc_utilities.$list35), query_conjuncts);
                Errors.warn((SubLObject)candidate_nc_utilities.$str36$___The_head_is_underconstrained__, v_term);
            }
        }
        if (v_term.equal(candidate_nc_utilities.$const10$TheNCModifier) && candidate_nc_utilities.NIL != lexicon_accessors.genl_posP(pos_constraints.first(), candidate_nc_utilities.$const37$Noun, (SubLObject)candidate_nc_utilities.UNPROVIDED) && candidate_nc_utilities.NIL == pos_pred_constraints) {
            query_conjuncts = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(candidate_nc_utilities.$const21$ist, cnc_paraphrase_mt(), (SubLObject)candidate_nc_utilities.$list33), query_conjuncts);
            Errors.warn((SubLObject)candidate_nc_utilities.$str38$___Added___nonPlural_Generic_cons, v_term);
        }
        final SubLObject query = simplifier.conjoin(query_conjuncts, (SubLObject)candidate_nc_utilities.UNPROVIDED);
        Errors.warn((SubLObject)candidate_nc_utilities.$str39$___The_query_for__S_is___S__, v_term, query);
        return query;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 7928L)
    public static SubLObject nc_rule_term_constraints_of_type(final SubLObject rule, final SubLObject v_term, final SubLObject type) {
        final SubLObject pred = list_utilities.alist_lookup_without_values(candidate_nc_utilities.$nc_rule_constraint_predicate_map$.getGlobalValue(), type, (SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED);
        final SubLObject var = (SubLObject)candidate_nc_utilities.$sym41$_CONSTRAINT;
        final SubLObject query_sentence = (SubLObject)((candidate_nc_utilities.NIL != pred) ? el_utilities.make_ternary_formula(pred, rule, v_term, var) : candidate_nc_utilities.NIL);
        final SubLObject query_mt = candidate_nc_utilities.$const42$InferencePSC;
        return (SubLObject)((candidate_nc_utilities.NIL != query_sentence) ? ask_utilities.query_variable(var, query_sentence, query_mt, (SubLObject)candidate_nc_utilities.UNPROVIDED) : candidate_nc_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 8449L)
    public static SubLObject clear_run_cnc_query() {
        final SubLObject cs = candidate_nc_utilities.$run_cnc_query_caching_state$.getGlobalValue();
        if (candidate_nc_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)candidate_nc_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 8449L)
    public static SubLObject remove_run_cnc_query(final SubLObject query, final SubLObject mt, final SubLObject query_properties) {
        return memoization_state.caching_state_remove_function_results_with_args(candidate_nc_utilities.$run_cnc_query_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(query, mt, query_properties), (SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 8449L)
    public static SubLObject run_cnc_query_internal(final SubLObject query, final SubLObject mt, final SubLObject query_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)candidate_nc_utilities.NIL;
        thread.resetMultipleValues();
        final SubLObject results = ask_utilities.query_template((SubLObject)candidate_nc_utilities.$list44, query, mt, query_properties);
        final SubLObject halt_reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        v_answer = results;
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 8449L)
    public static SubLObject run_cnc_query(final SubLObject query, final SubLObject mt, final SubLObject query_properties) {
        SubLObject caching_state = candidate_nc_utilities.$run_cnc_query_caching_state$.getGlobalValue();
        if (candidate_nc_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)candidate_nc_utilities.$sym43$RUN_CNC_QUERY, (SubLObject)candidate_nc_utilities.$sym45$_RUN_CNC_QUERY_CACHING_STATE_, (SubLObject)candidate_nc_utilities.NIL, (SubLObject)candidate_nc_utilities.EQUALP, (SubLObject)candidate_nc_utilities.THREE_INTEGER, (SubLObject)candidate_nc_utilities.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(query, mt, query_properties);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)candidate_nc_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)candidate_nc_utilities.NIL;
            collision = cdolist_list_var.first();
            while (candidate_nc_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (query.equalp(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equalp(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (candidate_nc_utilities.NIL != cached_args && candidate_nc_utilities.NIL == cached_args.rest() && query_properties.equalp(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(run_cnc_query_internal(query, mt, query_properties)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(query, mt, query_properties));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 8740L)
    public static SubLObject filter_cnc_semantics(final SubLObject rule, final SubLObject candidate_list) {
        SubLObject new_list = (SubLObject)candidate_nc_utilities.NIL;
        SubLObject rejected = (SubLObject)candidate_nc_utilities.NIL;
        SubLObject cdolist_list_var = candidate_list;
        SubLObject item = (SubLObject)candidate_nc_utilities.NIL;
        item = cdolist_list_var.first();
        while (candidate_nc_utilities.NIL != cdolist_list_var) {
            final SubLObject template = noun_compound_parser.rbp_rule_cycl_semx(rule, (SubLObject)candidate_nc_utilities.UNPROVIDED);
            final SubLObject modifier = conses_high.fourth(item);
            final SubLObject head = conses_high.fifth(item);
            if (candidate_nc_utilities.NIL != rbp_wff.rbp_wf_template_argsP(template, (SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)candidate_nc_utilities.$kw46$MODIFIER, modifier), reader.bq_cons((SubLObject)candidate_nc_utilities.$kw47$HEAD, head)), (SubLObject)candidate_nc_utilities.TWO_INTEGER)) {
                new_list = (SubLObject)ConsesLow.cons(item, new_list);
            }
            else {
                rejected = (SubLObject)ConsesLow.cons(item, rejected);
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        if (candidate_nc_utilities.NIL != rejected) {
            Errors.warn((SubLObject)candidate_nc_utilities.$str48$___These_candidate_NCs_were_rejec, rejected);
        }
        return new_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 9235L)
    public static SubLObject combine_cnc_modifier_head_lists(SubLObject mod_list, SubLObject head_list, SubLObject remove_duplicatesP) {
        if (remove_duplicatesP == candidate_nc_utilities.UNPROVIDED) {
            remove_duplicatesP = (SubLObject)candidate_nc_utilities.T;
        }
        SubLObject combined_list = (SubLObject)candidate_nc_utilities.NIL;
        while (candidate_nc_utilities.NIL == list_utilities.empty_list_p(mod_list) && candidate_nc_utilities.NIL == list_utilities.empty_list_p(head_list)) {
            final SubLObject mod_pair = mod_list.first();
            final SubLObject head_pair = head_list.first();
            final SubLObject result = combine_cnc_pairs(mod_pair, head_pair);
            combined_list = (SubLObject)ConsesLow.cons(result, combined_list);
            mod_list = mod_list.rest();
            head_list = head_list.rest();
        }
        if (candidate_nc_utilities.NIL != remove_duplicatesP) {
            return Sequences.remove_duplicates(combined_list, Symbols.symbol_function((SubLObject)candidate_nc_utilities.EQUAL), (SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED);
        }
        return combined_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 9747L)
    public static SubLObject combine_cnc_pairs(final SubLObject mod_pair, final SubLObject head_pair) {
        SubLObject mod_string = (SubLObject)candidate_nc_utilities.NIL;
        SubLObject mod_denot = (SubLObject)candidate_nc_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(mod_pair, mod_pair, (SubLObject)candidate_nc_utilities.$list49);
        mod_string = mod_pair.first();
        final SubLObject current = mod_denot = mod_pair.rest();
        SubLObject head_string = (SubLObject)candidate_nc_utilities.NIL;
        SubLObject head_denot = (SubLObject)candidate_nc_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(head_pair, head_pair, (SubLObject)candidate_nc_utilities.$list50);
        head_string = head_pair.first();
        final SubLObject current_$2 = head_denot = head_pair.rest();
        final SubLObject compound_string = Sequences.cconcatenate(mod_string, new SubLObject[] { candidate_nc_utilities.$str51$_, head_string });
        return (SubLObject)ConsesLow.list(compound_string, mod_string, head_string, mod_denot, head_denot);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 10074L)
    public static SubLObject get_random_n(final SubLObject number, final SubLObject list) {
        final SubLObject length = Sequences.length(list);
        SubLObject new_list = list;
        if (!length.numGE(number)) {
            SubLObject cdotimes_end_var;
            SubLObject i;
            for (cdotimes_end_var = number_utilities.f_1_(Numbers.ceiling(Numbers.divide(number, length), (SubLObject)candidate_nc_utilities.UNPROVIDED)), i = (SubLObject)candidate_nc_utilities.NIL, i = (SubLObject)candidate_nc_utilities.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)candidate_nc_utilities.ONE_INTEGER)) {
                new_list = ConsesLow.append(list, new_list);
            }
        }
        return list_utilities.random_n(number, new_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 10455L)
    public static SubLObject new_cnc_popcorn_timer(SubLObject window, SubLObject minimum) {
        if (window == candidate_nc_utilities.UNPROVIDED) {
            window = cnc_popcorn_window();
        }
        if (minimum == candidate_nc_utilities.UNPROVIDED) {
            minimum = cnc_popcorn_minimum();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert candidate_nc_utilities.NIL != subl_promotions.positive_integer_p(window) : window;
        assert candidate_nc_utilities.NIL != subl_promotions.positive_integer_p(minimum) : minimum;
        if (candidate_nc_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !minimum.numL(window)) {
            Errors.error((SubLObject)candidate_nc_utilities.$str53$Popcorn_timer_minimum_must_be_les);
        }
        return find_or_create_cnc_popcorn_timer(window, minimum);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 10848L)
    public static SubLObject cnc_popcorn_note_success(final SubLObject popcorn_timer) {
        cnc_popcorn_note_new_result(popcorn_timer, (SubLObject)candidate_nc_utilities.T);
        return popcorn_timer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 10977L)
    public static SubLObject cnc_popcorn_note_failure(final SubLObject popcorn_timer) {
        cnc_popcorn_note_new_result(popcorn_timer, (SubLObject)candidate_nc_utilities.NIL);
        return popcorn_timer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 11108L)
    public static SubLObject cnc_popcorn_poppedP(final SubLObject popcorn_timer) {
        final SubLObject minimum = get_cnc_popcorn_timer_minimum(popcorn_timer);
        final SubLObject window = get_cnc_popcorn_timer_window(popcorn_timer);
        final SubLObject recent_failure_count = get_cnc_popcorn_timer_recent_failure_count(popcorn_timer);
        return Numbers.numG(recent_failure_count, Numbers.subtract(window, minimum));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 11573L)
    public static SubLObject free_popcorn_timer(final SubLObject popcorn_timer) {
        dictionary_utilities.dictionary_pushnew(candidate_nc_utilities.$popcorn_timer_pool$.getGlobalValue(), get_cnc_popcorn_timer_window(popcorn_timer), popcorn_timer, (SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED);
        return (SubLObject)candidate_nc_utilities.$kw55$FREE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 11759L)
    public static SubLObject popcorn_timer_from_pool(final SubLObject window) {
        SubLObject popcorn_timer = (SubLObject)candidate_nc_utilities.NIL;
        SubLObject release = (SubLObject)candidate_nc_utilities.NIL;
        try {
            release = Locks.seize_lock(candidate_nc_utilities.$popcorn_timer_pool_lock$.getGlobalValue());
            final SubLObject existing = dictionary.dictionary_lookup_without_values(candidate_nc_utilities.$popcorn_timer_pool$.getGlobalValue(), window, (SubLObject)candidate_nc_utilities.UNPROVIDED);
            if (candidate_nc_utilities.NIL != existing) {
                popcorn_timer = existing.first();
                dictionary.dictionary_enter(candidate_nc_utilities.$popcorn_timer_pool$.getGlobalValue(), window, existing.rest());
            }
        }
        finally {
            if (candidate_nc_utilities.NIL != release) {
                Locks.release_lock(candidate_nc_utilities.$popcorn_timer_pool_lock$.getGlobalValue());
            }
        }
        if (candidate_nc_utilities.NIL != popcorn_timer) {
            SubLObject i;
            for (i = (SubLObject)candidate_nc_utilities.NIL, i = (SubLObject)candidate_nc_utilities.ZERO_INTEGER; i.numL(window); i = Numbers.add(i, (SubLObject)candidate_nc_utilities.ONE_INTEGER)) {
                Vectors.set_aref(cnc_popcorn_timer_history(popcorn_timer), i, (SubLObject)candidate_nc_utilities.NIL);
            }
        }
        return popcorn_timer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 12344L)
    public static SubLObject cnc_popcorn_window() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return candidate_nc_utilities.$cnc_popcorn_window$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 12521L)
    public static SubLObject cnc_popcorn_minimum() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return candidate_nc_utilities.$cnc_popcorn_minimum$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 12592L)
    public static SubLObject candidate_nc_popcorn_timer_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_cnc_popcorn_timer(v_object, stream, (SubLObject)candidate_nc_utilities.ZERO_INTEGER);
        return (SubLObject)candidate_nc_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 12592L)
    public static SubLObject candidate_nc_popcorn_timer_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $candidate_nc_popcorn_timer_native.class) ? candidate_nc_utilities.T : candidate_nc_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 12592L)
    public static SubLObject cnc_popcorn_timer_window(final SubLObject v_object) {
        assert candidate_nc_utilities.NIL != candidate_nc_popcorn_timer_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 12592L)
    public static SubLObject cnc_popcorn_timer_minimum(final SubLObject v_object) {
        assert candidate_nc_utilities.NIL != candidate_nc_popcorn_timer_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 12592L)
    public static SubLObject cnc_popcorn_timer_index(final SubLObject v_object) {
        assert candidate_nc_utilities.NIL != candidate_nc_popcorn_timer_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 12592L)
    public static SubLObject cnc_popcorn_timer_recent_failure_count(final SubLObject v_object) {
        assert candidate_nc_utilities.NIL != candidate_nc_popcorn_timer_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 12592L)
    public static SubLObject cnc_popcorn_timer_history(final SubLObject v_object) {
        assert candidate_nc_utilities.NIL != candidate_nc_popcorn_timer_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 12592L)
    public static SubLObject _csetf_cnc_popcorn_timer_window(final SubLObject v_object, final SubLObject value) {
        assert candidate_nc_utilities.NIL != candidate_nc_popcorn_timer_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 12592L)
    public static SubLObject _csetf_cnc_popcorn_timer_minimum(final SubLObject v_object, final SubLObject value) {
        assert candidate_nc_utilities.NIL != candidate_nc_popcorn_timer_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 12592L)
    public static SubLObject _csetf_cnc_popcorn_timer_index(final SubLObject v_object, final SubLObject value) {
        assert candidate_nc_utilities.NIL != candidate_nc_popcorn_timer_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 12592L)
    public static SubLObject _csetf_cnc_popcorn_timer_recent_failure_count(final SubLObject v_object, final SubLObject value) {
        assert candidate_nc_utilities.NIL != candidate_nc_popcorn_timer_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 12592L)
    public static SubLObject _csetf_cnc_popcorn_timer_history(final SubLObject v_object, final SubLObject value) {
        assert candidate_nc_utilities.NIL != candidate_nc_popcorn_timer_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 12592L)
    public static SubLObject make_candidate_nc_popcorn_timer(SubLObject arglist) {
        if (arglist == candidate_nc_utilities.UNPROVIDED) {
            arglist = (SubLObject)candidate_nc_utilities.NIL;
        }
        final SubLObject v_new = (SubLObject)new $candidate_nc_popcorn_timer_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)candidate_nc_utilities.NIL, next = arglist; candidate_nc_utilities.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)candidate_nc_utilities.$kw76$WINDOW)) {
                _csetf_cnc_popcorn_timer_window(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)candidate_nc_utilities.$kw77$MINIMUM)) {
                _csetf_cnc_popcorn_timer_minimum(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)candidate_nc_utilities.$kw78$INDEX)) {
                _csetf_cnc_popcorn_timer_index(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)candidate_nc_utilities.$kw79$RECENT_FAILURE_COUNT)) {
                _csetf_cnc_popcorn_timer_recent_failure_count(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)candidate_nc_utilities.$kw80$HISTORY)) {
                _csetf_cnc_popcorn_timer_history(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)candidate_nc_utilities.$str81$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 12592L)
    public static SubLObject visit_defstruct_candidate_nc_popcorn_timer(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)candidate_nc_utilities.$kw82$BEGIN, (SubLObject)candidate_nc_utilities.$sym83$MAKE_CANDIDATE_NC_POPCORN_TIMER, (SubLObject)candidate_nc_utilities.FIVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)candidate_nc_utilities.$kw84$SLOT, (SubLObject)candidate_nc_utilities.$kw76$WINDOW, cnc_popcorn_timer_window(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)candidate_nc_utilities.$kw84$SLOT, (SubLObject)candidate_nc_utilities.$kw77$MINIMUM, cnc_popcorn_timer_minimum(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)candidate_nc_utilities.$kw84$SLOT, (SubLObject)candidate_nc_utilities.$kw78$INDEX, cnc_popcorn_timer_index(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)candidate_nc_utilities.$kw84$SLOT, (SubLObject)candidate_nc_utilities.$kw79$RECENT_FAILURE_COUNT, cnc_popcorn_timer_recent_failure_count(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)candidate_nc_utilities.$kw84$SLOT, (SubLObject)candidate_nc_utilities.$kw80$HISTORY, cnc_popcorn_timer_history(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)candidate_nc_utilities.$kw85$END, (SubLObject)candidate_nc_utilities.$sym83$MAKE_CANDIDATE_NC_POPCORN_TIMER, (SubLObject)candidate_nc_utilities.FIVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 12592L)
    public static SubLObject visit_defstruct_object_candidate_nc_popcorn_timer_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_candidate_nc_popcorn_timer(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 12779L)
    public static SubLObject print_cnc_popcorn_timer(final SubLObject timer, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)candidate_nc_utilities.$str87$_CNC_POPCORN_TIMER__S_of__S_, cnc_popcorn_timer_minimum(timer), cnc_popcorn_timer_window(timer));
        return (SubLObject)candidate_nc_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 12993L)
    public static SubLObject get_cnc_popcorn_timer_window(final SubLObject timer) {
        return cnc_popcorn_timer_window(timer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 13089L)
    public static SubLObject get_cnc_popcorn_timer_minimum(final SubLObject timer) {
        return cnc_popcorn_timer_minimum(timer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 13187L)
    public static SubLObject get_cnc_popcorn_timer_recent_failure_count(final SubLObject timer) {
        return cnc_popcorn_timer_recent_failure_count(timer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 13311L)
    public static SubLObject find_or_create_cnc_popcorn_timer(final SubLObject window, final SubLObject minimum) {
        final SubLObject resourced_timer = popcorn_timer_from_pool(window);
        final SubLObject timer = (candidate_nc_utilities.NIL != resourced_timer) ? resourced_timer : make_candidate_nc_popcorn_timer((SubLObject)candidate_nc_utilities.UNPROVIDED);
        _csetf_cnc_popcorn_timer_window(timer, window);
        _csetf_cnc_popcorn_timer_minimum(timer, minimum);
        _csetf_cnc_popcorn_timer_index(timer, (SubLObject)candidate_nc_utilities.ZERO_INTEGER);
        _csetf_cnc_popcorn_timer_recent_failure_count(timer, (SubLObject)candidate_nc_utilities.ZERO_INTEGER);
        if (candidate_nc_utilities.NIL == resourced_timer) {
            _csetf_cnc_popcorn_timer_history(timer, Vectors.make_vector(window, (SubLObject)candidate_nc_utilities.UNPROVIDED));
        }
        return timer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 13840L)
    public static SubLObject cnc_popcorn_note_new_result(final SubLObject popcorn_timer, final SubLObject successP) {
        final SubLObject index = cnc_popcorn_timer_index(popcorn_timer);
        final SubLObject history = cnc_popcorn_timer_history(popcorn_timer);
        final SubLObject old_value = Vectors.aref(history, index);
        final SubLObject new_value = (SubLObject)((candidate_nc_utilities.NIL != successP) ? candidate_nc_utilities.ONE_INTEGER : candidate_nc_utilities.ZERO_INTEGER);
        Vectors.set_aref(history, index, new_value);
        _csetf_cnc_popcorn_timer_index(popcorn_timer, index.isPositive() ? number_utilities.f_1_(index) : number_utilities.f_1_(Sequences.length(history)));
        if (candidate_nc_utilities.ZERO_INTEGER.eql(old_value)) {
            _csetf_cnc_popcorn_timer_recent_failure_count(popcorn_timer, Numbers.subtract(cnc_popcorn_timer_recent_failure_count(popcorn_timer), (SubLObject)candidate_nc_utilities.ONE_INTEGER));
        }
        if (candidate_nc_utilities.ZERO_INTEGER.eql(new_value)) {
            _csetf_cnc_popcorn_timer_recent_failure_count(popcorn_timer, Numbers.add(cnc_popcorn_timer_recent_failure_count(popcorn_timer), (SubLObject)candidate_nc_utilities.ONE_INTEGER));
        }
        return popcorn_timer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 14467L)
    public static SubLObject candidate_nc_iterator_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_cnc_state(v_object, stream, (SubLObject)candidate_nc_utilities.ZERO_INTEGER);
        return (SubLObject)candidate_nc_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 14467L)
    public static SubLObject candidate_nc_iterator_state_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $candidate_nc_iterator_state_native.class) ? candidate_nc_utilities.T : candidate_nc_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 14467L)
    public static SubLObject cnc_state_rule_fort(final SubLObject v_object) {
        assert candidate_nc_utilities.NIL != candidate_nc_iterator_state_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 14467L)
    public static SubLObject cnc_state_mod_iterator(final SubLObject v_object) {
        assert candidate_nc_utilities.NIL != candidate_nc_iterator_state_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 14467L)
    public static SubLObject cnc_state_head_iterator(final SubLObject v_object) {
        assert candidate_nc_utilities.NIL != candidate_nc_iterator_state_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 14467L)
    public static SubLObject cnc_state_mt(final SubLObject v_object) {
        assert candidate_nc_utilities.NIL != candidate_nc_iterator_state_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 14467L)
    public static SubLObject cnc_state_doneP(final SubLObject v_object) {
        assert candidate_nc_utilities.NIL != candidate_nc_iterator_state_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 14467L)
    public static SubLObject _csetf_cnc_state_rule_fort(final SubLObject v_object, final SubLObject value) {
        assert candidate_nc_utilities.NIL != candidate_nc_iterator_state_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 14467L)
    public static SubLObject _csetf_cnc_state_mod_iterator(final SubLObject v_object, final SubLObject value) {
        assert candidate_nc_utilities.NIL != candidate_nc_iterator_state_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 14467L)
    public static SubLObject _csetf_cnc_state_head_iterator(final SubLObject v_object, final SubLObject value) {
        assert candidate_nc_utilities.NIL != candidate_nc_iterator_state_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 14467L)
    public static SubLObject _csetf_cnc_state_mt(final SubLObject v_object, final SubLObject value) {
        assert candidate_nc_utilities.NIL != candidate_nc_iterator_state_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 14467L)
    public static SubLObject _csetf_cnc_state_doneP(final SubLObject v_object, final SubLObject value) {
        assert candidate_nc_utilities.NIL != candidate_nc_iterator_state_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 14467L)
    public static SubLObject make_candidate_nc_iterator_state(SubLObject arglist) {
        if (arglist == candidate_nc_utilities.UNPROVIDED) {
            arglist = (SubLObject)candidate_nc_utilities.NIL;
        }
        final SubLObject v_new = (SubLObject)new $candidate_nc_iterator_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)candidate_nc_utilities.NIL, next = arglist; candidate_nc_utilities.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)candidate_nc_utilities.$kw107$RULE_FORT)) {
                _csetf_cnc_state_rule_fort(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)candidate_nc_utilities.$kw108$MOD_ITERATOR)) {
                _csetf_cnc_state_mod_iterator(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)candidate_nc_utilities.$kw109$HEAD_ITERATOR)) {
                _csetf_cnc_state_head_iterator(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)candidate_nc_utilities.$kw110$MT)) {
                _csetf_cnc_state_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)candidate_nc_utilities.$kw111$DONE_)) {
                _csetf_cnc_state_doneP(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)candidate_nc_utilities.$str81$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 14467L)
    public static SubLObject visit_defstruct_candidate_nc_iterator_state(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)candidate_nc_utilities.$kw82$BEGIN, (SubLObject)candidate_nc_utilities.$sym112$MAKE_CANDIDATE_NC_ITERATOR_STATE, (SubLObject)candidate_nc_utilities.FIVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)candidate_nc_utilities.$kw84$SLOT, (SubLObject)candidate_nc_utilities.$kw107$RULE_FORT, cnc_state_rule_fort(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)candidate_nc_utilities.$kw84$SLOT, (SubLObject)candidate_nc_utilities.$kw108$MOD_ITERATOR, cnc_state_mod_iterator(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)candidate_nc_utilities.$kw84$SLOT, (SubLObject)candidate_nc_utilities.$kw109$HEAD_ITERATOR, cnc_state_head_iterator(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)candidate_nc_utilities.$kw84$SLOT, (SubLObject)candidate_nc_utilities.$kw110$MT, cnc_state_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)candidate_nc_utilities.$kw84$SLOT, (SubLObject)candidate_nc_utilities.$kw111$DONE_, cnc_state_doneP(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)candidate_nc_utilities.$kw85$END, (SubLObject)candidate_nc_utilities.$sym112$MAKE_CANDIDATE_NC_ITERATOR_STATE, (SubLObject)candidate_nc_utilities.FIVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 14467L)
    public static SubLObject visit_defstruct_object_candidate_nc_iterator_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_candidate_nc_iterator_state(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 14675L)
    public static SubLObject print_cnc_state(final SubLObject state, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)candidate_nc_utilities.$str114$_CNC_STATE__S_, cnc_state_rule_fort(state));
        return (SubLObject)candidate_nc_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 14825L)
    public static SubLObject new_candidate_nc_iterator(final SubLObject rule, SubLObject mt) {
        if (mt == candidate_nc_utilities.UNPROVIDED) {
            mt = candidate_nc_utilities.$cnc_query_mt$.getDynamicValue();
        }
        final SubLObject mod_iterator = new_cnc_mod_iterator(rule, mt);
        final SubLObject head_iterator = new_cnc_head_iterator(rule, mt);
        final SubLObject cnc_state = make_candidate_nc_iterator_state((SubLObject)ConsesLow.list(new SubLObject[] { candidate_nc_utilities.$kw107$RULE_FORT, rule, candidate_nc_utilities.$kw108$MOD_ITERATOR, mod_iterator, candidate_nc_utilities.$kw109$HEAD_ITERATOR, head_iterator, candidate_nc_utilities.$kw110$MT, mt, candidate_nc_utilities.$kw111$DONE_, SubLObjectFactory.makeBoolean(candidate_nc_utilities.NIL == kb_mapping_utilities.some_pred_value_in_relevant_mts(rule, candidate_nc_utilities.$const115$ncRuleConstraint, mt, (SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED)) }));
        return iteration.new_iterator(cnc_state, (SubLObject)candidate_nc_utilities.$sym116$CANDIDATE_NC_ITERATOR_DONE_, (SubLObject)candidate_nc_utilities.$sym117$CANDIDATE_NC_ITERATOR_NEXT, (SubLObject)candidate_nc_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 15364L)
    public static SubLObject candidate_nc_iterator_doneP(final SubLObject state) {
        return (SubLObject)SubLObjectFactory.makeBoolean(candidate_nc_utilities.NIL != iteration.iteration_done(cnc_state_mod_iterator(state)) || candidate_nc_utilities.NIL != iteration.iteration_done(cnc_state_head_iterator(state)) || candidate_nc_utilities.NIL != cnc_state_doneP(state));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 15607L)
    public static SubLObject candidate_nc_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mod_pair = (SubLObject)candidate_nc_utilities.NIL;
        SubLObject head_pair = (SubLObject)candidate_nc_utilities.NIL;
        final SubLObject _prev_bind_0 = candidate_nc_utilities.$cnc_rule_fort$.currentBinding(thread);
        try {
            candidate_nc_utilities.$cnc_rule_fort$.bind(cnc_state_rule_fort(state), thread);
            mod_pair = iteration.iteration_next_without_values(cnc_state_mod_iterator(state), (SubLObject)candidate_nc_utilities.UNPROVIDED);
            head_pair = iteration.iteration_next_without_values(cnc_state_head_iterator(state), (SubLObject)candidate_nc_utilities.UNPROVIDED);
        }
        finally {
            candidate_nc_utilities.$cnc_rule_fort$.rebind(_prev_bind_0, thread);
        }
        return Values.values((SubLObject)((candidate_nc_utilities.NIL != mod_pair && candidate_nc_utilities.NIL != head_pair) ? combine_cnc_pairs(mod_pair, head_pair) : candidate_nc_utilities.NIL), state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 16020L)
    public static SubLObject candidate_nc_sub_iterator_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_cnc_substate(v_object, stream, (SubLObject)candidate_nc_utilities.ZERO_INTEGER);
        return (SubLObject)candidate_nc_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 16020L)
    public static SubLObject candidate_nc_sub_iterator_state_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $candidate_nc_sub_iterator_state_native.class) ? candidate_nc_utilities.T : candidate_nc_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 16020L)
    public static SubLObject cnc_substate_wu_constraints(final SubLObject v_object) {
        assert candidate_nc_utilities.NIL != candidate_nc_sub_iterator_state_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 16020L)
    public static SubLObject cnc_substate_equals_constraints(final SubLObject v_object) {
        assert candidate_nc_utilities.NIL != candidate_nc_sub_iterator_state_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 16020L)
    public static SubLObject cnc_substate_genls_constraints(final SubLObject v_object) {
        assert candidate_nc_utilities.NIL != candidate_nc_sub_iterator_state_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 16020L)
    public static SubLObject cnc_substate_isa_constraints(final SubLObject v_object) {
        assert candidate_nc_utilities.NIL != candidate_nc_sub_iterator_state_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 16020L)
    public static SubLObject cnc_substate_pos_constraints(final SubLObject v_object) {
        assert candidate_nc_utilities.NIL != candidate_nc_sub_iterator_state_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 16020L)
    public static SubLObject cnc_substate_pos_pred_constraints(final SubLObject v_object) {
        assert candidate_nc_utilities.NIL != candidate_nc_sub_iterator_state_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 16020L)
    public static SubLObject cnc_substate_mt(final SubLObject v_object) {
        assert candidate_nc_utilities.NIL != candidate_nc_sub_iterator_state_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 16020L)
    public static SubLObject cnc_substate_plist(final SubLObject v_object) {
        assert candidate_nc_utilities.NIL != candidate_nc_sub_iterator_state_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 16020L)
    public static SubLObject cnc_substate_doneP(final SubLObject v_object) {
        assert candidate_nc_utilities.NIL != candidate_nc_sub_iterator_state_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 16020L)
    public static SubLObject _csetf_cnc_substate_wu_constraints(final SubLObject v_object, final SubLObject value) {
        assert candidate_nc_utilities.NIL != candidate_nc_sub_iterator_state_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 16020L)
    public static SubLObject _csetf_cnc_substate_equals_constraints(final SubLObject v_object, final SubLObject value) {
        assert candidate_nc_utilities.NIL != candidate_nc_sub_iterator_state_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 16020L)
    public static SubLObject _csetf_cnc_substate_genls_constraints(final SubLObject v_object, final SubLObject value) {
        assert candidate_nc_utilities.NIL != candidate_nc_sub_iterator_state_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 16020L)
    public static SubLObject _csetf_cnc_substate_isa_constraints(final SubLObject v_object, final SubLObject value) {
        assert candidate_nc_utilities.NIL != candidate_nc_sub_iterator_state_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 16020L)
    public static SubLObject _csetf_cnc_substate_pos_constraints(final SubLObject v_object, final SubLObject value) {
        assert candidate_nc_utilities.NIL != candidate_nc_sub_iterator_state_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 16020L)
    public static SubLObject _csetf_cnc_substate_pos_pred_constraints(final SubLObject v_object, final SubLObject value) {
        assert candidate_nc_utilities.NIL != candidate_nc_sub_iterator_state_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 16020L)
    public static SubLObject _csetf_cnc_substate_mt(final SubLObject v_object, final SubLObject value) {
        assert candidate_nc_utilities.NIL != candidate_nc_sub_iterator_state_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 16020L)
    public static SubLObject _csetf_cnc_substate_plist(final SubLObject v_object, final SubLObject value) {
        assert candidate_nc_utilities.NIL != candidate_nc_sub_iterator_state_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 16020L)
    public static SubLObject _csetf_cnc_substate_doneP(final SubLObject v_object, final SubLObject value) {
        assert candidate_nc_utilities.NIL != candidate_nc_sub_iterator_state_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 16020L)
    public static SubLObject make_candidate_nc_sub_iterator_state(SubLObject arglist) {
        if (arglist == candidate_nc_utilities.UNPROVIDED) {
            arglist = (SubLObject)candidate_nc_utilities.NIL;
        }
        final SubLObject v_new = (SubLObject)new $candidate_nc_sub_iterator_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)candidate_nc_utilities.NIL, next = arglist; candidate_nc_utilities.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)candidate_nc_utilities.$kw145$WU_CONSTRAINTS)) {
                _csetf_cnc_substate_wu_constraints(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)candidate_nc_utilities.$kw146$EQUALS_CONSTRAINTS)) {
                _csetf_cnc_substate_equals_constraints(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)candidate_nc_utilities.$kw147$GENLS_CONSTRAINTS)) {
                _csetf_cnc_substate_genls_constraints(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)candidate_nc_utilities.$kw148$ISA_CONSTRAINTS)) {
                _csetf_cnc_substate_isa_constraints(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)candidate_nc_utilities.$kw149$POS_CONSTRAINTS)) {
                _csetf_cnc_substate_pos_constraints(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)candidate_nc_utilities.$kw150$POS_PRED_CONSTRAINTS)) {
                _csetf_cnc_substate_pos_pred_constraints(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)candidate_nc_utilities.$kw110$MT)) {
                _csetf_cnc_substate_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)candidate_nc_utilities.$kw151$PLIST)) {
                _csetf_cnc_substate_plist(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)candidate_nc_utilities.$kw111$DONE_)) {
                _csetf_cnc_substate_doneP(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)candidate_nc_utilities.$str81$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 16020L)
    public static SubLObject visit_defstruct_candidate_nc_sub_iterator_state(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)candidate_nc_utilities.$kw82$BEGIN, (SubLObject)candidate_nc_utilities.$sym152$MAKE_CANDIDATE_NC_SUB_ITERATOR_STATE, (SubLObject)candidate_nc_utilities.NINE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)candidate_nc_utilities.$kw84$SLOT, (SubLObject)candidate_nc_utilities.$kw145$WU_CONSTRAINTS, cnc_substate_wu_constraints(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)candidate_nc_utilities.$kw84$SLOT, (SubLObject)candidate_nc_utilities.$kw146$EQUALS_CONSTRAINTS, cnc_substate_equals_constraints(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)candidate_nc_utilities.$kw84$SLOT, (SubLObject)candidate_nc_utilities.$kw147$GENLS_CONSTRAINTS, cnc_substate_genls_constraints(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)candidate_nc_utilities.$kw84$SLOT, (SubLObject)candidate_nc_utilities.$kw148$ISA_CONSTRAINTS, cnc_substate_isa_constraints(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)candidate_nc_utilities.$kw84$SLOT, (SubLObject)candidate_nc_utilities.$kw149$POS_CONSTRAINTS, cnc_substate_pos_constraints(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)candidate_nc_utilities.$kw84$SLOT, (SubLObject)candidate_nc_utilities.$kw150$POS_PRED_CONSTRAINTS, cnc_substate_pos_pred_constraints(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)candidate_nc_utilities.$kw84$SLOT, (SubLObject)candidate_nc_utilities.$kw110$MT, cnc_substate_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)candidate_nc_utilities.$kw84$SLOT, (SubLObject)candidate_nc_utilities.$kw151$PLIST, cnc_substate_plist(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)candidate_nc_utilities.$kw84$SLOT, (SubLObject)candidate_nc_utilities.$kw111$DONE_, cnc_substate_doneP(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)candidate_nc_utilities.$kw85$END, (SubLObject)candidate_nc_utilities.$sym152$MAKE_CANDIDATE_NC_SUB_ITERATOR_STATE, (SubLObject)candidate_nc_utilities.NINE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 16020L)
    public static SubLObject visit_defstruct_object_candidate_nc_sub_iterator_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_candidate_nc_sub_iterator_state(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 16280L)
    public static SubLObject print_cnc_substate(final SubLObject state, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)candidate_nc_utilities.$str154$_CNC_SUBSTATE_);
        return (SubLObject)candidate_nc_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 16408L)
    public static SubLObject cnc_substate_plist_enter(final SubLObject state, final SubLObject key, final SubLObject value) {
        _csetf_cnc_substate_plist(state, conses_high.putf(cnc_substate_plist(state), key, value));
        return cnc_substate_plist(state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 16587L)
    public static SubLObject cnc_substate_plist_lookup(final SubLObject state, final SubLObject key, SubLObject default_value) {
        if (default_value == candidate_nc_utilities.UNPROVIDED) {
            default_value = (SubLObject)candidate_nc_utilities.NIL;
        }
        return conses_high.getf(cnc_substate_plist(state), key, default_value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 16727L)
    public static SubLObject new_cnc_mod_iterator(final SubLObject rule, final SubLObject mt) {
        final SubLObject state = make_candidate_nc_sub_iterator_state(cnc_sub_iterator_slot_values(rule, candidate_nc_utilities.$const10$TheNCModifier, mt));
        return iteration.new_iterator(state, (SubLObject)candidate_nc_utilities.$sym155$CNC_MOD_ITERATOR_DONE_, (SubLObject)candidate_nc_utilities.$sym156$CNC_MOD_ITERATOR_NEXT, (SubLObject)candidate_nc_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 16971L)
    public static SubLObject cnc_mod_iterator_doneP(final SubLObject state) {
        return cnc_substate_doneP(state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 17055L)
    public static SubLObject cnc_mod_iterator_next(final SubLObject state) {
        final SubLObject mod_pair = cnc_random_mod_pair_from_state(state);
        return Values.values(mod_pair, state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 17198L)
    public static SubLObject cnc_random_mod_pair_from_state(final SubLObject state) {
        return cnc_random_pair_from_state(state, (SubLObject)candidate_nc_utilities.$kw46$MODIFIER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 17308L)
    public static SubLObject cnc_sub_iterator_slot_values(final SubLObject rule, final SubLObject v_term, final SubLObject mt) {
        return (SubLObject)ConsesLow.list(new SubLObject[] { candidate_nc_utilities.$kw145$WU_CONSTRAINTS, nc_rule_term_constraints_of_type(rule, v_term, (SubLObject)candidate_nc_utilities.$kw13$WU), candidate_nc_utilities.$kw146$EQUALS_CONSTRAINTS, nc_rule_term_constraints_of_type(rule, v_term, (SubLObject)candidate_nc_utilities.$kw14$EQL), candidate_nc_utilities.$kw147$GENLS_CONSTRAINTS, nc_rule_term_constraints_of_type(rule, v_term, (SubLObject)candidate_nc_utilities.$kw15$GENL), candidate_nc_utilities.$kw148$ISA_CONSTRAINTS, nc_rule_term_constraints_of_type(rule, v_term, (SubLObject)candidate_nc_utilities.$kw16$ISA), candidate_nc_utilities.$kw149$POS_CONSTRAINTS, nc_rule_term_constraints_of_type(rule, v_term, (SubLObject)candidate_nc_utilities.$kw17$POS), candidate_nc_utilities.$kw150$POS_PRED_CONSTRAINTS, nc_rule_term_constraints_of_type(rule, v_term, (SubLObject)candidate_nc_utilities.$kw18$PRED), candidate_nc_utilities.$kw110$MT, mt });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 17882L)
    public static SubLObject new_cnc_head_iterator(final SubLObject rule, final SubLObject mt) {
        final SubLObject state = make_candidate_nc_sub_iterator_state(cnc_sub_iterator_slot_values(rule, candidate_nc_utilities.$const9$TheNCHead, mt));
        return iteration.new_iterator(state, (SubLObject)candidate_nc_utilities.$sym157$CNC_HEAD_ITERATOR_DONE_, (SubLObject)candidate_nc_utilities.$sym158$CNC_HEAD_ITERATOR_NEXT, (SubLObject)candidate_nc_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 18125L)
    public static SubLObject cnc_head_iterator_doneP(final SubLObject state) {
        return cnc_substate_doneP(state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 18210L)
    public static SubLObject cnc_head_iterator_next(final SubLObject state) {
        final SubLObject head_pair = cnc_random_head_pair_from_state(state);
        return Values.values(head_pair, state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 18357L)
    public static SubLObject cnc_random_head_pair_from_state(final SubLObject state) {
        return cnc_random_pair_from_state(state, (SubLObject)candidate_nc_utilities.$kw47$HEAD);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 18464L)
    public static SubLObject cnc_random_pair_from_state(final SubLObject state, final SubLObject head_or_modifier) {
        if (candidate_nc_utilities.NIL != cnc_substate_wu_constraints(state)) {
            return cnc_random_pair_from_wu_constraints(state, head_or_modifier);
        }
        if (candidate_nc_utilities.NIL != cnc_substate_equals_constraints(state)) {
            return cnc_random_pair_from_equals_constraints(state, head_or_modifier);
        }
        if (candidate_nc_utilities.NIL != cnc_substate_isa_constraints(state) || candidate_nc_utilities.NIL != cnc_substate_genls_constraints(state)) {
            return cnc_random_pair_from_isaXgenls_constraints(state, head_or_modifier);
        }
        Errors.warn((SubLObject)candidate_nc_utilities.$str159$Don_t_know_how_to_get__S_pair_fro, head_or_modifier, state);
        _csetf_cnc_substate_doneP(state, (SubLObject)candidate_nc_utilities.T);
        return (SubLObject)candidate_nc_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 19111L)
    public static SubLObject cnc_random_pair_via_query(final SubLObject state, final SubLObject head_or_modifier) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (candidate_nc_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && candidate_nc_utilities.NIL == forts.fort_p(candidate_nc_utilities.$cnc_rule_fort$.getDynamicValue(thread))) {
            Errors.error((SubLObject)candidate_nc_utilities.$str160$_CNC_RULE_FORT__is_a_non_FORT___S, candidate_nc_utilities.$cnc_rule_fort$.getDynamicValue(thread));
        }
        final SubLObject pairs = get_cnc_substate_query_pairs(state, head_or_modifier);
        return list_utilities.random_element(pairs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 19380L)
    public static SubLObject get_cnc_substate_query_pairs(final SubLObject state, final SubLObject head_or_modifier) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = list_utilities.alist_lookup_without_values(cnc_substate_plist_lookup(state, (SubLObject)candidate_nc_utilities.$kw161$QUERY_PAIRS, (SubLObject)candidate_nc_utilities.NIL), head_or_modifier, (SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED);
        if (candidate_nc_utilities.NIL == ans) {
            if (candidate_nc_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && candidate_nc_utilities.NIL == forts.fort_p(candidate_nc_utilities.$cnc_rule_fort$.getDynamicValue(thread))) {
                Errors.error((SubLObject)candidate_nc_utilities.$str160$_CNC_RULE_FORT__is_a_non_FORT___S, candidate_nc_utilities.$cnc_rule_fort$.getDynamicValue(thread));
            }
            final SubLObject v_term = (head_or_modifier == candidate_nc_utilities.$kw47$HEAD) ? candidate_nc_utilities.$const9$TheNCHead : candidate_nc_utilities.$const10$TheNCModifier;
            ans = cnc_string_denot_pairs(candidate_nc_utilities.$cnc_rule_fort$.getDynamicValue(thread), v_term, cnc_substate_mt(state));
            cnc_substate_plist_enter(state, (SubLObject)candidate_nc_utilities.$kw161$QUERY_PAIRS, list_utilities.alist_enter(cnc_substate_plist_lookup(state, (SubLObject)candidate_nc_utilities.$kw161$QUERY_PAIRS, (SubLObject)candidate_nc_utilities.NIL), head_or_modifier, ans, (SubLObject)candidate_nc_utilities.UNPROVIDED));
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 20156L)
    public static SubLObject cnc_random_pair_from_wu_constraints(final SubLObject state, final SubLObject head_or_modifier) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (candidate_nc_utilities.NIL != list_utilities.lengthG(cnc_substate_wu_constraints(state), (SubLObject)candidate_nc_utilities.ONE_INTEGER, (SubLObject)candidate_nc_utilities.UNPROVIDED) || candidate_nc_utilities.NIL != list_utilities.lengthG(cnc_substate_pos_constraints(state), (SubLObject)candidate_nc_utilities.ONE_INTEGER, (SubLObject)candidate_nc_utilities.UNPROVIDED) || candidate_nc_utilities.NIL != list_utilities.lengthG(cnc_substate_pos_pred_constraints(state), (SubLObject)candidate_nc_utilities.ZERO_INTEGER, (SubLObject)candidate_nc_utilities.UNPROVIDED) || candidate_nc_utilities.NIL != list_utilities.lengthG(cnc_substate_isa_constraints(state), (SubLObject)candidate_nc_utilities.ZERO_INTEGER, (SubLObject)candidate_nc_utilities.UNPROVIDED) || candidate_nc_utilities.NIL != list_utilities.lengthG(cnc_substate_genls_constraints(state), (SubLObject)candidate_nc_utilities.ZERO_INTEGER, (SubLObject)candidate_nc_utilities.UNPROVIDED) || candidate_nc_utilities.NIL != list_utilities.lengthG(cnc_substate_equals_constraints(state), (SubLObject)candidate_nc_utilities.ZERO_INTEGER, (SubLObject)candidate_nc_utilities.UNPROVIDED)) {
            Errors.warn((SubLObject)candidate_nc_utilities.$str159$Don_t_know_how_to_get__S_pair_fro, head_or_modifier, state);
            return cnc_random_pair_via_query(state, head_or_modifier);
        }
        final SubLObject wu = cnc_substate_wu_constraints(state).first();
        final SubLObject pos = cnc_substate_pos_constraints(state).first();
        SubLObject strings = (SubLObject)candidate_nc_utilities.NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(cnc_substate_mt(state), thread);
            strings = ((candidate_nc_utilities.NIL != pos) ? lexicon_accessors.get_strings_of_type(wu, pos, (SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED) : lexicon_cache.strings_of_word_unit(wu, (SubLObject)candidate_nc_utilities.$list162, (SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED));
        }
        finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)ConsesLow.cons(list_utilities.random_element(strings), (SubLObject)candidate_nc_utilities.$kw163$NO_DENOT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 21237L)
    public static SubLObject cnc_random_pair_from_equals_constraints(final SubLObject state, final SubLObject head_or_modifier) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (candidate_nc_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && candidate_nc_utilities.NIL == list_utilities.lengthLE(cnc_substate_equals_constraints(state), (SubLObject)candidate_nc_utilities.ONE_INTEGER, (SubLObject)candidate_nc_utilities.UNPROVIDED)) {
            Errors.error((SubLObject)candidate_nc_utilities.$str164$More_than_one_equals_constraint__, cnc_substate_equals_constraints(state));
        }
        final SubLObject v_term = cnc_substate_equals_constraints(state).first();
        final SubLObject pos_pred_constraints = cnc_substate_pos_pred_constraints(state);
        final SubLObject pos_constraints = cnc_substate_pos_constraints(state);
        final SubLObject pair = cnc_random_pair_from_match(v_term, pos_pred_constraints, pos_constraints, head_or_modifier);
        if (candidate_nc_utilities.NIL == pair) {
            Errors.warn((SubLObject)candidate_nc_utilities.$str165$Couldn_t_find_string_for__S_match, v_term, pos_pred_constraints, pos_pred_constraints);
            _csetf_cnc_substate_doneP(state, (SubLObject)candidate_nc_utilities.T);
        }
        return pair;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 21954L)
    public static SubLObject get_cnc_substate_cheapest_isaXgenls_constraint(final SubLObject state) {
        SubLObject ans = cnc_substate_plist_lookup(state, (SubLObject)candidate_nc_utilities.$kw166$CHEAPEST_CONSTRAINT, (SubLObject)candidate_nc_utilities.NIL);
        if (candidate_nc_utilities.NIL == ans) {
            ans = cnc_cheapest_isaXgenls_constraint(cnc_substate_isa_constraints(state), cnc_substate_genls_constraints(state));
            cnc_substate_plist_enter(state, (SubLObject)candidate_nc_utilities.$kw166$CHEAPEST_CONSTRAINT, ans);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 22337L)
    public static SubLObject get_cnc_substate_cheapest_isaXgenls_constraint_matches(final SubLObject state) {
        final SubLObject cheapest_constraint = get_cnc_substate_cheapest_isaXgenls_constraint(state);
        final SubLObject constraint_type = cheapest_constraint.first();
        final SubLObject constraint_col = cheapest_constraint.rest();
        SubLObject ans = cnc_substate_plist_lookup(state, (SubLObject)candidate_nc_utilities.$kw167$CHEAPEST_CONSTRAINT_MATCHES, (SubLObject)candidate_nc_utilities.NIL);
        if (candidate_nc_utilities.NIL == ans) {
            final SubLObject mt = cnc_substate_mt(state);
            ans = ((constraint_type == candidate_nc_utilities.$kw16$ISA) ? isa.all_fort_instances(constraint_col, mt, (SubLObject)candidate_nc_utilities.UNPROVIDED) : genls.all_specs(constraint_col, mt, (SubLObject)candidate_nc_utilities.UNPROVIDED));
            note_cnc_substate_cheapest_isaXgenls_constraint_matches(state, ans);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 22937L)
    public static SubLObject note_cnc_substate_cheapest_isaXgenls_constraint_matches(final SubLObject state, final SubLObject matches) {
        cnc_substate_plist_enter(state, (SubLObject)candidate_nc_utilities.$kw167$CHEAPEST_CONSTRAINT_MATCHES, matches);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 23113L)
    public static SubLObject remove_cnc_substate_cheapest_isaXgenls_constraint_match(final SubLObject state, final SubLObject match) {
        final SubLObject matches = cnc_substate_plist_lookup(state, (SubLObject)candidate_nc_utilities.$kw167$CHEAPEST_CONSTRAINT_MATCHES, (SubLObject)candidate_nc_utilities.NIL);
        note_cnc_substate_cheapest_isaXgenls_constraint_matches(state, Sequences.delete(match, matches, Symbols.symbol_function((SubLObject)candidate_nc_utilities.EQUAL), (SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED));
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 23458L)
    public static SubLObject cnc_random_pair_from_isaXgenls_constraints(final SubLObject state, final SubLObject head_or_modifier) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cheapest_constraint = get_cnc_substate_cheapest_isaXgenls_constraint(state);
        SubLObject v_tries;
        SubLObject random_pair;
        for (v_tries = (SubLObject)candidate_nc_utilities.ZERO_INTEGER, random_pair = (SubLObject)candidate_nc_utilities.NIL; !random_pair.isCons() && !v_tries.numGE(candidate_nc_utilities.$cnc_max_tries$.getDynamicValue(thread)); v_tries = Numbers.add(v_tries, (SubLObject)candidate_nc_utilities.ONE_INTEGER)) {
            random_pair = cnc_random_pair_from_isaXgenls_constraints_internal(state, head_or_modifier);
            if (v_tries.numGE((SubLObject)candidate_nc_utilities.TEN_INTEGER) && Numbers.mod(v_tries, (SubLObject)candidate_nc_utilities.FIVE_INTEGER).isZero()) {
                Errors.warn((SubLObject)candidate_nc_utilities.$str168$_S_tries___, v_tries);
            }
        }
        if (!random_pair.isCons()) {
            Errors.warn((SubLObject)candidate_nc_utilities.$str169$Couldn_t_find_a_string_denot_pair, cheapest_constraint, v_tries);
            _csetf_cnc_substate_doneP(state, (SubLObject)candidate_nc_utilities.T);
        }
        return random_pair;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 24140L)
    public static SubLObject cnc_random_pair_from_isaXgenls_constraints_internal(final SubLObject state, final SubLObject head_or_modifier) {
        final SubLObject cheapest_constraint = get_cnc_substate_cheapest_isaXgenls_constraint(state);
        final SubLObject mt = cnc_substate_mt(state);
        final SubLObject matches = get_cnc_substate_cheapest_isaXgenls_constraint_matches(state);
        SubLObject random_pair = (SubLObject)candidate_nc_utilities.NIL;
        if (candidate_nc_utilities.NIL != list_utilities.non_empty_list_p(matches)) {
            final SubLObject v_term = list_utilities.random_element(matches);
            final SubLObject badP = list_utilities.sublisp_boolean(cnc_random_match_constraint_failure(v_term, cheapest_constraint, cnc_substate_genls_constraints(state), cnc_substate_isa_constraints(state), mt));
            if (candidate_nc_utilities.NIL == badP) {
                final SubLObject pos_pred_constraints = cnc_substate_pos_pred_constraints(state);
                final SubLObject pos_constraints = cnc_substate_pos_constraints(state);
                random_pair = cnc_random_pair_from_match(v_term, pos_pred_constraints, pos_constraints, head_or_modifier);
            }
            if (candidate_nc_utilities.NIL == random_pair) {
                remove_cnc_substate_cheapest_isaXgenls_constraint_match(state, v_term);
            }
        }
        return random_pair;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 25115L)
    public static SubLObject cnc_random_match_constraint_failure(final SubLObject v_term, final SubLObject cheapest_constraint, final SubLObject genls_constraints, final SubLObject isa_constraints, final SubLObject mt) {
        SubLObject failed_constraint = (SubLObject)candidate_nc_utilities.NIL;
        final SubLObject constraint_type = cheapest_constraint.first();
        final SubLObject constraint_col = cheapest_constraint.rest();
        if (candidate_nc_utilities.NIL == failed_constraint) {
            SubLObject csome_list_var = genls_constraints;
            SubLObject genls_constraint = (SubLObject)candidate_nc_utilities.NIL;
            genls_constraint = csome_list_var.first();
            while (candidate_nc_utilities.NIL == failed_constraint && candidate_nc_utilities.NIL != csome_list_var) {
                if (constraint_type != candidate_nc_utilities.$kw170$GENLS || !constraint_col.equal(genls_constraint)) {
                    if (candidate_nc_utilities.NIL == genls.genlP(v_term, genls_constraint, mt, (SubLObject)candidate_nc_utilities.UNPROVIDED)) {
                        failed_constraint = genls_constraint;
                    }
                }
                csome_list_var = csome_list_var.rest();
                genls_constraint = csome_list_var.first();
            }
        }
        if (candidate_nc_utilities.NIL == failed_constraint) {
            SubLObject csome_list_var = isa_constraints;
            SubLObject isa_constraint = (SubLObject)candidate_nc_utilities.NIL;
            isa_constraint = csome_list_var.first();
            while (candidate_nc_utilities.NIL == failed_constraint && candidate_nc_utilities.NIL != csome_list_var) {
                if (constraint_type != candidate_nc_utilities.$kw16$ISA || !constraint_col.equal(isa_constraint)) {
                    if (candidate_nc_utilities.NIL == isa.isaP(v_term, isa_constraint, mt, (SubLObject)candidate_nc_utilities.UNPROVIDED)) {
                        failed_constraint = isa_constraint;
                    }
                }
                csome_list_var = csome_list_var.rest();
                isa_constraint = csome_list_var.first();
            }
        }
        return failed_constraint;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 25983L)
    public static SubLObject cnc_random_pair_from_match(final SubLObject v_term, SubLObject pos_pred_constraints, final SubLObject pos_constraints, final SubLObject head_or_modifier) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject random_pair = (SubLObject)candidate_nc_utilities.NIL;
        SubLObject nl_preds = (SubLObject)candidate_nc_utilities.NIL;
        if (candidate_nc_utilities.NIL == forts.fort_p(v_term) || candidate_nc_utilities.NIL == lexification_utilities.unlexifiedP(v_term, (SubLObject)candidate_nc_utilities.NIL)) {
            SubLObject cdolist_list_var = pos_constraints;
            SubLObject pos = (SubLObject)candidate_nc_utilities.NIL;
            pos = cdolist_list_var.first();
            while (candidate_nc_utilities.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$3 = lexicon_accessors.max_preds_of_pos(pos);
                SubLObject pred = (SubLObject)candidate_nc_utilities.NIL;
                pred = cdolist_list_var_$3.first();
                while (candidate_nc_utilities.NIL != cdolist_list_var_$3) {
                    pos_pred_constraints = (SubLObject)ConsesLow.cons(pred, pos_pred_constraints);
                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                    pred = cdolist_list_var_$3.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                pos = cdolist_list_var.first();
            }
            if (candidate_nc_utilities.NIL != pos_pred_constraints) {
                nl_preds = (SubLObject)ConsesLow.list(pph_utilities.pph_unify_speech_part_preds(pos_pred_constraints));
            }
            else if (head_or_modifier == candidate_nc_utilities.$kw46$MODIFIER) {
                nl_preds = (SubLObject)candidate_nc_utilities.$list171;
            }
            else {
                nl_preds = (SubLObject)candidate_nc_utilities.$list172;
            }
            final SubLObject _prev_bind_0 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pph_vars.$select_string_methods_to_omit$.currentBinding(thread);
            final SubLObject _prev_bind_3 = pph_vars.$pph_language_mt$.currentBinding(thread);
            final SubLObject _prev_bind_4 = pph_vars.$allow_pph_language_mt_broadeningP$.currentBinding(thread);
            final SubLObject _prev_bind_5 = pph_vars.$pph_ceteris_paribus_choice_method$.currentBinding(thread);
            try {
                pph_vars.$pph_demerit_cutoff$.bind(candidate_nc_utilities.$cnc_pph_demerit_cutoff$.getDynamicValue(thread), thread);
                pph_vars.$select_string_methods_to_omit$.bind((SubLObject)candidate_nc_utilities.$list173, thread);
                pph_vars.$pph_language_mt$.bind(cnc_paraphrase_mt(), thread);
                pph_vars.$allow_pph_language_mt_broadeningP$.bind((SubLObject)candidate_nc_utilities.NIL, thread);
                pph_vars.$pph_ceteris_paribus_choice_method$.bind((SubLObject)candidate_nc_utilities.$kw174$RANDOM, thread);
                thread.resetMultipleValues();
                final SubLObject string = pph_main.generate_phrase(v_term, nl_preds, (SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED);
                final SubLObject gen_agr_pred = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (candidate_nc_utilities.NIL != cnc_string_okP(string, head_or_modifier) && candidate_nc_utilities.NIL != cnc_agr_pred_okP(gen_agr_pred, nl_preds)) {
                    random_pair = (SubLObject)ConsesLow.cons(string, v_term);
                }
            }
            finally {
                pph_vars.$pph_ceteris_paribus_choice_method$.rebind(_prev_bind_5, thread);
                pph_vars.$allow_pph_language_mt_broadeningP$.rebind(_prev_bind_4, thread);
                pph_vars.$pph_language_mt$.rebind(_prev_bind_3, thread);
                pph_vars.$select_string_methods_to_omit$.rebind(_prev_bind_2, thread);
                pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0, thread);
            }
        }
        return random_pair;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 27101L)
    public static SubLObject cnc_agr_pred_okP(final SubLObject gen_agr_pred, final SubLObject nl_preds) {
        SubLObject okP = (SubLObject)candidate_nc_utilities.NIL;
        if (candidate_nc_utilities.NIL != forts.fort_p(gen_agr_pred) && candidate_nc_utilities.NIL == okP) {
            SubLObject csome_list_var;
            SubLObject nl_pred;
            for (csome_list_var = nl_preds, nl_pred = (SubLObject)candidate_nc_utilities.NIL, nl_pred = csome_list_var.first(); candidate_nc_utilities.NIL == okP && candidate_nc_utilities.NIL != csome_list_var; okP = ((candidate_nc_utilities.NIL != lexicon_accessors.speech_part_predP(gen_agr_pred, (SubLObject)candidate_nc_utilities.UNPROVIDED)) ? lexicon_accessors.genl_pos_predP(gen_agr_pred, nl_pred, (SubLObject)candidate_nc_utilities.UNPROVIDED) : genl_predicates.genl_predicate_in_any_mtP(gen_agr_pred, nl_pred)), csome_list_var = csome_list_var.rest(), nl_pred = csome_list_var.first()) {}
        }
        return okP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 27462L)
    public static SubLObject cnc_string_okP(final SubLObject string_or_nil, final SubLObject head_or_modifier) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(string_or_nil.isString() && candidate_nc_utilities.NIL != list_utilities.lengthL(string_or_nil, candidate_nc_utilities.$cnc_max_string_length$.getDynamicValue(thread), (SubLObject)candidate_nc_utilities.UNPROVIDED) && candidate_nc_utilities.NIL == lexicon_accessors.contains_closed_lexical_class_wordP(string_or_nil) && (head_or_modifier != candidate_nc_utilities.$kw47$HEAD || candidate_nc_utilities.NIL == contains_adjective_only_wordP(string_or_nil)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 27821L)
    public static SubLObject contains_adjective_only_wordP(final SubLObject string) {
        SubLObject foundP = (SubLObject)candidate_nc_utilities.NIL;
        if (candidate_nc_utilities.NIL == foundP) {
            SubLObject csome_list_var = string_utilities.string_tokenize(string, (SubLObject)candidate_nc_utilities.$list177, (SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED);
            SubLObject word = (SubLObject)candidate_nc_utilities.NIL;
            word = csome_list_var.first();
            while (candidate_nc_utilities.NIL == foundP && candidate_nc_utilities.NIL != csome_list_var) {
                SubLObject non_adjectiveP = (SubLObject)candidate_nc_utilities.NIL;
                final SubLObject poses = lexicon_accessors.pos_of_string(word, (SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED);
                if (candidate_nc_utilities.NIL == non_adjectiveP) {
                    SubLObject csome_list_var_$4 = poses;
                    SubLObject pos = (SubLObject)candidate_nc_utilities.NIL;
                    pos = csome_list_var_$4.first();
                    while (candidate_nc_utilities.NIL == non_adjectiveP && candidate_nc_utilities.NIL != csome_list_var_$4) {
                        if (candidate_nc_utilities.NIL == lexicon_accessors.genl_posP(pos, candidate_nc_utilities.$const176$Adjective, (SubLObject)candidate_nc_utilities.UNPROVIDED)) {
                            non_adjectiveP = (SubLObject)candidate_nc_utilities.T;
                        }
                        csome_list_var_$4 = csome_list_var_$4.rest();
                        pos = csome_list_var_$4.first();
                    }
                }
                if (candidate_nc_utilities.NIL == non_adjectiveP && candidate_nc_utilities.NIL == list_utilities.empty_list_p(poses)) {
                    foundP = (SubLObject)candidate_nc_utilities.T;
                }
                csome_list_var = csome_list_var.rest();
                word = csome_list_var.first();
            }
        }
        return foundP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 28228L)
    public static SubLObject cnc_cheapest_isaXgenls_constraint(final SubLObject isa_constraints, final SubLObject genls_constraints) {
        SubLObject cheapest_constraint = (SubLObject)candidate_nc_utilities.NIL;
        SubLObject cheapest_constraint_cardinality_estimate = (SubLObject)candidate_nc_utilities.NIL;
        SubLObject cdolist_list_var = isa_constraints;
        SubLObject isa_constraint = (SubLObject)candidate_nc_utilities.NIL;
        isa_constraint = cdolist_list_var.first();
        while (candidate_nc_utilities.NIL != cdolist_list_var) {
            if (candidate_nc_utilities.NIL == cheapest_constraint) {
                cheapest_constraint = (SubLObject)ConsesLow.cons((SubLObject)candidate_nc_utilities.$kw16$ISA, isa_constraint);
            }
            else {
                if (candidate_nc_utilities.NIL == cheapest_constraint_cardinality_estimate) {
                    cheapest_constraint_cardinality_estimate = cardinality_estimates.instance_cardinality(cheapest_constraint.rest());
                }
                final SubLObject cardinality_estimate = cardinality_estimates.instance_cardinality(isa_constraint);
                if (candidate_nc_utilities.NIL == cheapest_constraint_cardinality_estimate || cardinality_estimate.numL(cheapest_constraint_cardinality_estimate)) {
                    cheapest_constraint = (SubLObject)ConsesLow.cons((SubLObject)candidate_nc_utilities.$kw16$ISA, isa_constraint);
                    cheapest_constraint_cardinality_estimate = cardinality_estimate;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            isa_constraint = cdolist_list_var.first();
        }
        cdolist_list_var = genls_constraints;
        SubLObject genls_constraint = (SubLObject)candidate_nc_utilities.NIL;
        genls_constraint = cdolist_list_var.first();
        while (candidate_nc_utilities.NIL != cdolist_list_var) {
            if (candidate_nc_utilities.NIL == cheapest_constraint) {
                cheapest_constraint = (SubLObject)ConsesLow.cons((SubLObject)candidate_nc_utilities.$kw170$GENLS, genls_constraint);
            }
            else {
                if (candidate_nc_utilities.NIL == cheapest_constraint_cardinality_estimate) {
                    cheapest_constraint_cardinality_estimate = ((cheapest_constraint.first() == candidate_nc_utilities.$kw16$ISA) ? cardinality_estimates.instance_cardinality(cheapest_constraint.rest()) : cardinality_estimates.spec_cardinality(cheapest_constraint.rest()));
                }
                final SubLObject cardinality_estimate = cardinality_estimates.spec_cardinality(genls_constraint);
                if (candidate_nc_utilities.NIL == cheapest_constraint_cardinality_estimate || cardinality_estimate.numL(cheapest_constraint_cardinality_estimate)) {
                    cheapest_constraint = (SubLObject)ConsesLow.cons((SubLObject)candidate_nc_utilities.$kw170$GENLS, genls_constraint);
                    cheapest_constraint_cardinality_estimate = cardinality_estimate;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            genls_constraint = cdolist_list_var.first();
        }
        return cheapest_constraint;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 29931L)
    public static SubLObject generate_and_eval_cnc_test_for_rule(final SubLObject rule_cycl, SubLObject engine, SubLObject number, SubLObject mt, SubLObject rule_fht_name, SubLObject string_fht_name) {
        if (engine == candidate_nc_utilities.UNPROVIDED) {
            engine = candidate_nc_utilities.$cnc_default_search_engine$.getDynamicValue();
        }
        if (number == candidate_nc_utilities.UNPROVIDED) {
            number = candidate_nc_utilities.$cnc_test_size$.getDynamicValue();
        }
        if (mt == candidate_nc_utilities.UNPROVIDED) {
            mt = candidate_nc_utilities.$cnc_query_mt$.getDynamicValue();
        }
        if (rule_fht_name == candidate_nc_utilities.UNPROVIDED) {
            rule_fht_name = candidate_nc_utilities.$scored_ncr_table$.getDynamicValue();
        }
        if (string_fht_name == candidate_nc_utilities.UNPROVIDED) {
            string_fht_name = candidate_nc_utilities.$cnc_string_hits_table$.getDynamicValue();
        }
        final SubLObject candidates = generate_cnc_test_strings(rule_cycl, number, mt, (SubLObject)candidate_nc_utilities.UNPROVIDED);
        final SubLObject time = Time.get_universal_time();
        final SubLObject cnc_test = (SubLObject)ConsesLow.list(time, candidates);
        return score_and_store_cnc_test_data_for_ncr(rule_cycl, cnc_test, engine, rule_fht_name, string_fht_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 30490L)
    public static SubLObject test_untested_ncr_rules(final SubLObject number, final SubLObject size) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rules_to_score;
        SubLObject rule;
        for (rules_to_score = (SubLObject)candidate_nc_utilities.NIL; !Sequences.length(rules_to_score).numGE(number); rules_to_score = (SubLObject)ConsesLow.cons(rule, rules_to_score)) {
            rule = cycl_utilities.hl_to_el(isa.random_instantiation(candidate_nc_utilities.$const178$NounCompoundRule, (SubLObject)candidate_nc_utilities.UNPROVIDED));
            if (candidate_nc_utilities.NIL == cnc_get_from_fht((SubLObject)ConsesLow.list(rule, (SubLObject)candidate_nc_utilities.$kw4$YAHOO), candidate_nc_utilities.$scored_ncr_table$.getDynamicValue(thread))) {}
        }
        Errors.warn((SubLObject)candidate_nc_utilities.$str179$_S__, rules_to_score);
        SubLObject cdolist_list_var = rules_to_score;
        SubLObject rule2 = (SubLObject)candidate_nc_utilities.NIL;
        rule2 = cdolist_list_var.first();
        while (candidate_nc_utilities.NIL != cdolist_list_var) {
            generate_and_eval_cnc_test_for_rule(cycl_utilities.hl_to_el(rule2), (SubLObject)candidate_nc_utilities.$kw4$YAHOO, size, (SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            rule2 = cdolist_list_var.first();
        }
        return rules_to_score;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 31012L)
    public static SubLObject test_untested_ncrs_w_running_query_limit(final SubLObject query_limit, final SubLObject test_size) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rules_scored = (SubLObject)candidate_nc_utilities.NIL;
        while (!candidate_nc_utilities.$cnc_running_query_total$.getDynamicValue(thread).numGE(query_limit)) {
            final SubLObject rule = cycl_utilities.hl_to_el(isa.random_instantiation(candidate_nc_utilities.$const178$NounCompoundRule, (SubLObject)candidate_nc_utilities.UNPROVIDED));
            if (candidate_nc_utilities.NIL == cnc_get_from_fht((SubLObject)ConsesLow.list(rule, (SubLObject)candidate_nc_utilities.$kw4$YAHOO), candidate_nc_utilities.$scored_ncr_table$.getDynamicValue(thread))) {
                Errors.warn((SubLObject)candidate_nc_utilities.$str180$Started_scoring__S_at__S_____, rule, numeric_date_utilities.timestamp((SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED));
                generate_and_eval_cnc_test_for_rule(rule, (SubLObject)candidate_nc_utilities.$kw4$YAHOO, test_size, (SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED);
                rules_scored = (SubLObject)ConsesLow.cons(rule, rules_scored);
            }
        }
        return rules_scored;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 31495L)
    public static SubLObject generate_and_store_cnc_tests_for_untested_rules(final SubLObject number) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rules_to_score;
        SubLObject rule;
        for (rules_to_score = (SubLObject)candidate_nc_utilities.NIL; !Sequences.length(rules_to_score).numGE(number); rules_to_score = (SubLObject)ConsesLow.cons(rule, rules_to_score)) {
            rule = cycl_utilities.hl_to_el(isa.random_instantiation(candidate_nc_utilities.$const178$NounCompoundRule, (SubLObject)candidate_nc_utilities.UNPROVIDED));
            if (candidate_nc_utilities.NIL == cnc_get_from_fht(rule, candidate_nc_utilities.$unscored_ncr_table$.getDynamicValue(thread))) {}
        }
        SubLObject cdolist_list_var = rules_to_score;
        SubLObject rule2 = (SubLObject)candidate_nc_utilities.NIL;
        rule2 = cdolist_list_var.first();
        while (candidate_nc_utilities.NIL != cdolist_list_var) {
            generate_and_store_cnc_test_for_rule(rule2, (SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            rule2 = cdolist_list_var.first();
        }
        return rules_to_score;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 31962L)
    public static SubLObject generate_and_store_cnc_test_for_rule(final SubLObject rule_cycl, SubLObject number, SubLObject mt, SubLObject fht_name) {
        if (number == candidate_nc_utilities.UNPROVIDED) {
            number = candidate_nc_utilities.$cnc_test_size$.getDynamicValue();
        }
        if (mt == candidate_nc_utilities.UNPROVIDED) {
            mt = candidate_nc_utilities.$cnc_query_mt$.getDynamicValue();
        }
        if (fht_name == candidate_nc_utilities.UNPROVIDED) {
            fht_name = candidate_nc_utilities.$unscored_ncr_table$.getDynamicValue();
        }
        final SubLObject old_store = cnc_get_from_fht(rule_cycl, fht_name);
        final SubLObject new_candidates = generate_cnc_test_strings(rule_cycl, number, mt, (SubLObject)candidate_nc_utilities.UNPROVIDED);
        final SubLObject time = Time.get_universal_time();
        final SubLObject new_cnc_test = (SubLObject)ConsesLow.list(time, new_candidates);
        final SubLObject new_stored_value = (SubLObject)ConsesLow.list((SubLObject)candidate_nc_utilities.$kw181$TEST, new_cnc_test, (SubLObject)candidate_nc_utilities.$kw182$RUN_AGAINST);
        final SubLObject new_store = (SubLObject)ConsesLow.cons(new_stored_value, old_store);
        cnc_put_to_fht(rule_cycl, fht_name, new_store);
        return new_store;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 32530L)
    public static SubLObject batch_process_unfamiliar_strings(final SubLObject size, final SubLObject mp_pairs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject unfamiliar_strings = find_unfamiliar_strings_from_unscored_cnc_tests((SubLObject)candidate_nc_utilities.$kw4$YAHOO, (SubLObject)candidate_nc_utilities.UNPROVIDED);
        final SubLObject batch_count = Sequences.length(mp_pairs);
        SubLObject relevant_strings = list_utilities.first_n(Numbers.multiply(size, batch_count), unfamiliar_strings);
        SubLObject cdolist_list_var = mp_pairs;
        SubLObject pair = (SubLObject)candidate_nc_utilities.NIL;
        pair = cdolist_list_var.first();
        while (candidate_nc_utilities.NIL != cdolist_list_var) {
            final SubLObject batch = list_utilities.first_n(size, relevant_strings);
            final SubLObject machine = pair.first();
            final SubLObject port = conses_high.second(pair);
            SubLObject ignore_errors_tag = (SubLObject)candidate_nc_utilities.NIL;
            try {
                thread.throwStack.push(candidate_nc_utilities.$kw183$IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)candidate_nc_utilities.$sym184$IGNORE_ERRORS_HANDLER), thread);
                    try {
                        SubLObject cdolist_list_var_$5 = batch;
                        SubLObject string = (SubLObject)candidate_nc_utilities.NIL;
                        string = cdolist_list_var_$5.first();
                        while (candidate_nc_utilities.NIL != cdolist_list_var_$5) {
                            final SubLObject hit_count = api_kernel.cyc_api_remote_eval((SubLObject)ConsesLow.list((SubLObject)candidate_nc_utilities.$sym185$YAHOO_COUNT, string_utilities.quote_string(string, (SubLObject)candidate_nc_utilities.UNPROVIDED)), machine, port, (SubLObject)candidate_nc_utilities.UNPROVIDED);
                            if (hit_count.isNumber()) {
                                relevant_strings = Sequences.remove(string, relevant_strings, (SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED);
                                candidate_nc_utilities.$cnc_running_query_total$.setDynamicValue(Numbers.add(candidate_nc_utilities.$cnc_running_query_total$.getDynamicValue(thread), (SubLObject)candidate_nc_utilities.ONE_INTEGER), thread);
                                cnc_put_to_fht((SubLObject)ConsesLow.list(string, (SubLObject)candidate_nc_utilities.$kw4$YAHOO), candidate_nc_utilities.$cnc_string_hits_table$.getDynamicValue(thread), (SubLObject)ConsesLow.list((SubLObject)candidate_nc_utilities.$kw186$HIT_COUNT, hit_count, (SubLObject)candidate_nc_utilities.$kw187$TIMESTAMP, numeric_date_utilities.timestamp((SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED)));
                            }
                            cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                            string = cdolist_list_var_$5.first();
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)candidate_nc_utilities.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)candidate_nc_utilities.$kw183$IGNORE_ERRORS_TARGET);
            }
            finally {
                thread.throwStack.pop();
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        }
        return Sequences.length(unfamiliar_strings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 33392L)
    public static SubLObject lookup_and_store_scores_for_unscored_cnc_tests(final SubLObject engine) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject update_pairs = (SubLObject)candidate_nc_utilities.NIL;
        SubLObject fht = (SubLObject)candidate_nc_utilities.NIL;
        try {
            fht = file_hash_table.open_file_hash_table_read_only(candidate_nc_utilities.$unscored_ncr_table$.getDynamicValue(thread), (SubLObject)candidate_nc_utilities.EQUAL, (SubLObject)candidate_nc_utilities.$kw188$IMAGE_INDEPENDENT_CFASL);
            SubLObject continuation = (SubLObject)candidate_nc_utilities.NIL;
            SubLObject next;
            for (SubLObject completeP = (SubLObject)candidate_nc_utilities.NIL; candidate_nc_utilities.NIL == completeP; completeP = Types.sublisp_null(next)) {
                thread.resetMultipleValues();
                final SubLObject the_key = file_hash_table.get_file_hash_table_any(fht, continuation, (SubLObject)candidate_nc_utilities.NIL);
                final SubLObject the_value = thread.secondMultipleValue();
                next = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (candidate_nc_utilities.NIL != next) {
                    final SubLObject rule = the_key;
                    final SubLObject stored_tests = the_value;
                    SubLObject new_stored_tests = (SubLObject)candidate_nc_utilities.NIL;
                    SubLObject cdolist_list_var = stored_tests;
                    SubLObject stored_test = (SubLObject)candidate_nc_utilities.NIL;
                    stored_test = cdolist_list_var.first();
                    while (candidate_nc_utilities.NIL != cdolist_list_var) {
                        final SubLObject test_data = conses_high.second(conses_high.getf(stored_test, (SubLObject)candidate_nc_utilities.$kw181$TEST, (SubLObject)candidate_nc_utilities.UNPROVIDED));
                        final SubLObject test_date = conses_high.getf(stored_test, (SubLObject)candidate_nc_utilities.$kw181$TEST, (SubLObject)candidate_nc_utilities.UNPROVIDED).first();
                        final SubLObject run_against = conses_high.getf(stored_test, (SubLObject)candidate_nc_utilities.$kw182$RUN_AGAINST, (SubLObject)candidate_nc_utilities.UNPROVIDED);
                        SubLObject scored_data = (SubLObject)candidate_nc_utilities.NIL;
                        if (candidate_nc_utilities.NIL == subl_promotions.memberP(engine, run_against, (SubLObject)candidate_nc_utilities.EQUAL, (SubLObject)candidate_nc_utilities.$sym189$CNC_GET_ENGINE)) {
                            scored_data = score_cnc_test_data(test_data, engine, (SubLObject)candidate_nc_utilities.UNPROVIDED);
                            stored_test = (SubLObject)ConsesLow.list((SubLObject)candidate_nc_utilities.$kw181$TEST, (SubLObject)ConsesLow.list(test_date, test_data), (SubLObject)candidate_nc_utilities.$kw182$RUN_AGAINST, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)candidate_nc_utilities.$kw190$ENGINE, (SubLObject)candidate_nc_utilities.$kw4$YAHOO, (SubLObject)candidate_nc_utilities.$kw187$TIMESTAMP, numeric_date_utilities.timestamp((SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED))));
                            update_scored_ncr_table(rule, engine, scored_data, test_date);
                        }
                        new_stored_tests = (SubLObject)ConsesLow.cons(stored_test, new_stored_tests);
                        cdolist_list_var = cdolist_list_var.rest();
                        stored_test = cdolist_list_var.first();
                    }
                    update_pairs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(rule, new_stored_tests), update_pairs);
                }
                continuation = next;
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)candidate_nc_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (candidate_nc_utilities.NIL != file_hash_table.file_hash_table_p(fht)) {
                    file_hash_table.finalize_file_hash_table(fht);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        update_unscored_ncr_table(update_pairs);
        return (SubLObject)candidate_nc_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 34393L)
    public static SubLObject update_unscored_ncr_table(final SubLObject update_pairs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = update_pairs;
        SubLObject pair = (SubLObject)candidate_nc_utilities.NIL;
        pair = cdolist_list_var.first();
        while (candidate_nc_utilities.NIL != cdolist_list_var) {
            cnc_put_to_fht(pair.first(), candidate_nc_utilities.$unscored_ncr_table$.getDynamicValue(thread), conses_high.second(pair));
            Errors.sublisp_break((SubLObject)candidate_nc_utilities.UNPROVIDED, candidate_nc_utilities.EMPTY_SUBL_OBJECT_ARRAY);
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        }
        return (SubLObject)candidate_nc_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 34575L)
    public static SubLObject update_scored_ncr_table(final SubLObject rule, final SubLObject engine, final SubLObject scored_data, final SubLObject test_date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject key = (SubLObject)ConsesLow.list(rule, engine);
        final SubLObject new_test = (SubLObject)ConsesLow.list(test_date, scored_data);
        final SubLObject stored_tests = cnc_get_from_fht(key, candidate_nc_utilities.$scored_ncr_table$.getDynamicValue(thread));
        final SubLObject new_value = (SubLObject)ConsesLow.cons(new_test, stored_tests);
        cnc_put_to_fht(key, candidate_nc_utilities.$scored_ncr_table$.getDynamicValue(thread), new_value);
        return (SubLObject)candidate_nc_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 34897L)
    public static SubLObject find_unfamiliar_strings_from_unscored_cnc_tests(final SubLObject engine, SubLObject string_table) {
        if (string_table == candidate_nc_utilities.UNPROVIDED) {
            string_table = candidate_nc_utilities.$cnc_string_hits_table$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_list = (SubLObject)candidate_nc_utilities.NIL;
        SubLObject fht = (SubLObject)candidate_nc_utilities.NIL;
        try {
            fht = file_hash_table.open_file_hash_table_read_only(candidate_nc_utilities.$unscored_ncr_table$.getDynamicValue(thread), (SubLObject)candidate_nc_utilities.EQUAL, (SubLObject)candidate_nc_utilities.$kw188$IMAGE_INDEPENDENT_CFASL);
            SubLObject continuation = (SubLObject)candidate_nc_utilities.NIL;
            SubLObject next;
            for (SubLObject completeP = (SubLObject)candidate_nc_utilities.NIL; candidate_nc_utilities.NIL == completeP; completeP = Types.sublisp_null(next)) {
                thread.resetMultipleValues();
                final SubLObject the_key = file_hash_table.get_file_hash_table_any(fht, continuation, (SubLObject)candidate_nc_utilities.NIL);
                final SubLObject the_value = thread.secondMultipleValue();
                next = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (candidate_nc_utilities.NIL != next) {
                    final SubLObject key = the_key;
                    SubLObject cdolist_list_var;
                    final SubLObject value = cdolist_list_var = the_value;
                    SubLObject stored_test = (SubLObject)candidate_nc_utilities.NIL;
                    stored_test = cdolist_list_var.first();
                    while (candidate_nc_utilities.NIL != cdolist_list_var) {
                        final SubLObject test_data = conses_high.second(conses_high.getf(stored_test, (SubLObject)candidate_nc_utilities.$kw181$TEST, (SubLObject)candidate_nc_utilities.UNPROVIDED));
                        final SubLObject run_against = conses_high.getf(stored_test, (SubLObject)candidate_nc_utilities.$kw182$RUN_AGAINST, (SubLObject)candidate_nc_utilities.UNPROVIDED);
                        if (candidate_nc_utilities.NIL == subl_promotions.memberP(engine, run_against, (SubLObject)candidate_nc_utilities.EQUAL, (SubLObject)candidate_nc_utilities.$sym189$CNC_GET_ENGINE)) {
                            final SubLObject unfamiliar_strings = get_unfamiliar_strings_from_cnc_data(test_data, engine, string_table);
                            result_list = ConsesLow.append(unfamiliar_strings, result_list);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        stored_test = cdolist_list_var.first();
                    }
                }
                continuation = next;
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)candidate_nc_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (candidate_nc_utilities.NIL != file_hash_table.file_hash_table_p(fht)) {
                    file_hash_table.finalize_file_hash_table(fht);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return Values.values(result_list, engine);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 35655L)
    public static SubLObject cnc_get_engine(final SubLObject p_list) {
        return conses_high.getf(p_list, (SubLObject)candidate_nc_utilities.$kw190$ENGINE, (SubLObject)candidate_nc_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 35848L)
    public static SubLObject score_and_store_cnc_test_data_for_ncr(final SubLObject rule_cycl, final SubLObject unscored_cnc_test, SubLObject engine, SubLObject rule_fht_name, SubLObject string_fht_name) {
        if (engine == candidate_nc_utilities.UNPROVIDED) {
            engine = candidate_nc_utilities.$cnc_default_search_engine$.getDynamicValue();
        }
        if (rule_fht_name == candidate_nc_utilities.UNPROVIDED) {
            rule_fht_name = candidate_nc_utilities.$scored_ncr_table$.getDynamicValue();
        }
        if (string_fht_name == candidate_nc_utilities.UNPROVIDED) {
            string_fht_name = candidate_nc_utilities.$cnc_string_hits_table$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject key = (SubLObject)((candidate_nc_utilities.NIL != candidate_nc_utilities.$store_w_method_test_keyP$.getDynamicValue(thread)) ? ConsesLow.list(rule_cycl, candidate_nc_utilities.$cnc_method_test_keyword$.getDynamicValue(thread)) : ConsesLow.list(rule_cycl, engine));
        final SubLObject old_store = cnc_get_from_fht(key, rule_fht_name);
        final SubLObject date = unscored_cnc_test.first();
        final SubLObject unscored_data = conses_high.second(unscored_cnc_test);
        final SubLObject scored_data = score_unscored_cnc_data(unscored_data, engine, string_fht_name);
        final SubLObject scored_cnc_test = (SubLObject)ConsesLow.list(date, scored_data);
        final SubLObject new_store = (SubLObject)ConsesLow.cons(scored_cnc_test, old_store);
        cnc_put_to_fht(key, rule_fht_name, new_store);
        return new_store;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 36728L)
    public static SubLObject score_unscored_cnc_data(final SubLObject cnc_data, SubLObject engine, SubLObject fht_name) {
        if (engine == candidate_nc_utilities.UNPROVIDED) {
            engine = candidate_nc_utilities.$cnc_default_search_engine$.getDynamicValue();
        }
        if (fht_name == candidate_nc_utilities.UNPROVIDED) {
            fht_name = candidate_nc_utilities.$cnc_string_hits_table$.getDynamicValue();
        }
        SubLObject scored_results = (SubLObject)candidate_nc_utilities.NIL;
        SubLObject cdolist_list_var = cnc_data;
        SubLObject tuple = (SubLObject)candidate_nc_utilities.NIL;
        tuple = cdolist_list_var.first();
        while (candidate_nc_utilities.NIL != cdolist_list_var) {
            final SubLObject new_tuple = score_cnc_test_tuple(tuple, engine, fht_name);
            scored_results = (SubLObject)ConsesLow.cons(new_tuple, scored_results);
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        }
        return scored_results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 37055L)
    public static SubLObject score_unscored_cnc_data2(final SubLObject cnc_data, SubLObject engine, SubLObject fht_name) {
        if (engine == candidate_nc_utilities.UNPROVIDED) {
            engine = candidate_nc_utilities.$cnc_default_search_engine$.getDynamicValue();
        }
        if (fht_name == candidate_nc_utilities.UNPROVIDED) {
            fht_name = candidate_nc_utilities.$cnc_string_hits_table$.getDynamicValue();
        }
        final SubLObject unfamiliar_strings = get_unfamiliar_strings_from_cnc_data(cnc_data, engine, fht_name);
        SubLObject scored_results = (SubLObject)candidate_nc_utilities.NIL;
        cnc_query_and_store_search_string_hits(unfamiliar_strings, engine, fht_name);
        scored_results = score_cnc_test_data(cnc_data, engine, fht_name);
        return scored_results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 37529L)
    public static SubLObject cnc_query_and_store_search_string_hits(final SubLObject unfamiliar_strings, final SubLObject engine, final SubLObject fht_name) {
        SubLObject cdolist_list_var;
        final SubLObject string_hit_pairs = cdolist_list_var = cnc_get_string_hit_pairs(unfamiliar_strings, engine);
        SubLObject pair = (SubLObject)candidate_nc_utilities.NIL;
        pair = cdolist_list_var.first();
        while (candidate_nc_utilities.NIL != cdolist_list_var) {
            final SubLObject string = pair.first();
            final SubLObject hit_count = conses_high.second(pair);
            final SubLObject key = (SubLObject)ConsesLow.list(string, engine);
            final SubLObject value = (SubLObject)ConsesLow.list((SubLObject)candidate_nc_utilities.$kw186$HIT_COUNT, hit_count, (SubLObject)candidate_nc_utilities.$kw187$TIMESTAMP, numeric_date_utilities.timestamp((SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED));
            cnc_put_to_fht(key, fht_name, value);
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        }
        return string_hit_pairs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 38100L)
    public static SubLObject cnc_get_string_hit_pairs(final SubLObject unfamiliar_strings, final SubLObject engine) {
        SubLObject result_pairs = (SubLObject)candidate_nc_utilities.NIL;
        SubLObject cdolist_list_var = unfamiliar_strings;
        SubLObject string = (SubLObject)candidate_nc_utilities.NIL;
        string = cdolist_list_var.first();
        while (candidate_nc_utilities.NIL != cdolist_list_var) {
            final SubLObject hit_count = cnc_query_for_search_string_hits(Strings.string(engine), (SubLObject)candidate_nc_utilities.UNPROVIDED);
            result_pairs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(string, hit_count), result_pairs);
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        }
        return result_pairs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 38393L)
    public static SubLObject score_cnc_test_data(final SubLObject cnc_data, SubLObject engine, SubLObject fht_name) {
        if (engine == candidate_nc_utilities.UNPROVIDED) {
            engine = candidate_nc_utilities.$cnc_default_search_engine$.getDynamicValue();
        }
        if (fht_name == candidate_nc_utilities.UNPROVIDED) {
            fht_name = candidate_nc_utilities.$cnc_string_hits_table$.getDynamicValue();
        }
        SubLObject scored_data = (SubLObject)candidate_nc_utilities.NIL;
        SubLObject cdolist_list_var = cnc_data;
        SubLObject tuple = (SubLObject)candidate_nc_utilities.NIL;
        tuple = cdolist_list_var.first();
        while (candidate_nc_utilities.NIL != cdolist_list_var) {
            final SubLObject new_tuple = score_cnc_test_tuple2(tuple, engine, fht_name);
            if (candidate_nc_utilities.NIL != new_tuple) {
                scored_data = (SubLObject)ConsesLow.cons(new_tuple, scored_data);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        }
        return scored_data;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 38729L)
    public static SubLObject get_unfamiliar_strings_from_cnc_data(final SubLObject cnc_data, SubLObject engine, SubLObject fht_name) {
        if (engine == candidate_nc_utilities.UNPROVIDED) {
            engine = candidate_nc_utilities.$cnc_default_search_engine$.getDynamicValue();
        }
        if (fht_name == candidate_nc_utilities.UNPROVIDED) {
            fht_name = candidate_nc_utilities.$cnc_string_hits_table$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject search_strings = (SubLObject)candidate_nc_utilities.NIL;
        final SubLObject _prev_bind_0 = candidate_nc_utilities.$cnc_default_search_engine$.currentBinding(thread);
        final SubLObject _prev_bind_2 = candidate_nc_utilities.$cnc_string_hits_table$.currentBinding(thread);
        try {
            candidate_nc_utilities.$cnc_default_search_engine$.bind(engine, thread);
            candidate_nc_utilities.$cnc_string_hits_table$.bind(fht_name, thread);
            SubLObject cdolist_list_var = cnc_data;
            SubLObject tuple = (SubLObject)candidate_nc_utilities.NIL;
            tuple = cdolist_list_var.first();
            while (candidate_nc_utilities.NIL != cdolist_list_var) {
                search_strings = (SubLObject)ConsesLow.cons(tuple.first(), (SubLObject)ConsesLow.cons(conses_high.second(tuple), (SubLObject)ConsesLow.cons(conses_high.third(tuple), search_strings)));
                cdolist_list_var = cdolist_list_var.rest();
                tuple = cdolist_list_var.first();
            }
        }
        finally {
            candidate_nc_utilities.$cnc_string_hits_table$.rebind(_prev_bind_2, thread);
            candidate_nc_utilities.$cnc_default_search_engine$.rebind(_prev_bind_0, thread);
        }
        return Sequences.remove_if((SubLObject)candidate_nc_utilities.$sym192$STRING_HITS_KNOWN_, Sequences.remove_duplicates(search_strings, (SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED), (SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 39229L)
    public static SubLObject string_hits_knownP(final SubLObject search_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject engine = candidate_nc_utilities.$cnc_default_search_engine$.getDynamicValue(thread);
        final SubLObject key = (SubLObject)ConsesLow.list(search_string, engine);
        final SubLObject hits = conses_high.getf(cnc_get_from_fht(key, candidate_nc_utilities.$cnc_string_hits_table$.getDynamicValue(thread)), (SubLObject)candidate_nc_utilities.$kw186$HIT_COUNT, (SubLObject)candidate_nc_utilities.UNPROVIDED);
        return (SubLObject)(hits.isNumber() ? candidate_nc_utilities.T : candidate_nc_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 39477L)
    public static SubLObject score_cnc_test_tuple(final SubLObject tuple, SubLObject engine, SubLObject fht_name) {
        if (engine == candidate_nc_utilities.UNPROVIDED) {
            engine = candidate_nc_utilities.$cnc_default_search_engine$.getDynamicValue();
        }
        if (fht_name == candidate_nc_utilities.UNPROVIDED) {
            fht_name = candidate_nc_utilities.$cnc_string_hits_table$.getDynamicValue();
        }
        final SubLObject compound_string = tuple.first();
        final SubLObject modifier_string = conses_high.second(tuple);
        final SubLObject head_string = conses_high.third(tuple);
        SubLObject compound_hits = (SubLObject)candidate_nc_utilities.NIL;
        SubLObject modifier_hits = (SubLObject)candidate_nc_utilities.NIL;
        SubLObject head_hits = (SubLObject)candidate_nc_utilities.NIL;
        SubLObject new_tuple = (SubLObject)candidate_nc_utilities.NIL;
        if (candidate_nc_utilities.NIL != string_utilities.non_empty_string_p(compound_string) && candidate_nc_utilities.NIL != string_utilities.non_empty_string_p(modifier_string) && candidate_nc_utilities.NIL != string_utilities.non_empty_string_p(head_string)) {
            modifier_hits = cnc_find_search_string_hits(modifier_string, engine, fht_name);
            head_hits = cnc_find_search_string_hits(head_string, engine, fht_name);
            if (candidate_nc_utilities.ZERO_INTEGER.equal(modifier_hits) || candidate_nc_utilities.ZERO_INTEGER.equal(head_hits)) {
                compound_hits = (SubLObject)candidate_nc_utilities.ZERO_INTEGER;
            }
            else {
                compound_hits = cnc_find_search_string_hits(compound_string, engine, fht_name);
            }
        }
        new_tuple = list_utilities.adjoin_to_end((SubLObject)ConsesLow.list(compound_hits, modifier_hits, head_hits), tuple, (SubLObject)candidate_nc_utilities.UNPROVIDED);
        return new_tuple;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 40401L)
    public static SubLObject score_cnc_test_tuple2(final SubLObject tuple, SubLObject engine, SubLObject fht_name) {
        if (engine == candidate_nc_utilities.UNPROVIDED) {
            engine = candidate_nc_utilities.$cnc_default_search_engine$.getDynamicValue();
        }
        if (fht_name == candidate_nc_utilities.UNPROVIDED) {
            fht_name = candidate_nc_utilities.$cnc_string_hits_table$.getDynamicValue();
        }
        final SubLObject compound_string = tuple.first();
        final SubLObject modifier_string = conses_high.second(tuple);
        final SubLObject head_string = conses_high.third(tuple);
        final SubLObject compound_hits = cnc_lookup_search_string_hits(compound_string, fht_name, engine);
        final SubLObject modifier_hits = cnc_lookup_search_string_hits(modifier_string, fht_name, engine);
        final SubLObject head_hits = cnc_lookup_search_string_hits(head_string, fht_name, engine);
        SubLObject new_tuple = (SubLObject)candidate_nc_utilities.NIL;
        if (compound_hits.isNumber() && modifier_hits.isNumber() && head_hits.isNumber()) {
            new_tuple = list_utilities.adjoin_to_end((SubLObject)ConsesLow.list(compound_hits, modifier_hits, head_hits), tuple, (SubLObject)candidate_nc_utilities.UNPROVIDED);
        }
        return new_tuple;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 41236L)
    public static SubLObject initialize_running_query_counter(SubLObject backup_tablesP) {
        if (backup_tablesP == candidate_nc_utilities.UNPROVIDED) {
            backup_tablesP = (SubLObject)candidate_nc_utilities.NIL;
        }
        candidate_nc_utilities.$cnc_running_query_total$.setDynamicValue((SubLObject)candidate_nc_utilities.ZERO_INTEGER);
        if (candidate_nc_utilities.NIL != backup_tablesP) {
            backup_cnc_tables();
        }
        return (SubLObject)candidate_nc_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 41445L)
    public static SubLObject cnc_lookup_search_string_hits(final SubLObject string, final SubLObject fht_name, SubLObject engine) {
        if (engine == candidate_nc_utilities.UNPROVIDED) {
            engine = candidate_nc_utilities.$cnc_default_search_engine$.getDynamicValue();
        }
        final SubLObject key = (SubLObject)ConsesLow.list(string, engine);
        final SubLObject hits = conses_high.getf(cnc_get_from_fht(key, fht_name), (SubLObject)candidate_nc_utilities.$kw186$HIT_COUNT, (SubLObject)candidate_nc_utilities.UNPROVIDED);
        return hits;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 41675L)
    public static SubLObject cnc_query_for_search_string_hits(final SubLObject string, SubLObject engine) {
        if (engine == candidate_nc_utilities.UNPROVIDED) {
            engine = candidate_nc_utilities.$cnc_default_search_engine$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hit_count = (SubLObject)candidate_nc_utilities.NIL;
        final SubLObject max_attempts = candidate_nc_utilities.$cnc_max_string_search_attempts$.getDynamicValue(thread);
        SubLObject attempt_count = (SubLObject)candidate_nc_utilities.ZERO_INTEGER;
        SubLObject search_fn = (SubLObject)candidate_nc_utilities.$sym193$NULL;
        if (engine.eql((SubLObject)candidate_nc_utilities.$kw194$GOOGLE)) {
            search_fn = (SubLObject)candidate_nc_utilities.$sym195$GOOGLE_COUNT;
        }
        if (engine.eql((SubLObject)candidate_nc_utilities.$kw4$YAHOO)) {
            search_fn = (SubLObject)candidate_nc_utilities.$sym185$YAHOO_COUNT;
        }
        while (!hit_count.isNumber() && !attempt_count.equal(max_attempts)) {
            attempt_count = Numbers.add(attempt_count, (SubLObject)candidate_nc_utilities.ONE_INTEGER);
            candidate_nc_utilities.$cnc_running_query_total$.setDynamicValue(Numbers.add(candidate_nc_utilities.$cnc_running_query_total$.getDynamicValue(thread), (SubLObject)candidate_nc_utilities.ONE_INTEGER), thread);
            hit_count = apply_search_fn(search_fn, string);
            Errors.warn((SubLObject)candidate_nc_utilities.$str196$Searched__A_for___S___Number_of_h, new SubLObject[] { engine, string, hit_count, candidate_nc_utilities.$cnc_running_query_total$.getDynamicValue(thread) });
        }
        return hit_count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 42414L)
    public static SubLObject apply_search_fn(final SubLObject search_fn, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)candidate_nc_utilities.NIL;
        SubLObject ignore_errors_tag = (SubLObject)candidate_nc_utilities.NIL;
        try {
            thread.throwStack.push(candidate_nc_utilities.$kw183$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)candidate_nc_utilities.$sym184$IGNORE_ERRORS_HANDLER), thread);
                try {
                    result = Functions.apply(search_fn, (SubLObject)ConsesLow.list(string_utilities.quote_string(string, (SubLObject)candidate_nc_utilities.UNPROVIDED)));
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)candidate_nc_utilities.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)candidate_nc_utilities.$kw183$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 42593L)
    public static SubLObject cnc_find_search_string_hits(final SubLObject string, final SubLObject engine, final SubLObject fht_name) {
        SubLObject hit_count = cnc_lookup_search_string_hits(string, fht_name, engine);
        if (hit_count.isNumber()) {
            return hit_count;
        }
        if (!hit_count.isNumber()) {
            hit_count = cnc_query_for_search_string_hits(string, engine);
            if (hit_count.isNumber()) {
                final SubLObject key = (SubLObject)ConsesLow.list(string, engine);
                final SubLObject value = (SubLObject)ConsesLow.list((SubLObject)candidate_nc_utilities.$kw186$HIT_COUNT, hit_count, (SubLObject)candidate_nc_utilities.$kw187$TIMESTAMP, numeric_date_utilities.timestamp((SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED));
                cnc_put_to_fht(key, fht_name, value);
            }
        }
        return hit_count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 43806L)
    public static SubLObject backup_cnc_tables() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject date_suffix = Sequences.cconcatenate(numeric_date_utilities.universal_timestring((SubLObject)candidate_nc_utilities.UNPROVIDED), (SubLObject)candidate_nc_utilities.$str200$_lisp);
        final SubLObject pairs = candidate_nc_utilities.$cnc_bkup_pairs$.getDynamicValue(thread);
        SubLObject new_files = (SubLObject)candidate_nc_utilities.NIL;
        SubLObject cdolist_list_var = pairs;
        SubLObject pair = (SubLObject)candidate_nc_utilities.NIL;
        pair = cdolist_list_var.first();
        while (candidate_nc_utilities.NIL != cdolist_list_var) {
            final SubLObject bkup_file_name = Sequences.cconcatenate(pair.first(), date_suffix);
            final SubLObject fht_name = conses_high.second(pair);
            SubLObject stream = (SubLObject)candidate_nc_utilities.NIL;
            try {
                stream = compatibility.open_text(bkup_file_name, (SubLObject)candidate_nc_utilities.$kw201$OUTPUT);
                if (!stream.isStream()) {
                    Errors.error((SubLObject)candidate_nc_utilities.$str202$Unable_to_open__S, bkup_file_name);
                }
                final SubLObject stream_$6 = stream;
                SubLObject fht = (SubLObject)candidate_nc_utilities.NIL;
                try {
                    fht = file_hash_table.open_file_hash_table_read_only(fht_name, (SubLObject)candidate_nc_utilities.EQUAL, (SubLObject)candidate_nc_utilities.$kw188$IMAGE_INDEPENDENT_CFASL);
                    final SubLObject alist = file_hash_table.file_hash_table_to_alist(fht);
                    PrintLow.format(stream_$6, (SubLObject)candidate_nc_utilities.$str203$_S, alist);
                    new_files = (SubLObject)ConsesLow.cons(bkup_file_name, new_files);
                }
                finally {
                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)candidate_nc_utilities.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        if (candidate_nc_utilities.NIL != file_hash_table.file_hash_table_p(fht)) {
                            file_hash_table.finalize_file_hash_table(fht);
                        }
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)candidate_nc_utilities.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)candidate_nc_utilities.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        }
        return new_files;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 44390L)
    public static SubLObject cnc_get_from_fht(final SubLObject value, final SubLObject table_name) {
        SubLObject ans = (SubLObject)candidate_nc_utilities.NIL;
        SubLObject fht = (SubLObject)candidate_nc_utilities.NIL;
        try {
            fht = file_hash_table.open_file_hash_table_read_only(table_name, (SubLObject)candidate_nc_utilities.EQUAL, (SubLObject)candidate_nc_utilities.$kw188$IMAGE_INDEPENDENT_CFASL);
            ans = file_hash_table.get_file_hash_table(value, fht, (SubLObject)candidate_nc_utilities.UNPROVIDED);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)candidate_nc_utilities.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (candidate_nc_utilities.NIL != file_hash_table.file_hash_table_p(fht)) {
                    file_hash_table.finalize_file_hash_table(fht);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 44665L)
    public static SubLObject cnc_put_to_fht(final SubLObject value, final SubLObject table_name, final SubLObject key) {
        SubLObject ans = (SubLObject)candidate_nc_utilities.NIL;
        SubLObject fht = (SubLObject)candidate_nc_utilities.NIL;
        try {
            fht = file_hash_table.open_file_hash_table(table_name, (SubLObject)candidate_nc_utilities.EQUAL, (SubLObject)candidate_nc_utilities.$kw188$IMAGE_INDEPENDENT_CFASL);
            ans = file_hash_table.put_file_hash_table(value, fht, key);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)candidate_nc_utilities.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (candidate_nc_utilities.NIL != file_hash_table.file_hash_table_p(fht)) {
                    file_hash_table.finalize_file_hash_table(fht);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 44922L)
    public static SubLObject cnc_remove_from_fht(final SubLObject value, final SubLObject table_name) {
        SubLObject ans = (SubLObject)candidate_nc_utilities.NIL;
        SubLObject fht = (SubLObject)candidate_nc_utilities.NIL;
        try {
            fht = file_hash_table.open_file_hash_table(table_name, (SubLObject)candidate_nc_utilities.EQUAL, (SubLObject)candidate_nc_utilities.$kw188$IMAGE_INDEPENDENT_CFASL);
            ans = file_hash_table.remove_file_hash_table(value, fht);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)candidate_nc_utilities.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (candidate_nc_utilities.NIL != file_hash_table.file_hash_table_p(fht)) {
                    file_hash_table.finalize_file_hash_table(fht);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 45179L)
    public static SubLObject cnc_print_fht_contents(final SubLObject fht_name) {
        SubLObject ans = (SubLObject)candidate_nc_utilities.NIL;
        SubLObject fht = (SubLObject)candidate_nc_utilities.NIL;
        try {
            fht = file_hash_table.open_file_hash_table_read_only(fht_name, (SubLObject)candidate_nc_utilities.EQUAL, (SubLObject)candidate_nc_utilities.$kw188$IMAGE_INDEPENDENT_CFASL);
            ans = file_hash_table.print_file_hash_table_contents(fht);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)candidate_nc_utilities.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (candidate_nc_utilities.NIL != file_hash_table.file_hash_table_p(fht)) {
                    file_hash_table.finalize_file_hash_table(fht);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 45428L)
    public static SubLObject default_aggregate_cnc_score_wrt_yahoo_old(final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = conses_high.second(removal_modules_candidate_noun_compounds.evaluate_aggregate_cnc_results_w_thresholds(rule, candidate_nc_utilities.$cnc_compound_threshold$.getDynamicValue(thread), candidate_nc_utilities.$cnc_component_threshold$.getDynamicValue(thread), (SubLObject)candidate_nc_utilities.$kw4$YAHOO));
        if (!result.isNumber()) {
            result = (SubLObject)candidate_nc_utilities.ZERO_INTEGER;
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 45812L)
    public static SubLObject default_aggregate_cnc_score_wrt_yahoo(final SubLObject rule, SubLObject create_newP) {
        if (create_newP == candidate_nc_utilities.UNPROVIDED) {
            create_newP = candidate_nc_utilities.$create_cnc_testP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rule_cycl = cycl_utilities.hl_to_el(rule);
        SubLObject result = conses_high.second(removal_modules_candidate_noun_compounds.evaluate_aggregate_cnc_results_w_thresholds(rule_cycl, candidate_nc_utilities.$cnc_compound_threshold$.getDynamicValue(thread), candidate_nc_utilities.$cnc_component_threshold$.getDynamicValue(thread), (SubLObject)candidate_nc_utilities.$kw4$YAHOO));
        if (!result.isNumber() && candidate_nc_utilities.NIL != create_newP) {
            generate_fast_cnc_test_for_rule(rule_cycl);
            result = conses_high.second(removal_modules_candidate_noun_compounds.evaluate_aggregate_cnc_results_w_thresholds(rule_cycl, candidate_nc_utilities.$cnc_compound_threshold$.getDynamicValue(thread), candidate_nc_utilities.$cnc_component_threshold$.getDynamicValue(thread), (SubLObject)candidate_nc_utilities.$kw4$YAHOO));
        }
        if (!result.isNumber()) {
            result = (SubLObject)candidate_nc_utilities.ZERO_INTEGER;
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 46449L)
    public static SubLObject generate_fast_cnc_test_for_rule(final SubLObject rule_cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (candidate_nc_utilities.NIL == candidate_nc_utilities.$use_cnc_iteratorP$.getDynamicValue(thread)) {
            candidate_nc_utilities.$use_cnc_iteratorP$.setDynamicValue((SubLObject)candidate_nc_utilities.T, thread);
        }
        generate_and_eval_cnc_test_for_rule(rule_cycl, (SubLObject)candidate_nc_utilities.$kw4$YAHOO, candidate_nc_utilities.$cnc_fast_test_size$.getDynamicValue(thread), (SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED);
        return (SubLObject)candidate_nc_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 46665L)
    public static SubLObject filter_cnc_results_w_component_threshold(final SubLObject cnc_test, SubLObject component_threshold) {
        if (component_threshold == candidate_nc_utilities.UNPROVIDED) {
            component_threshold = candidate_nc_utilities.$cnc_component_threshold$.getDynamicValue();
        }
        final SubLObject date = cnc_test.first();
        final SubLObject data_list = conses_high.second(cnc_test);
        SubLObject passed_component_threshold = (SubLObject)candidate_nc_utilities.NIL;
        SubLObject cdolist_list_var = data_list;
        SubLObject tuple = (SubLObject)candidate_nc_utilities.NIL;
        tuple = cdolist_list_var.first();
        while (candidate_nc_utilities.NIL != cdolist_list_var) {
            final SubLObject hit_numbers = conses_high.last(tuple, (SubLObject)candidate_nc_utilities.UNPROVIDED).first();
            final SubLObject compound_hits = hit_numbers.first();
            final SubLObject modifier_hits = conses_high.second(hit_numbers);
            final SubLObject head_hits = conses_high.third(hit_numbers);
            if (compound_hits.isNumber() && modifier_hits.isNumber() && head_hits.isNumber() && component_threshold.numLE(modifier_hits) && component_threshold.numLE(head_hits)) {
                passed_component_threshold = (SubLObject)ConsesLow.cons(tuple, passed_component_threshold);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        }
        return (SubLObject)ConsesLow.list(date, passed_component_threshold);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 47466L)
    public static SubLObject filter_cnc_results_w_compound_threshold(final SubLObject cnc_test, SubLObject compound_threshold) {
        if (compound_threshold == candidate_nc_utilities.UNPROVIDED) {
            compound_threshold = candidate_nc_utilities.$cnc_compound_threshold$.getDynamicValue();
        }
        final SubLObject date = cnc_test.first();
        final SubLObject data_list = conses_high.second(cnc_test);
        SubLObject passed_compound_threshold = (SubLObject)candidate_nc_utilities.NIL;
        SubLObject cdolist_list_var = data_list;
        SubLObject tuple = (SubLObject)candidate_nc_utilities.NIL;
        tuple = cdolist_list_var.first();
        while (candidate_nc_utilities.NIL != cdolist_list_var) {
            final SubLObject hit_numbers = conses_high.last(tuple, (SubLObject)candidate_nc_utilities.UNPROVIDED).first();
            final SubLObject compound_hits = hit_numbers.first();
            final SubLObject modifier_hits = conses_high.second(hit_numbers);
            final SubLObject head_hits = conses_high.third(hit_numbers);
            if (compound_hits.isNumber() && modifier_hits.isNumber() && head_hits.isNumber() && compound_threshold.numLE(compound_hits)) {
                passed_compound_threshold = (SubLObject)ConsesLow.cons(tuple, passed_compound_threshold);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        }
        return (SubLObject)ConsesLow.list(date, passed_compound_threshold);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/candidate-nc-utilities.lisp", position = 48138L)
    public static SubLObject evaluate_cnc_results_w_thresholds(final SubLObject cnc_test, SubLObject compound_threshold, SubLObject component_threshold) {
        if (compound_threshold == candidate_nc_utilities.UNPROVIDED) {
            compound_threshold = candidate_nc_utilities.$cnc_compound_threshold$.getDynamicValue();
        }
        if (component_threshold == candidate_nc_utilities.UNPROVIDED) {
            component_threshold = candidate_nc_utilities.$cnc_component_threshold$.getDynamicValue();
        }
        final SubLObject date = cnc_test.first();
        final SubLObject data_list = conses_high.second(cnc_test);
        final SubLObject total_cases = Sequences.length(data_list);
        final SubLObject passed_component_threshold = filter_cnc_results_w_component_threshold(cnc_test, component_threshold);
        final SubLObject considered_count = Sequences.length(conses_high.second(passed_component_threshold));
        final SubLObject passed_compound_threshold = filter_cnc_results_w_compound_threshold(passed_component_threshold, compound_threshold);
        final SubLObject success_count = Sequences.length(conses_high.second(passed_compound_threshold));
        SubLObject success_ratio = (SubLObject)candidate_nc_utilities.NIL;
        SubLObject total_hits = (SubLObject)candidate_nc_utilities.NIL;
        SubLObject total_hits_sum = (SubLObject)candidate_nc_utilities.NIL;
        if (considered_count.numG((SubLObject)candidate_nc_utilities.ZERO_INTEGER) && success_count.numG((SubLObject)candidate_nc_utilities.ZERO_INTEGER)) {
            success_ratio = Numbers.divide(success_count, considered_count);
        }
        SubLObject cdolist_list_var = data_list;
        SubLObject tuple = (SubLObject)candidate_nc_utilities.NIL;
        tuple = cdolist_list_var.first();
        while (candidate_nc_utilities.NIL != cdolist_list_var) {
            final SubLObject scores = conses_high.last(tuple, (SubLObject)candidate_nc_utilities.UNPROVIDED).first();
            final SubLObject compound_hits = scores.first();
            if (compound_hits.isNumber()) {
                total_hits = (SubLObject)ConsesLow.cons(compound_hits, total_hits);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        }
        total_hits_sum = Functions.apply((SubLObject)candidate_nc_utilities.$sym204$_, total_hits);
        return (SubLObject)ConsesLow.list(date, success_ratio, success_count, considered_count, total_cases, total_hits_sum, passed_compound_threshold);
    }
    
    public static SubLObject declare_candidate_nc_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_paraphrase_mt", "CNC-PARAPHRASE-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "generate_cnc_test_strings", "GENERATE-CNC-TEST-STRINGS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "generate_cnc_test_strings_via_query", "GENERATE-CNC-TEST-STRINGS-VIA-QUERY", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "generate_cnc_test_strings_from_iterator", "GENERATE-CNC-TEST-STRINGS-FROM-ITERATOR", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_string_denot_pairs", "CNC-STRING-DENOT-PAIRS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "construct_cnc_query", "CONSTRUCT-CNC-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "nc_rule_term_constraints_of_type", "NC-RULE-TERM-CONSTRAINTS-OF-TYPE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "clear_run_cnc_query", "CLEAR-RUN-CNC-QUERY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "remove_run_cnc_query", "REMOVE-RUN-CNC-QUERY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "run_cnc_query_internal", "RUN-CNC-QUERY-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "run_cnc_query", "RUN-CNC-QUERY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "filter_cnc_semantics", "FILTER-CNC-SEMANTICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "combine_cnc_modifier_head_lists", "COMBINE-CNC-MODIFIER-HEAD-LISTS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "combine_cnc_pairs", "COMBINE-CNC-PAIRS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "get_random_n", "GET-RANDOM-N", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "new_cnc_popcorn_timer", "NEW-CNC-POPCORN-TIMER", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_popcorn_note_success", "CNC-POPCORN-NOTE-SUCCESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_popcorn_note_failure", "CNC-POPCORN-NOTE-FAILURE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_popcorn_poppedP", "CNC-POPCORN-POPPED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "free_popcorn_timer", "FREE-POPCORN-TIMER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "popcorn_timer_from_pool", "POPCORN-TIMER-FROM-POOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_popcorn_window", "CNC-POPCORN-WINDOW", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_popcorn_minimum", "CNC-POPCORN-MINIMUM", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "candidate_nc_popcorn_timer_print_function_trampoline", "CANDIDATE-NC-POPCORN-TIMER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "candidate_nc_popcorn_timer_p", "CANDIDATE-NC-POPCORN-TIMER-P", 1, 0, false);
        new $candidate_nc_popcorn_timer_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_popcorn_timer_window", "CNC-POPCORN-TIMER-WINDOW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_popcorn_timer_minimum", "CNC-POPCORN-TIMER-MINIMUM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_popcorn_timer_index", "CNC-POPCORN-TIMER-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_popcorn_timer_recent_failure_count", "CNC-POPCORN-TIMER-RECENT-FAILURE-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_popcorn_timer_history", "CNC-POPCORN-TIMER-HISTORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "_csetf_cnc_popcorn_timer_window", "_CSETF-CNC-POPCORN-TIMER-WINDOW", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "_csetf_cnc_popcorn_timer_minimum", "_CSETF-CNC-POPCORN-TIMER-MINIMUM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "_csetf_cnc_popcorn_timer_index", "_CSETF-CNC-POPCORN-TIMER-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "_csetf_cnc_popcorn_timer_recent_failure_count", "_CSETF-CNC-POPCORN-TIMER-RECENT-FAILURE-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "_csetf_cnc_popcorn_timer_history", "_CSETF-CNC-POPCORN-TIMER-HISTORY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "make_candidate_nc_popcorn_timer", "MAKE-CANDIDATE-NC-POPCORN-TIMER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "visit_defstruct_candidate_nc_popcorn_timer", "VISIT-DEFSTRUCT-CANDIDATE-NC-POPCORN-TIMER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "visit_defstruct_object_candidate_nc_popcorn_timer_method", "VISIT-DEFSTRUCT-OBJECT-CANDIDATE-NC-POPCORN-TIMER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "print_cnc_popcorn_timer", "PRINT-CNC-POPCORN-TIMER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "get_cnc_popcorn_timer_window", "GET-CNC-POPCORN-TIMER-WINDOW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "get_cnc_popcorn_timer_minimum", "GET-CNC-POPCORN-TIMER-MINIMUM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "get_cnc_popcorn_timer_recent_failure_count", "GET-CNC-POPCORN-TIMER-RECENT-FAILURE-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "find_or_create_cnc_popcorn_timer", "FIND-OR-CREATE-CNC-POPCORN-TIMER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_popcorn_note_new_result", "CNC-POPCORN-NOTE-NEW-RESULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "candidate_nc_iterator_state_print_function_trampoline", "CANDIDATE-NC-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "candidate_nc_iterator_state_p", "CANDIDATE-NC-ITERATOR-STATE-P", 1, 0, false);
        new $candidate_nc_iterator_state_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_state_rule_fort", "CNC-STATE-RULE-FORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_state_mod_iterator", "CNC-STATE-MOD-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_state_head_iterator", "CNC-STATE-HEAD-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_state_mt", "CNC-STATE-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_state_doneP", "CNC-STATE-DONE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "_csetf_cnc_state_rule_fort", "_CSETF-CNC-STATE-RULE-FORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "_csetf_cnc_state_mod_iterator", "_CSETF-CNC-STATE-MOD-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "_csetf_cnc_state_head_iterator", "_CSETF-CNC-STATE-HEAD-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "_csetf_cnc_state_mt", "_CSETF-CNC-STATE-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "_csetf_cnc_state_doneP", "_CSETF-CNC-STATE-DONE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "make_candidate_nc_iterator_state", "MAKE-CANDIDATE-NC-ITERATOR-STATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "visit_defstruct_candidate_nc_iterator_state", "VISIT-DEFSTRUCT-CANDIDATE-NC-ITERATOR-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "visit_defstruct_object_candidate_nc_iterator_state_method", "VISIT-DEFSTRUCT-OBJECT-CANDIDATE-NC-ITERATOR-STATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "print_cnc_state", "PRINT-CNC-STATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "new_candidate_nc_iterator", "NEW-CANDIDATE-NC-ITERATOR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "candidate_nc_iterator_doneP", "CANDIDATE-NC-ITERATOR-DONE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "candidate_nc_iterator_next", "CANDIDATE-NC-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "candidate_nc_sub_iterator_state_print_function_trampoline", "CANDIDATE-NC-SUB-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "candidate_nc_sub_iterator_state_p", "CANDIDATE-NC-SUB-ITERATOR-STATE-P", 1, 0, false);
        new $candidate_nc_sub_iterator_state_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_substate_wu_constraints", "CNC-SUBSTATE-WU-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_substate_equals_constraints", "CNC-SUBSTATE-EQUALS-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_substate_genls_constraints", "CNC-SUBSTATE-GENLS-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_substate_isa_constraints", "CNC-SUBSTATE-ISA-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_substate_pos_constraints", "CNC-SUBSTATE-POS-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_substate_pos_pred_constraints", "CNC-SUBSTATE-POS-PRED-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_substate_mt", "CNC-SUBSTATE-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_substate_plist", "CNC-SUBSTATE-PLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_substate_doneP", "CNC-SUBSTATE-DONE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "_csetf_cnc_substate_wu_constraints", "_CSETF-CNC-SUBSTATE-WU-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "_csetf_cnc_substate_equals_constraints", "_CSETF-CNC-SUBSTATE-EQUALS-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "_csetf_cnc_substate_genls_constraints", "_CSETF-CNC-SUBSTATE-GENLS-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "_csetf_cnc_substate_isa_constraints", "_CSETF-CNC-SUBSTATE-ISA-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "_csetf_cnc_substate_pos_constraints", "_CSETF-CNC-SUBSTATE-POS-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "_csetf_cnc_substate_pos_pred_constraints", "_CSETF-CNC-SUBSTATE-POS-PRED-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "_csetf_cnc_substate_mt", "_CSETF-CNC-SUBSTATE-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "_csetf_cnc_substate_plist", "_CSETF-CNC-SUBSTATE-PLIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "_csetf_cnc_substate_doneP", "_CSETF-CNC-SUBSTATE-DONE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "make_candidate_nc_sub_iterator_state", "MAKE-CANDIDATE-NC-SUB-ITERATOR-STATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "visit_defstruct_candidate_nc_sub_iterator_state", "VISIT-DEFSTRUCT-CANDIDATE-NC-SUB-ITERATOR-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "visit_defstruct_object_candidate_nc_sub_iterator_state_method", "VISIT-DEFSTRUCT-OBJECT-CANDIDATE-NC-SUB-ITERATOR-STATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "print_cnc_substate", "PRINT-CNC-SUBSTATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_substate_plist_enter", "CNC-SUBSTATE-PLIST-ENTER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_substate_plist_lookup", "CNC-SUBSTATE-PLIST-LOOKUP", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "new_cnc_mod_iterator", "NEW-CNC-MOD-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_mod_iterator_doneP", "CNC-MOD-ITERATOR-DONE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_mod_iterator_next", "CNC-MOD-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_random_mod_pair_from_state", "CNC-RANDOM-MOD-PAIR-FROM-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_sub_iterator_slot_values", "CNC-SUB-ITERATOR-SLOT-VALUES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "new_cnc_head_iterator", "NEW-CNC-HEAD-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_head_iterator_doneP", "CNC-HEAD-ITERATOR-DONE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_head_iterator_next", "CNC-HEAD-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_random_head_pair_from_state", "CNC-RANDOM-HEAD-PAIR-FROM-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_random_pair_from_state", "CNC-RANDOM-PAIR-FROM-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_random_pair_via_query", "CNC-RANDOM-PAIR-VIA-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "get_cnc_substate_query_pairs", "GET-CNC-SUBSTATE-QUERY-PAIRS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_random_pair_from_wu_constraints", "CNC-RANDOM-PAIR-FROM-WU-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_random_pair_from_equals_constraints", "CNC-RANDOM-PAIR-FROM-EQUALS-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "get_cnc_substate_cheapest_isaXgenls_constraint", "GET-CNC-SUBSTATE-CHEAPEST-ISA/GENLS-CONSTRAINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "get_cnc_substate_cheapest_isaXgenls_constraint_matches", "GET-CNC-SUBSTATE-CHEAPEST-ISA/GENLS-CONSTRAINT-MATCHES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "note_cnc_substate_cheapest_isaXgenls_constraint_matches", "NOTE-CNC-SUBSTATE-CHEAPEST-ISA/GENLS-CONSTRAINT-MATCHES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "remove_cnc_substate_cheapest_isaXgenls_constraint_match", "REMOVE-CNC-SUBSTATE-CHEAPEST-ISA/GENLS-CONSTRAINT-MATCH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_random_pair_from_isaXgenls_constraints", "CNC-RANDOM-PAIR-FROM-ISA/GENLS-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_random_pair_from_isaXgenls_constraints_internal", "CNC-RANDOM-PAIR-FROM-ISA/GENLS-CONSTRAINTS-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_random_match_constraint_failure", "CNC-RANDOM-MATCH-CONSTRAINT-FAILURE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_random_pair_from_match", "CNC-RANDOM-PAIR-FROM-MATCH", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_agr_pred_okP", "CNC-AGR-PRED-OK?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_string_okP", "CNC-STRING-OK?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "contains_adjective_only_wordP", "CONTAINS-ADJECTIVE-ONLY-WORD?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_cheapest_isaXgenls_constraint", "CNC-CHEAPEST-ISA/GENLS-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "generate_and_eval_cnc_test_for_rule", "GENERATE-AND-EVAL-CNC-TEST-FOR-RULE", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "test_untested_ncr_rules", "TEST-UNTESTED-NCR-RULES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "test_untested_ncrs_w_running_query_limit", "TEST-UNTESTED-NCRS-W-RUNNING-QUERY-LIMIT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "generate_and_store_cnc_tests_for_untested_rules", "GENERATE-AND-STORE-CNC-TESTS-FOR-UNTESTED-RULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "generate_and_store_cnc_test_for_rule", "GENERATE-AND-STORE-CNC-TEST-FOR-RULE", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "batch_process_unfamiliar_strings", "BATCH-PROCESS-UNFAMILIAR-STRINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "lookup_and_store_scores_for_unscored_cnc_tests", "LOOKUP-AND-STORE-SCORES-FOR-UNSCORED-CNC-TESTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "update_unscored_ncr_table", "UPDATE-UNSCORED-NCR-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "update_scored_ncr_table", "UPDATE-SCORED-NCR-TABLE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "find_unfamiliar_strings_from_unscored_cnc_tests", "FIND-UNFAMILIAR-STRINGS-FROM-UNSCORED-CNC-TESTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_get_engine", "CNC-GET-ENGINE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "score_and_store_cnc_test_data_for_ncr", "SCORE-AND-STORE-CNC-TEST-DATA-FOR-NCR", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "score_unscored_cnc_data", "SCORE-UNSCORED-CNC-DATA", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "score_unscored_cnc_data2", "SCORE-UNSCORED-CNC-DATA2", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_query_and_store_search_string_hits", "CNC-QUERY-AND-STORE-SEARCH-STRING-HITS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_get_string_hit_pairs", "CNC-GET-STRING-HIT-PAIRS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "score_cnc_test_data", "SCORE-CNC-TEST-DATA", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "get_unfamiliar_strings_from_cnc_data", "GET-UNFAMILIAR-STRINGS-FROM-CNC-DATA", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "string_hits_knownP", "STRING-HITS-KNOWN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "score_cnc_test_tuple", "SCORE-CNC-TEST-TUPLE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "score_cnc_test_tuple2", "SCORE-CNC-TEST-TUPLE2", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "initialize_running_query_counter", "INITIALIZE-RUNNING-QUERY-COUNTER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_lookup_search_string_hits", "CNC-LOOKUP-SEARCH-STRING-HITS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_query_for_search_string_hits", "CNC-QUERY-FOR-SEARCH-STRING-HITS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "apply_search_fn", "APPLY-SEARCH-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_find_search_string_hits", "CNC-FIND-SEARCH-STRING-HITS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "backup_cnc_tables", "BACKUP-CNC-TABLES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_get_from_fht", "CNC-GET-FROM-FHT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_put_to_fht", "CNC-PUT-TO-FHT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_remove_from_fht", "CNC-REMOVE-FROM-FHT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "cnc_print_fht_contents", "CNC-PRINT-FHT-CONTENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "default_aggregate_cnc_score_wrt_yahoo_old", "DEFAULT-AGGREGATE-CNC-SCORE-WRT-YAHOO-OLD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "default_aggregate_cnc_score_wrt_yahoo", "DEFAULT-AGGREGATE-CNC-SCORE-WRT-YAHOO", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "generate_fast_cnc_test_for_rule", "GENERATE-FAST-CNC-TEST-FOR-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "filter_cnc_results_w_component_threshold", "FILTER-CNC-RESULTS-W-COMPONENT-THRESHOLD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "filter_cnc_results_w_compound_threshold", "FILTER-CNC-RESULTS-W-COMPOUND-THRESHOLD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.candidate_nc_utilities", "evaluate_cnc_results_w_thresholds", "EVALUATE-CNC-RESULTS-W-THRESHOLDS", 1, 2, false);
        return (SubLObject)candidate_nc_utilities.NIL;
    }
    
    public static SubLObject init_candidate_nc_utilities_file() {
        candidate_nc_utilities.$cnc_test_size$ = SubLFiles.defparameter("*CNC-TEST-SIZE*", (SubLObject)candidate_nc_utilities.$int0$1000);
        candidate_nc_utilities.$cnc_fast_test_size$ = SubLFiles.defparameter("*CNC-FAST-TEST-SIZE*", (SubLObject)candidate_nc_utilities.$int1$300);
        candidate_nc_utilities.$cnc_query_mt$ = SubLFiles.defparameter("*CNC-QUERY-MT*", candidate_nc_utilities.$const2$GeneralEnglishMt);
        candidate_nc_utilities.$cnc_paraphrase_mt$ = SubLFiles.defparameter("*CNC-PARAPHRASE-MT*", candidate_nc_utilities.$const3$EnglishParaphraseMt);
        candidate_nc_utilities.$cnc_running_query_total$ = SubLFiles.defvar("*CNC-RUNNING-QUERY-TOTAL*", (SubLObject)candidate_nc_utilities.ZERO_INTEGER);
        candidate_nc_utilities.$cnc_default_search_engine$ = SubLFiles.defparameter("*CNC-DEFAULT-SEARCH-ENGINE*", (SubLObject)candidate_nc_utilities.$kw4$YAHOO);
        candidate_nc_utilities.$cnc_max_string_search_attempts$ = SubLFiles.defparameter("*CNC-MAX-STRING-SEARCH-ATTEMPTS*", (SubLObject)candidate_nc_utilities.TEN_INTEGER);
        candidate_nc_utilities.$cnc_compound_threshold$ = SubLFiles.defparameter("*CNC-COMPOUND-THRESHOLD*", (SubLObject)candidate_nc_utilities.ONE_INTEGER);
        candidate_nc_utilities.$cnc_component_threshold$ = SubLFiles.defparameter("*CNC-COMPONENT-THRESHOLD*", (SubLObject)candidate_nc_utilities.$int5$100);
        candidate_nc_utilities.$cnc_string_hits_table$ = SubLFiles.defparameter("*CNC-STRING-HITS-TABLE*", (SubLObject)candidate_nc_utilities.$str6$_cyc_top_data_nl_cnc_tests_fht_da);
        candidate_nc_utilities.$scored_ncr_table$ = SubLFiles.defparameter("*SCORED-NCR-TABLE*", (SubLObject)candidate_nc_utilities.$str7$_cyc_top_data_nl_cnc_tests_fht_da);
        candidate_nc_utilities.$unscored_ncr_table$ = SubLFiles.defparameter("*UNSCORED-NCR-TABLE*", (SubLObject)candidate_nc_utilities.$str8$_cyc_top_data_nl_cnc_tests_fht_da);
        candidate_nc_utilities.$use_cnc_iteratorP$ = SubLFiles.defparameter("*USE-CNC-ITERATOR?*", (SubLObject)candidate_nc_utilities.T);
        candidate_nc_utilities.$cnc_remove_duplicatesP$ = SubLFiles.defparameter("*CNC-REMOVE-DUPLICATES?*", (SubLObject)candidate_nc_utilities.T);
        candidate_nc_utilities.$nc_rule_constraint_predicate_map$ = SubLFiles.deflexical("*NC-RULE-CONSTRAINT-PREDICATE-MAP*", (SubLObject)candidate_nc_utilities.$list40);
        candidate_nc_utilities.$run_cnc_query_caching_state$ = SubLFiles.deflexical("*RUN-CNC-QUERY-CACHING-STATE*", (SubLObject)candidate_nc_utilities.NIL);
        candidate_nc_utilities.$popcorn_timer_pool$ = SubLFiles.deflexical("*POPCORN-TIMER-POOL*", dictionary.new_dictionary((SubLObject)candidate_nc_utilities.UNPROVIDED, (SubLObject)candidate_nc_utilities.UNPROVIDED));
        candidate_nc_utilities.$popcorn_timer_pool_lock$ = SubLFiles.deflexical("*POPCORN-TIMER-POOL-LOCK*", Locks.make_lock((SubLObject)candidate_nc_utilities.$str54$Popcorn_Timer_Pool_Lock));
        candidate_nc_utilities.$cnc_popcorn_window$ = SubLFiles.defparameter("*CNC-POPCORN-WINDOW*", (SubLObject)candidate_nc_utilities.$int56$50);
        candidate_nc_utilities.$cnc_popcorn_minimum$ = SubLFiles.defparameter("*CNC-POPCORN-MINIMUM*", (SubLObject)candidate_nc_utilities.ONE_INTEGER);
        candidate_nc_utilities.$dtp_candidate_nc_popcorn_timer$ = SubLFiles.defconstant("*DTP-CANDIDATE-NC-POPCORN-TIMER*", (SubLObject)candidate_nc_utilities.$sym57$CANDIDATE_NC_POPCORN_TIMER);
        candidate_nc_utilities.$dtp_candidate_nc_iterator_state$ = SubLFiles.defconstant("*DTP-CANDIDATE-NC-ITERATOR-STATE*", (SubLObject)candidate_nc_utilities.$sym88$CANDIDATE_NC_ITERATOR_STATE);
        candidate_nc_utilities.$cnc_rule_fort$ = SubLFiles.defparameter("*CNC-RULE-FORT*", (SubLObject)candidate_nc_utilities.NIL);
        candidate_nc_utilities.$dtp_candidate_nc_sub_iterator_state$ = SubLFiles.defconstant("*DTP-CANDIDATE-NC-SUB-ITERATOR-STATE*", (SubLObject)candidate_nc_utilities.$sym118$CANDIDATE_NC_SUB_ITERATOR_STATE);
        candidate_nc_utilities.$cnc_max_tries$ = SubLFiles.defparameter("*CNC-MAX-TRIES*", (SubLObject)candidate_nc_utilities.$int1$300);
        candidate_nc_utilities.$cnc_pph_demerit_cutoff$ = SubLFiles.defparameter("*CNC-PPH-DEMERIT-CUTOFF*", (SubLObject)candidate_nc_utilities.ONE_INTEGER);
        candidate_nc_utilities.$cnc_max_string_length$ = SubLFiles.defparameter("*CNC-MAX-STRING-LENGTH*", (SubLObject)candidate_nc_utilities.$int175$30);
        candidate_nc_utilities.$store_w_method_test_keyP$ = SubLFiles.defparameter("*STORE-W-METHOD-TEST-KEY?*", (SubLObject)candidate_nc_utilities.NIL);
        candidate_nc_utilities.$cnc_method_test_keyword$ = SubLFiles.defparameter("*CNC-METHOD-TEST-KEYWORD*", (SubLObject)candidate_nc_utilities.$kw191$ITERATOR_TEST5);
        candidate_nc_utilities.$cnc_search_string_hits_bkup_file_prefix$ = SubLFiles.defparameter("*CNC-SEARCH-STRING-HITS-BKUP-FILE-PREFIX*", (SubLObject)candidate_nc_utilities.$str197$_cyc_top_data_nl_cnc_tests_bkup_f);
        candidate_nc_utilities.$scored_ncr_bkup_file_prefix$ = SubLFiles.defparameter("*SCORED-NCR-BKUP-FILE-PREFIX*", (SubLObject)candidate_nc_utilities.$str198$_cyc_top_data_nl_cnc_tests_bkup_f);
        candidate_nc_utilities.$unscored_ncr_bkup_file_prefix$ = SubLFiles.defparameter("*UNSCORED-NCR-BKUP-FILE-PREFIX*", (SubLObject)candidate_nc_utilities.$str199$_cyc_top_data_nl_cnc_tests_bkup_f);
        candidate_nc_utilities.$cnc_bkup_pairs$ = SubLFiles.defparameter("*CNC-BKUP-PAIRS*", (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(candidate_nc_utilities.$cnc_search_string_hits_bkup_file_prefix$.getDynamicValue(), candidate_nc_utilities.$cnc_string_hits_table$.getDynamicValue()), (SubLObject)ConsesLow.list(candidate_nc_utilities.$scored_ncr_bkup_file_prefix$.getDynamicValue(), candidate_nc_utilities.$scored_ncr_table$.getDynamicValue()), (SubLObject)ConsesLow.list(candidate_nc_utilities.$unscored_ncr_bkup_file_prefix$.getDynamicValue(), candidate_nc_utilities.$unscored_ncr_table$.getDynamicValue())));
        candidate_nc_utilities.$create_cnc_testP$ = SubLFiles.defparameter("*CREATE-CNC-TEST?*", (SubLObject)candidate_nc_utilities.T);
        return (SubLObject)candidate_nc_utilities.NIL;
    }
    
    public static SubLObject setup_candidate_nc_utilities_file() {
        memoization_state.note_globally_cached_function((SubLObject)candidate_nc_utilities.$sym43$RUN_CNC_QUERY);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), candidate_nc_utilities.$dtp_candidate_nc_popcorn_timer$.getGlobalValue(), Symbols.symbol_function((SubLObject)candidate_nc_utilities.$sym64$CANDIDATE_NC_POPCORN_TIMER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)candidate_nc_utilities.$list65);
        Structures.def_csetf((SubLObject)candidate_nc_utilities.$sym66$CNC_POPCORN_TIMER_WINDOW, (SubLObject)candidate_nc_utilities.$sym67$_CSETF_CNC_POPCORN_TIMER_WINDOW);
        Structures.def_csetf((SubLObject)candidate_nc_utilities.$sym68$CNC_POPCORN_TIMER_MINIMUM, (SubLObject)candidate_nc_utilities.$sym69$_CSETF_CNC_POPCORN_TIMER_MINIMUM);
        Structures.def_csetf((SubLObject)candidate_nc_utilities.$sym70$CNC_POPCORN_TIMER_INDEX, (SubLObject)candidate_nc_utilities.$sym71$_CSETF_CNC_POPCORN_TIMER_INDEX);
        Structures.def_csetf((SubLObject)candidate_nc_utilities.$sym72$CNC_POPCORN_TIMER_RECENT_FAILURE_COUNT, (SubLObject)candidate_nc_utilities.$sym73$_CSETF_CNC_POPCORN_TIMER_RECENT_FAILURE_COUNT);
        Structures.def_csetf((SubLObject)candidate_nc_utilities.$sym74$CNC_POPCORN_TIMER_HISTORY, (SubLObject)candidate_nc_utilities.$sym75$_CSETF_CNC_POPCORN_TIMER_HISTORY);
        Equality.identity((SubLObject)candidate_nc_utilities.$sym57$CANDIDATE_NC_POPCORN_TIMER);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), candidate_nc_utilities.$dtp_candidate_nc_popcorn_timer$.getGlobalValue(), Symbols.symbol_function((SubLObject)candidate_nc_utilities.$sym86$VISIT_DEFSTRUCT_OBJECT_CANDIDATE_NC_POPCORN_TIMER_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), candidate_nc_utilities.$dtp_candidate_nc_iterator_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)candidate_nc_utilities.$sym95$CANDIDATE_NC_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)candidate_nc_utilities.$list96);
        Structures.def_csetf((SubLObject)candidate_nc_utilities.$sym97$CNC_STATE_RULE_FORT, (SubLObject)candidate_nc_utilities.$sym98$_CSETF_CNC_STATE_RULE_FORT);
        Structures.def_csetf((SubLObject)candidate_nc_utilities.$sym99$CNC_STATE_MOD_ITERATOR, (SubLObject)candidate_nc_utilities.$sym100$_CSETF_CNC_STATE_MOD_ITERATOR);
        Structures.def_csetf((SubLObject)candidate_nc_utilities.$sym101$CNC_STATE_HEAD_ITERATOR, (SubLObject)candidate_nc_utilities.$sym102$_CSETF_CNC_STATE_HEAD_ITERATOR);
        Structures.def_csetf((SubLObject)candidate_nc_utilities.$sym103$CNC_STATE_MT, (SubLObject)candidate_nc_utilities.$sym104$_CSETF_CNC_STATE_MT);
        Structures.def_csetf((SubLObject)candidate_nc_utilities.$sym105$CNC_STATE_DONE_, (SubLObject)candidate_nc_utilities.$sym106$_CSETF_CNC_STATE_DONE_);
        Equality.identity((SubLObject)candidate_nc_utilities.$sym88$CANDIDATE_NC_ITERATOR_STATE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), candidate_nc_utilities.$dtp_candidate_nc_iterator_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)candidate_nc_utilities.$sym113$VISIT_DEFSTRUCT_OBJECT_CANDIDATE_NC_ITERATOR_STATE_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), candidate_nc_utilities.$dtp_candidate_nc_sub_iterator_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)candidate_nc_utilities.$sym125$CANDIDATE_NC_SUB_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)candidate_nc_utilities.$list126);
        Structures.def_csetf((SubLObject)candidate_nc_utilities.$sym127$CNC_SUBSTATE_WU_CONSTRAINTS, (SubLObject)candidate_nc_utilities.$sym128$_CSETF_CNC_SUBSTATE_WU_CONSTRAINTS);
        Structures.def_csetf((SubLObject)candidate_nc_utilities.$sym129$CNC_SUBSTATE_EQUALS_CONSTRAINTS, (SubLObject)candidate_nc_utilities.$sym130$_CSETF_CNC_SUBSTATE_EQUALS_CONSTRAINTS);
        Structures.def_csetf((SubLObject)candidate_nc_utilities.$sym131$CNC_SUBSTATE_GENLS_CONSTRAINTS, (SubLObject)candidate_nc_utilities.$sym132$_CSETF_CNC_SUBSTATE_GENLS_CONSTRAINTS);
        Structures.def_csetf((SubLObject)candidate_nc_utilities.$sym133$CNC_SUBSTATE_ISA_CONSTRAINTS, (SubLObject)candidate_nc_utilities.$sym134$_CSETF_CNC_SUBSTATE_ISA_CONSTRAINTS);
        Structures.def_csetf((SubLObject)candidate_nc_utilities.$sym135$CNC_SUBSTATE_POS_CONSTRAINTS, (SubLObject)candidate_nc_utilities.$sym136$_CSETF_CNC_SUBSTATE_POS_CONSTRAINTS);
        Structures.def_csetf((SubLObject)candidate_nc_utilities.$sym137$CNC_SUBSTATE_POS_PRED_CONSTRAINTS, (SubLObject)candidate_nc_utilities.$sym138$_CSETF_CNC_SUBSTATE_POS_PRED_CONSTRAINTS);
        Structures.def_csetf((SubLObject)candidate_nc_utilities.$sym139$CNC_SUBSTATE_MT, (SubLObject)candidate_nc_utilities.$sym140$_CSETF_CNC_SUBSTATE_MT);
        Structures.def_csetf((SubLObject)candidate_nc_utilities.$sym141$CNC_SUBSTATE_PLIST, (SubLObject)candidate_nc_utilities.$sym142$_CSETF_CNC_SUBSTATE_PLIST);
        Structures.def_csetf((SubLObject)candidate_nc_utilities.$sym143$CNC_SUBSTATE_DONE_, (SubLObject)candidate_nc_utilities.$sym144$_CSETF_CNC_SUBSTATE_DONE_);
        Equality.identity((SubLObject)candidate_nc_utilities.$sym118$CANDIDATE_NC_SUB_ITERATOR_STATE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), candidate_nc_utilities.$dtp_candidate_nc_sub_iterator_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)candidate_nc_utilities.$sym153$VISIT_DEFSTRUCT_OBJECT_CANDIDATE_NC_SUB_ITERATOR_STATE_METHOD));
        return (SubLObject)candidate_nc_utilities.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_candidate_nc_utilities_file();
    }
    
    @Override
	public void initializeVariables() {
        init_candidate_nc_utilities_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_candidate_nc_utilities_file();
    }
    
    static {
        me = (SubLFile)new candidate_nc_utilities();
        candidate_nc_utilities.$cnc_test_size$ = null;
        candidate_nc_utilities.$cnc_fast_test_size$ = null;
        candidate_nc_utilities.$cnc_query_mt$ = null;
        candidate_nc_utilities.$cnc_paraphrase_mt$ = null;
        candidate_nc_utilities.$cnc_running_query_total$ = null;
        candidate_nc_utilities.$cnc_default_search_engine$ = null;
        candidate_nc_utilities.$cnc_max_string_search_attempts$ = null;
        candidate_nc_utilities.$cnc_compound_threshold$ = null;
        candidate_nc_utilities.$cnc_component_threshold$ = null;
        candidate_nc_utilities.$cnc_string_hits_table$ = null;
        candidate_nc_utilities.$scored_ncr_table$ = null;
        candidate_nc_utilities.$unscored_ncr_table$ = null;
        candidate_nc_utilities.$use_cnc_iteratorP$ = null;
        candidate_nc_utilities.$cnc_remove_duplicatesP$ = null;
        candidate_nc_utilities.$nc_rule_constraint_predicate_map$ = null;
        candidate_nc_utilities.$run_cnc_query_caching_state$ = null;
        candidate_nc_utilities.$popcorn_timer_pool$ = null;
        candidate_nc_utilities.$popcorn_timer_pool_lock$ = null;
        candidate_nc_utilities.$cnc_popcorn_window$ = null;
        candidate_nc_utilities.$cnc_popcorn_minimum$ = null;
        candidate_nc_utilities.$dtp_candidate_nc_popcorn_timer$ = null;
        candidate_nc_utilities.$dtp_candidate_nc_iterator_state$ = null;
        candidate_nc_utilities.$cnc_rule_fort$ = null;
        candidate_nc_utilities.$dtp_candidate_nc_sub_iterator_state$ = null;
        candidate_nc_utilities.$cnc_max_tries$ = null;
        candidate_nc_utilities.$cnc_pph_demerit_cutoff$ = null;
        candidate_nc_utilities.$cnc_max_string_length$ = null;
        candidate_nc_utilities.$store_w_method_test_keyP$ = null;
        candidate_nc_utilities.$cnc_method_test_keyword$ = null;
        candidate_nc_utilities.$cnc_search_string_hits_bkup_file_prefix$ = null;
        candidate_nc_utilities.$scored_ncr_bkup_file_prefix$ = null;
        candidate_nc_utilities.$unscored_ncr_bkup_file_prefix$ = null;
        candidate_nc_utilities.$cnc_bkup_pairs$ = null;
        candidate_nc_utilities.$create_cnc_testP$ = null;
        $int0$1000 = SubLObjectFactory.makeInteger(1000);
        $int1$300 = SubLObjectFactory.makeInteger(300);
        $const2$GeneralEnglishMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeneralEnglishMt"));
        $const3$EnglishParaphraseMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishParaphraseMt"));
        $kw4$YAHOO = SubLObjectFactory.makeKeyword("YAHOO");
        $int5$100 = SubLObjectFactory.makeInteger(100);
        $str6$_cyc_top_data_nl_cnc_tests_fht_da = SubLObjectFactory.makeString("/cyc/top/data/nl/cnc-tests/fht-data/cnc-string-hits-data-master.fht");
        $str7$_cyc_top_data_nl_cnc_tests_fht_da = SubLObjectFactory.makeString("/cyc/top/data/nl/cnc-tests/fht-data/scored-cnc-test-data-master.fht");
        $str8$_cyc_top_data_nl_cnc_tests_fht_da = SubLObjectFactory.makeString("/cyc/top/data/nl/cnc-tests/fht-data/unscored-cnc-test-data-master.fht");
        $const9$TheNCHead = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheNCHead"));
        $const10$TheNCModifier = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheNCModifier"));
        $kw11$PRODUCTIVITY_LIMIT = SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT");
        $kw12$POSITIVE_INFINITY = SubLObjectFactory.makeKeyword("POSITIVE-INFINITY");
        $kw13$WU = SubLObjectFactory.makeKeyword("WU");
        $kw14$EQL = SubLObjectFactory.makeKeyword("EQL");
        $kw15$GENL = SubLObjectFactory.makeKeyword("GENL");
        $kw16$ISA = SubLObjectFactory.makeKeyword("ISA");
        $kw17$POS = SubLObjectFactory.makeKeyword("POS");
        $kw18$PRED = SubLObjectFactory.makeKeyword("PRED");
        $const19$wordForms = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wordForms"));
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?STRING"));
        $const21$ist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist"));
        $list22 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases")), (SubLObject)SubLObjectFactory.makeSymbol("?DENOT"), (SubLObject)SubLObjectFactory.makeSymbol("?PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?STRING")));
        $const23$equals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"));
        $sym24$_DENOT = SubLObjectFactory.makeSymbol("?DENOT");
        $const25$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $const26$FirstOrderCollection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FirstOrderCollection"));
        $list27 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases")), (SubLObject)SubLObjectFactory.makeSymbol("?DENOT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CharacterString")), (SubLObject)SubLObjectFactory.makeSymbol("?STRING")));
        $const28$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const29$termPhrases = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases"));
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?STRING"));
        $list31 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotation")), (SubLObject)SubLObjectFactory.makeSymbol("?WORD"), (SubLObject)SubLObjectFactory.makeSymbol("?POS"), (SubLObject)SubLObjectFactory.makeSymbol("?NUM"), (SubLObject)SubLObjectFactory.makeSymbol("?DENOT")));
        $str32$___The_modifier_is_underconstrain = SubLObjectFactory.makeString("~% The modifier is underconstrained: added open #$denotation constraint on ~S.");
        $list33 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases")), (SubLObject)SubLObjectFactory.makeSymbol("?DENOT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic")), (SubLObject)SubLObjectFactory.makeSymbol("?STRING")));
        $str34$___The_modifier_is_underconstrain = SubLObjectFactory.makeString("~% The modifier is underconstrained:  added #$nonPlural-Generic constraint on ~S.");
        $list35 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases")), (SubLObject)SubLObjectFactory.makeSymbol("?DENOT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun")), (SubLObject)SubLObjectFactory.makeSymbol("?STRING")));
        $str36$___The_head_is_underconstrained__ = SubLObjectFactory.makeString("~% The head is underconstrained:  added #$Noun constraint on ~S.");
        $const37$Noun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun"));
        $str38$___Added___nonPlural_Generic_cons = SubLObjectFactory.makeString("~% Added #$nonPlural-Generic constraint on ~S.");
        $str39$___The_query_for__S_is___S__ = SubLObjectFactory.makeString("~% The query for ~S is: ~S~%");
        $list40 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("PRED"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("posPredConstraintForNCR"))), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("POS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("posConstraintForNCR"))), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("WU"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wordUnitConstraintForNCR"))), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("ISA"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isaConstraintForNCR"))), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("GENL"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlsConstraintForNCR"))), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("EQL"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equalsConstraintForNCR"))));
        $sym41$_CONSTRAINT = SubLObjectFactory.makeSymbol("?CONSTRAINT");
        $const42$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $sym43$RUN_CNC_QUERY = SubLObjectFactory.makeSymbol("RUN-CNC-QUERY");
        $list44 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("?STRING"), (SubLObject)SubLObjectFactory.makeSymbol("?DENOT"));
        $sym45$_RUN_CNC_QUERY_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*RUN-CNC-QUERY-CACHING-STATE*");
        $kw46$MODIFIER = SubLObjectFactory.makeKeyword("MODIFIER");
        $kw47$HEAD = SubLObjectFactory.makeKeyword("HEAD");
        $str48$___These_candidate_NCs_were_rejec = SubLObjectFactory.makeString("~% These candidate NCs were rejected: ~S.");
        $list49 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("MOD-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("MOD-DENOT"));
        $list50 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("HEAD-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD-DENOT"));
        $str51$_ = SubLObjectFactory.makeString(" ");
        $sym52$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $str53$Popcorn_timer_minimum_must_be_les = SubLObjectFactory.makeString("Popcorn timer minimum must be less than the window.");
        $str54$Popcorn_Timer_Pool_Lock = SubLObjectFactory.makeString("Popcorn Timer Pool Lock");
        $kw55$FREE = SubLObjectFactory.makeKeyword("FREE");
        $int56$50 = SubLObjectFactory.makeInteger(50);
        $sym57$CANDIDATE_NC_POPCORN_TIMER = SubLObjectFactory.makeSymbol("CANDIDATE-NC-POPCORN-TIMER");
        $sym58$CANDIDATE_NC_POPCORN_TIMER_P = SubLObjectFactory.makeSymbol("CANDIDATE-NC-POPCORN-TIMER-P");
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WINDOW"), (SubLObject)SubLObjectFactory.makeSymbol("MINIMUM"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("RECENT-FAILURE-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("HISTORY"));
        $list60 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WINDOW"), (SubLObject)SubLObjectFactory.makeKeyword("MINIMUM"), (SubLObject)SubLObjectFactory.makeKeyword("INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("RECENT-FAILURE-COUNT"), (SubLObject)SubLObjectFactory.makeKeyword("HISTORY"));
        $list61 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNC-POPCORN-TIMER-WINDOW"), (SubLObject)SubLObjectFactory.makeSymbol("CNC-POPCORN-TIMER-MINIMUM"), (SubLObject)SubLObjectFactory.makeSymbol("CNC-POPCORN-TIMER-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("CNC-POPCORN-TIMER-RECENT-FAILURE-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("CNC-POPCORN-TIMER-HISTORY"));
        $list62 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CNC-POPCORN-TIMER-WINDOW"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CNC-POPCORN-TIMER-MINIMUM"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CNC-POPCORN-TIMER-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CNC-POPCORN-TIMER-RECENT-FAILURE-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CNC-POPCORN-TIMER-HISTORY"));
        $sym63$PRINT_CNC_POPCORN_TIMER = SubLObjectFactory.makeSymbol("PRINT-CNC-POPCORN-TIMER");
        $sym64$CANDIDATE_NC_POPCORN_TIMER_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("CANDIDATE-NC-POPCORN-TIMER-PRINT-FUNCTION-TRAMPOLINE");
        $list65 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE-NC-POPCORN-TIMER-P"));
        $sym66$CNC_POPCORN_TIMER_WINDOW = SubLObjectFactory.makeSymbol("CNC-POPCORN-TIMER-WINDOW");
        $sym67$_CSETF_CNC_POPCORN_TIMER_WINDOW = SubLObjectFactory.makeSymbol("_CSETF-CNC-POPCORN-TIMER-WINDOW");
        $sym68$CNC_POPCORN_TIMER_MINIMUM = SubLObjectFactory.makeSymbol("CNC-POPCORN-TIMER-MINIMUM");
        $sym69$_CSETF_CNC_POPCORN_TIMER_MINIMUM = SubLObjectFactory.makeSymbol("_CSETF-CNC-POPCORN-TIMER-MINIMUM");
        $sym70$CNC_POPCORN_TIMER_INDEX = SubLObjectFactory.makeSymbol("CNC-POPCORN-TIMER-INDEX");
        $sym71$_CSETF_CNC_POPCORN_TIMER_INDEX = SubLObjectFactory.makeSymbol("_CSETF-CNC-POPCORN-TIMER-INDEX");
        $sym72$CNC_POPCORN_TIMER_RECENT_FAILURE_COUNT = SubLObjectFactory.makeSymbol("CNC-POPCORN-TIMER-RECENT-FAILURE-COUNT");
        $sym73$_CSETF_CNC_POPCORN_TIMER_RECENT_FAILURE_COUNT = SubLObjectFactory.makeSymbol("_CSETF-CNC-POPCORN-TIMER-RECENT-FAILURE-COUNT");
        $sym74$CNC_POPCORN_TIMER_HISTORY = SubLObjectFactory.makeSymbol("CNC-POPCORN-TIMER-HISTORY");
        $sym75$_CSETF_CNC_POPCORN_TIMER_HISTORY = SubLObjectFactory.makeSymbol("_CSETF-CNC-POPCORN-TIMER-HISTORY");
        $kw76$WINDOW = SubLObjectFactory.makeKeyword("WINDOW");
        $kw77$MINIMUM = SubLObjectFactory.makeKeyword("MINIMUM");
        $kw78$INDEX = SubLObjectFactory.makeKeyword("INDEX");
        $kw79$RECENT_FAILURE_COUNT = SubLObjectFactory.makeKeyword("RECENT-FAILURE-COUNT");
        $kw80$HISTORY = SubLObjectFactory.makeKeyword("HISTORY");
        $str81$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw82$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym83$MAKE_CANDIDATE_NC_POPCORN_TIMER = SubLObjectFactory.makeSymbol("MAKE-CANDIDATE-NC-POPCORN-TIMER");
        $kw84$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw85$END = SubLObjectFactory.makeKeyword("END");
        $sym86$VISIT_DEFSTRUCT_OBJECT_CANDIDATE_NC_POPCORN_TIMER_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-CANDIDATE-NC-POPCORN-TIMER-METHOD");
        $str87$_CNC_POPCORN_TIMER__S_of__S_ = SubLObjectFactory.makeString("<CNC-POPCORN-TIMER ~S of ~S>");
        $sym88$CANDIDATE_NC_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CANDIDATE-NC-ITERATOR-STATE");
        $sym89$CANDIDATE_NC_ITERATOR_STATE_P = SubLObjectFactory.makeSymbol("CANDIDATE-NC-ITERATOR-STATE-P");
        $list90 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RULE-FORT"), (SubLObject)SubLObjectFactory.makeSymbol("MOD-ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD-ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("DONE?"));
        $list91 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RULE-FORT"), (SubLObject)SubLObjectFactory.makeKeyword("MOD-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("HEAD-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("MT"), (SubLObject)SubLObjectFactory.makeKeyword("DONE?"));
        $list92 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNC-STATE-RULE-FORT"), (SubLObject)SubLObjectFactory.makeSymbol("CNC-STATE-MOD-ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("CNC-STATE-HEAD-ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("CNC-STATE-MT"), (SubLObject)SubLObjectFactory.makeSymbol("CNC-STATE-DONE?"));
        $list93 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CNC-STATE-RULE-FORT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CNC-STATE-MOD-ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CNC-STATE-HEAD-ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CNC-STATE-MT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CNC-STATE-DONE?"));
        $sym94$PRINT_CNC_STATE = SubLObjectFactory.makeSymbol("PRINT-CNC-STATE");
        $sym95$CANDIDATE_NC_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("CANDIDATE-NC-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE");
        $list96 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE-NC-ITERATOR-STATE-P"));
        $sym97$CNC_STATE_RULE_FORT = SubLObjectFactory.makeSymbol("CNC-STATE-RULE-FORT");
        $sym98$_CSETF_CNC_STATE_RULE_FORT = SubLObjectFactory.makeSymbol("_CSETF-CNC-STATE-RULE-FORT");
        $sym99$CNC_STATE_MOD_ITERATOR = SubLObjectFactory.makeSymbol("CNC-STATE-MOD-ITERATOR");
        $sym100$_CSETF_CNC_STATE_MOD_ITERATOR = SubLObjectFactory.makeSymbol("_CSETF-CNC-STATE-MOD-ITERATOR");
        $sym101$CNC_STATE_HEAD_ITERATOR = SubLObjectFactory.makeSymbol("CNC-STATE-HEAD-ITERATOR");
        $sym102$_CSETF_CNC_STATE_HEAD_ITERATOR = SubLObjectFactory.makeSymbol("_CSETF-CNC-STATE-HEAD-ITERATOR");
        $sym103$CNC_STATE_MT = SubLObjectFactory.makeSymbol("CNC-STATE-MT");
        $sym104$_CSETF_CNC_STATE_MT = SubLObjectFactory.makeSymbol("_CSETF-CNC-STATE-MT");
        $sym105$CNC_STATE_DONE_ = SubLObjectFactory.makeSymbol("CNC-STATE-DONE?");
        $sym106$_CSETF_CNC_STATE_DONE_ = SubLObjectFactory.makeSymbol("_CSETF-CNC-STATE-DONE?");
        $kw107$RULE_FORT = SubLObjectFactory.makeKeyword("RULE-FORT");
        $kw108$MOD_ITERATOR = SubLObjectFactory.makeKeyword("MOD-ITERATOR");
        $kw109$HEAD_ITERATOR = SubLObjectFactory.makeKeyword("HEAD-ITERATOR");
        $kw110$MT = SubLObjectFactory.makeKeyword("MT");
        $kw111$DONE_ = SubLObjectFactory.makeKeyword("DONE?");
        $sym112$MAKE_CANDIDATE_NC_ITERATOR_STATE = SubLObjectFactory.makeSymbol("MAKE-CANDIDATE-NC-ITERATOR-STATE");
        $sym113$VISIT_DEFSTRUCT_OBJECT_CANDIDATE_NC_ITERATOR_STATE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-CANDIDATE-NC-ITERATOR-STATE-METHOD");
        $str114$_CNC_STATE__S_ = SubLObjectFactory.makeString("<CNC-STATE ~S>");
        $const115$ncRuleConstraint = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ncRuleConstraint"));
        $sym116$CANDIDATE_NC_ITERATOR_DONE_ = SubLObjectFactory.makeSymbol("CANDIDATE-NC-ITERATOR-DONE?");
        $sym117$CANDIDATE_NC_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("CANDIDATE-NC-ITERATOR-NEXT");
        $sym118$CANDIDATE_NC_SUB_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CANDIDATE-NC-SUB-ITERATOR-STATE");
        $sym119$CANDIDATE_NC_SUB_ITERATOR_STATE_P = SubLObjectFactory.makeSymbol("CANDIDATE-NC-SUB-ITERATOR-STATE-P");
        $list120 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("WU-CONSTRAINTS"), SubLObjectFactory.makeSymbol("EQUALS-CONSTRAINTS"), SubLObjectFactory.makeSymbol("GENLS-CONSTRAINTS"), SubLObjectFactory.makeSymbol("ISA-CONSTRAINTS"), SubLObjectFactory.makeSymbol("POS-CONSTRAINTS"), SubLObjectFactory.makeSymbol("POS-PRED-CONSTRAINTS"), SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("PLIST"), SubLObjectFactory.makeSymbol("DONE?") });
        $list121 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("WU-CONSTRAINTS"), SubLObjectFactory.makeKeyword("EQUALS-CONSTRAINTS"), SubLObjectFactory.makeKeyword("GENLS-CONSTRAINTS"), SubLObjectFactory.makeKeyword("ISA-CONSTRAINTS"), SubLObjectFactory.makeKeyword("POS-CONSTRAINTS"), SubLObjectFactory.makeKeyword("POS-PRED-CONSTRAINTS"), SubLObjectFactory.makeKeyword("MT"), SubLObjectFactory.makeKeyword("PLIST"), SubLObjectFactory.makeKeyword("DONE?") });
        $list122 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CNC-SUBSTATE-WU-CONSTRAINTS"), SubLObjectFactory.makeSymbol("CNC-SUBSTATE-EQUALS-CONSTRAINTS"), SubLObjectFactory.makeSymbol("CNC-SUBSTATE-GENLS-CONSTRAINTS"), SubLObjectFactory.makeSymbol("CNC-SUBSTATE-ISA-CONSTRAINTS"), SubLObjectFactory.makeSymbol("CNC-SUBSTATE-POS-CONSTRAINTS"), SubLObjectFactory.makeSymbol("CNC-SUBSTATE-POS-PRED-CONSTRAINTS"), SubLObjectFactory.makeSymbol("CNC-SUBSTATE-MT"), SubLObjectFactory.makeSymbol("CNC-SUBSTATE-PLIST"), SubLObjectFactory.makeSymbol("CNC-SUBSTATE-DONE?") });
        $list123 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-CNC-SUBSTATE-WU-CONSTRAINTS"), SubLObjectFactory.makeSymbol("_CSETF-CNC-SUBSTATE-EQUALS-CONSTRAINTS"), SubLObjectFactory.makeSymbol("_CSETF-CNC-SUBSTATE-GENLS-CONSTRAINTS"), SubLObjectFactory.makeSymbol("_CSETF-CNC-SUBSTATE-ISA-CONSTRAINTS"), SubLObjectFactory.makeSymbol("_CSETF-CNC-SUBSTATE-POS-CONSTRAINTS"), SubLObjectFactory.makeSymbol("_CSETF-CNC-SUBSTATE-POS-PRED-CONSTRAINTS"), SubLObjectFactory.makeSymbol("_CSETF-CNC-SUBSTATE-MT"), SubLObjectFactory.makeSymbol("_CSETF-CNC-SUBSTATE-PLIST"), SubLObjectFactory.makeSymbol("_CSETF-CNC-SUBSTATE-DONE?") });
        $sym124$PRINT_CNC_SUBSTATE = SubLObjectFactory.makeSymbol("PRINT-CNC-SUBSTATE");
        $sym125$CANDIDATE_NC_SUB_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("CANDIDATE-NC-SUB-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE");
        $list126 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE-NC-SUB-ITERATOR-STATE-P"));
        $sym127$CNC_SUBSTATE_WU_CONSTRAINTS = SubLObjectFactory.makeSymbol("CNC-SUBSTATE-WU-CONSTRAINTS");
        $sym128$_CSETF_CNC_SUBSTATE_WU_CONSTRAINTS = SubLObjectFactory.makeSymbol("_CSETF-CNC-SUBSTATE-WU-CONSTRAINTS");
        $sym129$CNC_SUBSTATE_EQUALS_CONSTRAINTS = SubLObjectFactory.makeSymbol("CNC-SUBSTATE-EQUALS-CONSTRAINTS");
        $sym130$_CSETF_CNC_SUBSTATE_EQUALS_CONSTRAINTS = SubLObjectFactory.makeSymbol("_CSETF-CNC-SUBSTATE-EQUALS-CONSTRAINTS");
        $sym131$CNC_SUBSTATE_GENLS_CONSTRAINTS = SubLObjectFactory.makeSymbol("CNC-SUBSTATE-GENLS-CONSTRAINTS");
        $sym132$_CSETF_CNC_SUBSTATE_GENLS_CONSTRAINTS = SubLObjectFactory.makeSymbol("_CSETF-CNC-SUBSTATE-GENLS-CONSTRAINTS");
        $sym133$CNC_SUBSTATE_ISA_CONSTRAINTS = SubLObjectFactory.makeSymbol("CNC-SUBSTATE-ISA-CONSTRAINTS");
        $sym134$_CSETF_CNC_SUBSTATE_ISA_CONSTRAINTS = SubLObjectFactory.makeSymbol("_CSETF-CNC-SUBSTATE-ISA-CONSTRAINTS");
        $sym135$CNC_SUBSTATE_POS_CONSTRAINTS = SubLObjectFactory.makeSymbol("CNC-SUBSTATE-POS-CONSTRAINTS");
        $sym136$_CSETF_CNC_SUBSTATE_POS_CONSTRAINTS = SubLObjectFactory.makeSymbol("_CSETF-CNC-SUBSTATE-POS-CONSTRAINTS");
        $sym137$CNC_SUBSTATE_POS_PRED_CONSTRAINTS = SubLObjectFactory.makeSymbol("CNC-SUBSTATE-POS-PRED-CONSTRAINTS");
        $sym138$_CSETF_CNC_SUBSTATE_POS_PRED_CONSTRAINTS = SubLObjectFactory.makeSymbol("_CSETF-CNC-SUBSTATE-POS-PRED-CONSTRAINTS");
        $sym139$CNC_SUBSTATE_MT = SubLObjectFactory.makeSymbol("CNC-SUBSTATE-MT");
        $sym140$_CSETF_CNC_SUBSTATE_MT = SubLObjectFactory.makeSymbol("_CSETF-CNC-SUBSTATE-MT");
        $sym141$CNC_SUBSTATE_PLIST = SubLObjectFactory.makeSymbol("CNC-SUBSTATE-PLIST");
        $sym142$_CSETF_CNC_SUBSTATE_PLIST = SubLObjectFactory.makeSymbol("_CSETF-CNC-SUBSTATE-PLIST");
        $sym143$CNC_SUBSTATE_DONE_ = SubLObjectFactory.makeSymbol("CNC-SUBSTATE-DONE?");
        $sym144$_CSETF_CNC_SUBSTATE_DONE_ = SubLObjectFactory.makeSymbol("_CSETF-CNC-SUBSTATE-DONE?");
        $kw145$WU_CONSTRAINTS = SubLObjectFactory.makeKeyword("WU-CONSTRAINTS");
        $kw146$EQUALS_CONSTRAINTS = SubLObjectFactory.makeKeyword("EQUALS-CONSTRAINTS");
        $kw147$GENLS_CONSTRAINTS = SubLObjectFactory.makeKeyword("GENLS-CONSTRAINTS");
        $kw148$ISA_CONSTRAINTS = SubLObjectFactory.makeKeyword("ISA-CONSTRAINTS");
        $kw149$POS_CONSTRAINTS = SubLObjectFactory.makeKeyword("POS-CONSTRAINTS");
        $kw150$POS_PRED_CONSTRAINTS = SubLObjectFactory.makeKeyword("POS-PRED-CONSTRAINTS");
        $kw151$PLIST = SubLObjectFactory.makeKeyword("PLIST");
        $sym152$MAKE_CANDIDATE_NC_SUB_ITERATOR_STATE = SubLObjectFactory.makeSymbol("MAKE-CANDIDATE-NC-SUB-ITERATOR-STATE");
        $sym153$VISIT_DEFSTRUCT_OBJECT_CANDIDATE_NC_SUB_ITERATOR_STATE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-CANDIDATE-NC-SUB-ITERATOR-STATE-METHOD");
        $str154$_CNC_SUBSTATE_ = SubLObjectFactory.makeString("<CNC-SUBSTATE>");
        $sym155$CNC_MOD_ITERATOR_DONE_ = SubLObjectFactory.makeSymbol("CNC-MOD-ITERATOR-DONE?");
        $sym156$CNC_MOD_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("CNC-MOD-ITERATOR-NEXT");
        $sym157$CNC_HEAD_ITERATOR_DONE_ = SubLObjectFactory.makeSymbol("CNC-HEAD-ITERATOR-DONE?");
        $sym158$CNC_HEAD_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("CNC-HEAD-ITERATOR-NEXT");
        $str159$Don_t_know_how_to_get__S_pair_fro = SubLObjectFactory.makeString("Don't know how to get ~S pair from ~S yet.");
        $str160$_CNC_RULE_FORT__is_a_non_FORT___S = SubLObjectFactory.makeString("*CNC-RULE-FORT* is a non-FORT: ~S");
        $kw161$QUERY_PAIRS = SubLObjectFactory.makeKeyword("QUERY-PAIRS");
        $list162 = ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular-Masculine")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular-Neuter")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular-Feminine")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("agentive-Sg")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("gerund-Singular")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("massNumber")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("agentive-Mass")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("gerund")) });
        $kw163$NO_DENOT = SubLObjectFactory.makeKeyword("NO-DENOT");
        $str164$More_than_one_equals_constraint__ = SubLObjectFactory.makeString("More than one equals constraint!~% ~S");
        $str165$Couldn_t_find_string_for__S_match = SubLObjectFactory.makeString("Couldn't find string for ~S matching ~S and ~S");
        $kw166$CHEAPEST_CONSTRAINT = SubLObjectFactory.makeKeyword("CHEAPEST-CONSTRAINT");
        $kw167$CHEAPEST_CONSTRAINT_MATCHES = SubLObjectFactory.makeKeyword("CHEAPEST-CONSTRAINT-MATCHES");
        $str168$_S_tries___ = SubLObjectFactory.makeString("~S tries...");
        $str169$Couldn_t_find_a_string_denot_pair = SubLObjectFactory.makeString("Couldn't find a string-denot pair for ~S after ~S tries.");
        $kw170$GENLS = SubLObjectFactory.makeKeyword("GENLS");
        $list171 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nameString")));
        $list172 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nounStrings")));
        $list173 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-GENERATION-CACHE-METHOD"));
        $kw174$RANDOM = SubLObjectFactory.makeKeyword("RANDOM");
        $int175$30 = SubLObjectFactory.makeInteger(30);
        $const176$Adjective = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Adjective"));
        $list177 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(" "));
        $const178$NounCompoundRule = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NounCompoundRule"));
        $str179$_S__ = SubLObjectFactory.makeString("~S~%");
        $str180$Started_scoring__S_at__S_____ = SubLObjectFactory.makeString("Started scoring ~S at ~S...~%");
        $kw181$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw182$RUN_AGAINST = SubLObjectFactory.makeKeyword("RUN-AGAINST");
        $kw183$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym184$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $sym185$YAHOO_COUNT = SubLObjectFactory.makeSymbol("YAHOO-COUNT");
        $kw186$HIT_COUNT = SubLObjectFactory.makeKeyword("HIT-COUNT");
        $kw187$TIMESTAMP = SubLObjectFactory.makeKeyword("TIMESTAMP");
        $kw188$IMAGE_INDEPENDENT_CFASL = SubLObjectFactory.makeKeyword("IMAGE-INDEPENDENT-CFASL");
        $sym189$CNC_GET_ENGINE = SubLObjectFactory.makeSymbol("CNC-GET-ENGINE");
        $kw190$ENGINE = SubLObjectFactory.makeKeyword("ENGINE");
        $kw191$ITERATOR_TEST5 = SubLObjectFactory.makeKeyword("ITERATOR-TEST5");
        $sym192$STRING_HITS_KNOWN_ = SubLObjectFactory.makeSymbol("STRING-HITS-KNOWN?");
        $sym193$NULL = SubLObjectFactory.makeSymbol("NULL");
        $kw194$GOOGLE = SubLObjectFactory.makeKeyword("GOOGLE");
        $sym195$GOOGLE_COUNT = SubLObjectFactory.makeSymbol("GOOGLE-COUNT");
        $str196$Searched__A_for___S___Number_of_h = SubLObjectFactory.makeString("Searched ~A for: ~S~% Number of hits: ~S~%  Running query total is: ~S~%");
        $str197$_cyc_top_data_nl_cnc_tests_bkup_f = SubLObjectFactory.makeString("/cyc/top/data/nl/cnc-tests/bkup-files/bkup-for-cnc-string-hits-data-");
        $str198$_cyc_top_data_nl_cnc_tests_bkup_f = SubLObjectFactory.makeString("/cyc/top/data/nl/cnc-tests/bkup-files/bkup-for-scored-cnc-test-data-");
        $str199$_cyc_top_data_nl_cnc_tests_bkup_f = SubLObjectFactory.makeString("/cyc/top/data/nl/cnc-tests/bkup-files/bkup-for-unscored-cnc-test-data-");
        $str200$_lisp = SubLObjectFactory.makeString(".lisp");
        $kw201$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $str202$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $str203$_S = SubLObjectFactory.makeString("~S");
        $sym204$_ = SubLObjectFactory.makeSymbol("+");
    }
    
    public static final class $candidate_nc_popcorn_timer_native extends SubLStructNative
    {
        public SubLObject $window;
        public SubLObject $minimum;
        public SubLObject $index;
        public SubLObject $recent_failure_count;
        public SubLObject $history;
        private static final SubLStructDeclNative structDecl;
        
        public $candidate_nc_popcorn_timer_native() {
            this.$window = (SubLObject)CommonSymbols.NIL;
            this.$minimum = (SubLObject)CommonSymbols.NIL;
            this.$index = (SubLObject)CommonSymbols.NIL;
            this.$recent_failure_count = (SubLObject)CommonSymbols.NIL;
            this.$history = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$candidate_nc_popcorn_timer_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$window;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$minimum;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$index;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$recent_failure_count;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$history;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$window = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$minimum = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$index = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$recent_failure_count = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$history = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$candidate_nc_popcorn_timer_native.class, candidate_nc_utilities.$sym57$CANDIDATE_NC_POPCORN_TIMER, candidate_nc_utilities.$sym58$CANDIDATE_NC_POPCORN_TIMER_P, candidate_nc_utilities.$list59, candidate_nc_utilities.$list60, new String[] { "$window", "$minimum", "$index", "$recent_failure_count", "$history" }, candidate_nc_utilities.$list61, candidate_nc_utilities.$list62, candidate_nc_utilities.$sym63$PRINT_CNC_POPCORN_TIMER);
        }
    }
    
    public static final class $candidate_nc_popcorn_timer_p$UnaryFunction extends UnaryFunction
    {
        public $candidate_nc_popcorn_timer_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CANDIDATE-NC-POPCORN-TIMER-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return candidate_nc_utilities.candidate_nc_popcorn_timer_p(arg1);
        }
    }
    
    public static final class $candidate_nc_iterator_state_native extends SubLStructNative
    {
        public SubLObject $rule_fort;
        public SubLObject $mod_iterator;
        public SubLObject $head_iterator;
        public SubLObject $mt;
        public SubLObject $doneP;
        private static final SubLStructDeclNative structDecl;
        
        public $candidate_nc_iterator_state_native() {
            this.$rule_fort = (SubLObject)CommonSymbols.NIL;
            this.$mod_iterator = (SubLObject)CommonSymbols.NIL;
            this.$head_iterator = (SubLObject)CommonSymbols.NIL;
            this.$mt = (SubLObject)CommonSymbols.NIL;
            this.$doneP = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$candidate_nc_iterator_state_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$rule_fort;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$mod_iterator;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$head_iterator;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$mt;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$doneP;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$rule_fort = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$mod_iterator = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$head_iterator = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$mt = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$doneP = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$candidate_nc_iterator_state_native.class, candidate_nc_utilities.$sym88$CANDIDATE_NC_ITERATOR_STATE, candidate_nc_utilities.$sym89$CANDIDATE_NC_ITERATOR_STATE_P, candidate_nc_utilities.$list90, candidate_nc_utilities.$list91, new String[] { "$rule_fort", "$mod_iterator", "$head_iterator", "$mt", "$doneP" }, candidate_nc_utilities.$list92, candidate_nc_utilities.$list93, candidate_nc_utilities.$sym94$PRINT_CNC_STATE);
        }
    }
    
    public static final class $candidate_nc_iterator_state_p$UnaryFunction extends UnaryFunction
    {
        public $candidate_nc_iterator_state_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CANDIDATE-NC-ITERATOR-STATE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return candidate_nc_utilities.candidate_nc_iterator_state_p(arg1);
        }
    }
    
    public static final class $candidate_nc_sub_iterator_state_native extends SubLStructNative
    {
        public SubLObject $wu_constraints;
        public SubLObject $equals_constraints;
        public SubLObject $genls_constraints;
        public SubLObject $isa_constraints;
        public SubLObject $pos_constraints;
        public SubLObject $pos_pred_constraints;
        public SubLObject $mt;
        public SubLObject $plist;
        public SubLObject $doneP;
        private static final SubLStructDeclNative structDecl;
        
        public $candidate_nc_sub_iterator_state_native() {
            this.$wu_constraints = (SubLObject)CommonSymbols.NIL;
            this.$equals_constraints = (SubLObject)CommonSymbols.NIL;
            this.$genls_constraints = (SubLObject)CommonSymbols.NIL;
            this.$isa_constraints = (SubLObject)CommonSymbols.NIL;
            this.$pos_constraints = (SubLObject)CommonSymbols.NIL;
            this.$pos_pred_constraints = (SubLObject)CommonSymbols.NIL;
            this.$mt = (SubLObject)CommonSymbols.NIL;
            this.$plist = (SubLObject)CommonSymbols.NIL;
            this.$doneP = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$candidate_nc_sub_iterator_state_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$wu_constraints;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$equals_constraints;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$genls_constraints;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$isa_constraints;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$pos_constraints;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$pos_pred_constraints;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$mt;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$plist;
        }
        
        @Override
		public SubLObject getField10() {
            return this.$doneP;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$wu_constraints = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$equals_constraints = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$genls_constraints = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$isa_constraints = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$pos_constraints = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$pos_pred_constraints = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$mt = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$plist = value;
        }
        
        @Override
		public SubLObject setField10(final SubLObject value) {
            return this.$doneP = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$candidate_nc_sub_iterator_state_native.class, candidate_nc_utilities.$sym118$CANDIDATE_NC_SUB_ITERATOR_STATE, candidate_nc_utilities.$sym119$CANDIDATE_NC_SUB_ITERATOR_STATE_P, candidate_nc_utilities.$list120, candidate_nc_utilities.$list121, new String[] { "$wu_constraints", "$equals_constraints", "$genls_constraints", "$isa_constraints", "$pos_constraints", "$pos_pred_constraints", "$mt", "$plist", "$doneP" }, candidate_nc_utilities.$list122, candidate_nc_utilities.$list123, candidate_nc_utilities.$sym124$PRINT_CNC_SUBSTATE);
        }
    }
    
    public static final class $candidate_nc_sub_iterator_state_p$UnaryFunction extends UnaryFunction
    {
        public $candidate_nc_sub_iterator_state_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CANDIDATE-NC-SUB-ITERATOR-STATE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return candidate_nc_utilities.candidate_nc_sub_iterator_state_p(arg1);
        }
    }
}

/*

	Total time: 733 ms
	
*/