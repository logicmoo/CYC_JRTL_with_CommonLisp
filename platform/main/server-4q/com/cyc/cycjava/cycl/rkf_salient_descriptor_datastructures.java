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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_salient_descriptor_datastructures
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures";
  public static final String myFingerPrint = "43a066196bbb16ac0144746d8e253122a677a8f4cd3019b6935b6a5f9b3029ec";
  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1068L)
  public static SubLSymbol $dtp_rkf_salient_descriptor_prompter$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
  public static SubLSymbol $dtp_rkf_salient_descriptor_prompt$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
  public static SubLSymbol $dtp_rkf_sd_rule_info_score$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 13631L)
  public static SubLSymbol $dtp_rkf_sd_example$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 13763L)
  private static SubLSymbol $rkf_sd_example_types$;
  private static final SubLSymbol $sym0$RKF_SALIENT_DESCRIPTOR_PROMPTER;
  private static final SubLSymbol $sym1$RKF_SALIENT_DESCRIPTOR_PROMPTER_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$PRINT_RKF_SD_PROMPTER;
  private static final SubLSymbol $sym7$RKF_SALIENT_DESCRIPTOR_PROMPTER_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$RKF_SD_PROMPTER_SEED_TERM;
  private static final SubLSymbol $sym10$_CSETF_RKF_SD_PROMPTER_SEED_TERM;
  private static final SubLSymbol $sym11$RKF_SD_PROMPTER_MT;
  private static final SubLSymbol $sym12$_CSETF_RKF_SD_PROMPTER_MT;
  private static final SubLSymbol $sym13$RKF_SD_PROMPTER_USED_PROMPTS;
  private static final SubLSymbol $sym14$_CSETF_RKF_SD_PROMPTER_USED_PROMPTS;
  private static final SubLSymbol $sym15$RKF_SD_PROMPTER_UNUSED_PROMPTS;
  private static final SubLSymbol $sym16$_CSETF_RKF_SD_PROMPTER_UNUSED_PROMPTS;
  private static final SubLSymbol $sym17$RKF_SD_PROMPTER_TACTICS;
  private static final SubLSymbol $sym18$_CSETF_RKF_SD_PROMPTER_TACTICS;
  private static final SubLSymbol $sym19$RKF_SD_PROMPTER_ISG;
  private static final SubLSymbol $sym20$_CSETF_RKF_SD_PROMPTER_ISG;
  private static final SubLSymbol $sym21$RKF_SD_PROMPTER_PLIST;
  private static final SubLSymbol $sym22$_CSETF_RKF_SD_PROMPTER_PLIST;
  private static final SubLSymbol $kw23$SEED_TERM;
  private static final SubLSymbol $kw24$MT;
  private static final SubLSymbol $kw25$USED_PROMPTS;
  private static final SubLSymbol $kw26$UNUSED_PROMPTS;
  private static final SubLSymbol $kw27$TACTICS;
  private static final SubLSymbol $kw28$ISG;
  private static final SubLSymbol $kw29$PLIST;
  private static final SubLString $str30$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw31$BEGIN;
  private static final SubLSymbol $sym32$MAKE_RKF_SALIENT_DESCRIPTOR_PROMPTER;
  private static final SubLSymbol $kw33$SLOT;
  private static final SubLSymbol $kw34$END;
  private static final SubLSymbol $sym35$VISIT_DEFSTRUCT_OBJECT_RKF_SALIENT_DESCRIPTOR_PROMPTER_METHOD;
  private static final SubLString $str36$_RKF_SD_PROMPTER__S__S___D_prompt;
  private static final SubLSymbol $kw37$MEMOIZATION_STATE;
  private static final SubLString $str38$Salient_Descriptor_Prompter_Lock;
  private static final SubLSymbol $kw39$LOCK;
  private static final SubLSymbol $kw40$UNKNOWN;
  private static final SubLSymbol $kw41$NOT_FOUND;
  private static final SubLSymbol $sym42$RKF_SALIENT_DESCRIPTOR_PROMPT;
  private static final SubLSymbol $sym43$RKF_SALIENT_DESCRIPTOR_PROMPT_P;
  private static final SubLList $list44;
  private static final SubLList $list45;
  private static final SubLList $list46;
  private static final SubLList $list47;
  private static final SubLSymbol $sym48$PRINT_RKF_SD_PROMPT;
  private static final SubLSymbol $sym49$RKF_SALIENT_DESCRIPTOR_PROMPT_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list50;
  private static final SubLSymbol $sym51$RKF_SD_PROMPT_ID;
  private static final SubLSymbol $sym52$_CSETF_RKF_SD_PROMPT_ID;
  private static final SubLSymbol $sym53$RKF_SD_PROMPT_SUBPROMPTS;
  private static final SubLSymbol $sym54$_CSETF_RKF_SD_PROMPT_SUBPROMPTS;
  private static final SubLSymbol $sym55$RKF_SD_PROMPT_FORMULA;
  private static final SubLSymbol $sym56$_CSETF_RKF_SD_PROMPT_FORMULA;
  private static final SubLSymbol $sym57$RKF_SD_PROMPT_JUSTIFICATION;
  private static final SubLSymbol $sym58$_CSETF_RKF_SD_PROMPT_JUSTIFICATION;
  private static final SubLSymbol $sym59$RKF_SD_PROMPT_DEDUCIBLE_CNFS;
  private static final SubLSymbol $sym60$_CSETF_RKF_SD_PROMPT_DEDUCIBLE_CNFS;
  private static final SubLSymbol $sym61$RKF_SD_PROMPT_EXAMPLES;
  private static final SubLSymbol $sym62$_CSETF_RKF_SD_PROMPT_EXAMPLES;
  private static final SubLSymbol $sym63$RKF_SD_PROMPT_SALIENT_PROPERTY_SENTENCE;
  private static final SubLSymbol $sym64$_CSETF_RKF_SD_PROMPT_SALIENT_PROPERTY_SENTENCE;
  private static final SubLSymbol $sym65$RKF_SD_PROMPT_PROMPTER;
  private static final SubLSymbol $sym66$_CSETF_RKF_SD_PROMPT_PROMPTER;
  private static final SubLSymbol $sym67$RKF_SD_PROMPT_TACTIC;
  private static final SubLSymbol $sym68$_CSETF_RKF_SD_PROMPT_TACTIC;
  private static final SubLSymbol $kw69$ID;
  private static final SubLSymbol $kw70$SUBPROMPTS;
  private static final SubLSymbol $kw71$FORMULA;
  private static final SubLSymbol $kw72$JUSTIFICATION;
  private static final SubLSymbol $kw73$DEDUCIBLE_CNFS;
  private static final SubLSymbol $kw74$EXAMPLES;
  private static final SubLSymbol $kw75$SALIENT_PROPERTY_SENTENCE;
  private static final SubLSymbol $kw76$PROMPTER;
  private static final SubLSymbol $kw77$TACTIC;
  private static final SubLSymbol $sym78$MAKE_RKF_SALIENT_DESCRIPTOR_PROMPT;
  private static final SubLSymbol $sym79$VISIT_DEFSTRUCT_OBJECT_RKF_SALIENT_DESCRIPTOR_PROMPT_METHOD;
  private static final SubLString $str80$_RKF_SD_PROMPT_Subprompts___S_;
  private static final SubLString $str81$Formula___S_;
  private static final SubLString $str82$Deducible_CNFs___S_;
  private static final SubLSymbol $kw83$CHOICE;
  private static final SubLSymbol $kw84$SPECIFY;
  private static final SubLSymbol $kw85$CONFIRM;
  private static final SubLSymbol $sym86$RKF_SD_RULE_INFO_SCORE;
  private static final SubLSymbol $sym87$RKF_SD_RULE_INFO_SCORE_P;
  private static final SubLList $list88;
  private static final SubLList $list89;
  private static final SubLList $list90;
  private static final SubLList $list91;
  private static final SubLSymbol $sym92$PRINT_RKF_SD_RULE_INFO_SCORE;
  private static final SubLSymbol $sym93$RKF_SD_RULE_INFO_SCORE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list94;
  private static final SubLSymbol $sym95$RKF_SD_RULE_INFO_SCORE_SEED_TERM_IN_POS_LITS_;
  private static final SubLSymbol $sym96$_CSETF_RKF_SD_RULE_INFO_SCORE_SEED_TERM_IN_POS_LITS_;
  private static final SubLSymbol $sym97$RKF_SD_RULE_INFO_SCORE_SEED_TERM_IN_NEG_LITS_;
  private static final SubLSymbol $sym98$_CSETF_RKF_SD_RULE_INFO_SCORE_SEED_TERM_IN_NEG_LITS_;
  private static final SubLSymbol $sym99$RKF_SD_RULE_INFO_SCORE_VAR_COUNT;
  private static final SubLSymbol $sym100$_CSETF_RKF_SD_RULE_INFO_SCORE_VAR_COUNT;
  private static final SubLSymbol $sym101$RKF_SD_RULE_INFO_SCORE_NEG_LIT_COUNT;
  private static final SubLSymbol $sym102$_CSETF_RKF_SD_RULE_INFO_SCORE_NEG_LIT_COUNT;
  private static final SubLSymbol $sym103$RKF_SD_RULE_INFO_SCORE_POS_LIT_COUNT;
  private static final SubLSymbol $sym104$_CSETF_RKF_SD_RULE_INFO_SCORE_POS_LIT_COUNT;
  private static final SubLSymbol $sym105$RKF_SD_RULE_INFO_SCORE_POS_LIT_QUALITY_SCORE;
  private static final SubLSymbol $sym106$_CSETF_RKF_SD_RULE_INFO_SCORE_POS_LIT_QUALITY_SCORE;
  private static final SubLSymbol $sym107$RKF_SD_RULE_INFO_SCORE_MT_GENERALITY_SCORE;
  private static final SubLSymbol $sym108$_CSETF_RKF_SD_RULE_INFO_SCORE_MT_GENERALITY_SCORE;
  private static final SubLSymbol $sym109$RKF_SD_RULE_INFO_SCORE_PLIST;
  private static final SubLSymbol $sym110$_CSETF_RKF_SD_RULE_INFO_SCORE_PLIST;
  private static final SubLSymbol $kw111$SEED_TERM_IN_POS_LITS_;
  private static final SubLSymbol $kw112$SEED_TERM_IN_NEG_LITS_;
  private static final SubLSymbol $kw113$VAR_COUNT;
  private static final SubLSymbol $kw114$NEG_LIT_COUNT;
  private static final SubLSymbol $kw115$POS_LIT_COUNT;
  private static final SubLSymbol $kw116$POS_LIT_QUALITY_SCORE;
  private static final SubLSymbol $kw117$MT_GENERALITY_SCORE;
  private static final SubLSymbol $sym118$MAKE_RKF_SD_RULE_INFO_SCORE;
  private static final SubLSymbol $sym119$VISIT_DEFSTRUCT_OBJECT_RKF_SD_RULE_INFO_SCORE_METHOD;
  private static final SubLString $str120$_RKF_SD_SCORE;
  private static final SubLString $str121$_neg__S;
  private static final SubLString $str122$_pos__S;
  private static final SubLString $str123$_vars__S;
  private static final SubLString $str124$_nlc__S;
  private static final SubLString $str125$_plc__S;
  private static final SubLString $str126$_plq__S;
  private static final SubLString $str127$_mtg__S;
  private static final SubLString $str128$_;
  private static final SubLSymbol $sym129$RKF_SD_EXAMPLE;
  private static final SubLSymbol $sym130$RKF_SD_EXAMPLE_P;
  private static final SubLList $list131;
  private static final SubLList $list132;
  private static final SubLList $list133;
  private static final SubLList $list134;
  private static final SubLSymbol $sym135$PRINT_RKF_SD_EXAMPLE;
  private static final SubLSymbol $sym136$RKF_SD_EXAMPLE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list137;
  private static final SubLSymbol $sym138$RKF_SD_EXAMPLE_TYPE;
  private static final SubLSymbol $sym139$_CSETF_RKF_SD_EXAMPLE_TYPE;
  private static final SubLSymbol $sym140$RKF_SD_EXAMPLE_TERM;
  private static final SubLSymbol $sym141$_CSETF_RKF_SD_EXAMPLE_TERM;
  private static final SubLSymbol $sym142$RKF_SD_EXAMPLE_SUPPORTS;
  private static final SubLSymbol $sym143$_CSETF_RKF_SD_EXAMPLE_SUPPORTS;
  private static final SubLSymbol $sym144$RKF_SD_EXAMPLE_FOCUS_TERM_ANALOG;
  private static final SubLSymbol $sym145$_CSETF_RKF_SD_EXAMPLE_FOCUS_TERM_ANALOG;
  private static final SubLSymbol $kw146$TYPE;
  private static final SubLSymbol $kw147$TERM;
  private static final SubLSymbol $kw148$SUPPORTS;
  private static final SubLSymbol $kw149$FOCUS_TERM_ANALOG;
  private static final SubLSymbol $sym150$MAKE_RKF_SD_EXAMPLE;
  private static final SubLSymbol $sym151$VISIT_DEFSTRUCT_OBJECT_RKF_SD_EXAMPLE_METHOD;
  private static final SubLList $list152;
  private static final SubLSymbol $sym153$RKF_SD_EXAMPLE_TYPE_P;
  private static final SubLList $list154;
  private static final SubLSymbol $sym155$CLET;
  private static final SubLString $str156$_RKF_SD__A_EXAMPLE__S;
  private static final SubLSymbol $kw157$PRECEDENT;
  private static final SubLString $str158$__S;

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1068L)
  public static SubLObject rkf_salient_descriptor_prompter_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_rkf_sd_prompter( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1068L)
  public static SubLObject rkf_salient_descriptor_prompter_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $rkf_salient_descriptor_prompter_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1068L)
  public static SubLObject rkf_sd_prompter_seed_term(final SubLObject v_object)
  {
    assert NIL != rkf_salient_descriptor_prompter_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1068L)
  public static SubLObject rkf_sd_prompter_mt(final SubLObject v_object)
  {
    assert NIL != rkf_salient_descriptor_prompter_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1068L)
  public static SubLObject rkf_sd_prompter_used_prompts(final SubLObject v_object)
  {
    assert NIL != rkf_salient_descriptor_prompter_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1068L)
  public static SubLObject rkf_sd_prompter_unused_prompts(final SubLObject v_object)
  {
    assert NIL != rkf_salient_descriptor_prompter_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1068L)
  public static SubLObject rkf_sd_prompter_tactics(final SubLObject v_object)
  {
    assert NIL != rkf_salient_descriptor_prompter_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1068L)
  public static SubLObject rkf_sd_prompter_isg(final SubLObject v_object)
  {
    assert NIL != rkf_salient_descriptor_prompter_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1068L)
  public static SubLObject rkf_sd_prompter_plist(final SubLObject v_object)
  {
    assert NIL != rkf_salient_descriptor_prompter_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1068L)
  public static SubLObject _csetf_rkf_sd_prompter_seed_term(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rkf_salient_descriptor_prompter_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1068L)
  public static SubLObject _csetf_rkf_sd_prompter_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rkf_salient_descriptor_prompter_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1068L)
  public static SubLObject _csetf_rkf_sd_prompter_used_prompts(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rkf_salient_descriptor_prompter_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1068L)
  public static SubLObject _csetf_rkf_sd_prompter_unused_prompts(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rkf_salient_descriptor_prompter_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1068L)
  public static SubLObject _csetf_rkf_sd_prompter_tactics(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rkf_salient_descriptor_prompter_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1068L)
  public static SubLObject _csetf_rkf_sd_prompter_isg(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rkf_salient_descriptor_prompter_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1068L)
  public static SubLObject _csetf_rkf_sd_prompter_plist(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rkf_salient_descriptor_prompter_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1068L)
  public static SubLObject make_rkf_salient_descriptor_prompter(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $rkf_salient_descriptor_prompter_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw23$SEED_TERM ) )
      {
        _csetf_rkf_sd_prompter_seed_term( v_new, current_value );
      }
      else if( pcase_var.eql( $kw24$MT ) )
      {
        _csetf_rkf_sd_prompter_mt( v_new, current_value );
      }
      else if( pcase_var.eql( $kw25$USED_PROMPTS ) )
      {
        _csetf_rkf_sd_prompter_used_prompts( v_new, current_value );
      }
      else if( pcase_var.eql( $kw26$UNUSED_PROMPTS ) )
      {
        _csetf_rkf_sd_prompter_unused_prompts( v_new, current_value );
      }
      else if( pcase_var.eql( $kw27$TACTICS ) )
      {
        _csetf_rkf_sd_prompter_tactics( v_new, current_value );
      }
      else if( pcase_var.eql( $kw28$ISG ) )
      {
        _csetf_rkf_sd_prompter_isg( v_new, current_value );
      }
      else if( pcase_var.eql( $kw29$PLIST ) )
      {
        _csetf_rkf_sd_prompter_plist( v_new, current_value );
      }
      else
      {
        Errors.error( $str30$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1068L)
  public static SubLObject visit_defstruct_rkf_salient_descriptor_prompter(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw31$BEGIN, $sym32$MAKE_RKF_SALIENT_DESCRIPTOR_PROMPTER, SEVEN_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw23$SEED_TERM, rkf_sd_prompter_seed_term( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw24$MT, rkf_sd_prompter_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw25$USED_PROMPTS, rkf_sd_prompter_used_prompts( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw26$UNUSED_PROMPTS, rkf_sd_prompter_unused_prompts( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw27$TACTICS, rkf_sd_prompter_tactics( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw28$ISG, rkf_sd_prompter_isg( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw29$PLIST, rkf_sd_prompter_plist( obj ) );
    Functions.funcall( visitor_fn, obj, $kw34$END, $sym32$MAKE_RKF_SALIENT_DESCRIPTOR_PROMPTER, SEVEN_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1068L)
  public static SubLObject visit_defstruct_object_rkf_salient_descriptor_prompter_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_rkf_salient_descriptor_prompter( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1331L)
  public static SubLObject print_rkf_sd_prompter(final SubLObject prompter, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str36$_RKF_SD_PROMPTER__S__S___D_prompt, new SubLObject[] { rkf_sd_prompter_seed_term( prompter ), rkf_sd_prompter_mt( prompter ), set.set_size( rkf_sd_prompter_unused_prompts( prompter ) )
    } );
    return prompter;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1616L)
  public static SubLObject new_rkf_salient_descriptor_prompter(final SubLObject seed_term, final SubLObject mt)
  {
    final SubLObject seed_term_type = rkf_salient_descriptor_prompter.rkf_sd_prompter_compute_seed_term_type( seed_term );
    final SubLObject tactics = rkf_salient_descriptor_prompter.rkf_sd_prompter_tactics_for_seed_term_type( seed_term_type );
    final SubLObject prompter = make_rkf_salient_descriptor_prompter( ConsesLow.list( $kw23$SEED_TERM, seed_term, $kw24$MT, mt ) );
    if( NIL != tactics )
    {
      _csetf_rkf_sd_prompter_tactics( prompter, tactics );
    }
    _csetf_rkf_sd_prompter_used_prompts( prompter, set.new_set( UNPROVIDED, UNPROVIDED ) );
    _csetf_rkf_sd_prompter_unused_prompts( prompter, set.new_set( UNPROVIDED, UNPROVIDED ) );
    _csetf_rkf_sd_prompter_isg( prompter, integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    rkf_salient_descriptor_prompter_set( prompter, $kw37$MEMOIZATION_STATE, memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    final SubLObject lock = Locks.make_lock( $str38$Salient_Descriptor_Prompter_Lock );
    rkf_salient_descriptor_prompter_set( prompter, $kw39$LOCK, lock );
    return prompter;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 2457L)
  public static SubLObject rkf_salient_descriptor_prompter_lookup(final SubLObject prompter, final SubLObject property, SubLObject v_default)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = $kw40$UNKNOWN;
    }
    SubLObject ans = conses_high.getf( rkf_sd_prompter_plist( prompter ), property, $kw41$NOT_FOUND );
    if( $kw41$NOT_FOUND == ans )
    {
      rkf_salient_descriptor_prompter_set( prompter, property, v_default );
      ans = v_default;
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 2781L)
  public static SubLObject rkf_salient_descriptor_prompter_set(final SubLObject prompter, final SubLObject property, final SubLObject value)
  {
    _csetf_rkf_sd_prompter_plist( prompter, conses_high.putf( rkf_sd_prompter_plist( prompter ), property, value ) );
    return value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 2974L)
  public static SubLObject rkf_salient_descriptor_prompter_clear(final SubLObject prompter, final SubLObject property)
  {
    return rkf_salient_descriptor_prompter_set( prompter, property, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 3117L)
  public static SubLObject rkf_salient_descriptor_prompter_unused_prompts(final SubLObject prompter)
  {
    final SubLObject prompts = rkf_sd_prompter_unused_prompts( prompter );
    return ( NIL != set.set_p( prompts ) ) ? prompts : set.new_set( UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
  public static SubLObject rkf_salient_descriptor_prompt_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_rkf_sd_prompt( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
  public static SubLObject rkf_salient_descriptor_prompt_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $rkf_salient_descriptor_prompt_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
  public static SubLObject rkf_sd_prompt_id(final SubLObject v_object)
  {
    assert NIL != rkf_salient_descriptor_prompt_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
  public static SubLObject rkf_sd_prompt_subprompts(final SubLObject v_object)
  {
    assert NIL != rkf_salient_descriptor_prompt_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
  public static SubLObject rkf_sd_prompt_formula(final SubLObject v_object)
  {
    assert NIL != rkf_salient_descriptor_prompt_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
  public static SubLObject rkf_sd_prompt_justification(final SubLObject v_object)
  {
    assert NIL != rkf_salient_descriptor_prompt_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
  public static SubLObject rkf_sd_prompt_deducible_cnfs(final SubLObject v_object)
  {
    assert NIL != rkf_salient_descriptor_prompt_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
  public static SubLObject rkf_sd_prompt_examples(final SubLObject v_object)
  {
    assert NIL != rkf_salient_descriptor_prompt_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
  public static SubLObject rkf_sd_prompt_salient_property_sentence(final SubLObject v_object)
  {
    assert NIL != rkf_salient_descriptor_prompt_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
  public static SubLObject rkf_sd_prompt_prompter(final SubLObject v_object)
  {
    assert NIL != rkf_salient_descriptor_prompt_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
  public static SubLObject rkf_sd_prompt_tactic(final SubLObject v_object)
  {
    assert NIL != rkf_salient_descriptor_prompt_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
  public static SubLObject _csetf_rkf_sd_prompt_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rkf_salient_descriptor_prompt_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
  public static SubLObject _csetf_rkf_sd_prompt_subprompts(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rkf_salient_descriptor_prompt_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
  public static SubLObject _csetf_rkf_sd_prompt_formula(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rkf_salient_descriptor_prompt_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
  public static SubLObject _csetf_rkf_sd_prompt_justification(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rkf_salient_descriptor_prompt_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
  public static SubLObject _csetf_rkf_sd_prompt_deducible_cnfs(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rkf_salient_descriptor_prompt_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
  public static SubLObject _csetf_rkf_sd_prompt_examples(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rkf_salient_descriptor_prompt_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
  public static SubLObject _csetf_rkf_sd_prompt_salient_property_sentence(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rkf_salient_descriptor_prompt_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
  public static SubLObject _csetf_rkf_sd_prompt_prompter(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rkf_salient_descriptor_prompt_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
  public static SubLObject _csetf_rkf_sd_prompt_tactic(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rkf_salient_descriptor_prompt_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
  public static SubLObject make_rkf_salient_descriptor_prompt(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $rkf_salient_descriptor_prompt_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw69$ID ) )
      {
        _csetf_rkf_sd_prompt_id( v_new, current_value );
      }
      else if( pcase_var.eql( $kw70$SUBPROMPTS ) )
      {
        _csetf_rkf_sd_prompt_subprompts( v_new, current_value );
      }
      else if( pcase_var.eql( $kw71$FORMULA ) )
      {
        _csetf_rkf_sd_prompt_formula( v_new, current_value );
      }
      else if( pcase_var.eql( $kw72$JUSTIFICATION ) )
      {
        _csetf_rkf_sd_prompt_justification( v_new, current_value );
      }
      else if( pcase_var.eql( $kw73$DEDUCIBLE_CNFS ) )
      {
        _csetf_rkf_sd_prompt_deducible_cnfs( v_new, current_value );
      }
      else if( pcase_var.eql( $kw74$EXAMPLES ) )
      {
        _csetf_rkf_sd_prompt_examples( v_new, current_value );
      }
      else if( pcase_var.eql( $kw75$SALIENT_PROPERTY_SENTENCE ) )
      {
        _csetf_rkf_sd_prompt_salient_property_sentence( v_new, current_value );
      }
      else if( pcase_var.eql( $kw76$PROMPTER ) )
      {
        _csetf_rkf_sd_prompt_prompter( v_new, current_value );
      }
      else if( pcase_var.eql( $kw77$TACTIC ) )
      {
        _csetf_rkf_sd_prompt_tactic( v_new, current_value );
      }
      else
      {
        Errors.error( $str30$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
  public static SubLObject visit_defstruct_rkf_salient_descriptor_prompt(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw31$BEGIN, $sym78$MAKE_RKF_SALIENT_DESCRIPTOR_PROMPT, NINE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw69$ID, rkf_sd_prompt_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw70$SUBPROMPTS, rkf_sd_prompt_subprompts( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw71$FORMULA, rkf_sd_prompt_formula( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw72$JUSTIFICATION, rkf_sd_prompt_justification( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw73$DEDUCIBLE_CNFS, rkf_sd_prompt_deducible_cnfs( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw74$EXAMPLES, rkf_sd_prompt_examples( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw75$SALIENT_PROPERTY_SENTENCE, rkf_sd_prompt_salient_property_sentence( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw76$PROMPTER, rkf_sd_prompt_prompter( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw77$TACTIC, rkf_sd_prompt_tactic( obj ) );
    Functions.funcall( visitor_fn, obj, $kw34$END, $sym78$MAKE_RKF_SALIENT_DESCRIPTOR_PROMPT, NINE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
  public static SubLObject visit_defstruct_object_rkf_salient_descriptor_prompt_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_rkf_salient_descriptor_prompt( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 7199L)
  public static SubLObject print_rkf_sd_prompt(final SubLObject prompt, final SubLObject stream, final SubLObject depth)
  {
    final SubLObject subprompts = rkf_sd_prompt_subprompts( prompt );
    final SubLObject formula = rkf_sd_prompt_formula( prompt );
    final SubLObject deducible_cnfs = rkf_sd_prompt_deducible_cnfs( prompt );
    PrintLow.format( stream, $str80$_RKF_SD_PROMPT_Subprompts___S_, subprompts );
    if( NIL == subprompts )
    {
      PrintLow.format( stream, $str81$Formula___S_, formula );
    }
    PrintLow.format( stream, $str82$Deducible_CNFs___S_, deducible_cnfs );
    return prompt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 7641L)
  public static SubLObject new_rkf_sd_prompt()
  {
    return make_rkf_salient_descriptor_prompt( UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 7727L)
  public static SubLObject rkf_sd_prompt_set_formula(final SubLObject prompt, final SubLObject formula)
  {
    _csetf_rkf_sd_prompt_formula( prompt, formula );
    return prompt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 7854L)
  public static SubLObject rkf_sd_prompt_set_tactic(final SubLObject prompt, final SubLObject tactic)
  {
    _csetf_rkf_sd_prompt_tactic( prompt, tactic );
    return prompt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 7977L)
  public static SubLObject rkf_sd_prompt_set_justification(final SubLObject prompt, final SubLObject justification)
  {
    _csetf_rkf_sd_prompt_justification( prompt, justification );
    return prompt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 8128L)
  public static SubLObject rkf_sd_prompt_set_salient_property_sentence(final SubLObject prompt, final SubLObject sentence)
  {
    _csetf_rkf_sd_prompt_salient_property_sentence( prompt, sentence );
    return prompt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 8293L)
  public static SubLObject rkf_sd_prompt_set_subprompts(final SubLObject prompt, final SubLObject subprompts)
  {
    _csetf_rkf_sd_prompt_subprompts( prompt, subprompts );
    return prompt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 8432L)
  public static SubLObject rkf_sd_prompt_set_id(final SubLObject prompt, final SubLObject id)
  {
    _csetf_rkf_sd_prompt_id( prompt, id );
    return prompt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 8539L)
  public static SubLObject rkf_sd_prompt_set_prompter(final SubLObject prompt, final SubLObject prompter)
  {
    _csetf_rkf_sd_prompt_prompter( prompt, prompter );
    return prompt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 8670L)
  public static SubLObject rkf_salient_descriptor_prompt_id(final SubLObject prompt)
  {
    return rkf_sd_prompt_id( prompt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 8803L)
  public static SubLObject rkf_salient_descriptor_prompt_formula(final SubLObject prompt)
  {
    return rkf_sd_prompt_formula( prompt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 8969L)
  public static SubLObject rkf_salient_descriptor_prompt_choices(final SubLObject prompt)
  {
    SubLObject choices = NIL;
    if( $kw83$CHOICE == rkf_salient_descriptor_prompt_type( prompt ) )
    {
      final SubLObject subprompts = rkf_sd_prompt_subprompts( prompt );
      final SubLObject subprompt = subprompts.first();
      choices = conses_high.third( subprompt );
    }
    return choices;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 9348L)
  public static SubLObject rkf_salient_descriptor_prompt_term_count(final SubLObject prompt)
  {
    SubLObject count = NIL;
    final SubLObject pcase_var = rkf_salient_descriptor_prompt_type( prompt );
    if( pcase_var.eql( $kw84$SPECIFY ) || pcase_var.eql( $kw85$CONFIRM ) )
    {
      final SubLObject subprompts = rkf_sd_prompt_subprompts( prompt );
      count = Sequences.length( subprompts );
    }
    else if( pcase_var.eql( $kw83$CHOICE ) )
    {
      return ONE_INTEGER;
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 9742L)
  public static SubLObject rkf_salient_descriptor_prompt_type(final SubLObject prompt)
  {
    final SubLObject subprompts = rkf_sd_prompt_subprompts( prompt );
    final SubLObject subprompt = subprompts.first();
    return rkf_salient_descriptor.rkf_salient_descriptor_subprompt_type( subprompt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 9975L)
  public static SubLObject rkf_salient_descriptor_prompt_prompter(final SubLObject prompt)
  {
    return rkf_sd_prompt_prompter( prompt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 10151L)
  public static SubLObject rkf_salient_descriptor_prompt_justification(final SubLObject prompt)
  {
    return rkf_sd_prompt_justification( prompt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 10314L)
  public static SubLObject rkf_salient_descriptor_prompt_subprompts(final SubLObject prompt)
  {
    rkf_salient_descriptor_prompter.rkf_sd_prompt_maybe_compute_subprompts( prompt );
    return rkf_sd_prompt_subprompts( prompt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 10544L)
  public static SubLObject rkf_salient_descriptor_prompt_salient_property_sentence(final SubLObject prompt)
  {
    return rkf_sd_prompt_salient_property_sentence( prompt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 10759L)
  public static SubLObject rkf_salient_descriptor_prompt_deducible_cnfs(final SubLObject prompt)
  {
    return rkf_sd_prompt_deducible_cnfs( prompt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
  public static SubLObject rkf_sd_rule_info_score_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_rkf_sd_rule_info_score( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
  public static SubLObject rkf_sd_rule_info_score_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $rkf_sd_rule_info_score_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
  public static SubLObject rkf_sd_rule_info_score_seed_term_in_pos_litsP(final SubLObject v_object)
  {
    assert NIL != rkf_sd_rule_info_score_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
  public static SubLObject rkf_sd_rule_info_score_seed_term_in_neg_litsP(final SubLObject v_object)
  {
    assert NIL != rkf_sd_rule_info_score_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
  public static SubLObject rkf_sd_rule_info_score_var_count(final SubLObject v_object)
  {
    assert NIL != rkf_sd_rule_info_score_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
  public static SubLObject rkf_sd_rule_info_score_neg_lit_count(final SubLObject v_object)
  {
    assert NIL != rkf_sd_rule_info_score_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
  public static SubLObject rkf_sd_rule_info_score_pos_lit_count(final SubLObject v_object)
  {
    assert NIL != rkf_sd_rule_info_score_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
  public static SubLObject rkf_sd_rule_info_score_pos_lit_quality_score(final SubLObject v_object)
  {
    assert NIL != rkf_sd_rule_info_score_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
  public static SubLObject rkf_sd_rule_info_score_mt_generality_score(final SubLObject v_object)
  {
    assert NIL != rkf_sd_rule_info_score_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
  public static SubLObject rkf_sd_rule_info_score_plist(final SubLObject v_object)
  {
    assert NIL != rkf_sd_rule_info_score_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
  public static SubLObject _csetf_rkf_sd_rule_info_score_seed_term_in_pos_litsP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rkf_sd_rule_info_score_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
  public static SubLObject _csetf_rkf_sd_rule_info_score_seed_term_in_neg_litsP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rkf_sd_rule_info_score_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
  public static SubLObject _csetf_rkf_sd_rule_info_score_var_count(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rkf_sd_rule_info_score_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
  public static SubLObject _csetf_rkf_sd_rule_info_score_neg_lit_count(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rkf_sd_rule_info_score_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
  public static SubLObject _csetf_rkf_sd_rule_info_score_pos_lit_count(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rkf_sd_rule_info_score_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
  public static SubLObject _csetf_rkf_sd_rule_info_score_pos_lit_quality_score(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rkf_sd_rule_info_score_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
  public static SubLObject _csetf_rkf_sd_rule_info_score_mt_generality_score(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rkf_sd_rule_info_score_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
  public static SubLObject _csetf_rkf_sd_rule_info_score_plist(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rkf_sd_rule_info_score_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
  public static SubLObject make_rkf_sd_rule_info_score(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $rkf_sd_rule_info_score_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw111$SEED_TERM_IN_POS_LITS_ ) )
      {
        _csetf_rkf_sd_rule_info_score_seed_term_in_pos_litsP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw112$SEED_TERM_IN_NEG_LITS_ ) )
      {
        _csetf_rkf_sd_rule_info_score_seed_term_in_neg_litsP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw113$VAR_COUNT ) )
      {
        _csetf_rkf_sd_rule_info_score_var_count( v_new, current_value );
      }
      else if( pcase_var.eql( $kw114$NEG_LIT_COUNT ) )
      {
        _csetf_rkf_sd_rule_info_score_neg_lit_count( v_new, current_value );
      }
      else if( pcase_var.eql( $kw115$POS_LIT_COUNT ) )
      {
        _csetf_rkf_sd_rule_info_score_pos_lit_count( v_new, current_value );
      }
      else if( pcase_var.eql( $kw116$POS_LIT_QUALITY_SCORE ) )
      {
        _csetf_rkf_sd_rule_info_score_pos_lit_quality_score( v_new, current_value );
      }
      else if( pcase_var.eql( $kw117$MT_GENERALITY_SCORE ) )
      {
        _csetf_rkf_sd_rule_info_score_mt_generality_score( v_new, current_value );
      }
      else if( pcase_var.eql( $kw29$PLIST ) )
      {
        _csetf_rkf_sd_rule_info_score_plist( v_new, current_value );
      }
      else
      {
        Errors.error( $str30$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
  public static SubLObject visit_defstruct_rkf_sd_rule_info_score(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw31$BEGIN, $sym118$MAKE_RKF_SD_RULE_INFO_SCORE, EIGHT_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw111$SEED_TERM_IN_POS_LITS_, rkf_sd_rule_info_score_seed_term_in_pos_litsP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw112$SEED_TERM_IN_NEG_LITS_, rkf_sd_rule_info_score_seed_term_in_neg_litsP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw113$VAR_COUNT, rkf_sd_rule_info_score_var_count( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw114$NEG_LIT_COUNT, rkf_sd_rule_info_score_neg_lit_count( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw115$POS_LIT_COUNT, rkf_sd_rule_info_score_pos_lit_count( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw116$POS_LIT_QUALITY_SCORE, rkf_sd_rule_info_score_pos_lit_quality_score( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw117$MT_GENERALITY_SCORE, rkf_sd_rule_info_score_mt_generality_score( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw29$PLIST, rkf_sd_rule_info_score_plist( obj ) );
    Functions.funcall( visitor_fn, obj, $kw34$END, $sym118$MAKE_RKF_SD_RULE_INFO_SCORE, EIGHT_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
  public static SubLObject visit_defstruct_object_rkf_sd_rule_info_score_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_rkf_sd_rule_info_score( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12839L)
  public static SubLObject new_rkf_sd_rule_info_score()
  {
    return make_rkf_sd_rule_info_score( UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12927L)
  public static SubLObject print_rkf_sd_rule_info_score(final SubLObject score, SubLObject stream, SubLObject depth)
  {
    if( stream == UNPROVIDED )
    {
      stream = NIL;
    }
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    print_high.princ( $str120$_RKF_SD_SCORE, stream );
    PrintLow.format( stream, $str121$_neg__S, rkf_sd_rule_info_score_seed_term_in_neg_litsP( score ) );
    PrintLow.format( stream, $str122$_pos__S, rkf_sd_rule_info_score_seed_term_in_pos_litsP( score ) );
    PrintLow.format( stream, $str123$_vars__S, rkf_sd_rule_info_score_var_count( score ) );
    PrintLow.format( stream, $str124$_nlc__S, rkf_sd_rule_info_score_neg_lit_count( score ) );
    PrintLow.format( stream, $str125$_plc__S, rkf_sd_rule_info_score_pos_lit_count( score ) );
    PrintLow.format( stream, $str126$_plq__S, rkf_sd_rule_info_score_pos_lit_quality_score( score ) );
    PrintLow.format( stream, $str127$_mtg__S, rkf_sd_rule_info_score_mt_generality_score( score ) );
    print_high.princ( $str128$_, stream );
    return score;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 13631L)
  public static SubLObject rkf_sd_example_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_rkf_sd_example( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 13631L)
  public static SubLObject rkf_sd_example_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $rkf_sd_example_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 13631L)
  public static SubLObject rkf_sd_example_type(final SubLObject v_object)
  {
    assert NIL != rkf_sd_example_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 13631L)
  public static SubLObject rkf_sd_example_term(final SubLObject v_object)
  {
    assert NIL != rkf_sd_example_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 13631L)
  public static SubLObject rkf_sd_example_supports(final SubLObject v_object)
  {
    assert NIL != rkf_sd_example_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 13631L)
  public static SubLObject rkf_sd_example_focus_term_analog(final SubLObject v_object)
  {
    assert NIL != rkf_sd_example_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 13631L)
  public static SubLObject _csetf_rkf_sd_example_type(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rkf_sd_example_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 13631L)
  public static SubLObject _csetf_rkf_sd_example_term(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rkf_sd_example_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 13631L)
  public static SubLObject _csetf_rkf_sd_example_supports(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rkf_sd_example_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 13631L)
  public static SubLObject _csetf_rkf_sd_example_focus_term_analog(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rkf_sd_example_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 13631L)
  public static SubLObject make_rkf_sd_example(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $rkf_sd_example_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw146$TYPE ) )
      {
        _csetf_rkf_sd_example_type( v_new, current_value );
      }
      else if( pcase_var.eql( $kw147$TERM ) )
      {
        _csetf_rkf_sd_example_term( v_new, current_value );
      }
      else if( pcase_var.eql( $kw148$SUPPORTS ) )
      {
        _csetf_rkf_sd_example_supports( v_new, current_value );
      }
      else if( pcase_var.eql( $kw149$FOCUS_TERM_ANALOG ) )
      {
        _csetf_rkf_sd_example_focus_term_analog( v_new, current_value );
      }
      else
      {
        Errors.error( $str30$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 13631L)
  public static SubLObject visit_defstruct_rkf_sd_example(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw31$BEGIN, $sym150$MAKE_RKF_SD_EXAMPLE, FOUR_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw146$TYPE, rkf_sd_example_type( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw147$TERM, rkf_sd_example_term( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw148$SUPPORTS, rkf_sd_example_supports( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw149$FOCUS_TERM_ANALOG, rkf_sd_example_focus_term_analog( obj ) );
    Functions.funcall( visitor_fn, obj, $kw34$END, $sym150$MAKE_RKF_SD_EXAMPLE, FOUR_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 13631L)
  public static SubLObject visit_defstruct_object_rkf_sd_example_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_rkf_sd_example( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 13843L)
  public static SubLObject rkf_sd_example_type_p(final SubLObject v_object)
  {
    return subl_promotions.memberP( v_object, $rkf_sd_example_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 13938L)
  public static SubLObject new_rkf_sd_example(SubLObject type, SubLObject v_term, SubLObject supports, SubLObject focus_term_analog)
  {
    if( type == UNPROVIDED )
    {
      type = NIL;
    }
    if( v_term == UNPROVIDED )
    {
      v_term = NIL;
    }
    if( supports == UNPROVIDED )
    {
      supports = NIL;
    }
    if( focus_term_analog == UNPROVIDED )
    {
      focus_term_analog = NIL;
    }
    assert NIL != rkf_sd_example_type_p( type ) : type;
    return make_rkf_sd_example( ConsesLow.list( $kw146$TYPE, type, $kw147$TERM, v_term, $kw148$SUPPORTS, supports, $kw149$FOCUS_TERM_ANALOG, focus_term_analog ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 14201L)
  public static SubLObject destructure_rkf_sd_example(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list154 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject type = NIL;
    SubLObject v_term = NIL;
    SubLObject supports = NIL;
    SubLObject focus_term_analog = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list154 );
    type = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list154 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list154 );
    supports = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list154 );
    focus_term_analog = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      SubLObject example = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list154 );
      example = current.first();
      final SubLObject body;
      current = ( body = current.rest() );
      return ConsesLow.listS( $sym155$CLET, ConsesLow.list( ConsesLow.list( type, ConsesLow.list( $sym138$RKF_SD_EXAMPLE_TYPE, example ) ), ConsesLow.list( v_term, ConsesLow.list( $sym140$RKF_SD_EXAMPLE_TERM,
          example ) ), ConsesLow.list( supports, ConsesLow.list( $sym142$RKF_SD_EXAMPLE_SUPPORTS, example ) ), ConsesLow.list( focus_term_analog, ConsesLow.list( $sym144$RKF_SD_EXAMPLE_FOCUS_TERM_ANALOG, example ) ) ),
          ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list154 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 14552L)
  public static SubLObject print_rkf_sd_example(final SubLObject example, SubLObject stream, SubLObject depth)
  {
    if( stream == UNPROVIDED )
    {
      stream = NIL;
    }
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    final SubLObject type = rkf_sd_example_type( example );
    final SubLObject v_term = rkf_sd_example_term( example );
    final SubLObject supports = rkf_sd_example_supports( example );
    final SubLObject focus_term_analog = rkf_sd_example_focus_term_analog( example );
    PrintLow.format( stream, $str156$_RKF_SD__A_EXAMPLE__S, type, v_term );
    if( $kw157$PRECEDENT == type )
    {
      PrintLow.format( stream, $str158$__S, focus_term_analog );
    }
    print_high.princ( $str128$_, stream );
    return example;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 14913L)
  public static SubLObject rkf_sd_precedent_example_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != rkf_sd_example_p( v_object ) && rkf_sd_example_type( v_object ) == $kw157$PRECEDENT );
  }

  public static SubLObject declare_rkf_salient_descriptor_datastructures_file()
  {
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_prompter_print_function_trampoline", "RKF-SALIENT-DESCRIPTOR-PROMPTER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_prompter_p", "RKF-SALIENT-DESCRIPTOR-PROMPTER-P", 1, 0, false );
    new $rkf_salient_descriptor_prompter_p$UnaryFunction();
    SubLFiles.declareFunction( me, "rkf_sd_prompter_seed_term", "RKF-SD-PROMPTER-SEED-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_mt", "RKF-SD-PROMPTER-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_used_prompts", "RKF-SD-PROMPTER-USED-PROMPTS", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_unused_prompts", "RKF-SD-PROMPTER-UNUSED-PROMPTS", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_tactics", "RKF-SD-PROMPTER-TACTICS", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_isg", "RKF-SD-PROMPTER-ISG", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_plist", "RKF-SD-PROMPTER-PLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rkf_sd_prompter_seed_term", "_CSETF-RKF-SD-PROMPTER-SEED-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rkf_sd_prompter_mt", "_CSETF-RKF-SD-PROMPTER-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rkf_sd_prompter_used_prompts", "_CSETF-RKF-SD-PROMPTER-USED-PROMPTS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rkf_sd_prompter_unused_prompts", "_CSETF-RKF-SD-PROMPTER-UNUSED-PROMPTS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rkf_sd_prompter_tactics", "_CSETF-RKF-SD-PROMPTER-TACTICS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rkf_sd_prompter_isg", "_CSETF-RKF-SD-PROMPTER-ISG", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rkf_sd_prompter_plist", "_CSETF-RKF-SD-PROMPTER-PLIST", 2, 0, false );
    SubLFiles.declareFunction( me, "make_rkf_salient_descriptor_prompter", "MAKE-RKF-SALIENT-DESCRIPTOR-PROMPTER", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_rkf_salient_descriptor_prompter", "VISIT-DEFSTRUCT-RKF-SALIENT-DESCRIPTOR-PROMPTER", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_rkf_salient_descriptor_prompter_method", "VISIT-DEFSTRUCT-OBJECT-RKF-SALIENT-DESCRIPTOR-PROMPTER-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_rkf_sd_prompter", "PRINT-RKF-SD-PROMPTER", 3, 0, false );
    SubLFiles.declareFunction( me, "new_rkf_salient_descriptor_prompter", "NEW-RKF-SALIENT-DESCRIPTOR-PROMPTER", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_prompter_lookup", "RKF-SALIENT-DESCRIPTOR-PROMPTER-LOOKUP", 2, 1, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_prompter_set", "RKF-SALIENT-DESCRIPTOR-PROMPTER-SET", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_prompter_clear", "RKF-SALIENT-DESCRIPTOR-PROMPTER-CLEAR", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_prompter_unused_prompts", "RKF-SALIENT-DESCRIPTOR-PROMPTER-UNUSED-PROMPTS", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_prompt_print_function_trampoline", "RKF-SALIENT-DESCRIPTOR-PROMPT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_prompt_p", "RKF-SALIENT-DESCRIPTOR-PROMPT-P", 1, 0, false );
    new $rkf_salient_descriptor_prompt_p$UnaryFunction();
    SubLFiles.declareFunction( me, "rkf_sd_prompt_id", "RKF-SD-PROMPT-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompt_subprompts", "RKF-SD-PROMPT-SUBPROMPTS", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompt_formula", "RKF-SD-PROMPT-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompt_justification", "RKF-SD-PROMPT-JUSTIFICATION", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompt_deducible_cnfs", "RKF-SD-PROMPT-DEDUCIBLE-CNFS", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompt_examples", "RKF-SD-PROMPT-EXAMPLES", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompt_salient_property_sentence", "RKF-SD-PROMPT-SALIENT-PROPERTY-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompt_prompter", "RKF-SD-PROMPT-PROMPTER", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompt_tactic", "RKF-SD-PROMPT-TACTIC", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rkf_sd_prompt_id", "_CSETF-RKF-SD-PROMPT-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rkf_sd_prompt_subprompts", "_CSETF-RKF-SD-PROMPT-SUBPROMPTS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rkf_sd_prompt_formula", "_CSETF-RKF-SD-PROMPT-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rkf_sd_prompt_justification", "_CSETF-RKF-SD-PROMPT-JUSTIFICATION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rkf_sd_prompt_deducible_cnfs", "_CSETF-RKF-SD-PROMPT-DEDUCIBLE-CNFS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rkf_sd_prompt_examples", "_CSETF-RKF-SD-PROMPT-EXAMPLES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rkf_sd_prompt_salient_property_sentence", "_CSETF-RKF-SD-PROMPT-SALIENT-PROPERTY-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rkf_sd_prompt_prompter", "_CSETF-RKF-SD-PROMPT-PROMPTER", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rkf_sd_prompt_tactic", "_CSETF-RKF-SD-PROMPT-TACTIC", 2, 0, false );
    SubLFiles.declareFunction( me, "make_rkf_salient_descriptor_prompt", "MAKE-RKF-SALIENT-DESCRIPTOR-PROMPT", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_rkf_salient_descriptor_prompt", "VISIT-DEFSTRUCT-RKF-SALIENT-DESCRIPTOR-PROMPT", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_rkf_salient_descriptor_prompt_method", "VISIT-DEFSTRUCT-OBJECT-RKF-SALIENT-DESCRIPTOR-PROMPT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_rkf_sd_prompt", "PRINT-RKF-SD-PROMPT", 3, 0, false );
    SubLFiles.declareFunction( me, "new_rkf_sd_prompt", "NEW-RKF-SD-PROMPT", 0, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompt_set_formula", "RKF-SD-PROMPT-SET-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompt_set_tactic", "RKF-SD-PROMPT-SET-TACTIC", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompt_set_justification", "RKF-SD-PROMPT-SET-JUSTIFICATION", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompt_set_salient_property_sentence", "RKF-SD-PROMPT-SET-SALIENT-PROPERTY-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompt_set_subprompts", "RKF-SD-PROMPT-SET-SUBPROMPTS", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompt_set_id", "RKF-SD-PROMPT-SET-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompt_set_prompter", "RKF-SD-PROMPT-SET-PROMPTER", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_prompt_id", "RKF-SALIENT-DESCRIPTOR-PROMPT-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_prompt_formula", "RKF-SALIENT-DESCRIPTOR-PROMPT-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_prompt_choices", "RKF-SALIENT-DESCRIPTOR-PROMPT-CHOICES", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_prompt_term_count", "RKF-SALIENT-DESCRIPTOR-PROMPT-TERM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_prompt_type", "RKF-SALIENT-DESCRIPTOR-PROMPT-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_prompt_prompter", "RKF-SALIENT-DESCRIPTOR-PROMPT-PROMPTER", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_prompt_justification", "RKF-SALIENT-DESCRIPTOR-PROMPT-JUSTIFICATION", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_prompt_subprompts", "RKF-SALIENT-DESCRIPTOR-PROMPT-SUBPROMPTS", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_prompt_salient_property_sentence", "RKF-SALIENT-DESCRIPTOR-PROMPT-SALIENT-PROPERTY-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_prompt_deducible_cnfs", "RKF-SALIENT-DESCRIPTOR-PROMPT-DEDUCIBLE-CNFS", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_rule_info_score_print_function_trampoline", "RKF-SD-RULE-INFO-SCORE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_rule_info_score_p", "RKF-SD-RULE-INFO-SCORE-P", 1, 0, false );
    new $rkf_sd_rule_info_score_p$UnaryFunction();
    SubLFiles.declareFunction( me, "rkf_sd_rule_info_score_seed_term_in_pos_litsP", "RKF-SD-RULE-INFO-SCORE-SEED-TERM-IN-POS-LITS?", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_rule_info_score_seed_term_in_neg_litsP", "RKF-SD-RULE-INFO-SCORE-SEED-TERM-IN-NEG-LITS?", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_rule_info_score_var_count", "RKF-SD-RULE-INFO-SCORE-VAR-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_rule_info_score_neg_lit_count", "RKF-SD-RULE-INFO-SCORE-NEG-LIT-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_rule_info_score_pos_lit_count", "RKF-SD-RULE-INFO-SCORE-POS-LIT-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_rule_info_score_pos_lit_quality_score", "RKF-SD-RULE-INFO-SCORE-POS-LIT-QUALITY-SCORE", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_rule_info_score_mt_generality_score", "RKF-SD-RULE-INFO-SCORE-MT-GENERALITY-SCORE", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_rule_info_score_plist", "RKF-SD-RULE-INFO-SCORE-PLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rkf_sd_rule_info_score_seed_term_in_pos_litsP", "_CSETF-RKF-SD-RULE-INFO-SCORE-SEED-TERM-IN-POS-LITS?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rkf_sd_rule_info_score_seed_term_in_neg_litsP", "_CSETF-RKF-SD-RULE-INFO-SCORE-SEED-TERM-IN-NEG-LITS?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rkf_sd_rule_info_score_var_count", "_CSETF-RKF-SD-RULE-INFO-SCORE-VAR-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rkf_sd_rule_info_score_neg_lit_count", "_CSETF-RKF-SD-RULE-INFO-SCORE-NEG-LIT-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rkf_sd_rule_info_score_pos_lit_count", "_CSETF-RKF-SD-RULE-INFO-SCORE-POS-LIT-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rkf_sd_rule_info_score_pos_lit_quality_score", "_CSETF-RKF-SD-RULE-INFO-SCORE-POS-LIT-QUALITY-SCORE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rkf_sd_rule_info_score_mt_generality_score", "_CSETF-RKF-SD-RULE-INFO-SCORE-MT-GENERALITY-SCORE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rkf_sd_rule_info_score_plist", "_CSETF-RKF-SD-RULE-INFO-SCORE-PLIST", 2, 0, false );
    SubLFiles.declareFunction( me, "make_rkf_sd_rule_info_score", "MAKE-RKF-SD-RULE-INFO-SCORE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_rkf_sd_rule_info_score", "VISIT-DEFSTRUCT-RKF-SD-RULE-INFO-SCORE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_rkf_sd_rule_info_score_method", "VISIT-DEFSTRUCT-OBJECT-RKF-SD-RULE-INFO-SCORE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_rkf_sd_rule_info_score", "NEW-RKF-SD-RULE-INFO-SCORE", 0, 0, false );
    SubLFiles.declareFunction( me, "print_rkf_sd_rule_info_score", "PRINT-RKF-SD-RULE-INFO-SCORE", 1, 2, false );
    SubLFiles.declareFunction( me, "rkf_sd_example_print_function_trampoline", "RKF-SD-EXAMPLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_example_p", "RKF-SD-EXAMPLE-P", 1, 0, false );
    new $rkf_sd_example_p$UnaryFunction();
    SubLFiles.declareFunction( me, "rkf_sd_example_type", "RKF-SD-EXAMPLE-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_example_term", "RKF-SD-EXAMPLE-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_example_supports", "RKF-SD-EXAMPLE-SUPPORTS", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_example_focus_term_analog", "RKF-SD-EXAMPLE-FOCUS-TERM-ANALOG", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rkf_sd_example_type", "_CSETF-RKF-SD-EXAMPLE-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rkf_sd_example_term", "_CSETF-RKF-SD-EXAMPLE-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rkf_sd_example_supports", "_CSETF-RKF-SD-EXAMPLE-SUPPORTS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rkf_sd_example_focus_term_analog", "_CSETF-RKF-SD-EXAMPLE-FOCUS-TERM-ANALOG", 2, 0, false );
    SubLFiles.declareFunction( me, "make_rkf_sd_example", "MAKE-RKF-SD-EXAMPLE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_rkf_sd_example", "VISIT-DEFSTRUCT-RKF-SD-EXAMPLE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_rkf_sd_example_method", "VISIT-DEFSTRUCT-OBJECT-RKF-SD-EXAMPLE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_example_type_p", "RKF-SD-EXAMPLE-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_rkf_sd_example", "NEW-RKF-SD-EXAMPLE", 0, 4, false );
    SubLFiles.declareMacro( me, "destructure_rkf_sd_example", "DESTRUCTURE-RKF-SD-EXAMPLE" );
    SubLFiles.declareFunction( me, "print_rkf_sd_example", "PRINT-RKF-SD-EXAMPLE", 1, 2, false );
    SubLFiles.declareFunction( me, "rkf_sd_precedent_example_p", "RKF-SD-PRECEDENT-EXAMPLE-P", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_rkf_salient_descriptor_datastructures_file()
  {
    $dtp_rkf_salient_descriptor_prompter$ = SubLFiles.defconstant( "*DTP-RKF-SALIENT-DESCRIPTOR-PROMPTER*", $sym0$RKF_SALIENT_DESCRIPTOR_PROMPTER );
    $dtp_rkf_salient_descriptor_prompt$ = SubLFiles.defconstant( "*DTP-RKF-SALIENT-DESCRIPTOR-PROMPT*", $sym42$RKF_SALIENT_DESCRIPTOR_PROMPT );
    $dtp_rkf_sd_rule_info_score$ = SubLFiles.defconstant( "*DTP-RKF-SD-RULE-INFO-SCORE*", $sym86$RKF_SD_RULE_INFO_SCORE );
    $dtp_rkf_sd_example$ = SubLFiles.defconstant( "*DTP-RKF-SD-EXAMPLE*", $sym129$RKF_SD_EXAMPLE );
    $rkf_sd_example_types$ = SubLFiles.defconstant( "*RKF-SD-EXAMPLE-TYPES*", $list152 );
    return NIL;
  }

  public static SubLObject setup_rkf_salient_descriptor_datastructures_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_rkf_salient_descriptor_prompter$.getGlobalValue(), Symbols.symbol_function(
        $sym7$RKF_SALIENT_DESCRIPTOR_PROMPTER_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$RKF_SD_PROMPTER_SEED_TERM, $sym10$_CSETF_RKF_SD_PROMPTER_SEED_TERM );
    Structures.def_csetf( $sym11$RKF_SD_PROMPTER_MT, $sym12$_CSETF_RKF_SD_PROMPTER_MT );
    Structures.def_csetf( $sym13$RKF_SD_PROMPTER_USED_PROMPTS, $sym14$_CSETF_RKF_SD_PROMPTER_USED_PROMPTS );
    Structures.def_csetf( $sym15$RKF_SD_PROMPTER_UNUSED_PROMPTS, $sym16$_CSETF_RKF_SD_PROMPTER_UNUSED_PROMPTS );
    Structures.def_csetf( $sym17$RKF_SD_PROMPTER_TACTICS, $sym18$_CSETF_RKF_SD_PROMPTER_TACTICS );
    Structures.def_csetf( $sym19$RKF_SD_PROMPTER_ISG, $sym20$_CSETF_RKF_SD_PROMPTER_ISG );
    Structures.def_csetf( $sym21$RKF_SD_PROMPTER_PLIST, $sym22$_CSETF_RKF_SD_PROMPTER_PLIST );
    Equality.identity( $sym0$RKF_SALIENT_DESCRIPTOR_PROMPTER );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_rkf_salient_descriptor_prompter$.getGlobalValue(), Symbols.symbol_function(
        $sym35$VISIT_DEFSTRUCT_OBJECT_RKF_SALIENT_DESCRIPTOR_PROMPTER_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_rkf_salient_descriptor_prompt$.getGlobalValue(), Symbols.symbol_function(
        $sym49$RKF_SALIENT_DESCRIPTOR_PROMPT_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list50 );
    Structures.def_csetf( $sym51$RKF_SD_PROMPT_ID, $sym52$_CSETF_RKF_SD_PROMPT_ID );
    Structures.def_csetf( $sym53$RKF_SD_PROMPT_SUBPROMPTS, $sym54$_CSETF_RKF_SD_PROMPT_SUBPROMPTS );
    Structures.def_csetf( $sym55$RKF_SD_PROMPT_FORMULA, $sym56$_CSETF_RKF_SD_PROMPT_FORMULA );
    Structures.def_csetf( $sym57$RKF_SD_PROMPT_JUSTIFICATION, $sym58$_CSETF_RKF_SD_PROMPT_JUSTIFICATION );
    Structures.def_csetf( $sym59$RKF_SD_PROMPT_DEDUCIBLE_CNFS, $sym60$_CSETF_RKF_SD_PROMPT_DEDUCIBLE_CNFS );
    Structures.def_csetf( $sym61$RKF_SD_PROMPT_EXAMPLES, $sym62$_CSETF_RKF_SD_PROMPT_EXAMPLES );
    Structures.def_csetf( $sym63$RKF_SD_PROMPT_SALIENT_PROPERTY_SENTENCE, $sym64$_CSETF_RKF_SD_PROMPT_SALIENT_PROPERTY_SENTENCE );
    Structures.def_csetf( $sym65$RKF_SD_PROMPT_PROMPTER, $sym66$_CSETF_RKF_SD_PROMPT_PROMPTER );
    Structures.def_csetf( $sym67$RKF_SD_PROMPT_TACTIC, $sym68$_CSETF_RKF_SD_PROMPT_TACTIC );
    Equality.identity( $sym42$RKF_SALIENT_DESCRIPTOR_PROMPT );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_rkf_salient_descriptor_prompt$.getGlobalValue(), Symbols.symbol_function(
        $sym79$VISIT_DEFSTRUCT_OBJECT_RKF_SALIENT_DESCRIPTOR_PROMPT_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_rkf_sd_rule_info_score$.getGlobalValue(), Symbols.symbol_function(
        $sym93$RKF_SD_RULE_INFO_SCORE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list94 );
    Structures.def_csetf( $sym95$RKF_SD_RULE_INFO_SCORE_SEED_TERM_IN_POS_LITS_, $sym96$_CSETF_RKF_SD_RULE_INFO_SCORE_SEED_TERM_IN_POS_LITS_ );
    Structures.def_csetf( $sym97$RKF_SD_RULE_INFO_SCORE_SEED_TERM_IN_NEG_LITS_, $sym98$_CSETF_RKF_SD_RULE_INFO_SCORE_SEED_TERM_IN_NEG_LITS_ );
    Structures.def_csetf( $sym99$RKF_SD_RULE_INFO_SCORE_VAR_COUNT, $sym100$_CSETF_RKF_SD_RULE_INFO_SCORE_VAR_COUNT );
    Structures.def_csetf( $sym101$RKF_SD_RULE_INFO_SCORE_NEG_LIT_COUNT, $sym102$_CSETF_RKF_SD_RULE_INFO_SCORE_NEG_LIT_COUNT );
    Structures.def_csetf( $sym103$RKF_SD_RULE_INFO_SCORE_POS_LIT_COUNT, $sym104$_CSETF_RKF_SD_RULE_INFO_SCORE_POS_LIT_COUNT );
    Structures.def_csetf( $sym105$RKF_SD_RULE_INFO_SCORE_POS_LIT_QUALITY_SCORE, $sym106$_CSETF_RKF_SD_RULE_INFO_SCORE_POS_LIT_QUALITY_SCORE );
    Structures.def_csetf( $sym107$RKF_SD_RULE_INFO_SCORE_MT_GENERALITY_SCORE, $sym108$_CSETF_RKF_SD_RULE_INFO_SCORE_MT_GENERALITY_SCORE );
    Structures.def_csetf( $sym109$RKF_SD_RULE_INFO_SCORE_PLIST, $sym110$_CSETF_RKF_SD_RULE_INFO_SCORE_PLIST );
    Equality.identity( $sym86$RKF_SD_RULE_INFO_SCORE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_rkf_sd_rule_info_score$.getGlobalValue(), Symbols.symbol_function(
        $sym119$VISIT_DEFSTRUCT_OBJECT_RKF_SD_RULE_INFO_SCORE_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_rkf_sd_example$.getGlobalValue(), Symbols.symbol_function( $sym136$RKF_SD_EXAMPLE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list137 );
    Structures.def_csetf( $sym138$RKF_SD_EXAMPLE_TYPE, $sym139$_CSETF_RKF_SD_EXAMPLE_TYPE );
    Structures.def_csetf( $sym140$RKF_SD_EXAMPLE_TERM, $sym141$_CSETF_RKF_SD_EXAMPLE_TERM );
    Structures.def_csetf( $sym142$RKF_SD_EXAMPLE_SUPPORTS, $sym143$_CSETF_RKF_SD_EXAMPLE_SUPPORTS );
    Structures.def_csetf( $sym144$RKF_SD_EXAMPLE_FOCUS_TERM_ANALOG, $sym145$_CSETF_RKF_SD_EXAMPLE_FOCUS_TERM_ANALOG );
    Equality.identity( $sym129$RKF_SD_EXAMPLE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_rkf_sd_example$.getGlobalValue(), Symbols.symbol_function( $sym151$VISIT_DEFSTRUCT_OBJECT_RKF_SD_EXAMPLE_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_rkf_salient_descriptor_datastructures_file();
  }

  @Override
  public void initializeVariables()
  {
    init_rkf_salient_descriptor_datastructures_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_rkf_salient_descriptor_datastructures_file();
  }
  static
  {
    me = new rkf_salient_descriptor_datastructures();
    $dtp_rkf_salient_descriptor_prompter$ = null;
    $dtp_rkf_salient_descriptor_prompt$ = null;
    $dtp_rkf_sd_rule_info_score$ = null;
    $dtp_rkf_sd_example$ = null;
    $rkf_sd_example_types$ = null;
    $sym0$RKF_SALIENT_DESCRIPTOR_PROMPTER = makeSymbol( "RKF-SALIENT-DESCRIPTOR-PROMPTER" );
    $sym1$RKF_SALIENT_DESCRIPTOR_PROMPTER_P = makeSymbol( "RKF-SALIENT-DESCRIPTOR-PROMPTER-P" );
    $list2 = ConsesLow.list( makeSymbol( "SEED-TERM" ), makeSymbol( "MT" ), makeSymbol( "USED-PROMPTS" ), makeSymbol( "UNUSED-PROMPTS" ), makeSymbol( "TACTICS" ), makeSymbol( "ISG" ), makeSymbol( "PLIST" ) );
    $list3 = ConsesLow.list( makeKeyword( "SEED-TERM" ), makeKeyword( "MT" ), makeKeyword( "USED-PROMPTS" ), makeKeyword( "UNUSED-PROMPTS" ), makeKeyword( "TACTICS" ), makeKeyword( "ISG" ), makeKeyword( "PLIST" ) );
    $list4 = ConsesLow.list( makeSymbol( "RKF-SD-PROMPTER-SEED-TERM" ), makeSymbol( "RKF-SD-PROMPTER-MT" ), makeSymbol( "RKF-SD-PROMPTER-USED-PROMPTS" ), makeSymbol( "RKF-SD-PROMPTER-UNUSED-PROMPTS" ), makeSymbol(
        "RKF-SD-PROMPTER-TACTICS" ), makeSymbol( "RKF-SD-PROMPTER-ISG" ), makeSymbol( "RKF-SD-PROMPTER-PLIST" ) );
    $list5 = ConsesLow.list( makeSymbol( "_CSETF-RKF-SD-PROMPTER-SEED-TERM" ), makeSymbol( "_CSETF-RKF-SD-PROMPTER-MT" ), makeSymbol( "_CSETF-RKF-SD-PROMPTER-USED-PROMPTS" ), makeSymbol(
        "_CSETF-RKF-SD-PROMPTER-UNUSED-PROMPTS" ), makeSymbol( "_CSETF-RKF-SD-PROMPTER-TACTICS" ), makeSymbol( "_CSETF-RKF-SD-PROMPTER-ISG" ), makeSymbol( "_CSETF-RKF-SD-PROMPTER-PLIST" ) );
    $sym6$PRINT_RKF_SD_PROMPTER = makeSymbol( "PRINT-RKF-SD-PROMPTER" );
    $sym7$RKF_SALIENT_DESCRIPTOR_PROMPTER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "RKF-SALIENT-DESCRIPTOR-PROMPTER-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "RKF-SALIENT-DESCRIPTOR-PROMPTER-P" ) );
    $sym9$RKF_SD_PROMPTER_SEED_TERM = makeSymbol( "RKF-SD-PROMPTER-SEED-TERM" );
    $sym10$_CSETF_RKF_SD_PROMPTER_SEED_TERM = makeSymbol( "_CSETF-RKF-SD-PROMPTER-SEED-TERM" );
    $sym11$RKF_SD_PROMPTER_MT = makeSymbol( "RKF-SD-PROMPTER-MT" );
    $sym12$_CSETF_RKF_SD_PROMPTER_MT = makeSymbol( "_CSETF-RKF-SD-PROMPTER-MT" );
    $sym13$RKF_SD_PROMPTER_USED_PROMPTS = makeSymbol( "RKF-SD-PROMPTER-USED-PROMPTS" );
    $sym14$_CSETF_RKF_SD_PROMPTER_USED_PROMPTS = makeSymbol( "_CSETF-RKF-SD-PROMPTER-USED-PROMPTS" );
    $sym15$RKF_SD_PROMPTER_UNUSED_PROMPTS = makeSymbol( "RKF-SD-PROMPTER-UNUSED-PROMPTS" );
    $sym16$_CSETF_RKF_SD_PROMPTER_UNUSED_PROMPTS = makeSymbol( "_CSETF-RKF-SD-PROMPTER-UNUSED-PROMPTS" );
    $sym17$RKF_SD_PROMPTER_TACTICS = makeSymbol( "RKF-SD-PROMPTER-TACTICS" );
    $sym18$_CSETF_RKF_SD_PROMPTER_TACTICS = makeSymbol( "_CSETF-RKF-SD-PROMPTER-TACTICS" );
    $sym19$RKF_SD_PROMPTER_ISG = makeSymbol( "RKF-SD-PROMPTER-ISG" );
    $sym20$_CSETF_RKF_SD_PROMPTER_ISG = makeSymbol( "_CSETF-RKF-SD-PROMPTER-ISG" );
    $sym21$RKF_SD_PROMPTER_PLIST = makeSymbol( "RKF-SD-PROMPTER-PLIST" );
    $sym22$_CSETF_RKF_SD_PROMPTER_PLIST = makeSymbol( "_CSETF-RKF-SD-PROMPTER-PLIST" );
    $kw23$SEED_TERM = makeKeyword( "SEED-TERM" );
    $kw24$MT = makeKeyword( "MT" );
    $kw25$USED_PROMPTS = makeKeyword( "USED-PROMPTS" );
    $kw26$UNUSED_PROMPTS = makeKeyword( "UNUSED-PROMPTS" );
    $kw27$TACTICS = makeKeyword( "TACTICS" );
    $kw28$ISG = makeKeyword( "ISG" );
    $kw29$PLIST = makeKeyword( "PLIST" );
    $str30$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw31$BEGIN = makeKeyword( "BEGIN" );
    $sym32$MAKE_RKF_SALIENT_DESCRIPTOR_PROMPTER = makeSymbol( "MAKE-RKF-SALIENT-DESCRIPTOR-PROMPTER" );
    $kw33$SLOT = makeKeyword( "SLOT" );
    $kw34$END = makeKeyword( "END" );
    $sym35$VISIT_DEFSTRUCT_OBJECT_RKF_SALIENT_DESCRIPTOR_PROMPTER_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-RKF-SALIENT-DESCRIPTOR-PROMPTER-METHOD" );
    $str36$_RKF_SD_PROMPTER__S__S___D_prompt = makeString( "<RKF-SD-PROMPTER ~S ~S (~D prompts)>" );
    $kw37$MEMOIZATION_STATE = makeKeyword( "MEMOIZATION-STATE" );
    $str38$Salient_Descriptor_Prompter_Lock = makeString( "Salient Descriptor Prompter Lock" );
    $kw39$LOCK = makeKeyword( "LOCK" );
    $kw40$UNKNOWN = makeKeyword( "UNKNOWN" );
    $kw41$NOT_FOUND = makeKeyword( "NOT-FOUND" );
    $sym42$RKF_SALIENT_DESCRIPTOR_PROMPT = makeSymbol( "RKF-SALIENT-DESCRIPTOR-PROMPT" );
    $sym43$RKF_SALIENT_DESCRIPTOR_PROMPT_P = makeSymbol( "RKF-SALIENT-DESCRIPTOR-PROMPT-P" );
    $list44 = ConsesLow.list( new SubLObject[] { makeSymbol( "ID" ), makeSymbol( "SUBPROMPTS" ), makeSymbol( "FORMULA" ), makeSymbol( "JUSTIFICATION" ), makeSymbol( "DEDUCIBLE-CNFS" ), makeSymbol( "EXAMPLES" ),
      makeSymbol( "SALIENT-PROPERTY-SENTENCE" ), makeSymbol( "PROMPTER" ), makeSymbol( "TACTIC" )
    } );
    $list45 = ConsesLow.list( new SubLObject[] { makeKeyword( "ID" ), makeKeyword( "SUBPROMPTS" ), makeKeyword( "FORMULA" ), makeKeyword( "JUSTIFICATION" ), makeKeyword( "DEDUCIBLE-CNFS" ), makeKeyword( "EXAMPLES" ),
      makeKeyword( "SALIENT-PROPERTY-SENTENCE" ), makeKeyword( "PROMPTER" ), makeKeyword( "TACTIC" )
    } );
    $list46 = ConsesLow.list( new SubLObject[] { makeSymbol( "RKF-SD-PROMPT-ID" ), makeSymbol( "RKF-SD-PROMPT-SUBPROMPTS" ), makeSymbol( "RKF-SD-PROMPT-FORMULA" ), makeSymbol( "RKF-SD-PROMPT-JUSTIFICATION" ), makeSymbol(
        "RKF-SD-PROMPT-DEDUCIBLE-CNFS" ), makeSymbol( "RKF-SD-PROMPT-EXAMPLES" ), makeSymbol( "RKF-SD-PROMPT-SALIENT-PROPERTY-SENTENCE" ), makeSymbol( "RKF-SD-PROMPT-PROMPTER" ), makeSymbol( "RKF-SD-PROMPT-TACTIC" )
    } );
    $list47 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-RKF-SD-PROMPT-ID" ), makeSymbol( "_CSETF-RKF-SD-PROMPT-SUBPROMPTS" ), makeSymbol( "_CSETF-RKF-SD-PROMPT-FORMULA" ), makeSymbol(
        "_CSETF-RKF-SD-PROMPT-JUSTIFICATION" ), makeSymbol( "_CSETF-RKF-SD-PROMPT-DEDUCIBLE-CNFS" ), makeSymbol( "_CSETF-RKF-SD-PROMPT-EXAMPLES" ), makeSymbol( "_CSETF-RKF-SD-PROMPT-SALIENT-PROPERTY-SENTENCE" ),
      makeSymbol( "_CSETF-RKF-SD-PROMPT-PROMPTER" ), makeSymbol( "_CSETF-RKF-SD-PROMPT-TACTIC" )
    } );
    $sym48$PRINT_RKF_SD_PROMPT = makeSymbol( "PRINT-RKF-SD-PROMPT" );
    $sym49$RKF_SALIENT_DESCRIPTOR_PROMPT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "RKF-SALIENT-DESCRIPTOR-PROMPT-PRINT-FUNCTION-TRAMPOLINE" );
    $list50 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "RKF-SALIENT-DESCRIPTOR-PROMPT-P" ) );
    $sym51$RKF_SD_PROMPT_ID = makeSymbol( "RKF-SD-PROMPT-ID" );
    $sym52$_CSETF_RKF_SD_PROMPT_ID = makeSymbol( "_CSETF-RKF-SD-PROMPT-ID" );
    $sym53$RKF_SD_PROMPT_SUBPROMPTS = makeSymbol( "RKF-SD-PROMPT-SUBPROMPTS" );
    $sym54$_CSETF_RKF_SD_PROMPT_SUBPROMPTS = makeSymbol( "_CSETF-RKF-SD-PROMPT-SUBPROMPTS" );
    $sym55$RKF_SD_PROMPT_FORMULA = makeSymbol( "RKF-SD-PROMPT-FORMULA" );
    $sym56$_CSETF_RKF_SD_PROMPT_FORMULA = makeSymbol( "_CSETF-RKF-SD-PROMPT-FORMULA" );
    $sym57$RKF_SD_PROMPT_JUSTIFICATION = makeSymbol( "RKF-SD-PROMPT-JUSTIFICATION" );
    $sym58$_CSETF_RKF_SD_PROMPT_JUSTIFICATION = makeSymbol( "_CSETF-RKF-SD-PROMPT-JUSTIFICATION" );
    $sym59$RKF_SD_PROMPT_DEDUCIBLE_CNFS = makeSymbol( "RKF-SD-PROMPT-DEDUCIBLE-CNFS" );
    $sym60$_CSETF_RKF_SD_PROMPT_DEDUCIBLE_CNFS = makeSymbol( "_CSETF-RKF-SD-PROMPT-DEDUCIBLE-CNFS" );
    $sym61$RKF_SD_PROMPT_EXAMPLES = makeSymbol( "RKF-SD-PROMPT-EXAMPLES" );
    $sym62$_CSETF_RKF_SD_PROMPT_EXAMPLES = makeSymbol( "_CSETF-RKF-SD-PROMPT-EXAMPLES" );
    $sym63$RKF_SD_PROMPT_SALIENT_PROPERTY_SENTENCE = makeSymbol( "RKF-SD-PROMPT-SALIENT-PROPERTY-SENTENCE" );
    $sym64$_CSETF_RKF_SD_PROMPT_SALIENT_PROPERTY_SENTENCE = makeSymbol( "_CSETF-RKF-SD-PROMPT-SALIENT-PROPERTY-SENTENCE" );
    $sym65$RKF_SD_PROMPT_PROMPTER = makeSymbol( "RKF-SD-PROMPT-PROMPTER" );
    $sym66$_CSETF_RKF_SD_PROMPT_PROMPTER = makeSymbol( "_CSETF-RKF-SD-PROMPT-PROMPTER" );
    $sym67$RKF_SD_PROMPT_TACTIC = makeSymbol( "RKF-SD-PROMPT-TACTIC" );
    $sym68$_CSETF_RKF_SD_PROMPT_TACTIC = makeSymbol( "_CSETF-RKF-SD-PROMPT-TACTIC" );
    $kw69$ID = makeKeyword( "ID" );
    $kw70$SUBPROMPTS = makeKeyword( "SUBPROMPTS" );
    $kw71$FORMULA = makeKeyword( "FORMULA" );
    $kw72$JUSTIFICATION = makeKeyword( "JUSTIFICATION" );
    $kw73$DEDUCIBLE_CNFS = makeKeyword( "DEDUCIBLE-CNFS" );
    $kw74$EXAMPLES = makeKeyword( "EXAMPLES" );
    $kw75$SALIENT_PROPERTY_SENTENCE = makeKeyword( "SALIENT-PROPERTY-SENTENCE" );
    $kw76$PROMPTER = makeKeyword( "PROMPTER" );
    $kw77$TACTIC = makeKeyword( "TACTIC" );
    $sym78$MAKE_RKF_SALIENT_DESCRIPTOR_PROMPT = makeSymbol( "MAKE-RKF-SALIENT-DESCRIPTOR-PROMPT" );
    $sym79$VISIT_DEFSTRUCT_OBJECT_RKF_SALIENT_DESCRIPTOR_PROMPT_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-RKF-SALIENT-DESCRIPTOR-PROMPT-METHOD" );
    $str80$_RKF_SD_PROMPT_Subprompts___S_ = makeString( "<RKF-SD-PROMPT Subprompts: ~S " );
    $str81$Formula___S_ = makeString( "Formula: ~S " );
    $str82$Deducible_CNFs___S_ = makeString( "Deducible CNFs: ~S>" );
    $kw83$CHOICE = makeKeyword( "CHOICE" );
    $kw84$SPECIFY = makeKeyword( "SPECIFY" );
    $kw85$CONFIRM = makeKeyword( "CONFIRM" );
    $sym86$RKF_SD_RULE_INFO_SCORE = makeSymbol( "RKF-SD-RULE-INFO-SCORE" );
    $sym87$RKF_SD_RULE_INFO_SCORE_P = makeSymbol( "RKF-SD-RULE-INFO-SCORE-P" );
    $list88 = ConsesLow.list( makeSymbol( "SEED-TERM-IN-POS-LITS?" ), makeSymbol( "SEED-TERM-IN-NEG-LITS?" ), makeSymbol( "VAR-COUNT" ), makeSymbol( "NEG-LIT-COUNT" ), makeSymbol( "POS-LIT-COUNT" ), makeSymbol(
        "POS-LIT-QUALITY-SCORE" ), makeSymbol( "MT-GENERALITY-SCORE" ), makeSymbol( "PLIST" ) );
    $list89 = ConsesLow.list( makeKeyword( "SEED-TERM-IN-POS-LITS?" ), makeKeyword( "SEED-TERM-IN-NEG-LITS?" ), makeKeyword( "VAR-COUNT" ), makeKeyword( "NEG-LIT-COUNT" ), makeKeyword( "POS-LIT-COUNT" ), makeKeyword(
        "POS-LIT-QUALITY-SCORE" ), makeKeyword( "MT-GENERALITY-SCORE" ), makeKeyword( "PLIST" ) );
    $list90 = ConsesLow.list( makeSymbol( "RKF-SD-RULE-INFO-SCORE-SEED-TERM-IN-POS-LITS?" ), makeSymbol( "RKF-SD-RULE-INFO-SCORE-SEED-TERM-IN-NEG-LITS?" ), makeSymbol( "RKF-SD-RULE-INFO-SCORE-VAR-COUNT" ), makeSymbol(
        "RKF-SD-RULE-INFO-SCORE-NEG-LIT-COUNT" ), makeSymbol( "RKF-SD-RULE-INFO-SCORE-POS-LIT-COUNT" ), makeSymbol( "RKF-SD-RULE-INFO-SCORE-POS-LIT-QUALITY-SCORE" ), makeSymbol(
            "RKF-SD-RULE-INFO-SCORE-MT-GENERALITY-SCORE" ), makeSymbol( "RKF-SD-RULE-INFO-SCORE-PLIST" ) );
    $list91 = ConsesLow.list( makeSymbol( "_CSETF-RKF-SD-RULE-INFO-SCORE-SEED-TERM-IN-POS-LITS?" ), makeSymbol( "_CSETF-RKF-SD-RULE-INFO-SCORE-SEED-TERM-IN-NEG-LITS?" ), makeSymbol(
        "_CSETF-RKF-SD-RULE-INFO-SCORE-VAR-COUNT" ), makeSymbol( "_CSETF-RKF-SD-RULE-INFO-SCORE-NEG-LIT-COUNT" ), makeSymbol( "_CSETF-RKF-SD-RULE-INFO-SCORE-POS-LIT-COUNT" ), makeSymbol(
            "_CSETF-RKF-SD-RULE-INFO-SCORE-POS-LIT-QUALITY-SCORE" ), makeSymbol( "_CSETF-RKF-SD-RULE-INFO-SCORE-MT-GENERALITY-SCORE" ), makeSymbol( "_CSETF-RKF-SD-RULE-INFO-SCORE-PLIST" ) );
    $sym92$PRINT_RKF_SD_RULE_INFO_SCORE = makeSymbol( "PRINT-RKF-SD-RULE-INFO-SCORE" );
    $sym93$RKF_SD_RULE_INFO_SCORE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "RKF-SD-RULE-INFO-SCORE-PRINT-FUNCTION-TRAMPOLINE" );
    $list94 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "RKF-SD-RULE-INFO-SCORE-P" ) );
    $sym95$RKF_SD_RULE_INFO_SCORE_SEED_TERM_IN_POS_LITS_ = makeSymbol( "RKF-SD-RULE-INFO-SCORE-SEED-TERM-IN-POS-LITS?" );
    $sym96$_CSETF_RKF_SD_RULE_INFO_SCORE_SEED_TERM_IN_POS_LITS_ = makeSymbol( "_CSETF-RKF-SD-RULE-INFO-SCORE-SEED-TERM-IN-POS-LITS?" );
    $sym97$RKF_SD_RULE_INFO_SCORE_SEED_TERM_IN_NEG_LITS_ = makeSymbol( "RKF-SD-RULE-INFO-SCORE-SEED-TERM-IN-NEG-LITS?" );
    $sym98$_CSETF_RKF_SD_RULE_INFO_SCORE_SEED_TERM_IN_NEG_LITS_ = makeSymbol( "_CSETF-RKF-SD-RULE-INFO-SCORE-SEED-TERM-IN-NEG-LITS?" );
    $sym99$RKF_SD_RULE_INFO_SCORE_VAR_COUNT = makeSymbol( "RKF-SD-RULE-INFO-SCORE-VAR-COUNT" );
    $sym100$_CSETF_RKF_SD_RULE_INFO_SCORE_VAR_COUNT = makeSymbol( "_CSETF-RKF-SD-RULE-INFO-SCORE-VAR-COUNT" );
    $sym101$RKF_SD_RULE_INFO_SCORE_NEG_LIT_COUNT = makeSymbol( "RKF-SD-RULE-INFO-SCORE-NEG-LIT-COUNT" );
    $sym102$_CSETF_RKF_SD_RULE_INFO_SCORE_NEG_LIT_COUNT = makeSymbol( "_CSETF-RKF-SD-RULE-INFO-SCORE-NEG-LIT-COUNT" );
    $sym103$RKF_SD_RULE_INFO_SCORE_POS_LIT_COUNT = makeSymbol( "RKF-SD-RULE-INFO-SCORE-POS-LIT-COUNT" );
    $sym104$_CSETF_RKF_SD_RULE_INFO_SCORE_POS_LIT_COUNT = makeSymbol( "_CSETF-RKF-SD-RULE-INFO-SCORE-POS-LIT-COUNT" );
    $sym105$RKF_SD_RULE_INFO_SCORE_POS_LIT_QUALITY_SCORE = makeSymbol( "RKF-SD-RULE-INFO-SCORE-POS-LIT-QUALITY-SCORE" );
    $sym106$_CSETF_RKF_SD_RULE_INFO_SCORE_POS_LIT_QUALITY_SCORE = makeSymbol( "_CSETF-RKF-SD-RULE-INFO-SCORE-POS-LIT-QUALITY-SCORE" );
    $sym107$RKF_SD_RULE_INFO_SCORE_MT_GENERALITY_SCORE = makeSymbol( "RKF-SD-RULE-INFO-SCORE-MT-GENERALITY-SCORE" );
    $sym108$_CSETF_RKF_SD_RULE_INFO_SCORE_MT_GENERALITY_SCORE = makeSymbol( "_CSETF-RKF-SD-RULE-INFO-SCORE-MT-GENERALITY-SCORE" );
    $sym109$RKF_SD_RULE_INFO_SCORE_PLIST = makeSymbol( "RKF-SD-RULE-INFO-SCORE-PLIST" );
    $sym110$_CSETF_RKF_SD_RULE_INFO_SCORE_PLIST = makeSymbol( "_CSETF-RKF-SD-RULE-INFO-SCORE-PLIST" );
    $kw111$SEED_TERM_IN_POS_LITS_ = makeKeyword( "SEED-TERM-IN-POS-LITS?" );
    $kw112$SEED_TERM_IN_NEG_LITS_ = makeKeyword( "SEED-TERM-IN-NEG-LITS?" );
    $kw113$VAR_COUNT = makeKeyword( "VAR-COUNT" );
    $kw114$NEG_LIT_COUNT = makeKeyword( "NEG-LIT-COUNT" );
    $kw115$POS_LIT_COUNT = makeKeyword( "POS-LIT-COUNT" );
    $kw116$POS_LIT_QUALITY_SCORE = makeKeyword( "POS-LIT-QUALITY-SCORE" );
    $kw117$MT_GENERALITY_SCORE = makeKeyword( "MT-GENERALITY-SCORE" );
    $sym118$MAKE_RKF_SD_RULE_INFO_SCORE = makeSymbol( "MAKE-RKF-SD-RULE-INFO-SCORE" );
    $sym119$VISIT_DEFSTRUCT_OBJECT_RKF_SD_RULE_INFO_SCORE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-RKF-SD-RULE-INFO-SCORE-METHOD" );
    $str120$_RKF_SD_SCORE = makeString( "<RKF-SD-SCORE" );
    $str121$_neg__S = makeString( " neg:~S" );
    $str122$_pos__S = makeString( " pos:~S" );
    $str123$_vars__S = makeString( " vars:~S" );
    $str124$_nlc__S = makeString( " nlc:~S" );
    $str125$_plc__S = makeString( " plc:~S" );
    $str126$_plq__S = makeString( " plq:~S" );
    $str127$_mtg__S = makeString( " mtg:~S" );
    $str128$_ = makeString( ">" );
    $sym129$RKF_SD_EXAMPLE = makeSymbol( "RKF-SD-EXAMPLE" );
    $sym130$RKF_SD_EXAMPLE_P = makeSymbol( "RKF-SD-EXAMPLE-P" );
    $list131 = ConsesLow.list( makeSymbol( "TYPE" ), makeSymbol( "TERM" ), makeSymbol( "SUPPORTS" ), makeSymbol( "FOCUS-TERM-ANALOG" ) );
    $list132 = ConsesLow.list( makeKeyword( "TYPE" ), makeKeyword( "TERM" ), makeKeyword( "SUPPORTS" ), makeKeyword( "FOCUS-TERM-ANALOG" ) );
    $list133 = ConsesLow.list( makeSymbol( "RKF-SD-EXAMPLE-TYPE" ), makeSymbol( "RKF-SD-EXAMPLE-TERM" ), makeSymbol( "RKF-SD-EXAMPLE-SUPPORTS" ), makeSymbol( "RKF-SD-EXAMPLE-FOCUS-TERM-ANALOG" ) );
    $list134 = ConsesLow.list( makeSymbol( "_CSETF-RKF-SD-EXAMPLE-TYPE" ), makeSymbol( "_CSETF-RKF-SD-EXAMPLE-TERM" ), makeSymbol( "_CSETF-RKF-SD-EXAMPLE-SUPPORTS" ), makeSymbol(
        "_CSETF-RKF-SD-EXAMPLE-FOCUS-TERM-ANALOG" ) );
    $sym135$PRINT_RKF_SD_EXAMPLE = makeSymbol( "PRINT-RKF-SD-EXAMPLE" );
    $sym136$RKF_SD_EXAMPLE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "RKF-SD-EXAMPLE-PRINT-FUNCTION-TRAMPOLINE" );
    $list137 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "RKF-SD-EXAMPLE-P" ) );
    $sym138$RKF_SD_EXAMPLE_TYPE = makeSymbol( "RKF-SD-EXAMPLE-TYPE" );
    $sym139$_CSETF_RKF_SD_EXAMPLE_TYPE = makeSymbol( "_CSETF-RKF-SD-EXAMPLE-TYPE" );
    $sym140$RKF_SD_EXAMPLE_TERM = makeSymbol( "RKF-SD-EXAMPLE-TERM" );
    $sym141$_CSETF_RKF_SD_EXAMPLE_TERM = makeSymbol( "_CSETF-RKF-SD-EXAMPLE-TERM" );
    $sym142$RKF_SD_EXAMPLE_SUPPORTS = makeSymbol( "RKF-SD-EXAMPLE-SUPPORTS" );
    $sym143$_CSETF_RKF_SD_EXAMPLE_SUPPORTS = makeSymbol( "_CSETF-RKF-SD-EXAMPLE-SUPPORTS" );
    $sym144$RKF_SD_EXAMPLE_FOCUS_TERM_ANALOG = makeSymbol( "RKF-SD-EXAMPLE-FOCUS-TERM-ANALOG" );
    $sym145$_CSETF_RKF_SD_EXAMPLE_FOCUS_TERM_ANALOG = makeSymbol( "_CSETF-RKF-SD-EXAMPLE-FOCUS-TERM-ANALOG" );
    $kw146$TYPE = makeKeyword( "TYPE" );
    $kw147$TERM = makeKeyword( "TERM" );
    $kw148$SUPPORTS = makeKeyword( "SUPPORTS" );
    $kw149$FOCUS_TERM_ANALOG = makeKeyword( "FOCUS-TERM-ANALOG" );
    $sym150$MAKE_RKF_SD_EXAMPLE = makeSymbol( "MAKE-RKF-SD-EXAMPLE" );
    $sym151$VISIT_DEFSTRUCT_OBJECT_RKF_SD_EXAMPLE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-RKF-SD-EXAMPLE-METHOD" );
    $list152 = ConsesLow.list( makeKeyword( "PRECEDENT" ), makeKeyword( "CONSTRAINT-MATCHER" ) );
    $sym153$RKF_SD_EXAMPLE_TYPE_P = makeSymbol( "RKF-SD-EXAMPLE-TYPE-P" );
    $list154 = ConsesLow.list( ConsesLow.list( makeSymbol( "TYPE" ), makeSymbol( "TERM" ), makeSymbol( "SUPPORTS" ), makeSymbol( "FOCUS-TERM-ANALOG" ) ), makeSymbol( "EXAMPLE" ), makeSymbol( "&BODY" ), makeSymbol(
        "BODY" ) );
    $sym155$CLET = makeSymbol( "CLET" );
    $str156$_RKF_SD__A_EXAMPLE__S = makeString( "<RKF-SD-~A-EXAMPLE ~S" );
    $kw157$PRECEDENT = makeKeyword( "PRECEDENT" );
    $str158$__S = makeString( " ~S" );
  }

  public static final class $rkf_salient_descriptor_prompter_native
      extends
        SubLStructNative
  {
    public SubLObject $seed_term;
    public SubLObject $mt;
    public SubLObject $used_prompts;
    public SubLObject $unused_prompts;
    public SubLObject $tactics;
    public SubLObject $isg;
    public SubLObject $plist;
    private static final SubLStructDeclNative structDecl;

    public $rkf_salient_descriptor_prompter_native()
    {
      this.$seed_term = CommonSymbols.NIL;
      this.$mt = CommonSymbols.NIL;
      this.$used_prompts = CommonSymbols.NIL;
      this.$unused_prompts = CommonSymbols.NIL;
      this.$tactics = CommonSymbols.NIL;
      this.$isg = CommonSymbols.NIL;
      this.$plist = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $rkf_salient_descriptor_prompter_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$seed_term;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$mt;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$used_prompts;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$unused_prompts;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$tactics;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$isg;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$plist;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$seed_term = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$mt = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$used_prompts = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$unused_prompts = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$tactics = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$isg = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$plist = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $rkf_salient_descriptor_prompter_native.class, $sym0$RKF_SALIENT_DESCRIPTOR_PROMPTER, $sym1$RKF_SALIENT_DESCRIPTOR_PROMPTER_P, $list2, $list3, new String[] {
        "$seed_term", "$mt", "$used_prompts", "$unused_prompts", "$tactics", "$isg", "$plist"
      }, $list4, $list5, $sym6$PRINT_RKF_SD_PROMPTER );
    }
  }

  public static final class $rkf_salient_descriptor_prompter_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $rkf_salient_descriptor_prompter_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "RKF-SALIENT-DESCRIPTOR-PROMPTER-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return rkf_salient_descriptor_prompter_p( arg1 );
    }
  }

  public static final class $rkf_salient_descriptor_prompt_native
      extends
        SubLStructNative
  {
    public SubLObject $id;
    public SubLObject $subprompts;
    public SubLObject $formula;
    public SubLObject $justification;
    public SubLObject $deducible_cnfs;
    public SubLObject $examples;
    public SubLObject $salient_property_sentence;
    public SubLObject $prompter;
    public SubLObject $tactic;
    private static final SubLStructDeclNative structDecl;

    public $rkf_salient_descriptor_prompt_native()
    {
      this.$id = CommonSymbols.NIL;
      this.$subprompts = CommonSymbols.NIL;
      this.$formula = CommonSymbols.NIL;
      this.$justification = CommonSymbols.NIL;
      this.$deducible_cnfs = CommonSymbols.NIL;
      this.$examples = CommonSymbols.NIL;
      this.$salient_property_sentence = CommonSymbols.NIL;
      this.$prompter = CommonSymbols.NIL;
      this.$tactic = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $rkf_salient_descriptor_prompt_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$id;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$subprompts;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$formula;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$justification;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$deducible_cnfs;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$examples;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$salient_property_sentence;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$prompter;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$tactic;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$id = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$subprompts = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$formula = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$justification = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$deducible_cnfs = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$examples = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$salient_property_sentence = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$prompter = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$tactic = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $rkf_salient_descriptor_prompt_native.class, $sym42$RKF_SALIENT_DESCRIPTOR_PROMPT, $sym43$RKF_SALIENT_DESCRIPTOR_PROMPT_P, $list44, $list45, new String[] { "$id",
        "$subprompts", "$formula", "$justification", "$deducible_cnfs", "$examples", "$salient_property_sentence", "$prompter", "$tactic"
      }, $list46, $list47, $sym48$PRINT_RKF_SD_PROMPT );
    }
  }

  public static final class $rkf_salient_descriptor_prompt_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $rkf_salient_descriptor_prompt_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "RKF-SALIENT-DESCRIPTOR-PROMPT-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return rkf_salient_descriptor_prompt_p( arg1 );
    }
  }

  public static final class $rkf_sd_rule_info_score_native
      extends
        SubLStructNative
  {
    public SubLObject $seed_term_in_pos_litsP;
    public SubLObject $seed_term_in_neg_litsP;
    public SubLObject $var_count;
    public SubLObject $neg_lit_count;
    public SubLObject $pos_lit_count;
    public SubLObject $pos_lit_quality_score;
    public SubLObject $mt_generality_score;
    public SubLObject $plist;
    private static final SubLStructDeclNative structDecl;

    public $rkf_sd_rule_info_score_native()
    {
      this.$seed_term_in_pos_litsP = CommonSymbols.NIL;
      this.$seed_term_in_neg_litsP = CommonSymbols.NIL;
      this.$var_count = CommonSymbols.NIL;
      this.$neg_lit_count = CommonSymbols.NIL;
      this.$pos_lit_count = CommonSymbols.NIL;
      this.$pos_lit_quality_score = CommonSymbols.NIL;
      this.$mt_generality_score = CommonSymbols.NIL;
      this.$plist = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $rkf_sd_rule_info_score_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$seed_term_in_pos_litsP;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$seed_term_in_neg_litsP;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$var_count;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$neg_lit_count;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$pos_lit_count;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$pos_lit_quality_score;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$mt_generality_score;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$plist;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$seed_term_in_pos_litsP = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$seed_term_in_neg_litsP = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$var_count = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$neg_lit_count = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$pos_lit_count = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$pos_lit_quality_score = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$mt_generality_score = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$plist = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $rkf_sd_rule_info_score_native.class, $sym86$RKF_SD_RULE_INFO_SCORE, $sym87$RKF_SD_RULE_INFO_SCORE_P, $list88, $list89, new String[] { "$seed_term_in_pos_litsP",
        "$seed_term_in_neg_litsP", "$var_count", "$neg_lit_count", "$pos_lit_count", "$pos_lit_quality_score", "$mt_generality_score", "$plist"
      }, $list90, $list91, $sym92$PRINT_RKF_SD_RULE_INFO_SCORE );
    }
  }

  public static final class $rkf_sd_rule_info_score_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $rkf_sd_rule_info_score_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "RKF-SD-RULE-INFO-SCORE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return rkf_sd_rule_info_score_p( arg1 );
    }
  }

  public static final class $rkf_sd_example_native
      extends
        SubLStructNative
  {
    public SubLObject $type;
    public SubLObject $term;
    public SubLObject $supports;
    public SubLObject $focus_term_analog;
    private static final SubLStructDeclNative structDecl;

    public $rkf_sd_example_native()
    {
      this.$type = CommonSymbols.NIL;
      this.$term = CommonSymbols.NIL;
      this.$supports = CommonSymbols.NIL;
      this.$focus_term_analog = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $rkf_sd_example_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$type;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$term;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$supports;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$focus_term_analog;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$type = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$term = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$supports = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$focus_term_analog = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $rkf_sd_example_native.class, $sym129$RKF_SD_EXAMPLE, $sym130$RKF_SD_EXAMPLE_P, $list131, $list132, new String[] { "$type", "$term", "$supports", "$focus_term_analog"
      }, $list133, $list134, $sym135$PRINT_RKF_SD_EXAMPLE );
    }
  }

  public static final class $rkf_sd_example_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $rkf_sd_example_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "RKF-SD-EXAMPLE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return rkf_sd_example_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 295 ms
 * 
 */