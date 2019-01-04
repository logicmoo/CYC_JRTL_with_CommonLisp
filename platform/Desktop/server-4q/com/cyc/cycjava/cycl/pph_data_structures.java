package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pph_data_structures extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.pph_data_structures";
    public static final String myFingerPrint = "552c5dec1262513de9c5f4ff1ea709771aa07d303ff0bd3fb364c48a43acb20e";
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 894L)
    private static SubLSymbol $relation_cardinality$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 1045L)
    private static SubLSymbol $gen_template_store$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 1280L)
    private static SubLSymbol $gen_template_store_initializedP$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 4106L)
    public static SubLSymbol $dtp_generation_template$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 6806L)
    private static SubLSymbol $cfasl_opcode_generation_template$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 8164L)
    public static SubLSymbol $dtp_pph_phrase_agr$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 12207L)
    private static SubLSymbol $cfasl_opcode_pph_phrase_agr$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 14487L)
    public static SubLSymbol $dtp_paraphrase_phrase_info_bundle$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 15032L)
    private static SubLSymbol $pph_empty_info_vector$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 18504L)
    public static SubLSymbol $dtp_pph_phrase_output_item$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 33749L)
    private static SubLSymbol $cfasl_opcode_pph_oi$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 35173L)
    public static SubLSymbol $a_lot_of_new_pph_phrases$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 35230L)
    public static SubLSymbol $a_whole_lot_of_new_pph_phrases$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 35293L)
    public static SubLSymbol $a_shitload_of_new_pph_phrases$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 38115L)
    private static SubLSymbol $pph_info_vector_slots$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 38775L)
    public static SubLSymbol $pph_info_vector_unspecified_value$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 40481L)
    private static SubLSymbol $pph_phrase_id_index$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 40633L)
    public static SubLSymbol $pph_phrase_id_index_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 47545L)
    private static SubLSymbol $pph_listified_vector_marker$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 48269L)
    private static SubLSymbol $pph_phrase_shell_marker$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 50010L)
    public static SubLSymbol $dtp_pph_phrase_template_generator$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 51997L)
    private static SubLSymbol $free_pph_phrase_template_generators$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 53919L)
    public static SubLSymbol $dtp_pph_phrase_output_list_iterator$;
    private static final SubLString $str0$_Revision__148135__;
    private static final SubLInteger $int1$12000;
    private static final SubLSymbol $sym2$_GEN_TEMPLATE_STORE_;
    private static final SubLSymbol $sym3$_GEN_TEMPLATE_STORE_INITIALIZED__;
    private static final SubLString $str4$Gen_Template_Store_not_initialize;
    private static final SubLString $str5$Gen_Template_Store_unacceptably_s;
    private static final SubLSymbol $kw6$INITIALIZED;
    private static final SubLSymbol $kw7$ENTERED;
    private static final SubLSymbol $kw8$CLEARED;
    private static final SubLSymbol $sym9$GENERATION_TEMPLATE;
    private static final SubLSymbol $sym10$GENERATION_TEMPLATE_P;
    private static final SubLList $list11;
    private static final SubLList $list12;
    private static final SubLList $list13;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$PPRINT_GEN_TEMPLATE;
    private static final SubLSymbol $sym16$GENERATION_TEMPLATE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list17;
    private static final SubLSymbol $sym18$GEN_TEMPLATE_PHRASE;
    private static final SubLSymbol $sym19$_CSETF_GEN_TEMPLATE_PHRASE;
    private static final SubLSymbol $sym20$GEN_TEMPLATE_CONSTRAINT;
    private static final SubLSymbol $sym21$_CSETF_GEN_TEMPLATE_CONSTRAINT;
    private static final SubLSymbol $sym22$GEN_TEMPLATE_ASSERTION;
    private static final SubLSymbol $sym23$_CSETF_GEN_TEMPLATE_ASSERTION;
    private static final SubLSymbol $kw24$PHRASE;
    private static final SubLSymbol $kw25$CONSTRAINT;
    private static final SubLSymbol $kw26$ASSERTION;
    private static final SubLString $str27$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw28$BEGIN;
    private static final SubLSymbol $sym29$MAKE_GENERATION_TEMPLATE;
    private static final SubLSymbol $kw30$SLOT;
    private static final SubLSymbol $kw31$END;
    private static final SubLSymbol $sym32$VISIT_DEFSTRUCT_OBJECT_GENERATION_TEMPLATE_METHOD;
    private static final SubLSymbol $sym33$SXHASH_GENERATION_TEMPLATE_METHOD;
    private static final SubLSymbol $sym34$PPH_PHRASE_P;
    private static final SubLSymbol $sym35$ASSERTION_P;
    private static final SubLString $str36$__GEN_TEMPLATE__S_;
    private static final SubLString $str37$_PPH_error_level_;
    private static final SubLString $str38$__;
    private static final SubLString $str39$Can_t_get_assertion_from__S___Fou;
    private static final SubLObject $const40$ParaphraseMt;
    private static final SubLString $str41$Can_t_get_mt_from__S___Found__S;
    private static final SubLInteger $int42$72;
    private static final SubLSymbol $sym43$CFASL_INPUT_GENERATION_TEMPLATE;
    private static final SubLSymbol $sym44$CFASL_OUTPUT_OBJECT_GENERATION_TEMPLATE_METHOD;
    private static final SubLSymbol $sym45$PPH_PHRASE_AGR;
    private static final SubLSymbol $sym46$PPH_PHRASE_AGR_P;
    private static final SubLList $list47;
    private static final SubLList $list48;
    private static final SubLList $list49;
    private static final SubLList $list50;
    private static final SubLSymbol $sym51$PPRINT_PPH_PHRASE_AGR;
    private static final SubLSymbol $sym52$PPH_PHRASE_AGR_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list53;
    private static final SubLSymbol $sym54$PPH_PHRASE_AGR_ABSOLUTE_CONSTRAINT;
    private static final SubLSymbol $sym55$_CSETF_PPH_PHRASE_AGR_ABSOLUTE_CONSTRAINT;
    private static final SubLSymbol $sym56$PPH_PHRASE_AGR_RELATIVE_CONSTRAINT;
    private static final SubLSymbol $sym57$_CSETF_PPH_PHRASE_AGR_RELATIVE_CONSTRAINT;
    private static final SubLSymbol $kw58$ABSOLUTE_CONSTRAINT;
    private static final SubLSymbol $kw59$RELATIVE_CONSTRAINT;
    private static final SubLSymbol $sym60$MAKE_PPH_PHRASE_AGR;
    private static final SubLSymbol $sym61$VISIT_DEFSTRUCT_OBJECT_PPH_PHRASE_AGR_METHOD;
    private static final SubLString $str62$_AGR;
    private static final SubLString $str63$___S_;
    private static final SubLString $str64$_PPH_PHRASE__A_______;
    private static final SubLString $str65$_A;
    private static final SubLString $str66$_;
    private static final SubLString $str67$_;
    private static final SubLInteger $int68$73;
    private static final SubLSymbol $sym69$CFASL_INPUT_PPH_PHRASE_AGR;
    private static final SubLSymbol $sym70$CFASL_OUTPUT_OBJECT_PPH_PHRASE_AGR_METHOD;
    private static final SubLString $str71$Could_not_find_pph_phrase_with_su;
    private static final SubLSymbol $sym72$PARAPHRASE_PHRASE_INFO_BUNDLE;
    private static final SubLSymbol $sym73$PARAPHRASE_PHRASE_INFO_BUNDLE_P;
    private static final SubLList $list74;
    private static final SubLList $list75;
    private static final SubLList $list76;
    private static final SubLList $list77;
    private static final SubLSymbol $sym78$PPRINT_PPH_PHRASE_INFO_BUNDLE;
    private static final SubLSymbol $sym79$PARAPHRASE_PHRASE_INFO_BUNDLE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list80;
    private static final SubLSymbol $sym81$PPH_PHRASE_INFO_CYCL;
    private static final SubLSymbol $sym82$_CSETF_PPH_PHRASE_INFO_CYCL;
    private static final SubLSymbol $sym83$PPH_PHRASE_INFO_AGR;
    private static final SubLSymbol $sym84$_CSETF_PPH_PHRASE_INFO_AGR;
    private static final SubLSymbol $sym85$PPH_PHRASE_INFO_JUSTIFICATION;
    private static final SubLSymbol $sym86$_CSETF_PPH_PHRASE_INFO_JUSTIFICATION;
    private static final SubLSymbol $sym87$PPH_PHRASE_INFO_OUTPUT_LIST;
    private static final SubLSymbol $sym88$_CSETF_PPH_PHRASE_INFO_OUTPUT_LIST;
    private static final SubLSymbol $sym89$PPH_PHRASE_INFO_ARG_POSITION_MAP;
    private static final SubLSymbol $sym90$_CSETF_PPH_PHRASE_INFO_ARG_POSITION_MAP;
    private static final SubLSymbol $sym91$PPH_PHRASE_INFO_OTHER;
    private static final SubLSymbol $sym92$_CSETF_PPH_PHRASE_INFO_OTHER;
    private static final SubLSymbol $kw93$CYCL;
    private static final SubLSymbol $kw94$AGR;
    private static final SubLSymbol $kw95$JUSTIFICATION;
    private static final SubLSymbol $kw96$OUTPUT_LIST;
    private static final SubLSymbol $kw97$ARG_POSITION_MAP;
    private static final SubLSymbol $kw98$OTHER;
    private static final SubLSymbol $sym99$MAKE_PARAPHRASE_PHRASE_INFO_BUNDLE;
    private static final SubLSymbol $sym100$VISIT_DEFSTRUCT_OBJECT_PARAPHRASE_PHRASE_INFO_BUNDLE_METHOD;
    private static final SubLSymbol $kw101$PPH_EMPTY_INFO_VECTOR;
    private static final SubLList $list102;
    private static final SubLSymbol $sym103$PLIST;
    private static final SubLSymbol $sym104$CLET;
    private static final SubLSymbol $sym105$PPH_PHRASE_PLIST;
    private static final SubLSymbol $sym106$DO_PLIST;
    private static final SubLString $str107$_S_should_be__S__not__S;
    private static final SubLSymbol $sym108$PPH_PHRASE_OUTPUT_ITEM;
    private static final SubLSymbol $sym109$PPH_PHRASE_OUTPUT_ITEM_P;
    private static final SubLList $list110;
    private static final SubLList $list111;
    private static final SubLList $list112;
    private static final SubLList $list113;
    private static final SubLSymbol $sym114$PPRINT_PPH_PHRASE_OUTPUT_ITEM;
    private static final SubLSymbol $sym115$PPH_PHRASE_OUTPUT_ITEM_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list116;
    private static final SubLSymbol $sym117$PPH_OI_STRING;
    private static final SubLSymbol $sym118$_CSETF_PPH_OI_STRING;
    private static final SubLSymbol $sym119$PPH_OI_ARG_POSITION;
    private static final SubLSymbol $sym120$_CSETF_PPH_OI_ARG_POSITION;
    private static final SubLSymbol $sym121$PPH_OI_CYCL;
    private static final SubLSymbol $sym122$_CSETF_PPH_OI_CYCL;
    private static final SubLSymbol $sym123$PPH_OI_HTML_OPEN_TAG;
    private static final SubLSymbol $sym124$_CSETF_PPH_OI_HTML_OPEN_TAG;
    private static final SubLSymbol $sym125$PPH_OI_HTML_CLOSE_TAG;
    private static final SubLSymbol $sym126$_CSETF_PPH_OI_HTML_CLOSE_TAG;
    private static final SubLSymbol $sym127$PPH_OI_AGR;
    private static final SubLSymbol $sym128$_CSETF_PPH_OI_AGR;
    private static final SubLSymbol $kw129$STRING;
    private static final SubLSymbol $kw130$ARG_POSITION;
    private static final SubLSymbol $kw131$HTML_OPEN_TAG;
    private static final SubLSymbol $kw132$HTML_CLOSE_TAG;
    private static final SubLSymbol $sym133$MAKE_PPH_PHRASE_OUTPUT_ITEM;
    private static final SubLSymbol $sym134$VISIT_DEFSTRUCT_OBJECT_PPH_PHRASE_OUTPUT_ITEM_METHOD;
    private static final SubLSymbol $sym135$PPH_STRING_P;
    private static final SubLString $str136$_PPH_OI__S__S__S__S__S__S___;
    private static final SubLString $str137$_S_is_a_forbidden_paraphrase_for_;
    private static final SubLSymbol $sym138$PPH_PHRASE_OUTPUT_ITEM_LOOSE_P;
    private static final SubLSymbol $sym139$LIST;
    private static final SubLSymbol $kw140$NOSPACE;
    private static final SubLSymbol $sym141$PPH_PHRASE_OUTPUT_LIST_P;
    private static final SubLString $str142$;
    private static final SubLSymbol $sym143$PPH_PHRASE_OUTPUT_ITEM_COPY;
    private static final SubLSymbol $sym144$NON_NEGATIVE_INTEGER_P;
    private static final SubLSymbol $sym145$LISTP;
    private static final SubLString $str146$Can_t_make_nested_enhanced_output;
    private static final SubLSymbol $sym147$ENHANCED_PPH_OUTPUT_ITEM_P;
    private static final SubLInteger $int148$74;
    private static final SubLSymbol $sym149$CFASL_INPUT_PPH_OI;
    private static final SubLSymbol $sym150$CFASL_OUTPUT_OBJECT_PPH_PHRASE_OUTPUT_ITEM_METHOD;
    private static final SubLString $str151$_S__S;
    private static final SubLInteger $int152$50000;
    private static final SubLInteger $int153$200000;
    private static final SubLInteger $int154$500000;
    private static final SubLString $str155$new_PPH_phrase_limit_of__S_exceed;
    private static final SubLString $str156$New_PPH_phrase_not_expected_to_be;
    private static final SubLList $list157;
    private static final SubLSymbol $sym158$PPH_INFO_VECTOR_P;
    private static final SubLSymbol $sym159$_PPH_PHRASE_ID_INDEX_;
    private static final SubLString $str160$PPH_phrase_ID_index;
    private static final SubLSymbol $sym161$PPH_PHRASE_SET_SUID;
    private static final SubLString $str162$Removing_invalid_PPH_phrases;
    private static final SubLSymbol $sym163$STRINGP;
    private static final SubLSymbol $kw164$SKIP;
    private static final SubLString $str165$Removed__S_items_from__PPH_PHRASE;
    private static final SubLString $str166$Found_no_invalid_PPH_phrases_;
    private static final SubLSymbol $kw167$FREE;
    private static final SubLSymbol $sym168$INTEGERP;
    private static final SubLString $str169$__Dumping__S__;
    private static final SubLString $str170$__Dumping_CycL___S__;
    private static final SubLString $str171$__Dumping_Agr___S__;
    private static final SubLString $str172$__Dumping_Justification___S__;
    private static final SubLString $str173$__Dumping_Output_List___S__;
    private static final SubLString $str174$__Dumping_Arg_Position_Map___S__;
    private static final SubLString $str175$__Dumping_Other___S__;
    private static final SubLString $str176$_________________________________;
    private static final SubLSymbol $kw177$LISTIFIED_PPH_VECTOR;
    private static final SubLSymbol $sym178$VECTORP;
    private static final SubLSymbol $sym179$LISTIFY_PPH_VECTOR;
    private static final SubLSymbol $sym180$PPH_LISTIFIED_VECTOR_P;
    private static final SubLSymbol $sym181$DELISTIFY_PPH_VECTOR;
    private static final SubLSymbol $kw182$PPH_PHRASE_SHELL;
    private static final SubLSymbol $sym183$SHELLIFY_PPH_PHRASE;
    private static final SubLSymbol $sym184$SHELLIFIED_PPH_PHRASE_P;
    private static final SubLSymbol $sym185$DESHELLIFY_PPH_PHRASE;
    private static final SubLString $str186$Couldn_t_find_PPH_phrase__D;
    private static final SubLSymbol $sym187$PPH_PHRASE_TEMPLATE_GENERATOR;
    private static final SubLSymbol $sym188$PPH_PHRASE_TEMPLATE_GENERATOR_P;
    private static final SubLList $list189;
    private static final SubLList $list190;
    private static final SubLList $list191;
    private static final SubLList $list192;
    private static final SubLSymbol $sym193$PPRINT_PPH_PHRASE_TEMPLATE_GENERATOR;
    private static final SubLSymbol $sym194$PPH_PHRASE_TEMPLATE_GENERATOR_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list195;
    private static final SubLSymbol $sym196$PPH_PHRASE_TEMPLATE_GENERATOR_FORMULA;
    private static final SubLSymbol $sym197$_CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_FORMULA;
    private static final SubLSymbol $sym198$PPH_PHRASE_TEMPLATE_GENERATOR_MT;
    private static final SubLSymbol $sym199$_CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_MT;
    private static final SubLSymbol $sym200$PPH_PHRASE_TEMPLATE_GENERATOR_FOCUS_ARG;
    private static final SubLSymbol $sym201$_CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_FOCUS_ARG;
    private static final SubLSymbol $sym202$PPH_PHRASE_TEMPLATE_GENERATOR_SPECIFIED_RELN;
    private static final SubLSymbol $sym203$_CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_SPECIFIED_RELN;
    private static final SubLSymbol $sym204$PPH_PHRASE_TEMPLATE_GENERATOR_NL_PREDS;
    private static final SubLSymbol $sym205$_CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_NL_PREDS;
    private static final SubLSymbol $sym206$PPH_PHRASE_TEMPLATE_GENERATOR_DONE_;
    private static final SubLSymbol $sym207$_CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_DONE_;
    private static final SubLSymbol $sym208$PPH_PHRASE_TEMPLATE_GENERATOR_SEARCH_LIMIT;
    private static final SubLSymbol $sym209$_CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_SEARCH_LIMIT;
    private static final SubLSymbol $sym210$PPH_PHRASE_TEMPLATE_GENERATOR_SEARCH_LEVEL;
    private static final SubLSymbol $sym211$_CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_SEARCH_LEVEL;
    private static final SubLSymbol $sym212$PPH_PHRASE_TEMPLATE_GENERATOR_RELNS_TO_USE;
    private static final SubLSymbol $sym213$_CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_RELNS_TO_USE;
    private static final SubLSymbol $sym214$PPH_PHRASE_TEMPLATE_GENERATOR_GEN_TEMPLATE_SETS;
    private static final SubLSymbol $sym215$_CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_GEN_TEMPLATE_SETS;
    private static final SubLSymbol $sym216$PPH_PHRASE_TEMPLATE_GENERATOR_GEN_TEMPLATES;
    private static final SubLSymbol $sym217$_CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_GEN_TEMPLATES;
    private static final SubLSymbol $sym218$PPH_PHRASE_TEMPLATE_GENERATOR_ARG_POSITION_MAP;
    private static final SubLSymbol $sym219$_CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_ARG_POSITION_MAP;
    private static final SubLSymbol $kw220$FORMULA;
    private static final SubLSymbol $kw221$MT;
    private static final SubLSymbol $kw222$FOCUS_ARG;
    private static final SubLSymbol $kw223$SPECIFIED_RELN;
    private static final SubLSymbol $kw224$NL_PREDS;
    private static final SubLSymbol $kw225$DONE_;
    private static final SubLSymbol $kw226$SEARCH_LIMIT;
    private static final SubLSymbol $kw227$SEARCH_LEVEL;
    private static final SubLSymbol $kw228$RELNS_TO_USE;
    private static final SubLSymbol $kw229$GEN_TEMPLATE_SETS;
    private static final SubLSymbol $kw230$GEN_TEMPLATES;
    private static final SubLSymbol $sym231$MAKE_PPH_PHRASE_TEMPLATE_GENERATOR;
    private static final SubLSymbol $sym232$VISIT_DEFSTRUCT_OBJECT_PPH_PHRASE_TEMPLATE_GENERATOR_METHOD;
    private static final SubLString $str233$_PPH_Phrase_Template_Generator___;
    private static final SubLSymbol $kw234$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym235$IGNORE_ERRORS_HANDLER;
    private static final SubLSymbol $sym236$_FREE_PPH_PHRASE_TEMPLATE_GENERATORS_;
    private static final SubLSymbol $kw237$ANY;
    private static final SubLSymbol $sym238$HLMT_P;
    private static final SubLString $str239$Making_new_PPH_phrase_template_ge;
    private static final SubLString $str240$Freeing_PPH_phrase_template_gener;
    private static final SubLSymbol $sym241$PPH_PHRASE_OUTPUT_LIST_ITERATOR;
    private static final SubLSymbol $sym242$PPH_PHRASE_OUTPUT_LIST_ITERATOR_P;
    private static final SubLList $list243;
    private static final SubLList $list244;
    private static final SubLList $list245;
    private static final SubLList $list246;
    private static final SubLSymbol $sym247$PPRINT_PPH_PHRASE_OUTPUT_LIST_ITERATOR;
    private static final SubLSymbol $sym248$PPH_PHRASE_OUTPUT_LIST_ITERATOR_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list249;
    private static final SubLSymbol $sym250$PPH_PHRASE_OUTPUT_LIST_ITERATOR_ITEM_QUEUE;
    private static final SubLSymbol $sym251$_CSETF_PPH_PHRASE_OUTPUT_LIST_ITERATOR_ITEM_QUEUE;
    private static final SubLSymbol $kw252$ITEM_QUEUE;
    private static final SubLSymbol $sym253$MAKE_PPH_PHRASE_OUTPUT_LIST_ITERATOR;
    private static final SubLSymbol $sym254$VISIT_DEFSTRUCT_OBJECT_PPH_PHRASE_OUTPUT_LIST_ITERATOR_METHOD;
    private static final SubLString $str255$_PPH_OL_Iterator_;
    private static final SubLString $str256$___Iterator_empty___S__;
    private static final SubLString $str257$___Can_t_get_next_item_from__S;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 1184L)
    public static SubLObject gen_template_store_present_p() {
        return dictionary.dictionary_p(pph_data_structures.$gen_template_store$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 1339L)
    public static SubLObject note_gen_template_store_initialized() {
        pph_data_structures.$gen_template_store_initializedP$.setGlobalValue((SubLObject)pph_data_structures.T);
        pph_staleness_test.gen_template_store_note_revisions();
        pph_staleness_test.declare_gen_template_store_not_known_stale();
        return pph_data_structures.$gen_template_store$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 1558L)
    public static SubLObject clear_gen_template_store() {
        SubLObject release = (SubLObject)pph_data_structures.NIL;
        try {
            release = Locks.seize_lock(pph_vars.$gen_template_store_lock$.getGlobalValue());
            dictionary.clear_dictionary(pph_data_structures.$gen_template_store$.getGlobalValue());
            pph_data_structures.$gen_template_store_initializedP$.setGlobalValue((SubLObject)pph_data_structures.NIL);
            pph_phrase.destroy_all_pph_phrases();
            pph_templates.clear_gen_template_verbosity();
        }
        finally {
            if (pph_data_structures.NIL != release) {
                Locks.release_lock(pph_vars.$gen_template_store_lock$.getGlobalValue());
            }
        }
        return pph_data_structures.$gen_template_store$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 1881L)
    public static SubLObject gen_template_store_initializedP() {
        return pph_data_structures.$gen_template_store_initializedP$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 1978L)
    public static SubLObject check_gen_template_store_initialization() {
        if (pph_data_structures.NIL == gen_template_store_initializedP() || (pph_data_structures.NIL == pph_staleness_test.gen_template_store_staleness_acceptableP() && pph_data_structures.NIL != pph_staleness_test.gen_template_store_staleP())) {
            if (pph_data_structures.NIL == gen_template_store_initializedP()) {
                Errors.warn((SubLObject)pph_data_structures.$str4$Gen_Template_Store_not_initialize);
            }
            if (pph_data_structures.NIL == pph_staleness_test.gen_template_store_staleness_acceptableP() && pph_data_structures.NIL != pph_staleness_test.gen_template_store_staleP()) {
                Errors.warn((SubLObject)pph_data_structures.$str5$Gen_Template_Store_unacceptably_s);
            }
            pph_templates.initialize_gen_template_store();
        }
        return (SubLObject)pph_data_structures.$kw6$INITIALIZED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 2537L)
    public static SubLObject gen_template_store_length() {
        return dictionary.dictionary_length(pph_data_structures.$gen_template_store$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 2635L)
    public static SubLObject new_gen_template_store_iterator() {
        return dictionary.new_dictionary_iterator(pph_data_structures.$gen_template_store$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 2745L)
    public static SubLObject gen_template_sets_for_reln_from_store(final SubLObject reln, SubLObject check_initializedP) {
        if (check_initializedP == pph_data_structures.UNPROVIDED) {
            check_initializedP = (SubLObject)pph_data_structures.T;
        }
        SubLObject ans = (SubLObject)pph_data_structures.NIL;
        SubLObject release = (SubLObject)pph_data_structures.NIL;
        try {
            release = Locks.seize_lock(pph_vars.$gen_template_store_lock$.getGlobalValue());
            if (pph_data_structures.NIL != check_initializedP) {
                check_gen_template_store_initialization();
            }
            ans = dictionary.dictionary_lookup(pph_data_structures.$gen_template_store$.getGlobalValue(), reln, (SubLObject)pph_data_structures.UNPROVIDED);
        }
        finally {
            if (pph_data_structures.NIL != release) {
                Locks.release_lock(pph_vars.$gen_template_store_lock$.getGlobalValue());
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 3201L)
    public static SubLObject set_gen_template_store_value(final SubLObject reln, final SubLObject sets) {
        dictionary.dictionary_enter(pph_data_structures.$gen_template_store$.getGlobalValue(), reln, sets);
        return (SubLObject)pph_data_structures.$kw7$ENTERED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 3331L)
    public static SubLObject clear_gen_template_store_value(final SubLObject reln) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = pph_vars.$bypass_pph_phrase_destroyerP$.currentBinding(thread);
        try {
            pph_vars.$bypass_pph_phrase_destroyerP$.bind((SubLObject)pph_data_structures.T, thread);
            destroy_gen_templates_for_reln(reln);
            dictionary.dictionary_remove(pph_data_structures.$gen_template_store$.getGlobalValue(), reln);
        }
        finally {
            pph_vars.$bypass_pph_phrase_destroyerP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)pph_data_structures.$kw8$CLEARED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 3544L)
    public static SubLObject destroy_gen_templates_for_reln(final SubLObject reln) {
        SubLObject cdolist_list_var = pph_templates.gen_template_sets_for_reln(reln, (SubLObject)pph_data_structures.NIL);
        SubLObject v_set = (SubLObject)pph_data_structures.NIL;
        v_set = cdolist_list_var.first();
        while (pph_data_structures.NIL != cdolist_list_var) {
            final SubLObject set_contents_var = set.do_set_internal(v_set);
            SubLObject basis_object;
            SubLObject state;
            SubLObject gen_template;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)pph_data_structures.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); pph_data_structures.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                gen_template = set_contents.do_set_contents_next(basis_object, state);
                if (pph_data_structures.NIL != set_contents.do_set_contents_element_validP(state, gen_template)) {
                    destroy_gen_template(gen_template);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_set = cdolist_list_var.first();
        }
        return reln;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 3743L)
    public static SubLObject destroy_gen_template(final SubLObject gen_template) {
        final SubLObject phrase = get_gen_template_phrase(gen_template);
        if (pph_data_structures.NIL != pph_phrase.pph_phrase_p(phrase, (SubLObject)pph_data_structures.UNPROVIDED)) {
            pph_phrase.destroy_pph_phrase(phrase, (SubLObject)pph_data_structures.UNPROVIDED);
        }
        return gen_template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 4106L)
    public static SubLObject generation_template_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_gen_template(v_object, stream, (SubLObject)pph_data_structures.ZERO_INTEGER);
        return (SubLObject)pph_data_structures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 4106L)
    public static SubLObject generation_template_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $generation_template_native.class) ? pph_data_structures.T : pph_data_structures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 4106L)
    public static SubLObject gen_template_phrase(final SubLObject v_object) {
        assert pph_data_structures.NIL != generation_template_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 4106L)
    public static SubLObject gen_template_constraint(final SubLObject v_object) {
        assert pph_data_structures.NIL != generation_template_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 4106L)
    public static SubLObject gen_template_assertion(final SubLObject v_object) {
        assert pph_data_structures.NIL != generation_template_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 4106L)
    public static SubLObject _csetf_gen_template_phrase(final SubLObject v_object, final SubLObject value) {
        assert pph_data_structures.NIL != generation_template_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 4106L)
    public static SubLObject _csetf_gen_template_constraint(final SubLObject v_object, final SubLObject value) {
        assert pph_data_structures.NIL != generation_template_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 4106L)
    public static SubLObject _csetf_gen_template_assertion(final SubLObject v_object, final SubLObject value) {
        assert pph_data_structures.NIL != generation_template_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 4106L)
    public static SubLObject make_generation_template(SubLObject arglist) {
        if (arglist == pph_data_structures.UNPROVIDED) {
            arglist = (SubLObject)pph_data_structures.NIL;
        }
        final SubLObject v_new = (SubLObject)new $generation_template_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)pph_data_structures.NIL, next = arglist; pph_data_structures.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)pph_data_structures.$kw24$PHRASE)) {
                _csetf_gen_template_phrase(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pph_data_structures.$kw25$CONSTRAINT)) {
                _csetf_gen_template_constraint(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pph_data_structures.$kw26$ASSERTION)) {
                _csetf_gen_template_assertion(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)pph_data_structures.$str27$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 4106L)
    public static SubLObject visit_defstruct_generation_template(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_data_structures.$kw28$BEGIN, (SubLObject)pph_data_structures.$sym29$MAKE_GENERATION_TEMPLATE, (SubLObject)pph_data_structures.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_data_structures.$kw30$SLOT, (SubLObject)pph_data_structures.$kw24$PHRASE, gen_template_phrase(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_data_structures.$kw30$SLOT, (SubLObject)pph_data_structures.$kw25$CONSTRAINT, gen_template_constraint(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_data_structures.$kw30$SLOT, (SubLObject)pph_data_structures.$kw26$ASSERTION, gen_template_assertion(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_data_structures.$kw31$END, (SubLObject)pph_data_structures.$sym29$MAKE_GENERATION_TEMPLATE, (SubLObject)pph_data_structures.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 4106L)
    public static SubLObject visit_defstruct_object_generation_template_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_generation_template(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 4375L)
    public static SubLObject sxhash_generation_template_method(final SubLObject v_object) {
        return Sxhash.sxhash(gen_template_assertion(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 4479L)
    public static SubLObject new_gen_template(SubLObject phrase, SubLObject constraint, SubLObject assertion) {
        if (phrase == pph_data_structures.UNPROVIDED) {
            phrase = (SubLObject)pph_data_structures.NIL;
        }
        if (constraint == pph_data_structures.UNPROVIDED) {
            constraint = (SubLObject)pph_data_structures.NIL;
        }
        if (assertion == pph_data_structures.UNPROVIDED) {
            assertion = (SubLObject)pph_data_structures.NIL;
        }
        if (pph_data_structures.NIL != phrase && !pph_data_structures.assertionsDisabledInClass && pph_data_structures.NIL == pph_phrase.pph_phrase_p(phrase, (SubLObject)pph_data_structures.UNPROVIDED)) {
            throw new AssertionError(phrase);
        }
        if (pph_data_structures.NIL != assertion && !pph_data_structures.assertionsDisabledInClass && pph_data_structures.NIL == assertion_handles.assertion_p(assertion)) {
            throw new AssertionError(assertion);
        }
        final SubLObject gen_template = make_generation_template((SubLObject)pph_data_structures.UNPROVIDED);
        _csetf_gen_template_phrase(gen_template, phrase);
        _csetf_gen_template_constraint(gen_template, constraint);
        _csetf_gen_template_assertion(gen_template, assertion);
        return gen_template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 4902L)
    public static SubLObject pprint_gen_template(final SubLObject template, SubLObject stream, SubLObject depth) {
        if (stream == pph_data_structures.UNPROVIDED) {
            stream = (SubLObject)pph_data_structures.NIL;
        }
        if (depth == pph_data_structures.UNPROVIDED) {
            depth = (SubLObject)pph_data_structures.NIL;
        }
        PrintLow.format(stream, (SubLObject)pph_data_structures.$str36$__GEN_TEMPLATE__S_, gen_template_phrase(template));
        return (SubLObject)pph_data_structures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 5077L)
    public static SubLObject gen_template_el_constraint(final SubLObject gen_template) {
        final SubLObject constraint = gen_template_constraint(gen_template);
        if (pph_data_structures.NIL == constraint) {
            return (SubLObject)pph_data_structures.NIL;
        }
        if (pph_data_structures.NIL != clauses.clauses_p(constraint)) {
            return clauses.dnf_formula_from_clauses(constraint);
        }
        if (pph_data_structures.NIL != el_utilities.el_formula_p(constraint)) {
            return constraint;
        }
        return (SubLObject)pph_data_structures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 5391L)
    public static SubLObject gen_template_set_constraint(final SubLObject gen_template, final SubLObject constraint) {
        _csetf_gen_template_constraint(gen_template, constraint);
        return gen_template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 5546L)
    public static SubLObject get_gen_template_phrase(final SubLObject gen_template) {
        return gen_template_phrase(gen_template);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 5648L)
    public static SubLObject get_gen_template_constraint(final SubLObject gen_template) {
        return gen_template_constraint(gen_template);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 5758L)
    public static SubLObject get_gen_template_assertion(final SubLObject gen_template) {
        final SubLObject maybe_assertion = gen_template_assertion(gen_template);
        if (pph_data_structures.NIL != assertion_handles.assertion_p(maybe_assertion)) {
            return maybe_assertion;
        }
        if (pph_data_structures.NIL != hlmt.possibly_mt_p(maybe_assertion)) {
            return Sequences.find_if((SubLObject)pph_data_structures.$sym35$ASSERTION_P, pph_phrase.pph_phrase_justification(get_gen_template_phrase(gen_template)), (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED);
        }
        if (pph_data_structures.NIL != pph_templates.rephrase_gen_template_for_kappa_predP(gen_template)) {
            return (SubLObject)pph_data_structures.NIL;
        }
        final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_data_structures.$str37$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_data_structures.ONE_INTEGER), pph_data_structures.$str38$__, format_nil.format_nil_a_no_copy((SubLObject)pph_data_structures.$str39$Can_t_get_assertion_from__S___Fou) });
        pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(gen_template, maybe_assertion));
        return (SubLObject)pph_data_structures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 6335L)
    public static SubLObject get_gen_template_mt(final SubLObject gen_template) {
        final SubLObject maybe_assertion = gen_template_assertion(gen_template);
        if (pph_data_structures.NIL != assertion_handles.assertion_p(maybe_assertion)) {
            return assertions_high.assertion_mt(maybe_assertion);
        }
        if (pph_data_structures.NIL != hlmt.possibly_mt_p(maybe_assertion)) {
            return maybe_assertion;
        }
        if (pph_data_structures.NIL != pph_templates.rephrase_gen_template_for_kappa_predP(gen_template)) {
            return pph_data_structures.$const40$ParaphraseMt;
        }
        final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_data_structures.$str37$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_data_structures.ONE_INTEGER), pph_data_structures.$str38$__, format_nil.format_nil_a_no_copy((SubLObject)pph_data_structures.$str41$Can_t_get_mt_from__S___Found__S) });
        pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(gen_template, maybe_assertion));
        return (SubLObject)pph_data_structures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 6919L)
    public static SubLObject cfasl_output_object_generation_template_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_generation_template(v_object, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 7051L)
    public static SubLObject cfasl_output_generation_template(final SubLObject generation_template, final SubLObject stream) {
        cfasl.cfasl_raw_write_byte(pph_data_structures.$cfasl_opcode_generation_template$.getGlobalValue(), stream);
        cfasl.cfasl_output(pph_phrase.pph_phrase_suid(gen_template_phrase(generation_template)), stream);
        cfasl.cfasl_output(gen_template_constraint(generation_template), stream);
        cfasl.cfasl_output(gen_template_assertion(generation_template), stream);
        return generation_template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 7449L)
    public static SubLObject cfasl_input_generation_template(final SubLObject stream) {
        SubLObject generation_template = (SubLObject)pph_data_structures.NIL;
        generation_template = make_generation_template((SubLObject)pph_data_structures.UNPROVIDED);
        _csetf_gen_template_phrase(generation_template, find_pph_phrase_by_id(cfasl.cfasl_input(stream, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED)));
        _csetf_gen_template_constraint(generation_template, cfasl.cfasl_input(stream, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED));
        _csetf_gen_template_assertion(generation_template, cfasl.cfasl_input(stream, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED));
        return generation_template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 8164L)
    public static SubLObject pph_phrase_agr_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_pph_phrase_agr(v_object, stream, (SubLObject)pph_data_structures.ZERO_INTEGER);
        return (SubLObject)pph_data_structures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 8164L)
    public static SubLObject pph_phrase_agr_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $pph_phrase_agr_native.class) ? pph_data_structures.T : pph_data_structures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 8164L)
    public static SubLObject pph_phrase_agr_absolute_constraint(final SubLObject v_object) {
        assert pph_data_structures.NIL != pph_phrase_agr_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 8164L)
    public static SubLObject pph_phrase_agr_relative_constraint(final SubLObject v_object) {
        assert pph_data_structures.NIL != pph_phrase_agr_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 8164L)
    public static SubLObject _csetf_pph_phrase_agr_absolute_constraint(final SubLObject v_object, final SubLObject value) {
        assert pph_data_structures.NIL != pph_phrase_agr_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 8164L)
    public static SubLObject _csetf_pph_phrase_agr_relative_constraint(final SubLObject v_object, final SubLObject value) {
        assert pph_data_structures.NIL != pph_phrase_agr_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 8164L)
    public static SubLObject make_pph_phrase_agr(SubLObject arglist) {
        if (arglist == pph_data_structures.UNPROVIDED) {
            arglist = (SubLObject)pph_data_structures.NIL;
        }
        final SubLObject v_new = (SubLObject)new $pph_phrase_agr_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)pph_data_structures.NIL, next = arglist; pph_data_structures.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)pph_data_structures.$kw58$ABSOLUTE_CONSTRAINT)) {
                _csetf_pph_phrase_agr_absolute_constraint(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pph_data_structures.$kw59$RELATIVE_CONSTRAINT)) {
                _csetf_pph_phrase_agr_relative_constraint(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)pph_data_structures.$str27$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 8164L)
    public static SubLObject visit_defstruct_pph_phrase_agr(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_data_structures.$kw28$BEGIN, (SubLObject)pph_data_structures.$sym60$MAKE_PPH_PHRASE_AGR, (SubLObject)pph_data_structures.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_data_structures.$kw30$SLOT, (SubLObject)pph_data_structures.$kw58$ABSOLUTE_CONSTRAINT, pph_phrase_agr_absolute_constraint(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_data_structures.$kw30$SLOT, (SubLObject)pph_data_structures.$kw59$RELATIVE_CONSTRAINT, pph_phrase_agr_relative_constraint(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_data_structures.$kw31$END, (SubLObject)pph_data_structures.$sym60$MAKE_PPH_PHRASE_AGR, (SubLObject)pph_data_structures.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 8164L)
    public static SubLObject visit_defstruct_object_pph_phrase_agr_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_pph_phrase_agr(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 8352L)
    public static SubLObject pprint_pph_phrase_agr(final SubLObject agr, final SubLObject stream, final SubLObject depth) {
        final SubLObject abcon = pph_phrase_agr_absolute_constraint(agr);
        final SubLObject relcon = pph_phrase_agr_relative_constraint(agr);
        PrintLow.format(stream, (SubLObject)pph_data_structures.$str62$_AGR);
        if (pph_data_structures.NIL != pph_utilities.pph_agr_constraint_p(abcon)) {
            final SubLObject target = pph_utilities.pph_agr_constraint_target(abcon);
            PrintLow.format(stream, (SubLObject)pph_data_structures.$str63$___S_, pph_utilities.pph_agr_constraint_type(abcon));
            if (pph_data_structures.NIL != pph_phrase.pph_phrase_p(target, (SubLObject)pph_data_structures.UNPROVIDED)) {
                PrintLow.format(stream, (SubLObject)pph_data_structures.$str64$_PPH_PHRASE__A_______, pph_phrase.pph_phrase_suid(target));
            }
            else {
                PrintLow.format(stream, (SubLObject)pph_data_structures.$str65$_A, target);
            }
            print_high.princ((SubLObject)pph_data_structures.$str66$_, stream);
        }
        if (pph_data_structures.NIL != pph_utilities.pph_agr_constraint_p(relcon)) {
            final SubLObject target = pph_utilities.pph_agr_constraint_target(relcon);
            PrintLow.format(stream, (SubLObject)pph_data_structures.$str63$___S_, pph_utilities.pph_agr_constraint_type(relcon));
            if (pph_data_structures.NIL != pph_phrase.pph_phrase_p(target, (SubLObject)pph_data_structures.UNPROVIDED)) {
                PrintLow.format(stream, (SubLObject)pph_data_structures.$str64$_PPH_PHRASE__A_______, pph_phrase.pph_phrase_suid(target));
            }
            else {
                PrintLow.format(stream, (SubLObject)pph_data_structures.$str65$_A, target);
            }
            print_high.princ((SubLObject)pph_data_structures.$str66$_, stream);
        }
        print_high.princ((SubLObject)pph_data_structures.$str67$_, stream);
        return agr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 9226L)
    public static SubLObject new_pph_phrase_agr(SubLObject absolute_constraint, SubLObject relative_constraint) {
        if (absolute_constraint == pph_data_structures.UNPROVIDED) {
            absolute_constraint = pph_utilities.new_pph_dont_care_agr_constraint();
        }
        if (relative_constraint == pph_data_structures.UNPROVIDED) {
            relative_constraint = (SubLObject)pph_data_structures.NIL;
        }
        return new_pph_phrase_agr_low(absolute_constraint, relative_constraint);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 9615L)
    public static SubLObject new_pph_phrase_agr_low(final SubLObject absolute_constraint, final SubLObject relative_constraint) {
        final SubLObject agr = make_pph_phrase_agr((SubLObject)pph_data_structures.UNPROVIDED);
        _csetf_pph_phrase_agr_absolute_constraint(agr, absolute_constraint);
        _csetf_pph_phrase_agr_relative_constraint(agr, relative_constraint);
        return agr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 9897L)
    public static SubLObject new_dont_care_pph_phrase_agr() {
        return new_pph_phrase_agr_low(pph_utilities.new_pph_dont_care_agr_constraint(), (SubLObject)pph_data_structures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 10021L)
    public static SubLObject dont_care_pph_phrase_agr_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_data_structures.NIL != pph_phrase_agr_p(obj) && pph_data_structures.NIL != pph_utilities.pph_dont_care_agr_constraint_p(pph_phrase_agr_absolute_constraint(obj)) && pph_data_structures.NIL == pph_phrase_agr_relative_constraint(obj));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 10260L)
    public static SubLObject pph_phrase_agr_set_absolute_constraint(final SubLObject phrase_agr, final SubLObject constraint) {
        _csetf_pph_phrase_agr_absolute_constraint(phrase_agr, constraint);
        return phrase_agr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 10538L)
    public static SubLObject pph_phrase_agr_set_relative_constraint(final SubLObject phrase_agr, final SubLObject constraint) {
        _csetf_pph_phrase_agr_relative_constraint(phrase_agr, constraint);
        return phrase_agr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 10816L)
    public static SubLObject pph_phrase_agr_copy(final SubLObject phrase_agr, SubLObject copied_phrases) {
        if (copied_phrases == pph_data_structures.UNPROVIDED) {
            copied_phrases = dictionary.new_dictionary((SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED);
        }
        final SubLObject absolute_constraint = pph_phrase_agr_absolute_constraint(phrase_agr);
        final SubLObject old_relative_constraint = pph_phrase_agr_relative_constraint(phrase_agr);
        final SubLObject new_relative_constraint = pph_phrase_agr_relative_constraint_copy(old_relative_constraint, copied_phrases);
        return new_pph_phrase_agr(absolute_constraint, new_relative_constraint);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 11308L)
    public static SubLObject pph_phrase_agr_relative_constraint_copy(final SubLObject constraint, final SubLObject copied_phrases) {
        if (pph_data_structures.NIL == pph_utilities.pph_agr_constraint_p(constraint)) {
            return (SubLObject)pph_data_structures.NIL;
        }
        final SubLObject constraint_type = pph_utilities.pph_agr_constraint_type(constraint);
        final SubLObject old_target = pph_utilities.pph_agr_constraint_target(constraint);
        final SubLObject new_target = find_new_pph_relative_agr_target(old_target, copied_phrases);
        if (pph_data_structures.NIL != pph_phrase.pph_phrase_p(new_target, (SubLObject)pph_data_structures.UNPROVIDED)) {
            dictionary.dictionary_enter(copied_phrases, old_target, new_target);
        }
        return pph_utilities.new_pph_agr_constraint(constraint_type, new_target);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 11812L)
    public static SubLObject find_new_pph_relative_agr_target(final SubLObject old_target, final SubLObject copied_phrases) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_data_structures.NIL == pph_phrase.pph_phrase_p(old_target, (SubLObject)pph_data_structures.UNPROVIDED)) {
            return old_target;
        }
        final SubLObject done_copy = dictionary.dictionary_lookup(copied_phrases, old_target, (SubLObject)pph_data_structures.UNPROVIDED);
        if (pph_data_structures.NIL != done_copy) {
            return done_copy;
        }
        if (pph_data_structures.NIL != pph_vars.$pph_retain_original_relative_targetsP$.getDynamicValue(thread)) {
            return old_target;
        }
        return pph_phrase.pph_phrase_copy_int(old_target, copied_phrases, (SubLObject)pph_data_structures.NIL, (SubLObject)pph_data_structures.NIL, (SubLObject)pph_data_structures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 12309L)
    public static SubLObject cfasl_output_object_pph_phrase_agr_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_pph_phrase_agr(v_object, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 12431L)
    public static SubLObject cfasl_output_pph_phrase_agr(final SubLObject pph_phrase_agr, final SubLObject stream) {
        cfasl.cfasl_raw_write_byte(pph_data_structures.$cfasl_opcode_pph_phrase_agr$.getGlobalValue(), stream);
        cfasl.cfasl_output(pph_phrase_agr_absolute_constraint(pph_phrase_agr), stream);
        final SubLObject relcon = pph_phrase_agr_relative_constraint(pph_phrase_agr);
        if (pph_data_structures.NIL != pph_utilities.pph_agr_constraint_p(relcon)) {
            final SubLObject type = pph_utilities.pph_agr_constraint_type(relcon);
            final SubLObject target = pph_utilities.pph_agr_constraint_target(relcon);
            if (pph_data_structures.NIL != pph_phrase.pph_phrase_p(target, (SubLObject)pph_data_structures.UNPROVIDED)) {
                cfasl.cfasl_output((SubLObject)ConsesLow.cons(type, pph_phrase.pph_phrase_suid(target)), stream);
            }
            else {
                cfasl.cfasl_output(relcon, stream);
            }
        }
        else {
            cfasl.cfasl_output(relcon, stream);
        }
        return pph_phrase_agr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 13093L)
    public static SubLObject cfasl_input_pph_phrase_agr(final SubLObject stream) {
        SubLObject pph_phrase_agr = (SubLObject)pph_data_structures.NIL;
        pph_phrase_agr = make_pph_phrase_agr((SubLObject)pph_data_structures.UNPROVIDED);
        _csetf_pph_phrase_agr_absolute_constraint(pph_phrase_agr, cfasl.cfasl_input(stream, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED));
        final SubLObject relcon = cfasl.cfasl_input(stream, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED);
        final SubLObject type = pph_utilities.pph_agr_constraint_type(relcon);
        SubLObject target = pph_utilities.pph_agr_constraint_target(relcon);
        if (target.isInteger()) {
            final SubLObject v_pph_phrase = find_pph_phrase_by_id(target);
            if (pph_data_structures.NIL != pph_phrase.pph_phrase_p(v_pph_phrase, (SubLObject)pph_data_structures.UNPROVIDED)) {
                target = v_pph_phrase;
            }
            else {
                Errors.warn((SubLObject)pph_data_structures.$str71$Could_not_find_pph_phrase_with_su);
            }
        }
        _csetf_pph_phrase_agr_relative_constraint(pph_phrase_agr, pph_utilities.new_pph_agr_constraint(type, target));
        return pph_phrase_agr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 14487L)
    public static SubLObject paraphrase_phrase_info_bundle_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_pph_phrase_info_bundle(v_object, stream, (SubLObject)pph_data_structures.ZERO_INTEGER);
        return (SubLObject)pph_data_structures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 14487L)
    public static SubLObject paraphrase_phrase_info_bundle_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $paraphrase_phrase_info_bundle_native.class) ? pph_data_structures.T : pph_data_structures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 14487L)
    public static SubLObject pph_phrase_info_cycl(final SubLObject v_object) {
        assert pph_data_structures.NIL != paraphrase_phrase_info_bundle_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 14487L)
    public static SubLObject pph_phrase_info_agr(final SubLObject v_object) {
        assert pph_data_structures.NIL != paraphrase_phrase_info_bundle_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 14487L)
    public static SubLObject pph_phrase_info_justification(final SubLObject v_object) {
        assert pph_data_structures.NIL != paraphrase_phrase_info_bundle_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 14487L)
    public static SubLObject pph_phrase_info_output_list(final SubLObject v_object) {
        assert pph_data_structures.NIL != paraphrase_phrase_info_bundle_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 14487L)
    public static SubLObject pph_phrase_info_arg_position_map(final SubLObject v_object) {
        assert pph_data_structures.NIL != paraphrase_phrase_info_bundle_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 14487L)
    public static SubLObject pph_phrase_info_other(final SubLObject v_object) {
        assert pph_data_structures.NIL != paraphrase_phrase_info_bundle_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 14487L)
    public static SubLObject _csetf_pph_phrase_info_cycl(final SubLObject v_object, final SubLObject value) {
        assert pph_data_structures.NIL != paraphrase_phrase_info_bundle_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 14487L)
    public static SubLObject _csetf_pph_phrase_info_agr(final SubLObject v_object, final SubLObject value) {
        assert pph_data_structures.NIL != paraphrase_phrase_info_bundle_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 14487L)
    public static SubLObject _csetf_pph_phrase_info_justification(final SubLObject v_object, final SubLObject value) {
        assert pph_data_structures.NIL != paraphrase_phrase_info_bundle_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 14487L)
    public static SubLObject _csetf_pph_phrase_info_output_list(final SubLObject v_object, final SubLObject value) {
        assert pph_data_structures.NIL != paraphrase_phrase_info_bundle_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 14487L)
    public static SubLObject _csetf_pph_phrase_info_arg_position_map(final SubLObject v_object, final SubLObject value) {
        assert pph_data_structures.NIL != paraphrase_phrase_info_bundle_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 14487L)
    public static SubLObject _csetf_pph_phrase_info_other(final SubLObject v_object, final SubLObject value) {
        assert pph_data_structures.NIL != paraphrase_phrase_info_bundle_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 14487L)
    public static SubLObject make_paraphrase_phrase_info_bundle(SubLObject arglist) {
        if (arglist == pph_data_structures.UNPROVIDED) {
            arglist = (SubLObject)pph_data_structures.NIL;
        }
        final SubLObject v_new = (SubLObject)new $paraphrase_phrase_info_bundle_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)pph_data_structures.NIL, next = arglist; pph_data_structures.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)pph_data_structures.$kw93$CYCL)) {
                _csetf_pph_phrase_info_cycl(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pph_data_structures.$kw94$AGR)) {
                _csetf_pph_phrase_info_agr(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pph_data_structures.$kw95$JUSTIFICATION)) {
                _csetf_pph_phrase_info_justification(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pph_data_structures.$kw96$OUTPUT_LIST)) {
                _csetf_pph_phrase_info_output_list(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pph_data_structures.$kw97$ARG_POSITION_MAP)) {
                _csetf_pph_phrase_info_arg_position_map(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pph_data_structures.$kw98$OTHER)) {
                _csetf_pph_phrase_info_other(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)pph_data_structures.$str27$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 14487L)
    public static SubLObject visit_defstruct_paraphrase_phrase_info_bundle(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_data_structures.$kw28$BEGIN, (SubLObject)pph_data_structures.$sym99$MAKE_PARAPHRASE_PHRASE_INFO_BUNDLE, (SubLObject)pph_data_structures.SIX_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_data_structures.$kw30$SLOT, (SubLObject)pph_data_structures.$kw93$CYCL, pph_phrase_info_cycl(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_data_structures.$kw30$SLOT, (SubLObject)pph_data_structures.$kw94$AGR, pph_phrase_info_agr(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_data_structures.$kw30$SLOT, (SubLObject)pph_data_structures.$kw95$JUSTIFICATION, pph_phrase_info_justification(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_data_structures.$kw30$SLOT, (SubLObject)pph_data_structures.$kw96$OUTPUT_LIST, pph_phrase_info_output_list(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_data_structures.$kw30$SLOT, (SubLObject)pph_data_structures.$kw97$ARG_POSITION_MAP, pph_phrase_info_arg_position_map(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_data_structures.$kw30$SLOT, (SubLObject)pph_data_structures.$kw98$OTHER, pph_phrase_info_other(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_data_structures.$kw31$END, (SubLObject)pph_data_structures.$sym99$MAKE_PARAPHRASE_PHRASE_INFO_BUNDLE, (SubLObject)pph_data_structures.SIX_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 14487L)
    public static SubLObject visit_defstruct_object_paraphrase_phrase_info_bundle_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_paraphrase_phrase_info_bundle(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 14885L)
    public static SubLObject pph_phrase_has_info_vector_p(final SubLObject phrase) {
        final SubLObject vector = pph_phrase_info_vector(phrase);
        return pph_info_vector_p(vector);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 15101L)
    public static SubLObject pph_empty_info_vector_p(final SubLObject v_object) {
        return Equality.eq(v_object, pph_data_structures.$pph_empty_info_vector$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 15198L)
    public static SubLObject pph_info_vector_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isVector() || pph_data_structures.NIL != pph_empty_info_vector_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 15314L)
    public static SubLObject pph_phrase_plist(final SubLObject phrase) {
        final SubLObject other = pph_phrase_info_other(document.sign_info(phrase));
        return (pph_data_structures.NIL != pph_phrase_has_info_vector_p(phrase)) ? other.rest() : other;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 15494L)
    public static SubLObject pph_phrase_do_plist(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_data_structures.$list102);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject property = (SubLObject)pph_data_structures.NIL;
        SubLObject value = (SubLObject)pph_data_structures.NIL;
        SubLObject phrase = (SubLObject)pph_data_structures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_data_structures.$list102);
        property = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_data_structures.$list102);
        value = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_data_structures.$list102);
        phrase = current.first();
        current = current.rest();
        if (pph_data_structures.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject plist = (SubLObject)pph_data_structures.$sym103$PLIST;
            return (SubLObject)ConsesLow.list((SubLObject)pph_data_structures.$sym104$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(plist, (SubLObject)ConsesLow.list((SubLObject)pph_data_structures.$sym105$PPH_PHRASE_PLIST, phrase))), (SubLObject)ConsesLow.listS((SubLObject)pph_data_structures.$sym106$DO_PLIST, (SubLObject)ConsesLow.list(property, value, plist), ConsesLow.append(body, (SubLObject)pph_data_structures.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_data_structures.$list102);
        return (SubLObject)pph_data_structures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 15712L)
    public static SubLObject pph_phrase_info_lookup(final SubLObject phrase, final SubLObject property, SubLObject v_default) {
        if (v_default == pph_data_structures.UNPROVIDED) {
            v_default = (SubLObject)pph_data_structures.NIL;
        }
        if (pph_data_structures.NIL != subl_promotions.non_negative_integer_p(property)) {
            return pph_phrase_info_vector_lookup(phrase, property, v_default);
        }
        final SubLObject plist = pph_phrase_plist(phrase);
        return conses_high.getf(plist, property, v_default);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 16087L)
    public static SubLObject pph_phrase_info_lookup_by_keyword_or_integer(final SubLObject phrase, final SubLObject keyword, final SubLObject integer, SubLObject v_default) {
        if (v_default == pph_data_structures.UNPROVIDED) {
            v_default = (SubLObject)pph_data_structures.NIL;
        }
        return (pph_data_structures.NIL != pph_phrase_has_info_vector_p(phrase)) ? pph_phrase_info_lookup(phrase, integer, v_default) : pph_phrase_info_lookup(phrase, keyword, v_default);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 16597L)
    public static SubLObject pph_phrase_info_property_set_p(final SubLObject phrase, final SubLObject property, final SubLObject n) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_data_structures.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !n.eql(Sequences.position(property, pph_info_vector_slots(), (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED))) {
            Errors.error((SubLObject)pph_data_structures.$str107$_S_should_be__S__not__S, property, Sequences.position(property, pph_info_vector_slots(), (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED), n);
        }
        return (SubLObject)((pph_data_structures.NIL != pph_phrase_has_info_vector_p(phrase)) ? SubLObjectFactory.makeBoolean(!pph_data_structures.$pph_info_vector_unspecified_value$.getGlobalValue().eql(pph_phrase_info_vector_lookup_no_default(phrase, n))) : list_utilities.plist_has_keyP(pph_phrase_plist(phrase), property));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 17036L)
    public static SubLObject pph_phrase_info_set(final SubLObject phrase, final SubLObject property, final SubLObject value) {
        if (pph_data_structures.NIL != subl_promotions.non_negative_integer_p(property)) {
            pph_phrase_info_vector_set(phrase, property, value);
        }
        else if (pph_data_structures.NIL != pph_phrase_has_info_vector_p(phrase)) {
            ConsesLow.rplacd(pph_phrase_info_other(document.sign_info(phrase)), conses_high.putf(pph_phrase_plist(phrase), property, value));
        }
        else {
            _csetf_pph_phrase_info_other(document.sign_info(phrase), conses_high.putf(pph_phrase_plist(phrase), property, value));
        }
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 17591L)
    public static SubLObject pph_phrase_info_set_by_keyword_or_integer(final SubLObject phrase, final SubLObject keyword, final SubLObject integer, final SubLObject value) {
        return (pph_data_structures.NIL != pph_phrase_has_info_vector_p(phrase)) ? pph_phrase_info_set(phrase, integer, value) : pph_phrase_info_set(phrase, keyword, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 17832L)
    public static SubLObject pph_phrase_info_clear(final SubLObject phrase, final SubLObject property) {
        if (pph_data_structures.NIL != pph_phrase_has_info_vector_p(phrase)) {
            ConsesLow.rplacd(pph_phrase_info_other(document.sign_info(phrase)), conses_high.remf(pph_phrase_plist(phrase), property));
        }
        else {
            _csetf_pph_phrase_info_other(document.sign_info(phrase), conses_high.remf(pph_phrase_plist(phrase), property));
        }
        return pph_phrase_info_lookup(phrase, property, (SubLObject)pph_data_structures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 18504L)
    public static SubLObject pph_phrase_output_item_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_pph_phrase_output_item(v_object, stream, (SubLObject)pph_data_structures.ZERO_INTEGER);
        return (SubLObject)pph_data_structures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 18504L)
    public static SubLObject pph_phrase_output_item_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $pph_phrase_output_item_native.class) ? pph_data_structures.T : pph_data_structures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 18504L)
    public static SubLObject pph_oi_string(final SubLObject v_object) {
        assert pph_data_structures.NIL != pph_phrase_output_item_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 18504L)
    public static SubLObject pph_oi_arg_position(final SubLObject v_object) {
        assert pph_data_structures.NIL != pph_phrase_output_item_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 18504L)
    public static SubLObject pph_oi_cycl(final SubLObject v_object) {
        assert pph_data_structures.NIL != pph_phrase_output_item_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 18504L)
    public static SubLObject pph_oi_html_open_tag(final SubLObject v_object) {
        assert pph_data_structures.NIL != pph_phrase_output_item_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 18504L)
    public static SubLObject pph_oi_html_close_tag(final SubLObject v_object) {
        assert pph_data_structures.NIL != pph_phrase_output_item_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 18504L)
    public static SubLObject pph_oi_agr(final SubLObject v_object) {
        assert pph_data_structures.NIL != pph_phrase_output_item_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 18504L)
    public static SubLObject _csetf_pph_oi_string(final SubLObject v_object, final SubLObject value) {
        assert pph_data_structures.NIL != pph_phrase_output_item_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 18504L)
    public static SubLObject _csetf_pph_oi_arg_position(final SubLObject v_object, final SubLObject value) {
        assert pph_data_structures.NIL != pph_phrase_output_item_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 18504L)
    public static SubLObject _csetf_pph_oi_cycl(final SubLObject v_object, final SubLObject value) {
        assert pph_data_structures.NIL != pph_phrase_output_item_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 18504L)
    public static SubLObject _csetf_pph_oi_html_open_tag(final SubLObject v_object, final SubLObject value) {
        assert pph_data_structures.NIL != pph_phrase_output_item_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 18504L)
    public static SubLObject _csetf_pph_oi_html_close_tag(final SubLObject v_object, final SubLObject value) {
        assert pph_data_structures.NIL != pph_phrase_output_item_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 18504L)
    public static SubLObject _csetf_pph_oi_agr(final SubLObject v_object, final SubLObject value) {
        assert pph_data_structures.NIL != pph_phrase_output_item_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 18504L)
    public static SubLObject make_pph_phrase_output_item(SubLObject arglist) {
        if (arglist == pph_data_structures.UNPROVIDED) {
            arglist = (SubLObject)pph_data_structures.NIL;
        }
        final SubLObject v_new = (SubLObject)new $pph_phrase_output_item_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)pph_data_structures.NIL, next = arglist; pph_data_structures.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)pph_data_structures.$kw129$STRING)) {
                _csetf_pph_oi_string(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pph_data_structures.$kw130$ARG_POSITION)) {
                _csetf_pph_oi_arg_position(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pph_data_structures.$kw93$CYCL)) {
                _csetf_pph_oi_cycl(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pph_data_structures.$kw131$HTML_OPEN_TAG)) {
                _csetf_pph_oi_html_open_tag(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pph_data_structures.$kw132$HTML_CLOSE_TAG)) {
                _csetf_pph_oi_html_close_tag(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pph_data_structures.$kw94$AGR)) {
                _csetf_pph_oi_agr(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)pph_data_structures.$str27$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 18504L)
    public static SubLObject visit_defstruct_pph_phrase_output_item(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_data_structures.$kw28$BEGIN, (SubLObject)pph_data_structures.$sym133$MAKE_PPH_PHRASE_OUTPUT_ITEM, (SubLObject)pph_data_structures.SIX_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_data_structures.$kw30$SLOT, (SubLObject)pph_data_structures.$kw129$STRING, pph_oi_string(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_data_structures.$kw30$SLOT, (SubLObject)pph_data_structures.$kw130$ARG_POSITION, pph_oi_arg_position(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_data_structures.$kw30$SLOT, (SubLObject)pph_data_structures.$kw93$CYCL, pph_oi_cycl(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_data_structures.$kw30$SLOT, (SubLObject)pph_data_structures.$kw131$HTML_OPEN_TAG, pph_oi_html_open_tag(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_data_structures.$kw30$SLOT, (SubLObject)pph_data_structures.$kw132$HTML_CLOSE_TAG, pph_oi_html_close_tag(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_data_structures.$kw30$SLOT, (SubLObject)pph_data_structures.$kw94$AGR, pph_oi_agr(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_data_structures.$kw31$END, (SubLObject)pph_data_structures.$sym133$MAKE_PPH_PHRASE_OUTPUT_ITEM, (SubLObject)pph_data_structures.SIX_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 18504L)
    public static SubLObject visit_defstruct_object_pph_phrase_output_item_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_pph_phrase_output_item(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 18808L)
    public static SubLObject new_pph_phrase_output_item(SubLObject string, SubLObject arg_position, SubLObject cycl, SubLObject html_open_tag, SubLObject html_close_tag, SubLObject agr) {
        if (string == pph_data_structures.UNPROVIDED) {
            string = string_utilities.$empty_string$.getGlobalValue();
        }
        if (arg_position == pph_data_structures.UNPROVIDED) {
            arg_position = pph_utilities.pph_unknown_arg_position();
        }
        if (cycl == pph_data_structures.UNPROVIDED) {
            cycl = (SubLObject)pph_data_structures.NIL;
        }
        if (html_open_tag == pph_data_structures.UNPROVIDED) {
            html_open_tag = (SubLObject)pph_data_structures.NIL;
        }
        if (html_close_tag == pph_data_structures.UNPROVIDED) {
            html_close_tag = (SubLObject)pph_data_structures.NIL;
        }
        if (agr == pph_data_structures.UNPROVIDED) {
            agr = (SubLObject)pph_data_structures.NIL;
        }
        assert pph_data_structures.NIL != pph_string.pph_string_p(string) : string;
        final SubLObject item = make_pph_phrase_output_item((SubLObject)pph_data_structures.UNPROVIDED);
        _csetf_pph_oi_string(item, string);
        _csetf_pph_oi_arg_position(item, arg_position);
        _csetf_pph_oi_cycl(item, cycl);
        _csetf_pph_oi_html_open_tag(item, html_open_tag);
        _csetf_pph_oi_html_close_tag(item, html_close_tag);
        _csetf_pph_oi_agr(item, agr);
        return item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 19362L)
    public static SubLObject pph_phrase_output_item_copy(final SubLObject original) {
        if (pph_data_structures.NIL != pph_phrase_output_item_p(original)) {
            final SubLObject string = pph_oi_string(original);
            final SubLObject arg_position = pph_oi_arg_position(original);
            final SubLObject cycl = pph_oi_cycl(original);
            final SubLObject html_open_tag = pph_oi_html_open_tag(original);
            final SubLObject html_close_tag = pph_oi_html_close_tag(original);
            final SubLObject agr = pph_oi_agr(original);
            return new_pph_phrase_output_item(string, arg_position, cycl, html_open_tag, html_close_tag, agr);
        }
        if (pph_data_structures.NIL != pph_phrase_output_item_nospace_group_p(original)) {
            return pph_phrase_output_item_nospace_group_copy(original);
        }
        if (pph_data_structures.NIL != enhanced_pph_output_item_p(original)) {
            return new_enhanced_pph_output_item(pph_phrase_output_item_copy(enhanced_pph_output_item_item(original)), enhanced_pph_output_item_demerits(original), conses_high.copy_list(enhanced_pph_output_item_justification(original)));
        }
        return (SubLObject)pph_data_structures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 20245L)
    public static SubLObject pprint_pph_phrase_output_item(final SubLObject item, SubLObject stream, SubLObject depth) {
        if (stream == pph_data_structures.UNPROVIDED) {
            stream = (SubLObject)pph_data_structures.NIL;
        }
        if (depth == pph_data_structures.UNPROVIDED) {
            depth = (SubLObject)pph_data_structures.NIL;
        }
        PrintLow.format(stream, (SubLObject)pph_data_structures.$str136$_PPH_OI__S__S__S__S__S__S___, new SubLObject[] { pph_oi_string(item), pph_oi_arg_position(item), pph_oi_cycl(item), pph_oi_html_open_tag(item), pph_oi_html_close_tag(item), pph_oi_agr(item) });
        return item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 20562L)
    public static SubLObject pph_phrase_output_item_string(final SubLObject item) {
        if (pph_data_structures.NIL != pph_phrase_output_item_p(item)) {
            return pph_oi_string(item);
        }
        if (pph_data_structures.NIL != pph_phrase_output_item_nospace_group_p(item)) {
            return pph_phrase_output_item_nospace_group_string(item);
        }
        if (pph_data_structures.NIL != enhanced_pph_output_item_p(item)) {
            return pph_phrase_output_item_string(enhanced_pph_output_item_item(item));
        }
        return (SubLObject)pph_data_structures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 20927L)
    public static SubLObject pph_phrase_output_item_set_string(final SubLObject item, final SubLObject string) {
        assert pph_data_structures.NIL != pph_string.pph_string_p(string) : string;
        if (pph_data_structures.NIL != pph_phrase_output_item_p(item)) {
            _csetf_pph_oi_string(item, string);
        }
        else if (pph_data_structures.NIL != enhanced_pph_output_item_p(item)) {
            pph_phrase_output_item_set_string(enhanced_pph_output_item_item(item), string);
        }
        return item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 21253L)
    public static SubLObject pph_phrase_output_item_prefix_string(final SubLObject item, final SubLObject prefix) {
        if (pph_data_structures.NIL != pph_phrase_output_item_p(item)) {
            final SubLObject existing_string = pph_phrase_output_item_string(item);
            final SubLObject new_string = (pph_data_structures.NIL != pph_string.pph_string_p(existing_string)) ? pph_string.pph_string_concatenate(prefix, existing_string) : prefix;
            return pph_phrase_output_item_set_string(item, new_string);
        }
        if (pph_data_structures.NIL != pph_phrase_output_item_nospace_group_p(item)) {
            final SubLObject old_items = pph_phrase_output_item_nospace_group_items(item);
            final SubLObject new_items = (SubLObject)ConsesLow.list(new_pph_phrase_output_item(prefix, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED));
            final SubLObject combined = (SubLObject)ConsesLow.cons(new_items, old_items);
            pph_phrase_output_item_nospace_group_set_items(item, combined);
            return item;
        }
        if (pph_data_structures.NIL != enhanced_pph_output_item_p(item)) {
            return pph_phrase_output_item_prefix_string(enhanced_pph_output_item_item(item), prefix);
        }
        return (SubLObject)pph_data_structures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 22110L)
    public static SubLObject pph_phrase_output_item_suffix_string(final SubLObject item, final SubLObject suffix) {
        if (pph_data_structures.NIL != pph_phrase_output_item_p(item)) {
            final SubLObject existing_string = pph_phrase_output_item_string(item);
            final SubLObject new_string = (pph_data_structures.NIL != pph_string.pph_string_p(existing_string)) ? pph_string.pph_string_concatenate(existing_string, suffix) : suffix;
            return pph_phrase_output_item_set_string(item, new_string);
        }
        if (pph_data_structures.NIL != pph_phrase_output_item_nospace_group_p(item)) {
            final SubLObject old_items = pph_phrase_output_item_nospace_group_items(item);
            final SubLObject new_items = (SubLObject)ConsesLow.list(new_pph_phrase_output_item(suffix, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED));
            final SubLObject combined = list_utilities.snoc(new_items, old_items);
            pph_phrase_output_item_nospace_group_set_items(item, combined);
            return item;
        }
        if (pph_data_structures.NIL != enhanced_pph_output_item_p(item)) {
            return pph_phrase_output_item_suffix_string(enhanced_pph_output_item_item(item), suffix);
        }
        return (SubLObject)pph_data_structures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 22961L)
    public static SubLObject pph_phrase_output_item_arg_position(final SubLObject item) {
        if (pph_data_structures.NIL != pph_phrase_output_item_p(item)) {
            return pph_oi_arg_position(item);
        }
        if (pph_data_structures.NIL != pph_phrase_output_item_nospace_group_p(item)) {
            return pph_phrase_output_item_nospace_group_arg_position(item);
        }
        if (pph_data_structures.NIL != enhanced_pph_output_item_p(item)) {
            return pph_phrase_output_item_arg_position(enhanced_pph_output_item_item(item));
        }
        return (SubLObject)pph_data_structures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 23350L)
    public static SubLObject pph_phrase_output_item_set_arg_position(final SubLObject item, final SubLObject arg_position) {
        if (pph_data_structures.NIL != pph_phrase_output_item_p(item)) {
            _csetf_pph_oi_arg_position(item, arg_position);
        }
        else {
            if (pph_data_structures.NIL != pph_phrase_output_item_nospace_group_p(item)) {
                return pph_phrase_output_item_nospace_group_set_arg_position(item, arg_position);
            }
            if (pph_data_structures.NIL != enhanced_pph_output_item_p(item)) {
                return pph_phrase_output_item_set_arg_position(enhanced_pph_output_item_item(item), arg_position);
            }
        }
        return item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 23818L)
    public static SubLObject pph_phrase_output_item_cycl(final SubLObject item) {
        if (pph_data_structures.NIL != pph_phrase_output_item_p(item)) {
            return pph_oi_cycl(item);
        }
        if (pph_data_structures.NIL != pph_phrase_output_item_nospace_group_p(item)) {
            return pph_phrase_output_item_nospace_group_cycl(item);
        }
        if (pph_data_structures.NIL != enhanced_pph_output_item_p(item)) {
            return pph_phrase_output_item_cycl(enhanced_pph_output_item_item(item));
        }
        return (SubLObject)pph_data_structures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 24175L)
    public static SubLObject pph_phrase_output_item_set_cycl(final SubLObject item, final SubLObject cycl) {
        if (pph_data_structures.NIL != pph_phrase.pph_known_cycl_p(cycl) && pph_data_structures.NIL != pph_vars.pph_forbidden_string_for_termP(cycl, pph_phrase_output_item_string(item))) {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_data_structures.$str37$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_data_structures.TWO_INTEGER), pph_data_structures.$str38$__, format_nil.format_nil_a_no_copy((SubLObject)pph_data_structures.$str137$_S_is_a_forbidden_paraphrase_for_) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(pph_phrase_output_item_string(item), cycl));
        }
        else if (pph_data_structures.NIL != pph_phrase_output_item_p(item)) {
            _csetf_pph_oi_cycl(item, cycl);
        }
        else {
            if (pph_data_structures.NIL != pph_phrase_output_item_nospace_group_p(item)) {
                return pph_phrase_output_item_nospace_group_set_cycl(item, cycl);
            }
            if (pph_data_structures.NIL != enhanced_pph_output_item_p(item)) {
                return pph_phrase_output_item_set_cycl(enhanced_pph_output_item_item(item), cycl);
            }
        }
        return item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 24799L)
    public static SubLObject pph_phrase_output_item_agr_pred(final SubLObject item) {
        if (pph_data_structures.NIL != pph_phrase_output_item_p(item)) {
            return pph_oi_agr(item);
        }
        if (pph_data_structures.NIL != pph_phrase_output_item_nospace_group_p(item)) {
            return pph_phrase_output_item_nospace_group_agr_pred(item);
        }
        if (pph_data_structures.NIL != enhanced_pph_output_item_p(item)) {
            return pph_phrase_output_item_agr_pred(enhanced_pph_output_item_item(item));
        }
        return (SubLObject)pph_data_structures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 25167L)
    public static SubLObject pph_phrase_output_item_set_agr_pred(final SubLObject item, final SubLObject agr_pred) {
        if (pph_data_structures.NIL != pph_phrase_output_item_p(item)) {
            _csetf_pph_oi_agr(item, agr_pred);
        }
        else {
            if (pph_data_structures.NIL != pph_phrase_output_item_nospace_group_p(item)) {
                return pph_phrase_output_item_nospace_group_set_agr_pred(item, agr_pred);
            }
            if (pph_data_structures.NIL != enhanced_pph_output_item_p(item)) {
                return pph_phrase_output_item_set_agr_pred(enhanced_pph_output_item_item(item), agr_pred);
            }
        }
        return item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 25598L)
    public static SubLObject pph_phrase_output_item_html_open_tag(final SubLObject item) {
        if (pph_data_structures.NIL != pph_phrase_output_item_p(item)) {
            return pph_oi_html_open_tag(item);
        }
        if (pph_data_structures.NIL != pph_phrase_output_item_nospace_group_p(item)) {
            return pph_phrase_output_item_nospace_group_html_open_tag(item);
        }
        if (pph_data_structures.NIL != enhanced_pph_output_item_p(item)) {
            return pph_phrase_output_item_html_open_tag(enhanced_pph_output_item_item(item));
        }
        return (SubLObject)pph_data_structures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 25991L)
    public static SubLObject pph_phrase_output_item_html_close_tag(final SubLObject item) {
        if (pph_data_structures.NIL != pph_phrase_output_item_p(item)) {
            return pph_oi_html_close_tag(item);
        }
        if (pph_data_structures.NIL != pph_phrase_output_item_nospace_group_p(item)) {
            return pph_phrase_output_item_nospace_group_html_close_tag(item);
        }
        if (pph_data_structures.NIL != enhanced_pph_output_item_p(item)) {
            return pph_phrase_output_item_html_close_tag(enhanced_pph_output_item_item(item));
        }
        return (SubLObject)pph_data_structures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 26388L)
    public static SubLObject pph_phrase_output_item_html_tags(final SubLObject item) {
        return (SubLObject)ConsesLow.list(pph_phrase_output_item_html_open_tag(item), pph_phrase_output_item_html_close_tag(item));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 26559L)
    public static SubLObject pph_phrase_output_item_set_html_tags(final SubLObject item, final SubLObject open_tag, final SubLObject close_tag) {
        if (pph_data_structures.NIL != pph_phrase_output_item_p(item)) {
            _csetf_pph_oi_html_open_tag(item, open_tag);
            _csetf_pph_oi_html_close_tag(item, close_tag);
        }
        else {
            if (pph_data_structures.NIL != pph_phrase_output_item_nospace_group_p(item)) {
                return pph_phrase_output_item_nospace_group_set_html_tags(item, open_tag, close_tag);
            }
            if (pph_data_structures.NIL != enhanced_pph_output_item_p(item)) {
                pph_phrase_output_item_set_html_tags(enhanced_pph_output_item_item(item), open_tag, close_tag);
            }
        }
        return item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 27078L)
    public static SubLObject pph_phrase_output_item_demerits(final SubLObject item) {
        assert pph_data_structures.NIL != pph_phrase_output_item_loose_p(item) : item;
        if (pph_data_structures.NIL != enhanced_pph_output_item_p(item)) {
            return enhanced_pph_output_item_demerits(item);
        }
        return (SubLObject)pph_data_structures.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 27303L)
    public static SubLObject pph_phrase_output_item_justification(final SubLObject item) {
        assert pph_data_structures.NIL != pph_phrase_output_item_loose_p(item) : item;
        if (pph_data_structures.NIL != enhanced_pph_output_item_p(item)) {
            return enhanced_pph_output_item_justification(item);
        }
        return (SubLObject)pph_data_structures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 27539L)
    public static SubLObject new_pph_phrase_output_item_nospace_group(final SubLObject items) {
        return new_pph_phrase_output_item_nospace_group_from_olists(Mapping.mapcar((SubLObject)pph_data_structures.$sym139$LIST, list_utilities.remove_if_not((SubLObject)pph_data_structures.$sym138$PPH_PHRASE_OUTPUT_ITEM_LOOSE_P, items, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 27869L)
    public static SubLObject new_pph_phrase_output_item_nospace_group_from_olists(final SubLObject olists) {
        return (SubLObject)ConsesLow.cons((SubLObject)pph_data_structures.$kw140$NOSPACE, (SubLObject)ConsesLow.cons(new_pph_phrase_output_item((SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED), olists));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 28125L)
    public static SubLObject pph_phrase_output_item_nospace_group_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_data_structures.NIL != list_utilities.proper_list_p(obj) && pph_data_structures.$kw140$NOSPACE == obj.first() && pph_data_structures.NIL != pph_phrase_output_item_p(conses_high.second(obj)) && pph_data_structures.NIL != list_utilities.every_in_list((SubLObject)pph_data_structures.$sym141$PPH_PHRASE_OUTPUT_LIST_P, pph_phrase_output_item_nospace_group_items(obj), (SubLObject)pph_data_structures.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 28408L)
    public static SubLObject pph_phrase_output_item_nospace_group_items(final SubLObject obj) {
        return obj.rest().rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 28503L)
    public static SubLObject pph_phrase_output_item_nospace_group_set_items(final SubLObject obj, final SubLObject items) {
        ConsesLow.rplacd(obj.rest(), items);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 28622L)
    public static SubLObject pph_phrase_output_item_nospace_group_string(final SubLObject obj) {
        SubLObject ans = (SubLObject)pph_data_structures.$str142$;
        SubLObject cdolist_list_var = pph_phrase_output_item_nospace_group_items(obj);
        SubLObject olist = (SubLObject)pph_data_structures.NIL;
        olist = cdolist_list_var.first();
        while (pph_data_structures.NIL != cdolist_list_var) {
            ans = pph_string.pph_string_concatenate(ans, pph_phrase.pph_phrase_output_list_string(olist, (SubLObject)pph_data_structures.NIL));
            cdolist_list_var = cdolist_list_var.rest();
            olist = cdolist_list_var.first();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 28886L)
    public static SubLObject pph_phrase_output_item_nospace_group_get_string(final SubLObject item, final SubLObject add_tagsP) {
        final SubLObject open_tag_slot_value = pph_phrase_output_item_html_open_tag(item);
        final SubLObject open_tag = (pph_data_structures.NIL != open_tag_slot_value) ? open_tag_slot_value : string_utilities.$empty_string$.getGlobalValue();
        final SubLObject close_tag_slot_value = pph_phrase_output_item_html_close_tag(item);
        final SubLObject close_tag = (pph_data_structures.NIL != close_tag_slot_value) ? close_tag_slot_value : string_utilities.$empty_string$.getGlobalValue();
        SubLObject item_string = (SubLObject)pph_data_structures.$str142$;
        if (pph_data_structures.NIL != add_tagsP && pph_data_structures.NIL != string_utilities.non_empty_stringP(open_tag)) {
            item_string = pph_string.pph_string_concatenate(item_string, open_tag);
        }
        SubLObject cdolist_list_var = pph_phrase_output_item_nospace_group_items(item);
        SubLObject sub_olist = (SubLObject)pph_data_structures.NIL;
        sub_olist = cdolist_list_var.first();
        while (pph_data_structures.NIL != cdolist_list_var) {
            final SubLObject string = pph_phrase.pph_phrase_output_list_string(sub_olist, add_tagsP);
            if (pph_data_structures.NIL != pph_string.pph_string_p(string)) {
                item_string = pph_string.pph_string_concatenate(item_string, string);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sub_olist = cdolist_list_var.first();
        }
        if (pph_data_structures.NIL != add_tagsP && close_tag.isString()) {
            item_string = pph_string.pph_string_concatenate(item_string, close_tag);
        }
        return item_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 29778L)
    public static SubLObject pph_phrase_output_item_nospace_group_copy(final SubLObject obj) {
        SubLObject olist_copies = (SubLObject)pph_data_structures.NIL;
        SubLObject cdolist_list_var = pph_phrase_output_item_nospace_group_items(obj);
        SubLObject olist = (SubLObject)pph_data_structures.NIL;
        olist = cdolist_list_var.first();
        while (pph_data_structures.NIL != cdolist_list_var) {
            final SubLObject olist_copy = Mapping.mapcar((SubLObject)pph_data_structures.$sym143$PPH_PHRASE_OUTPUT_ITEM_COPY, olist);
            olist_copies = (SubLObject)ConsesLow.cons(olist_copy, olist_copies);
            cdolist_list_var = cdolist_list_var.rest();
            olist = cdolist_list_var.first();
        }
        final SubLObject new_group = new_pph_phrase_output_item_nospace_group_from_olists(Sequences.nreverse(olist_copies));
        ConsesLow.set_nth((SubLObject)pph_data_structures.ONE_INTEGER, new_group, pph_phrase_output_item_copy(conses_high.second(obj)));
        return new_group;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 30248L)
    public static SubLObject pph_phrase_output_item_nospace_group_arg_position(final SubLObject obj) {
        return pph_phrase_output_item_arg_position(conses_high.second(obj));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 30383L)
    public static SubLObject pph_phrase_output_item_nospace_group_set_arg_position(final SubLObject obj, final SubLObject arg_position) {
        return pph_phrase_output_item_set_arg_position(conses_high.second(obj), arg_position);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 30552L)
    public static SubLObject pph_phrase_output_item_nospace_group_cycl(final SubLObject obj) {
        return pph_phrase_output_item_cycl(conses_high.second(obj));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 30671L)
    public static SubLObject pph_phrase_output_item_nospace_group_set_cycl(final SubLObject obj, final SubLObject cycl) {
        return pph_phrase_output_item_set_cycl(conses_high.second(obj), cycl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 30808L)
    public static SubLObject pph_phrase_output_item_nospace_group_agr_pred(final SubLObject obj) {
        return pph_phrase_output_item_agr_pred(conses_high.second(obj));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 30935L)
    public static SubLObject pph_phrase_output_item_nospace_group_set_agr_pred(final SubLObject obj, final SubLObject agr) {
        return pph_phrase_output_item_set_agr_pred(conses_high.second(obj), agr);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 31078L)
    public static SubLObject pph_phrase_output_item_nospace_group_set_html_tags(final SubLObject obj, final SubLObject open_tag, final SubLObject close_tag) {
        return pph_phrase_output_item_set_html_tags(conses_high.second(obj), open_tag, close_tag);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 31253L)
    public static SubLObject pph_phrase_output_item_nospace_group_html_open_tag(final SubLObject obj) {
        return pph_phrase_output_item_html_open_tag(conses_high.second(obj));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 31392L)
    public static SubLObject pph_phrase_output_item_nospace_group_html_close_tag(final SubLObject obj) {
        return pph_phrase_output_item_html_close_tag(conses_high.second(obj));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 31533L)
    public static SubLObject pph_phrase_output_item_loose_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_data_structures.NIL != pph_phrase_output_item_p(obj) || pph_data_structures.NIL != pph_phrase_output_item_nospace_group_p(obj) || pph_data_structures.NIL != enhanced_pph_output_item_p(obj));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 31723L)
    public static SubLObject enhanced_pph_output_item_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isVector() && pph_data_structures.NIL != list_utilities.lengthE(v_object, (SubLObject)pph_data_structures.THREE_INTEGER, (SubLObject)pph_data_structures.UNPROVIDED) && pph_data_structures.NIL != subl_promotions.non_negative_integer_p(Vectors.aref(v_object, (SubLObject)pph_data_structures.ONE_INTEGER)) && Vectors.aref(v_object, (SubLObject)pph_data_structures.TWO_INTEGER).isList() && pph_data_structures.NIL != pph_phrase_output_item_loose_p(Vectors.aref(v_object, (SubLObject)pph_data_structures.ZERO_INTEGER)) && pph_data_structures.NIL == enhanced_pph_output_item_p(Vectors.aref(v_object, (SubLObject)pph_data_structures.ZERO_INTEGER)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 32096L)
    public static SubLObject new_enhanced_pph_output_item(final SubLObject output_item, final SubLObject demerits, final SubLObject justification) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert pph_data_structures.NIL != pph_phrase_output_item_loose_p(output_item) : output_item;
        assert pph_data_structures.NIL != subl_promotions.non_negative_integer_p(demerits) : demerits;
        assert pph_data_structures.NIL != Types.listp(justification) : justification;
        if (pph_data_structures.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && pph_data_structures.NIL != enhanced_pph_output_item_p(output_item)) {
            Errors.error((SubLObject)pph_data_structures.$str146$Can_t_make_nested_enhanced_output);
        }
        final SubLObject item = Vectors.make_vector((SubLObject)pph_data_structures.THREE_INTEGER, (SubLObject)pph_data_structures.UNPROVIDED);
        Vectors.set_aref(item, (SubLObject)pph_data_structures.ZERO_INTEGER, output_item);
        Vectors.set_aref(item, (SubLObject)pph_data_structures.ONE_INTEGER, demerits);
        Vectors.set_aref(item, (SubLObject)pph_data_structures.TWO_INTEGER, justification);
        return item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 32587L)
    public static SubLObject enhanced_pph_output_item_item(final SubLObject enhanced_pph_output_item) {
        assert pph_data_structures.NIL != enhanced_pph_output_item_p(enhanced_pph_output_item) : enhanced_pph_output_item;
        return Vectors.aref(enhanced_pph_output_item, (SubLObject)pph_data_structures.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 32773L)
    public static SubLObject enhanced_pph_output_item_demerits(final SubLObject enhanced_pph_output_item) {
        assert pph_data_structures.NIL != enhanced_pph_output_item_p(enhanced_pph_output_item) : enhanced_pph_output_item;
        return Vectors.aref(enhanced_pph_output_item, (SubLObject)pph_data_structures.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 32963L)
    public static SubLObject enhanced_pph_output_item_justification(final SubLObject enhanced_pph_output_item) {
        assert pph_data_structures.NIL != enhanced_pph_output_item_p(enhanced_pph_output_item) : enhanced_pph_output_item;
        return Vectors.aref(enhanced_pph_output_item, (SubLObject)pph_data_structures.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 33158L)
    public static SubLObject enhanced_pph_output_item_set_demerits(final SubLObject enhanced_pph_output_item, final SubLObject demerits) {
        assert pph_data_structures.NIL != enhanced_pph_output_item_p(enhanced_pph_output_item) : enhanced_pph_output_item;
        assert pph_data_structures.NIL != subl_promotions.non_negative_integer_p(demerits) : demerits;
        Vectors.set_aref(enhanced_pph_output_item, (SubLObject)pph_data_structures.ONE_INTEGER, demerits);
        return enhanced_pph_output_item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 33452L)
    public static SubLObject enhanced_pph_output_item_set_justification(final SubLObject enhanced_pph_output_item, final SubLObject justification) {
        assert pph_data_structures.NIL != enhanced_pph_output_item_p(enhanced_pph_output_item) : enhanced_pph_output_item;
        assert pph_data_structures.NIL != Types.listp(justification) : justification;
        Vectors.set_aref(enhanced_pph_output_item, (SubLObject)pph_data_structures.TWO_INTEGER, justification);
        return enhanced_pph_output_item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 33835L)
    public static SubLObject cfasl_output_object_pph_phrase_output_item_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_pph_oi(v_object, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 33957L)
    public static SubLObject cfasl_output_pph_oi(final SubLObject pph_oi, final SubLObject stream) {
        cfasl.cfasl_raw_write_byte(pph_data_structures.$cfasl_opcode_pph_oi$.getGlobalValue(), stream);
        cfasl.cfasl_output(pph_oi_string(pph_oi), stream);
        cfasl.cfasl_output(pph_oi_arg_position(pph_oi), stream);
        cfasl.cfasl_output(pph_oi_cycl(pph_oi), stream);
        cfasl.cfasl_output(pph_oi_html_open_tag(pph_oi), stream);
        cfasl.cfasl_output(pph_oi_html_close_tag(pph_oi), stream);
        cfasl.cfasl_output(pph_oi_agr(pph_oi), stream);
        return pph_oi;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 34378L)
    public static SubLObject cfasl_input_pph_oi(final SubLObject stream) {
        SubLObject pph_oi = (SubLObject)pph_data_structures.NIL;
        pph_oi = make_pph_phrase_output_item((SubLObject)pph_data_structures.UNPROVIDED);
        _csetf_pph_oi_string(pph_oi, cfasl.cfasl_input(stream, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED));
        _csetf_pph_oi_arg_position(pph_oi, cfasl.cfasl_input(stream, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED));
        _csetf_pph_oi_cycl(pph_oi, cfasl.cfasl_input(stream, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED));
        _csetf_pph_oi_html_open_tag(pph_oi, cfasl.cfasl_input(stream, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED));
        _csetf_pph_oi_html_close_tag(pph_oi, cfasl.cfasl_input(stream, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED));
        _csetf_pph_oi_agr(pph_oi, cfasl.cfasl_input(stream, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED));
        return pph_oi;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 34907L)
    public static SubLObject pprint_pph_phrase_info_bundle(final SubLObject bundle, SubLObject stream, SubLObject depth) {
        if (stream == pph_data_structures.UNPROVIDED) {
            stream = (SubLObject)pph_data_structures.NIL;
        }
        if (depth == pph_data_structures.UNPROVIDED) {
            depth = (SubLObject)pph_data_structures.NIL;
        }
        final SubLObject cycl_slot_value = pph_phrase_info_cycl(bundle);
        PrintLow.format(stream, (SubLObject)pph_data_structures.$str151$_S__S, pph_phrase_info_agr(bundle), cycl_slot_value);
        return bundle;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 35355L)
    public static SubLObject new_pph_phrase_limit() {
        return (pph_data_structures.NIL != pph_vars.pph_generate_alternative_phrasesP()) ? ((pph_data_structures.NIL != pph_vars.pph_generate_morphological_alternativesP()) ? pph_data_structures.$a_shitload_of_new_pph_phrases$.getGlobalValue() : pph_data_structures.$a_whole_lot_of_new_pph_phrases$.getGlobalValue()) : pph_data_structures.$a_lot_of_new_pph_phrases$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 35604L)
    public static SubLObject make_pph_phrase_shell(final SubLObject suid) {
        final SubLObject v_pph_phrase = document.new_sign();
        pph_phrase.pph_phrase_set_suid(v_pph_phrase, suid);
        document._csetf_sign_info(v_pph_phrase, make_paraphrase_phrase_info_bundle((SubLObject)pph_data_structures.UNPROVIDED));
        return v_pph_phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 35823L)
    public static SubLObject new_pph_phrase(SubLObject string, SubLObject cycl, SubLObject agr) {
        if (string == pph_data_structures.UNPROVIDED) {
            string = (SubLObject)pph_data_structures.NIL;
        }
        if (cycl == pph_data_structures.UNPROVIDED) {
            cycl = pph_phrase.pph_unknown_cycl();
        }
        if (agr == pph_data_structures.UNPROVIDED) {
            agr = new_dont_care_pph_phrase_agr();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_data_structures.NIL == pph_macros.$creating_permanent_pph_phraseP$.getDynamicValue(thread)) {
            final SubLObject limit = new_pph_phrase_limit();
            if (pph_macros.new_pph_phrase_count().numG(limit)) {
                final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_data_structures.$str37$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_data_structures.ONE_INTEGER), pph_data_structures.$str38$__, format_nil.format_nil_a_no_copy((SubLObject)pph_data_structures.$str155$new_PPH_phrase_limit_of__S_exceed) });
                pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(limit));
            }
        }
        final SubLObject phrase = document.new_sign();
        final SubLObject info_bundle = make_paraphrase_phrase_info_bundle((SubLObject)pph_data_structures.UNPROVIDED);
        _csetf_pph_phrase_info_cycl(info_bundle, cycl);
        _csetf_pph_phrase_info_agr(info_bundle, agr);
        _csetf_pph_phrase_info_other(info_bundle, (SubLObject)ConsesLow.cons(pph_data_structures.$pph_empty_info_vector$.getGlobalValue(), (SubLObject)pph_data_structures.NIL));
        document._csetf_sign_info(phrase, info_bundle);
        pph_phrase.pph_phrase_set_suid(phrase, get_next_pph_phrase_id());
        if (pph_data_structures.NIL == string) {
            document._csetf_sign_string(phrase, (SubLObject)pph_data_structures.NIL);
        }
        else {
            pph_phrase.pph_phrase_set_string(phrase, string);
        }
        pph_phrase.pph_phrase_set_arg_position_map(phrase, pph_utilities.pph_new_identity_map());
        if (pph_data_structures.NIL == pph_macros.$creating_permanent_pph_phraseP$.getDynamicValue(thread)) {
            if (pph_data_structures.NIL != misc_utilities.initialized_p(pph_macros.$new_pph_phrases$.getDynamicValue(thread))) {
                pph_macros.note_new_pph_phrase(phrase);
            }
            else {
                final SubLObject new_format_string2 = Sequences.cconcatenate((SubLObject)pph_data_structures.$str37$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_data_structures.ONE_INTEGER), pph_data_structures.$str38$__, format_nil.format_nil_a_no_copy((SubLObject)pph_data_structures.$str156$New_PPH_phrase_not_expected_to_be) });
                pph_error.pph_handle_error(new_format_string2, (SubLObject)ConsesLow.list(phrase));
            }
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 36983L)
    public static SubLObject populate_pph_phrase(final SubLObject v_pph_phrase, final SubLObject cycl, final SubLObject agr, SubLObject justification, SubLObject output_list, SubLObject arg_position_map, SubLObject info_other) {
        if (justification == pph_data_structures.UNPROVIDED) {
            justification = (SubLObject)pph_data_structures.NIL;
        }
        if (output_list == pph_data_structures.UNPROVIDED) {
            output_list = (SubLObject)pph_data_structures.NIL;
        }
        if (arg_position_map == pph_data_structures.UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_identity_map();
        }
        if (info_other == pph_data_structures.UNPROVIDED) {
            info_other = (SubLObject)ConsesLow.cons(pph_data_structures.$pph_empty_info_vector$.getGlobalValue(), (SubLObject)pph_data_structures.NIL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject info_bundle = document.sign_info(v_pph_phrase);
        _csetf_pph_phrase_info_cycl(info_bundle, cycl);
        _csetf_pph_phrase_info_agr(info_bundle, agr);
        _csetf_pph_phrase_info_justification(info_bundle, justification);
        _csetf_pph_phrase_info_output_list(info_bundle, output_list);
        _csetf_pph_phrase_info_other(info_bundle, info_other);
        pph_phrase.pph_phrase_set_arg_position_map(v_pph_phrase, arg_position_map);
        if (pph_data_structures.NIL == pph_macros.$creating_permanent_pph_phraseP$.getDynamicValue(thread)) {
            if (pph_data_structures.NIL == pph_macros.$destroy_new_pph_phrasesP$.getDynamicValue(thread)) {
                final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_data_structures.$str37$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_data_structures.ONE_INTEGER), pph_data_structures.$str38$__, format_nil.format_nil_a_no_copy((SubLObject)pph_data_structures.$str156$New_PPH_phrase_not_expected_to_be) });
                pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(v_pph_phrase));
            }
            pph_macros.note_new_pph_phrase(v_pph_phrase);
        }
        return v_pph_phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 38698L)
    public static SubLObject pph_info_vector_slots() {
        return pph_data_structures.$pph_info_vector_slots$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 38829L)
    public static SubLObject make_pph_info_vector() {
        final SubLObject length = Sequences.length(pph_data_structures.$pph_info_vector_slots$.getGlobalValue());
        final SubLObject v_default = pph_data_structures.$pph_info_vector_unspecified_value$.getGlobalValue();
        return Vectors.make_vector(length, v_default);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 39011L)
    public static SubLObject pph_phrase_info_vector(final SubLObject phrase) {
        return pph_phrase_info_other(document.sign_info(phrase)).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 39118L)
    public static SubLObject pph_phrase_info_vector_lookup(final SubLObject phrase, final SubLObject index, SubLObject v_default) {
        if (v_default == pph_data_structures.UNPROVIDED) {
            v_default = (SubLObject)pph_data_structures.NIL;
        }
        final SubLObject vector = pph_phrase_info_vector(phrase);
        return pph_info_vector_lookup(vector, index, v_default);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 39307L)
    public static SubLObject pph_phrase_info_vector_lookup_no_default(final SubLObject phrase, final SubLObject index) {
        final SubLObject vector = pph_phrase_info_vector(phrase);
        return pph_info_vector_straight_lookup(vector, index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 39492L)
    public static SubLObject pph_phrase_info_vector_clear(final SubLObject phrase, final SubLObject index) {
        pph_phrase_info_vector_set(phrase, index, pph_data_structures.$pph_info_vector_unspecified_value$.getGlobalValue());
        return index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 39650L)
    public static SubLObject pph_info_vector_lookup(final SubLObject vector, final SubLObject index, final SubLObject v_default) {
        final SubLObject value = pph_info_vector_straight_lookup(vector, index);
        return value.eql(pph_data_structures.$pph_info_vector_unspecified_value$.getGlobalValue()) ? v_default : value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 39857L)
    public static SubLObject pph_info_vector_straight_lookup(final SubLObject vector, final SubLObject index) {
        assert pph_data_structures.NIL != pph_info_vector_p(vector) : vector;
        return (vector.isVector() && pph_data_structures.NIL != list_utilities.lengthG(vector, index, (SubLObject)pph_data_structures.UNPROVIDED)) ? Vectors.aref(vector, index) : pph_data_structures.$pph_info_vector_unspecified_value$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 40084L)
    public static SubLObject pph_phrase_info_vector_set(final SubLObject phrase, final SubLObject index, final SubLObject value) {
        SubLObject vector = pph_phrase_info_vector(phrase);
        if (!vector.isVector() && !value.eql(pph_data_structures.$pph_info_vector_unspecified_value$.getGlobalValue())) {
            vector = make_pph_info_vector();
            ConsesLow.rplaca(pph_phrase_info_other(document.sign_info(phrase)), vector);
        }
        if (vector.isVector()) {
            Vectors.set_aref(vector, index, value);
        }
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 40723L)
    public static SubLObject pph_phrase_id_index() {
        return pph_data_structures.$pph_phrase_id_index$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 40796L)
    public static SubLObject pph_phrase_id_index_new_objects_size() {
        return Hashtables.hash_table_size(id_index.id_index_sparse_objects(pph_data_structures.$pph_phrase_id_index$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 40930L)
    public static SubLObject pph_phrase_id_index_new_objects_count() {
        return id_index.id_index_sparse_object_count(pph_data_structures.$pph_phrase_id_index$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 41052L)
    public static SubLObject clear_pph_phrase_id_index(SubLObject initial_old_object_count) {
        if (initial_old_object_count == pph_data_structures.UNPROVIDED) {
            initial_old_object_count = (SubLObject)pph_data_structures.ZERO_INTEGER;
        }
        pph_data_structures.$pph_phrase_id_index$.setGlobalValue(id_index.new_id_index(initial_old_object_count, (SubLObject)pph_data_structures.UNPROVIDED));
        return (SubLObject)pph_data_structures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 41223L)
    public static SubLObject pph_phrase_id_index_enter(final SubLObject v_pph_phrase, final SubLObject suid) {
        SubLObject release = (SubLObject)pph_data_structures.NIL;
        try {
            release = Locks.seize_lock(pph_data_structures.$pph_phrase_id_index_lock$.getGlobalValue());
            id_index.id_index_enter(pph_phrase_id_index(), suid, v_pph_phrase);
        }
        finally {
            if (pph_data_structures.NIL != release) {
                Locks.release_lock(pph_data_structures.$pph_phrase_id_index_lock$.getGlobalValue());
            }
        }
        return suid;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 41443L)
    public static SubLObject pph_phrase_id_index_remove(final SubLObject suid) {
        SubLObject release = (SubLObject)pph_data_structures.NIL;
        try {
            release = Locks.seize_lock(pph_data_structures.$pph_phrase_id_index_lock$.getGlobalValue());
            id_index.id_index_remove(pph_phrase_id_index(), suid);
        }
        finally {
            if (pph_data_structures.NIL != release) {
                Locks.release_lock(pph_data_structures.$pph_phrase_id_index_lock$.getGlobalValue());
            }
        }
        return suid;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 41639L)
    public static SubLObject optimize_pph_phrase_id_index(SubLObject remove_invalid_pph_phrasesP) {
        if (remove_invalid_pph_phrasesP == pph_data_structures.UNPROVIDED) {
            remove_invalid_pph_phrasesP = (SubLObject)pph_data_structures.T;
        }
        final SubLObject v_id_index = pph_phrase_id_index();
        if (pph_data_structures.NIL != remove_invalid_pph_phrasesP) {
            remove_invalid_pph_phrases();
        }
        SubLObject release = (SubLObject)pph_data_structures.NIL;
        try {
            release = Locks.seize_lock(pph_data_structures.$pph_phrase_id_index_lock$.getGlobalValue());
            id_index.optimize_id_index(id_index.compact_id_index(v_id_index, (SubLObject)pph_data_structures.$sym161$PPH_PHRASE_SET_SUID), (SubLObject)pph_data_structures.UNPROVIDED);
        }
        finally {
            if (pph_data_structures.NIL != release) {
                Locks.release_lock(pph_data_structures.$pph_phrase_id_index_lock$.getGlobalValue());
            }
        }
        return v_id_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 42043L)
    public static SubLObject remove_invalid_pph_phrases() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_id_index = pph_phrase_id_index();
        SubLObject count = (SubLObject)pph_data_structures.ZERO_INTEGER;
        SubLObject bad_pph_phrases = misc_utilities.uninitialized();
        while (pph_data_structures.NIL != misc_utilities.uninitialized_p(bad_pph_phrases) || pph_data_structures.NIL != list_utilities.non_empty_list_p(bad_pph_phrases)) {
            SubLObject release = (SubLObject)pph_data_structures.NIL;
            try {
                release = Locks.seize_lock(pph_data_structures.$pph_phrase_id_index_lock$.getGlobalValue());
                bad_pph_phrases = (SubLObject)pph_data_structures.NIL;
                final SubLObject idx = v_id_index;
                final SubLObject mess = (SubLObject)pph_data_structures.$str162$Removing_invalid_PPH_phrases;
                final SubLObject total = id_index.id_index_count(idx);
                SubLObject sofar = (SubLObject)pph_data_structures.ZERO_INTEGER;
                assert pph_data_structures.NIL != Types.stringp(mess) : mess;
                final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)pph_data_structures.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)pph_data_structures.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)pph_data_structures.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(mess);
                        final SubLObject idx_$1 = idx;
                        if (pph_data_structures.NIL == id_index.id_index_objects_empty_p(idx_$1, (SubLObject)pph_data_structures.$kw164$SKIP)) {
                            final SubLObject idx_$2 = idx_$1;
                            if (pph_data_structures.NIL == id_index.id_index_dense_objects_empty_p(idx_$2, (SubLObject)pph_data_structures.$kw164$SKIP)) {
                                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$2);
                                final SubLObject backwardP_var = (SubLObject)pph_data_structures.NIL;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject suid;
                                SubLObject phrase;
                                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_data_structures.NIL, v_iteration = (SubLObject)pph_data_structures.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_data_structures.ONE_INTEGER)) {
                                    suid = ((pph_data_structures.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_data_structures.ONE_INTEGER) : v_iteration);
                                    phrase = Vectors.aref(vector_var, suid);
                                    if (pph_data_structures.NIL == id_index.id_index_tombstone_p(phrase) || pph_data_structures.NIL == id_index.id_index_skip_tombstones_p((SubLObject)pph_data_structures.$kw164$SKIP)) {
                                        if (pph_data_structures.NIL != id_index.id_index_tombstone_p(phrase)) {
                                            phrase = (SubLObject)pph_data_structures.$kw164$SKIP;
                                        }
                                        if (pph_data_structures.NIL == valid_pph_phrase_p(phrase)) {
                                            bad_pph_phrases = (SubLObject)ConsesLow.cons(suid, bad_pph_phrases);
                                        }
                                        sofar = Numbers.add(sofar, (SubLObject)pph_data_structures.ONE_INTEGER);
                                        utilities_macros.note_percent_progress(sofar, total);
                                    }
                                }
                            }
                            final SubLObject idx_$3 = idx_$1;
                            if (pph_data_structures.NIL == id_index.id_index_sparse_objects_empty_p(idx_$3)) {
                                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$3);
                                SubLObject suid2 = (SubLObject)pph_data_structures.NIL;
                                SubLObject phrase2 = (SubLObject)pph_data_structures.NIL;
                                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                                try {
                                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                                        suid2 = Hashtables.getEntryKey(cdohash_entry);
                                        phrase2 = Hashtables.getEntryValue(cdohash_entry);
                                        if (pph_data_structures.NIL == valid_pph_phrase_p(phrase2)) {
                                            bad_pph_phrases = (SubLObject)ConsesLow.cons(suid2, bad_pph_phrases);
                                        }
                                        sofar = Numbers.add(sofar, (SubLObject)pph_data_structures.ONE_INTEGER);
                                        utilities_macros.note_percent_progress(sofar, total);
                                    }
                                }
                                finally {
                                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                                }
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_data_structures.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                }
                SubLObject cdolist_list_var = bad_pph_phrases;
                SubLObject bad_pph_phrase = (SubLObject)pph_data_structures.NIL;
                bad_pph_phrase = cdolist_list_var.first();
                while (pph_data_structures.NIL != cdolist_list_var) {
                    id_index.id_index_remove(v_id_index, bad_pph_phrase);
                    count = Numbers.add(count, (SubLObject)pph_data_structures.ONE_INTEGER);
                    cdolist_list_var = cdolist_list_var.rest();
                    bad_pph_phrase = cdolist_list_var.first();
                }
            }
            finally {
                if (pph_data_structures.NIL != release) {
                    Locks.release_lock(pph_data_structures.$pph_phrase_id_index_lock$.getGlobalValue());
                }
            }
        }
        if (count.isPositive()) {
            Errors.warn((SubLObject)pph_data_structures.$str165$Removed__S_items_from__PPH_PHRASE, count);
        }
        else {
            print_high.princ((SubLObject)pph_data_structures.$str166$Found_no_invalid_PPH_phrases_, (SubLObject)pph_data_structures.UNPROVIDED);
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 42843L)
    public static SubLObject valid_pph_phrase_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_data_structures.NIL != pph_phrase.pph_phrase_p(v_object, (SubLObject)pph_data_structures.UNPROVIDED) && pph_data_structures.$kw167$FREE != pph_phrase.pph_phrase_mother(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 42980L)
    public static SubLObject pph_phrase_set_suid_if_valid(final SubLObject phrase, final SubLObject suid) {
        if (pph_data_structures.NIL != pph_phrase.pph_phrase_p(phrase, (SubLObject)pph_data_structures.UNPROVIDED)) {
            pph_phrase.pph_phrase_set_suid(phrase, suid);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 43126L)
    public static SubLObject get_next_pph_phrase_id() {
        final SubLObject v_id_index = pph_phrase_id_index();
        return id_index.id_index_reserve(v_id_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 43252L)
    public static SubLObject find_pph_phrase_by_id(final SubLObject pph_phrase_id) {
        assert pph_data_structures.NIL != Types.integerp(pph_phrase_id) : pph_phrase_id;
        return id_index.id_index_lookup(pph_phrase_id_index(), pph_phrase_id, (SubLObject)pph_data_structures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 43407L)
    public static SubLObject pph_phrase_count() {
        return id_index.id_index_count(pph_phrase_id_index());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 43572L)
    public static SubLObject pph_phrase_constituents_vector_to_id_list(final SubLObject v_pph_phrase) {
        SubLObject result = (SubLObject)pph_data_structures.NIL;
        final SubLObject vector_var = document.sign_constituents(v_pph_phrase);
        final SubLObject backwardP_var = (SubLObject)pph_data_structures.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject this_pph_phrase;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_data_structures.NIL, v_iteration = (SubLObject)pph_data_structures.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_data_structures.ONE_INTEGER)) {
            element_num = ((pph_data_structures.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_data_structures.ONE_INTEGER) : v_iteration);
            this_pph_phrase = Vectors.aref(vector_var, element_num);
            result = (SubLObject)ConsesLow.cons(pph_phrase.pph_phrase_suid(this_pph_phrase), result);
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 43831L)
    public static SubLObject pph_phrase_constituents_id_list_to_vector(final SubLObject pph_phrase_suid_list) {
        final SubLObject result = Vectors.make_vector(Sequences.length(pph_phrase_suid_list), (SubLObject)pph_data_structures.UNPROVIDED);
        SubLObject index = (SubLObject)pph_data_structures.ZERO_INTEGER;
        SubLObject cdolist_list_var = pph_phrase_suid_list;
        SubLObject this_pph_phrase_suid = (SubLObject)pph_data_structures.NIL;
        this_pph_phrase_suid = cdolist_list_var.first();
        while (pph_data_structures.NIL != cdolist_list_var) {
            Vectors.set_aref(result, index, find_pph_phrase_by_id(this_pph_phrase_suid));
            index = Numbers.add(index, (SubLObject)pph_data_structures.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            this_pph_phrase_suid = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 44163L)
    public static SubLObject dump_pph_phrase_content(final SubLObject v_pph_phrase, final SubLObject stream) {
        if (pph_data_structures.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_data_structures.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_data_structures.T, (SubLObject)pph_data_structures.$str169$__Dumping__S__, v_pph_phrase, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED);
        }
        cfasl.cfasl_output(document.sign_string(v_pph_phrase), stream);
        cfasl.cfasl_output(document.sign_type(v_pph_phrase), stream);
        cfasl.cfasl_output(document.sign_category(v_pph_phrase), stream);
        cfasl.cfasl_output(pph_phrase_constituents_vector_to_id_list(v_pph_phrase), stream);
        cfasl.cfasl_output(document.sign_offset(v_pph_phrase), stream);
        cfasl.cfasl_output((SubLObject)((pph_data_structures.NIL != pph_phrase.pph_phrase_p(document.sign_mother(v_pph_phrase), (SubLObject)pph_data_structures.UNPROVIDED)) ? pph_phrase.pph_phrase_suid(document.sign_mother(v_pph_phrase)) : pph_data_structures.NIL), stream);
        final SubLObject pph_phrase_info = document.sign_info(v_pph_phrase);
        if (pph_data_structures.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_data_structures.TWO_INTEGER)) {
            format_nil.force_format((SubLObject)pph_data_structures.T, (SubLObject)pph_data_structures.$str170$__Dumping_CycL___S__, pph_phrase_info_cycl(pph_phrase_info), (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED);
        }
        cfasl.cfasl_output(pph_phrase_info_cycl(pph_phrase_info), stream);
        if (pph_data_structures.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_data_structures.TWO_INTEGER)) {
            format_nil.force_format((SubLObject)pph_data_structures.T, (SubLObject)pph_data_structures.$str171$__Dumping_Agr___S__, pph_phrase_info_agr(pph_phrase_info), (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED);
        }
        cfasl.cfasl_output(pph_phrase_info_agr(pph_phrase_info), stream);
        if (pph_data_structures.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_data_structures.TWO_INTEGER)) {
            format_nil.force_format((SubLObject)pph_data_structures.T, (SubLObject)pph_data_structures.$str172$__Dumping_Justification___S__, pph_phrase_info_justification(pph_phrase_info), (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED);
        }
        cfasl.cfasl_output(pph_phrase_info_justification(pph_phrase_info), stream);
        if (pph_data_structures.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_data_structures.TWO_INTEGER)) {
            format_nil.force_format((SubLObject)pph_data_structures.T, (SubLObject)pph_data_structures.$str173$__Dumping_Output_List___S__, pph_phrase_info_output_list(pph_phrase_info), (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED);
        }
        cfasl.cfasl_output(pph_phrase_info_output_list(pph_phrase_info), stream);
        if (pph_data_structures.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_data_structures.TWO_INTEGER)) {
            format_nil.force_format((SubLObject)pph_data_structures.T, (SubLObject)pph_data_structures.$str174$__Dumping_Arg_Position_Map___S__, pph_phrase_info_arg_position_map(pph_phrase_info), (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED);
        }
        cfasl.cfasl_output(pph_phrase_info_arg_position_map(pph_phrase_info), stream);
        if (pph_data_structures.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_data_structures.TWO_INTEGER)) {
            format_nil.force_format((SubLObject)pph_data_structures.T, (SubLObject)pph_data_structures.$str175$__Dumping_Other___S__, pph_phrase_info_other(pph_phrase_info), (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED);
        }
        cfasl.cfasl_output(prepare_pph_phrase_info_other_for_dump(pph_phrase_info_other(pph_phrase_info)), stream);
        if (pph_data_structures.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_data_structures.TWO_INTEGER)) {
            format_nil.force_format((SubLObject)pph_data_structures.T, (SubLObject)pph_data_structures.$str176$_________________________________, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED);
        }
        return (SubLObject)pph_data_structures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 45892L)
    public static SubLObject load_pph_phrase_content(final SubLObject v_pph_phrase, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject string = cfasl.cfasl_input(stream, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED);
        final SubLObject type = cfasl.cfasl_input(stream, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED);
        final SubLObject category = cfasl.cfasl_input(stream, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED);
        SubLObject constituents = cfasl.cfasl_input(stream, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED);
        final SubLObject offset = cfasl.cfasl_input(stream, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED);
        SubLObject mother = cfasl.cfasl_input(stream, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED);
        final SubLObject cycl = cfasl.cfasl_input(stream, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED);
        final SubLObject agr = cfasl.cfasl_input(stream, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED);
        final SubLObject justification = cfasl.cfasl_input(stream, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED);
        final SubLObject output_list = cfasl.cfasl_input(stream, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED);
        final SubLObject arg_position_map = cfasl.cfasl_input(stream, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED);
        final SubLObject other = recover_pph_phrase_info_other(cfasl.cfasl_input(stream, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED));
        final SubLObject _prev_bind_0 = pph_macros.$new_pph_phrases$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_macros.$creating_permanent_pph_phraseP$.currentBinding(thread);
        try {
            pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
            pph_macros.$new_pph_phrase_count$.bind((SubLObject)pph_data_structures.ZERO_INTEGER, thread);
            pph_macros.$creating_permanent_pph_phraseP$.bind((SubLObject)pph_data_structures.T, thread);
            if (mother.isInteger()) {
                mother = find_pph_phrase_by_id(mother);
            }
            if (constituents.isCons() && pph_data_structures.NIL != list_utilities.list_of_type_p((SubLObject)pph_data_structures.$sym168$INTEGERP, constituents)) {
                constituents = pph_phrase_constituents_id_list_to_vector(constituents);
            }
            document._csetf_sign_string(v_pph_phrase, string);
            document._csetf_sign_type(v_pph_phrase, type);
            document._csetf_sign_category(v_pph_phrase, category);
            document._csetf_sign_constituents(v_pph_phrase, constituents);
            document._csetf_sign_offset(v_pph_phrase, offset);
            document._csetf_sign_mother(v_pph_phrase, mother);
            populate_pph_phrase(v_pph_phrase, cycl, agr, justification, output_list, arg_position_map, other);
        }
        finally {
            pph_macros.$creating_permanent_pph_phraseP$.rebind(_prev_bind_3, thread);
            pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_2, thread);
            pph_macros.$new_pph_phrases$.rebind(_prev_bind_0, thread);
        }
        return v_pph_phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 47280L)
    public static SubLObject prepare_pph_phrase_info_other_for_dump(final SubLObject info_other) {
        return shellify_pph_phrases(listify_pph_vectors(info_other));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 47414L)
    public static SubLObject recover_pph_phrase_info_other(final SubLObject input_value) {
        return delistify_pph_vectors(deshellify_pph_phrases(input_value));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 47619L)
    public static SubLObject pph_listified_vector_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(obj.isCons() && obj.first().eql(pph_data_structures.$pph_listified_vector_marker$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 47738L)
    public static SubLObject listify_pph_vectors(final SubLObject tree) {
        return transform_list_utilities.transform(tree, (SubLObject)pph_data_structures.$sym178$VECTORP, (SubLObject)pph_data_structures.$sym179$LISTIFY_PPH_VECTOR, (SubLObject)pph_data_structures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 47837L)
    public static SubLObject listify_pph_vector(final SubLObject vector) {
        return list_utilities.vector2list_reversible(vector, pph_data_structures.$pph_listified_vector_marker$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 47953L)
    public static SubLObject delistify_pph_vectors(final SubLObject tree) {
        return transform_list_utilities.transform(tree, (SubLObject)pph_data_structures.$sym180$PPH_LISTIFIED_VECTOR_P, (SubLObject)pph_data_structures.$sym181$DELISTIFY_PPH_VECTOR, (SubLObject)pph_data_structures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 48071L)
    public static SubLObject delistify_pph_vector(final SubLObject listified_vector) {
        return list_utilities.listified_vector2vector(listified_vector, pph_data_structures.$pph_listified_vector_marker$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 48335L)
    public static SubLObject shellify_pph_phrases(final SubLObject tree) {
        return transform_list_utilities.transform(tree, (SubLObject)pph_data_structures.$sym34$PPH_PHRASE_P, (SubLObject)pph_data_structures.$sym183$SHELLIFY_PPH_PHRASE, (SubLObject)pph_data_structures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 48441L)
    public static SubLObject shellify_pph_phrase(final SubLObject phrase) {
        return (SubLObject)ConsesLow.cons(pph_data_structures.$pph_phrase_shell_marker$.getGlobalValue(), pph_phrase.pph_phrase_suid(phrase));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 48554L)
    public static SubLObject shellified_pph_phrase_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(obj.isCons() && obj.first().eql(pph_data_structures.$pph_phrase_shell_marker$.getGlobalValue()) && obj.rest().isInteger());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 48697L)
    public static SubLObject deshellify_pph_phrases(final SubLObject tree) {
        return transform_list_utilities.transform(tree, (SubLObject)pph_data_structures.$sym184$SHELLIFIED_PPH_PHRASE_P, (SubLObject)pph_data_structures.$sym185$DESHELLIFY_PPH_PHRASE, (SubLObject)pph_data_structures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 48818L)
    public static SubLObject deshellify_pph_phrase(final SubLObject shellified_phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject suid = shellified_phrase.rest();
        final SubLObject phrase = find_pph_phrase_by_id(suid);
        if (pph_data_structures.NIL == phrase && pph_data_structures.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_data_structures.$str186$Couldn_t_find_PPH_phrase__D) && pph_data_structures.NIL == pph_error.suppress_pph_warningsP()) {
            Errors.warn(suid);
            streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 49111L)
    public static SubLObject paraphrase_cycl_caches_unbuiltP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_data_structures.NIL == gen_template_store_initializedP() || pph_data_structures.NIL == pph_main.pph_initializedP());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 49246L)
    public static SubLObject rebuild_paraphrase_cycl_caches() {
        return pph_main.initialize_paraphrase_cycl();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 49337L)
    public static SubLObject dump_gen_template_store_to_stream(final SubLObject stream) {
        cfasl.cfasl_output(pph_data_structures.$gen_template_store$.getGlobalValue(), stream);
        return (SubLObject)pph_data_structures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 49655L)
    public static SubLObject load_gen_template_store_from_stream(final SubLObject stream) {
        pph_data_structures.$gen_template_store$.setGlobalValue(cfasl.cfasl_input(stream, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED));
        return (SubLObject)pph_data_structures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 50010L)
    public static SubLObject pph_phrase_template_generator_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_pph_phrase_template_generator(v_object, stream, (SubLObject)pph_data_structures.ZERO_INTEGER);
        return (SubLObject)pph_data_structures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 50010L)
    public static SubLObject pph_phrase_template_generator_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $pph_phrase_template_generator_native.class) ? pph_data_structures.T : pph_data_structures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 50010L)
    public static SubLObject pph_phrase_template_generator_formula(final SubLObject v_object) {
        assert pph_data_structures.NIL != pph_phrase_template_generator_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 50010L)
    public static SubLObject pph_phrase_template_generator_mt(final SubLObject v_object) {
        assert pph_data_structures.NIL != pph_phrase_template_generator_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 50010L)
    public static SubLObject pph_phrase_template_generator_focus_arg(final SubLObject v_object) {
        assert pph_data_structures.NIL != pph_phrase_template_generator_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 50010L)
    public static SubLObject pph_phrase_template_generator_specified_reln(final SubLObject v_object) {
        assert pph_data_structures.NIL != pph_phrase_template_generator_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 50010L)
    public static SubLObject pph_phrase_template_generator_nl_preds(final SubLObject v_object) {
        assert pph_data_structures.NIL != pph_phrase_template_generator_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 50010L)
    public static SubLObject pph_phrase_template_generator_doneP(final SubLObject v_object) {
        assert pph_data_structures.NIL != pph_phrase_template_generator_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 50010L)
    public static SubLObject pph_phrase_template_generator_search_limit(final SubLObject v_object) {
        assert pph_data_structures.NIL != pph_phrase_template_generator_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 50010L)
    public static SubLObject pph_phrase_template_generator_search_level(final SubLObject v_object) {
        assert pph_data_structures.NIL != pph_phrase_template_generator_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 50010L)
    public static SubLObject pph_phrase_template_generator_relns_to_use(final SubLObject v_object) {
        assert pph_data_structures.NIL != pph_phrase_template_generator_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 50010L)
    public static SubLObject pph_phrase_template_generator_gen_template_sets(final SubLObject v_object) {
        assert pph_data_structures.NIL != pph_phrase_template_generator_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 50010L)
    public static SubLObject pph_phrase_template_generator_gen_templates(final SubLObject v_object) {
        assert pph_data_structures.NIL != pph_phrase_template_generator_p(v_object) : v_object;
        return v_object.getField12();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 50010L)
    public static SubLObject pph_phrase_template_generator_arg_position_map(final SubLObject v_object) {
        assert pph_data_structures.NIL != pph_phrase_template_generator_p(v_object) : v_object;
        return v_object.getField13();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 50010L)
    public static SubLObject _csetf_pph_phrase_template_generator_formula(final SubLObject v_object, final SubLObject value) {
        assert pph_data_structures.NIL != pph_phrase_template_generator_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 50010L)
    public static SubLObject _csetf_pph_phrase_template_generator_mt(final SubLObject v_object, final SubLObject value) {
        assert pph_data_structures.NIL != pph_phrase_template_generator_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 50010L)
    public static SubLObject _csetf_pph_phrase_template_generator_focus_arg(final SubLObject v_object, final SubLObject value) {
        assert pph_data_structures.NIL != pph_phrase_template_generator_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 50010L)
    public static SubLObject _csetf_pph_phrase_template_generator_specified_reln(final SubLObject v_object, final SubLObject value) {
        assert pph_data_structures.NIL != pph_phrase_template_generator_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 50010L)
    public static SubLObject _csetf_pph_phrase_template_generator_nl_preds(final SubLObject v_object, final SubLObject value) {
        assert pph_data_structures.NIL != pph_phrase_template_generator_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 50010L)
    public static SubLObject _csetf_pph_phrase_template_generator_doneP(final SubLObject v_object, final SubLObject value) {
        assert pph_data_structures.NIL != pph_phrase_template_generator_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 50010L)
    public static SubLObject _csetf_pph_phrase_template_generator_search_limit(final SubLObject v_object, final SubLObject value) {
        assert pph_data_structures.NIL != pph_phrase_template_generator_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 50010L)
    public static SubLObject _csetf_pph_phrase_template_generator_search_level(final SubLObject v_object, final SubLObject value) {
        assert pph_data_structures.NIL != pph_phrase_template_generator_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 50010L)
    public static SubLObject _csetf_pph_phrase_template_generator_relns_to_use(final SubLObject v_object, final SubLObject value) {
        assert pph_data_structures.NIL != pph_phrase_template_generator_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 50010L)
    public static SubLObject _csetf_pph_phrase_template_generator_gen_template_sets(final SubLObject v_object, final SubLObject value) {
        assert pph_data_structures.NIL != pph_phrase_template_generator_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 50010L)
    public static SubLObject _csetf_pph_phrase_template_generator_gen_templates(final SubLObject v_object, final SubLObject value) {
        assert pph_data_structures.NIL != pph_phrase_template_generator_p(v_object) : v_object;
        return v_object.setField12(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 50010L)
    public static SubLObject _csetf_pph_phrase_template_generator_arg_position_map(final SubLObject v_object, final SubLObject value) {
        assert pph_data_structures.NIL != pph_phrase_template_generator_p(v_object) : v_object;
        return v_object.setField13(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 50010L)
    public static SubLObject make_pph_phrase_template_generator(SubLObject arglist) {
        if (arglist == pph_data_structures.UNPROVIDED) {
            arglist = (SubLObject)pph_data_structures.NIL;
        }
        final SubLObject v_new = (SubLObject)new $pph_phrase_template_generator_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)pph_data_structures.NIL, next = arglist; pph_data_structures.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)pph_data_structures.$kw220$FORMULA)) {
                _csetf_pph_phrase_template_generator_formula(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pph_data_structures.$kw221$MT)) {
                _csetf_pph_phrase_template_generator_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pph_data_structures.$kw222$FOCUS_ARG)) {
                _csetf_pph_phrase_template_generator_focus_arg(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pph_data_structures.$kw223$SPECIFIED_RELN)) {
                _csetf_pph_phrase_template_generator_specified_reln(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pph_data_structures.$kw224$NL_PREDS)) {
                _csetf_pph_phrase_template_generator_nl_preds(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pph_data_structures.$kw225$DONE_)) {
                _csetf_pph_phrase_template_generator_doneP(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pph_data_structures.$kw226$SEARCH_LIMIT)) {
                _csetf_pph_phrase_template_generator_search_limit(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pph_data_structures.$kw227$SEARCH_LEVEL)) {
                _csetf_pph_phrase_template_generator_search_level(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pph_data_structures.$kw228$RELNS_TO_USE)) {
                _csetf_pph_phrase_template_generator_relns_to_use(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pph_data_structures.$kw229$GEN_TEMPLATE_SETS)) {
                _csetf_pph_phrase_template_generator_gen_template_sets(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pph_data_structures.$kw230$GEN_TEMPLATES)) {
                _csetf_pph_phrase_template_generator_gen_templates(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pph_data_structures.$kw97$ARG_POSITION_MAP)) {
                _csetf_pph_phrase_template_generator_arg_position_map(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)pph_data_structures.$str27$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 50010L)
    public static SubLObject visit_defstruct_pph_phrase_template_generator(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_data_structures.$kw28$BEGIN, (SubLObject)pph_data_structures.$sym231$MAKE_PPH_PHRASE_TEMPLATE_GENERATOR, (SubLObject)pph_data_structures.TWELVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_data_structures.$kw30$SLOT, (SubLObject)pph_data_structures.$kw220$FORMULA, pph_phrase_template_generator_formula(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_data_structures.$kw30$SLOT, (SubLObject)pph_data_structures.$kw221$MT, pph_phrase_template_generator_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_data_structures.$kw30$SLOT, (SubLObject)pph_data_structures.$kw222$FOCUS_ARG, pph_phrase_template_generator_focus_arg(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_data_structures.$kw30$SLOT, (SubLObject)pph_data_structures.$kw223$SPECIFIED_RELN, pph_phrase_template_generator_specified_reln(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_data_structures.$kw30$SLOT, (SubLObject)pph_data_structures.$kw224$NL_PREDS, pph_phrase_template_generator_nl_preds(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_data_structures.$kw30$SLOT, (SubLObject)pph_data_structures.$kw225$DONE_, pph_phrase_template_generator_doneP(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_data_structures.$kw30$SLOT, (SubLObject)pph_data_structures.$kw226$SEARCH_LIMIT, pph_phrase_template_generator_search_limit(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_data_structures.$kw30$SLOT, (SubLObject)pph_data_structures.$kw227$SEARCH_LEVEL, pph_phrase_template_generator_search_level(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_data_structures.$kw30$SLOT, (SubLObject)pph_data_structures.$kw228$RELNS_TO_USE, pph_phrase_template_generator_relns_to_use(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_data_structures.$kw30$SLOT, (SubLObject)pph_data_structures.$kw229$GEN_TEMPLATE_SETS, pph_phrase_template_generator_gen_template_sets(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_data_structures.$kw30$SLOT, (SubLObject)pph_data_structures.$kw230$GEN_TEMPLATES, pph_phrase_template_generator_gen_templates(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_data_structures.$kw30$SLOT, (SubLObject)pph_data_structures.$kw97$ARG_POSITION_MAP, pph_phrase_template_generator_arg_position_map(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_data_structures.$kw31$END, (SubLObject)pph_data_structures.$sym231$MAKE_PPH_PHRASE_TEMPLATE_GENERATOR, (SubLObject)pph_data_structures.TWELVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 50010L)
    public static SubLObject visit_defstruct_object_pph_phrase_template_generator_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_pph_phrase_template_generator(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 50447L)
    public static SubLObject pprint_pph_phrase_template_generator(final SubLObject generator, SubLObject stream, SubLObject depth) {
        if (stream == pph_data_structures.UNPROVIDED) {
            stream = (SubLObject)pph_data_structures.NIL;
        }
        if (depth == pph_data_structures.UNPROVIDED) {
            depth = (SubLObject)pph_data_structures.NIL;
        }
        PrintLow.format(stream, (SubLObject)pph_data_structures.$str233$_PPH_Phrase_Template_Generator___, pph_phrase_template_generator_formula(generator));
        return generator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 50682L)
    public static SubLObject initialize_pph_phrase_template_generator(final SubLObject generator, final SubLObject formula, final SubLObject focus_arg, final SubLObject specified_reln, final SubLObject nl_preds, final SubLObject mt, final SubLObject arg_position_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        _csetf_pph_phrase_template_generator_formula(generator, formula);
        _csetf_pph_phrase_template_generator_mt(generator, mt);
        _csetf_pph_phrase_template_generator_focus_arg(generator, focus_arg);
        _csetf_pph_phrase_template_generator_specified_reln(generator, specified_reln);
        _csetf_pph_phrase_template_generator_nl_preds(generator, nl_preds);
        _csetf_pph_phrase_template_generator_doneP(generator, (SubLObject)pph_data_structures.NIL);
        _csetf_pph_phrase_template_generator_search_limit(generator, pph_utilities.pph_search_limit());
        _csetf_pph_phrase_template_generator_search_level(generator, (SubLObject)pph_data_structures.ZERO_INTEGER);
        SubLObject ignore_errors_tag = (SubLObject)pph_data_structures.NIL;
        try {
            thread.throwStack.push(pph_data_structures.$kw234$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)pph_data_structures.$sym235$IGNORE_ERRORS_HANDLER), thread);
                try {
                    _csetf_pph_phrase_template_generator_arg_position_map(generator, arg_position_map);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)pph_data_structures.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)pph_data_structures.$kw234$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        queues.clear_queue(pph_phrase_template_generator_relns_to_use(generator));
        queues.clear_queue(pph_phrase_template_generator_gen_template_sets(generator));
        queues.clear_queue(pph_phrase_template_generator_gen_templates(generator));
        pph_templates.pph_phrase_template_generator_initialize_queues(generator);
        return generator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 51872L)
    public static SubLObject pph_phrase_template_generator_done_p(final SubLObject generator) {
        return pph_phrase_template_generator_doneP(generator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 52123L)
    public static SubLObject get_pph_phrase_template_generator(final SubLObject formula, SubLObject focus_arg, SubLObject specified_reln, SubLObject nl_preds, SubLObject arg_position_map, SubLObject mt) {
        if (focus_arg == pph_data_structures.UNPROVIDED) {
            focus_arg = (SubLObject)pph_data_structures.NIL;
        }
        if (specified_reln == pph_data_structures.UNPROVIDED) {
            specified_reln = (SubLObject)pph_data_structures.NIL;
        }
        if (nl_preds == pph_data_structures.UNPROVIDED) {
            nl_preds = (SubLObject)pph_data_structures.$kw237$ANY;
        }
        if (arg_position_map == pph_data_structures.UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_empty_map();
        }
        if (mt == pph_data_structures.UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        assert pph_data_structures.NIL != hlmt.hlmt_p(mt) : mt;
        SubLObject generator = queues.dequeue(pph_data_structures.$free_pph_phrase_template_generators$.getGlobalValue());
        if (pph_data_structures.NIL == pph_phrase_template_generator_p(generator)) {
            if (pph_data_structures.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_data_structures.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_data_structures.T, (SubLObject)pph_data_structures.$str239$Making_new_PPH_phrase_template_ge, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED);
            }
            generator = make_pph_phrase_template_generator((SubLObject)ConsesLow.list((SubLObject)pph_data_structures.$kw228$RELNS_TO_USE, queues.create_queue((SubLObject)pph_data_structures.UNPROVIDED), (SubLObject)pph_data_structures.$kw229$GEN_TEMPLATE_SETS, queues.create_queue((SubLObject)pph_data_structures.UNPROVIDED), (SubLObject)pph_data_structures.$kw230$GEN_TEMPLATES, queues.create_queue((SubLObject)pph_data_structures.UNPROVIDED)));
        }
        initialize_pph_phrase_template_generator(generator, formula, focus_arg, specified_reln, nl_preds, mt, arg_position_map);
        return generator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 52890L)
    public static SubLObject free_pph_phrase_template_generator(final SubLObject generator) {
        _csetf_pph_phrase_template_generator_formula(generator, (SubLObject)pph_data_structures.$kw167$FREE);
        _csetf_pph_phrase_template_generator_mt(generator, (SubLObject)pph_data_structures.$kw167$FREE);
        _csetf_pph_phrase_template_generator_focus_arg(generator, (SubLObject)pph_data_structures.$kw167$FREE);
        _csetf_pph_phrase_template_generator_specified_reln(generator, (SubLObject)pph_data_structures.$kw167$FREE);
        _csetf_pph_phrase_template_generator_nl_preds(generator, (SubLObject)pph_data_structures.$kw167$FREE);
        _csetf_pph_phrase_template_generator_doneP(generator, (SubLObject)pph_data_structures.$kw167$FREE);
        _csetf_pph_phrase_template_generator_search_limit(generator, (SubLObject)pph_data_structures.$kw167$FREE);
        _csetf_pph_phrase_template_generator_search_level(generator, (SubLObject)pph_data_structures.$kw167$FREE);
        queues.clear_queue(pph_phrase_template_generator_relns_to_use(generator));
        queues.clear_queue(pph_phrase_template_generator_gen_template_sets(generator));
        queues.clear_queue(pph_phrase_template_generator_gen_templates(generator));
        queues.enqueue(generator, pph_data_structures.$free_pph_phrase_template_generators$.getGlobalValue());
        if (pph_data_structures.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_data_structures.TWO_INTEGER)) {
            format_nil.force_format((SubLObject)pph_data_structures.T, (SubLObject)pph_data_structures.$str240$Freeing_PPH_phrase_template_gener, queues.queue_size(pph_data_structures.$free_pph_phrase_template_generators$.getGlobalValue()), (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED);
        }
        return generator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 53919L)
    public static SubLObject pph_phrase_output_list_iterator_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_pph_phrase_output_list_iterator(v_object, stream, (SubLObject)pph_data_structures.ZERO_INTEGER);
        return (SubLObject)pph_data_structures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 53919L)
    public static SubLObject pph_phrase_output_list_iterator_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $pph_phrase_output_list_iterator_native.class) ? pph_data_structures.T : pph_data_structures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 53919L)
    public static SubLObject pph_phrase_output_list_iterator_item_queue(final SubLObject v_object) {
        assert pph_data_structures.NIL != pph_phrase_output_list_iterator_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 53919L)
    public static SubLObject _csetf_pph_phrase_output_list_iterator_item_queue(final SubLObject v_object, final SubLObject value) {
        assert pph_data_structures.NIL != pph_phrase_output_list_iterator_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 53919L)
    public static SubLObject make_pph_phrase_output_list_iterator(SubLObject arglist) {
        if (arglist == pph_data_structures.UNPROVIDED) {
            arglist = (SubLObject)pph_data_structures.NIL;
        }
        final SubLObject v_new = (SubLObject)new $pph_phrase_output_list_iterator_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)pph_data_structures.NIL, next = arglist; pph_data_structures.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)pph_data_structures.$kw252$ITEM_QUEUE)) {
                _csetf_pph_phrase_output_list_iterator_item_queue(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)pph_data_structures.$str27$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 53919L)
    public static SubLObject visit_defstruct_pph_phrase_output_list_iterator(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_data_structures.$kw28$BEGIN, (SubLObject)pph_data_structures.$sym253$MAKE_PPH_PHRASE_OUTPUT_LIST_ITERATOR, (SubLObject)pph_data_structures.ONE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_data_structures.$kw30$SLOT, (SubLObject)pph_data_structures.$kw252$ITEM_QUEUE, pph_phrase_output_list_iterator_item_queue(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_data_structures.$kw31$END, (SubLObject)pph_data_structures.$sym253$MAKE_PPH_PHRASE_OUTPUT_LIST_ITERATOR, (SubLObject)pph_data_structures.ONE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 53919L)
    public static SubLObject visit_defstruct_object_pph_phrase_output_list_iterator_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_pph_phrase_output_list_iterator(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 54087L)
    public static SubLObject pprint_pph_phrase_output_list_iterator(final SubLObject iterator, SubLObject stream, SubLObject depth) {
        if (stream == pph_data_structures.UNPROVIDED) {
            stream = (SubLObject)pph_data_structures.NIL;
        }
        if (depth == pph_data_structures.UNPROVIDED) {
            depth = (SubLObject)pph_data_structures.NIL;
        }
        PrintLow.format(stream, (SubLObject)pph_data_structures.$str255$_PPH_OL_Iterator_);
        return iterator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 54250L)
    public static SubLObject new_pph_phrase_output_list_iterator(final SubLObject output_list) {
        final SubLObject iterator = make_pph_phrase_output_list_iterator((SubLObject)pph_data_structures.UNPROVIDED);
        final SubLObject item_queue = queues.create_queue((SubLObject)pph_data_structures.UNPROVIDED);
        SubLObject cdolist_list_var = output_list;
        SubLObject item = (SubLObject)pph_data_structures.NIL;
        item = cdolist_list_var.first();
        while (pph_data_structures.NIL != cdolist_list_var) {
            queues.enqueue(pph_phrase_output_item_copy(item), item_queue);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        _csetf_pph_phrase_output_list_iterator_item_queue(iterator, item_queue);
        return iterator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 54602L)
    public static SubLObject pph_phrase_output_list_iterator_empty_p(final SubLObject iterator) {
        return queues.queue_empty_p(pph_phrase_output_list_iterator_item_queue(iterator));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 54751L)
    public static SubLObject pph_phrase_output_list_iterator_next(final SubLObject iterator) {
        if (pph_data_structures.NIL != pph_phrase_output_list_iterator_empty_p(iterator)) {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_data_structures.$str37$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_data_structures.ONE_INTEGER), pph_data_structures.$str38$__, format_nil.format_nil_a_no_copy((SubLObject)pph_data_structures.$str256$___Iterator_empty___S__) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(iterator));
        }
        final SubLObject queue = pph_phrase_output_list_iterator_item_queue(iterator);
        final SubLObject top = queues.queue_peek(queue);
        if (pph_data_structures.NIL != pph_phrase_output_item_p(top)) {
            queues.dequeue(queue);
            return top;
        }
        if (pph_data_structures.NIL != pph_phrase_output_item_nospace_group_p(top)) {
            final SubLObject next = pph_phrase_output_item_nospace_group_grab_first_item(top);
            if (pph_data_structures.NIL == pph_phrase_output_item_nospace_group_items(top)) {
                queues.dequeue(queue);
            }
            return next;
        }
        if (pph_data_structures.NIL != enhanced_pph_output_item_p(top)) {
            queues.dequeue(queue);
            return top;
        }
        final SubLObject new_format_string2 = Sequences.cconcatenate((SubLObject)pph_data_structures.$str37$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_data_structures.ONE_INTEGER), pph_data_structures.$str38$__, format_nil.format_nil_a_no_copy((SubLObject)pph_data_structures.$str257$___Can_t_get_next_item_from__S) });
        pph_error.pph_handle_error(new_format_string2, (SubLObject)ConsesLow.list(iterator));
        return (SubLObject)pph_data_structures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 55607L)
    public static SubLObject pph_phrase_output_item_nospace_group_grab_first_item(final SubLObject nospace_group) {
        final SubLObject nospace_group_items = pph_phrase_output_item_nospace_group_items(nospace_group);
        final SubLObject first_nospace_group_item = nospace_group_items.first();
        SubLObject first_item = first_nospace_group_item.first();
        if (pph_data_structures.NIL != pph_phrase_output_item_nospace_group_p(first_item)) {
            final SubLObject real_first_item = pph_phrase_output_item_nospace_group_grab_first_item(first_item);
            if (pph_data_structures.NIL == pph_phrase_output_item_nospace_group_items(first_item)) {
                pph_nospace_group_remove_first_item(nospace_group);
            }
            first_item = real_first_item;
        }
        else if (pph_data_structures.NIL != pph_phrase_output_item_loose_p(first_item)) {
            pph_nospace_group_remove_first_item(nospace_group);
        }
        if (pph_data_structures.NIL != pph_phrase_output_item_p(first_item)) {
            pph_update_output_item_from_nospace_group(first_item, nospace_group);
        }
        return first_item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 56592L)
    public static SubLObject pph_nospace_group_remove_first_item(final SubLObject nospace_group) {
        final SubLObject nospace_group_items = pph_phrase_output_item_nospace_group_items(nospace_group);
        SubLObject first_nospace_group_item = nospace_group_items.first();
        first_nospace_group_item = first_nospace_group_item.rest();
        final SubLObject new_items = (SubLObject)((pph_data_structures.NIL == first_nospace_group_item) ? nospace_group_items.rest() : ConsesLow.cons(first_nospace_group_item, nospace_group_items.rest()));
        pph_phrase_output_item_nospace_group_set_items(nospace_group, new_items);
        return nospace_group;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-data-structures.lisp", position = 57162L)
    public static SubLObject pph_update_output_item_from_nospace_group(final SubLObject item, final SubLObject nospace_group) {
        if (pph_data_structures.NIL == pph_phrase.pph_known_cycl_p(pph_phrase_output_item_cycl(item))) {
            pph_phrase_output_item_set_cycl(item, pph_phrase_output_item_nospace_group_cycl(nospace_group));
            pph_phrase_output_item_set_arg_position(item, pph_phrase_output_item_nospace_group_arg_position(nospace_group));
        }
        final SubLObject item_open_tag = pph_phrase_output_item_html_open_tag(item);
        final SubLObject nospace_group_open_tag = pph_phrase_output_item_nospace_group_html_open_tag(nospace_group);
        final SubLObject new_open_tag = item_open_tag.isString() ? (nospace_group_open_tag.isString() ? Sequences.cconcatenate(nospace_group_open_tag, item_open_tag) : item_open_tag) : nospace_group_open_tag;
        final SubLObject item_close_tag = pph_phrase_output_item_html_close_tag(item);
        final SubLObject nospace_group_close_tag = pph_phrase_output_item_nospace_group_html_close_tag(nospace_group);
        final SubLObject last_itemP = Types.sublisp_null(pph_phrase_output_item_nospace_group_items(nospace_group));
        final SubLObject new_close_tag = (SubLObject)(item_close_tag.isString() ? ((nospace_group_close_tag.isString() && pph_data_structures.NIL != last_itemP) ? Sequences.cconcatenate(item_close_tag, nospace_group_close_tag) : item_close_tag) : ((pph_data_structures.NIL != last_itemP) ? nospace_group_close_tag : pph_data_structures.NIL));
        pph_phrase_output_item_nospace_group_set_html_tags(nospace_group, (SubLObject)pph_data_structures.NIL, nospace_group_close_tag);
        pph_phrase_output_item_set_html_tags(item, new_open_tag, new_close_tag);
        return item;
    }
    
    public static SubLObject declare_pph_data_structures_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "gen_template_store_present_p", "GEN-TEMPLATE-STORE-PRESENT-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "note_gen_template_store_initialized", "NOTE-GEN-TEMPLATE-STORE-INITIALIZED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "clear_gen_template_store", "CLEAR-GEN-TEMPLATE-STORE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "gen_template_store_initializedP", "GEN-TEMPLATE-STORE-INITIALIZED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "check_gen_template_store_initialization", "CHECK-GEN-TEMPLATE-STORE-INITIALIZATION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "gen_template_store_length", "GEN-TEMPLATE-STORE-LENGTH", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "new_gen_template_store_iterator", "NEW-GEN-TEMPLATE-STORE-ITERATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "gen_template_sets_for_reln_from_store", "GEN-TEMPLATE-SETS-FOR-RELN-FROM-STORE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "set_gen_template_store_value", "SET-GEN-TEMPLATE-STORE-VALUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "clear_gen_template_store_value", "CLEAR-GEN-TEMPLATE-STORE-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "destroy_gen_templates_for_reln", "DESTROY-GEN-TEMPLATES-FOR-RELN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "destroy_gen_template", "DESTROY-GEN-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "generation_template_print_function_trampoline", "GENERATION-TEMPLATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "generation_template_p", "GENERATION-TEMPLATE-P", 1, 0, false);
        new $generation_template_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "gen_template_phrase", "GEN-TEMPLATE-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "gen_template_constraint", "GEN-TEMPLATE-CONSTRAINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "gen_template_assertion", "GEN-TEMPLATE-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "_csetf_gen_template_phrase", "_CSETF-GEN-TEMPLATE-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "_csetf_gen_template_constraint", "_CSETF-GEN-TEMPLATE-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "_csetf_gen_template_assertion", "_CSETF-GEN-TEMPLATE-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "make_generation_template", "MAKE-GENERATION-TEMPLATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "visit_defstruct_generation_template", "VISIT-DEFSTRUCT-GENERATION-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "visit_defstruct_object_generation_template_method", "VISIT-DEFSTRUCT-OBJECT-GENERATION-TEMPLATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "sxhash_generation_template_method", "SXHASH-GENERATION-TEMPLATE-METHOD", 1, 0, false);
        new $sxhash_generation_template_method$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "new_gen_template", "NEW-GEN-TEMPLATE", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pprint_gen_template", "PPRINT-GEN-TEMPLATE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "gen_template_el_constraint", "GEN-TEMPLATE-EL-CONSTRAINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "gen_template_set_constraint", "GEN-TEMPLATE-SET-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "get_gen_template_phrase", "GET-GEN-TEMPLATE-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "get_gen_template_constraint", "GET-GEN-TEMPLATE-CONSTRAINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "get_gen_template_assertion", "GET-GEN-TEMPLATE-ASSERTION", 1, 0, false);
        new $get_gen_template_assertion$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "get_gen_template_mt", "GET-GEN-TEMPLATE-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "cfasl_output_object_generation_template_method", "CFASL-OUTPUT-OBJECT-GENERATION-TEMPLATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "cfasl_output_generation_template", "CFASL-OUTPUT-GENERATION-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "cfasl_input_generation_template", "CFASL-INPUT-GENERATION-TEMPLATE", 1, 0, false);
        new $cfasl_input_generation_template$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_agr_print_function_trampoline", "PPH-PHRASE-AGR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_agr_p", "PPH-PHRASE-AGR-P", 1, 0, false);
        new $pph_phrase_agr_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_agr_absolute_constraint", "PPH-PHRASE-AGR-ABSOLUTE-CONSTRAINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_agr_relative_constraint", "PPH-PHRASE-AGR-RELATIVE-CONSTRAINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "_csetf_pph_phrase_agr_absolute_constraint", "_CSETF-PPH-PHRASE-AGR-ABSOLUTE-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "_csetf_pph_phrase_agr_relative_constraint", "_CSETF-PPH-PHRASE-AGR-RELATIVE-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "make_pph_phrase_agr", "MAKE-PPH-PHRASE-AGR", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "visit_defstruct_pph_phrase_agr", "VISIT-DEFSTRUCT-PPH-PHRASE-AGR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "visit_defstruct_object_pph_phrase_agr_method", "VISIT-DEFSTRUCT-OBJECT-PPH-PHRASE-AGR-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pprint_pph_phrase_agr", "PPRINT-PPH-PHRASE-AGR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "new_pph_phrase_agr", "NEW-PPH-PHRASE-AGR", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "new_pph_phrase_agr_low", "NEW-PPH-PHRASE-AGR-LOW", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "new_dont_care_pph_phrase_agr", "NEW-DONT-CARE-PPH-PHRASE-AGR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "dont_care_pph_phrase_agr_p", "DONT-CARE-PPH-PHRASE-AGR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_agr_set_absolute_constraint", "PPH-PHRASE-AGR-SET-ABSOLUTE-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_agr_set_relative_constraint", "PPH-PHRASE-AGR-SET-RELATIVE-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_agr_copy", "PPH-PHRASE-AGR-COPY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_agr_relative_constraint_copy", "PPH-PHRASE-AGR-RELATIVE-CONSTRAINT-COPY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "find_new_pph_relative_agr_target", "FIND-NEW-PPH-RELATIVE-AGR-TARGET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "cfasl_output_object_pph_phrase_agr_method", "CFASL-OUTPUT-OBJECT-PPH-PHRASE-AGR-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "cfasl_output_pph_phrase_agr", "CFASL-OUTPUT-PPH-PHRASE-AGR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "cfasl_input_pph_phrase_agr", "CFASL-INPUT-PPH-PHRASE-AGR", 1, 0, false);
        new $cfasl_input_pph_phrase_agr$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "paraphrase_phrase_info_bundle_print_function_trampoline", "PARAPHRASE-PHRASE-INFO-BUNDLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "paraphrase_phrase_info_bundle_p", "PARAPHRASE-PHRASE-INFO-BUNDLE-P", 1, 0, false);
        new $paraphrase_phrase_info_bundle_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_info_cycl", "PPH-PHRASE-INFO-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_info_agr", "PPH-PHRASE-INFO-AGR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_info_justification", "PPH-PHRASE-INFO-JUSTIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_info_output_list", "PPH-PHRASE-INFO-OUTPUT-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_info_arg_position_map", "PPH-PHRASE-INFO-ARG-POSITION-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_info_other", "PPH-PHRASE-INFO-OTHER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "_csetf_pph_phrase_info_cycl", "_CSETF-PPH-PHRASE-INFO-CYCL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "_csetf_pph_phrase_info_agr", "_CSETF-PPH-PHRASE-INFO-AGR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "_csetf_pph_phrase_info_justification", "_CSETF-PPH-PHRASE-INFO-JUSTIFICATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "_csetf_pph_phrase_info_output_list", "_CSETF-PPH-PHRASE-INFO-OUTPUT-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "_csetf_pph_phrase_info_arg_position_map", "_CSETF-PPH-PHRASE-INFO-ARG-POSITION-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "_csetf_pph_phrase_info_other", "_CSETF-PPH-PHRASE-INFO-OTHER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "make_paraphrase_phrase_info_bundle", "MAKE-PARAPHRASE-PHRASE-INFO-BUNDLE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "visit_defstruct_paraphrase_phrase_info_bundle", "VISIT-DEFSTRUCT-PARAPHRASE-PHRASE-INFO-BUNDLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "visit_defstruct_object_paraphrase_phrase_info_bundle_method", "VISIT-DEFSTRUCT-OBJECT-PARAPHRASE-PHRASE-INFO-BUNDLE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_has_info_vector_p", "PPH-PHRASE-HAS-INFO-VECTOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_empty_info_vector_p", "PPH-EMPTY-INFO-VECTOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_info_vector_p", "PPH-INFO-VECTOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_plist", "PPH-PHRASE-PLIST", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_do_plist", "PPH-PHRASE-DO-PLIST");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_info_lookup", "PPH-PHRASE-INFO-LOOKUP", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_info_lookup_by_keyword_or_integer", "PPH-PHRASE-INFO-LOOKUP-BY-KEYWORD-OR-INTEGER", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_info_property_set_p", "PPH-PHRASE-INFO-PROPERTY-SET-P", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_info_set", "PPH-PHRASE-INFO-SET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_info_set_by_keyword_or_integer", "PPH-PHRASE-INFO-SET-BY-KEYWORD-OR-INTEGER", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_info_clear", "PPH-PHRASE-INFO-CLEAR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_output_item_print_function_trampoline", "PPH-PHRASE-OUTPUT-ITEM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_output_item_p", "PPH-PHRASE-OUTPUT-ITEM-P", 1, 0, false);
        new $pph_phrase_output_item_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_oi_string", "PPH-OI-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_oi_arg_position", "PPH-OI-ARG-POSITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_oi_cycl", "PPH-OI-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_oi_html_open_tag", "PPH-OI-HTML-OPEN-TAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_oi_html_close_tag", "PPH-OI-HTML-CLOSE-TAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_oi_agr", "PPH-OI-AGR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "_csetf_pph_oi_string", "_CSETF-PPH-OI-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "_csetf_pph_oi_arg_position", "_CSETF-PPH-OI-ARG-POSITION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "_csetf_pph_oi_cycl", "_CSETF-PPH-OI-CYCL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "_csetf_pph_oi_html_open_tag", "_CSETF-PPH-OI-HTML-OPEN-TAG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "_csetf_pph_oi_html_close_tag", "_CSETF-PPH-OI-HTML-CLOSE-TAG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "_csetf_pph_oi_agr", "_CSETF-PPH-OI-AGR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "make_pph_phrase_output_item", "MAKE-PPH-PHRASE-OUTPUT-ITEM", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "visit_defstruct_pph_phrase_output_item", "VISIT-DEFSTRUCT-PPH-PHRASE-OUTPUT-ITEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "visit_defstruct_object_pph_phrase_output_item_method", "VISIT-DEFSTRUCT-OBJECT-PPH-PHRASE-OUTPUT-ITEM-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "new_pph_phrase_output_item", "NEW-PPH-PHRASE-OUTPUT-ITEM", 0, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_output_item_copy", "PPH-PHRASE-OUTPUT-ITEM-COPY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pprint_pph_phrase_output_item", "PPRINT-PPH-PHRASE-OUTPUT-ITEM", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_output_item_string", "PPH-PHRASE-OUTPUT-ITEM-STRING", 1, 0, false);
        new $pph_phrase_output_item_string$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_output_item_set_string", "PPH-PHRASE-OUTPUT-ITEM-SET-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_output_item_prefix_string", "PPH-PHRASE-OUTPUT-ITEM-PREFIX-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_output_item_suffix_string", "PPH-PHRASE-OUTPUT-ITEM-SUFFIX-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_output_item_arg_position", "PPH-PHRASE-OUTPUT-ITEM-ARG-POSITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_output_item_set_arg_position", "PPH-PHRASE-OUTPUT-ITEM-SET-ARG-POSITION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_output_item_cycl", "PPH-PHRASE-OUTPUT-ITEM-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_output_item_set_cycl", "PPH-PHRASE-OUTPUT-ITEM-SET-CYCL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_output_item_agr_pred", "PPH-PHRASE-OUTPUT-ITEM-AGR-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_output_item_set_agr_pred", "PPH-PHRASE-OUTPUT-ITEM-SET-AGR-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_output_item_html_open_tag", "PPH-PHRASE-OUTPUT-ITEM-HTML-OPEN-TAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_output_item_html_close_tag", "PPH-PHRASE-OUTPUT-ITEM-HTML-CLOSE-TAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_output_item_html_tags", "PPH-PHRASE-OUTPUT-ITEM-HTML-TAGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_output_item_set_html_tags", "PPH-PHRASE-OUTPUT-ITEM-SET-HTML-TAGS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_output_item_demerits", "PPH-PHRASE-OUTPUT-ITEM-DEMERITS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_output_item_justification", "PPH-PHRASE-OUTPUT-ITEM-JUSTIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "new_pph_phrase_output_item_nospace_group", "NEW-PPH-PHRASE-OUTPUT-ITEM-NOSPACE-GROUP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "new_pph_phrase_output_item_nospace_group_from_olists", "NEW-PPH-PHRASE-OUTPUT-ITEM-NOSPACE-GROUP-FROM-OLISTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_output_item_nospace_group_p", "PPH-PHRASE-OUTPUT-ITEM-NOSPACE-GROUP-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_output_item_nospace_group_items", "PPH-PHRASE-OUTPUT-ITEM-NOSPACE-GROUP-ITEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_output_item_nospace_group_set_items", "PPH-PHRASE-OUTPUT-ITEM-NOSPACE-GROUP-SET-ITEMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_output_item_nospace_group_string", "PPH-PHRASE-OUTPUT-ITEM-NOSPACE-GROUP-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_output_item_nospace_group_get_string", "PPH-PHRASE-OUTPUT-ITEM-NOSPACE-GROUP-GET-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_output_item_nospace_group_copy", "PPH-PHRASE-OUTPUT-ITEM-NOSPACE-GROUP-COPY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_output_item_nospace_group_arg_position", "PPH-PHRASE-OUTPUT-ITEM-NOSPACE-GROUP-ARG-POSITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_output_item_nospace_group_set_arg_position", "PPH-PHRASE-OUTPUT-ITEM-NOSPACE-GROUP-SET-ARG-POSITION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_output_item_nospace_group_cycl", "PPH-PHRASE-OUTPUT-ITEM-NOSPACE-GROUP-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_output_item_nospace_group_set_cycl", "PPH-PHRASE-OUTPUT-ITEM-NOSPACE-GROUP-SET-CYCL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_output_item_nospace_group_agr_pred", "PPH-PHRASE-OUTPUT-ITEM-NOSPACE-GROUP-AGR-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_output_item_nospace_group_set_agr_pred", "PPH-PHRASE-OUTPUT-ITEM-NOSPACE-GROUP-SET-AGR-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_output_item_nospace_group_set_html_tags", "PPH-PHRASE-OUTPUT-ITEM-NOSPACE-GROUP-SET-HTML-TAGS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_output_item_nospace_group_html_open_tag", "PPH-PHRASE-OUTPUT-ITEM-NOSPACE-GROUP-HTML-OPEN-TAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_output_item_nospace_group_html_close_tag", "PPH-PHRASE-OUTPUT-ITEM-NOSPACE-GROUP-HTML-CLOSE-TAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_output_item_loose_p", "PPH-PHRASE-OUTPUT-ITEM-LOOSE-P", 1, 0, false);
        new $pph_phrase_output_item_loose_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "enhanced_pph_output_item_p", "ENHANCED-PPH-OUTPUT-ITEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "new_enhanced_pph_output_item", "NEW-ENHANCED-PPH-OUTPUT-ITEM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "enhanced_pph_output_item_item", "ENHANCED-PPH-OUTPUT-ITEM-ITEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "enhanced_pph_output_item_demerits", "ENHANCED-PPH-OUTPUT-ITEM-DEMERITS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "enhanced_pph_output_item_justification", "ENHANCED-PPH-OUTPUT-ITEM-JUSTIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "enhanced_pph_output_item_set_demerits", "ENHANCED-PPH-OUTPUT-ITEM-SET-DEMERITS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "enhanced_pph_output_item_set_justification", "ENHANCED-PPH-OUTPUT-ITEM-SET-JUSTIFICATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "cfasl_output_object_pph_phrase_output_item_method", "CFASL-OUTPUT-OBJECT-PPH-PHRASE-OUTPUT-ITEM-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "cfasl_output_pph_oi", "CFASL-OUTPUT-PPH-OI", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "cfasl_input_pph_oi", "CFASL-INPUT-PPH-OI", 1, 0, false);
        new $cfasl_input_pph_oi$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pprint_pph_phrase_info_bundle", "PPRINT-PPH-PHRASE-INFO-BUNDLE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "new_pph_phrase_limit", "NEW-PPH-PHRASE-LIMIT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "make_pph_phrase_shell", "MAKE-PPH-PHRASE-SHELL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "new_pph_phrase", "NEW-PPH-PHRASE", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "populate_pph_phrase", "POPULATE-PPH-PHRASE", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_info_vector_slots", "PPH-INFO-VECTOR-SLOTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "make_pph_info_vector", "MAKE-PPH-INFO-VECTOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_info_vector", "PPH-PHRASE-INFO-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_info_vector_lookup", "PPH-PHRASE-INFO-VECTOR-LOOKUP", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_info_vector_lookup_no_default", "PPH-PHRASE-INFO-VECTOR-LOOKUP-NO-DEFAULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_info_vector_clear", "PPH-PHRASE-INFO-VECTOR-CLEAR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_info_vector_lookup", "PPH-INFO-VECTOR-LOOKUP", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_info_vector_straight_lookup", "PPH-INFO-VECTOR-STRAIGHT-LOOKUP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_info_vector_set", "PPH-PHRASE-INFO-VECTOR-SET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_id_index", "PPH-PHRASE-ID-INDEX", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_id_index_new_objects_size", "PPH-PHRASE-ID-INDEX-NEW-OBJECTS-SIZE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_id_index_new_objects_count", "PPH-PHRASE-ID-INDEX-NEW-OBJECTS-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "clear_pph_phrase_id_index", "CLEAR-PPH-PHRASE-ID-INDEX", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_id_index_enter", "PPH-PHRASE-ID-INDEX-ENTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_id_index_remove", "PPH-PHRASE-ID-INDEX-REMOVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "optimize_pph_phrase_id_index", "OPTIMIZE-PPH-PHRASE-ID-INDEX", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "remove_invalid_pph_phrases", "REMOVE-INVALID-PPH-PHRASES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "valid_pph_phrase_p", "VALID-PPH-PHRASE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_set_suid_if_valid", "PPH-PHRASE-SET-SUID-IF-VALID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "get_next_pph_phrase_id", "GET-NEXT-PPH-PHRASE-ID", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "find_pph_phrase_by_id", "FIND-PPH-PHRASE-BY-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_count", "PPH-PHRASE-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_constituents_vector_to_id_list", "PPH-PHRASE-CONSTITUENTS-VECTOR-TO-ID-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_constituents_id_list_to_vector", "PPH-PHRASE-CONSTITUENTS-ID-LIST-TO-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "dump_pph_phrase_content", "DUMP-PPH-PHRASE-CONTENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "load_pph_phrase_content", "LOAD-PPH-PHRASE-CONTENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "prepare_pph_phrase_info_other_for_dump", "PREPARE-PPH-PHRASE-INFO-OTHER-FOR-DUMP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "recover_pph_phrase_info_other", "RECOVER-PPH-PHRASE-INFO-OTHER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_listified_vector_p", "PPH-LISTIFIED-VECTOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "listify_pph_vectors", "LISTIFY-PPH-VECTORS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "listify_pph_vector", "LISTIFY-PPH-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "delistify_pph_vectors", "DELISTIFY-PPH-VECTORS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "delistify_pph_vector", "DELISTIFY-PPH-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "shellify_pph_phrases", "SHELLIFY-PPH-PHRASES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "shellify_pph_phrase", "SHELLIFY-PPH-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "shellified_pph_phrase_p", "SHELLIFIED-PPH-PHRASE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "deshellify_pph_phrases", "DESHELLIFY-PPH-PHRASES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "deshellify_pph_phrase", "DESHELLIFY-PPH-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "paraphrase_cycl_caches_unbuiltP", "PARAPHRASE-CYCL-CACHES-UNBUILT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "rebuild_paraphrase_cycl_caches", "REBUILD-PARAPHRASE-CYCL-CACHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "dump_gen_template_store_to_stream", "DUMP-GEN-TEMPLATE-STORE-TO-STREAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "load_gen_template_store_from_stream", "LOAD-GEN-TEMPLATE-STORE-FROM-STREAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_template_generator_print_function_trampoline", "PPH-PHRASE-TEMPLATE-GENERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_template_generator_p", "PPH-PHRASE-TEMPLATE-GENERATOR-P", 1, 0, false);
        new $pph_phrase_template_generator_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_template_generator_formula", "PPH-PHRASE-TEMPLATE-GENERATOR-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_template_generator_mt", "PPH-PHRASE-TEMPLATE-GENERATOR-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_template_generator_focus_arg", "PPH-PHRASE-TEMPLATE-GENERATOR-FOCUS-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_template_generator_specified_reln", "PPH-PHRASE-TEMPLATE-GENERATOR-SPECIFIED-RELN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_template_generator_nl_preds", "PPH-PHRASE-TEMPLATE-GENERATOR-NL-PREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_template_generator_doneP", "PPH-PHRASE-TEMPLATE-GENERATOR-DONE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_template_generator_search_limit", "PPH-PHRASE-TEMPLATE-GENERATOR-SEARCH-LIMIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_template_generator_search_level", "PPH-PHRASE-TEMPLATE-GENERATOR-SEARCH-LEVEL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_template_generator_relns_to_use", "PPH-PHRASE-TEMPLATE-GENERATOR-RELNS-TO-USE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_template_generator_gen_template_sets", "PPH-PHRASE-TEMPLATE-GENERATOR-GEN-TEMPLATE-SETS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_template_generator_gen_templates", "PPH-PHRASE-TEMPLATE-GENERATOR-GEN-TEMPLATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_template_generator_arg_position_map", "PPH-PHRASE-TEMPLATE-GENERATOR-ARG-POSITION-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "_csetf_pph_phrase_template_generator_formula", "_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "_csetf_pph_phrase_template_generator_mt", "_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "_csetf_pph_phrase_template_generator_focus_arg", "_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-FOCUS-ARG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "_csetf_pph_phrase_template_generator_specified_reln", "_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-SPECIFIED-RELN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "_csetf_pph_phrase_template_generator_nl_preds", "_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-NL-PREDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "_csetf_pph_phrase_template_generator_doneP", "_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-DONE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "_csetf_pph_phrase_template_generator_search_limit", "_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-SEARCH-LIMIT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "_csetf_pph_phrase_template_generator_search_level", "_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-SEARCH-LEVEL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "_csetf_pph_phrase_template_generator_relns_to_use", "_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-RELNS-TO-USE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "_csetf_pph_phrase_template_generator_gen_template_sets", "_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-GEN-TEMPLATE-SETS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "_csetf_pph_phrase_template_generator_gen_templates", "_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-GEN-TEMPLATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "_csetf_pph_phrase_template_generator_arg_position_map", "_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-ARG-POSITION-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "make_pph_phrase_template_generator", "MAKE-PPH-PHRASE-TEMPLATE-GENERATOR", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "visit_defstruct_pph_phrase_template_generator", "VISIT-DEFSTRUCT-PPH-PHRASE-TEMPLATE-GENERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "visit_defstruct_object_pph_phrase_template_generator_method", "VISIT-DEFSTRUCT-OBJECT-PPH-PHRASE-TEMPLATE-GENERATOR-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pprint_pph_phrase_template_generator", "PPRINT-PPH-PHRASE-TEMPLATE-GENERATOR", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "initialize_pph_phrase_template_generator", "INITIALIZE-PPH-PHRASE-TEMPLATE-GENERATOR", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_template_generator_done_p", "PPH-PHRASE-TEMPLATE-GENERATOR-DONE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "get_pph_phrase_template_generator", "GET-PPH-PHRASE-TEMPLATE-GENERATOR", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "free_pph_phrase_template_generator", "FREE-PPH-PHRASE-TEMPLATE-GENERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_output_list_iterator_print_function_trampoline", "PPH-PHRASE-OUTPUT-LIST-ITERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_output_list_iterator_p", "PPH-PHRASE-OUTPUT-LIST-ITERATOR-P", 1, 0, false);
        new $pph_phrase_output_list_iterator_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_output_list_iterator_item_queue", "PPH-PHRASE-OUTPUT-LIST-ITERATOR-ITEM-QUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "_csetf_pph_phrase_output_list_iterator_item_queue", "_CSETF-PPH-PHRASE-OUTPUT-LIST-ITERATOR-ITEM-QUEUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "make_pph_phrase_output_list_iterator", "MAKE-PPH-PHRASE-OUTPUT-LIST-ITERATOR", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "visit_defstruct_pph_phrase_output_list_iterator", "VISIT-DEFSTRUCT-PPH-PHRASE-OUTPUT-LIST-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "visit_defstruct_object_pph_phrase_output_list_iterator_method", "VISIT-DEFSTRUCT-OBJECT-PPH-PHRASE-OUTPUT-LIST-ITERATOR-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pprint_pph_phrase_output_list_iterator", "PPRINT-PPH-PHRASE-OUTPUT-LIST-ITERATOR", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "new_pph_phrase_output_list_iterator", "NEW-PPH-PHRASE-OUTPUT-LIST-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_output_list_iterator_empty_p", "PPH-PHRASE-OUTPUT-LIST-ITERATOR-EMPTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_output_list_iterator_next", "PPH-PHRASE-OUTPUT-LIST-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_phrase_output_item_nospace_group_grab_first_item", "PPH-PHRASE-OUTPUT-ITEM-NOSPACE-GROUP-GRAB-FIRST-ITEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_nospace_group_remove_first_item", "PPH-NOSPACE-GROUP-REMOVE-FIRST-ITEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_data_structures", "pph_update_output_item_from_nospace_group", "PPH-UPDATE-OUTPUT-ITEM-FROM-NOSPACE-GROUP", 2, 0, false);
        return (SubLObject)pph_data_structures.NIL;
    }
    
    public static SubLObject init_pph_data_structures_file() {
        pph_data_structures.$relation_cardinality$ = SubLFiles.deflexical("*RELATION-CARDINALITY*", (SubLObject)pph_data_structures.$int1$12000);
        pph_data_structures.$gen_template_store$ = SubLFiles.deflexical("*GEN-TEMPLATE-STORE*", (pph_data_structures.NIL != Symbols.boundp((SubLObject)pph_data_structures.$sym2$_GEN_TEMPLATE_STORE_)) ? pph_data_structures.$gen_template_store$.getGlobalValue() : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)pph_data_structures.EQ), pph_data_structures.$relation_cardinality$.getGlobalValue()));
        pph_data_structures.$gen_template_store_initializedP$ = SubLFiles.deflexical("*GEN-TEMPLATE-STORE-INITIALIZED?*", (SubLObject)((pph_data_structures.NIL != Symbols.boundp((SubLObject)pph_data_structures.$sym3$_GEN_TEMPLATE_STORE_INITIALIZED__)) ? pph_data_structures.$gen_template_store_initializedP$.getGlobalValue() : pph_data_structures.NIL));
        pph_data_structures.$dtp_generation_template$ = SubLFiles.defconstant("*DTP-GENERATION-TEMPLATE*", (SubLObject)pph_data_structures.$sym9$GENERATION_TEMPLATE);
        pph_data_structures.$cfasl_opcode_generation_template$ = SubLFiles.defconstant("*CFASL-OPCODE-GENERATION-TEMPLATE*", (SubLObject)pph_data_structures.$int42$72);
        pph_data_structures.$dtp_pph_phrase_agr$ = SubLFiles.defconstant("*DTP-PPH-PHRASE-AGR*", (SubLObject)pph_data_structures.$sym45$PPH_PHRASE_AGR);
        pph_data_structures.$cfasl_opcode_pph_phrase_agr$ = SubLFiles.defconstant("*CFASL-OPCODE-PPH-PHRASE-AGR*", (SubLObject)pph_data_structures.$int68$73);
        pph_data_structures.$dtp_paraphrase_phrase_info_bundle$ = SubLFiles.defconstant("*DTP-PARAPHRASE-PHRASE-INFO-BUNDLE*", (SubLObject)pph_data_structures.$sym72$PARAPHRASE_PHRASE_INFO_BUNDLE);
        pph_data_structures.$pph_empty_info_vector$ = SubLFiles.deflexical("*PPH-EMPTY-INFO-VECTOR*", (SubLObject)pph_data_structures.$kw101$PPH_EMPTY_INFO_VECTOR);
        pph_data_structures.$dtp_pph_phrase_output_item$ = SubLFiles.defconstant("*DTP-PPH-PHRASE-OUTPUT-ITEM*", (SubLObject)pph_data_structures.$sym108$PPH_PHRASE_OUTPUT_ITEM);
        pph_data_structures.$cfasl_opcode_pph_oi$ = SubLFiles.defconstant("*CFASL-OPCODE-PPH-OI*", (SubLObject)pph_data_structures.$int148$74);
        pph_data_structures.$a_lot_of_new_pph_phrases$ = SubLFiles.deflexical("*A-LOT-OF-NEW-PPH-PHRASES*", (SubLObject)pph_data_structures.$int152$50000);
        pph_data_structures.$a_whole_lot_of_new_pph_phrases$ = SubLFiles.deflexical("*A-WHOLE-LOT-OF-NEW-PPH-PHRASES*", (SubLObject)pph_data_structures.$int153$200000);
        pph_data_structures.$a_shitload_of_new_pph_phrases$ = SubLFiles.deflexical("*A-SHITLOAD-OF-NEW-PPH-PHRASES*", (SubLObject)pph_data_structures.$int154$500000);
        pph_data_structures.$pph_info_vector_slots$ = SubLFiles.deflexical("*PPH-INFO-VECTOR-SLOTS*", (SubLObject)pph_data_structures.$list157);
        pph_data_structures.$pph_info_vector_unspecified_value$ = SubLFiles.deflexical("*PPH-INFO-VECTOR-UNSPECIFIED-VALUE*", (SubLObject)Characters.CHAR_vertical);
        pph_data_structures.$pph_phrase_id_index$ = SubLFiles.deflexical("*PPH-PHRASE-ID-INDEX*", (pph_data_structures.NIL != Symbols.boundp((SubLObject)pph_data_structures.$sym159$_PPH_PHRASE_ID_INDEX_)) ? pph_data_structures.$pph_phrase_id_index$.getGlobalValue() : id_index.new_id_index((SubLObject)pph_data_structures.UNPROVIDED, (SubLObject)pph_data_structures.UNPROVIDED));
        pph_data_structures.$pph_phrase_id_index_lock$ = SubLFiles.deflexical("*PPH-PHRASE-ID-INDEX-LOCK*", Locks.make_lock((SubLObject)pph_data_structures.$str160$PPH_phrase_ID_index));
        pph_data_structures.$pph_listified_vector_marker$ = SubLFiles.deflexical("*PPH-LISTIFIED-VECTOR-MARKER*", (SubLObject)pph_data_structures.$kw177$LISTIFIED_PPH_VECTOR);
        pph_data_structures.$pph_phrase_shell_marker$ = SubLFiles.deflexical("*PPH-PHRASE-SHELL-MARKER*", (SubLObject)pph_data_structures.$kw182$PPH_PHRASE_SHELL);
        pph_data_structures.$dtp_pph_phrase_template_generator$ = SubLFiles.defconstant("*DTP-PPH-PHRASE-TEMPLATE-GENERATOR*", (SubLObject)pph_data_structures.$sym187$PPH_PHRASE_TEMPLATE_GENERATOR);
        pph_data_structures.$free_pph_phrase_template_generators$ = SubLFiles.deflexical("*FREE-PPH-PHRASE-TEMPLATE-GENERATORS*", (pph_data_structures.NIL != Symbols.boundp((SubLObject)pph_data_structures.$sym236$_FREE_PPH_PHRASE_TEMPLATE_GENERATORS_)) ? pph_data_structures.$free_pph_phrase_template_generators$.getGlobalValue() : queues.create_queue((SubLObject)pph_data_structures.UNPROVIDED));
        pph_data_structures.$dtp_pph_phrase_output_list_iterator$ = SubLFiles.defconstant("*DTP-PPH-PHRASE-OUTPUT-LIST-ITERATOR*", (SubLObject)pph_data_structures.$sym241$PPH_PHRASE_OUTPUT_LIST_ITERATOR);
        return (SubLObject)pph_data_structures.NIL;
    }
    
    public static SubLObject setup_pph_data_structures_file() {
        pph_vars.$pph_data_structures_code_revision$.setGlobalValue((SubLObject)pph_data_structures.$str0$_Revision__148135__);
        subl_macro_promotions.declare_defglobal((SubLObject)pph_data_structures.$sym2$_GEN_TEMPLATE_STORE_);
        subl_macro_promotions.declare_defglobal((SubLObject)pph_data_structures.$sym3$_GEN_TEMPLATE_STORE_INITIALIZED__);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), pph_data_structures.$dtp_generation_template$.getGlobalValue(), Symbols.symbol_function((SubLObject)pph_data_structures.$sym16$GENERATION_TEMPLATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)pph_data_structures.$list17);
        Structures.def_csetf((SubLObject)pph_data_structures.$sym18$GEN_TEMPLATE_PHRASE, (SubLObject)pph_data_structures.$sym19$_CSETF_GEN_TEMPLATE_PHRASE);
        Structures.def_csetf((SubLObject)pph_data_structures.$sym20$GEN_TEMPLATE_CONSTRAINT, (SubLObject)pph_data_structures.$sym21$_CSETF_GEN_TEMPLATE_CONSTRAINT);
        Structures.def_csetf((SubLObject)pph_data_structures.$sym22$GEN_TEMPLATE_ASSERTION, (SubLObject)pph_data_structures.$sym23$_CSETF_GEN_TEMPLATE_ASSERTION);
        Equality.identity((SubLObject)pph_data_structures.$sym9$GENERATION_TEMPLATE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), pph_data_structures.$dtp_generation_template$.getGlobalValue(), Symbols.symbol_function((SubLObject)pph_data_structures.$sym32$VISIT_DEFSTRUCT_OBJECT_GENERATION_TEMPLATE_METHOD));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), pph_data_structures.$dtp_generation_template$.getGlobalValue(), Symbols.symbol_function((SubLObject)pph_data_structures.$sym33$SXHASH_GENERATION_TEMPLATE_METHOD));
        cfasl.register_cfasl_input_function(pph_data_structures.$cfasl_opcode_generation_template$.getGlobalValue(), (SubLObject)pph_data_structures.$sym43$CFASL_INPUT_GENERATION_TEMPLATE);
        Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), pph_data_structures.$dtp_generation_template$.getGlobalValue(), Symbols.symbol_function((SubLObject)pph_data_structures.$sym44$CFASL_OUTPUT_OBJECT_GENERATION_TEMPLATE_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), pph_data_structures.$dtp_pph_phrase_agr$.getGlobalValue(), Symbols.symbol_function((SubLObject)pph_data_structures.$sym52$PPH_PHRASE_AGR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)pph_data_structures.$list53);
        Structures.def_csetf((SubLObject)pph_data_structures.$sym54$PPH_PHRASE_AGR_ABSOLUTE_CONSTRAINT, (SubLObject)pph_data_structures.$sym55$_CSETF_PPH_PHRASE_AGR_ABSOLUTE_CONSTRAINT);
        Structures.def_csetf((SubLObject)pph_data_structures.$sym56$PPH_PHRASE_AGR_RELATIVE_CONSTRAINT, (SubLObject)pph_data_structures.$sym57$_CSETF_PPH_PHRASE_AGR_RELATIVE_CONSTRAINT);
        Equality.identity((SubLObject)pph_data_structures.$sym45$PPH_PHRASE_AGR);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), pph_data_structures.$dtp_pph_phrase_agr$.getGlobalValue(), Symbols.symbol_function((SubLObject)pph_data_structures.$sym61$VISIT_DEFSTRUCT_OBJECT_PPH_PHRASE_AGR_METHOD));
        cfasl.register_cfasl_input_function(pph_data_structures.$cfasl_opcode_pph_phrase_agr$.getGlobalValue(), (SubLObject)pph_data_structures.$sym69$CFASL_INPUT_PPH_PHRASE_AGR);
        Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), pph_data_structures.$dtp_pph_phrase_agr$.getGlobalValue(), Symbols.symbol_function((SubLObject)pph_data_structures.$sym70$CFASL_OUTPUT_OBJECT_PPH_PHRASE_AGR_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), pph_data_structures.$dtp_paraphrase_phrase_info_bundle$.getGlobalValue(), Symbols.symbol_function((SubLObject)pph_data_structures.$sym79$PARAPHRASE_PHRASE_INFO_BUNDLE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)pph_data_structures.$list80);
        Structures.def_csetf((SubLObject)pph_data_structures.$sym81$PPH_PHRASE_INFO_CYCL, (SubLObject)pph_data_structures.$sym82$_CSETF_PPH_PHRASE_INFO_CYCL);
        Structures.def_csetf((SubLObject)pph_data_structures.$sym83$PPH_PHRASE_INFO_AGR, (SubLObject)pph_data_structures.$sym84$_CSETF_PPH_PHRASE_INFO_AGR);
        Structures.def_csetf((SubLObject)pph_data_structures.$sym85$PPH_PHRASE_INFO_JUSTIFICATION, (SubLObject)pph_data_structures.$sym86$_CSETF_PPH_PHRASE_INFO_JUSTIFICATION);
        Structures.def_csetf((SubLObject)pph_data_structures.$sym87$PPH_PHRASE_INFO_OUTPUT_LIST, (SubLObject)pph_data_structures.$sym88$_CSETF_PPH_PHRASE_INFO_OUTPUT_LIST);
        Structures.def_csetf((SubLObject)pph_data_structures.$sym89$PPH_PHRASE_INFO_ARG_POSITION_MAP, (SubLObject)pph_data_structures.$sym90$_CSETF_PPH_PHRASE_INFO_ARG_POSITION_MAP);
        Structures.def_csetf((SubLObject)pph_data_structures.$sym91$PPH_PHRASE_INFO_OTHER, (SubLObject)pph_data_structures.$sym92$_CSETF_PPH_PHRASE_INFO_OTHER);
        Equality.identity((SubLObject)pph_data_structures.$sym72$PARAPHRASE_PHRASE_INFO_BUNDLE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), pph_data_structures.$dtp_paraphrase_phrase_info_bundle$.getGlobalValue(), Symbols.symbol_function((SubLObject)pph_data_structures.$sym100$VISIT_DEFSTRUCT_OBJECT_PARAPHRASE_PHRASE_INFO_BUNDLE_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), pph_data_structures.$dtp_pph_phrase_output_item$.getGlobalValue(), Symbols.symbol_function((SubLObject)pph_data_structures.$sym115$PPH_PHRASE_OUTPUT_ITEM_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)pph_data_structures.$list116);
        Structures.def_csetf((SubLObject)pph_data_structures.$sym117$PPH_OI_STRING, (SubLObject)pph_data_structures.$sym118$_CSETF_PPH_OI_STRING);
        Structures.def_csetf((SubLObject)pph_data_structures.$sym119$PPH_OI_ARG_POSITION, (SubLObject)pph_data_structures.$sym120$_CSETF_PPH_OI_ARG_POSITION);
        Structures.def_csetf((SubLObject)pph_data_structures.$sym121$PPH_OI_CYCL, (SubLObject)pph_data_structures.$sym122$_CSETF_PPH_OI_CYCL);
        Structures.def_csetf((SubLObject)pph_data_structures.$sym123$PPH_OI_HTML_OPEN_TAG, (SubLObject)pph_data_structures.$sym124$_CSETF_PPH_OI_HTML_OPEN_TAG);
        Structures.def_csetf((SubLObject)pph_data_structures.$sym125$PPH_OI_HTML_CLOSE_TAG, (SubLObject)pph_data_structures.$sym126$_CSETF_PPH_OI_HTML_CLOSE_TAG);
        Structures.def_csetf((SubLObject)pph_data_structures.$sym127$PPH_OI_AGR, (SubLObject)pph_data_structures.$sym128$_CSETF_PPH_OI_AGR);
        Equality.identity((SubLObject)pph_data_structures.$sym108$PPH_PHRASE_OUTPUT_ITEM);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), pph_data_structures.$dtp_pph_phrase_output_item$.getGlobalValue(), Symbols.symbol_function((SubLObject)pph_data_structures.$sym134$VISIT_DEFSTRUCT_OBJECT_PPH_PHRASE_OUTPUT_ITEM_METHOD));
        cfasl.register_cfasl_input_function(pph_data_structures.$cfasl_opcode_pph_oi$.getGlobalValue(), (SubLObject)pph_data_structures.$sym149$CFASL_INPUT_PPH_OI);
        Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), pph_data_structures.$dtp_pph_phrase_output_item$.getGlobalValue(), Symbols.symbol_function((SubLObject)pph_data_structures.$sym150$CFASL_OUTPUT_OBJECT_PPH_PHRASE_OUTPUT_ITEM_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)pph_data_structures.$sym159$_PPH_PHRASE_ID_INDEX_);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), pph_data_structures.$dtp_pph_phrase_template_generator$.getGlobalValue(), Symbols.symbol_function((SubLObject)pph_data_structures.$sym194$PPH_PHRASE_TEMPLATE_GENERATOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)pph_data_structures.$list195);
        Structures.def_csetf((SubLObject)pph_data_structures.$sym196$PPH_PHRASE_TEMPLATE_GENERATOR_FORMULA, (SubLObject)pph_data_structures.$sym197$_CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_FORMULA);
        Structures.def_csetf((SubLObject)pph_data_structures.$sym198$PPH_PHRASE_TEMPLATE_GENERATOR_MT, (SubLObject)pph_data_structures.$sym199$_CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_MT);
        Structures.def_csetf((SubLObject)pph_data_structures.$sym200$PPH_PHRASE_TEMPLATE_GENERATOR_FOCUS_ARG, (SubLObject)pph_data_structures.$sym201$_CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_FOCUS_ARG);
        Structures.def_csetf((SubLObject)pph_data_structures.$sym202$PPH_PHRASE_TEMPLATE_GENERATOR_SPECIFIED_RELN, (SubLObject)pph_data_structures.$sym203$_CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_SPECIFIED_RELN);
        Structures.def_csetf((SubLObject)pph_data_structures.$sym204$PPH_PHRASE_TEMPLATE_GENERATOR_NL_PREDS, (SubLObject)pph_data_structures.$sym205$_CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_NL_PREDS);
        Structures.def_csetf((SubLObject)pph_data_structures.$sym206$PPH_PHRASE_TEMPLATE_GENERATOR_DONE_, (SubLObject)pph_data_structures.$sym207$_CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_DONE_);
        Structures.def_csetf((SubLObject)pph_data_structures.$sym208$PPH_PHRASE_TEMPLATE_GENERATOR_SEARCH_LIMIT, (SubLObject)pph_data_structures.$sym209$_CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_SEARCH_LIMIT);
        Structures.def_csetf((SubLObject)pph_data_structures.$sym210$PPH_PHRASE_TEMPLATE_GENERATOR_SEARCH_LEVEL, (SubLObject)pph_data_structures.$sym211$_CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_SEARCH_LEVEL);
        Structures.def_csetf((SubLObject)pph_data_structures.$sym212$PPH_PHRASE_TEMPLATE_GENERATOR_RELNS_TO_USE, (SubLObject)pph_data_structures.$sym213$_CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_RELNS_TO_USE);
        Structures.def_csetf((SubLObject)pph_data_structures.$sym214$PPH_PHRASE_TEMPLATE_GENERATOR_GEN_TEMPLATE_SETS, (SubLObject)pph_data_structures.$sym215$_CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_GEN_TEMPLATE_SETS);
        Structures.def_csetf((SubLObject)pph_data_structures.$sym216$PPH_PHRASE_TEMPLATE_GENERATOR_GEN_TEMPLATES, (SubLObject)pph_data_structures.$sym217$_CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_GEN_TEMPLATES);
        Structures.def_csetf((SubLObject)pph_data_structures.$sym218$PPH_PHRASE_TEMPLATE_GENERATOR_ARG_POSITION_MAP, (SubLObject)pph_data_structures.$sym219$_CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_ARG_POSITION_MAP);
        Equality.identity((SubLObject)pph_data_structures.$sym187$PPH_PHRASE_TEMPLATE_GENERATOR);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), pph_data_structures.$dtp_pph_phrase_template_generator$.getGlobalValue(), Symbols.symbol_function((SubLObject)pph_data_structures.$sym232$VISIT_DEFSTRUCT_OBJECT_PPH_PHRASE_TEMPLATE_GENERATOR_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)pph_data_structures.$sym236$_FREE_PPH_PHRASE_TEMPLATE_GENERATORS_);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), pph_data_structures.$dtp_pph_phrase_output_list_iterator$.getGlobalValue(), Symbols.symbol_function((SubLObject)pph_data_structures.$sym248$PPH_PHRASE_OUTPUT_LIST_ITERATOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)pph_data_structures.$list249);
        Structures.def_csetf((SubLObject)pph_data_structures.$sym250$PPH_PHRASE_OUTPUT_LIST_ITERATOR_ITEM_QUEUE, (SubLObject)pph_data_structures.$sym251$_CSETF_PPH_PHRASE_OUTPUT_LIST_ITERATOR_ITEM_QUEUE);
        Equality.identity((SubLObject)pph_data_structures.$sym241$PPH_PHRASE_OUTPUT_LIST_ITERATOR);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), pph_data_structures.$dtp_pph_phrase_output_list_iterator$.getGlobalValue(), Symbols.symbol_function((SubLObject)pph_data_structures.$sym254$VISIT_DEFSTRUCT_OBJECT_PPH_PHRASE_OUTPUT_LIST_ITERATOR_METHOD));
        return (SubLObject)pph_data_structures.NIL;
    }
    
    public void declareFunctions() {
        declare_pph_data_structures_file();
    }
    
    public void initializeVariables() {
        init_pph_data_structures_file();
    }
    
    public void runTopLevelForms() {
        setup_pph_data_structures_file();
    }
    
    static {
        me = (SubLFile)new pph_data_structures();
        pph_data_structures.$relation_cardinality$ = null;
        pph_data_structures.$gen_template_store$ = null;
        pph_data_structures.$gen_template_store_initializedP$ = null;
        pph_data_structures.$dtp_generation_template$ = null;
        pph_data_structures.$cfasl_opcode_generation_template$ = null;
        pph_data_structures.$dtp_pph_phrase_agr$ = null;
        pph_data_structures.$cfasl_opcode_pph_phrase_agr$ = null;
        pph_data_structures.$dtp_paraphrase_phrase_info_bundle$ = null;
        pph_data_structures.$pph_empty_info_vector$ = null;
        pph_data_structures.$dtp_pph_phrase_output_item$ = null;
        pph_data_structures.$cfasl_opcode_pph_oi$ = null;
        pph_data_structures.$a_lot_of_new_pph_phrases$ = null;
        pph_data_structures.$a_whole_lot_of_new_pph_phrases$ = null;
        pph_data_structures.$a_shitload_of_new_pph_phrases$ = null;
        pph_data_structures.$pph_info_vector_slots$ = null;
        pph_data_structures.$pph_info_vector_unspecified_value$ = null;
        pph_data_structures.$pph_phrase_id_index$ = null;
        pph_data_structures.$pph_phrase_id_index_lock$ = null;
        pph_data_structures.$pph_listified_vector_marker$ = null;
        pph_data_structures.$pph_phrase_shell_marker$ = null;
        pph_data_structures.$dtp_pph_phrase_template_generator$ = null;
        pph_data_structures.$free_pph_phrase_template_generators$ = null;
        pph_data_structures.$dtp_pph_phrase_output_list_iterator$ = null;
        $str0$_Revision__148135__ = SubLObjectFactory.makeString("$Revision: 148135 $");
        $int1$12000 = SubLObjectFactory.makeInteger(12000);
        $sym2$_GEN_TEMPLATE_STORE_ = SubLObjectFactory.makeSymbol("*GEN-TEMPLATE-STORE*");
        $sym3$_GEN_TEMPLATE_STORE_INITIALIZED__ = SubLObjectFactory.makeSymbol("*GEN-TEMPLATE-STORE-INITIALIZED?*");
        $str4$Gen_Template_Store_not_initialize = SubLObjectFactory.makeString("Gen-Template Store not initialized! Initializing now.");
        $str5$Gen_Template_Store_unacceptably_s = SubLObjectFactory.makeString("Gen-Template Store unacceptably stale! Initializing now.");
        $kw6$INITIALIZED = SubLObjectFactory.makeKeyword("INITIALIZED");
        $kw7$ENTERED = SubLObjectFactory.makeKeyword("ENTERED");
        $kw8$CLEARED = SubLObjectFactory.makeKeyword("CLEARED");
        $sym9$GENERATION_TEMPLATE = SubLObjectFactory.makeSymbol("GENERATION-TEMPLATE");
        $sym10$GENERATION_TEMPLATE_P = SubLObjectFactory.makeSymbol("GENERATION-TEMPLATE-P");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PHRASE"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINT"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"));
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PHRASE"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTRAINT"), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"));
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GEN-TEMPLATE-PHRASE"), (SubLObject)SubLObjectFactory.makeSymbol("GEN-TEMPLATE-CONSTRAINT"), (SubLObject)SubLObjectFactory.makeSymbol("GEN-TEMPLATE-ASSERTION"));
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GEN-TEMPLATE-PHRASE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GEN-TEMPLATE-CONSTRAINT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GEN-TEMPLATE-ASSERTION"));
        $sym15$PPRINT_GEN_TEMPLATE = SubLObjectFactory.makeSymbol("PPRINT-GEN-TEMPLATE");
        $sym16$GENERATION_TEMPLATE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("GENERATION-TEMPLATE-PRINT-FUNCTION-TRAMPOLINE");
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("GENERATION-TEMPLATE-P"));
        $sym18$GEN_TEMPLATE_PHRASE = SubLObjectFactory.makeSymbol("GEN-TEMPLATE-PHRASE");
        $sym19$_CSETF_GEN_TEMPLATE_PHRASE = SubLObjectFactory.makeSymbol("_CSETF-GEN-TEMPLATE-PHRASE");
        $sym20$GEN_TEMPLATE_CONSTRAINT = SubLObjectFactory.makeSymbol("GEN-TEMPLATE-CONSTRAINT");
        $sym21$_CSETF_GEN_TEMPLATE_CONSTRAINT = SubLObjectFactory.makeSymbol("_CSETF-GEN-TEMPLATE-CONSTRAINT");
        $sym22$GEN_TEMPLATE_ASSERTION = SubLObjectFactory.makeSymbol("GEN-TEMPLATE-ASSERTION");
        $sym23$_CSETF_GEN_TEMPLATE_ASSERTION = SubLObjectFactory.makeSymbol("_CSETF-GEN-TEMPLATE-ASSERTION");
        $kw24$PHRASE = SubLObjectFactory.makeKeyword("PHRASE");
        $kw25$CONSTRAINT = SubLObjectFactory.makeKeyword("CONSTRAINT");
        $kw26$ASSERTION = SubLObjectFactory.makeKeyword("ASSERTION");
        $str27$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw28$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym29$MAKE_GENERATION_TEMPLATE = SubLObjectFactory.makeSymbol("MAKE-GENERATION-TEMPLATE");
        $kw30$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw31$END = SubLObjectFactory.makeKeyword("END");
        $sym32$VISIT_DEFSTRUCT_OBJECT_GENERATION_TEMPLATE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-GENERATION-TEMPLATE-METHOD");
        $sym33$SXHASH_GENERATION_TEMPLATE_METHOD = SubLObjectFactory.makeSymbol("SXHASH-GENERATION-TEMPLATE-METHOD");
        $sym34$PPH_PHRASE_P = SubLObjectFactory.makeSymbol("PPH-PHRASE-P");
        $sym35$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $str36$__GEN_TEMPLATE__S_ = SubLObjectFactory.makeString("#<GEN-TEMPLATE ~S>");
        $str37$_PPH_error_level_ = SubLObjectFactory.makeString("(PPH error level ");
        $str38$__ = SubLObjectFactory.makeString(") ");
        $str39$Can_t_get_assertion_from__S___Fou = SubLObjectFactory.makeString("Can't get assertion from ~S~% Found ~S");
        $const40$ParaphraseMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ParaphraseMt"));
        $str41$Can_t_get_mt_from__S___Found__S = SubLObjectFactory.makeString("Can't get mt from ~S~% Found ~S");
        $int42$72 = SubLObjectFactory.makeInteger(72);
        $sym43$CFASL_INPUT_GENERATION_TEMPLATE = SubLObjectFactory.makeSymbol("CFASL-INPUT-GENERATION-TEMPLATE");
        $sym44$CFASL_OUTPUT_OBJECT_GENERATION_TEMPLATE_METHOD = SubLObjectFactory.makeSymbol("CFASL-OUTPUT-OBJECT-GENERATION-TEMPLATE-METHOD");
        $sym45$PPH_PHRASE_AGR = SubLObjectFactory.makeSymbol("PPH-PHRASE-AGR");
        $sym46$PPH_PHRASE_AGR_P = SubLObjectFactory.makeSymbol("PPH-PHRASE-AGR-P");
        $list47 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ABSOLUTE-CONSTRAINT"), (SubLObject)SubLObjectFactory.makeSymbol("RELATIVE-CONSTRAINT"));
        $list48 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ABSOLUTE-CONSTRAINT"), (SubLObject)SubLObjectFactory.makeKeyword("RELATIVE-CONSTRAINT"));
        $list49 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-PHRASE-AGR-ABSOLUTE-CONSTRAINT"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-PHRASE-AGR-RELATIVE-CONSTRAINT"));
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PPH-PHRASE-AGR-ABSOLUTE-CONSTRAINT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PPH-PHRASE-AGR-RELATIVE-CONSTRAINT"));
        $sym51$PPRINT_PPH_PHRASE_AGR = SubLObjectFactory.makeSymbol("PPRINT-PPH-PHRASE-AGR");
        $sym52$PPH_PHRASE_AGR_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("PPH-PHRASE-AGR-PRINT-FUNCTION-TRAMPOLINE");
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-PHRASE-AGR-P"));
        $sym54$PPH_PHRASE_AGR_ABSOLUTE_CONSTRAINT = SubLObjectFactory.makeSymbol("PPH-PHRASE-AGR-ABSOLUTE-CONSTRAINT");
        $sym55$_CSETF_PPH_PHRASE_AGR_ABSOLUTE_CONSTRAINT = SubLObjectFactory.makeSymbol("_CSETF-PPH-PHRASE-AGR-ABSOLUTE-CONSTRAINT");
        $sym56$PPH_PHRASE_AGR_RELATIVE_CONSTRAINT = SubLObjectFactory.makeSymbol("PPH-PHRASE-AGR-RELATIVE-CONSTRAINT");
        $sym57$_CSETF_PPH_PHRASE_AGR_RELATIVE_CONSTRAINT = SubLObjectFactory.makeSymbol("_CSETF-PPH-PHRASE-AGR-RELATIVE-CONSTRAINT");
        $kw58$ABSOLUTE_CONSTRAINT = SubLObjectFactory.makeKeyword("ABSOLUTE-CONSTRAINT");
        $kw59$RELATIVE_CONSTRAINT = SubLObjectFactory.makeKeyword("RELATIVE-CONSTRAINT");
        $sym60$MAKE_PPH_PHRASE_AGR = SubLObjectFactory.makeSymbol("MAKE-PPH-PHRASE-AGR");
        $sym61$VISIT_DEFSTRUCT_OBJECT_PPH_PHRASE_AGR_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-PPH-PHRASE-AGR-METHOD");
        $str62$_AGR = SubLObjectFactory.makeString("<AGR");
        $str63$___S_ = SubLObjectFactory.makeString(" (~S ");
        $str64$_PPH_PHRASE__A_______ = SubLObjectFactory.makeString("<PPH-PHRASE ~A [...]>");
        $str65$_A = SubLObjectFactory.makeString("~A");
        $str66$_ = SubLObjectFactory.makeString(")");
        $str67$_ = SubLObjectFactory.makeString(">");
        $int68$73 = SubLObjectFactory.makeInteger(73);
        $sym69$CFASL_INPUT_PPH_PHRASE_AGR = SubLObjectFactory.makeSymbol("CFASL-INPUT-PPH-PHRASE-AGR");
        $sym70$CFASL_OUTPUT_OBJECT_PPH_PHRASE_AGR_METHOD = SubLObjectFactory.makeSymbol("CFASL-OUTPUT-OBJECT-PPH-PHRASE-AGR-METHOD");
        $str71$Could_not_find_pph_phrase_with_su = SubLObjectFactory.makeString("Could not find pph-phrase with suid ~A");
        $sym72$PARAPHRASE_PHRASE_INFO_BUNDLE = SubLObjectFactory.makeSymbol("PARAPHRASE-PHRASE-INFO-BUNDLE");
        $sym73$PARAPHRASE_PHRASE_INFO_BUNDLE_P = SubLObjectFactory.makeSymbol("PARAPHRASE-PHRASE-INFO-BUNDLE-P");
        $list74 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("AGR"), (SubLObject)SubLObjectFactory.makeSymbol("JUSTIFICATION"), (SubLObject)SubLObjectFactory.makeSymbol("OUTPUT-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-POSITION-MAP"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER"));
        $list75 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYCL"), (SubLObject)SubLObjectFactory.makeKeyword("AGR"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFICATION"), (SubLObject)SubLObjectFactory.makeKeyword("OUTPUT-LIST"), (SubLObject)SubLObjectFactory.makeKeyword("ARG-POSITION-MAP"), (SubLObject)SubLObjectFactory.makeKeyword("OTHER"));
        $list76 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-PHRASE-INFO-CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-PHRASE-INFO-AGR"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-PHRASE-INFO-JUSTIFICATION"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-PHRASE-INFO-OUTPUT-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-PHRASE-INFO-ARG-POSITION-MAP"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-PHRASE-INFO-OTHER"));
        $list77 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PPH-PHRASE-INFO-CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PPH-PHRASE-INFO-AGR"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PPH-PHRASE-INFO-JUSTIFICATION"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PPH-PHRASE-INFO-OUTPUT-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PPH-PHRASE-INFO-ARG-POSITION-MAP"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PPH-PHRASE-INFO-OTHER"));
        $sym78$PPRINT_PPH_PHRASE_INFO_BUNDLE = SubLObjectFactory.makeSymbol("PPRINT-PPH-PHRASE-INFO-BUNDLE");
        $sym79$PARAPHRASE_PHRASE_INFO_BUNDLE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("PARAPHRASE-PHRASE-INFO-BUNDLE-PRINT-FUNCTION-TRAMPOLINE");
        $list80 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("PARAPHRASE-PHRASE-INFO-BUNDLE-P"));
        $sym81$PPH_PHRASE_INFO_CYCL = SubLObjectFactory.makeSymbol("PPH-PHRASE-INFO-CYCL");
        $sym82$_CSETF_PPH_PHRASE_INFO_CYCL = SubLObjectFactory.makeSymbol("_CSETF-PPH-PHRASE-INFO-CYCL");
        $sym83$PPH_PHRASE_INFO_AGR = SubLObjectFactory.makeSymbol("PPH-PHRASE-INFO-AGR");
        $sym84$_CSETF_PPH_PHRASE_INFO_AGR = SubLObjectFactory.makeSymbol("_CSETF-PPH-PHRASE-INFO-AGR");
        $sym85$PPH_PHRASE_INFO_JUSTIFICATION = SubLObjectFactory.makeSymbol("PPH-PHRASE-INFO-JUSTIFICATION");
        $sym86$_CSETF_PPH_PHRASE_INFO_JUSTIFICATION = SubLObjectFactory.makeSymbol("_CSETF-PPH-PHRASE-INFO-JUSTIFICATION");
        $sym87$PPH_PHRASE_INFO_OUTPUT_LIST = SubLObjectFactory.makeSymbol("PPH-PHRASE-INFO-OUTPUT-LIST");
        $sym88$_CSETF_PPH_PHRASE_INFO_OUTPUT_LIST = SubLObjectFactory.makeSymbol("_CSETF-PPH-PHRASE-INFO-OUTPUT-LIST");
        $sym89$PPH_PHRASE_INFO_ARG_POSITION_MAP = SubLObjectFactory.makeSymbol("PPH-PHRASE-INFO-ARG-POSITION-MAP");
        $sym90$_CSETF_PPH_PHRASE_INFO_ARG_POSITION_MAP = SubLObjectFactory.makeSymbol("_CSETF-PPH-PHRASE-INFO-ARG-POSITION-MAP");
        $sym91$PPH_PHRASE_INFO_OTHER = SubLObjectFactory.makeSymbol("PPH-PHRASE-INFO-OTHER");
        $sym92$_CSETF_PPH_PHRASE_INFO_OTHER = SubLObjectFactory.makeSymbol("_CSETF-PPH-PHRASE-INFO-OTHER");
        $kw93$CYCL = SubLObjectFactory.makeKeyword("CYCL");
        $kw94$AGR = SubLObjectFactory.makeKeyword("AGR");
        $kw95$JUSTIFICATION = SubLObjectFactory.makeKeyword("JUSTIFICATION");
        $kw96$OUTPUT_LIST = SubLObjectFactory.makeKeyword("OUTPUT-LIST");
        $kw97$ARG_POSITION_MAP = SubLObjectFactory.makeKeyword("ARG-POSITION-MAP");
        $kw98$OTHER = SubLObjectFactory.makeKeyword("OTHER");
        $sym99$MAKE_PARAPHRASE_PHRASE_INFO_BUNDLE = SubLObjectFactory.makeSymbol("MAKE-PARAPHRASE-PHRASE-INFO-BUNDLE");
        $sym100$VISIT_DEFSTRUCT_OBJECT_PARAPHRASE_PHRASE_INFO_BUNDLE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-PARAPHRASE-PHRASE-INFO-BUNDLE-METHOD");
        $kw101$PPH_EMPTY_INFO_VECTOR = SubLObjectFactory.makeKeyword("PPH-EMPTY-INFO-VECTOR");
        $list102 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROPERTY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("PHRASE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym103$PLIST = SubLObjectFactory.makeUninternedSymbol("PLIST");
        $sym104$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym105$PPH_PHRASE_PLIST = SubLObjectFactory.makeSymbol("PPH-PHRASE-PLIST");
        $sym106$DO_PLIST = SubLObjectFactory.makeSymbol("DO-PLIST");
        $str107$_S_should_be__S__not__S = SubLObjectFactory.makeString("~S should be ~S, not ~S");
        $sym108$PPH_PHRASE_OUTPUT_ITEM = SubLObjectFactory.makeSymbol("PPH-PHRASE-OUTPUT-ITEM");
        $sym109$PPH_PHRASE_OUTPUT_ITEM_P = SubLObjectFactory.makeSymbol("PPH-PHRASE-OUTPUT-ITEM-P");
        $list110 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-POSITION"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("HTML-OPEN-TAG"), (SubLObject)SubLObjectFactory.makeSymbol("HTML-CLOSE-TAG"), (SubLObject)SubLObjectFactory.makeSymbol("AGR"));
        $list111 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeKeyword("ARG-POSITION"), (SubLObject)SubLObjectFactory.makeKeyword("CYCL"), (SubLObject)SubLObjectFactory.makeKeyword("HTML-OPEN-TAG"), (SubLObject)SubLObjectFactory.makeKeyword("HTML-CLOSE-TAG"), (SubLObject)SubLObjectFactory.makeKeyword("AGR"));
        $list112 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-OI-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-OI-ARG-POSITION"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-OI-CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-OI-HTML-OPEN-TAG"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-OI-HTML-CLOSE-TAG"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-OI-AGR"));
        $list113 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PPH-OI-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PPH-OI-ARG-POSITION"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PPH-OI-CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PPH-OI-HTML-OPEN-TAG"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PPH-OI-HTML-CLOSE-TAG"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PPH-OI-AGR"));
        $sym114$PPRINT_PPH_PHRASE_OUTPUT_ITEM = SubLObjectFactory.makeSymbol("PPRINT-PPH-PHRASE-OUTPUT-ITEM");
        $sym115$PPH_PHRASE_OUTPUT_ITEM_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("PPH-PHRASE-OUTPUT-ITEM-PRINT-FUNCTION-TRAMPOLINE");
        $list116 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-PHRASE-OUTPUT-ITEM-P"));
        $sym117$PPH_OI_STRING = SubLObjectFactory.makeSymbol("PPH-OI-STRING");
        $sym118$_CSETF_PPH_OI_STRING = SubLObjectFactory.makeSymbol("_CSETF-PPH-OI-STRING");
        $sym119$PPH_OI_ARG_POSITION = SubLObjectFactory.makeSymbol("PPH-OI-ARG-POSITION");
        $sym120$_CSETF_PPH_OI_ARG_POSITION = SubLObjectFactory.makeSymbol("_CSETF-PPH-OI-ARG-POSITION");
        $sym121$PPH_OI_CYCL = SubLObjectFactory.makeSymbol("PPH-OI-CYCL");
        $sym122$_CSETF_PPH_OI_CYCL = SubLObjectFactory.makeSymbol("_CSETF-PPH-OI-CYCL");
        $sym123$PPH_OI_HTML_OPEN_TAG = SubLObjectFactory.makeSymbol("PPH-OI-HTML-OPEN-TAG");
        $sym124$_CSETF_PPH_OI_HTML_OPEN_TAG = SubLObjectFactory.makeSymbol("_CSETF-PPH-OI-HTML-OPEN-TAG");
        $sym125$PPH_OI_HTML_CLOSE_TAG = SubLObjectFactory.makeSymbol("PPH-OI-HTML-CLOSE-TAG");
        $sym126$_CSETF_PPH_OI_HTML_CLOSE_TAG = SubLObjectFactory.makeSymbol("_CSETF-PPH-OI-HTML-CLOSE-TAG");
        $sym127$PPH_OI_AGR = SubLObjectFactory.makeSymbol("PPH-OI-AGR");
        $sym128$_CSETF_PPH_OI_AGR = SubLObjectFactory.makeSymbol("_CSETF-PPH-OI-AGR");
        $kw129$STRING = SubLObjectFactory.makeKeyword("STRING");
        $kw130$ARG_POSITION = SubLObjectFactory.makeKeyword("ARG-POSITION");
        $kw131$HTML_OPEN_TAG = SubLObjectFactory.makeKeyword("HTML-OPEN-TAG");
        $kw132$HTML_CLOSE_TAG = SubLObjectFactory.makeKeyword("HTML-CLOSE-TAG");
        $sym133$MAKE_PPH_PHRASE_OUTPUT_ITEM = SubLObjectFactory.makeSymbol("MAKE-PPH-PHRASE-OUTPUT-ITEM");
        $sym134$VISIT_DEFSTRUCT_OBJECT_PPH_PHRASE_OUTPUT_ITEM_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-PPH-PHRASE-OUTPUT-ITEM-METHOD");
        $sym135$PPH_STRING_P = SubLObjectFactory.makeSymbol("PPH-STRING-P");
        $str136$_PPH_OI__S__S__S__S__S__S___ = SubLObjectFactory.makeString("<PPH-OI ~S ~S ~S ~S ~S ~S>~%");
        $str137$_S_is_a_forbidden_paraphrase_for_ = SubLObjectFactory.makeString("~S is a forbidden paraphrase for ~S");
        $sym138$PPH_PHRASE_OUTPUT_ITEM_LOOSE_P = SubLObjectFactory.makeSymbol("PPH-PHRASE-OUTPUT-ITEM-LOOSE-P");
        $sym139$LIST = SubLObjectFactory.makeSymbol("LIST");
        $kw140$NOSPACE = SubLObjectFactory.makeKeyword("NOSPACE");
        $sym141$PPH_PHRASE_OUTPUT_LIST_P = SubLObjectFactory.makeSymbol("PPH-PHRASE-OUTPUT-LIST-P");
        $str142$ = SubLObjectFactory.makeString("");
        $sym143$PPH_PHRASE_OUTPUT_ITEM_COPY = SubLObjectFactory.makeSymbol("PPH-PHRASE-OUTPUT-ITEM-COPY");
        $sym144$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $sym145$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $str146$Can_t_make_nested_enhanced_output = SubLObjectFactory.makeString("Can't make nested enhanced output item.");
        $sym147$ENHANCED_PPH_OUTPUT_ITEM_P = SubLObjectFactory.makeSymbol("ENHANCED-PPH-OUTPUT-ITEM-P");
        $int148$74 = SubLObjectFactory.makeInteger(74);
        $sym149$CFASL_INPUT_PPH_OI = SubLObjectFactory.makeSymbol("CFASL-INPUT-PPH-OI");
        $sym150$CFASL_OUTPUT_OBJECT_PPH_PHRASE_OUTPUT_ITEM_METHOD = SubLObjectFactory.makeSymbol("CFASL-OUTPUT-OBJECT-PPH-PHRASE-OUTPUT-ITEM-METHOD");
        $str151$_S__S = SubLObjectFactory.makeString("~S ~S");
        $int152$50000 = SubLObjectFactory.makeInteger(50000);
        $int153$200000 = SubLObjectFactory.makeInteger(200000);
        $int154$500000 = SubLObjectFactory.makeInteger(500000);
        $str155$new_PPH_phrase_limit_of__S_exceed = SubLObjectFactory.makeString("new PPH phrase limit of ~S exceeded.");
        $str156$New_PPH_phrase_not_expected_to_be = SubLObjectFactory.makeString("New PPH phrase not expected to be destroyed: ~S");
        $list157 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("CASE"), SubLObjectFactory.makeKeyword("RESERVED-FOR-MATRIX-ARG0"), SubLObjectFactory.makeKeyword("ALTERNATIVES"), SubLObjectFactory.makeKeyword("LINK-CYCL"), SubLObjectFactory.makeKeyword("WU"), SubLObjectFactory.makeKeyword("HEAD-DTR-NUM"), SubLObjectFactory.makeKeyword("NON-LOCAL-FEATURES-IGNORED?"), SubLObjectFactory.makeKeyword("DONE?"), SubLObjectFactory.makeKeyword("QUERY-EL-FORMULA"), SubLObjectFactory.makeKeyword("SPECIAL-TYPE"), SubLObjectFactory.makeKeyword("DEMERITS"), SubLObjectFactory.makeKeyword("DEMERITS-REASON") });
        $sym158$PPH_INFO_VECTOR_P = SubLObjectFactory.makeSymbol("PPH-INFO-VECTOR-P");
        $sym159$_PPH_PHRASE_ID_INDEX_ = SubLObjectFactory.makeSymbol("*PPH-PHRASE-ID-INDEX*");
        $str160$PPH_phrase_ID_index = SubLObjectFactory.makeString("PPH phrase ID index");
        $sym161$PPH_PHRASE_SET_SUID = SubLObjectFactory.makeSymbol("PPH-PHRASE-SET-SUID");
        $str162$Removing_invalid_PPH_phrases = SubLObjectFactory.makeString("Removing invalid PPH phrases");
        $sym163$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw164$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $str165$Removed__S_items_from__PPH_PHRASE = SubLObjectFactory.makeString("Removed ~S items from *PPH-PHRASE-ID-INDEX* that failed VALID-PPH-PHRASE-P test.");
        $str166$Found_no_invalid_PPH_phrases_ = SubLObjectFactory.makeString("Found no invalid PPH phrases.");
        $kw167$FREE = SubLObjectFactory.makeKeyword("FREE");
        $sym168$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $str169$__Dumping__S__ = SubLObjectFactory.makeString("~&Dumping ~S~%");
        $str170$__Dumping_CycL___S__ = SubLObjectFactory.makeString("~&Dumping CycL: ~S~%");
        $str171$__Dumping_Agr___S__ = SubLObjectFactory.makeString("~&Dumping Agr: ~S~%");
        $str172$__Dumping_Justification___S__ = SubLObjectFactory.makeString("~&Dumping Justification: ~S~%");
        $str173$__Dumping_Output_List___S__ = SubLObjectFactory.makeString("~&Dumping Output-List: ~S~%");
        $str174$__Dumping_Arg_Position_Map___S__ = SubLObjectFactory.makeString("~&Dumping Arg-Position-Map: ~S~%");
        $str175$__Dumping_Other___S__ = SubLObjectFactory.makeString("~&Dumping Other: ~S~%");
        $str176$_________________________________ = SubLObjectFactory.makeString("~&=====================================================~%");
        $kw177$LISTIFIED_PPH_VECTOR = SubLObjectFactory.makeKeyword("LISTIFIED-PPH-VECTOR");
        $sym178$VECTORP = SubLObjectFactory.makeSymbol("VECTORP");
        $sym179$LISTIFY_PPH_VECTOR = SubLObjectFactory.makeSymbol("LISTIFY-PPH-VECTOR");
        $sym180$PPH_LISTIFIED_VECTOR_P = SubLObjectFactory.makeSymbol("PPH-LISTIFIED-VECTOR-P");
        $sym181$DELISTIFY_PPH_VECTOR = SubLObjectFactory.makeSymbol("DELISTIFY-PPH-VECTOR");
        $kw182$PPH_PHRASE_SHELL = SubLObjectFactory.makeKeyword("PPH-PHRASE-SHELL");
        $sym183$SHELLIFY_PPH_PHRASE = SubLObjectFactory.makeSymbol("SHELLIFY-PPH-PHRASE");
        $sym184$SHELLIFIED_PPH_PHRASE_P = SubLObjectFactory.makeSymbol("SHELLIFIED-PPH-PHRASE-P");
        $sym185$DESHELLIFY_PPH_PHRASE = SubLObjectFactory.makeSymbol("DESHELLIFY-PPH-PHRASE");
        $str186$Couldn_t_find_PPH_phrase__D = SubLObjectFactory.makeString("Couldn't find PPH phrase ~D");
        $sym187$PPH_PHRASE_TEMPLATE_GENERATOR = SubLObjectFactory.makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR");
        $sym188$PPH_PHRASE_TEMPLATE_GENERATOR_P = SubLObjectFactory.makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-P");
        $list189 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("FORMULA"), SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("FOCUS-ARG"), SubLObjectFactory.makeSymbol("SPECIFIED-RELN"), SubLObjectFactory.makeSymbol("NL-PREDS"), SubLObjectFactory.makeSymbol("DONE?"), SubLObjectFactory.makeSymbol("SEARCH-LIMIT"), SubLObjectFactory.makeSymbol("SEARCH-LEVEL"), SubLObjectFactory.makeSymbol("RELNS-TO-USE"), SubLObjectFactory.makeSymbol("GEN-TEMPLATE-SETS"), SubLObjectFactory.makeSymbol("GEN-TEMPLATES"), SubLObjectFactory.makeSymbol("ARG-POSITION-MAP") });
        $list190 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("FORMULA"), SubLObjectFactory.makeKeyword("MT"), SubLObjectFactory.makeKeyword("FOCUS-ARG"), SubLObjectFactory.makeKeyword("SPECIFIED-RELN"), SubLObjectFactory.makeKeyword("NL-PREDS"), SubLObjectFactory.makeKeyword("DONE?"), SubLObjectFactory.makeKeyword("SEARCH-LIMIT"), SubLObjectFactory.makeKeyword("SEARCH-LEVEL"), SubLObjectFactory.makeKeyword("RELNS-TO-USE"), SubLObjectFactory.makeKeyword("GEN-TEMPLATE-SETS"), SubLObjectFactory.makeKeyword("GEN-TEMPLATES"), SubLObjectFactory.makeKeyword("ARG-POSITION-MAP") });
        $list191 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-FORMULA"), SubLObjectFactory.makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-MT"), SubLObjectFactory.makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-FOCUS-ARG"), SubLObjectFactory.makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-SPECIFIED-RELN"), SubLObjectFactory.makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-NL-PREDS"), SubLObjectFactory.makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-DONE?"), SubLObjectFactory.makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-SEARCH-LIMIT"), SubLObjectFactory.makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-SEARCH-LEVEL"), SubLObjectFactory.makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-RELNS-TO-USE"), SubLObjectFactory.makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-GEN-TEMPLATE-SETS"), SubLObjectFactory.makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-GEN-TEMPLATES"), SubLObjectFactory.makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-ARG-POSITION-MAP") });
        $list192 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-FORMULA"), SubLObjectFactory.makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-MT"), SubLObjectFactory.makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-FOCUS-ARG"), SubLObjectFactory.makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-SPECIFIED-RELN"), SubLObjectFactory.makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-NL-PREDS"), SubLObjectFactory.makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-DONE?"), SubLObjectFactory.makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-SEARCH-LIMIT"), SubLObjectFactory.makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-SEARCH-LEVEL"), SubLObjectFactory.makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-RELNS-TO-USE"), SubLObjectFactory.makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-GEN-TEMPLATE-SETS"), SubLObjectFactory.makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-GEN-TEMPLATES"), SubLObjectFactory.makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-ARG-POSITION-MAP") });
        $sym193$PPRINT_PPH_PHRASE_TEMPLATE_GENERATOR = SubLObjectFactory.makeSymbol("PPRINT-PPH-PHRASE-TEMPLATE-GENERATOR");
        $sym194$PPH_PHRASE_TEMPLATE_GENERATOR_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-PRINT-FUNCTION-TRAMPOLINE");
        $list195 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-P"));
        $sym196$PPH_PHRASE_TEMPLATE_GENERATOR_FORMULA = SubLObjectFactory.makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-FORMULA");
        $sym197$_CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_FORMULA = SubLObjectFactory.makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-FORMULA");
        $sym198$PPH_PHRASE_TEMPLATE_GENERATOR_MT = SubLObjectFactory.makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-MT");
        $sym199$_CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_MT = SubLObjectFactory.makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-MT");
        $sym200$PPH_PHRASE_TEMPLATE_GENERATOR_FOCUS_ARG = SubLObjectFactory.makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-FOCUS-ARG");
        $sym201$_CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_FOCUS_ARG = SubLObjectFactory.makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-FOCUS-ARG");
        $sym202$PPH_PHRASE_TEMPLATE_GENERATOR_SPECIFIED_RELN = SubLObjectFactory.makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-SPECIFIED-RELN");
        $sym203$_CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_SPECIFIED_RELN = SubLObjectFactory.makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-SPECIFIED-RELN");
        $sym204$PPH_PHRASE_TEMPLATE_GENERATOR_NL_PREDS = SubLObjectFactory.makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-NL-PREDS");
        $sym205$_CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_NL_PREDS = SubLObjectFactory.makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-NL-PREDS");
        $sym206$PPH_PHRASE_TEMPLATE_GENERATOR_DONE_ = SubLObjectFactory.makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-DONE?");
        $sym207$_CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_DONE_ = SubLObjectFactory.makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-DONE?");
        $sym208$PPH_PHRASE_TEMPLATE_GENERATOR_SEARCH_LIMIT = SubLObjectFactory.makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-SEARCH-LIMIT");
        $sym209$_CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_SEARCH_LIMIT = SubLObjectFactory.makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-SEARCH-LIMIT");
        $sym210$PPH_PHRASE_TEMPLATE_GENERATOR_SEARCH_LEVEL = SubLObjectFactory.makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-SEARCH-LEVEL");
        $sym211$_CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_SEARCH_LEVEL = SubLObjectFactory.makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-SEARCH-LEVEL");
        $sym212$PPH_PHRASE_TEMPLATE_GENERATOR_RELNS_TO_USE = SubLObjectFactory.makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-RELNS-TO-USE");
        $sym213$_CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_RELNS_TO_USE = SubLObjectFactory.makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-RELNS-TO-USE");
        $sym214$PPH_PHRASE_TEMPLATE_GENERATOR_GEN_TEMPLATE_SETS = SubLObjectFactory.makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-GEN-TEMPLATE-SETS");
        $sym215$_CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_GEN_TEMPLATE_SETS = SubLObjectFactory.makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-GEN-TEMPLATE-SETS");
        $sym216$PPH_PHRASE_TEMPLATE_GENERATOR_GEN_TEMPLATES = SubLObjectFactory.makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-GEN-TEMPLATES");
        $sym217$_CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_GEN_TEMPLATES = SubLObjectFactory.makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-GEN-TEMPLATES");
        $sym218$PPH_PHRASE_TEMPLATE_GENERATOR_ARG_POSITION_MAP = SubLObjectFactory.makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-ARG-POSITION-MAP");
        $sym219$_CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_ARG_POSITION_MAP = SubLObjectFactory.makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-ARG-POSITION-MAP");
        $kw220$FORMULA = SubLObjectFactory.makeKeyword("FORMULA");
        $kw221$MT = SubLObjectFactory.makeKeyword("MT");
        $kw222$FOCUS_ARG = SubLObjectFactory.makeKeyword("FOCUS-ARG");
        $kw223$SPECIFIED_RELN = SubLObjectFactory.makeKeyword("SPECIFIED-RELN");
        $kw224$NL_PREDS = SubLObjectFactory.makeKeyword("NL-PREDS");
        $kw225$DONE_ = SubLObjectFactory.makeKeyword("DONE?");
        $kw226$SEARCH_LIMIT = SubLObjectFactory.makeKeyword("SEARCH-LIMIT");
        $kw227$SEARCH_LEVEL = SubLObjectFactory.makeKeyword("SEARCH-LEVEL");
        $kw228$RELNS_TO_USE = SubLObjectFactory.makeKeyword("RELNS-TO-USE");
        $kw229$GEN_TEMPLATE_SETS = SubLObjectFactory.makeKeyword("GEN-TEMPLATE-SETS");
        $kw230$GEN_TEMPLATES = SubLObjectFactory.makeKeyword("GEN-TEMPLATES");
        $sym231$MAKE_PPH_PHRASE_TEMPLATE_GENERATOR = SubLObjectFactory.makeSymbol("MAKE-PPH-PHRASE-TEMPLATE-GENERATOR");
        $sym232$VISIT_DEFSTRUCT_OBJECT_PPH_PHRASE_TEMPLATE_GENERATOR_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-PPH-PHRASE-TEMPLATE-GENERATOR-METHOD");
        $str233$_PPH_Phrase_Template_Generator___ = SubLObjectFactory.makeString("<PPH-Phrase-Template-Generator: ~S>");
        $kw234$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym235$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $sym236$_FREE_PPH_PHRASE_TEMPLATE_GENERATORS_ = SubLObjectFactory.makeSymbol("*FREE-PPH-PHRASE-TEMPLATE-GENERATORS*");
        $kw237$ANY = SubLObjectFactory.makeKeyword("ANY");
        $sym238$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $str239$Making_new_PPH_phrase_template_ge = SubLObjectFactory.makeString("Making new PPH phrase template generator.");
        $str240$Freeing_PPH_phrase_template_gener = SubLObjectFactory.makeString("Freeing PPH phrase template generator (~S total).");
        $sym241$PPH_PHRASE_OUTPUT_LIST_ITERATOR = SubLObjectFactory.makeSymbol("PPH-PHRASE-OUTPUT-LIST-ITERATOR");
        $sym242$PPH_PHRASE_OUTPUT_LIST_ITERATOR_P = SubLObjectFactory.makeSymbol("PPH-PHRASE-OUTPUT-LIST-ITERATOR-P");
        $list243 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM-QUEUE"));
        $list244 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ITEM-QUEUE"));
        $list245 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-PHRASE-OUTPUT-LIST-ITERATOR-ITEM-QUEUE"));
        $list246 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PPH-PHRASE-OUTPUT-LIST-ITERATOR-ITEM-QUEUE"));
        $sym247$PPRINT_PPH_PHRASE_OUTPUT_LIST_ITERATOR = SubLObjectFactory.makeSymbol("PPRINT-PPH-PHRASE-OUTPUT-LIST-ITERATOR");
        $sym248$PPH_PHRASE_OUTPUT_LIST_ITERATOR_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("PPH-PHRASE-OUTPUT-LIST-ITERATOR-PRINT-FUNCTION-TRAMPOLINE");
        $list249 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-PHRASE-OUTPUT-LIST-ITERATOR-P"));
        $sym250$PPH_PHRASE_OUTPUT_LIST_ITERATOR_ITEM_QUEUE = SubLObjectFactory.makeSymbol("PPH-PHRASE-OUTPUT-LIST-ITERATOR-ITEM-QUEUE");
        $sym251$_CSETF_PPH_PHRASE_OUTPUT_LIST_ITERATOR_ITEM_QUEUE = SubLObjectFactory.makeSymbol("_CSETF-PPH-PHRASE-OUTPUT-LIST-ITERATOR-ITEM-QUEUE");
        $kw252$ITEM_QUEUE = SubLObjectFactory.makeKeyword("ITEM-QUEUE");
        $sym253$MAKE_PPH_PHRASE_OUTPUT_LIST_ITERATOR = SubLObjectFactory.makeSymbol("MAKE-PPH-PHRASE-OUTPUT-LIST-ITERATOR");
        $sym254$VISIT_DEFSTRUCT_OBJECT_PPH_PHRASE_OUTPUT_LIST_ITERATOR_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-PPH-PHRASE-OUTPUT-LIST-ITERATOR-METHOD");
        $str255$_PPH_OL_Iterator_ = SubLObjectFactory.makeString("<PPH-OL-Iterator>");
        $str256$___Iterator_empty___S__ = SubLObjectFactory.makeString("~& Iterator empty: ~S~%");
        $str257$___Can_t_get_next_item_from__S = SubLObjectFactory.makeString("~& Can't get next item from ~S");
    }
    
    public static final class $generation_template_native extends SubLStructNative
    {
        public SubLObject $phrase;
        public SubLObject $constraint;
        public SubLObject $assertion;
        private static final SubLStructDeclNative structDecl;
        
        public $generation_template_native() {
            this.$phrase = (SubLObject)CommonSymbols.NIL;
            this.$constraint = (SubLObject)CommonSymbols.NIL;
            this.$assertion = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$generation_template_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$phrase;
        }
        
        public SubLObject getField3() {
            return this.$constraint;
        }
        
        public SubLObject getField4() {
            return this.$assertion;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$phrase = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$constraint = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$assertion = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$generation_template_native.class, pph_data_structures.$sym9$GENERATION_TEMPLATE, pph_data_structures.$sym10$GENERATION_TEMPLATE_P, pph_data_structures.$list11, pph_data_structures.$list12, new String[] { "$phrase", "$constraint", "$assertion" }, pph_data_structures.$list13, pph_data_structures.$list14, pph_data_structures.$sym15$PPRINT_GEN_TEMPLATE);
        }
    }
    
    public static final class $generation_template_p$UnaryFunction extends UnaryFunction
    {
        public $generation_template_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("GENERATION-TEMPLATE-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return pph_data_structures.generation_template_p(arg1);
        }
    }
    
    public static final class $sxhash_generation_template_method$UnaryFunction extends UnaryFunction
    {
        public $sxhash_generation_template_method$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SXHASH-GENERATION-TEMPLATE-METHOD"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return pph_data_structures.sxhash_generation_template_method(arg1);
        }
    }
    
    public static final class $get_gen_template_assertion$UnaryFunction extends UnaryFunction
    {
        public $get_gen_template_assertion$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("GET-GEN-TEMPLATE-ASSERTION"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return pph_data_structures.get_gen_template_assertion(arg1);
        }
    }
    
    public static final class $cfasl_input_generation_template$UnaryFunction extends UnaryFunction
    {
        public $cfasl_input_generation_template$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CFASL-INPUT-GENERATION-TEMPLATE"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return pph_data_structures.cfasl_input_generation_template(arg1);
        }
    }
    
    public static final class $pph_phrase_agr_native extends SubLStructNative
    {
        public SubLObject $absolute_constraint;
        public SubLObject $relative_constraint;
        private static final SubLStructDeclNative structDecl;
        
        public $pph_phrase_agr_native() {
            this.$absolute_constraint = (SubLObject)CommonSymbols.NIL;
            this.$relative_constraint = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$pph_phrase_agr_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$absolute_constraint;
        }
        
        public SubLObject getField3() {
            return this.$relative_constraint;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$absolute_constraint = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$relative_constraint = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$pph_phrase_agr_native.class, pph_data_structures.$sym45$PPH_PHRASE_AGR, pph_data_structures.$sym46$PPH_PHRASE_AGR_P, pph_data_structures.$list47, pph_data_structures.$list48, new String[] { "$absolute_constraint", "$relative_constraint" }, pph_data_structures.$list49, pph_data_structures.$list50, pph_data_structures.$sym51$PPRINT_PPH_PHRASE_AGR);
        }
    }
    
    public static final class $pph_phrase_agr_p$UnaryFunction extends UnaryFunction
    {
        public $pph_phrase_agr_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PPH-PHRASE-AGR-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return pph_data_structures.pph_phrase_agr_p(arg1);
        }
    }
    
    public static final class $cfasl_input_pph_phrase_agr$UnaryFunction extends UnaryFunction
    {
        public $cfasl_input_pph_phrase_agr$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CFASL-INPUT-PPH-PHRASE-AGR"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return pph_data_structures.cfasl_input_pph_phrase_agr(arg1);
        }
    }
    
    public static final class $paraphrase_phrase_info_bundle_native extends SubLStructNative
    {
        public SubLObject $cycl;
        public SubLObject $agr;
        public SubLObject $justification;
        public SubLObject $output_list;
        public SubLObject $arg_position_map;
        public SubLObject $other;
        private static final SubLStructDeclNative structDecl;
        
        public $paraphrase_phrase_info_bundle_native() {
            this.$cycl = (SubLObject)CommonSymbols.NIL;
            this.$agr = (SubLObject)CommonSymbols.NIL;
            this.$justification = (SubLObject)CommonSymbols.NIL;
            this.$output_list = (SubLObject)CommonSymbols.NIL;
            this.$arg_position_map = (SubLObject)CommonSymbols.NIL;
            this.$other = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$paraphrase_phrase_info_bundle_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$cycl;
        }
        
        public SubLObject getField3() {
            return this.$agr;
        }
        
        public SubLObject getField4() {
            return this.$justification;
        }
        
        public SubLObject getField5() {
            return this.$output_list;
        }
        
        public SubLObject getField6() {
            return this.$arg_position_map;
        }
        
        public SubLObject getField7() {
            return this.$other;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$cycl = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$agr = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$justification = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$output_list = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$arg_position_map = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$other = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$paraphrase_phrase_info_bundle_native.class, pph_data_structures.$sym72$PARAPHRASE_PHRASE_INFO_BUNDLE, pph_data_structures.$sym73$PARAPHRASE_PHRASE_INFO_BUNDLE_P, pph_data_structures.$list74, pph_data_structures.$list75, new String[] { "$cycl", "$agr", "$justification", "$output_list", "$arg_position_map", "$other" }, pph_data_structures.$list76, pph_data_structures.$list77, pph_data_structures.$sym78$PPRINT_PPH_PHRASE_INFO_BUNDLE);
        }
    }
    
    public static final class $paraphrase_phrase_info_bundle_p$UnaryFunction extends UnaryFunction
    {
        public $paraphrase_phrase_info_bundle_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PARAPHRASE-PHRASE-INFO-BUNDLE-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return pph_data_structures.paraphrase_phrase_info_bundle_p(arg1);
        }
    }
    
    public static final class $pph_phrase_output_item_native extends SubLStructNative
    {
        public SubLObject $string;
        public SubLObject $arg_position;
        public SubLObject $cycl;
        public SubLObject $html_open_tag;
        public SubLObject $html_close_tag;
        public SubLObject $agr;
        private static final SubLStructDeclNative structDecl;
        
        public $pph_phrase_output_item_native() {
            this.$string = (SubLObject)CommonSymbols.NIL;
            this.$arg_position = (SubLObject)CommonSymbols.NIL;
            this.$cycl = (SubLObject)CommonSymbols.NIL;
            this.$html_open_tag = (SubLObject)CommonSymbols.NIL;
            this.$html_close_tag = (SubLObject)CommonSymbols.NIL;
            this.$agr = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$pph_phrase_output_item_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$string;
        }
        
        public SubLObject getField3() {
            return this.$arg_position;
        }
        
        public SubLObject getField4() {
            return this.$cycl;
        }
        
        public SubLObject getField5() {
            return this.$html_open_tag;
        }
        
        public SubLObject getField6() {
            return this.$html_close_tag;
        }
        
        public SubLObject getField7() {
            return this.$agr;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$string = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$arg_position = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$cycl = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$html_open_tag = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$html_close_tag = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$agr = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$pph_phrase_output_item_native.class, pph_data_structures.$sym108$PPH_PHRASE_OUTPUT_ITEM, pph_data_structures.$sym109$PPH_PHRASE_OUTPUT_ITEM_P, pph_data_structures.$list110, pph_data_structures.$list111, new String[] { "$string", "$arg_position", "$cycl", "$html_open_tag", "$html_close_tag", "$agr" }, pph_data_structures.$list112, pph_data_structures.$list113, pph_data_structures.$sym114$PPRINT_PPH_PHRASE_OUTPUT_ITEM);
        }
    }
    
    public static final class $pph_phrase_output_item_p$UnaryFunction extends UnaryFunction
    {
        public $pph_phrase_output_item_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PPH-PHRASE-OUTPUT-ITEM-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return pph_data_structures.pph_phrase_output_item_p(arg1);
        }
    }
    
    public static final class $pph_phrase_output_item_string$UnaryFunction extends UnaryFunction
    {
        public $pph_phrase_output_item_string$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PPH-PHRASE-OUTPUT-ITEM-STRING"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return pph_data_structures.pph_phrase_output_item_string(arg1);
        }
    }
    
    public static final class $pph_phrase_output_item_loose_p$UnaryFunction extends UnaryFunction
    {
        public $pph_phrase_output_item_loose_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PPH-PHRASE-OUTPUT-ITEM-LOOSE-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return pph_data_structures.pph_phrase_output_item_loose_p(arg1);
        }
    }
    
    public static final class $cfasl_input_pph_oi$UnaryFunction extends UnaryFunction
    {
        public $cfasl_input_pph_oi$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CFASL-INPUT-PPH-OI"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return pph_data_structures.cfasl_input_pph_oi(arg1);
        }
    }
    
    public static final class $pph_phrase_template_generator_native extends SubLStructNative
    {
        public SubLObject $formula;
        public SubLObject $mt;
        public SubLObject $focus_arg;
        public SubLObject $specified_reln;
        public SubLObject $nl_preds;
        public SubLObject $doneP;
        public SubLObject $search_limit;
        public SubLObject $search_level;
        public SubLObject $relns_to_use;
        public SubLObject $gen_template_sets;
        public SubLObject $gen_templates;
        public SubLObject $arg_position_map;
        private static final SubLStructDeclNative structDecl;
        
        public $pph_phrase_template_generator_native() {
            this.$formula = (SubLObject)CommonSymbols.NIL;
            this.$mt = (SubLObject)CommonSymbols.NIL;
            this.$focus_arg = (SubLObject)CommonSymbols.NIL;
            this.$specified_reln = (SubLObject)CommonSymbols.NIL;
            this.$nl_preds = (SubLObject)CommonSymbols.NIL;
            this.$doneP = (SubLObject)CommonSymbols.NIL;
            this.$search_limit = (SubLObject)CommonSymbols.NIL;
            this.$search_level = (SubLObject)CommonSymbols.NIL;
            this.$relns_to_use = (SubLObject)CommonSymbols.NIL;
            this.$gen_template_sets = (SubLObject)CommonSymbols.NIL;
            this.$gen_templates = (SubLObject)CommonSymbols.NIL;
            this.$arg_position_map = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$pph_phrase_template_generator_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$formula;
        }
        
        public SubLObject getField3() {
            return this.$mt;
        }
        
        public SubLObject getField4() {
            return this.$focus_arg;
        }
        
        public SubLObject getField5() {
            return this.$specified_reln;
        }
        
        public SubLObject getField6() {
            return this.$nl_preds;
        }
        
        public SubLObject getField7() {
            return this.$doneP;
        }
        
        public SubLObject getField8() {
            return this.$search_limit;
        }
        
        public SubLObject getField9() {
            return this.$search_level;
        }
        
        public SubLObject getField10() {
            return this.$relns_to_use;
        }
        
        public SubLObject getField11() {
            return this.$gen_template_sets;
        }
        
        public SubLObject getField12() {
            return this.$gen_templates;
        }
        
        public SubLObject getField13() {
            return this.$arg_position_map;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$formula = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$mt = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$focus_arg = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$specified_reln = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$nl_preds = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$doneP = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$search_limit = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$search_level = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$relns_to_use = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$gen_template_sets = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$gen_templates = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$arg_position_map = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$pph_phrase_template_generator_native.class, pph_data_structures.$sym187$PPH_PHRASE_TEMPLATE_GENERATOR, pph_data_structures.$sym188$PPH_PHRASE_TEMPLATE_GENERATOR_P, pph_data_structures.$list189, pph_data_structures.$list190, new String[] { "$formula", "$mt", "$focus_arg", "$specified_reln", "$nl_preds", "$doneP", "$search_limit", "$search_level", "$relns_to_use", "$gen_template_sets", "$gen_templates", "$arg_position_map" }, pph_data_structures.$list191, pph_data_structures.$list192, pph_data_structures.$sym193$PPRINT_PPH_PHRASE_TEMPLATE_GENERATOR);
        }
    }
    
    public static final class $pph_phrase_template_generator_p$UnaryFunction extends UnaryFunction
    {
        public $pph_phrase_template_generator_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PPH-PHRASE-TEMPLATE-GENERATOR-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return pph_data_structures.pph_phrase_template_generator_p(arg1);
        }
    }
    
    public static final class $pph_phrase_output_list_iterator_native extends SubLStructNative
    {
        public SubLObject $item_queue;
        private static final SubLStructDeclNative structDecl;
        
        public $pph_phrase_output_list_iterator_native() {
            this.$item_queue = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$pph_phrase_output_list_iterator_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$item_queue;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$item_queue = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$pph_phrase_output_list_iterator_native.class, pph_data_structures.$sym241$PPH_PHRASE_OUTPUT_LIST_ITERATOR, pph_data_structures.$sym242$PPH_PHRASE_OUTPUT_LIST_ITERATOR_P, pph_data_structures.$list243, pph_data_structures.$list244, new String[] { "$item_queue" }, pph_data_structures.$list245, pph_data_structures.$list246, pph_data_structures.$sym247$PPRINT_PPH_PHRASE_OUTPUT_LIST_ITERATOR);
        }
    }
    
    public static final class $pph_phrase_output_list_iterator_p$UnaryFunction extends UnaryFunction
    {
        public $pph_phrase_output_list_iterator_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PPH-PHRASE-OUTPUT-LIST-ITERATOR-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return pph_data_structures.pph_phrase_output_list_iterator_p(arg1);
        }
    }
}

/*

	Total time: 900 ms
	 synthetic 
*/