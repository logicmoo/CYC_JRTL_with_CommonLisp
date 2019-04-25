package com.cyc.cycjava.cycl.rtp;

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
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.lexicon_utilities;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.arity;
import com.cyc.cycjava.cycl.pph_vars;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.pph_macros;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.cycjava.cycl.hash_table_utilities;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.lexicon_cache;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.cycjava.cycl.pph_methods_lexicon;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.cycjava.cycl.rkf_concept_harvester;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.cfasl;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rtp_datastructures
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.rtp.rtp_datastructures";
  public static final String myFingerPrint = "e74492b5da53c4ab8b82f4e7934825c95dabd525783d1df1640e41ee3cc917a6";
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 745L)
  public static SubLSymbol $print_rule_abbreviated$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 847L)
  private static SubLSymbol $template_meta_marker_mappings$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 1321L)
  private static SubLSymbol $template_meta_marker_predicate$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 2520L)
  public static SubLSymbol $template_category_fill_words$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 3035L)
  private static SubLSymbol $template_category_fill_word_predicate$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 3957L)
  private static SubLSymbol $make_optional_word_list_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 5594L)
  public static SubLSymbol $dtp_template_rule$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 6995L)
  public static SubLSymbol $template_rule_sxhashing_prime_a$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 7045L)
  public static SubLSymbol $template_rule_sxhashing_prime_b$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 7094L)
  public static SubLSymbol $use_better_template_rule_sxhashP$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 8358L)
  public static SubLSymbol $template_rule_default_assertion$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 8423L)
  public static SubLSymbol $template_rule_default_meaning$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 8513L)
  private static SubLSymbol $template_rule_isg$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 9707L)
  private static SubLSymbol $cfasl_opcode_template_rule$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 11531L)
  public static SubLSymbol $dtp_template_span_item$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 12166L)
  private static SubLSymbol $template_terminal_style$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 15723L)
  private static SubLSymbol $block_left_recursive_templates$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 16802L)
  private static SubLSymbol $denotations_of_constant_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 17815L)
  private static SubLSymbol $all_phrases_filter_from_term_phrases_constraint_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 21995L)
  public static SubLSymbol $rtp_contractions_table$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 28656L)
  public static SubLSymbol $rtp_rules$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 28801L)
  private static SubLSymbol $rtp_rules_initial_size$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 32929L)
  private static SubLSymbol $template_rules_master_index$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 34779L)
  public static SubLSymbol $dtp_categorized_template_rule_set$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 45142L)
  public static SubLSymbol $assume_empty_associative_memoryP$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 45798L)
  private static SubLSymbol $relevant_template_mts_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 46077L)
  private static SubLSymbol $template_mts$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 49872L)
  private static SubLSymbol $rtp_asserts_initialized_so_far$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 58531L)
  public static SubLSymbol $dtp_rtp_chart_entry$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 63646L)
  public static SubLSymbol $dtp_subconstit$;
  private static final SubLSymbol $sym0$_TEMPLATE_META_MARKER_MAPPINGS_;
  private static final SubLSymbol $sym1$FORT_P;
  private static final SubLSymbol $sym2$STRINGP;
  private static final SubLObject $const3$templateMarkerRepresentation;
  private static final SubLSymbol $sym4$RELEVANT_MT_IS_EQ;
  private static final SubLSymbol $kw5$GAF;
  private static final SubLSymbol $sym6$_TEMPLATE_CATEGORY_FILL_WORDS_;
  private static final SubLObject $const7$templateCategoryFillWord;
  private static final SubLSymbol $sym8$MAKE_OPTIONAL_WORD_LIST;
  private static final SubLObject $const9$OptionalSome;
  private static final SubLSymbol $sym10$_MAKE_OPTIONAL_WORD_LIST_CACHING_STATE_;
  private static final SubLInteger $int11$64;
  private static final SubLSymbol $sym12$TEMPLATE_RULE;
  private static final SubLSymbol $sym13$TEMPLATE_RULE_P;
  private static final SubLList $list14;
  private static final SubLList $list15;
  private static final SubLList $list16;
  private static final SubLList $list17;
  private static final SubLSymbol $sym18$PRINT_TEMPLATE_RULE;
  private static final SubLSymbol $sym19$TEMPLATE_RULE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list20;
  private static final SubLSymbol $sym21$TEMPLATE_RULE_CATEGORY;
  private static final SubLSymbol $sym22$_CSETF_TEMPLATE_RULE_CATEGORY;
  private static final SubLSymbol $sym23$TEMPLATE_RULE_TEMPLATE;
  private static final SubLSymbol $sym24$_CSETF_TEMPLATE_RULE_TEMPLATE;
  private static final SubLSymbol $sym25$TEMPLATE_RULE_TRANSFORMATION;
  private static final SubLSymbol $sym26$_CSETF_TEMPLATE_RULE_TRANSFORMATION;
  private static final SubLSymbol $sym27$TEMPLATE_RULE_SEM_TEST;
  private static final SubLSymbol $sym28$_CSETF_TEMPLATE_RULE_SEM_TEST;
  private static final SubLSymbol $sym29$TEMPLATE_RULE_ASSERTION;
  private static final SubLSymbol $sym30$_CSETF_TEMPLATE_RULE_ASSERTION;
  private static final SubLSymbol $sym31$TEMPLATE_RULE_TERMINALS;
  private static final SubLSymbol $sym32$_CSETF_TEMPLATE_RULE_TERMINALS;
  private static final SubLSymbol $sym33$TEMPLATE_RULE_MEANING;
  private static final SubLSymbol $sym34$_CSETF_TEMPLATE_RULE_MEANING;
  private static final SubLSymbol $sym35$TEMPLATE_RULE_CONSTRAINTS;
  private static final SubLSymbol $sym36$_CSETF_TEMPLATE_RULE_CONSTRAINTS;
  private static final SubLSymbol $sym37$TEMPLATE_RULE_ID;
  private static final SubLSymbol $sym38$_CSETF_TEMPLATE_RULE_ID;
  private static final SubLSymbol $kw39$CATEGORY;
  private static final SubLSymbol $kw40$TEMPLATE;
  private static final SubLSymbol $kw41$TRANSFORMATION;
  private static final SubLSymbol $kw42$SEM_TEST;
  private static final SubLSymbol $kw43$ASSERTION;
  private static final SubLSymbol $kw44$TERMINALS;
  private static final SubLSymbol $kw45$MEANING;
  private static final SubLSymbol $kw46$CONSTRAINTS;
  private static final SubLSymbol $kw47$ID;
  private static final SubLString $str48$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw49$BEGIN;
  private static final SubLSymbol $sym50$MAKE_TEMPLATE_RULE;
  private static final SubLSymbol $kw51$SLOT;
  private static final SubLSymbol $kw52$END;
  private static final SubLSymbol $sym53$VISIT_DEFSTRUCT_OBJECT_TEMPLATE_RULE_METHOD;
  private static final SubLSymbol $sym54$_USE_BETTER_TEMPLATE_RULE_SXHASH__;
  private static final SubLSymbol $sym55$SXHASH_TEMPLATE_RULE_METHOD;
  private static final SubLString $str56$__A_for__S____from_Assertion__S__;
  private static final SubLString $str57$___Subject_to_test__S;
  private static final SubLString $str58$___Augmented_Template___S;
  private static final SubLString $str59$___Term___S____Const___S;
  private static final SubLString $str60$___;
  private static final SubLString $str61$assertTemplate;
  private static final SubLSymbol $sym62$_TEMPLATE_RULE_ISG_;
  private static final SubLInteger $int63$97;
  private static final SubLSymbol $sym64$CFASL_INPUT_TEMPLATE_RULE;
  private static final SubLSymbol $sym65$CFASL_OUTPUT_OBJECT_TEMPLATE_RULE_METHOD;
  private static final SubLSymbol $sym66$TEMPLATE_SPAN_ITEM;
  private static final SubLSymbol $sym67$TEMPLATE_SPAN_ITEM_P;
  private static final SubLList $list68;
  private static final SubLList $list69;
  private static final SubLList $list70;
  private static final SubLList $list71;
  private static final SubLSymbol $sym72$PRINT_TEMPLATE_SPAN_ITEM;
  private static final SubLSymbol $sym73$TEMPLATE_SPAN_ITEM_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list74;
  private static final SubLSymbol $sym75$TEMPLATE_SPAN_ITEM_TEMPLATE_ITEM;
  private static final SubLSymbol $sym76$_CSETF_TEMPLATE_SPAN_ITEM_TEMPLATE_ITEM;
  private static final SubLSymbol $sym77$TEMPLATE_SPAN_ITEM_START;
  private static final SubLSymbol $sym78$_CSETF_TEMPLATE_SPAN_ITEM_START;
  private static final SubLSymbol $sym79$TEMPLATE_SPAN_ITEM_END;
  private static final SubLSymbol $sym80$_CSETF_TEMPLATE_SPAN_ITEM_END;
  private static final SubLSymbol $kw81$TEMPLATE_ITEM;
  private static final SubLSymbol $kw82$START;
  private static final SubLSymbol $sym83$MAKE_TEMPLATE_SPAN_ITEM;
  private static final SubLSymbol $sym84$VISIT_DEFSTRUCT_OBJECT_TEMPLATE_SPAN_ITEM_METHOD;
  private static final SubLString $str85$__S__S__S_;
  private static final SubLSymbol $kw86$STANDARD;
  private static final SubLObject $const87$RequireOne;
  private static final SubLSymbol $sym88$EXPAND_WORD_ITEMS_IN_LIST;
  private static final SubLString $str89$_;
  private static final SubLObject $const90$WordSequence;
  private static final SubLSymbol $kw91$RECURSIVE_TEMPLATE;
  private static final SubLString $str92$Left_recursive_template___S__;
  private static final SubLSymbol $sym93$DENOTATIONS_OF_CONSTANT;
  private static final SubLList $list94;
  private static final SubLSymbol $kw95$TEXT;
  private static final SubLSymbol $sym96$_DENOTATIONS_OF_CONSTANT_CACHING_STATE_;
  private static final SubLInteger $int97$1024;
  private static final SubLSymbol $kw98$ALL;
  private static final SubLSymbol $sym99$ALL_PHRASES_FILTER_FROM_TERM_PHRASES_CONSTRAINT;
  private static final SubLObject $const100$CollectionLexificationPredicate_R;
  private static final SubLSymbol $sym101$_ALL_PHRASES_FILTER_FROM_TERM_PHRASES_CONSTRAINT_CACHING_STATE_;
  private static final SubLInteger $int102$200;
  private static final SubLList $list103;
  private static final SubLList $list104;
  private static final SubLObject $const105$contractedFormOfWord;
  private static final SubLSymbol $sym106$_FULL_WORD;
  private static final SubLSymbol $sym107$_FORM;
  private static final SubLObject $const108$partOfSpeech;
  private static final SubLList $list109;
  private static final SubLSymbol $sym110$_WORD;
  private static final SubLObject $const111$posForms;
  private static final SubLList $list112;
  private static final SubLSymbol $sym113$STRING_EQUAL;
  private static final SubLSymbol $kw114$COMPLETE;
  private static final SubLSymbol $sym115$_RTP_RULES_;
  private static final SubLInteger $int116$256;
  private static final SubLSymbol $kw117$CLEARED;
  private static final SubLInteger $int118$500;
  private static final SubLSymbol $kw119$ADDED;
  private static final SubLSymbol $sym120$_TEMPLATE_RULES_MASTER_INDEX_;
  private static final SubLSymbol $kw121$ENSURED;
  private static final SubLSymbol $sym122$CATEGORIZED_TEMPLATE_RULE_SET;
  private static final SubLSymbol $sym123$CATEGORIZED_TEMPLATE_RULE_SET_P;
  private static final SubLList $list124;
  private static final SubLList $list125;
  private static final SubLList $list126;
  private static final SubLList $list127;
  private static final SubLSymbol $sym128$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym129$CATEGORIZED_TEMPLATE_RULE_SET_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list130;
  private static final SubLSymbol $sym131$CATEGORIZED_TEMPLATE_RULE_SET_MENTIONS;
  private static final SubLSymbol $sym132$_CSETF_CATEGORIZED_TEMPLATE_RULE_SET_MENTIONS;
  private static final SubLSymbol $sym133$CATEGORIZED_TEMPLATE_RULE_SET_GENERIC;
  private static final SubLSymbol $sym134$_CSETF_CATEGORIZED_TEMPLATE_RULE_SET_GENERIC;
  private static final SubLSymbol $sym135$CATEGORIZED_TEMPLATE_RULE_SET_KEY_TERMINAL;
  private static final SubLSymbol $sym136$_CSETF_CATEGORIZED_TEMPLATE_RULE_SET_KEY_TERMINAL;
  private static final SubLSymbol $kw137$MENTIONS;
  private static final SubLSymbol $kw138$GENERIC;
  private static final SubLSymbol $kw139$KEY_TERMINAL;
  private static final SubLSymbol $sym140$MAKE_CATEGORIZED_TEMPLATE_RULE_SET;
  private static final SubLSymbol $sym141$VISIT_DEFSTRUCT_OBJECT_CATEGORIZED_TEMPLATE_RULE_SET_METHOD;
  private static final SubLList $list142;
  private static final SubLSymbol $sym143$CURRENT_MT;
  private static final SubLSymbol $sym144$CURRENT_RULE;
  private static final SubLSymbol $sym145$MENTIONS;
  private static final SubLSymbol $sym146$TEMPLATES;
  private static final SubLSymbol $sym147$CDOLIST;
  private static final SubLSymbol $sym148$RELEVANT_TEMPLATE_MTS;
  private static final SubLSymbol $sym149$CLET;
  private static final SubLSymbol $sym150$GET_CATEGORIZED_TEMPLATE_RULE_SET;
  private static final SubLSymbol $sym151$PWHEN;
  private static final SubLSymbol $sym152$HASH_TABLE_P;
  private static final SubLSymbol $sym153$GETHASH_WITHOUT_VALUES;
  private static final SubLSymbol $sym154$DICTIONARY_P;
  private static final SubLSymbol $sym155$DO_DICTIONARY_KEYS;
  private static final SubLList $list156;
  private static final SubLSymbol $sym157$_RELEVANT_TEMPLATE_MTS_CACHING_STATE_;
  private static final SubLInteger $int158$128;
  private static final SubLSymbol $sym159$CLEAR_RELEVANT_TEMPLATE_MTS;
  private static final SubLSymbol $sym160$_TEMPLATE_MTS_;
  private static final SubLObject $const161$TemplateParsingMt;
  private static final SubLSymbol $sym162$STRING_;
  private static final SubLObject $const163$ParseTemplatePredicate;
  private static final SubLObject $const164$TemplateParsingMicrotheory;
  private static final SubLList $list165;
  private static final SubLString $str166$Gathering_Template_Parsing_Assert;
  private static final SubLString $str167$_mts__;
  private static final SubLString $str168$_total_;
  private static final SubLSymbol $kw169$NEW;
  private static final SubLObject $const170$CyclishParaphraseMt;
  private static final SubLObject $const171$DataForNLMt;
  private static final SubLObject $const172$ExpandSubLFn;
  private static final SubLObject $const173$SubLQuoteFn;
  private static final SubLString $str174$Assertion__D_specifies_a_left_rec;
  private static final SubLObject $const175$NLPatternList;
  private static final SubLObject $const176$NLPattern_Word;
  private static final SubLObject $const177$NLPattern_Template;
  private static final SubLObject $const178$NLParsingSlot;
  private static final SubLObject $const179$NLPattern_Term_Optional;
  private static final SubLObject $const180$OptionalOne;
  private static final SubLObject $const181$NLPattern_Exact;
  private static final SubLSymbol $kw182$IGNORE;
  private static final SubLList $list183;
  private static final SubLObject $const184$TemplateParsingSyntacticConstrain;
  private static final SubLString $str185$Strange_template_assertion__S_wit;
  private static final SubLSymbol $sym186$ADD_TEMPLATE_ASSERTION;
  private static final SubLSymbol $sym187$REMOVE_TEMPLATE_ASSERTION;
  private static final SubLSymbol $kw188$ASSERTED_TRUE_DEF;
  private static final SubLSymbol $kw189$ASSERTED_TRUE_MON;
  private static final SubLSymbol $sym190$RTP_CHART_ENTRY;
  private static final SubLSymbol $sym191$RTP_CHART_ENTRY_P;
  private static final SubLList $list192;
  private static final SubLList $list193;
  private static final SubLList $list194;
  private static final SubLList $list195;
  private static final SubLSymbol $sym196$RTP_ENTRY_PRINT;
  private static final SubLSymbol $sym197$RTP_CHART_ENTRY_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list198;
  private static final SubLSymbol $sym199$RTP_CHART_ENTRY_START;
  private static final SubLSymbol $sym200$_CSETF_RTP_CHART_ENTRY_START;
  private static final SubLSymbol $sym201$RTP_CHART_ENTRY_END;
  private static final SubLSymbol $sym202$_CSETF_RTP_CHART_ENTRY_END;
  private static final SubLSymbol $sym203$RTP_CHART_ENTRY_RULE;
  private static final SubLSymbol $sym204$_CSETF_RTP_CHART_ENTRY_RULE;
  private static final SubLSymbol $sym205$RTP_CHART_ENTRY_TEMPLATE_INDEX;
  private static final SubLSymbol $sym206$_CSETF_RTP_CHART_ENTRY_TEMPLATE_INDEX;
  private static final SubLSymbol $sym207$RTP_CHART_ENTRY_WORDS;
  private static final SubLSymbol $sym208$_CSETF_RTP_CHART_ENTRY_WORDS;
  private static final SubLSymbol $sym209$RTP_CHART_ENTRY_BINDINGS;
  private static final SubLSymbol $sym210$_CSETF_RTP_CHART_ENTRY_BINDINGS;
  private static final SubLSymbol $sym211$RTP_CHART_ENTRY_SUBCONSTITS;
  private static final SubLSymbol $sym212$_CSETF_RTP_CHART_ENTRY_SUBCONSTITS;
  private static final SubLSymbol $sym213$RTP_CHART_ENTRY_SEM;
  private static final SubLSymbol $sym214$_CSETF_RTP_CHART_ENTRY_SEM;
  private static final SubLSymbol $kw215$RULE;
  private static final SubLSymbol $kw216$TEMPLATE_INDEX;
  private static final SubLSymbol $kw217$WORDS;
  private static final SubLSymbol $kw218$BINDINGS;
  private static final SubLSymbol $kw219$SUBCONSTITS;
  private static final SubLSymbol $kw220$SEM;
  private static final SubLSymbol $sym221$MAKE_RTP_CHART_ENTRY;
  private static final SubLSymbol $sym222$VISIT_DEFSTRUCT_OBJECT_RTP_CHART_ENTRY_METHOD;
  private static final SubLString $str223$__RTP_entry______Words__S_____Sem;
  private static final SubLObject $const224$semanticTest;
  private static final SubLSymbol $sym225$SUBCONSTIT;
  private static final SubLSymbol $sym226$SUBCONSTIT_P;
  private static final SubLList $list227;
  private static final SubLList $list228;
  private static final SubLList $list229;
  private static final SubLList $list230;
  private static final SubLSymbol $sym231$PRINT_SUBCONSTIT;
  private static final SubLSymbol $sym232$SUBCONSTIT_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list233;
  private static final SubLSymbol $sym234$SUBCONSTIT_CAT;
  private static final SubLSymbol $sym235$_CSETF_SUBCONSTIT_CAT;
  private static final SubLSymbol $sym236$SUBCONSTIT_STRING;
  private static final SubLSymbol $sym237$_CSETF_SUBCONSTIT_STRING;
  private static final SubLSymbol $sym238$SUBCONSTIT_BINDING_VAR;
  private static final SubLSymbol $sym239$_CSETF_SUBCONSTIT_BINDING_VAR;
  private static final SubLSymbol $sym240$SUBCONSTIT_START;
  private static final SubLSymbol $sym241$_CSETF_SUBCONSTIT_START;
  private static final SubLSymbol $sym242$SUBCONSTIT_END;
  private static final SubLSymbol $sym243$_CSETF_SUBCONSTIT_END;
  private static final SubLSymbol $sym244$SUBCONSTIT_SEM_TEST;
  private static final SubLSymbol $sym245$_CSETF_SUBCONSTIT_SEM_TEST;
  private static final SubLSymbol $kw246$CAT;
  private static final SubLSymbol $kw247$STRING;
  private static final SubLSymbol $kw248$BINDING_VAR;
  private static final SubLSymbol $sym249$MAKE_SUBCONSTIT;
  private static final SubLSymbol $sym250$VISIT_DEFSTRUCT_OBJECT_SUBCONSTIT_METHOD;
  private static final SubLString $str251$__Subconst__S_of_cat__S_;
  private static final SubLList $list252;
  private static final SubLObject $const253$StringTemplate;
  private static final SubLObject $const254$TheList;
  private static final SubLObject $const255$TheResultOfParsing;
  private static final SubLSymbol $kw256$RESET;

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 987L)
  public static SubLObject add_template_meta_marker(final SubLObject marker, final SubLObject definition)
  {
    assert NIL != forts.fort_p( marker ) : marker;
    assert NIL != Types.stringp( definition ) : definition;
    dictionary.dictionary_enter( $template_meta_marker_mappings$.getGlobalValue(), marker, definition );
    return marker;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 1201L)
  public static SubLObject map_template_meta_marker(final SubLObject marker)
  {
    return dictionary.dictionary_lookup( $template_meta_marker_mappings$.getGlobalValue(), marker, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 1408L)
  public static SubLObject interpret_template_meta_marker_assertion(final SubLObject assertion)
  {
    final SubLObject predicate = assertions_high.gaf_arg0( assertion );
    final SubLObject mt = assertions_high.assertion_mt( assertion );
    if( NIL != genl_predicates.genl_predP( predicate, $template_meta_marker_predicate$.getGlobalValue(), mt, UNPROVIDED ) )
    {
      final SubLObject marker = assertions_high.gaf_arg1( assertion );
      final SubLObject definition = assertions_high.gaf_arg2( assertion );
      add_template_meta_marker( marker, definition );
    }
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 1800L)
  public static SubLObject populate_meta_markers_from_mt(final SubLObject mt, SubLObject extend)
  {
    if( extend == UNPROVIDED )
    {
      extend = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == extend )
    {
      dictionary.clear_dictionary( $template_meta_marker_mappings$.getGlobalValue() );
    }
    final SubLObject predicate = $template_meta_marker_predicate$.getGlobalValue();
    final SubLObject stop = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym4$RELEVANT_MT_IS_EQ, thread );
      mt_relevance_macros.$mt$.bind( mt, thread );
      final SubLObject pred_var = predicate;
      if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
      {
        final SubLObject str = NIL;
        final SubLObject _prev_bind_0_$1 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_1_$2 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
        final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
        try
        {
          utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
          utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$is_noting_progressP$.bind( T, thread );
          utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
          utilities_macros.noting_progress_preamble( str );
          final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
          SubLObject done_var = stop;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              utilities_macros.note_progress();
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw5$GAF, NIL, NIL );
                SubLObject done_var_$3 = stop;
                final SubLObject token_var_$4 = NIL;
                while ( NIL == done_var_$3)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$4 );
                  final SubLObject valid_$5 = makeBoolean( !token_var_$4.eql( assertion ) );
                  if( NIL != valid_$5 )
                  {
                    interpret_template_meta_marker_assertion( assertion );
                  }
                  done_var_$3 = makeBoolean( NIL == valid_$5 || NIL != stop );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid || NIL != stop );
          }
          utilities_macros.noting_progress_postamble();
        }
        finally
        {
          utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
          utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
          utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
          utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
          utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$2, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$1, thread );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return mt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 2204L)
  public static SubLObject transform_meta_markers_in_template_expression(SubLObject template)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( $template_meta_marker_mappings$.getGlobalValue() ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject marker = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject definition = thread.secondMultipleValue();
      thread.resetMultipleValues();
      template = conses_high.nsubst( definition, marker, template, UNPROVIDED, UNPROVIDED );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return template;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 2654L)
  public static SubLObject map_template_category_fill_words(final SubLObject category)
  {
    return dictionary.dictionary_lookup( $template_category_fill_words$.getGlobalValue(), category, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 2784L)
  public static SubLObject add_template_category_fill_word(final SubLObject category, final SubLObject word)
  {
    SubLObject words = map_template_category_fill_words( category );
    if( NIL == conses_high.member( word, words, Symbols.symbol_function( EQUALP ), Symbols.symbol_function( IDENTITY ) ) )
    {
      words = ConsesLow.cons( word, words );
    }
    dictionary.dictionary_enter( $template_category_fill_words$.getGlobalValue(), category, words );
    return category;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 3124L)
  public static SubLObject interpret_template_category_fill_word_assertion(final SubLObject assertion)
  {
    final SubLObject predicate = assertions_high.gaf_arg0( assertion );
    final SubLObject mt = assertions_high.assertion_mt( assertion );
    if( NIL != genl_predicates.genl_predP( predicate, $template_category_fill_word_predicate$.getGlobalValue(), mt, UNPROVIDED ) )
    {
      final SubLObject category = assertions_high.gaf_arg1( assertion );
      final SubLObject word = assertions_high.gaf_arg2( assertion );
      add_template_category_fill_word( category, word );
    }
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 3525L)
  public static SubLObject populate_template_category_fill_words_from_mt(final SubLObject mt, SubLObject extend)
  {
    if( extend == UNPROVIDED )
    {
      extend = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == extend )
    {
      dictionary.clear_dictionary( $template_category_fill_words$.getGlobalValue() );
    }
    final SubLObject predicate = $template_category_fill_word_predicate$.getGlobalValue();
    final SubLObject stop = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym4$RELEVANT_MT_IS_EQ, thread );
      mt_relevance_macros.$mt$.bind( mt, thread );
      final SubLObject pred_var = predicate;
      if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
      {
        final SubLObject str = NIL;
        final SubLObject _prev_bind_0_$7 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_1_$8 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
        final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
        try
        {
          utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
          utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$is_noting_progressP$.bind( T, thread );
          utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
          utilities_macros.noting_progress_preamble( str );
          final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
          SubLObject done_var = stop;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              utilities_macros.note_progress();
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw5$GAF, NIL, NIL );
                SubLObject done_var_$9 = stop;
                final SubLObject token_var_$10 = NIL;
                while ( NIL == done_var_$9)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$10 );
                  final SubLObject valid_$11 = makeBoolean( !token_var_$10.eql( assertion ) );
                  if( NIL != valid_$11 )
                  {
                    interpret_template_category_fill_word_assertion( assertion );
                  }
                  done_var_$9 = makeBoolean( NIL == valid_$11 || NIL != stop );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$8, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid || NIL != stop );
          }
          utilities_macros.noting_progress_postamble();
        }
        finally
        {
          utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
          utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
          utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
          utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
          utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$8, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$7, thread );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return mt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 3957L)
  public static SubLObject clear_make_optional_word_list()
  {
    final SubLObject cs = $make_optional_word_list_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 3957L)
  public static SubLObject remove_make_optional_word_list(final SubLObject words)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $make_optional_word_list_caching_state$.getGlobalValue(), ConsesLow.list( words ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 3957L)
  public static SubLObject make_optional_word_list_internal(final SubLObject words)
  {
    return ConsesLow.cons( $const9$OptionalSome, words );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 3957L)
  public static SubLObject make_optional_word_list(final SubLObject words)
  {
    SubLObject caching_state = $make_optional_word_list_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym8$MAKE_OPTIONAL_WORD_LIST, $sym10$_MAKE_OPTIONAL_WORD_LIST_CACHING_STATE_, $int11$64, EQUALP, ONE_INTEGER, TEN_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, words, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( make_optional_word_list_internal( words ) ) );
      memoization_state.caching_state_put( caching_state, words, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 4085L)
  public static SubLObject add_category_fill_words_to_template(final SubLObject template, final SubLObject category)
  {
    final SubLObject words = map_template_category_fill_words( category );
    SubLObject expanded = template;
    SubLObject components = NIL;
    if( NIL != words )
    {
      final SubLObject v_default = make_optional_word_list( words );
      SubLObject adjusted_list = NIL;
      SubLObject cdolist_list_var = expanded;
      SubLObject item = NIL;
      item = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != rtp_type_checkers.rtp_rule_terminalP( item ) && NIL != subl_promotions.memberP( item, words, Symbols.symbol_function( EQUALP ), UNPROVIDED ) )
        {
          final SubLObject adjusted = Sequences.delete( item, words, Symbols.symbol_function( EQUALP ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          adjusted_list = make_optional_word_list( adjusted );
        }
        else if( NIL != rtp_type_checkers.rtp_require_one_itemP( item ) || NIL != rtp_type_checkers.rtp_require_some_itemP( item ) )
        {
          final SubLObject required = extract_terminals_from_template( item );
          adjusted_list = NIL;
          SubLObject cdolist_list_var_$13 = words;
          SubLObject optional = NIL;
          optional = cdolist_list_var_$13.first();
          while ( NIL != cdolist_list_var_$13)
          {
            if( NIL == subl_promotions.memberP( optional, required, Symbols.symbol_function( EQUALP ), UNPROVIDED ) )
            {
              adjusted_list = ConsesLow.cons( optional, adjusted_list );
            }
            cdolist_list_var_$13 = cdolist_list_var_$13.rest();
            optional = cdolist_list_var_$13.first();
          }
          adjusted_list = make_optional_word_list( adjusted_list );
        }
        else
        {
          adjusted_list = v_default;
        }
        components = ConsesLow.cons( adjusted_list, components );
        components = ConsesLow.cons( item, components );
        cdolist_list_var = cdolist_list_var.rest();
        item = cdolist_list_var.first();
      }
      components = ConsesLow.cons( adjusted_list, components );
      expanded = Sequences.nreverse( components );
    }
    return expanded;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 5594L)
  public static SubLObject template_rule_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_template_rule( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 5594L)
  public static SubLObject template_rule_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $template_rule_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 5594L)
  public static SubLObject template_rule_category(final SubLObject v_object)
  {
    assert NIL != template_rule_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 5594L)
  public static SubLObject template_rule_template(final SubLObject v_object)
  {
    assert NIL != template_rule_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 5594L)
  public static SubLObject template_rule_transformation(final SubLObject v_object)
  {
    assert NIL != template_rule_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 5594L)
  public static SubLObject template_rule_sem_test(final SubLObject v_object)
  {
    assert NIL != template_rule_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 5594L)
  public static SubLObject template_rule_assertion(final SubLObject v_object)
  {
    assert NIL != template_rule_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 5594L)
  public static SubLObject template_rule_terminals(final SubLObject v_object)
  {
    assert NIL != template_rule_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 5594L)
  public static SubLObject template_rule_meaning(final SubLObject v_object)
  {
    assert NIL != template_rule_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 5594L)
  public static SubLObject template_rule_constraints(final SubLObject v_object)
  {
    assert NIL != template_rule_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 5594L)
  public static SubLObject template_rule_id(final SubLObject v_object)
  {
    assert NIL != template_rule_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 5594L)
  public static SubLObject _csetf_template_rule_category(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != template_rule_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 5594L)
  public static SubLObject _csetf_template_rule_template(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != template_rule_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 5594L)
  public static SubLObject _csetf_template_rule_transformation(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != template_rule_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 5594L)
  public static SubLObject _csetf_template_rule_sem_test(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != template_rule_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 5594L)
  public static SubLObject _csetf_template_rule_assertion(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != template_rule_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 5594L)
  public static SubLObject _csetf_template_rule_terminals(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != template_rule_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 5594L)
  public static SubLObject _csetf_template_rule_meaning(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != template_rule_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 5594L)
  public static SubLObject _csetf_template_rule_constraints(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != template_rule_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 5594L)
  public static SubLObject _csetf_template_rule_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != template_rule_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 5594L)
  public static SubLObject make_template_rule(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $template_rule_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw39$CATEGORY ) )
      {
        _csetf_template_rule_category( v_new, current_value );
      }
      else if( pcase_var.eql( $kw40$TEMPLATE ) )
      {
        _csetf_template_rule_template( v_new, current_value );
      }
      else if( pcase_var.eql( $kw41$TRANSFORMATION ) )
      {
        _csetf_template_rule_transformation( v_new, current_value );
      }
      else if( pcase_var.eql( $kw42$SEM_TEST ) )
      {
        _csetf_template_rule_sem_test( v_new, current_value );
      }
      else if( pcase_var.eql( $kw43$ASSERTION ) )
      {
        _csetf_template_rule_assertion( v_new, current_value );
      }
      else if( pcase_var.eql( $kw44$TERMINALS ) )
      {
        _csetf_template_rule_terminals( v_new, current_value );
      }
      else if( pcase_var.eql( $kw45$MEANING ) )
      {
        _csetf_template_rule_meaning( v_new, current_value );
      }
      else if( pcase_var.eql( $kw46$CONSTRAINTS ) )
      {
        _csetf_template_rule_constraints( v_new, current_value );
      }
      else if( pcase_var.eql( $kw47$ID ) )
      {
        _csetf_template_rule_id( v_new, current_value );
      }
      else
      {
        Errors.error( $str48$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 5594L)
  public static SubLObject visit_defstruct_template_rule(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw49$BEGIN, $sym50$MAKE_TEMPLATE_RULE, NINE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw51$SLOT, $kw39$CATEGORY, template_rule_category( obj ) );
    Functions.funcall( visitor_fn, obj, $kw51$SLOT, $kw40$TEMPLATE, template_rule_template( obj ) );
    Functions.funcall( visitor_fn, obj, $kw51$SLOT, $kw41$TRANSFORMATION, template_rule_transformation( obj ) );
    Functions.funcall( visitor_fn, obj, $kw51$SLOT, $kw42$SEM_TEST, template_rule_sem_test( obj ) );
    Functions.funcall( visitor_fn, obj, $kw51$SLOT, $kw43$ASSERTION, template_rule_assertion( obj ) );
    Functions.funcall( visitor_fn, obj, $kw51$SLOT, $kw44$TERMINALS, template_rule_terminals( obj ) );
    Functions.funcall( visitor_fn, obj, $kw51$SLOT, $kw45$MEANING, template_rule_meaning( obj ) );
    Functions.funcall( visitor_fn, obj, $kw51$SLOT, $kw46$CONSTRAINTS, template_rule_constraints( obj ) );
    Functions.funcall( visitor_fn, obj, $kw51$SLOT, $kw47$ID, template_rule_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw52$END, $sym50$MAKE_TEMPLATE_RULE, NINE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 5594L)
  public static SubLObject visit_defstruct_object_template_rule_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_template_rule( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 6560L)
  public static SubLObject rtp_chart_entry_sem_test(final SubLObject entry)
  {
    return template_rule_sem_test( rtp_chart_entry_rule( entry ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 6821L)
  public static SubLObject rtp_chart_entry_sem_testP(final SubLObject entry)
  {
    return list_utilities.sublisp_boolean( template_rule_sem_test( rtp_chart_entry_rule( entry ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 7220L)
  public static SubLObject sxhash_template_rule_method(final SubLObject v_object)
  {
    if( NIL != $use_better_template_rule_sxhashP$.getGlobalValue() )
    {
      return template_rule_id( v_object );
    }
    return Sxhash.sxhash( Numbers.add( Sxhash.sxhash( template_rule_category( v_object ) ), Numbers.multiply( Sxhash.sxhash( template_rule_template( v_object ) ), $template_rule_sxhashing_prime_a$.getGlobalValue() ),
        Numbers.multiply( Sxhash.sxhash( template_rule_assertion( v_object ) ), $template_rule_sxhashing_prime_b$.getGlobalValue() ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 7615L)
  public static SubLObject print_template_rule(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str56$__A_for__S____from_Assertion__S__, new SubLObject[] { template_rule_category( v_object ), template_rule_meaning( v_object ), template_rule_assertion( v_object ),
      template_rule_transformation( v_object )
    } );
    if( NIL != template_rule_sem_test( v_object ) )
    {
      PrintLow.format( stream, $str57$___Subject_to_test__S, template_rule_sem_test( v_object ) );
    }
    if( NIL == $print_rule_abbreviated$.getGlobalValue() )
    {
      PrintLow.format( stream, $str58$___Augmented_Template___S, template_rule_template( v_object ) );
      PrintLow.format( stream, $str59$___Term___S____Const___S, template_rule_terminals( v_object ), template_rule_constraints( v_object ) );
    }
    PrintLow.format( stream, $str60$___ );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 8587L)
  public static SubLObject new_template_rule(final SubLObject category, final SubLObject template, final SubLObject xform, SubLObject sem_test, SubLObject assertion, SubLObject meaning)
  {
    if( sem_test == UNPROVIDED )
    {
      sem_test = NIL;
    }
    if( assertion == UNPROVIDED )
    {
      assertion = $template_rule_default_assertion$.getDynamicValue();
    }
    if( meaning == UNPROVIDED )
    {
      meaning = $template_rule_default_meaning$.getDynamicValue();
    }
    final SubLObject tp_rule = make_template_rule( UNPROVIDED );
    _csetf_template_rule_category( tp_rule, category );
    _csetf_template_rule_transformation( tp_rule, xform );
    _csetf_template_rule_sem_test( tp_rule, sem_test );
    _csetf_template_rule_meaning( tp_rule, meaning );
    _csetf_template_rule_assertion( tp_rule, assertion );
    final SubLObject compiled_template = compile_template_expression( template, category );
    _csetf_template_rule_template( tp_rule, compiled_template );
    _csetf_template_rule_terminals( tp_rule, extract_terminals_from_template( compiled_template ) );
    _csetf_template_rule_constraints( tp_rule, extract_constraints_from_template( compiled_template ) );
    _csetf_template_rule_id( tp_rule, integer_sequence_generator.integer_sequence_generator_next( $template_rule_isg$.getGlobalValue() ) );
    return tp_rule;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 9822L)
  public static SubLObject cfasl_output_object_template_rule_method(final SubLObject v_object, final SubLObject stream)
  {
    return cfasl_output_template_rule( v_object, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 9942L)
  public static SubLObject cfasl_output_template_rule(final SubLObject template_rule, final SubLObject stream)
  {
    cfasl.cfasl_raw_write_byte( $cfasl_opcode_template_rule$.getGlobalValue(), stream );
    cfasl.cfasl_output( template_rule_category( template_rule ), stream );
    cfasl.cfasl_output( template_rule_template( template_rule ), stream );
    cfasl.cfasl_output( template_rule_transformation( template_rule ), stream );
    cfasl.cfasl_output( template_rule_sem_test( template_rule ), stream );
    cfasl.cfasl_output( template_rule_assertion( template_rule ), stream );
    cfasl.cfasl_output( template_rule_terminals( template_rule ), stream );
    cfasl.cfasl_output( template_rule_meaning( template_rule ), stream );
    cfasl.cfasl_output( template_rule_constraints( template_rule ), stream );
    cfasl.cfasl_output( template_rule_id( template_rule ), stream );
    return template_rule;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 10664L)
  public static SubLObject cfasl_input_template_rule(final SubLObject stream)
  {
    final SubLObject template_rule = make_template_rule( UNPROVIDED );
    _csetf_template_rule_category( template_rule, cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    _csetf_template_rule_template( template_rule, cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    _csetf_template_rule_transformation( template_rule, cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    _csetf_template_rule_sem_test( template_rule, cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    _csetf_template_rule_assertion( template_rule, cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    _csetf_template_rule_terminals( template_rule, cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    _csetf_template_rule_meaning( template_rule, cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    _csetf_template_rule_constraints( template_rule, cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    _csetf_template_rule_id( template_rule, cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    return template_rule;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 11531L)
  public static SubLObject template_span_item_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_template_span_item( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 11531L)
  public static SubLObject template_span_item_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $template_span_item_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 11531L)
  public static SubLObject template_span_item_template_item(final SubLObject v_object)
  {
    assert NIL != template_span_item_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 11531L)
  public static SubLObject template_span_item_start(final SubLObject v_object)
  {
    assert NIL != template_span_item_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 11531L)
  public static SubLObject template_span_item_end(final SubLObject v_object)
  {
    assert NIL != template_span_item_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 11531L)
  public static SubLObject _csetf_template_span_item_template_item(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != template_span_item_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 11531L)
  public static SubLObject _csetf_template_span_item_start(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != template_span_item_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 11531L)
  public static SubLObject _csetf_template_span_item_end(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != template_span_item_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 11531L)
  public static SubLObject make_template_span_item(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $template_span_item_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw81$TEMPLATE_ITEM ) )
      {
        _csetf_template_span_item_template_item( v_new, current_value );
      }
      else if( pcase_var.eql( $kw82$START ) )
      {
        _csetf_template_span_item_start( v_new, current_value );
      }
      else if( pcase_var.eql( $kw52$END ) )
      {
        _csetf_template_span_item_end( v_new, current_value );
      }
      else
      {
        Errors.error( $str48$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 11531L)
  public static SubLObject visit_defstruct_template_span_item(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw49$BEGIN, $sym83$MAKE_TEMPLATE_SPAN_ITEM, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw51$SLOT, $kw81$TEMPLATE_ITEM, template_span_item_template_item( obj ) );
    Functions.funcall( visitor_fn, obj, $kw51$SLOT, $kw82$START, template_span_item_start( obj ) );
    Functions.funcall( visitor_fn, obj, $kw51$SLOT, $kw52$END, template_span_item_end( obj ) );
    Functions.funcall( visitor_fn, obj, $kw52$END, $sym83$MAKE_TEMPLATE_SPAN_ITEM, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 11531L)
  public static SubLObject visit_defstruct_object_template_span_item_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_template_span_item( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 11639L)
  public static SubLObject new_template_span_item(final SubLObject template_item, final SubLObject start, final SubLObject end)
  {
    final SubLObject item = make_template_span_item( UNPROVIDED );
    _csetf_template_span_item_template_item( item, template_item );
    _csetf_template_span_item_start( item, start );
    _csetf_template_span_item_end( item, end );
    return item;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 11929L)
  public static SubLObject print_template_span_item(final SubLObject item, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str85$__S__S__S_, new SubLObject[] { template_span_item_template_item( item ), template_span_item_start( item ), template_span_item_end( item )
    } );
    return item;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 12229L)
  public static SubLObject extract_constraints_from_template(final SubLObject template)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    final SubLObject _prev_bind_0 = $template_terminal_style$.currentBinding( thread );
    try
    {
      $template_terminal_style$.bind( $kw46$CONSTRAINTS, thread );
      v_answer = extract_terminals_from_template( template );
    }
    finally
    {
      $template_terminal_style$.rebind( _prev_bind_0, thread );
    }
    return optimize_template_constraints( v_answer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 12491L)
  public static SubLObject optimize_template_constraints(final SubLObject constraints)
  {
    SubLObject optimized = NIL;
    SubLObject cdolist_list_var = constraints;
    SubLObject constraint = NIL;
    constraint = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( constraint.isCons() && constraint.first().eql( $const87$RequireOne ) )
      {
        final SubLObject flattened = ensure_flattened_constraint( constraint.rest() );
        if( NIL != flattened )
        {
          optimized = ConsesLow.cons( ConsesLow.cons( $const87$RequireOne, flattened ), optimized );
        }
      }
      else
      {
        optimized = ConsesLow.cons( constraint, optimized );
      }
      cdolist_list_var = cdolist_list_var.rest();
      constraint = cdolist_list_var.first();
    }
    return optimized;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 13063L)
  public static SubLObject ensure_flattened_constraint(final SubLObject constraint)
  {
    SubLObject flatten = NIL;
    SubLObject cdolist_list_var = constraint;
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( item.isCons() && item.first().eql( $const87$RequireOne ) )
      {
        flatten = Sequences.cconcatenate( ensure_flattened_constraint( item.rest() ), flatten );
      }
      else
      {
        flatten = ConsesLow.cons( item, flatten );
      }
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    return flatten;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 13410L)
  public static SubLObject compile_template_expression(final SubLObject template, final SubLObject category)
  {
    SubLObject compiled = conses_high.copy_list( template );
    ensure_non_recursive_template( compiled, category );
    compiled = replace_constants_with_denotations( compiled );
    compiled = expand_word_sequences( compiled );
    compiled = expand_word_items( compiled );
    compiled = transform_meta_markers_in_template_expression( compiled );
    compiled = add_category_fill_words_to_template( compiled, category );
    return optimize_template_expression( compiled );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 14113L)
  public static SubLObject expand_word_items(final SubLObject template)
  {
    return Mapping.mapcar( $sym88$EXPAND_WORD_ITEMS_IN_LIST, template );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 14215L)
  public static SubLObject expand_word_sequences(final SubLObject template)
  {
    if( NIL != rtp_type_checkers.rtp_word_sequence_itemP( template ) )
    {
      return possibly_expand_word_sequence_item( template );
    }
    if( NIL != rtp_type_checkers.rtp_optional_some_itemP( template ) || NIL != rtp_type_checkers.rtp_require_some_itemP( template ) )
    {
      return template;
    }
    if( template.isString() )
    {
      return possibly_expand_string_item( template );
    }
    if( template.isAtom() )
    {
      return template;
    }
    return ConsesLow.cons( expand_word_sequences( template.first() ), expand_word_sequences( template.rest() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 14903L)
  public static SubLObject possibly_expand_string_item(final SubLObject template_item)
  {
    if( NIL == string_utilities.substringP( $str89$_, template_item, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return template_item;
    }
    return ConsesLow.cons( $const90$WordSequence, rkf_concept_harvester.rkf_ch_string_tokenize( template_item ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 15237L)
  public static SubLObject possibly_expand_word_sequence_item(final SubLObject template)
  {
    SubLObject new_template = NIL;
    SubLObject cdolist_list_var = template;
    SubLObject x = NIL;
    x = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( x.isString() && NIL != string_utilities.substringP( $str89$_, x, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        SubLObject cdolist_list_var_$14 = rkf_concept_harvester.rkf_ch_string_tokenize( x );
        SubLObject token = NIL;
        token = cdolist_list_var_$14.first();
        while ( NIL != cdolist_list_var_$14)
        {
          new_template = ConsesLow.cons( token, new_template );
          cdolist_list_var_$14 = cdolist_list_var_$14.rest();
          token = cdolist_list_var_$14.first();
        }
      }
      else
      {
        new_template = ConsesLow.cons( x, new_template );
      }
      cdolist_list_var = cdolist_list_var.rest();
      x = cdolist_list_var.first();
    }
    return Sequences.nreverse( new_template );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 15784L)
  public static SubLObject ensure_non_recursive_template(final SubLObject template, final SubLObject category)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject counter = ZERO_INTEGER;
    SubLObject required = NIL;
    SubLObject recursion = NIL;
    SubLObject cdolist_list_var = template;
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      counter = Numbers.add( counter, ONE_INTEGER );
      if( NIL != rtp_type_checkers.rtp_require_some_itemP( item ) || NIL != rtp_type_checkers.rtp_require_one_itemP( item ) || NIL != rtp_type_checkers.rtp_rule_terminalP( item ) || NIL != forts.fort_p( item ) )
      {
        if( NIL == required )
        {
          required = counter;
        }
      }
      else if( NIL == rtp_type_checkers.rtp_optional_some_itemP( item ) && NIL == rtp_type_checkers.rtp_optional_one_itemP( item ) && item.isList() && !item.first().eql( category ) )
      {
        if( NIL == required )
        {
          required = counter;
        }
      }
      else if( item.isList() && item.first().eql( category ) && NIL == recursion )
      {
        recursion = counter;
      }
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    if( recursion.isNumber() && !required.isNumber() )
    {
      if( NIL != $block_left_recursive_templates$.getDynamicValue( thread ) )
      {
        Dynamic.sublisp_throw( $kw91$RECURSIVE_TEMPLATE, ConsesLow.cons( template, category ) );
      }
      else
      {
        Errors.warn( $str92$Left_recursive_template___S__, template );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 16802L)
  public static SubLObject clear_denotations_of_constant()
  {
    final SubLObject cs = $denotations_of_constant_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 16802L)
  public static SubLObject remove_denotations_of_constant(final SubLObject constant, SubLObject term_phrases_constraint)
  {
    if( term_phrases_constraint == UNPROVIDED )
    {
      term_phrases_constraint = NIL;
    }
    return memoization_state.caching_state_remove_function_results_with_args( $denotations_of_constant_caching_state$.getGlobalValue(), ConsesLow.list( constant, term_phrases_constraint ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 16802L)
  public static SubLObject denotations_of_constant_internal(final SubLObject constant, final SubLObject term_phrases_constraint)
  {
    final SubLObject preds = rtp_preds_from_term_phrases_constraint( term_phrases_constraint );
    final SubLObject the_filter = all_phrases_filter_from_term_phrases_constraint( term_phrases_constraint );
    return pph_methods_lexicon.all_phrases_for_term( constant, preds, $list94, $kw95$TEXT, the_filter, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 16802L)
  public static SubLObject denotations_of_constant(final SubLObject constant, SubLObject term_phrases_constraint)
  {
    if( term_phrases_constraint == UNPROVIDED )
    {
      term_phrases_constraint = NIL;
    }
    SubLObject caching_state = $denotations_of_constant_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym93$DENOTATIONS_OF_CONSTANT, $sym96$_DENOTATIONS_OF_CONSTANT_CACHING_STATE_, $int97$1024, EQUAL, TWO_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( constant, term_phrases_constraint );
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
        if( constant.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && term_phrases_constraint.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( denotations_of_constant_internal( constant, term_phrases_constraint ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( constant, term_phrases_constraint ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 17318L)
  public static SubLObject rtp_preds_from_term_phrases_constraint(final SubLObject term_phrases_constraint)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != lexicon_accessors.speech_partP( term_phrases_constraint, UNPROVIDED ) )
    {
      return lexicon_accessors.all_preds_of_pos( term_phrases_constraint );
    }
    if( NIL != fort_types_interface.predicate_p( term_phrases_constraint ) )
    {
      return ConsesLow.cons( term_phrases_constraint, genl_predicates.spec_predicates( term_phrases_constraint, rtp_vars.$rtp_syntactic_mt$.getDynamicValue( thread ), UNPROVIDED ) );
    }
    return $kw98$ALL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 17815L)
  public static SubLObject clear_all_phrases_filter_from_term_phrases_constraint()
  {
    final SubLObject cs = $all_phrases_filter_from_term_phrases_constraint_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 17815L)
  public static SubLObject remove_all_phrases_filter_from_term_phrases_constraint(final SubLObject term_phrases_constraint)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $all_phrases_filter_from_term_phrases_constraint_caching_state$.getGlobalValue(), ConsesLow.list( term_phrases_constraint ), UNPROVIDED,
        UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 17815L)
  public static SubLObject all_phrases_filter_from_term_phrases_constraint_internal(final SubLObject term_phrases_constraint)
  {
    return ( NIL != lexicon_accessors.speech_partP( term_phrases_constraint, UNPROVIDED ) || NIL != isa.isa_in_any_mtP( term_phrases_constraint, $const100$CollectionLexificationPredicate_R ) ) ? term_phrases_constraint
        : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 17815L)
  public static SubLObject all_phrases_filter_from_term_phrases_constraint(final SubLObject term_phrases_constraint)
  {
    SubLObject caching_state = $all_phrases_filter_from_term_phrases_constraint_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym99$ALL_PHRASES_FILTER_FROM_TERM_PHRASES_CONSTRAINT, $sym101$_ALL_PHRASES_FILTER_FROM_TERM_PHRASES_CONSTRAINT_CACHING_STATE_, $int102$200,
          EQL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, term_phrases_constraint, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( all_phrases_filter_from_term_phrases_constraint_internal( term_phrases_constraint ) ) );
      memoization_state.caching_state_put( caching_state, term_phrases_constraint, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 18128L)
  public static SubLObject replace_constants_with_denotations(final SubLObject template)
  {
    if( template.isAtom() )
    {
      return template;
    }
    if( NIL != rtp_type_checkers.rtp_cyc_term_item( template.first() ) )
    {
      return ConsesLow.cons( transform_cyc_term_item( template.first() ), replace_constants_with_denotations( template.rest() ) );
    }
    return ConsesLow.cons( replace_constants_with_denotations( template.first() ), replace_constants_with_denotations( template.rest() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 18621L)
  public static SubLObject transform_cyc_term_item(final SubLObject item)
  {
    return ConsesLow.cons( $const87$RequireOne, denotations_of_constant( conses_high.second( item ), conses_high.third( item ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 18869L)
  public static SubLObject optimize_template_expression(final SubLObject template)
  {
    SubLObject optimized = NIL;
    SubLObject prev = NIL;
    SubLObject cdolist_list_var = template;
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != rtp_type_checkers.rtp_optional_some_itemP( item ) )
      {
        if( NIL == prev )
        {
          prev = item;
        }
        else
        {
          prev = Sequences.cconcatenate( prev, item.rest() );
          prev = Sequences.remove_duplicates( prev, Symbols.symbol_function( EQUALP ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
      }
      else
      {
        if( NIL != prev )
        {
          optimized = ConsesLow.cons( prev, optimized );
          prev = NIL;
        }
        optimized = ConsesLow.cons( item, optimized );
      }
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    if( NIL != prev )
    {
      optimized = ConsesLow.cons( prev, optimized );
    }
    return Sequences.nreverse( optimized );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 19608L)
  public static SubLObject extract_terminals_from_template(final SubLObject template)
  {
    SubLObject v_answer = NIL;
    SubLObject cdolist_list_var = template;
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( item.isCons() )
      {
        v_answer = Sequences.nreverse( check_for_terminals_in_subtemplate( item, v_answer ) );
      }
      else if( NIL != rtp_type_checkers.rtp_rule_terminalP( item ) )
      {
        v_answer = ConsesLow.cons( item, v_answer );
      }
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 19924L)
  public static SubLObject check_for_terminals_in_subtemplate(final SubLObject subtemplate, SubLObject accumulator)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != rtp_type_checkers.rtp_require_one_itemP( subtemplate ) || NIL != rtp_type_checkers.rtp_require_some_itemP( subtemplate ) )
    {
      final SubLObject others = extract_terminals_from_template( subtemplate.rest() );
      final SubLObject pcase_var = $template_terminal_style$.getDynamicValue( thread );
      if( pcase_var.eql( $kw86$STANDARD ) )
      {
        SubLObject cdolist_list_var = others;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          accumulator = ConsesLow.cons( item, accumulator );
          cdolist_list_var = cdolist_list_var.rest();
          item = cdolist_list_var.first();
        }
      }
      else if( pcase_var.eql( $kw46$CONSTRAINTS ) )
      {
        final SubLObject items = Sequences.cconcatenate( $list103, others );
        accumulator = ConsesLow.cons( items, accumulator );
      }
    }
    else if( NIL != rtp_type_checkers.rtp_word_itemP( subtemplate ) )
    {
      SubLObject words = NIL;
      words = compute_strings_of_type( subtemplate );
      final SubLObject pcase_var = $template_terminal_style$.getDynamicValue( thread );
      if( pcase_var.eql( $kw86$STANDARD ) )
      {
        SubLObject cdolist_list_var = words;
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( word.isString() )
          {
            SubLObject cdolist_list_var_$15 = rkf_concept_harvester.rkf_ch_string_tokenize( word );
            SubLObject subword = NIL;
            subword = cdolist_list_var_$15.first();
            while ( NIL != cdolist_list_var_$15)
            {
              accumulator = ConsesLow.cons( subword, accumulator );
              cdolist_list_var_$15 = cdolist_list_var_$15.rest();
              subword = cdolist_list_var_$15.first();
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          word = cdolist_list_var.first();
        }
      }
      else if( pcase_var.eql( $kw46$CONSTRAINTS ) )
      {
        final SubLObject items = Sequences.cconcatenate( $list103, words );
        accumulator = ConsesLow.cons( items, accumulator );
      }
    }
    else if( NIL != rtp_type_checkers.rtp_grouped_itemP( subtemplate ) )
    {
      final SubLObject others = extract_terminals_from_template( subtemplate.rest() );
      final SubLObject pcase_var = $template_terminal_style$.getDynamicValue( thread );
      if( pcase_var.eql( $kw86$STANDARD ) )
      {
        SubLObject cdolist_list_var = others;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          accumulator = ConsesLow.cons( item, accumulator );
          cdolist_list_var = cdolist_list_var.rest();
          item = cdolist_list_var.first();
        }
      }
      else if( pcase_var.eql( $kw46$CONSTRAINTS ) )
      {
        final SubLObject items = Sequences.cconcatenate( $list104, Sequences.nreverse( others ) );
        accumulator = ConsesLow.cons( items, accumulator );
      }
    }
    return Sequences.nreverse( accumulator );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 21413L)
  public static SubLObject compute_strings_of_type(final SubLObject subtemplate)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject stem = rtp_type_checkers.rtp_word_item_word( subtemplate );
    final SubLObject modification = rtp_type_checkers.rtp_word_item_syntactic_constraint( subtemplate );
    SubLObject result = possible_contractions_for_subtemplate( subtemplate );
    if( NIL != rtp_type_checkers.rtp_word_pos_itemP( subtemplate ) )
    {
      result = Sequences.cconcatenate( lexicon_accessors.get_strings_of_type_cached( stem, modification, $kw98$ALL, NIL, rtp_vars.$rtp_syntactic_mt$.getDynamicValue( thread ) ), result );
    }
    if( NIL != rtp_type_checkers.rtp_word_pos_pred_itemP( subtemplate ) )
    {
      result = Sequences.cconcatenate( lexicon_cache.strings_of_wordXpred( stem, modification, rtp_vars.$rtp_syntactic_mt$.getDynamicValue( thread ) ), result );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 22137L)
  public static SubLObject possible_contractions_for_subtemplate(final SubLObject subtemplate)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    maybe_initialize_rtp_contractions_table( UNPROVIDED );
    final SubLObject word = rtp_type_checkers.rtp_word_item_word( subtemplate );
    return list_utilities.alist_lookup( $rtp_contractions_table$.getDynamicValue( thread ), word, UNPROVIDED, UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 22366L)
  public static SubLObject maybe_initialize_rtp_contractions_table(SubLObject force_reinitalize)
  {
    if( force_reinitalize == UNPROVIDED )
    {
      force_reinitalize = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( ( NIL != force_reinitalize || NIL == $rtp_contractions_table$.getDynamicValue( thread ) ) && NIL != constant_handles.valid_constant( $const105$contractedFormOfWord, UNPROVIDED ) )
    {
      SubLObject cdolist_list_var = $list112;
      SubLObject word_type = NIL;
      word_type = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cdolist_list_var_$16 = ask_utilities.query_variable( $sym110$_WORD, ConsesLow.list( $const111$posForms, $sym110$_WORD, word_type ), rtp_vars.$rtp_syntactic_mt$.getDynamicValue( thread ), UNPROVIDED );
        SubLObject word = NIL;
        word = cdolist_list_var_$16.first();
        while ( NIL != cdolist_list_var_$16)
        {
          final SubLObject uncontracted_word = ask_utilities.query_variable( $sym106$_FULL_WORD, ConsesLow.list( $const105$contractedFormOfWord, $sym106$_FULL_WORD, word ), rtp_vars.$rtp_syntactic_mt$.getDynamicValue(
              thread ), UNPROVIDED ).first();
          SubLObject word_forms = NIL;
          SubLObject cdolist_list_var_$17 = ask_utilities.query_variable( $sym107$_FORM, ConsesLow.listS( $const108$partOfSpeech, word, word_type, $list109 ), rtp_vars.$rtp_syntactic_mt$.getDynamicValue( thread ),
              UNPROVIDED );
          SubLObject form = NIL;
          form = cdolist_list_var_$17.first();
          while ( NIL != cdolist_list_var_$17)
          {
            word_forms = ConsesLow.cons( ConsesLow.cons( $const90$WordSequence, rkf_concept_harvester.rkf_ch_string_tokenize( form ) ), word_forms );
            cdolist_list_var_$17 = cdolist_list_var_$17.rest();
            form = cdolist_list_var_$17.first();
          }
          $rtp_contractions_table$.setDynamicValue( ConsesLow.cons( ConsesLow.list( uncontracted_word, word_forms ), $rtp_contractions_table$.getDynamicValue( thread ) ), thread );
          cdolist_list_var_$16 = cdolist_list_var_$16.rest();
          word = cdolist_list_var_$16.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        word_type = cdolist_list_var.first();
      }
    }
    return $rtp_contractions_table$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 23179L)
  public static SubLObject template_rule_constraints_matchP(final SubLObject tp_rule, final SubLObject words)
  {
    return verify_words_meet_constraints( template_rule_constraints( tp_rule ), words );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 25174L)
  public static SubLObject verify_words_meet_constraints(final SubLObject constraints, final SubLObject words)
  {
    SubLObject cdolist_list_var = constraints;
    SubLObject constraint = NIL;
    constraint = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != rtp_type_checkers.rtp_rule_terminalP( constraint ) )
      {
        if( NIL == subl_promotions.memberP( constraint, words, Symbols.symbol_function( $sym113$STRING_EQUAL ), UNPROVIDED ) )
        {
          return NIL;
        }
      }
      else if( NIL != rtp_type_checkers.rtp_require_some_itemP( constraint ) || NIL != rtp_type_checkers.rtp_require_one_itemP( constraint ) )
      {
        final SubLObject one_of = constraint.rest();
        SubLObject found = NIL;
        SubLObject cdolist_list_var_$18 = one_of;
        SubLObject item = NIL;
        item = cdolist_list_var_$18.first();
        while ( NIL != cdolist_list_var_$18)
        {
          if( NIL == found )
          {
            found = rtp_member( item, words, Symbols.symbol_function( $sym113$STRING_EQUAL ) );
          }
          cdolist_list_var_$18 = cdolist_list_var_$18.rest();
          item = cdolist_list_var_$18.first();
        }
        if( NIL == found )
        {
          return NIL;
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      constraint = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 25758L)
  public static SubLObject rtp_member(final SubLObject item, final SubLObject word_list, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = rtp_vars.$tp_equal$.getGlobalValue();
    }
    if( NIL != rtp_type_checkers.rtp_rule_terminalP( item ) )
    {
      return conses_high.member( item, word_list, test, UNPROVIDED );
    }
    if( NIL != rtp_type_checkers.rtp_required_itemP( item ) && NIL != match_some_of( item, word_list, test ) )
    {
      return match_some_of( item, word_list, test );
    }
    if( NIL != rtp_type_checkers.rtp_word_sequence_itemP( item ) && NIL != match_sequence( item, word_list, test ) )
    {
      return match_sequence( item, word_list, test );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 26445L)
  public static SubLObject match_some_of(final SubLObject constraint_set, final SubLObject word_list, final SubLObject test)
  {
    SubLObject cdolist_list_var = constraint_set.rest();
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != rtp_member( item, word_list, test ) )
      {
        return rtp_member( item, word_list, test );
      }
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 26968L)
  public static SubLObject match_sequence(SubLObject seq, final SubLObject word_list, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = rtp_vars.$tp_equal$.getGlobalValue();
    }
    if( NIL != rtp_type_checkers.rtp_word_sequence_itemP( seq ) )
    {
      seq = seq.rest();
    }
    SubLObject result = rtp_member( seq.first(), word_list, test );
    SubLObject int_result = NIL;
    while ( NIL != result)
    {
      if( NIL == result )
      {
        return NIL;
      }
      int_result = remove_an_internal_group( seq, result );
      if( NIL != int_result )
      {
        return int_result;
      }
      result = rtp_member( seq.first(), result, test ).rest();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 27701L)
  public static SubLObject remove_an_internal_group(final SubLObject sequence, SubLObject word_list)
  {
    SubLObject cdolist_list_var = sequence;
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != rtp_type_checkers.rtp_rule_terminalP( item ) )
      {
        if( NIL == word_list || NIL == Functions.funcall( rtp_vars.$tp_equal$.getGlobalValue(), item, word_list.first() ) )
        {
          return NIL;
        }
        word_list = word_list.rest();
      }
      else if( NIL != rtp_type_checkers.rtp_require_one_itemP( item ) )
      {
        word_list = recognition.remove_require_one( item, ConsesLow.list( word_list, ZERO_INTEGER, ZERO_INTEGER ), UNPROVIDED ).first().first();
        if( NIL == word_list )
        {
          return NIL;
        }
      }
      else
      {
        if( NIL == rtp_type_checkers.rtp_require_some_itemP( item ) )
        {
          return NIL;
        }
        word_list = recognition.remove_X_words( item, ConsesLow.list( word_list, ZERO_INTEGER, ZERO_INTEGER ), UNPROVIDED ).first().first();
        if( NIL == word_list )
        {
          return NIL;
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    if( NIL == word_list )
    {
      return $kw114$COMPLETE;
    }
    return word_list;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 28852L)
  public static SubLObject rtp_clear_rules()
  {
    if( $rtp_rules$.getGlobalValue().isHashtable() )
    {
      Hashtables.clrhash( $rtp_rules$.getGlobalValue() );
    }
    return $kw117$CLEARED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 28968L)
  public static SubLObject allocate_rtp_rules()
  {
    if( !$rtp_rules$.getGlobalValue().isHashtable() )
    {
      $rtp_rules$.setGlobalValue( Hashtables.make_hash_table( $rtp_rules_initial_size$.getGlobalValue(), Symbols.symbol_function( EQUALP ), UNPROVIDED ) );
    }
    return rtp_clear_rules();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 29148L)
  public static SubLObject ensure_rtp_rules()
  {
    if( !$rtp_rules$.getGlobalValue().isHashtable() )
    {
      $rtp_rules$.setGlobalValue( Hashtables.make_hash_table( $rtp_rules_initial_size$.getGlobalValue(), Symbols.symbol_function( EQUALP ), UNPROVIDED ) );
    }
    return $rtp_rules$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 29321L)
  public static SubLObject add_rtp_rule(final SubLObject tp_rule)
  {
    final SubLObject mt = assertions_high.assertion_mt( template_rule_assertion( tp_rule ) );
    if( $rtp_rules$.getGlobalValue().isHashtable() )
    {
      SubLObject tps_for_mt = Hashtables.gethash( mt, $rtp_rules$.getGlobalValue(), UNPROVIDED );
      if( NIL == tps_for_mt )
      {
        tps_for_mt = Hashtables.make_hash_table( $int118$500, Symbols.symbol_function( EQUALP ), UNPROVIDED );
        Hashtables.sethash( mt, $rtp_rules$.getGlobalValue(), tps_for_mt );
      }
      Hashtables.sethash( tp_rule, tps_for_mt, tp_rule );
      return tp_rule;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 29751L)
  public static SubLObject rtp_rule_existsP(final SubLObject tp_rule)
  {
    final SubLObject mt = assertions_high.assertion_mt( template_rule_assertion( tp_rule ) );
    if( $rtp_rules$.getGlobalValue().isHashtable() )
    {
      final SubLObject tps_for_mt = Hashtables.gethash( mt, $rtp_rules$.getGlobalValue(), UNPROVIDED );
      if( tps_for_mt.isHashtable() )
      {
        return Hashtables.gethash( tp_rule, tps_for_mt, UNPROVIDED );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 30044L)
  public static SubLObject remove_rtp_rule(final SubLObject tp_rule)
  {
    final SubLObject mt = assertions_high.assertion_mt( template_rule_assertion( tp_rule ) );
    if( $rtp_rules$.getGlobalValue().isHashtable() )
    {
      Hashtables.remhash( tp_rule, Hashtables.gethash( mt, $rtp_rules$.getGlobalValue(), UNPROVIDED ) );
    }
    return tp_rule;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 30264L)
  public static SubLObject find_rtp_rules_by_assertion(final SubLObject assertion)
  {
    if( $rtp_rules$.getGlobalValue().isHashtable() )
    {
      SubLObject tp_rules = NIL;
      SubLObject mt = NIL;
      SubLObject tps_for_mt = NIL;
      final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( $rtp_rules$.getGlobalValue() );
      try
      {
        while ( Hashtables.iteratorHasNext( cdohash_iterator ))
        {
          final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
          mt = Hashtables.getEntryKey( cdohash_entry );
          tps_for_mt = Hashtables.getEntryValue( cdohash_entry );
          SubLObject key = NIL;
          SubLObject value = NIL;
          final Iterator cdohash_iterator_$19 = Hashtables.getEntrySetIterator( tps_for_mt );
          try
          {
            while ( Hashtables.iteratorHasNext( cdohash_iterator_$19 ))
            {
              final Map.Entry cdohash_entry_$20 = Hashtables.iteratorNextEntry( cdohash_iterator_$19 );
              key = Hashtables.getEntryKey( cdohash_entry_$20 );
              value = Hashtables.getEntryValue( cdohash_entry_$20 );
              if( assertion.eql( template_rule_assertion( key ) ) )
              {
                tp_rules = ConsesLow.cons( key, tp_rules );
              }
            }
          }
          finally
          {
            Hashtables.releaseEntrySetIterator( cdohash_iterator_$19 );
          }
        }
      }
      finally
      {
        Hashtables.releaseEntrySetIterator( cdohash_iterator );
      }
      return tp_rules;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 30609L)
  public static SubLObject rtp_rules_cache_unbuiltP()
  {
    return makeBoolean( !$rtp_rules$.getGlobalValue().isHashtable() || NIL != hash_table_utilities.hash_table_empty_p( $rtp_rules$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 30910L)
  public static SubLObject dump_rtp_rules_cache_to_stream(final SubLObject stream)
  {
    cfasl.cfasl_output( $rtp_rules$.getGlobalValue(), stream );
    cfasl.cfasl_output( NIL, stream );
    cfasl.cfasl_output( NIL, stream );
    cfasl.cfasl_output( NIL, stream );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 31189L)
  public static SubLObject load_rtp_rules_cache_from_stream(final SubLObject stream)
  {
    SubLObject dummy = NIL;
    $rtp_rules$.setGlobalValue( cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    dummy = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    dummy = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    dummy = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 31490L)
  public static SubLObject rtp_rule(final SubLObject cat, final SubLObject template, final SubLObject sem)
  {
    if( !$rtp_rules$.getGlobalValue().isHashtable() )
    {
      allocate_rtp_rules();
    }
    final SubLObject tp_rule = new_template_rule( cat, template, sem, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    add_rtp_rule( tp_rule );
    return $kw119$ADDED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 32074L)
  public static SubLObject make_rtp_rule(final SubLObject cat, final SubLObject template, final SubLObject sem)
  {
    final SubLObject tp_rule = new_template_rule( cat, template, sem, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return tp_rule;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 32434L)
  public static SubLObject rule_cat(final SubLObject rule)
  {
    return template_rule_category( rule );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 32593L)
  public static SubLObject rule_template(final SubLObject rule)
  {
    return template_rule_template( rule );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 32764L)
  public static SubLObject rule_sem(final SubLObject rule)
  {
    return template_rule_transformation( rule );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 33883L)
  public static SubLObject clear_template_rules_master_index()
  {
    if( NIL != dictionary.dictionary_p( $template_rules_master_index$.getGlobalValue() ) )
    {
      dictionary.clear_dictionary( $template_rules_master_index$.getGlobalValue() );
    }
    return $template_rules_master_index$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 34084L)
  public static SubLObject allocate_template_rules_master_index()
  {
    if( NIL == dictionary.dictionary_p( $template_rules_master_index$.getGlobalValue() ) )
    {
      $template_rules_master_index$.setGlobalValue( dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ) );
    }
    return clear_template_rules_master_index();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 34312L)
  public static SubLObject ensure_template_rules_master_index()
  {
    if( NIL == dictionary.dictionary_p( $template_rules_master_index$.getGlobalValue() ) )
    {
      allocate_template_rules_master_index();
    }
    return $kw121$ENSURED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 34487L)
  public static SubLObject enumerate_all_template_categories()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject categories = NIL;
    if( NIL != dictionary.dictionary_p( $template_rules_master_index$.getGlobalValue() ) )
    {
      SubLObject iteration_state;
      for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( $template_rules_master_index$.getGlobalValue() ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
          iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
      {
        thread.resetMultipleValues();
        final SubLObject category = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
        final SubLObject rule_set = thread.secondMultipleValue();
        thread.resetMultipleValues();
        categories = ConsesLow.cons( category, categories );
      }
      dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    }
    return categories;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 34779L)
  public static SubLObject categorized_template_rule_set_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 34779L)
  public static SubLObject categorized_template_rule_set_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $categorized_template_rule_set_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 34779L)
  public static SubLObject categorized_template_rule_set_mentions(final SubLObject v_object)
  {
    assert NIL != categorized_template_rule_set_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 34779L)
  public static SubLObject categorized_template_rule_set_generic(final SubLObject v_object)
  {
    assert NIL != categorized_template_rule_set_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 34779L)
  public static SubLObject categorized_template_rule_set_key_terminal(final SubLObject v_object)
  {
    assert NIL != categorized_template_rule_set_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 34779L)
  public static SubLObject _csetf_categorized_template_rule_set_mentions(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != categorized_template_rule_set_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 34779L)
  public static SubLObject _csetf_categorized_template_rule_set_generic(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != categorized_template_rule_set_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 34779L)
  public static SubLObject _csetf_categorized_template_rule_set_key_terminal(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != categorized_template_rule_set_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 34779L)
  public static SubLObject make_categorized_template_rule_set(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $categorized_template_rule_set_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw137$MENTIONS ) )
      {
        _csetf_categorized_template_rule_set_mentions( v_new, current_value );
      }
      else if( pcase_var.eql( $kw138$GENERIC ) )
      {
        _csetf_categorized_template_rule_set_generic( v_new, current_value );
      }
      else if( pcase_var.eql( $kw139$KEY_TERMINAL ) )
      {
        _csetf_categorized_template_rule_set_key_terminal( v_new, current_value );
      }
      else
      {
        Errors.error( $str48$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 34779L)
  public static SubLObject visit_defstruct_categorized_template_rule_set(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw49$BEGIN, $sym140$MAKE_CATEGORIZED_TEMPLATE_RULE_SET, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw51$SLOT, $kw137$MENTIONS, categorized_template_rule_set_mentions( obj ) );
    Functions.funcall( visitor_fn, obj, $kw51$SLOT, $kw138$GENERIC, categorized_template_rule_set_generic( obj ) );
    Functions.funcall( visitor_fn, obj, $kw51$SLOT, $kw139$KEY_TERMINAL, categorized_template_rule_set_key_terminal( obj ) );
    Functions.funcall( visitor_fn, obj, $kw52$END, $sym140$MAKE_CATEGORIZED_TEMPLATE_RULE_SET, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 34779L)
  public static SubLObject visit_defstruct_object_categorized_template_rule_set_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_categorized_template_rule_set( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 35201L)
  public static SubLObject new_categorized_template_rule_set(SubLObject initial_size)
  {
    if( initial_size == UNPROVIDED )
    {
      initial_size = TWENTY_INTEGER;
    }
    final SubLObject rule_set = make_categorized_template_rule_set( UNPROVIDED );
    _csetf_categorized_template_rule_set_mentions( rule_set, Hashtables.make_hash_table( initial_size, Symbols.symbol_function( EQUALP ), UNPROVIDED ) );
    _csetf_categorized_template_rule_set_key_terminal( rule_set, Hashtables.make_hash_table( initial_size, Symbols.symbol_function( EQUALP ), UNPROVIDED ) );
    _csetf_categorized_template_rule_set_generic( rule_set, Hashtables.make_hash_table( initial_size, UNPROVIDED, UNPROVIDED ) );
    return rule_set;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 35825L)
  public static SubLObject update_rule_set_mentions(final SubLObject rule_set, final SubLObject terminal, final SubLObject tp_rule)
  {
    final SubLObject mentions = categorized_template_rule_set_mentions( rule_set );
    SubLObject templates = Hashtables.gethash( terminal, mentions, UNPROVIDED );
    if( NIL == templates )
    {
      templates = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
      Hashtables.sethash( terminal, mentions, templates );
    }
    dictionary_utilities.dictionary_push( templates, tp_rule, tp_rule );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 36343L)
  public static SubLObject eliminate_rule_set_mentions(final SubLObject rule_set, final SubLObject terminal, final SubLObject tp_rule)
  {
    final SubLObject mentions = categorized_template_rule_set_mentions( rule_set );
    final SubLObject templates = Hashtables.gethash( terminal, mentions, UNPROVIDED );
    if( NIL != templates )
    {
      dictionary.dictionary_remove( templates, tp_rule );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 36625L)
  public static SubLObject compute_rule_set_mentions_specificity(final SubLObject rule_set, final SubLObject terminal)
  {
    final SubLObject mentions = categorized_template_rule_set_mentions( rule_set );
    final SubLObject templates = Hashtables.gethash( terminal, mentions, UNPROVIDED );
    return ( NIL == templates ) ? ZERO_INTEGER : dictionary.dictionary_length( templates );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 36916L)
  public static SubLObject update_rule_set_key_terminal(final SubLObject rule_set, final SubLObject terminal, final SubLObject tp_rule)
  {
    final SubLObject key_terminal = categorized_template_rule_set_key_terminal( rule_set );
    SubLObject templates = Hashtables.gethash( terminal, key_terminal, UNPROVIDED );
    if( NIL == templates )
    {
      templates = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
      Hashtables.sethash( terminal, key_terminal, templates );
    }
    dictionary_utilities.dictionary_push( templates, tp_rule, tp_rule );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 37459L)
  public static SubLObject eliminate_rule_set_key_terminal(final SubLObject rule_set, final SubLObject terminal, final SubLObject tp_rule)
  {
    final SubLObject key_terminal = categorized_template_rule_set_key_terminal( rule_set );
    final SubLObject templates = Hashtables.gethash( terminal, key_terminal, UNPROVIDED );
    if( NIL != templates )
    {
      dictionary.dictionary_remove( templates, tp_rule );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 37768L)
  public static SubLObject update_rule_set_generic(final SubLObject rule_set, final SubLObject tp_rule)
  {
    final SubLObject generic = categorized_template_rule_set_generic( rule_set );
    Hashtables.sethash( tp_rule, generic, tp_rule );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 37953L)
  public static SubLObject eliminate_rule_set_generic(final SubLObject rule_set, final SubLObject tp_rule)
  {
    final SubLObject generic = categorized_template_rule_set_generic( rule_set );
    Hashtables.remhash( tp_rule, generic );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 38130L)
  public static SubLObject get_categorized_template_rule_set(final SubLObject mt, final SubLObject category)
  {
    if( NIL == dictionary.dictionary_p( $template_rules_master_index$.getGlobalValue() ) )
    {
      return NIL;
    }
    final SubLObject inner_dict = dictionary.dictionary_lookup( $template_rules_master_index$.getGlobalValue(), mt, UNPROVIDED );
    if( NIL != inner_dict )
    {
      return dictionary.dictionary_lookup( inner_dict, category, UNPROVIDED );
    }
    return Values.values( NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 38591L)
  public static SubLObject add_categorized_template_rule_set(final SubLObject mt, final SubLObject category)
  {
    ensure_template_rules_master_index();
    final SubLObject rule_set = new_categorized_template_rule_set( UNPROVIDED );
    SubLObject inner_dictionary = dictionary.dictionary_lookup( $template_rules_master_index$.getGlobalValue(), mt, UNPROVIDED );
    if( NIL == inner_dictionary )
    {
      dictionary.dictionary_enter( $template_rules_master_index$.getGlobalValue(), mt, dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ) );
      inner_dictionary = dictionary.dictionary_lookup( $template_rules_master_index$.getGlobalValue(), mt, UNPROVIDED );
    }
    dictionary.dictionary_enter( inner_dictionary, category, rule_set );
    return rule_set;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 39144L)
  public static SubLObject find_or_add_categorized_template_rule_set(final SubLObject mt, final SubLObject category)
  {
    SubLObject rule_set = get_categorized_template_rule_set( mt, category );
    if( NIL == categorized_template_rule_set_p( rule_set ) )
    {
      rule_set = add_categorized_template_rule_set( mt, category );
    }
    return rule_set;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 39438L)
  public static SubLObject extend_categorized_template_rule_set(final SubLObject mt, final SubLObject tp_rule)
  {
    final SubLObject category = template_rule_category( tp_rule );
    final SubLObject rule_set = find_or_add_categorized_template_rule_set( mt, category );
    final SubLObject terminals = template_rule_terminals( tp_rule );
    if( NIL != template_in_associative_memoryP( mt, category, terminals, tp_rule ) )
    {
      return tp_rule;
    }
    if( NIL == terminals )
    {
      update_rule_set_generic( rule_set, tp_rule );
      return tp_rule;
    }
    SubLObject cdolist_list_var = terminals;
    SubLObject terminal = NIL;
    terminal = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      update_rule_set_mentions( rule_set, terminal, tp_rule );
      cdolist_list_var = cdolist_list_var.rest();
      terminal = cdolist_list_var.first();
    }
    SubLObject cdolist_list_var2;
    final SubLObject key_terminals = cdolist_list_var2 = find_most_specific_terminals_in_rule_set( rule_set, terminals );
    SubLObject key_terminal = NIL;
    key_terminal = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      update_rule_set_key_terminal( rule_set, key_terminal, tp_rule );
      cdolist_list_var2 = cdolist_list_var2.rest();
      key_terminal = cdolist_list_var2.first();
    }
    cdolist_list_var = terminals;
    terminal = NIL;
    terminal = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      reconsider_rule_set_key_terminal( rule_set, terminal, tp_rule );
      cdolist_list_var = cdolist_list_var.rest();
      terminal = cdolist_list_var.first();
    }
    return tp_rule;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 40319L)
  public static SubLObject reduce_categorized_template_rule_set(final SubLObject mt, final SubLObject tp_rule)
  {
    final SubLObject category = template_rule_category( tp_rule );
    final SubLObject rule_set = get_categorized_template_rule_set( mt, category );
    final SubLObject terminals = template_rule_terminals( tp_rule );
    if( NIL == terminals )
    {
      eliminate_rule_set_generic( rule_set, tp_rule );
      return NIL;
    }
    SubLObject cdolist_list_var;
    final SubLObject key_terminals = cdolist_list_var = find_most_specific_terminals_in_rule_set( rule_set, terminals );
    SubLObject key_terminal = NIL;
    key_terminal = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      eliminate_rule_set_key_terminal( rule_set, key_terminal, tp_rule );
      cdolist_list_var = cdolist_list_var.rest();
      key_terminal = cdolist_list_var.first();
    }
    SubLObject cdolist_list_var2 = terminals;
    SubLObject terminal = NIL;
    terminal = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      eliminate_rule_set_mentions( rule_set, terminal, tp_rule );
      cdolist_list_var2 = cdolist_list_var2.rest();
      terminal = cdolist_list_var2.first();
    }
    cdolist_list_var2 = terminals;
    terminal = NIL;
    terminal = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      recompute_rule_set_key_terminal( rule_set, terminal );
      cdolist_list_var2 = cdolist_list_var2.rest();
      terminal = cdolist_list_var2.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 41090L)
  public static SubLObject reconsider_rule_set_key_terminal(final SubLObject rule_set, final SubLObject terminal, final SubLObject tp_rule)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject key_terminal = categorized_template_rule_set_key_terminal( rule_set );
    final SubLObject templates = Hashtables.gethash( terminal, key_terminal, UNPROVIDED );
    SubLObject updates = NIL;
    if( NIL == templates )
    {
      update_rule_set_key_terminal( rule_set, terminal, tp_rule );
      return NIL;
    }
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( templates ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject template = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject value = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( !template.eql( tp_rule ) )
      {
        final SubLObject terminals = template_rule_terminals( template );
        final SubLObject keys = find_most_specific_terminals_in_rule_set( rule_set, terminals );
        if( NIL == subl_promotions.memberP( terminal, keys, UNPROVIDED, UNPROVIDED ) )
        {
          updates = ConsesLow.cons( ConsesLow.cons( keys, template ), updates );
        }
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    SubLObject cdolist_list_var = updates;
    SubLObject update = NIL;
    update = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject keys2 = update.first();
      final SubLObject rule = update.rest();
      dictionary.dictionary_remove( templates, rule );
      SubLObject cdolist_list_var_$21 = keys2;
      SubLObject key = NIL;
      key = cdolist_list_var_$21.first();
      while ( NIL != cdolist_list_var_$21)
      {
        update_rule_set_key_terminal( rule_set, key, rule );
        cdolist_list_var_$21 = cdolist_list_var_$21.rest();
        key = cdolist_list_var_$21.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      update = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 42264L)
  public static SubLObject recompute_rule_set_key_terminal(final SubLObject rule_set, final SubLObject terminal)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mentions = categorized_template_rule_set_mentions( rule_set );
    final SubLObject key_terminals = categorized_template_rule_set_key_terminal( rule_set );
    final SubLObject templates = Hashtables.gethash( terminal, mentions, UNPROVIDED );
    final SubLObject key_templates = Hashtables.gethash( terminal, key_terminals, UNPROVIDED );
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( templates ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject template = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject value = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL == dictionary.dictionary_lookup( key_templates, template, UNPROVIDED ) )
      {
        final SubLObject terminals = template_rule_terminals( template );
        final SubLObject keys = find_most_specific_terminals_in_rule_set( rule_set, terminals );
        if( NIL != subl_promotions.memberP( terminal, keys, UNPROVIDED, UNPROVIDED ) )
        {
          update_rule_set_key_terminal( rule_set, terminal, template );
        }
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 43105L)
  public static SubLObject find_most_specific_terminal_in_rule_set(final SubLObject rule_set, final SubLObject terminals)
  {
    SubLObject best_terminal = NIL;
    SubLObject best_terminal_specificity = Numbers.$most_positive_fixnum$.getGlobalValue();
    SubLObject specificity = NIL;
    SubLObject cdolist_list_var = terminals;
    SubLObject terminal = NIL;
    terminal = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      specificity = compute_rule_set_mentions_specificity( rule_set, terminal );
      if( specificity.numL( best_terminal_specificity ) )
      {
      }
      best_terminal_specificity = specificity;
      best_terminal = terminal;
      cdolist_list_var = cdolist_list_var.rest();
      terminal = cdolist_list_var.first();
    }
    return best_terminal;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 43716L)
  public static SubLObject find_most_specific_terminals_in_rule_set(final SubLObject rule_set, final SubLObject terminals)
  {
    SubLObject best_terminals = NIL;
    SubLObject best_terminals_specificity = Numbers.$most_positive_fixnum$.getGlobalValue();
    SubLObject specificity = NIL;
    SubLObject cdolist_list_var = terminals;
    SubLObject terminal = NIL;
    terminal = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      specificity = compute_rule_set_mentions_specificity( rule_set, terminal );
      if( specificity.numL( best_terminals_specificity ) )
      {
        best_terminals_specificity = specificity;
        best_terminals = ConsesLow.list( terminal );
      }
      else if( specificity.numE( best_terminals_specificity ) )
      {
        best_terminals = ConsesLow.cons( terminal, best_terminals );
      }
      cdolist_list_var = cdolist_list_var.rest();
      terminal = cdolist_list_var.first();
    }
    return best_terminals;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 44449L)
  public static SubLObject do_templates_for_terminal(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list142 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject tp_rule_var = NIL;
    SubLObject mt = NIL;
    SubLObject category = NIL;
    SubLObject terminal = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list142 );
    tp_rule_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list142 );
    mt = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list142 );
    category = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list142 );
    terminal = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject current_mt = $sym143$CURRENT_MT;
      final SubLObject current_rule = $sym144$CURRENT_RULE;
      final SubLObject mentions = $sym145$MENTIONS;
      final SubLObject templates = $sym146$TEMPLATES;
      return ConsesLow.list( $sym147$CDOLIST, ConsesLow.list( current_mt, ConsesLow.list( $sym148$RELEVANT_TEMPLATE_MTS, mt ) ), ConsesLow.list( $sym149$CLET, ConsesLow.list( ConsesLow.list( current_rule, ConsesLow.list(
          $sym150$GET_CATEGORIZED_TEMPLATE_RULE_SET, current_mt, category ) ) ), ConsesLow.list( $sym151$PWHEN, current_rule, ConsesLow.list( $sym149$CLET, ConsesLow.list( ConsesLow.list( mentions, ConsesLow.list(
              $sym131$CATEGORIZED_TEMPLATE_RULE_SET_MENTIONS, current_rule ) ) ), ConsesLow.list( $sym151$PWHEN, ConsesLow.list( $sym152$HASH_TABLE_P, mentions ), ConsesLow.list( $sym149$CLET, ConsesLow.list( ConsesLow
                  .list( templates, ConsesLow.list( $sym153$GETHASH_WITHOUT_VALUES, terminal, mentions ) ) ), ConsesLow.list( $sym151$PWHEN, ConsesLow.list( $sym154$DICTIONARY_P, templates ), ConsesLow.listS(
                      $sym155$DO_DICTIONARY_KEYS, ConsesLow.list( tp_rule_var, templates ), ConsesLow.append( body, NIL ) ) ) ) ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list142 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 45339L)
  public static SubLObject with_clean_rtp_associative_memory(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym149$CLET, $list156, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 45476L)
  public static SubLObject template_in_associative_memoryP(final SubLObject mt, final SubLObject category, final SubLObject terminal_list, final SubLObject tp_rule)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var = terminal_list;
    SubLObject current_terminal = NIL;
    current_terminal = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$22 = relevant_template_mts( mt );
      SubLObject current_mt = NIL;
      current_mt = cdolist_list_var_$22.first();
      while ( NIL != cdolist_list_var_$22)
      {
        final SubLObject current_rule = get_categorized_template_rule_set( current_mt, category );
        if( NIL != current_rule )
        {
          final SubLObject mentions = categorized_template_rule_set_mentions( current_rule );
          if( mentions.isHashtable() )
          {
            final SubLObject templates = Hashtables.gethash_without_values( current_terminal, mentions, UNPROVIDED );
            if( NIL != dictionary.dictionary_p( templates ) )
            {
              SubLObject iteration_state;
              for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( templates ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                  iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
              {
                thread.resetMultipleValues();
                final SubLObject rule = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                final SubLObject value = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if( rule.equalp( tp_rule ) )
                {
                  return T;
                }
              }
              dictionary_contents.do_dictionary_contents_finalize( iteration_state );
            }
          }
        }
        cdolist_list_var_$22 = cdolist_list_var_$22.rest();
        current_mt = cdolist_list_var_$22.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      current_terminal = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 45798L)
  public static SubLObject clear_relevant_template_mts()
  {
    final SubLObject cs = $relevant_template_mts_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 45798L)
  public static SubLObject remove_relevant_template_mts(final SubLObject mt)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $relevant_template_mts_caching_state$.getGlobalValue(), ConsesLow.list( mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 45798L)
  public static SubLObject relevant_template_mts_internal(final SubLObject mt)
  {
    return genl_mts.all_genl_mts_among( mt, template_mts(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 45798L)
  public static SubLObject relevant_template_mts(final SubLObject mt)
  {
    SubLObject caching_state = $relevant_template_mts_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym148$RELEVANT_TEMPLATE_MTS, $sym157$_RELEVANT_TEMPLATE_MTS_CACHING_STATE_, $int158$128, EQL, ONE_INTEGER, ZERO_INTEGER );
      memoization_state.register_mt_dependent_cache_clear_callback( $sym159$CLEAR_RELEVANT_TEMPLATE_MTS );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( relevant_template_mts_internal( mt ) ) );
      memoization_state.caching_state_put( caching_state, mt, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 46116L)
  public static SubLObject clear_template_mts()
  {
    $template_mts$.setGlobalValue( NIL );
    return $template_mts$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 46209L)
  public static SubLObject template_mts()
  {
    if( NIL == $template_mts$.getGlobalValue() )
    {
      $template_mts$.setGlobalValue( genl_mts.all_spec_mts( $const161$TemplateParsingMt, UNPROVIDED, UNPROVIDED ) );
    }
    return $template_mts$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 46356L)
  public static SubLObject get_templates_for_terminal(final SubLObject mt, final SubLObject category, final SubLObject terminal)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject cdolist_list_var = relevant_template_mts( mt );
    SubLObject current_mt = NIL;
    current_mt = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject current_rule = get_categorized_template_rule_set( current_mt, category );
      if( NIL != current_rule )
      {
        final SubLObject mentions = categorized_template_rule_set_mentions( current_rule );
        if( mentions.isHashtable() )
        {
          final SubLObject templates = Hashtables.gethash_without_values( terminal, mentions, UNPROVIDED );
          if( NIL != dictionary.dictionary_p( templates ) )
          {
            SubLObject iteration_state;
            for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( templates ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
            {
              thread.resetMultipleValues();
              final SubLObject tp_rule = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
              final SubLObject value = thread.secondMultipleValue();
              thread.resetMultipleValues();
              result = ConsesLow.cons( tp_rule, result );
            }
            dictionary_contents.do_dictionary_contents_finalize( iteration_state );
          }
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      current_mt = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 46598L)
  public static SubLObject get_best_templates_for_terminal(final SubLObject mt, final SubLObject category, final SubLObject terminal)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject rule_set = NIL;
    SubLObject v_answer = NIL;
    SubLObject cdolist_list_var = relevant_template_mts( mt );
    SubLObject current_mt = NIL;
    current_mt = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject new_rule_set = get_categorized_template_rule_set( current_mt, category );
      if( NIL != new_rule_set )
      {
        rule_set = ConsesLow.cons( new_rule_set, rule_set );
      }
      cdolist_list_var = cdolist_list_var.rest();
      current_mt = cdolist_list_var.first();
    }
    cdolist_list_var = rule_set;
    SubLObject current_rule_set = NIL;
    current_rule_set = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject key_terminal = categorized_template_rule_set_key_terminal( current_rule_set );
      if( key_terminal.isHashtable() )
      {
        final SubLObject templates = Hashtables.gethash( terminal, key_terminal, UNPROVIDED );
        if( NIL != dictionary.dictionary_p( templates ) )
        {
          SubLObject iteration_state;
          for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( templates ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
              iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
          {
            thread.resetMultipleValues();
            final SubLObject tp_rule = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            v_answer = ConsesLow.cons( tp_rule, v_answer );
          }
          dictionary_contents.do_dictionary_contents_finalize( iteration_state );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      current_rule_set = cdolist_list_var.first();
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 47268L)
  public static SubLObject get_generic_templates_for_category(final SubLObject mt, final SubLObject category)
  {
    SubLObject rule_set = NIL;
    SubLObject v_answer = NIL;
    SubLObject cdolist_list_var = relevant_template_mts( mt );
    SubLObject current_mt = NIL;
    current_mt = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject current_rules = get_categorized_template_rule_set( current_mt, category );
      if( NIL != current_rules )
      {
        rule_set = ConsesLow.cons( current_rules, rule_set );
      }
      cdolist_list_var = cdolist_list_var.rest();
      current_mt = cdolist_list_var.first();
    }
    cdolist_list_var = rule_set;
    SubLObject current_rule_set = NIL;
    current_rule_set = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject generics = categorized_template_rule_set_generic( current_rule_set );
      if( generics.isHashtable() )
      {
        SubLObject template = NIL;
        SubLObject value = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( generics );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            template = Hashtables.getEntryKey( cdohash_entry );
            value = Hashtables.getEntryValue( cdohash_entry );
            v_answer = ConsesLow.cons( template, v_answer );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      current_rule_set = cdolist_list_var.first();
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 47860L)
  public static SubLObject enumerate_all_terminals(final SubLObject category)
  {
    final SubLObject mt_list = hash_table_utilities.hash_table_keys( $rtp_rules$.getGlobalValue() );
    SubLObject rule_set = NIL;
    SubLObject items = NIL;
    SubLObject cdolist_list_var = mt_list;
    SubLObject current_mt = NIL;
    current_mt = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject current_rule = get_categorized_template_rule_set( current_mt, category );
      if( NIL != current_rule )
      {
        rule_set = ConsesLow.cons( current_rule, rule_set );
      }
      cdolist_list_var = cdolist_list_var.rest();
      current_mt = cdolist_list_var.first();
    }
    cdolist_list_var = rule_set;
    SubLObject current_rule_set = NIL;
    current_rule_set = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject mentions = categorized_template_rule_set_mentions( current_rule_set );
      SubLObject terminal = NIL;
      SubLObject templates = NIL;
      final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( mentions );
      try
      {
        while ( Hashtables.iteratorHasNext( cdohash_iterator ))
        {
          final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
          terminal = Hashtables.getEntryKey( cdohash_entry );
          templates = Hashtables.getEntryValue( cdohash_entry );
          if( NIL != rtp_type_checkers.rtp_rule_terminalP( terminal ) )
          {
            items = ConsesLow.cons( terminal, items );
          }
        }
      }
      finally
      {
        Hashtables.releaseEntrySetIterator( cdohash_iterator );
      }
      cdolist_list_var = cdolist_list_var.rest();
      current_rule_set = cdolist_list_var.first();
    }
    return Sort.sort( items, Symbols.symbol_function( $sym162$STRING_ ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 48516L)
  public static SubLObject enumerate_all_best_terminals(final SubLObject category)
  {
    final SubLObject mt_list = hash_table_utilities.hash_table_keys( $rtp_rules$.getGlobalValue() );
    SubLObject rule_sets = NIL;
    SubLObject items = NIL;
    SubLObject cdolist_list_var = mt_list;
    SubLObject current_mt = NIL;
    current_mt = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject new_set = get_categorized_template_rule_set( current_mt, category );
      if( NIL != new_set )
      {
        rule_sets = ConsesLow.cons( new_set, rule_sets );
      }
      cdolist_list_var = cdolist_list_var.rest();
      current_mt = cdolist_list_var.first();
    }
    cdolist_list_var = rule_sets;
    SubLObject current_rules = NIL;
    current_rules = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject key_terminal = categorized_template_rule_set_key_terminal( current_rules );
      SubLObject terminal = NIL;
      SubLObject templates = NIL;
      final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( key_terminal );
      try
      {
        while ( Hashtables.iteratorHasNext( cdohash_iterator ))
        {
          final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
          terminal = Hashtables.getEntryKey( cdohash_entry );
          templates = Hashtables.getEntryValue( cdohash_entry );
          if( NIL != rtp_type_checkers.rtp_rule_terminalP( terminal ) )
          {
            items = ConsesLow.cons( terminal, items );
          }
        }
      }
      finally
      {
        Hashtables.releaseEntrySetIterator( cdohash_iterator );
      }
      cdolist_list_var = cdolist_list_var.rest();
      current_rules = cdolist_list_var.first();
    }
    return Sort.sort( items, Symbols.symbol_function( $sym162$STRING_ ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 49116L)
  public static SubLObject populate_rtp_from_mt(final SubLObject mt, SubLObject template_types)
  {
    if( template_types == UNPROVIDED )
    {
      template_types = isa.all_fort_instances( $const163$ParseTemplatePredicate, mt, UNPROVIDED );
    }
    rtp_clear_rules();
    allocate_rtp_rules();
    clear_template_rules_master_index();
    lexicon_accessors.clear_get_strings_of_type_cached();
    extend_rtp_from_mt( mt, template_types );
    return mt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 49521L)
  public static SubLObject repopulate_rtp_from_mt(final SubLObject mt, SubLObject template_types)
  {
    if( template_types == UNPROVIDED )
    {
      template_types = isa.all_fort_instances( $const163$ParseTemplatePredicate, mt, UNPROVIDED );
    }
    ensure_rtp_rules();
    clear_template_rules_master_index();
    lexicon_accessors.clear_get_strings_of_type_cached();
    extend_rtp_from_mt( mt, template_types );
    return mt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 49931L)
  public static SubLObject extend_rtp_from_mt(final SubLObject mt, final SubLObject template_types)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject mt_list = NIL;
    SubLObject num_assertions = ZERO_INTEGER;
    if( NIL != mt )
    {
      mt_list = conses_high.nintersection( genl_mts.all_genl_mts( mt, UNPROVIDED, UNPROVIDED ), genl_mts.all_spec_mts( $const161$TemplateParsingMt, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    else
    {
      mt_list = isa.all_fort_instances_in_all_mts( $const164$TemplateParsingMicrotheory );
    }
    SubLObject cdolist_list_var = mt_list;
    SubLObject mt_$23 = NIL;
    mt_$23 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$24 = template_types;
      SubLObject tp_type = NIL;
      tp_type = cdolist_list_var_$24.first();
      while ( NIL != cdolist_list_var_$24)
      {
        SubLObject current;
        final SubLObject datum = current = tp_type;
        SubLObject template_pred = NIL;
        SubLObject template_categories = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list165 );
        template_pred = current.first();
        current = ( template_categories = current.rest() );
        num_assertions = Numbers.add( num_assertions, template_count_for_pred_and_categories( mt_$23, template_pred, template_categories ) );
        cdolist_list_var_$24 = cdolist_list_var_$24.rest();
        tp_type = cdolist_list_var_$24.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      mt_$23 = cdolist_list_var.first();
    }
    final SubLObject note = Sequences.cconcatenate( $str166$Gathering_Template_Parsing_Assert, new SubLObject[] { format_nil.format_nil_s_no_copy( Sequences.length( mt_list ) ), $str167$_mts__, format_nil
        .format_nil_s_no_copy( num_assertions ), $str168$_total_
    } );
    final SubLObject _prev_bind_0 = $rtp_asserts_initialized_so_far$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      $rtp_asserts_initialized_so_far$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( note );
        final SubLObject _prev_bind_0_$25 = pph_macros.$free_pph_problem_store_pointers$.currentBinding( thread );
        try
        {
          pph_macros.$free_pph_problem_store_pointers$.bind( NIL, thread );
          thread.resetMultipleValues();
          final SubLObject _prev_bind_0_$26 = pph_macros.$pph_problem_store_pointer$.currentBinding( thread );
          try
          {
            pph_macros.$pph_problem_store_pointer$.bind( pph_macros.find_or_create_pph_problem_store_pointer(), thread );
            final SubLObject reuseP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            try
            {
              thread.resetMultipleValues();
              final SubLObject _prev_bind_0_$27 = pph_macros.$pph_memoization_state$.currentBinding( thread );
              try
              {
                pph_macros.$pph_memoization_state$.bind( pph_macros.find_or_create_pph_memoization_state(), thread );
                final SubLObject new_or_reused = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject _prev_bind_0_$28 = pph_macros.$pph_external_memoization_state$.currentBinding( thread );
                try
                {
                  pph_macros.$pph_external_memoization_state$.bind( pph_macros.find_or_create_pph_external_memoization_state(), thread );
                  final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue( thread );
                  final SubLObject _prev_bind_0_$29 = memoization_state.$memoization_state$.currentBinding( thread );
                  try
                  {
                    memoization_state.$memoization_state$.bind( local_state, thread );
                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
                    try
                    {
                      SubLObject cdolist_list_var2 = mt_list;
                      SubLObject mt_$24 = NIL;
                      mt_$24 = cdolist_list_var2.first();
                      while ( NIL != cdolist_list_var2)
                      {
                        SubLObject cdolist_list_var_$25 = template_types;
                        SubLObject tp_type2 = NIL;
                        tp_type2 = cdolist_list_var_$25.first();
                        while ( NIL != cdolist_list_var_$25)
                        {
                          extend_rtp_from_just_mt_for_tp_type( mt_$24, tp_type2, num_assertions );
                          cdolist_list_var_$25 = cdolist_list_var_$25.rest();
                          tp_type2 = cdolist_list_var_$25.first();
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        mt_$24 = cdolist_list_var2.first();
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
                        Values.restoreValuesFromVector( _values );
                      }
                      finally
                      {
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$30, thread );
                      }
                    }
                  }
                  finally
                  {
                    memoization_state.$memoization_state$.rebind( _prev_bind_0_$29, thread );
                  }
                }
                finally
                {
                  pph_macros.$pph_external_memoization_state$.rebind( _prev_bind_0_$28, thread );
                }
                if( new_or_reused == $kw169$NEW && NIL != memoization_state.memoization_state_p( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) ) )
                {
                  memoization_state.clear_all_memoization( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) );
                }
              }
              finally
              {
                pph_macros.$pph_memoization_state$.rebind( _prev_bind_0_$27, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$31 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                if( NIL == reuseP )
                {
                  pph_macros.free_pph_problem_store_pointer( pph_macros.$pph_problem_store_pointer$.getDynamicValue( thread ) );
                }
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$31, thread );
              }
            }
          }
          finally
          {
            pph_macros.$pph_problem_store_pointer$.rebind( _prev_bind_0_$26, thread );
          }
        }
        finally
        {
          pph_macros.$free_pph_problem_store_pointers$.rebind( _prev_bind_0_$25, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$32 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values3 = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values3 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$32, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_5, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_4, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_2, thread );
      $rtp_asserts_initialized_so_far$.rebind( _prev_bind_0, thread );
    }
    return mt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 50836L)
  public static SubLObject extend_rtp_from_just_mt_for_tp_type(final SubLObject mt, final SubLObject tp_type, final SubLObject total_assertions)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject template_pred = NIL;
    SubLObject template_categories = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( tp_type, tp_type, $list165 );
    template_pred = tp_type.first();
    final SubLObject current = template_categories = tp_type.rest();
    final SubLObject num_assertions = template_count_for_pred_and_categories( mt, template_pred, template_categories );
    if( ZERO_INTEGER.numL( num_assertions ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym4$RELEVANT_MT_IS_EQ, thread );
        mt_relevance_macros.$mt$.bind( mt, thread );
        if( NIL != template_categories )
        {
          SubLObject cdolist_list_var = template_categories;
          SubLObject template_category = NIL;
          template_category = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            final SubLObject pred_var = template_pred;
            if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( template_category, ONE_INTEGER, pred_var ) )
            {
              final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( template_category, ONE_INTEGER, pred_var );
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
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw5$GAF, NIL, NIL );
                    SubLObject done_var_$35 = NIL;
                    final SubLObject token_var_$36 = NIL;
                    while ( NIL == done_var_$35)
                    {
                      final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$36 );
                      final SubLObject valid_$37 = makeBoolean( !token_var_$36.eql( assertion ) );
                      if( NIL != valid_$37 )
                      {
                        utilities_macros.note_percent_progress( $rtp_asserts_initialized_so_far$.getDynamicValue( thread ), total_assertions );
                        extend_rtp_with_template_assertion( assertion );
                        $rtp_asserts_initialized_so_far$.setDynamicValue( Numbers.add( $rtp_asserts_initialized_so_far$.getDynamicValue( thread ), ONE_INTEGER ), thread );
                      }
                      done_var_$35 = makeBoolean( NIL == valid_$37 );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$38 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$38, thread );
                    }
                  }
                }
                done_var = makeBoolean( NIL == valid );
              }
            }
            cdolist_list_var = cdolist_list_var.rest();
            template_category = cdolist_list_var.first();
          }
        }
        else
        {
          final SubLObject pred_var2 = template_pred;
          if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var2 ) )
          {
            final SubLObject str = NIL;
            final SubLObject _prev_bind_0_$39 = utilities_macros.$progress_start_time$.currentBinding( thread );
            final SubLObject _prev_bind_1_$40 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
            final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
            final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
            final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
            final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
            final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
            final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
            try
            {
              utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
              utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
              utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
              utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
              utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
              utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
              utilities_macros.$is_noting_progressP$.bind( T, thread );
              utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
              utilities_macros.noting_progress_preamble( str );
              final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var2 );
              SubLObject done_var2 = NIL;
              final SubLObject token_var2 = NIL;
              while ( NIL == done_var2)
              {
                final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
                final SubLObject valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
                if( NIL != valid2 )
                {
                  utilities_macros.note_progress();
                  SubLObject final_index_iterator2 = NIL;
                  try
                  {
                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw5$GAF, NIL, NIL );
                    SubLObject done_var_$36 = NIL;
                    final SubLObject token_var_$37 = NIL;
                    while ( NIL == done_var_$36)
                    {
                      final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$37 );
                      final SubLObject valid_$38 = makeBoolean( !token_var_$37.eql( assertion2 ) );
                      if( NIL != valid_$38 )
                      {
                        utilities_macros.note_percent_progress( $rtp_asserts_initialized_so_far$.getDynamicValue( thread ), total_assertions );
                        extend_rtp_with_template_assertion( assertion2 );
                        $rtp_asserts_initialized_so_far$.setDynamicValue( Numbers.add( $rtp_asserts_initialized_so_far$.getDynamicValue( thread ), ONE_INTEGER ), thread );
                      }
                      done_var_$36 = makeBoolean( NIL == valid_$38 );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$40 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$40, thread );
                    }
                  }
                }
                done_var2 = makeBoolean( NIL == valid2 );
              }
              utilities_macros.noting_progress_postamble();
            }
            finally
            {
              utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
              utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
              utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
              utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
              utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
              utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
              utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$40, thread );
              utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$39, thread );
            }
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 51777L)
  public static SubLObject template_count_for_pred_and_categories(final SubLObject mt, final SubLObject pred, SubLObject categories)
  {
    if( categories == UNPROVIDED )
    {
      categories = NIL;
    }
    SubLObject count = ZERO_INTEGER;
    if( NIL != categories )
    {
      SubLObject cdolist_list_var = categories;
      SubLObject cat = NIL;
      cat = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        count = Numbers.add( count, kb_indexing.num_gaf_arg_index( cat, ONE_INTEGER, pred, mt ) );
        cdolist_list_var = cdolist_list_var.rest();
        cat = cdolist_list_var.first();
      }
    }
    else
    {
      count = Numbers.add( count, kb_indexing.num_predicate_extent_index( pred, mt ) );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 52254L)
  public static SubLObject extend_rtp_with_template_assertion(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = pph_vars.$pph_language_mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = pph_vars.$pph_domain_mt$.currentBinding( thread );
    try
    {
      pph_vars.$pph_language_mt$.bind( ( NIL != pph_vars.$pph_language_mt$.getDynamicValue( thread ) ) ? pph_vars.$pph_language_mt$.getDynamicValue( thread ) : $const170$CyclishParaphraseMt, thread );
      pph_vars.$pph_domain_mt$.bind( ( NIL != pph_vars.$pph_domain_mt$.getDynamicValue( thread ) ) ? pph_vars.$pph_domain_mt$.getDynamicValue( thread ) : $const171$DataForNLMt, thread );
      ensure_rtp_rules();
      final SubLObject mt = assertions_high.assertion_mt( assertion );
      final SubLObject meaning = assertions_high.gaf_arg0( assertion );
      final SubLObject category = assertions_high.gaf_arg1( assertion );
      SubLObject template = NIL;
      SubLObject expansion = NIL;
      SubLObject sem_test = NIL;
      SubLObject violator = NIL;
      SubLObject pcase_var = arity.arity( meaning );
      if( pcase_var.eql( THREE_INTEGER ) )
      {
        template = assertions_high.gaf_arg2( assertion );
        expansion = assertions_high.gaf_arg3( assertion );
      }
      else if( pcase_var.eql( FOUR_INTEGER ) )
      {
        template = assertions_high.gaf_arg3( assertion );
        expansion = assertions_high.gaf_arg4( assertion );
      }
      else if( pcase_var.eql( FIVE_INTEGER ) )
      {
        template = assertions_high.gaf_arg3( assertion );
        expansion = assertions_high.gaf_arg4( assertion );
        sem_test = assertions_high.gaf_arg5( assertion );
      }
      if( expansion.isCons() )
      {
        pcase_var = expansion.first();
        if( pcase_var.eql( $const172$ExpandSubLFn ) )
        {
          expansion = conses_high.third( expansion );
        }
        else if( pcase_var.eql( $const173$SubLQuoteFn ) )
        {
          expansion = conses_high.second( expansion );
        }
      }
      template = strip_wrapper_functions_from( template );
      try
      {
        thread.throwStack.push( $kw91$RECURSIVE_TEMPLATE );
        SubLObject existing_tp_rules = find_rtp_rules_by_assertion( assertion );
        if( NIL == existing_tp_rules )
        {
          final SubLObject tp_rule = new_template_rule( category, template, expansion, sem_test, assertion, meaning );
          add_rtp_rule( tp_rule );
          existing_tp_rules = ConsesLow.list( tp_rule );
        }
        SubLObject cdolist_list_var = existing_tp_rules;
        SubLObject tp_rule2 = NIL;
        tp_rule2 = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          extend_categorized_template_rule_set( mt, tp_rule2 );
          cdolist_list_var = cdolist_list_var.rest();
          tp_rule2 = cdolist_list_var.first();
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        violator = Errors.handleThrowable( ccatch_env_var, $kw91$RECURSIVE_TEMPLATE );
      }
      finally
      {
        thread.throwStack.pop();
      }
      if( NIL != violator )
      {
        Errors.warn( $str174$Assertion__D_specifies_a_left_rec, assertion_handles.assertion_id( assertion ), assertion );
      }
    }
    finally
    {
      pph_vars.$pph_domain_mt$.rebind( _prev_bind_2, thread );
      pph_vars.$pph_language_mt$.rebind( _prev_bind_0, thread );
    }
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 53872L)
  public static SubLObject strip_wrapper_functions_from(final SubLObject template)
  {
    SubLObject clean_version = NIL;
    SubLObject top_levelP = NIL;
    SubLObject cdolist_list_var = template;
    SubLObject this_constraint = NIL;
    this_constraint = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( this_constraint.eql( $const175$NLPatternList ) )
      {
        top_levelP = T;
      }
      else if( NIL == el_utilities.el_formula_p( this_constraint ) )
      {
        clean_version = ConsesLow.cons( this_constraint, clean_version );
      }
      else if( cycl_utilities.formula_arg0( this_constraint ).eql( $const176$NLPattern_Word ) || cycl_utilities.formula_arg0( this_constraint ).eql( $const177$NLPattern_Template ) )
      {
        clean_version = ConsesLow.cons( cycl_utilities.formula_args( this_constraint, UNPROVIDED ), clean_version );
      }
      else if( NIL != isa.isaP( cycl_utilities.formula_arg0( this_constraint ), $const178$NLParsingSlot, UNPROVIDED, UNPROVIDED ) )
      {
        SubLObject cdolist_list_var_$45 = strip_wrapper_functions_from( cycl_utilities.formula_args( this_constraint, UNPROVIDED ) );
        SubLObject this_result = NIL;
        this_result = cdolist_list_var_$45.first();
        while ( NIL != cdolist_list_var_$45)
        {
          clean_version = ConsesLow.cons( this_result, clean_version );
          cdolist_list_var_$45 = cdolist_list_var_$45.rest();
          this_result = cdolist_list_var_$45.first();
        }
      }
      else if( cycl_utilities.formula_arg0( this_constraint ).eql( $const179$NLPattern_Term_Optional ) )
      {
        clean_version = ConsesLow.cons( ConsesLow.cons( $const180$OptionalOne, transform_cyc_term_item( this_constraint ).rest() ), clean_version );
      }
      else if( cycl_utilities.formula_arg0( this_constraint ).eql( $const181$NLPattern_Exact ) )
      {
        if( NIL != top_levelP )
        {
          SubLObject cdolist_list_var_$46 = cycl_utilities.formula_args( this_constraint, UNPROVIDED );
          SubLObject this_match = NIL;
          this_match = cdolist_list_var_$46.first();
          while ( NIL != cdolist_list_var_$46)
          {
            clean_version = ConsesLow.cons( this_match, clean_version );
            cdolist_list_var_$46 = cdolist_list_var_$46.rest();
            this_match = cdolist_list_var_$46.first();
          }
        }
        else
        {
          clean_version = ConsesLow.cons( ConsesLow.list( $const87$RequireOne, ConsesLow.cons( $const90$WordSequence, cycl_utilities.formula_args( this_constraint, UNPROVIDED ) ) ), clean_version );
        }
      }
      else if( NIL != rtp_type_checkers.optional_template_item( this_constraint ) )
      {
        SubLObject strip_down = ConsesLow.list( cycl_utilities.formula_arg0( this_constraint ) );
        SubLObject cdolist_list_var_$47;
        final SubLObject args = cdolist_list_var_$47 = cycl_utilities.formula_args( this_constraint, $kw182$IGNORE );
        SubLObject this_item = NIL;
        this_item = cdolist_list_var_$47.first();
        while ( NIL != cdolist_list_var_$47)
        {
          final SubLObject the_result = strip_wrapper_functions_from( ConsesLow.list( this_item ) ).first();
          if( NIL != rtp_type_checkers.rtp_require_one_itemP( the_result ) )
          {
            strip_down = ConsesLow.cons( conses_high.cadr( the_result ), strip_down );
          }
          else
          {
            strip_down = ConsesLow.cons( the_result, strip_down );
          }
          cdolist_list_var_$47 = cdolist_list_var_$47.rest();
          this_item = cdolist_list_var_$47.first();
        }
        clean_version = ConsesLow.cons( Sequences.reverse( strip_down ), clean_version );
      }
      else if( NIL != subl_promotions.memberP( cycl_utilities.formula_arg0( this_constraint ), $list183, UNPROVIDED, UNPROVIDED ) )
      {
        clean_version = ConsesLow.cons( Sequences.reverse( cycl_utilities.formula_args( this_constraint, UNPROVIDED ) ), clean_version );
      }
      else
      {
        clean_version = ConsesLow.cons( this_constraint, clean_version );
      }
      cdolist_list_var = cdolist_list_var.rest();
      this_constraint = cdolist_list_var.first();
    }
    return Sequences.reverse( clean_version );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 56187L)
  public static SubLObject reduce_rtp_by_template_assertion(final SubLObject assertion)
  {
    final SubLObject mt = assertions_high.assertion_mt( assertion );
    SubLObject cdolist_list_var;
    final SubLObject tp_rules = cdolist_list_var = find_rtp_rules_by_assertion( assertion );
    SubLObject tp_rule = NIL;
    tp_rule = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      remove_rtp_rule( tp_rule );
      reduce_categorized_template_rule_set( mt, tp_rule );
      cdolist_list_var = cdolist_list_var.rest();
      tp_rule = cdolist_list_var.first();
    }
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 56489L)
  public static SubLObject add_template_assertion(final SubLObject argument, final SubLObject assertion)
  {
    SubLObject asserted_at_allP = NIL;
    final SubLObject formula = assertions_high.assertion_formula( assertion );
    final SubLObject constraint_at = ( NIL != subl_promotions.memberP( $const184$TemplateParsingSyntacticConstrain, kb_accessors.min_argn_isa( cycl_utilities.formula_arg0( formula ), TWO_INTEGER, UNPROVIDED ),
        UNPROVIDED, UNPROVIDED ) ) ? TWO_INTEGER : THREE_INTEGER;
    if( NIL != rtp_type_checkers.valid_rtp_syntactic_constraintP( cycl_utilities.formula_arg( formula, constraint_at, UNPROVIDED ) ) )
    {
      asserted_at_allP = list_utilities.sublisp_boolean( extend_rtp_with_template_assertion( assertion ) );
    }
    else
    {
      Errors.warn( $str185$Strange_template_assertion__S_wit, assertion, argument );
    }
    lexicon_utilities.clear_lexical_info_caches( UNPROVIDED );
    return asserted_at_allP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 58063L)
  public static SubLObject remove_template_assertion(final SubLObject argument, final SubLObject assertion)
  {
    if( NIL != cached_template_assertion_p( argument, assertion ) )
    {
      reduce_rtp_by_template_assertion( assertion );
    }
    lexicon_utilities.clear_lexical_info_caches( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 58285L)
  public static SubLObject cached_template_assertion_p(final SubLObject argument, final SubLObject assertion)
  {
    return makeBoolean( argument == $kw188$ASSERTED_TRUE_DEF || argument == $kw189$ASSERTED_TRUE_MON );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 58531L)
  public static SubLObject rtp_chart_entry_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    rtp_entry_print( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 58531L)
  public static SubLObject rtp_chart_entry_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $rtp_chart_entry_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 58531L)
  public static SubLObject rtp_chart_entry_start(final SubLObject v_object)
  {
    assert NIL != rtp_chart_entry_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 58531L)
  public static SubLObject rtp_chart_entry_end(final SubLObject v_object)
  {
    assert NIL != rtp_chart_entry_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 58531L)
  public static SubLObject rtp_chart_entry_rule(final SubLObject v_object)
  {
    assert NIL != rtp_chart_entry_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 58531L)
  public static SubLObject rtp_chart_entry_template_index(final SubLObject v_object)
  {
    assert NIL != rtp_chart_entry_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 58531L)
  public static SubLObject rtp_chart_entry_words(final SubLObject v_object)
  {
    assert NIL != rtp_chart_entry_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 58531L)
  public static SubLObject rtp_chart_entry_bindings(final SubLObject v_object)
  {
    assert NIL != rtp_chart_entry_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 58531L)
  public static SubLObject rtp_chart_entry_subconstits(final SubLObject v_object)
  {
    assert NIL != rtp_chart_entry_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 58531L)
  public static SubLObject rtp_chart_entry_sem(final SubLObject v_object)
  {
    assert NIL != rtp_chart_entry_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 58531L)
  public static SubLObject _csetf_rtp_chart_entry_start(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rtp_chart_entry_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 58531L)
  public static SubLObject _csetf_rtp_chart_entry_end(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rtp_chart_entry_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 58531L)
  public static SubLObject _csetf_rtp_chart_entry_rule(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rtp_chart_entry_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 58531L)
  public static SubLObject _csetf_rtp_chart_entry_template_index(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rtp_chart_entry_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 58531L)
  public static SubLObject _csetf_rtp_chart_entry_words(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rtp_chart_entry_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 58531L)
  public static SubLObject _csetf_rtp_chart_entry_bindings(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rtp_chart_entry_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 58531L)
  public static SubLObject _csetf_rtp_chart_entry_subconstits(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rtp_chart_entry_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 58531L)
  public static SubLObject _csetf_rtp_chart_entry_sem(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rtp_chart_entry_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 58531L)
  public static SubLObject make_rtp_chart_entry(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $rtp_chart_entry_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw82$START ) )
      {
        _csetf_rtp_chart_entry_start( v_new, current_value );
      }
      else if( pcase_var.eql( $kw52$END ) )
      {
        _csetf_rtp_chart_entry_end( v_new, current_value );
      }
      else if( pcase_var.eql( $kw215$RULE ) )
      {
        _csetf_rtp_chart_entry_rule( v_new, current_value );
      }
      else if( pcase_var.eql( $kw216$TEMPLATE_INDEX ) )
      {
        _csetf_rtp_chart_entry_template_index( v_new, current_value );
      }
      else if( pcase_var.eql( $kw217$WORDS ) )
      {
        _csetf_rtp_chart_entry_words( v_new, current_value );
      }
      else if( pcase_var.eql( $kw218$BINDINGS ) )
      {
        _csetf_rtp_chart_entry_bindings( v_new, current_value );
      }
      else if( pcase_var.eql( $kw219$SUBCONSTITS ) )
      {
        _csetf_rtp_chart_entry_subconstits( v_new, current_value );
      }
      else if( pcase_var.eql( $kw220$SEM ) )
      {
        _csetf_rtp_chart_entry_sem( v_new, current_value );
      }
      else
      {
        Errors.error( $str48$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 58531L)
  public static SubLObject visit_defstruct_rtp_chart_entry(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw49$BEGIN, $sym221$MAKE_RTP_CHART_ENTRY, EIGHT_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw51$SLOT, $kw82$START, rtp_chart_entry_start( obj ) );
    Functions.funcall( visitor_fn, obj, $kw51$SLOT, $kw52$END, rtp_chart_entry_end( obj ) );
    Functions.funcall( visitor_fn, obj, $kw51$SLOT, $kw215$RULE, rtp_chart_entry_rule( obj ) );
    Functions.funcall( visitor_fn, obj, $kw51$SLOT, $kw216$TEMPLATE_INDEX, rtp_chart_entry_template_index( obj ) );
    Functions.funcall( visitor_fn, obj, $kw51$SLOT, $kw217$WORDS, rtp_chart_entry_words( obj ) );
    Functions.funcall( visitor_fn, obj, $kw51$SLOT, $kw218$BINDINGS, rtp_chart_entry_bindings( obj ) );
    Functions.funcall( visitor_fn, obj, $kw51$SLOT, $kw219$SUBCONSTITS, rtp_chart_entry_subconstits( obj ) );
    Functions.funcall( visitor_fn, obj, $kw51$SLOT, $kw220$SEM, rtp_chart_entry_sem( obj ) );
    Functions.funcall( visitor_fn, obj, $kw52$END, $sym221$MAKE_RTP_CHART_ENTRY, EIGHT_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 58531L)
  public static SubLObject visit_defstruct_object_rtp_chart_entry_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_rtp_chart_entry( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 59286L)
  public static SubLObject rtp_entry_print(final SubLObject entry, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str223$__RTP_entry______Words__S_____Sem, new SubLObject[] { rtp_chart_entry_words( entry ), rtp_chart_entry_sem( entry ), rtp_chart_entry_bindings( entry ), rtp_chart_entry_subconstits(
        entry ), rtp_chart_entry_rule( entry ), rtp_chart_entry_template_index( entry ), rtp_chart_entry_start( entry )
    } );
    return entry;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 59878L)
  public static SubLObject copy_rtp_entry(final SubLObject entry)
  {
    final SubLObject new_entry = make_rtp_chart_entry( UNPROVIDED );
    final SubLObject sem = conses_high.copy_tree( rtp_chart_entry_sem( entry ) );
    final SubLObject words = conses_high.copy_list( rtp_chart_entry_words( entry ) );
    final SubLObject subconstits = conses_high.copy_tree( rtp_chart_entry_subconstits( entry ) );
    final SubLObject v_bindings = conses_high.copy_tree( rtp_chart_entry_bindings( entry ) );
    final SubLObject template = rtp_chart_entry_rule( entry );
    _csetf_rtp_chart_entry_sem( new_entry, sem );
    _csetf_rtp_chart_entry_bindings( new_entry, v_bindings );
    _csetf_rtp_chart_entry_words( new_entry, words );
    _csetf_rtp_chart_entry_subconstits( new_entry, subconstits );
    _csetf_rtp_chart_entry_rule( new_entry, template );
    _csetf_rtp_chart_entry_template_index( new_entry, rtp_chart_entry_template_index( entry ) );
    _csetf_rtp_chart_entry_start( new_entry, rtp_chart_entry_start( entry ) );
    _csetf_rtp_chart_entry_end( new_entry, rtp_chart_entry_end( entry ) );
    return new_entry;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 60865L)
  public static SubLObject make_new_rtp_entry(final SubLObject word_list, final SubLObject start, final SubLObject end, SubLObject sem, SubLObject rule)
  {
    if( sem == UNPROVIDED )
    {
      sem = NIL;
    }
    if( rule == UNPROVIDED )
    {
      rule = NIL;
    }
    final SubLObject entry = make_rtp_chart_entry( UNPROVIDED );
    _csetf_rtp_chart_entry_words( entry, conses_high.copy_list( word_list ) );
    _csetf_rtp_chart_entry_start( entry, start );
    _csetf_rtp_chart_entry_end( entry, end );
    if( NIL != sem )
    {
      _csetf_rtp_chart_entry_sem( entry, sem.isList() ? conses_high.copy_tree( sem ) : sem );
    }
    if( NIL != rule )
    {
      _csetf_rtp_chart_entry_rule( entry, rule );
      _csetf_rtp_chart_entry_template_index( entry, ZERO_INTEGER );
    }
    return entry;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 61679L)
  public static SubLObject set_rtp_entry_remaining_template(final SubLObject entry, final SubLObject remaining_template)
  {
    _csetf_rtp_chart_entry_template_index( entry, Numbers.subtract( Sequences.length( rule_template( rtp_chart_entry_rule( entry ) ) ), Sequences.length( remaining_template ) ) );
    return entry;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 62190L)
  public static SubLObject convert_rtp_entry_to_parse_result(final SubLObject entry)
  {
    SubLObject result = rtp_chart_entry_sem( entry );
    final SubLObject template = rtp_chart_entry_rule( entry );
    final SubLObject rule = template_rule_assertion( template );
    SubLObject subconstits = NIL;
    SubLObject bounded = NIL;
    SubLObject cdolist_list_var = rtp_chart_entry_subconstits( entry );
    SubLObject subconstit = NIL;
    subconstit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      subconstits = ConsesLow.cons( convert_subconstit_to_parse_result( subconstit ), subconstits );
      cdolist_list_var = cdolist_list_var.rest();
      subconstit = cdolist_list_var.first();
    }
    cdolist_list_var = subconstits;
    subconstit = NIL;
    subconstit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = conses_high.nsubst( conses_high.second( subconstit ), subconstit.first(), result, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      subconstit = cdolist_list_var.first();
    }
    bounded = result;
    cdolist_list_var = rtp_chart_entry_bindings( entry );
    SubLObject v_bindings = NIL;
    v_bindings = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject variable = rtp_binding_var( v_bindings );
      SubLObject bind_set = rtp_binding_vals( v_bindings );
      if( bind_set.isCons() )
      {
        bind_set = bind_set.first();
      }
      bounded = conses_high.nsubst( bind_set, variable, bounded, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      v_bindings = cdolist_list_var.first();
    }
    return Values.values( bounded, rule );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 63305L)
  public static SubLObject rtp_sem_testP(final SubLObject formula)
  {
    return makeBoolean( formula.isCons() && cycl_utilities.formula_arg0( formula ).eql( $const224$semanticTest ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 63483L)
  public static SubLObject rtp_sem_test_var(final SubLObject formula)
  {
    return cycl_utilities.formula_arg1( formula, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 63561L)
  public static SubLObject rtp_sem_test_constraint(final SubLObject formula)
  {
    return cycl_utilities.formula_arg2( formula, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 63646L)
  public static SubLObject subconstit_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_subconstit( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 63646L)
  public static SubLObject subconstit_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $subconstit_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 63646L)
  public static SubLObject subconstit_cat(final SubLObject v_object)
  {
    assert NIL != subconstit_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 63646L)
  public static SubLObject subconstit_string(final SubLObject v_object)
  {
    assert NIL != subconstit_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 63646L)
  public static SubLObject subconstit_binding_var(final SubLObject v_object)
  {
    assert NIL != subconstit_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 63646L)
  public static SubLObject subconstit_start(final SubLObject v_object)
  {
    assert NIL != subconstit_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 63646L)
  public static SubLObject subconstit_end(final SubLObject v_object)
  {
    assert NIL != subconstit_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 63646L)
  public static SubLObject subconstit_sem_test(final SubLObject v_object)
  {
    assert NIL != subconstit_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 63646L)
  public static SubLObject _csetf_subconstit_cat(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != subconstit_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 63646L)
  public static SubLObject _csetf_subconstit_string(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != subconstit_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 63646L)
  public static SubLObject _csetf_subconstit_binding_var(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != subconstit_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 63646L)
  public static SubLObject _csetf_subconstit_start(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != subconstit_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 63646L)
  public static SubLObject _csetf_subconstit_end(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != subconstit_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 63646L)
  public static SubLObject _csetf_subconstit_sem_test(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != subconstit_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 63646L)
  public static SubLObject make_subconstit(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $subconstit_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw246$CAT ) )
      {
        _csetf_subconstit_cat( v_new, current_value );
      }
      else if( pcase_var.eql( $kw247$STRING ) )
      {
        _csetf_subconstit_string( v_new, current_value );
      }
      else if( pcase_var.eql( $kw248$BINDING_VAR ) )
      {
        _csetf_subconstit_binding_var( v_new, current_value );
      }
      else if( pcase_var.eql( $kw82$START ) )
      {
        _csetf_subconstit_start( v_new, current_value );
      }
      else if( pcase_var.eql( $kw52$END ) )
      {
        _csetf_subconstit_end( v_new, current_value );
      }
      else if( pcase_var.eql( $kw42$SEM_TEST ) )
      {
        _csetf_subconstit_sem_test( v_new, current_value );
      }
      else
      {
        Errors.error( $str48$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 63646L)
  public static SubLObject visit_defstruct_subconstit(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw49$BEGIN, $sym249$MAKE_SUBCONSTIT, SIX_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw51$SLOT, $kw246$CAT, subconstit_cat( obj ) );
    Functions.funcall( visitor_fn, obj, $kw51$SLOT, $kw247$STRING, subconstit_string( obj ) );
    Functions.funcall( visitor_fn, obj, $kw51$SLOT, $kw248$BINDING_VAR, subconstit_binding_var( obj ) );
    Functions.funcall( visitor_fn, obj, $kw51$SLOT, $kw82$START, subconstit_start( obj ) );
    Functions.funcall( visitor_fn, obj, $kw51$SLOT, $kw52$END, subconstit_end( obj ) );
    Functions.funcall( visitor_fn, obj, $kw51$SLOT, $kw42$SEM_TEST, subconstit_sem_test( obj ) );
    Functions.funcall( visitor_fn, obj, $kw52$END, $sym249$MAKE_SUBCONSTIT, SIX_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 63646L)
  public static SubLObject visit_defstruct_object_subconstit_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_subconstit( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 64025L)
  public static SubLObject print_subconstit(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str251$__Subconst__S_of_cat__S_, subconstit_string( v_object ), subconstit_cat( v_object ) );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 64214L)
  public static SubLObject make_new_subconstit(final SubLObject cat, final SubLObject words, final SubLObject var, final SubLObject start, final SubLObject end, SubLObject sem_test)
  {
    if( sem_test == UNPROVIDED )
    {
      sem_test = NIL;
    }
    final SubLObject subconstit = make_subconstit( UNPROVIDED );
    _csetf_subconstit_cat( subconstit, cat );
    _csetf_subconstit_string( subconstit, words );
    _csetf_subconstit_binding_var( subconstit, var );
    _csetf_subconstit_start( subconstit, start );
    _csetf_subconstit_end( subconstit, end );
    _csetf_subconstit_sem_test( subconstit, sem_test );
    return subconstit;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 64653L)
  public static SubLObject convert_subconstit_to_parse_result(final SubLObject subconstit)
  {
    final SubLObject start = subconstit_start( subconstit );
    final SubLObject end = subconstit_end( subconstit );
    final SubLObject variable = subconstit_binding_var( subconstit );
    final SubLObject category = subconstit_cat( subconstit );
    final SubLObject word_used = string_utilities.bunge( subconstit_string( subconstit ), UNPROVIDED );
    final SubLObject sem_test = ( NIL != subconstit_sem_test( subconstit ) ) ? subconstit_sem_test( subconstit ) : $list252;
    SubLObject span = NIL;
    if( category.eql( $const253$StringTemplate ) )
    {
      return ConsesLow.list( variable, word_used );
    }
    if( Numbers.subtract( end, ONE_INTEGER ).numLE( start ) )
    {
      span = ConsesLow.cons( start, NIL );
    }
    else
    {
      final SubLObject count = Numbers.subtract( end, start );
      SubLObject result = NIL;
      SubLObject i;
      for( i = NIL, i = ZERO_INTEGER; i.numL( count ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        result = ConsesLow.cons( Numbers.add( start, i ), result );
      }
      span = Sequences.nreverse( result );
    }
    span = ConsesLow.cons( $const254$TheList, span );
    return ConsesLow.list( variable, ConsesLow.list( $const255$TheResultOfParsing, word_used, span, category, sem_test ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 65661L)
  public static SubLObject rtp_make_binding(final SubLObject var, final SubLObject value)
  {
    return ConsesLow.list( var, value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 66777L)
  public static SubLObject rtp_binding_var(final SubLObject binding)
  {
    return binding.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 66928L)
  public static SubLObject rtp_binding_vals(final SubLObject binding)
  {
    return conses_high.second( binding );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 67075L)
  public static SubLObject rtp_binding_p(final SubLObject binding)
  {
    return makeBoolean( binding.isList() && binding.first().isKeyword() && NIL != list_utilities.lengthE( binding, TWO_INTEGER, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 67209L)
  public static SubLObject template_item_wu(final SubLObject template_item)
  {
    return rtp_type_checkers.rtp_word_item_word( template_item );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 67526L)
  public static SubLObject template_item_pos(final SubLObject template_item)
  {
    return rtp_type_checkers.rtp_word_item_syntactic_constraint( template_item );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-datastructures.lisp", position = 67802L)
  public static SubLObject reset_all_rtp_datastructure_caches()
  {
    rtp_type_checkers.clear_rtp_template_categoryP();
    clear_make_optional_word_list();
    lexicon_accessors.clear_get_strings_of_type_cached();
    clear_all_phrases_filter_from_term_phrases_constraint();
    recognition.clear_expand_word_items_in_list_int();
    clear_template_mts();
    clear_relevant_template_mts();
    return $kw256$RESET;
  }

  public static SubLObject declare_rtp_datastructures_file()
  {
    SubLFiles.declareFunction( me, "add_template_meta_marker", "ADD-TEMPLATE-META-MARKER", 2, 0, false );
    SubLFiles.declareFunction( me, "map_template_meta_marker", "MAP-TEMPLATE-META-MARKER", 1, 0, false );
    SubLFiles.declareFunction( me, "interpret_template_meta_marker_assertion", "INTERPRET-TEMPLATE-META-MARKER-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "populate_meta_markers_from_mt", "POPULATE-META-MARKERS-FROM-MT", 1, 1, false );
    SubLFiles.declareFunction( me, "transform_meta_markers_in_template_expression", "TRANSFORM-META-MARKERS-IN-TEMPLATE-EXPRESSION", 1, 0, false );
    SubLFiles.declareFunction( me, "map_template_category_fill_words", "MAP-TEMPLATE-CATEGORY-FILL-WORDS", 1, 0, false );
    SubLFiles.declareFunction( me, "add_template_category_fill_word", "ADD-TEMPLATE-CATEGORY-FILL-WORD", 2, 0, false );
    SubLFiles.declareFunction( me, "interpret_template_category_fill_word_assertion", "INTERPRET-TEMPLATE-CATEGORY-FILL-WORD-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "populate_template_category_fill_words_from_mt", "POPULATE-TEMPLATE-CATEGORY-FILL-WORDS-FROM-MT", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_make_optional_word_list", "CLEAR-MAKE-OPTIONAL-WORD-LIST", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_make_optional_word_list", "REMOVE-MAKE-OPTIONAL-WORD-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "make_optional_word_list_internal", "MAKE-OPTIONAL-WORD-LIST-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "make_optional_word_list", "MAKE-OPTIONAL-WORD-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "add_category_fill_words_to_template", "ADD-CATEGORY-FILL-WORDS-TO-TEMPLATE", 2, 0, false );
    SubLFiles.declareFunction( me, "template_rule_print_function_trampoline", "TEMPLATE-RULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "template_rule_p", "TEMPLATE-RULE-P", 1, 0, false );
    new $template_rule_p$UnaryFunction();
    SubLFiles.declareFunction( me, "template_rule_category", "TEMPLATE-RULE-CATEGORY", 1, 0, false );
    SubLFiles.declareFunction( me, "template_rule_template", "TEMPLATE-RULE-TEMPLATE", 1, 0, false );
    SubLFiles.declareFunction( me, "template_rule_transformation", "TEMPLATE-RULE-TRANSFORMATION", 1, 0, false );
    SubLFiles.declareFunction( me, "template_rule_sem_test", "TEMPLATE-RULE-SEM-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "template_rule_assertion", "TEMPLATE-RULE-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "template_rule_terminals", "TEMPLATE-RULE-TERMINALS", 1, 0, false );
    SubLFiles.declareFunction( me, "template_rule_meaning", "TEMPLATE-RULE-MEANING", 1, 0, false );
    SubLFiles.declareFunction( me, "template_rule_constraints", "TEMPLATE-RULE-CONSTRAINTS", 1, 0, false );
    SubLFiles.declareFunction( me, "template_rule_id", "TEMPLATE-RULE-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_template_rule_category", "_CSETF-TEMPLATE-RULE-CATEGORY", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_template_rule_template", "_CSETF-TEMPLATE-RULE-TEMPLATE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_template_rule_transformation", "_CSETF-TEMPLATE-RULE-TRANSFORMATION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_template_rule_sem_test", "_CSETF-TEMPLATE-RULE-SEM-TEST", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_template_rule_assertion", "_CSETF-TEMPLATE-RULE-ASSERTION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_template_rule_terminals", "_CSETF-TEMPLATE-RULE-TERMINALS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_template_rule_meaning", "_CSETF-TEMPLATE-RULE-MEANING", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_template_rule_constraints", "_CSETF-TEMPLATE-RULE-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_template_rule_id", "_CSETF-TEMPLATE-RULE-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "make_template_rule", "MAKE-TEMPLATE-RULE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_template_rule", "VISIT-DEFSTRUCT-TEMPLATE-RULE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_template_rule_method", "VISIT-DEFSTRUCT-OBJECT-TEMPLATE-RULE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "rtp_chart_entry_sem_test", "RTP-CHART-ENTRY-SEM-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_chart_entry_sem_testP", "RTP-CHART-ENTRY-SEM-TEST?", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_template_rule_method", "SXHASH-TEMPLATE-RULE-METHOD", 1, 0, false );
    new $sxhash_template_rule_method$UnaryFunction();
    SubLFiles.declareFunction( me, "print_template_rule", "PRINT-TEMPLATE-RULE", 3, 0, false );
    SubLFiles.declareFunction( me, "new_template_rule", "NEW-TEMPLATE-RULE", 3, 3, false );
    SubLFiles.declareFunction( me, "cfasl_output_object_template_rule_method", "CFASL-OUTPUT-OBJECT-TEMPLATE-RULE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_template_rule", "CFASL-OUTPUT-TEMPLATE-RULE", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_template_rule", "CFASL-INPUT-TEMPLATE-RULE", 1, 0, false );
    new $cfasl_input_template_rule$UnaryFunction();
    SubLFiles.declareFunction( me, "template_span_item_print_function_trampoline", "TEMPLATE-SPAN-ITEM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "template_span_item_p", "TEMPLATE-SPAN-ITEM-P", 1, 0, false );
    new $template_span_item_p$UnaryFunction();
    SubLFiles.declareFunction( me, "template_span_item_template_item", "TEMPLATE-SPAN-ITEM-TEMPLATE-ITEM", 1, 0, false );
    SubLFiles.declareFunction( me, "template_span_item_start", "TEMPLATE-SPAN-ITEM-START", 1, 0, false );
    SubLFiles.declareFunction( me, "template_span_item_end", "TEMPLATE-SPAN-ITEM-END", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_template_span_item_template_item", "_CSETF-TEMPLATE-SPAN-ITEM-TEMPLATE-ITEM", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_template_span_item_start", "_CSETF-TEMPLATE-SPAN-ITEM-START", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_template_span_item_end", "_CSETF-TEMPLATE-SPAN-ITEM-END", 2, 0, false );
    SubLFiles.declareFunction( me, "make_template_span_item", "MAKE-TEMPLATE-SPAN-ITEM", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_template_span_item", "VISIT-DEFSTRUCT-TEMPLATE-SPAN-ITEM", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_template_span_item_method", "VISIT-DEFSTRUCT-OBJECT-TEMPLATE-SPAN-ITEM-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_template_span_item", "NEW-TEMPLATE-SPAN-ITEM", 3, 0, false );
    SubLFiles.declareFunction( me, "print_template_span_item", "PRINT-TEMPLATE-SPAN-ITEM", 3, 0, false );
    SubLFiles.declareFunction( me, "extract_constraints_from_template", "EXTRACT-CONSTRAINTS-FROM-TEMPLATE", 1, 0, false );
    SubLFiles.declareFunction( me, "optimize_template_constraints", "OPTIMIZE-TEMPLATE-CONSTRAINTS", 1, 0, false );
    SubLFiles.declareFunction( me, "ensure_flattened_constraint", "ENSURE-FLATTENED-CONSTRAINT", 1, 0, false );
    SubLFiles.declareFunction( me, "compile_template_expression", "COMPILE-TEMPLATE-EXPRESSION", 2, 0, false );
    SubLFiles.declareFunction( me, "expand_word_items", "EXPAND-WORD-ITEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "expand_word_sequences", "EXPAND-WORD-SEQUENCES", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_expand_string_item", "POSSIBLY-EXPAND-STRING-ITEM", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_expand_word_sequence_item", "POSSIBLY-EXPAND-WORD-SEQUENCE-ITEM", 1, 0, false );
    SubLFiles.declareFunction( me, "ensure_non_recursive_template", "ENSURE-NON-RECURSIVE-TEMPLATE", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_denotations_of_constant", "CLEAR-DENOTATIONS-OF-CONSTANT", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_denotations_of_constant", "REMOVE-DENOTATIONS-OF-CONSTANT", 1, 1, false );
    SubLFiles.declareFunction( me, "denotations_of_constant_internal", "DENOTATIONS-OF-CONSTANT-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "denotations_of_constant", "DENOTATIONS-OF-CONSTANT", 1, 1, false );
    SubLFiles.declareFunction( me, "rtp_preds_from_term_phrases_constraint", "RTP-PREDS-FROM-TERM-PHRASES-CONSTRAINT", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_all_phrases_filter_from_term_phrases_constraint", "CLEAR-ALL-PHRASES-FILTER-FROM-TERM-PHRASES-CONSTRAINT", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_all_phrases_filter_from_term_phrases_constraint", "REMOVE-ALL-PHRASES-FILTER-FROM-TERM-PHRASES-CONSTRAINT", 1, 0, false );
    SubLFiles.declareFunction( me, "all_phrases_filter_from_term_phrases_constraint_internal", "ALL-PHRASES-FILTER-FROM-TERM-PHRASES-CONSTRAINT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "all_phrases_filter_from_term_phrases_constraint", "ALL-PHRASES-FILTER-FROM-TERM-PHRASES-CONSTRAINT", 1, 0, false );
    SubLFiles.declareFunction( me, "replace_constants_with_denotations", "REPLACE-CONSTANTS-WITH-DENOTATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "transform_cyc_term_item", "TRANSFORM-CYC-TERM-ITEM", 1, 0, false );
    SubLFiles.declareFunction( me, "optimize_template_expression", "OPTIMIZE-TEMPLATE-EXPRESSION", 1, 0, false );
    SubLFiles.declareFunction( me, "extract_terminals_from_template", "EXTRACT-TERMINALS-FROM-TEMPLATE", 1, 0, false );
    SubLFiles.declareFunction( me, "check_for_terminals_in_subtemplate", "CHECK-FOR-TERMINALS-IN-SUBTEMPLATE", 2, 0, false );
    SubLFiles.declareFunction( me, "compute_strings_of_type", "COMPUTE-STRINGS-OF-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "possible_contractions_for_subtemplate", "POSSIBLE-CONTRACTIONS-FOR-SUBTEMPLATE", 1, 0, false );
    SubLFiles.declareFunction( me, "maybe_initialize_rtp_contractions_table", "MAYBE-INITIALIZE-RTP-CONTRACTIONS-TABLE", 0, 1, false );
    SubLFiles.declareFunction( me, "template_rule_constraints_matchP", "TEMPLATE-RULE-CONSTRAINTS-MATCH?", 2, 0, false );
    SubLFiles.declareFunction( me, "verify_words_meet_constraints", "VERIFY-WORDS-MEET-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "rtp_member", "RTP-MEMBER", 2, 1, false );
    SubLFiles.declareFunction( me, "match_some_of", "MATCH-SOME-OF", 3, 0, false );
    SubLFiles.declareFunction( me, "match_sequence", "MATCH-SEQUENCE", 2, 1, false );
    SubLFiles.declareFunction( me, "remove_an_internal_group", "REMOVE-AN-INTERNAL-GROUP", 2, 0, false );
    SubLFiles.declareFunction( me, "rtp_clear_rules", "RTP-CLEAR-RULES", 0, 0, false );
    SubLFiles.declareFunction( me, "allocate_rtp_rules", "ALLOCATE-RTP-RULES", 0, 0, false );
    SubLFiles.declareFunction( me, "ensure_rtp_rules", "ENSURE-RTP-RULES", 0, 0, false );
    SubLFiles.declareFunction( me, "add_rtp_rule", "ADD-RTP-RULE", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_rule_existsP", "RTP-RULE-EXISTS?", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_rtp_rule", "REMOVE-RTP-RULE", 1, 0, false );
    SubLFiles.declareFunction( me, "find_rtp_rules_by_assertion", "FIND-RTP-RULES-BY-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_rules_cache_unbuiltP", "RTP-RULES-CACHE-UNBUILT?", 0, 0, false );
    SubLFiles.declareFunction( me, "dump_rtp_rules_cache_to_stream", "DUMP-RTP-RULES-CACHE-TO-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "load_rtp_rules_cache_from_stream", "LOAD-RTP-RULES-CACHE-FROM-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_rule", "RTP-RULE", 3, 0, false );
    SubLFiles.declareFunction( me, "make_rtp_rule", "MAKE-RTP-RULE", 3, 0, false );
    SubLFiles.declareFunction( me, "rule_cat", "RULE-CAT", 1, 0, false );
    SubLFiles.declareFunction( me, "rule_template", "RULE-TEMPLATE", 1, 0, false );
    SubLFiles.declareFunction( me, "rule_sem", "RULE-SEM", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_template_rules_master_index", "CLEAR-TEMPLATE-RULES-MASTER-INDEX", 0, 0, false );
    SubLFiles.declareFunction( me, "allocate_template_rules_master_index", "ALLOCATE-TEMPLATE-RULES-MASTER-INDEX", 0, 0, false );
    SubLFiles.declareFunction( me, "ensure_template_rules_master_index", "ENSURE-TEMPLATE-RULES-MASTER-INDEX", 0, 0, false );
    SubLFiles.declareFunction( me, "enumerate_all_template_categories", "ENUMERATE-ALL-TEMPLATE-CATEGORIES", 0, 0, false );
    SubLFiles.declareFunction( me, "categorized_template_rule_set_print_function_trampoline", "CATEGORIZED-TEMPLATE-RULE-SET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "categorized_template_rule_set_p", "CATEGORIZED-TEMPLATE-RULE-SET-P", 1, 0, false );
    new $categorized_template_rule_set_p$UnaryFunction();
    SubLFiles.declareFunction( me, "categorized_template_rule_set_mentions", "CATEGORIZED-TEMPLATE-RULE-SET-MENTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "categorized_template_rule_set_generic", "CATEGORIZED-TEMPLATE-RULE-SET-GENERIC", 1, 0, false );
    SubLFiles.declareFunction( me, "categorized_template_rule_set_key_terminal", "CATEGORIZED-TEMPLATE-RULE-SET-KEY-TERMINAL", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_categorized_template_rule_set_mentions", "_CSETF-CATEGORIZED-TEMPLATE-RULE-SET-MENTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_categorized_template_rule_set_generic", "_CSETF-CATEGORIZED-TEMPLATE-RULE-SET-GENERIC", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_categorized_template_rule_set_key_terminal", "_CSETF-CATEGORIZED-TEMPLATE-RULE-SET-KEY-TERMINAL", 2, 0, false );
    SubLFiles.declareFunction( me, "make_categorized_template_rule_set", "MAKE-CATEGORIZED-TEMPLATE-RULE-SET", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_categorized_template_rule_set", "VISIT-DEFSTRUCT-CATEGORIZED-TEMPLATE-RULE-SET", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_categorized_template_rule_set_method", "VISIT-DEFSTRUCT-OBJECT-CATEGORIZED-TEMPLATE-RULE-SET-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_categorized_template_rule_set", "NEW-CATEGORIZED-TEMPLATE-RULE-SET", 0, 1, false );
    SubLFiles.declareFunction( me, "update_rule_set_mentions", "UPDATE-RULE-SET-MENTIONS", 3, 0, false );
    SubLFiles.declareFunction( me, "eliminate_rule_set_mentions", "ELIMINATE-RULE-SET-MENTIONS", 3, 0, false );
    SubLFiles.declareFunction( me, "compute_rule_set_mentions_specificity", "COMPUTE-RULE-SET-MENTIONS-SPECIFICITY", 2, 0, false );
    SubLFiles.declareFunction( me, "update_rule_set_key_terminal", "UPDATE-RULE-SET-KEY-TERMINAL", 3, 0, false );
    SubLFiles.declareFunction( me, "eliminate_rule_set_key_terminal", "ELIMINATE-RULE-SET-KEY-TERMINAL", 3, 0, false );
    SubLFiles.declareFunction( me, "update_rule_set_generic", "UPDATE-RULE-SET-GENERIC", 2, 0, false );
    SubLFiles.declareFunction( me, "eliminate_rule_set_generic", "ELIMINATE-RULE-SET-GENERIC", 2, 0, false );
    SubLFiles.declareFunction( me, "get_categorized_template_rule_set", "GET-CATEGORIZED-TEMPLATE-RULE-SET", 2, 0, false );
    SubLFiles.declareFunction( me, "add_categorized_template_rule_set", "ADD-CATEGORIZED-TEMPLATE-RULE-SET", 2, 0, false );
    SubLFiles.declareFunction( me, "find_or_add_categorized_template_rule_set", "FIND-OR-ADD-CATEGORIZED-TEMPLATE-RULE-SET", 2, 0, false );
    SubLFiles.declareFunction( me, "extend_categorized_template_rule_set", "EXTEND-CATEGORIZED-TEMPLATE-RULE-SET", 2, 0, false );
    SubLFiles.declareFunction( me, "reduce_categorized_template_rule_set", "REDUCE-CATEGORIZED-TEMPLATE-RULE-SET", 2, 0, false );
    SubLFiles.declareFunction( me, "reconsider_rule_set_key_terminal", "RECONSIDER-RULE-SET-KEY-TERMINAL", 3, 0, false );
    SubLFiles.declareFunction( me, "recompute_rule_set_key_terminal", "RECOMPUTE-RULE-SET-KEY-TERMINAL", 2, 0, false );
    SubLFiles.declareFunction( me, "find_most_specific_terminal_in_rule_set", "FIND-MOST-SPECIFIC-TERMINAL-IN-RULE-SET", 2, 0, false );
    SubLFiles.declareFunction( me, "find_most_specific_terminals_in_rule_set", "FIND-MOST-SPECIFIC-TERMINALS-IN-RULE-SET", 2, 0, false );
    SubLFiles.declareMacro( me, "do_templates_for_terminal", "DO-TEMPLATES-FOR-TERMINAL" );
    SubLFiles.declareMacro( me, "with_clean_rtp_associative_memory", "WITH-CLEAN-RTP-ASSOCIATIVE-MEMORY" );
    SubLFiles.declareFunction( me, "template_in_associative_memoryP", "TEMPLATE-IN-ASSOCIATIVE-MEMORY?", 4, 0, false );
    SubLFiles.declareFunction( me, "clear_relevant_template_mts", "CLEAR-RELEVANT-TEMPLATE-MTS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_relevant_template_mts", "REMOVE-RELEVANT-TEMPLATE-MTS", 1, 0, false );
    SubLFiles.declareFunction( me, "relevant_template_mts_internal", "RELEVANT-TEMPLATE-MTS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "relevant_template_mts", "RELEVANT-TEMPLATE-MTS", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_template_mts", "CLEAR-TEMPLATE-MTS", 0, 0, false );
    SubLFiles.declareFunction( me, "template_mts", "TEMPLATE-MTS", 0, 0, false );
    SubLFiles.declareFunction( me, "get_templates_for_terminal", "GET-TEMPLATES-FOR-TERMINAL", 3, 0, false );
    SubLFiles.declareFunction( me, "get_best_templates_for_terminal", "GET-BEST-TEMPLATES-FOR-TERMINAL", 3, 0, false );
    SubLFiles.declareFunction( me, "get_generic_templates_for_category", "GET-GENERIC-TEMPLATES-FOR-CATEGORY", 2, 0, false );
    SubLFiles.declareFunction( me, "enumerate_all_terminals", "ENUMERATE-ALL-TERMINALS", 1, 0, false );
    SubLFiles.declareFunction( me, "enumerate_all_best_terminals", "ENUMERATE-ALL-BEST-TERMINALS", 1, 0, false );
    SubLFiles.declareFunction( me, "populate_rtp_from_mt", "POPULATE-RTP-FROM-MT", 1, 1, false );
    SubLFiles.declareFunction( me, "repopulate_rtp_from_mt", "REPOPULATE-RTP-FROM-MT", 1, 1, false );
    SubLFiles.declareFunction( me, "extend_rtp_from_mt", "EXTEND-RTP-FROM-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "extend_rtp_from_just_mt_for_tp_type", "EXTEND-RTP-FROM-JUST-MT-FOR-TP-TYPE", 3, 0, false );
    SubLFiles.declareFunction( me, "template_count_for_pred_and_categories", "TEMPLATE-COUNT-FOR-PRED-AND-CATEGORIES", 2, 1, false );
    SubLFiles.declareFunction( me, "extend_rtp_with_template_assertion", "EXTEND-RTP-WITH-TEMPLATE-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "strip_wrapper_functions_from", "STRIP-WRAPPER-FUNCTIONS-FROM", 1, 0, false );
    SubLFiles.declareFunction( me, "reduce_rtp_by_template_assertion", "REDUCE-RTP-BY-TEMPLATE-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "add_template_assertion", "ADD-TEMPLATE-ASSERTION", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_template_assertion", "REMOVE-TEMPLATE-ASSERTION", 2, 0, false );
    SubLFiles.declareFunction( me, "cached_template_assertion_p", "CACHED-TEMPLATE-ASSERTION-P", 2, 0, false );
    SubLFiles.declareFunction( me, "rtp_chart_entry_print_function_trampoline", "RTP-CHART-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "rtp_chart_entry_p", "RTP-CHART-ENTRY-P", 1, 0, false );
    new $rtp_chart_entry_p$UnaryFunction();
    SubLFiles.declareFunction( me, "rtp_chart_entry_start", "RTP-CHART-ENTRY-START", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_chart_entry_end", "RTP-CHART-ENTRY-END", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_chart_entry_rule", "RTP-CHART-ENTRY-RULE", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_chart_entry_template_index", "RTP-CHART-ENTRY-TEMPLATE-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_chart_entry_words", "RTP-CHART-ENTRY-WORDS", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_chart_entry_bindings", "RTP-CHART-ENTRY-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_chart_entry_subconstits", "RTP-CHART-ENTRY-SUBCONSTITS", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_chart_entry_sem", "RTP-CHART-ENTRY-SEM", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rtp_chart_entry_start", "_CSETF-RTP-CHART-ENTRY-START", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rtp_chart_entry_end", "_CSETF-RTP-CHART-ENTRY-END", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rtp_chart_entry_rule", "_CSETF-RTP-CHART-ENTRY-RULE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rtp_chart_entry_template_index", "_CSETF-RTP-CHART-ENTRY-TEMPLATE-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rtp_chart_entry_words", "_CSETF-RTP-CHART-ENTRY-WORDS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rtp_chart_entry_bindings", "_CSETF-RTP-CHART-ENTRY-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rtp_chart_entry_subconstits", "_CSETF-RTP-CHART-ENTRY-SUBCONSTITS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rtp_chart_entry_sem", "_CSETF-RTP-CHART-ENTRY-SEM", 2, 0, false );
    SubLFiles.declareFunction( me, "make_rtp_chart_entry", "MAKE-RTP-CHART-ENTRY", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_rtp_chart_entry", "VISIT-DEFSTRUCT-RTP-CHART-ENTRY", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_rtp_chart_entry_method", "VISIT-DEFSTRUCT-OBJECT-RTP-CHART-ENTRY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "rtp_entry_print", "RTP-ENTRY-PRINT", 3, 0, false );
    SubLFiles.declareFunction( me, "copy_rtp_entry", "COPY-RTP-ENTRY", 1, 0, false );
    SubLFiles.declareFunction( me, "make_new_rtp_entry", "MAKE-NEW-RTP-ENTRY", 3, 2, false );
    SubLFiles.declareFunction( me, "set_rtp_entry_remaining_template", "SET-RTP-ENTRY-REMAINING-TEMPLATE", 2, 0, false );
    SubLFiles.declareFunction( me, "convert_rtp_entry_to_parse_result", "CONVERT-RTP-ENTRY-TO-PARSE-RESULT", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_sem_testP", "RTP-SEM-TEST?", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_sem_test_var", "RTP-SEM-TEST-VAR", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_sem_test_constraint", "RTP-SEM-TEST-CONSTRAINT", 1, 0, false );
    SubLFiles.declareFunction( me, "subconstit_print_function_trampoline", "SUBCONSTIT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "subconstit_p", "SUBCONSTIT-P", 1, 0, false );
    new $subconstit_p$UnaryFunction();
    SubLFiles.declareFunction( me, "subconstit_cat", "SUBCONSTIT-CAT", 1, 0, false );
    SubLFiles.declareFunction( me, "subconstit_string", "SUBCONSTIT-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "subconstit_binding_var", "SUBCONSTIT-BINDING-VAR", 1, 0, false );
    SubLFiles.declareFunction( me, "subconstit_start", "SUBCONSTIT-START", 1, 0, false );
    SubLFiles.declareFunction( me, "subconstit_end", "SUBCONSTIT-END", 1, 0, false );
    SubLFiles.declareFunction( me, "subconstit_sem_test", "SUBCONSTIT-SEM-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_subconstit_cat", "_CSETF-SUBCONSTIT-CAT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_subconstit_string", "_CSETF-SUBCONSTIT-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_subconstit_binding_var", "_CSETF-SUBCONSTIT-BINDING-VAR", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_subconstit_start", "_CSETF-SUBCONSTIT-START", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_subconstit_end", "_CSETF-SUBCONSTIT-END", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_subconstit_sem_test", "_CSETF-SUBCONSTIT-SEM-TEST", 2, 0, false );
    SubLFiles.declareFunction( me, "make_subconstit", "MAKE-SUBCONSTIT", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_subconstit", "VISIT-DEFSTRUCT-SUBCONSTIT", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_subconstit_method", "VISIT-DEFSTRUCT-OBJECT-SUBCONSTIT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_subconstit", "PRINT-SUBCONSTIT", 3, 0, false );
    SubLFiles.declareFunction( me, "make_new_subconstit", "MAKE-NEW-SUBCONSTIT", 5, 1, false );
    SubLFiles.declareFunction( me, "convert_subconstit_to_parse_result", "CONVERT-SUBCONSTIT-TO-PARSE-RESULT", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_make_binding", "RTP-MAKE-BINDING", 2, 0, false );
    SubLFiles.declareFunction( me, "rtp_binding_var", "RTP-BINDING-VAR", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_binding_vals", "RTP-BINDING-VALS", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_binding_p", "RTP-BINDING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "template_item_wu", "TEMPLATE-ITEM-WU", 1, 0, false );
    SubLFiles.declareFunction( me, "template_item_pos", "TEMPLATE-ITEM-POS", 1, 0, false );
    SubLFiles.declareFunction( me, "reset_all_rtp_datastructure_caches", "RESET-ALL-RTP-DATASTRUCTURE-CACHES", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_rtp_datastructures_file()
  {
    $print_rule_abbreviated$ = SubLFiles.deflexical( "*PRINT-RULE-ABBREVIATED*", T );
    $template_meta_marker_mappings$ = SubLFiles.deflexical( "*TEMPLATE-META-MARKER-MAPPINGS*", maybeDefault( $sym0$_TEMPLATE_META_MARKER_MAPPINGS_, $template_meta_marker_mappings$, () -> ( dictionary.new_dictionary(
        UNPROVIDED, UNPROVIDED ) ) ) );
    $template_meta_marker_predicate$ = SubLFiles.deflexical( "*TEMPLATE-META-MARKER-PREDICATE*", $const3$templateMarkerRepresentation );
    $template_category_fill_words$ = SubLFiles.deflexical( "*TEMPLATE-CATEGORY-FILL-WORDS*", maybeDefault( $sym6$_TEMPLATE_CATEGORY_FILL_WORDS_, $template_category_fill_words$, () -> ( dictionary.new_dictionary(
        UNPROVIDED, UNPROVIDED ) ) ) );
    $template_category_fill_word_predicate$ = SubLFiles.deflexical( "*TEMPLATE-CATEGORY-FILL-WORD-PREDICATE*", $const7$templateCategoryFillWord );
    $make_optional_word_list_caching_state$ = SubLFiles.deflexical( "*MAKE-OPTIONAL-WORD-LIST-CACHING-STATE*", NIL );
    $dtp_template_rule$ = SubLFiles.defconstant( "*DTP-TEMPLATE-RULE*", $sym12$TEMPLATE_RULE );
    $template_rule_sxhashing_prime_a$ = SubLFiles.deflexical( "*TEMPLATE-RULE-SXHASHING-PRIME-A*", FIVE_INTEGER );
    $template_rule_sxhashing_prime_b$ = SubLFiles.deflexical( "*TEMPLATE-RULE-SXHASHING-PRIME-B*", SEVEN_INTEGER );
    $use_better_template_rule_sxhashP$ = SubLFiles.deflexical( "*USE-BETTER-TEMPLATE-RULE-SXHASH?*", ( maybeDefault( $sym54$_USE_BETTER_TEMPLATE_RULE_SXHASH__, $use_better_template_rule_sxhashP$, NIL ) ) );
    $template_rule_default_assertion$ = SubLFiles.defparameter( "*TEMPLATE-RULE-DEFAULT-ASSERTION*", NIL );
    $template_rule_default_meaning$ = SubLFiles.defparameter( "*TEMPLATE-RULE-DEFAULT-MEANING*", constants_high.find_constant( $str61$assertTemplate ) );
    $template_rule_isg$ = SubLFiles.deflexical( "*TEMPLATE-RULE-ISG*", maybeDefault( $sym62$_TEMPLATE_RULE_ISG_, $template_rule_isg$, () -> ( integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED,
        UNPROVIDED, UNPROVIDED ) ) ) );
    $cfasl_opcode_template_rule$ = SubLFiles.defconstant( "*CFASL-OPCODE-TEMPLATE-RULE*", $int63$97 );
    $dtp_template_span_item$ = SubLFiles.defconstant( "*DTP-TEMPLATE-SPAN-ITEM*", $sym66$TEMPLATE_SPAN_ITEM );
    $template_terminal_style$ = SubLFiles.defparameter( "*TEMPLATE-TERMINAL-STYLE*", $kw86$STANDARD );
    $block_left_recursive_templates$ = SubLFiles.defparameter( "*BLOCK-LEFT-RECURSIVE-TEMPLATES*", NIL );
    $denotations_of_constant_caching_state$ = SubLFiles.deflexical( "*DENOTATIONS-OF-CONSTANT-CACHING-STATE*", NIL );
    $all_phrases_filter_from_term_phrases_constraint_caching_state$ = SubLFiles.deflexical( "*ALL-PHRASES-FILTER-FROM-TERM-PHRASES-CONSTRAINT-CACHING-STATE*", NIL );
    $rtp_contractions_table$ = SubLFiles.defparameter( "*RTP-CONTRACTIONS-TABLE*", NIL );
    $rtp_rules$ = SubLFiles.deflexical( "*RTP-RULES*", ( maybeDefault( $sym115$_RTP_RULES_, $rtp_rules$, NIL ) ) );
    $rtp_rules_initial_size$ = SubLFiles.deflexical( "*RTP-RULES-INITIAL-SIZE*", $int116$256 );
    $template_rules_master_index$ = SubLFiles.deflexical( "*TEMPLATE-RULES-MASTER-INDEX*", ( maybeDefault( $sym120$_TEMPLATE_RULES_MASTER_INDEX_, $template_rules_master_index$, NIL ) ) );
    $dtp_categorized_template_rule_set$ = SubLFiles.defconstant( "*DTP-CATEGORIZED-TEMPLATE-RULE-SET*", $sym122$CATEGORIZED_TEMPLATE_RULE_SET );
    $assume_empty_associative_memoryP$ = SubLFiles.defparameter( "*ASSUME-EMPTY-ASSOCIATIVE-MEMORY?*", NIL );
    $relevant_template_mts_caching_state$ = SubLFiles.deflexical( "*RELEVANT-TEMPLATE-MTS-CACHING-STATE*", NIL );
    $template_mts$ = SubLFiles.deflexical( "*TEMPLATE-MTS*", ( maybeDefault( $sym160$_TEMPLATE_MTS_, $template_mts$, NIL ) ) );
    $rtp_asserts_initialized_so_far$ = SubLFiles.defparameter( "*RTP-ASSERTS-INITIALIZED-SO-FAR*", ZERO_INTEGER );
    $dtp_rtp_chart_entry$ = SubLFiles.defconstant( "*DTP-RTP-CHART-ENTRY*", $sym190$RTP_CHART_ENTRY );
    $dtp_subconstit$ = SubLFiles.defconstant( "*DTP-SUBCONSTIT*", $sym225$SUBCONSTIT );
    return NIL;
  }

  public static SubLObject setup_rtp_datastructures_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_TEMPLATE_META_MARKER_MAPPINGS_ );
    subl_macro_promotions.declare_defglobal( $sym6$_TEMPLATE_CATEGORY_FILL_WORDS_ );
    memoization_state.note_globally_cached_function( $sym8$MAKE_OPTIONAL_WORD_LIST );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_template_rule$.getGlobalValue(), Symbols.symbol_function( $sym19$TEMPLATE_RULE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list20 );
    Structures.def_csetf( $sym21$TEMPLATE_RULE_CATEGORY, $sym22$_CSETF_TEMPLATE_RULE_CATEGORY );
    Structures.def_csetf( $sym23$TEMPLATE_RULE_TEMPLATE, $sym24$_CSETF_TEMPLATE_RULE_TEMPLATE );
    Structures.def_csetf( $sym25$TEMPLATE_RULE_TRANSFORMATION, $sym26$_CSETF_TEMPLATE_RULE_TRANSFORMATION );
    Structures.def_csetf( $sym27$TEMPLATE_RULE_SEM_TEST, $sym28$_CSETF_TEMPLATE_RULE_SEM_TEST );
    Structures.def_csetf( $sym29$TEMPLATE_RULE_ASSERTION, $sym30$_CSETF_TEMPLATE_RULE_ASSERTION );
    Structures.def_csetf( $sym31$TEMPLATE_RULE_TERMINALS, $sym32$_CSETF_TEMPLATE_RULE_TERMINALS );
    Structures.def_csetf( $sym33$TEMPLATE_RULE_MEANING, $sym34$_CSETF_TEMPLATE_RULE_MEANING );
    Structures.def_csetf( $sym35$TEMPLATE_RULE_CONSTRAINTS, $sym36$_CSETF_TEMPLATE_RULE_CONSTRAINTS );
    Structures.def_csetf( $sym37$TEMPLATE_RULE_ID, $sym38$_CSETF_TEMPLATE_RULE_ID );
    Equality.identity( $sym12$TEMPLATE_RULE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_template_rule$.getGlobalValue(), Symbols.symbol_function( $sym53$VISIT_DEFSTRUCT_OBJECT_TEMPLATE_RULE_METHOD ) );
    subl_macro_promotions.declare_defglobal( $sym54$_USE_BETTER_TEMPLATE_RULE_SXHASH__ );
    Structures.register_method( Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_template_rule$.getGlobalValue(), Symbols.symbol_function( $sym55$SXHASH_TEMPLATE_RULE_METHOD ) );
    subl_macro_promotions.declare_defglobal( $sym62$_TEMPLATE_RULE_ISG_ );
    cfasl.register_cfasl_input_function( $cfasl_opcode_template_rule$.getGlobalValue(), $sym64$CFASL_INPUT_TEMPLATE_RULE );
    Structures.register_method( cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_template_rule$.getGlobalValue(), Symbols.symbol_function( $sym65$CFASL_OUTPUT_OBJECT_TEMPLATE_RULE_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_template_span_item$.getGlobalValue(), Symbols.symbol_function( $sym73$TEMPLATE_SPAN_ITEM_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list74 );
    Structures.def_csetf( $sym75$TEMPLATE_SPAN_ITEM_TEMPLATE_ITEM, $sym76$_CSETF_TEMPLATE_SPAN_ITEM_TEMPLATE_ITEM );
    Structures.def_csetf( $sym77$TEMPLATE_SPAN_ITEM_START, $sym78$_CSETF_TEMPLATE_SPAN_ITEM_START );
    Structures.def_csetf( $sym79$TEMPLATE_SPAN_ITEM_END, $sym80$_CSETF_TEMPLATE_SPAN_ITEM_END );
    Equality.identity( $sym66$TEMPLATE_SPAN_ITEM );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_template_span_item$.getGlobalValue(), Symbols.symbol_function(
        $sym84$VISIT_DEFSTRUCT_OBJECT_TEMPLATE_SPAN_ITEM_METHOD ) );
    memoization_state.note_globally_cached_function( $sym93$DENOTATIONS_OF_CONSTANT );
    memoization_state.note_globally_cached_function( $sym99$ALL_PHRASES_FILTER_FROM_TERM_PHRASES_CONSTRAINT );
    subl_macro_promotions.declare_defglobal( $sym115$_RTP_RULES_ );
    subl_macro_promotions.declare_defglobal( $sym120$_TEMPLATE_RULES_MASTER_INDEX_ );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_categorized_template_rule_set$.getGlobalValue(), Symbols.symbol_function(
        $sym129$CATEGORIZED_TEMPLATE_RULE_SET_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list130 );
    Structures.def_csetf( $sym131$CATEGORIZED_TEMPLATE_RULE_SET_MENTIONS, $sym132$_CSETF_CATEGORIZED_TEMPLATE_RULE_SET_MENTIONS );
    Structures.def_csetf( $sym133$CATEGORIZED_TEMPLATE_RULE_SET_GENERIC, $sym134$_CSETF_CATEGORIZED_TEMPLATE_RULE_SET_GENERIC );
    Structures.def_csetf( $sym135$CATEGORIZED_TEMPLATE_RULE_SET_KEY_TERMINAL, $sym136$_CSETF_CATEGORIZED_TEMPLATE_RULE_SET_KEY_TERMINAL );
    Equality.identity( $sym122$CATEGORIZED_TEMPLATE_RULE_SET );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_categorized_template_rule_set$.getGlobalValue(), Symbols.symbol_function(
        $sym141$VISIT_DEFSTRUCT_OBJECT_CATEGORIZED_TEMPLATE_RULE_SET_METHOD ) );
    memoization_state.note_globally_cached_function( $sym148$RELEVANT_TEMPLATE_MTS );
    subl_macro_promotions.declare_defglobal( $sym160$_TEMPLATE_MTS_ );
    utilities_macros.register_kb_function( $sym186$ADD_TEMPLATE_ASSERTION );
    utilities_macros.register_kb_function( $sym187$REMOVE_TEMPLATE_ASSERTION );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_rtp_chart_entry$.getGlobalValue(), Symbols.symbol_function( $sym197$RTP_CHART_ENTRY_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list198 );
    Structures.def_csetf( $sym199$RTP_CHART_ENTRY_START, $sym200$_CSETF_RTP_CHART_ENTRY_START );
    Structures.def_csetf( $sym201$RTP_CHART_ENTRY_END, $sym202$_CSETF_RTP_CHART_ENTRY_END );
    Structures.def_csetf( $sym203$RTP_CHART_ENTRY_RULE, $sym204$_CSETF_RTP_CHART_ENTRY_RULE );
    Structures.def_csetf( $sym205$RTP_CHART_ENTRY_TEMPLATE_INDEX, $sym206$_CSETF_RTP_CHART_ENTRY_TEMPLATE_INDEX );
    Structures.def_csetf( $sym207$RTP_CHART_ENTRY_WORDS, $sym208$_CSETF_RTP_CHART_ENTRY_WORDS );
    Structures.def_csetf( $sym209$RTP_CHART_ENTRY_BINDINGS, $sym210$_CSETF_RTP_CHART_ENTRY_BINDINGS );
    Structures.def_csetf( $sym211$RTP_CHART_ENTRY_SUBCONSTITS, $sym212$_CSETF_RTP_CHART_ENTRY_SUBCONSTITS );
    Structures.def_csetf( $sym213$RTP_CHART_ENTRY_SEM, $sym214$_CSETF_RTP_CHART_ENTRY_SEM );
    Equality.identity( $sym190$RTP_CHART_ENTRY );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_rtp_chart_entry$.getGlobalValue(), Symbols.symbol_function(
        $sym222$VISIT_DEFSTRUCT_OBJECT_RTP_CHART_ENTRY_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_subconstit$.getGlobalValue(), Symbols.symbol_function( $sym232$SUBCONSTIT_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list233 );
    Structures.def_csetf( $sym234$SUBCONSTIT_CAT, $sym235$_CSETF_SUBCONSTIT_CAT );
    Structures.def_csetf( $sym236$SUBCONSTIT_STRING, $sym237$_CSETF_SUBCONSTIT_STRING );
    Structures.def_csetf( $sym238$SUBCONSTIT_BINDING_VAR, $sym239$_CSETF_SUBCONSTIT_BINDING_VAR );
    Structures.def_csetf( $sym240$SUBCONSTIT_START, $sym241$_CSETF_SUBCONSTIT_START );
    Structures.def_csetf( $sym242$SUBCONSTIT_END, $sym243$_CSETF_SUBCONSTIT_END );
    Structures.def_csetf( $sym244$SUBCONSTIT_SEM_TEST, $sym245$_CSETF_SUBCONSTIT_SEM_TEST );
    Equality.identity( $sym225$SUBCONSTIT );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_subconstit$.getGlobalValue(), Symbols.symbol_function( $sym250$VISIT_DEFSTRUCT_OBJECT_SUBCONSTIT_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_rtp_datastructures_file();
  }

  @Override
  public void initializeVariables()
  {
    init_rtp_datastructures_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_rtp_datastructures_file();
  }
  static
  {
    me = new rtp_datastructures();
    $print_rule_abbreviated$ = null;
    $template_meta_marker_mappings$ = null;
    $template_meta_marker_predicate$ = null;
    $template_category_fill_words$ = null;
    $template_category_fill_word_predicate$ = null;
    $make_optional_word_list_caching_state$ = null;
    $dtp_template_rule$ = null;
    $template_rule_sxhashing_prime_a$ = null;
    $template_rule_sxhashing_prime_b$ = null;
    $use_better_template_rule_sxhashP$ = null;
    $template_rule_default_assertion$ = null;
    $template_rule_default_meaning$ = null;
    $template_rule_isg$ = null;
    $cfasl_opcode_template_rule$ = null;
    $dtp_template_span_item$ = null;
    $template_terminal_style$ = null;
    $block_left_recursive_templates$ = null;
    $denotations_of_constant_caching_state$ = null;
    $all_phrases_filter_from_term_phrases_constraint_caching_state$ = null;
    $rtp_contractions_table$ = null;
    $rtp_rules$ = null;
    $rtp_rules_initial_size$ = null;
    $template_rules_master_index$ = null;
    $dtp_categorized_template_rule_set$ = null;
    $assume_empty_associative_memoryP$ = null;
    $relevant_template_mts_caching_state$ = null;
    $template_mts$ = null;
    $rtp_asserts_initialized_so_far$ = null;
    $dtp_rtp_chart_entry$ = null;
    $dtp_subconstit$ = null;
    $sym0$_TEMPLATE_META_MARKER_MAPPINGS_ = makeSymbol( "*TEMPLATE-META-MARKER-MAPPINGS*" );
    $sym1$FORT_P = makeSymbol( "FORT-P" );
    $sym2$STRINGP = makeSymbol( "STRINGP" );
    $const3$templateMarkerRepresentation = constant_handles.reader_make_constant_shell( makeString( "templateMarkerRepresentation" ) );
    $sym4$RELEVANT_MT_IS_EQ = makeSymbol( "RELEVANT-MT-IS-EQ" );
    $kw5$GAF = makeKeyword( "GAF" );
    $sym6$_TEMPLATE_CATEGORY_FILL_WORDS_ = makeSymbol( "*TEMPLATE-CATEGORY-FILL-WORDS*" );
    $const7$templateCategoryFillWord = constant_handles.reader_make_constant_shell( makeString( "templateCategoryFillWord" ) );
    $sym8$MAKE_OPTIONAL_WORD_LIST = makeSymbol( "MAKE-OPTIONAL-WORD-LIST" );
    $const9$OptionalSome = constant_handles.reader_make_constant_shell( makeString( "OptionalSome" ) );
    $sym10$_MAKE_OPTIONAL_WORD_LIST_CACHING_STATE_ = makeSymbol( "*MAKE-OPTIONAL-WORD-LIST-CACHING-STATE*" );
    $int11$64 = makeInteger( 64 );
    $sym12$TEMPLATE_RULE = makeSymbol( "TEMPLATE-RULE" );
    $sym13$TEMPLATE_RULE_P = makeSymbol( "TEMPLATE-RULE-P" );
    $list14 = ConsesLow.list( new SubLObject[] { makeSymbol( "CATEGORY" ), makeSymbol( "TEMPLATE" ), makeSymbol( "TRANSFORMATION" ), makeSymbol( "SEM-TEST" ), makeSymbol( "ASSERTION" ), makeSymbol( "TERMINALS" ),
      makeSymbol( "MEANING" ), makeSymbol( "CONSTRAINTS" ), makeSymbol( "ID" )
    } );
    $list15 = ConsesLow.list( new SubLObject[] { makeKeyword( "CATEGORY" ), makeKeyword( "TEMPLATE" ), makeKeyword( "TRANSFORMATION" ), makeKeyword( "SEM-TEST" ), makeKeyword( "ASSERTION" ), makeKeyword( "TERMINALS" ),
      makeKeyword( "MEANING" ), makeKeyword( "CONSTRAINTS" ), makeKeyword( "ID" )
    } );
    $list16 = ConsesLow.list( new SubLObject[] { makeSymbol( "TEMPLATE-RULE-CATEGORY" ), makeSymbol( "TEMPLATE-RULE-TEMPLATE" ), makeSymbol( "TEMPLATE-RULE-TRANSFORMATION" ), makeSymbol( "TEMPLATE-RULE-SEM-TEST" ),
      makeSymbol( "TEMPLATE-RULE-ASSERTION" ), makeSymbol( "TEMPLATE-RULE-TERMINALS" ), makeSymbol( "TEMPLATE-RULE-MEANING" ), makeSymbol( "TEMPLATE-RULE-CONSTRAINTS" ), makeSymbol( "TEMPLATE-RULE-ID" )
    } );
    $list17 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-TEMPLATE-RULE-CATEGORY" ), makeSymbol( "_CSETF-TEMPLATE-RULE-TEMPLATE" ), makeSymbol( "_CSETF-TEMPLATE-RULE-TRANSFORMATION" ), makeSymbol(
        "_CSETF-TEMPLATE-RULE-SEM-TEST" ), makeSymbol( "_CSETF-TEMPLATE-RULE-ASSERTION" ), makeSymbol( "_CSETF-TEMPLATE-RULE-TERMINALS" ), makeSymbol( "_CSETF-TEMPLATE-RULE-MEANING" ), makeSymbol(
            "_CSETF-TEMPLATE-RULE-CONSTRAINTS" ), makeSymbol( "_CSETF-TEMPLATE-RULE-ID" )
    } );
    $sym18$PRINT_TEMPLATE_RULE = makeSymbol( "PRINT-TEMPLATE-RULE" );
    $sym19$TEMPLATE_RULE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "TEMPLATE-RULE-PRINT-FUNCTION-TRAMPOLINE" );
    $list20 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "TEMPLATE-RULE-P" ) );
    $sym21$TEMPLATE_RULE_CATEGORY = makeSymbol( "TEMPLATE-RULE-CATEGORY" );
    $sym22$_CSETF_TEMPLATE_RULE_CATEGORY = makeSymbol( "_CSETF-TEMPLATE-RULE-CATEGORY" );
    $sym23$TEMPLATE_RULE_TEMPLATE = makeSymbol( "TEMPLATE-RULE-TEMPLATE" );
    $sym24$_CSETF_TEMPLATE_RULE_TEMPLATE = makeSymbol( "_CSETF-TEMPLATE-RULE-TEMPLATE" );
    $sym25$TEMPLATE_RULE_TRANSFORMATION = makeSymbol( "TEMPLATE-RULE-TRANSFORMATION" );
    $sym26$_CSETF_TEMPLATE_RULE_TRANSFORMATION = makeSymbol( "_CSETF-TEMPLATE-RULE-TRANSFORMATION" );
    $sym27$TEMPLATE_RULE_SEM_TEST = makeSymbol( "TEMPLATE-RULE-SEM-TEST" );
    $sym28$_CSETF_TEMPLATE_RULE_SEM_TEST = makeSymbol( "_CSETF-TEMPLATE-RULE-SEM-TEST" );
    $sym29$TEMPLATE_RULE_ASSERTION = makeSymbol( "TEMPLATE-RULE-ASSERTION" );
    $sym30$_CSETF_TEMPLATE_RULE_ASSERTION = makeSymbol( "_CSETF-TEMPLATE-RULE-ASSERTION" );
    $sym31$TEMPLATE_RULE_TERMINALS = makeSymbol( "TEMPLATE-RULE-TERMINALS" );
    $sym32$_CSETF_TEMPLATE_RULE_TERMINALS = makeSymbol( "_CSETF-TEMPLATE-RULE-TERMINALS" );
    $sym33$TEMPLATE_RULE_MEANING = makeSymbol( "TEMPLATE-RULE-MEANING" );
    $sym34$_CSETF_TEMPLATE_RULE_MEANING = makeSymbol( "_CSETF-TEMPLATE-RULE-MEANING" );
    $sym35$TEMPLATE_RULE_CONSTRAINTS = makeSymbol( "TEMPLATE-RULE-CONSTRAINTS" );
    $sym36$_CSETF_TEMPLATE_RULE_CONSTRAINTS = makeSymbol( "_CSETF-TEMPLATE-RULE-CONSTRAINTS" );
    $sym37$TEMPLATE_RULE_ID = makeSymbol( "TEMPLATE-RULE-ID" );
    $sym38$_CSETF_TEMPLATE_RULE_ID = makeSymbol( "_CSETF-TEMPLATE-RULE-ID" );
    $kw39$CATEGORY = makeKeyword( "CATEGORY" );
    $kw40$TEMPLATE = makeKeyword( "TEMPLATE" );
    $kw41$TRANSFORMATION = makeKeyword( "TRANSFORMATION" );
    $kw42$SEM_TEST = makeKeyword( "SEM-TEST" );
    $kw43$ASSERTION = makeKeyword( "ASSERTION" );
    $kw44$TERMINALS = makeKeyword( "TERMINALS" );
    $kw45$MEANING = makeKeyword( "MEANING" );
    $kw46$CONSTRAINTS = makeKeyword( "CONSTRAINTS" );
    $kw47$ID = makeKeyword( "ID" );
    $str48$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw49$BEGIN = makeKeyword( "BEGIN" );
    $sym50$MAKE_TEMPLATE_RULE = makeSymbol( "MAKE-TEMPLATE-RULE" );
    $kw51$SLOT = makeKeyword( "SLOT" );
    $kw52$END = makeKeyword( "END" );
    $sym53$VISIT_DEFSTRUCT_OBJECT_TEMPLATE_RULE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-TEMPLATE-RULE-METHOD" );
    $sym54$_USE_BETTER_TEMPLATE_RULE_SXHASH__ = makeSymbol( "*USE-BETTER-TEMPLATE-RULE-SXHASH?*" );
    $sym55$SXHASH_TEMPLATE_RULE_METHOD = makeSymbol( "SXHASH-TEMPLATE-RULE-METHOD" );
    $str56$__A_for__S____from_Assertion__S__ = makeString( "[~A for ~S~%  from Assertion ~S: ~% => ~S" );
    $str57$___Subject_to_test__S = makeString( "~% Subject to test ~S" );
    $str58$___Augmented_Template___S = makeString( "~% Augmented Template: ~S" );
    $str59$___Term___S____Const___S = makeString( "~% Term: ~S ~% Const: ~S" );
    $str60$___ = makeString( "]~%" );
    $str61$assertTemplate = makeString( "assertTemplate" );
    $sym62$_TEMPLATE_RULE_ISG_ = makeSymbol( "*TEMPLATE-RULE-ISG*" );
    $int63$97 = makeInteger( 97 );
    $sym64$CFASL_INPUT_TEMPLATE_RULE = makeSymbol( "CFASL-INPUT-TEMPLATE-RULE" );
    $sym65$CFASL_OUTPUT_OBJECT_TEMPLATE_RULE_METHOD = makeSymbol( "CFASL-OUTPUT-OBJECT-TEMPLATE-RULE-METHOD" );
    $sym66$TEMPLATE_SPAN_ITEM = makeSymbol( "TEMPLATE-SPAN-ITEM" );
    $sym67$TEMPLATE_SPAN_ITEM_P = makeSymbol( "TEMPLATE-SPAN-ITEM-P" );
    $list68 = ConsesLow.list( makeSymbol( "TEMPLATE-ITEM" ), makeSymbol( "START" ), makeSymbol( "END" ) );
    $list69 = ConsesLow.list( makeKeyword( "TEMPLATE-ITEM" ), makeKeyword( "START" ), makeKeyword( "END" ) );
    $list70 = ConsesLow.list( makeSymbol( "TEMPLATE-SPAN-ITEM-TEMPLATE-ITEM" ), makeSymbol( "TEMPLATE-SPAN-ITEM-START" ), makeSymbol( "TEMPLATE-SPAN-ITEM-END" ) );
    $list71 = ConsesLow.list( makeSymbol( "_CSETF-TEMPLATE-SPAN-ITEM-TEMPLATE-ITEM" ), makeSymbol( "_CSETF-TEMPLATE-SPAN-ITEM-START" ), makeSymbol( "_CSETF-TEMPLATE-SPAN-ITEM-END" ) );
    $sym72$PRINT_TEMPLATE_SPAN_ITEM = makeSymbol( "PRINT-TEMPLATE-SPAN-ITEM" );
    $sym73$TEMPLATE_SPAN_ITEM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "TEMPLATE-SPAN-ITEM-PRINT-FUNCTION-TRAMPOLINE" );
    $list74 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "TEMPLATE-SPAN-ITEM-P" ) );
    $sym75$TEMPLATE_SPAN_ITEM_TEMPLATE_ITEM = makeSymbol( "TEMPLATE-SPAN-ITEM-TEMPLATE-ITEM" );
    $sym76$_CSETF_TEMPLATE_SPAN_ITEM_TEMPLATE_ITEM = makeSymbol( "_CSETF-TEMPLATE-SPAN-ITEM-TEMPLATE-ITEM" );
    $sym77$TEMPLATE_SPAN_ITEM_START = makeSymbol( "TEMPLATE-SPAN-ITEM-START" );
    $sym78$_CSETF_TEMPLATE_SPAN_ITEM_START = makeSymbol( "_CSETF-TEMPLATE-SPAN-ITEM-START" );
    $sym79$TEMPLATE_SPAN_ITEM_END = makeSymbol( "TEMPLATE-SPAN-ITEM-END" );
    $sym80$_CSETF_TEMPLATE_SPAN_ITEM_END = makeSymbol( "_CSETF-TEMPLATE-SPAN-ITEM-END" );
    $kw81$TEMPLATE_ITEM = makeKeyword( "TEMPLATE-ITEM" );
    $kw82$START = makeKeyword( "START" );
    $sym83$MAKE_TEMPLATE_SPAN_ITEM = makeSymbol( "MAKE-TEMPLATE-SPAN-ITEM" );
    $sym84$VISIT_DEFSTRUCT_OBJECT_TEMPLATE_SPAN_ITEM_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-TEMPLATE-SPAN-ITEM-METHOD" );
    $str85$__S__S__S_ = makeString( "<~S ~S ~S>" );
    $kw86$STANDARD = makeKeyword( "STANDARD" );
    $const87$RequireOne = constant_handles.reader_make_constant_shell( makeString( "RequireOne" ) );
    $sym88$EXPAND_WORD_ITEMS_IN_LIST = makeSymbol( "EXPAND-WORD-ITEMS-IN-LIST" );
    $str89$_ = makeString( " " );
    $const90$WordSequence = constant_handles.reader_make_constant_shell( makeString( "WordSequence" ) );
    $kw91$RECURSIVE_TEMPLATE = makeKeyword( "RECURSIVE-TEMPLATE" );
    $str92$Left_recursive_template___S__ = makeString( "Left-recursive template~%~S~%" );
    $sym93$DENOTATIONS_OF_CONSTANT = makeSymbol( "DENOTATIONS-OF-CONSTANT" );
    $list94 = ConsesLow.list( makeKeyword( "ABBREVS" ), makeKeyword( "ACRONYMS" ) );
    $kw95$TEXT = makeKeyword( "TEXT" );
    $sym96$_DENOTATIONS_OF_CONSTANT_CACHING_STATE_ = makeSymbol( "*DENOTATIONS-OF-CONSTANT-CACHING-STATE*" );
    $int97$1024 = makeInteger( 1024 );
    $kw98$ALL = makeKeyword( "ALL" );
    $sym99$ALL_PHRASES_FILTER_FROM_TERM_PHRASES_CONSTRAINT = makeSymbol( "ALL-PHRASES-FILTER-FROM-TERM-PHRASES-CONSTRAINT" );
    $const100$CollectionLexificationPredicate_R = constant_handles.reader_make_constant_shell( makeString( "CollectionLexificationPredicate-Required" ) );
    $sym101$_ALL_PHRASES_FILTER_FROM_TERM_PHRASES_CONSTRAINT_CACHING_STATE_ = makeSymbol( "*ALL-PHRASES-FILTER-FROM-TERM-PHRASES-CONSTRAINT-CACHING-STATE*" );
    $int102$200 = makeInteger( 200 );
    $list103 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "RequireOne" ) ) );
    $list104 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "WordSequence" ) ) );
    $const105$contractedFormOfWord = constant_handles.reader_make_constant_shell( makeString( "contractedFormOfWord" ) );
    $sym106$_FULL_WORD = makeSymbol( "?FULL-WORD" );
    $sym107$_FORM = makeSymbol( "?FORM" );
    $const108$partOfSpeech = constant_handles.reader_make_constant_shell( makeString( "partOfSpeech" ) );
    $list109 = ConsesLow.list( makeSymbol( "?FORM" ) );
    $sym110$_WORD = makeSymbol( "?WORD" );
    $const111$posForms = constant_handles.reader_make_constant_shell( makeString( "posForms" ) );
    $list112 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Modal-Contracted" ) ), constant_handles.reader_make_constant_shell( makeString( "Verb-Contracted" ) ) );
    $sym113$STRING_EQUAL = makeSymbol( "STRING-EQUAL" );
    $kw114$COMPLETE = makeKeyword( "COMPLETE" );
    $sym115$_RTP_RULES_ = makeSymbol( "*RTP-RULES*" );
    $int116$256 = makeInteger( 256 );
    $kw117$CLEARED = makeKeyword( "CLEARED" );
    $int118$500 = makeInteger( 500 );
    $kw119$ADDED = makeKeyword( "ADDED" );
    $sym120$_TEMPLATE_RULES_MASTER_INDEX_ = makeSymbol( "*TEMPLATE-RULES-MASTER-INDEX*" );
    $kw121$ENSURED = makeKeyword( "ENSURED" );
    $sym122$CATEGORIZED_TEMPLATE_RULE_SET = makeSymbol( "CATEGORIZED-TEMPLATE-RULE-SET" );
    $sym123$CATEGORIZED_TEMPLATE_RULE_SET_P = makeSymbol( "CATEGORIZED-TEMPLATE-RULE-SET-P" );
    $list124 = ConsesLow.list( makeSymbol( "MENTIONS" ), makeSymbol( "GENERIC" ), makeSymbol( "KEY-TERMINAL" ) );
    $list125 = ConsesLow.list( makeKeyword( "MENTIONS" ), makeKeyword( "GENERIC" ), makeKeyword( "KEY-TERMINAL" ) );
    $list126 = ConsesLow.list( makeSymbol( "CATEGORIZED-TEMPLATE-RULE-SET-MENTIONS" ), makeSymbol( "CATEGORIZED-TEMPLATE-RULE-SET-GENERIC" ), makeSymbol( "CATEGORIZED-TEMPLATE-RULE-SET-KEY-TERMINAL" ) );
    $list127 = ConsesLow.list( makeSymbol( "_CSETF-CATEGORIZED-TEMPLATE-RULE-SET-MENTIONS" ), makeSymbol( "_CSETF-CATEGORIZED-TEMPLATE-RULE-SET-GENERIC" ), makeSymbol(
        "_CSETF-CATEGORIZED-TEMPLATE-RULE-SET-KEY-TERMINAL" ) );
    $sym128$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym129$CATEGORIZED_TEMPLATE_RULE_SET_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "CATEGORIZED-TEMPLATE-RULE-SET-PRINT-FUNCTION-TRAMPOLINE" );
    $list130 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "CATEGORIZED-TEMPLATE-RULE-SET-P" ) );
    $sym131$CATEGORIZED_TEMPLATE_RULE_SET_MENTIONS = makeSymbol( "CATEGORIZED-TEMPLATE-RULE-SET-MENTIONS" );
    $sym132$_CSETF_CATEGORIZED_TEMPLATE_RULE_SET_MENTIONS = makeSymbol( "_CSETF-CATEGORIZED-TEMPLATE-RULE-SET-MENTIONS" );
    $sym133$CATEGORIZED_TEMPLATE_RULE_SET_GENERIC = makeSymbol( "CATEGORIZED-TEMPLATE-RULE-SET-GENERIC" );
    $sym134$_CSETF_CATEGORIZED_TEMPLATE_RULE_SET_GENERIC = makeSymbol( "_CSETF-CATEGORIZED-TEMPLATE-RULE-SET-GENERIC" );
    $sym135$CATEGORIZED_TEMPLATE_RULE_SET_KEY_TERMINAL = makeSymbol( "CATEGORIZED-TEMPLATE-RULE-SET-KEY-TERMINAL" );
    $sym136$_CSETF_CATEGORIZED_TEMPLATE_RULE_SET_KEY_TERMINAL = makeSymbol( "_CSETF-CATEGORIZED-TEMPLATE-RULE-SET-KEY-TERMINAL" );
    $kw137$MENTIONS = makeKeyword( "MENTIONS" );
    $kw138$GENERIC = makeKeyword( "GENERIC" );
    $kw139$KEY_TERMINAL = makeKeyword( "KEY-TERMINAL" );
    $sym140$MAKE_CATEGORIZED_TEMPLATE_RULE_SET = makeSymbol( "MAKE-CATEGORIZED-TEMPLATE-RULE-SET" );
    $sym141$VISIT_DEFSTRUCT_OBJECT_CATEGORIZED_TEMPLATE_RULE_SET_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-CATEGORIZED-TEMPLATE-RULE-SET-METHOD" );
    $list142 = ConsesLow.list( ConsesLow.list( makeSymbol( "TP-RULE-VAR" ), makeSymbol( "MT" ), makeSymbol( "CATEGORY" ), makeSymbol( "TERMINAL" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym143$CURRENT_MT = makeUninternedSymbol( "CURRENT-MT" );
    $sym144$CURRENT_RULE = makeUninternedSymbol( "CURRENT-RULE" );
    $sym145$MENTIONS = makeUninternedSymbol( "MENTIONS" );
    $sym146$TEMPLATES = makeUninternedSymbol( "TEMPLATES" );
    $sym147$CDOLIST = makeSymbol( "CDOLIST" );
    $sym148$RELEVANT_TEMPLATE_MTS = makeSymbol( "RELEVANT-TEMPLATE-MTS" );
    $sym149$CLET = makeSymbol( "CLET" );
    $sym150$GET_CATEGORIZED_TEMPLATE_RULE_SET = makeSymbol( "GET-CATEGORIZED-TEMPLATE-RULE-SET" );
    $sym151$PWHEN = makeSymbol( "PWHEN" );
    $sym152$HASH_TABLE_P = makeSymbol( "HASH-TABLE-P" );
    $sym153$GETHASH_WITHOUT_VALUES = makeSymbol( "GETHASH-WITHOUT-VALUES" );
    $sym154$DICTIONARY_P = makeSymbol( "DICTIONARY-P" );
    $sym155$DO_DICTIONARY_KEYS = makeSymbol( "DO-DICTIONARY-KEYS" );
    $list156 = ConsesLow.list( ConsesLow.list( makeSymbol( "*ASSUME-EMPTY-ASSOCIATIVE-MEMORY?*" ), T ) );
    $sym157$_RELEVANT_TEMPLATE_MTS_CACHING_STATE_ = makeSymbol( "*RELEVANT-TEMPLATE-MTS-CACHING-STATE*" );
    $int158$128 = makeInteger( 128 );
    $sym159$CLEAR_RELEVANT_TEMPLATE_MTS = makeSymbol( "CLEAR-RELEVANT-TEMPLATE-MTS" );
    $sym160$_TEMPLATE_MTS_ = makeSymbol( "*TEMPLATE-MTS*" );
    $const161$TemplateParsingMt = constant_handles.reader_make_constant_shell( makeString( "TemplateParsingMt" ) );
    $sym162$STRING_ = makeSymbol( "STRING<" );
    $const163$ParseTemplatePredicate = constant_handles.reader_make_constant_shell( makeString( "ParseTemplatePredicate" ) );
    $const164$TemplateParsingMicrotheory = constant_handles.reader_make_constant_shell( makeString( "TemplateParsingMicrotheory" ) );
    $list165 = ConsesLow.cons( makeSymbol( "TEMPLATE-PRED" ), makeSymbol( "TEMPLATE-CATEGORIES" ) );
    $str166$Gathering_Template_Parsing_Assert = makeString( "Gathering Template Parsing Assertions from " );
    $str167$_mts__ = makeString( " mts (" );
    $str168$_total_ = makeString( " total)" );
    $kw169$NEW = makeKeyword( "NEW" );
    $const170$CyclishParaphraseMt = constant_handles.reader_make_constant_shell( makeString( "CyclishParaphraseMt" ) );
    $const171$DataForNLMt = constant_handles.reader_make_constant_shell( makeString( "DataForNLMt" ) );
    $const172$ExpandSubLFn = constant_handles.reader_make_constant_shell( makeString( "ExpandSubLFn" ) );
    $const173$SubLQuoteFn = constant_handles.reader_make_constant_shell( makeString( "SubLQuoteFn" ) );
    $str174$Assertion__D_specifies_a_left_rec = makeString( "Assertion ~D specifies a left-recursive template~% ~S~%" );
    $const175$NLPatternList = constant_handles.reader_make_constant_shell( makeString( "NLPatternList" ) );
    $const176$NLPattern_Word = constant_handles.reader_make_constant_shell( makeString( "NLPattern-Word" ) );
    $const177$NLPattern_Template = constant_handles.reader_make_constant_shell( makeString( "NLPattern-Template" ) );
    $const178$NLParsingSlot = constant_handles.reader_make_constant_shell( makeString( "NLParsingSlot" ) );
    $const179$NLPattern_Term_Optional = constant_handles.reader_make_constant_shell( makeString( "NLPattern-Term-Optional" ) );
    $const180$OptionalOne = constant_handles.reader_make_constant_shell( makeString( "OptionalOne" ) );
    $const181$NLPattern_Exact = constant_handles.reader_make_constant_shell( makeString( "NLPattern-Exact" ) );
    $kw182$IGNORE = makeKeyword( "IGNORE" );
    $list183 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NLPattern-Agr" ) ), constant_handles.reader_make_constant_shell( makeString( "NLPattern-POS" ) ) );
    $const184$TemplateParsingSyntacticConstrain = constant_handles.reader_make_constant_shell( makeString( "TemplateParsingSyntacticConstraint" ) );
    $str185$Strange_template_assertion__S_wit = makeString( "Strange template assertion ~S with argument ~S ignored.~%" );
    $sym186$ADD_TEMPLATE_ASSERTION = makeSymbol( "ADD-TEMPLATE-ASSERTION" );
    $sym187$REMOVE_TEMPLATE_ASSERTION = makeSymbol( "REMOVE-TEMPLATE-ASSERTION" );
    $kw188$ASSERTED_TRUE_DEF = makeKeyword( "ASSERTED-TRUE-DEF" );
    $kw189$ASSERTED_TRUE_MON = makeKeyword( "ASSERTED-TRUE-MON" );
    $sym190$RTP_CHART_ENTRY = makeSymbol( "RTP-CHART-ENTRY" );
    $sym191$RTP_CHART_ENTRY_P = makeSymbol( "RTP-CHART-ENTRY-P" );
    $list192 = ConsesLow.list( makeSymbol( "START" ), makeSymbol( "END" ), makeSymbol( "RULE" ), makeSymbol( "TEMPLATE-INDEX" ), makeSymbol( "WORDS" ), makeSymbol( "BINDINGS" ), makeSymbol( "SUBCONSTITS" ), makeSymbol(
        "SEM" ) );
    $list193 = ConsesLow.list( makeKeyword( "START" ), makeKeyword( "END" ), makeKeyword( "RULE" ), makeKeyword( "TEMPLATE-INDEX" ), makeKeyword( "WORDS" ), makeKeyword( "BINDINGS" ), makeKeyword( "SUBCONSTITS" ),
        makeKeyword( "SEM" ) );
    $list194 = ConsesLow.list( makeSymbol( "RTP-CHART-ENTRY-START" ), makeSymbol( "RTP-CHART-ENTRY-END" ), makeSymbol( "RTP-CHART-ENTRY-RULE" ), makeSymbol( "RTP-CHART-ENTRY-TEMPLATE-INDEX" ), makeSymbol(
        "RTP-CHART-ENTRY-WORDS" ), makeSymbol( "RTP-CHART-ENTRY-BINDINGS" ), makeSymbol( "RTP-CHART-ENTRY-SUBCONSTITS" ), makeSymbol( "RTP-CHART-ENTRY-SEM" ) );
    $list195 = ConsesLow.list( makeSymbol( "_CSETF-RTP-CHART-ENTRY-START" ), makeSymbol( "_CSETF-RTP-CHART-ENTRY-END" ), makeSymbol( "_CSETF-RTP-CHART-ENTRY-RULE" ), makeSymbol( "_CSETF-RTP-CHART-ENTRY-TEMPLATE-INDEX" ),
        makeSymbol( "_CSETF-RTP-CHART-ENTRY-WORDS" ), makeSymbol( "_CSETF-RTP-CHART-ENTRY-BINDINGS" ), makeSymbol( "_CSETF-RTP-CHART-ENTRY-SUBCONSTITS" ), makeSymbol( "_CSETF-RTP-CHART-ENTRY-SEM" ) );
    $sym196$RTP_ENTRY_PRINT = makeSymbol( "RTP-ENTRY-PRINT" );
    $sym197$RTP_CHART_ENTRY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "RTP-CHART-ENTRY-PRINT-FUNCTION-TRAMPOLINE" );
    $list198 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "RTP-CHART-ENTRY-P" ) );
    $sym199$RTP_CHART_ENTRY_START = makeSymbol( "RTP-CHART-ENTRY-START" );
    $sym200$_CSETF_RTP_CHART_ENTRY_START = makeSymbol( "_CSETF-RTP-CHART-ENTRY-START" );
    $sym201$RTP_CHART_ENTRY_END = makeSymbol( "RTP-CHART-ENTRY-END" );
    $sym202$_CSETF_RTP_CHART_ENTRY_END = makeSymbol( "_CSETF-RTP-CHART-ENTRY-END" );
    $sym203$RTP_CHART_ENTRY_RULE = makeSymbol( "RTP-CHART-ENTRY-RULE" );
    $sym204$_CSETF_RTP_CHART_ENTRY_RULE = makeSymbol( "_CSETF-RTP-CHART-ENTRY-RULE" );
    $sym205$RTP_CHART_ENTRY_TEMPLATE_INDEX = makeSymbol( "RTP-CHART-ENTRY-TEMPLATE-INDEX" );
    $sym206$_CSETF_RTP_CHART_ENTRY_TEMPLATE_INDEX = makeSymbol( "_CSETF-RTP-CHART-ENTRY-TEMPLATE-INDEX" );
    $sym207$RTP_CHART_ENTRY_WORDS = makeSymbol( "RTP-CHART-ENTRY-WORDS" );
    $sym208$_CSETF_RTP_CHART_ENTRY_WORDS = makeSymbol( "_CSETF-RTP-CHART-ENTRY-WORDS" );
    $sym209$RTP_CHART_ENTRY_BINDINGS = makeSymbol( "RTP-CHART-ENTRY-BINDINGS" );
    $sym210$_CSETF_RTP_CHART_ENTRY_BINDINGS = makeSymbol( "_CSETF-RTP-CHART-ENTRY-BINDINGS" );
    $sym211$RTP_CHART_ENTRY_SUBCONSTITS = makeSymbol( "RTP-CHART-ENTRY-SUBCONSTITS" );
    $sym212$_CSETF_RTP_CHART_ENTRY_SUBCONSTITS = makeSymbol( "_CSETF-RTP-CHART-ENTRY-SUBCONSTITS" );
    $sym213$RTP_CHART_ENTRY_SEM = makeSymbol( "RTP-CHART-ENTRY-SEM" );
    $sym214$_CSETF_RTP_CHART_ENTRY_SEM = makeSymbol( "_CSETF-RTP-CHART-ENTRY-SEM" );
    $kw215$RULE = makeKeyword( "RULE" );
    $kw216$TEMPLATE_INDEX = makeKeyword( "TEMPLATE-INDEX" );
    $kw217$WORDS = makeKeyword( "WORDS" );
    $kw218$BINDINGS = makeKeyword( "BINDINGS" );
    $kw219$SUBCONSTITS = makeKeyword( "SUBCONSTITS" );
    $kw220$SEM = makeKeyword( "SEM" );
    $sym221$MAKE_RTP_CHART_ENTRY = makeSymbol( "MAKE-RTP-CHART-ENTRY" );
    $sym222$VISIT_DEFSTRUCT_OBJECT_RTP_CHART_ENTRY_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-RTP-CHART-ENTRY-METHOD" );
    $str223$__RTP_entry______Words__S_____Sem = makeString( "#<RTP-entry: ~%  Words=~S ~%  Sem=~S~%   Bindings=~S~%   Subconstits=~S~%  Template=~S~%  Template-index=~S~%  Start=~A~% :RTP-Entry>" );
    $const224$semanticTest = constant_handles.reader_make_constant_shell( makeString( "semanticTest" ) );
    $sym225$SUBCONSTIT = makeSymbol( "SUBCONSTIT" );
    $sym226$SUBCONSTIT_P = makeSymbol( "SUBCONSTIT-P" );
    $list227 = ConsesLow.list( makeSymbol( "CAT" ), makeSymbol( "STRING" ), makeSymbol( "BINDING-VAR" ), makeSymbol( "START" ), makeSymbol( "END" ), makeSymbol( "SEM-TEST" ) );
    $list228 = ConsesLow.list( makeKeyword( "CAT" ), makeKeyword( "STRING" ), makeKeyword( "BINDING-VAR" ), makeKeyword( "START" ), makeKeyword( "END" ), makeKeyword( "SEM-TEST" ) );
    $list229 = ConsesLow.list( makeSymbol( "SUBCONSTIT-CAT" ), makeSymbol( "SUBCONSTIT-STRING" ), makeSymbol( "SUBCONSTIT-BINDING-VAR" ), makeSymbol( "SUBCONSTIT-START" ), makeSymbol( "SUBCONSTIT-END" ), makeSymbol(
        "SUBCONSTIT-SEM-TEST" ) );
    $list230 = ConsesLow.list( makeSymbol( "_CSETF-SUBCONSTIT-CAT" ), makeSymbol( "_CSETF-SUBCONSTIT-STRING" ), makeSymbol( "_CSETF-SUBCONSTIT-BINDING-VAR" ), makeSymbol( "_CSETF-SUBCONSTIT-START" ), makeSymbol(
        "_CSETF-SUBCONSTIT-END" ), makeSymbol( "_CSETF-SUBCONSTIT-SEM-TEST" ) );
    $sym231$PRINT_SUBCONSTIT = makeSymbol( "PRINT-SUBCONSTIT" );
    $sym232$SUBCONSTIT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "SUBCONSTIT-PRINT-FUNCTION-TRAMPOLINE" );
    $list233 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "SUBCONSTIT-P" ) );
    $sym234$SUBCONSTIT_CAT = makeSymbol( "SUBCONSTIT-CAT" );
    $sym235$_CSETF_SUBCONSTIT_CAT = makeSymbol( "_CSETF-SUBCONSTIT-CAT" );
    $sym236$SUBCONSTIT_STRING = makeSymbol( "SUBCONSTIT-STRING" );
    $sym237$_CSETF_SUBCONSTIT_STRING = makeSymbol( "_CSETF-SUBCONSTIT-STRING" );
    $sym238$SUBCONSTIT_BINDING_VAR = makeSymbol( "SUBCONSTIT-BINDING-VAR" );
    $sym239$_CSETF_SUBCONSTIT_BINDING_VAR = makeSymbol( "_CSETF-SUBCONSTIT-BINDING-VAR" );
    $sym240$SUBCONSTIT_START = makeSymbol( "SUBCONSTIT-START" );
    $sym241$_CSETF_SUBCONSTIT_START = makeSymbol( "_CSETF-SUBCONSTIT-START" );
    $sym242$SUBCONSTIT_END = makeSymbol( "SUBCONSTIT-END" );
    $sym243$_CSETF_SUBCONSTIT_END = makeSymbol( "_CSETF-SUBCONSTIT-END" );
    $sym244$SUBCONSTIT_SEM_TEST = makeSymbol( "SUBCONSTIT-SEM-TEST" );
    $sym245$_CSETF_SUBCONSTIT_SEM_TEST = makeSymbol( "_CSETF-SUBCONSTIT-SEM-TEST" );
    $kw246$CAT = makeKeyword( "CAT" );
    $kw247$STRING = makeKeyword( "STRING" );
    $kw248$BINDING_VAR = makeKeyword( "BINDING-VAR" );
    $sym249$MAKE_SUBCONSTIT = makeSymbol( "MAKE-SUBCONSTIT" );
    $sym250$VISIT_DEFSTRUCT_OBJECT_SUBCONSTIT_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-SUBCONSTIT-METHOD" );
    $str251$__Subconst__S_of_cat__S_ = makeString( "<#Subconst ~S of cat ~S>" );
    $list252 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheSetOf" ) ), makeSymbol( "?X" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol(
        "?X" ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ) ) );
    $const253$StringTemplate = constant_handles.reader_make_constant_shell( makeString( "StringTemplate" ) );
    $const254$TheList = constant_handles.reader_make_constant_shell( makeString( "TheList" ) );
    $const255$TheResultOfParsing = constant_handles.reader_make_constant_shell( makeString( "TheResultOfParsing" ) );
    $kw256$RESET = makeKeyword( "RESET" );
  }

  public static final class $template_rule_native
      extends
        SubLStructNative
  {
    public SubLObject $category;
    public SubLObject $template;
    public SubLObject $transformation;
    public SubLObject $sem_test;
    public SubLObject $assertion;
    public SubLObject $terminals;
    public SubLObject $meaning;
    public SubLObject $constraints;
    public SubLObject $id;
    private static final SubLStructDeclNative structDecl;

    public $template_rule_native()
    {
      this.$category = CommonSymbols.NIL;
      this.$template = CommonSymbols.NIL;
      this.$transformation = CommonSymbols.NIL;
      this.$sem_test = CommonSymbols.NIL;
      this.$assertion = CommonSymbols.NIL;
      this.$terminals = CommonSymbols.NIL;
      this.$meaning = CommonSymbols.NIL;
      this.$constraints = CommonSymbols.NIL;
      this.$id = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $template_rule_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$category;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$template;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$transformation;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$sem_test;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$assertion;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$terminals;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$meaning;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$constraints;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$id;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$category = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$template = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$transformation = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$sem_test = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$assertion = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$terminals = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$meaning = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$constraints = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$id = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $template_rule_native.class, $sym12$TEMPLATE_RULE, $sym13$TEMPLATE_RULE_P, $list14, $list15, new String[] { "$category", "$template", "$transformation", "$sem_test",
        "$assertion", "$terminals", "$meaning", "$constraints", "$id"
      }, $list16, $list17, $sym18$PRINT_TEMPLATE_RULE );
    }
  }

  public static final class $template_rule_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $template_rule_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "TEMPLATE-RULE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return template_rule_p( arg1 );
    }
  }

  public static final class $sxhash_template_rule_method$UnaryFunction
      extends
        UnaryFunction
  {
    public $sxhash_template_rule_method$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SXHASH-TEMPLATE-RULE-METHOD" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return sxhash_template_rule_method( arg1 );
    }
  }

  public static final class $cfasl_input_template_rule$UnaryFunction
      extends
        UnaryFunction
  {
    public $cfasl_input_template_rule$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CFASL-INPUT-TEMPLATE-RULE" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cfasl_input_template_rule( arg1 );
    }
  }

  public static final class $template_span_item_native
      extends
        SubLStructNative
  {
    public SubLObject $template_item;
    public SubLObject $start;
    public SubLObject $end;
    private static final SubLStructDeclNative structDecl;

    public $template_span_item_native()
    {
      this.$template_item = CommonSymbols.NIL;
      this.$start = CommonSymbols.NIL;
      this.$end = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $template_span_item_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$template_item;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$start;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$end;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$template_item = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$start = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$end = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $template_span_item_native.class, $sym66$TEMPLATE_SPAN_ITEM, $sym67$TEMPLATE_SPAN_ITEM_P, $list68, $list69, new String[] { "$template_item", "$start", "$end"
      }, $list70, $list71, $sym72$PRINT_TEMPLATE_SPAN_ITEM );
    }
  }

  public static final class $template_span_item_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $template_span_item_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "TEMPLATE-SPAN-ITEM-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return template_span_item_p( arg1 );
    }
  }

  public static final class $categorized_template_rule_set_native
      extends
        SubLStructNative
  {
    public SubLObject $mentions;
    public SubLObject $generic;
    public SubLObject $key_terminal;
    private static final SubLStructDeclNative structDecl;

    public $categorized_template_rule_set_native()
    {
      this.$mentions = CommonSymbols.NIL;
      this.$generic = CommonSymbols.NIL;
      this.$key_terminal = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $categorized_template_rule_set_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$mentions;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$generic;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$key_terminal;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$mentions = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$generic = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$key_terminal = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $categorized_template_rule_set_native.class, $sym122$CATEGORIZED_TEMPLATE_RULE_SET, $sym123$CATEGORIZED_TEMPLATE_RULE_SET_P, $list124, $list125, new String[] {
        "$mentions", "$generic", "$key_terminal"
      }, $list126, $list127, $sym128$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $categorized_template_rule_set_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $categorized_template_rule_set_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CATEGORIZED-TEMPLATE-RULE-SET-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return categorized_template_rule_set_p( arg1 );
    }
  }

  public static final class $rtp_chart_entry_native
      extends
        SubLStructNative
  {
    public SubLObject $start;
    public SubLObject $end;
    public SubLObject $rule;
    public SubLObject $template_index;
    public SubLObject $words;
    public SubLObject $bindings;
    public SubLObject $subconstits;
    public SubLObject $sem;
    private static final SubLStructDeclNative structDecl;

    public $rtp_chart_entry_native()
    {
      this.$start = CommonSymbols.NIL;
      this.$end = CommonSymbols.NIL;
      this.$rule = CommonSymbols.NIL;
      this.$template_index = CommonSymbols.NIL;
      this.$words = CommonSymbols.NIL;
      this.$bindings = CommonSymbols.NIL;
      this.$subconstits = CommonSymbols.NIL;
      this.$sem = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $rtp_chart_entry_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$start;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$end;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$rule;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$template_index;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$words;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$bindings;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$subconstits;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$sem;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$start = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$end = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$rule = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$template_index = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$words = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$bindings = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$subconstits = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$sem = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $rtp_chart_entry_native.class, $sym190$RTP_CHART_ENTRY, $sym191$RTP_CHART_ENTRY_P, $list192, $list193, new String[] { "$start", "$end", "$rule", "$template_index",
        "$words", "$bindings", "$subconstits", "$sem"
      }, $list194, $list195, $sym196$RTP_ENTRY_PRINT );
    }
  }

  public static final class $rtp_chart_entry_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $rtp_chart_entry_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "RTP-CHART-ENTRY-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return rtp_chart_entry_p( arg1 );
    }
  }

  public static final class $subconstit_native
      extends
        SubLStructNative
  {
    public SubLObject $cat;
    public SubLObject $string;
    public SubLObject $binding_var;
    public SubLObject $start;
    public SubLObject $end;
    public SubLObject $sem_test;
    private static final SubLStructDeclNative structDecl;

    public $subconstit_native()
    {
      this.$cat = CommonSymbols.NIL;
      this.$string = CommonSymbols.NIL;
      this.$binding_var = CommonSymbols.NIL;
      this.$start = CommonSymbols.NIL;
      this.$end = CommonSymbols.NIL;
      this.$sem_test = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $subconstit_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$cat;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$string;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$binding_var;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$start;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$end;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$sem_test;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$cat = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$string = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$binding_var = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$start = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$end = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$sem_test = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $subconstit_native.class, $sym225$SUBCONSTIT, $sym226$SUBCONSTIT_P, $list227, $list228, new String[] { "$cat", "$string", "$binding_var", "$start", "$end", "$sem_test"
      }, $list229, $list230, $sym231$PRINT_SUBCONSTIT );
    }
  }

  public static final class $subconstit_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $subconstit_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SUBCONSTIT-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return subconstit_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 1187 ms
 * 
 */