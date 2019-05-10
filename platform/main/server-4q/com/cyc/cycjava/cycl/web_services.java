package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import java.util.Map;
import java.util.Iterator;
import com.cyc.cycjava.cycl.inference.browser.cb_inference_monitors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.inference.harness.inference_metrics;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class web_services
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.web_services";
  public static final String myFingerPrint = "b021fd6346ecd1cad3bf747b5e3c08bc5a950ff8ac9dbbf17c52a9549d7d9034";
  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 8782L)
  private static SubLSymbol $last_monitored_inference$;
  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 12537L)
  private static SubLSymbol $notify_getting_tick_data_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 17636L)
  private static SubLSymbol $filter_inference_visualizer_termsP$;
  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 18403L)
  private static SubLSymbol $inference_visualizer_term_generality_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 25416L)
  private static SubLSymbol $problem_store_link_id_map_json_string_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 31758L)
  private static SubLSymbol $json_problem_label_max_length$;
  private static final SubLList $list0;
  private static final SubLObject $const1$InferencePSC;
  private static final SubLList $list2;
  private static final SubLString $str3$var;
  private static final SubLString $str4$__xml_version__1_0__encoding__UTF;
  private static final SubLList $list5;
  private static final SubLString $str6$ResultSet;
  private static final SubLSymbol $kw7$UNINITIALIZED;
  private static final SubLString $str8$Term;
  private static final SubLString $str9$cycl;
  private static final SubLSymbol $sym10$_EXIT;
  private static final SubLSymbol $sym11$XML_QUERY_VARIABLE;
  private static final SubLSymbol $kw12$XML_HANDLER;
  private static final SubLString $str13$root;
  private static final SubLSymbol $sym14$XML_GET_GENLS_FROM_STRING;
  private static final SubLSymbol $kw15$HTML_HANDLER;
  private static final SubLString $str16$term;
  private static final SubLSymbol $sym17$GET_NL_INTERP_CYCL;
  private static final SubLSymbol $sym18$XML_GET_GENLS_FROM_STRING_INT;
  private static final SubLSymbol $sym19$XML_GET_GENLS;
  private static final SubLString $str20$mt;
  private static final SubLString $str21$__InferencePSC;
  private static final SubLString $str22$limit;
  private static final SubLString $str23$nil;
  private static final SubLString $str24$nl_generation;
  private static final SubLString $str25$name;
  private static final SubLString $str26$cycml;
  private static final SubLString $str27$genl;
  private static final SubLSymbol $sym28$XML_GET_GENLS_INT;
  private static final SubLString $str29$generation;
  private static final SubLString $str30$_S;
  private static final SubLSymbol $sym31$XML_GET_UPWARDS_CLOSURE_FROM_STRING;
  private static final SubLSymbol $sym32$XML_GET_UPWARDS_CLOSURE;
  private static final SubLSymbol $sym33$XML_GET_ISAS_FROM_STRING;
  private static final SubLSymbol $sym34$XML_GET_ISAS_FROM_STRING_INT;
  private static final SubLSymbol $sym35$XML_GET_ISAS;
  private static final SubLString $str36$isa;
  private static final SubLSymbol $sym37$XML_GET_ISAS_INT;
  private static final SubLSymbol $sym38$XML_GET_GENERATION;
  private static final SubLList $list39;
  private static final SubLSymbol $sym40$PROGN;
  private static final SubLSymbol $sym41$FORMAT;
  private static final SubLSymbol $sym42$_HTML_STREAM_;
  private static final SubLString $str43$mode;
  private static final SubLString $str44$problemStoreId;
  private static final SubLString $str45$inferenceId;
  private static final SubLString $str46$tickNumber;
  private static final SubLString $str47$dataType;
  private static final SubLString $str48$language;
  private static final SubLSymbol $kw49$SKIP;
  private static final SubLList $list50;
  private static final SubLSymbol $kw51$DO_HASH_TABLE;
  private static final SubLString $str52$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str53$_meta_http_equiv__X_UA_Compatible;
  private static final SubLString $str54$ERROR__Could_not_find_inference_f;
  private static final SubLSymbol $kw55$LATEST_PROBLEM_STORE;
  private static final SubLString $str56$Now_monitoring__S___at_tick__A;
  private static final SubLString $str57$Input_tick_number___S;
  private static final SubLString $str58$Getting_data_for_tick_number__S;
  private static final SubLString $str59$nlLabel___;
  private static final SubLString $str60$stepCount_0__;
  private static final SubLString $str61$problemCount_0__;
  private static final SubLString $str62$assertionTouchCount_0__;
  private static final SubLString $str63$termTouchCount_0__;
  private static final SubLString $str64$maxTick__A__;
  private static final SubLSymbol $sym65$CB_INFERENCE_TICK_DATA;
  private static final SubLSymbol $sym66$NOTIFY_GETTING_TICK_DATA;
  private static final SubLString $str67$__Getting_tick_data___;
  private static final SubLSymbol $sym68$_NOTIFY_GETTING_TICK_DATA_CACHING_STATE_;
  private static final SubLSymbol $kw69$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym70$IGNORE_ERRORS_HANDLER;
  private static final SubLSymbol $kw71$TICK_COUNT;
  private static final SubLSymbol $kw72$PROBLEM_COUNT;
  private static final SubLSymbol $kw73$PROBLEM;
  private static final SubLSymbol $kw74$STEP_COUNT;
  private static final SubLSymbol $kw75$ASSERTION_TOUCH_COUNT;
  private static final SubLSymbol $kw76$TERM_TOUCH_COUNT;
  private static final SubLSymbol $kw77$LAST_ASSERTION_TOUCHED;
  private static final SubLSymbol $kw78$LAST_TERM_TOUCHED;
  private static final SubLString $str79$__Tick_count___S__from_tick_numbe;
  private static final SubLString $str80$No_problem_count_for__S_at__A;
  private static final SubLString $str81$tickCount__A__;
  private static final SubLString $str82$inferenceStatus__A__;
  private static final SubLString $str83$stepCount__A__;
  private static final SubLString $str84$problemCount__A__;
  private static final SubLString $str85$assertionTouchCount__A__;
  private static final SubLString $str86$termTouchCount__A__;
  private static final SubLString $str87$inferenceId__A__;
  private static final SubLString $str88$problemStoreId__A__;
  private static final SubLString $str89$nlLabel__A__;
  private static final SubLString $str90$problem;
  private static final SubLString $str91$NIL;
  private static final SubLString $str92$problemQueryFormula___A___;
  private static final SubLString $str93$assertion;
  private static final SubLString $str94$lastAssertionTouched___A___;
  private static final SubLString $str95$lastTermTouched___A___;
  private static final SubLString $str96$newProblemTerms___A___;
  private static final SubLString $str97$newAssertionTerms___A___;
  private static final SubLSymbol $sym98$INFERENCE_PROGRESS_DATA_FOR_TICK_NUMBER_MEMOIZED;
  private static final SubLSymbol $sym99$INFERENCE_VISUALIZER_SHOW_TERM_;
  private static final SubLSymbol $sym100$IST_SENTENCE_P;
  private static final SubLSymbol $sym101$FORMULA_ARG2;
  private static final SubLObject $const102$Thing;
  private static final SubLString $str103$english;
  private static final SubLSymbol $sym104$INFERENCE_VISUALIZER_TERM_GENERALITY;
  private static final SubLInteger $int105$50;
  private static final SubLInteger $int106$950;
  private static final SubLInteger $int107$900;
  private static final SubLInteger $int108$800;
  private static final SubLInteger $int109$600;
  private static final SubLInteger $int110$500;
  private static final SubLInteger $int111$1000;
  private static final SubLSymbol $sym112$_INFERENCE_VISUALIZER_TERM_GENERALITY_CACHING_STATE_;
  private static final SubLInteger $int113$128;
  private static final SubLString $str114$error;
  private static final SubLString $str115$ERROR__Could_not_find_inference_H;
  private static final SubLSymbol $sym116$_;
  private static final SubLString $str117$summary;
  private static final SubLString $str118$totalTime;
  private static final SubLString $str119$_d;
  private static final SubLString $str120$modulesTime;
  private static final SubLSymbol $sym121$INFERENCE_HARNESS_OVERHEAD;
  private static final SubLString $str122$modulesData;
  private static final SubLSymbol $sym123$POSITIVE_NUMBER_P;
  private static final SubLString $str124$module;
  private static final SubLString $str125$percentTime;
  private static final SubLString $str126$__4f_;
  private static final SubLInteger $int127$100;
  private static final SubLSymbol $sym128$NEGATIVE_NUMBER_P;
  private static final SubLString $str129$recursiveTime;
  private static final SubLString $str130$count;
  private static final SubLString $str131$maxTime;
  private static final SubLSymbol $sym132$MAX;
  private static final SubLString $str133$medianTime;
  private static final SubLString $str134$meanTime;
  private static final SubLSymbol $sym135$_;
  private static final SubLSymbol $sym136$SECOND;
  private static final SubLSymbol $sym137$XML_GET_INFERENCE_HL_MODULE_TIMES;
  private static final SubLString $str138$startTickNumber;
  private static final SubLString $str139$endTickNumber;
  private static final SubLSymbol $kw140$LATEST_INFERENCE;
  private static final SubLSymbol $sym141$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLString $str142$_A;
  private static final SubLString $str143$Caught_error_getting_link_info_fo;
  private static final SubLSymbol $sym144$CB_INFERENCE_LINK_INFO;
  private static final SubLSymbol $sym145$PROBLEM_STORE_LINK_ID_MAP_JSON_STRING;
  private static final SubLSymbol $sym146$_PROBLEM_STORE_LINK_ID_MAP_JSON_STRING_CACHING_STATE_;
  private static final SubLInteger $int147$256;
  private static final SubLString $str148$_;
  private static final SubLSymbol $sym149$STRINGP;
  private static final SubLString $str150$_;
  private static final SubLString $str151$__;
  private static final SubLString $str152$links;
  private static final SubLString $str153$_;
  private static final SubLList $list154;
  private static final SubLList $list155;
  private static final SubLSymbol $kw156$ROOT;
  private static final SubLString $str157$_;
  private static final SubLString $str158$problems;
  private static final SubLString $str159$_;
  private static final SubLSymbol $sym160$LINK_ID_MAP_ENTRY__;
  private static final SubLString $str161$Partial_map___S;
  private static final SubLList $list162;
  private static final SubLList $list163;
  private static final SubLString $str164$Unseen_parent__D_in__S_for__S_to_;
  private static final SubLString $str165$Can_t_get_link_ID_map_from_null_i;
  private static final SubLString $str166$Getting_links_from__S_up_to_probl;
  private static final SubLList $list167;
  private static final SubLSymbol $sym168$__;
  private static final SubLSymbol $sym169$_;
  private static final SubLString $str170$pp;
  private static final SubLString $str171$cp;
  private static final SubLString $str172$id;
  private static final SubLString $str173$status;
  private static final SubLString $str174$label;
  private static final SubLString $str175$;
  private static final SubLString $str176$_;

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 844L)
  public static SubLObject xml_query_variable(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
    try
    {
      xml_vars.$xml_stream$.bind( html_macros.$html_stream$.getDynamicValue( thread ), thread );
      final SubLObject query = cb_form_widgets.cb_extract_el_sentence_input( args, $list0 );
      final SubLObject mt = cb_form_widgets.cb_extract_mt_input( args, $const1$InferencePSC, $list2 );
      SubLObject variable = html_utilities.html_extract_sexpr( $str3$var, args, UNPROVIDED );
      final SubLObject free_vars = ( NIL != variable ) ? NIL : obsolete.formula_free_variables( query, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject results = NIL;
      if( NIL == variable )
      {
        variable = free_vars.first();
      }
      results = ask_utilities.query_variable( variable, query, mt, UNPROVIDED );
      xml_utilities.xml_markup( $str4$__xml_version__1_0__encoding__UTF );
      xml_utilities.xml_terpri();
      final SubLObject attrs = $list5;
      try
      {
        final SubLObject _prev_bind_0_$1 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
        final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
        try
        {
          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
          xml_utilities.xml_start_tag_internal( $str6$ResultSet, attrs, NIL, T, $kw7$UNINITIALIZED );
          final SubLObject _prev_bind_0_$2 = xml_vars.$xml_default_namespace$.currentBinding( thread );
          try
          {
            xml_vars.$xml_default_namespace$.bind( $kw7$UNINITIALIZED, thread );
            SubLObject cdolist_list_var = results;
            SubLObject result = NIL;
            result = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              final SubLObject _prev_bind_0_$3 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_1_$4 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( $str8$Term, ConsesLow.list( $str9$cycl, result ), T, NIL, $kw7$UNINITIALIZED );
                final SubLObject _prev_bind_0_$4 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw7$UNINITIALIZED, thread );
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$4, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$4, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$3, thread );
              }
              cdolist_list_var = cdolist_list_var.rest();
              result = cdolist_list_var.first();
            }
          }
          finally
          {
            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$2, thread );
          }
        }
        finally
        {
          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$1, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          xml_utilities.xml_terpri();
          xml_utilities.xml_end_tag_internal( $str6$ResultSet );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$5, thread );
        }
      }
      return NIL;
    }
    finally
    {
      xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 1925L)
  public static SubLObject xml_get_genls_from_string(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
    try
    {
      xml_vars.$xml_stream$.bind( html_macros.$html_stream$.getDynamicValue( thread ), thread );
      try
      {
        final SubLObject _prev_bind_0_$7 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
        final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
        try
        {
          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
          xml_utilities.xml_start_tag_internal( $str13$root, NIL, NIL, NIL, $kw7$UNINITIALIZED );
          final SubLObject _prev_bind_0_$8 = xml_vars.$xml_default_namespace$.currentBinding( thread );
          try
          {
            xml_vars.$xml_default_namespace$.bind( $kw7$UNINITIALIZED, thread );
            xml_get_genls_from_string_int( args );
          }
          finally
          {
            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$8, thread );
          }
        }
        finally
        {
          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$7, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          xml_utilities.xml_terpri();
          xml_utilities.xml_end_tag_internal( $str13$root );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$9, thread );
        }
      }
    }
    finally
    {
      xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 2135L)
  public static SubLObject xml_get_genls_from_string_int(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLObject term_string = web_utilities.html_url_decode( html_utilities.html_extract_input( $str16$term, args ) );
    SubLObject terms = NIL;
    SubLObject cdolist_list_var;
    terms = ( cdolist_list_var = Mapping.mapcar( $sym17$GET_NL_INTERP_CYCL, nl_parsing_api.string_phrasal_meanings( term_string, UNPROVIDED ) ) );
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject new_args = ConsesLow.cons( ConsesLow.list( $str16$term, term_display_string( v_term ) ), Sequences.remove( ConsesLow.list( $str16$term, web_utilities.html_url_encode( term_string, UNPROVIDED ) ),
          args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      xml_get_genls_int( new_args );
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 2628L)
  public static SubLObject xml_get_genls(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
    try
    {
      xml_vars.$xml_stream$.bind( html_macros.$html_stream$.getDynamicValue( thread ), thread );
      try
      {
        final SubLObject _prev_bind_0_$10 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
        final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
        try
        {
          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
          xml_utilities.xml_start_tag_internal( $str13$root, NIL, NIL, NIL, $kw7$UNINITIALIZED );
          final SubLObject _prev_bind_0_$11 = xml_vars.$xml_default_namespace$.currentBinding( thread );
          try
          {
            xml_vars.$xml_default_namespace$.bind( $kw7$UNINITIALIZED, thread );
            xml_get_genls_int( args );
          }
          finally
          {
            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$11, thread );
          }
        }
        finally
        {
          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$10, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          xml_utilities.xml_terpri();
          xml_utilities.xml_end_tag_internal( $str13$root );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$12, thread );
        }
      }
    }
    finally
    {
      xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 2798L)
  public static SubLObject xml_get_genls_int(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject term_string = web_utilities.html_url_decode( html_utilities.html_extract_input( $str16$term, args ) );
    final SubLObject v_term = cb_utilities.cb_guess_fort_from_non_id( term_string );
    final SubLObject mt_string = html_utilities.html_extract_value( $str20$mt, args, $str21$__InferencePSC );
    final SubLObject mt = cb_utilities.cb_guess_fort_from_non_id( mt_string );
    final SubLObject v_genls = cardinality_estimates.sort_by_generality_estimate( genls.all_genls( v_term, mt, UNPROVIDED ), UNPROVIDED );
    final SubLObject limit = reader.read_from_string_ignoring_errors( html_utilities.html_extract_value( $str22$limit, args, $str23$nil ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject generationP = reader.read_from_string_ignoring_errors( html_utilities.html_extract_value( $str24$nl_generation, args, $str23$nil ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject pph_params = pph_params_from_html_args( args );
    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
    try
    {
      xml_vars.$xml_stream$.bind( html_macros.$html_stream$.getDynamicValue( thread ), thread );
      final SubLObject term_attrs = ConsesLow.list( $str25$name, term_display_string( v_term ) );
      final SubLObject current_term_count = ZERO_INTEGER;
      try
      {
        final SubLObject _prev_bind_0_$13 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
        final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
        try
        {
          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
          xml_utilities.xml_start_tag_internal( $str16$term, term_attrs, NIL, NIL, $kw7$UNINITIALIZED );
          final SubLObject _prev_bind_0_$14 = xml_vars.$xml_default_namespace$.currentBinding( thread );
          try
          {
            xml_vars.$xml_default_namespace$.bind( $kw7$UNINITIALIZED, thread );
            try
            {
              final SubLObject _prev_bind_0_$15 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_1_$16 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( $str26$cycml, NIL, NIL, NIL, $kw7$UNINITIALIZED );
                final SubLObject _prev_bind_0_$16 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw7$UNINITIALIZED, thread );
                  cycml.cycml_serialize_term( v_term );
                  xml_possibly_serialize_generation( v_term, pph_params, generationP );
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$16, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$16, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$15, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal( $str26$cycml );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$17, thread );
              }
            }
            SubLObject cdolist_list_var = v_genls;
            SubLObject genl = NIL;
            genl = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              if( NIL == limit || current_term_count.numL( limit ) )
              {
                final SubLObject genl_name = term_display_string( genl );
                final SubLObject attrs = ConsesLow.list( $str25$name, genl_name );
                try
                {
                  final SubLObject _prev_bind_0_$18 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$17 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                  try
                  {
                    xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                    xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                    xml_utilities.xml_start_tag_internal( $str27$genl, attrs, NIL, NIL, $kw7$UNINITIALIZED );
                    final SubLObject _prev_bind_0_$19 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                    try
                    {
                      xml_vars.$xml_default_namespace$.bind( $kw7$UNINITIALIZED, thread );
                      try
                      {
                        final SubLObject _prev_bind_0_$20 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$18 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                        try
                        {
                          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                              thread );
                          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                          xml_utilities.xml_start_tag_internal( $str26$cycml, NIL, NIL, NIL, $kw7$UNINITIALIZED );
                          final SubLObject _prev_bind_0_$21 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                          try
                          {
                            xml_vars.$xml_default_namespace$.bind( $kw7$UNINITIALIZED, thread );
                            cycml.cycml_serialize_term( genl );
                            xml_possibly_serialize_generation( genl, pph_params, generationP );
                          }
                          finally
                          {
                            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$21, thread );
                          }
                        }
                        finally
                        {
                          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$18, thread );
                          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$20, thread );
                        }
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                        try
                        {
                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                          final SubLObject _values2 = Values.getValuesAsVector();
                          xml_utilities.xml_terpri();
                          xml_utilities.xml_end_tag_internal( $str26$cycml );
                          Values.restoreValuesFromVector( _values2 );
                        }
                        finally
                        {
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$22, thread );
                        }
                      }
                    }
                    finally
                    {
                      xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$19, thread );
                    }
                  }
                  finally
                  {
                    xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$17, thread );
                    xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$18, thread );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values3 = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal( $str27$genl );
                    Values.restoreValuesFromVector( _values3 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$23, thread );
                  }
                }
              }
              cdolist_list_var = cdolist_list_var.rest();
              genl = cdolist_list_var.first();
            }
          }
          finally
          {
            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$14, thread );
          }
        }
        finally
        {
          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$13, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$24 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values4 = Values.getValuesAsVector();
          xml_utilities.xml_terpri();
          xml_utilities.xml_end_tag_internal( $str16$term );
          Values.restoreValuesFromVector( _values4 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$24, thread );
        }
      }
    }
    finally
    {
      xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 4075L)
  public static SubLObject xml_possibly_serialize_generation(final SubLObject v_term, final SubLObject pph_params, final SubLObject do_somethingP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != do_somethingP )
    {
      SubLObject cdolist_list_var = nl_generation_api.cycl_term_to_nl_internal( v_term, pph_params );
      SubLObject map = NIL;
      map = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        try
        {
          final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
          final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
          try
          {
            xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
            xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
            xml_utilities.xml_start_tag_internal( $str29$generation, NIL, NIL, NIL, $kw7$UNINITIALIZED );
            final SubLObject _prev_bind_0_$28 = xml_vars.$xml_default_namespace$.currentBinding( thread );
            try
            {
              xml_vars.$xml_default_namespace$.bind( $kw7$UNINITIALIZED, thread );
              PrintLow.format( xml_vars.$xml_stream$.getDynamicValue( thread ), $str30$_S, nl_generation_api.pph_output_map_to_text_internal( map, NIL, ZERO_INTEGER, NIL, NIL ) );
            }
            finally
            {
              xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$28, thread );
            }
          }
          finally
          {
            xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
            xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            xml_utilities.xml_terpri();
            xml_utilities.xml_end_tag_internal( $str29$generation );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        map = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 4375L)
  public static SubLObject xml_get_upwards_closure_from_string(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
    try
    {
      xml_vars.$xml_stream$.bind( html_macros.$html_stream$.getDynamicValue( thread ), thread );
      try
      {
        final SubLObject _prev_bind_0_$29 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
        final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
        try
        {
          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
          xml_utilities.xml_start_tag_internal( $str13$root, NIL, NIL, NIL, $kw7$UNINITIALIZED );
          final SubLObject _prev_bind_0_$30 = xml_vars.$xml_default_namespace$.currentBinding( thread );
          try
          {
            xml_vars.$xml_default_namespace$.bind( $kw7$UNINITIALIZED, thread );
            xml_get_genls_from_string_int( args );
            xml_get_isas_from_string_int( args );
          }
          finally
          {
            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$30, thread );
          }
        }
        finally
        {
          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$29, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$31 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          xml_utilities.xml_terpri();
          xml_utilities.xml_end_tag_internal( $str13$root );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$31, thread );
        }
      }
    }
    finally
    {
      xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 4619L)
  public static SubLObject xml_get_upwards_closure(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
    try
    {
      xml_vars.$xml_stream$.bind( html_macros.$html_stream$.getDynamicValue( thread ), thread );
      try
      {
        final SubLObject _prev_bind_0_$32 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
        final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
        try
        {
          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
          xml_utilities.xml_start_tag_internal( $str13$root, NIL, NIL, NIL, $kw7$UNINITIALIZED );
          final SubLObject _prev_bind_0_$33 = xml_vars.$xml_default_namespace$.currentBinding( thread );
          try
          {
            xml_vars.$xml_default_namespace$.bind( $kw7$UNINITIALIZED, thread );
            xml_get_genls_int( args );
            xml_get_isas_int( args );
          }
          finally
          {
            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$33, thread );
          }
        }
        finally
        {
          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$32, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          xml_utilities.xml_terpri();
          xml_utilities.xml_end_tag_internal( $str13$root );
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
      xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 4828L)
  public static SubLObject xml_get_isas_from_string(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
    try
    {
      xml_vars.$xml_stream$.bind( html_macros.$html_stream$.getDynamicValue( thread ), thread );
      try
      {
        final SubLObject _prev_bind_0_$35 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
        final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
        try
        {
          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
          xml_utilities.xml_start_tag_internal( $str13$root, NIL, NIL, NIL, $kw7$UNINITIALIZED );
          final SubLObject _prev_bind_0_$36 = xml_vars.$xml_default_namespace$.currentBinding( thread );
          try
          {
            xml_vars.$xml_default_namespace$.bind( $kw7$UNINITIALIZED, thread );
            xml_get_isas_from_string_int( args );
          }
          finally
          {
            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$36, thread );
          }
        }
        finally
        {
          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$35, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$37 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          xml_utilities.xml_terpri();
          xml_utilities.xml_end_tag_internal( $str13$root );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$37, thread );
        }
      }
    }
    finally
    {
      xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 5020L)
  public static SubLObject xml_get_isas_from_string_int(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLObject term_string = web_utilities.html_url_decode( html_utilities.html_extract_input( $str16$term, args ) );
    SubLObject terms = NIL;
    SubLObject cdolist_list_var;
    terms = ( cdolist_list_var = Mapping.mapcar( $sym17$GET_NL_INTERP_CYCL, nl_parsing_api.string_phrasal_meanings( term_string, UNPROVIDED ) ) );
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject new_args = ConsesLow.cons( ConsesLow.list( $str16$term, term_display_string( v_term ) ), Sequences.remove( ConsesLow.list( $str16$term, web_utilities.html_url_encode( term_string, UNPROVIDED ) ),
          args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      xml_get_isas_int( new_args );
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 5511L)
  public static SubLObject xml_get_isas(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
    try
    {
      xml_vars.$xml_stream$.bind( html_macros.$html_stream$.getDynamicValue( thread ), thread );
      try
      {
        final SubLObject _prev_bind_0_$38 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
        final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
        try
        {
          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
          xml_utilities.xml_start_tag_internal( $str13$root, NIL, NIL, NIL, $kw7$UNINITIALIZED );
          final SubLObject _prev_bind_0_$39 = xml_vars.$xml_default_namespace$.currentBinding( thread );
          try
          {
            xml_vars.$xml_default_namespace$.bind( $kw7$UNINITIALIZED, thread );
            xml_get_isas_int( args );
          }
          finally
          {
            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$39, thread );
          }
        }
        finally
        {
          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$38, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$40 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          xml_utilities.xml_terpri();
          xml_utilities.xml_end_tag_internal( $str13$root );
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
      xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 5678L)
  public static SubLObject xml_get_isas_int(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject term_string = web_utilities.html_url_decode( html_utilities.html_extract_input( $str16$term, args ) );
    final SubLObject v_term = cb_utilities.cb_guess_fort_from_non_id( term_string );
    final SubLObject mt_string = html_utilities.html_extract_value( $str20$mt, args, $str21$__InferencePSC );
    final SubLObject mt = cb_utilities.cb_guess_fort_from_non_id( mt_string );
    final SubLObject isas = cardinality_estimates.sort_by_generality_estimate( isa.all_isa( czer_main.canonicalize_term( v_term, UNPROVIDED ), mt, UNPROVIDED ), UNPROVIDED );
    final SubLObject limit = reader.read_from_string_ignoring_errors( html_utilities.html_extract_value( $str22$limit, args, $str23$nil ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject generationP = reader.read_from_string_ignoring_errors( html_utilities.html_extract_value( $str24$nl_generation, args, $str23$nil ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject pph_params = pph_params_from_html_args( args );
    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
    try
    {
      xml_vars.$xml_stream$.bind( html_macros.$html_stream$.getDynamicValue( thread ), thread );
      final SubLObject term_attrs = ConsesLow.list( $str25$name, term_display_string( v_term ) );
      SubLObject current_count = ZERO_INTEGER;
      try
      {
        final SubLObject _prev_bind_0_$41 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
        final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
        try
        {
          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
          xml_utilities.xml_start_tag_internal( $str16$term, term_attrs, NIL, NIL, $kw7$UNINITIALIZED );
          final SubLObject _prev_bind_0_$42 = xml_vars.$xml_default_namespace$.currentBinding( thread );
          try
          {
            xml_vars.$xml_default_namespace$.bind( $kw7$UNINITIALIZED, thread );
            try
            {
              final SubLObject _prev_bind_0_$43 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_1_$44 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( $str26$cycml, NIL, NIL, NIL, $kw7$UNINITIALIZED );
                final SubLObject _prev_bind_0_$44 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw7$UNINITIALIZED, thread );
                  cycml.cycml_serialize_term( v_term );
                  xml_possibly_serialize_generation( v_term, pph_params, generationP );
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$44, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$44, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$43, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$45 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal( $str26$cycml );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$45, thread );
              }
            }
            SubLObject cdolist_list_var = isas;
            SubLObject v_isa = NIL;
            v_isa = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              if( NIL == limit || current_count.numL( limit ) )
              {
                final SubLObject isa_name = term_display_string( v_isa );
                final SubLObject attrs = ConsesLow.list( $str25$name, isa_name );
                try
                {
                  final SubLObject _prev_bind_0_$46 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$45 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                  try
                  {
                    xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                    xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                    xml_utilities.xml_start_tag_internal( $str36$isa, attrs, NIL, NIL, $kw7$UNINITIALIZED );
                    final SubLObject _prev_bind_0_$47 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                    try
                    {
                      xml_vars.$xml_default_namespace$.bind( $kw7$UNINITIALIZED, thread );
                      try
                      {
                        final SubLObject _prev_bind_0_$48 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$46 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                        try
                        {
                          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                              thread );
                          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                          xml_utilities.xml_start_tag_internal( $str26$cycml, NIL, NIL, NIL, $kw7$UNINITIALIZED );
                          final SubLObject _prev_bind_0_$49 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                          try
                          {
                            xml_vars.$xml_default_namespace$.bind( $kw7$UNINITIALIZED, thread );
                            cycml.cycml_serialize_term( v_isa );
                            xml_possibly_serialize_generation( v_isa, pph_params, generationP );
                          }
                          finally
                          {
                            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$49, thread );
                          }
                        }
                        finally
                        {
                          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$46, thread );
                          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$48, thread );
                        }
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$50 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                        try
                        {
                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                          final SubLObject _values2 = Values.getValuesAsVector();
                          xml_utilities.xml_terpri();
                          xml_utilities.xml_end_tag_internal( $str26$cycml );
                          Values.restoreValuesFromVector( _values2 );
                        }
                        finally
                        {
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$50, thread );
                        }
                      }
                    }
                    finally
                    {
                      xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$47, thread );
                    }
                  }
                  finally
                  {
                    xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$45, thread );
                    xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$46, thread );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$51 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values3 = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal( $str36$isa );
                    Values.restoreValuesFromVector( _values3 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$51, thread );
                  }
                }
                current_count = Numbers.add( current_count, ONE_INTEGER );
              }
              cdolist_list_var = cdolist_list_var.rest();
              v_isa = cdolist_list_var.first();
            }
          }
          finally
          {
            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$42, thread );
          }
        }
        finally
        {
          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$41, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$52 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values4 = Values.getValuesAsVector();
          xml_utilities.xml_terpri();
          xml_utilities.xml_end_tag_internal( $str16$term );
          Values.restoreValuesFromVector( _values4 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$52, thread );
        }
      }
    }
    finally
    {
      xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 6989L)
  public static SubLObject xml_get_generation(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
    try
    {
      xml_vars.$xml_stream$.bind( html_macros.$html_stream$.getDynamicValue( thread ), thread );
      final SubLObject term_string = web_utilities.html_url_decode( html_utilities.html_extract_input( $str16$term, args ) );
      final SubLObject v_term = cb_utilities.cb_guess_fort_from_non_id( term_string );
      final SubLObject params = pph_params_from_html_args( args );
      final SubLObject generation_maps = nl_generation_api.cycl_term_to_nl_internal( v_term, params );
      final SubLObject term_name = term_display_string( v_term );
      final SubLObject attrs = ConsesLow.list( $str25$name, term_name );
      try
      {
        final SubLObject _prev_bind_0_$56 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
        final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
        try
        {
          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
          xml_utilities.xml_start_tag_internal( $str16$term, attrs, NIL, NIL, $kw7$UNINITIALIZED );
          final SubLObject _prev_bind_0_$57 = xml_vars.$xml_default_namespace$.currentBinding( thread );
          try
          {
            xml_vars.$xml_default_namespace$.bind( $kw7$UNINITIALIZED, thread );
            try
            {
              final SubLObject _prev_bind_0_$58 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_1_$59 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( $str26$cycml, NIL, NIL, NIL, $kw7$UNINITIALIZED );
                final SubLObject _prev_bind_0_$59 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw7$UNINITIALIZED, thread );
                  cycml.cycml_serialize_term( v_term );
                  SubLObject cdolist_list_var = generation_maps;
                  SubLObject map = NIL;
                  map = cdolist_list_var.first();
                  while ( NIL != cdolist_list_var)
                  {
                    try
                    {
                      final SubLObject _prev_bind_0_$60 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$60 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                      try
                      {
                        xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                            thread );
                        xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                        xml_utilities.xml_start_tag_internal( $str29$generation, NIL, NIL, NIL, $kw7$UNINITIALIZED );
                        final SubLObject _prev_bind_0_$61 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                        try
                        {
                          xml_vars.$xml_default_namespace$.bind( $kw7$UNINITIALIZED, thread );
                          PrintLow.format( xml_vars.$xml_stream$.getDynamicValue( thread ), $str30$_S, nl_generation_api.pph_output_map_to_text_internal( map, NIL, ZERO_INTEGER, NIL, NIL ) );
                        }
                        finally
                        {
                          xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$61, thread );
                        }
                      }
                      finally
                      {
                        xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$60, thread );
                        xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$60, thread );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$62 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        final SubLObject _values = Values.getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal( $str29$generation );
                        Values.restoreValuesFromVector( _values );
                      }
                      finally
                      {
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$62, thread );
                      }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    map = cdolist_list_var.first();
                  }
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$59, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$59, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$58, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$63 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal( $str26$cycml );
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$63, thread );
              }
            }
          }
          finally
          {
            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$57, thread );
          }
        }
        finally
        {
          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$56, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$64 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values3 = Values.getValuesAsVector();
          xml_utilities.xml_terpri();
          xml_utilities.xml_end_tag_internal( $str16$term );
          Values.restoreValuesFromVector( _values3 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$64, thread );
        }
      }
    }
    finally
    {
      xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 7729L)
  public static SubLObject pph_params_from_html_args(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject plist = NIL;
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( pph_parameter_declaration.pph_parameter_declarations() ) ); NIL == dictionary_contents
        .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject param_name = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject value = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject text_arg_value = html_utilities.html_extract_input( string_utilities.str( param_name ), args );
      if( NIL != text_arg_value )
      {
        final SubLObject decoded_string_value = web_utilities.html_url_decode( text_arg_value );
        final SubLObject fort_arg_value = cb_utilities.cb_guess_fort_from_non_id( decoded_string_value );
        final SubLObject arg_value = ( NIL != fort_arg_value ) ? fort_arg_value : reader.read_from_string_ignoring_errors( decoded_string_value, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        if( NIL != arg_value )
        {
          plist = ConsesLow.cons( arg_value, plist );
          plist = ConsesLow.cons( param_name, plist );
        }
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    result = nl_generation_api.new_pph_parameters( plist );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 8408L)
  public static SubLObject term_display_string(final SubLObject v_term)
  {
    final SubLObject el_term = ( NIL != forts.fort_p( v_term ) ) ? cycl_utilities.hl_to_el( v_term ) : v_term;
    return string_utilities.string_remove_constant_reader_prefixes( string_utilities.to_lisp_string( cycl_utilities.hl_to_el( el_term ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 8605L)
  public static SubLObject my_html_format(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject control_string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    control_string = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    return ConsesLow.list( $sym40$PROGN, ConsesLow.listS( $sym41$FORMAT, $sym42$_HTML_STREAM_, control_string, ConsesLow.append( args, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 8835L)
  public static SubLObject reset_last_monitored_inference()
  {
    $last_monitored_inference$.setGlobalValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 8941L)
  public static SubLObject cb_inference_tick_data(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mode_string = html_utilities.html_extract_input( $str43$mode, args );
    final SubLObject mode = mode_string.isString() ? reader.read_from_string_ignoring_errors( mode_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) : NIL;
    final SubLObject problem_store_id_string = html_utilities.html_extract_input( $str44$problemStoreId, args );
    final SubLObject problem_store_id = problem_store_id_string.isString() ? reader.read_from_string_ignoring_errors( problem_store_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) : NIL;
    SubLObject problem_store = ( NIL != problem_store_id ) ? inference_datastructures_problem_store.find_problem_store_by_id( problem_store_id ) : NIL;
    final SubLObject inference_id_string = html_utilities.html_extract_input( $str45$inferenceId, args );
    final SubLObject inference_id = inference_id_string.isString() ? reader.read_from_string_ignoring_errors( inference_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) : NIL;
    final SubLObject tick_number_string = html_utilities.html_extract_input( $str46$tickNumber, args );
    SubLObject tick_number;
    final SubLObject input_tick_number = tick_number = tick_number_string.isString() ? reader.read_from_string_ignoring_errors( tick_number_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) : NIL;
    final SubLObject cycl_data_type = html_utilities.html_extract_input( $str47$dataType, args );
    final SubLObject language = html_utilities.html_extract_input( $str48$language, args );
    SubLObject inference = ( problem_store_id.isInteger() && inference_id.isInteger() ) ? inference_datastructures_problem_store.find_inference_by_ids( problem_store_id, inference_id ) : NIL;
    notify_getting_tick_data( UNPROVIDED );
    if( NIL == inference_datastructures_inference.inference_p( inference ) )
    {
      thread.resetMultipleValues();
      final SubLObject inference_$67 = get_inference_from_mode( mode );
      final SubLObject problem_store_$68 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      inference = inference_$67;
      problem_store = problem_store_$68;
    }
    if( NIL == inference_datastructures_inference.inference_p( inference ) && NIL != problem_store )
    {
      SubLObject max_id = MINUS_ONE_INTEGER;
      final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index( problem_store );
      if( NIL == id_index.id_index_objects_empty_p( idx, $kw49$SKIP ) )
      {
        final SubLObject idx_$69 = idx;
        if( NIL == id_index.id_index_dense_objects_empty_p( idx_$69, $kw49$SKIP ) )
        {
          final SubLObject vector_var = id_index.id_index_dense_objects( idx_$69 );
          final SubLObject backwardP_var = NIL;
          final SubLObject length = Sequences.length( vector_var );
          SubLObject current;
          final SubLObject datum = current = ( NIL != backwardP_var ) ? ConsesLow.list( Numbers.subtract( length, ONE_INTEGER ), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER )
              : ConsesLow.list( ZERO_INTEGER, length, ONE_INTEGER );
          SubLObject start = NIL;
          SubLObject end = NIL;
          SubLObject delta = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
          start = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
          end = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
          delta = current.first();
          current = current.rest();
          if( NIL == current )
          {
            if( NIL == inference )
            {
              SubLObject end_var;
              SubLObject id;
              SubLObject one_inference;
              for( end_var = end, id = NIL, id = start; NIL == inference && NIL == subl_macros.do_numbers_endtest( id, delta, end_var ); id = Numbers.add( id, delta ) )
              {
                one_inference = Vectors.aref( vector_var, id );
                if( NIL == id_index.id_index_tombstone_p( one_inference ) || NIL == id_index.id_index_skip_tombstones_p( $kw49$SKIP ) )
                {
                  if( NIL != id_index.id_index_tombstone_p( one_inference ) )
                  {
                    one_inference = $kw49$SKIP;
                  }
                  if( NIL != tick_number && NIL != Hashtables.gethash( tick_number, inference_metrics.inference_tick_indexed_progress_data( one_inference ), UNPROVIDED ) )
                  {
                    inference = one_inference;
                  }
                  else if( inference_datastructures_inference.inference_suid( one_inference ).numG( max_id ) )
                  {
                    max_id = inference_datastructures_inference.inference_suid( one_inference );
                  }
                }
              }
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list50 );
          }
        }
        final SubLObject idx_$70 = idx;
        if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$70 ) && NIL == inference )
        {
          SubLObject catch_var = NIL;
          try
          {
            thread.throwStack.push( $kw51$DO_HASH_TABLE );
            final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$70 );
            SubLObject id2 = NIL;
            SubLObject one_inference2 = NIL;
            final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
            try
            {
              while ( Hashtables.iteratorHasNext( cdohash_iterator ))
              {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
                id2 = Hashtables.getEntryKey( cdohash_entry );
                one_inference2 = Hashtables.getEntryValue( cdohash_entry );
                subl_macros.do_hash_table_done_check( inference );
                if( NIL != tick_number && NIL != Hashtables.gethash( tick_number, inference_metrics.inference_tick_indexed_progress_data( one_inference2 ), UNPROVIDED ) )
                {
                  inference = one_inference2;
                }
                else
                {
                  if( !inference_datastructures_inference.inference_suid( one_inference2 ).numG( max_id ) )
                  {
                    continue;
                  }
                  max_id = inference_datastructures_inference.inference_suid( one_inference2 );
                }
              }
            }
            finally
            {
              Hashtables.releaseEntrySetIterator( cdohash_iterator );
            }
          }
          catch( final Throwable ccatch_env_var )
          {
            catch_var = Errors.handleThrowable( ccatch_env_var, $kw51$DO_HASH_TABLE );
          }
          finally
          {
            thread.throwStack.pop();
          }
        }
      }
      if( NIL != subl_promotions.non_negative_integer_p( max_id ) && NIL == inference )
      {
        inference = inference_datastructures_problem_store.find_inference_by_id( problem_store, max_id );
      }
    }
    html_utilities.html_markup( $str52$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( $str53$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
    try
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw7$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
          : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
      html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
      html_utilities.html_terpri( UNPROVIDED );
      if( NIL == inference_datastructures_inference.inference_p( inference ) && NIL != inference_id )
      {
        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str54$ERROR__Could_not_find_inference_f, problem_store_id_string, inference_id_string );
      }
      if( NIL != problem_store )
      {
        final SubLObject max_tick = ( mode.eql( $kw55$LATEST_PROBLEM_STORE ) || NIL == string_utilities.digit_stringP( inference_id_string ) ) ? problem_store_total_tick_count( problem_store )
            : inference_metrics.inference_tick_count( inference );
        if( !tick_number.isInteger() )
        {
          tick_number = max_tick;
        }
        if( NIL != inference_datastructures_inference.running_inference_p( inference ) )
        {
          tick_number = inference_metrics.inference_tick_count( inference );
        }
        if( !inference.eql( $last_monitored_inference$.getGlobalValue() ) )
        {
          cb_inference_monitors.inference_monitor_info( $str56$Now_monitoring__S___at_tick__A, inference, tick_number, UNPROVIDED, UNPROVIDED );
          $last_monitored_inference$.setGlobalValue( inference );
        }
        if( !input_tick_number.eql( tick_number ) )
        {
          cb_inference_monitors.inference_monitor_info( $str57$Input_tick_number___S, input_tick_number, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          cb_inference_monitors.inference_monitor_info( $str58$Getting_data_for_tick_number__S, tick_number, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        html_output_tick_data( inference, tick_number, max_tick, cycl_data_type, language );
      }
      else
      {
        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str59$nlLabel___ );
        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str60$stepCount_0__ );
        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str61$problemCount_0__ );
        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str62$assertionTouchCount_0__ );
        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str63$termTouchCount_0__ );
        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str64$maxTick__A__, tick_number );
      }
      html_utilities.html_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
    }
    finally
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 12537L)
  public static SubLObject clear_notify_getting_tick_data()
  {
    final SubLObject cs = $notify_getting_tick_data_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 12537L)
  public static SubLObject remove_notify_getting_tick_data(SubLObject id)
  {
    if( id == UNPROVIDED )
    {
      id = numeric_date_utilities.get_universal_second( UNPROVIDED );
    }
    return memoization_state.caching_state_remove_function_results_with_args( $notify_getting_tick_data_caching_state$.getGlobalValue(), ConsesLow.list( id ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 12537L)
  public static SubLObject notify_getting_tick_data_internal(final SubLObject id)
  {
    cb_inference_monitors.inference_monitor_info( $str67$__Getting_tick_data___, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 12537L)
  public static SubLObject notify_getting_tick_data(SubLObject id)
  {
    if( id == UNPROVIDED )
    {
      id = numeric_date_utilities.get_universal_second( UNPROVIDED );
    }
    SubLObject caching_state = $notify_getting_tick_data_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym66$NOTIFY_GETTING_TICK_DATA, $sym68$_NOTIFY_GETTING_TICK_DATA_CACHING_STATE_, EIGHT_INTEGER, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, id, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( notify_getting_tick_data_internal( id ) ) );
      memoization_state.caching_state_put( caching_state, id, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 12731L)
  public static SubLObject html_output_tick_data(final SubLObject inference, final SubLObject tick_number, final SubLObject max_tick, final SubLObject cycl_data_type, final SubLObject language)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw69$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym70$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          final SubLObject data_list = inference_progress_data_for_tick_number( inference, tick_number );
          final SubLObject inference_status = inference_datastructures_inference.inference_status( inference );
          final SubLObject problem_store = inference_datastructures_inference.inference_problem_store( inference );
          final SubLObject current;
          final SubLObject datum = current = data_list;
          final SubLObject tick_count_tail = cdestructuring_bind.property_list_member( $kw71$TICK_COUNT, current );
          final SubLObject tick_count = ( NIL != tick_count_tail ) ? conses_high.cadr( tick_count_tail ) : NIL;
          final SubLObject problem_count_tail = cdestructuring_bind.property_list_member( $kw72$PROBLEM_COUNT, current );
          final SubLObject problem_count = ( NIL != problem_count_tail ) ? conses_high.cadr( problem_count_tail ) : NIL;
          final SubLObject problem_tail = cdestructuring_bind.property_list_member( $kw73$PROBLEM, current );
          final SubLObject problem = ( NIL != problem_tail ) ? conses_high.cadr( problem_tail ) : NIL;
          final SubLObject step_count_tail = cdestructuring_bind.property_list_member( $kw74$STEP_COUNT, current );
          final SubLObject step_count = ( NIL != step_count_tail ) ? conses_high.cadr( step_count_tail ) : NIL;
          final SubLObject assertion_touch_count_tail = cdestructuring_bind.property_list_member( $kw75$ASSERTION_TOUCH_COUNT, current );
          final SubLObject assertion_touch_count = ( NIL != assertion_touch_count_tail ) ? conses_high.cadr( assertion_touch_count_tail ) : NIL;
          final SubLObject term_touch_count_tail = cdestructuring_bind.property_list_member( $kw76$TERM_TOUCH_COUNT, current );
          final SubLObject term_touch_count = ( NIL != term_touch_count_tail ) ? conses_high.cadr( term_touch_count_tail ) : NIL;
          final SubLObject last_assertion_touched_tail = cdestructuring_bind.property_list_member( $kw77$LAST_ASSERTION_TOUCHED, current );
          final SubLObject last_assertion_touched = ( NIL != last_assertion_touched_tail ) ? conses_high.cadr( last_assertion_touched_tail ) : NIL;
          final SubLObject last_term_touched_tail = cdestructuring_bind.property_list_member( $kw78$LAST_TERM_TOUCHED, current );
          final SubLObject last_term_touched = ( NIL != last_term_touched_tail ) ? conses_high.cadr( last_term_touched_tail ) : NIL;
          if( !tick_number.eql( tick_count ) )
          {
            cb_inference_monitors.inference_monitor_info( $str79$__Tick_count___S__from_tick_numbe, tick_count, tick_number, UNPROVIDED, UNPROVIDED );
          }
          if( NIL == problem_count )
          {
            cb_inference_monitors.inference_monitor_warn( $str80$No_problem_count_for__S_at__A, inference, tick_number, UNPROVIDED, UNPROVIDED );
          }
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str81$tickCount__A__, tick_count );
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str64$maxTick__A__, max_tick );
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str82$inferenceStatus__A__, inference_status );
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str83$stepCount__A__, step_count );
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str84$problemCount__A__, problem_count );
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str85$assertionTouchCount__A__, assertion_touch_count );
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str86$termTouchCount__A__, term_touch_count );
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str87$inferenceId__A__, inference_datastructures_inference.inference_suid( inference ) );
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str88$problemStoreId__A__, inference_datastructures_problem_store.problem_store_suid( problem_store ) );
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str89$nlLabel__A__, string_utilities.char_subst( Characters.CHAR_space, Characters.CHAR_newline, cb_inference_monitors
              .inference_monitor_focal_object_html( inference, problem_store ) ) );
          if( cycl_data_type.equalp( $str90$problem ) )
          {
            SubLObject formula = $str91$NIL;
            if( NIL != inference_datastructures_problem.problem_p( problem ) )
            {
              for( formula = inference_datastructures_problem.problem_el_formula( problem ); NIL != el_utilities.ist_sentence_p( formula, UNPROVIDED ); formula = cycl_utilities.formula_arg2( formula, UNPROVIDED ) )
              {
              }
            }
            PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str92$problemQueryFormula___A___, formula );
          }
          else if( cycl_data_type.equalp( $str93$assertion ) )
          {
            PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str94$lastAssertionTouched___A___, ( NIL != assertion_handles.assertion_p( last_assertion_touched ) ) ? uncanonicalizer
                .assertion_el_formula( last_assertion_touched ) : $str91$NIL );
          }
          else if( cycl_data_type.equalp( $str16$term ) )
          {
            final SubLObject v_term = last_term_touched;
            if( NIL != inference_visualizer_show_termP( v_term ) )
            {
              PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str95$lastTermTouched___A___, ( NIL != nart_handles.nart_p( v_term ) ) ? narts_high.nart_el_formula( v_term )
                  : ( ( NIL != constant_handles.constant_p( v_term ) ) ? v_term : $str91$NIL ) );
            }
          }
          SubLObject this_tick_terms = problem_display_terms_from_tick_data( data_list );
          SubLObject last_tick_terms = NIL;
          SubLObject new_terms = conses_high.set_difference( this_tick_terms, last_tick_terms, UNPROVIDED, UNPROVIDED );
          if( NIL != new_terms )
          {
            PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str96$newProblemTerms___A___, encode_terms( new_terms, language ) );
          }
          this_tick_terms = assertion_display_terms_from_tick_data( data_list );
          last_tick_terms = NIL;
          new_terms = conses_high.set_difference( this_tick_terms, last_tick_terms, UNPROVIDED, UNPROVIDED );
          if( NIL != new_terms )
          {
            PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str97$newAssertionTerms___A___, encode_terms( new_terms, language ) );
          }
          html_utilities.html_terpri( UNPROVIDED );
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
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw69$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 15768L)
  public static SubLObject inference_progress_data_for_tick_number(final SubLObject inference, final SubLObject tick_number)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject local_state = inference_datastructures_problem_store.problem_store_memoization_state( inference_datastructures_inference.inference_problem_store( inference ) );
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        return inference_progress_data_for_tick_number_memoized( inference, tick_number );
      }
      finally
      {
        final SubLObject _prev_bind_0_$71 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$71, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 16012L)
  public static SubLObject inference_progress_data_for_tick_number_memoized_internal(final SubLObject inference, final SubLObject tick_number)
  {
    final SubLObject data = inference_metrics.inference_tick_indexed_progress_data( inference );
    SubLObject end_var;
    SubLObject i;
    SubLObject data_list;
    for( end_var = ZERO_INTEGER, i = NIL, i = tick_number; !i.numLE( end_var ); i = Numbers.add( i, MINUS_ONE_INTEGER ) )
    {
      data_list = Hashtables.gethash( i, data, UNPROVIDED );
      if( NIL != data_list )
      {
        return data_list;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 16012L)
  public static SubLObject inference_progress_data_for_tick_number_memoized(final SubLObject inference, final SubLObject tick_number)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return inference_progress_data_for_tick_number_memoized_internal( inference, tick_number );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym98$INFERENCE_PROGRESS_DATA_FOR_TICK_NUMBER_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym98$INFERENCE_PROGRESS_DATA_FOR_TICK_NUMBER_MEMOIZED, TWO_INTEGER, NIL, EQL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym98$INFERENCE_PROGRESS_DATA_FOR_TICK_NUMBER_MEMOIZED, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( inference, tick_number );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( inference.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && tick_number.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( inference_progress_data_for_tick_number_memoized_internal( inference, tick_number ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( inference, tick_number ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 16336L)
  public static SubLObject problem_store_total_tick_count(final SubLObject problem_store)
  {
    SubLObject tick_count = ZERO_INTEGER;
    final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index( problem_store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw49$SKIP ) )
    {
      final SubLObject idx_$72 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$72, $kw49$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$72 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject inference;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          inference = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( inference ) || NIL == id_index.id_index_skip_tombstones_p( $kw49$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( inference ) )
            {
              inference = $kw49$SKIP;
            }
            tick_count = Numbers.add( tick_count, inference_metrics.inference_tick_count( inference ) );
          }
        }
      }
      final SubLObject idx_$73 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$73 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$73 );
        SubLObject id2 = NIL;
        SubLObject inference2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            inference2 = Hashtables.getEntryValue( cdohash_entry );
            tick_count = Numbers.add( tick_count, inference_metrics.inference_tick_count( inference2 ) );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return tick_count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 16565L)
  public static SubLObject problem_display_terms_from_tick_data(final SubLObject data_list)
  {
    SubLObject this_tick_terms = NIL;
    final SubLObject problem = conses_high.getf( data_list, $kw73$PROBLEM, UNPROVIDED );
    if( NIL != problem )
    {
      this_tick_terms = problem_display_terms( problem );
    }
    return this_tick_terms;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 16810L)
  public static SubLObject problem_display_terms(final SubLObject problem)
  {
    SubLObject terms = NIL;
    if( NIL != problem )
    {
      SubLObject cdolist_list_var = cycl_utilities.expression_gather( problem_display_formula( problem ), $sym99$INFERENCE_VISUALIZER_SHOW_TERM_, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject v_term = NIL;
      v_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != inference_visualizer_show_termP( v_term ) )
        {
          final SubLObject item_var = v_term;
          if( NIL == conses_high.member( item_var, terms, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            terms = ConsesLow.cons( item_var, terms );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        v_term = cdolist_list_var.first();
      }
    }
    return terms;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 17111L)
  public static SubLObject problem_display_formula(final SubLObject problem)
  {
    return cycl_utilities.expression_transform( inference_datastructures_problem.problem_el_formula( problem ), $sym100$IST_SENTENCE_P, $sym101$FORMULA_ARG2, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 17253L)
  public static SubLObject assertion_display_terms_from_tick_data(final SubLObject data_list)
  {
    SubLObject this_tick_terms = NIL;
    final SubLObject assertion = conses_high.getf( data_list, $kw77$LAST_ASSERTION_TOUCHED, UNPROVIDED );
    if( NIL != assertion )
    {
      SubLObject cdolist_list_var = cycl_utilities.expression_gather( assertion, $sym99$INFERENCE_VISUALIZER_SHOW_TERM_, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject v_term = NIL;
      v_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != inference_visualizer_show_termP( v_term ) )
        {
          final SubLObject item_var = v_term;
          if( NIL == conses_high.member( item_var, this_tick_terms, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            this_tick_terms = ConsesLow.cons( item_var, this_tick_terms );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        v_term = cdolist_list_var.first();
      }
    }
    return this_tick_terms;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 17701L)
  public static SubLObject inference_visualizer_show_termP(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( v_term.isNumber() || ( NIL != constant_handles.constant_p( v_term ) && ( NIL == $filter_inference_visualizer_termsP$.getDynamicValue( thread ) || NIL != thcl.thcl_fortP( v_term,
        UNPROVIDED ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 17890L)
  public static SubLObject encode_terms(final SubLObject terms, final SubLObject language)
  {
    final SubLObject max = Numbers.log( cardinality_estimates.generality_estimate( $const102$Thing ), UNPROVIDED );
    SubLObject annotated = NIL;
    SubLObject cdolist_list_var = terms;
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject paraphrase = ( language.equalp( $str103$english ) && NIL != forts.fort_p( v_term ) ) ? nl_generation_fort_cache.nl_generation_cache_lookup( v_term, UNPROVIDED, UNPROVIDED ) : NIL;
      if( NIL != paraphrase )
      {
        paraphrase = web_utilities.html_url_encode( cycl_string.cycl_string_to_utf8_string( paraphrase ), UNPROVIDED );
      }
      annotated = ConsesLow.cons( ( NIL != paraphrase ) ? paraphrase : v_term, annotated );
      annotated = ConsesLow.cons( inference_visualizer_term_generality( v_term, max ), annotated );
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    return Sequences.nreverse( annotated );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 18403L)
  public static SubLObject clear_inference_visualizer_term_generality()
  {
    final SubLObject cs = $inference_visualizer_term_generality_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 18403L)
  public static SubLObject remove_inference_visualizer_term_generality(final SubLObject v_term, SubLObject max)
  {
    if( max == UNPROVIDED )
    {
      max = cardinality_estimates.generality_estimate( $const102$Thing );
    }
    return memoization_state.caching_state_remove_function_results_with_args( $inference_visualizer_term_generality_caching_state$.getGlobalValue(), ConsesLow.list( v_term, max ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 18403L)
  public static SubLObject inference_visualizer_term_generality_internal(final SubLObject v_term, final SubLObject max)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject score;
    final SubLObject generality_estimate_based_score = score = Numbers.add( random.random( $int105$50 ), Numbers.floor( Numbers.divide( Numbers.multiply( $int106$950, Numbers.log( number_utilities.f_1X(
        cardinality_estimates.generality_estimate( v_term ) ), UNPROVIDED ) ), max ), UNPROVIDED ) );
    if( NIL != fort_types_interface.logical_connective_p( v_term ) )
    {
      score = Numbers.add( score, $int107$900 );
    }
    else if( NIL != fort_types_interface.quantifier_p( v_term ) )
    {
      score = Numbers.add( score, $int107$900 );
    }
    else if( NIL != fort_types_interface.functor_p( v_term ) )
    {
      score = Numbers.add( score, $int108$800 );
    }
    else if( NIL != fort_types_interface.predicate_p( v_term ) )
    {
      score = Numbers.add( score, $int109$600 );
    }
    else if( NIL == $filter_inference_visualizer_termsP$.getDynamicValue( thread ) )
    {
      final SubLObject _prev_bind_0 = $filter_inference_visualizer_termsP$.currentBinding( thread );
      try
      {
        $filter_inference_visualizer_termsP$.bind( T, thread );
        if( NIL == inference_visualizer_show_termP( v_term ) )
        {
          score = Numbers.add( score, $int110$500 );
        }
      }
      finally
      {
        $filter_inference_visualizer_termsP$.rebind( _prev_bind_0, thread );
      }
    }
    return Numbers.min( $int111$1000, score );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 18403L)
  public static SubLObject inference_visualizer_term_generality(final SubLObject v_term, SubLObject max)
  {
    if( max == UNPROVIDED )
    {
      max = cardinality_estimates.generality_estimate( $const102$Thing );
    }
    SubLObject caching_state = $inference_visualizer_term_generality_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym104$INFERENCE_VISUALIZER_TERM_GENERALITY, $sym112$_INFERENCE_VISUALIZER_TERM_GENERALITY_CACHING_STATE_, $int113$128, EQUAL, TWO_INTEGER,
          ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( v_term, max );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( v_term.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && max.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( inference_visualizer_term_generality_internal( v_term, max ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( v_term, max ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 19377L)
  public static SubLObject xml_get_inference_hl_module_times(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject problem_store_id_string = html_utilities.html_extract_input( $str44$problemStoreId, args );
    final SubLObject problem_store_id = problem_store_id_string.isString() ? reader.read_from_string_ignoring_errors( problem_store_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) : NIL;
    final SubLObject inference_id_string = html_utilities.html_extract_input( $str45$inferenceId, args );
    final SubLObject inference_id = inference_id_string.isString() ? reader.read_from_string_ignoring_errors( inference_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) : NIL;
    final SubLObject inference = ( problem_store_id.isInteger() && inference_id.isInteger() ) ? inference_datastructures_problem_store.find_inference_by_ids( problem_store_id, inference_id ) : NIL;
    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
    try
    {
      xml_vars.$xml_stream$.bind( html_macros.$html_stream$.getDynamicValue( thread ), thread );
      xml_utilities.xml_markup( $str4$__xml_version__1_0__encoding__UTF );
      xml_utilities.xml_terpri();
      if( NIL == inference_datastructures_inference.inference_p( inference ) )
      {
        try
        {
          final SubLObject _prev_bind_0_$74 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
          final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
          try
          {
            xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
            xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
            xml_utilities.xml_start_tag_internal( $str114$error, NIL, NIL, NIL, $kw7$UNINITIALIZED );
            final SubLObject _prev_bind_0_$75 = xml_vars.$xml_default_namespace$.currentBinding( thread );
            try
            {
              xml_vars.$xml_default_namespace$.bind( $kw7$UNINITIALIZED, thread );
              PrintLow.format( xml_vars.$xml_stream$.getDynamicValue( thread ), $str54$ERROR__Could_not_find_inference_f, problem_store_id_string, inference_id_string );
            }
            finally
            {
              xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$75, thread );
            }
          }
          finally
          {
            xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
            xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$74, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$76 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            xml_utilities.xml_terpri();
            xml_utilities.xml_end_tag_internal( $str114$error );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$76, thread );
          }
        }
        return NIL;
      }
      final SubLObject hl_module_times = hash_table_utilities.copy_hashtable( inference_metrics.inference_hl_module_times( inference ), UNPROVIDED );
      if( !hl_module_times.isHashtable() )
      {
        try
        {
          final SubLObject _prev_bind_0_$77 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
          final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
          try
          {
            xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
            xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
            xml_utilities.xml_start_tag_internal( $str114$error, NIL, NIL, NIL, $kw7$UNINITIALIZED );
            final SubLObject _prev_bind_0_$78 = xml_vars.$xml_default_namespace$.currentBinding( thread );
            try
            {
              xml_vars.$xml_default_namespace$.bind( $kw7$UNINITIALIZED, thread );
              PrintLow.format( xml_vars.$xml_stream$.getDynamicValue( thread ), $str115$ERROR__Could_not_find_inference_H, problem_store_id_string, inference_id_string );
            }
            finally
            {
              xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$78, thread );
            }
          }
          finally
          {
            xml_utilities.$cycml_indent_level$.rebind( _prev_bind_3, thread );
            xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$77, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$79 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            xml_utilities.xml_terpri();
            xml_utilities.xml_end_tag_internal( $str114$error );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$79, thread );
          }
        }
        return NIL;
      }
      SubLObject inference_total_time = inference_datastructures_inference.inference_cumulative_time_so_far( inference, NIL );
      SubLObject hl_modules_total_time_list = NIL;
      SubLObject hl_module = NIL;
      SubLObject times_list = NIL;
      final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( hl_module_times );
      try
      {
        while ( Hashtables.iteratorHasNext( cdohash_iterator ))
        {
          final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
          hl_module = Hashtables.getEntryKey( cdohash_entry );
          times_list = Hashtables.getEntryValue( cdohash_entry );
          hl_modules_total_time_list = ConsesLow.cons( ConsesLow.list( hl_module, Functions.apply( $sym116$_, times_list ) ), hl_modules_total_time_list );
        }
      }
      finally
      {
        Hashtables.releaseEntrySetIterator( cdohash_iterator );
      }
      SubLObject total_hl_module_time = ZERO_INTEGER;
      SubLObject cdolist_list_var = hl_modules_total_time_list;
      SubLObject hl_modules_total_time = NIL;
      hl_modules_total_time = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        total_hl_module_time = Numbers.add( total_hl_module_time, conses_high.second( hl_modules_total_time ) );
        cdolist_list_var = cdolist_list_var.rest();
        hl_modules_total_time = cdolist_list_var.first();
      }
      try
      {
        final SubLObject _prev_bind_0_$80 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
        final SubLObject _prev_bind_4 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
        try
        {
          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
          xml_utilities.xml_start_tag_internal( $str117$summary, NIL, NIL, NIL, $kw7$UNINITIALIZED );
          final SubLObject _prev_bind_0_$81 = xml_vars.$xml_default_namespace$.currentBinding( thread );
          try
          {
            xml_vars.$xml_default_namespace$.bind( $kw7$UNINITIALIZED, thread );
            try
            {
              final SubLObject _prev_bind_0_$82 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_1_$83 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( $str118$totalTime, NIL, NIL, NIL, $kw7$UNINITIALIZED );
                final SubLObject _prev_bind_0_$83 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw7$UNINITIALIZED, thread );
                  PrintLow.format( xml_vars.$xml_stream$.getDynamicValue( thread ), $str119$_d, Numbers.truncate( Numbers.multiply( $int111$1000, inference_total_time ), UNPROVIDED ) );
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$83, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$83, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$82, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$84 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values3 = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal( $str118$totalTime );
                Values.restoreValuesFromVector( _values3 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$84, thread );
              }
            }
            try
            {
              final SubLObject _prev_bind_0_$85 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_1_$84 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( $str120$modulesTime, NIL, NIL, NIL, $kw7$UNINITIALIZED );
                final SubLObject _prev_bind_0_$86 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw7$UNINITIALIZED, thread );
                  PrintLow.format( xml_vars.$xml_stream$.getDynamicValue( thread ), $str119$_d, Numbers.truncate( Numbers.multiply( $int111$1000, total_hl_module_time ), UNPROVIDED ) );
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$86, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$84, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$85, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$87 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values4 = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal( $str120$modulesTime );
                Values.restoreValuesFromVector( _values4 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$87, thread );
              }
            }
            final SubLObject overhead_time = Numbers.subtract( inference_total_time, total_hl_module_time );
            if( overhead_time.numG( ZERO_INTEGER ) )
            {
              hl_modules_total_time_list = ConsesLow.cons( ConsesLow.list( $sym121$INFERENCE_HARNESS_OVERHEAD, Numbers.subtract( inference_total_time, total_hl_module_time ) ), hl_modules_total_time_list );
              Hashtables.sethash( $sym121$INFERENCE_HARNESS_OVERHEAD, hl_module_times, ConsesLow.list( Numbers.subtract( inference_total_time, total_hl_module_time ) ) );
            }
            else
            {
              inference_total_time = total_hl_module_time;
            }
            try
            {
              final SubLObject _prev_bind_0_$88 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_1_$85 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( $str122$modulesData, NIL, NIL, NIL, $kw7$UNINITIALIZED );
                final SubLObject _prev_bind_0_$89 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw7$UNINITIALIZED, thread );
                  SubLObject cdolist_list_var2 = Sort.sort( conses_high.copy_list( hl_modules_total_time_list ), $sym135$_, $sym136$SECOND );
                  SubLObject hl_module_with_total_time = NIL;
                  hl_module_with_total_time = cdolist_list_var2.first();
                  while ( NIL != cdolist_list_var2)
                  {
                    final SubLObject hl_module2 = hl_module_with_total_time.first();
                    final SubLObject total_time = conses_high.second( hl_module_with_total_time );
                    final SubLObject times_list2 = Sequences.nreverse( conses_high.copy_list( Hashtables.gethash( hl_module2, hl_module_times, UNPROVIDED ) ) );
                    SubLObject positive_times_list = list_utilities.find_all_if( $sym123$POSITIVE_NUMBER_P, times_list2, UNPROVIDED );
                    if( NIL == positive_times_list )
                    {
                      positive_times_list = ConsesLow.list( ZERO_INTEGER );
                    }
                    try
                    {
                      final SubLObject _prev_bind_0_$90 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$86 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                      try
                      {
                        xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                            thread );
                        xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                        xml_utilities.xml_start_tag_internal( $str124$module, ConsesLow.list( $str25$name, ( NIL != inference_modules.hl_module_p( hl_module2 ) ) ? inference_modules.hl_module_name( hl_module2 )
                            : hl_module2 ), NIL, NIL, $kw7$UNINITIALIZED );
                        final SubLObject _prev_bind_0_$91 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                        try
                        {
                          xml_vars.$xml_default_namespace$.bind( $kw7$UNINITIALIZED, thread );
                          try
                          {
                            final SubLObject _prev_bind_0_$92 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                            final SubLObject _prev_bind_1_$87 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                            try
                            {
                              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                                  thread );
                              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                              xml_utilities.xml_start_tag_internal( $str118$totalTime, NIL, NIL, NIL, $kw7$UNINITIALIZED );
                              final SubLObject _prev_bind_0_$93 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                              try
                              {
                                xml_vars.$xml_default_namespace$.bind( $kw7$UNINITIALIZED, thread );
                                PrintLow.format( xml_vars.$xml_stream$.getDynamicValue( thread ), $str119$_d, Numbers.truncate( Numbers.multiply( $int111$1000, total_time ), UNPROVIDED ) );
                              }
                              finally
                              {
                                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$93, thread );
                              }
                            }
                            finally
                            {
                              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$87, thread );
                              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$92, thread );
                            }
                          }
                          finally
                          {
                            final SubLObject _prev_bind_0_$94 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                            try
                            {
                              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                              final SubLObject _values5 = Values.getValuesAsVector();
                              xml_utilities.xml_terpri();
                              xml_utilities.xml_end_tag_internal( $str118$totalTime );
                              Values.restoreValuesFromVector( _values5 );
                            }
                            finally
                            {
                              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$94, thread );
                            }
                          }
                          try
                          {
                            final SubLObject _prev_bind_0_$95 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                            final SubLObject _prev_bind_1_$88 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                            try
                            {
                              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                                  thread );
                              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                              xml_utilities.xml_start_tag_internal( $str125$percentTime, NIL, NIL, NIL, $kw7$UNINITIALIZED );
                              final SubLObject _prev_bind_0_$96 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                              try
                              {
                                xml_vars.$xml_default_namespace$.bind( $kw7$UNINITIALIZED, thread );
                                PrintLow.format( xml_vars.$xml_stream$.getDynamicValue( thread ), $str126$__4f_, Numbers.multiply( $int127$100, Numbers.divide( total_time, inference_total_time ) ) );
                              }
                              finally
                              {
                                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$96, thread );
                              }
                            }
                            finally
                            {
                              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$88, thread );
                              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$95, thread );
                            }
                          }
                          finally
                          {
                            final SubLObject _prev_bind_0_$97 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                            try
                            {
                              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                              final SubLObject _values6 = Values.getValuesAsVector();
                              xml_utilities.xml_terpri();
                              xml_utilities.xml_end_tag_internal( $str125$percentTime );
                              Values.restoreValuesFromVector( _values6 );
                            }
                            finally
                            {
                              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$97, thread );
                            }
                          }
                          final SubLObject recursion_time = Numbers.subtract( ZERO_INTEGER, Functions.apply( $sym116$_, list_utilities.find_all_if( $sym128$NEGATIVE_NUMBER_P, times_list2, UNPROVIDED ) ) );
                          if( NIL != number_utilities.positive_number_p( recursion_time ) )
                          {
                            try
                            {
                              final SubLObject _prev_bind_0_$98 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                              final SubLObject _prev_bind_1_$89 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                              try
                              {
                                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue(
                                    thread ) ), thread );
                                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                                xml_utilities.xml_start_tag_internal( $str129$recursiveTime, NIL, NIL, NIL, $kw7$UNINITIALIZED );
                                final SubLObject _prev_bind_0_$99 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                                try
                                {
                                  xml_vars.$xml_default_namespace$.bind( $kw7$UNINITIALIZED, thread );
                                  PrintLow.format( xml_vars.$xml_stream$.getDynamicValue( thread ), $str119$_d, Numbers.truncate( Numbers.multiply( $int111$1000, Numbers.subtract( ZERO_INTEGER, Functions.apply(
                                      $sym116$_, list_utilities.find_all_if( $sym128$NEGATIVE_NUMBER_P, times_list2, UNPROVIDED ) ) ) ), UNPROVIDED ) );
                                }
                                finally
                                {
                                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$99, thread );
                                }
                              }
                              finally
                              {
                                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$89, thread );
                                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$98, thread );
                              }
                            }
                            finally
                            {
                              final SubLObject _prev_bind_0_$100 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                              try
                              {
                                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                final SubLObject _values7 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal( $str129$recursiveTime );
                                Values.restoreValuesFromVector( _values7 );
                              }
                              finally
                              {
                                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$100, thread );
                              }
                            }
                          }
                          try
                          {
                            final SubLObject _prev_bind_0_$101 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                            final SubLObject _prev_bind_1_$90 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                            try
                            {
                              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                                  thread );
                              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                              xml_utilities.xml_start_tag_internal( $str130$count, NIL, NIL, NIL, $kw7$UNINITIALIZED );
                              final SubLObject _prev_bind_0_$102 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                              try
                              {
                                xml_vars.$xml_default_namespace$.bind( $kw7$UNINITIALIZED, thread );
                                PrintLow.format( xml_vars.$xml_stream$.getDynamicValue( thread ), $str119$_d, Sequences.length( positive_times_list ) );
                              }
                              finally
                              {
                                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$102, thread );
                              }
                            }
                            finally
                            {
                              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$90, thread );
                              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$101, thread );
                            }
                          }
                          finally
                          {
                            final SubLObject _prev_bind_0_$103 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                            try
                            {
                              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                              final SubLObject _values8 = Values.getValuesAsVector();
                              xml_utilities.xml_terpri();
                              xml_utilities.xml_end_tag_internal( $str130$count );
                              Values.restoreValuesFromVector( _values8 );
                            }
                            finally
                            {
                              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$103, thread );
                            }
                          }
                          try
                          {
                            final SubLObject _prev_bind_0_$104 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                            final SubLObject _prev_bind_1_$91 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                            try
                            {
                              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                                  thread );
                              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                              xml_utilities.xml_start_tag_internal( $str131$maxTime, NIL, NIL, NIL, $kw7$UNINITIALIZED );
                              final SubLObject _prev_bind_0_$105 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                              try
                              {
                                xml_vars.$xml_default_namespace$.bind( $kw7$UNINITIALIZED, thread );
                                PrintLow.format( xml_vars.$xml_stream$.getDynamicValue( thread ), $str119$_d, Numbers.truncate( Numbers.multiply( $int111$1000, Functions.apply( $sym132$MAX, times_list2 ) ),
                                    UNPROVIDED ) );
                              }
                              finally
                              {
                                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$105, thread );
                              }
                            }
                            finally
                            {
                              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$91, thread );
                              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$104, thread );
                            }
                          }
                          finally
                          {
                            final SubLObject _prev_bind_0_$106 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                            try
                            {
                              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                              final SubLObject _values9 = Values.getValuesAsVector();
                              xml_utilities.xml_terpri();
                              xml_utilities.xml_end_tag_internal( $str131$maxTime );
                              Values.restoreValuesFromVector( _values9 );
                            }
                            finally
                            {
                              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$106, thread );
                            }
                          }
                          try
                          {
                            final SubLObject _prev_bind_0_$107 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                            final SubLObject _prev_bind_1_$92 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                            try
                            {
                              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                                  thread );
                              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                              xml_utilities.xml_start_tag_internal( $str133$medianTime, NIL, NIL, NIL, $kw7$UNINITIALIZED );
                              final SubLObject _prev_bind_0_$108 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                              try
                              {
                                xml_vars.$xml_default_namespace$.bind( $kw7$UNINITIALIZED, thread );
                                PrintLow.format( xml_vars.$xml_stream$.getDynamicValue( thread ), $str119$_d, Numbers.truncate( Numbers.multiply( $int111$1000, number_utilities.median( positive_times_list, UNPROVIDED,
                                    UNPROVIDED ) ), UNPROVIDED ) );
                              }
                              finally
                              {
                                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$108, thread );
                              }
                            }
                            finally
                            {
                              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$92, thread );
                              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$107, thread );
                            }
                          }
                          finally
                          {
                            final SubLObject _prev_bind_0_$109 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                            try
                            {
                              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                              final SubLObject _values10 = Values.getValuesAsVector();
                              xml_utilities.xml_terpri();
                              xml_utilities.xml_end_tag_internal( $str133$medianTime );
                              Values.restoreValuesFromVector( _values10 );
                            }
                            finally
                            {
                              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$109, thread );
                            }
                          }
                          try
                          {
                            final SubLObject _prev_bind_0_$110 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                            final SubLObject _prev_bind_1_$93 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                            try
                            {
                              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                                  thread );
                              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                              xml_utilities.xml_start_tag_internal( $str134$meanTime, NIL, NIL, NIL, $kw7$UNINITIALIZED );
                              final SubLObject _prev_bind_0_$111 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                              try
                              {
                                xml_vars.$xml_default_namespace$.bind( $kw7$UNINITIALIZED, thread );
                                PrintLow.format( xml_vars.$xml_stream$.getDynamicValue( thread ), $str119$_d, Numbers.truncate( Numbers.multiply( $int111$1000, number_utilities.mean( positive_times_list ) ),
                                    UNPROVIDED ) );
                              }
                              finally
                              {
                                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$111, thread );
                              }
                            }
                            finally
                            {
                              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$93, thread );
                              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$110, thread );
                            }
                          }
                          finally
                          {
                            final SubLObject _prev_bind_0_$112 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                            try
                            {
                              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                              final SubLObject _values11 = Values.getValuesAsVector();
                              xml_utilities.xml_terpri();
                              xml_utilities.xml_end_tag_internal( $str134$meanTime );
                              Values.restoreValuesFromVector( _values11 );
                            }
                            finally
                            {
                              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$112, thread );
                            }
                          }
                        }
                        finally
                        {
                          xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$91, thread );
                        }
                      }
                      finally
                      {
                        xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$86, thread );
                        xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$90, thread );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$113 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        final SubLObject _values12 = Values.getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal( $str124$module );
                        Values.restoreValuesFromVector( _values12 );
                      }
                      finally
                      {
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$113, thread );
                      }
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    hl_module_with_total_time = cdolist_list_var2.first();
                  }
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$89, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$85, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$88, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$114 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values13 = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal( $str122$modulesData );
                Values.restoreValuesFromVector( _values13 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$114, thread );
              }
            }
          }
          finally
          {
            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$81, thread );
          }
        }
        finally
        {
          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_4, thread );
          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$80, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$115 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values14 = Values.getValuesAsVector();
          xml_utilities.xml_terpri();
          xml_utilities.xml_end_tag_internal( $str117$summary );
          Values.restoreValuesFromVector( _values14 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$115, thread );
        }
      }
    }
    finally
    {
      xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 23164L)
  public static SubLObject cb_inference_link_info(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mode = reader.read_from_string_ignoring_errors( html_utilities.html_extract_input( $str43$mode, args ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject problem_store_id_string = html_utilities.html_extract_input( $str44$problemStoreId, args );
    final SubLObject problem_store_id = reader.read_from_string_ignoring_errors( problem_store_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject store = problem_store_id.isInteger() ? inference_datastructures_problem_store.find_problem_store_by_id( problem_store_id ) : NIL;
    final SubLObject inference_id_string = html_utilities.html_extract_input( $str45$inferenceId, args );
    final SubLObject inference_id = reader.read_from_string_ignoring_errors( inference_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject inference = ( problem_store_id.isInteger() && inference_id.isInteger() ) ? inference_datastructures_problem_store.find_inference_by_ids( problem_store_id, inference_id ) : NIL;
    final SubLObject start_tick_number_string = html_utilities.html_extract_input( $str138$startTickNumber, args );
    SubLObject start_tick_number = start_tick_number_string.isString() ? reader.read_from_string_ignoring_errors( start_tick_number_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) : NIL;
    final SubLObject end_tick_number_string = html_utilities.html_extract_input( $str139$endTickNumber, args );
    final SubLObject end_tick_number = end_tick_number_string.isString() ? reader.read_from_string_ignoring_errors( end_tick_number_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) : NIL;
    SubLObject err_msg = NIL;
    if( NIL == inference_datastructures_inference.inference_p( inference ) )
    {
      thread.resetMultipleValues();
      final SubLObject inference_$127 = get_inference_from_mode( mode );
      final SubLObject store_$128 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      inference = inference_$127;
      store = store_$128;
      start_tick_number = ZERO_INTEGER;
    }
    html_utilities.html_markup( $str52$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( $str53$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
    try
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw7$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
          : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
      html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
      html_utilities.html_terpri( UNPROVIDED );
      if( mode.eql( $kw140$LATEST_INFERENCE ) )
      {
        try
        {
          thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          final SubLObject _prev_bind_0_$129 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( $sym141$CATCH_ERROR_MESSAGE_HANDLER, thread );
            try
            {
              PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str142$_A, problem_store_complete_link_id_map_json_string( store ) );
            }
            catch( final Throwable catch_var )
            {
              Errors.handleThrowable( catch_var, NIL );
            }
          }
          finally
          {
            Errors.$error_handler$.rebind( _prev_bind_0_$129, thread );
          }
        }
        catch( final Throwable ccatch_env_var )
        {
          err_msg = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        }
        finally
        {
          thread.throwStack.pop();
        }
      }
      else if( NIL != inference_datastructures_inference.valid_inference_p( inference ) )
      {
        try
        {
          thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          final SubLObject _prev_bind_0_$130 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( $sym141$CATCH_ERROR_MESSAGE_HANDLER, thread );
            try
            {
              PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str142$_A, problem_store_link_id_map_json_string( store, inference, start_tick_number, end_tick_number ) );
            }
            catch( final Throwable catch_var )
            {
              Errors.handleThrowable( catch_var, NIL );
            }
          }
          finally
          {
            Errors.$error_handler$.rebind( _prev_bind_0_$130, thread );
          }
        }
        catch( final Throwable ccatch_env_var )
        {
          err_msg = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        }
        finally
        {
          thread.throwStack.pop();
        }
      }
      html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
    }
    finally
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    if( NIL != err_msg && NIL != inference_datastructures_inference.valid_inference_p( inference ) )
    {
      cb_inference_monitors.inference_monitor_warn( $str143$Caught_error_getting_link_info_fo, args, err_msg, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 24987L)
  public static SubLObject get_inference_from_mode(final SubLObject mode)
  {
    SubLObject inference = NIL;
    SubLObject store = NIL;
    if( mode.eql( $kw140$LATEST_INFERENCE ) )
    {
      inference = cb_inference_monitors.latest_monitorable_inference();
      store = ( NIL != inference ) ? inference_datastructures_inference.inference_problem_store( inference ) : NIL;
    }
    else if( mode.eql( $kw55$LATEST_PROBLEM_STORE ) )
    {
      store = cb_inference_monitors.latest_monitorable_problem_store();
      inference = ( NIL != store ) ? inference_datastructures_problem_store.find_inference_by_id( store, ZERO_INTEGER ) : NIL;
    }
    return Values.values( inference, store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 25416L)
  public static SubLObject clear_problem_store_link_id_map_json_string()
  {
    final SubLObject cs = $problem_store_link_id_map_json_string_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 25416L)
  public static SubLObject remove_problem_store_link_id_map_json_string(final SubLObject store, SubLObject inference, SubLObject start_tick, SubLObject end_tick)
  {
    if( inference == UNPROVIDED )
    {
      inference = inference_datastructures_problem_store.find_inference_by_id( store, ZERO_INTEGER );
    }
    if( start_tick == UNPROVIDED )
    {
      start_tick = ZERO_INTEGER;
    }
    if( end_tick == UNPROVIDED )
    {
      end_tick = ( NIL != inference ) ? inference_metrics.inference_tick_count( inference ) : NIL;
    }
    return memoization_state.caching_state_remove_function_results_with_args( $problem_store_link_id_map_json_string_caching_state$.getGlobalValue(), ConsesLow.list( store, inference, start_tick, end_tick ), UNPROVIDED,
        UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 25416L)
  public static SubLObject problem_store_link_id_map_json_string_internal(final SubLObject store, final SubLObject inference, final SubLObject start_tick, final SubLObject end_tick)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_json = NIL;
    final SubLObject _prev_bind_0 = json.$json_stream$.currentBinding( thread );
    try
    {
      json.$json_stream$.bind( NIL, thread );
      try
      {
        json.$json_stream$.setDynamicValue( streams_high.make_private_string_output_stream(), thread );
        json_serialize_problem_store_link_id_map( store, inference, start_tick, end_tick );
        v_json = streams_high.get_output_stream_string( json.$json_stream$.getDynamicValue( thread ) );
      }
      finally
      {
        final SubLObject _prev_bind_0_$131 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          streams_high.close( json.$json_stream$.getDynamicValue( thread ), UNPROVIDED );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$131, thread );
        }
      }
    }
    finally
    {
      json.$json_stream$.rebind( _prev_bind_0, thread );
    }
    return v_json;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 25416L)
  public static SubLObject problem_store_link_id_map_json_string(final SubLObject store, SubLObject inference, SubLObject start_tick, SubLObject end_tick)
  {
    if( inference == UNPROVIDED )
    {
      inference = inference_datastructures_problem_store.find_inference_by_id( store, ZERO_INTEGER );
    }
    if( start_tick == UNPROVIDED )
    {
      start_tick = ZERO_INTEGER;
    }
    if( end_tick == UNPROVIDED )
    {
      end_tick = ( NIL != inference ) ? inference_metrics.inference_tick_count( inference ) : NIL;
    }
    SubLObject caching_state = $problem_store_link_id_map_json_string_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym145$PROBLEM_STORE_LINK_ID_MAP_JSON_STRING, $sym146$_PROBLEM_STORE_LINK_ID_MAP_JSON_STRING_CACHING_STATE_, $int147$256, EQUAL,
          FOUR_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_4( store, inference, start_tick, end_tick );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( store.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( inference.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( start_tick.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( NIL != cached_args && NIL == cached_args.rest() && end_tick.equal( cached_args.first() ) )
              {
                return memoization_state.caching_results( results2 );
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( problem_store_link_id_map_json_string_internal( store, inference, start_tick, end_tick ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( store, inference, start_tick, end_tick ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 25866L)
  public static SubLObject problem_store_complete_link_id_map_json_string(final SubLObject store)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_json = NIL;
    final SubLObject _prev_bind_0 = json.$json_stream$.currentBinding( thread );
    try
    {
      json.$json_stream$.bind( NIL, thread );
      try
      {
        json.$json_stream$.setDynamicValue( streams_high.make_private_string_output_stream(), thread );
        json_serialize_problem_store_complete_link_id_map( store );
        v_json = streams_high.get_output_stream_string( json.$json_stream$.getDynamicValue( thread ) );
      }
      finally
      {
        final SubLObject _prev_bind_0_$132 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          streams_high.close( json.$json_stream$.getDynamicValue( thread ), UNPROVIDED );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$132, thread );
        }
      }
    }
    finally
    {
      json.$json_stream$.rebind( _prev_bind_0, thread );
    }
    return v_json;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 26084L)
  public static SubLObject json_serialize_problem_store_link_id_map(final SubLObject store, SubLObject inference, SubLObject start_tick, SubLObject end_tick)
  {
    if( inference == UNPROVIDED )
    {
      inference = ( NIL != store ) ? inference_datastructures_problem_store.find_inference_by_id( store, ZERO_INTEGER ) : NIL;
    }
    if( start_tick == UNPROVIDED )
    {
      start_tick = ZERO_INTEGER;
    }
    if( end_tick == UNPROVIDED )
    {
      end_tick = ( NIL != inference ) ? inference_metrics.inference_tick_count( inference ) : NIL;
    }
    final SubLObject map = get_partial_problem_store_link_id_map( store, inference, start_tick, end_tick );
    json_serialize_problem_store_link_id_map_int( store, map );
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 26501L)
  public static SubLObject json_serialize_problem_store_complete_link_id_map(final SubLObject store)
  {
    final SubLObject map = sort_partial_link_id_map( inference_utilities.problem_store_link_id_map( store, UNPROVIDED, UNPROVIDED ) );
    json_serialize_problem_store_link_id_map_int( store, map );
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 26730L)
  public static SubLObject json_serialize_problem_store_link_id_map_int(final SubLObject store, final SubLObject map)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject problems = set.new_set( Symbols.symbol_function( EQL ), UNPROVIDED );
    final SubLObject _prev_bind_0 = json.$json_object_startedP$.currentBinding( thread );
    try
    {
      json.$json_object_startedP$.bind( NIL, thread );
      json.json_princ( $str148$_ );
      final SubLObject _prev_bind_0_$133 = json.$json_indent_level$.currentBinding( thread );
      try
      {
        json.$json_indent_level$.bind( number_utilities.f_1X( json.$json_indent_level$.getDynamicValue( thread ) ), thread );
        assert NIL != Types.stringp( $str44$problemStoreId ) : $str44$problemStoreId;
        if( NIL != json.$json_object_startedP$.getDynamicValue( thread ) )
        {
          json.json_princ( $str150$_ );
        }
        json.json_newline();
        json.json_print( $str44$problemStoreId );
        json.json_princ( $str151$__ );
        json.json_serialize_atom( inference_datastructures_problem_store.problem_store_suid( store ), UNPROVIDED );
        json.$json_object_startedP$.setDynamicValue( T, thread );
        assert NIL != Types.stringp( $str152$links ) : $str152$links;
        if( NIL != json.$json_object_startedP$.getDynamicValue( thread ) )
        {
          json.json_princ( $str150$_ );
        }
        json.json_newline();
        json.json_print( $str152$links );
        json.json_princ( $str151$__ );
        final SubLObject _prev_bind_0_$134 = json.$json_sequence_startedP$.currentBinding( thread );
        try
        {
          json.$json_sequence_startedP$.bind( NIL, thread );
          json.json_princ( $str153$_ );
          final SubLObject _prev_bind_0_$135 = json.$json_indent_level$.currentBinding( thread );
          try
          {
            json.$json_indent_level$.bind( number_utilities.f_1X( json.$json_indent_level$.getDynamicValue( thread ) ), thread );
            SubLObject cdolist_list_var = map;
            SubLObject cons = NIL;
            cons = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              SubLObject current;
              final SubLObject datum = current = cons;
              SubLObject key = NIL;
              SubLObject data = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list154 );
              key = current.first();
              current = ( data = current.rest() );
              SubLObject current_$137;
              final SubLObject datum_$136 = current_$137 = data;
              SubLObject parent_id = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current_$137, datum_$136, $list155 );
              parent_id = current_$137.first();
              final SubLObject children_ids;
              current_$137 = ( children_ids = current_$137.rest() );
              if( !$kw156$ROOT.eql( parent_id ) )
              {
                json_serialize_problem_store_link( store, parent_id, children_ids, problems );
              }
              cdolist_list_var = cdolist_list_var.rest();
              cons = cdolist_list_var.first();
            }
            json.json_princ( $str157$_ );
          }
          finally
          {
            json.$json_indent_level$.rebind( _prev_bind_0_$135, thread );
          }
        }
        finally
        {
          json.$json_sequence_startedP$.rebind( _prev_bind_0_$134, thread );
        }
        json.$json_object_startedP$.setDynamicValue( T, thread );
        assert NIL != Types.stringp( $str158$problems ) : $str158$problems;
        if( NIL != json.$json_object_startedP$.getDynamicValue( thread ) )
        {
          json.json_princ( $str150$_ );
        }
        json.json_newline();
        json.json_print( $str158$problems );
        json.json_princ( $str151$__ );
        final SubLObject _prev_bind_0_$136 = json.$json_sequence_startedP$.currentBinding( thread );
        try
        {
          json.$json_sequence_startedP$.bind( NIL, thread );
          json.json_princ( $str153$_ );
          final SubLObject _prev_bind_0_$137 = json.$json_indent_level$.currentBinding( thread );
          try
          {
            json.$json_indent_level$.bind( number_utilities.f_1X( json.$json_indent_level$.getDynamicValue( thread ) ), thread );
            final SubLObject set_contents_var = set.do_set_internal( problems );
            SubLObject basis_object;
            SubLObject state;
            SubLObject problem;
            for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
                .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
            {
              problem = set_contents.do_set_contents_next( basis_object, state );
              if( NIL != set_contents.do_set_contents_element_validP( state, problem ) )
              {
                json_serialize_problem( problem );
              }
            }
            json.json_princ( $str157$_ );
          }
          finally
          {
            json.$json_indent_level$.rebind( _prev_bind_0_$137, thread );
          }
        }
        finally
        {
          json.$json_sequence_startedP$.rebind( _prev_bind_0_$136, thread );
        }
        json.$json_object_startedP$.setDynamicValue( T, thread );
        json.json_princ( $str159$_ );
      }
      finally
      {
        json.$json_indent_level$.rebind( _prev_bind_0_$133, thread );
      }
    }
    finally
    {
      json.$json_object_startedP$.rebind( _prev_bind_0, thread );
    }
    return map;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 27416L)
  public static SubLObject sort_partial_link_id_map(final SubLObject map)
  {
    return Sort.sort( map, $sym160$LINK_ID_MAP_ENTRY__, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 27505L)
  public static SubLObject link_id_map_entry_L(final SubLObject entry1, final SubLObject entry2)
  {
    final SubLObject parent1 = conses_high.second( entry1 );
    final SubLObject parent2 = conses_high.second( entry2 );
    if( parent1.eql( parent2 ) )
    {
      return Numbers.numL( entry1.first(), entry2.first() );
    }
    if( parent1.eql( $kw156$ROOT ) )
    {
      return T;
    }
    if( parent2.eql( $kw156$ROOT ) )
    {
      return NIL;
    }
    return Numbers.numL( parent1, parent2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 27830L)
  public static SubLObject get_partial_problem_store_link_id_map(final SubLObject store, SubLObject inference, SubLObject start_tick, SubLObject end_tick)
  {
    if( inference == UNPROVIDED )
    {
      inference = inference_datastructures_problem_store.find_inference_by_id( store, ZERO_INTEGER );
    }
    if( start_tick == UNPROVIDED )
    {
      start_tick = ZERO_INTEGER;
    }
    if( end_tick == UNPROVIDED )
    {
      end_tick = inference_metrics.inference_tick_count( inference );
    }
    final SubLObject end_map = get_truncated_problem_store_link_id_map( store, end_tick, inference );
    final SubLObject start_map = get_truncated_problem_store_link_id_map( store, start_tick, inference );
    final SubLObject partial_map = conses_high.set_difference( end_map, start_map, Symbols.symbol_function( EQUAL ), UNPROVIDED );
    cb_inference_monitors.inference_monitor_info( $str161$Partial_map___S, partial_map, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return sort_partial_link_id_map( partial_map );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 28356L)
  public static SubLObject validate_partial_problem_store_link_id_maps(final SubLObject store, SubLObject inference)
  {
    if( inference == UNPROVIDED )
    {
      inference = inference_datastructures_problem_store.find_inference_by_id( store, ZERO_INTEGER );
    }
    final SubLObject seen = set_utilities.new_singleton_set( ZERO_INTEGER, UNPROVIDED );
    SubLObject validP = T;
    SubLObject end_var;
    SubLObject start_tick;
    SubLObject end_tick;
    SubLObject cdolist_list_var;
    SubLObject cons;
    SubLObject current;
    SubLObject datum;
    SubLObject key;
    SubLObject item;
    SubLObject current_$141;
    SubLObject datum_$140;
    SubLObject parent_id;
    SubLObject child_ids;
    for( end_var = Numbers.subtract( inference_metrics.inference_tick_count( inference ), TEN_INTEGER ), start_tick = NIL, start_tick = ZERO_INTEGER; !start_tick.numGE( end_var ); start_tick = Numbers.add( start_tick,
        TEN_INTEGER ) )
    {
      end_tick = Numbers.add( start_tick, TEN_INTEGER );
      cdolist_list_var = get_partial_problem_store_link_id_map( store, inference, start_tick, end_tick );
      cons = NIL;
      cons = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        datum = ( current = cons );
        key = NIL;
        item = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list162 );
        key = current.first();
        current = ( item = current.rest() );
        datum_$140 = ( current_$141 = item );
        parent_id = NIL;
        child_ids = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$141, datum_$140, $list163 );
        parent_id = current_$141.first();
        current_$141 = ( child_ids = current_$141.rest() );
        if( NIL == set.set_memberP( parent_id, seen ) )
        {
          Errors.sublisp_break( $str164$Unseen_parent__D_in__S_for__S_to_, new SubLObject[] { parent_id, item, start_tick, end_tick
          } );
          validP = NIL;
        }
        set_utilities.set_add_all( child_ids, seen );
        cdolist_list_var = cdolist_list_var.rest();
        cons = cdolist_list_var.first();
      }
    }
    return validP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 29026L)
  public static SubLObject get_truncated_problem_store_link_id_map(final SubLObject store, SubLObject end_tick, SubLObject inference)
  {
    if( inference == UNPROVIDED )
    {
      inference = ( NIL != store ) ? inference_datastructures_problem_store.find_inference_by_id( store, ZERO_INTEGER ) : NIL;
    }
    if( NIL == inference )
    {
      cb_inference_monitors.inference_monitor_warn( $str165$Can_t_get_link_ID_map_from_null_i, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return NIL;
    }
    if( end_tick.numG( inference_metrics.inference_tick_count( inference ) ) )
    {
      end_tick = inference_metrics.inference_tick_count( inference );
    }
    final SubLObject tick_data = inference_metrics.inference_tick_indexed_progress_data( inference );
    SubLObject end_problem_id = problem_id_from_tick_data( tick_data, end_tick );
    SubLObject abortP = NIL;
    while ( !end_problem_id.isInteger() && NIL == abortP)
    {
      end_tick = Numbers.add( end_tick, ONE_INTEGER );
      if( end_tick.numG( inference_metrics.inference_tick_count( inference ) ) )
      {
        abortP = T;
      }
      else
      {
        end_problem_id = problem_id_from_tick_data( tick_data, end_tick );
      }
    }
    return ( NIL != abortP ) ? NIL : sort_partial_link_id_map( get_truncated_problem_store_link_id_map_int( store, end_problem_id ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 29906L)
  public static SubLObject get_truncated_problem_store_link_id_map_int(final SubLObject store, final SubLObject end_problem_id)
  {
    cb_inference_monitors.inference_monitor_info( $str166$Getting_links_from__S_up_to_probl, store, end_problem_id, UNPROVIDED, UNPROVIDED );
    final SubLObject link_id_map = inference_utilities.problem_store_link_id_map( store, UNPROVIDED, UNPROVIDED );
    SubLObject partial_map = NIL;
    SubLObject cdolist_list_var = link_id_map;
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject link_id = NIL;
      SubLObject link_data = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list167 );
      link_id = current.first();
      current = ( link_data = current.rest() );
      if( $kw156$ROOT != link_data.first() )
      {
        if( NIL != Sequences.find( end_problem_id, link_data, Symbols.symbol_function( $sym168$__ ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
        {
          link_data = Sequences.delete( end_problem_id, link_data, Symbols.symbol_function( $sym169$_ ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        else
        {
          link_data = NIL;
        }
      }
      if( NIL != link_data )
      {
        partial_map = list_utilities.alist_enter( partial_map, link_id, link_data, UNPROVIDED );
      }
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    return sort_partial_link_id_map( partial_map );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 30521L)
  public static SubLObject problem_id_from_tick_data(final SubLObject tick_data, final SubLObject tick)
  {
    final SubLObject data = Hashtables.gethash( tick, tick_data, UNPROVIDED );
    final SubLObject problem = list_utilities.plist_lookup( data, $kw73$PROBLEM, UNPROVIDED );
    return ( NIL != inference_datastructures_problem.problem_p( problem ) ) ? inference_datastructures_problem.problem_suid( problem ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 30727L)
  public static SubLObject json_serialize_problem_store_link(final SubLObject store, final SubLObject parent_id, final SubLObject children_ids, final SubLObject problems)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != json.$json_sequence_startedP$.getDynamicValue( thread ) )
    {
      json.json_princ( $str150$_ );
    }
    json.json_newline();
    final SubLObject _prev_bind_0 = json.$json_object_startedP$.currentBinding( thread );
    try
    {
      json.$json_object_startedP$.bind( NIL, thread );
      json.json_princ( $str148$_ );
      final SubLObject _prev_bind_0_$142 = json.$json_indent_level$.currentBinding( thread );
      try
      {
        json.$json_indent_level$.bind( number_utilities.f_1X( json.$json_indent_level$.getDynamicValue( thread ) ), thread );
        assert NIL != Types.stringp( $str170$pp ) : $str170$pp;
        if( NIL != json.$json_object_startedP$.getDynamicValue( thread ) )
        {
          json.json_princ( $str150$_ );
        }
        json.json_newline();
        json.json_print( $str170$pp );
        json.json_princ( $str151$__ );
        json.json_serialize_atom( parent_id, UNPROVIDED );
        json.$json_object_startedP$.setDynamicValue( T, thread );
        assert NIL != Types.stringp( $str171$cp ) : $str171$cp;
        if( NIL != json.$json_object_startedP$.getDynamicValue( thread ) )
        {
          json.json_princ( $str150$_ );
        }
        json.json_newline();
        json.json_print( $str171$cp );
        json.json_princ( $str151$__ );
        json.json_serialize_atom_sequence( children_ids, UNPROVIDED );
        json.$json_object_startedP$.setDynamicValue( T, thread );
        json.json_princ( $str159$_ );
      }
      finally
      {
        json.$json_indent_level$.rebind( _prev_bind_0_$142, thread );
      }
    }
    finally
    {
      json.$json_object_startedP$.rebind( _prev_bind_0, thread );
    }
    json.$json_sequence_startedP$.setDynamicValue( T, thread );
    SubLObject cdolist_list_var = ConsesLow.cons( parent_id, children_ids );
    SubLObject problem_id = NIL;
    problem_id = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      set.set_add( inference_datastructures_problem_store.find_problem_by_id( store, problem_id ), problems );
      cdolist_list_var = cdolist_list_var.rest();
      problem_id = cdolist_list_var.first();
    }
    return problems;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 31218L)
  public static SubLObject json_serialize_problem(final SubLObject problem)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != json.$json_sequence_startedP$.getDynamicValue( thread ) )
    {
      json.json_princ( $str150$_ );
    }
    json.json_newline();
    final SubLObject _prev_bind_0 = json.$json_object_startedP$.currentBinding( thread );
    try
    {
      json.$json_object_startedP$.bind( NIL, thread );
      json.json_princ( $str148$_ );
      final SubLObject _prev_bind_0_$143 = json.$json_indent_level$.currentBinding( thread );
      try
      {
        json.$json_indent_level$.bind( number_utilities.f_1X( json.$json_indent_level$.getDynamicValue( thread ) ), thread );
        assert NIL != Types.stringp( $str172$id ) : $str172$id;
        if( NIL != json.$json_object_startedP$.getDynamicValue( thread ) )
        {
          json.json_princ( $str150$_ );
        }
        json.json_newline();
        json.json_print( $str172$id );
        json.json_princ( $str151$__ );
        json.json_serialize_atom( inference_datastructures_problem.problem_suid( problem ), UNPROVIDED );
        json.$json_object_startedP$.setDynamicValue( T, thread );
        assert NIL != Types.stringp( $str173$status ) : $str173$status;
        if( NIL != json.$json_object_startedP$.getDynamicValue( thread ) )
        {
          json.json_princ( $str150$_ );
        }
        json.json_newline();
        json.json_print( $str173$status );
        json.json_princ( $str151$__ );
        json.json_serialize_atom( print_high.princ_to_string( inference_datastructures_problem.problem_status( problem ) ), UNPROVIDED );
        json.$json_object_startedP$.setDynamicValue( T, thread );
        assert NIL != Types.stringp( $str174$label ) : $str174$label;
        if( NIL != json.$json_object_startedP$.getDynamicValue( thread ) )
        {
          json.json_princ( $str150$_ );
        }
        json.json_newline();
        json.json_print( $str174$label );
        json.json_princ( $str151$__ );
        json.json_serialize_atom( json_label_for_problem( problem, $str103$english ), UNPROVIDED );
        json.$json_object_startedP$.setDynamicValue( T, thread );
        assert NIL != Types.stringp( $str9$cycl ) : $str9$cycl;
        if( NIL != json.$json_object_startedP$.getDynamicValue( thread ) )
        {
          json.json_princ( $str150$_ );
        }
        json.json_newline();
        json.json_print( $str9$cycl );
        json.json_princ( $str151$__ );
        json.json_serialize_atom( json_label_for_problem( problem, $str9$cycl ), UNPROVIDED );
        json.$json_object_startedP$.setDynamicValue( T, thread );
        json.json_princ( $str159$_ );
      }
      finally
      {
        json.$json_indent_level$.rebind( _prev_bind_0_$143, thread );
      }
    }
    finally
    {
      json.$json_object_startedP$.rebind( _prev_bind_0, thread );
    }
    json.$json_sequence_startedP$.setDynamicValue( T, thread );
    return problem;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-services.lisp", position = 31818L)
  public static SubLObject json_label_for_problem(final SubLObject problem, final SubLObject language)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( language.equalp( $str9$cycl ) )
    {
      return web_utilities.html_url_encode( format_cycl_expression.get_pretty_formatted_string( problem_display_formula( problem ), NIL, T ), UNPROVIDED );
    }
    SubLObject label = $str175$;
    SubLObject old_label = $str175$;
    final SubLObject encoded_terms = encode_terms( problem_display_terms( problem ), language );
    final SubLObject sorted_terms = list_utilities.alist_keys( list_utilities.sort_alist_by_values( list_utilities.plist_to_alist( encoded_terms ), Symbols.symbol_function( $sym169$_ ) ) );
    SubLObject too_longP = NIL;
    final SubLObject max_length = $json_problem_label_max_length$.getDynamicValue( thread );
    if( NIL == too_longP )
    {
      SubLObject csome_list_var = sorted_terms;
      SubLObject v_term = NIL;
      v_term = csome_list_var.first();
      while ( NIL == too_longP && NIL != csome_list_var)
      {
        old_label = label;
        label = ( ( NIL != string_utilities.empty_string_p( label ) ) ? format_nil.format_nil_a( v_term )
            : Sequences.cconcatenate( label, new SubLObject[]
            { web_utilities.html_url_encode( $str176$_, UNPROVIDED ), format_nil.format_nil_a( v_term )
            } ) );
        too_longP = list_utilities.lengthG( label, max_length, UNPROVIDED );
        csome_list_var = csome_list_var.rest();
        v_term = csome_list_var.first();
      }
    }
    return ( NIL != list_utilities.lengthG( label, max_length, UNPROVIDED ) ) ? old_label : label;
  }

  public static SubLObject declare_web_services_file()
  {
    SubLFiles.declareFunction( me, "xml_query_variable", "XML-QUERY-VARIABLE", 0, 1, false );
    SubLFiles.declareFunction( me, "xml_get_genls_from_string", "XML-GET-GENLS-FROM-STRING", 0, 1, false );
    SubLFiles.declareFunction( me, "xml_get_genls_from_string_int", "XML-GET-GENLS-FROM-STRING-INT", 0, 1, false );
    SubLFiles.declareFunction( me, "xml_get_genls", "XML-GET-GENLS", 0, 1, false );
    SubLFiles.declareFunction( me, "xml_get_genls_int", "XML-GET-GENLS-INT", 0, 1, false );
    SubLFiles.declareFunction( me, "xml_possibly_serialize_generation", "XML-POSSIBLY-SERIALIZE-GENERATION", 3, 0, false );
    SubLFiles.declareFunction( me, "xml_get_upwards_closure_from_string", "XML-GET-UPWARDS-CLOSURE-FROM-STRING", 0, 1, false );
    SubLFiles.declareFunction( me, "xml_get_upwards_closure", "XML-GET-UPWARDS-CLOSURE", 0, 1, false );
    SubLFiles.declareFunction( me, "xml_get_isas_from_string", "XML-GET-ISAS-FROM-STRING", 0, 1, false );
    SubLFiles.declareFunction( me, "xml_get_isas_from_string_int", "XML-GET-ISAS-FROM-STRING-INT", 0, 1, false );
    SubLFiles.declareFunction( me, "xml_get_isas", "XML-GET-ISAS", 0, 1, false );
    SubLFiles.declareFunction( me, "xml_get_isas_int", "XML-GET-ISAS-INT", 0, 1, false );
    SubLFiles.declareFunction( me, "xml_get_generation", "XML-GET-GENERATION", 0, 1, false );
    SubLFiles.declareFunction( me, "pph_params_from_html_args", "PPH-PARAMS-FROM-HTML-ARGS", 1, 0, false );
    SubLFiles.declareFunction( me, "term_display_string", "TERM-DISPLAY-STRING", 1, 0, false );
    SubLFiles.declareMacro( me, "my_html_format", "MY-HTML-FORMAT" );
    SubLFiles.declareFunction( me, "reset_last_monitored_inference", "RESET-LAST-MONITORED-INFERENCE", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_inference_tick_data", "CB-INFERENCE-TICK-DATA", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_notify_getting_tick_data", "CLEAR-NOTIFY-GETTING-TICK-DATA", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_notify_getting_tick_data", "REMOVE-NOTIFY-GETTING-TICK-DATA", 0, 1, false );
    SubLFiles.declareFunction( me, "notify_getting_tick_data_internal", "NOTIFY-GETTING-TICK-DATA-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "notify_getting_tick_data", "NOTIFY-GETTING-TICK-DATA", 0, 1, false );
    SubLFiles.declareFunction( me, "html_output_tick_data", "HTML-OUTPUT-TICK-DATA", 5, 0, false );
    SubLFiles.declareFunction( me, "inference_progress_data_for_tick_number", "INFERENCE-PROGRESS-DATA-FOR-TICK-NUMBER", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_progress_data_for_tick_number_memoized_internal", "INFERENCE-PROGRESS-DATA-FOR-TICK-NUMBER-MEMOIZED-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_progress_data_for_tick_number_memoized", "INFERENCE-PROGRESS-DATA-FOR-TICK-NUMBER-MEMOIZED", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_store_total_tick_count", "PROBLEM-STORE-TOTAL-TICK-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_display_terms_from_tick_data", "PROBLEM-DISPLAY-TERMS-FROM-TICK-DATA", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_display_terms", "PROBLEM-DISPLAY-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_display_formula", "PROBLEM-DISPLAY-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "assertion_display_terms_from_tick_data", "ASSERTION-DISPLAY-TERMS-FROM-TICK-DATA", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_visualizer_show_termP", "INFERENCE-VISUALIZER-SHOW-TERM?", 1, 0, false );
    SubLFiles.declareFunction( me, "encode_terms", "ENCODE-TERMS", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_inference_visualizer_term_generality", "CLEAR-INFERENCE-VISUALIZER-TERM-GENERALITY", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_inference_visualizer_term_generality", "REMOVE-INFERENCE-VISUALIZER-TERM-GENERALITY", 1, 1, false );
    SubLFiles.declareFunction( me, "inference_visualizer_term_generality_internal", "INFERENCE-VISUALIZER-TERM-GENERALITY-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_visualizer_term_generality", "INFERENCE-VISUALIZER-TERM-GENERALITY", 1, 1, false );
    SubLFiles.declareFunction( me, "xml_get_inference_hl_module_times", "XML-GET-INFERENCE-HL-MODULE-TIMES", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_inference_link_info", "CB-INFERENCE-LINK-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "get_inference_from_mode", "GET-INFERENCE-FROM-MODE", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_problem_store_link_id_map_json_string", "CLEAR-PROBLEM-STORE-LINK-ID-MAP-JSON-STRING", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_problem_store_link_id_map_json_string", "REMOVE-PROBLEM-STORE-LINK-ID-MAP-JSON-STRING", 1, 3, false );
    SubLFiles.declareFunction( me, "problem_store_link_id_map_json_string_internal", "PROBLEM-STORE-LINK-ID-MAP-JSON-STRING-INTERNAL", 4, 0, false );
    SubLFiles.declareFunction( me, "problem_store_link_id_map_json_string", "PROBLEM-STORE-LINK-ID-MAP-JSON-STRING", 1, 3, false );
    SubLFiles.declareFunction( me, "problem_store_complete_link_id_map_json_string", "PROBLEM-STORE-COMPLETE-LINK-ID-MAP-JSON-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "json_serialize_problem_store_link_id_map", "JSON-SERIALIZE-PROBLEM-STORE-LINK-ID-MAP", 1, 3, false );
    SubLFiles.declareFunction( me, "json_serialize_problem_store_complete_link_id_map", "JSON-SERIALIZE-PROBLEM-STORE-COMPLETE-LINK-ID-MAP", 1, 0, false );
    SubLFiles.declareFunction( me, "json_serialize_problem_store_link_id_map_int", "JSON-SERIALIZE-PROBLEM-STORE-LINK-ID-MAP-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "sort_partial_link_id_map", "SORT-PARTIAL-LINK-ID-MAP", 1, 0, false );
    SubLFiles.declareFunction( me, "link_id_map_entry_L", "LINK-ID-MAP-ENTRY-<", 2, 0, false );
    SubLFiles.declareFunction( me, "get_partial_problem_store_link_id_map", "GET-PARTIAL-PROBLEM-STORE-LINK-ID-MAP", 1, 3, false );
    SubLFiles.declareFunction( me, "validate_partial_problem_store_link_id_maps", "VALIDATE-PARTIAL-PROBLEM-STORE-LINK-ID-MAPS", 1, 1, false );
    SubLFiles.declareFunction( me, "get_truncated_problem_store_link_id_map", "GET-TRUNCATED-PROBLEM-STORE-LINK-ID-MAP", 2, 1, false );
    SubLFiles.declareFunction( me, "get_truncated_problem_store_link_id_map_int", "GET-TRUNCATED-PROBLEM-STORE-LINK-ID-MAP-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_id_from_tick_data", "PROBLEM-ID-FROM-TICK-DATA", 2, 0, false );
    SubLFiles.declareFunction( me, "json_serialize_problem_store_link", "JSON-SERIALIZE-PROBLEM-STORE-LINK", 4, 0, false );
    SubLFiles.declareFunction( me, "json_serialize_problem", "JSON-SERIALIZE-PROBLEM", 1, 0, false );
    SubLFiles.declareFunction( me, "json_label_for_problem", "JSON-LABEL-FOR-PROBLEM", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_web_services_file()
  {
    $last_monitored_inference$ = SubLFiles.deflexical( "*LAST-MONITORED-INFERENCE*", NIL );
    $notify_getting_tick_data_caching_state$ = SubLFiles.deflexical( "*NOTIFY-GETTING-TICK-DATA-CACHING-STATE*", NIL );
    $filter_inference_visualizer_termsP$ = SubLFiles.defparameter( "*FILTER-INFERENCE-VISUALIZER-TERMS?*", NIL );
    $inference_visualizer_term_generality_caching_state$ = SubLFiles.deflexical( "*INFERENCE-VISUALIZER-TERM-GENERALITY-CACHING-STATE*", NIL );
    $problem_store_link_id_map_json_string_caching_state$ = SubLFiles.deflexical( "*PROBLEM-STORE-LINK-ID-MAP-JSON-STRING-CACHING-STATE*", NIL );
    $json_problem_label_max_length$ = SubLFiles.defparameter( "*JSON-PROBLEM-LABEL-MAX-LENGTH*", $int127$100 );
    return NIL;
  }

  public static SubLObject setup_web_services_file()
  {
    html_macros.note_cgi_handler_function( $sym11$XML_QUERY_VARIABLE, $kw12$XML_HANDLER );
    html_macros.note_cgi_handler_function( $sym14$XML_GET_GENLS_FROM_STRING, $kw15$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym18$XML_GET_GENLS_FROM_STRING_INT, $kw15$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym19$XML_GET_GENLS, $kw15$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym28$XML_GET_GENLS_INT, $kw15$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym31$XML_GET_UPWARDS_CLOSURE_FROM_STRING, $kw15$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym32$XML_GET_UPWARDS_CLOSURE, $kw15$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym33$XML_GET_ISAS_FROM_STRING, $kw15$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym34$XML_GET_ISAS_FROM_STRING_INT, $kw15$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym35$XML_GET_ISAS, $kw15$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym37$XML_GET_ISAS_INT, $kw15$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym38$XML_GET_GENERATION, $kw15$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym65$CB_INFERENCE_TICK_DATA, $kw15$HTML_HANDLER );
    memoization_state.note_globally_cached_function( $sym66$NOTIFY_GETTING_TICK_DATA );
    memoization_state.note_memoized_function( $sym98$INFERENCE_PROGRESS_DATA_FOR_TICK_NUMBER_MEMOIZED );
    memoization_state.note_globally_cached_function( $sym104$INFERENCE_VISUALIZER_TERM_GENERALITY );
    html_macros.note_cgi_handler_function( $sym137$XML_GET_INFERENCE_HL_MODULE_TIMES, $kw12$XML_HANDLER );
    html_macros.note_cgi_handler_function( $sym144$CB_INFERENCE_LINK_INFO, $kw15$HTML_HANDLER );
    memoization_state.note_globally_cached_function( $sym145$PROBLEM_STORE_LINK_ID_MAP_JSON_STRING );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_web_services_file();
  }

  @Override
  public void initializeVariables()
  {
    init_web_services_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_web_services_file();
  }
  static
  {
    me = new web_services();
    $last_monitored_inference$ = null;
    $notify_getting_tick_data_caching_state$ = null;
    $filter_inference_visualizer_termsP$ = null;
    $inference_visualizer_term_generality_caching_state$ = null;
    $problem_store_link_id_map_json_string_caching_state$ = null;
    $json_problem_label_max_length$ = null;
    $list0 = ConsesLow.list( makeKeyword( "INPUT-NAME" ), makeString( "query" ) );
    $const1$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $list2 = ConsesLow.list( makeKeyword( "INPUT-NAME" ), makeString( "mt" ) );
    $str3$var = makeString( "var" );
    $str4$__xml_version__1_0__encoding__UTF = makeString( "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" );
    $list5 = ConsesLow.list( makeString( "xmlns:xsi" ), makeString( "http://www.w3.org/2001/XMLSchema-instance" ), makeString( "xsi:schemaLocation" ), makeString(
        "http://ws.opencyc.org/xsd/LightWeightResultSet http://ws.opencyc.org/xsd/LightWeightResultSet.xsd" ), makeString( "xmlns:concepts" ), makeString( "http://ws.opencyc.org/xsd/CycConcepts" ), makeString( "xmlns" ),
        makeString( "http://ws.opencyc.org/xsd/LightWeightResultSet" ) );
    $str6$ResultSet = makeString( "ResultSet" );
    $kw7$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $str8$Term = makeString( "Term" );
    $str9$cycl = makeString( "cycl" );
    $sym10$_EXIT = makeSymbol( "%EXIT" );
    $sym11$XML_QUERY_VARIABLE = makeSymbol( "XML-QUERY-VARIABLE" );
    $kw12$XML_HANDLER = makeKeyword( "XML-HANDLER" );
    $str13$root = makeString( "root" );
    $sym14$XML_GET_GENLS_FROM_STRING = makeSymbol( "XML-GET-GENLS-FROM-STRING" );
    $kw15$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $str16$term = makeString( "term" );
    $sym17$GET_NL_INTERP_CYCL = makeSymbol( "GET-NL-INTERP-CYCL" );
    $sym18$XML_GET_GENLS_FROM_STRING_INT = makeSymbol( "XML-GET-GENLS-FROM-STRING-INT" );
    $sym19$XML_GET_GENLS = makeSymbol( "XML-GET-GENLS" );
    $str20$mt = makeString( "mt" );
    $str21$__InferencePSC = makeString( "#$InferencePSC" );
    $str22$limit = makeString( "limit" );
    $str23$nil = makeString( "nil" );
    $str24$nl_generation = makeString( "nl-generation" );
    $str25$name = makeString( "name" );
    $str26$cycml = makeString( "cycml" );
    $str27$genl = makeString( "genl" );
    $sym28$XML_GET_GENLS_INT = makeSymbol( "XML-GET-GENLS-INT" );
    $str29$generation = makeString( "generation" );
    $str30$_S = makeString( "~S" );
    $sym31$XML_GET_UPWARDS_CLOSURE_FROM_STRING = makeSymbol( "XML-GET-UPWARDS-CLOSURE-FROM-STRING" );
    $sym32$XML_GET_UPWARDS_CLOSURE = makeSymbol( "XML-GET-UPWARDS-CLOSURE" );
    $sym33$XML_GET_ISAS_FROM_STRING = makeSymbol( "XML-GET-ISAS-FROM-STRING" );
    $sym34$XML_GET_ISAS_FROM_STRING_INT = makeSymbol( "XML-GET-ISAS-FROM-STRING-INT" );
    $sym35$XML_GET_ISAS = makeSymbol( "XML-GET-ISAS" );
    $str36$isa = makeString( "isa" );
    $sym37$XML_GET_ISAS_INT = makeSymbol( "XML-GET-ISAS-INT" );
    $sym38$XML_GET_GENERATION = makeSymbol( "XML-GET-GENERATION" );
    $list39 = ConsesLow.list( makeSymbol( "CONTROL-STRING" ), makeSymbol( "&REST" ), makeSymbol( "ARGS" ) );
    $sym40$PROGN = makeSymbol( "PROGN" );
    $sym41$FORMAT = makeSymbol( "FORMAT" );
    $sym42$_HTML_STREAM_ = makeSymbol( "*HTML-STREAM*" );
    $str43$mode = makeString( "mode" );
    $str44$problemStoreId = makeString( "problemStoreId" );
    $str45$inferenceId = makeString( "inferenceId" );
    $str46$tickNumber = makeString( "tickNumber" );
    $str47$dataType = makeString( "dataType" );
    $str48$language = makeString( "language" );
    $kw49$SKIP = makeKeyword( "SKIP" );
    $list50 = ConsesLow.list( makeUninternedSymbol( "START" ), makeUninternedSymbol( "END" ), makeUninternedSymbol( "DELTA" ) );
    $kw51$DO_HASH_TABLE = makeKeyword( "DO-HASH-TABLE" );
    $str52$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str53$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $str54$ERROR__Could_not_find_inference_f = makeString( "ERROR: Could not find inference for problemStoreId ~S inferenceId ~S" );
    $kw55$LATEST_PROBLEM_STORE = makeKeyword( "LATEST-PROBLEM-STORE" );
    $str56$Now_monitoring__S___at_tick__A = makeString( "Now monitoring ~S~% at tick ~A" );
    $str57$Input_tick_number___S = makeString( "Input tick number: ~S" );
    $str58$Getting_data_for_tick_number__S = makeString( "Getting data for tick number ~S" );
    $str59$nlLabel___ = makeString( "nlLabel=~%" );
    $str60$stepCount_0__ = makeString( "stepCount=0~%" );
    $str61$problemCount_0__ = makeString( "problemCount=0~%" );
    $str62$assertionTouchCount_0__ = makeString( "assertionTouchCount=0~%" );
    $str63$termTouchCount_0__ = makeString( "termTouchCount=0~%" );
    $str64$maxTick__A__ = makeString( "maxTick=~A~%" );
    $sym65$CB_INFERENCE_TICK_DATA = makeSymbol( "CB-INFERENCE-TICK-DATA" );
    $sym66$NOTIFY_GETTING_TICK_DATA = makeSymbol( "NOTIFY-GETTING-TICK-DATA" );
    $str67$__Getting_tick_data___ = makeString( "~&Getting tick data.~%" );
    $sym68$_NOTIFY_GETTING_TICK_DATA_CACHING_STATE_ = makeSymbol( "*NOTIFY-GETTING-TICK-DATA-CACHING-STATE*" );
    $kw69$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym70$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $kw71$TICK_COUNT = makeKeyword( "TICK-COUNT" );
    $kw72$PROBLEM_COUNT = makeKeyword( "PROBLEM-COUNT" );
    $kw73$PROBLEM = makeKeyword( "PROBLEM" );
    $kw74$STEP_COUNT = makeKeyword( "STEP-COUNT" );
    $kw75$ASSERTION_TOUCH_COUNT = makeKeyword( "ASSERTION-TOUCH-COUNT" );
    $kw76$TERM_TOUCH_COUNT = makeKeyword( "TERM-TOUCH-COUNT" );
    $kw77$LAST_ASSERTION_TOUCHED = makeKeyword( "LAST-ASSERTION-TOUCHED" );
    $kw78$LAST_TERM_TOUCHED = makeKeyword( "LAST-TERM-TOUCHED" );
    $str79$__Tick_count___S__from_tick_numbe = makeString( "~&Tick count: ~S (from tick number ~S)~%" );
    $str80$No_problem_count_for__S_at__A = makeString( "No problem count for ~S at ~A" );
    $str81$tickCount__A__ = makeString( "tickCount=~A~%" );
    $str82$inferenceStatus__A__ = makeString( "inferenceStatus=~A~%" );
    $str83$stepCount__A__ = makeString( "stepCount=~A~%" );
    $str84$problemCount__A__ = makeString( "problemCount=~A~%" );
    $str85$assertionTouchCount__A__ = makeString( "assertionTouchCount=~A~%" );
    $str86$termTouchCount__A__ = makeString( "termTouchCount=~A~%" );
    $str87$inferenceId__A__ = makeString( "inferenceId=~A~%" );
    $str88$problemStoreId__A__ = makeString( "problemStoreId=~A~%" );
    $str89$nlLabel__A__ = makeString( "nlLabel=~A~%" );
    $str90$problem = makeString( "problem" );
    $str91$NIL = makeString( "NIL" );
    $str92$problemQueryFormula___A___ = makeString( "problemQueryFormula=\"~A\"~%" );
    $str93$assertion = makeString( "assertion" );
    $str94$lastAssertionTouched___A___ = makeString( "lastAssertionTouched=\"~A\"~%" );
    $str95$lastTermTouched___A___ = makeString( "lastTermTouched=\"~A\"~%" );
    $str96$newProblemTerms___A___ = makeString( "newProblemTerms=\"~A\"~%" );
    $str97$newAssertionTerms___A___ = makeString( "newAssertionTerms=\"~A\"~%" );
    $sym98$INFERENCE_PROGRESS_DATA_FOR_TICK_NUMBER_MEMOIZED = makeSymbol( "INFERENCE-PROGRESS-DATA-FOR-TICK-NUMBER-MEMOIZED" );
    $sym99$INFERENCE_VISUALIZER_SHOW_TERM_ = makeSymbol( "INFERENCE-VISUALIZER-SHOW-TERM?" );
    $sym100$IST_SENTENCE_P = makeSymbol( "IST-SENTENCE-P" );
    $sym101$FORMULA_ARG2 = makeSymbol( "FORMULA-ARG2" );
    $const102$Thing = constant_handles.reader_make_constant_shell( makeString( "Thing" ) );
    $str103$english = makeString( "english" );
    $sym104$INFERENCE_VISUALIZER_TERM_GENERALITY = makeSymbol( "INFERENCE-VISUALIZER-TERM-GENERALITY" );
    $int105$50 = makeInteger( 50 );
    $int106$950 = makeInteger( 950 );
    $int107$900 = makeInteger( 900 );
    $int108$800 = makeInteger( 800 );
    $int109$600 = makeInteger( 600 );
    $int110$500 = makeInteger( 500 );
    $int111$1000 = makeInteger( 1000 );
    $sym112$_INFERENCE_VISUALIZER_TERM_GENERALITY_CACHING_STATE_ = makeSymbol( "*INFERENCE-VISUALIZER-TERM-GENERALITY-CACHING-STATE*" );
    $int113$128 = makeInteger( 128 );
    $str114$error = makeString( "error" );
    $str115$ERROR__Could_not_find_inference_H = makeString( "ERROR: Could not find inference HL module times for problemStoreId ~S inferenceId ~S" );
    $sym116$_ = makeSymbol( "+" );
    $str117$summary = makeString( "summary" );
    $str118$totalTime = makeString( "totalTime" );
    $str119$_d = makeString( "~d" );
    $str120$modulesTime = makeString( "modulesTime" );
    $sym121$INFERENCE_HARNESS_OVERHEAD = makeSymbol( "INFERENCE-HARNESS-OVERHEAD" );
    $str122$modulesData = makeString( "modulesData" );
    $sym123$POSITIVE_NUMBER_P = makeSymbol( "POSITIVE-NUMBER-P" );
    $str124$module = makeString( "module" );
    $str125$percentTime = makeString( "percentTime" );
    $str126$__4f_ = makeString( "~,4f%" );
    $int127$100 = makeInteger( 100 );
    $sym128$NEGATIVE_NUMBER_P = makeSymbol( "NEGATIVE-NUMBER-P" );
    $str129$recursiveTime = makeString( "recursiveTime" );
    $str130$count = makeString( "count" );
    $str131$maxTime = makeString( "maxTime" );
    $sym132$MAX = makeSymbol( "MAX" );
    $str133$medianTime = makeString( "medianTime" );
    $str134$meanTime = makeString( "meanTime" );
    $sym135$_ = makeSymbol( ">" );
    $sym136$SECOND = makeSymbol( "SECOND" );
    $sym137$XML_GET_INFERENCE_HL_MODULE_TIMES = makeSymbol( "XML-GET-INFERENCE-HL-MODULE-TIMES" );
    $str138$startTickNumber = makeString( "startTickNumber" );
    $str139$endTickNumber = makeString( "endTickNumber" );
    $kw140$LATEST_INFERENCE = makeKeyword( "LATEST-INFERENCE" );
    $sym141$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $str142$_A = makeString( "~A" );
    $str143$Caught_error_getting_link_info_fo = makeString( "Caught error getting link info for ~S~%~A" );
    $sym144$CB_INFERENCE_LINK_INFO = makeSymbol( "CB-INFERENCE-LINK-INFO" );
    $sym145$PROBLEM_STORE_LINK_ID_MAP_JSON_STRING = makeSymbol( "PROBLEM-STORE-LINK-ID-MAP-JSON-STRING" );
    $sym146$_PROBLEM_STORE_LINK_ID_MAP_JSON_STRING_CACHING_STATE_ = makeSymbol( "*PROBLEM-STORE-LINK-ID-MAP-JSON-STRING-CACHING-STATE*" );
    $int147$256 = makeInteger( 256 );
    $str148$_ = makeString( "{" );
    $sym149$STRINGP = makeSymbol( "STRINGP" );
    $str150$_ = makeString( "," );
    $str151$__ = makeString( ": " );
    $str152$links = makeString( "links" );
    $str153$_ = makeString( "[" );
    $list154 = ConsesLow.cons( makeUninternedSymbol( "KEY" ), makeSymbol( "DATA" ) );
    $list155 = ConsesLow.list( makeSymbol( "PARENT-ID" ), makeSymbol( "&REST" ), makeSymbol( "CHILDREN-IDS" ) );
    $kw156$ROOT = makeKeyword( "ROOT" );
    $str157$_ = makeString( "]" );
    $str158$problems = makeString( "problems" );
    $str159$_ = makeString( "}" );
    $sym160$LINK_ID_MAP_ENTRY__ = makeSymbol( "LINK-ID-MAP-ENTRY-<" );
    $str161$Partial_map___S = makeString( "Partial map: ~S" );
    $list162 = ConsesLow.cons( makeUninternedSymbol( "KEY" ), makeSymbol( "ITEM" ) );
    $list163 = ConsesLow.cons( makeSymbol( "PARENT-ID" ), makeSymbol( "CHILD-IDS" ) );
    $str164$Unseen_parent__D_in__S_for__S_to_ = makeString( "Unseen parent ~D in ~S for ~S to ~S" );
    $str165$Can_t_get_link_ID_map_from_null_i = makeString( "Can't get link ID map from null inference." );
    $str166$Getting_links_from__S_up_to_probl = makeString( "Getting links from ~S up to problem ~S" );
    $list167 = ConsesLow.cons( makeSymbol( "LINK-ID" ), makeSymbol( "LINK-DATA" ) );
    $sym168$__ = makeSymbol( ">=" );
    $sym169$_ = makeSymbol( "<" );
    $str170$pp = makeString( "pp" );
    $str171$cp = makeString( "cp" );
    $str172$id = makeString( "id" );
    $str173$status = makeString( "status" );
    $str174$label = makeString( "label" );
    $str175$ = makeString( "" );
    $str176$_ = makeString( " " );
  }
}
/*
 * 
 * Total time: 3395 ms
 * 
 */