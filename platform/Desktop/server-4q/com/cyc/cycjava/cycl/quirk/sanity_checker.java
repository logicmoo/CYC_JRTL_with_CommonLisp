package com.cyc.cycjava.cycl.quirk;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.quantities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.cycjava.cycl.pph_main;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.term;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.reformulator_hub;
import com.cyc.cycjava.cycl.psp_main;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.cycjava.cycl.classes;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.instances;
import com.cyc.cycjava.cycl.methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.object;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sanity_checker
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.quirk.sanity_checker";
  public static final String myFingerPrint = "3d57d79ef335aa0dc516f83c9c7da25a37caad135271772735a98db0b2192535";
  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 1151L)
  private static SubLSymbol $sanity_checker$;
  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 1190L)
  private static SubLSymbol $piquant_sanity_checkers$;
  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 14951L)
  private static SubLSymbol $scalar_checker_backchain$;
  private static final SubLSymbol $sym0$SANITY_CHECKER;
  private static final SubLSymbol $sym1$STRINGP;
  private static final SubLSymbol $sym2$PIQUANT_SANITY_CHECKER;
  private static final SubLSymbol $sym3$SHOW_DEBUG_INFO;
  private static final SubLSymbol $sym4$CHECK;
  private static final SubLSymbol $sym5$LISTP;
  private static final SubLSymbol $sym6$CHECK_CYC_INTERPRETATIONS;
  private static final SubLSymbol $sym7$BOOLEAN;
  private static final SubLSymbol $sym8$PROPOSED_VALUE;
  private static final SubLSymbol $sym9$OBJECT;
  private static final SubLList $list10;
  private static final SubLSymbol $sym11$SCRATCHPAD;
  private static final SubLSymbol $sym12$CACHE;
  private static final SubLSymbol $sym13$INSTANCE_COUNT;
  private static final SubLSymbol $sym14$SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_CLASS;
  private static final SubLSymbol $sym15$ISOLATED_P;
  private static final SubLSymbol $sym16$INSTANCE_NUMBER;
  private static final SubLSymbol $sym17$FUDGE_FACTOR;
  private static final SubLSymbol $sym18$SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_INSTANCE;
  private static final SubLSymbol $sym19$INITIALIZE;
  private static final SubLList $list20;
  private static final SubLList $list21;
  private static final SubLSymbol $sym22$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD;
  private static final SubLSymbol $sym23$SANITY_CHECKER_INITIALIZE_METHOD;
  private static final SubLList $list24;
  private static final SubLSymbol $sym25$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD;
  private static final SubLSymbol $sym26$SANITY_CHECKER_SHOW_DEBUG_INFO_METHOD;
  private static final SubLSymbol $sym27$HIDE_DEBUG_INFO;
  private static final SubLList $list28;
  private static final SubLSymbol $sym29$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD;
  private static final SubLSymbol $sym30$SANITY_CHECKER_HIDE_DEBUG_INFO_METHOD;
  private static final SubLList $list31;
  private static final SubLList $list32;
  private static final SubLList $list33;
  private static final SubLSymbol $sym34$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD;
  private static final SubLSymbol $sym35$SANITY_CHECKER_SCRATCHPAD;
  private static final SubLSymbol $sym36$SET_PREDICATE;
  private static final SubLSymbol $sym37$SET_FOCUS;
  private static final SubLSymbol $sym38$SET_ANSWER;
  private static final SubLSymbol $sym39$COMPUTE_DEGENERATE_DIAGNOSIS;
  private static final SubLSymbol $sym40$DEGENERATE_DIAGNOSIS;
  private static final SubLSymbol $sym41$INITIALIZE_CHECKERS;
  private static final SubLSymbol $sym42$DIAGNOSE;
  private static final SubLSymbol $sym43$OUTPUT_DIAGNOSES;
  private static final SubLString $str44$___S;
  private static final SubLSymbol $sym45$PLISTIFY;
  private static final SubLSymbol $sym46$SANITY_CHECKER_CHECK_METHOD;
  private static final SubLList $list47;
  private static final SubLList $list48;
  private static final SubLSymbol $sym49$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD;
  private static final SubLSymbol $sym50$CYC_FOCUSES;
  private static final SubLSymbol $sym51$SET_CYC_ANSWERS;
  private static final SubLSymbol $sym52$SANITY_CHECKER_CHECK_CYC_INTERPRETATIONS_METHOD;
  private static final SubLSymbol $sym53$CHECK_LISTIFIED;
  private static final SubLList $list54;
  private static final SubLSymbol $sym55$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD;
  private static final SubLSymbol $sym56$SET_PIQUANT_FOCUS;
  private static final SubLSymbol $sym57$SET_PIQUANT_ANSWER;
  private static final SubLSymbol $sym58$SANITY_CHECKER_CHECK_LISTIFIED_METHOD;
  private static final SubLSymbol $sym59$NUMBERP;
  private static final SubLList $list60;
  private static final SubLSymbol $sym61$SUBLOOP_RESERVED_INITIALIZE_PIQUANT_SANITY_CHECKER_CLASS;
  private static final SubLSymbol $sym62$SUBLOOP_RESERVED_INITIALIZE_PIQUANT_SANITY_CHECKER_INSTANCE;
  private static final SubLList $list63;
  private static final SubLList $list64;
  private static final SubLSymbol $sym65$OUTER_CATCH_FOR_PIQUANT_SANITY_CHECKER_METHOD;
  private static final SubLSymbol $sym66$SET_PIQUANT_PREDICATE;
  private static final SubLSymbol $sym67$PIQUANT_SANITY_CHECKER_CHECK_METHOD;
  private static final SubLList $list68;
  private static final SubLSymbol $sym69$OUTER_CATCH_FOR_PIQUANT_SANITY_CHECKER_METHOD;
  private static final SubLSymbol $sym70$PIQUANT_SANITY_CHECKER_CHECK_LISTIFIED_METHOD;
  private static final SubLList $list71;
  private static final SubLSymbol $sym72$CHECKERS_POOL;
  private static final SubLSymbol $sym73$SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_SCRATCHPAD_CLASS;
  private static final SubLSymbol $sym74$PREDICATE;
  private static final SubLSymbol $sym75$FOCUS;
  private static final SubLSymbol $sym76$ANSWER;
  private static final SubLSymbol $sym77$CYC_ANSWERS;
  private static final SubLSymbol $sym78$SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_SCRATCHPAD_INSTANCE;
  private static final SubLList $list79;
  private static final SubLSymbol $sym80$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD;
  private static final SubLSymbol $sym81$DIAGNOSIS;
  private static final SubLSymbol $sym82$SANITY_CHECKER_SCRATCHPAD_OUTPUT_DIAGNOSES_METHOD;
  private static final SubLList $list83;
  private static final SubLSymbol $sym84$SANITY_CHECKER_SCRATCHPAD_INITIALIZE_METHOD;
  private static final SubLList $list85;
  private static final SubLList $list86;
  private static final SubLSymbol $sym87$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD;
  private static final SubLSymbol $sym88$SANITY_CHECKER_SCRATCHPAD_SET_FOCUS_METHOD;
  private static final SubLList $list89;
  private static final SubLList $list90;
  private static final SubLSymbol $sym91$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD;
  private static final SubLString $str92$__;
  private static final SubLSymbol $sym93$GURUQA_OBJECT;
  private static final SubLSymbol $sym94$GURUQA_PARSE_PRECISE;
  private static final SubLSymbol $sym95$DENOTATIONS;
  private static final SubLSymbol $sym96$SANITY_CHECKER_SCRATCHPAD_SET_PIQUANT_FOCUS_METHOD;
  private static final SubLList $list97;
  private static final SubLList $list98;
  private static final SubLSymbol $sym99$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD;
  private static final SubLObject $const100$BinaryPredicate;
  private static final SubLString $str101$___S_is_not_a_binary_predicate_;
  private static final SubLSymbol $sym102$SANITY_CHECKER_SCRATCHPAD_SET_PREDICATE_METHOD;
  private static final SubLList $list103;
  private static final SubLList $list104;
  private static final SubLSymbol $sym105$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD;
  private static final SubLSymbol $sym106$SANITY_CHECKER_SCRATCHPAD_SET_PIQUANT_PREDICATE_METHOD;
  private static final SubLList $list107;
  private static final SubLSymbol $sym108$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD;
  private static final SubLSymbol $sym109$COMPUTE_CYC_ANSWERS;
  private static final SubLSymbol $sym110$SANITY_CHECKER_SCRATCHPAD_SET_ANSWER_METHOD;
  private static final SubLList $list111;
  private static final SubLList $list112;
  private static final SubLSymbol $sym113$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD;
  private static final SubLObject $const114$Unity;
  private static final SubLSymbol $sym115$SANITY_CHECKER_SCRATCHPAD_SET_CYC_ANSWERS_METHOD;
  private static final SubLList $list116;
  private static final SubLList $list117;
  private static final SubLSymbol $sym118$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD;
  private static final SubLSymbol $sym119$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const120$EverythingPSC;
  private static final SubLSymbol $sym121$SANITY_CHECKER_SCRATCHPAD_COMPUTE_CYC_ANSWERS_METHOD;
  private static final SubLList $list122;
  private static final SubLSymbol $sym123$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD;
  private static final SubLSymbol $sym124$SANITY_CHECKER_DIAGNOSIS;
  private static final SubLInteger $int125$100;
  private static final SubLSymbol $sym126$FAILURE_CODE;
  private static final SubLSymbol $sym127$SANITY_CHECKER_SCRATCHPAD_COMPUTE_DEGENERATE_DIAGNOSIS_METHOD;
  private static final SubLList $list128;
  private static final SubLList $list129;
  private static final SubLSymbol $sym130$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD;
  private static final SubLObject $const131$arg1Isa;
  private static final SubLObject $const132$arg2Isa;
  private static final SubLSymbol $sym133$SCALAR_CHECKER;
  private static final SubLSymbol $sym134$ARG1;
  private static final SubLSymbol $sym135$ARG2;
  private static final SubLInteger $int136$1000;
  private static final SubLSymbol $sym137$SANITY_CHECKER_SCRATCHPAD_INITIALIZE_CHECKERS_METHOD;
  private static final SubLList $list138;
  private static final SubLSymbol $sym139$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD;
  private static final SubLSymbol $sym140$COMPUTE_RANGE;
  private static final SubLSymbol $sym141$SANITY_CHECKER_SCRATCHPAD_DIAGNOSE_METHOD;
  private static final SubLSymbol $sym142$INTEGERP;
  private static final SubLList $list143;
  private static final SubLSymbol $sym144$ARG2RANGE;
  private static final SubLSymbol $sym145$SUBLOOP_RESERVED_INITIALIZE_SCALAR_CHECKER_CLASS;
  private static final SubLSymbol $sym146$BACKCHAIN;
  private static final SubLSymbol $sym147$SUBLOOP_RESERVED_INITIALIZE_SCALAR_CHECKER_INSTANCE;
  private static final SubLList $list148;
  private static final SubLSymbol $sym149$OUTER_CATCH_FOR_SCALAR_CHECKER_METHOD;
  private static final SubLSymbol $sym150$SCALAR_CHECKER_INITIALIZE_METHOD;
  private static final SubLList $list151;
  private static final SubLSymbol $sym152$OUTER_CATCH_FOR_SCALAR_CHECKER_METHOD;
  private static final SubLList $list153;
  private static final SubLSymbol $sym154$_RANGE;
  private static final SubLSymbol $sym155$SCALAR_RANGE;
  private static final SubLSymbol $sym156$FILL;
  private static final SubLSymbol $sym157$EMPTY_P;
  private static final SubLSymbol $sym158$MERGE;
  private static final SubLSymbol $sym159$FUDGE;
  private static final SubLSymbol $sym160$SCALAR_CHECKER_COMPUTE_RANGE_METHOD;
  private static final SubLObject $const161$Collection;
  private static final SubLObject $const162$SomeFn;
  private static final SubLList $list163;
  private static final SubLSymbol $sym164$OUTER_CATCH_FOR_SCALAR_CHECKER_METHOD;
  private static final SubLSymbol $sym165$GET_MIN;
  private static final SubLSymbol $sym166$GET_MAX;
  private static final SubLSymbol $sym167$LISTIFY;
  private static final SubLSymbol $sym168$PROPOSED_ARG;
  private static final SubLObject $const169$lessThan;
  private static final SubLObject $const170$greaterThan;
  private static final SubLObject $const171$quantitySubsumes;
  private static final SubLSymbol $sym172$COMPLETE;
  private static final SubLSymbol $sym173$ANSWER_KNOWN;
  private static final SubLObject $const174$and;
  private static final SubLSymbol $sym175$JUSTIFICATION;
  private static final SubLString $str176$No_information_available;
  private static final SubLSymbol $sym177$SCALAR_CHECKER_DIAGNOSE_METHOD;
  private static final SubLList $list178;
  private static final SubLSymbol $sym179$SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_DIAGNOSIS_CLASS;
  private static final SubLSymbol $sym180$SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_DIAGNOSIS_INSTANCE;
  private static final SubLList $list181;
  private static final SubLSymbol $sym182$OUTER_CATCH_FOR_SANITY_CHECKER_DIAGNOSIS_METHOD;
  private static final SubLSymbol $sym183$SANITY_CHECKER_DIAGNOSIS_INITIALIZE_METHOD;
  private static final SubLList $list184;
  private static final SubLSymbol $sym185$OUTER_CATCH_FOR_SANITY_CHECKER_DIAGNOSIS_METHOD;
  private static final SubLSymbol $sym186$SANITY_CHECKER_DIAGNOSIS_BOOLEAN_METHOD;
  private static final SubLList $list187;
  private static final SubLSymbol $sym188$POINT_INFO;
  private static final SubLSymbol $sym189$MAX;
  private static final SubLSymbol $sym190$MIN;
  private static final SubLSymbol $sym191$UNIT;
  private static final SubLSymbol $sym192$SUBLOOP_RESERVED_INITIALIZE_SCALAR_RANGE_CLASS;
  private static final SubLSymbol $sym193$SUBLOOP_RESERVED_INITIALIZE_SCALAR_RANGE_INSTANCE;
  private static final SubLSymbol $sym194$PRINT;
  private static final SubLList $list195;
  private static final SubLList $list196;
  private static final SubLSymbol $sym197$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD;
  private static final SubLSymbol $sym198$SCALAR_RANGE_PRINT_METHOD;
  private static final SubLList $list199;
  private static final SubLSymbol $sym200$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD;
  private static final SubLSymbol $sym201$SCALAR_RANGE_INITIALIZE_METHOD;
  private static final SubLList $list202;
  private static final SubLSymbol $sym203$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD;
  private static final SubLSymbol $sym204$SCALAR_RANGE_EMPTY_P_METHOD;
  private static final SubLList $list205;
  private static final SubLList $list206;
  private static final SubLSymbol $sym207$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD;
  private static final SubLObject $const208$isa;
  private static final SubLList $list209;
  private static final SubLObject $const210$BaseKB;
  private static final SubLObject $const211$UnitOfMeasure;
  private static final SubLSymbol $sym212$SCALAR_RANGE_FILL_METHOD;
  private static final SubLSymbol $sym213$GET_UNIT;
  private static final SubLList $list214;
  private static final SubLSymbol $sym215$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD;
  private static final SubLSymbol $sym216$SCALAR_RANGE_GET_UNIT_METHOD;
  private static final SubLList $list217;
  private static final SubLSymbol $sym218$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD;
  private static final SubLSymbol $sym219$SCALAR_RANGE_GET_MIN_METHOD;
  private static final SubLSymbol $sym220$GET_MIN_VALUE;
  private static final SubLList $list221;
  private static final SubLSymbol $sym222$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD;
  private static final SubLSymbol $sym223$SCALAR_RANGE_GET_MIN_VALUE_METHOD;
  private static final SubLList $list224;
  private static final SubLSymbol $sym225$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD;
  private static final SubLSymbol $sym226$SCALAR_RANGE_GET_MAX_METHOD;
  private static final SubLSymbol $sym227$GET_MAX_VALUE;
  private static final SubLList $list228;
  private static final SubLSymbol $sym229$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD;
  private static final SubLSymbol $sym230$SCALAR_RANGE_GET_MAX_VALUE_METHOD;
  private static final SubLList $list231;
  private static final SubLSymbol $sym232$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD;
  private static final SubLSymbol $sym233$SCALAR_RANGE_LISTIFY_METHOD;
  private static final SubLList $list234;
  private static final SubLSymbol $sym235$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD;
  private static final SubLSymbol $sym236$SCALAR_RANGE_FUDGE_METHOD;
  private static final SubLSymbol $sym237$CONVERTIBLE_P;
  private static final SubLList $list238;
  private static final SubLList $list239;
  private static final SubLSymbol $sym240$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD;
  private static final SubLSymbol $sym241$SCALAR_RANGE_P;
  private static final SubLList $list242;
  private static final SubLList $list243;
  private static final SubLSymbol $sym244$SCALAR_RANGE_CONVERTIBLE_P_METHOD;
  private static final SubLList $list245;
  private static final SubLSymbol $sym246$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD;
  private static final SubLSymbol $sym247$MERGE_LOOSE;
  private static final SubLSymbol $sym248$MERGE_STRICT;
  private static final SubLSymbol $sym249$SCALAR_RANGE_MERGE_METHOD;
  private static final SubLList $list250;
  private static final SubLSymbol $sym251$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD;
  private static final SubLObject $const252$lessThanOrEqualTo;
  private static final SubLSymbol $sym253$SCALAR_RANGE_MERGE_LOOSE_METHOD;
  private static final SubLList $list254;
  private static final SubLSymbol $sym255$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD;
  private static final SubLString $str256$__Inconsistent_ranges___S__S;
  private static final SubLSymbol $sym257$SCALAR_RANGE_MERGE_STRICT_METHOD;
  private static final SubLObject $const258$age;
  private static final SubLObject $const259$numberOfInhabitants;
  private static final SubLObject $const260$YearsDuration;
  private static final SubLObject $const261$NumericalQuant_NLAttrFn;
  private static final SubLObject $const262$HomoSapiens;

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 1263L)
  public static SubLObject get_sanity_checker()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $sanity_checker$.getDynamicValue( thread ) )
    {
      $sanity_checker$.setDynamicValue( object.new_class_instance( $sym0$SANITY_CHECKER ), thread );
    }
    return $sanity_checker$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 1423L)
  public static SubLObject get_piquant_sanity_checker(final SubLObject guid_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( guid_string ) : guid_string;
    if( !$piquant_sanity_checkers$.getDynamicValue( thread ).isHashtable() )
    {
      $piquant_sanity_checkers$.setDynamicValue( Hashtables.make_hash_table( EIGHT_INTEGER, Symbols.symbol_function( EQUALP ), UNPROVIDED ), thread );
    }
    SubLObject checker = Hashtables.gethash( guid_string, $piquant_sanity_checkers$.getDynamicValue( thread ), UNPROVIDED );
    if( NIL == checker )
    {
      checker = object.new_class_instance( $sym2$PIQUANT_SANITY_CHECKER );
      methods.funcall_instance_method_with_0_args( checker, $sym3$SHOW_DEBUG_INFO );
      Hashtables.sethash( guid_string, $piquant_sanity_checkers$.getDynamicValue( thread ), checker );
    }
    return checker;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 1913L)
  public static SubLObject sanity_check(final SubLObject cyc_predicate, final SubLObject focus, final SubLObject v_answer)
  {
    return methods.funcall_instance_method_with_3_args( get_sanity_checker(), $sym4$CHECK, cyc_predicate, focus, v_answer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 2041L)
  public static SubLObject cyc_sanity_check(final SubLObject cyc_predicate, final SubLObject cyc_focuses, final SubLObject cyc_answers)
  {
    assert NIL != Types.listp( cyc_focuses ) : cyc_focuses;
    assert NIL != Types.listp( cyc_focuses ) : cyc_focuses;
    return methods.funcall_instance_method_with_3_args( get_sanity_checker(), $sym6$CHECK_CYC_INTERPRETATIONS, cyc_predicate, cyc_focuses, cyc_answers );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 2281L)
  public static SubLObject cyc_sanity_filter(final SubLObject cyc_predicate, final SubLObject cyc_focuses, final SubLObject cyc_answers)
  {
    assert NIL != Types.listp( cyc_focuses ) : cyc_focuses;
    assert NIL != Types.listp( cyc_focuses ) : cyc_focuses;
    final SubLObject diagnoses = cyc_sanity_check( cyc_predicate, cyc_focuses, cyc_answers );
    SubLObject sane_answers = NIL;
    SubLObject cdolist_list_var = diagnoses;
    SubLObject diagnosis = NIL;
    diagnosis = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != methods.funcall_instance_method_with_0_args( diagnosis, $sym7$BOOLEAN ) )
      {
        sane_answers = ConsesLow.cons( instances.get_slot( diagnosis, $sym8$PROPOSED_VALUE ), sane_answers );
      }
      cdolist_list_var = cdolist_list_var.rest();
      diagnosis = cdolist_list_var.first();
    }
    return sane_answers;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 2679L)
  public static SubLObject get_sanity_checker_show_debug_info(final SubLObject v_sanity_checker)
  {
    return classes.subloop_get_access_protected_instance_slot( v_sanity_checker, FOUR_INTEGER, $sym3$SHOW_DEBUG_INFO );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 2679L)
  public static SubLObject set_sanity_checker_show_debug_info(final SubLObject v_sanity_checker, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_sanity_checker, value, FOUR_INTEGER, $sym3$SHOW_DEBUG_INFO );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 2679L)
  public static SubLObject get_sanity_checker_fudge_factor(final SubLObject v_sanity_checker)
  {
    return classes.subloop_get_instance_slot( v_sanity_checker, THREE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 2679L)
  public static SubLObject set_sanity_checker_fudge_factor(final SubLObject v_sanity_checker, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( v_sanity_checker, value, THREE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 2679L)
  public static SubLObject get_sanity_checker_scratchpad(final SubLObject v_sanity_checker)
  {
    return classes.subloop_get_access_protected_instance_slot( v_sanity_checker, TWO_INTEGER, $sym11$SCRATCHPAD );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 2679L)
  public static SubLObject set_sanity_checker_scratchpad(final SubLObject v_sanity_checker, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_sanity_checker, value, TWO_INTEGER, $sym11$SCRATCHPAD );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 2679L)
  public static SubLObject get_sanity_checker_cache(final SubLObject v_sanity_checker)
  {
    return classes.subloop_get_access_protected_instance_slot( v_sanity_checker, ONE_INTEGER, $sym12$CACHE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 2679L)
  public static SubLObject set_sanity_checker_cache(final SubLObject v_sanity_checker, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_sanity_checker, value, ONE_INTEGER, $sym12$CACHE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 2679L)
  public static SubLObject subloop_reserved_initialize_sanity_checker_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym9$OBJECT, $sym13$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 2679L)
  public static SubLObject subloop_reserved_initialize_sanity_checker_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym9$OBJECT, $sym15$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym9$OBJECT, $sym16$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$SANITY_CHECKER, $sym12$CACHE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$SANITY_CHECKER, $sym11$SCRATCHPAD, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$SANITY_CHECKER, $sym17$FUDGE_FACTOR, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$SANITY_CHECKER, $sym3$SHOW_DEBUG_INFO, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 2679L)
  public static SubLObject sanity_checker_p(final SubLObject v_sanity_checker)
  {
    return classes.subloop_instanceof_class( v_sanity_checker, $sym0$SANITY_CHECKER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 3292L)
  public static SubLObject sanity_checker_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sanity_checker_method = NIL;
    SubLObject fudge_factor = get_sanity_checker_fudge_factor( self );
    try
    {
      thread.throwStack.push( $sym22$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD );
      try
      {
        object.object_initialize_method( self );
        fudge_factor = ZERO_INTEGER;
        Dynamic.sublisp_throw( $sym22$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sanity_checker_fudge_factor( self, fudge_factor );
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
      catch_var_for_sanity_checker_method = Errors.handleThrowable( ccatch_env_var, $sym22$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sanity_checker_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 3416L)
  public static SubLObject sanity_checker_show_debug_info_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sanity_checker_method = NIL;
    SubLObject show_debug_info = get_sanity_checker_show_debug_info( self );
    try
    {
      thread.throwStack.push( $sym25$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD );
      try
      {
        show_debug_info = T;
        Dynamic.sublisp_throw( $sym25$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sanity_checker_show_debug_info( self, show_debug_info );
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
      catch_var_for_sanity_checker_method = Errors.handleThrowable( ccatch_env_var, $sym25$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sanity_checker_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 3525L)
  public static SubLObject sanity_checker_hide_debug_info_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sanity_checker_method = NIL;
    SubLObject show_debug_info = get_sanity_checker_show_debug_info( self );
    try
    {
      thread.throwStack.push( $sym29$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD );
      try
      {
        show_debug_info = NIL;
        Dynamic.sublisp_throw( $sym29$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sanity_checker_show_debug_info( self, show_debug_info );
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
      catch_var_for_sanity_checker_method = Errors.handleThrowable( ccatch_env_var, $sym29$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sanity_checker_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 3636L)
  public static SubLObject sanity_checker_check_method(final SubLObject self, final SubLObject predicate, final SubLObject focus, final SubLObject v_answer)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sanity_checker_method = NIL;
    final SubLObject show_debug_info = get_sanity_checker_show_debug_info( self );
    final SubLObject fudge_factor = get_sanity_checker_fudge_factor( self );
    SubLObject scratchpad = get_sanity_checker_scratchpad( self );
    try
    {
      thread.throwStack.push( $sym34$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD );
      try
      {
        scratchpad = object.new_class_instance( $sym35$SANITY_CHECKER_SCRATCHPAD );
        methods.funcall_instance_method_with_1_args( scratchpad, $sym36$SET_PREDICATE, predicate );
        methods.funcall_instance_method_with_1_args( scratchpad, $sym37$SET_FOCUS, focus );
        methods.funcall_instance_method_with_1_args( scratchpad, $sym38$SET_ANSWER, v_answer );
        methods.funcall_instance_method_with_0_args( scratchpad, $sym39$COMPUTE_DEGENERATE_DIAGNOSIS );
        if( NIL == instances.get_slot( scratchpad, $sym40$DEGENERATE_DIAGNOSIS ) )
        {
          methods.funcall_instance_method_with_1_args( scratchpad, $sym41$INITIALIZE_CHECKERS, fudge_factor );
          methods.funcall_instance_method_with_0_args( scratchpad, $sym42$DIAGNOSE );
        }
        final SubLObject result = methods.funcall_instance_method_with_0_args( scratchpad, $sym43$OUTPUT_DIAGNOSES );
        if( NIL != show_debug_info )
        {
          SubLObject cdolist_list_var = result;
          SubLObject item = NIL;
          item = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            PrintLow.format( StreamsLow.$standard_output$.getDynamicValue( thread ), $str44$___S, methods.funcall_instance_method_with_0_args( item, $sym45$PLISTIFY ) );
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
          }
        }
        Dynamic.sublisp_throw( $sym34$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD, result );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sanity_checker_show_debug_info( self, show_debug_info );
          set_sanity_checker_fudge_factor( self, fudge_factor );
          set_sanity_checker_scratchpad( self, scratchpad );
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
      catch_var_for_sanity_checker_method = Errors.handleThrowable( ccatch_env_var, $sym34$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sanity_checker_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 4439L)
  public static SubLObject sanity_checker_check_cyc_interpretations_method(final SubLObject self, final SubLObject predicate, final SubLObject cyc_interpretations, final SubLObject cyc_answers)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sanity_checker_method = NIL;
    final SubLObject show_debug_info = get_sanity_checker_show_debug_info( self );
    final SubLObject fudge_factor = get_sanity_checker_fudge_factor( self );
    SubLObject scratchpad = get_sanity_checker_scratchpad( self );
    try
    {
      thread.throwStack.push( $sym49$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD );
      try
      {
        scratchpad = object.new_class_instance( $sym35$SANITY_CHECKER_SCRATCHPAD );
        methods.funcall_instance_method_with_1_args( scratchpad, $sym36$SET_PREDICATE, predicate );
        instances.set_slot( scratchpad, $sym50$CYC_FOCUSES, cyc_interpretations );
        methods.funcall_instance_method_with_1_args( scratchpad, $sym51$SET_CYC_ANSWERS, cyc_answers );
        methods.funcall_instance_method_with_0_args( scratchpad, $sym39$COMPUTE_DEGENERATE_DIAGNOSIS );
        if( NIL == instances.get_slot( scratchpad, $sym40$DEGENERATE_DIAGNOSIS ) )
        {
          methods.funcall_instance_method_with_1_args( scratchpad, $sym41$INITIALIZE_CHECKERS, fudge_factor );
          methods.funcall_instance_method_with_0_args( scratchpad, $sym42$DIAGNOSE );
        }
        final SubLObject result = methods.funcall_instance_method_with_0_args( scratchpad, $sym43$OUTPUT_DIAGNOSES );
        if( NIL != show_debug_info )
        {
          SubLObject cdolist_list_var = result;
          SubLObject item = NIL;
          item = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            PrintLow.format( StreamsLow.$standard_output$.getDynamicValue( thread ), $str44$___S, methods.funcall_instance_method_with_0_args( item, $sym45$PLISTIFY ) );
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
          }
        }
        Dynamic.sublisp_throw( $sym49$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD, result );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sanity_checker_show_debug_info( self, show_debug_info );
          set_sanity_checker_fudge_factor( self, fudge_factor );
          set_sanity_checker_scratchpad( self, scratchpad );
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
      catch_var_for_sanity_checker_method = Errors.handleThrowable( ccatch_env_var, $sym49$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sanity_checker_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 5292L)
  public static SubLObject sanity_checker_check_listified_method(final SubLObject self, final SubLObject predicate, final SubLObject focus, final SubLObject v_answer)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sanity_checker_method = NIL;
    final SubLObject show_debug_info = get_sanity_checker_show_debug_info( self );
    final SubLObject fudge_factor = get_sanity_checker_fudge_factor( self );
    SubLObject scratchpad = get_sanity_checker_scratchpad( self );
    try
    {
      thread.throwStack.push( $sym55$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD );
      try
      {
        scratchpad = object.new_class_instance( $sym35$SANITY_CHECKER_SCRATCHPAD );
        methods.funcall_instance_method_with_1_args( scratchpad, $sym36$SET_PREDICATE, predicate );
        methods.funcall_instance_method_with_1_args( scratchpad, $sym56$SET_PIQUANT_FOCUS, focus );
        methods.funcall_instance_method_with_1_args( scratchpad, $sym57$SET_PIQUANT_ANSWER, v_answer );
        methods.funcall_instance_method_with_0_args( scratchpad, $sym39$COMPUTE_DEGENERATE_DIAGNOSIS );
        if( NIL == instances.get_slot( scratchpad, $sym40$DEGENERATE_DIAGNOSIS ) )
        {
          methods.funcall_instance_method_with_1_args( scratchpad, $sym41$INITIALIZE_CHECKERS, fudge_factor );
          methods.funcall_instance_method_with_0_args( scratchpad, $sym42$DIAGNOSE );
        }
        final SubLObject result = methods.funcall_instance_method_with_0_args( scratchpad, $sym43$OUTPUT_DIAGNOSES );
        SubLObject listified_result = NIL;
        SubLObject cdolist_list_var = result;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          listified_result = ConsesLow.cons( methods.funcall_instance_method_with_0_args( item, $sym45$PLISTIFY ), listified_result );
          cdolist_list_var = cdolist_list_var.rest();
          item = cdolist_list_var.first();
        }
        if( NIL != show_debug_info )
        {
          cdolist_list_var = listified_result;
          item = NIL;
          item = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            PrintLow.format( StreamsLow.$standard_output$.getDynamicValue( thread ), $str44$___S, item );
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
          }
        }
        Dynamic.sublisp_throw( $sym55$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD, listified_result );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sanity_checker_show_debug_info( self, show_debug_info );
          set_sanity_checker_fudge_factor( self, fudge_factor );
          set_sanity_checker_scratchpad( self, scratchpad );
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
      catch_var_for_sanity_checker_method = Errors.handleThrowable( ccatch_env_var, $sym55$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sanity_checker_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 6224L)
  public static SubLObject piquant_sanity_check(final SubLObject pred_string, final SubLObject focus_string, final SubLObject answer_string, final SubLObject guid_string, SubLObject fudge_factor)
  {
    if( fudge_factor == UNPROVIDED )
    {
      fudge_factor = NIL;
    }
    assert NIL != Types.stringp( guid_string ) : guid_string;
    if( NIL != fudge_factor && !assertionsDisabledInClass && NIL == Types.numberp( fudge_factor ) )
    {
      throw new AssertionError( fudge_factor );
    }
    if( NIL != fudge_factor )
    {
      instances.set_slot( get_piquant_sanity_checker( guid_string ), $sym17$FUDGE_FACTOR, fudge_factor );
    }
    return methods.funcall_instance_method_with_3_args( get_piquant_sanity_checker( guid_string ), $sym53$CHECK_LISTIFIED, pred_string, focus_string, answer_string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 6762L)
  public static SubLObject subloop_reserved_initialize_piquant_sanity_checker_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym9$OBJECT, $sym13$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 6762L)
  public static SubLObject subloop_reserved_initialize_piquant_sanity_checker_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym9$OBJECT, $sym15$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym9$OBJECT, $sym16$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$SANITY_CHECKER, $sym12$CACHE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$SANITY_CHECKER, $sym11$SCRATCHPAD, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$SANITY_CHECKER, $sym17$FUDGE_FACTOR, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$SANITY_CHECKER, $sym3$SHOW_DEBUG_INFO, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 6762L)
  public static SubLObject piquant_sanity_checker_p(final SubLObject piquant_sanity_checker)
  {
    return classes.subloop_instanceof_class( piquant_sanity_checker, $sym2$PIQUANT_SANITY_CHECKER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 6987L)
  public static SubLObject piquant_sanity_checker_check_method(final SubLObject self, final SubLObject piquant_predicate, final SubLObject piquant_focus, final SubLObject piquant_answer)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_piquant_sanity_checker_method = NIL;
    final SubLObject show_debug_info = get_sanity_checker_show_debug_info( self );
    final SubLObject fudge_factor = get_sanity_checker_fudge_factor( self );
    SubLObject scratchpad = get_sanity_checker_scratchpad( self );
    try
    {
      thread.throwStack.push( $sym65$OUTER_CATCH_FOR_PIQUANT_SANITY_CHECKER_METHOD );
      try
      {
        scratchpad = object.new_class_instance( $sym35$SANITY_CHECKER_SCRATCHPAD );
        methods.funcall_instance_method_with_1_args( scratchpad, $sym66$SET_PIQUANT_PREDICATE, piquant_predicate );
        methods.funcall_instance_method_with_1_args( scratchpad, $sym56$SET_PIQUANT_FOCUS, piquant_focus );
        methods.funcall_instance_method_with_1_args( scratchpad, $sym38$SET_ANSWER, piquant_answer );
        methods.funcall_instance_method_with_0_args( scratchpad, $sym39$COMPUTE_DEGENERATE_DIAGNOSIS );
        if( NIL == instances.get_slot( scratchpad, $sym40$DEGENERATE_DIAGNOSIS ) )
        {
          methods.funcall_instance_method_with_1_args( scratchpad, $sym41$INITIALIZE_CHECKERS, fudge_factor );
          methods.funcall_instance_method_with_0_args( scratchpad, $sym42$DIAGNOSE );
        }
        final SubLObject result = methods.funcall_instance_method_with_0_args( scratchpad, $sym43$OUTPUT_DIAGNOSES );
        if( NIL != show_debug_info )
        {
          SubLObject cdolist_list_var = result;
          SubLObject item = NIL;
          item = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            PrintLow.format( StreamsLow.$standard_output$.getDynamicValue( thread ), $str44$___S, methods.funcall_instance_method_with_0_args( item, $sym45$PLISTIFY ) );
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
          }
        }
        Dynamic.sublisp_throw( $sym65$OUTER_CATCH_FOR_PIQUANT_SANITY_CHECKER_METHOD, result );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sanity_checker_show_debug_info( self, show_debug_info );
          set_sanity_checker_fudge_factor( self, fudge_factor );
          set_sanity_checker_scratchpad( self, scratchpad );
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
      catch_var_for_piquant_sanity_checker_method = Errors.handleThrowable( ccatch_env_var, $sym65$OUTER_CATCH_FOR_PIQUANT_SANITY_CHECKER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_piquant_sanity_checker_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 7862L)
  public static SubLObject piquant_sanity_checker_check_listified_method(final SubLObject self, final SubLObject piquant_predicate, final SubLObject piquant_focus, final SubLObject piquant_answer)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_piquant_sanity_checker_method = NIL;
    final SubLObject show_debug_info = get_sanity_checker_show_debug_info( self );
    final SubLObject fudge_factor = get_sanity_checker_fudge_factor( self );
    SubLObject scratchpad = get_sanity_checker_scratchpad( self );
    try
    {
      thread.throwStack.push( $sym69$OUTER_CATCH_FOR_PIQUANT_SANITY_CHECKER_METHOD );
      try
      {
        scratchpad = object.new_class_instance( $sym35$SANITY_CHECKER_SCRATCHPAD );
        methods.funcall_instance_method_with_1_args( scratchpad, $sym66$SET_PIQUANT_PREDICATE, piquant_predicate );
        methods.funcall_instance_method_with_1_args( scratchpad, $sym56$SET_PIQUANT_FOCUS, piquant_focus );
        methods.funcall_instance_method_with_1_args( scratchpad, $sym38$SET_ANSWER, piquant_answer );
        methods.funcall_instance_method_with_0_args( scratchpad, $sym39$COMPUTE_DEGENERATE_DIAGNOSIS );
        if( NIL == instances.get_slot( scratchpad, $sym40$DEGENERATE_DIAGNOSIS ) )
        {
          methods.funcall_instance_method_with_1_args( scratchpad, $sym41$INITIALIZE_CHECKERS, fudge_factor );
          methods.funcall_instance_method_with_0_args( scratchpad, $sym42$DIAGNOSE );
        }
        final SubLObject result = methods.funcall_instance_method_with_0_args( scratchpad, $sym43$OUTPUT_DIAGNOSES );
        SubLObject listified_result = NIL;
        SubLObject cdolist_list_var = result;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          listified_result = ConsesLow.cons( methods.funcall_instance_method_with_0_args( item, $sym45$PLISTIFY ), listified_result );
          cdolist_list_var = cdolist_list_var.rest();
          item = cdolist_list_var.first();
        }
        if( NIL != show_debug_info )
        {
          cdolist_list_var = listified_result;
          item = NIL;
          item = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            PrintLow.format( StreamsLow.$standard_output$.getDynamicValue( thread ), $str44$___S, item );
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
          }
        }
        Dynamic.sublisp_throw( $sym69$OUTER_CATCH_FOR_PIQUANT_SANITY_CHECKER_METHOD, listified_result );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sanity_checker_show_debug_info( self, show_debug_info );
          set_sanity_checker_fudge_factor( self, fudge_factor );
          set_sanity_checker_scratchpad( self, scratchpad );
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
      catch_var_for_piquant_sanity_checker_method = Errors.handleThrowable( ccatch_env_var, $sym69$OUTER_CATCH_FOR_PIQUANT_SANITY_CHECKER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_piquant_sanity_checker_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 8850L)
  public static SubLObject get_sanity_checker_scratchpad_degenerate_diagnosis(final SubLObject sanity_checker_scratchpad)
  {
    return classes.subloop_get_access_protected_instance_slot( sanity_checker_scratchpad, SEVEN_INTEGER, $sym40$DEGENERATE_DIAGNOSIS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 8850L)
  public static SubLObject set_sanity_checker_scratchpad_degenerate_diagnosis(final SubLObject sanity_checker_scratchpad, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( sanity_checker_scratchpad, value, SEVEN_INTEGER, $sym40$DEGENERATE_DIAGNOSIS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 8850L)
  public static SubLObject get_sanity_checker_scratchpad_checkers_pool(final SubLObject sanity_checker_scratchpad)
  {
    return classes.subloop_get_access_protected_instance_slot( sanity_checker_scratchpad, SIX_INTEGER, $sym72$CHECKERS_POOL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 8850L)
  public static SubLObject set_sanity_checker_scratchpad_checkers_pool(final SubLObject sanity_checker_scratchpad, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( sanity_checker_scratchpad, value, SIX_INTEGER, $sym72$CHECKERS_POOL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 8850L)
  public static SubLObject get_sanity_checker_scratchpad_cyc_answers(final SubLObject sanity_checker_scratchpad)
  {
    return classes.subloop_get_instance_slot( sanity_checker_scratchpad, FIVE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 8850L)
  public static SubLObject set_sanity_checker_scratchpad_cyc_answers(final SubLObject sanity_checker_scratchpad, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( sanity_checker_scratchpad, value, FIVE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 8850L)
  public static SubLObject get_sanity_checker_scratchpad_answer(final SubLObject sanity_checker_scratchpad)
  {
    return classes.subloop_get_instance_slot( sanity_checker_scratchpad, FOUR_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 8850L)
  public static SubLObject set_sanity_checker_scratchpad_answer(final SubLObject sanity_checker_scratchpad, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( sanity_checker_scratchpad, value, FOUR_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 8850L)
  public static SubLObject get_sanity_checker_scratchpad_cyc_focuses(final SubLObject sanity_checker_scratchpad)
  {
    return classes.subloop_get_instance_slot( sanity_checker_scratchpad, THREE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 8850L)
  public static SubLObject set_sanity_checker_scratchpad_cyc_focuses(final SubLObject sanity_checker_scratchpad, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( sanity_checker_scratchpad, value, THREE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 8850L)
  public static SubLObject get_sanity_checker_scratchpad_focus(final SubLObject sanity_checker_scratchpad)
  {
    return classes.subloop_get_instance_slot( sanity_checker_scratchpad, TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 8850L)
  public static SubLObject set_sanity_checker_scratchpad_focus(final SubLObject sanity_checker_scratchpad, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( sanity_checker_scratchpad, value, TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 8850L)
  public static SubLObject get_sanity_checker_scratchpad_predicate(final SubLObject sanity_checker_scratchpad)
  {
    return classes.subloop_get_instance_slot( sanity_checker_scratchpad, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 8850L)
  public static SubLObject set_sanity_checker_scratchpad_predicate(final SubLObject sanity_checker_scratchpad, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( sanity_checker_scratchpad, value, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 8850L)
  public static SubLObject subloop_reserved_initialize_sanity_checker_scratchpad_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym9$OBJECT, $sym13$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 8850L)
  public static SubLObject subloop_reserved_initialize_sanity_checker_scratchpad_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym9$OBJECT, $sym15$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym9$OBJECT, $sym16$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym35$SANITY_CHECKER_SCRATCHPAD, $sym74$PREDICATE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym35$SANITY_CHECKER_SCRATCHPAD, $sym75$FOCUS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym35$SANITY_CHECKER_SCRATCHPAD, $sym50$CYC_FOCUSES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym35$SANITY_CHECKER_SCRATCHPAD, $sym76$ANSWER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym35$SANITY_CHECKER_SCRATCHPAD, $sym77$CYC_ANSWERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym35$SANITY_CHECKER_SCRATCHPAD, $sym72$CHECKERS_POOL, NIL );
    classes.subloop_initialize_slot( new_instance, $sym35$SANITY_CHECKER_SCRATCHPAD, $sym40$DEGENERATE_DIAGNOSIS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 8850L)
  public static SubLObject sanity_checker_scratchpad_p(final SubLObject sanity_checker_scratchpad)
  {
    return classes.subloop_instanceof_class( sanity_checker_scratchpad, $sym35$SANITY_CHECKER_SCRATCHPAD );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 9862L)
  public static SubLObject sanity_checker_scratchpad_output_diagnoses_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sanity_checker_scratchpad_method = NIL;
    final SubLObject degenerate_diagnosis = get_sanity_checker_scratchpad_degenerate_diagnosis( self );
    final SubLObject checkers_pool = get_sanity_checker_scratchpad_checkers_pool( self );
    try
    {
      thread.throwStack.push( $sym80$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD );
      try
      {
        if( NIL != degenerate_diagnosis )
        {
          Dynamic.sublisp_throw( $sym80$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD, ConsesLow.list( degenerate_diagnosis ) );
        }
        else
        {
          SubLObject diagnoses = NIL;
          SubLObject cdolist_list_var = checkers_pool;
          SubLObject checker = NIL;
          checker = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            diagnoses = ConsesLow.cons( instances.get_slot( checker, $sym81$DIAGNOSIS ), diagnoses );
            cdolist_list_var = cdolist_list_var.rest();
            checker = cdolist_list_var.first();
          }
          Dynamic.sublisp_throw( $sym80$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD, diagnoses );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sanity_checker_scratchpad_degenerate_diagnosis( self, degenerate_diagnosis );
          set_sanity_checker_scratchpad_checkers_pool( self, checkers_pool );
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
      catch_var_for_sanity_checker_scratchpad_method = Errors.handleThrowable( ccatch_env_var, $sym80$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sanity_checker_scratchpad_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 10143L)
  public static SubLObject sanity_checker_scratchpad_initialize_method(final SubLObject self)
  {
    object.object_initialize_method( self );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 10254L)
  public static SubLObject sanity_checker_scratchpad_set_focus_method(final SubLObject self, final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sanity_checker_scratchpad_method = NIL;
    SubLObject cyc_focuses = get_sanity_checker_scratchpad_cyc_focuses( self );
    SubLObject focus = get_sanity_checker_scratchpad_focus( self );
    try
    {
      thread.throwStack.push( $sym87$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD );
      try
      {
        assert NIL != Types.stringp( string ) : string;
        focus = string;
        SubLObject cdolist_list_var = psp_main.ps_get_cycls_for_np( string, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject denot = NIL;
        denot = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject reformulated = reformulator_hub.reformulate_cycl( denot, UNPROVIDED, UNPROVIDED );
          if( NIL != reformulated )
          {
            final SubLObject item_var = reformulated;
            if( NIL == conses_high.member( item_var, cyc_focuses, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              cyc_focuses = ConsesLow.cons( item_var, cyc_focuses );
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          denot = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym87$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sanity_checker_scratchpad_cyc_focuses( self, cyc_focuses );
          set_sanity_checker_scratchpad_focus( self, focus );
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
      catch_var_for_sanity_checker_scratchpad_method = Errors.handleThrowable( ccatch_env_var, $sym87$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sanity_checker_scratchpad_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 10571L)
  public static SubLObject sanity_checker_scratchpad_set_piquant_focus_method(final SubLObject self, final SubLObject focus_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sanity_checker_scratchpad_method = NIL;
    SubLObject cyc_focuses = get_sanity_checker_scratchpad_cyc_focuses( self );
    SubLObject focus = get_sanity_checker_scratchpad_focus( self );
    try
    {
      thread.throwStack.push( $sym91$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD );
      try
      {
        assert NIL != Types.stringp( focus_string ) : focus_string;
        final SubLObject denotations = ( NIL != string_utilities.starts_with( focus_string, $str92$__ ) ) ? ConsesLow.list( constants_high.find_constant( string_utilities.pre_remove( focus_string, $str92$__,
            UNPROVIDED ) ) ) : NIL;
        if( NIL != denotations )
        {
          focus = focus_string;
          cyc_focuses = denotations;
          Dynamic.sublisp_throw( $sym91$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD, self );
        }
        final SubLObject guruqa_object = methods.funcall_class_method_with_1_args( $sym93$GURUQA_OBJECT, $sym94$GURUQA_PARSE_PRECISE, focus_string );
        if( NIL != ( focus = guruqa_object ) )
        {
          cyc_focuses = methods.funcall_instance_method_with_0_args( guruqa_object, $sym95$DENOTATIONS );
        }
        Dynamic.sublisp_throw( $sym91$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sanity_checker_scratchpad_cyc_focuses( self, cyc_focuses );
          set_sanity_checker_scratchpad_focus( self, focus );
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
      catch_var_for_sanity_checker_scratchpad_method = Errors.handleThrowable( ccatch_env_var, $sym91$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sanity_checker_scratchpad_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 11158L)
  public static SubLObject sanity_checker_scratchpad_set_predicate_method(final SubLObject self, final SubLObject cyc_predicate)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sanity_checker_scratchpad_method = NIL;
    SubLObject predicate = get_sanity_checker_scratchpad_predicate( self );
    try
    {
      thread.throwStack.push( $sym99$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD );
      try
      {
        if( NIL != isa.isa_in_any_mtP( cyc_predicate, $const100$BinaryPredicate ) )
        {
          predicate = cyc_predicate;
        }
        else
        {
          Errors.warn( $str101$___S_is_not_a_binary_predicate_, cyc_predicate );
        }
        Dynamic.sublisp_throw( $sym99$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sanity_checker_scratchpad_predicate( self, predicate );
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
      catch_var_for_sanity_checker_scratchpad_method = Errors.handleThrowable( ccatch_env_var, $sym99$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sanity_checker_scratchpad_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 11418L)
  public static SubLObject sanity_checker_scratchpad_set_piquant_predicate_method(final SubLObject self, final SubLObject piquant_predicate)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sanity_checker_scratchpad_method = NIL;
    SubLObject predicate = get_sanity_checker_scratchpad_predicate( self );
    try
    {
      thread.throwStack.push( $sym105$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD );
      try
      {
        final SubLObject cyc_predicate = constants_high.find_constant( piquant_predicate );
        if( NIL != isa.isa_in_any_mtP( cyc_predicate, $const100$BinaryPredicate ) )
        {
          predicate = cyc_predicate;
        }
        else
        {
          Errors.warn( $str101$___S_is_not_a_binary_predicate_, piquant_predicate );
        }
        Dynamic.sublisp_throw( $sym105$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sanity_checker_scratchpad_predicate( self, predicate );
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
      catch_var_for_sanity_checker_scratchpad_method = Errors.handleThrowable( ccatch_env_var, $sym105$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sanity_checker_scratchpad_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 11749L)
  public static SubLObject sanity_checker_scratchpad_set_answer_method(final SubLObject self, final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sanity_checker_scratchpad_method = NIL;
    SubLObject v_answer = get_sanity_checker_scratchpad_answer( self );
    try
    {
      thread.throwStack.push( $sym108$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD );
      try
      {
        assert NIL != Types.stringp( string ) : string;
        v_answer = string;
        methods.funcall_instance_method_with_1_args( self, $sym109$COMPUTE_CYC_ANSWERS, string );
        Dynamic.sublisp_throw( $sym108$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sanity_checker_scratchpad_answer( self, v_answer );
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
      catch_var_for_sanity_checker_scratchpad_method = Errors.handleThrowable( ccatch_env_var, $sym108$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sanity_checker_scratchpad_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 11956L)
  public static SubLObject sanity_checker_scratchpad_set_cyc_answers_method(final SubLObject self, final SubLObject cyc_candidate_answers)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sanity_checker_scratchpad_method = NIL;
    SubLObject cyc_answers = get_sanity_checker_scratchpad_cyc_answers( self );
    final SubLObject v_answer = get_sanity_checker_scratchpad_answer( self );
    try
    {
      thread.throwStack.push( $sym113$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD );
      try
      {
        SubLObject cdolist_list_var = cyc_candidate_answers;
        SubLObject v_answer_$1 = NIL;
        v_answer_$1 = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != term.el_fort_p( v_answer_$1 ) )
          {
            cyc_answers = ConsesLow.cons( v_answer_$1, cyc_answers );
          }
          else if( v_answer_$1.isNumber() )
          {
            cyc_answers = ConsesLow.cons( ConsesLow.list( $const114$Unity, v_answer_$1 ), cyc_answers );
          }
          cdolist_list_var = cdolist_list_var.rest();
          v_answer_$1 = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym113$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sanity_checker_scratchpad_cyc_answers( self, cyc_answers );
          set_sanity_checker_scratchpad_answer( self, v_answer );
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
      catch_var_for_sanity_checker_scratchpad_method = Errors.handleThrowable( ccatch_env_var, $sym113$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sanity_checker_scratchpad_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 12240L)
  public static SubLObject sanity_checker_scratchpad_compute_cyc_answers_method(final SubLObject self, final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sanity_checker_scratchpad_method = NIL;
    SubLObject cyc_answers = get_sanity_checker_scratchpad_cyc_answers( self );
    try
    {
      thread.throwStack.push( $sym118$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD );
      try
      {
        final SubLObject all_denots = psp_main.ps_get_cycls_for_np( string, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject good_denots = NIL;
        SubLObject cdolist_list_var = all_denots;
        SubLObject denot = NIL;
        denot = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != term.el_fort_p( denot ) )
          {
            final SubLObject reformulated = reformulator_hub.reformulate_cycl( denot, UNPROVIDED, UNPROVIDED );
            SubLObject wft = NIL;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
            try
            {
              mt_relevance_macros.$relevant_mt_function$.bind( $sym119$RELEVANT_MT_IS_EVERYTHING, thread );
              mt_relevance_macros.$mt$.bind( $const120$EverythingPSC, thread );
              wft = wff.el_wftP( denot, UNPROVIDED, UNPROVIDED );
            }
            finally
            {
              mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
              mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
            }
            if( NIL != wft )
            {
              final SubLObject item_var = reformulated;
              if( NIL == conses_high.member( item_var, good_denots, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                good_denots = ConsesLow.cons( item_var, good_denots );
              }
            }
          }
          else if( denot.isNumber() )
          {
            good_denots = ConsesLow.cons( ConsesLow.list( $const114$Unity, denot ), good_denots );
          }
          cdolist_list_var = cdolist_list_var.rest();
          denot = cdolist_list_var.first();
        }
        cyc_answers = good_denots;
        Dynamic.sublisp_throw( $sym118$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sanity_checker_scratchpad_cyc_answers( self, cyc_answers );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sanity_checker_scratchpad_method = Errors.handleThrowable( ccatch_env_var, $sym118$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sanity_checker_scratchpad_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 12792L)
  public static SubLObject sanity_checker_scratchpad_compute_degenerate_diagnosis_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sanity_checker_scratchpad_method = NIL;
    SubLObject degenerate_diagnosis = get_sanity_checker_scratchpad_degenerate_diagnosis( self );
    final SubLObject cyc_answers = get_sanity_checker_scratchpad_cyc_answers( self );
    final SubLObject cyc_focuses = get_sanity_checker_scratchpad_cyc_focuses( self );
    final SubLObject predicate = get_sanity_checker_scratchpad_predicate( self );
    try
    {
      thread.throwStack.push( $sym123$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD );
      try
      {
        final SubLObject diagnosis = object.new_class_instance( $sym124$SANITY_CHECKER_DIAGNOSIS );
        SubLObject basis = ZERO_INTEGER;
        if( NIL == predicate )
        {
          basis = Numbers.add( basis, $int125$100 );
        }
        if( NIL == cyc_focuses )
        {
          basis = Numbers.add( basis, TEN_INTEGER );
        }
        if( NIL == cyc_answers )
        {
          basis = Numbers.add( basis, ONE_INTEGER );
        }
        if( basis.numG( ZERO_INTEGER ) )
        {
          instances.set_slot( diagnosis, $sym126$FAILURE_CODE, basis );
          degenerate_diagnosis = diagnosis;
        }
        Dynamic.sublisp_throw( $sym123$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sanity_checker_scratchpad_degenerate_diagnosis( self, degenerate_diagnosis );
          set_sanity_checker_scratchpad_cyc_answers( self, cyc_answers );
          set_sanity_checker_scratchpad_cyc_focuses( self, cyc_focuses );
          set_sanity_checker_scratchpad_predicate( self, predicate );
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
      catch_var_for_sanity_checker_scratchpad_method = Errors.handleThrowable( ccatch_env_var, $sym123$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sanity_checker_scratchpad_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 13224L)
  public static SubLObject sanity_checker_scratchpad_initialize_checkers_method(final SubLObject self, final SubLObject fudge_factor)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sanity_checker_scratchpad_method = NIL;
    SubLObject degenerate_diagnosis = get_sanity_checker_scratchpad_degenerate_diagnosis( self );
    SubLObject checkers_pool = get_sanity_checker_scratchpad_checkers_pool( self );
    final SubLObject cyc_answers = get_sanity_checker_scratchpad_cyc_answers( self );
    final SubLObject cyc_focuses = get_sanity_checker_scratchpad_cyc_focuses( self );
    final SubLObject predicate = get_sanity_checker_scratchpad_predicate( self );
    try
    {
      thread.throwStack.push( $sym130$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD );
      try
      {
        final SubLObject pred_arg1_set = kb_mapping_utilities.pred_values_in_any_mt( predicate, $const131$arg1Isa, ONE_INTEGER, TWO_INTEGER, UNPROVIDED );
        final SubLObject pred_arg2_set = kb_mapping_utilities.pred_values_in_any_mt( predicate, $const132$arg2Isa, ONE_INTEGER, TWO_INTEGER, UNPROVIDED );
        SubLObject good_arg1s = NIL;
        SubLObject good_arg2s = NIL;
        SubLObject cdolist_list_var = cyc_focuses;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject fail = NIL;
          if( NIL == fail )
          {
            SubLObject csome_list_var = pred_arg1_set;
            SubLObject arg2 = NIL;
            arg2 = csome_list_var.first();
            while ( NIL == fail && NIL != csome_list_var)
            {
              if( NIL == isa.isa_in_any_mtP( arg, arg2 ) && NIL == genls.genl_in_any_mtP( arg, arg2 ) )
              {
                fail = T;
              }
              csome_list_var = csome_list_var.rest();
              arg2 = csome_list_var.first();
            }
          }
          if( NIL == fail )
          {
            final SubLObject item_var = arg;
            if( NIL == conses_high.member( item_var, good_arg1s, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              good_arg1s = ConsesLow.cons( item_var, good_arg1s );
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          arg = cdolist_list_var.first();
        }
        cdolist_list_var = cyc_answers;
        arg = NIL;
        arg = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject fail = NIL;
          SubLObject cast = NIL;
          if( NIL == fail )
          {
            SubLObject csome_list_var2 = pred_arg2_set;
            SubLObject arg3 = NIL;
            arg3 = csome_list_var2.first();
            while ( NIL == fail && NIL != csome_list_var2)
            {
              cast = heuristically_cast_unity( predicate, arg );
              if( NIL != term.el_fort_p( cast ) )
              {
                fail = makeBoolean( NIL == isa.isa_in_any_mtP( cast, arg3 ) && NIL == genls.genl_in_any_mtP( arg, arg3 ) );
              }
              else
              {
                fail = makeBoolean( !cast.isNumber() || !cast.isPositive() );
              }
              csome_list_var2 = csome_list_var2.rest();
              arg3 = csome_list_var2.first();
            }
          }
          if( NIL == fail )
          {
            final SubLObject item_var2 = cast;
            if( NIL == conses_high.member( item_var2, good_arg2s, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              good_arg2s = ConsesLow.cons( item_var2, good_arg2s );
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          arg = cdolist_list_var.first();
        }
        cdolist_list_var = good_arg1s;
        SubLObject good_arg1 = NIL;
        good_arg1 = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject cdolist_list_var_$2 = good_arg2s;
          SubLObject good_arg2 = NIL;
          good_arg2 = cdolist_list_var_$2.first();
          while ( NIL != cdolist_list_var_$2)
          {
            final SubLObject checker = object.new_class_instance( $sym133$SCALAR_CHECKER );
            instances.set_slot( checker, $sym17$FUDGE_FACTOR, fudge_factor );
            instances.set_slot( checker, $sym74$PREDICATE, predicate );
            instances.set_slot( checker, $sym134$ARG1, good_arg1 );
            instances.set_slot( checker, $sym135$ARG2, good_arg2 );
            checkers_pool = ConsesLow.cons( checker, checkers_pool );
            cdolist_list_var_$2 = cdolist_list_var_$2.rest();
            good_arg2 = cdolist_list_var_$2.first();
          }
          cdolist_list_var = cdolist_list_var.rest();
          good_arg1 = cdolist_list_var.first();
        }
        if( NIL == checkers_pool )
        {
          final SubLObject diagnosis = object.new_class_instance( $sym124$SANITY_CHECKER_DIAGNOSIS );
          instances.set_slot( diagnosis, $sym126$FAILURE_CODE, $int136$1000 );
          degenerate_diagnosis = diagnosis;
        }
        Dynamic.sublisp_throw( $sym130$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sanity_checker_scratchpad_degenerate_diagnosis( self, degenerate_diagnosis );
          set_sanity_checker_scratchpad_checkers_pool( self, checkers_pool );
          set_sanity_checker_scratchpad_cyc_answers( self, cyc_answers );
          set_sanity_checker_scratchpad_cyc_focuses( self, cyc_focuses );
          set_sanity_checker_scratchpad_predicate( self, predicate );
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
      catch_var_for_sanity_checker_scratchpad_method = Errors.handleThrowable( ccatch_env_var, $sym130$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sanity_checker_scratchpad_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 14730L)
  public static SubLObject sanity_checker_scratchpad_diagnose_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sanity_checker_scratchpad_method = NIL;
    final SubLObject checkers_pool = get_sanity_checker_scratchpad_checkers_pool( self );
    try
    {
      thread.throwStack.push( $sym139$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD );
      try
      {
        SubLObject cdolist_list_var = checkers_pool;
        SubLObject checker = NIL;
        checker = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          methods.funcall_instance_method_with_0_args( checker, $sym140$COMPUTE_RANGE );
          methods.funcall_instance_method_with_0_args( checker, $sym42$DIAGNOSE );
          cdolist_list_var = cdolist_list_var.rest();
          checker = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym139$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sanity_checker_scratchpad_checkers_pool( self, checkers_pool );
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
      catch_var_for_sanity_checker_scratchpad_method = Errors.handleThrowable( ccatch_env_var, $sym139$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sanity_checker_scratchpad_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 15072L)
  public static SubLObject set_scalar_checker_backchain_parameter(final SubLObject number)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.integerp( number ) : number;
    if( !ZERO_INTEGER.numG( number ) )
    {
      $scalar_checker_backchain$.setDynamicValue( number, thread );
    }
    return $scalar_checker_backchain$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 15270L)
  public static SubLObject get_scalar_checker_arg2range(final SubLObject scalar_checker)
  {
    return classes.subloop_get_access_protected_instance_slot( scalar_checker, SEVEN_INTEGER, $sym144$ARG2RANGE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 15270L)
  public static SubLObject set_scalar_checker_arg2range(final SubLObject scalar_checker, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( scalar_checker, value, SEVEN_INTEGER, $sym144$ARG2RANGE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 15270L)
  public static SubLObject get_scalar_checker_arg2(final SubLObject scalar_checker)
  {
    return classes.subloop_get_instance_slot( scalar_checker, SIX_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 15270L)
  public static SubLObject set_scalar_checker_arg2(final SubLObject scalar_checker, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( scalar_checker, value, SIX_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 15270L)
  public static SubLObject get_scalar_checker_arg1(final SubLObject scalar_checker)
  {
    return classes.subloop_get_instance_slot( scalar_checker, FIVE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 15270L)
  public static SubLObject set_scalar_checker_arg1(final SubLObject scalar_checker, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( scalar_checker, value, FIVE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 15270L)
  public static SubLObject get_scalar_checker_backchain(final SubLObject scalar_checker)
  {
    return classes.subloop_get_instance_slot( scalar_checker, FOUR_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 15270L)
  public static SubLObject set_scalar_checker_backchain(final SubLObject scalar_checker, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( scalar_checker, value, FOUR_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 15270L)
  public static SubLObject get_scalar_checker_diagnosis(final SubLObject scalar_checker)
  {
    return classes.subloop_get_instance_slot( scalar_checker, THREE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 15270L)
  public static SubLObject set_scalar_checker_diagnosis(final SubLObject scalar_checker, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( scalar_checker, value, THREE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 15270L)
  public static SubLObject get_scalar_checker_predicate(final SubLObject scalar_checker)
  {
    return classes.subloop_get_instance_slot( scalar_checker, TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 15270L)
  public static SubLObject set_scalar_checker_predicate(final SubLObject scalar_checker, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( scalar_checker, value, TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 15270L)
  public static SubLObject get_scalar_checker_fudge_factor(final SubLObject scalar_checker)
  {
    return classes.subloop_get_instance_slot( scalar_checker, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 15270L)
  public static SubLObject set_scalar_checker_fudge_factor(final SubLObject scalar_checker, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( scalar_checker, value, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 15270L)
  public static SubLObject subloop_reserved_initialize_scalar_checker_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym9$OBJECT, $sym13$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 15270L)
  public static SubLObject subloop_reserved_initialize_scalar_checker_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym9$OBJECT, $sym15$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym9$OBJECT, $sym16$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym133$SCALAR_CHECKER, $sym17$FUDGE_FACTOR, NIL );
    classes.subloop_initialize_slot( new_instance, $sym133$SCALAR_CHECKER, $sym74$PREDICATE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym133$SCALAR_CHECKER, $sym81$DIAGNOSIS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym133$SCALAR_CHECKER, $sym146$BACKCHAIN, NIL );
    classes.subloop_initialize_slot( new_instance, $sym133$SCALAR_CHECKER, $sym134$ARG1, NIL );
    classes.subloop_initialize_slot( new_instance, $sym133$SCALAR_CHECKER, $sym135$ARG2, NIL );
    classes.subloop_initialize_slot( new_instance, $sym133$SCALAR_CHECKER, $sym144$ARG2RANGE, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 15270L)
  public static SubLObject scalar_checker_p(final SubLObject scalar_checker)
  {
    return classes.subloop_instanceof_class( scalar_checker, $sym133$SCALAR_CHECKER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 15635L)
  public static SubLObject scalar_checker_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_scalar_checker_method = NIL;
    SubLObject backchain = get_scalar_checker_backchain( self );
    try
    {
      thread.throwStack.push( $sym149$OUTER_CATCH_FOR_SCALAR_CHECKER_METHOD );
      try
      {
        object.object_initialize_method( self );
        backchain = $scalar_checker_backchain$.getDynamicValue( thread );
        Dynamic.sublisp_throw( $sym149$OUTER_CATCH_FOR_SCALAR_CHECKER_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_scalar_checker_backchain( self, backchain );
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
      catch_var_for_scalar_checker_method = Errors.handleThrowable( ccatch_env_var, $sym149$OUTER_CATCH_FOR_SCALAR_CHECKER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_scalar_checker_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 15781L)
  public static SubLObject scalar_checker_compute_range_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_scalar_checker_method = NIL;
    SubLObject arg2range = get_scalar_checker_arg2range( self );
    final SubLObject arg1 = get_scalar_checker_arg1( self );
    final SubLObject backchain = get_scalar_checker_backchain( self );
    final SubLObject predicate = get_scalar_checker_predicate( self );
    final SubLObject fudge_factor = get_scalar_checker_fudge_factor( self );
    try
    {
      thread.throwStack.push( $sym152$OUTER_CATCH_FOR_SCALAR_CHECKER_METHOD );
      try
      {
        final SubLObject arg2 = typeshift_argument( arg1 );
        final SubLObject query = ConsesLow.listS( predicate, arg2, $list153 );
        SubLObject to_merge;
        final SubLObject answers = to_merge = ask_utilities.ask_template( $sym154$_RANGE, query, $const120$EverythingPSC, backchain, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject range = NIL;
        if( NIL == range )
        {
          SubLObject csome_list_var = answers;
          SubLObject v_answer = NIL;
          v_answer = csome_list_var.first();
          while ( NIL == range && NIL != csome_list_var)
          {
            final SubLObject candidate_range = object.new_class_instance( $sym155$SCALAR_RANGE );
            methods.funcall_instance_method_with_1_args( candidate_range, $sym156$FILL, v_answer );
            to_merge = to_merge.rest();
            if( NIL == methods.funcall_instance_method_with_0_args( candidate_range, $sym157$EMPTY_P ) )
            {
              range = candidate_range;
            }
            csome_list_var = csome_list_var.rest();
            v_answer = csome_list_var.first();
          }
        }
        SubLObject cdolist_list_var = to_merge;
        SubLObject v_answer = NIL;
        v_answer = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != range )
          {
            final SubLObject new_range = object.new_class_instance( $sym155$SCALAR_RANGE );
            methods.funcall_instance_method_with_1_args( new_range, $sym156$FILL, v_answer );
            if( NIL == methods.funcall_instance_method_with_0_args( new_range, $sym157$EMPTY_P ) )
            {
              range = methods.funcall_instance_method_with_1_args( range, $sym158$MERGE, new_range );
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          v_answer = cdolist_list_var.first();
        }
        if( NIL != range )
        {
          methods.funcall_instance_method_with_1_args( range, $sym159$FUDGE, fudge_factor );
          arg2range = range;
        }
        Dynamic.sublisp_throw( $sym152$OUTER_CATCH_FOR_SCALAR_CHECKER_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_scalar_checker_arg2range( self, arg2range );
          set_scalar_checker_arg1( self, arg1 );
          set_scalar_checker_backchain( self, backchain );
          set_scalar_checker_predicate( self, predicate );
          set_scalar_checker_fudge_factor( self, fudge_factor );
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
      catch_var_for_scalar_checker_method = Errors.handleThrowable( ccatch_env_var, $sym152$OUTER_CATCH_FOR_SCALAR_CHECKER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_scalar_checker_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 16598L)
  public static SubLObject typeshift_argument(final SubLObject arg)
  {
    if( NIL != isa.isa_in_any_mtP( arg, $const161$Collection ) )
    {
      return ConsesLow.list( $const162$SomeFn, arg );
    }
    return arg;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 16735L)
  public static SubLObject scalar_checker_diagnose_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_scalar_checker_method = NIL;
    final SubLObject arg2range = get_scalar_checker_arg2range( self );
    final SubLObject arg2 = get_scalar_checker_arg2( self );
    final SubLObject arg3 = get_scalar_checker_arg1( self );
    SubLObject diagnosis = get_scalar_checker_diagnosis( self );
    final SubLObject predicate = get_scalar_checker_predicate( self );
    try
    {
      thread.throwStack.push( $sym164$OUTER_CATCH_FOR_SCALAR_CHECKER_METHOD );
      try
      {
        final SubLObject diagn = object.new_class_instance( $sym124$SANITY_CHECKER_DIAGNOSIS );
        final SubLObject cast = heuristically_cast_unity( predicate, arg2 );
        final SubLObject arg2min = ( NIL != arg2range ) ? methods.funcall_instance_method_with_0_args( arg2range, $sym165$GET_MIN ) : NIL;
        final SubLObject arg2max = ( NIL != arg2range ) ? methods.funcall_instance_method_with_0_args( arg2range, $sym166$GET_MAX ) : NIL;
        final SubLObject range = ( NIL != arg2range ) ? methods.funcall_instance_method_with_0_args( arg2range, $sym167$LISTIFY ) : NIL;
        SubLObject cycl_explanation = NIL;
        instances.set_slot( diagn, $sym74$PREDICATE, predicate );
        instances.set_slot( diagn, $sym168$PROPOSED_ARG, arg3 );
        instances.set_slot( diagn, $sym8$PROPOSED_VALUE, arg2 );
        if( NIL != arg2min && NIL != arg2max )
        {
          final SubLObject negative_test_min = ConsesLow.list( $const169$lessThan, cast, arg2min );
          final SubLObject negative_test_max = ConsesLow.list( $const170$greaterThan, cast, arg2max );
          final SubLObject positive_test = ConsesLow.list( $const171$quantitySubsumes, range, cast );
          if( NIL != inference_kernel.new_cyc_query( negative_test_min, $const120$EverythingPSC, UNPROVIDED ) )
          {
            instances.set_slot( diagn, $sym172$COMPLETE, ONE_INTEGER );
            instances.set_slot( diagn, $sym173$ANSWER_KNOWN, ONE_INTEGER );
            instances.set_slot( diagn, $sym76$ANSWER, ZERO_INTEGER );
            cycl_explanation = ConsesLow.list( $const174$and, ConsesLow.list( predicate, arg3, range ), negative_test_min );
          }
          else if( NIL != inference_kernel.new_cyc_query( negative_test_max, $const120$EverythingPSC, UNPROVIDED ) )
          {
            instances.set_slot( diagn, $sym172$COMPLETE, ONE_INTEGER );
            instances.set_slot( diagn, $sym173$ANSWER_KNOWN, ONE_INTEGER );
            instances.set_slot( diagn, $sym76$ANSWER, ZERO_INTEGER );
            cycl_explanation = ConsesLow.list( $const174$and, ConsesLow.list( predicate, arg3, range ), negative_test_max );
          }
          else if( NIL != inference_kernel.new_cyc_query( positive_test, $const120$EverythingPSC, UNPROVIDED ) )
          {
            instances.set_slot( diagn, $sym172$COMPLETE, ONE_INTEGER );
            instances.set_slot( diagn, $sym173$ANSWER_KNOWN, ONE_INTEGER );
            instances.set_slot( diagn, $sym76$ANSWER, ONE_INTEGER );
            cycl_explanation = ConsesLow.list( $const174$and, ConsesLow.list( predicate, arg3, range ), positive_test );
          }
          instances.set_slot( diagn, $sym175$JUSTIFICATION, pph_main.generate_phrase( cycl_explanation, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
        }
        else
        {
          instances.set_slot( diagn, $sym172$COMPLETE, ONE_INTEGER );
          instances.set_slot( diagn, $sym173$ANSWER_KNOWN, ZERO_INTEGER );
          instances.set_slot( diagn, $sym76$ANSWER, ZERO_INTEGER );
          instances.set_slot( diagn, $sym175$JUSTIFICATION, $str176$No_information_available );
        }
        diagnosis = diagn;
        Dynamic.sublisp_throw( $sym164$OUTER_CATCH_FOR_SCALAR_CHECKER_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_scalar_checker_arg2range( self, arg2range );
          set_scalar_checker_arg2( self, arg2 );
          set_scalar_checker_arg1( self, arg3 );
          set_scalar_checker_diagnosis( self, diagnosis );
          set_scalar_checker_predicate( self, predicate );
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
      catch_var_for_scalar_checker_method = Errors.handleThrowable( ccatch_env_var, $sym164$OUTER_CATCH_FOR_SCALAR_CHECKER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_scalar_checker_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 18500L)
  public static SubLObject get_sanity_checker_diagnosis_predicate(final SubLObject sanity_checker_diagnosis)
  {
    return classes.subloop_get_instance_slot( sanity_checker_diagnosis, EIGHT_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 18500L)
  public static SubLObject set_sanity_checker_diagnosis_predicate(final SubLObject sanity_checker_diagnosis, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( sanity_checker_diagnosis, value, EIGHT_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 18500L)
  public static SubLObject get_sanity_checker_diagnosis_proposed_arg(final SubLObject sanity_checker_diagnosis)
  {
    return classes.subloop_get_instance_slot( sanity_checker_diagnosis, SEVEN_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 18500L)
  public static SubLObject set_sanity_checker_diagnosis_proposed_arg(final SubLObject sanity_checker_diagnosis, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( sanity_checker_diagnosis, value, SEVEN_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 18500L)
  public static SubLObject get_sanity_checker_diagnosis_proposed_value(final SubLObject sanity_checker_diagnosis)
  {
    return classes.subloop_get_instance_slot( sanity_checker_diagnosis, SIX_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 18500L)
  public static SubLObject set_sanity_checker_diagnosis_proposed_value(final SubLObject sanity_checker_diagnosis, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( sanity_checker_diagnosis, value, SIX_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 18500L)
  public static SubLObject get_sanity_checker_diagnosis_justification(final SubLObject sanity_checker_diagnosis)
  {
    return classes.subloop_get_instance_slot( sanity_checker_diagnosis, FIVE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 18500L)
  public static SubLObject set_sanity_checker_diagnosis_justification(final SubLObject sanity_checker_diagnosis, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( sanity_checker_diagnosis, value, FIVE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 18500L)
  public static SubLObject get_sanity_checker_diagnosis_answer(final SubLObject sanity_checker_diagnosis)
  {
    return classes.subloop_get_instance_slot( sanity_checker_diagnosis, FOUR_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 18500L)
  public static SubLObject set_sanity_checker_diagnosis_answer(final SubLObject sanity_checker_diagnosis, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( sanity_checker_diagnosis, value, FOUR_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 18500L)
  public static SubLObject get_sanity_checker_diagnosis_answer_known(final SubLObject sanity_checker_diagnosis)
  {
    return classes.subloop_get_instance_slot( sanity_checker_diagnosis, THREE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 18500L)
  public static SubLObject set_sanity_checker_diagnosis_answer_known(final SubLObject sanity_checker_diagnosis, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( sanity_checker_diagnosis, value, THREE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 18500L)
  public static SubLObject get_sanity_checker_diagnosis_complete(final SubLObject sanity_checker_diagnosis)
  {
    return classes.subloop_get_instance_slot( sanity_checker_diagnosis, TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 18500L)
  public static SubLObject set_sanity_checker_diagnosis_complete(final SubLObject sanity_checker_diagnosis, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( sanity_checker_diagnosis, value, TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 18500L)
  public static SubLObject get_sanity_checker_diagnosis_failure_code(final SubLObject sanity_checker_diagnosis)
  {
    return classes.subloop_get_instance_slot( sanity_checker_diagnosis, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 18500L)
  public static SubLObject set_sanity_checker_diagnosis_failure_code(final SubLObject sanity_checker_diagnosis, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( sanity_checker_diagnosis, value, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 18500L)
  public static SubLObject subloop_reserved_initialize_sanity_checker_diagnosis_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym9$OBJECT, $sym13$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 18500L)
  public static SubLObject subloop_reserved_initialize_sanity_checker_diagnosis_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym9$OBJECT, $sym15$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym9$OBJECT, $sym16$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym124$SANITY_CHECKER_DIAGNOSIS, $sym126$FAILURE_CODE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym124$SANITY_CHECKER_DIAGNOSIS, $sym172$COMPLETE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym124$SANITY_CHECKER_DIAGNOSIS, $sym173$ANSWER_KNOWN, NIL );
    classes.subloop_initialize_slot( new_instance, $sym124$SANITY_CHECKER_DIAGNOSIS, $sym76$ANSWER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym124$SANITY_CHECKER_DIAGNOSIS, $sym175$JUSTIFICATION, NIL );
    classes.subloop_initialize_slot( new_instance, $sym124$SANITY_CHECKER_DIAGNOSIS, $sym8$PROPOSED_VALUE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym124$SANITY_CHECKER_DIAGNOSIS, $sym168$PROPOSED_ARG, NIL );
    classes.subloop_initialize_slot( new_instance, $sym124$SANITY_CHECKER_DIAGNOSIS, $sym74$PREDICATE, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 18500L)
  public static SubLObject sanity_checker_diagnosis_p(final SubLObject sanity_checker_diagnosis)
  {
    return classes.subloop_instanceof_class( sanity_checker_diagnosis, $sym124$SANITY_CHECKER_DIAGNOSIS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 19191L)
  public static SubLObject sanity_checker_diagnosis_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sanity_checker_diagnosis_method = NIL;
    SubLObject failure_code = get_sanity_checker_diagnosis_failure_code( self );
    try
    {
      thread.throwStack.push( $sym182$OUTER_CATCH_FOR_SANITY_CHECKER_DIAGNOSIS_METHOD );
      try
      {
        object.object_initialize_method( self );
        failure_code = ZERO_INTEGER;
        Dynamic.sublisp_throw( $sym182$OUTER_CATCH_FOR_SANITY_CHECKER_DIAGNOSIS_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sanity_checker_diagnosis_failure_code( self, failure_code );
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
      catch_var_for_sanity_checker_diagnosis_method = Errors.handleThrowable( ccatch_env_var, $sym182$OUTER_CATCH_FOR_SANITY_CHECKER_DIAGNOSIS_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sanity_checker_diagnosis_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 19325L)
  public static SubLObject sanity_checker_diagnosis_boolean_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sanity_checker_diagnosis_method = NIL;
    final SubLObject v_answer = get_sanity_checker_diagnosis_answer( self );
    try
    {
      thread.throwStack.push( $sym185$OUTER_CATCH_FOR_SANITY_CHECKER_DIAGNOSIS_METHOD );
      try
      {
        if( !v_answer.isInteger() )
        {
          Dynamic.sublisp_throw( $sym185$OUTER_CATCH_FOR_SANITY_CHECKER_DIAGNOSIS_METHOD, NIL );
        }
        Dynamic.sublisp_throw( $sym185$OUTER_CATCH_FOR_SANITY_CHECKER_DIAGNOSIS_METHOD, Numbers.numG( v_answer, ZERO_INTEGER ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sanity_checker_diagnosis_answer( self, v_answer );
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
      catch_var_for_sanity_checker_diagnosis_method = Errors.handleThrowable( ccatch_env_var, $sym185$OUTER_CATCH_FOR_SANITY_CHECKER_DIAGNOSIS_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sanity_checker_diagnosis_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 19551L)
  public static SubLObject get_scalar_range_point_info(final SubLObject scalar_range)
  {
    return classes.subloop_get_access_protected_instance_slot( scalar_range, FOUR_INTEGER, $sym188$POINT_INFO );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 19551L)
  public static SubLObject set_scalar_range_point_info(final SubLObject scalar_range, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( scalar_range, value, FOUR_INTEGER, $sym188$POINT_INFO );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 19551L)
  public static SubLObject get_scalar_range_max(final SubLObject scalar_range)
  {
    return classes.subloop_get_access_protected_instance_slot( scalar_range, THREE_INTEGER, $sym189$MAX );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 19551L)
  public static SubLObject set_scalar_range_max(final SubLObject scalar_range, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( scalar_range, value, THREE_INTEGER, $sym189$MAX );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 19551L)
  public static SubLObject get_scalar_range_min(final SubLObject scalar_range)
  {
    return classes.subloop_get_access_protected_instance_slot( scalar_range, TWO_INTEGER, $sym190$MIN );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 19551L)
  public static SubLObject set_scalar_range_min(final SubLObject scalar_range, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( scalar_range, value, TWO_INTEGER, $sym190$MIN );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 19551L)
  public static SubLObject get_scalar_range_unit(final SubLObject scalar_range)
  {
    return classes.subloop_get_access_protected_instance_slot( scalar_range, ONE_INTEGER, $sym191$UNIT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 19551L)
  public static SubLObject set_scalar_range_unit(final SubLObject scalar_range, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( scalar_range, value, ONE_INTEGER, $sym191$UNIT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 19551L)
  public static SubLObject subloop_reserved_initialize_scalar_range_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym9$OBJECT, $sym13$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 19551L)
  public static SubLObject subloop_reserved_initialize_scalar_range_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym9$OBJECT, $sym15$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym9$OBJECT, $sym16$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym155$SCALAR_RANGE, $sym191$UNIT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym155$SCALAR_RANGE, $sym190$MIN, NIL );
    classes.subloop_initialize_slot( new_instance, $sym155$SCALAR_RANGE, $sym189$MAX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym155$SCALAR_RANGE, $sym188$POINT_INFO, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 19551L)
  public static SubLObject scalar_range_p(final SubLObject scalar_range)
  {
    return classes.subloop_instanceof_class( scalar_range, $sym155$SCALAR_RANGE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 20741L)
  public static SubLObject scalar_range_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_scalar_range_method = NIL;
    final SubLObject point_info = get_scalar_range_point_info( self );
    final SubLObject max = get_scalar_range_max( self );
    final SubLObject min = get_scalar_range_min( self );
    final SubLObject unit = get_scalar_range_unit( self );
    try
    {
      thread.throwStack.push( $sym197$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD );
      try
      {
        print_high.princ( ConsesLow.list( unit, min, max, point_info ), stream );
        Dynamic.sublisp_throw( $sym197$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_scalar_range_point_info( self, point_info );
          set_scalar_range_max( self, max );
          set_scalar_range_min( self, min );
          set_scalar_range_unit( self, unit );
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
      catch_var_for_scalar_range_method = Errors.handleThrowable( ccatch_env_var, $sym197$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_scalar_range_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 20939L)
  public static SubLObject scalar_range_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_scalar_range_method = NIL;
    SubLObject max = get_scalar_range_max( self );
    SubLObject min = get_scalar_range_min( self );
    SubLObject unit = get_scalar_range_unit( self );
    try
    {
      thread.throwStack.push( $sym200$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD );
      try
      {
        object.object_initialize_method( self );
        unit = $const114$Unity;
        min = ZERO_INTEGER;
        max = ZERO_INTEGER;
        Dynamic.sublisp_throw( $sym200$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_scalar_range_max( self, max );
          set_scalar_range_min( self, min );
          set_scalar_range_unit( self, unit );
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
      catch_var_for_scalar_range_method = Errors.handleThrowable( ccatch_env_var, $sym200$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_scalar_range_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 21091L)
  public static SubLObject scalar_range_empty_p_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_scalar_range_method = NIL;
    final SubLObject max = get_scalar_range_max( self );
    final SubLObject min = get_scalar_range_min( self );
    final SubLObject unit = get_scalar_range_unit( self );
    try
    {
      thread.throwStack.push( $sym203$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym203$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, makeBoolean( unit.eql( $const114$Unity ) && min.numE( ZERO_INTEGER ) && max.numE( ZERO_INTEGER ) ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_scalar_range_max( self, max );
          set_scalar_range_min( self, min );
          set_scalar_range_unit( self, unit );
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
      catch_var_for_scalar_range_method = Errors.handleThrowable( ccatch_env_var, $sym203$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_scalar_range_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 21202L)
  public static SubLObject scalar_range_fill_method(final SubLObject self, final SubLObject value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_scalar_range_method = NIL;
    SubLObject point_info = get_scalar_range_point_info( self );
    SubLObject max = get_scalar_range_max( self );
    SubLObject min = get_scalar_range_min( self );
    SubLObject unit = get_scalar_range_unit( self );
    try
    {
      thread.throwStack.push( $sym207$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD );
      try
      {
        if( NIL == inference_kernel.new_cyc_query( ConsesLow.listS( $const208$isa, value, $list209 ), $const210$BaseKB, UNPROVIDED ) )
        {
          Dynamic.sublisp_throw( $sym207$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, self );
        }
        if( value.isNumber() )
        {
          min = value;
          max = value;
          point_info = T;
        }
        else if( value.isCons() )
        {
          final SubLObject value_unit = value.first();
          final SubLObject value_min = conses_high.second( value );
          final SubLObject value_max = conses_high.third( value );
          SubLObject new_unit = NIL;
          SubLObject new_min = NIL;
          SubLObject new_max = NIL;
          if( NIL != isa.isaP( value_unit, $const211$UnitOfMeasure, UNPROVIDED, UNPROVIDED ) )
          {
            new_unit = value_unit;
          }
          if( value_min.isNumber() )
          {
            new_min = value_min;
          }
          if( value_max.isNumber() )
          {
            new_max = value_max;
          }
          else
          {
            new_max = new_min;
          }
          if( NIL != new_unit && NIL != new_min && NIL != new_max )
          {
            unit = new_unit;
            min = new_min;
            max = new_max;
          }
          if( new_min.eql( new_max ) )
          {
            point_info = T;
          }
        }
        Dynamic.sublisp_throw( $sym207$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_scalar_range_point_info( self, point_info );
          set_scalar_range_max( self, max );
          set_scalar_range_min( self, min );
          set_scalar_range_unit( self, unit );
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
      catch_var_for_scalar_range_method = Errors.handleThrowable( ccatch_env_var, $sym207$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_scalar_range_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 21997L)
  public static SubLObject scalar_range_get_unit_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_scalar_range_method = NIL;
    final SubLObject unit = get_scalar_range_unit( self );
    try
    {
      thread.throwStack.push( $sym215$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym215$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, unit );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_scalar_range_unit( self, unit );
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
      catch_var_for_scalar_range_method = Errors.handleThrowable( ccatch_env_var, $sym215$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_scalar_range_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 22068L)
  public static SubLObject scalar_range_get_min_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_scalar_range_method = NIL;
    final SubLObject min = get_scalar_range_min( self );
    final SubLObject unit = get_scalar_range_unit( self );
    try
    {
      thread.throwStack.push( $sym218$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD );
      try
      {
        if( NIL != methods.funcall_instance_method_with_0_args( self, $sym157$EMPTY_P ) )
        {
          Dynamic.sublisp_throw( $sym218$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, NIL );
        }
        else
        {
          Dynamic.sublisp_throw( $sym218$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, ConsesLow.list( unit, min ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_scalar_range_min( self, min );
          set_scalar_range_unit( self, unit );
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
      catch_var_for_scalar_range_method = Errors.handleThrowable( ccatch_env_var, $sym218$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_scalar_range_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 22199L)
  public static SubLObject scalar_range_get_min_value_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_scalar_range_method = NIL;
    final SubLObject min = get_scalar_range_min( self );
    try
    {
      thread.throwStack.push( $sym222$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym222$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, min );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_scalar_range_min( self, min );
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
      catch_var_for_scalar_range_method = Errors.handleThrowable( ccatch_env_var, $sym222$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_scalar_range_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 22274L)
  public static SubLObject scalar_range_get_max_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_scalar_range_method = NIL;
    final SubLObject max = get_scalar_range_max( self );
    final SubLObject unit = get_scalar_range_unit( self );
    try
    {
      thread.throwStack.push( $sym225$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD );
      try
      {
        if( NIL != methods.funcall_instance_method_with_0_args( self, $sym157$EMPTY_P ) )
        {
          Dynamic.sublisp_throw( $sym225$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, NIL );
        }
        else
        {
          Dynamic.sublisp_throw( $sym225$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, ConsesLow.list( unit, max ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_scalar_range_max( self, max );
          set_scalar_range_unit( self, unit );
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
      catch_var_for_scalar_range_method = Errors.handleThrowable( ccatch_env_var, $sym225$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_scalar_range_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 22405L)
  public static SubLObject scalar_range_get_max_value_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_scalar_range_method = NIL;
    final SubLObject max = get_scalar_range_max( self );
    try
    {
      thread.throwStack.push( $sym229$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym229$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, max );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_scalar_range_max( self, max );
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
      catch_var_for_scalar_range_method = Errors.handleThrowable( ccatch_env_var, $sym229$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_scalar_range_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 22480L)
  public static SubLObject scalar_range_listify_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_scalar_range_method = NIL;
    final SubLObject max = get_scalar_range_max( self );
    final SubLObject min = get_scalar_range_min( self );
    final SubLObject unit = get_scalar_range_unit( self );
    try
    {
      thread.throwStack.push( $sym232$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym232$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, ConsesLow.list( unit, min, max ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_scalar_range_max( self, max );
          set_scalar_range_min( self, min );
          set_scalar_range_unit( self, unit );
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
      catch_var_for_scalar_range_method = Errors.handleThrowable( ccatch_env_var, $sym232$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_scalar_range_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 22566L)
  public static SubLObject scalar_range_fudge_method(final SubLObject self, final SubLObject fudge_factor)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_scalar_range_method = NIL;
    SubLObject max = get_scalar_range_max( self );
    SubLObject min = get_scalar_range_min( self );
    try
    {
      thread.throwStack.push( $sym235$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD );
      try
      {
        assert NIL != Types.numberp( fudge_factor ) : fudge_factor;
        min = Numbers.subtract( min, Numbers.multiply( min, fudge_factor ) );
        max = Numbers.add( max, Numbers.multiply( max, fudge_factor ) );
        Dynamic.sublisp_throw( $sym235$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_scalar_range_max( self, max );
          set_scalar_range_min( self, min );
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
      catch_var_for_scalar_range_method = Errors.handleThrowable( ccatch_env_var, $sym235$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_scalar_range_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 22768L)
  public static SubLObject scalar_range_convertible_p_method(final SubLObject self, final SubLObject other_range)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_scalar_range_method = NIL;
    final SubLObject unit = get_scalar_range_unit( self );
    try
    {
      thread.throwStack.push( $sym240$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD );
      try
      {
        assert NIL != scalar_range_p( other_range ) : other_range;
        final SubLObject other_unit = methods.funcall_instance_method_with_0_args( other_range, $sym213$GET_UNIT );
        final SubLObject query = ConsesLow.listS( $const174$and, ConsesLow.listS( $const208$isa, unit, $list242 ), ConsesLow.listS( $const208$isa, other_unit, $list242 ), $list243 );
        Dynamic.sublisp_throw( $sym240$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, inference_kernel.new_cyc_query( query, $const120$EverythingPSC, UNPROVIDED ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_scalar_range_unit( self, unit );
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
      catch_var_for_scalar_range_method = Errors.handleThrowable( ccatch_env_var, $sym240$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_scalar_range_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 23090L)
  public static SubLObject scalar_range_merge_method(final SubLObject self, final SubLObject other_range)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_scalar_range_method = NIL;
    final SubLObject point_info = get_scalar_range_point_info( self );
    try
    {
      thread.throwStack.push( $sym246$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD );
      try
      {
        if( NIL == methods.funcall_instance_method_with_1_args( self, $sym237$CONVERTIBLE_P, other_range ) )
        {
          Dynamic.sublisp_throw( $sym246$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, NIL );
        }
        final SubLObject other_point = instances.get_slot( other_range, $sym188$POINT_INFO );
        if( NIL != point_info && NIL != other_point )
        {
          Dynamic.sublisp_throw( $sym246$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, methods.funcall_instance_method_with_1_args( self, $sym247$MERGE_LOOSE, other_range ) );
        }
        else if( NIL != point_info )
        {
          Dynamic.sublisp_throw( $sym246$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, self );
        }
        else if( NIL != other_point )
        {
          Dynamic.sublisp_throw( $sym246$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, other_range );
        }
        else
        {
          Dynamic.sublisp_throw( $sym246$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, methods.funcall_instance_method_with_1_args( self, $sym248$MERGE_STRICT, other_range ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_scalar_range_point_info( self, point_info );
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
      catch_var_for_scalar_range_method = Errors.handleThrowable( ccatch_env_var, $sym246$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_scalar_range_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 23779L)
  public static SubLObject scalar_range_merge_loose_method(final SubLObject self, final SubLObject other_range)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_scalar_range_method = NIL;
    final SubLObject max = get_scalar_range_max( self );
    final SubLObject min = get_scalar_range_min( self );
    final SubLObject unit = get_scalar_range_unit( self );
    try
    {
      thread.throwStack.push( $sym251$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD );
      try
      {
        if( NIL == methods.funcall_instance_method_with_1_args( self, $sym237$CONVERTIBLE_P, other_range ) )
        {
          Dynamic.sublisp_throw( $sym251$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, NIL );
        }
        final SubLObject merged = object.new_class_instance( $sym155$SCALAR_RANGE );
        final SubLObject this_min = methods.funcall_instance_method_with_0_args( self, $sym165$GET_MIN );
        final SubLObject other_min = methods.funcall_instance_method_with_0_args( other_range, $sym165$GET_MIN );
        final SubLObject this_max = methods.funcall_instance_method_with_0_args( self, $sym166$GET_MAX );
        final SubLObject other_max = methods.funcall_instance_method_with_0_args( other_range, $sym166$GET_MAX );
        final SubLObject min_test = inference_kernel.new_cyc_query( ConsesLow.list( $const252$lessThanOrEqualTo, this_min, other_min ), $const120$EverythingPSC, UNPROVIDED );
        final SubLObject max_test = inference_kernel.new_cyc_query( ConsesLow.list( $const252$lessThanOrEqualTo, other_max, this_max ), $const120$EverythingPSC, UNPROVIDED );
        final SubLObject other_unit = methods.funcall_instance_method_with_0_args( other_range, $sym213$GET_UNIT );
        final SubLObject new_min = ( NIL != min_test ) ? min : quantities.convert_to_units( unit, other_unit, methods.funcall_instance_method_with_0_args( other_range, $sym220$GET_MIN_VALUE ), UNPROVIDED );
        final SubLObject new_max = ( NIL != max_test ) ? max : quantities.convert_to_units( unit, other_unit, methods.funcall_instance_method_with_0_args( other_range, $sym227$GET_MAX_VALUE ), UNPROVIDED );
        methods.funcall_instance_method_with_1_args( merged, $sym156$FILL, ConsesLow.list( unit, new_min, new_max ) );
        Dynamic.sublisp_throw( $sym251$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, merged );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_scalar_range_max( self, max );
          set_scalar_range_min( self, min );
          set_scalar_range_unit( self, unit );
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
      catch_var_for_scalar_range_method = Errors.handleThrowable( ccatch_env_var, $sym251$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_scalar_range_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 24602L)
  public static SubLObject scalar_range_merge_strict_method(final SubLObject self, final SubLObject other_range)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_scalar_range_method = NIL;
    final SubLObject max = get_scalar_range_max( self );
    final SubLObject min = get_scalar_range_min( self );
    final SubLObject unit = get_scalar_range_unit( self );
    try
    {
      thread.throwStack.push( $sym255$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD );
      try
      {
        if( NIL == methods.funcall_instance_method_with_1_args( self, $sym237$CONVERTIBLE_P, other_range ) )
        {
          Dynamic.sublisp_throw( $sym255$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, NIL );
        }
        final SubLObject this_min = methods.funcall_instance_method_with_0_args( self, $sym165$GET_MIN );
        final SubLObject other_min = methods.funcall_instance_method_with_0_args( other_range, $sym165$GET_MIN );
        final SubLObject this_max = methods.funcall_instance_method_with_0_args( self, $sym166$GET_MAX );
        final SubLObject other_max = methods.funcall_instance_method_with_0_args( other_range, $sym166$GET_MAX );
        if( NIL != inference_kernel.new_cyc_query( ConsesLow.list( $const169$lessThan, this_max, other_min ), $const120$EverythingPSC, UNPROVIDED ) )
        {
          Errors.warn( $str256$__Inconsistent_ranges___S__S, self, other_range );
          Dynamic.sublisp_throw( $sym255$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, NIL );
        }
        if( NIL != inference_kernel.new_cyc_query( ConsesLow.list( $const169$lessThan, other_max, this_min ), $const120$EverythingPSC, UNPROVIDED ) )
        {
          Errors.warn( $str256$__Inconsistent_ranges___S__S, self, other_range );
          Dynamic.sublisp_throw( $sym255$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, NIL );
        }
        final SubLObject other_unit = methods.funcall_instance_method_with_0_args( other_range, $sym213$GET_UNIT );
        final SubLObject new_max = ( NIL != inference_kernel.new_cyc_query( ConsesLow.list( $const169$lessThan, other_max, this_max ), $const120$EverythingPSC, UNPROVIDED ) ) ? quantities.convert_to_units( unit,
            other_unit, methods.funcall_instance_method_with_0_args( other_range, $sym227$GET_MAX_VALUE ), UNPROVIDED ) : max;
        final SubLObject new_min = ( NIL != inference_kernel.new_cyc_query( ConsesLow.list( $const169$lessThan, other_min, this_min ), $const120$EverythingPSC, UNPROVIDED ) ) ? min
            : quantities.convert_to_units( unit, other_unit, methods.funcall_instance_method_with_0_args( other_range, $sym220$GET_MIN_VALUE ), UNPROVIDED );
        final SubLObject merged = object.new_class_instance( $sym155$SCALAR_RANGE );
        methods.funcall_instance_method_with_1_args( merged, $sym156$FILL, ConsesLow.list( unit, new_min, new_max ) );
        Dynamic.sublisp_throw( $sym255$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, merged );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_scalar_range_max( self, max );
          set_scalar_range_min( self, min );
          set_scalar_range_unit( self, unit );
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
      catch_var_for_scalar_range_method = Errors.handleThrowable( ccatch_env_var, $sym255$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_scalar_range_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 25708L)
  public static SubLObject heuristically_cast_unity(final SubLObject predicate, final SubLObject unity_term)
  {
    if( predicate.eql( $const258$age ) )
    {
      return cast_age( unity_term );
    }
    if( predicate.eql( $const259$numberOfInhabitants ) )
    {
      return cast_population( unity_term );
    }
    return unity_term;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 26100L)
  public static SubLObject cast_age(final SubLObject unity_term)
  {
    if( !unity_term.isCons() )
    {
      return unity_term;
    }
    final SubLObject old_unit = unity_term.first();
    final SubLObject old_min = conses_high.second( unity_term );
    final SubLObject old_max = conses_high.third( unity_term );
    if( !$const114$Unity.eql( old_unit ) )
    {
      return unity_term;
    }
    if( NIL != old_max )
    {
      return ConsesLow.list( $const260$YearsDuration, old_min, old_max );
    }
    return ConsesLow.list( $const260$YearsDuration, old_min );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 26450L)
  public static SubLObject cast_population(final SubLObject unity_term)
  {
    if( !unity_term.isCons() )
    {
      return unity_term;
    }
    if( $const114$Unity.eql( unity_term.first() ) )
    {
      return conses_high.second( unity_term );
    }
    final SubLObject quant = conses_high.second( unity_term );
    final SubLObject quant_fn = quant.isCons() ? quant.first() : NIL;
    final SubLObject quant_head = quant.isCons() ? conses_high.second( quant ) : NIL;
    final SubLObject head = conses_high.third( unity_term );
    final SubLObject head_head = head.isCons() ? conses_high.third( head ) : NIL;
    if( !$const261$NumericalQuant_NLAttrFn.eql( quant_fn ) )
    {
      return unity_term;
    }
    if( NIL == term.el_fort_p( head_head ) )
    {
      return unity_term;
    }
    if( NIL == genls.genl_in_any_mtP( head_head, $const262$HomoSapiens ) )
    {
      return unity_term;
    }
    return quant_head;
  }

  public static SubLObject declare_sanity_checker_file()
  {
    SubLFiles.declareFunction( me, "get_sanity_checker", "GET-SANITY-CHECKER", 0, 0, false );
    SubLFiles.declareFunction( me, "get_piquant_sanity_checker", "GET-PIQUANT-SANITY-CHECKER", 1, 0, false );
    SubLFiles.declareFunction( me, "sanity_check", "SANITY-CHECK", 3, 0, false );
    SubLFiles.declareFunction( me, "cyc_sanity_check", "CYC-SANITY-CHECK", 3, 0, false );
    SubLFiles.declareFunction( me, "cyc_sanity_filter", "CYC-SANITY-FILTER", 3, 0, false );
    SubLFiles.declareFunction( me, "get_sanity_checker_show_debug_info", "GET-SANITY-CHECKER-SHOW-DEBUG-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sanity_checker_show_debug_info", "SET-SANITY-CHECKER-SHOW-DEBUG-INFO", 2, 0, false );
    SubLFiles.declareFunction( me, "get_sanity_checker_fudge_factor", "GET-SANITY-CHECKER-FUDGE-FACTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sanity_checker_fudge_factor", "SET-SANITY-CHECKER-FUDGE-FACTOR", 2, 0, false );
    SubLFiles.declareFunction( me, "get_sanity_checker_scratchpad", "GET-SANITY-CHECKER-SCRATCHPAD", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sanity_checker_scratchpad", "SET-SANITY-CHECKER-SCRATCHPAD", 2, 0, false );
    SubLFiles.declareFunction( me, "get_sanity_checker_cache", "GET-SANITY-CHECKER-CACHE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sanity_checker_cache", "SET-SANITY-CHECKER-CACHE", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_sanity_checker_class", "SUBLOOP-RESERVED-INITIALIZE-SANITY-CHECKER-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_sanity_checker_instance", "SUBLOOP-RESERVED-INITIALIZE-SANITY-CHECKER-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "sanity_checker_p", "SANITY-CHECKER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sanity_checker_initialize_method", "SANITY-CHECKER-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sanity_checker_show_debug_info_method", "SANITY-CHECKER-SHOW-DEBUG-INFO-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sanity_checker_hide_debug_info_method", "SANITY-CHECKER-HIDE-DEBUG-INFO-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sanity_checker_check_method", "SANITY-CHECKER-CHECK-METHOD", 4, 0, false );
    SubLFiles.declareFunction( me, "sanity_checker_check_cyc_interpretations_method", "SANITY-CHECKER-CHECK-CYC-INTERPRETATIONS-METHOD", 4, 0, false );
    SubLFiles.declareFunction( me, "sanity_checker_check_listified_method", "SANITY-CHECKER-CHECK-LISTIFIED-METHOD", 4, 0, false );
    SubLFiles.declareFunction( me, "piquant_sanity_check", "PIQUANT-SANITY-CHECK", 4, 1, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_piquant_sanity_checker_class", "SUBLOOP-RESERVED-INITIALIZE-PIQUANT-SANITY-CHECKER-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_piquant_sanity_checker_instance", "SUBLOOP-RESERVED-INITIALIZE-PIQUANT-SANITY-CHECKER-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "piquant_sanity_checker_p", "PIQUANT-SANITY-CHECKER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "piquant_sanity_checker_check_method", "PIQUANT-SANITY-CHECKER-CHECK-METHOD", 4, 0, false );
    SubLFiles.declareFunction( me, "piquant_sanity_checker_check_listified_method", "PIQUANT-SANITY-CHECKER-CHECK-LISTIFIED-METHOD", 4, 0, false );
    SubLFiles.declareFunction( me, "get_sanity_checker_scratchpad_degenerate_diagnosis", "GET-SANITY-CHECKER-SCRATCHPAD-DEGENERATE-DIAGNOSIS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sanity_checker_scratchpad_degenerate_diagnosis", "SET-SANITY-CHECKER-SCRATCHPAD-DEGENERATE-DIAGNOSIS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_sanity_checker_scratchpad_checkers_pool", "GET-SANITY-CHECKER-SCRATCHPAD-CHECKERS-POOL", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sanity_checker_scratchpad_checkers_pool", "SET-SANITY-CHECKER-SCRATCHPAD-CHECKERS-POOL", 2, 0, false );
    SubLFiles.declareFunction( me, "get_sanity_checker_scratchpad_cyc_answers", "GET-SANITY-CHECKER-SCRATCHPAD-CYC-ANSWERS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sanity_checker_scratchpad_cyc_answers", "SET-SANITY-CHECKER-SCRATCHPAD-CYC-ANSWERS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_sanity_checker_scratchpad_answer", "GET-SANITY-CHECKER-SCRATCHPAD-ANSWER", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sanity_checker_scratchpad_answer", "SET-SANITY-CHECKER-SCRATCHPAD-ANSWER", 2, 0, false );
    SubLFiles.declareFunction( me, "get_sanity_checker_scratchpad_cyc_focuses", "GET-SANITY-CHECKER-SCRATCHPAD-CYC-FOCUSES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sanity_checker_scratchpad_cyc_focuses", "SET-SANITY-CHECKER-SCRATCHPAD-CYC-FOCUSES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_sanity_checker_scratchpad_focus", "GET-SANITY-CHECKER-SCRATCHPAD-FOCUS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sanity_checker_scratchpad_focus", "SET-SANITY-CHECKER-SCRATCHPAD-FOCUS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_sanity_checker_scratchpad_predicate", "GET-SANITY-CHECKER-SCRATCHPAD-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sanity_checker_scratchpad_predicate", "SET-SANITY-CHECKER-SCRATCHPAD-PREDICATE", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_sanity_checker_scratchpad_class", "SUBLOOP-RESERVED-INITIALIZE-SANITY-CHECKER-SCRATCHPAD-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_sanity_checker_scratchpad_instance", "SUBLOOP-RESERVED-INITIALIZE-SANITY-CHECKER-SCRATCHPAD-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "sanity_checker_scratchpad_p", "SANITY-CHECKER-SCRATCHPAD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sanity_checker_scratchpad_output_diagnoses_method", "SANITY-CHECKER-SCRATCHPAD-OUTPUT-DIAGNOSES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sanity_checker_scratchpad_initialize_method", "SANITY-CHECKER-SCRATCHPAD-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sanity_checker_scratchpad_set_focus_method", "SANITY-CHECKER-SCRATCHPAD-SET-FOCUS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sanity_checker_scratchpad_set_piquant_focus_method", "SANITY-CHECKER-SCRATCHPAD-SET-PIQUANT-FOCUS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sanity_checker_scratchpad_set_predicate_method", "SANITY-CHECKER-SCRATCHPAD-SET-PREDICATE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sanity_checker_scratchpad_set_piquant_predicate_method", "SANITY-CHECKER-SCRATCHPAD-SET-PIQUANT-PREDICATE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sanity_checker_scratchpad_set_answer_method", "SANITY-CHECKER-SCRATCHPAD-SET-ANSWER-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sanity_checker_scratchpad_set_cyc_answers_method", "SANITY-CHECKER-SCRATCHPAD-SET-CYC-ANSWERS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sanity_checker_scratchpad_compute_cyc_answers_method", "SANITY-CHECKER-SCRATCHPAD-COMPUTE-CYC-ANSWERS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sanity_checker_scratchpad_compute_degenerate_diagnosis_method", "SANITY-CHECKER-SCRATCHPAD-COMPUTE-DEGENERATE-DIAGNOSIS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sanity_checker_scratchpad_initialize_checkers_method", "SANITY-CHECKER-SCRATCHPAD-INITIALIZE-CHECKERS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sanity_checker_scratchpad_diagnose_method", "SANITY-CHECKER-SCRATCHPAD-DIAGNOSE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "set_scalar_checker_backchain_parameter", "SET-SCALAR-CHECKER-BACKCHAIN-PARAMETER", 1, 0, false );
    SubLFiles.declareFunction( me, "get_scalar_checker_arg2range", "GET-SCALAR-CHECKER-ARG2RANGE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_scalar_checker_arg2range", "SET-SCALAR-CHECKER-ARG2RANGE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_scalar_checker_arg2", "GET-SCALAR-CHECKER-ARG2", 1, 0, false );
    SubLFiles.declareFunction( me, "set_scalar_checker_arg2", "SET-SCALAR-CHECKER-ARG2", 2, 0, false );
    SubLFiles.declareFunction( me, "get_scalar_checker_arg1", "GET-SCALAR-CHECKER-ARG1", 1, 0, false );
    SubLFiles.declareFunction( me, "set_scalar_checker_arg1", "SET-SCALAR-CHECKER-ARG1", 2, 0, false );
    SubLFiles.declareFunction( me, "get_scalar_checker_backchain", "GET-SCALAR-CHECKER-BACKCHAIN", 1, 0, false );
    SubLFiles.declareFunction( me, "set_scalar_checker_backchain", "SET-SCALAR-CHECKER-BACKCHAIN", 2, 0, false );
    SubLFiles.declareFunction( me, "get_scalar_checker_diagnosis", "GET-SCALAR-CHECKER-DIAGNOSIS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_scalar_checker_diagnosis", "SET-SCALAR-CHECKER-DIAGNOSIS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_scalar_checker_predicate", "GET-SCALAR-CHECKER-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_scalar_checker_predicate", "SET-SCALAR-CHECKER-PREDICATE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_scalar_checker_fudge_factor", "GET-SCALAR-CHECKER-FUDGE-FACTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "set_scalar_checker_fudge_factor", "SET-SCALAR-CHECKER-FUDGE-FACTOR", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_scalar_checker_class", "SUBLOOP-RESERVED-INITIALIZE-SCALAR-CHECKER-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_scalar_checker_instance", "SUBLOOP-RESERVED-INITIALIZE-SCALAR-CHECKER-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "scalar_checker_p", "SCALAR-CHECKER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "scalar_checker_initialize_method", "SCALAR-CHECKER-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "scalar_checker_compute_range_method", "SCALAR-CHECKER-COMPUTE-RANGE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "typeshift_argument", "TYPESHIFT-ARGUMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "scalar_checker_diagnose_method", "SCALAR-CHECKER-DIAGNOSE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sanity_checker_diagnosis_predicate", "GET-SANITY-CHECKER-DIAGNOSIS-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sanity_checker_diagnosis_predicate", "SET-SANITY-CHECKER-DIAGNOSIS-PREDICATE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_sanity_checker_diagnosis_proposed_arg", "GET-SANITY-CHECKER-DIAGNOSIS-PROPOSED-ARG", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sanity_checker_diagnosis_proposed_arg", "SET-SANITY-CHECKER-DIAGNOSIS-PROPOSED-ARG", 2, 0, false );
    SubLFiles.declareFunction( me, "get_sanity_checker_diagnosis_proposed_value", "GET-SANITY-CHECKER-DIAGNOSIS-PROPOSED-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sanity_checker_diagnosis_proposed_value", "SET-SANITY-CHECKER-DIAGNOSIS-PROPOSED-VALUE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_sanity_checker_diagnosis_justification", "GET-SANITY-CHECKER-DIAGNOSIS-JUSTIFICATION", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sanity_checker_diagnosis_justification", "SET-SANITY-CHECKER-DIAGNOSIS-JUSTIFICATION", 2, 0, false );
    SubLFiles.declareFunction( me, "get_sanity_checker_diagnosis_answer", "GET-SANITY-CHECKER-DIAGNOSIS-ANSWER", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sanity_checker_diagnosis_answer", "SET-SANITY-CHECKER-DIAGNOSIS-ANSWER", 2, 0, false );
    SubLFiles.declareFunction( me, "get_sanity_checker_diagnosis_answer_known", "GET-SANITY-CHECKER-DIAGNOSIS-ANSWER-KNOWN", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sanity_checker_diagnosis_answer_known", "SET-SANITY-CHECKER-DIAGNOSIS-ANSWER-KNOWN", 2, 0, false );
    SubLFiles.declareFunction( me, "get_sanity_checker_diagnosis_complete", "GET-SANITY-CHECKER-DIAGNOSIS-COMPLETE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sanity_checker_diagnosis_complete", "SET-SANITY-CHECKER-DIAGNOSIS-COMPLETE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_sanity_checker_diagnosis_failure_code", "GET-SANITY-CHECKER-DIAGNOSIS-FAILURE-CODE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sanity_checker_diagnosis_failure_code", "SET-SANITY-CHECKER-DIAGNOSIS-FAILURE-CODE", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_sanity_checker_diagnosis_class", "SUBLOOP-RESERVED-INITIALIZE-SANITY-CHECKER-DIAGNOSIS-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_sanity_checker_diagnosis_instance", "SUBLOOP-RESERVED-INITIALIZE-SANITY-CHECKER-DIAGNOSIS-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "sanity_checker_diagnosis_p", "SANITY-CHECKER-DIAGNOSIS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sanity_checker_diagnosis_initialize_method", "SANITY-CHECKER-DIAGNOSIS-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sanity_checker_diagnosis_boolean_method", "SANITY-CHECKER-DIAGNOSIS-BOOLEAN-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "get_scalar_range_point_info", "GET-SCALAR-RANGE-POINT-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "set_scalar_range_point_info", "SET-SCALAR-RANGE-POINT-INFO", 2, 0, false );
    SubLFiles.declareFunction( me, "get_scalar_range_max", "GET-SCALAR-RANGE-MAX", 1, 0, false );
    SubLFiles.declareFunction( me, "set_scalar_range_max", "SET-SCALAR-RANGE-MAX", 2, 0, false );
    SubLFiles.declareFunction( me, "get_scalar_range_min", "GET-SCALAR-RANGE-MIN", 1, 0, false );
    SubLFiles.declareFunction( me, "set_scalar_range_min", "SET-SCALAR-RANGE-MIN", 2, 0, false );
    SubLFiles.declareFunction( me, "get_scalar_range_unit", "GET-SCALAR-RANGE-UNIT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_scalar_range_unit", "SET-SCALAR-RANGE-UNIT", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_scalar_range_class", "SUBLOOP-RESERVED-INITIALIZE-SCALAR-RANGE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_scalar_range_instance", "SUBLOOP-RESERVED-INITIALIZE-SCALAR-RANGE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "scalar_range_p", "SCALAR-RANGE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "scalar_range_print_method", "SCALAR-RANGE-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "scalar_range_initialize_method", "SCALAR-RANGE-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "scalar_range_empty_p_method", "SCALAR-RANGE-EMPTY-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "scalar_range_fill_method", "SCALAR-RANGE-FILL-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "scalar_range_get_unit_method", "SCALAR-RANGE-GET-UNIT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "scalar_range_get_min_method", "SCALAR-RANGE-GET-MIN-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "scalar_range_get_min_value_method", "SCALAR-RANGE-GET-MIN-VALUE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "scalar_range_get_max_method", "SCALAR-RANGE-GET-MAX-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "scalar_range_get_max_value_method", "SCALAR-RANGE-GET-MAX-VALUE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "scalar_range_listify_method", "SCALAR-RANGE-LISTIFY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "scalar_range_fudge_method", "SCALAR-RANGE-FUDGE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "scalar_range_convertible_p_method", "SCALAR-RANGE-CONVERTIBLE-P-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "scalar_range_merge_method", "SCALAR-RANGE-MERGE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "scalar_range_merge_loose_method", "SCALAR-RANGE-MERGE-LOOSE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "scalar_range_merge_strict_method", "SCALAR-RANGE-MERGE-STRICT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "heuristically_cast_unity", "HEURISTICALLY-CAST-UNITY", 2, 0, false );
    SubLFiles.declareFunction( me, "cast_age", "CAST-AGE", 1, 0, false );
    SubLFiles.declareFunction( me, "cast_population", "CAST-POPULATION", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_sanity_checker_file()
  {
    $sanity_checker$ = SubLFiles.defvar( "*SANITY-CHECKER*", NIL );
    $piquant_sanity_checkers$ = SubLFiles.defvar( "*PIQUANT-SANITY-CHECKERS*", Hashtables.make_hash_table( EIGHT_INTEGER, Symbols.symbol_function( EQUALP ), UNPROVIDED ) );
    $scalar_checker_backchain$ = SubLFiles.defvar( "*SCALAR-CHECKER-BACKCHAIN*", ONE_INTEGER );
    return NIL;
  }

  public static SubLObject setup_sanity_checker_file()
  {
    classes.subloop_new_class( $sym0$SANITY_CHECKER, $sym9$OBJECT, NIL, NIL, $list10 );
    classes.class_set_implements_slot_listeners( $sym0$SANITY_CHECKER, NIL );
    classes.subloop_note_class_initialization_function( $sym0$SANITY_CHECKER, $sym14$SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_CLASS );
    classes.subloop_note_instance_initialization_function( $sym0$SANITY_CHECKER, $sym18$SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_INSTANCE );
    subloop_reserved_initialize_sanity_checker_class( $sym0$SANITY_CHECKER );
    methods.methods_incorporate_instance_method( $sym19$INITIALIZE, $sym0$SANITY_CHECKER, $list20, NIL, $list21 );
    methods.subloop_register_instance_method( $sym0$SANITY_CHECKER, $sym19$INITIALIZE, $sym23$SANITY_CHECKER_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym3$SHOW_DEBUG_INFO, $sym0$SANITY_CHECKER, $list20, NIL, $list24 );
    methods.subloop_register_instance_method( $sym0$SANITY_CHECKER, $sym3$SHOW_DEBUG_INFO, $sym26$SANITY_CHECKER_SHOW_DEBUG_INFO_METHOD );
    methods.methods_incorporate_instance_method( $sym27$HIDE_DEBUG_INFO, $sym0$SANITY_CHECKER, $list20, NIL, $list28 );
    methods.subloop_register_instance_method( $sym0$SANITY_CHECKER, $sym27$HIDE_DEBUG_INFO, $sym30$SANITY_CHECKER_HIDE_DEBUG_INFO_METHOD );
    methods.methods_incorporate_instance_method( $sym4$CHECK, $sym0$SANITY_CHECKER, $list31, $list32, $list33 );
    methods.subloop_register_instance_method( $sym0$SANITY_CHECKER, $sym4$CHECK, $sym46$SANITY_CHECKER_CHECK_METHOD );
    methods.methods_incorporate_instance_method( $sym6$CHECK_CYC_INTERPRETATIONS, $sym0$SANITY_CHECKER, $list31, $list47, $list48 );
    methods.subloop_register_instance_method( $sym0$SANITY_CHECKER, $sym6$CHECK_CYC_INTERPRETATIONS, $sym52$SANITY_CHECKER_CHECK_CYC_INTERPRETATIONS_METHOD );
    methods.methods_incorporate_instance_method( $sym53$CHECK_LISTIFIED, $sym0$SANITY_CHECKER, $list31, $list32, $list54 );
    methods.subloop_register_instance_method( $sym0$SANITY_CHECKER, $sym53$CHECK_LISTIFIED, $sym58$SANITY_CHECKER_CHECK_LISTIFIED_METHOD );
    classes.subloop_new_class( $sym2$PIQUANT_SANITY_CHECKER, $sym0$SANITY_CHECKER, NIL, NIL, $list60 );
    classes.class_set_implements_slot_listeners( $sym2$PIQUANT_SANITY_CHECKER, NIL );
    classes.subloop_note_class_initialization_function( $sym2$PIQUANT_SANITY_CHECKER, $sym61$SUBLOOP_RESERVED_INITIALIZE_PIQUANT_SANITY_CHECKER_CLASS );
    classes.subloop_note_instance_initialization_function( $sym2$PIQUANT_SANITY_CHECKER, $sym62$SUBLOOP_RESERVED_INITIALIZE_PIQUANT_SANITY_CHECKER_INSTANCE );
    subloop_reserved_initialize_piquant_sanity_checker_class( $sym2$PIQUANT_SANITY_CHECKER );
    methods.methods_incorporate_instance_method( $sym4$CHECK, $sym2$PIQUANT_SANITY_CHECKER, $list31, $list63, $list64 );
    methods.subloop_register_instance_method( $sym2$PIQUANT_SANITY_CHECKER, $sym4$CHECK, $sym67$PIQUANT_SANITY_CHECKER_CHECK_METHOD );
    methods.methods_incorporate_instance_method( $sym53$CHECK_LISTIFIED, $sym2$PIQUANT_SANITY_CHECKER, $list31, $list63, $list68 );
    methods.subloop_register_instance_method( $sym2$PIQUANT_SANITY_CHECKER, $sym53$CHECK_LISTIFIED, $sym70$PIQUANT_SANITY_CHECKER_CHECK_LISTIFIED_METHOD );
    classes.subloop_new_class( $sym35$SANITY_CHECKER_SCRATCHPAD, $sym9$OBJECT, NIL, NIL, $list71 );
    classes.class_set_implements_slot_listeners( $sym35$SANITY_CHECKER_SCRATCHPAD, NIL );
    classes.subloop_note_class_initialization_function( $sym35$SANITY_CHECKER_SCRATCHPAD, $sym73$SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_SCRATCHPAD_CLASS );
    classes.subloop_note_instance_initialization_function( $sym35$SANITY_CHECKER_SCRATCHPAD, $sym78$SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_SCRATCHPAD_INSTANCE );
    subloop_reserved_initialize_sanity_checker_scratchpad_class( $sym35$SANITY_CHECKER_SCRATCHPAD );
    methods.methods_incorporate_instance_method( $sym43$OUTPUT_DIAGNOSES, $sym35$SANITY_CHECKER_SCRATCHPAD, $list31, NIL, $list79 );
    methods.subloop_register_instance_method( $sym35$SANITY_CHECKER_SCRATCHPAD, $sym43$OUTPUT_DIAGNOSES, $sym82$SANITY_CHECKER_SCRATCHPAD_OUTPUT_DIAGNOSES_METHOD );
    methods.methods_incorporate_instance_method( $sym19$INITIALIZE, $sym35$SANITY_CHECKER_SCRATCHPAD, $list20, NIL, $list83 );
    methods.subloop_register_instance_method( $sym35$SANITY_CHECKER_SCRATCHPAD, $sym19$INITIALIZE, $sym84$SANITY_CHECKER_SCRATCHPAD_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym37$SET_FOCUS, $sym35$SANITY_CHECKER_SCRATCHPAD, $list31, $list85, $list86 );
    methods.subloop_register_instance_method( $sym35$SANITY_CHECKER_SCRATCHPAD, $sym37$SET_FOCUS, $sym88$SANITY_CHECKER_SCRATCHPAD_SET_FOCUS_METHOD );
    methods.methods_incorporate_instance_method( $sym56$SET_PIQUANT_FOCUS, $sym35$SANITY_CHECKER_SCRATCHPAD, $list31, $list89, $list90 );
    methods.subloop_register_instance_method( $sym35$SANITY_CHECKER_SCRATCHPAD, $sym56$SET_PIQUANT_FOCUS, $sym96$SANITY_CHECKER_SCRATCHPAD_SET_PIQUANT_FOCUS_METHOD );
    methods.methods_incorporate_instance_method( $sym36$SET_PREDICATE, $sym35$SANITY_CHECKER_SCRATCHPAD, $list31, $list97, $list98 );
    methods.subloop_register_instance_method( $sym35$SANITY_CHECKER_SCRATCHPAD, $sym36$SET_PREDICATE, $sym102$SANITY_CHECKER_SCRATCHPAD_SET_PREDICATE_METHOD );
    methods.methods_incorporate_instance_method( $sym66$SET_PIQUANT_PREDICATE, $sym35$SANITY_CHECKER_SCRATCHPAD, $list31, $list103, $list104 );
    methods.subloop_register_instance_method( $sym35$SANITY_CHECKER_SCRATCHPAD, $sym66$SET_PIQUANT_PREDICATE, $sym106$SANITY_CHECKER_SCRATCHPAD_SET_PIQUANT_PREDICATE_METHOD );
    methods.methods_incorporate_instance_method( $sym38$SET_ANSWER, $sym35$SANITY_CHECKER_SCRATCHPAD, $list31, $list85, $list107 );
    methods.subloop_register_instance_method( $sym35$SANITY_CHECKER_SCRATCHPAD, $sym38$SET_ANSWER, $sym110$SANITY_CHECKER_SCRATCHPAD_SET_ANSWER_METHOD );
    methods.methods_incorporate_instance_method( $sym51$SET_CYC_ANSWERS, $sym35$SANITY_CHECKER_SCRATCHPAD, $list31, $list111, $list112 );
    methods.subloop_register_instance_method( $sym35$SANITY_CHECKER_SCRATCHPAD, $sym51$SET_CYC_ANSWERS, $sym115$SANITY_CHECKER_SCRATCHPAD_SET_CYC_ANSWERS_METHOD );
    methods.methods_incorporate_instance_method( $sym109$COMPUTE_CYC_ANSWERS, $sym35$SANITY_CHECKER_SCRATCHPAD, $list116, $list85, $list117 );
    methods.subloop_register_instance_method( $sym35$SANITY_CHECKER_SCRATCHPAD, $sym109$COMPUTE_CYC_ANSWERS, $sym121$SANITY_CHECKER_SCRATCHPAD_COMPUTE_CYC_ANSWERS_METHOD );
    methods.methods_incorporate_instance_method( $sym39$COMPUTE_DEGENERATE_DIAGNOSIS, $sym35$SANITY_CHECKER_SCRATCHPAD, $list116, NIL, $list122 );
    methods.subloop_register_instance_method( $sym35$SANITY_CHECKER_SCRATCHPAD, $sym39$COMPUTE_DEGENERATE_DIAGNOSIS, $sym127$SANITY_CHECKER_SCRATCHPAD_COMPUTE_DEGENERATE_DIAGNOSIS_METHOD );
    methods.methods_incorporate_instance_method( $sym41$INITIALIZE_CHECKERS, $sym35$SANITY_CHECKER_SCRATCHPAD, $list31, $list128, $list129 );
    methods.subloop_register_instance_method( $sym35$SANITY_CHECKER_SCRATCHPAD, $sym41$INITIALIZE_CHECKERS, $sym137$SANITY_CHECKER_SCRATCHPAD_INITIALIZE_CHECKERS_METHOD );
    methods.methods_incorporate_instance_method( $sym42$DIAGNOSE, $sym35$SANITY_CHECKER_SCRATCHPAD, $list31, NIL, $list138 );
    methods.subloop_register_instance_method( $sym35$SANITY_CHECKER_SCRATCHPAD, $sym42$DIAGNOSE, $sym141$SANITY_CHECKER_SCRATCHPAD_DIAGNOSE_METHOD );
    classes.subloop_new_class( $sym133$SCALAR_CHECKER, $sym9$OBJECT, NIL, NIL, $list143 );
    classes.class_set_implements_slot_listeners( $sym133$SCALAR_CHECKER, NIL );
    classes.subloop_note_class_initialization_function( $sym133$SCALAR_CHECKER, $sym145$SUBLOOP_RESERVED_INITIALIZE_SCALAR_CHECKER_CLASS );
    classes.subloop_note_instance_initialization_function( $sym133$SCALAR_CHECKER, $sym147$SUBLOOP_RESERVED_INITIALIZE_SCALAR_CHECKER_INSTANCE );
    subloop_reserved_initialize_scalar_checker_class( $sym133$SCALAR_CHECKER );
    methods.methods_incorporate_instance_method( $sym19$INITIALIZE, $sym133$SCALAR_CHECKER, $list20, NIL, $list148 );
    methods.subloop_register_instance_method( $sym133$SCALAR_CHECKER, $sym19$INITIALIZE, $sym150$SCALAR_CHECKER_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym140$COMPUTE_RANGE, $sym133$SCALAR_CHECKER, $list31, NIL, $list151 );
    methods.subloop_register_instance_method( $sym133$SCALAR_CHECKER, $sym140$COMPUTE_RANGE, $sym160$SCALAR_CHECKER_COMPUTE_RANGE_METHOD );
    methods.methods_incorporate_instance_method( $sym42$DIAGNOSE, $sym133$SCALAR_CHECKER, $list31, NIL, $list163 );
    methods.subloop_register_instance_method( $sym133$SCALAR_CHECKER, $sym42$DIAGNOSE, $sym177$SCALAR_CHECKER_DIAGNOSE_METHOD );
    classes.subloop_new_class( $sym124$SANITY_CHECKER_DIAGNOSIS, $sym9$OBJECT, NIL, NIL, $list178 );
    classes.class_set_implements_slot_listeners( $sym124$SANITY_CHECKER_DIAGNOSIS, NIL );
    classes.subloop_note_class_initialization_function( $sym124$SANITY_CHECKER_DIAGNOSIS, $sym179$SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_DIAGNOSIS_CLASS );
    classes.subloop_note_instance_initialization_function( $sym124$SANITY_CHECKER_DIAGNOSIS, $sym180$SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_DIAGNOSIS_INSTANCE );
    subloop_reserved_initialize_sanity_checker_diagnosis_class( $sym124$SANITY_CHECKER_DIAGNOSIS );
    methods.methods_incorporate_instance_method( $sym19$INITIALIZE, $sym124$SANITY_CHECKER_DIAGNOSIS, $list20, NIL, $list181 );
    methods.subloop_register_instance_method( $sym124$SANITY_CHECKER_DIAGNOSIS, $sym19$INITIALIZE, $sym183$SANITY_CHECKER_DIAGNOSIS_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym7$BOOLEAN, $sym124$SANITY_CHECKER_DIAGNOSIS, $list20, NIL, $list184 );
    methods.subloop_register_instance_method( $sym124$SANITY_CHECKER_DIAGNOSIS, $sym7$BOOLEAN, $sym186$SANITY_CHECKER_DIAGNOSIS_BOOLEAN_METHOD );
    classes.subloop_new_class( $sym155$SCALAR_RANGE, $sym9$OBJECT, NIL, NIL, $list187 );
    classes.class_set_implements_slot_listeners( $sym155$SCALAR_RANGE, NIL );
    classes.subloop_note_class_initialization_function( $sym155$SCALAR_RANGE, $sym192$SUBLOOP_RESERVED_INITIALIZE_SCALAR_RANGE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym155$SCALAR_RANGE, $sym193$SUBLOOP_RESERVED_INITIALIZE_SCALAR_RANGE_INSTANCE );
    subloop_reserved_initialize_scalar_range_class( $sym155$SCALAR_RANGE );
    methods.methods_incorporate_instance_method( $sym194$PRINT, $sym155$SCALAR_RANGE, $list20, $list195, $list196 );
    methods.subloop_register_instance_method( $sym155$SCALAR_RANGE, $sym194$PRINT, $sym198$SCALAR_RANGE_PRINT_METHOD );
    methods.methods_incorporate_instance_method( $sym19$INITIALIZE, $sym155$SCALAR_RANGE, $list20, NIL, $list199 );
    methods.subloop_register_instance_method( $sym155$SCALAR_RANGE, $sym19$INITIALIZE, $sym201$SCALAR_RANGE_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym157$EMPTY_P, $sym155$SCALAR_RANGE, $list31, NIL, $list202 );
    methods.subloop_register_instance_method( $sym155$SCALAR_RANGE, $sym157$EMPTY_P, $sym204$SCALAR_RANGE_EMPTY_P_METHOD );
    methods.methods_incorporate_instance_method( $sym156$FILL, $sym155$SCALAR_RANGE, $list31, $list205, $list206 );
    methods.subloop_register_instance_method( $sym155$SCALAR_RANGE, $sym156$FILL, $sym212$SCALAR_RANGE_FILL_METHOD );
    methods.methods_incorporate_instance_method( $sym213$GET_UNIT, $sym155$SCALAR_RANGE, $list31, NIL, $list214 );
    methods.subloop_register_instance_method( $sym155$SCALAR_RANGE, $sym213$GET_UNIT, $sym216$SCALAR_RANGE_GET_UNIT_METHOD );
    methods.methods_incorporate_instance_method( $sym165$GET_MIN, $sym155$SCALAR_RANGE, $list31, NIL, $list217 );
    methods.subloop_register_instance_method( $sym155$SCALAR_RANGE, $sym165$GET_MIN, $sym219$SCALAR_RANGE_GET_MIN_METHOD );
    methods.methods_incorporate_instance_method( $sym220$GET_MIN_VALUE, $sym155$SCALAR_RANGE, $list31, NIL, $list221 );
    methods.subloop_register_instance_method( $sym155$SCALAR_RANGE, $sym220$GET_MIN_VALUE, $sym223$SCALAR_RANGE_GET_MIN_VALUE_METHOD );
    methods.methods_incorporate_instance_method( $sym166$GET_MAX, $sym155$SCALAR_RANGE, $list31, NIL, $list224 );
    methods.subloop_register_instance_method( $sym155$SCALAR_RANGE, $sym166$GET_MAX, $sym226$SCALAR_RANGE_GET_MAX_METHOD );
    methods.methods_incorporate_instance_method( $sym227$GET_MAX_VALUE, $sym155$SCALAR_RANGE, $list31, NIL, $list228 );
    methods.subloop_register_instance_method( $sym155$SCALAR_RANGE, $sym227$GET_MAX_VALUE, $sym230$SCALAR_RANGE_GET_MAX_VALUE_METHOD );
    methods.methods_incorporate_instance_method( $sym167$LISTIFY, $sym155$SCALAR_RANGE, $list31, NIL, $list231 );
    methods.subloop_register_instance_method( $sym155$SCALAR_RANGE, $sym167$LISTIFY, $sym233$SCALAR_RANGE_LISTIFY_METHOD );
    methods.methods_incorporate_instance_method( $sym159$FUDGE, $sym155$SCALAR_RANGE, $list31, $list128, $list234 );
    methods.subloop_register_instance_method( $sym155$SCALAR_RANGE, $sym159$FUDGE, $sym236$SCALAR_RANGE_FUDGE_METHOD );
    methods.methods_incorporate_instance_method( $sym237$CONVERTIBLE_P, $sym155$SCALAR_RANGE, $list31, $list238, $list239 );
    methods.subloop_register_instance_method( $sym155$SCALAR_RANGE, $sym237$CONVERTIBLE_P, $sym244$SCALAR_RANGE_CONVERTIBLE_P_METHOD );
    methods.methods_incorporate_instance_method( $sym158$MERGE, $sym155$SCALAR_RANGE, $list31, $list238, $list245 );
    methods.subloop_register_instance_method( $sym155$SCALAR_RANGE, $sym158$MERGE, $sym249$SCALAR_RANGE_MERGE_METHOD );
    methods.methods_incorporate_instance_method( $sym247$MERGE_LOOSE, $sym155$SCALAR_RANGE, $list31, $list238, $list250 );
    methods.subloop_register_instance_method( $sym155$SCALAR_RANGE, $sym247$MERGE_LOOSE, $sym253$SCALAR_RANGE_MERGE_LOOSE_METHOD );
    methods.methods_incorporate_instance_method( $sym248$MERGE_STRICT, $sym155$SCALAR_RANGE, $list31, $list238, $list254 );
    methods.subloop_register_instance_method( $sym155$SCALAR_RANGE, $sym248$MERGE_STRICT, $sym257$SCALAR_RANGE_MERGE_STRICT_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sanity_checker_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sanity_checker_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sanity_checker_file();
  }
  static
  {
    me = new sanity_checker();
    $sanity_checker$ = null;
    $piquant_sanity_checkers$ = null;
    $scalar_checker_backchain$ = null;
    $sym0$SANITY_CHECKER = makeSymbol( "SANITY-CHECKER" );
    $sym1$STRINGP = makeSymbol( "STRINGP" );
    $sym2$PIQUANT_SANITY_CHECKER = makeSymbol( "PIQUANT-SANITY-CHECKER" );
    $sym3$SHOW_DEBUG_INFO = makeSymbol( "SHOW-DEBUG-INFO" );
    $sym4$CHECK = makeSymbol( "CHECK" );
    $sym5$LISTP = makeSymbol( "LISTP" );
    $sym6$CHECK_CYC_INTERPRETATIONS = makeSymbol( "CHECK-CYC-INTERPRETATIONS" );
    $sym7$BOOLEAN = makeSymbol( "BOOLEAN" );
    $sym8$PROPOSED_VALUE = makeSymbol( "PROPOSED-VALUE" );
    $sym9$OBJECT = makeSymbol( "OBJECT" );
    $list10 = ConsesLow.list( ConsesLow.list( makeSymbol( "CACHE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "SCRATCHPAD" ), makeKeyword( "INSTANCE" ), makeKeyword(
        "PROTECTED" ) ), ConsesLow.list( makeSymbol( "FUDGE-FACTOR" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "SHOW-DEBUG-INFO" ), makeKeyword( "INSTANCE" ), makeKeyword(
            "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CHECK" ),
                ConsesLow.list( makeSymbol( "PREDICATE" ), makeSymbol( "FOCUS" ), makeSymbol( "ANSWER" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CHECK-LISTIFIED" ),
                    ConsesLow.list( makeSymbol( "PREDICATE" ), makeSymbol( "FOCUS" ), makeSymbol( "ANSWER" ) ), makeKeyword( "PUBLIC" ) ) );
    $sym11$SCRATCHPAD = makeSymbol( "SCRATCHPAD" );
    $sym12$CACHE = makeSymbol( "CACHE" );
    $sym13$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym14$SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SANITY-CHECKER-CLASS" );
    $sym15$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym16$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym17$FUDGE_FACTOR = makeSymbol( "FUDGE-FACTOR" );
    $sym18$SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SANITY-CHECKER-INSTANCE" );
    $sym19$INITIALIZE = makeSymbol( "INITIALIZE" );
    $list20 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list21 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "FUDGE-FACTOR" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "RET" ),
        makeSymbol( "SELF" ) ) );
    $sym22$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SANITY-CHECKER-METHOD" );
    $sym23$SANITY_CHECKER_INITIALIZE_METHOD = makeSymbol( "SANITY-CHECKER-INITIALIZE-METHOD" );
    $list24 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SHOW-DEBUG-INFO" ), T ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym25$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SANITY-CHECKER-METHOD" );
    $sym26$SANITY_CHECKER_SHOW_DEBUG_INFO_METHOD = makeSymbol( "SANITY-CHECKER-SHOW-DEBUG-INFO-METHOD" );
    $sym27$HIDE_DEBUG_INFO = makeSymbol( "HIDE-DEBUG-INFO" );
    $list28 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SHOW-DEBUG-INFO" ), NIL ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym29$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SANITY-CHECKER-METHOD" );
    $sym30$SANITY_CHECKER_HIDE_DEBUG_INFO_METHOD = makeSymbol( "SANITY-CHECKER-HIDE-DEBUG-INFO-METHOD" );
    $list31 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list32 = ConsesLow.list( makeSymbol( "PREDICATE" ), makeSymbol( "FOCUS" ), makeSymbol( "ANSWER" ) );
    $list33 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
        "SANITY-CHECKER-SCRATCHPAD" ) ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-PREDICATE" ) ), makeSymbol(
            "PREDICATE" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-FOCUS" ) ), makeSymbol( "FOCUS" ) ), ConsesLow
                .list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-ANSWER" ) ), makeSymbol( "ANSWER" ) ), ConsesLow.list( makeSymbol(
                    "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "COMPUTE-DEGENERATE-DIAGNOSIS" ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow
                        .list( makeSymbol( "GET-SLOT" ), makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DEGENERATE-DIAGNOSIS" ) ) ), ConsesLow.list( makeSymbol(
                            "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INITIALIZE-CHECKERS" ) ), makeSymbol( "FUDGE-FACTOR" ) ), ConsesLow.list(
                                makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DIAGNOSE" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow
                                    .list( ConsesLow.list( makeSymbol( "RESULT" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                        "OUTPUT-DIAGNOSES" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "SHOW-DEBUG-INFO" ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ITEM" ),
                                            makeSymbol( "RESULT" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "*STANDARD-OUTPUT*" ), makeString( "~%~S" ), ConsesLow.list( makeSymbol(
                                                "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "ITEM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PLISTIFY" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                                                    makeSymbol( "RESULT" ) ) ) );
    $sym34$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SANITY-CHECKER-METHOD" );
    $sym35$SANITY_CHECKER_SCRATCHPAD = makeSymbol( "SANITY-CHECKER-SCRATCHPAD" );
    $sym36$SET_PREDICATE = makeSymbol( "SET-PREDICATE" );
    $sym37$SET_FOCUS = makeSymbol( "SET-FOCUS" );
    $sym38$SET_ANSWER = makeSymbol( "SET-ANSWER" );
    $sym39$COMPUTE_DEGENERATE_DIAGNOSIS = makeSymbol( "COMPUTE-DEGENERATE-DIAGNOSIS" );
    $sym40$DEGENERATE_DIAGNOSIS = makeSymbol( "DEGENERATE-DIAGNOSIS" );
    $sym41$INITIALIZE_CHECKERS = makeSymbol( "INITIALIZE-CHECKERS" );
    $sym42$DIAGNOSE = makeSymbol( "DIAGNOSE" );
    $sym43$OUTPUT_DIAGNOSES = makeSymbol( "OUTPUT-DIAGNOSES" );
    $str44$___S = makeString( "~%~S" );
    $sym45$PLISTIFY = makeSymbol( "PLISTIFY" );
    $sym46$SANITY_CHECKER_CHECK_METHOD = makeSymbol( "SANITY-CHECKER-CHECK-METHOD" );
    $list47 = ConsesLow.list( makeSymbol( "PREDICATE" ), makeSymbol( "CYC-INTERPRETATIONS" ), makeSymbol( "CYC-ANSWERS" ) );
    $list48 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
        "SANITY-CHECKER-SCRATCHPAD" ) ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-PREDICATE" ) ), makeSymbol(
            "PREDICATE" ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYC-FOCUSES" ) ), makeSymbol( "CYC-INTERPRETATIONS" ) ), ConsesLow
                .list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-CYC-ANSWERS" ) ), makeSymbol( "CYC-ANSWERS" ) ), ConsesLow.list(
                    makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "COMPUTE-DEGENERATE-DIAGNOSIS" ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ),
                        ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DEGENERATE-DIAGNOSIS" ) ) ), ConsesLow.list( makeSymbol(
                            "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INITIALIZE-CHECKERS" ) ), makeSymbol( "FUDGE-FACTOR" ) ), ConsesLow.list(
                                makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DIAGNOSE" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow
                                    .list( ConsesLow.list( makeSymbol( "RESULT" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                        "OUTPUT-DIAGNOSES" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "SHOW-DEBUG-INFO" ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ITEM" ),
                                            makeSymbol( "RESULT" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "*STANDARD-OUTPUT*" ), makeString( "~%~S" ), ConsesLow.list( makeSymbol(
                                                "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "ITEM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PLISTIFY" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                                                    makeSymbol( "RESULT" ) ) ) );
    $sym49$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SANITY-CHECKER-METHOD" );
    $sym50$CYC_FOCUSES = makeSymbol( "CYC-FOCUSES" );
    $sym51$SET_CYC_ANSWERS = makeSymbol( "SET-CYC-ANSWERS" );
    $sym52$SANITY_CHECKER_CHECK_CYC_INTERPRETATIONS_METHOD = makeSymbol( "SANITY-CHECKER-CHECK-CYC-INTERPRETATIONS-METHOD" );
    $sym53$CHECK_LISTIFIED = makeSymbol( "CHECK-LISTIFIED" );
    $list54 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
        "SANITY-CHECKER-SCRATCHPAD" ) ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-PREDICATE" ) ), makeSymbol(
            "PREDICATE" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-PIQUANT-FOCUS" ) ), makeSymbol( "FOCUS" ) ),
        ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-PIQUANT-ANSWER" ) ), makeSymbol( "ANSWER" ) ), ConsesLow.list(
            makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "COMPUTE-DEGENERATE-DIAGNOSIS" ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow
                .list( makeSymbol( "GET-SLOT" ), makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DEGENERATE-DIAGNOSIS" ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ),
                    makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INITIALIZE-CHECKERS" ) ), makeSymbol( "FUDGE-FACTOR" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ),
                        makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DIAGNOSE" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "RESULT" ),
                            ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "OUTPUT-DIAGNOSES" ) ) ) ), makeSymbol(
                                "LISTIFIED-RESULT" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ITEM" ), makeSymbol( "RESULT" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list(
                                    makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "ITEM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PLISTIFY" ) ) ), makeSymbol( "LISTIFIED-RESULT" ) ) ), ConsesLow
                                        .list( makeSymbol( "PWHEN" ), makeSymbol( "SHOW-DEBUG-INFO" ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ITEM" ), makeSymbol( "LISTIFIED-RESULT" ) ),
                                            ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "*STANDARD-OUTPUT*" ), makeString( "~%~S" ), makeSymbol( "ITEM" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                                                "LISTIFIED-RESULT" ) ) ) );
    $sym55$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SANITY-CHECKER-METHOD" );
    $sym56$SET_PIQUANT_FOCUS = makeSymbol( "SET-PIQUANT-FOCUS" );
    $sym57$SET_PIQUANT_ANSWER = makeSymbol( "SET-PIQUANT-ANSWER" );
    $sym58$SANITY_CHECKER_CHECK_LISTIFIED_METHOD = makeSymbol( "SANITY-CHECKER-CHECK-LISTIFIED-METHOD" );
    $sym59$NUMBERP = makeSymbol( "NUMBERP" );
    $list60 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CHECK" ), ConsesLow.list( makeSymbol( "PIQUANT-PREDICATE" ), makeSymbol( "PIQUANT-FOCUS" ), makeSymbol(
        "PIQUANT-ANSWER" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CHECK-LISTIFIED" ), ConsesLow.list( makeSymbol( "PREDICATE" ), makeSymbol( "FOCUS" ), makeSymbol(
            "ANSWER" ) ), makeKeyword( "PUBLIC" ) ) );
    $sym61$SUBLOOP_RESERVED_INITIALIZE_PIQUANT_SANITY_CHECKER_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-PIQUANT-SANITY-CHECKER-CLASS" );
    $sym62$SUBLOOP_RESERVED_INITIALIZE_PIQUANT_SANITY_CHECKER_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-PIQUANT-SANITY-CHECKER-INSTANCE" );
    $list63 = ConsesLow.list( makeSymbol( "PIQUANT-PREDICATE" ), makeSymbol( "PIQUANT-FOCUS" ), makeSymbol( "PIQUANT-ANSWER" ) );
    $list64 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
        "SANITY-CHECKER-SCRATCHPAD" ) ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-PIQUANT-PREDICATE" ) ),
            makeSymbol( "PIQUANT-PREDICATE" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-PIQUANT-FOCUS" ) ),
                makeSymbol( "PIQUANT-FOCUS" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-ANSWER" ) ), makeSymbol(
                    "PIQUANT-ANSWER" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "COMPUTE-DEGENERATE-DIAGNOSIS" ) ) ),
        ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DEGENERATE-DIAGNOSIS" ) ) ), ConsesLow.list(
            makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INITIALIZE-CHECKERS" ) ), makeSymbol( "FUDGE-FACTOR" ) ), ConsesLow.list( makeSymbol(
                "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DIAGNOSE" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list(
                    makeSymbol( "RESULT" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "OUTPUT-DIAGNOSES" ) ) ) ) ), ConsesLow
                        .list( makeSymbol( "PWHEN" ), makeSymbol( "SHOW-DEBUG-INFO" ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ITEM" ), makeSymbol( "RESULT" ) ), ConsesLow.list( makeSymbol(
                            "FORMAT" ), makeSymbol( "*STANDARD-OUTPUT*" ), makeString( "~%~S" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "ITEM" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                makeSymbol( "PLISTIFY" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "RESULT" ) ) ) );
    $sym65$OUTER_CATCH_FOR_PIQUANT_SANITY_CHECKER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PIQUANT-SANITY-CHECKER-METHOD" );
    $sym66$SET_PIQUANT_PREDICATE = makeSymbol( "SET-PIQUANT-PREDICATE" );
    $sym67$PIQUANT_SANITY_CHECKER_CHECK_METHOD = makeSymbol( "PIQUANT-SANITY-CHECKER-CHECK-METHOD" );
    $list68 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
        "SANITY-CHECKER-SCRATCHPAD" ) ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-PIQUANT-PREDICATE" ) ),
            makeSymbol( "PIQUANT-PREDICATE" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-PIQUANT-FOCUS" ) ),
                makeSymbol( "PIQUANT-FOCUS" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-ANSWER" ) ), makeSymbol(
                    "PIQUANT-ANSWER" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "COMPUTE-DEGENERATE-DIAGNOSIS" ) ) ),
        ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DEGENERATE-DIAGNOSIS" ) ) ), ConsesLow.list(
            makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INITIALIZE-CHECKERS" ) ), makeSymbol( "FUDGE-FACTOR" ) ), ConsesLow.list( makeSymbol(
                "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DIAGNOSE" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list(
                    makeSymbol( "RESULT" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SCRATCHPAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "OUTPUT-DIAGNOSES" ) ) ) ), makeSymbol(
                        "LISTIFIED-RESULT" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ITEM" ), makeSymbol( "RESULT" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol(
                            "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "ITEM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PLISTIFY" ) ) ), makeSymbol( "LISTIFIED-RESULT" ) ) ), ConsesLow.list( makeSymbol(
                                "PWHEN" ), makeSymbol( "SHOW-DEBUG-INFO" ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ITEM" ), makeSymbol( "LISTIFIED-RESULT" ) ), ConsesLow.list( makeSymbol(
                                    "FORMAT" ), makeSymbol( "*STANDARD-OUTPUT*" ), makeString( "~%~S" ), makeSymbol( "ITEM" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "LISTIFIED-RESULT" ) ) ) );
    $sym69$OUTER_CATCH_FOR_PIQUANT_SANITY_CHECKER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PIQUANT-SANITY-CHECKER-METHOD" );
    $sym70$PIQUANT_SANITY_CHECKER_CHECK_LISTIFIED_METHOD = makeSymbol( "PIQUANT-SANITY-CHECKER-CHECK-LISTIFIED-METHOD" );
    $list71 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "PREDICATE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "FOCUS" ), makeKeyword( "INSTANCE" ),
        makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "CYC-FOCUSES" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "ANSWER" ), makeKeyword( "INSTANCE" ), makeKeyword(
            "PUBLIC" ) ), ConsesLow.list( makeSymbol( "CYC-ANSWERS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "CHECKERS-POOL" ), makeKeyword( "INSTANCE" ), makeKeyword(
                "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEGENERATE-DIAGNOSIS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol(
                    "INITIALIZE-CHECKERS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                        "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-FOCUS" ), ConsesLow.list( makeSymbol( "STRING" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                            "SET-PIQUANT-FOCUS" ), ConsesLow.list( makeSymbol( "STRING" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-PREDICATE" ), ConsesLow.list(
                                makeSymbol( "STRING" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-PIQUANT-PREDICATE" ), ConsesLow.list( makeSymbol( "STRING" ) ),
                                    makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-ANSWER" ), ConsesLow.list( makeSymbol( "STRING" ) ), makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "COMPUTE-DEGENERATE-DIAGNOSIS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DIAGNOSE" ), NIL,
          makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "OUTPUT-DIAGNOSES" ), NIL, makeKeyword( "PUBLIC" ) )
    } );
    $sym72$CHECKERS_POOL = makeSymbol( "CHECKERS-POOL" );
    $sym73$SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_SCRATCHPAD_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SANITY-CHECKER-SCRATCHPAD-CLASS" );
    $sym74$PREDICATE = makeSymbol( "PREDICATE" );
    $sym75$FOCUS = makeSymbol( "FOCUS" );
    $sym76$ANSWER = makeSymbol( "ANSWER" );
    $sym77$CYC_ANSWERS = makeSymbol( "CYC-ANSWERS" );
    $sym78$SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_SCRATCHPAD_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SANITY-CHECKER-SCRATCHPAD-INSTANCE" );
    $list79 = ConsesLow.list( ConsesLow.list( makeSymbol( "PIF" ), makeSymbol( "DEGENERATE-DIAGNOSIS" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol(
        "DEGENERATE-DIAGNOSIS" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "DIAGNOSES" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CHECKER" ), makeSymbol(
            "CHECKERS-POOL" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "CHECKER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DIAGNOSIS" ) ) ), makeSymbol(
                "DIAGNOSES" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "DIAGNOSES" ) ) ) ) );
    $sym80$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SANITY-CHECKER-SCRATCHPAD-METHOD" );
    $sym81$DIAGNOSIS = makeSymbol( "DIAGNOSIS" );
    $sym82$SANITY_CHECKER_SCRATCHPAD_OUTPUT_DIAGNOSES_METHOD = makeSymbol( "SANITY-CHECKER-SCRATCHPAD-OUTPUT-DIAGNOSES-METHOD" );
    $list83 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym84$SANITY_CHECKER_SCRATCHPAD_INITIALIZE_METHOD = makeSymbol( "SANITY-CHECKER-SCRATCHPAD-INITIALIZE-METHOD" );
    $list85 = ConsesLow.list( makeSymbol( "STRING" ) );
    $list86 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "STRING" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "FOCUS" ), makeSymbol( "STRING" ) ),
        ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "DENOT" ), ConsesLow.list( makeSymbol( "PS-GET-CYCLS-FOR-NP" ), makeSymbol( "STRING" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow
            .list( ConsesLow.list( makeSymbol( "REFORMULATED" ), ConsesLow.list( makeSymbol( "REFORMULATE-CYCL" ), makeSymbol( "DENOT" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "REFORMULATED" ),
                ConsesLow.list( makeSymbol( "CPUSHNEW" ), makeSymbol( "REFORMULATED" ), makeSymbol( "CYC-FOCUSES" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQUAL ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                    makeSymbol( "SELF" ) ) );
    $sym87$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SANITY-CHECKER-SCRATCHPAD-METHOD" );
    $sym88$SANITY_CHECKER_SCRATCHPAD_SET_FOCUS_METHOD = makeSymbol( "SANITY-CHECKER-SCRATCHPAD-SET-FOCUS-METHOD" );
    $list89 = ConsesLow.list( makeSymbol( "FOCUS-STRING" ) );
    $list90 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "FOCUS-STRING" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
        "DENOTATIONS" ), ConsesLow.list( makeSymbol( "FWHEN" ), ConsesLow.list( makeSymbol( "STARTS-WITH" ), makeSymbol( "FOCUS-STRING" ), makeString( "#$" ) ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list(
            makeSymbol( "FIND-CONSTANT" ), ConsesLow.list( makeSymbol( "PRE-REMOVE" ), makeSymbol( "FOCUS-STRING" ), makeString( "#$" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "DENOTATIONS" ),
                ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "FOCUS" ), makeSymbol( "FOCUS-STRING" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CYC-FOCUSES" ), makeSymbol( "DENOTATIONS" ) ), ConsesLow
                    .list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "GURUQA-OBJECT" ), ConsesLow.list( makeSymbol(
                        "FUNCALL-CLASS-METHOD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GURUQA-OBJECT" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GURUQA-PARSE-PRECISE" ) ), makeSymbol(
                            "FOCUS-STRING" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "FOCUS" ), makeSymbol( "GURUQA-OBJECT" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "GURUQA-OBJECT" ),
                                ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CYC-FOCUSES" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "GURUQA-OBJECT" ), ConsesLow.list( makeSymbol(
                                    "QUOTE" ), makeSymbol( "DENOTATIONS" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ) );
    $sym91$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SANITY-CHECKER-SCRATCHPAD-METHOD" );
    $str92$__ = makeString( "#$" );
    $sym93$GURUQA_OBJECT = makeSymbol( "GURUQA-OBJECT" );
    $sym94$GURUQA_PARSE_PRECISE = makeSymbol( "GURUQA-PARSE-PRECISE" );
    $sym95$DENOTATIONS = makeSymbol( "DENOTATIONS" );
    $sym96$SANITY_CHECKER_SCRATCHPAD_SET_PIQUANT_FOCUS_METHOD = makeSymbol( "SANITY-CHECKER-SCRATCHPAD-SET-PIQUANT-FOCUS-METHOD" );
    $list97 = ConsesLow.list( makeSymbol( "CYC-PREDICATE" ) );
    $list98 = ConsesLow.list( ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "ISA-IN-ANY-MT?" ), makeSymbol( "CYC-PREDICATE" ), constant_handles.reader_make_constant_shell( makeString(
        "BinaryPredicate" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PREDICATE" ), makeSymbol( "CYC-PREDICATE" ) ), ConsesLow.list( makeSymbol( "WARN" ), makeString( "~%~S is not a binary predicate." ),
            makeSymbol( "CYC-PREDICATE" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym99$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SANITY-CHECKER-SCRATCHPAD-METHOD" );
    $const100$BinaryPredicate = constant_handles.reader_make_constant_shell( makeString( "BinaryPredicate" ) );
    $str101$___S_is_not_a_binary_predicate_ = makeString( "~%~S is not a binary predicate." );
    $sym102$SANITY_CHECKER_SCRATCHPAD_SET_PREDICATE_METHOD = makeSymbol( "SANITY-CHECKER-SCRATCHPAD-SET-PREDICATE-METHOD" );
    $list103 = ConsesLow.list( makeSymbol( "PIQUANT-PREDICATE" ) );
    $list104 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CYC-PREDICATE" ), ConsesLow.list( makeSymbol( "FIND-CONSTANT" ), makeSymbol( "PIQUANT-PREDICATE" ) ) ) ),
        ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "ISA-IN-ANY-MT?" ), makeSymbol( "CYC-PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "BinaryPredicate" ) ) ), ConsesLow
            .list( makeSymbol( "CSETQ" ), makeSymbol( "PREDICATE" ), makeSymbol( "CYC-PREDICATE" ) ), ConsesLow.list( makeSymbol( "WARN" ), makeString( "~%~S is not a binary predicate." ), makeSymbol(
                "PIQUANT-PREDICATE" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ) );
    $sym105$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SANITY-CHECKER-SCRATCHPAD-METHOD" );
    $sym106$SANITY_CHECKER_SCRATCHPAD_SET_PIQUANT_PREDICATE_METHOD = makeSymbol( "SANITY-CHECKER-SCRATCHPAD-SET-PIQUANT-PREDICATE-METHOD" );
    $list107 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "STRING" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ANSWER" ), makeSymbol( "STRING" ) ),
        ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "COMPUTE-CYC-ANSWERS" ) ), makeSymbol( "STRING" ) ), ConsesLow.list( makeSymbol(
            "RET" ), makeSymbol( "SELF" ) ) );
    $sym108$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SANITY-CHECKER-SCRATCHPAD-METHOD" );
    $sym109$COMPUTE_CYC_ANSWERS = makeSymbol( "COMPUTE-CYC-ANSWERS" );
    $sym110$SANITY_CHECKER_SCRATCHPAD_SET_ANSWER_METHOD = makeSymbol( "SANITY-CHECKER-SCRATCHPAD-SET-ANSWER-METHOD" );
    $list111 = ConsesLow.list( makeSymbol( "CYC-CANDIDATE-ANSWERS" ) );
    $list112 = ConsesLow.list( ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ANSWER" ), makeSymbol( "CYC-CANDIDATE-ANSWERS" ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol(
        "EL-FORT-P" ), makeSymbol( "ANSWER" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "ANSWER" ), makeSymbol( "CYC-ANSWERS" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol(
            "NUMBERP" ), makeSymbol( "ANSWER" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), constant_handles.reader_make_constant_shell( makeString( "Unity" ) ), makeSymbol(
                "ANSWER" ) ), makeSymbol( "CYC-ANSWERS" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym113$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SANITY-CHECKER-SCRATCHPAD-METHOD" );
    $const114$Unity = constant_handles.reader_make_constant_shell( makeString( "Unity" ) );
    $sym115$SANITY_CHECKER_SCRATCHPAD_SET_CYC_ANSWERS_METHOD = makeSymbol( "SANITY-CHECKER-SCRATCHPAD-SET-CYC-ANSWERS-METHOD" );
    $list116 = ConsesLow.list( makeKeyword( "PRIVATE" ) );
    $list117 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ALL-DENOTS" ), ConsesLow.list( makeSymbol( "PS-GET-CYCLS-FOR-NP" ), makeSymbol( "STRING" ) ) ),
        makeSymbol( "GOOD-DENOTS" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "DENOT" ), makeSymbol( "ALL-DENOTS" ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol(
            "EL-FORT-P" ), makeSymbol( "DENOT" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "REFORMULATED" ), ConsesLow.list( makeSymbol( "REFORMULATE-CYCL" ), makeSymbol(
                "DENOT" ) ) ), makeSymbol( "WFT" ) ), ConsesLow.list( makeSymbol( "WITH-ALL-MTS" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "WFT" ), ConsesLow.list( makeSymbol( "EL-WFT?" ), makeSymbol(
                    "DENOT" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "WFT" ), ConsesLow.list( makeSymbol( "CPUSHNEW" ), makeSymbol( "REFORMULATED" ), makeSymbol( "GOOD-DENOTS" ), ConsesLow.list(
                        makeSymbol( "FUNCTION" ), EQUAL ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "NUMBERP" ), makeSymbol( "DENOT" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow
                            .list( makeSymbol( "BQ-LIST" ), constant_handles.reader_make_constant_shell( makeString( "Unity" ) ), makeSymbol( "DENOT" ) ), makeSymbol( "GOOD-DENOTS" ) ) ) ) ), ConsesLow.list( makeSymbol(
                                "CSETQ" ), makeSymbol( "CYC-ANSWERS" ), makeSymbol( "GOOD-DENOTS" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ) );
    $sym118$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SANITY-CHECKER-SCRATCHPAD-METHOD" );
    $sym119$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const120$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $sym121$SANITY_CHECKER_SCRATCHPAD_COMPUTE_CYC_ANSWERS_METHOD = makeSymbol( "SANITY-CHECKER-SCRATCHPAD-COMPUTE-CYC-ANSWERS-METHOD" );
    $list122 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "DIAGNOSIS" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ),
        makeSymbol( "SANITY-CHECKER-DIAGNOSIS" ) ) ) ), ConsesLow.list( makeSymbol( "BASIS" ), ZERO_INTEGER ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "PREDICATE" ) ),
            ConsesLow.list( makeSymbol( "CINC" ), makeSymbol( "BASIS" ), makeInteger( 100 ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "CYC-FOCUSES" ) ), ConsesLow.list(
                makeSymbol( "CINC" ), makeSymbol( "BASIS" ), TEN_INTEGER ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "CYC-ANSWERS" ) ), ConsesLow.list( makeSymbol(
                    "CINC" ), makeSymbol( "BASIS" ), ONE_INTEGER ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( ">" ), makeSymbol( "BASIS" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol(
                        "SET-SLOT" ), makeSymbol( "DIAGNOSIS" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FAILURE-CODE" ) ), makeSymbol( "BASIS" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                            "DEGENERATE-DIAGNOSIS" ), makeSymbol( "DIAGNOSIS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ) );
    $sym123$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SANITY-CHECKER-SCRATCHPAD-METHOD" );
    $sym124$SANITY_CHECKER_DIAGNOSIS = makeSymbol( "SANITY-CHECKER-DIAGNOSIS" );
    $int125$100 = makeInteger( 100 );
    $sym126$FAILURE_CODE = makeSymbol( "FAILURE-CODE" );
    $sym127$SANITY_CHECKER_SCRATCHPAD_COMPUTE_DEGENERATE_DIAGNOSIS_METHOD = makeSymbol( "SANITY-CHECKER-SCRATCHPAD-COMPUTE-DEGENERATE-DIAGNOSIS-METHOD" );
    $list128 = ConsesLow.list( makeSymbol( "FUDGE-FACTOR" ) );
    $list129 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PRED-ARG1-SET" ), ConsesLow.list( makeSymbol( "PRED-VALUES-IN-ANY-MT" ), makeSymbol( "PREDICATE" ),
        constant_handles.reader_make_constant_shell( makeString( "arg1Isa" ) ), ONE_INTEGER, TWO_INTEGER ) ), ConsesLow.list( makeSymbol( "PRED-ARG2-SET" ), ConsesLow.list( makeSymbol( "PRED-VALUES-IN-ANY-MT" ),
            makeSymbol( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "arg2Isa" ) ), ONE_INTEGER, TWO_INTEGER ) ), makeSymbol( "GOOD-ARG1S" ), makeSymbol( "GOOD-ARG2S" ) ), ConsesLow.list(
                makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ARG" ), makeSymbol( "CYC-FOCUSES" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "FAIL" ) ), ConsesLow.list( makeSymbol(
                    "CSOME" ), ConsesLow.list( makeSymbol( "ARG1" ), makeSymbol( "PRED-ARG1-SET" ), makeSymbol( "FAIL" ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list(
                        makeSymbol( "ISA-IN-ANY-MT?" ), makeSymbol( "ARG" ), makeSymbol( "ARG1" ) ), ConsesLow.list( makeSymbol( "GENL-IN-ANY-MT?" ), makeSymbol( "ARG" ), makeSymbol( "ARG1" ) ) ), ConsesLow.list(
                            makeSymbol( "CSETQ" ), makeSymbol( "FAIL" ), T ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "FAIL" ), ConsesLow.list( makeSymbol( "CPUSHNEW" ), makeSymbol( "ARG" ), makeSymbol(
                                "GOOD-ARG1S" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQUAL ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ARG" ), makeSymbol( "CYC-ANSWERS" ) ),
                                    ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "FAIL" ), makeSymbol( "CAST" ) ), ConsesLow.list( makeSymbol( "CSOME" ), ConsesLow.list( makeSymbol( "ARG2" ),
                                        makeSymbol( "PRED-ARG2-SET" ), makeSymbol( "FAIL" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CAST" ), ConsesLow.list( makeSymbol( "HEURISTICALLY-CAST-UNITY" ),
                                            makeSymbol( "PREDICATE" ), makeSymbol( "ARG" ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "EL-FORT-P" ), makeSymbol( "CAST" ) ), ConsesLow.list(
                                                makeSymbol( "CSETQ" ), makeSymbol( "FAIL" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "ISA-IN-ANY-MT?" ),
                                                    makeSymbol( "CAST" ), makeSymbol( "ARG2" ) ), ConsesLow.list( makeSymbol( "GENL-IN-ANY-MT?" ), makeSymbol( "ARG" ), makeSymbol( "ARG2" ) ) ) ) ), ConsesLow.list(
                                                        makeSymbol( "CSETQ" ), makeSymbol( "FAIL" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "NUMBERP" ),
                                                            makeSymbol( "CAST" ) ), ConsesLow.list( makeSymbol( "PLUSP" ), makeSymbol( "CAST" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "FAIL" ),
                                                                ConsesLow.list( makeSymbol( "CPUSHNEW" ), makeSymbol( "CAST" ), makeSymbol( "GOOD-ARG2S" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQUAL ) ) ) ) ),
        ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "GOOD-ARG1" ), makeSymbol( "GOOD-ARG1S" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "GOOD-ARG2" ), makeSymbol(
            "GOOD-ARG2S" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CHECKER" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                makeSymbol( "SCALAR-CHECKER" ) ) ) ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "CHECKER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FUDGE-FACTOR" ) ), makeSymbol(
                    "FUDGE-FACTOR" ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "CHECKER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PREDICATE" ) ), makeSymbol( "PREDICATE" ) ), ConsesLow.list(
                        makeSymbol( "SET-SLOT" ), makeSymbol( "CHECKER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ARG1" ) ), makeSymbol( "GOOD-ARG1" ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol(
                            "CHECKER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ARG2" ) ), makeSymbol( "GOOD-ARG2" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "CHECKER" ), makeSymbol(
                                "CHECKERS-POOL" ) ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "CHECKERS-POOL" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                                    "DIAGNOSIS" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SANITY-CHECKER-DIAGNOSIS" ) ) ) ) ), ConsesLow.list( makeSymbol(
                                        "SET-SLOT" ), makeSymbol( "DIAGNOSIS" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FAILURE-CODE" ) ), makeInteger( 1000 ) ), ConsesLow.list( makeSymbol( "CSETQ" ),
                                            makeSymbol( "DEGENERATE-DIAGNOSIS" ), makeSymbol( "DIAGNOSIS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ) );
    $sym130$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SANITY-CHECKER-SCRATCHPAD-METHOD" );
    $const131$arg1Isa = constant_handles.reader_make_constant_shell( makeString( "arg1Isa" ) );
    $const132$arg2Isa = constant_handles.reader_make_constant_shell( makeString( "arg2Isa" ) );
    $sym133$SCALAR_CHECKER = makeSymbol( "SCALAR-CHECKER" );
    $sym134$ARG1 = makeSymbol( "ARG1" );
    $sym135$ARG2 = makeSymbol( "ARG2" );
    $int136$1000 = makeInteger( 1000 );
    $sym137$SANITY_CHECKER_SCRATCHPAD_INITIALIZE_CHECKERS_METHOD = makeSymbol( "SANITY-CHECKER-SCRATCHPAD-INITIALIZE-CHECKERS-METHOD" );
    $list138 = ConsesLow.list( ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CHECKER" ), makeSymbol( "CHECKERS-POOL" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol(
        "CHECKER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "COMPUTE-RANGE" ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "CHECKER" ), ConsesLow.list( makeSymbol( "QUOTE" ),
            makeSymbol( "DIAGNOSE" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym139$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SANITY-CHECKER-SCRATCHPAD-METHOD" );
    $sym140$COMPUTE_RANGE = makeSymbol( "COMPUTE-RANGE" );
    $sym141$SANITY_CHECKER_SCRATCHPAD_DIAGNOSE_METHOD = makeSymbol( "SANITY-CHECKER-SCRATCHPAD-DIAGNOSE-METHOD" );
    $sym142$INTEGERP = makeSymbol( "INTEGERP" );
    $list143 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "FUDGE-FACTOR" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "PREDICATE" ), makeKeyword( "INSTANCE" ),
        makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DIAGNOSIS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "BACKCHAIN" ), makeKeyword( "INSTANCE" ), makeKeyword(
            "PUBLIC" ) ), ConsesLow.list( makeSymbol( "ARG1" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "ARG2" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow
                .list( makeSymbol( "ARG2RANGE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "COMPUTE-RANGE" ), NIL, makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) )
    } );
    $sym144$ARG2RANGE = makeSymbol( "ARG2RANGE" );
    $sym145$SUBLOOP_RESERVED_INITIALIZE_SCALAR_CHECKER_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SCALAR-CHECKER-CLASS" );
    $sym146$BACKCHAIN = makeSymbol( "BACKCHAIN" );
    $sym147$SUBLOOP_RESERVED_INITIALIZE_SCALAR_CHECKER_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SCALAR-CHECKER-INSTANCE" );
    $list148 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "BACKCHAIN" ), makeSymbol( "*SCALAR-CHECKER-BACKCHAIN*" ) ),
        ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym149$OUTER_CATCH_FOR_SCALAR_CHECKER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SCALAR-CHECKER-METHOD" );
    $sym150$SCALAR_CHECKER_INITIALIZE_METHOD = makeSymbol( "SCALAR-CHECKER-INITIALIZE-METHOD" );
    $list151 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ARG" ), ConsesLow.list( makeSymbol( "TYPESHIFT-ARGUMENT" ), makeSymbol( "ARG1" ) ) ), ConsesLow.list(
        makeSymbol( "QUERY" ), ConsesLow.list( makeSymbol( "BQ-LIST*" ), makeSymbol( "PREDICATE" ), makeSymbol( "ARG" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeSymbol( "?RANGE" ) ) ) ) ), ConsesLow
            .list( makeSymbol( "ANSWERS" ), ConsesLow.list( makeSymbol( "ASK-TEMPLATE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "?RANGE" ) ), makeSymbol( "QUERY" ), constant_handles
                .reader_make_constant_shell( makeString( "EverythingPSC" ) ), makeSymbol( "BACKCHAIN" ) ) ), ConsesLow.list( makeSymbol( "TO-MERGE" ), makeSymbol( "ANSWERS" ) ), makeSymbol( "RANGE" ) ), ConsesLow.list(
                    makeSymbol( "CSOME" ), ConsesLow.list( makeSymbol( "ANSWER" ), makeSymbol( "ANSWERS" ), makeSymbol( "RANGE" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                        "CANDIDATE-RANGE" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SCALAR-RANGE" ) ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ),
                            makeSymbol( "CANDIDATE-RANGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FILL" ) ), makeSymbol( "ANSWER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TO-MERGE" ),
                                ConsesLow.list( makeSymbol( "CDR" ), makeSymbol( "TO-MERGE" ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "CANDIDATE-RANGE" ), ConsesLow
                                    .list( makeSymbol( "QUOTE" ), makeSymbol( "EMPTY-P" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "RANGE" ), makeSymbol( "CANDIDATE-RANGE" ) ) ) ) ), ConsesLow.list(
                                        makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ANSWER" ), makeSymbol( "TO-MERGE" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "RANGE" ), ConsesLow.list(
                                            makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-RANGE" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                                makeSymbol( "SCALAR-RANGE" ) ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "NEW-RANGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FILL" ) ),
                                                    makeSymbol( "ANSWER" ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "NEW-RANGE" ), ConsesLow.list( makeSymbol(
                                                        "QUOTE" ), makeSymbol( "EMPTY-P" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "RANGE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "RANGE" ),
                                                            ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "MERGE" ) ), makeSymbol( "NEW-RANGE" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol(
                                                                "RANGE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "RANGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FUDGE" ) ), makeSymbol(
                                                                    "FUDGE-FACTOR" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ARG2RANGE" ), makeSymbol( "RANGE" ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                                                                        makeSymbol( "SELF" ) ) ) );
    $sym152$OUTER_CATCH_FOR_SCALAR_CHECKER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SCALAR-CHECKER-METHOD" );
    $list153 = ConsesLow.list( makeSymbol( "?RANGE" ) );
    $sym154$_RANGE = makeSymbol( "?RANGE" );
    $sym155$SCALAR_RANGE = makeSymbol( "SCALAR-RANGE" );
    $sym156$FILL = makeSymbol( "FILL" );
    $sym157$EMPTY_P = makeSymbol( "EMPTY-P" );
    $sym158$MERGE = makeSymbol( "MERGE" );
    $sym159$FUDGE = makeSymbol( "FUDGE" );
    $sym160$SCALAR_CHECKER_COMPUTE_RANGE_METHOD = makeSymbol( "SCALAR-CHECKER-COMPUTE-RANGE-METHOD" );
    $const161$Collection = constant_handles.reader_make_constant_shell( makeString( "Collection" ) );
    $const162$SomeFn = constant_handles.reader_make_constant_shell( makeString( "SomeFn" ) );
    $list163 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "DIAGN" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ),
        makeSymbol( "SANITY-CHECKER-DIAGNOSIS" ) ) ) ), ConsesLow.list( makeSymbol( "CAST" ), ConsesLow.list( makeSymbol( "HEURISTICALLY-CAST-UNITY" ), makeSymbol( "PREDICATE" ), makeSymbol( "ARG2" ) ) ), ConsesLow.list(
            makeSymbol( "ARG2MIN" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "ARG2RANGE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "ARG2RANGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                "GET-MIN" ) ) ) ) ), ConsesLow.list( makeSymbol( "ARG2MAX" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "ARG2RANGE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "ARG2RANGE" ), ConsesLow
                    .list( makeSymbol( "QUOTE" ), makeSymbol( "GET-MAX" ) ) ) ) ), ConsesLow.list( makeSymbol( "RANGE" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "ARG2RANGE" ), ConsesLow.list( makeSymbol(
                        "FIM" ), makeSymbol( "ARG2RANGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LISTIFY" ) ) ) ) ), makeSymbol( "CYCL-EXPLANATION" ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ),
                            makeSymbol( "DIAGN" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PREDICATE" ) ), makeSymbol( "PREDICATE" ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "DIAGN" ),
                                ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PROPOSED-ARG" ) ), makeSymbol( "ARG1" ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "DIAGN" ), ConsesLow.list( makeSymbol(
                                    "QUOTE" ), makeSymbol( "PROPOSED-VALUE" ) ), makeSymbol( "ARG2" ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CAND" ), makeSymbol(
                                        "ARG2MIN" ), makeSymbol( "ARG2MAX" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEGATIVE-TEST-MIN" ), ConsesLow.list( makeSymbol(
                                            "BQ-LIST" ), constant_handles.reader_make_constant_shell( makeString( "lessThan" ) ), makeSymbol( "CAST" ), makeSymbol( "ARG2MIN" ) ) ), ConsesLow.list( makeSymbol(
                                                "NEGATIVE-TEST-MAX" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), constant_handles.reader_make_constant_shell( makeString( "greaterThan" ) ), makeSymbol( "CAST" ),
                                                    makeSymbol( "ARG2MAX" ) ) ), ConsesLow.list( makeSymbol( "POSITIVE-TEST" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), constant_handles.reader_make_constant_shell(
                                                        makeString( "quantitySubsumes" ) ), makeSymbol( "RANGE" ), makeSymbol( "CAST" ) ) ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list(
                                                            makeSymbol( "NEW-CYC-QUERY" ), makeSymbol( "NEGATIVE-TEST-MIN" ), constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) ) ), ConsesLow
                                                                .list( makeSymbol( "SET-SLOT" ), makeSymbol( "DIAGN" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "COMPLETE" ) ), ONE_INTEGER ), ConsesLow.list(
                                                                    makeSymbol( "SET-SLOT" ), makeSymbol( "DIAGN" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ANSWER-KNOWN" ) ), ONE_INTEGER ), ConsesLow.list(
                                                                        makeSymbol( "SET-SLOT" ), makeSymbol( "DIAGN" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ANSWER" ) ), ZERO_INTEGER ), ConsesLow.list(
                                                                            makeSymbol( "CSETQ" ), makeSymbol( "CYCL-EXPLANATION" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), constant_handles.reader_make_constant_shell(
                                                                                makeString( "and" ) ), ConsesLow.list( makeSymbol( "BQ-LIST" ), makeSymbol( "PREDICATE" ), makeSymbol( "ARG1" ), makeSymbol( "RANGE" ) ),
                                                                                makeSymbol( "NEGATIVE-TEST-MIN" ) ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-CYC-QUERY" ), makeSymbol( "NEGATIVE-TEST-MAX" ),
                                                                                    constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol(
                                                                                        "DIAGN" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "COMPLETE" ) ), ONE_INTEGER ), ConsesLow.list( makeSymbol(
                                                                                            "SET-SLOT" ), makeSymbol( "DIAGN" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ANSWER-KNOWN" ) ), ONE_INTEGER ),
                                                                                    ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "DIAGN" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ANSWER" ) ),
                                                                                        ZERO_INTEGER ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CYCL-EXPLANATION" ), ConsesLow.list( makeSymbol( "BQ-LIST" ),
                                                                                            constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( makeSymbol( "BQ-LIST" ), makeSymbol(
                                                                                                "PREDICATE" ), makeSymbol( "ARG1" ), makeSymbol( "RANGE" ) ), makeSymbol( "NEGATIVE-TEST-MAX" ) ) ) ), ConsesLow.list(
                                                                                                    ConsesLow.list( makeSymbol( "NEW-CYC-QUERY" ), makeSymbol( "POSITIVE-TEST" ), constant_handles
                                                                                                        .reader_make_constant_shell( makeString( "EverythingPSC" ) ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ),
                                                                                                            makeSymbol( "DIAGN" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "COMPLETE" ) ), ONE_INTEGER ),
                                                                                                    ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "DIAGN" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                                                        "ANSWER-KNOWN" ) ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "DIAGN" ), ConsesLow.list(
                                                                                                            makeSymbol( "QUOTE" ), makeSymbol( "ANSWER" ) ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "CSETQ" ),
                                                                                                                makeSymbol( "CYCL-EXPLANATION" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), constant_handles
                                                                                                                    .reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( makeSymbol( "BQ-LIST" ), makeSymbol(
                                                                                                                        "PREDICATE" ), makeSymbol( "ARG1" ), makeSymbol( "RANGE" ) ), makeSymbol(
                                                                                                                            "POSITIVE-TEST" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "DIAGN" ),
                                                                                                                                ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "JUSTIFICATION" ) ), ConsesLow.list(
                                                                                                                                    makeSymbol( "GENERATE-PHRASE" ), makeSymbol( "CYCL-EXPLANATION" ) ) ) ), ConsesLow.list(
                                                                                                                                        T, ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "DIAGN" ), ConsesLow.list(
                                                                                                                                            makeSymbol( "QUOTE" ), makeSymbol( "COMPLETE" ) ), ONE_INTEGER ), ConsesLow
                                                                                                                                                .list( makeSymbol( "SET-SLOT" ), makeSymbol( "DIAGN" ), ConsesLow.list(
                                                                                                                                                    makeSymbol( "QUOTE" ), makeSymbol( "ANSWER-KNOWN" ) ), ZERO_INTEGER ),
                                                                                                                                        ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "DIAGN" ), ConsesLow.list(
                                                                                                                                            makeSymbol( "QUOTE" ), makeSymbol( "ANSWER" ) ), ZERO_INTEGER ), ConsesLow.list(
                                                                                                                                                makeSymbol( "SET-SLOT" ), makeSymbol( "DIAGN" ), ConsesLow.list( makeSymbol(
                                                                                                                                                    "QUOTE" ), makeSymbol( "JUSTIFICATION" ) ), makeString(
                                                                                                                                                        "No information available" ) ) ) ), ConsesLow.list( makeSymbol(
                                                                                                                                                            "CSETQ" ), makeSymbol( "DIAGNOSIS" ), makeSymbol( "DIAGN" ) ),
        ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ) );
    $sym164$OUTER_CATCH_FOR_SCALAR_CHECKER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SCALAR-CHECKER-METHOD" );
    $sym165$GET_MIN = makeSymbol( "GET-MIN" );
    $sym166$GET_MAX = makeSymbol( "GET-MAX" );
    $sym167$LISTIFY = makeSymbol( "LISTIFY" );
    $sym168$PROPOSED_ARG = makeSymbol( "PROPOSED-ARG" );
    $const169$lessThan = constant_handles.reader_make_constant_shell( makeString( "lessThan" ) );
    $const170$greaterThan = constant_handles.reader_make_constant_shell( makeString( "greaterThan" ) );
    $const171$quantitySubsumes = constant_handles.reader_make_constant_shell( makeString( "quantitySubsumes" ) );
    $sym172$COMPLETE = makeSymbol( "COMPLETE" );
    $sym173$ANSWER_KNOWN = makeSymbol( "ANSWER-KNOWN" );
    $const174$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $sym175$JUSTIFICATION = makeSymbol( "JUSTIFICATION" );
    $str176$No_information_available = makeString( "No information available" );
    $sym177$SCALAR_CHECKER_DIAGNOSE_METHOD = makeSymbol( "SCALAR-CHECKER-DIAGNOSE-METHOD" );
    $list178 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "FAILURE-CODE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ), makeKeyword( "ESSENTIAL" ) ), ConsesLow.list( makeSymbol( "COMPLETE" ),
        makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ), makeKeyword( "ESSENTIAL" ) ), ConsesLow.list( makeSymbol( "ANSWER-KNOWN" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ), makeKeyword( "ESSENTIAL" ) ),
      ConsesLow.list( makeSymbol( "ANSWER" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ), makeKeyword( "ESSENTIAL" ) ), ConsesLow.list( makeSymbol( "JUSTIFICATION" ), makeKeyword( "INSTANCE" ), makeKeyword(
          "PUBLIC" ), makeKeyword( "ESSENTIAL" ) ), ConsesLow.list( makeSymbol( "PROPOSED-VALUE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ), makeKeyword( "ESSENTIAL" ) ), ConsesLow.list( makeSymbol(
              "PROPOSED-ARG" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ), makeKeyword( "ESSENTIAL" ) ), ConsesLow.list( makeSymbol( "PREDICATE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ),
                  makeKeyword( "ESSENTIAL" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                      makeSymbol( "BOOLEAN" ), NIL, makeKeyword( "PROTECTED" ) )
    } );
    $sym179$SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_DIAGNOSIS_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SANITY-CHECKER-DIAGNOSIS-CLASS" );
    $sym180$SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_DIAGNOSIS_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SANITY-CHECKER-DIAGNOSIS-INSTANCE" );
    $list181 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "FAILURE-CODE" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol(
        "RET" ), makeSymbol( "SELF" ) ) );
    $sym182$OUTER_CATCH_FOR_SANITY_CHECKER_DIAGNOSIS_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SANITY-CHECKER-DIAGNOSIS-METHOD" );
    $sym183$SANITY_CHECKER_DIAGNOSIS_INITIALIZE_METHOD = makeSymbol( "SANITY-CHECKER-DIAGNOSIS-INITIALIZE-METHOD" );
    $list184 = ConsesLow.list( makeString( "A yes-or-no answer as to whether the diagnosis is favorable (T) or\n   unfavorable (NIL)." ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "INTEGERP" ),
        makeSymbol( "ANSWER" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( ">" ), makeSymbol( "ANSWER" ), ZERO_INTEGER ) ) );
    $sym185$OUTER_CATCH_FOR_SANITY_CHECKER_DIAGNOSIS_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SANITY-CHECKER-DIAGNOSIS-METHOD" );
    $sym186$SANITY_CHECKER_DIAGNOSIS_BOOLEAN_METHOD = makeSymbol( "SANITY-CHECKER-DIAGNOSIS-BOOLEAN-METHOD" );
    $list187 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "UNIT" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "MIN" ), makeKeyword( "INSTANCE" ), makeKeyword(
        "PRIVATE" ) ), ConsesLow.list( makeSymbol( "MAX" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "POINT-INFO" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FILL" ), ConsesLow.list(
          makeSymbol( "VALUE" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "EMPTY-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
              "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-UNIT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-MIN" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow
                  .list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-MAX" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-MIN-VALUE" ), NIL, makeKeyword(
                      "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-MAX-VALUE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                          "LISTIFY" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "MERGE" ), ConsesLow.list( makeSymbol( "OTHER-RANGE" ) ), makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "MERGE-LOOSE" ), ConsesLow.list( makeSymbol( "OTHER-RANGE" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
          makeSymbol( "MERGE-STRICT" ), ConsesLow.list( makeSymbol( "OTHER-RANGE" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FUDGE" ), ConsesLow.list( makeSymbol(
              "FUDGE-FACTOR" ) ), makeKeyword( "PUBLIC" ) )
    } );
    $sym188$POINT_INFO = makeSymbol( "POINT-INFO" );
    $sym189$MAX = makeSymbol( "MAX" );
    $sym190$MIN = makeSymbol( "MIN" );
    $sym191$UNIT = makeSymbol( "UNIT" );
    $sym192$SUBLOOP_RESERVED_INITIALIZE_SCALAR_RANGE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SCALAR-RANGE-CLASS" );
    $sym193$SUBLOOP_RESERVED_INITIALIZE_SCALAR_RANGE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SCALAR-RANGE-INSTANCE" );
    $sym194$PRINT = makeSymbol( "PRINT" );
    $list195 = ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) );
    $list196 = ConsesLow.list( makeString( "Prints SCALAR-RANGE to STREAM, ignoring depth" ), ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "PRINC" ), ConsesLow.list(
        makeSymbol( "LIST" ), makeSymbol( "UNIT" ), makeSymbol( "MIN" ), makeSymbol( "MAX" ), makeSymbol( "POINT-INFO" ) ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym197$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SCALAR-RANGE-METHOD" );
    $sym198$SCALAR_RANGE_PRINT_METHOD = makeSymbol( "SCALAR-RANGE-PRINT-METHOD" );
    $list199 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "UNIT" ), constant_handles.reader_make_constant_shell( makeString(
        "Unity" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "MIN" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "MAX" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "RET" ),
            makeSymbol( "SELF" ) ) );
    $sym200$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SCALAR-RANGE-METHOD" );
    $sym201$SCALAR_RANGE_INITIALIZE_METHOD = makeSymbol( "SCALAR-RANGE-INITIALIZE-METHOD" );
    $list202 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( EQL, makeSymbol( "UNIT" ), constant_handles.reader_make_constant_shell( makeString( "Unity" ) ) ),
        ConsesLow.list( makeSymbol( "=" ), makeSymbol( "MIN" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "=" ), makeSymbol( "MAX" ), ZERO_INTEGER ) ) ) );
    $sym203$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SCALAR-RANGE-METHOD" );
    $sym204$SCALAR_RANGE_EMPTY_P_METHOD = makeSymbol( "SCALAR-RANGE-EMPTY-P-METHOD" );
    $list205 = ConsesLow.list( makeSymbol( "VALUE" ) );
    $list206 = ConsesLow.list( ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "NEW-CYC-QUERY" ), ConsesLow.list( makeSymbol( "BQ-LIST*" ), constant_handles.reader_make_constant_shell( makeString(
        "isa" ) ), makeSymbol( "VALUE" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NonNegativeScalarInterval" ) ) ) ) ), constant_handles
            .reader_make_constant_shell( makeString( "BaseKB" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                "NUMBERP" ), makeSymbol( "VALUE" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "MIN" ), makeSymbol( "VALUE" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "MAX" ), makeSymbol(
                    "VALUE" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "POINT-INFO" ), T ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "CONSP" ), makeSymbol( "VALUE" ) ), ConsesLow.list( makeSymbol(
                        "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "VALUE-UNIT" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "VALUE" ) ) ), ConsesLow.list( makeSymbol( "VALUE-MIN" ), ConsesLow.list(
                            makeSymbol( "SECOND" ), makeSymbol( "VALUE" ) ) ), ConsesLow.list( makeSymbol( "VALUE-MAX" ), ConsesLow.list( makeSymbol( "THIRD" ), makeSymbol( "VALUE" ) ) ), makeSymbol( "NEW-UNIT" ),
                            makeSymbol( "NEW-MIN" ), makeSymbol( "NEW-MAX" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "ISA?" ), makeSymbol( "VALUE-UNIT" ), constant_handles
                                .reader_make_constant_shell( makeString( "UnitOfMeasure" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NEW-UNIT" ), makeSymbol( "VALUE-UNIT" ) ) ), ConsesLow.list( makeSymbol(
                                    "PWHEN" ), ConsesLow.list( makeSymbol( "NUMBERP" ), makeSymbol( "VALUE-MIN" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NEW-MIN" ), makeSymbol( "VALUE-MIN" ) ) ),
                        ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "NUMBERP" ), makeSymbol( "VALUE-MAX" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NEW-MAX" ), makeSymbol(
                            "VALUE-MAX" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NEW-MAX" ), makeSymbol( "NEW-MIN" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ),
                                makeSymbol( "NEW-UNIT" ), makeSymbol( "NEW-MIN" ), makeSymbol( "NEW-MAX" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "UNIT" ), makeSymbol( "NEW-UNIT" ) ), ConsesLow.list(
                                    makeSymbol( "CSETQ" ), makeSymbol( "MIN" ), makeSymbol( "NEW-MIN" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "MAX" ), makeSymbol( "NEW-MAX" ) ) ), ConsesLow.list(
                                        makeSymbol( "PWHEN" ), ConsesLow.list( EQ, makeSymbol( "NEW-MIN" ), makeSymbol( "NEW-MAX" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "POINT-INFO" ), T ) ) ) ) ),
        ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym207$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SCALAR-RANGE-METHOD" );
    $const208$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $list209 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NonNegativeScalarInterval" ) ) );
    $const210$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $const211$UnitOfMeasure = constant_handles.reader_make_constant_shell( makeString( "UnitOfMeasure" ) );
    $sym212$SCALAR_RANGE_FILL_METHOD = makeSymbol( "SCALAR-RANGE-FILL-METHOD" );
    $sym213$GET_UNIT = makeSymbol( "GET-UNIT" );
    $list214 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "UNIT" ) ) );
    $sym215$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SCALAR-RANGE-METHOD" );
    $sym216$SCALAR_RANGE_GET_UNIT_METHOD = makeSymbol( "SCALAR-RANGE-GET-UNIT-METHOD" );
    $list217 = ConsesLow.list( ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "EMPTY-P" ) ) ), ConsesLow.list(
        makeSymbol( "RET" ), NIL ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "UNIT" ), makeSymbol( "MIN" ) ) ) ) );
    $sym218$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SCALAR-RANGE-METHOD" );
    $sym219$SCALAR_RANGE_GET_MIN_METHOD = makeSymbol( "SCALAR-RANGE-GET-MIN-METHOD" );
    $sym220$GET_MIN_VALUE = makeSymbol( "GET-MIN-VALUE" );
    $list221 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "MIN" ) ) );
    $sym222$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SCALAR-RANGE-METHOD" );
    $sym223$SCALAR_RANGE_GET_MIN_VALUE_METHOD = makeSymbol( "SCALAR-RANGE-GET-MIN-VALUE-METHOD" );
    $list224 = ConsesLow.list( ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "EMPTY-P" ) ) ), ConsesLow.list(
        makeSymbol( "RET" ), NIL ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "UNIT" ), makeSymbol( "MAX" ) ) ) ) );
    $sym225$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SCALAR-RANGE-METHOD" );
    $sym226$SCALAR_RANGE_GET_MAX_METHOD = makeSymbol( "SCALAR-RANGE-GET-MAX-METHOD" );
    $sym227$GET_MAX_VALUE = makeSymbol( "GET-MAX-VALUE" );
    $list228 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "MAX" ) ) );
    $sym229$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SCALAR-RANGE-METHOD" );
    $sym230$SCALAR_RANGE_GET_MAX_VALUE_METHOD = makeSymbol( "SCALAR-RANGE-GET-MAX-VALUE-METHOD" );
    $list231 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "UNIT" ), makeSymbol( "MIN" ), makeSymbol( "MAX" ) ) ) );
    $sym232$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SCALAR-RANGE-METHOD" );
    $sym233$SCALAR_RANGE_LISTIFY_METHOD = makeSymbol( "SCALAR-RANGE-LISTIFY-METHOD" );
    $list234 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "FUDGE-FACTOR" ), makeSymbol( "NUMBERP" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "MIN" ), ConsesLow.list( makeSymbol(
        "-" ), makeSymbol( "MIN" ), ConsesLow.list( makeSymbol( "*" ), makeSymbol( "MIN" ), makeSymbol( "FUDGE-FACTOR" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "MAX" ), ConsesLow.list( makeSymbol(
            "+" ), makeSymbol( "MAX" ), ConsesLow.list( makeSymbol( "*" ), makeSymbol( "MAX" ), makeSymbol( "FUDGE-FACTOR" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym235$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SCALAR-RANGE-METHOD" );
    $sym236$SCALAR_RANGE_FUDGE_METHOD = makeSymbol( "SCALAR-RANGE-FUDGE-METHOD" );
    $sym237$CONVERTIBLE_P = makeSymbol( "CONVERTIBLE-P" );
    $list238 = ConsesLow.list( makeSymbol( "OTHER-RANGE" ) );
    $list239 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "OTHER-RANGE" ), makeSymbol( "SCALAR-RANGE-P" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
        "OTHER-UNIT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "OTHER-RANGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-UNIT" ) ) ) ), ConsesLow.list( makeSymbol( "QUERY" ), ConsesLow.list(
            makeSymbol( "BQ-LIST*" ), constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( makeSymbol( "BQ-LIST*" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ),
                makeSymbol( "UNIT" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeSymbol( "?TYPE" ) ) ) ), ConsesLow.list( makeSymbol( "BQ-LIST*" ), constant_handles.reader_make_constant_shell( makeString(
                    "isa" ) ), makeSymbol( "OTHER-UNIT" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeSymbol( "?TYPE" ) ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( ConsesLow.list(
                        constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?TYPE" ), constant_handles.reader_make_constant_shell( makeString( "InterconvertibleUnitType" ) ) ) ) ) ) ) ),
        ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NEW-CYC-QUERY" ), makeSymbol( "QUERY" ), constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) ) ) ) ) );
    $sym240$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SCALAR-RANGE-METHOD" );
    $sym241$SCALAR_RANGE_P = makeSymbol( "SCALAR-RANGE-P" );
    $list242 = ConsesLow.list( makeSymbol( "?TYPE" ) );
    $list243 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?TYPE" ), constant_handles.reader_make_constant_shell( makeString(
        "InterconvertibleUnitType" ) ) ) );
    $sym244$SCALAR_RANGE_CONVERTIBLE_P_METHOD = makeSymbol( "SCALAR-RANGE-CONVERTIBLE-P-METHOD" );
    $list245 = ConsesLow.list( ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CONVERTIBLE-P" ) ), makeSymbol(
        "OTHER-RANGE" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "OTHER-POINT" ), ConsesLow.list( makeSymbol( "GET-SLOT" ),
            makeSymbol( "OTHER-RANGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "POINT-INFO" ) ) ) ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CAND" ), makeSymbol(
                "POINT-INFO" ), makeSymbol( "OTHER-POINT" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                    "MERGE-LOOSE" ) ), makeSymbol( "OTHER-RANGE" ) ) ) ), ConsesLow.list( makeSymbol( "POINT-INFO" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol(
                        "OTHER-POINT" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "OTHER-RANGE" ) ) ), ConsesLow.list( T, ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                            "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "MERGE-STRICT" ) ), makeSymbol( "OTHER-RANGE" ) ) ) ) ) ) );
    $sym246$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SCALAR-RANGE-METHOD" );
    $sym247$MERGE_LOOSE = makeSymbol( "MERGE-LOOSE" );
    $sym248$MERGE_STRICT = makeSymbol( "MERGE-STRICT" );
    $sym249$SCALAR_RANGE_MERGE_METHOD = makeSymbol( "SCALAR-RANGE-MERGE-METHOD" );
    $list250 = ConsesLow.list( ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CONVERTIBLE-P" ) ), makeSymbol(
        "OTHER-RANGE" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( new SubLObject[]
        { ConsesLow.list( makeSymbol( "MERGED" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SCALAR-RANGE" ) ) ) ), ConsesLow.list( makeSymbol( "THIS-MIN" ),
            ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-MIN" ) ) ) ), ConsesLow.list( makeSymbol( "OTHER-MIN" ), ConsesLow.list( makeSymbol( "FIM" ),
                makeSymbol( "OTHER-RANGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-MIN" ) ) ) ), ConsesLow.list( makeSymbol( "THIS-MAX" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ),
                    ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-MAX" ) ) ) ), ConsesLow.list( makeSymbol( "OTHER-MAX" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "OTHER-RANGE" ), ConsesLow.list(
                        makeSymbol( "QUOTE" ), makeSymbol( "GET-MAX" ) ) ) ), ConsesLow.list( makeSymbol( "MIN-TEST" ), ConsesLow.list( makeSymbol( "NEW-CYC-QUERY" ), ConsesLow.list( makeSymbol( "BQ-LIST" ),
                            constant_handles.reader_make_constant_shell( makeString( "lessThanOrEqualTo" ) ), makeSymbol( "THIS-MIN" ), makeSymbol( "OTHER-MIN" ) ), constant_handles.reader_make_constant_shell(
                                makeString( "EverythingPSC" ) ) ) ), ConsesLow.list( makeSymbol( "MAX-TEST" ), ConsesLow.list( makeSymbol( "NEW-CYC-QUERY" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), constant_handles
                                    .reader_make_constant_shell( makeString( "lessThanOrEqualTo" ) ), makeSymbol( "OTHER-MAX" ), makeSymbol( "THIS-MAX" ) ), constant_handles.reader_make_constant_shell( makeString(
                                        "EverythingPSC" ) ) ) ), ConsesLow.list( makeSymbol( "OTHER-UNIT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "OTHER-RANGE" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                            makeSymbol( "GET-UNIT" ) ) ) ), ConsesLow.list( makeSymbol( "NEW-MIN" ), ConsesLow.list( makeSymbol( "FIF" ), makeSymbol( "MIN-TEST" ), makeSymbol( "MIN" ), ConsesLow.list(
                                                makeSymbol( "CONVERT-TO-UNITS" ), makeSymbol( "UNIT" ), makeSymbol( "OTHER-UNIT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "OTHER-RANGE" ), ConsesLow.list(
                                                    makeSymbol( "QUOTE" ), makeSymbol( "GET-MIN-VALUE" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "NEW-MAX" ), ConsesLow.list( makeSymbol( "FIF" ), makeSymbol( "MAX-TEST" ),
                                                        makeSymbol( "MAX" ), ConsesLow.list( makeSymbol( "CONVERT-TO-UNITS" ), makeSymbol( "UNIT" ), makeSymbol( "OTHER-UNIT" ), ConsesLow.list( makeSymbol( "FIM" ),
                                                            makeSymbol( "OTHER-RANGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-MAX-VALUE" ) ) ) ) ) )
    } ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MERGED" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FILL" ) ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "UNIT" ), makeSymbol( "NEW-MIN" ),
        makeSymbol( "NEW-MAX" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "MERGED" ) ) ) );
    $sym251$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SCALAR-RANGE-METHOD" );
    $const252$lessThanOrEqualTo = constant_handles.reader_make_constant_shell( makeString( "lessThanOrEqualTo" ) );
    $sym253$SCALAR_RANGE_MERGE_LOOSE_METHOD = makeSymbol( "SCALAR-RANGE-MERGE-LOOSE-METHOD" );
    $list254 = ConsesLow.list( ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CONVERTIBLE-P" ) ), makeSymbol(
        "OTHER-RANGE" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "THIS-MIN" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
            "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-MIN" ) ) ) ), ConsesLow.list( makeSymbol( "OTHER-MIN" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "OTHER-RANGE" ), ConsesLow.list(
                makeSymbol( "QUOTE" ), makeSymbol( "GET-MIN" ) ) ) ), ConsesLow.list( makeSymbol( "THIS-MAX" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                    makeSymbol( "GET-MAX" ) ) ) ), ConsesLow.list( makeSymbol( "OTHER-MAX" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "OTHER-RANGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                        "GET-MAX" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "NEW-CYC-QUERY" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), constant_handles.reader_make_constant_shell(
                            makeString( "lessThan" ) ), makeSymbol( "THIS-MAX" ), makeSymbol( "OTHER-MIN" ) ), constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) ) ), ConsesLow.list( makeSymbol(
                                "WARN" ), makeString( "~%Inconsistent ranges: ~S ~S" ), makeSymbol( "SELF" ), makeSymbol( "OTHER-RANGE" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol(
                                    "PWHEN" ), ConsesLow.list( makeSymbol( "NEW-CYC-QUERY" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), constant_handles.reader_make_constant_shell( makeString( "lessThan" ) ), makeSymbol(
                                        "OTHER-MAX" ), makeSymbol( "THIS-MIN" ) ), constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) ) ), ConsesLow.list( makeSymbol( "WARN" ), makeString(
                                            "~%Inconsistent ranges: ~S ~S" ), makeSymbol( "SELF" ), makeSymbol( "OTHER-RANGE" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "CLET" ),
                                                ConsesLow.list( ConsesLow.list( makeSymbol( "OTHER-UNIT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "OTHER-RANGE" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                                    makeSymbol( "GET-UNIT" ) ) ) ), ConsesLow.list( makeSymbol( "NEW-MAX" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "NEW-CYC-QUERY" ), ConsesLow
                                                        .list( makeSymbol( "BQ-LIST" ), constant_handles.reader_make_constant_shell( makeString( "lessThan" ) ), makeSymbol( "OTHER-MAX" ), makeSymbol( "THIS-MAX" ) ),
                                                        constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) ) ), ConsesLow.list( makeSymbol( "CONVERT-TO-UNITS" ), makeSymbol( "UNIT" ), makeSymbol(
                                                            "OTHER-UNIT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "OTHER-RANGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-MAX-VALUE" ) ) ) ),
                                                        makeSymbol( "MAX" ) ) ), ConsesLow.list( makeSymbol( "NEW-MIN" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "NEW-CYC-QUERY" ), ConsesLow
                                                            .list( makeSymbol( "BQ-LIST" ), constant_handles.reader_make_constant_shell( makeString( "lessThan" ) ), makeSymbol( "OTHER-MIN" ), makeSymbol( "THIS-MIN" ) ),
                                                            constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) ) ), makeSymbol( "MIN" ), ConsesLow.list( makeSymbol( "CONVERT-TO-UNITS" ),
                                                                makeSymbol( "UNIT" ), makeSymbol( "OTHER-UNIT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "OTHER-RANGE" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                                                    makeSymbol( "GET-MIN-VALUE" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "MERGED" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list(
                                                                        makeSymbol( "QUOTE" ), makeSymbol( "SCALAR-RANGE" ) ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MERGED" ), ConsesLow.list(
                                                                            makeSymbol( "QUOTE" ), makeSymbol( "FILL" ) ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "UNIT" ), makeSymbol( "NEW-MIN" ), makeSymbol(
                                                                                "NEW-MAX" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "MERGED" ) ) ) ) );
    $sym255$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SCALAR-RANGE-METHOD" );
    $str256$__Inconsistent_ranges___S__S = makeString( "~%Inconsistent ranges: ~S ~S" );
    $sym257$SCALAR_RANGE_MERGE_STRICT_METHOD = makeSymbol( "SCALAR-RANGE-MERGE-STRICT-METHOD" );
    $const258$age = constant_handles.reader_make_constant_shell( makeString( "age" ) );
    $const259$numberOfInhabitants = constant_handles.reader_make_constant_shell( makeString( "numberOfInhabitants" ) );
    $const260$YearsDuration = constant_handles.reader_make_constant_shell( makeString( "YearsDuration" ) );
    $const261$NumericalQuant_NLAttrFn = constant_handles.reader_make_constant_shell( makeString( "NumericalQuant-NLAttrFn" ) );
    $const262$HomoSapiens = constant_handles.reader_make_constant_shell( makeString( "HomoSapiens" ) );
  }
}
/*
 * 
 * Total time: 1400 ms synthetic
 */