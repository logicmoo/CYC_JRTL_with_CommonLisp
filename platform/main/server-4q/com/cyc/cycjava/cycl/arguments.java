package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class arguments
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.arguments";
  public static final String myFingerPrint = "358519124b8b7472f3bc2bf9e4dbd194c5369a554e1a35e6656b0b08d75a0974";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3339L)
  private static SubLSymbol $argument_types$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3665L)
  private static SubLSymbol $argument_type_hierarchy$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9092L)
  private static SubLSymbol $asserted_argument_tv_table$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9406L)
  private static SubLSymbol $asserted_arguments$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15479L)
  public static SubLSymbol $assertion_support_module$;
  private static final SubLList $list0;
  private static final SubLString $str1$mapping_Cyc_arguments;
  private static final SubLSymbol $sym2$DO_ASSERTIONS;
  private static final SubLSymbol $sym3$CDOLIST;
  private static final SubLSymbol $sym4$ASSERTION_ARGUMENTS;
  private static final SubLList $list5;
  private static final SubLString $str6$mapping_Cyc_belief_arguments;
  private static final SubLSymbol $sym7$DO_ARGUMENTS;
  private static final SubLSymbol $sym8$PWHEN;
  private static final SubLSymbol $sym9$BELIEF_P;
  private static final SubLList $list10;
  private static final SubLString $str11$mapping_Cyc_asserted_arguments;
  private static final SubLSymbol $sym12$ASSERTED_ARGUMENT_P;
  private static final SubLSymbol $sym13$ARGUMENT_P;
  private static final SubLList $list14;
  private static final SubLString $str15$Return_T_iff_OBJECT_is_an_HL_argu;
  private static final SubLList $list16;
  private static final SubLString $str17$unexpected_argument_type;
  private static final SubLList $list18;
  private static final SubLList $list19;
  private static final SubLSymbol $sym20$ARGUMENT_TYPE_PROPER_GENLS;
  private static final SubLSymbol $sym21$ARGUMENT_EQUAL;
  private static final SubLList $list22;
  private static final SubLString $str23$Return_T_iff_ARGUMENT1_and_ARGUME;
  private static final SubLSymbol $sym24$ARGUMENT_TRUTH;
  private static final SubLList $list25;
  private static final SubLString $str26$Return_the_truth_of_ARGUMENT_;
  private static final SubLList $list27;
  private static final SubLList $list28;
  private static final SubLSymbol $sym29$ARGUMENT_STRENGTH;
  private static final SubLString $str30$Return_the_strength_of_ARGUMENT_;
  private static final SubLList $list31;
  private static final SubLString $str32$unexpected_belief_type;
  private static final SubLString $str33$Return_T_iff_OBJECT_is_an_HL_asse;
  private static final SubLSymbol $kw34$ASSERTED_ARGUMENT;
  private static final SubLSymbol $sym35$EL_STRENGTH_SPEC_P;
  private static final SubLList $list36;
  private static final SubLSymbol $sym37$FIRST;
  private static final SubLSymbol $sym38$TV_P;
  private static final SubLSymbol $sym39$SECOND;
  private static final SubLList $list40;
  private static final SubLSymbol $sym41$SUPPORT_P;
  private static final SubLString $str42$Return_T_iff_OBJECT_can_be_a_supp;
  private static final SubLSymbol $sym43$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLSymbol $kw44$SYNTACTICALLY_ILL_FORMED;
  private static final SubLSymbol $sym45$SUPPORT__;
  private static final SubLSymbol $kw46$ASSERTION;
  private static final SubLSymbol $sym47$SUPPORT_MODULE;
  private static final SubLList $list48;
  private static final SubLString $str49$Return_the_module_of_SUPPORT_;
  private static final SubLList $list50;
  private static final SubLList $list51;
  private static final SubLSymbol $sym52$SUPPORT_SENTENCE;
  private static final SubLString $str53$Return_the_sentence_of_SUPPORT_;
  private static final SubLList $list54;
  private static final SubLSymbol $sym55$SUPPORT_FORMULA;
  private static final SubLList $list56;
  private static final SubLSymbol $sym57$SUPPORT_MT;
  private static final SubLString $str58$Return_the_microtheory_of_SUPPORT;
  private static final SubLList $list59;
  private static final SubLSymbol $sym60$SUPPORT_TRUTH;
  private static final SubLString $str61$Return_the_truth_of_SUPPORT_;
  private static final SubLSymbol $sym62$SUPPORT_STRENGTH;
  private static final SubLString $str63$Return_the_strength_of_SUPPORT_;
  private static final SubLSymbol $sym64$HL_SUPPORT_P;
  private static final SubLString $str65$Does_OBJECT_represent_an_HL_suppo;
  private static final SubLSymbol $kw66$TRUE_DEF;
  private static final SubLSymbol $sym67$HL_SUPPORT_MODULE_P;
  private static final SubLSymbol $sym68$POSSIBLY_CYCL_SENTENCE_P;
  private static final SubLSymbol $sym69$HLMT_P;
  private static final SubLSymbol $sym70$MAKE_HL_SUPPORT;
  private static final SubLList $list71;
  private static final SubLString $str72$Construct_a_new_HL_support_;
  private static final SubLList $list73;
  private static final SubLList $list74;
  private static final SubLSymbol $sym75$ASSERTION_P;
  private static final SubLSymbol $sym76$INVALID_INDEXED_TERM_;
  private static final SubLSymbol $kw77$GENLPREDS;
  private static final SubLList $list78;
  private static final SubLSymbol $sym79$HL_JUSTIFICATION_P;
  private static final SubLSymbol $sym80$SUPPORT_EQUAL;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 729L)
  public static SubLObject do_arguments(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject assertion = NIL;
    SubLObject argument = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    assertion = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    argument = current.first();
    current = current.rest();
    final SubLObject message = current.isCons() ? current.first() : $str1$mapping_Cyc_arguments;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list0 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym2$DO_ASSERTIONS, ConsesLow.list( assertion, message ), ConsesLow.listS( $sym3$CDOLIST, ConsesLow.list( argument, ConsesLow.list( $sym4$ASSERTION_ARGUMENTS, assertion ) ), ConsesLow
          .append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1251L)
  public static SubLObject do_beliefs(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject assertion = NIL;
    SubLObject argument = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    assertion = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    argument = current.first();
    current = current.rest();
    final SubLObject message = current.isCons() ? current.first() : $str6$mapping_Cyc_belief_arguments;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list5 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym7$DO_ARGUMENTS, ConsesLow.list( assertion, argument, message ), ConsesLow.listS( $sym8$PWHEN, ConsesLow.list( $sym9$BELIEF_P, argument ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list5 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1712L)
  public static SubLObject do_asserted_arguments(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject assertion = NIL;
    SubLObject argument = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
    assertion = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
    argument = current.first();
    current = current.rest();
    final SubLObject message = current.isCons() ? current.first() : $str11$mapping_Cyc_asserted_arguments;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list10 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym7$DO_ARGUMENTS, ConsesLow.list( assertion, argument, message ), ConsesLow.listS( $sym8$PWHEN, ConsesLow.list( $sym12$ASSERTED_ARGUMENT_P, argument ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list10 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2200L)
  public static SubLObject argument_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != belief_p( v_object ) || NIL != deduction_handles.deduction_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2461L)
  public static SubLObject valid_argument(final SubLObject argument, SubLObject robust)
  {
    if( robust == UNPROVIDED )
    {
      robust = NIL;
    }
    if( NIL != belief_p( argument ) )
    {
      return T;
    }
    if( NIL != deduction_handles.deduction_p( argument ) )
    {
      return deduction_handles.valid_deduction( argument, robust );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2747L)
  public static SubLObject argument_spec_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != belief_spec_p( v_object ) || NIL != deductions_high.deduction_spec_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2914L)
  public static SubLObject argument_to_argument_spec(final SubLObject argument)
  {
    assert NIL != argument_p( argument ) : argument;
    if( NIL != belief_p( argument ) )
    {
      return belief_to_belief_spec( argument );
    }
    if( NIL != deduction_handles.deduction_p( argument ) )
    {
      return deductions_high.deduction_to_deduction_spec( argument );
    }
    Errors.error( $str17$unexpected_argument_type );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3193L)
  public static SubLObject argument_spec_type(final SubLObject argument_spec)
  {
    return argument_spec.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3454L)
  public static SubLObject argument_type_p(final SubLObject v_object)
  {
    return subl_promotions.memberP( v_object, $argument_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4094L)
  public static SubLObject argument_type_hierarchy()
  {
    return $argument_type_hierarchy$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4381L)
  public static SubLObject argument_type_proper_genls(final SubLObject argument_type)
  {
    final SubLObject pair = conses_high.assoc( argument_type, argument_type_hierarchy(), UNPROVIDED, UNPROVIDED );
    if( NIL == pair )
    {
      return NIL;
    }
    final SubLObject immediate_proper_genls = conses_high.copy_list( conses_high.second( pair ) );
    final SubLObject recursive_proper_genls = Mapping.mapcan( $sym20$ARGUMENT_TYPE_PROPER_GENLS, immediate_proper_genls, EMPTY_SUBL_OBJECT_ARRAY );
    return ConsesLow.append( immediate_proper_genls, recursive_proper_genls );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4867L)
  public static SubLObject argument_type_genls(final SubLObject argument_type)
  {
    return ConsesLow.cons( argument_type, argument_type_proper_genls( argument_type ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5062L)
  public static SubLObject argument_equal(final SubLObject argument1, final SubLObject argument2)
  {
    return makeBoolean( NIL != argument_p( argument1 ) && NIL != argument_p( argument2 ) && ( argument1.eql( argument2 ) || NIL != ( ( NIL != belief_p( argument1 ) ) ? makeBoolean( NIL != belief_p( argument2 )
        && NIL != belief_equal( argument1, argument2 ) ) : makeBoolean( NIL != deduction_handles.deduction_p( argument2 ) && NIL != deductions_high.deduction_equal( argument1, argument2 ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5533L)
  public static SubLObject argument_truth(final SubLObject argument)
  {
    enforceType( argument, $sym13$ARGUMENT_P );
    if( NIL != belief_p( argument ) )
    {
      return belief_truth( argument );
    }
    return deductions_high.deduction_truth( argument );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5790L)
  public static SubLObject argument_tv(final SubLObject argument)
  {
    assert NIL != argument_p( argument ) : argument;
    if( NIL != belief_p( argument ) )
    {
      return belief_tv( argument );
    }
    final SubLObject truth = deductions_high.deduction_truth( argument );
    final SubLObject strength = deductions_high.deduction_strength( argument );
    return enumeration_types.tv_from_truth_strength( truth, strength );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6117L)
  public static SubLObject argument_strength(final SubLObject argument)
  {
    enforceType( argument, $sym13$ARGUMENT_P );
    if( NIL != belief_p( argument ) )
    {
      return belief_strength( argument );
    }
    return deductions_high.deduction_strength( argument );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6392L)
  public static SubLObject remove_argument(final SubLObject argument, final SubLObject support)
  {
    if( NIL != belief_p( argument ) )
    {
      return remove_belief( argument, support );
    }
    return deductions_interface.kb_remove_deduction( argument );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6630L)
  public static SubLObject belief_p(final SubLObject v_object)
  {
    return asserted_argument_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6849L)
  public static SubLObject belief_spec_p(final SubLObject v_object)
  {
    return asserted_argument_spec_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7054L)
  public static SubLObject belief_to_belief_spec(final SubLObject belief)
  {
    assert NIL != belief_p( belief ) : belief;
    if( NIL != asserted_argument_p( belief ) )
    {
      return asserted_argument_to_asserted_argument_spec( belief );
    }
    Errors.error( $str32$unexpected_belief_type );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7275L)
  public static SubLObject remove_belief(final SubLObject belief, final SubLObject assertion)
  {
    return assertions_interface.kb_remove_asserted_argument( assertion, belief );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7395L)
  public static SubLObject belief_equal(final SubLObject belief1, final SubLObject belief2)
  {
    return asserted_argument_equal( belief1, belief2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7494L)
  public static SubLObject belief_truth(final SubLObject belief)
  {
    return asserted_argument_truth( belief );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7575L)
  public static SubLObject belief_strength(final SubLObject belief)
  {
    return asserted_argument_strength( belief );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7662L)
  public static SubLObject belief_tv(final SubLObject belief)
  {
    return asserted_argument_tv( belief );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7737L)
  public static SubLObject asserted_argument_p(final SubLObject v_object)
  {
    return asserted_argument_token_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7981L)
  public static SubLObject asserted_argument_spec_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != list_utilities.doubletonP( v_object ) && $kw34$ASSERTED_ARGUMENT == v_object.first() && NIL != enumeration_types.el_strength_spec_p( conses_high.second( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8211L)
  public static SubLObject asserted_argument_to_asserted_argument_spec(final SubLObject asserted_argument)
  {
    final SubLObject strength = asserted_argument_strength( asserted_argument );
    final SubLObject argument_spec = create_asserted_argument_spec( strength );
    return argument_spec;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8444L)
  public static SubLObject create_asserted_argument(final SubLObject assertion, final SubLObject tv)
  {
    return asserted_argument_token_from_tv( tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8615L)
  public static SubLObject create_asserted_argument_spec(final SubLObject strength_spec)
  {
    assert NIL != enumeration_types.el_strength_spec_p( strength_spec ) : strength_spec;
    return ConsesLow.list( $kw34$ASSERTED_ARGUMENT, strength_spec );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8774L)
  public static SubLObject asserted_argument_spec_strength_spec(final SubLObject asserted_argument_spec)
  {
    return conses_high.second( asserted_argument_spec );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8893L)
  public static SubLObject kb_remove_asserted_argument_internal(final SubLObject asserted_argument)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9559L)
  public static SubLObject asserted_argument_tokens()
  {
    return $asserted_arguments$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9626L)
  public static SubLObject asserted_argument_token_p(final SubLObject v_object)
  {
    return subl_promotions.memberP( v_object, $asserted_arguments$.getGlobalValue(), Symbols.symbol_function( EQ ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9732L)
  public static SubLObject asserted_argument_token_from_tv(final SubLObject tv)
  {
    assert NIL != enumeration_types.tv_p( tv ) : tv;
    return Sequences.find( tv, $asserted_argument_tv_table$.getGlobalValue(), Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym39$SECOND ), UNPROVIDED, UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9879L)
  public static SubLObject tv_from_asserted_argument_token(final SubLObject asserted_argument)
  {
    return conses_high.second( Sequences.find( asserted_argument, $asserted_argument_tv_table$.getGlobalValue(), Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym37$FIRST ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10033L)
  public static SubLObject make_empty_local_support_set()
  {
    return $list40;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10093L)
  public static SubLObject asserted_argument_equal(final SubLObject asserted_argument1, final SubLObject asserted_argument2)
  {
    return Equality.eq( asserted_argument1, asserted_argument2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10242L)
  public static SubLObject asserted_argument_tv(final SubLObject asserted_argument)
  {
    if( NIL != asserted_argument_token_p( asserted_argument ) )
    {
      return tv_from_asserted_argument_token( asserted_argument );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10419L)
  public static SubLObject asserted_argument_strength(final SubLObject asserted_argument)
  {
    return enumeration_types.tv_strength( asserted_argument_tv( asserted_argument ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10549L)
  public static SubLObject asserted_argument_truth(final SubLObject asserted_argument)
  {
    return enumeration_types.tv_truth( asserted_argument_tv( asserted_argument ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10673L)
  public static SubLObject list_of_cycl_support_p(final SubLObject v_object)
  {
    if( NIL == list_utilities.proper_list_p( v_object ) )
    {
      return NIL;
    }
    SubLObject cdolist_list_var = v_object;
    SubLObject support = NIL;
    support = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == cycl_support_p( support ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      support = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10932L)
  public static SubLObject cycl_support_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != assertion_handles.assertion_p( v_object ) || ( NIL != list_utilities.proper_list_p( v_object ) && NIL != list_utilities.lengthE( v_object, FOUR_INTEGER, UNPROVIDED ) && NIL != hl_supports
        .hl_support_module_p( v_object.first() ) && NIL != el_utilities.possibly_sentence_p( conses_high.second( v_object ) ) && NIL != hlmt.hlmt_p( conses_high.third( v_object ) ) && NIL != enumeration_types
            .el_strength_p( conses_high.fourth( v_object ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11289L)
  public static SubLObject support_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != reified_support_p( v_object ) || NIL != hl_support_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11476L)
  public static SubLObject reified_support_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != assertion_handles.assertion_p( v_object ) || NIL != kb_hl_support_handles.kb_hl_support_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11585L)
  public static SubLObject supports_p(final SubLObject v_object)
  {
    return support_list_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11654L)
  public static SubLObject support_list_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != list_utilities.proper_list_p( v_object ) && NIL != list_utilities.every_in_list( $sym41$SUPPORT_P, v_object, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11825L)
  public static SubLObject valid_supportP(final SubLObject support, SubLObject robust)
  {
    if( robust == UNPROVIDED )
    {
      robust = NIL;
    }
    if( NIL != assertion_handles.assertion_p( support ) )
    {
      return assertion_handles.valid_assertionP( support, UNPROVIDED );
    }
    if( NIL != kb_hl_support_handles.kb_hl_support_p( support ) )
    {
      return kb_hl_support_handles.valid_kb_hl_supportP( support, robust );
    }
    if( NIL != hl_support_p( support ) )
    {
      return valid_hl_supportP( support );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12223L)
  public static SubLObject ill_formed_hl_supportP(final SubLObject support)
  {
    if( NIL != assertion_handles.assertion_p( support ) )
    {
      return assertion_syntactically_illformedP( support );
    }
    if( NIL != kb_hl_support_handles.kb_hl_support_p( support ) )
    {
      return kb_hl_support_syntactically_illformedP( support );
    }
    if( NIL != hl_support_p( support ) )
    {
      return hl_support_syntactically_illformedP( support );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12576L)
  public static SubLObject hl_support_syntactically_illformedP(final SubLObject hl_support)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject brokenness = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym43$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          if( NIL == wff.el_wff_syntaxP( hl_support_sentence( hl_support ), UNPROVIDED ) )
          {
            brokenness = $kw44$SYNTACTICALLY_ILL_FORMED;
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
      brokenness = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return brokenness;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12990L)
  public static SubLObject kb_hl_support_syntactically_illformedP(final SubLObject kb_hl_support)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject brokenness = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym43$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          if( NIL == wff.el_wff_syntaxP( kb_hl_supports_high.kb_hl_support_sentence( kb_hl_support ), UNPROVIDED ) )
          {
            brokenness = $kw44$SYNTACTICALLY_ILL_FORMED;
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
      brokenness = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return brokenness;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13379L)
  public static SubLObject assertion_syntactically_illformedP(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject brokenness = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym43$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          if( NIL == wff.el_wff_syntaxP( fi.assertion_hl_formula( assertion, UNPROVIDED ), UNPROVIDED ) )
          {
            brokenness = $kw44$SYNTACTICALLY_ILL_FORMED;
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
      brokenness = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return brokenness;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13888L)
  public static SubLObject support_equal(final SubLObject support1, final SubLObject support2)
  {
    if( NIL != assertion_handles.assertion_p( support1 ) || NIL != assertion_handles.assertion_p( support2 ) )
    {
      return Equality.eql( support1, support2 );
    }
    if( NIL != kb_hl_support_handles.kb_hl_support_p( support1 ) || NIL != kb_hl_support_handles.kb_hl_support_p( support2 ) )
    {
      return Equality.eql( support1, support2 );
    }
    return Equality.equal( support1, support2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14191L)
  public static SubLObject support_L(final SubLObject support1, final SubLObject support2)
  {
    if( NIL != assertion_handles.assertion_p( support1 ) )
    {
      if( NIL == assertion_handles.assertion_p( support2 ) )
      {
        return T;
      }
      if( NIL != assertions_high.rule_assertionP( support1 ) )
      {
        if( NIL != assertions_high.rule_assertionP( support2 ) )
        {
          return Numbers.numL( assertion_handles.assertion_id( support1 ), assertion_handles.assertion_id( support2 ) );
        }
        return T;
      }
      else
      {
        if( NIL != assertions_high.rule_assertionP( support2 ) )
        {
          return NIL;
        }
        return Numbers.numL( assertion_handles.assertion_id( support1 ), assertion_handles.assertion_id( support2 ) );
      }
    }
    else if( NIL != kb_hl_support_handles.kb_hl_support_p( support1 ) )
    {
      if( NIL != assertion_handles.assertion_p( support2 ) )
      {
        return NIL;
      }
      if( NIL != kb_hl_support_handles.kb_hl_support_p( support2 ) )
      {
        return Numbers.numL( kb_hl_support_handles.kb_hl_support_id( support1 ), kb_hl_support_handles.kb_hl_support_id( support2 ) );
      }
      return T;
    }
    else
    {
      if( NIL != assertion_handles.assertion_p( support2 ) )
      {
        return NIL;
      }
      if( NIL != kb_hl_support_handles.kb_hl_support_p( support2 ) )
      {
        return NIL;
      }
      return kb_utilities.term_L( support1, support2, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15346L)
  public static SubLObject sort_supports(final SubLObject supports)
  {
    return Sort.sort( supports, Symbols.symbol_function( $sym45$SUPPORT__ ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15612L)
  public static SubLObject support_module(final SubLObject support)
  {
    enforceType( support, $sym41$SUPPORT_P );
    if( NIL != assertion_handles.assertion_p( support ) )
    {
      return $assertion_support_module$.getGlobalValue();
    }
    if( NIL != kb_hl_support_handles.kb_hl_support_p( support ) )
    {
      return kb_hl_supports_high.kb_hl_support_module( support );
    }
    return hl_support_module( support );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15951L)
  public static SubLObject support_sentence(final SubLObject support)
  {
    enforceType( support, $sym41$SUPPORT_P );
    if( NIL != assertion_handles.assertion_p( support ) )
    {
      return assertions_high.assertion_formula( support );
    }
    if( NIL != kb_hl_support_handles.kb_hl_support_p( support ) )
    {
      return kb_hl_supports_high.kb_hl_support_sentence( support );
    }
    return hl_support_sentence( support );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16285L)
  public static SubLObject support_sentence_operator(final SubLObject support)
  {
    return cycl_utilities.formula_operator( support_sentence( support ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16458L)
  public static SubLObject support_formula(final SubLObject support)
  {
    return support_sentence( support );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16573L)
  public static SubLObject support_el_sentence(final SubLObject support)
  {
    if( NIL != assertion_handles.assertion_p( support ) )
    {
      return uncanonicalizer.assertion_el_formula( support );
    }
    if( NIL != kb_hl_support_handles.kb_hl_support_p( support ) )
    {
      return kb_hl_supports_high.kb_hl_support_el_sentence( support );
    }
    return cycl_utilities.hl_to_el( hl_support_sentence( support ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16942L)
  public static SubLObject support_ist_sentence(final SubLObject support)
  {
    if( NIL != assertion_handles.assertion_p( support ) )
    {
      return assertions_high.assertion_ist_formula( support );
    }
    if( NIL != kb_hl_support_handles.kb_hl_support_p( support ) )
    {
      return kb_hl_supports_high.kb_hl_support_ist_sentence( support );
    }
    return el_utilities.make_ist_sentence( hl_support_mt( support ), hl_support_sentence( support ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17314L)
  public static SubLObject support_el_ist_sentence(final SubLObject support)
  {
    if( NIL != assertion_handles.assertion_p( support ) )
    {
      return uncanonicalizer.assertion_el_ist_formula( support );
    }
    if( NIL != kb_hl_support_handles.kb_hl_support_p( support ) )
    {
      return kb_hl_supports_high.kb_hl_support_el_ist_sentence( support );
    }
    return el_utilities.make_ist_sentence( support_elmt( support ), support_el_sentence( support ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17697L)
  public static SubLObject support_cons(final SubLObject support)
  {
    if( NIL != assertion_handles.assertion_p( support ) )
    {
      return assertions_high.assertion_cons( support );
    }
    if( NIL != kb_hl_support_handles.kb_hl_support_p( support ) )
    {
      return kb_hl_supports_high.kb_hl_support_cons( support );
    }
    return el_utilities.elf_to_list( hl_support_sentence( support ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18135L)
  public static SubLObject support_mt(final SubLObject support)
  {
    enforceType( support, $sym41$SUPPORT_P );
    if( NIL != assertion_handles.assertion_p( support ) )
    {
      return assertions_high.assertion_mt( support );
    }
    if( NIL != kb_hl_support_handles.kb_hl_support_p( support ) )
    {
      return kb_hl_supports_high.kb_hl_support_mt( support );
    }
    return hl_support_mt( support );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18451L)
  public static SubLObject support_elmt(final SubLObject support)
  {
    if( NIL != assertion_handles.assertion_p( support ) )
    {
      return uncanonicalizer.assertion_elmt( support );
    }
    if( NIL != kb_hl_support_handles.kb_hl_support_p( support ) )
    {
      return kb_hl_supports_high.kb_hl_support_elmt( support );
    }
    return cycl_utilities.hl_to_el( hl_support_mt( support ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18764L)
  public static SubLObject support_justification(final SubLObject support)
  {
    if( NIL != assertion_handles.assertion_p( support ) )
    {
      return ConsesLow.list( support );
    }
    if( NIL != kb_hl_support_handles.kb_hl_support_p( support ) )
    {
      return kb_hl_supports_high.kb_hl_support_justification( support );
    }
    return hl_supports.hl_support_justify( support );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19150L)
  public static SubLObject support_truth(final SubLObject support)
  {
    enforceType( support, $sym41$SUPPORT_P );
    return enumeration_types.tv_truth( support_tv( support ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19333L)
  public static SubLObject support_strength(final SubLObject support)
  {
    enforceType( support, $sym41$SUPPORT_P );
    return enumeration_types.tv_strength( support_tv( support ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19530L)
  public static SubLObject support_tv(final SubLObject support)
  {
    if( NIL != assertion_handles.assertion_p( support ) )
    {
      return assertions_high.cyc_assertion_tv( support );
    }
    if( NIL != kb_hl_support_handles.kb_hl_support_p( support ) )
    {
      return kb_hl_supports_high.kb_hl_support_tv( support );
    }
    return hl_support_tv( support );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19780L)
  public static SubLObject hl_support_from_support(final SubLObject support)
  {
    if( NIL != assertion_handles.assertion_p( support ) )
    {
      return hl_support_from_assertion( support );
    }
    if( NIL != kb_hl_support_handles.kb_hl_support_p( support ) )
    {
      return kb_hl_supports_high.kb_hl_support_hl_support( support );
    }
    return support;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20024L)
  public static SubLObject contextualize_support(final SubLObject support, final SubLObject new_mt)
  {
    return contextualize_hl_support( hl_support_from_support( support ), new_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20159L)
  public static SubLObject canonicalize_supports(final SubLObject supports, SubLObject possibly_create_new_kb_hl_supportsP)
  {
    if( possibly_create_new_kb_hl_supportsP == UNPROVIDED )
    {
      possibly_create_new_kb_hl_supportsP = T;
    }
    SubLObject new_supports = NIL;
    SubLObject cdolist_list_var = supports;
    SubLObject support = NIL;
    support = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      new_supports = ConsesLow.cons( canonicalize_support( support, possibly_create_new_kb_hl_supportsP ), new_supports );
      cdolist_list_var = cdolist_list_var.rest();
      support = cdolist_list_var.first();
    }
    return Sort.sort( new_supports, $sym45$SUPPORT__, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20554L)
  public static SubLObject canonicalize_support(final SubLObject support, SubLObject possibly_create_new_kb_hl_supportP)
  {
    if( possibly_create_new_kb_hl_supportP == UNPROVIDED )
    {
      possibly_create_new_kb_hl_supportP = T;
    }
    if( NIL != assertion_handles.assertion_p( support ) )
    {
      return support;
    }
    if( NIL != kb_hl_support_handles.kb_hl_support_p( support ) )
    {
      return support;
    }
    return canonicalize_hl_support( support, possibly_create_new_kb_hl_supportP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21088L)
  public static SubLObject canonicalize_hl_support(final SubLObject hl_support, SubLObject possibly_create_new_kb_hl_supportP)
  {
    if( possibly_create_new_kb_hl_supportP == UNPROVIDED )
    {
      possibly_create_new_kb_hl_supportP = T;
    }
    SubLObject canon_support = assertion_from_hl_support( hl_support );
    if( NIL == canon_support )
    {
      if( NIL != possibly_create_new_kb_hl_supportP )
      {
        canon_support = kb_hl_supports_high.find_or_possibly_create_kb_hl_support( hl_support );
      }
      else
      {
        canon_support = kb_hl_supports_high.find_kb_hl_support( hl_support );
      }
    }
    return ( NIL != canon_support ) ? canon_support : hl_support;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21514L)
  public static SubLObject hl_support_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isList() && NIL != list_utilities.proper_list_p( v_object ) && NIL != list_utilities.lengthE( v_object, FOUR_INTEGER, UNPROVIDED ) && NIL != hl_supports.hl_support_module_p( v_object
        .first() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21793L)
  public static SubLObject make_hl_support(final SubLObject hl_module, final SubLObject sentence, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = $kw66$TRUE_DEF;
    }
    enforceType( hl_module, $sym67$HL_SUPPORT_MODULE_P );
    enforceType( sentence, $sym68$POSSIBLY_CYCL_SENTENCE_P );
    enforceType( mt, $sym69$HLMT_P );
    enforceType( tv, $sym38$TV_P );
    return ConsesLow.list( hl_module, sentence, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22243L)
  public static SubLObject hl_support_from_assertion(final SubLObject assertion)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    final SubLObject hl_module = support_module( assertion );
    final SubLObject formula = support_formula( assertion );
    final SubLObject mt = support_mt( assertion );
    final SubLObject tv = support_tv( assertion );
    return make_hl_support( hl_module, formula, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22600L)
  public static SubLObject assertion_from_hl_support(final SubLObject hl_support)
  {
    SubLObject assertion = NIL;
    if( hl_support_module( hl_support ).eql( $assertion_support_module$.getGlobalValue() ) )
    {
      assertion = czer_meta.find_assertion_cycl( hl_support_sentence( hl_support ), hl_support_mt( hl_support ) );
    }
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22878L)
  public static SubLObject valid_hl_supportP(final SubLObject hl_support)
  {
    return makeBoolean( NIL != hl_support_p( hl_support ) && NIL != hl_supports.hl_support_module_p( hl_support_module( hl_support ) ) && NIL != el_utilities.possibly_sentence_p( hl_support_sentence( hl_support ) )
        && NIL == cycl_utilities.expression_find_if( $sym76$INVALID_INDEXED_TERM_, hl_support_sentence( hl_support ), UNPROVIDED, UNPROVIDED ) && NIL == cycl_utilities.expression_find_if( $sym76$INVALID_INDEXED_TERM_,
            hl_support_mt( hl_support ), UNPROVIDED, UNPROVIDED ) && NIL != hlmt.closed_hlmt_p( hl_support_mt( hl_support ) ) && NIL != enumeration_types.tv_p( hl_support_tv( hl_support ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23350L)
  public static SubLObject hl_support_with_module_p(final SubLObject v_object, final SubLObject module)
  {
    return makeBoolean( NIL != hl_support_p( v_object ) && module.eql( hl_support_module( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23490L)
  public static SubLObject hl_support_module(final SubLObject hl_support)
  {
    assert NIL != hl_support_p( hl_support ) : hl_support;
    return hl_support.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23621L)
  public static SubLObject hl_support_sentence(final SubLObject hl_support)
  {
    assert NIL != hl_support_p( hl_support ) : hl_support;
    return conses_high.second( hl_support );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23741L)
  public static SubLObject hl_support_mt(final SubLObject hl_support)
  {
    assert NIL != hl_support_p( hl_support ) : hl_support;
    return conses_high.third( hl_support );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23854L)
  public static SubLObject hl_support_tv(final SubLObject hl_support)
  {
    assert NIL != hl_support_p( hl_support ) : hl_support;
    return conses_high.fourth( hl_support );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23968L)
  public static SubLObject genl_preds_support_p(final SubLObject hl_support)
  {
    return Equality.eq( hl_support_module( hl_support ), $kw77$GENLPREDS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24084L)
  public static SubLObject contextualize_hl_support(final SubLObject hl_support, final SubLObject new_mt)
  {
    SubLObject hl_module = NIL;
    SubLObject sentence = NIL;
    SubLObject mt = NIL;
    SubLObject tv = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( hl_support, hl_support, $list78 );
    hl_module = hl_support.first();
    SubLObject current = hl_support.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, hl_support, $list78 );
    sentence = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, hl_support, $list78 );
    mt = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, hl_support, $list78 );
    tv = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return make_hl_support( hl_module, sentence, new_mt, tv );
    }
    cdestructuring_bind.cdestructuring_bind_error( hl_support, $list78 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24298L)
  public static SubLObject hl_justification_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != list_utilities.non_dotted_list_p( v_object ) && NIL != list_utilities.every_in_list( Symbols.symbol_function( $sym41$SUPPORT_P ), v_object, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24559L)
  public static SubLObject hl_justification_list_p(final SubLObject v_object)
  {
    return list_utilities.list_of_type_p( $sym79$HL_JUSTIFICATION_P, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24661L)
  public static SubLObject non_empty_hl_justification_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != list_utilities.proper_list_p( v_object ) && NIL != list_utilities.every_in_list( Symbols.symbol_function( $sym41$SUPPORT_P ), v_object, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24795L)
  public static SubLObject empty_hl_justification_p(final SubLObject v_object)
  {
    return Types.sublisp_null( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24868L)
  public static SubLObject justification_equal(final SubLObject justification1, final SubLObject justification2)
  {
    return list_utilities.multisets_equalP( justification1, justification2, $sym80$SUPPORT_EQUAL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25009L)
  public static SubLObject canonicalize_hl_justification(final SubLObject hl_justification)
  {
    assert NIL != hl_justification_p( hl_justification ) : hl_justification;
    return Sort.sort( conses_high.copy_list( hl_justification ), Symbols.symbol_function( $sym45$SUPPORT__ ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25259L)
  public static SubLObject hl_support_justification_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != list_utilities.non_dotted_list_p( v_object ) && NIL != list_utilities.every_in_list( Symbols.symbol_function( $sym64$HL_SUPPORT_P ), v_object, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25575L)
  public static SubLObject hl_justification_to_hl_support_justification(final SubLObject hl_justification)
  {
    assert NIL != hl_justification_p( hl_justification ) : hl_justification;
    SubLObject supports = NIL;
    SubLObject cdolist_list_var = hl_justification;
    SubLObject support = NIL;
    support = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != assertion_handles.assertion_p( support ) )
      {
        support = hl_support_from_assertion( support );
      }
      supports = ConsesLow.cons( support, supports );
      cdolist_list_var = cdolist_list_var.rest();
      support = cdolist_list_var.first();
    }
    return Sequences.nreverse( supports );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25987L)
  public static SubLObject reified_support_has_dependent_with_supportP(SubLObject reified_support, final SubLObject support)
  {
    if( NIL != assertion_handles.assertion_p( reified_support ) )
    {
      return assertion_utilities.assertion_has_dependent_with_supportP( reified_support, support );
    }
    if( NIL != kb_hl_support_handles.kb_hl_support_p( reified_support ) )
    {
      return kb_hl_supports_high.kb_hl_support_has_dependent_with_supportP( reified_support, support );
    }
    if( NIL == hl_support_p( reified_support ) )
    {
      return NIL;
    }
    reified_support = kb_hl_supports_high.find_kb_hl_support( reified_support );
    if( NIL != kb_hl_support_handles.kb_hl_support_p( reified_support ) )
    {
      return kb_hl_supports_high.kb_hl_support_has_dependent_with_supportP( reified_support, support );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26647L)
  public static SubLObject reified_support_has_dependent_with_supportP_kb_hl_support_aware_version(SubLObject reified_support, final SubLObject support)
  {
    if( NIL != assertion_handles.assertion_p( reified_support ) )
    {
      return assertion_utilities.assertion_has_dependent_with_supportP_kb_hl_support_aware_version( reified_support, support );
    }
    if( NIL != kb_hl_support_handles.kb_hl_support_p( reified_support ) )
    {
      return kb_hl_supports_high.kb_hl_support_has_dependent_with_supportP( reified_support, support );
    }
    if( NIL == hl_support_p( reified_support ) )
    {
      return NIL;
    }
    reified_support = kb_hl_supports_high.find_kb_hl_support( reified_support );
    if( NIL != kb_hl_support_handles.kb_hl_support_p( reified_support ) )
    {
      return kb_hl_supports_high.kb_hl_support_has_dependent_with_supportP( reified_support, support );
    }
    return NIL;
  }

  public static SubLObject declare_arguments_file()
  {
    SubLFiles.declareMacro( me, "do_arguments", "DO-ARGUMENTS" );
    SubLFiles.declareMacro( me, "do_beliefs", "DO-BELIEFS" );
    SubLFiles.declareMacro( me, "do_asserted_arguments", "DO-ASSERTED-ARGUMENTS" );
    SubLFiles.declareFunction( me, "argument_p", "ARGUMENT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_argument", "VALID-ARGUMENT", 1, 1, false );
    SubLFiles.declareFunction( me, "argument_spec_p", "ARGUMENT-SPEC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "argument_to_argument_spec", "ARGUMENT-TO-ARGUMENT-SPEC", 1, 0, false );
    SubLFiles.declareFunction( me, "argument_spec_type", "ARGUMENT-SPEC-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "argument_type_p", "ARGUMENT-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "argument_type_hierarchy", "ARGUMENT-TYPE-HIERARCHY", 0, 0, false );
    SubLFiles.declareFunction( me, "argument_type_proper_genls", "ARGUMENT-TYPE-PROPER-GENLS", 1, 0, false );
    new $argument_type_proper_genls$UnaryFunction();
    SubLFiles.declareFunction( me, "argument_type_genls", "ARGUMENT-TYPE-GENLS", 1, 0, false );
    SubLFiles.declareFunction( me, "argument_equal", "ARGUMENT-EQUAL", 2, 0, false );
    SubLFiles.declareFunction( me, "argument_truth", "ARGUMENT-TRUTH", 1, 0, false );
    SubLFiles.declareFunction( me, "argument_tv", "ARGUMENT-TV", 1, 0, false );
    SubLFiles.declareFunction( me, "argument_strength", "ARGUMENT-STRENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_argument", "REMOVE-ARGUMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "belief_p", "BELIEF-P", 1, 0, false );
    SubLFiles.declareFunction( me, "belief_spec_p", "BELIEF-SPEC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "belief_to_belief_spec", "BELIEF-TO-BELIEF-SPEC", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_belief", "REMOVE-BELIEF", 2, 0, false );
    SubLFiles.declareFunction( me, "belief_equal", "BELIEF-EQUAL", 2, 0, false );
    SubLFiles.declareFunction( me, "belief_truth", "BELIEF-TRUTH", 1, 0, false );
    SubLFiles.declareFunction( me, "belief_strength", "BELIEF-STRENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "belief_tv", "BELIEF-TV", 1, 0, false );
    SubLFiles.declareFunction( me, "asserted_argument_p", "ASSERTED-ARGUMENT-P", 1, 0, false );
    new $asserted_argument_p$UnaryFunction();
    SubLFiles.declareFunction( me, "asserted_argument_spec_p", "ASSERTED-ARGUMENT-SPEC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "asserted_argument_to_asserted_argument_spec", "ASSERTED-ARGUMENT-TO-ASSERTED-ARGUMENT-SPEC", 1, 0, false );
    SubLFiles.declareFunction( me, "create_asserted_argument", "CREATE-ASSERTED-ARGUMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "create_asserted_argument_spec", "CREATE-ASSERTED-ARGUMENT-SPEC", 1, 0, false );
    SubLFiles.declareFunction( me, "asserted_argument_spec_strength_spec", "ASSERTED-ARGUMENT-SPEC-STRENGTH-SPEC", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_remove_asserted_argument_internal", "KB-REMOVE-ASSERTED-ARGUMENT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "asserted_argument_tokens", "ASSERTED-ARGUMENT-TOKENS", 0, 0, false );
    SubLFiles.declareFunction( me, "asserted_argument_token_p", "ASSERTED-ARGUMENT-TOKEN-P", 1, 0, false );
    SubLFiles.declareFunction( me, "asserted_argument_token_from_tv", "ASSERTED-ARGUMENT-TOKEN-FROM-TV", 1, 0, false );
    SubLFiles.declareFunction( me, "tv_from_asserted_argument_token", "TV-FROM-ASSERTED-ARGUMENT-TOKEN", 1, 0, false );
    SubLFiles.declareFunction( me, "make_empty_local_support_set", "MAKE-EMPTY-LOCAL-SUPPORT-SET", 0, 0, false );
    SubLFiles.declareFunction( me, "asserted_argument_equal", "ASSERTED-ARGUMENT-EQUAL", 2, 0, false );
    SubLFiles.declareFunction( me, "asserted_argument_tv", "ASSERTED-ARGUMENT-TV", 1, 0, false );
    SubLFiles.declareFunction( me, "asserted_argument_strength", "ASSERTED-ARGUMENT-STRENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "asserted_argument_truth", "ASSERTED-ARGUMENT-TRUTH", 1, 0, false );
    SubLFiles.declareFunction( me, "list_of_cycl_support_p", "LIST-OF-CYCL-SUPPORT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_support_p", "CYCL-SUPPORT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "support_p", "SUPPORT-P", 1, 0, false );
    new $support_p$UnaryFunction();
    SubLFiles.declareFunction( me, "reified_support_p", "REIFIED-SUPPORT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "supports_p", "SUPPORTS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "support_list_p", "SUPPORT-LIST-P", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_supportP", "VALID-SUPPORT?", 1, 1, false );
    SubLFiles.declareFunction( me, "ill_formed_hl_supportP", "ILL-FORMED-HL-SUPPORT?", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_support_syntactically_illformedP", "HL-SUPPORT-SYNTACTICALLY-ILLFORMED?", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_hl_support_syntactically_illformedP", "KB-HL-SUPPORT-SYNTACTICALLY-ILLFORMED?", 1, 0, false );
    SubLFiles.declareFunction( me, "assertion_syntactically_illformedP", "ASSERTION-SYNTACTICALLY-ILLFORMED?", 1, 0, false );
    SubLFiles.declareFunction( me, "support_equal", "SUPPORT-EQUAL", 2, 0, false );
    new $support_equal$BinaryFunction();
    SubLFiles.declareFunction( me, "support_L", "SUPPORT-<", 2, 0, false );
    new $support_L$BinaryFunction();
    SubLFiles.declareFunction( me, "sort_supports", "SORT-SUPPORTS", 1, 0, false );
    SubLFiles.declareFunction( me, "support_module", "SUPPORT-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "support_sentence", "SUPPORT-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "support_sentence_operator", "SUPPORT-SENTENCE-OPERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "support_formula", "SUPPORT-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "support_el_sentence", "SUPPORT-EL-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "support_ist_sentence", "SUPPORT-IST-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "support_el_ist_sentence", "SUPPORT-EL-IST-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "support_cons", "SUPPORT-CONS", 1, 0, false );
    SubLFiles.declareFunction( me, "support_mt", "SUPPORT-MT", 1, 0, false );
    new $support_mt$UnaryFunction();
    SubLFiles.declareFunction( me, "support_elmt", "SUPPORT-ELMT", 1, 0, false );
    SubLFiles.declareFunction( me, "support_justification", "SUPPORT-JUSTIFICATION", 1, 0, false );
    SubLFiles.declareFunction( me, "support_truth", "SUPPORT-TRUTH", 1, 0, false );
    SubLFiles.declareFunction( me, "support_strength", "SUPPORT-STRENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "support_tv", "SUPPORT-TV", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_support_from_support", "HL-SUPPORT-FROM-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "contextualize_support", "CONTEXTUALIZE-SUPPORT", 2, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_supports", "CANONICALIZE-SUPPORTS", 1, 1, false );
    SubLFiles.declareFunction( me, "canonicalize_support", "CANONICALIZE-SUPPORT", 1, 1, false );
    SubLFiles.declareFunction( me, "canonicalize_hl_support", "CANONICALIZE-HL-SUPPORT", 1, 1, false );
    SubLFiles.declareFunction( me, "hl_support_p", "HL-SUPPORT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "make_hl_support", "MAKE-HL-SUPPORT", 2, 2, false );
    SubLFiles.declareFunction( me, "hl_support_from_assertion", "HL-SUPPORT-FROM-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "assertion_from_hl_support", "ASSERTION-FROM-HL-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_hl_supportP", "VALID-HL-SUPPORT?", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_support_with_module_p", "HL-SUPPORT-WITH-MODULE-P", 2, 0, false );
    SubLFiles.declareFunction( me, "hl_support_module", "HL-SUPPORT-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_support_sentence", "HL-SUPPORT-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_support_mt", "HL-SUPPORT-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_support_tv", "HL-SUPPORT-TV", 1, 0, false );
    SubLFiles.declareFunction( me, "genl_preds_support_p", "GENL-PREDS-SUPPORT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "contextualize_hl_support", "CONTEXTUALIZE-HL-SUPPORT", 2, 0, false );
    SubLFiles.declareFunction( me, "hl_justification_p", "HL-JUSTIFICATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_justification_list_p", "HL-JUSTIFICATION-LIST-P", 1, 0, false );
    SubLFiles.declareFunction( me, "non_empty_hl_justification_p", "NON-EMPTY-HL-JUSTIFICATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "empty_hl_justification_p", "EMPTY-HL-JUSTIFICATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "justification_equal", "JUSTIFICATION-EQUAL", 2, 0, false );
    new $justification_equal$BinaryFunction();
    SubLFiles.declareFunction( me, "canonicalize_hl_justification", "CANONICALIZE-HL-JUSTIFICATION", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_support_justification_p", "HL-SUPPORT-JUSTIFICATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_justification_to_hl_support_justification", "HL-JUSTIFICATION-TO-HL-SUPPORT-JUSTIFICATION", 1, 0, false );
    SubLFiles.declareFunction( me, "reified_support_has_dependent_with_supportP", "REIFIED-SUPPORT-HAS-DEPENDENT-WITH-SUPPORT?", 2, 0, false );
    SubLFiles.declareFunction( me, "reified_support_has_dependent_with_supportP_kb_hl_support_aware_version", "REIFIED-SUPPORT-HAS-DEPENDENT-WITH-SUPPORT?-KB-HL-SUPPORT-AWARE-VERSION", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_arguments_file()
  {
    $argument_types$ = SubLFiles.deflexical( "*ARGUMENT-TYPES*", $list18 );
    $argument_type_hierarchy$ = SubLFiles.deflexical( "*ARGUMENT-TYPE-HIERARCHY*", $list19 );
    $asserted_argument_tv_table$ = SubLFiles.deflexical( "*ASSERTED-ARGUMENT-TV-TABLE*", $list36 );
    $asserted_arguments$ = SubLFiles.deflexical( "*ASSERTED-ARGUMENTS*", Mapping.mapcar( Symbols.symbol_function( $sym37$FIRST ), $asserted_argument_tv_table$.getGlobalValue() ) );
    $assertion_support_module$ = SubLFiles.deflexical( "*ASSERTION-SUPPORT-MODULE*", $kw46$ASSERTION );
    return NIL;
  }

  public static SubLObject setup_arguments_file()
  {
    utilities_macros.register_cyc_api_function( $sym13$ARGUMENT_P, $list14, $str15$Return_T_iff_OBJECT_is_an_HL_argu, NIL, $list16 );
    utilities_macros.register_cyc_api_function( $sym21$ARGUMENT_EQUAL, $list22, $str23$Return_T_iff_ARGUMENT1_and_ARGUME, NIL, $list16 );
    utilities_macros.register_cyc_api_function( $sym24$ARGUMENT_TRUTH, $list25, $str26$Return_the_truth_of_ARGUMENT_, $list27, $list28 );
    utilities_macros.register_cyc_api_function( $sym29$ARGUMENT_STRENGTH, $list25, $str30$Return_the_strength_of_ARGUMENT_, $list27, $list31 );
    utilities_macros.register_cyc_api_function( $sym12$ASSERTED_ARGUMENT_P, $list14, $str33$Return_T_iff_OBJECT_is_an_HL_asse, NIL, $list16 );
    utilities_macros.register_cyc_api_function( $sym41$SUPPORT_P, $list14, $str42$Return_T_iff_OBJECT_can_be_a_supp, NIL, $list16 );
    utilities_macros.register_cyc_api_function( $sym47$SUPPORT_MODULE, $list48, $str49$Return_the_module_of_SUPPORT_, $list50, $list51 );
    utilities_macros.register_cyc_api_function( $sym52$SUPPORT_SENTENCE, $list48, $str53$Return_the_sentence_of_SUPPORT_, $list50, $list54 );
    access_macros.define_obsolete_register( $sym55$SUPPORT_FORMULA, $list56 );
    utilities_macros.register_cyc_api_function( $sym57$SUPPORT_MT, $list48, $str58$Return_the_microtheory_of_SUPPORT, $list50, $list59 );
    utilities_macros.register_cyc_api_function( $sym60$SUPPORT_TRUTH, $list48, $str61$Return_the_truth_of_SUPPORT_, $list50, $list28 );
    utilities_macros.register_cyc_api_function( $sym62$SUPPORT_STRENGTH, $list48, $str63$Return_the_strength_of_SUPPORT_, $list50, $list31 );
    utilities_macros.register_cyc_api_function( $sym64$HL_SUPPORT_P, $list14, $str65$Does_OBJECT_represent_an_HL_suppo, NIL, $list16 );
    utilities_macros.register_cyc_api_function( $sym70$MAKE_HL_SUPPORT, $list71, $str72$Construct_a_new_HL_support_, $list73, $list74 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_arguments_file();
  }

  @Override
  public void initializeVariables()
  {
    init_arguments_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_arguments_file();
  }
  static
  {
    me = new arguments();
    $argument_types$ = null;
    $argument_type_hierarchy$ = null;
    $asserted_argument_tv_table$ = null;
    $asserted_arguments$ = null;
    $assertion_support_module$ = null;
    $list0 = ConsesLow.list( ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "ARGUMENT" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "MESSAGE" ), makeString( "mapping Cyc arguments" ) ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $str1$mapping_Cyc_arguments = makeString( "mapping Cyc arguments" );
    $sym2$DO_ASSERTIONS = makeSymbol( "DO-ASSERTIONS" );
    $sym3$CDOLIST = makeSymbol( "CDOLIST" );
    $sym4$ASSERTION_ARGUMENTS = makeSymbol( "ASSERTION-ARGUMENTS" );
    $list5 = ConsesLow.list( ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "ARGUMENT" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "MESSAGE" ), makeString( "mapping Cyc belief arguments" ) ) ),
        makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $str6$mapping_Cyc_belief_arguments = makeString( "mapping Cyc belief arguments" );
    $sym7$DO_ARGUMENTS = makeSymbol( "DO-ARGUMENTS" );
    $sym8$PWHEN = makeSymbol( "PWHEN" );
    $sym9$BELIEF_P = makeSymbol( "BELIEF-P" );
    $list10 = ConsesLow.list( ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "ARGUMENT" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "MESSAGE" ), makeString( "mapping Cyc asserted arguments" ) ) ),
        makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $str11$mapping_Cyc_asserted_arguments = makeString( "mapping Cyc asserted arguments" );
    $sym12$ASSERTED_ARGUMENT_P = makeSymbol( "ASSERTED-ARGUMENT-P" );
    $sym13$ARGUMENT_P = makeSymbol( "ARGUMENT-P" );
    $list14 = ConsesLow.list( makeSymbol( "OBJECT" ) );
    $str15$Return_T_iff_OBJECT_is_an_HL_argu = makeString( "Return T iff OBJECT is an HL argument structure." );
    $list16 = ConsesLow.list( makeSymbol( "BOOLEANP" ) );
    $str17$unexpected_argument_type = makeString( "unexpected argument type" );
    $list18 = ConsesLow.list( makeKeyword( "ARGUMENT" ), makeKeyword( "BELIEF" ), makeKeyword( "ASSERTED-ARGUMENT" ), makeKeyword( "DEDUCTION" ) );
    $list19 = ConsesLow.list( ConsesLow.list( makeKeyword( "ARGUMENT" ), NIL ), ConsesLow.list( makeKeyword( "BELIEF" ), ConsesLow.list( makeKeyword( "ARGUMENT" ) ) ), ConsesLow.list( makeKeyword( "ASSERTED-ARGUMENT" ),
        ConsesLow.list( makeKeyword( "BELIEF" ) ) ), ConsesLow.list( makeKeyword( "DEDUCTION" ), ConsesLow.list( makeKeyword( "ARGUMENT" ) ) ) );
    $sym20$ARGUMENT_TYPE_PROPER_GENLS = makeSymbol( "ARGUMENT-TYPE-PROPER-GENLS" );
    $sym21$ARGUMENT_EQUAL = makeSymbol( "ARGUMENT-EQUAL" );
    $list22 = ConsesLow.list( makeSymbol( "ARGUMENT1" ), makeSymbol( "ARGUMENT2" ) );
    $str23$Return_T_iff_ARGUMENT1_and_ARGUME = makeString( "Return T iff ARGUMENT1 and ARGUMENT2 are equivalent " );
    $sym24$ARGUMENT_TRUTH = makeSymbol( "ARGUMENT-TRUTH" );
    $list25 = ConsesLow.list( makeSymbol( "ARGUMENT" ) );
    $str26$Return_the_truth_of_ARGUMENT_ = makeString( "Return the truth of ARGUMENT." );
    $list27 = ConsesLow.list( ConsesLow.list( makeSymbol( "ARGUMENT" ), makeSymbol( "ARGUMENT-P" ) ) );
    $list28 = ConsesLow.list( makeSymbol( "TRUTH-P" ) );
    $sym29$ARGUMENT_STRENGTH = makeSymbol( "ARGUMENT-STRENGTH" );
    $str30$Return_the_strength_of_ARGUMENT_ = makeString( "Return the strength of ARGUMENT." );
    $list31 = ConsesLow.list( makeSymbol( "EL-STRENGTH-P" ) );
    $str32$unexpected_belief_type = makeString( "unexpected belief type" );
    $str33$Return_T_iff_OBJECT_is_an_HL_asse = makeString( "Return T iff OBJECT is an HL asserted argument structure." );
    $kw34$ASSERTED_ARGUMENT = makeKeyword( "ASSERTED-ARGUMENT" );
    $sym35$EL_STRENGTH_SPEC_P = makeSymbol( "EL-STRENGTH-SPEC-P" );
    $list36 = ConsesLow.list( ConsesLow.list( makeKeyword( "ASSERTED-TRUE-MON" ), makeKeyword( "TRUE-MON" ) ), ConsesLow.list( makeKeyword( "ASSERTED-TRUE-DEF" ), makeKeyword( "TRUE-DEF" ) ), ConsesLow.list( makeKeyword(
        "ASSERTED-UNKNOWN" ), makeKeyword( "UNKNOWN" ) ), ConsesLow.list( makeKeyword( "ASSERTED-FALSE-DEF" ), makeKeyword( "FALSE-DEF" ) ), ConsesLow.list( makeKeyword( "ASSERTED-FALSE-MON" ), makeKeyword(
            "FALSE-MON" ) ) );
    $sym37$FIRST = makeSymbol( "FIRST" );
    $sym38$TV_P = makeSymbol( "TV-P" );
    $sym39$SECOND = makeSymbol( "SECOND" );
    $list40 = ConsesLow.list( makeKeyword( "LOCAL" ) );
    $sym41$SUPPORT_P = makeSymbol( "SUPPORT-P" );
    $str42$Return_T_iff_OBJECT_can_be_a_supp = makeString( "Return T iff OBJECT can be a support in an argument." );
    $sym43$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $kw44$SYNTACTICALLY_ILL_FORMED = makeKeyword( "SYNTACTICALLY-ILL-FORMED" );
    $sym45$SUPPORT__ = makeSymbol( "SUPPORT-<" );
    $kw46$ASSERTION = makeKeyword( "ASSERTION" );
    $sym47$SUPPORT_MODULE = makeSymbol( "SUPPORT-MODULE" );
    $list48 = ConsesLow.list( makeSymbol( "SUPPORT" ) );
    $str49$Return_the_module_of_SUPPORT_ = makeString( "Return the module of SUPPORT." );
    $list50 = ConsesLow.list( ConsesLow.list( makeSymbol( "SUPPORT" ), makeSymbol( "SUPPORT-P" ) ) );
    $list51 = ConsesLow.list( makeSymbol( "HL-SUPPORT-MODULE-P" ) );
    $sym52$SUPPORT_SENTENCE = makeSymbol( "SUPPORT-SENTENCE" );
    $str53$Return_the_sentence_of_SUPPORT_ = makeString( "Return the sentence of SUPPORT." );
    $list54 = ConsesLow.list( makeSymbol( "CONSP" ) );
    $sym55$SUPPORT_FORMULA = makeSymbol( "SUPPORT-FORMULA" );
    $list56 = ConsesLow.list( makeSymbol( "SUPPORT-SENTENCE" ) );
    $sym57$SUPPORT_MT = makeSymbol( "SUPPORT-MT" );
    $str58$Return_the_microtheory_of_SUPPORT = makeString( "Return the microtheory of SUPPORT." );
    $list59 = ConsesLow.list( makeSymbol( "HLMT-P" ) );
    $sym60$SUPPORT_TRUTH = makeSymbol( "SUPPORT-TRUTH" );
    $str61$Return_the_truth_of_SUPPORT_ = makeString( "Return the truth of SUPPORT." );
    $sym62$SUPPORT_STRENGTH = makeSymbol( "SUPPORT-STRENGTH" );
    $str63$Return_the_strength_of_SUPPORT_ = makeString( "Return the strength of SUPPORT." );
    $sym64$HL_SUPPORT_P = makeSymbol( "HL-SUPPORT-P" );
    $str65$Does_OBJECT_represent_an_HL_suppo = makeString( "Does OBJECT represent an HL support?" );
    $kw66$TRUE_DEF = makeKeyword( "TRUE-DEF" );
    $sym67$HL_SUPPORT_MODULE_P = makeSymbol( "HL-SUPPORT-MODULE-P" );
    $sym68$POSSIBLY_CYCL_SENTENCE_P = makeSymbol( "POSSIBLY-CYCL-SENTENCE-P" );
    $sym69$HLMT_P = makeSymbol( "HLMT-P" );
    $sym70$MAKE_HL_SUPPORT = makeSymbol( "MAKE-HL-SUPPORT" );
    $list71 = ConsesLow.list( makeSymbol( "HL-MODULE" ), makeSymbol( "SENTENCE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "MT" ), makeSymbol( "*MT*" ) ), ConsesLow.list( makeSymbol( "TV" ), makeKeyword(
        "TRUE-DEF" ) ) );
    $str72$Construct_a_new_HL_support_ = makeString( "Construct a new HL support." );
    $list73 = ConsesLow.list( ConsesLow.list( makeSymbol( "HL-MODULE" ), makeSymbol( "HL-SUPPORT-MODULE-P" ) ), ConsesLow.list( makeSymbol( "SENTENCE" ), makeSymbol( "POSSIBLY-CYCL-SENTENCE-P" ) ), ConsesLow.list(
        makeSymbol( "MT" ), makeSymbol( "HLMT-P" ) ), ConsesLow.list( makeSymbol( "TV" ), makeSymbol( "TV-P" ) ) );
    $list74 = ConsesLow.list( makeSymbol( "HL-SUPPORT-P" ) );
    $sym75$ASSERTION_P = makeSymbol( "ASSERTION-P" );
    $sym76$INVALID_INDEXED_TERM_ = makeSymbol( "INVALID-INDEXED-TERM?" );
    $kw77$GENLPREDS = makeKeyword( "GENLPREDS" );
    $list78 = ConsesLow.list( makeSymbol( "HL-MODULE" ), makeSymbol( "SENTENCE" ), makeSymbol( "MT" ), makeSymbol( "TV" ) );
    $sym79$HL_JUSTIFICATION_P = makeSymbol( "HL-JUSTIFICATION-P" );
    $sym80$SUPPORT_EQUAL = makeSymbol( "SUPPORT-EQUAL" );
  }

  public static final class $argument_type_proper_genls$UnaryFunction
      extends
        UnaryFunction
  {
    public $argument_type_proper_genls$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "ARGUMENT-TYPE-PROPER-GENLS" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return argument_type_proper_genls( arg1 );
    }
  }

  public static final class $asserted_argument_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $asserted_argument_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "ASSERTED-ARGUMENT-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return asserted_argument_p( arg1 );
    }
  }

  public static final class $support_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $support_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SUPPORT-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return support_p( arg1 );
    }
  }

  public static final class $support_equal$BinaryFunction
      extends
        BinaryFunction
  {
    public $support_equal$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SUPPORT-EQUAL" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return support_equal( arg1, arg2 );
    }
  }

  public static final class $support_L$BinaryFunction
      extends
        BinaryFunction
  {
    public $support_L$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SUPPORT-<" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return support_L( arg1, arg2 );
    }
  }

  public static final class $support_mt$UnaryFunction
      extends
        UnaryFunction
  {
    public $support_mt$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SUPPORT-MT" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return support_mt( arg1 );
    }
  }

  public static final class $justification_equal$BinaryFunction
      extends
        BinaryFunction
  {
    public $justification_equal$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "JUSTIFICATION-EQUAL" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return justification_equal( arg1, arg2 );
    }
  }
}
/*
 * 
 * Total time: 324 ms
 * 
 */