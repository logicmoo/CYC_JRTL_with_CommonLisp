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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class noun_compound_parser extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.noun_compound_parser";
    public static final String myFingerPrint = "070f6291c6f1161e0e5581a3d88613b8a5f508692970b6e43e04b2ac9e70b6e8";
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 2095L)
    public static SubLSymbol $dtp_noun_compound_parse$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 2451L)
    private static SubLSymbol $nc_parse_id_counter$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 3154L)
    private static SubLSymbol $rbp_report_parse_timeP$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 3325L)
    public static SubLSymbol $rbp_shadow_rulesP$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 3472L)
    public static SubLSymbol $rbp_rules_to_parses_shadow$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 3620L)
    public static SubLSymbol $rbp_return_confidenceP$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 6220L)
    private static SubLSymbol $rbp_show_successful_rulesP$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 6505L)
    private static SubLSymbol $rbp_traced_rules$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
    public static SubLSymbol $dtp_noun_compound_block$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 9766L)
    private static SubLSymbol $rbp_default_confidence_multiplier_for_failing_a_filter$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 10481L)
    private static SubLSymbol $nc_block_unique_id_counter$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 18052L)
    private static SubLSymbol $rbp_universal_boolean_filters$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 22239L)
    private static SubLSymbol $rbp_deverbal_boolean_filters$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 22516L)
    private static SubLSymbol $rbp_deverbal_macroscopic_filters$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 22751L)
    private static SubLSymbol $rbp_deverbal_macroscopic_block_filters$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 26308L)
    private static SubLSymbol $rbp_input_strings$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 26510L)
    public static SubLSymbol $nominal_interpretations_only$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 26756L)
    public static SubLSymbol $rbp_minimum_component_count$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 26867L)
    public static SubLSymbol $rbp_maximum_component_count$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 31234L)
    private static SubLSymbol $ncp_problem_store$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 33617L)
    private static SubLSymbol $rbp_sort_blocks_confidence_firstP$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 37217L)
    private static SubLSymbol $rbp_reliability_high$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 37404L)
    private static SubLSymbol $rbp_reliability_medium$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 37454L)
    private static SubLSymbol $rbp_reliability_low$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 48184L)
    private static SubLSymbol $rbp_chart_filterP$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 52391L)
    private static SubLSymbol $rbp_name_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 53376L)
    private static SubLSymbol $rbp_floors_cached_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 53513L)
    private static SubLSymbol $rbp_ok_name_cachedP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 61707L)
    private static SubLSymbol $rbp_use_inter_arg_isa_filtersP$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 61836L)
    private static SubLSymbol $rbp_use_inter_arg_not_isa_filtersP$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 73715L)
    public static SubLSymbol $rbp_rb_closed_class_filter_keys$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 74590L)
    private static SubLSymbol $rbp_rb_rules_matching_closed_specs_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 78447L)
    private static SubLSymbol $inter_constraints_from_rule_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 95061L)
    public static SubLSymbol $rbp_high_date_confidence$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 95061L)
    public static SubLSymbol $rbp_low_date_confidence$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 95061L)
    public static SubLSymbol $rbp_date_fallback_identifier$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 95061L)
    public static SubLSymbol $rbp_date_fallback_test$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 95061L)
    public static SubLSymbol $dtp_date_parse_block$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 104794L)
    private static SubLSymbol $rbp_rae_max_time$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 115958L)
    private static SubLSymbol $rbp_unlikely_subcollection_nautP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 120004L)
    private static SubLSymbol $ncs_formats$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 120004L)
    private static SubLSymbol $ncs_deverbals_onlyP$;
    private static final SubLSymbol $sym0$ADD_NC_RULE_CONSTRAINT;
    private static final SubLSymbol $sym1$REMOVE_NC_RULE_CONSTRAINT;
    private static final SubLSymbol $sym2$ADD_NC_RULE_TEMPLATE;
    private static final SubLSymbol $sym3$REMOVE_NC_RULE_TEMPLATE;
    private static final SubLSymbol $sym4$NOUN_COMPOUND_PARSE;
    private static final SubLSymbol $sym5$NOUN_COMPOUND_PARSE_P;
    private static final SubLList $list6;
    private static final SubLList $list7;
    private static final SubLList $list8;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$PPRINT_NC_PARSE;
    private static final SubLSymbol $sym11$NOUN_COMPOUND_PARSE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list12;
    private static final SubLSymbol $sym13$NC_PARSE_UNIQUE_ID;
    private static final SubLSymbol $sym14$_CSETF_NC_PARSE_UNIQUE_ID;
    private static final SubLSymbol $sym15$NC_PARSE_INPUT_STRING;
    private static final SubLSymbol $sym16$_CSETF_NC_PARSE_INPUT_STRING;
    private static final SubLSymbol $sym17$NC_PARSE_INPUT_STRINGS;
    private static final SubLSymbol $sym18$_CSETF_NC_PARSE_INPUT_STRINGS;
    private static final SubLSymbol $sym19$NC_PARSE_CHART;
    private static final SubLSymbol $sym20$_CSETF_NC_PARSE_CHART;
    private static final SubLSymbol $kw21$UNIQUE_ID;
    private static final SubLSymbol $kw22$INPUT_STRING;
    private static final SubLSymbol $kw23$INPUT_STRINGS;
    private static final SubLSymbol $kw24$CHART;
    private static final SubLString $str25$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw26$BEGIN;
    private static final SubLSymbol $sym27$MAKE_NOUN_COMPOUND_PARSE;
    private static final SubLSymbol $kw28$SLOT;
    private static final SubLSymbol $kw29$END;
    private static final SubLSymbol $sym30$VISIT_DEFSTRUCT_OBJECT_NOUN_COMPOUND_PARSE_METHOD;
    private static final SubLSymbol $sym31$_NC_PARSE_ID_COUNTER_;
    private static final SubLString $str32$____NC_PARSE__ID___S__;
    private static final SubLString $str33$__Input_string___S__;
    private static final SubLString $str34$_Input_strings___S__;
    private static final SubLString $str35$_________Chart___S__;
    private static final SubLSymbol $sym36$CLET;
    private static final SubLList $list37;
    private static final SubLSymbol $sym38$RBP_RULE_CYCL;
    private static final SubLSymbol $sym39$NOUN_COMPOUND_BLOCK;
    private static final SubLSymbol $sym40$NOUN_COMPOUND_BLOCK_P;
    private static final SubLList $list41;
    private static final SubLList $list42;
    private static final SubLList $list43;
    private static final SubLList $list44;
    private static final SubLSymbol $sym45$PPRINT_NC_BLOCK;
    private static final SubLSymbol $sym46$NOUN_COMPOUND_BLOCK_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list47;
    private static final SubLSymbol $sym48$NC_BLOCK_UNIQUE_ID;
    private static final SubLSymbol $sym49$_CSETF_NC_BLOCK_UNIQUE_ID;
    private static final SubLSymbol $sym50$NC_BLOCK_SPAN_INDEX;
    private static final SubLSymbol $sym51$_CSETF_NC_BLOCK_SPAN_INDEX;
    private static final SubLSymbol $sym52$NC_BLOCK_CONFIDENCE;
    private static final SubLSymbol $sym53$_CSETF_NC_BLOCK_CONFIDENCE;
    private static final SubLSymbol $sym54$NC_BLOCK_DENOT;
    private static final SubLSymbol $sym55$_CSETF_NC_BLOCK_DENOT;
    private static final SubLSymbol $sym56$NC_BLOCK_FILTERS;
    private static final SubLSymbol $sym57$_CSETF_NC_BLOCK_FILTERS;
    private static final SubLSymbol $sym58$NC_BLOCK_SPANNED_STRING;
    private static final SubLSymbol $sym59$_CSETF_NC_BLOCK_SPANNED_STRING;
    private static final SubLSymbol $sym60$NC_BLOCK_HEAD;
    private static final SubLSymbol $sym61$_CSETF_NC_BLOCK_HEAD;
    private static final SubLSymbol $sym62$NC_BLOCK_HEAD_POS;
    private static final SubLSymbol $sym63$_CSETF_NC_BLOCK_HEAD_POS;
    private static final SubLSymbol $sym64$NC_BLOCK_HEAD_STRING_PRED;
    private static final SubLSymbol $sym65$_CSETF_NC_BLOCK_HEAD_STRING_PRED;
    private static final SubLSymbol $sym66$NC_BLOCK_SUB_TREE;
    private static final SubLSymbol $sym67$_CSETF_NC_BLOCK_SUB_TREE;
    private static final SubLSymbol $sym68$NC_BLOCK_PLIST;
    private static final SubLSymbol $sym69$_CSETF_NC_BLOCK_PLIST;
    private static final SubLSymbol $kw70$SPAN_INDEX;
    private static final SubLSymbol $kw71$CONFIDENCE;
    private static final SubLSymbol $kw72$DENOT;
    private static final SubLSymbol $kw73$FILTERS;
    private static final SubLSymbol $kw74$SPANNED_STRING;
    private static final SubLSymbol $kw75$HEAD;
    private static final SubLSymbol $kw76$HEAD_POS;
    private static final SubLSymbol $kw77$HEAD_STRING_PRED;
    private static final SubLSymbol $kw78$SUB_TREE;
    private static final SubLSymbol $kw79$PLIST;
    private static final SubLSymbol $sym80$MAKE_NOUN_COMPOUND_BLOCK;
    private static final SubLSymbol $sym81$VISIT_DEFSTRUCT_OBJECT_NOUN_COMPOUND_BLOCK_METHOD;
    private static final SubLSymbol $kw82$WU;
    private static final SubLFloat $float83$0_5;
    private static final SubLString $str84$__NCB__S___S__S_;
    private static final SubLSymbol $sym85$_NC_BLOCK_UNIQUE_ID_COUNTER_;
    private static final SubLSymbol $sym86$COMBINE_NOUN_COMPOUND_BLOCKS;
    private static final SubLList $list87;
    private static final SubLString $str88$_;
    private static final SubLFloat $float89$1_1;
    private static final SubLList $list90;
    private static final SubLObject $const91$Adjective;
    private static final SubLList $list92;
    private static final SubLList $list93;
    private static final SubLList $list94;
    private static final SubLList $list95;
    private static final SubLSymbol $sym96$POSITIVE_INTEGER_P;
    private static final SubLSymbol $kw97$NONE;
    private static final SubLSymbol $kw98$SKIP;
    private static final SubLSymbol $kw99$BOOLEAN;
    private static final SubLList $list100;
    private static final SubLString $str101$Abandoning_parse__S_for__S;
    private static final SubLList $list102;
    private static final SubLList $list103;
    private static final SubLSymbol $sym104$PROGN;
    private static final SubLList $list105;
    private static final SubLSymbol $sym106$NCP_HERALD_START;
    private static final SubLList $list107;
    private static final SubLSymbol $sym108$CTIME;
    private static final SubLSymbol $sym109$TIME;
    private static final SubLList $list110;
    private static final SubLInteger $int111$1000;
    private static final SubLSymbol $sym112$LISTP;
    private static final SubLSymbol $sym113$NON_DOTTED_LIST_P;
    private static final SubLSymbol $sym114$RBP_RULE_FORT_P;
    private static final SubLSymbol $sym115$RBP_FIND_RULE_FROM_CYCL;
    private static final SubLObject $const116$NounCompoundRule;
    private static final SubLSymbol $sym117$STORE;
    private static final SubLSymbol $sym118$WITH_NEW_PROBLEM_STORE;
    private static final SubLSymbol $sym119$_NCP_PROBLEM_STORE_;
    private static final SubLString $str120$__Total_parse_time___4_2F_seconds;
    private static final SubLString $str121$__Spent__4_2F_seconds_actually_pa;
    private static final SubLString $str122$__Now_parsing__S___;
    private static final SubLSymbol $sym123$NPP_TERM_COMPLEXITY__;
    private static final SubLSymbol $sym124$_;
    private static final SubLString $str125$___S_didn_t_use_the_required_rule;
    private static final SubLString $str126$___S_was_too_long_or_too_short___;
    private static final SubLString $str127$__The__S_form_of____S___is_being_;
    private static final SubLSymbol $kw128$MACROSCOPIC;
    private static final SubLFloat $float129$1_05;
    private static final SubLFloat $float130$0_95;
    private static final SubLObject $const131$Noun;
    private static final SubLSymbol $sym132$LEXIFICATION_SENTENCE_FROM_PREFERRED_LEXIFICATION_ASSERTION;
    private static final SubLObject $const133$SubcollectionRelationFunction_Typ;
    private static final SubLSymbol $sym134$NPP_GENL_;
    private static final SubLSymbol $sym135$NPP_ISA_;
    private static final SubLSymbol $sym136$SUBCOLLECTION_FUNCTION_NAUT_PRED;
    private static final SubLObject $const137$relationAllExists;
    private static final SubLSymbol $kw138$GAF;
    private static final SubLString $str139$Strengthening__S_to_use__S;
    private static final SubLObject $const140$rewriteOf;
    private static final SubLList $list141;
    private static final SubLObject $const142$CityNamedFn;
    private static final SubLObject $const143$State_Geopolitical;
    private static final SubLObject $const144$cityInState;
    private static final SubLObject $const145$nameString;
    private static final SubLSymbol $sym146$STRING_;
    private static final SubLObject $const147$Country;
    private static final SubLObject $const148$countryOfCity;
    private static final SubLObject $const149$NounPhrase;
    private static final SubLSymbol $kw150$ORIGINAL_STRING;
    private static final SubLObject $const151$gerund;
    private static final SubLSymbol $sym152$RBP_PARSE_AND_CONFIDENCE_;
    private static final SubLSymbol $sym153$NPP_PARSE_;
    private static final SubLSymbol $sym154$RBP_PARSE_AND_CONFIDENCE_;
    private static final SubLSymbol $kw155$QUADS;
    private static final SubLSymbol $kw156$TRIPLES;
    private static final SubLInteger $int157$256;
    private static final SubLObject $const158$Verb;
    private static final SubLObject $const159$perfect;
    private static final SubLSymbol $sym160$INTERVAL_TOKEN_LENGTH;
    private static final SubLSymbol $sym161$RBP_FLOORS_CACHED;
    private static final SubLSymbol $sym162$_RBP_FLOORS_CACHED_CACHING_STATE_;
    private static final SubLInteger $int163$512;
    private static final SubLInteger $int164$128;
    private static final SubLSymbol $sym165$RBP_OK_NAME_CACHED_;
    private static final SubLString $str166$the_;
    private static final SubLObject $const167$abbreviationString_PN;
    private static final SubLObject $const168$acronymString;
    private static final SubLSymbol $sym169$_RBP_OK_NAME_CACHED__CACHING_STATE_;
    private static final SubLObject $const170$atomicSymbol;
    private static final SubLObject $const171$ProperNoun;
    private static final SubLSymbol $sym172$RBP_NAME_BLOCK_;
    private static final SubLSymbol $sym173$RBP_NAME_BLOCK_PRED_AMONG_FLOORS_;
    private static final SubLSymbol $sym174$INTERVAL_SPAN_PRECEDES_;
    private static final SubLSymbol $sym175$FIRST;
    private static final SubLList $list176;
    private static final SubLString $str177$_S__;
    private static final SubLObject $const178$ncRuleTemplate;
    private static final SubLObject $const179$ncRuleTemplate_Compact;
    private static final SubLSymbol $kw180$TRUE;
    private static final SubLList $list181;
    private static final SubLSymbol $sym182$INDEXICAL2;
    private static final SubLSymbol $sym183$BIN_PRED;
    private static final SubLSymbol $sym184$INDEXICAL1;
    private static final SubLSymbol $sym185$FN;
    private static final SubLSymbol $sym186$RBP_SEMANTIC_CONSTRAINT_P;
    private static final SubLSymbol $sym187$RBP_WORD_UNIT_CONSTRAINT_P;
    private static final SubLObject $const188$typeLevelCognates;
    private static final SubLObject $const189$BaseKB;
    private static final SubLList $list190;
    private static final SubLObject $const191$SubcollectionRelationFunction_Ins;
    private static final SubLSymbol $kw192$PROBLEM_STORE;
    private static final SubLSymbol $kw193$MAX_TRANSFORMATION_DEPTH;
    private static final SubLSymbol $kw194$ISA;
    private static final SubLObject $const195$geopoliticalSubdivision;
    private static final SubLSymbol $kw196$NOT_ISA;
    private static final SubLSymbol $sym197$_COL;
    private static final SubLObject $const198$interArgNotIsa;
    private static final SubLList $list199;
    private static final SubLObject $const200$interArgIsa;
    private static final SubLString $str201$____but__A_has_to_be_an_instance_;
    private static final SubLString $str202$____but__A_has_to_intersect__A_in;
    private static final SubLString $str203$____but__A_can_t_be_an_instance_o;
    private static final SubLString $str204$____but__A_can_t_be_a_spec_of__A_;
    private static final SubLString $str205$interArgIsa_D__D;
    private static final SubLString $str206$Couldn_t_find_inter_arg_isa_predi;
    private static final SubLString $str207$interArgNotIsa_D__D;
    private static final SubLString $str208$Couldn_t_find_inter_arg_not_isa_p;
    private static final SubLList $list209;
    private static final SubLObject $const210$interArgIsa1_2;
    private static final SubLString $str211$___but_it_fails_the_inter_arg_con;
    private static final SubLObject $const212$interArgIsa2_1;
    private static final SubLObject $const213$interArgNotIsa1_2;
    private static final SubLList $list214;
    private static final SubLObject $const215$SubcollectionRelationFunction_Can;
    private static final SubLObject $const216$UniversalVocabularyMt;
    private static final SubLString $str217$_A__;
    private static final SubLObject $const218$groupMembers;
    private static final SubLObject $const219$GroupFn;
    private static final SubLObject $const220$GroupOfCardinalityFn;
    private static final SubLString $str221$___but_it_failed_the_groupMembers;
    private static final SubLObject $const222$Predicate;
    private static final SubLString $str223$___but_the___CityNamedFn_arg2_doe;
    private static final SubLObject $const224$StrictlyFunctionalSlot;
    private static final SubLSymbol $sym225$RELEVANT_PRED_IS_SPEC_PRED;
    private static final SubLString $str226$___but_it_failed_the_strictly_fun;
    private static final SubLSymbol $sym227$RELEVANT_PRED_IS_SPEC_INVERSE;
    private static final SubLString $str228$__Trying_this_block_pair_____S___;
    private static final SubLString $str229$__Rule__S_yielded____a___for__S__;
    private static final SubLSymbol $kw230$WFF;
    private static final SubLString $str231$___but_it_failed_the_wff_checker_;
    private static final SubLObject $const232$FormulaArgFn;
    private static final SubLList $list233;
    private static final SubLString $str234$___but_the_desired_FormulaArgFn__;
    private static final SubLSymbol $kw235$NOT_WFF;
    private static final SubLSymbol $kw236$NON_WFF;
    private static final SubLString $str237$___but_I_was_unable_to_verify__S_;
    private static final SubLSymbol $kw238$MODIFIER;
    private static final SubLList $list239;
    private static final SubLList $list240;
    private static final SubLSymbol $sym241$RBP_RB_RULES_MATCHING_CLOSED_SPECS;
    private static final SubLSymbol $kw242$ALL;
    private static final SubLSymbol $sym243$_RBP_RB_RULES_MATCHING_CLOSED_SPECS_CACHING_STATE_;
    private static final SubLSymbol $kw244$OPEN_CLASS;
    private static final SubLSymbol $sym245$RBP_VERIFY;
    private static final SubLSymbol $sym246$RBP_RB_INITIAL_SEARCH_NO_TRACING;
    private static final SubLSymbol $kw247$SYNTACTIC;
    private static final SubLSymbol $kw248$SEMANTIC;
    private static final SubLSymbol $kw249$CLOSED_CLASS;
    private static final SubLString $str250$__The_blocks_failed_an_inter_cons;
    private static final SubLSymbol $sym251$INTER_CONSTRAINTS_FROM_RULE;
    private static final SubLSymbol $sym252$_INTER_CONSTRAINTS_FROM_RULE_CACHING_STATE_;
    private static final SubLList $list253;
    private static final SubLList $list254;
    private static final SubLSymbol $kw255$NO_DENOT;
    private static final SubLSymbol $kw256$isa;
    private static final SubLSymbol $kw257$genl;
    private static final SubLSymbol $kw258$GENL;
    private static final SubLString $str259$__Semantics_are__S_and__S___in_te;
    private static final SubLSymbol $kw260$pred;
    private static final SubLSymbol $kw261$PRED;
    private static final SubLSymbol $sym262$NPP_GENL_PRED_;
    private static final SubLSymbol $kw263$pos;
    private static final SubLSymbol $kw264$POS;
    private static final SubLSymbol $kw265$eql;
    private static final SubLSymbol $kw266$EQL;
    private static final SubLSymbol $kw267$TYPE_GENL;
    private static final SubLSymbol $sym268$NPP_TYPE_GENL_;
    private static final SubLSymbol $sym269$NC_BLOCK_WU;
    private static final SubLSymbol $sym270$RELEVANT_MT_IS_GENL_MT;
    private static final SubLString $str271$ing;
    private static final SubLObject $const272$infinitive;
    private static final SubLString $str273$ion;
    private static final SubLObject $const274$agentive_Sg;
    private static final SubLObject $const275$singular;
    private static final SubLString $str276$ment;
    private static final SubLObject $const277$nounStrings;
    private static final SubLObject $const278$massNumber;
    private static final SubLSymbol $sym279$STRINGP;
    private static final SubLList $list280;
    private static final SubLFloat $float281$0_75;
    private static final SubLFloat $float282$0_25;
    private static final SubLSymbol $kw283$DATE_FALLBACK;
    private static final SubLSymbol $sym284$DATE_PARSE_BLOCK;
    private static final SubLSymbol $sym285$DATE_PARSE_BLOCK_P;
    private static final SubLList $list286;
    private static final SubLList $list287;
    private static final SubLList $list288;
    private static final SubLList $list289;
    private static final SubLSymbol $sym290$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym291$DATE_PARSE_BLOCK_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list292;
    private static final SubLSymbol $sym293$DATE_PARSE_BLOCK_SUBCOL_NAUT;
    private static final SubLSymbol $sym294$_CSETF_DATE_PARSE_BLOCK_SUBCOL_NAUT;
    private static final SubLSymbol $sym295$DATE_PARSE_BLOCK_CONFIDENCE;
    private static final SubLSymbol $sym296$_CSETF_DATE_PARSE_BLOCK_CONFIDENCE;
    private static final SubLSymbol $kw297$SUBCOL_NAUT;
    private static final SubLSymbol $sym298$MAKE_DATE_PARSE_BLOCK;
    private static final SubLSymbol $sym299$VISIT_DEFSTRUCT_OBJECT_DATE_PARSE_BLOCK_METHOD;
    private static final SubLObject $const300$dateOfEvent;
    private static final SubLObject $const301$SubcollectionOfWithRelationToFn;
    private static final SubLObject $const302$YearFn;
    private static final SubLSymbol $sym303$EL_VARIABLE_P;
    private static final SubLObject $const304$Event;
    private static final SubLList $list305;
    private static final SubLSymbol $sym306$_EVENT;
    private static final SubLObject $const307$and;
    private static final SubLObject $const308$isa;
    private static final SubLString $str309$_____todo_handle_dates_with_multi;
    private static final SubLSymbol $sym310$DATE_PARSE_COMPLEXITY__;
    private static final SubLObject $const311$doneBy;
    private static final SubLObject $const312$Action;
    private static final SubLObject $const313$Agent_Generic;
    private static final SubLString $str314$rbp_parse_filter_nonagentive_acto;
    private static final SubLSymbol $kw315$FROM;
    private static final SubLSymbol $kw316$TO;
    private static final SubLSymbol $sym317$RBP_ALL_EXISTS_MATCHES;
    private static final SubLObject $const318$InferencePSC;
    private static final SubLSymbol $kw319$MAX_NUMBER;
    private static final SubLSymbol $kw320$MAX_TIME;
    private static final SubLSymbol $kw321$RETURN;
    private static final SubLSymbol $kw322$TEMPLATE;
    private static final SubLSymbol $sym323$_TYPE;
    private static final SubLString $str324$Timed_out_checking___relationAllE;
    private static final SubLObject $const325$SymmetricBinaryPredicate;
    private static final SubLObject $const326$equals;
    private static final SubLObject $const327$genls;
    private static final SubLObject $const328$relationAllInstance;
    private static final SubLList $list329;
    private static final SubLObject $const330$relationInstanceExists;
    private static final SubLObject $const331$relationExistsAll;
    private static final SubLObject $const332$relationExistsInstance;
    private static final SubLString $str333$rbp_parse_prefer_rmp_matches_had_;
    private static final SubLObject $const334$expansion;
    private static final SubLObject $const335$intersectionType;
    private static final SubLObject $const336$SubcollectionRelationFunction;
    private static final SubLSymbol $kw337$ARG1;
    private static final SubLSymbol $kw338$ARG2;
    private static final SubLObject $const339$CollectionIntersection2Fn;
    private static final SubLString $str340$doesn_t_match___relationAllExists;
    private static final SubLObject $const341$instrumentType_Generic;
    private static final SubLObject $const342$ObjectWithUse;
    private static final SubLString $str343$rbp_parse_filter_unlikely_instrum;
    private static final SubLString $str344$rbp_parse_filter_unlikely_instrum;
    private static final SubLString $str345$rbp_parse_filter_subcollection_ar;
    private static final SubLSymbol $kw346$OBJ;
    private static final SubLString $str347$statistically_unlikely_object;
    private static final SubLSymbol $sym348$RBP_UNLIKELY_SUBCOLLECTION_NAUT_;
    private static final SubLSymbol $sym349$_RBP_UNLIKELY_SUBCOLLECTION_NAUT__CACHING_STATE_;
    private static final SubLInteger $int350$64;
    private static final SubLList $list351;
    private static final SubLObject $const352$adjStrings;
    private static final SubLSymbol $sym353$PARSE_AS_DENOT_OR_NOUN_COMPOUND;
    private static final SubLSymbol $sym354$PARSE_DEVERBAL_COMPOUND_AS_FALLBACK;
    private static final SubLSymbol $sym355$PARSE_STRING_AS_DATE_FALLBACK_ESCALATED;
    private static final SubLSymbol $sym356$PARSE_ADJ_INITIAL_COMPOUND;
    private static final SubLObject $const357$Collection;
    private static final SubLSymbol $kw358$XML;
    private static final SubLString $str359$No_mode_specified_for_initialize_;
    private static final SubLSymbol $kw360$INVESTIGATING;
    private static final SubLString $str361$investigating___D__A_____;
    private static final SubLSymbol $kw362$PRINT_ME;
    private static final SubLString $str363$parse_of__S_yielded___;
    private static final SubLSymbol $kw364$FLAG_BAD_PILE;
    private static final SubLString $str365$______and_also________;
    private static final SubLSymbol $kw366$DENOTS;
    private static final SubLString $str367$____denots_are__A__;
    private static final SubLSymbol $kw368$BREAK;
    private static final SubLString $str369$________________________________;
    private static final SubLSymbol $kw370$COUNT_WITH_PARSES;
    private static final SubLString $str371$__Total_compounds_with_any_parses;
    private static final SubLSymbol $kw372$ACTUAL_PARSES;
    private static final SubLString $str373$Total_parses_found___A__;
    private static final SubLSymbol $kw374$PERCENT_APPROVED;
    private static final SubLString $str375$Percent_of_parses_approved___5_2F;
    private static final SubLSymbol $kw376$TOTAL_VIOLATIONS;
    private static final SubLString $str377$Total_violations___A__;
    private static final SubLSymbol $kw378$TO_CONSTANTS;
    private static final SubLString $str379$Note___A_parses_reformulated_to_c;
    private static final SubLSymbol $kw380$DENOTS_WANTED;
    private static final SubLString $str381$Compounds_wanting_denots___A_____;
    private static final SubLSymbol $kw382$RULES_AND_PARSE;
    private static final SubLString $str383$from__S___A__;
    private static final SubLSymbol $kw384$FALLBACK_AND_PARSE;
    private static final SubLString $str385$_A_A__;
    private static final SubLSymbol $kw386$LABEL;
    private static final SubLString $str387$_A__;
    private static final SubLSymbol $kw388$RULE_USES;
    private static final SubLString $str389$Uses_of__A___A_total___A_good___A;
    private static final SubLList $list390;
    private static final SubLSymbol $sym391$FORMAT;
    private static final SubLSymbol $sym392$NCS_FORMAT;
    private static final SubLSymbol $kw393$STDOUT;
    private static final SubLInteger $int394$100000;
    private static final SubLString $str395$_cyc_departments_nl_doc_stats_src;
    private static final SubLString $str396$_cyc_departments_nl_doc_stats_kb;
    private static final SubLString $str397$_;
    private static final SubLString $str398$;
    private static final SubLString $str399$_;
    private static final SubLString $str400$_ncr_stats;
    private static final SubLSymbol $kw401$DIRECTION;
    private static final SubLSymbol $kw402$OUTPUT;
    private static final SubLSymbol $kw403$IF_DOES_NOT_EXIST;
    private static final SubLSymbol $kw404$CREATE;
    private static final SubLString $str405$Couldn_t_open_output_stream__woul;
    private static final SubLString $str406$would_print_to__S__;
    private static final SubLString $str407$storing_results_in__S__cutoff_is_;
    private static final SubLSymbol $kw408$ON;
    private static final SubLSymbol $kw409$EOF;
    private static final SubLSymbol $kw410$NOUN;
    private static final SubLString $str411$from_fallback;
    private static final SubLInteger $int412$100;
    private static final SubLList $list413;
    private static final SubLString $str414$_cyc_projects_daml_call_thesaurus;
    private static final SubLString $str415$_;
    private static final SubLString $str416$_;
    private static final SubLString $str417$skipping__A______;
    private static final SubLString $str418$investigating__A______;
    private static final SubLSymbol $kw419$OFF;
    private static final SubLString $str420$_S_______________________________;
    private static final SubLString $str421$found_something_for__A_of__A_entr;
    private static final SubLList $list422;
    private static final SubLSymbol $sym423$PCOND;
    private static final SubLSymbol $sym424$FIND_CONSTANT;
    private static final SubLSymbol $sym425$_RBP_SHOW_SUCCESSFUL_RULES__;
    private static final SubLSymbol $sym426$WARN;
    private static final SubLString $str427$Skipping_this_test_as__A_doesn_t_;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 1050L)
    public static SubLObject add_nc_rule_constraint(final SubLObject argument, final SubLObject assertion) {
        clear_inter_constraints_from_rule();
        rbp_rule_bank.clear_noun_compound_constraint_string_specs();
        pph_noun_compound.clear_pph_nc_rule_list();
        return rbp_rule_bank.rbp_clear_rule_bank();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 1428L)
    public static SubLObject remove_nc_rule_constraint(final SubLObject argument, final SubLObject assertion) {
        clear_inter_constraints_from_rule();
        pph_noun_compound.clear_pph_nc_rule_list();
        return rbp_rule_bank.rbp_clear_rule_bank();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 1653L)
    public static SubLObject add_nc_rule_template(final SubLObject argument, final SubLObject assertion) {
        clear_inter_constraints_from_rule();
        return rbp_rule_bank.rbp_clear_rule_bank();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 1902L)
    public static SubLObject remove_nc_rule_template(final SubLObject argument, final SubLObject assertion) {
        clear_inter_constraints_from_rule();
        return rbp_rule_bank.rbp_clear_rule_bank();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 2095L)
    public static SubLObject noun_compound_parse_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_nc_parse(v_object, stream, (SubLObject)noun_compound_parser.ZERO_INTEGER);
        return (SubLObject)noun_compound_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 2095L)
    public static SubLObject noun_compound_parse_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $noun_compound_parse_native.class) ? noun_compound_parser.T : noun_compound_parser.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 2095L)
    public static SubLObject nc_parse_unique_id(final SubLObject v_object) {
        assert noun_compound_parser.NIL != noun_compound_parse_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 2095L)
    public static SubLObject nc_parse_input_string(final SubLObject v_object) {
        assert noun_compound_parser.NIL != noun_compound_parse_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 2095L)
    public static SubLObject nc_parse_input_strings(final SubLObject v_object) {
        assert noun_compound_parser.NIL != noun_compound_parse_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 2095L)
    public static SubLObject nc_parse_chart(final SubLObject v_object) {
        assert noun_compound_parser.NIL != noun_compound_parse_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 2095L)
    public static SubLObject _csetf_nc_parse_unique_id(final SubLObject v_object, final SubLObject value) {
        assert noun_compound_parser.NIL != noun_compound_parse_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 2095L)
    public static SubLObject _csetf_nc_parse_input_string(final SubLObject v_object, final SubLObject value) {
        assert noun_compound_parser.NIL != noun_compound_parse_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 2095L)
    public static SubLObject _csetf_nc_parse_input_strings(final SubLObject v_object, final SubLObject value) {
        assert noun_compound_parser.NIL != noun_compound_parse_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 2095L)
    public static SubLObject _csetf_nc_parse_chart(final SubLObject v_object, final SubLObject value) {
        assert noun_compound_parser.NIL != noun_compound_parse_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 2095L)
    public static SubLObject make_noun_compound_parse(SubLObject arglist) {
        if (arglist == noun_compound_parser.UNPROVIDED) {
            arglist = (SubLObject)noun_compound_parser.NIL;
        }
        final SubLObject v_new = (SubLObject)new $noun_compound_parse_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)noun_compound_parser.NIL, next = arglist; noun_compound_parser.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)noun_compound_parser.$kw21$UNIQUE_ID)) {
                _csetf_nc_parse_unique_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)noun_compound_parser.$kw22$INPUT_STRING)) {
                _csetf_nc_parse_input_string(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)noun_compound_parser.$kw23$INPUT_STRINGS)) {
                _csetf_nc_parse_input_strings(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)noun_compound_parser.$kw24$CHART)) {
                _csetf_nc_parse_chart(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)noun_compound_parser.$str25$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 2095L)
    public static SubLObject visit_defstruct_noun_compound_parse(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)noun_compound_parser.$kw26$BEGIN, (SubLObject)noun_compound_parser.$sym27$MAKE_NOUN_COMPOUND_PARSE, (SubLObject)noun_compound_parser.FOUR_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)noun_compound_parser.$kw28$SLOT, (SubLObject)noun_compound_parser.$kw21$UNIQUE_ID, nc_parse_unique_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)noun_compound_parser.$kw28$SLOT, (SubLObject)noun_compound_parser.$kw22$INPUT_STRING, nc_parse_input_string(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)noun_compound_parser.$kw28$SLOT, (SubLObject)noun_compound_parser.$kw23$INPUT_STRINGS, nc_parse_input_strings(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)noun_compound_parser.$kw28$SLOT, (SubLObject)noun_compound_parser.$kw24$CHART, nc_parse_chart(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)noun_compound_parser.$kw29$END, (SubLObject)noun_compound_parser.$sym27$MAKE_NOUN_COMPOUND_PARSE, (SubLObject)noun_compound_parser.FOUR_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 2095L)
    public static SubLObject visit_defstruct_object_noun_compound_parse_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_noun_compound_parse(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 2496L)
    public static SubLObject pprint_nc_parse(final SubLObject nc_parse, SubLObject stream, SubLObject depth) {
        if (stream == noun_compound_parser.UNPROVIDED) {
            stream = (SubLObject)noun_compound_parser.NIL;
        }
        if (depth == noun_compound_parser.UNPROVIDED) {
            depth = (SubLObject)noun_compound_parser.NIL;
        }
        PrintLow.format(stream, (SubLObject)noun_compound_parser.$str32$____NC_PARSE__ID___S__, nc_parse_unique_id(nc_parse));
        PrintLow.format(stream, (SubLObject)noun_compound_parser.$str33$__Input_string___S__, nc_parse_input_string(nc_parse));
        PrintLow.format(stream, (SubLObject)noun_compound_parser.$str34$_Input_strings___S__, nc_parse_input_strings(nc_parse));
        PrintLow.format(stream, (SubLObject)noun_compound_parser.$str35$_________Chart___S__, nc_parse_chart(nc_parse));
        return nc_parse;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 2887L)
    public static SubLObject new_nc_parse(SubLObject input_string) {
        if (input_string == noun_compound_parser.UNPROVIDED) {
            input_string = (SubLObject)noun_compound_parser.NIL;
        }
        final SubLObject parse = make_noun_compound_parse((SubLObject)noun_compound_parser.UNPROVIDED);
        _csetf_nc_parse_unique_id(parse, noun_compound_parser.$nc_parse_id_counter$.getGlobalValue());
        noun_compound_parser.$nc_parse_id_counter$.setGlobalValue(Numbers.add(noun_compound_parser.$nc_parse_id_counter$.getGlobalValue(), (SubLObject)noun_compound_parser.ONE_INTEGER));
        _csetf_nc_parse_input_string(parse, input_string);
        return parse;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 3769L)
    public static SubLObject rbp_trace() {
        rbp_show_rules();
        return (SubLObject)noun_compound_parser.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 6023L)
    public static SubLObject with_rbp_trace(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)noun_compound_parser.$sym36$CLET, (SubLObject)noun_compound_parser.$list37, ConsesLow.append(body, (SubLObject)noun_compound_parser.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 6131L)
    public static SubLObject rbp_untrace() {
        rbp_hide_rules();
        rbp_untrace_all_rules();
        return (SubLObject)noun_compound_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 6277L)
    public static SubLObject rbp_show_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        noun_compound_parser.$rbp_show_successful_rulesP$.setDynamicValue((SubLObject)noun_compound_parser.T, thread);
        return noun_compound_parser.$rbp_show_successful_rulesP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 6390L)
    public static SubLObject rbp_hide_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        noun_compound_parser.$rbp_show_successful_rulesP$.setDynamicValue((SubLObject)noun_compound_parser.NIL, thread);
        return noun_compound_parser.$rbp_show_successful_rulesP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 6588L)
    public static SubLObject rbp_traced_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return noun_compound_parser.$rbp_traced_rules$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 6698L)
    public static SubLObject rbp_trace_rule(final SubLObject rule_cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        rbp_rule_bank.rbp_rb_check_initialization();
        final SubLObject rule = rbp_rule_bank.rbp_find_rule_from_cycl(rule_cycl, (SubLObject)noun_compound_parser.UNPROVIDED);
        if (noun_compound_parser.NIL != rbp_rule_bank.recursive_block_parser_rule_p(rule)) {
            final SubLObject item_var = rule;
            if (noun_compound_parser.NIL == conses_high.member(item_var, noun_compound_parser.$rbp_traced_rules$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)noun_compound_parser.EQL), Symbols.symbol_function((SubLObject)noun_compound_parser.IDENTITY))) {
                noun_compound_parser.$rbp_traced_rules$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, noun_compound_parser.$rbp_traced_rules$.getDynamicValue(thread)), thread);
            }
        }
        return Mapping.mapcar((SubLObject)noun_compound_parser.$sym38$RBP_RULE_CYCL, noun_compound_parser.$rbp_traced_rules$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7033L)
    public static SubLObject rbp_untrace_all_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        noun_compound_parser.$rbp_traced_rules$.setDynamicValue((SubLObject)noun_compound_parser.NIL, thread);
        return noun_compound_parser.$rbp_traced_rules$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7163L)
    public static SubLObject rbp_untrace_rule(final SubLObject rule_cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rule = rbp_rule_bank.rbp_find_rule_from_cycl(rule_cycl, (SubLObject)noun_compound_parser.UNPROVIDED);
        noun_compound_parser.$rbp_traced_rules$.setDynamicValue(Sequences.remove(rule, noun_compound_parser.$rbp_traced_rules$.getDynamicValue(thread), (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED), thread);
        return noun_compound_parser.$rbp_traced_rules$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7420L)
    public static SubLObject just_one_spaceP(final SubLObject string) {
        return list_utilities.lengthE(string_utilities.split_string(string, (SubLObject)noun_compound_parser.UNPROVIDED), (SubLObject)noun_compound_parser.TWO_INTEGER, (SubLObject)noun_compound_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
    public static SubLObject noun_compound_block_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_nc_block(v_object, stream, (SubLObject)noun_compound_parser.ZERO_INTEGER);
        return (SubLObject)noun_compound_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
    public static SubLObject noun_compound_block_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $noun_compound_block_native.class) ? noun_compound_parser.T : noun_compound_parser.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
    public static SubLObject nc_block_unique_id(final SubLObject v_object) {
        assert noun_compound_parser.NIL != noun_compound_block_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
    public static SubLObject nc_block_span_index(final SubLObject v_object) {
        assert noun_compound_parser.NIL != noun_compound_block_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
    public static SubLObject nc_block_confidence(final SubLObject v_object) {
        assert noun_compound_parser.NIL != noun_compound_block_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
    public static SubLObject nc_block_denot(final SubLObject v_object) {
        assert noun_compound_parser.NIL != noun_compound_block_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
    public static SubLObject nc_block_filters(final SubLObject v_object) {
        assert noun_compound_parser.NIL != noun_compound_block_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
    public static SubLObject nc_block_spanned_string(final SubLObject v_object) {
        assert noun_compound_parser.NIL != noun_compound_block_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
    public static SubLObject nc_block_head(final SubLObject v_object) {
        assert noun_compound_parser.NIL != noun_compound_block_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
    public static SubLObject nc_block_head_pos(final SubLObject v_object) {
        assert noun_compound_parser.NIL != noun_compound_block_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
    public static SubLObject nc_block_head_string_pred(final SubLObject v_object) {
        assert noun_compound_parser.NIL != noun_compound_block_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
    public static SubLObject nc_block_sub_tree(final SubLObject v_object) {
        assert noun_compound_parser.NIL != noun_compound_block_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
    public static SubLObject nc_block_plist(final SubLObject v_object) {
        assert noun_compound_parser.NIL != noun_compound_block_p(v_object) : v_object;
        return v_object.getField12();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
    public static SubLObject _csetf_nc_block_unique_id(final SubLObject v_object, final SubLObject value) {
        assert noun_compound_parser.NIL != noun_compound_block_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
    public static SubLObject _csetf_nc_block_span_index(final SubLObject v_object, final SubLObject value) {
        assert noun_compound_parser.NIL != noun_compound_block_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
    public static SubLObject _csetf_nc_block_confidence(final SubLObject v_object, final SubLObject value) {
        assert noun_compound_parser.NIL != noun_compound_block_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
    public static SubLObject _csetf_nc_block_denot(final SubLObject v_object, final SubLObject value) {
        assert noun_compound_parser.NIL != noun_compound_block_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
    public static SubLObject _csetf_nc_block_filters(final SubLObject v_object, final SubLObject value) {
        assert noun_compound_parser.NIL != noun_compound_block_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
    public static SubLObject _csetf_nc_block_spanned_string(final SubLObject v_object, final SubLObject value) {
        assert noun_compound_parser.NIL != noun_compound_block_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
    public static SubLObject _csetf_nc_block_head(final SubLObject v_object, final SubLObject value) {
        assert noun_compound_parser.NIL != noun_compound_block_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
    public static SubLObject _csetf_nc_block_head_pos(final SubLObject v_object, final SubLObject value) {
        assert noun_compound_parser.NIL != noun_compound_block_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
    public static SubLObject _csetf_nc_block_head_string_pred(final SubLObject v_object, final SubLObject value) {
        assert noun_compound_parser.NIL != noun_compound_block_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
    public static SubLObject _csetf_nc_block_sub_tree(final SubLObject v_object, final SubLObject value) {
        assert noun_compound_parser.NIL != noun_compound_block_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
    public static SubLObject _csetf_nc_block_plist(final SubLObject v_object, final SubLObject value) {
        assert noun_compound_parser.NIL != noun_compound_block_p(v_object) : v_object;
        return v_object.setField12(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
    public static SubLObject make_noun_compound_block(SubLObject arglist) {
        if (arglist == noun_compound_parser.UNPROVIDED) {
            arglist = (SubLObject)noun_compound_parser.NIL;
        }
        final SubLObject v_new = (SubLObject)new $noun_compound_block_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)noun_compound_parser.NIL, next = arglist; noun_compound_parser.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)noun_compound_parser.$kw21$UNIQUE_ID)) {
                _csetf_nc_block_unique_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)noun_compound_parser.$kw70$SPAN_INDEX)) {
                _csetf_nc_block_span_index(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)noun_compound_parser.$kw71$CONFIDENCE)) {
                _csetf_nc_block_confidence(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)noun_compound_parser.$kw72$DENOT)) {
                _csetf_nc_block_denot(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)noun_compound_parser.$kw73$FILTERS)) {
                _csetf_nc_block_filters(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)noun_compound_parser.$kw74$SPANNED_STRING)) {
                _csetf_nc_block_spanned_string(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)noun_compound_parser.$kw75$HEAD)) {
                _csetf_nc_block_head(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)noun_compound_parser.$kw76$HEAD_POS)) {
                _csetf_nc_block_head_pos(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)noun_compound_parser.$kw77$HEAD_STRING_PRED)) {
                _csetf_nc_block_head_string_pred(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)noun_compound_parser.$kw78$SUB_TREE)) {
                _csetf_nc_block_sub_tree(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)noun_compound_parser.$kw79$PLIST)) {
                _csetf_nc_block_plist(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)noun_compound_parser.$str25$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
    public static SubLObject visit_defstruct_noun_compound_block(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)noun_compound_parser.$kw26$BEGIN, (SubLObject)noun_compound_parser.$sym80$MAKE_NOUN_COMPOUND_BLOCK, (SubLObject)noun_compound_parser.ELEVEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)noun_compound_parser.$kw28$SLOT, (SubLObject)noun_compound_parser.$kw21$UNIQUE_ID, nc_block_unique_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)noun_compound_parser.$kw28$SLOT, (SubLObject)noun_compound_parser.$kw70$SPAN_INDEX, nc_block_span_index(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)noun_compound_parser.$kw28$SLOT, (SubLObject)noun_compound_parser.$kw71$CONFIDENCE, nc_block_confidence(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)noun_compound_parser.$kw28$SLOT, (SubLObject)noun_compound_parser.$kw72$DENOT, nc_block_denot(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)noun_compound_parser.$kw28$SLOT, (SubLObject)noun_compound_parser.$kw73$FILTERS, nc_block_filters(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)noun_compound_parser.$kw28$SLOT, (SubLObject)noun_compound_parser.$kw74$SPANNED_STRING, nc_block_spanned_string(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)noun_compound_parser.$kw28$SLOT, (SubLObject)noun_compound_parser.$kw75$HEAD, nc_block_head(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)noun_compound_parser.$kw28$SLOT, (SubLObject)noun_compound_parser.$kw76$HEAD_POS, nc_block_head_pos(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)noun_compound_parser.$kw28$SLOT, (SubLObject)noun_compound_parser.$kw77$HEAD_STRING_PRED, nc_block_head_string_pred(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)noun_compound_parser.$kw28$SLOT, (SubLObject)noun_compound_parser.$kw78$SUB_TREE, nc_block_sub_tree(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)noun_compound_parser.$kw28$SLOT, (SubLObject)noun_compound_parser.$kw79$PLIST, nc_block_plist(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)noun_compound_parser.$kw29$END, (SubLObject)noun_compound_parser.$sym80$MAKE_NOUN_COMPOUND_BLOCK, (SubLObject)noun_compound_parser.ELEVEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
    public static SubLObject visit_defstruct_object_noun_compound_block_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_noun_compound_block(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 8152L)
    public static SubLObject nc_block_plist_lookup(final SubLObject block, final SubLObject property, SubLObject v_default) {
        if (v_default == noun_compound_parser.UNPROVIDED) {
            v_default = (SubLObject)noun_compound_parser.NIL;
        }
        assert noun_compound_parser.NIL != noun_compound_block_p(block) : block;
        return conses_high.getf(nc_block_plist(block), property, v_default);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 8372L)
    public static SubLObject nc_block_plist_set(final SubLObject block, final SubLObject property, final SubLObject value) {
        assert noun_compound_parser.NIL != noun_compound_block_p(block) : block;
        _csetf_nc_block_plist(block, conses_high.putf(nc_block_plist(block), property, value));
        return nc_block_plist_lookup(block, property, (SubLObject)noun_compound_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 8655L)
    public static SubLObject nc_block_wu(final SubLObject block) {
        return nc_block_plist_lookup(block, (SubLObject)noun_compound_parser.$kw82$WU, (SubLObject)noun_compound_parser.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 8739L)
    public static SubLObject nc_block_set_wu(final SubLObject block, final SubLObject wu) {
        return nc_block_plist_set(block, (SubLObject)noun_compound_parser.$kw82$WU, wu);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 8826L)
    public static SubLObject nc_block_rule(final SubLObject block) {
        return nc_block_sub_tree(block).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 8906L)
    public static SubLObject nc_block_mod_block(final SubLObject block, SubLObject block_hash) {
        if (block_hash == noun_compound_parser.UNPROVIDED) {
            block_hash = (SubLObject)noun_compound_parser.NIL;
        }
        SubLObject ans = conses_high.second(nc_block_sub_tree(block));
        if (noun_compound_parser.NIL != block_hash) {
            ans = rbp_chart_parser.rbp_chart_block_hash_lookup(ans, block_hash);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 9124L)
    public static SubLObject nc_block_head_block(final SubLObject block, SubLObject block_hash) {
        if (block_hash == noun_compound_parser.UNPROVIDED) {
            block_hash = (SubLObject)noun_compound_parser.NIL;
        }
        SubLObject ans = conses_high.third(nc_block_sub_tree(block));
        if (noun_compound_parser.NIL != block_hash) {
            ans = rbp_chart_parser.rbp_chart_block_hash_lookup(ans, block_hash);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 9342L)
    public static SubLObject nc_block_rule_count(final SubLObject block, final SubLObject block_hash) {
        if (noun_compound_parser.NIL == noun_compound_block_p(block)) {
            return (SubLObject)noun_compound_parser.ZERO_INTEGER;
        }
        if (noun_compound_parser.NIL == nc_block_rule(block)) {
            return (SubLObject)noun_compound_parser.ZERO_INTEGER;
        }
        return Numbers.add(nc_block_rule_count(nc_block_mod_block(block, block_hash), block_hash), nc_block_rule_count(nc_block_head_block(block, block_hash), block_hash), (SubLObject)noun_compound_parser.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 9955L)
    public static SubLObject pprint_nc_block(final SubLObject block, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)noun_compound_parser.$str84$__NCB__S___S__S_, new SubLObject[] { nc_block_unique_id(block), nc_block_spanned_string(block), nc_block_head_string_pred(block) });
        return block;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 10654L)
    public static SubLObject new_noun_compound_block(final SubLObject num1, final SubLObject num2, final SubLObject confidence, final SubLObject string, SubLObject wu, SubLObject head_fort, SubLObject denot, SubLObject head_pos, SubLObject pred, SubLObject sub_tree) {
        if (wu == noun_compound_parser.UNPROVIDED) {
            wu = (SubLObject)noun_compound_parser.NIL;
        }
        if (head_fort == noun_compound_parser.UNPROVIDED) {
            head_fort = (SubLObject)noun_compound_parser.NIL;
        }
        if (denot == noun_compound_parser.UNPROVIDED) {
            denot = (SubLObject)noun_compound_parser.NIL;
        }
        if (head_pos == noun_compound_parser.UNPROVIDED) {
            head_pos = (SubLObject)noun_compound_parser.NIL;
        }
        if (pred == noun_compound_parser.UNPROVIDED) {
            pred = (SubLObject)noun_compound_parser.NIL;
        }
        if (sub_tree == noun_compound_parser.UNPROVIDED) {
            sub_tree = (SubLObject)noun_compound_parser.NIL;
        }
        final SubLObject block = make_noun_compound_block((SubLObject)noun_compound_parser.UNPROVIDED);
        noun_compound_parser.$nc_block_unique_id_counter$.setGlobalValue(Numbers.add(noun_compound_parser.$nc_block_unique_id_counter$.getGlobalValue(), (SubLObject)noun_compound_parser.ONE_INTEGER));
        _csetf_nc_block_unique_id(block, noun_compound_parser.$nc_block_unique_id_counter$.getGlobalValue());
        _csetf_nc_block_span_index(block, interval_span.get_interval_span(num1, num2));
        _csetf_nc_block_confidence(block, confidence);
        _csetf_nc_block_denot(block, denot);
        _csetf_nc_block_spanned_string(block, string);
        _csetf_nc_block_head(block, head_fort);
        _csetf_nc_block_head_pos(block, head_pos);
        _csetf_nc_block_head_string_pred(block, pred);
        _csetf_nc_block_sub_tree(block, sub_tree);
        nc_block_set_wu(block, wu);
        return block;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 11778L)
    public static SubLObject inference_new_noun_compound_block(final SubLObject num1, final SubLObject num2, final SubLObject confidence, final SubLObject string, SubLObject wu, SubLObject head_fort, SubLObject denot, SubLObject head_pos, SubLObject pred, SubLObject sub_tree) {
        if (wu == noun_compound_parser.UNPROVIDED) {
            wu = (SubLObject)noun_compound_parser.NIL;
        }
        if (head_fort == noun_compound_parser.UNPROVIDED) {
            head_fort = (SubLObject)noun_compound_parser.NIL;
        }
        if (denot == noun_compound_parser.UNPROVIDED) {
            denot = (SubLObject)noun_compound_parser.NIL;
        }
        if (head_pos == noun_compound_parser.UNPROVIDED) {
            head_pos = (SubLObject)noun_compound_parser.NIL;
        }
        if (pred == noun_compound_parser.UNPROVIDED) {
            pred = (SubLObject)noun_compound_parser.NIL;
        }
        if (sub_tree == noun_compound_parser.UNPROVIDED) {
            sub_tree = (SubLObject)noun_compound_parser.NIL;
        }
        return new_noun_compound_block(num1, num2, confidence, string, wu, head_fort, denot, head_pos, pred, sub_tree);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 13164L)
    public static SubLObject combine_noun_compound_blocks_internal(final SubLObject block1, final SubLObject block2, final SubLObject block_hash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (noun_compound_parser.NIL == rbp_adj_blockP(block1) && noun_compound_parser.NIL != rbp_adj_modified_blockP(block2, block_hash)) {
            return (SubLObject)noun_compound_parser.NIL;
        }
        final SubLObject span1 = nc_block_span_index(block1);
        final SubLObject span2 = nc_block_span_index(block2);
        final SubLObject beg1 = interval_span.interval_span_start(span1);
        final SubLObject end1 = interval_span.interval_span_end(span1);
        final SubLObject beg2 = interval_span.interval_span_start(span2);
        final SubLObject end2 = interval_span.interval_span_end(span2);
        SubLObject new_blocks = (SubLObject)noun_compound_parser.NIL;
        if (!end1.numE(beg2)) {
            return (SubLObject)noun_compound_parser.NIL;
        }
        if (noun_compound_parser.NIL != number_utilities.potentially_infinite_number_L(parsing_vars.$npp_max_rules_per_compound$.getDynamicValue(thread), number_utilities.positive_infinity())) {
            final SubLObject input_spannerP = Equality.eq(rbp_chart_parser.rbp_chart_max_span((SubLObject)noun_compound_parser.UNPROVIDED), interval_span.get_interval_span(beg1, end2));
            final SubLObject new_min_rule_count = Numbers.add(nc_block_rule_count(block1, block_hash), nc_block_rule_count(block2, block_hash), (SubLObject)((noun_compound_parser.NIL != input_spannerP) ? noun_compound_parser.ZERO_INTEGER : noun_compound_parser.ONE_INTEGER));
            if (!new_min_rule_count.numL(parsing_vars.$npp_max_rules_per_compound$.getDynamicValue(thread))) {
                return (SubLObject)noun_compound_parser.NIL;
            }
        }
        final SubLObject string1 = nc_block_spanned_string(block1);
        final SubLObject string2 = nc_block_spanned_string(block2);
        SubLObject cdolist_list_var;
        final SubLObject raw_parses = cdolist_list_var = rbp_rb_combine_noun_compound_blocks(block1, block2);
        SubLObject parse = (SubLObject)noun_compound_parser.NIL;
        parse = cdolist_list_var.first();
        while (noun_compound_parser.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = parse;
            SubLObject rule = (SubLObject)noun_compound_parser.NIL;
            SubLObject denot = (SubLObject)noun_compound_parser.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)noun_compound_parser.$list87);
            rule = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)noun_compound_parser.$list87);
            denot = current.first();
            current = current.rest();
            if (noun_compound_parser.NIL == current) {
                final SubLObject rule_confidence = (SubLObject)noun_compound_parser.$float83$0_5;
                SubLObject confidence = Numbers.multiply(rule_confidence, nc_block_confidence(block1), nc_block_confidence(block2));
                final SubLObject new_string = Sequences.cconcatenate(string1, new SubLObject[] { noun_compound_parser.$str88$_, string2 });
                final SubLObject head_fort = nc_block_head(block2);
                final SubLObject head_pos = nc_block_head_pos(block2);
                final SubLObject head_pos_pred = nc_block_head_string_pred(block2);
                final SubLObject sub_tree = (SubLObject)ConsesLow.list(rule, nc_block_unique_id(block1), nc_block_unique_id(block2));
                if (noun_compound_parser.NIL != forts.fort_p(denot)) {
                    confidence = Numbers.multiply(confidence, (SubLObject)noun_compound_parser.$float89$1_1);
                }
                final SubLObject wu = (SubLObject)noun_compound_parser.NIL;
                final SubLObject new_block = new_noun_compound_block(beg1, end2, confidence, new_string, wu, head_fort, denot, head_pos, head_pos_pred, sub_tree);
                new_blocks = (SubLObject)ConsesLow.cons(new_block, new_blocks);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)noun_compound_parser.$list87);
            }
            cdolist_list_var = cdolist_list_var.rest();
            parse = cdolist_list_var.first();
        }
        return new_blocks;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 13164L)
    public static SubLObject combine_noun_compound_blocks(final SubLObject block1, final SubLObject block2, final SubLObject block_hash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)noun_compound_parser.NIL;
        if (noun_compound_parser.NIL == v_memoization_state) {
            return combine_noun_compound_blocks_internal(block1, block2, block_hash);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)noun_compound_parser.$sym86$COMBINE_NOUN_COMPOUND_BLOCKS, (SubLObject)noun_compound_parser.UNPROVIDED);
        if (noun_compound_parser.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)noun_compound_parser.$sym86$COMBINE_NOUN_COMPOUND_BLOCKS, (SubLObject)noun_compound_parser.THREE_INTEGER, (SubLObject)noun_compound_parser.NIL, (SubLObject)noun_compound_parser.EQ, (SubLObject)noun_compound_parser.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)noun_compound_parser.$sym86$COMBINE_NOUN_COMPOUND_BLOCKS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(block1, block2, block_hash);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)noun_compound_parser.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)noun_compound_parser.NIL;
            collision = cdolist_list_var.first();
            while (noun_compound_parser.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (block1.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (block2.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (noun_compound_parser.NIL != cached_args && noun_compound_parser.NIL == cached_args.rest() && block_hash.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(combine_noun_compound_blocks_internal(block1, block2, block_hash)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(block1, block2, block_hash));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 16188L)
    public static SubLObject token_to_blocks(final SubLObject token) {
        initialize_rbp_name_cache();
        final SubLObject index_1 = standard_tokenization.interval_token_start(token);
        final SubLObject index_2 = standard_tokenization.interval_token_end(token);
        final SubLObject confidence = (SubLObject)noun_compound_parser.ONE_INTEGER;
        final SubLObject entry = standard_tokenization.interval_token_value(token);
        final SubLObject string = standard_tokenization.string_token_string(entry);
        final SubLObject tuples = standard_tokenization.string_token_value(entry);
        SubLObject blocks = (SubLObject)((noun_compound_parser.NIL != tuples) ? noun_compound_parser.NIL : ConsesLow.list(new_noun_compound_block(index_1, index_2, confidence, string, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED)));
        SubLObject cdolist_list_var = tuples;
        SubLObject tuple = (SubLObject)noun_compound_parser.NIL;
        tuple = cdolist_list_var.first();
        while (noun_compound_parser.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tuple;
            SubLObject denot = (SubLObject)noun_compound_parser.NIL;
            SubLObject pos = (SubLObject)noun_compound_parser.NIL;
            SubLObject pred = (SubLObject)noun_compound_parser.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)noun_compound_parser.$list90);
            denot = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)noun_compound_parser.$list90);
            pos = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)noun_compound_parser.$list90);
            pred = current.first();
            current = current.rest();
            final SubLObject wu = (SubLObject)(current.isCons() ? current.first() : noun_compound_parser.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)noun_compound_parser.$list90);
            current = current.rest();
            if (noun_compound_parser.NIL == current) {
                final SubLObject denot_fort = function_terms.naut_to_nart(denot);
                final SubLObject v_new = new_noun_compound_block(index_1, index_2, confidence, string, wu, denot_fort, denot_fort, pos, pred, (SubLObject)noun_compound_parser.UNPROVIDED);
                if (noun_compound_parser.NIL != rbp_ok_blockP(v_new)) {
                    blocks = (SubLObject)ConsesLow.cons(v_new, blocks);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)noun_compound_parser.$list90);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        }
        return rbp_filter_redundant_blocks(blocks);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 17209L)
    public static SubLObject rbp_adj_blockP(final SubLObject block) {
        final SubLObject pos = nc_block_head_pos(block);
        return (SubLObject)((noun_compound_parser.NIL != pos) ? rbp_wff.npp_genlP(pos, noun_compound_parser.$const91$Adjective, (SubLObject)noun_compound_parser.UNPROVIDED) : noun_compound_parser.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 17397L)
    public static SubLObject rbp_adj_modified_blockP(final SubLObject block, final SubLObject block_hash) {
        final SubLObject mod_dtr_id = nc_block_mod_block(block, block_hash);
        final SubLObject mod_dtr = rbp_chart_parser.rbp_chart_block_hash_lookup(mod_dtr_id, block_hash);
        final SubLObject mod_dtr_pos = (SubLObject)((noun_compound_parser.NIL != mod_dtr) ? nc_block_head_pos(mod_dtr) : noun_compound_parser.NIL);
        return (SubLObject)((noun_compound_parser.NIL != mod_dtr_pos) ? rbp_wff.npp_genlP(mod_dtr_pos, noun_compound_parser.$const91$Adjective, (SubLObject)noun_compound_parser.UNPROVIDED) : noun_compound_parser.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 17789L)
    public static SubLObject rbp_base_from_block(final SubLObject block, final SubLObject c_type) {
        if (noun_compound_parser.NIL != rbp_rule_bank.rbp_semantic_constraint_type_p(c_type)) {
            return nc_block_denot(block);
        }
        return Functions.funcall(rbp_candidate_fn_for_con_kw(c_type), block);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 22998L)
    public static SubLObject rbp_apply_filter_cluster(final SubLObject filters_in_cluster, final SubLObject filter_type, final SubLObject parses, SubLObject accessor, SubLObject old_violations, SubLObject violations_limit) {
        if (accessor == noun_compound_parser.UNPROVIDED) {
            accessor = Symbols.symbol_function((SubLObject)noun_compound_parser.IDENTITY);
        }
        if (old_violations == noun_compound_parser.UNPROVIDED) {
            old_violations = (SubLObject)noun_compound_parser.$sym56$NC_BLOCK_FILTERS;
        }
        if (violations_limit == noun_compound_parser.UNPROVIDED) {
            violations_limit = parsing_vars.$rbp_filter_violations_limit$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (noun_compound_parser.NIL != violations_limit && !noun_compound_parser.assertionsDisabledInClass && noun_compound_parser.NIL == subl_promotions.positive_integer_p(violations_limit)) {
            throw new AssertionError(violations_limit);
        }
        final SubLObject failures = dictionary.new_dictionary((SubLObject)noun_compound_parser.EQUALP, (SubLObject)noun_compound_parser.UNPROVIDED);
        final SubLObject multipliers = dictionary.new_dictionary((SubLObject)noun_compound_parser.EQL, (SubLObject)noun_compound_parser.UNPROVIDED);
        final SubLObject still_checking = set.new_set((SubLObject)noun_compound_parser.EQUALP, Sequences.length(parses));
        SubLObject cdolist_list_var = parses;
        SubLObject block = (SubLObject)noun_compound_parser.NIL;
        block = cdolist_list_var.first();
        while (noun_compound_parser.NIL != cdolist_list_var) {
            if (old_violations.eql((SubLObject)noun_compound_parser.$kw97$NONE) || old_violations.eql((SubLObject)noun_compound_parser.$kw98$SKIP)) {
                set.set_add(block, still_checking);
            }
            else {
                dictionary.dictionary_enter(failures, block, Functions.funcall(old_violations, block));
                dictionary.dictionary_enter(multipliers, block, (SubLObject)noun_compound_parser.ONE_INTEGER);
                if (noun_compound_parser.NIL == list_utilities.lengthGE(Functions.funcall(old_violations, block), violations_limit, (SubLObject)noun_compound_parser.UNPROVIDED)) {
                    set.set_add(block, still_checking);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            block = cdolist_list_var.first();
        }
        cdolist_list_var = filters_in_cluster;
        SubLObject filter = (SubLObject)noun_compound_parser.NIL;
        filter = cdolist_list_var.first();
        while (noun_compound_parser.NIL != cdolist_list_var) {
            final SubLObject remaining_parses = set.set_element_list(still_checking);
            SubLObject cdolist_list_var_$1;
            final SubLObject failure_list = cdolist_list_var_$1 = (filter_type.eql((SubLObject)noun_compound_parser.$kw99$BOOLEAN) ? parsing_utilities.apply_boolean_parsing_filter(remaining_parses, filter, accessor, (SubLObject)noun_compound_parser.UNPROVIDED) : parsing_utilities.apply_macroscopic_parsing_filter(remaining_parses, filter, accessor, (SubLObject)noun_compound_parser.UNPROVIDED));
            SubLObject failure = (SubLObject)noun_compound_parser.NIL;
            failure = cdolist_list_var_$1.first();
            while (noun_compound_parser.NIL != cdolist_list_var_$1) {
                SubLObject reason = (SubLObject)noun_compound_parser.NIL;
                SubLObject mult = (SubLObject)noun_compound_parser.NIL;
                SubLObject current;
                final SubLObject datum = current = failure;
                SubLObject block2 = (SubLObject)noun_compound_parser.NIL;
                SubLObject diagnostics = (SubLObject)noun_compound_parser.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)noun_compound_parser.$list100);
                block2 = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)noun_compound_parser.$list100);
                diagnostics = current.first();
                current = current.rest();
                if (noun_compound_parser.NIL == current) {
                    if (noun_compound_parser.NIL != list_utilities.proper_list_p(diagnostics)) {
                        thread.resetMultipleValues();
                        final SubLObject reason_$2 = diagnostics;
                        final SubLObject mult_$3 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        reason = reason_$2;
                        mult = mult_$3;
                        if (mult.isKeyword()) {
                            mult = (SubLObject)noun_compound_parser.NIL;
                        }
                    }
                    else if (noun_compound_parser.NIL != diagnostics) {
                        reason = diagnostics;
                    }
                    if (noun_compound_parser.NIL == mult || mult.isKeyword()) {
                        mult = noun_compound_parser.$rbp_default_confidence_multiplier_for_failing_a_filter$.getDynamicValue(thread);
                    }
                    if (noun_compound_parser.NIL != reason) {
                        final SubLObject known_violations = dictionary.dictionary_lookup(failures, block2, (SubLObject)noun_compound_parser.UNPROVIDED);
                        if (noun_compound_parser.NIL == subl_promotions.memberP(reason, known_violations, (SubLObject)noun_compound_parser.EQUAL, (SubLObject)noun_compound_parser.UNPROVIDED)) {
                            dictionary_utilities.dictionary_push(failures, block2, reason);
                            dictionary.dictionary_enter(multipliers, block2, Numbers.multiply(mult, dictionary.dictionary_lookup(multipliers, block2, (SubLObject)noun_compound_parser.UNPROVIDED)));
                            if (noun_compound_parser.NIL != list_utilities.lengthGE(dictionary.dictionary_lookup(failures, block2, (SubLObject)noun_compound_parser.UNPROVIDED), violations_limit, (SubLObject)noun_compound_parser.UNPROVIDED)) {
                                if (noun_compound_parser.NIL != subl_promotions.memberP(nc_block_rule(block2), rbp_traced_rules(), (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED)) {
                                    Errors.warn((SubLObject)noun_compound_parser.$str101$Abandoning_parse__S_for__S, nc_block_denot(block2), nc_block_spanned_string(block2));
                                }
                                set.set_remove(block2, still_checking);
                            }
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)noun_compound_parser.$list100);
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                failure = cdolist_list_var_$1.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            filter = cdolist_list_var.first();
        }
        SubLObject triples = (SubLObject)noun_compound_parser.NIL;
        SubLObject cdolist_list_var2 = parses;
        SubLObject block3 = (SubLObject)noun_compound_parser.NIL;
        block3 = cdolist_list_var2.first();
        while (noun_compound_parser.NIL != cdolist_list_var2) {
            triples = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(block3, dictionary.dictionary_lookup(failures, block3, (SubLObject)noun_compound_parser.UNPROVIDED), dictionary.dictionary_lookup(multipliers, block3, (SubLObject)noun_compound_parser.UNPROVIDED)), triples);
            cdolist_list_var2 = cdolist_list_var2.rest();
            block3 = cdolist_list_var2.first();
        }
        return Sequences.reverse(triples);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 25818L)
    public static SubLObject rbp_process_filter_clusters(final SubLObject clusters, final SubLObject blocks, SubLObject filter_type) {
        if (filter_type == noun_compound_parser.UNPROVIDED) {
            filter_type = (SubLObject)noun_compound_parser.$kw99$BOOLEAN;
        }
        SubLObject cdolist_list_var = clusters;
        SubLObject this_cluster = (SubLObject)noun_compound_parser.NIL;
        this_cluster = cdolist_list_var.first();
        while (noun_compound_parser.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$4 = rbp_apply_filter_cluster(this_cluster, filter_type, blocks, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED);
            SubLObject triple = (SubLObject)noun_compound_parser.NIL;
            triple = cdolist_list_var_$4.first();
            while (noun_compound_parser.NIL != cdolist_list_var_$4) {
                SubLObject current;
                final SubLObject datum = current = triple;
                SubLObject block = (SubLObject)noun_compound_parser.NIL;
                SubLObject failed_these_filters = (SubLObject)noun_compound_parser.NIL;
                SubLObject disconfidence = (SubLObject)noun_compound_parser.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)noun_compound_parser.$list102);
                block = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)noun_compound_parser.$list102);
                failed_these_filters = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)noun_compound_parser.$list102);
                disconfidence = current.first();
                current = current.rest();
                if (noun_compound_parser.NIL == current) {
                    if (noun_compound_parser.NIL != failed_these_filters) {
                        _csetf_nc_block_filters(block, Sequences.reverse(failed_these_filters));
                        _csetf_nc_block_confidence(block, Numbers.multiply(disconfidence, nc_block_confidence(block)));
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)noun_compound_parser.$list102);
                }
                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                triple = cdolist_list_var_$4.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_cluster = cdolist_list_var.first();
        }
        return blocks;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 26979L)
    public static SubLObject rbp_parse_wrong_sizeP(final SubLObject block, final SubLObject block_hash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject component_count = rbp_component_count(block, block_hash);
        return (SubLObject)SubLObjectFactory.makeBoolean((noun_compound_parser.$rbp_minimum_component_count$.getDynamicValue(thread).isNumber() && component_count.numL(noun_compound_parser.$rbp_minimum_component_count$.getDynamicValue(thread))) || (noun_compound_parser.$rbp_maximum_component_count$.getDynamicValue(thread).isNumber() && component_count.numG(noun_compound_parser.$rbp_maximum_component_count$.getDynamicValue(thread))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 27390L)
    public static SubLObject rbp_component_count(final SubLObject block, final SubLObject block_hash) {
        final SubLObject sub_tree = nc_block_sub_tree(block);
        if (noun_compound_parser.NIL == sub_tree) {
            return (SubLObject)noun_compound_parser.ONE_INTEGER;
        }
        final SubLObject dtr1 = rbp_chart_parser.rbp_chart_block_hash_lookup(conses_high.second(sub_tree), block_hash);
        final SubLObject dtr2 = rbp_chart_parser.rbp_chart_block_hash_lookup(conses_high.third(sub_tree), block_hash);
        return Numbers.add(rbp_component_count(dtr1, block_hash), rbp_component_count(dtr2, block_hash));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 27788L)
    public static SubLObject ncp_reporting_metrics(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject string = (SubLObject)noun_compound_parser.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)noun_compound_parser.$list103);
        string = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)noun_compound_parser.$sym104$PROGN, (SubLObject)noun_compound_parser.$list105, (SubLObject)ConsesLow.list((SubLObject)noun_compound_parser.$sym106$NCP_HERALD_START, string), (SubLObject)ConsesLow.listS((SubLObject)noun_compound_parser.$sym36$CLET, (SubLObject)noun_compound_parser.$list107, (SubLObject)ConsesLow.listS((SubLObject)noun_compound_parser.$sym108$CTIME, (SubLObject)noun_compound_parser.$sym109$TIME, ConsesLow.append(body, (SubLObject)noun_compound_parser.NIL)), (SubLObject)noun_compound_parser.$list110));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 28000L)
    public static SubLObject parse_noun_compound(final SubLObject string, SubLObject complete_onlyP, SubLObject num) {
        if (complete_onlyP == noun_compound_parser.UNPROVIDED) {
            complete_onlyP = (SubLObject)noun_compound_parser.T;
        }
        if (num == noun_compound_parser.UNPROVIDED) {
            num = (SubLObject)noun_compound_parser.$int111$1000;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (noun_compound_parser.NIL == rbp_check_initializations()) {
            return (SubLObject)noun_compound_parser.NIL;
        }
        final SubLObject parse = new_nc_parse(string);
        SubLObject good = (SubLObject)noun_compound_parser.NIL;
        SubLObject bad = (SubLObject)noun_compound_parser.NIL;
        _csetf_nc_parse_input_strings(parse, rbp_string_tokenize(string));
        final SubLObject _prev_bind_0 = noun_compound_parser.$rbp_input_strings$.currentBinding(thread);
        try {
            noun_compound_parser.$rbp_input_strings$.bind(nc_parse_input_strings(parse), thread);
            _csetf_nc_parse_chart(parse, ncp_chart_init(nc_parse_input_strings(parse), (SubLObject)noun_compound_parser.UNPROVIDED));
            thread.resetMultipleValues();
            final SubLObject good_$5 = parse_noun_compound_int(parse, complete_onlyP, num, (SubLObject)noun_compound_parser.UNPROVIDED);
            final SubLObject bad_$6 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            good = good_$5;
            bad = bad_$6;
        }
        finally {
            noun_compound_parser.$rbp_input_strings$.rebind(_prev_bind_0, thread);
        }
        return Values.values(good, bad);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 29277L)
    public static SubLObject parse_noun_compound_with_rules(final SubLObject string, final SubLObject required_rule_forts, SubLObject complete_onlyP, SubLObject num) {
        if (complete_onlyP == noun_compound_parser.UNPROVIDED) {
            complete_onlyP = (SubLObject)noun_compound_parser.T;
        }
        if (num == noun_compound_parser.UNPROVIDED) {
            num = (SubLObject)noun_compound_parser.$int111$1000;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert noun_compound_parser.NIL != Types.listp(required_rule_forts) : required_rule_forts;
        assert noun_compound_parser.NIL != list_utilities.non_dotted_list_p(required_rule_forts) : required_rule_forts;
        SubLObject cdolist_list_var = required_rule_forts;
        SubLObject elem = (SubLObject)noun_compound_parser.NIL;
        elem = cdolist_list_var.first();
        while (noun_compound_parser.NIL != cdolist_list_var) {
            assert noun_compound_parser.NIL != rbp_rule_fort_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        if (noun_compound_parser.NIL == rbp_check_initializations()) {
            return (SubLObject)noun_compound_parser.NIL;
        }
        final SubLObject parse = new_nc_parse(string);
        final SubLObject required_rbp_rules = Mapping.mapcar((SubLObject)noun_compound_parser.$sym115$RBP_FIND_RULE_FROM_CYCL, required_rule_forts);
        SubLObject good = (SubLObject)noun_compound_parser.NIL;
        SubLObject bad = (SubLObject)noun_compound_parser.NIL;
        _csetf_nc_parse_input_strings(parse, rbp_string_tokenize(string));
        final SubLObject _prev_bind_0 = noun_compound_parser.$rbp_input_strings$.currentBinding(thread);
        try {
            noun_compound_parser.$rbp_input_strings$.bind(nc_parse_input_strings(parse), thread);
            _csetf_nc_parse_chart(parse, ncp_chart_init(nc_parse_input_strings(parse), (SubLObject)noun_compound_parser.UNPROVIDED));
            thread.resetMultipleValues();
            final SubLObject good_$7 = parse_noun_compound_int(parse, complete_onlyP, num, required_rbp_rules);
            final SubLObject bad_$8 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            good = good_$7;
            bad = bad_$8;
        }
        finally {
            noun_compound_parser.$rbp_input_strings$.rebind(_prev_bind_0, thread);
        }
        return Values.values(good, bad);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 30187L)
    public static SubLObject rbp_rule_fort_p(final SubLObject v_object) {
        return isa.isa_in_any_mtP(v_object, noun_compound_parser.$const116$NounCompoundRule);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 30281L)
    public static SubLObject parse_noun_compound_from_string_tokens(final SubLObject string_tokens, SubLObject complete_onlyP, SubLObject num) {
        if (complete_onlyP == noun_compound_parser.UNPROVIDED) {
            complete_onlyP = (SubLObject)noun_compound_parser.T;
        }
        if (num == noun_compound_parser.UNPROVIDED) {
            num = (SubLObject)noun_compound_parser.$int111$1000;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject input_strings = (SubLObject)noun_compound_parser.NIL;
        SubLObject string_stack = (SubLObject)noun_compound_parser.NIL;
        SubLObject cdolist_list_var = string_tokens;
        SubLObject token = (SubLObject)noun_compound_parser.NIL;
        token = cdolist_list_var.first();
        while (noun_compound_parser.NIL != cdolist_list_var) {
            final SubLObject string = standard_tokenization.string_token_string(token);
            if (noun_compound_parser.NIL == string_utilities.non_empty_stringP(string)) {
                return (SubLObject)noun_compound_parser.NIL;
            }
            string_stack = (SubLObject)ConsesLow.cons(string, string_stack);
            cdolist_list_var = cdolist_list_var.rest();
            token = cdolist_list_var.first();
        }
        input_strings = Sequences.nreverse(string_stack);
        final SubLObject input_string = string_utilities.bunge(input_strings, (SubLObject)noun_compound_parser.UNPROVIDED);
        final SubLObject nc_parse = new_nc_parse(input_string);
        _csetf_nc_parse_input_strings(nc_parse, input_strings);
        final SubLObject _prev_bind_0 = noun_compound_parser.$rbp_input_strings$.currentBinding(thread);
        try {
            noun_compound_parser.$rbp_input_strings$.bind(nc_parse_input_strings(nc_parse), thread);
            _csetf_nc_parse_chart(nc_parse, ncp_chart_init_from_string_tokens(string_tokens));
        }
        finally {
            noun_compound_parser.$rbp_input_strings$.rebind(_prev_bind_0, thread);
        }
        return parse_noun_compound_int(nc_parse, complete_onlyP, num, (SubLObject)noun_compound_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 31282L)
    public static SubLObject with_new_ncp_problem_store(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject store = (SubLObject)noun_compound_parser.$sym117$STORE;
        return (SubLObject)ConsesLow.list((SubLObject)noun_compound_parser.$sym118$WITH_NEW_PROBLEM_STORE, (SubLObject)ConsesLow.list(store), (SubLObject)ConsesLow.listS((SubLObject)noun_compound_parser.$sym36$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)noun_compound_parser.$sym119$_NCP_PROBLEM_STORE_, store)), ConsesLow.append(body, (SubLObject)noun_compound_parser.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 31470L)
    public static SubLObject parse_noun_compound_int(final SubLObject nc_parse, final SubLObject complete_onlyP, final SubLObject num, SubLObject required_rbp_rules) {
        if (required_rbp_rules == noun_compound_parser.UNPROVIDED) {
            required_rbp_rules = (SubLObject)noun_compound_parser.$kw97$NONE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject good = (SubLObject)noun_compound_parser.NIL;
        SubLObject bad = (SubLObject)noun_compound_parser.NIL;
        final SubLObject _prev_bind_0 = parsing_vars.$rbp_bypass_deverbal_filtersP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = noun_compound_parser.$rbp_input_strings$.currentBinding(thread);
        try {
            parsing_vars.$rbp_bypass_deverbal_filtersP$.bind((SubLObject)((noun_compound_parser.NIL != complete_onlyP) ? parsing_vars.$rbp_bypass_deverbal_filtersP$.getDynamicValue(thread) : noun_compound_parser.T), thread);
            noun_compound_parser.$rbp_input_strings$.bind(nc_parse_input_strings(nc_parse), thread);
            SubLObject store = (SubLObject)noun_compound_parser.NIL;
            try {
                store = inference_datastructures_problem_store.new_problem_store((SubLObject)noun_compound_parser.NIL);
                final SubLObject _prev_bind_0_$9 = noun_compound_parser.$ncp_problem_store$.currentBinding(thread);
                try {
                    noun_compound_parser.$ncp_problem_store$.bind(store, thread);
                    final SubLObject local_state;
                    final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$10 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                        try {
                            noun_compound_parser.$rbp_rules_to_parses_shadow$.setDynamicValue((SubLObject)noun_compound_parser.NIL, thread);
                            ncp_initialize_metrics();
                            ncp_herald_start(nc_parse_input_string(nc_parse));
                            SubLObject time = (SubLObject)noun_compound_parser.NIL;
                            final SubLObject time_var = Time.get_internal_real_time();
                            final SubLObject chart = nc_parse_chart(nc_parse);
                            final SubLObject parses = rbp_filter_and_sort_result_blocks(rbp_chart_parser.rbp_chart_parse(chart), rbp_chart_parser.rbp_chart_block_hash(nc_parse_chart(nc_parse)), required_rbp_rules);
                            if (noun_compound_parser.NIL != complete_onlyP) {
                                thread.resetMultipleValues();
                                final SubLObject good_pile = display_complete_parses(parses);
                                final SubLObject bad_pile = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                good = list_utilities.first_n(num, good_pile);
                                if (noun_compound_parser.NIL == list_utilities.lengthG(good_pile, num, (SubLObject)noun_compound_parser.UNPROVIDED)) {
                                    bad = list_utilities.first_n(Numbers.subtract(num, Sequences.length(good_pile)), bad_pile);
                                }
                            }
                            else {
                                good = display_all_parses(nc_parse_chart(nc_parse));
                            }
                            time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                            ncp_report_metrics(time);
                        }
                        finally {
                            final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)noun_compound_parser.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                            }
                        }
                    }
                    finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0_$10, thread);
                    }
                }
                finally {
                    noun_compound_parser.$ncp_problem_store$.rebind(_prev_bind_0_$9, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)noun_compound_parser.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    inference_datastructures_problem_store.destroy_problem_store(store);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                }
            }
        }
        finally {
            noun_compound_parser.$rbp_input_strings$.rebind(_prev_bind_2, thread);
            parsing_vars.$rbp_bypass_deverbal_filtersP$.rebind(_prev_bind_0, thread);
        }
        return Values.values(good, bad);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 32955L)
    public static SubLObject ncp_initialize_metrics() {
        nl_reformulator.nl_ref_reset_metrics();
        rbp_wff.rbp_wff_reset_metrics();
        return (SubLObject)noun_compound_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 33097L)
    public static SubLObject ncp_report_metrics(final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (noun_compound_parser.NIL != noun_compound_parser.$rbp_report_parse_timeP$.getDynamicValue(thread)) {
            PrintLow.format((SubLObject)noun_compound_parser.T, (SubLObject)noun_compound_parser.$str120$__Total_parse_time___4_2F_seconds, time);
            rbp_wff.rbp_wff_report_metrics((SubLObject)noun_compound_parser.T);
            nl_reformulator.nl_ref_report_metrics((SubLObject)noun_compound_parser.T);
            PrintLow.format((SubLObject)noun_compound_parser.T, (SubLObject)noun_compound_parser.$str121$__Spent__4_2F_seconds_actually_pa, Numbers.subtract(time, rbp_wff.$rbp_wff_check_time$.getDynamicValue(thread), nl_reformulator.get_nl_reformulator_time()));
        }
        return (SubLObject)noun_compound_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 33467L)
    public static SubLObject ncp_herald_start(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (noun_compound_parser.NIL != noun_compound_parser.$rbp_report_parse_timeP$.getDynamicValue(thread)) {
            streams_high.terpri((SubLObject)noun_compound_parser.T);
            PrintLow.format((SubLObject)noun_compound_parser.T, (SubLObject)noun_compound_parser.$str122$__Now_parsing__S___, string);
        }
        return (SubLObject)noun_compound_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 33890L)
    public static SubLObject rbp_sort_blocks_complexity_first(final SubLObject blocks) {
        final SubLObject sorted = Sort.sort(Sort.sort(blocks, (SubLObject)noun_compound_parser.$sym123$NPP_TERM_COMPLEXITY__, (SubLObject)noun_compound_parser.$sym54$NC_BLOCK_DENOT), (SubLObject)noun_compound_parser.$sym124$_, (SubLObject)noun_compound_parser.$sym52$NC_BLOCK_CONFIDENCE);
        return sorted;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 34079L)
    public static SubLObject rbp_sort_blocks_confidence_first(final SubLObject blocks) {
        final SubLObject sorted = Sort.sort(Sort.sort(blocks, (SubLObject)noun_compound_parser.$sym124$_, (SubLObject)noun_compound_parser.$sym52$NC_BLOCK_CONFIDENCE), (SubLObject)noun_compound_parser.$sym123$NPP_TERM_COMPLEXITY__, (SubLObject)noun_compound_parser.$sym54$NC_BLOCK_DENOT);
        return sorted;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 34268L)
    public static SubLObject rbp_filter_and_sort_result_blocks(final SubLObject blocks, final SubLObject block_hash, SubLObject required_rbp_rules) {
        if (required_rbp_rules == noun_compound_parser.UNPROVIDED) {
            required_rbp_rules = (SubLObject)noun_compound_parser.$kw97$NONE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject filtered_blocks = (SubLObject)noun_compound_parser.NIL;
        SubLObject cdolist_list_var = blocks;
        SubLObject block = (SubLObject)noun_compound_parser.NIL;
        block = cdolist_list_var.first();
        while (noun_compound_parser.NIL != cdolist_list_var) {
            if (noun_compound_parser.NIL == parsing_macros.parsing_timeout_time_reachedP()) {
                if (noun_compound_parser.NIL == nc_block_uses_required_rules_p(block, required_rbp_rules, block_hash)) {
                    if (noun_compound_parser.NIL != subl_promotions.memberP(nc_block_rule(block), rbp_traced_rules(), (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED)) {
                        Errors.warn((SubLObject)noun_compound_parser.$str125$___S_didn_t_use_the_required_rule, nc_block_denot(block), required_rbp_rules);
                    }
                }
                else if (noun_compound_parser.NIL != rbp_parse_wrong_sizeP(block, block_hash)) {
                    if (noun_compound_parser.NIL != subl_promotions.memberP(nc_block_rule(block), rbp_traced_rules(), (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED)) {
                        Errors.warn((SubLObject)noun_compound_parser.$str126$___S_was_too_long_or_too_short___, nc_block_denot(block));
                    }
                }
                else if (noun_compound_parser.NIL != noun_compound_parser.$nominal_interpretations_only$.getDynamicValue(thread) && noun_compound_parser.NIL == rbp_nominal_blockP(block)) {
                    if (noun_compound_parser.NIL != subl_promotions.memberP(nc_block_rule(block), rbp_traced_rules(), (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED)) {
                        Errors.warn((SubLObject)noun_compound_parser.$str127$__The__S_form_of____S___is_being_, nc_block_head_string_pred(block), nc_block_denot(block));
                    }
                }
                else {
                    filtered_blocks = (SubLObject)ConsesLow.cons(block, filtered_blocks);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            block = cdolist_list_var.first();
        }
        filtered_blocks = rbp_unify_city_named_fn_blocks(filtered_blocks);
        if (noun_compound_parser.NIL != list_utilities.lengthG(filtered_blocks, (SubLObject)noun_compound_parser.ONE_INTEGER, (SubLObject)noun_compound_parser.UNPROVIDED)) {
            SubLObject boolean_clusters = (SubLObject)ConsesLow.list(noun_compound_parser.$rbp_universal_boolean_filters$.getDynamicValue(thread));
            SubLObject macroscopic_clusters = (SubLObject)noun_compound_parser.NIL;
            if (noun_compound_parser.NIL != parsing_vars.$rbp_apply_all_filters_regardlessP$.getDynamicValue(thread) || (noun_compound_parser.NIL == parsing_vars.$rbp_bypass_deverbal_filtersP$.getDynamicValue(thread) && noun_compound_parser.NIL != rbp_deverbal_candidateP(string_utilities.bunge(noun_compound_parser.$rbp_input_strings$.getDynamicValue(thread), (SubLObject)noun_compound_parser.UNPROVIDED)))) {
                boolean_clusters = (SubLObject)ConsesLow.cons(noun_compound_parser.$rbp_deverbal_boolean_filters$.getDynamicValue(thread), boolean_clusters);
                macroscopic_clusters = (SubLObject)ConsesLow.cons(noun_compound_parser.$rbp_deverbal_macroscopic_block_filters$.getDynamicValue(thread), macroscopic_clusters);
            }
            filtered_blocks = rbp_process_filter_clusters(boolean_clusters, filtered_blocks, (SubLObject)noun_compound_parser.$kw99$BOOLEAN);
            filtered_blocks = rbp_process_filter_clusters(macroscopic_clusters, filtered_blocks, (SubLObject)noun_compound_parser.$kw128$MACROSCOPIC);
        }
        if (noun_compound_parser.NIL == parsing_vars.$rbp_bypass_block_unificationP$.getDynamicValue(thread)) {
            filtered_blocks = rbp_unify_blocks_to_common_specpreds(filtered_blocks);
        }
        if (noun_compound_parser.NIL != parsing_vars.$rbp_reformulate_resultsP$.getDynamicValue(thread)) {
            cdolist_list_var = filtered_blocks;
            block = (SubLObject)noun_compound_parser.NIL;
            block = cdolist_list_var.first();
            while (noun_compound_parser.NIL != cdolist_list_var) {
                _csetf_nc_block_denot(block, nl_reformulator.nl_reformulate(nc_block_denot(block), (SubLObject)noun_compound_parser.UNPROVIDED));
                cdolist_list_var = cdolist_list_var.rest();
                block = cdolist_list_var.first();
            }
        }
        else {
            filtered_blocks = rbp_unify_rewrite_of_blocks(filtered_blocks);
        }
        cdolist_list_var = filtered_blocks;
        block = (SubLObject)noun_compound_parser.NIL;
        block = cdolist_list_var.first();
        while (noun_compound_parser.NIL != cdolist_list_var) {
            _csetf_nc_block_confidence(block, Numbers.multiply(nc_block_confidence(block), rbp_block_reliability_estimate(block, block_hash)));
            cdolist_list_var = cdolist_list_var.rest();
            block = cdolist_list_var.first();
        }
        return (noun_compound_parser.NIL != noun_compound_parser.$rbp_sort_blocks_confidence_firstP$.getDynamicValue(thread)) ? rbp_sort_blocks_confidence_first(filtered_blocks) : rbp_sort_blocks_complexity_first(filtered_blocks);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 37503L)
    public static SubLObject rbp_block_reliability_estimate(final SubLObject block, SubLObject wrt_block_hash) {
        if (wrt_block_hash == noun_compound_parser.UNPROVIDED) {
            wrt_block_hash = (SubLObject)noun_compound_parser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (noun_compound_parser.NIL != nc_block_sub_tree(block)) {
            return Numbers.multiply(rbp_block_reliability_estimate(nc_block_mod_block(block, wrt_block_hash), wrt_block_hash), rbp_block_reliability_estimate(nc_block_head_block(block, wrt_block_hash), wrt_block_hash));
        }
        SubLObject cdolist_list_var = Mapping.mapcar((SubLObject)noun_compound_parser.$sym132$LEXIFICATION_SENTENCE_FROM_PREFERRED_LEXIFICATION_ASSERTION, lexicon_utilities.gen_string_assertions_for_term(nc_block_denot(block), (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED));
        SubLObject lex = (SubLObject)noun_compound_parser.NIL;
        lex = cdolist_list_var.first();
        while (noun_compound_parser.NIL != cdolist_list_var) {
            if (noun_compound_parser.NIL != lexicon_utilities.lexical_semantic_formula_genl_posP(lex, noun_compound_parser.$const131$Noun, (SubLObject)noun_compound_parser.UNPROVIDED) && noun_compound_parser.NIL != lexicon_utilities.lexical_semantic_formula_matches_head_stringXposP(lex, nc_block_spanned_string(block), noun_compound_parser.$const131$Noun, (SubLObject)noun_compound_parser.UNPROVIDED)) {
                return noun_compound_parser.$rbp_reliability_high$.getDynamicValue(thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lex = cdolist_list_var.first();
        }
        if (noun_compound_parser.NIL != string_utilities.substringP((SubLObject)noun_compound_parser.$str88$_, nc_block_spanned_string(block), (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED)) {
            return noun_compound_parser.$rbp_reliability_medium$.getDynamicValue(thread);
        }
        if (noun_compound_parser.NIL != list_utilities.lengthE(lexicon_utilities.lexifications_for_term(nc_block_denot(block), (SubLObject)noun_compound_parser.NIL, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED), (SubLObject)noun_compound_parser.ONE_INTEGER, (SubLObject)noun_compound_parser.UNPROVIDED)) {
            return noun_compound_parser.$rbp_reliability_medium$.getDynamicValue(thread);
        }
        return noun_compound_parser.$rbp_reliability_low$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 38582L)
    public static SubLObject rbp_unify_blocks_to_common_specpreds(final SubLObject blocks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (noun_compound_parser.NIL == list_utilities.lengthG(blocks, (SubLObject)noun_compound_parser.ONE_INTEGER, (SubLObject)noun_compound_parser.UNPROVIDED)) {
            return blocks;
        }
        final SubLObject blocks_by_codes = dictionary.new_dictionary((SubLObject)noun_compound_parser.EQUAL, (SubLObject)noun_compound_parser.UNPROVIDED);
        final SubLObject precise_blocks = set_utilities.construct_set_from_list(blocks, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED);
        SubLObject cdolist_list_var = blocks;
        SubLObject this_block = (SubLObject)noun_compound_parser.NIL;
        this_block = cdolist_list_var.first();
        while (noun_compound_parser.NIL != cdolist_list_var) {
            if (noun_compound_parser.NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(nc_block_denot(this_block))) {
                final SubLObject this_code = (SubLObject)ConsesLow.list(nc_block_head_string_pred(this_block), cycl_utilities.formula_arg0(nc_block_denot(this_block)), nc_block_filters(this_block));
                dictionary_utilities.dictionary_push(blocks_by_codes, this_code, this_block);
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_block = cdolist_list_var.first();
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(blocks_by_codes)); noun_compound_parser.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject this_code2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject these_blocks = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject subcolfunc = conses_high.second(this_code2);
            final SubLObject blocks_by_args = dictionary.new_dictionary((SubLObject)noun_compound_parser.EQUAL, (SubLObject)noun_compound_parser.UNPROVIDED);
            final SubLObject validity_check = (SubLObject)((noun_compound_parser.NIL != isa.isa_in_any_mtP(subcolfunc, noun_compound_parser.$const133$SubcollectionRelationFunction_Typ)) ? noun_compound_parser.$sym134$NPP_GENL_ : noun_compound_parser.$sym135$NPP_ISA_);
            SubLObject cdolist_list_var2 = these_blocks;
            SubLObject this_block2 = (SubLObject)noun_compound_parser.NIL;
            this_block2 = cdolist_list_var2.first();
            while (noun_compound_parser.NIL != cdolist_list_var2) {
                final SubLObject denot = nc_block_denot(this_block2);
                final SubLObject key = (SubLObject)ConsesLow.list(parsing_utilities.subcollection_function_naut_from_arg(denot), parsing_utilities.subcollection_function_naut_to_arg(denot));
                dictionary_utilities.dictionary_push(blocks_by_args, key, this_block2);
                cdolist_list_var2 = cdolist_list_var2.rest();
                this_block2 = cdolist_list_var2.first();
            }
            SubLObject iteration_state_$13;
            for (iteration_state_$13 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(blocks_by_args)); noun_compound_parser.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$13); iteration_state_$13 = dictionary_contents.do_dictionary_contents_next(iteration_state_$13)) {
                thread.resetMultipleValues();
                final SubLObject these_args = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$13);
                final SubLObject these_blocks_by_args = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (noun_compound_parser.NIL != list_utilities.lengthG(these_blocks_by_args, (SubLObject)noun_compound_parser.ONE_INTEGER, (SubLObject)noun_compound_parser.UNPROVIDED)) {
                    SubLObject cached_preds = (SubLObject)noun_compound_parser.NIL;
                    SubLObject precise_preds = (SubLObject)noun_compound_parser.NIL;
                    final SubLObject mt = rbp_domain_mt();
                    cached_preds = list_utilities.mapcar_unique((SubLObject)noun_compound_parser.$sym136$SUBCOLLECTION_FUNCTION_NAUT_PRED, Mapping.mapcar((SubLObject)noun_compound_parser.$sym54$NC_BLOCK_DENOT, these_blocks_by_args), (SubLObject)noun_compound_parser.UNPROVIDED);
                    if (noun_compound_parser.NIL != list_utilities.lengthG(cached_preds, (SubLObject)noun_compound_parser.ONE_INTEGER, (SubLObject)noun_compound_parser.UNPROVIDED)) {
                        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            final SubLObject pred_var = noun_compound_parser.$const137$relationAllExists;
                            if (noun_compound_parser.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(these_args.first(), (SubLObject)noun_compound_parser.TWO_INTEGER, pred_var)) {
                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(these_args.first(), (SubLObject)noun_compound_parser.TWO_INTEGER, pred_var);
                                SubLObject done_var = (SubLObject)noun_compound_parser.NIL;
                                final SubLObject token_var = (SubLObject)noun_compound_parser.NIL;
                                while (noun_compound_parser.NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                    if (noun_compound_parser.NIL != valid) {
                                        SubLObject final_index_iterator = (SubLObject)noun_compound_parser.NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)noun_compound_parser.$kw138$GAF, (SubLObject)noun_compound_parser.NIL, (SubLObject)noun_compound_parser.NIL);
                                            SubLObject done_var_$14 = (SubLObject)noun_compound_parser.NIL;
                                            final SubLObject token_var_$15 = (SubLObject)noun_compound_parser.NIL;
                                            while (noun_compound_parser.NIL == done_var_$14) {
                                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$15);
                                                final SubLObject valid_$16 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$15.eql(ass));
                                                if (noun_compound_parser.NIL != valid_$16) {
                                                    final SubLObject gaf_pred = cycl_utilities.formula_arg1(ass, (SubLObject)noun_compound_parser.UNPROVIDED);
                                                    if (noun_compound_parser.NIL == subl_promotions.memberP(gaf_pred, cached_preds, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED) && noun_compound_parser.NIL != Functions.funcall(validity_check, conses_high.second(these_args), cycl_utilities.formula_arg3(ass, (SubLObject)noun_compound_parser.UNPROVIDED), mt)) {
                                                        SubLObject badP = (SubLObject)noun_compound_parser.NIL;
                                                        if (noun_compound_parser.NIL == badP) {
                                                            SubLObject csome_list_var = cached_preds;
                                                            SubLObject genl = (SubLObject)noun_compound_parser.NIL;
                                                            genl = csome_list_var.first();
                                                            while (noun_compound_parser.NIL == badP && noun_compound_parser.NIL != csome_list_var) {
                                                                if (noun_compound_parser.NIL == genl_predicates.genl_predicateP(gaf_pred, genl, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED)) {
                                                                    badP = (SubLObject)noun_compound_parser.T;
                                                                }
                                                                csome_list_var = csome_list_var.rest();
                                                                genl = csome_list_var.first();
                                                            }
                                                        }
                                                        if (noun_compound_parser.NIL == badP) {
                                                            precise_preds = (SubLObject)ConsesLow.cons(gaf_pred, precise_preds);
                                                        }
                                                    }
                                                }
                                                done_var_$14 = (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_parser.NIL == valid_$16);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)noun_compound_parser.T, thread);
                                                final SubLObject _values = Values.getValuesAsVector();
                                                if (noun_compound_parser.NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                Values.restoreValuesFromVector(_values);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                                            }
                                        }
                                    }
                                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_parser.NIL == valid);
                                }
                            }
                        }
                        finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                        }
                        if (noun_compound_parser.NIL != precise_preds) {
                            SubLObject recycled_block = (SubLObject)noun_compound_parser.NIL;
                            SubLObject max_confidence = (SubLObject)noun_compound_parser.NIL;
                            SubLObject cdolist_list_var3 = these_blocks_by_args;
                            SubLObject block = (SubLObject)noun_compound_parser.NIL;
                            block = cdolist_list_var3.first();
                            while (noun_compound_parser.NIL != cdolist_list_var3) {
                                if (noun_compound_parser.NIL == precise_preds) {
                                    max_confidence = Numbers.max(nc_block_confidence(block), max_confidence);
                                    set.set_remove(block, precise_blocks);
                                }
                                else {
                                    final SubLObject precise_pred = precise_preds.first();
                                    if (noun_compound_parser.NIL != noun_compound_parser.$rbp_show_successful_rulesP$.getDynamicValue(thread) || noun_compound_parser.NIL != conses_high.member(nc_block_rule(block), rbp_traced_rules(), (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED)) {
                                        Errors.warn((SubLObject)noun_compound_parser.$str139$Strengthening__S_to_use__S, nc_block_denot(block), precise_pred);
                                    }
                                    _csetf_nc_block_denot(block, el_utilities.replace_formula_arg((SubLObject)noun_compound_parser.TWO_INTEGER, precise_pred, nc_block_denot(block)));
                                    recycled_block = block;
                                    max_confidence = nc_block_confidence(block);
                                    precise_preds = precise_preds.rest();
                                }
                                cdolist_list_var3 = cdolist_list_var3.rest();
                                block = cdolist_list_var3.first();
                            }
                            _csetf_nc_block_confidence(recycled_block, max_confidence);
                        }
                    }
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$13);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return set.set_element_list(precise_blocks);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 42257L)
    public static SubLObject rbp_unify_rewrite_of_blocks(final SubLObject blocks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject denots = list_utilities.mapcar_unique((SubLObject)noun_compound_parser.$sym54$NC_BLOCK_DENOT, blocks, (SubLObject)noun_compound_parser.EQUAL);
        final SubLObject block_set = set_utilities.construct_set_from_list(blocks, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(rbp_domain_mt());
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = blocks;
            SubLObject this_block = (SubLObject)noun_compound_parser.NIL;
            this_block = cdolist_list_var.first();
            while (noun_compound_parser.NIL != cdolist_list_var) {
                SubLObject removedP = (SubLObject)noun_compound_parser.NIL;
                SubLObject core_fort = (SubLObject)noun_compound_parser.NIL;
                final SubLObject pred_var = noun_compound_parser.$const140$rewriteOf;
                if (noun_compound_parser.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(narts_high.nart_substitute(nc_block_denot(this_block)), (SubLObject)noun_compound_parser.TWO_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(narts_high.nart_substitute(nc_block_denot(this_block)), (SubLObject)noun_compound_parser.TWO_INTEGER, pred_var);
                    SubLObject done_var = removedP;
                    final SubLObject token_var = (SubLObject)noun_compound_parser.NIL;
                    while (noun_compound_parser.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (noun_compound_parser.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)noun_compound_parser.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)noun_compound_parser.$kw138$GAF, (SubLObject)noun_compound_parser.NIL, (SubLObject)noun_compound_parser.NIL);
                                SubLObject done_var_$18 = removedP;
                                final SubLObject token_var_$19 = (SubLObject)noun_compound_parser.NIL;
                                while (noun_compound_parser.NIL == done_var_$18) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$19);
                                    final SubLObject valid_$20 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$19.eql(assertion));
                                    if (noun_compound_parser.NIL != valid_$20) {
                                        core_fort = assertions_high.gaf_arg(assertion, (SubLObject)noun_compound_parser.ONE_INTEGER);
                                        if (noun_compound_parser.NIL != subl_promotions.memberP(core_fort, denots, (SubLObject)noun_compound_parser.EQUAL, (SubLObject)noun_compound_parser.UNPROVIDED)) {
                                            set.set_remove(this_block, block_set);
                                            removedP = (SubLObject)noun_compound_parser.T;
                                        }
                                    }
                                    done_var_$18 = (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_parser.NIL == valid_$20 || noun_compound_parser.NIL != removedP);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)noun_compound_parser.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (noun_compound_parser.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_parser.NIL == valid || noun_compound_parser.NIL != removedP);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                this_block = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return set.set_element_list(block_set);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 42912L)
    public static SubLObject rbp_unify_city_named_fn_blocks(final SubLObject blocks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject denots = list_utilities.mapcar_unique((SubLObject)noun_compound_parser.$sym54$NC_BLOCK_DENOT, blocks, (SubLObject)noun_compound_parser.EQUAL);
        final SubLObject block_set = set_utilities.construct_set_from_list(blocks, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(rbp_domain_mt());
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = blocks;
            SubLObject this_block = (SubLObject)noun_compound_parser.NIL;
            this_block = cdolist_list_var.first();
            while (noun_compound_parser.NIL != cdolist_list_var) {
                final SubLObject expanded = narts_high.nart_expand(nc_block_denot(this_block));
                if (noun_compound_parser.NIL != el_utilities.formula_arityE(expanded, (SubLObject)noun_compound_parser.TWO_INTEGER, (SubLObject)noun_compound_parser.UNPROVIDED)) {
                    SubLObject current;
                    final SubLObject datum = current = expanded;
                    SubLObject denot_arg0 = (SubLObject)noun_compound_parser.NIL;
                    SubLObject denot_arg2 = (SubLObject)noun_compound_parser.NIL;
                    SubLObject denot_arg3 = (SubLObject)noun_compound_parser.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)noun_compound_parser.$list141);
                    denot_arg0 = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)noun_compound_parser.$list141);
                    denot_arg2 = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)noun_compound_parser.$list141);
                    denot_arg3 = current.first();
                    current = current.rest();
                    if (noun_compound_parser.NIL == current) {
                        if (denot_arg0.eql(noun_compound_parser.$const142$CityNamedFn)) {
                            if (noun_compound_parser.NIL != isa.isaP(denot_arg3, noun_compound_parser.$const143$State_Geopolitical, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED)) {
                                SubLObject removedP = (SubLObject)noun_compound_parser.NIL;
                                if (noun_compound_parser.NIL == removedP) {
                                    SubLObject csome_list_var = denots;
                                    SubLObject denot_from_set = (SubLObject)noun_compound_parser.NIL;
                                    denot_from_set = csome_list_var.first();
                                    while (noun_compound_parser.NIL == removedP && noun_compound_parser.NIL != csome_list_var) {
                                        if (noun_compound_parser.NIL != constant_handles.constant_p(denot_from_set) && noun_compound_parser.NIL != rbp_wff.npp_search_gafs_gp(noun_compound_parser.$const144$cityInState, denot_from_set, (SubLObject)noun_compound_parser.ONE_INTEGER, denot_arg3, (SubLObject)noun_compound_parser.TWO_INTEGER, (SubLObject)noun_compound_parser.EQL, rbp_domain_mt()) && noun_compound_parser.NIL != rbp_wff.npp_search_gafs_gp(noun_compound_parser.$const145$nameString, denot_from_set, (SubLObject)noun_compound_parser.ONE_INTEGER, denot_arg2, (SubLObject)noun_compound_parser.TWO_INTEGER, (SubLObject)noun_compound_parser.$sym146$STRING_, lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread))) {
                                            set.set_remove(this_block, block_set);
                                            removedP = (SubLObject)noun_compound_parser.T;
                                        }
                                        csome_list_var = csome_list_var.rest();
                                        denot_from_set = csome_list_var.first();
                                    }
                                }
                            }
                            else if (noun_compound_parser.NIL != isa.isaP(denot_arg3, noun_compound_parser.$const147$Country, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED)) {
                                SubLObject removedP = (SubLObject)noun_compound_parser.NIL;
                                if (noun_compound_parser.NIL == removedP) {
                                    SubLObject csome_list_var = denots;
                                    SubLObject denot_from_set = (SubLObject)noun_compound_parser.NIL;
                                    denot_from_set = csome_list_var.first();
                                    while (noun_compound_parser.NIL == removedP && noun_compound_parser.NIL != csome_list_var) {
                                        if (noun_compound_parser.NIL != constant_handles.constant_p(denot_from_set) && noun_compound_parser.NIL != rbp_wff.npp_search_gafs_gp(noun_compound_parser.$const148$countryOfCity, denot_from_set, (SubLObject)noun_compound_parser.TWO_INTEGER, denot_arg3, (SubLObject)noun_compound_parser.ONE_INTEGER, (SubLObject)noun_compound_parser.EQL, rbp_domain_mt()) && noun_compound_parser.NIL != rbp_wff.npp_search_gafs_gp(noun_compound_parser.$const145$nameString, denot_from_set, (SubLObject)noun_compound_parser.ONE_INTEGER, denot_arg2, (SubLObject)noun_compound_parser.TWO_INTEGER, (SubLObject)noun_compound_parser.$sym146$STRING_, rbp_domain_mt())) {
                                            set.set_remove(this_block, block_set);
                                            removedP = (SubLObject)noun_compound_parser.T;
                                        }
                                        csome_list_var = csome_list_var.rest();
                                        denot_from_set = csome_list_var.first();
                                    }
                                }
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)noun_compound_parser.$list141);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                this_block = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return set.set_element_list(block_set);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 44877L)
    public static SubLObject rbp_nominal_blockP(final SubLObject block) {
        return (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_parser.NIL != rbp_wff.npp_genlP(nc_block_head_pos(block), noun_compound_parser.$const131$Noun, (SubLObject)noun_compound_parser.UNPROVIDED) || noun_compound_parser.NIL != rbp_wff.npp_genlP(nc_block_head_pos(block), noun_compound_parser.$const149$NounPhrase, (SubLObject)noun_compound_parser.UNPROVIDED) || nc_block_head_string_pred(block) == noun_compound_parser.$kw150$ORIGINAL_STRING || noun_compound_parser.NIL != rbp_wff.npp_genl_predP(nc_block_head_string_pred(block), noun_compound_parser.$const151$gerund));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 45163L)
    public static SubLObject display_complete_parses(final SubLObject list_of_blocks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject good_stack = (SubLObject)noun_compound_parser.NIL;
        SubLObject bad_stack = (SubLObject)noun_compound_parser.NIL;
        final SubLObject full_confidence = list_utilities.safe_max(Mapping.mapcar((SubLObject)noun_compound_parser.$sym52$NC_BLOCK_CONFIDENCE, list_of_blocks), (SubLObject)noun_compound_parser.UNPROVIDED);
        final SubLObject rules_to_details = (SubLObject)((noun_compound_parser.NIL != noun_compound_parser.$rbp_shadow_rulesP$.getDynamicValue(thread)) ? dictionary.new_dictionary((SubLObject)noun_compound_parser.EQUAL, (SubLObject)noun_compound_parser.UNPROVIDED) : noun_compound_parser.NIL);
        SubLObject cdolist_list_var = list_of_blocks;
        SubLObject block = (SubLObject)noun_compound_parser.NIL;
        block = cdolist_list_var.first();
        while (noun_compound_parser.NIL != cdolist_list_var) {
            final SubLObject pred = nc_block_head_string_pred(block);
            final SubLObject denot = nc_block_denot(block);
            final SubLObject filters = nc_block_filters(block);
            final SubLObject rule = nc_block_rule(block);
            SubLObject details = np_parser.make_npp_parse(denot, pred);
            final SubLObject non_confidentP = (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_parser.NIL != filters && full_confidence.numG(nc_block_confidence(block)));
            if (noun_compound_parser.NIL != non_confidentP) {
                details = (SubLObject)ConsesLow.list(details, filters);
            }
            if (noun_compound_parser.NIL != non_confidentP) {
                final SubLObject item_var = (noun_compound_parser.NIL != noun_compound_parser.$rbp_return_confidenceP$.getDynamicValue(thread)) ? ConsesLow.append(details, (SubLObject)ConsesLow.list(nc_block_confidence(block))) : details;
                if (noun_compound_parser.NIL == conses_high.member(item_var, bad_stack, (SubLObject)noun_compound_parser.EQUAL, Symbols.symbol_function((SubLObject)noun_compound_parser.IDENTITY))) {
                    bad_stack = (SubLObject)ConsesLow.cons(item_var, bad_stack);
                }
            }
            else if (noun_compound_parser.NIL != noun_compound_parser.$rbp_return_confidenceP$.getDynamicValue(thread)) {
                final SubLObject item_var = ConsesLow.append(details, (SubLObject)ConsesLow.list(nc_block_confidence(block)));
                if (noun_compound_parser.NIL == conses_high.member(item_var, good_stack, (SubLObject)noun_compound_parser.$sym152$RBP_PARSE_AND_CONFIDENCE_, Symbols.symbol_function((SubLObject)noun_compound_parser.IDENTITY))) {
                    good_stack = (SubLObject)ConsesLow.cons(item_var, good_stack);
                }
            }
            else {
                final SubLObject item_var = details;
                if (noun_compound_parser.NIL == conses_high.member(item_var, good_stack, (SubLObject)noun_compound_parser.$sym153$NPP_PARSE_, Symbols.symbol_function((SubLObject)noun_compound_parser.IDENTITY))) {
                    good_stack = (SubLObject)ConsesLow.cons(item_var, good_stack);
                }
            }
            if (noun_compound_parser.NIL != noun_compound_parser.$rbp_shadow_rulesP$.getDynamicValue(thread)) {
                dictionary_utilities.dictionary_push(rules_to_details, nc_block_rule(block), details);
            }
            cdolist_list_var = cdolist_list_var.rest();
            block = cdolist_list_var.first();
        }
        if (noun_compound_parser.NIL != noun_compound_parser.$rbp_shadow_rulesP$.getDynamicValue(thread)) {
            noun_compound_parser.$rbp_rules_to_parses_shadow$.setDynamicValue(dictionary_utilities.copy_dictionary(rules_to_details), thread);
        }
        return Values.values(Sequences.nreverse(good_stack), Sequences.nreverse(bad_stack));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 46768L)
    public static SubLObject nc_block_uses_required_rules_p(final SubLObject block, final SubLObject required_rbp_rules, final SubLObject block_hash) {
        if (required_rbp_rules.isList()) {
            SubLObject failP = (SubLObject)noun_compound_parser.NIL;
            if (noun_compound_parser.NIL == failP) {
                SubLObject csome_list_var = required_rbp_rules;
                SubLObject required_rbp_rule = (SubLObject)noun_compound_parser.NIL;
                required_rbp_rule = csome_list_var.first();
                while (noun_compound_parser.NIL == failP && noun_compound_parser.NIL != csome_list_var) {
                    if (noun_compound_parser.NIL == nc_block_uses_required_rule_p(block, required_rbp_rule, block_hash)) {
                        failP = (SubLObject)noun_compound_parser.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    required_rbp_rule = csome_list_var.first();
                }
            }
            return (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_parser.NIL == failP);
        }
        return (SubLObject)noun_compound_parser.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 47221L)
    public static SubLObject nc_block_uses_required_rule_p(final SubLObject block, final SubLObject required_rbp_rule, final SubLObject block_hash) {
        if (nc_block_rule(block).eql(required_rbp_rule)) {
            return (SubLObject)noun_compound_parser.T;
        }
        if (noun_compound_parser.NIL == nc_block_sub_tree(block)) {
            return (SubLObject)noun_compound_parser.NIL;
        }
        if (noun_compound_parser.NIL != nc_block_uses_required_rule_p(nc_block_mod_block(block, block_hash), required_rbp_rule, block_hash)) {
            return (SubLObject)noun_compound_parser.T;
        }
        if (noun_compound_parser.NIL != nc_block_uses_required_rule_p(nc_block_head_block(block, block_hash), required_rbp_rule, block_hash)) {
            return (SubLObject)noun_compound_parser.T;
        }
        return (SubLObject)noun_compound_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 47691L)
    public static SubLObject rbp_parse_and_confidenceP(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(obj.isCons() && noun_compound_parser.NIL != list_utilities.lengthE(obj, (SubLObject)noun_compound_parser.THREE_INTEGER, (SubLObject)noun_compound_parser.UNPROVIDED) && noun_compound_parser.NIL != lexicon_accessors.speech_part_predP(conses_high.second(obj), (SubLObject)noun_compound_parser.UNPROVIDED) && (noun_compound_parser.NIL == conses_high.third(obj) || conses_high.third(obj).isNumber()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 47886L)
    public static SubLObject rbp_parse_and_confidenceE(final SubLObject parse1, final SubLObject parse2) {
        assert noun_compound_parser.NIL != rbp_parse_and_confidenceP(parse1) : parse1;
        assert noun_compound_parser.NIL != rbp_parse_and_confidenceP(parse2) : parse2;
        return (SubLObject)SubLObjectFactory.makeBoolean(parse1.first().equalp(parse2.first()) && conses_high.second(parse1).equal(conses_high.second(parse2)) && conses_high.third(parse1).eql(conses_high.third(parse2)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 48382L)
    public static SubLObject ncp_chart_init(SubLObject strings, SubLObject filterP) {
        if (strings == noun_compound_parser.UNPROVIDED) {
            strings = noun_compound_parser.$rbp_input_strings$.getDynamicValue();
        }
        if (filterP == noun_compound_parser.UNPROVIDED) {
            filterP = noun_compound_parser.$rbp_chart_filterP$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject value_type = (SubLObject)((noun_compound_parser.NIL != parsing_vars.$rbp_include_word_unitsP$.getDynamicValue(thread)) ? noun_compound_parser.$kw155$QUADS : noun_compound_parser.$kw156$TRIPLES);
        final SubLObject filter_no_denot_tokensP = (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_parser.NIL == parsing_vars.$rbp_include_word_unitsP$.getDynamicValue(thread));
        final SubLObject raw_tokens = np_parser.npp_tokenize_strings(strings, value_type, filter_no_denot_tokensP);
        final SubLObject verbless_tokens = rbp_filter_verbs(raw_tokens);
        final SubLObject input_length = Sequences.length(strings);
        final SubLObject tokens = (noun_compound_parser.NIL != filterP) ? rbp_remove_subsumed_tokens(verbless_tokens, input_length) : verbless_tokens;
        final SubLObject chart = new_ncp_chart(input_length);
        return ncp_chart_init_int(chart, tokens);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 49057L)
    public static SubLObject ncp_chart_init_from_string_tokens(final SubLObject string_tokens) {
        final SubLObject input_length = Sequences.length(string_tokens);
        final SubLObject chart = new_ncp_chart(input_length);
        SubLObject interval_tokens = (SubLObject)noun_compound_parser.NIL;
        SubLObject i;
        SubLObject s_token;
        for (i = (SubLObject)noun_compound_parser.NIL, i = (SubLObject)noun_compound_parser.ZERO_INTEGER; i.numL(input_length); i = Numbers.add(i, (SubLObject)noun_compound_parser.ONE_INTEGER)) {
            s_token = ConsesLow.nth(i, string_tokens);
            interval_tokens = (SubLObject)ConsesLow.cons(standard_tokenization.new_interval_token(i, number_utilities.f_1X(i), s_token), interval_tokens);
        }
        return ncp_chart_init_int(chart, interval_tokens);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 49432L)
    public static SubLObject new_ncp_chart(final SubLObject input_length) {
        final SubLObject edges = Hashtables.make_hash_table((SubLObject)noun_compound_parser.$int157$256, Symbols.symbol_function((SubLObject)noun_compound_parser.EQL), (SubLObject)noun_compound_parser.UNPROVIDED);
        final SubLObject block_merge_fn = (SubLObject)noun_compound_parser.$sym86$COMBINE_NOUN_COMPOUND_BLOCKS;
        final SubLObject block_hash = Hashtables.make_hash_table((SubLObject)noun_compound_parser.$int157$256, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED);
        final SubLObject done_spans = Hashtables.make_hash_table((SubLObject)noun_compound_parser.$int157$256, Symbols.symbol_function((SubLObject)noun_compound_parser.EQL), (SubLObject)noun_compound_parser.UNPROVIDED);
        return rbp_chart_parser.new_rbp_chart(input_length, edges, done_spans, block_merge_fn, block_hash);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 49820L)
    public static SubLObject ncp_chart_init_int(final SubLObject chart, final SubLObject tokens) {
        final SubLObject input_length = rbp_chart_parser.rbp_chart_input_length(chart);
        SubLObject cdolist_list_var = tokens;
        SubLObject token = (SubLObject)noun_compound_parser.NIL;
        token = cdolist_list_var.first();
        while (noun_compound_parser.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$22 = token_to_blocks(token);
            SubLObject block = (SubLObject)noun_compound_parser.NIL;
            block = cdolist_list_var_$22.first();
            while (noun_compound_parser.NIL != cdolist_list_var_$22) {
                if (noun_compound_parser.NIL != nc_block_head(block) && noun_compound_parser.NIL == rbp_input_spanning_blockP(block, input_length)) {
                    rbp_chart_parser.rbp_chart_add(block, chart);
                }
                cdolist_list_var_$22 = cdolist_list_var_$22.rest();
                block = cdolist_list_var_$22.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            token = cdolist_list_var.first();
        }
        return chart;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 50254L)
    public static SubLObject rbp_input_spanning_blockP(final SubLObject block, final SubLObject input_length) {
        final SubLObject span = nc_block_span_index(block);
        return (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_parser.NIL != interval_span.interval_span_p(span) && interval_span.interval_span_length(span).eql(input_length));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 50460L)
    public static SubLObject rbp_filter_verbs(final SubLObject tokens) {
        SubLObject cdolist_list_var = tokens;
        SubLObject token = (SubLObject)noun_compound_parser.NIL;
        token = cdolist_list_var.first();
        while (noun_compound_parser.NIL != cdolist_list_var) {
            standard_tokenization.string_token_value_set(standard_tokenization.interval_token_value(token), rbp_filter_verbs_in_tuples(standard_tokenization.string_token_value(standard_tokenization.interval_token_value(token))));
            cdolist_list_var = cdolist_list_var.rest();
            token = cdolist_list_var.first();
        }
        return tokens;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 50839L)
    public static SubLObject rbp_filter_verbs_in_tuples(final SubLObject tuples) {
        SubLObject ans = (SubLObject)noun_compound_parser.NIL;
        SubLObject cdolist_list_var = tuples;
        SubLObject tuple = (SubLObject)noun_compound_parser.NIL;
        tuple = cdolist_list_var.first();
        while (noun_compound_parser.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tuple;
            SubLObject denot = (SubLObject)noun_compound_parser.NIL;
            SubLObject pos = (SubLObject)noun_compound_parser.NIL;
            SubLObject pred = (SubLObject)noun_compound_parser.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)noun_compound_parser.$list90);
            denot = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)noun_compound_parser.$list90);
            pos = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)noun_compound_parser.$list90);
            pred = current.first();
            current = current.rest();
            final SubLObject wu = (SubLObject)(current.isCons() ? current.first() : noun_compound_parser.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)noun_compound_parser.$list90);
            current = current.rest();
            if (noun_compound_parser.NIL == current) {
                if (noun_compound_parser.NIL == lexicon_accessors.genl_posP(pos, noun_compound_parser.$const158$Verb, (SubLObject)noun_compound_parser.UNPROVIDED)) {
                    ans = (SubLObject)ConsesLow.cons(tuple, ans);
                }
                else if (pred.eql(noun_compound_parser.$const159$perfect)) {
                    final SubLObject item_var = list_utilities.replace_nth((SubLObject)noun_compound_parser.ONE_INTEGER, noun_compound_parser.$const91$Adjective, tuple);
                    if (noun_compound_parser.NIL == conses_high.member(item_var, ans, Symbols.symbol_function((SubLObject)noun_compound_parser.EQUALP), Symbols.symbol_function((SubLObject)noun_compound_parser.IDENTITY))) {
                        ans = (SubLObject)ConsesLow.cons(item_var, ans);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)noun_compound_parser.$list90);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 51283L)
    public static SubLObject rbp_remove_subsumed_tokens(final SubLObject tokens, final SubLObject input_length) {
        final SubLObject sorted = Sort.sort(tokens, (SubLObject)noun_compound_parser.$sym124$_, (SubLObject)noun_compound_parser.$sym160$INTERVAL_TOKEN_LENGTH);
        SubLObject big_spans = (SubLObject)noun_compound_parser.NIL;
        SubLObject ans = (SubLObject)noun_compound_parser.NIL;
        SubLObject cdolist_list_var = sorted;
        SubLObject token = (SubLObject)noun_compound_parser.NIL;
        token = cdolist_list_var.first();
        while (noun_compound_parser.NIL != cdolist_list_var) {
            final SubLObject span = interval_span.get_interval_span(standard_tokenization.interval_token_start(token), standard_tokenization.interval_token_end(token));
            final SubLObject span_length = interval_span.interval_span_length(span);
            if (noun_compound_parser.NIL == rbp_span_subsumed_by_all_ofP(span, big_spans)) {
                if (span_length.numE(input_length) || span_length.numL((SubLObject)noun_compound_parser.TWO_INTEGER)) {
                    ans = (SubLObject)ConsesLow.cons(token, ans);
                }
                else {
                    big_spans = (SubLObject)ConsesLow.cons(span, big_spans);
                    ans = (SubLObject)ConsesLow.cons(token, ans);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            token = cdolist_list_var.first();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 51906L)
    public static SubLObject rbp_span_subsumed_by_all_ofP(final SubLObject span, final SubLObject big_spans) {
        if (noun_compound_parser.NIL == big_spans) {
            return (SubLObject)noun_compound_parser.NIL;
        }
        SubLObject failP = (SubLObject)noun_compound_parser.NIL;
        if (noun_compound_parser.NIL == failP) {
            SubLObject csome_list_var = big_spans;
            SubLObject big_span = (SubLObject)noun_compound_parser.NIL;
            big_span = csome_list_var.first();
            while (noun_compound_parser.NIL == failP && noun_compound_parser.NIL != csome_list_var) {
                if (noun_compound_parser.NIL == rbp_span_subsumed_byP(span, big_span)) {
                    failP = (SubLObject)noun_compound_parser.T;
                }
                csome_list_var = csome_list_var.rest();
                big_span = csome_list_var.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_parser.NIL == failP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 52158L)
    public static SubLObject rbp_span_subsumed_byP(final SubLObject span, final SubLObject big_span) {
        return (SubLObject)SubLObjectFactory.makeBoolean(!span.equalp(big_span) && !interval_span.interval_span_start(span).numL(interval_span.interval_span_start(big_span)) && !interval_span.interval_span_end(span).numG(interval_span.interval_span_end(big_span)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 52598L)
    public static SubLObject initialize_rbp_name_cache() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        noun_compound_parser.$rbp_name_cache$.setDynamicValue(Hashtables.make_hash_table((SubLObject)noun_compound_parser.SIXTEEN_INTEGER, Symbols.symbol_function((SubLObject)noun_compound_parser.EQUALP), (SubLObject)noun_compound_parser.UNPROVIDED), thread);
        return noun_compound_parser.$rbp_name_cache$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 52727L)
    public static SubLObject rbp_name_block_pred_among_floorsP(final SubLObject block) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject denot = nc_block_head(block);
        final SubLObject pred = nc_block_head_string_pred(block);
        final SubLObject floor_preds = Hashtables.gethash(denot, noun_compound_parser.$rbp_name_cache$.getDynamicValue(thread), (SubLObject)noun_compound_parser.UNPROVIDED);
        return conses_high.member(pred, floor_preds, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 53033L)
    public static SubLObject rbp_cache_name_block(final SubLObject block) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject denot = nc_block_head(block);
        final SubLObject pred = nc_block_head_string_pred(block);
        final SubLObject existing = Hashtables.gethash(denot, noun_compound_parser.$rbp_name_cache$.getDynamicValue(thread), (SubLObject)noun_compound_parser.UNPROVIDED);
        if (noun_compound_parser.NIL == subl_promotions.memberP(pred, existing, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED)) {
            Hashtables.sethash(denot, noun_compound_parser.$rbp_name_cache$.getDynamicValue(thread), rbp_floors_cached((SubLObject)ConsesLow.cons(pred, existing)));
        }
        return (SubLObject)noun_compound_parser.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 53376L)
    public static SubLObject clear_rbp_floors_cached() {
        final SubLObject cs = noun_compound_parser.$rbp_floors_cached_caching_state$.getGlobalValue();
        if (noun_compound_parser.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)noun_compound_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 53376L)
    public static SubLObject remove_rbp_floors_cached(final SubLObject v_forts) {
        return memoization_state.caching_state_remove_function_results_with_args(noun_compound_parser.$rbp_floors_cached_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(v_forts), (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 53376L)
    public static SubLObject rbp_floors_cached_internal(final SubLObject v_forts) {
        return genl_predicates.min_predicates(v_forts, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 53376L)
    public static SubLObject rbp_floors_cached(final SubLObject v_forts) {
        SubLObject caching_state = noun_compound_parser.$rbp_floors_cached_caching_state$.getGlobalValue();
        if (noun_compound_parser.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)noun_compound_parser.$sym161$RBP_FLOORS_CACHED, (SubLObject)noun_compound_parser.$sym162$_RBP_FLOORS_CACHED_CACHING_STATE_, (SubLObject)noun_compound_parser.$int163$512, (SubLObject)noun_compound_parser.EQUAL, (SubLObject)noun_compound_parser.ONE_INTEGER, (SubLObject)noun_compound_parser.$int164$128);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_forts, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rbp_floors_cached_internal(v_forts)));
            memoization_state.caching_state_put(caching_state, v_forts, results, (SubLObject)noun_compound_parser.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 53513L)
    public static SubLObject clear_rbp_ok_name_cachedP() {
        final SubLObject cs = noun_compound_parser.$rbp_ok_name_cachedP_caching_state$.getGlobalValue();
        if (noun_compound_parser.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)noun_compound_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 53513L)
    public static SubLObject remove_rbp_ok_name_cachedP(final SubLObject block, final SubLObject inside_noun_compoundP) {
        return memoization_state.caching_state_remove_function_results_with_args(noun_compound_parser.$rbp_ok_name_cachedP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(block, inside_noun_compoundP), (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 53513L)
    public static SubLObject rbp_ok_name_cachedP_internal(final SubLObject block, final SubLObject inside_noun_compoundP) {
        final SubLObject block_string = nc_block_spanned_string(block);
        final SubLObject pred = nc_block_head_string_pred(block);
        final SubLObject denot = function_terms.naut_to_nart(nc_block_head(block));
        if (noun_compound_parser.NIL != ((noun_compound_parser.NIL != inside_noun_compoundP) ? string_utilities.starts_with_by_test(block_string, (SubLObject)noun_compound_parser.$str166$the_, Symbols.symbol_function((SubLObject)noun_compound_parser.EQUALP)) : SubLObjectFactory.makeBoolean(noun_compound_parser.NIL != kb_indexing_datastructures.indexed_term_p(denot) && noun_compound_parser.NIL == subl_promotions.memberP(block_string, kb_mapping_utilities.pred_values_in_any_mt(denot, pred, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED), Symbols.symbol_function((SubLObject)noun_compound_parser.EQUALP), (SubLObject)noun_compound_parser.UNPROVIDED)))) {
            return (SubLObject)noun_compound_parser.NIL;
        }
        if (noun_compound_parser.NIL != kb_indexing_datastructures.indexed_term_p(denot) && (noun_compound_parser.NIL != lexicon_accessors.closed_lexical_class_stringP(block_string, (SubLObject)noun_compound_parser.UNPROVIDED) || noun_compound_parser.NIL != lexicon_accessors.denots_of_string(block_string, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED))) {
            final SubLObject block_span = nc_block_span_index(block);
            final SubLObject strings = rbp_strings_for_span(block_span);
            final SubLObject original_string = strings.first();
            if (noun_compound_parser.NIL != string_utilities.lower_case_string_p(original_string)) {
                final SubLObject abbrevs = kb_mapping_utilities.pred_values_in_any_mt(denot, noun_compound_parser.$const167$abbreviationString_PN, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED);
                if (noun_compound_parser.NIL == subl_promotions.memberP(original_string, abbrevs, Symbols.symbol_function((SubLObject)noun_compound_parser.$sym146$STRING_), (SubLObject)noun_compound_parser.UNPROVIDED)) {
                    final SubLObject acronyms = kb_mapping_utilities.pred_values_in_any_mt(denot, noun_compound_parser.$const168$acronymString, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED);
                    return conses_high.member(original_string, acronyms, Symbols.symbol_function((SubLObject)noun_compound_parser.$sym146$STRING_), (SubLObject)noun_compound_parser.UNPROVIDED);
                }
            }
        }
        return (SubLObject)noun_compound_parser.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 53513L)
    public static SubLObject rbp_ok_name_cachedP(final SubLObject block, final SubLObject inside_noun_compoundP) {
        SubLObject caching_state = noun_compound_parser.$rbp_ok_name_cachedP_caching_state$.getGlobalValue();
        if (noun_compound_parser.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)noun_compound_parser.$sym165$RBP_OK_NAME_CACHED_, (SubLObject)noun_compound_parser.$sym169$_RBP_OK_NAME_CACHED__CACHING_STATE_, (SubLObject)noun_compound_parser.$int164$128, (SubLObject)noun_compound_parser.EQL, (SubLObject)noun_compound_parser.TWO_INTEGER, (SubLObject)noun_compound_parser.SIXTEEN_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(block, inside_noun_compoundP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)noun_compound_parser.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)noun_compound_parser.NIL;
            collision = cdolist_list_var.first();
            while (noun_compound_parser.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (block.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (noun_compound_parser.NIL != cached_args && noun_compound_parser.NIL == cached_args.rest() && inside_noun_compoundP.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rbp_ok_name_cachedP_internal(block, inside_noun_compoundP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(block, inside_noun_compoundP));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 55018L)
    public static SubLObject rbp_strings_for_span(final SubLObject span) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject start = interval_span.interval_span_start(span);
        final SubLObject end = interval_span.interval_span_end(span);
        final SubLObject strings = Sequences.subseq(noun_compound_parser.$rbp_input_strings$.getDynamicValue(thread), start, end);
        return strings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 55212L)
    public static SubLObject rbp_string_tokenize(final SubLObject string) {
        return nl_trie.nl_trie_string_tokenize(string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 55360L)
    public static SubLObject rbp_ok_blockP(final SubLObject block) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = nc_block_head_string_pred(block);
        if (noun_compound_parser.NIL != parsing_utilities.npp_excluded_name_predP(pred)) {
            return (SubLObject)noun_compound_parser.NIL;
        }
        if (pred.eql(noun_compound_parser.$const170$atomicSymbol)) {
            final SubLObject block_string = nc_block_spanned_string(block);
            if (noun_compound_parser.NIL == Sequences.find(block_string, noun_compound_parser.$rbp_input_strings$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)noun_compound_parser.$sym146$STRING_), (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED)) {
                return (SubLObject)noun_compound_parser.NIL;
            }
        }
        if (noun_compound_parser.NIL != rbp_name_blockP(block)) {
            if (noun_compound_parser.NIL != rbp_bad_name_blockP(block)) {
                return (SubLObject)noun_compound_parser.NIL;
            }
            rbp_cache_name_block(block);
        }
        return (SubLObject)noun_compound_parser.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 55812L)
    public static SubLObject rbp_bad_name_blockP(final SubLObject block) {
        return (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_parser.NIL == rbp_ok_name_cachedP(block, (SubLObject)noun_compound_parser.T));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 55903L)
    public static SubLObject rbp_name_blockP(final SubLObject block) {
        return lexicon_accessors.genl_posP(nc_block_head_pos(block), noun_compound_parser.$const171$ProperNoun, (SubLObject)noun_compound_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 56004L)
    public static SubLObject rbp_filter_redundant_blocks(final SubLObject blocks) {
        final SubLObject non_names = Sequences.remove_if((SubLObject)noun_compound_parser.$sym172$RBP_NAME_BLOCK_, blocks, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED);
        final SubLObject good_names = list_utilities.remove_if_not((SubLObject)noun_compound_parser.$sym173$RBP_NAME_BLOCK_PRED_AMONG_FLOORS_, blocks, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED);
        return ConsesLow.append(non_names, good_names);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 56232L)
    public static SubLObject display_all_parses(final SubLObject chart) {
        SubLObject ans = (SubLObject)noun_compound_parser.NIL;
        final SubLObject cdohash_table = rbp_chart_parser.rbp_chart_edges(chart);
        SubLObject span = (SubLObject)noun_compound_parser.NIL;
        SubLObject block_ids = (SubLObject)noun_compound_parser.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                span = Hashtables.getEntryKey(cdohash_entry);
                block_ids = Hashtables.getEntryValue(cdohash_entry);
                SubLObject parses = (SubLObject)noun_compound_parser.NIL;
                SubLObject cdolist_list_var = block_ids;
                SubLObject block_id = (SubLObject)noun_compound_parser.NIL;
                block_id = cdolist_list_var.first();
                while (noun_compound_parser.NIL != cdolist_list_var) {
                    final SubLObject block_hash = rbp_chart_parser.rbp_chart_block_hash(chart);
                    final SubLObject block = rbp_chart_parser.rbp_chart_block_hash_lookup(block_id, block_hash);
                    final SubLObject pred = nc_block_head_string_pred(block);
                    final SubLObject denot = cycl_utilities.hl_to_el(nc_block_denot(block));
                    final SubLObject rule = nc_block_rule(block);
                    final SubLObject npp_parse = np_parser.make_npp_parse(denot, pred);
                    if (noun_compound_parser.NIL != np_parser.npp_proper_parseP(npp_parse)) {
                        final SubLObject item_var = npp_parse;
                        if (noun_compound_parser.NIL == conses_high.member(item_var, parses, (SubLObject)noun_compound_parser.$sym153$NPP_PARSE_, Symbols.symbol_function((SubLObject)noun_compound_parser.IDENTITY))) {
                            parses = (SubLObject)ConsesLow.cons(item_var, parses);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    block_id = cdolist_list_var.first();
                }
                ans = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(span, parses), ans);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return Sort.sort(ans, (SubLObject)noun_compound_parser.$sym174$INTERVAL_SPAN_PRECEDES_, Symbols.symbol_function((SubLObject)noun_compound_parser.$sym175$FIRST));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 56997L)
    public static SubLObject display_all_trees(final SubLObject chart) {
        final SubLObject block_hash = rbp_chart_parser.rbp_chart_block_hash(chart);
        SubLObject cdolist_list_var = rbp_chart_parser.rbp_chart_lookup(rbp_chart_parser.rbp_chart_max_span(chart), chart);
        SubLObject block = (SubLObject)noun_compound_parser.NIL;
        block = cdolist_list_var.first();
        while (noun_compound_parser.NIL != cdolist_list_var) {
            display_tree(block, block_hash);
            cdolist_list_var = cdolist_list_var.rest();
            block = cdolist_list_var.first();
        }
        return (SubLObject)noun_compound_parser.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 57216L)
    public static SubLObject display_tree(final SubLObject block, final SubLObject block_hash) {
        print_high.princ(block, (SubLObject)noun_compound_parser.UNPROVIDED);
        final SubLObject sub_tree = nc_block_sub_tree(block);
        if (noun_compound_parser.NIL != sub_tree) {
            SubLObject current;
            final SubLObject datum = current = sub_tree;
            SubLObject rbp_rule = (SubLObject)noun_compound_parser.NIL;
            SubLObject dtr1_id = (SubLObject)noun_compound_parser.NIL;
            SubLObject dtr2_id = (SubLObject)noun_compound_parser.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)noun_compound_parser.$list176);
            rbp_rule = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)noun_compound_parser.$list176);
            dtr1_id = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)noun_compound_parser.$list176);
            dtr2_id = current.first();
            current = current.rest();
            if (noun_compound_parser.NIL == current) {
                PrintLow.format((SubLObject)noun_compound_parser.T, (SubLObject)noun_compound_parser.$str177$_S__, rbp_rule_bank.rbp_rule_cycl(rbp_rule));
                display_tree(rbp_chart_parser.rbp_chart_block_hash_lookup(dtr1_id, block_hash), block_hash);
                display_tree(rbp_chart_parser.rbp_chart_block_hash_lookup(dtr2_id, block_hash), block_hash);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)noun_compound_parser.$list176);
            }
        }
        return (SubLObject)noun_compound_parser.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 57621L)
    public static SubLObject rbp_rule_count() {
        return rbp_rule_bank.rbp_rb_rule_count();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 57805L)
    public static SubLObject rbp_rule_cycl_semx(final SubLObject rule_cycl, SubLObject mt) {
        if (mt == noun_compound_parser.UNPROVIDED) {
            mt = parsing_vars.$rbp_rule_lookup_mt$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)noun_compound_parser.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject raw_gaf_value = kb_mapping_utilities.fpred_value(rule_cycl, noun_compound_parser.$const178$ncRuleTemplate, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED);
            if (noun_compound_parser.NIL != raw_gaf_value) {
                ans = rbp_rule_bank.rbp_forts_to_keywords(function_terms.nart_to_naut(raw_gaf_value));
            }
            raw_gaf_value = (SubLObject)noun_compound_parser.NIL;
            final SubLObject pred_var = noun_compound_parser.$const179$ncRuleTemplate_Compact;
            if (noun_compound_parser.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(rule_cycl, (SubLObject)noun_compound_parser.ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(rule_cycl, (SubLObject)noun_compound_parser.ONE_INTEGER, pred_var);
                SubLObject done_var = ans;
                final SubLObject token_var = (SubLObject)noun_compound_parser.NIL;
                while (noun_compound_parser.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (noun_compound_parser.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)noun_compound_parser.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)noun_compound_parser.$kw138$GAF, (SubLObject)noun_compound_parser.$kw180$TRUE, (SubLObject)noun_compound_parser.NIL);
                            SubLObject done_var_$23 = ans;
                            final SubLObject token_var_$24 = (SubLObject)noun_compound_parser.NIL;
                            while (noun_compound_parser.NIL == done_var_$23) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$24);
                                final SubLObject valid_$25 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$24.eql(assertion));
                                if (noun_compound_parser.NIL != valid_$25) {
                                    raw_gaf_value = assertions_high.gaf_arg(assertion, (SubLObject)noun_compound_parser.TWO_INTEGER);
                                    thread.resetMultipleValues();
                                    final SubLObject success = formula_pattern_match.formula_matches_pattern(raw_gaf_value, (SubLObject)noun_compound_parser.$list181);
                                    final SubLObject v_bindings = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (noun_compound_parser.NIL != success) {
                                        final SubLObject indexical2 = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)noun_compound_parser.$sym182$INDEXICAL2, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED);
                                        final SubLObject bin_pred = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)noun_compound_parser.$sym183$BIN_PRED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED);
                                        final SubLObject indexical3 = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)noun_compound_parser.$sym184$INDEXICAL1, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED);
                                        final SubLObject fn = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)noun_compound_parser.$sym185$FN, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED);
                                        ans = rbp_rule_bank.rbp_forts_to_keywords(el_utilities.make_ternary_formula(fn, indexical3, bin_pred, indexical2));
                                    }
                                }
                                done_var_$23 = (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_parser.NIL == valid_$25 || noun_compound_parser.NIL != ans);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)noun_compound_parser.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (noun_compound_parser.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_parser.NIL == valid || noun_compound_parser.NIL != ans);
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 58709L)
    public static SubLObject rbp_rule_okP(final SubLObject rule_cycl) {
        if (noun_compound_parser.NIL == rbp_rule_cycl_semx(rule_cycl, (SubLObject)noun_compound_parser.UNPROVIDED)) {
            return (SubLObject)noun_compound_parser.NIL;
        }
        final SubLObject constraints = rbp_rule_bank.rbp_rule_constraints(rule_cycl);
        if (noun_compound_parser.NIL == constraints) {
            return (SubLObject)noun_compound_parser.NIL;
        }
        if (noun_compound_parser.NIL == Sequences.find_if((SubLObject)noun_compound_parser.$sym186$RBP_SEMANTIC_CONSTRAINT_P, constraints, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED) && noun_compound_parser.NIL == Sequences.find_if((SubLObject)noun_compound_parser.$sym187$RBP_WORD_UNIT_CONSTRAINT_P, constraints, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED)) {
            return (SubLObject)noun_compound_parser.NIL;
        }
        return (SubLObject)noun_compound_parser.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 59446L)
    public static SubLObject rbp_domain_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return parsing_vars.$parsing_domain_mt$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 59508L)
    public static SubLObject rbp_get_cognate_from_instance_level_arg(final SubLObject pred) {
        final SubLObject cognates = kb_mapping.gather_gaf_arg_index(pred, (SubLObject)noun_compound_parser.ONE_INTEGER, noun_compound_parser.$const188$typeLevelCognates, noun_compound_parser.$const189$BaseKB, (SubLObject)noun_compound_parser.UNPROVIDED);
        if (noun_compound_parser.NIL != list_utilities.singletonP(cognates)) {
            return cycl_utilities.formula_arg2(cognates.first(), (SubLObject)noun_compound_parser.UNPROVIDED);
        }
        return (SubLObject)noun_compound_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 59911L)
    public static SubLObject rbp_get_cognate_from_type_level_arg(final SubLObject pred) {
        final SubLObject cognates = kb_mapping.gather_gaf_arg_index(pred, (SubLObject)noun_compound_parser.TWO_INTEGER, noun_compound_parser.$const188$typeLevelCognates, noun_compound_parser.$const189$BaseKB, (SubLObject)noun_compound_parser.UNPROVIDED);
        if (noun_compound_parser.NIL != list_utilities.singletonP(cognates)) {
            return cycl_utilities.formula_arg1(cognates.first(), (SubLObject)noun_compound_parser.UNPROVIDED);
        }
        return (SubLObject)noun_compound_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 60131L)
    public static SubLObject rbp_semx_type_level_cognate(final SubLObject semx) {
        if (noun_compound_parser.NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(semx)) {
            SubLObject func = (SubLObject)noun_compound_parser.NIL;
            SubLObject focal_col = (SubLObject)noun_compound_parser.NIL;
            SubLObject pred = (SubLObject)noun_compound_parser.NIL;
            SubLObject other_col = (SubLObject)noun_compound_parser.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(semx, semx, (SubLObject)noun_compound_parser.$list190);
            func = semx.first();
            SubLObject current = semx.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, semx, (SubLObject)noun_compound_parser.$list190);
            focal_col = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, semx, (SubLObject)noun_compound_parser.$list190);
            pred = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, semx, (SubLObject)noun_compound_parser.$list190);
            other_col = current.first();
            current = current.rest();
            if (noun_compound_parser.NIL == current) {
                if (noun_compound_parser.NIL != isa.isa_in_any_mtP(func, noun_compound_parser.$const191$SubcollectionRelationFunction_Ins)) {
                    final SubLObject inst_level_pred = rbp_get_cognate_from_type_level_arg(pred);
                    final SubLObject type_level_func = rbp_get_cognate_from_instance_level_arg(func);
                    if (noun_compound_parser.NIL != inst_level_pred) {
                        return (SubLObject)ConsesLow.list(type_level_func, focal_col, inst_level_pred, other_col);
                    }
                }
                else {
                    final SubLObject type_level_pred = rbp_get_cognate_from_instance_level_arg(pred);
                    final SubLObject inst_level_func = rbp_get_cognate_from_type_level_arg(func);
                    if (noun_compound_parser.NIL != type_level_pred) {
                        return (SubLObject)ConsesLow.list(inst_level_func, focal_col, type_level_pred, other_col);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(semx, (SubLObject)noun_compound_parser.$list190);
            }
        }
        return (SubLObject)noun_compound_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 61457L)
    public static SubLObject ncp_ask_variable(final SubLObject var, final SubLObject sentence, final SubLObject mt, SubLObject backchain) {
        if (backchain == noun_compound_parser.UNPROVIDED) {
            backchain = (SubLObject)noun_compound_parser.ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_properties = (SubLObject)ConsesLow.list((SubLObject)noun_compound_parser.$kw192$PROBLEM_STORE, noun_compound_parser.$ncp_problem_store$.getDynamicValue(thread), (SubLObject)noun_compound_parser.$kw193$MAX_TRANSFORMATION_DEPTH, backchain);
        return ask_utilities.query_variable(var, sentence, mt, query_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 61898L)
    public static SubLObject rbp_subcol_naut_fails_inter_arg_checksP(final SubLObject quasi_gaf, final SubLObject from_arg, final SubLObject to_arg, SubLObject mt, SubLObject type_level_predP) {
        if (mt == noun_compound_parser.UNPROVIDED) {
            mt = rbp_domain_mt();
        }
        if (type_level_predP == noun_compound_parser.UNPROVIDED) {
            type_level_predP = (SubLObject)noun_compound_parser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject failure_message = (SubLObject)noun_compound_parser.NIL;
        final SubLObject pred = cycl_utilities.formula_arg0(quasi_gaf);
        final SubLObject to_term = cycl_utilities.formula_arg(quasi_gaf, to_arg, (SubLObject)noun_compound_parser.UNPROVIDED);
        final SubLObject from_term = cycl_utilities.formula_arg(quasi_gaf, from_arg, (SubLObject)noun_compound_parser.UNPROVIDED);
        if (noun_compound_parser.NIL != noun_compound_parser.$rbp_use_inter_arg_isa_filtersP$.getDynamicValue(thread)) {
            if (noun_compound_parser.NIL == failure_message) {
                SubLObject csome_list_var;
                SubLObject dep_col;
                for (csome_list_var = rbp_get_dep_cols(from_arg, to_arg, pred, from_term, mt), dep_col = (SubLObject)noun_compound_parser.NIL, dep_col = csome_list_var.first(); noun_compound_parser.NIL == failure_message && noun_compound_parser.NIL != csome_list_var; failure_message = rbp_subcol_naut_do_inter_arg_test((SubLObject)noun_compound_parser.$kw194$ISA, to_term, narts_high.nart_substitute(dep_col), mt, type_level_predP), csome_list_var = csome_list_var.rest(), dep_col = csome_list_var.first()) {}
            }
            if (noun_compound_parser.NIL == failure_message) {
                SubLObject csome_list_var;
                SubLObject dep_col;
                for (csome_list_var = rbp_get_dep_cols(to_arg, from_arg, pred, to_term, mt), dep_col = (SubLObject)noun_compound_parser.NIL, dep_col = csome_list_var.first(); noun_compound_parser.NIL == failure_message && noun_compound_parser.NIL != csome_list_var; failure_message = rbp_subcol_naut_do_inter_arg_test((SubLObject)noun_compound_parser.$kw194$ISA, from_term, narts_high.nart_substitute(dep_col), mt, type_level_predP), csome_list_var = csome_list_var.rest(), dep_col = csome_list_var.first()) {}
            }
        }
        if (noun_compound_parser.NIL != noun_compound_parser.$rbp_use_inter_arg_not_isa_filtersP$.getDynamicValue(thread) && !pred.eql(noun_compound_parser.$const195$geopoliticalSubdivision)) {
            if (noun_compound_parser.NIL != kb_indexing_datastructures.indexed_term_p(from_term)) {
                if (noun_compound_parser.NIL == failure_message) {
                    SubLObject csome_list_var;
                    SubLObject dep_col;
                    for (csome_list_var = ncp_ask_variable((SubLObject)noun_compound_parser.$sym197$_COL, (SubLObject)ConsesLow.listS(noun_compound_parser.$const198$interArgNotIsa, pred, from_arg, from_term, to_arg, (SubLObject)noun_compound_parser.$list199), mt, (SubLObject)noun_compound_parser.ONE_INTEGER), dep_col = (SubLObject)noun_compound_parser.NIL, dep_col = csome_list_var.first(); noun_compound_parser.NIL == failure_message && noun_compound_parser.NIL != csome_list_var; failure_message = rbp_subcol_naut_do_inter_arg_test((SubLObject)noun_compound_parser.$kw196$NOT_ISA, to_term, narts_high.nart_substitute(dep_col), mt, type_level_predP), csome_list_var = csome_list_var.rest(), dep_col = csome_list_var.first()) {}
                }
            }
            else if (noun_compound_parser.NIL != kb_indexing_datastructures.indexed_term_p(to_term) && noun_compound_parser.NIL == failure_message) {
                SubLObject csome_list_var;
                SubLObject dep_col;
                for (csome_list_var = ncp_ask_variable((SubLObject)noun_compound_parser.$sym197$_COL, (SubLObject)ConsesLow.listS(noun_compound_parser.$const198$interArgNotIsa, pred, to_arg, to_term, from_arg, (SubLObject)noun_compound_parser.$list199), mt, (SubLObject)noun_compound_parser.ONE_INTEGER), dep_col = (SubLObject)noun_compound_parser.NIL, dep_col = csome_list_var.first(); noun_compound_parser.NIL == failure_message && noun_compound_parser.NIL != csome_list_var; failure_message = rbp_subcol_naut_do_inter_arg_test((SubLObject)noun_compound_parser.$kw196$NOT_ISA, from_term, narts_high.nart_substitute(dep_col), mt, type_level_predP), csome_list_var = csome_list_var.rest(), dep_col = csome_list_var.first()) {}
            }
        }
        if (noun_compound_parser.NIL != failure_message) {
            Errors.warn(failure_message);
        }
        return failure_message;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 63626L)
    public static SubLObject rbp_get_dep_cols(final SubLObject ind_arg, final SubLObject dep_arg, final SubLObject pred, final SubLObject ind_term, final SubLObject mt) {
        return ncp_ask_variable((SubLObject)noun_compound_parser.$sym197$_COL, (SubLObject)ConsesLow.listS(noun_compound_parser.$const200$interArgIsa, pred, ind_arg, ind_term, dep_arg, (SubLObject)noun_compound_parser.$list199), mt, (SubLObject)noun_compound_parser.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 63791L)
    public static SubLObject rbp_subcol_naut_do_inter_arg_test(final SubLObject test_type, final SubLObject v_term, final SubLObject dep_col, final SubLObject mt, final SubLObject type_level_predP) {
        SubLObject failure_message = (SubLObject)noun_compound_parser.NIL;
        if (test_type.eql((SubLObject)noun_compound_parser.$kw194$ISA)) {
            if (noun_compound_parser.NIL != type_level_predP && noun_compound_parser.NIL == rbp_wff.npp_isaP(v_term, dep_col, mt)) {
                failure_message = PrintLow.format((SubLObject)noun_compound_parser.NIL, (SubLObject)noun_compound_parser.$str201$____but__A_has_to_be_an_instance_, new SubLObject[] { v_term, dep_col, mt });
            }
            else if (noun_compound_parser.NIL == type_level_predP && noun_compound_parser.NIL == rbp_wff.npp_not_disjointP(v_term, dep_col, mt)) {
                failure_message = PrintLow.format((SubLObject)noun_compound_parser.NIL, (SubLObject)noun_compound_parser.$str202$____but__A_has_to_intersect__A_in, new SubLObject[] { v_term, dep_col, mt });
            }
        }
        else if (test_type.eql((SubLObject)noun_compound_parser.$kw196$NOT_ISA)) {
            if (noun_compound_parser.NIL != type_level_predP && noun_compound_parser.NIL != rbp_wff.npp_isaP(v_term, dep_col, mt)) {
                failure_message = PrintLow.format((SubLObject)noun_compound_parser.NIL, (SubLObject)noun_compound_parser.$str203$____but__A_can_t_be_an_instance_o, new SubLObject[] { v_term, dep_col, mt });
            }
            else if (noun_compound_parser.NIL == type_level_predP && noun_compound_parser.NIL != rbp_wff.npp_genlP(v_term, dep_col, mt)) {
                failure_message = PrintLow.format((SubLObject)noun_compound_parser.NIL, (SubLObject)noun_compound_parser.$str204$____but__A_can_t_be_a_spec_of__A_, new SubLObject[] { v_term, dep_col, mt });
            }
        }
        return failure_message;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 64809L)
    public static SubLObject rbp_inter_arg_isa_pred(final SubLObject from_arg, final SubLObject to_arg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = constants_high.find_constant(PrintLow.format((SubLObject)noun_compound_parser.NIL, (SubLObject)noun_compound_parser.$str205$interArgIsa_D__D, from_arg, to_arg));
        if (noun_compound_parser.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && noun_compound_parser.NIL == constant_handles.valid_constant(pred, (SubLObject)noun_compound_parser.UNPROVIDED)) {
            Errors.error((SubLObject)noun_compound_parser.$str206$Couldn_t_find_inter_arg_isa_predi, from_arg, to_arg);
        }
        return pred;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 65107L)
    public static SubLObject rbp_inter_arg_not_isa_pred(final SubLObject one_arg, final SubLObject other_arg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pred = constants_high.find_constant(PrintLow.format((SubLObject)noun_compound_parser.NIL, (SubLObject)noun_compound_parser.$str207$interArgNotIsa_D__D, one_arg, other_arg));
        if (noun_compound_parser.NIL == constant_handles.valid_constant(pred, (SubLObject)noun_compound_parser.UNPROVIDED)) {
            pred = constants_high.find_constant(PrintLow.format((SubLObject)noun_compound_parser.NIL, (SubLObject)noun_compound_parser.$str207$interArgNotIsa_D__D, other_arg, one_arg));
        }
        if (noun_compound_parser.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && noun_compound_parser.NIL == constant_handles.valid_constant(pred, (SubLObject)noun_compound_parser.UNPROVIDED)) {
            Errors.error((SubLObject)noun_compound_parser.$str208$Couldn_t_find_inter_arg_not_isa_p, one_arg, other_arg);
        }
        return pred;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 65588L)
    public static SubLObject rbp_binary_gaf_fails_inter_arg_checksP(final SubLObject gaf, SubLObject mt) {
        if (mt == noun_compound_parser.UNPROVIDED) {
            mt = rbp_domain_mt();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject diag = (SubLObject)noun_compound_parser.NIL;
        SubLObject semx_pred = (SubLObject)noun_compound_parser.NIL;
        SubLObject arg1 = (SubLObject)noun_compound_parser.NIL;
        SubLObject arg2 = (SubLObject)noun_compound_parser.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(gaf, gaf, (SubLObject)noun_compound_parser.$list209);
        semx_pred = gaf.first();
        SubLObject current = gaf.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, gaf, (SubLObject)noun_compound_parser.$list209);
        arg1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, gaf, (SubLObject)noun_compound_parser.$list209);
        arg2 = current.first();
        current = current.rest();
        if (noun_compound_parser.NIL == current) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject pred_var = noun_compound_parser.$const210$interArgIsa1_2;
                if (noun_compound_parser.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(semx_pred, (SubLObject)noun_compound_parser.ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(semx_pred, (SubLObject)noun_compound_parser.ONE_INTEGER, pred_var);
                    SubLObject done_var = diag;
                    final SubLObject token_var = (SubLObject)noun_compound_parser.NIL;
                    while (noun_compound_parser.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (noun_compound_parser.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)noun_compound_parser.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)noun_compound_parser.$kw138$GAF, (SubLObject)noun_compound_parser.NIL, (SubLObject)noun_compound_parser.NIL);
                                SubLObject done_var_$27 = diag;
                                final SubLObject token_var_$28 = (SubLObject)noun_compound_parser.NIL;
                                while (noun_compound_parser.NIL == done_var_$27) {
                                    final SubLObject ia_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$28);
                                    final SubLObject valid_$29 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$28.eql(ia_gaf));
                                    if (noun_compound_parser.NIL != valid_$29 && noun_compound_parser.NIL != isa.isaP(arg1, cycl_utilities.formula_arg2(ia_gaf, (SubLObject)noun_compound_parser.UNPROVIDED), (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED) && noun_compound_parser.NIL == isa.isaP(arg2, cycl_utilities.formula_arg3(ia_gaf, (SubLObject)noun_compound_parser.UNPROVIDED), (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED)) {
                                        diag = PrintLow.format((SubLObject)noun_compound_parser.NIL, (SubLObject)noun_compound_parser.$str211$___but_it_fails_the_inter_arg_con, ia_gaf);
                                    }
                                    done_var_$27 = (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_parser.NIL == valid_$29 || noun_compound_parser.NIL != diag);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)noun_compound_parser.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (noun_compound_parser.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_parser.NIL == valid || noun_compound_parser.NIL != diag);
                    }
                }
                pred_var = noun_compound_parser.$const212$interArgIsa2_1;
                if (noun_compound_parser.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(semx_pred, (SubLObject)noun_compound_parser.ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(semx_pred, (SubLObject)noun_compound_parser.ONE_INTEGER, pred_var);
                    SubLObject done_var = diag;
                    final SubLObject token_var = (SubLObject)noun_compound_parser.NIL;
                    while (noun_compound_parser.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (noun_compound_parser.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)noun_compound_parser.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)noun_compound_parser.$kw138$GAF, (SubLObject)noun_compound_parser.NIL, (SubLObject)noun_compound_parser.NIL);
                                SubLObject done_var_$28 = diag;
                                final SubLObject token_var_$29 = (SubLObject)noun_compound_parser.NIL;
                                while (noun_compound_parser.NIL == done_var_$28) {
                                    final SubLObject ia_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$29);
                                    final SubLObject valid_$30 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$29.eql(ia_gaf));
                                    if (noun_compound_parser.NIL != valid_$30 && noun_compound_parser.NIL != isa.isaP(arg2, cycl_utilities.formula_arg2(ia_gaf, (SubLObject)noun_compound_parser.UNPROVIDED), (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED) && noun_compound_parser.NIL == isa.isaP(arg1, cycl_utilities.formula_arg3(ia_gaf, (SubLObject)noun_compound_parser.UNPROVIDED), (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED)) {
                                        diag = PrintLow.format((SubLObject)noun_compound_parser.NIL, (SubLObject)noun_compound_parser.$str211$___but_it_fails_the_inter_arg_con, ia_gaf);
                                    }
                                    done_var_$28 = (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_parser.NIL == valid_$30 || noun_compound_parser.NIL != diag);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$31 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)noun_compound_parser.T, thread);
                                    final SubLObject _values2 = Values.getValuesAsVector();
                                    if (noun_compound_parser.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values2);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_parser.NIL == valid || noun_compound_parser.NIL != diag);
                    }
                }
                if (!semx_pred.eql(noun_compound_parser.$const195$geopoliticalSubdivision)) {
                    pred_var = noun_compound_parser.$const213$interArgNotIsa1_2;
                    if (noun_compound_parser.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(semx_pred, (SubLObject)noun_compound_parser.ONE_INTEGER, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(semx_pred, (SubLObject)noun_compound_parser.ONE_INTEGER, pred_var);
                        SubLObject done_var = diag;
                        final SubLObject token_var = (SubLObject)noun_compound_parser.NIL;
                        while (noun_compound_parser.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (noun_compound_parser.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)noun_compound_parser.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)noun_compound_parser.$kw138$GAF, (SubLObject)noun_compound_parser.NIL, (SubLObject)noun_compound_parser.NIL);
                                    SubLObject done_var_$29 = diag;
                                    final SubLObject token_var_$30 = (SubLObject)noun_compound_parser.NIL;
                                    while (noun_compound_parser.NIL == done_var_$29) {
                                        final SubLObject ia_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$30);
                                        final SubLObject valid_$31 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$30.eql(ia_gaf));
                                        if (noun_compound_parser.NIL != valid_$31 && noun_compound_parser.NIL != isa.isaP(arg1, cycl_utilities.formula_arg2(ia_gaf, (SubLObject)noun_compound_parser.UNPROVIDED), (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED) && noun_compound_parser.NIL != isa.isaP(arg2, cycl_utilities.formula_arg3(ia_gaf, (SubLObject)noun_compound_parser.UNPROVIDED), (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED)) {
                                            diag = PrintLow.format((SubLObject)noun_compound_parser.NIL, (SubLObject)noun_compound_parser.$str211$___but_it_fails_the_inter_arg_con, ia_gaf);
                                        }
                                        done_var_$29 = (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_parser.NIL == valid_$31 || noun_compound_parser.NIL != diag);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$32 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)noun_compound_parser.T, thread);
                                        final SubLObject _values3 = Values.getValuesAsVector();
                                        if (noun_compound_parser.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values3);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_parser.NIL == valid || noun_compound_parser.NIL != diag);
                        }
                    }
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(gaf, (SubLObject)noun_compound_parser.$list209);
        }
        return diag;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 66741L)
    public static SubLObject rbp_fails_wff_workaroundsP(final SubLObject rule, final SubLObject semx, SubLObject skip_cognateP) {
        if (skip_cognateP == noun_compound_parser.UNPROVIDED) {
            skip_cognateP = (SubLObject)noun_compound_parser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject verboseP = (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_parser.NIL != subl_promotions.memberP(rule, rbp_traced_rules(), (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED) || noun_compound_parser.NIL != noun_compound_parser.$rbp_show_successful_rulesP$.getDynamicValue(thread));
        final SubLObject wff_domain = rbp_domain_mt();
        if (noun_compound_parser.NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(semx)) {
            SubLObject func = (SubLObject)noun_compound_parser.NIL;
            SubLObject col1 = (SubLObject)noun_compound_parser.NIL;
            SubLObject semx_pred = (SubLObject)noun_compound_parser.NIL;
            SubLObject col2 = (SubLObject)noun_compound_parser.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(semx, semx, (SubLObject)noun_compound_parser.$list214);
            func = semx.first();
            SubLObject current = semx.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, semx, (SubLObject)noun_compound_parser.$list214);
            col1 = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, semx, (SubLObject)noun_compound_parser.$list214);
            semx_pred = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, semx, (SubLObject)noun_compound_parser.$list214);
            col2 = current.first();
            current = current.rest();
            if (noun_compound_parser.NIL == current) {
                final SubLObject focal_arg = (SubLObject)((noun_compound_parser.NIL != isa.isaP(func, noun_compound_parser.$const215$SubcollectionRelationFunction_Can, noun_compound_parser.$const216$UniversalVocabularyMt, (SubLObject)noun_compound_parser.UNPROVIDED)) ? noun_compound_parser.ONE_INTEGER : noun_compound_parser.TWO_INTEGER);
                final SubLObject focal_col = narts_high.nart_substitute(focal_arg.numE((SubLObject)noun_compound_parser.ONE_INTEGER) ? col1 : col2);
                final SubLObject other_col = narts_high.nart_substitute(focal_arg.numE((SubLObject)noun_compound_parser.ONE_INTEGER) ? col2 : col1);
                final SubLObject diag = rbp_subcol_naut_fails_inter_arg_checksP((SubLObject)ConsesLow.list(semx_pred, focal_col, other_col), (SubLObject)noun_compound_parser.ONE_INTEGER, (SubLObject)noun_compound_parser.TWO_INTEGER, wff_domain, isa.isa_in_any_mtP(func, noun_compound_parser.$const191$SubcollectionRelationFunction_Ins));
                if (noun_compound_parser.NIL != diag) {
                    if (noun_compound_parser.NIL != verboseP) {
                        PrintLow.format((SubLObject)noun_compound_parser.T, (SubLObject)noun_compound_parser.$str217$_A__, diag);
                    }
                    return (SubLObject)noun_compound_parser.T;
                }
                if (noun_compound_parser.NIL != forts.fort_p(semx_pred) && noun_compound_parser.NIL != rbp_wff.npp_genl_predP(semx_pred, noun_compound_parser.$const218$groupMembers)) {
                    SubLObject badP = (SubLObject)noun_compound_parser.NIL;
                    final SubLObject focal_possibly_fort = narts_high.nart_substitute(focal_col);
                    if (noun_compound_parser.NIL != forts.fort_p(focal_possibly_fort)) {
                        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(wff_domain);
                        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            SubLObject cdolist_list_var = genls.asserted_genls(focal_possibly_fort, (SubLObject)noun_compound_parser.UNPROVIDED);
                            SubLObject genl = (SubLObject)noun_compound_parser.NIL;
                            genl = cdolist_list_var.first();
                            while (noun_compound_parser.NIL != cdolist_list_var) {
                                if ((cycl_utilities.formula_arg0(genl).eql(noun_compound_parser.$const219$GroupFn) || cycl_utilities.formula_arg0(genl).eql(noun_compound_parser.$const220$GroupOfCardinalityFn)) && noun_compound_parser.NIL == genls.genlP(other_col, cycl_utilities.formula_arg1(genl, (SubLObject)noun_compound_parser.UNPROVIDED), (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED)) {
                                    if (noun_compound_parser.NIL != verboseP) {
                                        PrintLow.format((SubLObject)noun_compound_parser.T, (SubLObject)noun_compound_parser.$str221$___but_it_failed_the_groupMembers, new SubLObject[] { focal_possibly_fort, cycl_utilities.formula_arg1(genl, (SubLObject)noun_compound_parser.UNPROVIDED), other_col });
                                    }
                                    badP = (SubLObject)noun_compound_parser.T;
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                genl = cdolist_list_var.first();
                            }
                        }
                        finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (noun_compound_parser.NIL != badP) {
                        return (SubLObject)noun_compound_parser.T;
                    }
                }
                if (noun_compound_parser.NIL == skip_cognateP) {
                    return rbp_fails_wff_workaroundsP(rule, rbp_semx_type_level_cognate(semx), (SubLObject)noun_compound_parser.T);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(semx, (SubLObject)noun_compound_parser.$list214);
            }
        }
        if (noun_compound_parser.NIL != el_utilities.el_binary_formula_p(semx)) {
            SubLObject semx_pred2 = (SubLObject)noun_compound_parser.NIL;
            SubLObject arg1 = (SubLObject)noun_compound_parser.NIL;
            SubLObject arg2 = (SubLObject)noun_compound_parser.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(semx, semx, (SubLObject)noun_compound_parser.$list209);
            semx_pred2 = semx.first();
            SubLObject current = semx.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, semx, (SubLObject)noun_compound_parser.$list209);
            arg1 = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, semx, (SubLObject)noun_compound_parser.$list209);
            arg2 = current.first();
            current = current.rest();
            if (noun_compound_parser.NIL == current) {
                if (noun_compound_parser.NIL != isa.isa_in_any_mtP(semx_pred2, noun_compound_parser.$const222$Predicate)) {
                    final SubLObject diag2 = rbp_binary_gaf_fails_inter_arg_checksP(semx, wff_domain);
                    if (noun_compound_parser.NIL != diag2) {
                        if (noun_compound_parser.NIL != verboseP) {
                            PrintLow.format((SubLObject)noun_compound_parser.T, (SubLObject)noun_compound_parser.$str217$_A__, diag2);
                        }
                        return (SubLObject)noun_compound_parser.T;
                    }
                }
                if (noun_compound_parser.NIL != rbp_wff.npp_genl_predP(semx_pred2, noun_compound_parser.$const144$cityInState) && cycl_utilities.formula_arg0(narts_high.nart_expand(arg1)).eql(noun_compound_parser.$const142$CityNamedFn) && !cycl_utilities.formula_arg2(narts_high.nart_expand(arg1), (SubLObject)noun_compound_parser.UNPROVIDED).eql(arg2)) {
                    if (noun_compound_parser.NIL != verboseP) {
                        PrintLow.format((SubLObject)noun_compound_parser.T, (SubLObject)noun_compound_parser.$str223$___but_the___CityNamedFn_arg2_doe, cycl_utilities.formula_arg2(narts_high.nart_expand(arg1), (SubLObject)noun_compound_parser.UNPROVIDED), arg2);
                    }
                    return (SubLObject)noun_compound_parser.T;
                }
                if (noun_compound_parser.NIL != isa.isa_in_any_mtP(semx_pred2, noun_compound_parser.$const224$StrictlyFunctionalSlot)) {
                    SubLObject badP2 = (SubLObject)noun_compound_parser.NIL;
                    final SubLObject mt_var2 = mt_relevance_macros.with_inference_mt_relevance_validate(wff_domain);
                    final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var2), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var2), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var2), thread);
                        final SubLObject _prev_bind_0_$39 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$40 = pred_relevance_macros.$pred$.currentBinding(thread);
                        try {
                            pred_relevance_macros.$relevant_pred_function$.bind((SubLObject)noun_compound_parser.$sym225$RELEVANT_PRED_IS_SPEC_PRED, thread);
                            pred_relevance_macros.$pred$.bind(semx_pred2, thread);
                            final SubLObject pred_var = (SubLObject)noun_compound_parser.NIL;
                            if (noun_compound_parser.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(arg1, (SubLObject)noun_compound_parser.ONE_INTEGER, pred_var)) {
                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(arg1, (SubLObject)noun_compound_parser.ONE_INTEGER, pred_var);
                                SubLObject done_var = badP2;
                                final SubLObject token_var = (SubLObject)noun_compound_parser.NIL;
                                while (noun_compound_parser.NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                    if (noun_compound_parser.NIL != valid) {
                                        SubLObject final_index_iterator = (SubLObject)noun_compound_parser.NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)noun_compound_parser.$kw138$GAF, (SubLObject)noun_compound_parser.$kw180$TRUE, (SubLObject)noun_compound_parser.NIL);
                                            SubLObject done_var_$41 = badP2;
                                            final SubLObject token_var_$42 = (SubLObject)noun_compound_parser.NIL;
                                            while (noun_compound_parser.NIL == done_var_$41) {
                                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$42);
                                                final SubLObject valid_$43 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$42.eql(assertion));
                                                if (noun_compound_parser.NIL != valid_$43) {
                                                    final SubLObject should_be = kb_gp_mapping.dgaivgp_arg(assertion, (SubLObject)noun_compound_parser.TWO_INTEGER);
                                                    if (!should_be.equal(arg2)) {
                                                        if (noun_compound_parser.NIL != verboseP) {
                                                            PrintLow.format((SubLObject)noun_compound_parser.T, (SubLObject)noun_compound_parser.$str226$___but_it_failed_the_strictly_fun, new SubLObject[] { semx_pred2, arg1, should_be });
                                                        }
                                                        badP2 = (SubLObject)noun_compound_parser.T;
                                                    }
                                                }
                                                done_var_$41 = (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_parser.NIL == valid_$43 || noun_compound_parser.NIL != badP2);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$40 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)noun_compound_parser.T, thread);
                                                final SubLObject _values = Values.getValuesAsVector();
                                                if (noun_compound_parser.NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                Values.restoreValuesFromVector(_values);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$40, thread);
                                            }
                                        }
                                    }
                                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_parser.NIL == valid || noun_compound_parser.NIL != badP2);
                                }
                            }
                        }
                        finally {
                            pred_relevance_macros.$pred$.rebind(_prev_bind_1_$40, thread);
                            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0_$39, thread);
                        }
                        if (noun_compound_parser.NIL != kb_gp_mapping.dgaigp_binaryP(semx_pred2)) {
                            final SubLObject _prev_bind_0_$41 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$41 = pred_relevance_macros.$pred$.currentBinding(thread);
                            try {
                                pred_relevance_macros.$relevant_pred_function$.bind((SubLObject)noun_compound_parser.$sym227$RELEVANT_PRED_IS_SPEC_INVERSE, thread);
                                pred_relevance_macros.$pred$.bind(semx_pred2, thread);
                                final SubLObject pred_var = (SubLObject)noun_compound_parser.NIL;
                                if (noun_compound_parser.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(arg1, arity.binary_arg_swap((SubLObject)noun_compound_parser.ONE_INTEGER), pred_var)) {
                                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(arg1, arity.binary_arg_swap((SubLObject)noun_compound_parser.ONE_INTEGER), pred_var);
                                    SubLObject done_var = badP2;
                                    final SubLObject token_var = (SubLObject)noun_compound_parser.NIL;
                                    while (noun_compound_parser.NIL == done_var) {
                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                        if (noun_compound_parser.NIL != valid) {
                                            SubLObject final_index_iterator = (SubLObject)noun_compound_parser.NIL;
                                            try {
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)noun_compound_parser.$kw138$GAF, (SubLObject)noun_compound_parser.$kw180$TRUE, (SubLObject)noun_compound_parser.NIL);
                                                SubLObject done_var_$42 = badP2;
                                                final SubLObject token_var_$43 = (SubLObject)noun_compound_parser.NIL;
                                                while (noun_compound_parser.NIL == done_var_$42) {
                                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$43);
                                                    final SubLObject valid_$44 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$43.eql(assertion));
                                                    if (noun_compound_parser.NIL != valid_$44) {
                                                        final SubLObject _prev_bind_0_$42 = kb_gp_mapping.$mapping_arg_swap$.currentBinding(thread);
                                                        try {
                                                            kb_gp_mapping.$mapping_arg_swap$.bind((SubLObject)SubLObjectFactory.makeBoolean(noun_compound_parser.NIL == kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)), thread);
                                                            final SubLObject should_be2 = kb_gp_mapping.dgaivgp_arg(assertion, (SubLObject)noun_compound_parser.TWO_INTEGER);
                                                            if (!should_be2.equal(arg2)) {
                                                                if (noun_compound_parser.NIL != verboseP) {
                                                                    PrintLow.format((SubLObject)noun_compound_parser.T, (SubLObject)noun_compound_parser.$str226$___but_it_failed_the_strictly_fun, new SubLObject[] { semx_pred2, arg1, should_be2 });
                                                                }
                                                                badP2 = (SubLObject)noun_compound_parser.T;
                                                            }
                                                        }
                                                        finally {
                                                            kb_gp_mapping.$mapping_arg_swap$.rebind(_prev_bind_0_$42, thread);
                                                        }
                                                    }
                                                    done_var_$42 = (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_parser.NIL == valid_$44 || noun_compound_parser.NIL != badP2);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$43 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)noun_compound_parser.T, thread);
                                                    final SubLObject _values2 = Values.getValuesAsVector();
                                                    if (noun_compound_parser.NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                    Values.restoreValuesFromVector(_values2);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
                                                }
                                            }
                                        }
                                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_parser.NIL == valid || noun_compound_parser.NIL != badP2);
                                    }
                                }
                            }
                            finally {
                                pred_relevance_macros.$pred$.rebind(_prev_bind_1_$41, thread);
                                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0_$41, thread);
                            }
                        }
                    }
                    finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_6, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_5, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                    }
                    if (noun_compound_parser.NIL != badP2) {
                        return (SubLObject)noun_compound_parser.T;
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(semx, (SubLObject)noun_compound_parser.$list209);
            }
        }
        return (SubLObject)noun_compound_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 70322L)
    public static SubLObject rbp_rb_combine_noun_compound_blocks(final SubLObject block1, final SubLObject block2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        rbp_rule_bank.rbp_rb_check_initialization();
        if (noun_compound_parser.NIL != rbp_traced_rules()) {
            PrintLow.format((SubLObject)noun_compound_parser.T, (SubLObject)noun_compound_parser.$str228$__Trying_this_block_pair_____S___, new SubLObject[] { nc_block_spanned_string(block1), nc_block_denot(block1), nc_block_head_string_pred(block1), nc_block_spanned_string(block2), nc_block_denot(block2), nc_block_head_string_pred(block2) });
        }
        final SubLObject successful_rules = rbp_rb_rules_matching_blocks(block1, block2);
        SubLObject ans = (SubLObject)noun_compound_parser.NIL;
        SubLObject cdolist_list_var = successful_rules;
        SubLObject rule = (SubLObject)noun_compound_parser.NIL;
        rule = cdolist_list_var.first();
        while (noun_compound_parser.NIL != cdolist_list_var) {
            if (noun_compound_parser.NIL != rbp_rb_blocks_pass_inter_constraintsP(block1, block2, rule)) {
                final SubLObject rule_cycl = rbp_rule_bank.rbp_rule_cycl(rule);
                final SubLObject base_semx = rbp_rule_cycl_semx(rule_cycl, (SubLObject)noun_compound_parser.UNPROVIDED);
                thread.resetMultipleValues();
                SubLObject semx = combine_blocks_with_template(block1, block2, base_semx, (SubLObject)noun_compound_parser.UNPROVIDED);
                SubLObject wff_result = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (noun_compound_parser.NIL != subl_promotions.memberP(rule, rbp_traced_rules(), (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED) || noun_compound_parser.NIL != noun_compound_parser.$rbp_show_successful_rulesP$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)noun_compound_parser.T, (SubLObject)noun_compound_parser.$str229$__Rule__S_yielded____a___for__S__, new SubLObject[] { rule, semx, nc_block_spanned_string(block1), nc_block_spanned_string(block2) });
                }
                if (wff_result != noun_compound_parser.$kw230$WFF) {
                    if (noun_compound_parser.NIL != subl_promotions.memberP(rule, rbp_traced_rules(), (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED) || noun_compound_parser.NIL != noun_compound_parser.$rbp_show_successful_rulesP$.getDynamicValue(thread)) {
                        PrintLow.format((SubLObject)noun_compound_parser.T, (SubLObject)noun_compound_parser.$str231$___but_it_failed_the_wff_checker_);
                        final SubLObject _prev_bind_0 = rbp_wff.$rbp_show_non_wffP$.currentBinding(thread);
                        try {
                            rbp_wff.$rbp_show_non_wffP$.bind((SubLObject)noun_compound_parser.T, thread);
                            rbp_wff.rbp_wff_clear_caches();
                            rbp_wff.rbp_wf_natP(semx, parsing_vars.$np_wff_filter_level$.getDynamicValue(thread));
                        }
                        finally {
                            rbp_wff.$rbp_show_non_wffP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                else if (!parsing_vars.$np_wff_filter_level$.getDynamicValue(thread).numG((SubLObject)noun_compound_parser.ZERO_INTEGER) || noun_compound_parser.NIL == rbp_fails_wff_workaroundsP(rule, semx, (SubLObject)noun_compound_parser.UNPROVIDED)) {
                    SubLObject formula_arg_fn_nautP = Equality.eql(cycl_utilities.formula_arg0(semx), noun_compound_parser.$const232$FormulaArgFn);
                    while (noun_compound_parser.NIL != formula_arg_fn_nautP) {
                        SubLObject current;
                        final SubLObject datum = current = cycl_utilities.formula_args(semx, (SubLObject)noun_compound_parser.UNPROVIDED);
                        SubLObject just_this_arg = (SubLObject)noun_compound_parser.NIL;
                        SubLObject formula = (SubLObject)noun_compound_parser.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)noun_compound_parser.$list233);
                        just_this_arg = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)noun_compound_parser.$list233);
                        formula = current.first();
                        current = current.rest();
                        if (noun_compound_parser.NIL == current) {
                            if (noun_compound_parser.NIL != subl_promotions.positive_integer_p(just_this_arg) && just_this_arg.numG(el_utilities.formula_arity(semx, (SubLObject)noun_compound_parser.UNPROVIDED)) && (noun_compound_parser.NIL != subl_promotions.memberP(rule, rbp_traced_rules(), (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED) || noun_compound_parser.NIL != noun_compound_parser.$rbp_show_successful_rulesP$.getDynamicValue(thread))) {
                                PrintLow.format((SubLObject)noun_compound_parser.T, (SubLObject)noun_compound_parser.$str234$___but_the_desired_FormulaArgFn__, just_this_arg, el_utilities.formula_arity(semx, (SubLObject)noun_compound_parser.UNPROVIDED));
                                wff_result = (SubLObject)noun_compound_parser.$kw235$NOT_WFF;
                            }
                            formula_arg_fn_nautP = Equality.eql(cycl_utilities.formula_arg0(formula), noun_compound_parser.$const232$FormulaArgFn);
                            if (noun_compound_parser.NIL == formula_arg_fn_nautP) {
                                final SubLObject verifiedP = rbp_verify(formula, (SubLObject)noun_compound_parser.UNPROVIDED);
                                if (noun_compound_parser.NIL == verifiedP) {
                                    wff_result = (SubLObject)noun_compound_parser.$kw236$NON_WFF;
                                    if (noun_compound_parser.NIL != subl_promotions.memberP(rule, rbp_traced_rules(), (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED) || noun_compound_parser.NIL != noun_compound_parser.$rbp_show_successful_rulesP$.getDynamicValue(thread)) {
                                        PrintLow.format((SubLObject)noun_compound_parser.T, (SubLObject)noun_compound_parser.$str237$___but_I_was_unable_to_verify__S_, formula);
                                    }
                                }
                            }
                            semx = cycl_utilities.formula_arg(formula, just_this_arg, (SubLObject)noun_compound_parser.UNPROVIDED);
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)noun_compound_parser.$list233);
                        }
                    }
                    if (noun_compound_parser.$kw230$WFF == wff_result) {
                        ans = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(rule, semx), ans);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 72999L)
    public static SubLObject rbp_rb_rules_matching_blocks(final SubLObject block1, final SubLObject block2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject closed_matches = rbp_rb_rules_matching_blocks_wrt_closed_constraints(block1, block2, (SubLObject)noun_compound_parser.UNPROVIDED);
        final SubLObject surviving_traced_rules = (SubLObject)((noun_compound_parser.NIL != rbp_traced_rules()) ? (closed_matches.isList() ? keyhash_utilities.fast_intersection(rbp_traced_rules(), closed_matches, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED) : rbp_traced_rules()) : noun_compound_parser.NIL);
        thread.resetMultipleValues();
        final SubLObject block1_rules = rbp_rb_search_wrt_open_constraints(block1, (SubLObject)noun_compound_parser.$kw238$MODIFIER, closed_matches, surviving_traced_rules);
        final SubLObject new_surviving_traced_rules = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return (SubLObject)((noun_compound_parser.NIL != block1_rules) ? rbp_rb_search_wrt_open_constraints(block2, (SubLObject)noun_compound_parser.$kw75$HEAD, block1_rules, new_surviving_traced_rules) : noun_compound_parser.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 73838L)
    public static SubLObject rbp_rb_rules_matching_blocks_wrt_closed_constraints(final SubLObject block1, final SubLObject block2, SubLObject destructibleP) {
        if (destructibleP == noun_compound_parser.UNPROVIDED) {
            destructibleP = (SubLObject)noun_compound_parser.T;
        }
        final SubLObject bases = (SubLObject)ConsesLow.make_list((SubLObject)noun_compound_parser.FOUR_INTEGER, (SubLObject)noun_compound_parser.UNPROVIDED);
        SubLObject list_var = (SubLObject)noun_compound_parser.NIL;
        SubLObject filter_key = (SubLObject)noun_compound_parser.NIL;
        SubLObject i = (SubLObject)noun_compound_parser.NIL;
        list_var = noun_compound_parser.$rbp_rb_closed_class_filter_keys$.getGlobalValue();
        filter_key = list_var.first();
        for (i = (SubLObject)noun_compound_parser.ZERO_INTEGER; noun_compound_parser.NIL != list_var; list_var = list_var.rest(), filter_key = list_var.first(), i = Numbers.add((SubLObject)noun_compound_parser.ONE_INTEGER, i)) {
            SubLObject current;
            final SubLObject datum = current = filter_key;
            SubLObject c_type = (SubLObject)noun_compound_parser.NIL;
            SubLObject o_type = (SubLObject)noun_compound_parser.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)noun_compound_parser.$list240);
            c_type = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)noun_compound_parser.$list240);
            o_type = current.first();
            current = current.rest();
            if (noun_compound_parser.NIL == current) {
                final SubLObject block3 = (o_type == noun_compound_parser.$kw238$MODIFIER) ? block1 : block2;
                final SubLObject base = rbp_base_from_block(block3, c_type);
                ConsesLow.set_nth(i, bases, base);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)noun_compound_parser.$list240);
            }
        }
        final SubLObject closed_matches = rbp_rb_rules_matching_closed_specs(bases);
        return (noun_compound_parser.NIL != destructibleP) ? conses_high.copy_list(closed_matches) : closed_matches;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 74590L)
    public static SubLObject clear_rbp_rb_rules_matching_closed_specs() {
        final SubLObject cs = noun_compound_parser.$rbp_rb_rules_matching_closed_specs_caching_state$.getGlobalValue();
        if (noun_compound_parser.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)noun_compound_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 74590L)
    public static SubLObject remove_rbp_rb_rules_matching_closed_specs(final SubLObject bases) {
        return memoization_state.caching_state_remove_function_results_with_args(noun_compound_parser.$rbp_rb_rules_matching_closed_specs_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(bases), (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 74590L)
    public static SubLObject rbp_rb_rules_matching_closed_specs_internal(final SubLObject bases) {
        SubLObject no_matchP = (SubLObject)noun_compound_parser.NIL;
        SubLObject candidate_matches = (SubLObject)noun_compound_parser.$kw242$ALL;
        final SubLObject surviving_traced_rules = (SubLObject)noun_compound_parser.NIL;
        if (noun_compound_parser.NIL == no_matchP) {
            SubLObject base = (SubLObject)noun_compound_parser.NIL;
            SubLObject base_$52 = (SubLObject)noun_compound_parser.NIL;
            SubLObject filter_key = (SubLObject)noun_compound_parser.NIL;
            SubLObject filter_key_$53 = (SubLObject)noun_compound_parser.NIL;
            base = bases;
            base_$52 = base.first();
            filter_key = noun_compound_parser.$rbp_rb_closed_class_filter_keys$.getGlobalValue();
            filter_key_$53 = filter_key.first();
            while (noun_compound_parser.NIL == no_matchP && (noun_compound_parser.NIL != filter_key || noun_compound_parser.NIL != base)) {
                final SubLObject new_candidate_matches = rbp_rule_bank.rbp_rb_filter_rules(candidate_matches, surviving_traced_rules, filter_key_$53, base_$52);
                if (noun_compound_parser.NIL != new_candidate_matches) {
                    candidate_matches = new_candidate_matches;
                }
                else {
                    no_matchP = (SubLObject)noun_compound_parser.T;
                }
                base = base.rest();
                base_$52 = base.first();
                filter_key = filter_key.rest();
                filter_key_$53 = filter_key.first();
            }
        }
        return (SubLObject)((noun_compound_parser.NIL != no_matchP) ? noun_compound_parser.NIL : candidate_matches);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 74590L)
    public static SubLObject rbp_rb_rules_matching_closed_specs(final SubLObject bases) {
        SubLObject caching_state = noun_compound_parser.$rbp_rb_rules_matching_closed_specs_caching_state$.getGlobalValue();
        if (noun_compound_parser.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)noun_compound_parser.$sym241$RBP_RB_RULES_MATCHING_CLOSED_SPECS, (SubLObject)noun_compound_parser.$sym243$_RBP_RB_RULES_MATCHING_CLOSED_SPECS_CACHING_STATE_, (SubLObject)noun_compound_parser.NIL, (SubLObject)noun_compound_parser.EQUAL, (SubLObject)noun_compound_parser.ONE_INTEGER, (SubLObject)noun_compound_parser.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, bases, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rbp_rb_rules_matching_closed_specs_internal(bases)));
            memoization_state.caching_state_put(caching_state, bases, results, (SubLObject)noun_compound_parser.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 75189L)
    public static SubLObject rbp_rb_search_wrt_open_constraints(final SubLObject block, final SubLObject o_type, final SubLObject closed_matches, final SubLObject surviving_traced_rules) {
        return rbp_rb_search(block, o_type, closed_matches, (SubLObject)noun_compound_parser.$kw244$OPEN_CLASS, surviving_traced_rules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 75391L)
    public static SubLObject rbp_verify_internal(final SubLObject formula, SubLObject mt) {
        if (mt == noun_compound_parser.UNPROVIDED) {
            mt = parsing_vars.$parsing_domain_mt$.getDynamicValue();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_parser.NIL != term.closed_termP(formula, (SubLObject)noun_compound_parser.UNPROVIDED) && noun_compound_parser.NIL != backward.removal_ask(formula, mt, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 75391L)
    public static SubLObject rbp_verify(final SubLObject formula, SubLObject mt) {
        if (mt == noun_compound_parser.UNPROVIDED) {
            mt = parsing_vars.$parsing_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)noun_compound_parser.NIL;
        if (noun_compound_parser.NIL == v_memoization_state) {
            return rbp_verify_internal(formula, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)noun_compound_parser.$sym245$RBP_VERIFY, (SubLObject)noun_compound_parser.UNPROVIDED);
        if (noun_compound_parser.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)noun_compound_parser.$sym245$RBP_VERIFY, (SubLObject)noun_compound_parser.TWO_INTEGER, (SubLObject)noun_compound_parser.NIL, (SubLObject)noun_compound_parser.EQUAL, (SubLObject)noun_compound_parser.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)noun_compound_parser.$sym245$RBP_VERIFY, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(formula, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)noun_compound_parser.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)noun_compound_parser.NIL;
            collision = cdolist_list_var.first();
            while (noun_compound_parser.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (formula.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (noun_compound_parser.NIL != cached_args && noun_compound_parser.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rbp_verify_internal(formula, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(formula, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 75611L)
    public static SubLObject rbp_rb_search(final SubLObject block, final SubLObject o_type, SubLObject candidate_matches, SubLObject mode, SubLObject traced_rules) {
        if (candidate_matches == noun_compound_parser.UNPROVIDED) {
            candidate_matches = (SubLObject)noun_compound_parser.$kw242$ALL;
        }
        if (mode == noun_compound_parser.UNPROVIDED) {
            mode = (SubLObject)noun_compound_parser.$kw242$ALL;
        }
        if (traced_rules == noun_compound_parser.UNPROVIDED) {
            traced_rules = rbp_traced_rules();
        }
        if (noun_compound_parser.NIL == traced_rules && mode.equal((SubLObject)noun_compound_parser.$kw242$ALL) && !candidate_matches.isList()) {
            return conses_high.copy_list(rbp_rb_initial_search_no_tracing(block, o_type));
        }
        return rbp_rb_search_internal(block, o_type, candidate_matches, mode, traced_rules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 76480L)
    public static SubLObject inference_rbp_rb_search(final SubLObject block, final SubLObject o_type, SubLObject candidate_matches, SubLObject mode, SubLObject traced_rules) {
        if (candidate_matches == noun_compound_parser.UNPROVIDED) {
            candidate_matches = (SubLObject)noun_compound_parser.$kw242$ALL;
        }
        if (mode == noun_compound_parser.UNPROVIDED) {
            mode = (SubLObject)noun_compound_parser.$kw242$ALL;
        }
        if (traced_rules == noun_compound_parser.UNPROVIDED) {
            traced_rules = rbp_traced_rules();
        }
        return rbp_rb_search(block, o_type, candidate_matches, mode, traced_rules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 76694L)
    public static SubLObject rbp_rb_initial_search_no_tracing_internal(final SubLObject block, final SubLObject o_type) {
        return rbp_rb_search_internal(block, o_type, (SubLObject)noun_compound_parser.$kw242$ALL, (SubLObject)noun_compound_parser.$kw242$ALL, (SubLObject)noun_compound_parser.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 76694L)
    public static SubLObject rbp_rb_initial_search_no_tracing(final SubLObject block, final SubLObject o_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)noun_compound_parser.NIL;
        if (noun_compound_parser.NIL == v_memoization_state) {
            return rbp_rb_initial_search_no_tracing_internal(block, o_type);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)noun_compound_parser.$sym246$RBP_RB_INITIAL_SEARCH_NO_TRACING, (SubLObject)noun_compound_parser.UNPROVIDED);
        if (noun_compound_parser.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)noun_compound_parser.$sym246$RBP_RB_INITIAL_SEARCH_NO_TRACING, (SubLObject)noun_compound_parser.TWO_INTEGER, (SubLObject)noun_compound_parser.NIL, (SubLObject)noun_compound_parser.EQ, (SubLObject)noun_compound_parser.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)noun_compound_parser.$sym246$RBP_RB_INITIAL_SEARCH_NO_TRACING, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(block, o_type);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)noun_compound_parser.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)noun_compound_parser.NIL;
            collision = cdolist_list_var.first();
            while (noun_compound_parser.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (block.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (noun_compound_parser.NIL != cached_args && noun_compound_parser.NIL == cached_args.rest() && o_type.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rbp_rb_initial_search_no_tracing_internal(block, o_type)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(block, o_type));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 76898L)
    public static SubLObject rbp_rb_search_internal(final SubLObject block, final SubLObject o_type, SubLObject candidate_matches, final SubLObject mode, final SubLObject traced_rules) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject surviving_traced_rules = candidate_matches.isList() ? keyhash_utilities.fast_intersection(traced_rules, candidate_matches, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED) : traced_rules;
        SubLObject no_matchP = (SubLObject)noun_compound_parser.NIL;
        final SubLObject syntactic_types = rbp_rule_bank.$rbp_syntactic_constraint_types$.getGlobalValue();
        final SubLObject semantic_types = rbp_rule_bank.$rbp_semantic_constraint_types$.getGlobalValue();
        final SubLObject open_types = rbp_rule_bank.$rbp_open_class_constraint_types$.getGlobalValue();
        final SubLObject closed_types = rbp_rule_bank.$rbp_closed_class_constraint_types$.getGlobalValue();
        if ((mode.eql((SubLObject)noun_compound_parser.$kw242$ALL) || mode.eql((SubLObject)noun_compound_parser.$kw247$SYNTACTIC)) && noun_compound_parser.NIL == no_matchP) {
            SubLObject csome_list_var = syntactic_types;
            SubLObject c_type = (SubLObject)noun_compound_parser.NIL;
            c_type = csome_list_var.first();
            while (noun_compound_parser.NIL == no_matchP && noun_compound_parser.NIL != csome_list_var) {
                final SubLObject filter_key = (SubLObject)ConsesLow.list(c_type, o_type);
                final SubLObject base = rbp_base_from_block(block, c_type);
                thread.resetMultipleValues();
                final SubLObject new_candidate_matches = rbp_rule_bank.rbp_rb_filter_rules(candidate_matches, surviving_traced_rules, filter_key, base);
                final SubLObject new_survivors = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (noun_compound_parser.NIL != new_candidate_matches) {
                    candidate_matches = new_candidate_matches;
                    surviving_traced_rules = new_survivors;
                }
                else {
                    no_matchP = (SubLObject)noun_compound_parser.T;
                }
                csome_list_var = csome_list_var.rest();
                c_type = csome_list_var.first();
            }
        }
        if ((mode.eql((SubLObject)noun_compound_parser.$kw242$ALL) || mode.eql((SubLObject)noun_compound_parser.$kw248$SEMANTIC)) && noun_compound_parser.NIL == no_matchP) {
            SubLObject csome_list_var = semantic_types;
            SubLObject c_type = (SubLObject)noun_compound_parser.NIL;
            c_type = csome_list_var.first();
            while (noun_compound_parser.NIL == no_matchP && noun_compound_parser.NIL != csome_list_var) {
                final SubLObject filter_key = (SubLObject)ConsesLow.list(c_type, o_type);
                final SubLObject base = rbp_base_from_block(block, c_type);
                thread.resetMultipleValues();
                final SubLObject new_candidate_matches = rbp_rule_bank.rbp_rb_filter_rules(candidate_matches, surviving_traced_rules, filter_key, base);
                final SubLObject new_survivors = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (noun_compound_parser.NIL != new_candidate_matches) {
                    candidate_matches = new_candidate_matches;
                    surviving_traced_rules = new_survivors;
                }
                else {
                    no_matchP = (SubLObject)noun_compound_parser.T;
                }
                csome_list_var = csome_list_var.rest();
                c_type = csome_list_var.first();
            }
        }
        if (mode.eql((SubLObject)noun_compound_parser.$kw244$OPEN_CLASS) && noun_compound_parser.NIL == no_matchP) {
            SubLObject csome_list_var = open_types;
            SubLObject c_type = (SubLObject)noun_compound_parser.NIL;
            c_type = csome_list_var.first();
            while (noun_compound_parser.NIL == no_matchP && noun_compound_parser.NIL != csome_list_var) {
                final SubLObject filter_key = (SubLObject)ConsesLow.list(c_type, o_type);
                final SubLObject base = rbp_base_from_block(block, c_type);
                thread.resetMultipleValues();
                final SubLObject new_candidate_matches = rbp_rule_bank.rbp_rb_filter_rules(candidate_matches, surviving_traced_rules, filter_key, base);
                final SubLObject new_survivors = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (noun_compound_parser.NIL != new_candidate_matches) {
                    candidate_matches = new_candidate_matches;
                    surviving_traced_rules = new_survivors;
                }
                else {
                    no_matchP = (SubLObject)noun_compound_parser.T;
                }
                csome_list_var = csome_list_var.rest();
                c_type = csome_list_var.first();
            }
        }
        if (mode.eql((SubLObject)noun_compound_parser.$kw249$CLOSED_CLASS) && noun_compound_parser.NIL == no_matchP) {
            SubLObject csome_list_var = closed_types;
            SubLObject c_type = (SubLObject)noun_compound_parser.NIL;
            c_type = csome_list_var.first();
            while (noun_compound_parser.NIL == no_matchP && noun_compound_parser.NIL != csome_list_var) {
                final SubLObject filter_key = (SubLObject)ConsesLow.list(c_type, o_type);
                final SubLObject base = rbp_base_from_block(block, c_type);
                thread.resetMultipleValues();
                final SubLObject new_candidate_matches = rbp_rule_bank.rbp_rb_filter_rules(candidate_matches, surviving_traced_rules, filter_key, base);
                final SubLObject new_survivors = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (noun_compound_parser.NIL != new_candidate_matches) {
                    candidate_matches = new_candidate_matches;
                    surviving_traced_rules = new_survivors;
                }
                else {
                    no_matchP = (SubLObject)noun_compound_parser.T;
                }
                csome_list_var = csome_list_var.rest();
                c_type = csome_list_var.first();
            }
        }
        return Values.values((SubLObject)((noun_compound_parser.NIL != no_matchP) ? noun_compound_parser.NIL : candidate_matches), surviving_traced_rules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 77887L)
    public static SubLObject rbp_rb_blocks_pass_inter_constraintsP(final SubLObject block1, final SubLObject block2, final SubLObject rule) {
        final SubLObject inter_constraints = inter_constraints_from_rule(rule);
        final SubLObject passP = blocks_pass_all_inter_nc_constraintsP(block1, block2, inter_constraints);
        if (noun_compound_parser.NIL == passP && noun_compound_parser.NIL != conses_high.member(rule, rbp_traced_rules(), (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED)) {
            PrintLow.format((SubLObject)noun_compound_parser.T, (SubLObject)noun_compound_parser.$str250$__The_blocks_failed_an_inter_cons, inter_constraints, rule);
        }
        return passP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 78447L)
    public static SubLObject clear_inter_constraints_from_rule() {
        final SubLObject cs = noun_compound_parser.$inter_constraints_from_rule_caching_state$.getGlobalValue();
        if (noun_compound_parser.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)noun_compound_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 78447L)
    public static SubLObject remove_inter_constraints_from_rule(final SubLObject rbp_rule) {
        return memoization_state.caching_state_remove_function_results_with_args(noun_compound_parser.$inter_constraints_from_rule_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(rbp_rule), (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 78447L)
    public static SubLObject inter_constraints_from_rule_internal(final SubLObject rbp_rule) {
        final SubLObject rule_cycl = rbp_rule_bank.rbp_rule_cycl(rbp_rule);
        final SubLObject constraints = rbp_rule_bank.rbp_rule_constraints(rule_cycl);
        SubLObject ans = (SubLObject)noun_compound_parser.NIL;
        SubLObject cdolist_list_var = constraints;
        SubLObject constraint = (SubLObject)noun_compound_parser.NIL;
        constraint = cdolist_list_var.first();
        while (noun_compound_parser.NIL != cdolist_list_var) {
            if (noun_compound_parser.NIL != subl_promotions.memberP((SubLObject)noun_compound_parser.$kw238$MODIFIER, constraint, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED) && noun_compound_parser.NIL != conses_high.member((SubLObject)noun_compound_parser.$kw75$HEAD, constraint, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED)) {
                ans = (SubLObject)ConsesLow.cons(constraint, ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint = cdolist_list_var.first();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 78447L)
    public static SubLObject inter_constraints_from_rule(final SubLObject rbp_rule) {
        SubLObject caching_state = noun_compound_parser.$inter_constraints_from_rule_caching_state$.getGlobalValue();
        if (noun_compound_parser.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)noun_compound_parser.$sym251$INTER_CONSTRAINTS_FROM_RULE, (SubLObject)noun_compound_parser.$sym252$_INTER_CONSTRAINTS_FROM_RULE_CACHING_STATE_, (SubLObject)noun_compound_parser.$int163$512, (SubLObject)noun_compound_parser.EQL, (SubLObject)noun_compound_parser.ONE_INTEGER, (SubLObject)noun_compound_parser.$int164$128);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, rbp_rule, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(inter_constraints_from_rule_internal(rbp_rule)));
            memoization_state.caching_state_put(caching_state, rbp_rule, results, (SubLObject)noun_compound_parser.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 78815L)
    public static SubLObject blocks_pass_all_inter_nc_constraintsP(final SubLObject ncb1, final SubLObject ncb2, final SubLObject constraints) {
        if (noun_compound_parser.NIL == constraints) {
            return (SubLObject)noun_compound_parser.T;
        }
        SubLObject failP = (SubLObject)noun_compound_parser.NIL;
        if (noun_compound_parser.NIL == failP) {
            SubLObject csome_list_var;
            SubLObject constraint;
            for (csome_list_var = constraints, constraint = (SubLObject)noun_compound_parser.NIL, constraint = csome_list_var.first(); noun_compound_parser.NIL == failP && noun_compound_parser.NIL != csome_list_var; failP = (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_parser.NIL == blocks_pass_inter_nc_constraintP(ncb1, ncb2, constraint)), csome_list_var = csome_list_var.rest(), constraint = csome_list_var.first()) {}
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_parser.NIL == failP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 79233L)
    public static SubLObject blocks_pass_inter_nc_constraintP(final SubLObject ncb1, final SubLObject ncb2, final SubLObject constraint) {
        SubLObject con_kw = (SubLObject)noun_compound_parser.NIL;
        SubLObject arg1 = (SubLObject)noun_compound_parser.NIL;
        SubLObject arg2 = (SubLObject)noun_compound_parser.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(constraint, constraint, (SubLObject)noun_compound_parser.$list253);
        con_kw = constraint.first();
        SubLObject current = constraint.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, constraint, (SubLObject)noun_compound_parser.$list253);
        arg1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, constraint, (SubLObject)noun_compound_parser.$list253);
        arg2 = current.first();
        current = current.rest();
        if (noun_compound_parser.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(constraint, (SubLObject)noun_compound_parser.$list253);
            return (SubLObject)noun_compound_parser.NIL;
        }
        final SubLObject sem1 = (noun_compound_parser.NIL != conses_high.member(arg1, (SubLObject)noun_compound_parser.$list254, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED)) ? nc_block_denot(ncb1) : nc_block_denot(ncb2);
        final SubLObject sem2 = (noun_compound_parser.NIL != conses_high.member(arg2, (SubLObject)noun_compound_parser.$list254, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED)) ? nc_block_denot(ncb1) : nc_block_denot(ncb2);
        if (noun_compound_parser.$kw255$NO_DENOT == sem1 || noun_compound_parser.$kw255$NO_DENOT == sem2) {
            return (SubLObject)noun_compound_parser.NIL;
        }
        if (noun_compound_parser.NIL != inter_nc_block_test(con_kw, sem1, sem2)) {
            return (SubLObject)noun_compound_parser.T;
        }
        return (SubLObject)noun_compound_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 79920L)
    public static SubLObject inter_nc_block_test(final SubLObject keyword, final SubLObject item1, final SubLObject item2) {
        if (keyword.eql((SubLObject)noun_compound_parser.$kw256$isa) || keyword.eql((SubLObject)noun_compound_parser.$kw194$ISA)) {
            return rbp_wff.npp_isaP(item1, item2, (SubLObject)noun_compound_parser.UNPROVIDED);
        }
        if (keyword.eql((SubLObject)noun_compound_parser.$kw257$genl) || keyword.eql((SubLObject)noun_compound_parser.$kw258$GENL)) {
            return rbp_wff.npp_genlP(item1, item2, (SubLObject)noun_compound_parser.UNPROVIDED);
        }
        return (SubLObject)noun_compound_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 80260L)
    public static SubLObject rbp_check_initializations() {
        rbp_wff.rbp_wff_clear_caches();
        return (SubLObject)noun_compound_parser.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 80346L)
    public static SubLObject combine_blocks_with_template(final SubLObject block1, final SubLObject block2, final SubLObject raw_template, SubLObject traceP) {
        if (traceP == noun_compound_parser.UNPROVIDED) {
            traceP = (SubLObject)noun_compound_parser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject comp_sem1 = nc_block_denot(block1);
        final SubLObject comp_sem2 = nc_block_denot(block2);
        final SubLObject keyword_bindings = (SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)noun_compound_parser.$kw238$MODIFIER, comp_sem1), reader.bq_cons((SubLObject)noun_compound_parser.$kw75$HEAD, comp_sem2));
        final SubLObject new_comp_sem = rbp_wff.rbp_subst_bindings(keyword_bindings, raw_template);
        if (noun_compound_parser.NIL != cycl_utilities.expression_find((SubLObject)noun_compound_parser.$kw255$NO_DENOT, new_comp_sem, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED) || (parsing_vars.$np_wff_filter_level$.getDynamicValue(thread).numG((SubLObject)noun_compound_parser.ZERO_INTEGER) && noun_compound_parser.NIL == rbp_wff.rbp_wf_template_argsP(raw_template, keyword_bindings, (SubLObject)noun_compound_parser.ONE_INTEGER)) || (parsing_vars.$np_wff_filter_level$.getDynamicValue(thread).numG((SubLObject)noun_compound_parser.ONE_INTEGER) && noun_compound_parser.NIL == rbp_wff.rbp_wf_template_argsP(raw_template, keyword_bindings, (SubLObject)noun_compound_parser.TWO_INTEGER))) {
            return Values.values(new_comp_sem, (SubLObject)noun_compound_parser.$kw236$NON_WFF);
        }
        if (noun_compound_parser.NIL != traceP) {
            PrintLow.format((SubLObject)noun_compound_parser.T, (SubLObject)noun_compound_parser.$str259$__Semantics_are__S_and__S___in_te, new SubLObject[] { comp_sem1, comp_sem2, raw_template });
        }
        return Values.values(new_comp_sem, (SubLObject)noun_compound_parser.$kw230$WFF);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 81342L)
    public static SubLObject rbp_test_for_con_kw(final SubLObject con_kw) {
        if (con_kw.eql((SubLObject)noun_compound_parser.$kw260$pred) || con_kw.eql((SubLObject)noun_compound_parser.$kw261$PRED)) {
            return (SubLObject)noun_compound_parser.$sym262$NPP_GENL_PRED_;
        }
        if (con_kw.eql((SubLObject)noun_compound_parser.$kw263$pos) || con_kw.eql((SubLObject)noun_compound_parser.$kw264$POS)) {
            return (SubLObject)noun_compound_parser.$sym134$NPP_GENL_;
        }
        if (con_kw.eql((SubLObject)noun_compound_parser.$kw265$eql) || con_kw.eql((SubLObject)noun_compound_parser.$kw266$EQL) || con_kw.eql((SubLObject)noun_compound_parser.$kw82$WU)) {
            return (SubLObject)noun_compound_parser.EQL;
        }
        if (con_kw.eql((SubLObject)noun_compound_parser.$kw256$isa) || con_kw.eql((SubLObject)noun_compound_parser.$kw194$ISA)) {
            return (SubLObject)noun_compound_parser.$sym135$NPP_ISA_;
        }
        if (con_kw.eql((SubLObject)noun_compound_parser.$kw257$genl) || con_kw.eql((SubLObject)noun_compound_parser.$kw258$GENL)) {
            return (SubLObject)noun_compound_parser.$sym134$NPP_GENL_;
        }
        if (con_kw.eql((SubLObject)noun_compound_parser.$kw267$TYPE_GENL)) {
            return (SubLObject)noun_compound_parser.$sym268$NPP_TYPE_GENL_;
        }
        return (SubLObject)noun_compound_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 81699L)
    public static SubLObject rbp_candidate_fn_for_con_kw(final SubLObject con_kw) {
        if (con_kw.eql((SubLObject)noun_compound_parser.$kw260$pred) || con_kw.eql((SubLObject)noun_compound_parser.$kw261$PRED)) {
            return (SubLObject)noun_compound_parser.$sym64$NC_BLOCK_HEAD_STRING_PRED;
        }
        if (con_kw.eql((SubLObject)noun_compound_parser.$kw263$pos) || con_kw.eql((SubLObject)noun_compound_parser.$kw264$POS)) {
            return (SubLObject)noun_compound_parser.$sym62$NC_BLOCK_HEAD_POS;
        }
        if (con_kw.eql((SubLObject)noun_compound_parser.$kw82$WU)) {
            return (SubLObject)noun_compound_parser.$sym269$NC_BLOCK_WU;
        }
        return (SubLObject)noun_compound_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 81946L)
    public static SubLObject rbp_get_deverbal_root(final SubLObject string, SubLObject use_mass_fallback_if_neededP) {
        if (use_mass_fallback_if_neededP == noun_compound_parser.UNPROVIDED) {
            use_mass_fallback_if_neededP = (SubLObject)noun_compound_parser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject the_root = (SubLObject)noun_compound_parser.NIL;
        SubLObject has_deverbal_endingP = (SubLObject)noun_compound_parser.T;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)noun_compound_parser.$sym270$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), thread);
            if (noun_compound_parser.NIL != string_utilities.ends_with(string, (SubLObject)noun_compound_parser.$str271$ing, (SubLObject)noun_compound_parser.UNPROVIDED)) {
                final SubLObject _prev_bind_0_$54 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$55 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)noun_compound_parser.$sym270$RELEVANT_MT_IS_GENL_MT, thread);
                    mt_relevance_macros.$mt$.bind(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), thread);
                    if (noun_compound_parser.NIL == the_root) {
                        SubLObject csome_list_var = lexicon_accessors.words_of_stringXpred(string, noun_compound_parser.$const151$gerund, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED);
                        SubLObject wu = (SubLObject)noun_compound_parser.NIL;
                        wu = csome_list_var.first();
                        while (noun_compound_parser.NIL == the_root && noun_compound_parser.NIL != csome_list_var) {
                            SubLObject inf = (SubLObject)noun_compound_parser.NIL;
                            final SubLObject pred_var = noun_compound_parser.$const272$infinitive;
                            if (noun_compound_parser.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(wu, (SubLObject)noun_compound_parser.ONE_INTEGER, pred_var)) {
                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(wu, (SubLObject)noun_compound_parser.ONE_INTEGER, pred_var);
                                SubLObject done_var = the_root;
                                final SubLObject token_var = (SubLObject)noun_compound_parser.NIL;
                                while (noun_compound_parser.NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                    if (noun_compound_parser.NIL != valid) {
                                        SubLObject final_index_iterator = (SubLObject)noun_compound_parser.NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)noun_compound_parser.$kw138$GAF, (SubLObject)noun_compound_parser.NIL, (SubLObject)noun_compound_parser.NIL);
                                            SubLObject done_var_$56 = the_root;
                                            final SubLObject token_var_$57 = (SubLObject)noun_compound_parser.NIL;
                                            while (noun_compound_parser.NIL == done_var_$56) {
                                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$57);
                                                final SubLObject valid_$58 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$57.eql(assertion));
                                                if (noun_compound_parser.NIL != valid_$58) {
                                                    inf = (the_root = assertions_high.gaf_arg(assertion, (SubLObject)noun_compound_parser.TWO_INTEGER));
                                                }
                                                done_var_$56 = (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_parser.NIL == valid_$58 || noun_compound_parser.NIL != the_root);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$55 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)noun_compound_parser.T, thread);
                                                final SubLObject _values = Values.getValuesAsVector();
                                                if (noun_compound_parser.NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                Values.restoreValuesFromVector(_values);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$55, thread);
                                            }
                                        }
                                    }
                                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_parser.NIL == valid || noun_compound_parser.NIL != the_root);
                                }
                            }
                            csome_list_var = csome_list_var.rest();
                            wu = csome_list_var.first();
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$55, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$54, thread);
                }
            }
            else if (noun_compound_parser.NIL != string_utilities.ends_with(string, (SubLObject)noun_compound_parser.$str273$ion, (SubLObject)noun_compound_parser.UNPROVIDED)) {
                if (noun_compound_parser.NIL == the_root) {
                    SubLObject csome_list_var2 = lexicon_accessors.words_of_stringXpred(string, noun_compound_parser.$const275$singular, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED);
                    SubLObject wu2 = (SubLObject)noun_compound_parser.NIL;
                    wu2 = csome_list_var2.first();
                    while (noun_compound_parser.NIL == the_root && noun_compound_parser.NIL != csome_list_var2) {
                        if (noun_compound_parser.NIL != kb_mapping.gather_gaf_arg_index(wu2, (SubLObject)noun_compound_parser.ONE_INTEGER, noun_compound_parser.$const274$agentive_Sg, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED)) {
                            SubLObject inf2 = (SubLObject)noun_compound_parser.NIL;
                            final SubLObject pred_var2 = noun_compound_parser.$const272$infinitive;
                            if (noun_compound_parser.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(wu2, (SubLObject)noun_compound_parser.ONE_INTEGER, pred_var2)) {
                                final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(wu2, (SubLObject)noun_compound_parser.ONE_INTEGER, pred_var2);
                                SubLObject done_var2 = the_root;
                                final SubLObject token_var2 = (SubLObject)noun_compound_parser.NIL;
                                while (noun_compound_parser.NIL == done_var2) {
                                    final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                    final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                                    if (noun_compound_parser.NIL != valid2) {
                                        SubLObject final_index_iterator2 = (SubLObject)noun_compound_parser.NIL;
                                        try {
                                            final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)noun_compound_parser.$kw138$GAF, (SubLObject)noun_compound_parser.NIL, (SubLObject)noun_compound_parser.NIL);
                                            SubLObject done_var_$57 = the_root;
                                            final SubLObject token_var_$58 = (SubLObject)noun_compound_parser.NIL;
                                            while (noun_compound_parser.NIL == done_var_$57) {
                                                final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$58);
                                                final SubLObject valid_$59 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$58.eql(assertion2));
                                                if (noun_compound_parser.NIL != valid_$59) {
                                                    inf2 = (the_root = assertions_high.gaf_arg(assertion2, (SubLObject)noun_compound_parser.TWO_INTEGER));
                                                }
                                                done_var_$57 = (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_parser.NIL == valid_$59 || noun_compound_parser.NIL != the_root);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$56 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)noun_compound_parser.T, thread);
                                                final SubLObject _values2 = Values.getValuesAsVector();
                                                if (noun_compound_parser.NIL != final_index_iterator2) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                }
                                                Values.restoreValuesFromVector(_values2);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$56, thread);
                                            }
                                        }
                                    }
                                    done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_parser.NIL == valid2 || noun_compound_parser.NIL != the_root);
                                }
                            }
                        }
                        csome_list_var2 = csome_list_var2.rest();
                        wu2 = csome_list_var2.first();
                    }
                }
            }
            else if (noun_compound_parser.NIL != string_utilities.ends_with(string, (SubLObject)noun_compound_parser.$str276$ment, (SubLObject)noun_compound_parser.UNPROVIDED)) {
                if (noun_compound_parser.NIL == the_root) {
                    SubLObject csome_list_var2 = lexicon_accessors.words_of_stringXpred(string, noun_compound_parser.$const277$nounStrings, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED);
                    SubLObject wu2 = (SubLObject)noun_compound_parser.NIL;
                    wu2 = csome_list_var2.first();
                    while (noun_compound_parser.NIL == the_root && noun_compound_parser.NIL != csome_list_var2) {
                        SubLObject inf2 = (SubLObject)noun_compound_parser.NIL;
                        final SubLObject pred_var2 = noun_compound_parser.$const272$infinitive;
                        if (noun_compound_parser.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(wu2, (SubLObject)noun_compound_parser.ONE_INTEGER, pred_var2)) {
                            final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(wu2, (SubLObject)noun_compound_parser.ONE_INTEGER, pred_var2);
                            SubLObject done_var2 = the_root;
                            final SubLObject token_var2 = (SubLObject)noun_compound_parser.NIL;
                            while (noun_compound_parser.NIL == done_var2) {
                                final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                                if (noun_compound_parser.NIL != valid2) {
                                    SubLObject final_index_iterator2 = (SubLObject)noun_compound_parser.NIL;
                                    try {
                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)noun_compound_parser.$kw138$GAF, (SubLObject)noun_compound_parser.NIL, (SubLObject)noun_compound_parser.NIL);
                                        SubLObject done_var_$58 = the_root;
                                        final SubLObject token_var_$59 = (SubLObject)noun_compound_parser.NIL;
                                        while (noun_compound_parser.NIL == done_var_$58) {
                                            final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$59);
                                            final SubLObject valid_$60 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$59.eql(assertion2));
                                            if (noun_compound_parser.NIL != valid_$60) {
                                                inf2 = (the_root = assertions_high.gaf_arg(assertion2, (SubLObject)noun_compound_parser.TWO_INTEGER));
                                            }
                                            done_var_$58 = (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_parser.NIL == valid_$60 || noun_compound_parser.NIL != the_root);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$57 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)noun_compound_parser.T, thread);
                                            final SubLObject _values3 = Values.getValuesAsVector();
                                            if (noun_compound_parser.NIL != final_index_iterator2) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                            }
                                            Values.restoreValuesFromVector(_values3);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$57, thread);
                                        }
                                    }
                                }
                                done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_parser.NIL == valid2 || noun_compound_parser.NIL != the_root);
                            }
                        }
                        csome_list_var2 = csome_list_var2.rest();
                        wu2 = csome_list_var2.first();
                    }
                }
            }
            else {
                has_deverbal_endingP = (SubLObject)noun_compound_parser.NIL;
            }
            if ((noun_compound_parser.NIL != use_mass_fallback_if_neededP || noun_compound_parser.NIL != has_deverbal_endingP) && noun_compound_parser.NIL == the_root && noun_compound_parser.NIL == the_root) {
                SubLObject csome_list_var2 = lexicon_accessors.words_of_stringXpred(string, noun_compound_parser.$const278$massNumber, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED);
                SubLObject wu2 = (SubLObject)noun_compound_parser.NIL;
                wu2 = csome_list_var2.first();
                while (noun_compound_parser.NIL == the_root && noun_compound_parser.NIL != csome_list_var2) {
                    SubLObject inf2 = (SubLObject)noun_compound_parser.NIL;
                    final SubLObject pred_var2 = noun_compound_parser.$const272$infinitive;
                    if (noun_compound_parser.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(wu2, (SubLObject)noun_compound_parser.ONE_INTEGER, pred_var2)) {
                        final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(wu2, (SubLObject)noun_compound_parser.ONE_INTEGER, pred_var2);
                        SubLObject done_var2 = the_root;
                        final SubLObject token_var2 = (SubLObject)noun_compound_parser.NIL;
                        while (noun_compound_parser.NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                            if (noun_compound_parser.NIL != valid2) {
                                SubLObject final_index_iterator2 = (SubLObject)noun_compound_parser.NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)noun_compound_parser.$kw138$GAF, (SubLObject)noun_compound_parser.NIL, (SubLObject)noun_compound_parser.NIL);
                                    SubLObject done_var_$59 = the_root;
                                    final SubLObject token_var_$60 = (SubLObject)noun_compound_parser.NIL;
                                    while (noun_compound_parser.NIL == done_var_$59) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$60);
                                        final SubLObject valid_$61 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$60.eql(assertion2));
                                        if (noun_compound_parser.NIL != valid_$61) {
                                            inf2 = (the_root = assertions_high.gaf_arg(assertion2, (SubLObject)noun_compound_parser.TWO_INTEGER));
                                        }
                                        done_var_$59 = (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_parser.NIL == valid_$61 || noun_compound_parser.NIL != the_root);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$58 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)noun_compound_parser.T, thread);
                                        final SubLObject _values4 = Values.getValuesAsVector();
                                        if (noun_compound_parser.NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        Values.restoreValuesFromVector(_values4);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$58, thread);
                                    }
                                }
                            }
                            done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_parser.NIL == valid2 || noun_compound_parser.NIL != the_root);
                        }
                    }
                    csome_list_var2 = csome_list_var2.rest();
                    wu2 = csome_list_var2.first();
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return the_root;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 93467L)
    public static SubLObject rbp_deverbal_candidateP(final SubLObject string) {
        assert noun_compound_parser.NIL != Types.stringp(string) : string;
        final SubLObject exploded = string_utilities.split_string(string, (SubLObject)noun_compound_parser.UNPROVIDED);
        SubLObject okP = (SubLObject)noun_compound_parser.NIL;
        if (noun_compound_parser.NIL == list_utilities.lengthE(exploded, (SubLObject)noun_compound_parser.TWO_INTEGER, (SubLObject)noun_compound_parser.UNPROVIDED)) {
            return (SubLObject)noun_compound_parser.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = exploded;
        SubLObject mod = (SubLObject)noun_compound_parser.NIL;
        SubLObject head = (SubLObject)noun_compound_parser.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)noun_compound_parser.$list280);
        mod = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)noun_compound_parser.$list280);
        head = current.first();
        current = current.rest();
        if (noun_compound_parser.NIL == current) {
            if (noun_compound_parser.NIL != list_utilities.lengthE(mod, (SubLObject)noun_compound_parser.ONE_INTEGER, (SubLObject)noun_compound_parser.UNPROVIDED) || noun_compound_parser.NIL != list_utilities.lengthE(head, (SubLObject)noun_compound_parser.ONE_INTEGER, (SubLObject)noun_compound_parser.UNPROVIDED)) {
                okP = (SubLObject)noun_compound_parser.NIL;
            }
            else {
                okP = list_utilities.sublisp_boolean(rbp_get_deverbal_root(head, (SubLObject)noun_compound_parser.UNPROVIDED));
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)noun_compound_parser.$list280);
        }
        return okP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 94030L)
    public static SubLObject parse_deverbal_compound_as_fallback(final SubLObject string, SubLObject limit) {
        if (limit == noun_compound_parser.UNPROVIDED) {
            limit = (SubLObject)noun_compound_parser.NIL;
        }
        return (SubLObject)noun_compound_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 94769L)
    public static SubLObject parse_deverbal_compound_with_fallback(final SubLObject string, SubLObject complete_onlyP, SubLObject limit) {
        if (complete_onlyP == noun_compound_parser.UNPROVIDED) {
            complete_onlyP = (SubLObject)noun_compound_parser.T;
        }
        if (limit == noun_compound_parser.UNPROVIDED) {
            limit = (SubLObject)noun_compound_parser.$int111$1000;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject good = parse_noun_compound(string, complete_onlyP, limit);
        final SubLObject bad = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (noun_compound_parser.NIL != good) {
            return Values.values(good, bad);
        }
        return parse_deverbal_compound_as_fallback(string, (SubLObject)noun_compound_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 95061L)
    public static SubLObject date_parse_block_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)noun_compound_parser.ZERO_INTEGER);
        return (SubLObject)noun_compound_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 95061L)
    public static SubLObject date_parse_block_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $date_parse_block_native.class) ? noun_compound_parser.T : noun_compound_parser.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 95061L)
    public static SubLObject date_parse_block_subcol_naut(final SubLObject v_object) {
        assert noun_compound_parser.NIL != date_parse_block_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 95061L)
    public static SubLObject date_parse_block_confidence(final SubLObject v_object) {
        assert noun_compound_parser.NIL != date_parse_block_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 95061L)
    public static SubLObject _csetf_date_parse_block_subcol_naut(final SubLObject v_object, final SubLObject value) {
        assert noun_compound_parser.NIL != date_parse_block_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 95061L)
    public static SubLObject _csetf_date_parse_block_confidence(final SubLObject v_object, final SubLObject value) {
        assert noun_compound_parser.NIL != date_parse_block_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 95061L)
    public static SubLObject make_date_parse_block(SubLObject arglist) {
        if (arglist == noun_compound_parser.UNPROVIDED) {
            arglist = (SubLObject)noun_compound_parser.NIL;
        }
        final SubLObject v_new = (SubLObject)new $date_parse_block_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)noun_compound_parser.NIL, next = arglist; noun_compound_parser.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)noun_compound_parser.$kw297$SUBCOL_NAUT)) {
                _csetf_date_parse_block_subcol_naut(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)noun_compound_parser.$kw71$CONFIDENCE)) {
                _csetf_date_parse_block_confidence(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)noun_compound_parser.$str25$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 95061L)
    public static SubLObject visit_defstruct_date_parse_block(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)noun_compound_parser.$kw26$BEGIN, (SubLObject)noun_compound_parser.$sym298$MAKE_DATE_PARSE_BLOCK, (SubLObject)noun_compound_parser.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)noun_compound_parser.$kw28$SLOT, (SubLObject)noun_compound_parser.$kw297$SUBCOL_NAUT, date_parse_block_subcol_naut(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)noun_compound_parser.$kw28$SLOT, (SubLObject)noun_compound_parser.$kw71$CONFIDENCE, date_parse_block_confidence(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)noun_compound_parser.$kw29$END, (SubLObject)noun_compound_parser.$sym298$MAKE_DATE_PARSE_BLOCK, (SubLObject)noun_compound_parser.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 95061L)
    public static SubLObject visit_defstruct_object_date_parse_block_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_date_parse_block(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 95061L)
    public static SubLObject new_date_parse_block(final SubLObject naut, final SubLObject confidence) {
        if (noun_compound_parser.NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(naut) && noun_compound_parser.NIL != rbp_wff.npp_genl_predP(parsing_utilities.subcollection_function_naut_pred(naut), noun_compound_parser.$const300$dateOfEvent)) {
            final SubLObject block = make_date_parse_block((SubLObject)noun_compound_parser.UNPROVIDED);
            _csetf_date_parse_block_subcol_naut(block, naut);
            _csetf_date_parse_block_confidence(block, confidence);
            return block;
        }
        return (SubLObject)noun_compound_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 95061L)
    public static SubLObject new_date_parse_block_for_denot_and_date(final SubLObject denot, final SubLObject date, final SubLObject base_confidence, SubLObject raw_confidenceP) {
        if (raw_confidenceP == noun_compound_parser.UNPROVIDED) {
            raw_confidenceP = (SubLObject)noun_compound_parser.NIL;
        }
        return new_date_parse_block((SubLObject)ConsesLow.list(noun_compound_parser.$const301$SubcollectionOfWithRelationToFn, denot, noun_compound_parser.$const300$dateOfEvent, date), (noun_compound_parser.NIL != raw_confidenceP) ? base_confidence : date_confidence_adjusted_for_year(base_confidence, date));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 95061L)
    public static SubLObject date_parse_complexity_G(final SubLObject parse1, final SubLObject parse2) {
        return Numbers.numG(Sequences.length(list_utilities.tree_positions(noun_compound_parser.$const302$YearFn, parsing_utilities.subcollection_function_naut_to_arg(parse1), (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED).first()), Sequences.length(list_utilities.tree_positions(noun_compound_parser.$const302$YearFn, parsing_utilities.subcollection_function_naut_to_arg(parse2), (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED).first()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 95061L)
    public static SubLObject date_confidence_adjusted_for_year(final SubLObject base, final SubLObject parse_date) {
        return Numbers.multiply(base, Numbers.divide(date_utilities.extract_date_year(parse_date), date_utilities.extract_date_year(date_utilities.universal_time_to_cycl_date(Time.get_universal_time()))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 95061L)
    public static SubLObject date_parse_list_incorporate_frequency(final SubLObject blocks, final SubLObject parse_counts) {
        final SubLObject avg = number_utilities.average(dictionary.dictionary_values(parse_counts), (SubLObject)noun_compound_parser.UNPROVIDED);
        SubLObject cdolist_list_var = blocks;
        SubLObject block = (SubLObject)noun_compound_parser.NIL;
        block = cdolist_list_var.first();
        while (noun_compound_parser.NIL != cdolist_list_var) {
            _csetf_date_parse_block_confidence(block, Numbers.multiply(date_parse_block_confidence(block), Numbers.divide(dictionary.dictionary_lookup(parse_counts, parsing_utilities.subcollection_function_naut_to_arg(date_parse_block_subcol_naut(block)), (SubLObject)noun_compound_parser.UNPROVIDED), avg)));
            cdolist_list_var = cdolist_list_var.rest();
            block = cdolist_list_var.first();
        }
        return blocks;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 95061L)
    public static SubLObject parse_string_as_date_fallback(final SubLObject string, SubLObject one_answerP, SubLObject incorporate_frequencyP) {
        if (one_answerP == noun_compound_parser.UNPROVIDED) {
            one_answerP = (SubLObject)noun_compound_parser.T;
        }
        if (incorporate_frequencyP == noun_compound_parser.UNPROVIDED) {
            incorporate_frequencyP = (SubLObject)noun_compound_parser.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tokens_reversed = Sequences.reverse(standard_tokenization.standard_string_tokenize(string));
        final SubLObject parse_counts = dictionary.new_dictionary((SubLObject)noun_compound_parser.EQUAL, (SubLObject)noun_compound_parser.UNPROVIDED);
        SubLObject blocks = (SubLObject)noun_compound_parser.NIL;
        SubLObject v_core = (SubLObject)noun_compound_parser.NIL;
        SubLObject answers = (SubLObject)noun_compound_parser.NIL;
        while (noun_compound_parser.NIL != tokens_reversed && noun_compound_parser.NIL == blocks) {
            v_core = (SubLObject)ConsesLow.cons(tokens_reversed.first(), v_core);
            tokens_reversed = tokens_reversed.rest();
            final SubLObject dates = date_utilities.parse_date_from_string_fast(string_utilities.bunge(Sequences.reverse(tokens_reversed), (SubLObject)noun_compound_parser.UNPROVIDED), one_answerP, (SubLObject)noun_compound_parser.NIL, (SubLObject)noun_compound_parser.T);
            if (noun_compound_parser.NIL != dates) {
                final SubLObject denots = parse_as_denot_or_noun_compound(string_utilities.bunge(v_core, (SubLObject)noun_compound_parser.UNPROVIDED), (SubLObject)noun_compound_parser.UNPROVIDED);
                if (noun_compound_parser.NIL == denots) {
                    continue;
                }
                SubLObject cdolist_list_var = dates;
                SubLObject date = (SubLObject)noun_compound_parser.NIL;
                date = cdolist_list_var.first();
                while (noun_compound_parser.NIL != cdolist_list_var) {
                    final SubLObject the_vars = list_utilities.tree_find_all_if((SubLObject)noun_compound_parser.$sym303$EL_VARIABLE_P, date, (SubLObject)noun_compound_parser.UNPROVIDED);
                    SubLObject cdolist_list_var_$72 = denots;
                    SubLObject denot = (SubLObject)noun_compound_parser.NIL;
                    denot = cdolist_list_var_$72.first();
                    while (noun_compound_parser.NIL != cdolist_list_var_$72) {
                        if (noun_compound_parser.NIL != genls.genlP(denot, noun_compound_parser.$const304$Event, parsing_vars.$parsing_domain_mt$.getDynamicValue(thread), (SubLObject)noun_compound_parser.UNPROVIDED)) {
                            if (noun_compound_parser.NIL == the_vars) {
                                dictionary_utilities.dictionary_increment(parse_counts, date, (SubLObject)noun_compound_parser.UNPROVIDED);
                                final SubLObject item_var = new_date_parse_block_for_denot_and_date(denot, date, noun_compound_parser.$rbp_high_date_confidence$.getDynamicValue(thread), (SubLObject)noun_compound_parser.UNPROVIDED);
                                if (noun_compound_parser.NIL == conses_high.member(item_var, blocks, Symbols.symbol_function((SubLObject)noun_compound_parser.EQUALP), Symbols.symbol_function((SubLObject)noun_compound_parser.IDENTITY))) {
                                    blocks = (SubLObject)ConsesLow.cons(item_var, blocks);
                                }
                            }
                            else if (noun_compound_parser.NIL != list_utilities.singletonP(the_vars)) {
                                SubLObject cdolist_list_var_$73 = ask_utilities.ask_template((SubLObject)ConsesLow.list((SubLObject)noun_compound_parser.$sym306$_EVENT, the_vars.first()), (SubLObject)ConsesLow.list(noun_compound_parser.$const307$and, (SubLObject)ConsesLow.list(noun_compound_parser.$const308$isa, (SubLObject)noun_compound_parser.$sym306$_EVENT, denot), (SubLObject)ConsesLow.list(noun_compound_parser.$const300$dateOfEvent, (SubLObject)noun_compound_parser.$sym306$_EVENT, date)), parsing_vars.$parsing_domain_mt$.getDynamicValue(thread), (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED);
                                SubLObject v_answer = (SubLObject)noun_compound_parser.NIL;
                                v_answer = cdolist_list_var_$73.first();
                                while (noun_compound_parser.NIL != cdolist_list_var_$73) {
                                    SubLObject current;
                                    final SubLObject datum = current = v_answer;
                                    SubLObject event = (SubLObject)noun_compound_parser.NIL;
                                    SubLObject date_var = (SubLObject)noun_compound_parser.NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)noun_compound_parser.$list305);
                                    event = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)noun_compound_parser.$list305);
                                    date_var = current.first();
                                    current = current.rest();
                                    if (noun_compound_parser.NIL == current) {
                                        final SubLObject date_nart = list_utilities.tree_substitute(date, the_vars.first(), date_var);
                                        dictionary_utilities.dictionary_increment(parse_counts, date_nart, (SubLObject)noun_compound_parser.UNPROVIDED);
                                        final SubLObject item_var2 = new_date_parse_block_for_denot_and_date(denot, date_nart, (noun_compound_parser.NIL != constant_handles.constant_p(event)) ? noun_compound_parser.$rbp_high_date_confidence$.getDynamicValue(thread) : noun_compound_parser.$rbp_low_date_confidence$.getDynamicValue(thread), (SubLObject)noun_compound_parser.UNPROVIDED);
                                        if (noun_compound_parser.NIL == conses_high.member(item_var2, blocks, Symbols.symbol_function((SubLObject)noun_compound_parser.EQUALP), Symbols.symbol_function((SubLObject)noun_compound_parser.IDENTITY))) {
                                            blocks = (SubLObject)ConsesLow.cons(item_var2, blocks);
                                        }
                                    }
                                    else {
                                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)noun_compound_parser.$list305);
                                    }
                                    cdolist_list_var_$73 = cdolist_list_var_$73.rest();
                                    v_answer = cdolist_list_var_$73.first();
                                }
                            }
                            else {
                                Errors.warn((SubLObject)noun_compound_parser.$str309$_____todo_handle_dates_with_multi);
                            }
                        }
                        cdolist_list_var_$72 = cdolist_list_var_$72.rest();
                        denot = cdolist_list_var_$72.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    date = cdolist_list_var.first();
                }
            }
        }
        if (noun_compound_parser.NIL != incorporate_frequencyP) {
            date_parse_list_incorporate_frequency(blocks, parse_counts);
        }
        SubLObject cdolist_list_var2;
        final SubLObject sorted = cdolist_list_var2 = Sort.sort(Sort.sort(blocks, (SubLObject)noun_compound_parser.$sym124$_, (SubLObject)noun_compound_parser.$sym295$DATE_PARSE_BLOCK_CONFIDENCE), (SubLObject)noun_compound_parser.$sym310$DATE_PARSE_COMPLEXITY__, (SubLObject)noun_compound_parser.$sym293$DATE_PARSE_BLOCK_SUBCOL_NAUT);
        SubLObject parse = (SubLObject)noun_compound_parser.NIL;
        parse = cdolist_list_var2.first();
        while (noun_compound_parser.NIL != cdolist_list_var2) {
            if (noun_compound_parser.NIL != noun_compound_parser.$rbp_return_confidenceP$.getDynamicValue(thread)) {
                final SubLObject item_var3 = (SubLObject)ConsesLow.list(date_parse_block_subcol_naut(parse), noun_compound_parser.$rbp_date_fallback_identifier$.getDynamicValue(thread), date_parse_block_confidence(parse));
                if (noun_compound_parser.NIL == conses_high.member(item_var3, answers, (SubLObject)noun_compound_parser.EQUALP, Symbols.symbol_function((SubLObject)noun_compound_parser.IDENTITY))) {
                    answers = (SubLObject)ConsesLow.cons(item_var3, answers);
                }
            }
            else {
                final SubLObject item_var3 = (SubLObject)ConsesLow.list(date_parse_block_subcol_naut(parse), noun_compound_parser.$rbp_date_fallback_identifier$.getDynamicValue(thread));
                if (noun_compound_parser.NIL == conses_high.member(item_var3, answers, (SubLObject)noun_compound_parser.EQUALP, Symbols.symbol_function((SubLObject)noun_compound_parser.IDENTITY))) {
                    answers = (SubLObject)ConsesLow.cons(item_var3, answers);
                }
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            parse = cdolist_list_var2.first();
        }
        return Sequences.reverse(answers);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 95061L)
    public static SubLObject parse_noun_compound_with_date_fallback(final SubLObject string, SubLObject complete_onlyP, SubLObject limit) {
        if (complete_onlyP == noun_compound_parser.UNPROVIDED) {
            complete_onlyP = (SubLObject)noun_compound_parser.T;
        }
        if (limit == noun_compound_parser.UNPROVIDED) {
            limit = (SubLObject)noun_compound_parser.$int111$1000;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject good = parse_noun_compound(string, complete_onlyP, limit);
        final SubLObject bad = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (noun_compound_parser.NIL != good) {
            return Values.values(good, bad);
        }
        return parse_string_as_date_fallback(string, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 103576L)
    public static SubLObject rbp_parse_filter_nonagentive_actors(final SubLObject parse_naut) {
        SubLObject problem = (SubLObject)noun_compound_parser.NIL;
        if (noun_compound_parser.NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(parse_naut) && noun_compound_parser.NIL != rbp_wff.npp_genl_predP(parsing_utilities.subcollection_function_naut_pred(parse_naut), noun_compound_parser.$const311$doneBy) && noun_compound_parser.NIL != rbp_wff.npp_not_disjointP(parsing_utilities.subcollection_function_naut_from_arg(parse_naut), noun_compound_parser.$const312$Action, rbp_domain_mt())) {
            SubLObject bogusP = (SubLObject)noun_compound_parser.NIL;
            final SubLObject func = cycl_utilities.formula_arg0(parse_naut);
            if (noun_compound_parser.NIL != isa.isa_in_any_mtP(func, noun_compound_parser.$const191$SubcollectionRelationFunction_Ins)) {
                if (noun_compound_parser.NIL == rbp_wff.npp_isaP(parsing_utilities.subcollection_function_naut_to_arg(parse_naut), noun_compound_parser.$const313$Agent_Generic, rbp_domain_mt())) {
                    bogusP = (SubLObject)noun_compound_parser.T;
                }
            }
            else if (noun_compound_parser.NIL != isa.isa_in_any_mtP(func, noun_compound_parser.$const133$SubcollectionRelationFunction_Typ) && noun_compound_parser.NIL == rbp_wff.npp_genlP(parsing_utilities.subcollection_function_naut_to_arg(parse_naut), noun_compound_parser.$const313$Agent_Generic, rbp_domain_mt())) {
                bogusP = (SubLObject)noun_compound_parser.T;
            }
            if (noun_compound_parser.NIL != bogusP) {
                problem = (SubLObject)noun_compound_parser.$str314$rbp_parse_filter_nonagentive_acto;
            }
        }
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 105314L)
    public static SubLObject rbp_matches_any_all_exists_gafsP(final SubLObject target_pred, SubLObject from_arg, SubLObject to_arg, final SubLObject type_level_fromP, final SubLObject type_level_toP, final SubLObject head) {
        while (noun_compound_parser.NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(from_arg)) {
            from_arg = cycl_utilities.nat_arg1(from_arg, (SubLObject)noun_compound_parser.UNPROVIDED);
        }
        while (noun_compound_parser.NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(to_arg)) {
            to_arg = cycl_utilities.nat_arg1(to_arg, (SubLObject)noun_compound_parser.UNPROVIDED);
        }
        final SubLObject non_head = (SubLObject)((head == noun_compound_parser.$kw315$FROM) ? noun_compound_parser.$kw316$TO : noun_compound_parser.$kw315$FROM);
        return (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_parser.NIL != rbp_all_exists_matches(target_pred, from_arg, to_arg, type_level_fromP, type_level_toP, head, (SubLObject)noun_compound_parser.UNPROVIDED) || noun_compound_parser.NIL != rbp_all_exists_matches(target_pred, from_arg, to_arg, type_level_fromP, type_level_toP, non_head, (SubLObject)noun_compound_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 105937L)
    public static SubLObject rbp_all_exists_matches_internal(final SubLObject target_pred, final SubLObject from_arg, final SubLObject to_arg, final SubLObject type_level_fromP, final SubLObject type_level_toP, final SubLObject focus, SubLObject reversedP) {
        if (reversedP == noun_compound_parser.UNPROVIDED) {
            reversedP = (SubLObject)noun_compound_parser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_sentence = rbp_matches_any_all_exists_gafs_query_sentence(target_pred, from_arg, to_arg, type_level_fromP, type_level_toP, focus);
        final SubLObject mt = noun_compound_parser.$const318$InferencePSC;
        final SubLObject max_time = noun_compound_parser.$rbp_rae_max_time$.getDynamicValue(thread);
        final SubLObject query_properties = (SubLObject)ConsesLow.list((SubLObject)noun_compound_parser.$kw319$MAX_NUMBER, (SubLObject)noun_compound_parser.ONE_INTEGER, (SubLObject)noun_compound_parser.$kw320$MAX_TIME, max_time, (SubLObject)noun_compound_parser.$kw192$PROBLEM_STORE, noun_compound_parser.$ncp_problem_store$.getDynamicValue(thread), (SubLObject)noun_compound_parser.$kw321$RETURN, (SubLObject)ConsesLow.list((SubLObject)noun_compound_parser.$kw322$TEMPLATE, (SubLObject)noun_compound_parser.$sym323$_TYPE));
        thread.resetMultipleValues();
        SubLObject types = inference_kernel.new_cyc_query(query_sentence, mt, query_properties);
        final SubLObject exit_status = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (noun_compound_parser.$kw320$MAX_TIME == exit_status) {
            Errors.warn((SubLObject)noun_compound_parser.$str324$Timed_out_checking___relationAllE, new SubLObject[] { max_time, target_pred, from_arg, to_arg });
        }
        if (noun_compound_parser.NIL == types && noun_compound_parser.NIL == reversedP && noun_compound_parser.NIL != isa.isaP(target_pred, noun_compound_parser.$const325$SymmetricBinaryPredicate, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED)) {
            types = rbp_all_exists_matches(target_pred, to_arg, from_arg, type_level_toP, type_level_fromP, (SubLObject)((focus == noun_compound_parser.$kw315$FROM) ? noun_compound_parser.$kw316$TO : noun_compound_parser.$kw315$FROM), (SubLObject)noun_compound_parser.T);
        }
        return types;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 105937L)
    public static SubLObject rbp_all_exists_matches(final SubLObject target_pred, final SubLObject from_arg, final SubLObject to_arg, final SubLObject type_level_fromP, final SubLObject type_level_toP, final SubLObject focus, SubLObject reversedP) {
        if (reversedP == noun_compound_parser.UNPROVIDED) {
            reversedP = (SubLObject)noun_compound_parser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)noun_compound_parser.NIL;
        if (noun_compound_parser.NIL == v_memoization_state) {
            return rbp_all_exists_matches_internal(target_pred, from_arg, to_arg, type_level_fromP, type_level_toP, focus, reversedP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)noun_compound_parser.$sym317$RBP_ALL_EXISTS_MATCHES, (SubLObject)noun_compound_parser.UNPROVIDED);
        if (noun_compound_parser.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)noun_compound_parser.$sym317$RBP_ALL_EXISTS_MATCHES, (SubLObject)noun_compound_parser.SEVEN_INTEGER, (SubLObject)noun_compound_parser.NIL, (SubLObject)noun_compound_parser.EQL, (SubLObject)noun_compound_parser.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)noun_compound_parser.$sym317$RBP_ALL_EXISTS_MATCHES, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_7(target_pred, from_arg, to_arg, type_level_fromP, type_level_toP, focus, reversedP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)noun_compound_parser.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)noun_compound_parser.NIL;
            collision = cdolist_list_var.first();
            while (noun_compound_parser.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (target_pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (from_arg.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (to_arg.eql(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (type_level_fromP.eql(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (type_level_toP.eql(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (focus.eql(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (noun_compound_parser.NIL != cached_args && noun_compound_parser.NIL == cached_args.rest() && reversedP.eql(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rbp_all_exists_matches_internal(target_pred, from_arg, to_arg, type_level_fromP, type_level_toP, focus, reversedP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(target_pred, from_arg, to_arg, type_level_fromP, type_level_toP, focus, reversedP));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 107116L)
    public static SubLObject rbp_matches_any_all_exists_gafs_query_sentence(final SubLObject target_pred, final SubLObject from_arg, final SubLObject to_arg, final SubLObject type_level_fromP, final SubLObject type_level_toP, final SubLObject focus) {
        final SubLObject strong_checkingP = (SubLObject)noun_compound_parser.NIL;
        final SubLObject type_pred = (noun_compound_parser.NIL != strong_checkingP) ? noun_compound_parser.$const326$equals : noun_compound_parser.$const327$genls;
        if (focus.eql((SubLObject)noun_compound_parser.$kw316$TO)) {
            SubLObject disjuncts = (SubLObject)noun_compound_parser.NIL;
            if (noun_compound_parser.NIL == type_level_toP) {
                final SubLObject junct1 = (SubLObject)((noun_compound_parser.NIL != type_level_fromP) ? ConsesLow.listS(noun_compound_parser.$const328$relationAllInstance, target_pred, from_arg, (SubLObject)noun_compound_parser.$list329) : ConsesLow.listS(target_pred, from_arg, (SubLObject)noun_compound_parser.$list329));
                final SubLObject junct2 = (SubLObject)ConsesLow.listS(noun_compound_parser.$const326$equals, to_arg, (SubLObject)noun_compound_parser.$list329);
                disjuncts = (SubLObject)ConsesLow.cons(simplifier.conjoin((SubLObject)ConsesLow.list(junct1, junct2), (SubLObject)noun_compound_parser.UNPROVIDED), disjuncts);
            }
            final SubLObject rmp = (noun_compound_parser.NIL != type_level_fromP) ? noun_compound_parser.$const137$relationAllExists : noun_compound_parser.$const330$relationInstanceExists;
            final SubLObject junct3 = (SubLObject)ConsesLow.listS(rmp, target_pred, from_arg, (SubLObject)noun_compound_parser.$list329);
            final SubLObject junct4 = (SubLObject)ConsesLow.listS((noun_compound_parser.NIL != type_level_toP) ? type_pred : noun_compound_parser.$const308$isa, to_arg, (SubLObject)noun_compound_parser.$list329);
            disjuncts = (SubLObject)ConsesLow.cons(simplifier.conjoin((SubLObject)ConsesLow.list(junct3, junct4), (SubLObject)noun_compound_parser.UNPROVIDED), disjuncts);
            return simplifier.disjoin(disjuncts, (SubLObject)noun_compound_parser.UNPROVIDED);
        }
        return (SubLObject)ConsesLow.list(noun_compound_parser.$const307$and, (SubLObject)ConsesLow.list((noun_compound_parser.NIL != type_level_toP) ? noun_compound_parser.$const331$relationExistsAll : noun_compound_parser.$const332$relationExistsInstance, target_pred, (SubLObject)noun_compound_parser.$sym323$_TYPE, to_arg), (SubLObject)ConsesLow.listS((noun_compound_parser.NIL != type_level_fromP) ? type_pred : noun_compound_parser.$const308$isa, from_arg, (SubLObject)noun_compound_parser.$list329));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 108358L)
    public static SubLObject rbp_parse_prefer_rmp_matches(final SubLObject parse, SubLObject skip_cognateP) {
        if (skip_cognateP == noun_compound_parser.UNPROVIDED) {
            skip_cognateP = (SubLObject)noun_compound_parser.NIL;
        }
        final SubLObject parse_naut = nc_block_denot(parse);
        final SubLObject problem = rbp_parse_prefer_rmp_matches_int(parse_naut, skip_cognateP);
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 108574L)
    public static SubLObject rbp_parse_prefer_rmp_matches_int(final SubLObject parse_naut, SubLObject skip_cognateP) {
        if (skip_cognateP == noun_compound_parser.UNPROVIDED) {
            skip_cognateP = (SubLObject)noun_compound_parser.NIL;
        }
        SubLObject problem = (SubLObject)noun_compound_parser.NIL;
        if (noun_compound_parser.NIL != parse_naut && noun_compound_parser.NIL == constant_handles.constant_p(parse_naut)) {
            if (noun_compound_parser.NIL == el_utilities.el_formula_with_operator_p(parse_naut, noun_compound_parser.$const142$CityNamedFn)) {
                if (noun_compound_parser.NIL == kb_indexing_datastructures.indexed_term_p(parse_naut)) {
                    if (noun_compound_parser.NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(parse_naut)) {
                        problem = rbp_parse_rmp_problem_for_subcol_naut(parse_naut, skip_cognateP);
                    }
                    else {
                        final SubLObject ternary_subcollection_naut = rbp_coerce_to_ternary_subcollection_naut(parse_naut);
                        if (noun_compound_parser.NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(ternary_subcollection_naut)) {
                            problem = rbp_parse_prefer_rmp_matches_int(ternary_subcollection_naut, (SubLObject)noun_compound_parser.UNPROVIDED);
                        }
                        else {
                            problem = (SubLObject)noun_compound_parser.$str333$rbp_parse_prefer_rmp_matches_had_;
                        }
                    }
                }
            }
        }
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 109491L)
    public static SubLObject rbp_parse_rmp_problem_for_subcol_naut(final SubLObject parse_naut, final SubLObject skip_cognateP) {
        SubLObject problem = (SubLObject)noun_compound_parser.NIL;
        final SubLObject from_arg = parsing_utilities.subcollection_function_naut_from_arg(parse_naut);
        final SubLObject subfn = cycl_utilities.nat_functor(parse_naut);
        final SubLObject head = (SubLObject)((noun_compound_parser.NIL != isa.isaP(subfn, noun_compound_parser.$const215$SubcollectionRelationFunction_Can, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED)) ? noun_compound_parser.$kw315$FROM : noun_compound_parser.$kw316$TO);
        final SubLObject type_level_fromP = parsing_utilities.subcollection_function_type_level_in_from_argP(subfn);
        final SubLObject type_level_toP = parsing_utilities.subcollection_function_type_level_in_to_argP(subfn);
        final SubLObject to_arg = parsing_utilities.subcollection_function_naut_to_arg(parse_naut);
        SubLObject okP = (SubLObject)noun_compound_parser.NIL;
        if (noun_compound_parser.NIL != from_arg && noun_compound_parser.NIL != to_arg && noun_compound_parser.NIL != rbp_matches_any_all_exists_gafsP(parsing_utilities.subcollection_function_naut_pred(parse_naut), from_arg, to_arg, type_level_fromP, type_level_toP, head)) {
            okP = (SubLObject)noun_compound_parser.T;
        }
        else if (noun_compound_parser.NIL != skip_cognateP) {
            okP = (SubLObject)noun_compound_parser.NIL;
        }
        else {
            final SubLObject cognate = rbp_semx_type_level_cognate(parse_naut);
            final SubLObject cognate_problem = (SubLObject)((noun_compound_parser.NIL != cognate) ? rbp_parse_prefer_rmp_matches_int(rbp_semx_type_level_cognate(parse_naut), (SubLObject)noun_compound_parser.T) : noun_compound_parser.NIL);
            if (noun_compound_parser.NIL != cognate_problem) {
                problem = cognate_problem;
            }
            else if (noun_compound_parser.NIL != cognate) {
                okP = (SubLObject)noun_compound_parser.T;
            }
        }
        if (noun_compound_parser.NIL == okP && noun_compound_parser.NIL == problem) {
            problem = rbp_parse_prefer_rmp_matches_failure_message(parse_naut);
        }
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 110911L)
    public static SubLObject rbp_coerce_to_ternary_subcollection_naut(final SubLObject parse_naut) {
        if (noun_compound_parser.NIL == narts_high.naut_p(parse_naut)) {
            return (SubLObject)noun_compound_parser.NIL;
        }
        final SubLObject fn = cycl_utilities.nat_functor(parse_naut);
        final SubLObject expansion = kb_mapping_utilities.fpred_value(fn, noun_compound_parser.$const334$expansion, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED);
        final SubLObject intersection_type = kb_mapping_utilities.fpred_value(fn, noun_compound_parser.$const335$intersectionType, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED);
        if (noun_compound_parser.NIL != expansion && noun_compound_parser.NIL != isa.isaP(cycl_utilities.nat_functor(expansion), noun_compound_parser.$const336$SubcollectionRelationFunction, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED)) {
            return cycl_utilities.expression_subst(cycl_utilities.nat_arg1(parse_naut, (SubLObject)noun_compound_parser.UNPROVIDED), (SubLObject)noun_compound_parser.$kw337$ARG1, cycl_utilities.expression_subst(cycl_utilities.nat_arg2(parse_naut, (SubLObject)noun_compound_parser.UNPROVIDED), (SubLObject)noun_compound_parser.$kw338$ARG2, expansion, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED), (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED);
        }
        if (noun_compound_parser.NIL != intersection_type) {
            return rbp_coerce_to_ternary_subcollection_naut(el_utilities.make_binary_formula(noun_compound_parser.$const339$CollectionIntersection2Fn, cycl_utilities.nat_arg1(parse_naut, (SubLObject)noun_compound_parser.UNPROVIDED), intersection_type));
        }
        final SubLObject pcase_var = fn;
        if (pcase_var.eql(noun_compound_parser.$const339$CollectionIntersection2Fn)) {
            return el_utilities.make_ternary_formula(noun_compound_parser.$const301$SubcollectionOfWithRelationToFn, cycl_utilities.nat_arg1(parse_naut, (SubLObject)noun_compound_parser.UNPROVIDED), noun_compound_parser.$const308$isa, cycl_utilities.nat_arg2(parse_naut, (SubLObject)noun_compound_parser.UNPROVIDED));
        }
        return (SubLObject)noun_compound_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 111758L)
    public static SubLObject rbp_parse_prefer_rmp_matches_failure_message(final SubLObject parse_naut) {
        return PrintLow.format((SubLObject)noun_compound_parser.NIL, (SubLObject)noun_compound_parser.$str340$doesn_t_match___relationAllExists, cycl_utilities.hl_to_el(parsing_utilities.subcollection_function_naut_from_arg(parse_naut)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 111980L)
    public static SubLObject rbp_parse_filter_unlikely_instrumentals(final SubLObject parse_or_denot) {
        final SubLObject parse_naut = (noun_compound_parser.NIL != noun_compound_block_p(parse_or_denot)) ? nc_block_denot(parse_or_denot) : parse_or_denot;
        final SubLObject problem = rbp_parse_filter_unlikely_instrumentals_int(parse_naut);
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 112630L)
    public static SubLObject rbp_parse_filter_unlikely_instrumentals_int(final SubLObject denot) {
        SubLObject problem = (SubLObject)noun_compound_parser.NIL;
        if (noun_compound_parser.NIL != denot && noun_compound_parser.NIL == constant_handles.constant_p(denot)) {
            if (noun_compound_parser.NIL == el_utilities.el_formula_with_operator_p(denot, noun_compound_parser.$const142$CityNamedFn)) {
                if (noun_compound_parser.NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(denot)) {
                    if (noun_compound_parser.NIL != rbp_wff.npp_genl_predP(parsing_utilities.subcollection_function_naut_pred(denot), noun_compound_parser.$const341$instrumentType_Generic) && noun_compound_parser.NIL == rbp_wff.npp_genlP(parsing_utilities.subcollection_function_naut_to_arg(denot), noun_compound_parser.$const342$ObjectWithUse, rbp_domain_mt())) {
                        problem = (SubLObject)noun_compound_parser.$str343$rbp_parse_filter_unlikely_instrum;
                    }
                }
                else {
                    problem = (SubLObject)noun_compound_parser.$str344$rbp_parse_filter_unlikely_instrum;
                }
            }
        }
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 113311L)
    public static SubLObject rbp_parse_filter_subcollection_args(final SubLObject parse) {
        final SubLObject parse_naut = nc_block_denot(parse);
        final SubLObject rbp_rule = nc_block_rule(parse);
        final SubLObject rule_cycl = rbp_rule_bank.rbp_rule_cycl(rbp_rule);
        final SubLObject rule_semx = rbp_rule_cycl_semx(rule_cycl, (SubLObject)noun_compound_parser.UNPROVIDED);
        SubLObject problem = (SubLObject)noun_compound_parser.NIL;
        if (noun_compound_parser.NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(parse_naut) && (noun_compound_parser.NIL != rbp_bad_subcollection_to_argP(parse_naut, rule_semx) || noun_compound_parser.NIL != rbp_bad_subcollection_from_argP(parse_naut, rule_semx))) {
            problem = (SubLObject)noun_compound_parser.$str345$rbp_parse_filter_subcollection_ar;
        }
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 114493L)
    public static SubLObject rbp_bad_subcollection_to_argP(final SubLObject parse_naut, final SubLObject rule_semx) {
        return (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_parser.NIL == parsing_utilities.ternary_parsing_subcollection_function_nautP(parsing_utilities.subcollection_function_naut_to_arg(rule_semx)) && noun_compound_parser.NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(parsing_utilities.subcollection_function_naut_to_arg(parse_naut)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 114902L)
    public static SubLObject rbp_bad_subcollection_from_argP(final SubLObject parse_naut, final SubLObject rule_semx) {
        return (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_parser.NIL == parsing_utilities.ternary_parsing_subcollection_function_nautP(parsing_utilities.subcollection_function_naut_from_arg(rule_semx)) && noun_compound_parser.NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(parsing_utilities.subcollection_function_naut_from_arg(parse_naut)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 115319L)
    public static SubLObject rbp_unlikely_subcollection_naut_block_wrt_objectP(final SubLObject key_block, final SubLObject list_of_blocks) {
        final SubLObject key_naut = nc_block_denot(key_block);
        final SubLObject list_of_nauts = Mapping.mapcar((SubLObject)noun_compound_parser.$sym54$NC_BLOCK_DENOT, list_of_blocks);
        return rbp_unlikely_subcollection_naut_wrt_objectP(key_naut, list_of_nauts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 115696L)
    public static SubLObject rbp_unlikely_subcollection_naut_wrt_objectP(final SubLObject key_denot, final SubLObject list_of_nauts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ans = rbp_unlikely_subcollection_nautP(key_denot, list_of_nauts, list_utilities.last_one(noun_compound_parser.$rbp_input_strings$.getDynamicValue(thread)), (SubLObject)noun_compound_parser.$kw346$OBJ);
        if (noun_compound_parser.NIL != ans) {
            return (SubLObject)noun_compound_parser.$str347$statistically_unlikely_object;
        }
        return (SubLObject)noun_compound_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 115958L)
    public static SubLObject clear_rbp_unlikely_subcollection_nautP() {
        final SubLObject cs = noun_compound_parser.$rbp_unlikely_subcollection_nautP_caching_state$.getGlobalValue();
        if (noun_compound_parser.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)noun_compound_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 115958L)
    public static SubLObject remove_rbp_unlikely_subcollection_nautP(final SubLObject key_naut, final SubLObject list_of_nauts, final SubLObject verb, final SubLObject relation) {
        return memoization_state.caching_state_remove_function_results_with_args(noun_compound_parser.$rbp_unlikely_subcollection_nautP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(key_naut, list_of_nauts, verb, relation), (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 115958L)
    public static SubLObject rbp_unlikely_subcollection_nautP_internal(final SubLObject key_naut, final SubLObject list_of_nauts, final SubLObject verb, final SubLObject relation) {
        return (SubLObject)noun_compound_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 115958L)
    public static SubLObject rbp_unlikely_subcollection_nautP(final SubLObject key_naut, final SubLObject list_of_nauts, final SubLObject verb, final SubLObject relation) {
        SubLObject caching_state = noun_compound_parser.$rbp_unlikely_subcollection_nautP_caching_state$.getGlobalValue();
        if (noun_compound_parser.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)noun_compound_parser.$sym348$RBP_UNLIKELY_SUBCOLLECTION_NAUT_, (SubLObject)noun_compound_parser.$sym349$_RBP_UNLIKELY_SUBCOLLECTION_NAUT__CACHING_STATE_, (SubLObject)noun_compound_parser.NIL, (SubLObject)noun_compound_parser.EQUAL, (SubLObject)noun_compound_parser.FOUR_INTEGER, (SubLObject)noun_compound_parser.$int350$64);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(key_naut, list_of_nauts, verb, relation);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)noun_compound_parser.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)noun_compound_parser.NIL;
            collision = cdolist_list_var.first();
            while (noun_compound_parser.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (key_naut.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (list_of_nauts.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (verb.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (noun_compound_parser.NIL != cached_args && noun_compound_parser.NIL == cached_args.rest() && relation.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rbp_unlikely_subcollection_nautP_internal(key_naut, list_of_nauts, verb, relation)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(key_naut, list_of_nauts, verb, relation));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 117380L)
    public static SubLObject parse_adj_initial_compound(final SubLObject string, SubLObject num) {
        if (num == noun_compound_parser.UNPROVIDED) {
            num = (SubLObject)noun_compound_parser.$int111$1000;
        }
        final SubLObject words = string_utilities.split_string(string, (SubLObject)noun_compound_parser.UNPROVIDED);
        final SubLObject mod = words.first();
        SubLObject noun_conversions = (SubLObject)noun_compound_parser.NIL;
        SubLObject all_compounds = (SubLObject)noun_compound_parser.NIL;
        SubLObject cdolist_list_var = lexicon_accessors.words_of_stringXpred(mod, noun_compound_parser.$const352$adjStrings, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED);
        SubLObject wu = (SubLObject)noun_compound_parser.NIL;
        wu = cdolist_list_var.first();
        while (noun_compound_parser.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$74 = lexicon_accessors.get_strings_of_type(wu, noun_compound_parser.$const131$Noun, (SubLObject)noun_compound_parser.$list351, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED);
            SubLObject string_$75 = (SubLObject)noun_compound_parser.NIL;
            string_$75 = cdolist_list_var_$74.first();
            while (noun_compound_parser.NIL != cdolist_list_var_$74) {
                final SubLObject item_var = string_$75;
                if (noun_compound_parser.NIL == conses_high.member(item_var, noun_conversions, Symbols.symbol_function((SubLObject)noun_compound_parser.EQUAL), Symbols.symbol_function((SubLObject)noun_compound_parser.IDENTITY))) {
                    noun_conversions = (SubLObject)ConsesLow.cons(item_var, noun_conversions);
                }
                cdolist_list_var_$74 = cdolist_list_var_$74.rest();
                string_$75 = cdolist_list_var_$74.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            wu = cdolist_list_var.first();
        }
        cdolist_list_var = noun_conversions;
        SubLObject this_conversion = (SubLObject)noun_compound_parser.NIL;
        this_conversion = cdolist_list_var.first();
        while (noun_compound_parser.NIL != cdolist_list_var) {
            final SubLObject complete_onlyP = (SubLObject)noun_compound_parser.T;
            SubLObject cdolist_list_var_$75 = parse_noun_compound(string_utilities.bunge((SubLObject)ConsesLow.cons(this_conversion, words.rest()), (SubLObject)noun_compound_parser.UNPROVIDED), complete_onlyP, num);
            SubLObject this_parse = (SubLObject)noun_compound_parser.NIL;
            this_parse = cdolist_list_var_$75.first();
            while (noun_compound_parser.NIL != cdolist_list_var_$75) {
                final SubLObject item_var2 = this_parse;
                if (noun_compound_parser.NIL == conses_high.member(item_var2, all_compounds, (SubLObject)noun_compound_parser.$sym153$NPP_PARSE_, Symbols.symbol_function((SubLObject)noun_compound_parser.IDENTITY))) {
                    all_compounds = (SubLObject)ConsesLow.cons(item_var2, all_compounds);
                }
                cdolist_list_var_$75 = cdolist_list_var_$75.rest();
                this_parse = cdolist_list_var_$75.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_conversion = cdolist_list_var.first();
        }
        return all_compounds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 118358L)
    public static SubLObject rbp_escalating_parse(final SubLObject string, SubLObject num) {
        if (num == noun_compound_parser.UNPROVIDED) {
            num = (SubLObject)noun_compound_parser.$int111$1000;
        }
        SubLObject cdolist_list_var = (SubLObject)ConsesLow.list((SubLObject)noun_compound_parser.$sym353$PARSE_AS_DENOT_OR_NOUN_COMPOUND, (SubLObject)noun_compound_parser.$sym354$PARSE_DEVERBAL_COMPOUND_AS_FALLBACK, (SubLObject)noun_compound_parser.$sym355$PARSE_STRING_AS_DATE_FALLBACK_ESCALATED, (SubLObject)noun_compound_parser.$sym356$PARSE_ADJ_INITIAL_COMPOUND);
        SubLObject func = (SubLObject)noun_compound_parser.NIL;
        func = cdolist_list_var.first();
        while (noun_compound_parser.NIL != cdolist_list_var) {
            final SubLObject the_parses = Functions.funcall(func, string, num);
            if (noun_compound_parser.NIL != list_utilities.proper_list_p(the_parses)) {
                return set.set_element_list(set_utilities.construct_set_from_list(the_parses, Symbols.symbol_function((SubLObject)noun_compound_parser.EQUALP), (SubLObject)noun_compound_parser.UNPROVIDED));
            }
            cdolist_list_var = cdolist_list_var.rest();
            func = cdolist_list_var.first();
        }
        final SubLObject singular = lexification_utilities.singularize_word(string_utilities.trim_whitespace(string), (SubLObject)noun_compound_parser.UNPROVIDED);
        if (noun_compound_parser.NIL == Strings.stringE(singular, string, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED)) {
            return rbp_escalating_parse(singular, num);
        }
        return (SubLObject)noun_compound_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 119575L)
    public static SubLObject parse_as_denot_or_noun_compound(final SubLObject string, SubLObject num) {
        if (num == noun_compound_parser.UNPROVIDED) {
            num = (SubLObject)noun_compound_parser.$int111$1000;
        }
        final SubLObject denots = lexicon_accessors.typed_denots_of_string(string, noun_compound_parser.$const357$Collection, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED);
        final SubLObject complete_onlyP = (SubLObject)noun_compound_parser.T;
        return (noun_compound_parser.NIL != denots) ? denots : parse_noun_compound(string, complete_onlyP, num);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 119819L)
    public static SubLObject parse_string_as_date_fallback_escalated(final SubLObject string, SubLObject num) {
        if (num == noun_compound_parser.UNPROVIDED) {
            num = (SubLObject)noun_compound_parser.$int111$1000;
        }
        final SubLObject one_answerP = Numbers.numGE(num, (SubLObject)noun_compound_parser.ONE_INTEGER);
        return parse_string_as_date_fallback(string, one_answerP, (SubLObject)noun_compound_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 120004L)
    public static SubLObject initialize_ncs_formats(final SubLObject mode) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        noun_compound_parser.$ncs_formats$.setDynamicValue(dictionary.new_dictionary((SubLObject)noun_compound_parser.EQL, (SubLObject)noun_compound_parser.UNPROVIDED), thread);
        if (!mode.eql((SubLObject)noun_compound_parser.$kw358$XML)) {
            if (noun_compound_parser.NIL == mode) {
                Errors.error((SubLObject)noun_compound_parser.$str359$No_mode_specified_for_initialize_);
            }
            else {
                dictionary.dictionary_enter(noun_compound_parser.$ncs_formats$.getDynamicValue(thread), (SubLObject)noun_compound_parser.$kw360$INVESTIGATING, (SubLObject)noun_compound_parser.$str361$investigating___D__A_____);
                dictionary.dictionary_enter(noun_compound_parser.$ncs_formats$.getDynamicValue(thread), (SubLObject)noun_compound_parser.$kw362$PRINT_ME, (SubLObject)noun_compound_parser.$str363$parse_of__S_yielded___);
                dictionary.dictionary_enter(noun_compound_parser.$ncs_formats$.getDynamicValue(thread), (SubLObject)noun_compound_parser.$kw364$FLAG_BAD_PILE, (SubLObject)noun_compound_parser.$str365$______and_also________);
                dictionary.dictionary_enter(noun_compound_parser.$ncs_formats$.getDynamicValue(thread), (SubLObject)noun_compound_parser.$kw366$DENOTS, (SubLObject)noun_compound_parser.$str367$____denots_are__A__);
                dictionary.dictionary_enter(noun_compound_parser.$ncs_formats$.getDynamicValue(thread), (SubLObject)noun_compound_parser.$kw368$BREAK, (SubLObject)noun_compound_parser.$str369$________________________________);
                dictionary.dictionary_enter(noun_compound_parser.$ncs_formats$.getDynamicValue(thread), (SubLObject)noun_compound_parser.$kw370$COUNT_WITH_PARSES, (SubLObject)noun_compound_parser.$str371$__Total_compounds_with_any_parses);
                dictionary.dictionary_enter(noun_compound_parser.$ncs_formats$.getDynamicValue(thread), (SubLObject)noun_compound_parser.$kw372$ACTUAL_PARSES, (SubLObject)noun_compound_parser.$str373$Total_parses_found___A__);
                dictionary.dictionary_enter(noun_compound_parser.$ncs_formats$.getDynamicValue(thread), (SubLObject)noun_compound_parser.$kw374$PERCENT_APPROVED, (SubLObject)noun_compound_parser.$str375$Percent_of_parses_approved___5_2F);
                dictionary.dictionary_enter(noun_compound_parser.$ncs_formats$.getDynamicValue(thread), (SubLObject)noun_compound_parser.$kw376$TOTAL_VIOLATIONS, (SubLObject)noun_compound_parser.$str377$Total_violations___A__);
                dictionary.dictionary_enter(noun_compound_parser.$ncs_formats$.getDynamicValue(thread), (SubLObject)noun_compound_parser.$kw378$TO_CONSTANTS, (SubLObject)noun_compound_parser.$str379$Note___A_parses_reformulated_to_c);
                dictionary.dictionary_enter(noun_compound_parser.$ncs_formats$.getDynamicValue(thread), (SubLObject)noun_compound_parser.$kw380$DENOTS_WANTED, (SubLObject)noun_compound_parser.$str381$Compounds_wanting_denots___A_____);
                dictionary.dictionary_enter(noun_compound_parser.$ncs_formats$.getDynamicValue(thread), (SubLObject)noun_compound_parser.$kw382$RULES_AND_PARSE, (SubLObject)noun_compound_parser.$str383$from__S___A__);
                dictionary.dictionary_enter(noun_compound_parser.$ncs_formats$.getDynamicValue(thread), (SubLObject)noun_compound_parser.$kw384$FALLBACK_AND_PARSE, (SubLObject)noun_compound_parser.$str385$_A_A__);
                dictionary.dictionary_enter(noun_compound_parser.$ncs_formats$.getDynamicValue(thread), (SubLObject)noun_compound_parser.$kw386$LABEL, (SubLObject)noun_compound_parser.$str387$_A__);
                dictionary.dictionary_enter(noun_compound_parser.$ncs_formats$.getDynamicValue(thread), (SubLObject)noun_compound_parser.$kw388$RULE_USES, (SubLObject)noun_compound_parser.$str389$Uses_of__A___A_total___A_good___A);
            }
        }
        return noun_compound_parser.$ncs_formats$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 120004L)
    public static SubLObject ncs_format(final SubLObject key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary.dictionary_lookup(noun_compound_parser.$ncs_formats$.getDynamicValue(thread), key, (SubLObject)noun_compound_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 120004L)
    public static SubLObject ncs_note(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject stream = (SubLObject)noun_compound_parser.NIL;
        SubLObject cat = (SubLObject)noun_compound_parser.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)noun_compound_parser.$list390);
        stream = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)noun_compound_parser.$list390);
        cat = current.first();
        final SubLObject format_and_args;
        current = (format_and_args = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)noun_compound_parser.$sym391$FORMAT, stream, (SubLObject)ConsesLow.list((SubLObject)noun_compound_parser.$sym392$NCS_FORMAT, cat), ConsesLow.append(format_and_args, (SubLObject)noun_compound_parser.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 120004L)
    public static SubLObject noun_compound_statistics(SubLObject mode, SubLObject cutoff, SubLObject from_file) {
        if (mode == noun_compound_parser.UNPROVIDED) {
            mode = (SubLObject)noun_compound_parser.$kw393$STDOUT;
        }
        if (cutoff == noun_compound_parser.UNPROVIDED) {
            cutoff = (SubLObject)noun_compound_parser.$int394$100000;
        }
        if (from_file == noun_compound_parser.UNPROVIDED) {
            from_file = (SubLObject)noun_compound_parser.$str395$_cyc_departments_nl_doc_stats_src;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        rbp_untrace();
        SubLObject i = (SubLObject)noun_compound_parser.ZERO_INTEGER;
        SubLObject any_matches = (SubLObject)noun_compound_parser.ZERO_INTEGER;
        SubLObject total_parses = (SubLObject)noun_compound_parser.ZERO_INTEGER;
        SubLObject ok_parses = (SubLObject)noun_compound_parser.ZERO_INTEGER;
        SubLObject violations = (SubLObject)noun_compound_parser.ZERO_INTEGER;
        SubLObject wanted_denots = (SubLObject)noun_compound_parser.ZERO_INTEGER;
        SubLObject had_denots = (SubLObject)noun_compound_parser.ZERO_INTEGER;
        SubLObject total_denots = (SubLObject)noun_compound_parser.ZERO_INTEGER;
        SubLObject reform_to_denots = (SubLObject)noun_compound_parser.ZERO_INTEGER;
        final SubLObject output_file = Sequences.cconcatenate((SubLObject)noun_compound_parser.$str396$_cyc_departments_nl_doc_stats_kb, new SubLObject[] { string_utilities.str(control_vars.kb_loaded()), operation_communication.kb_op_number().isPositive() ? Sequences.cconcatenate((SubLObject)noun_compound_parser.$str397$_, string_utilities.str(operation_communication.kb_op_number())) : noun_compound_parser.$str398$, noun_compound_parser.$str399$_, string_utilities.str(numeric_date_utilities.get_universal_date((SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED)), noun_compound_parser.$str400$_ncr_stats });
        final SubLObject compound_out = mode.eql((SubLObject)noun_compound_parser.$kw393$STDOUT) ? StreamsLow.$standard_output$.getDynamicValue(thread) : StreamsLow.open(output_file, new SubLObject[] { noun_compound_parser.$kw401$DIRECTION, noun_compound_parser.$kw402$OUTPUT, noun_compound_parser.$kw403$IF_DOES_NOT_EXIST, noun_compound_parser.$kw404$CREATE });
        final SubLObject total_rule_uses = dictionary.new_dictionary((SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED);
        final SubLObject good_rule_uses = dictionary.new_dictionary((SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED);
        final SubLObject bad_rule_uses = dictionary.new_dictionary((SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED);
        final SubLObject already_covered = set.new_set((SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED);
        if (noun_compound_parser.NIL == streams_high.open_stream_p(compound_out)) {
            Errors.sublisp_break((SubLObject)noun_compound_parser.$str405$Couldn_t_open_output_stream__woul, new SubLObject[] { output_file });
        }
        SubLObject cdolist_list_var = rbp_rule_bank.rbp_rb_all_rules();
        SubLObject rule = (SubLObject)noun_compound_parser.NIL;
        rule = cdolist_list_var.first();
        while (noun_compound_parser.NIL != cdolist_list_var) {
            dictionary.dictionary_enter(total_rule_uses, rule, (SubLObject)noun_compound_parser.ZERO_INTEGER);
            dictionary.dictionary_enter(good_rule_uses, rule, (SubLObject)noun_compound_parser.ZERO_INTEGER);
            dictionary.dictionary_enter(bad_rule_uses, rule, (SubLObject)noun_compound_parser.ZERO_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        }
        SubLObject stream_var = (SubLObject)noun_compound_parser.NIL;
        try {
            final SubLObject compound_file;
            stream_var = (compound_file = StreamsLow.open(from_file, noun_compound_parser.EMPTY_SUBL_OBJECT_ARRAY));
            if (mode.eql((SubLObject)noun_compound_parser.$kw393$STDOUT)) {
                PrintLow.format(compound_out, (SubLObject)noun_compound_parser.$str406$would_print_to__S__, output_file);
            }
            else {
                PrintLow.format((SubLObject)noun_compound_parser.T, (SubLObject)noun_compound_parser.$str407$storing_results_in__S__cutoff_is_, output_file, cutoff);
            }
            initialize_ncs_formats(mode);
            final SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.currentBinding(thread);
            try {
                lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.bind((SubLObject)noun_compound_parser.$kw408$ON, thread);
                SubLObject this_compound;
                SubLObject exploded;
                SubLObject denots;
                SubLObject _prev_bind_0_$77;
                SubLObject copied_shadow;
                SubLObject good;
                SubLObject bad;
                SubLObject cdolist_list_var2;
                SubLObject good_one;
                SubLObject baddy;
                SubLObject iteration_state;
                SubLObject rule2;
                SubLObject blocks;
                SubLObject cdolist_list_var3;
                SubLObject parse;
                for (this_compound = (SubLObject)noun_compound_parser.NIL, this_compound = string_utilities.network_read_line(compound_file, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED); !i.numE(cutoff) && this_compound != noun_compound_parser.$kw409$EOF && noun_compound_parser.NIL != this_compound; this_compound = string_utilities.network_read_line(compound_file, (SubLObject)noun_compound_parser.NIL, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED)) {
                    if (noun_compound_parser.NIL == noun_compound_parser.$ncs_deverbals_onlyP$.getDynamicValue(thread) || noun_compound_parser.NIL != rbp_deverbal_candidateP(this_compound)) {
                        exploded = string_utilities.split_string(this_compound, (SubLObject)noun_compound_parser.UNPROVIDED);
                        denots = lexicon_accessors.denots_of_stringXpos(this_compound, (SubLObject)noun_compound_parser.$kw410$NOUN, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED);
                        _prev_bind_0_$77 = noun_compound_parser.$rbp_shadow_rulesP$.currentBinding(thread);
                        try {
                            noun_compound_parser.$rbp_shadow_rulesP$.bind((SubLObject)noun_compound_parser.T, thread);
                            copied_shadow = (SubLObject)noun_compound_parser.NIL;
                            if (noun_compound_parser.NIL == list_utilities.lengthE(exploded.first(), (SubLObject)noun_compound_parser.ONE_INTEGER, (SubLObject)noun_compound_parser.UNPROVIDED) && noun_compound_parser.NIL == list_utilities.lengthE(conses_high.second(exploded), (SubLObject)noun_compound_parser.ONE_INTEGER, (SubLObject)noun_compound_parser.UNPROVIDED) && noun_compound_parser.NIL == set.set_memberP(lexification_utilities.singularize_word(this_compound, (SubLObject)noun_compound_parser.UNPROVIDED), already_covered)) {
                                set.set_add(lexification_utilities.singularize_word(this_compound, (SubLObject)noun_compound_parser.UNPROVIDED), already_covered);
                                i = Numbers.add(i, (SubLObject)noun_compound_parser.ONE_INTEGER);
                                if (noun_compound_parser.NIL != number_utilities.multiple_ofP((SubLObject)noun_compound_parser.$int111$1000, i)) {
                                    Storage.gc((SubLObject)noun_compound_parser.UNPROVIDED);
                                }
                                PrintLow.format(compound_out, ncs_format((SubLObject)noun_compound_parser.$kw360$INVESTIGATING), i, this_compound);
                                thread.resetMultipleValues();
                                good = parse_deverbal_compound_with_fallback(this_compound, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED);
                                bad = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (noun_compound_parser.NIL != list_utilities.proper_list_p(good)) {
                                    any_matches = Numbers.add(any_matches, (SubLObject)noun_compound_parser.ONE_INTEGER);
                                    total_parses = Numbers.add(total_parses, Sequences.length(good));
                                    ok_parses = Numbers.add(ok_parses, Sequences.length(good));
                                    total_parses = Numbers.add(total_parses, Sequences.length(bad));
                                    cdolist_list_var2 = good;
                                    good_one = (SubLObject)noun_compound_parser.NIL;
                                    good_one = cdolist_list_var2.first();
                                    while (noun_compound_parser.NIL != cdolist_list_var2) {
                                        if (noun_compound_parser.NIL != constant_handles.constant_p(good_one.first())) {
                                            reform_to_denots = Numbers.add(reform_to_denots, (SubLObject)noun_compound_parser.ONE_INTEGER);
                                        }
                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                        good_one = cdolist_list_var2.first();
                                    }
                                    cdolist_list_var2 = bad;
                                    baddy = (SubLObject)noun_compound_parser.NIL;
                                    baddy = cdolist_list_var2.first();
                                    while (noun_compound_parser.NIL != cdolist_list_var2) {
                                        violations = Numbers.add(violations, Sequences.length(conses_high.second(baddy)));
                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                        baddy = cdolist_list_var2.first();
                                    }
                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(noun_compound_parser.$rbp_rules_to_parses_shadow$.getDynamicValue(thread))); noun_compound_parser.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                        thread.resetMultipleValues();
                                        rule2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                        blocks = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        dictionary_utilities.dictionary_increment(total_rule_uses, rule2, Sequences.length(blocks));
                                        cdolist_list_var3 = blocks;
                                        parse = (SubLObject)noun_compound_parser.NIL;
                                        parse = cdolist_list_var3.first();
                                        while (noun_compound_parser.NIL != cdolist_list_var3) {
                                            if (noun_compound_parser.NIL != subl_promotions.memberP(parse, good, (SubLObject)noun_compound_parser.EQUAL, (SubLObject)noun_compound_parser.UNPROVIDED)) {
                                                dictionary_utilities.dictionary_increment(good_rule_uses, rule2, (SubLObject)noun_compound_parser.UNPROVIDED);
                                            }
                                            else {
                                                dictionary_utilities.dictionary_increment(bad_rule_uses, rule2, (SubLObject)noun_compound_parser.UNPROVIDED);
                                            }
                                            cdolist_list_var3 = cdolist_list_var3.rest();
                                            parse = cdolist_list_var3.first();
                                        }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                    PrintLow.format(compound_out, ncs_format((SubLObject)noun_compound_parser.$kw362$PRINT_ME), this_compound);
                                    copied_shadow = print_rbp_parses_with_sources(compound_out, good, noun_compound_parser.$rbp_rules_to_parses_shadow$.getDynamicValue(thread), (SubLObject)noun_compound_parser.$str411$from_fallback);
                                    if (noun_compound_parser.NIL != bad) {
                                        PrintLow.format(compound_out, ncs_format((SubLObject)noun_compound_parser.$kw364$FLAG_BAD_PILE));
                                        print_rbp_parses_with_sources(compound_out, bad, copied_shadow, (SubLObject)noun_compound_parser.$str411$from_fallback);
                                    }
                                }
                                if (noun_compound_parser.NIL == good || noun_compound_parser.NIL != list_utilities.lengthG(good, (SubLObject)noun_compound_parser.THREE_INTEGER, (SubLObject)noun_compound_parser.UNPROVIDED)) {
                                    wanted_denots = Numbers.add(wanted_denots, (SubLObject)noun_compound_parser.ONE_INTEGER);
                                    if (noun_compound_parser.NIL != list_utilities.proper_list_p(denots)) {
                                        PrintLow.format(compound_out, ncs_format((SubLObject)noun_compound_parser.$kw366$DENOTS), denots);
                                        had_denots = Numbers.add(had_denots, (SubLObject)noun_compound_parser.ONE_INTEGER);
                                        total_denots = Numbers.add(total_denots, Sequences.length(denots));
                                    }
                                }
                                if (noun_compound_parser.NIL != list_utilities.proper_list_p(good) || noun_compound_parser.NIL != list_utilities.proper_list_p(denots)) {
                                    PrintLow.format(compound_out, ncs_format((SubLObject)noun_compound_parser.$kw368$BREAK));
                                }
                            }
                        }
                        finally {
                            noun_compound_parser.$rbp_shadow_rulesP$.rebind(_prev_bind_0_$77, thread);
                        }
                    }
                }
            }
            finally {
                lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.rebind(_prev_bind_0, thread);
            }
            PrintLow.format(compound_out, ncs_format((SubLObject)noun_compound_parser.$kw370$COUNT_WITH_PARSES), any_matches);
            PrintLow.format(compound_out, ncs_format((SubLObject)noun_compound_parser.$kw372$ACTUAL_PARSES), total_parses);
            PrintLow.format(compound_out, ncs_format((SubLObject)noun_compound_parser.$kw374$PERCENT_APPROVED), Numbers.multiply((SubLObject)noun_compound_parser.$int412$100, Numbers.divide(ok_parses, total_parses)));
            PrintLow.format(compound_out, ncs_format((SubLObject)noun_compound_parser.$kw376$TOTAL_VIOLATIONS), violations);
            PrintLow.format(compound_out, ncs_format((SubLObject)noun_compound_parser.$kw378$TO_CONSTANTS), reform_to_denots);
            PrintLow.format(compound_out, ncs_format((SubLObject)noun_compound_parser.$kw380$DENOTS_WANTED), new SubLObject[] { wanted_denots, had_denots, total_denots });
            SubLObject cdolist_list_var4 = dictionary_utilities.sort_dictionary_by_values(total_rule_uses, (SubLObject)noun_compound_parser.$sym124$_);
            SubLObject cons = (SubLObject)noun_compound_parser.NIL;
            cons = cdolist_list_var4.first();
            while (noun_compound_parser.NIL != cdolist_list_var4) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject rule3 = (SubLObject)noun_compound_parser.NIL;
                SubLObject total_uses = (SubLObject)noun_compound_parser.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)noun_compound_parser.$list413);
                rule3 = current.first();
                current = (total_uses = current.rest());
                PrintLow.format(compound_out, ncs_format((SubLObject)noun_compound_parser.$kw388$RULE_USES), new SubLObject[] { rule3, total_uses, dictionary.dictionary_lookup(good_rule_uses, rule3, (SubLObject)noun_compound_parser.UNPROVIDED), dictionary.dictionary_lookup(bad_rule_uses, rule3, (SubLObject)noun_compound_parser.UNPROVIDED) });
                cdolist_list_var4 = cdolist_list_var4.rest();
                cons = cdolist_list_var4.first();
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)noun_compound_parser.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (noun_compound_parser.NIL != stream_var) {
                    streams_high.close(stream_var, (SubLObject)noun_compound_parser.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return ok_parses;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 120004L)
    public static SubLObject print_rbp_parses_with_sources(final SubLObject stream, final SubLObject parses, final SubLObject dict, SubLObject label_if_not) {
        if (label_if_not == noun_compound_parser.UNPROVIDED) {
            label_if_not = (SubLObject)noun_compound_parser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject copied = dictionary_utilities.copy_dictionary(dict);
        SubLObject cdolist_list_var = parses;
        SubLObject parse = (SubLObject)noun_compound_parser.NIL;
        parse = cdolist_list_var.first();
        while (noun_compound_parser.NIL != cdolist_list_var) {
            if (noun_compound_parser.NIL != dictionary.non_empty_dictionary_p(copied)) {
                SubLObject found_it;
                SubLObject iteration_state;
                for (found_it = (SubLObject)noun_compound_parser.NIL, iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(copied)); noun_compound_parser.NIL == found_it && noun_compound_parser.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                    thread.resetMultipleValues();
                    final SubLObject rule = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                    final SubLObject blocks = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (noun_compound_parser.NIL != subl_promotions.memberP(parse, blocks, (SubLObject)noun_compound_parser.EQUAL, (SubLObject)noun_compound_parser.UNPROVIDED)) {
                        found_it = rule;
                    }
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                dictionary_utilities.dictionary_remove_from_value(copied, found_it, parse, (SubLObject)noun_compound_parser.EQUAL, (SubLObject)noun_compound_parser.UNPROVIDED);
                PrintLow.format(stream, ncs_format((SubLObject)noun_compound_parser.$kw382$RULES_AND_PARSE), found_it, parse);
            }
            else {
                PrintLow.format(stream, ncs_format((SubLObject)noun_compound_parser.$kw384$FALLBACK_AND_PARSE), (SubLObject)((noun_compound_parser.NIL != label_if_not) ? PrintLow.format((SubLObject)noun_compound_parser.NIL, ncs_format((SubLObject)noun_compound_parser.$kw386$LABEL), label_if_not) : noun_compound_parser.$str398$), parse);
            }
            cdolist_list_var = cdolist_list_var.rest();
            parse = cdolist_list_var.first();
        }
        return copied;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 120004L)
    public static SubLObject daml_process_ontology_file(SubLObject fn) {
        if (fn == noun_compound_parser.UNPROVIDED) {
            fn = (SubLObject)noun_compound_parser.$str414$_cyc_projects_daml_call_thesaurus;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        rbp_untrace();
        SubLObject not_bogus = (SubLObject)noun_compound_parser.ZERO_INTEGER;
        SubLObject not_skipped = (SubLObject)noun_compound_parser.ZERO_INTEGER;
        SubLObject work_done = (SubLObject)noun_compound_parser.ZERO_INTEGER;
        SubLObject stream_var = (SubLObject)noun_compound_parser.NIL;
        try {
            SubLObject compound_file;
            SubLObject this_compound;
            SubLObject _prev_bind_0;
            SubLObject _prev_bind_2;
            SubLObject the_parses;
            for (stream_var = (compound_file = StreamsLow.open(fn, noun_compound_parser.EMPTY_SUBL_OBJECT_ARRAY)), this_compound = (SubLObject)noun_compound_parser.NIL, this_compound = string_utilities.network_read_line(compound_file, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED); this_compound != noun_compound_parser.$kw409$EOF && noun_compound_parser.NIL != this_compound; this_compound = string_utilities.network_read_line(compound_file, (SubLObject)noun_compound_parser.NIL, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED)) {
                this_compound = string_utilities.remove_substring(this_compound, (SubLObject)noun_compound_parser.$str415$_);
                if (noun_compound_parser.NIL == Sequences.search((SubLObject)noun_compound_parser.$str416$_, this_compound, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED)) {
                    not_bogus = Numbers.add(not_bogus, (SubLObject)noun_compound_parser.ONE_INTEGER);
                    if (noun_compound_parser.NIL == string_utilities.empty_string_p(this_compound)) {
                        if (noun_compound_parser.NIL != lexification_utilities.initial_capitalizedP(this_compound) && noun_compound_parser.NIL != Sequences.search((SubLObject)noun_compound_parser.$str399$_, this_compound, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED, (SubLObject)noun_compound_parser.UNPROVIDED)) {
                            PrintLow.format((SubLObject)noun_compound_parser.T, (SubLObject)noun_compound_parser.$str417$skipping__A______, this_compound);
                        }
                        else {
                            PrintLow.format((SubLObject)noun_compound_parser.T, (SubLObject)noun_compound_parser.$str418$investigating__A______, this_compound);
                            not_skipped = Numbers.add(not_skipped, (SubLObject)noun_compound_parser.ONE_INTEGER);
                            _prev_bind_0 = lexicon_vars.$exclude_slangP$.currentBinding(thread);
                            _prev_bind_2 = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.currentBinding(thread);
                            try {
                                lexicon_vars.$exclude_slangP$.bind((SubLObject)noun_compound_parser.T, thread);
                                lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.bind((SubLObject)((noun_compound_parser.NIL == lexification_utilities.initial_capitalizedP(this_compound)) ? noun_compound_parser.$kw408$ON : noun_compound_parser.$kw419$OFF), thread);
                                the_parses = rbp_escalating_parse(this_compound, (SubLObject)noun_compound_parser.UNPROVIDED);
                                if (noun_compound_parser.NIL != list_utilities.proper_list_p(the_parses)) {
                                    work_done = Numbers.add(work_done, (SubLObject)noun_compound_parser.ONE_INTEGER);
                                    PrintLow.format((SubLObject)noun_compound_parser.T, (SubLObject)noun_compound_parser.$str420$_S_______________________________, the_parses);
                                }
                            }
                            finally {
                                lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.rebind(_prev_bind_2, thread);
                                lexicon_vars.$exclude_slangP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)noun_compound_parser.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (noun_compound_parser.NIL != stream_var) {
                    streams_high.close(stream_var, (SubLObject)noun_compound_parser.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        PrintLow.format((SubLObject)noun_compound_parser.T, (SubLObject)noun_compound_parser.$str421$found_something_for__A_of__A_entr, work_done, not_skipped);
        return Numbers.divide(work_done, not_skipped);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 120004L)
    public static SubLObject with_ncr_for_test_case(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)noun_compound_parser.$list422);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject name = (SubLObject)noun_compound_parser.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)noun_compound_parser.$list422);
        name = current.first();
        current = current.rest();
        if (noun_compound_parser.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)noun_compound_parser.$sym423$PCOND, reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)noun_compound_parser.$sym424$FIND_CONSTANT, name), ConsesLow.append(body, (SubLObject)noun_compound_parser.NIL)), (SubLObject)ConsesLow.list((SubLObject)noun_compound_parser.$sym425$_RBP_SHOW_SUCCESSFUL_RULES__, (SubLObject)ConsesLow.list((SubLObject)noun_compound_parser.$sym426$WARN, (SubLObject)noun_compound_parser.$str427$Skipping_this_test_as__A_doesn_t_, name)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)noun_compound_parser.$list422);
        return (SubLObject)noun_compound_parser.NIL;
    }
    
    public static SubLObject declare_noun_compound_parser_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "add_nc_rule_constraint", "ADD-NC-RULE-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "remove_nc_rule_constraint", "REMOVE-NC-RULE-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "add_nc_rule_template", "ADD-NC-RULE-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "remove_nc_rule_template", "REMOVE-NC-RULE-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "noun_compound_parse_print_function_trampoline", "NOUN-COMPOUND-PARSE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "noun_compound_parse_p", "NOUN-COMPOUND-PARSE-P", 1, 0, false);
        new $noun_compound_parse_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "nc_parse_unique_id", "NC-PARSE-UNIQUE-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "nc_parse_input_string", "NC-PARSE-INPUT-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "nc_parse_input_strings", "NC-PARSE-INPUT-STRINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "nc_parse_chart", "NC-PARSE-CHART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "_csetf_nc_parse_unique_id", "_CSETF-NC-PARSE-UNIQUE-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "_csetf_nc_parse_input_string", "_CSETF-NC-PARSE-INPUT-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "_csetf_nc_parse_input_strings", "_CSETF-NC-PARSE-INPUT-STRINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "_csetf_nc_parse_chart", "_CSETF-NC-PARSE-CHART", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "make_noun_compound_parse", "MAKE-NOUN-COMPOUND-PARSE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "visit_defstruct_noun_compound_parse", "VISIT-DEFSTRUCT-NOUN-COMPOUND-PARSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "visit_defstruct_object_noun_compound_parse_method", "VISIT-DEFSTRUCT-OBJECT-NOUN-COMPOUND-PARSE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "pprint_nc_parse", "PPRINT-NC-PARSE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "new_nc_parse", "NEW-NC-PARSE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_trace", "RBP-TRACE", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.noun_compound_parser", "with_rbp_trace", "WITH-RBP-TRACE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_untrace", "RBP-UNTRACE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_show_rules", "RBP-SHOW-RULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_hide_rules", "RBP-HIDE-RULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_traced_rules", "RBP-TRACED-RULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_trace_rule", "RBP-TRACE-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_untrace_all_rules", "RBP-UNTRACE-ALL-RULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_untrace_rule", "RBP-UNTRACE-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "just_one_spaceP", "JUST-ONE-SPACE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "noun_compound_block_print_function_trampoline", "NOUN-COMPOUND-BLOCK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "noun_compound_block_p", "NOUN-COMPOUND-BLOCK-P", 1, 0, false);
        new $noun_compound_block_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "nc_block_unique_id", "NC-BLOCK-UNIQUE-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "nc_block_span_index", "NC-BLOCK-SPAN-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "nc_block_confidence", "NC-BLOCK-CONFIDENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "nc_block_denot", "NC-BLOCK-DENOT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "nc_block_filters", "NC-BLOCK-FILTERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "nc_block_spanned_string", "NC-BLOCK-SPANNED-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "nc_block_head", "NC-BLOCK-HEAD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "nc_block_head_pos", "NC-BLOCK-HEAD-POS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "nc_block_head_string_pred", "NC-BLOCK-HEAD-STRING-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "nc_block_sub_tree", "NC-BLOCK-SUB-TREE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "nc_block_plist", "NC-BLOCK-PLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "_csetf_nc_block_unique_id", "_CSETF-NC-BLOCK-UNIQUE-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "_csetf_nc_block_span_index", "_CSETF-NC-BLOCK-SPAN-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "_csetf_nc_block_confidence", "_CSETF-NC-BLOCK-CONFIDENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "_csetf_nc_block_denot", "_CSETF-NC-BLOCK-DENOT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "_csetf_nc_block_filters", "_CSETF-NC-BLOCK-FILTERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "_csetf_nc_block_spanned_string", "_CSETF-NC-BLOCK-SPANNED-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "_csetf_nc_block_head", "_CSETF-NC-BLOCK-HEAD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "_csetf_nc_block_head_pos", "_CSETF-NC-BLOCK-HEAD-POS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "_csetf_nc_block_head_string_pred", "_CSETF-NC-BLOCK-HEAD-STRING-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "_csetf_nc_block_sub_tree", "_CSETF-NC-BLOCK-SUB-TREE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "_csetf_nc_block_plist", "_CSETF-NC-BLOCK-PLIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "make_noun_compound_block", "MAKE-NOUN-COMPOUND-BLOCK", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "visit_defstruct_noun_compound_block", "VISIT-DEFSTRUCT-NOUN-COMPOUND-BLOCK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "visit_defstruct_object_noun_compound_block_method", "VISIT-DEFSTRUCT-OBJECT-NOUN-COMPOUND-BLOCK-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "nc_block_plist_lookup", "NC-BLOCK-PLIST-LOOKUP", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "nc_block_plist_set", "NC-BLOCK-PLIST-SET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "nc_block_wu", "NC-BLOCK-WU", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "nc_block_set_wu", "NC-BLOCK-SET-WU", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "nc_block_rule", "NC-BLOCK-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "nc_block_mod_block", "NC-BLOCK-MOD-BLOCK", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "nc_block_head_block", "NC-BLOCK-HEAD-BLOCK", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "nc_block_rule_count", "NC-BLOCK-RULE-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "pprint_nc_block", "PPRINT-NC-BLOCK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "new_noun_compound_block", "NEW-NOUN-COMPOUND-BLOCK", 4, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "inference_new_noun_compound_block", "INFERENCE-NEW-NOUN-COMPOUND-BLOCK", 4, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "combine_noun_compound_blocks_internal", "COMBINE-NOUN-COMPOUND-BLOCKS-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "combine_noun_compound_blocks", "COMBINE-NOUN-COMPOUND-BLOCKS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "token_to_blocks", "TOKEN-TO-BLOCKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_adj_blockP", "RBP-ADJ-BLOCK?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_adj_modified_blockP", "RBP-ADJ-MODIFIED-BLOCK?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_base_from_block", "RBP-BASE-FROM-BLOCK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_apply_filter_cluster", "RBP-APPLY-FILTER-CLUSTER", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_process_filter_clusters", "RBP-PROCESS-FILTER-CLUSTERS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_parse_wrong_sizeP", "RBP-PARSE-WRONG-SIZE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_component_count", "RBP-COMPONENT-COUNT", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.noun_compound_parser", "ncp_reporting_metrics", "NCP-REPORTING-METRICS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "parse_noun_compound", "PARSE-NOUN-COMPOUND", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "parse_noun_compound_with_rules", "PARSE-NOUN-COMPOUND-WITH-RULES", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_rule_fort_p", "RBP-RULE-FORT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "parse_noun_compound_from_string_tokens", "PARSE-NOUN-COMPOUND-FROM-STRING-TOKENS", 1, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.noun_compound_parser", "with_new_ncp_problem_store", "WITH-NEW-NCP-PROBLEM-STORE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "parse_noun_compound_int", "PARSE-NOUN-COMPOUND-INT", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "ncp_initialize_metrics", "NCP-INITIALIZE-METRICS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "ncp_report_metrics", "NCP-REPORT-METRICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "ncp_herald_start", "NCP-HERALD-START", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_sort_blocks_complexity_first", "RBP-SORT-BLOCKS-COMPLEXITY-FIRST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_sort_blocks_confidence_first", "RBP-SORT-BLOCKS-CONFIDENCE-FIRST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_filter_and_sort_result_blocks", "RBP-FILTER-AND-SORT-RESULT-BLOCKS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_block_reliability_estimate", "RBP-BLOCK-RELIABILITY-ESTIMATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_unify_blocks_to_common_specpreds", "RBP-UNIFY-BLOCKS-TO-COMMON-SPECPREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_unify_rewrite_of_blocks", "RBP-UNIFY-REWRITE-OF-BLOCKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_unify_city_named_fn_blocks", "RBP-UNIFY-CITY-NAMED-FN-BLOCKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_nominal_blockP", "RBP-NOMINAL-BLOCK?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "display_complete_parses", "DISPLAY-COMPLETE-PARSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "nc_block_uses_required_rules_p", "NC-BLOCK-USES-REQUIRED-RULES-P", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "nc_block_uses_required_rule_p", "NC-BLOCK-USES-REQUIRED-RULE-P", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_parse_and_confidenceP", "RBP-PARSE-AND-CONFIDENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_parse_and_confidenceE", "RBP-PARSE-AND-CONFIDENCE=", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "ncp_chart_init", "NCP-CHART-INIT", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "ncp_chart_init_from_string_tokens", "NCP-CHART-INIT-FROM-STRING-TOKENS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "new_ncp_chart", "NEW-NCP-CHART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "ncp_chart_init_int", "NCP-CHART-INIT-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_input_spanning_blockP", "RBP-INPUT-SPANNING-BLOCK?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_filter_verbs", "RBP-FILTER-VERBS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_filter_verbs_in_tuples", "RBP-FILTER-VERBS-IN-TUPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_remove_subsumed_tokens", "RBP-REMOVE-SUBSUMED-TOKENS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_span_subsumed_by_all_ofP", "RBP-SPAN-SUBSUMED-BY-ALL-OF?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_span_subsumed_byP", "RBP-SPAN-SUBSUMED-BY?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "initialize_rbp_name_cache", "INITIALIZE-RBP-NAME-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_name_block_pred_among_floorsP", "RBP-NAME-BLOCK-PRED-AMONG-FLOORS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_cache_name_block", "RBP-CACHE-NAME-BLOCK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "clear_rbp_floors_cached", "CLEAR-RBP-FLOORS-CACHED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "remove_rbp_floors_cached", "REMOVE-RBP-FLOORS-CACHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_floors_cached_internal", "RBP-FLOORS-CACHED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_floors_cached", "RBP-FLOORS-CACHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "clear_rbp_ok_name_cachedP", "CLEAR-RBP-OK-NAME-CACHED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "remove_rbp_ok_name_cachedP", "REMOVE-RBP-OK-NAME-CACHED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_ok_name_cachedP_internal", "RBP-OK-NAME-CACHED?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_ok_name_cachedP", "RBP-OK-NAME-CACHED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_strings_for_span", "RBP-STRINGS-FOR-SPAN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_string_tokenize", "RBP-STRING-TOKENIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_ok_blockP", "RBP-OK-BLOCK?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_bad_name_blockP", "RBP-BAD-NAME-BLOCK?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_name_blockP", "RBP-NAME-BLOCK?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_filter_redundant_blocks", "RBP-FILTER-REDUNDANT-BLOCKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "display_all_parses", "DISPLAY-ALL-PARSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "display_all_trees", "DISPLAY-ALL-TREES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "display_tree", "DISPLAY-TREE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_rule_count", "RBP-RULE-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_rule_cycl_semx", "RBP-RULE-CYCL-SEMX", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_rule_okP", "RBP-RULE-OK?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_domain_mt", "RBP-DOMAIN-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_get_cognate_from_instance_level_arg", "RBP-GET-COGNATE-FROM-INSTANCE-LEVEL-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_get_cognate_from_type_level_arg", "RBP-GET-COGNATE-FROM-TYPE-LEVEL-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_semx_type_level_cognate", "RBP-SEMX-TYPE-LEVEL-COGNATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "ncp_ask_variable", "NCP-ASK-VARIABLE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_subcol_naut_fails_inter_arg_checksP", "RBP-SUBCOL-NAUT-FAILS-INTER-ARG-CHECKS?", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_get_dep_cols", "RBP-GET-DEP-COLS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_subcol_naut_do_inter_arg_test", "RBP-SUBCOL-NAUT-DO-INTER-ARG-TEST", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_inter_arg_isa_pred", "RBP-INTER-ARG-ISA-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_inter_arg_not_isa_pred", "RBP-INTER-ARG-NOT-ISA-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_binary_gaf_fails_inter_arg_checksP", "RBP-BINARY-GAF-FAILS-INTER-ARG-CHECKS?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_fails_wff_workaroundsP", "RBP-FAILS-WFF-WORKAROUNDS?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_rb_combine_noun_compound_blocks", "RBP-RB-COMBINE-NOUN-COMPOUND-BLOCKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_rb_rules_matching_blocks", "RBP-RB-RULES-MATCHING-BLOCKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_rb_rules_matching_blocks_wrt_closed_constraints", "RBP-RB-RULES-MATCHING-BLOCKS-WRT-CLOSED-CONSTRAINTS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "clear_rbp_rb_rules_matching_closed_specs", "CLEAR-RBP-RB-RULES-MATCHING-CLOSED-SPECS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "remove_rbp_rb_rules_matching_closed_specs", "REMOVE-RBP-RB-RULES-MATCHING-CLOSED-SPECS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_rb_rules_matching_closed_specs_internal", "RBP-RB-RULES-MATCHING-CLOSED-SPECS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_rb_rules_matching_closed_specs", "RBP-RB-RULES-MATCHING-CLOSED-SPECS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_rb_search_wrt_open_constraints", "RBP-RB-SEARCH-WRT-OPEN-CONSTRAINTS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_verify_internal", "RBP-VERIFY-INTERNAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_verify", "RBP-VERIFY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_rb_search", "RBP-RB-SEARCH", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "inference_rbp_rb_search", "INFERENCE-RBP-RB-SEARCH", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_rb_initial_search_no_tracing_internal", "RBP-RB-INITIAL-SEARCH-NO-TRACING-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_rb_initial_search_no_tracing", "RBP-RB-INITIAL-SEARCH-NO-TRACING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_rb_search_internal", "RBP-RB-SEARCH-INTERNAL", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_rb_blocks_pass_inter_constraintsP", "RBP-RB-BLOCKS-PASS-INTER-CONSTRAINTS?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "clear_inter_constraints_from_rule", "CLEAR-INTER-CONSTRAINTS-FROM-RULE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "remove_inter_constraints_from_rule", "REMOVE-INTER-CONSTRAINTS-FROM-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "inter_constraints_from_rule_internal", "INTER-CONSTRAINTS-FROM-RULE-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "inter_constraints_from_rule", "INTER-CONSTRAINTS-FROM-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "blocks_pass_all_inter_nc_constraintsP", "BLOCKS-PASS-ALL-INTER-NC-CONSTRAINTS?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "blocks_pass_inter_nc_constraintP", "BLOCKS-PASS-INTER-NC-CONSTRAINT?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "inter_nc_block_test", "INTER-NC-BLOCK-TEST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_check_initializations", "RBP-CHECK-INITIALIZATIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "combine_blocks_with_template", "COMBINE-BLOCKS-WITH-TEMPLATE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_test_for_con_kw", "RBP-TEST-FOR-CON-KW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_candidate_fn_for_con_kw", "RBP-CANDIDATE-FN-FOR-CON-KW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_get_deverbal_root", "RBP-GET-DEVERBAL-ROOT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_deverbal_candidateP", "RBP-DEVERBAL-CANDIDATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "parse_deverbal_compound_as_fallback", "PARSE-DEVERBAL-COMPOUND-AS-FALLBACK", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "parse_deverbal_compound_with_fallback", "PARSE-DEVERBAL-COMPOUND-WITH-FALLBACK", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "date_parse_block_print_function_trampoline", "DATE-PARSE-BLOCK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "date_parse_block_p", "DATE-PARSE-BLOCK-P", 1, 0, false);
        new $date_parse_block_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "date_parse_block_subcol_naut", "DATE-PARSE-BLOCK-SUBCOL-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "date_parse_block_confidence", "DATE-PARSE-BLOCK-CONFIDENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "_csetf_date_parse_block_subcol_naut", "_CSETF-DATE-PARSE-BLOCK-SUBCOL-NAUT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "_csetf_date_parse_block_confidence", "_CSETF-DATE-PARSE-BLOCK-CONFIDENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "make_date_parse_block", "MAKE-DATE-PARSE-BLOCK", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "visit_defstruct_date_parse_block", "VISIT-DEFSTRUCT-DATE-PARSE-BLOCK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "visit_defstruct_object_date_parse_block_method", "VISIT-DEFSTRUCT-OBJECT-DATE-PARSE-BLOCK-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "new_date_parse_block", "NEW-DATE-PARSE-BLOCK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "new_date_parse_block_for_denot_and_date", "NEW-DATE-PARSE-BLOCK-FOR-DENOT-AND-DATE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "date_parse_complexity_G", "DATE-PARSE-COMPLEXITY->", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "date_confidence_adjusted_for_year", "DATE-CONFIDENCE-ADJUSTED-FOR-YEAR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "date_parse_list_incorporate_frequency", "DATE-PARSE-LIST-INCORPORATE-FREQUENCY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "parse_string_as_date_fallback", "PARSE-STRING-AS-DATE-FALLBACK", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "parse_noun_compound_with_date_fallback", "PARSE-NOUN-COMPOUND-WITH-DATE-FALLBACK", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_parse_filter_nonagentive_actors", "RBP-PARSE-FILTER-NONAGENTIVE-ACTORS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_matches_any_all_exists_gafsP", "RBP-MATCHES-ANY-ALL-EXISTS-GAFS?", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_all_exists_matches_internal", "RBP-ALL-EXISTS-MATCHES-INTERNAL", 6, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_all_exists_matches", "RBP-ALL-EXISTS-MATCHES", 6, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_matches_any_all_exists_gafs_query_sentence", "RBP-MATCHES-ANY-ALL-EXISTS-GAFS-QUERY-SENTENCE", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_parse_prefer_rmp_matches", "RBP-PARSE-PREFER-RMP-MATCHES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_parse_prefer_rmp_matches_int", "RBP-PARSE-PREFER-RMP-MATCHES-INT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_parse_rmp_problem_for_subcol_naut", "RBP-PARSE-RMP-PROBLEM-FOR-SUBCOL-NAUT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_coerce_to_ternary_subcollection_naut", "RBP-COERCE-TO-TERNARY-SUBCOLLECTION-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_parse_prefer_rmp_matches_failure_message", "RBP-PARSE-PREFER-RMP-MATCHES-FAILURE-MESSAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_parse_filter_unlikely_instrumentals", "RBP-PARSE-FILTER-UNLIKELY-INSTRUMENTALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_parse_filter_unlikely_instrumentals_int", "RBP-PARSE-FILTER-UNLIKELY-INSTRUMENTALS-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_parse_filter_subcollection_args", "RBP-PARSE-FILTER-SUBCOLLECTION-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_bad_subcollection_to_argP", "RBP-BAD-SUBCOLLECTION-TO-ARG?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_bad_subcollection_from_argP", "RBP-BAD-SUBCOLLECTION-FROM-ARG?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_unlikely_subcollection_naut_block_wrt_objectP", "RBP-UNLIKELY-SUBCOLLECTION-NAUT-BLOCK-WRT-OBJECT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_unlikely_subcollection_naut_wrt_objectP", "RBP-UNLIKELY-SUBCOLLECTION-NAUT-WRT-OBJECT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "clear_rbp_unlikely_subcollection_nautP", "CLEAR-RBP-UNLIKELY-SUBCOLLECTION-NAUT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "remove_rbp_unlikely_subcollection_nautP", "REMOVE-RBP-UNLIKELY-SUBCOLLECTION-NAUT?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_unlikely_subcollection_nautP_internal", "RBP-UNLIKELY-SUBCOLLECTION-NAUT?-INTERNAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_unlikely_subcollection_nautP", "RBP-UNLIKELY-SUBCOLLECTION-NAUT?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "parse_adj_initial_compound", "PARSE-ADJ-INITIAL-COMPOUND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "rbp_escalating_parse", "RBP-ESCALATING-PARSE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "parse_as_denot_or_noun_compound", "PARSE-AS-DENOT-OR-NOUN-COMPOUND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "parse_string_as_date_fallback_escalated", "PARSE-STRING-AS-DATE-FALLBACK-ESCALATED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "initialize_ncs_formats", "INITIALIZE-NCS-FORMATS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "ncs_format", "NCS-FORMAT", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.noun_compound_parser", "ncs_note", "NCS-NOTE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "noun_compound_statistics", "NOUN-COMPOUND-STATISTICS", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "print_rbp_parses_with_sources", "PRINT-RBP-PARSES-WITH-SOURCES", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_parser", "daml_process_ontology_file", "DAML-PROCESS-ONTOLOGY-FILE", 0, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.noun_compound_parser", "with_ncr_for_test_case", "WITH-NCR-FOR-TEST-CASE");
        return (SubLObject)noun_compound_parser.NIL;
    }
    
    public static SubLObject init_noun_compound_parser_file() {
        noun_compound_parser.$dtp_noun_compound_parse$ = SubLFiles.defconstant("*DTP-NOUN-COMPOUND-PARSE*", (SubLObject)noun_compound_parser.$sym4$NOUN_COMPOUND_PARSE);
        noun_compound_parser.$nc_parse_id_counter$ = SubLFiles.deflexical("*NC-PARSE-ID-COUNTER*", (SubLObject)(maybeDefault((SubLObject)noun_compound_parser.$sym31$_NC_PARSE_ID_COUNTER_, noun_compound_parser.$nc_parse_id_counter$, noun_compound_parser.ZERO_INTEGER)));
        noun_compound_parser.$rbp_report_parse_timeP$ = SubLFiles.defparameter("*RBP-REPORT-PARSE-TIME?*", (SubLObject)noun_compound_parser.NIL);
        noun_compound_parser.$rbp_shadow_rulesP$ = SubLFiles.defparameter("*RBP-SHADOW-RULES?*", (SubLObject)noun_compound_parser.NIL);
        noun_compound_parser.$rbp_rules_to_parses_shadow$ = SubLFiles.defparameter("*RBP-RULES-TO-PARSES-SHADOW*", (SubLObject)noun_compound_parser.NIL);
        noun_compound_parser.$rbp_return_confidenceP$ = SubLFiles.defparameter("*RBP-RETURN-CONFIDENCE?*", (SubLObject)noun_compound_parser.NIL);
        noun_compound_parser.$rbp_show_successful_rulesP$ = SubLFiles.defparameter("*RBP-SHOW-SUCCESSFUL-RULES?*", (SubLObject)noun_compound_parser.NIL);
        noun_compound_parser.$rbp_traced_rules$ = SubLFiles.defparameter("*RBP-TRACED-RULES*", (SubLObject)noun_compound_parser.NIL);
        noun_compound_parser.$dtp_noun_compound_block$ = SubLFiles.defconstant("*DTP-NOUN-COMPOUND-BLOCK*", (SubLObject)noun_compound_parser.$sym39$NOUN_COMPOUND_BLOCK);
        noun_compound_parser.$rbp_default_confidence_multiplier_for_failing_a_filter$ = SubLFiles.defparameter("*RBP-DEFAULT-CONFIDENCE-MULTIPLIER-FOR-FAILING-A-FILTER*", (SubLObject)noun_compound_parser.$float83$0_5);
        noun_compound_parser.$nc_block_unique_id_counter$ = SubLFiles.deflexical("*NC-BLOCK-UNIQUE-ID-COUNTER*", (SubLObject)(maybeDefault((SubLObject)noun_compound_parser.$sym85$_NC_BLOCK_UNIQUE_ID_COUNTER_, noun_compound_parser.$nc_block_unique_id_counter$, noun_compound_parser.ZERO_INTEGER)));
        noun_compound_parser.$rbp_universal_boolean_filters$ = SubLFiles.defparameter("*RBP-UNIVERSAL-BOOLEAN-FILTERS*", (SubLObject)noun_compound_parser.$list92);
        noun_compound_parser.$rbp_deverbal_boolean_filters$ = SubLFiles.defparameter("*RBP-DEVERBAL-BOOLEAN-FILTERS*", (SubLObject)noun_compound_parser.$list93);
        noun_compound_parser.$rbp_deverbal_macroscopic_filters$ = SubLFiles.defparameter("*RBP-DEVERBAL-MACROSCOPIC-FILTERS*", (SubLObject)noun_compound_parser.$list94);
        noun_compound_parser.$rbp_deverbal_macroscopic_block_filters$ = SubLFiles.defparameter("*RBP-DEVERBAL-MACROSCOPIC-BLOCK-FILTERS*", (SubLObject)noun_compound_parser.$list95);
        noun_compound_parser.$rbp_input_strings$ = SubLFiles.defparameter("*RBP-INPUT-STRINGS*", (SubLObject)noun_compound_parser.NIL);
        noun_compound_parser.$nominal_interpretations_only$ = SubLFiles.defparameter("*NOMINAL-INTERPRETATIONS-ONLY*", (SubLObject)noun_compound_parser.T);
        noun_compound_parser.$rbp_minimum_component_count$ = SubLFiles.defparameter("*RBP-MINIMUM-COMPONENT-COUNT*", (SubLObject)noun_compound_parser.ONE_INTEGER);
        noun_compound_parser.$rbp_maximum_component_count$ = SubLFiles.defparameter("*RBP-MAXIMUM-COMPONENT-COUNT*", (SubLObject)noun_compound_parser.NIL);
        noun_compound_parser.$ncp_problem_store$ = SubLFiles.defparameter("*NCP-PROBLEM-STORE*", (SubLObject)noun_compound_parser.NIL);
        noun_compound_parser.$rbp_sort_blocks_confidence_firstP$ = SubLFiles.defparameter("*RBP-SORT-BLOCKS-CONFIDENCE-FIRST?*", (SubLObject)noun_compound_parser.NIL);
        noun_compound_parser.$rbp_reliability_high$ = SubLFiles.defparameter("*RBP-RELIABILITY-HIGH*", (SubLObject)noun_compound_parser.$float129$1_05);
        noun_compound_parser.$rbp_reliability_medium$ = SubLFiles.defparameter("*RBP-RELIABILITY-MEDIUM*", (SubLObject)noun_compound_parser.ONE_INTEGER);
        noun_compound_parser.$rbp_reliability_low$ = SubLFiles.defparameter("*RBP-RELIABILITY-LOW*", (SubLObject)noun_compound_parser.$float130$0_95);
        noun_compound_parser.$rbp_chart_filterP$ = SubLFiles.deflexical("*RBP-CHART-FILTER?*", (SubLObject)noun_compound_parser.NIL);
        noun_compound_parser.$rbp_name_cache$ = SubLFiles.defparameter("*RBP-NAME-CACHE*", (SubLObject)noun_compound_parser.NIL);
        noun_compound_parser.$rbp_floors_cached_caching_state$ = SubLFiles.deflexical("*RBP-FLOORS-CACHED-CACHING-STATE*", (SubLObject)noun_compound_parser.NIL);
        noun_compound_parser.$rbp_ok_name_cachedP_caching_state$ = SubLFiles.deflexical("*RBP-OK-NAME-CACHED?-CACHING-STATE*", (SubLObject)noun_compound_parser.NIL);
        noun_compound_parser.$rbp_use_inter_arg_isa_filtersP$ = SubLFiles.defparameter("*RBP-USE-INTER-ARG-ISA-FILTERS?*", (SubLObject)noun_compound_parser.NIL);
        noun_compound_parser.$rbp_use_inter_arg_not_isa_filtersP$ = SubLFiles.defparameter("*RBP-USE-INTER-ARG-NOT-ISA-FILTERS?*", (SubLObject)noun_compound_parser.T);
        noun_compound_parser.$rbp_rb_closed_class_filter_keys$ = SubLFiles.deflexical("*RBP-RB-CLOSED-CLASS-FILTER-KEYS*", (SubLObject)noun_compound_parser.$list239);
        noun_compound_parser.$rbp_rb_rules_matching_closed_specs_caching_state$ = SubLFiles.deflexical("*RBP-RB-RULES-MATCHING-CLOSED-SPECS-CACHING-STATE*", (SubLObject)noun_compound_parser.NIL);
        noun_compound_parser.$inter_constraints_from_rule_caching_state$ = SubLFiles.deflexical("*INTER-CONSTRAINTS-FROM-RULE-CACHING-STATE*", (SubLObject)noun_compound_parser.NIL);
        noun_compound_parser.$rbp_high_date_confidence$ = SubLFiles.defparameter("*RBP-HIGH-DATE-CONFIDENCE*", (SubLObject)noun_compound_parser.$float281$0_75);
        noun_compound_parser.$rbp_low_date_confidence$ = SubLFiles.defparameter("*RBP-LOW-DATE-CONFIDENCE*", (SubLObject)noun_compound_parser.$float282$0_25);
        noun_compound_parser.$rbp_date_fallback_identifier$ = SubLFiles.defparameter("*RBP-DATE-FALLBACK-IDENTIFIER*", (SubLObject)noun_compound_parser.$kw283$DATE_FALLBACK);
        noun_compound_parser.$rbp_date_fallback_test$ = SubLFiles.defparameter("*RBP-DATE-FALLBACK-TEST*", Symbols.symbol_function((SubLObject)noun_compound_parser.EQL));
        noun_compound_parser.$dtp_date_parse_block$ = SubLFiles.defconstant("*DTP-DATE-PARSE-BLOCK*", (SubLObject)noun_compound_parser.$sym284$DATE_PARSE_BLOCK);
        noun_compound_parser.$rbp_rae_max_time$ = SubLFiles.defparameter("*RBP-RAE-MAX-TIME*", (SubLObject)noun_compound_parser.TEN_INTEGER);
        noun_compound_parser.$rbp_unlikely_subcollection_nautP_caching_state$ = SubLFiles.deflexical("*RBP-UNLIKELY-SUBCOLLECTION-NAUT?-CACHING-STATE*", (SubLObject)noun_compound_parser.NIL);
        noun_compound_parser.$ncs_formats$ = SubLFiles.defparameter("*NCS-FORMATS*", (SubLObject)noun_compound_parser.NIL);
        noun_compound_parser.$ncs_deverbals_onlyP$ = SubLFiles.defparameter("*NCS-DEVERBALS-ONLY?*", (SubLObject)noun_compound_parser.NIL);
        return (SubLObject)noun_compound_parser.NIL;
    }
    
    public static SubLObject setup_noun_compound_parser_file() {
        utilities_macros.register_kb_function((SubLObject)noun_compound_parser.$sym0$ADD_NC_RULE_CONSTRAINT);
        utilities_macros.register_kb_function((SubLObject)noun_compound_parser.$sym1$REMOVE_NC_RULE_CONSTRAINT);
        utilities_macros.register_kb_function((SubLObject)noun_compound_parser.$sym2$ADD_NC_RULE_TEMPLATE);
        utilities_macros.register_kb_function((SubLObject)noun_compound_parser.$sym3$REMOVE_NC_RULE_TEMPLATE);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), noun_compound_parser.$dtp_noun_compound_parse$.getGlobalValue(), Symbols.symbol_function((SubLObject)noun_compound_parser.$sym11$NOUN_COMPOUND_PARSE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)noun_compound_parser.$list12);
        Structures.def_csetf((SubLObject)noun_compound_parser.$sym13$NC_PARSE_UNIQUE_ID, (SubLObject)noun_compound_parser.$sym14$_CSETF_NC_PARSE_UNIQUE_ID);
        Structures.def_csetf((SubLObject)noun_compound_parser.$sym15$NC_PARSE_INPUT_STRING, (SubLObject)noun_compound_parser.$sym16$_CSETF_NC_PARSE_INPUT_STRING);
        Structures.def_csetf((SubLObject)noun_compound_parser.$sym17$NC_PARSE_INPUT_STRINGS, (SubLObject)noun_compound_parser.$sym18$_CSETF_NC_PARSE_INPUT_STRINGS);
        Structures.def_csetf((SubLObject)noun_compound_parser.$sym19$NC_PARSE_CHART, (SubLObject)noun_compound_parser.$sym20$_CSETF_NC_PARSE_CHART);
        Equality.identity((SubLObject)noun_compound_parser.$sym4$NOUN_COMPOUND_PARSE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), noun_compound_parser.$dtp_noun_compound_parse$.getGlobalValue(), Symbols.symbol_function((SubLObject)noun_compound_parser.$sym30$VISIT_DEFSTRUCT_OBJECT_NOUN_COMPOUND_PARSE_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)noun_compound_parser.$sym31$_NC_PARSE_ID_COUNTER_);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), noun_compound_parser.$dtp_noun_compound_block$.getGlobalValue(), Symbols.symbol_function((SubLObject)noun_compound_parser.$sym46$NOUN_COMPOUND_BLOCK_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)noun_compound_parser.$list47);
        Structures.def_csetf((SubLObject)noun_compound_parser.$sym48$NC_BLOCK_UNIQUE_ID, (SubLObject)noun_compound_parser.$sym49$_CSETF_NC_BLOCK_UNIQUE_ID);
        Structures.def_csetf((SubLObject)noun_compound_parser.$sym50$NC_BLOCK_SPAN_INDEX, (SubLObject)noun_compound_parser.$sym51$_CSETF_NC_BLOCK_SPAN_INDEX);
        Structures.def_csetf((SubLObject)noun_compound_parser.$sym52$NC_BLOCK_CONFIDENCE, (SubLObject)noun_compound_parser.$sym53$_CSETF_NC_BLOCK_CONFIDENCE);
        Structures.def_csetf((SubLObject)noun_compound_parser.$sym54$NC_BLOCK_DENOT, (SubLObject)noun_compound_parser.$sym55$_CSETF_NC_BLOCK_DENOT);
        Structures.def_csetf((SubLObject)noun_compound_parser.$sym56$NC_BLOCK_FILTERS, (SubLObject)noun_compound_parser.$sym57$_CSETF_NC_BLOCK_FILTERS);
        Structures.def_csetf((SubLObject)noun_compound_parser.$sym58$NC_BLOCK_SPANNED_STRING, (SubLObject)noun_compound_parser.$sym59$_CSETF_NC_BLOCK_SPANNED_STRING);
        Structures.def_csetf((SubLObject)noun_compound_parser.$sym60$NC_BLOCK_HEAD, (SubLObject)noun_compound_parser.$sym61$_CSETF_NC_BLOCK_HEAD);
        Structures.def_csetf((SubLObject)noun_compound_parser.$sym62$NC_BLOCK_HEAD_POS, (SubLObject)noun_compound_parser.$sym63$_CSETF_NC_BLOCK_HEAD_POS);
        Structures.def_csetf((SubLObject)noun_compound_parser.$sym64$NC_BLOCK_HEAD_STRING_PRED, (SubLObject)noun_compound_parser.$sym65$_CSETF_NC_BLOCK_HEAD_STRING_PRED);
        Structures.def_csetf((SubLObject)noun_compound_parser.$sym66$NC_BLOCK_SUB_TREE, (SubLObject)noun_compound_parser.$sym67$_CSETF_NC_BLOCK_SUB_TREE);
        Structures.def_csetf((SubLObject)noun_compound_parser.$sym68$NC_BLOCK_PLIST, (SubLObject)noun_compound_parser.$sym69$_CSETF_NC_BLOCK_PLIST);
        Equality.identity((SubLObject)noun_compound_parser.$sym39$NOUN_COMPOUND_BLOCK);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), noun_compound_parser.$dtp_noun_compound_block$.getGlobalValue(), Symbols.symbol_function((SubLObject)noun_compound_parser.$sym81$VISIT_DEFSTRUCT_OBJECT_NOUN_COMPOUND_BLOCK_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)noun_compound_parser.$sym85$_NC_BLOCK_UNIQUE_ID_COUNTER_);
        memoization_state.note_memoized_function((SubLObject)noun_compound_parser.$sym86$COMBINE_NOUN_COMPOUND_BLOCKS);
        memoization_state.note_globally_cached_function((SubLObject)noun_compound_parser.$sym161$RBP_FLOORS_CACHED);
        memoization_state.note_globally_cached_function((SubLObject)noun_compound_parser.$sym165$RBP_OK_NAME_CACHED_);
        memoization_state.note_globally_cached_function((SubLObject)noun_compound_parser.$sym241$RBP_RB_RULES_MATCHING_CLOSED_SPECS);
        memoization_state.note_memoized_function((SubLObject)noun_compound_parser.$sym245$RBP_VERIFY);
        memoization_state.note_memoized_function((SubLObject)noun_compound_parser.$sym246$RBP_RB_INITIAL_SEARCH_NO_TRACING);
        memoization_state.note_globally_cached_function((SubLObject)noun_compound_parser.$sym251$INTER_CONSTRAINTS_FROM_RULE);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), noun_compound_parser.$dtp_date_parse_block$.getGlobalValue(), Symbols.symbol_function((SubLObject)noun_compound_parser.$sym291$DATE_PARSE_BLOCK_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)noun_compound_parser.$list292);
        Structures.def_csetf((SubLObject)noun_compound_parser.$sym293$DATE_PARSE_BLOCK_SUBCOL_NAUT, (SubLObject)noun_compound_parser.$sym294$_CSETF_DATE_PARSE_BLOCK_SUBCOL_NAUT);
        Structures.def_csetf((SubLObject)noun_compound_parser.$sym295$DATE_PARSE_BLOCK_CONFIDENCE, (SubLObject)noun_compound_parser.$sym296$_CSETF_DATE_PARSE_BLOCK_CONFIDENCE);
        Equality.identity((SubLObject)noun_compound_parser.$sym284$DATE_PARSE_BLOCK);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), noun_compound_parser.$dtp_date_parse_block$.getGlobalValue(), Symbols.symbol_function((SubLObject)noun_compound_parser.$sym299$VISIT_DEFSTRUCT_OBJECT_DATE_PARSE_BLOCK_METHOD));
        memoization_state.note_memoized_function((SubLObject)noun_compound_parser.$sym317$RBP_ALL_EXISTS_MATCHES);
        memoization_state.note_globally_cached_function((SubLObject)noun_compound_parser.$sym348$RBP_UNLIKELY_SUBCOLLECTION_NAUT_);
        return (SubLObject)noun_compound_parser.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_noun_compound_parser_file();
    }
    
    @Override
	public void initializeVariables() {
        init_noun_compound_parser_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_noun_compound_parser_file();
    }
    
    static {
        me = (SubLFile)new noun_compound_parser();
        noun_compound_parser.$dtp_noun_compound_parse$ = null;
        noun_compound_parser.$nc_parse_id_counter$ = null;
        noun_compound_parser.$rbp_report_parse_timeP$ = null;
        noun_compound_parser.$rbp_shadow_rulesP$ = null;
        noun_compound_parser.$rbp_rules_to_parses_shadow$ = null;
        noun_compound_parser.$rbp_return_confidenceP$ = null;
        noun_compound_parser.$rbp_show_successful_rulesP$ = null;
        noun_compound_parser.$rbp_traced_rules$ = null;
        noun_compound_parser.$dtp_noun_compound_block$ = null;
        noun_compound_parser.$rbp_default_confidence_multiplier_for_failing_a_filter$ = null;
        noun_compound_parser.$nc_block_unique_id_counter$ = null;
        noun_compound_parser.$rbp_universal_boolean_filters$ = null;
        noun_compound_parser.$rbp_deverbal_boolean_filters$ = null;
        noun_compound_parser.$rbp_deverbal_macroscopic_filters$ = null;
        noun_compound_parser.$rbp_deverbal_macroscopic_block_filters$ = null;
        noun_compound_parser.$rbp_input_strings$ = null;
        noun_compound_parser.$nominal_interpretations_only$ = null;
        noun_compound_parser.$rbp_minimum_component_count$ = null;
        noun_compound_parser.$rbp_maximum_component_count$ = null;
        noun_compound_parser.$ncp_problem_store$ = null;
        noun_compound_parser.$rbp_sort_blocks_confidence_firstP$ = null;
        noun_compound_parser.$rbp_reliability_high$ = null;
        noun_compound_parser.$rbp_reliability_medium$ = null;
        noun_compound_parser.$rbp_reliability_low$ = null;
        noun_compound_parser.$rbp_chart_filterP$ = null;
        noun_compound_parser.$rbp_name_cache$ = null;
        noun_compound_parser.$rbp_floors_cached_caching_state$ = null;
        noun_compound_parser.$rbp_ok_name_cachedP_caching_state$ = null;
        noun_compound_parser.$rbp_use_inter_arg_isa_filtersP$ = null;
        noun_compound_parser.$rbp_use_inter_arg_not_isa_filtersP$ = null;
        noun_compound_parser.$rbp_rb_closed_class_filter_keys$ = null;
        noun_compound_parser.$rbp_rb_rules_matching_closed_specs_caching_state$ = null;
        noun_compound_parser.$inter_constraints_from_rule_caching_state$ = null;
        noun_compound_parser.$rbp_high_date_confidence$ = null;
        noun_compound_parser.$rbp_low_date_confidence$ = null;
        noun_compound_parser.$rbp_date_fallback_identifier$ = null;
        noun_compound_parser.$rbp_date_fallback_test$ = null;
        noun_compound_parser.$dtp_date_parse_block$ = null;
        noun_compound_parser.$rbp_rae_max_time$ = null;
        noun_compound_parser.$rbp_unlikely_subcollection_nautP_caching_state$ = null;
        noun_compound_parser.$ncs_formats$ = null;
        noun_compound_parser.$ncs_deverbals_onlyP$ = null;
        $sym0$ADD_NC_RULE_CONSTRAINT = SubLObjectFactory.makeSymbol("ADD-NC-RULE-CONSTRAINT");
        $sym1$REMOVE_NC_RULE_CONSTRAINT = SubLObjectFactory.makeSymbol("REMOVE-NC-RULE-CONSTRAINT");
        $sym2$ADD_NC_RULE_TEMPLATE = SubLObjectFactory.makeSymbol("ADD-NC-RULE-TEMPLATE");
        $sym3$REMOVE_NC_RULE_TEMPLATE = SubLObjectFactory.makeSymbol("REMOVE-NC-RULE-TEMPLATE");
        $sym4$NOUN_COMPOUND_PARSE = SubLObjectFactory.makeSymbol("NOUN-COMPOUND-PARSE");
        $sym5$NOUN_COMPOUND_PARSE_P = SubLObjectFactory.makeSymbol("NOUN-COMPOUND-PARSE-P");
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNIQUE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("INPUT-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("INPUT-STRINGS"), (SubLObject)SubLObjectFactory.makeSymbol("CHART"));
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("UNIQUE-ID"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT-STRING"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT-STRINGS"), (SubLObject)SubLObjectFactory.makeKeyword("CHART"));
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NC-PARSE-UNIQUE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("NC-PARSE-INPUT-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("NC-PARSE-INPUT-STRINGS"), (SubLObject)SubLObjectFactory.makeSymbol("NC-PARSE-CHART"));
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-NC-PARSE-UNIQUE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-NC-PARSE-INPUT-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-NC-PARSE-INPUT-STRINGS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-NC-PARSE-CHART"));
        $sym10$PPRINT_NC_PARSE = SubLObjectFactory.makeSymbol("PPRINT-NC-PARSE");
        $sym11$NOUN_COMPOUND_PARSE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("NOUN-COMPOUND-PARSE-PRINT-FUNCTION-TRAMPOLINE");
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("NOUN-COMPOUND-PARSE-P"));
        $sym13$NC_PARSE_UNIQUE_ID = SubLObjectFactory.makeSymbol("NC-PARSE-UNIQUE-ID");
        $sym14$_CSETF_NC_PARSE_UNIQUE_ID = SubLObjectFactory.makeSymbol("_CSETF-NC-PARSE-UNIQUE-ID");
        $sym15$NC_PARSE_INPUT_STRING = SubLObjectFactory.makeSymbol("NC-PARSE-INPUT-STRING");
        $sym16$_CSETF_NC_PARSE_INPUT_STRING = SubLObjectFactory.makeSymbol("_CSETF-NC-PARSE-INPUT-STRING");
        $sym17$NC_PARSE_INPUT_STRINGS = SubLObjectFactory.makeSymbol("NC-PARSE-INPUT-STRINGS");
        $sym18$_CSETF_NC_PARSE_INPUT_STRINGS = SubLObjectFactory.makeSymbol("_CSETF-NC-PARSE-INPUT-STRINGS");
        $sym19$NC_PARSE_CHART = SubLObjectFactory.makeSymbol("NC-PARSE-CHART");
        $sym20$_CSETF_NC_PARSE_CHART = SubLObjectFactory.makeSymbol("_CSETF-NC-PARSE-CHART");
        $kw21$UNIQUE_ID = SubLObjectFactory.makeKeyword("UNIQUE-ID");
        $kw22$INPUT_STRING = SubLObjectFactory.makeKeyword("INPUT-STRING");
        $kw23$INPUT_STRINGS = SubLObjectFactory.makeKeyword("INPUT-STRINGS");
        $kw24$CHART = SubLObjectFactory.makeKeyword("CHART");
        $str25$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw26$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym27$MAKE_NOUN_COMPOUND_PARSE = SubLObjectFactory.makeSymbol("MAKE-NOUN-COMPOUND-PARSE");
        $kw28$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw29$END = SubLObjectFactory.makeKeyword("END");
        $sym30$VISIT_DEFSTRUCT_OBJECT_NOUN_COMPOUND_PARSE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-NOUN-COMPOUND-PARSE-METHOD");
        $sym31$_NC_PARSE_ID_COUNTER_ = SubLObjectFactory.makeSymbol("*NC-PARSE-ID-COUNTER*");
        $str32$____NC_PARSE__ID___S__ = SubLObjectFactory.makeString("~&#<NC-PARSE: ID: ~S~%");
        $str33$__Input_string___S__ = SubLObjectFactory.makeString("  Input string: ~S~%");
        $str34$_Input_strings___S__ = SubLObjectFactory.makeString(" Input strings: ~S~%");
        $str35$_________Chart___S__ = SubLObjectFactory.makeString("         Chart: ~S~%");
        $sym36$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list37 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*RBP-SHOW-SUCCESSFUL-RULES?*"), (SubLObject)noun_compound_parser.T));
        $sym38$RBP_RULE_CYCL = SubLObjectFactory.makeSymbol("RBP-RULE-CYCL");
        $sym39$NOUN_COMPOUND_BLOCK = SubLObjectFactory.makeSymbol("NOUN-COMPOUND-BLOCK");
        $sym40$NOUN_COMPOUND_BLOCK_P = SubLObjectFactory.makeSymbol("NOUN-COMPOUND-BLOCK-P");
        $list41 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("UNIQUE-ID"), SubLObjectFactory.makeSymbol("SPAN-INDEX"), SubLObjectFactory.makeSymbol("CONFIDENCE"), SubLObjectFactory.makeSymbol("DENOT"), SubLObjectFactory.makeSymbol("FILTERS"), SubLObjectFactory.makeSymbol("SPANNED-STRING"), SubLObjectFactory.makeSymbol("HEAD"), SubLObjectFactory.makeSymbol("HEAD-POS"), SubLObjectFactory.makeSymbol("HEAD-STRING-PRED"), SubLObjectFactory.makeSymbol("SUB-TREE"), SubLObjectFactory.makeSymbol("PLIST") });
        $list42 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("UNIQUE-ID"), SubLObjectFactory.makeKeyword("SPAN-INDEX"), SubLObjectFactory.makeKeyword("CONFIDENCE"), SubLObjectFactory.makeKeyword("DENOT"), SubLObjectFactory.makeKeyword("FILTERS"), SubLObjectFactory.makeKeyword("SPANNED-STRING"), SubLObjectFactory.makeKeyword("HEAD"), SubLObjectFactory.makeKeyword("HEAD-POS"), SubLObjectFactory.makeKeyword("HEAD-STRING-PRED"), SubLObjectFactory.makeKeyword("SUB-TREE"), SubLObjectFactory.makeKeyword("PLIST") });
        $list43 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("NC-BLOCK-UNIQUE-ID"), SubLObjectFactory.makeSymbol("NC-BLOCK-SPAN-INDEX"), SubLObjectFactory.makeSymbol("NC-BLOCK-CONFIDENCE"), SubLObjectFactory.makeSymbol("NC-BLOCK-DENOT"), SubLObjectFactory.makeSymbol("NC-BLOCK-FILTERS"), SubLObjectFactory.makeSymbol("NC-BLOCK-SPANNED-STRING"), SubLObjectFactory.makeSymbol("NC-BLOCK-HEAD"), SubLObjectFactory.makeSymbol("NC-BLOCK-HEAD-POS"), SubLObjectFactory.makeSymbol("NC-BLOCK-HEAD-STRING-PRED"), SubLObjectFactory.makeSymbol("NC-BLOCK-SUB-TREE"), SubLObjectFactory.makeSymbol("NC-BLOCK-PLIST") });
        $list44 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-NC-BLOCK-UNIQUE-ID"), SubLObjectFactory.makeSymbol("_CSETF-NC-BLOCK-SPAN-INDEX"), SubLObjectFactory.makeSymbol("_CSETF-NC-BLOCK-CONFIDENCE"), SubLObjectFactory.makeSymbol("_CSETF-NC-BLOCK-DENOT"), SubLObjectFactory.makeSymbol("_CSETF-NC-BLOCK-FILTERS"), SubLObjectFactory.makeSymbol("_CSETF-NC-BLOCK-SPANNED-STRING"), SubLObjectFactory.makeSymbol("_CSETF-NC-BLOCK-HEAD"), SubLObjectFactory.makeSymbol("_CSETF-NC-BLOCK-HEAD-POS"), SubLObjectFactory.makeSymbol("_CSETF-NC-BLOCK-HEAD-STRING-PRED"), SubLObjectFactory.makeSymbol("_CSETF-NC-BLOCK-SUB-TREE"), SubLObjectFactory.makeSymbol("_CSETF-NC-BLOCK-PLIST") });
        $sym45$PPRINT_NC_BLOCK = SubLObjectFactory.makeSymbol("PPRINT-NC-BLOCK");
        $sym46$NOUN_COMPOUND_BLOCK_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("NOUN-COMPOUND-BLOCK-PRINT-FUNCTION-TRAMPOLINE");
        $list47 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("NOUN-COMPOUND-BLOCK-P"));
        $sym48$NC_BLOCK_UNIQUE_ID = SubLObjectFactory.makeSymbol("NC-BLOCK-UNIQUE-ID");
        $sym49$_CSETF_NC_BLOCK_UNIQUE_ID = SubLObjectFactory.makeSymbol("_CSETF-NC-BLOCK-UNIQUE-ID");
        $sym50$NC_BLOCK_SPAN_INDEX = SubLObjectFactory.makeSymbol("NC-BLOCK-SPAN-INDEX");
        $sym51$_CSETF_NC_BLOCK_SPAN_INDEX = SubLObjectFactory.makeSymbol("_CSETF-NC-BLOCK-SPAN-INDEX");
        $sym52$NC_BLOCK_CONFIDENCE = SubLObjectFactory.makeSymbol("NC-BLOCK-CONFIDENCE");
        $sym53$_CSETF_NC_BLOCK_CONFIDENCE = SubLObjectFactory.makeSymbol("_CSETF-NC-BLOCK-CONFIDENCE");
        $sym54$NC_BLOCK_DENOT = SubLObjectFactory.makeSymbol("NC-BLOCK-DENOT");
        $sym55$_CSETF_NC_BLOCK_DENOT = SubLObjectFactory.makeSymbol("_CSETF-NC-BLOCK-DENOT");
        $sym56$NC_BLOCK_FILTERS = SubLObjectFactory.makeSymbol("NC-BLOCK-FILTERS");
        $sym57$_CSETF_NC_BLOCK_FILTERS = SubLObjectFactory.makeSymbol("_CSETF-NC-BLOCK-FILTERS");
        $sym58$NC_BLOCK_SPANNED_STRING = SubLObjectFactory.makeSymbol("NC-BLOCK-SPANNED-STRING");
        $sym59$_CSETF_NC_BLOCK_SPANNED_STRING = SubLObjectFactory.makeSymbol("_CSETF-NC-BLOCK-SPANNED-STRING");
        $sym60$NC_BLOCK_HEAD = SubLObjectFactory.makeSymbol("NC-BLOCK-HEAD");
        $sym61$_CSETF_NC_BLOCK_HEAD = SubLObjectFactory.makeSymbol("_CSETF-NC-BLOCK-HEAD");
        $sym62$NC_BLOCK_HEAD_POS = SubLObjectFactory.makeSymbol("NC-BLOCK-HEAD-POS");
        $sym63$_CSETF_NC_BLOCK_HEAD_POS = SubLObjectFactory.makeSymbol("_CSETF-NC-BLOCK-HEAD-POS");
        $sym64$NC_BLOCK_HEAD_STRING_PRED = SubLObjectFactory.makeSymbol("NC-BLOCK-HEAD-STRING-PRED");
        $sym65$_CSETF_NC_BLOCK_HEAD_STRING_PRED = SubLObjectFactory.makeSymbol("_CSETF-NC-BLOCK-HEAD-STRING-PRED");
        $sym66$NC_BLOCK_SUB_TREE = SubLObjectFactory.makeSymbol("NC-BLOCK-SUB-TREE");
        $sym67$_CSETF_NC_BLOCK_SUB_TREE = SubLObjectFactory.makeSymbol("_CSETF-NC-BLOCK-SUB-TREE");
        $sym68$NC_BLOCK_PLIST = SubLObjectFactory.makeSymbol("NC-BLOCK-PLIST");
        $sym69$_CSETF_NC_BLOCK_PLIST = SubLObjectFactory.makeSymbol("_CSETF-NC-BLOCK-PLIST");
        $kw70$SPAN_INDEX = SubLObjectFactory.makeKeyword("SPAN-INDEX");
        $kw71$CONFIDENCE = SubLObjectFactory.makeKeyword("CONFIDENCE");
        $kw72$DENOT = SubLObjectFactory.makeKeyword("DENOT");
        $kw73$FILTERS = SubLObjectFactory.makeKeyword("FILTERS");
        $kw74$SPANNED_STRING = SubLObjectFactory.makeKeyword("SPANNED-STRING");
        $kw75$HEAD = SubLObjectFactory.makeKeyword("HEAD");
        $kw76$HEAD_POS = SubLObjectFactory.makeKeyword("HEAD-POS");
        $kw77$HEAD_STRING_PRED = SubLObjectFactory.makeKeyword("HEAD-STRING-PRED");
        $kw78$SUB_TREE = SubLObjectFactory.makeKeyword("SUB-TREE");
        $kw79$PLIST = SubLObjectFactory.makeKeyword("PLIST");
        $sym80$MAKE_NOUN_COMPOUND_BLOCK = SubLObjectFactory.makeSymbol("MAKE-NOUN-COMPOUND-BLOCK");
        $sym81$VISIT_DEFSTRUCT_OBJECT_NOUN_COMPOUND_BLOCK_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-NOUN-COMPOUND-BLOCK-METHOD");
        $kw82$WU = SubLObjectFactory.makeKeyword("WU");
        $float83$0_5 = (SubLFloat)SubLObjectFactory.makeDouble(0.5);
        $str84$__NCB__S___S__S_ = SubLObjectFactory.makeString("#<NCB ~S: ~S ~S>");
        $sym85$_NC_BLOCK_UNIQUE_ID_COUNTER_ = SubLObjectFactory.makeSymbol("*NC-BLOCK-UNIQUE-ID-COUNTER*");
        $sym86$COMBINE_NOUN_COMPOUND_BLOCKS = SubLObjectFactory.makeSymbol("COMBINE-NOUN-COMPOUND-BLOCKS");
        $list87 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RULE"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT"));
        $str88$_ = SubLObjectFactory.makeString(" ");
        $float89$1_1 = (SubLFloat)SubLObjectFactory.makeDouble(1.1);
        $list90 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DENOT"), (SubLObject)SubLObjectFactory.makeSymbol("POS"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("WU"));
        $const91$Adjective = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Adjective"));
        $list92 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RBP-PARSE-FILTER-SUBCOLLECTION-ARGS"));
        $list93 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RBP-PARSE-FILTER-NONAGENTIVE-ACTORS"), (SubLObject)SubLObjectFactory.makeSymbol("RBP-PARSE-FILTER-UNLIKELY-INSTRUMENTALS"));
        $list94 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RBP-UNLIKELY-SUBCOLLECTION-NAUT-WRT-OBJECT?"));
        $list95 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RBP-UNLIKELY-SUBCOLLECTION-NAUT-BLOCK-WRT-OBJECT?"));
        $sym96$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $kw97$NONE = SubLObjectFactory.makeKeyword("NONE");
        $kw98$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $kw99$BOOLEAN = SubLObjectFactory.makeKeyword("BOOLEAN");
        $list100 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BLOCK"), (SubLObject)SubLObjectFactory.makeSymbol("DIAGNOSTICS"));
        $str101$Abandoning_parse__S_for__S = SubLObjectFactory.makeString("Abandoning parse ~S for ~S");
        $list102 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BLOCK"), (SubLObject)SubLObjectFactory.makeSymbol("FAILED-THESE-FILTERS"), (SubLObject)SubLObjectFactory.makeSymbol("DISCONFIDENCE"));
        $list103 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym104$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $list105 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NCP-INITIALIZE-METRICS"));
        $sym106$NCP_HERALD_START = SubLObjectFactory.makeSymbol("NCP-HERALD-START");
        $list107 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TIME"));
        $sym108$CTIME = SubLObjectFactory.makeSymbol("CTIME");
        $sym109$TIME = SubLObjectFactory.makeSymbol("TIME");
        $list110 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NCP-REPORT-METRICS"), (SubLObject)SubLObjectFactory.makeSymbol("TIME")));
        $int111$1000 = SubLObjectFactory.makeInteger(1000);
        $sym112$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym113$NON_DOTTED_LIST_P = SubLObjectFactory.makeSymbol("NON-DOTTED-LIST-P");
        $sym114$RBP_RULE_FORT_P = SubLObjectFactory.makeSymbol("RBP-RULE-FORT-P");
        $sym115$RBP_FIND_RULE_FROM_CYCL = SubLObjectFactory.makeSymbol("RBP-FIND-RULE-FROM-CYCL");
        $const116$NounCompoundRule = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NounCompoundRule"));
        $sym117$STORE = SubLObjectFactory.makeUninternedSymbol("STORE");
        $sym118$WITH_NEW_PROBLEM_STORE = SubLObjectFactory.makeSymbol("WITH-NEW-PROBLEM-STORE");
        $sym119$_NCP_PROBLEM_STORE_ = SubLObjectFactory.makeSymbol("*NCP-PROBLEM-STORE*");
        $str120$__Total_parse_time___4_2F_seconds = SubLObjectFactory.makeString("~&Total parse time: ~4,2F seconds.~%");
        $str121$__Spent__4_2F_seconds_actually_pa = SubLObjectFactory.makeString("~&Spent ~4,2F seconds actually parsing.~%");
        $str122$__Now_parsing__S___ = SubLObjectFactory.makeString("~&Now parsing ~S.~%");
        $sym123$NPP_TERM_COMPLEXITY__ = SubLObjectFactory.makeSymbol("NPP-TERM-COMPLEXITY-<");
        $sym124$_ = SubLObjectFactory.makeSymbol(">");
        $str125$___S_didn_t_use_the_required_rule = SubLObjectFactory.makeString("~&~S didn't use the required rules: ~S.~%~%");
        $str126$___S_was_too_long_or_too_short___ = SubLObjectFactory.makeString("~&~S was too long or too short.~%~%");
        $str127$__The__S_form_of____S___is_being_ = SubLObjectFactory.makeString("~&The ~S form of~% ~S~% is being filtered out because it is not nominal.~%~%");
        $kw128$MACROSCOPIC = SubLObjectFactory.makeKeyword("MACROSCOPIC");
        $float129$1_05 = (SubLFloat)SubLObjectFactory.makeDouble(1.05);
        $float130$0_95 = (SubLFloat)SubLObjectFactory.makeDouble(0.95);
        $const131$Noun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun"));
        $sym132$LEXIFICATION_SENTENCE_FROM_PREFERRED_LEXIFICATION_ASSERTION = SubLObjectFactory.makeSymbol("LEXIFICATION-SENTENCE-FROM-PREFERRED-LEXIFICATION-ASSERTION");
        $const133$SubcollectionRelationFunction_Typ = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionRelationFunction-TypeLevel"));
        $sym134$NPP_GENL_ = SubLObjectFactory.makeSymbol("NPP-GENL?");
        $sym135$NPP_ISA_ = SubLObjectFactory.makeSymbol("NPP-ISA?");
        $sym136$SUBCOLLECTION_FUNCTION_NAUT_PRED = SubLObjectFactory.makeSymbol("SUBCOLLECTION-FUNCTION-NAUT-PRED");
        $const137$relationAllExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllExists"));
        $kw138$GAF = SubLObjectFactory.makeKeyword("GAF");
        $str139$Strengthening__S_to_use__S = SubLObjectFactory.makeString("Strengthening ~S to use ~S");
        $const140$rewriteOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rewriteOf"));
        $list141 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DENOT-ARG0"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT-ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT-ARG2"));
        $const142$CityNamedFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CityNamedFn"));
        $const143$State_Geopolitical = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("State-Geopolitical"));
        $const144$cityInState = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cityInState"));
        $const145$nameString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nameString"));
        $sym146$STRING_ = SubLObjectFactory.makeSymbol("STRING=");
        $const147$Country = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Country"));
        $const148$countryOfCity = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("countryOfCity"));
        $const149$NounPhrase = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NounPhrase"));
        $kw150$ORIGINAL_STRING = SubLObjectFactory.makeKeyword("ORIGINAL-STRING");
        $const151$gerund = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("gerund"));
        $sym152$RBP_PARSE_AND_CONFIDENCE_ = SubLObjectFactory.makeSymbol("RBP-PARSE-AND-CONFIDENCE=");
        $sym153$NPP_PARSE_ = SubLObjectFactory.makeSymbol("NPP-PARSE=");
        $sym154$RBP_PARSE_AND_CONFIDENCE_ = SubLObjectFactory.makeSymbol("RBP-PARSE-AND-CONFIDENCE?");
        $kw155$QUADS = SubLObjectFactory.makeKeyword("QUADS");
        $kw156$TRIPLES = SubLObjectFactory.makeKeyword("TRIPLES");
        $int157$256 = SubLObjectFactory.makeInteger(256);
        $const158$Verb = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb"));
        $const159$perfect = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("perfect"));
        $sym160$INTERVAL_TOKEN_LENGTH = SubLObjectFactory.makeSymbol("INTERVAL-TOKEN-LENGTH");
        $sym161$RBP_FLOORS_CACHED = SubLObjectFactory.makeSymbol("RBP-FLOORS-CACHED");
        $sym162$_RBP_FLOORS_CACHED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*RBP-FLOORS-CACHED-CACHING-STATE*");
        $int163$512 = SubLObjectFactory.makeInteger(512);
        $int164$128 = SubLObjectFactory.makeInteger(128);
        $sym165$RBP_OK_NAME_CACHED_ = SubLObjectFactory.makeSymbol("RBP-OK-NAME-CACHED?");
        $str166$the_ = SubLObjectFactory.makeString("the ");
        $const167$abbreviationString_PN = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("abbreviationString-PN"));
        $const168$acronymString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("acronymString"));
        $sym169$_RBP_OK_NAME_CACHED__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*RBP-OK-NAME-CACHED?-CACHING-STATE*");
        $const170$atomicSymbol = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("atomicSymbol"));
        $const171$ProperNoun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProperNoun"));
        $sym172$RBP_NAME_BLOCK_ = SubLObjectFactory.makeSymbol("RBP-NAME-BLOCK?");
        $sym173$RBP_NAME_BLOCK_PRED_AMONG_FLOORS_ = SubLObjectFactory.makeSymbol("RBP-NAME-BLOCK-PRED-AMONG-FLOORS?");
        $sym174$INTERVAL_SPAN_PRECEDES_ = SubLObjectFactory.makeSymbol("INTERVAL-SPAN-PRECEDES?");
        $sym175$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $list176 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RBP-RULE"), (SubLObject)SubLObjectFactory.makeSymbol("DTR1-ID"), (SubLObject)SubLObjectFactory.makeSymbol("DTR2-ID"));
        $str177$_S__ = SubLObjectFactory.makeString("~S~%");
        $const178$ncRuleTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ncRuleTemplate"));
        $const179$ncRuleTemplate_Compact = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ncRuleTemplate-Compact"));
        $kw180$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $list181 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("FN")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXICAL1")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("BIN-PRED")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXICAL2")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")));
        $sym182$INDEXICAL2 = SubLObjectFactory.makeSymbol("INDEXICAL2");
        $sym183$BIN_PRED = SubLObjectFactory.makeSymbol("BIN-PRED");
        $sym184$INDEXICAL1 = SubLObjectFactory.makeSymbol("INDEXICAL1");
        $sym185$FN = SubLObjectFactory.makeSymbol("FN");
        $sym186$RBP_SEMANTIC_CONSTRAINT_P = SubLObjectFactory.makeSymbol("RBP-SEMANTIC-CONSTRAINT-P");
        $sym187$RBP_WORD_UNIT_CONSTRAINT_P = SubLObjectFactory.makeSymbol("RBP-WORD-UNIT-CONSTRAINT-P");
        $const188$typeLevelCognates = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("typeLevelCognates"));
        $const189$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $list190 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("FOCAL-COL"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-COL"));
        $const191$SubcollectionRelationFunction_Ins = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionRelationFunction-InstanceLevel"));
        $kw192$PROBLEM_STORE = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $kw193$MAX_TRANSFORMATION_DEPTH = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $kw194$ISA = SubLObjectFactory.makeKeyword("ISA");
        $const195$geopoliticalSubdivision = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("geopoliticalSubdivision"));
        $kw196$NOT_ISA = SubLObjectFactory.makeKeyword("NOT-ISA");
        $sym197$_COL = SubLObjectFactory.makeSymbol("?COL");
        $const198$interArgNotIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgNotIsa"));
        $list199 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?COL"));
        $const200$interArgIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgIsa"));
        $str201$____but__A_has_to_be_an_instance_ = SubLObjectFactory.makeString("... but ~A has to be an instance of ~A in ~A and isn't");
        $str202$____but__A_has_to_intersect__A_in = SubLObjectFactory.makeString("... but ~A has to intersect ~A in ~A and doesn't");
        $str203$____but__A_can_t_be_an_instance_o = SubLObjectFactory.makeString("... but ~A can't be an instance of ~A in ~A and is");
        $str204$____but__A_can_t_be_a_spec_of__A_ = SubLObjectFactory.makeString("... but ~A can't be a spec of ~A in ~A and is");
        $str205$interArgIsa_D__D = SubLObjectFactory.makeString("interArgIsa~D-~D");
        $str206$Couldn_t_find_inter_arg_isa_predi = SubLObjectFactory.makeString("Couldn't find inter-arg-isa predicate from ~S to ~S");
        $str207$interArgNotIsa_D__D = SubLObjectFactory.makeString("interArgNotIsa~D-~D");
        $str208$Couldn_t_find_inter_arg_not_isa_p = SubLObjectFactory.makeString("Couldn't find inter-arg-not-isa predicate from ~S to ~S");
        $list209 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEMX-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2"));
        $const210$interArgIsa1_2 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgIsa1-2"));
        $str211$___but_it_fails_the_inter_arg_con = SubLObjectFactory.makeString("...but it fails the inter-arg constraint:~%   ~A");
        $const212$interArgIsa2_1 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgIsa2-1"));
        $const213$interArgNotIsa1_2 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgNotIsa1-2"));
        $list214 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("COL1"), (SubLObject)SubLObjectFactory.makeSymbol("SEMX-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("COL2"));
        $const215$SubcollectionRelationFunction_Can = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionRelationFunction-Canonical"));
        $const216$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $str217$_A__ = SubLObjectFactory.makeString("~A~%");
        $const218$groupMembers = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("groupMembers"));
        $const219$GroupFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GroupFn"));
        $const220$GroupOfCardinalityFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GroupOfCardinalityFn"));
        $str221$___but_it_failed_the_groupMembers = SubLObjectFactory.makeString("...but it failed the groupMembers wff-workaround (~A are groups of ~A, of which ~A is not a spec)");
        $const222$Predicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Predicate"));
        $str223$___but_the___CityNamedFn_arg2_doe = SubLObjectFactory.makeString("...but the #$CityNamedFn arg2 doesn't match the #$cityInState arg2: ~A vs ~A");
        $const224$StrictlyFunctionalSlot = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StrictlyFunctionalSlot"));
        $sym225$RELEVANT_PRED_IS_SPEC_PRED = SubLObjectFactory.makeSymbol("RELEVANT-PRED-IS-SPEC-PRED");
        $str226$___but_it_failed_the_strictly_fun = SubLObjectFactory.makeString("...but it failed the strictly-functional test: only (~A ~A ~A) is valid");
        $sym227$RELEVANT_PRED_IS_SPEC_INVERSE = SubLObjectFactory.makeSymbol("RELEVANT-PRED-IS-SPEC-INVERSE");
        $str228$__Trying_this_block_pair_____S___ = SubLObjectFactory.makeString("~%Trying this block pair:~% ~S (~S) (~S)~% ~S (~S) (~S).~%");
        $str229$__Rule__S_yielded____a___for__S__ = SubLObjectFactory.makeString("~&Rule ~S yielded~% ~a~% for ~S+~S.~%");
        $kw230$WFF = SubLObjectFactory.makeKeyword("WFF");
        $str231$___but_it_failed_the_wff_checker_ = SubLObjectFactory.makeString("...but it failed the wff-checker.~%");
        $const232$FormulaArgFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FormulaArgFn"));
        $list233 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("JUST-THIS-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"));
        $str234$___but_the_desired_FormulaArgFn__ = SubLObjectFactory.makeString("...but the desired FormulaArgFn (~D) exceeds the semx arity (~D).~%");
        $kw235$NOT_WFF = SubLObjectFactory.makeKeyword("NOT-WFF");
        $kw236$NON_WFF = SubLObjectFactory.makeKeyword("NON-WFF");
        $str237$___but_I_was_unable_to_verify__S_ = SubLObjectFactory.makeString("...but I was unable to verify ~S~%");
        $kw238$MODIFIER = SubLObjectFactory.makeKeyword("MODIFIER");
        $list239 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("HEAD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRED"), (SubLObject)SubLObjectFactory.makeKeyword("HEAD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("MODIFIER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRED"), (SubLObject)SubLObjectFactory.makeKeyword("MODIFIER")));
        $list240 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("C-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("O-TYPE"));
        $sym241$RBP_RB_RULES_MATCHING_CLOSED_SPECS = SubLObjectFactory.makeSymbol("RBP-RB-RULES-MATCHING-CLOSED-SPECS");
        $kw242$ALL = SubLObjectFactory.makeKeyword("ALL");
        $sym243$_RBP_RB_RULES_MATCHING_CLOSED_SPECS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*RBP-RB-RULES-MATCHING-CLOSED-SPECS-CACHING-STATE*");
        $kw244$OPEN_CLASS = SubLObjectFactory.makeKeyword("OPEN-CLASS");
        $sym245$RBP_VERIFY = SubLObjectFactory.makeSymbol("RBP-VERIFY");
        $sym246$RBP_RB_INITIAL_SEARCH_NO_TRACING = SubLObjectFactory.makeSymbol("RBP-RB-INITIAL-SEARCH-NO-TRACING");
        $kw247$SYNTACTIC = SubLObjectFactory.makeKeyword("SYNTACTIC");
        $kw248$SEMANTIC = SubLObjectFactory.makeKeyword("SEMANTIC");
        $kw249$CLOSED_CLASS = SubLObjectFactory.makeKeyword("CLOSED-CLASS");
        $str250$__The_blocks_failed_an_inter_cons = SubLObjectFactory.makeString("~%The blocks failed an inter-constraint in ~S on ~S.~%");
        $sym251$INTER_CONSTRAINTS_FROM_RULE = SubLObjectFactory.makeSymbol("INTER-CONSTRAINTS-FROM-RULE");
        $sym252$_INTER_CONSTRAINTS_FROM_RULE_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*INTER-CONSTRAINTS-FROM-RULE-CACHING-STATE*");
        $list253 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CON-KW"), (SubLObject)SubLObjectFactory.makeSymbol("ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2"));
        $list254 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("modifier"), (SubLObject)SubLObjectFactory.makeKeyword("MODIFIER"));
        $kw255$NO_DENOT = SubLObjectFactory.makeKeyword("NO-DENOT");
        $kw256$isa = SubLObjectFactory.makeKeyword("isa");
        $kw257$genl = SubLObjectFactory.makeKeyword("genl");
        $kw258$GENL = SubLObjectFactory.makeKeyword("GENL");
        $str259$__Semantics_are__S_and__S___in_te = SubLObjectFactory.makeString("~&Semantics are ~S and ~S~% in template ~S.~%");
        $kw260$pred = SubLObjectFactory.makeKeyword("pred");
        $kw261$PRED = SubLObjectFactory.makeKeyword("PRED");
        $sym262$NPP_GENL_PRED_ = SubLObjectFactory.makeSymbol("NPP-GENL-PRED?");
        $kw263$pos = SubLObjectFactory.makeKeyword("pos");
        $kw264$POS = SubLObjectFactory.makeKeyword("POS");
        $kw265$eql = SubLObjectFactory.makeKeyword("eql");
        $kw266$EQL = SubLObjectFactory.makeKeyword("EQL");
        $kw267$TYPE_GENL = SubLObjectFactory.makeKeyword("TYPE-GENL");
        $sym268$NPP_TYPE_GENL_ = SubLObjectFactory.makeSymbol("NPP-TYPE-GENL?");
        $sym269$NC_BLOCK_WU = SubLObjectFactory.makeSymbol("NC-BLOCK-WU");
        $sym270$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $str271$ing = SubLObjectFactory.makeString("ing");
        $const272$infinitive = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("infinitive"));
        $str273$ion = SubLObjectFactory.makeString("ion");
        $const274$agentive_Sg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("agentive-Sg"));
        $const275$singular = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular"));
        $str276$ment = SubLObjectFactory.makeString("ment");
        $const277$nounStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nounStrings"));
        $const278$massNumber = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("massNumber"));
        $sym279$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $list280 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MOD"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"));
        $float281$0_75 = (SubLFloat)SubLObjectFactory.makeDouble(0.75);
        $float282$0_25 = (SubLFloat)SubLObjectFactory.makeDouble(0.25);
        $kw283$DATE_FALLBACK = SubLObjectFactory.makeKeyword("DATE-FALLBACK");
        $sym284$DATE_PARSE_BLOCK = SubLObjectFactory.makeSymbol("DATE-PARSE-BLOCK");
        $sym285$DATE_PARSE_BLOCK_P = SubLObjectFactory.makeSymbol("DATE-PARSE-BLOCK-P");
        $list286 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBCOL-NAUT"), (SubLObject)SubLObjectFactory.makeSymbol("CONFIDENCE"));
        $list287 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUBCOL-NAUT"), (SubLObject)SubLObjectFactory.makeKeyword("CONFIDENCE"));
        $list288 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DATE-PARSE-BLOCK-SUBCOL-NAUT"), (SubLObject)SubLObjectFactory.makeSymbol("DATE-PARSE-BLOCK-CONFIDENCE"));
        $list289 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-DATE-PARSE-BLOCK-SUBCOL-NAUT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-DATE-PARSE-BLOCK-CONFIDENCE"));
        $sym290$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym291$DATE_PARSE_BLOCK_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("DATE-PARSE-BLOCK-PRINT-FUNCTION-TRAMPOLINE");
        $list292 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("DATE-PARSE-BLOCK-P"));
        $sym293$DATE_PARSE_BLOCK_SUBCOL_NAUT = SubLObjectFactory.makeSymbol("DATE-PARSE-BLOCK-SUBCOL-NAUT");
        $sym294$_CSETF_DATE_PARSE_BLOCK_SUBCOL_NAUT = SubLObjectFactory.makeSymbol("_CSETF-DATE-PARSE-BLOCK-SUBCOL-NAUT");
        $sym295$DATE_PARSE_BLOCK_CONFIDENCE = SubLObjectFactory.makeSymbol("DATE-PARSE-BLOCK-CONFIDENCE");
        $sym296$_CSETF_DATE_PARSE_BLOCK_CONFIDENCE = SubLObjectFactory.makeSymbol("_CSETF-DATE-PARSE-BLOCK-CONFIDENCE");
        $kw297$SUBCOL_NAUT = SubLObjectFactory.makeKeyword("SUBCOL-NAUT");
        $sym298$MAKE_DATE_PARSE_BLOCK = SubLObjectFactory.makeSymbol("MAKE-DATE-PARSE-BLOCK");
        $sym299$VISIT_DEFSTRUCT_OBJECT_DATE_PARSE_BLOCK_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-DATE-PARSE-BLOCK-METHOD");
        $const300$dateOfEvent = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dateOfEvent"));
        $const301$SubcollectionOfWithRelationToFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn"));
        $const302$YearFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn"));
        $sym303$EL_VARIABLE_P = SubLObjectFactory.makeSymbol("EL-VARIABLE-P");
        $const304$Event = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Event"));
        $list305 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("DATE-VAR"));
        $sym306$_EVENT = SubLObjectFactory.makeSymbol("?EVENT");
        $const307$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $const308$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $str309$_____todo_handle_dates_with_multi = SubLObjectFactory.makeString("*** @todo handle dates with multiple variables");
        $sym310$DATE_PARSE_COMPLEXITY__ = SubLObjectFactory.makeSymbol("DATE-PARSE-COMPLEXITY->");
        $const311$doneBy = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("doneBy"));
        $const312$Action = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Action"));
        $const313$Agent_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Agent-Generic"));
        $str314$rbp_parse_filter_nonagentive_acto = SubLObjectFactory.makeString("rbp-parse-filter-nonagentive-actors");
        $kw315$FROM = SubLObjectFactory.makeKeyword("FROM");
        $kw316$TO = SubLObjectFactory.makeKeyword("TO");
        $sym317$RBP_ALL_EXISTS_MATCHES = SubLObjectFactory.makeSymbol("RBP-ALL-EXISTS-MATCHES");
        $const318$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $kw319$MAX_NUMBER = SubLObjectFactory.makeKeyword("MAX-NUMBER");
        $kw320$MAX_TIME = SubLObjectFactory.makeKeyword("MAX-TIME");
        $kw321$RETURN = SubLObjectFactory.makeKeyword("RETURN");
        $kw322$TEMPLATE = SubLObjectFactory.makeKeyword("TEMPLATE");
        $sym323$_TYPE = SubLObjectFactory.makeSymbol("?TYPE");
        $str324$Timed_out_checking___relationAllE = SubLObjectFactory.makeString("Timed out checking #$relationAllExists, etc. after ~S seconds on~% ~S ~S ~S");
        $const325$SymmetricBinaryPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SymmetricBinaryPredicate"));
        $const326$equals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"));
        $const327$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $const328$relationAllInstance = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllInstance"));
        $list329 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?TYPE"));
        $const330$relationInstanceExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceExists"));
        $const331$relationExistsAll = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationExistsAll"));
        $const332$relationExistsInstance = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationExistsInstance"));
        $str333$rbp_parse_prefer_rmp_matches_had_ = SubLObjectFactory.makeString("rbp-parse-prefer-rmp-matches had to punt");
        $const334$expansion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("expansion"));
        $const335$intersectionType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("intersectionType"));
        $const336$SubcollectionRelationFunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionRelationFunction"));
        $kw337$ARG1 = SubLObjectFactory.makeKeyword("ARG1");
        $kw338$ARG2 = SubLObjectFactory.makeKeyword("ARG2");
        $const339$CollectionIntersection2Fn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionIntersection2Fn"));
        $str340$doesn_t_match___relationAllExists = SubLObjectFactory.makeString("doesn't match #$relationAllExists expectations for ~A");
        $const341$instrumentType_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("instrumentType-Generic"));
        $const342$ObjectWithUse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ObjectWithUse"));
        $str343$rbp_parse_filter_unlikely_instrum = SubLObjectFactory.makeString("rbp-parse-filter-unlikely-instrumentals");
        $str344$rbp_parse_filter_unlikely_instrum = SubLObjectFactory.makeString("rbp-parse-filter-unlikely-instrumentals had to punt");
        $str345$rbp_parse_filter_subcollection_ar = SubLObjectFactory.makeString("rbp-parse-filter-subcollection-args");
        $kw346$OBJ = SubLObjectFactory.makeKeyword("OBJ");
        $str347$statistically_unlikely_object = SubLObjectFactory.makeString("statistically unlikely object");
        $sym348$RBP_UNLIKELY_SUBCOLLECTION_NAUT_ = SubLObjectFactory.makeSymbol("RBP-UNLIKELY-SUBCOLLECTION-NAUT?");
        $sym349$_RBP_UNLIKELY_SUBCOLLECTION_NAUT__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*RBP-UNLIKELY-SUBCOLLECTION-NAUT?-CACHING-STATE*");
        $int350$64 = SubLObjectFactory.makeInteger(64);
        $list351 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic")));
        $const352$adjStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("adjStrings"));
        $sym353$PARSE_AS_DENOT_OR_NOUN_COMPOUND = SubLObjectFactory.makeSymbol("PARSE-AS-DENOT-OR-NOUN-COMPOUND");
        $sym354$PARSE_DEVERBAL_COMPOUND_AS_FALLBACK = SubLObjectFactory.makeSymbol("PARSE-DEVERBAL-COMPOUND-AS-FALLBACK");
        $sym355$PARSE_STRING_AS_DATE_FALLBACK_ESCALATED = SubLObjectFactory.makeSymbol("PARSE-STRING-AS-DATE-FALLBACK-ESCALATED");
        $sym356$PARSE_ADJ_INITIAL_COMPOUND = SubLObjectFactory.makeSymbol("PARSE-ADJ-INITIAL-COMPOUND");
        $const357$Collection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"));
        $kw358$XML = SubLObjectFactory.makeKeyword("XML");
        $str359$No_mode_specified_for_initialize_ = SubLObjectFactory.makeString("No mode specified for initialize-ncs-formats");
        $kw360$INVESTIGATING = SubLObjectFactory.makeKeyword("INVESTIGATING");
        $str361$investigating___D__A_____ = SubLObjectFactory.makeString("investigating #~D ~A...~%");
        $kw362$PRINT_ME = SubLObjectFactory.makeKeyword("PRINT-ME");
        $str363$parse_of__S_yielded___ = SubLObjectFactory.makeString("parse of ~S yielded:~%");
        $kw364$FLAG_BAD_PILE = SubLObjectFactory.makeKeyword("FLAG-BAD-PILE");
        $str365$______and_also________ = SubLObjectFactory.makeString("..... and also .....~%");
        $kw366$DENOTS = SubLObjectFactory.makeKeyword("DENOTS");
        $str367$____denots_are__A__ = SubLObjectFactory.makeString("... denots are ~A~%");
        $kw368$BREAK = SubLObjectFactory.makeKeyword("BREAK");
        $str369$________________________________ = SubLObjectFactory.makeString("==============================~%");
        $kw370$COUNT_WITH_PARSES = SubLObjectFactory.makeKeyword("COUNT-WITH-PARSES");
        $str371$__Total_compounds_with_any_parses = SubLObjectFactory.makeString("~%Total compounds with any parses: ~A~%");
        $kw372$ACTUAL_PARSES = SubLObjectFactory.makeKeyword("ACTUAL-PARSES");
        $str373$Total_parses_found___A__ = SubLObjectFactory.makeString("Total parses found: ~A~%");
        $kw374$PERCENT_APPROVED = SubLObjectFactory.makeKeyword("PERCENT-APPROVED");
        $str375$Percent_of_parses_approved___5_2F = SubLObjectFactory.makeString("Percent of parses approved: ~5,2F~%");
        $kw376$TOTAL_VIOLATIONS = SubLObjectFactory.makeKeyword("TOTAL-VIOLATIONS");
        $str377$Total_violations___A__ = SubLObjectFactory.makeString("Total violations: ~A~%");
        $kw378$TO_CONSTANTS = SubLObjectFactory.makeKeyword("TO-CONSTANTS");
        $str379$Note___A_parses_reformulated_to_c = SubLObjectFactory.makeString("Note: ~A parses reformulated to constants~%");
        $kw380$DENOTS_WANTED = SubLObjectFactory.makeKeyword("DENOTS-WANTED");
        $str381$Compounds_wanting_denots___A_____ = SubLObjectFactory.makeString("Compounds wanting denots: ~A~%... having any: ~A~%... total: ~A~%");
        $kw382$RULES_AND_PARSE = SubLObjectFactory.makeKeyword("RULES-AND-PARSE");
        $str383$from__S___A__ = SubLObjectFactory.makeString("from ~S: ~A~%");
        $kw384$FALLBACK_AND_PARSE = SubLObjectFactory.makeKeyword("FALLBACK-AND-PARSE");
        $str385$_A_A__ = SubLObjectFactory.makeString("~A~A~%");
        $kw386$LABEL = SubLObjectFactory.makeKeyword("LABEL");
        $str387$_A__ = SubLObjectFactory.makeString("~A: ");
        $kw388$RULE_USES = SubLObjectFactory.makeKeyword("RULE-USES");
        $str389$Uses_of__A___A_total___A_good___A = SubLObjectFactory.makeString("Uses of ~A: ~A total, ~A good, ~A bad~%");
        $list390 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("CAT"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("FORMAT-AND-ARGS"));
        $sym391$FORMAT = SubLObjectFactory.makeSymbol("FORMAT");
        $sym392$NCS_FORMAT = SubLObjectFactory.makeSymbol("NCS-FORMAT");
        $kw393$STDOUT = SubLObjectFactory.makeKeyword("STDOUT");
        $int394$100000 = SubLObjectFactory.makeInteger(100000);
        $str395$_cyc_departments_nl_doc_stats_src = SubLObjectFactory.makeString("/cyc/departments/nl/doc/stats/src/acquaint-10000");
        $str396$_cyc_departments_nl_doc_stats_kb = SubLObjectFactory.makeString("/cyc/departments/nl/doc/stats/kb");
        $str397$_ = SubLObjectFactory.makeString(".");
        $str398$ = SubLObjectFactory.makeString("");
        $str399$_ = SubLObjectFactory.makeString("-");
        $str400$_ncr_stats = SubLObjectFactory.makeString(".ncr.stats");
        $kw401$DIRECTION = SubLObjectFactory.makeKeyword("DIRECTION");
        $kw402$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $kw403$IF_DOES_NOT_EXIST = SubLObjectFactory.makeKeyword("IF-DOES-NOT-EXIST");
        $kw404$CREATE = SubLObjectFactory.makeKeyword("CREATE");
        $str405$Couldn_t_open_output_stream__woul = SubLObjectFactory.makeString("Couldn't open output stream, would be ~A");
        $str406$would_print_to__S__ = SubLObjectFactory.makeString("would print to ~S~%");
        $str407$storing_results_in__S__cutoff_is_ = SubLObjectFactory.makeString("storing results in ~S, cutoff is ~A~%");
        $kw408$ON = SubLObjectFactory.makeKeyword("ON");
        $kw409$EOF = SubLObjectFactory.makeKeyword("EOF");
        $kw410$NOUN = SubLObjectFactory.makeKeyword("NOUN");
        $str411$from_fallback = SubLObjectFactory.makeString("from fallback");
        $int412$100 = SubLObjectFactory.makeInteger(100);
        $list413 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("RULE"), (SubLObject)SubLObjectFactory.makeSymbol("TOTAL-USES"));
        $str414$_cyc_projects_daml_call_thesaurus = SubLObjectFactory.makeString("/cyc/projects/daml/call-thesaurus/parses.txt");
        $str415$_ = SubLObjectFactory.makeString("\"");
        $str416$_ = SubLObjectFactory.makeString("(");
        $str417$skipping__A______ = SubLObjectFactory.makeString("skipping ~A ...  ");
        $str418$investigating__A______ = SubLObjectFactory.makeString("investigating ~A ...~%");
        $kw419$OFF = SubLObjectFactory.makeKeyword("OFF");
        $str420$_S_______________________________ = SubLObjectFactory.makeString("~S~%==============================~%");
        $str421$found_something_for__A_of__A_entr = SubLObjectFactory.makeString("found something for ~A of ~A entries, ignoring aircraft models");
        $list422 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym423$PCOND = SubLObjectFactory.makeSymbol("PCOND");
        $sym424$FIND_CONSTANT = SubLObjectFactory.makeSymbol("FIND-CONSTANT");
        $sym425$_RBP_SHOW_SUCCESSFUL_RULES__ = SubLObjectFactory.makeSymbol("*RBP-SHOW-SUCCESSFUL-RULES?*");
        $sym426$WARN = SubLObjectFactory.makeSymbol("WARN");
        $str427$Skipping_this_test_as__A_doesn_t_ = SubLObjectFactory.makeString("Skipping this test as ~A doesn't exist in the KB");
    }
    
    public static final class $noun_compound_parse_native extends SubLStructNative
    {
        public SubLObject $unique_id;
        public SubLObject $input_string;
        public SubLObject $input_strings;
        public SubLObject $chart;
        private static final SubLStructDeclNative structDecl;
        
        public $noun_compound_parse_native() {
            this.$unique_id = (SubLObject)CommonSymbols.NIL;
            this.$input_string = (SubLObject)CommonSymbols.NIL;
            this.$input_strings = (SubLObject)CommonSymbols.NIL;
            this.$chart = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$noun_compound_parse_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$unique_id;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$input_string;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$input_strings;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$chart;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$unique_id = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$input_string = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$input_strings = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$chart = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$noun_compound_parse_native.class, noun_compound_parser.$sym4$NOUN_COMPOUND_PARSE, noun_compound_parser.$sym5$NOUN_COMPOUND_PARSE_P, noun_compound_parser.$list6, noun_compound_parser.$list7, new String[] { "$unique_id", "$input_string", "$input_strings", "$chart" }, noun_compound_parser.$list8, noun_compound_parser.$list9, noun_compound_parser.$sym10$PPRINT_NC_PARSE);
        }
    }
    
    public static final class $noun_compound_parse_p$UnaryFunction extends UnaryFunction
    {
        public $noun_compound_parse_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("NOUN-COMPOUND-PARSE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return noun_compound_parser.noun_compound_parse_p(arg1);
        }
    }
    
    public static final class $noun_compound_block_native extends SubLStructNative
    {
        public SubLObject $unique_id;
        public SubLObject $span_index;
        public SubLObject $confidence;
        public SubLObject $denot;
        public SubLObject $filters;
        public SubLObject $spanned_string;
        public SubLObject $head;
        public SubLObject $head_pos;
        public SubLObject $head_string_pred;
        public SubLObject $sub_tree;
        public SubLObject $plist;
        private static final SubLStructDeclNative structDecl;
        
        public $noun_compound_block_native() {
            this.$unique_id = (SubLObject)CommonSymbols.NIL;
            this.$span_index = (SubLObject)CommonSymbols.NIL;
            this.$confidence = (SubLObject)CommonSymbols.NIL;
            this.$denot = (SubLObject)CommonSymbols.NIL;
            this.$filters = (SubLObject)CommonSymbols.NIL;
            this.$spanned_string = (SubLObject)CommonSymbols.NIL;
            this.$head = (SubLObject)CommonSymbols.NIL;
            this.$head_pos = (SubLObject)CommonSymbols.NIL;
            this.$head_string_pred = (SubLObject)CommonSymbols.NIL;
            this.$sub_tree = (SubLObject)CommonSymbols.NIL;
            this.$plist = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$noun_compound_block_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$unique_id;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$span_index;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$confidence;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$denot;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$filters;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$spanned_string;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$head;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$head_pos;
        }
        
        @Override
		public SubLObject getField10() {
            return this.$head_string_pred;
        }
        
        @Override
		public SubLObject getField11() {
            return this.$sub_tree;
        }
        
        @Override
		public SubLObject getField12() {
            return this.$plist;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$unique_id = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$span_index = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$confidence = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$denot = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$filters = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$spanned_string = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$head = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$head_pos = value;
        }
        
        @Override
		public SubLObject setField10(final SubLObject value) {
            return this.$head_string_pred = value;
        }
        
        @Override
		public SubLObject setField11(final SubLObject value) {
            return this.$sub_tree = value;
        }
        
        @Override
		public SubLObject setField12(final SubLObject value) {
            return this.$plist = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$noun_compound_block_native.class, noun_compound_parser.$sym39$NOUN_COMPOUND_BLOCK, noun_compound_parser.$sym40$NOUN_COMPOUND_BLOCK_P, noun_compound_parser.$list41, noun_compound_parser.$list42, new String[] { "$unique_id", "$span_index", "$confidence", "$denot", "$filters", "$spanned_string", "$head", "$head_pos", "$head_string_pred", "$sub_tree", "$plist" }, noun_compound_parser.$list43, noun_compound_parser.$list44, noun_compound_parser.$sym45$PPRINT_NC_BLOCK);
        }
    }
    
    public static final class $noun_compound_block_p$UnaryFunction extends UnaryFunction
    {
        public $noun_compound_block_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("NOUN-COMPOUND-BLOCK-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return noun_compound_parser.noun_compound_block_p(arg1);
        }
    }
    
    public static final class $date_parse_block_native extends SubLStructNative
    {
        public SubLObject $subcol_naut;
        public SubLObject $confidence;
        private static final SubLStructDeclNative structDecl;
        
        public $date_parse_block_native() {
            this.$subcol_naut = (SubLObject)CommonSymbols.NIL;
            this.$confidence = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$date_parse_block_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$subcol_naut;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$confidence;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$subcol_naut = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$confidence = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$date_parse_block_native.class, noun_compound_parser.$sym284$DATE_PARSE_BLOCK, noun_compound_parser.$sym285$DATE_PARSE_BLOCK_P, noun_compound_parser.$list286, noun_compound_parser.$list287, new String[] { "$subcol_naut", "$confidence" }, noun_compound_parser.$list288, noun_compound_parser.$list289, noun_compound_parser.$sym290$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $date_parse_block_p$UnaryFunction extends UnaryFunction
    {
        public $date_parse_block_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("DATE-PARSE-BLOCK-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return noun_compound_parser.date_parse_block_p(arg1);
        }
    }
}

/*

	Total time: 2353 ms
	 synthetic 
*/