package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class deductions_high
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.deductions_high";
  public static final String myFingerPrint = "a039d6d2e83a3ce998f53b8cf341cdd51d0d90353ce2e360e427ff276caa2c13";
  @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 13399L)
  public static SubLSymbol $deduction_dump_id_table$;
  private static final SubLList $list0;
  private static final SubLList $list1;
  private static final SubLSymbol $kw2$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw3$DONE;
  private static final SubLSymbol $sym4$DO_LIST;
  private static final SubLSymbol $sym5$DEDUCTION_SUPPORTS;
  private static final SubLList $list6;
  private static final SubLList $list7;
  private static final SubLSymbol $kw8$PROGRESS_MESSAGE;
  private static final SubLSymbol $sym9$PROGRESS_MESSAGE_VAR;
  private static final SubLSymbol $sym10$CLET;
  private static final SubLSymbol $sym11$DO_DEDUCTIONS_BACKWARDS;
  private static final SubLSymbol $sym12$SOFAR_VAR;
  private static final SubLSymbol $sym13$TOTAL_VAR;
  private static final SubLList $list14;
  private static final SubLList $list15;
  private static final SubLSymbol $sym16$NOTING_PERCENT_PROGRESS;
  private static final SubLSymbol $sym17$NOTE_PERCENT_PROGRESS;
  private static final SubLSymbol $sym18$CINC;
  private static final SubLSymbol $sym19$ID_VAR;
  private static final SubLSymbol $sym20$DO_NUMBERS;
  private static final SubLSymbol $kw21$START;
  private static final SubLList $list22;
  private static final SubLSymbol $kw23$END;
  private static final SubLSymbol $kw24$DELTA;
  private static final SubLSymbol $sym25$FIND_DEDUCTION_BY_ID;
  private static final SubLSymbol $sym26$PWHEN;
  private static final SubLList $list27;
  private static final SubLList $list28;
  private static final SubLSymbol $kw29$NUM;
  private static final SubLString $str30$mapping_deductions_for_sweep;
  private static final SubLSymbol $sym31$PIF;
  private static final SubLSymbol $sym32$POSITIVE_INTEGER_P;
  private static final SubLSymbol $sym33$PROGRESS_CSOME;
  private static final SubLSymbol $sym34$DEDUCTIONS_AROUND;
  private static final SubLSymbol $sym35$DO_DEDUCTIONS;
  private static final SubLSymbol $kw36$DEDUCTION;
  private static final SubLSymbol $sym37$HL_JUSTIFICATION_P;
  private static final SubLSymbol $sym38$BINDINGS_P;
  private static final SubLSymbol $sym39$LISTP;
  private static final SubLSymbol $sym40$DEDUCTION_P;
  private static final SubLSymbol $kw41$TRUE;
  private static final SubLSymbol $sym42$TRUE;
  private static final SubLInteger $int43$500;
  private static final SubLSymbol $sym44$NON_NEGATIVE_INTEGER_P;
  private static final SubLSymbol $sym45$SUPPORT_EQUAL;
  private static final SubLObject $const46$skolem;
  private static final SubLSymbol $sym47$DEDUCTION_ASSERTION;
  private static final SubLList $list48;
  private static final SubLString $str49$Return_the_support_for_which_DEDU;
  private static final SubLList $list50;
  private static final SubLList $list51;
  private static final SubLSymbol $sym52$DEDUCTION_SUPPORTED_OBJECT;
  private static final SubLSymbol $kw53$UNKNOWN;
  private static final SubLSymbol $sym54$DEDUCTION_TRUTH;
  private static final SubLString $str55$Return_the_truth_of_DEDUCTION____;
  private static final SubLList $list56;
  private static final SubLSymbol $sym57$DEDUCTION_STRENGTH;
  private static final SubLString $str58$Return_the_current_argumentation_;
  private static final SubLList $list59;
  private static final SubLList $list60;
  private static final SubLList $list61;
  private static final SubLInteger $int62$100;

  @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 935L)
  public static SubLObject do_deduction_supports(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject support = NIL;
    SubLObject deduction = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    support = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    deduction = current.first();
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
    return ConsesLow.listS( $sym4$DO_LIST, ConsesLow.list( support, ConsesLow.list( $sym5$DEDUCTION_SUPPORTS, deduction ), $kw3$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 1368L)
  public static SubLObject do_deductions_backwards(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject deduction_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    deduction_var = current.first();
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
      if( NIL == conses_high.member( current_$2, $list7, UNPROVIDED, UNPROVIDED ) )
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
    final SubLObject progress_message_tail = cdestructuring_bind.property_list_member( $kw8$PROGRESS_MESSAGE, current );
    final SubLObject progress_message = ( NIL != progress_message_tail ) ? conses_high.cadr( progress_message_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw3$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( !progress_message.isAtom() )
    {
      final SubLObject progress_message_var = $sym9$PROGRESS_MESSAGE_VAR;
      return ConsesLow.list( $sym10$CLET, ConsesLow.list( ConsesLow.list( progress_message_var, progress_message ) ), ConsesLow.listS( $sym11$DO_DEDUCTIONS_BACKWARDS, ConsesLow.list( deduction_var, $kw8$PROGRESS_MESSAGE,
          progress_message_var, $kw3$DONE, done ), ConsesLow.append( body, NIL ) ) );
    }
    if( NIL != progress_message )
    {
      final SubLObject sofar_var = $sym12$SOFAR_VAR;
      final SubLObject total_var = $sym13$TOTAL_VAR;
      return ConsesLow.list( $sym10$CLET, ConsesLow.list( reader.bq_cons( total_var, $list14 ), reader.bq_cons( sofar_var, $list15 ) ), ConsesLow.list( $sym16$NOTING_PERCENT_PROGRESS, progress_message, ConsesLow.listS(
          $sym11$DO_DEDUCTIONS_BACKWARDS, ConsesLow.list( deduction_var, $kw3$DONE, done ), ConsesLow.list( $sym17$NOTE_PERCENT_PROGRESS, sofar_var, total_var ), ConsesLow.list( $sym18$CINC, sofar_var ), ConsesLow
              .append( body, NIL ) ) ) );
    }
    final SubLObject id_var = $sym19$ID_VAR;
    return ConsesLow.list( $sym20$DO_NUMBERS, ConsesLow.list( new SubLObject[] { id_var, $kw21$START, $list22, $kw23$END, MINUS_ONE_INTEGER, $kw24$DELTA, MINUS_ONE_INTEGER, $kw3$DONE, done
    } ), ConsesLow.list( $sym10$CLET, ConsesLow.list( ConsesLow.list( deduction_var, ConsesLow.list( $sym25$FIND_DEDUCTION_BY_ID, id_var ) ) ), ConsesLow.listS( $sym26$PWHEN, deduction_var, ConsesLow.append( body,
        NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 2421L)
  public static SubLObject do_recent_deductions(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list27 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list27 );
    var = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$3 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list27 );
      current_$3 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list27 );
      if( NIL == conses_high.member( current_$3, $list28, UNPROVIDED, UNPROVIDED ) )
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
      cdestructuring_bind.cdestructuring_bind_error( datum, $list27 );
    }
    final SubLObject num_tail = cdestructuring_bind.property_list_member( $kw29$NUM, current );
    final SubLObject num = ( NIL != num_tail ) ? conses_high.cadr( num_tail ) : NIL;
    final SubLObject progress_message_tail = cdestructuring_bind.property_list_member( $kw8$PROGRESS_MESSAGE, current );
    final SubLObject progress_message = ( NIL != progress_message_tail ) ? conses_high.cadr( progress_message_tail ) : $str30$mapping_deductions_for_sweep;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw3$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym31$PIF, ConsesLow.list( $sym32$POSITIVE_INTEGER_P, num ), ConsesLow.listS( $sym33$PROGRESS_CSOME, ConsesLow.list( var, ConsesLow.list( $sym34$DEDUCTIONS_AROUND, $list22, num, num ),
        progress_message, done ), ConsesLow.append( body, NIL ) ), ConsesLow.listS( $sym35$DO_DEDUCTIONS, ConsesLow.list( var, progress_message, $kw3$DONE, done ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 2998L)
  public static SubLObject deduction_spec_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isCons() && $kw36$DEDUCTION == v_object.first() && NIL != arguments.non_empty_hl_justification_p( conses_high.second( v_object ) ) && ( NIL == conses_high.third( v_object )
        || NIL != bindings.bindings_p( conses_high.third( v_object ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 3456L)
  public static SubLObject create_deduction_spec(final SubLObject supports, SubLObject v_bindings, SubLObject pragmatic_support_mts)
  {
    if( v_bindings == UNPROVIDED )
    {
      v_bindings = NIL;
    }
    if( pragmatic_support_mts == UNPROVIDED )
    {
      pragmatic_support_mts = NIL;
    }
    assert NIL != arguments.hl_justification_p( supports ) : supports;
    assert NIL != bindings.bindings_p( v_bindings ) : v_bindings;
    assert NIL != Types.listp( pragmatic_support_mts ) : pragmatic_support_mts;
    final SubLObject canon_supports = arguments.canonicalize_supports( supports, T );
    return ConsesLow.list( $kw36$DEDUCTION, canon_supports, v_bindings, pragmatic_support_mts );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 3805L)
  public static SubLObject deduction_to_deduction_spec(final SubLObject deduction)
  {
    assert NIL != deduction_handles.deduction_p( deduction ) : deduction;
    final SubLObject supports = deduction_supports( deduction );
    final SubLObject v_bindings = deduction_bindings( deduction );
    final SubLObject pragmatic_support_mts = deduction_pragmatic_support_mts( deduction );
    final SubLObject deduction_spec = create_deduction_spec( supports, v_bindings, pragmatic_support_mts );
    return deduction_spec;
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 4174L)
  public static SubLObject deduction_spec_supports(final SubLObject deduction_spec)
  {
    return ConsesLow.nth( ONE_INTEGER, deduction_spec );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 4324L)
  public static SubLObject deduction_spec_bindings(final SubLObject deduction_spec)
  {
    return ConsesLow.nth( TWO_INTEGER, deduction_spec );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 4474L)
  public static SubLObject deduction_spec_pragmatic_support_mts(final SubLObject deduction_spec)
  {
    return ConsesLow.nth( THREE_INTEGER, deduction_spec );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 4650L)
  public static SubLObject create_deduction_with_tv(final SubLObject assertion, final SubLObject supports, final SubLObject tv, SubLObject v_bindings, SubLObject pragmatic_support_mts)
  {
    if( v_bindings == UNPROVIDED )
    {
      v_bindings = NIL;
    }
    if( pragmatic_support_mts == UNPROVIDED )
    {
      pragmatic_support_mts = NIL;
    }
    final SubLObject deduction = create_deduction( assertion, supports, enumeration_types.tv_truth( tv ), enumeration_types.tv_strength( tv ), v_bindings, pragmatic_support_mts );
    return deduction;
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 5052L)
  public static SubLObject create_deduction_for_hl_support(final SubLObject hl_support, final SubLObject justification)
  {
    final SubLObject tv = arguments.hl_support_tv( hl_support );
    final SubLObject deduction = create_deduction_with_tv( hl_support, justification, tv, UNPROVIDED, UNPROVIDED );
    return deduction;
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 5313L)
  public static SubLObject create_deduction(final SubLObject assertion, final SubLObject supports, final SubLObject truth, final SubLObject strength, SubLObject v_bindings, SubLObject pragmatic_support_mts)
  {
    if( v_bindings == UNPROVIDED )
    {
      v_bindings = NIL;
    }
    if( pragmatic_support_mts == UNPROVIDED )
    {
      pragmatic_support_mts = NIL;
    }
    return deductions_interface.kb_create_deduction( assertion, supports, truth, strength, v_bindings, pragmatic_support_mts );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 5519L)
  public static SubLObject remove_deduction(final SubLObject deduction)
  {
    return deductions_interface.kb_remove_deduction( deduction );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 5605L)
  public static SubLObject set_deduction_strength(final SubLObject deduction, final SubLObject new_strength)
  {
    return deductions_interface.kb_set_deduction_strength( deduction, new_strength );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 5802L)
  public static SubLObject find_deduction(final SubLObject supported_object, final SubLObject supports, SubLObject truth)
  {
    if( truth == UNPROVIDED )
    {
      truth = $kw41$TRUE;
    }
    return deductions_interface.kb_lookup_deduction( supported_object, supports, truth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 6127L)
  public static SubLObject random_deduction(SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( $sym42$TRUE );
    }
    if( deduction_handles.deduction_count().numG( ZERO_INTEGER ) )
    {
      final SubLObject max_id = deduction_handles.next_deduction_id();
      SubLObject v_answer;
      SubLObject candidate;
      for( v_answer = NIL; NIL == v_answer; v_answer = candidate )
      {
        candidate = deduction_handles.find_deduction_by_id( random.random( max_id ) );
        if( NIL != candidate && NIL != Functions.funcall( test, candidate ) )
        {
        }
      }
      return v_answer;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 6583L)
  public static SubLObject sample_deductions(SubLObject n, SubLObject allow_repeatsP, SubLObject test)
  {
    if( n == UNPROVIDED )
    {
      n = $int43$500;
    }
    if( allow_repeatsP == UNPROVIDED )
    {
      allow_repeatsP = NIL;
    }
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( $sym42$TRUE );
    }
    assert NIL != subl_promotions.non_negative_integer_p( n ) : n;
    if( NIL != allow_repeatsP )
    {
      SubLObject result = NIL;
      SubLObject i;
      for( i = NIL, i = ZERO_INTEGER; i.numL( n ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        result = ConsesLow.cons( random_deduction( test ), result );
      }
      return result;
    }
    SubLObject result;
    for( result = set_contents.new_set_contents( n, Symbols.symbol_function( EQL ) ); set_contents.set_contents_size( result ).numL( n ); result = set_contents.set_contents_add( random_deduction( test ), result, Symbols
        .symbol_function( EQL ) ) )
    {
    }
    return set_contents.set_contents_element_list( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 7177L)
  public static SubLObject deduction_supports_equal(final SubLObject supports1, final SubLObject supports2)
  {
    return makeBoolean( Sequences.length( supports1 ).numE( Sequences.length( supports2 ) ) && NIL != list_utilities.sets_equalP( supports1, supports2, $sym45$SUPPORT_EQUAL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 7429L)
  public static SubLObject deduction_equal(final SubLObject deduction1, final SubLObject deduction2)
  {
    return makeBoolean( deduction_supported_object( deduction1 ).equal( deduction_supported_object( deduction2 ) ) && arguments.argument_truth( deduction1 ).eql( arguments.argument_truth( deduction2 ) )
        && NIL != deduction_supports_equal( deduction_supports( deduction1 ), deduction_supports( deduction2 ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 7874L)
  public static SubLObject invalid_deduction(final SubLObject deduction, SubLObject robust)
  {
    if( robust == UNPROVIDED )
    {
      robust = NIL;
    }
    return makeBoolean( NIL != deduction_handles.deduction_p( deduction ) && NIL == deduction_handles.valid_deduction( deduction, robust ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 8138L)
  public static SubLObject forward_deductionP(final SubLObject deduction)
  {
    return forward_deduction_intP( deduction, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 8347L)
  public static SubLObject forward_not_code_deductionP(final SubLObject deduction)
  {
    return forward_deduction_intP( deduction, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 8559L)
  public static SubLObject forward_deduction_intP(final SubLObject deduction, final SubLObject include_code_assertionsP)
  {
    if( NIL != deduction_handles.deduction_p( deduction ) )
    {
      SubLObject shyP;
      SubLObject rest;
      SubLObject support;
      for( shyP = NIL, rest = NIL, rest = deduction_supports( deduction ); NIL == shyP && NIL != rest; shyP = makeBoolean( NIL == assertions_high.forward_assertionP( support ) && ( NIL == include_code_assertionsP
          || NIL == assertions_high.code_assertionP( support ) ) && NIL == kb_hl_support_handles.kb_hl_support_p( support ) && NIL == arguments.hl_support_p( support ) ), rest = rest.rest() )
      {
        support = rest.first();
      }
      return makeBoolean( NIL == shyP );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 9024L)
  public static SubLObject lifting_deduction_p(final SubLObject deduction)
  {
    if( NIL != deduction_handles.deduction_p( deduction ) )
    {
      if( NIL != kb_accessors.decontextualized_assertionP( deduction_supported_object( deduction ) ) )
      {
        return T;
      }
      SubLObject cdolist_list_var = deduction_supports( deduction );
      SubLObject support = NIL;
      support = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != assertions_high.lifting_assertion_p( support ) )
        {
          return T;
        }
        cdolist_list_var = cdolist_list_var.rest();
        support = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 9453L)
  public static SubLObject skolem_deduction_p(final SubLObject deduction)
  {
    return assertion_utilities.gaf_assertion_with_pred_p( deduction_supported_object( deduction ), $const46$skolem );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 9666L)
  public static SubLObject deduction_assertion(final SubLObject deduction)
  {
    enforceType( deduction, $sym40$DEDUCTION_P );
    return ( NIL != deduction_handles.deduction_handle_validP( deduction ) ) ? deductions_interface.kb_deduction_supported_object( deduction ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 10026L)
  public static SubLObject deduction_supported_object(final SubLObject deduction)
  {
    enforceType( deduction, $sym40$DEDUCTION_P );
    return ( NIL != deduction_handles.deduction_handle_validP( deduction ) ) ? deductions_interface.kb_deduction_supported_object( deduction ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 10360L)
  public static SubLObject deduction_truth(final SubLObject deduction)
  {
    enforceType( deduction, $sym40$DEDUCTION_P );
    if( NIL == deduction_handles.deduction_handle_validP( deduction ) )
    {
      return $kw53$UNKNOWN;
    }
    return deductions_interface.kb_deduction_truth( deduction );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 10733L)
  public static SubLObject deduction_strength(final SubLObject deduction)
  {
    enforceType( deduction, $sym40$DEDUCTION_P );
    return ( NIL != deduction_handles.deduction_handle_validP( deduction ) ) ? deductions_interface.kb_deduction_strength( deduction ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 11110L)
  public static SubLObject deduction_supports(final SubLObject deduction)
  {
    assert NIL != deduction_handles.deduction_p( deduction ) : deduction;
    return ( NIL != deduction_handles.deduction_handle_validP( deduction ) ) ? kb_hl_supports_high.possibly_unreify_kb_hl_supports( deductions_interface.kb_deduction_supports( deduction ) ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 11385L)
  public static SubLObject deduction_bindings(final SubLObject deduction)
  {
    assert NIL != deduction_handles.deduction_p( deduction ) : deduction;
    return ( NIL != deduction_handles.deduction_handle_validP( deduction ) ) ? deductions_interface.kb_deduction_bindings( deduction ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 11603L)
  public static SubLObject deduction_pragmatic_support_mts(final SubLObject deduction)
  {
    assert NIL != deduction_handles.deduction_p( deduction ) : deduction;
    return ( NIL != deduction_handles.deduction_handle_validP( deduction ) ) ? deductions_interface.kb_deduction_pragmatic_support_mts( deduction ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 11860L)
  public static SubLObject deduction_mt(final SubLObject deduction)
  {
    final SubLObject supported_object = deduction_supported_object( deduction );
    return arguments.support_mt( supported_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 12109L)
  public static SubLObject deduction_id_from_recipe(final SubLObject assertion, final SubLObject supports, SubLObject truth)
  {
    if( truth == UNPROVIDED )
    {
      truth = $kw41$TRUE;
    }
    final SubLObject deduction = find_deduction( assertion, supports, truth );
    return ( NIL != deduction_handles.deduction_p( deduction ) ) ? deduction_handles.deduction_id( deduction ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 12527L)
  public static SubLObject deduction_checkpoint_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != list_utilities.proper_list_p( v_object ) && NIL != list_utilities.lengthE( v_object, TWO_INTEGER, UNPROVIDED ) && NIL != list_utilities.every_in_list( $sym44$NON_NEGATIVE_INTEGER_P,
        v_object, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 12819L)
  public static SubLObject new_deduction_checkpoint()
  {
    final SubLObject deduction_count = deduction_handles.deduction_count();
    final SubLObject next_deduction_id = deduction_handles.next_deduction_id();
    return ConsesLow.list( deduction_count, next_deduction_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 13076L)
  public static SubLObject deduction_checkpoint_currentP(final SubLObject deduction_checkpoint)
  {
    SubLObject checkpoint_count = NIL;
    SubLObject checkpoint_next_id = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( deduction_checkpoint, deduction_checkpoint, $list60 );
    checkpoint_count = deduction_checkpoint.first();
    SubLObject current = deduction_checkpoint.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, deduction_checkpoint, $list60 );
    checkpoint_next_id = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return makeBoolean( checkpoint_count.numE( deduction_handles.deduction_count() ) && checkpoint_next_id.numE( deduction_handles.next_deduction_id() ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( deduction_checkpoint, $list60 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 13507L)
  public static SubLObject deduction_dump_id(final SubLObject deduction)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject id = deduction_handles.deduction_id( deduction );
    final SubLObject dump_table = $deduction_dump_id_table$.getDynamicValue( thread );
    if( NIL != dump_table )
    {
      id = id_index.id_index_lookup( dump_table, id, UNPROVIDED );
    }
    return id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 13777L)
  public static SubLObject find_deduction_by_dump_id(final SubLObject dump_id)
  {
    return deduction_handles.find_deduction_by_id( dump_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 13869L)
  public static SubLObject with_deduction_dump_id_table(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym10$CLET, $list61, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 14081L)
  public static SubLObject deductions_around_deduction(final SubLObject deduction, SubLObject total, SubLObject before, SubLObject after)
  {
    if( total == UNPROVIDED )
    {
      total = $int62$100;
    }
    if( before == UNPROVIDED )
    {
      before = ZERO_INTEGER;
    }
    if( after == UNPROVIDED )
    {
      after = Numbers.subtract( total, before );
    }
    assert NIL != deduction_handles.deduction_p( deduction ) : deduction;
    return deductions_around( deduction_handles.deduction_id( deduction ), total, before, after );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 15251L)
  public static SubLObject deductions_around(final SubLObject deduction_id, SubLObject total, SubLObject before, SubLObject after)
  {
    if( total == UNPROVIDED )
    {
      total = $int62$100;
    }
    if( before == UNPROVIDED )
    {
      before = ZERO_INTEGER;
    }
    if( after == UNPROVIDED )
    {
      after = Numbers.subtract( total, before );
    }
    assert NIL != subl_promotions.non_negative_integer_p( deduction_id ) : deduction_id;
    return assertions_high.kb_objects_around_id( $sym25$FIND_DEDUCTION_BY_ID, ZERO_INTEGER, deduction_id, deduction_handles.next_deduction_id(), total, before, after );
  }

  public static SubLObject declare_deductions_high_file()
  {
    SubLFiles.declareMacro( me, "do_deduction_supports", "DO-DEDUCTION-SUPPORTS" );
    SubLFiles.declareMacro( me, "do_deductions_backwards", "DO-DEDUCTIONS-BACKWARDS" );
    SubLFiles.declareMacro( me, "do_recent_deductions", "DO-RECENT-DEDUCTIONS" );
    SubLFiles.declareFunction( me, "deduction_spec_p", "DEDUCTION-SPEC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "create_deduction_spec", "CREATE-DEDUCTION-SPEC", 1, 2, false );
    SubLFiles.declareFunction( me, "deduction_to_deduction_spec", "DEDUCTION-TO-DEDUCTION-SPEC", 1, 0, false );
    SubLFiles.declareFunction( me, "deduction_spec_supports", "DEDUCTION-SPEC-SUPPORTS", 1, 0, false );
    SubLFiles.declareFunction( me, "deduction_spec_bindings", "DEDUCTION-SPEC-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "deduction_spec_pragmatic_support_mts", "DEDUCTION-SPEC-PRAGMATIC-SUPPORT-MTS", 1, 0, false );
    SubLFiles.declareFunction( me, "create_deduction_with_tv", "CREATE-DEDUCTION-WITH-TV", 3, 2, false );
    SubLFiles.declareFunction( me, "create_deduction_for_hl_support", "CREATE-DEDUCTION-FOR-HL-SUPPORT", 2, 0, false );
    SubLFiles.declareFunction( me, "create_deduction", "CREATE-DEDUCTION", 4, 2, false );
    SubLFiles.declareFunction( me, "remove_deduction", "REMOVE-DEDUCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "set_deduction_strength", "SET-DEDUCTION-STRENGTH", 2, 0, false );
    SubLFiles.declareFunction( me, "find_deduction", "FIND-DEDUCTION", 2, 1, false );
    SubLFiles.declareFunction( me, "random_deduction", "RANDOM-DEDUCTION", 0, 1, false );
    SubLFiles.declareFunction( me, "sample_deductions", "SAMPLE-DEDUCTIONS", 0, 3, false );
    SubLFiles.declareFunction( me, "deduction_supports_equal", "DEDUCTION-SUPPORTS-EQUAL", 2, 0, false );
    SubLFiles.declareFunction( me, "deduction_equal", "DEDUCTION-EQUAL", 2, 0, false );
    SubLFiles.declareFunction( me, "invalid_deduction", "INVALID-DEDUCTION", 1, 1, false );
    SubLFiles.declareFunction( me, "forward_deductionP", "FORWARD-DEDUCTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_not_code_deductionP", "FORWARD-NOT-CODE-DEDUCTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_deduction_intP", "FORWARD-DEDUCTION-INT?", 2, 0, false );
    SubLFiles.declareFunction( me, "lifting_deduction_p", "LIFTING-DEDUCTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "skolem_deduction_p", "SKOLEM-DEDUCTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "deduction_assertion", "DEDUCTION-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "deduction_supported_object", "DEDUCTION-SUPPORTED-OBJECT", 1, 0, false );
    SubLFiles.declareFunction( me, "deduction_truth", "DEDUCTION-TRUTH", 1, 0, false );
    SubLFiles.declareFunction( me, "deduction_strength", "DEDUCTION-STRENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "deduction_supports", "DEDUCTION-SUPPORTS", 1, 0, false );
    SubLFiles.declareFunction( me, "deduction_bindings", "DEDUCTION-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "deduction_pragmatic_support_mts", "DEDUCTION-PRAGMATIC-SUPPORT-MTS", 1, 0, false );
    SubLFiles.declareFunction( me, "deduction_mt", "DEDUCTION-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "deduction_id_from_recipe", "DEDUCTION-ID-FROM-RECIPE", 2, 1, false );
    SubLFiles.declareFunction( me, "deduction_checkpoint_p", "DEDUCTION-CHECKPOINT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_deduction_checkpoint", "NEW-DEDUCTION-CHECKPOINT", 0, 0, false );
    SubLFiles.declareFunction( me, "deduction_checkpoint_currentP", "DEDUCTION-CHECKPOINT-CURRENT?", 1, 0, false );
    SubLFiles.declareFunction( me, "deduction_dump_id", "DEDUCTION-DUMP-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "find_deduction_by_dump_id", "FIND-DEDUCTION-BY-DUMP-ID", 1, 0, false );
    SubLFiles.declareMacro( me, "with_deduction_dump_id_table", "WITH-DEDUCTION-DUMP-ID-TABLE" );
    SubLFiles.declareFunction( me, "deductions_around_deduction", "DEDUCTIONS-AROUND-DEDUCTION", 1, 3, false );
    SubLFiles.declareFunction( me, "deductions_around", "DEDUCTIONS-AROUND", 1, 3, false );
    return NIL;
  }

  public static SubLObject init_deductions_high_file()
  {
    $deduction_dump_id_table$ = SubLFiles.defparameter( "*DEDUCTION-DUMP-ID-TABLE*", NIL );
    return NIL;
  }

  public static SubLObject setup_deductions_high_file()
  {
    utilities_macros.register_obsolete_cyc_api_function( $sym47$DEDUCTION_ASSERTION, NIL, $list48, $str49$Return_the_support_for_which_DEDU, $list50, $list51 );
    utilities_macros.register_cyc_api_function( $sym52$DEDUCTION_SUPPORTED_OBJECT, $list48, $str49$Return_the_support_for_which_DEDU, $list50, $list51 );
    utilities_macros.register_cyc_api_function( $sym54$DEDUCTION_TRUTH, $list48, $str55$Return_the_truth_of_DEDUCTION____, $list50, $list56 );
    utilities_macros.register_cyc_api_function( $sym57$DEDUCTION_STRENGTH, $list48, $str58$Return_the_current_argumentation_, $list50, $list59 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_deductions_high_file();
  }

  @Override
  public void initializeVariables()
  {
    init_deductions_high_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_deductions_high_file();
  }
  static
  {
    me = new deductions_high();
    $deduction_dump_id_table$ = null;
    $list0 = ConsesLow.list( ConsesLow.list( makeSymbol( "SUPPORT" ), makeSymbol( "DEDUCTION" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list1 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw2$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw3$DONE = makeKeyword( "DONE" );
    $sym4$DO_LIST = makeSymbol( "DO-LIST" );
    $sym5$DEDUCTION_SUPPORTS = makeSymbol( "DEDUCTION-SUPPORTS" );
    $list6 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEDUCTION-VAR" ), makeSymbol( "&KEY" ), makeSymbol( "PROGRESS-MESSAGE" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list7 = ConsesLow.list( makeKeyword( "PROGRESS-MESSAGE" ), makeKeyword( "DONE" ) );
    $kw8$PROGRESS_MESSAGE = makeKeyword( "PROGRESS-MESSAGE" );
    $sym9$PROGRESS_MESSAGE_VAR = makeUninternedSymbol( "PROGRESS-MESSAGE-VAR" );
    $sym10$CLET = makeSymbol( "CLET" );
    $sym11$DO_DEDUCTIONS_BACKWARDS = makeSymbol( "DO-DEDUCTIONS-BACKWARDS" );
    $sym12$SOFAR_VAR = makeUninternedSymbol( "SOFAR-VAR" );
    $sym13$TOTAL_VAR = makeUninternedSymbol( "TOTAL-VAR" );
    $list14 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEDUCTION-COUNT" ) ) );
    $list15 = ConsesLow.list( ZERO_INTEGER );
    $sym16$NOTING_PERCENT_PROGRESS = makeSymbol( "NOTING-PERCENT-PROGRESS" );
    $sym17$NOTE_PERCENT_PROGRESS = makeSymbol( "NOTE-PERCENT-PROGRESS" );
    $sym18$CINC = makeSymbol( "CINC" );
    $sym19$ID_VAR = makeUninternedSymbol( "ID-VAR" );
    $sym20$DO_NUMBERS = makeSymbol( "DO-NUMBERS" );
    $kw21$START = makeKeyword( "START" );
    $list22 = ConsesLow.list( makeSymbol( "NEXT-DEDUCTION-ID" ) );
    $kw23$END = makeKeyword( "END" );
    $kw24$DELTA = makeKeyword( "DELTA" );
    $sym25$FIND_DEDUCTION_BY_ID = makeSymbol( "FIND-DEDUCTION-BY-ID" );
    $sym26$PWHEN = makeSymbol( "PWHEN" );
    $list27 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "&KEY" ), makeSymbol( "NUM" ), ConsesLow.list( makeSymbol( "PROGRESS-MESSAGE" ), makeString( "mapping deductions for sweep" ) ), makeSymbol(
        "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list28 = ConsesLow.list( makeKeyword( "NUM" ), makeKeyword( "PROGRESS-MESSAGE" ), makeKeyword( "DONE" ) );
    $kw29$NUM = makeKeyword( "NUM" );
    $str30$mapping_deductions_for_sweep = makeString( "mapping deductions for sweep" );
    $sym31$PIF = makeSymbol( "PIF" );
    $sym32$POSITIVE_INTEGER_P = makeSymbol( "POSITIVE-INTEGER-P" );
    $sym33$PROGRESS_CSOME = makeSymbol( "PROGRESS-CSOME" );
    $sym34$DEDUCTIONS_AROUND = makeSymbol( "DEDUCTIONS-AROUND" );
    $sym35$DO_DEDUCTIONS = makeSymbol( "DO-DEDUCTIONS" );
    $kw36$DEDUCTION = makeKeyword( "DEDUCTION" );
    $sym37$HL_JUSTIFICATION_P = makeSymbol( "HL-JUSTIFICATION-P" );
    $sym38$BINDINGS_P = makeSymbol( "BINDINGS-P" );
    $sym39$LISTP = makeSymbol( "LISTP" );
    $sym40$DEDUCTION_P = makeSymbol( "DEDUCTION-P" );
    $kw41$TRUE = makeKeyword( "TRUE" );
    $sym42$TRUE = makeSymbol( "TRUE" );
    $int43$500 = makeInteger( 500 );
    $sym44$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $sym45$SUPPORT_EQUAL = makeSymbol( "SUPPORT-EQUAL" );
    $const46$skolem = constant_handles.reader_make_constant_shell( makeString( "skolem" ) );
    $sym47$DEDUCTION_ASSERTION = makeSymbol( "DEDUCTION-ASSERTION" );
    $list48 = ConsesLow.list( makeSymbol( "DEDUCTION" ) );
    $str49$Return_the_support_for_which_DEDU = makeString( "Return the support for which DEDUCTION is a deduction." );
    $list50 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEDUCTION" ), makeSymbol( "DEDUCTION-P" ) ) );
    $list51 = ConsesLow.list( makeSymbol( "SUPPORT-P" ) );
    $sym52$DEDUCTION_SUPPORTED_OBJECT = makeSymbol( "DEDUCTION-SUPPORTED-OBJECT" );
    $kw53$UNKNOWN = makeKeyword( "UNKNOWN" );
    $sym54$DEDUCTION_TRUTH = makeSymbol( "DEDUCTION-TRUTH" );
    $str55$Return_the_truth_of_DEDUCTION____ = makeString( "Return the truth of DEDUCTION -- either :true :false or :unknown." );
    $list56 = ConsesLow.list( makeSymbol( "TRUTH-P" ) );
    $sym57$DEDUCTION_STRENGTH = makeSymbol( "DEDUCTION-STRENGTH" );
    $str58$Return_the_current_argumentation_ = makeString( "Return the current argumentation strength of DEDUCTION -- either :monotonic, :default, or :unknown." );
    $list59 = ConsesLow.list( makeSymbol( "EL-STRENGTH-P" ) );
    $list60 = ConsesLow.list( makeSymbol( "CHECKPOINT-COUNT" ), makeSymbol( "CHECKPOINT-NEXT-ID" ) );
    $list61 = ConsesLow.list( ConsesLow.list( makeSymbol( "*DEDUCTION-DUMP-ID-TABLE*" ), ConsesLow.list( makeSymbol( "CREATE-DEDUCTION-DUMP-ID-TABLE" ) ) ), ConsesLow.list( makeSymbol( "*CFASL-DEDUCTION-HANDLE-FUNC*" ),
        ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DEDUCTION-DUMP-ID" ) ) ) );
    $int62$100 = makeInteger( 100 );
  }
}
/*
 * 
 * Total time: 223 ms
 * 
 */