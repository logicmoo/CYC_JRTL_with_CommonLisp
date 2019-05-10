package com.cyc.cycjava.cycl.sksi.query_sks;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_sparql_removal_module_generation
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sksi.query_sks.sksi_sparql_removal_module_generation";
  public static final String myFingerPrint = "57a19de48f9da7b22071bd7df7716858e50cf2bbd1813c856b1f52f06b379830";
  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-sparql-removal-module-generation.lisp", position = 947L)
  private static SubLSymbol $sksi_sparql_removal_modules$;
  private static final SubLSymbol $sym0$_SKSI_SPARQL_REMOVAL_MODULES_;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$DO_DICTIONARY;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLSymbol $sym5$SKS;
  private static final SubLSymbol $sym6$DO_SKSI_SPARQL_REMOVAL_MODULES_BY_SKS;
  private static final SubLSymbol $sym7$IGNORE;
  private static final SubLObject $const8$RDFTripleStore_Physical;
  private static final SubLString $str9$SKSI_sparql____ist_Graph__variabl;
  private static final SubLString $str10$_;
  private static final SubLSymbol $kw11$PREDICATE;
  private static final SubLObject $const12$ist_Graph;
  private static final SubLSymbol $kw13$MODULE_SUBTYPE;
  private static final SubLSymbol $kw14$SKSI;
  private static final SubLSymbol $kw15$MODULE_SOURCE;
  private static final SubLSymbol $kw16$SENSE;
  private static final SubLSymbol $kw17$POS;
  private static final SubLSymbol $kw18$REQUIRED_PATTERN;
  private static final SubLSymbol $kw19$AND;
  private static final SubLList $list20;
  private static final SubLSymbol $kw21$TEST;
  private static final SubLSymbol $sym22$REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_APPLICABILITY;
  private static final SubLSymbol $kw23$COST_PATTERN;
  private static final SubLSymbol $kw24$CALL;
  private static final SubLSymbol $sym25$REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_COST;
  private static final SubLSymbol $kw26$INPUT;
  private static final SubLSymbol $kw27$COMPLETENESS_PATTERN;
  private static final SubLSymbol $sym28$REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_COMPLETENESS;
  private static final SubLSymbol $kw29$EXPAND_PATTERN;
  private static final SubLSymbol $sym30$REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_OUTPUT_GENERATE;
  private static final SubLSymbol $kw31$DOCUMENTATION;
  private static final SubLString $str32$_;
  private static final SubLString $str33$_;
  private static final SubLString $str34$REMOVAL_SKSI_;
  private static final SubLString $str35$_SPARQL_IST_GRAPH_POS_LITS;
  private static final SubLObject $const36$ThePhysicalFieldValueFn;
  private static final SubLList $list37;
  private static final SubLSymbol $kw38$DECODE;

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-sparql-removal-module-generation.lisp", position = 1146L)
  public static SubLObject note_sksi_sparql_removal_module(final SubLObject hl_module, final SubLObject sks)
  {
    return dictionary.dictionary_enter( $sksi_sparql_removal_modules$.getGlobalValue(), sks, hl_module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-sparql-removal-module-generation.lisp", position = 1283L)
  public static SubLObject un_note_sksi_sparql_removal_module(final SubLObject hl_module)
  {
    return dictionary.dictionary_remove( $sksi_sparql_removal_modules$.getGlobalValue(), hl_module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-sparql-removal-module-generation.lisp", position = 1416L)
  public static SubLObject clear_sksi_sparql_removal_modules()
  {
    return dictionary.clear_dictionary( $sksi_sparql_removal_modules$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-sparql-removal-module-generation.lisp", position = 1528L)
  public static SubLObject look_up_sksi_sparql_removal_module(final SubLObject hl_module)
  {
    return dictionary.dictionary_lookup( $sksi_sparql_removal_modules$.getGlobalValue(), hl_module, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-sparql-removal-module-generation.lisp", position = 1661L)
  public static SubLObject sksi_sparql_removal_modules_count()
  {
    return dictionary.dictionary_length( $sksi_sparql_removal_modules$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-sparql-removal-module-generation.lisp", position = 1776L)
  public static SubLObject some_sksi_sparql_removal_modules_registeredP()
  {
    return makeBoolean( NIL == dictionary.dictionary_empty_p( $sksi_sparql_removal_modules$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-sparql-removal-module-generation.lisp", position = 1910L)
  public static SubLObject do_sksi_sparql_removal_modules_by_sks(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject sks = NIL;
    SubLObject hl_module = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
    sks = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
    hl_module = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym2$DO_DICTIONARY, ConsesLow.listS( sks, hl_module, $list3 ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list1 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-sparql-removal-module-generation.lisp", position = 2080L)
  public static SubLObject do_sksi_sparql_removal_modules(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject hl_module = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    hl_module = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject sks = $sym5$SKS;
      return ConsesLow.listS( $sym6$DO_SKSI_SPARQL_REMOVAL_MODULES_BY_SKS, ConsesLow.list( sks, hl_module ), ConsesLow.list( $sym7$IGNORE, sks ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list4 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-sparql-removal-module-generation.lisp", position = 2281L)
  public static SubLObject register_sksi_sparql_removal_modules_for_sks(final SubLObject sks, SubLObject mapping_mt, SubLObject reclassifyP)
  {
    if( mapping_mt == UNPROVIDED )
    {
      mapping_mt = NIL;
    }
    if( reclassifyP == UNPROVIDED )
    {
      reclassifyP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    if( NIL == mapping_mt )
    {
      mapping_mt = sksi_kb_accessors.sk_source_mapping_mt( sks );
    }
    final SubLObject mt_var = mapping_mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      SubLObject cdolist_list_var;
      final SubLObject sub_ks_closure = cdolist_list_var = sksi_kb_accessors.sk_source_sub_ks_closure( sks );
      SubLObject ks = NIL;
      ks = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        count = Numbers.add( count, register_sksi_sparql_removal_modules_for_just_sks( ks, NIL, UNPROVIDED ) );
        cdolist_list_var = cdolist_list_var.rest();
        ks = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    if( NIL != reclassifyP )
    {
      inference_modules.reclassify_removal_modules();
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-sparql-removal-module-generation.lisp", position = 2845L)
  public static SubLObject register_sksi_sparql_removal_modules_for_just_sks(final SubLObject sks, SubLObject mapping_mt, SubLObject reclassifyP)
  {
    if( mapping_mt == UNPROVIDED )
    {
      mapping_mt = NIL;
    }
    if( reclassifyP == UNPROVIDED )
    {
      reclassifyP = T;
    }
    SubLObject count = ZERO_INTEGER;
    if( NIL != kb_utilities.kbeq( sksi_sks_accessors.sks_get_type( sks ), $const8$RDFTripleStore_Physical ) )
    {
      if( NIL == mapping_mt )
      {
        mapping_mt = sksi_kb_accessors.sk_source_mapping_mt( sks );
      }
      deregister_sksi_sparql_removal_modules_for_just_sks( sks, UNPROVIDED );
      count = register_sksi_sparql_removal_modules_for_just_sks_int( sks, mapping_mt );
      if( NIL != reclassifyP )
      {
        inference_modules.reclassify_removal_modules();
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-sparql-removal-module-generation.lisp", position = 3344L)
  public static SubLObject deregister_sksi_sparql_removal_modules_for_sks(final SubLObject sks, SubLObject mapping_mt, SubLObject reclassifyP)
  {
    if( mapping_mt == UNPROVIDED )
    {
      mapping_mt = NIL;
    }
    if( reclassifyP == UNPROVIDED )
    {
      reclassifyP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    if( NIL == mapping_mt )
    {
      mapping_mt = sksi_kb_accessors.sk_source_mapping_mt( sks );
    }
    final SubLObject mt_var = mapping_mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      SubLObject cdolist_list_var;
      final SubLObject sub_ks_closure = cdolist_list_var = sksi_kb_accessors.sk_source_sub_ks_closure( sks );
      SubLObject ks = NIL;
      ks = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        count = Numbers.add( count, deregister_sksi_sparql_removal_modules_for_just_sks( ks, NIL ) );
        cdolist_list_var = cdolist_list_var.rest();
        ks = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    if( NIL != reclassifyP )
    {
      inference_modules.reclassify_removal_modules();
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-sparql-removal-module-generation.lisp", position = 3830L)
  public static SubLObject deregister_sksi_sparql_removal_modules_for_just_sks(final SubLObject sks, SubLObject reclassifyP)
  {
    if( reclassifyP == UNPROVIDED )
    {
      reclassifyP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( $sksi_sparql_removal_modules$.getGlobalValue() ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject module_sks = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject hl_module = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( module_sks.equal( sks ) )
      {
        final SubLObject name = inference_modules.hl_module_name( hl_module );
        un_note_sksi_sparql_removal_module( sks );
        inference_modules.undeclare_inference_removal_module( name, UNPROVIDED );
        count = Numbers.add( count, ONE_INTEGER );
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    if( NIL != reclassifyP )
    {
      inference_modules.reclassify_removal_modules();
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-sparql-removal-module-generation.lisp", position = 4283L)
  public static SubLObject deregister_all_sksi_sparql_removal_modules()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( $sksi_sparql_removal_modules$.getGlobalValue() ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject sks = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject hl_module = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject name = inference_modules.hl_module_name( hl_module );
      inference_modules.undeclare_inference_removal_module( name, UNPROVIDED );
      count = Numbers.add( count, ONE_INTEGER );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    clear_sksi_sparql_removal_modules();
    inference_modules.reclassify_removal_modules();
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-sparql-removal-module-generation.lisp", position = 4707L)
  public static SubLObject register_sksi_sparql_removal_modules_for_just_sks_int(final SubLObject sks, final SubLObject mapping_mt)
  {
    final SubLObject sks_profile = sksi_query_datastructures.new_sks_profile( sks, mapping_mt, T );
    SubLObject count = ZERO_INTEGER;
    SubLObject hl_module = NIL;
    if( NIL != sksi_query_datastructures.valid_and_supported_sks_profile( sks_profile ) )
    {
      final SubLObject name = determine_sparql_ist_graph_removal_module_name( sks );
      final SubLObject doc_string = Sequences.cconcatenate( $str9$SKSI_sparql____ist_Graph__variabl, new SubLObject[] { format_nil.format_nil_s_no_copy( sks ), $str10$_
      } );
      final SubLObject plist = ConsesLow.list( new SubLObject[] { $kw11$PREDICATE, $const12$ist_Graph, $kw13$MODULE_SUBTYPE, $kw14$SKSI, $kw15$MODULE_SOURCE, sks, $kw16$SENSE, $kw17$POS, $kw18$REQUIRED_PATTERN, ConsesLow
          .list( $kw19$AND, $list20, ConsesLow.list( $kw21$TEST, $sym22$REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_APPLICABILITY, sks_profile ) ), $kw23$COST_PATTERN, ConsesLow.list( $kw24$CALL,
              $sym25$REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_COST, $kw26$INPUT, sks_profile ), $kw27$COMPLETENESS_PATTERN, ConsesLow.list( $kw24$CALL, $sym28$REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_COMPLETENESS,
                  $kw26$INPUT, sks_profile ), $kw29$EXPAND_PATTERN, ConsesLow.list( $kw24$CALL, $sym30$REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_OUTPUT_GENERATE, $kw26$INPUT, sks_profile ), $kw31$DOCUMENTATION, doc_string
      } );
      hl_module = inference_modules.inference_removal_module( name, plist );
      note_sksi_sparql_removal_module( hl_module, sks );
      count = Numbers.add( count, ONE_INTEGER );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-sparql-removal-module-generation.lisp", position = 6120L)
  public static SubLObject determine_sparql_ist_graph_removal_module_name(final SubLObject sks)
  {
    if( NIL == sks )
    {
      return NIL;
    }
    final SubLObject sks_name = sksi_kb_accessors.sk_source_name( sks );
    final SubLObject core_name_string = ( NIL != sks_name ) ? string_utilities.string_substitute( $str32$_, $str33$_, Strings.string_upcase( sks_name, UNPROVIDED, UNPROVIDED ), UNPROVIDED ) : NIL;
    final SubLObject core_name_symbol = Symbols.gensym( core_name_string );
    final SubLObject name_string = Sequences.cconcatenate( $str34$REMOVAL_SKSI_, new SubLObject[] { format_nil.format_nil_a_no_copy( core_name_symbol ), $str35$_SPARQL_IST_GRAPH_POS_LITS
    } );
    final SubLObject name = Symbols.make_keyword( name_string );
    return name;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-sparql-removal-module-generation.lisp", position = 6667L)
  public static SubLObject removal_sksi_sparql_ist_graph_pos_lits_applicability(final SubLObject asent, final SubLObject sks_profile)
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-sparql-removal-module-generation.lisp", position = 6903L)
  public static SubLObject removal_sksi_sparql_ist_graph_pos_lits_cost(final SubLObject asent, final SubLObject sks_profile)
  {
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-sparql-removal-module-generation.lisp", position = 7032L)
  public static SubLObject removal_sksi_sparql_ist_graph_pos_lits_completeness(final SubLObject asent, final SubLObject sks_profile)
  {
    final SubLObject mapping_mt = sksi_query_datastructures.sks_profile_mapping_mt( sks_profile );
    return sksi_removal_module_generation.sksi_removal_module_completeness( asent, ConsesLow.list( sksi_kb_accessors.logical_schema_for_meaning_sentence_predicate( $const12$ist_Graph, mapping_mt ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-sparql-removal-module-generation.lisp", position = 7349L)
  public static SubLObject removal_sksi_sparql_ist_graph_pos_lits_output_generate(final SubLObject asent, final SubLObject sks_profile)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject ist_graph = el_utilities.unmake_binary_formula( asent );
    final SubLObject variable = thread.secondMultipleValue();
    final SubLObject subsentence = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    final SubLObject mt = mt_relevance_macros.current_mt_relevance_mt();
    final SubLObject _prev_bind_0 = sksi_csql_sparql_interpretation.$sksi_sparql_ist_graph_variable$.currentBinding( thread );
    try
    {
      sksi_csql_sparql_interpretation.$sksi_sparql_ist_graph_variable$.bind( variable, thread );
      final SubLObject sksi_sparql_ist_graph_result_set = NIL;
      thread.resetMultipleValues();
      final SubLObject results = ask_utilities.inference_recursive_query( subsentence, mt, UNPROVIDED );
      final SubLObject halt_reason = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL == inference_datastructures_enumerated_types.avoided_inference_reason_p( halt_reason ) && NIL != sksi_csql_sparql_interpretation.$sksi_sparql_ist_graph_result$.getDynamicValue( thread ) && NIL != results )
      {
        final SubLObject v_graph = sksi_sparql_decode_ist_graph_arg1( sksi_csql_sparql_interpretation.$sksi_sparql_ist_graph_result$.getDynamicValue( thread ), sks_profile );
        final SubLObject support = arguments.make_hl_support( $kw14$SKSI, el_utilities.make_ternary_formula( $const12$ist_Graph, v_graph, subsentence, mt ), UNPROVIDED, UNPROVIDED );
        backward.removal_add_node( support, ConsesLow.list( ConsesLow.cons( sksi_csql_sparql_interpretation.$sksi_sparql_ist_graph_variable$.getDynamicValue( thread ), v_graph ) ), UNPROVIDED );
      }
    }
    finally
    {
      sksi_csql_sparql_interpretation.$sksi_sparql_ist_graph_variable$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-sparql-removal-module-generation.lisp", position = 8354L)
  public static SubLObject sksi_sparql_decode_ist_graph_arg1(final SubLObject graph_result, final SubLObject sks_profile)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject sks = sksi_query_datastructures.sks_profile_sks( sks_profile );
    final SubLObject mapping_mt = sksi_query_datastructures.sks_profile_mapping_mt( sks_profile );
    SubLObject result = NIL;
    final SubLObject mt_var = mapping_mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      final SubLObject ls = sksi_kb_accessors.logical_schema_for_meaning_sentence_predicate( $const12$ist_Graph, UNPROVIDED );
      final SubLObject ps = sksi_kb_accessors.logical_schema_physical_schemata( ls ).first();
      final SubLObject pfi = narts_high.find_nart( ConsesLow.listS( $const36$ThePhysicalFieldValueFn, ps, $list37 ) );
      final SubLObject fd = sksi_field_translation_utilities.get_field_decodings_from_physical_field_indexical( pfi, ConsesLow.list( ls ), UNPROVIDED ).first();
      result = sksi_reformulate.sksi_reformulate( list_utilities.tree_substitute( fd, pfi, graph_result ), $kw38$DECODE, sks );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  public static SubLObject declare_sksi_sparql_removal_module_generation_file()
  {
    SubLFiles.declareFunction( me, "note_sksi_sparql_removal_module", "NOTE-SKSI-SPARQL-REMOVAL-MODULE", 2, 0, false );
    SubLFiles.declareFunction( me, "un_note_sksi_sparql_removal_module", "UN-NOTE-SKSI-SPARQL-REMOVAL-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_sksi_sparql_removal_modules", "CLEAR-SKSI-SPARQL-REMOVAL-MODULES", 0, 0, false );
    SubLFiles.declareFunction( me, "look_up_sksi_sparql_removal_module", "LOOK-UP-SKSI-SPARQL-REMOVAL-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_sparql_removal_modules_count", "SKSI-SPARQL-REMOVAL-MODULES-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "some_sksi_sparql_removal_modules_registeredP", "SOME-SKSI-SPARQL-REMOVAL-MODULES-REGISTERED?", 0, 0, false );
    SubLFiles.declareMacro( me, "do_sksi_sparql_removal_modules_by_sks", "DO-SKSI-SPARQL-REMOVAL-MODULES-BY-SKS" );
    SubLFiles.declareMacro( me, "do_sksi_sparql_removal_modules", "DO-SKSI-SPARQL-REMOVAL-MODULES" );
    SubLFiles.declareFunction( me, "register_sksi_sparql_removal_modules_for_sks", "REGISTER-SKSI-SPARQL-REMOVAL-MODULES-FOR-SKS", 1, 2, false );
    SubLFiles.declareFunction( me, "register_sksi_sparql_removal_modules_for_just_sks", "REGISTER-SKSI-SPARQL-REMOVAL-MODULES-FOR-JUST-SKS", 1, 2, false );
    SubLFiles.declareFunction( me, "deregister_sksi_sparql_removal_modules_for_sks", "DEREGISTER-SKSI-SPARQL-REMOVAL-MODULES-FOR-SKS", 1, 2, false );
    SubLFiles.declareFunction( me, "deregister_sksi_sparql_removal_modules_for_just_sks", "DEREGISTER-SKSI-SPARQL-REMOVAL-MODULES-FOR-JUST-SKS", 1, 1, false );
    SubLFiles.declareFunction( me, "deregister_all_sksi_sparql_removal_modules", "DEREGISTER-ALL-SKSI-SPARQL-REMOVAL-MODULES", 0, 0, false );
    SubLFiles.declareFunction( me, "register_sksi_sparql_removal_modules_for_just_sks_int", "REGISTER-SKSI-SPARQL-REMOVAL-MODULES-FOR-JUST-SKS-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "determine_sparql_ist_graph_removal_module_name", "DETERMINE-SPARQL-IST-GRAPH-REMOVAL-MODULE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_sksi_sparql_ist_graph_pos_lits_applicability", "REMOVAL-SKSI-SPARQL-IST-GRAPH-POS-LITS-APPLICABILITY", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_sksi_sparql_ist_graph_pos_lits_cost", "REMOVAL-SKSI-SPARQL-IST-GRAPH-POS-LITS-COST", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_sksi_sparql_ist_graph_pos_lits_completeness", "REMOVAL-SKSI-SPARQL-IST-GRAPH-POS-LITS-COMPLETENESS", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_sksi_sparql_ist_graph_pos_lits_output_generate", "REMOVAL-SKSI-SPARQL-IST-GRAPH-POS-LITS-OUTPUT-GENERATE", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_sparql_decode_ist_graph_arg1", "SKSI-SPARQL-DECODE-IST-GRAPH-ARG1", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_sksi_sparql_removal_module_generation_file()
  {
    $sksi_sparql_removal_modules$ = SubLFiles.deflexical( "*SKSI-SPARQL-REMOVAL-MODULES*", maybeDefault( $sym0$_SKSI_SPARQL_REMOVAL_MODULES_, $sksi_sparql_removal_modules$, () -> ( dictionary.new_dictionary( Symbols
        .symbol_function( EQUAL ), UNPROVIDED ) ) ) );
    return NIL;
  }

  public static SubLObject setup_sksi_sparql_removal_module_generation_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_SKSI_SPARQL_REMOVAL_MODULES_ );
    utilities_macros.note_funcall_helper_function( $sym22$REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_APPLICABILITY );
    utilities_macros.note_funcall_helper_function( $sym25$REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_COST );
    utilities_macros.note_funcall_helper_function( $sym28$REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_COMPLETENESS );
    utilities_macros.note_funcall_helper_function( $sym30$REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_OUTPUT_GENERATE );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sksi_sparql_removal_module_generation_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sksi_sparql_removal_module_generation_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sksi_sparql_removal_module_generation_file();
  }
  static
  {
    me = new sksi_sparql_removal_module_generation();
    $sksi_sparql_removal_modules$ = null;
    $sym0$_SKSI_SPARQL_REMOVAL_MODULES_ = makeSymbol( "*SKSI-SPARQL-REMOVAL-MODULES*" );
    $list1 = ConsesLow.list( ConsesLow.list( makeSymbol( "SKS" ), makeSymbol( "HL-MODULE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym2$DO_DICTIONARY = makeSymbol( "DO-DICTIONARY" );
    $list3 = ConsesLow.list( makeSymbol( "*SKSI-SPARQL-REMOVAL-MODULES*" ) );
    $list4 = ConsesLow.list( ConsesLow.list( makeSymbol( "HL-MODULE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym5$SKS = makeUninternedSymbol( "SKS" );
    $sym6$DO_SKSI_SPARQL_REMOVAL_MODULES_BY_SKS = makeSymbol( "DO-SKSI-SPARQL-REMOVAL-MODULES-BY-SKS" );
    $sym7$IGNORE = makeSymbol( "IGNORE" );
    $const8$RDFTripleStore_Physical = constant_handles.reader_make_constant_shell( makeString( "RDFTripleStore-Physical" ) );
    $str9$SKSI_sparql____ist_Graph__variabl = makeString( "SKSI sparql (#$ist-Graph :variable . :fully-bound) removal module for " );
    $str10$_ = makeString( "." );
    $kw11$PREDICATE = makeKeyword( "PREDICATE" );
    $const12$ist_Graph = constant_handles.reader_make_constant_shell( makeString( "ist-Graph" ) );
    $kw13$MODULE_SUBTYPE = makeKeyword( "MODULE-SUBTYPE" );
    $kw14$SKSI = makeKeyword( "SKSI" );
    $kw15$MODULE_SOURCE = makeKeyword( "MODULE-SOURCE" );
    $kw16$SENSE = makeKeyword( "SENSE" );
    $kw17$POS = makeKeyword( "POS" );
    $kw18$REQUIRED_PATTERN = makeKeyword( "REQUIRED-PATTERN" );
    $kw19$AND = makeKeyword( "AND" );
    $list20 = ConsesLow.listS( constant_handles.reader_make_constant_shell( makeString( "ist-Graph" ) ), makeKeyword( "VARIABLE" ), makeKeyword( "FULLY-BOUND" ) );
    $kw21$TEST = makeKeyword( "TEST" );
    $sym22$REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_APPLICABILITY = makeSymbol( "REMOVAL-SKSI-SPARQL-IST-GRAPH-POS-LITS-APPLICABILITY" );
    $kw23$COST_PATTERN = makeKeyword( "COST-PATTERN" );
    $kw24$CALL = makeKeyword( "CALL" );
    $sym25$REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_COST = makeSymbol( "REMOVAL-SKSI-SPARQL-IST-GRAPH-POS-LITS-COST" );
    $kw26$INPUT = makeKeyword( "INPUT" );
    $kw27$COMPLETENESS_PATTERN = makeKeyword( "COMPLETENESS-PATTERN" );
    $sym28$REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_COMPLETENESS = makeSymbol( "REMOVAL-SKSI-SPARQL-IST-GRAPH-POS-LITS-COMPLETENESS" );
    $kw29$EXPAND_PATTERN = makeKeyword( "EXPAND-PATTERN" );
    $sym30$REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_OUTPUT_GENERATE = makeSymbol( "REMOVAL-SKSI-SPARQL-IST-GRAPH-POS-LITS-OUTPUT-GENERATE" );
    $kw31$DOCUMENTATION = makeKeyword( "DOCUMENTATION" );
    $str32$_ = makeString( "-" );
    $str33$_ = makeString( "_" );
    $str34$REMOVAL_SKSI_ = makeString( "REMOVAL-SKSI-" );
    $str35$_SPARQL_IST_GRAPH_POS_LITS = makeString( "-SPARQL-IST-GRAPH-POS-LITS" );
    $const36$ThePhysicalFieldValueFn = constant_handles.reader_make_constant_shell( makeString( "ThePhysicalFieldValueFn" ) );
    $list37 = ConsesLow.list( makeString( "subject" ) );
    $kw38$DECODE = makeKeyword( "DECODE" );
  }
}
/*
 * 
 * Total time: 136 ms
 * 
 */