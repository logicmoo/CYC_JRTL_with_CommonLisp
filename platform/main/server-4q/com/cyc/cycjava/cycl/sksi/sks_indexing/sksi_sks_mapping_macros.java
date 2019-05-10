package com.cyc.cycjava.cycl.sksi.sks_indexing;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_sks_mapping_macros
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_macros";
  public static final String myFingerPrint = "95961196cd0f300f13e5286acf659fbca59c1e5013058135cdaa700fd1b747af";
  private static final SubLList $list0;
  private static final SubLList $list1;
  private static final SubLSymbol $kw2$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw3$DONE;
  private static final SubLSymbol $sym4$SUPPORT;
  private static final SubLSymbol $sym5$DO_LIST;
  private static final SubLSymbol $sym6$GATHER_SKSI_GAF_LOOKUP_INDEX;
  private static final SubLSymbol $sym7$CLET;
  private static final SubLList $list8;
  private static final SubLList $list9;
  private static final SubLSymbol $kw10$TRUTH;
  private static final SubLSymbol $kw11$TRUE;
  private static final SubLSymbol $sym12$GATHER_SENTENCE_MT_PAIR;
  private static final SubLSymbol $sym13$GATHER_SKSI_PREDICATE_EXTENT_INDEX;
  private static final SubLSymbol $sym14$CDESTRUCTURING_BIND;
  private static final SubLList $list15;
  private static final SubLList $list16;
  private static final SubLSymbol $kw17$GATHER_ARGNUM;
  private static final SubLSymbol $kw18$INDEX_ARGNUM;
  private static final SubLSymbol $sym19$GATHER_ARG_MT_PAIR;
  private static final SubLSymbol $sym20$GATHER_SKSI_GAF_ARG_INDEX_VALUES;
  private static final SubLList $list21;
  private static final SubLList $list22;
  private static final SubLSymbol $sym23$GATHER_SENTENCE_MT_PAIR;
  private static final SubLSymbol $sym24$GATHER_SKSI_GAF_ARG_INDEX;
  private static final SubLSymbol $sym25$GATHER_SENTENCE_MT_PAIR;
  private static final SubLSymbol $sym26$WITH_ALL_SPEC_PREDICATES_AND_INVERSES;
  private static final SubLSymbol $sym27$SPEC_PRED;
  private static final SubLSymbol $sym28$INVERSE_MODE_;
  private static final SubLSymbol $sym29$NEW_GATHER_ARGNUM;
  private static final SubLSymbol $sym30$NEW_INDEX_ARGNUM;
  private static final SubLSymbol $sym31$PROGN;
  private static final SubLSymbol $sym32$DO_ALL_SPEC_PREDICATES_AND_INVERSES;
  private static final SubLSymbol $sym33$FIF;
  private static final SubLSymbol $sym34$DO_SKSI_GAF_ARG_INDEX_VALUES;
  private static final SubLList $list35;
  private static final SubLSymbol $sym36$GATHER_ARG_MT_PRED_TUPLE;
  private static final SubLSymbol $sym37$GATHER_SKSI_GAF_ARG_INDEX_VALUES_RELEVANT_PRED;
  private static final SubLList $list38;
  private static final SubLSymbol $sym39$GATHER_SENTENCE_MT_PAIR;
  private static final SubLSymbol $sym40$GATHER_SKSI_GAF_ARG_INDEX_RELEVANT_PRED;

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-macros.lisp", position = 948L)
  public static SubLObject do_sksi_gaf_lookup_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject support_var = NIL;
    SubLObject asent = NIL;
    SubLObject sense = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    support_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    asent = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    sense = current.first();
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
    final SubLObject support = $sym4$SUPPORT;
    return ConsesLow.list( $sym5$DO_LIST, ConsesLow.list( support, ConsesLow.list( $sym6$GATHER_SKSI_GAF_LOOKUP_INDEX, asent, sense ), $kw3$DONE, done ), ConsesLow.listS( $sym7$CLET, ConsesLow.list( ConsesLow.list(
        support_var, support ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-macros.lisp", position = 1212L)
  public static SubLObject do_sksi_predicate_extent_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list8 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject gather_sentence = NIL;
    SubLObject gather_mt = NIL;
    SubLObject predicate = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list8 );
    gather_sentence = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list8 );
    gather_mt = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list8 );
    predicate = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list8 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list8 );
      if( NIL == conses_high.member( current_$2, $list9, UNPROVIDED, UNPROVIDED ) )
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
      cdestructuring_bind.cdestructuring_bind_error( datum, $list8 );
    }
    final SubLObject truth_tail = cdestructuring_bind.property_list_member( $kw10$TRUTH, current );
    final SubLObject truth = ( NIL != truth_tail ) ? conses_high.cadr( truth_tail ) : $kw11$TRUE;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw3$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject gather_sentence_mt_pair = $sym12$GATHER_SENTENCE_MT_PAIR;
    return ConsesLow.list( $sym5$DO_LIST, ConsesLow.list( gather_sentence_mt_pair, ConsesLow.list( $sym13$GATHER_SKSI_PREDICATE_EXTENT_INDEX, predicate, truth ), $kw3$DONE, done ), ConsesLow.listS(
        $sym14$CDESTRUCTURING_BIND, ConsesLow.list( gather_sentence, gather_mt ), gather_sentence_mt_pair, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-macros.lisp", position = 2048L)
  public static SubLObject do_sksi_gaf_arg_index_values(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject gather_arg = NIL;
    SubLObject gather_mt = NIL;
    SubLObject index_arg = NIL;
    SubLObject predicate = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
    gather_arg = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
    gather_mt = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
    index_arg = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
    predicate = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$3 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list15 );
      current_$3 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list15 );
      if( NIL == conses_high.member( current_$3, $list16, UNPROVIDED, UNPROVIDED ) )
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
      cdestructuring_bind.cdestructuring_bind_error( datum, $list15 );
    }
    final SubLObject gather_argnum_tail = cdestructuring_bind.property_list_member( $kw17$GATHER_ARGNUM, current );
    final SubLObject gather_argnum = ( NIL != gather_argnum_tail ) ? conses_high.cadr( gather_argnum_tail ) : TWO_INTEGER;
    final SubLObject index_argnum_tail = cdestructuring_bind.property_list_member( $kw18$INDEX_ARGNUM, current );
    final SubLObject index_argnum = ( NIL != index_argnum_tail ) ? conses_high.cadr( index_argnum_tail ) : ONE_INTEGER;
    final SubLObject truth_tail = cdestructuring_bind.property_list_member( $kw10$TRUTH, current );
    final SubLObject truth = ( NIL != truth_tail ) ? conses_high.cadr( truth_tail ) : $kw11$TRUE;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw3$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject gather_arg_mt_pair = $sym19$GATHER_ARG_MT_PAIR;
    return ConsesLow.list( $sym5$DO_LIST, ConsesLow.list( gather_arg_mt_pair, ConsesLow.list( $sym20$GATHER_SKSI_GAF_ARG_INDEX_VALUES, index_arg, index_argnum, gather_argnum, predicate, truth ), $kw3$DONE, done ),
        ConsesLow.listS( $sym14$CDESTRUCTURING_BIND, ConsesLow.list( gather_arg, gather_mt ), gather_arg_mt_pair, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-macros.lisp", position = 3082L)
  public static SubLObject do_sksi_gaf_arg_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject gather_sentence = NIL;
    SubLObject gather_mt = NIL;
    SubLObject index_arg = NIL;
    SubLObject predicate = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    gather_sentence = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    gather_mt = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    index_arg = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    predicate = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$4 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list21 );
      current_$4 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list21 );
      if( NIL == conses_high.member( current_$4, $list22, UNPROVIDED, UNPROVIDED ) )
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
      cdestructuring_bind.cdestructuring_bind_error( datum, $list21 );
    }
    final SubLObject index_argnum_tail = cdestructuring_bind.property_list_member( $kw18$INDEX_ARGNUM, current );
    final SubLObject index_argnum = ( NIL != index_argnum_tail ) ? conses_high.cadr( index_argnum_tail ) : ONE_INTEGER;
    final SubLObject truth_tail = cdestructuring_bind.property_list_member( $kw10$TRUTH, current );
    final SubLObject truth = ( NIL != truth_tail ) ? conses_high.cadr( truth_tail ) : $kw11$TRUE;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw3$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject gather_sentence_mt_pair = $sym23$GATHER_SENTENCE_MT_PAIR;
    return ConsesLow.list( $sym5$DO_LIST, ConsesLow.list( gather_sentence_mt_pair, ConsesLow.list( $sym24$GATHER_SKSI_GAF_ARG_INDEX, index_arg, index_argnum, predicate, truth ), $kw3$DONE, done ), ConsesLow.listS(
        $sym14$CDESTRUCTURING_BIND, ConsesLow.list( gather_sentence, gather_mt ), gather_sentence_mt_pair, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-macros.lisp", position = 3604L)
  public static SubLObject do_sksi_gaf_arg_index_gp(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject gather_sentence = NIL;
    SubLObject gather_mt = NIL;
    SubLObject index_arg = NIL;
    SubLObject predicate = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    gather_sentence = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    gather_mt = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    index_arg = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    predicate = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$5 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list21 );
      current_$5 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list21 );
      if( NIL == conses_high.member( current_$5, $list22, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$5 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list21 );
    }
    final SubLObject index_argnum_tail = cdestructuring_bind.property_list_member( $kw18$INDEX_ARGNUM, current );
    final SubLObject index_argnum = ( NIL != index_argnum_tail ) ? conses_high.cadr( index_argnum_tail ) : ONE_INTEGER;
    final SubLObject truth_tail = cdestructuring_bind.property_list_member( $kw10$TRUTH, current );
    final SubLObject truth = ( NIL != truth_tail ) ? conses_high.cadr( truth_tail ) : $kw11$TRUE;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw3$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject gather_sentence_mt_pair = $sym25$GATHER_SENTENCE_MT_PAIR;
    return ConsesLow.list( $sym26$WITH_ALL_SPEC_PREDICATES_AND_INVERSES, predicate, ConsesLow.list( $sym5$DO_LIST, ConsesLow.list( gather_sentence_mt_pair, ConsesLow.list( $sym24$GATHER_SKSI_GAF_ARG_INDEX, index_arg,
        index_argnum, predicate, truth ), $kw3$DONE, done ), ConsesLow.listS( $sym14$CDESTRUCTURING_BIND, ConsesLow.list( gather_sentence, gather_mt ), gather_sentence_mt_pair, ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-macros.lisp", position = 4192L)
  public static SubLObject do_sksi_gaf_arg_index_values_gp(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject gather_arg = NIL;
    SubLObject gather_mt = NIL;
    SubLObject index_arg = NIL;
    SubLObject predicate = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
    gather_arg = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
    gather_mt = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
    index_arg = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
    predicate = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$6 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list15 );
      current_$6 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list15 );
      if( NIL == conses_high.member( current_$6, $list16, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$6 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list15 );
    }
    final SubLObject gather_argnum_tail = cdestructuring_bind.property_list_member( $kw17$GATHER_ARGNUM, current );
    final SubLObject gather_argnum = ( NIL != gather_argnum_tail ) ? conses_high.cadr( gather_argnum_tail ) : TWO_INTEGER;
    final SubLObject index_argnum_tail = cdestructuring_bind.property_list_member( $kw18$INDEX_ARGNUM, current );
    final SubLObject index_argnum = ( NIL != index_argnum_tail ) ? conses_high.cadr( index_argnum_tail ) : ONE_INTEGER;
    final SubLObject truth_tail = cdestructuring_bind.property_list_member( $kw10$TRUTH, current );
    final SubLObject truth = ( NIL != truth_tail ) ? conses_high.cadr( truth_tail ) : $kw11$TRUE;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw3$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject spec_pred = $sym27$SPEC_PRED;
    final SubLObject inverse_modeP = $sym28$INVERSE_MODE_;
    final SubLObject new_gather_argnum = $sym29$NEW_GATHER_ARGNUM;
    final SubLObject new_index_argnum = $sym30$NEW_INDEX_ARGNUM;
    return ConsesLow.list( $sym31$PROGN, ConsesLow.list( $sym32$DO_ALL_SPEC_PREDICATES_AND_INVERSES, ConsesLow.list( spec_pred, inverse_modeP, predicate ), ConsesLow.list( $sym7$CLET, ConsesLow.list( ConsesLow.list(
        new_gather_argnum, ConsesLow.list( $sym33$FIF, inverse_modeP, index_argnum, gather_argnum ) ), ConsesLow.list( new_index_argnum, ConsesLow.list( $sym33$FIF, inverse_modeP, gather_argnum, index_argnum ) ) ),
        ConsesLow.listS( $sym34$DO_SKSI_GAF_ARG_INDEX_VALUES, ConsesLow.list( new SubLObject[]
        { gather_arg, gather_mt, index_arg, spec_pred, $kw17$GATHER_ARGNUM, new_gather_argnum, $kw18$INDEX_ARGNUM, new_index_argnum, $kw10$TRUTH, truth, $kw3$DONE, done
        } ), ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-macros.lisp", position = 5028L)
  public static SubLObject do_sksi_gaf_arg_index_values_relevant_pred(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject gather_arg = NIL;
    SubLObject gather_mt = NIL;
    SubLObject gather_pred = NIL;
    SubLObject index_arg = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
    gather_arg = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
    gather_mt = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
    gather_pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
    index_arg = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$7 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list35 );
      current_$7 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list35 );
      if( NIL == conses_high.member( current_$7, $list16, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$7 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list35 );
    }
    final SubLObject gather_argnum_tail = cdestructuring_bind.property_list_member( $kw17$GATHER_ARGNUM, current );
    final SubLObject gather_argnum = ( NIL != gather_argnum_tail ) ? conses_high.cadr( gather_argnum_tail ) : TWO_INTEGER;
    final SubLObject index_argnum_tail = cdestructuring_bind.property_list_member( $kw18$INDEX_ARGNUM, current );
    final SubLObject index_argnum = ( NIL != index_argnum_tail ) ? conses_high.cadr( index_argnum_tail ) : ONE_INTEGER;
    final SubLObject truth_tail = cdestructuring_bind.property_list_member( $kw10$TRUTH, current );
    final SubLObject truth = ( NIL != truth_tail ) ? conses_high.cadr( truth_tail ) : $kw11$TRUE;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw3$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject gather_arg_mt_pred_tuple = $sym36$GATHER_ARG_MT_PRED_TUPLE;
    return ConsesLow.list( $sym5$DO_LIST, ConsesLow.list( gather_arg_mt_pred_tuple, ConsesLow.list( $sym37$GATHER_SKSI_GAF_ARG_INDEX_VALUES_RELEVANT_PRED, index_arg, index_argnum, gather_argnum, truth ), $kw3$DONE,
        done ), ConsesLow.listS( $sym14$CDESTRUCTURING_BIND, ConsesLow.list( gather_arg, gather_mt, gather_pred ), gather_arg_mt_pred_tuple, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-macros.lisp", position = 5631L)
  public static SubLObject do_sksi_gaf_arg_index_relevant_pred(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject gather_sentence = NIL;
    SubLObject gather_mt = NIL;
    SubLObject index_arg = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    gather_sentence = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    gather_mt = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    index_arg = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$8 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list38 );
      current_$8 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list38 );
      if( NIL == conses_high.member( current_$8, $list22, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$8 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list38 );
    }
    final SubLObject index_argnum_tail = cdestructuring_bind.property_list_member( $kw18$INDEX_ARGNUM, current );
    final SubLObject index_argnum = ( NIL != index_argnum_tail ) ? conses_high.cadr( index_argnum_tail ) : ONE_INTEGER;
    final SubLObject truth_tail = cdestructuring_bind.property_list_member( $kw10$TRUTH, current );
    final SubLObject truth = ( NIL != truth_tail ) ? conses_high.cadr( truth_tail ) : $kw11$TRUE;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw3$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject gather_sentence_mt_pair = $sym39$GATHER_SENTENCE_MT_PAIR;
    return ConsesLow.list( $sym5$DO_LIST, ConsesLow.list( gather_sentence_mt_pair, ConsesLow.list( $sym40$GATHER_SKSI_GAF_ARG_INDEX_RELEVANT_PRED, index_arg, index_argnum, truth ), $kw3$DONE, done ), ConsesLow.listS(
        $sym14$CDESTRUCTURING_BIND, ConsesLow.list( gather_sentence, gather_mt ), gather_sentence_mt_pair, ConsesLow.append( body, NIL ) ) );
  }

  public static SubLObject declare_sksi_sks_mapping_macros_file()
  {
    SubLFiles.declareMacro( me, "do_sksi_gaf_lookup_index", "DO-SKSI-GAF-LOOKUP-INDEX" );
    SubLFiles.declareMacro( me, "do_sksi_predicate_extent_index", "DO-SKSI-PREDICATE-EXTENT-INDEX" );
    SubLFiles.declareMacro( me, "do_sksi_gaf_arg_index_values", "DO-SKSI-GAF-ARG-INDEX-VALUES" );
    SubLFiles.declareMacro( me, "do_sksi_gaf_arg_index", "DO-SKSI-GAF-ARG-INDEX" );
    SubLFiles.declareMacro( me, "do_sksi_gaf_arg_index_gp", "DO-SKSI-GAF-ARG-INDEX-GP" );
    SubLFiles.declareMacro( me, "do_sksi_gaf_arg_index_values_gp", "DO-SKSI-GAF-ARG-INDEX-VALUES-GP" );
    SubLFiles.declareMacro( me, "do_sksi_gaf_arg_index_values_relevant_pred", "DO-SKSI-GAF-ARG-INDEX-VALUES-RELEVANT-PRED" );
    SubLFiles.declareMacro( me, "do_sksi_gaf_arg_index_relevant_pred", "DO-SKSI-GAF-ARG-INDEX-RELEVANT-PRED" );
    return NIL;
  }

  public static SubLObject init_sksi_sks_mapping_macros_file()
  {
    return NIL;
  }

  public static SubLObject setup_sksi_sks_mapping_macros_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sksi_sks_mapping_macros_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sksi_sks_mapping_macros_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sksi_sks_mapping_macros_file();
  }
  static
  {
    me = new sksi_sks_mapping_macros();
    $list0 = ConsesLow.list( ConsesLow.list( makeSymbol( "SUPPORT-VAR" ), makeSymbol( "ASENT" ), makeSymbol( "SENSE" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list1 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw2$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw3$DONE = makeKeyword( "DONE" );
    $sym4$SUPPORT = makeUninternedSymbol( "SUPPORT" );
    $sym5$DO_LIST = makeSymbol( "DO-LIST" );
    $sym6$GATHER_SKSI_GAF_LOOKUP_INDEX = makeSymbol( "GATHER-SKSI-GAF-LOOKUP-INDEX" );
    $sym7$CLET = makeSymbol( "CLET" );
    $list8 = ConsesLow.list( ConsesLow.list( makeSymbol( "GATHER-SENTENCE" ), makeSymbol( "GATHER-MT" ), makeSymbol( "PREDICATE" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "TRUTH" ), makeKeyword( "TRUE" ) ),
        makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list9 = ConsesLow.list( makeKeyword( "TRUTH" ), makeKeyword( "DONE" ) );
    $kw10$TRUTH = makeKeyword( "TRUTH" );
    $kw11$TRUE = makeKeyword( "TRUE" );
    $sym12$GATHER_SENTENCE_MT_PAIR = makeUninternedSymbol( "GATHER-SENTENCE-MT-PAIR" );
    $sym13$GATHER_SKSI_PREDICATE_EXTENT_INDEX = makeSymbol( "GATHER-SKSI-PREDICATE-EXTENT-INDEX" );
    $sym14$CDESTRUCTURING_BIND = makeSymbol( "CDESTRUCTURING-BIND" );
    $list15 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "GATHER-ARG" ), makeSymbol( "GATHER-MT" ), makeSymbol( "INDEX-ARG" ), makeSymbol( "PREDICATE" ), makeSymbol( "&KEY" ), ConsesLow.list(
        makeSymbol( "GATHER-ARGNUM" ), TWO_INTEGER ), ConsesLow.list( makeSymbol( "INDEX-ARGNUM" ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "TRUTH" ), makeKeyword( "TRUE" ) ), makeSymbol( "DONE" )
    } ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list16 = ConsesLow.list( makeKeyword( "GATHER-ARGNUM" ), makeKeyword( "INDEX-ARGNUM" ), makeKeyword( "TRUTH" ), makeKeyword( "DONE" ) );
    $kw17$GATHER_ARGNUM = makeKeyword( "GATHER-ARGNUM" );
    $kw18$INDEX_ARGNUM = makeKeyword( "INDEX-ARGNUM" );
    $sym19$GATHER_ARG_MT_PAIR = makeUninternedSymbol( "GATHER-ARG-MT-PAIR" );
    $sym20$GATHER_SKSI_GAF_ARG_INDEX_VALUES = makeSymbol( "GATHER-SKSI-GAF-ARG-INDEX-VALUES" );
    $list21 = ConsesLow.list( ConsesLow.list( makeSymbol( "GATHER-SENTENCE" ), makeSymbol( "GATHER-MT" ), makeSymbol( "INDEX-ARG" ), makeSymbol( "PREDICATE" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol(
        "INDEX-ARGNUM" ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "TRUTH" ), makeKeyword( "TRUE" ) ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list22 = ConsesLow.list( makeKeyword( "INDEX-ARGNUM" ), makeKeyword( "TRUTH" ), makeKeyword( "DONE" ) );
    $sym23$GATHER_SENTENCE_MT_PAIR = makeUninternedSymbol( "GATHER-SENTENCE-MT-PAIR" );
    $sym24$GATHER_SKSI_GAF_ARG_INDEX = makeSymbol( "GATHER-SKSI-GAF-ARG-INDEX" );
    $sym25$GATHER_SENTENCE_MT_PAIR = makeUninternedSymbol( "GATHER-SENTENCE-MT-PAIR" );
    $sym26$WITH_ALL_SPEC_PREDICATES_AND_INVERSES = makeSymbol( "WITH-ALL-SPEC-PREDICATES-AND-INVERSES" );
    $sym27$SPEC_PRED = makeUninternedSymbol( "SPEC-PRED" );
    $sym28$INVERSE_MODE_ = makeUninternedSymbol( "INVERSE-MODE?" );
    $sym29$NEW_GATHER_ARGNUM = makeUninternedSymbol( "NEW-GATHER-ARGNUM" );
    $sym30$NEW_INDEX_ARGNUM = makeUninternedSymbol( "NEW-INDEX-ARGNUM" );
    $sym31$PROGN = makeSymbol( "PROGN" );
    $sym32$DO_ALL_SPEC_PREDICATES_AND_INVERSES = makeSymbol( "DO-ALL-SPEC-PREDICATES-AND-INVERSES" );
    $sym33$FIF = makeSymbol( "FIF" );
    $sym34$DO_SKSI_GAF_ARG_INDEX_VALUES = makeSymbol( "DO-SKSI-GAF-ARG-INDEX-VALUES" );
    $list35 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "GATHER-ARG" ), makeSymbol( "GATHER-MT" ), makeSymbol( "GATHER-PRED" ), makeSymbol( "INDEX-ARG" ), makeSymbol( "&KEY" ), ConsesLow.list(
        makeSymbol( "GATHER-ARGNUM" ), TWO_INTEGER ), ConsesLow.list( makeSymbol( "INDEX-ARGNUM" ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "TRUTH" ), makeKeyword( "TRUE" ) ), makeSymbol( "DONE" )
    } ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym36$GATHER_ARG_MT_PRED_TUPLE = makeUninternedSymbol( "GATHER-ARG-MT-PRED-TUPLE" );
    $sym37$GATHER_SKSI_GAF_ARG_INDEX_VALUES_RELEVANT_PRED = makeSymbol( "GATHER-SKSI-GAF-ARG-INDEX-VALUES-RELEVANT-PRED" );
    $list38 = ConsesLow.list( ConsesLow.list( makeSymbol( "GATHER-SENTENCE" ), makeSymbol( "GATHER-MT" ), makeSymbol( "INDEX-ARG" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "INDEX-ARGNUM" ), ONE_INTEGER ),
        ConsesLow.list( makeSymbol( "TRUTH" ), makeKeyword( "TRUE" ) ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym39$GATHER_SENTENCE_MT_PAIR = makeUninternedSymbol( "GATHER-SENTENCE-MT-PAIR" );
    $sym40$GATHER_SKSI_GAF_ARG_INDEX_RELEVANT_PRED = makeSymbol( "GATHER-SKSI-GAF-ARG-INDEX-RELEVANT-PRED" );
  }
}
/*
 * 
 * Total time: 125 ms
 * 
 */