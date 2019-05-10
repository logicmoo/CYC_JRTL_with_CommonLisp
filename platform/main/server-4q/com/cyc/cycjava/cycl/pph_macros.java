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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pph_macros
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.pph_macros";
  public static final String myFingerPrint = "41a9f71297fd58a104a017f3349d5c6cc2b3cd65a6ffeb0f4c1c5884f78bbb17";
  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 7642L)
  public static SubLSymbol $pph_memoization_state$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 7809L)
  public static SubLSymbol $pph_external_memoization_state$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 9902L)
  public static SubLSymbol $dtp_pph_problem_store_pointer$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 10215L)
  public static SubLSymbol $free_pph_problem_store_pointers$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 11977L)
  public static SubLSymbol $pph_problem_store_pointer$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 14137L)
  public static SubLSymbol $new_pph_phrases$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 14247L)
  public static SubLSymbol $destroy_new_pph_phrasesP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 14303L)
  public static SubLSymbol $creating_permanent_pph_phraseP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 14365L)
  public static SubLSymbol $new_pph_phrase_count$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 14915L)
  public static SubLSymbol $inside_destroy_new_pph_phrasesP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 26100L)
  public static SubLSymbol $pph_disambiguation_mode_return_style$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 29595L)
  public static SubLSymbol $pph_timeout_time$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 29700L)
  public static SubLSymbol $pph_timeout_reachedP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 29752L)
  public static SubLSymbol $pph_timeout_time_check_count$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 29810L)
  public static SubLSymbol $pph_default_timeout$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 39270L)
  public static SubLSymbol $pph_var_types_counter$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 44149L)
  private static SubLSymbol $max_suspended_method_depth$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 44336L)
  public static SubLSymbol $suspended_paraphrase_methods$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 44396L)
  public static SubLSymbol $allow_handling_of_pph_method_failuresP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 44465L)
  public static SubLSymbol $handling_pph_method_failuresP$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$PROGN;
  private static final SubLSymbol $sym2$ENFORCE_TYPE;
  private static final SubLList $list3;
  private static final SubLSymbol $sym4$CLET;
  private static final SubLSymbol $sym5$_PPH_TERM_PARAPHRASE_MAP_;
  private static final SubLSymbol $sym6$CHECK_TYPE;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$_PPH_TERM_PARAPHRASE_BLACKLIST_;
  private static final SubLList $list9;
  private static final SubLList $list10;
  private static final SubLSymbol $sym11$CHECK_LIST_TYPE;
  private static final SubLList $list12;
  private static final SubLSymbol $sym13$_PPH_LEXICAL_ASSERTION_BLACKLIST_;
  private static final SubLList $list14;
  private static final SubLSymbol $sym15$DO_ALIST;
  private static final SubLList $list16;
  private static final SubLList $list17;
  private static final SubLList $list18;
  private static final SubLSymbol $sym19$_PARAPHRASE_PRECISION_;
  private static final SubLList $list20;
  private static final SubLSymbol $sym21$WITH_PARAPHRASE_PRECISION;
  private static final SubLSymbol $sym22$REMEMBERING_PPH_AMBIGUOUS_STRINGS;
  private static final SubLList $list23;
  private static final SubLList $list24;
  private static final SubLList $list25;
  private static final SubLSymbol $sym26$_DEFINITE_DESCRIPTION_LICENSED_TERMS_;
  private static final SubLSymbol $sym27$APPEND;
  private static final SubLList $list28;
  private static final SubLList $list29;
  private static final SubLSymbol $sym30$_PPH_CURRENT_ARG0_;
  private static final SubLSymbol $sym31$FIF;
  private static final SubLSymbol $sym32$PPH_OK_ARG0_FOR_LINKING_;
  private static final SubLList $list33;
  private static final SubLSymbol $sym34$PPH_POSSIBLY_BINDING_CURRENT_ARG0;
  private static final SubLList $list35;
  private static final SubLSymbol $sym36$_CONSTANT_LINK_FUNCTION_;
  private static final SubLSymbol $sym37$FIRST_OF;
  private static final SubLList $list38;
  private static final SubLSymbol $sym39$_HTML_GENERATION_TARGET_;
  private static final SubLList $list40;
  private static final SubLList $list41;
  private static final SubLSymbol $sym42$_HTML_GENERATION_TERM_ID_FUNCTION_;
  private static final SubLList $list43;
  private static final SubLList $list44;
  private static final SubLList $list45;
  private static final SubLSymbol $sym46$_PPH_LINK_UNLINKED_PHRASES_TO_MATRIX_ARG0__;
  private static final SubLSymbol $sym47$CAND;
  private static final SubLList $list48;
  private static final SubLSymbol $sym49$CNOT;
  private static final SubLSymbol $sym50$NEW_OR_REUSED;
  private static final SubLSymbol $sym51$WITH_PPH_PROBLEM_STORE;
  private static final SubLSymbol $sym52$CMULTIPLE_VALUE_BIND;
  private static final SubLSymbol $sym53$_PPH_MEMOIZATION_STATE_;
  private static final SubLList $list54;
  private static final SubLList $list55;
  private static final SubLSymbol $sym56$WITH_MEMOIZATION_STATE;
  private static final SubLList $list57;
  private static final SubLSymbol $sym58$PWHEN;
  private static final SubLList $list59;
  private static final SubLList $list60;
  private static final SubLList $list61;
  private static final SubLList $list62;
  private static final SubLSymbol $sym63$FIND_OR_CREATE_PPH_MEMOIZATION_STATE;
  private static final SubLSymbol $sym64$WITH_PPH_MEMOIZATION;
  private static final SubLSymbol $kw65$REUSED;
  private static final SubLSymbol $kw66$NEW;
  private static final SubLSymbol $sym67$FIND_OR_CREATE_PPH_EXTERNAL_MEMOIZATION_STATE;
  private static final SubLList $list68;
  private static final SubLSymbol $sym69$PPH_PROBLEM_STORE_POINTER;
  private static final SubLSymbol $sym70$PPH_PROBLEM_STORE_POINTER_P;
  private static final SubLList $list71;
  private static final SubLList $list72;
  private static final SubLList $list73;
  private static final SubLList $list74;
  private static final SubLSymbol $sym75$PPRINT_PPH_PROBLEM_STORE_POINTER;
  private static final SubLSymbol $sym76$PPH_PROBLEM_STORE_POINTER_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list77;
  private static final SubLSymbol $sym78$PPH_PROBLEM_STORE_POINTER_STORE;
  private static final SubLSymbol $sym79$_CSETF_PPH_PROBLEM_STORE_POINTER_STORE;
  private static final SubLSymbol $kw80$STORE;
  private static final SubLString $str81$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw82$BEGIN;
  private static final SubLSymbol $sym83$MAKE_PPH_PROBLEM_STORE_POINTER;
  private static final SubLSymbol $kw84$SLOT;
  private static final SubLSymbol $kw85$END;
  private static final SubLSymbol $sym86$VISIT_DEFSTRUCT_OBJECT_PPH_PROBLEM_STORE_POINTER_METHOD;
  private static final SubLString $str87$_PPH_PSP__S_;
  private static final SubLSymbol $kw88$SKIP;
  private static final SubLSymbol $sym89$FREE_PPH_PROBLEM_STORE_POINTER;
  private static final SubLSymbol $kw90$FREE;
  private static final SubLString $str91$__Initial_PPH_problem_store___S__;
  private static final SubLSymbol $sym92$REUSE_;
  private static final SubLList $list93;
  private static final SubLSymbol $sym94$_PPH_PROBLEM_STORE_POINTER_;
  private static final SubLList $list95;
  private static final SubLSymbol $sym96$CUNWIND_PROTECT;
  private static final SubLSymbol $sym97$PUNLESS;
  private static final SubLList $list98;
  private static final SubLSymbol $sym99$FIND_OR_CREATE_PPH_PROBLEM_STORE_POINTER;
  private static final SubLString $str100$Destroying_PPH_problem_store___S_;
  private static final SubLString $str101$_PPH_error_level_;
  private static final SubLString $str102$__;
  private static final SubLString $str103$New_PPH_problem_store_is_not_ok__;
  private static final SubLInteger $int104$100000;
  private static final SubLList $list105;
  private static final SubLSymbol $kw106$NOTED;
  private static final SubLSymbol $sym107$DESTROY_NEW_PPH_PHRASES;
  private static final SubLSymbol $sym108$DESTROYING_NEW_PPH_PHRASES_WHEN_DONE;
  private static final SubLSymbol $sym109$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLString $str110$error_while_destroying_phrase___S;
  private static final SubLString $str111$Destroyed__S_PPH_phrases____New_o;
  private static final SubLList $list112;
  private static final SubLList $list113;
  private static final SubLSymbol $sym114$GET_NEW_PPH_PHRASE_COUNT;
  private static final SubLList $list115;
  private static final SubLSymbol $sym116$MATRIX_NEW_PPH_PHRASES;
  private static final SubLSymbol $sym117$PHRASE;
  private static final SubLList $list118;
  private static final SubLList $list119;
  private static final SubLList $list120;
  private static final SubLList $list121;
  private static final SubLSymbol $sym122$PIF;
  private static final SubLList $list123;
  private static final SubLSymbol $sym124$DO_STACK_ELEMENTS;
  private static final SubLSymbol $sym125$STACK_PUSH;
  private static final SubLList $list126;
  private static final SubLList $list127;
  private static final SubLSymbol $sym128$WITHIN_NEW_PPH_DISCOURSE_CONTEXT;
  private static final SubLSymbol $sym129$ENSURING_PPH_DISCOURSE_CONTEXT;
  private static final SubLList $list130;
  private static final SubLList $list131;
  private static final SubLList $list132;
  private static final SubLSymbol $sym133$HERALD_NEW_DISCOURSE_CONTEXT;
  private static final SubLString $str134$__Entering_WITHIN_NEW_PPH_DISCOUR;
  private static final SubLSymbol $sym135$HERALD_END_OF_DISCOURSE_CONTEXT;
  private static final SubLString $str136$__Leaving_WITHIN_NEW_PPH_DISCOURS;
  private static final SubLSymbol $sym137$PPH_DISCOURSE_CONTEXT_INITIALIZED_;
  private static final SubLSymbol $sym138$CLEAR_PPH_DISCOURSE_CONTEXT;
  private static final SubLList $list139;
  private static final SubLSymbol $kw140$CYC_LEXICON;
  private static final SubLSymbol $sym141$MATRIX_RMS;
  private static final SubLString $str142$NIL;
  private static final SubLSymbol $sym143$IGNORE;
  private static final SubLSymbol $sym144$CSETQ;
  private static final SubLSymbol $sym145$NOTE_LEAVING_SHADOWED_DISCOURSE_CONTEXT;
  private static final SubLSymbol $sym146$_PPH_DISCOURSE_CONTEXT_;
  private static final SubLList $list147;
  private static final SubLList $list148;
  private static final SubLList $list149;
  private static final SubLSymbol $sym150$WITH_SHADOWED_DISCOURSE_CONTEXT;
  private static final SubLString $str151$__Leaving__S;
  private static final SubLString $str152$New_RMS___S;
  private static final SubLList $list153;
  private static final SubLSymbol $sym154$_PPH_SPEAKER_;
  private static final SubLSymbol $sym155$_PPH_ADDRESSEE_;
  private static final SubLList $list156;
  private static final SubLList $list157;
  private static final SubLSymbol $kw158$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw159$PARANOID_ARG;
  private static final SubLSymbol $sym160$PARANOID_ARG;
  private static final SubLSymbol $kw161$OUTPUT_ITEM;
  private static final SubLSymbol $sym162$OUTPUT_ITEM;
  private static final SubLSymbol $kw163$ARG_POSITION;
  private static final SubLSymbol $sym164$ARG_POSITION;
  private static final SubLSymbol $kw165$HTML_OPEN_TAG;
  private static final SubLSymbol $sym166$HTML_OPEN_TAG;
  private static final SubLSymbol $kw167$HTML_CLOSE_TAG;
  private static final SubLSymbol $sym168$HTML_CLOSE_TAG;
  private static final SubLSymbol $kw169$START_CHAR_INDEX;
  private static final SubLSymbol $sym170$START_CHAR_INDEX;
  private static final SubLSymbol $kw171$WHOLE_STRING;
  private static final SubLSymbol $sym172$WHOLE_STRING;
  private static final SubLSymbol $sym173$ITEM;
  private static final SubLSymbol $sym174$WHOLE_HTML_STRING;
  private static final SubLSymbol $sym175$END_CHAR_INDEX;
  private static final SubLSymbol $sym176$ITERATOR;
  private static final SubLList $list177;
  private static final SubLList $list178;
  private static final SubLSymbol $sym179$PPH_PHRASE_OUTPUT_LIST_STRING;
  private static final SubLList $list180;
  private static final SubLSymbol $sym181$PPH_REMOVE_HTML_TAGS;
  private static final SubLSymbol $sym182$NEW_PPH_PHRASE_OUTPUT_LIST_ITERATOR;
  private static final SubLSymbol $sym183$UNTIL;
  private static final SubLSymbol $sym184$PPH_PHRASE_OUTPUT_LIST_ITERATOR_EMPTY_P;
  private static final SubLSymbol $sym185$PPH_PHRASE_OUTPUT_LIST_ITERATOR_NEXT;
  private static final SubLSymbol $sym186$DO_ONE_PPH_OUTPUT_LIST_ITEM;
  private static final SubLSymbol $sym187$DO_PPH_OUTPUT_LIST;
  private static final SubLList $list188;
  private static final SubLSymbol $sym189$PPH_MAYBE_DO_SPACE_ITEM;
  private static final SubLSymbol $sym190$WITH_PPH_REGULAR_OUTPUT_ITEM_BINDINGS;
  private static final SubLSymbol $sym191$RAW_ITEM_STRING;
  private static final SubLSymbol $sym192$PPH_PHRASE_OUTPUT_ITEM_GET_STRING;
  private static final SubLSymbol $sym193$PPH_OUTPUT_LIST_FIND_START_CHAR;
  private static final SubLSymbol $sym194$_;
  private static final SubLSymbol $sym195$PPH_MAKE_SPACE_STRING;
  private static final SubLList $list196;
  private static final SubLList $list197;
  private static final SubLSymbol $sym198$NEW_PPH_PHRASE_FILLER_ITEM;
  private static final SubLSymbol $sym199$PPH_UPDATE_END_CHAR_INDEX;
  private static final SubLString $str200$Adding_space_string_of_length__S;
  private static final SubLList $list201;
  private static final SubLSymbol $sym202$PPH_PHRASE_OUTPUT_ITEM_ARG_POSITION;
  private static final SubLSymbol $sym203$PPH_PHRASE_OUTPUT_ITEM_HTML_OPEN_TAG;
  private static final SubLSymbol $sym204$PPH_PHRASE_OUTPUT_ITEM_HTML_CLOSE_TAG;
  private static final SubLSymbol $sym205$PPH_PHRASE_OUTPUT_ITEM_CYCL;
  private static final SubLSymbol $sym206$PPH_STRING_P;
  private static final SubLSymbol $sym207$PPH_CHAR__;
  private static final SubLString $str208$Couldn_t_find__S_in__S___;
  private static final SubLList $list209;
  private static final SubLList $list210;
  private static final SubLSymbol $kw211$DONE;
  private static final SubLSymbol $sym212$CSOME;
  private static final SubLSymbol $sym213$PPH_NJAVALIST_ITEMS;
  private static final SubLSymbol $kw214$PAIRS;
  private static final SubLList $list215;
  private static final SubLList $list216;
  private static final SubLSymbol $kw217$RETURN_STYLE;
  private static final SubLSymbol $kw218$JAVALISTS;
  private static final SubLList $list219;
  private static final SubLList $list220;
  private static final SubLList $list221;
  private static final SubLSymbol $sym222$_PARTIAL_RESULTS_NOTIFICATION_FN_;
  private static final SubLList $list223;
  private static final SubLSymbol $sym224$_PPH_DISAMBIGUATION_MODE_RETURN_STYLE_;
  private static final SubLSymbol $sym225$WITH_PARTIAL_RESULTS_ACCUMULATION;
  private static final SubLSymbol $sym226$INCREMENTAL_PPH_DISAMBIGUATION_RESULT_P;
  private static final SubLString $str227$Don_t_know_how_to_accumulate__S_a;
  private static final SubLSymbol $sym228$_;
  private static final SubLList $list229;
  private static final SubLSymbol $sym230$MATRIX_PROBLEM_DICTIONARY;
  private static final SubLList $list231;
  private static final SubLList $list232;
  private static final SubLList $list233;
  private static final SubLSymbol $sym234$_PPH_PROBLEM_REPORTS_;
  private static final SubLSymbol $sym235$DICTIONARY_P;
  private static final SubLSymbol $sym236$PPH_MERGE_PROBLEM_DICTIONARY;
  private static final SubLList $list237;
  private static final SubLList $list238;
  private static final SubLSymbol $sym239$_PPH_TIMEOUT_TIME_;
  private static final SubLSymbol $sym240$PPH_COMPUTE_TIMEOUT_TIME;
  private static final SubLList $list241;
  private static final SubLList $list242;
  private static final SubLSymbol $sym243$_PPH_TIMEOUT_REACHED__;
  private static final SubLList $list244;
  private static final SubLString $str245$PPH_timeout_reached_;
  private static final SubLSymbol $sym246$WITH_PPH_TIMEOUT;
  private static final SubLSymbol $sym247$PPH_TIMEOUT;
  private static final SubLSymbol $sym248$ALREADY_INITIALIZED_;
  private static final SubLList $list249;
  private static final SubLSymbol $sym250$_PPH_UNEXPRESSED_NEGATIONS_;
  private static final SubLList $list251;
  private static final SubLSymbol $sym252$COR;
  private static final SubLList $list253;
  private static final SubLList $list254;
  private static final SubLList $list255;
  private static final SubLSymbol $sym256$_PPH_LANGUAGE_MT_;
  private static final SubLSymbol $sym257$PPH_CANONICALIZE_HLMT;
  private static final SubLList $list258;
  private static final SubLList $list259;
  private static final SubLSymbol $sym260$_PPH_DOMAIN_MT_;
  private static final SubLList $list261;
  private static final SubLList $list262;
  private static final SubLSymbol $sym263$POSSIBLY_WITH_PPH_LANGUAGE_MT;
  private static final SubLSymbol $sym264$POSSIBLY_WITH_PPH_DOMAIN_MT;
  private static final SubLList $list265;
  private static final SubLSymbol $sym266$WITH_INFERENCE_MT_RELEVANCE;
  private static final SubLSymbol $sym267$BROADENED_LANGUAGE_MT;
  private static final SubLSymbol $sym268$WITH_PPH_LANGUAGE_MT_RELEVANCE;
  private static final SubLList $list269;
  private static final SubLSymbol $sym270$HLMT_EQUAL_;
  private static final SubLList $list271;
  private static final SubLList $list272;
  private static final SubLList $list273;
  private static final SubLSymbol $sym274$DO_DICTIONARY;
  private static final SubLList $list275;
  private static final SubLList $list276;
  private static final SubLList $list277;
  private static final SubLSymbol $sym278$SUSPEND_;
  private static final SubLSymbol $sym279$_PPH_USE_BULLETED_LISTS__;
  private static final SubLSymbol $sym280$PPH_NOTE;
  private static final SubLString $str281$__Suspending_bullet_use_for____S_;
  private static final SubLList $list282;
  private static final SubLList $list283;
  private static final SubLSymbol $sym284$PPH_CHECK_TYPE;
  private static final SubLList $list285;
  private static final SubLSymbol $sym286$_PPH_DEMERIT_CUTOFF_;
  private static final SubLSymbol $sym287$COMPUTE_NEW_PPH_DEMERIT_CUTOFF;
  private static final SubLSymbol $sym288$WITH_MAXIMUM_PPH_DEMERIT_CUTOFF;
  private static final SubLSymbol $sym289$INTEGERP;
  private static final SubLList $list290;
  private static final SubLSymbol $sym291$OLD_GRACE_PERIOD;
  private static final SubLList $list292;
  private static final SubLSymbol $sym293$SET_PPH_PHRASE_DESTRUCTION_GRACE_PERIOD;
  private static final SubLSymbol $sym294$MAX;
  private static final SubLList $list295;
  private static final SubLList $list296;
  private static final SubLList $list297;
  private static final SubLSymbol $sym298$_PPH_INFERENCE_ANSWER_;
  private static final SubLSymbol $sym299$WITH_PPH_INFERENCE;
  private static final SubLSymbol $sym300$INFERENCE_ANSWER_INFERENCE;
  private static final SubLList $list301;
  private static final SubLSymbol $sym302$_PPH_HYPOTHETICAL_VARS_;
  private static final SubLSymbol $sym303$INFERENCE_HYPOTHETICAL_BINDINGS;
  private static final SubLList $list304;
  private static final SubLSymbol $sym305$PPH_ENHANCED_DOMAIN_MT;
  private static final SubLSymbol $sym306$PPH_GET_INFERENCE_MT;
  private static final SubLSymbol $sym307$WITH_PPH_INFERENCE_ANSWER;
  private static final SubLList $list308;
  private static final SubLSymbol $sym309$POSSIBLY_WITH_PPH_HTML_JUSTIFICATION_GENERATION_PARAMETERS;
  private static final SubLSymbol $sym310$LINK_FUNCTION;
  private static final SubLSymbol $sym311$HTML_TARGET;
  private static final SubLList $list312;
  private static final SubLSymbol $sym313$WITH_PPH_HTML_FUNCTION_AND_TARGET;
  private static final SubLSymbol $sym314$PPH_JUSTIFICATION_HTML_FUNCTION_AND_TARGET;
  private static final SubLSymbol $sym315$WITH_PPH_JUSTIFICATION_GENERATION_PARAMETERS;
  private static final SubLList $list316;
  private static final SubLSymbol $sym317$VAR_TYPES_SHADOW;
  private static final SubLList $list318;
  private static final SubLList $list319;
  private static final SubLList $list320;
  private static final SubLSymbol $sym321$_PPH_VAR_TYPES_;
  private static final SubLList $list322;
  private static final SubLSymbol $sym323$PPH_PHRASE_DONE_;
  private static final SubLList $list324;
  private static final SubLString $str325$___Setting__S_to____S;
  private static final SubLSymbol $sym326$DICTIONARY_VALUES;
  private static final SubLSymbol $sym327$PPH_RESET_VAR_TYPES;
  private static final SubLList $list328;
  private static final SubLSymbol $sym329$PPH_SETTING_VAR_TYPES_IF_SUCCESSFUL;
  private static final SubLSymbol $sym330$OLD_PPH_VARS;
  private static final SubLList $list331;
  private static final SubLList $list332;
  private static final SubLList $list333;
  private static final SubLList $list334;
  private static final SubLSymbol $sym335$LOCAL_VARS;
  private static final SubLSymbol $sym336$SET_DIFFERENCE;
  private static final SubLList $list337;
  private static final SubLList $list338;
  private static final SubLSymbol $sym339$PPH_HANDLE_LOCAL_VARS;
  private static final SubLSymbol $sym340$PPH_POSSIBLY_BINDING_VARIABLES;
  private static final SubLString $str341$__Deregistering__S__;
  private static final SubLList $list342;
  private static final SubLSymbol $sym343$CDESTRUCTURING_BIND;
  private static final SubLList $list344;
  private static final SubLSymbol $sym345$PPH_PHRASE_AGR;
  private static final SubLList $list346;
  private static final SubLList $list347;
  private static final SubLSymbol $kw348$RELN;
  private static final SubLSymbol $kw349$ARG_POSITION_MAP;
  private static final SubLSymbol $kw350$INVERSE_;
  private static final SubLSymbol $sym351$IGNORE_ME;
  private static final SubLSymbol $kw352$NL_PREDS;
  private static final SubLSymbol $kw353$ANY;
  private static final SubLSymbol $kw354$FOCUS_ARGNUM;
  private static final SubLSymbol $sym355$GENERATOR;
  private static final SubLSymbol $sym356$GET_PPH_PHRASE_TEMPLATE_GENERATOR;
  private static final SubLSymbol $sym357$PPH_PHRASE_TEMPLATE_GENERATOR_DONE_P;
  private static final SubLSymbol $sym358$PPH_PHRASE_TEMPLATE_GENERATOR_NEXT;
  private static final SubLSymbol $sym359$PPH_PHRASE_P;
  private static final SubLSymbol $sym360$FREE_PPH_PHRASE_TEMPLATE_GENERATOR;
  private static final SubLList $list361;
  private static final SubLList $list362;
  private static final SubLSymbol $kw363$FOCUS_ARG;
  private static final SubLSymbol $sym364$PHRASE_TEMPLATE;
  private static final SubLSymbol $sym365$DO_PPH_PHRASE_TEMPLATES_FOR_FORMULA;
  private static final SubLSymbol $sym366$PPH_CUSTOMIZE_TEMPLATE_MACRO_HELPER;
  private static final SubLInteger $int367$300;
  private static final SubLSymbol $sym368$MAX_SUSPENDED_METHOD_DEPTH;
  private static final SubLSymbol $sym369$HANDLING_PPH_METHOD_FAILURES;
  private static final SubLSymbol $sym370$FAILED_METHOD;
  private static final SubLSymbol $sym371$TRIED_ONE_;
  private static final SubLSymbol $sym372$TOP_LEVEL_;
  private static final SubLList $list373;
  private static final SubLSymbol $sym374$_SUSPENDED_PARAPHRASE_METHODS_;
  private static final SubLList $list375;
  private static final SubLList $list376;
  private static final SubLSymbol $sym377$WHILE;
  private static final SubLSymbol $sym378$NOTE_SUSPENDED_PARAPHRASE_METHOD_PLIST;
  private static final SubLSymbol $sym379$CCATCH;
  private static final SubLSymbol $kw380$PPH_METHOD_FAILURE;
  private static final SubLSymbol $sym381$HANDLING_PPH_METHOD_FAILURES_TOP_LEVEL_P;
  private static final SubLString $str382$Can_t_note_PPH_method_failure__no;
  private static final SubLString $str383$_S___is_already_suspended_;
  private static final SubLString $str384$Over__S_suspended_methods____Curr;
  private static final SubLSymbol $kw385$CYCL;
  private static final SubLString $str386$Cleared__S_suspended_methods_for_;
  private static final SubLList $list387;
  private static final SubLSymbol $sym388$INFO;
  private static final SubLSymbol $sym389$PPH_METHOD_INFO;
  private static final SubLSymbol $sym390$PPH_DEREGISTER_METHOD_INFO;
  private static final SubLSymbol $sym391$PPH_REGISTER_METHOD_INFO;
  private static final SubLList $list392;
  private static final SubLSymbol $sym393$_SELECT_STRING_METHODS_TO_OMIT_;
  private static final SubLSymbol $sym394$SAVE_CYCL;
  private static final SubLSymbol $sym395$PPH_PHRASE_RESTRICT_CYCL_TO_MT_SCOPE;
  private static final SubLSymbol $sym396$PPH_PHRASE_RESTORE_AND_REPHRASE_CYCL_IF_MT_SCOPED;
  private static final SubLSymbol $sym397$HANDLING_PPH_MT_SCOPE;
  private static final SubLString $str398$Removing_MT_scope_from__S;
  private static final SubLList $list399;
  private static final SubLString $str400$Updating_agr_preds_to__S_based_on;
  private static final SubLString $str401$New_agr_preds___S;
  private static final SubLString $str402$Adding_Mt_scope_paraphrases_to___;
  private static final SubLString $str403$Couldn_t_finish_temporal_phrase__;
  private static final SubLList $list404;
  private static final SubLString $str405$_;
  private static final SubLString $str406$___Top_level_CycL___S;
  private static final SubLSymbol $kw407$FAILED;
  private static final SubLString $str408$Result_of_adding_Mt_scope_paraphr;
  private static final SubLList $list409;
  private static final SubLObject $const410$TemporalMicrotheory;
  private static final SubLList $list411;
  private static final SubLString $str412$according_to;
  private static final SubLSymbol $kw413$PHRASE_CYCL;
  private static final SubLObject $const414$Now;
  private static final SubLString $str415$Ignoring__S___because_it_subsumes;
  private static final SubLList $list416;
  private static final SubLSymbol $sym417$ALREADY_MEMORY_MAPPED;
  private static final SubLList $list418;
  private static final SubLList $list419;
  private static final SubLList $list420;

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 793L)
  public static SubLObject pph_mapped_string_for_term(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return list_utilities.alist_lookup( pph_vars.$pph_term_paraphrase_map$.getDynamicValue( thread ), v_term, Symbols.symbol_function( EQUAL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 1031L)
  public static SubLObject with_paraphrase_mappings(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject mappings = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    mappings = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym1$PROGN, ConsesLow.listS( $sym2$ENFORCE_TYPE, mappings, $list3 ), ConsesLow.listS( $sym4$CLET, ConsesLow.list( ConsesLow.list( $sym5$_PPH_TERM_PARAPHRASE_MAP_, mappings ) ), ConsesLow
        .append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 1418L)
  public static SubLObject with_paraphrase_blacklist(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject mappings = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    mappings = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym1$PROGN, ConsesLow.listS( $sym6$CHECK_TYPE, mappings, $list7 ), ConsesLow.listS( $sym4$CLET, ConsesLow.list( ConsesLow.list( $sym8$_PPH_TERM_PARAPHRASE_BLACKLIST_, mappings ) ), ConsesLow
        .append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 1802L)
  public static SubLObject valid_pph_blacklistP(final SubLObject v_object)
  {
    SubLObject invalidP;
    SubLObject rest;
    SubLObject cons;
    SubLObject current;
    SubLObject datum;
    SubLObject v_term;
    SubLObject strings;
    for( invalidP = makeBoolean( NIL == list_utilities.alist_p( v_object ) ), rest = NIL, rest = v_object; NIL == invalidP && NIL != rest; invalidP = makeBoolean( NIL == cycl_grammar.cycl_term_p( v_term )
        || NIL == string_utilities.list_of_string_p( strings ) ), rest = rest.rest() )
    {
      cons = rest.first();
      datum = ( current = cons );
      v_term = NIL;
      strings = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
      v_term = current.first();
      current = ( strings = current.rest() );
    }
    return makeBoolean( NIL == invalidP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 2072L)
  public static SubLObject with_paraphrase_lexical_assertion_blacklist(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject lexical_assertions = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
    lexical_assertions = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym1$PROGN, ConsesLow.listS( $sym11$CHECK_LIST_TYPE, lexical_assertions, $list12 ), ConsesLow.listS( $sym4$CLET, ConsesLow.list( ConsesLow.list( $sym13$_PPH_LEXICAL_ASSERTION_BLACKLIST_,
        lexical_assertions ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 2453L)
  public static SubLObject valid_pph_blacklist_assertionP(final SubLObject v_object)
  {
    return assertion_handles.assertion_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 2539L)
  public static SubLObject do_pph_arg_position_map(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject from_prefix = NIL;
    SubLObject to_prefix = NIL;
    SubLObject map = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
    from_prefix = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
    to_prefix = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
    map = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym15$DO_ALIST, ConsesLow.list( from_prefix, to_prefix, map ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list14 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 2738L)
  public static SubLObject remembering_pph_ambiguous_strings(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym4$CLET, $list16, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 2974L)
  public static SubLObject with_paraphrase_precision(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject precision = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list17 );
    precision = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym1$PROGN, ConsesLow.listS( $sym6$CHECK_TYPE, precision, $list18 ), ConsesLow.listS( $sym4$CLET, ConsesLow.list( ConsesLow.list( $sym19$_PARAPHRASE_PRECISION_, precision ) ), ConsesLow
        .append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 3332L)
  public static SubLObject with_terse_paraphrase_on(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym4$CLET, $list20, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 3483L)
  public static SubLObject with_precise_paraphrase_on(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym21$WITH_PARAPHRASE_PRECISION, T, reader.bq_cons( $sym22$REMEMBERING_PPH_AMBIGUOUS_STRINGS, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 3678L)
  public static SubLObject with_precise_paraphrase_off(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym21$WITH_PARAPHRASE_PRECISION, NIL, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 3835L)
  public static SubLObject with_precise_paraphrase_for_args(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject nested_arg_list = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
    nested_arg_list = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym1$PROGN, ConsesLow.listS( $sym6$CHECK_TYPE, nested_arg_list, $list24 ), ConsesLow.listS( $sym21$WITH_PARAPHRASE_PRECISION, nested_arg_list, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 4183L)
  public static SubLObject with_definite_descriptions_licensed_for_terms(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject terms = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
    terms = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym4$CLET, ConsesLow.list( ConsesLow.list( $sym26$_DEFINITE_DESCRIPTION_LICENSED_TERMS_, ConsesLow.list( $sym27$APPEND, $sym26$_DEFINITE_DESCRIPTION_LICENSED_TERMS_, terms ) ) ), ConsesLow
        .append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 4470L)
  public static SubLObject pph_nested_arg_list_p(final SubLObject obj)
  {
    if( NIL == obj )
    {
      return T;
    }
    if( NIL == list_utilities.proper_list_p( obj ) )
    {
      return NIL;
    }
    if( NIL != subl_promotions.memberP( NIL, obj, UNPROVIDED, UNPROVIDED ) )
    {
      return NIL;
    }
    SubLObject csome_list_var = obj;
    SubLObject item = NIL;
    item = csome_list_var.first();
    while ( NIL != csome_list_var)
    {
      if( item.isInteger() && item.isNegative() )
      {
        return NIL;
      }
      if( !item.isInteger() && NIL == pph_nested_arg_list_p( item ) )
      {
        return NIL;
      }
      csome_list_var = csome_list_var.rest();
      item = csome_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 4907L)
  public static SubLObject maximizing_pph_links(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym4$CLET, $list28, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 5236L)
  public static SubLObject pph_possibly_binding_current_arg0(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject arg0 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
    arg0 = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym4$CLET, ConsesLow.list( ConsesLow.list( $sym30$_PPH_CURRENT_ARG0_, ConsesLow.listS( $sym31$FIF, ConsesLow.list( $sym32$PPH_OK_ARG0_FOR_LINKING_, arg0 ), arg0, $list33 ) ) ), ConsesLow
          .append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list29 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 5419L)
  public static SubLObject pph_ok_arg0_for_linkingP(final SubLObject arg0)
  {
    return makeBoolean( NIL == fort_types_interface.logical_connective_p( arg0 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 5562L)
  public static SubLObject with_pph_html_function_and_target(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject function = NIL;
    SubLObject target = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
    function = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
    target = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym4$CLET, ConsesLow.list( ConsesLow.list( $sym36$_CONSTANT_LINK_FUNCTION_, ConsesLow.listS( $sym37$FIRST_OF, function, $list38 ) ), ConsesLow.list( $sym39$_HTML_GENERATION_TARGET_,
          ConsesLow.listS( $sym37$FIRST_OF, target, $list40 ) ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list35 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 6036L)
  public static SubLObject with_pph_html_term_id_fn(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject function_spec = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
    function_spec = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym4$CLET, ConsesLow.list( ConsesLow.list( $sym42$_HTML_GENERATION_TERM_ID_FUNCTION_, function_spec ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list41 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 6319L)
  public static SubLObject omitting_hyperlinks_in_pph_html_mode(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym4$CLET, $list43, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 7138L)
  public static SubLObject allowing_utf8_in_pph_text_mode(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym4$CLET, $list44, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 7317L)
  public static SubLObject dont_link_unlinked_phrases_to_matrix_arg_if(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject form = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
    form = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym4$CLET, ConsesLow.list( ConsesLow.list( $sym46$_PPH_LINK_UNLINKED_PHRASES_TO_MATRIX_ARG0__, ConsesLow.list( $sym47$CAND, $list48, ConsesLow.list( $sym49$CNOT, form ) ) ) ), ConsesLow
        .append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 7965L)
  public static SubLObject with_pph_memoization(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    final SubLObject new_or_reused = $sym50$NEW_OR_REUSED;
    return ConsesLow.list( $sym51$WITH_PPH_PROBLEM_STORE, ConsesLow.list( $sym52$CMULTIPLE_VALUE_BIND, ConsesLow.list( $sym53$_PPH_MEMOIZATION_STATE_, new_or_reused ), $list54, ConsesLow.list( $sym4$CLET, $list55,
        ConsesLow.listS( $sym56$WITH_MEMOIZATION_STATE, $list57, ConsesLow.append( body, NIL ) ) ), ConsesLow.listS( $sym58$PWHEN, ConsesLow.listS( $sym47$CAND, ConsesLow.listS( EQ, new_or_reused, $list59 ), $list60 ),
            $list61 ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 8681L)
  public static SubLObject with_pph_external_memoization(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym56$WITH_MEMOIZATION_STATE, $list62, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 9133L)
  public static SubLObject find_or_create_pph_memoization_state()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != memoization_state.memoization_state_p( $pph_memoization_state$.getDynamicValue( thread ) ) )
    {
      return Values.values( $pph_memoization_state$.getDynamicValue( thread ), $kw65$REUSED );
    }
    return Values.values( memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), $kw66$NEW );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 9395L)
  public static SubLObject find_or_create_pph_external_memoization_state()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != misc_utilities.uninitialized_p( $pph_external_memoization_state$.getDynamicValue( thread ) ) ) ? Values.values( memoization_state.current_memoization_state(), $kw66$NEW )
        : Values.values( $pph_external_memoization_state$.getDynamicValue( thread ), $kw65$REUSED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 9902L)
  public static SubLObject pph_problem_store_pointer_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    pprint_pph_problem_store_pointer( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 9902L)
  public static SubLObject pph_problem_store_pointer_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $pph_problem_store_pointer_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 9902L)
  public static SubLObject pph_problem_store_pointer_store(final SubLObject v_object)
  {
    assert NIL != pph_problem_store_pointer_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 9902L)
  public static SubLObject _csetf_pph_problem_store_pointer_store(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != pph_problem_store_pointer_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 9902L)
  public static SubLObject make_pph_problem_store_pointer(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $pph_problem_store_pointer_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw80$STORE ) )
      {
        _csetf_pph_problem_store_pointer_store( v_new, current_value );
      }
      else
      {
        Errors.error( $str81$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 9902L)
  public static SubLObject visit_defstruct_pph_problem_store_pointer(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw82$BEGIN, $sym83$MAKE_PPH_PROBLEM_STORE_POINTER, ONE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw84$SLOT, $kw80$STORE, pph_problem_store_pointer_store( obj ) );
    Functions.funcall( visitor_fn, obj, $kw85$END, $sym83$MAKE_PPH_PROBLEM_STORE_POINTER, ONE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 9902L)
  public static SubLObject visit_defstruct_object_pph_problem_store_pointer_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_pph_problem_store_pointer( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 10037L)
  public static SubLObject pprint_pph_problem_store_pointer(final SubLObject pointer, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str87$_PPH_PSP__S_, pph_problem_store_pointer_store( pointer ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 10330L)
  public static SubLObject pph_maybe_destroy_problem_store(final SubLObject problem_store)
  {
    if( NIL != inference_datastructures_problem_store.valid_problem_store_p( problem_store ) )
    {
      final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index( problem_store );
      if( NIL == id_index.id_index_objects_empty_p( idx, $kw88$SKIP ) )
      {
        final SubLObject idx_$1 = idx;
        if( NIL == id_index.id_index_dense_objects_empty_p( idx_$1, $kw88$SKIP ) )
        {
          final SubLObject vector_var = id_index.id_index_dense_objects( idx_$1 );
          final SubLObject backwardP_var = NIL;
          SubLObject length;
          SubLObject v_iteration;
          SubLObject id;
          SubLObject inference;
          for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
          {
            id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
            inference = Vectors.aref( vector_var, id );
            if( NIL == id_index.id_index_tombstone_p( inference ) || NIL == id_index.id_index_skip_tombstones_p( $kw88$SKIP ) )
            {
              if( NIL != id_index.id_index_tombstone_p( inference ) )
              {
                inference = $kw88$SKIP;
              }
              if( NIL != inference_datastructures_inference.inference_browsableP( inference ) )
              {
                return NIL;
              }
            }
          }
        }
        final SubLObject idx_$2 = idx;
        if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$2 ) )
        {
          final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$2 );
          SubLObject id2 = NIL;
          SubLObject inference2 = NIL;
          final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
          try
          {
            while ( Hashtables.iteratorHasNext( cdohash_iterator ))
            {
              final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
              id2 = Hashtables.getEntryKey( cdohash_entry );
              inference2 = Hashtables.getEntryValue( cdohash_entry );
              if( NIL != inference_datastructures_inference.inference_browsableP( inference2 ) )
              {
                return NIL;
              }
            }
          }
          finally
          {
            Hashtables.releaseEntrySetIterator( cdohash_iterator );
          }
        }
      }
    }
    inference_datastructures_problem_store.destroy_problem_store( problem_store );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 10614L)
  public static SubLObject free_pph_problem_store_pointer(final SubLObject pointer)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != pph_problem_store_pointer_p( pointer ) )
    {
      assert NIL != pph_problem_store_pointer_p( pointer ) : pointer;
      if( NIL != inference_datastructures_problem_store.problem_store_p( pph_problem_store_pointer_store( pointer ) ) )
      {
        pph_maybe_destroy_problem_store( pph_problem_store_pointer_store( pointer ) );
      }
      pph_problem_store_pointer_set_store( pointer, $kw90$FREE );
      $free_pph_problem_store_pointers$.setDynamicValue( ConsesLow.cons( pointer, $free_pph_problem_store_pointers$.getDynamicValue( thread ) ), thread );
    }
    return $kw90$FREE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 11091L)
  public static SubLObject pph_problem_store_pointer_set_store(final SubLObject pointer, final SubLObject store)
  {
    assert NIL != pph_problem_store_pointer_p( pointer ) : pointer;
    _csetf_pph_problem_store_pointer_store( pointer, store );
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 11284L)
  public static SubLObject new_problem_store_pointer()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject pointer = NIL;
    if( NIL != list_utilities.non_empty_list_p( $free_pph_problem_store_pointers$.getDynamicValue( thread ) ) )
    {
      final SubLObject datum_evaluated_var = $free_pph_problem_store_pointers$.getDynamicValue( thread );
      pointer = datum_evaluated_var.first();
      $free_pph_problem_store_pointers$.setDynamicValue( datum_evaluated_var.rest(), thread );
    }
    else
    {
      pointer = make_pph_problem_store_pointer( UNPROVIDED );
    }
    return pointer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 11603L)
  public static SubLObject replace_pph_problem_store_pointer_store(final SubLObject pointer)
  {
    assert NIL != pph_problem_store_pointer_p( pointer ) : pointer;
    final SubLObject old_store = pph_problem_store_pointer_store( pointer );
    final SubLObject new_store = inference_datastructures_problem_store.new_problem_store( UNPROVIDED );
    if( NIL != inference_datastructures_problem_store.problem_store_p( old_store ) )
    {
      inference_datastructures_problem_store.destroy_problem_store( old_store );
    }
    pph_problem_store_pointer_set_store( pointer, new_store );
    return pointer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 12035L)
  public static SubLObject pph_problem_store(SubLObject create_if_freeP)
  {
    if( create_if_freeP == UNPROVIDED )
    {
      create_if_freeP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pointer = $pph_problem_store_pointer$.getDynamicValue( thread );
    SubLObject store = NIL;
    if( NIL != pph_problem_store_pointer_p( pointer ) )
    {
      store = pph_problem_store_pointer_store( pointer );
      if( $kw90$FREE == store && NIL != create_if_freeP )
      {
        replace_pph_problem_store_pointer_store( pointer );
        if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
        {
          format_nil.force_format( T, $str91$__Initial_PPH_problem_store___S__, pph_problem_store_pointer_store( pointer ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        store = pph_problem_store_pointer_store( pointer );
      }
    }
    return ( NIL != store ) ? store : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 12565L)
  public static SubLObject with_pph_problem_store(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    final SubLObject reuseP = $sym92$REUSE_;
    return ConsesLow.list( $sym4$CLET, $list93, ConsesLow.list( $sym52$CMULTIPLE_VALUE_BIND, ConsesLow.list( $sym94$_PPH_PROBLEM_STORE_POINTER_, reuseP ), $list95, ConsesLow.list( $sym96$CUNWIND_PROTECT, reader.bq_cons(
        $sym1$PROGN, ConsesLow.append( body, NIL ) ), ConsesLow.listS( $sym97$PUNLESS, reuseP, $list98 ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 12947L)
  public static SubLObject find_or_create_pph_problem_store_pointer()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == pph_problem_store_pointer_p( $pph_problem_store_pointer$.getDynamicValue( thread ) ) )
    {
      final SubLObject new_problem_store_pointer = new_problem_store_pointer();
      return Values.values( new_problem_store_pointer, NIL );
    }
    if( NIL == pph_problem_store_okP() )
    {
      if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
      {
        format_nil.force_format( T, $str100$Destroying_PPH_problem_store___S_, pph_problem_store( UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      replace_pph_problem_store_pointer_store( $pph_problem_store_pointer$.getDynamicValue( thread ) );
      if( NIL == pph_problem_store_okP() )
      {
        final SubLObject new_format_string = Sequences.cconcatenate( $str101$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str102$__, format_nil.format_nil_a_no_copy(
            $str103$New_PPH_problem_store_is_not_ok__ )
        } );
        pph_error.pph_handle_error( new_format_string, ConsesLow.list( pph_problem_store( UNPROVIDED ) ) );
      }
      return Values.values( $pph_problem_store_pointer$.getDynamicValue( thread ), T );
    }
    return Values.values( $pph_problem_store_pointer$.getDynamicValue( thread ), T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 13838L)
  public static SubLObject pph_problem_store_okP()
  {
    final SubLObject store = pph_problem_store( UNPROVIDED );
    return makeBoolean( $kw90$FREE == store || ( NIL != inference_datastructures_problem_store.valid_problem_store_p( store ) && NIL != pph_problem_store_size_okP( store ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 14038L)
  public static SubLObject pph_problem_store_size_okP(final SubLObject store)
  {
    return Numbers.numL( inference_datastructures_problem_store.problem_store_size( store ), $int104$100000 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 14429L)
  public static SubLObject creating_permanent_pph_phrases(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym4$CLET, $list105, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 14638L)
  public static SubLObject note_new_pph_phrase(final SubLObject phrase)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    stacks.stack_push( phrase, $new_pph_phrases$.getDynamicValue( thread ) );
    $new_pph_phrase_count$.setDynamicValue( Numbers.add( $new_pph_phrase_count$.getDynamicValue( thread ), ONE_INTEGER ), thread );
    return $kw106$NOTED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 14774L)
  public static SubLObject new_pph_phrase_count()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != subl_promotions.non_negative_integer_p( $new_pph_phrase_count$.getDynamicValue( thread ) ) ) ? $new_pph_phrase_count$.getDynamicValue( thread ) : ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 15069L)
  public static SubLObject destroy_new_pph_phrases()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    while ( NIL == stacks.stack_empty_p( $new_pph_phrases$.getDynamicValue( thread ) ))
    {
      final SubLObject _prev_bind_0 = $inside_destroy_new_pph_phrasesP$.currentBinding( thread );
      try
      {
        $inside_destroy_new_pph_phrasesP$.bind( T, thread );
        final SubLObject phrase = stacks.stack_peek( $new_pph_phrases$.getDynamicValue( thread ) );
        if( NIL != pph_phrase.pph_phrase_p( phrase, UNPROVIDED ) )
        {
          SubLObject err = NIL;
          try
          {
            thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
            final SubLObject _prev_bind_0_$3 = Errors.$error_handler$.currentBinding( thread );
            try
            {
              Errors.$error_handler$.bind( $sym109$CATCH_ERROR_MESSAGE_HANDLER, thread );
              try
              {
                pph_phrase.destroy_pph_phrase( phrase, UNPROVIDED );
                count = Numbers.add( count, ONE_INTEGER );
              }
              catch( final Throwable catch_var )
              {
                Errors.handleThrowable( catch_var, NIL );
              }
            }
            finally
            {
              Errors.$error_handler$.rebind( _prev_bind_0_$3, thread );
            }
          }
          catch( final Throwable ccatch_env_var )
          {
            err = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          }
          finally
          {
            thread.throwStack.pop();
          }
          if( NIL != err && NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) && NIL == pph_error.suppress_pph_warningsP() )
          {
            Errors.warn( $str110$error_while_destroying_phrase___S, err );
            streams_high.force_output( StreamsLow.$error_output$.getDynamicValue( thread ) );
          }
        }
        stacks.stack_pop( $new_pph_phrases$.getDynamicValue( thread ) );
      }
      finally
      {
        $inside_destroy_new_pph_phrasesP$.rebind( _prev_bind_0, thread );
      }
    }
    if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
    {
      format_nil.force_format( T, $str111$Destroyed__S_PPH_phrases____New_o, count, pph_data_structures.pph_phrase_id_index_new_objects_count(), pph_data_structures.pph_phrase_id_index_new_objects_size(), UNPROVIDED,
          UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 15769L)
  public static SubLObject destroying_new_pph_phrases_when_done(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym4$CLET, $list112, ConsesLow.listS( $sym96$CUNWIND_PROTECT, reader.bq_cons( $sym1$PROGN, ConsesLow.append( body, NIL ) ), $list113 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 16145L)
  public static SubLObject get_new_pph_phrase_count()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != misc_utilities.initialized_p( $new_pph_phrase_count$.getDynamicValue( thread ) ) ) ? $new_pph_phrase_count$.getDynamicValue( thread ) : ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 16322L)
  public static SubLObject possibly_destroying_new_pph_phrases_when_done(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list115 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject destroyP = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list115 );
    destroyP = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject matrix_new_pph_phrases = $sym116$MATRIX_NEW_PPH_PHRASES;
      final SubLObject phrase = $sym117$PHRASE;
      return ConsesLow.list( $sym4$CLET, ConsesLow.list( reader.bq_cons( matrix_new_pph_phrases, $list118 ), $list119, $list120, reader.bq_cons( destroyP, $list121 ) ), ConsesLow.list( $sym96$CUNWIND_PROTECT, reader
          .bq_cons( $sym1$PROGN, ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym122$PIF, destroyP, $list123, ConsesLow.list( $sym124$DO_STACK_ELEMENTS, reader.bq_cons( phrase, $list118 ), ConsesLow.list(
              $sym125$STACK_PUSH, phrase, matrix_new_pph_phrases ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list115 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 16974L)
  public static SubLObject ensuring_pph_discourse_context(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym1$PROGN, ConsesLow.list( $sym122$PIF, $list126, ConsesLow.listS( $sym1$PROGN, $list127, ConsesLow.append( body, NIL ) ), reader.bq_cons( $sym128$WITHIN_NEW_PPH_DISCOURSE_CONTEXT, ConsesLow
        .append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 17342L)
  public static SubLObject within_new_pph_discourse_context(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym4$CLET, $list130, $list131, ConsesLow.listS( $sym96$CUNWIND_PROTECT, ConsesLow.listS( $sym1$PROGN, $list127, ConsesLow.append( body, NIL ) ), $list132 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 17857L)
  public static SubLObject herald_new_discourse_context()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != pph_error.pph_trace_level_exceeds_minimumP( TWO_INTEGER ) )
    {
      format_nil.force_format( T, $str134$__Entering_WITHIN_NEW_PPH_DISCOUR, pph_vars.$pph_discourse_context$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
          UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 18094L)
  public static SubLObject herald_end_of_discourse_context()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != pph_error.pph_trace_level_exceeds_minimumP( TWO_INTEGER ) )
    {
      format_nil.force_format( T, $str136$__Leaving_WITHIN_NEW_PPH_DISCOURS, pph_vars.$pph_discourse_context$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
          UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 18333L)
  public static SubLObject pph_discourse_context_initializedP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return pph_drs.pph_discourse_context_p( pph_vars.$pph_discourse_context$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 18494L)
  public static SubLObject clear_pph_discourse_context()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    pph_vars.$pph_discourse_context$.setDynamicValue( NIL, thread );
    return pph_vars.$pph_discourse_context$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 18662L)
  public static SubLObject with_shadowed_discourse_context(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list139 );
    final SubLObject temp = current.rest();
    current = current.first();
    final SubLObject new_rms_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list139 );
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list139 );
      return NIL;
    }
    final SubLObject body;
    current = ( body = temp );
    if( NIL != subl_promotions.memberP( $kw140$CYC_LEXICON, reader.$features$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) )
    {
      final SubLObject matrix_rms = $sym141$MATRIX_RMS;
      final SubLObject last_clause = $str142$NIL.equal( Symbols.symbol_name( new_rms_var ) ) ? ConsesLow.list( $sym143$IGNORE, matrix_rms )
          : ConsesLow.list( $sym144$CSETQ, new_rms_var, ConsesLow.list( $sym145$NOTE_LEAVING_SHADOWED_DISCOURSE_CONTEXT, $sym146$_PPH_DISCOURSE_CONTEXT_, matrix_rms ) );
      return ConsesLow.listS( $sym4$CLET, reader.bq_cons( reader.bq_cons( matrix_rms, $list147 ), $list148 ), $list149, ConsesLow.append( body, ConsesLow.list( last_clause ) ) );
    }
    return reader.bq_cons( $sym1$PROGN, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 19344L)
  public static SubLObject note_leaving_shadowed_discourse_context(final SubLObject v_context, final SubLObject matrix_rms)
  {
    if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
    {
      format_nil.force_format( T, $str151$__Leaving__S, v_context, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    SubLObject new_rms = NIL;
    new_rms = conses_high.set_difference( pph_drs.pph_discourse_context_rms( v_context ), matrix_rms, UNPROVIDED, UNPROVIDED );
    if( NIL != new_rms && NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
    {
      format_nil.force_format( T, $str152$New_RMS___S, new_rms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return new_rms;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 19784L)
  public static SubLObject with_pph_speaker_and_addressee(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list153 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject speaker = NIL;
    SubLObject addressee = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list153 );
    speaker = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list153 );
    addressee = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym4$CLET, ConsesLow.list( ConsesLow.list( $sym154$_PPH_SPEAKER_, speaker ), ConsesLow.list( $sym155$_PPH_ADDRESSEE_, addressee ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list153 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 20074L)
  public static SubLObject do_pph_output_list(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list156 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject string = NIL;
    SubLObject output_list = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list156 );
    string = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list156 );
    output_list = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$4 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list156 );
      current_$4 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list156 );
      if( NIL == conses_high.member( current_$4, $list157, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$4 == $kw158$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list156 );
    }
    final SubLObject paranoid_arg_tail = cdestructuring_bind.property_list_member( $kw159$PARANOID_ARG, current );
    final SubLObject paranoid_arg = ( NIL != paranoid_arg_tail ) ? conses_high.cadr( paranoid_arg_tail ) : $sym160$PARANOID_ARG;
    final SubLObject output_item_tail = cdestructuring_bind.property_list_member( $kw161$OUTPUT_ITEM, current );
    final SubLObject output_item = ( NIL != output_item_tail ) ? conses_high.cadr( output_item_tail ) : $sym162$OUTPUT_ITEM;
    final SubLObject arg_position_tail = cdestructuring_bind.property_list_member( $kw163$ARG_POSITION, current );
    final SubLObject arg_position = ( NIL != arg_position_tail ) ? conses_high.cadr( arg_position_tail ) : $sym164$ARG_POSITION;
    final SubLObject html_open_tag_tail = cdestructuring_bind.property_list_member( $kw165$HTML_OPEN_TAG, current );
    final SubLObject html_open_tag = ( NIL != html_open_tag_tail ) ? conses_high.cadr( html_open_tag_tail ) : $sym166$HTML_OPEN_TAG;
    final SubLObject html_close_tag_tail = cdestructuring_bind.property_list_member( $kw167$HTML_CLOSE_TAG, current );
    final SubLObject html_close_tag = ( NIL != html_close_tag_tail ) ? conses_high.cadr( html_close_tag_tail ) : $sym168$HTML_CLOSE_TAG;
    final SubLObject start_char_index_tail = cdestructuring_bind.property_list_member( $kw169$START_CHAR_INDEX, current );
    final SubLObject start_char_index = ( NIL != start_char_index_tail ) ? conses_high.cadr( start_char_index_tail ) : $sym170$START_CHAR_INDEX;
    final SubLObject whole_string_tail = cdestructuring_bind.property_list_member( $kw171$WHOLE_STRING, current );
    final SubLObject whole_string = ( NIL != whole_string_tail ) ? conses_high.cadr( whole_string_tail ) : $sym172$WHOLE_STRING;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject item = $sym173$ITEM;
    final SubLObject whole_html_string = $sym174$WHOLE_HTML_STRING;
    final SubLObject end_char_index = $sym175$END_CHAR_INDEX;
    final SubLObject iterator = $sym176$ITERATOR;
    return ConsesLow.list( $sym1$PROGN, ConsesLow.listS( $sym6$CHECK_TYPE, output_list, $list177 ), ConsesLow.list( $sym4$CLET, ConsesLow.list( reader.bq_cons( start_char_index, $list178 ), reader.bq_cons(
        end_char_index, $list178 ), ConsesLow.list( whole_html_string, ConsesLow.listS( $sym179$PPH_PHRASE_OUTPUT_LIST_STRING, output_list, $list180 ) ), ConsesLow.list( whole_string, ConsesLow.listS(
            $sym181$PPH_REMOVE_HTML_TAGS, whole_html_string, $list121 ) ), ConsesLow.list( iterator, ConsesLow.list( $sym182$NEW_PPH_PHRASE_OUTPUT_LIST_ITERATOR, output_list ) ) ), ConsesLow.list( $sym183$UNTIL,
                ConsesLow.list( $sym184$PPH_PHRASE_OUTPUT_LIST_ITERATOR_EMPTY_P, iterator ), ConsesLow.list( $sym4$CLET, ConsesLow.list( ConsesLow.list( item, ConsesLow.list( $sym185$PPH_PHRASE_OUTPUT_LIST_ITERATOR_NEXT,
                    iterator ) ) ), ConsesLow.listS( $sym186$DO_ONE_PPH_OUTPUT_LIST_ITEM, ConsesLow.list( new SubLObject[]
                    { item, string, arg_position, html_open_tag, html_close_tag, paranoid_arg, output_item, whole_string, start_char_index, end_char_index
                } ), ConsesLow.append( body, NIL ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 21902L)
  public static SubLObject do_one_pph_output_list_item(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list188 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject item = NIL;
    SubLObject string = NIL;
    SubLObject arg_position = NIL;
    SubLObject html_open_tag = NIL;
    SubLObject html_close_tag = NIL;
    SubLObject paranoid_arg = NIL;
    SubLObject output_item = NIL;
    SubLObject whole_string = NIL;
    SubLObject start_char_index = NIL;
    SubLObject end_char_index = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list188 );
    item = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list188 );
    string = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list188 );
    arg_position = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list188 );
    html_open_tag = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list188 );
    html_close_tag = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list188 );
    paranoid_arg = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list188 );
    output_item = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list188 );
    whole_string = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list188 );
    start_char_index = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list188 );
    end_char_index = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym1$PROGN, ConsesLow.listS( $sym189$PPH_MAYBE_DO_SPACE_ITEM, ConsesLow.list( new SubLObject[] { item, string, arg_position, html_open_tag, html_close_tag, paranoid_arg, output_item,
        whole_string, start_char_index, end_char_index
      } ), ConsesLow.append( body, NIL ) ), ConsesLow.listS( $sym190$WITH_PPH_REGULAR_OUTPUT_ITEM_BINDINGS, ConsesLow.list( item, string, arg_position, html_open_tag, html_close_tag, paranoid_arg, output_item ),
          ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list188 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 22540L)
  public static SubLObject pph_maybe_do_space_item(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list188 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject item = NIL;
    SubLObject string = NIL;
    SubLObject arg_position = NIL;
    SubLObject html_open_tag = NIL;
    SubLObject html_close_tag = NIL;
    SubLObject paranoid_arg = NIL;
    SubLObject output_item = NIL;
    SubLObject whole_string = NIL;
    SubLObject start_char_index = NIL;
    SubLObject end_char_index = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list188 );
    item = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list188 );
    string = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list188 );
    arg_position = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list188 );
    html_open_tag = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list188 );
    html_close_tag = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list188 );
    paranoid_arg = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list188 );
    output_item = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list188 );
    whole_string = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list188 );
    start_char_index = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list188 );
    end_char_index = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject raw_item_string = $sym191$RAW_ITEM_STRING;
      return ConsesLow.list( $sym4$CLET, ConsesLow.list( ConsesLow.list( raw_item_string, ConsesLow.listS( $sym192$PPH_PHRASE_OUTPUT_ITEM_GET_STRING, item, $list121 ) ) ), ConsesLow.list( $sym144$CSETQ, start_char_index,
          ConsesLow.list( $sym193$PPH_OUTPUT_LIST_FIND_START_CHAR, raw_item_string, whole_string, end_char_index ) ), ConsesLow.list( $sym58$PWHEN, ConsesLow.list( $sym194$_, start_char_index, end_char_index ), ConsesLow
              .listS( $sym4$CLET, ConsesLow.list( ConsesLow.list( string, ConsesLow.list( $sym195$PPH_MAKE_SPACE_STRING, start_char_index, end_char_index ) ), reader.bq_cons( arg_position, $list196 ), reader.bq_cons(
                  html_open_tag, $list121 ), reader.bq_cons( html_close_tag, $list121 ), reader.bq_cons( paranoid_arg, $list197 ), ConsesLow.list( output_item, ConsesLow.list( $sym198$NEW_PPH_PHRASE_FILLER_ITEM,
                      string ) ), ConsesLow.list( start_char_index, end_char_index ) ), ConsesLow.list( $sym143$IGNORE, paranoid_arg, output_item, arg_position, html_open_tag, html_close_tag, start_char_index ),
                  ConsesLow.append( body, NIL ) ) ), ConsesLow.list( $sym144$CSETQ, end_char_index, ConsesLow.list( $sym199$PPH_UPDATE_END_CHAR_INDEX, start_char_index, raw_item_string ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list188 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 23733L)
  public static SubLObject pph_update_end_char_index(final SubLObject start_char_index, final SubLObject raw_item_string)
  {
    return Numbers.add( start_char_index, Sequences.length( raw_item_string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 23901L)
  public static SubLObject pph_make_space_string(final SubLObject start_char_index, final SubLObject end_char_index)
  {
    final SubLObject length = Numbers.subtract( start_char_index, end_char_index );
    if( length.numG( ONE_INTEGER ) )
    {
      final SubLObject new_format_string = Sequences.cconcatenate( $str101$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str102$__, format_nil.format_nil_a_no_copy(
          $str200$Adding_space_string_of_length__S )
      } );
      pph_error.pph_handle_error( new_format_string, ConsesLow.list( length ) );
    }
    return Strings.make_string( length, Characters.CHAR_space );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 24197L)
  public static SubLObject with_pph_regular_output_item_bindings(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list201 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject item = NIL;
    SubLObject string = NIL;
    SubLObject arg_position = NIL;
    SubLObject html_open_tag = NIL;
    SubLObject html_close_tag = NIL;
    SubLObject paranoid_arg = NIL;
    SubLObject output_item = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list201 );
    item = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list201 );
    string = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list201 );
    arg_position = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list201 );
    html_open_tag = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list201 );
    html_close_tag = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list201 );
    paranoid_arg = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list201 );
    output_item = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym4$CLET, ConsesLow.list( ConsesLow.list( string, ConsesLow.listS( $sym192$PPH_PHRASE_OUTPUT_ITEM_GET_STRING, item, $list121 ) ), ConsesLow.list( arg_position, ConsesLow.list(
          $sym202$PPH_PHRASE_OUTPUT_ITEM_ARG_POSITION, item ) ), ConsesLow.list( html_open_tag, ConsesLow.list( $sym203$PPH_PHRASE_OUTPUT_ITEM_HTML_OPEN_TAG, item ) ), ConsesLow.list( html_close_tag, ConsesLow.list(
              $sym204$PPH_PHRASE_OUTPUT_ITEM_HTML_CLOSE_TAG, item ) ), ConsesLow.list( paranoid_arg, ConsesLow.list( $sym205$PPH_PHRASE_OUTPUT_ITEM_CYCL, item ) ), ConsesLow.list( output_item, item ) ), ConsesLow.list(
                  $sym143$IGNORE, paranoid_arg, output_item, arg_position, html_open_tag, html_close_tag ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list201 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 24956L)
  public static SubLObject pph_output_list_find_start_char(final SubLObject string, final SubLObject whole_string, final SubLObject previous_end_char_index)
  {
    assert NIL != pph_string.pph_string_p( string ) : string;
    final SubLObject tagless_string = pph_utilities.pph_remove_html_tags( string, UNPROVIDED );
    final SubLObject ans = ( NIL != list_utilities.lengthG( tagless_string, ZERO_INTEGER, UNPROVIDED ) ) ? pph_string.pph_string_position( pph_string.pph_string_char( tagless_string, ZERO_INTEGER ), whole_string, Symbols
        .symbol_function( $sym207$PPH_CHAR__ ), Symbols.symbol_function( IDENTITY ), previous_end_char_index, UNPROVIDED ) : previous_end_char_index;
    if( !ans.isInteger() )
    {
      final SubLObject new_format_string = Sequences.cconcatenate( $str101$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str102$__, format_nil.format_nil_a_no_copy(
          $str208$Couldn_t_find__S_in__S___ )
      } );
      pph_error.pph_handle_error( new_format_string, ConsesLow.list( pph_string.pph_string_if_non_null_to_output_format( string, UNPROVIDED ), pph_string.pph_string_if_non_null_to_output_format( pph_string.pph_substring(
          whole_string, previous_end_char_index, UNPROVIDED ), UNPROVIDED ) ) );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 25947L)
  public static SubLObject do_pph_javalist_items(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list209 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject item = NIL;
    SubLObject javalist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list209 );
    item = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list209 );
    javalist = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$5 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list209 );
      current_$5 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list209 );
      if( NIL == conses_high.member( current_$5, $list210, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$5 == $kw158$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list209 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw211$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym212$CSOME, ConsesLow.list( item, ConsesLow.list( $sym213$PPH_NJAVALIST_ITEMS, javalist ), done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 26248L)
  public static SubLObject with_pph_disambiguation_partial_results_accumulation(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list215 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject ans = NIL;
    SubLObject threshold = NIL;
    SubLObject notification_function_spec = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list215 );
    ans = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list215 );
    threshold = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list215 );
    notification_function_spec = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$6 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list215 );
      current_$6 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list215 );
      if( NIL == conses_high.member( current_$6, $list216, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$6 == $kw158$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list215 );
    }
    final SubLObject return_style_tail = cdestructuring_bind.property_list_member( $kw217$RETURN_STYLE, current );
    final SubLObject return_style = ( NIL != return_style_tail ) ? conses_high.cadr( return_style_tail ) : $kw218$JAVALISTS;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym4$CLET, ConsesLow.list( $list219, $list220, $list221, ConsesLow.list( $sym222$_PARTIAL_RESULTS_NOTIFICATION_FN_, notification_function_spec ), $list223, ConsesLow.list(
        $sym224$_PPH_DISAMBIGUATION_MODE_RETURN_STYLE_, return_style ) ), ConsesLow.listS( $sym225$WITH_PARTIAL_RESULTS_ACCUMULATION, ConsesLow.list( ans, threshold ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 27155L)
  public static SubLObject initialize_disambiguation_phrases()
  {
    return dictionary.new_dictionary( Symbols.symbol_function( EQL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 27364L)
  public static SubLObject accumulate_disambiguation_phrases(final SubLObject result)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != pph_disambiguation.incremental_pph_disambiguation_result_p( result ) : result;
    final SubLObject index = pph_disambiguation.incremental_pph_disambiguation_result_index( result );
    final SubLObject output_list = pph_disambiguation.incremental_pph_disambiguation_result_output_list( result );
    SubLObject formatted_result_value = NIL;
    final SubLObject pcase_var = $pph_disambiguation_mode_return_style$.getDynamicValue( thread );
    if( pcase_var.eql( $kw218$JAVALISTS ) )
    {
      formatted_result_value = pph_utilities.pph_output_list_to_javalist( output_list );
    }
    else
    {
      final SubLObject new_format_string = Sequences.cconcatenate( $str101$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( $str227$Don_t_know_how_to_accumulate__S_a ), $str102$__, format_nil
          .format_nil_a_no_copy( $pph_disambiguation_mode_return_style$.getDynamicValue( thread ) )
      } );
      pph_error.pph_handle_error( new_format_string, ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY ) );
    }
    add_pph_disambiguation_result_to_accumulator( index, formatted_result_value, utilities_macros.$partial_results_accumulator$.getDynamicValue( thread ) );
    return utilities_macros.$partial_results_accumulator$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 28125L)
  public static SubLObject add_pph_disambiguation_result_to_accumulator(final SubLObject index, final SubLObject formatted_result_value, final SubLObject accumulator)
  {
    dictionary.dictionary_enter( accumulator, index, formatted_result_value );
    return accumulator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 28313L)
  public static SubLObject consolidate_disambiguation_phrases(final SubLObject accumulated_results)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( accumulated_results ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject index = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject formatted_result_value = thread.secondMultipleValue();
      thread.resetMultipleValues();
      add_pph_disambiguation_result_to_accumulator( index, formatted_result_value, utilities_macros.$partial_results_total_accumulator$.getDynamicValue( thread ) );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 28657L)
  public static SubLObject final_results_for_disambiguation_phrases(final SubLObject total_results)
  {
    return list_utilities.alist_values( dictionary_utilities.sort_dictionary_by_keys( total_results, Symbols.symbol_function( $sym228$_ ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 28870L)
  public static SubLObject gathering_pph_problems(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list229 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject problem_dictionary_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list229 );
    problem_dictionary_var = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject matrix_problem_dictionary = $sym230$MATRIX_PROBLEM_DICTIONARY;
      return ConsesLow.list( $sym1$PROGN, ConsesLow.listS( $sym144$CSETQ, problem_dictionary_var, $list231 ), ConsesLow.listS( $sym4$CLET, ConsesLow.list( reader.bq_cons( matrix_problem_dictionary, $list232 ), $list233,
          ConsesLow.list( $sym234$_PPH_PROBLEM_REPORTS_, problem_dictionary_var ) ), ConsesLow.append( body, ConsesLow.list( ConsesLow.list( $sym58$PWHEN, ConsesLow.list( $sym235$DICTIONARY_P,
              matrix_problem_dictionary ), ConsesLow.list( $sym236$PPH_MERGE_PROBLEM_DICTIONARY, $sym234$_PPH_PROBLEM_REPORTS_, matrix_problem_dictionary ) ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list229 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 29946L)
  public static SubLObject with_pph_timeout(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list237 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject timed_outP = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list237 );
    timed_outP = current.first();
    current = current.rest();
    final SubLObject delay_in_seconds = current.isCons() ? current.first() : pph_timeout();
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list237 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym4$CLET, ConsesLow.listS( $list238, ConsesLow.list( $sym239$_PPH_TIMEOUT_TIME_, ConsesLow.list( $sym240$PPH_COMPUTE_TIMEOUT_TIME, delay_in_seconds ) ), $list241 ), $list242, ConsesLow
          .listS( $sym97$PUNLESS, $sym243$_PPH_TIMEOUT_REACHED__, ConsesLow.append( body, NIL ) ), ConsesLow.listS( $sym144$CSETQ, timed_outP, $list244 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list237 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 30780L)
  public static SubLObject pph_timeout_time_reachedP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !$pph_timeout_time$.getDynamicValue( thread ).isNumber() )
    {
      return NIL;
    }
    if( NIL != $pph_timeout_reachedP$.getDynamicValue( thread ) )
    {
      return T;
    }
    if( pph_timeout_current_time().numGE( $pph_timeout_time$.getDynamicValue( thread ) ) )
    {
      $pph_timeout_reachedP$.setDynamicValue( T, thread );
      Errors.warn( $str245$PPH_timeout_reached_ );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 31142L)
  public static SubLObject pph_timeout_current_time()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $pph_timeout_time_check_count$.setDynamicValue( Numbers.add( $pph_timeout_time_check_count$.getDynamicValue( thread ), ONE_INTEGER ), thread );
    return Time.get_internal_real_time();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 31263L)
  public static SubLObject pph_compute_timeout_time(final SubLObject delay_in_seconds)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !delay_in_seconds.isNumber() )
    {
      return $pph_timeout_time$.getDynamicValue( thread );
    }
    final SubLObject current_time = pph_timeout_current_time();
    final SubLObject offset = Numbers.floor( Numbers.multiply( delay_in_seconds, time_high.$internal_time_units_per_second$.getGlobalValue() ), UNPROVIDED );
    return number_utilities.minimum( Sequences.remove( NIL, ConsesLow.list( $pph_timeout_time$.getDynamicValue( thread ), Numbers.add( current_time, offset ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 31635L)
  public static SubLObject pph_timeout()
  {
    final SubLObject allowable_time = pph_allowable_time();
    return ( NIL != number_utilities.positive_number_p( allowable_time ) ) ? allowable_time : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 31822L)
  public static SubLObject pph_allowable_time()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != pph_vars.pph_failure_is_an_option_p() )
    {
      return $pph_default_timeout$.getDynamicValue( thread );
    }
    return number_utilities.positive_infinity();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 32068L)
  public static SubLObject noting_unexpressed_negations(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    final SubLObject already_initializedP = $sym248$ALREADY_INITIALIZED_;
    return ConsesLow.listS( $sym4$CLET, ConsesLow.list( reader.bq_cons( already_initializedP, $list249 ), ConsesLow.list( $sym250$_PPH_UNEXPRESSED_NEGATIONS_, ConsesLow.listS( $sym31$FIF, already_initializedP,
        $list251 ) ) ), ConsesLow.append( body, ConsesLow.list( ConsesLow.listS( $sym97$PUNLESS, ConsesLow.listS( $sym252$COR, already_initializedP, $list253 ), $list254 ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 32608L)
  public static SubLObject possibly_with_pph_language_mt(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject generation_mt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list255 );
    generation_mt = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym4$CLET, ConsesLow.list( ConsesLow.list( $sym256$_PPH_LANGUAGE_MT_, ConsesLow.listS( $sym31$FIF, generation_mt, ConsesLow.list( $sym257$PPH_CANONICALIZE_HLMT, generation_mt ),
        $list258 ) ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 32821L)
  public static SubLObject possibly_with_pph_domain_mt(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject domain_mt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list259 );
    domain_mt = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym4$CLET, ConsesLow.list( ConsesLow.list( $sym260$_PPH_DOMAIN_MT_, ConsesLow.listS( $sym31$FIF, domain_mt, ConsesLow.list( $sym257$PPH_CANONICALIZE_HLMT, domain_mt ), $list261 ) ) ),
        ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 33016L)
  public static SubLObject with_language_and_domain_mts(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list262 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject generation_mt = NIL;
    SubLObject domain_mt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list262 );
    generation_mt = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list262 );
    domain_mt = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym263$POSSIBLY_WITH_PPH_LANGUAGE_MT, generation_mt, ConsesLow.listS( $sym264$POSSIBLY_WITH_PPH_DOMAIN_MT, domain_mt, ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list262 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 33219L)
  public static SubLObject with_pph_language_mt_relevance(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list265 );
    final SubLObject temp = current.rest();
    current = current.first();
    final SubLObject broadenP = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list265 );
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list265 );
      return NIL;
    }
    final SubLObject body;
    current = ( body = temp );
    if( NIL == broadenP )
    {
      return ConsesLow.listS( $sym266$WITH_INFERENCE_MT_RELEVANCE, $sym256$_PPH_LANGUAGE_MT_, ConsesLow.append( body, NIL ) );
    }
    final SubLObject broadened_language_mt = $sym267$BROADENED_LANGUAGE_MT;
    return ConsesLow.list( $sym1$PROGN, ConsesLow.listS( $sym268$WITH_PPH_LANGUAGE_MT_RELEVANCE, NIL, ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym58$PWHEN, broadenP, ConsesLow.list( $sym4$CLET, ConsesLow.list(
        reader.bq_cons( broadened_language_mt, $list269 ) ), ConsesLow.list( $sym97$PUNLESS, ConsesLow.listS( $sym270$HLMT_EQUAL_, broadened_language_mt, $list258 ), ConsesLow.list( $sym4$CLET, ConsesLow.list( ConsesLow
            .list( $sym256$_PPH_LANGUAGE_MT_, broadened_language_mt ) ), $list271, ConsesLow.listS( $sym266$WITH_INFERENCE_MT_RELEVANCE, $sym256$_PPH_LANGUAGE_MT_, ConsesLow.append( body, NIL ) ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 34070L)
  public static SubLObject with_pph_domain_and_language_mt_union_relevance(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym266$WITH_INFERENCE_MT_RELEVANCE, $list272, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 34340L)
  public static SubLObject do_pph_phrase_fns(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list273 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject fn = NIL;
    SubLObject mt = NIL;
    SubLObject done = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list273 );
    fn = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list273 );
    mt = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list273 );
    done = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym274$DO_DICTIONARY, ConsesLow.listS( fn, mt, $list275 ), ConsesLow.listS( $sym97$PUNLESS, ConsesLow.list( $sym252$COR, done, ConsesLow.listS( EQ, fn, $list276 ) ), ConsesLow.append( body,
          NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list273 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 34516L)
  public static SubLObject possibly_suspending_pph_bullets(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list277 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject okP = NIL;
    SubLObject v_object = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list277 );
    okP = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list277 );
    v_object = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject suspendP = $sym278$SUSPEND_;
      return ConsesLow.listS( $sym4$CLET, ConsesLow.list( ConsesLow.list( suspendP, ConsesLow.list( $sym47$CAND, $sym279$_PPH_USE_BULLETED_LISTS__, ConsesLow.list( $sym49$CNOT, okP ) ) ), ConsesLow.list(
          $sym279$_PPH_USE_BULLETED_LISTS__, ConsesLow.list( $sym47$CAND, $sym279$_PPH_USE_BULLETED_LISTS__, okP ) ) ), ConsesLow.list( $sym58$PWHEN, suspendP, ConsesLow.list( $sym280$PPH_NOTE, ONE_INTEGER,
              $str281$__Suspending_bullet_use_for____S_, v_object ) ), ConsesLow.append( body, ConsesLow.list( ConsesLow.listS( $sym58$PWHEN, suspendP, $list282 ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list277 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 34939L)
  public static SubLObject with_pph_demerit_cutoff(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list283 );
    final SubLObject temp = current.rest();
    current = current.first();
    final SubLObject cutoff = current.isCons() ? current.first() : pph_vars.$pph_suggested_demerit_cutoff$.getGlobalValue();
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list283 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym1$PROGN, ConsesLow.listS( $sym284$PPH_CHECK_TYPE, cutoff, $list285 ), ConsesLow.listS( $sym4$CLET, ConsesLow.list( ConsesLow.list( $sym286$_PPH_DEMERIT_CUTOFF_, cutoff ) ), ConsesLow
          .append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list283 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 35361L)
  public static SubLObject with_maximum_pph_demerit_cutoff(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list283 );
    final SubLObject temp = current.rest();
    current = current.first();
    final SubLObject cutoff = current.isCons() ? current.first() : pph_vars.$pph_suggested_demerit_cutoff$.getGlobalValue();
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list283 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym1$PROGN, ConsesLow.listS( $sym284$PPH_CHECK_TYPE, cutoff, $list285 ), ConsesLow.listS( $sym4$CLET, ConsesLow.list( ConsesLow.list( $sym286$_PPH_DEMERIT_CUTOFF_, ConsesLow.list(
          $sym287$COMPUTE_NEW_PPH_DEMERIT_CUTOFF, cutoff ) ) ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list283 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 35880L)
  public static SubLObject valid_pph_demerit_cutoff_p(final SubLObject v_object)
  {
    return number_utilities.non_negative_potentially_infinite_number_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 35996L)
  public static SubLObject compute_new_pph_demerit_cutoff(final SubLObject maximum)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject cutoffs = list_utilities.remove_if_not( Symbols.symbol_function( $sym289$INTEGERP ), ConsesLow.list( maximum, pph_vars.$pph_demerit_cutoff$.getDynamicValue( thread ) ), UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED );
    return ( NIL != cutoffs ) ? number_utilities.minimum( cutoffs, UNPROVIDED ) : number_utilities.positive_infinity();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 36263L)
  public static SubLObject with_pph_phrase_destruction_grace_period(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list290 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject seconds = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list290 );
    seconds = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject old_grace_period = $sym291$OLD_GRACE_PERIOD;
      return ConsesLow.list( $sym4$CLET, ConsesLow.list( reader.bq_cons( old_grace_period, $list292 ) ), ConsesLow.list( $sym96$CUNWIND_PROTECT, ConsesLow.list( $sym1$PROGN, ConsesLow.list(
          $sym293$SET_PPH_PHRASE_DESTRUCTION_GRACE_PERIOD, ConsesLow.list( $sym294$MAX, old_grace_period, seconds ) ), ConsesLow.listS( $sym4$CLET, $list295, ConsesLow.append( body, NIL ) ) ) ), ConsesLow.list(
              $sym293$SET_PPH_PHRASE_DESTRUCTION_GRACE_PERIOD, old_grace_period ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list290 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 36839L)
  public static SubLObject remembering_pph_proofs(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym4$CLET, $list296, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 37185L)
  public static SubLObject with_pph_inference_answer(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list297 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject inference_answer = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list297 );
    inference_answer = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym4$CLET, ConsesLow.list( ConsesLow.list( $sym298$_PPH_INFERENCE_ANSWER_, inference_answer ) ), ConsesLow.listS( $sym299$WITH_PPH_INFERENCE, ConsesLow.list( ConsesLow.list(
          $sym300$INFERENCE_ANSWER_INFERENCE, inference_answer ) ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list297 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 37414L)
  public static SubLObject with_pph_inference(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list301 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject inference = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list301 );
    inference = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym4$CLET, ConsesLow.list( ConsesLow.list( $sym302$_PPH_HYPOTHETICAL_VARS_, ConsesLow.list( $sym303$INFERENCE_HYPOTHETICAL_BINDINGS, inference ) ), $list304, ConsesLow.list(
          $sym260$_PPH_DOMAIN_MT_, ConsesLow.list( $sym305$PPH_ENHANCED_DOMAIN_MT, ConsesLow.list( $sym306$PPH_GET_INFERENCE_MT, inference ) ) ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list301 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 37711L)
  public static SubLObject with_pph_justification_generation_parameters(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list297 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject inference_answer = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list297 );
    inference_answer = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym307$WITH_PPH_INFERENCE_ANSWER, ConsesLow.list( inference_answer ), ConsesLow.list( $sym4$CLET, $list308, reader.bq_cons(
          $sym309$POSSIBLY_WITH_PPH_HTML_JUSTIFICATION_GENERATION_PARAMETERS, ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list297 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 38223L)
  public static SubLObject possibly_with_pph_html_justification_generation_parameters(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    final SubLObject link_function = $sym310$LINK_FUNCTION;
    final SubLObject html_target = $sym311$HTML_TARGET;
    return ConsesLow.list( $sym52$CMULTIPLE_VALUE_BIND, ConsesLow.list( link_function, html_target ), $list312, ConsesLow.listS( $sym313$WITH_PPH_HTML_FUNCTION_AND_TARGET, ConsesLow.list( link_function, html_target ),
        ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 38621L)
  public static SubLObject pph_possibly_enable_showXhide()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != pph_vars.$pph_use_showXhideP$.getDynamicValue( thread ) )
    {
      dhtml_macros.dhtml_with_dom_script();
      dhtml_macros.dhtml_with_toggle_visibility_support();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 38822L)
  public static SubLObject pph_justification_html_function_and_target()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject link_function = pph_vars.$constant_link_function$.getDynamicValue( thread );
    final SubLObject target = pph_vars.$html_generation_target$.getDynamicValue( thread );
    return Values.values( link_function, target );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 39307L)
  public static SubLObject pph_setting_var_types_if_successful(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list316 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject phrase = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list316 );
    phrase = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject var_types_shadow = $sym317$VAR_TYPES_SHADOW;
      return ConsesLow.list( $sym4$CLET, reader.bq_cons( reader.bq_cons( var_types_shadow, $list318 ), $list319 ), $list320, ConsesLow.list( $sym96$CUNWIND_PROTECT, ConsesLow.listS( $sym4$CLET, ConsesLow.list( ConsesLow
          .list( $sym321$_PPH_VAR_TYPES_, var_types_shadow ) ), ConsesLow.append( body, NIL ) ), $list322, ConsesLow.listS( $sym122$PIF, ConsesLow.list( $sym323$PPH_PHRASE_DONE_, phrase ), ConsesLow.list( $sym1$PROGN,
              $list324, ConsesLow.list( $sym280$PPH_NOTE, ONE_INTEGER, $str325$___Setting__S_to____S, $sym321$_PPH_VAR_TYPES_, ConsesLow.list( $sym326$DICTIONARY_VALUES, var_types_shadow ) ), ConsesLow.list(
                  $sym327$PPH_RESET_VAR_TYPES, var_types_shadow ) ), $list328 ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list316 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 40618L)
  public static SubLObject pph_reset_var_types(final SubLObject var_types_shadow)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    pph_variable_handling.clear_pph_var_types();
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( var_types_shadow ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject var = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject var_entry = thread.secondMultipleValue();
      thread.resetMultipleValues();
      dictionary.dictionary_enter( pph_vars.$pph_var_types$.getDynamicValue( thread ), var, var_entry );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return pph_vars.$pph_var_types$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 40879L)
  public static SubLObject pph_possibly_binding_variables(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    final SubLObject old_pph_vars = $sym330$OLD_PPH_VARS;
    return ConsesLow.list( $sym4$CLET, ConsesLow.listS( $list331, reader.bq_cons( old_pph_vars, $list332 ), $list333 ), $list334, ConsesLow.list( $sym96$CUNWIND_PROTECT, reader.bq_cons( $sym1$PROGN, ConsesLow.append(
        body, NIL ) ), ConsesLow.listS( $sym4$CLET, ConsesLow.list( ConsesLow.list( $sym335$LOCAL_VARS, ConsesLow.list( $sym336$SET_DIFFERENCE, $list337, old_pph_vars ) ) ), $list338 ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 42056L)
  public static SubLObject pph_handle_local_vars(final SubLObject local_vars)
  {
    SubLObject cdolist_list_var = local_vars;
    SubLObject var = NIL;
    var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != pph_error.pph_trace_level_exceeds_minimumP( TWO_INTEGER ) )
      {
        format_nil.force_format( T, $str341$__Deregistering__S__, var, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      pph_variable_handling.pph_deregister_var( var );
      pph_drs.pph_remove_rm_with_cycl( var );
      cdolist_list_var = cdolist_list_var.rest();
      var = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 42304L)
  public static SubLObject destructure_pph_pronoun_agr(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list342 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject person = NIL;
    SubLObject number = NIL;
    SubLObject gender = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list342 );
    person = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list342 );
    number = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list342 );
    gender = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      SubLObject pronoun_agr = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list342 );
      pronoun_agr = current.first();
      final SubLObject body;
      current = ( body = current.rest() );
      return ConsesLow.listS( $sym343$CDESTRUCTURING_BIND, ConsesLow.list( person, number, gender ), pronoun_agr, ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list342 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 42482L)
  public static SubLObject pph_phrase_do_agr_constraints(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list344 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject agr_constraint = NIL;
    SubLObject phrase = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list344 );
    agr_constraint = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list344 );
    phrase = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym4$CLET, ConsesLow.list( ConsesLow.list( agr_constraint, ConsesLow.list( $sym345$PPH_PHRASE_AGR, phrase ) ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list344 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 42642L)
  public static SubLObject do_pph_phrase_templates_for_formula(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list346 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject template = NIL;
    SubLObject formula = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list346 );
    template = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list346 );
    formula = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$7 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list346 );
      current_$7 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list346 );
      if( NIL == conses_high.member( current_$7, $list347, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$7 == $kw158$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list346 );
    }
    final SubLObject reln_tail = cdestructuring_bind.property_list_member( $kw348$RELN, current );
    final SubLObject reln = ( NIL != reln_tail ) ? conses_high.cadr( reln_tail ) : NIL;
    final SubLObject arg_position_map_tail = cdestructuring_bind.property_list_member( $kw349$ARG_POSITION_MAP, current );
    final SubLObject arg_position_map = ( NIL != arg_position_map_tail ) ? conses_high.cadr( arg_position_map_tail ) : pph_utilities.pph_new_empty_map();
    final SubLObject inverseP_tail = cdestructuring_bind.property_list_member( $kw350$INVERSE_, current );
    final SubLObject inverseP = ( NIL != inverseP_tail ) ? conses_high.cadr( inverseP_tail ) : $sym351$IGNORE_ME;
    final SubLObject nl_preds_tail = cdestructuring_bind.property_list_member( $kw352$NL_PREDS, current );
    final SubLObject nl_preds = ( NIL != nl_preds_tail ) ? conses_high.cadr( nl_preds_tail ) : $kw353$ANY;
    final SubLObject focus_argnum_tail = cdestructuring_bind.property_list_member( $kw354$FOCUS_ARGNUM, current );
    final SubLObject focus_argnum = ( NIL != focus_argnum_tail ) ? conses_high.cadr( focus_argnum_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw211$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject generator = $sym355$GENERATOR;
    return ConsesLow.list( $sym4$CLET, ConsesLow.list( ConsesLow.list( generator, ConsesLow.list( $sym356$GET_PPH_PHRASE_TEMPLATE_GENERATOR, formula, focus_argnum, reln, nl_preds, arg_position_map ) ) ), ConsesLow.list(
        $sym96$CUNWIND_PROTECT, ConsesLow.list( $sym183$UNTIL, ConsesLow.list( $sym252$COR, done, ConsesLow.list( $sym357$PPH_PHRASE_TEMPLATE_GENERATOR_DONE_P, generator ) ), ConsesLow.list( $sym52$CMULTIPLE_VALUE_BIND,
            ConsesLow.list( template, inverseP ), ConsesLow.list( $sym358$PPH_PHRASE_TEMPLATE_GENERATOR_NEXT, generator ), ConsesLow.list( $sym143$IGNORE, inverseP ), ConsesLow.listS( $sym58$PWHEN, ConsesLow.list(
                $sym359$PPH_PHRASE_P, template ), ConsesLow.append( body, NIL ) ) ) ) ), ConsesLow.list( $sym360$FREE_PPH_PHRASE_TEMPLATE_GENERATOR, generator ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 43502L)
  public static SubLObject do_pph_phrases_for_formula(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list361 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject v_pph_phrase = NIL;
    SubLObject formula = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list361 );
    v_pph_phrase = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list361 );
    formula = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$8 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list361 );
      current_$8 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list361 );
      if( NIL == conses_high.member( current_$8, $list362, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$8 == $kw158$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list361 );
    }
    final SubLObject focus_arg_tail = cdestructuring_bind.property_list_member( $kw363$FOCUS_ARG, current );
    final SubLObject focus_arg = ( NIL != focus_arg_tail ) ? conses_high.cadr( focus_arg_tail ) : NIL;
    final SubLObject arg_position_map_tail = cdestructuring_bind.property_list_member( $kw349$ARG_POSITION_MAP, current );
    final SubLObject arg_position_map = ( NIL != arg_position_map_tail ) ? conses_high.cadr( arg_position_map_tail ) : NIL;
    final SubLObject nl_preds_tail = cdestructuring_bind.property_list_member( $kw352$NL_PREDS, current );
    final SubLObject nl_preds = ( NIL != nl_preds_tail ) ? conses_high.cadr( nl_preds_tail ) : $kw353$ANY;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw211$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject phrase_template = $sym364$PHRASE_TEMPLATE;
    return ConsesLow.list( $sym365$DO_PPH_PHRASE_TEMPLATES_FOR_FORMULA, ConsesLow.list( new SubLObject[] { phrase_template, formula, $kw354$FOCUS_ARGNUM, focus_arg, $kw349$ARG_POSITION_MAP, arg_position_map,
      $kw352$NL_PREDS, nl_preds, $kw211$DONE, done
    } ), ConsesLow.listS( $sym4$CLET, ConsesLow.list( ConsesLow.list( v_pph_phrase, ConsesLow.list( $sym366$PPH_CUSTOMIZE_TEMPLATE_MACRO_HELPER, phrase_template, formula, arg_position_map, nl_preds ) ) ), ConsesLow
        .append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 44207L)
  public static SubLObject max_suspended_method_depth()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $max_suspended_method_depth$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 44526L)
  public static SubLObject handling_pph_method_failures_p()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject ans = makeBoolean( NIL != $allow_handling_of_pph_method_failuresP$.getDynamicValue( thread ) && NIL != $handling_pph_method_failuresP$.getDynamicValue( thread ) );
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 44696L)
  public static SubLObject handling_pph_method_failures(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    final SubLObject failed_method = $sym370$FAILED_METHOD;
    final SubLObject tried_oneP = $sym371$TRIED_ONE_;
    final SubLObject top_levelP = $sym372$TOP_LEVEL_;
    return ConsesLow.list( $sym4$CLET, ConsesLow.list( reader.bq_cons( top_levelP, $list373 ), ConsesLow.list( $sym374$_SUSPENDED_PARAPHRASE_METHODS_, ConsesLow.listS( $sym31$FIF, top_levelP, $list375 ) ), $list376,
        reader.bq_cons( failed_method, $list121 ), reader.bq_cons( tried_oneP, $list121 ) ), ConsesLow.list( $sym377$WHILE, ConsesLow.list( $sym252$COR, failed_method, ConsesLow.list( $sym49$CNOT, tried_oneP ) ),
            ConsesLow.list( $sym58$PWHEN, failed_method, ConsesLow.list( $sym378$NOTE_SUSPENDED_PARAPHRASE_METHOD_PLIST, failed_method ), ConsesLow.listS( $sym144$CSETQ, failed_method, $list121 ) ), ConsesLow.listS(
                $sym379$CCATCH, $kw380$PPH_METHOD_FAILURE, failed_method, ConsesLow.append( body, NIL ) ), ConsesLow.listS( $sym144$CSETQ, tried_oneP, $list180 ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 45392L)
  public static SubLObject handling_pph_method_failures_top_level_p()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject ans = makeBoolean( NIL == $handling_pph_method_failuresP$.getDynamicValue( thread ) );
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 45569L)
  public static SubLObject throw_pph_method_failure(final SubLObject data)
  {
    Dynamic.sublisp_throw( $kw380$PPH_METHOD_FAILURE, data );
    return data;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 45669L)
  public static SubLObject note_suspended_paraphrase_method_plist(final SubLObject plist)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == handling_pph_method_failures_p() )
    {
      final SubLObject new_format_string = Sequences.cconcatenate( $str101$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str102$__, format_nil.format_nil_a_no_copy(
          $str382$Can_t_note_PPH_method_failure__no )
      } );
      pph_error.pph_handle_error( new_format_string, ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY ) );
    }
    if( NIL != set.set_memberP( plist, $suspended_paraphrase_methods$.getDynamicValue( thread ) ) )
    {
      final SubLObject new_format_string = Sequences.cconcatenate( $str101$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str102$__, format_nil.format_nil_a_no_copy(
          $str383$_S___is_already_suspended_ )
      } );
      pph_error.pph_handle_error( new_format_string, ConsesLow.list( plist ) );
    }
    set.set_add( plist, $suspended_paraphrase_methods$.getDynamicValue( thread ) );
    if( set.set_size( $suspended_paraphrase_methods$.getDynamicValue( thread ) ).numG( $max_suspended_method_depth$.getDynamicValue( thread ) ) )
    {
      final SubLObject new_format_string = Sequences.cconcatenate( $str101$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( TWO_INTEGER ), $str102$__, format_nil.format_nil_a_no_copy(
          $str384$Over__S_suspended_methods____Curr )
      } );
      pph_error.pph_handle_error( new_format_string, ConsesLow.list( $max_suspended_method_depth$.getDynamicValue( thread ), plist ) );
    }
    return $suspended_paraphrase_methods$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 46304L)
  public static SubLObject clear_pph_suspended_methods_for_cycl(final SubLObject cycl)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    if( NIL != $handling_pph_method_failuresP$.getDynamicValue( thread ) )
    {
      SubLObject doomed = NIL;
      final SubLObject set_contents_var = set.do_set_internal( $suspended_paraphrase_methods$.getDynamicValue( thread ) );
      SubLObject basis_object;
      SubLObject state;
      SubLObject method;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
          .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        method = set_contents.do_set_contents_next( basis_object, state );
        if( NIL != set_contents.do_set_contents_element_validP( state, method ) && conses_high.getf( method, $kw385$CYCL, UNPROVIDED ).equal( cycl ) )
        {
          doomed = ConsesLow.cons( method, doomed );
        }
      }
      SubLObject cdolist_list_var = doomed;
      SubLObject method2 = NIL;
      method2 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        count = Numbers.add( count, ONE_INTEGER );
        set.set_remove( method2, $suspended_paraphrase_methods$.getDynamicValue( thread ) );
        cdolist_list_var = cdolist_list_var.rest();
        method2 = cdolist_list_var.first();
      }
      if( count.isPositive() && NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
      {
        format_nil.force_format( T, $str386$Cleared__S_suspended_methods_for_, count, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 46785L)
  public static SubLObject suspending_paraphrase_method(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list387 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject method_symbol = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list387 );
    method_symbol = current.first();
    current = current.rest();
    final SubLObject object_type = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list387 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject info = $sym388$INFO;
      return ConsesLow.list( $sym4$CLET, ConsesLow.list( ConsesLow.list( info, ConsesLow.list( $sym389$PPH_METHOD_INFO, method_symbol, object_type ) ) ), ConsesLow.list( $sym390$PPH_DEREGISTER_METHOD_INFO, method_symbol,
          info ), reader.bq_cons( $sym96$CUNWIND_PROTECT, ConsesLow.append( body, ConsesLow.list( ConsesLow.list( $sym391$PPH_REGISTER_METHOD_INFO, method_symbol, info ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list387 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 47351L)
  public static SubLObject omitting_pph_select_string_methods(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_methods = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list392 );
    v_methods = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym4$CLET, ConsesLow.list( ConsesLow.list( $sym393$_SELECT_STRING_METHODS_TO_OMIT_, v_methods ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 47566L)
  public static SubLObject handling_pph_mt_scope(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list316 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject phrase = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list316 );
    phrase = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject save_cycl = $sym394$SAVE_CYCL;
      return ConsesLow.list( $sym4$CLET, ConsesLow.list( ConsesLow.list( save_cycl, ConsesLow.list( $sym395$PPH_PHRASE_RESTRICT_CYCL_TO_MT_SCOPE, phrase ) ) ), ConsesLow.list( $sym96$CUNWIND_PROTECT, reader.bq_cons(
          $sym1$PROGN, ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym396$PPH_PHRASE_RESTORE_AND_REPHRASE_CYCL_IF_MT_SCOPED, phrase, save_cycl ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list316 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 47882L)
  public static SubLObject pph_phrase_restrict_cycl_to_mt_scope(final SubLObject phrase)
  {
    SubLObject save_cycl = NIL;
    if( NIL != pph_utilities.pph_formula_wXmt_scopeP( pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED ) ) )
    {
      save_cycl = pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED );
      if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
      {
        format_nil.force_format( T, $str398$Removing_MT_scope_from__S, save_cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      pph_phrase.pph_phrase_reset_cycl( phrase, pph_utilities.pph_cycl_template_from_arg_position( $list399 ) );
      final SubLObject old_agr_preds = pph_phrase.pph_phrase_agr_preds( phrase, UNPROVIDED );
      final SubLObject new_agr_preds = pph_utilities.pph_adjust_nl_preds_for_mt_scope( save_cycl, old_agr_preds );
      if( !old_agr_preds.equal( new_agr_preds ) )
      {
        if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
        {
          format_nil.force_format( T, $str400$Updating_agr_preds_to__S_based_on, new_agr_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        pph_phrase.pph_phrase_set_agr_preds( phrase, new_agr_preds, UNPROVIDED );
        if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
        {
          format_nil.force_format( T, $str401$New_agr_preds___S, pph_phrase.pph_phrase_agr_preds( phrase, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
      }
    }
    return save_cycl;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 48741L)
  public static SubLObject pph_phrase_restore_and_rephrase_cycl_if_mt_scoped(final SubLObject phrase, final SubLObject cycl, SubLObject temporal_onlyP)
  {
    if( temporal_onlyP == UNPROVIDED )
    {
      temporal_onlyP = pph_vars.$pph_terse_mt_scopeP$.getDynamicValue();
    }
    if( NIL != pph_utilities.pph_formula_wXmt_scopeP( cycl ) )
    {
      pph_phrase_restore_cycl( phrase, cycl );
      if( NIL != pph_phrase.pph_phrase_doneP( phrase ) )
      {
        pph_phrase_add_mt_scope_paraphrases( phrase, pph_utilities.pph_mt_scope( cycl ), temporal_onlyP );
        if( NIL != pph_phrase.pph_phrase_dtr_output_lists( phrase ) )
        {
          pph_phrase_resolution.pph_phrase_set_output_list_from_finished_dtrs( phrase );
        }
      }
    }
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 49536L)
  public static SubLObject pph_phrase_add_mt_scope_paraphrases(final SubLObject phrase, final SubLObject mt_scope, SubLObject temporal_onlyP)
  {
    if( temporal_onlyP == UNPROVIDED )
    {
      temporal_onlyP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != pph_utilities.pph_mt_scope_p( mt_scope ) )
    {
      if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
      {
        format_nil.force_format( T, $str402$Adding_Mt_scope_paraphrases_to___, pph_phrase.pph_phrase_output_list( phrase ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      SubLObject failedP = NIL;
      SubLObject error_message = NIL;
      final SubLObject _prev_bind_0 = Errors.$continue_cerrorP$.currentBinding( thread );
      final SubLObject _prev_bind_2 = pph_error.$pph_error_handling_onP$.currentBinding( thread );
      try
      {
        Errors.$continue_cerrorP$.bind( NIL, thread );
        pph_error.$pph_error_handling_onP$.bind( T, thread );
        if( NIL != pph_error.pph_break_on_errorP() )
        {
          final SubLObject top_levelP = handling_pph_method_failures_top_level_p();
          final SubLObject _prev_bind_0_$9 = $suspended_paraphrase_methods$.currentBinding( thread );
          final SubLObject _prev_bind_1_$10 = $handling_pph_method_failuresP$.currentBinding( thread );
          try
          {
            $suspended_paraphrase_methods$.bind( ( NIL != top_levelP ) ? set.new_set( Symbols.symbol_function( EQUAL ), max_suspended_method_depth() ) : $suspended_paraphrase_methods$.getDynamicValue( thread ), thread );
            $handling_pph_method_failuresP$.bind( T, thread );
            for( SubLObject failed_method = NIL, tried_oneP = NIL; NIL != failed_method || NIL == tried_oneP; tried_oneP = T )
            {
              if( NIL != failed_method )
              {
                note_suspended_paraphrase_method_plist( failed_method );
                failed_method = NIL;
              }
              try
              {
                thread.throwStack.push( $kw380$PPH_METHOD_FAILURE );
                if( NIL == failedP )
                {
                  thread.resetMultipleValues();
                  final SubLObject phrase_lists = pph_phrase_get_mt_scope_phrases( phrase, mt_scope, temporal_onlyP );
                  final SubLObject failed_phrase = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  if( NIL != failed_phrase )
                  {
                    if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) && NIL == pph_error.suppress_pph_warningsP() )
                    {
                      Errors.warn( $str403$Couldn_t_finish_temporal_phrase__, failed_phrase );
                      streams_high.force_output( StreamsLow.$error_output$.getDynamicValue( thread ) );
                    }
                    pph_phrase.pph_phrase_set_output_list( phrase, NIL, UNPROVIDED );
                    failedP = T;
                  }
                  else
                  {
                    final SubLObject temporals_at_endP = pph_temporals_at_endP( phrase );
                    SubLObject current;
                    final SubLObject datum = current = phrase_lists;
                    SubLObject temporal = NIL;
                    SubLObject etc = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list404 );
                    temporal = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list404 );
                    etc = current.first();
                    current = current.rest();
                    if( NIL == current )
                    {
                      if( NIL != pph_phrase.pph_phrase_has_dtrsP( phrase ) )
                      {
                        SubLObject cdolist_list_var = temporal;
                        SubLObject mt_phrase = NIL;
                        mt_phrase = cdolist_list_var.first();
                        while ( NIL != cdolist_list_var)
                        {
                          if( NIL != temporals_at_endP )
                          {
                            pph_phrase.pph_phrase_append( mt_phrase, phrase );
                          }
                          else
                          {
                            pph_phrase.pph_phrase_push( pph_data_structures.new_pph_phrase( $str405$_, UNPROVIDED, UNPROVIDED ), phrase );
                            pph_phrase.pph_phrase_push( mt_phrase, phrase );
                          }
                          cdolist_list_var = cdolist_list_var.rest();
                          mt_phrase = cdolist_list_var.first();
                        }
                        cdolist_list_var = Sequences.reverse( etc );
                        mt_phrase = NIL;
                        mt_phrase = cdolist_list_var.first();
                        while ( NIL != cdolist_list_var)
                        {
                          pph_phrase.pph_phrase_push( mt_phrase, phrase );
                          cdolist_list_var = cdolist_list_var.rest();
                          mt_phrase = cdolist_list_var.first();
                        }
                      }
                      else
                      {
                        SubLObject olist = pph_phrase.pph_phrase_output_list( phrase );
                        SubLObject cdolist_list_var2 = temporal;
                        SubLObject mt_phrase2 = NIL;
                        mt_phrase2 = cdolist_list_var2.first();
                        while ( NIL != cdolist_list_var2)
                        {
                          olist = ( ( NIL != temporals_at_endP ) ? ConsesLow.append( olist, pph_phrase.pph_phrase_output_list( mt_phrase2 ) )
                              : ConsesLow.append( pph_phrase.pph_phrase_output_list( mt_phrase2 ), olist ) );
                          cdolist_list_var2 = cdolist_list_var2.rest();
                          mt_phrase2 = cdolist_list_var2.first();
                        }
                        cdolist_list_var2 = Sequences.reverse( etc );
                        mt_phrase2 = NIL;
                        mt_phrase2 = cdolist_list_var2.first();
                        while ( NIL != cdolist_list_var2)
                        {
                          olist = ConsesLow.append( pph_phrase.pph_phrase_output_list( mt_phrase2 ), olist );
                          cdolist_list_var2 = cdolist_list_var2.rest();
                          mt_phrase2 = cdolist_list_var2.first();
                        }
                        pph_phrase.pph_phrase_set_output_list( phrase, olist, UNPROVIDED );
                      }
                    }
                    else
                    {
                      cdestructuring_bind.cdestructuring_bind_error( datum, $list404 );
                    }
                  }
                }
              }
              catch( final Throwable ccatch_env_var )
              {
                failed_method = Errors.handleThrowable( ccatch_env_var, $kw380$PPH_METHOD_FAILURE );
              }
              finally
              {
                thread.throwStack.pop();
              }
            }
          }
          finally
          {
            $handling_pph_method_failuresP$.rebind( _prev_bind_1_$10, thread );
            $suspended_paraphrase_methods$.rebind( _prev_bind_0_$9, thread );
          }
        }
        else
        {
          try
          {
            thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
            final SubLObject _prev_bind_0_$10 = Errors.$error_handler$.currentBinding( thread );
            try
            {
              Errors.$error_handler$.bind( $sym109$CATCH_ERROR_MESSAGE_HANDLER, thread );
              try
              {
                final SubLObject top_levelP2 = handling_pph_method_failures_top_level_p();
                final SubLObject _prev_bind_0_$11 = $suspended_paraphrase_methods$.currentBinding( thread );
                final SubLObject _prev_bind_1_$11 = $handling_pph_method_failuresP$.currentBinding( thread );
                try
                {
                  $suspended_paraphrase_methods$.bind( ( NIL != top_levelP2 ) ? set.new_set( Symbols.symbol_function( EQUAL ), max_suspended_method_depth() ) : $suspended_paraphrase_methods$.getDynamicValue( thread ),
                      thread );
                  $handling_pph_method_failuresP$.bind( T, thread );
                  for( SubLObject failed_method2 = NIL, tried_oneP2 = NIL; NIL != failed_method2 || NIL == tried_oneP2; tried_oneP2 = T )
                  {
                    if( NIL != failed_method2 )
                    {
                      note_suspended_paraphrase_method_plist( failed_method2 );
                      failed_method2 = NIL;
                    }
                    try
                    {
                      thread.throwStack.push( $kw380$PPH_METHOD_FAILURE );
                      if( NIL == failedP )
                      {
                        thread.resetMultipleValues();
                        final SubLObject phrase_lists2 = pph_phrase_get_mt_scope_phrases( phrase, mt_scope, temporal_onlyP );
                        final SubLObject failed_phrase2 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if( NIL != failed_phrase2 )
                        {
                          if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) && NIL == pph_error.suppress_pph_warningsP() )
                          {
                            Errors.warn( $str403$Couldn_t_finish_temporal_phrase__, failed_phrase2 );
                            streams_high.force_output( StreamsLow.$error_output$.getDynamicValue( thread ) );
                          }
                          pph_phrase.pph_phrase_set_output_list( phrase, NIL, UNPROVIDED );
                          failedP = T;
                        }
                        else
                        {
                          final SubLObject temporals_at_endP2 = pph_temporals_at_endP( phrase );
                          SubLObject current2;
                          final SubLObject datum2 = current2 = phrase_lists2;
                          SubLObject temporal2 = NIL;
                          SubLObject etc2 = NIL;
                          cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list404 );
                          temporal2 = current2.first();
                          current2 = current2.rest();
                          cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list404 );
                          etc2 = current2.first();
                          current2 = current2.rest();
                          if( NIL == current2 )
                          {
                            if( NIL != pph_phrase.pph_phrase_has_dtrsP( phrase ) )
                            {
                              SubLObject cdolist_list_var2 = temporal2;
                              SubLObject mt_phrase2 = NIL;
                              mt_phrase2 = cdolist_list_var2.first();
                              while ( NIL != cdolist_list_var2)
                              {
                                if( NIL != temporals_at_endP2 )
                                {
                                  pph_phrase.pph_phrase_append( mt_phrase2, phrase );
                                }
                                else
                                {
                                  pph_phrase.pph_phrase_push( pph_data_structures.new_pph_phrase( $str405$_, UNPROVIDED, UNPROVIDED ), phrase );
                                  pph_phrase.pph_phrase_push( mt_phrase2, phrase );
                                }
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                mt_phrase2 = cdolist_list_var2.first();
                              }
                              cdolist_list_var2 = Sequences.reverse( etc2 );
                              mt_phrase2 = NIL;
                              mt_phrase2 = cdolist_list_var2.first();
                              while ( NIL != cdolist_list_var2)
                              {
                                pph_phrase.pph_phrase_push( mt_phrase2, phrase );
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                mt_phrase2 = cdolist_list_var2.first();
                              }
                            }
                            else
                            {
                              SubLObject olist2 = pph_phrase.pph_phrase_output_list( phrase );
                              SubLObject cdolist_list_var3 = temporal2;
                              SubLObject mt_phrase3 = NIL;
                              mt_phrase3 = cdolist_list_var3.first();
                              while ( NIL != cdolist_list_var3)
                              {
                                olist2 = ( ( NIL != temporals_at_endP2 ) ? ConsesLow.append( olist2, pph_phrase.pph_phrase_output_list( mt_phrase3 ) )
                                    : ConsesLow.append( pph_phrase.pph_phrase_output_list( mt_phrase3 ), olist2 ) );
                                cdolist_list_var3 = cdolist_list_var3.rest();
                                mt_phrase3 = cdolist_list_var3.first();
                              }
                              cdolist_list_var3 = Sequences.reverse( etc2 );
                              mt_phrase3 = NIL;
                              mt_phrase3 = cdolist_list_var3.first();
                              while ( NIL != cdolist_list_var3)
                              {
                                olist2 = ConsesLow.append( pph_phrase.pph_phrase_output_list( mt_phrase3 ), olist2 );
                                cdolist_list_var3 = cdolist_list_var3.rest();
                                mt_phrase3 = cdolist_list_var3.first();
                              }
                              pph_phrase.pph_phrase_set_output_list( phrase, olist2, UNPROVIDED );
                            }
                          }
                          else
                          {
                            cdestructuring_bind.cdestructuring_bind_error( datum2, $list404 );
                          }
                        }
                      }
                    }
                    catch( final Throwable ccatch_env_var2 )
                    {
                      failed_method2 = Errors.handleThrowable( ccatch_env_var2, $kw380$PPH_METHOD_FAILURE );
                    }
                    finally
                    {
                      thread.throwStack.pop();
                    }
                  }
                }
                finally
                {
                  $handling_pph_method_failuresP$.rebind( _prev_bind_1_$11, thread );
                  $suspended_paraphrase_methods$.rebind( _prev_bind_0_$11, thread );
                }
              }
              catch( final Throwable catch_var )
              {
                Errors.handleThrowable( catch_var, NIL );
              }
            }
            finally
            {
              Errors.$error_handler$.rebind( _prev_bind_0_$10, thread );
            }
          }
          catch( final Throwable ccatch_env_var3 )
          {
            error_message = Errors.handleThrowable( ccatch_env_var3, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          }
          finally
          {
            thread.throwStack.pop();
          }
          if( error_message.isString() && NIL == pph_error.suppress_pph_warningsP() )
          {
            Errors.warn( Sequences.cconcatenate( pph_error_message_truncator.truncate_pph_error_message( error_message ), $str406$___Top_level_CycL___S ), pph_vars.pph_top_level_cycl() );
          }
        }
      }
      finally
      {
        pph_error.$pph_error_handling_onP$.rebind( _prev_bind_2, thread );
        Errors.$continue_cerrorP$.rebind( _prev_bind_0, thread );
      }
      if( NIL != failedP )
      {
        return $kw407$FAILED;
      }
      if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
      {
        format_nil.force_format( T, $str408$Result_of_adding_Mt_scope_paraphr, pph_phrase.pph_phrase_output_list( phrase ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
    }
    return pph_phrase.pph_phrase_output_list( phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 51626L)
  public static SubLObject pph_temporals_at_endP(final SubLObject phrase)
  {
    if( NIL != pph_phrase.pph_phrase_has_multiple_verbsP( phrase ) )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 51865L)
  public static SubLObject pph_phrase_get_mt_scope_phrases(final SubLObject phrase, final SubLObject mt_scope, SubLObject temporal_onlyP)
  {
    if( temporal_onlyP == UNPROVIDED )
    {
      temporal_onlyP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject arg_position_map = pph_utilities.pph_new_identity_map();
    SubLObject temporal_phrases = NIL;
    SubLObject other_phrases = NIL;
    SubLObject failed_phrase = NIL;
    if( NIL != pph_utilities.pph_mt_scope_p( mt_scope ) )
    {
      SubLObject list_var = NIL;
      SubLObject mt_in_scope = NIL;
      SubLObject argnum = NIL;
      list_var = mt_scope;
      mt_in_scope = list_var.first();
      for( argnum = ZERO_INTEGER; NIL == failed_phrase && NIL != list_var; list_var = list_var.rest(), mt_in_scope = list_var.first(), argnum = Numbers.add( ONE_INTEGER, argnum ) )
      {
        if( !mt_in_scope.equal( $list409 ) )
        {
          if( NIL == pph_utilities.pph_isaP( mt_in_scope, $const410$TemporalMicrotheory, UNPROVIDED ) )
          {
            if( NIL == temporal_onlyP )
            {
              final SubLObject mt_phrase = pph_mt_in_scope_phrase( mt_scope, argnum, arg_position_map, $list411 );
              final SubLObject acc_to_phrase = pph_data_structures.new_pph_phrase( $str412$according_to, UNPROVIDED, UNPROVIDED );
              final SubLObject the_comma = pph_data_structures.new_pph_phrase( $str405$_, UNPROVIDED, UNPROVIDED );
              if( NIL == failed_phrase )
              {
                SubLObject csome_list_var = ConsesLow.list( the_comma, mt_phrase, acc_to_phrase );
                SubLObject other_phrase = NIL;
                other_phrase = csome_list_var.first();
                while ( NIL == failed_phrase && NIL != csome_list_var)
                {
                  pph_phrase_resolution.pph_phrase_get_string( other_phrase, $kw413$PHRASE_CYCL, phrase );
                  if( NIL != pph_phrase.pph_phrase_doneP( other_phrase ) )
                  {
                    other_phrases = ConsesLow.cons( other_phrase, other_phrases );
                  }
                  else
                  {
                    failed_phrase = other_phrase;
                  }
                  csome_list_var = csome_list_var.rest();
                  other_phrase = csome_list_var.first();
                }
              }
            }
          }
          else if( NIL == pph_vars.$pph_explicit_temporal_qualification_for_current_factsP$.getDynamicValue( thread ) && NIL != pph_utilities.pph_time_interval_subsumesP( cycl_utilities.formula_arg1( mt_in_scope,
              UNPROVIDED ), $const414$Now ) )
          {
            if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
            {
              format_nil.force_format( T, $str415$Ignoring__S___because_it_subsumes, mt_in_scope, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
          }
          else
          {
            final SubLObject mt_phrase = pph_mt_in_scope_phrase( mt_scope, argnum, arg_position_map, UNPROVIDED );
            pph_main.pph_phrase_generate( mt_phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            if( NIL != pph_phrase.pph_phrase_doneP( mt_phrase ) )
            {
              temporal_phrases = ConsesLow.cons( mt_phrase, temporal_phrases );
            }
            else
            {
              failed_phrase = mt_phrase;
            }
          }
        }
      }
    }
    return Values.values( ConsesLow.list( temporal_phrases, other_phrases ), failed_phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 53857L)
  public static SubLObject pph_mt_in_scope_phrase(final SubLObject mt_scope, final SubLObject argnum, final SubLObject base_arg_position_map, SubLObject nl_preds)
  {
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = $list416;
    }
    final SubLObject mt_in_scope = ConsesLow.nth( argnum, mt_scope );
    final SubLObject matrix_pos = pph_matrix_pos_from_mt_scope( mt_scope, argnum );
    final SubLObject matrix_pos_template = pph_utilities.pph_cycl_template_from_arg_position( matrix_pos );
    final SubLObject sub_arg_position_map = pph_utilities.pph_figure_new_arg_position_map( base_arg_position_map, matrix_pos_template );
    final SubLObject phrase = pph_phrase.new_pph_phrase_for_cycl( mt_in_scope, sub_arg_position_map, UNPROVIDED );
    pph_phrase.pph_phrase_set_agr_preds( phrase, nl_preds, UNPROVIDED );
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 54427L)
  public static SubLObject pph_matrix_pos_from_mt_scope(final SubLObject mt_scope, final SubLObject argnum)
  {
    return ( NIL != list_utilities.lengthG( mt_scope, ONE_INTEGER, UNPROVIDED ) ) ? ConsesLow.list( ONE_INTEGER, number_utilities.f_1X( argnum ) ) : ConsesLow.list( ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 54557L)
  public static SubLObject pph_phrase_restore_cycl_if_mt_scoped(final SubLObject phrase, final SubLObject cycl)
  {
    if( NIL != pph_utilities.pph_formula_wXmt_scopeP( cycl ) )
    {
      pph_phrase_restore_cycl( phrase, cycl );
    }
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 54916L)
  public static SubLObject pph_phrase_restore_cycl(final SubLObject phrase, final SubLObject cycl)
  {
    return pph_phrase.pph_phrase_set_cycl( phrase, cycl );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 55014L)
  public static SubLObject with_nl_generation_fort_cache_memory_mapped(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    final SubLObject already_memory_mapped = $sym417$ALREADY_MEMORY_MAPPED;
    return ConsesLow.list( $sym4$CLET, ConsesLow.list( reader.bq_cons( already_memory_mapped, $list418 ) ), ConsesLow.list( $sym96$CUNWIND_PROTECT, ConsesLow.listS( $sym1$PROGN, $list419, ConsesLow.append( body, NIL ) ),
        ConsesLow.listS( $sym97$PUNLESS, already_memory_mapped, $list420 ) ) );
  }

  public static SubLObject declare_pph_macros_file()
  {
    SubLFiles.declareFunction( me, "pph_mapped_string_for_term", "PPH-MAPPED-STRING-FOR-TERM", 1, 0, false );
    SubLFiles.declareMacro( me, "with_paraphrase_mappings", "WITH-PARAPHRASE-MAPPINGS" );
    SubLFiles.declareMacro( me, "with_paraphrase_blacklist", "WITH-PARAPHRASE-BLACKLIST" );
    SubLFiles.declareFunction( me, "valid_pph_blacklistP", "VALID-PPH-BLACKLIST?", 1, 0, false );
    SubLFiles.declareMacro( me, "with_paraphrase_lexical_assertion_blacklist", "WITH-PARAPHRASE-LEXICAL-ASSERTION-BLACKLIST" );
    SubLFiles.declareFunction( me, "valid_pph_blacklist_assertionP", "VALID-PPH-BLACKLIST-ASSERTION?", 1, 0, false );
    SubLFiles.declareMacro( me, "do_pph_arg_position_map", "DO-PPH-ARG-POSITION-MAP" );
    SubLFiles.declareMacro( me, "remembering_pph_ambiguous_strings", "REMEMBERING-PPH-AMBIGUOUS-STRINGS" );
    SubLFiles.declareMacro( me, "with_paraphrase_precision", "WITH-PARAPHRASE-PRECISION" );
    SubLFiles.declareMacro( me, "with_terse_paraphrase_on", "WITH-TERSE-PARAPHRASE-ON" );
    SubLFiles.declareMacro( me, "with_precise_paraphrase_on", "WITH-PRECISE-PARAPHRASE-ON" );
    SubLFiles.declareMacro( me, "with_precise_paraphrase_off", "WITH-PRECISE-PARAPHRASE-OFF" );
    SubLFiles.declareMacro( me, "with_precise_paraphrase_for_args", "WITH-PRECISE-PARAPHRASE-FOR-ARGS" );
    SubLFiles.declareMacro( me, "with_definite_descriptions_licensed_for_terms", "WITH-DEFINITE-DESCRIPTIONS-LICENSED-FOR-TERMS" );
    SubLFiles.declareFunction( me, "pph_nested_arg_list_p", "PPH-NESTED-ARG-LIST-P", 1, 0, false );
    SubLFiles.declareMacro( me, "maximizing_pph_links", "MAXIMIZING-PPH-LINKS" );
    SubLFiles.declareMacro( me, "pph_possibly_binding_current_arg0", "PPH-POSSIBLY-BINDING-CURRENT-ARG0" );
    SubLFiles.declareFunction( me, "pph_ok_arg0_for_linkingP", "PPH-OK-ARG0-FOR-LINKING?", 1, 0, false );
    SubLFiles.declareMacro( me, "with_pph_html_function_and_target", "WITH-PPH-HTML-FUNCTION-AND-TARGET" );
    SubLFiles.declareMacro( me, "with_pph_html_term_id_fn", "WITH-PPH-HTML-TERM-ID-FN" );
    SubLFiles.declareMacro( me, "omitting_hyperlinks_in_pph_html_mode", "OMITTING-HYPERLINKS-IN-PPH-HTML-MODE" );
    SubLFiles.declareMacro( me, "allowing_utf8_in_pph_text_mode", "ALLOWING-UTF8-IN-PPH-TEXT-MODE" );
    SubLFiles.declareMacro( me, "dont_link_unlinked_phrases_to_matrix_arg_if", "DONT-LINK-UNLINKED-PHRASES-TO-MATRIX-ARG-IF" );
    SubLFiles.declareMacro( me, "with_pph_memoization", "WITH-PPH-MEMOIZATION" );
    SubLFiles.declareMacro( me, "with_pph_external_memoization", "WITH-PPH-EXTERNAL-MEMOIZATION" );
    SubLFiles.declareFunction( me, "find_or_create_pph_memoization_state", "FIND-OR-CREATE-PPH-MEMOIZATION-STATE", 0, 0, false );
    SubLFiles.declareFunction( me, "find_or_create_pph_external_memoization_state", "FIND-OR-CREATE-PPH-EXTERNAL-MEMOIZATION-STATE", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_problem_store_pointer_print_function_trampoline", "PPH-PROBLEM-STORE-POINTER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_problem_store_pointer_p", "PPH-PROBLEM-STORE-POINTER-P", 1, 0, false );
    new $pph_problem_store_pointer_p$UnaryFunction();
    SubLFiles.declareFunction( me, "pph_problem_store_pointer_store", "PPH-PROBLEM-STORE-POINTER-STORE", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_pph_problem_store_pointer_store", "_CSETF-PPH-PROBLEM-STORE-POINTER-STORE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_pph_problem_store_pointer", "MAKE-PPH-PROBLEM-STORE-POINTER", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_pph_problem_store_pointer", "VISIT-DEFSTRUCT-PPH-PROBLEM-STORE-POINTER", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_pph_problem_store_pointer_method", "VISIT-DEFSTRUCT-OBJECT-PPH-PROBLEM-STORE-POINTER-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "pprint_pph_problem_store_pointer", "PPRINT-PPH-PROBLEM-STORE-POINTER", 3, 0, false );
    SubLFiles.declareFunction( me, "pph_maybe_destroy_problem_store", "PPH-MAYBE-DESTROY-PROBLEM-STORE", 1, 0, false );
    SubLFiles.declareFunction( me, "free_pph_problem_store_pointer", "FREE-PPH-PROBLEM-STORE-POINTER", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_problem_store_pointer_set_store", "PPH-PROBLEM-STORE-POINTER-SET-STORE", 2, 0, false );
    SubLFiles.declareFunction( me, "new_problem_store_pointer", "NEW-PROBLEM-STORE-POINTER", 0, 0, false );
    SubLFiles.declareFunction( me, "replace_pph_problem_store_pointer_store", "REPLACE-PPH-PROBLEM-STORE-POINTER-STORE", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_problem_store", "PPH-PROBLEM-STORE", 0, 1, false );
    SubLFiles.declareMacro( me, "with_pph_problem_store", "WITH-PPH-PROBLEM-STORE" );
    SubLFiles.declareFunction( me, "find_or_create_pph_problem_store_pointer", "FIND-OR-CREATE-PPH-PROBLEM-STORE-POINTER", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_problem_store_okP", "PPH-PROBLEM-STORE-OK?", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_problem_store_size_okP", "PPH-PROBLEM-STORE-SIZE-OK?", 1, 0, false );
    SubLFiles.declareMacro( me, "creating_permanent_pph_phrases", "CREATING-PERMANENT-PPH-PHRASES" );
    SubLFiles.declareFunction( me, "note_new_pph_phrase", "NOTE-NEW-PPH-PHRASE", 1, 0, false );
    SubLFiles.declareFunction( me, "new_pph_phrase_count", "NEW-PPH-PHRASE-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "destroy_new_pph_phrases", "DESTROY-NEW-PPH-PHRASES", 0, 0, false );
    SubLFiles.declareMacro( me, "destroying_new_pph_phrases_when_done", "DESTROYING-NEW-PPH-PHRASES-WHEN-DONE" );
    SubLFiles.declareFunction( me, "get_new_pph_phrase_count", "GET-NEW-PPH-PHRASE-COUNT", 0, 0, false );
    SubLFiles.declareMacro( me, "possibly_destroying_new_pph_phrases_when_done", "POSSIBLY-DESTROYING-NEW-PPH-PHRASES-WHEN-DONE" );
    SubLFiles.declareMacro( me, "ensuring_pph_discourse_context", "ENSURING-PPH-DISCOURSE-CONTEXT" );
    SubLFiles.declareMacro( me, "within_new_pph_discourse_context", "WITHIN-NEW-PPH-DISCOURSE-CONTEXT" );
    SubLFiles.declareFunction( me, "herald_new_discourse_context", "HERALD-NEW-DISCOURSE-CONTEXT", 0, 0, false );
    SubLFiles.declareFunction( me, "herald_end_of_discourse_context", "HERALD-END-OF-DISCOURSE-CONTEXT", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_discourse_context_initializedP", "PPH-DISCOURSE-CONTEXT-INITIALIZED?", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_pph_discourse_context", "CLEAR-PPH-DISCOURSE-CONTEXT", 0, 0, false );
    SubLFiles.declareMacro( me, "with_shadowed_discourse_context", "WITH-SHADOWED-DISCOURSE-CONTEXT" );
    SubLFiles.declareFunction( me, "note_leaving_shadowed_discourse_context", "NOTE-LEAVING-SHADOWED-DISCOURSE-CONTEXT", 2, 0, false );
    SubLFiles.declareMacro( me, "with_pph_speaker_and_addressee", "WITH-PPH-SPEAKER-AND-ADDRESSEE" );
    SubLFiles.declareMacro( me, "do_pph_output_list", "DO-PPH-OUTPUT-LIST" );
    SubLFiles.declareMacro( me, "do_one_pph_output_list_item", "DO-ONE-PPH-OUTPUT-LIST-ITEM" );
    SubLFiles.declareMacro( me, "pph_maybe_do_space_item", "PPH-MAYBE-DO-SPACE-ITEM" );
    SubLFiles.declareFunction( me, "pph_update_end_char_index", "PPH-UPDATE-END-CHAR-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_make_space_string", "PPH-MAKE-SPACE-STRING", 2, 0, false );
    SubLFiles.declareMacro( me, "with_pph_regular_output_item_bindings", "WITH-PPH-REGULAR-OUTPUT-ITEM-BINDINGS" );
    SubLFiles.declareFunction( me, "pph_output_list_find_start_char", "PPH-OUTPUT-LIST-FIND-START-CHAR", 3, 0, false );
    SubLFiles.declareMacro( me, "do_pph_javalist_items", "DO-PPH-JAVALIST-ITEMS" );
    SubLFiles.declareMacro( me, "with_pph_disambiguation_partial_results_accumulation", "WITH-PPH-DISAMBIGUATION-PARTIAL-RESULTS-ACCUMULATION" );
    SubLFiles.declareFunction( me, "initialize_disambiguation_phrases", "INITIALIZE-DISAMBIGUATION-PHRASES", 0, 0, false );
    SubLFiles.declareFunction( me, "accumulate_disambiguation_phrases", "ACCUMULATE-DISAMBIGUATION-PHRASES", 1, 0, false );
    SubLFiles.declareFunction( me, "add_pph_disambiguation_result_to_accumulator", "ADD-PPH-DISAMBIGUATION-RESULT-TO-ACCUMULATOR", 3, 0, false );
    SubLFiles.declareFunction( me, "consolidate_disambiguation_phrases", "CONSOLIDATE-DISAMBIGUATION-PHRASES", 1, 0, false );
    SubLFiles.declareFunction( me, "final_results_for_disambiguation_phrases", "FINAL-RESULTS-FOR-DISAMBIGUATION-PHRASES", 1, 0, false );
    SubLFiles.declareMacro( me, "gathering_pph_problems", "GATHERING-PPH-PROBLEMS" );
    SubLFiles.declareMacro( me, "with_pph_timeout", "WITH-PPH-TIMEOUT" );
    SubLFiles.declareFunction( me, "pph_timeout_time_reachedP", "PPH-TIMEOUT-TIME-REACHED?", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_timeout_current_time", "PPH-TIMEOUT-CURRENT-TIME", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_compute_timeout_time", "PPH-COMPUTE-TIMEOUT-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_timeout", "PPH-TIMEOUT", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_allowable_time", "PPH-ALLOWABLE-TIME", 0, 0, false );
    SubLFiles.declareMacro( me, "noting_unexpressed_negations", "NOTING-UNEXPRESSED-NEGATIONS" );
    SubLFiles.declareMacro( me, "possibly_with_pph_language_mt", "POSSIBLY-WITH-PPH-LANGUAGE-MT" );
    SubLFiles.declareMacro( me, "possibly_with_pph_domain_mt", "POSSIBLY-WITH-PPH-DOMAIN-MT" );
    SubLFiles.declareMacro( me, "with_language_and_domain_mts", "WITH-LANGUAGE-AND-DOMAIN-MTS" );
    SubLFiles.declareMacro( me, "with_pph_language_mt_relevance", "WITH-PPH-LANGUAGE-MT-RELEVANCE" );
    SubLFiles.declareMacro( me, "with_pph_domain_and_language_mt_union_relevance", "WITH-PPH-DOMAIN-AND-LANGUAGE-MT-UNION-RELEVANCE" );
    SubLFiles.declareMacro( me, "do_pph_phrase_fns", "DO-PPH-PHRASE-FNS" );
    SubLFiles.declareMacro( me, "possibly_suspending_pph_bullets", "POSSIBLY-SUSPENDING-PPH-BULLETS" );
    SubLFiles.declareMacro( me, "with_pph_demerit_cutoff", "WITH-PPH-DEMERIT-CUTOFF" );
    SubLFiles.declareMacro( me, "with_maximum_pph_demerit_cutoff", "WITH-MAXIMUM-PPH-DEMERIT-CUTOFF" );
    SubLFiles.declareFunction( me, "valid_pph_demerit_cutoff_p", "VALID-PPH-DEMERIT-CUTOFF-P", 1, 0, false );
    SubLFiles.declareFunction( me, "compute_new_pph_demerit_cutoff", "COMPUTE-NEW-PPH-DEMERIT-CUTOFF", 1, 0, false );
    SubLFiles.declareMacro( me, "with_pph_phrase_destruction_grace_period", "WITH-PPH-PHRASE-DESTRUCTION-GRACE-PERIOD" );
    SubLFiles.declareMacro( me, "remembering_pph_proofs", "REMEMBERING-PPH-PROOFS" );
    SubLFiles.declareMacro( me, "with_pph_inference_answer", "WITH-PPH-INFERENCE-ANSWER" );
    SubLFiles.declareMacro( me, "with_pph_inference", "WITH-PPH-INFERENCE" );
    SubLFiles.declareMacro( me, "with_pph_justification_generation_parameters", "WITH-PPH-JUSTIFICATION-GENERATION-PARAMETERS" );
    SubLFiles.declareMacro( me, "possibly_with_pph_html_justification_generation_parameters", "POSSIBLY-WITH-PPH-HTML-JUSTIFICATION-GENERATION-PARAMETERS" );
    SubLFiles.declareFunction( me, "pph_possibly_enable_showXhide", "PPH-POSSIBLY-ENABLE-SHOW/HIDE", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_justification_html_function_and_target", "PPH-JUSTIFICATION-HTML-FUNCTION-AND-TARGET", 0, 0, false );
    SubLFiles.declareMacro( me, "pph_setting_var_types_if_successful", "PPH-SETTING-VAR-TYPES-IF-SUCCESSFUL" );
    SubLFiles.declareFunction( me, "pph_reset_var_types", "PPH-RESET-VAR-TYPES", 1, 0, false );
    SubLFiles.declareMacro( me, "pph_possibly_binding_variables", "PPH-POSSIBLY-BINDING-VARIABLES" );
    SubLFiles.declareFunction( me, "pph_handle_local_vars", "PPH-HANDLE-LOCAL-VARS", 1, 0, false );
    SubLFiles.declareMacro( me, "destructure_pph_pronoun_agr", "DESTRUCTURE-PPH-PRONOUN-AGR" );
    SubLFiles.declareMacro( me, "pph_phrase_do_agr_constraints", "PPH-PHRASE-DO-AGR-CONSTRAINTS" );
    SubLFiles.declareMacro( me, "do_pph_phrase_templates_for_formula", "DO-PPH-PHRASE-TEMPLATES-FOR-FORMULA" );
    SubLFiles.declareMacro( me, "do_pph_phrases_for_formula", "DO-PPH-PHRASES-FOR-FORMULA" );
    SubLFiles.declareFunction( me, "max_suspended_method_depth", "MAX-SUSPENDED-METHOD-DEPTH", 0, 0, false );
    SubLFiles.declareFunction( me, "handling_pph_method_failures_p", "HANDLING-PPH-METHOD-FAILURES-P", 0, 0, false );
    SubLFiles.declareMacro( me, "handling_pph_method_failures", "HANDLING-PPH-METHOD-FAILURES" );
    SubLFiles.declareFunction( me, "handling_pph_method_failures_top_level_p", "HANDLING-PPH-METHOD-FAILURES-TOP-LEVEL-P", 0, 0, false );
    SubLFiles.declareFunction( me, "throw_pph_method_failure", "THROW-PPH-METHOD-FAILURE", 1, 0, false );
    SubLFiles.declareFunction( me, "note_suspended_paraphrase_method_plist", "NOTE-SUSPENDED-PARAPHRASE-METHOD-PLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_pph_suspended_methods_for_cycl", "CLEAR-PPH-SUSPENDED-METHODS-FOR-CYCL", 1, 0, false );
    SubLFiles.declareMacro( me, "suspending_paraphrase_method", "SUSPENDING-PARAPHRASE-METHOD" );
    SubLFiles.declareMacro( me, "omitting_pph_select_string_methods", "OMITTING-PPH-SELECT-STRING-METHODS" );
    SubLFiles.declareMacro( me, "handling_pph_mt_scope", "HANDLING-PPH-MT-SCOPE" );
    SubLFiles.declareFunction( me, "pph_phrase_restrict_cycl_to_mt_scope", "PPH-PHRASE-RESTRICT-CYCL-TO-MT-SCOPE", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_restore_and_rephrase_cycl_if_mt_scoped", "PPH-PHRASE-RESTORE-AND-REPHRASE-CYCL-IF-MT-SCOPED", 2, 1, false );
    SubLFiles.declareFunction( me, "pph_phrase_add_mt_scope_paraphrases", "PPH-PHRASE-ADD-MT-SCOPE-PARAPHRASES", 2, 1, false );
    SubLFiles.declareFunction( me, "pph_temporals_at_endP", "PPH-TEMPORALS-AT-END?", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_get_mt_scope_phrases", "PPH-PHRASE-GET-MT-SCOPE-PHRASES", 2, 1, false );
    SubLFiles.declareFunction( me, "pph_mt_in_scope_phrase", "PPH-MT-IN-SCOPE-PHRASE", 3, 1, false );
    SubLFiles.declareFunction( me, "pph_matrix_pos_from_mt_scope", "PPH-MATRIX-POS-FROM-MT-SCOPE", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_restore_cycl_if_mt_scoped", "PPH-PHRASE-RESTORE-CYCL-IF-MT-SCOPED", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_restore_cycl", "PPH-PHRASE-RESTORE-CYCL", 2, 0, false );
    SubLFiles.declareMacro( me, "with_nl_generation_fort_cache_memory_mapped", "WITH-NL-GENERATION-FORT-CACHE-MEMORY-MAPPED" );
    return NIL;
  }

  public static SubLObject init_pph_macros_file()
  {
    $pph_memoization_state$ = SubLFiles.defparameter( "*PPH-MEMOIZATION-STATE*", misc_utilities.uninitialized() );
    $pph_external_memoization_state$ = SubLFiles.defparameter( "*PPH-EXTERNAL-MEMOIZATION-STATE*", misc_utilities.uninitialized() );
    $dtp_pph_problem_store_pointer$ = SubLFiles.defconstant( "*DTP-PPH-PROBLEM-STORE-POINTER*", $sym69$PPH_PROBLEM_STORE_POINTER );
    $free_pph_problem_store_pointers$ = SubLFiles.defparameter( "*FREE-PPH-PROBLEM-STORE-POINTERS*", misc_utilities.uninitialized() );
    $pph_problem_store_pointer$ = SubLFiles.defparameter( "*PPH-PROBLEM-STORE-POINTER*", NIL );
    $new_pph_phrases$ = SubLFiles.defparameter( "*NEW-PPH-PHRASES*", misc_utilities.uninitialized() );
    $destroy_new_pph_phrasesP$ = SubLFiles.defparameter( "*DESTROY-NEW-PPH-PHRASES?*", NIL );
    $creating_permanent_pph_phraseP$ = SubLFiles.defparameter( "*CREATING-PERMANENT-PPH-PHRASE?*", NIL );
    $new_pph_phrase_count$ = SubLFiles.defparameter( "*NEW-PPH-PHRASE-COUNT*", misc_utilities.uninitialized() );
    $inside_destroy_new_pph_phrasesP$ = SubLFiles.defparameter( "*INSIDE-DESTROY-NEW-PPH-PHRASES?*", NIL );
    $pph_disambiguation_mode_return_style$ = SubLFiles.defparameter( "*PPH-DISAMBIGUATION-MODE-RETURN-STYLE*", $kw214$PAIRS );
    $pph_timeout_time$ = SubLFiles.defparameter( "*PPH-TIMEOUT-TIME*", NIL );
    $pph_timeout_reachedP$ = SubLFiles.defparameter( "*PPH-TIMEOUT-REACHED?*", NIL );
    $pph_timeout_time_check_count$ = SubLFiles.defparameter( "*PPH-TIMEOUT-TIME-CHECK-COUNT*", ZERO_INTEGER );
    $pph_default_timeout$ = SubLFiles.defparameter( "*PPH-DEFAULT-TIMEOUT*", FIVE_INTEGER );
    $pph_var_types_counter$ = SubLFiles.defvar( "*PPH-VAR-TYPES-COUNTER*", ZERO_INTEGER );
    $max_suspended_method_depth$ = SubLFiles.defparameter( "*MAX-SUSPENDED-METHOD-DEPTH*", $int367$300 );
    $suspended_paraphrase_methods$ = SubLFiles.defparameter( "*SUSPENDED-PARAPHRASE-METHODS*", NIL );
    $allow_handling_of_pph_method_failuresP$ = SubLFiles.defparameter( "*ALLOW-HANDLING-OF-PPH-METHOD-FAILURES?*", T );
    $handling_pph_method_failuresP$ = SubLFiles.defparameter( "*HANDLING-PPH-METHOD-FAILURES?*", NIL );
    return NIL;
  }

  public static SubLObject setup_pph_macros_file()
  {
    access_macros.register_macro_helper( $sym32$PPH_OK_ARG0_FOR_LINKING_, $sym34$PPH_POSSIBLY_BINDING_CURRENT_ARG0 );
    access_macros.register_macro_helper( $sym63$FIND_OR_CREATE_PPH_MEMOIZATION_STATE, $sym64$WITH_PPH_MEMOIZATION );
    access_macros.register_macro_helper( $sym67$FIND_OR_CREATE_PPH_EXTERNAL_MEMOIZATION_STATE, $list68 );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_pph_problem_store_pointer$.getGlobalValue(), Symbols.symbol_function(
        $sym76$PPH_PROBLEM_STORE_POINTER_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list77 );
    Structures.def_csetf( $sym78$PPH_PROBLEM_STORE_POINTER_STORE, $sym79$_CSETF_PPH_PROBLEM_STORE_POINTER_STORE );
    Equality.identity( $sym69$PPH_PROBLEM_STORE_POINTER );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_pph_problem_store_pointer$.getGlobalValue(), Symbols.symbol_function(
        $sym86$VISIT_DEFSTRUCT_OBJECT_PPH_PROBLEM_STORE_POINTER_METHOD ) );
    access_macros.register_macro_helper( $sym89$FREE_PPH_PROBLEM_STORE_POINTER, $sym51$WITH_PPH_PROBLEM_STORE );
    access_macros.register_macro_helper( $sym99$FIND_OR_CREATE_PPH_PROBLEM_STORE_POINTER, $sym51$WITH_PPH_PROBLEM_STORE );
    access_macros.register_macro_helper( $sym107$DESTROY_NEW_PPH_PHRASES, $sym108$DESTROYING_NEW_PPH_PHRASES_WHEN_DONE );
    access_macros.register_macro_helper( $sym114$GET_NEW_PPH_PHRASE_COUNT, $sym108$DESTROYING_NEW_PPH_PHRASES_WHEN_DONE );
    access_macros.register_macro_helper( $sym128$WITHIN_NEW_PPH_DISCOURSE_CONTEXT, $sym129$ENSURING_PPH_DISCOURSE_CONTEXT );
    access_macros.register_macro_helper( $sym133$HERALD_NEW_DISCOURSE_CONTEXT, $sym128$WITHIN_NEW_PPH_DISCOURSE_CONTEXT );
    access_macros.register_macro_helper( $sym135$HERALD_END_OF_DISCOURSE_CONTEXT, $sym128$WITHIN_NEW_PPH_DISCOURSE_CONTEXT );
    access_macros.register_macro_helper( $sym137$PPH_DISCOURSE_CONTEXT_INITIALIZED_, $sym129$ENSURING_PPH_DISCOURSE_CONTEXT );
    access_macros.register_macro_helper( $sym138$CLEAR_PPH_DISCOURSE_CONTEXT, $sym128$WITHIN_NEW_PPH_DISCOURSE_CONTEXT );
    access_macros.register_macro_helper( $sym145$NOTE_LEAVING_SHADOWED_DISCOURSE_CONTEXT, $sym150$WITH_SHADOWED_DISCOURSE_CONTEXT );
    access_macros.register_macro_helper( $sym186$DO_ONE_PPH_OUTPUT_LIST_ITEM, $sym187$DO_PPH_OUTPUT_LIST );
    access_macros.register_macro_helper( $sym189$PPH_MAYBE_DO_SPACE_ITEM, $sym187$DO_PPH_OUTPUT_LIST );
    access_macros.register_macro_helper( $sym199$PPH_UPDATE_END_CHAR_INDEX, $sym187$DO_PPH_OUTPUT_LIST );
    access_macros.register_macro_helper( $sym195$PPH_MAKE_SPACE_STRING, $sym189$PPH_MAYBE_DO_SPACE_ITEM );
    access_macros.register_macro_helper( $sym190$WITH_PPH_REGULAR_OUTPUT_ITEM_BINDINGS, $sym187$DO_PPH_OUTPUT_LIST );
    access_macros.register_macro_helper( $sym193$PPH_OUTPUT_LIST_FIND_START_CHAR, $sym187$DO_PPH_OUTPUT_LIST );
    access_macros.register_macro_helper( $sym240$PPH_COMPUTE_TIMEOUT_TIME, $sym246$WITH_PPH_TIMEOUT );
    access_macros.register_macro_helper( $sym247$PPH_TIMEOUT, $sym246$WITH_PPH_TIMEOUT );
    access_macros.register_macro_helper( $sym287$COMPUTE_NEW_PPH_DEMERIT_CUTOFF, $sym288$WITH_MAXIMUM_PPH_DEMERIT_CUTOFF );
    access_macros.register_macro_helper( $sym314$PPH_JUSTIFICATION_HTML_FUNCTION_AND_TARGET, $sym315$WITH_PPH_JUSTIFICATION_GENERATION_PARAMETERS );
    access_macros.register_macro_helper( $sym327$PPH_RESET_VAR_TYPES, $sym329$PPH_SETTING_VAR_TYPES_IF_SUCCESSFUL );
    access_macros.register_macro_helper( $sym339$PPH_HANDLE_LOCAL_VARS, $sym340$PPH_POSSIBLY_BINDING_VARIABLES );
    access_macros.register_macro_helper( $sym368$MAX_SUSPENDED_METHOD_DEPTH, $sym369$HANDLING_PPH_METHOD_FAILURES );
    access_macros.register_macro_helper( $sym381$HANDLING_PPH_METHOD_FAILURES_TOP_LEVEL_P, $sym369$HANDLING_PPH_METHOD_FAILURES );
    access_macros.register_macro_helper( $sym378$NOTE_SUSPENDED_PARAPHRASE_METHOD_PLIST, $sym369$HANDLING_PPH_METHOD_FAILURES );
    access_macros.register_macro_helper( $sym395$PPH_PHRASE_RESTRICT_CYCL_TO_MT_SCOPE, $sym397$HANDLING_PPH_MT_SCOPE );
    access_macros.register_macro_helper( $sym396$PPH_PHRASE_RESTORE_AND_REPHRASE_CYCL_IF_MT_SCOPED, $sym397$HANDLING_PPH_MT_SCOPE );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_pph_macros_file();
  }

  @Override
  public void initializeVariables()
  {
    init_pph_macros_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_pph_macros_file();
  }
  static
  {
    me = new pph_macros();
    $pph_memoization_state$ = null;
    $pph_external_memoization_state$ = null;
    $dtp_pph_problem_store_pointer$ = null;
    $free_pph_problem_store_pointers$ = null;
    $pph_problem_store_pointer$ = null;
    $new_pph_phrases$ = null;
    $destroy_new_pph_phrasesP$ = null;
    $creating_permanent_pph_phraseP$ = null;
    $new_pph_phrase_count$ = null;
    $inside_destroy_new_pph_phrasesP$ = null;
    $pph_disambiguation_mode_return_style$ = null;
    $pph_timeout_time$ = null;
    $pph_timeout_reachedP$ = null;
    $pph_timeout_time_check_count$ = null;
    $pph_default_timeout$ = null;
    $pph_var_types_counter$ = null;
    $max_suspended_method_depth$ = null;
    $suspended_paraphrase_methods$ = null;
    $allow_handling_of_pph_method_failuresP$ = null;
    $handling_pph_method_failuresP$ = null;
    $list0 = ConsesLow.list( makeSymbol( "MAPPINGS" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym1$PROGN = makeSymbol( "PROGN" );
    $sym2$ENFORCE_TYPE = makeSymbol( "ENFORCE-TYPE" );
    $list3 = ConsesLow.list( makeSymbol( "ALIST-P" ) );
    $sym4$CLET = makeSymbol( "CLET" );
    $sym5$_PPH_TERM_PARAPHRASE_MAP_ = makeSymbol( "*PPH-TERM-PARAPHRASE-MAP*" );
    $sym6$CHECK_TYPE = makeSymbol( "CHECK-TYPE" );
    $list7 = ConsesLow.list( makeSymbol( "VALID-PPH-BLACKLIST?" ) );
    $sym8$_PPH_TERM_PARAPHRASE_BLACKLIST_ = makeSymbol( "*PPH-TERM-PARAPHRASE-BLACKLIST*" );
    $list9 = ConsesLow.cons( makeSymbol( "TERM" ), makeSymbol( "STRINGS" ) );
    $list10 = ConsesLow.list( makeSymbol( "LEXICAL-ASSERTIONS" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym11$CHECK_LIST_TYPE = makeSymbol( "CHECK-LIST-TYPE" );
    $list12 = ConsesLow.list( makeSymbol( "VALID-PPH-BLACKLIST-ASSERTION?" ) );
    $sym13$_PPH_LEXICAL_ASSERTION_BLACKLIST_ = makeSymbol( "*PPH-LEXICAL-ASSERTION-BLACKLIST*" );
    $list14 = ConsesLow.list( ConsesLow.list( makeSymbol( "FROM-PREFIX" ), makeSymbol( "TO-PREFIX" ), makeSymbol( "MAP" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym15$DO_ALIST = makeSymbol( "DO-ALIST" );
    $list16 = ConsesLow.list( ConsesLow.list( makeSymbol( "*PPH-AMBIGUOUS-STRINGS*" ), ConsesLow.list( makeSymbol( "FIRST-OF" ), makeSymbol( "*PPH-AMBIGUOUS-STRINGS*" ), ConsesLow.list( makeSymbol( "NEW-DICTIONARY" ),
        ConsesLow.list( makeSymbol( "FUNCTION" ), EQUALP ) ) ) ) );
    $list17 = ConsesLow.list( makeSymbol( "PRECISION" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list18 = ConsesLow.list( makeSymbol( "PPH-PRECISION-P" ) );
    $sym19$_PARAPHRASE_PRECISION_ = makeSymbol( "*PARAPHRASE-PRECISION*" );
    $list20 = ConsesLow.list( ConsesLow.list( makeSymbol( "*PPH-TERSE-MODE?*" ), T ) );
    $sym21$WITH_PARAPHRASE_PRECISION = makeSymbol( "WITH-PARAPHRASE-PRECISION" );
    $sym22$REMEMBERING_PPH_AMBIGUOUS_STRINGS = makeSymbol( "REMEMBERING-PPH-AMBIGUOUS-STRINGS" );
    $list23 = ConsesLow.list( makeSymbol( "NESTED-ARG-LIST" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list24 = ConsesLow.list( makeSymbol( "PPH-NESTED-ARG-LIST-P" ) );
    $list25 = ConsesLow.list( makeSymbol( "TERMS" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym26$_DEFINITE_DESCRIPTION_LICENSED_TERMS_ = makeSymbol( "*DEFINITE-DESCRIPTION-LICENSED-TERMS*" );
    $sym27$APPEND = makeSymbol( "APPEND" );
    $list28 = ConsesLow.list( ConsesLow.list( makeSymbol( "*PPH-MAXIMIZE-LINKS?*" ), T ), ConsesLow.list( makeSymbol( "*PPH-LINK-ARG0?*" ), T ), ConsesLow.list( makeSymbol( "*PPH-USE-SMART-VARIABLE-REPLACEMENT?*" ),
        NIL ) );
    $list29 = ConsesLow.list( ConsesLow.list( makeSymbol( "ARG0" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym30$_PPH_CURRENT_ARG0_ = makeSymbol( "*PPH-CURRENT-ARG0*" );
    $sym31$FIF = makeSymbol( "FIF" );
    $sym32$PPH_OK_ARG0_FOR_LINKING_ = makeSymbol( "PPH-OK-ARG0-FOR-LINKING?" );
    $list33 = ConsesLow.list( makeKeyword( "UNSPECIFIED" ) );
    $sym34$PPH_POSSIBLY_BINDING_CURRENT_ARG0 = makeSymbol( "PPH-POSSIBLY-BINDING-CURRENT-ARG0" );
    $list35 = ConsesLow.list( ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "TARGET" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym36$_CONSTANT_LINK_FUNCTION_ = makeSymbol( "*CONSTANT-LINK-FUNCTION*" );
    $sym37$FIRST_OF = makeSymbol( "FIRST-OF" );
    $list38 = ConsesLow.list( makeSymbol( "*CONSTANT-LINK-FUNCTION*" ) );
    $sym39$_HTML_GENERATION_TARGET_ = makeSymbol( "*HTML-GENERATION-TARGET*" );
    $list40 = ConsesLow.list( makeSymbol( "*HTML-GENERATION-TARGET*" ) );
    $list41 = ConsesLow.list( ConsesLow.list( makeSymbol( "FUNCTION-SPEC" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym42$_HTML_GENERATION_TERM_ID_FUNCTION_ = makeSymbol( "*HTML-GENERATION-TERM-ID-FUNCTION*" );
    $list43 = ConsesLow.list( ConsesLow.list( makeSymbol( "*CONSTANT-LINK-FUNCTION*" ), makeKeyword( "NONE" ) ) );
    $list44 = ConsesLow.list( ConsesLow.list( makeSymbol( "*ALLOW-UTF8-IN-PPH-TEXT-MODE*" ), T ) );
    $list45 = ConsesLow.list( makeSymbol( "FORM" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym46$_PPH_LINK_UNLINKED_PHRASES_TO_MATRIX_ARG0__ = makeSymbol( "*PPH-LINK-UNLINKED-PHRASES-TO-MATRIX-ARG0?*" );
    $sym47$CAND = makeSymbol( "CAND" );
    $list48 = ConsesLow.list( makeSymbol( "PPH-LINK-UNLINKED-PHRASES-TO-MATRIX-ARG0?" ) );
    $sym49$CNOT = makeSymbol( "CNOT" );
    $sym50$NEW_OR_REUSED = makeUninternedSymbol( "NEW-OR-REUSED" );
    $sym51$WITH_PPH_PROBLEM_STORE = makeSymbol( "WITH-PPH-PROBLEM-STORE" );
    $sym52$CMULTIPLE_VALUE_BIND = makeSymbol( "CMULTIPLE-VALUE-BIND" );
    $sym53$_PPH_MEMOIZATION_STATE_ = makeSymbol( "*PPH-MEMOIZATION-STATE*" );
    $list54 = ConsesLow.list( makeSymbol( "FIND-OR-CREATE-PPH-MEMOIZATION-STATE" ) );
    $list55 = ConsesLow.list( ConsesLow.list( makeSymbol( "*PPH-EXTERNAL-MEMOIZATION-STATE*" ), ConsesLow.list( makeSymbol( "FIND-OR-CREATE-PPH-EXTERNAL-MEMOIZATION-STATE" ) ) ) );
    $sym56$WITH_MEMOIZATION_STATE = makeSymbol( "WITH-MEMOIZATION-STATE" );
    $list57 = ConsesLow.list( makeSymbol( "*PPH-MEMOIZATION-STATE*" ) );
    $sym58$PWHEN = makeSymbol( "PWHEN" );
    $list59 = ConsesLow.list( makeKeyword( "NEW" ) );
    $list60 = ConsesLow.list( ConsesLow.list( makeSymbol( "MEMOIZATION-STATE-P" ), makeSymbol( "*PPH-MEMOIZATION-STATE*" ) ) );
    $list61 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLEAR-ALL-MEMOIZATION" ), makeSymbol( "*PPH-MEMOIZATION-STATE*" ) ) );
    $list62 = ConsesLow.list( ConsesLow.list( makeSymbol( "FIND-OR-CREATE-PPH-EXTERNAL-MEMOIZATION-STATE" ) ) );
    $sym63$FIND_OR_CREATE_PPH_MEMOIZATION_STATE = makeSymbol( "FIND-OR-CREATE-PPH-MEMOIZATION-STATE" );
    $sym64$WITH_PPH_MEMOIZATION = makeSymbol( "WITH-PPH-MEMOIZATION" );
    $kw65$REUSED = makeKeyword( "REUSED" );
    $kw66$NEW = makeKeyword( "NEW" );
    $sym67$FIND_OR_CREATE_PPH_EXTERNAL_MEMOIZATION_STATE = makeSymbol( "FIND-OR-CREATE-PPH-EXTERNAL-MEMOIZATION-STATE" );
    $list68 = ConsesLow.list( makeSymbol( "WITH-PPH-MEMOIZATION" ), makeSymbol( "WITH-PPH-EXTERNAL-MEMOIZATION" ) );
    $sym69$PPH_PROBLEM_STORE_POINTER = makeSymbol( "PPH-PROBLEM-STORE-POINTER" );
    $sym70$PPH_PROBLEM_STORE_POINTER_P = makeSymbol( "PPH-PROBLEM-STORE-POINTER-P" );
    $list71 = ConsesLow.list( makeSymbol( "STORE" ) );
    $list72 = ConsesLow.list( makeKeyword( "STORE" ) );
    $list73 = ConsesLow.list( makeSymbol( "PPH-PROBLEM-STORE-POINTER-STORE" ) );
    $list74 = ConsesLow.list( makeSymbol( "_CSETF-PPH-PROBLEM-STORE-POINTER-STORE" ) );
    $sym75$PPRINT_PPH_PROBLEM_STORE_POINTER = makeSymbol( "PPRINT-PPH-PROBLEM-STORE-POINTER" );
    $sym76$PPH_PROBLEM_STORE_POINTER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "PPH-PROBLEM-STORE-POINTER-PRINT-FUNCTION-TRAMPOLINE" );
    $list77 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "PPH-PROBLEM-STORE-POINTER-P" ) );
    $sym78$PPH_PROBLEM_STORE_POINTER_STORE = makeSymbol( "PPH-PROBLEM-STORE-POINTER-STORE" );
    $sym79$_CSETF_PPH_PROBLEM_STORE_POINTER_STORE = makeSymbol( "_CSETF-PPH-PROBLEM-STORE-POINTER-STORE" );
    $kw80$STORE = makeKeyword( "STORE" );
    $str81$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw82$BEGIN = makeKeyword( "BEGIN" );
    $sym83$MAKE_PPH_PROBLEM_STORE_POINTER = makeSymbol( "MAKE-PPH-PROBLEM-STORE-POINTER" );
    $kw84$SLOT = makeKeyword( "SLOT" );
    $kw85$END = makeKeyword( "END" );
    $sym86$VISIT_DEFSTRUCT_OBJECT_PPH_PROBLEM_STORE_POINTER_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-PPH-PROBLEM-STORE-POINTER-METHOD" );
    $str87$_PPH_PSP__S_ = makeString( "<PPH-PSP ~S>" );
    $kw88$SKIP = makeKeyword( "SKIP" );
    $sym89$FREE_PPH_PROBLEM_STORE_POINTER = makeSymbol( "FREE-PPH-PROBLEM-STORE-POINTER" );
    $kw90$FREE = makeKeyword( "FREE" );
    $str91$__Initial_PPH_problem_store___S__ = makeString( "~&Initial PPH problem store: ~S~%" );
    $sym92$REUSE_ = makeUninternedSymbol( "REUSE?" );
    $list93 = ConsesLow.list( ConsesLow.list( makeSymbol( "*FREE-PPH-PROBLEM-STORE-POINTERS*" ), NIL ) );
    $sym94$_PPH_PROBLEM_STORE_POINTER_ = makeSymbol( "*PPH-PROBLEM-STORE-POINTER*" );
    $list95 = ConsesLow.list( makeSymbol( "FIND-OR-CREATE-PPH-PROBLEM-STORE-POINTER" ) );
    $sym96$CUNWIND_PROTECT = makeSymbol( "CUNWIND-PROTECT" );
    $sym97$PUNLESS = makeSymbol( "PUNLESS" );
    $list98 = ConsesLow.list( ConsesLow.list( makeSymbol( "FREE-PPH-PROBLEM-STORE-POINTER" ), makeSymbol( "*PPH-PROBLEM-STORE-POINTER*" ) ) );
    $sym99$FIND_OR_CREATE_PPH_PROBLEM_STORE_POINTER = makeSymbol( "FIND-OR-CREATE-PPH-PROBLEM-STORE-POINTER" );
    $str100$Destroying_PPH_problem_store___S_ = makeString( "Destroying PPH problem store: ~S~%" );
    $str101$_PPH_error_level_ = makeString( "(PPH error level " );
    $str102$__ = makeString( ") " );
    $str103$New_PPH_problem_store_is_not_ok__ = makeString( "New PPH problem store is not ok: ~S" );
    $int104$100000 = makeInteger( 100000 );
    $list105 = ConsesLow.list( ConsesLow.list( makeSymbol( "*NEW-PPH-PHRASES*" ), ConsesLow.list( makeSymbol( "CREATE-STACK" ) ) ), ConsesLow.list( makeSymbol( "*NEW-PPH-PHRASE-COUNT*" ), ZERO_INTEGER ), ConsesLow.list(
        makeSymbol( "*CREATING-PERMANENT-PPH-PHRASE?*" ), T ) );
    $kw106$NOTED = makeKeyword( "NOTED" );
    $sym107$DESTROY_NEW_PPH_PHRASES = makeSymbol( "DESTROY-NEW-PPH-PHRASES" );
    $sym108$DESTROYING_NEW_PPH_PHRASES_WHEN_DONE = makeSymbol( "DESTROYING-NEW-PPH-PHRASES-WHEN-DONE" );
    $sym109$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $str110$error_while_destroying_phrase___S = makeString( "error while destroying phrase: ~S" );
    $str111$Destroyed__S_PPH_phrases____New_o = makeString( "Destroyed ~S PPH phrases.~% New object count: ~S size: ~S" );
    $list112 = ConsesLow.list( ConsesLow.list( makeSymbol( "*NEW-PPH-PHRASES*" ), ConsesLow.list( makeSymbol( "CREATE-STACK" ) ) ), ConsesLow.list( makeSymbol( "*NEW-PPH-PHRASE-COUNT*" ), ConsesLow.list( makeSymbol(
        "GET-NEW-PPH-PHRASE-COUNT" ) ) ), ConsesLow.list( makeSymbol( "*DESTROY-NEW-PPH-PHRASES?*" ), T ) );
    $list113 = ConsesLow.list( ConsesLow.list( makeSymbol( "DESTROY-NEW-PPH-PHRASES" ) ) );
    $sym114$GET_NEW_PPH_PHRASE_COUNT = makeSymbol( "GET-NEW-PPH-PHRASE-COUNT" );
    $list115 = ConsesLow.list( ConsesLow.list( makeSymbol( "DESTROY?" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym116$MATRIX_NEW_PPH_PHRASES = makeUninternedSymbol( "MATRIX-NEW-PPH-PHRASES" );
    $sym117$PHRASE = makeUninternedSymbol( "PHRASE" );
    $list118 = ConsesLow.list( makeSymbol( "*NEW-PPH-PHRASES*" ) );
    $list119 = ConsesLow.list( makeSymbol( "*NEW-PPH-PHRASE-COUNT*" ), ConsesLow.list( makeSymbol( "GET-NEW-PPH-PHRASE-COUNT" ) ) );
    $list120 = ConsesLow.list( makeSymbol( "*NEW-PPH-PHRASES*" ), ConsesLow.list( makeSymbol( "CREATE-STACK" ) ) );
    $list121 = ConsesLow.list( NIL );
    $sym122$PIF = makeSymbol( "PIF" );
    $list123 = ConsesLow.list( makeSymbol( "DESTROY-NEW-PPH-PHRASES" ) );
    $sym124$DO_STACK_ELEMENTS = makeSymbol( "DO-STACK-ELEMENTS" );
    $sym125$STACK_PUSH = makeSymbol( "STACK-PUSH" );
    $list126 = ConsesLow.list( makeSymbol( "PPH-DISCOURSE-CONTEXT-INITIALIZED?" ) );
    $list127 = ConsesLow.list( makeSymbol( "PPH-ENSURE-DISCOURSE-PARTICIPANT-RMS" ) );
    $sym128$WITHIN_NEW_PPH_DISCOURSE_CONTEXT = makeSymbol( "WITHIN-NEW-PPH-DISCOURSE-CONTEXT" );
    $sym129$ENSURING_PPH_DISCOURSE_CONTEXT = makeSymbol( "ENSURING-PPH-DISCOURSE-CONTEXT" );
    $list130 = ConsesLow.list( ConsesLow.list( makeSymbol( "*PPH-DISCOURSE-CONTEXT*" ), ConsesLow.list( makeSymbol( "NEW-PPH-DISCOURSE-CONTEXT" ) ) ) );
    $list131 = ConsesLow.list( makeSymbol( "HERALD-NEW-DISCOURSE-CONTEXT" ) );
    $list132 = ConsesLow.list( ConsesLow.list( makeSymbol( "HERALD-END-OF-DISCOURSE-CONTEXT" ) ), ConsesLow.list( makeSymbol( "CLEAR-PPH-DISCOURSE-CONTEXT" ) ) );
    $sym133$HERALD_NEW_DISCOURSE_CONTEXT = makeSymbol( "HERALD-NEW-DISCOURSE-CONTEXT" );
    $str134$__Entering_WITHIN_NEW_PPH_DISCOUR = makeString( "~&Entering WITHIN-NEW-PPH-DISCOURSE-CONTEXT, *pph-discourse-context* is~% ~S~%" );
    $sym135$HERALD_END_OF_DISCOURSE_CONTEXT = makeSymbol( "HERALD-END-OF-DISCOURSE-CONTEXT" );
    $str136$__Leaving_WITHIN_NEW_PPH_DISCOURS = makeString( "~&Leaving WITHIN-NEW-PPH-DISCOURSE-CONTEXT, *pph-discourse-context* is~% ~S~%" );
    $sym137$PPH_DISCOURSE_CONTEXT_INITIALIZED_ = makeSymbol( "PPH-DISCOURSE-CONTEXT-INITIALIZED?" );
    $sym138$CLEAR_PPH_DISCOURSE_CONTEXT = makeSymbol( "CLEAR-PPH-DISCOURSE-CONTEXT" );
    $list139 = ConsesLow.list( ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "NEW-RMS-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $kw140$CYC_LEXICON = makeKeyword( "CYC-LEXICON" );
    $sym141$MATRIX_RMS = makeUninternedSymbol( "MATRIX-RMS" );
    $str142$NIL = makeString( "NIL" );
    $sym143$IGNORE = makeSymbol( "IGNORE" );
    $sym144$CSETQ = makeSymbol( "CSETQ" );
    $sym145$NOTE_LEAVING_SHADOWED_DISCOURSE_CONTEXT = makeSymbol( "NOTE-LEAVING-SHADOWED-DISCOURSE-CONTEXT" );
    $sym146$_PPH_DISCOURSE_CONTEXT_ = makeSymbol( "*PPH-DISCOURSE-CONTEXT*" );
    $list147 = ConsesLow.list( ConsesLow.list( makeSymbol( "PPH-DISCOURSE-CONTEXT-RMS" ) ) );
    $list148 = ConsesLow.list( ConsesLow.list( makeSymbol( "*PPH-DISCOURSE-CONTEXT*" ), ConsesLow.list( makeSymbol( "PPH-DISCOURSE-CONTEXT-COPY" ) ) ) );
    $list149 = ConsesLow.list( makeSymbol( "PPH-NOTE" ), ONE_INTEGER, makeString( "~&Shadowing discourse context...~%" ) );
    $sym150$WITH_SHADOWED_DISCOURSE_CONTEXT = makeSymbol( "WITH-SHADOWED-DISCOURSE-CONTEXT" );
    $str151$__Leaving__S = makeString( "~&Leaving ~S" );
    $str152$New_RMS___S = makeString( "New RMS: ~S" );
    $list153 = ConsesLow.list( ConsesLow.list( makeSymbol( "SPEAKER" ), makeSymbol( "ADDRESSEE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym154$_PPH_SPEAKER_ = makeSymbol( "*PPH-SPEAKER*" );
    $sym155$_PPH_ADDRESSEE_ = makeSymbol( "*PPH-ADDRESSEE*" );
    $list156 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "STRING" ), makeSymbol( "OUTPUT-LIST" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "PARANOID-ARG" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "PARANOID-ARG" ) ) ), ConsesLow.list( makeSymbol( "OUTPUT-ITEM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "OUTPUT-ITEM" ) ) ), ConsesLow.list( makeSymbol( "ARG-POSITION" ),
            ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ARG-POSITION" ) ) ), ConsesLow.list( makeSymbol( "HTML-OPEN-TAG" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "HTML-OPEN-TAG" ) ) ), ConsesLow
                .list( makeSymbol( "HTML-CLOSE-TAG" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "HTML-CLOSE-TAG" ) ) ), ConsesLow.list( makeSymbol( "START-CHAR-INDEX" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                    makeSymbol( "START-CHAR-INDEX" ) ) ), ConsesLow.list( makeSymbol( "WHOLE-STRING" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "WHOLE-STRING" ) ) )
    } ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list157 = ConsesLow.list( makeKeyword( "PARANOID-ARG" ), makeKeyword( "OUTPUT-ITEM" ), makeKeyword( "ARG-POSITION" ), makeKeyword( "HTML-OPEN-TAG" ), makeKeyword( "HTML-CLOSE-TAG" ), makeKeyword(
        "START-CHAR-INDEX" ), makeKeyword( "WHOLE-STRING" ) );
    $kw158$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw159$PARANOID_ARG = makeKeyword( "PARANOID-ARG" );
    $sym160$PARANOID_ARG = makeSymbol( "PARANOID-ARG" );
    $kw161$OUTPUT_ITEM = makeKeyword( "OUTPUT-ITEM" );
    $sym162$OUTPUT_ITEM = makeSymbol( "OUTPUT-ITEM" );
    $kw163$ARG_POSITION = makeKeyword( "ARG-POSITION" );
    $sym164$ARG_POSITION = makeSymbol( "ARG-POSITION" );
    $kw165$HTML_OPEN_TAG = makeKeyword( "HTML-OPEN-TAG" );
    $sym166$HTML_OPEN_TAG = makeSymbol( "HTML-OPEN-TAG" );
    $kw167$HTML_CLOSE_TAG = makeKeyword( "HTML-CLOSE-TAG" );
    $sym168$HTML_CLOSE_TAG = makeSymbol( "HTML-CLOSE-TAG" );
    $kw169$START_CHAR_INDEX = makeKeyword( "START-CHAR-INDEX" );
    $sym170$START_CHAR_INDEX = makeSymbol( "START-CHAR-INDEX" );
    $kw171$WHOLE_STRING = makeKeyword( "WHOLE-STRING" );
    $sym172$WHOLE_STRING = makeSymbol( "WHOLE-STRING" );
    $sym173$ITEM = makeUninternedSymbol( "ITEM" );
    $sym174$WHOLE_HTML_STRING = makeUninternedSymbol( "WHOLE-HTML-STRING" );
    $sym175$END_CHAR_INDEX = makeUninternedSymbol( "END-CHAR-INDEX" );
    $sym176$ITERATOR = makeUninternedSymbol( "ITERATOR" );
    $list177 = ConsesLow.list( makeSymbol( "PPH-PHRASE-OUTPUT-LIST-P" ) );
    $list178 = ConsesLow.list( ZERO_INTEGER );
    $sym179$PPH_PHRASE_OUTPUT_LIST_STRING = makeSymbol( "PPH-PHRASE-OUTPUT-LIST-STRING" );
    $list180 = ConsesLow.list( T );
    $sym181$PPH_REMOVE_HTML_TAGS = makeSymbol( "PPH-REMOVE-HTML-TAGS" );
    $sym182$NEW_PPH_PHRASE_OUTPUT_LIST_ITERATOR = makeSymbol( "NEW-PPH-PHRASE-OUTPUT-LIST-ITERATOR" );
    $sym183$UNTIL = makeSymbol( "UNTIL" );
    $sym184$PPH_PHRASE_OUTPUT_LIST_ITERATOR_EMPTY_P = makeSymbol( "PPH-PHRASE-OUTPUT-LIST-ITERATOR-EMPTY-P" );
    $sym185$PPH_PHRASE_OUTPUT_LIST_ITERATOR_NEXT = makeSymbol( "PPH-PHRASE-OUTPUT-LIST-ITERATOR-NEXT" );
    $sym186$DO_ONE_PPH_OUTPUT_LIST_ITEM = makeSymbol( "DO-ONE-PPH-OUTPUT-LIST-ITEM" );
    $sym187$DO_PPH_OUTPUT_LIST = makeSymbol( "DO-PPH-OUTPUT-LIST" );
    $list188 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "ITEM" ), makeSymbol( "STRING" ), makeSymbol( "ARG-POSITION" ), makeSymbol( "HTML-OPEN-TAG" ), makeSymbol( "HTML-CLOSE-TAG" ), makeSymbol(
        "PARANOID-ARG" ), makeSymbol( "OUTPUT-ITEM" ), makeSymbol( "WHOLE-STRING" ), makeSymbol( "START-CHAR-INDEX" ), makeSymbol( "END-CHAR-INDEX" )
    } ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym189$PPH_MAYBE_DO_SPACE_ITEM = makeSymbol( "PPH-MAYBE-DO-SPACE-ITEM" );
    $sym190$WITH_PPH_REGULAR_OUTPUT_ITEM_BINDINGS = makeSymbol( "WITH-PPH-REGULAR-OUTPUT-ITEM-BINDINGS" );
    $sym191$RAW_ITEM_STRING = makeUninternedSymbol( "RAW-ITEM-STRING" );
    $sym192$PPH_PHRASE_OUTPUT_ITEM_GET_STRING = makeSymbol( "PPH-PHRASE-OUTPUT-ITEM-GET-STRING" );
    $sym193$PPH_OUTPUT_LIST_FIND_START_CHAR = makeSymbol( "PPH-OUTPUT-LIST-FIND-START-CHAR" );
    $sym194$_ = makeSymbol( ">" );
    $sym195$PPH_MAKE_SPACE_STRING = makeSymbol( "PPH-MAKE-SPACE-STRING" );
    $list196 = ConsesLow.list( ConsesLow.list( makeSymbol( "PPH-UNKNOWN-ARG-POSITION" ) ) );
    $list197 = ConsesLow.list( ConsesLow.list( makeSymbol( "PPH-EMPTY-CYCL" ) ) );
    $sym198$NEW_PPH_PHRASE_FILLER_ITEM = makeSymbol( "NEW-PPH-PHRASE-FILLER-ITEM" );
    $sym199$PPH_UPDATE_END_CHAR_INDEX = makeSymbol( "PPH-UPDATE-END-CHAR-INDEX" );
    $str200$Adding_space_string_of_length__S = makeString( "Adding space string of length ~S" );
    $list201 = ConsesLow.list( ConsesLow.list( makeSymbol( "ITEM" ), makeSymbol( "STRING" ), makeSymbol( "ARG-POSITION" ), makeSymbol( "HTML-OPEN-TAG" ), makeSymbol( "HTML-CLOSE-TAG" ), makeSymbol( "PARANOID-ARG" ),
        makeSymbol( "OUTPUT-ITEM" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym202$PPH_PHRASE_OUTPUT_ITEM_ARG_POSITION = makeSymbol( "PPH-PHRASE-OUTPUT-ITEM-ARG-POSITION" );
    $sym203$PPH_PHRASE_OUTPUT_ITEM_HTML_OPEN_TAG = makeSymbol( "PPH-PHRASE-OUTPUT-ITEM-HTML-OPEN-TAG" );
    $sym204$PPH_PHRASE_OUTPUT_ITEM_HTML_CLOSE_TAG = makeSymbol( "PPH-PHRASE-OUTPUT-ITEM-HTML-CLOSE-TAG" );
    $sym205$PPH_PHRASE_OUTPUT_ITEM_CYCL = makeSymbol( "PPH-PHRASE-OUTPUT-ITEM-CYCL" );
    $sym206$PPH_STRING_P = makeSymbol( "PPH-STRING-P" );
    $sym207$PPH_CHAR__ = makeSymbol( "PPH-CHAR-=" );
    $str208$Couldn_t_find__S_in__S___ = makeString( "Couldn't find ~S in ~S.~%" );
    $list209 = ConsesLow.list( ConsesLow.list( makeSymbol( "ITEM" ), makeSymbol( "JAVALIST" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list210 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw211$DONE = makeKeyword( "DONE" );
    $sym212$CSOME = makeSymbol( "CSOME" );
    $sym213$PPH_NJAVALIST_ITEMS = makeSymbol( "PPH-NJAVALIST-ITEMS" );
    $kw214$PAIRS = makeKeyword( "PAIRS" );
    $list215 = ConsesLow.list( ConsesLow.list( makeSymbol( "ANS" ), makeSymbol( "THRESHOLD" ), makeSymbol( "NOTIFICATION-FUNCTION-SPEC" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "RETURN-STYLE" ), makeKeyword(
        "JAVALISTS" ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list216 = ConsesLow.list( makeKeyword( "RETURN-STYLE" ) );
    $kw217$RETURN_STYLE = makeKeyword( "RETURN-STYLE" );
    $kw218$JAVALISTS = makeKeyword( "JAVALISTS" );
    $list219 = ConsesLow.list( makeSymbol( "*PARTIAL-RESULTS-INITIALIZATION-FN*" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INITIALIZE-DISAMBIGUATION-PHRASES" ) ) );
    $list220 = ConsesLow.list( makeSymbol( "*PARTIAL-RESULTS-ACCUMULATION-FN*" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ACCUMULATE-DISAMBIGUATION-PHRASES" ) ) );
    $list221 = ConsesLow.list( makeSymbol( "*PARTIAL-RESULTS-CONSOLIDATION-FN*" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CONSOLIDATE-DISAMBIGUATION-PHRASES" ) ) );
    $sym222$_PARTIAL_RESULTS_NOTIFICATION_FN_ = makeSymbol( "*PARTIAL-RESULTS-NOTIFICATION-FN*" );
    $list223 = ConsesLow.list( makeSymbol( "*PARTIAL-RESULTS-FINAL-RESULT-FN*" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FINAL-RESULTS-FOR-DISAMBIGUATION-PHRASES" ) ) );
    $sym224$_PPH_DISAMBIGUATION_MODE_RETURN_STYLE_ = makeSymbol( "*PPH-DISAMBIGUATION-MODE-RETURN-STYLE*" );
    $sym225$WITH_PARTIAL_RESULTS_ACCUMULATION = makeSymbol( "WITH-PARTIAL-RESULTS-ACCUMULATION" );
    $sym226$INCREMENTAL_PPH_DISAMBIGUATION_RESULT_P = makeSymbol( "INCREMENTAL-PPH-DISAMBIGUATION-RESULT-P" );
    $str227$Don_t_know_how_to_accumulate__S_a = makeString( "Don't know how to accumulate ~S answers." );
    $sym228$_ = makeSymbol( "<" );
    $list229 = ConsesLow.list( ConsesLow.list( makeSymbol( "PROBLEM-DICTIONARY-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym230$MATRIX_PROBLEM_DICTIONARY = makeUninternedSymbol( "MATRIX-PROBLEM-DICTIONARY" );
    $list231 = ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-DICTIONARY" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQL ) ) );
    $list232 = ConsesLow.list( makeSymbol( "*PPH-PROBLEM-REPORTS*" ) );
    $list233 = ConsesLow.list( makeSymbol( "*PPH-PROBLEM-REPORTING-MODE*" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "PPH-PROBLEM-REPORTING-ON-P" ) ), makeSymbol(
        "*PPH-PROBLEM-REPORTING-MODE*" ), makeKeyword( "QUIET" ) ) );
    $sym234$_PPH_PROBLEM_REPORTS_ = makeSymbol( "*PPH-PROBLEM-REPORTS*" );
    $sym235$DICTIONARY_P = makeSymbol( "DICTIONARY-P" );
    $sym236$PPH_MERGE_PROBLEM_DICTIONARY = makeSymbol( "PPH-MERGE-PROBLEM-DICTIONARY" );
    $list237 = ConsesLow.list( ConsesLow.list( makeSymbol( "TIMED-OUT?" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "DELAY-IN-SECONDS" ), ConsesLow.list( makeSymbol( "PPH-TIMEOUT" ) ) ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $list238 = ConsesLow.list( makeSymbol( "*PPH-TIMEOUT-TIME-CHECK-COUNT*" ), ZERO_INTEGER );
    $sym239$_PPH_TIMEOUT_TIME_ = makeSymbol( "*PPH-TIMEOUT-TIME*" );
    $sym240$PPH_COMPUTE_TIMEOUT_TIME = makeSymbol( "PPH-COMPUTE-TIMEOUT-TIME" );
    $list241 = ConsesLow.list( ConsesLow.list( makeSymbol( "*PPH-TIMEOUT-REACHED?*" ), makeSymbol( "*PPH-TIMEOUT-REACHED?*" ) ) );
    $list242 = ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "*PPH-TIMEOUT-REACHED?*" ), ConsesLow.list( makeSymbol( "PPH-TIMEOUT-TIME-REACHED?" ) ) );
    $sym243$_PPH_TIMEOUT_REACHED__ = makeSymbol( "*PPH-TIMEOUT-REACHED?*" );
    $list244 = ConsesLow.list( ConsesLow.list( makeSymbol( "PPH-TIMEOUT-TIME-REACHED?" ) ) );
    $str245$PPH_timeout_reached_ = makeString( "PPH timeout reached." );
    $sym246$WITH_PPH_TIMEOUT = makeSymbol( "WITH-PPH-TIMEOUT" );
    $sym247$PPH_TIMEOUT = makeSymbol( "PPH-TIMEOUT" );
    $sym248$ALREADY_INITIALIZED_ = makeUninternedSymbol( "ALREADY-INITIALIZED?" );
    $list249 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZED-P" ), makeSymbol( "*PPH-UNEXPRESSED-NEGATIONS*" ) ) );
    $sym250$_PPH_UNEXPRESSED_NEGATIONS_ = makeSymbol( "*PPH-UNEXPRESSED-NEGATIONS*" );
    $list251 = ConsesLow.list( makeSymbol( "*PPH-UNEXPRESSED-NEGATIONS*" ), ConsesLow.list( makeSymbol( "NEW-SET" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQUAL ) ) );
    $sym252$COR = makeSymbol( "COR" );
    $list253 = ConsesLow.list( ConsesLow.list( makeSymbol( "SET-EMPTY?" ), makeSymbol( "*PPH-UNEXPRESSED-NEGATIONS*" ) ) );
    $list254 = ConsesLow.list( ConsesLow.list( makeSymbol( "PPH-ERROR" ), ONE_INTEGER, makeString( "Abandoning unexpressed negations: ~S" ), makeSymbol( "*PPH-UNEXPRESSED-NEGATIONS*" ) ) );
    $list255 = ConsesLow.list( makeSymbol( "GENERATION-MT" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym256$_PPH_LANGUAGE_MT_ = makeSymbol( "*PPH-LANGUAGE-MT*" );
    $sym257$PPH_CANONICALIZE_HLMT = makeSymbol( "PPH-CANONICALIZE-HLMT" );
    $list258 = ConsesLow.list( makeSymbol( "*PPH-LANGUAGE-MT*" ) );
    $list259 = ConsesLow.list( makeSymbol( "DOMAIN-MT" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym260$_PPH_DOMAIN_MT_ = makeSymbol( "*PPH-DOMAIN-MT*" );
    $list261 = ConsesLow.list( makeSymbol( "*PPH-DOMAIN-MT*" ) );
    $list262 = ConsesLow.list( ConsesLow.list( makeSymbol( "GENERATION-MT" ), makeSymbol( "DOMAIN-MT" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym263$POSSIBLY_WITH_PPH_LANGUAGE_MT = makeSymbol( "POSSIBLY-WITH-PPH-LANGUAGE-MT" );
    $sym264$POSSIBLY_WITH_PPH_DOMAIN_MT = makeSymbol( "POSSIBLY-WITH-PPH-DOMAIN-MT" );
    $list265 = ConsesLow.list( ConsesLow.list( makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "BROADEN?" ), NIL ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym266$WITH_INFERENCE_MT_RELEVANCE = makeSymbol( "WITH-INFERENCE-MT-RELEVANCE" );
    $sym267$BROADENED_LANGUAGE_MT = makeUninternedSymbol( "BROADENED-LANGUAGE-MT" );
    $sym268$WITH_PPH_LANGUAGE_MT_RELEVANCE = makeSymbol( "WITH-PPH-LANGUAGE-MT-RELEVANCE" );
    $list269 = ConsesLow.list( ConsesLow.list( makeSymbol( "PPH-BROADEN-LANGUAGE-MT" ) ) );
    $sym270$HLMT_EQUAL_ = makeSymbol( "HLMT-EQUAL?" );
    $list271 = ConsesLow.list( makeSymbol( "PPH-WARN" ), ONE_INTEGER, makeString( "Broadening *PPH-LANGUAGE-MT* to ~S" ), makeSymbol( "*PPH-LANGUAGE-MT*" ) );
    $list272 = ConsesLow.list( makeSymbol( "PPH-ENHANCED-DOMAIN-MT" ) );
    $list273 = ConsesLow.list( ConsesLow.list( makeSymbol( "FN" ), makeSymbol( "MT" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym274$DO_DICTIONARY = makeSymbol( "DO-DICTIONARY" );
    $list275 = ConsesLow.list( makeSymbol( "*PPH-PHRASE-FNS*" ) );
    $list276 = ConsesLow.list( ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INIT-STATE" ) ) );
    $list277 = ConsesLow.list( ConsesLow.list( makeSymbol( "OK?" ), makeSymbol( "OBJECT" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym278$SUSPEND_ = makeUninternedSymbol( "SUSPEND?" );
    $sym279$_PPH_USE_BULLETED_LISTS__ = makeSymbol( "*PPH-USE-BULLETED-LISTS?*" );
    $sym280$PPH_NOTE = makeSymbol( "PPH-NOTE" );
    $str281$__Suspending_bullet_use_for____S_ = makeString( "~&Suspending bullet use for~% ~S~%" );
    $list282 = ConsesLow.list( ConsesLow.list( makeSymbol( "PPH-NOTE" ), ONE_INTEGER, makeString( "~&Turning bullet use back on.~%" ) ) );
    $list283 = ConsesLow.list( ConsesLow.list( makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "CUTOFF" ), makeSymbol( "*PPH-SUGGESTED-DEMERIT-CUTOFF*" ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym284$PPH_CHECK_TYPE = makeSymbol( "PPH-CHECK-TYPE" );
    $list285 = ConsesLow.list( makeSymbol( "VALID-PPH-DEMERIT-CUTOFF-P" ) );
    $sym286$_PPH_DEMERIT_CUTOFF_ = makeSymbol( "*PPH-DEMERIT-CUTOFF*" );
    $sym287$COMPUTE_NEW_PPH_DEMERIT_CUTOFF = makeSymbol( "COMPUTE-NEW-PPH-DEMERIT-CUTOFF" );
    $sym288$WITH_MAXIMUM_PPH_DEMERIT_CUTOFF = makeSymbol( "WITH-MAXIMUM-PPH-DEMERIT-CUTOFF" );
    $sym289$INTEGERP = makeSymbol( "INTEGERP" );
    $list290 = ConsesLow.list( ConsesLow.list( makeSymbol( "SECONDS" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym291$OLD_GRACE_PERIOD = makeUninternedSymbol( "OLD-GRACE-PERIOD" );
    $list292 = ConsesLow.list( ConsesLow.list( makeSymbol( "DELAYED-PROCESSOR-GET-DELAY-SECONDS" ), ConsesLow.list( makeSymbol( "PPH-PHRASE-DESTROYER" ) ) ) );
    $sym293$SET_PPH_PHRASE_DESTRUCTION_GRACE_PERIOD = makeSymbol( "SET-PPH-PHRASE-DESTRUCTION-GRACE-PERIOD" );
    $sym294$MAX = makeSymbol( "MAX" );
    $list295 = ConsesLow.list( ConsesLow.list( makeSymbol( "*BYPASS-PPH-PHRASE-DESTROYER?*" ), NIL ) );
    $list296 = ConsesLow.list( ConsesLow.list( makeSymbol( "*PPH-DISPLAYED-PROOFS*" ), ConsesLow.list( makeSymbol( "FIND-OR-CREATE-PPH-DISPLAYED-PROOF-STACK" ) ) ), ConsesLow.list( makeSymbol( "*PPH-JUSTIFIED-PROOFS*" ),
        ConsesLow.list( makeSymbol( "FIND-OR-CREATE-PPH-JUSTIFIED-PROOF-SET" ) ) ) );
    $list297 = ConsesLow.list( ConsesLow.list( makeSymbol( "INFERENCE-ANSWER" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym298$_PPH_INFERENCE_ANSWER_ = makeSymbol( "*PPH-INFERENCE-ANSWER*" );
    $sym299$WITH_PPH_INFERENCE = makeSymbol( "WITH-PPH-INFERENCE" );
    $sym300$INFERENCE_ANSWER_INFERENCE = makeSymbol( "INFERENCE-ANSWER-INFERENCE" );
    $list301 = ConsesLow.list( ConsesLow.list( makeSymbol( "INFERENCE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym302$_PPH_HYPOTHETICAL_VARS_ = makeSymbol( "*PPH-HYPOTHETICAL-VARS*" );
    $sym303$INFERENCE_HYPOTHETICAL_BINDINGS = makeSymbol( "INFERENCE-HYPOTHETICAL-BINDINGS" );
    $list304 = ConsesLow.list( makeSymbol( "*PPH-HANDLE-HYPOTHETICALS?*" ), T );
    $sym305$PPH_ENHANCED_DOMAIN_MT = makeSymbol( "PPH-ENHANCED-DOMAIN-MT" );
    $sym306$PPH_GET_INFERENCE_MT = makeSymbol( "PPH-GET-INFERENCE-MT" );
    $sym307$WITH_PPH_INFERENCE_ANSWER = makeSymbol( "WITH-PPH-INFERENCE-ANSWER" );
    $list308 = ConsesLow.list( ConsesLow.list( makeSymbol( "*PPH-USE-BULLETED-LISTS?*" ), T ), ConsesLow.list( makeSymbol( "*PPH-REPOSITIONED-PROOFS*" ), NIL ), ConsesLow.list( makeSymbol( "*PPH-DISPLAYED-PROOFS*" ),
        ConsesLow.list( makeSymbol( "FIND-OR-CREATE-PPH-DISPLAYED-PROOF-STACK" ) ) ), ConsesLow.list( makeSymbol( "*PPH-JUSTIFIED-PROOFS*" ), ConsesLow.list( makeSymbol( "FIND-OR-CREATE-PPH-JUSTIFIED-PROOF-SET" ) ) ),
        ConsesLow.list( makeSymbol( "*PPH-PROOF-DEPTH*" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "*PPH-DISPLAYED-SUPPORTS*" ), NIL ) );
    $sym309$POSSIBLY_WITH_PPH_HTML_JUSTIFICATION_GENERATION_PARAMETERS = makeSymbol( "POSSIBLY-WITH-PPH-HTML-JUSTIFICATION-GENERATION-PARAMETERS" );
    $sym310$LINK_FUNCTION = makeUninternedSymbol( "LINK-FUNCTION" );
    $sym311$HTML_TARGET = makeUninternedSymbol( "HTML-TARGET" );
    $list312 = ConsesLow.list( makeSymbol( "PPH-JUSTIFICATION-HTML-FUNCTION-AND-TARGET" ) );
    $sym313$WITH_PPH_HTML_FUNCTION_AND_TARGET = makeSymbol( "WITH-PPH-HTML-FUNCTION-AND-TARGET" );
    $sym314$PPH_JUSTIFICATION_HTML_FUNCTION_AND_TARGET = makeSymbol( "PPH-JUSTIFICATION-HTML-FUNCTION-AND-TARGET" );
    $sym315$WITH_PPH_JUSTIFICATION_GENERATION_PARAMETERS = makeSymbol( "WITH-PPH-JUSTIFICATION-GENERATION-PARAMETERS" );
    $list316 = ConsesLow.list( ConsesLow.list( makeSymbol( "PHRASE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym317$VAR_TYPES_SHADOW = makeUninternedSymbol( "VAR-TYPES-SHADOW" );
    $list318 = ConsesLow.list( ConsesLow.list( makeSymbol( "COPY-DICTIONARY" ), makeSymbol( "*PPH-VAR-TYPES*" ) ) );
    $list319 = ConsesLow.list( ConsesLow.list( makeSymbol( "*PPH-NOTED-VAR-TYPES*" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "DICTIONARY-P" ), makeSymbol( "*PPH-NOTED-VAR-TYPES*" ) ),
        makeSymbol( "*PPH-NOTED-VAR-TYPES*" ), ConsesLow.list( makeSymbol( "NEW-DICTIONARY" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQL ), SIXTEEN_INTEGER ) ) ), ConsesLow.list( makeSymbol(
            "*PPH-VAR-TYPES-COUNTER*" ), ConsesLow.list( makeSymbol( "1+" ), makeSymbol( "*PPH-VAR-TYPES-COUNTER*" ) ) ) );
    $list320 = ConsesLow.list( makeSymbol( "PPH-NOTE" ), ONE_INTEGER, makeString( "~&Entering PPH-SETTING-VAR-TYPES-IF-SUCCESSFUL(~S), *pph-var-types* are~% ~s~%" ), makeSymbol( "*PPH-VAR-TYPES-COUNTER*" ), ConsesLow
        .list( makeSymbol( "DICTIONARY-VALUES" ), makeSymbol( "*PPH-VAR-TYPES*" ) ) );
    $sym321$_PPH_VAR_TYPES_ = makeSymbol( "*PPH-VAR-TYPES*" );
    $list322 = ConsesLow.list( makeSymbol( "PPH-NOTE" ), ONE_INTEGER, makeString( "~&Leaving PPH-SETTING-VAR-TYPES-IF-SUCCESSFUL(~S). " ), makeSymbol( "*PPH-VAR-TYPES-COUNTER*" ) );
    $sym323$PPH_PHRASE_DONE_ = makeSymbol( "PPH-PHRASE-DONE?" );
    $list324 = ConsesLow.list( makeSymbol( "PPH-NOTE" ), ONE_INTEGER, makeString( "~& Output list: ~S~%" ), ConsesLow.list( makeSymbol( "PPH-PHRASE-OUTPUT-LIST" ), makeSymbol( "PHRASE" ) ) );
    $str325$___Setting__S_to____S = makeString( "~& Setting ~S to~% ~S" );
    $sym326$DICTIONARY_VALUES = makeSymbol( "DICTIONARY-VALUES" );
    $sym327$PPH_RESET_VAR_TYPES = makeSymbol( "PPH-RESET-VAR-TYPES" );
    $list328 = ConsesLow.list( ConsesLow.list( makeSymbol( "PPH-NOTE" ), ONE_INTEGER, makeString( "~% Leaving *PPH-VAR-TYPES* ~S" ), ConsesLow.list( makeSymbol( "DICTIONARY-VALUES" ), makeSymbol(
        "*PPH-VAR-TYPES*" ) ) ) );
    $sym329$PPH_SETTING_VAR_TYPES_IF_SUCCESSFUL = makeSymbol( "PPH-SETTING-VAR-TYPES-IF-SUCCESSFUL" );
    $sym330$OLD_PPH_VARS = makeUninternedSymbol( "OLD-PPH-VARS" );
    $list331 = ConsesLow.list( makeSymbol( "*PPH-VAR-TYPES*" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "DICTIONARY-P" ), makeSymbol( "*PPH-VAR-TYPES*" ) ), makeSymbol( "*PPH-VAR-TYPES*" ),
        ConsesLow.list( makeSymbol( "NEW-DICTIONARY" ) ) ) );
    $list332 = ConsesLow.list( ConsesLow.list( makeSymbol( "PPH-REGISTERED-VARS" ) ) );
    $list333 = ConsesLow.list( ConsesLow.list( makeSymbol( "*PPH-DIFFERENT-VARS*" ), makeSymbol( "*PPH-DIFFERENT-VARS*" ) ), ConsesLow.list( makeSymbol( "*PPH-NOTED-VAR-TYPES*" ), ConsesLow.list( makeSymbol( "FIF" ),
        ConsesLow.list( makeSymbol( "DICTIONARY-P" ), makeSymbol( "*PPH-NOTED-VAR-TYPES*" ) ), makeSymbol( "*PPH-NOTED-VAR-TYPES*" ), ConsesLow.list( makeSymbol( "NEW-DICTIONARY" ), ConsesLow.list( makeSymbol(
            "FUNCTION" ), EQL ), SIXTEEN_INTEGER ) ) ), ConsesLow.list( makeSymbol( "*PPH-POSSIBLY-BINDING-VARIABLES-COUNTER*" ), ConsesLow.list( makeSymbol( "1+" ), makeSymbol(
                "*PPH-POSSIBLY-BINDING-VARIABLES-COUNTER*" ) ) ) );
    $list334 = ConsesLow.list( makeSymbol( "PPH-NOTE" ), TWO_INTEGER, makeString( "~&Entering PPH-POSSIBLY-BINDING-VARIABLES(~S), *pph-var-types* are~% ~S~%" ), makeSymbol( "*PPH-POSSIBLY-BINDING-VARIABLES-COUNTER*" ),
        ConsesLow.list( makeSymbol( "DICTIONARY-VALUES" ), makeSymbol( "*PPH-VAR-TYPES*" ) ) );
    $sym335$LOCAL_VARS = makeSymbol( "LOCAL-VARS" );
    $sym336$SET_DIFFERENCE = makeSymbol( "SET-DIFFERENCE" );
    $list337 = ConsesLow.list( makeSymbol( "PPH-REGISTERED-VARS" ) );
    $list338 = ConsesLow.list( ConsesLow.list( makeSymbol( "PPH-NOTE" ), TWO_INTEGER, makeString( "~&Leaving PPH-POSSIBLY-BINDING-VARIABLES(~S), vars in local *pph-var-types* were ~s " ), makeSymbol(
        "*PPH-POSSIBLY-BINDING-VARIABLES-COUNTER*" ), ConsesLow.list( makeSymbol( "PPH-REGISTERED-VARS" ) ) ), ConsesLow.list( makeSymbol( "PPH-HANDLE-LOCAL-VARS" ), makeSymbol( "LOCAL-VARS" ) ), ConsesLow.list(
            makeSymbol( "PPH-NOTE" ), TWO_INTEGER, makeString( "~&... and *pph-var-types* are now ~S~%" ), ConsesLow.list( makeSymbol( "PPH-REGISTERED-VARS" ) ) ) );
    $sym339$PPH_HANDLE_LOCAL_VARS = makeSymbol( "PPH-HANDLE-LOCAL-VARS" );
    $sym340$PPH_POSSIBLY_BINDING_VARIABLES = makeSymbol( "PPH-POSSIBLY-BINDING-VARIABLES" );
    $str341$__Deregistering__S__ = makeString( "~&Deregistering ~S~%" );
    $list342 = ConsesLow.list( ConsesLow.list( makeSymbol( "PERSON" ), makeSymbol( "NUMBER" ), makeSymbol( "GENDER" ) ), makeSymbol( "PRONOUN-AGR" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym343$CDESTRUCTURING_BIND = makeSymbol( "CDESTRUCTURING-BIND" );
    $list344 = ConsesLow.list( ConsesLow.list( makeSymbol( "AGR-CONSTRAINT" ), makeSymbol( "PHRASE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym345$PPH_PHRASE_AGR = makeSymbol( "PPH-PHRASE-AGR" );
    $list346 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "TEMPLATE" ), makeSymbol( "FORMULA" ), makeSymbol( "&KEY" ), makeSymbol( "RELN" ), ConsesLow.list( makeSymbol( "ARG-POSITION-MAP" ), ConsesLow
        .list( makeSymbol( "PPH-NEW-EMPTY-MAP" ) ) ), ConsesLow.list( makeSymbol( "INVERSE?" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "IGNORE-ME" ) ) ), ConsesLow.list( makeSymbol( "NL-PREDS" ), makeKeyword(
            "ANY" ) ), makeSymbol( "FOCUS-ARGNUM" ), makeSymbol( "DONE" )
    } ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list347 = ConsesLow.list( makeKeyword( "RELN" ), makeKeyword( "ARG-POSITION-MAP" ), makeKeyword( "INVERSE?" ), makeKeyword( "NL-PREDS" ), makeKeyword( "FOCUS-ARGNUM" ), makeKeyword( "DONE" ) );
    $kw348$RELN = makeKeyword( "RELN" );
    $kw349$ARG_POSITION_MAP = makeKeyword( "ARG-POSITION-MAP" );
    $kw350$INVERSE_ = makeKeyword( "INVERSE?" );
    $sym351$IGNORE_ME = makeSymbol( "IGNORE-ME" );
    $kw352$NL_PREDS = makeKeyword( "NL-PREDS" );
    $kw353$ANY = makeKeyword( "ANY" );
    $kw354$FOCUS_ARGNUM = makeKeyword( "FOCUS-ARGNUM" );
    $sym355$GENERATOR = makeUninternedSymbol( "GENERATOR" );
    $sym356$GET_PPH_PHRASE_TEMPLATE_GENERATOR = makeSymbol( "GET-PPH-PHRASE-TEMPLATE-GENERATOR" );
    $sym357$PPH_PHRASE_TEMPLATE_GENERATOR_DONE_P = makeSymbol( "PPH-PHRASE-TEMPLATE-GENERATOR-DONE-P" );
    $sym358$PPH_PHRASE_TEMPLATE_GENERATOR_NEXT = makeSymbol( "PPH-PHRASE-TEMPLATE-GENERATOR-NEXT" );
    $sym359$PPH_PHRASE_P = makeSymbol( "PPH-PHRASE-P" );
    $sym360$FREE_PPH_PHRASE_TEMPLATE_GENERATOR = makeSymbol( "FREE-PPH-PHRASE-TEMPLATE-GENERATOR" );
    $list361 = ConsesLow.list( ConsesLow.list( makeSymbol( "PPH-PHRASE" ), makeSymbol( "FORMULA" ), makeSymbol( "&KEY" ), makeSymbol( "FOCUS-ARG" ), makeSymbol( "ARG-POSITION-MAP" ), ConsesLow.list( makeSymbol(
        "NL-PREDS" ), makeKeyword( "ANY" ) ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list362 = ConsesLow.list( makeKeyword( "FOCUS-ARG" ), makeKeyword( "ARG-POSITION-MAP" ), makeKeyword( "NL-PREDS" ), makeKeyword( "DONE" ) );
    $kw363$FOCUS_ARG = makeKeyword( "FOCUS-ARG" );
    $sym364$PHRASE_TEMPLATE = makeUninternedSymbol( "PHRASE-TEMPLATE" );
    $sym365$DO_PPH_PHRASE_TEMPLATES_FOR_FORMULA = makeSymbol( "DO-PPH-PHRASE-TEMPLATES-FOR-FORMULA" );
    $sym366$PPH_CUSTOMIZE_TEMPLATE_MACRO_HELPER = makeSymbol( "PPH-CUSTOMIZE-TEMPLATE-MACRO-HELPER" );
    $int367$300 = makeInteger( 300 );
    $sym368$MAX_SUSPENDED_METHOD_DEPTH = makeSymbol( "MAX-SUSPENDED-METHOD-DEPTH" );
    $sym369$HANDLING_PPH_METHOD_FAILURES = makeSymbol( "HANDLING-PPH-METHOD-FAILURES" );
    $sym370$FAILED_METHOD = makeUninternedSymbol( "FAILED-METHOD" );
    $sym371$TRIED_ONE_ = makeUninternedSymbol( "TRIED-ONE?" );
    $sym372$TOP_LEVEL_ = makeUninternedSymbol( "TOP-LEVEL?" );
    $list373 = ConsesLow.list( ConsesLow.list( makeSymbol( "HANDLING-PPH-METHOD-FAILURES-TOP-LEVEL-P" ) ) );
    $sym374$_SUSPENDED_PARAPHRASE_METHODS_ = makeSymbol( "*SUSPENDED-PARAPHRASE-METHODS*" );
    $list375 = ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-SET" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQUAL ), ConsesLow.list( makeSymbol( "MAX-SUSPENDED-METHOD-DEPTH" ) ) ), makeSymbol(
        "*SUSPENDED-PARAPHRASE-METHODS*" ) );
    $list376 = ConsesLow.list( makeSymbol( "*HANDLING-PPH-METHOD-FAILURES?*" ), T );
    $sym377$WHILE = makeSymbol( "WHILE" );
    $sym378$NOTE_SUSPENDED_PARAPHRASE_METHOD_PLIST = makeSymbol( "NOTE-SUSPENDED-PARAPHRASE-METHOD-PLIST" );
    $sym379$CCATCH = makeSymbol( "CCATCH" );
    $kw380$PPH_METHOD_FAILURE = makeKeyword( "PPH-METHOD-FAILURE" );
    $sym381$HANDLING_PPH_METHOD_FAILURES_TOP_LEVEL_P = makeSymbol( "HANDLING-PPH-METHOD-FAILURES-TOP-LEVEL-P" );
    $str382$Can_t_note_PPH_method_failure__no = makeString( "Can't note PPH method failure; not in failure handling mode." );
    $str383$_S___is_already_suspended_ = makeString( "~S~% is already suspended." );
    $str384$Over__S_suspended_methods____Curr = makeString( "Over ~S suspended methods.~% Current plist:~% ~S" );
    $kw385$CYCL = makeKeyword( "CYCL" );
    $str386$Cleared__S_suspended_methods_for_ = makeString( "Cleared ~S suspended methods for ~S" );
    $list387 = ConsesLow.list( ConsesLow.list( makeSymbol( "METHOD-SYMBOL" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "OBJECT-TYPE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym388$INFO = makeUninternedSymbol( "INFO" );
    $sym389$PPH_METHOD_INFO = makeSymbol( "PPH-METHOD-INFO" );
    $sym390$PPH_DEREGISTER_METHOD_INFO = makeSymbol( "PPH-DEREGISTER-METHOD-INFO" );
    $sym391$PPH_REGISTER_METHOD_INFO = makeSymbol( "PPH-REGISTER-METHOD-INFO" );
    $list392 = ConsesLow.list( makeSymbol( "METHODS" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym393$_SELECT_STRING_METHODS_TO_OMIT_ = makeSymbol( "*SELECT-STRING-METHODS-TO-OMIT*" );
    $sym394$SAVE_CYCL = makeUninternedSymbol( "SAVE-CYCL" );
    $sym395$PPH_PHRASE_RESTRICT_CYCL_TO_MT_SCOPE = makeSymbol( "PPH-PHRASE-RESTRICT-CYCL-TO-MT-SCOPE" );
    $sym396$PPH_PHRASE_RESTORE_AND_REPHRASE_CYCL_IF_MT_SCOPED = makeSymbol( "PPH-PHRASE-RESTORE-AND-REPHRASE-CYCL-IF-MT-SCOPED" );
    $sym397$HANDLING_PPH_MT_SCOPE = makeSymbol( "HANDLING-PPH-MT-SCOPE" );
    $str398$Removing_MT_scope_from__S = makeString( "Removing MT scope from ~S" );
    $list399 = ConsesLow.list( TWO_INTEGER );
    $str400$Updating_agr_preds_to__S_based_on = makeString( "Updating agr-preds to ~S based on mt scope." );
    $str401$New_agr_preds___S = makeString( "New agr preds: ~S" );
    $str402$Adding_Mt_scope_paraphrases_to___ = makeString( "Adding Mt scope paraphrases to~% ~S" );
    $str403$Couldn_t_finish_temporal_phrase__ = makeString( "Couldn't finish temporal phrase:~% ~S~%" );
    $list404 = ConsesLow.list( makeSymbol( "TEMPORAL" ), makeSymbol( "ETC" ) );
    $str405$_ = makeString( "," );
    $str406$___Top_level_CycL___S = makeString( "~% Top-level CycL: ~S" );
    $kw407$FAILED = makeKeyword( "FAILED" );
    $str408$Result_of_adding_Mt_scope_paraphr = makeString( "Result of adding Mt scope paraphrases:~% ~S" );
    $list409 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MtTimeDimFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Now" ) ) );
    $const410$TemporalMicrotheory = constant_handles.reader_make_constant_shell( makeString( "TemporalMicrotheory" ) );
    $list411 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nonPlural-Generic" ) ), constant_handles.reader_make_constant_shell( makeString( "nameString" ) ) );
    $str412$according_to = makeString( "according to" );
    $kw413$PHRASE_CYCL = makeKeyword( "PHRASE-CYCL" );
    $const414$Now = constant_handles.reader_make_constant_shell( makeString( "Now" ) );
    $str415$Ignoring__S___because_it_subsumes = makeString( "Ignoring ~S~% because it subsumes #$Now." );
    $list416 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "prepositionStrings" ) ), constant_handles.reader_make_constant_shell( makeString( "adverbStrings" ) ) );
    $sym417$ALREADY_MEMORY_MAPPED = makeUninternedSymbol( "ALREADY-MEMORY-MAPPED" );
    $list418 = ConsesLow.list( ConsesLow.list( makeSymbol( "NL-GENERATION-CACHE-MEMORY-MAPPED?" ) ) );
    $list419 = ConsesLow.list( makeSymbol( "ENABLE-NL-GENERATION-CACHE-MEMORY-MAPPING" ) );
    $list420 = ConsesLow.list( ConsesLow.list( makeSymbol( "DISABLE-NL-GENERATION-CACHE-MEMORY-MAPPING" ) ) );
  }

  public static final class $pph_problem_store_pointer_native
      extends
        SubLStructNative
  {
    public SubLObject $store;
    private static final SubLStructDeclNative structDecl;

    public $pph_problem_store_pointer_native()
    {
      this.$store = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $pph_problem_store_pointer_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$store;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$store = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $pph_problem_store_pointer_native.class, $sym69$PPH_PROBLEM_STORE_POINTER, $sym70$PPH_PROBLEM_STORE_POINTER_P, $list71, $list72, new String[] { "$store"
      }, $list73, $list74, $sym75$PPRINT_PPH_PROBLEM_STORE_POINTER );
    }
  }

  public static final class $pph_problem_store_pointer_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $pph_problem_store_pointer_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "PPH-PROBLEM-STORE-POINTER-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return pph_problem_store_pointer_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 1269 ms
 * 
 */