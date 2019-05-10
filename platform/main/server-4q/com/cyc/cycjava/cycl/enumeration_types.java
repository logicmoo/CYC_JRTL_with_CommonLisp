package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class enumeration_types
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.enumeration_types";
  public static final String myFingerPrint = "355d25ed60969111974def2c913c9f19628ea0aeba921f86e70d06f23133101c";
  @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 936L)
  private static SubLSymbol $valid_directions$;
  @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 1481L)
  private static SubLSymbol $valid_assertion_types$;
  @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 1777L)
  public static SubLSymbol $valid_el_strengths$;
  @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 2389L)
  private static SubLSymbol $valid_truths$;
  @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 3820L)
  public static SubLSymbol $valid_senses$;
  @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 4388L)
  private static SubLSymbol $valid_hl_truth_values$;
  @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 6860L)
  public static SubLSymbol $term_args$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$DIRECTION_P;
  private static final SubLList $list2;
  private static final SubLString $str3$Return_T_iff_OBJECT_is_a_valid_as;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$EL_STRENGTH_P;
  private static final SubLString $str8$Return_T_iff_OBJECT_is_a_valid_Cy;
  private static final SubLSymbol $kw9$UNSPECIFIED;
  private static final SubLList $list10;
  private static final SubLSymbol $kw11$TRUE;
  private static final SubLSymbol $kw12$FALSE;
  private static final SubLSymbol $kw13$UNKNOWN;
  private static final SubLSymbol $sym14$TRUTH_P;
  private static final SubLString $str15$Returns_T_iff_OBJECT_is_a_valid_C;
  private static final SubLString $str16$_S_is_not_a_TRUTH_P;
  private static final SubLSymbol $kw17$POS;
  private static final SubLSymbol $kw18$NEG;
  private static final SubLString $str19$_unknown_cannot_be_converted_into;
  private static final SubLList $list20;
  private static final SubLSymbol $sym21$SENSE_P;
  private static final SubLString $str22$Return_T_iff_OBJECT_is_a_valid_Cy;
  private static final SubLString $str23$_S_is_not_a_SENSE_P;
  private static final SubLList $list24;
  private static final SubLSymbol $kw25$TRUE_DEF;
  private static final SubLSymbol $kw26$DEFAULT;
  private static final SubLSymbol $kw27$TRUE_MON;
  private static final SubLSymbol $kw28$MONOTONIC;
  private static final SubLSymbol $kw29$FALSE_DEF;
  private static final SubLSymbol $kw30$FALSE_MON;
  private static final SubLSymbol $kw31$UNKNOWN_MON;
  private static final SubLString $str32$_S_does_not_satisfy_TV_P;
  private static final SubLString $str33$_S_is_not_a_STRENGTH_P;
  private static final SubLList $list34;

  @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 1060L)
  public static SubLObject valid_directions()
  {
    return $valid_directions$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 1117L)
  public static SubLObject direction_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $valid_directions$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 1323L)
  public static SubLObject encode_direction(final SubLObject direction)
  {
    return Sequences.position( direction, valid_directions(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 1408L)
  public static SubLObject decode_direction(final SubLObject fixnum)
  {
    return ConsesLow.nth( fixnum, valid_directions() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 1611L)
  public static SubLObject assertion_type_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $valid_assertion_types$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 1896L)
  public static SubLObject el_strength_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $valid_el_strengths$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 2096L)
  public static SubLObject el_strength_spec_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_strength_p( v_object ) || $kw9$UNSPECIFIED == v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 2208L)
  public static SubLObject el_strength_implies(final SubLObject strength1, final SubLObject strength2)
  {
    return makeBoolean( NIL == list_utilities.position_L( strength1, strength2, $valid_el_strengths$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 2497L)
  public static SubLObject valid_truths()
  {
    return $valid_truths$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 2546L)
  public static SubLObject truth_p(final SubLObject v_object)
  {
    return makeBoolean( v_object == $kw11$TRUE || v_object == $kw12$FALSE || v_object == $kw13$UNKNOWN );
  }

  @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 2820L)
  public static SubLObject inverse_truth(final SubLObject truth)
  {
    if( truth.eql( $kw11$TRUE ) )
    {
      return $kw12$FALSE;
    }
    if( truth.eql( $kw12$FALSE ) )
    {
      return $kw11$TRUE;
    }
    if( truth.eql( $kw13$UNKNOWN ) )
    {
      return $kw13$UNKNOWN;
    }
    return Errors.error( $str16$_S_is_not_a_TRUTH_P, truth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 3016L)
  public static SubLObject truth_sense(final SubLObject truth)
  {
    if( truth.eql( $kw11$TRUE ) )
    {
      return $kw17$POS;
    }
    if( truth.eql( $kw12$FALSE ) )
    {
      return $kw18$NEG;
    }
    if( truth.eql( $kw13$UNKNOWN ) )
    {
      return $kw18$NEG;
    }
    return Errors.error( $str16$_S_is_not_a_TRUTH_P, truth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 3322L)
  public static SubLObject truth_boolean(final SubLObject truth)
  {
    if( truth.eql( $kw11$TRUE ) )
    {
      return T;
    }
    if( truth.eql( $kw12$FALSE ) )
    {
      return NIL;
    }
    if( truth.eql( $kw13$UNKNOWN ) )
    {
      Errors.error( $str19$_unknown_cannot_be_converted_into );
      return NIL;
    }
    return Errors.error( $str16$_S_is_not_a_TRUTH_P, truth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 3557L)
  public static SubLObject boolean_truth(final SubLObject v_boolean)
  {
    return ( NIL != v_boolean ) ? $kw11$TRUE : $kw12$FALSE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 3693L)
  public static SubLObject boolean_to_match_count(final SubLObject v_boolean)
  {
    return ( NIL != v_boolean ) ? ONE_INTEGER : ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 3905L)
  public static SubLObject sense_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $valid_senses$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 4077L)
  public static SubLObject inverse_sense(final SubLObject sense)
  {
    if( sense.eql( $kw17$POS ) )
    {
      return $kw18$NEG;
    }
    if( sense.eql( $kw18$NEG ) )
    {
      return $kw17$POS;
    }
    return Errors.error( $str23$_S_is_not_a_SENSE_P, sense );
  }

  @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 4232L)
  public static SubLObject sense_truth(final SubLObject sense)
  {
    if( sense.eql( $kw17$POS ) )
    {
      return $kw11$TRUE;
    }
    if( sense.eql( $kw18$NEG ) )
    {
      return $kw12$FALSE;
    }
    return Errors.error( $str23$_S_is_not_a_SENSE_P, sense );
  }

  @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 4535L)
  public static SubLObject valid_hl_truth_values()
  {
    return $valid_hl_truth_values$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 4602L)
  public static SubLObject tv_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $valid_hl_truth_values$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 4735L)
  public static SubLObject encode_tv(final SubLObject tv)
  {
    return Sequences.position( tv, valid_hl_truth_values(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 4804L)
  public static SubLObject decode_tv(final SubLObject fixnum)
  {
    return ConsesLow.nth( fixnum, valid_hl_truth_values() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 4875L)
  public static SubLObject tv_strength(final SubLObject tv)
  {
    if( tv.eql( $kw25$TRUE_DEF ) )
    {
      return $kw26$DEFAULT;
    }
    if( tv.eql( $kw27$TRUE_MON ) )
    {
      return $kw28$MONOTONIC;
    }
    if( tv.eql( $kw29$FALSE_DEF ) )
    {
      return $kw26$DEFAULT;
    }
    if( tv.eql( $kw30$FALSE_MON ) )
    {
      return $kw28$MONOTONIC;
    }
    if( tv.eql( $kw13$UNKNOWN ) )
    {
      return $kw26$DEFAULT;
    }
    if( tv.eql( $kw31$UNKNOWN_MON ) )
    {
      return $kw28$MONOTONIC;
    }
    return Errors.error( $str32$_S_does_not_satisfy_TV_P, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 5180L)
  public static SubLObject tv_truth(final SubLObject tv)
  {
    if( tv.eql( $kw25$TRUE_DEF ) )
    {
      return $kw11$TRUE;
    }
    if( tv.eql( $kw27$TRUE_MON ) )
    {
      return $kw11$TRUE;
    }
    if( tv.eql( $kw29$FALSE_DEF ) )
    {
      return $kw12$FALSE;
    }
    if( tv.eql( $kw30$FALSE_MON ) )
    {
      return $kw12$FALSE;
    }
    if( tv.eql( $kw13$UNKNOWN ) )
    {
      return $kw13$UNKNOWN;
    }
    if( tv.eql( $kw31$UNKNOWN_MON ) )
    {
      return $kw13$UNKNOWN;
    }
    return Errors.error( $str32$_S_does_not_satisfy_TV_P, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 5466L)
  public static SubLObject inverse_tv(final SubLObject tv)
  {
    if( tv.eql( $kw27$TRUE_MON ) )
    {
      return $kw30$FALSE_MON;
    }
    if( tv.eql( $kw25$TRUE_DEF ) )
    {
      return $kw29$FALSE_DEF;
    }
    if( tv.eql( $kw30$FALSE_MON ) )
    {
      return $kw27$TRUE_MON;
    }
    if( tv.eql( $kw29$FALSE_DEF ) )
    {
      return $kw25$TRUE_DEF;
    }
    if( tv.eql( $kw13$UNKNOWN ) )
    {
      return $kw13$UNKNOWN;
    }
    if( tv.eql( $kw31$UNKNOWN_MON ) )
    {
      return $kw31$UNKNOWN_MON;
    }
    return Errors.error( $str32$_S_does_not_satisfy_TV_P, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 5774L)
  public static SubLObject tv_trueP(final SubLObject tv)
  {
    return makeBoolean( tv == $kw25$TRUE_DEF || tv == $kw27$TRUE_MON );
  }

  @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 5853L)
  public static SubLObject tv_falseP(final SubLObject tv)
  {
    return makeBoolean( tv == $kw29$FALSE_DEF || tv == $kw30$FALSE_MON );
  }

  @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 5935L)
  public static SubLObject tv_unknownP(final SubLObject tv)
  {
    return makeBoolean( tv == $kw13$UNKNOWN || tv == $kw31$UNKNOWN_MON );
  }

  @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 6019L)
  public static SubLObject tv_sense(final SubLObject tv)
  {
    return truth_sense( tv_truth( tv ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 6079L)
  public static SubLObject tv_from_truth_strength(final SubLObject truth, final SubLObject strength)
  {
    if( truth.eql( $kw11$TRUE ) )
    {
      if( strength.eql( $kw26$DEFAULT ) )
      {
        return $kw25$TRUE_DEF;
      }
      if( strength.eql( $kw28$MONOTONIC ) )
      {
        return $kw27$TRUE_MON;
      }
      return Errors.error( $str33$_S_is_not_a_STRENGTH_P, strength );
    }
    else if( truth.eql( $kw12$FALSE ) )
    {
      if( strength.eql( $kw26$DEFAULT ) )
      {
        return $kw29$FALSE_DEF;
      }
      if( strength.eql( $kw28$MONOTONIC ) )
      {
        return $kw30$FALSE_MON;
      }
      return Errors.error( $str33$_S_is_not_a_STRENGTH_P, strength );
    }
    else
    {
      if( !truth.eql( $kw13$UNKNOWN ) )
      {
        return Errors.error( $str16$_S_is_not_a_TRUTH_P, truth );
      }
      if( strength.eql( $kw26$DEFAULT ) )
      {
        return $kw13$UNKNOWN;
      }
      if( strength.eql( $kw28$MONOTONIC ) )
      {
        return $kw31$UNKNOWN_MON;
      }
      return Errors.error( $str33$_S_is_not_a_STRENGTH_P, strength );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 6738L)
  public static SubLObject tv_from_sense_strength(final SubLObject sense, final SubLObject strength)
  {
    return tv_from_truth_strength( sense_truth( sense ), strength );
  }

  @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 6991L)
  public static SubLObject term_arg_p(final SubLObject v_object)
  {
    return conses_high.member( v_object, $term_args$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  public static SubLObject declare_enumeration_types_file()
  {
    SubLFiles.declareFunction( me, "valid_directions", "VALID-DIRECTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "direction_p", "DIRECTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "encode_direction", "ENCODE-DIRECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "decode_direction", "DECODE-DIRECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "assertion_type_p", "ASSERTION-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "el_strength_p", "EL-STRENGTH-P", 1, 0, false );
    SubLFiles.declareFunction( me, "el_strength_spec_p", "EL-STRENGTH-SPEC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "el_strength_implies", "EL-STRENGTH-IMPLIES", 2, 0, false );
    SubLFiles.declareFunction( me, "valid_truths", "VALID-TRUTHS", 0, 0, false );
    SubLFiles.declareFunction( me, "truth_p", "TRUTH-P", 1, 0, false );
    SubLFiles.declareFunction( me, "inverse_truth", "INVERSE-TRUTH", 1, 0, false );
    SubLFiles.declareFunction( me, "truth_sense", "TRUTH-SENSE", 1, 0, false );
    SubLFiles.declareFunction( me, "truth_boolean", "TRUTH-BOOLEAN", 1, 0, false );
    SubLFiles.declareFunction( me, "boolean_truth", "BOOLEAN-TRUTH", 1, 0, false );
    SubLFiles.declareFunction( me, "boolean_to_match_count", "BOOLEAN-TO-MATCH-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "sense_p", "SENSE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "inverse_sense", "INVERSE-SENSE", 1, 0, false );
    SubLFiles.declareFunction( me, "sense_truth", "SENSE-TRUTH", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_hl_truth_values", "VALID-HL-TRUTH-VALUES", 0, 0, false );
    SubLFiles.declareFunction( me, "tv_p", "TV-P", 1, 0, false );
    SubLFiles.declareFunction( me, "encode_tv", "ENCODE-TV", 1, 0, false );
    SubLFiles.declareFunction( me, "decode_tv", "DECODE-TV", 1, 0, false );
    SubLFiles.declareFunction( me, "tv_strength", "TV-STRENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "tv_truth", "TV-TRUTH", 1, 0, false );
    SubLFiles.declareFunction( me, "inverse_tv", "INVERSE-TV", 1, 0, false );
    SubLFiles.declareFunction( me, "tv_trueP", "TV-TRUE?", 1, 0, false );
    SubLFiles.declareFunction( me, "tv_falseP", "TV-FALSE?", 1, 0, false );
    SubLFiles.declareFunction( me, "tv_unknownP", "TV-UNKNOWN?", 1, 0, false );
    SubLFiles.declareFunction( me, "tv_sense", "TV-SENSE", 1, 0, false );
    SubLFiles.declareFunction( me, "tv_from_truth_strength", "TV-FROM-TRUTH-STRENGTH", 2, 0, false );
    SubLFiles.declareFunction( me, "tv_from_sense_strength", "TV-FROM-SENSE-STRENGTH", 2, 0, false );
    SubLFiles.declareFunction( me, "term_arg_p", "TERM-ARG-P", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_enumeration_types_file()
  {
    $valid_directions$ = SubLFiles.defconstant( "*VALID-DIRECTIONS*", $list0 );
    $valid_assertion_types$ = SubLFiles.defconstant( "*VALID-ASSERTION-TYPES*", $list5 );
    $valid_el_strengths$ = SubLFiles.defconstant( "*VALID-EL-STRENGTHS*", $list6 );
    $valid_truths$ = SubLFiles.defconstant( "*VALID-TRUTHS*", $list10 );
    $valid_senses$ = SubLFiles.defconstant( "*VALID-SENSES*", $list20 );
    $valid_hl_truth_values$ = SubLFiles.defconstant( "*VALID-HL-TRUTH-VALUES*", $list24 );
    $term_args$ = SubLFiles.defconstant( "*TERM-ARGS*", $list34 );
    return NIL;
  }

  public static SubLObject setup_enumeration_types_file()
  {
    utilities_macros.register_cyc_api_function( $sym1$DIRECTION_P, $list2, $str3$Return_T_iff_OBJECT_is_a_valid_as, NIL, $list4 );
    utilities_macros.register_cyc_api_function( $sym7$EL_STRENGTH_P, $list2, $str8$Return_T_iff_OBJECT_is_a_valid_Cy, NIL, $list4 );
    utilities_macros.register_cyc_api_function( $sym14$TRUTH_P, $list2, $str15$Returns_T_iff_OBJECT_is_a_valid_C, NIL, NIL );
    utilities_macros.register_cyc_api_function( $sym21$SENSE_P, $list2, $str22$Return_T_iff_OBJECT_is_a_valid_Cy, NIL, $list4 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_enumeration_types_file();
  }

  @Override
  public void initializeVariables()
  {
    init_enumeration_types_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_enumeration_types_file();
  }
  static
  {
    me = new enumeration_types();
    $valid_directions$ = null;
    $valid_assertion_types$ = null;
    $valid_el_strengths$ = null;
    $valid_truths$ = null;
    $valid_senses$ = null;
    $valid_hl_truth_values$ = null;
    $term_args$ = null;
    $list0 = ConsesLow.list( makeKeyword( "BACKWARD" ), makeKeyword( "FORWARD" ), makeKeyword( "CODE" ) );
    $sym1$DIRECTION_P = makeSymbol( "DIRECTION-P" );
    $list2 = ConsesLow.list( makeSymbol( "OBJECT" ) );
    $str3$Return_T_iff_OBJECT_is_a_valid_as = makeString( "Return T iff OBJECT is a valid assertion inference direction\n :backward :forward or :code." );
    $list4 = ConsesLow.list( makeSymbol( "BOOLEANP" ) );
    $list5 = ConsesLow.list( makeKeyword( "GAF" ), makeKeyword( "RULE" ) );
    $list6 = ConsesLow.list( makeKeyword( "DEFAULT" ), makeKeyword( "MONOTONIC" ) );
    $sym7$EL_STRENGTH_P = makeSymbol( "EL-STRENGTH-P" );
    $str8$Return_T_iff_OBJECT_is_a_valid_Cy = makeString( "Return T iff OBJECT is a valid CycL assertion strength \n :default or :monotonic." );
    $kw9$UNSPECIFIED = makeKeyword( "UNSPECIFIED" );
    $list10 = ConsesLow.list( makeKeyword( "TRUE" ), makeKeyword( "UNKNOWN" ), makeKeyword( "FALSE" ) );
    $kw11$TRUE = makeKeyword( "TRUE" );
    $kw12$FALSE = makeKeyword( "FALSE" );
    $kw13$UNKNOWN = makeKeyword( "UNKNOWN" );
    $sym14$TRUTH_P = makeSymbol( "TRUTH-P" );
    $str15$Returns_T_iff_OBJECT_is_a_valid_C = makeString( "Returns T iff OBJECT is a valid CycL truth\n :true :false or :unknown." );
    $str16$_S_is_not_a_TRUTH_P = makeString( "~S is not a TRUTH-P" );
    $kw17$POS = makeKeyword( "POS" );
    $kw18$NEG = makeKeyword( "NEG" );
    $str19$_unknown_cannot_be_converted_into = makeString( ":unknown cannot be converted into a boolean" );
    $list20 = ConsesLow.list( makeKeyword( "NEG" ), makeKeyword( "POS" ) );
    $sym21$SENSE_P = makeSymbol( "SENSE-P" );
    $str22$Return_T_iff_OBJECT_is_a_valid_Cy = makeString( "Return T iff OBJECT is a valid CycL literal sense\n :neg or :pos." );
    $str23$_S_is_not_a_SENSE_P = makeString( "~S is not a SENSE-P" );
    $list24 = ConsesLow.list( makeKeyword( "TRUE-MON" ), makeKeyword( "TRUE-DEF" ), makeKeyword( "UNKNOWN" ), makeKeyword( "FALSE-DEF" ), makeKeyword( "FALSE-MON" ), makeKeyword( "UNKNOWN-MON" ) );
    $kw25$TRUE_DEF = makeKeyword( "TRUE-DEF" );
    $kw26$DEFAULT = makeKeyword( "DEFAULT" );
    $kw27$TRUE_MON = makeKeyword( "TRUE-MON" );
    $kw28$MONOTONIC = makeKeyword( "MONOTONIC" );
    $kw29$FALSE_DEF = makeKeyword( "FALSE-DEF" );
    $kw30$FALSE_MON = makeKeyword( "FALSE-MON" );
    $kw31$UNKNOWN_MON = makeKeyword( "UNKNOWN-MON" );
    $str32$_S_does_not_satisfy_TV_P = makeString( "~S does not satisfy TV-P" );
    $str33$_S_is_not_a_STRENGTH_P = makeString( "~S is not a STRENGTH-P" );
    $list34 = ConsesLow.list( new SubLObject[] { ONE_INTEGER, TWO_INTEGER, ZERO_INTEGER, makeKeyword( "NEG" ), makeKeyword( "POS" ), THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, makeKeyword( "IST" ), makeKeyword( "OTHER" )
    } );
  }
}
/*
 * 
 * Total time: 135 ms
 * 
 */