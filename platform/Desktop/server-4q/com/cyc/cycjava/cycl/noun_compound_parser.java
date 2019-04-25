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

public final class noun_compound_parser
    extends
      SubLTranslatedFile
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
  public static SubLObject add_nc_rule_constraint(final SubLObject argument, final SubLObject assertion)
  {
    clear_inter_constraints_from_rule();
    rbp_rule_bank.clear_noun_compound_constraint_string_specs();
    pph_noun_compound.clear_pph_nc_rule_list();
    return rbp_rule_bank.rbp_clear_rule_bank();
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 1428L)
  public static SubLObject remove_nc_rule_constraint(final SubLObject argument, final SubLObject assertion)
  {
    clear_inter_constraints_from_rule();
    pph_noun_compound.clear_pph_nc_rule_list();
    return rbp_rule_bank.rbp_clear_rule_bank();
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 1653L)
  public static SubLObject add_nc_rule_template(final SubLObject argument, final SubLObject assertion)
  {
    clear_inter_constraints_from_rule();
    return rbp_rule_bank.rbp_clear_rule_bank();
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 1902L)
  public static SubLObject remove_nc_rule_template(final SubLObject argument, final SubLObject assertion)
  {
    clear_inter_constraints_from_rule();
    return rbp_rule_bank.rbp_clear_rule_bank();
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 2095L)
  public static SubLObject noun_compound_parse_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    pprint_nc_parse( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 2095L)
  public static SubLObject noun_compound_parse_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $noun_compound_parse_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 2095L)
  public static SubLObject nc_parse_unique_id(final SubLObject v_object)
  {
    assert NIL != noun_compound_parse_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 2095L)
  public static SubLObject nc_parse_input_string(final SubLObject v_object)
  {
    assert NIL != noun_compound_parse_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 2095L)
  public static SubLObject nc_parse_input_strings(final SubLObject v_object)
  {
    assert NIL != noun_compound_parse_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 2095L)
  public static SubLObject nc_parse_chart(final SubLObject v_object)
  {
    assert NIL != noun_compound_parse_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 2095L)
  public static SubLObject _csetf_nc_parse_unique_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != noun_compound_parse_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 2095L)
  public static SubLObject _csetf_nc_parse_input_string(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != noun_compound_parse_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 2095L)
  public static SubLObject _csetf_nc_parse_input_strings(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != noun_compound_parse_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 2095L)
  public static SubLObject _csetf_nc_parse_chart(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != noun_compound_parse_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 2095L)
  public static SubLObject make_noun_compound_parse(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $noun_compound_parse_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw21$UNIQUE_ID ) )
      {
        _csetf_nc_parse_unique_id( v_new, current_value );
      }
      else if( pcase_var.eql( $kw22$INPUT_STRING ) )
      {
        _csetf_nc_parse_input_string( v_new, current_value );
      }
      else if( pcase_var.eql( $kw23$INPUT_STRINGS ) )
      {
        _csetf_nc_parse_input_strings( v_new, current_value );
      }
      else if( pcase_var.eql( $kw24$CHART ) )
      {
        _csetf_nc_parse_chart( v_new, current_value );
      }
      else
      {
        Errors.error( $str25$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 2095L)
  public static SubLObject visit_defstruct_noun_compound_parse(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw26$BEGIN, $sym27$MAKE_NOUN_COMPOUND_PARSE, FOUR_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw28$SLOT, $kw21$UNIQUE_ID, nc_parse_unique_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw28$SLOT, $kw22$INPUT_STRING, nc_parse_input_string( obj ) );
    Functions.funcall( visitor_fn, obj, $kw28$SLOT, $kw23$INPUT_STRINGS, nc_parse_input_strings( obj ) );
    Functions.funcall( visitor_fn, obj, $kw28$SLOT, $kw24$CHART, nc_parse_chart( obj ) );
    Functions.funcall( visitor_fn, obj, $kw29$END, $sym27$MAKE_NOUN_COMPOUND_PARSE, FOUR_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 2095L)
  public static SubLObject visit_defstruct_object_noun_compound_parse_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_noun_compound_parse( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 2496L)
  public static SubLObject pprint_nc_parse(final SubLObject nc_parse, SubLObject stream, SubLObject depth)
  {
    if( stream == UNPROVIDED )
    {
      stream = NIL;
    }
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    PrintLow.format( stream, $str32$____NC_PARSE__ID___S__, nc_parse_unique_id( nc_parse ) );
    PrintLow.format( stream, $str33$__Input_string___S__, nc_parse_input_string( nc_parse ) );
    PrintLow.format( stream, $str34$_Input_strings___S__, nc_parse_input_strings( nc_parse ) );
    PrintLow.format( stream, $str35$_________Chart___S__, nc_parse_chart( nc_parse ) );
    return nc_parse;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 2887L)
  public static SubLObject new_nc_parse(SubLObject input_string)
  {
    if( input_string == UNPROVIDED )
    {
      input_string = NIL;
    }
    final SubLObject parse = make_noun_compound_parse( UNPROVIDED );
    _csetf_nc_parse_unique_id( parse, $nc_parse_id_counter$.getGlobalValue() );
    $nc_parse_id_counter$.setGlobalValue( Numbers.add( $nc_parse_id_counter$.getGlobalValue(), ONE_INTEGER ) );
    _csetf_nc_parse_input_string( parse, input_string );
    return parse;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 3769L)
  public static SubLObject rbp_trace()
  {
    rbp_show_rules();
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 6023L)
  public static SubLObject with_rbp_trace(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym36$CLET, $list37, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 6131L)
  public static SubLObject rbp_untrace()
  {
    rbp_hide_rules();
    rbp_untrace_all_rules();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 6277L)
  public static SubLObject rbp_show_rules()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $rbp_show_successful_rulesP$.setDynamicValue( T, thread );
    return $rbp_show_successful_rulesP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 6390L)
  public static SubLObject rbp_hide_rules()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $rbp_show_successful_rulesP$.setDynamicValue( NIL, thread );
    return $rbp_show_successful_rulesP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 6588L)
  public static SubLObject rbp_traced_rules()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $rbp_traced_rules$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 6698L)
  public static SubLObject rbp_trace_rule(final SubLObject rule_cycl)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    rbp_rule_bank.rbp_rb_check_initialization();
    final SubLObject rule = rbp_rule_bank.rbp_find_rule_from_cycl( rule_cycl, UNPROVIDED );
    if( NIL != rbp_rule_bank.recursive_block_parser_rule_p( rule ) )
    {
      final SubLObject item_var = rule;
      if( NIL == conses_high.member( item_var, $rbp_traced_rules$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        $rbp_traced_rules$.setDynamicValue( ConsesLow.cons( item_var, $rbp_traced_rules$.getDynamicValue( thread ) ), thread );
      }
    }
    return Mapping.mapcar( $sym38$RBP_RULE_CYCL, $rbp_traced_rules$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7033L)
  public static SubLObject rbp_untrace_all_rules()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $rbp_traced_rules$.setDynamicValue( NIL, thread );
    return $rbp_traced_rules$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7163L)
  public static SubLObject rbp_untrace_rule(final SubLObject rule_cycl)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject rule = rbp_rule_bank.rbp_find_rule_from_cycl( rule_cycl, UNPROVIDED );
    $rbp_traced_rules$.setDynamicValue( Sequences.remove( rule, $rbp_traced_rules$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
    return $rbp_traced_rules$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7420L)
  public static SubLObject just_one_spaceP(final SubLObject string)
  {
    return list_utilities.lengthE( string_utilities.split_string( string, UNPROVIDED ), TWO_INTEGER, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
  public static SubLObject noun_compound_block_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    pprint_nc_block( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
  public static SubLObject noun_compound_block_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $noun_compound_block_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
  public static SubLObject nc_block_unique_id(final SubLObject v_object)
  {
    assert NIL != noun_compound_block_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
  public static SubLObject nc_block_span_index(final SubLObject v_object)
  {
    assert NIL != noun_compound_block_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
  public static SubLObject nc_block_confidence(final SubLObject v_object)
  {
    assert NIL != noun_compound_block_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
  public static SubLObject nc_block_denot(final SubLObject v_object)
  {
    assert NIL != noun_compound_block_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
  public static SubLObject nc_block_filters(final SubLObject v_object)
  {
    assert NIL != noun_compound_block_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
  public static SubLObject nc_block_spanned_string(final SubLObject v_object)
  {
    assert NIL != noun_compound_block_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
  public static SubLObject nc_block_head(final SubLObject v_object)
  {
    assert NIL != noun_compound_block_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
  public static SubLObject nc_block_head_pos(final SubLObject v_object)
  {
    assert NIL != noun_compound_block_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
  public static SubLObject nc_block_head_string_pred(final SubLObject v_object)
  {
    assert NIL != noun_compound_block_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
  public static SubLObject nc_block_sub_tree(final SubLObject v_object)
  {
    assert NIL != noun_compound_block_p( v_object ) : v_object;
    return v_object.getField11();
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
  public static SubLObject nc_block_plist(final SubLObject v_object)
  {
    assert NIL != noun_compound_block_p( v_object ) : v_object;
    return v_object.getField12();
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
  public static SubLObject _csetf_nc_block_unique_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != noun_compound_block_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
  public static SubLObject _csetf_nc_block_span_index(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != noun_compound_block_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
  public static SubLObject _csetf_nc_block_confidence(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != noun_compound_block_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
  public static SubLObject _csetf_nc_block_denot(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != noun_compound_block_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
  public static SubLObject _csetf_nc_block_filters(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != noun_compound_block_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
  public static SubLObject _csetf_nc_block_spanned_string(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != noun_compound_block_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
  public static SubLObject _csetf_nc_block_head(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != noun_compound_block_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
  public static SubLObject _csetf_nc_block_head_pos(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != noun_compound_block_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
  public static SubLObject _csetf_nc_block_head_string_pred(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != noun_compound_block_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
  public static SubLObject _csetf_nc_block_sub_tree(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != noun_compound_block_p( v_object ) : v_object;
    return v_object.setField11( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
  public static SubLObject _csetf_nc_block_plist(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != noun_compound_block_p( v_object ) : v_object;
    return v_object.setField12( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
  public static SubLObject make_noun_compound_block(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $noun_compound_block_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw21$UNIQUE_ID ) )
      {
        _csetf_nc_block_unique_id( v_new, current_value );
      }
      else if( pcase_var.eql( $kw70$SPAN_INDEX ) )
      {
        _csetf_nc_block_span_index( v_new, current_value );
      }
      else if( pcase_var.eql( $kw71$CONFIDENCE ) )
      {
        _csetf_nc_block_confidence( v_new, current_value );
      }
      else if( pcase_var.eql( $kw72$DENOT ) )
      {
        _csetf_nc_block_denot( v_new, current_value );
      }
      else if( pcase_var.eql( $kw73$FILTERS ) )
      {
        _csetf_nc_block_filters( v_new, current_value );
      }
      else if( pcase_var.eql( $kw74$SPANNED_STRING ) )
      {
        _csetf_nc_block_spanned_string( v_new, current_value );
      }
      else if( pcase_var.eql( $kw75$HEAD ) )
      {
        _csetf_nc_block_head( v_new, current_value );
      }
      else if( pcase_var.eql( $kw76$HEAD_POS ) )
      {
        _csetf_nc_block_head_pos( v_new, current_value );
      }
      else if( pcase_var.eql( $kw77$HEAD_STRING_PRED ) )
      {
        _csetf_nc_block_head_string_pred( v_new, current_value );
      }
      else if( pcase_var.eql( $kw78$SUB_TREE ) )
      {
        _csetf_nc_block_sub_tree( v_new, current_value );
      }
      else if( pcase_var.eql( $kw79$PLIST ) )
      {
        _csetf_nc_block_plist( v_new, current_value );
      }
      else
      {
        Errors.error( $str25$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
  public static SubLObject visit_defstruct_noun_compound_block(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw26$BEGIN, $sym80$MAKE_NOUN_COMPOUND_BLOCK, ELEVEN_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw28$SLOT, $kw21$UNIQUE_ID, nc_block_unique_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw28$SLOT, $kw70$SPAN_INDEX, nc_block_span_index( obj ) );
    Functions.funcall( visitor_fn, obj, $kw28$SLOT, $kw71$CONFIDENCE, nc_block_confidence( obj ) );
    Functions.funcall( visitor_fn, obj, $kw28$SLOT, $kw72$DENOT, nc_block_denot( obj ) );
    Functions.funcall( visitor_fn, obj, $kw28$SLOT, $kw73$FILTERS, nc_block_filters( obj ) );
    Functions.funcall( visitor_fn, obj, $kw28$SLOT, $kw74$SPANNED_STRING, nc_block_spanned_string( obj ) );
    Functions.funcall( visitor_fn, obj, $kw28$SLOT, $kw75$HEAD, nc_block_head( obj ) );
    Functions.funcall( visitor_fn, obj, $kw28$SLOT, $kw76$HEAD_POS, nc_block_head_pos( obj ) );
    Functions.funcall( visitor_fn, obj, $kw28$SLOT, $kw77$HEAD_STRING_PRED, nc_block_head_string_pred( obj ) );
    Functions.funcall( visitor_fn, obj, $kw28$SLOT, $kw78$SUB_TREE, nc_block_sub_tree( obj ) );
    Functions.funcall( visitor_fn, obj, $kw28$SLOT, $kw79$PLIST, nc_block_plist( obj ) );
    Functions.funcall( visitor_fn, obj, $kw29$END, $sym80$MAKE_NOUN_COMPOUND_BLOCK, ELEVEN_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 7505L)
  public static SubLObject visit_defstruct_object_noun_compound_block_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_noun_compound_block( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 8152L)
  public static SubLObject nc_block_plist_lookup(final SubLObject block, final SubLObject property, SubLObject v_default)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = NIL;
    }
    assert NIL != noun_compound_block_p( block ) : block;
    return conses_high.getf( nc_block_plist( block ), property, v_default );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 8372L)
  public static SubLObject nc_block_plist_set(final SubLObject block, final SubLObject property, final SubLObject value)
  {
    assert NIL != noun_compound_block_p( block ) : block;
    _csetf_nc_block_plist( block, conses_high.putf( nc_block_plist( block ), property, value ) );
    return nc_block_plist_lookup( block, property, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 8655L)
  public static SubLObject nc_block_wu(final SubLObject block)
  {
    return nc_block_plist_lookup( block, $kw82$WU, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 8739L)
  public static SubLObject nc_block_set_wu(final SubLObject block, final SubLObject wu)
  {
    return nc_block_plist_set( block, $kw82$WU, wu );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 8826L)
  public static SubLObject nc_block_rule(final SubLObject block)
  {
    return nc_block_sub_tree( block ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 8906L)
  public static SubLObject nc_block_mod_block(final SubLObject block, SubLObject block_hash)
  {
    if( block_hash == UNPROVIDED )
    {
      block_hash = NIL;
    }
    SubLObject ans = conses_high.second( nc_block_sub_tree( block ) );
    if( NIL != block_hash )
    {
      ans = rbp_chart_parser.rbp_chart_block_hash_lookup( ans, block_hash );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 9124L)
  public static SubLObject nc_block_head_block(final SubLObject block, SubLObject block_hash)
  {
    if( block_hash == UNPROVIDED )
    {
      block_hash = NIL;
    }
    SubLObject ans = conses_high.third( nc_block_sub_tree( block ) );
    if( NIL != block_hash )
    {
      ans = rbp_chart_parser.rbp_chart_block_hash_lookup( ans, block_hash );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 9342L)
  public static SubLObject nc_block_rule_count(final SubLObject block, final SubLObject block_hash)
  {
    if( NIL == noun_compound_block_p( block ) )
    {
      return ZERO_INTEGER;
    }
    if( NIL == nc_block_rule( block ) )
    {
      return ZERO_INTEGER;
    }
    return Numbers.add( nc_block_rule_count( nc_block_mod_block( block, block_hash ), block_hash ), nc_block_rule_count( nc_block_head_block( block, block_hash ), block_hash ), ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 9955L)
  public static SubLObject pprint_nc_block(final SubLObject block, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str84$__NCB__S___S__S_, new SubLObject[] { nc_block_unique_id( block ), nc_block_spanned_string( block ), nc_block_head_string_pred( block )
    } );
    return block;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 10654L)
  public static SubLObject new_noun_compound_block(final SubLObject num1, final SubLObject num2, final SubLObject confidence, final SubLObject string, SubLObject wu, SubLObject head_fort, SubLObject denot,
      SubLObject head_pos, SubLObject pred, SubLObject sub_tree)
  {
    if( wu == UNPROVIDED )
    {
      wu = NIL;
    }
    if( head_fort == UNPROVIDED )
    {
      head_fort = NIL;
    }
    if( denot == UNPROVIDED )
    {
      denot = NIL;
    }
    if( head_pos == UNPROVIDED )
    {
      head_pos = NIL;
    }
    if( pred == UNPROVIDED )
    {
      pred = NIL;
    }
    if( sub_tree == UNPROVIDED )
    {
      sub_tree = NIL;
    }
    final SubLObject block = make_noun_compound_block( UNPROVIDED );
    $nc_block_unique_id_counter$.setGlobalValue( Numbers.add( $nc_block_unique_id_counter$.getGlobalValue(), ONE_INTEGER ) );
    _csetf_nc_block_unique_id( block, $nc_block_unique_id_counter$.getGlobalValue() );
    _csetf_nc_block_span_index( block, interval_span.get_interval_span( num1, num2 ) );
    _csetf_nc_block_confidence( block, confidence );
    _csetf_nc_block_denot( block, denot );
    _csetf_nc_block_spanned_string( block, string );
    _csetf_nc_block_head( block, head_fort );
    _csetf_nc_block_head_pos( block, head_pos );
    _csetf_nc_block_head_string_pred( block, pred );
    _csetf_nc_block_sub_tree( block, sub_tree );
    nc_block_set_wu( block, wu );
    return block;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 11778L)
  public static SubLObject inference_new_noun_compound_block(final SubLObject num1, final SubLObject num2, final SubLObject confidence, final SubLObject string, SubLObject wu, SubLObject head_fort, SubLObject denot,
      SubLObject head_pos, SubLObject pred, SubLObject sub_tree)
  {
    if( wu == UNPROVIDED )
    {
      wu = NIL;
    }
    if( head_fort == UNPROVIDED )
    {
      head_fort = NIL;
    }
    if( denot == UNPROVIDED )
    {
      denot = NIL;
    }
    if( head_pos == UNPROVIDED )
    {
      head_pos = NIL;
    }
    if( pred == UNPROVIDED )
    {
      pred = NIL;
    }
    if( sub_tree == UNPROVIDED )
    {
      sub_tree = NIL;
    }
    return new_noun_compound_block( num1, num2, confidence, string, wu, head_fort, denot, head_pos, pred, sub_tree );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 13164L)
  public static SubLObject combine_noun_compound_blocks_internal(final SubLObject block1, final SubLObject block2, final SubLObject block_hash)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == rbp_adj_blockP( block1 ) && NIL != rbp_adj_modified_blockP( block2, block_hash ) )
    {
      return NIL;
    }
    final SubLObject span1 = nc_block_span_index( block1 );
    final SubLObject span2 = nc_block_span_index( block2 );
    final SubLObject beg1 = interval_span.interval_span_start( span1 );
    final SubLObject end1 = interval_span.interval_span_end( span1 );
    final SubLObject beg2 = interval_span.interval_span_start( span2 );
    final SubLObject end2 = interval_span.interval_span_end( span2 );
    SubLObject new_blocks = NIL;
    if( !end1.numE( beg2 ) )
    {
      return NIL;
    }
    if( NIL != number_utilities.potentially_infinite_number_L( parsing_vars.$npp_max_rules_per_compound$.getDynamicValue( thread ), number_utilities.positive_infinity() ) )
    {
      final SubLObject input_spannerP = Equality.eq( rbp_chart_parser.rbp_chart_max_span( UNPROVIDED ), interval_span.get_interval_span( beg1, end2 ) );
      final SubLObject new_min_rule_count = Numbers.add( nc_block_rule_count( block1, block_hash ), nc_block_rule_count( block2, block_hash ), ( NIL != input_spannerP ) ? ZERO_INTEGER : ONE_INTEGER );
      if( !new_min_rule_count.numL( parsing_vars.$npp_max_rules_per_compound$.getDynamicValue( thread ) ) )
      {
        return NIL;
      }
    }
    final SubLObject string1 = nc_block_spanned_string( block1 );
    final SubLObject string2 = nc_block_spanned_string( block2 );
    SubLObject cdolist_list_var;
    final SubLObject raw_parses = cdolist_list_var = rbp_rb_combine_noun_compound_blocks( block1, block2 );
    SubLObject parse = NIL;
    parse = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = parse;
      SubLObject rule = NIL;
      SubLObject denot = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list87 );
      rule = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list87 );
      denot = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject rule_confidence = $float83$0_5;
        SubLObject confidence = Numbers.multiply( rule_confidence, nc_block_confidence( block1 ), nc_block_confidence( block2 ) );
        final SubLObject new_string = Sequences.cconcatenate( string1, new SubLObject[] { $str88$_, string2
        } );
        final SubLObject head_fort = nc_block_head( block2 );
        final SubLObject head_pos = nc_block_head_pos( block2 );
        final SubLObject head_pos_pred = nc_block_head_string_pred( block2 );
        final SubLObject sub_tree = ConsesLow.list( rule, nc_block_unique_id( block1 ), nc_block_unique_id( block2 ) );
        if( NIL != forts.fort_p( denot ) )
        {
          confidence = Numbers.multiply( confidence, $float89$1_1 );
        }
        final SubLObject wu = NIL;
        final SubLObject new_block = new_noun_compound_block( beg1, end2, confidence, new_string, wu, head_fort, denot, head_pos, head_pos_pred, sub_tree );
        new_blocks = ConsesLow.cons( new_block, new_blocks );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list87 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      parse = cdolist_list_var.first();
    }
    return new_blocks;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 13164L)
  public static SubLObject combine_noun_compound_blocks(final SubLObject block1, final SubLObject block2, final SubLObject block_hash)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return combine_noun_compound_blocks_internal( block1, block2, block_hash );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym86$COMBINE_NOUN_COMPOUND_BLOCKS, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym86$COMBINE_NOUN_COMPOUND_BLOCKS, THREE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym86$COMBINE_NOUN_COMPOUND_BLOCKS, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( block1, block2, block_hash );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( block1.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( block2.eql( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && block_hash.eql( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( combine_noun_compound_blocks_internal( block1, block2, block_hash ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( block1, block2, block_hash ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 16188L)
  public static SubLObject token_to_blocks(final SubLObject token)
  {
    initialize_rbp_name_cache();
    final SubLObject index_1 = standard_tokenization.interval_token_start( token );
    final SubLObject index_2 = standard_tokenization.interval_token_end( token );
    final SubLObject confidence = ONE_INTEGER;
    final SubLObject entry = standard_tokenization.interval_token_value( token );
    final SubLObject string = standard_tokenization.string_token_string( entry );
    final SubLObject tuples = standard_tokenization.string_token_value( entry );
    SubLObject blocks = ( NIL != tuples ) ? NIL : ConsesLow.list( new_noun_compound_block( index_1, index_2, confidence, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    SubLObject cdolist_list_var = tuples;
    SubLObject tuple = NIL;
    tuple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = tuple;
      SubLObject denot = NIL;
      SubLObject pos = NIL;
      SubLObject pred = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list90 );
      denot = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list90 );
      pos = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list90 );
      pred = current.first();
      current = current.rest();
      final SubLObject wu = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list90 );
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject denot_fort = function_terms.naut_to_nart( denot );
        final SubLObject v_new = new_noun_compound_block( index_1, index_2, confidence, string, wu, denot_fort, denot_fort, pos, pred, UNPROVIDED );
        if( NIL != rbp_ok_blockP( v_new ) )
        {
          blocks = ConsesLow.cons( v_new, blocks );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list90 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      tuple = cdolist_list_var.first();
    }
    return rbp_filter_redundant_blocks( blocks );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 17209L)
  public static SubLObject rbp_adj_blockP(final SubLObject block)
  {
    final SubLObject pos = nc_block_head_pos( block );
    return ( NIL != pos ) ? rbp_wff.npp_genlP( pos, $const91$Adjective, UNPROVIDED ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 17397L)
  public static SubLObject rbp_adj_modified_blockP(final SubLObject block, final SubLObject block_hash)
  {
    final SubLObject mod_dtr_id = nc_block_mod_block( block, block_hash );
    final SubLObject mod_dtr = rbp_chart_parser.rbp_chart_block_hash_lookup( mod_dtr_id, block_hash );
    final SubLObject mod_dtr_pos = ( NIL != mod_dtr ) ? nc_block_head_pos( mod_dtr ) : NIL;
    return ( NIL != mod_dtr_pos ) ? rbp_wff.npp_genlP( mod_dtr_pos, $const91$Adjective, UNPROVIDED ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 17789L)
  public static SubLObject rbp_base_from_block(final SubLObject block, final SubLObject c_type)
  {
    if( NIL != rbp_rule_bank.rbp_semantic_constraint_type_p( c_type ) )
    {
      return nc_block_denot( block );
    }
    return Functions.funcall( rbp_candidate_fn_for_con_kw( c_type ), block );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 22998L)
  public static SubLObject rbp_apply_filter_cluster(final SubLObject filters_in_cluster, final SubLObject filter_type, final SubLObject parses, SubLObject accessor, SubLObject old_violations, SubLObject violations_limit)
  {
    if( accessor == UNPROVIDED )
    {
      accessor = Symbols.symbol_function( IDENTITY );
    }
    if( old_violations == UNPROVIDED )
    {
      old_violations = $sym56$NC_BLOCK_FILTERS;
    }
    if( violations_limit == UNPROVIDED )
    {
      violations_limit = parsing_vars.$rbp_filter_violations_limit$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != violations_limit && !assertionsDisabledInClass && NIL == subl_promotions.positive_integer_p( violations_limit ) )
    {
      throw new AssertionError( violations_limit );
    }
    final SubLObject failures = dictionary.new_dictionary( EQUALP, UNPROVIDED );
    final SubLObject multipliers = dictionary.new_dictionary( EQL, UNPROVIDED );
    final SubLObject still_checking = set.new_set( EQUALP, Sequences.length( parses ) );
    SubLObject cdolist_list_var = parses;
    SubLObject block = NIL;
    block = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( old_violations.eql( $kw97$NONE ) || old_violations.eql( $kw98$SKIP ) )
      {
        set.set_add( block, still_checking );
      }
      else
      {
        dictionary.dictionary_enter( failures, block, Functions.funcall( old_violations, block ) );
        dictionary.dictionary_enter( multipliers, block, ONE_INTEGER );
        if( NIL == list_utilities.lengthGE( Functions.funcall( old_violations, block ), violations_limit, UNPROVIDED ) )
        {
          set.set_add( block, still_checking );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      block = cdolist_list_var.first();
    }
    cdolist_list_var = filters_in_cluster;
    SubLObject filter = NIL;
    filter = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject remaining_parses = set.set_element_list( still_checking );
      SubLObject cdolist_list_var_$1;
      final SubLObject failure_list = cdolist_list_var_$1 = ( filter_type.eql( $kw99$BOOLEAN ) ? parsing_utilities.apply_boolean_parsing_filter( remaining_parses, filter, accessor, UNPROVIDED )
          : parsing_utilities.apply_macroscopic_parsing_filter( remaining_parses, filter, accessor, UNPROVIDED ) );
      SubLObject failure = NIL;
      failure = cdolist_list_var_$1.first();
      while ( NIL != cdolist_list_var_$1)
      {
        SubLObject reason = NIL;
        SubLObject mult = NIL;
        SubLObject current;
        final SubLObject datum = current = failure;
        SubLObject block2 = NIL;
        SubLObject diagnostics = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
        block2 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
        diagnostics = current.first();
        current = current.rest();
        if( NIL == current )
        {
          if( NIL != list_utilities.proper_list_p( diagnostics ) )
          {
            thread.resetMultipleValues();
            final SubLObject reason_$2 = diagnostics;
            final SubLObject mult_$3 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            reason = reason_$2;
            mult = mult_$3;
            if( mult.isKeyword() )
            {
              mult = NIL;
            }
          }
          else if( NIL != diagnostics )
          {
            reason = diagnostics;
          }
          if( NIL == mult || mult.isKeyword() )
          {
            mult = $rbp_default_confidence_multiplier_for_failing_a_filter$.getDynamicValue( thread );
          }
          if( NIL != reason )
          {
            final SubLObject known_violations = dictionary.dictionary_lookup( failures, block2, UNPROVIDED );
            if( NIL == subl_promotions.memberP( reason, known_violations, EQUAL, UNPROVIDED ) )
            {
              dictionary_utilities.dictionary_push( failures, block2, reason );
              dictionary.dictionary_enter( multipliers, block2, Numbers.multiply( mult, dictionary.dictionary_lookup( multipliers, block2, UNPROVIDED ) ) );
              if( NIL != list_utilities.lengthGE( dictionary.dictionary_lookup( failures, block2, UNPROVIDED ), violations_limit, UNPROVIDED ) )
              {
                if( NIL != subl_promotions.memberP( nc_block_rule( block2 ), rbp_traced_rules(), UNPROVIDED, UNPROVIDED ) )
                {
                  Errors.warn( $str101$Abandoning_parse__S_for__S, nc_block_denot( block2 ), nc_block_spanned_string( block2 ) );
                }
                set.set_remove( block2, still_checking );
              }
            }
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list100 );
        }
        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
        failure = cdolist_list_var_$1.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      filter = cdolist_list_var.first();
    }
    SubLObject triples = NIL;
    SubLObject cdolist_list_var2 = parses;
    SubLObject block3 = NIL;
    block3 = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      triples = ConsesLow.cons( ConsesLow.list( block3, dictionary.dictionary_lookup( failures, block3, UNPROVIDED ), dictionary.dictionary_lookup( multipliers, block3, UNPROVIDED ) ), triples );
      cdolist_list_var2 = cdolist_list_var2.rest();
      block3 = cdolist_list_var2.first();
    }
    return Sequences.reverse( triples );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 25818L)
  public static SubLObject rbp_process_filter_clusters(final SubLObject clusters, final SubLObject blocks, SubLObject filter_type)
  {
    if( filter_type == UNPROVIDED )
    {
      filter_type = $kw99$BOOLEAN;
    }
    SubLObject cdolist_list_var = clusters;
    SubLObject this_cluster = NIL;
    this_cluster = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$4 = rbp_apply_filter_cluster( this_cluster, filter_type, blocks, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject triple = NIL;
      triple = cdolist_list_var_$4.first();
      while ( NIL != cdolist_list_var_$4)
      {
        SubLObject current;
        final SubLObject datum = current = triple;
        SubLObject block = NIL;
        SubLObject failed_these_filters = NIL;
        SubLObject disconfidence = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list102 );
        block = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list102 );
        failed_these_filters = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list102 );
        disconfidence = current.first();
        current = current.rest();
        if( NIL == current )
        {
          if( NIL != failed_these_filters )
          {
            _csetf_nc_block_filters( block, Sequences.reverse( failed_these_filters ) );
            _csetf_nc_block_confidence( block, Numbers.multiply( disconfidence, nc_block_confidence( block ) ) );
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list102 );
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
  public static SubLObject rbp_parse_wrong_sizeP(final SubLObject block, final SubLObject block_hash)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject component_count = rbp_component_count( block, block_hash );
    return makeBoolean( ( $rbp_minimum_component_count$.getDynamicValue( thread ).isNumber() && component_count.numL( $rbp_minimum_component_count$.getDynamicValue( thread ) ) ) || ( $rbp_maximum_component_count$
        .getDynamicValue( thread ).isNumber() && component_count.numG( $rbp_maximum_component_count$.getDynamicValue( thread ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 27390L)
  public static SubLObject rbp_component_count(final SubLObject block, final SubLObject block_hash)
  {
    final SubLObject sub_tree = nc_block_sub_tree( block );
    if( NIL == sub_tree )
    {
      return ONE_INTEGER;
    }
    final SubLObject dtr1 = rbp_chart_parser.rbp_chart_block_hash_lookup( conses_high.second( sub_tree ), block_hash );
    final SubLObject dtr2 = rbp_chart_parser.rbp_chart_block_hash_lookup( conses_high.third( sub_tree ), block_hash );
    return Numbers.add( rbp_component_count( dtr1, block_hash ), rbp_component_count( dtr2, block_hash ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 27788L)
  public static SubLObject ncp_reporting_metrics(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list103 );
    string = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym104$PROGN, $list105, ConsesLow.list( $sym106$NCP_HERALD_START, string ), ConsesLow.listS( $sym36$CLET, $list107, ConsesLow.listS( $sym108$CTIME, $sym109$TIME, ConsesLow.append( body,
        NIL ) ), $list110 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 28000L)
  public static SubLObject parse_noun_compound(final SubLObject string, SubLObject complete_onlyP, SubLObject num)
  {
    if( complete_onlyP == UNPROVIDED )
    {
      complete_onlyP = T;
    }
    if( num == UNPROVIDED )
    {
      num = $int111$1000;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == rbp_check_initializations() )
    {
      return NIL;
    }
    final SubLObject parse = new_nc_parse( string );
    SubLObject good = NIL;
    SubLObject bad = NIL;
    _csetf_nc_parse_input_strings( parse, rbp_string_tokenize( string ) );
    final SubLObject _prev_bind_0 = $rbp_input_strings$.currentBinding( thread );
    try
    {
      $rbp_input_strings$.bind( nc_parse_input_strings( parse ), thread );
      _csetf_nc_parse_chart( parse, ncp_chart_init( nc_parse_input_strings( parse ), UNPROVIDED ) );
      thread.resetMultipleValues();
      final SubLObject good_$5 = parse_noun_compound_int( parse, complete_onlyP, num, UNPROVIDED );
      final SubLObject bad_$6 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      good = good_$5;
      bad = bad_$6;
    }
    finally
    {
      $rbp_input_strings$.rebind( _prev_bind_0, thread );
    }
    return Values.values( good, bad );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 29277L)
  public static SubLObject parse_noun_compound_with_rules(final SubLObject string, final SubLObject required_rule_forts, SubLObject complete_onlyP, SubLObject num)
  {
    if( complete_onlyP == UNPROVIDED )
    {
      complete_onlyP = T;
    }
    if( num == UNPROVIDED )
    {
      num = $int111$1000;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.listp( required_rule_forts ) : required_rule_forts;
    assert NIL != list_utilities.non_dotted_list_p( required_rule_forts ) : required_rule_forts;
    SubLObject cdolist_list_var = required_rule_forts;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != rbp_rule_fort_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    if( NIL == rbp_check_initializations() )
    {
      return NIL;
    }
    final SubLObject parse = new_nc_parse( string );
    final SubLObject required_rbp_rules = Mapping.mapcar( $sym115$RBP_FIND_RULE_FROM_CYCL, required_rule_forts );
    SubLObject good = NIL;
    SubLObject bad = NIL;
    _csetf_nc_parse_input_strings( parse, rbp_string_tokenize( string ) );
    final SubLObject _prev_bind_0 = $rbp_input_strings$.currentBinding( thread );
    try
    {
      $rbp_input_strings$.bind( nc_parse_input_strings( parse ), thread );
      _csetf_nc_parse_chart( parse, ncp_chart_init( nc_parse_input_strings( parse ), UNPROVIDED ) );
      thread.resetMultipleValues();
      final SubLObject good_$7 = parse_noun_compound_int( parse, complete_onlyP, num, required_rbp_rules );
      final SubLObject bad_$8 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      good = good_$7;
      bad = bad_$8;
    }
    finally
    {
      $rbp_input_strings$.rebind( _prev_bind_0, thread );
    }
    return Values.values( good, bad );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 30187L)
  public static SubLObject rbp_rule_fort_p(final SubLObject v_object)
  {
    return isa.isa_in_any_mtP( v_object, $const116$NounCompoundRule );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 30281L)
  public static SubLObject parse_noun_compound_from_string_tokens(final SubLObject string_tokens, SubLObject complete_onlyP, SubLObject num)
  {
    if( complete_onlyP == UNPROVIDED )
    {
      complete_onlyP = T;
    }
    if( num == UNPROVIDED )
    {
      num = $int111$1000;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject input_strings = NIL;
    SubLObject string_stack = NIL;
    SubLObject cdolist_list_var = string_tokens;
    SubLObject token = NIL;
    token = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject string = standard_tokenization.string_token_string( token );
      if( NIL == string_utilities.non_empty_stringP( string ) )
      {
        return NIL;
      }
      string_stack = ConsesLow.cons( string, string_stack );
      cdolist_list_var = cdolist_list_var.rest();
      token = cdolist_list_var.first();
    }
    input_strings = Sequences.nreverse( string_stack );
    final SubLObject input_string = string_utilities.bunge( input_strings, UNPROVIDED );
    final SubLObject nc_parse = new_nc_parse( input_string );
    _csetf_nc_parse_input_strings( nc_parse, input_strings );
    final SubLObject _prev_bind_0 = $rbp_input_strings$.currentBinding( thread );
    try
    {
      $rbp_input_strings$.bind( nc_parse_input_strings( nc_parse ), thread );
      _csetf_nc_parse_chart( nc_parse, ncp_chart_init_from_string_tokens( string_tokens ) );
    }
    finally
    {
      $rbp_input_strings$.rebind( _prev_bind_0, thread );
    }
    return parse_noun_compound_int( nc_parse, complete_onlyP, num, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 31282L)
  public static SubLObject with_new_ncp_problem_store(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    final SubLObject store = $sym117$STORE;
    return ConsesLow.list( $sym118$WITH_NEW_PROBLEM_STORE, ConsesLow.list( store ), ConsesLow.listS( $sym36$CLET, ConsesLow.list( ConsesLow.list( $sym119$_NCP_PROBLEM_STORE_, store ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 31470L)
  public static SubLObject parse_noun_compound_int(final SubLObject nc_parse, final SubLObject complete_onlyP, final SubLObject num, SubLObject required_rbp_rules)
  {
    if( required_rbp_rules == UNPROVIDED )
    {
      required_rbp_rules = $kw97$NONE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject good = NIL;
    SubLObject bad = NIL;
    final SubLObject _prev_bind_0 = parsing_vars.$rbp_bypass_deverbal_filtersP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $rbp_input_strings$.currentBinding( thread );
    try
    {
      parsing_vars.$rbp_bypass_deverbal_filtersP$.bind( ( NIL != complete_onlyP ) ? parsing_vars.$rbp_bypass_deverbal_filtersP$.getDynamicValue( thread ) : T, thread );
      $rbp_input_strings$.bind( nc_parse_input_strings( nc_parse ), thread );
      SubLObject store = NIL;
      try
      {
        store = inference_datastructures_problem_store.new_problem_store( NIL );
        final SubLObject _prev_bind_0_$9 = $ncp_problem_store$.currentBinding( thread );
        try
        {
          $ncp_problem_store$.bind( store, thread );
          final SubLObject local_state;
          final SubLObject state = local_state = memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          final SubLObject _prev_bind_0_$10 = memoization_state.$memoization_state$.currentBinding( thread );
          try
          {
            memoization_state.$memoization_state$.bind( local_state, thread );
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
            try
            {
              $rbp_rules_to_parses_shadow$.setDynamicValue( NIL, thread );
              ncp_initialize_metrics();
              ncp_herald_start( nc_parse_input_string( nc_parse ) );
              SubLObject time = NIL;
              final SubLObject time_var = Time.get_internal_real_time();
              final SubLObject chart = nc_parse_chart( nc_parse );
              final SubLObject parses = rbp_filter_and_sort_result_blocks( rbp_chart_parser.rbp_chart_parse( chart ), rbp_chart_parser.rbp_chart_block_hash( nc_parse_chart( nc_parse ) ), required_rbp_rules );
              if( NIL != complete_onlyP )
              {
                thread.resetMultipleValues();
                final SubLObject good_pile = display_complete_parses( parses );
                final SubLObject bad_pile = thread.secondMultipleValue();
                thread.resetMultipleValues();
                good = list_utilities.first_n( num, good_pile );
                if( NIL == list_utilities.lengthG( good_pile, num, UNPROVIDED ) )
                {
                  bad = list_utilities.first_n( Numbers.subtract( num, Sequences.length( good_pile ) ), bad_pile );
                }
              }
              else
              {
                good = display_all_parses( nc_parse_chart( nc_parse ) );
              }
              time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
              ncp_report_metrics( time );
            }
            finally
            {
              final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$11, thread );
              }
            }
          }
          finally
          {
            memoization_state.$memoization_state$.rebind( _prev_bind_0_$10, thread );
          }
        }
        finally
        {
          $ncp_problem_store$.rebind( _prev_bind_0_$9, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          inference_datastructures_problem_store.destroy_problem_store( store );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$12, thread );
        }
      }
    }
    finally
    {
      $rbp_input_strings$.rebind( _prev_bind_2, thread );
      parsing_vars.$rbp_bypass_deverbal_filtersP$.rebind( _prev_bind_0, thread );
    }
    return Values.values( good, bad );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 32955L)
  public static SubLObject ncp_initialize_metrics()
  {
    nl_reformulator.nl_ref_reset_metrics();
    rbp_wff.rbp_wff_reset_metrics();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 33097L)
  public static SubLObject ncp_report_metrics(final SubLObject time)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $rbp_report_parse_timeP$.getDynamicValue( thread ) )
    {
      PrintLow.format( T, $str120$__Total_parse_time___4_2F_seconds, time );
      rbp_wff.rbp_wff_report_metrics( T );
      nl_reformulator.nl_ref_report_metrics( T );
      PrintLow.format( T, $str121$__Spent__4_2F_seconds_actually_pa, Numbers.subtract( time, rbp_wff.$rbp_wff_check_time$.getDynamicValue( thread ), nl_reformulator.get_nl_reformulator_time() ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 33467L)
  public static SubLObject ncp_herald_start(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $rbp_report_parse_timeP$.getDynamicValue( thread ) )
    {
      streams_high.terpri( T );
      PrintLow.format( T, $str122$__Now_parsing__S___, string );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 33890L)
  public static SubLObject rbp_sort_blocks_complexity_first(final SubLObject blocks)
  {
    final SubLObject sorted = Sort.sort( Sort.sort( blocks, $sym123$NPP_TERM_COMPLEXITY__, $sym54$NC_BLOCK_DENOT ), $sym124$_, $sym52$NC_BLOCK_CONFIDENCE );
    return sorted;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 34079L)
  public static SubLObject rbp_sort_blocks_confidence_first(final SubLObject blocks)
  {
    final SubLObject sorted = Sort.sort( Sort.sort( blocks, $sym124$_, $sym52$NC_BLOCK_CONFIDENCE ), $sym123$NPP_TERM_COMPLEXITY__, $sym54$NC_BLOCK_DENOT );
    return sorted;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 34268L)
  public static SubLObject rbp_filter_and_sort_result_blocks(final SubLObject blocks, final SubLObject block_hash, SubLObject required_rbp_rules)
  {
    if( required_rbp_rules == UNPROVIDED )
    {
      required_rbp_rules = $kw97$NONE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject filtered_blocks = NIL;
    SubLObject cdolist_list_var = blocks;
    SubLObject block = NIL;
    block = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == parsing_macros.parsing_timeout_time_reachedP() )
      {
        if( NIL == nc_block_uses_required_rules_p( block, required_rbp_rules, block_hash ) )
        {
          if( NIL != subl_promotions.memberP( nc_block_rule( block ), rbp_traced_rules(), UNPROVIDED, UNPROVIDED ) )
          {
            Errors.warn( $str125$___S_didn_t_use_the_required_rule, nc_block_denot( block ), required_rbp_rules );
          }
        }
        else if( NIL != rbp_parse_wrong_sizeP( block, block_hash ) )
        {
          if( NIL != subl_promotions.memberP( nc_block_rule( block ), rbp_traced_rules(), UNPROVIDED, UNPROVIDED ) )
          {
            Errors.warn( $str126$___S_was_too_long_or_too_short___, nc_block_denot( block ) );
          }
        }
        else if( NIL != $nominal_interpretations_only$.getDynamicValue( thread ) && NIL == rbp_nominal_blockP( block ) )
        {
          if( NIL != subl_promotions.memberP( nc_block_rule( block ), rbp_traced_rules(), UNPROVIDED, UNPROVIDED ) )
          {
            Errors.warn( $str127$__The__S_form_of____S___is_being_, nc_block_head_string_pred( block ), nc_block_denot( block ) );
          }
        }
        else
        {
          filtered_blocks = ConsesLow.cons( block, filtered_blocks );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      block = cdolist_list_var.first();
    }
    filtered_blocks = rbp_unify_city_named_fn_blocks( filtered_blocks );
    if( NIL != list_utilities.lengthG( filtered_blocks, ONE_INTEGER, UNPROVIDED ) )
    {
      SubLObject boolean_clusters = ConsesLow.list( $rbp_universal_boolean_filters$.getDynamicValue( thread ) );
      SubLObject macroscopic_clusters = NIL;
      if( NIL != parsing_vars.$rbp_apply_all_filters_regardlessP$.getDynamicValue( thread ) || ( NIL == parsing_vars.$rbp_bypass_deverbal_filtersP$.getDynamicValue( thread ) && NIL != rbp_deverbal_candidateP(
          string_utilities.bunge( $rbp_input_strings$.getDynamicValue( thread ), UNPROVIDED ) ) ) )
      {
        boolean_clusters = ConsesLow.cons( $rbp_deverbal_boolean_filters$.getDynamicValue( thread ), boolean_clusters );
        macroscopic_clusters = ConsesLow.cons( $rbp_deverbal_macroscopic_block_filters$.getDynamicValue( thread ), macroscopic_clusters );
      }
      filtered_blocks = rbp_process_filter_clusters( boolean_clusters, filtered_blocks, $kw99$BOOLEAN );
      filtered_blocks = rbp_process_filter_clusters( macroscopic_clusters, filtered_blocks, $kw128$MACROSCOPIC );
    }
    if( NIL == parsing_vars.$rbp_bypass_block_unificationP$.getDynamicValue( thread ) )
    {
      filtered_blocks = rbp_unify_blocks_to_common_specpreds( filtered_blocks );
    }
    if( NIL != parsing_vars.$rbp_reformulate_resultsP$.getDynamicValue( thread ) )
    {
      cdolist_list_var = filtered_blocks;
      block = NIL;
      block = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        _csetf_nc_block_denot( block, nl_reformulator.nl_reformulate( nc_block_denot( block ), UNPROVIDED ) );
        cdolist_list_var = cdolist_list_var.rest();
        block = cdolist_list_var.first();
      }
    }
    else
    {
      filtered_blocks = rbp_unify_rewrite_of_blocks( filtered_blocks );
    }
    cdolist_list_var = filtered_blocks;
    block = NIL;
    block = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      _csetf_nc_block_confidence( block, Numbers.multiply( nc_block_confidence( block ), rbp_block_reliability_estimate( block, block_hash ) ) );
      cdolist_list_var = cdolist_list_var.rest();
      block = cdolist_list_var.first();
    }
    return ( NIL != $rbp_sort_blocks_confidence_firstP$.getDynamicValue( thread ) ) ? rbp_sort_blocks_confidence_first( filtered_blocks ) : rbp_sort_blocks_complexity_first( filtered_blocks );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 37503L)
  public static SubLObject rbp_block_reliability_estimate(final SubLObject block, SubLObject wrt_block_hash)
  {
    if( wrt_block_hash == UNPROVIDED )
    {
      wrt_block_hash = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != nc_block_sub_tree( block ) )
    {
      return Numbers.multiply( rbp_block_reliability_estimate( nc_block_mod_block( block, wrt_block_hash ), wrt_block_hash ), rbp_block_reliability_estimate( nc_block_head_block( block, wrt_block_hash ),
          wrt_block_hash ) );
    }
    SubLObject cdolist_list_var = Mapping.mapcar( $sym132$LEXIFICATION_SENTENCE_FROM_PREFERRED_LEXIFICATION_ASSERTION, lexicon_utilities.gen_string_assertions_for_term( nc_block_denot( block ), UNPROVIDED,
        UNPROVIDED ) );
    SubLObject lex = NIL;
    lex = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != lexicon_utilities.lexical_semantic_formula_genl_posP( lex, $const131$Noun, UNPROVIDED ) && NIL != lexicon_utilities.lexical_semantic_formula_matches_head_stringXposP( lex, nc_block_spanned_string(
          block ), $const131$Noun, UNPROVIDED ) )
      {
        return $rbp_reliability_high$.getDynamicValue( thread );
      }
      cdolist_list_var = cdolist_list_var.rest();
      lex = cdolist_list_var.first();
    }
    if( NIL != string_utilities.substringP( $str88$_, nc_block_spanned_string( block ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return $rbp_reliability_medium$.getDynamicValue( thread );
    }
    if( NIL != list_utilities.lengthE( lexicon_utilities.lexifications_for_term( nc_block_denot( block ), NIL, UNPROVIDED, UNPROVIDED ), ONE_INTEGER, UNPROVIDED ) )
    {
      return $rbp_reliability_medium$.getDynamicValue( thread );
    }
    return $rbp_reliability_low$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 38582L)
  public static SubLObject rbp_unify_blocks_to_common_specpreds(final SubLObject blocks)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == list_utilities.lengthG( blocks, ONE_INTEGER, UNPROVIDED ) )
    {
      return blocks;
    }
    final SubLObject blocks_by_codes = dictionary.new_dictionary( EQUAL, UNPROVIDED );
    final SubLObject precise_blocks = set_utilities.construct_set_from_list( blocks, UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = blocks;
    SubLObject this_block = NIL;
    this_block = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP( nc_block_denot( this_block ) ) )
      {
        final SubLObject this_code = ConsesLow.list( nc_block_head_string_pred( this_block ), cycl_utilities.formula_arg0( nc_block_denot( this_block ) ), nc_block_filters( this_block ) );
        dictionary_utilities.dictionary_push( blocks_by_codes, this_code, this_block );
      }
      cdolist_list_var = cdolist_list_var.rest();
      this_block = cdolist_list_var.first();
    }
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( blocks_by_codes ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject this_code2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject these_blocks = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject subcolfunc = conses_high.second( this_code2 );
      final SubLObject blocks_by_args = dictionary.new_dictionary( EQUAL, UNPROVIDED );
      final SubLObject validity_check = ( NIL != isa.isa_in_any_mtP( subcolfunc, $const133$SubcollectionRelationFunction_Typ ) ) ? $sym134$NPP_GENL_ : $sym135$NPP_ISA_;
      SubLObject cdolist_list_var2 = these_blocks;
      SubLObject this_block2 = NIL;
      this_block2 = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        final SubLObject denot = nc_block_denot( this_block2 );
        final SubLObject key = ConsesLow.list( parsing_utilities.subcollection_function_naut_from_arg( denot ), parsing_utilities.subcollection_function_naut_to_arg( denot ) );
        dictionary_utilities.dictionary_push( blocks_by_args, key, this_block2 );
        cdolist_list_var2 = cdolist_list_var2.rest();
        this_block2 = cdolist_list_var2.first();
      }
      SubLObject iteration_state_$13;
      for( iteration_state_$13 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( blocks_by_args ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
          iteration_state_$13 ); iteration_state_$13 = dictionary_contents.do_dictionary_contents_next( iteration_state_$13 ) )
      {
        thread.resetMultipleValues();
        final SubLObject these_args = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$13 );
        final SubLObject these_blocks_by_args = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != list_utilities.lengthG( these_blocks_by_args, ONE_INTEGER, UNPROVIDED ) )
        {
          SubLObject cached_preds = NIL;
          SubLObject precise_preds = NIL;
          final SubLObject mt = rbp_domain_mt();
          cached_preds = list_utilities.mapcar_unique( $sym136$SUBCOLLECTION_FUNCTION_NAUT_PRED, Mapping.mapcar( $sym54$NC_BLOCK_DENOT, these_blocks_by_args ), UNPROVIDED );
          if( NIL != list_utilities.lengthG( cached_preds, ONE_INTEGER, UNPROVIDED ) )
          {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
            try
            {
              mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
              mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
              mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
              final SubLObject pred_var = $const137$relationAllExists;
              if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( these_args.first(), TWO_INTEGER, pred_var ) )
              {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( these_args.first(), TWO_INTEGER, pred_var );
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while ( NIL == done_var)
                {
                  final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
                  final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
                  if( NIL != valid )
                  {
                    SubLObject final_index_iterator = NIL;
                    try
                    {
                      final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw138$GAF, NIL, NIL );
                      SubLObject done_var_$14 = NIL;
                      final SubLObject token_var_$15 = NIL;
                      while ( NIL == done_var_$14)
                      {
                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$15 );
                        final SubLObject valid_$16 = makeBoolean( !token_var_$15.eql( ass ) );
                        if( NIL != valid_$16 )
                        {
                          final SubLObject gaf_pred = cycl_utilities.formula_arg1( ass, UNPROVIDED );
                          if( NIL == subl_promotions.memberP( gaf_pred, cached_preds, UNPROVIDED, UNPROVIDED ) && NIL != Functions.funcall( validity_check, conses_high.second( these_args ), cycl_utilities.formula_arg3(
                              ass, UNPROVIDED ), mt ) )
                          {
                            SubLObject badP = NIL;
                            if( NIL == badP )
                            {
                              SubLObject csome_list_var = cached_preds;
                              SubLObject genl = NIL;
                              genl = csome_list_var.first();
                              while ( NIL == badP && NIL != csome_list_var)
                              {
                                if( NIL == genl_predicates.genl_predicateP( gaf_pred, genl, UNPROVIDED, UNPROVIDED ) )
                                {
                                  badP = T;
                                }
                                csome_list_var = csome_list_var.rest();
                                genl = csome_list_var.first();
                              }
                            }
                            if( NIL == badP )
                            {
                              precise_preds = ConsesLow.cons( gaf_pred, precise_preds );
                            }
                          }
                        }
                        done_var_$14 = makeBoolean( NIL == valid_$16 );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        final SubLObject _values = Values.getValuesAsVector();
                        if( NIL != final_index_iterator )
                        {
                          kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                        }
                        Values.restoreValuesFromVector( _values );
                      }
                      finally
                      {
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$17, thread );
                      }
                    }
                  }
                  done_var = makeBoolean( NIL == valid );
                }
              }
            }
            finally
            {
              mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
              mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
              mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
            }
            if( NIL != precise_preds )
            {
              SubLObject recycled_block = NIL;
              SubLObject max_confidence = NIL;
              SubLObject cdolist_list_var3 = these_blocks_by_args;
              SubLObject block = NIL;
              block = cdolist_list_var3.first();
              while ( NIL != cdolist_list_var3)
              {
                if( NIL == precise_preds )
                {
                  max_confidence = Numbers.max( nc_block_confidence( block ), max_confidence );
                  set.set_remove( block, precise_blocks );
                }
                else
                {
                  final SubLObject precise_pred = precise_preds.first();
                  if( NIL != $rbp_show_successful_rulesP$.getDynamicValue( thread ) || NIL != conses_high.member( nc_block_rule( block ), rbp_traced_rules(), UNPROVIDED, UNPROVIDED ) )
                  {
                    Errors.warn( $str139$Strengthening__S_to_use__S, nc_block_denot( block ), precise_pred );
                  }
                  _csetf_nc_block_denot( block, el_utilities.replace_formula_arg( TWO_INTEGER, precise_pred, nc_block_denot( block ) ) );
                  recycled_block = block;
                  max_confidence = nc_block_confidence( block );
                  precise_preds = precise_preds.rest();
                }
                cdolist_list_var3 = cdolist_list_var3.rest();
                block = cdolist_list_var3.first();
              }
              _csetf_nc_block_confidence( recycled_block, max_confidence );
            }
          }
        }
      }
      dictionary_contents.do_dictionary_contents_finalize( iteration_state_$13 );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return set.set_element_list( precise_blocks );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 42257L)
  public static SubLObject rbp_unify_rewrite_of_blocks(final SubLObject blocks)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject denots = list_utilities.mapcar_unique( $sym54$NC_BLOCK_DENOT, blocks, EQUAL );
    final SubLObject block_set = set_utilities.construct_set_from_list( blocks, UNPROVIDED, UNPROVIDED );
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( rbp_domain_mt() );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject cdolist_list_var = blocks;
      SubLObject this_block = NIL;
      this_block = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject removedP = NIL;
        SubLObject core_fort = NIL;
        final SubLObject pred_var = $const140$rewriteOf;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( narts_high.nart_substitute( nc_block_denot( this_block ) ), TWO_INTEGER, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( narts_high.nart_substitute( nc_block_denot( this_block ) ), TWO_INTEGER, pred_var );
          SubLObject done_var = removedP;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw138$GAF, NIL, NIL );
                SubLObject done_var_$18 = removedP;
                final SubLObject token_var_$19 = NIL;
                while ( NIL == done_var_$18)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$19 );
                  final SubLObject valid_$20 = makeBoolean( !token_var_$19.eql( assertion ) );
                  if( NIL != valid_$20 )
                  {
                    core_fort = assertions_high.gaf_arg( assertion, ONE_INTEGER );
                    if( NIL != subl_promotions.memberP( core_fort, denots, EQUAL, UNPROVIDED ) )
                    {
                      set.set_remove( this_block, block_set );
                      removedP = T;
                    }
                  }
                  done_var_$18 = makeBoolean( NIL == valid_$20 || NIL != removedP );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$21, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid || NIL != removedP );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        this_block = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return set.set_element_list( block_set );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 42912L)
  public static SubLObject rbp_unify_city_named_fn_blocks(final SubLObject blocks)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject denots = list_utilities.mapcar_unique( $sym54$NC_BLOCK_DENOT, blocks, EQUAL );
    final SubLObject block_set = set_utilities.construct_set_from_list( blocks, UNPROVIDED, UNPROVIDED );
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( rbp_domain_mt() );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject cdolist_list_var = blocks;
      SubLObject this_block = NIL;
      this_block = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject expanded = narts_high.nart_expand( nc_block_denot( this_block ) );
        if( NIL != el_utilities.formula_arityE( expanded, TWO_INTEGER, UNPROVIDED ) )
        {
          SubLObject current;
          final SubLObject datum = current = expanded;
          SubLObject denot_arg0 = NIL;
          SubLObject denot_arg2 = NIL;
          SubLObject denot_arg3 = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list141 );
          denot_arg0 = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list141 );
          denot_arg2 = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list141 );
          denot_arg3 = current.first();
          current = current.rest();
          if( NIL == current )
          {
            if( denot_arg0.eql( $const142$CityNamedFn ) )
            {
              if( NIL != isa.isaP( denot_arg3, $const143$State_Geopolitical, UNPROVIDED, UNPROVIDED ) )
              {
                SubLObject removedP = NIL;
                if( NIL == removedP )
                {
                  SubLObject csome_list_var = denots;
                  SubLObject denot_from_set = NIL;
                  denot_from_set = csome_list_var.first();
                  while ( NIL == removedP && NIL != csome_list_var)
                  {
                    if( NIL != constant_handles.constant_p( denot_from_set ) && NIL != rbp_wff.npp_search_gafs_gp( $const144$cityInState, denot_from_set, ONE_INTEGER, denot_arg3, TWO_INTEGER, EQL, rbp_domain_mt() )
                        && NIL != rbp_wff.npp_search_gafs_gp( $const145$nameString, denot_from_set, ONE_INTEGER, denot_arg2, TWO_INTEGER, $sym146$STRING_, lexicon_vars.$lexicon_lookup_mt$.getDynamicValue( thread ) ) )
                    {
                      set.set_remove( this_block, block_set );
                      removedP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    denot_from_set = csome_list_var.first();
                  }
                }
              }
              else if( NIL != isa.isaP( denot_arg3, $const147$Country, UNPROVIDED, UNPROVIDED ) )
              {
                SubLObject removedP = NIL;
                if( NIL == removedP )
                {
                  SubLObject csome_list_var = denots;
                  SubLObject denot_from_set = NIL;
                  denot_from_set = csome_list_var.first();
                  while ( NIL == removedP && NIL != csome_list_var)
                  {
                    if( NIL != constant_handles.constant_p( denot_from_set ) && NIL != rbp_wff.npp_search_gafs_gp( $const148$countryOfCity, denot_from_set, TWO_INTEGER, denot_arg3, ONE_INTEGER, EQL, rbp_domain_mt() )
                        && NIL != rbp_wff.npp_search_gafs_gp( $const145$nameString, denot_from_set, ONE_INTEGER, denot_arg2, TWO_INTEGER, $sym146$STRING_, rbp_domain_mt() ) )
                    {
                      set.set_remove( this_block, block_set );
                      removedP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    denot_from_set = csome_list_var.first();
                  }
                }
              }
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list141 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        this_block = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return set.set_element_list( block_set );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 44877L)
  public static SubLObject rbp_nominal_blockP(final SubLObject block)
  {
    return makeBoolean( NIL != rbp_wff.npp_genlP( nc_block_head_pos( block ), $const131$Noun, UNPROVIDED ) || NIL != rbp_wff.npp_genlP( nc_block_head_pos( block ), $const149$NounPhrase, UNPROVIDED )
        || nc_block_head_string_pred( block ) == $kw150$ORIGINAL_STRING || NIL != rbp_wff.npp_genl_predP( nc_block_head_string_pred( block ), $const151$gerund ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 45163L)
  public static SubLObject display_complete_parses(final SubLObject list_of_blocks)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject good_stack = NIL;
    SubLObject bad_stack = NIL;
    final SubLObject full_confidence = list_utilities.safe_max( Mapping.mapcar( $sym52$NC_BLOCK_CONFIDENCE, list_of_blocks ), UNPROVIDED );
    final SubLObject rules_to_details = ( NIL != $rbp_shadow_rulesP$.getDynamicValue( thread ) ) ? dictionary.new_dictionary( EQUAL, UNPROVIDED ) : NIL;
    SubLObject cdolist_list_var = list_of_blocks;
    SubLObject block = NIL;
    block = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject pred = nc_block_head_string_pred( block );
      final SubLObject denot = nc_block_denot( block );
      final SubLObject filters = nc_block_filters( block );
      final SubLObject rule = nc_block_rule( block );
      SubLObject details = np_parser.make_npp_parse( denot, pred );
      final SubLObject non_confidentP = makeBoolean( NIL != filters && full_confidence.numG( nc_block_confidence( block ) ) );
      if( NIL != non_confidentP )
      {
        details = ConsesLow.list( details, filters );
      }
      if( NIL != non_confidentP )
      {
        final SubLObject item_var = ( NIL != $rbp_return_confidenceP$.getDynamicValue( thread ) ) ? ConsesLow.append( details, ConsesLow.list( nc_block_confidence( block ) ) ) : details;
        if( NIL == conses_high.member( item_var, bad_stack, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
        {
          bad_stack = ConsesLow.cons( item_var, bad_stack );
        }
      }
      else if( NIL != $rbp_return_confidenceP$.getDynamicValue( thread ) )
      {
        final SubLObject item_var = ConsesLow.append( details, ConsesLow.list( nc_block_confidence( block ) ) );
        if( NIL == conses_high.member( item_var, good_stack, $sym152$RBP_PARSE_AND_CONFIDENCE_, Symbols.symbol_function( IDENTITY ) ) )
        {
          good_stack = ConsesLow.cons( item_var, good_stack );
        }
      }
      else
      {
        final SubLObject item_var = details;
        if( NIL == conses_high.member( item_var, good_stack, $sym153$NPP_PARSE_, Symbols.symbol_function( IDENTITY ) ) )
        {
          good_stack = ConsesLow.cons( item_var, good_stack );
        }
      }
      if( NIL != $rbp_shadow_rulesP$.getDynamicValue( thread ) )
      {
        dictionary_utilities.dictionary_push( rules_to_details, nc_block_rule( block ), details );
      }
      cdolist_list_var = cdolist_list_var.rest();
      block = cdolist_list_var.first();
    }
    if( NIL != $rbp_shadow_rulesP$.getDynamicValue( thread ) )
    {
      $rbp_rules_to_parses_shadow$.setDynamicValue( dictionary_utilities.copy_dictionary( rules_to_details ), thread );
    }
    return Values.values( Sequences.nreverse( good_stack ), Sequences.nreverse( bad_stack ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 46768L)
  public static SubLObject nc_block_uses_required_rules_p(final SubLObject block, final SubLObject required_rbp_rules, final SubLObject block_hash)
  {
    if( required_rbp_rules.isList() )
    {
      SubLObject failP = NIL;
      if( NIL == failP )
      {
        SubLObject csome_list_var = required_rbp_rules;
        SubLObject required_rbp_rule = NIL;
        required_rbp_rule = csome_list_var.first();
        while ( NIL == failP && NIL != csome_list_var)
        {
          if( NIL == nc_block_uses_required_rule_p( block, required_rbp_rule, block_hash ) )
          {
            failP = T;
          }
          csome_list_var = csome_list_var.rest();
          required_rbp_rule = csome_list_var.first();
        }
      }
      return makeBoolean( NIL == failP );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 47221L)
  public static SubLObject nc_block_uses_required_rule_p(final SubLObject block, final SubLObject required_rbp_rule, final SubLObject block_hash)
  {
    if( nc_block_rule( block ).eql( required_rbp_rule ) )
    {
      return T;
    }
    if( NIL == nc_block_sub_tree( block ) )
    {
      return NIL;
    }
    if( NIL != nc_block_uses_required_rule_p( nc_block_mod_block( block, block_hash ), required_rbp_rule, block_hash ) )
    {
      return T;
    }
    if( NIL != nc_block_uses_required_rule_p( nc_block_head_block( block, block_hash ), required_rbp_rule, block_hash ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 47691L)
  public static SubLObject rbp_parse_and_confidenceP(final SubLObject obj)
  {
    return makeBoolean( obj.isCons() && NIL != list_utilities.lengthE( obj, THREE_INTEGER, UNPROVIDED ) && NIL != lexicon_accessors.speech_part_predP( conses_high.second( obj ), UNPROVIDED ) && ( NIL == conses_high
        .third( obj ) || conses_high.third( obj ).isNumber() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 47886L)
  public static SubLObject rbp_parse_and_confidenceE(final SubLObject parse1, final SubLObject parse2)
  {
    assert NIL != rbp_parse_and_confidenceP( parse1 ) : parse1;
    assert NIL != rbp_parse_and_confidenceP( parse2 ) : parse2;
    return makeBoolean( parse1.first().equalp( parse2.first() ) && conses_high.second( parse1 ).equal( conses_high.second( parse2 ) ) && conses_high.third( parse1 ).eql( conses_high.third( parse2 ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 48382L)
  public static SubLObject ncp_chart_init(SubLObject strings, SubLObject filterP)
  {
    if( strings == UNPROVIDED )
    {
      strings = $rbp_input_strings$.getDynamicValue();
    }
    if( filterP == UNPROVIDED )
    {
      filterP = $rbp_chart_filterP$.getGlobalValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject value_type = ( NIL != parsing_vars.$rbp_include_word_unitsP$.getDynamicValue( thread ) ) ? $kw155$QUADS : $kw156$TRIPLES;
    final SubLObject filter_no_denot_tokensP = makeBoolean( NIL == parsing_vars.$rbp_include_word_unitsP$.getDynamicValue( thread ) );
    final SubLObject raw_tokens = np_parser.npp_tokenize_strings( strings, value_type, filter_no_denot_tokensP );
    final SubLObject verbless_tokens = rbp_filter_verbs( raw_tokens );
    final SubLObject input_length = Sequences.length( strings );
    final SubLObject tokens = ( NIL != filterP ) ? rbp_remove_subsumed_tokens( verbless_tokens, input_length ) : verbless_tokens;
    final SubLObject chart = new_ncp_chart( input_length );
    return ncp_chart_init_int( chart, tokens );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 49057L)
  public static SubLObject ncp_chart_init_from_string_tokens(final SubLObject string_tokens)
  {
    final SubLObject input_length = Sequences.length( string_tokens );
    final SubLObject chart = new_ncp_chart( input_length );
    SubLObject interval_tokens = NIL;
    SubLObject i;
    SubLObject s_token;
    for( i = NIL, i = ZERO_INTEGER; i.numL( input_length ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      s_token = ConsesLow.nth( i, string_tokens );
      interval_tokens = ConsesLow.cons( standard_tokenization.new_interval_token( i, number_utilities.f_1X( i ), s_token ), interval_tokens );
    }
    return ncp_chart_init_int( chart, interval_tokens );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 49432L)
  public static SubLObject new_ncp_chart(final SubLObject input_length)
  {
    final SubLObject edges = Hashtables.make_hash_table( $int157$256, Symbols.symbol_function( EQL ), UNPROVIDED );
    final SubLObject block_merge_fn = $sym86$COMBINE_NOUN_COMPOUND_BLOCKS;
    final SubLObject block_hash = Hashtables.make_hash_table( $int157$256, UNPROVIDED, UNPROVIDED );
    final SubLObject done_spans = Hashtables.make_hash_table( $int157$256, Symbols.symbol_function( EQL ), UNPROVIDED );
    return rbp_chart_parser.new_rbp_chart( input_length, edges, done_spans, block_merge_fn, block_hash );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 49820L)
  public static SubLObject ncp_chart_init_int(final SubLObject chart, final SubLObject tokens)
  {
    final SubLObject input_length = rbp_chart_parser.rbp_chart_input_length( chart );
    SubLObject cdolist_list_var = tokens;
    SubLObject token = NIL;
    token = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$22 = token_to_blocks( token );
      SubLObject block = NIL;
      block = cdolist_list_var_$22.first();
      while ( NIL != cdolist_list_var_$22)
      {
        if( NIL != nc_block_head( block ) && NIL == rbp_input_spanning_blockP( block, input_length ) )
        {
          rbp_chart_parser.rbp_chart_add( block, chart );
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
  public static SubLObject rbp_input_spanning_blockP(final SubLObject block, final SubLObject input_length)
  {
    final SubLObject span = nc_block_span_index( block );
    return makeBoolean( NIL != interval_span.interval_span_p( span ) && interval_span.interval_span_length( span ).eql( input_length ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 50460L)
  public static SubLObject rbp_filter_verbs(final SubLObject tokens)
  {
    SubLObject cdolist_list_var = tokens;
    SubLObject token = NIL;
    token = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      standard_tokenization.string_token_value_set( standard_tokenization.interval_token_value( token ), rbp_filter_verbs_in_tuples( standard_tokenization.string_token_value( standard_tokenization.interval_token_value(
          token ) ) ) );
      cdolist_list_var = cdolist_list_var.rest();
      token = cdolist_list_var.first();
    }
    return tokens;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 50839L)
  public static SubLObject rbp_filter_verbs_in_tuples(final SubLObject tuples)
  {
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = tuples;
    SubLObject tuple = NIL;
    tuple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = tuple;
      SubLObject denot = NIL;
      SubLObject pos = NIL;
      SubLObject pred = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list90 );
      denot = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list90 );
      pos = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list90 );
      pred = current.first();
      current = current.rest();
      final SubLObject wu = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list90 );
      current = current.rest();
      if( NIL == current )
      {
        if( NIL == lexicon_accessors.genl_posP( pos, $const158$Verb, UNPROVIDED ) )
        {
          ans = ConsesLow.cons( tuple, ans );
        }
        else if( pred.eql( $const159$perfect ) )
        {
          final SubLObject item_var = list_utilities.replace_nth( ONE_INTEGER, $const91$Adjective, tuple );
          if( NIL == conses_high.member( item_var, ans, Symbols.symbol_function( EQUALP ), Symbols.symbol_function( IDENTITY ) ) )
          {
            ans = ConsesLow.cons( item_var, ans );
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list90 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      tuple = cdolist_list_var.first();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 51283L)
  public static SubLObject rbp_remove_subsumed_tokens(final SubLObject tokens, final SubLObject input_length)
  {
    final SubLObject sorted = Sort.sort( tokens, $sym124$_, $sym160$INTERVAL_TOKEN_LENGTH );
    SubLObject big_spans = NIL;
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = sorted;
    SubLObject token = NIL;
    token = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject span = interval_span.get_interval_span( standard_tokenization.interval_token_start( token ), standard_tokenization.interval_token_end( token ) );
      final SubLObject span_length = interval_span.interval_span_length( span );
      if( NIL == rbp_span_subsumed_by_all_ofP( span, big_spans ) )
      {
        if( span_length.numE( input_length ) || span_length.numL( TWO_INTEGER ) )
        {
          ans = ConsesLow.cons( token, ans );
        }
        else
        {
          big_spans = ConsesLow.cons( span, big_spans );
          ans = ConsesLow.cons( token, ans );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      token = cdolist_list_var.first();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 51906L)
  public static SubLObject rbp_span_subsumed_by_all_ofP(final SubLObject span, final SubLObject big_spans)
  {
    if( NIL == big_spans )
    {
      return NIL;
    }
    SubLObject failP = NIL;
    if( NIL == failP )
    {
      SubLObject csome_list_var = big_spans;
      SubLObject big_span = NIL;
      big_span = csome_list_var.first();
      while ( NIL == failP && NIL != csome_list_var)
      {
        if( NIL == rbp_span_subsumed_byP( span, big_span ) )
        {
          failP = T;
        }
        csome_list_var = csome_list_var.rest();
        big_span = csome_list_var.first();
      }
    }
    return makeBoolean( NIL == failP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 52158L)
  public static SubLObject rbp_span_subsumed_byP(final SubLObject span, final SubLObject big_span)
  {
    return makeBoolean( !span.equalp( big_span ) && !interval_span.interval_span_start( span ).numL( interval_span.interval_span_start( big_span ) ) && !interval_span.interval_span_end( span ).numG( interval_span
        .interval_span_end( big_span ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 52598L)
  public static SubLObject initialize_rbp_name_cache()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $rbp_name_cache$.setDynamicValue( Hashtables.make_hash_table( SIXTEEN_INTEGER, Symbols.symbol_function( EQUALP ), UNPROVIDED ), thread );
    return $rbp_name_cache$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 52727L)
  public static SubLObject rbp_name_block_pred_among_floorsP(final SubLObject block)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject denot = nc_block_head( block );
    final SubLObject pred = nc_block_head_string_pred( block );
    final SubLObject floor_preds = Hashtables.gethash( denot, $rbp_name_cache$.getDynamicValue( thread ), UNPROVIDED );
    return conses_high.member( pred, floor_preds, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 53033L)
  public static SubLObject rbp_cache_name_block(final SubLObject block)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject denot = nc_block_head( block );
    final SubLObject pred = nc_block_head_string_pred( block );
    final SubLObject existing = Hashtables.gethash( denot, $rbp_name_cache$.getDynamicValue( thread ), UNPROVIDED );
    if( NIL == subl_promotions.memberP( pred, existing, UNPROVIDED, UNPROVIDED ) )
    {
      Hashtables.sethash( denot, $rbp_name_cache$.getDynamicValue( thread ), rbp_floors_cached( ConsesLow.cons( pred, existing ) ) );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 53376L)
  public static SubLObject clear_rbp_floors_cached()
  {
    final SubLObject cs = $rbp_floors_cached_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 53376L)
  public static SubLObject remove_rbp_floors_cached(final SubLObject v_forts)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $rbp_floors_cached_caching_state$.getGlobalValue(), ConsesLow.list( v_forts ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 53376L)
  public static SubLObject rbp_floors_cached_internal(final SubLObject v_forts)
  {
    return genl_predicates.min_predicates( v_forts, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 53376L)
  public static SubLObject rbp_floors_cached(final SubLObject v_forts)
  {
    SubLObject caching_state = $rbp_floors_cached_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym161$RBP_FLOORS_CACHED, $sym162$_RBP_FLOORS_CACHED_CACHING_STATE_, $int163$512, EQUAL, ONE_INTEGER, $int164$128 );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, v_forts, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( rbp_floors_cached_internal( v_forts ) ) );
      memoization_state.caching_state_put( caching_state, v_forts, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 53513L)
  public static SubLObject clear_rbp_ok_name_cachedP()
  {
    final SubLObject cs = $rbp_ok_name_cachedP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 53513L)
  public static SubLObject remove_rbp_ok_name_cachedP(final SubLObject block, final SubLObject inside_noun_compoundP)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $rbp_ok_name_cachedP_caching_state$.getGlobalValue(), ConsesLow.list( block, inside_noun_compoundP ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 53513L)
  public static SubLObject rbp_ok_name_cachedP_internal(final SubLObject block, final SubLObject inside_noun_compoundP)
  {
    final SubLObject block_string = nc_block_spanned_string( block );
    final SubLObject pred = nc_block_head_string_pred( block );
    final SubLObject denot = function_terms.naut_to_nart( nc_block_head( block ) );
    if( NIL != ( ( NIL != inside_noun_compoundP ) ? string_utilities.starts_with_by_test( block_string, $str166$the_, Symbols.symbol_function( EQUALP ) )
        : makeBoolean( NIL != kb_indexing_datastructures.indexed_term_p( denot ) && NIL == subl_promotions.memberP( block_string, kb_mapping_utilities.pred_values_in_any_mt( denot, pred, UNPROVIDED, UNPROVIDED,
            UNPROVIDED ), Symbols.symbol_function( EQUALP ), UNPROVIDED ) ) ) )
    {
      return NIL;
    }
    if( NIL != kb_indexing_datastructures.indexed_term_p( denot ) && ( NIL != lexicon_accessors.closed_lexical_class_stringP( block_string, UNPROVIDED ) || NIL != lexicon_accessors.denots_of_string( block_string,
        UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) )
    {
      final SubLObject block_span = nc_block_span_index( block );
      final SubLObject strings = rbp_strings_for_span( block_span );
      final SubLObject original_string = strings.first();
      if( NIL != string_utilities.lower_case_string_p( original_string ) )
      {
        final SubLObject abbrevs = kb_mapping_utilities.pred_values_in_any_mt( denot, $const167$abbreviationString_PN, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        if( NIL == subl_promotions.memberP( original_string, abbrevs, Symbols.symbol_function( $sym146$STRING_ ), UNPROVIDED ) )
        {
          final SubLObject acronyms = kb_mapping_utilities.pred_values_in_any_mt( denot, $const168$acronymString, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          return conses_high.member( original_string, acronyms, Symbols.symbol_function( $sym146$STRING_ ), UNPROVIDED );
        }
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 53513L)
  public static SubLObject rbp_ok_name_cachedP(final SubLObject block, final SubLObject inside_noun_compoundP)
  {
    SubLObject caching_state = $rbp_ok_name_cachedP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym165$RBP_OK_NAME_CACHED_, $sym169$_RBP_OK_NAME_CACHED__CACHING_STATE_, $int164$128, EQL, TWO_INTEGER, SIXTEEN_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( block, inside_noun_compoundP );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( block.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && inside_noun_compoundP.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( rbp_ok_name_cachedP_internal( block, inside_noun_compoundP ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( block, inside_noun_compoundP ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 55018L)
  public static SubLObject rbp_strings_for_span(final SubLObject span)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject start = interval_span.interval_span_start( span );
    final SubLObject end = interval_span.interval_span_end( span );
    final SubLObject strings = Sequences.subseq( $rbp_input_strings$.getDynamicValue( thread ), start, end );
    return strings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 55212L)
  public static SubLObject rbp_string_tokenize(final SubLObject string)
  {
    return nl_trie.nl_trie_string_tokenize( string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 55360L)
  public static SubLObject rbp_ok_blockP(final SubLObject block)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pred = nc_block_head_string_pred( block );
    if( NIL != parsing_utilities.npp_excluded_name_predP( pred ) )
    {
      return NIL;
    }
    if( pred.eql( $const170$atomicSymbol ) )
    {
      final SubLObject block_string = nc_block_spanned_string( block );
      if( NIL == Sequences.find( block_string, $rbp_input_strings$.getDynamicValue( thread ), Symbols.symbol_function( $sym146$STRING_ ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        return NIL;
      }
    }
    if( NIL != rbp_name_blockP( block ) )
    {
      if( NIL != rbp_bad_name_blockP( block ) )
      {
        return NIL;
      }
      rbp_cache_name_block( block );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 55812L)
  public static SubLObject rbp_bad_name_blockP(final SubLObject block)
  {
    return makeBoolean( NIL == rbp_ok_name_cachedP( block, T ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 55903L)
  public static SubLObject rbp_name_blockP(final SubLObject block)
  {
    return lexicon_accessors.genl_posP( nc_block_head_pos( block ), $const171$ProperNoun, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 56004L)
  public static SubLObject rbp_filter_redundant_blocks(final SubLObject blocks)
  {
    final SubLObject non_names = Sequences.remove_if( $sym172$RBP_NAME_BLOCK_, blocks, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject good_names = list_utilities.remove_if_not( $sym173$RBP_NAME_BLOCK_PRED_AMONG_FLOORS_, blocks, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return ConsesLow.append( non_names, good_names );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 56232L)
  public static SubLObject display_all_parses(final SubLObject chart)
  {
    SubLObject ans = NIL;
    final SubLObject cdohash_table = rbp_chart_parser.rbp_chart_edges( chart );
    SubLObject span = NIL;
    SubLObject block_ids = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        span = Hashtables.getEntryKey( cdohash_entry );
        block_ids = Hashtables.getEntryValue( cdohash_entry );
        SubLObject parses = NIL;
        SubLObject cdolist_list_var = block_ids;
        SubLObject block_id = NIL;
        block_id = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject block_hash = rbp_chart_parser.rbp_chart_block_hash( chart );
          final SubLObject block = rbp_chart_parser.rbp_chart_block_hash_lookup( block_id, block_hash );
          final SubLObject pred = nc_block_head_string_pred( block );
          final SubLObject denot = cycl_utilities.hl_to_el( nc_block_denot( block ) );
          final SubLObject rule = nc_block_rule( block );
          final SubLObject npp_parse = np_parser.make_npp_parse( denot, pred );
          if( NIL != np_parser.npp_proper_parseP( npp_parse ) )
          {
            final SubLObject item_var = npp_parse;
            if( NIL == conses_high.member( item_var, parses, $sym153$NPP_PARSE_, Symbols.symbol_function( IDENTITY ) ) )
            {
              parses = ConsesLow.cons( item_var, parses );
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          block_id = cdolist_list_var.first();
        }
        ans = ConsesLow.cons( ConsesLow.list( span, parses ), ans );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return Sort.sort( ans, $sym174$INTERVAL_SPAN_PRECEDES_, Symbols.symbol_function( $sym175$FIRST ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 56997L)
  public static SubLObject display_all_trees(final SubLObject chart)
  {
    final SubLObject block_hash = rbp_chart_parser.rbp_chart_block_hash( chart );
    SubLObject cdolist_list_var = rbp_chart_parser.rbp_chart_lookup( rbp_chart_parser.rbp_chart_max_span( chart ), chart );
    SubLObject block = NIL;
    block = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      display_tree( block, block_hash );
      cdolist_list_var = cdolist_list_var.rest();
      block = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 57216L)
  public static SubLObject display_tree(final SubLObject block, final SubLObject block_hash)
  {
    print_high.princ( block, UNPROVIDED );
    final SubLObject sub_tree = nc_block_sub_tree( block );
    if( NIL != sub_tree )
    {
      SubLObject current;
      final SubLObject datum = current = sub_tree;
      SubLObject rbp_rule = NIL;
      SubLObject dtr1_id = NIL;
      SubLObject dtr2_id = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list176 );
      rbp_rule = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list176 );
      dtr1_id = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list176 );
      dtr2_id = current.first();
      current = current.rest();
      if( NIL == current )
      {
        PrintLow.format( T, $str177$_S__, rbp_rule_bank.rbp_rule_cycl( rbp_rule ) );
        display_tree( rbp_chart_parser.rbp_chart_block_hash_lookup( dtr1_id, block_hash ), block_hash );
        display_tree( rbp_chart_parser.rbp_chart_block_hash_lookup( dtr2_id, block_hash ), block_hash );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list176 );
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 57621L)
  public static SubLObject rbp_rule_count()
  {
    return rbp_rule_bank.rbp_rb_rule_count();
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 57805L)
  public static SubLObject rbp_rule_cycl_semx(final SubLObject rule_cycl, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = parsing_vars.$rbp_rule_lookup_mt$.getGlobalValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject raw_gaf_value = kb_mapping_utilities.fpred_value( rule_cycl, $const178$ncRuleTemplate, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL != raw_gaf_value )
      {
        ans = rbp_rule_bank.rbp_forts_to_keywords( function_terms.nart_to_naut( raw_gaf_value ) );
      }
      raw_gaf_value = NIL;
      final SubLObject pred_var = $const179$ncRuleTemplate_Compact;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( rule_cycl, ONE_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( rule_cycl, ONE_INTEGER, pred_var );
        SubLObject done_var = ans;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw138$GAF, $kw180$TRUE, NIL );
              SubLObject done_var_$23 = ans;
              final SubLObject token_var_$24 = NIL;
              while ( NIL == done_var_$23)
              {
                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$24 );
                final SubLObject valid_$25 = makeBoolean( !token_var_$24.eql( assertion ) );
                if( NIL != valid_$25 )
                {
                  raw_gaf_value = assertions_high.gaf_arg( assertion, TWO_INTEGER );
                  thread.resetMultipleValues();
                  final SubLObject success = formula_pattern_match.formula_matches_pattern( raw_gaf_value, $list181 );
                  final SubLObject v_bindings = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  if( NIL != success )
                  {
                    final SubLObject indexical2 = list_utilities.alist_lookup_without_values( v_bindings, $sym182$INDEXICAL2, UNPROVIDED, UNPROVIDED );
                    final SubLObject bin_pred = list_utilities.alist_lookup_without_values( v_bindings, $sym183$BIN_PRED, UNPROVIDED, UNPROVIDED );
                    final SubLObject indexical3 = list_utilities.alist_lookup_without_values( v_bindings, $sym184$INDEXICAL1, UNPROVIDED, UNPROVIDED );
                    final SubLObject fn = list_utilities.alist_lookup_without_values( v_bindings, $sym185$FN, UNPROVIDED, UNPROVIDED );
                    ans = rbp_rule_bank.rbp_forts_to_keywords( el_utilities.make_ternary_formula( fn, indexical3, bin_pred, indexical2 ) );
                  }
                }
                done_var_$23 = makeBoolean( NIL == valid_$25 || NIL != ans );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$26, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid || NIL != ans );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 58709L)
  public static SubLObject rbp_rule_okP(final SubLObject rule_cycl)
  {
    if( NIL == rbp_rule_cycl_semx( rule_cycl, UNPROVIDED ) )
    {
      return NIL;
    }
    final SubLObject constraints = rbp_rule_bank.rbp_rule_constraints( rule_cycl );
    if( NIL == constraints )
    {
      return NIL;
    }
    if( NIL == Sequences.find_if( $sym186$RBP_SEMANTIC_CONSTRAINT_P, constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL == Sequences.find_if( $sym187$RBP_WORD_UNIT_CONSTRAINT_P, constraints, UNPROVIDED, UNPROVIDED,
        UNPROVIDED ) )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 59446L)
  public static SubLObject rbp_domain_mt()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return parsing_vars.$parsing_domain_mt$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 59508L)
  public static SubLObject rbp_get_cognate_from_instance_level_arg(final SubLObject pred)
  {
    final SubLObject cognates = kb_mapping.gather_gaf_arg_index( pred, ONE_INTEGER, $const188$typeLevelCognates, $const189$BaseKB, UNPROVIDED );
    if( NIL != list_utilities.singletonP( cognates ) )
    {
      return cycl_utilities.formula_arg2( cognates.first(), UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 59911L)
  public static SubLObject rbp_get_cognate_from_type_level_arg(final SubLObject pred)
  {
    final SubLObject cognates = kb_mapping.gather_gaf_arg_index( pred, TWO_INTEGER, $const188$typeLevelCognates, $const189$BaseKB, UNPROVIDED );
    if( NIL != list_utilities.singletonP( cognates ) )
    {
      return cycl_utilities.formula_arg1( cognates.first(), UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 60131L)
  public static SubLObject rbp_semx_type_level_cognate(final SubLObject semx)
  {
    if( NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP( semx ) )
    {
      SubLObject func = NIL;
      SubLObject focal_col = NIL;
      SubLObject pred = NIL;
      SubLObject other_col = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( semx, semx, $list190 );
      func = semx.first();
      SubLObject current = semx.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, semx, $list190 );
      focal_col = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, semx, $list190 );
      pred = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, semx, $list190 );
      other_col = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL != isa.isa_in_any_mtP( func, $const191$SubcollectionRelationFunction_Ins ) )
        {
          final SubLObject inst_level_pred = rbp_get_cognate_from_type_level_arg( pred );
          final SubLObject type_level_func = rbp_get_cognate_from_instance_level_arg( func );
          if( NIL != inst_level_pred )
          {
            return ConsesLow.list( type_level_func, focal_col, inst_level_pred, other_col );
          }
        }
        else
        {
          final SubLObject type_level_pred = rbp_get_cognate_from_instance_level_arg( pred );
          final SubLObject inst_level_func = rbp_get_cognate_from_type_level_arg( func );
          if( NIL != type_level_pred )
          {
            return ConsesLow.list( inst_level_func, focal_col, type_level_pred, other_col );
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( semx, $list190 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 61457L)
  public static SubLObject ncp_ask_variable(final SubLObject var, final SubLObject sentence, final SubLObject mt, SubLObject backchain)
  {
    if( backchain == UNPROVIDED )
    {
      backchain = ZERO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject query_properties = ConsesLow.list( $kw192$PROBLEM_STORE, $ncp_problem_store$.getDynamicValue( thread ), $kw193$MAX_TRANSFORMATION_DEPTH, backchain );
    return ask_utilities.query_variable( var, sentence, mt, query_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 61898L)
  public static SubLObject rbp_subcol_naut_fails_inter_arg_checksP(final SubLObject quasi_gaf, final SubLObject from_arg, final SubLObject to_arg, SubLObject mt, SubLObject type_level_predP)
  {
    if( mt == UNPROVIDED )
    {
      mt = rbp_domain_mt();
    }
    if( type_level_predP == UNPROVIDED )
    {
      type_level_predP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject failure_message = NIL;
    final SubLObject pred = cycl_utilities.formula_arg0( quasi_gaf );
    final SubLObject to_term = cycl_utilities.formula_arg( quasi_gaf, to_arg, UNPROVIDED );
    final SubLObject from_term = cycl_utilities.formula_arg( quasi_gaf, from_arg, UNPROVIDED );
    if( NIL != $rbp_use_inter_arg_isa_filtersP$.getDynamicValue( thread ) )
    {
      if( NIL == failure_message )
      {
        SubLObject csome_list_var;
        SubLObject dep_col;
        for( csome_list_var = rbp_get_dep_cols( from_arg, to_arg, pred, from_term, mt ), dep_col = NIL, dep_col = csome_list_var.first(); NIL == failure_message
            && NIL != csome_list_var; failure_message = rbp_subcol_naut_do_inter_arg_test( $kw194$ISA, to_term, narts_high.nart_substitute( dep_col ), mt, type_level_predP ), csome_list_var = csome_list_var
                .rest(), dep_col = csome_list_var.first() )
        {
        }
      }
      if( NIL == failure_message )
      {
        SubLObject csome_list_var;
        SubLObject dep_col;
        for( csome_list_var = rbp_get_dep_cols( to_arg, from_arg, pred, to_term, mt ), dep_col = NIL, dep_col = csome_list_var.first(); NIL == failure_message
            && NIL != csome_list_var; failure_message = rbp_subcol_naut_do_inter_arg_test( $kw194$ISA, from_term, narts_high.nart_substitute( dep_col ), mt, type_level_predP ), csome_list_var = csome_list_var
                .rest(), dep_col = csome_list_var.first() )
        {
        }
      }
    }
    if( NIL != $rbp_use_inter_arg_not_isa_filtersP$.getDynamicValue( thread ) && !pred.eql( $const195$geopoliticalSubdivision ) )
    {
      if( NIL != kb_indexing_datastructures.indexed_term_p( from_term ) )
      {
        if( NIL == failure_message )
        {
          SubLObject csome_list_var;
          SubLObject dep_col;
          for( csome_list_var = ncp_ask_variable( $sym197$_COL, ConsesLow.listS( $const198$interArgNotIsa, pred, from_arg, from_term, to_arg, $list199 ), mt, ONE_INTEGER ), dep_col = NIL, dep_col = csome_list_var
              .first(); NIL == failure_message && NIL != csome_list_var; failure_message = rbp_subcol_naut_do_inter_arg_test( $kw196$NOT_ISA, to_term, narts_high.nart_substitute( dep_col ), mt,
                  type_level_predP ), csome_list_var = csome_list_var.rest(), dep_col = csome_list_var.first() )
          {
          }
        }
      }
      else if( NIL != kb_indexing_datastructures.indexed_term_p( to_term ) && NIL == failure_message )
      {
        SubLObject csome_list_var;
        SubLObject dep_col;
        for( csome_list_var = ncp_ask_variable( $sym197$_COL, ConsesLow.listS( $const198$interArgNotIsa, pred, to_arg, to_term, from_arg, $list199 ), mt, ONE_INTEGER ), dep_col = NIL, dep_col = csome_list_var
            .first(); NIL == failure_message && NIL != csome_list_var; failure_message = rbp_subcol_naut_do_inter_arg_test( $kw196$NOT_ISA, from_term, narts_high.nart_substitute( dep_col ), mt,
                type_level_predP ), csome_list_var = csome_list_var.rest(), dep_col = csome_list_var.first() )
        {
        }
      }
    }
    if( NIL != failure_message )
    {
      Errors.warn( failure_message );
    }
    return failure_message;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 63626L)
  public static SubLObject rbp_get_dep_cols(final SubLObject ind_arg, final SubLObject dep_arg, final SubLObject pred, final SubLObject ind_term, final SubLObject mt)
  {
    return ncp_ask_variable( $sym197$_COL, ConsesLow.listS( $const200$interArgIsa, pred, ind_arg, ind_term, dep_arg, $list199 ), mt, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 63791L)
  public static SubLObject rbp_subcol_naut_do_inter_arg_test(final SubLObject test_type, final SubLObject v_term, final SubLObject dep_col, final SubLObject mt, final SubLObject type_level_predP)
  {
    SubLObject failure_message = NIL;
    if( test_type.eql( $kw194$ISA ) )
    {
      if( NIL != type_level_predP && NIL == rbp_wff.npp_isaP( v_term, dep_col, mt ) )
      {
        failure_message = PrintLow.format( NIL, $str201$____but__A_has_to_be_an_instance_, new SubLObject[] { v_term, dep_col, mt
        } );
      }
      else if( NIL == type_level_predP && NIL == rbp_wff.npp_not_disjointP( v_term, dep_col, mt ) )
      {
        failure_message = PrintLow.format( NIL, $str202$____but__A_has_to_intersect__A_in, new SubLObject[] { v_term, dep_col, mt
        } );
      }
    }
    else if( test_type.eql( $kw196$NOT_ISA ) )
    {
      if( NIL != type_level_predP && NIL != rbp_wff.npp_isaP( v_term, dep_col, mt ) )
      {
        failure_message = PrintLow.format( NIL, $str203$____but__A_can_t_be_an_instance_o, new SubLObject[] { v_term, dep_col, mt
        } );
      }
      else if( NIL == type_level_predP && NIL != rbp_wff.npp_genlP( v_term, dep_col, mt ) )
      {
        failure_message = PrintLow.format( NIL, $str204$____but__A_can_t_be_a_spec_of__A_, new SubLObject[] { v_term, dep_col, mt
        } );
      }
    }
    return failure_message;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 64809L)
  public static SubLObject rbp_inter_arg_isa_pred(final SubLObject from_arg, final SubLObject to_arg)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pred = constants_high.find_constant( PrintLow.format( NIL, $str205$interArgIsa_D__D, from_arg, to_arg ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == constant_handles.valid_constant( pred, UNPROVIDED ) )
    {
      Errors.error( $str206$Couldn_t_find_inter_arg_isa_predi, from_arg, to_arg );
    }
    return pred;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 65107L)
  public static SubLObject rbp_inter_arg_not_isa_pred(final SubLObject one_arg, final SubLObject other_arg)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject pred = constants_high.find_constant( PrintLow.format( NIL, $str207$interArgNotIsa_D__D, one_arg, other_arg ) );
    if( NIL == constant_handles.valid_constant( pred, UNPROVIDED ) )
    {
      pred = constants_high.find_constant( PrintLow.format( NIL, $str207$interArgNotIsa_D__D, other_arg, one_arg ) );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == constant_handles.valid_constant( pred, UNPROVIDED ) )
    {
      Errors.error( $str208$Couldn_t_find_inter_arg_not_isa_p, one_arg, other_arg );
    }
    return pred;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 65588L)
  public static SubLObject rbp_binary_gaf_fails_inter_arg_checksP(final SubLObject gaf, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = rbp_domain_mt();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject diag = NIL;
    SubLObject semx_pred = NIL;
    SubLObject arg1 = NIL;
    SubLObject arg2 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( gaf, gaf, $list209 );
    semx_pred = gaf.first();
    SubLObject current = gaf.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, gaf, $list209 );
    arg1 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, gaf, $list209 );
    arg2 = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        SubLObject pred_var = $const210$interArgIsa1_2;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( semx_pred, ONE_INTEGER, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( semx_pred, ONE_INTEGER, pred_var );
          SubLObject done_var = diag;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw138$GAF, NIL, NIL );
                SubLObject done_var_$27 = diag;
                final SubLObject token_var_$28 = NIL;
                while ( NIL == done_var_$27)
                {
                  final SubLObject ia_gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$28 );
                  final SubLObject valid_$29 = makeBoolean( !token_var_$28.eql( ia_gaf ) );
                  if( NIL != valid_$29 && NIL != isa.isaP( arg1, cycl_utilities.formula_arg2( ia_gaf, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) && NIL == isa.isaP( arg2, cycl_utilities.formula_arg3( ia_gaf, UNPROVIDED ),
                      UNPROVIDED, UNPROVIDED ) )
                  {
                    diag = PrintLow.format( NIL, $str211$___but_it_fails_the_inter_arg_con, ia_gaf );
                  }
                  done_var_$27 = makeBoolean( NIL == valid_$29 || NIL != diag );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$30, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid || NIL != diag );
          }
        }
        pred_var = $const212$interArgIsa2_1;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( semx_pred, ONE_INTEGER, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( semx_pred, ONE_INTEGER, pred_var );
          SubLObject done_var = diag;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw138$GAF, NIL, NIL );
                SubLObject done_var_$28 = diag;
                final SubLObject token_var_$29 = NIL;
                while ( NIL == done_var_$28)
                {
                  final SubLObject ia_gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$29 );
                  final SubLObject valid_$30 = makeBoolean( !token_var_$29.eql( ia_gaf ) );
                  if( NIL != valid_$30 && NIL != isa.isaP( arg2, cycl_utilities.formula_arg2( ia_gaf, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) && NIL == isa.isaP( arg1, cycl_utilities.formula_arg3( ia_gaf, UNPROVIDED ),
                      UNPROVIDED, UNPROVIDED ) )
                  {
                    diag = PrintLow.format( NIL, $str211$___but_it_fails_the_inter_arg_con, ia_gaf );
                  }
                  done_var_$28 = makeBoolean( NIL == valid_$30 || NIL != diag );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$31 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values2 = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values2 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$31, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid || NIL != diag );
          }
        }
        if( !semx_pred.eql( $const195$geopoliticalSubdivision ) )
        {
          pred_var = $const213$interArgNotIsa1_2;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( semx_pred, ONE_INTEGER, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( semx_pred, ONE_INTEGER, pred_var );
            SubLObject done_var = diag;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw138$GAF, NIL, NIL );
                  SubLObject done_var_$29 = diag;
                  final SubLObject token_var_$30 = NIL;
                  while ( NIL == done_var_$29)
                  {
                    final SubLObject ia_gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$30 );
                    final SubLObject valid_$31 = makeBoolean( !token_var_$30.eql( ia_gaf ) );
                    if( NIL != valid_$31 && NIL != isa.isaP( arg1, cycl_utilities.formula_arg2( ia_gaf, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) && NIL != isa.isaP( arg2, cycl_utilities.formula_arg3( ia_gaf, UNPROVIDED ),
                        UNPROVIDED, UNPROVIDED ) )
                    {
                      diag = PrintLow.format( NIL, $str211$___but_it_fails_the_inter_arg_con, ia_gaf );
                    }
                    done_var_$29 = makeBoolean( NIL == valid_$31 || NIL != diag );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$32 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values3 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values3 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$32, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid || NIL != diag );
            }
          }
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( gaf, $list209 );
    }
    return diag;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 66741L)
  public static SubLObject rbp_fails_wff_workaroundsP(final SubLObject rule, final SubLObject semx, SubLObject skip_cognateP)
  {
    if( skip_cognateP == UNPROVIDED )
    {
      skip_cognateP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject verboseP = makeBoolean( NIL != subl_promotions.memberP( rule, rbp_traced_rules(), UNPROVIDED, UNPROVIDED ) || NIL != $rbp_show_successful_rulesP$.getDynamicValue( thread ) );
    final SubLObject wff_domain = rbp_domain_mt();
    if( NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP( semx ) )
    {
      SubLObject func = NIL;
      SubLObject col1 = NIL;
      SubLObject semx_pred = NIL;
      SubLObject col2 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( semx, semx, $list214 );
      func = semx.first();
      SubLObject current = semx.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, semx, $list214 );
      col1 = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, semx, $list214 );
      semx_pred = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, semx, $list214 );
      col2 = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject focal_arg = ( NIL != isa.isaP( func, $const215$SubcollectionRelationFunction_Can, $const216$UniversalVocabularyMt, UNPROVIDED ) ) ? ONE_INTEGER : TWO_INTEGER;
        final SubLObject focal_col = narts_high.nart_substitute( focal_arg.numE( ONE_INTEGER ) ? col1 : col2 );
        final SubLObject other_col = narts_high.nart_substitute( focal_arg.numE( ONE_INTEGER ) ? col2 : col1 );
        final SubLObject diag = rbp_subcol_naut_fails_inter_arg_checksP( ConsesLow.list( semx_pred, focal_col, other_col ), ONE_INTEGER, TWO_INTEGER, wff_domain, isa.isa_in_any_mtP( func,
            $const191$SubcollectionRelationFunction_Ins ) );
        if( NIL != diag )
        {
          if( NIL != verboseP )
          {
            PrintLow.format( T, $str217$_A__, diag );
          }
          return T;
        }
        if( NIL != forts.fort_p( semx_pred ) && NIL != rbp_wff.npp_genl_predP( semx_pred, $const218$groupMembers ) )
        {
          SubLObject badP = NIL;
          final SubLObject focal_possibly_fort = narts_high.nart_substitute( focal_col );
          if( NIL != forts.fort_p( focal_possibly_fort ) )
          {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( wff_domain );
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
            try
            {
              mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
              mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
              mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
              SubLObject cdolist_list_var = genls.asserted_genls( focal_possibly_fort, UNPROVIDED );
              SubLObject genl = NIL;
              genl = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                if( ( cycl_utilities.formula_arg0( genl ).eql( $const219$GroupFn ) || cycl_utilities.formula_arg0( genl ).eql( $const220$GroupOfCardinalityFn ) ) && NIL == genls.genlP( other_col, cycl_utilities
                    .formula_arg1( genl, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) )
                {
                  if( NIL != verboseP )
                  {
                    PrintLow.format( T, $str221$___but_it_failed_the_groupMembers, new SubLObject[] { focal_possibly_fort, cycl_utilities.formula_arg1( genl, UNPROVIDED ), other_col
                    } );
                  }
                  badP = T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                genl = cdolist_list_var.first();
              }
            }
            finally
            {
              mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
              mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
              mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
            }
          }
          if( NIL != badP )
          {
            return T;
          }
        }
        if( NIL == skip_cognateP )
        {
          return rbp_fails_wff_workaroundsP( rule, rbp_semx_type_level_cognate( semx ), T );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( semx, $list214 );
      }
    }
    if( NIL != el_utilities.el_binary_formula_p( semx ) )
    {
      SubLObject semx_pred2 = NIL;
      SubLObject arg1 = NIL;
      SubLObject arg2 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( semx, semx, $list209 );
      semx_pred2 = semx.first();
      SubLObject current = semx.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, semx, $list209 );
      arg1 = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, semx, $list209 );
      arg2 = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL != isa.isa_in_any_mtP( semx_pred2, $const222$Predicate ) )
        {
          final SubLObject diag2 = rbp_binary_gaf_fails_inter_arg_checksP( semx, wff_domain );
          if( NIL != diag2 )
          {
            if( NIL != verboseP )
            {
              PrintLow.format( T, $str217$_A__, diag2 );
            }
            return T;
          }
        }
        if( NIL != rbp_wff.npp_genl_predP( semx_pred2, $const144$cityInState ) && cycl_utilities.formula_arg0( narts_high.nart_expand( arg1 ) ).eql( $const142$CityNamedFn ) && !cycl_utilities.formula_arg2( narts_high
            .nart_expand( arg1 ), UNPROVIDED ).eql( arg2 ) )
        {
          if( NIL != verboseP )
          {
            PrintLow.format( T, $str223$___but_the___CityNamedFn_arg2_doe, cycl_utilities.formula_arg2( narts_high.nart_expand( arg1 ), UNPROVIDED ), arg2 );
          }
          return T;
        }
        if( NIL != isa.isa_in_any_mtP( semx_pred2, $const224$StrictlyFunctionalSlot ) )
        {
          SubLObject badP2 = NIL;
          final SubLObject mt_var2 = mt_relevance_macros.with_inference_mt_relevance_validate( wff_domain );
          final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding( thread );
          final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_6 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var2 ), thread );
            mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var2 ), thread );
            mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var2 ), thread );
            final SubLObject _prev_bind_0_$39 = pred_relevance_macros.$relevant_pred_function$.currentBinding( thread );
            final SubLObject _prev_bind_1_$40 = pred_relevance_macros.$pred$.currentBinding( thread );
            try
            {
              pred_relevance_macros.$relevant_pred_function$.bind( $sym225$RELEVANT_PRED_IS_SPEC_PRED, thread );
              pred_relevance_macros.$pred$.bind( semx_pred2, thread );
              final SubLObject pred_var = NIL;
              if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( arg1, ONE_INTEGER, pred_var ) )
              {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( arg1, ONE_INTEGER, pred_var );
                SubLObject done_var = badP2;
                final SubLObject token_var = NIL;
                while ( NIL == done_var)
                {
                  final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
                  final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
                  if( NIL != valid )
                  {
                    SubLObject final_index_iterator = NIL;
                    try
                    {
                      final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw138$GAF, $kw180$TRUE, NIL );
                      SubLObject done_var_$41 = badP2;
                      final SubLObject token_var_$42 = NIL;
                      while ( NIL == done_var_$41)
                      {
                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$42 );
                        final SubLObject valid_$43 = makeBoolean( !token_var_$42.eql( assertion ) );
                        if( NIL != valid_$43 )
                        {
                          final SubLObject should_be = kb_gp_mapping.dgaivgp_arg( assertion, TWO_INTEGER );
                          if( !should_be.equal( arg2 ) )
                          {
                            if( NIL != verboseP )
                            {
                              PrintLow.format( T, $str226$___but_it_failed_the_strictly_fun, new SubLObject[] { semx_pred2, arg1, should_be
                              } );
                            }
                            badP2 = T;
                          }
                        }
                        done_var_$41 = makeBoolean( NIL == valid_$43 || NIL != badP2 );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$40 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        final SubLObject _values = Values.getValuesAsVector();
                        if( NIL != final_index_iterator )
                        {
                          kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                        }
                        Values.restoreValuesFromVector( _values );
                      }
                      finally
                      {
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$40, thread );
                      }
                    }
                  }
                  done_var = makeBoolean( NIL == valid || NIL != badP2 );
                }
              }
            }
            finally
            {
              pred_relevance_macros.$pred$.rebind( _prev_bind_1_$40, thread );
              pred_relevance_macros.$relevant_pred_function$.rebind( _prev_bind_0_$39, thread );
            }
            if( NIL != kb_gp_mapping.dgaigp_binaryP( semx_pred2 ) )
            {
              final SubLObject _prev_bind_0_$41 = pred_relevance_macros.$relevant_pred_function$.currentBinding( thread );
              final SubLObject _prev_bind_1_$41 = pred_relevance_macros.$pred$.currentBinding( thread );
              try
              {
                pred_relevance_macros.$relevant_pred_function$.bind( $sym227$RELEVANT_PRED_IS_SPEC_INVERSE, thread );
                pred_relevance_macros.$pred$.bind( semx_pred2, thread );
                final SubLObject pred_var = NIL;
                if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( arg1, arity.binary_arg_swap( ONE_INTEGER ), pred_var ) )
                {
                  final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( arg1, arity.binary_arg_swap( ONE_INTEGER ), pred_var );
                  SubLObject done_var = badP2;
                  final SubLObject token_var = NIL;
                  while ( NIL == done_var)
                  {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
                    final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
                    if( NIL != valid )
                    {
                      SubLObject final_index_iterator = NIL;
                      try
                      {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw138$GAF, $kw180$TRUE, NIL );
                        SubLObject done_var_$42 = badP2;
                        final SubLObject token_var_$43 = NIL;
                        while ( NIL == done_var_$42)
                        {
                          final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$43 );
                          final SubLObject valid_$44 = makeBoolean( !token_var_$43.eql( assertion ) );
                          if( NIL != valid_$44 )
                          {
                            final SubLObject _prev_bind_0_$42 = kb_gp_mapping.$mapping_arg_swap$.currentBinding( thread );
                            try
                            {
                              kb_gp_mapping.$mapping_arg_swap$.bind( makeBoolean( NIL == kb_gp_mapping.$mapping_arg_swap$.getDynamicValue( thread ) ), thread );
                              final SubLObject should_be2 = kb_gp_mapping.dgaivgp_arg( assertion, TWO_INTEGER );
                              if( !should_be2.equal( arg2 ) )
                              {
                                if( NIL != verboseP )
                                {
                                  PrintLow.format( T, $str226$___but_it_failed_the_strictly_fun, new SubLObject[] { semx_pred2, arg1, should_be2
                                  } );
                                }
                                badP2 = T;
                              }
                            }
                            finally
                            {
                              kb_gp_mapping.$mapping_arg_swap$.rebind( _prev_bind_0_$42, thread );
                            }
                          }
                          done_var_$42 = makeBoolean( NIL == valid_$44 || NIL != badP2 );
                        }
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$43 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                        try
                        {
                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                          final SubLObject _values2 = Values.getValuesAsVector();
                          if( NIL != final_index_iterator )
                          {
                            kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                          }
                          Values.restoreValuesFromVector( _values2 );
                        }
                        finally
                        {
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$43, thread );
                        }
                      }
                    }
                    done_var = makeBoolean( NIL == valid || NIL != badP2 );
                  }
                }
              }
              finally
              {
                pred_relevance_macros.$pred$.rebind( _prev_bind_1_$41, thread );
                pred_relevance_macros.$relevant_pred_function$.rebind( _prev_bind_0_$41, thread );
              }
            }
          }
          finally
          {
            mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_6, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_5, thread );
            mt_relevance_macros.$mt$.rebind( _prev_bind_4, thread );
          }
          if( NIL != badP2 )
          {
            return T;
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( semx, $list209 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 70322L)
  public static SubLObject rbp_rb_combine_noun_compound_blocks(final SubLObject block1, final SubLObject block2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    rbp_rule_bank.rbp_rb_check_initialization();
    if( NIL != rbp_traced_rules() )
    {
      PrintLow.format( T, $str228$__Trying_this_block_pair_____S___, new SubLObject[] { nc_block_spanned_string( block1 ), nc_block_denot( block1 ), nc_block_head_string_pred( block1 ), nc_block_spanned_string( block2 ),
        nc_block_denot( block2 ), nc_block_head_string_pred( block2 )
      } );
    }
    final SubLObject successful_rules = rbp_rb_rules_matching_blocks( block1, block2 );
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = successful_rules;
    SubLObject rule = NIL;
    rule = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != rbp_rb_blocks_pass_inter_constraintsP( block1, block2, rule ) )
      {
        final SubLObject rule_cycl = rbp_rule_bank.rbp_rule_cycl( rule );
        final SubLObject base_semx = rbp_rule_cycl_semx( rule_cycl, UNPROVIDED );
        thread.resetMultipleValues();
        SubLObject semx = combine_blocks_with_template( block1, block2, base_semx, UNPROVIDED );
        SubLObject wff_result = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != subl_promotions.memberP( rule, rbp_traced_rules(), UNPROVIDED, UNPROVIDED ) || NIL != $rbp_show_successful_rulesP$.getDynamicValue( thread ) )
        {
          PrintLow.format( T, $str229$__Rule__S_yielded____a___for__S__, new SubLObject[] { rule, semx, nc_block_spanned_string( block1 ), nc_block_spanned_string( block2 )
          } );
        }
        if( wff_result != $kw230$WFF )
        {
          if( NIL != subl_promotions.memberP( rule, rbp_traced_rules(), UNPROVIDED, UNPROVIDED ) || NIL != $rbp_show_successful_rulesP$.getDynamicValue( thread ) )
          {
            PrintLow.format( T, $str231$___but_it_failed_the_wff_checker_ );
            final SubLObject _prev_bind_0 = rbp_wff.$rbp_show_non_wffP$.currentBinding( thread );
            try
            {
              rbp_wff.$rbp_show_non_wffP$.bind( T, thread );
              rbp_wff.rbp_wff_clear_caches();
              rbp_wff.rbp_wf_natP( semx, parsing_vars.$np_wff_filter_level$.getDynamicValue( thread ) );
            }
            finally
            {
              rbp_wff.$rbp_show_non_wffP$.rebind( _prev_bind_0, thread );
            }
          }
        }
        else if( !parsing_vars.$np_wff_filter_level$.getDynamicValue( thread ).numG( ZERO_INTEGER ) || NIL == rbp_fails_wff_workaroundsP( rule, semx, UNPROVIDED ) )
        {
          SubLObject formula_arg_fn_nautP = Equality.eql( cycl_utilities.formula_arg0( semx ), $const232$FormulaArgFn );
          while ( NIL != formula_arg_fn_nautP)
          {
            SubLObject current;
            final SubLObject datum = current = cycl_utilities.formula_args( semx, UNPROVIDED );
            SubLObject just_this_arg = NIL;
            SubLObject formula = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list233 );
            just_this_arg = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list233 );
            formula = current.first();
            current = current.rest();
            if( NIL == current )
            {
              if( NIL != subl_promotions.positive_integer_p( just_this_arg ) && just_this_arg.numG( el_utilities.formula_arity( semx, UNPROVIDED ) ) && ( NIL != subl_promotions.memberP( rule, rbp_traced_rules(),
                  UNPROVIDED, UNPROVIDED ) || NIL != $rbp_show_successful_rulesP$.getDynamicValue( thread ) ) )
              {
                PrintLow.format( T, $str234$___but_the_desired_FormulaArgFn__, just_this_arg, el_utilities.formula_arity( semx, UNPROVIDED ) );
                wff_result = $kw235$NOT_WFF;
              }
              formula_arg_fn_nautP = Equality.eql( cycl_utilities.formula_arg0( formula ), $const232$FormulaArgFn );
              if( NIL == formula_arg_fn_nautP )
              {
                final SubLObject verifiedP = rbp_verify( formula, UNPROVIDED );
                if( NIL == verifiedP )
                {
                  wff_result = $kw236$NON_WFF;
                  if( NIL != subl_promotions.memberP( rule, rbp_traced_rules(), UNPROVIDED, UNPROVIDED ) || NIL != $rbp_show_successful_rulesP$.getDynamicValue( thread ) )
                  {
                    PrintLow.format( T, $str237$___but_I_was_unable_to_verify__S_, formula );
                  }
                }
              }
              semx = cycl_utilities.formula_arg( formula, just_this_arg, UNPROVIDED );
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum, $list233 );
            }
          }
          if( $kw230$WFF == wff_result )
          {
            ans = ConsesLow.cons( ConsesLow.list( rule, semx ), ans );
          }
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      rule = cdolist_list_var.first();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 72999L)
  public static SubLObject rbp_rb_rules_matching_blocks(final SubLObject block1, final SubLObject block2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject closed_matches = rbp_rb_rules_matching_blocks_wrt_closed_constraints( block1, block2, UNPROVIDED );
    final SubLObject surviving_traced_rules = ( NIL != rbp_traced_rules() ) ? ( closed_matches.isList() ? keyhash_utilities.fast_intersection( rbp_traced_rules(), closed_matches, UNPROVIDED, UNPROVIDED, UNPROVIDED )
        : rbp_traced_rules() ) : NIL;
    thread.resetMultipleValues();
    final SubLObject block1_rules = rbp_rb_search_wrt_open_constraints( block1, $kw238$MODIFIER, closed_matches, surviving_traced_rules );
    final SubLObject new_surviving_traced_rules = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return ( NIL != block1_rules ) ? rbp_rb_search_wrt_open_constraints( block2, $kw75$HEAD, block1_rules, new_surviving_traced_rules ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 73838L)
  public static SubLObject rbp_rb_rules_matching_blocks_wrt_closed_constraints(final SubLObject block1, final SubLObject block2, SubLObject destructibleP)
  {
    if( destructibleP == UNPROVIDED )
    {
      destructibleP = T;
    }
    final SubLObject bases = ConsesLow.make_list( FOUR_INTEGER, UNPROVIDED );
    SubLObject list_var = NIL;
    SubLObject filter_key = NIL;
    SubLObject i = NIL;
    list_var = $rbp_rb_closed_class_filter_keys$.getGlobalValue();
    filter_key = list_var.first();
    for( i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), filter_key = list_var.first(), i = Numbers.add( ONE_INTEGER, i ) )
    {
      SubLObject current;
      final SubLObject datum = current = filter_key;
      SubLObject c_type = NIL;
      SubLObject o_type = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list240 );
      c_type = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list240 );
      o_type = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject block3 = ( o_type == $kw238$MODIFIER ) ? block1 : block2;
        final SubLObject base = rbp_base_from_block( block3, c_type );
        ConsesLow.set_nth( i, bases, base );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list240 );
      }
    }
    final SubLObject closed_matches = rbp_rb_rules_matching_closed_specs( bases );
    return ( NIL != destructibleP ) ? conses_high.copy_list( closed_matches ) : closed_matches;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 74590L)
  public static SubLObject clear_rbp_rb_rules_matching_closed_specs()
  {
    final SubLObject cs = $rbp_rb_rules_matching_closed_specs_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 74590L)
  public static SubLObject remove_rbp_rb_rules_matching_closed_specs(final SubLObject bases)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $rbp_rb_rules_matching_closed_specs_caching_state$.getGlobalValue(), ConsesLow.list( bases ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 74590L)
  public static SubLObject rbp_rb_rules_matching_closed_specs_internal(final SubLObject bases)
  {
    SubLObject no_matchP = NIL;
    SubLObject candidate_matches = $kw242$ALL;
    final SubLObject surviving_traced_rules = NIL;
    if( NIL == no_matchP )
    {
      SubLObject base = NIL;
      SubLObject base_$52 = NIL;
      SubLObject filter_key = NIL;
      SubLObject filter_key_$53 = NIL;
      base = bases;
      base_$52 = base.first();
      filter_key = $rbp_rb_closed_class_filter_keys$.getGlobalValue();
      filter_key_$53 = filter_key.first();
      while ( NIL == no_matchP && ( NIL != filter_key || NIL != base ))
      {
        final SubLObject new_candidate_matches = rbp_rule_bank.rbp_rb_filter_rules( candidate_matches, surviving_traced_rules, filter_key_$53, base_$52 );
        if( NIL != new_candidate_matches )
        {
          candidate_matches = new_candidate_matches;
        }
        else
        {
          no_matchP = T;
        }
        base = base.rest();
        base_$52 = base.first();
        filter_key = filter_key.rest();
        filter_key_$53 = filter_key.first();
      }
    }
    return ( NIL != no_matchP ) ? NIL : candidate_matches;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 74590L)
  public static SubLObject rbp_rb_rules_matching_closed_specs(final SubLObject bases)
  {
    SubLObject caching_state = $rbp_rb_rules_matching_closed_specs_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym241$RBP_RB_RULES_MATCHING_CLOSED_SPECS, $sym243$_RBP_RB_RULES_MATCHING_CLOSED_SPECS_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER,
          ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, bases, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( rbp_rb_rules_matching_closed_specs_internal( bases ) ) );
      memoization_state.caching_state_put( caching_state, bases, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 75189L)
  public static SubLObject rbp_rb_search_wrt_open_constraints(final SubLObject block, final SubLObject o_type, final SubLObject closed_matches, final SubLObject surviving_traced_rules)
  {
    return rbp_rb_search( block, o_type, closed_matches, $kw244$OPEN_CLASS, surviving_traced_rules );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 75391L)
  public static SubLObject rbp_verify_internal(final SubLObject formula, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = parsing_vars.$parsing_domain_mt$.getDynamicValue();
    }
    return makeBoolean( NIL != term.closed_termP( formula, UNPROVIDED ) && NIL != backward.removal_ask( formula, mt, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 75391L)
  public static SubLObject rbp_verify(final SubLObject formula, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = parsing_vars.$parsing_domain_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return rbp_verify_internal( formula, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym245$RBP_VERIFY, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym245$RBP_VERIFY, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym245$RBP_VERIFY, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( formula, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( formula.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( rbp_verify_internal( formula, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( formula, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 75611L)
  public static SubLObject rbp_rb_search(final SubLObject block, final SubLObject o_type, SubLObject candidate_matches, SubLObject mode, SubLObject traced_rules)
  {
    if( candidate_matches == UNPROVIDED )
    {
      candidate_matches = $kw242$ALL;
    }
    if( mode == UNPROVIDED )
    {
      mode = $kw242$ALL;
    }
    if( traced_rules == UNPROVIDED )
    {
      traced_rules = rbp_traced_rules();
    }
    if( NIL == traced_rules && mode.equal( $kw242$ALL ) && !candidate_matches.isList() )
    {
      return conses_high.copy_list( rbp_rb_initial_search_no_tracing( block, o_type ) );
    }
    return rbp_rb_search_internal( block, o_type, candidate_matches, mode, traced_rules );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 76480L)
  public static SubLObject inference_rbp_rb_search(final SubLObject block, final SubLObject o_type, SubLObject candidate_matches, SubLObject mode, SubLObject traced_rules)
  {
    if( candidate_matches == UNPROVIDED )
    {
      candidate_matches = $kw242$ALL;
    }
    if( mode == UNPROVIDED )
    {
      mode = $kw242$ALL;
    }
    if( traced_rules == UNPROVIDED )
    {
      traced_rules = rbp_traced_rules();
    }
    return rbp_rb_search( block, o_type, candidate_matches, mode, traced_rules );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 76694L)
  public static SubLObject rbp_rb_initial_search_no_tracing_internal(final SubLObject block, final SubLObject o_type)
  {
    return rbp_rb_search_internal( block, o_type, $kw242$ALL, $kw242$ALL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 76694L)
  public static SubLObject rbp_rb_initial_search_no_tracing(final SubLObject block, final SubLObject o_type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return rbp_rb_initial_search_no_tracing_internal( block, o_type );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym246$RBP_RB_INITIAL_SEARCH_NO_TRACING, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym246$RBP_RB_INITIAL_SEARCH_NO_TRACING, TWO_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym246$RBP_RB_INITIAL_SEARCH_NO_TRACING, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( block, o_type );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( block.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && o_type.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( rbp_rb_initial_search_no_tracing_internal( block, o_type ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( block, o_type ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 76898L)
  public static SubLObject rbp_rb_search_internal(final SubLObject block, final SubLObject o_type, SubLObject candidate_matches, final SubLObject mode, final SubLObject traced_rules)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject surviving_traced_rules = candidate_matches.isList() ? keyhash_utilities.fast_intersection( traced_rules, candidate_matches, UNPROVIDED, UNPROVIDED, UNPROVIDED ) : traced_rules;
    SubLObject no_matchP = NIL;
    final SubLObject syntactic_types = rbp_rule_bank.$rbp_syntactic_constraint_types$.getGlobalValue();
    final SubLObject semantic_types = rbp_rule_bank.$rbp_semantic_constraint_types$.getGlobalValue();
    final SubLObject open_types = rbp_rule_bank.$rbp_open_class_constraint_types$.getGlobalValue();
    final SubLObject closed_types = rbp_rule_bank.$rbp_closed_class_constraint_types$.getGlobalValue();
    if( ( mode.eql( $kw242$ALL ) || mode.eql( $kw247$SYNTACTIC ) ) && NIL == no_matchP )
    {
      SubLObject csome_list_var = syntactic_types;
      SubLObject c_type = NIL;
      c_type = csome_list_var.first();
      while ( NIL == no_matchP && NIL != csome_list_var)
      {
        final SubLObject filter_key = ConsesLow.list( c_type, o_type );
        final SubLObject base = rbp_base_from_block( block, c_type );
        thread.resetMultipleValues();
        final SubLObject new_candidate_matches = rbp_rule_bank.rbp_rb_filter_rules( candidate_matches, surviving_traced_rules, filter_key, base );
        final SubLObject new_survivors = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != new_candidate_matches )
        {
          candidate_matches = new_candidate_matches;
          surviving_traced_rules = new_survivors;
        }
        else
        {
          no_matchP = T;
        }
        csome_list_var = csome_list_var.rest();
        c_type = csome_list_var.first();
      }
    }
    if( ( mode.eql( $kw242$ALL ) || mode.eql( $kw248$SEMANTIC ) ) && NIL == no_matchP )
    {
      SubLObject csome_list_var = semantic_types;
      SubLObject c_type = NIL;
      c_type = csome_list_var.first();
      while ( NIL == no_matchP && NIL != csome_list_var)
      {
        final SubLObject filter_key = ConsesLow.list( c_type, o_type );
        final SubLObject base = rbp_base_from_block( block, c_type );
        thread.resetMultipleValues();
        final SubLObject new_candidate_matches = rbp_rule_bank.rbp_rb_filter_rules( candidate_matches, surviving_traced_rules, filter_key, base );
        final SubLObject new_survivors = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != new_candidate_matches )
        {
          candidate_matches = new_candidate_matches;
          surviving_traced_rules = new_survivors;
        }
        else
        {
          no_matchP = T;
        }
        csome_list_var = csome_list_var.rest();
        c_type = csome_list_var.first();
      }
    }
    if( mode.eql( $kw244$OPEN_CLASS ) && NIL == no_matchP )
    {
      SubLObject csome_list_var = open_types;
      SubLObject c_type = NIL;
      c_type = csome_list_var.first();
      while ( NIL == no_matchP && NIL != csome_list_var)
      {
        final SubLObject filter_key = ConsesLow.list( c_type, o_type );
        final SubLObject base = rbp_base_from_block( block, c_type );
        thread.resetMultipleValues();
        final SubLObject new_candidate_matches = rbp_rule_bank.rbp_rb_filter_rules( candidate_matches, surviving_traced_rules, filter_key, base );
        final SubLObject new_survivors = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != new_candidate_matches )
        {
          candidate_matches = new_candidate_matches;
          surviving_traced_rules = new_survivors;
        }
        else
        {
          no_matchP = T;
        }
        csome_list_var = csome_list_var.rest();
        c_type = csome_list_var.first();
      }
    }
    if( mode.eql( $kw249$CLOSED_CLASS ) && NIL == no_matchP )
    {
      SubLObject csome_list_var = closed_types;
      SubLObject c_type = NIL;
      c_type = csome_list_var.first();
      while ( NIL == no_matchP && NIL != csome_list_var)
      {
        final SubLObject filter_key = ConsesLow.list( c_type, o_type );
        final SubLObject base = rbp_base_from_block( block, c_type );
        thread.resetMultipleValues();
        final SubLObject new_candidate_matches = rbp_rule_bank.rbp_rb_filter_rules( candidate_matches, surviving_traced_rules, filter_key, base );
        final SubLObject new_survivors = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != new_candidate_matches )
        {
          candidate_matches = new_candidate_matches;
          surviving_traced_rules = new_survivors;
        }
        else
        {
          no_matchP = T;
        }
        csome_list_var = csome_list_var.rest();
        c_type = csome_list_var.first();
      }
    }
    return Values.values( ( NIL != no_matchP ) ? NIL : candidate_matches, surviving_traced_rules );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 77887L)
  public static SubLObject rbp_rb_blocks_pass_inter_constraintsP(final SubLObject block1, final SubLObject block2, final SubLObject rule)
  {
    final SubLObject inter_constraints = inter_constraints_from_rule( rule );
    final SubLObject passP = blocks_pass_all_inter_nc_constraintsP( block1, block2, inter_constraints );
    if( NIL == passP && NIL != conses_high.member( rule, rbp_traced_rules(), UNPROVIDED, UNPROVIDED ) )
    {
      PrintLow.format( T, $str250$__The_blocks_failed_an_inter_cons, inter_constraints, rule );
    }
    return passP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 78447L)
  public static SubLObject clear_inter_constraints_from_rule()
  {
    final SubLObject cs = $inter_constraints_from_rule_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 78447L)
  public static SubLObject remove_inter_constraints_from_rule(final SubLObject rbp_rule)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $inter_constraints_from_rule_caching_state$.getGlobalValue(), ConsesLow.list( rbp_rule ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 78447L)
  public static SubLObject inter_constraints_from_rule_internal(final SubLObject rbp_rule)
  {
    final SubLObject rule_cycl = rbp_rule_bank.rbp_rule_cycl( rbp_rule );
    final SubLObject constraints = rbp_rule_bank.rbp_rule_constraints( rule_cycl );
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = constraints;
    SubLObject constraint = NIL;
    constraint = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != subl_promotions.memberP( $kw238$MODIFIER, constraint, UNPROVIDED, UNPROVIDED ) && NIL != conses_high.member( $kw75$HEAD, constraint, UNPROVIDED, UNPROVIDED ) )
      {
        ans = ConsesLow.cons( constraint, ans );
      }
      cdolist_list_var = cdolist_list_var.rest();
      constraint = cdolist_list_var.first();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 78447L)
  public static SubLObject inter_constraints_from_rule(final SubLObject rbp_rule)
  {
    SubLObject caching_state = $inter_constraints_from_rule_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym251$INTER_CONSTRAINTS_FROM_RULE, $sym252$_INTER_CONSTRAINTS_FROM_RULE_CACHING_STATE_, $int163$512, EQL, ONE_INTEGER, $int164$128 );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, rbp_rule, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( inter_constraints_from_rule_internal( rbp_rule ) ) );
      memoization_state.caching_state_put( caching_state, rbp_rule, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 78815L)
  public static SubLObject blocks_pass_all_inter_nc_constraintsP(final SubLObject ncb1, final SubLObject ncb2, final SubLObject constraints)
  {
    if( NIL == constraints )
    {
      return T;
    }
    SubLObject failP = NIL;
    if( NIL == failP )
    {
      SubLObject csome_list_var;
      SubLObject constraint;
      for( csome_list_var = constraints, constraint = NIL, constraint = csome_list_var.first(); NIL == failP && NIL != csome_list_var; failP = makeBoolean( NIL == blocks_pass_inter_nc_constraintP( ncb1, ncb2,
          constraint ) ), csome_list_var = csome_list_var.rest(), constraint = csome_list_var.first() )
      {
      }
    }
    return makeBoolean( NIL == failP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 79233L)
  public static SubLObject blocks_pass_inter_nc_constraintP(final SubLObject ncb1, final SubLObject ncb2, final SubLObject constraint)
  {
    SubLObject con_kw = NIL;
    SubLObject arg1 = NIL;
    SubLObject arg2 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( constraint, constraint, $list253 );
    con_kw = constraint.first();
    SubLObject current = constraint.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, constraint, $list253 );
    arg1 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, constraint, $list253 );
    arg2 = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( constraint, $list253 );
      return NIL;
    }
    final SubLObject sem1 = ( NIL != conses_high.member( arg1, $list254, UNPROVIDED, UNPROVIDED ) ) ? nc_block_denot( ncb1 ) : nc_block_denot( ncb2 );
    final SubLObject sem2 = ( NIL != conses_high.member( arg2, $list254, UNPROVIDED, UNPROVIDED ) ) ? nc_block_denot( ncb1 ) : nc_block_denot( ncb2 );
    if( $kw255$NO_DENOT == sem1 || $kw255$NO_DENOT == sem2 )
    {
      return NIL;
    }
    if( NIL != inter_nc_block_test( con_kw, sem1, sem2 ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 79920L)
  public static SubLObject inter_nc_block_test(final SubLObject keyword, final SubLObject item1, final SubLObject item2)
  {
    if( keyword.eql( $kw256$isa ) || keyword.eql( $kw194$ISA ) )
    {
      return rbp_wff.npp_isaP( item1, item2, UNPROVIDED );
    }
    if( keyword.eql( $kw257$genl ) || keyword.eql( $kw258$GENL ) )
    {
      return rbp_wff.npp_genlP( item1, item2, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 80260L)
  public static SubLObject rbp_check_initializations()
  {
    rbp_wff.rbp_wff_clear_caches();
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 80346L)
  public static SubLObject combine_blocks_with_template(final SubLObject block1, final SubLObject block2, final SubLObject raw_template, SubLObject traceP)
  {
    if( traceP == UNPROVIDED )
    {
      traceP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject comp_sem1 = nc_block_denot( block1 );
    final SubLObject comp_sem2 = nc_block_denot( block2 );
    final SubLObject keyword_bindings = ConsesLow.list( reader.bq_cons( $kw238$MODIFIER, comp_sem1 ), reader.bq_cons( $kw75$HEAD, comp_sem2 ) );
    final SubLObject new_comp_sem = rbp_wff.rbp_subst_bindings( keyword_bindings, raw_template );
    if( NIL != cycl_utilities.expression_find( $kw255$NO_DENOT, new_comp_sem, UNPROVIDED, UNPROVIDED, UNPROVIDED ) || ( parsing_vars.$np_wff_filter_level$.getDynamicValue( thread ).numG( ZERO_INTEGER ) && NIL == rbp_wff
        .rbp_wf_template_argsP( raw_template, keyword_bindings, ONE_INTEGER ) ) || ( parsing_vars.$np_wff_filter_level$.getDynamicValue( thread ).numG( ONE_INTEGER ) && NIL == rbp_wff.rbp_wf_template_argsP( raw_template,
            keyword_bindings, TWO_INTEGER ) ) )
    {
      return Values.values( new_comp_sem, $kw236$NON_WFF );
    }
    if( NIL != traceP )
    {
      PrintLow.format( T, $str259$__Semantics_are__S_and__S___in_te, new SubLObject[] { comp_sem1, comp_sem2, raw_template
      } );
    }
    return Values.values( new_comp_sem, $kw230$WFF );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 81342L)
  public static SubLObject rbp_test_for_con_kw(final SubLObject con_kw)
  {
    if( con_kw.eql( $kw260$pred ) || con_kw.eql( $kw261$PRED ) )
    {
      return $sym262$NPP_GENL_PRED_;
    }
    if( con_kw.eql( $kw263$pos ) || con_kw.eql( $kw264$POS ) )
    {
      return $sym134$NPP_GENL_;
    }
    if( con_kw.eql( $kw265$eql ) || con_kw.eql( $kw266$EQL ) || con_kw.eql( $kw82$WU ) )
    {
      return EQL;
    }
    if( con_kw.eql( $kw256$isa ) || con_kw.eql( $kw194$ISA ) )
    {
      return $sym135$NPP_ISA_;
    }
    if( con_kw.eql( $kw257$genl ) || con_kw.eql( $kw258$GENL ) )
    {
      return $sym134$NPP_GENL_;
    }
    if( con_kw.eql( $kw267$TYPE_GENL ) )
    {
      return $sym268$NPP_TYPE_GENL_;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 81699L)
  public static SubLObject rbp_candidate_fn_for_con_kw(final SubLObject con_kw)
  {
    if( con_kw.eql( $kw260$pred ) || con_kw.eql( $kw261$PRED ) )
    {
      return $sym64$NC_BLOCK_HEAD_STRING_PRED;
    }
    if( con_kw.eql( $kw263$pos ) || con_kw.eql( $kw264$POS ) )
    {
      return $sym62$NC_BLOCK_HEAD_POS;
    }
    if( con_kw.eql( $kw82$WU ) )
    {
      return $sym269$NC_BLOCK_WU;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 81946L)
  public static SubLObject rbp_get_deverbal_root(final SubLObject string, SubLObject use_mass_fallback_if_neededP)
  {
    if( use_mass_fallback_if_neededP == UNPROVIDED )
    {
      use_mass_fallback_if_neededP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject the_root = NIL;
    SubLObject has_deverbal_endingP = T;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym270$RELEVANT_MT_IS_GENL_MT, thread );
      mt_relevance_macros.$mt$.bind( lexicon_vars.$lexicon_lookup_mt$.getDynamicValue( thread ), thread );
      if( NIL != string_utilities.ends_with( string, $str271$ing, UNPROVIDED ) )
      {
        final SubLObject _prev_bind_0_$54 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_1_$55 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym270$RELEVANT_MT_IS_GENL_MT, thread );
          mt_relevance_macros.$mt$.bind( lexicon_vars.$lexicon_lookup_mt$.getDynamicValue( thread ), thread );
          if( NIL == the_root )
          {
            SubLObject csome_list_var = lexicon_accessors.words_of_stringXpred( string, $const151$gerund, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            SubLObject wu = NIL;
            wu = csome_list_var.first();
            while ( NIL == the_root && NIL != csome_list_var)
            {
              SubLObject inf = NIL;
              final SubLObject pred_var = $const272$infinitive;
              if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( wu, ONE_INTEGER, pred_var ) )
              {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( wu, ONE_INTEGER, pred_var );
                SubLObject done_var = the_root;
                final SubLObject token_var = NIL;
                while ( NIL == done_var)
                {
                  final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
                  final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
                  if( NIL != valid )
                  {
                    SubLObject final_index_iterator = NIL;
                    try
                    {
                      final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw138$GAF, NIL, NIL );
                      SubLObject done_var_$56 = the_root;
                      final SubLObject token_var_$57 = NIL;
                      while ( NIL == done_var_$56)
                      {
                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$57 );
                        final SubLObject valid_$58 = makeBoolean( !token_var_$57.eql( assertion ) );
                        if( NIL != valid_$58 )
                        {
                          inf = ( the_root = assertions_high.gaf_arg( assertion, TWO_INTEGER ) );
                        }
                        done_var_$56 = makeBoolean( NIL == valid_$58 || NIL != the_root );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$55 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        final SubLObject _values = Values.getValuesAsVector();
                        if( NIL != final_index_iterator )
                        {
                          kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                        }
                        Values.restoreValuesFromVector( _values );
                      }
                      finally
                      {
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$55, thread );
                      }
                    }
                  }
                  done_var = makeBoolean( NIL == valid || NIL != the_root );
                }
              }
              csome_list_var = csome_list_var.rest();
              wu = csome_list_var.first();
            }
          }
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_1_$55, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$54, thread );
        }
      }
      else if( NIL != string_utilities.ends_with( string, $str273$ion, UNPROVIDED ) )
      {
        if( NIL == the_root )
        {
          SubLObject csome_list_var2 = lexicon_accessors.words_of_stringXpred( string, $const275$singular, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          SubLObject wu2 = NIL;
          wu2 = csome_list_var2.first();
          while ( NIL == the_root && NIL != csome_list_var2)
          {
            if( NIL != kb_mapping.gather_gaf_arg_index( wu2, ONE_INTEGER, $const274$agentive_Sg, UNPROVIDED, UNPROVIDED ) )
            {
              SubLObject inf2 = NIL;
              final SubLObject pred_var2 = $const272$infinitive;
              if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( wu2, ONE_INTEGER, pred_var2 ) )
              {
                final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( wu2, ONE_INTEGER, pred_var2 );
                SubLObject done_var2 = the_root;
                final SubLObject token_var2 = NIL;
                while ( NIL == done_var2)
                {
                  final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
                  final SubLObject valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
                  if( NIL != valid2 )
                  {
                    SubLObject final_index_iterator2 = NIL;
                    try
                    {
                      final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw138$GAF, NIL, NIL );
                      SubLObject done_var_$57 = the_root;
                      final SubLObject token_var_$58 = NIL;
                      while ( NIL == done_var_$57)
                      {
                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$58 );
                        final SubLObject valid_$59 = makeBoolean( !token_var_$58.eql( assertion2 ) );
                        if( NIL != valid_$59 )
                        {
                          inf2 = ( the_root = assertions_high.gaf_arg( assertion2, TWO_INTEGER ) );
                        }
                        done_var_$57 = makeBoolean( NIL == valid_$59 || NIL != the_root );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$56 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        final SubLObject _values2 = Values.getValuesAsVector();
                        if( NIL != final_index_iterator2 )
                        {
                          kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
                        }
                        Values.restoreValuesFromVector( _values2 );
                      }
                      finally
                      {
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$56, thread );
                      }
                    }
                  }
                  done_var2 = makeBoolean( NIL == valid2 || NIL != the_root );
                }
              }
            }
            csome_list_var2 = csome_list_var2.rest();
            wu2 = csome_list_var2.first();
          }
        }
      }
      else if( NIL != string_utilities.ends_with( string, $str276$ment, UNPROVIDED ) )
      {
        if( NIL == the_root )
        {
          SubLObject csome_list_var2 = lexicon_accessors.words_of_stringXpred( string, $const277$nounStrings, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          SubLObject wu2 = NIL;
          wu2 = csome_list_var2.first();
          while ( NIL == the_root && NIL != csome_list_var2)
          {
            SubLObject inf2 = NIL;
            final SubLObject pred_var2 = $const272$infinitive;
            if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( wu2, ONE_INTEGER, pred_var2 ) )
            {
              final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( wu2, ONE_INTEGER, pred_var2 );
              SubLObject done_var2 = the_root;
              final SubLObject token_var2 = NIL;
              while ( NIL == done_var2)
              {
                final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
                final SubLObject valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
                if( NIL != valid2 )
                {
                  SubLObject final_index_iterator2 = NIL;
                  try
                  {
                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw138$GAF, NIL, NIL );
                    SubLObject done_var_$58 = the_root;
                    final SubLObject token_var_$59 = NIL;
                    while ( NIL == done_var_$58)
                    {
                      final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$59 );
                      final SubLObject valid_$60 = makeBoolean( !token_var_$59.eql( assertion2 ) );
                      if( NIL != valid_$60 )
                      {
                        inf2 = ( the_root = assertions_high.gaf_arg( assertion2, TWO_INTEGER ) );
                      }
                      done_var_$58 = makeBoolean( NIL == valid_$60 || NIL != the_root );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$57 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      final SubLObject _values3 = Values.getValuesAsVector();
                      if( NIL != final_index_iterator2 )
                      {
                        kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
                      }
                      Values.restoreValuesFromVector( _values3 );
                    }
                    finally
                    {
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$57, thread );
                    }
                  }
                }
                done_var2 = makeBoolean( NIL == valid2 || NIL != the_root );
              }
            }
            csome_list_var2 = csome_list_var2.rest();
            wu2 = csome_list_var2.first();
          }
        }
      }
      else
      {
        has_deverbal_endingP = NIL;
      }
      if( ( NIL != use_mass_fallback_if_neededP || NIL != has_deverbal_endingP ) && NIL == the_root && NIL == the_root )
      {
        SubLObject csome_list_var2 = lexicon_accessors.words_of_stringXpred( string, $const278$massNumber, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject wu2 = NIL;
        wu2 = csome_list_var2.first();
        while ( NIL == the_root && NIL != csome_list_var2)
        {
          SubLObject inf2 = NIL;
          final SubLObject pred_var2 = $const272$infinitive;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( wu2, ONE_INTEGER, pred_var2 ) )
          {
            final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( wu2, ONE_INTEGER, pred_var2 );
            SubLObject done_var2 = the_root;
            final SubLObject token_var2 = NIL;
            while ( NIL == done_var2)
            {
              final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
              final SubLObject valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
              if( NIL != valid2 )
              {
                SubLObject final_index_iterator2 = NIL;
                try
                {
                  final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw138$GAF, NIL, NIL );
                  SubLObject done_var_$59 = the_root;
                  final SubLObject token_var_$60 = NIL;
                  while ( NIL == done_var_$59)
                  {
                    final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$60 );
                    final SubLObject valid_$61 = makeBoolean( !token_var_$60.eql( assertion2 ) );
                    if( NIL != valid_$61 )
                    {
                      inf2 = ( the_root = assertions_high.gaf_arg( assertion2, TWO_INTEGER ) );
                    }
                    done_var_$59 = makeBoolean( NIL == valid_$61 || NIL != the_root );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$58 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values4 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator2 )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
                    }
                    Values.restoreValuesFromVector( _values4 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$58, thread );
                  }
                }
              }
              done_var2 = makeBoolean( NIL == valid2 || NIL != the_root );
            }
          }
          csome_list_var2 = csome_list_var2.rest();
          wu2 = csome_list_var2.first();
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return the_root;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 93467L)
  public static SubLObject rbp_deverbal_candidateP(final SubLObject string)
  {
    assert NIL != Types.stringp( string ) : string;
    final SubLObject exploded = string_utilities.split_string( string, UNPROVIDED );
    SubLObject okP = NIL;
    if( NIL == list_utilities.lengthE( exploded, TWO_INTEGER, UNPROVIDED ) )
    {
      return NIL;
    }
    SubLObject current;
    final SubLObject datum = current = exploded;
    SubLObject mod = NIL;
    SubLObject head = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list280 );
    mod = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list280 );
    head = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( NIL != list_utilities.lengthE( mod, ONE_INTEGER, UNPROVIDED ) || NIL != list_utilities.lengthE( head, ONE_INTEGER, UNPROVIDED ) )
      {
        okP = NIL;
      }
      else
      {
        okP = list_utilities.sublisp_boolean( rbp_get_deverbal_root( head, UNPROVIDED ) );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list280 );
    }
    return okP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 94030L)
  public static SubLObject parse_deverbal_compound_as_fallback(final SubLObject string, SubLObject limit)
  {
    if( limit == UNPROVIDED )
    {
      limit = NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 94769L)
  public static SubLObject parse_deverbal_compound_with_fallback(final SubLObject string, SubLObject complete_onlyP, SubLObject limit)
  {
    if( complete_onlyP == UNPROVIDED )
    {
      complete_onlyP = T;
    }
    if( limit == UNPROVIDED )
    {
      limit = $int111$1000;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject good = parse_noun_compound( string, complete_onlyP, limit );
    final SubLObject bad = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != good )
    {
      return Values.values( good, bad );
    }
    return parse_deverbal_compound_as_fallback( string, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 95061L)
  public static SubLObject date_parse_block_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 95061L)
  public static SubLObject date_parse_block_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $date_parse_block_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 95061L)
  public static SubLObject date_parse_block_subcol_naut(final SubLObject v_object)
  {
    assert NIL != date_parse_block_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 95061L)
  public static SubLObject date_parse_block_confidence(final SubLObject v_object)
  {
    assert NIL != date_parse_block_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 95061L)
  public static SubLObject _csetf_date_parse_block_subcol_naut(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != date_parse_block_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 95061L)
  public static SubLObject _csetf_date_parse_block_confidence(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != date_parse_block_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 95061L)
  public static SubLObject make_date_parse_block(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $date_parse_block_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw297$SUBCOL_NAUT ) )
      {
        _csetf_date_parse_block_subcol_naut( v_new, current_value );
      }
      else if( pcase_var.eql( $kw71$CONFIDENCE ) )
      {
        _csetf_date_parse_block_confidence( v_new, current_value );
      }
      else
      {
        Errors.error( $str25$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 95061L)
  public static SubLObject visit_defstruct_date_parse_block(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw26$BEGIN, $sym298$MAKE_DATE_PARSE_BLOCK, TWO_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw28$SLOT, $kw297$SUBCOL_NAUT, date_parse_block_subcol_naut( obj ) );
    Functions.funcall( visitor_fn, obj, $kw28$SLOT, $kw71$CONFIDENCE, date_parse_block_confidence( obj ) );
    Functions.funcall( visitor_fn, obj, $kw29$END, $sym298$MAKE_DATE_PARSE_BLOCK, TWO_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 95061L)
  public static SubLObject visit_defstruct_object_date_parse_block_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_date_parse_block( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 95061L)
  public static SubLObject new_date_parse_block(final SubLObject naut, final SubLObject confidence)
  {
    if( NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP( naut ) && NIL != rbp_wff.npp_genl_predP( parsing_utilities.subcollection_function_naut_pred( naut ), $const300$dateOfEvent ) )
    {
      final SubLObject block = make_date_parse_block( UNPROVIDED );
      _csetf_date_parse_block_subcol_naut( block, naut );
      _csetf_date_parse_block_confidence( block, confidence );
      return block;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 95061L)
  public static SubLObject new_date_parse_block_for_denot_and_date(final SubLObject denot, final SubLObject date, final SubLObject base_confidence, SubLObject raw_confidenceP)
  {
    if( raw_confidenceP == UNPROVIDED )
    {
      raw_confidenceP = NIL;
    }
    return new_date_parse_block( ConsesLow.list( $const301$SubcollectionOfWithRelationToFn, denot, $const300$dateOfEvent, date ), ( NIL != raw_confidenceP ) ? base_confidence
        : date_confidence_adjusted_for_year( base_confidence, date ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 95061L)
  public static SubLObject date_parse_complexity_G(final SubLObject parse1, final SubLObject parse2)
  {
    return Numbers.numG( Sequences.length( list_utilities.tree_positions( $const302$YearFn, parsing_utilities.subcollection_function_naut_to_arg( parse1 ), UNPROVIDED, UNPROVIDED ).first() ), Sequences.length(
        list_utilities.tree_positions( $const302$YearFn, parsing_utilities.subcollection_function_naut_to_arg( parse2 ), UNPROVIDED, UNPROVIDED ).first() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 95061L)
  public static SubLObject date_confidence_adjusted_for_year(final SubLObject base, final SubLObject parse_date)
  {
    return Numbers.multiply( base, Numbers.divide( date_utilities.extract_date_year( parse_date ), date_utilities.extract_date_year( date_utilities.universal_time_to_cycl_date( Time.get_universal_time() ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 95061L)
  public static SubLObject date_parse_list_incorporate_frequency(final SubLObject blocks, final SubLObject parse_counts)
  {
    final SubLObject avg = number_utilities.average( dictionary.dictionary_values( parse_counts ), UNPROVIDED );
    SubLObject cdolist_list_var = blocks;
    SubLObject block = NIL;
    block = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      _csetf_date_parse_block_confidence( block, Numbers.multiply( date_parse_block_confidence( block ), Numbers.divide( dictionary.dictionary_lookup( parse_counts, parsing_utilities.subcollection_function_naut_to_arg(
          date_parse_block_subcol_naut( block ) ), UNPROVIDED ), avg ) ) );
      cdolist_list_var = cdolist_list_var.rest();
      block = cdolist_list_var.first();
    }
    return blocks;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 95061L)
  public static SubLObject parse_string_as_date_fallback(final SubLObject string, SubLObject one_answerP, SubLObject incorporate_frequencyP)
  {
    if( one_answerP == UNPROVIDED )
    {
      one_answerP = T;
    }
    if( incorporate_frequencyP == UNPROVIDED )
    {
      incorporate_frequencyP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject tokens_reversed = Sequences.reverse( standard_tokenization.standard_string_tokenize( string ) );
    final SubLObject parse_counts = dictionary.new_dictionary( EQUAL, UNPROVIDED );
    SubLObject blocks = NIL;
    SubLObject v_core = NIL;
    SubLObject answers = NIL;
    while ( NIL != tokens_reversed && NIL == blocks)
    {
      v_core = ConsesLow.cons( tokens_reversed.first(), v_core );
      tokens_reversed = tokens_reversed.rest();
      final SubLObject dates = date_utilities.parse_date_from_string_fast( string_utilities.bunge( Sequences.reverse( tokens_reversed ), UNPROVIDED ), one_answerP, NIL, T );
      if( NIL != dates )
      {
        final SubLObject denots = parse_as_denot_or_noun_compound( string_utilities.bunge( v_core, UNPROVIDED ), UNPROVIDED );
        if( NIL == denots )
        {
          continue;
        }
        SubLObject cdolist_list_var = dates;
        SubLObject date = NIL;
        date = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject the_vars = list_utilities.tree_find_all_if( $sym303$EL_VARIABLE_P, date, UNPROVIDED );
          SubLObject cdolist_list_var_$72 = denots;
          SubLObject denot = NIL;
          denot = cdolist_list_var_$72.first();
          while ( NIL != cdolist_list_var_$72)
          {
            if( NIL != genls.genlP( denot, $const304$Event, parsing_vars.$parsing_domain_mt$.getDynamicValue( thread ), UNPROVIDED ) )
            {
              if( NIL == the_vars )
              {
                dictionary_utilities.dictionary_increment( parse_counts, date, UNPROVIDED );
                final SubLObject item_var = new_date_parse_block_for_denot_and_date( denot, date, $rbp_high_date_confidence$.getDynamicValue( thread ), UNPROVIDED );
                if( NIL == conses_high.member( item_var, blocks, Symbols.symbol_function( EQUALP ), Symbols.symbol_function( IDENTITY ) ) )
                {
                  blocks = ConsesLow.cons( item_var, blocks );
                }
              }
              else if( NIL != list_utilities.singletonP( the_vars ) )
              {
                SubLObject cdolist_list_var_$73 = ask_utilities.ask_template( ConsesLow.list( $sym306$_EVENT, the_vars.first() ), ConsesLow.list( $const307$and, ConsesLow.list( $const308$isa, $sym306$_EVENT, denot ),
                    ConsesLow.list( $const300$dateOfEvent, $sym306$_EVENT, date ) ), parsing_vars.$parsing_domain_mt$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                SubLObject v_answer = NIL;
                v_answer = cdolist_list_var_$73.first();
                while ( NIL != cdolist_list_var_$73)
                {
                  SubLObject current;
                  final SubLObject datum = current = v_answer;
                  SubLObject event = NIL;
                  SubLObject date_var = NIL;
                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list305 );
                  event = current.first();
                  current = current.rest();
                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list305 );
                  date_var = current.first();
                  current = current.rest();
                  if( NIL == current )
                  {
                    final SubLObject date_nart = list_utilities.tree_substitute( date, the_vars.first(), date_var );
                    dictionary_utilities.dictionary_increment( parse_counts, date_nart, UNPROVIDED );
                    final SubLObject item_var2 = new_date_parse_block_for_denot_and_date( denot, date_nart, ( NIL != constant_handles.constant_p( event ) ) ? $rbp_high_date_confidence$.getDynamicValue( thread )
                        : $rbp_low_date_confidence$.getDynamicValue( thread ), UNPROVIDED );
                    if( NIL == conses_high.member( item_var2, blocks, Symbols.symbol_function( EQUALP ), Symbols.symbol_function( IDENTITY ) ) )
                    {
                      blocks = ConsesLow.cons( item_var2, blocks );
                    }
                  }
                  else
                  {
                    cdestructuring_bind.cdestructuring_bind_error( datum, $list305 );
                  }
                  cdolist_list_var_$73 = cdolist_list_var_$73.rest();
                  v_answer = cdolist_list_var_$73.first();
                }
              }
              else
              {
                Errors.warn( $str309$_____todo_handle_dates_with_multi );
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
    if( NIL != incorporate_frequencyP )
    {
      date_parse_list_incorporate_frequency( blocks, parse_counts );
    }
    SubLObject cdolist_list_var2;
    final SubLObject sorted = cdolist_list_var2 = Sort.sort( Sort.sort( blocks, $sym124$_, $sym295$DATE_PARSE_BLOCK_CONFIDENCE ), $sym310$DATE_PARSE_COMPLEXITY__, $sym293$DATE_PARSE_BLOCK_SUBCOL_NAUT );
    SubLObject parse = NIL;
    parse = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      if( NIL != $rbp_return_confidenceP$.getDynamicValue( thread ) )
      {
        final SubLObject item_var3 = ConsesLow.list( date_parse_block_subcol_naut( parse ), $rbp_date_fallback_identifier$.getDynamicValue( thread ), date_parse_block_confidence( parse ) );
        if( NIL == conses_high.member( item_var3, answers, EQUALP, Symbols.symbol_function( IDENTITY ) ) )
        {
          answers = ConsesLow.cons( item_var3, answers );
        }
      }
      else
      {
        final SubLObject item_var3 = ConsesLow.list( date_parse_block_subcol_naut( parse ), $rbp_date_fallback_identifier$.getDynamicValue( thread ) );
        if( NIL == conses_high.member( item_var3, answers, EQUALP, Symbols.symbol_function( IDENTITY ) ) )
        {
          answers = ConsesLow.cons( item_var3, answers );
        }
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      parse = cdolist_list_var2.first();
    }
    return Sequences.reverse( answers );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 95061L)
  public static SubLObject parse_noun_compound_with_date_fallback(final SubLObject string, SubLObject complete_onlyP, SubLObject limit)
  {
    if( complete_onlyP == UNPROVIDED )
    {
      complete_onlyP = T;
    }
    if( limit == UNPROVIDED )
    {
      limit = $int111$1000;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject good = parse_noun_compound( string, complete_onlyP, limit );
    final SubLObject bad = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != good )
    {
      return Values.values( good, bad );
    }
    return parse_string_as_date_fallback( string, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 103576L)
  public static SubLObject rbp_parse_filter_nonagentive_actors(final SubLObject parse_naut)
  {
    SubLObject problem = NIL;
    if( NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP( parse_naut ) && NIL != rbp_wff.npp_genl_predP( parsing_utilities.subcollection_function_naut_pred( parse_naut ), $const311$doneBy )
        && NIL != rbp_wff.npp_not_disjointP( parsing_utilities.subcollection_function_naut_from_arg( parse_naut ), $const312$Action, rbp_domain_mt() ) )
    {
      SubLObject bogusP = NIL;
      final SubLObject func = cycl_utilities.formula_arg0( parse_naut );
      if( NIL != isa.isa_in_any_mtP( func, $const191$SubcollectionRelationFunction_Ins ) )
      {
        if( NIL == rbp_wff.npp_isaP( parsing_utilities.subcollection_function_naut_to_arg( parse_naut ), $const313$Agent_Generic, rbp_domain_mt() ) )
        {
          bogusP = T;
        }
      }
      else if( NIL != isa.isa_in_any_mtP( func, $const133$SubcollectionRelationFunction_Typ ) && NIL == rbp_wff.npp_genlP( parsing_utilities.subcollection_function_naut_to_arg( parse_naut ), $const313$Agent_Generic,
          rbp_domain_mt() ) )
      {
        bogusP = T;
      }
      if( NIL != bogusP )
      {
        problem = $str314$rbp_parse_filter_nonagentive_acto;
      }
    }
    return problem;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 105314L)
  public static SubLObject rbp_matches_any_all_exists_gafsP(final SubLObject target_pred, SubLObject from_arg, SubLObject to_arg, final SubLObject type_level_fromP, final SubLObject type_level_toP, final SubLObject head)
  {
    while ( NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP( from_arg ))
    {
      from_arg = cycl_utilities.nat_arg1( from_arg, UNPROVIDED );
    }
    while ( NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP( to_arg ))
    {
      to_arg = cycl_utilities.nat_arg1( to_arg, UNPROVIDED );
    }
    final SubLObject non_head = ( head == $kw315$FROM ) ? $kw316$TO : $kw315$FROM;
    return makeBoolean( NIL != rbp_all_exists_matches( target_pred, from_arg, to_arg, type_level_fromP, type_level_toP, head, UNPROVIDED ) || NIL != rbp_all_exists_matches( target_pred, from_arg, to_arg,
        type_level_fromP, type_level_toP, non_head, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 105937L)
  public static SubLObject rbp_all_exists_matches_internal(final SubLObject target_pred, final SubLObject from_arg, final SubLObject to_arg, final SubLObject type_level_fromP, final SubLObject type_level_toP,
      final SubLObject focus, SubLObject reversedP)
  {
    if( reversedP == UNPROVIDED )
    {
      reversedP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject query_sentence = rbp_matches_any_all_exists_gafs_query_sentence( target_pred, from_arg, to_arg, type_level_fromP, type_level_toP, focus );
    final SubLObject mt = $const318$InferencePSC;
    final SubLObject max_time = $rbp_rae_max_time$.getDynamicValue( thread );
    final SubLObject query_properties = ConsesLow.list( $kw319$MAX_NUMBER, ONE_INTEGER, $kw320$MAX_TIME, max_time, $kw192$PROBLEM_STORE, $ncp_problem_store$.getDynamicValue( thread ), $kw321$RETURN, ConsesLow.list(
        $kw322$TEMPLATE, $sym323$_TYPE ) );
    thread.resetMultipleValues();
    SubLObject types = inference_kernel.new_cyc_query( query_sentence, mt, query_properties );
    final SubLObject exit_status = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( $kw320$MAX_TIME == exit_status )
    {
      Errors.warn( $str324$Timed_out_checking___relationAllE, new SubLObject[] { max_time, target_pred, from_arg, to_arg
      } );
    }
    if( NIL == types && NIL == reversedP && NIL != isa.isaP( target_pred, $const325$SymmetricBinaryPredicate, UNPROVIDED, UNPROVIDED ) )
    {
      types = rbp_all_exists_matches( target_pred, to_arg, from_arg, type_level_toP, type_level_fromP, ( focus == $kw315$FROM ) ? $kw316$TO : $kw315$FROM, T );
    }
    return types;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 105937L)
  public static SubLObject rbp_all_exists_matches(final SubLObject target_pred, final SubLObject from_arg, final SubLObject to_arg, final SubLObject type_level_fromP, final SubLObject type_level_toP,
      final SubLObject focus, SubLObject reversedP)
  {
    if( reversedP == UNPROVIDED )
    {
      reversedP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return rbp_all_exists_matches_internal( target_pred, from_arg, to_arg, type_level_fromP, type_level_toP, focus, reversedP );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym317$RBP_ALL_EXISTS_MATCHES, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym317$RBP_ALL_EXISTS_MATCHES, SEVEN_INTEGER, NIL, EQL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym317$RBP_ALL_EXISTS_MATCHES, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_7( target_pred, from_arg, to_arg, type_level_fromP, type_level_toP, focus, reversedP );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( target_pred.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( from_arg.eql( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( to_arg.eql( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( type_level_fromP.eql( cached_args.first() ) )
              {
                cached_args = cached_args.rest();
                if( type_level_toP.eql( cached_args.first() ) )
                {
                  cached_args = cached_args.rest();
                  if( focus.eql( cached_args.first() ) )
                  {
                    cached_args = cached_args.rest();
                    if( NIL != cached_args && NIL == cached_args.rest() && reversedP.eql( cached_args.first() ) )
                    {
                      return memoization_state.caching_results( results2 );
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
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( rbp_all_exists_matches_internal( target_pred, from_arg, to_arg, type_level_fromP, type_level_toP, focus,
        reversedP ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( target_pred, from_arg, to_arg, type_level_fromP, type_level_toP, focus, reversedP ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 107116L)
  public static SubLObject rbp_matches_any_all_exists_gafs_query_sentence(final SubLObject target_pred, final SubLObject from_arg, final SubLObject to_arg, final SubLObject type_level_fromP,
      final SubLObject type_level_toP, final SubLObject focus)
  {
    final SubLObject strong_checkingP = NIL;
    final SubLObject type_pred = ( NIL != strong_checkingP ) ? $const326$equals : $const327$genls;
    if( focus.eql( $kw316$TO ) )
    {
      SubLObject disjuncts = NIL;
      if( NIL == type_level_toP )
      {
        final SubLObject junct1 = ( NIL != type_level_fromP ) ? ConsesLow.listS( $const328$relationAllInstance, target_pred, from_arg, $list329 ) : ConsesLow.listS( target_pred, from_arg, $list329 );
        final SubLObject junct2 = ConsesLow.listS( $const326$equals, to_arg, $list329 );
        disjuncts = ConsesLow.cons( simplifier.conjoin( ConsesLow.list( junct1, junct2 ), UNPROVIDED ), disjuncts );
      }
      final SubLObject rmp = ( NIL != type_level_fromP ) ? $const137$relationAllExists : $const330$relationInstanceExists;
      final SubLObject junct3 = ConsesLow.listS( rmp, target_pred, from_arg, $list329 );
      final SubLObject junct4 = ConsesLow.listS( ( NIL != type_level_toP ) ? type_pred : $const308$isa, to_arg, $list329 );
      disjuncts = ConsesLow.cons( simplifier.conjoin( ConsesLow.list( junct3, junct4 ), UNPROVIDED ), disjuncts );
      return simplifier.disjoin( disjuncts, UNPROVIDED );
    }
    return ConsesLow.list( $const307$and, ConsesLow.list( ( NIL != type_level_toP ) ? $const331$relationExistsAll : $const332$relationExistsInstance, target_pred, $sym323$_TYPE, to_arg ), ConsesLow.listS(
        ( NIL != type_level_fromP ) ? type_pred : $const308$isa, from_arg, $list329 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 108358L)
  public static SubLObject rbp_parse_prefer_rmp_matches(final SubLObject parse, SubLObject skip_cognateP)
  {
    if( skip_cognateP == UNPROVIDED )
    {
      skip_cognateP = NIL;
    }
    final SubLObject parse_naut = nc_block_denot( parse );
    final SubLObject problem = rbp_parse_prefer_rmp_matches_int( parse_naut, skip_cognateP );
    return problem;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 108574L)
  public static SubLObject rbp_parse_prefer_rmp_matches_int(final SubLObject parse_naut, SubLObject skip_cognateP)
  {
    if( skip_cognateP == UNPROVIDED )
    {
      skip_cognateP = NIL;
    }
    SubLObject problem = NIL;
    if( NIL != parse_naut && NIL == constant_handles.constant_p( parse_naut ) )
    {
      if( NIL == el_utilities.el_formula_with_operator_p( parse_naut, $const142$CityNamedFn ) )
      {
        if( NIL == kb_indexing_datastructures.indexed_term_p( parse_naut ) )
        {
          if( NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP( parse_naut ) )
          {
            problem = rbp_parse_rmp_problem_for_subcol_naut( parse_naut, skip_cognateP );
          }
          else
          {
            final SubLObject ternary_subcollection_naut = rbp_coerce_to_ternary_subcollection_naut( parse_naut );
            if( NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP( ternary_subcollection_naut ) )
            {
              problem = rbp_parse_prefer_rmp_matches_int( ternary_subcollection_naut, UNPROVIDED );
            }
            else
            {
              problem = $str333$rbp_parse_prefer_rmp_matches_had_;
            }
          }
        }
      }
    }
    return problem;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 109491L)
  public static SubLObject rbp_parse_rmp_problem_for_subcol_naut(final SubLObject parse_naut, final SubLObject skip_cognateP)
  {
    SubLObject problem = NIL;
    final SubLObject from_arg = parsing_utilities.subcollection_function_naut_from_arg( parse_naut );
    final SubLObject subfn = cycl_utilities.nat_functor( parse_naut );
    final SubLObject head = ( NIL != isa.isaP( subfn, $const215$SubcollectionRelationFunction_Can, UNPROVIDED, UNPROVIDED ) ) ? $kw315$FROM : $kw316$TO;
    final SubLObject type_level_fromP = parsing_utilities.subcollection_function_type_level_in_from_argP( subfn );
    final SubLObject type_level_toP = parsing_utilities.subcollection_function_type_level_in_to_argP( subfn );
    final SubLObject to_arg = parsing_utilities.subcollection_function_naut_to_arg( parse_naut );
    SubLObject okP = NIL;
    if( NIL != from_arg && NIL != to_arg && NIL != rbp_matches_any_all_exists_gafsP( parsing_utilities.subcollection_function_naut_pred( parse_naut ), from_arg, to_arg, type_level_fromP, type_level_toP, head ) )
    {
      okP = T;
    }
    else if( NIL != skip_cognateP )
    {
      okP = NIL;
    }
    else
    {
      final SubLObject cognate = rbp_semx_type_level_cognate( parse_naut );
      final SubLObject cognate_problem = ( NIL != cognate ) ? rbp_parse_prefer_rmp_matches_int( rbp_semx_type_level_cognate( parse_naut ), T ) : NIL;
      if( NIL != cognate_problem )
      {
        problem = cognate_problem;
      }
      else if( NIL != cognate )
      {
        okP = T;
      }
    }
    if( NIL == okP && NIL == problem )
    {
      problem = rbp_parse_prefer_rmp_matches_failure_message( parse_naut );
    }
    return problem;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 110911L)
  public static SubLObject rbp_coerce_to_ternary_subcollection_naut(final SubLObject parse_naut)
  {
    if( NIL == narts_high.naut_p( parse_naut ) )
    {
      return NIL;
    }
    final SubLObject fn = cycl_utilities.nat_functor( parse_naut );
    final SubLObject expansion = kb_mapping_utilities.fpred_value( fn, $const334$expansion, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject intersection_type = kb_mapping_utilities.fpred_value( fn, $const335$intersectionType, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != expansion && NIL != isa.isaP( cycl_utilities.nat_functor( expansion ), $const336$SubcollectionRelationFunction, UNPROVIDED, UNPROVIDED ) )
    {
      return cycl_utilities.expression_subst( cycl_utilities.nat_arg1( parse_naut, UNPROVIDED ), $kw337$ARG1, cycl_utilities.expression_subst( cycl_utilities.nat_arg2( parse_naut, UNPROVIDED ), $kw338$ARG2, expansion,
          UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    if( NIL != intersection_type )
    {
      return rbp_coerce_to_ternary_subcollection_naut( el_utilities.make_binary_formula( $const339$CollectionIntersection2Fn, cycl_utilities.nat_arg1( parse_naut, UNPROVIDED ), intersection_type ) );
    }
    final SubLObject pcase_var = fn;
    if( pcase_var.eql( $const339$CollectionIntersection2Fn ) )
    {
      return el_utilities.make_ternary_formula( $const301$SubcollectionOfWithRelationToFn, cycl_utilities.nat_arg1( parse_naut, UNPROVIDED ), $const308$isa, cycl_utilities.nat_arg2( parse_naut, UNPROVIDED ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 111758L)
  public static SubLObject rbp_parse_prefer_rmp_matches_failure_message(final SubLObject parse_naut)
  {
    return PrintLow.format( NIL, $str340$doesn_t_match___relationAllExists, cycl_utilities.hl_to_el( parsing_utilities.subcollection_function_naut_from_arg( parse_naut ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 111980L)
  public static SubLObject rbp_parse_filter_unlikely_instrumentals(final SubLObject parse_or_denot)
  {
    final SubLObject parse_naut = ( NIL != noun_compound_block_p( parse_or_denot ) ) ? nc_block_denot( parse_or_denot ) : parse_or_denot;
    final SubLObject problem = rbp_parse_filter_unlikely_instrumentals_int( parse_naut );
    return problem;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 112630L)
  public static SubLObject rbp_parse_filter_unlikely_instrumentals_int(final SubLObject denot)
  {
    SubLObject problem = NIL;
    if( NIL != denot && NIL == constant_handles.constant_p( denot ) )
    {
      if( NIL == el_utilities.el_formula_with_operator_p( denot, $const142$CityNamedFn ) )
      {
        if( NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP( denot ) )
        {
          if( NIL != rbp_wff.npp_genl_predP( parsing_utilities.subcollection_function_naut_pred( denot ), $const341$instrumentType_Generic ) && NIL == rbp_wff.npp_genlP( parsing_utilities
              .subcollection_function_naut_to_arg( denot ), $const342$ObjectWithUse, rbp_domain_mt() ) )
          {
            problem = $str343$rbp_parse_filter_unlikely_instrum;
          }
        }
        else
        {
          problem = $str344$rbp_parse_filter_unlikely_instrum;
        }
      }
    }
    return problem;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 113311L)
  public static SubLObject rbp_parse_filter_subcollection_args(final SubLObject parse)
  {
    final SubLObject parse_naut = nc_block_denot( parse );
    final SubLObject rbp_rule = nc_block_rule( parse );
    final SubLObject rule_cycl = rbp_rule_bank.rbp_rule_cycl( rbp_rule );
    final SubLObject rule_semx = rbp_rule_cycl_semx( rule_cycl, UNPROVIDED );
    SubLObject problem = NIL;
    if( NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP( parse_naut ) && ( NIL != rbp_bad_subcollection_to_argP( parse_naut, rule_semx ) || NIL != rbp_bad_subcollection_from_argP( parse_naut,
        rule_semx ) ) )
    {
      problem = $str345$rbp_parse_filter_subcollection_ar;
    }
    return problem;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 114493L)
  public static SubLObject rbp_bad_subcollection_to_argP(final SubLObject parse_naut, final SubLObject rule_semx)
  {
    return makeBoolean( NIL == parsing_utilities.ternary_parsing_subcollection_function_nautP( parsing_utilities.subcollection_function_naut_to_arg( rule_semx ) ) && NIL != parsing_utilities
        .ternary_parsing_subcollection_function_nautP( parsing_utilities.subcollection_function_naut_to_arg( parse_naut ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 114902L)
  public static SubLObject rbp_bad_subcollection_from_argP(final SubLObject parse_naut, final SubLObject rule_semx)
  {
    return makeBoolean( NIL == parsing_utilities.ternary_parsing_subcollection_function_nautP( parsing_utilities.subcollection_function_naut_from_arg( rule_semx ) ) && NIL != parsing_utilities
        .ternary_parsing_subcollection_function_nautP( parsing_utilities.subcollection_function_naut_from_arg( parse_naut ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 115319L)
  public static SubLObject rbp_unlikely_subcollection_naut_block_wrt_objectP(final SubLObject key_block, final SubLObject list_of_blocks)
  {
    final SubLObject key_naut = nc_block_denot( key_block );
    final SubLObject list_of_nauts = Mapping.mapcar( $sym54$NC_BLOCK_DENOT, list_of_blocks );
    return rbp_unlikely_subcollection_naut_wrt_objectP( key_naut, list_of_nauts );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 115696L)
  public static SubLObject rbp_unlikely_subcollection_naut_wrt_objectP(final SubLObject key_denot, final SubLObject list_of_nauts)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject ans = rbp_unlikely_subcollection_nautP( key_denot, list_of_nauts, list_utilities.last_one( $rbp_input_strings$.getDynamicValue( thread ) ), $kw346$OBJ );
    if( NIL != ans )
    {
      return $str347$statistically_unlikely_object;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 115958L)
  public static SubLObject clear_rbp_unlikely_subcollection_nautP()
  {
    final SubLObject cs = $rbp_unlikely_subcollection_nautP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 115958L)
  public static SubLObject remove_rbp_unlikely_subcollection_nautP(final SubLObject key_naut, final SubLObject list_of_nauts, final SubLObject verb, final SubLObject relation)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $rbp_unlikely_subcollection_nautP_caching_state$.getGlobalValue(), ConsesLow.list( key_naut, list_of_nauts, verb, relation ), UNPROVIDED,
        UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 115958L)
  public static SubLObject rbp_unlikely_subcollection_nautP_internal(final SubLObject key_naut, final SubLObject list_of_nauts, final SubLObject verb, final SubLObject relation)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 115958L)
  public static SubLObject rbp_unlikely_subcollection_nautP(final SubLObject key_naut, final SubLObject list_of_nauts, final SubLObject verb, final SubLObject relation)
  {
    SubLObject caching_state = $rbp_unlikely_subcollection_nautP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym348$RBP_UNLIKELY_SUBCOLLECTION_NAUT_, $sym349$_RBP_UNLIKELY_SUBCOLLECTION_NAUT__CACHING_STATE_, NIL, EQUAL, FOUR_INTEGER, $int350$64 );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_4( key_naut, list_of_nauts, verb, relation );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( key_naut.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( list_of_nauts.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( verb.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( NIL != cached_args && NIL == cached_args.rest() && relation.equal( cached_args.first() ) )
              {
                return memoization_state.caching_results( results2 );
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( rbp_unlikely_subcollection_nautP_internal( key_naut, list_of_nauts, verb, relation ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( key_naut, list_of_nauts, verb, relation ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 117380L)
  public static SubLObject parse_adj_initial_compound(final SubLObject string, SubLObject num)
  {
    if( num == UNPROVIDED )
    {
      num = $int111$1000;
    }
    final SubLObject words = string_utilities.split_string( string, UNPROVIDED );
    final SubLObject mod = words.first();
    SubLObject noun_conversions = NIL;
    SubLObject all_compounds = NIL;
    SubLObject cdolist_list_var = lexicon_accessors.words_of_stringXpred( mod, $const352$adjStrings, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject wu = NIL;
    wu = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$74 = lexicon_accessors.get_strings_of_type( wu, $const131$Noun, $list351, UNPROVIDED, UNPROVIDED );
      SubLObject string_$75 = NIL;
      string_$75 = cdolist_list_var_$74.first();
      while ( NIL != cdolist_list_var_$74)
      {
        final SubLObject item_var = string_$75;
        if( NIL == conses_high.member( item_var, noun_conversions, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          noun_conversions = ConsesLow.cons( item_var, noun_conversions );
        }
        cdolist_list_var_$74 = cdolist_list_var_$74.rest();
        string_$75 = cdolist_list_var_$74.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      wu = cdolist_list_var.first();
    }
    cdolist_list_var = noun_conversions;
    SubLObject this_conversion = NIL;
    this_conversion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject complete_onlyP = T;
      SubLObject cdolist_list_var_$75 = parse_noun_compound( string_utilities.bunge( ConsesLow.cons( this_conversion, words.rest() ), UNPROVIDED ), complete_onlyP, num );
      SubLObject this_parse = NIL;
      this_parse = cdolist_list_var_$75.first();
      while ( NIL != cdolist_list_var_$75)
      {
        final SubLObject item_var2 = this_parse;
        if( NIL == conses_high.member( item_var2, all_compounds, $sym153$NPP_PARSE_, Symbols.symbol_function( IDENTITY ) ) )
        {
          all_compounds = ConsesLow.cons( item_var2, all_compounds );
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
  public static SubLObject rbp_escalating_parse(final SubLObject string, SubLObject num)
  {
    if( num == UNPROVIDED )
    {
      num = $int111$1000;
    }
    SubLObject cdolist_list_var = ConsesLow.list( $sym353$PARSE_AS_DENOT_OR_NOUN_COMPOUND, $sym354$PARSE_DEVERBAL_COMPOUND_AS_FALLBACK, $sym355$PARSE_STRING_AS_DATE_FALLBACK_ESCALATED,
        $sym356$PARSE_ADJ_INITIAL_COMPOUND );
    SubLObject func = NIL;
    func = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject the_parses = Functions.funcall( func, string, num );
      if( NIL != list_utilities.proper_list_p( the_parses ) )
      {
        return set.set_element_list( set_utilities.construct_set_from_list( the_parses, Symbols.symbol_function( EQUALP ), UNPROVIDED ) );
      }
      cdolist_list_var = cdolist_list_var.rest();
      func = cdolist_list_var.first();
    }
    final SubLObject singular = lexification_utilities.singularize_word( string_utilities.trim_whitespace( string ), UNPROVIDED );
    if( NIL == Strings.stringE( singular, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return rbp_escalating_parse( singular, num );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 119575L)
  public static SubLObject parse_as_denot_or_noun_compound(final SubLObject string, SubLObject num)
  {
    if( num == UNPROVIDED )
    {
      num = $int111$1000;
    }
    final SubLObject denots = lexicon_accessors.typed_denots_of_string( string, $const357$Collection, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject complete_onlyP = T;
    return ( NIL != denots ) ? denots : parse_noun_compound( string, complete_onlyP, num );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 119819L)
  public static SubLObject parse_string_as_date_fallback_escalated(final SubLObject string, SubLObject num)
  {
    if( num == UNPROVIDED )
    {
      num = $int111$1000;
    }
    final SubLObject one_answerP = Numbers.numGE( num, ONE_INTEGER );
    return parse_string_as_date_fallback( string, one_answerP, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 120004L)
  public static SubLObject initialize_ncs_formats(final SubLObject mode)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $ncs_formats$.setDynamicValue( dictionary.new_dictionary( EQL, UNPROVIDED ), thread );
    if( !mode.eql( $kw358$XML ) )
    {
      if( NIL == mode )
      {
        Errors.error( $str359$No_mode_specified_for_initialize_ );
      }
      else
      {
        dictionary.dictionary_enter( $ncs_formats$.getDynamicValue( thread ), $kw360$INVESTIGATING, $str361$investigating___D__A_____ );
        dictionary.dictionary_enter( $ncs_formats$.getDynamicValue( thread ), $kw362$PRINT_ME, $str363$parse_of__S_yielded___ );
        dictionary.dictionary_enter( $ncs_formats$.getDynamicValue( thread ), $kw364$FLAG_BAD_PILE, $str365$______and_also________ );
        dictionary.dictionary_enter( $ncs_formats$.getDynamicValue( thread ), $kw366$DENOTS, $str367$____denots_are__A__ );
        dictionary.dictionary_enter( $ncs_formats$.getDynamicValue( thread ), $kw368$BREAK, $str369$________________________________ );
        dictionary.dictionary_enter( $ncs_formats$.getDynamicValue( thread ), $kw370$COUNT_WITH_PARSES, $str371$__Total_compounds_with_any_parses );
        dictionary.dictionary_enter( $ncs_formats$.getDynamicValue( thread ), $kw372$ACTUAL_PARSES, $str373$Total_parses_found___A__ );
        dictionary.dictionary_enter( $ncs_formats$.getDynamicValue( thread ), $kw374$PERCENT_APPROVED, $str375$Percent_of_parses_approved___5_2F );
        dictionary.dictionary_enter( $ncs_formats$.getDynamicValue( thread ), $kw376$TOTAL_VIOLATIONS, $str377$Total_violations___A__ );
        dictionary.dictionary_enter( $ncs_formats$.getDynamicValue( thread ), $kw378$TO_CONSTANTS, $str379$Note___A_parses_reformulated_to_c );
        dictionary.dictionary_enter( $ncs_formats$.getDynamicValue( thread ), $kw380$DENOTS_WANTED, $str381$Compounds_wanting_denots___A_____ );
        dictionary.dictionary_enter( $ncs_formats$.getDynamicValue( thread ), $kw382$RULES_AND_PARSE, $str383$from__S___A__ );
        dictionary.dictionary_enter( $ncs_formats$.getDynamicValue( thread ), $kw384$FALLBACK_AND_PARSE, $str385$_A_A__ );
        dictionary.dictionary_enter( $ncs_formats$.getDynamicValue( thread ), $kw386$LABEL, $str387$_A__ );
        dictionary.dictionary_enter( $ncs_formats$.getDynamicValue( thread ), $kw388$RULE_USES, $str389$Uses_of__A___A_total___A_good___A );
      }
    }
    return $ncs_formats$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 120004L)
  public static SubLObject ncs_format(final SubLObject key)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return dictionary.dictionary_lookup( $ncs_formats$.getDynamicValue( thread ), key, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 120004L)
  public static SubLObject ncs_note(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject stream = NIL;
    SubLObject cat = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list390 );
    stream = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list390 );
    cat = current.first();
    final SubLObject format_and_args;
    current = ( format_and_args = current.rest() );
    return ConsesLow.listS( $sym391$FORMAT, stream, ConsesLow.list( $sym392$NCS_FORMAT, cat ), ConsesLow.append( format_and_args, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 120004L)
  public static SubLObject noun_compound_statistics(SubLObject mode, SubLObject cutoff, SubLObject from_file)
  {
    if( mode == UNPROVIDED )
    {
      mode = $kw393$STDOUT;
    }
    if( cutoff == UNPROVIDED )
    {
      cutoff = $int394$100000;
    }
    if( from_file == UNPROVIDED )
    {
      from_file = $str395$_cyc_departments_nl_doc_stats_src;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    rbp_untrace();
    SubLObject i = ZERO_INTEGER;
    SubLObject any_matches = ZERO_INTEGER;
    SubLObject total_parses = ZERO_INTEGER;
    SubLObject ok_parses = ZERO_INTEGER;
    SubLObject violations = ZERO_INTEGER;
    SubLObject wanted_denots = ZERO_INTEGER;
    SubLObject had_denots = ZERO_INTEGER;
    SubLObject total_denots = ZERO_INTEGER;
    SubLObject reform_to_denots = ZERO_INTEGER;
    final SubLObject output_file = Sequences.cconcatenate( $str396$_cyc_departments_nl_doc_stats_kb, new SubLObject[] { string_utilities.str( control_vars.kb_loaded() ), operation_communication.kb_op_number()
        .isPositive() ? Sequences.cconcatenate( $str397$_, string_utilities.str( operation_communication.kb_op_number() ) ) : $str398$, $str399$_, string_utilities.str( numeric_date_utilities.get_universal_date(
            UNPROVIDED, UNPROVIDED ) ), $str400$_ncr_stats
    } );
    final SubLObject compound_out = mode.eql( $kw393$STDOUT ) ? StreamsLow.$standard_output$.getDynamicValue( thread )
        : StreamsLow.open( output_file, new SubLObject[]
        { $kw401$DIRECTION, $kw402$OUTPUT, $kw403$IF_DOES_NOT_EXIST, $kw404$CREATE
        } );
    final SubLObject total_rule_uses = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
    final SubLObject good_rule_uses = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
    final SubLObject bad_rule_uses = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
    final SubLObject already_covered = set.new_set( UNPROVIDED, UNPROVIDED );
    if( NIL == streams_high.open_stream_p( compound_out ) )
    {
      Errors.sublisp_break( $str405$Couldn_t_open_output_stream__woul, new SubLObject[] { output_file
      } );
    }
    SubLObject cdolist_list_var = rbp_rule_bank.rbp_rb_all_rules();
    SubLObject rule = NIL;
    rule = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      dictionary.dictionary_enter( total_rule_uses, rule, ZERO_INTEGER );
      dictionary.dictionary_enter( good_rule_uses, rule, ZERO_INTEGER );
      dictionary.dictionary_enter( bad_rule_uses, rule, ZERO_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      rule = cdolist_list_var.first();
    }
    SubLObject stream_var = NIL;
    try
    {
      final SubLObject compound_file;
      stream_var = ( compound_file = StreamsLow.open( from_file, EMPTY_SUBL_OBJECT_ARRAY ) );
      if( mode.eql( $kw393$STDOUT ) )
      {
        PrintLow.format( compound_out, $str406$would_print_to__S__, output_file );
      }
      else
      {
        PrintLow.format( T, $str407$storing_results_in__S__cutoff_is_, output_file, cutoff );
      }
      initialize_ncs_formats( mode );
      final SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.currentBinding( thread );
      try
      {
        lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.bind( $kw408$ON, thread );
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
        for( this_compound = NIL, this_compound = string_utilities.network_read_line( compound_file, UNPROVIDED, UNPROVIDED, UNPROVIDED ); !i.numE( cutoff ) && this_compound != $kw409$EOF
            && NIL != this_compound; this_compound = string_utilities.network_read_line( compound_file, NIL, UNPROVIDED, UNPROVIDED ) )
        {
          if( NIL == $ncs_deverbals_onlyP$.getDynamicValue( thread ) || NIL != rbp_deverbal_candidateP( this_compound ) )
          {
            exploded = string_utilities.split_string( this_compound, UNPROVIDED );
            denots = lexicon_accessors.denots_of_stringXpos( this_compound, $kw410$NOUN, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            _prev_bind_0_$77 = $rbp_shadow_rulesP$.currentBinding( thread );
            try
            {
              $rbp_shadow_rulesP$.bind( T, thread );
              copied_shadow = NIL;
              if( NIL == list_utilities.lengthE( exploded.first(), ONE_INTEGER, UNPROVIDED ) && NIL == list_utilities.lengthE( conses_high.second( exploded ), ONE_INTEGER, UNPROVIDED ) && NIL == set.set_memberP(
                  lexification_utilities.singularize_word( this_compound, UNPROVIDED ), already_covered ) )
              {
                set.set_add( lexification_utilities.singularize_word( this_compound, UNPROVIDED ), already_covered );
                i = Numbers.add( i, ONE_INTEGER );
                if( NIL != number_utilities.multiple_ofP( $int111$1000, i ) )
                {
                  Storage.gc( UNPROVIDED );
                }
                PrintLow.format( compound_out, ncs_format( $kw360$INVESTIGATING ), i, this_compound );
                thread.resetMultipleValues();
                good = parse_deverbal_compound_with_fallback( this_compound, UNPROVIDED, UNPROVIDED );
                bad = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if( NIL != list_utilities.proper_list_p( good ) )
                {
                  any_matches = Numbers.add( any_matches, ONE_INTEGER );
                  total_parses = Numbers.add( total_parses, Sequences.length( good ) );
                  ok_parses = Numbers.add( ok_parses, Sequences.length( good ) );
                  total_parses = Numbers.add( total_parses, Sequences.length( bad ) );
                  cdolist_list_var2 = good;
                  good_one = NIL;
                  good_one = cdolist_list_var2.first();
                  while ( NIL != cdolist_list_var2)
                  {
                    if( NIL != constant_handles.constant_p( good_one.first() ) )
                    {
                      reform_to_denots = Numbers.add( reform_to_denots, ONE_INTEGER );
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    good_one = cdolist_list_var2.first();
                  }
                  cdolist_list_var2 = bad;
                  baddy = NIL;
                  baddy = cdolist_list_var2.first();
                  while ( NIL != cdolist_list_var2)
                  {
                    violations = Numbers.add( violations, Sequences.length( conses_high.second( baddy ) ) );
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    baddy = cdolist_list_var2.first();
                  }
                  for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( $rbp_rules_to_parses_shadow$.getDynamicValue( thread ) ) ); NIL == dictionary_contents
                      .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                  {
                    thread.resetMultipleValues();
                    rule2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                    blocks = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    dictionary_utilities.dictionary_increment( total_rule_uses, rule2, Sequences.length( blocks ) );
                    cdolist_list_var3 = blocks;
                    parse = NIL;
                    parse = cdolist_list_var3.first();
                    while ( NIL != cdolist_list_var3)
                    {
                      if( NIL != subl_promotions.memberP( parse, good, EQUAL, UNPROVIDED ) )
                      {
                        dictionary_utilities.dictionary_increment( good_rule_uses, rule2, UNPROVIDED );
                      }
                      else
                      {
                        dictionary_utilities.dictionary_increment( bad_rule_uses, rule2, UNPROVIDED );
                      }
                      cdolist_list_var3 = cdolist_list_var3.rest();
                      parse = cdolist_list_var3.first();
                    }
                  }
                  dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                  PrintLow.format( compound_out, ncs_format( $kw362$PRINT_ME ), this_compound );
                  copied_shadow = print_rbp_parses_with_sources( compound_out, good, $rbp_rules_to_parses_shadow$.getDynamicValue( thread ), $str411$from_fallback );
                  if( NIL != bad )
                  {
                    PrintLow.format( compound_out, ncs_format( $kw364$FLAG_BAD_PILE ) );
                    print_rbp_parses_with_sources( compound_out, bad, copied_shadow, $str411$from_fallback );
                  }
                }
                if( NIL == good || NIL != list_utilities.lengthG( good, THREE_INTEGER, UNPROVIDED ) )
                {
                  wanted_denots = Numbers.add( wanted_denots, ONE_INTEGER );
                  if( NIL != list_utilities.proper_list_p( denots ) )
                  {
                    PrintLow.format( compound_out, ncs_format( $kw366$DENOTS ), denots );
                    had_denots = Numbers.add( had_denots, ONE_INTEGER );
                    total_denots = Numbers.add( total_denots, Sequences.length( denots ) );
                  }
                }
                if( NIL != list_utilities.proper_list_p( good ) || NIL != list_utilities.proper_list_p( denots ) )
                {
                  PrintLow.format( compound_out, ncs_format( $kw368$BREAK ) );
                }
              }
            }
            finally
            {
              $rbp_shadow_rulesP$.rebind( _prev_bind_0_$77, thread );
            }
          }
        }
      }
      finally
      {
        lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.rebind( _prev_bind_0, thread );
      }
      PrintLow.format( compound_out, ncs_format( $kw370$COUNT_WITH_PARSES ), any_matches );
      PrintLow.format( compound_out, ncs_format( $kw372$ACTUAL_PARSES ), total_parses );
      PrintLow.format( compound_out, ncs_format( $kw374$PERCENT_APPROVED ), Numbers.multiply( $int412$100, Numbers.divide( ok_parses, total_parses ) ) );
      PrintLow.format( compound_out, ncs_format( $kw376$TOTAL_VIOLATIONS ), violations );
      PrintLow.format( compound_out, ncs_format( $kw378$TO_CONSTANTS ), reform_to_denots );
      PrintLow.format( compound_out, ncs_format( $kw380$DENOTS_WANTED ), new SubLObject[] { wanted_denots, had_denots, total_denots
      } );
      SubLObject cdolist_list_var4 = dictionary_utilities.sort_dictionary_by_values( total_rule_uses, $sym124$_ );
      SubLObject cons = NIL;
      cons = cdolist_list_var4.first();
      while ( NIL != cdolist_list_var4)
      {
        SubLObject current;
        final SubLObject datum = current = cons;
        SubLObject rule3 = NIL;
        SubLObject total_uses = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list413 );
        rule3 = current.first();
        current = ( total_uses = current.rest() );
        PrintLow.format( compound_out, ncs_format( $kw388$RULE_USES ), new SubLObject[] { rule3, total_uses, dictionary.dictionary_lookup( good_rule_uses, rule3, UNPROVIDED ), dictionary.dictionary_lookup( bad_rule_uses,
            rule3, UNPROVIDED )
        } );
        cdolist_list_var4 = cdolist_list_var4.rest();
        cons = cdolist_list_var4.first();
      }
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != stream_var )
        {
          streams_high.close( stream_var, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return ok_parses;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 120004L)
  public static SubLObject print_rbp_parses_with_sources(final SubLObject stream, final SubLObject parses, final SubLObject dict, SubLObject label_if_not)
  {
    if( label_if_not == UNPROVIDED )
    {
      label_if_not = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject copied = dictionary_utilities.copy_dictionary( dict );
    SubLObject cdolist_list_var = parses;
    SubLObject parse = NIL;
    parse = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != dictionary.non_empty_dictionary_p( copied ) )
      {
        SubLObject found_it;
        SubLObject iteration_state;
        for( found_it = NIL, iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( copied ) ); NIL == found_it && NIL == dictionary_contents.do_dictionary_contents_doneP(
            iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
        {
          thread.resetMultipleValues();
          final SubLObject rule = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
          final SubLObject blocks = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( NIL != subl_promotions.memberP( parse, blocks, EQUAL, UNPROVIDED ) )
          {
            found_it = rule;
          }
        }
        dictionary_contents.do_dictionary_contents_finalize( iteration_state );
        dictionary_utilities.dictionary_remove_from_value( copied, found_it, parse, EQUAL, UNPROVIDED );
        PrintLow.format( stream, ncs_format( $kw382$RULES_AND_PARSE ), found_it, parse );
      }
      else
      {
        PrintLow.format( stream, ncs_format( $kw384$FALLBACK_AND_PARSE ), ( NIL != label_if_not ) ? PrintLow.format( NIL, ncs_format( $kw386$LABEL ), label_if_not ) : $str398$, parse );
      }
      cdolist_list_var = cdolist_list_var.rest();
      parse = cdolist_list_var.first();
    }
    return copied;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 120004L)
  public static SubLObject daml_process_ontology_file(SubLObject fn)
  {
    if( fn == UNPROVIDED )
    {
      fn = $str414$_cyc_projects_daml_call_thesaurus;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    rbp_untrace();
    SubLObject not_bogus = ZERO_INTEGER;
    SubLObject not_skipped = ZERO_INTEGER;
    SubLObject work_done = ZERO_INTEGER;
    SubLObject stream_var = NIL;
    try
    {
      SubLObject compound_file;
      SubLObject this_compound;
      SubLObject _prev_bind_0;
      SubLObject _prev_bind_2;
      SubLObject the_parses;
      for( stream_var = ( compound_file = StreamsLow.open( fn, EMPTY_SUBL_OBJECT_ARRAY ) ), this_compound = NIL, this_compound = string_utilities.network_read_line( compound_file, UNPROVIDED, UNPROVIDED,
          UNPROVIDED ); this_compound != $kw409$EOF && NIL != this_compound; this_compound = string_utilities.network_read_line( compound_file, NIL, UNPROVIDED, UNPROVIDED ) )
      {
        this_compound = string_utilities.remove_substring( this_compound, $str415$_ );
        if( NIL == Sequences.search( $str416$_, this_compound, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
        {
          not_bogus = Numbers.add( not_bogus, ONE_INTEGER );
          if( NIL == string_utilities.empty_string_p( this_compound ) )
          {
            if( NIL != lexification_utilities.initial_capitalizedP( this_compound ) && NIL != Sequences.search( $str399$_, this_compound, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
            {
              PrintLow.format( T, $str417$skipping__A______, this_compound );
            }
            else
            {
              PrintLow.format( T, $str418$investigating__A______, this_compound );
              not_skipped = Numbers.add( not_skipped, ONE_INTEGER );
              _prev_bind_0 = lexicon_vars.$exclude_slangP$.currentBinding( thread );
              _prev_bind_2 = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.currentBinding( thread );
              try
              {
                lexicon_vars.$exclude_slangP$.bind( T, thread );
                lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.bind( ( NIL == lexification_utilities.initial_capitalizedP( this_compound ) ) ? $kw408$ON : $kw419$OFF, thread );
                the_parses = rbp_escalating_parse( this_compound, UNPROVIDED );
                if( NIL != list_utilities.proper_list_p( the_parses ) )
                {
                  work_done = Numbers.add( work_done, ONE_INTEGER );
                  PrintLow.format( T, $str420$_S_______________________________, the_parses );
                }
              }
              finally
              {
                lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.rebind( _prev_bind_2, thread );
                lexicon_vars.$exclude_slangP$.rebind( _prev_bind_0, thread );
              }
            }
          }
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != stream_var )
        {
          streams_high.close( stream_var, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    PrintLow.format( T, $str421$found_something_for__A_of__A_entr, work_done, not_skipped );
    return Numbers.divide( work_done, not_skipped );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-parser.lisp", position = 120004L)
  public static SubLObject with_ncr_for_test_case(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list422 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list422 );
    name = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym423$PCOND, reader.bq_cons( ConsesLow.list( $sym424$FIND_CONSTANT, name ), ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym425$_RBP_SHOW_SUCCESSFUL_RULES__, ConsesLow.list(
          $sym426$WARN, $str427$Skipping_this_test_as__A_doesn_t_, name ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list422 );
    return NIL;
  }

  public static SubLObject declare_noun_compound_parser_file()
  {
    SubLFiles.declareFunction( me, "add_nc_rule_constraint", "ADD-NC-RULE-CONSTRAINT", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_nc_rule_constraint", "REMOVE-NC-RULE-CONSTRAINT", 2, 0, false );
    SubLFiles.declareFunction( me, "add_nc_rule_template", "ADD-NC-RULE-TEMPLATE", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_nc_rule_template", "REMOVE-NC-RULE-TEMPLATE", 2, 0, false );
    SubLFiles.declareFunction( me, "noun_compound_parse_print_function_trampoline", "NOUN-COMPOUND-PARSE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "noun_compound_parse_p", "NOUN-COMPOUND-PARSE-P", 1, 0, false );
    new $noun_compound_parse_p$UnaryFunction();
    SubLFiles.declareFunction( me, "nc_parse_unique_id", "NC-PARSE-UNIQUE-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "nc_parse_input_string", "NC-PARSE-INPUT-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "nc_parse_input_strings", "NC-PARSE-INPUT-STRINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "nc_parse_chart", "NC-PARSE-CHART", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_nc_parse_unique_id", "_CSETF-NC-PARSE-UNIQUE-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_nc_parse_input_string", "_CSETF-NC-PARSE-INPUT-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_nc_parse_input_strings", "_CSETF-NC-PARSE-INPUT-STRINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_nc_parse_chart", "_CSETF-NC-PARSE-CHART", 2, 0, false );
    SubLFiles.declareFunction( me, "make_noun_compound_parse", "MAKE-NOUN-COMPOUND-PARSE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_noun_compound_parse", "VISIT-DEFSTRUCT-NOUN-COMPOUND-PARSE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_noun_compound_parse_method", "VISIT-DEFSTRUCT-OBJECT-NOUN-COMPOUND-PARSE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "pprint_nc_parse", "PPRINT-NC-PARSE", 1, 2, false );
    SubLFiles.declareFunction( me, "new_nc_parse", "NEW-NC-PARSE", 0, 1, false );
    SubLFiles.declareFunction( me, "rbp_trace", "RBP-TRACE", 0, 0, false );
    SubLFiles.declareMacro( me, "with_rbp_trace", "WITH-RBP-TRACE" );
    SubLFiles.declareFunction( me, "rbp_untrace", "RBP-UNTRACE", 0, 0, false );
    SubLFiles.declareFunction( me, "rbp_show_rules", "RBP-SHOW-RULES", 0, 0, false );
    SubLFiles.declareFunction( me, "rbp_hide_rules", "RBP-HIDE-RULES", 0, 0, false );
    SubLFiles.declareFunction( me, "rbp_traced_rules", "RBP-TRACED-RULES", 0, 0, false );
    SubLFiles.declareFunction( me, "rbp_trace_rule", "RBP-TRACE-RULE", 1, 0, false );
    SubLFiles.declareFunction( me, "rbp_untrace_all_rules", "RBP-UNTRACE-ALL-RULES", 0, 0, false );
    SubLFiles.declareFunction( me, "rbp_untrace_rule", "RBP-UNTRACE-RULE", 1, 0, false );
    SubLFiles.declareFunction( me, "just_one_spaceP", "JUST-ONE-SPACE?", 1, 0, false );
    SubLFiles.declareFunction( me, "noun_compound_block_print_function_trampoline", "NOUN-COMPOUND-BLOCK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "noun_compound_block_p", "NOUN-COMPOUND-BLOCK-P", 1, 0, false );
    new $noun_compound_block_p$UnaryFunction();
    SubLFiles.declareFunction( me, "nc_block_unique_id", "NC-BLOCK-UNIQUE-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "nc_block_span_index", "NC-BLOCK-SPAN-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "nc_block_confidence", "NC-BLOCK-CONFIDENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "nc_block_denot", "NC-BLOCK-DENOT", 1, 0, false );
    SubLFiles.declareFunction( me, "nc_block_filters", "NC-BLOCK-FILTERS", 1, 0, false );
    SubLFiles.declareFunction( me, "nc_block_spanned_string", "NC-BLOCK-SPANNED-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "nc_block_head", "NC-BLOCK-HEAD", 1, 0, false );
    SubLFiles.declareFunction( me, "nc_block_head_pos", "NC-BLOCK-HEAD-POS", 1, 0, false );
    SubLFiles.declareFunction( me, "nc_block_head_string_pred", "NC-BLOCK-HEAD-STRING-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "nc_block_sub_tree", "NC-BLOCK-SUB-TREE", 1, 0, false );
    SubLFiles.declareFunction( me, "nc_block_plist", "NC-BLOCK-PLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_nc_block_unique_id", "_CSETF-NC-BLOCK-UNIQUE-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_nc_block_span_index", "_CSETF-NC-BLOCK-SPAN-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_nc_block_confidence", "_CSETF-NC-BLOCK-CONFIDENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_nc_block_denot", "_CSETF-NC-BLOCK-DENOT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_nc_block_filters", "_CSETF-NC-BLOCK-FILTERS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_nc_block_spanned_string", "_CSETF-NC-BLOCK-SPANNED-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_nc_block_head", "_CSETF-NC-BLOCK-HEAD", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_nc_block_head_pos", "_CSETF-NC-BLOCK-HEAD-POS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_nc_block_head_string_pred", "_CSETF-NC-BLOCK-HEAD-STRING-PRED", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_nc_block_sub_tree", "_CSETF-NC-BLOCK-SUB-TREE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_nc_block_plist", "_CSETF-NC-BLOCK-PLIST", 2, 0, false );
    SubLFiles.declareFunction( me, "make_noun_compound_block", "MAKE-NOUN-COMPOUND-BLOCK", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_noun_compound_block", "VISIT-DEFSTRUCT-NOUN-COMPOUND-BLOCK", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_noun_compound_block_method", "VISIT-DEFSTRUCT-OBJECT-NOUN-COMPOUND-BLOCK-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "nc_block_plist_lookup", "NC-BLOCK-PLIST-LOOKUP", 2, 1, false );
    SubLFiles.declareFunction( me, "nc_block_plist_set", "NC-BLOCK-PLIST-SET", 3, 0, false );
    SubLFiles.declareFunction( me, "nc_block_wu", "NC-BLOCK-WU", 1, 0, false );
    SubLFiles.declareFunction( me, "nc_block_set_wu", "NC-BLOCK-SET-WU", 2, 0, false );
    SubLFiles.declareFunction( me, "nc_block_rule", "NC-BLOCK-RULE", 1, 0, false );
    SubLFiles.declareFunction( me, "nc_block_mod_block", "NC-BLOCK-MOD-BLOCK", 1, 1, false );
    SubLFiles.declareFunction( me, "nc_block_head_block", "NC-BLOCK-HEAD-BLOCK", 1, 1, false );
    SubLFiles.declareFunction( me, "nc_block_rule_count", "NC-BLOCK-RULE-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "pprint_nc_block", "PPRINT-NC-BLOCK", 3, 0, false );
    SubLFiles.declareFunction( me, "new_noun_compound_block", "NEW-NOUN-COMPOUND-BLOCK", 4, 6, false );
    SubLFiles.declareFunction( me, "inference_new_noun_compound_block", "INFERENCE-NEW-NOUN-COMPOUND-BLOCK", 4, 6, false );
    SubLFiles.declareFunction( me, "combine_noun_compound_blocks_internal", "COMBINE-NOUN-COMPOUND-BLOCKS-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "combine_noun_compound_blocks", "COMBINE-NOUN-COMPOUND-BLOCKS", 3, 0, false );
    SubLFiles.declareFunction( me, "token_to_blocks", "TOKEN-TO-BLOCKS", 1, 0, false );
    SubLFiles.declareFunction( me, "rbp_adj_blockP", "RBP-ADJ-BLOCK?", 1, 0, false );
    SubLFiles.declareFunction( me, "rbp_adj_modified_blockP", "RBP-ADJ-MODIFIED-BLOCK?", 2, 0, false );
    SubLFiles.declareFunction( me, "rbp_base_from_block", "RBP-BASE-FROM-BLOCK", 2, 0, false );
    SubLFiles.declareFunction( me, "rbp_apply_filter_cluster", "RBP-APPLY-FILTER-CLUSTER", 3, 3, false );
    SubLFiles.declareFunction( me, "rbp_process_filter_clusters", "RBP-PROCESS-FILTER-CLUSTERS", 2, 1, false );
    SubLFiles.declareFunction( me, "rbp_parse_wrong_sizeP", "RBP-PARSE-WRONG-SIZE?", 2, 0, false );
    SubLFiles.declareFunction( me, "rbp_component_count", "RBP-COMPONENT-COUNT", 2, 0, false );
    SubLFiles.declareMacro( me, "ncp_reporting_metrics", "NCP-REPORTING-METRICS" );
    SubLFiles.declareFunction( me, "parse_noun_compound", "PARSE-NOUN-COMPOUND", 1, 2, false );
    SubLFiles.declareFunction( me, "parse_noun_compound_with_rules", "PARSE-NOUN-COMPOUND-WITH-RULES", 2, 2, false );
    SubLFiles.declareFunction( me, "rbp_rule_fort_p", "RBP-RULE-FORT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_noun_compound_from_string_tokens", "PARSE-NOUN-COMPOUND-FROM-STRING-TOKENS", 1, 2, false );
    SubLFiles.declareMacro( me, "with_new_ncp_problem_store", "WITH-NEW-NCP-PROBLEM-STORE" );
    SubLFiles.declareFunction( me, "parse_noun_compound_int", "PARSE-NOUN-COMPOUND-INT", 3, 1, false );
    SubLFiles.declareFunction( me, "ncp_initialize_metrics", "NCP-INITIALIZE-METRICS", 0, 0, false );
    SubLFiles.declareFunction( me, "ncp_report_metrics", "NCP-REPORT-METRICS", 1, 0, false );
    SubLFiles.declareFunction( me, "ncp_herald_start", "NCP-HERALD-START", 1, 0, false );
    SubLFiles.declareFunction( me, "rbp_sort_blocks_complexity_first", "RBP-SORT-BLOCKS-COMPLEXITY-FIRST", 1, 0, false );
    SubLFiles.declareFunction( me, "rbp_sort_blocks_confidence_first", "RBP-SORT-BLOCKS-CONFIDENCE-FIRST", 1, 0, false );
    SubLFiles.declareFunction( me, "rbp_filter_and_sort_result_blocks", "RBP-FILTER-AND-SORT-RESULT-BLOCKS", 2, 1, false );
    SubLFiles.declareFunction( me, "rbp_block_reliability_estimate", "RBP-BLOCK-RELIABILITY-ESTIMATE", 1, 1, false );
    SubLFiles.declareFunction( me, "rbp_unify_blocks_to_common_specpreds", "RBP-UNIFY-BLOCKS-TO-COMMON-SPECPREDS", 1, 0, false );
    SubLFiles.declareFunction( me, "rbp_unify_rewrite_of_blocks", "RBP-UNIFY-REWRITE-OF-BLOCKS", 1, 0, false );
    SubLFiles.declareFunction( me, "rbp_unify_city_named_fn_blocks", "RBP-UNIFY-CITY-NAMED-FN-BLOCKS", 1, 0, false );
    SubLFiles.declareFunction( me, "rbp_nominal_blockP", "RBP-NOMINAL-BLOCK?", 1, 0, false );
    SubLFiles.declareFunction( me, "display_complete_parses", "DISPLAY-COMPLETE-PARSES", 1, 0, false );
    SubLFiles.declareFunction( me, "nc_block_uses_required_rules_p", "NC-BLOCK-USES-REQUIRED-RULES-P", 3, 0, false );
    SubLFiles.declareFunction( me, "nc_block_uses_required_rule_p", "NC-BLOCK-USES-REQUIRED-RULE-P", 3, 0, false );
    SubLFiles.declareFunction( me, "rbp_parse_and_confidenceP", "RBP-PARSE-AND-CONFIDENCE?", 1, 0, false );
    SubLFiles.declareFunction( me, "rbp_parse_and_confidenceE", "RBP-PARSE-AND-CONFIDENCE=", 2, 0, false );
    SubLFiles.declareFunction( me, "ncp_chart_init", "NCP-CHART-INIT", 0, 2, false );
    SubLFiles.declareFunction( me, "ncp_chart_init_from_string_tokens", "NCP-CHART-INIT-FROM-STRING-TOKENS", 1, 0, false );
    SubLFiles.declareFunction( me, "new_ncp_chart", "NEW-NCP-CHART", 1, 0, false );
    SubLFiles.declareFunction( me, "ncp_chart_init_int", "NCP-CHART-INIT-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "rbp_input_spanning_blockP", "RBP-INPUT-SPANNING-BLOCK?", 2, 0, false );
    SubLFiles.declareFunction( me, "rbp_filter_verbs", "RBP-FILTER-VERBS", 1, 0, false );
    SubLFiles.declareFunction( me, "rbp_filter_verbs_in_tuples", "RBP-FILTER-VERBS-IN-TUPLES", 1, 0, false );
    SubLFiles.declareFunction( me, "rbp_remove_subsumed_tokens", "RBP-REMOVE-SUBSUMED-TOKENS", 2, 0, false );
    SubLFiles.declareFunction( me, "rbp_span_subsumed_by_all_ofP", "RBP-SPAN-SUBSUMED-BY-ALL-OF?", 2, 0, false );
    SubLFiles.declareFunction( me, "rbp_span_subsumed_byP", "RBP-SPAN-SUBSUMED-BY?", 2, 0, false );
    SubLFiles.declareFunction( me, "initialize_rbp_name_cache", "INITIALIZE-RBP-NAME-CACHE", 0, 0, false );
    SubLFiles.declareFunction( me, "rbp_name_block_pred_among_floorsP", "RBP-NAME-BLOCK-PRED-AMONG-FLOORS?", 1, 0, false );
    SubLFiles.declareFunction( me, "rbp_cache_name_block", "RBP-CACHE-NAME-BLOCK", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_rbp_floors_cached", "CLEAR-RBP-FLOORS-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_rbp_floors_cached", "REMOVE-RBP-FLOORS-CACHED", 1, 0, false );
    SubLFiles.declareFunction( me, "rbp_floors_cached_internal", "RBP-FLOORS-CACHED-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "rbp_floors_cached", "RBP-FLOORS-CACHED", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_rbp_ok_name_cachedP", "CLEAR-RBP-OK-NAME-CACHED?", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_rbp_ok_name_cachedP", "REMOVE-RBP-OK-NAME-CACHED?", 2, 0, false );
    SubLFiles.declareFunction( me, "rbp_ok_name_cachedP_internal", "RBP-OK-NAME-CACHED?-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "rbp_ok_name_cachedP", "RBP-OK-NAME-CACHED?", 2, 0, false );
    SubLFiles.declareFunction( me, "rbp_strings_for_span", "RBP-STRINGS-FOR-SPAN", 1, 0, false );
    SubLFiles.declareFunction( me, "rbp_string_tokenize", "RBP-STRING-TOKENIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "rbp_ok_blockP", "RBP-OK-BLOCK?", 1, 0, false );
    SubLFiles.declareFunction( me, "rbp_bad_name_blockP", "RBP-BAD-NAME-BLOCK?", 1, 0, false );
    SubLFiles.declareFunction( me, "rbp_name_blockP", "RBP-NAME-BLOCK?", 1, 0, false );
    SubLFiles.declareFunction( me, "rbp_filter_redundant_blocks", "RBP-FILTER-REDUNDANT-BLOCKS", 1, 0, false );
    SubLFiles.declareFunction( me, "display_all_parses", "DISPLAY-ALL-PARSES", 1, 0, false );
    SubLFiles.declareFunction( me, "display_all_trees", "DISPLAY-ALL-TREES", 1, 0, false );
    SubLFiles.declareFunction( me, "display_tree", "DISPLAY-TREE", 2, 0, false );
    SubLFiles.declareFunction( me, "rbp_rule_count", "RBP-RULE-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "rbp_rule_cycl_semx", "RBP-RULE-CYCL-SEMX", 1, 1, false );
    SubLFiles.declareFunction( me, "rbp_rule_okP", "RBP-RULE-OK?", 1, 0, false );
    SubLFiles.declareFunction( me, "rbp_domain_mt", "RBP-DOMAIN-MT", 0, 0, false );
    SubLFiles.declareFunction( me, "rbp_get_cognate_from_instance_level_arg", "RBP-GET-COGNATE-FROM-INSTANCE-LEVEL-ARG", 1, 0, false );
    SubLFiles.declareFunction( me, "rbp_get_cognate_from_type_level_arg", "RBP-GET-COGNATE-FROM-TYPE-LEVEL-ARG", 1, 0, false );
    SubLFiles.declareFunction( me, "rbp_semx_type_level_cognate", "RBP-SEMX-TYPE-LEVEL-COGNATE", 1, 0, false );
    SubLFiles.declareFunction( me, "ncp_ask_variable", "NCP-ASK-VARIABLE", 3, 1, false );
    SubLFiles.declareFunction( me, "rbp_subcol_naut_fails_inter_arg_checksP", "RBP-SUBCOL-NAUT-FAILS-INTER-ARG-CHECKS?", 3, 2, false );
    SubLFiles.declareFunction( me, "rbp_get_dep_cols", "RBP-GET-DEP-COLS", 5, 0, false );
    SubLFiles.declareFunction( me, "rbp_subcol_naut_do_inter_arg_test", "RBP-SUBCOL-NAUT-DO-INTER-ARG-TEST", 5, 0, false );
    SubLFiles.declareFunction( me, "rbp_inter_arg_isa_pred", "RBP-INTER-ARG-ISA-PRED", 2, 0, false );
    SubLFiles.declareFunction( me, "rbp_inter_arg_not_isa_pred", "RBP-INTER-ARG-NOT-ISA-PRED", 2, 0, false );
    SubLFiles.declareFunction( me, "rbp_binary_gaf_fails_inter_arg_checksP", "RBP-BINARY-GAF-FAILS-INTER-ARG-CHECKS?", 1, 1, false );
    SubLFiles.declareFunction( me, "rbp_fails_wff_workaroundsP", "RBP-FAILS-WFF-WORKAROUNDS?", 2, 1, false );
    SubLFiles.declareFunction( me, "rbp_rb_combine_noun_compound_blocks", "RBP-RB-COMBINE-NOUN-COMPOUND-BLOCKS", 2, 0, false );
    SubLFiles.declareFunction( me, "rbp_rb_rules_matching_blocks", "RBP-RB-RULES-MATCHING-BLOCKS", 2, 0, false );
    SubLFiles.declareFunction( me, "rbp_rb_rules_matching_blocks_wrt_closed_constraints", "RBP-RB-RULES-MATCHING-BLOCKS-WRT-CLOSED-CONSTRAINTS", 2, 1, false );
    SubLFiles.declareFunction( me, "clear_rbp_rb_rules_matching_closed_specs", "CLEAR-RBP-RB-RULES-MATCHING-CLOSED-SPECS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_rbp_rb_rules_matching_closed_specs", "REMOVE-RBP-RB-RULES-MATCHING-CLOSED-SPECS", 1, 0, false );
    SubLFiles.declareFunction( me, "rbp_rb_rules_matching_closed_specs_internal", "RBP-RB-RULES-MATCHING-CLOSED-SPECS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "rbp_rb_rules_matching_closed_specs", "RBP-RB-RULES-MATCHING-CLOSED-SPECS", 1, 0, false );
    SubLFiles.declareFunction( me, "rbp_rb_search_wrt_open_constraints", "RBP-RB-SEARCH-WRT-OPEN-CONSTRAINTS", 4, 0, false );
    SubLFiles.declareFunction( me, "rbp_verify_internal", "RBP-VERIFY-INTERNAL", 1, 1, false );
    SubLFiles.declareFunction( me, "rbp_verify", "RBP-VERIFY", 1, 1, false );
    SubLFiles.declareFunction( me, "rbp_rb_search", "RBP-RB-SEARCH", 2, 3, false );
    SubLFiles.declareFunction( me, "inference_rbp_rb_search", "INFERENCE-RBP-RB-SEARCH", 2, 3, false );
    SubLFiles.declareFunction( me, "rbp_rb_initial_search_no_tracing_internal", "RBP-RB-INITIAL-SEARCH-NO-TRACING-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "rbp_rb_initial_search_no_tracing", "RBP-RB-INITIAL-SEARCH-NO-TRACING", 2, 0, false );
    SubLFiles.declareFunction( me, "rbp_rb_search_internal", "RBP-RB-SEARCH-INTERNAL", 5, 0, false );
    SubLFiles.declareFunction( me, "rbp_rb_blocks_pass_inter_constraintsP", "RBP-RB-BLOCKS-PASS-INTER-CONSTRAINTS?", 3, 0, false );
    SubLFiles.declareFunction( me, "clear_inter_constraints_from_rule", "CLEAR-INTER-CONSTRAINTS-FROM-RULE", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_inter_constraints_from_rule", "REMOVE-INTER-CONSTRAINTS-FROM-RULE", 1, 0, false );
    SubLFiles.declareFunction( me, "inter_constraints_from_rule_internal", "INTER-CONSTRAINTS-FROM-RULE-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "inter_constraints_from_rule", "INTER-CONSTRAINTS-FROM-RULE", 1, 0, false );
    SubLFiles.declareFunction( me, "blocks_pass_all_inter_nc_constraintsP", "BLOCKS-PASS-ALL-INTER-NC-CONSTRAINTS?", 3, 0, false );
    SubLFiles.declareFunction( me, "blocks_pass_inter_nc_constraintP", "BLOCKS-PASS-INTER-NC-CONSTRAINT?", 3, 0, false );
    SubLFiles.declareFunction( me, "inter_nc_block_test", "INTER-NC-BLOCK-TEST", 3, 0, false );
    SubLFiles.declareFunction( me, "rbp_check_initializations", "RBP-CHECK-INITIALIZATIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "combine_blocks_with_template", "COMBINE-BLOCKS-WITH-TEMPLATE", 3, 1, false );
    SubLFiles.declareFunction( me, "rbp_test_for_con_kw", "RBP-TEST-FOR-CON-KW", 1, 0, false );
    SubLFiles.declareFunction( me, "rbp_candidate_fn_for_con_kw", "RBP-CANDIDATE-FN-FOR-CON-KW", 1, 0, false );
    SubLFiles.declareFunction( me, "rbp_get_deverbal_root", "RBP-GET-DEVERBAL-ROOT", 1, 1, false );
    SubLFiles.declareFunction( me, "rbp_deverbal_candidateP", "RBP-DEVERBAL-CANDIDATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_deverbal_compound_as_fallback", "PARSE-DEVERBAL-COMPOUND-AS-FALLBACK", 1, 1, false );
    SubLFiles.declareFunction( me, "parse_deverbal_compound_with_fallback", "PARSE-DEVERBAL-COMPOUND-WITH-FALLBACK", 1, 2, false );
    SubLFiles.declareFunction( me, "date_parse_block_print_function_trampoline", "DATE-PARSE-BLOCK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "date_parse_block_p", "DATE-PARSE-BLOCK-P", 1, 0, false );
    new $date_parse_block_p$UnaryFunction();
    SubLFiles.declareFunction( me, "date_parse_block_subcol_naut", "DATE-PARSE-BLOCK-SUBCOL-NAUT", 1, 0, false );
    SubLFiles.declareFunction( me, "date_parse_block_confidence", "DATE-PARSE-BLOCK-CONFIDENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_date_parse_block_subcol_naut", "_CSETF-DATE-PARSE-BLOCK-SUBCOL-NAUT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_date_parse_block_confidence", "_CSETF-DATE-PARSE-BLOCK-CONFIDENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_date_parse_block", "MAKE-DATE-PARSE-BLOCK", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_date_parse_block", "VISIT-DEFSTRUCT-DATE-PARSE-BLOCK", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_date_parse_block_method", "VISIT-DEFSTRUCT-OBJECT-DATE-PARSE-BLOCK-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_date_parse_block", "NEW-DATE-PARSE-BLOCK", 2, 0, false );
    SubLFiles.declareFunction( me, "new_date_parse_block_for_denot_and_date", "NEW-DATE-PARSE-BLOCK-FOR-DENOT-AND-DATE", 3, 1, false );
    SubLFiles.declareFunction( me, "date_parse_complexity_G", "DATE-PARSE-COMPLEXITY->", 2, 0, false );
    SubLFiles.declareFunction( me, "date_confidence_adjusted_for_year", "DATE-CONFIDENCE-ADJUSTED-FOR-YEAR", 2, 0, false );
    SubLFiles.declareFunction( me, "date_parse_list_incorporate_frequency", "DATE-PARSE-LIST-INCORPORATE-FREQUENCY", 2, 0, false );
    SubLFiles.declareFunction( me, "parse_string_as_date_fallback", "PARSE-STRING-AS-DATE-FALLBACK", 1, 2, false );
    SubLFiles.declareFunction( me, "parse_noun_compound_with_date_fallback", "PARSE-NOUN-COMPOUND-WITH-DATE-FALLBACK", 1, 2, false );
    SubLFiles.declareFunction( me, "rbp_parse_filter_nonagentive_actors", "RBP-PARSE-FILTER-NONAGENTIVE-ACTORS", 1, 0, false );
    SubLFiles.declareFunction( me, "rbp_matches_any_all_exists_gafsP", "RBP-MATCHES-ANY-ALL-EXISTS-GAFS?", 6, 0, false );
    SubLFiles.declareFunction( me, "rbp_all_exists_matches_internal", "RBP-ALL-EXISTS-MATCHES-INTERNAL", 6, 1, false );
    SubLFiles.declareFunction( me, "rbp_all_exists_matches", "RBP-ALL-EXISTS-MATCHES", 6, 1, false );
    SubLFiles.declareFunction( me, "rbp_matches_any_all_exists_gafs_query_sentence", "RBP-MATCHES-ANY-ALL-EXISTS-GAFS-QUERY-SENTENCE", 6, 0, false );
    SubLFiles.declareFunction( me, "rbp_parse_prefer_rmp_matches", "RBP-PARSE-PREFER-RMP-MATCHES", 1, 1, false );
    SubLFiles.declareFunction( me, "rbp_parse_prefer_rmp_matches_int", "RBP-PARSE-PREFER-RMP-MATCHES-INT", 1, 1, false );
    SubLFiles.declareFunction( me, "rbp_parse_rmp_problem_for_subcol_naut", "RBP-PARSE-RMP-PROBLEM-FOR-SUBCOL-NAUT", 2, 0, false );
    SubLFiles.declareFunction( me, "rbp_coerce_to_ternary_subcollection_naut", "RBP-COERCE-TO-TERNARY-SUBCOLLECTION-NAUT", 1, 0, false );
    SubLFiles.declareFunction( me, "rbp_parse_prefer_rmp_matches_failure_message", "RBP-PARSE-PREFER-RMP-MATCHES-FAILURE-MESSAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "rbp_parse_filter_unlikely_instrumentals", "RBP-PARSE-FILTER-UNLIKELY-INSTRUMENTALS", 1, 0, false );
    SubLFiles.declareFunction( me, "rbp_parse_filter_unlikely_instrumentals_int", "RBP-PARSE-FILTER-UNLIKELY-INSTRUMENTALS-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "rbp_parse_filter_subcollection_args", "RBP-PARSE-FILTER-SUBCOLLECTION-ARGS", 1, 0, false );
    SubLFiles.declareFunction( me, "rbp_bad_subcollection_to_argP", "RBP-BAD-SUBCOLLECTION-TO-ARG?", 2, 0, false );
    SubLFiles.declareFunction( me, "rbp_bad_subcollection_from_argP", "RBP-BAD-SUBCOLLECTION-FROM-ARG?", 2, 0, false );
    SubLFiles.declareFunction( me, "rbp_unlikely_subcollection_naut_block_wrt_objectP", "RBP-UNLIKELY-SUBCOLLECTION-NAUT-BLOCK-WRT-OBJECT?", 2, 0, false );
    SubLFiles.declareFunction( me, "rbp_unlikely_subcollection_naut_wrt_objectP", "RBP-UNLIKELY-SUBCOLLECTION-NAUT-WRT-OBJECT?", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_rbp_unlikely_subcollection_nautP", "CLEAR-RBP-UNLIKELY-SUBCOLLECTION-NAUT?", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_rbp_unlikely_subcollection_nautP", "REMOVE-RBP-UNLIKELY-SUBCOLLECTION-NAUT?", 4, 0, false );
    SubLFiles.declareFunction( me, "rbp_unlikely_subcollection_nautP_internal", "RBP-UNLIKELY-SUBCOLLECTION-NAUT?-INTERNAL", 4, 0, false );
    SubLFiles.declareFunction( me, "rbp_unlikely_subcollection_nautP", "RBP-UNLIKELY-SUBCOLLECTION-NAUT?", 4, 0, false );
    SubLFiles.declareFunction( me, "parse_adj_initial_compound", "PARSE-ADJ-INITIAL-COMPOUND", 1, 1, false );
    SubLFiles.declareFunction( me, "rbp_escalating_parse", "RBP-ESCALATING-PARSE", 1, 1, false );
    SubLFiles.declareFunction( me, "parse_as_denot_or_noun_compound", "PARSE-AS-DENOT-OR-NOUN-COMPOUND", 1, 1, false );
    SubLFiles.declareFunction( me, "parse_string_as_date_fallback_escalated", "PARSE-STRING-AS-DATE-FALLBACK-ESCALATED", 1, 1, false );
    SubLFiles.declareFunction( me, "initialize_ncs_formats", "INITIALIZE-NCS-FORMATS", 1, 0, false );
    SubLFiles.declareFunction( me, "ncs_format", "NCS-FORMAT", 1, 0, false );
    SubLFiles.declareMacro( me, "ncs_note", "NCS-NOTE" );
    SubLFiles.declareFunction( me, "noun_compound_statistics", "NOUN-COMPOUND-STATISTICS", 0, 3, false );
    SubLFiles.declareFunction( me, "print_rbp_parses_with_sources", "PRINT-RBP-PARSES-WITH-SOURCES", 3, 1, false );
    SubLFiles.declareFunction( me, "daml_process_ontology_file", "DAML-PROCESS-ONTOLOGY-FILE", 0, 1, false );
    SubLFiles.declareMacro( me, "with_ncr_for_test_case", "WITH-NCR-FOR-TEST-CASE" );
    return NIL;
  }

  public static SubLObject init_noun_compound_parser_file()
  {
    $dtp_noun_compound_parse$ = SubLFiles.defconstant( "*DTP-NOUN-COMPOUND-PARSE*", $sym4$NOUN_COMPOUND_PARSE );
    $nc_parse_id_counter$ = SubLFiles.deflexical( "*NC-PARSE-ID-COUNTER*", ( maybeDefault( $sym31$_NC_PARSE_ID_COUNTER_, $nc_parse_id_counter$, ZERO_INTEGER ) ) );
    $rbp_report_parse_timeP$ = SubLFiles.defparameter( "*RBP-REPORT-PARSE-TIME?*", NIL );
    $rbp_shadow_rulesP$ = SubLFiles.defparameter( "*RBP-SHADOW-RULES?*", NIL );
    $rbp_rules_to_parses_shadow$ = SubLFiles.defparameter( "*RBP-RULES-TO-PARSES-SHADOW*", NIL );
    $rbp_return_confidenceP$ = SubLFiles.defparameter( "*RBP-RETURN-CONFIDENCE?*", NIL );
    $rbp_show_successful_rulesP$ = SubLFiles.defparameter( "*RBP-SHOW-SUCCESSFUL-RULES?*", NIL );
    $rbp_traced_rules$ = SubLFiles.defparameter( "*RBP-TRACED-RULES*", NIL );
    $dtp_noun_compound_block$ = SubLFiles.defconstant( "*DTP-NOUN-COMPOUND-BLOCK*", $sym39$NOUN_COMPOUND_BLOCK );
    $rbp_default_confidence_multiplier_for_failing_a_filter$ = SubLFiles.defparameter( "*RBP-DEFAULT-CONFIDENCE-MULTIPLIER-FOR-FAILING-A-FILTER*", $float83$0_5 );
    $nc_block_unique_id_counter$ = SubLFiles.deflexical( "*NC-BLOCK-UNIQUE-ID-COUNTER*", ( maybeDefault( $sym85$_NC_BLOCK_UNIQUE_ID_COUNTER_, $nc_block_unique_id_counter$, ZERO_INTEGER ) ) );
    $rbp_universal_boolean_filters$ = SubLFiles.defparameter( "*RBP-UNIVERSAL-BOOLEAN-FILTERS*", $list92 );
    $rbp_deverbal_boolean_filters$ = SubLFiles.defparameter( "*RBP-DEVERBAL-BOOLEAN-FILTERS*", $list93 );
    $rbp_deverbal_macroscopic_filters$ = SubLFiles.defparameter( "*RBP-DEVERBAL-MACROSCOPIC-FILTERS*", $list94 );
    $rbp_deverbal_macroscopic_block_filters$ = SubLFiles.defparameter( "*RBP-DEVERBAL-MACROSCOPIC-BLOCK-FILTERS*", $list95 );
    $rbp_input_strings$ = SubLFiles.defparameter( "*RBP-INPUT-STRINGS*", NIL );
    $nominal_interpretations_only$ = SubLFiles.defparameter( "*NOMINAL-INTERPRETATIONS-ONLY*", T );
    $rbp_minimum_component_count$ = SubLFiles.defparameter( "*RBP-MINIMUM-COMPONENT-COUNT*", ONE_INTEGER );
    $rbp_maximum_component_count$ = SubLFiles.defparameter( "*RBP-MAXIMUM-COMPONENT-COUNT*", NIL );
    $ncp_problem_store$ = SubLFiles.defparameter( "*NCP-PROBLEM-STORE*", NIL );
    $rbp_sort_blocks_confidence_firstP$ = SubLFiles.defparameter( "*RBP-SORT-BLOCKS-CONFIDENCE-FIRST?*", NIL );
    $rbp_reliability_high$ = SubLFiles.defparameter( "*RBP-RELIABILITY-HIGH*", $float129$1_05 );
    $rbp_reliability_medium$ = SubLFiles.defparameter( "*RBP-RELIABILITY-MEDIUM*", ONE_INTEGER );
    $rbp_reliability_low$ = SubLFiles.defparameter( "*RBP-RELIABILITY-LOW*", $float130$0_95 );
    $rbp_chart_filterP$ = SubLFiles.deflexical( "*RBP-CHART-FILTER?*", NIL );
    $rbp_name_cache$ = SubLFiles.defparameter( "*RBP-NAME-CACHE*", NIL );
    $rbp_floors_cached_caching_state$ = SubLFiles.deflexical( "*RBP-FLOORS-CACHED-CACHING-STATE*", NIL );
    $rbp_ok_name_cachedP_caching_state$ = SubLFiles.deflexical( "*RBP-OK-NAME-CACHED?-CACHING-STATE*", NIL );
    $rbp_use_inter_arg_isa_filtersP$ = SubLFiles.defparameter( "*RBP-USE-INTER-ARG-ISA-FILTERS?*", NIL );
    $rbp_use_inter_arg_not_isa_filtersP$ = SubLFiles.defparameter( "*RBP-USE-INTER-ARG-NOT-ISA-FILTERS?*", T );
    $rbp_rb_closed_class_filter_keys$ = SubLFiles.deflexical( "*RBP-RB-CLOSED-CLASS-FILTER-KEYS*", $list239 );
    $rbp_rb_rules_matching_closed_specs_caching_state$ = SubLFiles.deflexical( "*RBP-RB-RULES-MATCHING-CLOSED-SPECS-CACHING-STATE*", NIL );
    $inter_constraints_from_rule_caching_state$ = SubLFiles.deflexical( "*INTER-CONSTRAINTS-FROM-RULE-CACHING-STATE*", NIL );
    $rbp_high_date_confidence$ = SubLFiles.defparameter( "*RBP-HIGH-DATE-CONFIDENCE*", $float281$0_75 );
    $rbp_low_date_confidence$ = SubLFiles.defparameter( "*RBP-LOW-DATE-CONFIDENCE*", $float282$0_25 );
    $rbp_date_fallback_identifier$ = SubLFiles.defparameter( "*RBP-DATE-FALLBACK-IDENTIFIER*", $kw283$DATE_FALLBACK );
    $rbp_date_fallback_test$ = SubLFiles.defparameter( "*RBP-DATE-FALLBACK-TEST*", Symbols.symbol_function( EQL ) );
    $dtp_date_parse_block$ = SubLFiles.defconstant( "*DTP-DATE-PARSE-BLOCK*", $sym284$DATE_PARSE_BLOCK );
    $rbp_rae_max_time$ = SubLFiles.defparameter( "*RBP-RAE-MAX-TIME*", TEN_INTEGER );
    $rbp_unlikely_subcollection_nautP_caching_state$ = SubLFiles.deflexical( "*RBP-UNLIKELY-SUBCOLLECTION-NAUT?-CACHING-STATE*", NIL );
    $ncs_formats$ = SubLFiles.defparameter( "*NCS-FORMATS*", NIL );
    $ncs_deverbals_onlyP$ = SubLFiles.defparameter( "*NCS-DEVERBALS-ONLY?*", NIL );
    return NIL;
  }

  public static SubLObject setup_noun_compound_parser_file()
  {
    utilities_macros.register_kb_function( $sym0$ADD_NC_RULE_CONSTRAINT );
    utilities_macros.register_kb_function( $sym1$REMOVE_NC_RULE_CONSTRAINT );
    utilities_macros.register_kb_function( $sym2$ADD_NC_RULE_TEMPLATE );
    utilities_macros.register_kb_function( $sym3$REMOVE_NC_RULE_TEMPLATE );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_noun_compound_parse$.getGlobalValue(), Symbols.symbol_function( $sym11$NOUN_COMPOUND_PARSE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list12 );
    Structures.def_csetf( $sym13$NC_PARSE_UNIQUE_ID, $sym14$_CSETF_NC_PARSE_UNIQUE_ID );
    Structures.def_csetf( $sym15$NC_PARSE_INPUT_STRING, $sym16$_CSETF_NC_PARSE_INPUT_STRING );
    Structures.def_csetf( $sym17$NC_PARSE_INPUT_STRINGS, $sym18$_CSETF_NC_PARSE_INPUT_STRINGS );
    Structures.def_csetf( $sym19$NC_PARSE_CHART, $sym20$_CSETF_NC_PARSE_CHART );
    Equality.identity( $sym4$NOUN_COMPOUND_PARSE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_noun_compound_parse$.getGlobalValue(), Symbols.symbol_function(
        $sym30$VISIT_DEFSTRUCT_OBJECT_NOUN_COMPOUND_PARSE_METHOD ) );
    subl_macro_promotions.declare_defglobal( $sym31$_NC_PARSE_ID_COUNTER_ );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_noun_compound_block$.getGlobalValue(), Symbols.symbol_function( $sym46$NOUN_COMPOUND_BLOCK_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list47 );
    Structures.def_csetf( $sym48$NC_BLOCK_UNIQUE_ID, $sym49$_CSETF_NC_BLOCK_UNIQUE_ID );
    Structures.def_csetf( $sym50$NC_BLOCK_SPAN_INDEX, $sym51$_CSETF_NC_BLOCK_SPAN_INDEX );
    Structures.def_csetf( $sym52$NC_BLOCK_CONFIDENCE, $sym53$_CSETF_NC_BLOCK_CONFIDENCE );
    Structures.def_csetf( $sym54$NC_BLOCK_DENOT, $sym55$_CSETF_NC_BLOCK_DENOT );
    Structures.def_csetf( $sym56$NC_BLOCK_FILTERS, $sym57$_CSETF_NC_BLOCK_FILTERS );
    Structures.def_csetf( $sym58$NC_BLOCK_SPANNED_STRING, $sym59$_CSETF_NC_BLOCK_SPANNED_STRING );
    Structures.def_csetf( $sym60$NC_BLOCK_HEAD, $sym61$_CSETF_NC_BLOCK_HEAD );
    Structures.def_csetf( $sym62$NC_BLOCK_HEAD_POS, $sym63$_CSETF_NC_BLOCK_HEAD_POS );
    Structures.def_csetf( $sym64$NC_BLOCK_HEAD_STRING_PRED, $sym65$_CSETF_NC_BLOCK_HEAD_STRING_PRED );
    Structures.def_csetf( $sym66$NC_BLOCK_SUB_TREE, $sym67$_CSETF_NC_BLOCK_SUB_TREE );
    Structures.def_csetf( $sym68$NC_BLOCK_PLIST, $sym69$_CSETF_NC_BLOCK_PLIST );
    Equality.identity( $sym39$NOUN_COMPOUND_BLOCK );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_noun_compound_block$.getGlobalValue(), Symbols.symbol_function(
        $sym81$VISIT_DEFSTRUCT_OBJECT_NOUN_COMPOUND_BLOCK_METHOD ) );
    subl_macro_promotions.declare_defglobal( $sym85$_NC_BLOCK_UNIQUE_ID_COUNTER_ );
    memoization_state.note_memoized_function( $sym86$COMBINE_NOUN_COMPOUND_BLOCKS );
    memoization_state.note_globally_cached_function( $sym161$RBP_FLOORS_CACHED );
    memoization_state.note_globally_cached_function( $sym165$RBP_OK_NAME_CACHED_ );
    memoization_state.note_globally_cached_function( $sym241$RBP_RB_RULES_MATCHING_CLOSED_SPECS );
    memoization_state.note_memoized_function( $sym245$RBP_VERIFY );
    memoization_state.note_memoized_function( $sym246$RBP_RB_INITIAL_SEARCH_NO_TRACING );
    memoization_state.note_globally_cached_function( $sym251$INTER_CONSTRAINTS_FROM_RULE );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_date_parse_block$.getGlobalValue(), Symbols.symbol_function( $sym291$DATE_PARSE_BLOCK_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list292 );
    Structures.def_csetf( $sym293$DATE_PARSE_BLOCK_SUBCOL_NAUT, $sym294$_CSETF_DATE_PARSE_BLOCK_SUBCOL_NAUT );
    Structures.def_csetf( $sym295$DATE_PARSE_BLOCK_CONFIDENCE, $sym296$_CSETF_DATE_PARSE_BLOCK_CONFIDENCE );
    Equality.identity( $sym284$DATE_PARSE_BLOCK );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_date_parse_block$.getGlobalValue(), Symbols.symbol_function(
        $sym299$VISIT_DEFSTRUCT_OBJECT_DATE_PARSE_BLOCK_METHOD ) );
    memoization_state.note_memoized_function( $sym317$RBP_ALL_EXISTS_MATCHES );
    memoization_state.note_globally_cached_function( $sym348$RBP_UNLIKELY_SUBCOLLECTION_NAUT_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_noun_compound_parser_file();
  }

  @Override
  public void initializeVariables()
  {
    init_noun_compound_parser_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_noun_compound_parser_file();
  }
  static
  {
    me = new noun_compound_parser();
    $dtp_noun_compound_parse$ = null;
    $nc_parse_id_counter$ = null;
    $rbp_report_parse_timeP$ = null;
    $rbp_shadow_rulesP$ = null;
    $rbp_rules_to_parses_shadow$ = null;
    $rbp_return_confidenceP$ = null;
    $rbp_show_successful_rulesP$ = null;
    $rbp_traced_rules$ = null;
    $dtp_noun_compound_block$ = null;
    $rbp_default_confidence_multiplier_for_failing_a_filter$ = null;
    $nc_block_unique_id_counter$ = null;
    $rbp_universal_boolean_filters$ = null;
    $rbp_deverbal_boolean_filters$ = null;
    $rbp_deverbal_macroscopic_filters$ = null;
    $rbp_deverbal_macroscopic_block_filters$ = null;
    $rbp_input_strings$ = null;
    $nominal_interpretations_only$ = null;
    $rbp_minimum_component_count$ = null;
    $rbp_maximum_component_count$ = null;
    $ncp_problem_store$ = null;
    $rbp_sort_blocks_confidence_firstP$ = null;
    $rbp_reliability_high$ = null;
    $rbp_reliability_medium$ = null;
    $rbp_reliability_low$ = null;
    $rbp_chart_filterP$ = null;
    $rbp_name_cache$ = null;
    $rbp_floors_cached_caching_state$ = null;
    $rbp_ok_name_cachedP_caching_state$ = null;
    $rbp_use_inter_arg_isa_filtersP$ = null;
    $rbp_use_inter_arg_not_isa_filtersP$ = null;
    $rbp_rb_closed_class_filter_keys$ = null;
    $rbp_rb_rules_matching_closed_specs_caching_state$ = null;
    $inter_constraints_from_rule_caching_state$ = null;
    $rbp_high_date_confidence$ = null;
    $rbp_low_date_confidence$ = null;
    $rbp_date_fallback_identifier$ = null;
    $rbp_date_fallback_test$ = null;
    $dtp_date_parse_block$ = null;
    $rbp_rae_max_time$ = null;
    $rbp_unlikely_subcollection_nautP_caching_state$ = null;
    $ncs_formats$ = null;
    $ncs_deverbals_onlyP$ = null;
    $sym0$ADD_NC_RULE_CONSTRAINT = makeSymbol( "ADD-NC-RULE-CONSTRAINT" );
    $sym1$REMOVE_NC_RULE_CONSTRAINT = makeSymbol( "REMOVE-NC-RULE-CONSTRAINT" );
    $sym2$ADD_NC_RULE_TEMPLATE = makeSymbol( "ADD-NC-RULE-TEMPLATE" );
    $sym3$REMOVE_NC_RULE_TEMPLATE = makeSymbol( "REMOVE-NC-RULE-TEMPLATE" );
    $sym4$NOUN_COMPOUND_PARSE = makeSymbol( "NOUN-COMPOUND-PARSE" );
    $sym5$NOUN_COMPOUND_PARSE_P = makeSymbol( "NOUN-COMPOUND-PARSE-P" );
    $list6 = ConsesLow.list( makeSymbol( "UNIQUE-ID" ), makeSymbol( "INPUT-STRING" ), makeSymbol( "INPUT-STRINGS" ), makeSymbol( "CHART" ) );
    $list7 = ConsesLow.list( makeKeyword( "UNIQUE-ID" ), makeKeyword( "INPUT-STRING" ), makeKeyword( "INPUT-STRINGS" ), makeKeyword( "CHART" ) );
    $list8 = ConsesLow.list( makeSymbol( "NC-PARSE-UNIQUE-ID" ), makeSymbol( "NC-PARSE-INPUT-STRING" ), makeSymbol( "NC-PARSE-INPUT-STRINGS" ), makeSymbol( "NC-PARSE-CHART" ) );
    $list9 = ConsesLow.list( makeSymbol( "_CSETF-NC-PARSE-UNIQUE-ID" ), makeSymbol( "_CSETF-NC-PARSE-INPUT-STRING" ), makeSymbol( "_CSETF-NC-PARSE-INPUT-STRINGS" ), makeSymbol( "_CSETF-NC-PARSE-CHART" ) );
    $sym10$PPRINT_NC_PARSE = makeSymbol( "PPRINT-NC-PARSE" );
    $sym11$NOUN_COMPOUND_PARSE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "NOUN-COMPOUND-PARSE-PRINT-FUNCTION-TRAMPOLINE" );
    $list12 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "NOUN-COMPOUND-PARSE-P" ) );
    $sym13$NC_PARSE_UNIQUE_ID = makeSymbol( "NC-PARSE-UNIQUE-ID" );
    $sym14$_CSETF_NC_PARSE_UNIQUE_ID = makeSymbol( "_CSETF-NC-PARSE-UNIQUE-ID" );
    $sym15$NC_PARSE_INPUT_STRING = makeSymbol( "NC-PARSE-INPUT-STRING" );
    $sym16$_CSETF_NC_PARSE_INPUT_STRING = makeSymbol( "_CSETF-NC-PARSE-INPUT-STRING" );
    $sym17$NC_PARSE_INPUT_STRINGS = makeSymbol( "NC-PARSE-INPUT-STRINGS" );
    $sym18$_CSETF_NC_PARSE_INPUT_STRINGS = makeSymbol( "_CSETF-NC-PARSE-INPUT-STRINGS" );
    $sym19$NC_PARSE_CHART = makeSymbol( "NC-PARSE-CHART" );
    $sym20$_CSETF_NC_PARSE_CHART = makeSymbol( "_CSETF-NC-PARSE-CHART" );
    $kw21$UNIQUE_ID = makeKeyword( "UNIQUE-ID" );
    $kw22$INPUT_STRING = makeKeyword( "INPUT-STRING" );
    $kw23$INPUT_STRINGS = makeKeyword( "INPUT-STRINGS" );
    $kw24$CHART = makeKeyword( "CHART" );
    $str25$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw26$BEGIN = makeKeyword( "BEGIN" );
    $sym27$MAKE_NOUN_COMPOUND_PARSE = makeSymbol( "MAKE-NOUN-COMPOUND-PARSE" );
    $kw28$SLOT = makeKeyword( "SLOT" );
    $kw29$END = makeKeyword( "END" );
    $sym30$VISIT_DEFSTRUCT_OBJECT_NOUN_COMPOUND_PARSE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-NOUN-COMPOUND-PARSE-METHOD" );
    $sym31$_NC_PARSE_ID_COUNTER_ = makeSymbol( "*NC-PARSE-ID-COUNTER*" );
    $str32$____NC_PARSE__ID___S__ = makeString( "~&#<NC-PARSE: ID: ~S~%" );
    $str33$__Input_string___S__ = makeString( "  Input string: ~S~%" );
    $str34$_Input_strings___S__ = makeString( " Input strings: ~S~%" );
    $str35$_________Chart___S__ = makeString( "         Chart: ~S~%" );
    $sym36$CLET = makeSymbol( "CLET" );
    $list37 = ConsesLow.list( ConsesLow.list( makeSymbol( "*RBP-SHOW-SUCCESSFUL-RULES?*" ), T ) );
    $sym38$RBP_RULE_CYCL = makeSymbol( "RBP-RULE-CYCL" );
    $sym39$NOUN_COMPOUND_BLOCK = makeSymbol( "NOUN-COMPOUND-BLOCK" );
    $sym40$NOUN_COMPOUND_BLOCK_P = makeSymbol( "NOUN-COMPOUND-BLOCK-P" );
    $list41 = ConsesLow.list( new SubLObject[] { makeSymbol( "UNIQUE-ID" ), makeSymbol( "SPAN-INDEX" ), makeSymbol( "CONFIDENCE" ), makeSymbol( "DENOT" ), makeSymbol( "FILTERS" ), makeSymbol( "SPANNED-STRING" ),
      makeSymbol( "HEAD" ), makeSymbol( "HEAD-POS" ), makeSymbol( "HEAD-STRING-PRED" ), makeSymbol( "SUB-TREE" ), makeSymbol( "PLIST" )
    } );
    $list42 = ConsesLow.list( new SubLObject[] { makeKeyword( "UNIQUE-ID" ), makeKeyword( "SPAN-INDEX" ), makeKeyword( "CONFIDENCE" ), makeKeyword( "DENOT" ), makeKeyword( "FILTERS" ), makeKeyword( "SPANNED-STRING" ),
      makeKeyword( "HEAD" ), makeKeyword( "HEAD-POS" ), makeKeyword( "HEAD-STRING-PRED" ), makeKeyword( "SUB-TREE" ), makeKeyword( "PLIST" )
    } );
    $list43 = ConsesLow.list( new SubLObject[] { makeSymbol( "NC-BLOCK-UNIQUE-ID" ), makeSymbol( "NC-BLOCK-SPAN-INDEX" ), makeSymbol( "NC-BLOCK-CONFIDENCE" ), makeSymbol( "NC-BLOCK-DENOT" ), makeSymbol(
        "NC-BLOCK-FILTERS" ), makeSymbol( "NC-BLOCK-SPANNED-STRING" ), makeSymbol( "NC-BLOCK-HEAD" ), makeSymbol( "NC-BLOCK-HEAD-POS" ), makeSymbol( "NC-BLOCK-HEAD-STRING-PRED" ), makeSymbol( "NC-BLOCK-SUB-TREE" ),
      makeSymbol( "NC-BLOCK-PLIST" )
    } );
    $list44 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-NC-BLOCK-UNIQUE-ID" ), makeSymbol( "_CSETF-NC-BLOCK-SPAN-INDEX" ), makeSymbol( "_CSETF-NC-BLOCK-CONFIDENCE" ), makeSymbol( "_CSETF-NC-BLOCK-DENOT" ),
      makeSymbol( "_CSETF-NC-BLOCK-FILTERS" ), makeSymbol( "_CSETF-NC-BLOCK-SPANNED-STRING" ), makeSymbol( "_CSETF-NC-BLOCK-HEAD" ), makeSymbol( "_CSETF-NC-BLOCK-HEAD-POS" ), makeSymbol(
          "_CSETF-NC-BLOCK-HEAD-STRING-PRED" ), makeSymbol( "_CSETF-NC-BLOCK-SUB-TREE" ), makeSymbol( "_CSETF-NC-BLOCK-PLIST" )
    } );
    $sym45$PPRINT_NC_BLOCK = makeSymbol( "PPRINT-NC-BLOCK" );
    $sym46$NOUN_COMPOUND_BLOCK_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "NOUN-COMPOUND-BLOCK-PRINT-FUNCTION-TRAMPOLINE" );
    $list47 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "NOUN-COMPOUND-BLOCK-P" ) );
    $sym48$NC_BLOCK_UNIQUE_ID = makeSymbol( "NC-BLOCK-UNIQUE-ID" );
    $sym49$_CSETF_NC_BLOCK_UNIQUE_ID = makeSymbol( "_CSETF-NC-BLOCK-UNIQUE-ID" );
    $sym50$NC_BLOCK_SPAN_INDEX = makeSymbol( "NC-BLOCK-SPAN-INDEX" );
    $sym51$_CSETF_NC_BLOCK_SPAN_INDEX = makeSymbol( "_CSETF-NC-BLOCK-SPAN-INDEX" );
    $sym52$NC_BLOCK_CONFIDENCE = makeSymbol( "NC-BLOCK-CONFIDENCE" );
    $sym53$_CSETF_NC_BLOCK_CONFIDENCE = makeSymbol( "_CSETF-NC-BLOCK-CONFIDENCE" );
    $sym54$NC_BLOCK_DENOT = makeSymbol( "NC-BLOCK-DENOT" );
    $sym55$_CSETF_NC_BLOCK_DENOT = makeSymbol( "_CSETF-NC-BLOCK-DENOT" );
    $sym56$NC_BLOCK_FILTERS = makeSymbol( "NC-BLOCK-FILTERS" );
    $sym57$_CSETF_NC_BLOCK_FILTERS = makeSymbol( "_CSETF-NC-BLOCK-FILTERS" );
    $sym58$NC_BLOCK_SPANNED_STRING = makeSymbol( "NC-BLOCK-SPANNED-STRING" );
    $sym59$_CSETF_NC_BLOCK_SPANNED_STRING = makeSymbol( "_CSETF-NC-BLOCK-SPANNED-STRING" );
    $sym60$NC_BLOCK_HEAD = makeSymbol( "NC-BLOCK-HEAD" );
    $sym61$_CSETF_NC_BLOCK_HEAD = makeSymbol( "_CSETF-NC-BLOCK-HEAD" );
    $sym62$NC_BLOCK_HEAD_POS = makeSymbol( "NC-BLOCK-HEAD-POS" );
    $sym63$_CSETF_NC_BLOCK_HEAD_POS = makeSymbol( "_CSETF-NC-BLOCK-HEAD-POS" );
    $sym64$NC_BLOCK_HEAD_STRING_PRED = makeSymbol( "NC-BLOCK-HEAD-STRING-PRED" );
    $sym65$_CSETF_NC_BLOCK_HEAD_STRING_PRED = makeSymbol( "_CSETF-NC-BLOCK-HEAD-STRING-PRED" );
    $sym66$NC_BLOCK_SUB_TREE = makeSymbol( "NC-BLOCK-SUB-TREE" );
    $sym67$_CSETF_NC_BLOCK_SUB_TREE = makeSymbol( "_CSETF-NC-BLOCK-SUB-TREE" );
    $sym68$NC_BLOCK_PLIST = makeSymbol( "NC-BLOCK-PLIST" );
    $sym69$_CSETF_NC_BLOCK_PLIST = makeSymbol( "_CSETF-NC-BLOCK-PLIST" );
    $kw70$SPAN_INDEX = makeKeyword( "SPAN-INDEX" );
    $kw71$CONFIDENCE = makeKeyword( "CONFIDENCE" );
    $kw72$DENOT = makeKeyword( "DENOT" );
    $kw73$FILTERS = makeKeyword( "FILTERS" );
    $kw74$SPANNED_STRING = makeKeyword( "SPANNED-STRING" );
    $kw75$HEAD = makeKeyword( "HEAD" );
    $kw76$HEAD_POS = makeKeyword( "HEAD-POS" );
    $kw77$HEAD_STRING_PRED = makeKeyword( "HEAD-STRING-PRED" );
    $kw78$SUB_TREE = makeKeyword( "SUB-TREE" );
    $kw79$PLIST = makeKeyword( "PLIST" );
    $sym80$MAKE_NOUN_COMPOUND_BLOCK = makeSymbol( "MAKE-NOUN-COMPOUND-BLOCK" );
    $sym81$VISIT_DEFSTRUCT_OBJECT_NOUN_COMPOUND_BLOCK_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-NOUN-COMPOUND-BLOCK-METHOD" );
    $kw82$WU = makeKeyword( "WU" );
    $float83$0_5 = makeDouble( 0.5 );
    $str84$__NCB__S___S__S_ = makeString( "#<NCB ~S: ~S ~S>" );
    $sym85$_NC_BLOCK_UNIQUE_ID_COUNTER_ = makeSymbol( "*NC-BLOCK-UNIQUE-ID-COUNTER*" );
    $sym86$COMBINE_NOUN_COMPOUND_BLOCKS = makeSymbol( "COMBINE-NOUN-COMPOUND-BLOCKS" );
    $list87 = ConsesLow.list( makeSymbol( "RULE" ), makeSymbol( "DENOT" ) );
    $str88$_ = makeString( " " );
    $float89$1_1 = makeDouble( 1.1 );
    $list90 = ConsesLow.list( makeSymbol( "DENOT" ), makeSymbol( "POS" ), makeSymbol( "PRED" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "WU" ) );
    $const91$Adjective = constant_handles.reader_make_constant_shell( makeString( "Adjective" ) );
    $list92 = ConsesLow.list( makeSymbol( "RBP-PARSE-FILTER-SUBCOLLECTION-ARGS" ) );
    $list93 = ConsesLow.list( makeSymbol( "RBP-PARSE-FILTER-NONAGENTIVE-ACTORS" ), makeSymbol( "RBP-PARSE-FILTER-UNLIKELY-INSTRUMENTALS" ) );
    $list94 = ConsesLow.list( makeSymbol( "RBP-UNLIKELY-SUBCOLLECTION-NAUT-WRT-OBJECT?" ) );
    $list95 = ConsesLow.list( makeSymbol( "RBP-UNLIKELY-SUBCOLLECTION-NAUT-BLOCK-WRT-OBJECT?" ) );
    $sym96$POSITIVE_INTEGER_P = makeSymbol( "POSITIVE-INTEGER-P" );
    $kw97$NONE = makeKeyword( "NONE" );
    $kw98$SKIP = makeKeyword( "SKIP" );
    $kw99$BOOLEAN = makeKeyword( "BOOLEAN" );
    $list100 = ConsesLow.list( makeSymbol( "BLOCK" ), makeSymbol( "DIAGNOSTICS" ) );
    $str101$Abandoning_parse__S_for__S = makeString( "Abandoning parse ~S for ~S" );
    $list102 = ConsesLow.list( makeSymbol( "BLOCK" ), makeSymbol( "FAILED-THESE-FILTERS" ), makeSymbol( "DISCONFIDENCE" ) );
    $list103 = ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym104$PROGN = makeSymbol( "PROGN" );
    $list105 = ConsesLow.list( makeSymbol( "NCP-INITIALIZE-METRICS" ) );
    $sym106$NCP_HERALD_START = makeSymbol( "NCP-HERALD-START" );
    $list107 = ConsesLow.list( makeSymbol( "TIME" ) );
    $sym108$CTIME = makeSymbol( "CTIME" );
    $sym109$TIME = makeSymbol( "TIME" );
    $list110 = ConsesLow.list( ConsesLow.list( makeSymbol( "NCP-REPORT-METRICS" ), makeSymbol( "TIME" ) ) );
    $int111$1000 = makeInteger( 1000 );
    $sym112$LISTP = makeSymbol( "LISTP" );
    $sym113$NON_DOTTED_LIST_P = makeSymbol( "NON-DOTTED-LIST-P" );
    $sym114$RBP_RULE_FORT_P = makeSymbol( "RBP-RULE-FORT-P" );
    $sym115$RBP_FIND_RULE_FROM_CYCL = makeSymbol( "RBP-FIND-RULE-FROM-CYCL" );
    $const116$NounCompoundRule = constant_handles.reader_make_constant_shell( makeString( "NounCompoundRule" ) );
    $sym117$STORE = makeUninternedSymbol( "STORE" );
    $sym118$WITH_NEW_PROBLEM_STORE = makeSymbol( "WITH-NEW-PROBLEM-STORE" );
    $sym119$_NCP_PROBLEM_STORE_ = makeSymbol( "*NCP-PROBLEM-STORE*" );
    $str120$__Total_parse_time___4_2F_seconds = makeString( "~&Total parse time: ~4,2F seconds.~%" );
    $str121$__Spent__4_2F_seconds_actually_pa = makeString( "~&Spent ~4,2F seconds actually parsing.~%" );
    $str122$__Now_parsing__S___ = makeString( "~&Now parsing ~S.~%" );
    $sym123$NPP_TERM_COMPLEXITY__ = makeSymbol( "NPP-TERM-COMPLEXITY-<" );
    $sym124$_ = makeSymbol( ">" );
    $str125$___S_didn_t_use_the_required_rule = makeString( "~&~S didn't use the required rules: ~S.~%~%" );
    $str126$___S_was_too_long_or_too_short___ = makeString( "~&~S was too long or too short.~%~%" );
    $str127$__The__S_form_of____S___is_being_ = makeString( "~&The ~S form of~% ~S~% is being filtered out because it is not nominal.~%~%" );
    $kw128$MACROSCOPIC = makeKeyword( "MACROSCOPIC" );
    $float129$1_05 = makeDouble( 1.05 );
    $float130$0_95 = makeDouble( 0.95 );
    $const131$Noun = constant_handles.reader_make_constant_shell( makeString( "Noun" ) );
    $sym132$LEXIFICATION_SENTENCE_FROM_PREFERRED_LEXIFICATION_ASSERTION = makeSymbol( "LEXIFICATION-SENTENCE-FROM-PREFERRED-LEXIFICATION-ASSERTION" );
    $const133$SubcollectionRelationFunction_Typ = constant_handles.reader_make_constant_shell( makeString( "SubcollectionRelationFunction-TypeLevel" ) );
    $sym134$NPP_GENL_ = makeSymbol( "NPP-GENL?" );
    $sym135$NPP_ISA_ = makeSymbol( "NPP-ISA?" );
    $sym136$SUBCOLLECTION_FUNCTION_NAUT_PRED = makeSymbol( "SUBCOLLECTION-FUNCTION-NAUT-PRED" );
    $const137$relationAllExists = constant_handles.reader_make_constant_shell( makeString( "relationAllExists" ) );
    $kw138$GAF = makeKeyword( "GAF" );
    $str139$Strengthening__S_to_use__S = makeString( "Strengthening ~S to use ~S" );
    $const140$rewriteOf = constant_handles.reader_make_constant_shell( makeString( "rewriteOf" ) );
    $list141 = ConsesLow.list( makeSymbol( "DENOT-ARG0" ), makeSymbol( "DENOT-ARG1" ), makeSymbol( "DENOT-ARG2" ) );
    $const142$CityNamedFn = constant_handles.reader_make_constant_shell( makeString( "CityNamedFn" ) );
    $const143$State_Geopolitical = constant_handles.reader_make_constant_shell( makeString( "State-Geopolitical" ) );
    $const144$cityInState = constant_handles.reader_make_constant_shell( makeString( "cityInState" ) );
    $const145$nameString = constant_handles.reader_make_constant_shell( makeString( "nameString" ) );
    $sym146$STRING_ = makeSymbol( "STRING=" );
    $const147$Country = constant_handles.reader_make_constant_shell( makeString( "Country" ) );
    $const148$countryOfCity = constant_handles.reader_make_constant_shell( makeString( "countryOfCity" ) );
    $const149$NounPhrase = constant_handles.reader_make_constant_shell( makeString( "NounPhrase" ) );
    $kw150$ORIGINAL_STRING = makeKeyword( "ORIGINAL-STRING" );
    $const151$gerund = constant_handles.reader_make_constant_shell( makeString( "gerund" ) );
    $sym152$RBP_PARSE_AND_CONFIDENCE_ = makeSymbol( "RBP-PARSE-AND-CONFIDENCE=" );
    $sym153$NPP_PARSE_ = makeSymbol( "NPP-PARSE=" );
    $sym154$RBP_PARSE_AND_CONFIDENCE_ = makeSymbol( "RBP-PARSE-AND-CONFIDENCE?" );
    $kw155$QUADS = makeKeyword( "QUADS" );
    $kw156$TRIPLES = makeKeyword( "TRIPLES" );
    $int157$256 = makeInteger( 256 );
    $const158$Verb = constant_handles.reader_make_constant_shell( makeString( "Verb" ) );
    $const159$perfect = constant_handles.reader_make_constant_shell( makeString( "perfect" ) );
    $sym160$INTERVAL_TOKEN_LENGTH = makeSymbol( "INTERVAL-TOKEN-LENGTH" );
    $sym161$RBP_FLOORS_CACHED = makeSymbol( "RBP-FLOORS-CACHED" );
    $sym162$_RBP_FLOORS_CACHED_CACHING_STATE_ = makeSymbol( "*RBP-FLOORS-CACHED-CACHING-STATE*" );
    $int163$512 = makeInteger( 512 );
    $int164$128 = makeInteger( 128 );
    $sym165$RBP_OK_NAME_CACHED_ = makeSymbol( "RBP-OK-NAME-CACHED?" );
    $str166$the_ = makeString( "the " );
    $const167$abbreviationString_PN = constant_handles.reader_make_constant_shell( makeString( "abbreviationString-PN" ) );
    $const168$acronymString = constant_handles.reader_make_constant_shell( makeString( "acronymString" ) );
    $sym169$_RBP_OK_NAME_CACHED__CACHING_STATE_ = makeSymbol( "*RBP-OK-NAME-CACHED?-CACHING-STATE*" );
    $const170$atomicSymbol = constant_handles.reader_make_constant_shell( makeString( "atomicSymbol" ) );
    $const171$ProperNoun = constant_handles.reader_make_constant_shell( makeString( "ProperNoun" ) );
    $sym172$RBP_NAME_BLOCK_ = makeSymbol( "RBP-NAME-BLOCK?" );
    $sym173$RBP_NAME_BLOCK_PRED_AMONG_FLOORS_ = makeSymbol( "RBP-NAME-BLOCK-PRED-AMONG-FLOORS?" );
    $sym174$INTERVAL_SPAN_PRECEDES_ = makeSymbol( "INTERVAL-SPAN-PRECEDES?" );
    $sym175$FIRST = makeSymbol( "FIRST" );
    $list176 = ConsesLow.list( makeSymbol( "RBP-RULE" ), makeSymbol( "DTR1-ID" ), makeSymbol( "DTR2-ID" ) );
    $str177$_S__ = makeString( "~S~%" );
    $const178$ncRuleTemplate = constant_handles.reader_make_constant_shell( makeString( "ncRuleTemplate" ) );
    $const179$ncRuleTemplate_Compact = constant_handles.reader_make_constant_shell( makeString( "ncRuleTemplate-Compact" ) );
    $kw180$TRUE = makeKeyword( "TRUE" );
    $list181 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheList" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "FN" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "TheList" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "INDEXICAL1" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword(
            "BIND" ), makeSymbol( "BIN-PRED" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheList" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "INDEXICAL2" ) ), makeKeyword(
                "ANYTHING" ), makeKeyword( "ANYTHING" ) ) );
    $sym182$INDEXICAL2 = makeSymbol( "INDEXICAL2" );
    $sym183$BIN_PRED = makeSymbol( "BIN-PRED" );
    $sym184$INDEXICAL1 = makeSymbol( "INDEXICAL1" );
    $sym185$FN = makeSymbol( "FN" );
    $sym186$RBP_SEMANTIC_CONSTRAINT_P = makeSymbol( "RBP-SEMANTIC-CONSTRAINT-P" );
    $sym187$RBP_WORD_UNIT_CONSTRAINT_P = makeSymbol( "RBP-WORD-UNIT-CONSTRAINT-P" );
    $const188$typeLevelCognates = constant_handles.reader_make_constant_shell( makeString( "typeLevelCognates" ) );
    $const189$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $list190 = ConsesLow.list( makeSymbol( "FUNC" ), makeSymbol( "FOCAL-COL" ), makeSymbol( "PRED" ), makeSymbol( "OTHER-COL" ) );
    $const191$SubcollectionRelationFunction_Ins = constant_handles.reader_make_constant_shell( makeString( "SubcollectionRelationFunction-InstanceLevel" ) );
    $kw192$PROBLEM_STORE = makeKeyword( "PROBLEM-STORE" );
    $kw193$MAX_TRANSFORMATION_DEPTH = makeKeyword( "MAX-TRANSFORMATION-DEPTH" );
    $kw194$ISA = makeKeyword( "ISA" );
    $const195$geopoliticalSubdivision = constant_handles.reader_make_constant_shell( makeString( "geopoliticalSubdivision" ) );
    $kw196$NOT_ISA = makeKeyword( "NOT-ISA" );
    $sym197$_COL = makeSymbol( "?COL" );
    $const198$interArgNotIsa = constant_handles.reader_make_constant_shell( makeString( "interArgNotIsa" ) );
    $list199 = ConsesLow.list( makeSymbol( "?COL" ) );
    $const200$interArgIsa = constant_handles.reader_make_constant_shell( makeString( "interArgIsa" ) );
    $str201$____but__A_has_to_be_an_instance_ = makeString( "... but ~A has to be an instance of ~A in ~A and isn't" );
    $str202$____but__A_has_to_intersect__A_in = makeString( "... but ~A has to intersect ~A in ~A and doesn't" );
    $str203$____but__A_can_t_be_an_instance_o = makeString( "... but ~A can't be an instance of ~A in ~A and is" );
    $str204$____but__A_can_t_be_a_spec_of__A_ = makeString( "... but ~A can't be a spec of ~A in ~A and is" );
    $str205$interArgIsa_D__D = makeString( "interArgIsa~D-~D" );
    $str206$Couldn_t_find_inter_arg_isa_predi = makeString( "Couldn't find inter-arg-isa predicate from ~S to ~S" );
    $str207$interArgNotIsa_D__D = makeString( "interArgNotIsa~D-~D" );
    $str208$Couldn_t_find_inter_arg_not_isa_p = makeString( "Couldn't find inter-arg-not-isa predicate from ~S to ~S" );
    $list209 = ConsesLow.list( makeSymbol( "SEMX-PRED" ), makeSymbol( "ARG1" ), makeSymbol( "ARG2" ) );
    $const210$interArgIsa1_2 = constant_handles.reader_make_constant_shell( makeString( "interArgIsa1-2" ) );
    $str211$___but_it_fails_the_inter_arg_con = makeString( "...but it fails the inter-arg constraint:~%   ~A" );
    $const212$interArgIsa2_1 = constant_handles.reader_make_constant_shell( makeString( "interArgIsa2-1" ) );
    $const213$interArgNotIsa1_2 = constant_handles.reader_make_constant_shell( makeString( "interArgNotIsa1-2" ) );
    $list214 = ConsesLow.list( makeSymbol( "FUNC" ), makeSymbol( "COL1" ), makeSymbol( "SEMX-PRED" ), makeSymbol( "COL2" ) );
    $const215$SubcollectionRelationFunction_Can = constant_handles.reader_make_constant_shell( makeString( "SubcollectionRelationFunction-Canonical" ) );
    $const216$UniversalVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) );
    $str217$_A__ = makeString( "~A~%" );
    $const218$groupMembers = constant_handles.reader_make_constant_shell( makeString( "groupMembers" ) );
    $const219$GroupFn = constant_handles.reader_make_constant_shell( makeString( "GroupFn" ) );
    $const220$GroupOfCardinalityFn = constant_handles.reader_make_constant_shell( makeString( "GroupOfCardinalityFn" ) );
    $str221$___but_it_failed_the_groupMembers = makeString( "...but it failed the groupMembers wff-workaround (~A are groups of ~A, of which ~A is not a spec)" );
    $const222$Predicate = constant_handles.reader_make_constant_shell( makeString( "Predicate" ) );
    $str223$___but_the___CityNamedFn_arg2_doe = makeString( "...but the #$CityNamedFn arg2 doesn't match the #$cityInState arg2: ~A vs ~A" );
    $const224$StrictlyFunctionalSlot = constant_handles.reader_make_constant_shell( makeString( "StrictlyFunctionalSlot" ) );
    $sym225$RELEVANT_PRED_IS_SPEC_PRED = makeSymbol( "RELEVANT-PRED-IS-SPEC-PRED" );
    $str226$___but_it_failed_the_strictly_fun = makeString( "...but it failed the strictly-functional test: only (~A ~A ~A) is valid" );
    $sym227$RELEVANT_PRED_IS_SPEC_INVERSE = makeSymbol( "RELEVANT-PRED-IS-SPEC-INVERSE" );
    $str228$__Trying_this_block_pair_____S___ = makeString( "~%Trying this block pair:~% ~S (~S) (~S)~% ~S (~S) (~S).~%" );
    $str229$__Rule__S_yielded____a___for__S__ = makeString( "~&Rule ~S yielded~% ~a~% for ~S+~S.~%" );
    $kw230$WFF = makeKeyword( "WFF" );
    $str231$___but_it_failed_the_wff_checker_ = makeString( "...but it failed the wff-checker.~%" );
    $const232$FormulaArgFn = constant_handles.reader_make_constant_shell( makeString( "FormulaArgFn" ) );
    $list233 = ConsesLow.list( makeSymbol( "JUST-THIS-ARG" ), makeSymbol( "FORMULA" ) );
    $str234$___but_the_desired_FormulaArgFn__ = makeString( "...but the desired FormulaArgFn (~D) exceeds the semx arity (~D).~%" );
    $kw235$NOT_WFF = makeKeyword( "NOT-WFF" );
    $kw236$NON_WFF = makeKeyword( "NON-WFF" );
    $str237$___but_I_was_unable_to_verify__S_ = makeString( "...but I was unable to verify ~S~%" );
    $kw238$MODIFIER = makeKeyword( "MODIFIER" );
    $list239 = ConsesLow.list( ConsesLow.list( makeKeyword( "POS" ), makeKeyword( "HEAD" ) ), ConsesLow.list( makeKeyword( "PRED" ), makeKeyword( "HEAD" ) ), ConsesLow.list( makeKeyword( "POS" ), makeKeyword(
        "MODIFIER" ) ), ConsesLow.list( makeKeyword( "PRED" ), makeKeyword( "MODIFIER" ) ) );
    $list240 = ConsesLow.list( makeSymbol( "C-TYPE" ), makeSymbol( "O-TYPE" ) );
    $sym241$RBP_RB_RULES_MATCHING_CLOSED_SPECS = makeSymbol( "RBP-RB-RULES-MATCHING-CLOSED-SPECS" );
    $kw242$ALL = makeKeyword( "ALL" );
    $sym243$_RBP_RB_RULES_MATCHING_CLOSED_SPECS_CACHING_STATE_ = makeSymbol( "*RBP-RB-RULES-MATCHING-CLOSED-SPECS-CACHING-STATE*" );
    $kw244$OPEN_CLASS = makeKeyword( "OPEN-CLASS" );
    $sym245$RBP_VERIFY = makeSymbol( "RBP-VERIFY" );
    $sym246$RBP_RB_INITIAL_SEARCH_NO_TRACING = makeSymbol( "RBP-RB-INITIAL-SEARCH-NO-TRACING" );
    $kw247$SYNTACTIC = makeKeyword( "SYNTACTIC" );
    $kw248$SEMANTIC = makeKeyword( "SEMANTIC" );
    $kw249$CLOSED_CLASS = makeKeyword( "CLOSED-CLASS" );
    $str250$__The_blocks_failed_an_inter_cons = makeString( "~%The blocks failed an inter-constraint in ~S on ~S.~%" );
    $sym251$INTER_CONSTRAINTS_FROM_RULE = makeSymbol( "INTER-CONSTRAINTS-FROM-RULE" );
    $sym252$_INTER_CONSTRAINTS_FROM_RULE_CACHING_STATE_ = makeSymbol( "*INTER-CONSTRAINTS-FROM-RULE-CACHING-STATE*" );
    $list253 = ConsesLow.list( makeSymbol( "CON-KW" ), makeSymbol( "ARG1" ), makeSymbol( "ARG2" ) );
    $list254 = ConsesLow.list( makeKeyword( "modifier" ), makeKeyword( "MODIFIER" ) );
    $kw255$NO_DENOT = makeKeyword( "NO-DENOT" );
    $kw256$isa = makeKeyword( "isa" );
    $kw257$genl = makeKeyword( "genl" );
    $kw258$GENL = makeKeyword( "GENL" );
    $str259$__Semantics_are__S_and__S___in_te = makeString( "~&Semantics are ~S and ~S~% in template ~S.~%" );
    $kw260$pred = makeKeyword( "pred" );
    $kw261$PRED = makeKeyword( "PRED" );
    $sym262$NPP_GENL_PRED_ = makeSymbol( "NPP-GENL-PRED?" );
    $kw263$pos = makeKeyword( "pos" );
    $kw264$POS = makeKeyword( "POS" );
    $kw265$eql = makeKeyword( "eql" );
    $kw266$EQL = makeKeyword( "EQL" );
    $kw267$TYPE_GENL = makeKeyword( "TYPE-GENL" );
    $sym268$NPP_TYPE_GENL_ = makeSymbol( "NPP-TYPE-GENL?" );
    $sym269$NC_BLOCK_WU = makeSymbol( "NC-BLOCK-WU" );
    $sym270$RELEVANT_MT_IS_GENL_MT = makeSymbol( "RELEVANT-MT-IS-GENL-MT" );
    $str271$ing = makeString( "ing" );
    $const272$infinitive = constant_handles.reader_make_constant_shell( makeString( "infinitive" ) );
    $str273$ion = makeString( "ion" );
    $const274$agentive_Sg = constant_handles.reader_make_constant_shell( makeString( "agentive-Sg" ) );
    $const275$singular = constant_handles.reader_make_constant_shell( makeString( "singular" ) );
    $str276$ment = makeString( "ment" );
    $const277$nounStrings = constant_handles.reader_make_constant_shell( makeString( "nounStrings" ) );
    $const278$massNumber = constant_handles.reader_make_constant_shell( makeString( "massNumber" ) );
    $sym279$STRINGP = makeSymbol( "STRINGP" );
    $list280 = ConsesLow.list( makeSymbol( "MOD" ), makeSymbol( "HEAD" ) );
    $float281$0_75 = makeDouble( 0.75 );
    $float282$0_25 = makeDouble( 0.25 );
    $kw283$DATE_FALLBACK = makeKeyword( "DATE-FALLBACK" );
    $sym284$DATE_PARSE_BLOCK = makeSymbol( "DATE-PARSE-BLOCK" );
    $sym285$DATE_PARSE_BLOCK_P = makeSymbol( "DATE-PARSE-BLOCK-P" );
    $list286 = ConsesLow.list( makeSymbol( "SUBCOL-NAUT" ), makeSymbol( "CONFIDENCE" ) );
    $list287 = ConsesLow.list( makeKeyword( "SUBCOL-NAUT" ), makeKeyword( "CONFIDENCE" ) );
    $list288 = ConsesLow.list( makeSymbol( "DATE-PARSE-BLOCK-SUBCOL-NAUT" ), makeSymbol( "DATE-PARSE-BLOCK-CONFIDENCE" ) );
    $list289 = ConsesLow.list( makeSymbol( "_CSETF-DATE-PARSE-BLOCK-SUBCOL-NAUT" ), makeSymbol( "_CSETF-DATE-PARSE-BLOCK-CONFIDENCE" ) );
    $sym290$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym291$DATE_PARSE_BLOCK_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "DATE-PARSE-BLOCK-PRINT-FUNCTION-TRAMPOLINE" );
    $list292 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "DATE-PARSE-BLOCK-P" ) );
    $sym293$DATE_PARSE_BLOCK_SUBCOL_NAUT = makeSymbol( "DATE-PARSE-BLOCK-SUBCOL-NAUT" );
    $sym294$_CSETF_DATE_PARSE_BLOCK_SUBCOL_NAUT = makeSymbol( "_CSETF-DATE-PARSE-BLOCK-SUBCOL-NAUT" );
    $sym295$DATE_PARSE_BLOCK_CONFIDENCE = makeSymbol( "DATE-PARSE-BLOCK-CONFIDENCE" );
    $sym296$_CSETF_DATE_PARSE_BLOCK_CONFIDENCE = makeSymbol( "_CSETF-DATE-PARSE-BLOCK-CONFIDENCE" );
    $kw297$SUBCOL_NAUT = makeKeyword( "SUBCOL-NAUT" );
    $sym298$MAKE_DATE_PARSE_BLOCK = makeSymbol( "MAKE-DATE-PARSE-BLOCK" );
    $sym299$VISIT_DEFSTRUCT_OBJECT_DATE_PARSE_BLOCK_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-DATE-PARSE-BLOCK-METHOD" );
    $const300$dateOfEvent = constant_handles.reader_make_constant_shell( makeString( "dateOfEvent" ) );
    $const301$SubcollectionOfWithRelationToFn = constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationToFn" ) );
    $const302$YearFn = constant_handles.reader_make_constant_shell( makeString( "YearFn" ) );
    $sym303$EL_VARIABLE_P = makeSymbol( "EL-VARIABLE-P" );
    $const304$Event = constant_handles.reader_make_constant_shell( makeString( "Event" ) );
    $list305 = ConsesLow.list( makeSymbol( "EVENT" ), makeSymbol( "DATE-VAR" ) );
    $sym306$_EVENT = makeSymbol( "?EVENT" );
    $const307$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $const308$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $str309$_____todo_handle_dates_with_multi = makeString( "*** @todo handle dates with multiple variables" );
    $sym310$DATE_PARSE_COMPLEXITY__ = makeSymbol( "DATE-PARSE-COMPLEXITY->" );
    $const311$doneBy = constant_handles.reader_make_constant_shell( makeString( "doneBy" ) );
    $const312$Action = constant_handles.reader_make_constant_shell( makeString( "Action" ) );
    $const313$Agent_Generic = constant_handles.reader_make_constant_shell( makeString( "Agent-Generic" ) );
    $str314$rbp_parse_filter_nonagentive_acto = makeString( "rbp-parse-filter-nonagentive-actors" );
    $kw315$FROM = makeKeyword( "FROM" );
    $kw316$TO = makeKeyword( "TO" );
    $sym317$RBP_ALL_EXISTS_MATCHES = makeSymbol( "RBP-ALL-EXISTS-MATCHES" );
    $const318$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $kw319$MAX_NUMBER = makeKeyword( "MAX-NUMBER" );
    $kw320$MAX_TIME = makeKeyword( "MAX-TIME" );
    $kw321$RETURN = makeKeyword( "RETURN" );
    $kw322$TEMPLATE = makeKeyword( "TEMPLATE" );
    $sym323$_TYPE = makeSymbol( "?TYPE" );
    $str324$Timed_out_checking___relationAllE = makeString( "Timed out checking #$relationAllExists, etc. after ~S seconds on~% ~S ~S ~S" );
    $const325$SymmetricBinaryPredicate = constant_handles.reader_make_constant_shell( makeString( "SymmetricBinaryPredicate" ) );
    $const326$equals = constant_handles.reader_make_constant_shell( makeString( "equals" ) );
    $const327$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $const328$relationAllInstance = constant_handles.reader_make_constant_shell( makeString( "relationAllInstance" ) );
    $list329 = ConsesLow.list( makeSymbol( "?TYPE" ) );
    $const330$relationInstanceExists = constant_handles.reader_make_constant_shell( makeString( "relationInstanceExists" ) );
    $const331$relationExistsAll = constant_handles.reader_make_constant_shell( makeString( "relationExistsAll" ) );
    $const332$relationExistsInstance = constant_handles.reader_make_constant_shell( makeString( "relationExistsInstance" ) );
    $str333$rbp_parse_prefer_rmp_matches_had_ = makeString( "rbp-parse-prefer-rmp-matches had to punt" );
    $const334$expansion = constant_handles.reader_make_constant_shell( makeString( "expansion" ) );
    $const335$intersectionType = constant_handles.reader_make_constant_shell( makeString( "intersectionType" ) );
    $const336$SubcollectionRelationFunction = constant_handles.reader_make_constant_shell( makeString( "SubcollectionRelationFunction" ) );
    $kw337$ARG1 = makeKeyword( "ARG1" );
    $kw338$ARG2 = makeKeyword( "ARG2" );
    $const339$CollectionIntersection2Fn = constant_handles.reader_make_constant_shell( makeString( "CollectionIntersection2Fn" ) );
    $str340$doesn_t_match___relationAllExists = makeString( "doesn't match #$relationAllExists expectations for ~A" );
    $const341$instrumentType_Generic = constant_handles.reader_make_constant_shell( makeString( "instrumentType-Generic" ) );
    $const342$ObjectWithUse = constant_handles.reader_make_constant_shell( makeString( "ObjectWithUse" ) );
    $str343$rbp_parse_filter_unlikely_instrum = makeString( "rbp-parse-filter-unlikely-instrumentals" );
    $str344$rbp_parse_filter_unlikely_instrum = makeString( "rbp-parse-filter-unlikely-instrumentals had to punt" );
    $str345$rbp_parse_filter_subcollection_ar = makeString( "rbp-parse-filter-subcollection-args" );
    $kw346$OBJ = makeKeyword( "OBJ" );
    $str347$statistically_unlikely_object = makeString( "statistically unlikely object" );
    $sym348$RBP_UNLIKELY_SUBCOLLECTION_NAUT_ = makeSymbol( "RBP-UNLIKELY-SUBCOLLECTION-NAUT?" );
    $sym349$_RBP_UNLIKELY_SUBCOLLECTION_NAUT__CACHING_STATE_ = makeSymbol( "*RBP-UNLIKELY-SUBCOLLECTION-NAUT?-CACHING-STATE*" );
    $int350$64 = makeInteger( 64 );
    $list351 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nonPlural-Generic" ) ) );
    $const352$adjStrings = constant_handles.reader_make_constant_shell( makeString( "adjStrings" ) );
    $sym353$PARSE_AS_DENOT_OR_NOUN_COMPOUND = makeSymbol( "PARSE-AS-DENOT-OR-NOUN-COMPOUND" );
    $sym354$PARSE_DEVERBAL_COMPOUND_AS_FALLBACK = makeSymbol( "PARSE-DEVERBAL-COMPOUND-AS-FALLBACK" );
    $sym355$PARSE_STRING_AS_DATE_FALLBACK_ESCALATED = makeSymbol( "PARSE-STRING-AS-DATE-FALLBACK-ESCALATED" );
    $sym356$PARSE_ADJ_INITIAL_COMPOUND = makeSymbol( "PARSE-ADJ-INITIAL-COMPOUND" );
    $const357$Collection = constant_handles.reader_make_constant_shell( makeString( "Collection" ) );
    $kw358$XML = makeKeyword( "XML" );
    $str359$No_mode_specified_for_initialize_ = makeString( "No mode specified for initialize-ncs-formats" );
    $kw360$INVESTIGATING = makeKeyword( "INVESTIGATING" );
    $str361$investigating___D__A_____ = makeString( "investigating #~D ~A...~%" );
    $kw362$PRINT_ME = makeKeyword( "PRINT-ME" );
    $str363$parse_of__S_yielded___ = makeString( "parse of ~S yielded:~%" );
    $kw364$FLAG_BAD_PILE = makeKeyword( "FLAG-BAD-PILE" );
    $str365$______and_also________ = makeString( "..... and also .....~%" );
    $kw366$DENOTS = makeKeyword( "DENOTS" );
    $str367$____denots_are__A__ = makeString( "... denots are ~A~%" );
    $kw368$BREAK = makeKeyword( "BREAK" );
    $str369$________________________________ = makeString( "==============================~%" );
    $kw370$COUNT_WITH_PARSES = makeKeyword( "COUNT-WITH-PARSES" );
    $str371$__Total_compounds_with_any_parses = makeString( "~%Total compounds with any parses: ~A~%" );
    $kw372$ACTUAL_PARSES = makeKeyword( "ACTUAL-PARSES" );
    $str373$Total_parses_found___A__ = makeString( "Total parses found: ~A~%" );
    $kw374$PERCENT_APPROVED = makeKeyword( "PERCENT-APPROVED" );
    $str375$Percent_of_parses_approved___5_2F = makeString( "Percent of parses approved: ~5,2F~%" );
    $kw376$TOTAL_VIOLATIONS = makeKeyword( "TOTAL-VIOLATIONS" );
    $str377$Total_violations___A__ = makeString( "Total violations: ~A~%" );
    $kw378$TO_CONSTANTS = makeKeyword( "TO-CONSTANTS" );
    $str379$Note___A_parses_reformulated_to_c = makeString( "Note: ~A parses reformulated to constants~%" );
    $kw380$DENOTS_WANTED = makeKeyword( "DENOTS-WANTED" );
    $str381$Compounds_wanting_denots___A_____ = makeString( "Compounds wanting denots: ~A~%... having any: ~A~%... total: ~A~%" );
    $kw382$RULES_AND_PARSE = makeKeyword( "RULES-AND-PARSE" );
    $str383$from__S___A__ = makeString( "from ~S: ~A~%" );
    $kw384$FALLBACK_AND_PARSE = makeKeyword( "FALLBACK-AND-PARSE" );
    $str385$_A_A__ = makeString( "~A~A~%" );
    $kw386$LABEL = makeKeyword( "LABEL" );
    $str387$_A__ = makeString( "~A: " );
    $kw388$RULE_USES = makeKeyword( "RULE-USES" );
    $str389$Uses_of__A___A_total___A_good___A = makeString( "Uses of ~A: ~A total, ~A good, ~A bad~%" );
    $list390 = ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "CAT" ), makeSymbol( "&BODY" ), makeSymbol( "FORMAT-AND-ARGS" ) );
    $sym391$FORMAT = makeSymbol( "FORMAT" );
    $sym392$NCS_FORMAT = makeSymbol( "NCS-FORMAT" );
    $kw393$STDOUT = makeKeyword( "STDOUT" );
    $int394$100000 = makeInteger( 100000 );
    $str395$_cyc_departments_nl_doc_stats_src = makeString( "/cyc/departments/nl/doc/stats/src/acquaint-10000" );
    $str396$_cyc_departments_nl_doc_stats_kb = makeString( "/cyc/departments/nl/doc/stats/kb" );
    $str397$_ = makeString( "." );
    $str398$ = makeString( "" );
    $str399$_ = makeString( "-" );
    $str400$_ncr_stats = makeString( ".ncr.stats" );
    $kw401$DIRECTION = makeKeyword( "DIRECTION" );
    $kw402$OUTPUT = makeKeyword( "OUTPUT" );
    $kw403$IF_DOES_NOT_EXIST = makeKeyword( "IF-DOES-NOT-EXIST" );
    $kw404$CREATE = makeKeyword( "CREATE" );
    $str405$Couldn_t_open_output_stream__woul = makeString( "Couldn't open output stream, would be ~A" );
    $str406$would_print_to__S__ = makeString( "would print to ~S~%" );
    $str407$storing_results_in__S__cutoff_is_ = makeString( "storing results in ~S, cutoff is ~A~%" );
    $kw408$ON = makeKeyword( "ON" );
    $kw409$EOF = makeKeyword( "EOF" );
    $kw410$NOUN = makeKeyword( "NOUN" );
    $str411$from_fallback = makeString( "from fallback" );
    $int412$100 = makeInteger( 100 );
    $list413 = ConsesLow.cons( makeSymbol( "RULE" ), makeSymbol( "TOTAL-USES" ) );
    $str414$_cyc_projects_daml_call_thesaurus = makeString( "/cyc/projects/daml/call-thesaurus/parses.txt" );
    $str415$_ = makeString( "\"" );
    $str416$_ = makeString( "(" );
    $str417$skipping__A______ = makeString( "skipping ~A ...  " );
    $str418$investigating__A______ = makeString( "investigating ~A ...~%" );
    $kw419$OFF = makeKeyword( "OFF" );
    $str420$_S_______________________________ = makeString( "~S~%==============================~%" );
    $str421$found_something_for__A_of__A_entr = makeString( "found something for ~A of ~A entries, ignoring aircraft models" );
    $list422 = ConsesLow.list( ConsesLow.list( makeSymbol( "NAME" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym423$PCOND = makeSymbol( "PCOND" );
    $sym424$FIND_CONSTANT = makeSymbol( "FIND-CONSTANT" );
    $sym425$_RBP_SHOW_SUCCESSFUL_RULES__ = makeSymbol( "*RBP-SHOW-SUCCESSFUL-RULES?*" );
    $sym426$WARN = makeSymbol( "WARN" );
    $str427$Skipping_this_test_as__A_doesn_t_ = makeString( "Skipping this test as ~A doesn't exist in the KB" );
  }

  public static final class $noun_compound_parse_native
      extends
        SubLStructNative
  {
    public SubLObject $unique_id;
    public SubLObject $input_string;
    public SubLObject $input_strings;
    public SubLObject $chart;
    private static final SubLStructDeclNative structDecl;

    public $noun_compound_parse_native()
    {
      this.$unique_id = CommonSymbols.NIL;
      this.$input_string = CommonSymbols.NIL;
      this.$input_strings = CommonSymbols.NIL;
      this.$chart = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $noun_compound_parse_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$unique_id;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$input_string;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$input_strings;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$chart;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$unique_id = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$input_string = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$input_strings = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$chart = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $noun_compound_parse_native.class, $sym4$NOUN_COMPOUND_PARSE, $sym5$NOUN_COMPOUND_PARSE_P, $list6, $list7, new String[] { "$unique_id", "$input_string",
        "$input_strings", "$chart"
      }, $list8, $list9, $sym10$PPRINT_NC_PARSE );
    }
  }

  public static final class $noun_compound_parse_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $noun_compound_parse_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "NOUN-COMPOUND-PARSE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return noun_compound_parse_p( arg1 );
    }
  }

  public static final class $noun_compound_block_native
      extends
        SubLStructNative
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

    public $noun_compound_block_native()
    {
      this.$unique_id = CommonSymbols.NIL;
      this.$span_index = CommonSymbols.NIL;
      this.$confidence = CommonSymbols.NIL;
      this.$denot = CommonSymbols.NIL;
      this.$filters = CommonSymbols.NIL;
      this.$spanned_string = CommonSymbols.NIL;
      this.$head = CommonSymbols.NIL;
      this.$head_pos = CommonSymbols.NIL;
      this.$head_string_pred = CommonSymbols.NIL;
      this.$sub_tree = CommonSymbols.NIL;
      this.$plist = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $noun_compound_block_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$unique_id;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$span_index;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$confidence;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$denot;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$filters;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$spanned_string;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$head;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$head_pos;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$head_string_pred;
    }

    @Override
    public SubLObject getField11()
    {
      return this.$sub_tree;
    }

    @Override
    public SubLObject getField12()
    {
      return this.$plist;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$unique_id = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$span_index = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$confidence = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$denot = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$filters = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$spanned_string = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$head = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$head_pos = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$head_string_pred = value;
    }

    @Override
    public SubLObject setField11(final SubLObject value)
    {
      return this.$sub_tree = value;
    }

    @Override
    public SubLObject setField12(final SubLObject value)
    {
      return this.$plist = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $noun_compound_block_native.class, $sym39$NOUN_COMPOUND_BLOCK, $sym40$NOUN_COMPOUND_BLOCK_P, $list41, $list42, new String[] { "$unique_id", "$span_index",
        "$confidence", "$denot", "$filters", "$spanned_string", "$head", "$head_pos", "$head_string_pred", "$sub_tree", "$plist"
      }, $list43, $list44, $sym45$PPRINT_NC_BLOCK );
    }
  }

  public static final class $noun_compound_block_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $noun_compound_block_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "NOUN-COMPOUND-BLOCK-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return noun_compound_block_p( arg1 );
    }
  }

  public static final class $date_parse_block_native
      extends
        SubLStructNative
  {
    public SubLObject $subcol_naut;
    public SubLObject $confidence;
    private static final SubLStructDeclNative structDecl;

    public $date_parse_block_native()
    {
      this.$subcol_naut = CommonSymbols.NIL;
      this.$confidence = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $date_parse_block_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$subcol_naut;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$confidence;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$subcol_naut = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$confidence = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $date_parse_block_native.class, $sym284$DATE_PARSE_BLOCK, $sym285$DATE_PARSE_BLOCK_P, $list286, $list287, new String[] { "$subcol_naut", "$confidence"
      }, $list288, $list289, $sym290$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $date_parse_block_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $date_parse_block_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "DATE-PARSE-BLOCK-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return date_parse_block_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 2353 ms synthetic
 */