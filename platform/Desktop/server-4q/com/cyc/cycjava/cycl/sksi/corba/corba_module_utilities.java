package com.cyc.cycjava.cycl.sksi.corba;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.hl_storage_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.transform_list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class corba_module_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sksi.corba.corba_module_utilities";
  public static final String myFingerPrint = "be7fc5a200a6f40fd5f55d01a847ce4ddeae06d691309ef30c60194680bb21bf";
  @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 873L)
  public static SubLSymbol $corba_connections_by_sks$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 4379L)
  private static SubLSymbol $sksi_corba_modules$;
  private static final SubLSymbol $sym0$CORBA_CONNECTION_P;
  private static final SubLSymbol $sym1$SKS_P;
  private static final SubLObject $const2$sksProxyHost;
  private static final SubLObject $const3$sksProxyPort;
  private static final SubLObject $const4$corbaSKSInitialORBHost;
  private static final SubLObject $const5$corbaSKSInitialORBPort;
  private static final SubLObject $const6$corbaSKSServiceName;
  private static final SubLObject $const7$corbaSKSInitialObjectClass;
  private static final SubLString $str8$Helper;
  private static final SubLSymbol $kw9$PROXY_HOST;
  private static final SubLSymbol $kw10$PROXY_PORT;
  private static final SubLSymbol $kw11$INITIAL_ORB_HOST;
  private static final SubLSymbol $kw12$INITIAL_ORB_PORT;
  private static final SubLSymbol $kw13$SERVICE_NAME;
  private static final SubLSymbol $kw14$INITIAL_OBJECT_CLASS;
  private static final SubLSymbol $kw15$INITIAL_OBJECT_CLASS_HELPER;
  private static final SubLString $str16$removal;
  private static final SubLSymbol $sym17$CORBA_PREDICATE_P;
  private static final SubLString $str18$corba;
  private static final SubLString $str19$_;
  private static final SubLSymbol $sym20$KEYWORDP;
  private static final SubLSymbol $sym21$STRING_FROM_KEYWORD;
  private static final SubLSymbol $sym22$CCONCATENATE;
  private static final SubLSymbol $sym23$_SKSI_CORBA_MODULES_;
  private static final SubLObject $const24$CommonObjectRequestBrokerArchitec;
  private static final SubLSymbol $kw25$SENSE;
  private static final SubLSymbol $kw26$POS;
  private static final SubLSymbol $kw27$PREDICATE;
  private static final SubLSymbol $kw28$REQUIRED_PATTERN;
  private static final SubLSymbol $kw29$COST_EXPRESSION;
  private static final SubLSymbol $kw30$EXPAND;
  private static final SubLSymbol $kw31$REQUIRED_MT;
  private static final SubLSymbol $kw32$CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_METHOD_ARGS_STORAGE;
  private static final SubLSymbol $kw33$PRETTY_NAME;
  private static final SubLString $str34$__corbaSetObjectMethodArgs;
  private static final SubLSymbol $kw35$ARGUMENT_TYPE;
  private static final SubLSymbol $kw36$ARGUMENT;
  private static final SubLObject $const37$corbaSetObjectMethodArgs;
  private static final SubLSymbol $kw38$APPLICABILITY;
  private static final SubLSymbol $sym39$CORBA_SET_OBJECT_METHOD_ARGS_HL_STORAGE_MODULE_APPLICABLE_;
  private static final SubLSymbol $kw40$INCOMPLETENESS;
  private static final SubLSymbol $sym41$CORBA_SET_HL_STORAGE_MODULE_INCOMPLETENESS;
  private static final SubLSymbol $kw42$ADD;
  private static final SubLSymbol $sym43$CORBA_SET_HL_STORAGE_MODULE_ASSERT;
  private static final SubLSymbol $kw44$CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_FIELD_ARG_STORAGE;
  private static final SubLString $str45$__corbaSetObjectFieldArg;
  private static final SubLObject $const46$corbaSetObjectFieldArg;
  private static final SubLSymbol $sym47$CORBA_SET_OBJECT_FIELD_ARG_HL_STORAGE_MODULE_APPLICABLE_;
  private static final SubLSymbol $kw48$CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_METHOD_ARGS_STORAGE;
  private static final SubLString $str49$__corbaSetClassMethodArgs;
  private static final SubLObject $const50$corbaSetClassMethodArgs;
  private static final SubLSymbol $sym51$CORBA_SET_CLASS_METHOD_ARGS_HL_STORAGE_MODULE_APPLICABLE_;
  private static final SubLSymbol $kw52$CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_FIELD_ARG_STORAGE;
  private static final SubLString $str53$__corbaSetClassFieldArg;
  private static final SubLObject $const54$corbaSetClassFieldArg;
  private static final SubLSymbol $sym55$CORBA_SET_CLASS_FIELD_ARG_HL_STORAGE_MODULE_APPLICABLE_;
  private static final SubLObject $const56$SubLListOrAtom;
  private static final SubLObject $const57$CORBAMappingVocabularyMt;
  private static final SubLObject $const58$CycLClosedDenotationalTerm;

  @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 1060L)
  public static SubLObject add_corba_connection_by_sks(final SubLObject corba_connection, final SubLObject sks)
  {
    assert NIL != corba_utilities.corba_connection_p( corba_connection ) : corba_connection;
    assert NIL != sksi_sks_accessors.sks_p( sks ) : sks;
    $corba_connections_by_sks$.setGlobalValue( conses_high.putf( $corba_connections_by_sks$.getGlobalValue(), sks, corba_connection ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 1407L)
  public static SubLObject rem_corba_connection_by_sks(final SubLObject sks)
  {
    assert NIL != sksi_sks_accessors.sks_p( sks ) : sks;
    $corba_connections_by_sks$.setGlobalValue( conses_high.remf( $corba_connections_by_sks$.getGlobalValue(), sks ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 1671L)
  public static SubLObject get_corba_connection_by_sks(final SubLObject sks)
  {
    assert NIL != sksi_sks_accessors.sks_p( sks ) : sks;
    return conses_high.getf( $corba_connections_by_sks$.getGlobalValue(), sks, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 1794L)
  public static SubLObject new_corba_connection_by_sks(final SubLObject sks)
  {
    assert NIL != sksi_sks_accessors.sks_p( sks ) : sks;
    final SubLObject proxy_host = sksi_sks_accessors.sks_fget( sks, $const2$sksProxyHost, UNPROVIDED );
    final SubLObject proxy_port = sksi_sks_accessors.sks_fget( sks, $const3$sksProxyPort, UNPROVIDED );
    final SubLObject initial_orb_host = sksi_sks_accessors.sks_fget( sks, $const4$corbaSKSInitialORBHost, UNPROVIDED );
    final SubLObject initial_orb_port = sksi_sks_accessors.sks_fget( sks, $const5$corbaSKSInitialORBPort, UNPROVIDED );
    final SubLObject service_name = sksi_sks_accessors.sks_fget( sks, $const6$corbaSKSServiceName, UNPROVIDED );
    final SubLObject initial_object_class = sksi_sks_accessors.sks_fget( sks, $const7$corbaSKSInitialObjectClass, UNPROVIDED );
    final SubLObject initial_object_class_helper = ( NIL != initial_object_class ) ? Sequences.cconcatenate( initial_object_class, $str8$Helper ) : NIL;
    final SubLObject connection = corba_utilities.new_corba_connection( ConsesLow.list( new SubLObject[] { $kw9$PROXY_HOST, proxy_host, $kw10$PROXY_PORT, proxy_port, $kw11$INITIAL_ORB_HOST, initial_orb_host,
      $kw12$INITIAL_ORB_PORT, initial_orb_port, $kw13$SERVICE_NAME, service_name, $kw14$INITIAL_OBJECT_CLASS, initial_object_class, $kw15$INITIAL_OBJECT_CLASS_HELPER, initial_object_class_helper
    } ) );
    add_corba_connection_by_sks( connection, sks );
    return connection;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 2731L)
  public static SubLObject find_or_create_corba_connection_by_sks(final SubLObject sks)
  {
    assert NIL != sksi_sks_accessors.sks_p( sks ) : sks;
    SubLObject connection = get_corba_connection_by_sks( sks );
    if( NIL == connection )
    {
      connection = new_corba_connection_by_sks( sks );
    }
    if( NIL != corba_utilities.corba_connection_invalidP( connection ) )
    {
      rem_corba_connection_by_sks( sks );
      connection = new_corba_connection_by_sks( sks );
    }
    return connection;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 3143L)
  public static SubLObject make_corba_module_name_keyword(final SubLObject sks, final SubLObject pred, SubLObject type)
  {
    if( type == UNPROVIDED )
    {
      type = $str16$removal;
    }
    assert NIL != sksi_sks_accessors.sks_p( sks ) : sks;
    assert NIL != corba_utilities.corba_predicate_p( pred ) : pred;
    final SubLObject sks_strings = string_utilities.relevant_substrings( constants_high.constant_name( sks ) );
    final SubLObject pred_strings = string_utilities.relevant_substrings( constants_high.constant_name( pred ) );
    return corba_make_keyword( list_utilities.insert_between_each( ConsesLow.append( ConsesLow.list( $str18$corba ), sks_strings, pred_strings, ConsesLow.list( type ) ), $str19$_ ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 3708L)
  public static SubLObject make_corba_gateway_keyword(final SubLObject pred)
  {
    SubLObject pred_strings = string_utilities.relevant_substrings( constants_high.constant_name( pred ) );
    if( NIL != Strings.stringE( pred_strings.first(), $str18$corba, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      pred_strings = pred_strings.rest();
    }
    return corba_make_keyword( list_utilities.insert_between_each( pred_strings, $str19$_ ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 4036L)
  public static SubLObject corba_make_string(SubLObject args)
  {
    args = transform_list_utilities.transform( args, Symbols.symbol_function( $sym20$KEYWORDP ), Symbols.symbol_function( $sym21$STRING_FROM_KEYWORD ), UNPROVIDED );
    return Strings.string_upcase( Functions.apply( Symbols.symbol_function( $sym22$CCONCATENATE ), args ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 4198L)
  public static SubLObject corba_make_keyword(final SubLObject args)
  {
    return Symbols.make_keyword( corba_make_string( args ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 4292L)
  public static SubLObject corba_make_symbol(final SubLObject args)
  {
    return Packages.intern( corba_make_string( args ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 4569L)
  public static SubLObject note_sksi_corba_module(final SubLObject hl_module, final SubLObject content_mt)
  {
    return dictionary.dictionary_enter( $sksi_corba_modules$.getGlobalValue(), hl_module, content_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 4702L)
  public static SubLObject un_note_sksi_corba_module(final SubLObject hl_module)
  {
    return dictionary.dictionary_remove( $sksi_corba_modules$.getGlobalValue(), hl_module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 4817L)
  public static SubLObject clear_sksi_corba_modules()
  {
    return dictionary.clear_dictionary( $sksi_corba_modules$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 4911L)
  public static SubLObject look_up_sksi_corba_module(final SubLObject hl_module)
  {
    return dictionary.dictionary_lookup( $sksi_corba_modules$.getGlobalValue(), hl_module, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 5026L)
  public static SubLObject sksi_corba_modules_count()
  {
    return dictionary.dictionary_length( $sksi_corba_modules$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 5123L)
  public static SubLObject some_sksi_corba_removal_module_registeredP()
  {
    return makeBoolean( NIL == dictionary.dictionary_empty_p( $sksi_corba_modules$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 5246L)
  public static SubLObject register_sksi_corba_modules_for_sks(final SubLObject sks, SubLObject mapping_mt, SubLObject reclassifyP)
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
        count = Numbers.add( count, register_sksi_corba_modules_for_just_sks( ks, NIL ) );
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

  @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 5792L)
  public static SubLObject register_sksi_corba_modules_for_just_sks(final SubLObject sks, SubLObject reclassifyP)
  {
    if( reclassifyP == UNPROVIDED )
    {
      reclassifyP = T;
    }
    SubLObject count = ZERO_INTEGER;
    if( sksi_sks_accessors.sks_get_type( sks ).eql( $const24$CommonObjectRequestBrokerArchitec ) )
    {
      SubLObject cdolist_list_var = corba_utilities.get_corba_removal_predicates();
      SubLObject pred = NIL;
      pred = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject name = make_corba_module_name_keyword( sks, pred, UNPROVIDED );
        final SubLObject expand_fn = corba_removal_module_utilities.corba_pred_get_removal_module_expand_fn_symbol( pred );
        final SubLObject req_pattern = corba_removal_module_utilities.determine_corba_removal_module_required_pattern( pred );
        final SubLObject content_mt = sksi_sks_accessors.sks_get_content_mt( sks );
        inference_modules.inference_removal_module( name, ConsesLow.list( new SubLObject[] { $kw25$SENSE, $kw26$POS, $kw27$PREDICATE, pred, $kw28$REQUIRED_PATTERN, req_pattern, $kw29$COST_EXPRESSION, FIVE_INTEGER,
          $kw30$EXPAND, expand_fn, $kw31$REQUIRED_MT, content_mt
        } ) );
        note_sksi_corba_module( name, content_mt );
        inference_modules.register_solely_specific_removal_module_predicate( pred );
        cdolist_list_var = cdolist_list_var.rest();
        pred = cdolist_list_var.first();
      }
      count = Numbers.add( count, Sequences.length( corba_utilities.get_corba_removal_predicates() ) );
      final SubLObject content_mt2 = sksi_sks_accessors.sks_get_content_mt( sks );
      hl_storage_modules.hl_storage_module( $kw32$CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_METHOD_ARGS_STORAGE, ConsesLow.list( new SubLObject[] { $kw33$PRETTY_NAME, $str34$__corbaSetObjectMethodArgs, $kw35$ARGUMENT_TYPE,
        $kw36$ARGUMENT, $kw27$PREDICATE, $const37$corbaSetObjectMethodArgs, $kw38$APPLICABILITY, $sym39$CORBA_SET_OBJECT_METHOD_ARGS_HL_STORAGE_MODULE_APPLICABLE_, $kw40$INCOMPLETENESS,
        $sym41$CORBA_SET_HL_STORAGE_MODULE_INCOMPLETENESS, $kw42$ADD, $sym43$CORBA_SET_HL_STORAGE_MODULE_ASSERT, $kw31$REQUIRED_MT, content_mt2
      } ) );
      hl_storage_modules.register_solely_specific_hl_storage_module_predicate( $const37$corbaSetObjectMethodArgs );
      inference_modules.register_solely_specific_removal_module_predicate( $const37$corbaSetObjectMethodArgs );
      note_sksi_corba_module( $kw32$CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_METHOD_ARGS_STORAGE, content_mt2 );
      hl_storage_modules.hl_storage_module( $kw44$CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_FIELD_ARG_STORAGE, ConsesLow.list( new SubLObject[] { $kw33$PRETTY_NAME, $str45$__corbaSetObjectFieldArg, $kw35$ARGUMENT_TYPE,
        $kw36$ARGUMENT, $kw27$PREDICATE, $const46$corbaSetObjectFieldArg, $kw38$APPLICABILITY, $sym47$CORBA_SET_OBJECT_FIELD_ARG_HL_STORAGE_MODULE_APPLICABLE_, $kw40$INCOMPLETENESS,
        $sym41$CORBA_SET_HL_STORAGE_MODULE_INCOMPLETENESS, $kw42$ADD, $sym43$CORBA_SET_HL_STORAGE_MODULE_ASSERT, $kw31$REQUIRED_MT, content_mt2
      } ) );
      hl_storage_modules.register_solely_specific_hl_storage_module_predicate( $const46$corbaSetObjectFieldArg );
      inference_modules.register_solely_specific_removal_module_predicate( $const37$corbaSetObjectMethodArgs );
      note_sksi_corba_module( $kw44$CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_FIELD_ARG_STORAGE, content_mt2 );
      hl_storage_modules.hl_storage_module( $kw48$CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_METHOD_ARGS_STORAGE, ConsesLow.list( new SubLObject[] { $kw33$PRETTY_NAME, $str49$__corbaSetClassMethodArgs, $kw35$ARGUMENT_TYPE,
        $kw36$ARGUMENT, $kw27$PREDICATE, $const50$corbaSetClassMethodArgs, $kw38$APPLICABILITY, $sym51$CORBA_SET_CLASS_METHOD_ARGS_HL_STORAGE_MODULE_APPLICABLE_, $kw40$INCOMPLETENESS,
        $sym41$CORBA_SET_HL_STORAGE_MODULE_INCOMPLETENESS, $kw42$ADD, $sym43$CORBA_SET_HL_STORAGE_MODULE_ASSERT, $kw31$REQUIRED_MT, content_mt2
      } ) );
      hl_storage_modules.register_solely_specific_hl_storage_module_predicate( $const50$corbaSetClassMethodArgs );
      inference_modules.register_solely_specific_removal_module_predicate( $const37$corbaSetObjectMethodArgs );
      note_sksi_corba_module( $kw48$CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_METHOD_ARGS_STORAGE, content_mt2 );
      hl_storage_modules.hl_storage_module( $kw52$CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_FIELD_ARG_STORAGE, ConsesLow.list( new SubLObject[] { $kw33$PRETTY_NAME, $str53$__corbaSetClassFieldArg, $kw35$ARGUMENT_TYPE,
        $kw36$ARGUMENT, $kw27$PREDICATE, $const54$corbaSetClassFieldArg, $kw38$APPLICABILITY, $sym55$CORBA_SET_CLASS_FIELD_ARG_HL_STORAGE_MODULE_APPLICABLE_, $kw40$INCOMPLETENESS,
        $sym41$CORBA_SET_HL_STORAGE_MODULE_INCOMPLETENESS, $kw42$ADD, $sym43$CORBA_SET_HL_STORAGE_MODULE_ASSERT, $kw31$REQUIRED_MT, content_mt2
      } ) );
      hl_storage_modules.register_solely_specific_hl_storage_module_predicate( $const54$corbaSetClassFieldArg );
      inference_modules.register_solely_specific_removal_module_predicate( $const37$corbaSetObjectMethodArgs );
      note_sksi_corba_module( $kw52$CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_FIELD_ARG_STORAGE, content_mt2 );
      count = Numbers.add( count, Sequences.length( corba_utilities.get_corba_storage_predicates() ) );
      if( NIL != reclassifyP )
      {
        inference_modules.reclassify_removal_modules();
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 6274L)
  public static SubLObject corba_sks_declare_module_suites(final SubLObject sks)
  {
    SubLObject cdolist_list_var = corba_utilities.get_corba_removal_predicates();
    SubLObject pred = NIL;
    pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject name = make_corba_module_name_keyword( sks, pred, UNPROVIDED );
      final SubLObject expand_fn = corba_removal_module_utilities.corba_pred_get_removal_module_expand_fn_symbol( pred );
      final SubLObject req_pattern = corba_removal_module_utilities.determine_corba_removal_module_required_pattern( pred );
      final SubLObject content_mt = sksi_sks_accessors.sks_get_content_mt( sks );
      inference_modules.inference_removal_module( name, ConsesLow.list( new SubLObject[] { $kw25$SENSE, $kw26$POS, $kw27$PREDICATE, pred, $kw28$REQUIRED_PATTERN, req_pattern, $kw29$COST_EXPRESSION, FIVE_INTEGER,
        $kw30$EXPAND, expand_fn, $kw31$REQUIRED_MT, content_mt
      } ) );
      note_sksi_corba_module( name, content_mt );
      inference_modules.register_solely_specific_removal_module_predicate( pred );
      cdolist_list_var = cdolist_list_var.rest();
      pred = cdolist_list_var.first();
    }
    final SubLObject content_mt2 = sksi_sks_accessors.sks_get_content_mt( sks );
    hl_storage_modules.hl_storage_module( $kw32$CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_METHOD_ARGS_STORAGE, ConsesLow.list( new SubLObject[] { $kw33$PRETTY_NAME, $str34$__corbaSetObjectMethodArgs, $kw35$ARGUMENT_TYPE,
      $kw36$ARGUMENT, $kw27$PREDICATE, $const37$corbaSetObjectMethodArgs, $kw38$APPLICABILITY, $sym39$CORBA_SET_OBJECT_METHOD_ARGS_HL_STORAGE_MODULE_APPLICABLE_, $kw40$INCOMPLETENESS,
      $sym41$CORBA_SET_HL_STORAGE_MODULE_INCOMPLETENESS, $kw42$ADD, $sym43$CORBA_SET_HL_STORAGE_MODULE_ASSERT, $kw31$REQUIRED_MT, content_mt2
    } ) );
    hl_storage_modules.register_solely_specific_hl_storage_module_predicate( $const37$corbaSetObjectMethodArgs );
    inference_modules.register_solely_specific_removal_module_predicate( $const37$corbaSetObjectMethodArgs );
    note_sksi_corba_module( $kw32$CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_METHOD_ARGS_STORAGE, content_mt2 );
    hl_storage_modules.hl_storage_module( $kw44$CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_FIELD_ARG_STORAGE, ConsesLow.list( new SubLObject[] { $kw33$PRETTY_NAME, $str45$__corbaSetObjectFieldArg, $kw35$ARGUMENT_TYPE,
      $kw36$ARGUMENT, $kw27$PREDICATE, $const46$corbaSetObjectFieldArg, $kw38$APPLICABILITY, $sym47$CORBA_SET_OBJECT_FIELD_ARG_HL_STORAGE_MODULE_APPLICABLE_, $kw40$INCOMPLETENESS,
      $sym41$CORBA_SET_HL_STORAGE_MODULE_INCOMPLETENESS, $kw42$ADD, $sym43$CORBA_SET_HL_STORAGE_MODULE_ASSERT, $kw31$REQUIRED_MT, content_mt2
    } ) );
    hl_storage_modules.register_solely_specific_hl_storage_module_predicate( $const46$corbaSetObjectFieldArg );
    inference_modules.register_solely_specific_removal_module_predicate( $const37$corbaSetObjectMethodArgs );
    note_sksi_corba_module( $kw44$CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_FIELD_ARG_STORAGE, content_mt2 );
    hl_storage_modules.hl_storage_module( $kw48$CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_METHOD_ARGS_STORAGE, ConsesLow.list( new SubLObject[] { $kw33$PRETTY_NAME, $str49$__corbaSetClassMethodArgs, $kw35$ARGUMENT_TYPE,
      $kw36$ARGUMENT, $kw27$PREDICATE, $const50$corbaSetClassMethodArgs, $kw38$APPLICABILITY, $sym51$CORBA_SET_CLASS_METHOD_ARGS_HL_STORAGE_MODULE_APPLICABLE_, $kw40$INCOMPLETENESS,
      $sym41$CORBA_SET_HL_STORAGE_MODULE_INCOMPLETENESS, $kw42$ADD, $sym43$CORBA_SET_HL_STORAGE_MODULE_ASSERT, $kw31$REQUIRED_MT, content_mt2
    } ) );
    hl_storage_modules.register_solely_specific_hl_storage_module_predicate( $const50$corbaSetClassMethodArgs );
    inference_modules.register_solely_specific_removal_module_predicate( $const37$corbaSetObjectMethodArgs );
    note_sksi_corba_module( $kw48$CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_METHOD_ARGS_STORAGE, content_mt2 );
    hl_storage_modules.hl_storage_module( $kw52$CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_FIELD_ARG_STORAGE, ConsesLow.list( new SubLObject[] { $kw33$PRETTY_NAME, $str53$__corbaSetClassFieldArg, $kw35$ARGUMENT_TYPE,
      $kw36$ARGUMENT, $kw27$PREDICATE, $const54$corbaSetClassFieldArg, $kw38$APPLICABILITY, $sym55$CORBA_SET_CLASS_FIELD_ARG_HL_STORAGE_MODULE_APPLICABLE_, $kw40$INCOMPLETENESS,
      $sym41$CORBA_SET_HL_STORAGE_MODULE_INCOMPLETENESS, $kw42$ADD, $sym43$CORBA_SET_HL_STORAGE_MODULE_ASSERT, $kw31$REQUIRED_MT, content_mt2
    } ) );
    hl_storage_modules.register_solely_specific_hl_storage_module_predicate( $const54$corbaSetClassFieldArg );
    inference_modules.register_solely_specific_removal_module_predicate( $const37$corbaSetObjectMethodArgs );
    note_sksi_corba_module( $kw52$CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_FIELD_ARG_STORAGE, content_mt2 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 6438L)
  public static SubLObject corba_sks_undeclare_module_suites(final SubLObject sks)
  {
    SubLObject cdolist_list_var = corba_utilities.get_corba_removal_predicates();
    SubLObject pred = NIL;
    pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject name = make_corba_module_name_keyword( sks, pred, UNPROVIDED );
      inference_modules.undeclare_inference_removal_module( name, NIL );
      un_note_sksi_corba_module( name );
      cdolist_list_var = cdolist_list_var.rest();
      pred = cdolist_list_var.first();
    }
    cdolist_list_var = corba_utilities.get_corba_storage_predicates();
    pred = NIL;
    pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject name = make_corba_module_name_keyword( sks, pred, UNPROVIDED );
      hl_storage_modules.undeclare_hl_storage_module( name );
      un_note_sksi_corba_module( name );
      cdolist_list_var = cdolist_list_var.rest();
      pred = cdolist_list_var.first();
    }
    inference_modules.reclassify_removal_modules();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 6639L)
  public static SubLObject register_all_sksi_corba_modules()
  {
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 6720L)
  public static SubLObject deregister_sksi_corba_modules_for_sks(final SubLObject sks, SubLObject mapping_mt, SubLObject reclassifyP)
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
        count = Numbers.add( count, deregister_sksi_corba_modules_for_just_sks( ks, NIL ) );
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

  @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 7189L)
  public static SubLObject deregister_sksi_corba_modules_for_just_sks(final SubLObject sks, SubLObject reclassifyP)
  {
    if( reclassifyP == UNPROVIDED )
    {
      reclassifyP = T;
    }
    SubLObject count = ZERO_INTEGER;
    if( sksi_sks_accessors.sks_get_type( sks ).eql( $const24$CommonObjectRequestBrokerArchitec ) )
    {
      SubLObject cdolist_list_var = corba_utilities.get_corba_removal_predicates();
      SubLObject pred = NIL;
      pred = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject name = make_corba_module_name_keyword( sks, pred, UNPROVIDED );
        inference_modules.undeclare_inference_removal_module( name, NIL );
        un_note_sksi_corba_module( name );
        cdolist_list_var = cdolist_list_var.rest();
        pred = cdolist_list_var.first();
      }
      count = Numbers.add( count, Sequences.length( corba_utilities.get_corba_removal_predicates() ) );
      cdolist_list_var = corba_utilities.get_corba_storage_predicates();
      pred = NIL;
      pred = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject name = make_corba_module_name_keyword( sks, pred, UNPROVIDED );
        hl_storage_modules.undeclare_hl_storage_module( name );
        un_note_sksi_corba_module( name );
        cdolist_list_var = cdolist_list_var.rest();
        pred = cdolist_list_var.first();
      }
      count = Numbers.add( count, Sequences.length( corba_utilities.get_corba_storage_predicates() ) );
      if( NIL != reclassifyP )
      {
        inference_modules.reclassify_removal_modules();
      }
    }
    corba_utilities.clear_corba_caches();
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 7702L)
  public static SubLObject deregister_all_sksi_corba_modules()
  {
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 7785L)
  public static SubLObject corba_predicate_returns_valueP(final SubLObject corba_predicate)
  {
    assert NIL != corba_utilities.corba_predicate_p( corba_predicate ) : corba_predicate;
    if( NIL != genls.any_genlP( $const56$SubLListOrAtom, kb_accessors.arg1_isa( corba_predicate, $const57$CORBAMappingVocabularyMt ), UNPROVIDED, UNPROVIDED ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 8108L)
  public static SubLObject corba_predicate_returns_objectP(final SubLObject corba_predicate)
  {
    assert NIL != corba_utilities.corba_predicate_p( corba_predicate ) : corba_predicate;
    if( NIL != genls.any_genlP( $const58$CycLClosedDenotationalTerm, kb_accessors.arg1_isa( corba_predicate, $const57$CORBAMappingVocabularyMt ), UNPROVIDED, UNPROVIDED ) )
    {
      return T;
    }
    return NIL;
  }

  public static SubLObject declare_corba_module_utilities_file()
  {
    SubLFiles.declareFunction( me, "add_corba_connection_by_sks", "ADD-CORBA-CONNECTION-BY-SKS", 2, 0, false );
    SubLFiles.declareFunction( me, "rem_corba_connection_by_sks", "REM-CORBA-CONNECTION-BY-SKS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_corba_connection_by_sks", "GET-CORBA-CONNECTION-BY-SKS", 1, 0, false );
    SubLFiles.declareFunction( me, "new_corba_connection_by_sks", "NEW-CORBA-CONNECTION-BY-SKS", 1, 0, false );
    SubLFiles.declareFunction( me, "find_or_create_corba_connection_by_sks", "FIND-OR-CREATE-CORBA-CONNECTION-BY-SKS", 1, 0, false );
    SubLFiles.declareFunction( me, "make_corba_module_name_keyword", "MAKE-CORBA-MODULE-NAME-KEYWORD", 2, 1, false );
    SubLFiles.declareFunction( me, "make_corba_gateway_keyword", "MAKE-CORBA-GATEWAY-KEYWORD", 1, 0, false );
    SubLFiles.declareFunction( me, "corba_make_string", "CORBA-MAKE-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "corba_make_keyword", "CORBA-MAKE-KEYWORD", 1, 0, false );
    SubLFiles.declareFunction( me, "corba_make_symbol", "CORBA-MAKE-SYMBOL", 1, 0, false );
    SubLFiles.declareFunction( me, "note_sksi_corba_module", "NOTE-SKSI-CORBA-MODULE", 2, 0, false );
    SubLFiles.declareFunction( me, "un_note_sksi_corba_module", "UN-NOTE-SKSI-CORBA-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_sksi_corba_modules", "CLEAR-SKSI-CORBA-MODULES", 0, 0, false );
    SubLFiles.declareFunction( me, "look_up_sksi_corba_module", "LOOK-UP-SKSI-CORBA-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_corba_modules_count", "SKSI-CORBA-MODULES-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "some_sksi_corba_removal_module_registeredP", "SOME-SKSI-CORBA-REMOVAL-MODULE-REGISTERED?", 0, 0, false );
    SubLFiles.declareFunction( me, "register_sksi_corba_modules_for_sks", "REGISTER-SKSI-CORBA-MODULES-FOR-SKS", 1, 2, false );
    SubLFiles.declareFunction( me, "register_sksi_corba_modules_for_just_sks", "REGISTER-SKSI-CORBA-MODULES-FOR-JUST-SKS", 1, 1, false );
    SubLFiles.declareFunction( me, "corba_sks_declare_module_suites", "CORBA-SKS-DECLARE-MODULE-SUITES", 1, 0, false );
    SubLFiles.declareFunction( me, "corba_sks_undeclare_module_suites", "CORBA-SKS-UNDECLARE-MODULE-SUITES", 1, 0, false );
    SubLFiles.declareFunction( me, "register_all_sksi_corba_modules", "REGISTER-ALL-SKSI-CORBA-MODULES", 0, 0, false );
    SubLFiles.declareFunction( me, "deregister_sksi_corba_modules_for_sks", "DEREGISTER-SKSI-CORBA-MODULES-FOR-SKS", 1, 2, false );
    SubLFiles.declareFunction( me, "deregister_sksi_corba_modules_for_just_sks", "DEREGISTER-SKSI-CORBA-MODULES-FOR-JUST-SKS", 1, 1, false );
    SubLFiles.declareFunction( me, "deregister_all_sksi_corba_modules", "DEREGISTER-ALL-SKSI-CORBA-MODULES", 0, 0, false );
    SubLFiles.declareFunction( me, "corba_predicate_returns_valueP", "CORBA-PREDICATE-RETURNS-VALUE?", 1, 0, false );
    SubLFiles.declareFunction( me, "corba_predicate_returns_objectP", "CORBA-PREDICATE-RETURNS-OBJECT?", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_corba_module_utilities_file()
  {
    $corba_connections_by_sks$ = SubLFiles.deflexical( "*CORBA-CONNECTIONS-BY-SKS*", NIL );
    $sksi_corba_modules$ = SubLFiles.deflexical( "*SKSI-CORBA-MODULES*", maybeDefault( $sym23$_SKSI_CORBA_MODULES_, $sksi_corba_modules$, () -> ( dictionary.new_dictionary( Symbols.symbol_function( EQUAL ),
        UNPROVIDED ) ) ) );
    return NIL;
  }

  public static SubLObject setup_corba_module_utilities_file()
  {
    subl_macro_promotions.declare_defglobal( $sym23$_SKSI_CORBA_MODULES_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_corba_module_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_corba_module_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_corba_module_utilities_file();
  }
  static
  {
    me = new corba_module_utilities();
    $corba_connections_by_sks$ = null;
    $sksi_corba_modules$ = null;
    $sym0$CORBA_CONNECTION_P = makeSymbol( "CORBA-CONNECTION-P" );
    $sym1$SKS_P = makeSymbol( "SKS-P" );
    $const2$sksProxyHost = constant_handles.reader_make_constant_shell( makeString( "sksProxyHost" ) );
    $const3$sksProxyPort = constant_handles.reader_make_constant_shell( makeString( "sksProxyPort" ) );
    $const4$corbaSKSInitialORBHost = constant_handles.reader_make_constant_shell( makeString( "corbaSKSInitialORBHost" ) );
    $const5$corbaSKSInitialORBPort = constant_handles.reader_make_constant_shell( makeString( "corbaSKSInitialORBPort" ) );
    $const6$corbaSKSServiceName = constant_handles.reader_make_constant_shell( makeString( "corbaSKSServiceName" ) );
    $const7$corbaSKSInitialObjectClass = constant_handles.reader_make_constant_shell( makeString( "corbaSKSInitialObjectClass" ) );
    $str8$Helper = makeString( "Helper" );
    $kw9$PROXY_HOST = makeKeyword( "PROXY-HOST" );
    $kw10$PROXY_PORT = makeKeyword( "PROXY-PORT" );
    $kw11$INITIAL_ORB_HOST = makeKeyword( "INITIAL-ORB-HOST" );
    $kw12$INITIAL_ORB_PORT = makeKeyword( "INITIAL-ORB-PORT" );
    $kw13$SERVICE_NAME = makeKeyword( "SERVICE-NAME" );
    $kw14$INITIAL_OBJECT_CLASS = makeKeyword( "INITIAL-OBJECT-CLASS" );
    $kw15$INITIAL_OBJECT_CLASS_HELPER = makeKeyword( "INITIAL-OBJECT-CLASS-HELPER" );
    $str16$removal = makeString( "removal" );
    $sym17$CORBA_PREDICATE_P = makeSymbol( "CORBA-PREDICATE-P" );
    $str18$corba = makeString( "corba" );
    $str19$_ = makeString( "-" );
    $sym20$KEYWORDP = makeSymbol( "KEYWORDP" );
    $sym21$STRING_FROM_KEYWORD = makeSymbol( "STRING-FROM-KEYWORD" );
    $sym22$CCONCATENATE = makeSymbol( "CCONCATENATE" );
    $sym23$_SKSI_CORBA_MODULES_ = makeSymbol( "*SKSI-CORBA-MODULES*" );
    $const24$CommonObjectRequestBrokerArchitec = constant_handles.reader_make_constant_shell( makeString( "CommonObjectRequestBrokerArchitecture" ) );
    $kw25$SENSE = makeKeyword( "SENSE" );
    $kw26$POS = makeKeyword( "POS" );
    $kw27$PREDICATE = makeKeyword( "PREDICATE" );
    $kw28$REQUIRED_PATTERN = makeKeyword( "REQUIRED-PATTERN" );
    $kw29$COST_EXPRESSION = makeKeyword( "COST-EXPRESSION" );
    $kw30$EXPAND = makeKeyword( "EXPAND" );
    $kw31$REQUIRED_MT = makeKeyword( "REQUIRED-MT" );
    $kw32$CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_METHOD_ARGS_STORAGE = makeKeyword( "CORBA-H-P-A-C-K-S-CORBA-SET-OBJECT-METHOD-ARGS-STORAGE" );
    $kw33$PRETTY_NAME = makeKeyword( "PRETTY-NAME" );
    $str34$__corbaSetObjectMethodArgs = makeString( "#$corbaSetObjectMethodArgs" );
    $kw35$ARGUMENT_TYPE = makeKeyword( "ARGUMENT-TYPE" );
    $kw36$ARGUMENT = makeKeyword( "ARGUMENT" );
    $const37$corbaSetObjectMethodArgs = constant_handles.reader_make_constant_shell( makeString( "corbaSetObjectMethodArgs" ) );
    $kw38$APPLICABILITY = makeKeyword( "APPLICABILITY" );
    $sym39$CORBA_SET_OBJECT_METHOD_ARGS_HL_STORAGE_MODULE_APPLICABLE_ = makeSymbol( "CORBA-SET-OBJECT-METHOD-ARGS-HL-STORAGE-MODULE-APPLICABLE?" );
    $kw40$INCOMPLETENESS = makeKeyword( "INCOMPLETENESS" );
    $sym41$CORBA_SET_HL_STORAGE_MODULE_INCOMPLETENESS = makeSymbol( "CORBA-SET-HL-STORAGE-MODULE-INCOMPLETENESS" );
    $kw42$ADD = makeKeyword( "ADD" );
    $sym43$CORBA_SET_HL_STORAGE_MODULE_ASSERT = makeSymbol( "CORBA-SET-HL-STORAGE-MODULE-ASSERT" );
    $kw44$CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_FIELD_ARG_STORAGE = makeKeyword( "CORBA-H-P-A-C-K-S-CORBA-SET-OBJECT-FIELD-ARG-STORAGE" );
    $str45$__corbaSetObjectFieldArg = makeString( "#$corbaSetObjectFieldArg" );
    $const46$corbaSetObjectFieldArg = constant_handles.reader_make_constant_shell( makeString( "corbaSetObjectFieldArg" ) );
    $sym47$CORBA_SET_OBJECT_FIELD_ARG_HL_STORAGE_MODULE_APPLICABLE_ = makeSymbol( "CORBA-SET-OBJECT-FIELD-ARG-HL-STORAGE-MODULE-APPLICABLE?" );
    $kw48$CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_METHOD_ARGS_STORAGE = makeKeyword( "CORBA-H-P-A-C-K-S-CORBA-SET-CLASS-METHOD-ARGS-STORAGE" );
    $str49$__corbaSetClassMethodArgs = makeString( "#$corbaSetClassMethodArgs" );
    $const50$corbaSetClassMethodArgs = constant_handles.reader_make_constant_shell( makeString( "corbaSetClassMethodArgs" ) );
    $sym51$CORBA_SET_CLASS_METHOD_ARGS_HL_STORAGE_MODULE_APPLICABLE_ = makeSymbol( "CORBA-SET-CLASS-METHOD-ARGS-HL-STORAGE-MODULE-APPLICABLE?" );
    $kw52$CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_FIELD_ARG_STORAGE = makeKeyword( "CORBA-H-P-A-C-K-S-CORBA-SET-CLASS-FIELD-ARG-STORAGE" );
    $str53$__corbaSetClassFieldArg = makeString( "#$corbaSetClassFieldArg" );
    $const54$corbaSetClassFieldArg = constant_handles.reader_make_constant_shell( makeString( "corbaSetClassFieldArg" ) );
    $sym55$CORBA_SET_CLASS_FIELD_ARG_HL_STORAGE_MODULE_APPLICABLE_ = makeSymbol( "CORBA-SET-CLASS-FIELD-ARG-HL-STORAGE-MODULE-APPLICABLE?" );
    $const56$SubLListOrAtom = constant_handles.reader_make_constant_shell( makeString( "SubLListOrAtom" ) );
    $const57$CORBAMappingVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "CORBAMappingVocabularyMt" ) );
    $const58$CycLClosedDenotationalTerm = constant_handles.reader_make_constant_shell( makeString( "CycLClosedDenotationalTerm" ) );
  }
}
/*
 * 
 * Total time: 105 ms
 * 
 */