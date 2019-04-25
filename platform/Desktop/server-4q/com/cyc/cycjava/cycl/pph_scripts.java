package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pph_scripts
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.pph_scripts";
  public static final String myFingerPrint = "9a5eb078c4f5f5c61813e2bbbfdc82eab3affb5f7d59bc51c3baa0c0e929ee15";
  private static final SubLSymbol $sym0$GENERATE_SCRIPT_EXPANSION;
  private static final SubLSymbol $kw1$SCRIPT_EXPANSION;
  private static final SubLSymbol $kw2$DECENT;
  private static final SubLString $str3$The_steps_in_the_script__S_____;
  private static final SubLSymbol $sym4$GENERIC_ARG_P;
  private static final SubLObject $const5$SomeFn;
  private static final SubLString $str6$PPH_HASH_ONE_ARG_KEYWORD__Hashing;
  private static final SubLObject $const7$isa;
  private static final SubLString $str8$_PPH_error_level_;
  private static final SubLString $str9$__;
  private static final SubLString $str10$__PPH_ADD_CONSTRAINTS__Non_binary;
  private static final SubLList $list11;
  private static final SubLObject $const12$SubcollectionOfWithRelationToFn;
  private static final SubLObject $const13$SubcollectionOfWithRelationFromFn;
  private static final SubLSymbol $kw14$ARG1;
  private static final SubLObject $const15$Agent_Generic;
  private static final SubLString $str16$PPH_ISA_CONSTRAINT_ON_ARG_KEYWORD;
  private static final SubLObject $const17$eventSequence;
  private static final SubLString $str18$_D___A;
  private static final SubLString $str19$__PPH_REPHRASE_CLAUSE__Substituti;
  private static final SubLString $str20$__PPH_REPHRASE_CLAUSE__Replacing_;
  private static final SubLObject $const21$TheInstance;

  @SubLTranslatedFile.SubL(source = "cycl/pph-scripts.lisp", position = 829L)
  public static SubLObject generate_script_expansion(final SubLObject exp, final SubLObject nl_preds, final SubLObject determiner)
  {
    final SubLObject arg_keyword_hash = pph_hash_arg_keywords( exp );
    final SubLObject event_sequence = pph_find_event_sequence( exp );
    final SubLObject intro_string = PrintLow.format( NIL, $str3$The_steps_in_the_script__S_____, cycl_utilities.formula_arg1( exp, UNPROVIDED ) );
    final SubLObject seq_string = generate_event_sequence( event_sequence, arg_keyword_hash );
    return Sequences.cconcatenate( intro_string, seq_string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-scripts.lisp", position = 1321L)
  public static SubLObject pph_hash_arg_keywords(final SubLObject formula)
  {
    final SubLObject table = Hashtables.make_hash_table( SIXTEEN_INTEGER, UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var;
    final SubLObject arg_keywords = cdolist_list_var = pph_find_arg_keywords( formula );
    SubLObject arg_keyword = NIL;
    arg_keyword = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      pph_hash_one_arg_keyword( arg_keyword, table, formula );
      cdolist_list_var = cdolist_list_var.rest();
      arg_keyword = cdolist_list_var.first();
    }
    return table;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-scripts.lisp", position = 1756L)
  public static SubLObject pph_find_arg_keywords(final SubLObject formula)
  {
    return list_utilities.tree_gather( formula, Symbols.symbol_function( $sym4$GENERIC_ARG_P ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-scripts.lisp", position = 1910L)
  public static SubLObject pph_hash_one_arg_keyword(final SubLObject arg_keyword, final SubLObject table, final SubLObject formula)
  {
    final SubLObject isa_col = pph_isa_constraint_on_arg_keyword( arg_keyword, formula );
    SubLObject new_value = NIL;
    final SubLObject constraints = pph_non_isa_constraints_on_arg_keyword( arg_keyword, formula, table );
    if( NIL != constraints )
    {
      new_value = ConsesLow.list( $const5$SomeFn, pph_add_constraints( isa_col, arg_keyword, constraints, table ) );
    }
    else
    {
      new_value = ConsesLow.list( $const5$SomeFn, isa_col );
    }
    if( NIL != pph_error.pph_trace_level_exceeds_minimumP( TWO_INTEGER ) )
    {
      format_nil.force_format( T, $str6$PPH_HASH_ONE_ARG_KEYWORD__Hashing, arg_keyword, new_value, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    Hashtables.sethash( arg_keyword, table, new_value );
    SubLObject key = NIL;
    SubLObject old_value = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        key = Hashtables.getEntryKey( cdohash_entry );
        old_value = Hashtables.getEntryValue( cdohash_entry );
        Hashtables.sethash( key, table, conses_high.subst( new_value, arg_keyword, old_value, UNPROVIDED, UNPROVIDED ) );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return new_value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-scripts.lisp", position = 2840L)
  public static SubLObject pph_non_isa_constraints_on_arg_keyword(final SubLObject arg_keyword, final SubLObject formula, final SubLObject table)
  {
    SubLObject constraints = NIL;
    SubLObject cdolist_list_var = cycl_utilities.formula_args( cycl_utilities.formula_arg2( formula, UNPROVIDED ), UNPROVIDED );
    SubLObject conjunct = NIL;
    conjunct = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == el_utilities.el_formula_with_operator_p( conjunct, $const7$isa ) && NIL != conses_high.member( arg_keyword, conjunct, UNPROVIDED, UNPROVIDED ) )
      {
        SubLObject new_refP = NIL;
        if( NIL == new_refP )
        {
          SubLObject csome_list_var = cycl_utilities.formula_args( conjunct, UNPROVIDED );
          SubLObject arg = NIL;
          arg = csome_list_var.first();
          while ( NIL == new_refP && NIL != csome_list_var)
          {
            if( arg.isKeyword() && !arg.eql( arg_keyword ) && NIL == Hashtables.gethash( arg, table, UNPROVIDED ) )
            {
              new_refP = T;
            }
            csome_list_var = csome_list_var.rest();
            arg = csome_list_var.first();
          }
        }
        if( NIL == new_refP )
        {
          final SubLObject item_var = conjunct;
          if( NIL == conses_high.member( item_var, constraints, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            constraints = ConsesLow.cons( item_var, constraints );
          }
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      conjunct = cdolist_list_var.first();
    }
    return constraints;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-scripts.lisp", position = 3391L)
  public static SubLObject pph_add_constraints(final SubLObject isa_col, final SubLObject arg_keyword, final SubLObject constraints, final SubLObject table)
  {
    SubLObject ans = isa_col;
    SubLObject cdolist_list_var = constraints;
    SubLObject constraint = NIL;
    constraint = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == el_utilities.el_binary_formula_p( constraint ) )
      {
        final SubLObject new_format_string = Sequences.cconcatenate( $str8$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str9$__, format_nil.format_nil_a_no_copy(
            $str10$__PPH_ADD_CONSTRAINTS__Non_binary )
        } );
        pph_error.pph_handle_error( new_format_string, ConsesLow.list( constraint ) );
      }
      SubLObject current;
      final SubLObject datum = current = constraint;
      SubLObject pred = NIL;
      SubLObject arg1 = NIL;
      SubLObject arg2 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list11 );
      pred = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list11 );
      arg1 = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list11 );
      arg2 = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( arg1.eql( arg_keyword ) )
        {
          ans = ConsesLow.list( $const12$SubcollectionOfWithRelationToFn, ans, pred, arg2 );
        }
        else
        {
          ans = ConsesLow.list( $const13$SubcollectionOfWithRelationFromFn, ans, pred, arg1 );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list11 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      constraint = cdolist_list_var.first();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-scripts.lisp", position = 3934L)
  public static SubLObject pph_isa_constraint_on_arg_keyword(final SubLObject arg_keyword, final SubLObject formula)
  {
    SubLObject cols = NIL;
    SubLObject cdolist_list_var = cycl_utilities.formula_args( cycl_utilities.formula_arg2( formula, UNPROVIDED ), UNPROVIDED );
    SubLObject conjunct = NIL;
    conjunct = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != el_utilities.el_formula_with_operator_p( conjunct, $const7$isa ) && cycl_utilities.formula_arg1( conjunct, UNPROVIDED ).eql( arg_keyword ) )
      {
        final SubLObject item_var = cycl_utilities.formula_arg2( conjunct, UNPROVIDED );
        if( NIL == conses_high.member( item_var, cols, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          cols = ConsesLow.cons( item_var, cols );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      conjunct = cdolist_list_var.first();
    }
    if( NIL != list_utilities.lengthE( cols, ONE_INTEGER, UNPROVIDED ) )
    {
      return cols.first();
    }
    if( NIL == cols && arg_keyword == $kw14$ARG1 )
    {
      return $const15$Agent_Generic;
    }
    final SubLObject new_format_string = Sequences.cconcatenate( $str8$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str9$__, format_nil.format_nil_a_no_copy(
        $str16$PPH_ISA_CONSTRAINT_ON_ARG_KEYWORD )
    } );
    pph_error.pph_handle_error( new_format_string, ConsesLow.list( Sequences.length( cols ), arg_keyword ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-scripts.lisp", position = 4496L)
  public static SubLObject pph_find_event_sequence(final SubLObject formula)
  {
    SubLObject event_seq = NIL;
    if( NIL == event_seq )
    {
      SubLObject csome_list_var = cycl_utilities.formula_args( cycl_utilities.formula_arg2( formula, UNPROVIDED ), UNPROVIDED );
      SubLObject arg = NIL;
      arg = csome_list_var.first();
      while ( NIL == event_seq && NIL != csome_list_var)
      {
        if( NIL != el_utilities.el_formula_p( arg ) && NIL != pph_utilities.pph_genl_predicateP( cycl_utilities.formula_operator( arg ), $const17$eventSequence, UNPROVIDED ) )
        {
          event_seq = arg;
        }
        csome_list_var = csome_list_var.rest();
        arg = csome_list_var.first();
      }
    }
    return event_seq;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-scripts.lisp", position = 4922L)
  public static SubLObject generate_event_sequence(final SubLObject event_sequence, final SubLObject arg_keyword_hash)
  {
    final SubLObject action_list = cycl_utilities.formula_args( cycl_utilities.formula_arg1( event_sequence, UNPROVIDED ), UNPROVIDED );
    SubLObject stack = NIL;
    SubLObject cdotimes_end_var;
    SubLObject i;
    SubLObject item;
    SubLObject rephrase;
    for( cdotimes_end_var = Sequences.length( action_list ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      item = ConsesLow.nth( i, action_list );
      rephrase = pph_rephrase_clause( item, arg_keyword_hash );
      stack = ConsesLow.cons( PrintLow.format( NIL, $str18$_D___A, Numbers.add( i, ONE_INTEGER ), pph_main.generate_text( rephrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ), stack );
    }
    return string_utilities.bunge( Sequences.nreverse( stack ), Characters.CHAR_newline );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-scripts.lisp", position = 5340L)
  public static SubLObject pph_rephrase_clause(final SubLObject clause, final SubLObject arg_keyword_hash)
  {
    if( NIL == el_utilities.el_formula_p( clause ) )
    {
      return clause;
    }
    SubLObject arg_stack = NIL;
    SubLObject cdolist_list_var = clause;
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject rephrased_arg = arg;
      if( arg.isKeyword() )
      {
        SubLObject value;
        final SubLObject raw_value = value = Hashtables.gethash( arg, arg_keyword_hash, UNPROVIDED );
        if( raw_value.isCons() )
        {
          SubLObject stack = NIL;
          SubLObject cdolist_list_var_$1 = raw_value;
          SubLObject item = NIL;
          item = cdolist_list_var_$1.first();
          while ( NIL != cdolist_list_var_$1)
          {
            stack = ConsesLow.cons( pph_rephrase_clause( item, arg_keyword_hash ), stack );
            cdolist_list_var_$1 = cdolist_list_var_$1.rest();
            item = cdolist_list_var_$1.first();
          }
          value = Sequences.reverse( stack );
        }
        if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
        {
          format_nil.force_format( T, $str19$__PPH_REPHRASE_CLAUSE__Substituti, value, arg, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        rephrased_arg = value;
        if( NIL != list_utilities.tree_find( arg, clause, UNPROVIDED, UNPROVIDED ) && NIL != el_utilities.el_formula_with_operator_p( value, $const5$SomeFn ) )
        {
          if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
          {
            format_nil.force_format( T, $str20$__PPH_REPHRASE_CLAUSE__Replacing_, value, ConsesLow.list( $const21$TheInstance, cycl_utilities.formula_arg1( value, UNPROVIDED ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
                UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          Hashtables.sethash( arg, arg_keyword_hash, ConsesLow.list( $const21$TheInstance, cycl_utilities.formula_arg1( value, UNPROVIDED ) ) );
        }
      }
      arg_stack = ConsesLow.cons( rephrased_arg, arg_stack );
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    return Sequences.reverse( arg_stack );
  }

  public static SubLObject declare_pph_scripts_file()
  {
    SubLFiles.declareFunction( me, "generate_script_expansion", "GENERATE-SCRIPT-EXPANSION", 3, 0, false );
    SubLFiles.declareFunction( me, "pph_hash_arg_keywords", "PPH-HASH-ARG-KEYWORDS", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_find_arg_keywords", "PPH-FIND-ARG-KEYWORDS", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_hash_one_arg_keyword", "PPH-HASH-ONE-ARG-KEYWORD", 3, 0, false );
    SubLFiles.declareFunction( me, "pph_non_isa_constraints_on_arg_keyword", "PPH-NON-ISA-CONSTRAINTS-ON-ARG-KEYWORD", 3, 0, false );
    SubLFiles.declareFunction( me, "pph_add_constraints", "PPH-ADD-CONSTRAINTS", 4, 0, false );
    SubLFiles.declareFunction( me, "pph_isa_constraint_on_arg_keyword", "PPH-ISA-CONSTRAINT-ON-ARG-KEYWORD", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_find_event_sequence", "PPH-FIND-EVENT-SEQUENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_event_sequence", "GENERATE-EVENT-SEQUENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_rephrase_clause", "PPH-REPHRASE-CLAUSE", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_pph_scripts_file()
  {
    return NIL;
  }

  public static SubLObject setup_pph_scripts_file()
  {
    pph_types.pph_register_method( $sym0$GENERATE_SCRIPT_EXPANSION, $kw1$SCRIPT_EXPANSION, $kw2$DECENT );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_pph_scripts_file();
  }

  @Override
  public void initializeVariables()
  {
    init_pph_scripts_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_pph_scripts_file();
  }
  static
  {
    me = new pph_scripts();
    $sym0$GENERATE_SCRIPT_EXPANSION = makeSymbol( "GENERATE-SCRIPT-EXPANSION" );
    $kw1$SCRIPT_EXPANSION = makeKeyword( "SCRIPT-EXPANSION" );
    $kw2$DECENT = makeKeyword( "DECENT" );
    $str3$The_steps_in_the_script__S_____ = makeString( "The steps in the script ~S:~%~%" );
    $sym4$GENERIC_ARG_P = makeSymbol( "GENERIC-ARG-P" );
    $const5$SomeFn = constant_handles.reader_make_constant_shell( makeString( "SomeFn" ) );
    $str6$PPH_HASH_ONE_ARG_KEYWORD__Hashing = makeString( "PPH-HASH-ONE-ARG-KEYWORD: Hashing ~S -> ~S.~%" );
    $const7$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $str8$_PPH_error_level_ = makeString( "(PPH error level " );
    $str9$__ = makeString( ") " );
    $str10$__PPH_ADD_CONSTRAINTS__Non_binary = makeString( "~&PPH-ADD-CONSTRAINTS: Non-binary constraint: ~S.~%" );
    $list11 = ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "ARG1" ), makeSymbol( "ARG2" ) );
    $const12$SubcollectionOfWithRelationToFn = constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationToFn" ) );
    $const13$SubcollectionOfWithRelationFromFn = constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationFromFn" ) );
    $kw14$ARG1 = makeKeyword( "ARG1" );
    $const15$Agent_Generic = constant_handles.reader_make_constant_shell( makeString( "Agent-Generic" ) );
    $str16$PPH_ISA_CONSTRAINT_ON_ARG_KEYWORD = makeString( "PPH-ISA-CONSTRAINT-ON-ARG-KEYWORD: ~D #$isa constraints on ~S.~%" );
    $const17$eventSequence = constant_handles.reader_make_constant_shell( makeString( "eventSequence" ) );
    $str18$_D___A = makeString( "~D. ~A" );
    $str19$__PPH_REPHRASE_CLAUSE__Substituti = makeString( "~&PPH-REPHRASE-CLAUSE: Substituting ~S for~% ~S.~%" );
    $str20$__PPH_REPHRASE_CLAUSE__Replacing_ = makeString( "~&PPH-REPHRASE-CLAUSE: Replacing ~s with ~s.~%" );
    $const21$TheInstance = constant_handles.reader_make_constant_shell( makeString( "TheInstance" ) );
  }
}
/*
 * 
 * Total time: 117 ms
 * 
 */