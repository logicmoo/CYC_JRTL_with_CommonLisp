package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class defstruct_sequence
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.defstruct_sequence";
  public static final String myFingerPrint = "74bc1645a3516a62f3cb2740149792a024130333d99fe0af169bd6e25c6ae1e0";
  private static final SubLList $list0;
  private static final SubLSymbol $kw1$VECTOR;
  private static final SubLSymbol $sym2$DEFSTRUCT_VECTOR;
  private static final SubLString $str3$A_simplified_version_of_DEFSTRUCT;
  private static final SubLSymbol $kw4$LIST;
  private static final SubLSymbol $sym5$DEFSTRUCT_LIST;
  private static final SubLString $str6$A_simplified_version_of_DEFSTRUCT;
  private static final SubLSymbol $sym7$DEFSTRUCT_VECTOR_CONSTRUCTOR;
  private static final SubLSymbol $sym8$DEFSTRUCT_LIST_CONSTRUCTOR;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$DEFINE;
  private static final SubLList $list11;
  private static final SubLSymbol $sym12$RET;
  private static final SubLSymbol $sym13$CAND;
  private static final SubLList $list14;
  private static final SubLSymbol $sym15$_;
  private static final SubLList $list16;
  private static final SubLSymbol $sym17$QUOTE;
  private static final SubLList $list18;
  private static final SubLList $list19;
  private static final SubLList $list20;
  private static final SubLList $list21;
  private static final SubLList $list22;
  private static final SubLList $list23;
  private static final SubLList $list24;
  private static final SubLSymbol $sym25$CHECK_TYPE;
  private static final SubLSymbol $sym26$OBJECT;
  private static final SubLSymbol $sym27$AREF;
  private static final SubLSymbol $sym28$NTH;
  private static final SubLList $list29;
  private static final SubLSymbol $sym30$SET_AREF;
  private static final SubLList $list31;
  private static final SubLList $list32;
  private static final SubLSymbol $sym33$SET_NTH;
  private static final SubLSymbol $sym34$PROGN;
  private static final SubLString $str35$_P;
  private static final SubLString $str36$MAKE_;
  private static final SubLString $str37$_;
  private static final SubLString $str38$SET_;
  private static final SubLSymbol $sym39$DEFSTRUCT_SEQUENCE_INTERNAL;
  private static final SubLSymbol $kw40$TEST;
  private static final SubLSymbol $kw41$OWNER;
  private static final SubLSymbol $kw42$CLASSES;
  private static final SubLSymbol $kw43$KB;
  private static final SubLSymbol $kw44$TINY;
  private static final SubLSymbol $kw45$WORKING_;
  private static final SubLList $list46;

  @SubLTranslatedFile.SubL(source = "cycl/defstruct-sequence.lisp", position = 980L)
  public static SubLObject defstruct_vector(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    name = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject v_slots;
      current = ( v_slots = temp );
      return defstruct_sequence_internal( $kw1$VECTOR, name, v_slots );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/defstruct-sequence.lisp", position = 1604L)
  public static SubLObject defstruct_list(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    name = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject v_slots;
      current = ( v_slots = temp );
      return defstruct_sequence_internal( $kw4$LIST, name, v_slots );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/defstruct-sequence.lisp", position = 2253L)
  public static SubLObject defstruct_vector_constructor(final SubLObject type, final SubLObject size, final SubLObject slot_keys, final SubLObject parameters)
  {
    final SubLObject vector = Vectors.make_vector( size, NIL );
    Vectors.set_aref( vector, ZERO_INTEGER, type );
    SubLObject remainder;
    SubLObject parameter;
    SubLObject value;
    SubLObject index;
    for( remainder = NIL, remainder = parameters; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      parameter = remainder.first();
      value = conses_high.cadr( remainder );
      index = Sequences.position( parameter, slot_keys, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      Vectors.set_aref( vector, number_utilities.f_1X( index ), value );
    }
    return vector;
  }

  @SubLTranslatedFile.SubL(source = "cycl/defstruct-sequence.lisp", position = 2644L)
  public static SubLObject defstruct_list_constructor(final SubLObject type, final SubLObject size, final SubLObject slot_keys, final SubLObject parameters)
  {
    final SubLObject list = ConsesLow.make_list( size, NIL );
    ConsesLow.set_nth( ZERO_INTEGER, list, type );
    SubLObject remainder;
    SubLObject parameter;
    SubLObject value;
    SubLObject index;
    for( remainder = NIL, remainder = parameters; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      parameter = remainder.first();
      value = conses_high.cadr( remainder );
      index = Sequences.position( parameter, slot_keys, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      ConsesLow.set_nth( number_utilities.f_1X( index ), list, value );
    }
    return list;
  }

  @SubLTranslatedFile.SubL(source = "cycl/defstruct-sequence.lisp", position = 2963L)
  public static SubLObject defstruct_sequence_internal(final SubLObject type, final SubLObject name, final SubLObject v_slots)
  {
    final SubLObject data = defstruct_sequence_data( name, v_slots );
    SubLObject current;
    final SubLObject datum = current = data;
    SubLObject predicate = NIL;
    SubLObject constructor = NIL;
    SubLObject slot_keys = NIL;
    SubLObject getter_setter_pairs = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    predicate = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    constructor = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    slot_keys = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    getter_setter_pairs = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject size = Numbers.add( ONE_INTEGER, Sequences.length( v_slots ) );
      SubLObject predicate_method = NIL;
      SubLObject constructor_method = NIL;
      SubLObject getter_methods = NIL;
      SubLObject setter_methods = NIL;
      if( type.eql( $kw1$VECTOR ) )
      {
        predicate_method = ConsesLow.list( $sym10$DEFINE, predicate, $list11, ConsesLow.list( $sym12$RET, ConsesLow.list( $sym13$CAND, $list14, ConsesLow.listS( $sym15$_, size, $list16 ), ConsesLow.listS( EQ, ConsesLow
            .list( $sym17$QUOTE, name ), $list18 ) ) ) );
      }
      else if( type.eql( $kw4$LIST ) )
      {
        predicate_method = ConsesLow.list( $sym10$DEFINE, predicate, $list11, ConsesLow.list( $sym12$RET, ConsesLow.list( $sym13$CAND, $list19, ConsesLow.listS( EQ, ConsesLow.list( $sym17$QUOTE, name ), $list20 ),
            $list21, ConsesLow.listS( $sym15$_, size, $list16 ) ) ) );
      }
      if( type.eql( $kw1$VECTOR ) )
      {
        constructor_method = ConsesLow.list( $sym10$DEFINE, constructor, $list22, ConsesLow.list( $sym12$RET, ConsesLow.listS( $sym7$DEFSTRUCT_VECTOR_CONSTRUCTOR, ConsesLow.list( $sym17$QUOTE, name ), size, ConsesLow
            .list( $sym17$QUOTE, slot_keys ), $list23 ) ) );
      }
      else if( type.eql( $kw4$LIST ) )
      {
        constructor_method = ConsesLow.list( $sym10$DEFINE, constructor, $list22, ConsesLow.list( $sym12$RET, ConsesLow.listS( $sym8$DEFSTRUCT_LIST_CONSTRUCTOR, ConsesLow.list( $sym17$QUOTE, name ), size, ConsesLow.list(
            $sym17$QUOTE, slot_keys ), $list23 ) ) );
      }
      SubLObject index = ZERO_INTEGER;
      SubLObject cdolist_list_var = getter_setter_pairs;
      SubLObject getter_setter_pair = NIL;
      getter_setter_pair = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        index = Numbers.add( index, ONE_INTEGER );
        SubLObject current_$2;
        final SubLObject datum_$1 = current_$2 = getter_setter_pair;
        SubLObject getter = NIL;
        SubLObject setter = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$2, datum_$1, $list24 );
        getter = current_$2.first();
        current_$2 = current_$2.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current_$2, datum_$1, $list24 );
        setter = current_$2.first();
        current_$2 = current_$2.rest();
        if( NIL == current_$2 )
        {
          if( type.eql( $kw1$VECTOR ) )
          {
            getter_methods = ConsesLow.cons( ConsesLow.list( $sym10$DEFINE, getter, $list11, ConsesLow.list( $sym25$CHECK_TYPE, $sym26$OBJECT, predicate ), ConsesLow.list( $sym12$RET, ConsesLow.list( $sym27$AREF,
                $sym26$OBJECT, index ) ) ), getter_methods );
          }
          else if( type.eql( $kw4$LIST ) )
          {
            getter_methods = ConsesLow.cons( ConsesLow.list( $sym10$DEFINE, getter, $list11, ConsesLow.list( $sym25$CHECK_TYPE, $sym26$OBJECT, predicate ), ConsesLow.list( $sym12$RET, ConsesLow.listS( $sym28$NTH, index,
                $list11 ) ) ), getter_methods );
          }
          if( type.eql( $kw1$VECTOR ) )
          {
            setter_methods = ConsesLow.cons( ConsesLow.listS( $sym10$DEFINE, setter, $list29, ConsesLow.list( $sym25$CHECK_TYPE, $sym26$OBJECT, predicate ), ConsesLow.listS( $sym30$SET_AREF, $sym26$OBJECT, index,
                $list31 ), $list32 ), setter_methods );
          }
          else if( type.eql( $kw4$LIST ) )
          {
            setter_methods = ConsesLow.cons( ConsesLow.listS( $sym10$DEFINE, setter, $list29, ConsesLow.list( $sym25$CHECK_TYPE, $sym26$OBJECT, predicate ), ConsesLow.listS( $sym33$SET_NTH, index, $list29 ), $list32 ),
                setter_methods );
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum_$1, $list24 );
        }
        cdolist_list_var = cdolist_list_var.rest();
        getter_setter_pair = cdolist_list_var.first();
      }
      return ConsesLow.listS( $sym34$PROGN, predicate_method, constructor_method, ConsesLow.append( Sequences.nreverse( getter_methods ), Sequences.nreverse( setter_methods ), ConsesLow.list( ConsesLow.list( IDENTITY,
          ConsesLow.list( $sym17$QUOTE, name ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list9 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/defstruct-sequence.lisp", position = 5093L)
  public static SubLObject defstruct_sequence_data(final SubLObject name, final SubLObject v_slots)
  {
    final SubLObject predicate = Packages.intern( Sequences.cconcatenate( format_nil.format_nil_a_no_copy( name ), $str35$_P ), control_vars.$cyc_package$.getGlobalValue() );
    final SubLObject constructor = Packages.intern( Sequences.cconcatenate( $str36$MAKE_, format_nil.format_nil_a_no_copy( name ) ), control_vars.$cyc_package$.getGlobalValue() );
    SubLObject slot_keys = NIL;
    SubLObject getter_setter_pairs = NIL;
    SubLObject cdolist_list_var = v_slots;
    SubLObject slot = NIL;
    slot = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject slot_key = Symbols.make_keyword( slot );
      final SubLObject getter = Packages.intern( Sequences.cconcatenate( format_nil.format_nil_a_no_copy( name ), new SubLObject[] { $str37$_, format_nil.format_nil_a_no_copy( slot )
      } ), control_vars.$cyc_package$.getGlobalValue() );
      final SubLObject setter = Packages.intern( Sequences.cconcatenate( $str38$SET_, new SubLObject[] { format_nil.format_nil_a_no_copy( name ), $str37$_, format_nil.format_nil_a_no_copy( slot )
      } ), control_vars.$cyc_package$.getGlobalValue() );
      slot_keys = ConsesLow.cons( slot_key, slot_keys );
      getter_setter_pairs = ConsesLow.cons( ConsesLow.list( getter, setter ), getter_setter_pairs );
      cdolist_list_var = cdolist_list_var.rest();
      slot = cdolist_list_var.first();
    }
    return ConsesLow.list( predicate, constructor, Sequences.nreverse( slot_keys ), Sequences.nreverse( getter_setter_pairs ) );
  }

  public static SubLObject declare_defstruct_sequence_file()
  {
    SubLFiles.declareMacro( me, "defstruct_vector", "DEFSTRUCT-VECTOR" );
    SubLFiles.declareMacro( me, "defstruct_list", "DEFSTRUCT-LIST" );
    SubLFiles.declareFunction( me, "defstruct_vector_constructor", "DEFSTRUCT-VECTOR-CONSTRUCTOR", 4, 0, false );
    SubLFiles.declareFunction( me, "defstruct_list_constructor", "DEFSTRUCT-LIST-CONSTRUCTOR", 4, 0, false );
    SubLFiles.declareFunction( me, "defstruct_sequence_internal", "DEFSTRUCT-SEQUENCE-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "defstruct_sequence_data", "DEFSTRUCT-SEQUENCE-DATA", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_defstruct_sequence_file()
  {
    return NIL;
  }

  public static SubLObject setup_defstruct_sequence_file()
  {
    utilities_macros.register_cyc_api_macro( $sym2$DEFSTRUCT_VECTOR, $list0, $str3$A_simplified_version_of_DEFSTRUCT );
    utilities_macros.register_cyc_api_macro( $sym5$DEFSTRUCT_LIST, $list0, $str6$A_simplified_version_of_DEFSTRUCT );
    access_macros.register_external_symbol( $sym7$DEFSTRUCT_VECTOR_CONSTRUCTOR );
    access_macros.register_macro_helper( $sym7$DEFSTRUCT_VECTOR_CONSTRUCTOR, $sym2$DEFSTRUCT_VECTOR );
    access_macros.register_external_symbol( $sym8$DEFSTRUCT_LIST_CONSTRUCTOR );
    access_macros.register_macro_helper( $sym8$DEFSTRUCT_LIST_CONSTRUCTOR, $sym5$DEFSTRUCT_LIST );
    generic_testing.define_test_case_table_int( $sym39$DEFSTRUCT_SEQUENCE_INTERNAL, ConsesLow.list( new SubLObject[] { $kw40$TEST, Symbols.symbol_function( EQUAL ), $kw41$OWNER, NIL, $kw42$CLASSES, NIL, $kw43$KB,
      $kw44$TINY, $kw45$WORKING_, T
    } ), $list46 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_defstruct_sequence_file();
  }

  @Override
  public void initializeVariables()
  {
    init_defstruct_sequence_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_defstruct_sequence_file();
  }
  static
  {
    me = new defstruct_sequence();
    $list0 = ConsesLow.list( ConsesLow.list( makeSymbol( "NAME" ) ), makeSymbol( "&BODY" ), makeSymbol( "SLOTS" ) );
    $kw1$VECTOR = makeKeyword( "VECTOR" );
    $sym2$DEFSTRUCT_VECTOR = makeSymbol( "DEFSTRUCT-VECTOR" );
    $str3$A_simplified_version_of_DEFSTRUCT = makeString(
        "A simplified version of DEFSTRUCT that just creates and manipulates vector objects.\n   NAME is a symbol (such as FOO) used to generate 4 classes of methods :\n   (1) a constructor MAKE-FOO (&optional arglist)\n   (2) a predicate FOO-P (object)\n   (3) for each SLOT in SLOTS, a getter of the form FOO-SLOT (object)\n   (4) for each SLOT in SLOTS, a setter of the form SET-FOO-SLOT (object value)" );
    $kw4$LIST = makeKeyword( "LIST" );
    $sym5$DEFSTRUCT_LIST = makeSymbol( "DEFSTRUCT-LIST" );
    $str6$A_simplified_version_of_DEFSTRUCT = makeString(
        "A simplified version of DEFSTRUCT that just creates and manipulates list objects.\n   NAME is a symbol (such as FOO) used to generate 4 classes of methods :\n   (1) a constructor MAKE-FOO (&optional arglist)\n   (2) a predicate FOO-P (object)\n   (3) for each SLOT in SLOTS, a getter of the form FOO-SLOT (object)\n   (4) for each SLOT in SLOTS, a setter of the form SET-FOO-SLOT (object value)" );
    $sym7$DEFSTRUCT_VECTOR_CONSTRUCTOR = makeSymbol( "DEFSTRUCT-VECTOR-CONSTRUCTOR" );
    $sym8$DEFSTRUCT_LIST_CONSTRUCTOR = makeSymbol( "DEFSTRUCT-LIST-CONSTRUCTOR" );
    $list9 = ConsesLow.list( makeSymbol( "PREDICATE" ), makeSymbol( "CONSTRUCTOR" ), makeSymbol( "SLOT-KEYS" ), makeSymbol( "GETTER-SETTER-PAIRS" ) );
    $sym10$DEFINE = makeSymbol( "DEFINE" );
    $list11 = ConsesLow.list( makeSymbol( "OBJECT" ) );
    $sym12$RET = makeSymbol( "RET" );
    $sym13$CAND = makeSymbol( "CAND" );
    $list14 = ConsesLow.list( makeSymbol( "VECTORP" ), makeSymbol( "OBJECT" ) );
    $sym15$_ = makeSymbol( "=" );
    $list16 = ConsesLow.list( ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "OBJECT" ) ) );
    $sym17$QUOTE = makeSymbol( "QUOTE" );
    $list18 = ConsesLow.list( ConsesLow.list( makeSymbol( "AREF" ), makeSymbol( "OBJECT" ), ZERO_INTEGER ) );
    $list19 = ConsesLow.list( makeSymbol( "CONSP" ), makeSymbol( "OBJECT" ) );
    $list20 = ConsesLow.list( ConsesLow.list( makeSymbol( "CAR" ), makeSymbol( "OBJECT" ) ) );
    $list21 = ConsesLow.list( makeSymbol( "PROPER-LIST-P" ), makeSymbol( "OBJECT" ) );
    $list22 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "ARGLIST" ) );
    $list23 = ConsesLow.list( makeSymbol( "ARGLIST" ) );
    $list24 = ConsesLow.list( makeSymbol( "GETTER" ), makeSymbol( "SETTER" ) );
    $sym25$CHECK_TYPE = makeSymbol( "CHECK-TYPE" );
    $sym26$OBJECT = makeSymbol( "OBJECT" );
    $sym27$AREF = makeSymbol( "AREF" );
    $sym28$NTH = makeSymbol( "NTH" );
    $list29 = ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "VALUE" ) );
    $sym30$SET_AREF = makeSymbol( "SET-AREF" );
    $list31 = ConsesLow.list( makeSymbol( "VALUE" ) );
    $list32 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "OBJECT" ) ) );
    $sym33$SET_NTH = makeSymbol( "SET-NTH" );
    $sym34$PROGN = makeSymbol( "PROGN" );
    $str35$_P = makeString( "-P" );
    $str36$MAKE_ = makeString( "MAKE-" );
    $str37$_ = makeString( "-" );
    $str38$SET_ = makeString( "SET-" );
    $sym39$DEFSTRUCT_SEQUENCE_INTERNAL = makeSymbol( "DEFSTRUCT-SEQUENCE-INTERNAL" );
    $kw40$TEST = makeKeyword( "TEST" );
    $kw41$OWNER = makeKeyword( "OWNER" );
    $kw42$CLASSES = makeKeyword( "CLASSES" );
    $kw43$KB = makeKeyword( "KB" );
    $kw44$TINY = makeKeyword( "TINY" );
    $kw45$WORKING_ = makeKeyword( "WORKING?" );
    $list46 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword( "VECTOR" ), makeSymbol( "KMG" ), ConsesLow.list( makeSymbol( "ONE" ), makeSymbol( "TWO" ) ) ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow
        .list( makeSymbol( "DEFINE" ), makeSymbol( "KMG-P" ), ConsesLow.list( makeSymbol( "OBJECT" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "VECTORP" ),
            makeSymbol( "OBJECT" ) ), ConsesLow.list( makeSymbol( "=" ), THREE_INTEGER, ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "OBJECT" ) ) ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "QUOTE" ),
                makeSymbol( "KMG" ) ), ConsesLow.list( makeSymbol( "AREF" ), makeSymbol( "OBJECT" ), ZERO_INTEGER ) ) ) ) ), ConsesLow.list( makeSymbol( "DEFINE" ), makeSymbol( "MAKE-KMG" ), ConsesLow.list( makeSymbol(
                    "&OPTIONAL" ), makeSymbol( "ARGLIST" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "DEFSTRUCT-VECTOR-CONSTRUCTOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                        "KMG" ) ), THREE_INTEGER, ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "ONE" ), makeKeyword( "TWO" ) ) ), makeSymbol( "ARGLIST" ) ) ) ), ConsesLow.list( makeSymbol(
                            "DEFINE" ), makeSymbol( "KMG-ONE" ), ConsesLow.list( makeSymbol( "OBJECT" ) ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "OBJECT" ), makeSymbol( "KMG-P" ) ), ConsesLow.list(
                                makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "AREF" ), makeSymbol( "OBJECT" ), ONE_INTEGER ) ) ), ConsesLow.list( makeSymbol( "DEFINE" ), makeSymbol( "KMG-TWO" ), ConsesLow.list(
                                    makeSymbol( "OBJECT" ) ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "OBJECT" ), makeSymbol( "KMG-P" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
                                        "AREF" ), makeSymbol( "OBJECT" ), TWO_INTEGER ) ) ), ConsesLow.list( makeSymbol( "DEFINE" ), makeSymbol( "SET-KMG-ONE" ), ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol(
                                            "VALUE" ) ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "OBJECT" ), makeSymbol( "KMG-P" ) ), ConsesLow.list( makeSymbol( "SET-AREF" ), makeSymbol( "OBJECT" ),
                                                ONE_INTEGER, makeSymbol( "VALUE" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "OBJECT" ) ) ), ConsesLow.list( makeSymbol( "DEFINE" ), makeSymbol( "SET-KMG-TWO" ),
                                                    ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "VALUE" ) ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "OBJECT" ), makeSymbol( "KMG-P" ) ), ConsesLow
                                                        .list( makeSymbol( "SET-AREF" ), makeSymbol( "OBJECT" ), TWO_INTEGER, makeSymbol( "VALUE" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "OBJECT" ) ) ),
        ConsesLow.list( IDENTITY, ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "KMG" ) ) ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "LIST" ), makeSymbol( "KMG" ), ConsesLow.list( makeSymbol( "ONE" ),
            makeSymbol( "TWO" ) ) ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "DEFINE" ), makeSymbol( "KMG-P" ), ConsesLow.list( makeSymbol( "OBJECT" ) ), ConsesLow.list( makeSymbol( "RET" ),
                ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "CONSP" ), makeSymbol( "OBJECT" ) ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "KMG" ) ), ConsesLow.list(
                    makeSymbol( "CAR" ), makeSymbol( "OBJECT" ) ) ), ConsesLow.list( makeSymbol( "PROPER-LIST-P" ), makeSymbol( "OBJECT" ) ), ConsesLow.list( makeSymbol( "=" ), THREE_INTEGER, ConsesLow.list( makeSymbol(
                        "LENGTH" ), makeSymbol( "OBJECT" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "DEFINE" ), makeSymbol( "MAKE-KMG" ), ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "ARGLIST" ) ), ConsesLow
                            .list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "DEFSTRUCT-LIST-CONSTRUCTOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "KMG" ) ), THREE_INTEGER, ConsesLow.list( makeSymbol(
                                "QUOTE" ), ConsesLow.list( makeKeyword( "ONE" ), makeKeyword( "TWO" ) ) ), makeSymbol( "ARGLIST" ) ) ) ), ConsesLow.list( makeSymbol( "DEFINE" ), makeSymbol( "KMG-ONE" ), ConsesLow.list(
                                    makeSymbol( "OBJECT" ) ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "OBJECT" ), makeSymbol( "KMG-P" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
                                        "NTH" ), ONE_INTEGER, makeSymbol( "OBJECT" ) ) ) ), ConsesLow.list( makeSymbol( "DEFINE" ), makeSymbol( "KMG-TWO" ), ConsesLow.list( makeSymbol( "OBJECT" ) ), ConsesLow.list(
                                            makeSymbol( "CHECK-TYPE" ), makeSymbol( "OBJECT" ), makeSymbol( "KMG-P" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NTH" ), TWO_INTEGER, makeSymbol(
                                                "OBJECT" ) ) ) ), ConsesLow.list( makeSymbol( "DEFINE" ), makeSymbol( "SET-KMG-ONE" ), ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "VALUE" ) ), ConsesLow.list(
                                                    makeSymbol( "CHECK-TYPE" ), makeSymbol( "OBJECT" ), makeSymbol( "KMG-P" ) ), ConsesLow.list( makeSymbol( "SET-NTH" ), ONE_INTEGER, makeSymbol( "OBJECT" ), makeSymbol(
                                                        "VALUE" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "OBJECT" ) ) ), ConsesLow.list( makeSymbol( "DEFINE" ), makeSymbol( "SET-KMG-TWO" ), ConsesLow.list(
                                                            makeSymbol( "OBJECT" ), makeSymbol( "VALUE" ) ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "OBJECT" ), makeSymbol( "KMG-P" ) ), ConsesLow.list(
                                                                makeSymbol( "SET-NTH" ), TWO_INTEGER, makeSymbol( "OBJECT" ), makeSymbol( "VALUE" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "OBJECT" ) ) ),
                ConsesLow.list( IDENTITY, ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "KMG" ) ) ) ) ) );
  }
}
/*
 * 
 * Total time: 174 ms
 * 
 */