package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_ontology_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.kb_ontology_utilities";
  public static final String myFingerPrint = "43550809009aec731479827745073a6ebb7673416d86bd384cec4c6b0ce8e5d4";
  private static final SubLList $list0;
  private static final SubLList $list1;
  private static final SubLSymbol $kw2$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw3$MT;
  private static final SubLSymbol $kw4$DONE;
  private static final SubLSymbol $sym5$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE;
  private static final SubLSymbol $sym6$DO_KB_LOCAL_ISAS;
  private static final SubLSymbol $sym7$TERM_VAR;
  private static final SubLSymbol $sym8$CLET;
  private static final SubLSymbol $sym9$DO_GAF_ARG_INDEX_VALUES;
  private static final SubLSymbol $kw10$INDEX;
  private static final SubLSymbol $kw11$PREDICATE;
  private static final SubLObject $const12$isa;
  private static final SubLSymbol $kw13$TRUTH;
  private static final SubLSymbol $kw14$TRUE;
  private static final SubLSymbol $sym15$KB_LINK_WALK;
  private static final SubLList $list16;
  private static final SubLSymbol $sym17$DO_KB_LOCAL_INSTANCES;
  private static final SubLSymbol $sym18$COL_VAR;
  private static final SubLList $list19;
  private static final SubLSymbol $sym20$DO_KB_LOCAL_QUOTED_ISAS;
  private static final SubLSymbol $sym21$TERM_VAR;
  private static final SubLObject $const22$quotedIsa;
  private static final SubLSymbol $sym23$DO_KB_LOCAL_QUOTED_INSTANCES;
  private static final SubLSymbol $sym24$COL_VAR;
  private static final SubLList $list25;
  private static final SubLSymbol $sym26$DO_KB_LOCAL_GENLS;
  private static final SubLSymbol $sym27$COL_VAR;
  private static final SubLObject $const28$genls;
  private static final SubLList $list29;
  private static final SubLSymbol $sym30$DO_KB_LOCAL_SPECS;
  private static final SubLSymbol $sym31$COL_VAR;
  private static final SubLSymbol $kw32$GAF;

  @SubLTranslatedFile.SubL(source = "cycl/kb-ontology-utilities.lisp", position = 988L)
  public static SubLObject do_kb_local_isas(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject isa_var = NIL;
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    isa_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    v_term = current.first();
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
    final SubLObject mt_tail = cdestructuring_bind.property_list_member( $kw3$MT, current );
    final SubLObject mt = ( NIL != mt_tail ) ? conses_high.cadr( mt_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw4$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( NIL != mt )
    {
      return ConsesLow.list( $sym5$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE, mt, ConsesLow.listS( $sym6$DO_KB_LOCAL_ISAS, ConsesLow.list( isa_var, v_term, $kw4$DONE, done ), ConsesLow.append( body, NIL ) ) );
    }
    if( !v_term.isAtom() )
    {
      final SubLObject term_var = $sym7$TERM_VAR;
      return ConsesLow.list( $sym8$CLET, ConsesLow.list( ConsesLow.list( term_var, v_term ) ), ConsesLow.listS( $sym6$DO_KB_LOCAL_ISAS, ConsesLow.list( isa_var, term_var, $kw4$DONE, done ), ConsesLow.append( body,
          NIL ) ) );
    }
    return ConsesLow.listS( $sym9$DO_GAF_ARG_INDEX_VALUES, ConsesLow.list( new SubLObject[] { isa_var, v_term, TWO_INTEGER, $kw10$INDEX, ONE_INTEGER, $kw11$PREDICATE, $const12$isa, $kw13$TRUTH, $kw14$TRUE, $kw4$DONE,
      done
    } ), ConsesLow.list( $sym15$KB_LINK_WALK, v_term, isa_var ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-ontology-utilities.lisp", position = 1695L)
  public static SubLObject do_kb_local_instances(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list16 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject instance_var = NIL;
    SubLObject col = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list16 );
    instance_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list16 );
    col = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list16 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list16 );
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
      cdestructuring_bind.cdestructuring_bind_error( datum, $list16 );
    }
    final SubLObject mt_tail = cdestructuring_bind.property_list_member( $kw3$MT, current );
    final SubLObject mt = ( NIL != mt_tail ) ? conses_high.cadr( mt_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw4$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( NIL != mt )
    {
      return ConsesLow.list( $sym5$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE, mt, ConsesLow.listS( $sym17$DO_KB_LOCAL_INSTANCES, ConsesLow.list( instance_var, col, $kw4$DONE, done ), ConsesLow.append( body, NIL ) ) );
    }
    if( !col.isAtom() )
    {
      final SubLObject col_var = $sym18$COL_VAR;
      return ConsesLow.list( $sym8$CLET, ConsesLow.list( ConsesLow.list( col_var, col ) ), ConsesLow.listS( $sym17$DO_KB_LOCAL_INSTANCES, ConsesLow.list( instance_var, col_var, $kw4$DONE, done ), ConsesLow.append( body,
          NIL ) ) );
    }
    return ConsesLow.listS( $sym9$DO_GAF_ARG_INDEX_VALUES, ConsesLow.list( new SubLObject[] { instance_var, col, ONE_INTEGER, $kw10$INDEX, TWO_INTEGER, $kw11$PREDICATE, $const12$isa, $kw13$TRUTH, $kw14$TRUE, $kw4$DONE,
      done
    } ), ConsesLow.list( $sym15$KB_LINK_WALK, col, instance_var ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-ontology-utilities.lisp", position = 2250L)
  public static SubLObject do_kb_local_quoted_isas(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list19 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject quoted_isa_var = NIL;
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list19 );
    quoted_isa_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list19 );
    v_term = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$3 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list19 );
      current_$3 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list19 );
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
      cdestructuring_bind.cdestructuring_bind_error( datum, $list19 );
    }
    final SubLObject mt_tail = cdestructuring_bind.property_list_member( $kw3$MT, current );
    final SubLObject mt = ( NIL != mt_tail ) ? conses_high.cadr( mt_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw4$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( NIL != mt )
    {
      return ConsesLow.list( $sym5$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE, mt, ConsesLow.listS( $sym20$DO_KB_LOCAL_QUOTED_ISAS, ConsesLow.list( quoted_isa_var, v_term, $kw4$DONE, done ), ConsesLow.append( body, NIL ) ) );
    }
    if( !v_term.isAtom() )
    {
      final SubLObject term_var = $sym21$TERM_VAR;
      return ConsesLow.list( $sym8$CLET, ConsesLow.list( ConsesLow.list( term_var, v_term ) ), ConsesLow.listS( $sym20$DO_KB_LOCAL_QUOTED_ISAS, ConsesLow.list( quoted_isa_var, term_var, $kw4$DONE, done ), ConsesLow
          .append( body, NIL ) ) );
    }
    return ConsesLow.listS( $sym9$DO_GAF_ARG_INDEX_VALUES, ConsesLow.list( new SubLObject[] { quoted_isa_var, v_term, TWO_INTEGER, $kw10$INDEX, ONE_INTEGER, $kw11$PREDICATE, $const22$quotedIsa, $kw13$TRUTH, $kw14$TRUE,
      $kw4$DONE, done
    } ), ConsesLow.list( $sym15$KB_LINK_WALK, v_term, quoted_isa_var ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-ontology-utilities.lisp", position = 2837L)
  public static SubLObject do_kb_local_quoted_instances(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list16 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject instance_var = NIL;
    SubLObject col = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list16 );
    instance_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list16 );
    col = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$4 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list16 );
      current_$4 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list16 );
      if( NIL == conses_high.member( current_$4, $list1, UNPROVIDED, UNPROVIDED ) )
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
      cdestructuring_bind.cdestructuring_bind_error( datum, $list16 );
    }
    final SubLObject mt_tail = cdestructuring_bind.property_list_member( $kw3$MT, current );
    final SubLObject mt = ( NIL != mt_tail ) ? conses_high.cadr( mt_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw4$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( NIL != mt )
    {
      return ConsesLow.list( $sym5$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE, mt, ConsesLow.listS( $sym23$DO_KB_LOCAL_QUOTED_INSTANCES, ConsesLow.list( instance_var, col, $kw4$DONE, done ), ConsesLow.append( body, NIL ) ) );
    }
    if( !col.isAtom() )
    {
      final SubLObject col_var = $sym24$COL_VAR;
      return ConsesLow.list( $sym8$CLET, ConsesLow.list( ConsesLow.list( col_var, col ) ), ConsesLow.listS( $sym23$DO_KB_LOCAL_QUOTED_INSTANCES, ConsesLow.list( instance_var, col_var, $kw4$DONE, done ), ConsesLow.append(
          body, NIL ) ) );
    }
    return ConsesLow.listS( $sym9$DO_GAF_ARG_INDEX_VALUES, ConsesLow.list( new SubLObject[] { instance_var, col, ONE_INTEGER, $kw10$INDEX, TWO_INTEGER, $kw11$PREDICATE, $const22$quotedIsa, $kw13$TRUTH, $kw14$TRUE,
      $kw4$DONE, done
    } ), ConsesLow.list( $sym15$KB_LINK_WALK, col, instance_var ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-ontology-utilities.lisp", position = 3419L)
  public static SubLObject do_kb_local_genls(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject genl_var = NIL;
    SubLObject col = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
    genl_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
    col = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$5 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list25 );
      current_$5 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list25 );
      if( NIL == conses_high.member( current_$5, $list1, UNPROVIDED, UNPROVIDED ) )
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
      cdestructuring_bind.cdestructuring_bind_error( datum, $list25 );
    }
    final SubLObject mt_tail = cdestructuring_bind.property_list_member( $kw3$MT, current );
    final SubLObject mt = ( NIL != mt_tail ) ? conses_high.cadr( mt_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw4$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( NIL != mt )
    {
      return ConsesLow.list( $sym5$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE, mt, ConsesLow.listS( $sym26$DO_KB_LOCAL_GENLS, ConsesLow.list( genl_var, col, $kw4$DONE, done ), ConsesLow.append( body, NIL ) ) );
    }
    if( !col.isAtom() )
    {
      final SubLObject col_var = $sym27$COL_VAR;
      return ConsesLow.list( $sym8$CLET, ConsesLow.list( ConsesLow.list( col_var, col ) ), ConsesLow.listS( $sym26$DO_KB_LOCAL_GENLS, ConsesLow.list( genl_var, col_var, $kw4$DONE, done ), ConsesLow.append( body,
          NIL ) ) );
    }
    return ConsesLow.listS( $sym9$DO_GAF_ARG_INDEX_VALUES, ConsesLow.list( new SubLObject[] { genl_var, col, TWO_INTEGER, $kw10$INDEX, ONE_INTEGER, $kw11$PREDICATE, $const28$genls, $kw13$TRUTH, $kw14$TRUE, $kw4$DONE,
      done
    } ), ConsesLow.list( $sym15$KB_LINK_WALK, col, genl_var ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-ontology-utilities.lisp", position = 3945L)
  public static SubLObject do_kb_local_specs(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject spec_var = NIL;
    SubLObject col = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
    spec_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
    col = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$6 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list29 );
      current_$6 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list29 );
      if( NIL == conses_high.member( current_$6, $list1, UNPROVIDED, UNPROVIDED ) )
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
      cdestructuring_bind.cdestructuring_bind_error( datum, $list29 );
    }
    final SubLObject mt_tail = cdestructuring_bind.property_list_member( $kw3$MT, current );
    final SubLObject mt = ( NIL != mt_tail ) ? conses_high.cadr( mt_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw4$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( NIL != mt )
    {
      return ConsesLow.list( $sym5$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE, mt, ConsesLow.listS( $sym30$DO_KB_LOCAL_SPECS, ConsesLow.list( spec_var, col, $kw4$DONE, done ), ConsesLow.append( body, NIL ) ) );
    }
    if( !col.isAtom() )
    {
      final SubLObject col_var = $sym31$COL_VAR;
      return ConsesLow.list( $sym8$CLET, ConsesLow.list( ConsesLow.list( col_var, col ) ), ConsesLow.listS( $sym30$DO_KB_LOCAL_SPECS, ConsesLow.list( spec_var, col_var, $kw4$DONE, done ), ConsesLow.append( body,
          NIL ) ) );
    }
    return ConsesLow.listS( $sym9$DO_GAF_ARG_INDEX_VALUES, ConsesLow.list( new SubLObject[] { spec_var, col, ONE_INTEGER, $kw10$INDEX, TWO_INTEGER, $kw11$PREDICATE, $const28$genls, $kw13$TRUTH, $kw14$TRUE, $kw4$DONE,
      done
    } ), ConsesLow.list( $sym15$KB_LINK_WALK, col, spec_var ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-ontology-utilities.lisp", position = 4470L)
  public static SubLObject kb_link_walk(final SubLObject from, final SubLObject to)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-ontology-utilities.lisp", position = 4579L)
  public static SubLObject kb_isaP(final SubLObject v_term, final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject visited_genls = set.new_set( Symbols.symbol_function( EQ ), cardinality_estimates.isa_cardinality( v_term ) );
    final SubLObject unvisited_genls = queues.create_queue( UNPROVIDED );
    SubLObject successP = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject v_isa = NIL;
      final SubLObject pred_var = $const12$isa;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, ONE_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, ONE_INTEGER, pred_var );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw32$GAF, $kw14$TRUE, NIL );
              SubLObject done_var_$7 = NIL;
              final SubLObject token_var_$8 = NIL;
              while ( NIL == done_var_$7)
              {
                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$8 );
                final SubLObject valid_$9 = makeBoolean( !token_var_$8.eql( assertion ) );
                if( NIL != valid_$9 )
                {
                  v_isa = assertions_high.gaf_arg( assertion, TWO_INTEGER );
                  kb_link_walk( v_term, v_isa );
                  queues.enqueue( v_isa, unvisited_genls );
                }
                done_var_$7 = makeBoolean( NIL == valid_$9 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$10, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    while ( NIL == successP && NIL == queues.queue_empty_p( unvisited_genls ))
    {
      final SubLObject candidate = queues.dequeue( unvisited_genls );
      if( NIL == set.set_memberP( candidate, visited_genls ) )
      {
        set.set_add( candidate, visited_genls );
        if( candidate.eql( col ) )
        {
          successP = T;
        }
        else
        {
          final SubLObject mt_var2 = mt;
          final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding( thread );
          final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_6 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var2 ), thread );
            mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var2 ), thread );
            mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var2 ), thread );
            SubLObject next_genl = NIL;
            final SubLObject pred_var2 = $const28$genls;
            if( NIL == kb_mapping_macros.do_gaf_arg_index_key_validator( candidate, ONE_INTEGER, pred_var2 ) )
            {
              continue;
            }
            final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( candidate, ONE_INTEGER, pred_var2 );
            SubLObject done_var2 = NIL;
            final SubLObject token_var2 = NIL;
            while ( NIL == done_var2)
            {
              final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
              final SubLObject valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
              if( NIL != valid2 )
              {
                SubLObject final_index_iterator2 = NIL;
                try
                {
                  final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw32$GAF, $kw14$TRUE, NIL );
                  SubLObject done_var_$8 = NIL;
                  final SubLObject token_var_$9 = NIL;
                  while ( NIL == done_var_$8)
                  {
                    final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$9 );
                    final SubLObject valid_$10 = makeBoolean( !token_var_$9.eql( assertion2 ) );
                    if( NIL != valid_$10 )
                    {
                      next_genl = assertions_high.gaf_arg( assertion2, TWO_INTEGER );
                      kb_link_walk( candidate, next_genl );
                      if( NIL == set.set_memberP( next_genl, visited_genls ) )
                      {
                        queues.enqueue( next_genl, unvisited_genls );
                      }
                    }
                    done_var_$8 = makeBoolean( NIL == valid_$10 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator2 )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
                    }
                    Values.restoreValuesFromVector( _values2 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$11, thread );
                  }
                }
              }
              done_var2 = makeBoolean( NIL == valid2 );
            }
          }
          finally
          {
            mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_6, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_5, thread );
            mt_relevance_macros.$mt$.rebind( _prev_bind_4, thread );
          }
        }
      }
    }
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-ontology-utilities.lisp", position = 5511L)
  public static SubLObject kb_all_isa(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject visited_genls = set.new_set( Symbols.symbol_function( EQ ), cardinality_estimates.isa_cardinality( v_term ) );
    final SubLObject unvisited_genls = queues.create_queue( UNPROVIDED );
    SubLObject result = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject v_isa = NIL;
      final SubLObject pred_var = $const12$isa;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, ONE_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, ONE_INTEGER, pred_var );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw32$GAF, $kw14$TRUE, NIL );
              SubLObject done_var_$15 = NIL;
              final SubLObject token_var_$16 = NIL;
              while ( NIL == done_var_$15)
              {
                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$16 );
                final SubLObject valid_$17 = makeBoolean( !token_var_$16.eql( assertion ) );
                if( NIL != valid_$17 )
                {
                  v_isa = assertions_high.gaf_arg( assertion, TWO_INTEGER );
                  kb_link_walk( v_term, v_isa );
                  queues.enqueue( v_isa, unvisited_genls );
                }
                done_var_$15 = makeBoolean( NIL == valid_$17 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$18, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    while ( NIL == queues.queue_empty_p( unvisited_genls ))
    {
      final SubLObject candidate = queues.dequeue( unvisited_genls );
      if( NIL == set.set_memberP( candidate, visited_genls ) )
      {
        set.set_add( candidate, visited_genls );
        result = ConsesLow.cons( candidate, result );
        final SubLObject mt_var2 = mt;
        final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding( thread );
        final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_6 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var2 ), thread );
          mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var2 ), thread );
          mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var2 ), thread );
          SubLObject next_genl = NIL;
          final SubLObject pred_var2 = $const28$genls;
          if( NIL == kb_mapping_macros.do_gaf_arg_index_key_validator( candidate, ONE_INTEGER, pred_var2 ) )
          {
            continue;
          }
          final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( candidate, ONE_INTEGER, pred_var2 );
          SubLObject done_var2 = NIL;
          final SubLObject token_var2 = NIL;
          while ( NIL == done_var2)
          {
            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
            final SubLObject valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
            if( NIL != valid2 )
            {
              SubLObject final_index_iterator2 = NIL;
              try
              {
                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw32$GAF, $kw14$TRUE, NIL );
                SubLObject done_var_$16 = NIL;
                final SubLObject token_var_$17 = NIL;
                while ( NIL == done_var_$16)
                {
                  final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$17 );
                  final SubLObject valid_$18 = makeBoolean( !token_var_$17.eql( assertion2 ) );
                  if( NIL != valid_$18 )
                  {
                    next_genl = assertions_high.gaf_arg( assertion2, TWO_INTEGER );
                    kb_link_walk( candidate, next_genl );
                    if( NIL == set.set_memberP( next_genl, visited_genls ) )
                    {
                      queues.enqueue( next_genl, unvisited_genls );
                    }
                  }
                  done_var_$16 = makeBoolean( NIL == valid_$18 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values2 = Values.getValuesAsVector();
                  if( NIL != final_index_iterator2 )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
                  }
                  Values.restoreValuesFromVector( _values2 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$19, thread );
                }
              }
            }
            done_var2 = makeBoolean( NIL == valid2 );
          }
        }
        finally
        {
          mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_6, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_5, thread );
          mt_relevance_macros.$mt$.rebind( _prev_bind_4, thread );
        }
      }
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-ontology-utilities.lisp", position = 6219L)
  public static SubLObject kb_all_instances(final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject visited_specs = set.new_set( Symbols.symbol_function( EQ ), cardinality_estimates.spec_cardinality( col ) );
    final SubLObject unvisited_specs = queues.create_queue( UNPROVIDED );
    final SubLObject result_set = set.new_set( Symbols.symbol_function( EQ ), cardinality_estimates.instance_cardinality( col ) );
    SubLObject result = NIL;
    queues.enqueue( col, unvisited_specs );
    while ( NIL == queues.queue_empty_p( unvisited_specs ))
    {
      final SubLObject candidate = queues.dequeue( unvisited_specs );
      if( NIL == set.set_memberP( candidate, visited_specs ) )
      {
        set.set_add( candidate, visited_specs );
        SubLObject mt_var = mt;
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
          mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
          mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
          SubLObject instance = NIL;
          final SubLObject pred_var = $const12$isa;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( candidate, TWO_INTEGER, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( candidate, TWO_INTEGER, pred_var );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw32$GAF, $kw14$TRUE, NIL );
                  SubLObject done_var_$23 = NIL;
                  final SubLObject token_var_$24 = NIL;
                  while ( NIL == done_var_$23)
                  {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$24 );
                    final SubLObject valid_$25 = makeBoolean( !token_var_$24.eql( assertion ) );
                    if( NIL != valid_$25 )
                    {
                      instance = assertions_high.gaf_arg( assertion, ONE_INTEGER );
                      kb_link_walk( candidate, instance );
                      if( NIL == set.set_memberP( instance, result_set ) )
                      {
                        set.set_add( instance, result_set );
                        result = ConsesLow.cons( instance, result );
                      }
                    }
                    done_var_$23 = makeBoolean( NIL == valid_$25 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$26, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
        finally
        {
          mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
        }
        mt_var = mt;
        _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
        _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
          mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
          mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
          SubLObject next_spec = NIL;
          final SubLObject pred_var = $const28$genls;
          if( NIL == kb_mapping_macros.do_gaf_arg_index_key_validator( candidate, TWO_INTEGER, pred_var ) )
          {
            continue;
          }
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( candidate, TWO_INTEGER, pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw32$GAF, $kw14$TRUE, NIL );
                SubLObject done_var_$24 = NIL;
                final SubLObject token_var_$25 = NIL;
                while ( NIL == done_var_$24)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$25 );
                  final SubLObject valid_$26 = makeBoolean( !token_var_$25.eql( assertion ) );
                  if( NIL != valid_$26 )
                  {
                    next_spec = assertions_high.gaf_arg( assertion, ONE_INTEGER );
                    kb_link_walk( candidate, next_spec );
                    if( NIL == set.set_memberP( next_spec, visited_specs ) )
                    {
                      queues.enqueue( next_spec, unvisited_specs );
                    }
                  }
                  done_var_$24 = makeBoolean( NIL == valid_$26 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values2 = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values2 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$27, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
        finally
        {
          mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
        }
      }
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-ontology-utilities.lisp", position = 7083L)
  public static SubLObject kb_quoted_isaP(final SubLObject v_term, final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject visited_genls = set.new_set( Symbols.symbol_function( EQ ), cardinality_estimates.isa_cardinality( v_term ) );
    final SubLObject unvisited_genls = queues.create_queue( UNPROVIDED );
    SubLObject successP = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject quoted_isa = NIL;
      final SubLObject pred_var = $const22$quotedIsa;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, ONE_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, ONE_INTEGER, pred_var );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw32$GAF, $kw14$TRUE, NIL );
              SubLObject done_var_$31 = NIL;
              final SubLObject token_var_$32 = NIL;
              while ( NIL == done_var_$31)
              {
                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$32 );
                final SubLObject valid_$33 = makeBoolean( !token_var_$32.eql( assertion ) );
                if( NIL != valid_$33 )
                {
                  quoted_isa = assertions_high.gaf_arg( assertion, TWO_INTEGER );
                  kb_link_walk( v_term, quoted_isa );
                  queues.enqueue( quoted_isa, unvisited_genls );
                }
                done_var_$31 = makeBoolean( NIL == valid_$33 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$34, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    while ( NIL == successP && NIL == queues.queue_empty_p( unvisited_genls ))
    {
      final SubLObject candidate = queues.dequeue( unvisited_genls );
      if( NIL == set.set_memberP( candidate, visited_genls ) )
      {
        set.set_add( candidate, visited_genls );
        if( candidate.eql( col ) )
        {
          successP = T;
        }
        else
        {
          final SubLObject mt_var2 = mt;
          final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding( thread );
          final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_6 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var2 ), thread );
            mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var2 ), thread );
            mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var2 ), thread );
            SubLObject next_genl = NIL;
            final SubLObject pred_var2 = $const28$genls;
            if( NIL == kb_mapping_macros.do_gaf_arg_index_key_validator( candidate, ONE_INTEGER, pred_var2 ) )
            {
              continue;
            }
            final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( candidate, ONE_INTEGER, pred_var2 );
            SubLObject done_var2 = NIL;
            final SubLObject token_var2 = NIL;
            while ( NIL == done_var2)
            {
              final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
              final SubLObject valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
              if( NIL != valid2 )
              {
                SubLObject final_index_iterator2 = NIL;
                try
                {
                  final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw32$GAF, $kw14$TRUE, NIL );
                  SubLObject done_var_$32 = NIL;
                  final SubLObject token_var_$33 = NIL;
                  while ( NIL == done_var_$32)
                  {
                    final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$33 );
                    final SubLObject valid_$34 = makeBoolean( !token_var_$33.eql( assertion2 ) );
                    if( NIL != valid_$34 )
                    {
                      next_genl = assertions_high.gaf_arg( assertion2, TWO_INTEGER );
                      kb_link_walk( candidate, next_genl );
                      if( NIL == set.set_memberP( next_genl, visited_genls ) )
                      {
                        queues.enqueue( next_genl, unvisited_genls );
                      }
                    }
                    done_var_$32 = makeBoolean( NIL == valid_$34 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$35 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator2 )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
                    }
                    Values.restoreValuesFromVector( _values2 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$35, thread );
                  }
                }
              }
              done_var2 = makeBoolean( NIL == valid2 );
            }
          }
          finally
          {
            mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_6, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_5, thread );
            mt_relevance_macros.$mt$.rebind( _prev_bind_4, thread );
          }
        }
      }
    }
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-ontology-utilities.lisp", position = 8055L)
  public static SubLObject kb_all_quoted_isa(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject visited_genls = set.new_set( Symbols.symbol_function( EQ ), cardinality_estimates.isa_cardinality( v_term ) );
    final SubLObject unvisited_genls = queues.create_queue( UNPROVIDED );
    SubLObject result = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject quoted_isa = NIL;
      final SubLObject pred_var = $const22$quotedIsa;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, ONE_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, ONE_INTEGER, pred_var );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw32$GAF, $kw14$TRUE, NIL );
              SubLObject done_var_$39 = NIL;
              final SubLObject token_var_$40 = NIL;
              while ( NIL == done_var_$39)
              {
                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$40 );
                final SubLObject valid_$41 = makeBoolean( !token_var_$40.eql( assertion ) );
                if( NIL != valid_$41 )
                {
                  quoted_isa = assertions_high.gaf_arg( assertion, TWO_INTEGER );
                  kb_link_walk( v_term, quoted_isa );
                  queues.enqueue( quoted_isa, unvisited_genls );
                }
                done_var_$39 = makeBoolean( NIL == valid_$41 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$42 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$42, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    while ( NIL == queues.queue_empty_p( unvisited_genls ))
    {
      final SubLObject candidate = queues.dequeue( unvisited_genls );
      if( NIL == set.set_memberP( candidate, visited_genls ) )
      {
        set.set_add( candidate, visited_genls );
        result = ConsesLow.cons( candidate, result );
        final SubLObject mt_var2 = mt;
        final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding( thread );
        final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_6 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var2 ), thread );
          mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var2 ), thread );
          mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var2 ), thread );
          SubLObject next_genl = NIL;
          final SubLObject pred_var2 = $const28$genls;
          if( NIL == kb_mapping_macros.do_gaf_arg_index_key_validator( candidate, ONE_INTEGER, pred_var2 ) )
          {
            continue;
          }
          final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( candidate, ONE_INTEGER, pred_var2 );
          SubLObject done_var2 = NIL;
          final SubLObject token_var2 = NIL;
          while ( NIL == done_var2)
          {
            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
            final SubLObject valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
            if( NIL != valid2 )
            {
              SubLObject final_index_iterator2 = NIL;
              try
              {
                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw32$GAF, $kw14$TRUE, NIL );
                SubLObject done_var_$40 = NIL;
                final SubLObject token_var_$41 = NIL;
                while ( NIL == done_var_$40)
                {
                  final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$41 );
                  final SubLObject valid_$42 = makeBoolean( !token_var_$41.eql( assertion2 ) );
                  if( NIL != valid_$42 )
                  {
                    next_genl = assertions_high.gaf_arg( assertion2, TWO_INTEGER );
                    kb_link_walk( candidate, next_genl );
                    if( NIL == set.set_memberP( next_genl, visited_genls ) )
                    {
                      queues.enqueue( next_genl, unvisited_genls );
                    }
                  }
                  done_var_$40 = makeBoolean( NIL == valid_$42 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$43 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values2 = Values.getValuesAsVector();
                  if( NIL != final_index_iterator2 )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
                  }
                  Values.restoreValuesFromVector( _values2 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$43, thread );
                }
              }
            }
            done_var2 = makeBoolean( NIL == valid2 );
          }
        }
        finally
        {
          mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_6, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_5, thread );
          mt_relevance_macros.$mt$.rebind( _prev_bind_4, thread );
        }
      }
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-ontology-utilities.lisp", position = 8798L)
  public static SubLObject kb_all_quoted_instances(final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject visited_specs = set.new_set( Symbols.symbol_function( EQ ), cardinality_estimates.spec_cardinality( col ) );
    final SubLObject unvisited_specs = queues.create_queue( UNPROVIDED );
    final SubLObject result_set = set.new_set( Symbols.symbol_function( EQ ), cardinality_estimates.instance_cardinality( col ) );
    SubLObject result = NIL;
    queues.enqueue( col, unvisited_specs );
    while ( NIL == queues.queue_empty_p( unvisited_specs ))
    {
      final SubLObject candidate = queues.dequeue( unvisited_specs );
      if( NIL == set.set_memberP( candidate, visited_specs ) )
      {
        set.set_add( candidate, visited_specs );
        SubLObject mt_var = mt;
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
          mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
          mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
          SubLObject instance = NIL;
          final SubLObject pred_var = $const22$quotedIsa;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( candidate, TWO_INTEGER, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( candidate, TWO_INTEGER, pred_var );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw32$GAF, $kw14$TRUE, NIL );
                  SubLObject done_var_$47 = NIL;
                  final SubLObject token_var_$48 = NIL;
                  while ( NIL == done_var_$47)
                  {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$48 );
                    final SubLObject valid_$49 = makeBoolean( !token_var_$48.eql( assertion ) );
                    if( NIL != valid_$49 )
                    {
                      instance = assertions_high.gaf_arg( assertion, ONE_INTEGER );
                      kb_link_walk( candidate, instance );
                      if( NIL == set.set_memberP( instance, result_set ) )
                      {
                        set.set_add( instance, result_set );
                        result = ConsesLow.cons( instance, result );
                      }
                    }
                    done_var_$47 = makeBoolean( NIL == valid_$49 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$50 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$50, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
        finally
        {
          mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
        }
        mt_var = mt;
        _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
        _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
          mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
          mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
          SubLObject next_spec = NIL;
          final SubLObject pred_var = $const28$genls;
          if( NIL == kb_mapping_macros.do_gaf_arg_index_key_validator( candidate, TWO_INTEGER, pred_var ) )
          {
            continue;
          }
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( candidate, TWO_INTEGER, pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw32$GAF, $kw14$TRUE, NIL );
                SubLObject done_var_$48 = NIL;
                final SubLObject token_var_$49 = NIL;
                while ( NIL == done_var_$48)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$49 );
                  final SubLObject valid_$50 = makeBoolean( !token_var_$49.eql( assertion ) );
                  if( NIL != valid_$50 )
                  {
                    next_spec = assertions_high.gaf_arg( assertion, ONE_INTEGER );
                    kb_link_walk( candidate, next_spec );
                    if( NIL == set.set_memberP( next_spec, visited_specs ) )
                    {
                      queues.enqueue( next_spec, unvisited_specs );
                    }
                  }
                  done_var_$48 = makeBoolean( NIL == valid_$50 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$51 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values2 = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values2 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$51, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
        finally
        {
          mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
        }
      }
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-ontology-utilities.lisp", position = 9683L)
  public static SubLObject kb_genlP(final SubLObject spec, final SubLObject genl, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject visited_genls = set.new_set( Symbols.symbol_function( EQ ), cardinality_estimates.genl_cardinality( spec ) );
    final SubLObject unvisited_genls = queues.create_queue( UNPROVIDED );
    SubLObject successP = NIL;
    queues.enqueue( spec, unvisited_genls );
    while ( NIL == successP && NIL == queues.queue_empty_p( unvisited_genls ))
    {
      final SubLObject candidate = queues.dequeue( unvisited_genls );
      if( NIL == set.set_memberP( candidate, visited_genls ) )
      {
        set.set_add( candidate, visited_genls );
        if( candidate.eql( genl ) )
        {
          successP = T;
        }
        else
        {
          final SubLObject mt_var = mt;
          final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
          final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
            mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
            mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
            SubLObject next_genl = NIL;
            final SubLObject pred_var = $const28$genls;
            if( NIL == kb_mapping_macros.do_gaf_arg_index_key_validator( candidate, ONE_INTEGER, pred_var ) )
            {
              continue;
            }
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( candidate, ONE_INTEGER, pred_var );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw32$GAF, $kw14$TRUE, NIL );
                  SubLObject done_var_$55 = NIL;
                  final SubLObject token_var_$56 = NIL;
                  while ( NIL == done_var_$55)
                  {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$56 );
                    final SubLObject valid_$57 = makeBoolean( !token_var_$56.eql( assertion ) );
                    if( NIL != valid_$57 )
                    {
                      next_genl = assertions_high.gaf_arg( assertion, TWO_INTEGER );
                      kb_link_walk( candidate, next_genl );
                      if( NIL == set.set_memberP( next_genl, visited_genls ) )
                      {
                        queues.enqueue( next_genl, unvisited_genls );
                      }
                    }
                    done_var_$55 = makeBoolean( NIL == valid_$57 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$58 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$58, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
          finally
          {
            mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
            mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
          }
        }
      }
    }
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-ontology-utilities.lisp", position = 10589L)
  public static SubLObject kb_all_genls(final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject visited_genls = set.new_set( Symbols.symbol_function( EQ ), cardinality_estimates.isa_cardinality( col ) );
    final SubLObject unvisited_genls = queues.create_queue( UNPROVIDED );
    SubLObject result = NIL;
    queues.enqueue( col, unvisited_genls );
    while ( NIL == queues.queue_empty_p( unvisited_genls ))
    {
      final SubLObject candidate = queues.dequeue( unvisited_genls );
      if( NIL == set.set_memberP( candidate, visited_genls ) )
      {
        set.set_add( candidate, visited_genls );
        result = ConsesLow.cons( candidate, result );
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
          mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
          mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
          SubLObject next_genl = NIL;
          final SubLObject pred_var = $const28$genls;
          if( NIL == kb_mapping_macros.do_gaf_arg_index_key_validator( candidate, ONE_INTEGER, pred_var ) )
          {
            continue;
          }
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( candidate, ONE_INTEGER, pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw32$GAF, $kw14$TRUE, NIL );
                SubLObject done_var_$59 = NIL;
                final SubLObject token_var_$60 = NIL;
                while ( NIL == done_var_$59)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$60 );
                  final SubLObject valid_$61 = makeBoolean( !token_var_$60.eql( assertion ) );
                  if( NIL != valid_$61 )
                  {
                    next_genl = assertions_high.gaf_arg( assertion, TWO_INTEGER );
                    kb_link_walk( candidate, next_genl );
                    if( NIL == set.set_memberP( next_genl, visited_genls ) )
                    {
                      queues.enqueue( next_genl, unvisited_genls );
                    }
                  }
                  done_var_$59 = makeBoolean( NIL == valid_$61 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$62 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$62, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
        finally
        {
          mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
        }
      }
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-ontology-utilities.lisp", position = 11248L)
  public static SubLObject kb_all_specs(final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject visited_specs = set.new_set( Symbols.symbol_function( EQ ), cardinality_estimates.isa_cardinality( col ) );
    final SubLObject unvisited_specs = queues.create_queue( UNPROVIDED );
    SubLObject result = NIL;
    queues.enqueue( col, unvisited_specs );
    while ( NIL == queues.queue_empty_p( unvisited_specs ))
    {
      final SubLObject candidate = queues.dequeue( unvisited_specs );
      if( NIL == set.set_memberP( candidate, visited_specs ) )
      {
        set.set_add( candidate, visited_specs );
        result = ConsesLow.cons( candidate, result );
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
          mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
          mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
          SubLObject next_spec = NIL;
          final SubLObject pred_var = $const28$genls;
          if( NIL == kb_mapping_macros.do_gaf_arg_index_key_validator( candidate, TWO_INTEGER, pred_var ) )
          {
            continue;
          }
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( candidate, TWO_INTEGER, pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw32$GAF, $kw14$TRUE, NIL );
                SubLObject done_var_$63 = NIL;
                final SubLObject token_var_$64 = NIL;
                while ( NIL == done_var_$63)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$64 );
                  final SubLObject valid_$65 = makeBoolean( !token_var_$64.eql( assertion ) );
                  if( NIL != valid_$65 )
                  {
                    next_spec = assertions_high.gaf_arg( assertion, ONE_INTEGER );
                    kb_link_walk( candidate, next_spec );
                    if( NIL == set.set_memberP( next_spec, visited_specs ) )
                    {
                      queues.enqueue( next_spec, unvisited_specs );
                    }
                  }
                  done_var_$63 = makeBoolean( NIL == valid_$65 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$66 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$66, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
        finally
        {
          mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
        }
      }
    }
    return Sequences.nreverse( result );
  }

  public static SubLObject declare_kb_ontology_utilities_file()
  {
    SubLFiles.declareMacro( me, "do_kb_local_isas", "DO-KB-LOCAL-ISAS" );
    SubLFiles.declareMacro( me, "do_kb_local_instances", "DO-KB-LOCAL-INSTANCES" );
    SubLFiles.declareMacro( me, "do_kb_local_quoted_isas", "DO-KB-LOCAL-QUOTED-ISAS" );
    SubLFiles.declareMacro( me, "do_kb_local_quoted_instances", "DO-KB-LOCAL-QUOTED-INSTANCES" );
    SubLFiles.declareMacro( me, "do_kb_local_genls", "DO-KB-LOCAL-GENLS" );
    SubLFiles.declareMacro( me, "do_kb_local_specs", "DO-KB-LOCAL-SPECS" );
    SubLFiles.declareFunction( me, "kb_link_walk", "KB-LINK-WALK", 2, 0, false );
    SubLFiles.declareFunction( me, "kb_isaP", "KB-ISA?", 2, 1, false );
    SubLFiles.declareFunction( me, "kb_all_isa", "KB-ALL-ISA", 1, 1, false );
    SubLFiles.declareFunction( me, "kb_all_instances", "KB-ALL-INSTANCES", 1, 1, false );
    SubLFiles.declareFunction( me, "kb_quoted_isaP", "KB-QUOTED-ISA?", 2, 1, false );
    SubLFiles.declareFunction( me, "kb_all_quoted_isa", "KB-ALL-QUOTED-ISA", 1, 1, false );
    SubLFiles.declareFunction( me, "kb_all_quoted_instances", "KB-ALL-QUOTED-INSTANCES", 1, 1, false );
    SubLFiles.declareFunction( me, "kb_genlP", "KB-GENL?", 2, 1, false );
    SubLFiles.declareFunction( me, "kb_all_genls", "KB-ALL-GENLS", 1, 1, false );
    SubLFiles.declareFunction( me, "kb_all_specs", "KB-ALL-SPECS", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_kb_ontology_utilities_file()
  {
    return NIL;
  }

  public static SubLObject setup_kb_ontology_utilities_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_kb_ontology_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_kb_ontology_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_kb_ontology_utilities_file();
  }
  static
  {
    me = new kb_ontology_utilities();
    $list0 = ConsesLow.list( ConsesLow.list( makeSymbol( "ISA-VAR" ), makeSymbol( "TERM" ), makeSymbol( "&KEY" ), makeSymbol( "MT" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list1 = ConsesLow.list( makeKeyword( "MT" ), makeKeyword( "DONE" ) );
    $kw2$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw3$MT = makeKeyword( "MT" );
    $kw4$DONE = makeKeyword( "DONE" );
    $sym5$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE = makeSymbol( "POSSIBLY-WITH-INFERENCE-MT-RELEVANCE" );
    $sym6$DO_KB_LOCAL_ISAS = makeSymbol( "DO-KB-LOCAL-ISAS" );
    $sym7$TERM_VAR = makeUninternedSymbol( "TERM-VAR" );
    $sym8$CLET = makeSymbol( "CLET" );
    $sym9$DO_GAF_ARG_INDEX_VALUES = makeSymbol( "DO-GAF-ARG-INDEX-VALUES" );
    $kw10$INDEX = makeKeyword( "INDEX" );
    $kw11$PREDICATE = makeKeyword( "PREDICATE" );
    $const12$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $kw13$TRUTH = makeKeyword( "TRUTH" );
    $kw14$TRUE = makeKeyword( "TRUE" );
    $sym15$KB_LINK_WALK = makeSymbol( "KB-LINK-WALK" );
    $list16 = ConsesLow.list( ConsesLow.list( makeSymbol( "INSTANCE-VAR" ), makeSymbol( "COL" ), makeSymbol( "&KEY" ), makeSymbol( "MT" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym17$DO_KB_LOCAL_INSTANCES = makeSymbol( "DO-KB-LOCAL-INSTANCES" );
    $sym18$COL_VAR = makeUninternedSymbol( "COL-VAR" );
    $list19 = ConsesLow.list( ConsesLow.list( makeSymbol( "QUOTED-ISA-VAR" ), makeSymbol( "TERM" ), makeSymbol( "&KEY" ), makeSymbol( "MT" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym20$DO_KB_LOCAL_QUOTED_ISAS = makeSymbol( "DO-KB-LOCAL-QUOTED-ISAS" );
    $sym21$TERM_VAR = makeUninternedSymbol( "TERM-VAR" );
    $const22$quotedIsa = constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) );
    $sym23$DO_KB_LOCAL_QUOTED_INSTANCES = makeSymbol( "DO-KB-LOCAL-QUOTED-INSTANCES" );
    $sym24$COL_VAR = makeUninternedSymbol( "COL-VAR" );
    $list25 = ConsesLow.list( ConsesLow.list( makeSymbol( "GENL-VAR" ), makeSymbol( "COL" ), makeSymbol( "&KEY" ), makeSymbol( "MT" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym26$DO_KB_LOCAL_GENLS = makeSymbol( "DO-KB-LOCAL-GENLS" );
    $sym27$COL_VAR = makeUninternedSymbol( "COL-VAR" );
    $const28$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $list29 = ConsesLow.list( ConsesLow.list( makeSymbol( "SPEC-VAR" ), makeSymbol( "COL" ), makeSymbol( "&KEY" ), makeSymbol( "MT" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym30$DO_KB_LOCAL_SPECS = makeSymbol( "DO-KB-LOCAL-SPECS" );
    $sym31$COL_VAR = makeUninternedSymbol( "COL-VAR" );
    $kw32$GAF = makeKeyword( "GAF" );
  }
}
/*
 * 
 * Total time: 849 ms
 * 
 */