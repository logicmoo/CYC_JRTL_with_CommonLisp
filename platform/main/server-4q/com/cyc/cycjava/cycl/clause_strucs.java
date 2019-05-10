package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class clause_strucs
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.clause_strucs";
  public static final String myFingerPrint = "04e93cb7c0645d9939147e98cfa78461439b55ba8b3bff0f2062ae5becdbaa49";
  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 1210L)
  public static SubLSymbol $dtp_clause_struc$;
  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 2056L)
  private static SubLSymbol $clause_struc_free_list$;
  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 2056L)
  private static SubLSymbol $clause_struc_free_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 8459L)
  private static SubLSymbol $clause_struc_from_id$;
  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 9840L)
  private static SubLSymbol $new_clause_struc_id_threshold$;
  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 14142L)
  public static SubLSymbol $clause_struc_dump_id_table$;
  private static final SubLSymbol $sym0$CLAUSE_STRUC;
  private static final SubLSymbol $sym1$CLAUSE_STRUC_P;
  private static final SubLInteger $int2$142;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$PRINT_CLAUSE_STRUC;
  private static final SubLSymbol $sym8$CLAUSE_STRUC_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$CLS_ID;
  private static final SubLSymbol $sym11$_CSETF_CLS_ID;
  private static final SubLSymbol $sym12$CLS_CNF;
  private static final SubLSymbol $sym13$_CSETF_CLS_CNF;
  private static final SubLSymbol $sym14$CLS_ASSERTIONS;
  private static final SubLSymbol $sym15$_CSETF_CLS_ASSERTIONS;
  private static final SubLSymbol $kw16$ID;
  private static final SubLSymbol $kw17$CNF;
  private static final SubLSymbol $kw18$ASSERTIONS;
  private static final SubLString $str19$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw20$BEGIN;
  private static final SubLSymbol $sym21$MAKE_CLAUSE_STRUC;
  private static final SubLSymbol $kw22$SLOT;
  private static final SubLSymbol $kw23$END;
  private static final SubLSymbol $sym24$VISIT_DEFSTRUCT_OBJECT_CLAUSE_STRUC_METHOD;
  private static final SubLString $str25$_;
  private static final SubLString $str26$_;
  private static final SubLString $str27$_;
  private static final SubLString $str28$_The_CFASL_invalid_clause_struc_;
  private static final SubLInteger $int29$242;
  private static final SubLSymbol $sym30$SXHASH_CLAUSE_STRUC_METHOD;
  private static final SubLString $str31$CLAUSE_STRUC_resource_lock;
  private static final SubLSymbol $kw32$FREE;
  private static final SubLSymbol $kw33$TRUE;
  private static final SubLList $list34;
  private static final SubLList $list35;
  private static final SubLSymbol $kw36$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw37$DONE;
  private static final SubLSymbol $sym38$DO_LIST;
  private static final SubLSymbol $sym39$CLAUSE_STRUC_ASSERTIONS;
  private static final SubLSymbol $sym40$INVALID_CONSTANT_;
  private static final SubLSymbol $sym41$VALID_ASSERTION;
  private static final SubLSymbol $sym42$INTEGERP;
  private static final SubLSymbol $sym43$CNF_P;
  private static final SubLString $str44$create_sample_invalid_clause_stru;
  private static final SubLSymbol $sym45$ASSERTION_P;
  private static final SubLSymbol $sym46$_CLAUSE_STRUC_FROM_ID_;
  private static final SubLList $list47;
  private static final SubLList $list48;
  private static final SubLSymbol $kw49$PROGRESS_MESSAGE;
  private static final SubLString $str50$mapping_Cyc_clause_structs;
  private static final SubLSymbol $sym51$DO_KB_SUID_TABLE;
  private static final SubLList $list52;
  private static final SubLSymbol $sym53$CLAUSE_STRUC_TABLE;
  private static final SubLSymbol $sym54$DO_CLAUSE_STRUCS;
  private static final SubLSymbol $sym55$_NEW_CLAUSE_STRUC_ID_THRESHOLD_;
  private static final SubLString $str56$Cleaning_clause_struc_table;
  private static final SubLSymbol $sym57$STRINGP;
  private static final SubLSymbol $kw58$SKIP;
  private static final SubLSymbol $kw59$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym60$IGNORE_ERRORS_HANDLER;
  private static final SubLString $str61$invalid_clause_struct__S;
  private static final SubLString $str62$Freeing_clause_strucs;
  private static final SubLString $str63$Determining_maximum_clause_struc_;
  private static final SubLSymbol $sym64$CLET;
  private static final SubLList $list65;
  private static final SubLSymbol $sym66$CREATE_CLAUSE_STRUC_DUMP_ID_TABLE;
  private static final SubLSymbol $sym67$WITH_CLAUSE_STRUC_DUMP_ID_TABLE;

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 1210L)
  public static SubLObject clause_struc_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_clause_struc( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 1210L)
  public static SubLObject clause_struc_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $clause_struc_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 1210L)
  public static SubLObject cls_id(final SubLObject v_object)
  {
    assert NIL != clause_struc_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 1210L)
  public static SubLObject cls_cnf(final SubLObject v_object)
  {
    assert NIL != clause_struc_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 1210L)
  public static SubLObject cls_assertions(final SubLObject v_object)
  {
    assert NIL != clause_struc_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 1210L)
  public static SubLObject _csetf_cls_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != clause_struc_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 1210L)
  public static SubLObject _csetf_cls_cnf(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != clause_struc_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 1210L)
  public static SubLObject _csetf_cls_assertions(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != clause_struc_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 1210L)
  public static SubLObject make_clause_struc(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $clause_struc_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw16$ID ) )
      {
        _csetf_cls_id( v_new, current_value );
      }
      else if( pcase_var.eql( $kw17$CNF ) )
      {
        _csetf_cls_cnf( v_new, current_value );
      }
      else if( pcase_var.eql( $kw18$ASSERTIONS ) )
      {
        _csetf_cls_assertions( v_new, current_value );
      }
      else
      {
        Errors.error( $str19$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 1210L)
  public static SubLObject visit_defstruct_clause_struc(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw20$BEGIN, $sym21$MAKE_CLAUSE_STRUC, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw22$SLOT, $kw16$ID, cls_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw22$SLOT, $kw17$CNF, cls_cnf( obj ) );
    Functions.funcall( visitor_fn, obj, $kw22$SLOT, $kw18$ASSERTIONS, cls_assertions( obj ) );
    Functions.funcall( visitor_fn, obj, $kw23$END, $sym21$MAKE_CLAUSE_STRUC, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 1210L)
  public static SubLObject visit_defstruct_object_clause_struc_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_clause_struc( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 1364L)
  public static SubLObject print_clause_struc(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != valid_clause_struc( v_object, UNPROVIDED ) )
    {
      final SubLObject formula = ( NIL != assertion_handles.$print_assertions_in_cnf$.getDynamicValue( thread ) ) ? clause_struc_cnf( v_object )
          : clause_struc_formula( v_object, control_vars.$assertion_truth$.getDynamicValue( thread ) );
      print_high.princ( $str25$_, stream );
      if( formula.isCons() )
      {
        print_high.prin1( formula, stream );
      }
      else
      {
        print_high.princ( $str26$_, stream );
      }
      print_high.princ( $str27$_, stream );
    }
    else if( v_object.eql( cfasl_kb_methods.cfasl_invalid_clause_struc() ) )
    {
      PrintLow.format( stream, $str28$_The_CFASL_invalid_clause_struc_ );
    }
    else
    {
      compatibility.default_struct_print_function( v_object, stream, depth );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 1923L)
  public static SubLObject sxhash_clause_struc_method(final SubLObject v_object)
  {
    final SubLObject id = cls_id( v_object );
    if( id.isInteger() )
    {
      return id;
    }
    return $int29$242;
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 2056L)
  public static SubLObject make_static_clause_struc()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_object = NIL;
    final SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding( thread );
    try
    {
      Storage.$current_area$.bind( Storage.get_static_area(), thread );
      v_object = make_clause_struc( UNPROVIDED );
    }
    finally
    {
      Storage.$current_area$.rebind( _prev_bind_0, thread );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 2056L)
  public static SubLObject init_clause_struc(final SubLObject clause_struc)
  {
    _csetf_cls_id( clause_struc, NIL );
    _csetf_cls_cnf( clause_struc, NIL );
    _csetf_cls_assertions( clause_struc, NIL );
    return clause_struc;
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 2056L)
  public static SubLObject free_clause_struc_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != clause_struc_p( v_object ) && cls_cnf( v_object ) == $kw32$FREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 2056L)
  public static SubLObject free_clause_struc(SubLObject v_object)
  {
    assert NIL != clause_struc_p( v_object ) : v_object;
    if( NIL == free_clause_struc_p( v_object ) )
    {
      v_object = init_clause_struc( v_object );
      _csetf_cls_cnf( v_object, $kw32$FREE );
      if( NIL != utilities_macros.$structure_resourcing_enabled$.getGlobalValue() )
      {
        SubLObject release = NIL;
        try
        {
          release = Locks.seize_lock( $clause_struc_free_lock$.getGlobalValue() );
          _csetf_cls_id( v_object, $clause_struc_free_list$.getGlobalValue() );
          $clause_struc_free_list$.setGlobalValue( v_object );
        }
        finally
        {
          if( NIL != release )
          {
            Locks.release_lock( $clause_struc_free_lock$.getGlobalValue() );
          }
        }
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 2056L)
  public static SubLObject get_clause_struc()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != utilities_macros.$structure_resourcing_enabled$.getGlobalValue() )
    {
      SubLObject v_object = NIL;
      SubLObject found = NIL;
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( $clause_struc_free_lock$.getGlobalValue() );
        v_object = $clause_struc_free_list$.getGlobalValue();
        while ( NIL == found && NIL != v_object)
        {
          if( NIL != free_clause_struc_p( v_object ) )
          {
            $clause_struc_free_list$.setGlobalValue( cls_id( v_object ) );
            found = T;
          }
          else
          {
            v_object = cls_id( v_object );
          }
        }
        if( NIL == found )
        {
          if( NIL != utilities_macros.$structure_resourcing_make_static$.getDynamicValue( thread ) )
          {
            v_object = make_static_clause_struc();
          }
          else
          {
            v_object = make_clause_struc( UNPROVIDED );
          }
          $clause_struc_free_list$.setGlobalValue( NIL );
        }
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( $clause_struc_free_lock$.getGlobalValue() );
        }
      }
      return init_clause_struc( v_object );
    }
    if( NIL != utilities_macros.$structure_resourcing_make_static$.getDynamicValue( thread ) )
    {
      return init_clause_struc( make_static_clause_struc() );
    }
    return init_clause_struc( make_clause_struc( UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 2323L)
  public static SubLObject clause_struc_id(final SubLObject clause_struc)
  {
    assert NIL != clause_struc_p( clause_struc ) : clause_struc;
    return cls_id( clause_struc );
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 2558L)
  public static SubLObject reset_clause_struc_id(final SubLObject clause_struc, final SubLObject new_id)
  {
    _csetf_cls_id( clause_struc, new_id );
    return clause_struc;
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 2751L)
  public static SubLObject clause_struc_cnf(final SubLObject clause_struc)
  {
    assert NIL != clause_struc_p( clause_struc ) : clause_struc;
    return cls_cnf( clause_struc );
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 2910L)
  public static SubLObject gaf_clause_strucP(final SubLObject clause_struc)
  {
    return makeBoolean( NIL != clause_struc_p( clause_struc ) && NIL != clauses.gaf_cnfP( clause_struc_cnf( clause_struc ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 3106L)
  public static SubLObject clause_struc_formula(final SubLObject clause_struc, SubLObject truth)
  {
    if( truth == UNPROVIDED )
    {
      truth = $kw33$TRUE;
    }
    assert NIL != clause_struc_p( clause_struc ) : clause_struc;
    return clauses.cnf_formula( clause_struc_cnf( clause_struc ), truth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 3344L)
  public static SubLObject do_clause_struc_assertions(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list34 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject assertion_var = NIL;
    SubLObject clause_struc = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list34 );
    assertion_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list34 );
    clause_struc = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list34 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list34 );
      if( NIL == conses_high.member( current_$1, $list35, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw36$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list34 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw37$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym38$DO_LIST, ConsesLow.list( assertion_var, ConsesLow.list( $sym39$CLAUSE_STRUC_ASSERTIONS, clause_struc ), $kw37$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 3623L)
  public static SubLObject clause_struc_assertions(final SubLObject clause_struc)
  {
    assert NIL != clause_struc_p( clause_struc ) : clause_struc;
    return cls_assertions( clause_struc );
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 3828L)
  public static SubLObject reset_clause_struc_assertions(final SubLObject clause_struc, final SubLObject new_assertions)
  {
    _csetf_cls_assertions( clause_struc, new_assertions );
    return clause_struc;
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 4045L)
  public static SubLObject valid_clause_struc(final SubLObject clause_struc, SubLObject robust)
  {
    if( robust == UNPROVIDED )
    {
      robust = NIL;
    }
    if( NIL == clause_struc_p( clause_struc ) || !clause_struc_id( clause_struc ).isInteger() )
    {
      return NIL;
    }
    if( NIL == robust )
    {
      return T;
    }
    final SubLObject cnf = clause_struc_cnf( clause_struc );
    final SubLObject assertions = clause_struc_assertions( clause_struc );
    return makeBoolean( NIL != clauses.cnf_p( cnf ) && NIL == list_utilities.tree_find_if( Symbols.symbol_function( $sym40$INVALID_CONSTANT_ ), cnf, UNPROVIDED ) && assertions.isCons() && NIL != list_utilities
        .every_in_list( Symbols.symbol_function( $sym41$VALID_ASSERTION ), assertions, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 4702L)
  public static SubLObject invalid_clause_struc(final SubLObject clause_struc, SubLObject robust)
  {
    if( robust == UNPROVIDED )
    {
      robust = NIL;
    }
    return makeBoolean( NIL != clause_struc_p( clause_struc ) && NIL == valid_clause_struc( clause_struc, robust ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 4871L)
  public static SubLObject find_clause_struc_by_id(final SubLObject id)
  {
    assert NIL != Types.integerp( id ) : id;
    return lookup_clause_struc( id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 5113L)
  public static SubLObject create_clause_struc(final SubLObject cnf)
  {
    assert NIL != clauses.cnf_p( cnf ) : cnf;
    final SubLObject clause_struc = make_clause_struc_shell( cnf, UNPROVIDED );
    return clause_struc;
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 5508L)
  public static SubLObject make_clause_struc_shell(final SubLObject cnf, SubLObject id)
  {
    if( id == UNPROVIDED )
    {
      id = NIL;
    }
    assert NIL != clauses.cnf_p( cnf ) : cnf;
    if( NIL == id )
    {
      id = make_clause_struc_id();
    }
    assert NIL != Types.integerp( id ) : id;
    final SubLObject clause_struc = get_clause_struc();
    register_clause_struc_id( clause_struc, id );
    _csetf_cls_cnf( clause_struc, cnf );
    return clause_struc;
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 5956L)
  public static SubLObject create_sample_invalid_clause_struc()
  {
    if( NIL != alexandria_allegro_macros.alexandria_allegro_mode_enabledP() )
    {
      Errors.sublisp_break( $str44$create_sample_invalid_clause_stru, EMPTY_SUBL_OBJECT_ARRAY );
    }
    return get_clause_struc();
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 6222L)
  public static SubLObject add_clause_struc_assertion(final SubLObject clause_struc, final SubLObject assertion)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    assert NIL != clause_struc_p( clause_struc ) : clause_struc;
    reset_clause_struc_assertions( clause_struc, ConsesLow.cons( assertion, clause_struc_assertions( clause_struc ) ) );
    return clause_struc;
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 6707L)
  public static SubLObject remove_clause_struc(final SubLObject clause_struc)
  {
    assert NIL != clause_struc_p( clause_struc ) : clause_struc;
    deregister_clause_struc_id( clause_struc_id( clause_struc ) );
    free_clause_struc( clause_struc );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 7164L)
  public static SubLObject remove_clause_struc_assertion(final SubLObject clause_struc, final SubLObject assertion)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    assert NIL != clause_struc_p( clause_struc ) : clause_struc;
    reset_clause_struc_assertions( clause_struc, list_utilities.delete_first( assertion, clause_struc_assertions( clause_struc ), UNPROVIDED ) );
    return simplify_clause_struc_uses( clause_struc );
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 7779L)
  public static SubLObject simplify_clause_struc_uses(final SubLObject clause_struc)
  {
    assert NIL != clause_struc_p( clause_struc ) : clause_struc;
    final SubLObject assertions = clause_struc_assertions( clause_struc );
    if( NIL != list_utilities.singletonP( assertions ) )
    {
      final SubLObject remaining_assertion = assertions.first();
      if( NIL != assertion_handles.valid_assertionP( remaining_assertion, UNPROVIDED ) )
      {
        final SubLObject cnf = clause_struc_cnf( clause_struc );
        assertions_low.update_assertion_formula_data( remaining_assertion, cnf );
      }
      remove_clause_struc( clause_struc );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 8624L)
  public static SubLObject do_clause_strucs(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list47 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list47 );
    var = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list47 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list47 );
      if( NIL == conses_high.member( current_$2, $list48, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw36$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list47 );
    }
    final SubLObject progress_message_tail = cdestructuring_bind.property_list_member( $kw49$PROGRESS_MESSAGE, current );
    final SubLObject progress_message = ( NIL != progress_message_tail ) ? conses_high.cadr( progress_message_tail ) : $str50$mapping_Cyc_clause_structs;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw37$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym51$DO_KB_SUID_TABLE, ConsesLow.list( var, $list52, $kw49$PROGRESS_MESSAGE, progress_message, $kw37$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 9033L)
  public static SubLObject clause_struc_table()
  {
    return $clause_struc_from_id$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 9137L)
  public static SubLObject clause_struc_count()
  {
    if( NIL == $clause_struc_from_id$.getGlobalValue() )
    {
      return ZERO_INTEGER;
    }
    return id_index.id_index_count( $clause_struc_from_id$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 9438L)
  public static SubLObject random_clause_struc()
  {
    if( clause_struc_count().numG( ZERO_INTEGER ) )
    {
      SubLObject max_id;
      SubLObject v_answer;
      for( max_id = next_clause_struc_id(), v_answer = NIL; NIL == v_answer; v_answer = find_clause_struc_by_id( random.random( max_id ) ) )
      {
      }
      return v_answer;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 9988L)
  public static SubLObject new_clause_struc_id_threshold()
  {
    return $new_clause_struc_id_threshold$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 10268L)
  public static SubLObject set_new_clause_struc_id_threshold(final SubLObject id)
  {
    $new_clause_struc_id_threshold$.setGlobalValue( id );
    return id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 10381L)
  public static SubLObject old_clause_struc_count()
  {
    return Values.nth_value_step_2( Values.nth_value_step_1( ZERO_INTEGER ), id_index.id_index_old_and_new_object_counts( clause_struc_table(), new_clause_struc_id_threshold() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 10536L)
  public static SubLObject new_clause_struc_count()
  {
    return Values.nth_value_step_2( Values.nth_value_step_1( ONE_INTEGER ), id_index.id_index_old_and_new_object_counts( clause_struc_table(), new_clause_struc_id_threshold() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 10691L)
  public static SubLObject setup_clause_struc_table(final SubLObject size, final SubLObject exactP)
  {
    if( NIL != $clause_struc_from_id$.getGlobalValue() )
    {
      return NIL;
    }
    $clause_struc_from_id$.setGlobalValue( id_index.new_id_index( size, ZERO_INTEGER ) );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 11028L)
  public static SubLObject finalize_clause_strucs(SubLObject max_clause_struc_id)
  {
    if( max_clause_struc_id == UNPROVIDED )
    {
      max_clause_struc_id = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    set_next_clause_struc_id( max_clause_struc_id );
    set_new_clause_struc_id_threshold( next_clause_struc_id() );
    if( NIL == max_clause_struc_id )
    {
      final SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding( thread );
      try
      {
        Storage.$current_area$.bind( Storage.get_static_area(), thread );
        id_index.optimize_id_index( $clause_struc_from_id$.getGlobalValue(), UNPROVIDED );
      }
      finally
      {
        Storage.$current_area$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 11563L)
  public static SubLObject clean_clause_struc_table(SubLObject verboseP)
  {
    if( verboseP == UNPROVIDED )
    {
      verboseP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject idx = clause_struc_table();
    final SubLObject mess = $str56$Cleaning_clause_struc_table;
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
        final SubLObject idx_$3 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$3, $kw58$SKIP ) )
        {
          final SubLObject idx_$4 = idx_$3;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$4, $kw58$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$4 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject id;
            SubLObject clause_struc;
            SubLObject id_$5;
            SubLObject ignore_errors_tag;
            SubLObject _prev_bind_0_$6;
            SubLObject cdolist_list_var;
            SubLObject assertion;
            SubLObject _prev_bind_0_$7;
            SubLObject _values;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              clause_struc = Vectors.aref( vector_var, id );
              if( NIL == id_index.id_index_tombstone_p( clause_struc ) || NIL == id_index.id_index_skip_tombstones_p( $kw58$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( clause_struc ) )
                {
                  clause_struc = $kw58$SKIP;
                }
                if( NIL == valid_clause_struc( clause_struc, T ) )
                {
                  id_$5 = clause_struc_id( clause_struc );
                  ignore_errors_tag = NIL;
                  try
                  {
                    thread.throwStack.push( $kw59$IGNORE_ERRORS_TARGET );
                    _prev_bind_0_$6 = Errors.$error_handler$.currentBinding( thread );
                    try
                    {
                      Errors.$error_handler$.bind( Symbols.symbol_function( $sym60$IGNORE_ERRORS_HANDLER ), thread );
                      try
                      {
                        try
                        {
                          if( NIL != verboseP )
                          {
                            Errors.warn( $str61$invalid_clause_struct__S, id_$5 );
                          }
                          cdolist_list_var = clause_struc_assertions( clause_struc );
                          assertion = NIL;
                          assertion = cdolist_list_var.first();
                          while ( NIL != cdolist_list_var)
                          {
                            tms.tms_remove_assertion( assertion );
                            cdolist_list_var = cdolist_list_var.rest();
                            assertion = cdolist_list_var.first();
                          }
                        }
                        finally
                        {
                          _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                          try
                          {
                            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                            _values = Values.getValuesAsVector();
                            if( id_$5.isInteger() )
                            {
                              deregister_clause_struc_id( id_$5 );
                              reset_clause_struc_id( clause_struc, NIL );
                            }
                            Values.restoreValuesFromVector( _values );
                          }
                          finally
                          {
                            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$7, thread );
                          }
                        }
                      }
                      catch( final Throwable catch_var )
                      {
                        Errors.handleThrowable( catch_var, NIL );
                      }
                    }
                    finally
                    {
                      Errors.$error_handler$.rebind( _prev_bind_0_$6, thread );
                    }
                  }
                  catch( final Throwable ccatch_env_var )
                  {
                    ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw59$IGNORE_ERRORS_TARGET );
                  }
                  finally
                  {
                    thread.throwStack.pop();
                  }
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$5 = idx_$3;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$5 ) || NIL == id_index.id_index_skip_tombstones_p( $kw58$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$5 );
            SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$5 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$5 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw58$SKIP ) ) ? NIL : $kw58$SKIP;
            while ( id2.numL( end_id ))
            {
              final SubLObject clause_struc2 = Hashtables.gethash_without_values( id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw58$SKIP ) || NIL == id_index.id_index_tombstone_p( clause_struc2 ) )
              {
                if( NIL == valid_clause_struc( clause_struc2, T ) )
                {
                  final SubLObject id_$6 = clause_struc_id( clause_struc2 );
                  SubLObject ignore_errors_tag2 = NIL;
                  try
                  {
                    thread.throwStack.push( $kw59$IGNORE_ERRORS_TARGET );
                    final SubLObject _prev_bind_0_$8 = Errors.$error_handler$.currentBinding( thread );
                    try
                    {
                      Errors.$error_handler$.bind( Symbols.symbol_function( $sym60$IGNORE_ERRORS_HANDLER ), thread );
                      try
                      {
                        try
                        {
                          if( NIL != verboseP )
                          {
                            Errors.warn( $str61$invalid_clause_struct__S, id_$6 );
                          }
                          SubLObject cdolist_list_var2 = clause_struc_assertions( clause_struc2 );
                          SubLObject assertion2 = NIL;
                          assertion2 = cdolist_list_var2.first();
                          while ( NIL != cdolist_list_var2)
                          {
                            tms.tms_remove_assertion( assertion2 );
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            assertion2 = cdolist_list_var2.first();
                          }
                        }
                        finally
                        {
                          final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                          try
                          {
                            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                            final SubLObject _values2 = Values.getValuesAsVector();
                            if( id_$6.isInteger() )
                            {
                              deregister_clause_struc_id( id_$6 );
                              reset_clause_struc_id( clause_struc2, NIL );
                            }
                            Values.restoreValuesFromVector( _values2 );
                          }
                          finally
                          {
                            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$9, thread );
                          }
                        }
                      }
                      catch( final Throwable catch_var2 )
                      {
                        Errors.handleThrowable( catch_var2, NIL );
                      }
                    }
                    finally
                    {
                      Errors.$error_handler$.rebind( _prev_bind_0_$8, thread );
                    }
                  }
                  catch( final Throwable ccatch_env_var2 )
                  {
                    ignore_errors_tag2 = Errors.handleThrowable( ccatch_env_var2, $kw59$IGNORE_ERRORS_TARGET );
                  }
                  finally
                  {
                    thread.throwStack.pop();
                  }
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
              id2 = Numbers.add( id2, ONE_INTEGER );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values3 = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values3 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$10, thread );
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
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 12347L)
  public static SubLObject free_all_clause_strucs()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject idx = clause_struc_table();
    final SubLObject mess = $str62$Freeing_clause_strucs;
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
        if( NIL == id_index.id_index_objects_empty_p( idx_$13, $kw58$SKIP ) )
        {
          final SubLObject idx_$14 = idx_$13;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$14, $kw58$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$14 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject id;
            SubLObject clause_struc;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              clause_struc = Vectors.aref( vector_var, id );
              if( NIL == id_index.id_index_tombstone_p( clause_struc ) || NIL == id_index.id_index_skip_tombstones_p( $kw58$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( clause_struc ) )
                {
                  clause_struc = $kw58$SKIP;
                }
                free_clause_struc( clause_struc );
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$15 = idx_$13;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$15 ) || NIL == id_index.id_index_skip_tombstones_p( $kw58$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$15 );
            SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$15 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$15 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw58$SKIP ) ) ? NIL : $kw58$SKIP;
            while ( id2.numL( end_id ))
            {
              final SubLObject clause_struc2 = Hashtables.gethash_without_values( id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw58$SKIP ) || NIL == id_index.id_index_tombstone_p( clause_struc2 ) )
              {
                free_clause_struc( clause_struc2 );
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
              id2 = Numbers.add( id2, ONE_INTEGER );
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
    clear_clause_struc_table();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 12674L)
  public static SubLObject clear_clause_struc_table()
  {
    return id_index.clear_id_index( $clause_struc_from_id$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 12768L)
  public static SubLObject next_clause_struc_id()
  {
    return id_index.id_index_next_id( $clause_struc_from_id$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 12959L)
  public static SubLObject set_next_clause_struc_id(SubLObject max_clause_struc_id)
  {
    if( max_clause_struc_id == UNPROVIDED )
    {
      max_clause_struc_id = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject max = MINUS_ONE_INTEGER;
    if( NIL != max_clause_struc_id )
    {
      max = max_clause_struc_id;
    }
    else
    {
      final SubLObject idx = clause_struc_table();
      final SubLObject mess = $str63$Determining_maximum_clause_struc_;
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
          if( NIL == id_index.id_index_objects_empty_p( idx_$17, $kw58$SKIP ) )
          {
            final SubLObject idx_$18 = idx_$17;
            if( NIL == id_index.id_index_dense_objects_empty_p( idx_$18, $kw58$SKIP ) )
            {
              final SubLObject vector_var = id_index.id_index_dense_objects( idx_$18 );
              final SubLObject backwardP_var = NIL;
              SubLObject length;
              SubLObject v_iteration;
              SubLObject id;
              SubLObject clause_struc;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                clause_struc = Vectors.aref( vector_var, id );
                if( NIL == id_index.id_index_tombstone_p( clause_struc ) || NIL == id_index.id_index_skip_tombstones_p( $kw58$SKIP ) )
                {
                  if( NIL != id_index.id_index_tombstone_p( clause_struc ) )
                  {
                    clause_struc = $kw58$SKIP;
                  }
                  max = Numbers.max( max, clause_struc_id( clause_struc ) );
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                }
              }
            }
            final SubLObject idx_$19 = idx_$17;
            if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$19 ) || NIL == id_index.id_index_skip_tombstones_p( $kw58$SKIP ) )
            {
              final SubLObject sparse = id_index.id_index_sparse_objects( idx_$19 );
              SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$19 );
              final SubLObject end_id = id_index.id_index_next_id( idx_$19 );
              final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw58$SKIP ) ) ? NIL : $kw58$SKIP;
              while ( id2.numL( end_id ))
              {
                final SubLObject clause_struc2 = Hashtables.gethash_without_values( id2, sparse, v_default );
                if( NIL == id_index.id_index_skip_tombstones_p( $kw58$SKIP ) || NIL == id_index.id_index_tombstone_p( clause_struc2 ) )
                {
                  max = Numbers.max( max, clause_struc_id( clause_struc2 ) );
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                }
                id2 = Numbers.add( id2, ONE_INTEGER );
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
    }
    final SubLObject next_id = Numbers.add( max, ONE_INTEGER );
    id_index.set_id_index_next_id( $clause_struc_from_id$.getGlobalValue(), next_id );
    return next_id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 13380L)
  public static SubLObject register_clause_struc_id(final SubLObject clause_struc, final SubLObject id)
  {
    reset_clause_struc_id( clause_struc, id );
    id_index.id_index_enter( $clause_struc_from_id$.getGlobalValue(), id, clause_struc );
    return clause_struc;
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 13620L)
  public static SubLObject deregister_clause_struc_id(final SubLObject id)
  {
    return id_index.id_index_remove( $clause_struc_from_id$.getGlobalValue(), id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 13907L)
  public static SubLObject lookup_clause_struc(final SubLObject id)
  {
    return id_index.id_index_lookup( $clause_struc_from_id$.getGlobalValue(), id, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 14002L)
  public static SubLObject make_clause_struc_id()
  {
    return id_index.id_index_reserve( $clause_struc_from_id$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 14253L)
  public static SubLObject clause_struc_dump_id(final SubLObject clause_struc)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject id = clause_struc_id( clause_struc );
    final SubLObject dump_table = $clause_struc_dump_id_table$.getDynamicValue( thread );
    if( NIL != dump_table )
    {
      id = id_index.id_index_lookup( dump_table, id, UNPROVIDED );
    }
    return id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 14664L)
  public static SubLObject find_clause_struc_by_dump_id(final SubLObject dump_id)
  {
    return find_clause_struc_by_id( dump_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 14952L)
  public static SubLObject with_clause_struc_dump_id_table(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym64$CLET, $list65, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 15179L)
  public static SubLObject create_clause_struc_dump_id_table()
  {
    return id_index.new_indirect_compact_id_index( $clause_struc_from_id$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 15345L)
  public static SubLObject number_of_assertions_in_more_than_one_mt()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = clause_struc_table();
    final SubLObject mess = $str50$mapping_Cyc_clause_structs;
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
        if( NIL == id_index.id_index_objects_empty_p( idx_$21, $kw58$SKIP ) )
        {
          final SubLObject idx_$22 = idx_$21;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$22, $kw58$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$22 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject id;
            SubLObject clause_struc;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              clause_struc = Vectors.aref( vector_var, id );
              if( NIL == id_index.id_index_tombstone_p( clause_struc ) || NIL == id_index.id_index_skip_tombstones_p( $kw58$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( clause_struc ) )
                {
                  clause_struc = $kw58$SKIP;
                }
                count = Numbers.add( count, Sequences.length( clause_struc_assertions( clause_struc ) ) );
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$23 = idx_$21;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$23 ) || NIL == id_index.id_index_skip_tombstones_p( $kw58$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$23 );
            SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$23 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$23 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw58$SKIP ) ) ? NIL : $kw58$SKIP;
            while ( id2.numL( end_id ))
            {
              final SubLObject clause_struc2 = Hashtables.gethash_without_values( id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw58$SKIP ) || NIL == id_index.id_index_tombstone_p( clause_struc2 ) )
              {
                count = Numbers.add( count, Sequences.length( clause_struc_assertions( clause_struc2 ) ) );
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
              id2 = Numbers.add( id2, ONE_INTEGER );
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
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/clause-strucs.lisp", position = 15868L)
  public static SubLObject mts_with_clause_strucs()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_dictionary = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    final SubLObject idx = clause_struc_table();
    final SubLObject mess = $str50$mapping_Cyc_clause_structs;
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
        if( NIL == id_index.id_index_objects_empty_p( idx_$25, $kw58$SKIP ) )
        {
          final SubLObject idx_$26 = idx_$25;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$26, $kw58$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$26 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject id;
            SubLObject clause_struc;
            SubLObject cdolist_list_var;
            SubLObject assertion;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              clause_struc = Vectors.aref( vector_var, id );
              if( NIL == id_index.id_index_tombstone_p( clause_struc ) || NIL == id_index.id_index_skip_tombstones_p( $kw58$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( clause_struc ) )
                {
                  clause_struc = $kw58$SKIP;
                }
                cdolist_list_var = clause_struc_assertions( clause_struc );
                assertion = NIL;
                assertion = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  dictionary_utilities.dictionary_increment( v_dictionary, assertions_high.assertion_mt( assertion ), UNPROVIDED );
                  cdolist_list_var = cdolist_list_var.rest();
                  assertion = cdolist_list_var.first();
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$27 = idx_$25;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$27 ) || NIL == id_index.id_index_skip_tombstones_p( $kw58$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$27 );
            SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$27 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$27 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw58$SKIP ) ) ? NIL : $kw58$SKIP;
            while ( id2.numL( end_id ))
            {
              final SubLObject clause_struc2 = Hashtables.gethash_without_values( id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw58$SKIP ) || NIL == id_index.id_index_tombstone_p( clause_struc2 ) )
              {
                SubLObject cdolist_list_var2 = clause_struc_assertions( clause_struc2 );
                SubLObject assertion2 = NIL;
                assertion2 = cdolist_list_var2.first();
                while ( NIL != cdolist_list_var2)
                {
                  dictionary_utilities.dictionary_increment( v_dictionary, assertions_high.assertion_mt( assertion2 ), UNPROVIDED );
                  cdolist_list_var2 = cdolist_list_var2.rest();
                  assertion2 = cdolist_list_var2.first();
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
              id2 = Numbers.add( id2, ONE_INTEGER );
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
    return v_dictionary;
  }

  public static SubLObject declare_clause_strucs_file()
  {
    SubLFiles.declareFunction( me, "clause_struc_print_function_trampoline", "CLAUSE-STRUC-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "clause_struc_p", "CLAUSE-STRUC-P", 1, 0, false );
    new $clause_struc_p$UnaryFunction();
    SubLFiles.declareFunction( me, "cls_id", "CLS-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "cls_cnf", "CLS-CNF", 1, 0, false );
    SubLFiles.declareFunction( me, "cls_assertions", "CLS-ASSERTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cls_id", "_CSETF-CLS-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cls_cnf", "_CSETF-CLS-CNF", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cls_assertions", "_CSETF-CLS-ASSERTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "make_clause_struc", "MAKE-CLAUSE-STRUC", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_clause_struc", "VISIT-DEFSTRUCT-CLAUSE-STRUC", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_clause_struc_method", "VISIT-DEFSTRUCT-OBJECT-CLAUSE-STRUC-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_clause_struc", "PRINT-CLAUSE-STRUC", 3, 0, false );
    SubLFiles.declareFunction( me, "sxhash_clause_struc_method", "SXHASH-CLAUSE-STRUC-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "make_static_clause_struc", "MAKE-STATIC-CLAUSE-STRUC", 0, 0, false );
    SubLFiles.declareFunction( me, "init_clause_struc", "INIT-CLAUSE-STRUC", 1, 0, false );
    SubLFiles.declareFunction( me, "free_clause_struc_p", "FREE-CLAUSE-STRUC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "free_clause_struc", "FREE-CLAUSE-STRUC", 1, 0, false );
    SubLFiles.declareFunction( me, "get_clause_struc", "GET-CLAUSE-STRUC", 0, 0, false );
    SubLFiles.declareFunction( me, "clause_struc_id", "CLAUSE-STRUC-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "reset_clause_struc_id", "RESET-CLAUSE-STRUC-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "clause_struc_cnf", "CLAUSE-STRUC-CNF", 1, 0, false );
    SubLFiles.declareFunction( me, "gaf_clause_strucP", "GAF-CLAUSE-STRUC?", 1, 0, false );
    SubLFiles.declareFunction( me, "clause_struc_formula", "CLAUSE-STRUC-FORMULA", 1, 1, false );
    SubLFiles.declareMacro( me, "do_clause_struc_assertions", "DO-CLAUSE-STRUC-ASSERTIONS" );
    SubLFiles.declareFunction( me, "clause_struc_assertions", "CLAUSE-STRUC-ASSERTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "reset_clause_struc_assertions", "RESET-CLAUSE-STRUC-ASSERTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "valid_clause_struc", "VALID-CLAUSE-STRUC", 1, 1, false );
    SubLFiles.declareFunction( me, "invalid_clause_struc", "INVALID-CLAUSE-STRUC", 1, 1, false );
    SubLFiles.declareFunction( me, "find_clause_struc_by_id", "FIND-CLAUSE-STRUC-BY-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "create_clause_struc", "CREATE-CLAUSE-STRUC", 1, 0, false );
    SubLFiles.declareFunction( me, "make_clause_struc_shell", "MAKE-CLAUSE-STRUC-SHELL", 1, 1, false );
    SubLFiles.declareFunction( me, "create_sample_invalid_clause_struc", "CREATE-SAMPLE-INVALID-CLAUSE-STRUC", 0, 0, false );
    SubLFiles.declareFunction( me, "add_clause_struc_assertion", "ADD-CLAUSE-STRUC-ASSERTION", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_clause_struc", "REMOVE-CLAUSE-STRUC", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_clause_struc_assertion", "REMOVE-CLAUSE-STRUC-ASSERTION", 2, 0, false );
    SubLFiles.declareFunction( me, "simplify_clause_struc_uses", "SIMPLIFY-CLAUSE-STRUC-USES", 1, 0, false );
    SubLFiles.declareMacro( me, "do_clause_strucs", "DO-CLAUSE-STRUCS" );
    SubLFiles.declareFunction( me, "clause_struc_table", "CLAUSE-STRUC-TABLE", 0, 0, false );
    SubLFiles.declareFunction( me, "clause_struc_count", "CLAUSE-STRUC-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "random_clause_struc", "RANDOM-CLAUSE-STRUC", 0, 0, false );
    SubLFiles.declareFunction( me, "new_clause_struc_id_threshold", "NEW-CLAUSE-STRUC-ID-THRESHOLD", 0, 0, false );
    SubLFiles.declareFunction( me, "set_new_clause_struc_id_threshold", "SET-NEW-CLAUSE-STRUC-ID-THRESHOLD", 1, 0, false );
    SubLFiles.declareFunction( me, "old_clause_struc_count", "OLD-CLAUSE-STRUC-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "new_clause_struc_count", "NEW-CLAUSE-STRUC-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "setup_clause_struc_table", "SETUP-CLAUSE-STRUC-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "finalize_clause_strucs", "FINALIZE-CLAUSE-STRUCS", 0, 1, false );
    SubLFiles.declareFunction( me, "clean_clause_struc_table", "CLEAN-CLAUSE-STRUC-TABLE", 0, 1, false );
    SubLFiles.declareFunction( me, "free_all_clause_strucs", "FREE-ALL-CLAUSE-STRUCS", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_clause_struc_table", "CLEAR-CLAUSE-STRUC-TABLE", 0, 0, false );
    SubLFiles.declareFunction( me, "next_clause_struc_id", "NEXT-CLAUSE-STRUC-ID", 0, 0, false );
    SubLFiles.declareFunction( me, "set_next_clause_struc_id", "SET-NEXT-CLAUSE-STRUC-ID", 0, 1, false );
    SubLFiles.declareFunction( me, "register_clause_struc_id", "REGISTER-CLAUSE-STRUC-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "deregister_clause_struc_id", "DEREGISTER-CLAUSE-STRUC-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "lookup_clause_struc", "LOOKUP-CLAUSE-STRUC", 1, 0, false );
    SubLFiles.declareFunction( me, "make_clause_struc_id", "MAKE-CLAUSE-STRUC-ID", 0, 0, false );
    SubLFiles.declareFunction( me, "clause_struc_dump_id", "CLAUSE-STRUC-DUMP-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "find_clause_struc_by_dump_id", "FIND-CLAUSE-STRUC-BY-DUMP-ID", 1, 0, false );
    SubLFiles.declareMacro( me, "with_clause_struc_dump_id_table", "WITH-CLAUSE-STRUC-DUMP-ID-TABLE" );
    SubLFiles.declareFunction( me, "create_clause_struc_dump_id_table", "CREATE-CLAUSE-STRUC-DUMP-ID-TABLE", 0, 0, false );
    SubLFiles.declareFunction( me, "number_of_assertions_in_more_than_one_mt", "NUMBER-OF-ASSERTIONS-IN-MORE-THAN-ONE-MT", 0, 0, false );
    SubLFiles.declareFunction( me, "mts_with_clause_strucs", "MTS-WITH-CLAUSE-STRUCS", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_clause_strucs_file()
  {
    $dtp_clause_struc$ = SubLFiles.defconstant( "*DTP-CLAUSE-STRUC*", $sym0$CLAUSE_STRUC );
    $clause_struc_free_list$ = SubLFiles.deflexical( "*CLAUSE-STRUC-FREE-LIST*", NIL );
    $clause_struc_free_lock$ = SubLFiles.deflexical( "*CLAUSE-STRUC-FREE-LOCK*", Locks.make_lock( $str31$CLAUSE_STRUC_resource_lock ) );
    $clause_struc_from_id$ = SubLFiles.deflexical( "*CLAUSE-STRUC-FROM-ID*", ( maybeDefault( $sym46$_CLAUSE_STRUC_FROM_ID_, $clause_struc_from_id$, NIL ) ) );
    $new_clause_struc_id_threshold$ = SubLFiles.deflexical( "*NEW-CLAUSE-STRUC-ID-THRESHOLD*", ( maybeDefault( $sym55$_NEW_CLAUSE_STRUC_ID_THRESHOLD_, $new_clause_struc_id_threshold$, NIL ) ) );
    $clause_struc_dump_id_table$ = SubLFiles.defparameter( "*CLAUSE-STRUC-DUMP-ID-TABLE*", NIL );
    return NIL;
  }

  public static SubLObject setup_clause_strucs_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_clause_struc$.getGlobalValue(), Symbols.symbol_function( $sym8$CLAUSE_STRUC_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list9 );
    Structures.def_csetf( $sym10$CLS_ID, $sym11$_CSETF_CLS_ID );
    Structures.def_csetf( $sym12$CLS_CNF, $sym13$_CSETF_CLS_CNF );
    Structures.def_csetf( $sym14$CLS_ASSERTIONS, $sym15$_CSETF_CLS_ASSERTIONS );
    Equality.identity( $sym0$CLAUSE_STRUC );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_clause_struc$.getGlobalValue(), Symbols.symbol_function( $sym24$VISIT_DEFSTRUCT_OBJECT_CLAUSE_STRUC_METHOD ) );
    Structures.register_method( Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_clause_struc$.getGlobalValue(), Symbols.symbol_function( $sym30$SXHASH_CLAUSE_STRUC_METHOD ) );
    subl_macro_promotions.declare_defglobal( $sym46$_CLAUSE_STRUC_FROM_ID_ );
    access_macros.register_macro_helper( $sym53$CLAUSE_STRUC_TABLE, $sym54$DO_CLAUSE_STRUCS );
    subl_macro_promotions.declare_defglobal( $sym55$_NEW_CLAUSE_STRUC_ID_THRESHOLD_ );
    access_macros.register_macro_helper( $sym66$CREATE_CLAUSE_STRUC_DUMP_ID_TABLE, $sym67$WITH_CLAUSE_STRUC_DUMP_ID_TABLE );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_clause_strucs_file();
  }

  @Override
  public void initializeVariables()
  {
    init_clause_strucs_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_clause_strucs_file();
  }
  static
  {
    me = new clause_strucs();
    $dtp_clause_struc$ = null;
    $clause_struc_free_list$ = null;
    $clause_struc_free_lock$ = null;
    $clause_struc_from_id$ = null;
    $new_clause_struc_id_threshold$ = null;
    $clause_struc_dump_id_table$ = null;
    $sym0$CLAUSE_STRUC = makeSymbol( "CLAUSE-STRUC" );
    $sym1$CLAUSE_STRUC_P = makeSymbol( "CLAUSE-STRUC-P" );
    $int2$142 = makeInteger( 142 );
    $list3 = ConsesLow.list( makeSymbol( "ID" ), makeSymbol( "CNF" ), makeSymbol( "ASSERTIONS" ) );
    $list4 = ConsesLow.list( makeKeyword( "ID" ), makeKeyword( "CNF" ), makeKeyword( "ASSERTIONS" ) );
    $list5 = ConsesLow.list( makeSymbol( "CLS-ID" ), makeSymbol( "CLS-CNF" ), makeSymbol( "CLS-ASSERTIONS" ) );
    $list6 = ConsesLow.list( makeSymbol( "_CSETF-CLS-ID" ), makeSymbol( "_CSETF-CLS-CNF" ), makeSymbol( "_CSETF-CLS-ASSERTIONS" ) );
    $sym7$PRINT_CLAUSE_STRUC = makeSymbol( "PRINT-CLAUSE-STRUC" );
    $sym8$CLAUSE_STRUC_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "CLAUSE-STRUC-PRINT-FUNCTION-TRAMPOLINE" );
    $list9 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "CLAUSE-STRUC-P" ) );
    $sym10$CLS_ID = makeSymbol( "CLS-ID" );
    $sym11$_CSETF_CLS_ID = makeSymbol( "_CSETF-CLS-ID" );
    $sym12$CLS_CNF = makeSymbol( "CLS-CNF" );
    $sym13$_CSETF_CLS_CNF = makeSymbol( "_CSETF-CLS-CNF" );
    $sym14$CLS_ASSERTIONS = makeSymbol( "CLS-ASSERTIONS" );
    $sym15$_CSETF_CLS_ASSERTIONS = makeSymbol( "_CSETF-CLS-ASSERTIONS" );
    $kw16$ID = makeKeyword( "ID" );
    $kw17$CNF = makeKeyword( "CNF" );
    $kw18$ASSERTIONS = makeKeyword( "ASSERTIONS" );
    $str19$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw20$BEGIN = makeKeyword( "BEGIN" );
    $sym21$MAKE_CLAUSE_STRUC = makeSymbol( "MAKE-CLAUSE-STRUC" );
    $kw22$SLOT = makeKeyword( "SLOT" );
    $kw23$END = makeKeyword( "END" );
    $sym24$VISIT_DEFSTRUCT_OBJECT_CLAUSE_STRUC_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-CLAUSE-STRUC-METHOD" );
    $str25$_ = makeString( "<" );
    $str26$_ = makeString( "?" );
    $str27$_ = makeString( ">" );
    $str28$_The_CFASL_invalid_clause_struc_ = makeString( "<The CFASL invalid clause struc>" );
    $int29$242 = makeInteger( 242 );
    $sym30$SXHASH_CLAUSE_STRUC_METHOD = makeSymbol( "SXHASH-CLAUSE-STRUC-METHOD" );
    $str31$CLAUSE_STRUC_resource_lock = makeString( "CLAUSE-STRUC resource lock" );
    $kw32$FREE = makeKeyword( "FREE" );
    $kw33$TRUE = makeKeyword( "TRUE" );
    $list34 = ConsesLow.list( ConsesLow.list( makeSymbol( "ASSERTION-VAR" ), makeSymbol( "CLAUSE-STRUC" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list35 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw36$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw37$DONE = makeKeyword( "DONE" );
    $sym38$DO_LIST = makeSymbol( "DO-LIST" );
    $sym39$CLAUSE_STRUC_ASSERTIONS = makeSymbol( "CLAUSE-STRUC-ASSERTIONS" );
    $sym40$INVALID_CONSTANT_ = makeSymbol( "INVALID-CONSTANT?" );
    $sym41$VALID_ASSERTION = makeSymbol( "VALID-ASSERTION" );
    $sym42$INTEGERP = makeSymbol( "INTEGERP" );
    $sym43$CNF_P = makeSymbol( "CNF-P" );
    $str44$create_sample_invalid_clause_stru = makeString( "create-sample-invalid-clause-struc not implemented" );
    $sym45$ASSERTION_P = makeSymbol( "ASSERTION-P" );
    $sym46$_CLAUSE_STRUC_FROM_ID_ = makeSymbol( "*CLAUSE-STRUC-FROM-ID*" );
    $list47 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "PROGRESS-MESSAGE" ), makeString( "mapping Cyc clause structs" ) ), makeSymbol( "DONE" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $list48 = ConsesLow.list( makeKeyword( "PROGRESS-MESSAGE" ), makeKeyword( "DONE" ) );
    $kw49$PROGRESS_MESSAGE = makeKeyword( "PROGRESS-MESSAGE" );
    $str50$mapping_Cyc_clause_structs = makeString( "mapping Cyc clause structs" );
    $sym51$DO_KB_SUID_TABLE = makeSymbol( "DO-KB-SUID-TABLE" );
    $list52 = ConsesLow.list( makeSymbol( "CLAUSE-STRUC-TABLE" ) );
    $sym53$CLAUSE_STRUC_TABLE = makeSymbol( "CLAUSE-STRUC-TABLE" );
    $sym54$DO_CLAUSE_STRUCS = makeSymbol( "DO-CLAUSE-STRUCS" );
    $sym55$_NEW_CLAUSE_STRUC_ID_THRESHOLD_ = makeSymbol( "*NEW-CLAUSE-STRUC-ID-THRESHOLD*" );
    $str56$Cleaning_clause_struc_table = makeString( "Cleaning clause-struc table" );
    $sym57$STRINGP = makeSymbol( "STRINGP" );
    $kw58$SKIP = makeKeyword( "SKIP" );
    $kw59$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym60$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $str61$invalid_clause_struct__S = makeString( "invalid clause-struct ~S" );
    $str62$Freeing_clause_strucs = makeString( "Freeing clause-strucs" );
    $str63$Determining_maximum_clause_struc_ = makeString( "Determining maximum clause-struc ID" );
    $sym64$CLET = makeSymbol( "CLET" );
    $list65 = ConsesLow.list( ConsesLow.list( makeSymbol( "*CLAUSE-STRUC-DUMP-ID-TABLE*" ), ConsesLow.list( makeSymbol( "CREATE-CLAUSE-STRUC-DUMP-ID-TABLE" ) ) ), ConsesLow.list( makeSymbol(
        "*CFASL-CLAUSE-STRUC-HANDLE-FUNC*" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CLAUSE-STRUC-DUMP-ID" ) ) ) );
    $sym66$CREATE_CLAUSE_STRUC_DUMP_ID_TABLE = makeSymbol( "CREATE-CLAUSE-STRUC-DUMP-ID-TABLE" );
    $sym67$WITH_CLAUSE_STRUC_DUMP_ID_TABLE = makeSymbol( "WITH-CLAUSE-STRUC-DUMP-ID-TABLE" );
  }

  public static final class $clause_struc_native
      extends
        SubLStructNative
  {
    public SubLObject $id;
    public SubLObject $cnf;
    public SubLObject $assertions;
    private static final SubLStructDeclNative structDecl;

    public $clause_struc_native()
    {
      this.$id = CommonSymbols.NIL;
      this.$cnf = CommonSymbols.NIL;
      this.$assertions = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $clause_struc_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$id;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$cnf;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$assertions;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$id = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$cnf = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$assertions = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $clause_struc_native.class, $sym0$CLAUSE_STRUC, $sym1$CLAUSE_STRUC_P, $list3, $list4, new String[] { "$id", "$cnf", "$assertions"
      }, $list5, $list6, $sym7$PRINT_CLAUSE_STRUC );
    }
  }

  public static final class $clause_struc_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $clause_struc_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CLAUSE-STRUC-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return clause_struc_p( arg1 );
    }
  }
}
/*
 *
 * Total time: 591 ms
 *
 */