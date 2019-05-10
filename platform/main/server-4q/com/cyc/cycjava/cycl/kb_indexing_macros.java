package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_indexing_macros
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.kb_indexing_macros";
  public static final String myFingerPrint = "69229065429c80d66beaac88df5c91ed11ad4af0f9e68f45fed06149277dfee1";
  private static final SubLList $list0;
  private static final SubLSymbol $kw1$SIMPLE_MATCH_FUNCTION;
  private static final SubLSymbol $kw2$GET_SUBINDEX_FUNCTION;
  private static final SubLSymbol $sym3$COUNT;
  private static final SubLSymbol $sym4$ASS;
  private static final SubLSymbol $sym5$PIF;
  private static final SubLSymbol $sym6$SIMPLE_INDEXED_TERM_P;
  private static final SubLSymbol $sym7$CLET;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$DO_SIMPLE_INDEX;
  private static final SubLSymbol $sym10$PWHEN;
  private static final SubLSymbol $sym11$CINC;
  private static final SubLSymbol $sym12$CSETQ;
  private static final SubLSymbol $sym13$SUBINDEX;
  private static final SubLList $list14;
  private static final SubLSymbol $sym15$SET_RELEVANT_SIMPLE_INDEX_COUNT;
  private static final SubLSymbol $sym16$SET_RELEVANT_NUM_ARBITRARY_INDEX;
  private static final SubLList $list17;
  private static final SubLSymbol $sym18$ASS;
  private static final SubLList $list19;
  private static final SubLSymbol $sym20$SET_RELEVANT_COMPLEX_INDEX_COUNT;
  private static final SubLSymbol $kw21$KEY_FUNCTION;
  private static final SubLSymbol $kw22$RELEVANT_NUM_FUNCTION;
  private static final SubLString $str23$SET_RELEVANT_COMPLEX_INDEX_COUNT_;
  private static final SubLString $str24$SET_RELEVANT_COMPLEX_INDEX_COUNT_;
  private static final SubLSymbol $sym25$GOOD_KEY_COUNT;
  private static final SubLSymbol $sym26$GOOD_KEYS;
  private static final SubLSymbol $sym27$MT_SUBINDEX;
  private static final SubLSymbol $sym28$NEXT_LEVEL_KEYS;
  private static final SubLSymbol $sym29$NEXT_KEY;
  private static final SubLSymbol $sym30$NUMBER_OF_NON_NULL_ARGS_IN_ORDER;
  private static final SubLSymbol $sym31$_;
  private static final SubLSymbol $sym32$_;
  private static final SubLList $list33;
  private static final SubLSymbol $sym34$RELEVANT_MT_SUBINDEX_COUNT;
  private static final SubLSymbol $sym35$LIST_OF_FIRST_N_ARGS;
  private static final SubLSymbol $sym36$APPLY;
  private static final SubLSymbol $sym37$QUOTE;
  private static final SubLSymbol $sym38$CDOLIST;
  private static final SubLSymbol $sym39$APPEND;
  private static final SubLSymbol $sym40$LIST;
  private static final SubLSymbol $kw41$NUM_FUNCTION;
  private static final SubLList $list42;
  private static final SubLSymbol $sym43$SET_RELEVANT_SIMPLE_INDEX_COUNT_WITH_CUTOFF;
  private static final SubLList $list44;
  private static final SubLSymbol $sym45$PUNLESS;
  private static final SubLSymbol $sym46$NUMBER_HAS_REACHED_CUTOFF_;
  private static final SubLSymbol $sym47$SET_RELEVANT_COMPLEX_INDEX_COUNT_WITH_CUTOFF;
  private static final SubLList $list48;
  private static final SubLSymbol $kw49$RELEVANT_NUM_FUNCTION_WITH_CUTOFF;
  private static final SubLString $str50$SET_RELEVANT_COMPLEX_INDEX_COUNT_;
  private static final SubLString $str51$SET_RELEVANT_COMPLEX_INDEX_COUNT_;
  private static final SubLSymbol $sym52$GOOD_KEY_COUNT;
  private static final SubLSymbol $sym53$GOOD_KEYS;
  private static final SubLSymbol $sym54$MT_SUBINDEX;
  private static final SubLSymbol $sym55$NEXT_LEVEL_KEYS;
  private static final SubLSymbol $sym56$NEXT_KEY;
  private static final SubLSymbol $sym57$RELEVANT_MT_SUBINDEX_COUNT_WITH_CUTOFF;
  private static final SubLSymbol $sym58$PROGN;
  private static final SubLSymbol $kw59$SIMPLE_KEY_FUNCTION;
  private static final SubLSymbol $sym60$KEYS_ACCUM;
  private static final SubLSymbol $sym61$ASS;
  private static final SubLList $list62;
  private static final SubLSymbol $sym63$NEXT_LEVEL_SUBINDEX;
  private static final SubLList $list64;
  private static final SubLSymbol $sym65$SET_RELEVANT_KEY_SIMPLE_INDEX;
  private static final SubLSymbol $sym66$SET_RELEVANT_KEY_ARBITRARY_INDEX;
  private static final SubLSymbol $sym67$KEYS_ACCUM;
  private static final SubLSymbol $sym68$ASS;
  private static final SubLSymbol $sym69$RELEVANT_MT_;
  private static final SubLSymbol $sym70$ASSERTION_MT;
  private static final SubLSymbol $sym71$SET_RELEVANT_KEY_COMPLEX_INDEX;
  private static final SubLSymbol $sym72$GOOD_KEY_COUNT;
  private static final SubLSymbol $sym73$GOOD_KEYS;
  private static final SubLSymbol $sym74$MT_SUBINDEX;
  private static final SubLSymbol $sym75$NEXT_LEVEL_KEYS;
  private static final SubLSymbol $sym76$NEXT_KEY;
  private static final SubLSymbol $sym77$RELEVANT_MT_SUBINDEX_KEYS;
  private static final SubLSymbol $sym78$PLUSP;
  private static final SubLSymbol $sym79$CPUSH;
  private static final SubLSymbol $sym80$MT_KEY_LEVEL;
  private static final SubLSymbol $kw81$KEYS;
  private static final SubLSymbol $kw82$MT_;
  private static final SubLList $list83;
  private static final SubLList $list84;
  private static final SubLSymbol $kw85$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw86$DONE;
  private static final SubLSymbol $sym87$DO_INTERMEDIATE_INDEX;
  private static final SubLSymbol $sym88$TERM_GAF_ARG_INDEX;
  private static final SubLSymbol $sym89$VALID_GAF_ARG_INDEX_KEY_;
  private static final SubLList $list90;
  private static final SubLSymbol $sym91$SUBINDEX;
  private static final SubLSymbol $sym92$DO_GAF_ARG_INDICES;
  private static final SubLSymbol $sym93$IGNORE;
  private static final SubLSymbol $kw94$GAF_ARG;
  private static final SubLSymbol $sym95$TERM_NART_ARG_INDEX;
  private static final SubLSymbol $sym96$VALID_NART_ARG_INDEX_KEY_;
  private static final SubLSymbol $sym97$SUBINDEX;
  private static final SubLSymbol $sym98$DO_NART_ARG_INDICES;
  private static final SubLSymbol $kw99$NART_ARG;
  private static final SubLList $list100;
  private static final SubLSymbol $sym101$TERM_PREDICATE_RULE_INDEX;
  private static final SubLSymbol $sym102$VALID_PREDICATE_RULE_INDEX_KEY_;
  private static final SubLList $list103;
  private static final SubLSymbol $sym104$SUBINDEX;
  private static final SubLSymbol $sym105$DO_PREDICATE_RULE_INDICES;
  private static final SubLSymbol $kw106$PREDICATE_RULE;
  private static final SubLSymbol $sym107$TERM_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX;
  private static final SubLSymbol $sym108$SUBINDEX;
  private static final SubLSymbol $sym109$DO_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDICES;
  private static final SubLSymbol $kw110$DECONTEXTUALIZED_IST_PREDICATE_RULE;
  private static final SubLSymbol $sym111$VALID_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX_KEY_;
  private static final SubLList $list112;
  private static final SubLSymbol $sym113$TERM_ISA_RULE_INDEX;
  private static final SubLSymbol $sym114$VALID_ISA_RULE_INDEX_KEY_;
  private static final SubLList $list115;
  private static final SubLSymbol $sym116$SUBINDEX;
  private static final SubLSymbol $sym117$DO_ISA_RULE_INDICES;
  private static final SubLSymbol $kw118$ISA_RULE;
  private static final SubLSymbol $sym119$TERM_GENLS_RULE_INDEX;
  private static final SubLSymbol $sym120$VALID_GENLS_RULE_INDEX_KEY_;
  private static final SubLSymbol $sym121$SUBINDEX;
  private static final SubLSymbol $sym122$DO_GENLS_RULE_INDICES;
  private static final SubLSymbol $kw123$GENLS_RULE;
  private static final SubLSymbol $sym124$TERM_GENL_MT_RULE_INDEX;
  private static final SubLSymbol $sym125$VALID_GENL_MT_RULE_INDEX_KEY_;
  private static final SubLSymbol $sym126$SUBINDEX;
  private static final SubLSymbol $sym127$DO_GENL_MT_RULE_INDICES;
  private static final SubLSymbol $kw128$GENL_MT_RULE;

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 522L)
  public static SubLObject set_num_arbitrary_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject result = NIL;
    SubLObject index = NIL;
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    result = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    index = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    v_term = current.first();
    final SubLObject keys;
    current = ( keys = current.rest() );
    final SubLObject simple_match_function = kb_indexing_declarations.get_index_prop( index, $kw1$SIMPLE_MATCH_FUNCTION );
    final SubLObject get_subindex_function = kb_indexing_declarations.get_index_prop( index, $kw2$GET_SUBINDEX_FUNCTION );
    final SubLObject count = $sym3$COUNT;
    final SubLObject ass = $sym4$ASS;
    return ConsesLow.list( $sym5$PIF, ConsesLow.list( $sym6$SIMPLE_INDEXED_TERM_P, v_term ), ConsesLow.list( $sym7$CLET, ConsesLow.list( reader.bq_cons( count, $list8 ) ), ConsesLow.list( $sym9$DO_SIMPLE_INDEX, ConsesLow
        .list( ass, v_term ), ConsesLow.list( $sym10$PWHEN, ConsesLow.listS( simple_match_function, ass, v_term, ConsesLow.append( keys, NIL ) ), ConsesLow.list( $sym11$CINC, count ) ) ), ConsesLow.list( $sym12$CSETQ,
            result, count ) ), ConsesLow.list( $sym7$CLET, ConsesLow.list( ConsesLow.list( $sym13$SUBINDEX, ConsesLow.listS( get_subindex_function, v_term, ConsesLow.append( keys, NIL ) ) ) ), ConsesLow.listS(
                $sym12$CSETQ, result, $list14 ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 1483L)
  public static SubLObject set_relevant_simple_index_count(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject count_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list17 );
    count_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list17 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject function = NIL;
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list17 );
    function = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list17 );
    v_term = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    current = temp;
    if( NIL == current )
    {
      return ConsesLow.list( $sym9$DO_SIMPLE_INDEX, ConsesLow.list( $sym18$ASS, v_term ), ConsesLow.list( $sym10$PWHEN, ConsesLow.listS( function, $sym18$ASS, v_term, ConsesLow.append( args, NIL ) ), ConsesLow.list(
          $sym10$PWHEN, $list19, ConsesLow.list( $sym11$CINC, count_var ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list17 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 2014L)
  public static SubLObject set_relevant_complex_index_count(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject result = NIL;
    SubLObject index = NIL;
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    result = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    index = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    v_term = current.first();
    final SubLObject keys;
    current = ( keys = current.rest() );
    final SubLObject get_subindex_function = kb_indexing_declarations.get_index_prop( index, $kw2$GET_SUBINDEX_FUNCTION );
    final SubLObject key_function = kb_indexing_declarations.get_index_prop( index, $kw21$KEY_FUNCTION );
    final SubLObject relevant_num_function = kb_indexing_declarations.get_index_prop( index, $kw22$RELEVANT_NUM_FUNCTION );
    final SubLObject mt_key_level = mt_key_level( index );
    if( !mt_key_level.isInteger() )
    {
      Errors.error( $str23$SET_RELEVANT_COMPLEX_INDEX_COUNT_, index );
    }
    if( number_of_non_null_args_in_order( keys, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ).numGE( mt_key_level ) )
    {
      Errors.error( $str24$SET_RELEVANT_COMPLEX_INDEX_COUNT_ );
    }
    final SubLObject good_key_count = $sym25$GOOD_KEY_COUNT;
    final SubLObject good_keys = $sym26$GOOD_KEYS;
    final SubLObject mt_subindex = $sym27$MT_SUBINDEX;
    final SubLObject next_level_keys = $sym28$NEXT_LEVEL_KEYS;
    final SubLObject next_key = $sym29$NEXT_KEY;
    return ConsesLow.list( $sym7$CLET, ConsesLow.list( ConsesLow.list( good_key_count, reader.bq_cons( $sym30$NUMBER_OF_NON_NULL_ARGS_IN_ORDER, ConsesLow.append( keys, NIL ) ) ) ), ConsesLow.list( $sym5$PIF, ConsesLow
        .list( $sym31$_, good_key_count, ConsesLow.listS( $sym32$_, mt_key_level, $list33 ) ), ConsesLow.list( $sym7$CLET, ConsesLow.list( ConsesLow.list( mt_subindex, ConsesLow.listS( get_subindex_function, v_term,
            ConsesLow.append( keys, NIL ) ) ) ), ConsesLow.list( $sym10$PWHEN, mt_subindex, ConsesLow.list( $sym12$CSETQ, result, ConsesLow.list( $sym34$RELEVANT_MT_SUBINDEX_COUNT, mt_subindex ) ) ) ), ConsesLow.list(
                $sym7$CLET, ConsesLow.list( ConsesLow.list( good_keys, ConsesLow.listS( $sym35$LIST_OF_FIRST_N_ARGS, good_key_count, ConsesLow.append( keys, NIL ) ) ), ConsesLow.list( next_level_keys, ConsesLow.list(
                    $sym36$APPLY, ConsesLow.list( $sym37$QUOTE, key_function ), v_term, good_keys ) ) ), ConsesLow.list( $sym38$CDOLIST, ConsesLow.list( next_key, next_level_keys ), ConsesLow.list( $sym11$CINC, result,
                        ConsesLow.list( $sym36$APPLY, ConsesLow.list( $sym37$QUOTE, relevant_num_function ), v_term, ConsesLow.list( $sym39$APPEND, good_keys, ConsesLow.list( $sym40$LIST, next_key ) ) ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 3609L)
  public static SubLObject set_relevant_num_arbitrary_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject result = NIL;
    SubLObject index = NIL;
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    result = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    index = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    v_term = current.first();
    final SubLObject keys;
    current = ( keys = current.rest() );
    final SubLObject simple_match_function = kb_indexing_declarations.get_index_prop( index, $kw1$SIMPLE_MATCH_FUNCTION );
    final SubLObject num_function = kb_indexing_declarations.get_index_prop( index, $kw41$NUM_FUNCTION );
    return ConsesLow.list( $sym5$PIF, $list42, ConsesLow.list( $sym12$CSETQ, result, ConsesLow.listS( num_function, v_term, ConsesLow.append( keys, NIL ) ) ), ConsesLow.list( $sym5$PIF, ConsesLow.list(
        $sym6$SIMPLE_INDEXED_TERM_P, v_term ), ConsesLow.list( $sym15$SET_RELEVANT_SIMPLE_INDEX_COUNT, result, ConsesLow.listS( simple_match_function, v_term, ConsesLow.append( keys, NIL ) ) ), ConsesLow.listS(
            $sym20$SET_RELEVANT_COMPLEX_INDEX_COUNT, result, index, v_term, ConsesLow.append( keys, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 4224L)
  public static SubLObject number_has_reached_cutoffP(final SubLObject number, final SubLObject cutoff)
  {
    return Numbers.numGE( number, cutoff );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 4343L)
  public static SubLObject set_relevant_simple_index_count_with_cutoff(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject count_var = NIL;
    SubLObject cutoff = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
    count_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
    cutoff = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject function = NIL;
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
    function = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
    v_term = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    current = temp;
    if( NIL == current )
    {
      return ConsesLow.list( $sym9$DO_SIMPLE_INDEX, ConsesLow.list( $sym18$ASS, v_term ), ConsesLow.list( $sym45$PUNLESS, ConsesLow.list( $sym46$NUMBER_HAS_REACHED_CUTOFF_, count_var, cutoff ), ConsesLow.list(
          $sym10$PWHEN, ConsesLow.listS( function, $sym18$ASS, v_term, ConsesLow.append( args, NIL ) ), ConsesLow.list( $sym10$PWHEN, $list19, ConsesLow.list( $sym11$CINC, count_var ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list44 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 5056L)
  public static SubLObject set_relevant_complex_index_count_with_cutoff(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject result = NIL;
    SubLObject cutoff = NIL;
    SubLObject index = NIL;
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list48 );
    result = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list48 );
    cutoff = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list48 );
    index = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list48 );
    v_term = current.first();
    final SubLObject keys;
    current = ( keys = current.rest() );
    final SubLObject get_subindex_function = kb_indexing_declarations.get_index_prop( index, $kw2$GET_SUBINDEX_FUNCTION );
    final SubLObject key_function = kb_indexing_declarations.get_index_prop( index, $kw21$KEY_FUNCTION );
    final SubLObject relevant_num_function_with_cutoff = kb_indexing_declarations.get_index_prop( index, $kw49$RELEVANT_NUM_FUNCTION_WITH_CUTOFF );
    final SubLObject mt_key_level = mt_key_level( index );
    if( !mt_key_level.isInteger() )
    {
      Errors.error( $str50$SET_RELEVANT_COMPLEX_INDEX_COUNT_, index );
    }
    if( number_of_non_null_args_in_order( keys, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ).numGE( mt_key_level ) )
    {
      Errors.error( $str51$SET_RELEVANT_COMPLEX_INDEX_COUNT_ );
    }
    final SubLObject good_key_count = $sym52$GOOD_KEY_COUNT;
    final SubLObject good_keys = $sym53$GOOD_KEYS;
    final SubLObject mt_subindex = $sym54$MT_SUBINDEX;
    final SubLObject next_level_keys = $sym55$NEXT_LEVEL_KEYS;
    final SubLObject next_key = $sym56$NEXT_KEY;
    return ConsesLow.list( $sym7$CLET, ConsesLow.list( ConsesLow.list( good_key_count, reader.bq_cons( $sym30$NUMBER_OF_NON_NULL_ARGS_IN_ORDER, ConsesLow.append( keys, NIL ) ) ) ), ConsesLow.list( $sym5$PIF, ConsesLow
        .list( $sym31$_, good_key_count, ConsesLow.listS( $sym32$_, mt_key_level, $list33 ) ), ConsesLow.list( $sym7$CLET, ConsesLow.list( ConsesLow.list( mt_subindex, ConsesLow.listS( get_subindex_function, v_term,
            ConsesLow.append( keys, NIL ) ) ) ), ConsesLow.list( $sym10$PWHEN, mt_subindex, ConsesLow.list( $sym12$CSETQ, result, ConsesLow.list( $sym57$RELEVANT_MT_SUBINDEX_COUNT_WITH_CUTOFF, mt_subindex,
                cutoff ) ) ) ), ConsesLow.list( $sym7$CLET, ConsesLow.list( ConsesLow.list( good_keys, ConsesLow.listS( $sym35$LIST_OF_FIRST_N_ARGS, good_key_count, ConsesLow.append( keys, NIL ) ) ), ConsesLow.list(
                    next_level_keys, ConsesLow.list( $sym36$APPLY, ConsesLow.list( $sym37$QUOTE, key_function ), v_term, good_keys ) ) ), ConsesLow.list( $sym38$CDOLIST, ConsesLow.list( next_key, next_level_keys ),
                        ConsesLow.list( $sym11$CINC, result, ConsesLow.list( $sym36$APPLY, ConsesLow.list( $sym37$QUOTE, relevant_num_function_with_cutoff ), v_term, cutoff, ConsesLow.list( $sym39$APPEND, good_keys,
                            ConsesLow.list( $sym40$LIST, next_key ) ) ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 6878L)
  public static SubLObject set_relevant_num_arbitrary_index_with_cutoff(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject result = NIL;
    SubLObject cutoff = NIL;
    SubLObject index = NIL;
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list48 );
    result = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list48 );
    cutoff = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list48 );
    index = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list48 );
    v_term = current.first();
    final SubLObject keys;
    current = ( keys = current.rest() );
    final SubLObject simple_match_function = kb_indexing_declarations.get_index_prop( index, $kw1$SIMPLE_MATCH_FUNCTION );
    final SubLObject num_function = kb_indexing_declarations.get_index_prop( index, $kw41$NUM_FUNCTION );
    return ConsesLow.list( $sym5$PIF, $list42, ConsesLow.list( $sym58$PROGN, ConsesLow.list( $sym12$CSETQ, result, ConsesLow.listS( num_function, v_term, ConsesLow.append( keys, NIL ) ) ), ConsesLow.list( $sym10$PWHEN,
        ConsesLow.list( $sym46$NUMBER_HAS_REACHED_CUTOFF_, result, cutoff ), ConsesLow.list( $sym12$CSETQ, result, cutoff ) ) ), ConsesLow.list( $sym5$PIF, ConsesLow.list( $sym6$SIMPLE_INDEXED_TERM_P, v_term ), ConsesLow
            .list( $sym43$SET_RELEVANT_SIMPLE_INDEX_COUNT_WITH_CUTOFF, result, cutoff, ConsesLow.listS( simple_match_function, v_term, ConsesLow.append( keys, NIL ) ) ), ConsesLow.listS(
                $sym47$SET_RELEVANT_COMPLEX_INDEX_COUNT_WITH_CUTOFF, result, cutoff, index, v_term, ConsesLow.append( keys, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 7648L)
  public static SubLObject set_key_arbitrary_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject result = NIL;
    SubLObject index = NIL;
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    result = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    index = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    v_term = current.first();
    final SubLObject keys;
    current = ( keys = current.rest() );
    final SubLObject simple_key_function = kb_indexing_declarations.get_index_prop( index, $kw59$SIMPLE_KEY_FUNCTION );
    final SubLObject get_subindex_function = kb_indexing_declarations.get_index_prop( index, $kw2$GET_SUBINDEX_FUNCTION );
    final SubLObject keys_accum = $sym60$KEYS_ACCUM;
    final SubLObject ass = $sym61$ASS;
    return ConsesLow.list( $sym5$PIF, ConsesLow.list( $sym6$SIMPLE_INDEXED_TERM_P, v_term ), ConsesLow.list( $sym7$CLET, ConsesLow.list( reader.bq_cons( keys_accum, $list62 ) ), ConsesLow.list( $sym9$DO_SIMPLE_INDEX,
        ConsesLow.list( ass, v_term ), ConsesLow.list( $sym12$CSETQ, keys_accum, ConsesLow.listS( simple_key_function, ass, keys_accum, v_term, ConsesLow.append( keys, NIL ) ) ) ), ConsesLow.list( $sym12$CSETQ, result,
            keys_accum ) ), ConsesLow.list( $sym7$CLET, ConsesLow.list( ConsesLow.list( $sym63$NEXT_LEVEL_SUBINDEX, ConsesLow.listS( get_subindex_function, v_term, ConsesLow.append( keys, NIL ) ) ) ), ConsesLow.listS(
                $sym12$CSETQ, result, $list64 ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 8595L)
  public static SubLObject set_relevant_key_simple_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject result = NIL;
    SubLObject index = NIL;
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    result = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    index = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    v_term = current.first();
    final SubLObject keys;
    current = ( keys = current.rest() );
    final SubLObject simple_match_function = kb_indexing_declarations.get_index_prop( index, $kw1$SIMPLE_MATCH_FUNCTION );
    final SubLObject simple_key_function = kb_indexing_declarations.get_index_prop( index, $kw59$SIMPLE_KEY_FUNCTION );
    final SubLObject keys_accum = $sym67$KEYS_ACCUM;
    final SubLObject ass = $sym68$ASS;
    return ConsesLow.list( $sym7$CLET, ConsesLow.list( reader.bq_cons( keys_accum, $list62 ) ), ConsesLow.list( $sym9$DO_SIMPLE_INDEX, ConsesLow.list( ass, v_term ), ConsesLow.list( $sym10$PWHEN, ConsesLow.listS(
        simple_match_function, ass, v_term, ConsesLow.append( keys, NIL ) ), ConsesLow.list( $sym10$PWHEN, ConsesLow.list( $sym69$RELEVANT_MT_, ConsesLow.list( $sym70$ASSERTION_MT, ass ) ), ConsesLow.list( $sym12$CSETQ,
            keys_accum, ConsesLow.listS( simple_key_function, ass, keys_accum, v_term, ConsesLow.append( keys, NIL ) ) ) ) ) ), ConsesLow.list( $sym12$CSETQ, result, keys_accum ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 9221L)
  public static SubLObject set_relevant_key_complex_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject result = NIL;
    SubLObject index = NIL;
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    result = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    index = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    v_term = current.first();
    final SubLObject keys;
    current = ( keys = current.rest() );
    final SubLObject key_function = kb_indexing_declarations.get_index_prop( index, $kw21$KEY_FUNCTION );
    final SubLObject get_subindex_function = kb_indexing_declarations.get_index_prop( index, $kw2$GET_SUBINDEX_FUNCTION );
    final SubLObject relevant_num_function = kb_indexing_declarations.get_index_prop( index, $kw22$RELEVANT_NUM_FUNCTION );
    final SubLObject mt_key_level = mt_key_level( index );
    if( !mt_key_level.isInteger() )
    {
      Errors.error( $str23$SET_RELEVANT_COMPLEX_INDEX_COUNT_, index );
    }
    if( number_of_non_null_args_in_order( keys, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ).numGE( mt_key_level ) )
    {
      Errors.error( $str24$SET_RELEVANT_COMPLEX_INDEX_COUNT_ );
    }
    final SubLObject good_key_count = $sym72$GOOD_KEY_COUNT;
    final SubLObject good_keys = $sym73$GOOD_KEYS;
    final SubLObject mt_subindex = $sym74$MT_SUBINDEX;
    final SubLObject next_level_keys = $sym75$NEXT_LEVEL_KEYS;
    final SubLObject next_key = $sym76$NEXT_KEY;
    return ConsesLow.list( $sym7$CLET, ConsesLow.list( ConsesLow.list( good_key_count, reader.bq_cons( $sym30$NUMBER_OF_NON_NULL_ARGS_IN_ORDER, ConsesLow.append( keys, NIL ) ) ) ), ConsesLow.list( $sym5$PIF, ConsesLow
        .list( $sym31$_, good_key_count, ConsesLow.listS( $sym32$_, mt_key_level, $list33 ) ), ConsesLow.list( $sym7$CLET, ConsesLow.list( ConsesLow.list( mt_subindex, ConsesLow.listS( get_subindex_function, v_term,
            ConsesLow.append( keys, NIL ) ) ) ), ConsesLow.list( $sym10$PWHEN, mt_subindex, ConsesLow.list( $sym12$CSETQ, result, ConsesLow.list( $sym77$RELEVANT_MT_SUBINDEX_KEYS, mt_subindex ) ) ) ), ConsesLow.list(
                $sym7$CLET, ConsesLow.list( ConsesLow.list( good_keys, ConsesLow.listS( $sym35$LIST_OF_FIRST_N_ARGS, good_key_count, ConsesLow.append( keys, NIL ) ) ), ConsesLow.list( next_level_keys, ConsesLow.list(
                    $sym36$APPLY, ConsesLow.list( $sym37$QUOTE, key_function ), v_term, good_keys ) ) ), ConsesLow.list( $sym38$CDOLIST, ConsesLow.list( next_key, next_level_keys ), ConsesLow.list( $sym10$PWHEN,
                        ConsesLow.list( $sym78$PLUSP, ConsesLow.list( $sym36$APPLY, ConsesLow.list( $sym37$QUOTE, relevant_num_function ), v_term, ConsesLow.list( $sym39$APPEND, good_keys, ConsesLow.list( $sym40$LIST,
                            next_key ) ) ) ), ConsesLow.list( $sym79$CPUSH, next_key, result ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 10811L)
  public static SubLObject set_relevant_key_arbitrary_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject result = NIL;
    SubLObject index = NIL;
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    result = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    index = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    v_term = current.first();
    final SubLObject keys;
    current = ( keys = current.rest() );
    final SubLObject key_function = kb_indexing_declarations.get_index_prop( index, $kw21$KEY_FUNCTION );
    return ConsesLow.list( $sym5$PIF, $list42, ConsesLow.list( $sym12$CSETQ, result, ConsesLow.listS( key_function, v_term, ConsesLow.append( keys, NIL ) ) ), ConsesLow.list( $sym5$PIF, ConsesLow.list(
        $sym6$SIMPLE_INDEXED_TERM_P, v_term ), ConsesLow.listS( $sym65$SET_RELEVANT_KEY_SIMPLE_INDEX, result, index, v_term, ConsesLow.append( keys, NIL ) ), ConsesLow.listS( $sym71$SET_RELEVANT_KEY_COMPLEX_INDEX,
            result, index, v_term, ConsesLow.append( keys, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 11332L)
  public static SubLObject mt_key_level(final SubLObject index)
  {
    final SubLObject keys_declaration = kb_indexing_declarations.get_index_prop( index, $kw81$KEYS );
    SubLObject level = ONE_INTEGER;
    SubLObject cdolist_list_var = keys_declaration;
    SubLObject key_plist = NIL;
    key_plist = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != conses_high.getf( key_plist, $kw82$MT_, UNPROVIDED ) )
      {
        return level;
      }
      level = Numbers.add( level, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      key_plist = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 11725L)
  public static SubLObject list_of_first_n_args(final SubLObject n, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5)
  {
    if( arg1 == UNPROVIDED )
    {
      arg1 = NIL;
    }
    if( arg2 == UNPROVIDED )
    {
      arg2 = NIL;
    }
    if( arg3 == UNPROVIDED )
    {
      arg3 = NIL;
    }
    if( arg4 == UNPROVIDED )
    {
      arg4 = NIL;
    }
    if( arg5 == UNPROVIDED )
    {
      arg5 = NIL;
    }
    SubLObject result = NIL;
    if( n.numGE( ONE_INTEGER ) )
    {
      result = ConsesLow.cons( arg1, result );
    }
    if( n.numGE( TWO_INTEGER ) )
    {
      result = ConsesLow.cons( arg2, result );
    }
    if( n.numGE( THREE_INTEGER ) )
    {
      result = ConsesLow.cons( arg3, result );
    }
    if( n.numGE( FOUR_INTEGER ) )
    {
      result = ConsesLow.cons( arg4, result );
    }
    if( n.numGE( FIVE_INTEGER ) )
    {
      result = ConsesLow.cons( arg5, result );
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 12138L)
  public static SubLObject number_of_non_null_args_in_order(SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5)
  {
    if( arg1 == UNPROVIDED )
    {
      arg1 = NIL;
    }
    if( arg2 == UNPROVIDED )
    {
      arg2 = NIL;
    }
    if( arg3 == UNPROVIDED )
    {
      arg3 = NIL;
    }
    if( arg4 == UNPROVIDED )
    {
      arg4 = NIL;
    }
    if( arg5 == UNPROVIDED )
    {
      arg5 = NIL;
    }
    SubLObject count = ZERO_INTEGER;
    if( NIL == arg1 )
    {
      return count;
    }
    count = Numbers.add( count, ONE_INTEGER );
    if( NIL == arg2 )
    {
      return count;
    }
    count = Numbers.add( count, ONE_INTEGER );
    if( NIL == arg3 )
    {
      return count;
    }
    count = Numbers.add( count, ONE_INTEGER );
    if( NIL == arg4 )
    {
      return count;
    }
    count = Numbers.add( count, ONE_INTEGER );
    if( NIL == arg5 )
    {
      return count;
    }
    count = Numbers.add( count, ONE_INTEGER );
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 12593L)
  public static SubLObject do_gaf_arg_indices(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list83 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject argnum = NIL;
    SubLObject subindex = NIL;
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list83 );
    argnum = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list83 );
    subindex = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list83 );
    v_term = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list83 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list83 );
      if( NIL == conses_high.member( current_$1, $list84, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw85$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list83 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw86$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym87$DO_INTERMEDIATE_INDEX, ConsesLow.list( argnum, subindex, ConsesLow.list( $sym88$TERM_GAF_ARG_INDEX, v_term ), $kw86$DONE, done ), ConsesLow.listS( $sym10$PWHEN, ConsesLow.list(
        $sym89$VALID_GAF_ARG_INDEX_KEY_, argnum ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 12960L)
  public static SubLObject do_gaf_arg_index_keys(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list90 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject argnum = NIL;
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list90 );
    argnum = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list90 );
    v_term = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list90 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list90 );
      if( NIL == conses_high.member( current_$2, $list84, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw85$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list90 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw86$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject subindex = $sym91$SUBINDEX;
    return ConsesLow.listS( $sym92$DO_GAF_ARG_INDICES, ConsesLow.list( argnum, subindex, v_term, $kw86$DONE, done ), ConsesLow.list( $sym93$IGNORE, subindex ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 13177L)
  public static SubLObject term_gaf_arg_index(final SubLObject v_term)
  {
    return kb_indexing_datastructures.intermediate_index_lookup( kb_indexing_datastructures.term_index( v_term ), $kw94$GAF_ARG );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 13319L)
  public static SubLObject valid_gaf_arg_index_keyP(final SubLObject key)
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 13499L)
  public static SubLObject do_nart_arg_indices(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list83 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject argnum = NIL;
    SubLObject subindex = NIL;
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list83 );
    argnum = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list83 );
    subindex = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list83 );
    v_term = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$3 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list83 );
      current_$3 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list83 );
      if( NIL == conses_high.member( current_$3, $list84, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$3 == $kw85$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list83 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw86$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym87$DO_INTERMEDIATE_INDEX, ConsesLow.list( argnum, subindex, ConsesLow.list( $sym95$TERM_NART_ARG_INDEX, v_term ), $kw86$DONE, done ), ConsesLow.listS( $sym10$PWHEN, ConsesLow.list(
        $sym96$VALID_NART_ARG_INDEX_KEY_, argnum ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 13767L)
  public static SubLObject do_nart_arg_index_keys(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list90 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject argnum = NIL;
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list90 );
    argnum = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list90 );
    v_term = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$4 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list90 );
      current_$4 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list90 );
      if( NIL == conses_high.member( current_$4, $list84, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$4 == $kw85$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list90 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw86$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject subindex = $sym97$SUBINDEX;
    return ConsesLow.listS( $sym98$DO_NART_ARG_INDICES, ConsesLow.list( argnum, subindex, v_term, $kw86$DONE, done ), ConsesLow.list( $sym93$IGNORE, subindex ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 13986L)
  public static SubLObject term_nart_arg_index(final SubLObject v_term)
  {
    return kb_indexing_datastructures.intermediate_index_lookup( kb_indexing_datastructures.term_index( v_term ), $kw99$NART_ARG );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 14131L)
  public static SubLObject valid_nart_arg_index_keyP(final SubLObject key)
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 14313L)
  public static SubLObject do_predicate_rule_indices(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject sense = NIL;
    SubLObject subindex = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
    sense = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
    subindex = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
    pred = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$5 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list100 );
      current_$5 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list100 );
      if( NIL == conses_high.member( current_$5, $list84, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$5 == $kw85$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list100 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw86$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym87$DO_INTERMEDIATE_INDEX, ConsesLow.list( sense, subindex, ConsesLow.list( $sym101$TERM_PREDICATE_RULE_INDEX, pred ), $kw86$DONE, done ), ConsesLow.listS( $sym10$PWHEN, ConsesLow.list(
        $sym102$VALID_PREDICATE_RULE_INDEX_KEY_, sense ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 14602L)
  public static SubLObject do_predicate_rule_index_keys(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list103 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject sense = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list103 );
    sense = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list103 );
    pred = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$6 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list103 );
      current_$6 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list103 );
      if( NIL == conses_high.member( current_$6, $list84, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$6 == $kw85$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list103 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw86$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject subindex = $sym104$SUBINDEX;
    return ConsesLow.listS( $sym105$DO_PREDICATE_RULE_INDICES, ConsesLow.list( sense, subindex, pred, $kw86$DONE, done ), ConsesLow.list( $sym93$IGNORE, subindex ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 14831L)
  public static SubLObject term_predicate_rule_index(final SubLObject pred)
  {
    return kb_indexing_datastructures.intermediate_index_lookup( kb_indexing_datastructures.term_index( pred ), $kw106$PREDICATE_RULE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 14994L)
  public static SubLObject valid_predicate_rule_index_keyP(final SubLObject key)
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 15188L)
  public static SubLObject do_decontextualized_ist_predicate_rule_indices(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject sense = NIL;
    SubLObject subindex = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
    sense = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
    subindex = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
    pred = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$7 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list100 );
      current_$7 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list100 );
      if( NIL == conses_high.member( current_$7, $list84, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$7 == $kw85$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list100 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw86$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym87$DO_INTERMEDIATE_INDEX, ConsesLow.list( sense, subindex, ConsesLow.list( $sym107$TERM_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX, pred ), $kw86$DONE, done ), ConsesLow.listS( $sym10$PWHEN,
        ConsesLow.list( $sym102$VALID_PREDICATE_RULE_INDEX_KEY_, sense ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 15540L)
  public static SubLObject do_decontextualized_ist_predicate_rule_index_keys(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list103 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject sense = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list103 );
    sense = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list103 );
    pred = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$8 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list103 );
      current_$8 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list103 );
      if( NIL == conses_high.member( current_$8, $list84, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$8 == $kw85$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list103 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw86$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject subindex = $sym108$SUBINDEX;
    return ConsesLow.listS( $sym109$DO_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDICES, ConsesLow.list( sense, subindex, pred, $kw86$DONE, done ), ConsesLow.list( $sym93$IGNORE, subindex ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 15811L)
  public static SubLObject term_decontextualized_ist_predicate_rule_index(final SubLObject pred)
  {
    return kb_indexing_datastructures.intermediate_index_lookup( kb_indexing_datastructures.term_index( pred ), $kw110$DECONTEXTUALIZED_IST_PREDICATE_RULE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 16037L)
  public static SubLObject valid_decontextualized_ist_predicate_rule_index_keyP(final SubLObject key)
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 16273L)
  public static SubLObject do_isa_rule_indices(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list112 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject sense = NIL;
    SubLObject subindex = NIL;
    SubLObject col = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list112 );
    sense = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list112 );
    subindex = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list112 );
    col = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$9 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list112 );
      current_$9 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list112 );
      if( NIL == conses_high.member( current_$9, $list84, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$9 == $kw85$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list112 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw86$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym87$DO_INTERMEDIATE_INDEX, ConsesLow.list( sense, subindex, ConsesLow.list( $sym113$TERM_ISA_RULE_INDEX, col ), $kw86$DONE, done ), ConsesLow.listS( $sym10$PWHEN, ConsesLow.list(
        $sym114$VALID_ISA_RULE_INDEX_KEY_, sense ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 16536L)
  public static SubLObject do_isa_rule_index_keys(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list115 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject sense = NIL;
    SubLObject col = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list115 );
    sense = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list115 );
    col = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$10 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list115 );
      current_$10 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list115 );
      if( NIL == conses_high.member( current_$10, $list84, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$10 == $kw85$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list115 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw86$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject subindex = $sym116$SUBINDEX;
    return ConsesLow.listS( $sym117$DO_ISA_RULE_INDICES, ConsesLow.list( sense, subindex, col, $kw86$DONE, done ), ConsesLow.list( $sym93$IGNORE, subindex ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 16751L)
  public static SubLObject term_isa_rule_index(final SubLObject col)
  {
    return kb_indexing_datastructures.intermediate_index_lookup( kb_indexing_datastructures.term_index( col ), $kw118$ISA_RULE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 16894L)
  public static SubLObject valid_isa_rule_index_keyP(final SubLObject key)
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 17076L)
  public static SubLObject do_genls_rule_indices(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list112 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject sense = NIL;
    SubLObject subindex = NIL;
    SubLObject col = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list112 );
    sense = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list112 );
    subindex = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list112 );
    col = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$11 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list112 );
      current_$11 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list112 );
      if( NIL == conses_high.member( current_$11, $list84, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$11 == $kw85$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list112 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw86$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym87$DO_INTERMEDIATE_INDEX, ConsesLow.list( sense, subindex, ConsesLow.list( $sym119$TERM_GENLS_RULE_INDEX, col ), $kw86$DONE, done ), ConsesLow.listS( $sym10$PWHEN, ConsesLow.list(
        $sym120$VALID_GENLS_RULE_INDEX_KEY_, sense ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 17347L)
  public static SubLObject do_genls_rule_index_keys(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list115 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject sense = NIL;
    SubLObject col = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list115 );
    sense = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list115 );
    col = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$12 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list115 );
      current_$12 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list115 );
      if( NIL == conses_high.member( current_$12, $list84, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$12 == $kw85$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list115 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw86$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject subindex = $sym121$SUBINDEX;
    return ConsesLow.listS( $sym122$DO_GENLS_RULE_INDICES, ConsesLow.list( sense, subindex, col, $kw86$DONE, done ), ConsesLow.list( $sym93$IGNORE, subindex ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 17566L)
  public static SubLObject term_genls_rule_index(final SubLObject col)
  {
    return kb_indexing_datastructures.intermediate_index_lookup( kb_indexing_datastructures.term_index( col ), $kw123$GENLS_RULE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 17715L)
  public static SubLObject valid_genls_rule_index_keyP(final SubLObject key)
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 17901L)
  public static SubLObject do_genl_mt_rule_indices(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list112 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject sense = NIL;
    SubLObject subindex = NIL;
    SubLObject col = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list112 );
    sense = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list112 );
    subindex = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list112 );
    col = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$13 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list112 );
      current_$13 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list112 );
      if( NIL == conses_high.member( current_$13, $list84, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$13 == $kw85$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list112 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw86$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym87$DO_INTERMEDIATE_INDEX, ConsesLow.list( sense, subindex, ConsesLow.list( $sym124$TERM_GENL_MT_RULE_INDEX, col ), $kw86$DONE, done ), ConsesLow.listS( $sym10$PWHEN, ConsesLow.list(
        $sym125$VALID_GENL_MT_RULE_INDEX_KEY_, sense ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 18180L)
  public static SubLObject do_genl_mt_rule_index_keys(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list115 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject sense = NIL;
    SubLObject col = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list115 );
    sense = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list115 );
    col = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$14 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list115 );
      current_$14 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list115 );
      if( NIL == conses_high.member( current_$14, $list84, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$14 == $kw85$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list115 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw86$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject subindex = $sym126$SUBINDEX;
    return ConsesLow.listS( $sym127$DO_GENL_MT_RULE_INDICES, ConsesLow.list( sense, subindex, col, $kw86$DONE, done ), ConsesLow.list( $sym93$IGNORE, subindex ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 18403L)
  public static SubLObject term_genl_mt_rule_index(final SubLObject col)
  {
    return kb_indexing_datastructures.intermediate_index_lookup( kb_indexing_datastructures.term_index( col ), $kw128$GENL_MT_RULE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 18558L)
  public static SubLObject valid_genl_mt_rule_index_keyP(final SubLObject key)
  {
    return T;
  }

  public static SubLObject declare_kb_indexing_macros_file()
  {
    SubLFiles.declareMacro( me, "set_num_arbitrary_index", "SET-NUM-ARBITRARY-INDEX" );
    SubLFiles.declareMacro( me, "set_relevant_simple_index_count", "SET-RELEVANT-SIMPLE-INDEX-COUNT" );
    SubLFiles.declareMacro( me, "set_relevant_complex_index_count", "SET-RELEVANT-COMPLEX-INDEX-COUNT" );
    SubLFiles.declareMacro( me, "set_relevant_num_arbitrary_index", "SET-RELEVANT-NUM-ARBITRARY-INDEX" );
    SubLFiles.declareFunction( me, "number_has_reached_cutoffP", "NUMBER-HAS-REACHED-CUTOFF?", 2, 0, false );
    SubLFiles.declareMacro( me, "set_relevant_simple_index_count_with_cutoff", "SET-RELEVANT-SIMPLE-INDEX-COUNT-WITH-CUTOFF" );
    SubLFiles.declareMacro( me, "set_relevant_complex_index_count_with_cutoff", "SET-RELEVANT-COMPLEX-INDEX-COUNT-WITH-CUTOFF" );
    SubLFiles.declareMacro( me, "set_relevant_num_arbitrary_index_with_cutoff", "SET-RELEVANT-NUM-ARBITRARY-INDEX-WITH-CUTOFF" );
    SubLFiles.declareMacro( me, "set_key_arbitrary_index", "SET-KEY-ARBITRARY-INDEX" );
    SubLFiles.declareMacro( me, "set_relevant_key_simple_index", "SET-RELEVANT-KEY-SIMPLE-INDEX" );
    SubLFiles.declareMacro( me, "set_relevant_key_complex_index", "SET-RELEVANT-KEY-COMPLEX-INDEX" );
    SubLFiles.declareMacro( me, "set_relevant_key_arbitrary_index", "SET-RELEVANT-KEY-ARBITRARY-INDEX" );
    SubLFiles.declareFunction( me, "mt_key_level", "MT-KEY-LEVEL", 1, 0, false );
    SubLFiles.declareFunction( me, "list_of_first_n_args", "LIST-OF-FIRST-N-ARGS", 1, 5, false );
    SubLFiles.declareFunction( me, "number_of_non_null_args_in_order", "NUMBER-OF-NON-NULL-ARGS-IN-ORDER", 0, 5, false );
    SubLFiles.declareMacro( me, "do_gaf_arg_indices", "DO-GAF-ARG-INDICES" );
    SubLFiles.declareMacro( me, "do_gaf_arg_index_keys", "DO-GAF-ARG-INDEX-KEYS" );
    SubLFiles.declareFunction( me, "term_gaf_arg_index", "TERM-GAF-ARG-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_gaf_arg_index_keyP", "VALID-GAF-ARG-INDEX-KEY?", 1, 0, false );
    SubLFiles.declareMacro( me, "do_nart_arg_indices", "DO-NART-ARG-INDICES" );
    SubLFiles.declareMacro( me, "do_nart_arg_index_keys", "DO-NART-ARG-INDEX-KEYS" );
    SubLFiles.declareFunction( me, "term_nart_arg_index", "TERM-NART-ARG-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_nart_arg_index_keyP", "VALID-NART-ARG-INDEX-KEY?", 1, 0, false );
    SubLFiles.declareMacro( me, "do_predicate_rule_indices", "DO-PREDICATE-RULE-INDICES" );
    SubLFiles.declareMacro( me, "do_predicate_rule_index_keys", "DO-PREDICATE-RULE-INDEX-KEYS" );
    SubLFiles.declareFunction( me, "term_predicate_rule_index", "TERM-PREDICATE-RULE-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_predicate_rule_index_keyP", "VALID-PREDICATE-RULE-INDEX-KEY?", 1, 0, false );
    SubLFiles.declareMacro( me, "do_decontextualized_ist_predicate_rule_indices", "DO-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDICES" );
    SubLFiles.declareMacro( me, "do_decontextualized_ist_predicate_rule_index_keys", "DO-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-KEYS" );
    SubLFiles.declareFunction( me, "term_decontextualized_ist_predicate_rule_index", "TERM-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_decontextualized_ist_predicate_rule_index_keyP", "VALID-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-KEY?", 1, 0, false );
    SubLFiles.declareMacro( me, "do_isa_rule_indices", "DO-ISA-RULE-INDICES" );
    SubLFiles.declareMacro( me, "do_isa_rule_index_keys", "DO-ISA-RULE-INDEX-KEYS" );
    SubLFiles.declareFunction( me, "term_isa_rule_index", "TERM-ISA-RULE-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_isa_rule_index_keyP", "VALID-ISA-RULE-INDEX-KEY?", 1, 0, false );
    SubLFiles.declareMacro( me, "do_genls_rule_indices", "DO-GENLS-RULE-INDICES" );
    SubLFiles.declareMacro( me, "do_genls_rule_index_keys", "DO-GENLS-RULE-INDEX-KEYS" );
    SubLFiles.declareFunction( me, "term_genls_rule_index", "TERM-GENLS-RULE-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_genls_rule_index_keyP", "VALID-GENLS-RULE-INDEX-KEY?", 1, 0, false );
    SubLFiles.declareMacro( me, "do_genl_mt_rule_indices", "DO-GENL-MT-RULE-INDICES" );
    SubLFiles.declareMacro( me, "do_genl_mt_rule_index_keys", "DO-GENL-MT-RULE-INDEX-KEYS" );
    SubLFiles.declareFunction( me, "term_genl_mt_rule_index", "TERM-GENL-MT-RULE-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_genl_mt_rule_index_keyP", "VALID-GENL-MT-RULE-INDEX-KEY?", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_kb_indexing_macros_file()
  {
    return NIL;
  }

  public static SubLObject setup_kb_indexing_macros_file()
  {
    access_macros.register_macro_helper( $sym15$SET_RELEVANT_SIMPLE_INDEX_COUNT, $sym16$SET_RELEVANT_NUM_ARBITRARY_INDEX );
    access_macros.register_macro_helper( $sym20$SET_RELEVANT_COMPLEX_INDEX_COUNT, $sym16$SET_RELEVANT_NUM_ARBITRARY_INDEX );
    access_macros.register_macro_helper( $sym43$SET_RELEVANT_SIMPLE_INDEX_COUNT_WITH_CUTOFF, $sym16$SET_RELEVANT_NUM_ARBITRARY_INDEX );
    access_macros.register_macro_helper( $sym47$SET_RELEVANT_COMPLEX_INDEX_COUNT_WITH_CUTOFF, $sym16$SET_RELEVANT_NUM_ARBITRARY_INDEX );
    access_macros.register_macro_helper( $sym65$SET_RELEVANT_KEY_SIMPLE_INDEX, $sym66$SET_RELEVANT_KEY_ARBITRARY_INDEX );
    access_macros.register_macro_helper( $sym71$SET_RELEVANT_KEY_COMPLEX_INDEX, $sym66$SET_RELEVANT_KEY_ARBITRARY_INDEX );
    access_macros.register_macro_helper( $sym80$MT_KEY_LEVEL, $sym20$SET_RELEVANT_COMPLEX_INDEX_COUNT );
    access_macros.register_macro_helper( $sym35$LIST_OF_FIRST_N_ARGS, $sym20$SET_RELEVANT_COMPLEX_INDEX_COUNT );
    access_macros.register_macro_helper( $sym30$NUMBER_OF_NON_NULL_ARGS_IN_ORDER, $sym20$SET_RELEVANT_COMPLEX_INDEX_COUNT );
    access_macros.register_macro_helper( $sym88$TERM_GAF_ARG_INDEX, $sym92$DO_GAF_ARG_INDICES );
    access_macros.register_macro_helper( $sym89$VALID_GAF_ARG_INDEX_KEY_, $sym92$DO_GAF_ARG_INDICES );
    access_macros.register_macro_helper( $sym95$TERM_NART_ARG_INDEX, $sym98$DO_NART_ARG_INDICES );
    access_macros.register_macro_helper( $sym96$VALID_NART_ARG_INDEX_KEY_, $sym98$DO_NART_ARG_INDICES );
    access_macros.register_macro_helper( $sym101$TERM_PREDICATE_RULE_INDEX, $sym105$DO_PREDICATE_RULE_INDICES );
    access_macros.register_macro_helper( $sym102$VALID_PREDICATE_RULE_INDEX_KEY_, $sym105$DO_PREDICATE_RULE_INDICES );
    access_macros.register_macro_helper( $sym107$TERM_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX, $sym109$DO_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDICES );
    access_macros.register_macro_helper( $sym111$VALID_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX_KEY_, $sym109$DO_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDICES );
    access_macros.register_macro_helper( $sym113$TERM_ISA_RULE_INDEX, $sym117$DO_ISA_RULE_INDICES );
    access_macros.register_macro_helper( $sym114$VALID_ISA_RULE_INDEX_KEY_, $sym117$DO_ISA_RULE_INDICES );
    access_macros.register_macro_helper( $sym119$TERM_GENLS_RULE_INDEX, $sym122$DO_GENLS_RULE_INDICES );
    access_macros.register_macro_helper( $sym120$VALID_GENLS_RULE_INDEX_KEY_, $sym122$DO_GENLS_RULE_INDICES );
    access_macros.register_macro_helper( $sym124$TERM_GENL_MT_RULE_INDEX, $sym127$DO_GENL_MT_RULE_INDICES );
    access_macros.register_macro_helper( $sym125$VALID_GENL_MT_RULE_INDEX_KEY_, $sym127$DO_GENL_MT_RULE_INDICES );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_kb_indexing_macros_file();
  }

  @Override
  public void initializeVariables()
  {
    init_kb_indexing_macros_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_kb_indexing_macros_file();
  }
  static
  {
    me = new kb_indexing_macros();
    $list0 = ConsesLow.list( makeSymbol( "RESULT" ), makeSymbol( "INDEX" ), makeSymbol( "TERM" ), makeSymbol( "&REST" ), makeSymbol( "KEYS" ) );
    $kw1$SIMPLE_MATCH_FUNCTION = makeKeyword( "SIMPLE-MATCH-FUNCTION" );
    $kw2$GET_SUBINDEX_FUNCTION = makeKeyword( "GET-SUBINDEX-FUNCTION" );
    $sym3$COUNT = makeUninternedSymbol( "COUNT" );
    $sym4$ASS = makeUninternedSymbol( "ASS" );
    $sym5$PIF = makeSymbol( "PIF" );
    $sym6$SIMPLE_INDEXED_TERM_P = makeSymbol( "SIMPLE-INDEXED-TERM-P" );
    $sym7$CLET = makeSymbol( "CLET" );
    $list8 = ConsesLow.list( ZERO_INTEGER );
    $sym9$DO_SIMPLE_INDEX = makeSymbol( "DO-SIMPLE-INDEX" );
    $sym10$PWHEN = makeSymbol( "PWHEN" );
    $sym11$CINC = makeSymbol( "CINC" );
    $sym12$CSETQ = makeSymbol( "CSETQ" );
    $sym13$SUBINDEX = makeSymbol( "SUBINDEX" );
    $list14 = ConsesLow.list( ConsesLow.list( makeSymbol( "FIF" ), makeSymbol( "SUBINDEX" ), ConsesLow.list( makeSymbol( "SUBINDEX-LEAF-COUNT" ), makeSymbol( "SUBINDEX" ) ), ZERO_INTEGER ) );
    $sym15$SET_RELEVANT_SIMPLE_INDEX_COUNT = makeSymbol( "SET-RELEVANT-SIMPLE-INDEX-COUNT" );
    $sym16$SET_RELEVANT_NUM_ARBITRARY_INDEX = makeSymbol( "SET-RELEVANT-NUM-ARBITRARY-INDEX" );
    $list17 = ConsesLow.list( makeSymbol( "COUNT-VAR" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "TERM" ), makeSymbol( "&REST" ), makeSymbol( "ARGS" ) ) );
    $sym18$ASS = makeSymbol( "ASS" );
    $list19 = ConsesLow.list( makeSymbol( "RELEVANT-MT?" ), ConsesLow.list( makeSymbol( "ASSERTION-MT" ), makeSymbol( "ASS" ) ) );
    $sym20$SET_RELEVANT_COMPLEX_INDEX_COUNT = makeSymbol( "SET-RELEVANT-COMPLEX-INDEX-COUNT" );
    $kw21$KEY_FUNCTION = makeKeyword( "KEY-FUNCTION" );
    $kw22$RELEVANT_NUM_FUNCTION = makeKeyword( "RELEVANT-NUM-FUNCTION" );
    $str23$SET_RELEVANT_COMPLEX_INDEX_COUNT_ = makeString( "SET-RELEVANT-COMPLEX-INDEX-COUNT called on an index (~s) without an mt layer" );
    $str24$SET_RELEVANT_COMPLEX_INDEX_COUNT_ = makeString( "SET-RELEVANT-COMPLEX-INDEX-COUNT called with too many arguments" );
    $sym25$GOOD_KEY_COUNT = makeUninternedSymbol( "GOOD-KEY-COUNT" );
    $sym26$GOOD_KEYS = makeUninternedSymbol( "GOOD-KEYS" );
    $sym27$MT_SUBINDEX = makeUninternedSymbol( "MT-SUBINDEX" );
    $sym28$NEXT_LEVEL_KEYS = makeUninternedSymbol( "NEXT-LEVEL-KEYS" );
    $sym29$NEXT_KEY = makeUninternedSymbol( "NEXT-KEY" );
    $sym30$NUMBER_OF_NON_NULL_ARGS_IN_ORDER = makeSymbol( "NUMBER-OF-NON-NULL-ARGS-IN-ORDER" );
    $sym31$_ = makeSymbol( "=" );
    $sym32$_ = makeSymbol( "-" );
    $list33 = ConsesLow.list( ONE_INTEGER );
    $sym34$RELEVANT_MT_SUBINDEX_COUNT = makeSymbol( "RELEVANT-MT-SUBINDEX-COUNT" );
    $sym35$LIST_OF_FIRST_N_ARGS = makeSymbol( "LIST-OF-FIRST-N-ARGS" );
    $sym36$APPLY = makeSymbol( "APPLY" );
    $sym37$QUOTE = makeSymbol( "QUOTE" );
    $sym38$CDOLIST = makeSymbol( "CDOLIST" );
    $sym39$APPEND = makeSymbol( "APPEND" );
    $sym40$LIST = makeSymbol( "LIST" );
    $kw41$NUM_FUNCTION = makeKeyword( "NUM-FUNCTION" );
    $list42 = ConsesLow.list( makeSymbol( "ALL-MT-SUBINDEX-KEYS-RELEVANT-P" ) );
    $sym43$SET_RELEVANT_SIMPLE_INDEX_COUNT_WITH_CUTOFF = makeSymbol( "SET-RELEVANT-SIMPLE-INDEX-COUNT-WITH-CUTOFF" );
    $list44 = ConsesLow.list( makeSymbol( "COUNT-VAR" ), makeSymbol( "CUTOFF" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "TERM" ), makeSymbol( "&REST" ), makeSymbol( "ARGS" ) ) );
    $sym45$PUNLESS = makeSymbol( "PUNLESS" );
    $sym46$NUMBER_HAS_REACHED_CUTOFF_ = makeSymbol( "NUMBER-HAS-REACHED-CUTOFF?" );
    $sym47$SET_RELEVANT_COMPLEX_INDEX_COUNT_WITH_CUTOFF = makeSymbol( "SET-RELEVANT-COMPLEX-INDEX-COUNT-WITH-CUTOFF" );
    $list48 = ConsesLow.list( makeSymbol( "RESULT" ), makeSymbol( "CUTOFF" ), makeSymbol( "INDEX" ), makeSymbol( "TERM" ), makeSymbol( "&REST" ), makeSymbol( "KEYS" ) );
    $kw49$RELEVANT_NUM_FUNCTION_WITH_CUTOFF = makeKeyword( "RELEVANT-NUM-FUNCTION-WITH-CUTOFF" );
    $str50$SET_RELEVANT_COMPLEX_INDEX_COUNT_ = makeString( "SET-RELEVANT-COMPLEX-INDEX-COUNT-WITH-CUTOFF called on an index (~s) without an mt layer" );
    $str51$SET_RELEVANT_COMPLEX_INDEX_COUNT_ = makeString( "SET-RELEVANT-COMPLEX-INDEX-COUNT-WITH-CUTOFF called with too many arguments" );
    $sym52$GOOD_KEY_COUNT = makeUninternedSymbol( "GOOD-KEY-COUNT" );
    $sym53$GOOD_KEYS = makeUninternedSymbol( "GOOD-KEYS" );
    $sym54$MT_SUBINDEX = makeUninternedSymbol( "MT-SUBINDEX" );
    $sym55$NEXT_LEVEL_KEYS = makeUninternedSymbol( "NEXT-LEVEL-KEYS" );
    $sym56$NEXT_KEY = makeUninternedSymbol( "NEXT-KEY" );
    $sym57$RELEVANT_MT_SUBINDEX_COUNT_WITH_CUTOFF = makeSymbol( "RELEVANT-MT-SUBINDEX-COUNT-WITH-CUTOFF" );
    $sym58$PROGN = makeSymbol( "PROGN" );
    $kw59$SIMPLE_KEY_FUNCTION = makeKeyword( "SIMPLE-KEY-FUNCTION" );
    $sym60$KEYS_ACCUM = makeUninternedSymbol( "KEYS-ACCUM" );
    $sym61$ASS = makeUninternedSymbol( "ASS" );
    $list62 = ConsesLow.list( NIL );
    $sym63$NEXT_LEVEL_SUBINDEX = makeSymbol( "NEXT-LEVEL-SUBINDEX" );
    $list64 = ConsesLow.list( ConsesLow.list( makeSymbol( "FWHEN" ), ConsesLow.list( makeSymbol( "INTERMEDIATE-INDEX-P" ), makeSymbol( "NEXT-LEVEL-SUBINDEX" ) ), ConsesLow.list( makeSymbol( "INTERMEDIATE-INDEX-KEYS" ),
        makeSymbol( "NEXT-LEVEL-SUBINDEX" ) ) ) );
    $sym65$SET_RELEVANT_KEY_SIMPLE_INDEX = makeSymbol( "SET-RELEVANT-KEY-SIMPLE-INDEX" );
    $sym66$SET_RELEVANT_KEY_ARBITRARY_INDEX = makeSymbol( "SET-RELEVANT-KEY-ARBITRARY-INDEX" );
    $sym67$KEYS_ACCUM = makeUninternedSymbol( "KEYS-ACCUM" );
    $sym68$ASS = makeUninternedSymbol( "ASS" );
    $sym69$RELEVANT_MT_ = makeSymbol( "RELEVANT-MT?" );
    $sym70$ASSERTION_MT = makeSymbol( "ASSERTION-MT" );
    $sym71$SET_RELEVANT_KEY_COMPLEX_INDEX = makeSymbol( "SET-RELEVANT-KEY-COMPLEX-INDEX" );
    $sym72$GOOD_KEY_COUNT = makeUninternedSymbol( "GOOD-KEY-COUNT" );
    $sym73$GOOD_KEYS = makeUninternedSymbol( "GOOD-KEYS" );
    $sym74$MT_SUBINDEX = makeUninternedSymbol( "MT-SUBINDEX" );
    $sym75$NEXT_LEVEL_KEYS = makeUninternedSymbol( "NEXT-LEVEL-KEYS" );
    $sym76$NEXT_KEY = makeUninternedSymbol( "NEXT-KEY" );
    $sym77$RELEVANT_MT_SUBINDEX_KEYS = makeSymbol( "RELEVANT-MT-SUBINDEX-KEYS" );
    $sym78$PLUSP = makeSymbol( "PLUSP" );
    $sym79$CPUSH = makeSymbol( "CPUSH" );
    $sym80$MT_KEY_LEVEL = makeSymbol( "MT-KEY-LEVEL" );
    $kw81$KEYS = makeKeyword( "KEYS" );
    $kw82$MT_ = makeKeyword( "MT?" );
    $list83 = ConsesLow.list( ConsesLow.list( makeSymbol( "ARGNUM" ), makeSymbol( "SUBINDEX" ), makeSymbol( "TERM" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list84 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw85$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw86$DONE = makeKeyword( "DONE" );
    $sym87$DO_INTERMEDIATE_INDEX = makeSymbol( "DO-INTERMEDIATE-INDEX" );
    $sym88$TERM_GAF_ARG_INDEX = makeSymbol( "TERM-GAF-ARG-INDEX" );
    $sym89$VALID_GAF_ARG_INDEX_KEY_ = makeSymbol( "VALID-GAF-ARG-INDEX-KEY?" );
    $list90 = ConsesLow.list( ConsesLow.list( makeSymbol( "ARGNUM" ), makeSymbol( "TERM" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym91$SUBINDEX = makeUninternedSymbol( "SUBINDEX" );
    $sym92$DO_GAF_ARG_INDICES = makeSymbol( "DO-GAF-ARG-INDICES" );
    $sym93$IGNORE = makeSymbol( "IGNORE" );
    $kw94$GAF_ARG = makeKeyword( "GAF-ARG" );
    $sym95$TERM_NART_ARG_INDEX = makeSymbol( "TERM-NART-ARG-INDEX" );
    $sym96$VALID_NART_ARG_INDEX_KEY_ = makeSymbol( "VALID-NART-ARG-INDEX-KEY?" );
    $sym97$SUBINDEX = makeUninternedSymbol( "SUBINDEX" );
    $sym98$DO_NART_ARG_INDICES = makeSymbol( "DO-NART-ARG-INDICES" );
    $kw99$NART_ARG = makeKeyword( "NART-ARG" );
    $list100 = ConsesLow.list( ConsesLow.list( makeSymbol( "SENSE" ), makeSymbol( "SUBINDEX" ), makeSymbol( "PRED" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym101$TERM_PREDICATE_RULE_INDEX = makeSymbol( "TERM-PREDICATE-RULE-INDEX" );
    $sym102$VALID_PREDICATE_RULE_INDEX_KEY_ = makeSymbol( "VALID-PREDICATE-RULE-INDEX-KEY?" );
    $list103 = ConsesLow.list( ConsesLow.list( makeSymbol( "SENSE" ), makeSymbol( "PRED" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym104$SUBINDEX = makeUninternedSymbol( "SUBINDEX" );
    $sym105$DO_PREDICATE_RULE_INDICES = makeSymbol( "DO-PREDICATE-RULE-INDICES" );
    $kw106$PREDICATE_RULE = makeKeyword( "PREDICATE-RULE" );
    $sym107$TERM_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX = makeSymbol( "TERM-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX" );
    $sym108$SUBINDEX = makeUninternedSymbol( "SUBINDEX" );
    $sym109$DO_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDICES = makeSymbol( "DO-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDICES" );
    $kw110$DECONTEXTUALIZED_IST_PREDICATE_RULE = makeKeyword( "DECONTEXTUALIZED-IST-PREDICATE-RULE" );
    $sym111$VALID_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX_KEY_ = makeSymbol( "VALID-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-KEY?" );
    $list112 = ConsesLow.list( ConsesLow.list( makeSymbol( "SENSE" ), makeSymbol( "SUBINDEX" ), makeSymbol( "COL" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym113$TERM_ISA_RULE_INDEX = makeSymbol( "TERM-ISA-RULE-INDEX" );
    $sym114$VALID_ISA_RULE_INDEX_KEY_ = makeSymbol( "VALID-ISA-RULE-INDEX-KEY?" );
    $list115 = ConsesLow.list( ConsesLow.list( makeSymbol( "SENSE" ), makeSymbol( "COL" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym116$SUBINDEX = makeUninternedSymbol( "SUBINDEX" );
    $sym117$DO_ISA_RULE_INDICES = makeSymbol( "DO-ISA-RULE-INDICES" );
    $kw118$ISA_RULE = makeKeyword( "ISA-RULE" );
    $sym119$TERM_GENLS_RULE_INDEX = makeSymbol( "TERM-GENLS-RULE-INDEX" );
    $sym120$VALID_GENLS_RULE_INDEX_KEY_ = makeSymbol( "VALID-GENLS-RULE-INDEX-KEY?" );
    $sym121$SUBINDEX = makeUninternedSymbol( "SUBINDEX" );
    $sym122$DO_GENLS_RULE_INDICES = makeSymbol( "DO-GENLS-RULE-INDICES" );
    $kw123$GENLS_RULE = makeKeyword( "GENLS-RULE" );
    $sym124$TERM_GENL_MT_RULE_INDEX = makeSymbol( "TERM-GENL-MT-RULE-INDEX" );
    $sym125$VALID_GENL_MT_RULE_INDEX_KEY_ = makeSymbol( "VALID-GENL-MT-RULE-INDEX-KEY?" );
    $sym126$SUBINDEX = makeUninternedSymbol( "SUBINDEX" );
    $sym127$DO_GENL_MT_RULE_INDICES = makeSymbol( "DO-GENL-MT-RULE-INDICES" );
    $kw128$GENL_MT_RULE = makeKeyword( "GENL-MT-RULE" );
  }
}
/*
 * 
 * Total time: 339 ms
 * 
 */