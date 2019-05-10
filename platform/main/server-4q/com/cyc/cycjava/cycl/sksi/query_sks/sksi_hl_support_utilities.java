package com.cyc.cycjava.cycl.sksi.query_sks;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.czer_meta;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_hl_support_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sksi.query_sks.sksi_hl_support_utilities";
  public static final String myFingerPrint = "81ba3e336d0c1aed62fbacec76232f9385e728013edf7e6eeddc4ad84b5fd42b";
  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-hl-support-utilities.lisp", position = 941L)
  public static SubLSymbol $sksi_supports$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-hl-support-utilities.lisp", position = 2469L)
  private static SubLSymbol $sksi_support_predicate_ordering$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-hl-support-utilities.lisp", position = 4024L)
  private static SubLSymbol $schema_object_fn_identity_rule$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-hl-support-utilities.lisp", position = 4191L)
  private static SubLSymbol $source_schema_object_fn_identity_rule$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-hl-support-utilities.lisp", position = 4382L)
  private static SubLSymbol $schema_object_id_fn_sks_code_mapping_rule$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-hl-support-utilities.lisp", position = 4586L)
  private static SubLSymbol $source_schema_object_id_fn_sks_code_mapping_rule$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-hl-support-utilities.lisp", position = 7766L)
  private static SubLSymbol $csql_supports$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-hl-support-utilities.lisp", position = 9443L)
  private static SubLSymbol $csql_support_predicate_ordering$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-hl-support-utilities.lisp", position = 10023L)
  private static SubLSymbol $source_schema_object_fn_equals_rule_el$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-hl-support-utilities.lisp", position = 10847L)
  private static SubLSymbol $source_schema_object_fn_equals_rule$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-hl-support-utilities.lisp", position = 10910L)
  private static SubLSymbol $source_schema_object_fn_undefined_unknown_el$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-hl-support-utilities.lisp", position = 11271L)
  private static SubLSymbol $source_schema_object_fn_undefined_rule_el$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-hl-support-utilities.lisp", position = 11778L)
  private static SubLSymbol $source_schema_object_fn_undefined_rule$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-hl-support-utilities.lisp", position = 11844L)
  private static SubLSymbol $source_schema_object_fn_not_undefined_rule_el$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-hl-support-utilities.lisp", position = 12230L)
  private static SubLSymbol $source_schema_object_fn_not_undefined_rule$;
  private static final SubLSymbol $kw0$UNINITIALIZED;
  private static final SubLSymbol $sym1$SUPPORT_P;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$SUPPORT_SENTENCE_OPERATOR;
  private static final SubLSymbol $kw4$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym5$IGNORE_ERRORS_HANDLER;
  private static final SubLList $list6;
  private static final SubLObject $const7$rewriteOf;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$_SCHEMA_OBJECT_FN_IDENTITY_RULE_;
  private static final SubLList $list10;
  private static final SubLSymbol $sym11$_SOURCE_SCHEMA_OBJECT_FN_IDENTITY_RULE_;
  private static final SubLList $list12;
  private static final SubLSymbol $sym13$_SCHEMA_OBJECT_ID_FN_SKS_CODE_MAPPING_RULE_;
  private static final SubLList $list14;
  private static final SubLSymbol $sym15$_SOURCE_SCHEMA_OBJECT_ID_FN_SKS_CODE_MAPPING_RULE_;
  private static final SubLList $list16;
  private static final SubLList $list17;
  private static final SubLString $str18$SKSI_reformulate_justify_got_an_u;
  private static final SubLString $str19$SKSI_reformulate_justify_got_an_u;
  private static final SubLObject $const20$SchemaObjectIDFn;
  private static final SubLObject $const21$SchemaObjectFn;
  private static final SubLSymbol $kw22$CODE;
  private static final SubLObject $const23$SourceSchemaObjectIDFn;
  private static final SubLObject $const24$SourceSchemaObjectFn;
  private static final SubLString $str25$SKSI_reformulate_justify_got_an_u;
  private static final SubLObject $const26$codeMapping;
  private static final SubLSymbol $kw27$GAF;
  private static final SubLSymbol $kw28$TRUE;
  private static final SubLObject $const29$sourceClaims;
  private static final SubLSymbol $kw30$CSQL;
  private static final SubLSymbol $sym31$LIST;
  private static final SubLObject $const32$rowInSourceClaims;
  private static final SubLObject $const33$salientURL;
  private static final SubLObject $const34$physicalSchemaSourceMap;
  private static final SubLSymbol $kw35$PHYSICAL_SCHEMA;
  private static final SubLList $list36;
  private static final SubLList $list37;
  private static final SubLList $list38;
  private static final SubLList $list39;
  private static final SubLList $list40;
  private static final SubLObject $const41$SKSIMt;
  private static final SubLObject $const42$equals;
  private static final SubLObject $const43$undefined;
  private static final SubLList $list44;
  private static final SubLList $list45;
  private static final SubLList $list46;
  private static final SubLList $list47;
  private static final SubLSymbol $sym48$_KS;
  private static final SubLSymbol $sym49$_OF;

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-hl-support-utilities.lisp", position = 1262L)
  public static SubLObject note_sksi_support(final SubLObject support)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $sksi_supports$.getDynamicValue( thread ).isList() )
    {
      $sksi_supports$.setDynamicValue( ConsesLow.cons( support, $sksi_supports$.getDynamicValue( thread ) ), thread );
      return NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-hl-support-utilities.lisp", position = 1398L)
  public static SubLObject sksi_supports()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $sksi_supports$.getDynamicValue( thread ).isList() )
    {
      return list_utilities.remove_if_not( $sym1$SUPPORT_P, $sksi_supports$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-hl-support-utilities.lisp", position = 1540L)
  public static SubLObject sksi_justify_int(final SubLObject literal, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != sksi_query_utilities.comparison_literal_p( literal ) )
    {
      return sksi_comparison_literal_supports( literal, mt );
    }
    if( NIL != sksi_query_utilities.evaluate_literal_p( literal ) )
    {
      return sksi_evaluate_literal_supports( literal, mt );
    }
    if( NIL != sksi_query_utilities.sksi_unknown_sentence_literal_p( literal ) )
    {
      return sksi_unknown_sentence_literal_supports( literal, mt );
    }
    SubLObject data_level_supports = NIL;
    SubLObject modules_used = NIL;
    final SubLObject _prev_bind_0 = $sksi_supports$.currentBinding( thread );
    try
    {
      $sksi_supports$.bind( NIL, thread );
      modules_used = sksi_modules_used_to_answer( literal, mt );
      data_level_supports = conses_high.copy_list( sksi_supports() );
    }
    finally
    {
      $sksi_supports$.rebind( _prev_bind_0, thread );
    }
    if( NIL == modules_used )
    {
      return NIL;
    }
    final SubLObject module = modules_used.first();
    final SubLObject module_level_supports = conses_high.copy_list( sksi_removal_module_generation.sksi_module_supports( module ) );
    final SubLObject supports = ConsesLow.nconc( data_level_supports, module_level_supports );
    return sksi_sort_supports( supports );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-hl-support-utilities.lisp", position = 2941L)
  public static SubLObject sksi_sort_supports(final SubLObject supports)
  {
    return list_utilities.sort_via_position( supports, $sksi_support_predicate_ordering$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym3$SUPPORT_SENTENCE_OPERATOR ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-hl-support-utilities.lisp", position = 3099L)
  public static SubLObject sksi_modules_used_to_answer(final SubLObject sentence, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject modules_used = NIL;
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw4$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym5$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          thread.resetMultipleValues();
          final SubLObject result = inference_kernel.new_cyc_query( sentence, mt, $list6 );
          final SubLObject halt_reason = thread.secondMultipleValue();
          final SubLObject inference = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          modules_used = inference_utilities.inference_removal_modules_used_in_proofs( inference );
          inference_datastructures_inference.destroy_inference_and_problem_store( inference );
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw4$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return modules_used;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-hl-support-utilities.lisp", position = 3659L)
  public static SubLObject sksi_reformulate_justify_applicableP(final SubLObject literal, final SubLObject mt)
  {
    if( NIL != kb_utilities.kbeq( $const7$rewriteOf, cycl_utilities.formula_operator( literal ) ) && NIL != el_utilities.possibly_naut_p( cycl_utilities.formula_arg2( literal, UNPROVIDED ) ) )
    {
      final SubLObject func = cycl_utilities.nat_functor( cycl_utilities.formula_arg2( literal, UNPROVIDED ) );
      return list_utilities.member_eqP( func, $list8 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-hl-support-utilities.lisp", position = 4808L)
  public static SubLObject sksi_reformulate_justify_int(final SubLObject literal, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject rewrite_of = NIL;
    SubLObject output = NIL;
    SubLObject naut = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( literal, literal, $list17 );
    rewrite_of = literal.first();
    SubLObject current = literal.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, literal, $list17 );
    output = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, literal, $list17 );
    naut = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == kb_utilities.kbeq( $const7$rewriteOf, rewrite_of ) )
      {
        Errors.error( $str18$SKSI_reformulate_justify_got_an_u, literal );
      }
      final SubLObject func = cycl_utilities.nat_functor( naut );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == list_utilities.member_eqP( func, $list8 ) )
      {
        Errors.error( $str19$SKSI_reformulate_justify_got_an_u, naut );
      }
      SubLObject logical_schema = NIL;
      SubLObject expression = NIL;
      if( NIL != kb_utilities.kbeq( func, $const20$SchemaObjectIDFn ) )
      {
        logical_schema = cycl_utilities.nat_arg1( naut, UNPROVIDED );
        expression = cycl_utilities.nat_arg2( naut, UNPROVIDED );
      }
      else
      {
        logical_schema = cycl_utilities.nat_arg2( naut, UNPROVIDED );
        expression = cycl_utilities.nat_arg3( naut, UNPROVIDED );
      }
      if( NIL == el_utilities.possibly_naut_p( expression ) )
      {
        final SubLObject mapping_mt = sksi_kb_accessors.content_mt_to_mapping_mt( mt );
        SubLObject result = NIL;
        final SubLObject mt_var = mapping_mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
          mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
          final SubLObject pred_var = $const26$codeMapping;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( logical_schema, ONE_INTEGER, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( logical_schema, ONE_INTEGER, pred_var );
            SubLObject done_var = result;
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw27$GAF, $kw28$TRUE, NIL );
                  SubLObject done_var_$1 = result;
                  final SubLObject token_var_$2 = NIL;
                  while ( NIL == done_var_$1)
                  {
                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$2 );
                    final SubLObject valid_$3 = makeBoolean( !token_var_$2.eql( ass ) );
                    if( NIL != valid_$3 )
                    {
                      final SubLObject raw = assertions_high.gaf_arg2( ass );
                      final SubLObject cycl = assertions_high.gaf_arg3( ass );
                      if( cycl.equal( expression ) && raw.equal( output ) )
                      {
                        if( NIL != kb_utilities.kbeq( func, $const20$SchemaObjectIDFn ) )
                        {
                          result = ConsesLow.list( ass, arguments.make_hl_support( $kw22$CODE, $schema_object_id_fn_sks_code_mapping_rule$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) );
                        }
                        else
                        {
                          result = ConsesLow.list( ass, arguments.make_hl_support( $kw22$CODE, $source_schema_object_id_fn_sks_code_mapping_rule$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) );
                        }
                      }
                    }
                    done_var_$1 = makeBoolean( NIL == valid_$3 || NIL != result );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid || NIL != result );
            }
          }
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
        }
        return result;
      }
      if( NIL != kb_utilities.kbeq( func, $const20$SchemaObjectIDFn ) && NIL != kb_utilities.kbeq( $const21$SchemaObjectFn, cycl_utilities.nat_functor( expression ) ) )
      {
        return ConsesLow.list( arguments.make_hl_support( $kw22$CODE, $schema_object_fn_identity_rule$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) );
      }
      if( NIL != kb_utilities.kbeq( func, $const23$SourceSchemaObjectIDFn ) && NIL != kb_utilities.kbeq( $const24$SourceSchemaObjectFn, cycl_utilities.nat_functor( expression ) ) )
      {
        return ConsesLow.list( arguments.make_hl_support( $kw22$CODE, $source_schema_object_fn_identity_rule$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) );
      }
      Errors.warn( $str25$SKSI_reformulate_justify_got_an_u, naut );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( literal, $list17 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-hl-support-utilities.lisp", position = 6683L)
  public static SubLObject sksi_comparison_literal_supports(final SubLObject literal, final SubLObject mt)
  {
    final SubLObject sks = sksi_kb_accessors.content_mt_sk_source_in_any_mt( mt );
    final SubLObject new_sentence = el_utilities.list_to_elf( ConsesLow.list( $const29$sourceClaims, sks, literal ) );
    return ConsesLow.list( arguments.make_hl_support( $kw30$CSQL, new_sentence, mt, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-hl-support-utilities.lisp", position = 7015L)
  public static SubLObject sksi_evaluate_literal_supports(final SubLObject literal, final SubLObject mt)
  {
    final SubLObject sks = sksi_kb_accessors.content_mt_sk_source_in_any_mt( mt );
    final SubLObject new_sentence = el_utilities.list_to_elf( ConsesLow.list( $const29$sourceClaims, sks, literal ) );
    return ConsesLow.list( arguments.make_hl_support( $kw30$CSQL, new_sentence, mt, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-hl-support-utilities.lisp", position = 7342L)
  public static SubLObject sksi_unknown_sentence_literal_supports(final SubLObject literal, final SubLObject mt)
  {
    final SubLObject sks = sksi_kb_accessors.content_mt_sk_source_in_any_mt( mt );
    final SubLObject unknown_sentence = el_utilities.literal_arg1( literal, UNPROVIDED );
    final SubLObject negated_sentence = el_utilities.make_negation( unknown_sentence );
    final SubLObject new_sentence = el_utilities.list_to_elf( ConsesLow.list( $const29$sourceClaims, sks, negated_sentence ) );
    return ConsesLow.list( arguments.make_hl_support( $kw30$CSQL, new_sentence, mt, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-hl-support-utilities.lisp", position = 8078L)
  public static SubLObject note_csql_support(final SubLObject support)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $csql_supports$.setDynamicValue( ConsesLow.cons( support, $csql_supports$.getDynamicValue( thread ) ), thread );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-hl-support-utilities.lisp", position = 8172L)
  public static SubLObject csql_supports()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return list_utilities.fast_delete_duplicates( $csql_supports$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-hl-support-utilities.lisp", position = 8256L)
  public static SubLObject csql_justify_int(final SubLObject sentence, final SubLObject mt)
  {
    final SubLObject pcase_var;
    final SubLObject pred = pcase_var = cycl_utilities.formula_operator( sentence );
    if( pcase_var.eql( $sym31$LIST ) || pcase_var.eql( $const32$rowInSourceClaims ) || pcase_var.eql( $const29$sourceClaims ) )
    {
      return csql_justify_int_row_in_source_claims( sentence, mt );
    }
    if( pcase_var.eql( $const33$salientURL ) )
    {
      return csql_justify_int_salient_url( sentence, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-hl-support-utilities.lisp", position = 8607L)
  public static SubLObject csql_justify_int_row_in_source_claims(final SubLObject sentence, final SubLObject mt)
  {
    final SubLObject sks = cycl_utilities.formula_arg1( sentence, UNPROVIDED );
    return csql_justify_int_guts( sks );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-hl-support-utilities.lisp", position = 8771L)
  public static SubLObject csql_justify_int_salient_url(final SubLObject sentence, final SubLObject mt)
  {
    final SubLObject sks = sksi_kb_accessors.content_mt_sk_source_in_any_mt( mt );
    return csql_justify_int_guts( sks );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-hl-support-utilities.lisp", position = 8943L)
  public static SubLObject csql_justify_int_guts(final SubLObject sks)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt( sks );
    final SubLObject sentence = ConsesLow.list( $const34$physicalSchemaSourceMap, $kw35$PHYSICAL_SCHEMA, sks );
    final SubLObject physical_schemas = ask_utilities.ask_variable( $kw35$PHYSICAL_SCHEMA, sentence, mapping_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject physical_schema = physical_schemas.first();
    SubLObject supports = NIL;
    final SubLObject _prev_bind_0 = $csql_supports$.currentBinding( thread );
    try
    {
      $csql_supports$.bind( NIL, thread );
      final SubLObject mt_var = mapping_mt;
      final SubLObject _prev_bind_0_$5 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
        sksi_access_path.sksi_determine_access_path( sks, physical_schema, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$5, thread );
      }
      supports = csql_sort_supports( csql_supports() );
    }
    finally
    {
      $csql_supports$.rebind( _prev_bind_0, thread );
    }
    return supports;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-hl-support-utilities.lisp", position = 9865L)
  public static SubLObject csql_sort_supports(final SubLObject supports)
  {
    return list_utilities.sort_via_position( supports, $csql_support_predicate_ordering$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym3$SUPPORT_SENTENCE_OPERATOR ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-hl-support-utilities.lisp", position = 12300L)
  public static SubLObject source_schema_object_fn_equals_rule()
  {
    if( NIL == $source_schema_object_fn_equals_rule$.getGlobalValue() )
    {
      $source_schema_object_fn_equals_rule$.setGlobalValue( czer_meta.find_assertion_cycl( $source_schema_object_fn_equals_rule_el$.getGlobalValue(), $const41$SKSIMt ) );
    }
    return $source_schema_object_fn_equals_rule$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-hl-support-utilities.lisp", position = 12579L)
  public static SubLObject source_schema_object_fn_undefined_rule()
  {
    if( NIL == $source_schema_object_fn_undefined_rule$.getGlobalValue() )
    {
      $source_schema_object_fn_undefined_rule$.setGlobalValue( czer_meta.find_assertion_cycl( $source_schema_object_fn_undefined_rule_el$.getGlobalValue(), $const41$SKSIMt ) );
    }
    return $source_schema_object_fn_undefined_rule$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-hl-support-utilities.lisp", position = 12873L)
  public static SubLObject source_schema_object_fn_not_undefined_rule()
  {
    if( NIL == $source_schema_object_fn_not_undefined_rule$.getGlobalValue() )
    {
      $source_schema_object_fn_not_undefined_rule$.setGlobalValue( czer_meta.find_assertion_cycl( $source_schema_object_fn_not_undefined_rule_el$.getGlobalValue(), $const41$SKSIMt ) );
    }
    return $source_schema_object_fn_not_undefined_rule$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-hl-support-utilities.lisp", position = 13187L)
  public static SubLObject source_schema_object_fn_hl_support_verify(final SubLObject literal, final SubLObject mt)
  {
    final SubLObject pcase_var = el_utilities.literal_predicate( literal, UNPROVIDED );
    if( pcase_var.eql( $const42$equals ) )
    {
      return source_schema_object_fn_hl_support_verify_equals( literal, mt );
    }
    if( pcase_var.eql( $const43$undefined ) )
    {
      return source_schema_object_fn_hl_support_verify_undefined( literal, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-hl-support-utilities.lisp", position = 13514L)
  public static SubLObject source_schema_object_fn_hl_support_verify_equals(final SubLObject literal, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject verifiedP = NIL;
    SubLObject current;
    final SubLObject datum = current = el_utilities.literal_args( literal, UNPROVIDED );
    SubLObject exp1 = NIL;
    SubLObject exp2 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
    exp1 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
    exp2 = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt ), thread );
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt ), thread );
        verifiedP = sksi_infrastructure_utilities.source_schema_object_fn_expressions_equalP( exp1, exp2 );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list44 );
    }
    return verifiedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-hl-support-utilities.lisp", position = 13796L)
  public static SubLObject source_schema_object_fn_hl_support_verify_undefined(final SubLObject literal, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject verifiedP = NIL;
    SubLObject current;
    final SubLObject datum = current = el_utilities.literal_args( literal, UNPROVIDED );
    SubLObject exp = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
    exp = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt ), thread );
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt ), thread );
        verifiedP = ( ( NIL != cycl_utilities.negatedP( literal ) ) ? sksi_infrastructure_utilities.source_schema_object_fn_expression_possibly_definedP( exp )
            : sksi_infrastructure_utilities.source_schema_object_fn_expression_undefinedP( exp ) );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list45 );
    }
    return verifiedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-hl-support-utilities.lisp", position = 14174L)
  public static SubLObject source_schema_object_fn_hl_support_justify(final SubLObject literal, final SubLObject mt)
  {
    final SubLObject pcase_var = el_utilities.literal_predicate( literal, UNPROVIDED );
    if( pcase_var.eql( $const42$equals ) )
    {
      return source_schema_object_fn_hl_support_justify_equals( literal, mt );
    }
    if( pcase_var.eql( $const43$undefined ) )
    {
      return source_schema_object_fn_hl_support_justify_undefined( literal, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-hl-support-utilities.lisp", position = 14504L)
  public static SubLObject source_schema_object_fn_hl_support_justify_equals(final SubLObject literal, final SubLObject mt)
  {
    SubLObject justification = NIL;
    SubLObject current;
    final SubLObject datum = current = el_utilities.literal_args( literal, UNPROVIDED );
    SubLObject exp1 = NIL;
    SubLObject exp2 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
    exp1 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
    exp2 = current.first();
    current = current.rest();
    if( NIL == current )
    {
      justification = sksi_infrastructure_utilities.source_schema_object_fn_expressions_equal( exp1, exp2, T );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list44 );
    }
    if( NIL != justification )
    {
      justification = ConsesLow.cons( source_schema_object_fn_equals_rule(), justification );
    }
    return justification;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-hl-support-utilities.lisp", position = 14885L)
  public static SubLObject source_schema_object_fn_hl_support_justify_undefined(final SubLObject literal, final SubLObject mt)
  {
    SubLObject current;
    final SubLObject datum = current = el_utilities.literal_args( literal, UNPROVIDED );
    SubLObject expression = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list46 );
    expression = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ( NIL != cycl_utilities.negatedP( literal ) ) ? source_schema_object_fn_hl_support_justify_undefined_neg( expression ) : source_schema_object_fn_hl_support_justify_undefined_pos( expression );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list46 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-hl-support-utilities.lisp", position = 15232L)
  public static SubLObject source_schema_object_fn_hl_support_justify_undefined_pos(final SubLObject expression)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    SubLObject justification = sksi_infrastructure_utilities.source_schema_object_fn_expression_undefined_int( expression );
    final SubLObject object_field = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != justification )
    {
      SubLObject fn = NIL;
      SubLObject sks = NIL;
      SubLObject ods = NIL;
      SubLObject id = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( expression, expression, $list47 );
      fn = expression.first();
      SubLObject current = expression.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, expression, $list47 );
      sks = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, expression, $list47 );
      ods = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, expression, $list47 );
      id = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt( sks );
        final SubLObject alist = conses_high.acons( $sym48$_KS, sks, conses_high.acons( $sym49$_OF, object_field, NIL ) );
        final SubLObject unknown_literal = conses_high.sublis( alist, $source_schema_object_fn_undefined_unknown_el$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
        final SubLObject unknown_support = arguments.make_hl_support( $kw22$CODE, unknown_literal, mapping_mt, UNPROVIDED );
        justification = ConsesLow.cons( unknown_support, justification );
        justification = ConsesLow.cons( source_schema_object_fn_undefined_rule(), justification );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( expression, $list47 );
      }
    }
    return justification;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-hl-support-utilities.lisp", position = 15967L)
  public static SubLObject source_schema_object_fn_hl_support_justify_undefined_neg(final SubLObject expression)
  {
    SubLObject supports = sksi_infrastructure_utilities.source_schema_object_fn_expression_possibly_defined( expression );
    if( NIL != supports )
    {
      supports = ConsesLow.cons( source_schema_object_fn_not_undefined_rule(), supports );
    }
    return supports;
  }

  public static SubLObject declare_sksi_hl_support_utilities_file()
  {
    SubLFiles.declareFunction( me, "note_sksi_support", "NOTE-SKSI-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_supports", "SKSI-SUPPORTS", 0, 0, false );
    SubLFiles.declareFunction( me, "sksi_justify_int", "SKSI-JUSTIFY-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_sort_supports", "SKSI-SORT-SUPPORTS", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_modules_used_to_answer", "SKSI-MODULES-USED-TO-ANSWER", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_reformulate_justify_applicableP", "SKSI-REFORMULATE-JUSTIFY-APPLICABLE?", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_reformulate_justify_int", "SKSI-REFORMULATE-JUSTIFY-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_comparison_literal_supports", "SKSI-COMPARISON-LITERAL-SUPPORTS", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_evaluate_literal_supports", "SKSI-EVALUATE-LITERAL-SUPPORTS", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_unknown_sentence_literal_supports", "SKSI-UNKNOWN-SENTENCE-LITERAL-SUPPORTS", 2, 0, false );
    SubLFiles.declareFunction( me, "note_csql_support", "NOTE-CSQL-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "csql_supports", "CSQL-SUPPORTS", 0, 0, false );
    SubLFiles.declareFunction( me, "csql_justify_int", "CSQL-JUSTIFY-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "csql_justify_int_row_in_source_claims", "CSQL-JUSTIFY-INT-ROW-IN-SOURCE-CLAIMS", 2, 0, false );
    SubLFiles.declareFunction( me, "csql_justify_int_salient_url", "CSQL-JUSTIFY-INT-SALIENT-URL", 2, 0, false );
    SubLFiles.declareFunction( me, "csql_justify_int_guts", "CSQL-JUSTIFY-INT-GUTS", 1, 0, false );
    SubLFiles.declareFunction( me, "csql_sort_supports", "CSQL-SORT-SUPPORTS", 1, 0, false );
    SubLFiles.declareFunction( me, "source_schema_object_fn_equals_rule", "SOURCE-SCHEMA-OBJECT-FN-EQUALS-RULE", 0, 0, false );
    SubLFiles.declareFunction( me, "source_schema_object_fn_undefined_rule", "SOURCE-SCHEMA-OBJECT-FN-UNDEFINED-RULE", 0, 0, false );
    SubLFiles.declareFunction( me, "source_schema_object_fn_not_undefined_rule", "SOURCE-SCHEMA-OBJECT-FN-NOT-UNDEFINED-RULE", 0, 0, false );
    SubLFiles.declareFunction( me, "source_schema_object_fn_hl_support_verify", "SOURCE-SCHEMA-OBJECT-FN-HL-SUPPORT-VERIFY", 2, 0, false );
    SubLFiles.declareFunction( me, "source_schema_object_fn_hl_support_verify_equals", "SOURCE-SCHEMA-OBJECT-FN-HL-SUPPORT-VERIFY-EQUALS", 2, 0, false );
    SubLFiles.declareFunction( me, "source_schema_object_fn_hl_support_verify_undefined", "SOURCE-SCHEMA-OBJECT-FN-HL-SUPPORT-VERIFY-UNDEFINED", 2, 0, false );
    SubLFiles.declareFunction( me, "source_schema_object_fn_hl_support_justify", "SOURCE-SCHEMA-OBJECT-FN-HL-SUPPORT-JUSTIFY", 2, 0, false );
    SubLFiles.declareFunction( me, "source_schema_object_fn_hl_support_justify_equals", "SOURCE-SCHEMA-OBJECT-FN-HL-SUPPORT-JUSTIFY-EQUALS", 2, 0, false );
    SubLFiles.declareFunction( me, "source_schema_object_fn_hl_support_justify_undefined", "SOURCE-SCHEMA-OBJECT-FN-HL-SUPPORT-JUSTIFY-UNDEFINED", 2, 0, false );
    SubLFiles.declareFunction( me, "source_schema_object_fn_hl_support_justify_undefined_pos", "SOURCE-SCHEMA-OBJECT-FN-HL-SUPPORT-JUSTIFY-UNDEFINED-POS", 1, 0, false );
    SubLFiles.declareFunction( me, "source_schema_object_fn_hl_support_justify_undefined_neg", "SOURCE-SCHEMA-OBJECT-FN-HL-SUPPORT-JUSTIFY-UNDEFINED-NEG", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_sksi_hl_support_utilities_file()
  {
    $sksi_supports$ = SubLFiles.defparameter( "*SKSI-SUPPORTS*", $kw0$UNINITIALIZED );
    $sksi_support_predicate_ordering$ = SubLFiles.deflexical( "*SKSI-SUPPORT-PREDICATE-ORDERING*", $list2 );
    $schema_object_fn_identity_rule$ = SubLFiles.deflexical( "*SCHEMA-OBJECT-FN-IDENTITY-RULE*", ( maybeDefault( $sym9$_SCHEMA_OBJECT_FN_IDENTITY_RULE_, $schema_object_fn_identity_rule$, $list10 ) ) );
    $source_schema_object_fn_identity_rule$ = SubLFiles.deflexical( "*SOURCE-SCHEMA-OBJECT-FN-IDENTITY-RULE*", ( maybeDefault( $sym11$_SOURCE_SCHEMA_OBJECT_FN_IDENTITY_RULE_, $source_schema_object_fn_identity_rule$,
        $list12 ) ) );
    $schema_object_id_fn_sks_code_mapping_rule$ = SubLFiles.deflexical( "*SCHEMA-OBJECT-ID-FN-SKS-CODE-MAPPING-RULE*", ( maybeDefault( $sym13$_SCHEMA_OBJECT_ID_FN_SKS_CODE_MAPPING_RULE_,
        $schema_object_id_fn_sks_code_mapping_rule$, $list14 ) ) );
    $source_schema_object_id_fn_sks_code_mapping_rule$ = SubLFiles.deflexical( "*SOURCE-SCHEMA-OBJECT-ID-FN-SKS-CODE-MAPPING-RULE*", ( maybeDefault( $sym15$_SOURCE_SCHEMA_OBJECT_ID_FN_SKS_CODE_MAPPING_RULE_,
        $source_schema_object_id_fn_sks_code_mapping_rule$, $list16 ) ) );
    $csql_supports$ = SubLFiles.defparameter( "*CSQL-SUPPORTS*", NIL );
    $csql_support_predicate_ordering$ = SubLFiles.deflexical( "*CSQL-SUPPORT-PREDICATE-ORDERING*", $list36 );
    $source_schema_object_fn_equals_rule_el$ = SubLFiles.deflexical( "*SOURCE-SCHEMA-OBJECT-FN-EQUALS-RULE-EL*", $list37 );
    $source_schema_object_fn_equals_rule$ = SubLFiles.deflexical( "*SOURCE-SCHEMA-OBJECT-FN-EQUALS-RULE*", NIL );
    $source_schema_object_fn_undefined_unknown_el$ = SubLFiles.deflexical( "*SOURCE-SCHEMA-OBJECT-FN-UNDEFINED-UNKNOWN-EL*", $list38 );
    $source_schema_object_fn_undefined_rule_el$ = SubLFiles.deflexical( "*SOURCE-SCHEMA-OBJECT-FN-UNDEFINED-RULE-EL*", $list39 );
    $source_schema_object_fn_undefined_rule$ = SubLFiles.deflexical( "*SOURCE-SCHEMA-OBJECT-FN-UNDEFINED-RULE*", NIL );
    $source_schema_object_fn_not_undefined_rule_el$ = SubLFiles.deflexical( "*SOURCE-SCHEMA-OBJECT-FN-NOT-UNDEFINED-RULE-EL*", $list40 );
    $source_schema_object_fn_not_undefined_rule$ = SubLFiles.deflexical( "*SOURCE-SCHEMA-OBJECT-FN-NOT-UNDEFINED-RULE*", NIL );
    return NIL;
  }

  public static SubLObject setup_sksi_hl_support_utilities_file()
  {
    subl_macro_promotions.declare_defglobal( $sym9$_SCHEMA_OBJECT_FN_IDENTITY_RULE_ );
    subl_macro_promotions.declare_defglobal( $sym11$_SOURCE_SCHEMA_OBJECT_FN_IDENTITY_RULE_ );
    subl_macro_promotions.declare_defglobal( $sym13$_SCHEMA_OBJECT_ID_FN_SKS_CODE_MAPPING_RULE_ );
    subl_macro_promotions.declare_defglobal( $sym15$_SOURCE_SCHEMA_OBJECT_ID_FN_SKS_CODE_MAPPING_RULE_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sksi_hl_support_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sksi_hl_support_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sksi_hl_support_utilities_file();
  }
  static
  {
    me = new sksi_hl_support_utilities();
    $sksi_supports$ = null;
    $sksi_support_predicate_ordering$ = null;
    $schema_object_fn_identity_rule$ = null;
    $source_schema_object_fn_identity_rule$ = null;
    $schema_object_id_fn_sks_code_mapping_rule$ = null;
    $source_schema_object_id_fn_sks_code_mapping_rule$ = null;
    $csql_supports$ = null;
    $csql_support_predicate_ordering$ = null;
    $source_schema_object_fn_equals_rule_el$ = null;
    $source_schema_object_fn_equals_rule$ = null;
    $source_schema_object_fn_undefined_unknown_el$ = null;
    $source_schema_object_fn_undefined_rule_el$ = null;
    $source_schema_object_fn_undefined_rule$ = null;
    $source_schema_object_fn_not_undefined_rule_el$ = null;
    $source_schema_object_fn_not_undefined_rule$ = null;
    $kw0$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $sym1$SUPPORT_P = makeSymbol( "SUPPORT-P" );
    $list2 = ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "meaningSentenceOfSchema" ) ), constant_handles.reader_make_constant_shell( makeString(
        "conditionalMeaningSentenceOfSchema" ) ), constant_handles.reader_make_constant_shell( makeString( "logicalPhysicalSchemaMap" ) ), constant_handles.reader_make_constant_shell( makeString(
            "physicalSchemaSourceMap" ) ), constant_handles.reader_make_constant_shell( makeString( "contentMt" ) ), constant_handles.reader_make_constant_shell( makeString( "logicalFieldEncoding" ) ), constant_handles
                .reader_make_constant_shell( makeString( "fieldEncoding" ) ), constant_handles.reader_make_constant_shell( makeString( "physicalFieldEncoding" ) ), constant_handles.reader_make_constant_shell( makeString(
                    "physicalFieldDecoding" ) ), constant_handles.reader_make_constant_shell( makeString( "fieldDecoding" ) ), constant_handles.reader_make_constant_shell( makeString( "logicalFieldDecoding" ) ),
      constant_handles.reader_make_constant_shell( makeString( "rewriteOf" ) ), constant_handles.reader_make_constant_shell( makeString( "rowInSourceClaims" ) ), constant_handles.reader_make_constant_shell( makeString(
          "sourceClaims" ) ), constant_handles.reader_make_constant_shell( makeString( "salientURL" ) )
    } );
    $sym3$SUPPORT_SENTENCE_OPERATOR = makeSymbol( "SUPPORT-SENTENCE-OPERATOR" );
    $kw4$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym5$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $list6 = ConsesLow.list( makeKeyword( "CACHE-INFERENCE-RESULTS?" ), NIL, makeKeyword( "BROWSABLE?" ), T, makeKeyword( "REWRITE-ALLOWED?" ), T, makeKeyword( "ALLOWED-MODULES" ), ConsesLow.list( makeKeyword(
        "MODULE-SUBTYPE" ), makeKeyword( "SKSI" ) ) );
    $const7$rewriteOf = constant_handles.reader_make_constant_shell( makeString( "rewriteOf" ) );
    $list8 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SchemaObjectIDFn" ) ), constant_handles.reader_make_constant_shell( makeString( "SourceSchemaObjectIDFn" ) ) );
    $sym9$_SCHEMA_OBJECT_FN_IDENTITY_RULE_ = makeSymbol( "*SCHEMA-OBJECT-FN-IDENTITY-RULE*" );
    $list10 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "rewriteOf" ) ), makeSymbol( "?ID" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "SchemaObjectIDFn" ) ), makeSymbol( "?LOGICAL-SCHEMA" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SchemaObjectFn" ) ), makeSymbol( "?LOGICAL-SCHEMA" ), makeSymbol( "?ID" ) ) ) );
    $sym11$_SOURCE_SCHEMA_OBJECT_FN_IDENTITY_RULE_ = makeSymbol( "*SOURCE-SCHEMA-OBJECT-FN-IDENTITY-RULE*" );
    $list12 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "rewriteOf" ) ), makeSymbol( "?ID" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "SourceSchemaObjectIDFn" ) ), makeSymbol( "?LOGICAL-SCHEMA" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SourceSchemaObjectFn" ) ), makeSymbol( "?SKS" ), makeSymbol(
            "?LOGICAL-SCHEMA" ), makeSymbol( "?ID" ) ) ) );
    $sym13$_SCHEMA_OBJECT_ID_FN_SKS_CODE_MAPPING_RULE_ = makeSymbol( "*SCHEMA-OBJECT-ID-FN-SKS-CODE-MAPPING-RULE*" );
    $list14 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "codeMapping" ) ), makeSymbol(
        "?LOGICAL-SCHEMA" ), makeSymbol( "?RAW" ), makeSymbol( "?CYCL" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "rewriteOf" ) ), makeSymbol( "?RAW" ), ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "SchemaObjectIDFn" ) ), makeSymbol( "?LOGICAL-SCHEMA" ), makeSymbol( "?CYCL" ) ) ) );
    $sym15$_SOURCE_SCHEMA_OBJECT_ID_FN_SKS_CODE_MAPPING_RULE_ = makeSymbol( "*SOURCE-SCHEMA-OBJECT-ID-FN-SKS-CODE-MAPPING-RULE*" );
    $list16 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "codeMapping" ) ), makeSymbol(
        "?LOGICAL-SCHEMA" ), makeSymbol( "?RAW" ), makeSymbol( "?CYCL" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "rewriteOf" ) ), makeSymbol( "?RAW" ), ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "SourceSchemaObjectIDFn" ) ), makeSymbol( "?SKS" ), makeSymbol( "?LOGICAL-SCHEMA" ), makeSymbol( "?CYCL" ) ) ) );
    $list17 = ConsesLow.list( makeSymbol( "REWRITE-OF" ), makeSymbol( "OUTPUT" ), makeSymbol( "NAUT" ) );
    $str18$SKSI_reformulate_justify_got_an_u = makeString( "SKSI reformulate justify got an unexpected literal ~a" );
    $str19$SKSI_reformulate_justify_got_an_u = makeString( "SKSI reformulate justify got an unexpected naut ~a" );
    $const20$SchemaObjectIDFn = constant_handles.reader_make_constant_shell( makeString( "SchemaObjectIDFn" ) );
    $const21$SchemaObjectFn = constant_handles.reader_make_constant_shell( makeString( "SchemaObjectFn" ) );
    $kw22$CODE = makeKeyword( "CODE" );
    $const23$SourceSchemaObjectIDFn = constant_handles.reader_make_constant_shell( makeString( "SourceSchemaObjectIDFn" ) );
    $const24$SourceSchemaObjectFn = constant_handles.reader_make_constant_shell( makeString( "SourceSchemaObjectFn" ) );
    $str25$SKSI_reformulate_justify_got_an_u = makeString( "SKSI reformulate justify got an unexpected naut" );
    $const26$codeMapping = constant_handles.reader_make_constant_shell( makeString( "codeMapping" ) );
    $kw27$GAF = makeKeyword( "GAF" );
    $kw28$TRUE = makeKeyword( "TRUE" );
    $const29$sourceClaims = constant_handles.reader_make_constant_shell( makeString( "sourceClaims" ) );
    $kw30$CSQL = makeKeyword( "CSQL" );
    $sym31$LIST = makeSymbol( "LIST" );
    $const32$rowInSourceClaims = constant_handles.reader_make_constant_shell( makeString( "rowInSourceClaims" ) );
    $const33$salientURL = constant_handles.reader_make_constant_shell( makeString( "salientURL" ) );
    $const34$physicalSchemaSourceMap = constant_handles.reader_make_constant_shell( makeString( "physicalSchemaSourceMap" ) );
    $kw35$PHYSICAL_SCHEMA = makeKeyword( "PHYSICAL-SCHEMA" );
    $list36 = ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "subKS-Direct" ) ), constant_handles.reader_make_constant_shell( makeString( "structuredKnowledgeSourceName" ) ),
      constant_handles.reader_make_constant_shell( makeString( "sksIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "serverOfSKS" ) ), constant_handles.reader_make_constant_shell( makeString(
          "portNumberForSKS" ) ), constant_handles.reader_make_constant_shell( makeString( "userNameForSKS" ) ), constant_handles.reader_make_constant_shell( makeString( "passwordForSKS" ) ), constant_handles
              .reader_make_constant_shell( makeString( "sqlProgramForSKS" ) ), constant_handles.reader_make_constant_shell( makeString( "subProtocolForSKS" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "filenameForSKS" ) ), constant_handles.reader_make_constant_shell( makeString( "keyTestFunctionForSKS" ) ), constant_handles.reader_make_constant_shell( makeString( "valueTestFunctionForSKS" ) ),
      constant_handles.reader_make_constant_shell( makeString( "serializationTypeForSKS" ) )
    } );
    $list37 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list(
        constant_handles.reader_make_constant_shell( makeString( "logicalFields" ) ), makeSymbol( "?LS1" ), makeSymbol( "?LF1" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
            "logicalSchemaSourceMap" ) ), makeSymbol( "?LS1" ), makeSymbol( "?SUB-KS1" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "subKS" ) ), makeSymbol( "?KS1" ), makeSymbol(
                "?SUB-KS1" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "subKS" ) ), makeSymbol( "?TOP" ), makeSymbol( "?KS1" ) ), ConsesLow.list( constant_handles
                    .reader_make_constant_shell( makeString( "subKS" ) ), makeSymbol( "?TOP" ), makeSymbol( "?KS2" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "subKS" ) ), makeSymbol(
                        "?KS2" ), makeSymbol( "?SUB-KS2" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "logicalSchemaSourceMap" ) ), makeSymbol( "?LS2" ), makeSymbol( "?SUB-KS2" ) ),
      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "logicalFields" ) ), makeSymbol( "?LS2" ), makeSymbol( "?LF2" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
          "joinable" ) ), makeSymbol( "?LF2" ), makeSymbol( "?OF" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "joinable" ) ), makeSymbol( "?LF1" ), makeSymbol( "?OF" ) ), ConsesLow.list(
              constant_handles.reader_make_constant_shell( makeString( "objectField" ) ), makeSymbol( "?ODS" ), makeSymbol( "?OF" ) )
    } ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equals" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SourceSchemaObjectFn" ) ), makeSymbol( "?KS1" ),
        makeSymbol( "?ODS" ), makeSymbol( "?ID" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SourceSchemaObjectFn" ) ), makeSymbol( "?KS2" ), makeSymbol( "?ODS" ), makeSymbol(
            "?ID" ) ) ) );
    $list38 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "unknownSentence" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), makeSymbol(
        "?SUB-KS" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), makeSymbol( "?LS" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
            "thereExists" ) ), makeSymbol( "?LF" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                "logicalFields" ) ), makeSymbol( "?LS" ), makeSymbol( "?LF" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "joinable" ) ), makeSymbol( "?LF" ), makeSymbol( "?OF" ) ),
                ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "logicalSchemaSourceMap" ) ), makeSymbol( "?LS" ), makeSymbol( "?SUB-KS" ) ), ConsesLow.list( constant_handles
                    .reader_make_constant_shell( makeString( "subKS" ) ), makeSymbol( "?KS" ), makeSymbol( "?SUB-KS" ) ) ) ) ) ) );
    $list39 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "objectField" ) ), makeSymbol( "?ODS" ), makeSymbol( "?OF" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "unknownSentence" ) ), ConsesLow
            .list( constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), makeSymbol( "?SUB-KS" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ),
                makeSymbol( "?LS" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), makeSymbol( "?LF" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                    makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "logicalFields" ) ), makeSymbol( "?LS" ), makeSymbol( "?LF" ) ), ConsesLow.list( constant_handles
                        .reader_make_constant_shell( makeString( "joinable" ) ), makeSymbol( "?LF" ), makeSymbol( "?OF" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                            "logicalSchemaSourceMap" ) ), makeSymbol( "?LS" ), makeSymbol( "?SUB-KS" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "subKS" ) ), makeSymbol( "?KS" ),
                                makeSymbol( "?SUB-KS" ) ) ) ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "undefined" ) ), ConsesLow.list( constant_handles
                                    .reader_make_constant_shell( makeString( "SourceSchemaObjectFn" ) ), makeSymbol( "?KS" ), makeSymbol( "?ODS" ), makeSymbol( "??ID" ) ) ) );
    $list40 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "not" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "logicalFields" ) ), makeSymbol( "?LS" ), makeSymbol( "?LF" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "logicalSchemaSourceMap" ) ),
            makeSymbol( "?LS" ), makeSymbol( "?SUB-KS" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "subKS" ) ), makeSymbol( "?KS" ), makeSymbol( "?SUB-KS" ) ), ConsesLow.list(
                constant_handles.reader_make_constant_shell( makeString( "joinable" ) ), makeSymbol( "?LF" ), makeSymbol( "?OF" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                    "objectField" ) ), makeSymbol( "?ODS" ), makeSymbol( "?OF" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "undefined" ) ), ConsesLow.list( constant_handles
                        .reader_make_constant_shell( makeString( "SourceSchemaObjectFn" ) ), makeSymbol( "?KS" ), makeSymbol( "?ODS" ), makeSymbol( "??ID" ) ) ) ) );
    $const41$SKSIMt = constant_handles.reader_make_constant_shell( makeString( "SKSIMt" ) );
    $const42$equals = constant_handles.reader_make_constant_shell( makeString( "equals" ) );
    $const43$undefined = constant_handles.reader_make_constant_shell( makeString( "undefined" ) );
    $list44 = ConsesLow.list( makeSymbol( "EXP1" ), makeSymbol( "EXP2" ) );
    $list45 = ConsesLow.list( makeSymbol( "EXP" ) );
    $list46 = ConsesLow.list( makeSymbol( "EXPRESSION" ) );
    $list47 = ConsesLow.list( makeSymbol( "FN" ), makeSymbol( "SKS" ), makeSymbol( "ODS" ), makeSymbol( "ID" ) );
    $sym48$_KS = makeSymbol( "?KS" );
    $sym49$_OF = makeSymbol( "?OF" );
  }
}
/*
 * 
 * Total time: 251 ms
 * 
 */