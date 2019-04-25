package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class shop_log
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.shop_log";
  public static final String myFingerPrint = "1aa9deb937db22c6f459d21d40522114c78982359c3d15321118ab2697ecd690";
  @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 7088L)
  private static SubLSymbol $shop_log_entry_map$;
  private static final SubLSymbol $sym0$PROCESS_LOG;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$HTML_PROCESS_LOG;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLSymbol $sym5$SHOP_LOG;
  private static final SubLSymbol $sym6$OBJECT;
  private static final SubLList $list7;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$ISG;
  private static final SubLSymbol $sym10$VERBOSE;
  private static final SubLSymbol $sym11$STREAM;
  private static final SubLSymbol $sym12$LOG;
  private static final SubLSymbol $sym13$INSTANCE_COUNT;
  private static final SubLSymbol $sym14$SUBLOOP_RESERVED_INITIALIZE_SHOP_LOG_CLASS;
  private static final SubLSymbol $sym15$ISOLATED_P;
  private static final SubLSymbol $sym16$INSTANCE_NUMBER;
  private static final SubLSymbol $sym17$SUBLOOP_RESERVED_INITIALIZE_SHOP_LOG_INSTANCE;
  private static final SubLSymbol $sym18$INITIALIZE;
  private static final SubLList $list19;
  private static final SubLList $list20;
  private static final SubLSymbol $sym21$OUTER_CATCH_FOR_SHOP_LOG_METHOD;
  private static final SubLSymbol $sym22$SHOP_LOG_INITIALIZE_METHOD;
  private static final SubLSymbol $sym23$ADD_TO_LOG;
  private static final SubLList $list24;
  private static final SubLList $list25;
  private static final SubLList $list26;
  private static final SubLSymbol $sym27$OUTER_CATCH_FOR_SHOP_LOG_METHOD;
  private static final SubLSymbol $sym28$SHOP_LOG_ADD_TO_LOG_METHOD;
  private static final SubLSymbol $sym29$LOG_NEWLINE;
  private static final SubLList $list30;
  private static final SubLList $list31;
  private static final SubLSymbol $kw32$NEWLINE;
  private static final SubLSymbol $sym33$SHOP_LOG_LOG_NEWLINE_METHOD;
  private static final SubLSymbol $sym34$LOG_ENTRY;
  private static final SubLList $list35;
  private static final SubLSymbol $sym36$SHOP_LOG_LOG_ENTRY_METHOD;
  private static final SubLSymbol $sym37$LOG_PREFORMATTED;
  private static final SubLList $list38;
  private static final SubLSymbol $kw39$PRE;
  private static final SubLSymbol $sym40$SHOP_LOG_LOG_PREFORMATTED_METHOD;
  private static final SubLSymbol $sym41$LOG_FANCY_ENTRY;
  private static final SubLList $list42;
  private static final SubLList $list43;
  private static final SubLSymbol $kw44$FANCY;
  private static final SubLSymbol $sym45$SHOP_LOG_LOG_FANCY_ENTRY_METHOD;
  private static final SubLSymbol $sym46$LOG_HEADING;
  private static final SubLList $list47;
  private static final SubLList $list48;
  private static final SubLSymbol $kw49$HEADING;
  private static final SubLSymbol $sym50$SHOP_LOG_LOG_HEADING_METHOD;
  private static final SubLSymbol $sym51$LOG_PARTIAL_PLAN;
  private static final SubLList $list52;
  private static final SubLSymbol $kw53$PARTIAL_PLAN;
  private static final SubLSymbol $sym54$SHOP_LOG_LOG_PARTIAL_PLAN_METHOD;
  private static final SubLSymbol $sym55$COLOR_LOG_ENTRY;
  private static final SubLList $list56;
  private static final SubLList $list57;
  private static final SubLSymbol $kw58$COLOR;
  private static final SubLSymbol $sym59$SHOP_LOG_COLOR_LOG_ENTRY_METHOD;
  private static final SubLSymbol $sym60$WARNING;
  private static final SubLList $list61;
  private static final SubLSymbol $kw62$RED;
  private static final SubLSymbol $sym63$SHOP_LOG_WARNING_METHOD;
  private static final SubLSymbol $sym64$SUCCESS;
  private static final SubLList $list65;
  private static final SubLSymbol $kw66$DARK_GREEN;
  private static final SubLSymbol $sym67$SHOP_LOG_SUCCESS_METHOD;
  private static final SubLSymbol $sym68$NEW_SECTION;
  private static final SubLList $list69;
  private static final SubLSymbol $kw70$HR;
  private static final SubLSymbol $sym71$SHOP_LOG_NEW_SECTION_METHOD;
  private static final SubLSymbol $sym72$LOG_PLANNER_RULE;
  private static final SubLList $list73;
  private static final SubLList $list74;
  private static final SubLSymbol $kw75$RULE;
  private static final SubLSymbol $sym76$SHOP_LOG_LOG_PLANNER_RULE_METHOD;
  private static final SubLSymbol $sym77$LOG_INFERENCE;
  private static final SubLList $list78;
  private static final SubLList $list79;
  private static final SubLSymbol $sym80$INFERENCE_P;
  private static final SubLSymbol $kw81$INFERENCE;
  private static final SubLSymbol $sym82$SHOP_LOG_LOG_INFERENCE_METHOD;
  private static final SubLSymbol $sym83$LOG_MULTIBINDING;
  private static final SubLList $list84;
  private static final SubLList $list85;
  private static final SubLSymbol $kw86$MBIND;
  private static final SubLSymbol $sym87$SHOP_LOG_LOG_MULTIBINDING_METHOD;
  private static final SubLSymbol $sym88$PLANNER_RULE_LINK;
  private static final SubLList $list89;
  private static final SubLSymbol $sym90$SHOP_LOG_PLANNER_RULE_LINK_METHOD;
  private static final SubLSymbol $sym91$DISPLAY_FANCY_ENTRY;
  private static final SubLList $list92;
  private static final SubLList $list93;
  private static final SubLSymbol $kw94$BOLD;
  private static final SubLSymbol $sym95$SHOP_LOG_DISPLAY_FANCY_ENTRY_METHOD;
  private static final SubLSymbol $sym96$DISPLAY_MULTIBINDING;
  private static final SubLList $list97;
  private static final SubLSymbol $sym98$FIRST;
  private static final SubLSymbol $sym99$STRING_;
  private static final SubLSymbol $sym100$SHOP_VAR_NAME;
  private static final SubLList $list101;
  private static final SubLString $str102$_s____;
  private static final SubLString $str103$__s;
  private static final SubLSymbol $sym104$SHOP_LOG_DISPLAY_MULTIBINDING_METHOD;
  private static final SubLSymbol $sym105$INFERENCE_LINK;
  private static final SubLList $list106;
  private static final SubLList $list107;
  private static final SubLString $str108$_Examine_Inference_;
  private static final SubLString $str109$__returned_bindings___s;
  private static final SubLString $str110$_s;
  private static final SubLSymbol $sym111$SHOP_LOG_INFERENCE_LINK_METHOD;
  private static final SubLSymbol $sym112$DISPLAY_COLOR_ENTRY;
  private static final SubLList $list113;
  private static final SubLList $list114;
  private static final SubLSymbol $sym115$SHOP_LOG_DISPLAY_COLOR_ENTRY_METHOD;
  private static final SubLSymbol $sym116$DISPLAY_PARTIAL_PLAN;
  private static final SubLList $list117;
  private static final SubLSymbol $sym118$SHOP_LOG_DISPLAY_PARTIAL_PLAN_METHOD;
  private static final SubLSymbol $sym119$DISPLAY_SWITCHABLE_PARTIAL_PLAN;
  private static final SubLList $list120;
  private static final SubLSymbol $sym121$OUTER_CATCH_FOR_SHOP_LOG_METHOD;
  private static final SubLString $str122$partial_plan_;
  private static final SubLString $str123$Partial_Plan;
  private static final SubLString $str124$_Show_;
  private static final SubLString $str125$_Hide_;
  private static final SubLSymbol $kw126$INVISIBLE;
  private static final SubLSymbol $kw127$PARAGRAPH;
  private static final SubLSymbol $sym128$SHOP_LOG_DISPLAY_SWITCHABLE_PARTIAL_PLAN_METHOD;
  private static final SubLList $list129;
  private static final SubLSymbol $sym130$DISPLAY_HTML_LOG;
  private static final SubLList $list131;
  private static final SubLSymbol $sym132$OUTER_CATCH_FOR_SHOP_LOG_METHOD;
  private static final SubLString $str133$__;
  private static final SubLSymbol $sym134$SHOP_LOG_DISPLAY_HTML_LOG_METHOD;
  private static final SubLSymbol $sym135$SET_VERBOSITY;
  private static final SubLList $list136;
  private static final SubLList $list137;
  private static final SubLSymbol $sym138$OUTER_CATCH_FOR_SHOP_LOG_METHOD;
  private static final SubLSymbol $sym139$MEMBER;
  private static final SubLString $str140$_s_is_not_a_permissible_value_for;
  private static final SubLSymbol $sym141$SHOP_LOG_SET_VERBOSITY_METHOD;

  @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 780L)
  public static SubLObject process_log_p(final SubLObject process_log)
  {
    return interfaces.subloop_instanceof_interface( process_log, $sym0$PROCESS_LOG );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 1106L)
  public static SubLObject html_process_log_p(final SubLObject html_process_log)
  {
    return interfaces.subloop_instanceof_interface( html_process_log, $sym2$HTML_PROCESS_LOG );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 1402L)
  public static SubLObject get_shop_log_isg(final SubLObject v_shop_log)
  {
    return classes.subloop_get_access_protected_instance_slot( v_shop_log, FOUR_INTEGER, $sym9$ISG );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 1402L)
  public static SubLObject set_shop_log_isg(final SubLObject v_shop_log, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_shop_log, value, FOUR_INTEGER, $sym9$ISG );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 1402L)
  public static SubLObject get_shop_log_verbose(final SubLObject v_shop_log)
  {
    return classes.subloop_get_access_protected_instance_slot( v_shop_log, THREE_INTEGER, $sym10$VERBOSE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 1402L)
  public static SubLObject set_shop_log_verbose(final SubLObject v_shop_log, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_shop_log, value, THREE_INTEGER, $sym10$VERBOSE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 1402L)
  public static SubLObject get_shop_log_stream(final SubLObject v_shop_log)
  {
    return classes.subloop_get_access_protected_instance_slot( v_shop_log, TWO_INTEGER, $sym11$STREAM );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 1402L)
  public static SubLObject set_shop_log_stream(final SubLObject v_shop_log, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_shop_log, value, TWO_INTEGER, $sym11$STREAM );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 1402L)
  public static SubLObject get_shop_log_log(final SubLObject v_shop_log)
  {
    return classes.subloop_get_access_protected_instance_slot( v_shop_log, ONE_INTEGER, $sym12$LOG );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 1402L)
  public static SubLObject set_shop_log_log(final SubLObject v_shop_log, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_shop_log, value, ONE_INTEGER, $sym12$LOG );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 1402L)
  public static SubLObject subloop_reserved_initialize_shop_log_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym6$OBJECT, $sym13$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 1402L)
  public static SubLObject subloop_reserved_initialize_shop_log_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym6$OBJECT, $sym15$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym6$OBJECT, $sym16$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$SHOP_LOG, $sym12$LOG, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$SHOP_LOG, $sym11$STREAM, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$SHOP_LOG, $sym10$VERBOSE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$SHOP_LOG, $sym9$ISG, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 1402L)
  public static SubLObject shop_log_p(final SubLObject v_shop_log)
  {
    return classes.subloop_instanceof_class( v_shop_log, $sym5$SHOP_LOG );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 2320L)
  public static SubLObject shop_log_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_log_method = NIL;
    SubLObject isg = get_shop_log_isg( self );
    SubLObject verbose = get_shop_log_verbose( self );
    SubLObject stream = get_shop_log_stream( self );
    SubLObject log = get_shop_log_log( self );
    try
    {
      thread.throwStack.push( $sym21$OUTER_CATCH_FOR_SHOP_LOG_METHOD );
      try
      {
        object.object_initialize_method( self );
        verbose = ZERO_INTEGER;
        stream = T;
        log = NIL;
        isg = integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED );
        Dynamic.sublisp_throw( $sym21$OUTER_CATCH_FOR_SHOP_LOG_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_log_isg( self, isg );
          set_shop_log_verbose( self, verbose );
          set_shop_log_stream( self, stream );
          set_shop_log_log( self, log );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_shop_log_method = Errors.handleThrowable( ccatch_env_var, $sym21$OUTER_CATCH_FOR_SHOP_LOG_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_log_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 2518L)
  public static SubLObject shop_log_add_to_log_method(final SubLObject self, final SubLObject item)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_log_method = NIL;
    SubLObject log = get_shop_log_log( self );
    try
    {
      thread.throwStack.push( $sym27$OUTER_CATCH_FOR_SHOP_LOG_METHOD );
      try
      {
        log = ConsesLow.cons( item, log );
        if( item.isString() )
        {
          print_high.princ( item, UNPROVIDED );
        }
        Dynamic.sublisp_throw( $sym27$OUTER_CATCH_FOR_SHOP_LOG_METHOD, item );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_log_log( self, log );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_shop_log_method = Errors.handleThrowable( ccatch_env_var, $sym27$OUTER_CATCH_FOR_SHOP_LOG_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_log_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 2667L)
  public static SubLObject shop_log_log_newline_method(final SubLObject self)
  {
    return shop_log_add_to_log_method( self, $kw32$NEWLINE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 2759L)
  public static SubLObject shop_log_log_entry_method(final SubLObject self, final SubLObject item)
  {
    return shop_log_add_to_log_method( self, item );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 2849L)
  public static SubLObject shop_log_log_preformatted_method(final SubLObject self, final SubLObject item)
  {
    return shop_log_add_to_log_method( self, ConsesLow.cons( $kw39$PRE, item ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 2958L)
  public static SubLObject shop_log_log_fancy_entry_method(final SubLObject self, final SubLObject entry, final SubLObject mod_list)
  {
    return shop_log_add_to_log_method( self, ConsesLow.list( $kw44$FANCY, entry, mod_list ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 3088L)
  public static SubLObject shop_log_log_heading_method(final SubLObject self, final SubLObject entry)
  {
    return shop_log_add_to_log_method( self, ConsesLow.list( $kw49$HEADING, entry ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 3198L)
  public static SubLObject shop_log_log_partial_plan_method(final SubLObject self, final SubLObject entry)
  {
    return shop_log_add_to_log_method( self, ConsesLow.list( $kw53$PARTIAL_PLAN, entry ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 3318L)
  public static SubLObject shop_log_color_log_entry_method(final SubLObject self, final SubLObject item, final SubLObject color)
  {
    return shop_log_add_to_log_method( self, ConsesLow.list( $kw58$COLOR, color, item ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 3483L)
  public static SubLObject shop_log_warning_method(final SubLObject self, final SubLObject item)
  {
    return shop_log_color_log_entry_method( self, item, $kw62$RED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 3620L)
  public static SubLObject shop_log_success_method(final SubLObject self, final SubLObject item)
  {
    return shop_log_color_log_entry_method( self, item, $kw66$DARK_GREEN );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 3766L)
  public static SubLObject shop_log_new_section_method(final SubLObject self)
  {
    return shop_log_add_to_log_method( self, $kw70$HR );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 3902L)
  public static SubLObject shop_log_log_planner_rule_method(final SubLObject self, final SubLObject rule)
  {
    return shop_log_add_to_log_method( self, ConsesLow.list( $kw75$RULE, rule ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 4055L)
  public static SubLObject shop_log_log_inference_method(final SubLObject self, final SubLObject v_bindings, final SubLObject halt_reason, final SubLObject inference)
  {
    assert NIL != inference_datastructures_inference.inference_p( inference ) : inference;
    return shop_log_add_to_log_method( self, ConsesLow.list( $kw81$INFERENCE, v_bindings, halt_reason, inference ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 4318L)
  public static SubLObject shop_log_log_multibinding_method(final SubLObject self, final SubLObject mbind)
  {
    return shop_log_add_to_log_method( self, ConsesLow.list( $kw86$MBIND, mbind ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 4463L)
  public static SubLObject shop_log_planner_rule_link_method(final SubLObject self, final SubLObject entry)
  {
    final SubLObject rule = conses_high.second( entry );
    final SubLObject ass = shop_datastructures.shop_basic_planner_rule_assertions_method( rule ).first();
    if( NIL != assertion_handles.assertion_p( ass ) )
    {
      cb_utilities.cb_show_assertion_readably( ass, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 4727L)
  public static SubLObject shop_log_display_fancy_entry_method(final SubLObject self, final SubLObject entry)
  {
    SubLObject current;
    final SubLObject datum = current = entry.rest();
    SubLObject item = NIL;
    SubLObject mod_list = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list93 );
    item = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list93 );
    mod_list = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( NIL != subl_promotions.memberP( $kw94$BOLD, mod_list, UNPROVIDED, UNPROVIDED ) )
      {
        html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
        html_utilities.html_princ( item );
        html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list93 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 4973L)
  public static SubLObject shop_var_name(final SubLObject item)
  {
    return Symbols.symbol_name( item.first() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 5047L)
  public static SubLObject shop_log_display_multibinding_method(final SubLObject self, final SubLObject entry)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mb = conses_high.second( entry );
    final SubLObject alist = NIL;
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( multibindings.mb_multi_var_term_map( mb ) ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject var = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject entry_$1 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject values = Mapping.mapcar( Symbols.symbol_function( $sym98$FIRST ), entry_$1 );
      list_utilities.alist_enter( alist, var, values, UNPROVIDED );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( multibindings.mb_simple_var_term_map( mb ) ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject var = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject entry_$2 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject values = Mapping.mapcar( Symbols.symbol_function( $sym98$FIRST ), entry_$2 );
      list_utilities.alist_enter( alist, var, values, UNPROVIDED );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    Sort.sort( alist, $sym99$STRING_, $sym100$SHOP_VAR_NAME );
    SubLObject cdolist_list_var = alist;
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject var2 = NIL;
      SubLObject values2 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list101 );
      var2 = current.first();
      current = ( values2 = current.rest() );
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str102$_s____, var2 );
      SubLObject cdolist_list_var_$3 = values2;
      SubLObject cur_val = NIL;
      cur_val = cdolist_list_var_$3.first();
      while ( NIL != cdolist_list_var_$3)
      {
        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str103$__s, cur_val );
        cdolist_list_var_$3 = cdolist_list_var_$3.rest();
        cur_val = cdolist_list_var_$3.first();
      }
      html_utilities.html_newline( UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 5453L)
  public static SubLObject shop_log_inference_link_method(final SubLObject self, final SubLObject log_entry)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = log_entry.rest();
    SubLObject v_bindings = NIL;
    SubLObject halt_reason = NIL;
    SubLObject inference = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list78 );
    v_bindings = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list78 );
    halt_reason = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list78 );
    inference = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject num_bindings = Sequences.length( v_bindings );
      final SubLObject inference_name = $str108$_Examine_Inference_;
      html_utilities.html_newline( TWO_INTEGER );
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str109$__returned_bindings___s, num_bindings );
      html_utilities.html_indent( TWO_INTEGER );
      html_utilities.html_markup( html_macros.$html_emphasized_head$.getGlobalValue() );
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str110$_s, halt_reason );
      html_utilities.html_markup( html_macros.$html_emphasized_tail$.getGlobalValue() );
      html_utilities.html_newline( UNPROVIDED );
      return NIL;
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list78 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 6071L)
  public static SubLObject shop_log_display_color_entry_method(final SubLObject self, final SubLObject log_entry)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = log_entry.rest();
    SubLObject color = NIL;
    SubLObject entry = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list114 );
    color = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list114 );
    entry = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject color_val = color;
      html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
      if( NIL != color_val )
      {
        html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_color( color_val ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_macros.verify_not_within_html_pre();
        html_utilities.html_markup( html_macros.$html_preformatted_head$.getGlobalValue() );
        final SubLObject _prev_bind_0_$4 = html_macros.$within_html_pre$.currentBinding( thread );
        try
        {
          html_macros.$within_html_pre$.bind( T, thread );
          cb_utilities.cb_form( entry, UNPROVIDED, UNPROVIDED );
        }
        finally
        {
          html_macros.$within_html_pre$.rebind( _prev_bind_0_$4, thread );
        }
        html_utilities.html_markup( html_macros.$html_preformatted_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list114 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 6278L)
  public static SubLObject shop_log_display_partial_plan_method(final SubLObject self, final SubLObject log_entry)
  {
    SubLObject cdolist_list_var;
    final SubLObject partial_plan = cdolist_list_var = conses_high.second( log_entry );
    SubLObject step = NIL;
    step = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      cb_utilities.cb_form( step, UNPROVIDED, UNPROVIDED );
      html_utilities.html_newline( UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      step = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 6521L)
  public static SubLObject shop_log_display_switchable_partial_plan_method(final SubLObject self, final SubLObject log_entry)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_log_method = NIL;
    final SubLObject isg = get_shop_log_isg( self );
    try
    {
      thread.throwStack.push( $sym121$OUTER_CATCH_FOR_SHOP_LOG_METHOD );
      try
      {
        final SubLObject id = integer_sequence_generator.integer_sequence_generator_next( isg );
        final SubLObject object_id = Sequences.cconcatenate( $str122$partial_plan_, PrintLow.write_to_string( id, EMPTY_SUBL_OBJECT_ARRAY ) );
        html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
        html_utilities.html_princ( $str123$Partial_Plan );
        html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        html_utilities.html_indent( UNPROVIDED );
        dhtml_macros.dhtml_switch_visibility_links( object_id, $str124$_Show_, $str125$_Hide_ );
        html_utilities.html_newline( UNPROVIDED );
        dhtml_macros.dhtml_set_switched_visibility( object_id, $kw126$INVISIBLE, $kw127$PARAGRAPH );
        html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
        if( NIL != object_id )
        {
          html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( object_id );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          shop_log_display_partial_plan_method( self, log_entry );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
        }
        html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        Dynamic.sublisp_throw( $sym121$OUTER_CATCH_FOR_SHOP_LOG_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_log_isg( self, isg );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_shop_log_method = Errors.handleThrowable( ccatch_env_var, $sym121$OUTER_CATCH_FOR_SHOP_LOG_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_log_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 7525L)
  public static SubLObject shop_log_display_html_log_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_log_method = NIL;
    final SubLObject isg = get_shop_log_isg( self );
    final SubLObject log = get_shop_log_log( self );
    try
    {
      thread.throwStack.push( $sym132$OUTER_CATCH_FOR_SHOP_LOG_METHOD );
      try
      {
        integer_sequence_generator.integer_sequence_generator_reset( instances.get_slot( self, $sym9$ISG ) );
        SubLObject cdolist_list_var = Sequences.reverse( log );
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( item.isKeyword() )
          {
            final SubLObject pcase_var = item;
            if( pcase_var.eql( $kw70$HR ) )
            {
              html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw32$NEWLINE ) )
            {
              html_utilities.html_newline( UNPROVIDED );
            }
          }
          else if( item.isList() )
          {
            final SubLObject pcase_var = item.first();
            if( pcase_var.eql( $kw39$PRE ) )
            {
              html_macros.verify_not_within_html_pre();
              html_utilities.html_markup( html_macros.$html_preformatted_head$.getGlobalValue() );
              final SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding( thread );
              try
              {
                html_macros.$within_html_pre$.bind( T, thread );
                cb_utilities.cb_form( item.rest(), UNPROVIDED, UNPROVIDED );
              }
              finally
              {
                html_macros.$within_html_pre$.rebind( _prev_bind_0, thread );
              }
              html_utilities.html_markup( html_macros.$html_preformatted_tail$.getGlobalValue() );
            }
            else if( pcase_var.eql( $kw49$HEADING ) )
            {
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( THREE_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              html_utilities.html_princ( conses_high.second( item ) );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( THREE_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            else
            {
              final SubLObject method = conses_high.second( conses_high.assoc( item.first(), $shop_log_entry_map$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) );
              methods.funcall_instance_method_with_1_args( self, method, item );
            }
          }
          else if( item.isString() )
          {
            if( NIL != string_utilities.substringP( $str133$__, item, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
            {
              cb_utilities.cb_form( item, UNPROVIDED, UNPROVIDED );
            }
            else
            {
              html_utilities.html_princ( item );
            }
            html_utilities.html_br();
          }
          cdolist_list_var = cdolist_list_var.rest();
          item = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym132$OUTER_CATCH_FOR_SHOP_LOG_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_log_isg( self, isg );
          set_shop_log_log( self, log );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_shop_log_method = Errors.handleThrowable( ccatch_env_var, $sym132$OUTER_CATCH_FOR_SHOP_LOG_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_log_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 8193L)
  public static SubLObject shop_log_set_verbosity_method(final SubLObject self, final SubLObject new_verbose)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_log_method = NIL;
    SubLObject verbose = get_shop_log_verbose( self );
    try
    {
      thread.throwStack.push( $sym138$OUTER_CATCH_FOR_SHOP_LOG_METHOD );
      try
      {
        if( new_verbose.isNumber() )
        {
          verbose = new_verbose;
        }
        else if( new_verbose.isKeyword() )
        {
          verbose = conses_high.assoc( new_verbose, shop_internals.$shop_verbose_keys$.getDynamicValue( thread ), Symbols.symbol_function( $sym139$MEMBER ), UNPROVIDED ).rest();
        }
        else
        {
          Errors.cerror( $str140$_s_is_not_a_permissible_value_for, new_verbose );
        }
        Dynamic.sublisp_throw( $sym138$OUTER_CATCH_FOR_SHOP_LOG_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_log_verbose( self, verbose );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_shop_log_method = Errors.handleThrowable( ccatch_env_var, $sym138$OUTER_CATCH_FOR_SHOP_LOG_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_log_method;
  }

  public static SubLObject declare_shop_log_file()
  {
    SubLFiles.declareFunction( me, "process_log_p", "PROCESS-LOG-P", 1, 0, false );
    SubLFiles.declareFunction( me, "html_process_log_p", "HTML-PROCESS-LOG-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_shop_log_isg", "GET-SHOP-LOG-ISG", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_log_isg", "SET-SHOP-LOG-ISG", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_log_verbose", "GET-SHOP-LOG-VERBOSE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_log_verbose", "SET-SHOP-LOG-VERBOSE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_log_stream", "GET-SHOP-LOG-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_log_stream", "SET-SHOP-LOG-STREAM", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_log_log", "GET-SHOP-LOG-LOG", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_log_log", "SET-SHOP-LOG-LOG", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shop_log_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-LOG-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shop_log_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-LOG-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_log_p", "SHOP-LOG-P", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_log_initialize_method", "SHOP-LOG-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_log_add_to_log_method", "SHOP-LOG-ADD-TO-LOG-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_log_log_newline_method", "SHOP-LOG-LOG-NEWLINE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_log_log_entry_method", "SHOP-LOG-LOG-ENTRY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_log_log_preformatted_method", "SHOP-LOG-LOG-PREFORMATTED-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_log_log_fancy_entry_method", "SHOP-LOG-LOG-FANCY-ENTRY-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "shop_log_log_heading_method", "SHOP-LOG-LOG-HEADING-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_log_log_partial_plan_method", "SHOP-LOG-LOG-PARTIAL-PLAN-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_log_color_log_entry_method", "SHOP-LOG-COLOR-LOG-ENTRY-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "shop_log_warning_method", "SHOP-LOG-WARNING-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_log_success_method", "SHOP-LOG-SUCCESS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_log_new_section_method", "SHOP-LOG-NEW-SECTION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_log_log_planner_rule_method", "SHOP-LOG-LOG-PLANNER-RULE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_log_log_inference_method", "SHOP-LOG-LOG-INFERENCE-METHOD", 4, 0, false );
    SubLFiles.declareFunction( me, "shop_log_log_multibinding_method", "SHOP-LOG-LOG-MULTIBINDING-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_log_planner_rule_link_method", "SHOP-LOG-PLANNER-RULE-LINK-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_log_display_fancy_entry_method", "SHOP-LOG-DISPLAY-FANCY-ENTRY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_var_name", "SHOP-VAR-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_log_display_multibinding_method", "SHOP-LOG-DISPLAY-MULTIBINDING-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_log_inference_link_method", "SHOP-LOG-INFERENCE-LINK-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_log_display_color_entry_method", "SHOP-LOG-DISPLAY-COLOR-ENTRY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_log_display_partial_plan_method", "SHOP-LOG-DISPLAY-PARTIAL-PLAN-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_log_display_switchable_partial_plan_method", "SHOP-LOG-DISPLAY-SWITCHABLE-PARTIAL-PLAN-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_log_display_html_log_method", "SHOP-LOG-DISPLAY-HTML-LOG-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_log_set_verbosity_method", "SHOP-LOG-SET-VERBOSITY-METHOD", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_shop_log_file()
  {
    $shop_log_entry_map$ = SubLFiles.deflexical( "*SHOP-LOG-ENTRY-MAP*", $list129 );
    return NIL;
  }

  public static SubLObject setup_shop_log_file()
  {
    interfaces.new_interface( $sym0$PROCESS_LOG, NIL, NIL, $list1 );
    interfaces.new_interface( $sym2$HTML_PROCESS_LOG, $sym0$PROCESS_LOG, $list3, $list4 );
    classes.subloop_new_class( $sym5$SHOP_LOG, $sym6$OBJECT, $list7, NIL, $list8 );
    classes.class_set_implements_slot_listeners( $sym5$SHOP_LOG, NIL );
    classes.subloop_note_class_initialization_function( $sym5$SHOP_LOG, $sym14$SUBLOOP_RESERVED_INITIALIZE_SHOP_LOG_CLASS );
    classes.subloop_note_instance_initialization_function( $sym5$SHOP_LOG, $sym17$SUBLOOP_RESERVED_INITIALIZE_SHOP_LOG_INSTANCE );
    subloop_reserved_initialize_shop_log_class( $sym5$SHOP_LOG );
    methods.methods_incorporate_instance_method( $sym18$INITIALIZE, $sym5$SHOP_LOG, $list19, NIL, $list20 );
    methods.subloop_register_instance_method( $sym5$SHOP_LOG, $sym18$INITIALIZE, $sym22$SHOP_LOG_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym23$ADD_TO_LOG, $sym5$SHOP_LOG, $list24, $list25, $list26 );
    methods.subloop_register_instance_method( $sym5$SHOP_LOG, $sym23$ADD_TO_LOG, $sym28$SHOP_LOG_ADD_TO_LOG_METHOD );
    methods.methods_incorporate_instance_method( $sym29$LOG_NEWLINE, $sym5$SHOP_LOG, $list30, NIL, $list31 );
    methods.subloop_register_instance_method( $sym5$SHOP_LOG, $sym29$LOG_NEWLINE, $sym33$SHOP_LOG_LOG_NEWLINE_METHOD );
    methods.methods_incorporate_instance_method( $sym34$LOG_ENTRY, $sym5$SHOP_LOG, $list30, $list25, $list35 );
    methods.subloop_register_instance_method( $sym5$SHOP_LOG, $sym34$LOG_ENTRY, $sym36$SHOP_LOG_LOG_ENTRY_METHOD );
    methods.methods_incorporate_instance_method( $sym37$LOG_PREFORMATTED, $sym5$SHOP_LOG, $list30, $list25, $list38 );
    methods.subloop_register_instance_method( $sym5$SHOP_LOG, $sym37$LOG_PREFORMATTED, $sym40$SHOP_LOG_LOG_PREFORMATTED_METHOD );
    methods.methods_incorporate_instance_method( $sym41$LOG_FANCY_ENTRY, $sym5$SHOP_LOG, $list30, $list42, $list43 );
    methods.subloop_register_instance_method( $sym5$SHOP_LOG, $sym41$LOG_FANCY_ENTRY, $sym45$SHOP_LOG_LOG_FANCY_ENTRY_METHOD );
    methods.methods_incorporate_instance_method( $sym46$LOG_HEADING, $sym5$SHOP_LOG, $list30, $list47, $list48 );
    methods.subloop_register_instance_method( $sym5$SHOP_LOG, $sym46$LOG_HEADING, $sym50$SHOP_LOG_LOG_HEADING_METHOD );
    methods.methods_incorporate_instance_method( $sym51$LOG_PARTIAL_PLAN, $sym5$SHOP_LOG, $list30, $list47, $list52 );
    methods.subloop_register_instance_method( $sym5$SHOP_LOG, $sym51$LOG_PARTIAL_PLAN, $sym54$SHOP_LOG_LOG_PARTIAL_PLAN_METHOD );
    methods.methods_incorporate_instance_method( $sym55$COLOR_LOG_ENTRY, $sym5$SHOP_LOG, $list30, $list56, $list57 );
    methods.subloop_register_instance_method( $sym5$SHOP_LOG, $sym55$COLOR_LOG_ENTRY, $sym59$SHOP_LOG_COLOR_LOG_ENTRY_METHOD );
    methods.methods_incorporate_instance_method( $sym60$WARNING, $sym5$SHOP_LOG, $list30, $list25, $list61 );
    methods.subloop_register_instance_method( $sym5$SHOP_LOG, $sym60$WARNING, $sym63$SHOP_LOG_WARNING_METHOD );
    methods.methods_incorporate_instance_method( $sym64$SUCCESS, $sym5$SHOP_LOG, $list30, $list25, $list65 );
    methods.subloop_register_instance_method( $sym5$SHOP_LOG, $sym64$SUCCESS, $sym67$SHOP_LOG_SUCCESS_METHOD );
    methods.methods_incorporate_instance_method( $sym68$NEW_SECTION, $sym5$SHOP_LOG, $list30, NIL, $list69 );
    methods.subloop_register_instance_method( $sym5$SHOP_LOG, $sym68$NEW_SECTION, $sym71$SHOP_LOG_NEW_SECTION_METHOD );
    methods.methods_incorporate_instance_method( $sym72$LOG_PLANNER_RULE, $sym5$SHOP_LOG, $list30, $list73, $list74 );
    methods.subloop_register_instance_method( $sym5$SHOP_LOG, $sym72$LOG_PLANNER_RULE, $sym76$SHOP_LOG_LOG_PLANNER_RULE_METHOD );
    methods.methods_incorporate_instance_method( $sym77$LOG_INFERENCE, $sym5$SHOP_LOG, $list30, $list78, $list79 );
    methods.subloop_register_instance_method( $sym5$SHOP_LOG, $sym77$LOG_INFERENCE, $sym82$SHOP_LOG_LOG_INFERENCE_METHOD );
    methods.methods_incorporate_instance_method( $sym83$LOG_MULTIBINDING, $sym5$SHOP_LOG, $list30, $list84, $list85 );
    methods.subloop_register_instance_method( $sym5$SHOP_LOG, $sym83$LOG_MULTIBINDING, $sym87$SHOP_LOG_LOG_MULTIBINDING_METHOD );
    methods.methods_incorporate_instance_method( $sym88$PLANNER_RULE_LINK, $sym5$SHOP_LOG, $list24, $list47, $list89 );
    methods.subloop_register_instance_method( $sym5$SHOP_LOG, $sym88$PLANNER_RULE_LINK, $sym90$SHOP_LOG_PLANNER_RULE_LINK_METHOD );
    methods.methods_incorporate_instance_method( $sym91$DISPLAY_FANCY_ENTRY, $sym5$SHOP_LOG, $list24, $list47, $list92 );
    methods.subloop_register_instance_method( $sym5$SHOP_LOG, $sym91$DISPLAY_FANCY_ENTRY, $sym95$SHOP_LOG_DISPLAY_FANCY_ENTRY_METHOD );
    methods.methods_incorporate_instance_method( $sym96$DISPLAY_MULTIBINDING, $sym5$SHOP_LOG, $list24, $list47, $list97 );
    methods.subloop_register_instance_method( $sym5$SHOP_LOG, $sym96$DISPLAY_MULTIBINDING, $sym104$SHOP_LOG_DISPLAY_MULTIBINDING_METHOD );
    methods.methods_incorporate_instance_method( $sym105$INFERENCE_LINK, $sym5$SHOP_LOG, $list24, $list106, $list107 );
    methods.subloop_register_instance_method( $sym5$SHOP_LOG, $sym105$INFERENCE_LINK, $sym111$SHOP_LOG_INFERENCE_LINK_METHOD );
    methods.methods_incorporate_instance_method( $sym112$DISPLAY_COLOR_ENTRY, $sym5$SHOP_LOG, $list24, $list106, $list113 );
    methods.subloop_register_instance_method( $sym5$SHOP_LOG, $sym112$DISPLAY_COLOR_ENTRY, $sym115$SHOP_LOG_DISPLAY_COLOR_ENTRY_METHOD );
    methods.methods_incorporate_instance_method( $sym116$DISPLAY_PARTIAL_PLAN, $sym5$SHOP_LOG, $list24, $list106, $list117 );
    methods.subloop_register_instance_method( $sym5$SHOP_LOG, $sym116$DISPLAY_PARTIAL_PLAN, $sym118$SHOP_LOG_DISPLAY_PARTIAL_PLAN_METHOD );
    methods.methods_incorporate_instance_method( $sym119$DISPLAY_SWITCHABLE_PARTIAL_PLAN, $sym5$SHOP_LOG, $list24, $list106, $list120 );
    methods.subloop_register_instance_method( $sym5$SHOP_LOG, $sym119$DISPLAY_SWITCHABLE_PARTIAL_PLAN, $sym128$SHOP_LOG_DISPLAY_SWITCHABLE_PARTIAL_PLAN_METHOD );
    methods.methods_incorporate_instance_method( $sym130$DISPLAY_HTML_LOG, $sym5$SHOP_LOG, $list30, NIL, $list131 );
    methods.subloop_register_instance_method( $sym5$SHOP_LOG, $sym130$DISPLAY_HTML_LOG, $sym134$SHOP_LOG_DISPLAY_HTML_LOG_METHOD );
    methods.methods_incorporate_instance_method( $sym135$SET_VERBOSITY, $sym5$SHOP_LOG, $list30, $list136, $list137 );
    methods.subloop_register_instance_method( $sym5$SHOP_LOG, $sym135$SET_VERBOSITY, $sym141$SHOP_LOG_SET_VERBOSITY_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_shop_log_file();
  }

  @Override
  public void initializeVariables()
  {
    init_shop_log_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_shop_log_file();
  }
  static
  {
    me = new shop_log();
    $shop_log_entry_map$ = null;
    $sym0$PROCESS_LOG = makeSymbol( "PROCESS-LOG" );
    $list1 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "LOG-ENTRY" ), ConsesLow.list( makeSymbol( "ITEM" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
        "DEF-INSTANCE-METHOD" ), makeSymbol( "WARNING" ), ConsesLow.list( makeSymbol( "ITEM" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SUCCESS" ), ConsesLow.list(
            makeSymbol( "ITEM" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "NEW-SECTION" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                "DEF-INSTANCE-METHOD" ), makeSymbol( "DISPLAY-HTML-LOG" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym2$HTML_PROCESS_LOG = makeSymbol( "HTML-PROCESS-LOG" );
    $list3 = ConsesLow.list( makeKeyword( "EXTENDS" ), makeSymbol( "PROCESS-LOG" ) );
    $list4 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "COLOR-LOG-ENTRY" ), ConsesLow.list( makeSymbol( "ITEM" ), makeSymbol( "COLOR" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list(
        makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "LOG-FANCY-ENTRY" ), ConsesLow.list( makeSymbol( "ITEM" ), makeSymbol( "MOD-LIST" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
            "DEF-INSTANCE-METHOD" ), makeSymbol( "LOG-HEADING" ), ConsesLow.list( makeSymbol( "ENTRY" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "LOG-PREFORMATTED" ),
                ConsesLow.list( makeSymbol( "ENTRY" ) ), makeKeyword( "PUBLIC" ) ) );
    $sym5$SHOP_LOG = makeSymbol( "SHOP-LOG" );
    $sym6$OBJECT = makeSymbol( "OBJECT" );
    $list7 = ConsesLow.list( makeSymbol( "HTML-PROCESS-LOG" ) );
    $list8 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "LOG" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "STREAM" ), makeKeyword( "INSTANCE" ),
        makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "VERBOSE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "ISG" ), makeKeyword( "INSTANCE" ), makeKeyword(
            "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ADD-TO-LOG" ), NIL, makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                "SET-VERBOSITY" ), ConsesLow.list( makeSymbol( "NEW-VERBOSE" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DISPLAY-FANCY-ENTRY" ), ConsesLow.list(
                    makeSymbol( "LOG-ENTRY" ) ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DISPLAY-COLOR-ENTRY" ), ConsesLow.list( makeSymbol( "LOG-ENTRY" ) ),
                        makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INFERENCE-LINK" ), ConsesLow.list( makeSymbol( "LOG-ENTRY" ) ), makeKeyword( "PRIVATE" ) ), ConsesLow
                            .list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "METHOD-LINK" ), ConsesLow.list( makeSymbol( "LOG-ENTRY" ) ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol(
                                "DEF-INSTANCE-METHOD" ), makeSymbol( "DISPLAY-PARTIAL-PLAN" ), ConsesLow.list( makeSymbol( "LOG-ENTRY" ) ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                                    makeSymbol( "DISPLAY-SWITCHABLE-PARTIAL-PLAN" ), ConsesLow.list( makeSymbol( "LOG-ENTRY" ) ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                                        makeSymbol( "LOG-PLANNER-RULE" ), ConsesLow.list( makeSymbol( "RULE" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                                            "LOG-INFERENCE" ), ConsesLow.list( makeSymbol( "BINDINGS" ), makeSymbol( "RESULTS" ), makeSymbol( "HALT-STATUS" ), makeSymbol( "INFERENCE" ) ), makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "LOG-PARTIAL-PLAN" ), ConsesLow.list( makeSymbol( "ENTRY" ) ), makeKeyword( "PUBLIC" ) )
    } );
    $sym9$ISG = makeSymbol( "ISG" );
    $sym10$VERBOSE = makeSymbol( "VERBOSE" );
    $sym11$STREAM = makeSymbol( "STREAM" );
    $sym12$LOG = makeSymbol( "LOG" );
    $sym13$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym14$SUBLOOP_RESERVED_INITIALIZE_SHOP_LOG_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHOP-LOG-CLASS" );
    $sym15$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym16$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym17$SUBLOOP_RESERVED_INITIALIZE_SHOP_LOG_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHOP-LOG-INSTANCE" );
    $sym18$INITIALIZE = makeSymbol( "INITIALIZE" );
    $list19 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list20 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "VERBOSE" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "CSETQ" ),
        makeSymbol( "STREAM" ), T ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LOG" ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ISG" ), ConsesLow.list( makeSymbol(
            "NEW-INTEGER-SEQUENCE-GENERATOR" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym21$OUTER_CATCH_FOR_SHOP_LOG_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-LOG-METHOD" );
    $sym22$SHOP_LOG_INITIALIZE_METHOD = makeSymbol( "SHOP-LOG-INITIALIZE-METHOD" );
    $sym23$ADD_TO_LOG = makeSymbol( "ADD-TO-LOG" );
    $list24 = ConsesLow.list( makeKeyword( "PRIVATE" ) );
    $list25 = ConsesLow.list( makeSymbol( "ITEM" ) );
    $list26 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LOG" ), ConsesLow.list( makeSymbol( "CONS" ), makeSymbol( "ITEM" ), makeSymbol( "LOG" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ),
        ConsesLow.list( makeSymbol( "STRINGP" ), makeSymbol( "ITEM" ) ), ConsesLow.list( makeSymbol( "PRINC" ), makeSymbol( "ITEM" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "ITEM" ) ) );
    $sym27$OUTER_CATCH_FOR_SHOP_LOG_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-LOG-METHOD" );
    $sym28$SHOP_LOG_ADD_TO_LOG_METHOD = makeSymbol( "SHOP-LOG-ADD-TO-LOG-METHOD" );
    $sym29$LOG_NEWLINE = makeSymbol( "LOG-NEWLINE" );
    $list30 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list31 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "ADD-TO-LOG" ), makeSymbol( "SELF" ), makeKeyword( "NEWLINE" ) ) ) );
    $kw32$NEWLINE = makeKeyword( "NEWLINE" );
    $sym33$SHOP_LOG_LOG_NEWLINE_METHOD = makeSymbol( "SHOP-LOG-LOG-NEWLINE-METHOD" );
    $sym34$LOG_ENTRY = makeSymbol( "LOG-ENTRY" );
    $list35 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "ADD-TO-LOG" ), makeSymbol( "SELF" ), makeSymbol( "ITEM" ) ) ) );
    $sym36$SHOP_LOG_LOG_ENTRY_METHOD = makeSymbol( "SHOP-LOG-LOG-ENTRY-METHOD" );
    $sym37$LOG_PREFORMATTED = makeSymbol( "LOG-PREFORMATTED" );
    $list38 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "ADD-TO-LOG" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "CONS" ), makeKeyword( "PRE" ), makeSymbol(
        "ITEM" ) ) ) ) );
    $kw39$PRE = makeKeyword( "PRE" );
    $sym40$SHOP_LOG_LOG_PREFORMATTED_METHOD = makeSymbol( "SHOP-LOG-LOG-PREFORMATTED-METHOD" );
    $sym41$LOG_FANCY_ENTRY = makeSymbol( "LOG-FANCY-ENTRY" );
    $list42 = ConsesLow.list( makeSymbol( "ENTRY" ), makeSymbol( "MOD-LIST" ) );
    $list43 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "ADD-TO-LOG" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "LIST" ), makeKeyword( "FANCY" ), makeSymbol( "ENTRY" ),
        makeSymbol( "MOD-LIST" ) ) ) ) );
    $kw44$FANCY = makeKeyword( "FANCY" );
    $sym45$SHOP_LOG_LOG_FANCY_ENTRY_METHOD = makeSymbol( "SHOP-LOG-LOG-FANCY-ENTRY-METHOD" );
    $sym46$LOG_HEADING = makeSymbol( "LOG-HEADING" );
    $list47 = ConsesLow.list( makeSymbol( "ENTRY" ) );
    $list48 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "ADD-TO-LOG" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "LIST" ), makeKeyword( "HEADING" ), makeSymbol(
        "ENTRY" ) ) ) ) );
    $kw49$HEADING = makeKeyword( "HEADING" );
    $sym50$SHOP_LOG_LOG_HEADING_METHOD = makeSymbol( "SHOP-LOG-LOG-HEADING-METHOD" );
    $sym51$LOG_PARTIAL_PLAN = makeSymbol( "LOG-PARTIAL-PLAN" );
    $list52 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "ADD-TO-LOG" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "LIST" ), makeKeyword( "PARTIAL-PLAN" ), makeSymbol(
        "ENTRY" ) ) ) ) );
    $kw53$PARTIAL_PLAN = makeKeyword( "PARTIAL-PLAN" );
    $sym54$SHOP_LOG_LOG_PARTIAL_PLAN_METHOD = makeSymbol( "SHOP-LOG-LOG-PARTIAL-PLAN-METHOD" );
    $sym55$COLOR_LOG_ENTRY = makeSymbol( "COLOR-LOG-ENTRY" );
    $list56 = ConsesLow.list( makeSymbol( "ITEM" ), makeSymbol( "COLOR" ) );
    $list57 = ConsesLow.list( makeString( "Log ITEM so it shows in HTML in COLOR." ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "ADD-TO-LOG" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
        "LIST" ), makeKeyword( "COLOR" ), makeSymbol( "COLOR" ), makeSymbol( "ITEM" ) ) ) ) );
    $kw58$COLOR = makeKeyword( "COLOR" );
    $sym59$SHOP_LOG_COLOR_LOG_ENTRY_METHOD = makeSymbol( "SHOP-LOG-COLOR-LOG-ENTRY-METHOD" );
    $sym60$WARNING = makeSymbol( "WARNING" );
    $list61 = ConsesLow.list( makeString( "Log item in a warning color (red)" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "COLOR-LOG-ENTRY" ), makeSymbol( "SELF" ), makeSymbol( "ITEM" ),
        makeKeyword( "RED" ) ) ) );
    $kw62$RED = makeKeyword( "RED" );
    $sym63$SHOP_LOG_WARNING_METHOD = makeSymbol( "SHOP-LOG-WARNING-METHOD" );
    $sym64$SUCCESS = makeSymbol( "SUCCESS" );
    $list65 = ConsesLow.list( makeString( "Log item in a success color (green)" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "COLOR-LOG-ENTRY" ), makeSymbol( "SELF" ), makeSymbol( "ITEM" ),
        makeKeyword( "DARK-GREEN" ) ) ) );
    $kw66$DARK_GREEN = makeKeyword( "DARK-GREEN" );
    $sym67$SHOP_LOG_SUCCESS_METHOD = makeSymbol( "SHOP-LOG-SUCCESS-METHOD" );
    $sym68$NEW_SECTION = makeSymbol( "NEW-SECTION" );
    $list69 = ConsesLow.list( makeString( "Signals a horizontal rule in the log output" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "ADD-TO-LOG" ), makeSymbol( "SELF" ), makeKeyword( "HR" ) ) ) );
    $kw70$HR = makeKeyword( "HR" );
    $sym71$SHOP_LOG_NEW_SECTION_METHOD = makeSymbol( "SHOP-LOG-NEW-SECTION-METHOD" );
    $sym72$LOG_PLANNER_RULE = makeSymbol( "LOG-PLANNER-RULE" );
    $list73 = ConsesLow.list( makeSymbol( "RULE" ) );
    $list74 = ConsesLow.list( makeString( "@param RULE shop-basic-planner-rule-p" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "ADD-TO-LOG" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
        "LIST" ), makeKeyword( "RULE" ), makeSymbol( "RULE" ) ) ) ) );
    $kw75$RULE = makeKeyword( "RULE" );
    $sym76$SHOP_LOG_LOG_PLANNER_RULE_METHOD = makeSymbol( "SHOP-LOG-LOG-PLANNER-RULE-METHOD" );
    $sym77$LOG_INFERENCE = makeSymbol( "LOG-INFERENCE" );
    $list78 = ConsesLow.list( makeSymbol( "BINDINGS" ), makeSymbol( "HALT-REASON" ), makeSymbol( "INFERENCE" ) );
    $list79 = ConsesLow.list( makeString( "@param BINDINGS listp\n   @param INFERENCE inference-p" ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "INFERENCE" ), makeSymbol( "INFERENCE-P" ) ), ConsesLow.list(
        makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "ADD-TO-LOG" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "LIST" ), makeKeyword( "INFERENCE" ), makeSymbol( "BINDINGS" ), makeSymbol( "HALT-REASON" ),
            makeSymbol( "INFERENCE" ) ) ) ) );
    $sym80$INFERENCE_P = makeSymbol( "INFERENCE-P" );
    $kw81$INFERENCE = makeKeyword( "INFERENCE" );
    $sym82$SHOP_LOG_LOG_INFERENCE_METHOD = makeSymbol( "SHOP-LOG-LOG-INFERENCE-METHOD" );
    $sym83$LOG_MULTIBINDING = makeSymbol( "LOG-MULTIBINDING" );
    $list84 = ConsesLow.list( makeSymbol( "MBIND" ) );
    $list85 = ConsesLow.list( makeString( "@param RULE multibinding-p" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "ADD-TO-LOG" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "LIST" ),
        makeKeyword( "MBIND" ), makeSymbol( "MBIND" ) ) ) ) );
    $kw86$MBIND = makeKeyword( "MBIND" );
    $sym87$SHOP_LOG_LOG_MULTIBINDING_METHOD = makeSymbol( "SHOP-LOG-LOG-MULTIBINDING-METHOD" );
    $sym88$PLANNER_RULE_LINK = makeSymbol( "PLANNER-RULE-LINK" );
    $list89 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "RULE" ), ConsesLow.list( makeSymbol( "SECOND" ), makeSymbol( "ENTRY" ) ) ), ConsesLow.list( makeSymbol(
        "ASS" ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "ASSERTIONS" ), makeSymbol( "SHOP-BASIC-PLANNER-RULE" ) ), makeSymbol( "RULE" ) ) ) ) ),
        ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "ASSERTION-P" ), makeSymbol( "ASS" ) ), ConsesLow.list( makeSymbol( "CB-SHOW-ASSERTION-READABLY" ), makeSymbol( "ASS" ) ) ), ConsesLow.list(
            makeSymbol( "RET" ), NIL ) ) );
    $sym90$SHOP_LOG_PLANNER_RULE_LINK_METHOD = makeSymbol( "SHOP-LOG-PLANNER-RULE-LINK-METHOD" );
    $sym91$DISPLAY_FANCY_ENTRY = makeSymbol( "DISPLAY-FANCY-ENTRY" );
    $list92 = ConsesLow.list( makeString( "only :bold supported for now" ), ConsesLow.list( makeSymbol( "CDESTRUCTURING-BIND" ), ConsesLow.list( makeSymbol( "ITEM" ), makeSymbol( "MOD-LIST" ) ), ConsesLow.list(
        makeSymbol( "REST" ), makeSymbol( "ENTRY" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "MEMBER?" ), makeKeyword( "BOLD" ), makeSymbol( "MOD-LIST" ) ), ConsesLow.list( makeSymbol(
            "HTML-STRONG" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeSymbol( "ITEM" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $list93 = ConsesLow.list( makeSymbol( "ITEM" ), makeSymbol( "MOD-LIST" ) );
    $kw94$BOLD = makeKeyword( "BOLD" );
    $sym95$SHOP_LOG_DISPLAY_FANCY_ENTRY_METHOD = makeSymbol( "SHOP-LOG-DISPLAY-FANCY-ENTRY-METHOD" );
    $sym96$DISPLAY_MULTIBINDING = makeSymbol( "DISPLAY-MULTIBINDING" );
    $list97 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "MB" ), ConsesLow.list( makeSymbol( "SECOND" ), makeSymbol( "ENTRY" ) ) ), ConsesLow.list( makeSymbol(
        "ALIST" ), NIL ) ), ConsesLow.list( makeSymbol( "DO-MBIND" ), ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "VALUES" ), makeSymbol( "MB" ) ), ConsesLow.list( makeSymbol( "ALIST-ENTER" ), makeSymbol( "ALIST" ),
            makeSymbol( "VAR" ), makeSymbol( "VALUES" ) ) ), ConsesLow.list( makeSymbol( "SORT" ), makeSymbol( "ALIST" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "STRING<" ) ), ConsesLow.list( makeSymbol(
                "QUOTE" ), makeSymbol( "SHOP-VAR-NAME" ) ) ), ConsesLow.list( makeSymbol( "DO-ALIST" ), ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "VALUES" ), makeSymbol( "ALIST" ) ), ConsesLow.list( makeSymbol(
                    "HTML-FORMAT" ), makeString( "~s -->" ), makeSymbol( "VAR" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CUR-VAL" ), makeSymbol( "VALUES" ) ), ConsesLow.list( makeSymbol(
                        "HTML-FORMAT" ), makeString( " ~s" ), makeSymbol( "CUR-VAL" ) ) ), ConsesLow.list( makeSymbol( "HTML-NEWLINE" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) );
    $sym98$FIRST = makeSymbol( "FIRST" );
    $sym99$STRING_ = makeSymbol( "STRING<" );
    $sym100$SHOP_VAR_NAME = makeSymbol( "SHOP-VAR-NAME" );
    $list101 = ConsesLow.cons( makeSymbol( "VAR" ), makeSymbol( "VALUES" ) );
    $str102$_s____ = makeString( "~s -->" );
    $str103$__s = makeString( " ~s" );
    $sym104$SHOP_LOG_DISPLAY_MULTIBINDING_METHOD = makeSymbol( "SHOP-LOG-DISPLAY-MULTIBINDING-METHOD" );
    $sym105$INFERENCE_LINK = makeSymbol( "INFERENCE-LINK" );
    $list106 = ConsesLow.list( makeSymbol( "LOG-ENTRY" ) );
    $list107 = ConsesLow.list( ConsesLow.list( makeSymbol( "CDESTRUCTURING-BIND" ), ConsesLow.list( makeSymbol( "BINDINGS" ), makeSymbol( "HALT-REASON" ), makeSymbol( "INFERENCE" ) ), ConsesLow.list( makeSymbol(
        "REST" ), makeSymbol( "LOG-ENTRY" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NUM-BINDINGS" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "BINDINGS" ) ) ),
            ConsesLow.list( makeSymbol( "INFERENCE-NAME" ), makeString( "[Examine Inference]" ) ) ), ConsesLow.list( makeSymbol( "HTML-NEWLINE" ), TWO_INTEGER ), ConsesLow.list( makeSymbol( "HTML-FORMAT" ), makeString(
                "# returned bindings: ~s" ), makeSymbol( "NUM-BINDINGS" ) ), ConsesLow.list( makeSymbol( "HTML-INDENT" ), TWO_INTEGER ), ConsesLow.list( makeSymbol( "HTML-EM" ), ConsesLow.list( makeSymbol(
                    "HTML-FORMAT" ), makeString( "~s" ), makeSymbol( "HALT-REASON" ) ) ), ConsesLow.list( makeSymbol( "PUNLESS-FEATURE" ), ConsesLow.list( makeKeyword( "OR" ), makeKeyword( "CYC-OPENCYC" ), makeKeyword(
                        "CYC-RESEARCHCYC" ) ), ConsesLow.list( makeSymbol( "HTML-INDENT" ), TWO_INTEGER ), ConsesLow.list( makeSymbol( "CB-LINK" ), makeKeyword( "INFERENCE" ), makeSymbol( "INFERENCE" ), NIL, makeSymbol(
                            "INFERENCE-NAME" ) ) ), ConsesLow.list( makeSymbol( "HTML-NEWLINE" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) );
    $str108$_Examine_Inference_ = makeString( "[Examine Inference]" );
    $str109$__returned_bindings___s = makeString( "# returned bindings: ~s" );
    $str110$_s = makeString( "~s" );
    $sym111$SHOP_LOG_INFERENCE_LINK_METHOD = makeSymbol( "SHOP-LOG-INFERENCE-LINK-METHOD" );
    $sym112$DISPLAY_COLOR_ENTRY = makeSymbol( "DISPLAY-COLOR-ENTRY" );
    $list113 = ConsesLow.list( ConsesLow.list( makeSymbol( "CDESTRUCTURING-BIND" ), ConsesLow.list( makeSymbol( "COLOR" ), makeSymbol( "ENTRY" ) ), ConsesLow.list( makeSymbol( "REST" ), makeSymbol( "LOG-ENTRY" ) ),
        ConsesLow.list( makeSymbol( "HTML-FONT-COLOR" ), ConsesLow.list( makeSymbol( "COLOR" ) ), ConsesLow.list( makeSymbol( "HTML-PRE" ), ConsesLow.list( makeSymbol( "CB-FORM" ), makeSymbol( "ENTRY" ) ) ) ) ),
        ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $list114 = ConsesLow.list( makeSymbol( "COLOR" ), makeSymbol( "ENTRY" ) );
    $sym115$SHOP_LOG_DISPLAY_COLOR_ENTRY_METHOD = makeSymbol( "SHOP-LOG-DISPLAY-COLOR-ENTRY-METHOD" );
    $sym116$DISPLAY_PARTIAL_PLAN = makeSymbol( "DISPLAY-PARTIAL-PLAN" );
    $list117 = ConsesLow.list( makeString( "Display partial plan cleanly" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PARTIAL-PLAN" ), ConsesLow.list( makeSymbol( "SECOND" ),
        makeSymbol( "LOG-ENTRY" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "STEP" ), makeSymbol( "PARTIAL-PLAN" ) ), ConsesLow.list( makeSymbol( "CB-FORM" ), makeSymbol( "STEP" ) ),
            ConsesLow.list( makeSymbol( "HTML-NEWLINE" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym118$SHOP_LOG_DISPLAY_PARTIAL_PLAN_METHOD = makeSymbol( "SHOP-LOG-DISPLAY-PARTIAL-PLAN-METHOD" );
    $sym119$DISPLAY_SWITCHABLE_PARTIAL_PLAN = makeSymbol( "DISPLAY-SWITCHABLE-PARTIAL-PLAN" );
    $list120 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ID" ), ConsesLow.list( makeSymbol( "INTEGER-SEQUENCE-GENERATOR-NEXT" ), makeSymbol( "ISG" ) ) ), ConsesLow
        .list( makeSymbol( "OBJECT-ID" ), ConsesLow.list( makeSymbol( "CCONCATENATE" ), makeString( "partial-plan-" ), ConsesLow.list( makeSymbol( "WRITE-TO-STRING" ), makeSymbol( "ID" ) ) ) ) ), ConsesLow.list(
            makeSymbol( "HTML-STRONG" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString( "Partial Plan" ) ) ), ConsesLow.list( makeSymbol( "HTML-INDENT" ) ), ConsesLow.list( makeSymbol(
                "DHTML-SWITCH-VISIBILITY-LINKS" ), makeSymbol( "OBJECT-ID" ), makeString( "[Show]" ), makeString( "[Hide]" ) ), ConsesLow.list( makeSymbol( "HTML-NEWLINE" ) ), ConsesLow.list( makeSymbol(
                    "DHTML-POTENTIALLY-SHOW-SWITCHED" ), ConsesLow.list( makeSymbol( "OBJECT-ID" ), makeKeyword( "INITIAL-VISIBILITY" ), makeKeyword( "INVISIBLE" ), makeKeyword( "FLOW-TYPE" ), makeKeyword(
                        "PARAGRAPH" ) ), ConsesLow.list( makeSymbol( "DISPLAY-PARTIAL-PLAN" ), makeSymbol( "SELF" ), makeSymbol( "LOG-ENTRY" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym121$OUTER_CATCH_FOR_SHOP_LOG_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-LOG-METHOD" );
    $str122$partial_plan_ = makeString( "partial-plan-" );
    $str123$Partial_Plan = makeString( "Partial Plan" );
    $str124$_Show_ = makeString( "[Show]" );
    $str125$_Hide_ = makeString( "[Hide]" );
    $kw126$INVISIBLE = makeKeyword( "INVISIBLE" );
    $kw127$PARAGRAPH = makeKeyword( "PARAGRAPH" );
    $sym128$SHOP_LOG_DISPLAY_SWITCHABLE_PARTIAL_PLAN_METHOD = makeSymbol( "SHOP-LOG-DISPLAY-SWITCHABLE-PARTIAL-PLAN-METHOD" );
    $list129 = ConsesLow.list( ConsesLow.list( makeKeyword( "COLOR" ), makeSymbol( "DISPLAY-COLOR-ENTRY" ) ), ConsesLow.list( makeKeyword( "RULE" ), makeSymbol( "PLANNER-RULE-LINK" ) ), ConsesLow.list( makeKeyword(
        "INFERENCE" ), makeSymbol( "INFERENCE-LINK" ) ), ConsesLow.list( makeKeyword( "MBIND" ), makeSymbol( "DISPLAY-MULTIBINDING" ) ), ConsesLow.list( makeKeyword( "FANCY" ), makeSymbol( "DISPLAY-FANCY-ENTRY" ) ),
        ConsesLow.list( makeKeyword( "PARTIAL-PLAN" ), makeSymbol( "DISPLAY-SWITCHABLE-PARTIAL-PLAN" ) ) );
    $sym130$DISPLAY_HTML_LOG = makeSymbol( "DISPLAY-HTML-LOG" );
    $list131 = ConsesLow.list( ConsesLow.list( makeSymbol( "INTEGER-SEQUENCE-GENERATOR-RESET" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
        "ISG" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ITEM" ), ConsesLow.list( makeSymbol( "REVERSE" ), makeSymbol( "LOG" ) ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow
            .list( ConsesLow.list( makeSymbol( "KEYWORDP" ), makeSymbol( "ITEM" ) ), ConsesLow.list( makeSymbol( "PCASE" ), makeSymbol( "ITEM" ), ConsesLow.list( makeKeyword( "HR" ), ConsesLow.list( makeSymbol(
                "HTML-HR" ) ) ), ConsesLow.list( makeKeyword( "NEWLINE" ), ConsesLow.list( makeSymbol( "HTML-NEWLINE" ) ) ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "LISTP" ), makeSymbol( "ITEM" ) ), ConsesLow
                    .list( makeSymbol( "PCASE" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "ITEM" ) ), ConsesLow.list( makeKeyword( "PRE" ), ConsesLow.list( makeSymbol( "HTML-PRE" ), ConsesLow.list( makeSymbol(
                        "CB-FORM" ), ConsesLow.list( makeSymbol( "CDR" ), makeSymbol( "ITEM" ) ) ) ) ), ConsesLow.list( makeKeyword( "HEADING" ), ConsesLow.list( makeSymbol( "HTML-HEADING" ), ConsesLow.list(
                            THREE_INTEGER ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), ConsesLow.list( makeSymbol( "SECOND" ), makeSymbol( "ITEM" ) ) ) ) ), ConsesLow.list( makeSymbol( "OTHERWISE" ), ConsesLow.list(
                                makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "METHOD" ), ConsesLow.list( makeSymbol( "SECOND" ), ConsesLow.list( makeSymbol( "ASSOC" ), ConsesLow.list( makeSymbol(
                                    "FIRST" ), makeSymbol( "ITEM" ) ), makeSymbol( "*SHOP-LOG-ENTRY-MAP*" ) ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), makeSymbol( "METHOD" ), makeSymbol(
                                        "ITEM" ) ) ) ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "STRINGP" ), makeSymbol( "ITEM" ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol(
                                            "SUBSTRING?" ), makeString( "#$" ), makeSymbol( "ITEM" ) ), ConsesLow.list( makeSymbol( "CB-FORM" ), makeSymbol( "ITEM" ) ), ConsesLow.list( makeSymbol( "HTML-PRINC" ),
                                                makeSymbol( "ITEM" ) ) ), ConsesLow.list( makeSymbol( "HTML-BR" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym132$OUTER_CATCH_FOR_SHOP_LOG_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-LOG-METHOD" );
    $str133$__ = makeString( "#$" );
    $sym134$SHOP_LOG_DISPLAY_HTML_LOG_METHOD = makeSymbol( "SHOP-LOG-DISPLAY-HTML-LOG-METHOD" );
    $sym135$SET_VERBOSITY = makeSymbol( "SET-VERBOSITY" );
    $list136 = ConsesLow.list( makeSymbol( "NEW-VERBOSE" ) );
    $list137 = ConsesLow.list( ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NUMBERP" ), makeSymbol( "NEW-VERBOSE" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
        "VERBOSE" ), makeSymbol( "NEW-VERBOSE" ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "KEYWORDP" ), makeSymbol( "NEW-VERBOSE" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "VERBOSE" ), ConsesLow
            .list( makeSymbol( "REST" ), ConsesLow.list( makeSymbol( "ASSOC" ), makeSymbol( "NEW-VERBOSE" ), makeSymbol( "*SHOP-VERBOSE-KEYS*" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol(
                "MEMBER" ) ) ) ) ) ), ConsesLow.list( T, ConsesLow.list( makeSymbol( "CERROR" ), makeString( "~s is not a permissible value for VERBOSE" ), makeSymbol( "NEW-VERBOSE" ) ) ) ), ConsesLow.list( makeSymbol(
                    "RET" ), NIL ) );
    $sym138$OUTER_CATCH_FOR_SHOP_LOG_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-LOG-METHOD" );
    $sym139$MEMBER = makeSymbol( "MEMBER" );
    $str140$_s_is_not_a_permissible_value_for = makeString( "~s is not a permissible value for VERBOSE" );
    $sym141$SHOP_LOG_SET_VERBOSITY_METHOD = makeSymbol( "SHOP-LOG-SET-VERBOSITY-METHOD" );
  }
}
/*
 * 
 * Total time: 465 ms
 * 
 */