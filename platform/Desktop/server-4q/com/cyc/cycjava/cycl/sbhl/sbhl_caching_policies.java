package com.cyc.cycjava.cycl.sbhl;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.cfasl;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.cache_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dumper;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.builder_utilities;
import com.cyc.cycjava.cycl.cfasl_utilities;
import com.cyc.cycjava.cycl.map_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sbhl_caching_policies
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies";
  public static final String myFingerPrint = "e3f12b7b415b4e498c681a504284dac05a4aaea626360b9f55e48cdb0903fd7b";
  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 1109L)
  public static SubLSymbol $active_sbhl_caching_policies$;
  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 2701L)
  public static SubLSymbol $valid_sbhl_caching_instruction_verb$;
  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 3843L)
  public static SubLSymbol $valid_sbhl_caching_policy_types$;
  private static final SubLSymbol $sym0$_ACTIVE_SBHL_CACHING_POLICIES_;
  private static final SubLList $list1;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$VALID_SBHL_CACHING_POLICY_TYPE_P;
  private static final SubLSymbol $kw4$LINK_PREDICATE;
  private static final SubLSymbol $kw5$POLICY;
  private static final SubLSymbol $kw6$UNKNOWN;
  private static final SubLSymbol $kw7$STICKY;
  private static final SubLSymbol $kw8$UNDEFINED;
  private static final SubLString $str9$Sticky_policy_does_not_support_ca;
  private static final SubLSymbol $kw10$CAPACITY;
  private static final SubLSymbol $kw11$ALL;
  private static final SubLString $str12$Invalid_exemption_specification__;
  private static final SubLSymbol $kw13$EXEMPT;
  private static final SubLSymbol $sym14$FORT_P;
  private static final SubLString $str15$Invalid_prefetch_specification__A;
  private static final SubLSymbol $kw16$PREFETCH;
  private static final SubLSymbol $kw17$SWAPOUT;
  private static final SubLString $str18$Swapout_policy_does_not_support_c;
  private static final SubLString $str19$Invalid_exemption_specification__;
  private static final SubLString $str20$Invalid_prefetch_specification__A;
  private static final SubLString $str21$Unknown_policy_type__A_____dont_k;
  private static final SubLSymbol $kw22$DONT_CACHE;
  private static final SubLSymbol $kw23$TOUCH;
  private static final SubLString $str24$Caching_policy_of_type__A_not_yet;
  private static final SubLSymbol $sym25$LIST_OF_FORT_P;
  private static final SubLSymbol $kw26$RESET;
  private static final SubLSymbol $kw27$ENFORCED;
  private static final SubLString $str28$Enforcing_SBHL_caching_policies;
  private static final SubLSymbol $sym29$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLString $str30$__Skipping_invalid_SBHL_caching_p;
  private static final SubLString $str31$standard_kb_sbhl_caching_policies;
  private static final SubLSymbol $sym32$VALID_FORT_;
  private static final SubLInteger $int33$30;
  private static final SubLList $list34;
  private static final SubLSymbol $kw35$READY;
  private static final SubLSymbol $kw36$DONE;
  private static final SubLList $list37;
  private static final SubLList $list38;
  private static final SubLObject $const39$genls;
  private static final SubLObject $const40$genlInverse;
  private static final SubLSymbol $sym41$_;
  private static final SubLSymbol $sym42$GENERALITY_ESTIMATE_;
  private static final SubLObject $const43$genlPreds;
  private static final SubLObject $const44$genlMt;
  private static final SubLList $list45;

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 3674L)
  public static SubLObject valid_sbhl_caching_instruction_verb_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isKeyword() && NIL != subl_promotions.memberP( v_object, $valid_sbhl_caching_instruction_verb$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 4184L)
  public static SubLObject valid_sbhl_caching_policy_type_p(final SubLObject policy_type)
  {
    return makeBoolean( policy_type.isKeyword() && NIL != subl_promotions.memberP( policy_type, $valid_sbhl_caching_policy_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 4359L)
  public static SubLObject new_sbhl_caching_policy(final SubLObject link_predicate, final SubLObject policy_type, SubLObject capacity, SubLObject exemptions, SubLObject prefetch)
  {
    if( capacity == UNPROVIDED )
    {
      capacity = sbhl_graphs.$sbhl_backing_file_vector_cache_minimum_size$.getDynamicValue();
    }
    if( exemptions == UNPROVIDED )
    {
      exemptions = NIL;
    }
    if( prefetch == UNPROVIDED )
    {
      prefetch = NIL;
    }
    assert NIL != valid_sbhl_caching_policy_type_p( policy_type ) : policy_type;
    SubLObject policy = NIL;
    policy = conses_high.putf( policy, $kw4$LINK_PREDICATE, link_predicate );
    policy = conses_high.putf( policy, $kw5$POLICY, policy_type );
    policy = flesh_out_sbhl_caching_policy( policy, capacity, exemptions, prefetch );
    return policy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 5024L)
  public static SubLObject flesh_out_sbhl_caching_policy(SubLObject policy, SubLObject capacity, SubLObject exemptions, final SubLObject prefetch)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pcase_var;
    final SubLObject policy_type = pcase_var = conses_high.getf( policy, $kw5$POLICY, $kw6$UNKNOWN );
    if( pcase_var.eql( $kw7$STICKY ) )
    {
      if( NIL == capacity )
      {
        capacity = $kw8$UNDEFINED;
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && $kw8$UNDEFINED != capacity )
      {
        Errors.error( $str9$Sticky_policy_does_not_support_ca, capacity );
      }
      policy = conses_high.putf( policy, $kw10$CAPACITY, capacity );
      if( NIL == exemptions )
      {
        exemptions = $kw11$ALL;
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && $kw11$ALL != exemptions )
      {
        Errors.error( $str12$Invalid_exemption_specification__, exemptions );
      }
      policy = conses_high.putf( policy, $kw13$EXEMPT, exemptions );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && $kw11$ALL != prefetch && NIL == list_utilities.list_of_type_p( $sym14$FORT_P, prefetch ) )
      {
        Errors.error( $str15$Invalid_prefetch_specification__A, prefetch );
      }
      policy = conses_high.putf( policy, $kw16$PREFETCH, prefetch );
    }
    else if( pcase_var.eql( $kw17$SWAPOUT ) )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subl_promotions.positive_integer_p( capacity ) )
      {
        Errors.error( $str18$Swapout_policy_does_not_support_c, capacity );
      }
      policy = conses_high.putf( policy, $kw10$CAPACITY, capacity );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && $kw11$ALL != exemptions && NIL == list_utilities.list_of_type_p( $sym14$FORT_P, exemptions ) )
      {
        Errors.error( $str19$Invalid_exemption_specification__, exemptions );
      }
      policy = conses_high.putf( policy, $kw13$EXEMPT, exemptions );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == list_utilities.list_of_type_p( $sym14$FORT_P, prefetch ) )
      {
        Errors.error( $str20$Invalid_prefetch_specification__A, prefetch );
      }
      policy = conses_high.putf( policy, $kw16$PREFETCH, prefetch );
    }
    else
    {
      Errors.error( $str21$Unknown_policy_type__A_____dont_k, policy );
    }
    return policy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 7273L)
  public static SubLObject clone_sbhl_caching_policy(final SubLObject policy)
  {
    return conses_high.copy_list( policy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 7356L)
  public static SubLObject get_sbhl_caching_policy_link_predicate(final SubLObject policy)
  {
    return conses_high.getf( policy, $kw4$LINK_PREDICATE, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 7463L)
  public static SubLObject get_sbhl_caching_policy_type(final SubLObject policy)
  {
    return conses_high.getf( policy, $kw5$POLICY, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 7552L)
  public static SubLObject get_sbhl_caching_policy_capacity(final SubLObject policy)
  {
    return conses_high.getf( policy, $kw10$CAPACITY, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 7647L)
  public static SubLObject get_sbhl_caching_policy_terms_to_exempt(final SubLObject policy)
  {
    return conses_high.getf( policy, $kw13$EXEMPT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 7747L)
  public static SubLObject set_sbhl_caching_policy_terms_to_exempt(final SubLObject policy, final SubLObject exempt)
  {
    return conses_high.putf( policy, $kw16$PREFETCH, exempt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 7861L)
  public static SubLObject get_sbhl_caching_policy_terms_to_prefetch(final SubLObject policy)
  {
    return conses_high.getf( policy, $kw16$PREFETCH, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 7964L)
  public static SubLObject set_sbhl_caching_policy_terms_to_prefetch(final SubLObject policy, final SubLObject prefetches)
  {
    return conses_high.putf( policy, $kw16$PREFETCH, prefetches );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 8088L)
  public static SubLObject reset_sbhl_caching_policy(final SubLObject policy)
  {
    final SubLObject predicate = get_sbhl_caching_policy_link_predicate( policy );
    if( NIL != forts.valid_fortP( predicate ) )
    {
      final SubLObject module = sbhl_module_vars.get_sbhl_module( predicate );
      if( NIL != sbhl_module_vars.sbhl_module_p( module ) )
      {
        sbhl_graphs.swap_out_all_pristine_graph_links( module );
        return implement_sbhl_caching_policy( policy );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 8694L)
  public static SubLObject implement_sbhl_caching_policy(final SubLObject policy)
  {
    final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
    SubLObject needs_to_releaseP = NIL;
    try
    {
      needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock( rw_lock_var );
      final SubLObject predicate = get_sbhl_caching_policy_link_predicate( policy );
      final SubLObject module = sbhl_module_vars.get_sbhl_module( predicate );
      final SubLObject pcase_var;
      final SubLObject policy_type = pcase_var = get_sbhl_caching_policy_type( policy );
      if( pcase_var.eql( $kw7$STICKY ) )
      {
        sbhl_graphs.set_cache_strategy_for_sbhl_module( module, $kw22$DONT_CACHE );
      }
      else if( pcase_var.eql( $kw17$SWAPOUT ) )
      {
        final SubLObject capacity = get_sbhl_caching_policy_capacity( policy );
        final SubLObject cache_strategy = sbhl_graphs.new_cache_strategy_for_sbhl_module( module, capacity );
        sbhl_graphs.set_cache_strategy_for_sbhl_module( module, cache_strategy );
        seed_sbhl_module_graph_cache_with_nodes( module, get_sbhl_caching_policy_terms_to_exempt( policy ), $kw23$TOUCH );
      }
      else
      {
        Errors.error( $str24$Caching_policy_of_type__A_not_yet, policy_type );
      }
      seed_sbhl_module_graph_cache_with_nodes( module, get_sbhl_caching_policy_terms_to_prefetch( policy ), UNPROVIDED );
      dictionary.dictionary_enter( $active_sbhl_caching_policies$.getGlobalValue(), predicate, policy );
    }
    finally
    {
      if( NIL != needs_to_releaseP )
      {
        ReadWriteLocks.rw_lock_release_write_lock( rw_lock_var );
      }
    }
    return policy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 10118L)
  public static SubLObject seed_sbhl_module_graph_cache_with_nodes(final SubLObject module, final SubLObject nodes, SubLObject touch_p)
  {
    if( touch_p == UNPROVIDED )
    {
      touch_p = NIL;
    }
    if( NIL == nodes )
    {
      return Values.values( module, ZERO_INTEGER, touch_p );
    }
    SubLObject paged_in = ZERO_INTEGER;
    SubLObject term_list = nodes;
    if( $kw11$ALL == term_list )
    {
      term_list = get_all_nodes_for_sbhl_module_graph( module );
    }
    SubLObject cdolist_list_var = term_list;
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != forts.valid_fortP( v_term ) )
      {
        sbhl_graphs.get_sbhl_graph_link( v_term, module );
        paged_in = Numbers.add( paged_in, ONE_INTEGER );
        if( NIL != touch_p )
        {
          sbhl_graphs.touch_sbhl_graph_link( v_term, sbhl_graphs.get_sbhl_graph_link( v_term, module ), module );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    return Values.values( module, paged_in, touch_p );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 10938L)
  public static SubLObject get_all_nodes_for_sbhl_module_graph(final SubLObject module)
  {
    return map_utilities.map_keys( sbhl_module_utilities.get_sbhl_graph( module ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 11110L)
  public static SubLObject create_sbhl_caching_policy_from_term_recommendation_list(final SubLObject link_predicate, final SubLObject policy_type, final SubLObject capacity, final SubLObject term_list, SubLObject exempt,
      SubLObject prefetch)
  {
    if( exempt == UNPROVIDED )
    {
      exempt = ZERO_INTEGER;
    }
    if( prefetch == UNPROVIDED )
    {
      prefetch = ZERO_INTEGER;
    }
    assert NIL != forts.list_of_fort_p( term_list ) : term_list;
    assert NIL != forts.fort_p( link_predicate ) : link_predicate;
    SubLObject exemptions = NIL;
    SubLObject prefetchers = NIL;
    if( exempt == $kw11$ALL )
    {
      exemptions = $kw11$ALL;
      if( prefetch == $kw11$ALL )
      {
        prefetchers = $kw11$ALL;
      }
      else
      {
        prefetchers = prefetch.isFixnum() ? list_utilities.first_n( prefetch, term_list ) : NIL;
      }
    }
    else
    {
      exemptions = exempt.isFixnum() ? list_utilities.first_n( exempt, term_list ) : NIL;
      prefetchers = ( exempt.isFixnum() && prefetch.isFixnum() ) ? list_utilities.last_n( prefetch, list_utilities.first_n( Numbers.add( exempt, prefetch ), term_list ) ) : NIL;
    }
    return new_sbhl_caching_policy( link_predicate, policy_type, capacity, exemptions, prefetchers );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 12476L)
  public static SubLObject save_sbhl_caching_policies(final SubLObject policies, final SubLObject policies_file, SubLObject externalizedP)
  {
    if( externalizedP == UNPROVIDED )
    {
      externalizedP = T;
    }
    if( NIL != externalizedP )
    {
      cfasl_utilities.cfasl_save_externalized( policies, policies_file );
    }
    else
    {
      cfasl_utilities.cfasl_save( policies, policies_file );
    }
    return policies_file;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 12818L)
  public static SubLObject load_sbhl_caching_policies(final SubLObject policies_file)
  {
    return cfasl_utilities.cfasl_load( policies_file );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 13013L)
  public static SubLObject reset_sbhl_caching_policies(final SubLObject policies_file)
  {
    reset_sbhl_caching_policies_internal( load_sbhl_caching_policies( policies_file ) );
    return policies_file;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 13263L)
  public static SubLObject reset_sbhl_caching_policies_internal(final SubLObject policies)
  {
    sbhl_graphs.$sbhl_backing_file_vector_caches_for_modules$.setGlobalValue( NIL );
    dictionary.clear_dictionary( $active_sbhl_caching_policies$.getGlobalValue() );
    SubLObject cdolist_list_var = policies;
    SubLObject policy = NIL;
    policy = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      reset_sbhl_caching_policy( policy );
      cdolist_list_var = cdolist_list_var.rest();
      policy = cdolist_list_var.first();
    }
    return $kw26$RESET;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 13582L)
  public static SubLObject enforce_monolithic_kb_sbhl_caching_policies()
  {
    final SubLObject policies = builder_utilities.propose_completely_cached_kb_sbhl_caching_policies( UNPROVIDED );
    reset_sbhl_caching_policies_internal( policies );
    return $kw27$ENFORCED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 14099L)
  public static SubLObject enforce_standard_kb_sbhl_caching_policies(final SubLObject dump_directory)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject str = $str28$Enforcing_SBHL_caching_policies;
    final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
      utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
      utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
      utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
      utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
      utilities_macros.$is_noting_progressP$.bind( T, thread );
      utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
      utilities_macros.noting_progress_preamble( str );
      final SubLObject policies_file = get_standard_kb_sbhl_caching_policies_filename( dump_directory );
      SubLObject policies = NIL;
      if( NIL != Filesys.probe_file( policies_file ) )
      {
        SubLObject msg = NIL;
        try
        {
          thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          final SubLObject _prev_bind_0_$1 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( $sym29$CATCH_ERROR_MESSAGE_HANDLER, thread );
            try
            {
              policies = load_sbhl_caching_policies( policies_file );
            }
            catch( final Throwable catch_var )
            {
              Errors.handleThrowable( catch_var, NIL );
            }
          }
          finally
          {
            Errors.$error_handler$.rebind( _prev_bind_0_$1, thread );
          }
        }
        catch( final Throwable ccatch_env_var )
        {
          msg = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        }
        finally
        {
          thread.throwStack.pop();
        }
        if( msg.isString() )
        {
          Errors.warn( $str30$__Skipping_invalid_SBHL_caching_p, policies_file, msg );
        }
      }
      if( NIL == list_utilities.sublisp_boolean( policies ) )
      {
        policies = builder_utilities.propose_legacy_kb_sbhl_caching_policies( UNPROVIDED );
      }
      reset_sbhl_caching_policies_internal( policies );
      utilities_macros.noting_progress_postamble();
    }
    finally
    {
      utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
      utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
      utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
      utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_0, thread );
    }
    return $kw27$ENFORCED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 15107L)
  public static SubLObject dump_active_kb_sbhl_caching_policies(final SubLObject dump_directory, SubLObject externalizedP)
  {
    if( externalizedP == UNPROVIDED )
    {
      externalizedP = NIL;
    }
    final SubLObject policies_file = get_standard_kb_sbhl_caching_policies_filename( dump_directory );
    final SubLObject policies = gather_active_kb_sbhl_caching_policies();
    save_sbhl_caching_policies( policies, policies_file, externalizedP );
    return policies_file;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 15532L)
  public static SubLObject get_standard_kb_sbhl_caching_policies_filename(final SubLObject dump_directory)
  {
    return dumper.kb_dump_file( $str31$standard_kb_sbhl_caching_policies, dump_directory, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 15695L)
  public static SubLObject gather_active_kb_sbhl_caching_policies()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject policies = NIL;
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( $active_sbhl_caching_policies$.getGlobalValue() ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject predicate = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject value = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject policy = gather_one_active_kb_sbhl_caching_policy( predicate );
      policies = ConsesLow.cons( policy, policies );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return policies;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 16099L)
  public static SubLObject gather_one_active_kb_sbhl_caching_policy(final SubLObject predicate)
  {
    SubLObject policy = dictionary.dictionary_lookup( $active_sbhl_caching_policies$.getGlobalValue(), predicate, UNPROVIDED );
    final SubLObject exemptions = get_sbhl_caching_policy_terms_to_exempt( policy );
    final SubLObject clean_exemptions = prepare_kb_sbhl_caching_policy_term_list_for_dumping( exemptions );
    final SubLObject prefetches = get_sbhl_caching_policy_terms_to_prefetch( policy );
    final SubLObject clean_prefetches = prepare_kb_sbhl_caching_policy_term_list_for_dumping( prefetches );
    if( !exemptions.eql( clean_exemptions ) || !prefetches.eql( clean_prefetches ) )
    {
      policy = clone_sbhl_caching_policy( policy );
      policy = set_sbhl_caching_policy_terms_to_exempt( policy, clean_exemptions );
      policy = set_sbhl_caching_policy_terms_to_prefetch( policy, clean_prefetches );
    }
    return policy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 17149L)
  public static SubLObject prepare_kb_sbhl_caching_policy_term_list_for_dumping(final SubLObject term_list)
  {
    if( term_list.isList() && NIL != list_utilities.sublisp_boolean( list_utilities.find_if_not( $sym32$VALID_FORT_, term_list, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) )
    {
      return list_utilities.find_all_if( $sym32$VALID_FORT_, term_list, UNPROVIDED );
    }
    return term_list;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 17617L)
  public static SubLObject setup_sbhl_graphs_for_sbhl_cache_tuning_data_gathering()
  {
    sbhl_graphs.swap_out_all_pristine_sbhl_module_graph_links();
    sbhl_graphs.$sbhl_backing_file_vector_caches_for_modules$.setGlobalValue( NIL );
    sbhl_graphs.$sbhl_backing_file_vector_cache_size_percentage$.setDynamicValue( $int33$30 );
    SubLObject cdolist_list_var = sbhl_module_vars.get_sbhl_modules();
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject key = NIL;
      SubLObject module = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list34 );
      key = current.first();
      current = ( module = current.rest() );
      sbhl_graphs.get_cache_strategy_for_sbhl_module( module );
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    sbhl_graphs.$sbhl_backing_file_vector_caches_for_modules$.setGlobalValue( facade_sbhl_module_cache_strategies_for_recording( UNPROVIDED ) );
    return $kw35$READY;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 18703L)
  public static SubLObject setup_sbhl_graphs_for_sbhl_cache_tuning_experiment()
  {
    return $kw35$READY;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 18839L)
  public static SubLObject tear_down_sbhl_graphs_for_sbhl_cache_tuning_experiment(final SubLObject ref_counts_map)
  {
    SubLObject cdolist_list_var = sbhl_module_vars.get_sbhl_modules();
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject key = NIL;
      SubLObject module = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list34 );
      key = current.first();
      current = ( module = current.rest() );
      final SubLObject cache_strategy = sbhl_graphs.get_cache_strategy_for_sbhl_module( module );
      final SubLObject recordings = cache_utilities.recording_cache_strategy_facade_get_records( cache_strategy );
      final SubLObject ref_counts = map_utilities.map_get( ref_counts_map, module, UNPROVIDED );
      final SubLObject updated_ref_counts = count_references_in_sbhl_cache_strategy_recordings( recordings, ref_counts );
      map_utilities.map_put( ref_counts_map, module, updated_ref_counts );
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    return $kw36$DONE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 19738L)
  public static SubLObject contribute_sbhl_graphs_data_for_sbhl_cache_tuning_experiment(final SubLObject cfasl_stream, final SubLObject ref_counts_map)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject alternate_map = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
    final SubLObject iterator = map_utilities.new_map_iterator( ref_counts_map );
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
        SubLObject module = NIL;
        SubLObject ref_counts = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
        module = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
        ref_counts = current.first();
        current = current.rest();
        if( NIL == current )
        {
          map_utilities.map_put( alternate_map, sbhl_module_vars.get_sbhl_module_link_pred( module ), ref_counts );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list37 );
        }
      }
    }
    cfasl.cfasl_output( alternate_map, cfasl_stream );
    return $kw36$DONE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 20242L)
  public static SubLObject tear_down_sbhl_graphs_for_sbhl_cache_tuning_data_gathering()
  {
    sbhl_graphs.$sbhl_backing_file_vector_caches_for_modules$.setGlobalValue( unfacade_sbhl_module_cache_strategies_facaded_for_recording( UNPROVIDED ) );
    return $kw36$DONE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 20538L)
  public static SubLObject facade_sbhl_module_cache_strategies_for_recording(SubLObject old_strategy_list)
  {
    if( old_strategy_list == UNPROVIDED )
    {
      old_strategy_list = sbhl_graphs.$sbhl_backing_file_vector_caches_for_modules$.getGlobalValue();
    }
    final SubLObject time_stamper = integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject new_strategy_list = NIL;
    SubLObject cdolist_list_var = old_strategy_list;
    SubLObject cache_tuple = NIL;
    cache_tuple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject new_strategy = NIL;
      SubLObject current;
      final SubLObject datum = current = cache_tuple;
      SubLObject sbhl_module = NIL;
      SubLObject cache_strategy = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
      sbhl_module = current.first();
      current = ( cache_strategy = current.rest() );
      if( NIL != cache_utilities.recording_cache_strategy_facade_p( cache_strategy ) )
      {
        new_strategy = cache_strategy;
      }
      else
      {
        new_strategy = cache_utilities.new_recording_cache_strategy_facade( cache_strategy, time_stamper );
      }
      new_strategy_list = list_utilities.alist_enter( new_strategy_list, sbhl_module, new_strategy, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      cache_tuple = cdolist_list_var.first();
    }
    return new_strategy_list;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 21615L)
  public static SubLObject unfacade_sbhl_module_cache_strategies_facaded_for_recording(SubLObject old_strategy_list)
  {
    if( old_strategy_list == UNPROVIDED )
    {
      old_strategy_list = sbhl_graphs.$sbhl_backing_file_vector_caches_for_modules$.getGlobalValue();
    }
    SubLObject new_strategy_list = NIL;
    SubLObject cdolist_list_var = old_strategy_list;
    SubLObject cache_tuple = NIL;
    cache_tuple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject new_strategy = NIL;
      SubLObject current;
      final SubLObject datum = current = cache_tuple;
      SubLObject sbhl_module = NIL;
      SubLObject cache_strategy = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
      sbhl_module = current.first();
      current = ( cache_strategy = current.rest() );
      if( NIL != cache_utilities.recording_cache_strategy_facade_p( cache_strategy ) )
      {
        new_strategy = cache_utilities.recording_cache_strategy_facade_get_facaded_cache_strategy( cache_strategy );
      }
      else
      {
        new_strategy = cache_strategy;
      }
      new_strategy_list = list_utilities.alist_enter( new_strategy_list, sbhl_module, new_strategy, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      cache_tuple = cdolist_list_var.first();
    }
    return new_strategy_list;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 22748L)
  public static SubLObject recommend_sbhl_caching_preference_term_list_from_recordings(final SubLObject recording, final SubLObject sbhl_module)
  {
    final SubLObject references = count_references_in_sbhl_cache_strategy_recordings( recording, UNPROVIDED );
    return recommend_sbhl_caching_preference_term_list_from_ref_counts( references, sbhl_module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 23650L)
  public static SubLObject recommend_sbhl_caching_preference_term_list_from_ref_counts(final SubLObject ref_counts, final SubLObject sbhl_module)
  {
    final SubLObject pcase_var = sbhl_module_vars.get_sbhl_module_link_pred( sbhl_module );
    if( pcase_var.eql( $const39$genls ) || pcase_var.eql( $const40$genlInverse ) )
    {
      final SubLObject term_list = dictionary_utilities.dictionary_keys_sorted_by_values( ref_counts, Symbols.symbol_function( $sym41$_ ), UNPROVIDED );
      final SubLObject generality_ranked = Sort.sort( conses_high.copy_list( term_list ), $sym42$GENERALITY_ESTIMATE_, UNPROVIDED );
      return list_utilities.rerank( generality_ranked, term_list, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( pcase_var.eql( $const43$genlPreds ) )
    {
      final SubLObject term_list = dictionary_utilities.dictionary_keys_sorted_by_values( ref_counts, Symbols.symbol_function( $sym41$_ ), UNPROVIDED );
      final SubLObject generality_ranked = Sort.sort( conses_high.copy_list( term_list ), $sym42$GENERALITY_ESTIMATE_, UNPROVIDED );
      return list_utilities.rerank( generality_ranked, term_list, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( pcase_var.eql( $const44$genlMt ) )
    {
      final SubLObject term_list = dictionary_utilities.dictionary_keys_sorted_by_values( ref_counts, Symbols.symbol_function( $sym41$_ ), UNPROVIDED );
      final SubLObject generality_ranked = Sort.sort( conses_high.copy_list( term_list ), $sym42$GENERALITY_ESTIMATE_, UNPROVIDED );
      return list_utilities.rerank( generality_ranked, term_list, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    final SubLObject term_list = dictionary_utilities.dictionary_keys_sorted_by_values( ref_counts, Symbols.symbol_function( $sym41$_ ), UNPROVIDED );
    return term_list;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 25405L)
  public static SubLObject count_references_in_sbhl_cache_strategy_recordings(final SubLObject recording, SubLObject ref_counts)
  {
    if( ref_counts == UNPROVIDED )
    {
      ref_counts = NIL;
    }
    final SubLObject references = ( NIL != dictionary.dictionary_p( ref_counts ) ) ? ref_counts : dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = recording;
    SubLObject action = NIL;
    action = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = action;
      SubLObject time_stamp = NIL;
      SubLObject action_type = NIL;
      SubLObject v_term = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
      time_stamp = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
      action_type = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
      v_term = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL != forts.valid_fortP( v_term ) )
        {
          dictionary_utilities.dictionary_increment( references, v_term, UNPROVIDED );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list45 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      action = cdolist_list_var.first();
    }
    return references;
  }

  public static SubLObject declare_sbhl_caching_policies_file()
  {
    SubLFiles.declareFunction( me, "valid_sbhl_caching_instruction_verb_p", "VALID-SBHL-CACHING-INSTRUCTION-VERB-P", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_sbhl_caching_policy_type_p", "VALID-SBHL-CACHING-POLICY-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_sbhl_caching_policy", "NEW-SBHL-CACHING-POLICY", 2, 3, false );
    SubLFiles.declareFunction( me, "flesh_out_sbhl_caching_policy", "FLESH-OUT-SBHL-CACHING-POLICY", 4, 0, false );
    SubLFiles.declareFunction( me, "clone_sbhl_caching_policy", "CLONE-SBHL-CACHING-POLICY", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sbhl_caching_policy_link_predicate", "GET-SBHL-CACHING-POLICY-LINK-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sbhl_caching_policy_type", "GET-SBHL-CACHING-POLICY-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sbhl_caching_policy_capacity", "GET-SBHL-CACHING-POLICY-CAPACITY", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sbhl_caching_policy_terms_to_exempt", "GET-SBHL-CACHING-POLICY-TERMS-TO-EXEMPT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sbhl_caching_policy_terms_to_exempt", "SET-SBHL-CACHING-POLICY-TERMS-TO-EXEMPT", 2, 0, false );
    SubLFiles.declareFunction( me, "get_sbhl_caching_policy_terms_to_prefetch", "GET-SBHL-CACHING-POLICY-TERMS-TO-PREFETCH", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sbhl_caching_policy_terms_to_prefetch", "SET-SBHL-CACHING-POLICY-TERMS-TO-PREFETCH", 2, 0, false );
    SubLFiles.declareFunction( me, "reset_sbhl_caching_policy", "RESET-SBHL-CACHING-POLICY", 1, 0, false );
    SubLFiles.declareFunction( me, "implement_sbhl_caching_policy", "IMPLEMENT-SBHL-CACHING-POLICY", 1, 0, false );
    SubLFiles.declareFunction( me, "seed_sbhl_module_graph_cache_with_nodes", "SEED-SBHL-MODULE-GRAPH-CACHE-WITH-NODES", 2, 1, false );
    SubLFiles.declareFunction( me, "get_all_nodes_for_sbhl_module_graph", "GET-ALL-NODES-FOR-SBHL-MODULE-GRAPH", 1, 0, false );
    SubLFiles.declareFunction( me, "create_sbhl_caching_policy_from_term_recommendation_list", "CREATE-SBHL-CACHING-POLICY-FROM-TERM-RECOMMENDATION-LIST", 4, 2, false );
    SubLFiles.declareFunction( me, "save_sbhl_caching_policies", "SAVE-SBHL-CACHING-POLICIES", 2, 1, false );
    SubLFiles.declareFunction( me, "load_sbhl_caching_policies", "LOAD-SBHL-CACHING-POLICIES", 1, 0, false );
    SubLFiles.declareFunction( me, "reset_sbhl_caching_policies", "RESET-SBHL-CACHING-POLICIES", 1, 0, false );
    SubLFiles.declareFunction( me, "reset_sbhl_caching_policies_internal", "RESET-SBHL-CACHING-POLICIES-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "enforce_monolithic_kb_sbhl_caching_policies", "ENFORCE-MONOLITHIC-KB-SBHL-CACHING-POLICIES", 0, 0, false );
    SubLFiles.declareFunction( me, "enforce_standard_kb_sbhl_caching_policies", "ENFORCE-STANDARD-KB-SBHL-CACHING-POLICIES", 1, 0, false );
    SubLFiles.declareFunction( me, "dump_active_kb_sbhl_caching_policies", "DUMP-ACTIVE-KB-SBHL-CACHING-POLICIES", 1, 1, false );
    SubLFiles.declareFunction( me, "get_standard_kb_sbhl_caching_policies_filename", "GET-STANDARD-KB-SBHL-CACHING-POLICIES-FILENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "gather_active_kb_sbhl_caching_policies", "GATHER-ACTIVE-KB-SBHL-CACHING-POLICIES", 0, 0, false );
    SubLFiles.declareFunction( me, "gather_one_active_kb_sbhl_caching_policy", "GATHER-ONE-ACTIVE-KB-SBHL-CACHING-POLICY", 1, 0, false );
    SubLFiles.declareFunction( me, "prepare_kb_sbhl_caching_policy_term_list_for_dumping", "PREPARE-KB-SBHL-CACHING-POLICY-TERM-LIST-FOR-DUMPING", 1, 0, false );
    SubLFiles.declareFunction( me, "setup_sbhl_graphs_for_sbhl_cache_tuning_data_gathering", "SETUP-SBHL-GRAPHS-FOR-SBHL-CACHE-TUNING-DATA-GATHERING", 0, 0, false );
    SubLFiles.declareFunction( me, "setup_sbhl_graphs_for_sbhl_cache_tuning_experiment", "SETUP-SBHL-GRAPHS-FOR-SBHL-CACHE-TUNING-EXPERIMENT", 0, 0, false );
    SubLFiles.declareFunction( me, "tear_down_sbhl_graphs_for_sbhl_cache_tuning_experiment", "TEAR-DOWN-SBHL-GRAPHS-FOR-SBHL-CACHE-TUNING-EXPERIMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "contribute_sbhl_graphs_data_for_sbhl_cache_tuning_experiment", "CONTRIBUTE-SBHL-GRAPHS-DATA-FOR-SBHL-CACHE-TUNING-EXPERIMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "tear_down_sbhl_graphs_for_sbhl_cache_tuning_data_gathering", "TEAR-DOWN-SBHL-GRAPHS-FOR-SBHL-CACHE-TUNING-DATA-GATHERING", 0, 0, false );
    SubLFiles.declareFunction( me, "facade_sbhl_module_cache_strategies_for_recording", "FACADE-SBHL-MODULE-CACHE-STRATEGIES-FOR-RECORDING", 0, 1, false );
    SubLFiles.declareFunction( me, "unfacade_sbhl_module_cache_strategies_facaded_for_recording", "UNFACADE-SBHL-MODULE-CACHE-STRATEGIES-FACADED-FOR-RECORDING", 0, 1, false );
    SubLFiles.declareFunction( me, "recommend_sbhl_caching_preference_term_list_from_recordings", "RECOMMEND-SBHL-CACHING-PREFERENCE-TERM-LIST-FROM-RECORDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "recommend_sbhl_caching_preference_term_list_from_ref_counts", "RECOMMEND-SBHL-CACHING-PREFERENCE-TERM-LIST-FROM-REF-COUNTS", 2, 0, false );
    SubLFiles.declareFunction( me, "count_references_in_sbhl_cache_strategy_recordings", "COUNT-REFERENCES-IN-SBHL-CACHE-STRATEGY-RECORDINGS", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_sbhl_caching_policies_file()
  {
    $active_sbhl_caching_policies$ = SubLFiles.deflexical( "*ACTIVE-SBHL-CACHING-POLICIES*", maybeDefault( $sym0$_ACTIVE_SBHL_CACHING_POLICIES_, $active_sbhl_caching_policies$, () -> ( dictionary.new_dictionary(
        UNPROVIDED, UNPROVIDED ) ) ) );
    $valid_sbhl_caching_instruction_verb$ = SubLFiles.deflexical( "*VALID-SBHL-CACHING-INSTRUCTION-VERB*", $list1 );
    $valid_sbhl_caching_policy_types$ = SubLFiles.deflexical( "*VALID-SBHL-CACHING-POLICY-TYPES*", $list2 );
    return NIL;
  }

  public static SubLObject setup_sbhl_caching_policies_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_ACTIVE_SBHL_CACHING_POLICIES_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sbhl_caching_policies_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sbhl_caching_policies_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sbhl_caching_policies_file();
  }
  static
  {
    me = new sbhl_caching_policies();
    $active_sbhl_caching_policies$ = null;
    $valid_sbhl_caching_instruction_verb$ = null;
    $valid_sbhl_caching_policy_types$ = null;
    $sym0$_ACTIVE_SBHL_CACHING_POLICIES_ = makeSymbol( "*ACTIVE-SBHL-CACHING-POLICIES*" );
    $list1 = ConsesLow.list( makeKeyword( "LINK-PREDICATE" ), makeKeyword( "POLICY" ), makeKeyword( "CAPACITY" ), makeKeyword( "EXEMPT" ), makeKeyword( "PREFETCH" ) );
    $list2 = ConsesLow.list( makeKeyword( "STICKY" ), makeKeyword( "SWAPOUT" ) );
    $sym3$VALID_SBHL_CACHING_POLICY_TYPE_P = makeSymbol( "VALID-SBHL-CACHING-POLICY-TYPE-P" );
    $kw4$LINK_PREDICATE = makeKeyword( "LINK-PREDICATE" );
    $kw5$POLICY = makeKeyword( "POLICY" );
    $kw6$UNKNOWN = makeKeyword( "UNKNOWN" );
    $kw7$STICKY = makeKeyword( "STICKY" );
    $kw8$UNDEFINED = makeKeyword( "UNDEFINED" );
    $str9$Sticky_policy_does_not_support_ca = makeString( "Sticky policy does not support capacity ~A, only :undefined." );
    $kw10$CAPACITY = makeKeyword( "CAPACITY" );
    $kw11$ALL = makeKeyword( "ALL" );
    $str12$Invalid_exemption_specification__ = makeString( "Invalid exemption specification ~A. Only :all is permitted for sticky policy." );
    $kw13$EXEMPT = makeKeyword( "EXEMPT" );
    $sym14$FORT_P = makeSymbol( "FORT-P" );
    $str15$Invalid_prefetch_specification__A = makeString( "Invalid prefetch specification ~A. Only :ALL or lists of FORT-P (incl NIL) are permitted." );
    $kw16$PREFETCH = makeKeyword( "PREFETCH" );
    $kw17$SWAPOUT = makeKeyword( "SWAPOUT" );
    $str18$Swapout_policy_does_not_support_c = makeString( "Swapout policy does not support capacity ~A, only positive integer capacities are supported." );
    $str19$Invalid_exemption_specification__ = makeString( "Invalid exemption specification ~A. Only lists of FORT-P (incl NIL) or :all are permitted." );
    $str20$Invalid_prefetch_specification__A = makeString( "Invalid prefetch specification ~A. Only lists of FORT-P (incl NIL) are permitted." );
    $str21$Unknown_policy_type__A_____dont_k = makeString( "Unknown policy type ~A ... dont know what to do." );
    $kw22$DONT_CACHE = makeKeyword( "DONT-CACHE" );
    $kw23$TOUCH = makeKeyword( "TOUCH" );
    $str24$Caching_policy_of_type__A_not_yet = makeString( "Caching policy of type ~A not yet implemented." );
    $sym25$LIST_OF_FORT_P = makeSymbol( "LIST-OF-FORT-P" );
    $kw26$RESET = makeKeyword( "RESET" );
    $kw27$ENFORCED = makeKeyword( "ENFORCED" );
    $str28$Enforcing_SBHL_caching_policies = makeString( "Enforcing SBHL caching policies" );
    $sym29$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $str30$__Skipping_invalid_SBHL_caching_p = makeString( "~&Skipping invalid SBHL caching policies file ~A.~%Load attempt caused error: ~A.~%" );
    $str31$standard_kb_sbhl_caching_policies = makeString( "standard-kb-sbhl-caching-policies" );
    $sym32$VALID_FORT_ = makeSymbol( "VALID-FORT?" );
    $int33$30 = makeInteger( 30 );
    $list34 = ConsesLow.cons( makeUninternedSymbol( "KEY" ), makeSymbol( "MODULE" ) );
    $kw35$READY = makeKeyword( "READY" );
    $kw36$DONE = makeKeyword( "DONE" );
    $list37 = ConsesLow.list( makeSymbol( "MODULE" ), makeSymbol( "REF-COUNTS" ) );
    $list38 = ConsesLow.cons( makeSymbol( "SBHL-MODULE" ), makeSymbol( "CACHE-STRATEGY" ) );
    $const39$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $const40$genlInverse = constant_handles.reader_make_constant_shell( makeString( "genlInverse" ) );
    $sym41$_ = makeSymbol( ">" );
    $sym42$GENERALITY_ESTIMATE_ = makeSymbol( "GENERALITY-ESTIMATE>" );
    $const43$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $const44$genlMt = constant_handles.reader_make_constant_shell( makeString( "genlMt" ) );
    $list45 = ConsesLow.list( makeSymbol( "TIME-STAMP" ), makeSymbol( "ACTION-TYPE" ), makeSymbol( "TERM" ) );
  }
}
/*
 * 
 * Total time: 180 ms
 * 
 */