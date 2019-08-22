package com.cyc.cycjava.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;

import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_hl_supports_high
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.kb_hl_supports_high";
  public static final String myFingerPrint = "a2892ef968c17916d346dbdb58376b22508e749fb7d7a4a2c8432b2d184a3bbe";
  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 8865L)
  public static SubLSymbol $unreify_kb_hl_supportsP$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 11485L)
  public static SubLSymbol $kb_hl_support_dump_id_table$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 29258L)
  public static SubLSymbol $tms_kb_hl_support_queue$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 33182L)
  public static SubLSymbol $debug_bootstrap_kb_hl_supports_seconds$;
  private static final SubLList $list0;
  private static final SubLList $list1;
  private static final SubLSymbol $kw2$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw3$DONE;
  private static final SubLSymbol $sym4$DO_LIST;
  private static final SubLSymbol $sym5$KB_KB_HL_SUPPORT_ARGUMENTS;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$DO_SET_CONTENTS;
  private static final SubLSymbol $sym8$KB_KB_HL_SUPPORT_DEPENDENTS;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$KB_HL_SUPPORT_JUSTIFICATION;
  private static final SubLList $list11;
  private static final SubLList $list12;
  private static final SubLSymbol $kw13$NUM;
  private static final SubLSymbol $kw14$PROGRESS_MESSAGE;
  private static final SubLString $str15$mapping_kb_hl_supports_for_sweep;
  private static final SubLSymbol $sym16$PIF;
  private static final SubLSymbol $sym17$POSITIVE_INTEGER_P;
  private static final SubLSymbol $sym18$PROGRESS_CSOME;
  private static final SubLSymbol $sym19$KB_HL_SUPPORTS_AROUND;
  private static final SubLList $list20;
  private static final SubLSymbol $sym21$DO_KB_HL_SUPPORTS;
  private static final SubLSymbol $sym22$KB_HL_SUPPORT_P;
  private static final SubLString $str23$Eliminating_invalid_KB_HL_support;
  private static final SubLSymbol $sym24$STRINGP;
  private static final SubLSymbol $kw25$SKIP;
  private static final SubLSymbol $sym26$VALID_DEDUCTION_;
  private static final SubLString $str27$Eliminating_KB_HL_supports_with_i;
  private static final SubLSymbol $sym28$POSSIBLY_REIFY_HL_SUPPORT;
  private static final SubLSymbol $sym29$UNREIFY_KB_HL_SUPPORT;
  private static final SubLSymbol $sym30$TRUE;
  private static final SubLInteger $int31$500;
  private static final SubLSymbol $sym32$NON_NEGATIVE_INTEGER_P;
  private static final SubLInteger $int33$100;
  private static final SubLSymbol $sym34$FIND_KB_HL_SUPPORT_BY_ID;
  private static final SubLSymbol $sym35$CLET;
  private static final SubLList $list36;
  private static final SubLSymbol $sym37$SUPPORT_P;
  private static final SubLString $str38$Verifying_KB_HL_support_indexing;
  private static final SubLString $str39$Searching_for_circular_KB_HL_supp;
  private static final SubLString $str40$Searching_for_duplicate_KB_HL_sup;
  private static final SubLSymbol $sym41$_;
  private static final SubLSymbol $sym42$KB_HL_SUPPORT_ID;
  private static final SubLString $str43$Searching_for_KB_HL_supports_with;
  private static final SubLString $str44$Searching_for_KB_HL_supports_with;
  private static final SubLString $str45$Searching_for_KB_HL_supports_with;
  private static final SubLString $str46$Searching_for_KB_HL_supports_with;
  private static final SubLSymbol $sym47$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLString $str48$Verifying_KB_HL_supports;
  private static final SubLString $str49$__Error_during_KB_HL_support_veri;
  private static final SubLString $str50$__Error_during_indexing_verificat;
  private static final SubLString $str51$__The_following_KB_HL_supports_we;
  private static final SubLString $str52$__s__s__;
  private static final SubLString $str53$___s_KB_HL_supports_are_not_finda;
  private static final SubLString $str54$__Error_during_non_circularity_ve;
  private static final SubLString $str55$__The_following_KB_HL_supports_ar;
  private static final SubLString $str56$___s_KB_HL_supports_are_circular_;
  private static final SubLString $str57$__Error_during_uniqueness_verific;
  private static final SubLString $str58$__The_following_KB_HL_supports_ha;
  private static final SubLString $str59$___s_KB_HL_supports_have_duplicat;
  private static final SubLString $str60$__Error_during_dependent_verifica;
  private static final SubLString $str61$__The_following_KB_HL_supports_ha;
  private static final SubLString $str62$___s_KB_HL_supports_have_invalid_;
  private static final SubLString $str63$__Error_during_argument_verificat;
  private static final SubLString $str64$__The_following_KB_HL_supports_ha;
  private static final SubLString $str65$___s_KB_HL_supports_have_invalid_;
  private static final SubLString $str66$__Error_during_HL_support_verific;
  private static final SubLString $str67$__The_following_KB_HL_supports_ha;
  private static final SubLString $str68$___s_KB_HL_supports_have_invalid_;
  private static final SubLString $str69$__Error_during_KB_HL_support_back;
  private static final SubLString $str70$__The_following_KB_HL_supports_ha;
  private static final SubLString $str71$___s_KB_HL_supports_have_missing_;
  private static final SubLSymbol $sym72$ENQUEUEING_KB_HL_SUPPORTS_FOR_TMS_;
  private static final SubLSymbol $sym73$WITH_KB_HL_SUPPORT_REJUSTIFICATION;
  private static final SubLList $list74;
  private static final SubLSymbol $sym75$PROGN;
  private static final SubLList $list76;
  private static final SubLList $list77;
  private static final SubLSymbol $sym78$PROCESS_TMS_KB_HL_SUPPORT_QUEUE;
  private static final SubLSymbol $sym79$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__;
  private static final SubLList $list80;
  private static final SubLSymbol $sym81$CSETQ;
  private static final SubLString $str82$_A;
  private static final SubLSymbol $kw83$UNJUSTIFIABLE;
  private static final SubLSymbol $sym84$TMS_FORT_TO_KILL_;
  private static final SubLString $str85$Bootstrapping_KB_HL_supports;
  private static final SubLString $str86$Slow_reification_of_;
  private static final SubLString $str87$Could_not_create_KB_HL_support_fo;
  private static final SubLString $str88$Created_invalid_KB_HL_support_for;

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 937L)
  public static SubLObject do_kb_hl_support_arguments(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject argument_var = NIL;
    SubLObject kb_hl_support = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    argument_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    kb_hl_support = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list0 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list0 );
      if( NIL == conses_high.member( current_$1, $list1, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw3$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym4$DO_LIST, ConsesLow.list( argument_var, ConsesLow.list( $sym5$KB_KB_HL_SUPPORT_ARGUMENTS, kb_hl_support ), $kw3$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 1168L)
  public static SubLObject do_kb_hl_support_dependents(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject dependent_var = NIL;
    SubLObject kb_hl_support = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    dependent_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    kb_hl_support = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list6 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list6 );
      if( NIL == conses_high.member( current_$2, $list1, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list6 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw3$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym7$DO_SET_CONTENTS, ConsesLow.list( dependent_var, ConsesLow.list( $sym8$KB_KB_HL_SUPPORT_DEPENDENTS, kb_hl_support ), $kw3$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 1379L)
  public static SubLObject do_kb_hl_support_supports(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject support_var = NIL;
    SubLObject kb_hl_support = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    support_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    kb_hl_support = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$3 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list9 );
      current_$3 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list9 );
      if( NIL == conses_high.member( current_$3, $list1, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$3 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list9 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw3$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym4$DO_LIST, ConsesLow.list( support_var, ConsesLow.list( $sym10$KB_HL_SUPPORT_JUSTIFICATION, kb_hl_support ), $kw3$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 1576L)
  public static SubLObject do_recent_kb_hl_supports(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list11 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list11 );
    var = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$4 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list11 );
      current_$4 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list11 );
      if( NIL == conses_high.member( current_$4, $list12, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$4 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list11 );
    }
    final SubLObject num_tail = cdestructuring_bind.property_list_member( $kw13$NUM, current );
    final SubLObject num = ( NIL != num_tail ) ? conses_high.cadr( num_tail ) : NIL;
    final SubLObject progress_message_tail = cdestructuring_bind.property_list_member( $kw14$PROGRESS_MESSAGE, current );
    final SubLObject progress_message = ( NIL != progress_message_tail ) ? conses_high.cadr( progress_message_tail ) : $str15$mapping_kb_hl_supports_for_sweep;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw3$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym16$PIF, ConsesLow.list( $sym17$POSITIVE_INTEGER_P, num ), ConsesLow.listS( $sym18$PROGRESS_CSOME, ConsesLow.list( var, ConsesLow.list( $sym19$KB_HL_SUPPORTS_AROUND, $list20, num, num ),
        progress_message, done ), ConsesLow.append( body, NIL ) ), ConsesLow.listS( $sym21$DO_KB_HL_SUPPORTS, ConsesLow.list( var, $kw14$PROGRESS_MESSAGE, progress_message, $kw3$DONE, done ), ConsesLow.append( body,
            NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 2199L)
  public static SubLObject create_kb_hl_support(final SubLObject hl_support, final SubLObject justification)
  {
    return kb_hl_supports_interface.kb_create_kb_hl_support( hl_support, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 2409L)
  public static SubLObject find_kb_hl_support(final SubLObject hl_support)
  {
    return kb_hl_supports_interface.kb_lookup_kb_hl_support( hl_support );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 2503L)
  public static SubLObject find_kb_hl_supports_mentioning_term(final SubLObject v_term)
  {
    return kb_hl_supports_interface.kb_lookup_kb_hl_supports_mentioning_term( v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 2619L)
  public static SubLObject find_or_create_kb_hl_support(final SubLObject hl_support, final SubLObject justification)
  {
    SubLObject kb_hl_support = find_kb_hl_support( hl_support );
    if( NIL == kb_hl_support )
    {
      kb_hl_support = create_kb_hl_support( hl_support, justification );
    }
    return kb_hl_support;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 2963L)
  public static SubLObject find_or_possibly_create_kb_hl_support(final SubLObject hl_support)
  {
    SubLObject kb_hl_support = find_kb_hl_support( hl_support );
    if( NIL == kb_hl_support )
    {
      kb_hl_support = possibly_create_kb_hl_support( hl_support );
    }
    return kb_hl_support;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 3213L)
  public static SubLObject possibly_create_kb_hl_support(final SubLObject hl_support)
  {
    final SubLObject justification = kb_hl_support_handles.hl_justify_for_kb_hl_support( hl_support );
    SubLObject kb_hl_support = NIL;
    if( NIL != arguments.non_empty_hl_justification_p( justification ) )
    {
      kb_hl_support = kb_hl_supports_interface.kb_create_kb_hl_support( hl_support, justification );
    }
    return kb_hl_support;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 3518L)
  public static SubLObject kb_hl_support_hl_support(final SubLObject kb_hl_support)
  {
    final SubLObject argument = kb_hl_supports_interface.kb_kb_hl_support_argument( kb_hl_support );
    SubLObject hl_support = NIL;
    if( NIL != deduction_handles.deduction_p( argument ) )
    {
      hl_support = deductions_high.deduction_supported_object( argument );
    }
    else if( NIL != arguments.hl_support_p( argument ) )
    {
      hl_support = argument;
    }
    return hl_support;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 3864L)
  public static SubLObject kb_hl_support_justification(final SubLObject kb_hl_support)
  {
    final SubLObject argument = kb_hl_supports_interface.kb_kb_hl_support_argument( kb_hl_support );
    SubLObject justification = NIL;
    if( NIL != deduction_handles.deduction_p( argument ) )
    {
      justification = deductions_high.deduction_supports( argument );
    }
    return justification;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 4125L)
  public static SubLObject kb_hl_support_module(final SubLObject kb_hl_support)
  {
    final SubLObject hl_support = kb_hl_support_hl_support( kb_hl_support );
    return ( NIL != arguments.hl_support_p( hl_support ) ) ? arguments.hl_support_module( hl_support ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 4323L)
  public static SubLObject kb_hl_support_sentence(final SubLObject kb_hl_support)
  {
    final SubLObject hl_support = kb_hl_support_hl_support( kb_hl_support );
    return ( NIL != arguments.hl_support_p( hl_support ) ) ? arguments.hl_support_sentence( hl_support ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 4525L)
  public static SubLObject kb_hl_support_mt(final SubLObject kb_hl_support)
  {
    final SubLObject hl_support = kb_hl_support_hl_support( kb_hl_support );
    return ( NIL != arguments.hl_support_p( hl_support ) ) ? arguments.hl_support_mt( hl_support ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 4715L)
  public static SubLObject kb_hl_support_tv(final SubLObject kb_hl_support)
  {
    final SubLObject hl_support = kb_hl_support_hl_support( kb_hl_support );
    return ( NIL != arguments.hl_support_p( hl_support ) ) ? arguments.hl_support_tv( hl_support ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 4905L)
  public static SubLObject kb_hl_support_el_sentence(final SubLObject kb_hl_support)
  {
    return cycl_utilities.hl_to_el( kb_hl_support_sentence( kb_hl_support ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 5023L)
  public static SubLObject kb_hl_support_ist_sentence(final SubLObject kb_hl_support)
  {
    final SubLObject sentence = kb_hl_support_sentence( kb_hl_support );
    return ( NIL != el_utilities.ist_sentence_p( sentence, UNPROVIDED ) ) ? sentence : el_utilities.make_ist_sentence( kb_hl_support_mt( kb_hl_support ), sentence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 5271L)
  public static SubLObject kb_hl_support_el_ist_sentence(final SubLObject kb_hl_support)
  {
    final SubLObject sentence = kb_hl_support_el_sentence( kb_hl_support );
    return ( NIL != el_utilities.ist_sentence_p( sentence, UNPROVIDED ) ) ? sentence : el_utilities.make_ist_sentence( kb_hl_support_mt( kb_hl_support ), sentence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 5525L)
  public static SubLObject kb_hl_support_elmt(final SubLObject kb_hl_support)
  {
    return cycl_utilities.hl_to_el( kb_hl_support_mt( kb_hl_support ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 5629L)
  public static SubLObject kb_hl_support_cons(final SubLObject kb_hl_support)
  {
    return el_utilities.elf_to_list( kb_hl_support_sentence( kb_hl_support ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 5742L)
  public static SubLObject kb_hl_support_justification_size(final SubLObject kb_hl_support)
  {
    assert NIL != kb_hl_support_handles.kb_hl_support_p( kb_hl_support ) : kb_hl_support;
    final SubLObject deduction = kb_hl_supports_interface.kb_kb_hl_support_argument( kb_hl_support );
    if( NIL != deduction_handles.deduction_p( deduction ) )
    {
      return Sequences.length( deductions_high.deduction_supports( deduction ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 6094L)
  public static SubLObject kb_hl_support_uselessP(final SubLObject kb_hl_support)
  {
    return makeBoolean( NIL == kb_hl_supports_low.kb_hl_support_has_dependentsP( kb_hl_support ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 6252L)
  public static SubLObject kb_hl_support_unjustifiedP(final SubLObject kb_hl_support)
  {
    final SubLObject argument = kb_hl_supports_interface.kb_kb_hl_support_argument( kb_hl_support );
    return makeBoolean( NIL == deduction_handles.valid_deductionP( argument, T ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 6426L)
  public static SubLObject should_remove_kb_hl_supportP(final SubLObject kb_hl_support)
  {
    return makeBoolean( NIL != kb_hl_support_unjustifiedP( kb_hl_support ) || NIL != kb_hl_support_uselessP( kb_hl_support ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 6599L)
  public static SubLObject possibly_remove_kb_hl_support(final SubLObject kb_hl_support)
  {
    SubLObject removedP = NIL;
    if( NIL != should_remove_kb_hl_supportP( kb_hl_support ) )
    {
      kb_hl_supports_interface.kb_remove_kb_hl_support( kb_hl_support );
      removedP = T;
    }
    return removedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 6832L)
  public static SubLObject eliminate_kb_hl_supports_invalid_dependents(SubLObject robustP)
  {
    if( robustP == UNPROVIDED )
    {
      robustP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject removed_countP = ZERO_INTEGER;
    final SubLObject idx = kb_hl_support_handles.do_kb_hl_supports_table();
    final SubLObject mess = $str23$Eliminating_invalid_KB_HL_support;
    final SubLObject total = id_index.id_index_count( idx );
    SubLObject sofar = ZERO_INTEGER;
    assert NIL != Types.stringp( mess ) : mess;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( mess );
        final SubLObject idx_$5 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$5, $kw25$SKIP ) )
        {
          final SubLObject idx_$6 = idx_$5;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$6, $kw25$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$6 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject s_id;
            SubLObject s_handle;
            SubLObject kb_hl_support;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              s_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              s_handle = Vectors.aref( vector_var, s_id );
              if( NIL == id_index.id_index_tombstone_p( s_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw25$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( s_handle ) )
                {
                  s_handle = $kw25$SKIP;
                }
                kb_hl_support = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair( s_id, s_handle );
                removed_countP = Numbers.add( removed_countP, eliminate_kb_hl_support_invalid_dependents( kb_hl_support, robustP ) );
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$7 = idx_$5;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$7 ) || NIL == id_index.id_index_skip_tombstones_p( $kw25$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$7 );
            SubLObject s_id2 = id_index.id_index_sparse_id_threshold( idx_$7 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$7 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw25$SKIP ) ) ? NIL : $kw25$SKIP;
            while ( s_id2.numL( end_id ))
            {
              final SubLObject s_handle2 = Hashtables.gethash_without_values( s_id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw25$SKIP ) || NIL == id_index.id_index_tombstone_p( s_handle2 ) )
              {
                final SubLObject kb_hl_support2 = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair( s_id2, s_handle2 );
                removed_countP = Numbers.add( removed_countP, eliminate_kb_hl_support_invalid_dependents( kb_hl_support2, robustP ) );
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
              s_id2 = Numbers.add( s_id2, ONE_INTEGER );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$8, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return removed_countP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 7229L)
  public static SubLObject eliminate_kb_hl_support_invalid_dependents(final SubLObject kb_hl_support, SubLObject robustP)
  {
    if( robustP == UNPROVIDED )
    {
      robustP = NIL;
    }
    final SubLObject dependents = kb_hl_supports_interface.kb_kb_hl_support_dependents( kb_hl_support );
    final SubLObject count = list_utilities.count_if_not( $sym26$VALID_DEDUCTION_, dependents, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( count.numG( ZERO_INTEGER ) )
    {
      SubLObject new_dependents = NIL;
      SubLObject cdolist_list_var = dependents;
      SubLObject dependent = NIL;
      dependent = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != deduction_handles.valid_deductionP( dependent, robustP ) )
        {
          final SubLObject item_var = dependent;
          if( NIL == conses_high.member( item_var, new_dependents, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            new_dependents = ConsesLow.cons( item_var, new_dependents );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        dependent = cdolist_list_var.first();
      }
      kb_hl_supports_interface.kb_kb_hl_support_set_dependents( kb_hl_support, new_dependents );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 7990L)
  public static SubLObject destroy_kb_hl_supports_with_invalid_hl_supports()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject destroyed_count = ZERO_INTEGER;
    final SubLObject idx = kb_hl_support_handles.do_kb_hl_supports_table();
    final SubLObject mess = $str27$Eliminating_KB_HL_supports_with_i;
    final SubLObject total = id_index.id_index_count( idx );
    SubLObject sofar = ZERO_INTEGER;
    assert NIL != Types.stringp( mess ) : mess;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( mess );
        final SubLObject idx_$9 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$9, $kw25$SKIP ) )
        {
          final SubLObject idx_$10 = idx_$9;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$10, $kw25$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$10 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject s_id;
            SubLObject s_handle;
            SubLObject kb_hl_support;
            SubLObject hl_support;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              s_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              s_handle = Vectors.aref( vector_var, s_id );
              if( NIL == id_index.id_index_tombstone_p( s_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw25$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( s_handle ) )
                {
                  s_handle = $kw25$SKIP;
                }
                kb_hl_support = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair( s_id, s_handle );
                hl_support = kb_hl_support_hl_support( kb_hl_support );
                if( NIL == arguments.valid_hl_supportP( hl_support ) )
                {
                  kb_hl_supports_interface.kb_remove_kb_hl_support( kb_hl_support );
                  destroyed_count = Numbers.add( destroyed_count, ONE_INTEGER );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$11 = idx_$9;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$11 ) || NIL == id_index.id_index_skip_tombstones_p( $kw25$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$11 );
            SubLObject s_id2 = id_index.id_index_sparse_id_threshold( idx_$11 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$11 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw25$SKIP ) ) ? NIL : $kw25$SKIP;
            while ( s_id2.numL( end_id ))
            {
              final SubLObject s_handle2 = Hashtables.gethash_without_values( s_id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw25$SKIP ) || NIL == id_index.id_index_tombstone_p( s_handle2 ) )
              {
                final SubLObject kb_hl_support2 = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair( s_id2, s_handle2 );
                final SubLObject hl_support2 = kb_hl_support_hl_support( kb_hl_support2 );
                if( NIL == arguments.valid_hl_supportP( hl_support2 ) )
                {
                  kb_hl_supports_interface.kb_remove_kb_hl_support( kb_hl_support2 );
                  destroyed_count = Numbers.add( destroyed_count, ONE_INTEGER );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
              s_id2 = Numbers.add( s_id2, ONE_INTEGER );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$12, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return destroyed_count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 8410L)
  public static SubLObject possibly_reify_hl_supports(final SubLObject justification)
  {
    return Mapping.mapcar( $sym28$POSSIBLY_REIFY_HL_SUPPORT, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 8587L)
  public static SubLObject possibly_reify_hl_support(final SubLObject support)
  {
    if( NIL != assertion_handles.assertion_p( support ) )
    {
      return support;
    }
    if( NIL != kb_hl_support_handles.kb_hl_support_p( support ) )
    {
      return support;
    }
    final SubLObject kb_hl_support = find_or_possibly_create_kb_hl_support( support );
    return ( NIL != kb_hl_support ) ? kb_hl_support : support;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 8918L)
  public static SubLObject possibly_unreify_kb_hl_supports(final SubLObject justification)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != $unreify_kb_hl_supportsP$.getDynamicValue( thread ) ) ? unreify_kb_hl_supports( justification ) : justification;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 9089L)
  public static SubLObject unreify_kb_hl_supports(final SubLObject justification)
  {
    return Mapping.mapcar( $sym29$UNREIFY_KB_HL_SUPPORT, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 9202L)
  public static SubLObject unreify_kb_hl_support(final SubLObject support)
  {
    return ( NIL != kb_hl_support_handles.kb_hl_support_p( support ) ) ? kb_hl_support_hl_support( support ) : support;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 9345L)
  public static SubLObject random_kb_hl_support(SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( $sym30$TRUE );
    }
    if( kb_hl_support_handles.kb_hl_support_count().numG( ZERO_INTEGER ) )
    {
      final SubLObject max_id = kb_hl_support_handles.next_kb_hl_support_id();
      SubLObject v_answer;
      SubLObject candidate;
      for( v_answer = NIL; NIL == v_answer; v_answer = candidate )
      {
        candidate = kb_hl_support_handles.find_kb_hl_support_by_id( random.random( max_id ) );
        if( NIL != candidate && NIL != Functions.funcall( test, candidate ) )
        {
        }
      }
      return v_answer;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 9788L)
  public static SubLObject sample_kb_hl_supports(SubLObject n, SubLObject allow_repeatsP, SubLObject test)
  {
    if( n == UNPROVIDED )
    {
      n = $int31$500;
    }
    if( allow_repeatsP == UNPROVIDED )
    {
      allow_repeatsP = NIL;
    }
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( $sym30$TRUE );
    }
    assert NIL != subl_promotions.non_negative_integer_p( n ) : n;
    if( NIL != allow_repeatsP )
    {
      SubLObject result = NIL;
      SubLObject i;
      for( i = NIL, i = ZERO_INTEGER; i.numL( n ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        result = ConsesLow.cons( random_kb_hl_support( test ), result );
      }
      return result;
    }
    SubLObject result;
    for( result = set_contents.new_set_contents( n, Symbols.symbol_function( EQL ) ); set_contents.set_contents_size( result ).numL( n ); result = set_contents.set_contents_add( random_kb_hl_support( test ), result,
        Symbols.symbol_function( EQL ) ) )
    {
    }
    return set_contents.set_contents_element_list( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 10402L)
  public static SubLObject kb_hl_supports_around_kb_hl_support(final SubLObject kb_hl_support, SubLObject total, SubLObject before, SubLObject after)
  {
    if( total == UNPROVIDED )
    {
      total = $int33$100;
    }
    if( before == UNPROVIDED )
    {
      before = ZERO_INTEGER;
    }
    if( after == UNPROVIDED )
    {
      after = Numbers.subtract( total, before );
    }
    assert NIL != kb_hl_support_handles.kb_hl_support_p( kb_hl_support ) : kb_hl_support;
    return kb_hl_supports_around( kb_hl_support_handles.kb_hl_support_id( kb_hl_support ), total, before, after );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 10922L)
  public static SubLObject kb_hl_supports_around(final SubLObject kb_hl_support_id, SubLObject total, SubLObject before, SubLObject after)
  {
    if( total == UNPROVIDED )
    {
      total = $int33$100;
    }
    if( before == UNPROVIDED )
    {
      before = ZERO_INTEGER;
    }
    if( after == UNPROVIDED )
    {
      after = Numbers.subtract( total, before );
    }
    assert NIL != subl_promotions.non_negative_integer_p( kb_hl_support_id ) : kb_hl_support_id;
    return assertions_high.kb_objects_around_id( $sym34$FIND_KB_HL_SUPPORT_BY_ID, ZERO_INTEGER, kb_hl_support_id, kb_hl_support_handles.next_kb_hl_support_id(), total, before, after );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 11576L)
  public static SubLObject kb_hl_support_dump_id(final SubLObject kb_hl_support)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject id = kb_hl_support_handles.kb_hl_support_id( kb_hl_support );
    final SubLObject dump_table = $kb_hl_support_dump_id_table$.getDynamicValue( thread );
    if( NIL != dump_table )
    {
      id = id_index.id_index_lookup( dump_table, id, UNPROVIDED );
    }
    return id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 11878L)
  public static SubLObject find_kb_hl_support_by_dump_id(final SubLObject dump_id)
  {
    return kb_hl_support_handles.find_kb_hl_support_by_id( dump_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 11978L)
  public static SubLObject with_kb_hl_support_dump_id_table(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym35$CLET, $list36, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 12210L)
  public static SubLObject dump_kb_hl_support_indexing_int(final SubLObject filename)
  {
    cfasl_utilities.cfasl_save( kb_hl_supports_low.$kb_hl_support_index$.getGlobalValue(), filename );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 12344L)
  public static SubLObject load_kb_hl_support_indexing_int(final SubLObject filename)
  {
    kb_hl_supports_low.$kb_hl_support_index$.setGlobalValue( cfasl_utilities.cfasl_load( filename ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 12473L)
  public static SubLObject invalid_kb_hl_supportP(final SubLObject kb_hl_support)
  {
    return makeBoolean( NIL != kb_hl_support_handles.kb_hl_support_p( kb_hl_support ) && NIL == kb_hl_support_handles.valid_kb_hl_supportP( kb_hl_support, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 12714L)
  public static SubLObject invalid_kb_hl_support_robustP(final SubLObject kb_hl_support)
  {
    return makeBoolean( NIL != kb_hl_support_handles.kb_hl_support_p( kb_hl_support ) && NIL == kb_hl_support_handles.valid_kb_hl_supportP( kb_hl_support, T ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 12876L)
  public static SubLObject kb_hl_support_has_problemsP(final SubLObject kb_hl_support)
  {
    return makeBoolean( NIL != kb_hl_support_handles.kb_hl_support_p( kb_hl_support ) && ( NIL == kb_hl_support_handles.valid_kb_hl_supportP( kb_hl_support, UNPROVIDED )
        || NIL != kb_hl_support_not_findable_by_hl_supportP( kb_hl_support ) || NIL != kb_hl_support_circularP( kb_hl_support ) || NIL != kb_hl_support_has_invalid_dependentP( kb_hl_support, UNPROVIDED )
        || NIL != kb_hl_support_has_invalid_argumentP( kb_hl_support, UNPROVIDED ) || NIL != kb_hl_support_has_invalid_hl_supportP( kb_hl_support ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 13474L)
  public static SubLObject kb_hl_support_not_findable_by_hl_supportP(final SubLObject kb_hl_support)
  {
    final SubLObject hl_support = kb_hl_support_hl_support( kb_hl_support );
    return makeBoolean( !kb_hl_support.eql( find_kb_hl_support( hl_support ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 13684L)
  public static SubLObject kb_hl_support_circularP(final SubLObject kb_hl_support)
  {
    final SubLObject justification = kb_hl_support_justification( kb_hl_support );
    return kb_hl_support_circularP_int( ConsesLow.list( kb_hl_support ), justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 13888L)
  public static SubLObject kb_hl_support_circularP_int(final SubLObject kb_hl_supports, final SubLObject justification)
  {
    SubLObject circularP = keyhash_utilities.fast_intersectP( kb_hl_supports, justification, Symbols.symbol_function( EQL ), UNPROVIDED, UNPROVIDED );
    if( NIL == circularP )
    {
      SubLObject csome_list_var = justification;
      SubLObject support = NIL;
      support = csome_list_var.first();
      while ( NIL == circularP && NIL != csome_list_var)
      {
        if( NIL != kb_hl_support_handles.kb_hl_support_p( support ) )
        {
          final SubLObject new_kb_hl_supports = ConsesLow.cons( support, kb_hl_supports );
          final SubLObject new_justification = kb_hl_support_justification( support );
          if( NIL != kb_hl_support_circularP_int( new_kb_hl_supports, new_justification ) )
          {
            circularP = T;
          }
        }
        csome_list_var = csome_list_var.rest();
        support = csome_list_var.first();
      }
    }
    return circularP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 14378L)
  public static SubLObject kb_hl_support_has_invalid_dependentP(final SubLObject kb_hl_support, SubLObject robustP)
  {
    if( robustP == UNPROVIDED )
    {
      robustP = NIL;
    }
    SubLObject invalid_dependentP = NIL;
    final SubLObject set_contents_var = kb_hl_supports_interface.kb_kb_hl_support_dependents( kb_hl_support );
    SubLObject basis_object;
    SubLObject state;
    SubLObject dependent;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == invalid_dependentP
        && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      dependent = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, dependent ) && NIL == deduction_handles.valid_deductionP( dependent, robustP ) )
      {
        invalid_dependentP = T;
      }
    }
    return invalid_dependentP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 14694L)
  public static SubLObject kb_hl_support_has_invalid_argumentP(final SubLObject kb_hl_support, SubLObject robustP)
  {
    if( robustP == UNPROVIDED )
    {
      robustP = NIL;
    }
    SubLObject invalid_argumentP;
    SubLObject rest;
    SubLObject argument;
    for( invalid_argumentP = NIL, rest = NIL, rest = kb_hl_supports_interface.kb_kb_hl_support_arguments( kb_hl_support ); NIL == invalid_argumentP && NIL != rest; rest = rest.rest() )
    {
      argument = rest.first();
      if( NIL == deduction_handles.valid_deductionP( argument, robustP ) )
      {
        invalid_argumentP = T;
      }
    }
    return invalid_argumentP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 15002L)
  public static SubLObject kb_hl_support_has_invalid_hl_supportP(final SubLObject kb_hl_support)
  {
    final SubLObject hl_support = kb_hl_support_hl_support( kb_hl_support );
    return makeBoolean( NIL == arguments.valid_hl_supportP( hl_support ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 15187L)
  public static SubLObject kb_hl_support_has_missing_backpointerP(final SubLObject kb_hl_support)
  {
    SubLObject missing_backpointerP = NIL;
    final SubLObject set_contents_var = kb_hl_supports_interface.kb_kb_hl_support_dependents( kb_hl_support );
    SubLObject basis_object;
    SubLObject state;
    SubLObject dependent;
    SubLObject backpointerP;
    SubLObject csome_list_var;
    SubLObject support;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == missing_backpointerP
        && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      dependent = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, dependent ) && NIL != deduction_handles.valid_deductionP( dependent, UNPROVIDED ) )
      {
        backpointerP = NIL;
        if( NIL == backpointerP )
        {
          csome_list_var = deductions_high.deduction_supports( dependent );
          support = NIL;
          support = csome_list_var.first();
          while ( NIL == backpointerP && NIL != csome_list_var)
          {
            if( support.eql( kb_hl_support ) )
            {
              backpointerP = T;
            }
            csome_list_var = csome_list_var.rest();
            support = csome_list_var.first();
          }
        }
        if( NIL == backpointerP )
        {
          missing_backpointerP = T;
        }
      }
    }
    return missing_backpointerP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 15674L)
  public static SubLObject kb_hl_support_has_dependent_with_supportP(final SubLObject kb_hl_support, final SubLObject support)
  {
    assert NIL != kb_hl_support_handles.kb_hl_support_p( kb_hl_support ) : kb_hl_support;
    assert NIL != arguments.support_p( support ) : support;
    final SubLObject set_contents_var = kb_hl_supports_interface.kb_kb_hl_support_dependents( kb_hl_support );
    SubLObject basis_object;
    SubLObject state;
    SubLObject deduction;
    SubLObject cdolist_list_var;
    SubLObject deduction_support;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      deduction = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, deduction ) )
      {
        cdolist_list_var = deductions_high.deduction_supports( deduction );
        deduction_support = NIL;
        deduction_support = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != arguments.support_equal( deduction_support, support ) )
          {
            return T;
          }
          cdolist_list_var = cdolist_list_var.rest();
          deduction_support = cdolist_list_var.first();
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 16202L)
  public static SubLObject kb_hl_supports_not_findable_by_hl_support()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject failures = NIL;
    final SubLObject idx = kb_hl_support_handles.do_kb_hl_supports_table();
    final SubLObject mess = $str38$Verifying_KB_HL_support_indexing;
    final SubLObject total = id_index.id_index_count( idx );
    SubLObject sofar = ZERO_INTEGER;
    assert NIL != Types.stringp( mess ) : mess;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( mess );
        final SubLObject idx_$13 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$13, $kw25$SKIP ) )
        {
          final SubLObject idx_$14 = idx_$13;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$14, $kw25$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$14 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject s_id;
            SubLObject s_handle;
            SubLObject kb_hl_support;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              s_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              s_handle = Vectors.aref( vector_var, s_id );
              if( NIL == id_index.id_index_tombstone_p( s_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw25$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( s_handle ) )
                {
                  s_handle = $kw25$SKIP;
                }
                kb_hl_support = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair( s_id, s_handle );
                if( NIL != kb_hl_support_not_findable_by_hl_supportP( kb_hl_support ) )
                {
                  failures = ConsesLow.cons( kb_hl_support, failures );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$15 = idx_$13;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$15 ) || NIL == id_index.id_index_skip_tombstones_p( $kw25$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$15 );
            SubLObject s_id2 = id_index.id_index_sparse_id_threshold( idx_$15 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$15 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw25$SKIP ) ) ? NIL : $kw25$SKIP;
            while ( s_id2.numL( end_id ))
            {
              final SubLObject s_handle2 = Hashtables.gethash_without_values( s_id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw25$SKIP ) || NIL == id_index.id_index_tombstone_p( s_handle2 ) )
              {
                final SubLObject kb_hl_support2 = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair( s_id2, s_handle2 );
                if( NIL != kb_hl_support_not_findable_by_hl_supportP( kb_hl_support2 ) )
                {
                  failures = ConsesLow.cons( kb_hl_support2, failures );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
              s_id2 = Numbers.add( s_id2, ONE_INTEGER );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$16, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( failures );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 16512L)
  public static SubLObject circular_kb_hl_supports()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject circular_supports = NIL;
    final SubLObject idx = kb_hl_support_handles.do_kb_hl_supports_table();
    final SubLObject mess = $str39$Searching_for_circular_KB_HL_supp;
    final SubLObject total = id_index.id_index_count( idx );
    SubLObject sofar = ZERO_INTEGER;
    assert NIL != Types.stringp( mess ) : mess;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( mess );
        final SubLObject idx_$17 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$17, $kw25$SKIP ) )
        {
          final SubLObject idx_$18 = idx_$17;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$18, $kw25$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$18 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject s_id;
            SubLObject s_handle;
            SubLObject kb_hl_support;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              s_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              s_handle = Vectors.aref( vector_var, s_id );
              if( NIL == id_index.id_index_tombstone_p( s_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw25$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( s_handle ) )
                {
                  s_handle = $kw25$SKIP;
                }
                kb_hl_support = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair( s_id, s_handle );
                if( NIL != kb_hl_support_circularP( kb_hl_support ) )
                {
                  circular_supports = ConsesLow.cons( kb_hl_support, circular_supports );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$19 = idx_$17;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$19 ) || NIL == id_index.id_index_skip_tombstones_p( $kw25$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$19 );
            SubLObject s_id2 = id_index.id_index_sparse_id_threshold( idx_$19 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$19 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw25$SKIP ) ) ? NIL : $kw25$SKIP;
            while ( s_id2.numL( end_id ))
            {
              final SubLObject s_handle2 = Hashtables.gethash_without_values( s_id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw25$SKIP ) || NIL == id_index.id_index_tombstone_p( s_handle2 ) )
              {
                final SubLObject kb_hl_support2 = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair( s_id2, s_handle2 );
                if( NIL != kb_hl_support_circularP( kb_hl_support2 ) )
                {
                  circular_supports = ConsesLow.cons( kb_hl_support2, circular_supports );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
              s_id2 = Numbers.add( s_id2, ONE_INTEGER );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$20, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( circular_supports );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 16818L)
  public static SubLObject duplicate_kb_hl_supports()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_hl_supports = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    SubLObject duplicate_supports = NIL;
    final SubLObject idx = kb_hl_support_handles.do_kb_hl_supports_table();
    final SubLObject mess = $str40$Searching_for_duplicate_KB_HL_sup;
    final SubLObject total = id_index.id_index_count( idx );
    SubLObject sofar = ZERO_INTEGER;
    assert NIL != Types.stringp( mess ) : mess;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( mess );
        final SubLObject idx_$21 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$21, $kw25$SKIP ) )
        {
          final SubLObject idx_$22 = idx_$21;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$22, $kw25$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$22 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject s_id;
            SubLObject s_handle;
            SubLObject kb_hl_support;
            SubLObject hl_support;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              s_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              s_handle = Vectors.aref( vector_var, s_id );
              if( NIL == id_index.id_index_tombstone_p( s_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw25$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( s_handle ) )
                {
                  s_handle = $kw25$SKIP;
                }
                kb_hl_support = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair( s_id, s_handle );
                hl_support = kb_hl_support_hl_support( kb_hl_support );
                dictionary_utilities.dictionary_push( v_hl_supports, hl_support, kb_hl_support );
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$23 = idx_$21;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$23 ) || NIL == id_index.id_index_skip_tombstones_p( $kw25$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$23 );
            SubLObject s_id2 = id_index.id_index_sparse_id_threshold( idx_$23 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$23 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw25$SKIP ) ) ? NIL : $kw25$SKIP;
            while ( s_id2.numL( end_id ))
            {
              final SubLObject s_handle2 = Hashtables.gethash_without_values( s_id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw25$SKIP ) || NIL == id_index.id_index_tombstone_p( s_handle2 ) )
              {
                final SubLObject kb_hl_support2 = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair( s_id2, s_handle2 );
                final SubLObject hl_support2 = kb_hl_support_hl_support( kb_hl_support2 );
                dictionary_utilities.dictionary_push( v_hl_supports, hl_support2, kb_hl_support2 );
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
              s_id2 = Numbers.add( s_id2, ONE_INTEGER );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$24 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$24, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( v_hl_supports ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject hl_support3 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject kb_hl_supports = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != list_utilities.lengthG( kb_hl_supports, ONE_INTEGER, UNPROVIDED ) )
      {
        duplicate_supports = ConsesLow.nconc( duplicate_supports, kb_hl_supports );
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return Sort.sort( duplicate_supports, Symbols.symbol_function( $sym41$_ ), $sym42$KB_HL_SUPPORT_ID );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 17414L)
  public static SubLObject kb_hl_supports_with_invalid_dependents(SubLObject robustP)
  {
    if( robustP == UNPROVIDED )
    {
      robustP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject idx = kb_hl_support_handles.do_kb_hl_supports_table();
    final SubLObject mess = $str43$Searching_for_KB_HL_supports_with;
    final SubLObject total = id_index.id_index_count( idx );
    SubLObject sofar = ZERO_INTEGER;
    assert NIL != Types.stringp( mess ) : mess;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( mess );
        final SubLObject idx_$25 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$25, $kw25$SKIP ) )
        {
          final SubLObject idx_$26 = idx_$25;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$26, $kw25$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$26 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject s_id;
            SubLObject s_handle;
            SubLObject kb_hl_support;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              s_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              s_handle = Vectors.aref( vector_var, s_id );
              if( NIL == id_index.id_index_tombstone_p( s_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw25$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( s_handle ) )
                {
                  s_handle = $kw25$SKIP;
                }
                kb_hl_support = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair( s_id, s_handle );
                if( NIL != kb_hl_support_has_invalid_dependentP( kb_hl_support, robustP ) )
                {
                  result = ConsesLow.cons( kb_hl_support, result );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$27 = idx_$25;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$27 ) || NIL == id_index.id_index_skip_tombstones_p( $kw25$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$27 );
            SubLObject s_id2 = id_index.id_index_sparse_id_threshold( idx_$27 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$27 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw25$SKIP ) ) ? NIL : $kw25$SKIP;
            while ( s_id2.numL( end_id ))
            {
              final SubLObject s_handle2 = Hashtables.gethash_without_values( s_id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw25$SKIP ) || NIL == id_index.id_index_tombstone_p( s_handle2 ) )
              {
                final SubLObject kb_hl_support2 = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair( s_id2, s_handle2 );
                if( NIL != kb_hl_support_has_invalid_dependentP( kb_hl_support2, robustP ) )
                {
                  result = ConsesLow.cons( kb_hl_support2, result );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
              s_id2 = Numbers.add( s_id2, ONE_INTEGER );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$28, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 17755L)
  public static SubLObject kb_hl_supports_with_invalid_arguments(SubLObject robustP)
  {
    if( robustP == UNPROVIDED )
    {
      robustP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject idx = kb_hl_support_handles.do_kb_hl_supports_table();
    final SubLObject mess = $str44$Searching_for_KB_HL_supports_with;
    final SubLObject total = id_index.id_index_count( idx );
    SubLObject sofar = ZERO_INTEGER;
    assert NIL != Types.stringp( mess ) : mess;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( mess );
        final SubLObject idx_$29 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$29, $kw25$SKIP ) )
        {
          final SubLObject idx_$30 = idx_$29;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$30, $kw25$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$30 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject s_id;
            SubLObject s_handle;
            SubLObject kb_hl_support;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              s_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              s_handle = Vectors.aref( vector_var, s_id );
              if( NIL == id_index.id_index_tombstone_p( s_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw25$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( s_handle ) )
                {
                  s_handle = $kw25$SKIP;
                }
                kb_hl_support = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair( s_id, s_handle );
                if( NIL != kb_hl_support_has_invalid_argumentP( kb_hl_support, robustP ) )
                {
                  result = ConsesLow.cons( kb_hl_support, result );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$31 = idx_$29;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$31 ) || NIL == id_index.id_index_skip_tombstones_p( $kw25$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$31 );
            SubLObject s_id2 = id_index.id_index_sparse_id_threshold( idx_$31 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$31 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw25$SKIP ) ) ? NIL : $kw25$SKIP;
            while ( s_id2.numL( end_id ))
            {
              final SubLObject s_handle2 = Hashtables.gethash_without_values( s_id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw25$SKIP ) || NIL == id_index.id_index_tombstone_p( s_handle2 ) )
              {
                final SubLObject kb_hl_support2 = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair( s_id2, s_handle2 );
                if( NIL != kb_hl_support_has_invalid_argumentP( kb_hl_support2, robustP ) )
                {
                  result = ConsesLow.cons( kb_hl_support2, result );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
              s_id2 = Numbers.add( s_id2, ONE_INTEGER );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$32 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$32, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 18093L)
  public static SubLObject kb_hl_supports_with_invalid_hl_supports()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject idx = kb_hl_support_handles.do_kb_hl_supports_table();
    final SubLObject mess = $str45$Searching_for_KB_HL_supports_with;
    final SubLObject total = id_index.id_index_count( idx );
    SubLObject sofar = ZERO_INTEGER;
    assert NIL != Types.stringp( mess ) : mess;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( mess );
        final SubLObject idx_$33 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$33, $kw25$SKIP ) )
        {
          final SubLObject idx_$34 = idx_$33;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$34, $kw25$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$34 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject s_id;
            SubLObject s_handle;
            SubLObject kb_hl_support;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              s_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              s_handle = Vectors.aref( vector_var, s_id );
              if( NIL == id_index.id_index_tombstone_p( s_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw25$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( s_handle ) )
                {
                  s_handle = $kw25$SKIP;
                }
                kb_hl_support = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair( s_id, s_handle );
                if( NIL != kb_hl_support_has_invalid_hl_supportP( kb_hl_support ) )
                {
                  result = ConsesLow.cons( kb_hl_support, result );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$35 = idx_$33;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$35 ) || NIL == id_index.id_index_skip_tombstones_p( $kw25$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$35 );
            SubLObject s_id2 = id_index.id_index_sparse_id_threshold( idx_$35 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$35 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw25$SKIP ) ) ? NIL : $kw25$SKIP;
            while ( s_id2.numL( end_id ))
            {
              final SubLObject s_handle2 = Hashtables.gethash_without_values( s_id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw25$SKIP ) || NIL == id_index.id_index_tombstone_p( s_handle2 ) )
              {
                final SubLObject kb_hl_support2 = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair( s_id2, s_handle2 );
                if( NIL != kb_hl_support_has_invalid_hl_supportP( kb_hl_support2 ) )
                {
                  result = ConsesLow.cons( kb_hl_support2, result );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
              s_id2 = Numbers.add( s_id2, ONE_INTEGER );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$36 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$36, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 18412L)
  public static SubLObject kb_hl_supports_with_missing_backpointers()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject idx = kb_hl_support_handles.do_kb_hl_supports_table();
    final SubLObject mess = $str46$Searching_for_KB_HL_supports_with;
    final SubLObject total = id_index.id_index_count( idx );
    SubLObject sofar = ZERO_INTEGER;
    assert NIL != Types.stringp( mess ) : mess;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( mess );
        final SubLObject idx_$37 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$37, $kw25$SKIP ) )
        {
          final SubLObject idx_$38 = idx_$37;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$38, $kw25$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$38 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject s_id;
            SubLObject s_handle;
            SubLObject kb_hl_support;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              s_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              s_handle = Vectors.aref( vector_var, s_id );
              if( NIL == id_index.id_index_tombstone_p( s_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw25$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( s_handle ) )
                {
                  s_handle = $kw25$SKIP;
                }
                kb_hl_support = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair( s_id, s_handle );
                if( NIL != kb_hl_support_has_missing_backpointerP( kb_hl_support ) )
                {
                  result = ConsesLow.cons( kb_hl_support, result );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$39 = idx_$37;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$39 ) || NIL == id_index.id_index_skip_tombstones_p( $kw25$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$39 );
            SubLObject s_id2 = id_index.id_index_sparse_id_threshold( idx_$39 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$39 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw25$SKIP ) ) ? NIL : $kw25$SKIP;
            while ( s_id2.numL( end_id ))
            {
              final SubLObject s_handle2 = Hashtables.gethash_without_values( s_id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw25$SKIP ) || NIL == id_index.id_index_tombstone_p( s_handle2 ) )
              {
                final SubLObject kb_hl_support2 = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair( s_id2, s_handle2 );
                if( NIL != kb_hl_support_has_missing_backpointerP( kb_hl_support2 ) )
                {
                  result = ConsesLow.cons( kb_hl_support2, result );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
              s_id2 = Numbers.add( s_id2, ONE_INTEGER );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$40 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$40, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 18734L)
  public static SubLObject verify_kb_hl_supports(SubLObject stream, SubLObject verboseP)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    if( verboseP == UNPROVIDED )
    {
      verboseP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_hl_supports = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    SubLObject indexing_failures = NIL;
    SubLObject circular_kb_hl_supports = NIL;
    SubLObject duplicate_kb_hl_supports = NIL;
    SubLObject kb_hl_supports_with_invalid_dependents = NIL;
    SubLObject kb_hl_supports_with_invalid_arguments = NIL;
    SubLObject kb_hl_supports_with_invalid_hl_supports = NIL;
    SubLObject kb_hl_supports_with_missing_backpointers = NIL;
    SubLObject error_message = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym47$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          final SubLObject idx = kb_hl_support_handles.do_kb_hl_supports_table();
          final SubLObject mess = $str48$Verifying_KB_HL_supports;
          final SubLObject total = id_index.id_index_count( idx );
          SubLObject sofar = ZERO_INTEGER;
          assert NIL != Types.stringp( mess ) : mess;
          final SubLObject _prev_bind_0_$41 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
          final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
          final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
          final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
          try
          {
            utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
            utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
            utilities_macros.$within_noting_percent_progress$.bind( T, thread );
            utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
            try
            {
              utilities_macros.noting_percent_progress_preamble( mess );
              final SubLObject idx_$42 = idx;
              if( NIL == id_index.id_index_objects_empty_p( idx_$42, $kw25$SKIP ) )
              {
                final SubLObject idx_$43 = idx_$42;
                if( NIL == id_index.id_index_dense_objects_empty_p( idx_$43, $kw25$SKIP ) )
                {
                  final SubLObject vector_var = id_index.id_index_dense_objects( idx_$43 );
                  final SubLObject backwardP_var = NIL;
                  SubLObject length;
                  SubLObject v_iteration;
                  SubLObject s_id;
                  SubLObject s_handle;
                  SubLObject kb_hl_support;
                  SubLObject hl_support;
                  for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
                  {
                    s_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                    s_handle = Vectors.aref( vector_var, s_id );
                    if( NIL == id_index.id_index_tombstone_p( s_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw25$SKIP ) )
                    {
                      if( NIL != id_index.id_index_tombstone_p( s_handle ) )
                      {
                        s_handle = $kw25$SKIP;
                      }
                      kb_hl_support = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair( s_id, s_handle );
                      hl_support = kb_hl_support_hl_support( kb_hl_support );
                      dictionary_utilities.dictionary_push( v_hl_supports, hl_support, kb_hl_support );
                      if( NIL != kb_hl_support_not_findable_by_hl_supportP( kb_hl_support ) )
                      {
                        indexing_failures = ConsesLow.cons( kb_hl_support, indexing_failures );
                      }
                      if( NIL != kb_hl_support_circularP( kb_hl_support ) )
                      {
                        circular_kb_hl_supports = ConsesLow.cons( kb_hl_support, circular_kb_hl_supports );
                      }
                      if( NIL != kb_hl_support_has_invalid_dependentP( kb_hl_support, UNPROVIDED ) )
                      {
                        kb_hl_supports_with_invalid_dependents = ConsesLow.cons( kb_hl_support, kb_hl_supports_with_invalid_dependents );
                      }
                      if( NIL != kb_hl_support_has_invalid_argumentP( kb_hl_support, UNPROVIDED ) )
                      {
                        kb_hl_supports_with_invalid_arguments = ConsesLow.cons( kb_hl_support, kb_hl_supports_with_invalid_arguments );
                      }
                      if( NIL != kb_hl_support_has_invalid_hl_supportP( kb_hl_support ) )
                      {
                        kb_hl_supports_with_invalid_hl_supports = ConsesLow.cons( kb_hl_support, kb_hl_supports_with_invalid_hl_supports );
                      }
                      if( NIL != kb_hl_support_has_missing_backpointerP( kb_hl_support ) )
                      {
                        kb_hl_supports_with_missing_backpointers = ConsesLow.cons( kb_hl_support, kb_hl_supports_with_missing_backpointers );
                      }
                      sofar = Numbers.add( sofar, ONE_INTEGER );
                      utilities_macros.note_percent_progress( sofar, total );
                    }
                  }
                }
                final SubLObject idx_$44 = idx_$42;
                if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$44 ) || NIL == id_index.id_index_skip_tombstones_p( $kw25$SKIP ) )
                {
                  final SubLObject sparse = id_index.id_index_sparse_objects( idx_$44 );
                  SubLObject s_id2 = id_index.id_index_sparse_id_threshold( idx_$44 );
                  final SubLObject end_id = id_index.id_index_next_id( idx_$44 );
                  final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw25$SKIP ) ) ? NIL : $kw25$SKIP;
                  while ( s_id2.numL( end_id ))
                  {
                    final SubLObject s_handle2 = Hashtables.gethash_without_values( s_id2, sparse, v_default );
                    if( NIL == id_index.id_index_skip_tombstones_p( $kw25$SKIP ) || NIL == id_index.id_index_tombstone_p( s_handle2 ) )
                    {
                      final SubLObject kb_hl_support2 = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair( s_id2, s_handle2 );
                      final SubLObject hl_support2 = kb_hl_support_hl_support( kb_hl_support2 );
                      dictionary_utilities.dictionary_push( v_hl_supports, hl_support2, kb_hl_support2 );
                      if( NIL != kb_hl_support_not_findable_by_hl_supportP( kb_hl_support2 ) )
                      {
                        indexing_failures = ConsesLow.cons( kb_hl_support2, indexing_failures );
                      }
                      if( NIL != kb_hl_support_circularP( kb_hl_support2 ) )
                      {
                        circular_kb_hl_supports = ConsesLow.cons( kb_hl_support2, circular_kb_hl_supports );
                      }
                      if( NIL != kb_hl_support_has_invalid_dependentP( kb_hl_support2, UNPROVIDED ) )
                      {
                        kb_hl_supports_with_invalid_dependents = ConsesLow.cons( kb_hl_support2, kb_hl_supports_with_invalid_dependents );
                      }
                      if( NIL != kb_hl_support_has_invalid_argumentP( kb_hl_support2, UNPROVIDED ) )
                      {
                        kb_hl_supports_with_invalid_arguments = ConsesLow.cons( kb_hl_support2, kb_hl_supports_with_invalid_arguments );
                      }
                      if( NIL != kb_hl_support_has_invalid_hl_supportP( kb_hl_support2 ) )
                      {
                        kb_hl_supports_with_invalid_hl_supports = ConsesLow.cons( kb_hl_support2, kb_hl_supports_with_invalid_hl_supports );
                      }
                      if( NIL != kb_hl_support_has_missing_backpointerP( kb_hl_support2 ) )
                      {
                        kb_hl_supports_with_missing_backpointers = ConsesLow.cons( kb_hl_support2, kb_hl_supports_with_missing_backpointers );
                      }
                      sofar = Numbers.add( sofar, ONE_INTEGER );
                      utilities_macros.note_percent_progress( sofar, total );
                    }
                    s_id2 = Numbers.add( s_id2, ONE_INTEGER );
                  }
                }
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$42 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                utilities_macros.noting_percent_progress_postamble();
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$42, thread );
              }
            }
          }
          finally
          {
            utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
            utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
            utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
            utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$41, thread );
          }
          SubLObject iteration_state;
          for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( v_hl_supports ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
              iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
          {
            thread.resetMultipleValues();
            final SubLObject hl_support3 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
            final SubLObject kb_hl_supports = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if( NIL != list_utilities.lengthG( kb_hl_supports, ONE_INTEGER, UNPROVIDED ) )
            {
              duplicate_kb_hl_supports = ConsesLow.nconc( duplicate_kb_hl_supports, kb_hl_supports );
            }
          }
          dictionary_contents.do_dictionary_contents_finalize( iteration_state );
          indexing_failures = Sequences.nreverse( indexing_failures );
          circular_kb_hl_supports = Sequences.nreverse( circular_kb_hl_supports );
          duplicate_kb_hl_supports = Sort.sort( duplicate_kb_hl_supports, Symbols.symbol_function( $sym41$_ ), $sym42$KB_HL_SUPPORT_ID );
          kb_hl_supports_with_invalid_dependents = Sequences.nreverse( kb_hl_supports_with_invalid_dependents );
          kb_hl_supports_with_invalid_arguments = Sequences.nreverse( kb_hl_supports_with_invalid_arguments );
          kb_hl_supports_with_invalid_hl_supports = Sequences.nreverse( kb_hl_supports_with_invalid_hl_supports );
          kb_hl_supports_with_missing_backpointers = Sequences.nreverse( kb_hl_supports_with_missing_backpointers );
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != stream )
    {
      if( NIL != error_message )
      {
        PrintLow.format( stream, $str49$__Error_during_KB_HL_support_veri, error_message );
      }
      if( NIL != indexing_failures )
      {
        report_kb_hl_support_indexing_failures( stream, indexing_failures, verboseP );
      }
      if( NIL != circular_kb_hl_supports )
      {
        report_circular_kb_hl_supports( stream, circular_kb_hl_supports, verboseP );
      }
      if( NIL != duplicate_kb_hl_supports )
      {
        report_duplicate_kb_hl_supports( stream, duplicate_kb_hl_supports, verboseP );
      }
      if( NIL != kb_hl_supports_with_invalid_dependents )
      {
        report_kb_hl_supports_with_invalid_dependents( stream, kb_hl_supports_with_invalid_dependents, verboseP );
      }
      if( NIL != kb_hl_supports_with_invalid_arguments )
      {
        report_kb_hl_supports_with_invalid_arguments( stream, kb_hl_supports_with_invalid_arguments, verboseP );
      }
      if( NIL != kb_hl_supports_with_invalid_hl_supports )
      {
        report_kb_hl_supports_with_invalid_hl_supports( stream, kb_hl_supports_with_invalid_hl_supports, verboseP );
      }
      if( NIL != kb_hl_supports_with_missing_backpointers )
      {
        report_kb_hl_supports_with_missing_backpointers( stream, kb_hl_supports_with_missing_backpointers, verboseP );
      }
    }
    return makeBoolean( NIL == indexing_failures && NIL == circular_kb_hl_supports && NIL == duplicate_kb_hl_supports && NIL == kb_hl_supports_with_invalid_dependents && NIL == kb_hl_supports_with_invalid_arguments
        && NIL == kb_hl_supports_with_invalid_hl_supports && NIL == kb_hl_supports_with_missing_backpointers && NIL == error_message );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 22391L)
  public static SubLObject verify_kb_hl_support_indexing(SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject failures = NIL;
    SubLObject error_message = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym47$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          failures = kb_hl_supports_not_findable_by_hl_support();
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != stream )
    {
      if( NIL != error_message )
      {
        PrintLow.format( stream, $str50$__Error_during_indexing_verificat, error_message );
      }
      if( NIL != failures )
      {
        report_kb_hl_support_indexing_failures( stream, failures, UNPROVIDED );
      }
    }
    return makeBoolean( NIL == failures && NIL == error_message );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 22891L)
  public static SubLObject report_kb_hl_support_indexing_failures(final SubLObject stream, final SubLObject failures, SubLObject verboseP)
  {
    if( verboseP == UNPROVIDED )
    {
      verboseP = NIL;
    }
    if( NIL != verboseP )
    {
      PrintLow.format( stream, $str51$__The_following_KB_HL_supports_we, Sequences.length( failures ) );
      SubLObject cdolist_list_var = failures;
      SubLObject failure = NIL;
      failure = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        PrintLow.format( stream, $str52$__s__s__, kb_hl_support_handles.kb_hl_support_id( failure ), failure );
        cdolist_list_var = cdolist_list_var.rest();
        failure = cdolist_list_var.first();
      }
    }
    else
    {
      PrintLow.format( stream, $str53$___s_KB_HL_supports_are_not_finda, Sequences.length( failures ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 23357L)
  public static SubLObject verify_kb_hl_supports_non_circular(SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject failures = NIL;
    SubLObject error_message = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym47$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          failures = circular_kb_hl_supports();
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != stream )
    {
      if( NIL != error_message )
      {
        PrintLow.format( stream, $str54$__Error_during_non_circularity_ve, error_message );
      }
      if( NIL != failures )
      {
        report_circular_kb_hl_supports( stream, failures, UNPROVIDED );
      }
    }
    return makeBoolean( NIL == failures && NIL == error_message );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 23844L)
  public static SubLObject report_circular_kb_hl_supports(final SubLObject stream, final SubLObject circular_kb_hl_supports, SubLObject verboseP)
  {
    if( verboseP == UNPROVIDED )
    {
      verboseP = NIL;
    }
    if( NIL != verboseP )
    {
      PrintLow.format( stream, $str55$__The_following_KB_HL_supports_ar, Sequences.length( circular_kb_hl_supports ) );
      SubLObject cdolist_list_var = circular_kb_hl_supports;
      SubLObject kb_hl_support = NIL;
      kb_hl_support = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        PrintLow.format( stream, $str52$__s__s__, kb_hl_support_handles.kb_hl_support_id( kb_hl_support ), kb_hl_support );
        cdolist_list_var = cdolist_list_var.rest();
        kb_hl_support = cdolist_list_var.first();
      }
    }
    else
    {
      PrintLow.format( stream, $str56$___s_KB_HL_supports_are_circular_, Sequences.length( circular_kb_hl_supports ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 24327L)
  public static SubLObject verify_kb_hl_support_uniqueness(SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject failures = NIL;
    SubLObject error_message = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym47$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          failures = duplicate_kb_hl_supports();
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != stream )
    {
      if( NIL != error_message )
      {
        PrintLow.format( stream, $str57$__Error_during_uniqueness_verific, error_message );
      }
      if( NIL != failures )
      {
        report_duplicate_kb_hl_supports( stream, failures, UNPROVIDED );
      }
    }
    return makeBoolean( NIL == failures && NIL == error_message );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 24808L)
  public static SubLObject report_duplicate_kb_hl_supports(final SubLObject stream, final SubLObject kb_hl_supports, SubLObject verboseP)
  {
    if( verboseP == UNPROVIDED )
    {
      verboseP = NIL;
    }
    if( NIL != verboseP )
    {
      PrintLow.format( stream, $str58$__The_following_KB_HL_supports_ha, Sequences.length( kb_hl_supports ) );
      SubLObject cdolist_list_var = kb_hl_supports;
      SubLObject kb_hl_support = NIL;
      kb_hl_support = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        PrintLow.format( stream, $str52$__s__s__, kb_hl_support_handles.kb_hl_support_id( kb_hl_support ), kb_hl_support );
        cdolist_list_var = cdolist_list_var.rest();
        kb_hl_support = cdolist_list_var.first();
      }
    }
    else
    {
      PrintLow.format( stream, $str59$___s_KB_HL_supports_have_duplicat, Sequences.length( kb_hl_supports ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 25262L)
  public static SubLObject verify_kb_hl_support_dependents(SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject failures = NIL;
    SubLObject error_message = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym47$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          failures = kb_hl_supports_with_invalid_dependents( UNPROVIDED );
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != stream )
    {
      if( NIL != error_message )
      {
        PrintLow.format( stream, $str60$__Error_during_dependent_verifica, error_message );
      }
      if( NIL != failures )
      {
        report_kb_hl_supports_with_invalid_dependents( stream, failures, UNPROVIDED );
      }
    }
    return makeBoolean( NIL == failures && NIL == error_message );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 25770L)
  public static SubLObject report_kb_hl_supports_with_invalid_dependents(final SubLObject stream, final SubLObject kb_hl_supports, SubLObject verboseP)
  {
    if( verboseP == UNPROVIDED )
    {
      verboseP = NIL;
    }
    if( NIL != verboseP )
    {
      PrintLow.format( stream, $str61$__The_following_KB_HL_supports_ha, Sequences.length( kb_hl_supports ) );
      SubLObject cdolist_list_var = kb_hl_supports;
      SubLObject kb_hl_support = NIL;
      kb_hl_support = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        PrintLow.format( stream, $str52$__s__s__, kb_hl_support_handles.kb_hl_support_id( kb_hl_support ), kb_hl_support );
        cdolist_list_var = cdolist_list_var.rest();
        kb_hl_support = cdolist_list_var.first();
      }
    }
    else
    {
      PrintLow.format( stream, $str62$___s_KB_HL_supports_have_invalid_, Sequences.length( kb_hl_supports ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 26254L)
  public static SubLObject verify_kb_hl_support_arguments(SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject failures = NIL;
    SubLObject error_message = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym47$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          failures = kb_hl_supports_with_invalid_arguments( UNPROVIDED );
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != stream )
    {
      if( NIL != error_message )
      {
        PrintLow.format( stream, $str63$__Error_during_argument_verificat, error_message );
      }
      if( NIL != failures )
      {
        report_kb_hl_supports_with_invalid_arguments( stream, failures, UNPROVIDED );
      }
    }
    return makeBoolean( NIL == failures && NIL == error_message );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 26758L)
  public static SubLObject report_kb_hl_supports_with_invalid_arguments(final SubLObject stream, final SubLObject kb_hl_supports, SubLObject verboseP)
  {
    if( verboseP == UNPROVIDED )
    {
      verboseP = NIL;
    }
    if( NIL != verboseP )
    {
      PrintLow.format( stream, $str64$__The_following_KB_HL_supports_ha, Sequences.length( kb_hl_supports ) );
      SubLObject cdolist_list_var = kb_hl_supports;
      SubLObject kb_hl_support = NIL;
      kb_hl_support = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        PrintLow.format( stream, $str52$__s__s__, kb_hl_support_handles.kb_hl_support_id( kb_hl_support ), kb_hl_support );
        cdolist_list_var = cdolist_list_var.rest();
        kb_hl_support = cdolist_list_var.first();
      }
    }
    else
    {
      PrintLow.format( stream, $str65$___s_KB_HL_supports_have_invalid_, Sequences.length( kb_hl_supports ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 27239L)
  public static SubLObject verify_kb_hl_support_hl_supports(SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject failures = NIL;
    SubLObject error_message = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym47$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          failures = kb_hl_supports_with_invalid_hl_supports();
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != stream )
    {
      if( NIL != error_message )
      {
        PrintLow.format( stream, $str66$__Error_during_HL_support_verific, error_message );
      }
      if( NIL != failures )
      {
        report_kb_hl_supports_with_invalid_hl_supports( stream, failures, UNPROVIDED );
      }
    }
    return makeBoolean( NIL == failures && NIL == error_message );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 27751L)
  public static SubLObject report_kb_hl_supports_with_invalid_hl_supports(final SubLObject stream, final SubLObject kb_hl_supports, SubLObject verboseP)
  {
    if( verboseP == UNPROVIDED )
    {
      verboseP = NIL;
    }
    if( NIL != verboseP )
    {
      PrintLow.format( stream, $str67$__The_following_KB_HL_supports_ha, Sequences.length( kb_hl_supports ) );
      SubLObject cdolist_list_var = kb_hl_supports;
      SubLObject kb_hl_support = NIL;
      kb_hl_support = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        PrintLow.format( stream, $str52$__s__s__, kb_hl_support_handles.kb_hl_support_id( kb_hl_support ), kb_hl_support );
        cdolist_list_var = cdolist_list_var.rest();
        kb_hl_support = cdolist_list_var.first();
      }
    }
    else
    {
      PrintLow.format( stream, $str68$___s_KB_HL_supports_have_invalid_, Sequences.length( kb_hl_supports ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 28238L)
  public static SubLObject verify_kb_hl_support_backpointers(SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject failures = NIL;
    SubLObject error_message = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym47$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          failures = kb_hl_supports_with_missing_backpointers();
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != stream )
    {
      if( NIL != error_message )
      {
        PrintLow.format( stream, $str69$__Error_during_KB_HL_support_back, error_message );
      }
      if( NIL != failures )
      {
        report_kb_hl_supports_with_missing_backpointers( stream, failures, UNPROVIDED );
      }
    }
    return makeBoolean( NIL == failures && NIL == error_message );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 28768L)
  public static SubLObject report_kb_hl_supports_with_missing_backpointers(final SubLObject stream, final SubLObject kb_hl_supports, SubLObject verboseP)
  {
    if( verboseP == UNPROVIDED )
    {
      verboseP = NIL;
    }
    if( NIL != verboseP )
    {
      PrintLow.format( stream, $str70$__The_following_KB_HL_supports_ha, Sequences.length( kb_hl_supports ) );
      SubLObject cdolist_list_var = kb_hl_supports;
      SubLObject kb_hl_support = NIL;
      kb_hl_support = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        PrintLow.format( stream, $str52$__s__s__, kb_hl_support_handles.kb_hl_support_id( kb_hl_support ), kb_hl_support );
        cdolist_list_var = cdolist_list_var.rest();
        kb_hl_support = cdolist_list_var.first();
      }
    }
    else
    {
      PrintLow.format( stream, $str71$___s_KB_HL_supports_have_missing_, Sequences.length( kb_hl_supports ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 29336L)
  public static SubLObject enqueueing_kb_hl_supports_for_tmsP_int()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return queues.queue_p( $tms_kb_hl_support_queue$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 29440L)
  public static SubLObject enqueueing_kb_hl_supports_for_tmsP()
  {
    return enqueueing_kb_hl_supports_for_tmsP_int();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 29596L)
  public static SubLObject with_kb_hl_support_rejustification(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym16$PIF, $list74, reader.bq_cons( $sym75$PROGN, ConsesLow.append( body, NIL ) ), ConsesLow.listS( $sym35$CLET, $list76, ConsesLow.append( body, $list77 ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 29862L)
  public static SubLObject process_tms_kb_hl_support_queue()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    while ( NIL == queues.queue_empty_p( $tms_kb_hl_support_queue$.getDynamicValue( thread ) ))
    {
      final SubLObject kb_hl_support = queues.dequeue( $tms_kb_hl_support_queue$.getDynamicValue( thread ) );
      if( kb_hl_support_handles.kb_hl_support_id( kb_hl_support ).isInteger() )
      {
        rejustify_or_remove_kb_hl_support( kb_hl_support );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 30204L)
  public static SubLObject enqueue_kb_hl_support_for_tms(final SubLObject kb_hl_support)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject hl_support = kb_hl_support_hl_support( kb_hl_support );
    kb_hl_supports_interface.kb_kb_hl_support_set_argument( kb_hl_support, hl_support );
    queues.enqueue( kb_hl_support, $tms_kb_hl_support_queue$.getDynamicValue( thread ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 30458L)
  public static SubLObject rejustify_or_remove_kb_hl_support(final SubLObject kb_hl_support)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject hl_support = kb_hl_support_hl_support( kb_hl_support );
    SubLObject verifiedP = NIL;
    SubLObject rejustifiedP = NIL;
    if( NIL == kb_hl_support_uselessP( kb_hl_support ) )
    {
      SubLObject message_var = NIL;
      final SubLObject was_appendingP = Eval.eval( $sym79$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ );
      Eval.eval( $list80 );
      try
      {
        try
        {
          thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( $sym47$CATCH_ERROR_MESSAGE_HANDLER, thread );
            try
            {
              verifiedP = hl_supports.hl_verify( hl_support );
            }
            catch( final Throwable catch_var )
            {
              Errors.handleThrowable( catch_var, NIL );
            }
          }
          finally
          {
            Errors.$error_handler$.rebind( _prev_bind_0, thread );
          }
        }
        catch( final Throwable ccatch_env_var )
        {
          message_var = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        }
        finally
        {
          thread.throwStack.pop();
        }
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          Eval.eval( ConsesLow.list( $sym81$CSETQ, $sym79$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP ) );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
      if( message_var.isString() )
      {
        Errors.warn( $str82$_A, message_var );
      }
    }
    if( NIL != verifiedP )
    {
      final SubLObject rejustify_result = kb_hl_supports_interface.kb_rejustify_kb_hl_support( kb_hl_support );
      if( $kw83$UNJUSTIFIABLE == rejustify_result )
      {
        tms_remove_kb_hl_support( kb_hl_support );
      }
      else
      {
        rejustifiedP = T;
      }
    }
    else
    {
      tms_remove_kb_hl_support( kb_hl_support );
    }
    return rejustifiedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 31008L)
  public static SubLObject tms_possibly_rejustify_kb_hl_support(final SubLObject kb_hl_support)
  {
    return ( NIL != enqueueing_kb_hl_supports_for_tmsP() ) ? enqueue_kb_hl_support_for_tms( kb_hl_support ) : makeBoolean( NIL == possibly_rejustify_kb_hl_support( kb_hl_support ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 31244L)
  public static SubLObject possibly_rejustify_kb_hl_support(final SubLObject kb_hl_support)
  {
    final SubLObject hl_support = kb_hl_support_hl_support( kb_hl_support );
    SubLObject rejustifiedP = NIL;
    if( NIL != Sequences.find_if( $sym84$TMS_FORT_TO_KILL_, hl_support, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL != hl_supports.hl_verify( hl_support ) )
    {
      final SubLObject rejustify_result = kb_hl_supports_interface.kb_rejustify_kb_hl_support( kb_hl_support );
      if( $kw83$UNJUSTIFIABLE == rejustify_result )
      {
        handle_unverifiable_kb_hl_support( kb_hl_support );
      }
      else
      {
        rejustifiedP = T;
      }
    }
    else
    {
      handle_unverifiable_kb_hl_support( kb_hl_support );
    }
    return rejustifiedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 31764L)
  public static SubLObject verify_kb_hl_support(final SubLObject kb_hl_support)
  {
    final SubLObject hl_support = kb_hl_support_hl_support( kb_hl_support );
    final SubLObject verifiedP = hl_supports.hl_verify( hl_support );
    if( NIL == verifiedP )
    {
      handle_unverifiable_kb_hl_support( kb_hl_support );
    }
    return verifiedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 32024L)
  public static SubLObject handle_unverifiable_kb_hl_support(final SubLObject kb_hl_support)
  {
    final SubLObject argument = kb_hl_supports_interface.kb_kb_hl_support_argument( kb_hl_support );
    if( NIL != deduction_handles.deduction_p( argument ) )
    {
      if( NIL != tms.tms_argument_being_removedP( argument ) )
      {
        tms_remove_kb_hl_support( kb_hl_support );
      }
      else
      {
        tms.tms_remove_deduction( argument );
      }
    }
    else
    {
      tms_remove_kb_hl_support( kb_hl_support );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 32378L)
  public static SubLObject tms_remove_kb_hl_supports_mentioning_term(final SubLObject v_term)
  {
    SubLObject removed_count = ZERO_INTEGER;
    SubLObject kb_hl_supports_mentioning_term = NIL;
    SubLObject cdolist_list_var = find_kb_hl_supports_mentioning_term( v_term );
    SubLObject kb_hl_support = NIL;
    kb_hl_support = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != arguments.valid_supportP( kb_hl_support, UNPROVIDED ) )
      {
        kb_hl_supports_mentioning_term = ConsesLow.cons( kb_hl_support, kb_hl_supports_mentioning_term );
      }
      cdolist_list_var = cdolist_list_var.rest();
      kb_hl_support = cdolist_list_var.first();
    }
    cdolist_list_var = kb_hl_supports_mentioning_term;
    kb_hl_support = NIL;
    kb_hl_support = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != kb_hl_support_handles.valid_kb_hl_supportP( kb_hl_support, T ) )
      {
        tms_remove_kb_hl_support( kb_hl_support );
        removed_count = Numbers.add( removed_count, ONE_INTEGER );
      }
      cdolist_list_var = cdolist_list_var.rest();
      kb_hl_support = cdolist_list_var.first();
    }
    return removed_count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 32897L)
  public static SubLObject tms_remove_kb_hl_support(final SubLObject kb_hl_support)
  {
    final SubLObject set_contents_var = kb_hl_supports_interface.kb_kb_hl_support_dependents( kb_hl_support );
    SubLObject basis_object;
    SubLObject state;
    SubLObject deduction;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      deduction = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, deduction ) )
      {
        tms.tms_remove_deduction( deduction );
      }
    }
    kb_hl_supports_interface.kb_remove_kb_hl_support( kb_hl_support );
    return kb_hl_support;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 33307L)
  public static SubLObject bootstrap_kb_hl_supports(SubLObject reconsider_deductionsP)
  {
    if( reconsider_deductionsP == UNPROVIDED )
    {
      reconsider_deductionsP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject size = Numbers.ceiling( deduction_handles.deduction_count(), kb_utilities.estimated_deductions_per_hl_support() );
    kb_utilities.setup_kb_hl_support_tables( size, NIL );
    final SubLObject _prev_bind_0 = control_vars.$save_asked_queriesP$.currentBinding( thread );
    try
    {
      control_vars.$save_asked_queriesP$.bind( NIL, thread );
      final SubLObject local_state;
      final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
      final SubLObject _prev_bind_0_$46 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
          final SubLObject _prev_bind_0_$47 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
          final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
          final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
          final SubLObject _prev_bind_4 = utilities_macros.$progress_note$.currentBinding( thread );
          final SubLObject _prev_bind_5 = utilities_macros.$progress_start_time$.currentBinding( thread );
          final SubLObject _prev_bind_6 = utilities_macros.$progress_total$.currentBinding( thread );
          final SubLObject _prev_bind_7 = utilities_macros.$progress_sofar$.currentBinding( thread );
          final SubLObject _prev_bind_8 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
          final SubLObject _prev_bind_9 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
          final SubLObject _prev_bind_10 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
          final SubLObject _prev_bind_11 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, SIX_INTEGER ), thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
            utilities_macros.$progress_note$.bind( $str85$Bootstrapping_KB_HL_supports, thread );
            utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
            utilities_macros.$progress_total$.bind( deduction_handles.deduction_count(), thread );
            utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
            utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
            utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
            utilities_macros.$within_noting_percent_progress$.bind( T, thread );
            utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
            try
            {
              utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
              SubLObject id;
              SubLObject deduction;
              for( id = NIL, id = ZERO_INTEGER; id.numL( utilities_macros.$progress_total$.getDynamicValue( thread ) ); id = Numbers.add( id, ONE_INTEGER ) )
              {
                deduction = deduction_handles.find_deduction_by_id( id );
                if( NIL != deduction_handles.deduction_p( deduction ) && ( NIL == reconsider_deductionsP || NIL == tms.tms_reconsider_deduction( deduction ) ) )
                {
                  bootstrap_kb_hl_supports_for_deduction( deduction );
                }
                utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
                utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$48 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                utilities_macros.noting_percent_progress_postamble();
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$48, thread );
              }
            }
          }
          finally
          {
            utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_11, thread );
            utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_10, thread );
            utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_9, thread );
            utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_8, thread );
            utilities_macros.$progress_sofar$.rebind( _prev_bind_7, thread );
            utilities_macros.$progress_total$.rebind( _prev_bind_6, thread );
            utilities_macros.$progress_start_time$.rebind( _prev_bind_5, thread );
            utilities_macros.$progress_note$.rebind( _prev_bind_4, thread );
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_2, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$47, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$49 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$49, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$46, thread );
      }
    }
    finally
    {
      control_vars.$save_asked_queriesP$.rebind( _prev_bind_0, thread );
    }
    kb_hl_support_handles.finalize_kb_hl_supports( UNPROVIDED );
    return kb_hl_support_handles.kb_hl_support_count();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 34092L)
  public static SubLObject bootstrap_kb_hl_supports_for_deduction(final SubLObject deduction)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject old_supports = deductions_high.deduction_supports( deduction );
    SubLObject new_supports = NIL;
    SubLObject cdolist_list_var = old_supports;
    SubLObject support = NIL;
    support = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject error_message = NIL;
      SubLObject new_support = NIL;
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym47$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            if( NIL != subl_promotions.positive_integer_p( $debug_bootstrap_kb_hl_supports_seconds$.getDynamicValue( thread ) ) )
            {
              final SubLObject _prev_bind_0_$50 = utilities_macros.$noting_progress_delayed_mode_seconds$.currentBinding( thread );
              final SubLObject _prev_bind_2 = utilities_macros.$noting_progress_delayed_mode_string$.currentBinding( thread );
              try
              {
                utilities_macros.$noting_progress_delayed_mode_seconds$.bind( $debug_bootstrap_kb_hl_supports_seconds$.getDynamicValue( thread ), thread );
                utilities_macros.$noting_progress_delayed_mode_string$.bind( Sequences.cconcatenate( $str86$Slow_reification_of_, format_nil.format_nil_s_no_copy( support ) ), thread );
                final SubLObject str = Sequences.cconcatenate( $str86$Slow_reification_of_, format_nil.format_nil_s_no_copy( support ) );
                final SubLObject _prev_bind_0_$51 = utilities_macros.$progress_start_time$.currentBinding( thread );
                final SubLObject _prev_bind_1_$52 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
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
                  new_support = possibly_reify_hl_support( support );
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
                  utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$52, thread );
                  utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$51, thread );
                }
              }
              finally
              {
                utilities_macros.$noting_progress_delayed_mode_string$.rebind( _prev_bind_2, thread );
                utilities_macros.$noting_progress_delayed_mode_seconds$.rebind( _prev_bind_0_$50, thread );
              }
            }
            else
            {
              new_support = possibly_reify_hl_support( support );
            }
          }
          catch( final Throwable catch_var )
          {
            Errors.handleThrowable( catch_var, NIL );
          }
        }
        finally
        {
          Errors.$error_handler$.rebind( _prev_bind_0, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
      if( NIL != error_message )
      {
        Errors.warn( $str87$Could_not_create_KB_HL_support_fo, support, error_message );
      }
      else if( NIL != kb_hl_support_handles.valid_kb_hl_supportP( new_support, UNPROVIDED ) )
      {
        kb_hl_supports_interface.kb_kb_hl_support_add_dependent( new_support, deduction );
      }
      else if( NIL != kb_hl_support_handles.kb_hl_support_p( new_support ) )
      {
        Errors.warn( $str88$Created_invalid_KB_HL_support_for, support, error_message );
        new_support = NIL;
      }
      new_supports = ConsesLow.cons( ( NIL != new_support ) ? new_support : support, new_supports );
      cdolist_list_var = cdolist_list_var.rest();
      support = cdolist_list_var.first();
    }
    deductions_low.reset_deduction_supports( deduction, Sequences.nreverse( new_supports ) );
    return NIL;
  }

  public static SubLObject declare_kb_hl_supports_high_file()
  {
    SubLFiles.declareMacro( me, "do_kb_hl_support_arguments", "DO-KB-HL-SUPPORT-ARGUMENTS" );
    SubLFiles.declareMacro( me, "do_kb_hl_support_dependents", "DO-KB-HL-SUPPORT-DEPENDENTS" );
    SubLFiles.declareMacro( me, "do_kb_hl_support_supports", "DO-KB-HL-SUPPORT-SUPPORTS" );
    SubLFiles.declareMacro( me, "do_recent_kb_hl_supports", "DO-RECENT-KB-HL-SUPPORTS" );
    SubLFiles.declareFunction( me, "create_kb_hl_support", "CREATE-KB-HL-SUPPORT", 2, 0, false );
    SubLFiles.declareFunction( me, "find_kb_hl_support", "FIND-KB-HL-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "find_kb_hl_supports_mentioning_term", "FIND-KB-HL-SUPPORTS-MENTIONING-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "find_or_create_kb_hl_support", "FIND-OR-CREATE-KB-HL-SUPPORT", 2, 0, false );
    SubLFiles.declareFunction( me, "find_or_possibly_create_kb_hl_support", "FIND-OR-POSSIBLY-CREATE-KB-HL-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_create_kb_hl_support", "POSSIBLY-CREATE-KB-HL-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_hl_support_hl_support", "KB-HL-SUPPORT-HL-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_hl_support_justification", "KB-HL-SUPPORT-JUSTIFICATION", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_hl_support_module", "KB-HL-SUPPORT-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_hl_support_sentence", "KB-HL-SUPPORT-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_hl_support_mt", "KB-HL-SUPPORT-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_hl_support_tv", "KB-HL-SUPPORT-TV", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_hl_support_el_sentence", "KB-HL-SUPPORT-EL-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_hl_support_ist_sentence", "KB-HL-SUPPORT-IST-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_hl_support_el_ist_sentence", "KB-HL-SUPPORT-EL-IST-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_hl_support_elmt", "KB-HL-SUPPORT-ELMT", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_hl_support_cons", "KB-HL-SUPPORT-CONS", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_hl_support_justification_size", "KB-HL-SUPPORT-JUSTIFICATION-SIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_hl_support_uselessP", "KB-HL-SUPPORT-USELESS?", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_hl_support_unjustifiedP", "KB-HL-SUPPORT-UNJUSTIFIED?", 1, 0, false );
    SubLFiles.declareFunction( me, "should_remove_kb_hl_supportP", "SHOULD-REMOVE-KB-HL-SUPPORT?", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_remove_kb_hl_support", "POSSIBLY-REMOVE-KB-HL-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "eliminate_kb_hl_supports_invalid_dependents", "ELIMINATE-KB-HL-SUPPORTS-INVALID-DEPENDENTS", 0, 1, false );
    SubLFiles.declareFunction( me, "eliminate_kb_hl_support_invalid_dependents", "ELIMINATE-KB-HL-SUPPORT-INVALID-DEPENDENTS", 1, 1, false );
    SubLFiles.declareFunction( me, "destroy_kb_hl_supports_with_invalid_hl_supports", "DESTROY-KB-HL-SUPPORTS-WITH-INVALID-HL-SUPPORTS", 0, 0, false );
    SubLFiles.declareFunction( me, "possibly_reify_hl_supports", "POSSIBLY-REIFY-HL-SUPPORTS", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_reify_hl_support", "POSSIBLY-REIFY-HL-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_unreify_kb_hl_supports", "POSSIBLY-UNREIFY-KB-HL-SUPPORTS", 1, 0, false );
    SubLFiles.declareFunction( me, "unreify_kb_hl_supports", "UNREIFY-KB-HL-SUPPORTS", 1, 0, false );
    SubLFiles.declareFunction( me, "unreify_kb_hl_support", "UNREIFY-KB-HL-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "random_kb_hl_support", "RANDOM-KB-HL-SUPPORT", 0, 1, false );
    SubLFiles.declareFunction( me, "sample_kb_hl_supports", "SAMPLE-KB-HL-SUPPORTS", 0, 3, false );
    SubLFiles.declareFunction( me, "kb_hl_supports_around_kb_hl_support", "KB-HL-SUPPORTS-AROUND-KB-HL-SUPPORT", 1, 3, false );
    SubLFiles.declareFunction( me, "kb_hl_supports_around", "KB-HL-SUPPORTS-AROUND", 1, 3, false );
    SubLFiles.declareFunction( me, "kb_hl_support_dump_id", "KB-HL-SUPPORT-DUMP-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "find_kb_hl_support_by_dump_id", "FIND-KB-HL-SUPPORT-BY-DUMP-ID", 1, 0, false );
    SubLFiles.declareMacro( me, "with_kb_hl_support_dump_id_table", "WITH-KB-HL-SUPPORT-DUMP-ID-TABLE" );
    SubLFiles.declareFunction( me, "dump_kb_hl_support_indexing_int", "DUMP-KB-HL-SUPPORT-INDEXING-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "load_kb_hl_support_indexing_int", "LOAD-KB-HL-SUPPORT-INDEXING-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "invalid_kb_hl_supportP", "INVALID-KB-HL-SUPPORT?", 1, 0, false );
    SubLFiles.declareFunction( me, "invalid_kb_hl_support_robustP", "INVALID-KB-HL-SUPPORT-ROBUST?", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_hl_support_has_problemsP", "KB-HL-SUPPORT-HAS-PROBLEMS?", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_hl_support_not_findable_by_hl_supportP", "KB-HL-SUPPORT-NOT-FINDABLE-BY-HL-SUPPORT?", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_hl_support_circularP", "KB-HL-SUPPORT-CIRCULAR?", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_hl_support_circularP_int", "KB-HL-SUPPORT-CIRCULAR?-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "kb_hl_support_has_invalid_dependentP", "KB-HL-SUPPORT-HAS-INVALID-DEPENDENT?", 1, 1, false );
    SubLFiles.declareFunction( me, "kb_hl_support_has_invalid_argumentP", "KB-HL-SUPPORT-HAS-INVALID-ARGUMENT?", 1, 1, false );
    SubLFiles.declareFunction( me, "kb_hl_support_has_invalid_hl_supportP", "KB-HL-SUPPORT-HAS-INVALID-HL-SUPPORT?", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_hl_support_has_missing_backpointerP", "KB-HL-SUPPORT-HAS-MISSING-BACKPOINTER?", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_hl_support_has_dependent_with_supportP", "KB-HL-SUPPORT-HAS-DEPENDENT-WITH-SUPPORT?", 2, 0, false );
    SubLFiles.declareFunction( me, "kb_hl_supports_not_findable_by_hl_support", "KB-HL-SUPPORTS-NOT-FINDABLE-BY-HL-SUPPORT", 0, 0, false );
    SubLFiles.declareFunction( me, "circular_kb_hl_supports", "CIRCULAR-KB-HL-SUPPORTS", 0, 0, false );
    SubLFiles.declareFunction( me, "duplicate_kb_hl_supports", "DUPLICATE-KB-HL-SUPPORTS", 0, 0, false );
    SubLFiles.declareFunction( me, "kb_hl_supports_with_invalid_dependents", "KB-HL-SUPPORTS-WITH-INVALID-DEPENDENTS", 0, 1, false );
    SubLFiles.declareFunction( me, "kb_hl_supports_with_invalid_arguments", "KB-HL-SUPPORTS-WITH-INVALID-ARGUMENTS", 0, 1, false );
    SubLFiles.declareFunction( me, "kb_hl_supports_with_invalid_hl_supports", "KB-HL-SUPPORTS-WITH-INVALID-HL-SUPPORTS", 0, 0, false );
    SubLFiles.declareFunction( me, "kb_hl_supports_with_missing_backpointers", "KB-HL-SUPPORTS-WITH-MISSING-BACKPOINTERS", 0, 0, false );
    SubLFiles.declareFunction( me, "verify_kb_hl_supports", "VERIFY-KB-HL-SUPPORTS", 0, 2, false );
    SubLFiles.declareFunction( me, "verify_kb_hl_support_indexing", "VERIFY-KB-HL-SUPPORT-INDEXING", 0, 1, false );
    SubLFiles.declareFunction( me, "report_kb_hl_support_indexing_failures", "REPORT-KB-HL-SUPPORT-INDEXING-FAILURES", 2, 1, false );
    SubLFiles.declareFunction( me, "verify_kb_hl_supports_non_circular", "VERIFY-KB-HL-SUPPORTS-NON-CIRCULAR", 0, 1, false );
    SubLFiles.declareFunction( me, "report_circular_kb_hl_supports", "REPORT-CIRCULAR-KB-HL-SUPPORTS", 2, 1, false );
    SubLFiles.declareFunction( me, "verify_kb_hl_support_uniqueness", "VERIFY-KB-HL-SUPPORT-UNIQUENESS", 0, 1, false );
    SubLFiles.declareFunction( me, "report_duplicate_kb_hl_supports", "REPORT-DUPLICATE-KB-HL-SUPPORTS", 2, 1, false );
    SubLFiles.declareFunction( me, "verify_kb_hl_support_dependents", "VERIFY-KB-HL-SUPPORT-DEPENDENTS", 0, 1, false );
    SubLFiles.declareFunction( me, "report_kb_hl_supports_with_invalid_dependents", "REPORT-KB-HL-SUPPORTS-WITH-INVALID-DEPENDENTS", 2, 1, false );
    SubLFiles.declareFunction( me, "verify_kb_hl_support_arguments", "VERIFY-KB-HL-SUPPORT-ARGUMENTS", 0, 1, false );
    SubLFiles.declareFunction( me, "report_kb_hl_supports_with_invalid_arguments", "REPORT-KB-HL-SUPPORTS-WITH-INVALID-ARGUMENTS", 2, 1, false );
    SubLFiles.declareFunction( me, "verify_kb_hl_support_hl_supports", "VERIFY-KB-HL-SUPPORT-HL-SUPPORTS", 0, 1, false );
    SubLFiles.declareFunction( me, "report_kb_hl_supports_with_invalid_hl_supports", "REPORT-KB-HL-SUPPORTS-WITH-INVALID-HL-SUPPORTS", 2, 1, false );
    SubLFiles.declareFunction( me, "verify_kb_hl_support_backpointers", "VERIFY-KB-HL-SUPPORT-BACKPOINTERS", 0, 1, false );
    SubLFiles.declareFunction( me, "report_kb_hl_supports_with_missing_backpointers", "REPORT-KB-HL-SUPPORTS-WITH-MISSING-BACKPOINTERS", 2, 1, false );
    SubLFiles.declareFunction( me, "enqueueing_kb_hl_supports_for_tmsP_int", "ENQUEUEING-KB-HL-SUPPORTS-FOR-TMS?-INT", 0, 0, false );
    SubLFiles.declareFunction( me, "enqueueing_kb_hl_supports_for_tmsP", "ENQUEUEING-KB-HL-SUPPORTS-FOR-TMS?", 0, 0, false );
    SubLFiles.declareMacro( me, "with_kb_hl_support_rejustification", "WITH-KB-HL-SUPPORT-REJUSTIFICATION" );
    SubLFiles.declareFunction( me, "process_tms_kb_hl_support_queue", "PROCESS-TMS-KB-HL-SUPPORT-QUEUE", 0, 0, false );
    SubLFiles.declareFunction( me, "enqueue_kb_hl_support_for_tms", "ENQUEUE-KB-HL-SUPPORT-FOR-TMS", 1, 0, false );
    SubLFiles.declareFunction( me, "rejustify_or_remove_kb_hl_support", "REJUSTIFY-OR-REMOVE-KB-HL-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "tms_possibly_rejustify_kb_hl_support", "TMS-POSSIBLY-REJUSTIFY-KB-HL-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_rejustify_kb_hl_support", "POSSIBLY-REJUSTIFY-KB-HL-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "verify_kb_hl_support", "VERIFY-KB-HL-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "handle_unverifiable_kb_hl_support", "HANDLE-UNVERIFIABLE-KB-HL-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "tms_remove_kb_hl_supports_mentioning_term", "TMS-REMOVE-KB-HL-SUPPORTS-MENTIONING-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "tms_remove_kb_hl_support", "TMS-REMOVE-KB-HL-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "bootstrap_kb_hl_supports", "BOOTSTRAP-KB-HL-SUPPORTS", 0, 1, false );
    SubLFiles.declareFunction( me, "bootstrap_kb_hl_supports_for_deduction", "BOOTSTRAP-KB-HL-SUPPORTS-FOR-DEDUCTION", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_kb_hl_supports_high_file()
  {
    $unreify_kb_hl_supportsP$ = SubLFiles.defparameter( "*UNREIFY-KB-HL-SUPPORTS?*", NIL );
    $kb_hl_support_dump_id_table$ = SubLFiles.defparameter( "*KB-HL-SUPPORT-DUMP-ID-TABLE*", NIL );
    $tms_kb_hl_support_queue$ = SubLFiles.defparameter( "*TMS-KB-HL-SUPPORT-QUEUE*", NIL );
    $debug_bootstrap_kb_hl_supports_seconds$ = SubLFiles.defparameter( "*DEBUG-BOOTSTRAP-KB-HL-SUPPORTS-SECONDS*", NIL );
    return NIL;
  }

  public static SubLObject setup_kb_hl_supports_high_file()
  {
    access_macros.register_macro_helper( $sym72$ENQUEUEING_KB_HL_SUPPORTS_FOR_TMS_, $sym73$WITH_KB_HL_SUPPORT_REJUSTIFICATION );
    access_macros.register_macro_helper( $sym78$PROCESS_TMS_KB_HL_SUPPORT_QUEUE, $sym73$WITH_KB_HL_SUPPORT_REJUSTIFICATION );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_kb_hl_supports_high_file();
  }

  @Override
  public void initializeVariables()
  {
    init_kb_hl_supports_high_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_kb_hl_supports_high_file();
  }
  static
  {
    me = new kb_hl_supports_high();
    $unreify_kb_hl_supportsP$ = null;
    $kb_hl_support_dump_id_table$ = null;
    $tms_kb_hl_support_queue$ = null;
    $debug_bootstrap_kb_hl_supports_seconds$ = null;
    $list0 = ConsesLow.list( ConsesLow.list( makeSymbol( "ARGUMENT-VAR" ), makeSymbol( "KB-HL-SUPPORT" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list1 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw2$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw3$DONE = makeKeyword( "DONE" );
    $sym4$DO_LIST = makeSymbol( "DO-LIST" );
    $sym5$KB_KB_HL_SUPPORT_ARGUMENTS = makeSymbol( "KB-KB-HL-SUPPORT-ARGUMENTS" );
    $list6 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEPENDENT-VAR" ), makeSymbol( "KB-HL-SUPPORT" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym7$DO_SET_CONTENTS = makeSymbol( "DO-SET-CONTENTS" );
    $sym8$KB_KB_HL_SUPPORT_DEPENDENTS = makeSymbol( "KB-KB-HL-SUPPORT-DEPENDENTS" );
    $list9 = ConsesLow.list( ConsesLow.list( makeSymbol( "SUPPORT-VAR" ), makeSymbol( "KB-HL-SUPPORT" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym10$KB_HL_SUPPORT_JUSTIFICATION = makeSymbol( "KB-HL-SUPPORT-JUSTIFICATION" );
    $list11 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "&KEY" ), makeSymbol( "NUM" ), ConsesLow.list( makeSymbol( "PROGRESS-MESSAGE" ), makeString( "mapping kb-hl-supports for sweep" ) ),
        makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list12 = ConsesLow.list( makeKeyword( "NUM" ), makeKeyword( "PROGRESS-MESSAGE" ), makeKeyword( "DONE" ) );
    $kw13$NUM = makeKeyword( "NUM" );
    $kw14$PROGRESS_MESSAGE = makeKeyword( "PROGRESS-MESSAGE" );
    $str15$mapping_kb_hl_supports_for_sweep = makeString( "mapping kb-hl-supports for sweep" );
    $sym16$PIF = makeSymbol( "PIF" );
    $sym17$POSITIVE_INTEGER_P = makeSymbol( "POSITIVE-INTEGER-P" );
    $sym18$PROGRESS_CSOME = makeSymbol( "PROGRESS-CSOME" );
    $sym19$KB_HL_SUPPORTS_AROUND = makeSymbol( "KB-HL-SUPPORTS-AROUND" );
    $list20 = ConsesLow.list( makeSymbol( "NEXT-KB-HL-SUPPORT-ID" ) );
    $sym21$DO_KB_HL_SUPPORTS = makeSymbol( "DO-KB-HL-SUPPORTS" );
    $sym22$KB_HL_SUPPORT_P = makeSymbol( "KB-HL-SUPPORT-P" );
    $str23$Eliminating_invalid_KB_HL_support = makeString( "Eliminating invalid KB HL support dependents" );
    $sym24$STRINGP = makeSymbol( "STRINGP" );
    $kw25$SKIP = makeKeyword( "SKIP" );
    $sym26$VALID_DEDUCTION_ = makeSymbol( "VALID-DEDUCTION?" );
    $str27$Eliminating_KB_HL_supports_with_i = makeString( "Eliminating KB HL supports with invalid HL supports" );
    $sym28$POSSIBLY_REIFY_HL_SUPPORT = makeSymbol( "POSSIBLY-REIFY-HL-SUPPORT" );
    $sym29$UNREIFY_KB_HL_SUPPORT = makeSymbol( "UNREIFY-KB-HL-SUPPORT" );
    $sym30$TRUE = makeSymbol( "TRUE" );
    $int31$500 = makeInteger( 500 );
    $sym32$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $int33$100 = makeInteger( 100 );
    $sym34$FIND_KB_HL_SUPPORT_BY_ID = makeSymbol( "FIND-KB-HL-SUPPORT-BY-ID" );
    $sym35$CLET = makeSymbol( "CLET" );
    $list36 = ConsesLow.list( ConsesLow.list( makeSymbol( "*KB-HL-SUPPORT-DUMP-ID-TABLE*" ), ConsesLow.list( makeSymbol( "CREATE-KB-HL-SUPPORT-DUMP-ID-TABLE" ) ) ), ConsesLow.list( makeSymbol(
        "*CFASL-KB-HL-SUPPORT-HANDLE-FUNC*" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "KB-HL-SUPPORT-DUMP-ID" ) ) ) );
    $sym37$SUPPORT_P = makeSymbol( "SUPPORT-P" );
    $str38$Verifying_KB_HL_support_indexing = makeString( "Verifying KB HL support indexing" );
    $str39$Searching_for_circular_KB_HL_supp = makeString( "Searching for circular KB HL supports" );
    $str40$Searching_for_duplicate_KB_HL_sup = makeString( "Searching for duplicate KB HL supports" );
    $sym41$_ = makeSymbol( "<" );
    $sym42$KB_HL_SUPPORT_ID = makeSymbol( "KB-HL-SUPPORT-ID" );
    $str43$Searching_for_KB_HL_supports_with = makeString( "Searching for KB HL supports with invalid dependents" );
    $str44$Searching_for_KB_HL_supports_with = makeString( "Searching for KB HL supports with invalid arguments" );
    $str45$Searching_for_KB_HL_supports_with = makeString( "Searching for KB HL supports with invalid HL supports" );
    $str46$Searching_for_KB_HL_supports_with = makeString( "Searching for KB HL supports with missing backpointers" );
    $sym47$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $str48$Verifying_KB_HL_supports = makeString( "Verifying KB HL supports" );
    $str49$__Error_during_KB_HL_support_veri = makeString( "~&Error during KB HL support verification: ~a~%" );
    $str50$__Error_during_indexing_verificat = makeString( "~&Error during indexing verification: ~a~%" );
    $str51$__The_following_KB_HL_supports_we = makeString( "~&The following KB HL supports were not findable via their HL supports (~s in total):~%" );
    $str52$__s__s__ = makeString( " ~s ~s~%" );
    $str53$___s_KB_HL_supports_are_not_finda = makeString( "~&~s KB HL supports are not findable via their HL supports.~%" );
    $str54$__Error_during_non_circularity_ve = makeString( "~&Error during non-circularity verification: ~a~%" );
    $str55$__The_following_KB_HL_supports_ar = makeString( "~&The following KB HL supports are circular (~s in total):~%" );
    $str56$___s_KB_HL_supports_are_circular_ = makeString( "~&~s KB HL supports are circular.~%" );
    $str57$__Error_during_uniqueness_verific = makeString( "~&Error during uniqueness verification: ~a~%" );
    $str58$__The_following_KB_HL_supports_ha = makeString( "~&The following KB HL supports have duplicates (~s in total):~%" );
    $str59$___s_KB_HL_supports_have_duplicat = makeString( "~&~s KB HL supports have duplicates.~%" );
    $str60$__Error_during_dependent_verifica = makeString( "~&Error during dependent verification: ~a~%" );
    $str61$__The_following_KB_HL_supports_ha = makeString( "~&The following KB HL supports have invalid dependents (~s in total):~%" );
    $str62$___s_KB_HL_supports_have_invalid_ = makeString( "~&~s KB HL supports have invalid dependents.~%" );
    $str63$__Error_during_argument_verificat = makeString( "~&Error during argument verification: ~a~%" );
    $str64$__The_following_KB_HL_supports_ha = makeString( "~&The following KB HL supports have invalid arguments (~s in total):~%" );
    $str65$___s_KB_HL_supports_have_invalid_ = makeString( "~&~s KB HL supports have invalid arguments.~%" );
    $str66$__Error_during_HL_support_verific = makeString( "~&Error during HL support verification: ~a~%" );
    $str67$__The_following_KB_HL_supports_ha = makeString( "~&The following KB HL supports have invalid HL supports (~s in total):~%" );
    $str68$___s_KB_HL_supports_have_invalid_ = makeString( "~&~s KB HL supports have invalid HL supports.~%" );
    $str69$__Error_during_KB_HL_support_back = makeString( "~&Error during KB HL support backpointer verification: ~a~%" );
    $str70$__The_following_KB_HL_supports_ha = makeString( "~&The following KB HL supports have missing backpointers (~s in total):~%" );
    $str71$___s_KB_HL_supports_have_missing_ = makeString( "~&~s KB HL supports have missing backpointers.~%" );
    $sym72$ENQUEUEING_KB_HL_SUPPORTS_FOR_TMS_ = makeSymbol( "ENQUEUEING-KB-HL-SUPPORTS-FOR-TMS?" );
    $sym73$WITH_KB_HL_SUPPORT_REJUSTIFICATION = makeSymbol( "WITH-KB-HL-SUPPORT-REJUSTIFICATION" );
    $list74 = ConsesLow.list( makeSymbol( "ENQUEUEING-KB-HL-SUPPORTS-FOR-TMS?" ) );
    $sym75$PROGN = makeSymbol( "PROGN" );
    $list76 = ConsesLow.list( ConsesLow.list( makeSymbol( "*TMS-KB-HL-SUPPORT-QUEUE*" ), ConsesLow.list( makeSymbol( "CREATE-QUEUE" ) ) ) );
    $list77 = ConsesLow.list( ConsesLow.list( makeSymbol( "PROCESS-TMS-KB-HL-SUPPORT-QUEUE" ) ) );
    $sym78$PROCESS_TMS_KB_HL_SUPPORT_QUEUE = makeSymbol( "PROCESS-TMS-KB-HL-SUPPORT-QUEUE" );
    $sym79$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ = makeSymbol( "*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*" );
    $list80 = ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*" ), NIL );
    $sym81$CSETQ = makeSymbol( "CSETQ" );
    $str82$_A = makeString( "~A" );
    $kw83$UNJUSTIFIABLE = makeKeyword( "UNJUSTIFIABLE" );
    $sym84$TMS_FORT_TO_KILL_ = makeSymbol( "TMS-FORT-TO-KILL?" );
    $str85$Bootstrapping_KB_HL_supports = makeString( "Bootstrapping KB HL supports" );
    $str86$Slow_reification_of_ = makeString( "Slow reification of " );
    $str87$Could_not_create_KB_HL_support_fo = makeString( "Could not create KB HL support for ~s because ~a" );
    $str88$Created_invalid_KB_HL_support_for = makeString( "Created invalid KB HL support for ~s" );
  }
}
/*
 * 
 * Total time: 1069 ms
 * 
 */