package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class drt_drs
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.drt_drs";
  public static final String myFingerPrint = "443da16cffd43e75b1b0e29d7795f869c38e45228bd60e5cb0134914bd0f8d2e";
  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 1501L)
  public static SubLSymbol $drt_drs_quant_calls$;
  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 8393L)
  private static SubLSymbol $drt_put_available_rms_to_top_level_drs$;
  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 8544L)
  private static SubLSymbol $drt_quantproc_hint_fns$;
  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 9319L)
  private static SubLSymbol $drt_introduced_var_num_isg$;
  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 24866L)
  private static SubLSymbol $drt_possible_rm_coreferences_prev_drs_biases$;
  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 25170L)
  private static SubLSymbol $drt_possible_rm_coreferences_max_depth$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$DRS;
  private static final SubLSymbol $sym2$OBJECT;
  private static final SubLList $list3;
  private static final SubLSymbol $sym4$PARSING_MT;
  private static final SubLSymbol $sym5$INTERACTION_MT;
  private static final SubLSymbol $sym6$COMPLEX_CONDITIONS;
  private static final SubLSymbol $sym7$SIMPLE_CONDITIONS;
  private static final SubLSymbol $sym8$CYCL_FORMULAS;
  private static final SubLSymbol $sym9$SUB_DRSS;
  private static final SubLSymbol $sym10$SUPER_DRS;
  private static final SubLSymbol $sym11$NEXT_DRS;
  private static final SubLSymbol $sym12$PREV_DRS;
  private static final SubLSymbol $sym13$PRONOMIAL_RMS;
  private static final SubLSymbol $sym14$DEFINITE_RMS;
  private static final SubLSymbol $sym15$AVAILABLE_RMS;
  private static final SubLSymbol $sym16$RMS;
  private static final SubLSymbol $sym17$AUDIENCE;
  private static final SubLSymbol $sym18$SPEAKER;
  private static final SubLSymbol $sym19$INSTANCE_COUNT;
  private static final SubLSymbol $sym20$SUBLOOP_RESERVED_INITIALIZE_DRS_CLASS;
  private static final SubLSymbol $sym21$ISOLATED_P;
  private static final SubLSymbol $sym22$INSTANCE_NUMBER;
  private static final SubLSymbol $sym23$SUBLOOP_RESERVED_INITIALIZE_DRS_INSTANCE;
  private static final SubLSymbol $sym24$ADD_RM;
  private static final SubLList $list25;
  private static final SubLList $list26;
  private static final SubLSymbol $sym27$OUTER_CATCH_FOR_DRS_METHOD;
  private static final SubLSymbol $sym28$DRS_ADD_RM_METHOD;
  private static final SubLSymbol $sym29$ADD_AVAILABLE_RM;
  private static final SubLList $list30;
  private static final SubLSymbol $sym31$OUTER_CATCH_FOR_DRS_METHOD;
  private static final SubLSymbol $sym32$DRS_ADD_AVAILABLE_RM_METHOD;
  private static final SubLSymbol $sym33$ADD_DEFINITE_RM;
  private static final SubLList $list34;
  private static final SubLSymbol $sym35$OUTER_CATCH_FOR_DRS_METHOD;
  private static final SubLSymbol $sym36$DRS_ADD_DEFINITE_RM_METHOD;
  private static final SubLSymbol $sym37$ADD_PRONOMIAL_RM;
  private static final SubLList $list38;
  private static final SubLSymbol $sym39$OUTER_CATCH_FOR_DRS_METHOD;
  private static final SubLSymbol $sym40$DRS_ADD_PRONOMIAL_RM_METHOD;
  private static final SubLSymbol $sym41$NEW;
  private static final SubLString $str42$_______________________INITIAL_RM;
  private static final SubLString $str43$__;
  private static final SubLSymbol $sym44$FIND_RM_BY_TARGET;
  private static final SubLList $list45;
  private static final SubLSymbol $sym46$TYPE;
  private static final SubLSymbol $kw47$AVAILABLE;
  private static final SubLString $str48$_______________________INITIAL_DR;
  private static final SubLList $list49;
  private static final SubLObject $const50$EnglishLexiconMt;
  private static final SubLObject $const51$Quantifier;
  private static final SubLObject $const52$LogicalConnective;
  private static final SubLObject $const53$NLNegFn;
  private static final SubLObject $const54$explains_PropProp;
  private static final SubLSymbol $sym55$DRT_COMPLEX_FORMULA_ELEMENT;
  private static final SubLSymbol $sym56$PROCESS;
  private static final SubLList $list57;
  private static final SubLList $list58;
  private static final SubLObject $list59;
  private static final SubLString $str60$___drs_process_method__A_;
  private static final SubLString $str61$drt_process_drs__more_than_one_co;
  private static final SubLString $str62$1_a__quantifiers___;
  private static final SubLList $list63;
  private static final SubLString $str64$drt_process_drs__A__no_RM_found_f;
  private static final SubLSymbol $sym65$SCOPE;
  private static final SubLString $str66$_1________________modified_RM_;
  private static final SubLString $str67$_1_____________;
  private static final SubLString $str68$1_b__logical_connectives___;
  private static final SubLObject $const69$and;
  private static final SubLString $str70$1_c__quantproc__;
  private static final SubLString $str71$Attempting_reformulation_on_____A;
  private static final SubLSymbol $kw72$PARSING_MT;
  private static final SubLSymbol $kw73$INTERACTION_MT;
  private static final SubLString $str74$Attempting_reformulation_type__A_;
  private static final SubLString $str75$Using_reformulator_result_from__A;
  private static final SubLString $str76$failed_reformulation_on__A__new_c;
  private static final SubLString $str77$failed_reformulation_on__A__new_c;
  private static final SubLString $str78$DRT__A;
  private static final SubLList $list79;
  private static final SubLSymbol $sym80$TARGET_VAR;
  private static final SubLString $str81$___2________________modified_RM_;
  private static final SubLString $str82$_2_____________;
  private static final SubLObject $const83$forAll;
  private static final SubLString $str84$___3________________modified_RM_;
  private static final SubLString $str85$_3_____________;
  private static final SubLString $str86$1_d__subcollection_processing__;
  private static final SubLString $str87$1_e__simple_formulas__;
  private static final SubLSymbol $kw88$DEFINITE;
  private static final SubLSymbol $kw89$PRONOMIAL;
  private static final SubLSymbol $sym90$RM_P;
  private static final SubLString $str91$_______________________FINAL_DRS_;
  private static final SubLSymbol $sym92$FIND_ALL_POSSIBLE_RM_COREFERENCES;
  private static final SubLSymbol $sym93$DRS_PROCESS_METHOD;
  private static final SubLList $list94;
  private static final SubLSymbol $sym95$FIND_POSSIBLE_RM_COREFERENCES;
  private static final SubLSymbol $sym96$DRS_FIND_ALL_POSSIBLE_RM_COREFERENCES_METHOD;
  private static final SubLList $list97;
  private static final SubLList $list98;
  private static final SubLList $list99;
  private static final SubLSymbol $sym100$OUTER_CATCH_FOR_DRS_METHOD;
  private static final SubLSymbol $sym101$FORMULA;
  private static final SubLObject $const102$PronounFn;
  private static final SubLObject $const103$FirstPerson_NLAttr;
  private static final SubLObject $const104$Singular_NLAttr;
  private static final SubLObject $const105$Ungendered_NLAttr;
  private static final SubLObject $const106$SecondPerson_NLAttr;
  private static final SubLSymbol $sym107$COREFERENCE_PROBABILITY;
  private static final SubLFloat $float108$0_0;
  private static final SubLSymbol $sym109$DRS_FIND_POSSIBLE_RM_COREFERENCES_METHOD;
  private static final SubLList $list110;
  private static final SubLSymbol $sym111$ROOT_TERM;
  private static final SubLObject $const112$SubcollectionOfWithRelationToFn;
  private static final SubLObject $const113$SubcollectionOfWithRelationToType;
  private static final SubLObject $const114$SubcollectionOfWithRelationFromFn;
  private static final SubLObject $const115$SubcollectionOfWithRelationFromTy;
  private static final SubLList $list116;
  private static final SubLList $list117;
  private static final SubLSymbol $sym118$OUTER_CATCH_FOR_DRS_METHOD;
  private static final SubLSymbol $kw119$TERM;
  private static final SubLSymbol $sym120$TARGET_TERM;
  private static final SubLSymbol $kw121$VAR;
  private static final SubLSymbol $kw122$FORMULA;
  private static final SubLSymbol $kw123$ROOT;
  private static final SubLSymbol $sym124$DRS_RM_ROOT_TERM_METHOD;
  private static final SubLSymbol $sym125$MAPPED_FORMULA;
  private static final SubLSymbol $sym126$DRT_CORRESPONDING_TYPE_SUBCOL_FN_3;
  private static final SubLString $str127$find_rm_by_target___A_maps_to_mul;
  private static final SubLSymbol $sym128$DRS_FIND_RM_BY_TARGET_METHOD;
  private static final SubLObject $const129$isa;
  private static final SubLObject $const130$genls;
  private static final SubLSymbol $sym131$CONSTRUCT_CYCL;
  private static final SubLList $list132;
  private static final SubLSymbol $sym133$OUTER_CATCH_FOR_DRS_METHOD;
  private static final SubLString $str134$_______________________FINAL_CYCL;
  private static final SubLString $str135$_A__;
  private static final SubLSymbol $sym136$DRS_CONSTRUCT_CYCL_METHOD;

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 2527L)
  public static SubLObject drt_drs_quant_call_type(final SubLObject quant_call)
  {
    return quant_call.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 2667L)
  public static SubLObject drt_drs_quant_call_test(final SubLObject quant_call)
  {
    return conses_high.second( quant_call );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 2808L)
  public static SubLObject drt_drs_quant_call_fn(final SubLObject quant_call)
  {
    return conses_high.third( quant_call );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 2944L)
  public static SubLObject drt_drs_quant_call_mt(final SubLObject quant_call)
  {
    return conses_high.fourth( quant_call );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
  public static SubLObject get_drs_parsing_mt(final SubLObject drs)
  {
    return classes.subloop_get_access_protected_instance_slot( drs, FIFTEEN_INTEGER, $sym4$PARSING_MT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
  public static SubLObject set_drs_parsing_mt(final SubLObject drs, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( drs, value, FIFTEEN_INTEGER, $sym4$PARSING_MT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
  public static SubLObject get_drs_interaction_mt(final SubLObject drs)
  {
    return classes.subloop_get_access_protected_instance_slot( drs, FOURTEEN_INTEGER, $sym5$INTERACTION_MT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
  public static SubLObject set_drs_interaction_mt(final SubLObject drs, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( drs, value, FOURTEEN_INTEGER, $sym5$INTERACTION_MT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
  public static SubLObject get_drs_complex_conditions(final SubLObject drs)
  {
    return classes.subloop_get_access_protected_instance_slot( drs, THIRTEEN_INTEGER, $sym6$COMPLEX_CONDITIONS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
  public static SubLObject set_drs_complex_conditions(final SubLObject drs, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( drs, value, THIRTEEN_INTEGER, $sym6$COMPLEX_CONDITIONS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
  public static SubLObject get_drs_simple_conditions(final SubLObject drs)
  {
    return classes.subloop_get_access_protected_instance_slot( drs, TWELVE_INTEGER, $sym7$SIMPLE_CONDITIONS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
  public static SubLObject set_drs_simple_conditions(final SubLObject drs, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( drs, value, TWELVE_INTEGER, $sym7$SIMPLE_CONDITIONS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
  public static SubLObject get_drs_cycl_formulas(final SubLObject drs)
  {
    return classes.subloop_get_access_protected_instance_slot( drs, ELEVEN_INTEGER, $sym8$CYCL_FORMULAS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
  public static SubLObject set_drs_cycl_formulas(final SubLObject drs, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( drs, value, ELEVEN_INTEGER, $sym8$CYCL_FORMULAS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
  public static SubLObject get_drs_sub_drss(final SubLObject drs)
  {
    return classes.subloop_get_access_protected_instance_slot( drs, TEN_INTEGER, $sym9$SUB_DRSS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
  public static SubLObject set_drs_sub_drss(final SubLObject drs, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( drs, value, TEN_INTEGER, $sym9$SUB_DRSS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
  public static SubLObject get_drs_super_drs(final SubLObject drs)
  {
    return classes.subloop_get_access_protected_instance_slot( drs, NINE_INTEGER, $sym10$SUPER_DRS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
  public static SubLObject set_drs_super_drs(final SubLObject drs, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( drs, value, NINE_INTEGER, $sym10$SUPER_DRS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
  public static SubLObject get_drs_next_drs(final SubLObject drs)
  {
    return classes.subloop_get_access_protected_instance_slot( drs, EIGHT_INTEGER, $sym11$NEXT_DRS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
  public static SubLObject set_drs_next_drs(final SubLObject drs, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( drs, value, EIGHT_INTEGER, $sym11$NEXT_DRS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
  public static SubLObject get_drs_prev_drs(final SubLObject drs)
  {
    return classes.subloop_get_access_protected_instance_slot( drs, SEVEN_INTEGER, $sym12$PREV_DRS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
  public static SubLObject set_drs_prev_drs(final SubLObject drs, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( drs, value, SEVEN_INTEGER, $sym12$PREV_DRS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
  public static SubLObject get_drs_pronomial_rms(final SubLObject drs)
  {
    return classes.subloop_get_access_protected_instance_slot( drs, SIX_INTEGER, $sym13$PRONOMIAL_RMS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
  public static SubLObject set_drs_pronomial_rms(final SubLObject drs, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( drs, value, SIX_INTEGER, $sym13$PRONOMIAL_RMS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
  public static SubLObject get_drs_definite_rms(final SubLObject drs)
  {
    return classes.subloop_get_access_protected_instance_slot( drs, FIVE_INTEGER, $sym14$DEFINITE_RMS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
  public static SubLObject set_drs_definite_rms(final SubLObject drs, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( drs, value, FIVE_INTEGER, $sym14$DEFINITE_RMS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
  public static SubLObject get_drs_available_rms(final SubLObject drs)
  {
    return classes.subloop_get_access_protected_instance_slot( drs, FOUR_INTEGER, $sym15$AVAILABLE_RMS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
  public static SubLObject set_drs_available_rms(final SubLObject drs, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( drs, value, FOUR_INTEGER, $sym15$AVAILABLE_RMS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
  public static SubLObject get_drs_rms(final SubLObject drs)
  {
    return classes.subloop_get_access_protected_instance_slot( drs, THREE_INTEGER, $sym16$RMS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
  public static SubLObject set_drs_rms(final SubLObject drs, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( drs, value, THREE_INTEGER, $sym16$RMS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
  public static SubLObject get_drs_audience(final SubLObject drs)
  {
    return classes.subloop_get_access_protected_instance_slot( drs, TWO_INTEGER, $sym17$AUDIENCE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
  public static SubLObject set_drs_audience(final SubLObject drs, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( drs, value, TWO_INTEGER, $sym17$AUDIENCE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
  public static SubLObject get_drs_speaker(final SubLObject drs)
  {
    return classes.subloop_get_access_protected_instance_slot( drs, ONE_INTEGER, $sym18$SPEAKER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
  public static SubLObject set_drs_speaker(final SubLObject drs, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( drs, value, ONE_INTEGER, $sym18$SPEAKER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
  public static SubLObject subloop_reserved_initialize_drs_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym2$OBJECT, $sym19$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
  public static SubLObject subloop_reserved_initialize_drs_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym2$OBJECT, $sym21$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym2$OBJECT, $sym22$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$DRS, $sym18$SPEAKER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$DRS, $sym17$AUDIENCE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$DRS, $sym16$RMS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$DRS, $sym15$AVAILABLE_RMS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$DRS, $sym14$DEFINITE_RMS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$DRS, $sym13$PRONOMIAL_RMS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$DRS, $sym12$PREV_DRS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$DRS, $sym11$NEXT_DRS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$DRS, $sym10$SUPER_DRS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$DRS, $sym9$SUB_DRSS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$DRS, $sym8$CYCL_FORMULAS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$DRS, $sym7$SIMPLE_CONDITIONS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$DRS, $sym6$COMPLEX_CONDITIONS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$DRS, $sym5$INTERACTION_MT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$DRS, $sym4$PARSING_MT, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
  public static SubLObject drs_p(final SubLObject drs)
  {
    return classes.subloop_instanceof_class( drs, $sym1$DRS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 4882L)
  public static SubLObject drs_add_rm_method(final SubLObject self, final SubLObject new_rm)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_drs_method = NIL;
    SubLObject rms = get_drs_rms( self );
    try
    {
      thread.throwStack.push( $sym27$OUTER_CATCH_FOR_DRS_METHOD );
      try
      {
        if( NIL == subl_promotions.memberP( new_rm, rms, UNPROVIDED, UNPROVIDED ) )
        {
          rms = ConsesLow.cons( new_rm, rms );
        }
        Dynamic.sublisp_throw( $sym27$OUTER_CATCH_FOR_DRS_METHOD, rms );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_drs_rms( self, rms );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_drs_method = Errors.handleThrowable( ccatch_env_var, $sym27$OUTER_CATCH_FOR_DRS_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_drs_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 5088L)
  public static SubLObject drs_add_available_rm_method(final SubLObject self, final SubLObject new_rm)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_drs_method = NIL;
    SubLObject available_rms = get_drs_available_rms( self );
    try
    {
      thread.throwStack.push( $sym31$OUTER_CATCH_FOR_DRS_METHOD );
      try
      {
        if( NIL == subl_promotions.memberP( new_rm, available_rms, UNPROVIDED, UNPROVIDED ) )
        {
          available_rms = ConsesLow.cons( new_rm, available_rms );
        }
        Dynamic.sublisp_throw( $sym31$OUTER_CATCH_FOR_DRS_METHOD, available_rms );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_drs_available_rms( self, available_rms );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_drs_method = Errors.handleThrowable( ccatch_env_var, $sym31$OUTER_CATCH_FOR_DRS_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_drs_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 5262L)
  public static SubLObject drs_add_definite_rm_method(final SubLObject self, final SubLObject new_rm)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_drs_method = NIL;
    SubLObject definite_rms = get_drs_definite_rms( self );
    try
    {
      thread.throwStack.push( $sym35$OUTER_CATCH_FOR_DRS_METHOD );
      try
      {
        if( NIL == subl_promotions.memberP( new_rm, definite_rms, UNPROVIDED, UNPROVIDED ) )
        {
          definite_rms = ConsesLow.cons( new_rm, definite_rms );
        }
        Dynamic.sublisp_throw( $sym35$OUTER_CATCH_FOR_DRS_METHOD, definite_rms );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_drs_definite_rms( self, definite_rms );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_drs_method = Errors.handleThrowable( ccatch_env_var, $sym35$OUTER_CATCH_FOR_DRS_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_drs_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 5431L)
  public static SubLObject drs_add_pronomial_rm_method(final SubLObject self, final SubLObject new_rm)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_drs_method = NIL;
    SubLObject pronomial_rms = get_drs_pronomial_rms( self );
    try
    {
      thread.throwStack.push( $sym39$OUTER_CATCH_FOR_DRS_METHOD );
      try
      {
        if( NIL == subl_promotions.memberP( new_rm, pronomial_rms, UNPROVIDED, UNPROVIDED ) )
        {
          pronomial_rms = ConsesLow.cons( new_rm, pronomial_rms );
        }
        Dynamic.sublisp_throw( $sym39$OUTER_CATCH_FOR_DRS_METHOD, pronomial_rms );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_drs_pronomial_rms( self, pronomial_rms );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_drs_method = Errors.handleThrowable( ccatch_env_var, $sym39$OUTER_CATCH_FOR_DRS_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_drs_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 5605L)
  public static SubLObject create_drs_from_formula(SubLObject formula, final SubLObject interaction_mt, final SubLObject parsing_mt, SubLObject speaker, SubLObject audience)
  {
    if( speaker == UNPROVIDED )
    {
      speaker = NIL;
    }
    if( audience == UNPROVIDED )
    {
      audience = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject drs = methods.funcall_class_method_with_0_args( $sym1$DRS, $sym41$NEW );
    SubLObject rms = NIL;
    final SubLObject rm_formulas = drt_rm.drt_find_rm_formulas( formula );
    SubLObject rm_formula_to_rm_mappings = NIL;
    instances.set_slot( drs, $sym5$INTERACTION_MT, interaction_mt );
    instances.set_slot( drs, $sym4$PARSING_MT, parsing_mt );
    SubLObject cdolist_list_var = Sequences.nreverse( rm_formulas );
    SubLObject rm_formula = NIL;
    rm_formula = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject rm = drt_rm.create_rm_from_rm_formula( rm_formula, rm_formula_to_rm_mappings );
      rm_formula_to_rm_mappings = ConsesLow.cons( ConsesLow.list( rm_formula, rm ), rm_formula_to_rm_mappings );
      rms = ConsesLow.cons( rm, rms );
      cdolist_list_var = cdolist_list_var.rest();
      rm_formula = cdolist_list_var.first();
    }
    rms = Sequences.nreverse( rms );
    if( ( !drt.$drt_trace_level$.getDynamicValue( thread ).isNumber() || drt.$drt_trace_level$.getDynamicValue( thread ).numGE( TWO_INTEGER ) ) && NIL != rms )
    {
      PrintLow.format( T, $str42$_______________________INITIAL_RM );
    }
    cdolist_list_var = rms;
    SubLObject rm2 = NIL;
    rm2 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( !drt.$drt_trace_level$.getDynamicValue( thread ).isNumber() || drt.$drt_trace_level$.getDynamicValue( thread ).numGE( TWO_INTEGER ) )
      {
        object.describe_instance( rm2 );
        PrintLow.format( T, $str43$__ );
      }
      methods.funcall_instance_method_with_1_args( drs, $sym24$ADD_RM, rm2 );
      cdolist_list_var = cdolist_list_var.rest();
      rm2 = cdolist_list_var.first();
    }
    SubLObject new_formula = NIL;
    new_formula = reformulator_utilities_nl.reformulate_cycl_quantunify_3( formula, interaction_mt, UNPROVIDED );
    if( NIL != new_formula )
    {
      SubLObject cdolist_list_var2 = new_formula.rest();
      SubLObject formula_arg = NIL;
      formula_arg = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        final SubLObject possible_avail_rms = methods.funcall_instance_method_with_2_args( drs, $sym44$FIND_RM_BY_TARGET, formula_arg, $list45 );
        if( Sequences.length( possible_avail_rms ).eql( ONE_INTEGER ) )
        {
          final SubLObject avail_rm = possible_avail_rms.first();
          if( NIL != drt_rm.rm_p( avail_rm ) )
          {
            instances.set_slot( avail_rm, $sym46$TYPE, $kw47$AVAILABLE );
            methods.funcall_instance_method_with_1_args( drs, $sym29$ADD_AVAILABLE_RM, avail_rm );
          }
        }
        cdolist_list_var2 = cdolist_list_var2.rest();
        formula_arg = cdolist_list_var2.first();
      }
      formula = new_formula;
    }
    instances.set_slot( drs, $sym8$CYCL_FORMULAS, ConsesLow.list( formula ) );
    instances.set_slot( drs, $sym18$SPEAKER, speaker );
    instances.set_slot( drs, $sym17$AUDIENCE, audience );
    instances.set_slot( drs, $sym12$PREV_DRS, drt.drt_get_last_drs_for_speaker( speaker ) );
    drt.drt_set_last_drs_for_speaker( speaker, drs );
    cdolist_list_var = audience;
    SubLObject audience_member = NIL;
    audience_member = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      drt.drt_set_last_drs_for_speaker( audience_member, drs );
      cdolist_list_var = cdolist_list_var.rest();
      audience_member = cdolist_list_var.first();
    }
    drt.$drt_drs_list$.setDynamicValue( ConsesLow.cons( drs, drt.$drt_drs_list$.getDynamicValue( thread ) ), thread );
    if( !drt.$drt_trace_level$.getDynamicValue( thread ).isNumber() || drt.$drt_trace_level$.getDynamicValue( thread ).numGE( TWO_INTEGER ) )
    {
      PrintLow.format( T, $str48$_______________________INITIAL_DR );
      object.describe_instance( drs );
    }
    return drs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 8704L)
  public static SubLObject drt_quantproc_hint_fn_p(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const50$EnglishLexiconMt;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    return subl_promotions.memberP( fort, $drt_quantproc_hint_fns$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 8882L)
  public static SubLObject drt_complex_formula_element(final SubLObject elem)
  {
    return makeBoolean( NIL != forts.fort_p( elem ) && ( NIL != isa.isaP( elem, $const51$Quantifier, UNPROVIDED, UNPROVIDED ) || NIL != isa.isaP( elem, $const52$LogicalConnective, UNPROVIDED, UNPROVIDED ) || elem.eql(
        $const53$NLNegFn ) || elem.eql( $const54$explains_PropProp ) || NIL != drt_quantproc_hint_fn_p( elem, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 9159L)
  public static SubLObject drt_complex_formulaP(final SubLObject formula)
  {
    return list_utilities.tree_find_if( Symbols.symbol_function( $sym55$DRT_COMPLEX_FORMULA_ELEMENT ), formula, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 9403L)
  public static SubLObject drs_process_method(final SubLObject self, SubLObject carry_possible_rm_coreferences)
  {
    if( carry_possible_rm_coreferences == UNPROVIDED )
    {
      carry_possible_rm_coreferences = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject parsing_mt = get_drs_parsing_mt( self );
    final SubLObject interaction_mt = get_drs_interaction_mt( self );
    SubLObject complex_conditions = get_drs_complex_conditions( self );
    SubLObject simple_conditions = get_drs_simple_conditions( self );
    SubLObject cycl_formulas = get_drs_cycl_formulas( self );
    final SubLObject sub_drss = get_drs_sub_drss( self );
    final SubLObject super_drs = get_drs_super_drs( self );
    SubLObject pronomial_rms = get_drs_pronomial_rms( self );
    SubLObject definite_rms = get_drs_definite_rms( self );
    SubLObject available_rms = get_drs_available_rms( self );
    if( !drt.$drt_trace_level$.getDynamicValue( thread ).isNumber() || drt.$drt_trace_level$.getDynamicValue( thread ).numGE( FOUR_INTEGER ) )
    {
      PrintLow.format( T, $str60$___drs_process_method__A_, self );
      object.object_describe_instance_method( self, UNPROVIDED, UNPROVIDED );
      PrintLow.format( T, $str43$__ );
    }
    SubLObject simple_formulas = NIL;
    SubLObject complex_formulas = NIL;
    SubLObject cdolist_list_var = cycl_formulas;
    SubLObject cycl_formula = NIL;
    cycl_formula = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != drt_complex_formulaP( cycl_formula ) )
      {
        complex_formulas = ConsesLow.cons( cycl_formula, complex_formulas );
      }
      else
      {
        simple_formulas = ConsesLow.cons( cycl_formula, simple_formulas );
      }
      cdolist_list_var = cdolist_list_var.rest();
      cycl_formula = cdolist_list_var.first();
    }
    if( NIL != complex_formulas )
    {
      if( Sequences.length( complex_formulas ).numG( ONE_INTEGER ) && drt.$drt_trace_level$.getDynamicValue( thread ).numGE( ONE_INTEGER ) )
      {
        Errors.warn( $str61$drt_process_drs__more_than_one_co, self, complex_formulas );
      }
      final SubLObject complex_formula = complex_formulas.first();
      final SubLObject complex_formula_arg0 = cycl_utilities.formula_arg0( complex_formula );
      complex_formulas = complex_formulas.rest();
      cycl_formulas = instances.set_slot( self, $sym8$CYCL_FORMULAS, ConsesLow.append( complex_formulas, simple_formulas ) );
      if( NIL != isa.isaP( complex_formula_arg0, $const51$Quantifier, UNPROVIDED, UNPROVIDED ) )
      {
        if( ( !drt.$drt_trace_level$.getDynamicValue( thread ).isNumber() || drt.$drt_trace_level$.getDynamicValue( thread ).numGE( THREE_INTEGER ) ) && drt.$drt_trace_level$.getDynamicValue( thread ).numGE(
            ONE_INTEGER ) )
        {
          Errors.warn( $str62$1_a__quantifiers___ );
        }
        final SubLObject target_var = cycl_utilities.formula_arg1( complex_formula, UNPROVIDED );
        final SubLObject rm = methods.funcall_instance_method_with_2_args( self, $sym44$FIND_RM_BY_TARGET, target_var, $list63 ).first();
        if( NIL == rm && drt.$drt_trace_level$.getDynamicValue( thread ).numGE( ONE_INTEGER ) )
        {
          Errors.warn( $str64$drt_process_drs__A__no_RM_found_f, self, target_var, complex_formula );
        }
        if( NIL != rm )
        {
          if( NIL == instances.get_slot( rm, $sym65$SCOPE ) )
          {
            instances.set_slot( rm, $sym65$SCOPE, complex_formula_arg0 );
          }
          if( !drt.$drt_trace_level$.getDynamicValue( thread ).isNumber() || drt.$drt_trace_level$.getDynamicValue( thread ).numGE( FOUR_INTEGER ) )
          {
            PrintLow.format( T, $str66$_1________________modified_RM_ );
            object.describe_instance( rm );
            PrintLow.format( T, $str67$_1_____________ );
          }
        }
        complex_formulas = ConsesLow.cons( cycl_utilities.formula_arg2( complex_formula, UNPROVIDED ), complex_formulas );
        cycl_formulas = instances.set_slot( self, $sym8$CYCL_FORMULAS, ConsesLow.append( complex_formulas, simple_formulas ) );
      }
      else if( NIL != isa.isaP( complex_formula_arg0, $const52$LogicalConnective, UNPROVIDED, UNPROVIDED ) || complex_formula_arg0.eql( $const53$NLNegFn ) || complex_formula_arg0.eql( $const54$explains_PropProp ) )
      {
        if( ( !drt.$drt_trace_level$.getDynamicValue( thread ).isNumber() || drt.$drt_trace_level$.getDynamicValue( thread ).numGE( THREE_INTEGER ) ) && drt.$drt_trace_level$.getDynamicValue( thread ).numGE(
            ONE_INTEGER ) )
        {
          Errors.warn( $str68$1_b__logical_connectives___ );
        }
        SubLObject new_complex_condition = ConsesLow.list( complex_formula_arg0 );
        SubLObject subdrs_list = NIL;
        final SubLObject pcase_var = complex_formula_arg0;
        if( pcase_var.eql( $const69$and ) )
        {
          complex_formulas = ConsesLow.append( cycl_utilities.formula_args( complex_formula, UNPROVIDED ), complex_formulas );
          cycl_formulas = instances.set_slot( self, $sym8$CYCL_FORMULAS, ConsesLow.append( complex_formulas, simple_formulas ) );
        }
        else
        {
          SubLObject last_new_drs = NIL;
          SubLObject cdolist_list_var2;
          final SubLObject formula_args = cdolist_list_var2 = cycl_utilities.formula_args( complex_formula, UNPROVIDED );
          SubLObject formula_arg = NIL;
          formula_arg = cdolist_list_var2.first();
          while ( NIL != cdolist_list_var2)
          {
            if( formula_arg.isCons() )
            {
              final SubLObject subdrs = methods.funcall_class_method_with_0_args( $sym1$DRS, $sym41$NEW );
              instances.set_slot( subdrs, $sym5$INTERACTION_MT, interaction_mt );
              instances.set_slot( subdrs, $sym4$PARSING_MT, parsing_mt );
              instances.set_slot( subdrs, $sym8$CYCL_FORMULAS, ConsesLow.list( formula_arg ) );
              if( NIL != last_new_drs )
              {
                instances.set_slot( subdrs, $sym10$SUPER_DRS, last_new_drs );
                instances.set_slot( last_new_drs, $sym9$SUB_DRSS, ConsesLow.list( subdrs ) );
              }
              else
              {
                instances.set_slot( subdrs, $sym10$SUPER_DRS, self );
                instances.set_slot( self, $sym9$SUB_DRSS, ConsesLow.list( subdrs ) );
              }
              last_new_drs = subdrs;
              new_complex_condition = ConsesLow.cons( subdrs, new_complex_condition );
              subdrs_list = ConsesLow.cons( subdrs, subdrs_list );
            }
            else
            {
              new_complex_condition = ConsesLow.cons( formula_arg, new_complex_condition );
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            formula_arg = cdolist_list_var2.first();
          }
          new_complex_condition = Sequences.nreverse( new_complex_condition );
          complex_conditions = instances.set_slot( self, $sym6$COMPLEX_CONDITIONS, ConsesLow.cons( new_complex_condition, complex_conditions ) );
          cycl_formulas = instances.set_slot( self, $sym8$CYCL_FORMULAS, ConsesLow.append( complex_formulas, simple_formulas ) );
          SubLObject possible_rm_coreferences = NIL;
          SubLObject cdolist_list_var3 = subdrs_list;
          SubLObject subdrs2 = NIL;
          subdrs2 = cdolist_list_var3.first();
          while ( NIL != cdolist_list_var3)
          {
            final SubLObject sub_possible_rm_coreferences = methods.funcall_instance_method_with_0_args( subdrs2, $sym56$PROCESS );
            if( sub_possible_rm_coreferences == T )
            {
              return T;
            }
            possible_rm_coreferences = ConsesLow.append( sub_possible_rm_coreferences, possible_rm_coreferences );
            cdolist_list_var3 = cdolist_list_var3.rest();
            subdrs2 = cdolist_list_var3.first();
          }
          carry_possible_rm_coreferences = ConsesLow.append( carry_possible_rm_coreferences, possible_rm_coreferences );
        }
      }
      else
      {
        if( !drt.$drt_trace_level$.getDynamicValue( thread ).isNumber() || drt.$drt_trace_level$.getDynamicValue( thread ).numGE( THREE_INTEGER ) )
        {
          if( drt.$drt_trace_level$.getDynamicValue( thread ).numGE( ONE_INTEGER ) )
          {
            Errors.warn( $str70$1_c__quantproc__ );
          }
          PrintLow.format( T, $str71$Attempting_reformulation_on_____A, complex_formula );
        }
        SubLObject new_complex_formula = NIL;
        SubLObject doneP = NIL;
        if( NIL == doneP )
        {
          SubLObject csome_list_var = $drt_drs_quant_calls$.getDynamicValue( thread );
          SubLObject quant_call = NIL;
          quant_call = csome_list_var.first();
          while ( NIL == doneP && NIL != csome_list_var)
          {
            final SubLObject quant_call_type = drt_drs_quant_call_type( quant_call );
            final SubLObject quant_call_test = drt_drs_quant_call_test( quant_call );
            final SubLObject quant_call_fn = drt_drs_quant_call_fn( quant_call );
            final SubLObject pcase_var2;
            SubLObject quant_call_mt = pcase_var2 = drt_drs_quant_call_mt( quant_call );
            if( pcase_var2.eql( $kw72$PARSING_MT ) )
            {
              quant_call_mt = parsing_mt;
            }
            else if( pcase_var2.eql( $kw73$INTERACTION_MT ) )
            {
              quant_call_mt = interaction_mt;
            }
            else
            {
              quant_call_mt = interaction_mt;
            }
            if( !drt.$drt_trace_level$.getDynamicValue( thread ).isNumber() || drt.$drt_trace_level$.getDynamicValue( thread ).numGE( THREE_INTEGER ) )
            {
              PrintLow.format( T, $str74$Attempting_reformulation_type__A_, quant_call_type, quant_call_mt );
            }
            if( quant_call_test.isFunctionSpec() && NIL != Functions.funcall( quant_call_test, complex_formula ) && quant_call_fn.isFunctionSpec() )
            {
              new_complex_formula = Functions.funcall( quant_call_fn, complex_formula, quant_call_mt );
            }
            if( NIL != new_complex_formula && !new_complex_formula.equal( complex_formula ) )
            {
              if( !drt.$drt_trace_level$.getDynamicValue( thread ).isNumber() || drt.$drt_trace_level$.getDynamicValue( thread ).numGE( THREE_INTEGER ) )
              {
                PrintLow.format( T, $str75$Using_reformulator_result_from__A, quant_call_type, new_complex_formula );
              }
              doneP = T;
            }
            csome_list_var = csome_list_var.rest();
            quant_call = csome_list_var.first();
          }
        }
        if( NIL == new_complex_formula )
        {
          if( drt.$drt_trace_level$.getDynamicValue( thread ).numGE( ONE_INTEGER ) )
          {
            Errors.warn( $str76$failed_reformulation_on__A__new_c, complex_formula );
          }
          return T;
        }
        if( new_complex_formula.equal( complex_formula ) )
        {
          if( drt.$drt_trace_level$.getDynamicValue( thread ).numGE( ONE_INTEGER ) )
          {
            Errors.warn( $str77$failed_reformulation_on__A__new_c, complex_formula );
          }
          return T;
        }
        final SubLObject new_complex_formula_arg0 = cycl_utilities.formula_arg0( new_complex_formula );
        if( NIL != isa.isaP( new_complex_formula_arg0, $const51$Quantifier, UNPROVIDED, UNPROVIDED ) )
        {
          SubLObject introduced_var = cycl_utilities.formula_arg1( new_complex_formula, UNPROVIDED );
          final SubLObject unique_var = cycl_variables.make_el_var( PrintLow.format( NIL, $str78$DRT__A, integer_sequence_generator.integer_sequence_generator_next( $drt_introduced_var_num_isg$.getGlobalValue() ) ) );
          if( NIL != cycl_variables.el_varP( introduced_var ) )
          {
            new_complex_formula = list_utilities.tree_substitute( new_complex_formula, introduced_var, unique_var );
          }
          complex_formulas = ConsesLow.cons( new_complex_formula, complex_formulas );
          cycl_formulas = instances.set_slot( self, $sym8$CYCL_FORMULAS, ConsesLow.append( complex_formulas, simple_formulas ) );
          introduced_var = cycl_utilities.formula_arg1( new_complex_formula, UNPROVIDED );
          final SubLObject subformula = cycl_utilities.formula_arg2( new_complex_formula, UNPROVIDED );
          final SubLObject target_terms = find_terms_for_var_in_formula( introduced_var, subformula );
          SubLObject rm2 = NIL;
          SubLObject doneP2 = NIL;
          SubLObject done2P = NIL;
          if( NIL == doneP2 )
          {
            SubLObject csome_list_var2 = target_terms;
            SubLObject target_term = NIL;
            target_term = csome_list_var2.first();
            while ( NIL == doneP2 && NIL != csome_list_var2)
            {
              final SubLObject poss_rms = methods.funcall_instance_method_with_2_args( self, $sym44$FIND_RM_BY_TARGET, target_term, $list79 );
              if( NIL == done2P )
              {
                SubLObject csome_list_var_$1 = poss_rms;
                SubLObject poss_rm = NIL;
                poss_rm = csome_list_var_$1.first();
                while ( NIL == done2P && NIL != csome_list_var_$1)
                {
                  if( NIL != drt_rm.rm_p( poss_rm ) && NIL == instances.get_slot( poss_rm, $sym80$TARGET_VAR ) )
                  {
                    rm2 = poss_rm;
                    doneP2 = T;
                    done2P = T;
                  }
                  csome_list_var_$1 = csome_list_var_$1.rest();
                  poss_rm = csome_list_var_$1.first();
                }
              }
              csome_list_var2 = csome_list_var2.rest();
              target_term = csome_list_var2.first();
            }
          }
          if( NIL != drt_rm.rm_p( rm2 ) )
          {
            instances.set_slot( rm2, $sym80$TARGET_VAR, introduced_var );
            instances.set_slot( rm2, $sym65$SCOPE, new_complex_formula_arg0 );
            if( !drt.$drt_trace_level$.getDynamicValue( thread ).isNumber() || drt.$drt_trace_level$.getDynamicValue( thread ).numGE( FOUR_INTEGER ) )
            {
              PrintLow.format( T, $str81$___2________________modified_RM_ );
              object.describe_instance( rm2 );
              PrintLow.format( T, $str82$_2_____________ );
            }
          }
        }
        else if( NIL != isa.isaP( new_complex_formula_arg0, $const52$LogicalConnective, UNPROVIDED, UNPROVIDED ) )
        {
          SubLObject introduced_var = conses_high.second( conses_high.second( new_complex_formula ) );
          final SubLObject unique_var = cycl_variables.make_el_var( PrintLow.format( NIL, $str78$DRT__A, integer_sequence_generator.integer_sequence_generator_next( $drt_introduced_var_num_isg$.getGlobalValue() ) ) );
          if( NIL != cycl_variables.el_varP( introduced_var ) )
          {
            new_complex_formula = list_utilities.tree_substitute( new_complex_formula, introduced_var, unique_var );
          }
          complex_formulas = ConsesLow.cons( new_complex_formula, complex_formulas );
          cycl_formulas = instances.set_slot( self, $sym8$CYCL_FORMULAS, ConsesLow.append( complex_formulas, simple_formulas ) );
          introduced_var = conses_high.second( conses_high.second( new_complex_formula ) );
          final SubLObject target_term2 = conses_high.third( conses_high.second( new_complex_formula ) );
          final SubLObject poss_rms2 = methods.funcall_instance_method_with_2_args( self, $sym44$FIND_RM_BY_TARGET, target_term2, $list45 );
          SubLObject rm2 = NIL;
          SubLObject doneP2 = NIL;
          if( NIL == doneP2 )
          {
            SubLObject csome_list_var3 = poss_rms2;
            SubLObject poss_rm2 = NIL;
            poss_rm2 = csome_list_var3.first();
            while ( NIL == doneP2 && NIL != csome_list_var3)
            {
              if( NIL != drt_rm.rm_p( poss_rm2 ) && NIL == instances.get_slot( poss_rm2, $sym80$TARGET_VAR ) )
              {
                rm2 = poss_rm2;
                doneP2 = T;
              }
              csome_list_var3 = csome_list_var3.rest();
              poss_rm2 = csome_list_var3.first();
            }
          }
          instances.set_slot( rm2, $sym80$TARGET_VAR, introduced_var );
          instances.set_slot( rm2, $sym65$SCOPE, $const83$forAll );
          if( !drt.$drt_trace_level$.getDynamicValue( thread ).isNumber() || drt.$drt_trace_level$.getDynamicValue( thread ).numGE( FOUR_INTEGER ) )
          {
            PrintLow.format( T, $str84$___3________________modified_RM_ );
            object.describe_instance( rm2 );
            PrintLow.format( T, $str85$_3_____________ );
          }
        }
        else
        {
          complex_formulas = ConsesLow.cons( new_complex_formula, complex_formulas );
          cycl_formulas = instances.set_slot( self, $sym8$CYCL_FORMULAS, ConsesLow.append( complex_formulas, simple_formulas ) );
        }
      }
    }
    if( NIL != simple_formulas )
    {
      if( ( !drt.$drt_trace_level$.getDynamicValue( thread ).isNumber() || drt.$drt_trace_level$.getDynamicValue( thread ).numGE( THREE_INTEGER ) ) && drt.$drt_trace_level$.getDynamicValue( thread ).numGE(
          ONE_INTEGER ) )
      {
        Errors.warn( $str86$1_d__subcollection_processing__ );
      }
      SubLObject new_simple_formulas = NIL;
      SubLObject new_complex_formulas = complex_formulas;
      SubLObject cdolist_list_var4 = simple_formulas;
      SubLObject simple_formula = NIL;
      simple_formula = cdolist_list_var4.first();
      while ( NIL != cdolist_list_var4)
      {
        final SubLObject poss_new_formula = reformulator_utilities_nl.reformulate_cycl_subcollproc( simple_formula, interaction_mt, UNPROVIDED );
        if( NIL == poss_new_formula || poss_new_formula.equal( simple_formula ) )
        {
          new_simple_formulas = ConsesLow.cons( simple_formula, new_simple_formulas );
        }
        else
        {
          new_complex_formulas = ConsesLow.cons( poss_new_formula, new_complex_formulas );
        }
        cdolist_list_var4 = cdolist_list_var4.rest();
        simple_formula = cdolist_list_var4.first();
      }
      simple_formulas = new_simple_formulas;
      complex_formulas = new_complex_formulas;
      cycl_formulas = instances.set_slot( self, $sym8$CYCL_FORMULAS, ConsesLow.append( complex_formulas, simple_formulas ) );
    }
    if( NIL != simple_formulas )
    {
      if( ( !drt.$drt_trace_level$.getDynamicValue( thread ).isNumber() || drt.$drt_trace_level$.getDynamicValue( thread ).numGE( THREE_INTEGER ) ) && drt.$drt_trace_level$.getDynamicValue( thread ).numGE(
          ONE_INTEGER ) )
      {
        Errors.warn( $str87$1_e__simple_formulas__ );
      }
      cdolist_list_var = simple_formulas;
      SubLObject simple_formula2 = NIL;
      simple_formula2 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject simple_condition = drt_drs_map_add_rms_to_formula( self, simple_formula2 );
        SubLObject cdolist_list_var_$2 = list_utilities.tree_find_all_if( Symbols.symbol_function( $sym90$RM_P ), simple_condition, UNPROVIDED );
        SubLObject rm3 = NIL;
        rm3 = cdolist_list_var_$2.first();
        while ( NIL != cdolist_list_var_$2)
        {
          final SubLObject pcase_var3 = instances.get_slot( rm3, $sym46$TYPE );
          if( pcase_var3.eql( $kw88$DEFINITE ) )
          {
            definite_rms = methods.funcall_instance_method_with_1_args( self, $sym33$ADD_DEFINITE_RM, rm3 );
          }
          else if( pcase_var3.eql( $kw89$PRONOMIAL ) )
          {
            pronomial_rms = methods.funcall_instance_method_with_1_args( self, $sym37$ADD_PRONOMIAL_RM, rm3 );
          }
          else
          {
            available_rms = methods.funcall_instance_method_with_1_args( self, $sym29$ADD_AVAILABLE_RM, rm3 );
          }
          cdolist_list_var_$2 = cdolist_list_var_$2.rest();
          rm3 = cdolist_list_var_$2.first();
        }
        simple_conditions = instances.set_slot( self, $sym7$SIMPLE_CONDITIONS, ConsesLow.cons( simple_condition, simple_conditions ) );
        cdolist_list_var = cdolist_list_var.rest();
        simple_formula2 = cdolist_list_var.first();
      }
      simple_formulas = NIL;
      cycl_formulas = instances.set_slot( self, $sym8$CYCL_FORMULAS, complex_formulas );
    }
    if( ( !drt.$drt_trace_level$.getDynamicValue( thread ).isNumber() || drt.$drt_trace_level$.getDynamicValue( thread ).numGE( TWO_INTEGER ) ) && NIL == cycl_formulas )
    {
      PrintLow.format( T, $str91$_______________________FINAL_DRS_ );
      object.object_describe_instance_method( self, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != cycl_formulas )
    {
      return methods.funcall_instance_method_with_1_args( self, $sym56$PROCESS, carry_possible_rm_coreferences );
    }
    return methods.funcall_instance_method_with_0_args( self, $sym92$FIND_ALL_POSSIBLE_RM_COREFERENCES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 23259L)
  public static SubLObject drs_find_all_possible_rm_coreferences_method(final SubLObject self)
  {
    final SubLObject sub_drss = get_drs_sub_drss( self );
    final SubLObject pronomial_rms = get_drs_pronomial_rms( self );
    SubLObject result = NIL;
    if( NIL != sub_drss )
    {
      SubLObject cdolist_list_var = sub_drss;
      SubLObject sub_drs = NIL;
      sub_drs = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        result = ConsesLow.append( new SubLObject[] { methods.funcall_instance_method_with_0_args( sub_drs, $sym92$FIND_ALL_POSSIBLE_RM_COREFERENCES )
        } );
        cdolist_list_var = cdolist_list_var.rest();
        sub_drs = cdolist_list_var.first();
      }
    }
    if( NIL != pronomial_rms )
    {
      SubLObject cdolist_list_var = pronomial_rms;
      SubLObject pronomial_rm = NIL;
      pronomial_rm = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject possible_rm_coreferences = methods.funcall_instance_method_with_1_args( self, $sym95$FIND_POSSIBLE_RM_COREFERENCES, pronomial_rm );
        if( NIL != possible_rm_coreferences )
        {
          result = ConsesLow.cons( ConsesLow.list( pronomial_rm, possible_rm_coreferences ), result );
        }
        cdolist_list_var = cdolist_list_var.rest();
        pronomial_rm = cdolist_list_var.first();
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 24279L)
  public static SubLObject possible_rm_coreference_source_rm(final SubLObject possible_rm_coreference)
  {
    return possible_rm_coreference.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 24478L)
  public static SubLObject possible_rm_coreference_targets(final SubLObject possible_rm_coreference)
  {
    return conses_high.second( possible_rm_coreference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 24594L)
  public static SubLObject possible_rm_coreference_target_rm(final SubLObject possible_rm_coreference_target)
  {
    return possible_rm_coreference_target.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 24725L)
  public static SubLObject possible_rm_coreference_target_probability(final SubLObject possible_rm_coreference_target)
  {
    return conses_high.second( possible_rm_coreference_target );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 25373L)
  public static SubLObject drs_find_possible_rm_coreferences_method(final SubLObject self, final SubLObject rm, SubLObject depth, SubLObject cutoff)
  {
    if( depth == UNPROVIDED )
    {
      depth = $drt_possible_rm_coreferences_max_depth$.getDynamicValue();
    }
    if( cutoff == UNPROVIDED )
    {
      cutoff = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_drs_method = NIL;
    final SubLObject super_drs = get_drs_super_drs( self );
    final SubLObject prev_drs = get_drs_prev_drs( self );
    final SubLObject definite_rms = get_drs_definite_rms( self );
    final SubLObject available_rms = get_drs_available_rms( self );
    final SubLObject audience = get_drs_audience( self );
    final SubLObject speaker = get_drs_speaker( self );
    try
    {
      thread.throwStack.push( $sym100$OUTER_CATCH_FOR_DRS_METHOD );
      try
      {
        SubLObject possible_rm_coreference_value_pairs = NIL;
        final SubLObject rm_formula = instances.get_slot( rm, $sym101$FORMULA );
        if( cycl_utilities.formula_arg0( rm_formula ).eql( $const102$PronounFn ) )
        {
          if( cycl_utilities.formula_arg1( rm_formula, UNPROVIDED ).eql( $const103$FirstPerson_NLAttr ) && cycl_utilities.formula_arg2( rm_formula, UNPROVIDED ).eql( $const104$Singular_NLAttr ) && cycl_utilities
              .formula_arg3( rm_formula, UNPROVIDED ).eql( $const105$Ungendered_NLAttr ) && NIL != forts.fort_p( speaker ) )
          {
            possible_rm_coreference_value_pairs = ConsesLow.cons( reader.bq_cons( speaker, $list97 ), possible_rm_coreference_value_pairs );
          }
          else if( cycl_utilities.formula_arg1( rm_formula, UNPROVIDED ).eql( $const106$SecondPerson_NLAttr ) && cycl_utilities.formula_arg2( rm_formula, UNPROVIDED ).eql( $const104$Singular_NLAttr ) && cycl_utilities
              .formula_arg3( rm_formula, UNPROVIDED ).eql( $const105$Ungendered_NLAttr ) )
          {
            SubLObject cdolist_list_var = audience;
            SubLObject audience_member = NIL;
            audience_member = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              possible_rm_coreference_value_pairs = ConsesLow.cons( reader.bq_cons( audience_member, $list97 ), possible_rm_coreference_value_pairs );
              cdolist_list_var = cdolist_list_var.rest();
              audience_member = cdolist_list_var.first();
            }
          }
        }
        SubLObject cdolist_list_var = available_rms;
        SubLObject available_rm = NIL;
        available_rm = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          possible_rm_coreference_value_pairs = ConsesLow.cons( ConsesLow.list( available_rm, methods.funcall_instance_method_with_1_args( rm, $sym107$COREFERENCE_PROBABILITY, available_rm ) ),
              possible_rm_coreference_value_pairs );
          cdolist_list_var = cdolist_list_var.rest();
          available_rm = cdolist_list_var.first();
        }
        cdolist_list_var = definite_rms;
        SubLObject definite_rm = NIL;
        definite_rm = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          possible_rm_coreference_value_pairs = ConsesLow.cons( ConsesLow.list( definite_rm, methods.funcall_instance_method_with_1_args( rm, $sym107$COREFERENCE_PROBABILITY, definite_rm ) ),
              possible_rm_coreference_value_pairs );
          cdolist_list_var = cdolist_list_var.rest();
          definite_rm = cdolist_list_var.first();
        }
        SubLObject back_drs = NIL;
        if( NIL != super_drs )
        {
          back_drs = super_drs;
        }
        else if( NIL != prev_drs && depth.numG( ZERO_INTEGER ) )
        {
          depth = Numbers.subtract( depth, ONE_INTEGER );
          back_drs = prev_drs;
        }
        if( NIL != back_drs )
        {
          SubLObject cdolist_list_var2;
          final SubLObject more_possible_rm_coreference_value_pairs = cdolist_list_var2 = methods.funcall_instance_method_with_2_args( back_drs, $sym95$FIND_POSSIBLE_RM_COREFERENCES, rm, depth );
          SubLObject more_possible_rm_coreference_value_pair = NIL;
          more_possible_rm_coreference_value_pair = cdolist_list_var2.first();
          while ( NIL != cdolist_list_var2)
          {
            final SubLObject possible_rm = more_possible_rm_coreference_value_pair.first();
            final SubLObject possible_rm_value = conses_high.second( more_possible_rm_coreference_value_pair );
            SubLObject depth_bias = ConsesLow.nth( depth, $drt_possible_rm_coreferences_prev_drs_biases$.getDynamicValue( thread ) );
            if( NIL == depth_bias )
            {
              depth_bias = $float108$0_0;
            }
            possible_rm_coreference_value_pairs = ConsesLow.cons( ConsesLow.list( possible_rm, Numbers.multiply( possible_rm_value, depth_bias ) ), possible_rm_coreference_value_pairs );
            cdolist_list_var2 = cdolist_list_var2.rest();
            more_possible_rm_coreference_value_pair = cdolist_list_var2.first();
          }
        }
        Dynamic.sublisp_throw( $sym100$OUTER_CATCH_FOR_DRS_METHOD, possible_rm_coreference_value_pairs );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_drs_super_drs( self, super_drs );
          set_drs_prev_drs( self, prev_drs );
          set_drs_definite_rms( self, definite_rms );
          set_drs_available_rms( self, available_rms );
          set_drs_audience( self, audience );
          set_drs_speaker( self, speaker );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_drs_method = Errors.handleThrowable( ccatch_env_var, $sym100$OUTER_CATCH_FOR_DRS_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_drs_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 27726L)
  public static SubLObject drt_drs_map_add_rms_to_formula(final SubLObject drs, final SubLObject formula)
  {
    final SubLObject poss_rm = methods.funcall_instance_method_with_2_args( drs, $sym44$FIND_RM_BY_TARGET, formula, $list110 ).first();
    if( NIL != drt_rm.rm_p( poss_rm ) )
    {
      return poss_rm;
    }
    if( formula.isCons() )
    {
      SubLObject new_formula = NIL;
      SubLObject cdolist_list_var = formula;
      SubLObject formula_arg = NIL;
      formula_arg = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        new_formula = ConsesLow.cons( drt_drs_map_add_rms_to_formula( drs, formula_arg ), new_formula );
        cdolist_list_var = cdolist_list_var.rest();
        formula_arg = cdolist_list_var.first();
      }
      return Sequences.nreverse( new_formula );
    }
    return formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 28302L)
  public static SubLObject drs_rm_root_term_method(final SubLObject rm)
  {
    return instances.get_slot( rm, $sym111$ROOT_TERM );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 28405L)
  public static SubLObject drt_corresponding_type_subcol_fn_3(final SubLObject instance_subcol_fn)
  {
    if( instance_subcol_fn.eql( $const112$SubcollectionOfWithRelationToFn ) )
    {
      return $const113$SubcollectionOfWithRelationToType;
    }
    if( instance_subcol_fn.eql( $const114$SubcollectionOfWithRelationFromFn ) )
    {
      return $const115$SubcollectionOfWithRelationFromTy;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 28715L)
  public static SubLObject drs_find_rm_by_target_method(final SubLObject self, final SubLObject target, final SubLObject target_type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_drs_method = NIL;
    final SubLObject cycl_formulas = get_drs_cycl_formulas( self );
    final SubLObject super_drs = get_drs_super_drs( self );
    final SubLObject rms = get_drs_rms( self );
    try
    {
      thread.throwStack.push( $sym118$OUTER_CATCH_FOR_DRS_METHOD );
      try
      {
        SubLObject rm_results = NIL;
        SubLObject cdolist_list_var = rms;
        SubLObject rm = NIL;
        rm = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != subl_promotions.memberP( $kw119$TERM, target_type, UNPROVIDED, UNPROVIDED ) && NIL != czer_utilities.equals_elP( target, drt_formula_construct_cycl( instances.get_slot( rm, $sym120$TARGET_TERM ) ),
              UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
          {
            rm_results = ConsesLow.cons( rm, rm_results );
          }
          if( NIL != subl_promotions.memberP( $kw121$VAR, target_type, UNPROVIDED, UNPROVIDED ) && target.equal( drt_formula_construct_cycl( instances.get_slot( rm, $sym80$TARGET_VAR ) ) ) )
          {
            rm_results = ConsesLow.cons( rm, rm_results );
          }
          if( NIL != subl_promotions.memberP( $kw122$FORMULA, target_type, UNPROVIDED, UNPROVIDED ) && target.equal( drt_formula_construct_cycl( instances.get_slot( rm, $sym101$FORMULA ) ) ) )
          {
            rm_results = ConsesLow.cons( rm, rm_results );
          }
          if( NIL != subl_promotions.memberP( $kw123$ROOT, target_type, UNPROVIDED, UNPROVIDED ) && NIL != czer_utilities.equals_elP( target, drt_formula_construct_cycl( instances.get_slot( rm, $sym111$ROOT_TERM ) ),
              UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
          {
            rm_results = ConsesLow.cons( rm, rm_results );
          }
          if( NIL == rm_results && NIL != conses_high.member( $kw122$FORMULA, target_type, UNPROVIDED, UNPROVIDED ) && NIL != conses_high.member( $kw123$ROOT, target_type, UNPROVIDED, UNPROVIDED ) )
          {
            final SubLObject rm_unmapped_formula = list_utilities.tree_gather_transformations( Symbols.symbol_function( $sym124$DRS_RM_ROOT_TERM_METHOD ), conses_high.copy_tree( instances.get_slot( rm,
                $sym125$MAPPED_FORMULA ) ), Symbols.symbol_function( $sym90$RM_P ), UNPROVIDED, UNPROVIDED );
            if( NIL != czer_utilities.equals_elP( list_utilities.tree_gather_transformations( Symbols.symbol_function( $sym126$DRT_CORRESPONDING_TYPE_SUBCOL_FN_3 ), target, Symbols.symbol_function(
                $sym126$DRT_CORRESPONDING_TYPE_SUBCOL_FN_3 ), UNPROVIDED, UNPROVIDED ), list_utilities.tree_gather_transformations( Symbols.symbol_function( $sym126$DRT_CORRESPONDING_TYPE_SUBCOL_FN_3 ),
                    rm_unmapped_formula, Symbols.symbol_function( $sym126$DRT_CORRESPONDING_TYPE_SUBCOL_FN_3 ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
            {
              rm_results = ConsesLow.cons( rm, rm_results );
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          rm = cdolist_list_var.first();
        }
        if( NIL == rm_results && NIL != super_drs )
        {
          rm_results = methods.funcall_instance_method_with_2_args( super_drs, $sym44$FIND_RM_BY_TARGET, target, target_type );
        }
        if( Sequences.length( rm_results ).numG( ONE_INTEGER ) )
        {
          SubLObject new_rm_results = NIL;
          SubLObject cdolist_list_var2 = rm_results;
          SubLObject rm_result = NIL;
          rm_result = cdolist_list_var2.first();
          while ( NIL != cdolist_list_var2)
          {
            if( NIL == list_utilities.tree_find( instances.get_slot( rm_result, $sym101$FORMULA ), cycl_formulas, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
            {
              new_rm_results = ConsesLow.cons( rm_result, new_rm_results );
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            rm_result = cdolist_list_var2.first();
          }
          if( NIL != new_rm_results )
          {
            rm_results = new_rm_results;
          }
          if( Sequences.length( rm_results ).numG( ONE_INTEGER ) && ( !drt.$drt_trace_level$.getDynamicValue( thread ).isNumber() || drt.$drt_trace_level$.getDynamicValue( thread ).numGE( FOUR_INTEGER ) )
              && drt.$drt_trace_level$.getDynamicValue( thread ).numGE( ONE_INTEGER ) )
          {
            Errors.warn( $str127$find_rm_by_target___A_maps_to_mul, target, rm_results );
          }
        }
        Dynamic.sublisp_throw( $sym118$OUTER_CATCH_FOR_DRS_METHOD, rm_results );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_drs_cycl_formulas( self, cycl_formulas );
          set_drs_super_drs( self, super_drs );
          set_drs_rms( self, rms );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_drs_method = Errors.handleThrowable( ccatch_env_var, $sym118$OUTER_CATCH_FOR_DRS_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_drs_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 31454L)
  public static SubLObject find_terms_for_var_in_formula(final SubLObject var, final SubLObject formula)
  {
    SubLObject result = NIL;
    if( NIL != isa.isaP( cycl_utilities.formula_arg0( formula ), $const52$LogicalConnective, UNPROVIDED, UNPROVIDED ) )
    {
      SubLObject cdolist_list_var = formula;
      SubLObject subformula = NIL;
      subformula = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        result = ConsesLow.append( result, find_terms_for_var_in_formula( var, subformula ) );
        cdolist_list_var = cdolist_list_var.rest();
        subformula = cdolist_list_var.first();
      }
    }
    else if( formula.isCons() && THREE_INTEGER.eql( Sequences.length( formula ) ) )
    {
      final SubLObject formula_arg0 = cycl_utilities.formula_arg0( formula );
      final SubLObject formula_arg2 = cycl_utilities.formula_arg1( formula, UNPROVIDED );
      final SubLObject formula_arg3 = cycl_utilities.formula_arg2( formula, UNPROVIDED );
      if( ( formula_arg0.eql( $const129$isa ) || formula_arg0.eql( $const130$genls ) ) && formula_arg2.eql( var ) )
      {
        result = ConsesLow.cons( formula_arg3, result );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 32244L)
  public static SubLObject drs_construct_cycl_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_drs_method = NIL;
    final SubLObject interaction_mt = get_drs_interaction_mt( self );
    final SubLObject complex_conditions = get_drs_complex_conditions( self );
    final SubLObject simple_conditions = get_drs_simple_conditions( self );
    try
    {
      thread.throwStack.push( $sym133$OUTER_CATCH_FOR_DRS_METHOD );
      try
      {
        SubLObject result = NIL;
        SubLObject scopes = NIL;
        if( NIL != complex_conditions )
        {
          SubLObject cdolist_list_var = complex_conditions;
          SubLObject complex_condition = NIL;
          complex_condition = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            final SubLObject cf_cycl = drt_complex_condition_construct_cycl( complex_condition, interaction_mt );
            result = ConsesLow.cons( cf_cycl, result );
            cdolist_list_var = cdolist_list_var.rest();
            complex_condition = cdolist_list_var.first();
          }
        }
        if( NIL != simple_conditions )
        {
          SubLObject relevant_rms = NIL;
          SubLObject cdolist_list_var2 = simple_conditions;
          SubLObject simple_condition = NIL;
          simple_condition = cdolist_list_var2.first();
          while ( NIL != cdolist_list_var2)
          {
            SubLObject cdolist_list_var_$3 = list_utilities.remove_if_not( Symbols.symbol_function( $sym90$RM_P ), simple_condition, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            SubLObject poss_relevant_rm = NIL;
            poss_relevant_rm = cdolist_list_var_$3.first();
            while ( NIL != cdolist_list_var_$3)
            {
              final SubLObject item_var = poss_relevant_rm;
              if( NIL == conses_high.member( item_var, relevant_rms, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                relevant_rms = ConsesLow.cons( item_var, relevant_rms );
              }
              cdolist_list_var_$3 = cdolist_list_var_$3.rest();
              poss_relevant_rm = cdolist_list_var_$3.first();
            }
            result = ConsesLow.cons( drt_simple_condition_construct_cycl( simple_condition ), result );
            cdolist_list_var2 = cdolist_list_var2.rest();
            simple_condition = cdolist_list_var2.first();
          }
          cdolist_list_var2 = relevant_rms;
          SubLObject relevant_rm = NIL;
          relevant_rm = cdolist_list_var2.first();
          while ( NIL != cdolist_list_var2)
          {
            if( NIL != instances.get_slot( relevant_rm, $sym65$SCOPE ) && !$const83$forAll.eql( instances.get_slot( relevant_rm, $sym65$SCOPE ) ) )
            {
              scopes = ConsesLow.cons( ConsesLow.list( instances.get_slot( relevant_rm, $sym65$SCOPE ), instances.get_slot( relevant_rm, $sym80$TARGET_VAR ) ), scopes );
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            relevant_rm = cdolist_list_var2.first();
          }
        }
        if( NIL != result.rest() )
        {
          result = reader.bq_cons( $const69$and, result );
        }
        else
        {
          result = result.first();
        }
        SubLObject cdolist_list_var = scopes;
        SubLObject scope = NIL;
        scope = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          result = ConsesLow.append( scope, ConsesLow.list( result ) );
          cdolist_list_var = cdolist_list_var.rest();
          scope = cdolist_list_var.first();
        }
        if( !drt.$drt_trace_level$.getDynamicValue( thread ).isNumber() || drt.$drt_trace_level$.getDynamicValue( thread ).numGE( TWO_INTEGER ) )
        {
          if( !drt.$drt_trace_level$.getDynamicValue( thread ).isNumber() || drt.$drt_trace_level$.getDynamicValue( thread ).numGE( TWO_INTEGER ) )
          {
            drt.drt_tracer_output( TWO_INTEGER, ConsesLow.list( $str134$_______________________FINAL_CYCL ) );
          }
          if( !drt.$drt_trace_level$.getDynamicValue( thread ).isNumber() || drt.$drt_trace_level$.getDynamicValue( thread ).numGE( TWO_INTEGER ) )
          {
            drt.drt_tracer_output( TWO_INTEGER, ConsesLow.list( $str135$_A__, result ) );
          }
        }
        Dynamic.sublisp_throw( $sym133$OUTER_CATCH_FOR_DRS_METHOD, result );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_drs_interaction_mt( self, interaction_mt );
          set_drs_complex_conditions( self, complex_conditions );
          set_drs_simple_conditions( self, simple_conditions );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_drs_method = Errors.handleThrowable( ccatch_env_var, $sym133$OUTER_CATCH_FOR_DRS_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_drs_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 33644L)
  public static SubLObject drt_complex_condition_construct_cycl(final SubLObject complex_condition, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    SubLObject cf_cycl = NIL;
    final SubLObject cf_arg0 = cycl_utilities.formula_arg0( complex_condition );
    final SubLObject cf_drs_args = cycl_utilities.formula_args( complex_condition, UNPROVIDED );
    cf_cycl = ConsesLow.cons( cf_arg0, cf_cycl );
    SubLObject cdolist_list_var = cf_drs_args;
    SubLObject cf_drs_arg = NIL;
    cf_drs_arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != drs_p( cf_drs_arg ) )
      {
        cf_cycl = ConsesLow.cons( methods.funcall_instance_method_with_0_args( cf_drs_arg, $sym131$CONSTRUCT_CYCL ), cf_cycl );
      }
      else
      {
        cf_cycl = ConsesLow.cons( cf_drs_arg, cf_cycl );
      }
      cdolist_list_var = cdolist_list_var.rest();
      cf_drs_arg = cdolist_list_var.first();
    }
    cf_cycl = Sequences.nreverse( cf_cycl );
    if( $const53$NLNegFn.eql( cycl_utilities.formula_arg0( cf_cycl ) ) )
    {
      cf_cycl = reformulator_utilities_nl.reformulate_cycl_negproc( ConsesLow.list( $const53$NLNegFn, cycl_utilities.formula_arg1( cf_cycl, UNPROVIDED ), reformulator_hub.reformulate_cycl( cycl_utilities.formula_arg2(
          cf_cycl, UNPROVIDED ), mt, UNPROVIDED ) ), mt, UNPROVIDED );
    }
    return cf_cycl;
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 34612L)
  public static SubLObject drt_simple_condition_construct_cycl(final SubLObject simple_condition)
  {
    SubLObject sf_cycl = NIL;
    if( simple_condition.isCons() )
    {
      SubLObject cdolist_list_var = simple_condition;
      SubLObject simple_condition_arg = NIL;
      simple_condition_arg = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != drt_rm.rm_p( simple_condition_arg ) )
        {
          sf_cycl = ConsesLow.cons( methods.funcall_instance_method_with_0_args( drt_rm.real_rm( simple_condition_arg ), $sym131$CONSTRUCT_CYCL ), sf_cycl );
        }
        else
        {
          sf_cycl = ConsesLow.cons( drt_simple_condition_construct_cycl( simple_condition_arg ), sf_cycl );
        }
        cdolist_list_var = cdolist_list_var.rest();
        simple_condition_arg = cdolist_list_var.first();
      }
      return Sequences.nreverse( sf_cycl );
    }
    return simple_condition;
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 35057L)
  public static SubLObject drt_formula_construct_cycl(final SubLObject root_term)
  {
    if( root_term.isCons() )
    {
      SubLObject result = NIL;
      SubLObject cdolist_list_var = root_term;
      SubLObject root_term_arg = NIL;
      root_term_arg = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        result = ConsesLow.cons( drt_formula_construct_cycl( root_term_arg ), result );
        cdolist_list_var = cdolist_list_var.rest();
        root_term_arg = cdolist_list_var.first();
      }
      return Sequences.nreverse( result );
    }
    if( NIL != drt_rm.rm_p( root_term ) )
    {
      return methods.funcall_instance_method_with_0_args( drt_rm.real_rm( root_term ), $sym131$CONSTRUCT_CYCL );
    }
    return root_term;
  }

  public static SubLObject declare_drt_drs_file()
  {
    SubLFiles.declareFunction( me, "drt_drs_quant_call_type", "DRT-DRS-QUANT-CALL-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "drt_drs_quant_call_test", "DRT-DRS-QUANT-CALL-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "drt_drs_quant_call_fn", "DRT-DRS-QUANT-CALL-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "drt_drs_quant_call_mt", "DRT-DRS-QUANT-CALL-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "get_drs_parsing_mt", "GET-DRS-PARSING-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_drs_parsing_mt", "SET-DRS-PARSING-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "get_drs_interaction_mt", "GET-DRS-INTERACTION-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_drs_interaction_mt", "SET-DRS-INTERACTION-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "get_drs_complex_conditions", "GET-DRS-COMPLEX-CONDITIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_drs_complex_conditions", "SET-DRS-COMPLEX-CONDITIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_drs_simple_conditions", "GET-DRS-SIMPLE-CONDITIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_drs_simple_conditions", "SET-DRS-SIMPLE-CONDITIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_drs_cycl_formulas", "GET-DRS-CYCL-FORMULAS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_drs_cycl_formulas", "SET-DRS-CYCL-FORMULAS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_drs_sub_drss", "GET-DRS-SUB-DRSS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_drs_sub_drss", "SET-DRS-SUB-DRSS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_drs_super_drs", "GET-DRS-SUPER-DRS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_drs_super_drs", "SET-DRS-SUPER-DRS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_drs_next_drs", "GET-DRS-NEXT-DRS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_drs_next_drs", "SET-DRS-NEXT-DRS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_drs_prev_drs", "GET-DRS-PREV-DRS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_drs_prev_drs", "SET-DRS-PREV-DRS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_drs_pronomial_rms", "GET-DRS-PRONOMIAL-RMS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_drs_pronomial_rms", "SET-DRS-PRONOMIAL-RMS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_drs_definite_rms", "GET-DRS-DEFINITE-RMS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_drs_definite_rms", "SET-DRS-DEFINITE-RMS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_drs_available_rms", "GET-DRS-AVAILABLE-RMS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_drs_available_rms", "SET-DRS-AVAILABLE-RMS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_drs_rms", "GET-DRS-RMS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_drs_rms", "SET-DRS-RMS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_drs_audience", "GET-DRS-AUDIENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_drs_audience", "SET-DRS-AUDIENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_drs_speaker", "GET-DRS-SPEAKER", 1, 0, false );
    SubLFiles.declareFunction( me, "set_drs_speaker", "SET-DRS-SPEAKER", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_drs_class", "SUBLOOP-RESERVED-INITIALIZE-DRS-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_drs_instance", "SUBLOOP-RESERVED-INITIALIZE-DRS-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "drs_p", "DRS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "drs_add_rm_method", "DRS-ADD-RM-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "drs_add_available_rm_method", "DRS-ADD-AVAILABLE-RM-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "drs_add_definite_rm_method", "DRS-ADD-DEFINITE-RM-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "drs_add_pronomial_rm_method", "DRS-ADD-PRONOMIAL-RM-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "create_drs_from_formula", "CREATE-DRS-FROM-FORMULA", 3, 2, false );
    SubLFiles.declareFunction( me, "drt_quantproc_hint_fn_p", "DRT-QUANTPROC-HINT-FN-P", 1, 1, false );
    SubLFiles.declareFunction( me, "drt_complex_formula_element", "DRT-COMPLEX-FORMULA-ELEMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "drt_complex_formulaP", "DRT-COMPLEX-FORMULA?", 1, 0, false );
    SubLFiles.declareFunction( me, "drs_process_method", "DRS-PROCESS-METHOD", 1, 1, false );
    SubLFiles.declareFunction( me, "drs_find_all_possible_rm_coreferences_method", "DRS-FIND-ALL-POSSIBLE-RM-COREFERENCES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "possible_rm_coreference_source_rm", "POSSIBLE-RM-COREFERENCE-SOURCE-RM", 1, 0, false );
    SubLFiles.declareFunction( me, "possible_rm_coreference_targets", "POSSIBLE-RM-COREFERENCE-TARGETS", 1, 0, false );
    SubLFiles.declareFunction( me, "possible_rm_coreference_target_rm", "POSSIBLE-RM-COREFERENCE-TARGET-RM", 1, 0, false );
    SubLFiles.declareFunction( me, "possible_rm_coreference_target_probability", "POSSIBLE-RM-COREFERENCE-TARGET-PROBABILITY", 1, 0, false );
    SubLFiles.declareFunction( me, "drs_find_possible_rm_coreferences_method", "DRS-FIND-POSSIBLE-RM-COREFERENCES-METHOD", 2, 2, false );
    SubLFiles.declareFunction( me, "drt_drs_map_add_rms_to_formula", "DRT-DRS-MAP-ADD-RMS-TO-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "drs_rm_root_term_method", "DRS-RM-ROOT-TERM-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "drt_corresponding_type_subcol_fn_3", "DRT-CORRESPONDING-TYPE-SUBCOL-FN-3", 1, 0, false );
    SubLFiles.declareFunction( me, "drs_find_rm_by_target_method", "DRS-FIND-RM-BY-TARGET-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "find_terms_for_var_in_formula", "FIND-TERMS-FOR-VAR-IN-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "drs_construct_cycl_method", "DRS-CONSTRUCT-CYCL-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "drt_complex_condition_construct_cycl", "DRT-COMPLEX-CONDITION-CONSTRUCT-CYCL", 1, 1, false );
    SubLFiles.declareFunction( me, "drt_simple_condition_construct_cycl", "DRT-SIMPLE-CONDITION-CONSTRUCT-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "drt_formula_construct_cycl", "DRT-FORMULA-CONSTRUCT-CYCL", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_drt_drs_file()
  {
    $drt_drs_quant_calls$ = SubLFiles.defparameter( "*DRT-DRS-QUANT-CALLS*", $list0 );
    $drt_put_available_rms_to_top_level_drs$ = SubLFiles.defparameter( "*DRT-PUT-AVAILABLE-RMS-TO-TOP-LEVEL-DRS*", NIL );
    $drt_quantproc_hint_fns$ = SubLFiles.defparameter( "*DRT-QUANTPROC-HINT-FNS*", $list49 );
    $drt_introduced_var_num_isg$ = SubLFiles.deflexical( "*DRT-INTRODUCED-VAR-NUM-ISG*", integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    $drt_possible_rm_coreferences_prev_drs_biases$ = SubLFiles.defparameter( "*DRT-POSSIBLE-RM-COREFERENCES-PREV-DRS-BIASES*", Sequences.nreverse( $list97 ) );
    $drt_possible_rm_coreferences_max_depth$ = SubLFiles.defparameter( "*DRT-POSSIBLE-RM-COREFERENCES-MAX-DEPTH*", Numbers.subtract( Sequences.length( $drt_possible_rm_coreferences_prev_drs_biases$.getDynamicValue() ),
        ONE_INTEGER ) );
    return NIL;
  }

  public static SubLObject setup_drt_drs_file()
  {
    classes.subloop_new_class( $sym1$DRS, $sym2$OBJECT, NIL, NIL, $list3 );
    classes.class_set_implements_slot_listeners( $sym1$DRS, NIL );
    classes.subloop_note_class_initialization_function( $sym1$DRS, $sym20$SUBLOOP_RESERVED_INITIALIZE_DRS_CLASS );
    classes.subloop_note_instance_initialization_function( $sym1$DRS, $sym23$SUBLOOP_RESERVED_INITIALIZE_DRS_INSTANCE );
    subloop_reserved_initialize_drs_class( $sym1$DRS );
    methods.methods_incorporate_instance_method( $sym24$ADD_RM, $sym1$DRS, NIL, $list25, $list26 );
    methods.subloop_register_instance_method( $sym1$DRS, $sym24$ADD_RM, $sym28$DRS_ADD_RM_METHOD );
    methods.methods_incorporate_instance_method( $sym29$ADD_AVAILABLE_RM, $sym1$DRS, NIL, $list25, $list30 );
    methods.subloop_register_instance_method( $sym1$DRS, $sym29$ADD_AVAILABLE_RM, $sym32$DRS_ADD_AVAILABLE_RM_METHOD );
    methods.methods_incorporate_instance_method( $sym33$ADD_DEFINITE_RM, $sym1$DRS, NIL, $list25, $list34 );
    methods.subloop_register_instance_method( $sym1$DRS, $sym33$ADD_DEFINITE_RM, $sym36$DRS_ADD_DEFINITE_RM_METHOD );
    methods.methods_incorporate_instance_method( $sym37$ADD_PRONOMIAL_RM, $sym1$DRS, NIL, $list25, $list38 );
    methods.subloop_register_instance_method( $sym1$DRS, $sym37$ADD_PRONOMIAL_RM, $sym40$DRS_ADD_PRONOMIAL_RM_METHOD );
    methods.methods_incorporate_instance_method( $sym56$PROCESS, $sym1$DRS, $list57, $list58, $list59 );
    methods.subloop_register_instance_method( $sym1$DRS, $sym56$PROCESS, $sym93$DRS_PROCESS_METHOD );
    methods.methods_incorporate_instance_method( $sym92$FIND_ALL_POSSIBLE_RM_COREFERENCES, $sym1$DRS, $list57, NIL, $list94 );
    methods.subloop_register_instance_method( $sym1$DRS, $sym92$FIND_ALL_POSSIBLE_RM_COREFERENCES, $sym96$DRS_FIND_ALL_POSSIBLE_RM_COREFERENCES_METHOD );
    methods.methods_incorporate_instance_method( $sym95$FIND_POSSIBLE_RM_COREFERENCES, $sym1$DRS, NIL, $list98, $list99 );
    methods.subloop_register_instance_method( $sym1$DRS, $sym95$FIND_POSSIBLE_RM_COREFERENCES, $sym109$DRS_FIND_POSSIBLE_RM_COREFERENCES_METHOD );
    methods.methods_incorporate_instance_method( $sym44$FIND_RM_BY_TARGET, $sym1$DRS, NIL, $list116, $list117 );
    methods.subloop_register_instance_method( $sym1$DRS, $sym44$FIND_RM_BY_TARGET, $sym128$DRS_FIND_RM_BY_TARGET_METHOD );
    methods.methods_incorporate_instance_method( $sym131$CONSTRUCT_CYCL, $sym1$DRS, NIL, NIL, $list132 );
    methods.subloop_register_instance_method( $sym1$DRS, $sym131$CONSTRUCT_CYCL, $sym136$DRS_CONSTRUCT_CYCL_METHOD );
    return NIL;
  }

  private static SubLObject _constant_59_initializer()
  {
    return ConsesLow.list( makeString(
        "Processes a DRS until the cycl-formulas slot is empty and all the contents have been moved into the relevant RMs, the simple and complex conditions lists, or the this DRS itself." ), ConsesLow.list( makeSymbol(
            "IGNORE" ), makeSymbol( "SUPER-DRS" ), makeSymbol( "AVAILABLE-RMS" ), makeSymbol( "DEFINITE-RMS" ), makeSymbol( "PRONOMIAL-RMS" ), makeSymbol( "SUB-DRSS" ) ), ConsesLow.list( makeSymbol( "DRT-TRACE-PROGN" ),
                FOUR_INTEGER, ConsesLow.list( makeSymbol( "FORMAT" ), T, makeString( "~%(drs-process-method ~A)" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "DESCRIBE-INSTANCE" ), makeSymbol( "SELF" ) ),
                ConsesLow.list( makeSymbol( "FORMAT" ), T, makeString( "~%" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SIMPLE-FORMULAS" ), NIL ), ConsesLow.list( makeSymbol(
                    "COMPLEX-FORMULAS" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CYCL-FORMULA" ), makeSymbol( "CYCL-FORMULAS" ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow
                        .list( makeSymbol( "DRT-COMPLEX-FORMULA?" ), makeSymbol( "CYCL-FORMULA" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "CYCL-FORMULA" ), makeSymbol( "COMPLEX-FORMULAS" ) ), ConsesLow
                            .list( makeSymbol( "CPUSH" ), makeSymbol( "CYCL-FORMULA" ), makeSymbol( "SIMPLE-FORMULAS" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "COMPLEX-FORMULAS" ), ConsesLow.list(
                                makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( ">" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "COMPLEX-FORMULAS" ) ), ONE_INTEGER ), ConsesLow.list( makeSymbol(
                                    "DRT-WARN" ), makeString( "drt-process-drs: more than one complex formula in drs ~A ~A~%" ), makeSymbol( "SELF" ), makeSymbol( "COMPLEX-FORMULAS" ) ) ), ConsesLow.list( makeSymbol(
                                        "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "COMPLEX-FORMULA" ), ConsesLow.list( makeSymbol( "CAR" ), makeSymbol( "COMPLEX-FORMULAS" ) ) ), ConsesLow.list( makeSymbol(
                                            "COMPLEX-FORMULA-ARG0" ), ConsesLow.list( makeSymbol( "FORMULA-ARG0" ), makeSymbol( "COMPLEX-FORMULA" ) ) ) ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list(
                                                makeSymbol( "CSETQ" ), makeSymbol( "COMPLEX-FORMULAS" ), ConsesLow.list( makeSymbol( "CDR" ), makeSymbol( "COMPLEX-FORMULAS" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ),
                                                    makeSymbol( "CYCL-FORMULAS" ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYCL-FORMULAS" ) ),
                                                        ConsesLow.list( makeSymbol( "APPEND" ), makeSymbol( "COMPLEX-FORMULAS" ), makeSymbol( "SIMPLE-FORMULAS" ) ) ) ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow
                                                            .list( ConsesLow.list( makeSymbol( "ISA?" ), makeSymbol( "COMPLEX-FORMULA-ARG0" ), constant_handles.reader_make_constant_shell( makeString( "Quantifier" ) ) ),
                                                                ConsesLow.list( makeSymbol( "DRT-TRACE-PROGN" ), THREE_INTEGER, ConsesLow.list( makeSymbol( "DRT-WARN" ), makeString( "1.a. quantifiers.~%" ) ) ), ConsesLow
                                                                    .list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TARGET-VAR" ), ConsesLow.list( makeSymbol( "FORMULA-ARG1" ), makeSymbol(
                                                                        "COMPLEX-FORMULA" ) ) ), ConsesLow.list( makeSymbol( "RM" ), ConsesLow.list( makeSymbol( "CAR" ), ConsesLow.list( makeSymbol(
                                                                            "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND-RM-BY-TARGET" ) ), makeSymbol(
                                                                                "TARGET-VAR" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "VAR" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol(
                                                                                    "PUNLESS" ), makeSymbol( "RM" ), ConsesLow.list( makeSymbol( "DRT-WARN" ), makeString(
                                                                                        "drt-process-drs ~A: no RM found for var ~A in complex-formula ~A~%" ), makeSymbol( "SELF" ), makeSymbol( "TARGET-VAR" ),
                                                                                        makeSymbol( "COMPLEX-FORMULA" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "RM" ), ConsesLow.list( makeSymbol(
                                                                                            "PUNLESS" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "RM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                                                "SCOPE" ) ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "RM" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                                                                                    makeSymbol( "SCOPE" ) ), makeSymbol( "COMPLEX-FORMULA-ARG0" ) ) ), ConsesLow.list( makeSymbol( "DRT-TRACE-PROGN" ),
                                                                                                        FOUR_INTEGER, ConsesLow.list( makeSymbol( "FORMAT" ), T, makeString( "-1--------------- modified RM:" ) ), ConsesLow
                                                                                                            .list( makeSymbol( "DESCRIBE-INSTANCE" ), makeSymbol( "RM" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), T,
                                                                                                                makeString( "-1-----------~%" ) ) ) ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol(
                                                                                                                    "CPUSH" ), ConsesLow.list( makeSymbol( "FORMULA-ARG2" ), makeSymbol( "COMPLEX-FORMULA" ) ), makeSymbol(
                                                                                                                        "COMPLEX-FORMULAS" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CYCL-FORMULAS" ),
                                                                                                                            ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
                                                                                                                                "QUOTE" ), makeSymbol( "CYCL-FORMULAS" ) ), ConsesLow.list( makeSymbol( "APPEND" ),
                                                                                                                                    makeSymbol( "COMPLEX-FORMULAS" ), makeSymbol( "SIMPLE-FORMULAS" ) ) ) ) ) ) ), ConsesLow
                                                                                                                                        .list( ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "ISA?" ),
                                                                                                                                            makeSymbol( "COMPLEX-FORMULA-ARG0" ), constant_handles
                                                                                                                                                .reader_make_constant_shell( makeString( "LogicalConnective" ) ) ),
                                                                                                                                            ConsesLow.list( EQ, makeSymbol( "COMPLEX-FORMULA-ARG0" ), constant_handles
                                                                                                                                                .reader_make_constant_shell( makeString( "NLNegFn" ) ) ), ConsesLow.list(
                                                                                                                                                    EQ, makeSymbol( "COMPLEX-FORMULA-ARG0" ), constant_handles
                                                                                                                                                        .reader_make_constant_shell( makeString(
                                                                                                                                                            "explains-PropProp" ) ) ) ), ConsesLow.list( makeSymbol(
                                                                                                                                                                "DRT-TRACE-PROGN" ), THREE_INTEGER, ConsesLow.list(
                                                                                                                                                                    makeSymbol( "DRT-WARN" ), makeString(
                                                                                                                                                                        "1.b. logical connectives.~%" ) ) ), ConsesLow.list(
                                                                                                                                                                            makeSymbol( "CLET" ), ConsesLow.list( ConsesLow
                                                                                                                                                                                .list( makeSymbol(
                                                                                                                                                                                    "NEW-COMPLEX-CONDITION" ), ConsesLow
                                                                                                                                                                                        .list( makeSymbol( "BQ-LIST" ),
                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                "COMPLEX-FORMULA-ARG0" ) ) ),
                                                                                                                                                                                ConsesLow.list( makeSymbol(
                                                                                                                                                                                    "SUBDRS-LIST" ) ) ), ConsesLow.list(
                                                                                                                                                                                        makeSymbol( "PCASE" ), makeSymbol(
                                                                                                                                                                                            "COMPLEX-FORMULA-ARG0" ),
                                                                                                                                                                                        ConsesLow.list( constant_handles
                                                                                                                                                                                            .reader_make_constant_shell(
                                                                                                                                                                                                makeString( "and" ) ),
                                                                                                                                                                                            ConsesLow.list( makeSymbol(
                                                                                                                                                                                                "PROGN" ), ConsesLow.list(
                                                                                                                                                                                                    makeSymbol( "CSETQ" ),
                                                                                                                                                                                                    makeSymbol(
                                                                                                                                                                                                        "COMPLEX-FORMULAS" ),
                                                                                                                                                                                                    ConsesLow.list(
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "APPEND" ),
                                                                                                                                                                                                        ConsesLow.list(
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "FORMULA-ARGS" ),
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "COMPLEX-FORMULA" ) ),
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "COMPLEX-FORMULAS" ) ) ),
                                                                                                                                                                                                ConsesLow.list( makeSymbol(
                                                                                                                                                                                                    "CSETQ" ), makeSymbol(
                                                                                                                                                                                                        "CYCL-FORMULAS" ),
                                                                                                                                                                                                    ConsesLow.list(
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "SET-SLOT" ),
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "SELF" ),
                                                                                                                                                                                                        ConsesLow.list(
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "QUOTE" ),
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "CYCL-FORMULAS" ) ),
                                                                                                                                                                                                        ConsesLow.list(
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "APPEND" ),
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "COMPLEX-FORMULAS" ),
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "SIMPLE-FORMULAS" ) ) ) ) ) ),
                                                                                                                                                                                        ConsesLow.list( makeSymbol(
                                                                                                                                                                                            "OTHERWISE" ), ConsesLow.list(
                                                                                                                                                                                                makeSymbol( "CLET" ),
                                                                                                                                                                                                ConsesLow.list( ConsesLow
                                                                                                                                                                                                    .list( makeSymbol(
                                                                                                                                                                                                        "LAST-NEW-DRS" ),
                                                                                                                                                                                                        NIL ), ConsesLow
                                                                                                                                                                                                            .list(
                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                    "FORMULA-ARGS" ),
                                                                                                                                                                                                                ConsesLow
                                                                                                                                                                                                                    .list(
                                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                                            "FORMULA-ARGS" ),
                                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                                            "COMPLEX-FORMULA" ) ) ) ),
                                                                                                                                                                                                ConsesLow.list( makeSymbol(
                                                                                                                                                                                                    "CDOLIST" ), ConsesLow
                                                                                                                                                                                                        .list( makeSymbol(
                                                                                                                                                                                                            "FORMULA-ARG" ),
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "FORMULA-ARGS" ) ),
                                                                                                                                                                                                    ConsesLow.list(
                                                                                                                                                                                                        makeSymbol( "PIF" ),
                                                                                                                                                                                                        ConsesLow.list(
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "CONSP" ),
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "FORMULA-ARG" ) ),
                                                                                                                                                                                                        ConsesLow.list(
                                                                                                                                                                                                            new SubLObject[]
                                                                                                                                                                                                            { makeSymbol(
                                                                                                                                                                                                                "CLET" ),
                                                                                                                                                                                                              ConsesLow
                                                                                                                                                                                                                  .list(
                                                                                                                                                                                                                      ConsesLow
                                                                                                                                                                                                                          .list(
                                                                                                                                                                                                                              makeSymbol(
                                                                                                                                                                                                                                  "SUBDRS" ),
                                                                                                                                                                                                                              ConsesLow
                                                                                                                                                                                                                                  .list(
                                                                                                                                                                                                                                      makeSymbol(
                                                                                                                                                                                                                                          "FUNCALL-CLASS-METHOD" ),
                                                                                                                                                                                                                                      ConsesLow
                                                                                                                                                                                                                                          .list(
                                                                                                                                                                                                                                              makeSymbol(
                                                                                                                                                                                                                                                  "QUOTE" ),
                                                                                                                                                                                                                                              makeSymbol(
                                                                                                                                                                                                                                                  "DRS" ) ),
                                                                                                                                                                                                                                      ConsesLow
                                                                                                                                                                                                                                          .list(
                                                                                                                                                                                                                                              makeSymbol(
                                                                                                                                                                                                                                                  "QUOTE" ),
                                                                                                                                                                                                                                              makeSymbol(
                                                                                                                                                                                                                                                  "NEW" ) ) ) ) ),
                                                                                                                                                                                                              ConsesLow
                                                                                                                                                                                                                  .list(
                                                                                                                                                                                                                      makeSymbol(
                                                                                                                                                                                                                          "SET-SLOT" ),
                                                                                                                                                                                                                      makeSymbol(
                                                                                                                                                                                                                          "SUBDRS" ),
                                                                                                                                                                                                                      ConsesLow
                                                                                                                                                                                                                          .list(
                                                                                                                                                                                                                              makeSymbol(
                                                                                                                                                                                                                                  "QUOTE" ),
                                                                                                                                                                                                                              makeSymbol(
                                                                                                                                                                                                                                  "INTERACTION-MT" ) ),
                                                                                                                                                                                                                      makeSymbol(
                                                                                                                                                                                                                          "INTERACTION-MT" ) ),
                                                                                                                                                                                                              ConsesLow
                                                                                                                                                                                                                  .list(
                                                                                                                                                                                                                      makeSymbol(
                                                                                                                                                                                                                          "SET-SLOT" ),
                                                                                                                                                                                                                      makeSymbol(
                                                                                                                                                                                                                          "SUBDRS" ),
                                                                                                                                                                                                                      ConsesLow
                                                                                                                                                                                                                          .list(
                                                                                                                                                                                                                              makeSymbol(
                                                                                                                                                                                                                                  "QUOTE" ),
                                                                                                                                                                                                                              makeSymbol(
                                                                                                                                                                                                                                  "PARSING-MT" ) ),
                                                                                                                                                                                                                      makeSymbol(
                                                                                                                                                                                                                          "PARSING-MT" ) ),
                                                                                                                                                                                                              ConsesLow
                                                                                                                                                                                                                  .list(
                                                                                                                                                                                                                      makeSymbol(
                                                                                                                                                                                                                          "SET-SLOT" ),
                                                                                                                                                                                                                      makeSymbol(
                                                                                                                                                                                                                          "SUBDRS" ),
                                                                                                                                                                                                                      ConsesLow
                                                                                                                                                                                                                          .list(
                                                                                                                                                                                                                              makeSymbol(
                                                                                                                                                                                                                                  "QUOTE" ),
                                                                                                                                                                                                                              makeSymbol(
                                                                                                                                                                                                                                  "CYCL-FORMULAS" ) ),
                                                                                                                                                                                                                      ConsesLow
                                                                                                                                                                                                                          .list(
                                                                                                                                                                                                                              makeSymbol(
                                                                                                                                                                                                                                  "BQ-LIST" ),
                                                                                                                                                                                                                              makeSymbol(
                                                                                                                                                                                                                                  "FORMULA-ARG" ) ) ),
                                                                                                                                                                                                              ConsesLow
                                                                                                                                                                                                                  .list(
                                                                                                                                                                                                                      makeSymbol(
                                                                                                                                                                                                                          "PIF" ),
                                                                                                                                                                                                                      makeSymbol(
                                                                                                                                                                                                                          "LAST-NEW-DRS" ),
                                                                                                                                                                                                                      ConsesLow
                                                                                                                                                                                                                          .list(
                                                                                                                                                                                                                              makeSymbol(
                                                                                                                                                                                                                                  "PROGN" ),
                                                                                                                                                                                                                              ConsesLow
                                                                                                                                                                                                                                  .list(
                                                                                                                                                                                                                                      makeSymbol(
                                                                                                                                                                                                                                          "SET-SLOT" ),
                                                                                                                                                                                                                                      makeSymbol(
                                                                                                                                                                                                                                          "SUBDRS" ),
                                                                                                                                                                                                                                      ConsesLow
                                                                                                                                                                                                                                          .list(
                                                                                                                                                                                                                                              makeSymbol(
                                                                                                                                                                                                                                                  "QUOTE" ),
                                                                                                                                                                                                                                              makeSymbol(
                                                                                                                                                                                                                                                  "SUPER-DRS" ) ),
                                                                                                                                                                                                                                      makeSymbol(
                                                                                                                                                                                                                                          "LAST-NEW-DRS" ) ),
                                                                                                                                                                                                                              ConsesLow
                                                                                                                                                                                                                                  .list(
                                                                                                                                                                                                                                      makeSymbol(
                                                                                                                                                                                                                                          "SET-SLOT" ),
                                                                                                                                                                                                                                      makeSymbol(
                                                                                                                                                                                                                                          "LAST-NEW-DRS" ),
                                                                                                                                                                                                                                      ConsesLow
                                                                                                                                                                                                                                          .list(
                                                                                                                                                                                                                                              makeSymbol(
                                                                                                                                                                                                                                                  "QUOTE" ),
                                                                                                                                                                                                                                              makeSymbol(
                                                                                                                                                                                                                                                  "SUB-DRSS" ) ),
                                                                                                                                                                                                                                      ConsesLow
                                                                                                                                                                                                                                          .list(
                                                                                                                                                                                                                                              makeSymbol(
                                                                                                                                                                                                                                                  "BQ-LIST" ),
                                                                                                                                                                                                                                              makeSymbol(
                                                                                                                                                                                                                                                  "SUBDRS" ) ) ) ),
                                                                                                                                                                                                                      ConsesLow
                                                                                                                                                                                                                          .list(
                                                                                                                                                                                                                              makeSymbol(
                                                                                                                                                                                                                                  "PROGN" ),
                                                                                                                                                                                                                              ConsesLow
                                                                                                                                                                                                                                  .list(
                                                                                                                                                                                                                                      makeSymbol(
                                                                                                                                                                                                                                          "SET-SLOT" ),
                                                                                                                                                                                                                                      makeSymbol(
                                                                                                                                                                                                                                          "SUBDRS" ),
                                                                                                                                                                                                                                      ConsesLow
                                                                                                                                                                                                                                          .list(
                                                                                                                                                                                                                                              makeSymbol(
                                                                                                                                                                                                                                                  "QUOTE" ),
                                                                                                                                                                                                                                              makeSymbol(
                                                                                                                                                                                                                                                  "SUPER-DRS" ) ),
                                                                                                                                                                                                                                      makeSymbol(
                                                                                                                                                                                                                                          "SELF" ) ),
                                                                                                                                                                                                                              ConsesLow
                                                                                                                                                                                                                                  .list(
                                                                                                                                                                                                                                      makeSymbol(
                                                                                                                                                                                                                                          "SET-SLOT" ),
                                                                                                                                                                                                                                      makeSymbol(
                                                                                                                                                                                                                                          "SELF" ),
                                                                                                                                                                                                                                      ConsesLow
                                                                                                                                                                                                                                          .list(
                                                                                                                                                                                                                                              makeSymbol(
                                                                                                                                                                                                                                                  "QUOTE" ),
                                                                                                                                                                                                                                              makeSymbol(
                                                                                                                                                                                                                                                  "SUB-DRSS" ) ),
                                                                                                                                                                                                                                      ConsesLow
                                                                                                                                                                                                                                          .list(
                                                                                                                                                                                                                                              makeSymbol(
                                                                                                                                                                                                                                                  "BQ-LIST" ),
                                                                                                                                                                                                                                              makeSymbol(
                                                                                                                                                                                                                                                  "SUBDRS" ) ) ) ) ),
                                                                                                                                                                                                              ConsesLow
                                                                                                                                                                                                                  .list(
                                                                                                                                                                                                                      makeSymbol(
                                                                                                                                                                                                                          "CSETQ" ),
                                                                                                                                                                                                                      makeSymbol(
                                                                                                                                                                                                                          "LAST-NEW-DRS" ),
                                                                                                                                                                                                                      makeSymbol(
                                                                                                                                                                                                                          "SUBDRS" ) ),
                                                                                                                                                                                                              ConsesLow
                                                                                                                                                                                                                  .list(
                                                                                                                                                                                                                      makeSymbol(
                                                                                                                                                                                                                          "CPUSH" ),
                                                                                                                                                                                                                      makeSymbol(
                                                                                                                                                                                                                          "SUBDRS" ),
                                                                                                                                                                                                                      makeSymbol(
                                                                                                                                                                                                                          "NEW-COMPLEX-CONDITION" ) ),
                                                                                                                                                                                                              ConsesLow
                                                                                                                                                                                                                  .list(
                                                                                                                                                                                                                      makeSymbol(
                                                                                                                                                                                                                          "CPUSH" ),
                                                                                                                                                                                                                      makeSymbol(
                                                                                                                                                                                                                          "SUBDRS" ),
                                                                                                                                                                                                                      makeSymbol(
                                                                                                                                                                                                                          "SUBDRS-LIST" ) )
                                                                                                                                                                                                            } ), ConsesLow
                                                                                                                                                                                                                .list(
                                                                                                                                                                                                                    makeSymbol(
                                                                                                                                                                                                                        "CPUSH" ),
                                                                                                                                                                                                                    makeSymbol(
                                                                                                                                                                                                                        "FORMULA-ARG" ),
                                                                                                                                                                                                                    makeSymbol(
                                                                                                                                                                                                                        "NEW-COMPLEX-CONDITION" ) ) ) ) ),
                                                                                                                                                                                            ConsesLow.list( makeSymbol(
                                                                                                                                                                                                "PROGN" ), ConsesLow.list(
                                                                                                                                                                                                    makeSymbol( "CSETQ" ),
                                                                                                                                                                                                    makeSymbol(
                                                                                                                                                                                                        "NEW-COMPLEX-CONDITION" ),
                                                                                                                                                                                                    ConsesLow.list(
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "NREVERSE" ),
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "NEW-COMPLEX-CONDITION" ) ) ),
                                                                                                                                                                                                ConsesLow.list( makeSymbol(
                                                                                                                                                                                                    "CSETQ" ), makeSymbol(
                                                                                                                                                                                                        "COMPLEX-CONDITIONS" ),
                                                                                                                                                                                                    ConsesLow.list(
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "SET-SLOT" ),
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "SELF" ),
                                                                                                                                                                                                        ConsesLow.list(
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "QUOTE" ),
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "COMPLEX-CONDITIONS" ) ),
                                                                                                                                                                                                        ConsesLow.list(
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "CONS" ),
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "NEW-COMPLEX-CONDITION" ),
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "COMPLEX-CONDITIONS" ) ) ) ) ),
                                                                                                                                                                                            ConsesLow.list( makeSymbol(
                                                                                                                                                                                                "PROGN" ), ConsesLow.list(
                                                                                                                                                                                                    makeSymbol( "CSETQ" ),
                                                                                                                                                                                                    makeSymbol(
                                                                                                                                                                                                        "CYCL-FORMULAS" ),
                                                                                                                                                                                                    ConsesLow.list(
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "SET-SLOT" ),
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "SELF" ),
                                                                                                                                                                                                        ConsesLow.list(
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "QUOTE" ),
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "CYCL-FORMULAS" ) ),
                                                                                                                                                                                                        ConsesLow.list(
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "APPEND" ),
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "COMPLEX-FORMULAS" ),
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "SIMPLE-FORMULAS" ) ) ) ) ),
                                                                                                                                                                                            ConsesLow.list( makeSymbol(
                                                                                                                                                                                                "CLET" ), ConsesLow.list(
                                                                                                                                                                                                    makeSymbol(
                                                                                                                                                                                                        "POSSIBLE-RM-COREFERENCES" ) ),
                                                                                                                                                                                                ConsesLow.list( makeSymbol(
                                                                                                                                                                                                    "CDOLIST" ), ConsesLow
                                                                                                                                                                                                        .list( makeSymbol(
                                                                                                                                                                                                            "SUBDRS" ),
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "SUBDRS-LIST" ) ),
                                                                                                                                                                                                    ConsesLow.list(
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "CLET" ),
                                                                                                                                                                                                        ConsesLow.list(
                                                                                                                                                                                                            ConsesLow.list(
                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                    "SUB-POSSIBLE-RM-COREFERENCES" ),
                                                                                                                                                                                                                ConsesLow
                                                                                                                                                                                                                    .list(
                                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                                            "FUNCALL-INSTANCE-METHOD" ),
                                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                                            "SUBDRS" ),
                                                                                                                                                                                                                        ConsesLow
                                                                                                                                                                                                                            .list(
                                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                                    "QUOTE" ),
                                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                                    "PROCESS" ) ) ) ) ),
                                                                                                                                                                                                        ConsesLow.list(
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "PCOND" ),
                                                                                                                                                                                                            ConsesLow.list(
                                                                                                                                                                                                                ConsesLow
                                                                                                                                                                                                                    .list(
                                                                                                                                                                                                                        EQ,
                                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                                            "SUB-POSSIBLE-RM-COREFERENCES" ),
                                                                                                                                                                                                                        T ),
                                                                                                                                                                                                                ConsesLow
                                                                                                                                                                                                                    .list(
                                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                                            "RET" ),
                                                                                                                                                                                                                        T ) ),
                                                                                                                                                                                                            ConsesLow.list(
                                                                                                                                                                                                                T, ConsesLow
                                                                                                                                                                                                                    .list(
                                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                                            "CSETQ" ),
                                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                                            "POSSIBLE-RM-COREFERENCES" ),
                                                                                                                                                                                                                        ConsesLow
                                                                                                                                                                                                                            .list(
                                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                                    "APPEND" ),
                                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                                    "SUB-POSSIBLE-RM-COREFERENCES" ),
                                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                                    "POSSIBLE-RM-COREFERENCES" ) ) ) ) ) ) ),
                                                                                                                                                                                                ConsesLow.list( makeSymbol(
                                                                                                                                                                                                    "CSETQ" ), makeSymbol(
                                                                                                                                                                                                        "CARRY-POSSIBLE-RM-COREFERENCES" ),
                                                                                                                                                                                                    ConsesLow.list(
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "APPEND" ),
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "CARRY-POSSIBLE-RM-COREFERENCES" ),
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "POSSIBLE-RM-COREFERENCES" ) ) ) ) ) ) ) ),
                                                            ConsesLow.list( T, ConsesLow.list( makeSymbol( "DRT-TRACE-PROGN" ), THREE_INTEGER, ConsesLow.list( makeSymbol( "DRT-WARN" ), makeString( "1.c. quantproc~%" ) ),
                                                                ConsesLow.list( makeSymbol( "FORMAT" ), T, makeString( "Attempting reformulation on: ~%~A~%" ), makeSymbol( "COMPLEX-FORMULA" ) ) ), ConsesLow.list(
                                                                    makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-COMPLEX-FORMULA" ), NIL ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow
                                                                        .list( makeSymbol( "DONE?" ) ), ConsesLow.list( makeSymbol( "CSOME" ), ConsesLow.list( makeSymbol( "QUANT-CALL" ), makeSymbol(
                                                                            "*DRT-DRS-QUANT-CALLS*" ), makeSymbol( "DONE?" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                                                                                "QUANT-CALL-TYPE" ), ConsesLow.list( makeSymbol( "DRT-DRS-QUANT-CALL-TYPE" ), makeSymbol( "QUANT-CALL" ) ) ), ConsesLow.list( makeSymbol(
                                                                                    "QUANT-CALL-TEST" ), ConsesLow.list( makeSymbol( "DRT-DRS-QUANT-CALL-TEST" ), makeSymbol( "QUANT-CALL" ) ) ), ConsesLow.list(
                                                                                        makeSymbol( "QUANT-CALL-FN" ), ConsesLow.list( makeSymbol( "DRT-DRS-QUANT-CALL-FN" ), makeSymbol( "QUANT-CALL" ) ) ), ConsesLow
                                                                                            .list( makeSymbol( "QUANT-CALL-MT" ), ConsesLow.list( makeSymbol( "DRT-DRS-QUANT-CALL-MT" ), makeSymbol( "QUANT-CALL" ) ) ) ),
                                                                                ConsesLow.list( makeSymbol( "PCASE" ), makeSymbol( "QUANT-CALL-MT" ), ConsesLow.list( makeKeyword( "PARSING-MT" ), ConsesLow.list(
                                                                                    makeSymbol( "CSETQ" ), makeSymbol( "QUANT-CALL-MT" ), makeSymbol( "PARSING-MT" ) ) ), ConsesLow.list( makeKeyword( "INTERACTION-MT" ),
                                                                                        ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "QUANT-CALL-MT" ), makeSymbol( "INTERACTION-MT" ) ) ), ConsesLow.list(
                                                                                            makeSymbol( "OTHERWISE" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "QUANT-CALL-MT" ), makeSymbol(
                                                                                                "INTERACTION-MT" ) ) ) ), ConsesLow.list( makeSymbol( "DRT-TRACE-PROGN" ), THREE_INTEGER, ConsesLow.list( makeSymbol(
                                                                                                    "FORMAT" ), T, makeString( "Attempting reformulation type ~A, mt=~A~%" ), makeSymbol( "QUANT-CALL-TYPE" ), makeSymbol(
                                                                                                        "QUANT-CALL-MT" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list(
                                                                                                            makeSymbol( "FUNCTION-SPEC-P" ), makeSymbol( "QUANT-CALL-TEST" ) ), ConsesLow.list( makeSymbol( "FUNCALL" ),
                                                                                                                makeSymbol( "QUANT-CALL-TEST" ), makeSymbol( "COMPLEX-FORMULA" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ),
                                                                                                                    ConsesLow.list( makeSymbol( "FUNCTION-SPEC-P" ), makeSymbol( "QUANT-CALL-FN" ) ), ConsesLow.list(
                                                                                                                        makeSymbol( "CSETQ" ), makeSymbol( "NEW-COMPLEX-FORMULA" ), ConsesLow.list( makeSymbol( "FUNCALL" ),
                                                                                                                            makeSymbol( "QUANT-CALL-FN" ), makeSymbol( "COMPLEX-FORMULA" ), makeSymbol(
                                                                                                                                "QUANT-CALL-MT" ) ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list(
                                                                                                                                    makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol(
                                                                                                                                        "NEW-COMPLEX-FORMULA" ) ), ConsesLow.list( EQUAL, makeSymbol(
                                                                                                                                            "NEW-COMPLEX-FORMULA" ), makeSymbol( "COMPLEX-FORMULA" ) ) ), ConsesLow.list(
                                                                                                                                                makeSymbol( "DRT-TRACE-PROGN" ), THREE_INTEGER, ConsesLow.list( makeSymbol(
                                                                                                                                                    "FORMAT" ), T, makeString( "Using reformulator result from ~A: ~A~%" ),
                                                                                                                                                    makeSymbol( "QUANT-CALL-TYPE" ), makeSymbol(
                                                                                                                                                        "NEW-COMPLEX-FORMULA" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ),
                                                                                                                                                            makeSymbol( "DONE?" ), T ) ) ) ) ), ConsesLow.list( makeSymbol(
                                                                                                                                                                "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                                                                                                                                                                    "NULL" ), makeSymbol( "NEW-COMPLEX-FORMULA" ) ),
                                                                                                                                                                    ConsesLow.list( makeSymbol( "DRT-WARN" ), makeString(
                                                                                                                                                                        "failed reformulation on ~A: new-complex-formula is NULL." ),
                                                                                                                                                                        makeSymbol( "COMPLEX-FORMULA" ) ), ConsesLow.list(
                                                                                                                                                                            makeSymbol( "RET" ), T ) ), ConsesLow.list(
                                                                                                                                                                                ConsesLow.list( EQUAL, makeSymbol(
                                                                                                                                                                                    "NEW-COMPLEX-FORMULA" ), makeSymbol(
                                                                                                                                                                                        "COMPLEX-FORMULA" ) ), ConsesLow
                                                                                                                                                                                            .list( makeSymbol( "DRT-WARN" ),
                                                                                                                                                                                                makeString(
                                                                                                                                                                                                    "failed reformulation on ~A: new-complex-formula is IDENTICAL." ),
                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                    "COMPLEX-FORMULA" ) ),
                                                                                                                                                                                ConsesLow.list( makeSymbol( "RET" ), T ) ),
                                                                                                                                                                ConsesLow.list( T, ConsesLow.list( makeSymbol( "CLET" ),
                                                                                                                                                                    ConsesLow.list( ConsesLow.list( makeSymbol(
                                                                                                                                                                        "NEW-COMPLEX-FORMULA-ARG0" ), ConsesLow.list(
                                                                                                                                                                            makeSymbol( "FORMULA-ARG0" ), makeSymbol(
                                                                                                                                                                                "NEW-COMPLEX-FORMULA" ) ) ) ), ConsesLow
                                                                                                                                                                                    .list( makeSymbol( "PCOND" ), ConsesLow
                                                                                                                                                                                        .list( ConsesLow.list( makeSymbol(
                                                                                                                                                                                            "ISA?" ), makeSymbol(
                                                                                                                                                                                                "NEW-COMPLEX-FORMULA-ARG0" ),
                                                                                                                                                                                            constant_handles
                                                                                                                                                                                                .reader_make_constant_shell(
                                                                                                                                                                                                    makeString(
                                                                                                                                                                                                        "Quantifier" ) ) ),
                                                                                                                                                                                            ConsesLow.list( makeSymbol(
                                                                                                                                                                                                "CLET" ), ConsesLow.list(
                                                                                                                                                                                                    ConsesLow.list(
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "INTRODUCED-VAR" ),
                                                                                                                                                                                                        ConsesLow.list(
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "FORMULA-ARG1" ),
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "NEW-COMPLEX-FORMULA" ) ) ),
                                                                                                                                                                                                    ConsesLow.list(
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "UNIQUE-VAR" ),
                                                                                                                                                                                                        ConsesLow.list(
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "MAKE-EL-VAR" ),
                                                                                                                                                                                                            ConsesLow.list(
                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                    "FORMAT" ),
                                                                                                                                                                                                                NIL,
                                                                                                                                                                                                                makeString(
                                                                                                                                                                                                                    "DRT-~A" ),
                                                                                                                                                                                                                ConsesLow
                                                                                                                                                                                                                    .list(
                                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                                            "INTEGER-SEQUENCE-GENERATOR-NEXT" ),
                                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                                            "*DRT-INTRODUCED-VAR-NUM-ISG*" ) ) ) ) ) ),
                                                                                                                                                                                                ConsesLow.list( makeSymbol(
                                                                                                                                                                                                    "PWHEN" ), ConsesLow
                                                                                                                                                                                                        .list( makeSymbol(
                                                                                                                                                                                                            "EL-VAR?" ),
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "INTRODUCED-VAR" ) ),
                                                                                                                                                                                                    ConsesLow.list(
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "CSETQ" ),
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "NEW-COMPLEX-FORMULA" ),
                                                                                                                                                                                                        ConsesLow.list(
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "TREE-SUBSTITUTE" ),
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "NEW-COMPLEX-FORMULA" ),
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "INTRODUCED-VAR" ),
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "UNIQUE-VAR" ) ) ) ) ),
                                                                                                                                                                                            ConsesLow.list( makeSymbol(
                                                                                                                                                                                                "PROGN" ), ConsesLow.list(
                                                                                                                                                                                                    makeSymbol( "CPUSH" ),
                                                                                                                                                                                                    makeSymbol(
                                                                                                                                                                                                        "NEW-COMPLEX-FORMULA" ),
                                                                                                                                                                                                    makeSymbol(
                                                                                                                                                                                                        "COMPLEX-FORMULAS" ) ),
                                                                                                                                                                                                ConsesLow.list( makeSymbol(
                                                                                                                                                                                                    "CSETQ" ), makeSymbol(
                                                                                                                                                                                                        "CYCL-FORMULAS" ),
                                                                                                                                                                                                    ConsesLow.list(
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "SET-SLOT" ),
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "SELF" ),
                                                                                                                                                                                                        ConsesLow.list(
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "QUOTE" ),
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "CYCL-FORMULAS" ) ),
                                                                                                                                                                                                        ConsesLow.list(
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "APPEND" ),
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "COMPLEX-FORMULAS" ),
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "SIMPLE-FORMULAS" ) ) ) ) ),
                                                                                                                                                                                            ConsesLow.list( makeSymbol(
                                                                                                                                                                                                "CLET" ), ConsesLow.list(
                                                                                                                                                                                                    ConsesLow.list(
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "INTRODUCED-VAR" ),
                                                                                                                                                                                                        ConsesLow.list(
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "FORMULA-ARG1" ),
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "NEW-COMPLEX-FORMULA" ) ) ),
                                                                                                                                                                                                    ConsesLow.list(
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "SUBFORMULA" ),
                                                                                                                                                                                                        ConsesLow.list(
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "FORMULA-ARG2" ),
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "NEW-COMPLEX-FORMULA" ) ) ),
                                                                                                                                                                                                    ConsesLow.list(
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "TARGET-TERMS" ),
                                                                                                                                                                                                        ConsesLow.list(
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "FIND-TERMS-FOR-VAR-IN-FORMULA" ),
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "INTRODUCED-VAR" ),
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "SUBFORMULA" ) ) ),
                                                                                                                                                                                                    ConsesLow.list(
                                                                                                                                                                                                        makeSymbol( "RM" ),
                                                                                                                                                                                                        NIL ) ), ConsesLow
                                                                                                                                                                                                            .list(
                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                    "CLET" ),
                                                                                                                                                                                                                ConsesLow
                                                                                                                                                                                                                    .list(
                                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                                            "DONE?" ),
                                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                                            "DONE2?" ) ),
                                                                                                                                                                                                                ConsesLow
                                                                                                                                                                                                                    .list(
                                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                                            "CSOME" ),
                                                                                                                                                                                                                        ConsesLow
                                                                                                                                                                                                                            .list(
                                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                                    "TARGET-TERM" ),
                                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                                    "TARGET-TERMS" ),
                                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                                    "DONE?" ) ),
                                                                                                                                                                                                                        ConsesLow
                                                                                                                                                                                                                            .list(
                                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                                    "CLET" ),
                                                                                                                                                                                                                                ConsesLow
                                                                                                                                                                                                                                    .list(
                                                                                                                                                                                                                                        ConsesLow
                                                                                                                                                                                                                                            .list(
                                                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                                                    "POSS-RMS" ),
                                                                                                                                                                                                                                                ConsesLow
                                                                                                                                                                                                                                                    .list(
                                                                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                                                                            "FUNCALL-INSTANCE-METHOD" ),
                                                                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                                                                            "SELF" ),
                                                                                                                                                                                                                                                        ConsesLow
                                                                                                                                                                                                                                                            .list(
                                                                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                                                                    "QUOTE" ),
                                                                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                                                                    "FIND-RM-BY-TARGET" ) ),
                                                                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                                                                            "TARGET-TERM" ),
                                                                                                                                                                                                                                                        ConsesLow
                                                                                                                                                                                                                                                            .list(
                                                                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                                                                    "QUOTE" ),
                                                                                                                                                                                                                                                                ConsesLow
                                                                                                                                                                                                                                                                    .list(
                                                                                                                                                                                                                                                                        makeKeyword(
                                                                                                                                                                                                                                                                            "ROOT" ),
                                                                                                                                                                                                                                                                        makeKeyword(
                                                                                                                                                                                                                                                                            "FORMULA" ) ) ) ) ) ),
                                                                                                                                                                                                                                ConsesLow
                                                                                                                                                                                                                                    .list(
                                                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                                                            "CSOME" ),
                                                                                                                                                                                                                                        ConsesLow
                                                                                                                                                                                                                                            .list(
                                                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                                                    "POSS-RM" ),
                                                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                                                    "POSS-RMS" ),
                                                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                                                    "DONE2?" ) ),
                                                                                                                                                                                                                                        ConsesLow
                                                                                                                                                                                                                                            .list(
                                                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                                                    "PWHEN" ),
                                                                                                                                                                                                                                                ConsesLow
                                                                                                                                                                                                                                                    .list(
                                                                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                                                                            "CAND" ),
                                                                                                                                                                                                                                                        ConsesLow
                                                                                                                                                                                                                                                            .list(
                                                                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                                                                    "RM-P" ),
                                                                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                                                                    "POSS-RM" ) ),
                                                                                                                                                                                                                                                        ConsesLow
                                                                                                                                                                                                                                                            .list(
                                                                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                                                                    "NULL" ),
                                                                                                                                                                                                                                                                ConsesLow
                                                                                                                                                                                                                                                                    .list(
                                                                                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                                                                                            "GET-SLOT" ),
                                                                                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                                                                                            "POSS-RM" ),
                                                                                                                                                                                                                                                                        ConsesLow
                                                                                                                                                                                                                                                                            .list(
                                                                                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                                                                                    "QUOTE" ),
                                                                                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                                                                                    "TARGET-VAR" ) ) ) ) ),
                                                                                                                                                                                                                                                ConsesLow
                                                                                                                                                                                                                                                    .list(
                                                                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                                                                            "CSETQ" ),
                                                                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                                                                            "RM" ),
                                                                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                                                                            "POSS-RM" ) ),
                                                                                                                                                                                                                                                ConsesLow
                                                                                                                                                                                                                                                    .list(
                                                                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                                                                            "CSETQ" ),
                                                                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                                                                            "DONE?" ),
                                                                                                                                                                                                                                                        T ),
                                                                                                                                                                                                                                                ConsesLow
                                                                                                                                                                                                                                                    .list(
                                                                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                                                                            "CSETQ" ),
                                                                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                                                                            "DONE2?" ),
                                                                                                                                                                                                                                                        T ) ) ) ) ) ),
                                                                                                                                                                                                ConsesLow.list( makeSymbol(
                                                                                                                                                                                                    "PWHEN" ), ConsesLow
                                                                                                                                                                                                        .list( makeSymbol(
                                                                                                                                                                                                            "RM-P" ),
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "RM" ) ),
                                                                                                                                                                                                    ConsesLow.list(
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "SET-SLOT" ),
                                                                                                                                                                                                        makeSymbol( "RM" ),
                                                                                                                                                                                                        ConsesLow.list(
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "QUOTE" ),
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "TARGET-VAR" ) ),
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "INTRODUCED-VAR" ) ),
                                                                                                                                                                                                    ConsesLow.list(
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "SET-SLOT" ),
                                                                                                                                                                                                        makeSymbol( "RM" ),
                                                                                                                                                                                                        ConsesLow.list(
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "QUOTE" ),
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "SCOPE" ) ),
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "NEW-COMPLEX-FORMULA-ARG0" ) ),
                                                                                                                                                                                                    ConsesLow.list(
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "DRT-TRACE-PROGN" ),
                                                                                                                                                                                                        FOUR_INTEGER,
                                                                                                                                                                                                        ConsesLow.list(
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "FORMAT" ),
                                                                                                                                                                                                            T, makeString(
                                                                                                                                                                                                                "~%-2--------------- modified RM:" ) ),
                                                                                                                                                                                                        ConsesLow.list(
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "DESCRIBE-INSTANCE" ),
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "RM" ) ),
                                                                                                                                                                                                        ConsesLow.list(
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "FORMAT" ),
                                                                                                                                                                                                            T, makeString(
                                                                                                                                                                                                                "-2-----------~%" ) ) ) ) ) ),
                                                                                                                                                                                        ConsesLow.list( ConsesLow.list(
                                                                                                                                                                                            makeSymbol( "ISA?" ),
                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                "NEW-COMPLEX-FORMULA-ARG0" ),
                                                                                                                                                                                            constant_handles
                                                                                                                                                                                                .reader_make_constant_shell(
                                                                                                                                                                                                    makeString(
                                                                                                                                                                                                        "LogicalConnective" ) ) ),
                                                                                                                                                                                            ConsesLow.list( makeSymbol(
                                                                                                                                                                                                "CLET" ), ConsesLow.list(
                                                                                                                                                                                                    ConsesLow.list(
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "INTRODUCED-VAR" ),
                                                                                                                                                                                                        ConsesLow.list(
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "SECOND" ),
                                                                                                                                                                                                            ConsesLow.list(
                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                    "SECOND" ),
                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                    "NEW-COMPLEX-FORMULA" ) ) ) ),
                                                                                                                                                                                                    ConsesLow.list(
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "UNIQUE-VAR" ),
                                                                                                                                                                                                        ConsesLow.list(
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "MAKE-EL-VAR" ),
                                                                                                                                                                                                            ConsesLow.list(
                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                    "FORMAT" ),
                                                                                                                                                                                                                NIL,
                                                                                                                                                                                                                makeString(
                                                                                                                                                                                                                    "DRT-~A" ),
                                                                                                                                                                                                                ConsesLow
                                                                                                                                                                                                                    .list(
                                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                                            "INTEGER-SEQUENCE-GENERATOR-NEXT" ),
                                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                                            "*DRT-INTRODUCED-VAR-NUM-ISG*" ) ) ) ) ) ),
                                                                                                                                                                                                ConsesLow.list( makeSymbol(
                                                                                                                                                                                                    "PWHEN" ), ConsesLow
                                                                                                                                                                                                        .list( makeSymbol(
                                                                                                                                                                                                            "EL-VAR?" ),
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "INTRODUCED-VAR" ) ),
                                                                                                                                                                                                    ConsesLow.list(
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "CSETQ" ),
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "NEW-COMPLEX-FORMULA" ),
                                                                                                                                                                                                        ConsesLow.list(
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "TREE-SUBSTITUTE" ),
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "NEW-COMPLEX-FORMULA" ),
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "INTRODUCED-VAR" ),
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "UNIQUE-VAR" ) ) ) ) ),
                                                                                                                                                                                            ConsesLow.list( makeSymbol(
                                                                                                                                                                                                "PROGN" ), ConsesLow.list(
                                                                                                                                                                                                    makeSymbol( "CPUSH" ),
                                                                                                                                                                                                    makeSymbol(
                                                                                                                                                                                                        "NEW-COMPLEX-FORMULA" ),
                                                                                                                                                                                                    makeSymbol(
                                                                                                                                                                                                        "COMPLEX-FORMULAS" ) ),
                                                                                                                                                                                                ConsesLow.list( makeSymbol(
                                                                                                                                                                                                    "CSETQ" ), makeSymbol(
                                                                                                                                                                                                        "CYCL-FORMULAS" ),
                                                                                                                                                                                                    ConsesLow.list(
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "SET-SLOT" ),
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "SELF" ),
                                                                                                                                                                                                        ConsesLow.list(
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "QUOTE" ),
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "CYCL-FORMULAS" ) ),
                                                                                                                                                                                                        ConsesLow.list(
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "APPEND" ),
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "COMPLEX-FORMULAS" ),
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "SIMPLE-FORMULAS" ) ) ) ) ),
                                                                                                                                                                                            ConsesLow.list( makeSymbol(
                                                                                                                                                                                                "CLET" ), ConsesLow.list(
                                                                                                                                                                                                    ConsesLow.list(
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "INTRODUCED-VAR" ),
                                                                                                                                                                                                        ConsesLow.list(
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "SECOND" ),
                                                                                                                                                                                                            ConsesLow.list(
                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                    "SECOND" ),
                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                    "NEW-COMPLEX-FORMULA" ) ) ) ),
                                                                                                                                                                                                    ConsesLow.list(
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "TARGET-TERM" ),
                                                                                                                                                                                                        ConsesLow.list(
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "THIRD" ),
                                                                                                                                                                                                            ConsesLow.list(
                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                    "SECOND" ),
                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                    "NEW-COMPLEX-FORMULA" ) ) ) ),
                                                                                                                                                                                                    ConsesLow.list(
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "POSS-RMS" ),
                                                                                                                                                                                                        ConsesLow.list(
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "FUNCALL-INSTANCE-METHOD" ),
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "SELF" ),
                                                                                                                                                                                                            ConsesLow.list(
                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                    "QUOTE" ),
                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                    "FIND-RM-BY-TARGET" ) ),
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "TARGET-TERM" ),
                                                                                                                                                                                                            ConsesLow.list(
                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                    "QUOTE" ),
                                                                                                                                                                                                                ConsesLow
                                                                                                                                                                                                                    .list(
                                                                                                                                                                                                                        makeKeyword(
                                                                                                                                                                                                                            "ROOT" ) ) ) ) ),
                                                                                                                                                                                                    makeSymbol( "RM" ) ),
                                                                                                                                                                                                ConsesLow.list( makeSymbol(
                                                                                                                                                                                                    "CLET" ), ConsesLow
                                                                                                                                                                                                        .list( makeSymbol(
                                                                                                                                                                                                            "DONE?" ) ),
                                                                                                                                                                                                    ConsesLow.list(
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "CSOME" ),
                                                                                                                                                                                                        ConsesLow.list(
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "POSS-RM" ),
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "POSS-RMS" ),
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "DONE?" ) ),
                                                                                                                                                                                                        ConsesLow.list(
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "PWHEN" ),
                                                                                                                                                                                                            ConsesLow.list(
                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                    "CAND" ),
                                                                                                                                                                                                                ConsesLow
                                                                                                                                                                                                                    .list(
                                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                                            "RM-P" ),
                                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                                            "POSS-RM" ) ),
                                                                                                                                                                                                                ConsesLow
                                                                                                                                                                                                                    .list(
                                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                                            "NULL" ),
                                                                                                                                                                                                                        ConsesLow
                                                                                                                                                                                                                            .list(
                                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                                    "GET-SLOT" ),
                                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                                    "POSS-RM" ),
                                                                                                                                                                                                                                ConsesLow
                                                                                                                                                                                                                                    .list(
                                                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                                                            "QUOTE" ),
                                                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                                                            "TARGET-VAR" ) ) ) ) ),
                                                                                                                                                                                                            ConsesLow.list(
                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                    "CSETQ" ),
                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                    "RM" ),
                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                    "POSS-RM" ) ),
                                                                                                                                                                                                            ConsesLow.list(
                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                    "CSETQ" ),
                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                    "DONE?" ),
                                                                                                                                                                                                                T ) ) ) ),
                                                                                                                                                                                                ConsesLow.list( makeSymbol(
                                                                                                                                                                                                    "SET-SLOT" ),
                                                                                                                                                                                                    makeSymbol( "RM" ),
                                                                                                                                                                                                    ConsesLow.list(
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "QUOTE" ),
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "TARGET-VAR" ) ),
                                                                                                                                                                                                    makeSymbol(
                                                                                                                                                                                                        "INTRODUCED-VAR" ) ),
                                                                                                                                                                                                ConsesLow.list( makeSymbol(
                                                                                                                                                                                                    "SET-SLOT" ),
                                                                                                                                                                                                    makeSymbol( "RM" ),
                                                                                                                                                                                                    ConsesLow.list(
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "QUOTE" ),
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "SCOPE" ) ),
                                                                                                                                                                                                    constant_handles
                                                                                                                                                                                                        .reader_make_constant_shell(
                                                                                                                                                                                                            makeString(
                                                                                                                                                                                                                "forAll" ) ) ),
                                                                                                                                                                                                ConsesLow.list( makeSymbol(
                                                                                                                                                                                                    "DRT-TRACE-PROGN" ),
                                                                                                                                                                                                    FOUR_INTEGER, ConsesLow
                                                                                                                                                                                                        .list( makeSymbol(
                                                                                                                                                                                                            "FORMAT" ), T,
                                                                                                                                                                                                            makeString(
                                                                                                                                                                                                                "~%-3--------------- modified RM:" ) ),
                                                                                                                                                                                                    ConsesLow.list(
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "DESCRIBE-INSTANCE" ),
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "RM" ) ),
                                                                                                                                                                                                    ConsesLow.list(
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "FORMAT" ), T,
                                                                                                                                                                                                        makeString(
                                                                                                                                                                                                            "-3-----------~%" ) ) ) ) ),
                                                                                                                                                                                        ConsesLow.list( T, ConsesLow.list(
                                                                                                                                                                                            makeSymbol( "PROGN" ), ConsesLow
                                                                                                                                                                                                .list( makeSymbol(
                                                                                                                                                                                                    "CPUSH" ), makeSymbol(
                                                                                                                                                                                                        "NEW-COMPLEX-FORMULA" ),
                                                                                                                                                                                                    makeSymbol(
                                                                                                                                                                                                        "COMPLEX-FORMULAS" ) ),
                                                                                                                                                                                            ConsesLow.list( makeSymbol(
                                                                                                                                                                                                "CSETQ" ), makeSymbol(
                                                                                                                                                                                                    "CYCL-FORMULAS" ),
                                                                                                                                                                                                ConsesLow.list( makeSymbol(
                                                                                                                                                                                                    "SET-SLOT" ),
                                                                                                                                                                                                    makeSymbol( "SELF" ),
                                                                                                                                                                                                    ConsesLow.list(
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "QUOTE" ),
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "CYCL-FORMULAS" ) ),
                                                                                                                                                                                                    ConsesLow.list(
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "APPEND" ),
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "COMPLEX-FORMULAS" ),
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "SIMPLE-FORMULAS" ) ) ) ) ) ) ) ) ) ) ) ) ) ) ),
                    ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "SIMPLE-FORMULAS" ), ConsesLow.list( makeSymbol( "DRT-TRACE-PROGN" ), THREE_INTEGER, ConsesLow.list( makeSymbol( "DRT-WARN" ), makeString(
                        "1.d. subcollection processing~%" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-SIMPLE-FORMULAS" ), NIL ), ConsesLow.list( makeSymbol(
                            "NEW-COMPLEX-FORMULAS" ), makeSymbol( "COMPLEX-FORMULAS" ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "SIMPLE-FORMULA" ), makeSymbol( "SIMPLE-FORMULAS" ) ),
                                ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "POSS-NEW-FORMULA" ), ConsesLow.list( makeSymbol( "REFORMULATE-CYCL-SUBCOLLPROC" ), makeSymbol(
                                    "SIMPLE-FORMULA" ), makeSymbol( "INTERACTION-MT" ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol(
                                        "POSS-NEW-FORMULA" ) ), ConsesLow.list( EQUAL, makeSymbol( "POSS-NEW-FORMULA" ), makeSymbol( "SIMPLE-FORMULA" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol(
                                            "SIMPLE-FORMULA" ), makeSymbol( "NEW-SIMPLE-FORMULAS" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "POSS-NEW-FORMULA" ), makeSymbol(
                                                "NEW-COMPLEX-FORMULAS" ) ) ) ) ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SIMPLE-FORMULAS" ), makeSymbol(
                                                    "NEW-SIMPLE-FORMULAS" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "COMPLEX-FORMULAS" ), makeSymbol( "NEW-COMPLEX-FORMULAS" ) ), ConsesLow.list( makeSymbol(
                                                        "CSETQ" ), makeSymbol( "CYCL-FORMULAS" ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                            "CYCL-FORMULAS" ) ), ConsesLow.list( makeSymbol( "APPEND" ), makeSymbol( "COMPLEX-FORMULAS" ), makeSymbol( "SIMPLE-FORMULAS" ) ) ) ) ) ) ), ConsesLow.list(
                                                                makeSymbol( "PWHEN" ), makeSymbol( "SIMPLE-FORMULAS" ), ConsesLow.list( makeSymbol( "DRT-TRACE-PROGN" ), THREE_INTEGER, ConsesLow.list( makeSymbol(
                                                                    "DRT-WARN" ), makeString( "1.e. simple formulas~%" ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "SIMPLE-FORMULA" ),
                                                                        makeSymbol( "SIMPLE-FORMULAS" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SIMPLE-CONDITION" ), ConsesLow
                                                                            .list( makeSymbol( "DRT-DRS-MAP-ADD-RMS-TO-FORMULA" ), makeSymbol( "SELF" ), makeSymbol( "SIMPLE-FORMULA" ) ) ) ), ConsesLow.list( makeSymbol(
                                                                                "CDOLIST" ), ConsesLow.list( makeSymbol( "RM" ), ConsesLow.list( makeSymbol( "TREE-FIND-ALL-IF" ), ConsesLow.list( makeSymbol( "FUNCTION" ),
                                                                                    makeSymbol( "RM-P" ) ), makeSymbol( "SIMPLE-CONDITION" ) ) ), ConsesLow.list( makeSymbol( "PCASE" ), ConsesLow.list( makeSymbol(
                                                                                        "GET-SLOT" ), makeSymbol( "RM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "TYPE" ) ) ), ConsesLow.list( makeKeyword(
                                                                                            "DEFINITE" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DEFINITE-RMS" ), ConsesLow.list( makeSymbol(
                                                                                                "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ADD-DEFINITE-RM" ) ),
                                                                                                makeSymbol( "RM" ) ) ) ), ConsesLow.list( makeKeyword( "PRONOMIAL" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                                                                                                    "PRONOMIAL-RMS" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list(
                                                                                                        makeSymbol( "QUOTE" ), makeSymbol( "ADD-PRONOMIAL-RM" ) ), makeSymbol( "RM" ) ) ) ), ConsesLow.list( makeSymbol(
                                                                                                            "OTHERWISE" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "AVAILABLE-RMS" ), ConsesLow.list( makeSymbol(
                                                                                                                "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                                                                    "ADD-AVAILABLE-RM" ) ), makeSymbol( "RM" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                                                                                                                        "SIMPLE-CONDITIONS" ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow
                                                                                                                            .list( makeSymbol( "QUOTE" ), makeSymbol( "SIMPLE-CONDITIONS" ) ), ConsesLow.list( makeSymbol(
                                                                                                                                "CONS" ), makeSymbol( "SIMPLE-CONDITION" ), makeSymbol( "SIMPLE-CONDITIONS" ) ) ) ) ) ),
                                                                ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SIMPLE-FORMULAS" ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ),
                                                                    makeSymbol( "CYCL-FORMULAS" ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                        "CYCL-FORMULAS" ) ), makeSymbol( "COMPLEX-FORMULAS" ) ) ) ) ), ConsesLow.list( makeSymbol( "DRT-TRACE-PROGN" ), TWO_INTEGER, ConsesLow.list(
                                                                            makeSymbol( "PUNLESS" ), makeSymbol( "CYCL-FORMULAS" ), ConsesLow.list( makeSymbol( "FORMAT" ), T, makeString(
                                                                                "~%******************** FINAL DRS ********************~%" ) ), ConsesLow.list( makeSymbol( "DESCRIBE-INSTANCE" ), makeSymbol(
                                                                                    "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), makeSymbol( "CYCL-FORMULAS" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list(
                                                                                        makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PROCESS" ) ),
                                                                                        makeSymbol( "CARRY-POSSIBLE-RM-COREFERENCES" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
                                                                                            "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                                                "FIND-ALL-POSSIBLE-RM-COREFERENCES" ) ) ) ) ) ) );
  }

  @Override
  public void declareFunctions()
  {
    declare_drt_drs_file();
  }

  @Override
  public void initializeVariables()
  {
    init_drt_drs_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_drt_drs_file();
  }
  static
  {
    me = new drt_drs();
    $drt_drs_quant_calls$ = null;
    $drt_put_available_rms_to_top_level_drs$ = null;
    $drt_quantproc_hint_fns$ = null;
    $drt_introduced_var_num_isg$ = null;
    $drt_possible_rm_coreferences_prev_drs_biases$ = null;
    $drt_possible_rm_coreferences_max_depth$ = null;
    $list0 = ConsesLow.list( ConsesLow.list( makeKeyword( "QUANTPROC-3" ), makeSymbol( "TRY-PROCESS-REFORMULATOR-FOR-QUANTPROC-3?" ), makeSymbol( "REFORMULATE-CYCL-QUANTPROC-3" ), makeKeyword( "PARSING-MT" ) ), ConsesLow
        .list( makeKeyword( "VPPPROC-NONSTATE" ), makeSymbol( "TRY-PROCESS-REFORMULATOR-FOR-VPPPROC-NONSTATE?" ), makeSymbol( "REFORMULATE-CYCL-VPPPROC-NONSTATE" ), makeKeyword( "PARSING-MT" ) ), ConsesLow.list(
            makeKeyword( "VPPPROC-STATE" ), makeSymbol( "TRY-PROCESS-REFORMULATOR-FOR-VPPPROC-STATE?" ), makeSymbol( "REFORMULATE-CYCL-VPPPROC-STATE" ), makeKeyword( "PARSING-MT" ) ) );
    $sym1$DRS = makeSymbol( "DRS" );
    $sym2$OBJECT = makeSymbol( "OBJECT" );
    $list3 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "SPEAKER" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "AUDIENCE" ), makeKeyword( "INSTANCE" ),
        makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "RMS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "AVAILABLE-RMS" ), makeKeyword( "INSTANCE" ), makeKeyword(
            "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEFINITE-RMS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "PRONOMIAL-RMS" ), makeKeyword( "INSTANCE" ), makeKeyword(
                "PROTECTED" ) ), ConsesLow.list( makeSymbol( "PREV-DRS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "NEXT-DRS" ), makeKeyword( "INSTANCE" ), makeKeyword(
                    "PROTECTED" ) ), ConsesLow.list( makeSymbol( "SUPER-DRS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "SUB-DRSS" ), makeKeyword( "INSTANCE" ), makeKeyword(
                        "PROTECTED" ) ), ConsesLow.list( makeSymbol( "CYCL-FORMULAS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "SIMPLE-CONDITIONS" ), makeKeyword(
                            "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "COMPLEX-CONDITIONS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                                "INTERACTION-MT" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "PARSING-MT" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow
                                    .list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ADD-RM" ), ConsesLow.list( makeSymbol( "NEW-RM" ) ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                                        "ADD-AVAILABLE-RM" ), ConsesLow.list( makeSymbol( "NEW-RM" ) ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ADD-DEFINITE-RM" ), ConsesLow.list( makeSymbol(
                                            "NEW-RM" ) ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ADD-PRONOMIAL-RM" ), ConsesLow.list( makeSymbol( "NEW-RM" ) ) ), ConsesLow.list( makeSymbol(
                                                "DEF-INSTANCE-METHOD" ), makeSymbol( "PROCESS" ), ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "CARRY-POSSIBLE-RM-COREFERENCES" ) ), makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FIND-RM-BY-TARGET" ), ConsesLow.list( makeSymbol( "TARGET" ), makeSymbol( "TARGET-TYPE" ) ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
          makeSymbol( "FIND-ALL-POSSIBLE-RM-COREFERENCES" ), NIL ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FIND-POSSIBLE-RM-COREFERENCES" ), ConsesLow.list( makeSymbol( "RM" ), makeSymbol(
              "&OPTIONAL" ), ConsesLow.list( makeSymbol( "DEPTH" ), FIVE_INTEGER ), ConsesLow.list( makeSymbol( "CUTOFF" ), NIL ) ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CONSTRUCT-CYCL" ),
                  NIL, makeKeyword( "PUBLIC" ) )
    } );
    $sym4$PARSING_MT = makeSymbol( "PARSING-MT" );
    $sym5$INTERACTION_MT = makeSymbol( "INTERACTION-MT" );
    $sym6$COMPLEX_CONDITIONS = makeSymbol( "COMPLEX-CONDITIONS" );
    $sym7$SIMPLE_CONDITIONS = makeSymbol( "SIMPLE-CONDITIONS" );
    $sym8$CYCL_FORMULAS = makeSymbol( "CYCL-FORMULAS" );
    $sym9$SUB_DRSS = makeSymbol( "SUB-DRSS" );
    $sym10$SUPER_DRS = makeSymbol( "SUPER-DRS" );
    $sym11$NEXT_DRS = makeSymbol( "NEXT-DRS" );
    $sym12$PREV_DRS = makeSymbol( "PREV-DRS" );
    $sym13$PRONOMIAL_RMS = makeSymbol( "PRONOMIAL-RMS" );
    $sym14$DEFINITE_RMS = makeSymbol( "DEFINITE-RMS" );
    $sym15$AVAILABLE_RMS = makeSymbol( "AVAILABLE-RMS" );
    $sym16$RMS = makeSymbol( "RMS" );
    $sym17$AUDIENCE = makeSymbol( "AUDIENCE" );
    $sym18$SPEAKER = makeSymbol( "SPEAKER" );
    $sym19$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym20$SUBLOOP_RESERVED_INITIALIZE_DRS_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-DRS-CLASS" );
    $sym21$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym22$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym23$SUBLOOP_RESERVED_INITIALIZE_DRS_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-DRS-INSTANCE" );
    $sym24$ADD_RM = makeSymbol( "ADD-RM" );
    $list25 = ConsesLow.list( makeSymbol( "NEW-RM" ) );
    $list26 = ConsesLow.list( ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "MEMBER?" ), makeSymbol( "NEW-RM" ), makeSymbol( "RMS" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "RMS" ),
        ConsesLow.list( makeSymbol( "CONS" ), makeSymbol( "NEW-RM" ), makeSymbol( "RMS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "RMS" ) ) );
    $sym27$OUTER_CATCH_FOR_DRS_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-DRS-METHOD" );
    $sym28$DRS_ADD_RM_METHOD = makeSymbol( "DRS-ADD-RM-METHOD" );
    $sym29$ADD_AVAILABLE_RM = makeSymbol( "ADD-AVAILABLE-RM" );
    $list30 = ConsesLow.list( ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "MEMBER?" ), makeSymbol( "NEW-RM" ), makeSymbol( "AVAILABLE-RMS" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
        "AVAILABLE-RMS" ), ConsesLow.list( makeSymbol( "CONS" ), makeSymbol( "NEW-RM" ), makeSymbol( "AVAILABLE-RMS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "AVAILABLE-RMS" ) ) );
    $sym31$OUTER_CATCH_FOR_DRS_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-DRS-METHOD" );
    $sym32$DRS_ADD_AVAILABLE_RM_METHOD = makeSymbol( "DRS-ADD-AVAILABLE-RM-METHOD" );
    $sym33$ADD_DEFINITE_RM = makeSymbol( "ADD-DEFINITE-RM" );
    $list34 = ConsesLow.list( ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "MEMBER?" ), makeSymbol( "NEW-RM" ), makeSymbol( "DEFINITE-RMS" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
        "DEFINITE-RMS" ), ConsesLow.list( makeSymbol( "CONS" ), makeSymbol( "NEW-RM" ), makeSymbol( "DEFINITE-RMS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "DEFINITE-RMS" ) ) );
    $sym35$OUTER_CATCH_FOR_DRS_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-DRS-METHOD" );
    $sym36$DRS_ADD_DEFINITE_RM_METHOD = makeSymbol( "DRS-ADD-DEFINITE-RM-METHOD" );
    $sym37$ADD_PRONOMIAL_RM = makeSymbol( "ADD-PRONOMIAL-RM" );
    $list38 = ConsesLow.list( ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "MEMBER?" ), makeSymbol( "NEW-RM" ), makeSymbol( "PRONOMIAL-RMS" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
        "PRONOMIAL-RMS" ), ConsesLow.list( makeSymbol( "CONS" ), makeSymbol( "NEW-RM" ), makeSymbol( "PRONOMIAL-RMS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "PRONOMIAL-RMS" ) ) );
    $sym39$OUTER_CATCH_FOR_DRS_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-DRS-METHOD" );
    $sym40$DRS_ADD_PRONOMIAL_RM_METHOD = makeSymbol( "DRS-ADD-PRONOMIAL-RM-METHOD" );
    $sym41$NEW = makeSymbol( "NEW" );
    $str42$_______________________INITIAL_RM = makeString( "~%******************** INITIAL RMS ********************~%" );
    $str43$__ = makeString( "~%" );
    $sym44$FIND_RM_BY_TARGET = makeSymbol( "FIND-RM-BY-TARGET" );
    $list45 = ConsesLow.list( makeKeyword( "ROOT" ) );
    $sym46$TYPE = makeSymbol( "TYPE" );
    $kw47$AVAILABLE = makeKeyword( "AVAILABLE" );
    $str48$_______________________INITIAL_DR = makeString( "~%******************** INITIAL DRS ********************~%" );
    $list49 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NLSemFn" ) ), constant_handles.reader_make_constant_shell( makeString( "NLNumberFn" ) ), constant_handles
        .reader_make_constant_shell( makeString( "NLTagFn" ) ), constant_handles.reader_make_constant_shell( makeString( "SomeFn" ) ), constant_handles.reader_make_constant_shell( makeString( "NLDefinitenessFn-3" ) ),
        constant_handles.reader_make_constant_shell( makeString( "NLQuantFn-3" ) ) );
    $const50$EnglishLexiconMt = constant_handles.reader_make_constant_shell( makeString( "EnglishLexiconMt" ) );
    $const51$Quantifier = constant_handles.reader_make_constant_shell( makeString( "Quantifier" ) );
    $const52$LogicalConnective = constant_handles.reader_make_constant_shell( makeString( "LogicalConnective" ) );
    $const53$NLNegFn = constant_handles.reader_make_constant_shell( makeString( "NLNegFn" ) );
    $const54$explains_PropProp = constant_handles.reader_make_constant_shell( makeString( "explains-PropProp" ) );
    $sym55$DRT_COMPLEX_FORMULA_ELEMENT = makeSymbol( "DRT-COMPLEX-FORMULA-ELEMENT" );
    $sym56$PROCESS = makeSymbol( "PROCESS" );
    $list57 = ConsesLow.list( makeKeyword( "READ-ONLY" ) );
    $list58 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "CARRY-POSSIBLE-RM-COREFERENCES" ) );
    $list59 = _constant_59_initializer();
    $str60$___drs_process_method__A_ = makeString( "~%(drs-process-method ~A)" );
    $str61$drt_process_drs__more_than_one_co = makeString( "drt-process-drs: more than one complex formula in drs ~A ~A~%" );
    $str62$1_a__quantifiers___ = makeString( "1.a. quantifiers.~%" );
    $list63 = ConsesLow.list( makeKeyword( "VAR" ) );
    $str64$drt_process_drs__A__no_RM_found_f = makeString( "drt-process-drs ~A: no RM found for var ~A in complex-formula ~A~%" );
    $sym65$SCOPE = makeSymbol( "SCOPE" );
    $str66$_1________________modified_RM_ = makeString( "-1--------------- modified RM:" );
    $str67$_1_____________ = makeString( "-1-----------~%" );
    $str68$1_b__logical_connectives___ = makeString( "1.b. logical connectives.~%" );
    $const69$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $str70$1_c__quantproc__ = makeString( "1.c. quantproc~%" );
    $str71$Attempting_reformulation_on_____A = makeString( "Attempting reformulation on: ~%~A~%" );
    $kw72$PARSING_MT = makeKeyword( "PARSING-MT" );
    $kw73$INTERACTION_MT = makeKeyword( "INTERACTION-MT" );
    $str74$Attempting_reformulation_type__A_ = makeString( "Attempting reformulation type ~A, mt=~A~%" );
    $str75$Using_reformulator_result_from__A = makeString( "Using reformulator result from ~A: ~A~%" );
    $str76$failed_reformulation_on__A__new_c = makeString( "failed reformulation on ~A: new-complex-formula is NULL." );
    $str77$failed_reformulation_on__A__new_c = makeString( "failed reformulation on ~A: new-complex-formula is IDENTICAL." );
    $str78$DRT__A = makeString( "DRT-~A" );
    $list79 = ConsesLow.list( makeKeyword( "ROOT" ), makeKeyword( "FORMULA" ) );
    $sym80$TARGET_VAR = makeSymbol( "TARGET-VAR" );
    $str81$___2________________modified_RM_ = makeString( "~%-2--------------- modified RM:" );
    $str82$_2_____________ = makeString( "-2-----------~%" );
    $const83$forAll = constant_handles.reader_make_constant_shell( makeString( "forAll" ) );
    $str84$___3________________modified_RM_ = makeString( "~%-3--------------- modified RM:" );
    $str85$_3_____________ = makeString( "-3-----------~%" );
    $str86$1_d__subcollection_processing__ = makeString( "1.d. subcollection processing~%" );
    $str87$1_e__simple_formulas__ = makeString( "1.e. simple formulas~%" );
    $kw88$DEFINITE = makeKeyword( "DEFINITE" );
    $kw89$PRONOMIAL = makeKeyword( "PRONOMIAL" );
    $sym90$RM_P = makeSymbol( "RM-P" );
    $str91$_______________________FINAL_DRS_ = makeString( "~%******************** FINAL DRS ********************~%" );
    $sym92$FIND_ALL_POSSIBLE_RM_COREFERENCES = makeSymbol( "FIND-ALL-POSSIBLE-RM-COREFERENCES" );
    $sym93$DRS_PROCESS_METHOD = makeSymbol( "DRS-PROCESS-METHOD" );
    $list94 = ConsesLow.list( makeString( "Returns a list of lists of the form (RM ((POSS-RM-1 PROB-1) (POSS-RM-2 PROB-2) ...)) indicating the probabiltiy of each possible RM coreference in this DRS." ), ConsesLow.list(
        makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "RESULT" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "SUB-DRSS" ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "SUB-DRS" ),
            makeSymbol( "SUB-DRSS" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "RESULT" ), ConsesLow.list( makeSymbol( "APPEND" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol(
                "SUB-DRS" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND-ALL-POSSIBLE-RM-COREFERENCES" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "PRONOMIAL-RMS" ), ConsesLow.list(
                    makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "PRONOMIAL-RM" ), makeSymbol( "PRONOMIAL-RMS" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                        "POSSIBLE-RM-COREFERENCES" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND-POSSIBLE-RM-COREFERENCES" ) ),
                            makeSymbol( "PRONOMIAL-RM" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "POSSIBLE-RM-COREFERENCES" ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol(
                                "BQ-LIST" ), makeSymbol( "PRONOMIAL-RM" ), makeSymbol( "POSSIBLE-RM-COREFERENCES" ) ), makeSymbol( "RESULT" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "RESULT" ) ) ) );
    $sym95$FIND_POSSIBLE_RM_COREFERENCES = makeSymbol( "FIND-POSSIBLE-RM-COREFERENCES" );
    $sym96$DRS_FIND_ALL_POSSIBLE_RM_COREFERENCES_METHOD = makeSymbol( "DRS-FIND-ALL-POSSIBLE-RM-COREFERENCES-METHOD" );
    $list97 = ConsesLow.list( makeDouble( 1.0 ) );
    $list98 = ConsesLow.list( makeSymbol( "RM" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "DEPTH" ), makeSymbol( "*DRT-POSSIBLE-RM-COREFERENCES-MAX-DEPTH*" ) ), ConsesLow.list( makeSymbol( "CUTOFF" ),
        NIL ) );
    $list99 = ConsesLow.list( makeString(
        "Returns a list of the form ((POSS-RM-1 PROB-1) (POSS-RM-2 PROB-2) ...) indicating the possible coreferences of the specified RM in this DRS.  If DEPTH is specified, we look to DEPTH-1 previous DRSs for possible intersentential coreferences." ),
        ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "CUTOFF" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "POSSIBLE-RM-COREFERENCE-VALUE-PAIRS" ), NIL ) ), ConsesLow
            .list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "RM-FORMULA" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "RM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                "FORMULA" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "FORMULA-ARG0" ), makeSymbol( "RM-FORMULA" ) ), constant_handles.reader_make_constant_shell(
                    makeString( "PronounFn" ) ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "FORMULA-ARG1" ),
                        makeSymbol( "RM-FORMULA" ) ), constant_handles.reader_make_constant_shell( makeString( "FirstPerson-NLAttr" ) ) ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "FORMULA-ARG2" ), makeSymbol(
                            "RM-FORMULA" ) ), constant_handles.reader_make_constant_shell( makeString( "Singular-NLAttr" ) ) ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "FORMULA-ARG3" ), makeSymbol(
                                "RM-FORMULA" ) ), constant_handles.reader_make_constant_shell( makeString( "Ungendered-NLAttr" ) ) ), ConsesLow.list( makeSymbol( "FORT-P" ), makeSymbol( "SPEAKER" ) ) ), ConsesLow.list(
                                    makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "BQ-CONS" ), makeSymbol( "SPEAKER" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeDouble( 1.0 ) ) ) ), makeSymbol(
                                        "POSSIBLE-RM-COREFERENCE-VALUE-PAIRS" ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "FORMULA-ARG1" ), makeSymbol(
                                            "RM-FORMULA" ) ), constant_handles.reader_make_constant_shell( makeString( "SecondPerson-NLAttr" ) ) ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "FORMULA-ARG2" ),
                                                makeSymbol( "RM-FORMULA" ) ), constant_handles.reader_make_constant_shell( makeString( "Singular-NLAttr" ) ) ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol(
                                                    "FORMULA-ARG3" ), makeSymbol( "RM-FORMULA" ) ), constant_handles.reader_make_constant_shell( makeString( "Ungendered-NLAttr" ) ) ) ), ConsesLow.list( makeSymbol(
                                                        "CDOLIST" ), ConsesLow.list( makeSymbol( "AUDIENCE-MEMBER" ), makeSymbol( "AUDIENCE" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol(
                                                            "BQ-CONS" ), makeSymbol( "AUDIENCE-MEMBER" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeDouble( 1.0 ) ) ) ), makeSymbol(
                                                                "POSSIBLE-RM-COREFERENCE-VALUE-PAIRS" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "AVAILABLE-RM" ), makeSymbol(
                                                                    "AVAILABLE-RMS" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), makeSymbol( "AVAILABLE-RM" ), ConsesLow.list(
                                                                        makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "RM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "COREFERENCE-PROBABILITY" ) ),
                                                                        makeSymbol( "AVAILABLE-RM" ) ) ), makeSymbol( "POSSIBLE-RM-COREFERENCE-VALUE-PAIRS" ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list(
                                                                            makeSymbol( "DEFINITE-RM" ), makeSymbol( "DEFINITE-RMS" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "BQ-LIST" ),
                                                                                makeSymbol( "DEFINITE-RM" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "RM" ), ConsesLow.list( makeSymbol(
                                                                                    "QUOTE" ), makeSymbol( "COREFERENCE-PROBABILITY" ) ), makeSymbol( "DEFINITE-RM" ) ) ), makeSymbol(
                                                                                        "POSSIBLE-RM-COREFERENCE-VALUE-PAIRS" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                                                                                            "BACK-DRS" ), NIL ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( makeSymbol( "SUPER-DRS" ), ConsesLow.list(
                                                                                                makeSymbol( "CSETQ" ), makeSymbol( "BACK-DRS" ), makeSymbol( "SUPER-DRS" ) ) ), ConsesLow.list( makeSymbol( "PREV-DRS" ),
                                                                                                    ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( ">" ), makeSymbol( "DEPTH" ), ZERO_INTEGER ),
                                                                                                        ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DEPTH" ), ConsesLow.list( makeSymbol( "-" ), makeSymbol(
                                                                                                            "DEPTH" ), ONE_INTEGER ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "BACK-DRS" ), makeSymbol(
                                                                                                                "PREV-DRS" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "BACK-DRS" ), ConsesLow.list(
                                                                                                                    makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                                                                                                                        "MORE-POSSIBLE-RM-COREFERENCE-VALUE-PAIRS" ), ConsesLow.list( makeSymbol(
                                                                                                                            "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "BACK-DRS" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                                                                                                                makeSymbol( "FIND-POSSIBLE-RM-COREFERENCES" ) ), makeSymbol( "RM" ), makeSymbol(
                                                                                                                                    "DEPTH" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol(
                                                                                                                                        "MORE-POSSIBLE-RM-COREFERENCE-VALUE-PAIR" ), makeSymbol(
                                                                                                                                            "MORE-POSSIBLE-RM-COREFERENCE-VALUE-PAIRS" ) ), ConsesLow.list( makeSymbol(
                                                                                                                                                "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "POSSIBLE-RM" ),
                                                                                                                                                    ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol(
                                                                                                                                                        "MORE-POSSIBLE-RM-COREFERENCE-VALUE-PAIR" ) ) ), ConsesLow.list(
                                                                                                                                                            makeSymbol( "POSSIBLE-RM-VALUE" ), ConsesLow.list( makeSymbol(
                                                                                                                                                                "SECOND" ), makeSymbol(
                                                                                                                                                                    "MORE-POSSIBLE-RM-COREFERENCE-VALUE-PAIR" ) ) ),
                                                                                                                                                    ConsesLow.list( makeSymbol( "DEPTH-BIAS" ), ConsesLow.list( makeSymbol(
                                                                                                                                                        "NTH" ), makeSymbol( "DEPTH" ), makeSymbol(
                                                                                                                                                            "*DRT-POSSIBLE-RM-COREFERENCES-PREV-DRS-BIASES*" ) ) ) ),
                                                                                                                                                ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "DEPTH-BIAS" ),
                                                                                                                                                    ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DEPTH-BIAS" ),
                                                                                                                                                        makeDouble( 0.0 ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ),
                                                                                                                                                            ConsesLow.list( makeSymbol( "BQ-LIST" ), makeSymbol(
                                                                                                                                                                "POSSIBLE-RM" ), ConsesLow.list( makeSymbol( "*" ),
                                                                                                                                                                    makeSymbol( "POSSIBLE-RM-VALUE" ), makeSymbol(
                                                                                                                                                                        "DEPTH-BIAS" ) ) ), makeSymbol(
                                                                                                                                                                            "POSSIBLE-RM-COREFERENCE-VALUE-PAIRS" ) ) ) ) ) ) ),
            ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "POSSIBLE-RM-COREFERENCE-VALUE-PAIRS" ) ) ) );
    $sym100$OUTER_CATCH_FOR_DRS_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-DRS-METHOD" );
    $sym101$FORMULA = makeSymbol( "FORMULA" );
    $const102$PronounFn = constant_handles.reader_make_constant_shell( makeString( "PronounFn" ) );
    $const103$FirstPerson_NLAttr = constant_handles.reader_make_constant_shell( makeString( "FirstPerson-NLAttr" ) );
    $const104$Singular_NLAttr = constant_handles.reader_make_constant_shell( makeString( "Singular-NLAttr" ) );
    $const105$Ungendered_NLAttr = constant_handles.reader_make_constant_shell( makeString( "Ungendered-NLAttr" ) );
    $const106$SecondPerson_NLAttr = constant_handles.reader_make_constant_shell( makeString( "SecondPerson-NLAttr" ) );
    $sym107$COREFERENCE_PROBABILITY = makeSymbol( "COREFERENCE-PROBABILITY" );
    $float108$0_0 = makeDouble( 0.0 );
    $sym109$DRS_FIND_POSSIBLE_RM_COREFERENCES_METHOD = makeSymbol( "DRS-FIND-POSSIBLE-RM-COREFERENCES-METHOD" );
    $list110 = ConsesLow.list( makeKeyword( "TERM" ), makeKeyword( "VAR" ), makeKeyword( "FORMULA" ) );
    $sym111$ROOT_TERM = makeSymbol( "ROOT-TERM" );
    $const112$SubcollectionOfWithRelationToFn = constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationToFn" ) );
    $const113$SubcollectionOfWithRelationToType = constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationToTypeFn" ) );
    $const114$SubcollectionOfWithRelationFromFn = constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationFromFn" ) );
    $const115$SubcollectionOfWithRelationFromTy = constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationFromTypeFn" ) );
    $list116 = ConsesLow.list( makeSymbol( "TARGET" ), makeSymbol( "TARGET-TYPE" ) );
    $list117 = ConsesLow.list( makeString(
        "Finds an RM by looking at the slots of the RMs in DRS.  There are 4 methods to look for RMs: by the :term or :var assigned to the RM after processing, by the initial formula the RM was created from, and the :root ('root-term') of the formula the RM was created from.  Any combination of these may be specified.  If both :formula and :root are specified, we allow matching to the RMs :mapped-formula such that contained RMs of which are replaced by those RMs :root's.  Also, there is a hack in here to ignore differences in subcollection functions (see drt-corresponding-type-subcol-fn-3 above)." ),
        ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "RM-RESULTS" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "RM" ), makeSymbol( "RMS" ) ),
            ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "MEMBER?" ), makeKeyword( "TERM" ), makeSymbol( "TARGET-TYPE" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol(
                "EQUALS-EL?" ), makeSymbol( "TARGET" ), ConsesLow.list( makeSymbol( "DRT-FORMULA-CONSTRUCT-CYCL" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "RM" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                    makeSymbol( "TARGET-TERM" ) ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "RM" ), makeSymbol( "RM-RESULTS" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol(
                        "MEMBER?" ), makeKeyword( "VAR" ), makeSymbol( "TARGET-TYPE" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( EQUAL, makeSymbol( "TARGET" ), ConsesLow.list( makeSymbol(
                            "DRT-FORMULA-CONSTRUCT-CYCL" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "RM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "TARGET-VAR" ) ) ) ) ), ConsesLow.list(
                                makeSymbol( "CPUSH" ), makeSymbol( "RM" ), makeSymbol( "RM-RESULTS" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "MEMBER?" ), makeKeyword( "FORMULA" ),
                                    makeSymbol( "TARGET-TYPE" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( EQUAL, makeSymbol( "TARGET" ), ConsesLow.list( makeSymbol( "DRT-FORMULA-CONSTRUCT-CYCL" ),
                                        ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "RM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FORMULA" ) ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ),
                                            makeSymbol( "RM" ), makeSymbol( "RM-RESULTS" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "MEMBER?" ), makeKeyword( "ROOT" ), makeSymbol(
                                                "TARGET-TYPE" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "EQUALS-EL?" ), makeSymbol( "TARGET" ), ConsesLow.list( makeSymbol(
                                                    "DRT-FORMULA-CONSTRUCT-CYCL" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "RM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ROOT-TERM" ) ) ) ) ),
                                                    ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "RM" ), makeSymbol( "RM-RESULTS" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol(
                                                        "CAND" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "RM-RESULTS" ) ), ConsesLow.list( makeSymbol( "MEMBER" ), makeKeyword( "FORMULA" ), makeSymbol(
                                                            "TARGET-TYPE" ) ), ConsesLow.list( makeSymbol( "MEMBER" ), makeKeyword( "ROOT" ), makeSymbol( "TARGET-TYPE" ) ) ), ConsesLow.list( makeSymbol( "CLET" ),
                                                                ConsesLow.list( ConsesLow.list( makeSymbol( "RM-UNMAPPED-FORMULA" ), ConsesLow.list( makeSymbol( "TREE-GATHER-TRANSFORMATIONS" ), ConsesLow.list(
                                                                    makeSymbol( "FUNCTION" ), makeSymbol( "DRS-RM-ROOT-TERM-METHOD" ) ), ConsesLow.list( makeSymbol( "COPY-TREE" ), ConsesLow.list( makeSymbol(
                                                                        "GET-SLOT" ), makeSymbol( "RM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "MAPPED-FORMULA" ) ) ) ), ConsesLow.list( makeSymbol(
                                                                            "FUNCTION" ), makeSymbol( "RM-P" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "EQUALS-EL?" ), ConsesLow.list(
                                                                                makeSymbol( "TREE-GATHER-TRANSFORMATIONS" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "DRT-CORRESPONDING-TYPE-SUBCOL-FN-3" ) ),
                                                                                makeSymbol( "TARGET" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "DRT-CORRESPONDING-TYPE-SUBCOL-FN-3" ) ) ), ConsesLow.list(
                                                                                    makeSymbol( "TREE-GATHER-TRANSFORMATIONS" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol(
                                                                                        "DRT-CORRESPONDING-TYPE-SUBCOL-FN-3" ) ), makeSymbol( "RM-UNMAPPED-FORMULA" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol(
                                                                                            "DRT-CORRESPONDING-TYPE-SUBCOL-FN-3" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "RM" ), makeSymbol(
                                                                                                "RM-RESULTS" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "RM-RESULTS" ), ConsesLow.list( makeSymbol(
                                                                                                    "PWHEN" ), makeSymbol( "SUPER-DRS" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "RM-RESULTS" ), ConsesLow.list(
                                                                                                        makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SUPER-DRS" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                                                                                            makeSymbol( "FIND-RM-BY-TARGET" ) ), makeSymbol( "TARGET" ), makeSymbol( "TARGET-TYPE" ) ) ) ) ), ConsesLow
                                                                                                                .list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( ">" ), ConsesLow.list( makeSymbol( "LENGTH" ),
                                                                                                                    makeSymbol( "RM-RESULTS" ) ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list(
                                                                                                                        makeSymbol( "NEW-RM-RESULTS" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list(
                                                                                                                            makeSymbol( "RM-RESULT" ), makeSymbol( "RM-RESULTS" ) ), ConsesLow.list( makeSymbol(
                                                                                                                                "PUNLESS" ), ConsesLow.list( makeSymbol( "TREE-FIND" ), ConsesLow.list( makeSymbol(
                                                                                                                                    "GET-SLOT" ), makeSymbol( "RM-RESULT" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                                                                                                                        makeSymbol( "FORMULA" ) ) ), makeSymbol( "CYCL-FORMULAS" ), ConsesLow.list(
                                                                                                                                            makeSymbol( "FUNCTION" ), EQUAL ) ), ConsesLow.list( makeSymbol( "CPUSH" ),
                                                                                                                                                makeSymbol( "RM-RESULT" ), makeSymbol( "NEW-RM-RESULTS" ) ) ) ), ConsesLow
                                                                                                                                                    .list( makeSymbol( "PWHEN" ), makeSymbol( "NEW-RM-RESULTS" ), ConsesLow
                                                                                                                                                        .list( makeSymbol( "CSETQ" ), makeSymbol( "RM-RESULTS" ),
                                                                                                                                                            makeSymbol( "NEW-RM-RESULTS" ) ) ) ), ConsesLow.list(
                                                                                                                                                                makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( ">" ),
                                                                                                                                                                    ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol(
                                                                                                                                                                        "RM-RESULTS" ) ), ONE_INTEGER ), ConsesLow.list(
                                                                                                                                                                            makeSymbol( "DRT-TRACE-PROGN" ), FOUR_INTEGER,
                                                                                                                                                                            ConsesLow.list( makeSymbol( "DRT-WARN" ),
                                                                                                                                                                                makeString(
                                                                                                                                                                                    "find-rm-by-target: ~A maps to multiple rms ~A~%" ),
                                                                                                                                                                                makeSymbol( "TARGET" ), makeSymbol(
                                                                                                                                                                                    "RM-RESULTS" ) ) ) ) ), ConsesLow.list(
                                                                                                                                                                                        makeSymbol( "RET" ), makeSymbol(
                                                                                                                                                                                            "RM-RESULTS" ) ) ) );
    $sym118$OUTER_CATCH_FOR_DRS_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-DRS-METHOD" );
    $kw119$TERM = makeKeyword( "TERM" );
    $sym120$TARGET_TERM = makeSymbol( "TARGET-TERM" );
    $kw121$VAR = makeKeyword( "VAR" );
    $kw122$FORMULA = makeKeyword( "FORMULA" );
    $kw123$ROOT = makeKeyword( "ROOT" );
    $sym124$DRS_RM_ROOT_TERM_METHOD = makeSymbol( "DRS-RM-ROOT-TERM-METHOD" );
    $sym125$MAPPED_FORMULA = makeSymbol( "MAPPED-FORMULA" );
    $sym126$DRT_CORRESPONDING_TYPE_SUBCOL_FN_3 = makeSymbol( "DRT-CORRESPONDING-TYPE-SUBCOL-FN-3" );
    $str127$find_rm_by_target___A_maps_to_mul = makeString( "find-rm-by-target: ~A maps to multiple rms ~A~%" );
    $sym128$DRS_FIND_RM_BY_TARGET_METHOD = makeSymbol( "DRS-FIND-RM-BY-TARGET-METHOD" );
    $const129$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const130$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $sym131$CONSTRUCT_CYCL = makeSymbol( "CONSTRUCT-CYCL" );
    $list132 = ConsesLow.list( makeString( "Constructs the CycL output that is ready to be predicate/term strengthened, etc. (i.e. it may still contain underpecified vocab)." ), ConsesLow.list( makeSymbol( "CLET" ),
        ConsesLow.list( ConsesLow.list( makeSymbol( "RESULT" ), NIL ), ConsesLow.list( makeSymbol( "SCOPES" ), NIL ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "COMPLEX-CONDITIONS" ), ConsesLow.list(
            makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "COMPLEX-CONDITION" ), makeSymbol( "COMPLEX-CONDITIONS" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CF-CYCL" ),
                ConsesLow.list( makeSymbol( "DRT-COMPLEX-CONDITION-CONSTRUCT-CYCL" ), makeSymbol( "COMPLEX-CONDITION" ), makeSymbol( "INTERACTION-MT" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol(
                    "CF-CYCL" ), makeSymbol( "RESULT" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "SIMPLE-CONDITIONS" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                        "RELEVANT-RMS" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "SIMPLE-CONDITION" ), makeSymbol( "SIMPLE-CONDITIONS" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ),
                            ConsesLow.list( makeSymbol( "POSS-RELEVANT-RM" ), ConsesLow.list( makeSymbol( "REMOVE-IF-NOT" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "RM-P" ) ), makeSymbol(
                                "SIMPLE-CONDITION" ) ) ), ConsesLow.list( makeSymbol( "CPUSHNEW" ), makeSymbol( "POSS-RELEVANT-RM" ), makeSymbol( "RELEVANT-RMS" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow
                                    .list( makeSymbol( "DRT-SIMPLE-CONDITION-CONSTRUCT-CYCL" ), makeSymbol( "SIMPLE-CONDITION" ) ), makeSymbol( "RESULT" ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list(
                                        makeSymbol( "RELEVANT-RM" ), makeSymbol( "RELEVANT-RMS" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "GET-SLOT" ),
                                            makeSymbol( "RELEVANT-RM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SCOPE" ) ) ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( EQ, constant_handles
                                                .reader_make_constant_shell( makeString( "forAll" ) ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "RELEVANT-RM" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                                    makeSymbol( "SCOPE" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol(
                                                        "RELEVANT-RM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SCOPE" ) ) ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "RELEVANT-RM" ), ConsesLow
                                                            .list( makeSymbol( "QUOTE" ), makeSymbol( "TARGET-VAR" ) ) ) ), makeSymbol( "SCOPES" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list(
                                                                makeSymbol( "CDR" ), makeSymbol( "RESULT" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "RESULT" ), ConsesLow.list( makeSymbol( "BQ-CONS" ),
                                                                    constant_handles.reader_make_constant_shell( makeString( "and" ) ), makeSymbol( "RESULT" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                                                                        "RESULT" ), ConsesLow.list( makeSymbol( "CAR" ), makeSymbol( "RESULT" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol(
                                                                            "SCOPE" ), makeSymbol( "SCOPES" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "RESULT" ), ConsesLow.list( makeSymbol( "APPEND" ),
                                                                                makeSymbol( "SCOPE" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "RESULT" ) ) ) ) ), ConsesLow.list( makeSymbol(
                                                                                    "DRT-TRACE-PROGN" ), TWO_INTEGER, ConsesLow.list( makeSymbol( "DRT-TRACE-OUT" ), TWO_INTEGER, makeString(
                                                                                        "~%******************** FINAL CYCL FORMULA ********************~%" ) ), ConsesLow.list( makeSymbol( "DRT-TRACE-OUT" ), TWO_INTEGER,
                                                                                            makeString( "~A~%" ), makeSymbol( "RESULT" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "RESULT" ) ) ) );
    $sym133$OUTER_CATCH_FOR_DRS_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-DRS-METHOD" );
    $str134$_______________________FINAL_CYCL = makeString( "~%******************** FINAL CYCL FORMULA ********************~%" );
    $str135$_A__ = makeString( "~A~%" );
    $sym136$DRS_CONSTRUCT_CYCL_METHOD = makeSymbol( "DRS-CONSTRUCT-CYCL-METHOD" );
  }
}
/*
 * 
 * Total time: 1068 ms
 * 
 */