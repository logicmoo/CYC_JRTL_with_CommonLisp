package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class simple_indexing
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.simple_indexing";
  public static final String myFingerPrint = "b6da513aeec436d0eba904976dffb1c18adbafd5687ba711f889ed0d9b0e44bf";
  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 26357L)
  public static SubLSymbol $within_noting_terms_to_toggle_indexing_mode$;
  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 26579L)
  public static SubLSymbol $terms_to_toggle_indexing_mode$;
  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 27129L)
  private static SubLSymbol $index_convert_threshold$;
  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 27182L)
  private static SubLSymbol $index_convert_range$;
  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 27233L)
  private static SubLSymbol $index_convert_complex_threshold$;
  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 27472L)
  private static SubLSymbol $index_convert_simple_threshold$;
  private static final SubLSymbol $sym0$ASSERTION_P;
  private static final SubLSymbol $sym1$HLMT_EQUAL;
  private static final SubLObject $const2$termOfUnit;
  private static final SubLSymbol $kw3$POS;
  private static final SubLSymbol $sym4$MATCHES_PREDICATE_RULE_INDEX_TEST;
  private static final SubLSymbol $sym5$MATCHES_IST_PREDICATE_RULE_INDEX_TEST;
  private static final SubLSymbol $sym6$MATCHES_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX_TEST;
  private static final SubLSymbol $sym7$MATCHES_ISA_RULE_INDEX_TEST;
  private static final SubLObject $const8$isa;
  private static final SubLSymbol $sym9$MATCHES_QUOTED_ISA_RULE_INDEX_TEST;
  private static final SubLObject $const10$quotedIsa;
  private static final SubLSymbol $sym11$MATCHES_GENLS_RULE_INDEX_TEST;
  private static final SubLObject $const12$genls;
  private static final SubLSymbol $sym13$MATCHES_GENL_MT_RULE_INDEX_TEST;
  private static final SubLObject $const14$genlMt;
  private static final SubLSymbol $sym15$MATCHES_FUNCTION_RULE_INDEX_TEST;
  private static final SubLSymbol $sym16$MATCHES_EXCEPTION_RULE_INDEX_TEST;
  private static final SubLObject $const17$abnormal;
  private static final SubLSymbol $sym18$MATCHES_PRAGMA_RULE_INDEX_TEST;
  private static final SubLObject $const19$meetsPragmaticRequirement;
  private static final SubLSymbol $sym20$CLET;
  private static final SubLList $list21;
  private static final SubLList $list22;
  private static final SubLSymbol $sym23$NOTING_TERMS_TO_TOGGLE_INDEXING_MODE_INTERNAL;
  private static final SubLSymbol $sym24$NOTING_TERMS_TO_TOGGLE_INDEXING_MODE;
  private static final SubLSymbol $sym25$POSSIBLY_TOGGLE_TERM_INDEX_MODE;
  private static final SubLSymbol $sym26$VALID_ASSERTION;
  private static final SubLString $str27$mapping_Cyc_FORTs;
  private static final SubLSymbol $kw28$SKIP;
  private static final SubLString $str29$mapping_Cyc_assertions;
  private static final SubLSymbol $sym30$STRINGP;
  private static final SubLString $str31$invalid_index_under__S;
  private static final SubLSymbol $kw32$INVALID;
  private static final SubLSymbol $sym33$CLEAN_TERM_INDEX_INTERNAL;

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 687L)
  public static SubLObject gaf_arg_index_simple_match_p(final SubLObject assertion, final SubLObject v_term, SubLObject argnum, SubLObject predicate, SubLObject mt)
  {
    if( argnum == UNPROVIDED )
    {
      argnum = NIL;
    }
    if( predicate == UNPROVIDED )
    {
      predicate = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return makeBoolean( NIL != assertions_high.gaf_assertionP( assertion ) && ( NIL == predicate || predicate.equal( assertions_high.gaf_predicate( assertion ) ) ) && NIL != ( ( NIL != argnum ) ? Equality.equal( v_term,
        assertions_high.gaf_arg( assertion, argnum ) ) : el_utilities.term_is_one_of_argsP( v_term, assertions_high.gaf_formula( assertion ) ) ) && ( NIL == mt || NIL != hlmt.hlmt_equal( mt, assertions_high.assertion_mt(
            assertion ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 1659L)
  public static SubLObject matches_gaf_arg_index(final SubLObject assertion, final SubLObject v_term, SubLObject argnum, SubLObject pred, SubLObject mt)
  {
    if( argnum == UNPROVIDED )
    {
      argnum = NIL;
    }
    if( pred == UNPROVIDED )
    {
      pred = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL == assertions_high.gaf_assertionP( assertion ) )
    {
      return NIL;
    }
    return matches_gaf_arg_index_internal( assertion, v_term, argnum, pred, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 1904L)
  public static SubLObject simple_key_gaf_arg_index(final SubLObject assertion, SubLObject accumulator, final SubLObject v_term, SubLObject arg, SubLObject pred)
  {
    if( arg == UNPROVIDED )
    {
      arg = NIL;
    }
    if( pred == UNPROVIDED )
    {
      pred = NIL;
    }
    if( NIL != assertions_high.gaf_assertionP( assertion ) && NIL != matches_gaf_arg_index_internal( assertion, v_term, arg, pred, NIL ) )
    {
      accumulator = simple_key_gaf_arg_index_internal( assertion, accumulator, v_term, arg, pred );
    }
    return accumulator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 2225L)
  public static SubLObject matches_gaf_arg_index_internal(final SubLObject assertion, final SubLObject v_term, final SubLObject arg, final SubLObject pred, final SubLObject mt)
  {
    if( NIL == arg )
    {
      return list_utilities.sublisp_boolean( Sequences.find( v_term, assertions_high.gaf_args( assertion ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    if( !assertions_high.gaf_arg( assertion, arg ).equal( v_term ) )
    {
      return NIL;
    }
    if( NIL == pred )
    {
      return T;
    }
    if( NIL == kb_utilities.kbeq( assertions_high.gaf_predicate( assertion ), pred ) )
    {
      return NIL;
    }
    if( NIL == mt )
    {
      return T;
    }
    return hlmt.hlmt_equal( assertions_high.assertion_mt( assertion ), mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 2618L)
  public static SubLObject simple_key_gaf_arg_index_internal(final SubLObject assertion, SubLObject accumulator, final SubLObject v_term, final SubLObject arg, final SubLObject pred)
  {
    if( NIL != arg )
    {
      if( NIL != pred )
      {
        final SubLObject item_var = assertions_high.assertion_mt( assertion );
        if( NIL == conses_high.member( item_var, accumulator, $sym1$HLMT_EQUAL, Symbols.symbol_function( IDENTITY ) ) )
        {
          accumulator = ConsesLow.cons( item_var, accumulator );
        }
      }
      else
      {
        final SubLObject item_var = assertions_high.gaf_predicate( assertion );
        if( NIL == conses_high.member( item_var, accumulator, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          accumulator = ConsesLow.cons( item_var, accumulator );
        }
      }
    }
    else
    {
      SubLObject formula;
      SubLObject last_position;
      SubLObject position;
      SubLObject item_var2;
      for( formula = assertions_high.gaf_formula( assertion ), last_position = NIL, position = NIL, last_position = NIL, position = Sequences.position( v_term, formula, Symbols.symbol_function( EQL ), Symbols
          .symbol_function( IDENTITY ), ONE_INTEGER, UNPROVIDED ); NIL != position; position = Sequences.position( v_term, formula, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), Numbers.add(
              last_position, ONE_INTEGER ), UNPROVIDED ) )
      {
        item_var2 = position;
        if( NIL == conses_high.member( item_var2, accumulator, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          accumulator = ConsesLow.cons( item_var2, accumulator );
        }
        last_position = position;
      }
    }
    return accumulator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 3154L)
  public static SubLObject matches_nart_arg_index(final SubLObject assertion, final SubLObject v_term, SubLObject argnum, SubLObject func)
  {
    if( argnum == UNPROVIDED )
    {
      argnum = NIL;
    }
    if( func == UNPROVIDED )
    {
      func = NIL;
    }
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL == assertions_high.gaf_assertionP( assertion ) )
    {
      return NIL;
    }
    return matches_nart_arg_index_internal( assertion, v_term, argnum, func );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 3506L)
  public static SubLObject simple_key_nart_arg_index(final SubLObject assertion, SubLObject accumulator, final SubLObject v_term, SubLObject arg, SubLObject func)
  {
    if( arg == UNPROVIDED )
    {
      arg = NIL;
    }
    if( func == UNPROVIDED )
    {
      func = NIL;
    }
    if( NIL != assertions_high.gaf_assertionP( assertion ) && NIL != matches_nart_arg_index_internal( assertion, v_term, arg, func ) )
    {
      accumulator = simple_key_nart_arg_index_internal( assertion, accumulator, v_term, arg, func );
    }
    return accumulator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 3826L)
  public static SubLObject matches_nart_arg_index_internal(final SubLObject assertion, final SubLObject v_term, final SubLObject arg, final SubLObject func)
  {
    if( NIL == kb_utilities.kbeq( assertions_high.gaf_predicate( assertion ), $const2$termOfUnit ) )
    {
      return NIL;
    }
    final SubLObject nat = assertions_high.gaf_arg2( assertion );
    if( NIL != func && NIL == kb_utilities.kbeq( cycl_utilities.nat_function( nat ), func ) )
    {
      return NIL;
    }
    if( NIL != arg )
    {
      if( !cycl_utilities.nat_arg( nat, arg, UNPROVIDED ).equal( v_term ) )
      {
        return NIL;
      }
    }
    else if( NIL == Sequences.find( v_term, cycl_utilities.nat_args( nat, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 4243L)
  public static SubLObject simple_key_nart_arg_index_internal(final SubLObject assertion, SubLObject accumulator, final SubLObject v_term, final SubLObject arg, final SubLObject func)
  {
    final SubLObject nat = assertions_high.gaf_arg2( assertion );
    if( NIL != arg )
    {
      if( NIL != func )
      {
        final SubLObject item_var = assertions_high.assertion_mt( assertion );
        if( NIL == conses_high.member( item_var, accumulator, $sym1$HLMT_EQUAL, Symbols.symbol_function( IDENTITY ) ) )
        {
          accumulator = ConsesLow.cons( item_var, accumulator );
        }
      }
      else
      {
        final SubLObject item_var = cycl_utilities.nat_function( nat );
        if( NIL == conses_high.member( item_var, accumulator, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          accumulator = ConsesLow.cons( item_var, accumulator );
        }
      }
    }
    else
    {
      SubLObject last_position;
      SubLObject position;
      SubLObject item_var2;
      for( last_position = NIL, position = NIL, last_position = NIL, position = Sequences.position( v_term, nat, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), ONE_INTEGER,
          UNPROVIDED ); NIL != position; position = Sequences.position( v_term, nat, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), Numbers.add( last_position, ONE_INTEGER ), UNPROVIDED ) )
      {
        item_var2 = position;
        if( NIL == conses_high.member( item_var2, accumulator, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          accumulator = ConsesLow.cons( item_var2, accumulator );
        }
        last_position = position;
      }
    }
    return accumulator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 4754L)
  public static SubLObject matches_predicate_extent_index(final SubLObject assertion, final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL == assertions_high.gaf_assertionP( assertion ) )
    {
      return NIL;
    }
    return matches_predicate_extent_index_internal( assertion, v_term, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 5082L)
  public static SubLObject simple_key_predicate_extent_index(final SubLObject assertion, SubLObject accumulator, final SubLObject v_term)
  {
    if( NIL != matches_predicate_extent_index( assertion, v_term, UNPROVIDED ) )
    {
      final SubLObject item_var = assertions_high.assertion_mt( assertion );
      if( NIL == conses_high.member( item_var, accumulator, $sym1$HLMT_EQUAL, Symbols.symbol_function( IDENTITY ) ) )
      {
        accumulator = ConsesLow.cons( item_var, accumulator );
      }
    }
    return accumulator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 5307L)
  public static SubLObject matches_predicate_extent_index_internal(final SubLObject assertion, final SubLObject v_term, final SubLObject mt)
  {
    if( NIL == kb_utilities.kbeq( assertions_high.gaf_predicate( assertion ), v_term ) )
    {
      return NIL;
    }
    if( NIL == mt )
    {
      return T;
    }
    return hlmt.hlmt_equal( assertions_high.assertion_mt( assertion ), mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 5539L)
  public static SubLObject matches_function_extent_index(final SubLObject assertion, final SubLObject v_term)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL == assertions_high.gaf_assertionP( assertion ) )
    {
      return NIL;
    }
    return matches_function_extent_index_internal( assertion, v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 5865L)
  public static SubLObject matches_function_extent_index_internal(final SubLObject assertion, final SubLObject func)
  {
    if( NIL == kb_utilities.kbeq( assertions_high.gaf_predicate( assertion ), $const2$termOfUnit ) )
    {
      return NIL;
    }
    final SubLObject nat = assertions_high.gaf_arg2( assertion );
    if( NIL == kb_utilities.kbeq( cycl_utilities.nat_function( nat ), func ) )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 6120L)
  public static SubLObject matches_predicate_rule_index(final SubLObject assertion, final SubLObject pred, SubLObject sense, SubLObject mt, SubLObject direction)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL == assertions_high.rule_assertionP( assertion ) )
    {
      return NIL;
    }
    if( NIL == sense )
    {
      SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
      SubLObject sense_$1 = NIL;
      sense_$1 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != matches_predicate_rule_index( assertion, pred, sense_$1, UNPROVIDED, UNPROVIDED ) )
        {
          return T;
        }
        cdolist_list_var = cdolist_list_var.rest();
        sense_$1 = cdolist_list_var.first();
      }
    }
    if( NIL != mt )
    {
      if( NIL == hlmt.hlmt_equal( assertions_high.assertion_mt( assertion ), mt ) )
      {
        return NIL;
      }
      if( NIL != direction && !assertions_high.assertion_direction( assertion ).eql( direction ) )
      {
        return NIL;
      }
    }
    final SubLObject cnf = assertions_high.assertion_cnf( assertion );
    final SubLObject literals = ( sense == $kw3$POS ) ? clauses.pos_lits( cnf ) : clauses.neg_lits( cnf );
    return list_utilities.sublisp_boolean( Sequences.find( pred, literals, Symbols.symbol_function( $sym4$MATCHES_PREDICATE_RULE_INDEX_TEST ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 6920L)
  public static SubLObject simple_key_predicate_rule_index(final SubLObject assertion, SubLObject accumulator, final SubLObject pred, SubLObject sense, SubLObject mt)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL != matches_predicate_rule_index( assertion, pred, sense, mt, UNPROVIDED ) )
    {
      if( NIL != sense )
      {
        if( NIL != mt )
        {
          final SubLObject item_var = assertions_high.assertion_direction( assertion );
          if( NIL == conses_high.member( item_var, accumulator, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            accumulator = ConsesLow.cons( item_var, accumulator );
          }
        }
        else
        {
          final SubLObject item_var = assertions_high.assertion_mt( assertion );
          if( NIL == conses_high.member( item_var, accumulator, $sym1$HLMT_EQUAL, Symbols.symbol_function( IDENTITY ) ) )
          {
            accumulator = ConsesLow.cons( item_var, accumulator );
          }
        }
      }
      else
      {
        SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
        SubLObject sense_$2 = NIL;
        sense_$2 = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != matches_predicate_rule_index( assertion, pred, sense_$2, UNPROVIDED, UNPROVIDED ) )
          {
            final SubLObject item_var2 = sense_$2;
            if( NIL == conses_high.member( item_var2, accumulator, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              accumulator = ConsesLow.cons( item_var2, accumulator );
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          sense_$2 = cdolist_list_var.first();
        }
      }
    }
    return accumulator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 7432L)
  public static SubLObject matches_predicate_rule_index_test(final SubLObject pred, final SubLObject literal)
  {
    final SubLObject predicate = el_utilities.literal_predicate( literal, UNPROVIDED );
    if( NIL == forts.fort_p( predicate ) )
    {
      return NIL;
    }
    return kb_utilities.kbeq( pred, predicate );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 7665L)
  public static SubLObject matches_ist_predicate_rule_index(final SubLObject assertion, final SubLObject pred, SubLObject sense, SubLObject mt, SubLObject direction)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL == assertions_high.rule_assertionP( assertion ) )
    {
      return NIL;
    }
    if( NIL == sense )
    {
      SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
      SubLObject sense_$3 = NIL;
      sense_$3 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != matches_ist_predicate_rule_index( assertion, pred, sense_$3, UNPROVIDED, UNPROVIDED ) )
        {
          return T;
        }
        cdolist_list_var = cdolist_list_var.rest();
        sense_$3 = cdolist_list_var.first();
      }
    }
    if( NIL != mt )
    {
      if( NIL == hlmt.hlmt_equal( assertions_high.assertion_mt( assertion ), mt ) )
      {
        return NIL;
      }
      if( NIL != direction && !assertions_high.assertion_direction( assertion ).eql( direction ) )
      {
        return NIL;
      }
    }
    final SubLObject cnf = assertions_high.assertion_cnf( assertion );
    final SubLObject literals = ( sense == $kw3$POS ) ? clauses.pos_lits( cnf ) : clauses.neg_lits( cnf );
    return list_utilities.sublisp_boolean( Sequences.find( pred, literals, Symbols.symbol_function( $sym5$MATCHES_IST_PREDICATE_RULE_INDEX_TEST ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 8498L)
  public static SubLObject simple_key_ist_predicate_rule_index(final SubLObject assertion, SubLObject accumulator, final SubLObject pred, SubLObject sense, SubLObject mt)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL != matches_ist_predicate_rule_index( assertion, pred, sense, mt, UNPROVIDED ) )
    {
      if( NIL != sense )
      {
        if( NIL != mt )
        {
          final SubLObject item_var = assertions_high.assertion_direction( assertion );
          if( NIL == conses_high.member( item_var, accumulator, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            accumulator = ConsesLow.cons( item_var, accumulator );
          }
        }
        else
        {
          final SubLObject item_var = assertions_high.assertion_mt( assertion );
          if( NIL == conses_high.member( item_var, accumulator, $sym1$HLMT_EQUAL, Symbols.symbol_function( IDENTITY ) ) )
          {
            accumulator = ConsesLow.cons( item_var, accumulator );
          }
        }
      }
      else
      {
        SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
        SubLObject sense_$4 = NIL;
        sense_$4 = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != matches_ist_predicate_rule_index( assertion, pred, sense_$4, UNPROVIDED, UNPROVIDED ) )
          {
            final SubLObject item_var2 = sense_$4;
            if( NIL == conses_high.member( item_var2, accumulator, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              accumulator = ConsesLow.cons( item_var2, accumulator );
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          sense_$4 = cdolist_list_var.first();
        }
      }
    }
    return accumulator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 9022L)
  public static SubLObject matches_ist_predicate_rule_index_test(final SubLObject pred, final SubLObject literal)
  {
    return makeBoolean( NIL != el_utilities.ist_predicateP( el_utilities.literal_predicate( literal, UNPROVIDED ), kb_indexing.spec_preds_of_ist_indexing_enabledP() ) && NIL != kb_utilities.kbeq( pred, el_utilities
        .literal_predicate( el_utilities.literal_arg2( literal, UNPROVIDED ), UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 9266L)
  public static SubLObject matches_decontextualized_ist_predicate_rule_index(final SubLObject assertion, final SubLObject pred, SubLObject sense, SubLObject direction)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL == assertions_high.rule_assertionP( assertion ) )
    {
      return NIL;
    }
    if( NIL == sense )
    {
      SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
      SubLObject sense_$5 = NIL;
      sense_$5 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != matches_decontextualized_ist_predicate_rule_index( assertion, pred, sense_$5, UNPROVIDED ) )
        {
          return T;
        }
        cdolist_list_var = cdolist_list_var.rest();
        sense_$5 = cdolist_list_var.first();
      }
    }
    if( NIL != direction && !assertions_high.assertion_direction( assertion ).eql( direction ) )
    {
      return NIL;
    }
    final SubLObject cnf = assertions_high.assertion_cnf( assertion );
    final SubLObject literals = ( sense == $kw3$POS ) ? clauses.pos_lits( cnf ) : clauses.neg_lits( cnf );
    return list_utilities.sublisp_boolean( Sequences.find( pred, literals, Symbols.symbol_function( $sym6$MATCHES_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX_TEST ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 10103L)
  public static SubLObject simple_key_decontextualized_ist_predicate_rule_index(final SubLObject assertion, SubLObject accumulator, final SubLObject pred, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL != matches_decontextualized_ist_predicate_rule_index( assertion, pred, sense, UNPROVIDED ) )
    {
      if( NIL != sense )
      {
        final SubLObject item_var = assertions_high.assertion_direction( assertion );
        if( NIL == conses_high.member( item_var, accumulator, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          accumulator = ConsesLow.cons( item_var, accumulator );
        }
      }
      else
      {
        SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
        SubLObject sense_$6 = NIL;
        sense_$6 = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != matches_decontextualized_ist_predicate_rule_index( assertion, pred, sense_$6, UNPROVIDED ) )
          {
            final SubLObject item_var2 = sense_$6;
            if( NIL == conses_high.member( item_var2, accumulator, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              accumulator = ConsesLow.cons( item_var2, accumulator );
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          sense_$6 = cdolist_list_var.first();
        }
      }
    }
    return accumulator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 10589L)
  public static SubLObject matches_decontextualized_ist_predicate_rule_index_test(final SubLObject pred, final SubLObject literal)
  {
    return makeBoolean( NIL != el_utilities.ist_predicateP( el_utilities.literal_predicate( literal, UNPROVIDED ), kb_indexing.spec_preds_of_ist_indexing_enabledP() ) && NIL != kb_utilities.kbeq( pred, el_utilities
        .literal_predicate( el_utilities.literal_arg2( literal, UNPROVIDED ), UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 10850L)
  public static SubLObject matches_isa_rule_index(final SubLObject assertion, final SubLObject col, SubLObject sense, SubLObject mt, SubLObject direction)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL == assertions_high.rule_assertionP( assertion ) )
    {
      return NIL;
    }
    if( NIL == sense )
    {
      SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
      SubLObject sense_$7 = NIL;
      sense_$7 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != matches_isa_rule_index( assertion, col, sense_$7, UNPROVIDED, UNPROVIDED ) )
        {
          return T;
        }
        cdolist_list_var = cdolist_list_var.rest();
        sense_$7 = cdolist_list_var.first();
      }
    }
    if( NIL != mt )
    {
      if( NIL == hlmt.hlmt_equal( assertions_high.assertion_mt( assertion ), mt ) )
      {
        return NIL;
      }
      if( NIL != direction && !assertions_high.assertion_direction( assertion ).eql( direction ) )
      {
        return NIL;
      }
    }
    final SubLObject cnf = assertions_high.assertion_cnf( assertion );
    final SubLObject literals = ( sense == $kw3$POS ) ? clauses.pos_lits( cnf ) : clauses.neg_lits( cnf );
    return list_utilities.sublisp_boolean( Sequences.find( col, literals, Symbols.symbol_function( $sym7$MATCHES_ISA_RULE_INDEX_TEST ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 11623L)
  public static SubLObject simple_key_isa_rule_index(final SubLObject assertion, SubLObject accumulator, final SubLObject col, SubLObject sense, SubLObject mt)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL != matches_isa_rule_index( assertion, col, sense, mt, UNPROVIDED ) )
    {
      if( NIL != sense )
      {
        if( NIL != mt )
        {
          final SubLObject item_var = assertions_high.assertion_direction( assertion );
          if( NIL == conses_high.member( item_var, accumulator, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            accumulator = ConsesLow.cons( item_var, accumulator );
          }
        }
        else
        {
          final SubLObject item_var = assertions_high.assertion_mt( assertion );
          if( NIL == conses_high.member( item_var, accumulator, $sym1$HLMT_EQUAL, Symbols.symbol_function( IDENTITY ) ) )
          {
            accumulator = ConsesLow.cons( item_var, accumulator );
          }
        }
      }
      else
      {
        SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
        SubLObject sense_$8 = NIL;
        sense_$8 = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != matches_isa_rule_index( assertion, col, sense_$8, UNPROVIDED, UNPROVIDED ) )
          {
            final SubLObject item_var2 = sense_$8;
            if( NIL == conses_high.member( item_var2, accumulator, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              accumulator = ConsesLow.cons( item_var2, accumulator );
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          sense_$8 = cdolist_list_var.first();
        }
      }
    }
    return accumulator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 12114L)
  public static SubLObject matches_isa_rule_index_test(final SubLObject col, final SubLObject literal)
  {
    final SubLObject predicate = el_utilities.literal_predicate( literal, UNPROVIDED );
    if( NIL != kb_utilities.kbeq( $const8$isa, predicate ) )
    {
      final SubLObject collection = el_utilities.literal_arg2( literal, UNPROVIDED );
      if( NIL != forts.fort_p( collection ) )
      {
        return kb_utilities.kbeq( col, collection );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 12383L)
  public static SubLObject matches_quoted_isa_rule_index(final SubLObject assertion, final SubLObject col, SubLObject sense, SubLObject mt, SubLObject direction)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL == assertions_high.rule_assertionP( assertion ) )
    {
      return NIL;
    }
    if( NIL == sense )
    {
      SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
      SubLObject sense_$9 = NIL;
      sense_$9 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != matches_quoted_isa_rule_index( assertion, col, sense_$9, UNPROVIDED, UNPROVIDED ) )
        {
          return T;
        }
        cdolist_list_var = cdolist_list_var.rest();
        sense_$9 = cdolist_list_var.first();
      }
    }
    if( NIL != mt )
    {
      if( NIL == hlmt.hlmt_equal( assertions_high.assertion_mt( assertion ), mt ) )
      {
        return NIL;
      }
      if( NIL != direction && !assertions_high.assertion_direction( assertion ).eql( direction ) )
      {
        return NIL;
      }
    }
    final SubLObject cnf = assertions_high.assertion_cnf( assertion );
    final SubLObject literals = ( sense == $kw3$POS ) ? clauses.pos_lits( cnf ) : clauses.neg_lits( cnf );
    return list_utilities.sublisp_boolean( Sequences.find( col, literals, Symbols.symbol_function( $sym9$MATCHES_QUOTED_ISA_RULE_INDEX_TEST ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 13200L)
  public static SubLObject simple_key_quoted_isa_rule_index(final SubLObject assertion, SubLObject accumulator, final SubLObject col, SubLObject sense, SubLObject mt)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL != matches_quoted_isa_rule_index( assertion, col, sense, mt, UNPROVIDED ) )
    {
      if( NIL != sense )
      {
        if( NIL != mt )
        {
          final SubLObject item_var = assertions_high.assertion_direction( assertion );
          if( NIL == conses_high.member( item_var, accumulator, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            accumulator = ConsesLow.cons( item_var, accumulator );
          }
        }
        else
        {
          final SubLObject item_var = assertions_high.assertion_mt( assertion );
          if( NIL == conses_high.member( item_var, accumulator, $sym1$HLMT_EQUAL, Symbols.symbol_function( IDENTITY ) ) )
          {
            accumulator = ConsesLow.cons( item_var, accumulator );
          }
        }
      }
      else
      {
        SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
        SubLObject sense_$10 = NIL;
        sense_$10 = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != matches_quoted_isa_rule_index( assertion, col, sense_$10, UNPROVIDED, UNPROVIDED ) )
          {
            final SubLObject item_var2 = sense_$10;
            if( NIL == conses_high.member( item_var2, accumulator, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              accumulator = ConsesLow.cons( item_var2, accumulator );
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          sense_$10 = cdolist_list_var.first();
        }
      }
    }
    return accumulator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 13712L)
  public static SubLObject matches_quoted_isa_rule_index_test(final SubLObject col, final SubLObject literal)
  {
    final SubLObject predicate = el_utilities.literal_predicate( literal, UNPROVIDED );
    if( NIL != kb_utilities.kbeq( $const10$quotedIsa, predicate ) )
    {
      final SubLObject collection = el_utilities.literal_arg2( literal, UNPROVIDED );
      if( NIL != forts.fort_p( collection ) )
      {
        return kb_utilities.kbeq( col, collection );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 13994L)
  public static SubLObject matches_genls_rule_index(final SubLObject assertion, final SubLObject col, SubLObject sense, SubLObject mt, SubLObject direction)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL == assertions_high.rule_assertionP( assertion ) )
    {
      return NIL;
    }
    if( NIL == sense )
    {
      SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
      SubLObject sense_$11 = NIL;
      sense_$11 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != matches_genls_rule_index( assertion, col, sense_$11, UNPROVIDED, UNPROVIDED ) )
        {
          return T;
        }
        cdolist_list_var = cdolist_list_var.rest();
        sense_$11 = cdolist_list_var.first();
      }
    }
    if( NIL != mt )
    {
      if( NIL == hlmt.hlmt_equal( assertions_high.assertion_mt( assertion ), mt ) )
      {
        return NIL;
      }
      if( NIL != direction && !assertions_high.assertion_direction( assertion ).eql( direction ) )
      {
        return NIL;
      }
    }
    final SubLObject cnf = assertions_high.assertion_cnf( assertion );
    final SubLObject literals = ( sense == $kw3$POS ) ? clauses.pos_lits( cnf ) : clauses.neg_lits( cnf );
    return list_utilities.sublisp_boolean( Sequences.find( col, literals, Symbols.symbol_function( $sym11$MATCHES_GENLS_RULE_INDEX_TEST ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 14777L)
  public static SubLObject simple_key_genls_rule_index(final SubLObject assertion, SubLObject accumulator, final SubLObject col, SubLObject sense, SubLObject mt)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL != matches_genls_rule_index( assertion, col, sense, mt, UNPROVIDED ) )
    {
      if( NIL != sense )
      {
        if( NIL != mt )
        {
          final SubLObject item_var = assertions_high.assertion_direction( assertion );
          if( NIL == conses_high.member( item_var, accumulator, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            accumulator = ConsesLow.cons( item_var, accumulator );
          }
        }
        else
        {
          final SubLObject item_var = assertions_high.assertion_mt( assertion );
          if( NIL == conses_high.member( item_var, accumulator, $sym1$HLMT_EQUAL, Symbols.symbol_function( IDENTITY ) ) )
          {
            accumulator = ConsesLow.cons( item_var, accumulator );
          }
        }
      }
      else
      {
        SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
        SubLObject sense_$12 = NIL;
        sense_$12 = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != matches_genls_rule_index( assertion, col, sense_$12, UNPROVIDED, UNPROVIDED ) )
          {
            final SubLObject item_var2 = sense_$12;
            if( NIL == conses_high.member( item_var2, accumulator, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              accumulator = ConsesLow.cons( item_var2, accumulator );
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          sense_$12 = cdolist_list_var.first();
        }
      }
    }
    return accumulator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 15274L)
  public static SubLObject matches_genls_rule_index_test(final SubLObject col, final SubLObject literal)
  {
    final SubLObject predicate = el_utilities.literal_predicate( literal, UNPROVIDED );
    if( NIL != kb_utilities.kbeq( $const12$genls, predicate ) )
    {
      final SubLObject collection = el_utilities.literal_arg2( literal, UNPROVIDED );
      if( NIL != forts.fort_p( collection ) )
      {
        return kb_utilities.kbeq( col, collection );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 15547L)
  public static SubLObject matches_genl_mt_rule_index(final SubLObject assertion, final SubLObject genl_mt, SubLObject sense, SubLObject mt, SubLObject direction)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL == assertions_high.rule_assertionP( assertion ) )
    {
      return NIL;
    }
    if( NIL == sense )
    {
      SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
      SubLObject sense_$13 = NIL;
      sense_$13 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != matches_genl_mt_rule_index( assertion, genl_mt, sense_$13, UNPROVIDED, UNPROVIDED ) )
        {
          return T;
        }
        cdolist_list_var = cdolist_list_var.rest();
        sense_$13 = cdolist_list_var.first();
      }
    }
    if( NIL != mt )
    {
      if( NIL == hlmt.hlmt_equal( assertions_high.assertion_mt( assertion ), mt ) )
      {
        return NIL;
      }
      if( NIL != direction && !assertions_high.assertion_direction( assertion ).eql( direction ) )
      {
        return NIL;
      }
    }
    final SubLObject cnf = assertions_high.assertion_cnf( assertion );
    final SubLObject literals = ( sense == $kw3$POS ) ? clauses.pos_lits( cnf ) : clauses.neg_lits( cnf );
    return list_utilities.sublisp_boolean( Sequences.find( genl_mt, literals, Symbols.symbol_function( $sym13$MATCHES_GENL_MT_RULE_INDEX_TEST ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 16360L)
  public static SubLObject simple_key_genl_mt_rule_index(final SubLObject assertion, SubLObject accumulator, final SubLObject genl_mt, SubLObject sense, SubLObject mt)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL != matches_genl_mt_rule_index( assertion, genl_mt, sense, mt, UNPROVIDED ) )
    {
      if( NIL != sense )
      {
        if( NIL != mt )
        {
          final SubLObject item_var = assertions_high.assertion_direction( assertion );
          if( NIL == conses_high.member( item_var, accumulator, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            accumulator = ConsesLow.cons( item_var, accumulator );
          }
        }
        else
        {
          final SubLObject item_var = assertions_high.assertion_mt( assertion );
          if( NIL == conses_high.member( item_var, accumulator, $sym1$HLMT_EQUAL, Symbols.symbol_function( IDENTITY ) ) )
          {
            accumulator = ConsesLow.cons( item_var, accumulator );
          }
        }
      }
      else
      {
        SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
        SubLObject sense_$14 = NIL;
        sense_$14 = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != matches_genl_mt_rule_index( assertion, genl_mt, sense_$14, UNPROVIDED, UNPROVIDED ) )
          {
            final SubLObject item_var2 = sense_$14;
            if( NIL == conses_high.member( item_var2, accumulator, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              accumulator = ConsesLow.cons( item_var2, accumulator );
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          sense_$14 = cdolist_list_var.first();
        }
      }
    }
    return accumulator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 16875L)
  public static SubLObject matches_genl_mt_rule_index_test(final SubLObject mt, final SubLObject literal)
  {
    final SubLObject predicate = el_utilities.literal_predicate( literal, UNPROVIDED );
    if( NIL != kb_utilities.kbeq( $const14$genlMt, predicate ) )
    {
      final SubLObject genl_mt = el_utilities.literal_arg2( literal, UNPROVIDED );
      if( NIL != hlmt.hlmt_p( genl_mt ) )
      {
        return hlmt.hlmt_equal( mt, genl_mt );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 17146L)
  public static SubLObject matches_function_rule_index(final SubLObject assertion, final SubLObject func, SubLObject mt, SubLObject direction)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL == assertions_high.rule_assertionP( assertion ) )
    {
      return NIL;
    }
    if( NIL != mt )
    {
      if( NIL == hlmt.hlmt_equal( assertions_high.assertion_mt( assertion ), mt ) )
      {
        return NIL;
      }
      if( NIL != direction && !assertions_high.assertion_direction( assertion ).eql( direction ) )
      {
        return NIL;
      }
    }
    final SubLObject cnf = assertions_high.assertion_cnf( assertion );
    final SubLObject literals = clauses.neg_lits( cnf );
    return list_utilities.sublisp_boolean( Sequences.find( func, literals, Symbols.symbol_function( $sym15$MATCHES_FUNCTION_RULE_INDEX_TEST ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 17823L)
  public static SubLObject simple_key_function_rule_index(final SubLObject assertion, SubLObject accumulator, final SubLObject func, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL != matches_function_rule_index( assertion, func, mt, UNPROVIDED ) )
    {
      if( NIL != mt )
      {
        final SubLObject item_var = assertions_high.assertion_direction( assertion );
        if( NIL == conses_high.member( item_var, accumulator, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          accumulator = ConsesLow.cons( item_var, accumulator );
        }
      }
      else
      {
        final SubLObject item_var = assertions_high.assertion_mt( assertion );
        if( NIL == conses_high.member( item_var, accumulator, $sym1$HLMT_EQUAL, Symbols.symbol_function( IDENTITY ) ) )
        {
          accumulator = ConsesLow.cons( item_var, accumulator );
        }
      }
    }
    return accumulator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 18163L)
  public static SubLObject matches_function_rule_index_test(final SubLObject func, final SubLObject literal)
  {
    final SubLObject predicate = el_utilities.literal_predicate( literal, UNPROVIDED );
    if( NIL != kb_utilities.kbeq( $const2$termOfUnit, predicate ) && NIL != variables.variable_p( el_utilities.literal_arg1( literal, UNPROVIDED ) ) )
    {
      final SubLObject nat = el_utilities.literal_arg2( literal, UNPROVIDED );
      if( nat.isCons() )
      {
        final SubLObject function = cycl_utilities.nat_function( nat );
        if( NIL != forts.fort_p( function ) )
        {
          return kb_utilities.kbeq( func, function );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 18566L)
  public static SubLObject matches_exception_rule_index(final SubLObject assertion, final SubLObject rule, SubLObject mt, SubLObject direction)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL == assertions_high.rule_assertionP( assertion ) )
    {
      return NIL;
    }
    if( NIL != mt )
    {
      if( NIL == hlmt.hlmt_equal( assertions_high.assertion_mt( assertion ), mt ) )
      {
        return NIL;
      }
      if( NIL != direction && !assertions_high.assertion_direction( assertion ).eql( direction ) )
      {
        return NIL;
      }
    }
    final SubLObject cnf = assertions_high.assertion_cnf( assertion );
    final SubLObject literals = clauses.pos_lits( cnf );
    return list_utilities.sublisp_boolean( Sequences.find( rule, literals, Symbols.symbol_function( $sym16$MATCHES_EXCEPTION_RULE_INDEX_TEST ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 19245L)
  public static SubLObject simple_key_exception_rule_index(final SubLObject assertion, SubLObject accumulator, final SubLObject rule, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL != matches_exception_rule_index( assertion, rule, mt, UNPROVIDED ) )
    {
      if( NIL != mt )
      {
        final SubLObject item_var = assertions_high.assertion_direction( assertion );
        if( NIL == conses_high.member( item_var, accumulator, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          accumulator = ConsesLow.cons( item_var, accumulator );
        }
      }
      else
      {
        final SubLObject item_var = assertions_high.assertion_mt( assertion );
        if( NIL == conses_high.member( item_var, accumulator, $sym1$HLMT_EQUAL, Symbols.symbol_function( IDENTITY ) ) )
        {
          accumulator = ConsesLow.cons( item_var, accumulator );
        }
      }
    }
    return accumulator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 19587L)
  public static SubLObject matches_exception_rule_index_test(final SubLObject rule, final SubLObject literal)
  {
    final SubLObject predicate = el_utilities.literal_predicate( literal, UNPROVIDED );
    if( NIL == kb_utilities.kbeq( $const17$abnormal, predicate ) )
    {
      return NIL;
    }
    if( NIL == assertion_handles.assertion_p( rule ) )
    {
      return NIL;
    }
    return Equality.eq( el_utilities.literal_arg2( literal, UNPROVIDED ), rule );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 19862L)
  public static SubLObject matches_pragma_rule_index(final SubLObject assertion, final SubLObject rule, SubLObject mt, SubLObject direction)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL == assertions_high.rule_assertionP( assertion ) )
    {
      return NIL;
    }
    if( NIL != mt )
    {
      if( NIL == hlmt.hlmt_equal( assertions_high.assertion_mt( assertion ), mt ) )
      {
        return NIL;
      }
      if( NIL != direction && !assertions_high.assertion_direction( assertion ).eql( direction ) )
      {
        return NIL;
      }
    }
    final SubLObject cnf = assertions_high.assertion_cnf( assertion );
    final SubLObject literals = clauses.pos_lits( cnf );
    return list_utilities.sublisp_boolean( Sequences.find( rule, literals, Symbols.symbol_function( $sym18$MATCHES_PRAGMA_RULE_INDEX_TEST ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 20539L)
  public static SubLObject simple_key_pragma_rule_index(final SubLObject assertion, SubLObject accumulator, final SubLObject rule, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL != matches_pragma_rule_index( assertion, rule, mt, UNPROVIDED ) )
    {
      if( NIL != mt )
      {
        final SubLObject item_var = assertions_high.assertion_direction( assertion );
        if( NIL == conses_high.member( item_var, accumulator, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          accumulator = ConsesLow.cons( item_var, accumulator );
        }
      }
      else
      {
        final SubLObject item_var = assertions_high.assertion_mt( assertion );
        if( NIL == conses_high.member( item_var, accumulator, $sym1$HLMT_EQUAL, Symbols.symbol_function( IDENTITY ) ) )
        {
          accumulator = ConsesLow.cons( item_var, accumulator );
        }
      }
    }
    return accumulator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 20875L)
  public static SubLObject matches_pragma_rule_index_test(final SubLObject rule, final SubLObject literal)
  {
    final SubLObject predicate = el_utilities.literal_predicate( literal, UNPROVIDED );
    if( NIL == kb_utilities.kbeq( $const19$meetsPragmaticRequirement, predicate ) )
    {
      return NIL;
    }
    if( NIL == assertion_handles.assertion_p( rule ) )
    {
      return NIL;
    }
    return Equality.eq( el_utilities.literal_arg2( literal, UNPROVIDED ), rule );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 21164L)
  public static SubLObject matches_unbound_rule_index(final SubLObject assertion, SubLObject sense, SubLObject mt, SubLObject direction)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL == assertions_high.rule_assertionP( assertion ) )
    {
      return NIL;
    }
    if( NIL == sense )
    {
      SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
      SubLObject sense_$15 = NIL;
      sense_$15 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != matches_unbound_rule_index( assertion, sense_$15, UNPROVIDED, UNPROVIDED ) )
        {
          return T;
        }
        cdolist_list_var = cdolist_list_var.rest();
        sense_$15 = cdolist_list_var.first();
      }
    }
    if( NIL != mt )
    {
      if( NIL == hlmt.hlmt_equal( assertions_high.assertion_mt( assertion ), mt ) )
      {
        return NIL;
      }
      if( NIL != direction && !assertions_high.assertion_direction( assertion ).eql( direction ) )
      {
        return NIL;
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 21765L)
  public static SubLObject simple_key_unbound_rule_index(final SubLObject assertion, SubLObject accumulator, SubLObject sense, SubLObject mt)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL != matches_unbound_rule_index( assertion, sense, mt, UNPROVIDED ) )
    {
      if( NIL != sense )
      {
        if( NIL != mt )
        {
          final SubLObject item_var = assertions_high.assertion_direction( assertion );
          if( NIL == conses_high.member( item_var, accumulator, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            accumulator = ConsesLow.cons( item_var, accumulator );
          }
        }
        else
        {
          final SubLObject item_var = assertions_high.assertion_mt( assertion );
          if( NIL == conses_high.member( item_var, accumulator, $sym1$HLMT_EQUAL, Symbols.symbol_function( IDENTITY ) ) )
          {
            accumulator = ConsesLow.cons( item_var, accumulator );
          }
        }
      }
      else
      {
        SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
        SubLObject sense_$16 = NIL;
        sense_$16 = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != matches_unbound_rule_index( assertion, sense_$16, UNPROVIDED, UNPROVIDED ) )
          {
            final SubLObject item_var2 = sense_$16;
            if( NIL == conses_high.member( item_var2, accumulator, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              accumulator = ConsesLow.cons( item_var2, accumulator );
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          sense_$16 = cdolist_list_var.first();
        }
      }
    }
    return accumulator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 22256L)
  public static SubLObject matches_mt_index(final SubLObject assertion, final SubLObject mt)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    final SubLObject assertion_mt = assertions_high.assertion_mt( assertion );
    return makeBoolean( NIL != hlmt.hlmt_equal( assertion_mt, mt ) && NIL == kb_indexing.broad_mtP( hlmt.hlmt_monad_mt( mt ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 22546L)
  public static SubLObject matches_other_index(final SubLObject assertion, final SubLObject v_term)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL == list_utilities.tree_find( v_term, assertions_high.assertion_cnf( assertion ), Symbols.symbol_function( EQUAL ), UNPROVIDED ) && NIL == list_utilities.tree_find( v_term, assertions_high.assertion_mt(
        assertion ), Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
    {
      return NIL;
    }
    return makeBoolean( NIL == matches_gaf_arg_index( assertion, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL == matches_nart_arg_index( assertion, v_term, UNPROVIDED, UNPROVIDED )
        && NIL == matches_predicate_extent_index( assertion, v_term, UNPROVIDED ) && NIL == matches_function_extent_index( assertion, v_term ) && NIL == matches_predicate_rule_index( assertion, v_term, UNPROVIDED,
            UNPROVIDED, UNPROVIDED ) && NIL == matches_ist_predicate_rule_index( assertion, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL == matches_decontextualized_ist_predicate_rule_index( assertion, v_term,
                UNPROVIDED, UNPROVIDED ) && NIL == matches_isa_rule_index( assertion, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL == matches_genls_rule_index( assertion, v_term, UNPROVIDED, UNPROVIDED,
                    UNPROVIDED ) && NIL == matches_genl_mt_rule_index( assertion, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL == matches_function_rule_index( assertion, v_term, UNPROVIDED, UNPROVIDED )
        && NIL == matches_exception_rule_index( assertion, v_term, UNPROVIDED, UNPROVIDED ) && NIL == matches_pragma_rule_index( assertion, v_term, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 23776L)
  public static SubLObject add_simple_index(final SubLObject v_term, final SubLObject assertion)
  {
    final SubLObject old_index = kb_indexing_datastructures.simple_term_assertion_list( v_term );
    return add_simple_index_to_term_assertion_list( v_term, old_index, assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 24197L)
  public static SubLObject add_simple_index_to_term_assertion_list(final SubLObject v_term, final SubLObject old_index, final SubLObject assertion)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    final SubLObject new_index = conses_high.adjoin( assertion, old_index, UNPROVIDED, UNPROVIDED );
    if( !old_index.eql( new_index ) )
    {
      kb_indexing_datastructures.reset_term_simple_index( v_term, new_index );
      possibly_toggle_term_index_mode( v_term );
    }
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 24524L)
  public static SubLObject rem_simple_index(final SubLObject v_term, final SubLObject assertion)
  {
    final SubLObject old_index = kb_indexing_datastructures.simple_term_assertion_list( v_term );
    return rem_simple_index_from_term_assertion_list( v_term, old_index, assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 24704L)
  public static SubLObject rem_simple_index_from_term_assertion_list(final SubLObject v_term, final SubLObject old_index, final SubLObject assertion)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    final SubLObject new_index = list_utilities.delete_first( assertion, old_index, UNPROVIDED );
    if( !old_index.eql( new_index ) )
    {
      kb_indexing_datastructures.reset_term_simple_index( v_term, new_index );
    }
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 24994L)
  public static SubLObject assertion_property_match_p(final SubLObject assertion, SubLObject truth, SubLObject type, SubLObject direction)
  {
    if( truth == UNPROVIDED )
    {
      truth = NIL;
    }
    if( type == UNPROVIDED )
    {
      type = NIL;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    return makeBoolean( ( NIL == truth || NIL != assertions_high.assertion_has_truth( assertion, truth ) ) && ( NIL == type || NIL != assertions_high.assertion_has_type( assertion, type ) ) && ( NIL == direction
        || NIL != assertions_high.assertion_has_direction( assertion, direction ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 26630L)
  public static SubLObject noting_terms_to_toggle_indexing_mode(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym20$CLET, $list21, ConsesLow.append( body, $list22 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 26912L)
  public static SubLObject noting_terms_to_toggle_indexing_mode_internal()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var = $terms_to_toggle_indexing_mode$.getDynamicValue( thread );
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      toggle_term_index_mode( v_term );
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 27709L)
  public static SubLObject possibly_toggle_term_index_mode(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $within_noting_terms_to_toggle_indexing_mode$.getDynamicValue( thread ) )
    {
      final SubLObject total = kb_indexing.num_index( v_term );
      if( NIL != kb_indexing_datastructures.simple_indexed_term_p( v_term ) )
      {
        if( total.numGE( $index_convert_complex_threshold$.getDynamicValue( thread ) ) )
        {
          if( NIL == conses_high.member( v_term, $terms_to_toggle_indexing_mode$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            $terms_to_toggle_indexing_mode$.setDynamicValue( ConsesLow.cons( v_term, $terms_to_toggle_indexing_mode$.getDynamicValue( thread ) ), thread );
          }
          return T;
        }
      }
      else if( total.numLE( $index_convert_simple_threshold$.getDynamicValue( thread ) ) )
      {
        if( NIL == conses_high.member( v_term, $terms_to_toggle_indexing_mode$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          $terms_to_toggle_indexing_mode$.setDynamicValue( ConsesLow.cons( v_term, $terms_to_toggle_indexing_mode$.getDynamicValue( thread ) ), thread );
        }
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 28272L)
  public static SubLObject toggle_term_index_mode(final SubLObject v_term)
  {
    if( NIL != kb_indexing_datastructures.simple_indexed_term_p( v_term ) )
    {
      convert_to_complex_index( v_term );
    }
    else
    {
      convert_to_simple_index( v_term );
    }
    return v_term;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 28461L)
  public static SubLObject convert_to_complex_index(final SubLObject v_term)
  {
    final SubLObject assertions = Sequences.reverse( kb_indexing_datastructures.simple_term_assertion_list( v_term ) );
    kb_indexing_datastructures.initialize_term_complex_index( v_term );
    SubLObject cdolist_list_var = assertions;
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      kb_indexing.add_assertion_indices( assertion, v_term );
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return v_term;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 28967L)
  public static SubLObject convert_to_simple_index(final SubLObject v_term)
  {
    SubLObject assertions = kb_mapping.gather_index_in_any_mt( v_term, T );
    assertions = list_utilities.delete_if_not( Symbols.symbol_function( $sym26$VALID_ASSERTION ), assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    kb_indexing_datastructures.free_term_index( v_term );
    kb_indexing_datastructures.reset_term_simple_index( v_term, assertions );
    return v_term;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 29264L)
  public static SubLObject reconstruct_complex_index(final SubLObject v_term)
  {
    if( NIL == kb_indexing_datastructures.simple_indexed_term_p( v_term ) )
    {
      convert_to_simple_index( v_term );
      convert_to_complex_index( v_term );
      return v_term;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 29443L)
  public static SubLObject clean_kb_indexing()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject message = $str27$mapping_Cyc_FORTs;
    final SubLObject total = forts.fort_count();
    SubLObject sofar = ZERO_INTEGER;
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
        utilities_macros.noting_percent_progress_preamble( message );
        SubLObject cdolist_list_var = forts.do_forts_tables();
        SubLObject table_var = NIL;
        table_var = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject idx = table_var;
          if( NIL == id_index.id_index_objects_empty_p( idx, $kw28$SKIP ) )
          {
            final SubLObject idx_$17 = idx;
            if( NIL == id_index.id_index_dense_objects_empty_p( idx_$17, $kw28$SKIP ) )
            {
              final SubLObject vector_var = id_index.id_index_dense_objects( idx_$17 );
              final SubLObject backwardP_var = NIL;
              SubLObject length;
              SubLObject v_iteration;
              SubLObject id;
              SubLObject fort;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                fort = Vectors.aref( vector_var, id );
                if( NIL == id_index.id_index_tombstone_p( fort ) || NIL == id_index.id_index_skip_tombstones_p( $kw28$SKIP ) )
                {
                  if( NIL != id_index.id_index_tombstone_p( fort ) )
                  {
                    fort = $kw28$SKIP;
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                  clean_term_index( fort );
                }
              }
            }
            final SubLObject idx_$18 = idx;
            if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$18 ) || NIL == id_index.id_index_skip_tombstones_p( $kw28$SKIP ) )
            {
              final SubLObject sparse = id_index.id_index_sparse_objects( idx_$18 );
              SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$18 );
              final SubLObject end_id = id_index.id_index_next_id( idx_$18 );
              final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw28$SKIP ) ) ? NIL : $kw28$SKIP;
              while ( id2.numL( end_id ))
              {
                final SubLObject fort2 = Hashtables.gethash_without_values( id2, sparse, v_default );
                if( NIL == id_index.id_index_skip_tombstones_p( $kw28$SKIP ) || NIL == id_index.id_index_tombstone_p( fort2 ) )
                {
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                  clean_term_index( fort2 );
                }
                id2 = Numbers.add( id2, ONE_INTEGER );
              }
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          table_var = cdolist_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$19, thread );
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
    final SubLObject idx2 = assertion_handles.do_assertions_table();
    final SubLObject mess = $str29$mapping_Cyc_assertions;
    final SubLObject total2 = id_index.id_index_count( idx2 );
    SubLObject sofar2 = ZERO_INTEGER;
    assert NIL != Types.stringp( mess ) : mess;
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( mess );
        final SubLObject idx_$19 = idx2;
        if( NIL == id_index.id_index_objects_empty_p( idx_$19, $kw28$SKIP ) )
        {
          final SubLObject idx_$20 = idx_$19;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$20, $kw28$SKIP ) )
          {
            final SubLObject vector_var2 = id_index.id_index_dense_objects( idx_$20 );
            final SubLObject backwardP_var2 = NIL;
            SubLObject length2;
            SubLObject v_iteration2;
            SubLObject a_id;
            SubLObject a_handle;
            SubLObject assertion;
            for( length2 = Sequences.length( vector_var2 ), v_iteration2 = NIL, v_iteration2 = ZERO_INTEGER; v_iteration2.numL( length2 ); v_iteration2 = Numbers.add( v_iteration2, ONE_INTEGER ) )
            {
              a_id = ( ( NIL != backwardP_var2 ) ? Numbers.subtract( length2, v_iteration2, ONE_INTEGER ) : v_iteration2 );
              a_handle = Vectors.aref( vector_var2, a_id );
              if( NIL == id_index.id_index_tombstone_p( a_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw28$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( a_handle ) )
                {
                  a_handle = $kw28$SKIP;
                }
                assertion = assertion_handles.resolve_assertion_id_value_pair( a_id, a_handle );
                if( NIL != assertion_utilities.assertion_has_meta_assertionsP( assertion ) )
                {
                  clean_term_index( assertion );
                }
                sofar2 = Numbers.add( sofar2, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar2, total2 );
              }
            }
          }
          final SubLObject idx_$21 = idx_$19;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$21 ) || NIL == id_index.id_index_skip_tombstones_p( $kw28$SKIP ) )
          {
            final SubLObject sparse2 = id_index.id_index_sparse_objects( idx_$21 );
            SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$21 );
            final SubLObject end_id2 = id_index.id_index_next_id( idx_$21 );
            final SubLObject v_default2 = ( NIL != id_index.id_index_skip_tombstones_p( $kw28$SKIP ) ) ? NIL : $kw28$SKIP;
            while ( a_id2.numL( end_id2 ))
            {
              final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse2, v_default2 );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw28$SKIP ) || NIL == id_index.id_index_tombstone_p( a_handle2 ) )
              {
                final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair( a_id2, a_handle2 );
                if( NIL != assertion_utilities.assertion_has_meta_assertionsP( assertion2 ) )
                {
                  clean_term_index( assertion2 );
                }
                sofar2 = Numbers.add( sofar2, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar2, total2 );
              }
              a_id2 = Numbers.add( a_id2, ONE_INTEGER );
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
          final SubLObject _values2 = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$20, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 29774L)
  public static SubLObject clean_term_index(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != kb_indexing_datastructures.simple_indexed_term_p( v_term ) )
    {
      SubLObject index = kb_indexing_datastructures.simple_term_assertion_list( v_term );
      if( NIL != list_utilities.find_if_not( Symbols.symbol_function( $sym26$VALID_ASSERTION ), index, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        Errors.warn( $str31$invalid_index_under__S, v_term );
        index = list_utilities.delete_if_not( Symbols.symbol_function( $sym26$VALID_ASSERTION ), index, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        kb_indexing_datastructures.reset_term_simple_index( v_term, index );
      }
    }
    else
    {
      SubLObject invalid = NIL;
      try
      {
        thread.throwStack.push( $kw32$INVALID );
        kb_mapping.map_term( Symbols.symbol_function( $sym33$CLEAN_TERM_INDEX_INTERNAL ), v_term );
        invalid = NIL;
      }
      catch( final Throwable ccatch_env_var )
      {
        invalid = Errors.handleThrowable( ccatch_env_var, $kw32$INVALID );
      }
      finally
      {
        thread.throwStack.pop();
      }
      if( NIL != invalid )
      {
        convert_to_simple_index( v_term );
        clean_term_index( v_term );
        convert_to_complex_index( v_term );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 30401L)
  public static SubLObject clean_term_index_internal(final SubLObject assertion)
  {
    if( NIL == assertions_high.valid_assertion( assertion, UNPROVIDED ) )
    {
      Dynamic.sublisp_throw( $kw32$INVALID, T );
    }
    return NIL;
  }

  public static SubLObject declare_simple_indexing_file()
  {
    SubLFiles.declareFunction( me, "gaf_arg_index_simple_match_p", "GAF-ARG-INDEX-SIMPLE-MATCH-P", 2, 3, false );
    SubLFiles.declareFunction( me, "matches_gaf_arg_index", "MATCHES-GAF-ARG-INDEX", 2, 3, false );
    SubLFiles.declareFunction( me, "simple_key_gaf_arg_index", "SIMPLE-KEY-GAF-ARG-INDEX", 3, 2, false );
    SubLFiles.declareFunction( me, "matches_gaf_arg_index_internal", "MATCHES-GAF-ARG-INDEX-INTERNAL", 5, 0, false );
    SubLFiles.declareFunction( me, "simple_key_gaf_arg_index_internal", "SIMPLE-KEY-GAF-ARG-INDEX-INTERNAL", 5, 0, false );
    SubLFiles.declareFunction( me, "matches_nart_arg_index", "MATCHES-NART-ARG-INDEX", 2, 2, false );
    SubLFiles.declareFunction( me, "simple_key_nart_arg_index", "SIMPLE-KEY-NART-ARG-INDEX", 3, 2, false );
    SubLFiles.declareFunction( me, "matches_nart_arg_index_internal", "MATCHES-NART-ARG-INDEX-INTERNAL", 4, 0, false );
    SubLFiles.declareFunction( me, "simple_key_nart_arg_index_internal", "SIMPLE-KEY-NART-ARG-INDEX-INTERNAL", 5, 0, false );
    SubLFiles.declareFunction( me, "matches_predicate_extent_index", "MATCHES-PREDICATE-EXTENT-INDEX", 2, 1, false );
    SubLFiles.declareFunction( me, "simple_key_predicate_extent_index", "SIMPLE-KEY-PREDICATE-EXTENT-INDEX", 3, 0, false );
    SubLFiles.declareFunction( me, "matches_predicate_extent_index_internal", "MATCHES-PREDICATE-EXTENT-INDEX-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "matches_function_extent_index", "MATCHES-FUNCTION-EXTENT-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "matches_function_extent_index_internal", "MATCHES-FUNCTION-EXTENT-INDEX-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "matches_predicate_rule_index", "MATCHES-PREDICATE-RULE-INDEX", 2, 3, false );
    SubLFiles.declareFunction( me, "simple_key_predicate_rule_index", "SIMPLE-KEY-PREDICATE-RULE-INDEX", 3, 2, false );
    SubLFiles.declareFunction( me, "matches_predicate_rule_index_test", "MATCHES-PREDICATE-RULE-INDEX-TEST", 2, 0, false );
    SubLFiles.declareFunction( me, "matches_ist_predicate_rule_index", "MATCHES-IST-PREDICATE-RULE-INDEX", 2, 3, false );
    SubLFiles.declareFunction( me, "simple_key_ist_predicate_rule_index", "SIMPLE-KEY-IST-PREDICATE-RULE-INDEX", 3, 2, false );
    SubLFiles.declareFunction( me, "matches_ist_predicate_rule_index_test", "MATCHES-IST-PREDICATE-RULE-INDEX-TEST", 2, 0, false );
    SubLFiles.declareFunction( me, "matches_decontextualized_ist_predicate_rule_index", "MATCHES-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX", 2, 2, false );
    SubLFiles.declareFunction( me, "simple_key_decontextualized_ist_predicate_rule_index", "SIMPLE-KEY-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX", 3, 1, false );
    SubLFiles.declareFunction( me, "matches_decontextualized_ist_predicate_rule_index_test", "MATCHES-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-TEST", 2, 0, false );
    SubLFiles.declareFunction( me, "matches_isa_rule_index", "MATCHES-ISA-RULE-INDEX", 2, 3, false );
    SubLFiles.declareFunction( me, "simple_key_isa_rule_index", "SIMPLE-KEY-ISA-RULE-INDEX", 3, 2, false );
    SubLFiles.declareFunction( me, "matches_isa_rule_index_test", "MATCHES-ISA-RULE-INDEX-TEST", 2, 0, false );
    SubLFiles.declareFunction( me, "matches_quoted_isa_rule_index", "MATCHES-QUOTED-ISA-RULE-INDEX", 2, 3, false );
    SubLFiles.declareFunction( me, "simple_key_quoted_isa_rule_index", "SIMPLE-KEY-QUOTED-ISA-RULE-INDEX", 3, 2, false );
    SubLFiles.declareFunction( me, "matches_quoted_isa_rule_index_test", "MATCHES-QUOTED-ISA-RULE-INDEX-TEST", 2, 0, false );
    SubLFiles.declareFunction( me, "matches_genls_rule_index", "MATCHES-GENLS-RULE-INDEX", 2, 3, false );
    SubLFiles.declareFunction( me, "simple_key_genls_rule_index", "SIMPLE-KEY-GENLS-RULE-INDEX", 3, 2, false );
    SubLFiles.declareFunction( me, "matches_genls_rule_index_test", "MATCHES-GENLS-RULE-INDEX-TEST", 2, 0, false );
    SubLFiles.declareFunction( me, "matches_genl_mt_rule_index", "MATCHES-GENL-MT-RULE-INDEX", 2, 3, false );
    SubLFiles.declareFunction( me, "simple_key_genl_mt_rule_index", "SIMPLE-KEY-GENL-MT-RULE-INDEX", 3, 2, false );
    SubLFiles.declareFunction( me, "matches_genl_mt_rule_index_test", "MATCHES-GENL-MT-RULE-INDEX-TEST", 2, 0, false );
    SubLFiles.declareFunction( me, "matches_function_rule_index", "MATCHES-FUNCTION-RULE-INDEX", 2, 2, false );
    SubLFiles.declareFunction( me, "simple_key_function_rule_index", "SIMPLE-KEY-FUNCTION-RULE-INDEX", 3, 1, false );
    SubLFiles.declareFunction( me, "matches_function_rule_index_test", "MATCHES-FUNCTION-RULE-INDEX-TEST", 2, 0, false );
    SubLFiles.declareFunction( me, "matches_exception_rule_index", "MATCHES-EXCEPTION-RULE-INDEX", 2, 2, false );
    SubLFiles.declareFunction( me, "simple_key_exception_rule_index", "SIMPLE-KEY-EXCEPTION-RULE-INDEX", 3, 1, false );
    SubLFiles.declareFunction( me, "matches_exception_rule_index_test", "MATCHES-EXCEPTION-RULE-INDEX-TEST", 2, 0, false );
    SubLFiles.declareFunction( me, "matches_pragma_rule_index", "MATCHES-PRAGMA-RULE-INDEX", 2, 2, false );
    SubLFiles.declareFunction( me, "simple_key_pragma_rule_index", "SIMPLE-KEY-PRAGMA-RULE-INDEX", 3, 1, false );
    SubLFiles.declareFunction( me, "matches_pragma_rule_index_test", "MATCHES-PRAGMA-RULE-INDEX-TEST", 2, 0, false );
    new $matches_pragma_rule_index_test$BinaryFunction();
    SubLFiles.declareFunction( me, "matches_unbound_rule_index", "MATCHES-UNBOUND-RULE-INDEX", 1, 3, false );
    SubLFiles.declareFunction( me, "simple_key_unbound_rule_index", "SIMPLE-KEY-UNBOUND-RULE-INDEX", 2, 2, false );
    SubLFiles.declareFunction( me, "matches_mt_index", "MATCHES-MT-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "matches_other_index", "MATCHES-OTHER-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "add_simple_index", "ADD-SIMPLE-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "add_simple_index_to_term_assertion_list", "ADD-SIMPLE-INDEX-TO-TERM-ASSERTION-LIST", 3, 0, false );
    SubLFiles.declareFunction( me, "rem_simple_index", "REM-SIMPLE-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "rem_simple_index_from_term_assertion_list", "REM-SIMPLE-INDEX-FROM-TERM-ASSERTION-LIST", 3, 0, false );
    SubLFiles.declareFunction( me, "assertion_property_match_p", "ASSERTION-PROPERTY-MATCH-P", 1, 3, false );
    SubLFiles.declareMacro( me, "noting_terms_to_toggle_indexing_mode", "NOTING-TERMS-TO-TOGGLE-INDEXING-MODE" );
    SubLFiles.declareFunction( me, "noting_terms_to_toggle_indexing_mode_internal", "NOTING-TERMS-TO-TOGGLE-INDEXING-MODE-INTERNAL", 0, 0, false );
    SubLFiles.declareFunction( me, "possibly_toggle_term_index_mode", "POSSIBLY-TOGGLE-TERM-INDEX-MODE", 1, 0, false );
    SubLFiles.declareFunction( me, "toggle_term_index_mode", "TOGGLE-TERM-INDEX-MODE", 1, 0, false );
    SubLFiles.declareFunction( me, "convert_to_complex_index", "CONVERT-TO-COMPLEX-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "convert_to_simple_index", "CONVERT-TO-SIMPLE-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "reconstruct_complex_index", "RECONSTRUCT-COMPLEX-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "clean_kb_indexing", "CLEAN-KB-INDEXING", 0, 0, false );
    SubLFiles.declareFunction( me, "clean_term_index", "CLEAN-TERM-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "clean_term_index_internal", "CLEAN-TERM-INDEX-INTERNAL", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_simple_indexing_file()
  {
    $within_noting_terms_to_toggle_indexing_mode$ = SubLFiles.defparameter( "*WITHIN-NOTING-TERMS-TO-TOGGLE-INDEXING-MODE*", NIL );
    $terms_to_toggle_indexing_mode$ = SubLFiles.defparameter( "*TERMS-TO-TOGGLE-INDEXING-MODE*", NIL );
    $index_convert_threshold$ = SubLFiles.defparameter( "*INDEX-CONVERT-THRESHOLD*", TWENTY_INTEGER );
    $index_convert_range$ = SubLFiles.defparameter( "*INDEX-CONVERT-RANGE*", FOUR_INTEGER );
    $index_convert_complex_threshold$ = SubLFiles.defparameter( "*INDEX-CONVERT-COMPLEX-THRESHOLD*", Numbers.add( $index_convert_threshold$.getDynamicValue(), Numbers.integerDivide( $index_convert_range$
        .getDynamicValue(), TWO_INTEGER ) ) );
    $index_convert_simple_threshold$ = SubLFiles.defparameter( "*INDEX-CONVERT-SIMPLE-THRESHOLD*", Numbers.subtract( $index_convert_threshold$.getDynamicValue(), Numbers.integerDivide( $index_convert_range$
        .getDynamicValue(), TWO_INTEGER ) ) );
    return NIL;
  }

  public static SubLObject setup_simple_indexing_file()
  {
    access_macros.register_macro_helper( $sym23$NOTING_TERMS_TO_TOGGLE_INDEXING_MODE_INTERNAL, $sym24$NOTING_TERMS_TO_TOGGLE_INDEXING_MODE );
    access_macros.register_macro_helper( $sym25$POSSIBLY_TOGGLE_TERM_INDEX_MODE, $sym24$NOTING_TERMS_TO_TOGGLE_INDEXING_MODE );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_simple_indexing_file();
  }

  @Override
  public void initializeVariables()
  {
    init_simple_indexing_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_simple_indexing_file();
  }
  static
  {
    me = new simple_indexing();
    $within_noting_terms_to_toggle_indexing_mode$ = null;
    $terms_to_toggle_indexing_mode$ = null;
    $index_convert_threshold$ = null;
    $index_convert_range$ = null;
    $index_convert_complex_threshold$ = null;
    $index_convert_simple_threshold$ = null;
    $sym0$ASSERTION_P = makeSymbol( "ASSERTION-P" );
    $sym1$HLMT_EQUAL = makeSymbol( "HLMT-EQUAL" );
    $const2$termOfUnit = constant_handles.reader_make_constant_shell( makeString( "termOfUnit" ) );
    $kw3$POS = makeKeyword( "POS" );
    $sym4$MATCHES_PREDICATE_RULE_INDEX_TEST = makeSymbol( "MATCHES-PREDICATE-RULE-INDEX-TEST" );
    $sym5$MATCHES_IST_PREDICATE_RULE_INDEX_TEST = makeSymbol( "MATCHES-IST-PREDICATE-RULE-INDEX-TEST" );
    $sym6$MATCHES_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX_TEST = makeSymbol( "MATCHES-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-TEST" );
    $sym7$MATCHES_ISA_RULE_INDEX_TEST = makeSymbol( "MATCHES-ISA-RULE-INDEX-TEST" );
    $const8$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $sym9$MATCHES_QUOTED_ISA_RULE_INDEX_TEST = makeSymbol( "MATCHES-QUOTED-ISA-RULE-INDEX-TEST" );
    $const10$quotedIsa = constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) );
    $sym11$MATCHES_GENLS_RULE_INDEX_TEST = makeSymbol( "MATCHES-GENLS-RULE-INDEX-TEST" );
    $const12$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $sym13$MATCHES_GENL_MT_RULE_INDEX_TEST = makeSymbol( "MATCHES-GENL-MT-RULE-INDEX-TEST" );
    $const14$genlMt = constant_handles.reader_make_constant_shell( makeString( "genlMt" ) );
    $sym15$MATCHES_FUNCTION_RULE_INDEX_TEST = makeSymbol( "MATCHES-FUNCTION-RULE-INDEX-TEST" );
    $sym16$MATCHES_EXCEPTION_RULE_INDEX_TEST = makeSymbol( "MATCHES-EXCEPTION-RULE-INDEX-TEST" );
    $const17$abnormal = constant_handles.reader_make_constant_shell( makeString( "abnormal" ) );
    $sym18$MATCHES_PRAGMA_RULE_INDEX_TEST = makeSymbol( "MATCHES-PRAGMA-RULE-INDEX-TEST" );
    $const19$meetsPragmaticRequirement = constant_handles.reader_make_constant_shell( makeString( "meetsPragmaticRequirement" ) );
    $sym20$CLET = makeSymbol( "CLET" );
    $list21 = ConsesLow.list( ConsesLow.list( makeSymbol( "*WITHIN-NOTING-TERMS-TO-TOGGLE-INDEXING-MODE*" ), T ), ConsesLow.list( makeSymbol( "*TERMS-TO-TOGGLE-INDEXING-MODE*" ), NIL ) );
    $list22 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "*TERMS-TO-TOGGLE-INDEXING-MODE*" ), ConsesLow.list( makeSymbol( "NOTING-TERMS-TO-TOGGLE-INDEXING-MODE-INTERNAL" ) ) ) );
    $sym23$NOTING_TERMS_TO_TOGGLE_INDEXING_MODE_INTERNAL = makeSymbol( "NOTING-TERMS-TO-TOGGLE-INDEXING-MODE-INTERNAL" );
    $sym24$NOTING_TERMS_TO_TOGGLE_INDEXING_MODE = makeSymbol( "NOTING-TERMS-TO-TOGGLE-INDEXING-MODE" );
    $sym25$POSSIBLY_TOGGLE_TERM_INDEX_MODE = makeSymbol( "POSSIBLY-TOGGLE-TERM-INDEX-MODE" );
    $sym26$VALID_ASSERTION = makeSymbol( "VALID-ASSERTION" );
    $str27$mapping_Cyc_FORTs = makeString( "mapping Cyc FORTs" );
    $kw28$SKIP = makeKeyword( "SKIP" );
    $str29$mapping_Cyc_assertions = makeString( "mapping Cyc assertions" );
    $sym30$STRINGP = makeSymbol( "STRINGP" );
    $str31$invalid_index_under__S = makeString( "invalid index under ~S" );
    $kw32$INVALID = makeKeyword( "INVALID" );
    $sym33$CLEAN_TERM_INDEX_INTERNAL = makeSymbol( "CLEAN-TERM-INDEX-INTERNAL" );
  }

  public static final class $matches_pragma_rule_index_test$BinaryFunction
      extends
        BinaryFunction
  {
    public $matches_pragma_rule_index_test$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "MATCHES-PRAGMA-RULE-INDEX-TEST" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return matches_pragma_rule_index_test( arg1, arg2 );
    }
  }
}
/*
 * 
 * Total time: 471 ms
 * 
 */