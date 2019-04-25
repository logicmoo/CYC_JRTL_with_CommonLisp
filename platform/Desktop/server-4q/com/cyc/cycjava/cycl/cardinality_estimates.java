package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import java.util.Map;
import java.util.Iterator;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cardinality_estimates
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cardinality_estimates";
  public static final String myFingerPrint = "f29841a1f2bd4cca3057e724996a7721a5b061040ff1ddcf74b61b8d2e28c6d0";
  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 7514L)
  private static SubLSymbol $local_instance_cardinality$;
  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 8017L)
  private static SubLSymbol $local_quoted_instance_cardinality$;
  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 8583L)
  private static SubLSymbol $local_spec_cardinality$;
  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 8904L)
  private static SubLSymbol $total_instance_cardinality$;
  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 9410L)
  private static SubLSymbol $total_quoted_instance_cardinality$;
  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 9978L)
  private static SubLSymbol $total_spec_cardinality$;
  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 10446L)
  private static SubLSymbol $total_genl_cardinality$;
  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 10767L)
  private static SubLSymbol $generality_estimate_table$;
  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 27100L)
  private static SubLSymbol $generality_estimate_scale_factor$;
  private static final SubLSymbol $sym0$FORT_OR_CHLMT_P;
  private static final SubLSymbol $sym1$FORT_P;
  private static final SubLSymbol $kw2$ASCENDING;
  private static final SubLSymbol $sym3$_;
  private static final SubLSymbol $sym4$GENERALITY_ESTIMATE;
  private static final SubLSymbol $kw5$DESCENDING;
  private static final SubLSymbol $sym6$_;
  private static final SubLSymbol $sym7$_LOCAL_INSTANCE_CARDINALITY_;
  private static final SubLSymbol $sym8$_LOCAL_QUOTED_INSTANCE_CARDINALITY_;
  private static final SubLSymbol $sym9$_LOCAL_SPEC_CARDINALITY_;
  private static final SubLSymbol $sym10$_TOTAL_INSTANCE_CARDINALITY_;
  private static final SubLSymbol $sym11$_TOTAL_QUOTED_INSTANCE_CARDINALITY_;
  private static final SubLSymbol $sym12$_TOTAL_SPEC_CARDINALITY_;
  private static final SubLSymbol $sym13$_TOTAL_GENL_CARDINALITY_;
  private static final SubLSymbol $sym14$_GENERALITY_ESTIMATE_TABLE_;
  private static final SubLSymbol $kw15$AREA;
  private static final SubLList $list16;
  private static final SubLList $list17;
  private static final SubLSymbol $kw18$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw19$PROGRESS_MESSAGE;
  private static final SubLSymbol $kw20$DONE;
  private static final SubLSymbol $sym21$MESSAGE_VAR;
  private static final SubLSymbol $sym22$MODULE_VAR;
  private static final SubLSymbol $sym23$TOTAL;
  private static final SubLSymbol $sym24$SOFAR;
  private static final SubLSymbol $sym25$CLET;
  private static final SubLSymbol $sym26$GET_SBHL_MODULE_SIZE;
  private static final SubLList $list27;
  private static final SubLSymbol $sym28$NOTING_PERCENT_PROGRESS;
  private static final SubLSymbol $sym29$DO_SBHL_MODULE_NODES;
  private static final SubLSymbol $sym30$NOTE_PERCENT_PROGRESS;
  private static final SubLSymbol $sym31$CINC;
  private static final SubLSymbol $sym32$MODULE_VAR;
  private static final SubLSymbol $sym33$LINK_VAR;
  private static final SubLSymbol $sym34$DO_SBHL_GRAPH_LINKS;
  private static final SubLSymbol $kw35$MODULE;
  private static final SubLSymbol $sym36$IGNORE;
  private static final SubLString $str37$Calculating_collection_local_spec;
  private static final SubLObject $const38$genls;
  private static final SubLSymbol $sym39$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const40$EverythingPSC;
  private static final SubLList $list41;
  private static final SubLString $str42$_A_is_neither_SET_P_nor_LISTP_;
  private static final SubLString $str43$Calculating_collection_local_inst;
  private static final SubLObject $const44$isa;
  private static final SubLString $str45$Calculating_collection_local_quot;
  private static final SubLObject $const46$quotedIsa;
  private static final SubLString $str47$Calculating_predicate_local_spec_;
  private static final SubLObject $const48$genlPreds;
  private static final SubLString $str49$Calculating_microtheory_local_spe;
  private static final SubLObject $const50$genlMt;
  private static final SubLString $str51$Calculating_other_local_instance_;
  private static final SubLSymbol $kw52$SKIP;
  private static final SubLString $str53$Calculating_collection_total_card;
  private static final SubLList $list54;
  private static final SubLString $str55$Calculating_predicate_total_cardi;
  private static final SubLList $list56;
  private static final SubLString $str57$Calculating_microtheory_total_car;
  private static final SubLList $list58;
  private static final SubLString $str59$Calculating_generality_estimates;
  private static final SubLInteger $int60$100;
  private static final SubLSymbol $sym61$GAF_ASSERTION_;
  private static final SubLObject $const62$disjointWith;
  private static final SubLSymbol $kw63$DEPTH;
  private static final SubLSymbol $kw64$STACK;
  private static final SubLSymbol $kw65$QUEUE;
  private static final SubLSymbol $sym66$RELEVANT_SBHL_TV_IS_GENERAL_TV;
  private static final SubLSymbol $kw67$ERROR;
  private static final SubLString $str68$_A_is_not_a__A;
  private static final SubLSymbol $sym69$SBHL_TRUE_TV_P;
  private static final SubLSymbol $kw70$CERROR;
  private static final SubLString $str71$continue_anyway;
  private static final SubLSymbol $kw72$WARN;
  private static final SubLString $str73$_A_is_not_a_valid__sbhl_type_erro;
  private static final SubLString $str74$attempting_to_bind_direction_link;
  private static final SubLString $str75$Node__a_does_not_pass_sbhl_type_t;
  private static final SubLSymbol $kw76$BREADTH;

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 1342L)
  public static SubLObject cardinality_estimates_initializedP()
  {
    return makeBoolean( NIL != $local_instance_cardinality$.getGlobalValue() && NIL == hash_table_utilities.hash_table_empty_p( $local_instance_cardinality$.getGlobalValue() ) && NIL != $local_instance_cardinality$
        .getGlobalValue() && NIL == hash_table_utilities.hash_table_empty_p( $local_instance_cardinality$.getGlobalValue() ) && NIL != $total_instance_cardinality$.getGlobalValue() && NIL == hash_table_utilities
            .hash_table_empty_p( $total_instance_cardinality$.getGlobalValue() ) && NIL != $local_quoted_instance_cardinality$.getGlobalValue() && NIL == hash_table_utilities.hash_table_empty_p(
                $local_quoted_instance_cardinality$.getGlobalValue() ) && NIL != $total_quoted_instance_cardinality$.getGlobalValue() && NIL == hash_table_utilities.hash_table_empty_p( $total_quoted_instance_cardinality$
                    .getGlobalValue() ) && NIL != $local_spec_cardinality$.getGlobalValue() && NIL == hash_table_utilities.hash_table_empty_p( $local_spec_cardinality$.getGlobalValue() )
        && NIL != $total_spec_cardinality$.getGlobalValue() && NIL == hash_table_utilities.hash_table_empty_p( $total_spec_cardinality$.getGlobalValue() ) && NIL != $total_genl_cardinality$.getGlobalValue()
        && NIL == hash_table_utilities.hash_table_empty_p( $total_genl_cardinality$.getGlobalValue() ) && NIL != $generality_estimate_table$.getGlobalValue() && NIL == hash_table_utilities.hash_table_empty_p(
            $generality_estimate_table$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 2326L)
  public static SubLObject rebuild_cardinality_estimates()
  {
    initialize_cardinalities();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 2420L)
  public static SubLObject initialize_cardinalities()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    setup_cardinality_tables( constant_handles.constant_count() );
    SubLObject sbhl_ms_resource = sbhl_marking_vars.new_sbhl_marking_space_resource( SIX_INTEGER );
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_ms_resource, thread );
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_marking_space_limit( sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue( thread ) ), thread );
      try
      {
        initialize_local_cardinalities();
        initialize_total_cardinalities();
        initialize_generality_estimates();
      }
      finally
      {
        final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          sbhl_ms_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue( thread );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$1, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_3, thread );
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_2, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 2761L)
  public static SubLObject isa_cardinality(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != hlmt.fort_or_chlmt_p( v_term ) : v_term;
    return control_vars.$average_all_isa_count$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 2935L)
  public static SubLObject instance_cardinality(final SubLObject v_term)
  {
    assert NIL != forts.fort_p( v_term ) : v_term;
    return total_instance_cardinality( v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 3108L)
  public static SubLObject quoted_instance_cardinality(final SubLObject v_term)
  {
    assert NIL != forts.fort_p( v_term ) : v_term;
    return total_quoted_instance_cardinality( v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 3295L)
  public static SubLObject genl_cardinality(final SubLObject v_term)
  {
    assert NIL != hlmt.fort_or_chlmt_p( v_term ) : v_term;
    return total_genl_cardinality( v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 3475L)
  public static SubLObject spec_cardinality(SubLObject v_term)
  {
    assert NIL != hlmt.fort_or_chlmt_p( v_term ) : v_term;
    if( NIL != hlmt.hlmt_naut_p( v_term ) )
    {
      v_term = hlmt.hlmt_monad_mt( v_term );
    }
    return total_spec_cardinality( v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 3722L)
  public static SubLObject use_cardinality(final SubLObject v_term)
  {
    assert NIL != hlmt.fort_or_chlmt_p( v_term ) : v_term;
    return Numbers.add( instance_cardinality( v_term ), spec_cardinality( v_term ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 3931L)
  public static SubLObject lightest_node(final SubLObject node_a, final SubLObject node_b)
  {
    final SubLObject weight_a = spec_cardinality( node_a );
    final SubLObject weight_b = spec_cardinality( node_b );
    if( weight_a.isNumber() && weight_b.isNumber() && weight_a.numG( weight_b ) )
    {
      return node_b;
    }
    return node_a;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 4291L)
  public static SubLObject shallowest_node(final SubLObject node_a, final SubLObject node_b)
  {
    final SubLObject depth_a = genl_cardinality( node_a );
    final SubLObject depth_b = genl_cardinality( node_b );
    if( depth_a.isNumber() && depth_b.isNumber() && depth_a.numG( depth_b ) )
    {
      return node_b;
    }
    return node_a;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 4621L)
  public static SubLObject generality_estimate(final SubLObject v_term)
  {
    if( NIL == hlmt.fort_or_chlmt_p( v_term ) )
    {
      return ZERO_INTEGER;
    }
    return get_generality_estimate( v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 4971L)
  public static SubLObject sort_by_generality_estimate(final SubLObject terms, SubLObject mode)
  {
    if( mode == UNPROVIDED )
    {
      mode = $kw2$ASCENDING;
    }
    final SubLObject pcase_var = mode;
    if( pcase_var.eql( $kw2$ASCENDING ) )
    {
      return Sort.sort( terms, Symbols.symbol_function( $sym3$_ ), Symbols.symbol_function( $sym4$GENERALITY_ESTIMATE ) );
    }
    if( pcase_var.eql( $kw5$DESCENDING ) )
    {
      return Sort.sort( terms, Symbols.symbol_function( $sym6$_ ), Symbols.symbol_function( $sym4$GENERALITY_ESTIMATE ) );
    }
    return terms;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 5455L)
  public static SubLObject stable_sort_by_generality_estimate(final SubLObject terms, SubLObject mode)
  {
    if( mode == UNPROVIDED )
    {
      mode = $kw2$ASCENDING;
    }
    final SubLObject pcase_var = mode;
    if( pcase_var.eql( $kw2$ASCENDING ) )
    {
      return Sort.stable_sort( terms, Symbols.symbol_function( $sym3$_ ), Symbols.symbol_function( $sym4$GENERALITY_ESTIMATE ) );
    }
    if( pcase_var.eql( $kw5$DESCENDING ) )
    {
      return Sort.stable_sort( terms, Symbols.symbol_function( $sym6$_ ), Symbols.symbol_function( $sym4$GENERALITY_ESTIMATE ) );
    }
    return terms;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 5864L)
  public static SubLObject generality_estimateL(final SubLObject term1, final SubLObject term2)
  {
    return Numbers.numL( generality_estimate( term1 ), generality_estimate( term2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 6245L)
  public static SubLObject generality_estimateG(final SubLObject term1, final SubLObject term2)
  {
    return Numbers.numG( generality_estimate( term1 ), generality_estimate( term2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 6733L)
  public static SubLObject most_general_term(final SubLObject terms)
  {
    return number_utilities.maximum( terms, $sym4$GENERALITY_ESTIMATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 6821L)
  public static SubLObject least_general_term(final SubLObject terms)
  {
    return number_utilities.minimum( terms, $sym4$GENERALITY_ESTIMATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 6910L)
  public static SubLObject instance_iteration_cost(final SubLObject v_term)
  {
    assert NIL != forts.fort_p( v_term ) : v_term;
    return instance_cardinality( v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 7152L)
  public static SubLObject quoted_instance_iteration_cost(final SubLObject v_term)
  {
    assert NIL != forts.fort_p( v_term ) : v_term;
    return quoted_instance_cardinality( v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 7368L)
  public static SubLObject clear_cardinalities()
  {
    clear_local_cardinalities();
    clear_total_cardinalities();
    clear_generality_estimates();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 7588L)
  public static SubLObject local_instance_cardinality(final SubLObject v_term)
  {
    return Hashtables.gethash_without_values( v_term, $local_instance_cardinality$.getGlobalValue(), ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 7709L)
  public static SubLObject set_local_instance_cardinality(final SubLObject v_term, final SubLObject count)
  {
    Hashtables.sethash( v_term, $local_instance_cardinality$.getGlobalValue(), count );
    return v_term;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 7859L)
  public static SubLObject increment_local_instance_cardinality(final SubLObject v_term, final SubLObject delta)
  {
    return set_local_instance_cardinality( v_term, Numbers.add( local_instance_cardinality( v_term ), delta ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 8105L)
  public static SubLObject local_quoted_instance_cardinality(final SubLObject v_term)
  {
    return Hashtables.gethash_without_values( v_term, $local_quoted_instance_cardinality$.getGlobalValue(), ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 8240L)
  public static SubLObject set_local_quoted_instance_cardinality(final SubLObject v_term, final SubLObject count)
  {
    Hashtables.sethash( v_term, $local_quoted_instance_cardinality$.getGlobalValue(), count );
    return v_term;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 8404L)
  public static SubLObject increment_local_quoted_instance_cardinality(final SubLObject v_term, final SubLObject delta)
  {
    return set_local_quoted_instance_cardinality( v_term, Numbers.add( local_quoted_instance_cardinality( v_term ), delta ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 8649L)
  public static SubLObject local_spec_cardinality(final SubLObject v_term)
  {
    return Hashtables.gethash_without_values( v_term, $local_spec_cardinality$.getGlobalValue(), ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 8762L)
  public static SubLObject set_local_spec_cardinality(final SubLObject v_term, final SubLObject count)
  {
    Hashtables.sethash( v_term, $local_spec_cardinality$.getGlobalValue(), count );
    return v_term;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 8979L)
  public static SubLObject total_instance_cardinality(final SubLObject v_term)
  {
    return Hashtables.gethash_without_values( v_term, $total_instance_cardinality$.getGlobalValue(), ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 9100L)
  public static SubLObject set_total_instance_cardinality(final SubLObject v_term, final SubLObject count)
  {
    Hashtables.sethash( v_term, $total_instance_cardinality$.getGlobalValue(), count );
    return v_term;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 9250L)
  public static SubLObject increment_total_instance_cardinality(final SubLObject v_term, final SubLObject delta)
  {
    return set_total_instance_cardinality( v_term, Numbers.add( total_instance_cardinality( v_term ), delta ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 9498L)
  public static SubLObject total_quoted_instance_cardinality(final SubLObject v_term)
  {
    return Hashtables.gethash_without_values( v_term, $total_quoted_instance_cardinality$.getGlobalValue(), ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 9633L)
  public static SubLObject set_total_quoted_instance_cardinality(final SubLObject v_term, final SubLObject count)
  {
    Hashtables.sethash( v_term, $total_quoted_instance_cardinality$.getGlobalValue(), count );
    return v_term;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 9797L)
  public static SubLObject increment_total_quoted_instance_cardinality(final SubLObject v_term, final SubLObject delta)
  {
    return set_total_quoted_instance_cardinality( v_term, Numbers.add( total_quoted_instance_cardinality( v_term ), delta ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 10043L)
  public static SubLObject total_spec_cardinality(final SubLObject v_term)
  {
    return Hashtables.gethash_without_values( v_term, $total_spec_cardinality$.getGlobalValue(), ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 10156L)
  public static SubLObject set_total_spec_cardinality(final SubLObject v_term, final SubLObject count)
  {
    Hashtables.sethash( v_term, $total_spec_cardinality$.getGlobalValue(), count );
    return v_term;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 10298L)
  public static SubLObject increment_total_spec_cardinality(final SubLObject v_term, final SubLObject delta)
  {
    return set_total_spec_cardinality( v_term, Numbers.add( total_spec_cardinality( v_term ), delta ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 10512L)
  public static SubLObject total_genl_cardinality(final SubLObject v_term)
  {
    return Hashtables.gethash_without_values( v_term, $total_genl_cardinality$.getGlobalValue(), ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 10625L)
  public static SubLObject set_total_genl_cardinality(final SubLObject v_term, final SubLObject count)
  {
    Hashtables.sethash( v_term, $total_genl_cardinality$.getGlobalValue(), count );
    return v_term;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 10844L)
  public static SubLObject get_generality_estimate(final SubLObject v_term)
  {
    if( !$generality_estimate_table$.getGlobalValue().isHashtable() )
    {
      return compute_generality_estimate( v_term );
    }
    return Hashtables.gethash_without_values( v_term, $generality_estimate_table$.getGlobalValue(), ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 11094L)
  public static SubLObject set_generality_estimate(final SubLObject v_term, final SubLObject estimate)
  {
    Hashtables.sethash( v_term, $generality_estimate_table$.getGlobalValue(), estimate );
    return v_term;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 11242L)
  public static SubLObject setup_cardinality_tables(final SubLObject estimated_size)
  {
    final SubLObject total_instance_cardinality_size;
    final SubLObject local_instance_cardinality_size = total_instance_cardinality_size = Numbers.integerDivide( estimated_size, TEN_INTEGER );
    final SubLObject total_quoted_instance_cardinality_size;
    final SubLObject local_quoted_instance_cardinality_size = total_quoted_instance_cardinality_size = Numbers.integerDivide( estimated_size, TEN_INTEGER );
    final SubLObject total_spec_cardinality_size;
    final SubLObject local_spec_cardinality_size = total_spec_cardinality_size = Numbers.integerDivide( estimated_size, TEN_INTEGER );
    final SubLObject generality_estimate_size;
    final SubLObject total_genl_cardinality_size = generality_estimate_size = total_spec_cardinality_size;
    if( !$local_instance_cardinality$.getGlobalValue().isHashtable() )
    {
      $local_instance_cardinality$.setGlobalValue( Hashtables.make_hash_table( local_instance_cardinality_size, Symbols.symbol_function( EQL ), ConsesLow.list( $kw15$AREA, control_vars.$table_area$
          .getGlobalValue() ) ) );
    }
    if( !$total_instance_cardinality$.getGlobalValue().isHashtable() )
    {
      $total_instance_cardinality$.setGlobalValue( Hashtables.make_hash_table( total_instance_cardinality_size, Symbols.symbol_function( EQL ), ConsesLow.list( $kw15$AREA, control_vars.$table_area$
          .getGlobalValue() ) ) );
    }
    if( !$local_quoted_instance_cardinality$.getGlobalValue().isHashtable() )
    {
      $local_quoted_instance_cardinality$.setGlobalValue( Hashtables.make_hash_table( local_quoted_instance_cardinality_size, Symbols.symbol_function( EQL ), ConsesLow.list( $kw15$AREA, control_vars.$table_area$
          .getGlobalValue() ) ) );
    }
    if( !$total_quoted_instance_cardinality$.getGlobalValue().isHashtable() )
    {
      $total_quoted_instance_cardinality$.setGlobalValue( Hashtables.make_hash_table( total_quoted_instance_cardinality_size, Symbols.symbol_function( EQL ), ConsesLow.list( $kw15$AREA, control_vars.$table_area$
          .getGlobalValue() ) ) );
    }
    if( !$local_spec_cardinality$.getGlobalValue().isHashtable() )
    {
      $local_spec_cardinality$.setGlobalValue( Hashtables.make_hash_table( local_spec_cardinality_size, Symbols.symbol_function( EQL ), ConsesLow.list( $kw15$AREA, control_vars.$table_area$.getGlobalValue() ) ) );
    }
    if( !$total_spec_cardinality$.getGlobalValue().isHashtable() )
    {
      $total_spec_cardinality$.setGlobalValue( Hashtables.make_hash_table( total_spec_cardinality_size, Symbols.symbol_function( EQL ), ConsesLow.list( $kw15$AREA, control_vars.$table_area$.getGlobalValue() ) ) );
    }
    if( !$total_genl_cardinality$.getGlobalValue().isHashtable() )
    {
      $total_genl_cardinality$.setGlobalValue( Hashtables.make_hash_table( total_genl_cardinality_size, Symbols.symbol_function( EQL ), ConsesLow.list( $kw15$AREA, control_vars.$table_area$.getGlobalValue() ) ) );
    }
    if( !$generality_estimate_table$.getGlobalValue().isHashtable() )
    {
      $generality_estimate_table$.setGlobalValue( Hashtables.make_hash_table( generality_estimate_size, Symbols.symbol_function( EQL ), ConsesLow.list( $kw15$AREA, control_vars.$table_area$.getGlobalValue() ) ) );
    }
    return estimated_size;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 13429L)
  public static SubLObject clear_local_cardinalities()
  {
    Hashtables.clrhash( $local_instance_cardinality$.getGlobalValue() );
    Hashtables.clrhash( $local_quoted_instance_cardinality$.getGlobalValue() );
    Hashtables.clrhash( $local_spec_cardinality$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 13614L)
  public static SubLObject initialize_local_cardinalities()
  {
    clear_local_cardinalities();
    initialize_collection_local_spec_cardinalities();
    initialize_collection_local_instance_cardinalities();
    initialize_collection_local_quoted_instance_cardinalities();
    initialize_predicate_local_spec_cardinalities();
    initialize_microtheory_local_spec_cardinalities();
    initialize_other_local_instance_cardinalities();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 14028L)
  public static SubLObject do_sbhl_module_nodes(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list16 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject node_var = NIL;
    SubLObject module = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list16 );
    node_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list16 );
    module = current.first();
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
      if( NIL == conses_high.member( current_$2, $list17, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw18$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list16 );
    }
    final SubLObject progress_message_tail = cdestructuring_bind.property_list_member( $kw19$PROGRESS_MESSAGE, current );
    final SubLObject progress_message = ( NIL != progress_message_tail ) ? conses_high.cadr( progress_message_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( NIL != progress_message )
    {
      final SubLObject message_var = $sym21$MESSAGE_VAR;
      final SubLObject module_var = $sym22$MODULE_VAR;
      final SubLObject total = $sym23$TOTAL;
      final SubLObject sofar = $sym24$SOFAR;
      return ConsesLow.list( $sym25$CLET, ConsesLow.list( ConsesLow.list( message_var, progress_message ), ConsesLow.list( module_var, module ), ConsesLow.list( total, ConsesLow.list( $sym26$GET_SBHL_MODULE_SIZE,
          module_var ) ), reader.bq_cons( sofar, $list27 ) ), ConsesLow.list( $sym28$NOTING_PERCENT_PROGRESS, message_var, ConsesLow.listS( $sym29$DO_SBHL_MODULE_NODES, ConsesLow.list( node_var, module_var, $kw20$DONE,
              done ), ConsesLow.list( $sym30$NOTE_PERCENT_PROGRESS, sofar, total ), ConsesLow.list( $sym31$CINC, total ), ConsesLow.append( body, NIL ) ) ) );
    }
    if( !module.isSymbol() )
    {
      final SubLObject module_var2 = $sym32$MODULE_VAR;
      return ConsesLow.list( $sym25$CLET, ConsesLow.list( ConsesLow.list( module_var2, module ) ), ConsesLow.listS( $sym29$DO_SBHL_MODULE_NODES, ConsesLow.list( node_var, module_var2, $kw20$DONE, done ), ConsesLow
          .append( body, NIL ) ) );
    }
    final SubLObject link_var = $sym33$LINK_VAR;
    return ConsesLow.listS( $sym34$DO_SBHL_GRAPH_LINKS, ConsesLow.list( node_var, link_var, $kw35$MODULE, module, $kw20$DONE, done ), ConsesLow.list( $sym36$IGNORE, link_var ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 14904L)
  public static SubLObject get_sbhl_module_size(final SubLObject module)
  {
    return Hashtables.hash_table_count( sbhl_module_utilities.get_sbhl_graph( module ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 15047L)
  public static SubLObject initialize_collection_local_spec_cardinalities()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject message = $str37$Calculating_collection_local_spec;
    final SubLObject module = sbhl_module_vars.get_sbhl_module( $const38$genls );
    SubLObject count = ZERO_INTEGER;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym39$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const40$EverythingPSC, thread );
      final SubLObject message_var = message;
      final SubLObject module_var = module;
      SubLObject total = get_sbhl_module_size( module_var );
      final SubLObject sofar = ZERO_INTEGER;
      final SubLObject _prev_bind_0_$3 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_1_$4 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
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
          utilities_macros.noting_percent_progress_preamble( message_var );
          final SubLObject _prev_bind_0_$4 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding( thread );
          final SubLObject _prev_bind_1_$5 = cfasl.$cfasl_common_symbols$.currentBinding( thread );
          try
          {
            file_vector_utilities.$file_vector_backed_map_read_lock$.bind( sbhl_graphs.$sbhl_file_vector_data_stream_lock$.getGlobalValue(), thread );
            cfasl.$cfasl_common_symbols$.bind( NIL, thread );
            cfasl.cfasl_set_common_symbols_simple( misc_utilities.get_hl_store_caches_shared_symbols_simple() );
            final SubLObject map = sbhl_module_utilities.get_sbhl_graph( module_var );
            SubLObject link_var = NIL;
            final SubLObject iterator = map_utilities.new_map_iterator( map );
            SubLObject valid;
            for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
            {
              thread.resetMultipleValues();
              final SubLObject var = iteration.iteration_next( iterator );
              valid = thread.secondMultipleValue();
              thread.resetMultipleValues();
              if( NIL != valid )
              {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject v_term = NIL;
                SubLObject impl_value = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
                v_term = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
                impl_value = current.first();
                current = current.rest();
                if( NIL == current )
                {
                  if( NIL == file_vector_utilities.file_vector_reference_p( impl_value ) || NIL == file_vector_utilities.file_vector_reference_deletedP( impl_value ) )
                  {
                    link_var = file_vector_utilities.file_vector_backed_map_wX_cache_get( map, sbhl_graphs.$sbhl_backing_file_vector$.getGlobalValue(), NIL, v_term, UNPROVIDED );
                    utilities_macros.note_percent_progress( sofar, total );
                    total = Numbers.add( total, ONE_INTEGER );
                    if( NIL != fort_types_interface.collection_p( v_term ) )
                    {
                      SubLObject local_specs = ZERO_INTEGER;
                      final SubLObject _prev_bind_0_$5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                      try
                      {
                        sbhl_module_vars.$sbhl_module$.bind( ( NIL != sbhl_module_vars.get_sbhl_module( $const38$genls ) ) ? sbhl_module_vars.get_sbhl_module( $const38$genls )
                            : sbhl_module_vars.$sbhl_module$.getDynamicValue( thread ), thread );
                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( v_term, sbhl_module_vars.get_sbhl_module( $const38$genls ) );
                        if( NIL != d_link )
                        {
                          SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions( sbhl_module_vars.get_sbhl_module( $const38$genls ) );
                          SubLObject direction = NIL;
                          direction = cdolist_list_var.first();
                          while ( NIL != cdolist_list_var)
                          {
                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, direction, sbhl_module_vars.get_sbhl_module( $const38$genls ) );
                            if( NIL != mt_links && direction.eql( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const38$genls ) ) ) )
                            {
                              SubLObject iteration_state;
                              for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                  iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                              {
                                thread.resetMultipleValues();
                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                final SubLObject tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                SubLObject iteration_state_$8;
                                for( iteration_state_$8 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                    iteration_state_$8 ); iteration_state_$8 = dictionary_contents.do_dictionary_contents_next( iteration_state_$8 ) )
                                {
                                  thread.resetMultipleValues();
                                  final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$8 );
                                  final SubLObject link_nodes_var = thread.secondMultipleValue();
                                  thread.resetMultipleValues();
                                  if( NIL != sbhl_search_vars.sbhl_true_tv_p( tv ) )
                                  {
                                    final SubLObject sol = link_nodes_var;
                                    if( NIL != set.set_p( sol ) )
                                    {
                                      final SubLObject set_contents_var = set.do_set_internal( sol );
                                      SubLObject basis_object;
                                      SubLObject state;
                                      SubLObject spec;
                                      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                          set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                      {
                                        spec = set_contents.do_set_contents_next( basis_object, state );
                                        if( NIL != set_contents.do_set_contents_element_validP( state, spec ) )
                                        {
                                          local_specs = Numbers.add( local_specs, ONE_INTEGER );
                                        }
                                      }
                                    }
                                    else if( sol.isList() )
                                    {
                                      SubLObject csome_list_var = sol;
                                      SubLObject spec2 = NIL;
                                      spec2 = csome_list_var.first();
                                      while ( NIL != csome_list_var)
                                      {
                                        local_specs = Numbers.add( local_specs, ONE_INTEGER );
                                        csome_list_var = csome_list_var.rest();
                                        spec2 = csome_list_var.first();
                                      }
                                    }
                                    else
                                    {
                                      Errors.error( $str42$_A_is_neither_SET_P_nor_LISTP_, sol );
                                    }
                                  }
                                }
                                dictionary_contents.do_dictionary_contents_finalize( iteration_state_$8 );
                              }
                              dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            direction = cdolist_list_var.first();
                          }
                        }
                      }
                      finally
                      {
                        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$5, thread );
                      }
                      if( local_specs.isPositive() )
                      {
                        count = Numbers.add( count, ONE_INTEGER );
                        set_local_spec_cardinality( v_term, local_specs );
                      }
                    }
                  }
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum, $list41 );
                }
              }
            }
          }
          finally
          {
            cfasl.$cfasl_common_symbols$.rebind( _prev_bind_1_$5, thread );
            file_vector_utilities.$file_vector_backed_map_read_lock$.rebind( _prev_bind_0_$4, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$6, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1_$4, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$3, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 15600L)
  public static SubLObject initialize_collection_local_instance_cardinalities()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject message = $str43$Calculating_collection_local_inst;
    final SubLObject module = sbhl_module_vars.get_sbhl_module( $const44$isa );
    SubLObject count = ZERO_INTEGER;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym39$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const40$EverythingPSC, thread );
      final SubLObject message_var = message;
      final SubLObject module_var = module;
      SubLObject total = get_sbhl_module_size( module_var );
      final SubLObject sofar = ZERO_INTEGER;
      final SubLObject _prev_bind_0_$10 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_1_$11 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
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
          utilities_macros.noting_percent_progress_preamble( message_var );
          final SubLObject _prev_bind_0_$11 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding( thread );
          final SubLObject _prev_bind_1_$12 = cfasl.$cfasl_common_symbols$.currentBinding( thread );
          try
          {
            file_vector_utilities.$file_vector_backed_map_read_lock$.bind( sbhl_graphs.$sbhl_file_vector_data_stream_lock$.getGlobalValue(), thread );
            cfasl.$cfasl_common_symbols$.bind( NIL, thread );
            cfasl.cfasl_set_common_symbols_simple( misc_utilities.get_hl_store_caches_shared_symbols_simple() );
            final SubLObject map = sbhl_module_utilities.get_sbhl_graph( module_var );
            SubLObject link_var = NIL;
            final SubLObject iterator = map_utilities.new_map_iterator( map );
            SubLObject valid;
            for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
            {
              thread.resetMultipleValues();
              final SubLObject var = iteration.iteration_next( iterator );
              valid = thread.secondMultipleValue();
              thread.resetMultipleValues();
              if( NIL != valid )
              {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject v_term = NIL;
                SubLObject impl_value = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
                v_term = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
                impl_value = current.first();
                current = current.rest();
                if( NIL == current )
                {
                  if( NIL == file_vector_utilities.file_vector_reference_p( impl_value ) || NIL == file_vector_utilities.file_vector_reference_deletedP( impl_value ) )
                  {
                    link_var = file_vector_utilities.file_vector_backed_map_wX_cache_get( map, sbhl_graphs.$sbhl_backing_file_vector$.getGlobalValue(), NIL, v_term, UNPROVIDED );
                    utilities_macros.note_percent_progress( sofar, total );
                    total = Numbers.add( total, ONE_INTEGER );
                    if( NIL != fort_types_interface.collection_p( v_term ) )
                    {
                      SubLObject local_instances = ZERO_INTEGER;
                      final SubLObject _prev_bind_0_$12 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                      try
                      {
                        sbhl_module_vars.$sbhl_module$.bind( ( NIL != sbhl_module_vars.get_sbhl_module( $const44$isa ) ) ? sbhl_module_vars.get_sbhl_module( $const44$isa )
                            : sbhl_module_vars.$sbhl_module$.getDynamicValue( thread ), thread );
                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( v_term, sbhl_module_vars.get_sbhl_module( $const44$isa ) );
                        if( NIL != d_link )
                        {
                          SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions( sbhl_module_vars.get_sbhl_module( $const44$isa ) );
                          SubLObject direction = NIL;
                          direction = cdolist_list_var.first();
                          while ( NIL != cdolist_list_var)
                          {
                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, direction, sbhl_module_vars.get_sbhl_module( $const44$isa ) );
                            if( NIL != mt_links && direction.eql( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const44$isa ) ) ) )
                            {
                              SubLObject iteration_state;
                              for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                  iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                              {
                                thread.resetMultipleValues();
                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                final SubLObject tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                SubLObject iteration_state_$15;
                                for( iteration_state_$15 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                    iteration_state_$15 ); iteration_state_$15 = dictionary_contents.do_dictionary_contents_next( iteration_state_$15 ) )
                                {
                                  thread.resetMultipleValues();
                                  final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$15 );
                                  final SubLObject link_nodes_var = thread.secondMultipleValue();
                                  thread.resetMultipleValues();
                                  if( NIL != sbhl_search_vars.sbhl_true_tv_p( tv ) )
                                  {
                                    final SubLObject sol = link_nodes_var;
                                    if( NIL != set.set_p( sol ) )
                                    {
                                      final SubLObject set_contents_var = set.do_set_internal( sol );
                                      SubLObject basis_object;
                                      SubLObject state;
                                      SubLObject instance;
                                      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                          set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                      {
                                        instance = set_contents.do_set_contents_next( basis_object, state );
                                        if( NIL != set_contents.do_set_contents_element_validP( state, instance ) )
                                        {
                                          local_instances = Numbers.add( local_instances, ONE_INTEGER );
                                        }
                                      }
                                    }
                                    else if( sol.isList() )
                                    {
                                      SubLObject csome_list_var = sol;
                                      SubLObject instance2 = NIL;
                                      instance2 = csome_list_var.first();
                                      while ( NIL != csome_list_var)
                                      {
                                        local_instances = Numbers.add( local_instances, ONE_INTEGER );
                                        csome_list_var = csome_list_var.rest();
                                        instance2 = csome_list_var.first();
                                      }
                                    }
                                    else
                                    {
                                      Errors.error( $str42$_A_is_neither_SET_P_nor_LISTP_, sol );
                                    }
                                  }
                                }
                                dictionary_contents.do_dictionary_contents_finalize( iteration_state_$15 );
                              }
                              dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            direction = cdolist_list_var.first();
                          }
                        }
                      }
                      finally
                      {
                        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$12, thread );
                      }
                      if( local_instances.isPositive() )
                      {
                        count = Numbers.add( count, ONE_INTEGER );
                        set_local_instance_cardinality( v_term, local_instances );
                      }
                    }
                  }
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum, $list41 );
                }
              }
            }
          }
          finally
          {
            cfasl.$cfasl_common_symbols$.rebind( _prev_bind_1_$12, thread );
            file_vector_utilities.$file_vector_backed_map_read_lock$.rebind( _prev_bind_0_$11, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$13, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1_$11, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$10, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 16191L)
  public static SubLObject initialize_collection_local_quoted_instance_cardinalities()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject message = $str45$Calculating_collection_local_quot;
    final SubLObject module = sbhl_module_vars.get_sbhl_module( $const46$quotedIsa );
    SubLObject count = ZERO_INTEGER;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym39$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const40$EverythingPSC, thread );
      final SubLObject message_var = message;
      final SubLObject module_var = module;
      SubLObject total = get_sbhl_module_size( module_var );
      final SubLObject sofar = ZERO_INTEGER;
      final SubLObject _prev_bind_0_$17 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_1_$18 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
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
          utilities_macros.noting_percent_progress_preamble( message_var );
          final SubLObject _prev_bind_0_$18 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding( thread );
          final SubLObject _prev_bind_1_$19 = cfasl.$cfasl_common_symbols$.currentBinding( thread );
          try
          {
            file_vector_utilities.$file_vector_backed_map_read_lock$.bind( sbhl_graphs.$sbhl_file_vector_data_stream_lock$.getGlobalValue(), thread );
            cfasl.$cfasl_common_symbols$.bind( NIL, thread );
            cfasl.cfasl_set_common_symbols_simple( misc_utilities.get_hl_store_caches_shared_symbols_simple() );
            final SubLObject map = sbhl_module_utilities.get_sbhl_graph( module_var );
            SubLObject link_var = NIL;
            final SubLObject iterator = map_utilities.new_map_iterator( map );
            SubLObject valid;
            for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
            {
              thread.resetMultipleValues();
              final SubLObject var = iteration.iteration_next( iterator );
              valid = thread.secondMultipleValue();
              thread.resetMultipleValues();
              if( NIL != valid )
              {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject v_term = NIL;
                SubLObject impl_value = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
                v_term = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
                impl_value = current.first();
                current = current.rest();
                if( NIL == current )
                {
                  if( NIL == file_vector_utilities.file_vector_reference_p( impl_value ) || NIL == file_vector_utilities.file_vector_reference_deletedP( impl_value ) )
                  {
                    link_var = file_vector_utilities.file_vector_backed_map_wX_cache_get( map, sbhl_graphs.$sbhl_backing_file_vector$.getGlobalValue(), NIL, v_term, UNPROVIDED );
                    utilities_macros.note_percent_progress( sofar, total );
                    total = Numbers.add( total, ONE_INTEGER );
                    if( NIL != fort_types_interface.collection_p( v_term ) )
                    {
                      SubLObject local_quoted_instances = ZERO_INTEGER;
                      final SubLObject _prev_bind_0_$19 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                      try
                      {
                        sbhl_module_vars.$sbhl_module$.bind( ( NIL != sbhl_module_vars.get_sbhl_module( $const46$quotedIsa ) ) ? sbhl_module_vars.get_sbhl_module( $const46$quotedIsa )
                            : sbhl_module_vars.$sbhl_module$.getDynamicValue( thread ), thread );
                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( v_term, sbhl_module_vars.get_sbhl_module( $const46$quotedIsa ) );
                        if( NIL != d_link )
                        {
                          SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions( sbhl_module_vars.get_sbhl_module( $const46$quotedIsa ) );
                          SubLObject direction = NIL;
                          direction = cdolist_list_var.first();
                          while ( NIL != cdolist_list_var)
                          {
                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, direction, sbhl_module_vars.get_sbhl_module( $const46$quotedIsa ) );
                            if( NIL != mt_links && direction.eql( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const46$quotedIsa ) ) ) )
                            {
                              SubLObject iteration_state;
                              for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                  iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                              {
                                thread.resetMultipleValues();
                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                final SubLObject tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                SubLObject iteration_state_$22;
                                for( iteration_state_$22 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                    iteration_state_$22 ); iteration_state_$22 = dictionary_contents.do_dictionary_contents_next( iteration_state_$22 ) )
                                {
                                  thread.resetMultipleValues();
                                  final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$22 );
                                  final SubLObject link_nodes_var = thread.secondMultipleValue();
                                  thread.resetMultipleValues();
                                  if( NIL != sbhl_search_vars.sbhl_true_tv_p( tv ) )
                                  {
                                    final SubLObject sol = link_nodes_var;
                                    if( NIL != set.set_p( sol ) )
                                    {
                                      final SubLObject set_contents_var = set.do_set_internal( sol );
                                      SubLObject basis_object;
                                      SubLObject state;
                                      SubLObject quoted_instance;
                                      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                          set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                      {
                                        quoted_instance = set_contents.do_set_contents_next( basis_object, state );
                                        if( NIL != set_contents.do_set_contents_element_validP( state, quoted_instance ) )
                                        {
                                          local_quoted_instances = Numbers.add( local_quoted_instances, ONE_INTEGER );
                                        }
                                      }
                                    }
                                    else if( sol.isList() )
                                    {
                                      SubLObject csome_list_var = sol;
                                      SubLObject quoted_instance2 = NIL;
                                      quoted_instance2 = csome_list_var.first();
                                      while ( NIL != csome_list_var)
                                      {
                                        local_quoted_instances = Numbers.add( local_quoted_instances, ONE_INTEGER );
                                        csome_list_var = csome_list_var.rest();
                                        quoted_instance2 = csome_list_var.first();
                                      }
                                    }
                                    else
                                    {
                                      Errors.error( $str42$_A_is_neither_SET_P_nor_LISTP_, sol );
                                    }
                                  }
                                }
                                dictionary_contents.do_dictionary_contents_finalize( iteration_state_$22 );
                              }
                              dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            direction = cdolist_list_var.first();
                          }
                        }
                      }
                      finally
                      {
                        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$19, thread );
                      }
                      if( local_quoted_instances.isPositive() )
                      {
                        count = Numbers.add( count, ONE_INTEGER );
                        set_local_quoted_instance_cardinality( v_term, local_quoted_instances );
                      }
                    }
                  }
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum, $list41 );
                }
              }
            }
          }
          finally
          {
            cfasl.$cfasl_common_symbols$.rebind( _prev_bind_1_$19, thread );
            file_vector_utilities.$file_vector_backed_map_read_lock$.rebind( _prev_bind_0_$18, thread );
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
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1_$18, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$17, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 16858L)
  public static SubLObject initialize_predicate_local_spec_cardinalities()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject message = $str47$Calculating_predicate_local_spec_;
    final SubLObject module = sbhl_module_vars.get_sbhl_module( $const48$genlPreds );
    SubLObject count = ZERO_INTEGER;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym39$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const40$EverythingPSC, thread );
      final SubLObject message_var = message;
      final SubLObject module_var = module;
      SubLObject total = get_sbhl_module_size( module_var );
      final SubLObject sofar = ZERO_INTEGER;
      final SubLObject _prev_bind_0_$24 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_1_$25 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
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
          utilities_macros.noting_percent_progress_preamble( message_var );
          final SubLObject _prev_bind_0_$25 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding( thread );
          final SubLObject _prev_bind_1_$26 = cfasl.$cfasl_common_symbols$.currentBinding( thread );
          try
          {
            file_vector_utilities.$file_vector_backed_map_read_lock$.bind( sbhl_graphs.$sbhl_file_vector_data_stream_lock$.getGlobalValue(), thread );
            cfasl.$cfasl_common_symbols$.bind( NIL, thread );
            cfasl.cfasl_set_common_symbols_simple( misc_utilities.get_hl_store_caches_shared_symbols_simple() );
            final SubLObject map = sbhl_module_utilities.get_sbhl_graph( module_var );
            SubLObject link_var = NIL;
            final SubLObject iterator = map_utilities.new_map_iterator( map );
            SubLObject valid;
            for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
            {
              thread.resetMultipleValues();
              final SubLObject var = iteration.iteration_next( iterator );
              valid = thread.secondMultipleValue();
              thread.resetMultipleValues();
              if( NIL != valid )
              {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject v_term = NIL;
                SubLObject impl_value = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
                v_term = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
                impl_value = current.first();
                current = current.rest();
                if( NIL == current )
                {
                  if( NIL == file_vector_utilities.file_vector_reference_p( impl_value ) || NIL == file_vector_utilities.file_vector_reference_deletedP( impl_value ) )
                  {
                    link_var = file_vector_utilities.file_vector_backed_map_wX_cache_get( map, sbhl_graphs.$sbhl_backing_file_vector$.getGlobalValue(), NIL, v_term, UNPROVIDED );
                    utilities_macros.note_percent_progress( sofar, total );
                    total = Numbers.add( total, ONE_INTEGER );
                    if( NIL != fort_types_interface.predicate_p( v_term ) )
                    {
                      count = Numbers.add( count, ONE_INTEGER );
                      SubLObject local_specs = ZERO_INTEGER;
                      final SubLObject _prev_bind_0_$26 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                      try
                      {
                        sbhl_module_vars.$sbhl_module$.bind( ( NIL != sbhl_module_vars.get_sbhl_module( $const48$genlPreds ) ) ? sbhl_module_vars.get_sbhl_module( $const48$genlPreds )
                            : sbhl_module_vars.$sbhl_module$.getDynamicValue( thread ), thread );
                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( v_term, sbhl_module_vars.get_sbhl_module( $const48$genlPreds ) );
                        if( NIL != d_link )
                        {
                          SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions( sbhl_module_vars.get_sbhl_module( $const48$genlPreds ) );
                          SubLObject direction = NIL;
                          direction = cdolist_list_var.first();
                          while ( NIL != cdolist_list_var)
                          {
                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, direction, sbhl_module_vars.get_sbhl_module( $const48$genlPreds ) );
                            if( NIL != mt_links && direction.eql( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const48$genlPreds ) ) ) )
                            {
                              SubLObject iteration_state;
                              for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                  iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                              {
                                thread.resetMultipleValues();
                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                final SubLObject tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                SubLObject iteration_state_$29;
                                for( iteration_state_$29 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                    iteration_state_$29 ); iteration_state_$29 = dictionary_contents.do_dictionary_contents_next( iteration_state_$29 ) )
                                {
                                  thread.resetMultipleValues();
                                  final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$29 );
                                  final SubLObject link_nodes_var = thread.secondMultipleValue();
                                  thread.resetMultipleValues();
                                  if( NIL != sbhl_search_vars.sbhl_true_tv_p( tv ) )
                                  {
                                    final SubLObject sol = link_nodes_var;
                                    if( NIL != set.set_p( sol ) )
                                    {
                                      final SubLObject set_contents_var = set.do_set_internal( sol );
                                      SubLObject basis_object;
                                      SubLObject state;
                                      SubLObject spec_pred;
                                      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                          set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                      {
                                        spec_pred = set_contents.do_set_contents_next( basis_object, state );
                                        if( NIL != set_contents.do_set_contents_element_validP( state, spec_pred ) )
                                        {
                                          local_specs = Numbers.add( local_specs, ONE_INTEGER );
                                        }
                                      }
                                    }
                                    else if( sol.isList() )
                                    {
                                      SubLObject csome_list_var = sol;
                                      SubLObject spec_pred2 = NIL;
                                      spec_pred2 = csome_list_var.first();
                                      while ( NIL != csome_list_var)
                                      {
                                        local_specs = Numbers.add( local_specs, ONE_INTEGER );
                                        csome_list_var = csome_list_var.rest();
                                        spec_pred2 = csome_list_var.first();
                                      }
                                    }
                                    else
                                    {
                                      Errors.error( $str42$_A_is_neither_SET_P_nor_LISTP_, sol );
                                    }
                                  }
                                }
                                dictionary_contents.do_dictionary_contents_finalize( iteration_state_$29 );
                              }
                              dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            direction = cdolist_list_var.first();
                          }
                        }
                      }
                      finally
                      {
                        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$26, thread );
                      }
                      set_local_spec_cardinality( v_term, local_specs );
                    }
                  }
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum, $list41 );
                }
              }
            }
          }
          finally
          {
            cfasl.$cfasl_common_symbols$.rebind( _prev_bind_1_$26, thread );
            file_vector_utilities.$file_vector_backed_map_read_lock$.rebind( _prev_bind_0_$25, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$27, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1_$25, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$24, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 17393L)
  public static SubLObject initialize_microtheory_local_spec_cardinalities()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject message = $str49$Calculating_microtheory_local_spe;
    final SubLObject module = sbhl_module_vars.get_sbhl_module( $const50$genlMt );
    SubLObject count = ZERO_INTEGER;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym39$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const40$EverythingPSC, thread );
      final SubLObject message_var = message;
      final SubLObject module_var = module;
      SubLObject total = get_sbhl_module_size( module_var );
      final SubLObject sofar = ZERO_INTEGER;
      final SubLObject _prev_bind_0_$31 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_1_$32 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
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
          utilities_macros.noting_percent_progress_preamble( message_var );
          final SubLObject _prev_bind_0_$32 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding( thread );
          final SubLObject _prev_bind_1_$33 = cfasl.$cfasl_common_symbols$.currentBinding( thread );
          try
          {
            file_vector_utilities.$file_vector_backed_map_read_lock$.bind( sbhl_graphs.$sbhl_file_vector_data_stream_lock$.getGlobalValue(), thread );
            cfasl.$cfasl_common_symbols$.bind( NIL, thread );
            cfasl.cfasl_set_common_symbols_simple( misc_utilities.get_hl_store_caches_shared_symbols_simple() );
            final SubLObject map = sbhl_module_utilities.get_sbhl_graph( module_var );
            SubLObject link_var = NIL;
            final SubLObject iterator = map_utilities.new_map_iterator( map );
            SubLObject valid;
            for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
            {
              thread.resetMultipleValues();
              final SubLObject var = iteration.iteration_next( iterator );
              valid = thread.secondMultipleValue();
              thread.resetMultipleValues();
              if( NIL != valid )
              {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject v_term = NIL;
                SubLObject impl_value = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
                v_term = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
                impl_value = current.first();
                current = current.rest();
                if( NIL == current )
                {
                  if( NIL == file_vector_utilities.file_vector_reference_p( impl_value ) || NIL == file_vector_utilities.file_vector_reference_deletedP( impl_value ) )
                  {
                    link_var = file_vector_utilities.file_vector_backed_map_wX_cache_get( map, sbhl_graphs.$sbhl_backing_file_vector$.getGlobalValue(), NIL, v_term, UNPROVIDED );
                    utilities_macros.note_percent_progress( sofar, total );
                    total = Numbers.add( total, ONE_INTEGER );
                    if( NIL != fort_types_interface.microtheory_p( v_term ) )
                    {
                      count = Numbers.add( count, ONE_INTEGER );
                      SubLObject local_specs = ZERO_INTEGER;
                      final SubLObject _prev_bind_0_$33 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                      try
                      {
                        sbhl_module_vars.$sbhl_module$.bind( ( NIL != sbhl_module_vars.get_sbhl_module( $const50$genlMt ) ) ? sbhl_module_vars.get_sbhl_module( $const50$genlMt )
                            : sbhl_module_vars.$sbhl_module$.getDynamicValue( thread ), thread );
                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( v_term, sbhl_module_vars.get_sbhl_module( $const50$genlMt ) );
                        if( NIL != d_link )
                        {
                          SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions( sbhl_module_vars.get_sbhl_module( $const50$genlMt ) );
                          SubLObject direction = NIL;
                          direction = cdolist_list_var.first();
                          while ( NIL != cdolist_list_var)
                          {
                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, direction, sbhl_module_vars.get_sbhl_module( $const50$genlMt ) );
                            if( NIL != mt_links && direction.eql( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const50$genlMt ) ) ) )
                            {
                              SubLObject iteration_state;
                              for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                  iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                              {
                                thread.resetMultipleValues();
                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                final SubLObject tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                SubLObject iteration_state_$36;
                                for( iteration_state_$36 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                    iteration_state_$36 ); iteration_state_$36 = dictionary_contents.do_dictionary_contents_next( iteration_state_$36 ) )
                                {
                                  thread.resetMultipleValues();
                                  final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$36 );
                                  final SubLObject link_nodes_var = thread.secondMultipleValue();
                                  thread.resetMultipleValues();
                                  if( NIL != sbhl_search_vars.sbhl_true_tv_p( tv ) )
                                  {
                                    final SubLObject sol = link_nodes_var;
                                    if( NIL != set.set_p( sol ) )
                                    {
                                      final SubLObject set_contents_var = set.do_set_internal( sol );
                                      SubLObject basis_object;
                                      SubLObject state;
                                      SubLObject spec;
                                      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                          set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                      {
                                        spec = set_contents.do_set_contents_next( basis_object, state );
                                        if( NIL != set_contents.do_set_contents_element_validP( state, spec ) )
                                        {
                                          local_specs = Numbers.add( local_specs, ONE_INTEGER );
                                        }
                                      }
                                    }
                                    else if( sol.isList() )
                                    {
                                      SubLObject csome_list_var = sol;
                                      SubLObject spec2 = NIL;
                                      spec2 = csome_list_var.first();
                                      while ( NIL != csome_list_var)
                                      {
                                        local_specs = Numbers.add( local_specs, ONE_INTEGER );
                                        csome_list_var = csome_list_var.rest();
                                        spec2 = csome_list_var.first();
                                      }
                                    }
                                    else
                                    {
                                      Errors.error( $str42$_A_is_neither_SET_P_nor_LISTP_, sol );
                                    }
                                  }
                                }
                                dictionary_contents.do_dictionary_contents_finalize( iteration_state_$36 );
                              }
                              dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            direction = cdolist_list_var.first();
                          }
                        }
                      }
                      finally
                      {
                        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$33, thread );
                      }
                      set_local_spec_cardinality( v_term, local_specs );
                    }
                  }
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum, $list41 );
                }
              }
            }
          }
          finally
          {
            cfasl.$cfasl_common_symbols$.rebind( _prev_bind_1_$33, thread );
            file_vector_utilities.$file_vector_backed_map_read_lock$.rebind( _prev_bind_0_$32, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$34, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1_$32, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$31, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 17914L)
  public static SubLObject initialize_other_local_instance_cardinalities()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject message = $str51$Calculating_other_local_instance_;
    SubLObject count = ZERO_INTEGER;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym39$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const40$EverythingPSC, thread );
      final SubLObject message_$38 = message;
      final SubLObject total = forts.fort_count();
      SubLObject sofar = ZERO_INTEGER;
      final SubLObject _prev_bind_0_$39 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_1_$40 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
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
          utilities_macros.noting_percent_progress_preamble( message_$38 );
          SubLObject cdolist_list_var = forts.do_forts_tables();
          SubLObject table_var = NIL;
          table_var = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            final SubLObject idx = table_var;
            if( NIL == id_index.id_index_objects_empty_p( idx, $kw52$SKIP ) )
            {
              final SubLObject idx_$41 = idx;
              if( NIL == id_index.id_index_dense_objects_empty_p( idx_$41, $kw52$SKIP ) )
              {
                final SubLObject vector_var = id_index.id_index_dense_objects( idx_$41 );
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_term;
                SubLObject uses;
                for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
                {
                  id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                  v_term = Vectors.aref( vector_var, id );
                  if( NIL == id_index.id_index_tombstone_p( v_term ) || NIL == id_index.id_index_skip_tombstones_p( $kw52$SKIP ) )
                  {
                    if( NIL != id_index.id_index_tombstone_p( v_term ) )
                    {
                      v_term = $kw52$SKIP;
                    }
                    sofar = Numbers.add( sofar, ONE_INTEGER );
                    utilities_macros.note_percent_progress( sofar, total );
                    uses = ZERO_INTEGER;
                    if( NIL != fort_types_interface.predicate_p( v_term ) )
                    {
                      uses = kb_indexing.num_predicate_extent_index( v_term, UNPROVIDED );
                    }
                    else if( NIL != fort_types_interface.microtheory_p( v_term ) )
                    {
                      uses = kb_indexing.num_mt_index( v_term );
                    }
                    else if( NIL != fort_types_interface.functionP( v_term ) )
                    {
                      uses = kb_indexing.num_function_extent_index( v_term );
                    }
                    if( uses.numG( ZERO_INTEGER ) )
                    {
                      count = Numbers.add( count, ONE_INTEGER );
                      set_local_instance_cardinality( v_term, uses );
                    }
                  }
                }
              }
              final SubLObject idx_$42 = idx;
              if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$42 ) || NIL == id_index.id_index_skip_tombstones_p( $kw52$SKIP ) )
              {
                final SubLObject sparse = id_index.id_index_sparse_objects( idx_$42 );
                SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$42 );
                final SubLObject end_id = id_index.id_index_next_id( idx_$42 );
                final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw52$SKIP ) ) ? NIL : $kw52$SKIP;
                while ( id2.numL( end_id ))
                {
                  final SubLObject v_term2 = Hashtables.gethash_without_values( id2, sparse, v_default );
                  if( NIL == id_index.id_index_skip_tombstones_p( $kw52$SKIP ) || NIL == id_index.id_index_tombstone_p( v_term2 ) )
                  {
                    sofar = Numbers.add( sofar, ONE_INTEGER );
                    utilities_macros.note_percent_progress( sofar, total );
                    SubLObject uses2 = ZERO_INTEGER;
                    if( NIL != fort_types_interface.predicate_p( v_term2 ) )
                    {
                      uses2 = kb_indexing.num_predicate_extent_index( v_term2, UNPROVIDED );
                    }
                    else if( NIL != fort_types_interface.microtheory_p( v_term2 ) )
                    {
                      uses2 = kb_indexing.num_mt_index( v_term2 );
                    }
                    else if( NIL != fort_types_interface.functionP( v_term2 ) )
                    {
                      uses2 = kb_indexing.num_function_extent_index( v_term2 );
                    }
                    if( uses2.numG( ZERO_INTEGER ) )
                    {
                      count = Numbers.add( count, ONE_INTEGER );
                      set_local_instance_cardinality( v_term2, uses2 );
                    }
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
          final SubLObject _prev_bind_0_$40 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$40, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1_$40, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$39, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 18470L)
  public static SubLObject clear_total_cardinalities()
  {
    Hashtables.clrhash( $total_instance_cardinality$.getGlobalValue() );
    Hashtables.clrhash( $total_quoted_instance_cardinality$.getGlobalValue() );
    Hashtables.clrhash( $total_spec_cardinality$.getGlobalValue() );
    Hashtables.clrhash( $total_genl_cardinality$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 18692L)
  public static SubLObject initialize_total_cardinalities()
  {
    clear_total_cardinalities();
    initialize_collection_total_cardinalities();
    initialize_predicate_total_cardinalities();
    initialize_microtheory_total_cardinalities();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 18924L)
  public static SubLObject initialize_collection_total_cardinalities()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject message = $str53$Calculating_collection_total_card;
    final SubLObject module = sbhl_module_vars.get_sbhl_module( $const38$genls );
    SubLObject count = ZERO_INTEGER;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym39$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const40$EverythingPSC, thread );
      final SubLObject message_var = message;
      final SubLObject module_var = module;
      SubLObject total = get_sbhl_module_size( module_var );
      final SubLObject sofar = ZERO_INTEGER;
      final SubLObject _prev_bind_0_$44 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_1_$45 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
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
          utilities_macros.noting_percent_progress_preamble( message_var );
          final SubLObject _prev_bind_0_$45 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding( thread );
          final SubLObject _prev_bind_1_$46 = cfasl.$cfasl_common_symbols$.currentBinding( thread );
          try
          {
            file_vector_utilities.$file_vector_backed_map_read_lock$.bind( sbhl_graphs.$sbhl_file_vector_data_stream_lock$.getGlobalValue(), thread );
            cfasl.$cfasl_common_symbols$.bind( NIL, thread );
            cfasl.cfasl_set_common_symbols_simple( misc_utilities.get_hl_store_caches_shared_symbols_simple() );
            final SubLObject map = sbhl_module_utilities.get_sbhl_graph( module_var );
            SubLObject link_var = NIL;
            final SubLObject iterator = map_utilities.new_map_iterator( map );
            SubLObject valid;
            for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
            {
              thread.resetMultipleValues();
              final SubLObject var = iteration.iteration_next( iterator );
              valid = thread.secondMultipleValue();
              thread.resetMultipleValues();
              if( NIL != valid )
              {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject col = NIL;
                SubLObject impl_value = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list54 );
                col = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list54 );
                impl_value = current.first();
                current = current.rest();
                if( NIL == current )
                {
                  if( NIL == file_vector_utilities.file_vector_reference_p( impl_value ) || NIL == file_vector_utilities.file_vector_reference_deletedP( impl_value ) )
                  {
                    link_var = file_vector_utilities.file_vector_backed_map_wX_cache_get( map, sbhl_graphs.$sbhl_backing_file_vector$.getGlobalValue(), NIL, col, UNPROVIDED );
                    utilities_macros.note_percent_progress( sofar, total );
                    total = Numbers.add( total, ONE_INTEGER );
                    if( NIL != fort_types_interface.collection_p( col ) )
                    {
                      count = Numbers.add( count, ONE_INTEGER );
                      final SubLObject v_genls = sbhl_search_methods.sbhl_all_forward_true_nodes( module, col, UNPROVIDED, UNPROVIDED );
                      final SubLObject genl_count = Sequences.length( v_genls );
                      set_total_genl_cardinality( col, genl_count );
                      final SubLObject local_spec_count = local_spec_cardinality( col );
                      if( !local_spec_count.isZero() )
                      {
                        SubLObject cdolist_list_var = v_genls;
                        SubLObject genl = NIL;
                        genl = cdolist_list_var.first();
                        while ( NIL != cdolist_list_var)
                        {
                          increment_total_spec_cardinality( genl, local_spec_count );
                          cdolist_list_var = cdolist_list_var.rest();
                          genl = cdolist_list_var.first();
                        }
                      }
                      increment_total_spec_cardinality( col, ONE_INTEGER );
                      final SubLObject local_instance_count = local_instance_cardinality( col );
                      if( !local_instance_count.isZero() )
                      {
                        SubLObject cdolist_list_var = v_genls;
                        SubLObject genl = NIL;
                        genl = cdolist_list_var.first();
                        while ( NIL != cdolist_list_var)
                        {
                          increment_total_instance_cardinality( genl, local_instance_count );
                          cdolist_list_var = cdolist_list_var.rest();
                          genl = cdolist_list_var.first();
                        }
                      }
                      final SubLObject local_quoted_instance_count = local_quoted_instance_cardinality( col );
                      if( !local_quoted_instance_count.isZero() )
                      {
                        SubLObject cdolist_list_var = v_genls;
                        SubLObject genl = NIL;
                        genl = cdolist_list_var.first();
                        while ( NIL != cdolist_list_var)
                        {
                          increment_total_quoted_instance_cardinality( genl, local_quoted_instance_count );
                          cdolist_list_var = cdolist_list_var.rest();
                          genl = cdolist_list_var.first();
                        }
                      }
                    }
                  }
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum, $list54 );
                }
              }
            }
          }
          finally
          {
            cfasl.$cfasl_common_symbols$.rebind( _prev_bind_1_$46, thread );
            file_vector_utilities.$file_vector_backed_map_read_lock$.rebind( _prev_bind_0_$45, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$46 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$46, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1_$45, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$44, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 20212L)
  public static SubLObject initialize_predicate_total_cardinalities()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject message = $str55$Calculating_predicate_total_cardi;
    final SubLObject module = sbhl_module_vars.get_sbhl_module( $const48$genlPreds );
    SubLObject count = ZERO_INTEGER;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym39$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const40$EverythingPSC, thread );
      final SubLObject message_var = message;
      final SubLObject module_var = module;
      SubLObject total = get_sbhl_module_size( module_var );
      final SubLObject sofar = ZERO_INTEGER;
      final SubLObject _prev_bind_0_$49 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_1_$50 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
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
          utilities_macros.noting_percent_progress_preamble( message_var );
          final SubLObject _prev_bind_0_$50 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding( thread );
          final SubLObject _prev_bind_1_$51 = cfasl.$cfasl_common_symbols$.currentBinding( thread );
          try
          {
            file_vector_utilities.$file_vector_backed_map_read_lock$.bind( sbhl_graphs.$sbhl_file_vector_data_stream_lock$.getGlobalValue(), thread );
            cfasl.$cfasl_common_symbols$.bind( NIL, thread );
            cfasl.cfasl_set_common_symbols_simple( misc_utilities.get_hl_store_caches_shared_symbols_simple() );
            final SubLObject map = sbhl_module_utilities.get_sbhl_graph( module_var );
            SubLObject link_var = NIL;
            final SubLObject iterator = map_utilities.new_map_iterator( map );
            SubLObject valid;
            for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
            {
              thread.resetMultipleValues();
              final SubLObject var = iteration.iteration_next( iterator );
              valid = thread.secondMultipleValue();
              thread.resetMultipleValues();
              if( NIL != valid )
              {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject predicate = NIL;
                SubLObject impl_value = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list56 );
                predicate = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list56 );
                impl_value = current.first();
                current = current.rest();
                if( NIL == current )
                {
                  if( NIL == file_vector_utilities.file_vector_reference_p( impl_value ) || NIL == file_vector_utilities.file_vector_reference_deletedP( impl_value ) )
                  {
                    link_var = file_vector_utilities.file_vector_backed_map_wX_cache_get( map, sbhl_graphs.$sbhl_backing_file_vector$.getGlobalValue(), NIL, predicate, UNPROVIDED );
                    utilities_macros.note_percent_progress( sofar, total );
                    total = Numbers.add( total, ONE_INTEGER );
                    if( NIL != fort_types_interface.predicate_p( predicate ) )
                    {
                      count = Numbers.add( count, ONE_INTEGER );
                      final SubLObject v_genl_predicates = sbhl_search_methods.sbhl_all_forward_true_nodes( module, predicate, UNPROVIDED, UNPROVIDED );
                      final SubLObject genl_count = Sequences.length( v_genl_predicates );
                      set_total_genl_cardinality( predicate, genl_count );
                      final SubLObject local_spec_count = local_spec_cardinality( predicate );
                      if( !local_spec_count.isZero() )
                      {
                        SubLObject cdolist_list_var = v_genl_predicates;
                        SubLObject genl_predicate = NIL;
                        genl_predicate = cdolist_list_var.first();
                        while ( NIL != cdolist_list_var)
                        {
                          increment_total_spec_cardinality( genl_predicate, local_spec_count );
                          cdolist_list_var = cdolist_list_var.rest();
                          genl_predicate = cdolist_list_var.first();
                        }
                      }
                      increment_total_spec_cardinality( predicate, ONE_INTEGER );
                      final SubLObject local_instance_count = local_instance_cardinality( predicate );
                      if( !local_instance_count.isZero() )
                      {
                        SubLObject cdolist_list_var = v_genl_predicates;
                        SubLObject genl_predicate = NIL;
                        genl_predicate = cdolist_list_var.first();
                        while ( NIL != cdolist_list_var)
                        {
                          increment_total_instance_cardinality( genl_predicate, local_instance_count );
                          cdolist_list_var = cdolist_list_var.rest();
                          genl_predicate = cdolist_list_var.first();
                        }
                      }
                    }
                  }
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum, $list56 );
                }
              }
            }
          }
          finally
          {
            cfasl.$cfasl_common_symbols$.rebind( _prev_bind_1_$51, thread );
            file_vector_utilities.$file_vector_backed_map_read_lock$.rebind( _prev_bind_0_$50, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$51 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$51, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1_$50, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$49, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 21310L)
  public static SubLObject initialize_microtheory_total_cardinalities()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject message = $str57$Calculating_microtheory_total_car;
    final SubLObject module = sbhl_module_vars.get_sbhl_module( $const50$genlMt );
    SubLObject count = ZERO_INTEGER;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym39$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const40$EverythingPSC, thread );
      final SubLObject message_var = message;
      final SubLObject module_var = module;
      SubLObject total = get_sbhl_module_size( module_var );
      final SubLObject sofar = ZERO_INTEGER;
      final SubLObject _prev_bind_0_$54 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_1_$55 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
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
          utilities_macros.noting_percent_progress_preamble( message_var );
          final SubLObject _prev_bind_0_$55 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding( thread );
          final SubLObject _prev_bind_1_$56 = cfasl.$cfasl_common_symbols$.currentBinding( thread );
          try
          {
            file_vector_utilities.$file_vector_backed_map_read_lock$.bind( sbhl_graphs.$sbhl_file_vector_data_stream_lock$.getGlobalValue(), thread );
            cfasl.$cfasl_common_symbols$.bind( NIL, thread );
            cfasl.cfasl_set_common_symbols_simple( misc_utilities.get_hl_store_caches_shared_symbols_simple() );
            final SubLObject map = sbhl_module_utilities.get_sbhl_graph( module_var );
            SubLObject link_var = NIL;
            final SubLObject iterator = map_utilities.new_map_iterator( map );
            SubLObject valid;
            for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
            {
              thread.resetMultipleValues();
              final SubLObject var = iteration.iteration_next( iterator );
              valid = thread.secondMultipleValue();
              thread.resetMultipleValues();
              if( NIL != valid )
              {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject mt = NIL;
                SubLObject impl_value = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list58 );
                mt = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list58 );
                impl_value = current.first();
                current = current.rest();
                if( NIL == current )
                {
                  if( NIL == file_vector_utilities.file_vector_reference_p( impl_value ) || NIL == file_vector_utilities.file_vector_reference_deletedP( impl_value ) )
                  {
                    link_var = file_vector_utilities.file_vector_backed_map_wX_cache_get( map, sbhl_graphs.$sbhl_backing_file_vector$.getGlobalValue(), NIL, mt, UNPROVIDED );
                    utilities_macros.note_percent_progress( sofar, total );
                    total = Numbers.add( total, ONE_INTEGER );
                    if( NIL != fort_types_interface.microtheory_p( mt ) )
                    {
                      count = Numbers.add( count, ONE_INTEGER );
                      final SubLObject v_genl_mts = sbhl_search_methods.sbhl_all_forward_true_nodes( module, mt, UNPROVIDED, UNPROVIDED );
                      final SubLObject genl_count = Sequences.length( v_genl_mts );
                      set_total_genl_cardinality( mt, genl_count );
                      final SubLObject local_spec_count = local_spec_cardinality( mt );
                      if( !local_spec_count.isZero() )
                      {
                        SubLObject cdolist_list_var = v_genl_mts;
                        SubLObject genl_mt = NIL;
                        genl_mt = cdolist_list_var.first();
                        while ( NIL != cdolist_list_var)
                        {
                          increment_total_spec_cardinality( genl_mt, local_spec_count );
                          cdolist_list_var = cdolist_list_var.rest();
                          genl_mt = cdolist_list_var.first();
                        }
                      }
                      increment_total_spec_cardinality( mt, ONE_INTEGER );
                      final SubLObject local_instance_count = local_instance_cardinality( mt );
                      if( !local_instance_count.isZero() )
                      {
                        SubLObject cdolist_list_var = v_genl_mts;
                        SubLObject genl_mt = NIL;
                        genl_mt = cdolist_list_var.first();
                        while ( NIL != cdolist_list_var)
                        {
                          increment_total_instance_cardinality( genl_mt, local_instance_count );
                          cdolist_list_var = cdolist_list_var.rest();
                          genl_mt = cdolist_list_var.first();
                        }
                      }
                    }
                  }
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum, $list58 );
                }
              }
            }
          }
          finally
          {
            cfasl.$cfasl_common_symbols$.rebind( _prev_bind_1_$56, thread );
            file_vector_utilities.$file_vector_backed_map_read_lock$.rebind( _prev_bind_0_$55, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$56 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$56, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1_$55, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$54, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 22299L)
  public static SubLObject clear_generality_estimates()
  {
    Hashtables.clrhash( $generality_estimate_table$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 22400L)
  public static SubLObject initialize_generality_estimates()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    clear_generality_estimates();
    final SubLObject table_var = $total_genl_cardinality$.getGlobalValue();
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str59$Calculating_generality_estimates, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( Hashtables.hash_table_count( table_var ), thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject v_term = NIL;
        SubLObject genl_count = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( table_var );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            v_term = Hashtables.getEntryKey( cdohash_entry );
            genl_count = Hashtables.getEntryValue( cdohash_entry );
            update_generality_estimate( v_term );
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$59 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$59, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 22657L)
  public static SubLObject dump_cardinality_estimates_to_stream(final SubLObject stream)
  {
    cfasl.cfasl_output( $local_instance_cardinality$.getGlobalValue(), stream );
    cfasl.cfasl_output( $local_quoted_instance_cardinality$.getGlobalValue(), stream );
    cfasl.cfasl_output( $local_spec_cardinality$.getGlobalValue(), stream );
    cfasl.cfasl_output( $total_instance_cardinality$.getGlobalValue(), stream );
    cfasl.cfasl_output( $total_quoted_instance_cardinality$.getGlobalValue(), stream );
    cfasl.cfasl_output( $total_spec_cardinality$.getGlobalValue(), stream );
    cfasl.cfasl_output( $total_genl_cardinality$.getGlobalValue(), stream );
    cfasl.cfasl_output( $generality_estimate_table$.getGlobalValue(), stream );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 23313L)
  public static SubLObject load_cardinality_estimates_from_stream(final SubLObject stream)
  {
    $local_instance_cardinality$.setGlobalValue( cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    $local_quoted_instance_cardinality$.setGlobalValue( cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    $local_spec_cardinality$.setGlobalValue( cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    $total_instance_cardinality$.setGlobalValue( cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    $total_quoted_instance_cardinality$.setGlobalValue( cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    $total_spec_cardinality$.setGlobalValue( cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    $total_genl_cardinality$.setGlobalValue( cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    $generality_estimate_table$.setGlobalValue( cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 23975L)
  public static SubLObject update_cardinality_estimates_wrt_genls(final SubLObject spec, final SubLObject genl)
  {
    assert NIL != hlmt.fort_or_chlmt_p( spec ) : spec;
    assert NIL != hlmt.fort_or_chlmt_p( genl ) : genl;
    update_instance_cardinality( spec, genl );
    update_spec_cardinality( spec, genl );
    update_genl_cardinality( spec, genl );
    update_generality_estimate( spec );
    update_generality_estimate( genl );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 24500L)
  public static SubLObject clear_cardinality_estimates(final SubLObject v_term)
  {
    Hashtables.remhash( v_term, $local_instance_cardinality$.getGlobalValue() );
    Hashtables.remhash( v_term, $local_quoted_instance_cardinality$.getGlobalValue() );
    Hashtables.remhash( v_term, $local_spec_cardinality$.getGlobalValue() );
    Hashtables.remhash( v_term, $total_instance_cardinality$.getGlobalValue() );
    Hashtables.remhash( v_term, $total_quoted_instance_cardinality$.getGlobalValue() );
    Hashtables.remhash( v_term, $total_spec_cardinality$.getGlobalValue() );
    Hashtables.remhash( v_term, $total_genl_cardinality$.getGlobalValue() );
    Hashtables.remhash( v_term, $generality_estimate_table$.getGlobalValue() );
    return v_term;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 25075L)
  public static SubLObject update_instance_cardinality(final SubLObject spec, final SubLObject genl)
  {
    SubLObject spec_card = total_instance_cardinality( spec );
    SubLObject genl_card = total_instance_cardinality( genl );
    if( spec_card.numG( genl_card ) )
    {
      set_total_instance_cardinality( genl, spec_card );
    }
    spec_card = total_quoted_instance_cardinality( spec );
    genl_card = total_quoted_instance_cardinality( genl );
    if( spec_card.numG( genl_card ) )
    {
      set_total_quoted_instance_cardinality( genl, spec_card );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 25699L)
  public static SubLObject update_spec_cardinality(final SubLObject spec, final SubLObject genl)
  {
    SubLObject spec_card = total_spec_cardinality( spec );
    if( spec_card.isZero() )
    {
      set_total_spec_cardinality( spec, ONE_INTEGER );
      spec_card = ONE_INTEGER;
    }
    final SubLObject genl_card = total_spec_cardinality( genl );
    final SubLObject conservative_new_genl_card = number_utilities.f_1X( spec_card );
    if( conservative_new_genl_card.numG( genl_card ) )
    {
      set_total_spec_cardinality( genl, conservative_new_genl_card );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 26342L)
  public static SubLObject update_genl_cardinality(final SubLObject spec, final SubLObject genl)
  {
    final SubLObject spec_card = total_genl_cardinality( spec );
    final SubLObject genl_card = total_genl_cardinality( genl );
    final SubLObject conservative_new_spec_card = number_utilities.f_1X( genl_card );
    if( conservative_new_spec_card.numG( spec_card ) )
    {
      set_total_genl_cardinality( spec, conservative_new_spec_card );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 26871L)
  public static SubLObject update_generality_estimate(final SubLObject v_term)
  {
    final SubLObject new_estimate = compute_generality_estimate( v_term );
    set_generality_estimate( v_term, new_estimate );
    return new_estimate;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 27163L)
  public static SubLObject compute_generality_estimate(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject scale = $generality_estimate_scale_factor$.getDynamicValue( thread );
    final SubLObject numerator = Numbers.multiply( scale, use_cardinality( v_term ) );
    final SubLObject denominator = Numbers.max( genl_cardinality( v_term ), ONE_INTEGER );
    return Values.values( Numbers.truncate( numerator, denominator ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 27417L)
  public static SubLObject initialize_inference_test_cardinalities(final SubLObject terms)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym39$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const40$EverythingPSC, thread );
      SubLObject cdolist_list_var = terms;
      SubLObject v_term = NIL;
      v_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        increment_local_instance_cardinality( v_term, Sequences.length( Sequences.remove_duplicates( isa.instances( v_term, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
        increment_local_quoted_instance_cardinality( v_term, Sequences.length( Sequences.remove_duplicates( isa.quoted_instances( v_term, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
        set_total_instance_cardinality( v_term, Sequences.length( isa.all_fort_instances( v_term, UNPROVIDED, UNPROVIDED ) ) );
        set_total_quoted_instance_cardinality( v_term, Sequences.length( isa.all_quoted_instances( v_term, UNPROVIDED, UNPROVIDED ) ) );
        final SubLObject sbhl_module = sbhl_module_utilities.determine_sbhl_module_from_fort_type( v_term, UNPROVIDED );
        set_local_spec_cardinality( v_term, Sequences.length( sbhl_link_methods.sbhl_backward_true_link_nodes( sbhl_module, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
        set_total_spec_cardinality( v_term, Sequences.length( sbhl_search_methods.sbhl_all_backward_true_nodes( sbhl_module, v_term, UNPROVIDED, UNPROVIDED ) ) );
        set_total_genl_cardinality( v_term, Sequences.length( sbhl_search_methods.sbhl_all_forward_true_nodes( sbhl_module, v_term, UNPROVIDED, UNPROVIDED ) ) );
        update_generality_estimate( v_term );
        cdolist_list_var = cdolist_list_var.rest();
        v_term = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 28333L)
  public static SubLObject disjointness_power(final SubLObject col1, final SubLObject col2)
  {
    final SubLObject instance_cardinality_1 = instance_cardinality( col1 );
    final SubLObject instance_cardinality_2 = instance_cardinality( col2 );
    final SubLObject spec_cardinality_1 = number_utilities.f_1X( spec_cardinality( col1 ) );
    final SubLObject spec_cardinality_2 = number_utilities.f_1X( spec_cardinality( col2 ) );
    final SubLObject power = Numbers.add( Numbers.multiply( instance_cardinality_1, spec_cardinality_2 ), Numbers.multiply( instance_cardinality_2, spec_cardinality_1 ), Numbers.multiply( spec_cardinality_1,
        spec_cardinality_2 ) );
    return power;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 28994L)
  public static SubLObject disjoint_with_assertion_power(final SubLObject gaf)
  {
    assert NIL != assertions_high.gaf_assertionP( gaf ) : gaf;
    final SubLObject pred = assertions_high.gaf_predicate( gaf );
    if( NIL != kb_utilities.kbeq( pred, $const62$disjointWith ) )
    {
      final SubLObject col1 = assertions_high.gaf_arg1( gaf );
      final SubLObject col2 = assertions_high.gaf_arg2( gaf );
      return disjointness_power( col1, col2 );
    }
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 29382L)
  public static SubLObject gt_inverse_cardinality(final SubLObject pred, final SubLObject node)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == forts.fort_p( node ) )
    {
      return ZERO_INTEGER;
    }
    SubLObject count = ( NIL != fort_types_interface.reflexive_binary_predicate_p( pred ) ) ? ONE_INTEGER : ZERO_INTEGER;
    final SubLObject deck_type = $kw65$QUEUE;
    final SubLObject recur_deck = deck.create_deck( deck_type );
    SubLObject node_and_predicate_mode = NIL;
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
      try
      {
        final SubLObject tv_var = NIL;
        final SubLObject _prev_bind_0_$60 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
        final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
        try
        {
          sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
          sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym66$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
          if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
          {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
            if( pcase_var.eql( $kw67$ERROR ) )
            {
              sbhl_paranoia.sbhl_error( ONE_INTEGER, $str68$_A_is_not_a__A, tv_var, $sym69$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw70$CERROR ) )
            {
              sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str71$continue_anyway, $str68$_A_is_not_a__A, tv_var, $sym69$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw72$WARN ) )
            {
              Errors.warn( $str68$_A_is_not_a__A, tv_var, $sym69$SBHL_TRUE_TV_P );
            }
            else
            {
              Errors.warn( $str73$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
              Errors.cerror( $str71$continue_anyway, $str68$_A_is_not_a__A, tv_var, $sym69$SBHL_TRUE_TV_P );
            }
          }
          final SubLObject _prev_bind_0_$61 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
          final SubLObject _prev_bind_1_$62 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
          final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
          final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
          final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const48$genlPreds ), thread );
            sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const48$genlPreds ) ), thread );
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const48$genlPreds ) ), thread );
            sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
            sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const48$genlPreds ), thread );
            if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( pred, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
            {
              final SubLObject _prev_bind_0_$62 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
              final SubLObject _prev_bind_1_$63 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
              final SubLObject _prev_bind_2_$65 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(
                    $const48$genlPreds ) ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_marking_utilities.sbhl_mark_node_marked( pred, UNPROVIDED );
                for( node_and_predicate_mode = ConsesLow.list( pred, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop( recur_deck ) )
                {
                  final SubLObject node_var_$66 = node_and_predicate_mode.first();
                  final SubLObject predicate_mode = conses_high.second( node_and_predicate_mode );
                  final SubLObject spec = node_var_$66;
                  final SubLObject _prev_bind_0_$63 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                    final SubLObject inverseP = predicate_mode;
                    if( NIL != inverseP )
                    {
                      count = Numbers.add( count, kb_indexing.num_gaf_arg_index( node, ONE_INTEGER, spec, UNPROVIDED ) );
                    }
                    else
                    {
                      count = Numbers.add( count, kb_indexing.num_gaf_arg_index( node, TWO_INTEGER, spec, UNPROVIDED ) );
                    }
                    SubLObject cdolist_list_var;
                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const48$genlPreds ) );
                    SubLObject module_var = NIL;
                    module_var = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      final SubLObject _prev_bind_0_$64 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$64 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                            .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                        final SubLObject node_$70 = function_terms.naut_to_nart( node_var_$66 );
                        if( NIL != sbhl_link_vars.sbhl_node_object_p( node_$70 ) )
                        {
                          final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node_$70, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                          if( NIL != d_link )
                          {
                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != mt_links )
                            {
                              SubLObject iteration_state;
                              for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                  iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                              {
                                thread.resetMultipleValues();
                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                final SubLObject tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                {
                                  final SubLObject _prev_bind_0_$65 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                    SubLObject iteration_state_$72;
                                    for( iteration_state_$72 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                        iteration_state_$72 ); iteration_state_$72 = dictionary_contents.do_dictionary_contents_next( iteration_state_$72 ) )
                                    {
                                      thread.resetMultipleValues();
                                      final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$72 );
                                      final SubLObject link_nodes = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                      {
                                        final SubLObject _prev_bind_0_$66 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                          final SubLObject sol = link_nodes;
                                          if( NIL != set.set_p( sol ) )
                                          {
                                            final SubLObject set_contents_var = set.do_set_internal( sol );
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject node_vars_link_node;
                                            for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                            {
                                              node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                              if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                  UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                deck.deck_push( ConsesLow.list( node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                              }
                                            }
                                          }
                                          else if( sol.isList() )
                                          {
                                            SubLObject csome_list_var = sol;
                                            SubLObject node_vars_link_node2 = NIL;
                                            node_vars_link_node2 = csome_list_var.first();
                                            while ( NIL != csome_list_var)
                                            {
                                              if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                deck.deck_push( ConsesLow.list( node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                              }
                                              csome_list_var = csome_list_var.rest();
                                              node_vars_link_node2 = csome_list_var.first();
                                            }
                                          }
                                          else
                                          {
                                            Errors.error( $str42$_A_is_neither_SET_P_nor_LISTP_, sol );
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$66, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state_$72 );
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$65, thread );
                                  }
                                }
                              }
                              dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                            }
                          }
                          else
                          {
                            sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str74$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                          }
                        }
                        else if( NIL != obsolete.cnat_p( node_$70, UNPROVIDED ) )
                        {
                          SubLObject cdolist_list_var_$74;
                          final SubLObject new_list = cdolist_list_var_$74 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                              .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                  UNPROVIDED ) ) )
                              : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                  .get_sbhl_module( UNPROVIDED ) ) );
                          SubLObject generating_fn = NIL;
                          generating_fn = cdolist_list_var_$74.first();
                          while ( NIL != cdolist_list_var_$74)
                          {
                            final SubLObject _prev_bind_0_$67 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                            try
                            {
                              sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                              final SubLObject sol2;
                              final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node_$70 );
                              if( NIL != set.set_p( sol2 ) )
                              {
                                final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject node_vars_link_node3;
                                for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                    set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                {
                                  node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                  if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                      UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                    deck.deck_push( ConsesLow.list( node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                  }
                                }
                              }
                              else if( sol2.isList() )
                              {
                                SubLObject csome_list_var2 = sol2;
                                SubLObject node_vars_link_node4 = NIL;
                                node_vars_link_node4 = csome_list_var2.first();
                                while ( NIL != csome_list_var2)
                                {
                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                    deck.deck_push( ConsesLow.list( node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                  }
                                  csome_list_var2 = csome_list_var2.rest();
                                  node_vars_link_node4 = csome_list_var2.first();
                                }
                              }
                              else
                              {
                                Errors.error( $str42$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                              }
                            }
                            finally
                            {
                              sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$67, thread );
                            }
                            cdolist_list_var_$74 = cdolist_list_var_$74.rest();
                            generating_fn = cdolist_list_var_$74.first();
                          }
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$64, thread );
                        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$64, thread );
                      }
                      cdolist_list_var = cdolist_list_var.rest();
                      module_var = cdolist_list_var.first();
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$63, thread );
                  }
                }
              }
              finally
              {
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$65, thread );
                sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$63, thread );
                sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$62, thread );
              }
            }
            else
            {
              sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str75$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
                  UNPROVIDED );
            }
          }
          finally
          {
            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
            sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$62, thread );
            sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$61, thread );
          }
        }
        finally
        {
          sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_2, thread );
          sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$60, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$68 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$68, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0, thread );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 29778L)
  public static SubLObject gt_predicate_cardinality(final SubLObject pred, final SubLObject node)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == forts.fort_p( node ) )
    {
      return ZERO_INTEGER;
    }
    SubLObject count = ( NIL != fort_types_interface.reflexive_binary_predicate_p( pred ) ) ? ONE_INTEGER : ZERO_INTEGER;
    final SubLObject deck_type = $kw65$QUEUE;
    final SubLObject recur_deck = deck.create_deck( deck_type );
    SubLObject node_and_predicate_mode = NIL;
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
      try
      {
        final SubLObject tv_var = NIL;
        final SubLObject _prev_bind_0_$77 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
        final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
        try
        {
          sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
          sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym66$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
          if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
          {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
            if( pcase_var.eql( $kw67$ERROR ) )
            {
              sbhl_paranoia.sbhl_error( ONE_INTEGER, $str68$_A_is_not_a__A, tv_var, $sym69$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw70$CERROR ) )
            {
              sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str71$continue_anyway, $str68$_A_is_not_a__A, tv_var, $sym69$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw72$WARN ) )
            {
              Errors.warn( $str68$_A_is_not_a__A, tv_var, $sym69$SBHL_TRUE_TV_P );
            }
            else
            {
              Errors.warn( $str73$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
              Errors.cerror( $str71$continue_anyway, $str68$_A_is_not_a__A, tv_var, $sym69$SBHL_TRUE_TV_P );
            }
          }
          final SubLObject _prev_bind_0_$78 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
          final SubLObject _prev_bind_1_$79 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
          final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
          final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
          final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const48$genlPreds ), thread );
            sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const48$genlPreds ) ), thread );
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const48$genlPreds ) ), thread );
            sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
            sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const48$genlPreds ), thread );
            if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( pred, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
            {
              final SubLObject _prev_bind_0_$79 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
              final SubLObject _prev_bind_1_$80 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
              final SubLObject _prev_bind_2_$82 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(
                    $const48$genlPreds ) ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_marking_utilities.sbhl_mark_node_marked( pred, UNPROVIDED );
                for( node_and_predicate_mode = ConsesLow.list( pred, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop( recur_deck ) )
                {
                  final SubLObject node_var_$83 = node_and_predicate_mode.first();
                  final SubLObject predicate_mode = conses_high.second( node_and_predicate_mode );
                  final SubLObject spec = node_var_$83;
                  final SubLObject _prev_bind_0_$80 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                    final SubLObject inverseP = predicate_mode;
                    if( NIL != inverseP )
                    {
                      count = Numbers.add( count, kb_indexing.num_gaf_arg_index( node, TWO_INTEGER, spec, UNPROVIDED ) );
                    }
                    else
                    {
                      count = Numbers.add( count, kb_indexing.num_gaf_arg_index( node, ONE_INTEGER, spec, UNPROVIDED ) );
                    }
                    SubLObject cdolist_list_var;
                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const48$genlPreds ) );
                    SubLObject module_var = NIL;
                    module_var = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      final SubLObject _prev_bind_0_$81 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$81 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                            .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                        final SubLObject node_$87 = function_terms.naut_to_nart( node_var_$83 );
                        if( NIL != sbhl_link_vars.sbhl_node_object_p( node_$87 ) )
                        {
                          final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node_$87, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                          if( NIL != d_link )
                          {
                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != mt_links )
                            {
                              SubLObject iteration_state;
                              for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                  iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                              {
                                thread.resetMultipleValues();
                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                final SubLObject tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                {
                                  final SubLObject _prev_bind_0_$82 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                    SubLObject iteration_state_$89;
                                    for( iteration_state_$89 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                        iteration_state_$89 ); iteration_state_$89 = dictionary_contents.do_dictionary_contents_next( iteration_state_$89 ) )
                                    {
                                      thread.resetMultipleValues();
                                      final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$89 );
                                      final SubLObject link_nodes = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                      {
                                        final SubLObject _prev_bind_0_$83 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                          final SubLObject sol = link_nodes;
                                          if( NIL != set.set_p( sol ) )
                                          {
                                            final SubLObject set_contents_var = set.do_set_internal( sol );
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject node_vars_link_node;
                                            for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                            {
                                              node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                              if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                  UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                deck.deck_push( ConsesLow.list( node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                              }
                                            }
                                          }
                                          else if( sol.isList() )
                                          {
                                            SubLObject csome_list_var = sol;
                                            SubLObject node_vars_link_node2 = NIL;
                                            node_vars_link_node2 = csome_list_var.first();
                                            while ( NIL != csome_list_var)
                                            {
                                              if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                deck.deck_push( ConsesLow.list( node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                              }
                                              csome_list_var = csome_list_var.rest();
                                              node_vars_link_node2 = csome_list_var.first();
                                            }
                                          }
                                          else
                                          {
                                            Errors.error( $str42$_A_is_neither_SET_P_nor_LISTP_, sol );
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$83, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state_$89 );
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$82, thread );
                                  }
                                }
                              }
                              dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                            }
                          }
                          else
                          {
                            sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str74$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                          }
                        }
                        else if( NIL != obsolete.cnat_p( node_$87, UNPROVIDED ) )
                        {
                          SubLObject cdolist_list_var_$91;
                          final SubLObject new_list = cdolist_list_var_$91 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                              .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                  UNPROVIDED ) ) )
                              : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                  .get_sbhl_module( UNPROVIDED ) ) );
                          SubLObject generating_fn = NIL;
                          generating_fn = cdolist_list_var_$91.first();
                          while ( NIL != cdolist_list_var_$91)
                          {
                            final SubLObject _prev_bind_0_$84 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                            try
                            {
                              sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                              final SubLObject sol2;
                              final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node_$87 );
                              if( NIL != set.set_p( sol2 ) )
                              {
                                final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject node_vars_link_node3;
                                for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                    set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                {
                                  node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                  if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                      UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                    deck.deck_push( ConsesLow.list( node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                  }
                                }
                              }
                              else if( sol2.isList() )
                              {
                                SubLObject csome_list_var2 = sol2;
                                SubLObject node_vars_link_node4 = NIL;
                                node_vars_link_node4 = csome_list_var2.first();
                                while ( NIL != csome_list_var2)
                                {
                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                    deck.deck_push( ConsesLow.list( node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                  }
                                  csome_list_var2 = csome_list_var2.rest();
                                  node_vars_link_node4 = csome_list_var2.first();
                                }
                              }
                              else
                              {
                                Errors.error( $str42$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                              }
                            }
                            finally
                            {
                              sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$84, thread );
                            }
                            cdolist_list_var_$91 = cdolist_list_var_$91.rest();
                            generating_fn = cdolist_list_var_$91.first();
                          }
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$81, thread );
                        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$81, thread );
                      }
                      cdolist_list_var = cdolist_list_var.rest();
                      module_var = cdolist_list_var.first();
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$80, thread );
                  }
                }
              }
              finally
              {
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$82, thread );
                sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$80, thread );
                sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$79, thread );
              }
            }
            else
            {
              sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str75$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
                  UNPROVIDED );
            }
          }
          finally
          {
            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
            sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$79, thread );
            sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$78, thread );
          }
        }
        finally
        {
          sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_2, thread );
          sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$77, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$85 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$85, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0, thread );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 30180L)
  public static SubLObject gt_pred_extent_cardinality(final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == forts.fort_p( pred ) )
    {
      return ZERO_INTEGER;
    }
    SubLObject count = ZERO_INTEGER;
    final SubLObject deck_type = $kw65$QUEUE;
    final SubLObject recur_deck = deck.create_deck( deck_type );
    SubLObject node_and_predicate_mode = NIL;
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
      try
      {
        final SubLObject tv_var = NIL;
        final SubLObject _prev_bind_0_$94 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
        final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
        try
        {
          sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
          sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym66$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
          if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
          {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
            if( pcase_var.eql( $kw67$ERROR ) )
            {
              sbhl_paranoia.sbhl_error( ONE_INTEGER, $str68$_A_is_not_a__A, tv_var, $sym69$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw70$CERROR ) )
            {
              sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str71$continue_anyway, $str68$_A_is_not_a__A, tv_var, $sym69$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw72$WARN ) )
            {
              Errors.warn( $str68$_A_is_not_a__A, tv_var, $sym69$SBHL_TRUE_TV_P );
            }
            else
            {
              Errors.warn( $str73$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
              Errors.cerror( $str71$continue_anyway, $str68$_A_is_not_a__A, tv_var, $sym69$SBHL_TRUE_TV_P );
            }
          }
          final SubLObject _prev_bind_0_$95 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
          final SubLObject _prev_bind_1_$96 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
          final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
          final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
          final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const48$genlPreds ), thread );
            sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const48$genlPreds ) ), thread );
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const48$genlPreds ) ), thread );
            sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
            sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const48$genlPreds ), thread );
            if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( pred, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
            {
              final SubLObject _prev_bind_0_$96 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
              final SubLObject _prev_bind_1_$97 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
              final SubLObject _prev_bind_2_$99 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(
                    $const48$genlPreds ) ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_marking_utilities.sbhl_mark_node_marked( pred, UNPROVIDED );
                for( node_and_predicate_mode = ConsesLow.list( pred, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop( recur_deck ) )
                {
                  final SubLObject node_var_$100 = node_and_predicate_mode.first();
                  final SubLObject predicate_mode = conses_high.second( node_and_predicate_mode );
                  final SubLObject spec = node_var_$100;
                  final SubLObject _prev_bind_0_$97 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                    final SubLObject inverseP = predicate_mode;
                    count = Numbers.add( count, kb_indexing.num_predicate_extent_index( spec, UNPROVIDED ) );
                    SubLObject cdolist_list_var;
                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const48$genlPreds ) );
                    SubLObject module_var = NIL;
                    module_var = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      final SubLObject _prev_bind_0_$98 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$98 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                            .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                        final SubLObject node = function_terms.naut_to_nart( node_var_$100 );
                        if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                        {
                          final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                          if( NIL != d_link )
                          {
                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != mt_links )
                            {
                              SubLObject iteration_state;
                              for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                  iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                              {
                                thread.resetMultipleValues();
                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                final SubLObject tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                {
                                  final SubLObject _prev_bind_0_$99 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                    SubLObject iteration_state_$105;
                                    for( iteration_state_$105 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                        iteration_state_$105 ); iteration_state_$105 = dictionary_contents.do_dictionary_contents_next( iteration_state_$105 ) )
                                    {
                                      thread.resetMultipleValues();
                                      final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$105 );
                                      final SubLObject link_nodes = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                      {
                                        final SubLObject _prev_bind_0_$100 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                          final SubLObject sol = link_nodes;
                                          if( NIL != set.set_p( sol ) )
                                          {
                                            final SubLObject set_contents_var = set.do_set_internal( sol );
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject node_vars_link_node;
                                            for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                            {
                                              node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                              if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                  UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                deck.deck_push( ConsesLow.list( node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                              }
                                            }
                                          }
                                          else if( sol.isList() )
                                          {
                                            SubLObject csome_list_var = sol;
                                            SubLObject node_vars_link_node2 = NIL;
                                            node_vars_link_node2 = csome_list_var.first();
                                            while ( NIL != csome_list_var)
                                            {
                                              if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                deck.deck_push( ConsesLow.list( node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                              }
                                              csome_list_var = csome_list_var.rest();
                                              node_vars_link_node2 = csome_list_var.first();
                                            }
                                          }
                                          else
                                          {
                                            Errors.error( $str42$_A_is_neither_SET_P_nor_LISTP_, sol );
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$100, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state_$105 );
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$99, thread );
                                  }
                                }
                              }
                              dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                            }
                          }
                          else
                          {
                            sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str74$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                          }
                        }
                        else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                        {
                          SubLObject cdolist_list_var_$107;
                          final SubLObject new_list = cdolist_list_var_$107 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                              .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                  UNPROVIDED ) ) )
                              : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                  .get_sbhl_module( UNPROVIDED ) ) );
                          SubLObject generating_fn = NIL;
                          generating_fn = cdolist_list_var_$107.first();
                          while ( NIL != cdolist_list_var_$107)
                          {
                            final SubLObject _prev_bind_0_$101 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                            try
                            {
                              sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                              final SubLObject sol2;
                              final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                              if( NIL != set.set_p( sol2 ) )
                              {
                                final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject node_vars_link_node3;
                                for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                    set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                {
                                  node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                  if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                      UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                    deck.deck_push( ConsesLow.list( node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                  }
                                }
                              }
                              else if( sol2.isList() )
                              {
                                SubLObject csome_list_var2 = sol2;
                                SubLObject node_vars_link_node4 = NIL;
                                node_vars_link_node4 = csome_list_var2.first();
                                while ( NIL != csome_list_var2)
                                {
                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                    deck.deck_push( ConsesLow.list( node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                  }
                                  csome_list_var2 = csome_list_var2.rest();
                                  node_vars_link_node4 = csome_list_var2.first();
                                }
                              }
                              else
                              {
                                Errors.error( $str42$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                              }
                            }
                            finally
                            {
                              sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$101, thread );
                            }
                            cdolist_list_var_$107 = cdolist_list_var_$107.rest();
                            generating_fn = cdolist_list_var_$107.first();
                          }
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$98, thread );
                        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$98, thread );
                      }
                      cdolist_list_var = cdolist_list_var.rest();
                      module_var = cdolist_list_var.first();
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$97, thread );
                  }
                }
              }
              finally
              {
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$99, thread );
                sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$97, thread );
                sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$96, thread );
              }
            }
            else
            {
              sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str75$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
                  UNPROVIDED );
            }
          }
          finally
          {
            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
            sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$96, thread );
            sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$95, thread );
          }
        }
        finally
        {
          sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_2, thread );
          sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$94, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$102 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$102, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0, thread );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 30455L)
  public static SubLObject collection_and_specs_assertion_count(final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject assertion_set = set.new_set( Symbols.symbol_function( EQL ), UNPROVIDED );
      SubLObject node_var = col;
      final SubLObject deck_type = $kw64$STACK;
      final SubLObject recur_deck = deck.create_deck( deck_type );
      final SubLObject _prev_bind_0_$110 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
      try
      {
        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          final SubLObject tv_var = NIL;
          final SubLObject _prev_bind_0_$111 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
          final SubLObject _prev_bind_1_$112 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
            sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym66$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
            if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
            {
              final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
              if( pcase_var.eql( $kw67$ERROR ) )
              {
                sbhl_paranoia.sbhl_error( ONE_INTEGER, $str68$_A_is_not_a__A, tv_var, $sym69$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw70$CERROR ) )
              {
                sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str71$continue_anyway, $str68$_A_is_not_a__A, tv_var, $sym69$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw72$WARN ) )
              {
                Errors.warn( $str68$_A_is_not_a__A, tv_var, $sym69$SBHL_TRUE_TV_P );
              }
              else
              {
                Errors.warn( $str73$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                Errors.cerror( $str71$continue_anyway, $str68$_A_is_not_a__A, tv_var, $sym69$SBHL_TRUE_TV_P );
              }
            }
            final SubLObject _prev_bind_0_$112 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
            final SubLObject _prev_bind_1_$113 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
            final SubLObject _prev_bind_2_$115 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const38$genls ), thread );
              sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const38$genls ) ), thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const38$genls ) ), thread );
              sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
              sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const38$genls ), thread );
              if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( col, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
              {
                final SubLObject _prev_bind_0_$113 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                final SubLObject _prev_bind_1_$114 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                final SubLObject _prev_bind_2_$116 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                  sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(
                      $const38$genls ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                  while ( NIL != node_var)
                  {
                    final SubLObject spec = node_var;
                    if( NIL != kb_mapping_macros.do_term_index_key_validator( spec, NIL ) )
                    {
                      final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator( spec, NIL );
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
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, NIL, NIL, NIL );
                            SubLObject done_var_$119 = NIL;
                            final SubLObject token_var_$120 = NIL;
                            while ( NIL == done_var_$119)
                            {
                              final SubLObject a = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$120 );
                              final SubLObject valid_$121 = makeBoolean( !token_var_$120.eql( a ) );
                              if( NIL != valid_$121 && NIL != kb_mapping_macros.do_term_index_assertion_match_p( a, final_index_spec ) )
                              {
                                set.set_add( a, assertion_set );
                              }
                              done_var_$119 = makeBoolean( NIL == valid_$121 );
                            }
                          }
                          finally
                          {
                            final SubLObject _prev_bind_0_$114 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$114, thread );
                            }
                          }
                        }
                        done_var = makeBoolean( NIL == valid );
                      }
                    }
                    SubLObject cdolist_list_var;
                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const38$genls ) );
                    SubLObject module_var = NIL;
                    module_var = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      final SubLObject _prev_bind_0_$115 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$115 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                            .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                        final SubLObject node = function_terms.naut_to_nart( node_var );
                        if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                        {
                          final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                          if( NIL != d_link )
                          {
                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != mt_links )
                            {
                              SubLObject iteration_state;
                              for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                  iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                              {
                                thread.resetMultipleValues();
                                final SubLObject mt_$125 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                final SubLObject tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if( NIL != mt_relevance_macros.relevant_mtP( mt_$125 ) )
                                {
                                  final SubLObject _prev_bind_0_$116 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.bind( mt_$125, thread );
                                    SubLObject iteration_state_$127;
                                    for( iteration_state_$127 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                        iteration_state_$127 ); iteration_state_$127 = dictionary_contents.do_dictionary_contents_next( iteration_state_$127 ) )
                                    {
                                      thread.resetMultipleValues();
                                      final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$127 );
                                      final SubLObject link_nodes = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                      {
                                        final SubLObject _prev_bind_0_$117 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                          final SubLObject sol = link_nodes;
                                          if( NIL != set.set_p( sol ) )
                                          {
                                            final SubLObject set_contents_var = set.do_set_internal( sol );
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject node_vars_link_node;
                                            for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                            {
                                              node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                              if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                  UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                deck.deck_push( node_vars_link_node, recur_deck );
                                              }
                                            }
                                          }
                                          else if( sol.isList() )
                                          {
                                            SubLObject csome_list_var = sol;
                                            SubLObject node_vars_link_node2 = NIL;
                                            node_vars_link_node2 = csome_list_var.first();
                                            while ( NIL != csome_list_var)
                                            {
                                              if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                deck.deck_push( node_vars_link_node2, recur_deck );
                                              }
                                              csome_list_var = csome_list_var.rest();
                                              node_vars_link_node2 = csome_list_var.first();
                                            }
                                          }
                                          else
                                          {
                                            Errors.error( $str42$_A_is_neither_SET_P_nor_LISTP_, sol );
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$117, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state_$127 );
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$116, thread );
                                  }
                                }
                              }
                              dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                            }
                          }
                          else
                          {
                            sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str74$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                          }
                        }
                        else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                        {
                          SubLObject cdolist_list_var_$129;
                          final SubLObject new_list = cdolist_list_var_$129 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                              .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                  UNPROVIDED ) ) )
                              : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                  .get_sbhl_module( UNPROVIDED ) ) );
                          SubLObject generating_fn = NIL;
                          generating_fn = cdolist_list_var_$129.first();
                          while ( NIL != cdolist_list_var_$129)
                          {
                            final SubLObject _prev_bind_0_$118 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                            try
                            {
                              sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                              final SubLObject sol2;
                              final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                              if( NIL != set.set_p( sol2 ) )
                              {
                                final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject node_vars_link_node3;
                                for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                    set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                {
                                  node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                  if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                      UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                    deck.deck_push( node_vars_link_node3, recur_deck );
                                  }
                                }
                              }
                              else if( sol2.isList() )
                              {
                                SubLObject csome_list_var2 = sol2;
                                SubLObject node_vars_link_node4 = NIL;
                                node_vars_link_node4 = csome_list_var2.first();
                                while ( NIL != csome_list_var2)
                                {
                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                    deck.deck_push( node_vars_link_node4, recur_deck );
                                  }
                                  csome_list_var2 = csome_list_var2.rest();
                                  node_vars_link_node4 = csome_list_var2.first();
                                }
                              }
                              else
                              {
                                Errors.error( $str42$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                              }
                            }
                            finally
                            {
                              sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$118, thread );
                            }
                            cdolist_list_var_$129 = cdolist_list_var_$129.rest();
                            generating_fn = cdolist_list_var_$129.first();
                          }
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$115, thread );
                        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$115, thread );
                      }
                      cdolist_list_var = cdolist_list_var.rest();
                      module_var = cdolist_list_var.first();
                    }
                    node_var = deck.deck_pop( recur_deck );
                  }
                }
                finally
                {
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$116, thread );
                  sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$114, thread );
                  sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$113, thread );
                }
              }
              else
              {
                sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str75$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
                    UNPROVIDED );
              }
            }
            finally
            {
              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$115, thread );
              sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$113, thread );
              sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$112, thread );
            }
          }
          finally
          {
            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$112, thread );
            sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$111, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$119 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$119, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$110, thread );
      }
      count = set.set_size( assertion_set );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cardinality-estimates.lisp", position = 30856L)
  public static SubLObject terms_assertion_count(final SubLObject terms, SubLObject mt, SubLObject assertion_exclusion_fn)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( assertion_exclusion_fn == UNPROVIDED )
    {
      assertion_exclusion_fn = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject assertion_set = set.new_set( Symbols.symbol_function( EQL ), UNPROVIDED );
      SubLObject cdolist_list_var = terms;
      SubLObject v_term = NIL;
      v_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != kb_mapping_macros.do_term_index_key_validator( v_term, NIL ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator( v_term, NIL );
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, NIL, NIL, NIL );
                SubLObject done_var_$132 = NIL;
                final SubLObject token_var_$133 = NIL;
                while ( NIL == done_var_$132)
                {
                  final SubLObject a = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$133 );
                  final SubLObject valid_$134 = makeBoolean( !token_var_$133.eql( a ) );
                  if( NIL != valid_$134 && NIL != kb_mapping_macros.do_term_index_assertion_match_p( a, final_index_spec ) )
                  {
                    set.set_add( a, assertion_set );
                  }
                  done_var_$132 = makeBoolean( NIL == valid_$134 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$135 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$135, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        v_term = cdolist_list_var.first();
      }
      if( assertion_exclusion_fn.isFunctionSpec() )
      {
        final SubLObject set_contents_var = set.do_set_internal( assertion_set );
        SubLObject basis_object;
        SubLObject state;
        SubLObject a2;
        for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
            .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
        {
          a2 = set_contents.do_set_contents_next( basis_object, state );
          if( NIL != set_contents.do_set_contents_element_validP( state, a2 ) && NIL != Functions.funcall( assertion_exclusion_fn, a2 ) )
          {
            set.set_remove( a2, assertion_set );
          }
        }
      }
      count = set.set_size( assertion_set );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return count;
  }

  public static SubLObject declare_cardinality_estimates_file()
  {
    SubLFiles.declareFunction( me, "cardinality_estimates_initializedP", "CARDINALITY-ESTIMATES-INITIALIZED?", 0, 0, false );
    SubLFiles.declareFunction( me, "rebuild_cardinality_estimates", "REBUILD-CARDINALITY-ESTIMATES", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_cardinalities", "INITIALIZE-CARDINALITIES", 0, 0, false );
    SubLFiles.declareFunction( me, "isa_cardinality", "ISA-CARDINALITY", 1, 0, false );
    SubLFiles.declareFunction( me, "instance_cardinality", "INSTANCE-CARDINALITY", 1, 0, false );
    SubLFiles.declareFunction( me, "quoted_instance_cardinality", "QUOTED-INSTANCE-CARDINALITY", 1, 0, false );
    SubLFiles.declareFunction( me, "genl_cardinality", "GENL-CARDINALITY", 1, 0, false );
    SubLFiles.declareFunction( me, "spec_cardinality", "SPEC-CARDINALITY", 1, 0, false );
    SubLFiles.declareFunction( me, "use_cardinality", "USE-CARDINALITY", 1, 0, false );
    SubLFiles.declareFunction( me, "lightest_node", "LIGHTEST-NODE", 2, 0, false );
    SubLFiles.declareFunction( me, "shallowest_node", "SHALLOWEST-NODE", 2, 0, false );
    SubLFiles.declareFunction( me, "generality_estimate", "GENERALITY-ESTIMATE", 1, 0, false );
    new $generality_estimate$UnaryFunction();
    SubLFiles.declareFunction( me, "sort_by_generality_estimate", "SORT-BY-GENERALITY-ESTIMATE", 1, 1, false );
    SubLFiles.declareFunction( me, "stable_sort_by_generality_estimate", "STABLE-SORT-BY-GENERALITY-ESTIMATE", 1, 1, false );
    SubLFiles.declareFunction( me, "generality_estimateL", "GENERALITY-ESTIMATE<", 2, 0, false );
    SubLFiles.declareFunction( me, "generality_estimateG", "GENERALITY-ESTIMATE>", 2, 0, false );
    SubLFiles.declareFunction( me, "most_general_term", "MOST-GENERAL-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "least_general_term", "LEAST-GENERAL-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "instance_iteration_cost", "INSTANCE-ITERATION-COST", 1, 0, false );
    SubLFiles.declareFunction( me, "quoted_instance_iteration_cost", "QUOTED-INSTANCE-ITERATION-COST", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_cardinalities", "CLEAR-CARDINALITIES", 0, 0, false );
    SubLFiles.declareFunction( me, "local_instance_cardinality", "LOCAL-INSTANCE-CARDINALITY", 1, 0, false );
    SubLFiles.declareFunction( me, "set_local_instance_cardinality", "SET-LOCAL-INSTANCE-CARDINALITY", 2, 0, false );
    SubLFiles.declareFunction( me, "increment_local_instance_cardinality", "INCREMENT-LOCAL-INSTANCE-CARDINALITY", 2, 0, false );
    SubLFiles.declareFunction( me, "local_quoted_instance_cardinality", "LOCAL-QUOTED-INSTANCE-CARDINALITY", 1, 0, false );
    SubLFiles.declareFunction( me, "set_local_quoted_instance_cardinality", "SET-LOCAL-QUOTED-INSTANCE-CARDINALITY", 2, 0, false );
    SubLFiles.declareFunction( me, "increment_local_quoted_instance_cardinality", "INCREMENT-LOCAL-QUOTED-INSTANCE-CARDINALITY", 2, 0, false );
    SubLFiles.declareFunction( me, "local_spec_cardinality", "LOCAL-SPEC-CARDINALITY", 1, 0, false );
    SubLFiles.declareFunction( me, "set_local_spec_cardinality", "SET-LOCAL-SPEC-CARDINALITY", 2, 0, false );
    SubLFiles.declareFunction( me, "total_instance_cardinality", "TOTAL-INSTANCE-CARDINALITY", 1, 0, false );
    SubLFiles.declareFunction( me, "set_total_instance_cardinality", "SET-TOTAL-INSTANCE-CARDINALITY", 2, 0, false );
    SubLFiles.declareFunction( me, "increment_total_instance_cardinality", "INCREMENT-TOTAL-INSTANCE-CARDINALITY", 2, 0, false );
    SubLFiles.declareFunction( me, "total_quoted_instance_cardinality", "TOTAL-QUOTED-INSTANCE-CARDINALITY", 1, 0, false );
    SubLFiles.declareFunction( me, "set_total_quoted_instance_cardinality", "SET-TOTAL-QUOTED-INSTANCE-CARDINALITY", 2, 0, false );
    SubLFiles.declareFunction( me, "increment_total_quoted_instance_cardinality", "INCREMENT-TOTAL-QUOTED-INSTANCE-CARDINALITY", 2, 0, false );
    SubLFiles.declareFunction( me, "total_spec_cardinality", "TOTAL-SPEC-CARDINALITY", 1, 0, false );
    SubLFiles.declareFunction( me, "set_total_spec_cardinality", "SET-TOTAL-SPEC-CARDINALITY", 2, 0, false );
    SubLFiles.declareFunction( me, "increment_total_spec_cardinality", "INCREMENT-TOTAL-SPEC-CARDINALITY", 2, 0, false );
    SubLFiles.declareFunction( me, "total_genl_cardinality", "TOTAL-GENL-CARDINALITY", 1, 0, false );
    SubLFiles.declareFunction( me, "set_total_genl_cardinality", "SET-TOTAL-GENL-CARDINALITY", 2, 0, false );
    SubLFiles.declareFunction( me, "get_generality_estimate", "GET-GENERALITY-ESTIMATE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_generality_estimate", "SET-GENERALITY-ESTIMATE", 2, 0, false );
    SubLFiles.declareFunction( me, "setup_cardinality_tables", "SETUP-CARDINALITY-TABLES", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_local_cardinalities", "CLEAR-LOCAL-CARDINALITIES", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_local_cardinalities", "INITIALIZE-LOCAL-CARDINALITIES", 0, 0, false );
    SubLFiles.declareMacro( me, "do_sbhl_module_nodes", "DO-SBHL-MODULE-NODES" );
    SubLFiles.declareFunction( me, "get_sbhl_module_size", "GET-SBHL-MODULE-SIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "initialize_collection_local_spec_cardinalities", "INITIALIZE-COLLECTION-LOCAL-SPEC-CARDINALITIES", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_collection_local_instance_cardinalities", "INITIALIZE-COLLECTION-LOCAL-INSTANCE-CARDINALITIES", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_collection_local_quoted_instance_cardinalities", "INITIALIZE-COLLECTION-LOCAL-QUOTED-INSTANCE-CARDINALITIES", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_predicate_local_spec_cardinalities", "INITIALIZE-PREDICATE-LOCAL-SPEC-CARDINALITIES", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_microtheory_local_spec_cardinalities", "INITIALIZE-MICROTHEORY-LOCAL-SPEC-CARDINALITIES", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_other_local_instance_cardinalities", "INITIALIZE-OTHER-LOCAL-INSTANCE-CARDINALITIES", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_total_cardinalities", "CLEAR-TOTAL-CARDINALITIES", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_total_cardinalities", "INITIALIZE-TOTAL-CARDINALITIES", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_collection_total_cardinalities", "INITIALIZE-COLLECTION-TOTAL-CARDINALITIES", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_predicate_total_cardinalities", "INITIALIZE-PREDICATE-TOTAL-CARDINALITIES", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_microtheory_total_cardinalities", "INITIALIZE-MICROTHEORY-TOTAL-CARDINALITIES", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_generality_estimates", "CLEAR-GENERALITY-ESTIMATES", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_generality_estimates", "INITIALIZE-GENERALITY-ESTIMATES", 0, 0, false );
    SubLFiles.declareFunction( me, "dump_cardinality_estimates_to_stream", "DUMP-CARDINALITY-ESTIMATES-TO-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "load_cardinality_estimates_from_stream", "LOAD-CARDINALITY-ESTIMATES-FROM-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "update_cardinality_estimates_wrt_genls", "UPDATE-CARDINALITY-ESTIMATES-WRT-GENLS", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_cardinality_estimates", "CLEAR-CARDINALITY-ESTIMATES", 1, 0, false );
    SubLFiles.declareFunction( me, "update_instance_cardinality", "UPDATE-INSTANCE-CARDINALITY", 2, 0, false );
    SubLFiles.declareFunction( me, "update_spec_cardinality", "UPDATE-SPEC-CARDINALITY", 2, 0, false );
    SubLFiles.declareFunction( me, "update_genl_cardinality", "UPDATE-GENL-CARDINALITY", 2, 0, false );
    SubLFiles.declareFunction( me, "update_generality_estimate", "UPDATE-GENERALITY-ESTIMATE", 1, 0, false );
    SubLFiles.declareFunction( me, "compute_generality_estimate", "COMPUTE-GENERALITY-ESTIMATE", 1, 0, false );
    SubLFiles.declareFunction( me, "initialize_inference_test_cardinalities", "INITIALIZE-INFERENCE-TEST-CARDINALITIES", 1, 0, false );
    SubLFiles.declareFunction( me, "disjointness_power", "DISJOINTNESS-POWER", 2, 0, false );
    SubLFiles.declareFunction( me, "disjoint_with_assertion_power", "DISJOINT-WITH-ASSERTION-POWER", 1, 0, false );
    SubLFiles.declareFunction( me, "gt_inverse_cardinality", "GT-INVERSE-CARDINALITY", 2, 0, false );
    SubLFiles.declareFunction( me, "gt_predicate_cardinality", "GT-PREDICATE-CARDINALITY", 2, 0, false );
    SubLFiles.declareFunction( me, "gt_pred_extent_cardinality", "GT-PRED-EXTENT-CARDINALITY", 1, 0, false );
    SubLFiles.declareFunction( me, "collection_and_specs_assertion_count", "COLLECTION-AND-SPECS-ASSERTION-COUNT", 1, 1, false );
    SubLFiles.declareFunction( me, "terms_assertion_count", "TERMS-ASSERTION-COUNT", 1, 2, false );
    return NIL;
  }

  public static SubLObject init_cardinality_estimates_file()
  {
    $local_instance_cardinality$ = SubLFiles.deflexical( "*LOCAL-INSTANCE-CARDINALITY*", ( maybeDefault( $sym7$_LOCAL_INSTANCE_CARDINALITY_, $local_instance_cardinality$, NIL ) ) );
    $local_quoted_instance_cardinality$ = SubLFiles.deflexical( "*LOCAL-QUOTED-INSTANCE-CARDINALITY*", ( maybeDefault( $sym8$_LOCAL_QUOTED_INSTANCE_CARDINALITY_, $local_quoted_instance_cardinality$, NIL ) ) );
    $local_spec_cardinality$ = SubLFiles.deflexical( "*LOCAL-SPEC-CARDINALITY*", ( maybeDefault( $sym9$_LOCAL_SPEC_CARDINALITY_, $local_spec_cardinality$, NIL ) ) );
    $total_instance_cardinality$ = SubLFiles.deflexical( "*TOTAL-INSTANCE-CARDINALITY*", ( maybeDefault( $sym10$_TOTAL_INSTANCE_CARDINALITY_, $total_instance_cardinality$, NIL ) ) );
    $total_quoted_instance_cardinality$ = SubLFiles.deflexical( "*TOTAL-QUOTED-INSTANCE-CARDINALITY*", ( maybeDefault( $sym11$_TOTAL_QUOTED_INSTANCE_CARDINALITY_, $total_quoted_instance_cardinality$, NIL ) ) );
    $total_spec_cardinality$ = SubLFiles.deflexical( "*TOTAL-SPEC-CARDINALITY*", ( maybeDefault( $sym12$_TOTAL_SPEC_CARDINALITY_, $total_spec_cardinality$, NIL ) ) );
    $total_genl_cardinality$ = SubLFiles.deflexical( "*TOTAL-GENL-CARDINALITY*", ( maybeDefault( $sym13$_TOTAL_GENL_CARDINALITY_, $total_genl_cardinality$, NIL ) ) );
    $generality_estimate_table$ = SubLFiles.deflexical( "*GENERALITY-ESTIMATE-TABLE*", ( maybeDefault( $sym14$_GENERALITY_ESTIMATE_TABLE_, $generality_estimate_table$, NIL ) ) );
    $generality_estimate_scale_factor$ = SubLFiles.defparameter( "*GENERALITY-ESTIMATE-SCALE-FACTOR*", $int60$100 );
    return NIL;
  }

  public static SubLObject setup_cardinality_estimates_file()
  {
    subl_macro_promotions.declare_defglobal( $sym7$_LOCAL_INSTANCE_CARDINALITY_ );
    subl_macro_promotions.declare_defglobal( $sym8$_LOCAL_QUOTED_INSTANCE_CARDINALITY_ );
    subl_macro_promotions.declare_defglobal( $sym9$_LOCAL_SPEC_CARDINALITY_ );
    subl_macro_promotions.declare_defglobal( $sym10$_TOTAL_INSTANCE_CARDINALITY_ );
    subl_macro_promotions.declare_defglobal( $sym11$_TOTAL_QUOTED_INSTANCE_CARDINALITY_ );
    subl_macro_promotions.declare_defglobal( $sym12$_TOTAL_SPEC_CARDINALITY_ );
    subl_macro_promotions.declare_defglobal( $sym13$_TOTAL_GENL_CARDINALITY_ );
    subl_macro_promotions.declare_defglobal( $sym14$_GENERALITY_ESTIMATE_TABLE_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cardinality_estimates_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cardinality_estimates_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cardinality_estimates_file();
  }
  static
  {
    me = new cardinality_estimates();
    $local_instance_cardinality$ = null;
    $local_quoted_instance_cardinality$ = null;
    $local_spec_cardinality$ = null;
    $total_instance_cardinality$ = null;
    $total_quoted_instance_cardinality$ = null;
    $total_spec_cardinality$ = null;
    $total_genl_cardinality$ = null;
    $generality_estimate_table$ = null;
    $generality_estimate_scale_factor$ = null;
    $sym0$FORT_OR_CHLMT_P = makeSymbol( "FORT-OR-CHLMT-P" );
    $sym1$FORT_P = makeSymbol( "FORT-P" );
    $kw2$ASCENDING = makeKeyword( "ASCENDING" );
    $sym3$_ = makeSymbol( "<" );
    $sym4$GENERALITY_ESTIMATE = makeSymbol( "GENERALITY-ESTIMATE" );
    $kw5$DESCENDING = makeKeyword( "DESCENDING" );
    $sym6$_ = makeSymbol( ">" );
    $sym7$_LOCAL_INSTANCE_CARDINALITY_ = makeSymbol( "*LOCAL-INSTANCE-CARDINALITY*" );
    $sym8$_LOCAL_QUOTED_INSTANCE_CARDINALITY_ = makeSymbol( "*LOCAL-QUOTED-INSTANCE-CARDINALITY*" );
    $sym9$_LOCAL_SPEC_CARDINALITY_ = makeSymbol( "*LOCAL-SPEC-CARDINALITY*" );
    $sym10$_TOTAL_INSTANCE_CARDINALITY_ = makeSymbol( "*TOTAL-INSTANCE-CARDINALITY*" );
    $sym11$_TOTAL_QUOTED_INSTANCE_CARDINALITY_ = makeSymbol( "*TOTAL-QUOTED-INSTANCE-CARDINALITY*" );
    $sym12$_TOTAL_SPEC_CARDINALITY_ = makeSymbol( "*TOTAL-SPEC-CARDINALITY*" );
    $sym13$_TOTAL_GENL_CARDINALITY_ = makeSymbol( "*TOTAL-GENL-CARDINALITY*" );
    $sym14$_GENERALITY_ESTIMATE_TABLE_ = makeSymbol( "*GENERALITY-ESTIMATE-TABLE*" );
    $kw15$AREA = makeKeyword( "AREA" );
    $list16 = ConsesLow.list( ConsesLow.list( makeSymbol( "NODE-VAR" ), makeSymbol( "MODULE" ), makeSymbol( "&KEY" ), makeSymbol( "PROGRESS-MESSAGE" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol(
        "BODY" ) );
    $list17 = ConsesLow.list( makeKeyword( "PROGRESS-MESSAGE" ), makeKeyword( "DONE" ) );
    $kw18$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw19$PROGRESS_MESSAGE = makeKeyword( "PROGRESS-MESSAGE" );
    $kw20$DONE = makeKeyword( "DONE" );
    $sym21$MESSAGE_VAR = makeUninternedSymbol( "MESSAGE-VAR" );
    $sym22$MODULE_VAR = makeUninternedSymbol( "MODULE-VAR" );
    $sym23$TOTAL = makeUninternedSymbol( "TOTAL" );
    $sym24$SOFAR = makeUninternedSymbol( "SOFAR" );
    $sym25$CLET = makeSymbol( "CLET" );
    $sym26$GET_SBHL_MODULE_SIZE = makeSymbol( "GET-SBHL-MODULE-SIZE" );
    $list27 = ConsesLow.list( ZERO_INTEGER );
    $sym28$NOTING_PERCENT_PROGRESS = makeSymbol( "NOTING-PERCENT-PROGRESS" );
    $sym29$DO_SBHL_MODULE_NODES = makeSymbol( "DO-SBHL-MODULE-NODES" );
    $sym30$NOTE_PERCENT_PROGRESS = makeSymbol( "NOTE-PERCENT-PROGRESS" );
    $sym31$CINC = makeSymbol( "CINC" );
    $sym32$MODULE_VAR = makeUninternedSymbol( "MODULE-VAR" );
    $sym33$LINK_VAR = makeUninternedSymbol( "LINK-VAR" );
    $sym34$DO_SBHL_GRAPH_LINKS = makeSymbol( "DO-SBHL-GRAPH-LINKS" );
    $kw35$MODULE = makeKeyword( "MODULE" );
    $sym36$IGNORE = makeSymbol( "IGNORE" );
    $str37$Calculating_collection_local_spec = makeString( "Calculating collection local spec cardinalities" );
    $const38$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $sym39$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const40$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $list41 = ConsesLow.list( makeSymbol( "TERM" ), makeUninternedSymbol( "IMPL-VALUE" ) );
    $str42$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
    $str43$Calculating_collection_local_inst = makeString( "Calculating collection local instance cardinalities" );
    $const44$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $str45$Calculating_collection_local_quot = makeString( "Calculating collection local quoted instance cardinalities" );
    $const46$quotedIsa = constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) );
    $str47$Calculating_predicate_local_spec_ = makeString( "Calculating predicate local spec cardinalities" );
    $const48$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $str49$Calculating_microtheory_local_spe = makeString( "Calculating microtheory local spec cardinalities" );
    $const50$genlMt = constant_handles.reader_make_constant_shell( makeString( "genlMt" ) );
    $str51$Calculating_other_local_instance_ = makeString( "Calculating other local instance cardinalities" );
    $kw52$SKIP = makeKeyword( "SKIP" );
    $str53$Calculating_collection_total_card = makeString( "Calculating collection total cardinalities" );
    $list54 = ConsesLow.list( makeSymbol( "COL" ), makeUninternedSymbol( "IMPL-VALUE" ) );
    $str55$Calculating_predicate_total_cardi = makeString( "Calculating predicate total cardinalities" );
    $list56 = ConsesLow.list( makeSymbol( "PREDICATE" ), makeUninternedSymbol( "IMPL-VALUE" ) );
    $str57$Calculating_microtheory_total_car = makeString( "Calculating microtheory total cardinalities" );
    $list58 = ConsesLow.list( makeSymbol( "MT" ), makeUninternedSymbol( "IMPL-VALUE" ) );
    $str59$Calculating_generality_estimates = makeString( "Calculating generality estimates" );
    $int60$100 = makeInteger( 100 );
    $sym61$GAF_ASSERTION_ = makeSymbol( "GAF-ASSERTION?" );
    $const62$disjointWith = constant_handles.reader_make_constant_shell( makeString( "disjointWith" ) );
    $kw63$DEPTH = makeKeyword( "DEPTH" );
    $kw64$STACK = makeKeyword( "STACK" );
    $kw65$QUEUE = makeKeyword( "QUEUE" );
    $sym66$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw67$ERROR = makeKeyword( "ERROR" );
    $str68$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym69$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw70$CERROR = makeKeyword( "CERROR" );
    $str71$continue_anyway = makeString( "continue anyway" );
    $kw72$WARN = makeKeyword( "WARN" );
    $str73$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $str74$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
    $str75$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $kw76$BREADTH = makeKeyword( "BREADTH" );
  }

  public static final class $generality_estimate$UnaryFunction
      extends
        UnaryFunction
  {
    public $generality_estimate$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "GENERALITY-ESTIMATE" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return generality_estimate( arg1 );
    }
  }
}
/*
 * 
 * Total time: 2320 ms
 * 
 */