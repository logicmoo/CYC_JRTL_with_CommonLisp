package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.hl_prototypes;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.janus;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class fi
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.fi";
  public static final String myFingerPrint = "3911f3639c2476c1d205d929241e942033b828c37246093539cc10c970c367f3";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2595L)
  private static SubLSymbol $fi_dispatch_table$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6696L)
  public static SubLSymbol $fi_warning$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7372L)
  public static SubLSymbol $fi_error$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8317L)
  public static SubLSymbol $fi_last_constant$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8738L)
  private static SubLSymbol $within_fi_operationP$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12164L)
  public static SubLSymbol $current_fi_op$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30415L)
  private static SubLSymbol $merge_fort_assertion_map$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 51437L)
  public static SubLSymbol $assume_assert_sentence_is_wfP$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 59031L)
  public static SubLSymbol $generate_precise_fi_wff_errorsP$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 109101L)
  public static SubLSymbol $the_date$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 109488L)
  public static SubLSymbol $the_second$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 113059L)
  private static SubLSymbol $cached_fi_canonicalize_gaf_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 113943L)
  private static SubLSymbol $assertion_fi_formula_mt_scope$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$CLET;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$_FI_WARNING_;
  private static final SubLSymbol $sym4$_FI_ERROR_;
  private static final SubLSymbol $sym5$FORMAT;
  private static final SubLString $str6$_S;
  private static final SubLSymbol $sym7$_FI_LAST_CONSTANT_;
  private static final SubLList $list8;
  private static final SubLList $list9;
  private static final SubLString $str10$Bad_function_call_____FI__s__s__s;
  private static final SubLSymbol $sym11$QUOTE;
  private static final SubLSymbol $kw12$QUEUED;
  private static final SubLSymbol $sym13$FI_CREATE;
  private static final SubLSymbol $sym14$FI_FIND_OR_CREATE;
  private static final SubLList $list15;
  private static final SubLList $list16;
  private static final SubLSymbol $sym17$FI_HYPOTHESIZE;
  private static final SubLList $list18;
  private static final SubLString $str19$HYP;
  private static final SubLSymbol $kw20$GET_WARNING;
  private static final SubLSymbol $sym21$FI_GET_WARNING;
  private static final SubLString $str22$Return_a_description_of_the_warni;
  private static final SubLList $list23;
  private static final SubLSymbol $kw24$GET_ERROR;
  private static final SubLSymbol $sym25$FI_GET_ERROR;
  private static final SubLString $str26$Return_a_description_of_the_error;
  private static final SubLSymbol $kw27$FIND;
  private static final SubLSymbol $sym28$FI_FIND;
  private static final SubLList $list29;
  private static final SubLString $str30$Return_the_constant_indentified_b;
  private static final SubLList $list31;
  private static final SubLSymbol $kw32$ARG_ERROR;
  private static final SubLString $str33$Expected_a_string__got__S;
  private static final SubLSymbol $kw34$INVALID_NAME;
  private static final SubLString $str35$_S_is_not_a_valid_name_for_a_cons;
  private static final SubLSymbol $kw36$COMPLETE;
  private static final SubLSymbol $sym37$FI_COMPLETE;
  private static final SubLList $list38;
  private static final SubLString $str39$Return_a_list_of_constants_whose_;
  private static final SubLList $list40;
  private static final SubLSymbol $kw41$CREATE;
  private static final SubLList $list42;
  private static final SubLString $str43$Create_a_new_constant_with_NAME__;
  private static final SubLList $list44;
  private static final SubLSymbol $kw45$UNNAMED;
  private static final SubLSymbol $kw46$NAME_CLASH;
  private static final SubLString $str47$NAME_clash_for__S___renaming_to__;
  private static final SubLString $str48$Expected_an_external_ID__got__S;
  private static final SubLSymbol $kw49$ID_CLASH;
  private static final SubLString $str50$Already_a_constant_with_id__A;
  private static final SubLSymbol $kw51$FIND_OR_CREATE;
  private static final SubLString $str52$Return_constant_with_NAME_if_it_i;
  private static final SubLSymbol $kw53$CREATE_SKOLEM;
  private static final SubLSymbol $sym54$QUEUE_P;
  private static final SubLSymbol $sym55$TL_FUNCTION_TERM_;
  private static final SubLString $str56$Found_a_TL_term_in_skolem__a_defi;
  private static final SubLObject $const57$isa;
  private static final SubLSymbol $kw58$MONOTONIC;
  private static final SubLObject $const59$arityMin;
  private static final SubLObject $const60$arity;
  private static final SubLObject $const61$arg1Isa;
  private static final SubLObject $const62$arg2Isa;
  private static final SubLObject $const63$arg3Isa;
  private static final SubLObject $const64$arg4Isa;
  private static final SubLObject $const65$arg5Isa;
  private static final SubLObject $const66$resultIsa;
  private static final SubLObject $const67$resultIsaArg;
  private static final SubLObject $const68$CollectionDenotingFunction;
  private static final SubLList $list69;
  private static final SubLObject $const70$resultGenl;
  private static final SubLObject $const71$SubcollectionDenotingFunction;
  private static final SubLList $list72;
  private static final SubLObject $const73$resultGenlArg;
  private static final SubLString $str74$SKF__a;
  private static final SubLString $str75$0123456789;
  private static final SubLSymbol $kw76$MERGE;
  private static final SubLList $list77;
  private static final SubLSymbol $sym78$FORT_P;
  private static final SubLSymbol $sym79$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const80$EverythingPSC;
  private static final SubLObject $const81$genls;
  private static final SubLObject $const82$termOfUnit;
  private static final SubLSymbol $sym83$SKOLEM_NART_;
  private static final SubLSymbol $sym84$ASSERTION_P;
  private static final SubLSymbol $sym85$SKOLEM_TERM_;
  private static final SubLString $str86$Could_not_merge_assertion_onto_te;
  private static final SubLSymbol $sym87$CONVERT_HL_SUPPORT_TO_FI_SUPPORT;
  private static final SubLSymbol $kw88$KILL;
  private static final SubLSymbol $sym89$FI_KILL;
  private static final SubLList $list90;
  private static final SubLString $str91$Kill_FORT_and_all_its_uses_from_t;
  private static final SubLList $list92;
  private static final SubLString $str93$Constant__S_is_merely_an_empty_sh;
  private static final SubLString $str94$Cannot_kill_core_constant__a___To;
  private static final SubLSymbol $kw95$RENAME;
  private static final SubLSymbol $sym96$FI_RENAME;
  private static final SubLList $list97;
  private static final SubLString $str98$Change_name_of_CONSTANT_to_NAME__;
  private static final SubLString $str99$Expected_a_constant__got__S;
  private static final SubLSymbol $kw100$ALREADY_HAS_NAME;
  private static final SubLString $str101$Constant__S_is_already_named__A;
  private static final SubLSymbol $kw102$LOOKUP;
  private static final SubLSymbol $sym103$FI_LOOKUP;
  private static final SubLList $list104;
  private static final SubLString $str105$Returns_two_values_when_looking_u;
  private static final SubLList $list106;
  private static final SubLString $str107$Expected_a_cons__got__S;
  private static final SubLSymbol $sym108$ASSERTION_FI_FORMULA;
  private static final SubLSymbol $kw109$DEFAULT;
  private static final SubLSymbol $kw110$ASSERT;
  private static final SubLSymbol $sym111$FI_ASSERT;
  private static final SubLList $list112;
  private static final SubLString $str113$Assert_the_FORMULA_in_the_specifi;
  private static final SubLString $str114$Expected__default_or__monotonic__;
  private static final SubLString $str115$Expected_a_direction__got__S;
  private static final SubLObject $const116$True;
  private static final SubLSymbol $kw117$TAUTOLOGY;
  private static final SubLString $str118$Formula______S___in__S_was_a_taut;
  private static final SubLObject $const119$False;
  private static final SubLSymbol $kw120$CONTRADICTION;
  private static final SubLString $str121$Formula______S___in__S_was_a_cont;
  private static final SubLList $list122;
  private static final SubLSymbol $kw123$COULD_NOT_ASSERT;
  private static final SubLString $str124$Unable_to_assert_formula__S__in__;
  private static final SubLSymbol $sym125$ASSERTED_ASSERTION_;
  private static final SubLSymbol $sym126$FAST_SKOLEM_NAT_;
  private static final SubLSymbol $sym127$OPAQUE_ARG_WRT_QUOTING_NOT_COUNTING_LOGICAL_OPS_;
  private static final SubLObject $const128$skolem;
  private static final SubLString $str129$Found_a___skolem_assertion_with_m;
  private static final SubLString $str130$Found_a___skolem_assertion_with_a;
  private static final SubLSymbol $sym131$KBEQ;
  private static final SubLString $str132$Defining_assertions_for__s___s__w;
  private static final SubLList $list133;
  private static final SubLSymbol $sym134$CNF_P;
  private static final SubLSymbol $kw135$BACKWARD;
  private static final SubLSymbol $kw136$FORWARD;
  private static final SubLSymbol $kw137$FORMULA_NOT_WELL_FORMED;
  private static final SubLString $str138$Formula______S___was_not_well_for;
  private static final SubLString $str139$Formula______S___was_not_well_for;
  private static final SubLSymbol $kw140$UNINITIALIZED;
  private static final SubLSymbol $kw141$UNCHANGED;
  private static final SubLList $list142;
  private static final SubLSymbol $kw143$FLIPPED;
  private static final SubLSymbol $kw144$NEW;
  private static final SubLSymbol $kw145$REASSERT;
  private static final SubLList $list146;
  private static final SubLSymbol $kw147$ASSERTION_NOT_PRESENT;
  private static final SubLString $str148$Formula__S_in_mt__S_is_not_in_the;
  private static final SubLSymbol $kw149$DENY;
  private static final SubLSymbol $kw150$UNKNOWN;
  private static final SubLSymbol $kw151$UNASSERT;
  private static final SubLSymbol $sym152$FI_UNASSERT;
  private static final SubLString $str153$Remove_the_assertions_canonicaliz;
  private static final SubLString $str154$Sentence______S___in__S_was_a_tau;
  private static final SubLString $str155$Sentence______S___in__S_was_a_con;
  private static final SubLString $str156$Sentence__S_in_mt__S_is_not_in_th;
  private static final SubLSymbol $kw157$ASSERTION_NOT_LOCAL;
  private static final SubLString $str158$Sentence__S_in_mt__S_is_not_local;
  private static final SubLSymbol $kw159$EDIT;
  private static final SubLSymbol $sym160$FI_EDIT;
  private static final SubLList $list161;
  private static final SubLString $str162$Unassert_the_assertions_canonical;
  private static final SubLSymbol $kw163$JUSTIFY;
  private static final SubLList $list164;
  private static final SubLSymbol $sym165$ARGUMENT_TV;
  private static final SubLSymbol $kw166$ADD_ARGUMENT;
  private static final SubLString $str167$Expected_a_support__got__S;
  private static final SubLList $list168;
  private static final SubLString $str169$Expected__forward_or__backward__g;
  private static final SubLSymbol $sym170$DEDUCTION_ASSERTION;
  private static final SubLSymbol $kw171$FALSE;
  private static final SubLList $list172;
  private static final SubLSymbol $kw173$SUPPORT_MALFORMED;
  private static final SubLString $str174$Support__S_was_malformed;
  private static final SubLSymbol $kw175$TRUE;
  private static final SubLSymbol $kw176$SUPPORT_INVALID;
  private static final SubLString $str177$Support__S_is_not_currently_valid;
  private static final SubLSymbol $kw178$REMOVE_ARGUMENT;
  private static final SubLSymbol $sym179$RELEVANT_MT_IS_GENL_MT;
  private static final SubLSymbol $kw180$BLAST;
  private static final SubLSymbol $sym181$FI_BLAST;
  private static final SubLString $str182$Remove_all_arguments_for_the_FORM;
  private static final SubLSymbol $kw183$ASK;
  private static final SubLSymbol $sym184$FI_ASK;
  private static final SubLList $list185;
  private static final SubLString $str186$Ask_for_bindings_for_free_variabl;
  private static final SubLList $list187;
  private static final SubLString $str188$Expected_a_formula__got__S;
  private static final SubLList $list189;
  private static final SubLString $str190$Expected_an_integer__got__S;
  private static final SubLObject $const191$ist;
  private static final SubLSymbol $kw192$CONTINUE_LAST_ASK;
  private static final SubLSymbol $sym193$FI_CONTINUE_LAST_ASK;
  private static final SubLList $list194;
  private static final SubLList $list195;
  private static final SubLString $str196$Continue_the_last_ask_that_was_pe;
  private static final SubLSymbol $sym197$FI_CONTINUE_LAST_ASK_INT;
  private static final SubLString $str198$fi_continue_last_ask_int_is_depre;
  private static final SubLString $str199$fi_ask_status_is_deprecated__use_;
  private static final SubLSymbol $sym200$FI_ASK_STATUS;
  private static final SubLList $list201;
  private static final SubLString $str202$Return_a_status_as_to_how_the_las;
  private static final SubLSymbol $sym203$FI_ASK_STATUS_INT;
  private static final SubLString $str204$fi_ask_status_int_is_deprecated__;
  private static final SubLSymbol $kw205$TMS_RECONSIDER_FORMULA;
  private static final SubLSymbol $sym206$FI_TMS_RECONSIDER_FORMULA;
  private static final SubLString $str207$Reconsider_all_arguments_for_FORM;
  private static final SubLSymbol $kw208$TMS_RECONSIDER_MT;
  private static final SubLSymbol $sym209$FI_TMS_RECONSIDER_MT;
  private static final SubLList $list210;
  private static final SubLString $str211$Reconsider_all_arguments_for_all_;
  private static final SubLSymbol $kw212$TMS_RECONSIDER_GAFS;
  private static final SubLSymbol $sym213$FI_TMS_RECONSIDER_GAFS;
  private static final SubLList $list214;
  private static final SubLString $str215$Reconsider_all_arguments_for_all_;
  private static final SubLString $str216$Expected_an_integer_0_5__got__S;
  private static final SubLSymbol $kw217$TMS_RECONSIDER_TERM;
  private static final SubLSymbol $sym218$FI_TMS_RECONSIDER_TERM;
  private static final SubLList $list219;
  private static final SubLString $str220$Reconsider_all_arguments_involvin;
  private static final SubLSymbol $kw221$DENOTATION;
  private static final SubLList $list222;
  private static final SubLSymbol $kw223$TIMESTAMP_CONSTANT;
  private static final SubLList $list224;
  private static final SubLList $list225;
  private static final SubLList $list226;
  private static final SubLList $list227;
  private static final SubLList $list228;
  private static final SubLList $list229;
  private static final SubLSymbol $sym230$CONSTANT_P;
  private static final SubLObject $const231$myCreator;
  private static final SubLObject $const232$myCreationTime;
  private static final SubLObject $const233$myCreationPurpose;
  private static final SubLObject $const234$myCreationSecond;
  private static final SubLSymbol $kw235$STRENGTH;
  private static final SubLSymbol $kw236$DIRECTION;
  private static final SubLObject $const237$BookkeepingMt;
  private static final SubLSymbol $kw238$TIMESTAMP_ASSERTION;
  private static final SubLList $list239;
  private static final SubLSymbol $kw240$REMOVE_TIMESTAMP;
  private static final SubLSymbol $kw241$RENAME_VARIABLES;
  private static final SubLList $list242;
  private static final SubLSymbol $kw243$GET_PARAMETER;
  private static final SubLString $str244$Expected_a_symbol__got__S;
  private static final SubLSymbol $kw245$UNBOUND;
  private static final SubLString $str246$Parameter__S_is_not_bound;
  private static final SubLSymbol $kw247$SET_PARAMETER;
  private static final SubLSymbol $kw248$EVAL;
  private static final SubLSymbol $kw249$LOCAL_EVAL;
  private static final SubLSymbol $kw250$HLMT_NOT_WELL_FORMED;
  private static final SubLString $str251$Microtheory__S____was_not_well_fo;
  private static final SubLString $str252$Expected_a_microtheory__got__S;
  private static final SubLString $str253$Expected_a_term__got__S;
  private static final SubLSymbol $sym254$CAR;
  private static final SubLSymbol $sym255$CDR;
  private static final SubLSymbol $sym256$KB_VAR_LIST_;
  private static final SubLSymbol $kw257$TRUE_MON;
  private static final SubLSymbol $kw258$TRUE_DEF;
  private static final SubLSymbol $kw259$FALSE_MON;
  private static final SubLSymbol $kw260$FALSE_DEF;
  private static final SubLSymbol $sym261$CACHED_FI_CANONICALIZE_GAF;
  private static final SubLSymbol $sym262$_CACHED_FI_CANONICALIZE_GAF_CACHING_STATE_;
  private static final SubLInteger $int263$100;
  private static final SubLList $list264;
  private static final SubLSymbol $sym265$FIRST;
  private static final SubLSymbol $sym266$VARIABLE_P;
  private static final SubLSymbol $sym267$DEFAULT_EL_VAR_FOR_HL_VAR;
  private static final SubLSymbol $sym268$ASSERTION_FI_IST_FORMULA;
  static boolean assertionsDisabledSync = true;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6256L)
  public static SubLObject reset_fi_error_state()
  {
    reset_fi_error();
    reset_fi_warning();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6407L)
  public static SubLObject with_clean_fi_error_state(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym1$CLET, $list2, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6758L)
  public static SubLObject reset_fi_warning()
  {
    $fi_warning$.setDynamicValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7146L)
  public static SubLObject signal_fi_warning(final SubLObject fi_warning)
  {
    $fi_warning$.setDynamicValue( fi_warning );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7240L)
  public static SubLObject fi_warning_signaledP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return list_utilities.sublisp_boolean( $fi_warning$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7312L)
  public static SubLObject fi_get_warning_int()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $fi_warning$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7431L)
  public static SubLObject reset_fi_error()
  {
    $fi_error$.setDynamicValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7676L)
  public static SubLObject signal_fi_error(final SubLObject fi_error)
  {
    $fi_error$.setDynamicValue( fi_error );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7762L)
  public static SubLObject fi_error_signaledP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return list_utilities.sublisp_boolean( $fi_error$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7830L)
  public static SubLObject fi_get_error_int()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $fi_error$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7886L)
  public static SubLObject fi_error_string(final SubLObject fi_error)
  {
    SubLObject error_string = NIL;
    if( conses_high.second( fi_error ).isString() )
    {
      error_string = Functions.apply( Symbols.symbol_function( $sym5$FORMAT ), NIL, new SubLObject[] { conses_high.second( fi_error ), conses_high.nthcdr( TWO_INTEGER, fi_error )
      } );
    }
    else
    {
      error_string = PrintLow.format( NIL, $str6$_S, fi_error.first() );
    }
    return error_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8228L)
  public static SubLObject fi_get_error_string_int()
  {
    return fi_error_string( fi_get_error_int() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8383L)
  public static SubLObject set_fi_last_assertions_asserted(final SubLObject assertions)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    czer_vars.$fi_last_assertions_asserted$.setDynamicValue( assertions, thread );
    return czer_vars.$fi_last_assertions_asserted$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8587L)
  public static SubLObject push_fi_last_assertions_asserted(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    czer_vars.$fi_last_assertions_asserted$.setDynamicValue( ConsesLow.cons( assertion, czer_vars.$fi_last_assertions_asserted$.getDynamicValue( thread ) ), thread );
    return czer_vars.$fi_last_assertions_asserted$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8859L)
  public static SubLObject within_fi_operation(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym1$CLET, $list8, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8967L)
  public static SubLObject already_within_fi_operationP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $within_fi_operationP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9048L)
  public static SubLObject fi(final SubLObject keyword, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5, SubLObject arg6, SubLObject arg7, SubLObject arg8)
  {
    if( arg1 == UNPROVIDED )
    {
      arg1 = utilities_macros.$unprovided$.getGlobalValue();
    }
    if( arg2 == UNPROVIDED )
    {
      arg2 = utilities_macros.$unprovided$.getGlobalValue();
    }
    if( arg3 == UNPROVIDED )
    {
      arg3 = utilities_macros.$unprovided$.getGlobalValue();
    }
    if( arg4 == UNPROVIDED )
    {
      arg4 = utilities_macros.$unprovided$.getGlobalValue();
    }
    if( arg5 == UNPROVIDED )
    {
      arg5 = utilities_macros.$unprovided$.getGlobalValue();
    }
    if( arg6 == UNPROVIDED )
    {
      arg6 = utilities_macros.$unprovided$.getGlobalValue();
    }
    if( arg7 == UNPROVIDED )
    {
      arg7 = utilities_macros.$unprovided$.getGlobalValue();
    }
    if( arg8 == UNPROVIDED )
    {
      arg8 = utilities_macros.$unprovided$.getGlobalValue();
    }
    final SubLObject dispatch_info = conses_high.assoc( keyword, $fi_dispatch_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
    SubLObject current;
    final SubLObject datum = current = dispatch_info.rest();
    SubLObject fun = NIL;
    SubLObject int_fun = NIL;
    SubLObject modifies_kbP = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    fun = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    int_fun = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    modifies_kbP = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject form_to_enqueue = NIL;
      SubLObject form_to_eval = NIL;
      if( NIL != fun && NIL != int_fun )
      {
        form_to_enqueue = fi_construct_form_to_enqueue( fun, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 );
        form_to_eval = list_utilities.replace_nth( ZERO_INTEGER, int_fun, form_to_enqueue );
      }
      else
      {
        Errors.error( $str10$Bad_function_call_____FI__s__s__s, new SubLObject[] { keyword, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, keyword
        } );
      }
      return fi_1( form_to_enqueue, form_to_eval, modifies_kbP );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list9 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10088L)
  public static SubLObject fi_construct_form_to_enqueue(final SubLObject fun, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5, SubLObject arg6, SubLObject arg7, SubLObject arg8)
  {
    if( arg1 == UNPROVIDED )
    {
      arg1 = utilities_macros.$unprovided$.getGlobalValue();
    }
    if( arg2 == UNPROVIDED )
    {
      arg2 = utilities_macros.$unprovided$.getGlobalValue();
    }
    if( arg3 == UNPROVIDED )
    {
      arg3 = utilities_macros.$unprovided$.getGlobalValue();
    }
    if( arg4 == UNPROVIDED )
    {
      arg4 = utilities_macros.$unprovided$.getGlobalValue();
    }
    if( arg5 == UNPROVIDED )
    {
      arg5 = utilities_macros.$unprovided$.getGlobalValue();
    }
    if( arg6 == UNPROVIDED )
    {
      arg6 = utilities_macros.$unprovided$.getGlobalValue();
    }
    if( arg7 == UNPROVIDED )
    {
      arg7 = utilities_macros.$unprovided$.getGlobalValue();
    }
    if( arg8 == UNPROVIDED )
    {
      arg8 = utilities_macros.$unprovided$.getGlobalValue();
    }
    SubLObject form_to_enqueue = NIL;
    if( NIL != utilities_macros.unprovided_argumentP( arg1 ) )
    {
      form_to_enqueue = ConsesLow.list( fun );
    }
    else if( NIL != utilities_macros.unprovided_argumentP( arg2 ) )
    {
      form_to_enqueue = ConsesLow.list( fun, fi_quotify( arg1 ) );
    }
    else if( NIL != utilities_macros.unprovided_argumentP( arg3 ) )
    {
      form_to_enqueue = ConsesLow.list( fun, fi_quotify( arg1 ), fi_quotify( arg2 ) );
    }
    else if( NIL != utilities_macros.unprovided_argumentP( arg4 ) )
    {
      form_to_enqueue = ConsesLow.list( fun, fi_quotify( arg1 ), fi_quotify( arg2 ), fi_quotify( arg3 ) );
    }
    else if( NIL != utilities_macros.unprovided_argumentP( arg5 ) )
    {
      form_to_enqueue = ConsesLow.list( fun, fi_quotify( arg1 ), fi_quotify( arg2 ), fi_quotify( arg3 ), fi_quotify( arg4 ) );
    }
    else if( NIL != utilities_macros.unprovided_argumentP( arg6 ) )
    {
      form_to_enqueue = ConsesLow.list( fun, fi_quotify( arg1 ), fi_quotify( arg2 ), fi_quotify( arg3 ), fi_quotify( arg4 ), fi_quotify( arg5 ) );
    }
    else if( NIL != utilities_macros.unprovided_argumentP( arg7 ) )
    {
      form_to_enqueue = ConsesLow.list( fun, fi_quotify( arg1 ), fi_quotify( arg2 ), fi_quotify( arg3 ), fi_quotify( arg4 ), fi_quotify( arg5 ), fi_quotify( arg6 ) );
    }
    else if( NIL != utilities_macros.unprovided_argumentP( arg8 ) )
    {
      form_to_enqueue = ConsesLow.list( fun, fi_quotify( arg1 ), fi_quotify( arg2 ), fi_quotify( arg3 ), fi_quotify( arg4 ), fi_quotify( arg5 ), fi_quotify( arg6 ), fi_quotify( arg7 ) );
    }
    else
    {
      form_to_enqueue = ConsesLow.list( new SubLObject[] { fun, fi_quotify( arg1 ), fi_quotify( arg2 ), fi_quotify( arg3 ), fi_quotify( arg4 ), fi_quotify( arg5 ), fi_quotify( arg6 ), fi_quotify( arg7 ), fi_quotify(
          arg8 )
      } );
    }
    form_to_enqueue = precanonicalizer.immediate_precanonicalizations( form_to_enqueue );
    return form_to_enqueue;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11831L)
  public static SubLObject fi_quotify(final SubLObject v_object)
  {
    if( v_object.isKeyword() || v_object == NIL || v_object == T || v_object.isNumber() || v_object.isString() )
    {
      return v_object;
    }
    return ConsesLow.list( $sym11$QUOTE, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12200L)
  public static SubLObject fi_1(final SubLObject form_to_enqueue, final SubLObject form_to_eval, final SubLObject modifies_kbP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != api_control_vars.$use_local_queueP$.getDynamicValue( thread ) )
    {
      operation_queues.add_to_local_queue( form_to_enqueue, T );
      return $kw12$QUEUED;
    }
    SubLObject ans1 = NIL;
    SubLObject ans2 = NIL;
    SubLObject ans3 = NIL;
    SubLObject ans4 = NIL;
    SubLObject encapsulated_form_to_enqueue = NIL;
    if( NIL != modifies_kbP && NIL != control_vars.$use_transcriptP$.getDynamicValue( thread ) )
    {
      encapsulated_form_to_enqueue = canon_tl.tl_encapsulate( form_to_enqueue );
    }
    final SubLObject _prev_bind_0 = kb_control_vars.$recording_hl_transcript_operationsP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = kb_control_vars.$hl_transcript_operations$.currentBinding( thread );
    final SubLObject _prev_bind_3 = $current_fi_op$.currentBinding( thread );
    try
    {
      kb_control_vars.$recording_hl_transcript_operationsP$.bind( makeBoolean( NIL != operation_queues.$hl_transcripts_enabledP$.getDynamicValue( thread ) && NIL != modifies_kbP && NIL != control_vars.$use_transcriptP$
          .getDynamicValue( thread ) ), thread );
      kb_control_vars.$hl_transcript_operations$.bind( NIL, thread );
      $current_fi_op$.bind( ( NIL != $current_fi_op$.getDynamicValue( thread ) ) ? $current_fi_op$.getDynamicValue( thread ) : form_to_eval.first(), thread );
      thread.resetMultipleValues();
      final SubLObject eval_ans1 = Eval.eval( form_to_eval );
      final SubLObject eval_ans2 = thread.secondMultipleValue();
      final SubLObject eval_ans3 = thread.thirdMultipleValue();
      final SubLObject eval_ans4 = thread.fourthMultipleValue();
      thread.resetMultipleValues();
      ans1 = eval_ans1;
      ans2 = eval_ans2;
      ans3 = eval_ans3;
      ans4 = eval_ans4;
      if( NIL == fi_error_signaledP() && NIL != modifies_kbP && NIL != control_vars.$use_transcriptP$.getDynamicValue( thread ) && NIL != encapsulated_form_to_enqueue )
      {
        final SubLObject pcase_var = encapsulated_form_to_enqueue.first();
        if( pcase_var.eql( $sym13$FI_CREATE ) || pcase_var.eql( $sym14$FI_FIND_OR_CREATE ) )
        {
          SubLObject current;
          final SubLObject datum = current = encapsulated_form_to_enqueue;
          SubLObject func = NIL;
          SubLObject name = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
          func = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
          name = current.first();
          current = current.rest();
          final SubLObject external_id = current.isCons() ? current.first() : NIL;
          cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list15 );
          current = current.rest();
          if( NIL == current )
          {
            if( NIL == external_id || external_id.equal( $list16 ) )
            {
              final SubLObject constant = ans1;
              encapsulated_form_to_enqueue = ConsesLow.list( func, name, constants_high.constant_external_id( constant ) );
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list15 );
          }
        }
        else if( pcase_var.eql( $sym17$FI_HYPOTHESIZE ) )
        {
          SubLObject current;
          final SubLObject datum = current = encapsulated_form_to_enqueue;
          SubLObject func = NIL;
          SubLObject formula = NIL;
          SubLObject mt = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
          func = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
          formula = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
          mt = current.first();
          current = current.rest();
          final SubLObject name_prefix = current.isCons() ? current.first() : $str19$HYP;
          cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list18 );
          current = current.rest();
          final SubLObject term_external_ids = current.isCons() ? current.first() : NIL;
          cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list18 );
          current = current.rest();
          if( NIL == current )
          {
            if( NIL == term_external_ids || term_external_ids.equal( $list16 ) )
            {
              SubLObject v_bindings = ans1;
              if( NIL != v_bindings && NIL == bindings.unification_success_token_p( v_bindings ) )
              {
                SubLObject cdolist_list_var;
                v_bindings = ( cdolist_list_var = conses_high.copy_tree( v_bindings ) );
                SubLObject binding = NIL;
                binding = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  ConsesLow.rplacd( binding, constants_high.constant_external_id( binding.rest() ) );
                  cdolist_list_var = cdolist_list_var.rest();
                  binding = cdolist_list_var.first();
                }
                encapsulated_form_to_enqueue = ConsesLow.list( func, formula, mt, name_prefix, ConsesLow.list( $sym11$QUOTE, v_bindings ) );
              }
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list18 );
          }
        }
        possibly_add_to_transcript_queues( encapsulated_form_to_enqueue );
      }
    }
    finally
    {
      $current_fi_op$.rebind( _prev_bind_3, thread );
      kb_control_vars.$hl_transcript_operations$.rebind( _prev_bind_2, thread );
      kb_control_vars.$recording_hl_transcript_operationsP$.rebind( _prev_bind_0, thread );
    }
    return Values.values( ans1, ans2, ans3, ans4 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14688L)
  public static SubLObject possibly_add_to_transcript_queues(final SubLObject encapsulated_form_to_enqueue)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    operation_queues.add_to_transcript_queue( encapsulated_form_to_enqueue );
    if( NIL != operation_queues.$hl_transcripts_enabledP$.getDynamicValue( thread ) )
    {
      if( NIL != operation_queues.hl_transcript_formP( encapsulated_form_to_enqueue ) )
      {
        operation_queues.add_to_hl_transcript_queue( encapsulated_form_to_enqueue );
      }
      else
      {
        SubLObject cdolist_list_var = Sequences.nreverse( kb_control_vars.$hl_transcript_operations$.getDynamicValue( thread ) );
        SubLObject hlop = NIL;
        hlop = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          hlop = encapsulation.encapsulate( canon_tl.transform_hl_terms_to_tl( encapsulation.encapsulate( hlop ) ) );
          operation_queues.add_to_hl_transcript_queue( hlop );
          cdolist_list_var = cdolist_list_var.rest();
          hlop = cdolist_list_var.first();
        }
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15451L)
  public static SubLObject safe_fi(final SubLObject keyword, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5, SubLObject arg6, SubLObject arg7, SubLObject arg8)
  {
    if( arg1 == UNPROVIDED )
    {
      arg1 = utilities_macros.$unprovided$.getGlobalValue();
    }
    if( arg2 == UNPROVIDED )
    {
      arg2 = utilities_macros.$unprovided$.getGlobalValue();
    }
    if( arg3 == UNPROVIDED )
    {
      arg3 = utilities_macros.$unprovided$.getGlobalValue();
    }
    if( arg4 == UNPROVIDED )
    {
      arg4 = utilities_macros.$unprovided$.getGlobalValue();
    }
    if( arg5 == UNPROVIDED )
    {
      arg5 = utilities_macros.$unprovided$.getGlobalValue();
    }
    if( arg6 == UNPROVIDED )
    {
      arg6 = utilities_macros.$unprovided$.getGlobalValue();
    }
    if( arg7 == UNPROVIDED )
    {
      arg7 = utilities_macros.$unprovided$.getGlobalValue();
    }
    if( arg8 == UNPROVIDED )
    {
      arg8 = utilities_macros.$unprovided$.getGlobalValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans1 = NIL;
    SubLObject ans2 = NIL;
    SubLObject ans3 = NIL;
    SubLObject ans4 = NIL;
    final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = control_vars.$use_transcriptP$.currentBinding( thread );
    try
    {
      api_control_vars.$use_local_queueP$.bind( NIL, thread );
      control_vars.$use_transcriptP$.bind( NIL, thread );
      thread.resetMultipleValues();
      final SubLObject fi_ans1 = fi( keyword, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 );
      final SubLObject fi_ans2 = thread.secondMultipleValue();
      final SubLObject fi_ans3 = thread.thirdMultipleValue();
      final SubLObject fi_ans4 = thread.fourthMultipleValue();
      thread.resetMultipleValues();
      ans1 = fi_ans1;
      ans2 = fi_ans2;
      ans3 = fi_ans3;
      ans4 = fi_ans4;
    }
    finally
    {
      control_vars.$use_transcriptP$.rebind( _prev_bind_2, thread );
      api_control_vars.$use_local_queueP$.rebind( _prev_bind_0, thread );
    }
    return Values.values( ans1, ans2, ans3, ans4 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15997L)
  public static SubLObject fi_get_warning()
  {
    return fi( $kw20$GET_WARNING, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16213L)
  public static SubLObject fi_get_error()
  {
    return fi( $kw24$GET_ERROR, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16377L)
  public static SubLObject fi_find(final SubLObject name)
  {
    return fi( $kw27$FIND, name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16561L)
  public static SubLObject fi_find_int(final SubLObject name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    reset_fi_error_state();
    if( !name.isString() )
    {
      signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str33$Expected_a_string__got__S, name ) );
      return NIL;
    }
    if( NIL == constant_completion_high.valid_constant_name_p( name ) )
    {
      signal_fi_error( ConsesLow.list( $kw34$INVALID_NAME, $str35$_S_is_not_a_valid_name_for_a_cons, name ) );
      return NIL;
    }
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = $within_fi_operationP$.currentBinding( thread );
    try
    {
      $within_fi_operationP$.bind( T, thread );
      final SubLObject constant = constants_high.find_constant( name );
      ans = ( NIL != constant_handles.valid_constantP( constant, UNPROVIDED ) ) ? constant : NIL;
    }
    finally
    {
      $within_fi_operationP$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17027L)
  public static SubLObject fi_complete(final SubLObject prefix, SubLObject case_sensitiveP)
  {
    if( case_sensitiveP == UNPROVIDED )
    {
      case_sensitiveP = NIL;
    }
    return fi( $kw36$COMPLETE, prefix, case_sensitiveP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17371L)
  public static SubLObject fi_complete_int(final SubLObject prefix, SubLObject case_sensitiveP)
  {
    if( case_sensitiveP == UNPROVIDED )
    {
      case_sensitiveP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    reset_fi_error_state();
    if( !prefix.isString() )
    {
      signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str33$Expected_a_string__got__S, prefix ) );
      return NIL;
    }
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = $within_fi_operationP$.currentBinding( thread );
    try
    {
      $within_fi_operationP$.bind( T, thread );
      final SubLObject constants = ans = constant_completion_high.constant_complete( prefix, case_sensitiveP, NIL, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      $within_fi_operationP$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17798L)
  public static SubLObject fi_create(final SubLObject name, SubLObject external_id)
  {
    if( external_id == UNPROVIDED )
    {
      external_id = NIL;
    }
    return fi( $kw41$CREATE, name, external_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18081L)
  public static SubLObject fi_create_int(SubLObject name, SubLObject external_id)
  {
    if( external_id == UNPROVIDED )
    {
      external_id = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    reset_fi_error_state();
    if( name != $kw45$UNNAMED )
    {
      if( !name.isString() )
      {
        signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str33$Expected_a_string__got__S, name ) );
        return NIL;
      }
      if( NIL == constant_completion_high.valid_constant_name_p( name ) )
      {
        signal_fi_error( ConsesLow.list( $kw34$INVALID_NAME, $str35$_S_is_not_a_valid_name_for_a_cons, name ) );
        return NIL;
      }
      if( NIL != constant_completion_high.$require_case_insensitive_name_uniqueness$.getDynamicValue( thread ) )
      {
        final SubLObject name_collision = constant_completion_high.constant_name_case_collision( name );
        if( NIL != name_collision )
        {
          final SubLObject new_name = constant_completion_high.uniquify_constant_name( name, UNPROVIDED );
          signal_fi_warning( ConsesLow.list( $kw46$NAME_CLASH, $str47$NAME_clash_for__S___renaming_to__, name, new_name ) );
          name = new_name;
        }
      }
    }
    if( NIL != external_id && NIL == constants_high.constant_external_id_p( external_id ) )
    {
      signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str48$Expected_an_external_ID__got__S, external_id ) );
      return NIL;
    }
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = control_vars.$janus_within_somethingP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $within_fi_operationP$.currentBinding( thread );
    try
    {
      control_vars.$janus_within_somethingP$.bind( T, thread );
      $within_fi_operationP$.bind( T, thread );
      final SubLObject existing_by_name = name.isString() ? constants_high.find_constant( name ) : NIL;
      final SubLObject existing_by_id = ( NIL != external_id ) ? constants_high.find_constant_by_external_id( external_id ) : NIL;
      if( NIL == existing_by_name && NIL == external_id )
      {
        final SubLObject new_external_id = constants_high.make_constant_external_id();
        ans = constants_high.create_constant( name, new_external_id );
        $fi_last_constant$.setDynamicValue( ans, thread );
      }
      else if( NIL == existing_by_name && NIL != external_id && NIL == existing_by_id )
      {
        ans = constants_high.create_constant( name, external_id );
        $fi_last_constant$.setDynamicValue( ans, thread );
      }
      else if( NIL == existing_by_name && NIL != existing_by_id )
      {
        ans = handle_id_clash( name, external_id );
      }
      else if( NIL != existing_by_name && NIL != existing_by_id && NIL == kb_utilities.kbeq( existing_by_name, existing_by_id ) )
      {
        ans = handle_id_clash( name, external_id );
      }
      else if( NIL != existing_by_name && NIL != existing_by_id && NIL != kb_utilities.kbeq( existing_by_name, existing_by_id ) )
      {
        ans = existing_by_name;
      }
      else if( NIL != existing_by_name && NIL == existing_by_id && NIL != constants_high.uninstalled_constant_p( existing_by_name ) )
      {
        final SubLObject external_id_to_install = ( NIL != external_id ) ? external_id : constants_high.make_constant_external_id();
        ans = constants_high.create_constant( name, external_id_to_install );
        $fi_last_constant$.setDynamicValue( ans, thread );
      }
      else if( NIL != existing_by_name && NIL == existing_by_id )
      {
        final SubLObject new_name2 = constant_completion_high.uniquify_constant_name( name, UNPROVIDED );
        ans = constants_high.create_constant( new_name2, external_id );
        $fi_last_constant$.setDynamicValue( ans, thread );
        signal_fi_warning( ConsesLow.list( $kw46$NAME_CLASH, $str47$NAME_clash_for__S___renaming_to__, name, new_name2 ) );
      }
    }
    finally
    {
      $within_fi_operationP$.rebind( _prev_bind_2, thread );
      control_vars.$janus_within_somethingP$.rebind( _prev_bind_0, thread );
    }
    janus.janus_note_create_finished( ans );
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22468L)
  public static SubLObject handle_id_clash(final SubLObject new_name, final SubLObject common_id)
  {
    signal_fi_error( ConsesLow.list( $kw49$ID_CLASH, $str50$Already_a_constant_with_id__A, common_id ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22655L)
  public static SubLObject fi_find_or_create(final SubLObject name, SubLObject external_id)
  {
    if( external_id == UNPROVIDED )
    {
      external_id = NIL;
    }
    return fi( $kw51$FIND_OR_CREATE, name, external_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23059L)
  public static SubLObject fi_find_or_create_int(final SubLObject name, SubLObject external_id)
  {
    if( external_id == UNPROVIDED )
    {
      external_id = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    reset_fi_error_state();
    if( !name.isString() )
    {
      signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str33$Expected_a_string__got__S, name ) );
      return NIL;
    }
    if( NIL == constant_completion_high.valid_constant_name_p( name ) )
    {
      signal_fi_error( ConsesLow.list( $kw34$INVALID_NAME, $str35$_S_is_not_a_valid_name_for_a_cons, name ) );
      return NIL;
    }
    if( NIL != external_id && NIL == constants_high.constant_external_id_p( external_id ) )
    {
      signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str48$Expected_an_external_ID__got__S, external_id ) );
      return NIL;
    }
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = $within_fi_operationP$.currentBinding( thread );
    try
    {
      $within_fi_operationP$.bind( T, thread );
      ans = fi_find_int( name );
      if( NIL != fi_error_signaledP() )
      {
        ans = NIL;
      }
      else if( NIL == ans )
      {
        ans = fi_create_int( name, external_id );
      }
    }
    finally
    {
      $within_fi_operationP$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23847L)
  public static SubLObject fi_create_skolem(final SubLObject external_id, final SubLObject unreified_sk_term, final SubLObject mt, final SubLObject cnfs, final SubLObject arg_types)
  {
    return fi( $kw53$CREATE_SKOLEM, external_id, unreified_sk_term, hlmt_czer.canonicalize_hlmt( mt ), cnfs, arg_types, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24082L)
  public static SubLObject fi_create_skolem_int(final SubLObject external_id, final SubLObject unreified_sk_term, SubLObject mt, SubLObject cnfs, SubLObject arg_types)
  {
    if( arg_types == UNPROVIDED )
    {
      arg_types = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    reset_fi_error_state();
    if( NIL == constants_high.constant_external_id_p( external_id ) )
    {
      signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str48$Expected_an_external_ID__got__S, external_id ) );
      return NIL;
    }
    mt = fi_convert_to_assert_hlmt_if_wft( mt );
    if( NIL != fi_error_signaledP() )
    {
      return NIL;
    }
    SubLObject sk_constant = NIL;
    final SubLObject environment = forward.get_forward_inference_environment();
    assert NIL != queues.queue_p( environment ) : environment;
    final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding( thread );
    try
    {
      kb_control_vars.$forward_inference_environment$.bind( environment, thread );
      final SubLObject _prev_bind_0_$1 = $within_fi_operationP$.currentBinding( thread );
      try
      {
        $within_fi_operationP$.bind( T, thread );
        sk_constant = fi_create_int( new_skolem_name( external_id ), external_id );
        if( NIL != constant_handles.constant_p( sk_constant ) )
        {
          SubLObject cdolist_list_var;
          final SubLObject tl_nats = cdolist_list_var = list_utilities.tree_gather( cnfs, $sym55$TL_FUNCTION_TERM_, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          SubLObject tl_nat = NIL;
          tl_nat = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            czer_main.canonicalize_term_assert( tl_nat, UNPROVIDED );
            cdolist_list_var = cdolist_list_var.rest();
            tl_nat = cdolist_list_var.first();
          }
          cnfs = canon_tl.transform_tl_terms_to_hl( cnfs );
          if( NIL != list_utilities.tree_find_if( $sym55$TL_FUNCTION_TERM_, cnfs, UNPROVIDED ) )
          {
            Errors.warn( $str56$Found_a_TL_term_in_skolem__a_defi, external_id, cnfs );
          }
          final SubLObject args = conses_high.second( unreified_sk_term );
          final SubLObject seqvar = skolems.skolem_seqvar( unreified_sk_term );
          final SubLObject arity_min = Sequences.length( args );
          final SubLObject key = skolems.skolem_hash_key( arity_min, cnfs );
          final SubLObject sk_defn = skolems.make_sk_defn( sk_constant, unreified_sk_term, mt, cnfs );
          final SubLObject sk_col = skolems.skolem_collection( unreified_sk_term );
          fi_assert_int( ConsesLow.list( $const57$isa, sk_constant, sk_col ), mt, $kw58$MONOTONIC, UNPROVIDED );
          if( NIL != seqvar )
          {
            fi_assert_int( ConsesLow.list( $const59$arityMin, sk_constant, arity_min ), mt, $kw58$MONOTONIC, UNPROVIDED );
          }
          else
          {
            fi_assert_int( ConsesLow.list( $const60$arity, sk_constant, arity_min ), mt, $kw58$MONOTONIC, UNPROVIDED );
          }
          fi_skolem_assert_arg_isas( sk_constant, args, arg_types, mt );
          fi_skolem_assert_result_types( sk_constant, cnfs, mt );
          skolems.add_skolem_defn( sk_defn, key );
        }
        else
        {
          signal_fi_error( ConsesLow.list( $kw49$ID_CLASH, $str50$Already_a_constant_with_id__A, external_id ) );
        }
      }
      finally
      {
        $within_fi_operationP$.rebind( _prev_bind_0_$1, thread );
      }
      if( NIL != fi_error_signaledP() )
      {
        sk_constant = NIL;
      }
      if( NIL == fi_error_signaledP() )
      {
        forward.perform_forward_inference();
      }
    }
    finally
    {
      kb_control_vars.$forward_inference_environment$.rebind( _prev_bind_0, thread );
    }
    return sk_constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26357L)
  public static SubLObject fi_skolem_assert_arg_isas(final SubLObject sk_constant, final SubLObject args, final SubLObject arg_types, final SubLObject mt)
  {
    final SubLObject arg1_isa = conses_high.assoc( args.first(), arg_types, UNPROVIDED, UNPROVIDED ).rest();
    final SubLObject arg2_isa = conses_high.assoc( conses_high.second( args ), arg_types, UNPROVIDED, UNPROVIDED ).rest();
    final SubLObject arg3_isa = conses_high.assoc( conses_high.third( args ), arg_types, UNPROVIDED, UNPROVIDED ).rest();
    final SubLObject arg4_isa = conses_high.assoc( conses_high.fourth( args ), arg_types, UNPROVIDED, UNPROVIDED ).rest();
    final SubLObject arg5_isa = conses_high.assoc( conses_high.fifth( args ), arg_types, UNPROVIDED, UNPROVIDED ).rest();
    SubLObject cdolist_list_var = arg1_isa;
    SubLObject col = NIL;
    col = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      fi_assert_int( ConsesLow.list( $const61$arg1Isa, sk_constant, col ), mt, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      col = cdolist_list_var.first();
    }
    cdolist_list_var = arg2_isa;
    col = NIL;
    col = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      fi_assert_int( ConsesLow.list( $const62$arg2Isa, sk_constant, col ), mt, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      col = cdolist_list_var.first();
    }
    cdolist_list_var = arg3_isa;
    col = NIL;
    col = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      fi_assert_int( ConsesLow.list( $const63$arg3Isa, sk_constant, col ), mt, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      col = cdolist_list_var.first();
    }
    cdolist_list_var = arg4_isa;
    col = NIL;
    col = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      fi_assert_int( ConsesLow.list( $const64$arg4Isa, sk_constant, col ), mt, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      col = cdolist_list_var.first();
    }
    cdolist_list_var = arg5_isa;
    col = NIL;
    col = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      fi_assert_int( ConsesLow.list( $const65$arg5Isa, sk_constant, col ), mt, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      col = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27165L)
  public static SubLObject fi_skolem_assert_result_types(final SubLObject sk_constant, final SubLObject cnfs, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject result_isas = skolems.skolem_result_types_from_cnfs( skolems.sk_defn_var(), cnfs, mt, UNPROVIDED );
    final SubLObject result_isa_args = thread.secondMultipleValue();
    final SubLObject result_genls = thread.thirdMultipleValue();
    final SubLObject result_genl_args = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    SubLObject cdolist_list_var = result_isas;
    SubLObject col = NIL;
    col = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      fi_assert_int( ConsesLow.list( $const66$resultIsa, sk_constant, col ), mt, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      col = cdolist_list_var.first();
    }
    cdolist_list_var = result_isa_args;
    SubLObject argnum = NIL;
    argnum = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      fi_assert_int( ConsesLow.list( $const67$resultIsaArg, sk_constant, argnum ), mt, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      argnum = cdolist_list_var.first();
    }
    if( NIL != result_genls && NIL == isa.isaP( sk_constant, $const68$CollectionDenotingFunction, mt, UNPROVIDED ) )
    {
      fi_assert_int( ConsesLow.listS( $const57$isa, sk_constant, $list69 ), mt, UNPROVIDED, UNPROVIDED );
    }
    cdolist_list_var = result_genls;
    col = NIL;
    col = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      fi_assert_int( ConsesLow.list( $const70$resultGenl, sk_constant, col ), mt, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      col = cdolist_list_var.first();
    }
    if( NIL != result_genl_args && NIL == isa.isaP( sk_constant, $const71$SubcollectionDenotingFunction, mt, UNPROVIDED ) )
    {
      fi_assert_int( ConsesLow.listS( $const57$isa, sk_constant, $list72 ), mt, UNPROVIDED, UNPROVIDED );
    }
    cdolist_list_var = result_genl_args;
    argnum = NIL;
    argnum = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      fi_assert_int( ConsesLow.list( $const73$resultGenlArg, sk_constant, argnum ), mt, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      argnum = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28152L)
  public static SubLObject new_skolem_name(final SubLObject basis)
  {
    if( basis.isString() )
    {
      return PrintLow.format( NIL, $str74$SKF__a, basis );
    }
    if( basis.isInteger() )
    {
      return PrintLow.format( NIL, $str74$SKF__a, basis );
    }
    return new_skolem_name( next_random_basis_for_skolem_name() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28567L)
  public static SubLObject next_random_basis_for_skolem_name()
  {
    return new_random_basis_for_skolem_name();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28943L)
  public static SubLObject new_random_basis_for_skolem_name()
  {
    final SubLObject random_string = Strings.make_string( TEN_INTEGER, Characters.CHAR_0 );
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( TEN_INTEGER ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      Strings.set_char( random_string, i, Strings.sublisp_char( $str75$0123456789, random.random( TEN_INTEGER ) ) );
    }
    return random_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29160L)
  public static SubLObject fi_merge(final SubLObject kill_term, final SubLObject keep_term)
  {
    return fi( $kw76$MERGE, kill_term, keep_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29576L)
  public static SubLObject fi_merge_int(SubLObject kill_term, SubLObject keep_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    reset_fi_error_state();
    kill_term = fi_convert_to_fort( kill_term );
    if( NIL != fi_error_signaledP() )
    {
      return NIL;
    }
    keep_term = fi_convert_to_fort( keep_term );
    if( NIL != fi_error_signaledP() )
    {
      return NIL;
    }
    if( NIL != kb_utilities.kbeq( keep_term, kill_term ) )
    {
      signal_fi_warning( $list77 );
      return NIL;
    }
    SubLObject ans = NIL;
    final SubLObject environment = forward.get_forward_inference_environment();
    assert NIL != queues.queue_p( environment ) : environment;
    final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $within_fi_operationP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = Errors.$continue_cerrorP$.currentBinding( thread );
    final SubLObject _prev_bind_4 = control_vars.$within_assert$.currentBinding( thread );
    final SubLObject _prev_bind_5 = wff_utilities.$check_arg_typesP$.currentBinding( thread );
    final SubLObject _prev_bind_6 = at_vars.$at_check_arg_typesP$.currentBinding( thread );
    final SubLObject _prev_bind_7 = wff_utilities.$check_wff_semanticsP$.currentBinding( thread );
    final SubLObject _prev_bind_8 = wff_utilities.$check_wff_coherenceP$.currentBinding( thread );
    final SubLObject _prev_bind_9 = wff_utilities.$check_var_typesP$.currentBinding( thread );
    final SubLObject _prev_bind_10 = czer_vars.$simplify_literalP$.currentBinding( thread );
    final SubLObject _prev_bind_11 = at_vars.$at_check_relator_constraintsP$.currentBinding( thread );
    final SubLObject _prev_bind_12 = at_vars.$at_check_arg_formatP$.currentBinding( thread );
    final SubLObject _prev_bind_13 = wff_vars.$validate_constantsP$.currentBinding( thread );
    final SubLObject _prev_bind_14 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding( thread );
    try
    {
      kb_control_vars.$forward_inference_environment$.bind( environment, thread );
      $within_fi_operationP$.bind( T, thread );
      Errors.$continue_cerrorP$.bind( T, thread );
      control_vars.$within_assert$.bind( NIL, thread );
      wff_utilities.$check_arg_typesP$.bind( NIL, thread );
      at_vars.$at_check_arg_typesP$.bind( NIL, thread );
      wff_utilities.$check_wff_semanticsP$.bind( NIL, thread );
      wff_utilities.$check_wff_coherenceP$.bind( NIL, thread );
      wff_utilities.$check_var_typesP$.bind( NIL, thread );
      czer_vars.$simplify_literalP$.bind( NIL, thread );
      at_vars.$at_check_relator_constraintsP$.bind( NIL, thread );
      at_vars.$at_check_arg_formatP$.bind( NIL, thread );
      wff_vars.$validate_constantsP$.bind( NIL, thread );
      system_parameters.$suspend_sbhl_type_checkingP$.bind( T, thread );
      ans = merge_fort_recursive( kill_term, keep_term );
    }
    finally
    {
      system_parameters.$suspend_sbhl_type_checkingP$.rebind( _prev_bind_14, thread );
      wff_vars.$validate_constantsP$.rebind( _prev_bind_13, thread );
      at_vars.$at_check_arg_formatP$.rebind( _prev_bind_12, thread );
      at_vars.$at_check_relator_constraintsP$.rebind( _prev_bind_11, thread );
      czer_vars.$simplify_literalP$.rebind( _prev_bind_10, thread );
      wff_utilities.$check_var_typesP$.rebind( _prev_bind_9, thread );
      wff_utilities.$check_wff_coherenceP$.rebind( _prev_bind_8, thread );
      wff_utilities.$check_wff_semanticsP$.rebind( _prev_bind_7, thread );
      at_vars.$at_check_arg_typesP$.rebind( _prev_bind_6, thread );
      wff_utilities.$check_arg_typesP$.rebind( _prev_bind_5, thread );
      control_vars.$within_assert$.rebind( _prev_bind_4, thread );
      Errors.$continue_cerrorP$.rebind( _prev_bind_3, thread );
      $within_fi_operationP$.rebind( _prev_bind_2, thread );
      kb_control_vars.$forward_inference_environment$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30484L)
  public static SubLObject merge_fort_recursive(final SubLObject kill_term, final SubLObject keep_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != forts.fort_p( kill_term ) : kill_term;
    assert NIL != forts.fort_p( keep_term ) : keep_term;
    SubLObject cdolist_list_var = czer_utilities.all_term_opaque_deductions( kill_term );
    SubLObject opaque_deduction = NIL;
    opaque_deduction = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != deduction_handles.valid_deductionP( opaque_deduction, UNPROVIDED ) )
      {
        final SubLObject assertion = deductions_high.deduction_assertion( opaque_deduction );
        final SubLObject cnf = assertions_high.assertion_cnf( assertion );
        final SubLObject mt = assertions_high.assertion_mt( assertion );
        final SubLObject supports = deductions_high.deduction_supports( opaque_deduction );
        hl_storage_modules.hl_remove_deduction( cnf, mt, supports );
      }
      cdolist_list_var = cdolist_list_var.rest();
      opaque_deduction = cdolist_list_var.first();
    }
    cdolist_list_var = czer_utilities.all_term_opaque_assertions( kill_term );
    SubLObject opaque_assertion = NIL;
    opaque_assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != assertion_handles.valid_assertionP( opaque_assertion, UNPROVIDED ) && NIL == assertions_high.meta_assertionP( opaque_assertion ) )
      {
        final SubLObject cnf2 = assertions_high.assertion_cnf( opaque_assertion );
        final SubLObject mt2 = assertions_high.assertion_mt( opaque_assertion );
        hl_storage_modules.hl_remove_all_arguments( cnf2, mt2 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      opaque_assertion = cdolist_list_var.first();
    }
    merge_dependent_narts( kill_term, keep_term );
    merge_dependent_kb_hl_supports( kill_term, keep_term );
    final SubLObject _prev_bind_0 = $merge_fort_assertion_map$.currentBinding( thread );
    try
    {
      $merge_fort_assertion_map$.bind( make_merge_fort_assertion_map( kb_indexing.num_index( kill_term ) ), thread );
      SubLObject isa_assertions = NIL;
      SubLObject genls_assertions = NIL;
      SubLObject tou_assertions = NIL;
      SubLObject arg1_assertions = NIL;
      SubLObject all_term_assertions = NIL;
      SubLObject skolem_assertions = NIL;
      final SubLObject _prev_bind_0_$2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym79$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const80$EverythingPSC, thread );
        isa_assertions = kb_mapping.gather_gaf_arg_index( kill_term, ONE_INTEGER, $const57$isa, UNPROVIDED, UNPROVIDED );
        genls_assertions = kb_mapping.gather_gaf_arg_index( kill_term, ONE_INTEGER, $const81$genls, UNPROVIDED, UNPROVIDED );
        tou_assertions = kb_mapping.gather_gaf_arg_index( kill_term, ONE_INTEGER, $const82$termOfUnit, UNPROVIDED, UNPROVIDED );
        arg1_assertions = kb_mapping.gather_gaf_arg_index( kill_term, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject cdolist_list_var2;
        all_term_assertions = ( cdolist_list_var2 = kb_accessors.all_term_assertions( kill_term, T ) );
        SubLObject assertion2 = NIL;
        assertion2 = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          if( NIL != list_utilities.tree_find_if( $sym83$SKOLEM_NART_, assertions_high.assertion_formula( assertion2 ), UNPROVIDED ) )
          {
            skolem_assertions = ConsesLow.cons( assertion2, skolem_assertions );
          }
          cdolist_list_var2 = cdolist_list_var2.rest();
          assertion2 = cdolist_list_var2.first();
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$2, thread );
      }
      all_term_assertions = conses_high.nset_difference( all_term_assertions, arg1_assertions, UNPROVIDED, UNPROVIDED );
      all_term_assertions = conses_high.nset_difference( all_term_assertions, skolem_assertions, UNPROVIDED, UNPROVIDED );
      arg1_assertions = conses_high.nset_difference( arg1_assertions, tou_assertions, UNPROVIDED, UNPROVIDED );
      arg1_assertions = conses_high.nset_difference( arg1_assertions, genls_assertions, UNPROVIDED, UNPROVIDED );
      arg1_assertions = conses_high.nset_difference( arg1_assertions, isa_assertions, UNPROVIDED, UNPROVIDED );
      arg1_assertions = conses_high.nset_difference( arg1_assertions, skolem_assertions, UNPROVIDED, UNPROVIDED );
      SubLObject processed_el_formula_mt_pairs = NIL;
      final SubLObject kill_term_el_formula = ( NIL != nart_handles.nart_p( kill_term ) ) ? narts_high.nart_el_formula( kill_term ) : kill_term;
      SubLObject cdolist_list_var2 = skolem_assertions;
      SubLObject assertion2 = NIL;
      assertion2 = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        thread.resetMultipleValues();
        final SubLObject assertion_el_formula = uncanonicalizer.assertion_el_formula( assertion2 );
        final SubLObject assertion_el_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject assertion_el_formula_mt_pair = ConsesLow.list( assertion_el_formula, assertion_el_mt );
        if( NIL == subl_promotions.memberP( assertion_el_formula_mt_pair, processed_el_formula_mt_pairs, Symbols.symbol_function( EQUAL ), UNPROVIDED ) && NIL != skolems.skolem_defining_assertionP( assertion2 ) )
        {
          processed_el_formula_mt_pairs = ConsesLow.cons( assertion_el_formula_mt_pair, processed_el_formula_mt_pairs );
          final SubLObject new_formula = list_utilities.tree_substitute( assertion_el_formula, kill_term_el_formula, keep_term );
          final SubLObject new_mt = cycl_utilities.expression_subst( keep_term, kill_term_el_formula, assertion_el_mt, Symbols.symbol_function( EQUAL ), UNPROVIDED );
          final SubLObject asserted_argument = assertions_high.get_asserted_argument( assertion2 );
          substitute_asserted_argument( new_formula, new_mt, asserted_argument, assertion2 );
          add_merge_fort_assertion_mapping( new_formula, new_mt, assertion2 );
        }
        cdolist_list_var2 = cdolist_list_var2.rest();
        assertion2 = cdolist_list_var2.first();
      }
      SubLObject cdolist_list_var3 = isa_assertions;
      SubLObject assertion3 = NIL;
      assertion3 = cdolist_list_var3.first();
      while ( NIL != cdolist_list_var3)
      {
        substitute_assertion( keep_term, kill_term, assertion3, NIL );
        cdolist_list_var3 = cdolist_list_var3.rest();
        assertion3 = cdolist_list_var3.first();
      }
      cdolist_list_var3 = genls_assertions;
      assertion3 = NIL;
      assertion3 = cdolist_list_var3.first();
      while ( NIL != cdolist_list_var3)
      {
        substitute_assertion( keep_term, kill_term, assertion3, NIL );
        cdolist_list_var3 = cdolist_list_var3.rest();
        assertion3 = cdolist_list_var3.first();
      }
      cdolist_list_var3 = arg1_assertions;
      assertion3 = NIL;
      assertion3 = cdolist_list_var3.first();
      while ( NIL != cdolist_list_var3)
      {
        substitute_assertion( keep_term, kill_term, assertion3, NIL );
        cdolist_list_var3 = cdolist_list_var3.rest();
        assertion3 = cdolist_list_var3.first();
      }
      SubLObject max_term_order = ZERO_INTEGER;
      final SubLObject term_order_map = Hashtables.make_hash_table( Sequences.length( all_term_assertions ), UNPROVIDED, UNPROVIDED );
      cdolist_list_var2 = all_term_assertions;
      assertion2 = NIL;
      assertion2 = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        final SubLObject term_order = kb_utilities.term_order( assertion2 );
        Hashtables.sethash( assertion2, term_order_map, term_order );
        if( term_order.numG( max_term_order ) )
        {
          max_term_order = term_order;
        }
        cdolist_list_var2 = cdolist_list_var2.rest();
        assertion2 = cdolist_list_var2.first();
      }
      SubLObject cur_term_order_1;
      SubLObject cur_term_order;
      SubLObject cdolist_list_var4;
      SubLObject assertion4;
      for( cur_term_order_1 = NIL, cur_term_order_1 = ZERO_INTEGER; cur_term_order_1.numL( max_term_order ); cur_term_order_1 = Numbers.add( cur_term_order_1, ONE_INTEGER ) )
      {
        cur_term_order = Numbers.add( ONE_INTEGER, cur_term_order_1 );
        cdolist_list_var4 = all_term_assertions;
        assertion4 = NIL;
        assertion4 = cdolist_list_var4.first();
        while ( NIL != cdolist_list_var4)
        {
          if( cur_term_order.eql( Hashtables.gethash( assertion4, term_order_map, UNPROVIDED ) ) )
          {
            substitute_assertion( keep_term, kill_term, assertion4, NIL );
          }
          cdolist_list_var4 = cdolist_list_var4.rest();
          assertion4 = cdolist_list_var4.first();
        }
      }
      cdolist_list_var3 = tou_assertions;
      assertion3 = NIL;
      assertion3 = cdolist_list_var3.first();
      while ( NIL != cdolist_list_var3)
      {
        substitute_termofunit_assertion( keep_term, kill_term, assertion3, NIL );
        cdolist_list_var3 = cdolist_list_var3.rest();
        assertion3 = cdolist_list_var3.first();
      }
    }
    finally
    {
      $merge_fort_assertion_map$.rebind( _prev_bind_0, thread );
    }
    fi_kill_int( kill_term );
    forward.perform_forward_inference();
    return keep_term;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35946L)
  public static SubLObject merge_dependent_narts(final SubLObject kill_term, final SubLObject keep_term)
  {
    SubLObject cdolist_list_var;
    final SubLObject kill_nats = cdolist_list_var = indexing_utilities.dependent_narts( kill_term );
    SubLObject kill_nat = NIL;
    kill_nat = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == term.skolem_nartP( kill_nat ) )
      {
        final SubLObject kill_nart_el_formula = narts_high.nart_el_formula( kill_nat );
        if( NIL != kill_nart_el_formula )
        {
          final SubLObject keep_nart_el_formula = conses_high.subst( keep_term, kill_term, kill_nart_el_formula, UNPROVIDED, UNPROVIDED );
          final SubLObject keep_nat = czer_main.cyc_find_or_create_nart( keep_nart_el_formula, UNPROVIDED );
          if( NIL != nart_handles.nart_p( keep_nat ) )
          {
            merge_fort_recursive( kill_nat, keep_nat );
          }
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      kill_nat = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 36676L)
  public static SubLObject merge_dependent_kb_hl_supports(final SubLObject kill_term, final SubLObject keep_term)
  {
    SubLObject cdolist_list_var;
    final SubLObject kb_hl_supports = cdolist_list_var = kb_hl_supports_high.find_kb_hl_supports_mentioning_term( kill_term );
    SubLObject kb_hl_support = NIL;
    kb_hl_support = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject kill_hl_support = kb_hl_supports_high.kb_hl_support_hl_support( kb_hl_support );
      final SubLObject keep_hl_support = conses_high.subst( keep_term, kill_term, kill_hl_support, UNPROVIDED, UNPROVIDED );
      final SubLObject justification = kb_hl_supports_high.kb_hl_support_justification( kb_hl_support );
      kb_hl_supports_high.find_or_create_kb_hl_support( keep_hl_support, justification );
      cdolist_list_var = cdolist_list_var.rest();
      kb_hl_support = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37152L)
  public static SubLObject substitute_assertion(final SubLObject keep_term, final SubLObject kill_term, final SubLObject source_assertion, final SubLObject remove_source_argumentsP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != forts.fort_p( keep_term ) : keep_term;
    assert NIL != forts.fort_p( kill_term ) : kill_term;
    assert NIL != assertion_handles.assertion_p( source_assertion ) : source_assertion;
    if( NIL != assertions_high.valid_assertion( source_assertion, UNPROVIDED ) )
    {
      thread.resetMultipleValues();
      final SubLObject old_el_formula = uncanonicalizer.assertion_el_formula( source_assertion );
      final SubLObject old_el_mt = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject kill_term_el_formula = ( NIL != nart_handles.nart_p( kill_term ) ) ? narts_high.nart_el_formula( kill_term ) : kill_term;
      SubLObject new_el_formula = cycl_utilities.expression_subst( keep_term, kill_term_el_formula, old_el_formula, Symbols.symbol_function( EQUAL ), UNPROVIDED );
      final SubLObject new_el_mt = cycl_utilities.expression_subst( keep_term, kill_term_el_formula, old_el_mt, Symbols.symbol_function( EQUAL ), UNPROVIDED );
      if( NIL != assertion_utilities.meta_assertion_p( source_assertion ) && NIL != merge_fort_assertion_map_validP() )
      {
        final SubLObject old_hl_formula = assertion_hl_formula( source_assertion, UNPROVIDED );
        SubLObject cdolist_list_var = list_utilities.find_all_if( $sym84$ASSERTION_P, old_hl_formula, UNPROVIDED );
        SubLObject sub_assertion = NIL;
        sub_assertion = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject new_sub_assertion = get_merge_fort_assertion_mapping( sub_assertion );
          if( NIL != assertion_handles.assertion_p( new_sub_assertion ) )
          {
            final SubLObject sub_assertion_el_formula = uncanonicalizer.assertion_el_formula( sub_assertion );
            final SubLObject new_sub_assertion_el_formula = uncanonicalizer.assertion_el_formula( new_sub_assertion );
            new_el_formula = conses_high.subst( new_sub_assertion_el_formula, sub_assertion_el_formula, new_el_formula, Symbols.symbol_function( EQUAL ), UNPROVIDED );
          }
          cdolist_list_var = cdolist_list_var.rest();
          sub_assertion = cdolist_list_var.first();
        }
      }
      if( NIL != list_utilities.tree_find_if( $sym85$SKOLEM_TERM_, new_el_formula, UNPROVIDED ) || NIL != list_utilities.tree_find_if( $sym85$SKOLEM_TERM_, new_el_mt, UNPROVIDED ) )
      {
        Errors.warn( $str86$Could_not_merge_assertion_onto_te, keep_term, source_assertion );
        return NIL;
      }
      SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding( thread );
      SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding( thread );
      SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding( thread );
      SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding( thread );
      SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding( thread );
      SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding( thread );
      SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding( thread );
      SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding( thread );
      SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding( thread );
      SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding( thread );
      SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding( thread );
      try
      {
        control_vars.$within_assert$.bind( NIL, thread );
        wff_utilities.$check_arg_typesP$.bind( NIL, thread );
        at_vars.$at_check_arg_typesP$.bind( NIL, thread );
        wff_utilities.$check_wff_semanticsP$.bind( NIL, thread );
        wff_utilities.$check_wff_coherenceP$.bind( NIL, thread );
        wff_utilities.$check_var_typesP$.bind( NIL, thread );
        czer_vars.$simplify_literalP$.bind( NIL, thread );
        at_vars.$at_check_relator_constraintsP$.bind( NIL, thread );
        at_vars.$at_check_arg_formatP$.bind( NIL, thread );
        wff_vars.$validate_constantsP$.bind( NIL, thread );
        system_parameters.$suspend_sbhl_type_checkingP$.bind( T, thread );
        SubLObject cdolist_list_var2 = assertions_high.assertion_arguments( source_assertion );
        SubLObject source_argument = NIL;
        source_argument = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          if( NIL != arguments.asserted_argument_p( source_argument ) )
          {
            substitute_asserted_argument( new_el_formula, new_el_mt, source_argument, source_assertion );
          }
          else if( NIL != deduction_handles.deduction_p( source_argument ) )
          {
            substitute_deduction( new_el_formula, new_el_mt, keep_term, kill_term, source_argument, source_assertion );
          }
          cdolist_list_var2 = cdolist_list_var2.rest();
          source_argument = cdolist_list_var2.first();
        }
        substitute_dependents( new_el_formula, new_el_mt, keep_term, kill_term, source_assertion );
      }
      finally
      {
        system_parameters.$suspend_sbhl_type_checkingP$.rebind( _prev_bind_11, thread );
        wff_vars.$validate_constantsP$.rebind( _prev_bind_10, thread );
        at_vars.$at_check_arg_formatP$.rebind( _prev_bind_9, thread );
        at_vars.$at_check_relator_constraintsP$.rebind( _prev_bind_8, thread );
        czer_vars.$simplify_literalP$.rebind( _prev_bind_7, thread );
        wff_utilities.$check_var_typesP$.rebind( _prev_bind_6, thread );
        wff_utilities.$check_wff_coherenceP$.rebind( _prev_bind_5, thread );
        wff_utilities.$check_wff_semanticsP$.rebind( _prev_bind_4, thread );
        at_vars.$at_check_arg_typesP$.rebind( _prev_bind_3, thread );
        wff_utilities.$check_arg_typesP$.rebind( _prev_bind_2, thread );
        control_vars.$within_assert$.rebind( _prev_bind_0, thread );
      }
      add_merge_fort_assertion_mapping( new_el_formula, new_el_mt, source_assertion );
      _prev_bind_0 = control_vars.$within_assert$.currentBinding( thread );
      _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding( thread );
      _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding( thread );
      _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding( thread );
      _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding( thread );
      _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding( thread );
      _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding( thread );
      _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding( thread );
      _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding( thread );
      _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding( thread );
      _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding( thread );
      try
      {
        control_vars.$within_assert$.bind( NIL, thread );
        wff_utilities.$check_arg_typesP$.bind( NIL, thread );
        at_vars.$at_check_arg_typesP$.bind( NIL, thread );
        wff_utilities.$check_wff_semanticsP$.bind( NIL, thread );
        wff_utilities.$check_wff_coherenceP$.bind( NIL, thread );
        wff_utilities.$check_var_typesP$.bind( NIL, thread );
        czer_vars.$simplify_literalP$.bind( NIL, thread );
        at_vars.$at_check_relator_constraintsP$.bind( NIL, thread );
        at_vars.$at_check_arg_formatP$.bind( NIL, thread );
        wff_vars.$validate_constantsP$.bind( NIL, thread );
        system_parameters.$suspend_sbhl_type_checkingP$.bind( T, thread );
        if( NIL != remove_source_argumentsP )
        {
          SubLObject cdolist_list_var2 = assertions_high.assertion_arguments( source_assertion );
          SubLObject source_argument = NIL;
          source_argument = cdolist_list_var2.first();
          while ( NIL != cdolist_list_var2)
          {
            tms.tms_remove_argument( source_argument, source_assertion, UNPROVIDED );
            cdolist_list_var2 = cdolist_list_var2.rest();
            source_argument = cdolist_list_var2.first();
          }
        }
      }
      finally
      {
        system_parameters.$suspend_sbhl_type_checkingP$.rebind( _prev_bind_11, thread );
        wff_vars.$validate_constantsP$.rebind( _prev_bind_10, thread );
        at_vars.$at_check_arg_formatP$.rebind( _prev_bind_9, thread );
        at_vars.$at_check_relator_constraintsP$.rebind( _prev_bind_8, thread );
        czer_vars.$simplify_literalP$.rebind( _prev_bind_7, thread );
        wff_utilities.$check_var_typesP$.rebind( _prev_bind_6, thread );
        wff_utilities.$check_wff_coherenceP$.rebind( _prev_bind_5, thread );
        wff_utilities.$check_wff_semanticsP$.rebind( _prev_bind_4, thread );
        at_vars.$at_check_arg_typesP$.rebind( _prev_bind_3, thread );
        wff_utilities.$check_arg_typesP$.rebind( _prev_bind_2, thread );
        control_vars.$within_assert$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39917L)
  public static SubLObject substitute_asserted_argument(final SubLObject new_formula, final SubLObject new_mt, final SubLObject source_argument, final SubLObject source_assertion)
  {
    final SubLObject strength = arguments.argument_strength( source_argument );
    final SubLObject direction = assertions_high.assertion_direction( source_assertion );
    final SubLObject timestampedP = assertions_low.asserted_assertion_timestampedP( source_assertion );
    SubLObject who = NIL;
    SubLObject when = NIL;
    SubLObject why = NIL;
    SubLObject second = NIL;
    if( NIL != timestampedP )
    {
      who = assertions_high.asserted_by( source_assertion );
      when = assertions_high.asserted_when( source_assertion );
      why = assertions_high.asserted_why( source_assertion );
      second = assertions_high.asserted_second( source_assertion );
    }
    fi_assert_int( new_formula, new_mt, strength, direction );
    if( NIL != timestampedP )
    {
      fi_timestamp_assertion_int( who, when, why, second );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40642L)
  public static SubLObject substitute_deduction(final SubLObject new_formula, final SubLObject new_mt, final SubLObject keep_term, final SubLObject kill_term, final SubLObject source_deduction,
      final SubLObject source_assertion)
  {
    if( NIL != deduction_handles.valid_deduction( source_deduction, UNPROVIDED ) )
    {
      final SubLObject direction = assertions_high.assertion_direction( source_assertion );
      final SubLObject old_supports = deductions_high.deduction_supports( source_deduction );
      final SubLObject new_supports = conses_high.subst( keep_term, kill_term, old_supports, UNPROVIDED, UNPROVIDED );
      final SubLObject new_el_supports = Mapping.mapcar( Symbols.symbol_function( $sym87$CONVERT_HL_SUPPORT_TO_FI_SUPPORT ), new_supports );
      fi_add_argument_int( new_formula, new_mt, new_el_supports, direction, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41147L)
  public static SubLObject substitute_dependents(final SubLObject new_formula, final SubLObject new_mt, final SubLObject keep_term, final SubLObject kill_term, final SubLObject source_assertion)
  {
    final SubLObject new_assertion = sentence_assertions( new_formula, new_mt ).first();
    if( NIL != assertion_handles.assertion_p( new_assertion ) )
    {
      substitute_dependent_assertion( new_assertion, keep_term, kill_term, source_assertion );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41464L)
  public static SubLObject substitute_dependent_assertion(final SubLObject new_assertion, final SubLObject keep_term, final SubLObject kill_term, final SubLObject source_assertion)
  {
    SubLObject cdolist_list_var = assertions_high.assertion_dependent_list( source_assertion );
    SubLObject dependent = NIL;
    dependent = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != deduction_handles.valid_deductionP( dependent, UNPROVIDED ) )
      {
        final SubLObject supported_object = deductions_high.deduction_supported_object( dependent );
        final SubLObject old_supports = deductions_high.deduction_supports( dependent );
        final SubLObject new_supports = Sequences.substitute( new_assertion, source_assertion, conses_high.subst( keep_term, kill_term, old_supports, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
            UNPROVIDED, UNPROVIDED );
        if( NIL != assertion_handles.assertion_p( supported_object ) )
        {
          final SubLObject supported_formula = assertion_hl_formula( supported_object, UNPROVIDED );
          final SubLObject supported_mt = assertions_high.assertion_mt( supported_object );
          final SubLObject direction = assertions_high.assertion_direction( supported_object );
          final SubLObject new_el_supports = Mapping.mapcar( Symbols.symbol_function( $sym87$CONVERT_HL_SUPPORT_TO_FI_SUPPORT ), new_supports );
          fi_add_argument_int( supported_formula, supported_mt, new_el_supports, direction, UNPROVIDED );
        }
        else
        {
          final SubLObject kb_hl_support = kb_hl_supports_high.find_kb_hl_support( supported_object );
          kb_hl_supports_low.kb_hl_support_reset_justification( kb_hl_support, new_supports );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      dependent = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42478L)
  public static SubLObject substitute_termofunit_assertion(final SubLObject keep_term, final SubLObject kill_term, final SubLObject source_assertion, final SubLObject remove_source_argumentsP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != forts.fort_p( keep_term ) : keep_term;
    assert NIL != forts.fort_p( kill_term ) : kill_term;
    assert NIL != assertion_handles.assertion_p( source_assertion ) : source_assertion;
    if( NIL != assertions_high.valid_assertion( source_assertion, UNPROVIDED ) )
    {
      if( NIL != nart_handles.nart_p( keep_term ) )
      {
        final SubLObject new_assertion = function_terms.term_of_unit_assertion( keep_term );
        final SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding( thread );
        final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding( thread );
        final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding( thread );
        final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding( thread );
        final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding( thread );
        final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding( thread );
        final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding( thread );
        final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding( thread );
        final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding( thread );
        final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding( thread );
        final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding( thread );
        try
        {
          control_vars.$within_assert$.bind( NIL, thread );
          wff_utilities.$check_arg_typesP$.bind( NIL, thread );
          at_vars.$at_check_arg_typesP$.bind( NIL, thread );
          wff_utilities.$check_wff_semanticsP$.bind( NIL, thread );
          wff_utilities.$check_wff_coherenceP$.bind( NIL, thread );
          wff_utilities.$check_var_typesP$.bind( NIL, thread );
          czer_vars.$simplify_literalP$.bind( NIL, thread );
          at_vars.$at_check_relator_constraintsP$.bind( NIL, thread );
          at_vars.$at_check_arg_formatP$.bind( NIL, thread );
          wff_vars.$validate_constantsP$.bind( NIL, thread );
          system_parameters.$suspend_sbhl_type_checkingP$.bind( T, thread );
          substitute_dependent_assertion( new_assertion, keep_term, kill_term, source_assertion );
        }
        finally
        {
          system_parameters.$suspend_sbhl_type_checkingP$.rebind( _prev_bind_11, thread );
          wff_vars.$validate_constantsP$.rebind( _prev_bind_10, thread );
          at_vars.$at_check_arg_formatP$.rebind( _prev_bind_9, thread );
          at_vars.$at_check_relator_constraintsP$.rebind( _prev_bind_8, thread );
          czer_vars.$simplify_literalP$.rebind( _prev_bind_7, thread );
          wff_utilities.$check_var_typesP$.rebind( _prev_bind_6, thread );
          wff_utilities.$check_wff_coherenceP$.rebind( _prev_bind_5, thread );
          wff_utilities.$check_wff_semanticsP$.rebind( _prev_bind_4, thread );
          at_vars.$at_check_arg_typesP$.rebind( _prev_bind_3, thread );
          wff_utilities.$check_arg_typesP$.rebind( _prev_bind_2, thread );
          control_vars.$within_assert$.rebind( _prev_bind_0, thread );
        }
        add_merge_fort_assertion_mapping( assertions_high.assertion_formula( new_assertion ), assertions_high.assertion_mt( new_assertion ), source_assertion );
      }
      if( NIL != remove_source_argumentsP )
      {
        SubLObject cdolist_list_var = assertions_high.assertion_arguments( source_assertion );
        SubLObject source_argument = NIL;
        source_argument = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          tms.tms_remove_argument( source_argument, source_assertion, UNPROVIDED );
          cdolist_list_var = cdolist_list_var.rest();
          source_argument = cdolist_list_var.first();
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43549L)
  public static SubLObject make_merge_fort_assertion_map(final SubLObject size)
  {
    return Hashtables.make_hash_table( size, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43670L)
  public static SubLObject merge_fort_assertion_map_validP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Types.hash_table_p( $merge_fort_assertion_map$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43773L)
  public static SubLObject add_merge_fort_assertion_mapping(final SubLObject new_formula, final SubLObject new_mt, final SubLObject source_assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $merge_fort_assertion_map$.getDynamicValue( thread ).isHashtable() )
    {
      Hashtables.sethash( source_assertion, $merge_fort_assertion_map$.getDynamicValue( thread ), el_utilities.make_ist_sentence( new_formula, new_mt ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 44023L)
  public static SubLObject get_merge_fort_assertion_mapping(final SubLObject source_assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Hashtables.gethash( source_assertion, $merge_fort_assertion_map$.getDynamicValue( thread ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 44155L)
  public static SubLObject fi_kill(final SubLObject fort)
  {
    return fi( $kw88$KILL, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 44388L)
  public static SubLObject fi_kill_int(SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    reset_fi_error_state();
    fort = fi_convert_to_fort( fort );
    if( NIL != fi_error_signaledP() )
    {
      return NIL;
    }
    if( NIL != constants_high.uninstalled_constant_p( fort ) )
    {
      signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str93$Constant__S_is_merely_an_empty_sh, fort ) );
      return NIL;
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != kb_utilities.core_union_constantP( fort ) )
    {
      Errors.error( $str94$Cannot_kill_core_constant__a___To, fort );
    }
    final SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding( thread );
    final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding( thread );
    final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding( thread );
    final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding( thread );
    final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding( thread );
    final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding( thread );
    final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding( thread );
    final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding( thread );
    final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding( thread );
    final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding( thread );
    final SubLObject _prev_bind_12 = $within_fi_operationP$.currentBinding( thread );
    try
    {
      control_vars.$within_assert$.bind( NIL, thread );
      wff_utilities.$check_arg_typesP$.bind( NIL, thread );
      at_vars.$at_check_arg_typesP$.bind( NIL, thread );
      wff_utilities.$check_wff_semanticsP$.bind( NIL, thread );
      wff_utilities.$check_wff_coherenceP$.bind( NIL, thread );
      wff_utilities.$check_var_typesP$.bind( NIL, thread );
      czer_vars.$simplify_literalP$.bind( NIL, thread );
      at_vars.$at_check_relator_constraintsP$.bind( NIL, thread );
      at_vars.$at_check_arg_formatP$.bind( NIL, thread );
      wff_vars.$validate_constantsP$.bind( NIL, thread );
      system_parameters.$suspend_sbhl_type_checkingP$.bind( T, thread );
      $within_fi_operationP$.bind( T, thread );
      forts.remove_fort( fort );
    }
    finally
    {
      $within_fi_operationP$.rebind( _prev_bind_12, thread );
      system_parameters.$suspend_sbhl_type_checkingP$.rebind( _prev_bind_11, thread );
      wff_vars.$validate_constantsP$.rebind( _prev_bind_10, thread );
      at_vars.$at_check_arg_formatP$.rebind( _prev_bind_9, thread );
      at_vars.$at_check_relator_constraintsP$.rebind( _prev_bind_8, thread );
      czer_vars.$simplify_literalP$.rebind( _prev_bind_7, thread );
      wff_utilities.$check_var_typesP$.rebind( _prev_bind_6, thread );
      wff_utilities.$check_wff_coherenceP$.rebind( _prev_bind_5, thread );
      wff_utilities.$check_wff_semanticsP$.rebind( _prev_bind_4, thread );
      at_vars.$at_check_arg_typesP$.rebind( _prev_bind_3, thread );
      wff_utilities.$check_arg_typesP$.rebind( _prev_bind_2, thread );
      control_vars.$within_assert$.rebind( _prev_bind_0, thread );
    }
    return makeBoolean( NIL == fi_error_signaledP() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 45074L)
  public static SubLObject fi_rename(final SubLObject constant, final SubLObject name)
  {
    return fi( $kw95$RENAME, constant, name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 45320L)
  public static SubLObject fi_rename_int(final SubLObject constant, SubLObject name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    reset_fi_error_state();
    if( NIL == constant_handles.constant_p( constant ) )
    {
      signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str99$Expected_a_constant__got__S, constant ) );
      return NIL;
    }
    if( !name.isString() )
    {
      signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str33$Expected_a_string__got__S, name ) );
      return NIL;
    }
    if( NIL == constant_completion_high.valid_constant_name_p( name ) )
    {
      signal_fi_error( ConsesLow.list( $kw34$INVALID_NAME, $str35$_S_is_not_a_valid_name_for_a_cons, name ) );
      return NIL;
    }
    if( NIL != constant_completion_high.$require_case_insensitive_name_uniqueness$.getDynamicValue( thread ) )
    {
      SubLObject name_collisions = constant_completion_high.constant_name_case_collisions( name );
      name_collisions = Sequences.delete( constant, name_collisions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL != name_collisions )
      {
        final SubLObject new_name = constant_completion_high.uniquify_constant_name( name, UNPROVIDED );
        signal_fi_warning( ConsesLow.list( $kw46$NAME_CLASH, $str47$NAME_clash_for__S___renaming_to__, name, new_name ) );
        name = new_name;
      }
    }
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = $within_fi_operationP$.currentBinding( thread );
    try
    {
      $within_fi_operationP$.bind( T, thread );
      if( constants_high.constant_name( constant ).equal( name ) )
      {
        signal_fi_warning( ConsesLow.list( $kw100$ALREADY_HAS_NAME, $str101$Constant__S_is_already_named__A, constant, name ) );
      }
      else
      {
        final SubLObject existing_constant = constants_high.find_constant( name );
        if( NIL != constant_handles.valid_constantP( existing_constant, UNPROVIDED ) )
        {
          final SubLObject new_name2 = constant_completion_high.uniquify_constant_name( name, UNPROVIDED );
          ans = constants_high.rename_constant( constant, new_name2 );
          signal_fi_warning( ConsesLow.list( $kw46$NAME_CLASH, $str47$NAME_clash_for__S___renaming_to__, name, new_name2 ) );
        }
        else
        {
          if( NIL != constant_handles.constant_p( existing_constant ) )
          {
            constants_high.remove_constant( existing_constant );
          }
          ans = constants_high.rename_constant( constant, name );
        }
      }
    }
    finally
    {
      $within_fi_operationP$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47033L)
  public static SubLObject fi_lookup(final SubLObject formula, final SubLObject mt)
  {
    return fi( $kw102$LOOKUP, formula, hlmt_czer.canonicalize_hlmt( mt ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47589L)
  public static SubLObject fi_lookup_int(final SubLObject formula, SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    reset_fi_error_state();
    if( NIL == el_utilities.el_formula_p( formula ) )
    {
      signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str107$Expected_a_cons__got__S, formula ) );
      return NIL;
    }
    mt = fi_convert_to_assert_hlmt( mt );
    if( NIL != fi_error_signaledP() )
    {
      return NIL;
    }
    SubLObject assertions = NIL;
    SubLObject everything_thereP = NIL;
    final SubLObject _prev_bind_0 = $within_fi_operationP$.currentBinding( thread );
    try
    {
      $within_fi_operationP$.bind( T, thread );
      thread.resetMultipleValues();
      final SubLObject ass_ans = sentence_assertions( formula, mt );
      final SubLObject every_ans = thread.secondMultipleValue();
      final SubLObject canon_error = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      signal_fi_error( canon_error );
      assertions = ass_ans;
      everything_thereP = every_ans;
    }
    finally
    {
      $within_fi_operationP$.rebind( _prev_bind_0, thread );
    }
    return Values.values( Mapping.mapcar( Symbols.symbol_function( $sym108$ASSERTION_FI_FORMULA ), assertions ), everything_thereP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 48205L)
  public static SubLObject sentence_assertions_in_mt(final SubLObject sentence, final SubLObject mt, final SubLObject use_genl_mtsP)
  {
    if( NIL != use_genl_mtsP )
    {
      return sentence_visible_assertions( sentence, mt );
    }
    return sentence_assertions( sentence, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 48552L)
  public static SubLObject sentence_assertions(final SubLObject sentence, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == wff.el_wffP( sentence, mt, UNPROVIDED ) )
    {
      final SubLObject error = fi_not_wff_error( sentence, mt );
      return Values.values( NIL, T, error );
    }
    thread.resetMultipleValues();
    final SubLObject assertions = czer_meta.find_assertions_cycl( sentence, mt );
    final SubLObject missingP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return Values.values( assertions, makeBoolean( NIL == missingP ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 49204L)
  public static SubLObject sentence_visible_assertions(final SubLObject sentence, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == wff.el_wffP( sentence, mt, UNPROVIDED ) )
    {
      final SubLObject error = fi_not_wff_error( sentence, mt );
      return Values.values( NIL, T, error );
    }
    thread.resetMultipleValues();
    final SubLObject assertions = czer_meta.find_visible_assertions_cycl( sentence, mt );
    final SubLObject missingP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return Values.values( assertions, makeBoolean( NIL == missingP ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 49900L)
  public static SubLObject sentence_assertions_in_any_mt(final SubLObject sentence)
  {
    return sentence_visible_assertions( sentence, $const80$EverythingPSC );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 50359L)
  public static SubLObject sentence_assertion(final SubLObject sentence, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject assertions = sentence_assertions( sentence, mt );
    final SubLObject all_present = thread.secondMultipleValue();
    final SubLObject canon_error = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != assertions && NIL != list_utilities.singletonP( assertions ) && NIL != all_present && NIL == canon_error )
    {
      return assertions.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 50711L)
  public static SubLObject gaf_sentence_assertion(final SubLObject gaf, final SubLObject mt)
  {
    final SubLObject assertion = sentence_assertion( gaf, mt );
    if( NIL != assertions_high.gaf_assertionP( assertion ) )
    {
      return assertion;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 50972L)
  public static SubLObject fi_assert(final SubLObject formula, final SubLObject mt, SubLObject strength, SubLObject direction)
  {
    if( strength == UNPROVIDED )
    {
      strength = $kw109$DEFAULT;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    return fi( $kw110$ASSERT, formula, hlmt_czer.canonicalize_hlmt( mt ), strength, direction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 51538L)
  public static SubLObject fi_assert_int(SubLObject formula, SubLObject mt, SubLObject strength, SubLObject direction)
  {
    if( strength == UNPROVIDED )
    {
      strength = $kw109$DEFAULT;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    reset_fi_error_state();
    if( NIL == el_utilities.el_formula_p( formula ) )
    {
      signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str107$Expected_a_cons__got__S, formula ) );
      return NIL;
    }
    formula = canon_tl.transform_tl_terms_to_hl( formula );
    mt = canon_tl.transform_tl_terms_to_hl( mt );
    mt = fi_convert_to_assert_hlmt_if_wft( mt );
    if( NIL != fi_error_signaledP() )
    {
      return NIL;
    }
    if( NIL == enumeration_types.el_strength_p( strength ) )
    {
      signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str114$Expected__default_or__monotonic__, strength ) );
      return NIL;
    }
    if( NIL != direction && NIL == enumeration_types.direction_p( direction ) )
    {
      signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str115$Expected_a_direction__got__S, direction ) );
      return NIL;
    }
    SubLObject assertions_found_or_created = NIL;
    SubLObject ans = NIL;
    SubLObject janus_deduce_specs = NIL;
    final SubLObject environment = utilities_macros.possibly_get_forward_inference_environment();
    assert NIL != queues.queue_p( environment ) : environment;
    final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding( thread );
    final SubLObject _prev_bind_2 = control_vars.$janus_within_somethingP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = control_vars.$janus_extraction_deduce_specs$.currentBinding( thread );
    try
    {
      kb_control_vars.$forward_inference_environment$.bind( environment, thread );
      control_vars.$janus_within_somethingP$.bind( T, thread );
      control_vars.$janus_extraction_deduce_specs$.bind( NIL, thread );
      thread.resetMultipleValues();
      final SubLObject canon_versions = ( NIL != $assume_assert_sentence_is_wfP$.getDynamicValue( thread ) ) ? czer_main.canonicalize_wf_assert_sentence( formula, mt )
          : czer_main.canonicalize_assert_sentence( formula, mt );
      final SubLObject canon_mt = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( canon_mt );
      final SubLObject _prev_bind_0_$3 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_1_$4 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2_$5 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      final SubLObject _prev_bind_4 = $within_fi_operationP$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        $within_fi_operationP$.bind( T, thread );
        if( NIL == canon_versions )
        {
          signal_fi_error( fi_not_wff_assert_error( formula, canon_mt ) );
        }
        else if( NIL != kb_utilities.kbeq( canon_versions, $const116$True ) )
        {
          signal_fi_error( ConsesLow.list( $kw117$TAUTOLOGY, $str118$Formula______S___in__S_was_a_taut, formula, canon_mt ) );
        }
        else if( NIL != kb_utilities.kbeq( canon_versions, $const119$False ) )
        {
          signal_fi_error( ConsesLow.list( $kw120$CONTRADICTION, $str121$Formula______S___in__S_was_a_cont, formula, canon_mt ) );
        }
        else
        {
          set_fi_last_assertions_asserted( NIL );
          SubLObject cdolist_list_var = canon_versions;
          SubLObject canon_version = NIL;
          canon_version = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            if( NIL == fi_error_signaledP() )
            {
              SubLObject current;
              final SubLObject datum = current = canon_version;
              SubLObject cnf = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list122 );
              cnf = current.first();
              current = current.rest();
              final SubLObject variable_map = current.isCons() ? current.first() : NIL;
              cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list122 );
              current = current.rest();
              final SubLObject query_free_vars = current.isCons() ? current.first() : NIL;
              cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list122 );
              current = current.rest();
              if( NIL == current )
              {
                if( NIL == direction )
                {
                  direction = fi_cnf_default_direction( cnf );
                }
                final SubLObject assertion = hl_storage_modules.hl_assert( cnf, canon_mt, strength, direction, variable_map );
                if( NIL != assertion_handles.assertion_p( assertion ) )
                {
                  assertions_found_or_created = ConsesLow.cons( assertion, assertions_found_or_created );
                }
                else if( NIL == assertion )
                {
                  signal_fi_error( ConsesLow.list( $kw123$COULD_NOT_ASSERT, $str124$Unable_to_assert_formula__S__in__, formula, canon_mt ) );
                }
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum, $list122 );
              }
            }
            cdolist_list_var = cdolist_list_var.rest();
            canon_version = cdolist_list_var.first();
          }
          assertions_found_or_created = Sequences.nreverse( assertions_found_or_created );
        }
        ans = makeBoolean( NIL == fi_error_signaledP() );
      }
      finally
      {
        $within_fi_operationP$.rebind( _prev_bind_4, thread );
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2_$5, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$4, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0_$3, thread );
      }
      if( NIL == fi_error_signaledP() )
      {
        SubLObject deductions_found_or_created = NIL;
        final SubLObject _prev_bind_0_$4 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding( thread );
        final SubLObject _prev_bind_1_$5 = kb_control_vars.$forward_inference_forbidden_rules$.currentBinding( thread );
        try
        {
          kb_control_vars.$forward_inference_allowed_rules$.bind( hl_prototypes.hl_prototype_allowed_forward_rules( assertions_found_or_created ), thread );
          kb_control_vars.$forward_inference_forbidden_rules$.bind( hl_prototypes.hl_prototype_forbidden_forward_rules( assertions_found_or_created ), thread );
          deductions_found_or_created = forward.perform_forward_inference();
        }
        finally
        {
          kb_control_vars.$forward_inference_forbidden_rules$.rebind( _prev_bind_1_$5, thread );
          kb_control_vars.$forward_inference_allowed_rules$.rebind( _prev_bind_0_$4, thread );
        }
        perform_assert_post_processing( assertions_found_or_created, deductions_found_or_created );
      }
      janus_deduce_specs = control_vars.$janus_extraction_deduce_specs$.getDynamicValue( thread );
    }
    finally
    {
      control_vars.$janus_extraction_deduce_specs$.rebind( _prev_bind_3, thread );
      control_vars.$janus_within_somethingP$.rebind( _prev_bind_2, thread );
      kb_control_vars.$forward_inference_environment$.rebind( _prev_bind_0, thread );
    }
    janus.janus_note_assert_finished( formula, mt, strength, direction, janus_deduce_specs );
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 54872L)
  public static SubLObject perform_assert_post_processing(final SubLObject assertions_found_or_created, final SubLObject deductions_found_or_created)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != list_utilities.every_in_list( $sym125$ASSERTED_ASSERTION_, assertions_found_or_created, UNPROVIDED ) )
    {
      SubLObject skolem_functions = NIL;
      SubLObject cdolist_list_var = assertions_found_or_created;
      SubLObject ass = NIL;
      ass = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == function_terms.tou_assertionP( ass ) )
        {
          SubLObject skolem_narts = NIL;
          if( NIL != cycl_utilities.assertion_find_if( $sym126$FAST_SKOLEM_NAT_, ass, NIL, UNPROVIDED ) )
          {
            final SubLObject _prev_bind_0 = cycl_utilities.$opaque_arg_function$.currentBinding( thread );
            try
            {
              cycl_utilities.$opaque_arg_function$.bind( $sym127$OPAQUE_ARG_WRT_QUOTING_NOT_COUNTING_LOGICAL_OPS_, thread );
              skolem_narts = cycl_utilities.assertion_gather( $sym126$FAST_SKOLEM_NAT_, ass, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            finally
            {
              cycl_utilities.$opaque_arg_function$.rebind( _prev_bind_0, thread );
            }
          }
          if( NIL != skolem_narts )
          {
            SubLObject cdolist_list_var_$8 = skolem_narts;
            SubLObject skolem_nart = NIL;
            skolem_nart = cdolist_list_var_$8.first();
            while ( NIL != cdolist_list_var_$8)
            {
              final SubLObject item_var = cycl_utilities.nat_functor( skolem_nart );
              if( NIL == conses_high.member( item_var, skolem_functions, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                skolem_functions = ConsesLow.cons( item_var, skolem_functions );
              }
              cdolist_list_var_$8 = cdolist_list_var_$8.rest();
              skolem_nart = cdolist_list_var_$8.first();
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        ass = cdolist_list_var.first();
      }
      if( NIL != skolem_functions )
      {
        cdolist_list_var = skolem_functions;
        SubLObject skolem_function = NIL;
        skolem_function = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          perform_assert_post_processing_for_skolem( assertions_found_or_created, skolem_function );
          cdolist_list_var = cdolist_list_var.rest();
          skolem_function = cdolist_list_var.first();
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 56019L)
  public static SubLObject perform_assert_post_processing_for_skolem(final SubLObject defining_assertions, final SubLObject skolem_function)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject skolem_defining_assertions_bookkeeping_sentence = ConsesLow.list( $const128$skolem, skolem_function );
    final SubLObject skolem_defining_assertions_bookkeeping_assertion = czer_meta.find_assertion_cycl( skolem_defining_assertions_bookkeeping_sentence, mt_vars.$skolem_mt$.getGlobalValue() );
    if( NIL != skolem_defining_assertions_bookkeeping_assertion )
    {
      final SubLObject v_arguments = assertions_high.assertion_arguments( skolem_defining_assertions_bookkeeping_assertion );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == list_utilities.lengthE( v_arguments, ONE_INTEGER, UNPROVIDED ) )
      {
        Errors.error( $str129$Found_a___skolem_assertion_with_m, skolem_defining_assertions_bookkeeping_assertion );
      }
      final SubLObject argument = v_arguments.first();
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == deduction_handles.deduction_p( argument ) )
      {
        Errors.error( $str130$Found_a___skolem_assertion_with_a, skolem_defining_assertions_bookkeeping_assertion );
      }
      final SubLObject existing_supports = deductions_high.deduction_supports( argument );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == conses_high.subsetp( defining_assertions, existing_supports, Symbols.symbol_function( $sym131$KBEQ ), UNPROVIDED ) )
      {
        Errors.error( $str132$Defining_assertions_for__s___s__w, skolem_function, defining_assertions, existing_supports );
      }
    }
    else
    {
      cyc_kernel.cyc_add_argument( skolem_defining_assertions_bookkeeping_sentence, defining_assertions, mt_vars.$skolem_mt$.getGlobalValue(), $list133, NIL );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 57531L)
  public static SubLObject fi_perform_assert_post_processing_for_skolem(final SubLObject tl_defining_assertions, SubLObject skolem)
  {
    SubLObject defining_assertions = NIL;
    SubLObject cdolist_list_var = tl_defining_assertions;
    SubLObject tl_defining_assertion = NIL;
    tl_defining_assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject found_defining_assertions = ke.find_assertions_via_tl( tl_defining_assertion, NIL );
      if( NIL != found_defining_assertions )
      {
        defining_assertions = ConsesLow.append( found_defining_assertions, defining_assertions );
      }
      cdolist_list_var = cdolist_list_var.rest();
      tl_defining_assertion = cdolist_list_var.first();
    }
    skolem = canon_tl.transform_tl_terms_to_hl( skolem );
    perform_assert_post_processing_for_skolem( defining_assertions, skolem );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 58227L)
  public static SubLObject fi_cnf_default_direction(final SubLObject cnf)
  {
    assert NIL != clauses.cnf_p( cnf ) : cnf;
    if( NIL != clause_utilities.pos_atomic_clause_p( cnf ) )
    {
      final SubLObject asent = clause_utilities.atomic_clause_asent( cnf );
      if( NIL != el_utilities.ist_sentence_p( asent, UNPROVIDED ) )
      {
        final SubLObject sub_mt = el_utilities.designated_mt( asent );
        final SubLObject subsentence = el_utilities.designated_sentence( asent );
        SubLObject cdolist_list_var;
        final SubLObject sub_cnfs = cdolist_list_var = czer_utilities.extract_el_clauses( czer_main.canonicalize_wf_assert_sentence( subsentence, sub_mt ) );
        SubLObject sub_cnf = NIL;
        sub_cnf = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( $kw135$BACKWARD == fi_cnf_default_direction( sub_cnf ) )
          {
            return $kw135$BACKWARD;
          }
          cdolist_list_var = cdolist_list_var.rest();
          sub_cnf = cdolist_list_var.first();
        }
        return $kw136$FORWARD;
      }
    }
    if( NIL != clauses.atomic_clause_p( cnf ) && NIL != clauses.ground_clause_p( cnf ) )
    {
      return $kw136$FORWARD;
    }
    return $kw135$BACKWARD;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 59387L)
  public static SubLObject fi_not_wff_error(final SubLObject formula, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $generate_precise_fi_wff_errorsP$.getDynamicValue( thread ) )
    {
      return ConsesLow.list( $kw137$FORMULA_NOT_WELL_FORMED, $str138$Formula______S___was_not_well_for, formula, wff.explanation_of_why_not_wff( formula, mt, UNPROVIDED ) );
    }
    return ConsesLow.list( $kw137$FORMULA_NOT_WELL_FORMED, $str139$Formula______S___was_not_well_for, formula );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 59769L)
  public static SubLObject fi_not_wff_assert_error(final SubLObject formula, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $generate_precise_fi_wff_errorsP$.getDynamicValue( thread ) )
    {
      return ConsesLow.list( $kw137$FORMULA_NOT_WELL_FORMED, $str138$Formula______S___was_not_well_for, formula, wff.explanation_of_why_not_wff_assert( formula, mt, UNPROVIDED ) );
    }
    return ConsesLow.list( $kw137$FORMULA_NOT_WELL_FORMED, $str139$Formula______S___was_not_well_for, formula );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 60178L)
  public static SubLObject fi_assert_update_asserted_argument(final SubLObject assertion, final SubLObject hl_tv, final SubLObject direction, SubLObject pre_existing_assertionP)
  {
    if( pre_existing_assertionP == UNPROVIDED )
    {
      pre_existing_assertionP = T;
    }
    final SubLObject current_direction = assertions_high.assertion_direction( assertion );
    final SubLObject existing_asserted_argument = assertions_high.get_asserted_argument( assertion );
    SubLObject truth_status = $kw140$UNINITIALIZED;
    SubLObject strength_status = $kw140$UNINITIALIZED;
    push_fi_last_assertions_asserted( assertion );
    if( NIL != pre_existing_assertionP && NIL != existing_asserted_argument )
    {
      final SubLObject existing_tv = arguments.argument_tv( existing_asserted_argument );
      if( hl_tv.eql( existing_tv ) )
      {
        truth_status = $kw141$UNCHANGED;
        strength_status = $kw141$UNCHANGED;
        if( direction.eql( current_direction ) )
        {
          signal_fi_warning( $list142 );
        }
      }
      else
      {
        if( enumeration_types.tv_truth( existing_tv ).eql( enumeration_types.tv_truth( hl_tv ) ) )
        {
          truth_status = $kw141$UNCHANGED;
        }
        else
        {
          truth_status = $kw143$FLIPPED;
        }
        if( enumeration_types.tv_strength( existing_tv ).eql( enumeration_types.tv_strength( hl_tv ) ) )
        {
          strength_status = $kw141$UNCHANGED;
        }
        else
        {
          strength_status = $kw143$FLIPPED;
        }
        tms.tms_change_asserted_argument_tv( existing_asserted_argument, assertion, hl_tv );
      }
    }
    else
    {
      truth_status = $kw144$NEW;
      strength_status = $kw144$NEW;
      tms.tms_create_asserted_argument_with_tv( assertion, hl_tv, pre_existing_assertionP );
    }
    if( !direction.eql( current_direction ) )
    {
      tms.tms_change_direction( assertion, direction );
    }
    return Values.values( assertion, truth_status, strength_status );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 61808L)
  public static SubLObject hl_assert_update_asserted_argument(final SubLObject assertion, final SubLObject hl_tv, final SubLObject direction, SubLObject pre_existing_assertionP)
  {
    if( pre_existing_assertionP == UNPROVIDED )
    {
      pre_existing_assertionP = T;
    }
    return fi_assert_update_asserted_argument( assertion, hl_tv, direction, pre_existing_assertionP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 62142L)
  public static SubLObject fi_reassert(final SubLObject formula, final SubLObject mt, final SubLObject strength, final SubLObject direction)
  {
    return fi( $kw145$REASSERT, formula, hlmt_czer.canonicalize_hlmt( mt ), strength, direction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 62322L)
  public static SubLObject fi_reassert_int(final SubLObject formula, SubLObject mt, final SubLObject strength, final SubLObject direction)
  {
    reset_fi_error_state();
    if( NIL == el_utilities.el_formula_p( formula ) )
    {
      signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str107$Expected_a_cons__got__S, formula ) );
      return NIL;
    }
    mt = fi_convert_to_assert_hlmt( mt );
    if( NIL != fi_error_signaledP() )
    {
      return NIL;
    }
    if( NIL == enumeration_types.el_strength_p( strength ) )
    {
      signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str114$Expected__default_or__monotonic__, strength ) );
      return NIL;
    }
    if( NIL == enumeration_types.direction_p( direction ) )
    {
      signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str115$Expected_a_direction__got__S, direction ) );
      return NIL;
    }
    SubLObject ans = NIL;
    final SubLObject assertions = ke.find_assertions_via_tl( formula, mt );
    if( NIL != assertions )
    {
      SubLObject cdolist_list_var = assertions;
      SubLObject assertion = NIL;
      assertion = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != assertions_high.asserted_assertionP( assertion ) )
        {
          final SubLObject hl_tv = fi_reassert_hl_tv( assertion, strength );
          fi_assert_update_asserted_argument( assertion, hl_tv, direction, UNPROVIDED );
        }
        else
        {
          final SubLObject current_strength = assertions_high.assertion_strength( assertion );
          fi_rededuce_deduction_assertion( assertion, direction );
          if( !strength.eql( current_strength ) )
          {
            signal_fi_warning( $list146 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        assertion = cdolist_list_var.first();
      }
    }
    else
    {
      signal_fi_warning( ConsesLow.list( $kw147$ASSERTION_NOT_PRESENT, $str148$Formula__S_in_mt__S_is_not_in_the, formula, mt ) );
    }
    ans = makeBoolean( NIL == fi_error_signaledP() );
    if( NIL == fi_error_signaledP() )
    {
      forward.perform_forward_inference();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 63832L)
  public static SubLObject fi_reassert_hl_tv(final SubLObject existing_assertion, final SubLObject new_strength)
  {
    return enumeration_types.tv_from_truth_strength( assertions_high.assertion_truth( existing_assertion ), new_strength );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 64003L)
  public static SubLObject fi_rededuce_deduction_assertion(final SubLObject assertion, final SubLObject direction)
  {
    tms.tms_recompute_dependents( assertion );
    if( !direction.eql( assertions_high.assertion_direction( assertion ) ) )
    {
      tms.tms_change_direction( assertion, direction );
    }
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 64389L)
  public static SubLObject fi_deny(final SubLObject formula, final SubLObject mt, final SubLObject direction)
  {
    return fi( $kw149$DENY, formula, hlmt_czer.canonicalize_hlmt( mt ), direction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 64534L)
  public static SubLObject fi_deny_int(final SubLObject formula, SubLObject mt, SubLObject direction)
  {
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    reset_fi_error_state();
    if( NIL == el_utilities.el_formula_p( formula ) )
    {
      signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str107$Expected_a_cons__got__S, formula ) );
      return NIL;
    }
    mt = fi_convert_to_assert_hlmt( mt );
    if( NIL != fi_error_signaledP() )
    {
      return NIL;
    }
    if( NIL != direction && NIL == enumeration_types.direction_p( direction ) )
    {
      signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str115$Expected_a_direction__got__S, direction ) );
      return NIL;
    }
    fi_assert_int( formula, mt, $kw109$DEFAULT, $kw135$BACKWARD );
    SubLObject ans = NIL;
    SubLObject assertions = ke.find_assertions_via_tl( formula, mt );
    if( NIL == assertions )
    {
      assertions = czer_meta.find_assertions_cycl( formula, mt );
    }
    if( NIL != assertions )
    {
      SubLObject cdolist_list_var = assertions;
      SubLObject assertion = NIL;
      assertion = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == direction )
        {
          direction = fi_cnf_default_direction( assertions_high.assertion_cnf( assertion ) );
        }
        fi_assert_update_asserted_argument( assertion, $kw150$UNKNOWN, direction, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        assertion = cdolist_list_var.first();
      }
    }
    else
    {
      signal_fi_warning( ConsesLow.list( $kw147$ASSERTION_NOT_PRESENT, $str148$Formula__S_in_mt__S_is_not_in_the, formula, mt ) );
    }
    ans = makeBoolean( NIL == fi_error_signaledP() );
    if( NIL == fi_error_signaledP() )
    {
      forward.perform_forward_inference();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 65778L)
  public static SubLObject fi_unassert(final SubLObject formula, final SubLObject mt)
  {
    return fi( $kw151$UNASSERT, formula, hlmt_czer.canonicalize_hlmt( mt ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 66081L)
  public static SubLObject fi_unassert_int(final SubLObject sentence, SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    reset_fi_error_state();
    if( NIL == el_utilities.el_formula_p( sentence ) )
    {
      signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str107$Expected_a_cons__got__S, sentence ) );
      return NIL;
    }
    SubLObject ans = NIL;
    final SubLObject environment = forward.get_forward_inference_environment();
    assert NIL != queues.queue_p( environment ) : environment;
    final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding( thread );
    try
    {
      kb_control_vars.$forward_inference_environment$.bind( environment, thread );
      final SubLObject _prev_bind_0_$9 = $within_fi_operationP$.currentBinding( thread );
      try
      {
        $within_fi_operationP$.bind( T, thread );
        SubLObject canon_versions = NIL;
        SubLObject deduced_argumentP = NIL;
        thread.resetMultipleValues();
        final SubLObject canon_versions_$10 = canonicalize_fi_unassert_sentence( sentence, mt );
        final SubLObject mt_$11 = thread.secondMultipleValue();
        final SubLObject deduced_argumentP_$12 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        canon_versions = canon_versions_$10;
        mt = mt_$11;
        deduced_argumentP = deduced_argumentP_$12;
        final SubLObject canonical_mt = fi_convert_to_assert_hlmt( mt );
        if( NIL == fi_error_signaledP() )
        {
          final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( canonical_mt );
          final SubLObject _prev_bind_0_$10 = mt_relevance_macros.$mt$.currentBinding( thread );
          final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
            mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
            mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
            if( NIL == deduced_argumentP || NIL != canon_versions )
            {
              if( NIL == canon_versions )
              {
                signal_fi_error( fi_not_wff_error( sentence, mt ) );
              }
              else if( NIL != kb_utilities.kbeq( canon_versions, $const116$True ) )
              {
                signal_fi_error( ConsesLow.list( $kw117$TAUTOLOGY, $str154$Sentence______S___in__S_was_a_tau, sentence, mt ) );
              }
              else if( NIL != kb_utilities.kbeq( canon_versions, $const119$False ) )
              {
                signal_fi_error( ConsesLow.list( $kw120$CONTRADICTION, $str155$Sentence______S___in__S_was_a_con, sentence, mt ) );
              }
              else
              {
                SubLObject cdolist_list_var = canon_versions;
                SubLObject canon_version = NIL;
                canon_version = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  if( NIL == fi_error_signaledP() )
                  {
                    SubLObject current;
                    final SubLObject datum = current = canon_version;
                    SubLObject cnf = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list122 );
                    cnf = current.first();
                    current = current.rest();
                    final SubLObject variable_map = current.isCons() ? current.first() : NIL;
                    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list122 );
                    current = current.rest();
                    final SubLObject query_free_vars = current.isCons() ? current.first() : NIL;
                    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list122 );
                    current = current.rest();
                    if( NIL == current )
                    {
                      if( NIL == hl_storage_modules.hl_unassert( cnf, mt ) )
                      {
                        signal_fi_warning( ConsesLow.list( $kw147$ASSERTION_NOT_PRESENT, $str156$Sentence__S_in_mt__S_is_not_in_th, sentence, mt ) );
                      }
                    }
                    else
                    {
                      cdestructuring_bind.cdestructuring_bind_error( datum, $list122 );
                    }
                  }
                  cdolist_list_var = cdolist_list_var.rest();
                  canon_version = cdolist_list_var.first();
                }
              }
            }
          }
          finally
          {
            mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
            mt_relevance_macros.$mt$.rebind( _prev_bind_0_$10, thread );
          }
        }
        ans = makeBoolean( NIL == fi_error_signaledP() );
      }
      finally
      {
        $within_fi_operationP$.rebind( _prev_bind_0_$9, thread );
      }
      if( NIL != ans )
      {
        forward.perform_forward_inference();
      }
    }
    finally
    {
      kb_control_vars.$forward_inference_environment$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 67986L)
  public static SubLObject canonicalize_fi_unassert_sentence(final SubLObject sentence, final SubLObject mt)
  {
    return canonicalize_fi_remove_sentence( sentence, mt, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 68131L)
  public static SubLObject canonicalize_fi_blast_sentence(final SubLObject sentence, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject canon_versions = canonicalize_fi_remove_sentence( sentence, mt, NIL );
    final SubLObject mt_$14 = thread.secondMultipleValue();
    final SubLObject deduced_argumentP = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    return Values.values( canon_versions, mt_$14 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 68381L)
  public static SubLObject canonicalize_fi_remove_sentence(final SubLObject sentence, SubLObject mt, final SubLObject check_for_asserted_argumentP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject el_sentence = canon_tl.transform_tl_terms_to_hl( sentence );
    thread.resetMultipleValues();
    final SubLObject el_sentence_$15 = czer_utilities.unwrap_if_ist( el_sentence, mt, UNPROVIDED );
    final SubLObject mt_$16 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    el_sentence = el_sentence_$15;
    mt = mt_$16;
    mt = canonicalize_unassert_hlmt( mt );
    SubLObject canon_versions = NIL;
    SubLObject deduced_argumentP = NIL;
    SubLObject assertions = ke.find_assertions_via_tl( sentence, mt );
    if( NIL == assertions && NIL != hlmt.hlmt_p( mt ) )
    {
      assertions = czer_meta.find_assertions_cycl( el_sentence, mt );
    }
    if( NIL != assertions )
    {
      SubLObject cdolist_list_var = assertions;
      SubLObject assertion = NIL;
      assertion = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != check_for_asserted_argumentP && NIL == assertions_high.get_asserted_argument( assertion ) )
        {
          signal_fi_warning( ConsesLow.list( $kw157$ASSERTION_NOT_LOCAL, $str158$Sentence__S_in_mt__S_is_not_local, el_sentence, mt ) );
          deduced_argumentP = T;
        }
        else
        {
          final SubLObject cnf = assertions_high.assertion_cnf( assertion );
          final SubLObject variable_map = NIL;
          final SubLObject query_free_vars = NIL;
          final SubLObject canon_version = ConsesLow.list( cnf, variable_map, query_free_vars );
          final SubLObject ass_mt = assertions_high.assertion_mt( assertion );
          canon_versions = ConsesLow.cons( canon_version, canon_versions );
          mt = ass_mt;
        }
        cdolist_list_var = cdolist_list_var.rest();
        assertion = cdolist_list_var.first();
      }
    }
    else if( NIL != hlmt.hlmt_p( mt ) )
    {
      thread.resetMultipleValues();
      final SubLObject canon_versions_$17 = czer_main.canonicalize_unassert_sentence( el_sentence, mt );
      final SubLObject mt_$17 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      canon_versions = canon_versions_$17;
      mt = mt_$17;
    }
    return Values.values( canon_versions, mt, deduced_argumentP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 69912L)
  public static SubLObject canonicalize_unassert_hlmt(SubLObject mt)
  {
    mt = canon_tl.tlmt_to_hlmt( mt );
    mt = narts_high.nart_substitute( mt );
    return mt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 70295L)
  public static SubLObject fi_edit(final SubLObject old_formula, final SubLObject new_formula, SubLObject old_mt, SubLObject new_mt, SubLObject strength, SubLObject direction)
  {
    if( old_mt == UNPROVIDED )
    {
      old_mt = NIL;
    }
    if( new_mt == UNPROVIDED )
    {
      new_mt = old_mt;
    }
    if( strength == UNPROVIDED )
    {
      strength = $kw109$DEFAULT;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    return fi( $kw159$EDIT, old_formula, new_formula, hlmt_czer.canonicalize_hlmt( old_mt ), hlmt_czer.canonicalize_hlmt( new_mt ), strength, direction, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 70945L)
  public static SubLObject fi_edit_int(final SubLObject old_formula, final SubLObject new_formula, SubLObject old_mt, SubLObject new_mt, SubLObject strength, SubLObject direction)
  {
    if( old_mt == UNPROVIDED )
    {
      old_mt = NIL;
    }
    if( new_mt == UNPROVIDED )
    {
      new_mt = old_mt;
    }
    if( strength == UNPROVIDED )
    {
      strength = $kw109$DEFAULT;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    fi_edit.new_fi_edit_int( old_formula, new_formula, old_mt, new_mt, strength, direction );
    return makeBoolean( NIL == fi_error_signaledP() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 71169L)
  public static SubLObject fi_justify(final SubLObject formula, final SubLObject mt, SubLObject fullP)
  {
    if( fullP == UNPROVIDED )
    {
      fullP = NIL;
    }
    return fi( $kw163$JUSTIFY, formula, hlmt_czer.canonicalize_hlmt( mt ), fullP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 71585L)
  public static SubLObject fi_justify_int(final SubLObject formula, SubLObject mt, SubLObject fullP)
  {
    if( fullP == UNPROVIDED )
    {
      fullP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    reset_fi_error_state();
    if( NIL == el_utilities.el_formula_p( formula ) )
    {
      signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str107$Expected_a_cons__got__S, formula ) );
      return NIL;
    }
    mt = fi_convert_to_assert_hlmt( mt );
    if( NIL != fi_error_signaledP() )
    {
      return NIL;
    }
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = $within_fi_operationP$.currentBinding( thread );
    try
    {
      $within_fi_operationP$.bind( T, thread );
      ans = formula_justify( formula, mt, fullP );
    }
    finally
    {
      $within_fi_operationP$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 72077L)
  public static SubLObject formula_justify(final SubLObject formula, SubLObject mt, SubLObject fullP)
  {
    if( fullP == UNPROVIDED )
    {
      fullP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject canon_versions = NIL;
    thread.resetMultipleValues();
    final SubLObject canon_versions_$19 = czer_main.canonicalize_query_sentence( formula, mt );
    final SubLObject mt_$20 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    canon_versions = canon_versions_$19;
    mt = mt_$20;
    if( NIL == canon_versions )
    {
      signal_fi_error( fi_not_wff_error( formula, mt ) );
      return NIL;
    }
    if( NIL != kb_utilities.kbeq( canon_versions, $const116$True ) )
    {
      signal_fi_warning( ConsesLow.list( $kw117$TAUTOLOGY, $str118$Formula______S___in__S_was_a_taut, formula, mt ) );
    }
    else if( NIL != kb_utilities.kbeq( canon_versions, $const119$False ) )
    {
      signal_fi_warning( ConsesLow.list( $kw120$CONTRADICTION, $str121$Formula______S___in__S_was_a_cont, formula, mt ) );
    }
    else
    {
      SubLObject cdolist_list_var = canon_versions;
      SubLObject canon_version = NIL;
      canon_version = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject dnf = canon_version.first();
        final SubLObject neg_lits = clauses.neg_lits( dnf );
        final SubLObject pos_lits = clauses.pos_lits( dnf );
        SubLObject cdolist_list_var_$21 = neg_lits;
        SubLObject neg_lit = NIL;
        neg_lit = cdolist_list_var_$21.first();
        while ( NIL != cdolist_list_var_$21)
        {
          neg_lit = cycl_utilities.negate( neg_lit );
          final SubLObject justs = gaf_justify( neg_lit, mt, fullP );
          if( NIL == justs )
          {
            signal_fi_warning( ConsesLow.list( $kw147$ASSERTION_NOT_PRESENT, $str148$Formula__S_in_mt__S_is_not_in_the, neg_lit, mt ) );
            return NIL;
          }
          SubLObject cdolist_list_var_$22 = justs;
          SubLObject just = NIL;
          just = cdolist_list_var_$22.first();
          while ( NIL != cdolist_list_var_$22)
          {
            final SubLObject item_var = just;
            if( NIL == conses_high.member( item_var, result, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              result = ConsesLow.cons( item_var, result );
            }
            cdolist_list_var_$22 = cdolist_list_var_$22.rest();
            just = cdolist_list_var_$22.first();
          }
          cdolist_list_var_$21 = cdolist_list_var_$21.rest();
          neg_lit = cdolist_list_var_$21.first();
        }
        SubLObject cdolist_list_var_$23 = pos_lits;
        SubLObject pos_lit = NIL;
        pos_lit = cdolist_list_var_$23.first();
        while ( NIL != cdolist_list_var_$23)
        {
          final SubLObject justs = gaf_justify( pos_lit, mt, fullP );
          if( NIL == justs )
          {
            signal_fi_warning( ConsesLow.list( $kw147$ASSERTION_NOT_PRESENT, $str148$Formula__S_in_mt__S_is_not_in_the, pos_lit, mt ) );
            return NIL;
          }
          SubLObject cdolist_list_var_$24 = justs;
          SubLObject just = NIL;
          just = cdolist_list_var_$24.first();
          while ( NIL != cdolist_list_var_$24)
          {
            final SubLObject item_var = just;
            if( NIL == conses_high.member( item_var, result, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              result = ConsesLow.cons( item_var, result );
            }
            cdolist_list_var_$24 = cdolist_list_var_$24.rest();
            just = cdolist_list_var_$24.first();
          }
          cdolist_list_var_$23 = cdolist_list_var_$23.rest();
          pos_lit = cdolist_list_var_$23.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        canon_version = cdolist_list_var.first();
      }
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 73794L)
  public static SubLObject gaf_justify(final SubLObject formula, final SubLObject mt, final SubLObject fullP)
  {
    final SubLObject justs = one_step_gaf_justify( formula, mt );
    if( NIL == justs )
    {
      return NIL;
    }
    if( Sequences.length( justs ).numE( ONE_INTEGER ) )
    {
      return justs;
    }
    if( NIL == fullP )
    {
      return justs;
    }
    SubLObject result = NIL;
    SubLObject cdolist_list_var = justs;
    SubLObject just = NIL;
    just = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = just;
      SubLObject hl_module = NIL;
      SubLObject just_formula = NIL;
      SubLObject just_mt = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list164 );
      hl_module = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list164 );
      just_formula = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list164 );
      just_mt = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( hl_module.eql( arguments.$assertion_support_module$.getGlobalValue() ) )
        {
          final SubLObject recursive_justs = gaf_justify( just_formula, just_mt, T );
          if( NIL == recursive_justs )
          {
            return NIL;
          }
          SubLObject cdolist_list_var_$25 = recursive_justs;
          SubLObject recursive_just = NIL;
          recursive_just = cdolist_list_var_$25.first();
          while ( NIL != cdolist_list_var_$25)
          {
            final SubLObject item_var = recursive_just;
            if( NIL == conses_high.member( item_var, result, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              result = ConsesLow.cons( item_var, result );
            }
            cdolist_list_var_$25 = cdolist_list_var_$25.rest();
            recursive_just = cdolist_list_var_$25.first();
          }
        }
        else
        {
          final SubLObject item_var2 = just;
          if( NIL == conses_high.member( item_var2, result, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            result = ConsesLow.cons( item_var2, result );
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list164 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      just = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 74464L)
  public static SubLObject one_step_gaf_justify(final SubLObject formula, SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    SubLObject canon_versions = NIL;
    thread.resetMultipleValues();
    final SubLObject canon_versions_$26 = czer_main.canonicalize_cycl_sentence( formula, mt );
    final SubLObject mt_$27 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    canon_versions = canon_versions_$26;
    mt = mt_$27;
    if( NIL == canon_versions )
    {
      signal_fi_error( fi_not_wff_error( formula, mt ) );
      return NIL;
    }
    if( canon_versions.isCons() )
    {
      SubLObject cdolist_list_var = canon_versions;
      SubLObject canon_version = NIL;
      canon_version = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == fi_error_signaledP() )
        {
          thread.resetMultipleValues();
          final SubLObject cnf = fi_canonicalize( canon_version, T, UNPROVIDED );
          final SubLObject v_variables = thread.secondMultipleValue();
          final SubLObject hl_tv = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          final SubLObject assertion = kb_indexing.find_assertion( cnf, mt );
          if( NIL == assertion )
          {
            signal_fi_warning( ConsesLow.list( $kw147$ASSERTION_NOT_PRESENT, $str148$Formula__S_in_mt__S_is_not_in_the, formula, mt ) );
          }
          else
          {
            final SubLObject matching_argument = Sequences.find( assertions_high.cyc_assertion_tv( assertion ), assertions_high.assertion_arguments( assertion ), Symbols.symbol_function( EQL ), Symbols.symbol_function(
                $sym165$ARGUMENT_TV ), UNPROVIDED, UNPROVIDED );
            if( NIL != matching_argument )
            {
              if( NIL != arguments.belief_p( matching_argument ) )
              {
                final SubLObject item_var = justify_support( assertion );
                if( NIL == conses_high.member( item_var, v_answer, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
                {
                  v_answer = ConsesLow.cons( item_var, v_answer );
                }
              }
              else
              {
                SubLObject cdolist_list_var_$28 = deductions_high.deduction_supports( matching_argument );
                SubLObject support = NIL;
                support = cdolist_list_var_$28.first();
                while ( NIL != cdolist_list_var_$28)
                {
                  final SubLObject item_var2 = justify_support( support );
                  if( NIL == conses_high.member( item_var2, v_answer, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
                  {
                    v_answer = ConsesLow.cons( item_var2, v_answer );
                  }
                  cdolist_list_var_$28 = cdolist_list_var_$28.rest();
                  support = cdolist_list_var_$28.first();
                }
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        canon_version = cdolist_list_var.first();
      }
    }
    return Sequences.nreverse( v_answer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 75618L)
  public static SubLObject justify_support(final SubLObject support)
  {
    return ConsesLow.list( arguments.support_module( support ), arguments.support_formula( support ), arguments.support_mt( support ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 75753L)
  public static SubLObject fi_add_argument(final SubLObject formula, final SubLObject mt, final SubLObject supports, SubLObject direction, SubLObject verify_supportsP)
  {
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    if( verify_supportsP == UNPROVIDED )
    {
      verify_supportsP = NIL;
    }
    return fi( $kw166$ADD_ARGUMENT, formula, hlmt_czer.canonicalize_hlmt( mt ), supports, direction, verify_supportsP, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 76287L)
  public static SubLObject fi_add_argument_int(SubLObject formula, SubLObject mt, SubLObject supports, SubLObject direction, SubLObject verify_supportsP)
  {
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    if( verify_supportsP == UNPROVIDED )
    {
      verify_supportsP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    reset_fi_error_state();
    if( NIL == el_utilities.el_formula_p( formula ) )
    {
      signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str107$Expected_a_cons__got__S, formula ) );
      return NIL;
    }
    if( !supports.isCons() )
    {
      signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str107$Expected_a_cons__got__S, supports ) );
      return NIL;
    }
    formula = canon_tl.transform_tl_terms_to_hl( formula );
    mt = canon_tl.transform_tl_terms_to_hl( mt );
    supports = canon_tl.transform_tl_terms_to_hl( supports );
    mt = fi_convert_to_assert_hlmt_if_wft( mt );
    if( NIL != fi_error_signaledP() )
    {
      return NIL;
    }
    SubLObject cdolist_list_var = supports;
    SubLObject support = NIL;
    support = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == arguments.support_p( support ) )
      {
        signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str167$Expected_a_support__got__S, support ) );
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      support = cdolist_list_var.first();
    }
    if( NIL != direction && NIL == conses_high.member( direction, $list168, UNPROVIDED, UNPROVIDED ) )
    {
      signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str169$Expected__forward_or__backward__g, direction ) );
      return NIL;
    }
    thread.resetMultipleValues();
    final SubLObject v_hl_supports = fi_canonicalize_el_supports( supports, verify_supportsP );
    final SubLObject error = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != error )
    {
      signal_fi_error( error );
      return NIL;
    }
    supports = v_hl_supports;
    SubLObject local_deductions_found_or_created = NIL;
    SubLObject ans = NIL;
    SubLObject canon_versions = NIL;
    thread.resetMultipleValues();
    final SubLObject canon_versions_$29 = ( NIL != $assume_assert_sentence_is_wfP$.getDynamicValue( thread ) ) ? czer_main.canonicalize_wf_assert_sentence( formula, mt )
        : czer_main.canonicalize_assert_sentence( formula, mt );
    final SubLObject mt_$30 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    canon_versions = canon_versions_$29;
    mt = mt_$30;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    final SubLObject _prev_bind_4 = $within_fi_operationP$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      $within_fi_operationP$.bind( T, thread );
      if( NIL == canon_versions )
      {
        signal_fi_error( fi_not_wff_assert_error( formula, mt ) );
      }
      else if( NIL != kb_utilities.kbeq( canon_versions, $const116$True ) )
      {
        signal_fi_error( ConsesLow.list( $kw117$TAUTOLOGY, $str118$Formula______S___in__S_was_a_taut, formula, mt ) );
      }
      else if( NIL != kb_utilities.kbeq( canon_versions, $const119$False ) )
      {
        signal_fi_error( ConsesLow.list( $kw120$CONTRADICTION, $str121$Formula______S___in__S_was_a_cont, formula, mt ) );
      }
      else
      {
        SubLObject cdolist_list_var2 = canon_versions;
        SubLObject canon_version = NIL;
        canon_version = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          if( NIL == fi_error_signaledP() )
          {
            SubLObject current;
            final SubLObject datum = current = canon_version;
            SubLObject cnf = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list122 );
            cnf = current.first();
            current = current.rest();
            final SubLObject variable_map = current.isCons() ? current.first() : NIL;
            cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list122 );
            current = current.rest();
            final SubLObject query_free_vars = current.isCons() ? current.first() : NIL;
            cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list122 );
            current = current.rest();
            if( NIL == current )
            {
              if( NIL == direction )
              {
                direction = fi_cnf_default_direction( cnf );
              }
              local_deductions_found_or_created = ConsesLow.cons( hl_storage_modules.hl_add_deduction( cnf, mt, supports, direction, variable_map, UNPROVIDED, UNPROVIDED ), local_deductions_found_or_created );
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum, $list122 );
            }
          }
          cdolist_list_var2 = cdolist_list_var2.rest();
          canon_version = cdolist_list_var2.first();
        }
      }
      ans = makeBoolean( NIL == fi_error_signaledP() );
    }
    finally
    {
      $within_fi_operationP$.rebind( _prev_bind_4, thread );
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    if( NIL == fi_error_signaledP() )
    {
      final SubLObject forward_deductions_found_or_created = forward.perform_forward_inference();
      perform_deduce_post_processing( local_deductions_found_or_created, forward_deductions_found_or_created );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 79346L)
  public static SubLObject perform_deduce_post_processing(final SubLObject local_deductions_found_or_created, final SubLObject forward_deductions_found_or_created)
  {
    return perform_assert_post_processing( Mapping.mapcar( $sym170$DEDUCTION_ASSERTION, local_deductions_found_or_created ), forward_deductions_found_or_created );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 79608L)
  public static SubLObject convert_hl_support_to_el_support(final SubLObject hl_support)
  {
    return convert_hl_support_to_fi_support( hl_support );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 79847L)
  public static SubLObject convert_hl_support_to_fi_support(final SubLObject hl_support)
  {
    if( NIL != assertion_handles.assertion_p( hl_support ) )
    {
      return hl_support;
    }
    final SubLObject module = arguments.support_module( hl_support );
    SubLObject formula = conses_high.copy_tree( arguments.support_formula( hl_support ) );
    final SubLObject mt = arguments.support_mt( hl_support );
    final SubLObject truth = arguments.support_truth( hl_support );
    final SubLObject strength = arguments.support_strength( hl_support );
    if( truth == $kw171$FALSE )
    {
      formula = cycl_utilities.negate( formula );
    }
    final SubLObject el_support = make_el_support( module, formula, mt, strength );
    return el_support;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 80409L)
  public static SubLObject convert_hl_support_to_tl_support(final SubLObject hl_support)
  {
    final SubLObject module = arguments.support_module( hl_support );
    SubLObject formula = arguments.support_formula( hl_support );
    final SubLObject mt = arguments.support_mt( hl_support );
    final SubLObject truth = arguments.support_truth( hl_support );
    final SubLObject strength = arguments.support_strength( hl_support );
    if( NIL != assertion_handles.assertion_p( hl_support ) )
    {
      formula = canon_tl.assertion_tl_formula( hl_support );
    }
    formula = conses_high.copy_tree( formula );
    if( truth == $kw171$FALSE )
    {
      formula = cycl_utilities.negate( formula );
    }
    final SubLObject el_support = make_el_support( module, formula, mt, strength );
    return el_support;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 81024L)
  public static SubLObject make_el_support(final SubLObject module, final SubLObject formula, SubLObject mt, SubLObject strength)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if( strength == UNPROVIDED )
    {
      strength = $kw109$DEFAULT;
    }
    return ConsesLow.list( module, formula, mt, strength );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 81179L)
  public static SubLObject fi_canonicalize_el_supports(final SubLObject el_supports, SubLObject verify_supportsP)
  {
    if( verify_supportsP == UNPROVIDED )
    {
      verify_supportsP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_hl_supports = NIL;
    SubLObject cdolist_list_var = el_supports;
    SubLObject el_support = NIL;
    el_support = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != assertion_handles.assertion_p( el_support ) )
      {
        v_hl_supports = ConsesLow.cons( el_support, v_hl_supports );
      }
      else
      {
        SubLObject current;
        final SubLObject datum = current = el_support;
        SubLObject hl_module = NIL;
        SubLObject formula = NIL;
        SubLObject mt = NIL;
        SubLObject strength = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list172 );
        hl_module = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list172 );
        formula = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list172 );
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list172 );
        strength = current.first();
        current = current.rest();
        if( NIL == current )
        {
          mt = fi_convert_to_assert_hlmt( mt );
          if( NIL != fi_error_signaledP() )
          {
            return Values.values( NIL, fi_get_error_int() );
          }
          if( hl_module.eql( arguments.$assertion_support_module$.getGlobalValue() ) )
          {
            thread.resetMultipleValues();
            final SubLObject assertions = el_support_assertions( formula, mt );
            final SubLObject all_thereP = thread.secondMultipleValue();
            final SubLObject malformedP = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if( NIL != malformedP )
            {
              return Values.values( NIL, ConsesLow.list( $kw173$SUPPORT_MALFORMED, $str174$Support__S_was_malformed, el_support ) );
            }
            if( NIL == all_thereP )
            {
              return Values.values( NIL, ConsesLow.list( $kw147$ASSERTION_NOT_PRESENT, $str148$Formula__S_in_mt__S_is_not_in_the, formula, mt ) );
            }
            if( NIL == assertions )
            {
              return Values.values( NIL, ConsesLow.list( $kw173$SUPPORT_MALFORMED, $str174$Support__S_was_malformed, el_support ) );
            }
            SubLObject cdolist_list_var_$31 = assertions;
            SubLObject assertion = NIL;
            assertion = cdolist_list_var_$31.first();
            while ( NIL != cdolist_list_var_$31)
            {
              if( NIL == assertion_handles.assertion_p( assertion ) )
              {
                return Values.values( NIL, ConsesLow.list( $kw173$SUPPORT_MALFORMED, $str174$Support__S_was_malformed, el_support ) );
              }
              v_hl_supports = ConsesLow.cons( assertion, v_hl_supports );
              cdolist_list_var_$31 = cdolist_list_var_$31.rest();
              assertion = cdolist_list_var_$31.first();
            }
          }
          else
          {
            final SubLObject tv = enumeration_types.tv_from_truth_strength( $kw175$TRUE, strength );
            final SubLObject hl_support = arguments.make_hl_support( hl_module, formula, mt, tv );
            if( NIL != verify_supportsP && NIL != tms.stale_support( hl_support ) )
            {
              return Values.values( NIL, ConsesLow.list( $kw176$SUPPORT_INVALID, $str177$Support__S_is_not_currently_valid, el_support ) );
            }
            v_hl_supports = ConsesLow.cons( hl_support, v_hl_supports );
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list172 );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      el_support = cdolist_list_var.first();
    }
    return Values.values( Sequences.nreverse( v_hl_supports ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 82848L)
  public static SubLObject el_support_assertions(final SubLObject sentence, final SubLObject mt)
  {
    final SubLObject assertions = ke.find_assertions_via_tl( sentence, mt );
    if( NIL != assertions )
    {
      return Values.values( assertions, T, NIL );
    }
    return sentence_assertions( sentence, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 83234L)
  public static SubLObject fi_remove_argument(final SubLObject sentence, final SubLObject mt, final SubLObject supports, SubLObject verify_supportsP)
  {
    if( verify_supportsP == UNPROVIDED )
    {
      verify_supportsP = NIL;
    }
    return fi( $kw178$REMOVE_ARGUMENT, sentence, hlmt_czer.canonicalize_hlmt( mt ), supports, verify_supportsP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 83477L)
  public static SubLObject fi_remove_argument_int(final SubLObject sentence, SubLObject mt, SubLObject supports, SubLObject verify_supportsP)
  {
    if( verify_supportsP == UNPROVIDED )
    {
      verify_supportsP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    reset_fi_error_state();
    if( NIL == el_utilities.el_formula_p( sentence ) )
    {
      signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str107$Expected_a_cons__got__S, sentence ) );
      return NIL;
    }
    mt = fi_convert_to_assert_hlmt( mt );
    if( NIL != fi_error_signaledP() )
    {
      return NIL;
    }
    if( !supports.isCons() )
    {
      signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str107$Expected_a_cons__got__S, supports ) );
      return NIL;
    }
    SubLObject cdolist_list_var = supports;
    SubLObject support = NIL;
    support = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == arguments.support_p( support ) )
      {
        signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str167$Expected_a_support__got__S, support ) );
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      support = cdolist_list_var.first();
    }
    thread.resetMultipleValues();
    final SubLObject v_hl_supports = fi_canonicalize_el_supports( supports, verify_supportsP );
    final SubLObject error = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != error )
    {
      signal_fi_error( error );
      return NIL;
    }
    supports = v_hl_supports;
    SubLObject ans = NIL;
    final SubLObject environment = forward.get_forward_inference_environment();
    assert NIL != queues.queue_p( environment ) : environment;
    final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding( thread );
    try
    {
      kb_control_vars.$forward_inference_environment$.bind( environment, thread );
      final SubLObject _prev_bind_0_$32 = $within_fi_operationP$.currentBinding( thread );
      try
      {
        $within_fi_operationP$.bind( T, thread );
        final SubLObject _prev_bind_0_$33 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym179$RELEVANT_MT_IS_GENL_MT, thread );
          mt_relevance_macros.$mt$.bind( mt, thread );
          SubLObject canon_versions = NIL;
          thread.resetMultipleValues();
          final SubLObject canon_versions_$34 = czer_main.canonicalize_unassert_sentence( sentence, mt );
          final SubLObject mt_$35 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          canon_versions = canon_versions_$34;
          mt = mt_$35;
          if( NIL == canon_versions )
          {
            signal_fi_error( fi_not_wff_error( sentence, mt ) );
          }
          else if( NIL != kb_utilities.kbeq( canon_versions, $const116$True ) )
          {
            signal_fi_error( ConsesLow.list( $kw117$TAUTOLOGY, $str154$Sentence______S___in__S_was_a_tau, sentence, mt ) );
          }
          else if( NIL != kb_utilities.kbeq( canon_versions, $const119$False ) )
          {
            signal_fi_error( ConsesLow.list( $kw120$CONTRADICTION, $str155$Sentence______S___in__S_was_a_con, sentence, mt ) );
          }
          else
          {
            SubLObject cdolist_list_var2 = canon_versions;
            SubLObject canon_version = NIL;
            canon_version = cdolist_list_var2.first();
            while ( NIL != cdolist_list_var2)
            {
              if( NIL == fi_error_signaledP() )
              {
                SubLObject current;
                final SubLObject datum = current = canon_version;
                SubLObject cnf = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list122 );
                cnf = current.first();
                current = current.rest();
                final SubLObject variable_map = current.isCons() ? current.first() : NIL;
                cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list122 );
                current = current.rest();
                final SubLObject query_free_vars = current.isCons() ? current.first() : NIL;
                cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list122 );
                current = current.rest();
                if( NIL == current )
                {
                  hl_storage_modules.hl_remove_deduction( cnf, mt, supports );
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum, $list122 );
                }
              }
              cdolist_list_var2 = cdolist_list_var2.rest();
              canon_version = cdolist_list_var2.first();
            }
          }
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$33, thread );
        }
        ans = makeBoolean( NIL == fi_error_signaledP() );
      }
      finally
      {
        $within_fi_operationP$.rebind( _prev_bind_0_$32, thread );
      }
      if( NIL == fi_error_signaledP() )
      {
        forward.perform_forward_inference();
      }
    }
    finally
    {
      kb_control_vars.$forward_inference_environment$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 85537L)
  public static SubLObject fi_blast(final SubLObject formula, final SubLObject mt)
  {
    return fi( $kw180$BLAST, formula, hlmt_czer.canonicalize_hlmt( mt ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 85949L)
  public static SubLObject fi_blast_int(final SubLObject formula, SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    reset_fi_error_state();
    if( NIL == el_utilities.el_formula_p( formula ) )
    {
      signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str107$Expected_a_cons__got__S, formula ) );
      return NIL;
    }
    SubLObject ans = NIL;
    final SubLObject environment = forward.get_forward_inference_environment();
    assert NIL != queues.queue_p( environment ) : environment;
    final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding( thread );
    try
    {
      kb_control_vars.$forward_inference_environment$.bind( environment, thread );
      final SubLObject _prev_bind_0_$36 = $within_fi_operationP$.currentBinding( thread );
      final SubLObject _prev_bind_2 = czer_vars.$simplify_literalP$.currentBinding( thread );
      try
      {
        $within_fi_operationP$.bind( T, thread );
        czer_vars.$simplify_literalP$.bind( NIL, thread );
        SubLObject canon_versions = NIL;
        thread.resetMultipleValues();
        final SubLObject canon_versions_$37 = canonicalize_fi_blast_sentence( formula, mt );
        final SubLObject mt_$38 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        canon_versions = canon_versions_$37;
        mt = mt_$38;
        final SubLObject canonical_mt = fi_convert_to_assert_hlmt( mt );
        if( NIL == fi_error_signaledP() )
        {
          final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( canonical_mt );
          final SubLObject _prev_bind_0_$37 = mt_relevance_macros.$mt$.currentBinding( thread );
          final SubLObject _prev_bind_1_$40 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
            mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
            mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
            if( NIL == canon_versions )
            {
              signal_fi_error( fi_not_wff_error( formula, mt ) );
            }
            else if( NIL != kb_utilities.kbeq( canon_versions, $const116$True ) )
            {
              signal_fi_error( ConsesLow.list( $kw117$TAUTOLOGY, $str118$Formula______S___in__S_was_a_taut, formula, mt ) );
            }
            else if( NIL != kb_utilities.kbeq( canon_versions, $const119$False ) )
            {
              signal_fi_error( ConsesLow.list( $kw120$CONTRADICTION, $str121$Formula______S___in__S_was_a_cont, formula, mt ) );
            }
            else
            {
              SubLObject cdolist_list_var = canon_versions;
              SubLObject canon_version = NIL;
              canon_version = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                if( NIL == fi_error_signaledP() )
                {
                  SubLObject current;
                  final SubLObject datum = current = canon_version;
                  SubLObject cnf = NIL;
                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list122 );
                  cnf = current.first();
                  current = current.rest();
                  final SubLObject variable_map = current.isCons() ? current.first() : NIL;
                  cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list122 );
                  current = current.rest();
                  final SubLObject query_free_vars = current.isCons() ? current.first() : NIL;
                  cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list122 );
                  current = current.rest();
                  if( NIL == current )
                  {
                    hl_storage_modules.hl_remove_all_arguments( cnf, mt );
                  }
                  else
                  {
                    cdestructuring_bind.cdestructuring_bind_error( datum, $list122 );
                  }
                }
                cdolist_list_var = cdolist_list_var.rest();
                canon_version = cdolist_list_var.first();
              }
            }
          }
          finally
          {
            mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$40, thread );
            mt_relevance_macros.$mt$.rebind( _prev_bind_0_$37, thread );
          }
        }
        ans = makeBoolean( NIL == fi_error_signaledP() );
      }
      finally
      {
        czer_vars.$simplify_literalP$.rebind( _prev_bind_2, thread );
        $within_fi_operationP$.rebind( _prev_bind_0_$36, thread );
      }
      if( NIL == fi_error_signaledP() )
      {
        forward.perform_forward_inference();
      }
    }
    finally
    {
      kb_control_vars.$forward_inference_environment$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 87432L)
  public static SubLObject fi_ask(final SubLObject formula, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( backchain == UNPROVIDED )
    {
      backchain = NIL;
    }
    if( number == UNPROVIDED )
    {
      number = NIL;
    }
    if( time == UNPROVIDED )
    {
      time = NIL;
    }
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    return fi( $kw183$ASK, formula, hlmt_czer.canonicalize_hlmt( mt ), backchain, number, time, depth, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 88549L)
  public static SubLObject fi_ask_int(final SubLObject formula, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( backchain == UNPROVIDED )
    {
      backchain = NIL;
    }
    if( number == UNPROVIDED )
    {
      number = NIL;
    }
    if( time == UNPROVIDED )
    {
      time = NIL;
    }
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    reset_fi_error_state();
    if( NIL == el_utilities.el_formula_p( formula ) && NIL == cycl_grammar.cycl_truth_value_p( formula ) )
    {
      signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str188$Expected_a_formula__got__S, formula ) );
      return NIL;
    }
    if( NIL != fi_ask_ist_query_p( formula ) )
    {
      SubLObject ist = NIL;
      SubLObject ist_mt = NIL;
      SubLObject ist_formula = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( formula, formula, $list189 );
      ist = formula.first();
      SubLObject current = formula.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, formula, $list189 );
      ist_mt = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, formula, $list189 );
      ist_formula = current.first();
      current = current.rest();
      if( NIL == current )
      {
        return fi_ask_int( ist_formula, ist_mt, backchain, number, time, depth );
      }
      cdestructuring_bind.cdestructuring_bind_error( formula, $list189 );
      return NIL;
    }
    else
    {
      if( NIL == mt )
      {
        mt = mt_vars.$default_ask_mt$.getGlobalValue();
      }
      mt = fi_convert_to_ask_hlmt( mt );
      if( NIL != fi_error_signaledP() )
      {
        return NIL;
      }
      if( NIL != backchain && backchain != T && !backchain.isInteger() )
      {
        signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str190$Expected_an_integer__got__S, backchain ) );
        return NIL;
      }
      if( NIL != number && !number.isInteger() )
      {
        signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str190$Expected_an_integer__got__S, number ) );
        return NIL;
      }
      if( NIL != time && !time.isInteger() )
      {
        signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str190$Expected_an_integer__got__S, time ) );
        return NIL;
      }
      if( NIL != depth && !depth.isInteger() )
      {
        signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str190$Expected_an_integer__got__S, depth ) );
        return NIL;
      }
      SubLObject v_answer = NIL;
      SubLObject reason = NIL;
      final SubLObject environment = forward.get_forward_inference_environment();
      assert NIL != queues.queue_p( environment ) : environment;
      final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding( thread );
      try
      {
        kb_control_vars.$forward_inference_environment$.bind( environment, thread );
        final SubLObject _prev_bind_0_$41 = $within_fi_operationP$.currentBinding( thread );
        try
        {
          $within_fi_operationP$.bind( T, thread );
          thread.resetMultipleValues();
          final SubLObject v_answer_$42 = fi_ask_int_new_cyc_query_trampoline( formula, mt, backchain, number, time, depth );
          final SubLObject reason_$43 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          v_answer = v_answer_$42;
          reason = reason_$43;
        }
        finally
        {
          $within_fi_operationP$.rebind( _prev_bind_0_$41, thread );
        }
        if( NIL == fi_error_signaledP() )
        {
          forward.perform_forward_inference();
        }
      }
      finally
      {
        kb_control_vars.$forward_inference_environment$.rebind( _prev_bind_0, thread );
      }
      return Values.values( v_answer, reason );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 90382L)
  public static SubLObject fi_ask_ist_query_p(final SubLObject formula)
  {
    return makeBoolean( NIL != el_utilities.el_formula_with_operator_p( formula, $const191$ist ) && Sequences.length( formula ).numE( THREE_INTEGER ) && NIL != forts.fort_p( conses_high.second( formula ) ) && conses_high
        .third( formula ).isCons() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 90644L)
  public static SubLObject fi_ask_int_new_cyc_query_trampoline(final SubLObject sentence, final SubLObject mt, final SubLObject backchain, final SubLObject number, final SubLObject time, final SubLObject depth)
  {
    final SubLObject query_properties = ask_utilities.query_properties_from_legacy_ask_parameters( backchain, number, time, depth );
    return inference_kernel.new_cyc_query( sentence, mt, query_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 90899L)
  public static SubLObject fi_continue_last_ask(SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth, SubLObject reconsider_deep)
  {
    if( backchain == UNPROVIDED )
    {
      backchain = NIL;
    }
    if( number == UNPROVIDED )
    {
      number = NIL;
    }
    if( time == UNPROVIDED )
    {
      time = NIL;
    }
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    if( reconsider_deep == UNPROVIDED )
    {
      reconsider_deep = NIL;
    }
    return fi( $kw192$CONTINUE_LAST_ASK, backchain, number, time, depth, reconsider_deep, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 92111L)
  public static SubLObject fi_continue_last_ask_int(SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth, SubLObject reconsider_deep)
  {
    if( backchain == UNPROVIDED )
    {
      backchain = NIL;
    }
    if( number == UNPROVIDED )
    {
      number = NIL;
    }
    if( time == UNPROVIDED )
    {
      time = NIL;
    }
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    if( reconsider_deep == UNPROVIDED )
    {
      reconsider_deep = NIL;
    }
    Errors.error( $str198$fi_continue_last_ask_int_is_depre );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 92503L)
  public static SubLObject fi_ask_status()
  {
    Errors.error( $str199$fi_ask_status_is_deprecated__use_ );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 93175L)
  public static SubLObject fi_ask_status_int()
  {
    Errors.error( $str204$fi_ask_status_int_is_deprecated__ );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 93381L)
  public static SubLObject fi_tms_reconsider_formula(final SubLObject formula, final SubLObject mt)
  {
    return fi( $kw205$TMS_RECONSIDER_FORMULA, formula, hlmt_czer.canonicalize_hlmt( mt ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 93785L)
  public static SubLObject fi_tms_reconsider_formula_int(final SubLObject formula, SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    reset_fi_error_state();
    if( NIL == el_utilities.el_formula_p( formula ) )
    {
      signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str107$Expected_a_cons__got__S, formula ) );
      return NIL;
    }
    mt = fi_convert_to_assert_hlmt( mt );
    if( NIL != fi_error_signaledP() )
    {
      return NIL;
    }
    SubLObject ans = NIL;
    final SubLObject environment = forward.get_forward_inference_environment();
    assert NIL != queues.queue_p( environment ) : environment;
    final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding( thread );
    try
    {
      kb_control_vars.$forward_inference_environment$.bind( environment, thread );
      final SubLObject _prev_bind_0_$44 = $within_fi_operationP$.currentBinding( thread );
      try
      {
        $within_fi_operationP$.bind( T, thread );
        final SubLObject assertions = ke.find_assertions_via_tl( formula, mt );
        if( NIL != assertions )
        {
          SubLObject cdolist_list_var = assertions;
          SubLObject assertion = NIL;
          assertion = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            tms.tms_reconsider_assertion( assertion );
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
          }
        }
        else
        {
          SubLObject canon_versions = NIL;
          thread.resetMultipleValues();
          final SubLObject canon_versions_$45 = czer_main.canonicalize_cycl_sentence( formula, mt );
          final SubLObject mt_$46 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          canon_versions = canon_versions_$45;
          mt = mt_$46;
          if( NIL == canon_versions )
          {
            signal_fi_error( fi_not_wff_error( formula, mt ) );
          }
          else if( NIL == cycl_grammar.cycl_truth_value_p( canon_versions ) )
          {
            SubLObject cdolist_list_var2 = canon_versions;
            SubLObject canon_version = NIL;
            canon_version = cdolist_list_var2.first();
            while ( NIL != cdolist_list_var2)
            {
              thread.resetMultipleValues();
              final SubLObject cnf = fi_canonicalize( canon_version, T, UNPROVIDED );
              final SubLObject v_variables = thread.secondMultipleValue();
              final SubLObject hl_tv = thread.thirdMultipleValue();
              thread.resetMultipleValues();
              final SubLObject assertion2 = kb_indexing.find_assertion( cnf, mt );
              if( NIL == assertion2 )
              {
                signal_fi_warning( ConsesLow.list( $kw147$ASSERTION_NOT_PRESENT, $str148$Formula__S_in_mt__S_is_not_in_the, formula, mt ) );
              }
              else
              {
                tms.tms_reconsider_assertion( assertion2 );
              }
              cdolist_list_var2 = cdolist_list_var2.rest();
              canon_version = cdolist_list_var2.first();
            }
          }
        }
        ans = makeBoolean( NIL == fi_error_signaledP() );
      }
      finally
      {
        $within_fi_operationP$.rebind( _prev_bind_0_$44, thread );
      }
      if( NIL == fi_error_signaledP() )
      {
        forward.perform_forward_inference();
      }
    }
    finally
    {
      kb_control_vars.$forward_inference_environment$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 95215L)
  public static SubLObject fi_tms_reconsider_mt(final SubLObject mt)
  {
    return fi( $kw208$TMS_RECONSIDER_MT, hlmt_czer.canonicalize_hlmt( mt ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 95535L)
  public static SubLObject fi_tms_reconsider_mt_int(SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    reset_fi_error_state();
    mt = fi_convert_to_assert_hlmt( mt );
    if( NIL != fi_error_signaledP() )
    {
      return NIL;
    }
    SubLObject ans = NIL;
    final SubLObject environment = forward.get_forward_inference_environment();
    assert NIL != queues.queue_p( environment ) : environment;
    final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding( thread );
    try
    {
      kb_control_vars.$forward_inference_environment$.bind( environment, thread );
      final SubLObject _prev_bind_0_$47 = $within_fi_operationP$.currentBinding( thread );
      try
      {
        $within_fi_operationP$.bind( T, thread );
        tms.tms_reconsider_mt( mt );
        ans = makeBoolean( NIL == fi_error_signaledP() );
      }
      finally
      {
        $within_fi_operationP$.rebind( _prev_bind_0_$47, thread );
      }
      if( NIL == fi_error_signaledP() )
      {
        forward.perform_forward_inference();
      }
    }
    finally
    {
      kb_control_vars.$forward_inference_environment$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 95993L)
  public static SubLObject fi_tms_reconsider_gafs(final SubLObject v_term, SubLObject arg, SubLObject predicate, SubLObject mt)
  {
    if( arg == UNPROVIDED )
    {
      arg = NIL;
    }
    if( predicate == UNPROVIDED )
    {
      predicate = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return fi( $kw212$TMS_RECONSIDER_GAFS, v_term, arg, predicate, hlmt_czer.canonicalize_hlmt( mt ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 96653L)
  public static SubLObject fi_tms_reconsider_gafs_int(SubLObject v_term, SubLObject arg, SubLObject predicate, SubLObject mt)
  {
    if( arg == UNPROVIDED )
    {
      arg = NIL;
    }
    if( predicate == UNPROVIDED )
    {
      predicate = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    reset_fi_error_state();
    v_term = fi_convert_to_fort( v_term );
    if( NIL != fi_error_signaledP() )
    {
      return NIL;
    }
    if( NIL != arg && ( !arg.isFixnum() || NIL == enumeration_types.term_arg_p( arg ) ) )
    {
      signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str216$Expected_an_integer_0_5__got__S, arg ) );
      return NIL;
    }
    if( NIL != predicate )
    {
      predicate = fi_convert_to_fort( predicate );
      if( NIL != fi_error_signaledP() )
      {
        return NIL;
      }
    }
    if( NIL != mt )
    {
      mt = fi_convert_to_assert_hlmt( mt );
      if( NIL != fi_error_signaledP() )
      {
        return NIL;
      }
    }
    SubLObject ans = NIL;
    final SubLObject environment = forward.get_forward_inference_environment();
    assert NIL != queues.queue_p( environment ) : environment;
    final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding( thread );
    try
    {
      kb_control_vars.$forward_inference_environment$.bind( environment, thread );
      final SubLObject _prev_bind_0_$48 = $within_fi_operationP$.currentBinding( thread );
      try
      {
        $within_fi_operationP$.bind( T, thread );
        if( NIL == arg )
        {
          tms.tms_reconsider_term_gafs( v_term, mt );
        }
        else if( arg.isZero() )
        {
          tms.tms_reconsider_predicate_extent( v_term, mt );
        }
        else
        {
          tms.tms_reconsider_gaf_args( v_term, arg, predicate, mt );
        }
        ans = makeBoolean( NIL == fi_error_signaledP() );
      }
      finally
      {
        $within_fi_operationP$.rebind( _prev_bind_0_$48, thread );
      }
      if( NIL == fi_error_signaledP() )
      {
        forward.perform_forward_inference();
      }
    }
    finally
    {
      kb_control_vars.$forward_inference_environment$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 97685L)
  public static SubLObject fi_tms_reconsider_term(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return fi( $kw217$TMS_RECONSIDER_TERM, v_term, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 98081L)
  public static SubLObject fi_tms_reconsider_term_int(SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    reset_fi_error_state();
    v_term = fi_convert_to_fort( v_term );
    if( NIL != fi_error_signaledP() )
    {
      return NIL;
    }
    if( NIL != mt )
    {
      mt = fi_convert_to_assert_hlmt( mt );
      if( NIL != fi_error_signaledP() )
      {
        return NIL;
      }
    }
    SubLObject ans = NIL;
    final SubLObject environment = forward.get_forward_inference_environment();
    assert NIL != queues.queue_p( environment ) : environment;
    final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding( thread );
    try
    {
      kb_control_vars.$forward_inference_environment$.bind( environment, thread );
      final SubLObject _prev_bind_0_$49 = $within_fi_operationP$.currentBinding( thread );
      try
      {
        $within_fi_operationP$.bind( T, thread );
        tms.tms_reconsider_term( v_term, mt );
        ans = makeBoolean( NIL == fi_error_signaledP() );
      }
      finally
      {
        $within_fi_operationP$.rebind( _prev_bind_0_$49, thread );
      }
      if( NIL == fi_error_signaledP() )
      {
        forward.perform_forward_inference();
      }
    }
    finally
    {
      kb_control_vars.$forward_inference_environment$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 98672L)
  public static SubLObject fi_denotation(final SubLObject string)
  {
    return fi( $kw221$DENOTATION, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 98803L)
  public static SubLObject fi_denotation_int(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    reset_fi_error_state();
    if( !string.isString() )
    {
      signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str33$Expected_a_string__got__S, string ) );
      return NIL;
    }
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = $within_fi_operationP$.currentBinding( thread );
    try
    {
      $within_fi_operationP$.bind( T, thread );
      ans = lexicon_accessors.denots_of_string( string, $list222, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      $within_fi_operationP$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 99165L)
  public static SubLObject fi_timestamp_constant(final SubLObject cyclist, final SubLObject time, SubLObject why, SubLObject second)
  {
    if( why == UNPROVIDED )
    {
      why = NIL;
    }
    if( second == UNPROVIDED )
    {
      second = NIL;
    }
    return fi( $kw223$TIMESTAMP_CONSTANT, cyclist, time, why, second, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 99415L)
  public static SubLObject fi_timestamp_constant_int(SubLObject cyclist, final SubLObject time, SubLObject why, SubLObject second)
  {
    if( why == UNPROVIDED )
    {
      why = NIL;
    }
    if( second == UNPROVIDED )
    {
      second = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    cyclist = canon_tl.transform_tl_terms_to_hl( cyclist );
    if( NIL != why )
    {
      why = canon_tl.transform_tl_terms_to_hl( why );
    }
    reset_fi_error_state();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = $within_fi_operationP$.currentBinding( thread );
    try
    {
      $within_fi_operationP$.bind( T, thread );
      if( NIL == forts.fort_p( cyclist ) )
      {
        signal_fi_warning( $list224 );
      }
      else if( !time.isInteger() )
      {
        signal_fi_warning( $list225 );
      }
      else if( NIL != why && NIL == constant_handles.constant_p( why ) )
      {
        signal_fi_warning( $list226 );
      }
      else if( NIL != second && NIL == numeric_date_utilities.universal_second_p( second ) )
      {
        signal_fi_warning( $list227 );
      }
      else if( NIL == constant_handles.constant_p( $fi_last_constant$.getDynamicValue( thread ) ) )
      {
        signal_fi_warning( $list228 );
      }
      else if( NIL != constant_timestampedP( $fi_last_constant$.getDynamicValue( thread ) ) )
      {
        signal_fi_warning( $list229 );
      }
      else
      {
        timestamp_constant( $fi_last_constant$.getDynamicValue( thread ), cyclist, time, why, second );
      }
      ans = makeBoolean( NIL == fi_error_signaledP() );
      $fi_last_constant$.setDynamicValue( NIL, thread );
      set_fi_last_assertions_asserted( NIL );
    }
    finally
    {
      $within_fi_operationP$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 100613L)
  public static SubLObject constant_timestampedP(final SubLObject constant)
  {
    assert NIL != constant_handles.constant_p( constant ) : constant;
    return makeBoolean( NIL != kb_mapping_utilities.fpred_value_in_any_mt( constant, $const231$myCreator, UNPROVIDED, UNPROVIDED, UNPROVIDED ) || NIL != kb_mapping_utilities.fpred_value_in_any_mt( constant,
        $const232$myCreationTime, UNPROVIDED, UNPROVIDED, UNPROVIDED ) || NIL != kb_mapping_utilities.fpred_value_in_any_mt( constant, $const233$myCreationPurpose, UNPROVIDED, UNPROVIDED, UNPROVIDED )
        || NIL != kb_mapping_utilities.fpred_value_in_any_mt( constant, $const234$myCreationSecond, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 100964L)
  public static SubLObject timestamp_constant(final SubLObject constant, final SubLObject cyclist, final SubLObject time, SubLObject why, SubLObject second)
  {
    if( why == UNPROVIDED )
    {
      why = NIL;
    }
    if( second == UNPROVIDED )
    {
      second = NIL;
    }
    final SubLObject v_properties = ConsesLow.list( $kw235$STRENGTH, $kw58$MONOTONIC, $kw236$DIRECTION, $kw135$BACKWARD );
    cyc_kernel.cyc_assert_wff( ConsesLow.list( $const231$myCreator, constant, cyclist ), $const237$BookkeepingMt, v_properties );
    cyc_kernel.cyc_assert_wff( ConsesLow.list( $const232$myCreationTime, constant, time ), $const237$BookkeepingMt, v_properties );
    if( NIL != constant_handles.constant_p( why ) )
    {
      cyc_kernel.cyc_assert_wff( ConsesLow.list( $const233$myCreationPurpose, constant, why ), $const237$BookkeepingMt, v_properties );
    }
    if( NIL != numeric_date_utilities.universal_second_p( second ) )
    {
      cyc_kernel.cyc_assert_wff( ConsesLow.list( $const234$myCreationSecond, constant, second ), $const237$BookkeepingMt, v_properties );
    }
    return constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 101549L)
  public static SubLObject untimestamp_constant(final SubLObject constant)
  {
    final SubLObject cyclist = kb_mapping_utilities.fpred_value_in_mt( constant, $const231$myCreator, $const237$BookkeepingMt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != cyclist )
    {
      fi_unassert_int( ConsesLow.list( $const231$myCreator, constant, cyclist ), $const237$BookkeepingMt );
    }
    final SubLObject time = kb_mapping_utilities.fpred_value_in_mt( constant, $const232$myCreationTime, $const237$BookkeepingMt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != time )
    {
      fi_unassert_int( ConsesLow.list( $const232$myCreationTime, constant, time ), $const237$BookkeepingMt );
    }
    final SubLObject why = kb_mapping_utilities.fpred_value_in_mt( constant, $const233$myCreationPurpose, $const237$BookkeepingMt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != why )
    {
      fi_unassert_int( ConsesLow.list( $const233$myCreationPurpose, constant, why ), $const237$BookkeepingMt );
    }
    final SubLObject second = kb_mapping_utilities.fpred_value_in_mt( constant, $const234$myCreationSecond, $const237$BookkeepingMt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != second )
    {
      fi_unassert_int( ConsesLow.list( $const234$myCreationSecond, constant, second ), $const237$BookkeepingMt );
    }
    return constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 102312L)
  public static SubLObject retimestamp_constant(final SubLObject constant, final SubLObject cyclist, final SubLObject time, SubLObject why, SubLObject second)
  {
    if( why == UNPROVIDED )
    {
      why = NIL;
    }
    if( second == UNPROVIDED )
    {
      second = NIL;
    }
    if( NIL != forts.fort_p( cyclist ) && time.isInteger() && ( NIL == why || NIL != constant_handles.constant_p( why ) ) && ( NIL == second || NIL != numeric_date_utilities.universal_second_p( second ) ) )
    {
      untimestamp_constant( constant );
      timestamp_constant( constant, cyclist, time, why, second );
    }
    return constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 102742L)
  public static SubLObject fi_timestamp_assertion(final SubLObject cyclist, final SubLObject time, SubLObject why, SubLObject second)
  {
    if( why == UNPROVIDED )
    {
      why = NIL;
    }
    if( second == UNPROVIDED )
    {
      second = NIL;
    }
    return fi( $kw238$TIMESTAMP_ASSERTION, cyclist, time, why, second, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 102948L)
  public static SubLObject fi_timestamp_assertion_int(SubLObject cyclist, final SubLObject time, SubLObject why, SubLObject second)
  {
    if( why == UNPROVIDED )
    {
      why = NIL;
    }
    if( second == UNPROVIDED )
    {
      second = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    cyclist = canon_tl.transform_tl_terms_to_hl( cyclist );
    if( NIL != why )
    {
      why = canon_tl.transform_tl_terms_to_hl( why );
    }
    reset_fi_error_state();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = $within_fi_operationP$.currentBinding( thread );
    try
    {
      $within_fi_operationP$.bind( T, thread );
      if( NIL == forts.fort_p( cyclist ) )
      {
        signal_fi_warning( $list224 );
      }
      else if( !time.isInteger() )
      {
        signal_fi_warning( $list225 );
      }
      else if( NIL != why && NIL == constant_handles.constant_p( why ) )
      {
        signal_fi_warning( $list226 );
      }
      else if( NIL != second && NIL == numeric_date_utilities.universal_second_p( second ) )
      {
        signal_fi_warning( $list227 );
      }
      else if( !czer_vars.$fi_last_assertions_asserted$.getDynamicValue( thread ).isCons() )
      {
        signal_fi_warning( $list239 );
      }
      else
      {
        SubLObject cdolist_list_var;
        final SubLObject assertions = cdolist_list_var = czer_vars.$fi_last_assertions_asserted$.getDynamicValue( thread );
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != assertions_high.asserted_assertionP( assertion ) )
          {
            if( NIL != assertions_low.asserted_assertion_timestampedP( assertion ) )
            {
              signal_fi_warning( $list229 );
            }
            else
            {
              assertions_high.timestamp_asserted_assertion( assertion, cyclist, time, why, second );
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          assertion = cdolist_list_var.first();
        }
      }
      ans = makeBoolean( NIL == fi_error_signaledP() );
      set_fi_last_assertions_asserted( NIL );
    }
    finally
    {
      $within_fi_operationP$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 104267L)
  public static SubLObject fi_remove_timestamp(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return fi( $kw240$REMOVE_TIMESTAMP, sentence, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 104434L)
  public static SubLObject fi_remove_timestamp_int(final SubLObject formula, SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    reset_fi_error_state();
    if( NIL == el_utilities.el_formula_p( formula ) )
    {
      signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str107$Expected_a_cons__got__S, formula ) );
      return NIL;
    }
    mt = fi_convert_to_assert_hlmt( mt );
    if( NIL != fi_error_signaledP() )
    {
      return NIL;
    }
    SubLObject ans = NIL;
    final SubLObject environment = forward.get_forward_inference_environment();
    assert NIL != queues.queue_p( environment ) : environment;
    final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $within_fi_operationP$.currentBinding( thread );
    try
    {
      kb_control_vars.$forward_inference_environment$.bind( environment, thread );
      $within_fi_operationP$.bind( T, thread );
      final SubLObject assertions = ke.find_assertions_via_tl( formula, mt );
      if( NIL != assertions )
      {
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          assertions_high.remove_asserted_assertion_timestamp( assertion );
          cdolist_list_var = cdolist_list_var.rest();
          assertion = cdolist_list_var.first();
        }
      }
      else
      {
        SubLObject canon_versions = NIL;
        thread.resetMultipleValues();
        final SubLObject canon_versions_$50 = czer_main.canonicalize_cycl_sentence( formula, mt );
        final SubLObject mt_$51 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        canon_versions = canon_versions_$50;
        mt = mt_$51;
        if( NIL == canon_versions )
        {
          signal_fi_error( fi_not_wff_error( formula, mt ) );
        }
        else if( NIL == cycl_grammar.cycl_truth_value_p( canon_versions ) )
        {
          SubLObject cdolist_list_var2 = canon_versions;
          SubLObject canon_version = NIL;
          canon_version = cdolist_list_var2.first();
          while ( NIL != cdolist_list_var2)
          {
            thread.resetMultipleValues();
            final SubLObject cnf = fi_canonicalize( canon_version, T, UNPROVIDED );
            final SubLObject v_variables = thread.secondMultipleValue();
            final SubLObject hl_tv = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            final SubLObject assertion2 = kb_indexing.find_assertion( cnf, mt );
            if( NIL == assertion2 )
            {
              signal_fi_warning( ConsesLow.list( $kw147$ASSERTION_NOT_PRESENT, $str148$Formula__S_in_mt__S_is_not_in_the, formula, mt ) );
            }
            else
            {
              assertions_high.remove_asserted_assertion_timestamp( assertion2 );
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            canon_version = cdolist_list_var2.first();
          }
        }
      }
      ans = makeBoolean( NIL == fi_error_signaledP() );
    }
    finally
    {
      $within_fi_operationP$.rebind( _prev_bind_2, thread );
      kb_control_vars.$forward_inference_environment$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 105749L)
  public static SubLObject fi_rename_variables(final SubLObject sentence, final SubLObject rename_variable_alist, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return fi( $kw241$RENAME_VARIABLES, sentence, rename_variable_alist, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 106426L)
  public static SubLObject fi_rename_variables_int(SubLObject formula, final SubLObject rename_variable_alist, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    reset_fi_error_state();
    if( NIL == el_utilities.el_formula_p( formula ) )
    {
      signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str107$Expected_a_cons__got__S, formula ) );
      return NIL;
    }
    if( NIL != el_utilities.ist_sentence_p( formula, UNPROVIDED ) )
    {
      mt = el_utilities.designated_mt( formula );
      formula = el_utilities.designated_sentence( formula );
    }
    mt = fi_convert_to_assert_hlmt( mt );
    if( NIL != fi_error_signaledP() )
    {
      return NIL;
    }
    final SubLObject assertions = czer_meta.find_assertions_cycl( formula, mt );
    if( NIL != assertions )
    {
      SubLObject cdolist_list_var = assertions;
      SubLObject assertion = NIL;
      assertion = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != el_utilities.simple_variable_rename_impossibleP( assertion, rename_variable_alist ) )
        {
          signal_fi_error( $list242 );
          return NIL;
        }
        cdolist_list_var = cdolist_list_var.rest();
        assertion = cdolist_list_var.first();
      }
      cdolist_list_var = assertions;
      assertion = NIL;
      assertion = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        assertion_utilities.rename_assertion_variables( assertion, rename_variable_alist );
        cdolist_list_var = cdolist_list_var.rest();
        assertion = cdolist_list_var.first();
      }
    }
    else
    {
      signal_fi_warning( $list239 );
    }
    return makeBoolean( NIL == fi_error_signaledP() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 107416L)
  public static SubLObject fi_get_parameter(final SubLObject symbol)
  {
    return fi( $kw243$GET_PARAMETER, symbol, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 107548L)
  public static SubLObject fi_get_parameter_int(final SubLObject symbol)
  {
    reset_fi_error_state();
    if( !symbol.isSymbol() )
    {
      signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str244$Expected_a_symbol__got__S, symbol ) );
      return NIL;
    }
    if( NIL == Symbols.boundp( symbol ) )
    {
      signal_fi_error( ConsesLow.list( $kw245$UNBOUND, $str246$Parameter__S_is_not_bound, symbol ) );
      return NIL;
    }
    return Symbols.symbol_value( symbol );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 107910L)
  public static SubLObject fi_set_parameter(final SubLObject symbol, final SubLObject value)
  {
    return fi( $kw247$SET_PARAMETER, symbol, value, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 107994L)
  public static SubLObject fi_set_parameter_int(final SubLObject symbol, final SubLObject value)
  {
    reset_fi_error_state();
    if( !symbol.isSymbol() )
    {
      signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str244$Expected_a_symbol__got__S, symbol ) );
      return NIL;
    }
    Symbols.set( symbol, value );
    return makeBoolean( NIL == fi_error_signaledP() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 108284L)
  public static SubLObject fi_eval(final SubLObject form)
  {
    return fi( $kw248$EVAL, form, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 108531L)
  public static SubLObject fi_eval_int(final SubLObject form)
  {
    reset_fi_error_state();
    return Eval.eval( form );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 108605L)
  public static SubLObject fi_local_eval(final SubLObject form)
  {
    return fi( $kw249$LOCAL_EVAL, form, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 108762L)
  public static SubLObject fi_local_eval_int(final SubLObject form)
  {
    reset_fi_error_state();
    return Eval.eval( form );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 108842L)
  public static SubLObject ke_purpose()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return api_control_vars.$ke_purpose$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 108969L)
  public static SubLObject set_ke_purpose(final SubLObject purpose)
  {
    if( NIL != purpose && !assertionsDisabledSync && NIL == forts.fort_p( purpose ) )
    {
      throw new AssertionError( purpose );
    }
    api_control_vars.$ke_purpose$.setDynamicValue( purpose );
    return purpose;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 109314L)
  public static SubLObject the_date()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $the_date$.getDynamicValue( thread ).isInteger() )
    {
      return $the_date$.getDynamicValue( thread );
    }
    return numeric_date_utilities.get_universal_date( UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 109671L)
  public static SubLObject the_second()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $the_second$.getDynamicValue( thread ).isInteger() )
    {
      return $the_second$.getDynamicValue( thread );
    }
    return numeric_date_utilities.get_universal_second( UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 109853L)
  public static SubLObject fi_convert_to_assert_hlmt_if_wft(final SubLObject el_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $assume_assert_sentence_is_wfP$.getDynamicValue( thread ) && NIL != cycl_grammar.cycl_nat_p( el_term ) && NIL == wff.el_wftP( el_term, mt_vars.$mt_mt$.getGlobalValue(), UNPROVIDED ) )
    {
      signal_fi_error( ConsesLow.list( $kw250$HLMT_NOT_WELL_FORMED, $str251$Microtheory__S____was_not_well_fo, el_term, wff.explanation_of_why_not_wft( el_term, mt_vars.$mt_mt$.getGlobalValue(), UNPROVIDED ) ) );
      return NIL;
    }
    return fi_convert_to_assert_hlmt( el_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 110444L)
  public static SubLObject fi_convert_to_assert_hlmt(final SubLObject el_term)
  {
    final SubLObject v_hlmt = czer_main.canonicalize_assert_mt( el_term );
    if( NIL == hlmt.hlmt_p( v_hlmt ) )
    {
      signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str252$Expected_a_microtheory__got__S, el_term ) );
      return NIL;
    }
    return v_hlmt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 110722L)
  public static SubLObject fi_convert_to_ask_hlmt(final SubLObject el_term)
  {
    final SubLObject v_hlmt = czer_main.canonicalize_ask_mt( el_term );
    if( NIL == hlmt.hlmt_p( v_hlmt ) )
    {
      signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str252$Expected_a_microtheory__got__S, el_term ) );
      return NIL;
    }
    return v_hlmt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 111025L)
  public static SubLObject fi_convert_to_fort(final SubLObject el_term)
  {
    final SubLObject fort = fi_canonicalize_el_term( el_term );
    if( NIL == forts.fort_p( fort ) )
    {
      signal_fi_error( ConsesLow.list( $kw32$ARG_ERROR, $str253$Expected_a_term__got__S, el_term ) );
      return NIL;
    }
    return fort;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 111258L)
  public static SubLObject fi_canonicalize_el_term(SubLObject el_term)
  {
    el_term = canon_tl.transform_tl_terms_to_hl( el_term );
    if( NIL != hlmt.fort_or_chlmt_p( el_term ) )
    {
      return el_term;
    }
    if( NIL != el_utilities.possibly_naut_p( el_term ) )
    {
      return narts_high.find_nart( el_term );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 111504L)
  public static SubLObject fi_canonicalize(final SubLObject canon_info, SubLObject canon_gaf, SubLObject strength)
  {
    if( canon_gaf == UNPROVIDED )
    {
      canon_gaf = NIL;
    }
    if( strength == UNPROVIDED )
    {
      strength = $kw109$DEFAULT;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject cnf = canon_info.first();
    final SubLObject v_variables = Mapping.mapcar( Symbols.symbol_function( $sym254$CAR ), conses_high.second( canon_info ) );
    SubLObject hl_tv = NIL;
    if( NIL != control_vars.$within_assert$.getDynamicValue( thread ) && !assertionsDisabledSync && NIL == kb_var_listP( Mapping.mapcar( Symbols.symbol_function( $sym255$CDR ), conses_high.second( canon_info ) ) ) )
    {
      throw new AssertionError( Mapping.mapcar( Symbols.symbol_function( $sym255$CDR ), conses_high.second( canon_info ) ) );
    }
    if( NIL != canon_gaf && NIL != clauses.atomic_clause_p( cnf ) && NIL == v_variables )
    {
      if( NIL == clauses.neg_lits( cnf ) )
      {
        hl_tv = ( strength == $kw58$MONOTONIC ) ? $kw257$TRUE_MON : $kw258$TRUE_DEF;
      }
      else
      {
        ConsesLow.rplaca( cnf.rest(), clauses.neg_lits( cnf ) );
        ConsesLow.rplaca( cnf, NIL );
        hl_tv = ( strength == $kw58$MONOTONIC ) ? $kw259$FALSE_MON : $kw260$FALSE_DEF;
      }
    }
    else
    {
      hl_tv = ( strength == $kw58$MONOTONIC ) ? $kw257$TRUE_MON : $kw258$TRUE_DEF;
    }
    return Values.values( cnf, v_variables, hl_tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 112623L)
  public static SubLObject fi_canonicalize_gaf(final SubLObject formula, SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject canon_versions = NIL;
    thread.resetMultipleValues();
    final SubLObject canon_versions_$52 = czer_main.canonicalize_assert_sentence( formula, mt );
    final SubLObject mt_$53 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    canon_versions = canon_versions_$52;
    mt = mt_$53;
    if( canon_versions.isCons() && Sequences.length( canon_versions ).numE( ONE_INTEGER ) )
    {
      return fi_canonicalize( canon_versions.first(), T, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 113059L)
  public static SubLObject clear_cached_fi_canonicalize_gaf()
  {
    final SubLObject cs = $cached_fi_canonicalize_gaf_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 113059L)
  public static SubLObject remove_cached_fi_canonicalize_gaf(final SubLObject formula, final SubLObject mt)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $cached_fi_canonicalize_gaf_caching_state$.getGlobalValue(), ConsesLow.list( formula, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 113059L)
  public static SubLObject cached_fi_canonicalize_gaf_internal(final SubLObject formula, final SubLObject mt)
  {
    return fi_canonicalize_gaf( formula, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 113059L)
  public static SubLObject cached_fi_canonicalize_gaf(final SubLObject formula, final SubLObject mt)
  {
    SubLObject caching_state = $cached_fi_canonicalize_gaf_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym261$CACHED_FI_CANONICALIZE_GAF, $sym262$_CACHED_FI_CANONICALIZE_GAF_CACHING_STATE_, NIL, EQUAL, TWO_INTEGER, $int263$100 );
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
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( cached_fi_canonicalize_gaf_internal( formula, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( formula, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 113180L)
  public static SubLObject fi_canonicalize_literal(final SubLObject literal, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject cnf = fi_canonicalize_gaf( literal, mt );
    final SubLObject v_variables = thread.secondMultipleValue();
    final SubLObject hl_tv = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    final SubLObject atomic_sentence = clauses.pos_lits( cnf ).first();
    if( enumeration_types.tv_truth( hl_tv ) == $kw171$FALSE )
    {
      return cycl_utilities.negate( atomic_sentence );
    }
    return atomic_sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 113542L)
  public static SubLObject fi_canonicalize_ask(final SubLObject canon_info)
  {
    SubLObject dnf = NIL;
    SubLObject v_variables = NIL;
    SubLObject free_variables = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( canon_info, canon_info, $list264 );
    dnf = canon_info.first();
    SubLObject current = canon_info.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, canon_info, $list264 );
    v_variables = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, canon_info, $list264 );
    free_variables = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return Values.values( dnf, Mapping.mapcar( Symbols.symbol_function( $sym265$FIRST ), v_variables ), free_variables );
    }
    cdestructuring_bind.cdestructuring_bind_error( canon_info, $list264 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 113716L)
  public static SubLObject kb_var_listP(final SubLObject list)
  {
    if( list.isList() )
    {
      SubLObject not_kb_var_listP = NIL;
      if( NIL == not_kb_var_listP )
      {
        SubLObject csome_list_var = list;
        SubLObject element = NIL;
        element = csome_list_var.first();
        while ( NIL == not_kb_var_listP && NIL != csome_list_var)
        {
          if( NIL == variables.variable_p( element ) )
          {
            not_kb_var_listP = T;
          }
          csome_list_var = csome_list_var.rest();
          element = csome_list_var.first();
        }
      }
      return makeBoolean( NIL == not_kb_var_listP );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 114154L)
  public static SubLObject assertion_fi_formula(final SubLObject assertion, SubLObject substitute_varsP)
  {
    if( substitute_varsP == UNPROVIDED )
    {
      substitute_varsP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject scope_mt = $assertion_fi_formula_mt_scope$.getDynamicValue( thread );
    final SubLObject mt = assertions_high.assertion_mt( assertion );
    SubLObject formula = NIL;
    if( NIL != scope_mt && NIL == hlmt.hlmt_equal( mt, scope_mt ) )
    {
      formula = assertions_high.assertion_ist_formula( assertion );
    }
    else
    {
      formula = assertions_high.assertion_formula( assertion );
    }
    formula = conses_high.copy_tree( formula );
    final SubLObject _prev_bind_0 = $assertion_fi_formula_mt_scope$.currentBinding( thread );
    try
    {
      $assertion_fi_formula_mt_scope$.bind( mt, thread );
      formula = perform_fi_substitutions( formula, ( NIL != substitute_varsP ) ? assertions_high.assertion_el_variables( assertion ) : NIL );
    }
    finally
    {
      $assertion_fi_formula_mt_scope$.rebind( _prev_bind_0, thread );
    }
    return formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 114931L)
  public static SubLObject assertion_hl_formula(final SubLObject assertion, SubLObject substitute_varsP)
  {
    if( substitute_varsP == UNPROVIDED )
    {
      substitute_varsP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    SubLObject formula = NIL;
    final SubLObject _prev_bind_0 = api_control_vars.$generate_readable_fi_results$.currentBinding( thread );
    try
    {
      api_control_vars.$generate_readable_fi_results$.bind( NIL, thread );
      formula = assertion_fi_formula( assertion, substitute_varsP );
    }
    finally
    {
      api_control_vars.$generate_readable_fi_results$.rebind( _prev_bind_0, thread );
    }
    return formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 115201L)
  public static SubLObject assertion_fi_ist_formula(final SubLObject assertion, SubLObject substitute_varsP)
  {
    if( substitute_varsP == UNPROVIDED )
    {
      substitute_varsP = T;
    }
    return ConsesLow.list( $const191$ist, assertions_high.assertion_mt( assertion ), assertion_fi_formula( assertion, substitute_varsP ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 115556L)
  public static SubLObject assertion_fi_cnf(final SubLObject assertion, SubLObject substitute_varsP)
  {
    if( substitute_varsP == UNPROVIDED )
    {
      substitute_varsP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mt = assertions_high.assertion_mt( assertion );
    SubLObject cnf = conses_high.copy_tree( assertions_high.assertion_cnf( assertion ) );
    final SubLObject _prev_bind_0 = $assertion_fi_formula_mt_scope$.currentBinding( thread );
    try
    {
      $assertion_fi_formula_mt_scope$.bind( mt, thread );
      cnf = perform_fi_substitutions( cnf, ( NIL != substitute_varsP ) ? assertions_high.assertion_el_variables( assertion ) : NIL );
    }
    finally
    {
      $assertion_fi_formula_mt_scope$.rebind( _prev_bind_0, thread );
    }
    return cnf;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 115902L)
  public static SubLObject assertion_cnf_with_el_vars(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = api_control_vars.$generate_readable_fi_results$.currentBinding( thread );
    try
    {
      api_control_vars.$generate_readable_fi_results$.bind( NIL, thread );
      result = perform_fi_substitutions( conses_high.copy_tree( assertions_high.assertion_cnf( assertion ) ), assertions_high.assertion_el_variables( assertion ) );
    }
    finally
    {
      api_control_vars.$generate_readable_fi_results$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 116346L)
  public static SubLObject perform_fi_substitutions(SubLObject v_object, SubLObject symbol_variables)
  {
    if( symbol_variables == UNPROVIDED )
    {
      symbol_variables = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var = symbol_variables;
    SubLObject symbol = NIL;
    symbol = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject variable = variables.find_variable_by_id( Sequences.position( symbol, symbol_variables, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      v_object = conses_high.nsubst( symbol, variable, v_object, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      symbol = cdolist_list_var.first();
    }
    v_object = transform_list_utilities.ntransform( v_object, Symbols.symbol_function( $sym266$VARIABLE_P ), Symbols.symbol_function( $sym267$DEFAULT_EL_VAR_FOR_HL_VAR ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != api_control_vars.$generate_readable_fi_results$.getDynamicValue( thread ) )
    {
      v_object = assertion_expand( v_object );
      v_object = narts_high.nart_expand( v_object );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 117079L)
  public static SubLObject assertion_expand(SubLObject v_object)
  {
    if( NIL != list_utilities.tree_find_if( Symbols.symbol_function( $sym84$ASSERTION_P ), v_object, UNPROVIDED ) )
    {
      v_object = transform_list_utilities.transform( v_object, Symbols.symbol_function( $sym84$ASSERTION_P ), Symbols.symbol_function( $sym108$ASSERTION_FI_FORMULA ), UNPROVIDED );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 117251L)
  public static SubLObject assertion_ist_expand(SubLObject v_object)
  {
    if( NIL != list_utilities.tree_find_if( Symbols.symbol_function( $sym84$ASSERTION_P ), v_object, UNPROVIDED ) )
    {
      v_object = transform_list_utilities.transform( v_object, Symbols.symbol_function( $sym84$ASSERTION_P ), Symbols.symbol_function( $sym268$ASSERTION_FI_IST_FORMULA ), UNPROVIDED );
    }
    return v_object;
  }

  public static SubLObject declare_fi_file()
  {
    SubLFiles.declareFunction( me, "reset_fi_error_state", "RESET-FI-ERROR-STATE", 0, 0, false );
    SubLFiles.declareMacro( me, "with_clean_fi_error_state", "WITH-CLEAN-FI-ERROR-STATE" );
    SubLFiles.declareFunction( me, "reset_fi_warning", "RESET-FI-WARNING", 0, 0, false );
    SubLFiles.declareFunction( me, "signal_fi_warning", "SIGNAL-FI-WARNING", 1, 0, false );
    SubLFiles.declareFunction( me, "fi_warning_signaledP", "FI-WARNING-SIGNALED?", 0, 0, false );
    SubLFiles.declareFunction( me, "fi_get_warning_int", "FI-GET-WARNING-INT", 0, 0, false );
    SubLFiles.declareFunction( me, "reset_fi_error", "RESET-FI-ERROR", 0, 0, false );
    SubLFiles.declareFunction( me, "signal_fi_error", "SIGNAL-FI-ERROR", 1, 0, false );
    SubLFiles.declareFunction( me, "fi_error_signaledP", "FI-ERROR-SIGNALED?", 0, 0, false );
    SubLFiles.declareFunction( me, "fi_get_error_int", "FI-GET-ERROR-INT", 0, 0, false );
    SubLFiles.declareFunction( me, "fi_error_string", "FI-ERROR-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "fi_get_error_string_int", "FI-GET-ERROR-STRING-INT", 0, 0, false );
    SubLFiles.declareFunction( me, "set_fi_last_assertions_asserted", "SET-FI-LAST-ASSERTIONS-ASSERTED", 1, 0, false );
    SubLFiles.declareFunction( me, "push_fi_last_assertions_asserted", "PUSH-FI-LAST-ASSERTIONS-ASSERTED", 1, 0, false );
    SubLFiles.declareMacro( me, "within_fi_operation", "WITHIN-FI-OPERATION" );
    SubLFiles.declareFunction( me, "already_within_fi_operationP", "ALREADY-WITHIN-FI-OPERATION?", 0, 0, false );
    SubLFiles.declareFunction( me, "fi", "FI", 1, 8, false );
    SubLFiles.declareFunction( me, "fi_construct_form_to_enqueue", "FI-CONSTRUCT-FORM-TO-ENQUEUE", 1, 8, false );
    SubLFiles.declareFunction( me, "fi_quotify", "FI-QUOTIFY", 1, 0, false );
    SubLFiles.declareFunction( me, "fi_1", "FI-1", 3, 0, false );
    SubLFiles.declareFunction( me, "possibly_add_to_transcript_queues", "POSSIBLY-ADD-TO-TRANSCRIPT-QUEUES", 1, 0, false );
    SubLFiles.declareFunction( me, "safe_fi", "SAFE-FI", 1, 8, false );
    SubLFiles.declareFunction( me, "fi_get_warning", "FI-GET-WARNING", 0, 0, false );
    SubLFiles.declareFunction( me, "fi_get_error", "FI-GET-ERROR", 0, 0, false );
    SubLFiles.declareFunction( me, "fi_find", "FI-FIND", 1, 0, false );
    SubLFiles.declareFunction( me, "fi_find_int", "FI-FIND-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "fi_complete", "FI-COMPLETE", 1, 1, false );
    SubLFiles.declareFunction( me, "fi_complete_int", "FI-COMPLETE-INT", 1, 1, false );
    SubLFiles.declareFunction( me, "fi_create", "FI-CREATE", 1, 1, false );
    SubLFiles.declareFunction( me, "fi_create_int", "FI-CREATE-INT", 1, 1, false );
    SubLFiles.declareFunction( me, "handle_id_clash", "HANDLE-ID-CLASH", 2, 0, false );
    SubLFiles.declareFunction( me, "fi_find_or_create", "FI-FIND-OR-CREATE", 1, 1, false );
    SubLFiles.declareFunction( me, "fi_find_or_create_int", "FI-FIND-OR-CREATE-INT", 1, 1, false );
    SubLFiles.declareFunction( me, "fi_create_skolem", "FI-CREATE-SKOLEM", 5, 0, false );
    SubLFiles.declareFunction( me, "fi_create_skolem_int", "FI-CREATE-SKOLEM-INT", 4, 1, false );
    SubLFiles.declareFunction( me, "fi_skolem_assert_arg_isas", "FI-SKOLEM-ASSERT-ARG-ISAS", 4, 0, false );
    SubLFiles.declareFunction( me, "fi_skolem_assert_result_types", "FI-SKOLEM-ASSERT-RESULT-TYPES", 3, 0, false );
    SubLFiles.declareFunction( me, "new_skolem_name", "NEW-SKOLEM-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "next_random_basis_for_skolem_name", "NEXT-RANDOM-BASIS-FOR-SKOLEM-NAME", 0, 0, false );
    SubLFiles.declareFunction( me, "new_random_basis_for_skolem_name", "NEW-RANDOM-BASIS-FOR-SKOLEM-NAME", 0, 0, false );
    SubLFiles.declareFunction( me, "fi_merge", "FI-MERGE", 2, 0, false );
    SubLFiles.declareFunction( me, "fi_merge_int", "FI-MERGE-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "merge_fort_recursive", "MERGE-FORT-RECURSIVE", 2, 0, false );
    SubLFiles.declareFunction( me, "merge_dependent_narts", "MERGE-DEPENDENT-NARTS", 2, 0, false );
    SubLFiles.declareFunction( me, "merge_dependent_kb_hl_supports", "MERGE-DEPENDENT-KB-HL-SUPPORTS", 2, 0, false );
    SubLFiles.declareFunction( me, "substitute_assertion", "SUBSTITUTE-ASSERTION", 4, 0, false );
    SubLFiles.declareFunction( me, "substitute_asserted_argument", "SUBSTITUTE-ASSERTED-ARGUMENT", 4, 0, false );
    SubLFiles.declareFunction( me, "substitute_deduction", "SUBSTITUTE-DEDUCTION", 6, 0, false );
    SubLFiles.declareFunction( me, "substitute_dependents", "SUBSTITUTE-DEPENDENTS", 5, 0, false );
    SubLFiles.declareFunction( me, "substitute_dependent_assertion", "SUBSTITUTE-DEPENDENT-ASSERTION", 4, 0, false );
    SubLFiles.declareFunction( me, "substitute_termofunit_assertion", "SUBSTITUTE-TERMOFUNIT-ASSERTION", 4, 0, false );
    SubLFiles.declareFunction( me, "make_merge_fort_assertion_map", "MAKE-MERGE-FORT-ASSERTION-MAP", 1, 0, false );
    SubLFiles.declareFunction( me, "merge_fort_assertion_map_validP", "MERGE-FORT-ASSERTION-MAP-VALID?", 0, 0, false );
    SubLFiles.declareFunction( me, "add_merge_fort_assertion_mapping", "ADD-MERGE-FORT-ASSERTION-MAPPING", 3, 0, false );
    SubLFiles.declareFunction( me, "get_merge_fort_assertion_mapping", "GET-MERGE-FORT-ASSERTION-MAPPING", 1, 0, false );
    SubLFiles.declareFunction( me, "fi_kill", "FI-KILL", 1, 0, false );
    SubLFiles.declareFunction( me, "fi_kill_int", "FI-KILL-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "fi_rename", "FI-RENAME", 2, 0, false );
    SubLFiles.declareFunction( me, "fi_rename_int", "FI-RENAME-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "fi_lookup", "FI-LOOKUP", 2, 0, false );
    SubLFiles.declareFunction( me, "fi_lookup_int", "FI-LOOKUP-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "sentence_assertions_in_mt", "SENTENCE-ASSERTIONS-IN-MT", 3, 0, false );
    SubLFiles.declareFunction( me, "sentence_assertions", "SENTENCE-ASSERTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "sentence_visible_assertions", "SENTENCE-VISIBLE-ASSERTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "sentence_assertions_in_any_mt", "SENTENCE-ASSERTIONS-IN-ANY-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "sentence_assertion", "SENTENCE-ASSERTION", 2, 0, false );
    SubLFiles.declareFunction( me, "gaf_sentence_assertion", "GAF-SENTENCE-ASSERTION", 2, 0, false );
    SubLFiles.declareFunction( me, "fi_assert", "FI-ASSERT", 2, 2, false );
    SubLFiles.declareFunction( me, "fi_assert_int", "FI-ASSERT-INT", 2, 2, false );
    SubLFiles.declareFunction( me, "perform_assert_post_processing", "PERFORM-ASSERT-POST-PROCESSING", 2, 0, false );
    SubLFiles.declareFunction( me, "perform_assert_post_processing_for_skolem", "PERFORM-ASSERT-POST-PROCESSING-FOR-SKOLEM", 2, 0, false );
    SubLFiles.declareFunction( me, "fi_perform_assert_post_processing_for_skolem", "FI-PERFORM-ASSERT-POST-PROCESSING-FOR-SKOLEM", 2, 0, false );
    SubLFiles.declareFunction( me, "fi_cnf_default_direction", "FI-CNF-DEFAULT-DIRECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "fi_not_wff_error", "FI-NOT-WFF-ERROR", 2, 0, false );
    SubLFiles.declareFunction( me, "fi_not_wff_assert_error", "FI-NOT-WFF-ASSERT-ERROR", 2, 0, false );
    SubLFiles.declareFunction( me, "fi_assert_update_asserted_argument", "FI-ASSERT-UPDATE-ASSERTED-ARGUMENT", 3, 1, false );
    SubLFiles.declareFunction( me, "hl_assert_update_asserted_argument", "HL-ASSERT-UPDATE-ASSERTED-ARGUMENT", 3, 1, false );
    SubLFiles.declareFunction( me, "fi_reassert", "FI-REASSERT", 4, 0, false );
    SubLFiles.declareFunction( me, "fi_reassert_int", "FI-REASSERT-INT", 4, 0, false );
    SubLFiles.declareFunction( me, "fi_reassert_hl_tv", "FI-REASSERT-HL-TV", 2, 0, false );
    SubLFiles.declareFunction( me, "fi_rededuce_deduction_assertion", "FI-REDEDUCE-DEDUCTION-ASSERTION", 2, 0, false );
    SubLFiles.declareFunction( me, "fi_deny", "FI-DENY", 3, 0, false );
    SubLFiles.declareFunction( me, "fi_deny_int", "FI-DENY-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "fi_unassert", "FI-UNASSERT", 2, 0, false );
    SubLFiles.declareFunction( me, "fi_unassert_int", "FI-UNASSERT-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_fi_unassert_sentence", "CANONICALIZE-FI-UNASSERT-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_fi_blast_sentence", "CANONICALIZE-FI-BLAST-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_fi_remove_sentence", "CANONICALIZE-FI-REMOVE-SENTENCE", 3, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_unassert_hlmt", "CANONICALIZE-UNASSERT-HLMT", 1, 0, false );
    SubLFiles.declareFunction( me, "fi_edit", "FI-EDIT", 2, 4, false );
    SubLFiles.declareFunction( me, "fi_edit_int", "FI-EDIT-INT", 2, 4, false );
    SubLFiles.declareFunction( me, "fi_justify", "FI-JUSTIFY", 2, 1, false );
    SubLFiles.declareFunction( me, "fi_justify_int", "FI-JUSTIFY-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "formula_justify", "FORMULA-JUSTIFY", 2, 1, false );
    SubLFiles.declareFunction( me, "gaf_justify", "GAF-JUSTIFY", 3, 0, false );
    SubLFiles.declareFunction( me, "one_step_gaf_justify", "ONE-STEP-GAF-JUSTIFY", 2, 0, false );
    SubLFiles.declareFunction( me, "justify_support", "JUSTIFY-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "fi_add_argument", "FI-ADD-ARGUMENT", 3, 2, false );
    SubLFiles.declareFunction( me, "fi_add_argument_int", "FI-ADD-ARGUMENT-INT", 3, 2, false );
    SubLFiles.declareFunction( me, "perform_deduce_post_processing", "PERFORM-DEDUCE-POST-PROCESSING", 2, 0, false );
    SubLFiles.declareFunction( me, "convert_hl_support_to_el_support", "CONVERT-HL-SUPPORT-TO-EL-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "convert_hl_support_to_fi_support", "CONVERT-HL-SUPPORT-TO-FI-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "convert_hl_support_to_tl_support", "CONVERT-HL-SUPPORT-TO-TL-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "make_el_support", "MAKE-EL-SUPPORT", 2, 2, false );
    SubLFiles.declareFunction( me, "fi_canonicalize_el_supports", "FI-CANONICALIZE-EL-SUPPORTS", 1, 1, false );
    SubLFiles.declareFunction( me, "el_support_assertions", "EL-SUPPORT-ASSERTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "fi_remove_argument", "FI-REMOVE-ARGUMENT", 3, 1, false );
    SubLFiles.declareFunction( me, "fi_remove_argument_int", "FI-REMOVE-ARGUMENT-INT", 3, 1, false );
    SubLFiles.declareFunction( me, "fi_blast", "FI-BLAST", 2, 0, false );
    SubLFiles.declareFunction( me, "fi_blast_int", "FI-BLAST-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "fi_ask", "FI-ASK", 1, 5, false );
    SubLFiles.declareFunction( me, "fi_ask_int", "FI-ASK-INT", 1, 5, false );
    SubLFiles.declareFunction( me, "fi_ask_ist_query_p", "FI-ASK-IST-QUERY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "fi_ask_int_new_cyc_query_trampoline", "FI-ASK-INT-NEW-CYC-QUERY-TRAMPOLINE", 6, 0, false );
    SubLFiles.declareFunction( me, "fi_continue_last_ask", "FI-CONTINUE-LAST-ASK", 0, 5, false );
    SubLFiles.declareFunction( me, "fi_continue_last_ask_int", "FI-CONTINUE-LAST-ASK-INT", 0, 5, false );
    SubLFiles.declareFunction( me, "fi_ask_status", "FI-ASK-STATUS", 0, 0, false );
    SubLFiles.declareFunction( me, "fi_ask_status_int", "FI-ASK-STATUS-INT", 0, 0, false );
    SubLFiles.declareFunction( me, "fi_tms_reconsider_formula", "FI-TMS-RECONSIDER-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "fi_tms_reconsider_formula_int", "FI-TMS-RECONSIDER-FORMULA-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "fi_tms_reconsider_mt", "FI-TMS-RECONSIDER-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "fi_tms_reconsider_mt_int", "FI-TMS-RECONSIDER-MT-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "fi_tms_reconsider_gafs", "FI-TMS-RECONSIDER-GAFS", 1, 3, false );
    SubLFiles.declareFunction( me, "fi_tms_reconsider_gafs_int", "FI-TMS-RECONSIDER-GAFS-INT", 1, 3, false );
    SubLFiles.declareFunction( me, "fi_tms_reconsider_term", "FI-TMS-RECONSIDER-TERM", 1, 1, false );
    SubLFiles.declareFunction( me, "fi_tms_reconsider_term_int", "FI-TMS-RECONSIDER-TERM-INT", 1, 1, false );
    SubLFiles.declareFunction( me, "fi_denotation", "FI-DENOTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "fi_denotation_int", "FI-DENOTATION-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "fi_timestamp_constant", "FI-TIMESTAMP-CONSTANT", 2, 2, false );
    SubLFiles.declareFunction( me, "fi_timestamp_constant_int", "FI-TIMESTAMP-CONSTANT-INT", 2, 2, false );
    SubLFiles.declareFunction( me, "constant_timestampedP", "CONSTANT-TIMESTAMPED?", 1, 0, false );
    SubLFiles.declareFunction( me, "timestamp_constant", "TIMESTAMP-CONSTANT", 3, 2, false );
    SubLFiles.declareFunction( me, "untimestamp_constant", "UNTIMESTAMP-CONSTANT", 1, 0, false );
    SubLFiles.declareFunction( me, "retimestamp_constant", "RETIMESTAMP-CONSTANT", 3, 2, false );
    SubLFiles.declareFunction( me, "fi_timestamp_assertion", "FI-TIMESTAMP-ASSERTION", 2, 2, false );
    SubLFiles.declareFunction( me, "fi_timestamp_assertion_int", "FI-TIMESTAMP-ASSERTION-INT", 2, 2, false );
    SubLFiles.declareFunction( me, "fi_remove_timestamp", "FI-REMOVE-TIMESTAMP", 1, 1, false );
    SubLFiles.declareFunction( me, "fi_remove_timestamp_int", "FI-REMOVE-TIMESTAMP-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "fi_rename_variables", "FI-RENAME-VARIABLES", 2, 1, false );
    SubLFiles.declareFunction( me, "fi_rename_variables_int", "FI-RENAME-VARIABLES-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "fi_get_parameter", "FI-GET-PARAMETER", 1, 0, false );
    SubLFiles.declareFunction( me, "fi_get_parameter_int", "FI-GET-PARAMETER-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "fi_set_parameter", "FI-SET-PARAMETER", 2, 0, false );
    SubLFiles.declareFunction( me, "fi_set_parameter_int", "FI-SET-PARAMETER-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "fi_eval", "FI-EVAL", 1, 0, false );
    SubLFiles.declareFunction( me, "fi_eval_int", "FI-EVAL-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "fi_local_eval", "FI-LOCAL-EVAL", 1, 0, false );
    SubLFiles.declareFunction( me, "fi_local_eval_int", "FI-LOCAL-EVAL-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "ke_purpose", "KE-PURPOSE", 0, 0, false );
    SubLFiles.declareFunction( me, "set_ke_purpose", "SET-KE-PURPOSE", 1, 0, false );
    SubLFiles.declareFunction( me, "the_date", "THE-DATE", 0, 0, false );
    SubLFiles.declareFunction( me, "the_second", "THE-SECOND", 0, 0, false );
    SubLFiles.declareFunction( me, "fi_convert_to_assert_hlmt_if_wft", "FI-CONVERT-TO-ASSERT-HLMT-IF-WFT", 1, 0, false );
    SubLFiles.declareFunction( me, "fi_convert_to_assert_hlmt", "FI-CONVERT-TO-ASSERT-HLMT", 1, 0, false );
    SubLFiles.declareFunction( me, "fi_convert_to_ask_hlmt", "FI-CONVERT-TO-ASK-HLMT", 1, 0, false );
    SubLFiles.declareFunction( me, "fi_convert_to_fort", "FI-CONVERT-TO-FORT", 1, 0, false );
    SubLFiles.declareFunction( me, "fi_canonicalize_el_term", "FI-CANONICALIZE-EL-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "fi_canonicalize", "FI-CANONICALIZE", 1, 2, false );
    SubLFiles.declareFunction( me, "fi_canonicalize_gaf", "FI-CANONICALIZE-GAF", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_cached_fi_canonicalize_gaf", "CLEAR-CACHED-FI-CANONICALIZE-GAF", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_cached_fi_canonicalize_gaf", "REMOVE-CACHED-FI-CANONICALIZE-GAF", 2, 0, false );
    SubLFiles.declareFunction( me, "cached_fi_canonicalize_gaf_internal", "CACHED-FI-CANONICALIZE-GAF-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "cached_fi_canonicalize_gaf", "CACHED-FI-CANONICALIZE-GAF", 2, 0, false );
    SubLFiles.declareFunction( me, "fi_canonicalize_literal", "FI-CANONICALIZE-LITERAL", 2, 0, false );
    SubLFiles.declareFunction( me, "fi_canonicalize_ask", "FI-CANONICALIZE-ASK", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_var_listP", "KB-VAR-LIST?", 1, 0, false );
    SubLFiles.declareFunction( me, "assertion_fi_formula", "ASSERTION-FI-FORMULA", 1, 1, false );
    SubLFiles.declareFunction( me, "assertion_hl_formula", "ASSERTION-HL-FORMULA", 1, 1, false );
    SubLFiles.declareFunction( me, "assertion_fi_ist_formula", "ASSERTION-FI-IST-FORMULA", 1, 1, false );
    SubLFiles.declareFunction( me, "assertion_fi_cnf", "ASSERTION-FI-CNF", 1, 1, false );
    SubLFiles.declareFunction( me, "assertion_cnf_with_el_vars", "ASSERTION-CNF-WITH-EL-VARS", 1, 0, false );
    SubLFiles.declareFunction( me, "perform_fi_substitutions", "PERFORM-FI-SUBSTITUTIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "assertion_expand", "ASSERTION-EXPAND", 1, 0, false );
    SubLFiles.declareFunction( me, "assertion_ist_expand", "ASSERTION-IST-EXPAND", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_fi_file()
  {
    $fi_dispatch_table$ = SubLFiles.deflexical( "*FI-DISPATCH-TABLE*", $list0 );
    $fi_warning$ = SubLFiles.defparameter( "*FI-WARNING*", NIL );
    $fi_error$ = SubLFiles.defparameter( "*FI-ERROR*", NIL );
    $fi_last_constant$ = SubLFiles.defparameter( "*FI-LAST-CONSTANT*", NIL );
    $within_fi_operationP$ = SubLFiles.defparameter( "*WITHIN-FI-OPERATION?*", NIL );
    $current_fi_op$ = SubLFiles.defparameter( "*CURRENT-FI-OP*", NIL );
    $merge_fort_assertion_map$ = SubLFiles.defparameter( "*MERGE-FORT-ASSERTION-MAP*", NIL );
    $assume_assert_sentence_is_wfP$ = SubLFiles.defparameter( "*ASSUME-ASSERT-SENTENCE-IS-WF?*", NIL );
    $generate_precise_fi_wff_errorsP$ = SubLFiles.defparameter( "*GENERATE-PRECISE-FI-WFF-ERRORS?*", T );
    $the_date$ = SubLFiles.defparameter( "*THE-DATE*", NIL );
    $the_second$ = SubLFiles.defparameter( "*THE-SECOND*", NIL );
    $cached_fi_canonicalize_gaf_caching_state$ = SubLFiles.deflexical( "*CACHED-FI-CANONICALIZE-GAF-CACHING-STATE*", NIL );
    $assertion_fi_formula_mt_scope$ = SubLFiles.defparameter( "*ASSERTION-FI-FORMULA-MT-SCOPE*", NIL );
    return NIL;
  }

  public static SubLObject setup_fi_file()
  {
    utilities_macros.register_html_state_variable( $sym3$_FI_WARNING_ );
    SubLObject item_var = $sym3$_FI_WARNING_;
    if( NIL == conses_high.member( item_var, utilities_macros.$fi_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$fi_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$fi_state_variables$.getGlobalValue() ) );
    }
    utilities_macros.register_html_state_variable( $sym4$_FI_ERROR_ );
    item_var = $sym4$_FI_ERROR_;
    if( NIL == conses_high.member( item_var, utilities_macros.$fi_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$fi_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$fi_state_variables$.getGlobalValue() ) );
    }
    utilities_macros.register_html_state_variable( $sym7$_FI_LAST_CONSTANT_ );
    item_var = $sym7$_FI_LAST_CONSTANT_;
    if( NIL == conses_high.member( item_var, utilities_macros.$fi_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$fi_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$fi_state_variables$.getGlobalValue() ) );
    }
    utilities_macros.register_cyc_api_function( $sym21$FI_GET_WARNING, NIL, $str22$Return_a_description_of_the_warni, NIL, $list23 );
    utilities_macros.register_cyc_api_function( $sym25$FI_GET_ERROR, NIL, $str26$Return_a_description_of_the_error, NIL, $list23 );
    utilities_macros.register_cyc_api_function( $sym28$FI_FIND, $list29, $str30$Return_the_constant_indentified_b, NIL, $list31 );
    utilities_macros.register_cyc_api_function( $sym37$FI_COMPLETE, $list38, $str39$Return_a_list_of_constants_whose_, NIL, $list40 );
    utilities_macros.register_cyc_api_function( $sym13$FI_CREATE, $list42, $str43$Create_a_new_constant_with_NAME__, NIL, $list44 );
    utilities_macros.register_cyc_api_function( $sym14$FI_FIND_OR_CREATE, $list42, $str52$Return_constant_with_NAME_if_it_i, NIL, $list44 );
    utilities_macros.register_cyc_api_function( $sym89$FI_KILL, $list90, $str91$Kill_FORT_and_all_its_uses_from_t, NIL, $list92 );
    utilities_macros.register_cyc_api_function( $sym96$FI_RENAME, $list97, $str98$Change_name_of_CONSTANT_to_NAME__, NIL, $list31 );
    utilities_macros.register_cyc_api_function( $sym103$FI_LOOKUP, $list104, $str105$Returns_two_values_when_looking_u, NIL, $list106 );
    utilities_macros.register_cyc_api_function( $sym111$FI_ASSERT, $list112, $str113$Assert_the_FORMULA_in_the_specifi, NIL, $list92 );
    utilities_macros.register_cyc_api_function( $sym152$FI_UNASSERT, $list104, $str153$Remove_the_assertions_canonicaliz, NIL, $list92 );
    utilities_macros.register_cyc_api_function( $sym160$FI_EDIT, $list161, $str162$Unassert_the_assertions_canonical, NIL, $list92 );
    utilities_macros.register_cyc_api_function( $sym181$FI_BLAST, $list104, $str182$Remove_all_arguments_for_the_FORM, NIL, $list92 );
    utilities_macros.register_cyc_api_function( $sym184$FI_ASK, $list185, $str186$Ask_for_bindings_for_free_variabl, NIL, $list187 );
    utilities_macros.register_obsolete_cyc_api_function( $sym193$FI_CONTINUE_LAST_ASK, $list194, $list195, $str196$Continue_the_last_ask_that_was_pe, NIL, $list187 );
    access_macros.define_obsolete_register( $sym197$FI_CONTINUE_LAST_ASK_INT, $list194 );
    utilities_macros.register_obsolete_cyc_api_function( $sym200$FI_ASK_STATUS, $list201, NIL, $str202$Return_a_status_as_to_how_the_las, NIL, $list23 );
    access_macros.define_obsolete_register( $sym203$FI_ASK_STATUS_INT, $list201 );
    utilities_macros.register_cyc_api_function( $sym206$FI_TMS_RECONSIDER_FORMULA, $list104, $str207$Reconsider_all_arguments_for_FORM, NIL, $list92 );
    utilities_macros.register_cyc_api_function( $sym209$FI_TMS_RECONSIDER_MT, $list210, $str211$Reconsider_all_arguments_for_all_, NIL, $list92 );
    utilities_macros.register_cyc_api_function( $sym213$FI_TMS_RECONSIDER_GAFS, $list214, $str215$Reconsider_all_arguments_for_all_, NIL, $list92 );
    utilities_macros.register_cyc_api_function( $sym218$FI_TMS_RECONSIDER_TERM, $list219, $str220$Reconsider_all_arguments_involvin, NIL, $list92 );
    memoization_state.note_globally_cached_function( $sym261$CACHED_FI_CANONICALIZE_GAF );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_fi_file();
  }

  @Override
  public void initializeVariables()
  {
    init_fi_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_fi_file();
  }
  static
  {
    me = new fi();
    $fi_dispatch_table$ = null;
    $fi_warning$ = null;
    $fi_error$ = null;
    $fi_last_constant$ = null;
    $within_fi_operationP$ = null;
    $current_fi_op$ = null;
    $merge_fort_assertion_map$ = null;
    $assume_assert_sentence_is_wfP$ = null;
    $generate_precise_fi_wff_errorsP$ = null;
    $the_date$ = null;
    $the_second$ = null;
    $cached_fi_canonicalize_gaf_caching_state$ = null;
    $assertion_fi_formula_mt_scope$ = null;
    $list0 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeKeyword( "GET-WARNING" ), makeSymbol( "FI-GET-WARNING" ), makeSymbol( "FI-GET-WARNING-INT" ), NIL ), ConsesLow.list( makeKeyword( "GET-ERROR" ),
        makeSymbol( "FI-GET-ERROR" ), makeSymbol( "FI-GET-ERROR-INT" ), NIL ), ConsesLow.list( makeKeyword( "FIND" ), makeSymbol( "FI-FIND" ), makeSymbol( "FI-FIND-INT" ), NIL ), ConsesLow.list( makeKeyword(
            "COMPLETE" ), makeSymbol( "FI-COMPLETE" ), makeSymbol( "FI-COMPLETE-INT" ), NIL ), ConsesLow.list( makeKeyword( "CREATE" ), makeSymbol( "FI-CREATE" ), makeSymbol( "FI-CREATE-INT" ), T ), ConsesLow.list(
                makeKeyword( "FIND-OR-CREATE" ), makeSymbol( "FI-FIND-OR-CREATE" ), makeSymbol( "FI-FIND-OR-CREATE-INT" ), T ), ConsesLow.list( makeKeyword( "CREATE-SKOLEM" ), makeSymbol( "FI-CREATE-SKOLEM" ),
                    makeSymbol( "FI-CREATE-SKOLEM-INT" ), T ), ConsesLow.list( makeKeyword( "MERGE" ), makeSymbol( "FI-MERGE" ), makeSymbol( "FI-MERGE-INT" ), T ), ConsesLow.list( makeKeyword( "KILL" ), makeSymbol(
                        "FI-KILL" ), makeSymbol( "FI-KILL-INT" ), T ), ConsesLow.list( makeKeyword( "RENAME" ), makeSymbol( "FI-RENAME" ), makeSymbol( "FI-RENAME-INT" ), T ), ConsesLow.list( makeKeyword( "LOOKUP" ),
                            makeSymbol( "FI-LOOKUP" ), makeSymbol( "FI-LOOKUP-INT" ), NIL ), ConsesLow.list( makeKeyword( "ASSERT" ), makeSymbol( "FI-ASSERT" ), makeSymbol( "FI-ASSERT-INT" ), T ), ConsesLow.list(
                                makeKeyword( "REASSERT" ), makeSymbol( "FI-REASSERT" ), makeSymbol( "FI-REASSERT-INT" ), T ), ConsesLow.list( makeKeyword( "DENY" ), makeSymbol( "FI-DENY" ), makeSymbol( "FI-DENY-INT" ),
                                    T ), ConsesLow.list( makeKeyword( "UNASSERT" ), makeSymbol( "FI-UNASSERT" ), makeSymbol( "FI-UNASSERT-INT" ), T ), ConsesLow.list( makeKeyword( "EDIT" ), makeSymbol( "FI-EDIT" ),
                                        makeSymbol( "FI-EDIT-INT" ), T ), ConsesLow.list( makeKeyword( "RENAME-VARIABLES" ), makeSymbol( "FI-RENAME-VARIABLES" ), makeSymbol( "FI-RENAME-VARIABLES-INT" ), T ), ConsesLow
                                            .list( makeKeyword( "JUSTIFY" ), makeSymbol( "FI-JUSTIFY" ), makeSymbol( "FI-JUSTIFY-INT" ), NIL ), ConsesLow.list( makeKeyword( "ADD-ARGUMENT" ), makeSymbol(
                                                "FI-ADD-ARGUMENT" ), makeSymbol( "FI-ADD-ARGUMENT-INT" ), T ), ConsesLow.list( makeKeyword( "REMOVE-ARGUMENT" ), makeSymbol( "FI-REMOVE-ARGUMENT" ), makeSymbol(
                                                    "FI-REMOVE-ARGUMENT-INT" ), T ), ConsesLow.list( makeKeyword( "BLAST" ), makeSymbol( "FI-BLAST" ), makeSymbol( "FI-BLAST-INT" ), T ), ConsesLow.list( makeKeyword(
                                                        "ASK" ), makeSymbol( "FI-ASK" ), makeSymbol( "FI-ASK-INT" ), T ), ConsesLow.list( makeKeyword( "CONTINUE-LAST-ASK" ), makeSymbol( "FI-CONTINUE-LAST-ASK" ),
                                                            makeSymbol( "FI-CONTINUE-LAST-ASK-INT" ), T ), ConsesLow.list( makeKeyword( "ASK-STATUS" ), makeSymbol( "FI-ASK-STATUS" ), makeSymbol( "FI-ASK-STATUS-INT" ),
                                                                NIL ), ConsesLow.list( makeKeyword( "TMS-RECONSIDER-FORMULA" ), makeSymbol( "FI-TMS-RECONSIDER-FORMULA" ), makeSymbol( "FI-TMS-RECONSIDER-FORMULA-INT" ),
                                                                    T ), ConsesLow.list( makeKeyword( "TMS-RECONSIDER-MT" ), makeSymbol( "FI-TMS-RECONSIDER-MT" ), makeSymbol( "FI-TMS-RECONSIDER-MT-INT" ), T ), ConsesLow
                                                                        .list( makeKeyword( "TMS-RECONSIDER-GAFS" ), makeSymbol( "FI-TMS-RECONSIDER-GAFS" ), makeSymbol( "FI-TMS-RECONSIDER-GAFS-INT" ), T ), ConsesLow
                                                                            .list( makeKeyword( "TMS-RECONSIDER-TERM" ), makeSymbol( "FI-TMS-RECONSIDER-TERM" ), makeSymbol( "FI-TMS-RECONSIDER-TERM-INT" ), T ), ConsesLow
                                                                                .list( makeKeyword( "HYPOTHESIZE" ), makeSymbol( "FI-HYPOTHESIZE" ), makeSymbol( "FI-HYPOTHESIZE-INT" ), T ), ConsesLow.list( makeKeyword(
                                                                                    "PROVE" ), makeSymbol( "FI-PROVE" ), makeSymbol( "FI-PROVE-INT" ), T ), ConsesLow.list( makeKeyword( "DENOTATION" ), makeSymbol(
                                                                                        "FI-DENOTATION" ), makeSymbol( "FI-DENOTATION-INT" ), T ), ConsesLow.list( makeKeyword( "TIMESTAMP-CONSTANT" ), makeSymbol(
                                                                                            "FI-TIMESTAMP-CONSTANT" ), makeSymbol( "FI-TIMESTAMP-CONSTANT-INT" ), T ), ConsesLow.list( makeKeyword( "TIMESTAMP-ASSERTION" ),
                                                                                                makeSymbol( "FI-TIMESTAMP-ASSERTION" ), makeSymbol( "FI-TIMESTAMP-ASSERTION-INT" ), T ), ConsesLow.list( makeKeyword(
                                                                                                    "REMOVE-TIMESTAMP" ), makeSymbol( "FI-REMOVE-TIMESTAMP" ), makeSymbol( "FI-REMOVE-TIMESTAMP-INT" ), T ), ConsesLow.list(
                                                                                                        makeKeyword( "GET-PARAMETER" ), makeSymbol( "FI-GET-PARAMETER" ), makeSymbol( "FI-GET-PARAMETER-INT" ), NIL ),
      ConsesLow.list( makeKeyword( "SET-PARAMETER" ), makeSymbol( "FI-SET-PARAMETER" ), makeSymbol( "FI-SET-PARAMETER-INT" ), T ), ConsesLow.list( makeKeyword( "EVAL" ), makeSymbol( "FI-EVAL" ), makeSymbol(
          "FI-EVAL-INT" ), T ), ConsesLow.list( makeKeyword( "LOCAL-EVAL" ), makeSymbol( "FI-LOCAL-EVAL" ), makeSymbol( "FI-LOCAL-EVAL-INT" ), NIL )
    } );
    $sym1$CLET = makeSymbol( "CLET" );
    $list2 = ConsesLow.list( ConsesLow.list( makeSymbol( "*FI-ERROR*" ), NIL ), ConsesLow.list( makeSymbol( "*FI-WARNING*" ), NIL ) );
    $sym3$_FI_WARNING_ = makeSymbol( "*FI-WARNING*" );
    $sym4$_FI_ERROR_ = makeSymbol( "*FI-ERROR*" );
    $sym5$FORMAT = makeSymbol( "FORMAT" );
    $str6$_S = makeString( "~S" );
    $sym7$_FI_LAST_CONSTANT_ = makeSymbol( "*FI-LAST-CONSTANT*" );
    $list8 = ConsesLow.list( ConsesLow.list( makeSymbol( "*WITHIN-FI-OPERATION?*" ), T ) );
    $list9 = ConsesLow.list( makeSymbol( "FUN" ), makeSymbol( "INT-FUN" ), makeSymbol( "MODIFIES-KB?" ) );
    $str10$Bad_function_call_____FI__s__s__s = makeString( "Bad function call -> (FI ~s ~s ~s ~s ~s ~s ~s ~s ~s)\n~%A function for ~s is missing from *fi-dispatch-table*" );
    $sym11$QUOTE = makeSymbol( "QUOTE" );
    $kw12$QUEUED = makeKeyword( "QUEUED" );
    $sym13$FI_CREATE = makeSymbol( "FI-CREATE" );
    $sym14$FI_FIND_OR_CREATE = makeSymbol( "FI-FIND-OR-CREATE" );
    $list15 = ConsesLow.list( makeSymbol( "FUNC" ), makeSymbol( "NAME" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "EXTERNAL-ID" ) );
    $list16 = ConsesLow.list( makeSymbol( "QUOTE" ), NIL );
    $sym17$FI_HYPOTHESIZE = makeSymbol( "FI-HYPOTHESIZE" );
    $list18 = ConsesLow.list( makeSymbol( "FUNC" ), makeSymbol( "FORMULA" ), makeSymbol( "MT" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "NAME-PREFIX" ), makeString( "HYP" ) ), makeSymbol(
        "TERM-EXTERNAL-IDS" ) );
    $str19$HYP = makeString( "HYP" );
    $kw20$GET_WARNING = makeKeyword( "GET-WARNING" );
    $sym21$FI_GET_WARNING = makeSymbol( "FI-GET-WARNING" );
    $str22$Return_a_description_of_the_warni = makeString( "Return a description of the warning resulting from the last FI operation." );
    $list23 = ConsesLow.list( ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol( "ATOM" ) ) );
    $kw24$GET_ERROR = makeKeyword( "GET-ERROR" );
    $sym25$FI_GET_ERROR = makeSymbol( "FI-GET-ERROR" );
    $str26$Return_a_description_of_the_error = makeString( "Return a description of the error resulting from the last FI operation." );
    $kw27$FIND = makeKeyword( "FIND" );
    $sym28$FI_FIND = makeSymbol( "FI-FIND" );
    $list29 = ConsesLow.list( makeSymbol( "NAME" ) );
    $str30$Return_the_constant_indentified_b = makeString( "Return the constant indentified by the string NAME." );
    $list31 = ConsesLow.list( ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol( "CONSTANT-P" ) ) );
    $kw32$ARG_ERROR = makeKeyword( "ARG-ERROR" );
    $str33$Expected_a_string__got__S = makeString( "Expected a string, got ~S" );
    $kw34$INVALID_NAME = makeKeyword( "INVALID-NAME" );
    $str35$_S_is_not_a_valid_name_for_a_cons = makeString( "~S is not a valid name for a constant" );
    $kw36$COMPLETE = makeKeyword( "COMPLETE" );
    $sym37$FI_COMPLETE = makeSymbol( "FI-COMPLETE" );
    $list38 = ConsesLow.list( makeSymbol( "PREFIX" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "CASE-SENSITIVE?" ) );
    $str39$Return_a_list_of_constants_whose_ = makeString( "Return a list of constants whose name begins with PREFIX. The comparison is\nperformed in a case-insensitive mode unless CASE-SENSITIVE? is non-nil." );
    $list40 = ConsesLow.list( ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "CONSTANT-P" ) ) );
    $kw41$CREATE = makeKeyword( "CREATE" );
    $list42 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "EXTERNAL-ID" ) );
    $str43$Create_a_new_constant_with_NAME__ = makeString( "Create a new constant with NAME.\nIf EXTERNAL-ID is non-null it is used, otherwise a unique identifier is generated." );
    $list44 = ConsesLow.list( makeSymbol( "CONSTANT-P" ) );
    $kw45$UNNAMED = makeKeyword( "UNNAMED" );
    $kw46$NAME_CLASH = makeKeyword( "NAME-CLASH" );
    $str47$NAME_clash_for__S___renaming_to__ = makeString( "NAME clash for ~S ; renaming to ~S" );
    $str48$Expected_an_external_ID__got__S = makeString( "Expected an external ID, got ~S" );
    $kw49$ID_CLASH = makeKeyword( "ID-CLASH" );
    $str50$Already_a_constant_with_id__A = makeString( "Already a constant with id ~A" );
    $kw51$FIND_OR_CREATE = makeKeyword( "FIND-OR-CREATE" );
    $str52$Return_constant_with_NAME_if_it_i = makeString(
        "Return constant with NAME if it is present.  \nIf not present, then create constant with NAME, using EXTERNAL-ID if given.\nIf EXTERNAL-ID is not given, generate a new one for the new constant." );
    $kw53$CREATE_SKOLEM = makeKeyword( "CREATE-SKOLEM" );
    $sym54$QUEUE_P = makeSymbol( "QUEUE-P" );
    $sym55$TL_FUNCTION_TERM_ = makeSymbol( "TL-FUNCTION-TERM?" );
    $str56$Found_a_TL_term_in_skolem__a_defi = makeString( "Found a TL term in skolem ~a defining CNFs ~a" );
    $const57$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $kw58$MONOTONIC = makeKeyword( "MONOTONIC" );
    $const59$arityMin = constant_handles.reader_make_constant_shell( makeString( "arityMin" ) );
    $const60$arity = constant_handles.reader_make_constant_shell( makeString( "arity" ) );
    $const61$arg1Isa = constant_handles.reader_make_constant_shell( makeString( "arg1Isa" ) );
    $const62$arg2Isa = constant_handles.reader_make_constant_shell( makeString( "arg2Isa" ) );
    $const63$arg3Isa = constant_handles.reader_make_constant_shell( makeString( "arg3Isa" ) );
    $const64$arg4Isa = constant_handles.reader_make_constant_shell( makeString( "arg4Isa" ) );
    $const65$arg5Isa = constant_handles.reader_make_constant_shell( makeString( "arg5Isa" ) );
    $const66$resultIsa = constant_handles.reader_make_constant_shell( makeString( "resultIsa" ) );
    $const67$resultIsaArg = constant_handles.reader_make_constant_shell( makeString( "resultIsaArg" ) );
    $const68$CollectionDenotingFunction = constant_handles.reader_make_constant_shell( makeString( "CollectionDenotingFunction" ) );
    $list69 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CollectionDenotingFunction" ) ) );
    $const70$resultGenl = constant_handles.reader_make_constant_shell( makeString( "resultGenl" ) );
    $const71$SubcollectionDenotingFunction = constant_handles.reader_make_constant_shell( makeString( "SubcollectionDenotingFunction" ) );
    $list72 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SubcollectionDenotingFunction" ) ) );
    $const73$resultGenlArg = constant_handles.reader_make_constant_shell( makeString( "resultGenlArg" ) );
    $str74$SKF__a = makeString( "SKF-~a" );
    $str75$0123456789 = makeString( "0123456789" );
    $kw76$MERGE = makeKeyword( "MERGE" );
    $list77 = ConsesLow.list( makeKeyword( "SELF-MERGE" ), makeString( "Merging ~S onto itself is a no-op" ), makeSymbol( "KEEP-TERM" ) );
    $sym78$FORT_P = makeSymbol( "FORT-P" );
    $sym79$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const80$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const81$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $const82$termOfUnit = constant_handles.reader_make_constant_shell( makeString( "termOfUnit" ) );
    $sym83$SKOLEM_NART_ = makeSymbol( "SKOLEM-NART?" );
    $sym84$ASSERTION_P = makeSymbol( "ASSERTION-P" );
    $sym85$SKOLEM_TERM_ = makeSymbol( "SKOLEM-TERM?" );
    $str86$Could_not_merge_assertion_onto_te = makeString( "Could not merge assertion onto term ~S due to uncanonicalization problem:~%  ~S" );
    $sym87$CONVERT_HL_SUPPORT_TO_FI_SUPPORT = makeSymbol( "CONVERT-HL-SUPPORT-TO-FI-SUPPORT" );
    $kw88$KILL = makeKeyword( "KILL" );
    $sym89$FI_KILL = makeSymbol( "FI-KILL" );
    $list90 = ConsesLow.list( makeSymbol( "FORT" ) );
    $str91$Kill_FORT_and_all_its_uses_from_t = makeString( "Kill FORT and all its uses from the KB.  If FORT is a microtheory, all assertions\nin that microtheory are removed." );
    $list92 = ConsesLow.list( makeSymbol( "BOOLEANP" ) );
    $str93$Constant__S_is_merely_an_empty_sh = makeString( "Constant ~S is merely an empty shell, not part of the Knowledge Base" );
    $str94$Cannot_kill_core_constant__a___To = makeString( "Cannot kill core constant ~a.  To kill it, first unassert that it is an instance of #$CoreUnionConstant." );
    $kw95$RENAME = makeKeyword( "RENAME" );
    $sym96$FI_RENAME = makeSymbol( "FI-RENAME" );
    $list97 = ConsesLow.list( makeSymbol( "CONSTANT" ), makeSymbol( "NAME" ) );
    $str98$Change_name_of_CONSTANT_to_NAME__ = makeString( "Change name of CONSTANT to NAME. Return the constant if no error, otherwise return NIL." );
    $str99$Expected_a_constant__got__S = makeString( "Expected a constant, got ~S" );
    $kw100$ALREADY_HAS_NAME = makeKeyword( "ALREADY-HAS-NAME" );
    $str101$Constant__S_is_already_named__A = makeString( "Constant ~S is already named ~A" );
    $kw102$LOOKUP = makeKeyword( "LOOKUP" );
    $sym103$FI_LOOKUP = makeSymbol( "FI-LOOKUP" );
    $list104 = ConsesLow.list( makeSymbol( "FORMULA" ), makeSymbol( "MT" ) );
    $str105$Returns_two_values_when_looking_u = makeString(
        "Returns two values when looking up the EL FORMULA in the microtheory MT.  The\nfirst value returned is a list of HL formulas resulting from the canonicalization\nof the EL FORMULA.  The second value is T iff all the HL assertions were properly \nput into the KB." );
    $list106 = ConsesLow.list( ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "CONSP" ) ), makeSymbol( "BOOLEANP" ) );
    $str107$Expected_a_cons__got__S = makeString( "Expected a cons, got ~S" );
    $sym108$ASSERTION_FI_FORMULA = makeSymbol( "ASSERTION-FI-FORMULA" );
    $kw109$DEFAULT = makeKeyword( "DEFAULT" );
    $kw110$ASSERT = makeKeyword( "ASSERT" );
    $sym111$FI_ASSERT = makeSymbol( "FI-ASSERT" );
    $list112 = ConsesLow.list( makeSymbol( "FORMULA" ), makeSymbol( "MT" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "STRENGTH" ), makeKeyword( "DEFAULT" ) ), makeSymbol( "DIRECTION" ) );
    $str113$Assert_the_FORMULA_in_the_specifi = makeString(
        "Assert the FORMULA in the specified MT.  STRENGTH is :default or :monotonic.\nDIRECTION is :forward or :backward.  GAF assertion direction defaults to :forward, and rule\nassertion direction defaults to :backward. Return T if there was no error." );
    $str114$Expected__default_or__monotonic__ = makeString( "Expected :default or :monotonic, got ~S" );
    $str115$Expected_a_direction__got__S = makeString( "Expected a direction, got ~S" );
    $const116$True = constant_handles.reader_make_constant_shell( makeString( "True" ) );
    $kw117$TAUTOLOGY = makeKeyword( "TAUTOLOGY" );
    $str118$Formula______S___in__S_was_a_taut = makeString( "Formula ~%  ~S ~%in ~S was a tautology." );
    $const119$False = constant_handles.reader_make_constant_shell( makeString( "False" ) );
    $kw120$CONTRADICTION = makeKeyword( "CONTRADICTION" );
    $str121$Formula______S___in__S_was_a_cont = makeString( "Formula ~%  ~S ~%in ~S was a contradiction." );
    $list122 = ConsesLow.list( makeSymbol( "CNF" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "VARIABLE-MAP" ), makeSymbol( "QUERY-FREE-VARS" ) );
    $kw123$COULD_NOT_ASSERT = makeKeyword( "COULD-NOT-ASSERT" );
    $str124$Unable_to_assert_formula__S__in__ = makeString( "Unable to assert formula ~S~%in ~S." );
    $sym125$ASSERTED_ASSERTION_ = makeSymbol( "ASSERTED-ASSERTION?" );
    $sym126$FAST_SKOLEM_NAT_ = makeSymbol( "FAST-SKOLEM-NAT?" );
    $sym127$OPAQUE_ARG_WRT_QUOTING_NOT_COUNTING_LOGICAL_OPS_ = makeSymbol( "OPAQUE-ARG-WRT-QUOTING-NOT-COUNTING-LOGICAL-OPS?" );
    $const128$skolem = constant_handles.reader_make_constant_shell( makeString( "skolem" ) );
    $str129$Found_a___skolem_assertion_with_m = makeString( "Found a #$skolem assertion with more than one argument: ~s" );
    $str130$Found_a___skolem_assertion_with_a = makeString( "Found a #$skolem assertion with a non-deduced argument: ~s" );
    $sym131$KBEQ = makeSymbol( "KBEQ" );
    $str132$Defining_assertions_for__s___s__w = makeString( "Defining assertions for ~s~%~s~%were not all included in existing supports~%~s" );
    $list133 = ConsesLow.list( makeKeyword( "DIRECTION" ), makeKeyword( "FORWARD" ) );
    $sym134$CNF_P = makeSymbol( "CNF-P" );
    $kw135$BACKWARD = makeKeyword( "BACKWARD" );
    $kw136$FORWARD = makeKeyword( "FORWARD" );
    $kw137$FORMULA_NOT_WELL_FORMED = makeKeyword( "FORMULA-NOT-WELL-FORMED" );
    $str138$Formula______S___was_not_well_for = makeString( "Formula ~%  ~S ~%was not well formed because: ~%~a" );
    $str139$Formula______S___was_not_well_for = makeString( "Formula ~%  ~S ~%was not well formed" );
    $kw140$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw141$UNCHANGED = makeKeyword( "UNCHANGED" );
    $list142 = ConsesLow.list( makeKeyword( "REDUNDANT-LOCAL-ASSERTION" ) );
    $kw143$FLIPPED = makeKeyword( "FLIPPED" );
    $kw144$NEW = makeKeyword( "NEW" );
    $kw145$REASSERT = makeKeyword( "REASSERT" );
    $list146 = ConsesLow.list( makeKeyword( "INVALID-STRENGTH-CHANGE" ), makeString( "Attempt to change the strength of a deduced assertion from ~S to ~S" ), makeSymbol( "CURRENT-STRENGTH" ), makeSymbol( "STRENGTH" ) );
    $kw147$ASSERTION_NOT_PRESENT = makeKeyword( "ASSERTION-NOT-PRESENT" );
    $str148$Formula__S_in_mt__S_is_not_in_the = makeString( "Formula ~S in mt ~S is not in the KB" );
    $kw149$DENY = makeKeyword( "DENY" );
    $kw150$UNKNOWN = makeKeyword( "UNKNOWN" );
    $kw151$UNASSERT = makeKeyword( "UNASSERT" );
    $sym152$FI_UNASSERT = makeSymbol( "FI-UNASSERT" );
    $str153$Remove_the_assertions_canonicaliz = makeString( "Remove the assertions canonicalized from FORMULA in the microtheory MT.\nReturn T if the operation succeeded, otherwise return NIL." );
    $str154$Sentence______S___in__S_was_a_tau = makeString( "Sentence ~%  ~S ~%in ~S was a tautology." );
    $str155$Sentence______S___in__S_was_a_con = makeString( "Sentence ~%  ~S ~%in ~S was a contradiction." );
    $str156$Sentence__S_in_mt__S_is_not_in_th = makeString( "Sentence ~S in mt ~S is not in the KB" );
    $kw157$ASSERTION_NOT_LOCAL = makeKeyword( "ASSERTION-NOT-LOCAL" );
    $str158$Sentence__S_in_mt__S_is_not_local = makeString( "Sentence ~S in mt ~S is not locally in the KB" );
    $kw159$EDIT = makeKeyword( "EDIT" );
    $sym160$FI_EDIT = makeSymbol( "FI-EDIT" );
    $list161 = ConsesLow.list( makeSymbol( "OLD-FORMULA" ), makeSymbol( "NEW-FORMULA" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "OLD-MT" ), ConsesLow.list( makeSymbol( "NEW-MT" ), makeSymbol( "OLD-MT" ) ), ConsesLow
        .list( makeSymbol( "STRENGTH" ), makeKeyword( "DEFAULT" ) ), makeSymbol( "DIRECTION" ) );
    $str162$Unassert_the_assertions_canonical = makeString(
        "Unassert the assertions canonicalized from OLD-FORMULA in the microtheory OLD-MT.\n   Assert NEW-FORMULA in the specified NEW-MT.  \n   STRENGTH is :default or :monotonic.\n   DIRECTION is :forward or :backward.  \n    GAF assertion direction defaults to :forward.\n    Rule assertion direction defaults to :backward.\n   Return T if there was no error." );
    $kw163$JUSTIFY = makeKeyword( "JUSTIFY" );
    $list164 = ConsesLow.list( makeSymbol( "HL-MODULE" ), makeSymbol( "JUST-FORMULA" ), makeSymbol( "JUST-MT" ) );
    $sym165$ARGUMENT_TV = makeSymbol( "ARGUMENT-TV" );
    $kw166$ADD_ARGUMENT = makeKeyword( "ADD-ARGUMENT" );
    $str167$Expected_a_support__got__S = makeString( "Expected a support, got ~S" );
    $list168 = ConsesLow.list( makeKeyword( "FORWARD" ), makeKeyword( "BACKWARD" ) );
    $str169$Expected__forward_or__backward__g = makeString( "Expected :forward or :backward, got ~S" );
    $sym170$DEDUCTION_ASSERTION = makeSymbol( "DEDUCTION-ASSERTION" );
    $kw171$FALSE = makeKeyword( "FALSE" );
    $list172 = ConsesLow.list( makeSymbol( "HL-MODULE" ), makeSymbol( "FORMULA" ), makeSymbol( "MT" ), makeSymbol( "STRENGTH" ) );
    $kw173$SUPPORT_MALFORMED = makeKeyword( "SUPPORT-MALFORMED" );
    $str174$Support__S_was_malformed = makeString( "Support ~S was malformed" );
    $kw175$TRUE = makeKeyword( "TRUE" );
    $kw176$SUPPORT_INVALID = makeKeyword( "SUPPORT-INVALID" );
    $str177$Support__S_is_not_currently_valid = makeString( "Support ~S is not currently valid" );
    $kw178$REMOVE_ARGUMENT = makeKeyword( "REMOVE-ARGUMENT" );
    $sym179$RELEVANT_MT_IS_GENL_MT = makeSymbol( "RELEVANT-MT-IS-GENL-MT" );
    $kw180$BLAST = makeKeyword( "BLAST" );
    $sym181$FI_BLAST = makeSymbol( "FI-BLAST" );
    $str182$Remove_all_arguments_for_the_FORM = makeString(
        "Remove all arguments for the FORMULA within MT, including both those \narguments resulting the direct assertion of the FORMULA, and \nthose arguments supporting the FORMULA which were derived through inference.\nReturn T if successful, otherwise return NIL." );
    $kw183$ASK = makeKeyword( "ASK" );
    $sym184$FI_ASK = makeSymbol( "FI-ASK" );
    $list185 = ConsesLow.list( makeSymbol( "FORMULA" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "BACKCHAIN" ), makeSymbol( "NUMBER" ), makeSymbol( "TIME" ), makeSymbol( "DEPTH" ) );
    $str186$Ask_for_bindings_for_free_variabl = makeString(
        "Ask for bindings for free variables which will satisfy FORMULA within MT.\nIf BACKCHAIN is NIL, no inference is performed.\nIf BACKCHAIN is an integer, then at most that many backchaining steps using rules\nare performed.\nIf BACKCHAIN is T, then inference is performed without limit on the number of\nbackchaining steps when searching for bindings.\nIf NUMBER is an integer, then at most that number of bindings are returned.\nIf TIME is an integer, then at most TIME seconds are consumed by the search for\nbindings.\nIf DEPTH is an integer, then the inference paths are limited to that number of\ntotal steps.\nReturns NIL if the operation had an error.  Otherwise returns a list of variable/\nbinding pairs.  In the case where the FORMULA has no free variables, the form\n (((T . T))) is returned indicating that the gaf is either directly asserted in the\nKB, or that it can be derived via rules in the KB." );
    $list187 = ConsesLow.list( ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol( "LISTP" ) ) );
    $str188$Expected_a_formula__got__S = makeString( "Expected a formula, got ~S" );
    $list189 = ConsesLow.list( makeSymbol( "IST" ), makeSymbol( "IST-MT" ), makeSymbol( "IST-FORMULA" ) );
    $str190$Expected_an_integer__got__S = makeString( "Expected an integer, got ~S" );
    $const191$ist = constant_handles.reader_make_constant_shell( makeString( "ist" ) );
    $kw192$CONTINUE_LAST_ASK = makeKeyword( "CONTINUE-LAST-ASK" );
    $sym193$FI_CONTINUE_LAST_ASK = makeSymbol( "FI-CONTINUE-LAST-ASK" );
    $list194 = ConsesLow.list( makeSymbol( "CONTINUE-INFERENCE" ) );
    $list195 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "BACKCHAIN" ), makeSymbol( "NUMBER" ), makeSymbol( "TIME" ), makeSymbol( "DEPTH" ), makeSymbol( "RECONSIDER-DEEP" ) );
    $str196$Continue_the_last_ask_that_was_pe = makeString(
        "Continue the last ask that was performed with more resources.\nIf BACKCHAIN is NIL, no inference is performed.\nIf BACKCHAIN is an integer, then at most that many backchaining steps using rules\nare performed.\nIf BACKCHAIN is T, then inference is performed without limit on the number of\nbackchaining steps when searching for bindings.\nIf NUMBER is an integer, then at most that number of bindings are returned.\nIf TIME is an integer, then at most TIME seconds are consumed by the search for\nbindings.\nIf DEPTH is an integer, then the inference paths are limited to that number of\ntotal steps.\nReturns NIL if the operation had an error.  Otherwise returns a list of variable/\nbinding pairs.  In the case where the FORMULA has no free variables, the form\n (((T . T))) is returned indicating that the gaf is either directly asserted in the\nKB, or that it can be derived via rules in the KB." );
    $sym197$FI_CONTINUE_LAST_ASK_INT = makeSymbol( "FI-CONTINUE-LAST-ASK-INT" );
    $str198$fi_continue_last_ask_int_is_depre = makeString( "fi-continue-last-ask-int is deprecated; use CONTINUE-INFERENCE instead." );
    $str199$fi_ask_status_is_deprecated__use_ = makeString( "fi-ask-status is deprecated: use INFERENCE-SUSPEND-STATUS" );
    $sym200$FI_ASK_STATUS = makeSymbol( "FI-ASK-STATUS" );
    $list201 = ConsesLow.list( makeSymbol( "INFERENCE-SUSPEND-STATUS" ) );
    $str202$Return_a_status_as_to_how_the_las = makeString(
        "Return a status as to how the last ask successfully completed regarding\nresource limits.  \n:EXHAUST if the search spaces was exhausted.\n:DEPTH if the search space was limited because some nodes were too deep.\n:NUMBER if the requested number of bindings was found without exceeding other limits.\n:TIME if the time alloted expired prior to exhausting the search space.\nReturn NIL if there was no prior successful ask." );
    $sym203$FI_ASK_STATUS_INT = makeSymbol( "FI-ASK-STATUS-INT" );
    $str204$fi_ask_status_int_is_deprecated__ = makeString( "fi-ask-status-int is deprecated: use INFERENCE-SUSPEND-STATUS" );
    $kw205$TMS_RECONSIDER_FORMULA = makeKeyword( "TMS-RECONSIDER-FORMULA" );
    $sym206$FI_TMS_RECONSIDER_FORMULA = makeSymbol( "FI-TMS-RECONSIDER-FORMULA" );
    $str207$Reconsider_all_arguments_for_FORM = makeString( "Reconsider all arguments for FORMULA within MT.  Return T if the\noperation succeeded, NIL if there was an error." );
    $kw208$TMS_RECONSIDER_MT = makeKeyword( "TMS-RECONSIDER-MT" );
    $sym209$FI_TMS_RECONSIDER_MT = makeSymbol( "FI-TMS-RECONSIDER-MT" );
    $list210 = ConsesLow.list( makeSymbol( "MT" ) );
    $str211$Reconsider_all_arguments_for_all_ = makeString( "Reconsider all arguments for all formulas within MT.  Return T if the\noperation succeeded, NIL if there was an error." );
    $kw212$TMS_RECONSIDER_GAFS = makeKeyword( "TMS-RECONSIDER-GAFS" );
    $sym213$FI_TMS_RECONSIDER_GAFS = makeSymbol( "FI-TMS-RECONSIDER-GAFS" );
    $list214 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "ARG" ), makeSymbol( "PREDICATE" ), makeSymbol( "MT" ) );
    $str215$Reconsider_all_arguments_for_all_ = makeString(
        "Reconsider all arguments for all gaf formulas involving TERM.\nARG optionally constrains gafs such that the TERM occupies a specific arg position.\nPREDICATE optionally constrains gafs such that the specifed PREDICATE\noccupies the arg0 position.\nMT optionally constrains gafs such that they must be included in the specific\nmicrotheory. \nReturn T if the operation succeeded, NIL if there was an error." );
    $str216$Expected_an_integer_0_5__got__S = makeString( "Expected an integer 0-5, got ~S" );
    $kw217$TMS_RECONSIDER_TERM = makeKeyword( "TMS-RECONSIDER-TERM" );
    $sym218$FI_TMS_RECONSIDER_TERM = makeSymbol( "FI-TMS-RECONSIDER-TERM" );
    $list219 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) );
    $str220$Reconsider_all_arguments_involvin = makeString(
        "Reconsider all arguments involving TERM.  \nIf MT is provided, then only arguments in that microtheory are reconsidered.\nReturn T if the operation succeeded, NIL if there was an error." );
    $kw221$DENOTATION = makeKeyword( "DENOTATION" );
    $list222 = ConsesLow.list( makeKeyword( "ABBREVS" ), makeKeyword( "ACRONYMS" ) );
    $kw223$TIMESTAMP_CONSTANT = makeKeyword( "TIMESTAMP-CONSTANT" );
    $list224 = ConsesLow.list( makeKeyword( "INVALID-CYCLIST" ) );
    $list225 = ConsesLow.list( makeKeyword( "INVALID-TIME" ) );
    $list226 = ConsesLow.list( makeKeyword( "INVALID-PURPOSE" ) );
    $list227 = ConsesLow.list( makeKeyword( "INVALID-SECOND" ) );
    $list228 = ConsesLow.list( makeKeyword( "NO-CONSTANT" ) );
    $list229 = ConsesLow.list( makeKeyword( "ALREADY-TIMESTAMPED" ) );
    $sym230$CONSTANT_P = makeSymbol( "CONSTANT-P" );
    $const231$myCreator = constant_handles.reader_make_constant_shell( makeString( "myCreator" ) );
    $const232$myCreationTime = constant_handles.reader_make_constant_shell( makeString( "myCreationTime" ) );
    $const233$myCreationPurpose = constant_handles.reader_make_constant_shell( makeString( "myCreationPurpose" ) );
    $const234$myCreationSecond = constant_handles.reader_make_constant_shell( makeString( "myCreationSecond" ) );
    $kw235$STRENGTH = makeKeyword( "STRENGTH" );
    $kw236$DIRECTION = makeKeyword( "DIRECTION" );
    $const237$BookkeepingMt = constant_handles.reader_make_constant_shell( makeString( "BookkeepingMt" ) );
    $kw238$TIMESTAMP_ASSERTION = makeKeyword( "TIMESTAMP-ASSERTION" );
    $list239 = ConsesLow.list( makeKeyword( "NO-ASSERTIONS" ) );
    $kw240$REMOVE_TIMESTAMP = makeKeyword( "REMOVE-TIMESTAMP" );
    $kw241$RENAME_VARIABLES = makeKeyword( "RENAME-VARIABLES" );
    $list242 = ConsesLow.list( makeKeyword( "SIMPLE-VARIABLE-RENAME-IMPOSSIBLE" ) );
    $kw243$GET_PARAMETER = makeKeyword( "GET-PARAMETER" );
    $str244$Expected_a_symbol__got__S = makeString( "Expected a symbol, got ~S" );
    $kw245$UNBOUND = makeKeyword( "UNBOUND" );
    $str246$Parameter__S_is_not_bound = makeString( "Parameter ~S is not bound" );
    $kw247$SET_PARAMETER = makeKeyword( "SET-PARAMETER" );
    $kw248$EVAL = makeKeyword( "EVAL" );
    $kw249$LOCAL_EVAL = makeKeyword( "LOCAL-EVAL" );
    $kw250$HLMT_NOT_WELL_FORMED = makeKeyword( "HLMT-NOT-WELL-FORMED" );
    $str251$Microtheory__S____was_not_well_fo = makeString( "Microtheory ~S~%  was not well formed because: ~%~S" );
    $str252$Expected_a_microtheory__got__S = makeString( "Expected a microtheory, got ~S" );
    $str253$Expected_a_term__got__S = makeString( "Expected a term, got ~S" );
    $sym254$CAR = makeSymbol( "CAR" );
    $sym255$CDR = makeSymbol( "CDR" );
    $sym256$KB_VAR_LIST_ = makeSymbol( "KB-VAR-LIST?" );
    $kw257$TRUE_MON = makeKeyword( "TRUE-MON" );
    $kw258$TRUE_DEF = makeKeyword( "TRUE-DEF" );
    $kw259$FALSE_MON = makeKeyword( "FALSE-MON" );
    $kw260$FALSE_DEF = makeKeyword( "FALSE-DEF" );
    $sym261$CACHED_FI_CANONICALIZE_GAF = makeSymbol( "CACHED-FI-CANONICALIZE-GAF" );
    $sym262$_CACHED_FI_CANONICALIZE_GAF_CACHING_STATE_ = makeSymbol( "*CACHED-FI-CANONICALIZE-GAF-CACHING-STATE*" );
    $int263$100 = makeInteger( 100 );
    $list264 = ConsesLow.list( makeSymbol( "DNF" ), makeSymbol( "VARIABLES" ), makeSymbol( "FREE-VARIABLES" ) );
    $sym265$FIRST = makeSymbol( "FIRST" );
    $sym266$VARIABLE_P = makeSymbol( "VARIABLE-P" );
    $sym267$DEFAULT_EL_VAR_FOR_HL_VAR = makeSymbol( "DEFAULT-EL-VAR-FOR-HL-VAR" );
    $sym268$ASSERTION_FI_IST_FORMULA = makeSymbol( "ASSERTION-FI-IST-FORMULA" );
  }
}
/*
 * 
 * Total time: 3851 ms synthetic
 */
