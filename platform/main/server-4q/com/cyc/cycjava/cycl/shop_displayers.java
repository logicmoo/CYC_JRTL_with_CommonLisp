package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class shop_displayers
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.shop_displayers";
  public static final String myFingerPrint = "7dd29e1918af85dedd45f26d4bdfadf36edca3754f1329dd01fa229892027e17";
  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 843L)
  private static SubLSymbol $cb_plan_task_examiner_link_image$;
  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 947L)
  private static SubLSymbol $cb_plan_task_examiner_method_image$;
  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1057L)
  private static SubLSymbol $cb_plan_task_examiner_operator_image$;
  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1173L)
  private static SubLSymbol $cb_plan_task_examiner_scond_image$;
  private static final SubLSymbol $kw0$TE_LINK;
  private static final SubLString $str1$bl_sdi_gif;
  private static final SubLSymbol $kw2$TE_METHOD;
  private static final SubLString $str3$gr_sdi_gif;
  private static final SubLSymbol $kw4$TE_OPERATOR;
  private static final SubLString $str5$yl_sdi_gif;
  private static final SubLSymbol $kw6$TE_EXAMINER;
  private static final SubLString $str7$red_diam_gif;
  private static final SubLSymbol $sym8$HTML_TASK_DISPLAYER;
  private static final SubLSymbol $sym9$SHOP_INDEXED_OBJECT;
  private static final SubLList $list10;
  private static final SubLSymbol $sym11$PLAN_DISPLAYER;
  private static final SubLSymbol $sym12$TASK;
  private static final SubLSymbol $sym13$OBJECT;
  private static final SubLSymbol $sym14$INSTANCE_COUNT;
  private static final SubLSymbol $sym15$INSTANCE_INDEX;
  private static final SubLSymbol $sym16$SUBLOOP_RESERVED_INITIALIZE_HTML_TASK_DISPLAYER_CLASS;
  private static final SubLSymbol $sym17$ISOLATED_P;
  private static final SubLSymbol $sym18$INSTANCE_NUMBER;
  private static final SubLSymbol $sym19$SUBLOOP_RESERVED_INITIALIZE_HTML_TASK_DISPLAYER_INSTANCE;
  private static final SubLSymbol $sym20$HTML_PLAN_DISPLAYER;
  private static final SubLList $list21;
  private static final SubLList $list22;
  private static final SubLSymbol $sym23$DISPLAY_VARIABLE_SUBSTITUTION;
  private static final SubLSymbol $sym24$OPEN_VARIABLES;
  private static final SubLSymbol $sym25$MBINDING;
  private static final SubLSymbol $sym26$TASK_DISPLAYER_HASH_TABLE;
  private static final SubLSymbol $sym27$PLAN;
  private static final SubLSymbol $sym28$SUBLOOP_RESERVED_INITIALIZE_HTML_PLAN_DISPLAYER_CLASS;
  private static final SubLSymbol $sym29$SUBLOOP_RESERVED_INITIALIZE_HTML_PLAN_DISPLAYER_INSTANCE;
  private static final SubLSymbol $sym30$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY;
  private static final SubLSymbol $sym31$SHOP_PLAN_DISPLAYER_FACTORY;
  private static final SubLSymbol $sym32$SUBLOOP_RESERVED_INITIALIZE_CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTOR;
  private static final SubLSymbol $sym33$SUBLOOP_RESERVED_INITIALIZE_CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTOR;
  private static final SubLSymbol $sym34$CREATE_PLAN_DISPLAYER;
  private static final SubLList $list35;
  private static final SubLList $list36;
  private static final SubLList $list37;
  private static final SubLSymbol $sym38$INIT_WITH_PLAN;
  private static final SubLSymbol $sym39$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY_CREATE_PLAN_DISPLAYER_METH;
  private static final SubLSymbol $sym40$CREATE_TASK_DISPLAYER;
  private static final SubLList $list41;
  private static final SubLList $list42;
  private static final SubLSymbol $sym43$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY_CREATE_TASK_DISPLAYER_METH;
  private static final SubLSymbol $sym44$INITIALIZE;
  private static final SubLList $list45;
  private static final SubLList $list46;
  private static final SubLSymbol $sym47$HTML_TASK_DISPLAYER_INITIALIZE_METHOD;
  private static final SubLSymbol $sym48$INIT_WITH_TASK;
  private static final SubLList $list49;
  private static final SubLList $list50;
  private static final SubLSymbol $sym51$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD;
  private static final SubLSymbol $sym52$HTML_TASK_DISPLAYER_INIT_WITH_TASK_METHOD;
  private static final SubLSymbol $sym53$FIND_INSTANCE_BY_ID_STRING;
  private static final SubLList $list54;
  private static final SubLList $list55;
  private static final SubLSymbol $sym56$HTML_TASK_DISPLAYER_FIND_INSTANCE_BY_ID_STRING_METHOD;
  private static final SubLSymbol $sym57$TASK_EXAMINER_LINK_IMAGE;
  private static final SubLList $list58;
  private static final SubLSymbol $sym59$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD;
  private static final SubLSymbol $sym60$PLANNER_RULE;
  private static final SubLSymbol $sym61$HTML_TASK_DISPLAYER_TASK_EXAMINER_LINK_IMAGE_METHOD;
  private static final SubLSymbol $sym62$CB_TASK_EXAMINER_LINK;
  private static final SubLList $list63;
  private static final SubLSymbol $sym64$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD;
  private static final SubLString $str65$cg_plan_task_examiner_;
  private static final SubLSymbol $kw66$TOP;
  private static final SubLSymbol $sym67$HTML_TASK_DISPLAYER_CB_TASK_EXAMINER_LINK_METHOD;
  private static final SubLSymbol $sym68$HTML_FORM;
  private static final SubLList $list69;
  private static final SubLList $list70;
  private static final SubLSymbol $sym71$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD;
  private static final SubLSymbol $kw72$TASK_EXAMINER_LINKS;
  private static final SubLSymbol $sym73$PREPARE_TASK_FOR_DISPLAY;
  private static final SubLSymbol $sym74$FORMULA;
  private static final SubLSymbol $kw75$CYCL;
  private static final SubLSymbol $sym76$HTML_TASK_DISPLAYER_HTML_FORM_METHOD;
  private static final SubLList $list77;
  private static final SubLSymbol $sym78$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD;
  private static final SubLSymbol $sym79$HTML_TASK_DISPLAYER_FORMULA_METHOD;
  private static final SubLSymbol $sym80$BINDINGS;
  private static final SubLList $list81;
  private static final SubLSymbol $sym82$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD;
  private static final SubLSymbol $sym83$HTML_TASK_DISPLAYER_BINDINGS_METHOD;
  private static final SubLSymbol $sym84$DISPLAY_BINDINGS;
  private static final SubLList $list85;
  private static final SubLList $list86;
  private static final SubLSymbol $sym87$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD;
  private static final SubLSymbol $sym88$VARIABLE_MANAGER;
  private static final SubLSymbol $sym89$FIRST;
  private static final SubLSymbol $sym90$RECOVER_EL;
  private static final SubLSymbol $sym91$HTML_TASK_DISPLAYER_DISPLAY_BINDINGS_METHOD;
  private static final SubLSymbol $sym92$HTML_TASK_PAGE;
  private static final SubLList $list93;
  private static final SubLSymbol $sym94$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD;
  private static final SubLString $str95$Task_Examiner;
  private static final SubLString $str96$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str97$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw98$UNINITIALIZED;
  private static final SubLSymbol $kw99$CB_CYC;
  private static final SubLSymbol $kw100$SAM_AUTOCOMPLETE_CSS;
  private static final SubLSymbol $kw101$SHA1;
  private static final SubLString $str102$yui_skin_sam;
  private static final SubLString $str103$reloadFrameButton;
  private static final SubLString $str104$button;
  private static final SubLString $str105$reload;
  private static final SubLString $str106$Refresh_Frames;
  private static final SubLString $str107$Task__;
  private static final SubLString $str108$Translation__;
  private static final SubLString $str109$Assertion__;
  private static final SubLSymbol $sym110$ASSERTIONS;
  private static final SubLString $str111$Bindings__;
  private static final SubLSymbol $sym112$HTML_TASK_DISPLAYER_HTML_TASK_PAGE_METHOD;
  private static final SubLList $list113;
  private static final SubLList $list114;
  private static final SubLSymbol $sym115$HTML_PLAN_DISPLAYER_INITIALIZE_METHOD;
  private static final SubLList $list116;
  private static final SubLList $list117;
  private static final SubLSymbol $sym118$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD;
  private static final SubLSymbol $sym119$RECOVER_EL_VARIABLE;
  private static final SubLSymbol $sym120$PRE_ORDERING;
  private static final SubLSymbol $sym121$HTML_PLAN_DISPLAYER_INIT_WITH_PLAN_METHOD;
  private static final SubLList $list122;
  private static final SubLSymbol $sym123$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD;
  private static final SubLSymbol $sym124$SIMPLE_BINDING_LIST;
  private static final SubLSymbol $sym125$HTML_PLAN_DISPLAYER_PREPARE_TASK_FOR_DISPLAY_METHOD;
  private static final SubLSymbol $sym126$HTML_HIERARCHICAL_FORM;
  private static final SubLList $list127;
  private static final SubLSymbol $sym128$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD;
  private static final SubLSymbol $sym129$POST_ORDERING;
  private static final SubLSymbol $sym130$HTML_PLAN_DISPLAYER_HTML_HIERARCHICAL_FORM_METHOD;
  private static final SubLSymbol $sym131$HTML_PRIMITIVE_FORM;
  private static final SubLList $list132;
  private static final SubLSymbol $sym133$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD;
  private static final SubLSymbol $sym134$PRIMITIVE_FORM;
  private static final SubLString $str135$__Step_;
  private static final SubLString $str136$___;
  private static final SubLSymbol $sym137$HTML_PLAN_DISPLAYER_HTML_PRIMITIVE_FORM_METHOD;
  private static final SubLSymbol $sym138$HTML_MULTIBINDING_VALUES;
  private static final SubLList $list139;
  private static final SubLList $list140;
  private static final SubLSymbol $sym141$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD;
  private static final SubLString $str142$is_one_of;
  private static final SubLString $str143$_;
  private static final SubLSymbol $sym144$HTML_PLAN_DISPLAYER_HTML_MULTIBINDING_VALUES_METHOD;
  private static final SubLSymbol $sym145$HTML_MBINDING_FORM;
  private static final SubLList $list146;
  private static final SubLSymbol $sym147$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD;
  private static final SubLString $str148$for_any_of_the_following_values__;
  private static final SubLSymbol $sym149$HTML_PLAN_DISPLAYER_HTML_MBINDING_FORM_METHOD;
  private static final SubLList $list150;
  private static final SubLSymbol $kw151$PRIMITIVE;
  private static final SubLSymbol $sym152$HTML_PLAN_DISPLAYER_HTML_FORM_METHOD;

  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1243L)
  public static SubLObject get_html_task_displayer_plan_displayer(final SubLObject html_task_displayer)
  {
    return classes.subloop_get_access_protected_instance_slot( html_task_displayer, TWO_INTEGER, $sym11$PLAN_DISPLAYER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1243L)
  public static SubLObject set_html_task_displayer_plan_displayer(final SubLObject html_task_displayer, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( html_task_displayer, value, TWO_INTEGER, $sym11$PLAN_DISPLAYER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1243L)
  public static SubLObject get_html_task_displayer_task(final SubLObject html_task_displayer)
  {
    return classes.subloop_get_access_protected_instance_slot( html_task_displayer, ONE_INTEGER, $sym12$TASK );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1243L)
  public static SubLObject set_html_task_displayer_task(final SubLObject html_task_displayer, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( html_task_displayer, value, ONE_INTEGER, $sym12$TASK );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1243L)
  public static SubLObject subloop_reserved_initialize_html_task_displayer_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym13$OBJECT, $sym14$INSTANCE_COUNT, ZERO_INTEGER );
    classes.subloop_initialize_slot( new_instance, $sym9$SHOP_INDEXED_OBJECT, $sym15$INSTANCE_INDEX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1243L)
  public static SubLObject subloop_reserved_initialize_html_task_displayer_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym13$OBJECT, $sym17$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym13$OBJECT, $sym18$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym8$HTML_TASK_DISPLAYER, $sym12$TASK, NIL );
    classes.subloop_initialize_slot( new_instance, $sym8$HTML_TASK_DISPLAYER, $sym11$PLAN_DISPLAYER, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1243L)
  public static SubLObject html_task_displayer_p(final SubLObject html_task_displayer)
  {
    return classes.subloop_instanceof_class( html_task_displayer, $sym8$HTML_TASK_DISPLAYER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1730L)
  public static SubLObject get_html_plan_displayer_display_variable_substitution(final SubLObject html_plan_displayer)
  {
    return classes.subloop_get_access_protected_instance_slot( html_plan_displayer, FIVE_INTEGER, $sym23$DISPLAY_VARIABLE_SUBSTITUTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1730L)
  public static SubLObject set_html_plan_displayer_display_variable_substitution(final SubLObject html_plan_displayer, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( html_plan_displayer, value, FIVE_INTEGER, $sym23$DISPLAY_VARIABLE_SUBSTITUTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1730L)
  public static SubLObject get_html_plan_displayer_open_variables(final SubLObject html_plan_displayer)
  {
    return classes.subloop_get_access_protected_instance_slot( html_plan_displayer, FOUR_INTEGER, $sym24$OPEN_VARIABLES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1730L)
  public static SubLObject set_html_plan_displayer_open_variables(final SubLObject html_plan_displayer, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( html_plan_displayer, value, FOUR_INTEGER, $sym24$OPEN_VARIABLES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1730L)
  public static SubLObject get_html_plan_displayer_mbinding(final SubLObject html_plan_displayer)
  {
    return classes.subloop_get_access_protected_instance_slot( html_plan_displayer, THREE_INTEGER, $sym25$MBINDING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1730L)
  public static SubLObject set_html_plan_displayer_mbinding(final SubLObject html_plan_displayer, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( html_plan_displayer, value, THREE_INTEGER, $sym25$MBINDING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1730L)
  public static SubLObject get_html_plan_displayer_task_displayer_hash_table(final SubLObject html_plan_displayer)
  {
    return classes.subloop_get_access_protected_instance_slot( html_plan_displayer, TWO_INTEGER, $sym26$TASK_DISPLAYER_HASH_TABLE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1730L)
  public static SubLObject set_html_plan_displayer_task_displayer_hash_table(final SubLObject html_plan_displayer, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( html_plan_displayer, value, TWO_INTEGER, $sym26$TASK_DISPLAYER_HASH_TABLE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1730L)
  public static SubLObject get_html_plan_displayer_plan(final SubLObject html_plan_displayer)
  {
    return classes.subloop_get_access_protected_instance_slot( html_plan_displayer, ONE_INTEGER, $sym27$PLAN );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1730L)
  public static SubLObject set_html_plan_displayer_plan(final SubLObject html_plan_displayer, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( html_plan_displayer, value, ONE_INTEGER, $sym27$PLAN );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1730L)
  public static SubLObject subloop_reserved_initialize_html_plan_displayer_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym13$OBJECT, $sym14$INSTANCE_COUNT, ZERO_INTEGER );
    classes.subloop_initialize_slot( new_instance, $sym9$SHOP_INDEXED_OBJECT, $sym15$INSTANCE_INDEX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1730L)
  public static SubLObject subloop_reserved_initialize_html_plan_displayer_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym13$OBJECT, $sym17$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym13$OBJECT, $sym18$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym20$HTML_PLAN_DISPLAYER, $sym27$PLAN, NIL );
    classes.subloop_initialize_slot( new_instance, $sym20$HTML_PLAN_DISPLAYER, $sym26$TASK_DISPLAYER_HASH_TABLE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym20$HTML_PLAN_DISPLAYER, $sym25$MBINDING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym20$HTML_PLAN_DISPLAYER, $sym24$OPEN_VARIABLES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym20$HTML_PLAN_DISPLAYER, $sym23$DISPLAY_VARIABLE_SUBSTITUTION, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1730L)
  public static SubLObject html_plan_displayer_p(final SubLObject html_plan_displayer)
  {
    return classes.subloop_instanceof_class( html_plan_displayer, $sym20$HTML_PLAN_DISPLAYER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 2629L)
  public static SubLObject subloop_reserved_initialize_cyc_development_plan_displayer_factory_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym13$OBJECT, $sym14$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 2629L)
  public static SubLObject subloop_reserved_initialize_cyc_development_plan_displayer_factory_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym13$OBJECT, $sym17$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym13$OBJECT, $sym18$INSTANCE_NUMBER, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 2629L)
  public static SubLObject cyc_development_plan_displayer_factory_p(final SubLObject cyc_development_plan_displayer_factory)
  {
    return classes.subloop_instanceof_class( cyc_development_plan_displayer_factory, $sym30$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 2955L)
  public static SubLObject cyc_development_plan_displayer_factory_create_plan_displayer_method(final SubLObject self, final SubLObject plan)
  {
    final SubLObject plan_displayer = object.object_new_method( $sym20$HTML_PLAN_DISPLAYER );
    methods.funcall_instance_method_with_2_args( plan_displayer, $sym38$INIT_WITH_PLAN, plan, self );
    return plan_displayer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 3287L)
  public static SubLObject cyc_development_plan_displayer_factory_create_task_displayer_method(final SubLObject self, final SubLObject task)
  {
    final SubLObject task_displayer = object.object_new_method( $sym8$HTML_TASK_DISPLAYER );
    html_task_displayer_init_with_task_method( task_displayer, task );
    return task_displayer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 3613L)
  public static SubLObject html_task_displayer_initialize_method(final SubLObject self)
  {
    shop_datastructures.shop_indexed_object_initialize_method( self );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 3787L)
  public static SubLObject html_task_displayer_init_with_task_method(final SubLObject self, final SubLObject new_task)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_html_task_displayer_method = NIL;
    SubLObject task = get_html_task_displayer_task( self );
    try
    {
      thread.throwStack.push( $sym51$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD );
      try
      {
        task = new_task;
        Dynamic.sublisp_throw( $sym51$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_html_task_displayer_task( self, task );
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
      catch_var_for_html_task_displayer_method = Errors.handleThrowable( ccatch_env_var, $sym51$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_html_task_displayer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 3903L)
  public static SubLObject html_task_displayer_find_instance_by_id_string_method(final SubLObject self, final SubLObject id_string)
  {
    final SubLObject id = reader.read_from_string_ignoring_errors( id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return shop_datastructures.shop_indexed_object_find_instance_method( self, id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 4171L)
  public static SubLObject html_task_displayer_task_examiner_link_image_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_html_task_displayer_method = NIL;
    final SubLObject task = get_html_task_displayer_task( self );
    try
    {
      thread.throwStack.push( $sym59$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD );
      try
      {
        final SubLObject planner_rule = methods.funcall_instance_method_with_0_args( task, $sym60$PLANNER_RULE );
        if( NIL != shop_datastructures.shop_method_p( planner_rule ) )
        {
          Dynamic.sublisp_throw( $sym59$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, $cb_plan_task_examiner_method_image$.getGlobalValue() );
        }
        else if( NIL != shop_datastructures.shop_precondition_p( planner_rule ) )
        {
          Dynamic.sublisp_throw( $sym59$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, $cb_plan_task_examiner_operator_image$.getGlobalValue() );
        }
        else if( NIL != shop_datastructures.shop_sufficiency_condition_p( planner_rule ) )
        {
          Dynamic.sublisp_throw( $sym59$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, $cb_plan_task_examiner_scond_image$.getGlobalValue() );
        }
        else
        {
          Dynamic.sublisp_throw( $sym59$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, $cb_plan_task_examiner_link_image$.getGlobalValue() );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_html_task_displayer_task( self, task );
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
      catch_var_for_html_task_displayer_method = Errors.handleThrowable( ccatch_env_var, $sym59$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_html_task_displayer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 4739L)
  public static SubLObject html_task_displayer_cb_task_examiner_link_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_html_task_displayer_method = NIL;
    final SubLObject instance_number = object.get_object_instance_number( self );
    try
    {
      thread.throwStack.push( $sym64$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD );
      try
      {
        final SubLObject id_string = PrintLow.write_to_string( instances.get_slot( self, $sym18$INSTANCE_NUMBER ), EMPTY_SUBL_OBJECT_ARRAY );
        final SubLObject href = Sequences.cconcatenate( $str65$cg_plan_task_examiner_, id_string );
        final SubLObject image = html_task_displayer_task_examiner_link_image_method( self );
        html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( href );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path( image );
          final SubLObject align = $kw66$TOP;
          final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string( image );
          final SubLObject border = ZERO_INTEGER;
          html_utilities.html_markup( html_macros.$html_image_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_image_src$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( image_src );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          if( NIL != alt )
          {
            html_utilities.html_markup( html_macros.$html_image_alt$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( alt );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          if( NIL != align )
          {
            html_utilities.html_markup( html_macros.$html_image_align$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( align ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          if( NIL != border )
          {
            html_utilities.html_markup( html_macros.$html_image_border$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( border );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$1, thread );
          }
          html_utilities.html_markup( html_macros.$html_image_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
        }
        html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
        Dynamic.sublisp_throw( $sym64$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          object.set_object_instance_number( self, instance_number );
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
      catch_var_for_html_task_displayer_method = Errors.handleThrowable( ccatch_env_var, $sym64$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_html_task_displayer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 5157L)
  public static SubLObject html_task_displayer_html_form_method(final SubLObject self, final SubLObject style_args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_html_task_displayer_method = NIL;
    final SubLObject plan_displayer = get_html_task_displayer_plan_displayer( self );
    final SubLObject task = get_html_task_displayer_task( self );
    try
    {
      thread.throwStack.push( $sym71$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD );
      try
      {
        if( NIL != subl_promotions.memberP( $kw72$TASK_EXAMINER_LINKS, style_args, UNPROVIDED, UNPROVIDED ) )
        {
          html_task_displayer_cb_task_examiner_link_method( self );
        }
        final SubLObject display_form = methods.funcall_instance_method_with_1_args( plan_displayer, $sym73$PREPARE_TASK_FOR_DISPLAY, instances.get_slot( task, $sym74$FORMULA ) );
        if( NIL != subl_promotions.memberP( $kw75$CYCL, style_args, UNPROVIDED, UNPROVIDED ) )
        {
          cb_utilities.cb_form( display_form, UNPROVIDED, UNPROVIDED );
        }
        else
        {
          final SubLObject _prev_bind_0 = pph_vars.$pph_quantify_varsP$.currentBinding( thread );
          try
          {
            pph_vars.$pph_quantify_varsP$.bind( NIL, thread );
            pph_html.html_text_with_target( display_form, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          finally
          {
            pph_vars.$pph_quantify_varsP$.rebind( _prev_bind_0, thread );
          }
        }
        Dynamic.sublisp_throw( $sym71$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_html_task_displayer_plan_displayer( self, plan_displayer );
          set_html_task_displayer_task( self, task );
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
      catch_var_for_html_task_displayer_method = Errors.handleThrowable( ccatch_env_var, $sym71$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_html_task_displayer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 5613L)
  public static SubLObject html_task_displayer_formula_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_html_task_displayer_method = NIL;
    final SubLObject task = get_html_task_displayer_task( self );
    try
    {
      thread.throwStack.push( $sym78$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym78$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, instances.get_slot( task, $sym74$FORMULA ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_html_task_displayer_task( self, task );
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
      catch_var_for_html_task_displayer_method = Errors.handleThrowable( ccatch_env_var, $sym78$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_html_task_displayer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 5710L)
  public static SubLObject html_task_displayer_bindings_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_html_task_displayer_method = NIL;
    final SubLObject task = get_html_task_displayer_task( self );
    try
    {
      thread.throwStack.push( $sym82$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym82$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, instances.get_slot( task, $sym80$BINDINGS ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_html_task_displayer_task( self, task );
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
      catch_var_for_html_task_displayer_method = Errors.handleThrowable( ccatch_env_var, $sym82$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_html_task_displayer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 5810L)
  public static SubLObject html_task_displayer_display_bindings_method(final SubLObject self, final SubLObject style_args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_html_task_displayer_method = NIL;
    final SubLObject plan_displayer = get_html_task_displayer_plan_displayer( self );
    try
    {
      thread.throwStack.push( $sym87$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD );
      try
      {
        final SubLObject var_manager = instances.get_slot( instances.get_slot( instances.get_slot( self, $sym11$PLAN_DISPLAYER ), $sym27$PLAN ), $sym88$VARIABLE_MANAGER );
        final SubLObject mbind = html_task_displayer_bindings_method( self );
        if( NIL != mbind )
        {
          html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( ZERO_INTEGER );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            SubLObject iteration_state;
            for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( multibindings.mb_multi_var_term_map( mbind ) ) ); NIL == dictionary_contents
                .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
            {
              thread.resetMultipleValues();
              final SubLObject cur_var = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
              final SubLObject entry = thread.secondMultipleValue();
              thread.resetMultipleValues();
              final SubLObject cur_values = Mapping.mapcar( Symbols.symbol_function( $sym89$FIRST ), entry );
              final SubLObject el_var = methods.funcall_instance_method_with_1_args( var_manager, $sym90$RECOVER_EL, cur_var );
              final SubLObject el_values = methods.funcall_instance_method_with_1_args( var_manager, $sym90$RECOVER_EL, cur_values );
              html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_princ( el_var );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$3, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  if( NIL != list_utilities.singletonP( el_values ) )
                  {
                    cb_utilities.cb_form( el_values.first(), UNPROVIDED, UNPROVIDED );
                  }
                  else
                  {
                    cb_utilities.cb_form( el_values, UNPROVIDED, UNPROVIDED );
                  }
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$4, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$2, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
            }
            dictionary_contents.do_dictionary_contents_finalize( iteration_state );
            for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( multibindings.mb_simple_var_term_map( mbind ) ) ); NIL == dictionary_contents
                .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
            {
              thread.resetMultipleValues();
              final SubLObject cur_var = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
              final SubLObject entry = thread.secondMultipleValue();
              thread.resetMultipleValues();
              final SubLObject cur_values = Mapping.mapcar( Symbols.symbol_function( $sym89$FIRST ), entry );
              final SubLObject el_var = methods.funcall_instance_method_with_1_args( var_manager, $sym90$RECOVER_EL, cur_var );
              final SubLObject el_values = methods.funcall_instance_method_with_1_args( var_manager, $sym90$RECOVER_EL, cur_values );
              html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_princ( el_var );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$6, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  if( NIL != list_utilities.singletonP( el_values ) )
                  {
                    cb_utilities.cb_form( el_values.first(), UNPROVIDED, UNPROVIDED );
                  }
                  else
                  {
                    cb_utilities.cb_form( el_values, UNPROVIDED, UNPROVIDED );
                  }
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$7, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$5, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
            }
            dictionary_contents.do_dictionary_contents_finalize( iteration_state );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
          html_utilities.html_newline( UNPROVIDED );
        }
        Dynamic.sublisp_throw( $sym87$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_html_task_displayer_plan_displayer( self, plan_displayer );
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
      catch_var_for_html_task_displayer_method = Errors.handleThrowable( ccatch_env_var, $sym87$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_html_task_displayer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 6542L)
  public static SubLObject html_task_displayer_html_task_page_method(final SubLObject self, final SubLObject style_args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_html_task_displayer_method = NIL;
    final SubLObject plan_displayer = get_html_task_displayer_plan_displayer( self );
    final SubLObject task = get_html_task_displayer_task( self );
    try
    {
      thread.throwStack.push( $sym94$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD );
      try
      {
        final SubLObject prepared_form = methods.funcall_instance_method_with_1_args( plan_displayer, $sym73$PREPARE_TASK_FOR_DISPLAY, html_task_displayer_formula_method( self ) );
        final SubLObject title_var = $str95$Task_Examiner;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
        try
        {
          html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
              ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
              : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
          html_utilities.html_markup( $str96$__DOCTYPE_html_PUBLIC_____W3C__DT );
          if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
          {
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( $str97$_meta_http_equiv__X_UA_Compatible );
          }
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          final SubLObject _prev_bind_0_$8 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
          try
          {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw98$UNINITIALIZED ) ? ConsesLow.list(
                EMPTY_SUBL_OBJECT_ARRAY ) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
            html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
            cyc_file_dependencies.css( $kw99$CB_CYC );
            dhtml_macros.html_basic_cb_scripts();
            if( NIL != title_var )
            {
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
              html_utilities.html_princ( title_var );
              html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
            }
            html_complete.html_complete_script();
            cyc_file_dependencies.css( $kw100$SAM_AUTOCOMPLETE_CSS );
            html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            final SubLObject _prev_bind_0_$9 = html_macros.$html_inside_bodyP$.currentBinding( thread );
            try
            {
              html_macros.$html_inside_bodyP$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
              if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
              {
                html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str102$yui_skin_sam );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str103$reloadFrameButton );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( $str104$button );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( $str105$reload );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_princ( $str106$Refresh_Frames );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
                  {
                    html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
                  }
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$11, thread );
                }
                html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
                if( NIL != title_var )
                {
                  html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
                  html_utilities.html_markup( TWO_INTEGER );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  html_utilities.html_princ( title_var );
                  html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
                  html_utilities.html_markup( TWO_INTEGER );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                }
                html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                html_utilities.html_princ( $str107$Task__ );
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                cb_utilities.cb_form( prepared_form, UNPROVIDED, UNPROVIDED );
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                html_utilities.html_princ( $str108$Translation__ );
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                final SubLObject _prev_bind_0_$12 = pph_vars.$pph_quantify_varsP$.currentBinding( thread );
                try
                {
                  pph_vars.$pph_quantify_varsP$.bind( NIL, thread );
                  pph_html.html_text_with_target( prepared_form, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                finally
                {
                  pph_vars.$pph_quantify_varsP$.rebind( _prev_bind_0_$12, thread );
                }
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                html_utilities.html_princ( $str109$Assertion__ );
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                SubLObject planner_rules = shop_basic_plan.shop_basic_task_planner_rule_method( task );
                if( !planner_rules.isList() )
                {
                  planner_rules = ConsesLow.list( planner_rules );
                }
                SubLObject cdolist_list_var = planner_rules;
                SubLObject cur_rule = NIL;
                cur_rule = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  SubLObject cdolist_list_var_$13 = methods.funcall_instance_method_with_0_args( cur_rule, $sym110$ASSERTIONS );
                  SubLObject cur_assertion = NIL;
                  cur_assertion = cdolist_list_var_$13.first();
                  while ( NIL != cdolist_list_var_$13)
                  {
                    cb_utilities.cb_assertion_link( cur_assertion, UNPROVIDED );
                    cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                    cur_assertion = cdolist_list_var_$13.first();
                  }
                  cdolist_list_var = cdolist_list_var.rest();
                  cur_rule = cdolist_list_var.first();
                }
                if( NIL != html_task_displayer_bindings_method( self ) )
                {
                  html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                  html_utilities.html_princ( $str111$Bindings__ );
                  html_utilities.html_newline( UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                  html_task_displayer_display_bindings_method( self, style_args );
                }
                Dynamic.sublisp_throw( $sym94$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, NIL );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
                html_utilities.html_copyright_notice();
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$10, thread );
              }
              html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
            }
            finally
            {
              html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$9, thread );
            }
            html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
          }
          finally
          {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$8, thread );
          }
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_html_task_displayer_plan_displayer( self, plan_displayer );
          set_html_task_displayer_task( self, task );
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
      catch_var_for_html_task_displayer_method = Errors.handleThrowable( ccatch_env_var, $sym94$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_html_task_displayer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 7721L)
  public static SubLObject html_plan_displayer_initialize_method(final SubLObject self)
  {
    shop_datastructures.shop_indexed_object_initialize_method( self );
    instances.set_slot( self, $sym26$TASK_DISPLAYER_HASH_TABLE, Hashtables.make_hash_table( TEN_INTEGER, UNPROVIDED, UNPROVIDED ) );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 7968L)
  public static SubLObject html_plan_displayer_init_with_plan_method(final SubLObject self, final SubLObject new_plan, final SubLObject displayer_factory)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_html_plan_displayer_method = NIL;
    SubLObject display_variable_substitution = get_html_plan_displayer_display_variable_substitution( self );
    SubLObject open_variables = get_html_plan_displayer_open_variables( self );
    SubLObject mbinding = get_html_plan_displayer_mbinding( self );
    final SubLObject task_displayer_hash_table = get_html_plan_displayer_task_displayer_hash_table( self );
    SubLObject plan = get_html_plan_displayer_plan( self );
    try
    {
      thread.throwStack.push( $sym118$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD );
      try
      {
        plan = new_plan;
        final SubLObject var_manager = instances.get_slot( new_plan, $sym88$VARIABLE_MANAGER );
        final SubLObject new_mbinding = instances.get_slot( new_plan, $sym80$BINDINGS );
        final SubLObject open_vars = instances.get_slot( new_plan, $sym24$OPEN_VARIABLES );
        SubLObject display_sub = NIL;
        SubLObject cdolist_list_var = open_vars;
        SubLObject cur_var = NIL;
        cur_var = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject el_var = methods.funcall_instance_method_with_1_args( var_manager, $sym119$RECOVER_EL_VARIABLE, cur_var );
          display_sub = ConsesLow.cons( ConsesLow.cons( cur_var, el_var ), display_sub );
          cdolist_list_var = cdolist_list_var.rest();
          cur_var = cdolist_list_var.first();
        }
        mbinding = new_mbinding;
        open_variables = open_vars;
        display_variable_substitution = display_sub;
        cdolist_list_var = instances.get_slot( new_plan, $sym120$PRE_ORDERING );
        SubLObject step = NIL;
        step = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject task_displayer = methods.funcall_class_method_with_1_args( displayer_factory, $sym40$CREATE_TASK_DISPLAYER, step );
          html_task_displayer_init_with_task_method( task_displayer, step );
          instances.set_slot( task_displayer, $sym11$PLAN_DISPLAYER, self );
          Hashtables.sethash( step, task_displayer_hash_table, task_displayer );
          cdolist_list_var = cdolist_list_var.rest();
          step = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym118$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_html_plan_displayer_display_variable_substitution( self, display_variable_substitution );
          set_html_plan_displayer_open_variables( self, open_variables );
          set_html_plan_displayer_mbinding( self, mbinding );
          set_html_plan_displayer_task_displayer_hash_table( self, task_displayer_hash_table );
          set_html_plan_displayer_plan( self, plan );
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
      catch_var_for_html_plan_displayer_method = Errors.handleThrowable( ccatch_env_var, $sym118$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_html_plan_displayer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 9065L)
  public static SubLObject html_plan_displayer_prepare_task_for_display_method(final SubLObject self, final SubLObject task)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_html_plan_displayer_method = NIL;
    final SubLObject plan = get_html_plan_displayer_plan( self );
    try
    {
      thread.throwStack.push( $sym123$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD );
      try
      {
        final SubLObject new_task = conses_high.sublis( instances.get_slot( plan, $sym124$SIMPLE_BINDING_LIST ), task, UNPROVIDED, UNPROVIDED );
        final SubLObject var_manager = instances.get_slot( plan, $sym88$VARIABLE_MANAGER );
        Dynamic.sublisp_throw( $sym123$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD, methods.funcall_instance_method_with_1_args( var_manager, $sym90$RECOVER_EL, new_task ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_html_plan_displayer_plan( self, plan );
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
      catch_var_for_html_plan_displayer_method = Errors.handleThrowable( ccatch_env_var, $sym123$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_html_plan_displayer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 9373L)
  public static SubLObject html_plan_displayer_html_hierarchical_form_method(final SubLObject self, final SubLObject style_args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_html_plan_displayer_method = NIL;
    final SubLObject task_displayer_hash_table = get_html_plan_displayer_task_displayer_hash_table( self );
    final SubLObject plan = get_html_plan_displayer_plan( self );
    try
    {
      thread.throwStack.push( $sym128$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD );
      try
      {
        final SubLObject pre = Sequences.reverse( instances.get_slot( plan, $sym120$PRE_ORDERING ) );
        final SubLObject post = instances.get_slot( plan, $sym129$POST_ORDERING );
        html_utilities.html_newline( TWO_INTEGER );
        SubLObject stack = NIL;
        SubLObject indent_count = ZERO_INTEGER;
        SubLObject cur_pre;
        SubLObject step;
        SubLObject next;
        SubLObject cur_task;
        for( cur_pre = NIL, cur_pre = pre; NIL != cur_pre; cur_pre = cur_pre.rest() )
        {
          step = cur_pre.first();
          next = conses_high.second( cur_pre );
          while ( NIL == shop_basic_plan.ppo_tree_descendantP( pre, post, step, stack.first(), Symbols.symbol_function( EQUAL ) ) && NIL != stack)
          {
            indent_count = Numbers.subtract( indent_count, ONE_INTEGER );
            stack = stack.rest();
          }
          cur_task = Hashtables.gethash( step, task_displayer_hash_table, UNPROVIDED );
          html_utilities.html_indent( Numbers.multiply( FIVE_INTEGER, indent_count ) );
          html_task_displayer_html_form_method( cur_task, style_args );
          html_utilities.html_newline( UNPROVIDED );
          if( NIL != shop_basic_plan.ppo_tree_descendantP( pre, post, next, step, Symbols.symbol_function( EQUAL ) ) )
          {
            indent_count = Numbers.add( indent_count, ONE_INTEGER );
            stack = ConsesLow.cons( step, stack );
          }
        }
        Dynamic.sublisp_throw( $sym128$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_html_plan_displayer_task_displayer_hash_table( self, task_displayer_hash_table );
          set_html_plan_displayer_plan( self, plan );
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
      catch_var_for_html_plan_displayer_method = Errors.handleThrowable( ccatch_env_var, $sym128$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_html_plan_displayer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 9963L)
  public static SubLObject html_plan_displayer_html_primitive_form_method(final SubLObject self, final SubLObject style_args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_html_plan_displayer_method = NIL;
    final SubLObject plan = get_html_plan_displayer_plan( self );
    try
    {
      thread.throwStack.push( $sym133$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD );
      try
      {
        SubLObject step_display_form = NIL;
        html_utilities.html_newline( TWO_INTEGER );
        SubLObject list_var = NIL;
        SubLObject step = NIL;
        SubLObject num = NIL;
        list_var = methods.funcall_instance_method_with_0_args( plan, $sym134$PRIMITIVE_FORM );
        step = list_var.first();
        for( num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), step = list_var.first(), num = Numbers.add( ONE_INTEGER, num ) )
        {
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_princ( $str135$__Step_ );
          html_utilities.html_prin1( number_utilities.f_1X( num ) );
          html_utilities.html_princ( $str136$___ );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
          step_display_form = html_plan_displayer_prepare_task_for_display_method( self, step );
          if( NIL != subl_promotions.memberP( $kw75$CYCL, style_args, UNPROVIDED, UNPROVIDED ) )
          {
            cb_utilities.cb_form( step_display_form, UNPROVIDED, UNPROVIDED );
          }
          else
          {
            final SubLObject _prev_bind_0 = pph_vars.$pph_quantify_varsP$.currentBinding( thread );
            try
            {
              pph_vars.$pph_quantify_varsP$.bind( NIL, thread );
              pph_html.html_text_with_target( step_display_form, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            finally
            {
              pph_vars.$pph_quantify_varsP$.rebind( _prev_bind_0, thread );
            }
          }
          html_utilities.html_newline( UNPROVIDED );
        }
        Dynamic.sublisp_throw( $sym133$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_html_plan_displayer_plan( self, plan );
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
      catch_var_for_html_plan_displayer_method = Errors.handleThrowable( ccatch_env_var, $sym133$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_html_plan_displayer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 10576L)
  public static SubLObject html_plan_displayer_html_multibinding_values_method(final SubLObject self, final SubLObject var, final SubLObject style_args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_html_plan_displayer_method = NIL;
    final SubLObject mbinding = get_html_plan_displayer_mbinding( self );
    final SubLObject plan = get_html_plan_displayer_plan( self );
    try
    {
      thread.throwStack.push( $sym141$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD );
      try
      {
        final SubLObject el_var = methods.funcall_instance_method_with_1_args( methods.funcall_instance_method_with_0_args( plan, $sym88$VARIABLE_MANAGER ), $sym119$RECOVER_EL_VARIABLE, var );
        final SubLObject values = multibindings.mb_var_values( var, mbinding );
        if( NIL != values )
        {
          if( NIL != subl_promotions.memberP( $kw75$CYCL, style_args, UNPROVIDED, UNPROVIDED ) )
          {
            cb_utilities.cb_form( el_var, UNPROVIDED, UNPROVIDED );
          }
          else
          {
            pph_html.html_phrase_with_target( el_var, UNPROVIDED, UNPROVIDED );
          }
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_indent( THREE_INTEGER );
          html_utilities.html_princ( $str142$is_one_of );
          html_utilities.html_indent( THREE_INTEGER );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
          pph_html.html_phrase_with_target( values.first(), UNPROVIDED, UNPROVIDED );
          SubLObject cdolist_list_var = values.rest();
          SubLObject cur_val = NIL;
          cur_val = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            html_utilities.html_princ( $str143$_ );
            html_utilities.html_indent( TWO_INTEGER );
            pph_html.html_phrase_with_target( cur_val, UNPROVIDED, UNPROVIDED );
            cdolist_list_var = cdolist_list_var.rest();
            cur_val = cdolist_list_var.first();
          }
          html_utilities.html_newline( UNPROVIDED );
        }
        Dynamic.sublisp_throw( $sym141$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_html_plan_displayer_mbinding( self, mbinding );
          set_html_plan_displayer_plan( self, plan );
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
      catch_var_for_html_plan_displayer_method = Errors.handleThrowable( ccatch_env_var, $sym141$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_html_plan_displayer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 11318L)
  public static SubLObject html_plan_displayer_html_mbinding_form_method(final SubLObject self, final SubLObject style_args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_html_plan_displayer_method = NIL;
    final SubLObject open_variables = get_html_plan_displayer_open_variables( self );
    try
    {
      thread.throwStack.push( $sym147$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD );
      try
      {
        if( NIL != open_variables )
        {
          html_utilities.html_newline( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_princ( $str148$for_any_of_the_following_values__ );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
          html_utilities.html_newline( TWO_INTEGER );
          SubLObject cdolist_list_var = open_variables;
          SubLObject cur_var = NIL;
          cur_var = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            html_plan_displayer_html_multibinding_values_method( self, cur_var, style_args );
            cdolist_list_var = cdolist_list_var.rest();
            cur_var = cdolist_list_var.first();
          }
          html_utilities.html_newline( UNPROVIDED );
        }
        Dynamic.sublisp_throw( $sym147$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_html_plan_displayer_open_variables( self, open_variables );
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
      catch_var_for_html_plan_displayer_method = Errors.handleThrowable( ccatch_env_var, $sym147$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_html_plan_displayer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 11763L)
  public static SubLObject html_plan_displayer_html_form_method(final SubLObject self, final SubLObject style_args)
  {
    if( NIL != subl_promotions.memberP( $kw151$PRIMITIVE, style_args, UNPROVIDED, UNPROVIDED ) )
    {
      html_plan_displayer_html_primitive_form_method( self, style_args );
    }
    else
    {
      html_plan_displayer_html_hierarchical_form_method( self, style_args );
    }
    html_plan_displayer_html_mbinding_form_method( self, style_args );
    return NIL;
  }

  public static SubLObject declare_shop_displayers_file()
  {
    SubLFiles.declareFunction( me, "get_html_task_displayer_plan_displayer", "GET-HTML-TASK-DISPLAYER-PLAN-DISPLAYER", 1, 0, false );
    SubLFiles.declareFunction( me, "set_html_task_displayer_plan_displayer", "SET-HTML-TASK-DISPLAYER-PLAN-DISPLAYER", 2, 0, false );
    SubLFiles.declareFunction( me, "get_html_task_displayer_task", "GET-HTML-TASK-DISPLAYER-TASK", 1, 0, false );
    SubLFiles.declareFunction( me, "set_html_task_displayer_task", "SET-HTML-TASK-DISPLAYER-TASK", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_html_task_displayer_class", "SUBLOOP-RESERVED-INITIALIZE-HTML-TASK-DISPLAYER-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_html_task_displayer_instance", "SUBLOOP-RESERVED-INITIALIZE-HTML-TASK-DISPLAYER-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "html_task_displayer_p", "HTML-TASK-DISPLAYER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_html_plan_displayer_display_variable_substitution", "GET-HTML-PLAN-DISPLAYER-DISPLAY-VARIABLE-SUBSTITUTION", 1, 0, false );
    SubLFiles.declareFunction( me, "set_html_plan_displayer_display_variable_substitution", "SET-HTML-PLAN-DISPLAYER-DISPLAY-VARIABLE-SUBSTITUTION", 2, 0, false );
    SubLFiles.declareFunction( me, "get_html_plan_displayer_open_variables", "GET-HTML-PLAN-DISPLAYER-OPEN-VARIABLES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_html_plan_displayer_open_variables", "SET-HTML-PLAN-DISPLAYER-OPEN-VARIABLES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_html_plan_displayer_mbinding", "GET-HTML-PLAN-DISPLAYER-MBINDING", 1, 0, false );
    SubLFiles.declareFunction( me, "set_html_plan_displayer_mbinding", "SET-HTML-PLAN-DISPLAYER-MBINDING", 2, 0, false );
    SubLFiles.declareFunction( me, "get_html_plan_displayer_task_displayer_hash_table", "GET-HTML-PLAN-DISPLAYER-TASK-DISPLAYER-HASH-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_html_plan_displayer_task_displayer_hash_table", "SET-HTML-PLAN-DISPLAYER-TASK-DISPLAYER-HASH-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_html_plan_displayer_plan", "GET-HTML-PLAN-DISPLAYER-PLAN", 1, 0, false );
    SubLFiles.declareFunction( me, "set_html_plan_displayer_plan", "SET-HTML-PLAN-DISPLAYER-PLAN", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_html_plan_displayer_class", "SUBLOOP-RESERVED-INITIALIZE-HTML-PLAN-DISPLAYER-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_html_plan_displayer_instance", "SUBLOOP-RESERVED-INITIALIZE-HTML-PLAN-DISPLAYER-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "html_plan_displayer_p", "HTML-PLAN-DISPLAYER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_cyc_development_plan_displayer_factory_class", "SUBLOOP-RESERVED-INITIALIZE-CYC-DEVELOPMENT-PLAN-DISPLAYER-FACTORY-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_cyc_development_plan_displayer_factory_instance", "SUBLOOP-RESERVED-INITIALIZE-CYC-DEVELOPMENT-PLAN-DISPLAYER-FACTORY-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_development_plan_displayer_factory_p", "CYC-DEVELOPMENT-PLAN-DISPLAYER-FACTORY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_development_plan_displayer_factory_create_plan_displayer_method", "CYC-DEVELOPMENT-PLAN-DISPLAYER-FACTORY-CREATE-PLAN-DISPLAYER-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_development_plan_displayer_factory_create_task_displayer_method", "CYC-DEVELOPMENT-PLAN-DISPLAYER-FACTORY-CREATE-TASK-DISPLAYER-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "html_task_displayer_initialize_method", "HTML-TASK-DISPLAYER-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "html_task_displayer_init_with_task_method", "HTML-TASK-DISPLAYER-INIT-WITH-TASK-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "html_task_displayer_find_instance_by_id_string_method", "HTML-TASK-DISPLAYER-FIND-INSTANCE-BY-ID-STRING-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "html_task_displayer_task_examiner_link_image_method", "HTML-TASK-DISPLAYER-TASK-EXAMINER-LINK-IMAGE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "html_task_displayer_cb_task_examiner_link_method", "HTML-TASK-DISPLAYER-CB-TASK-EXAMINER-LINK-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "html_task_displayer_html_form_method", "HTML-TASK-DISPLAYER-HTML-FORM-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "html_task_displayer_formula_method", "HTML-TASK-DISPLAYER-FORMULA-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "html_task_displayer_bindings_method", "HTML-TASK-DISPLAYER-BINDINGS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "html_task_displayer_display_bindings_method", "HTML-TASK-DISPLAYER-DISPLAY-BINDINGS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "html_task_displayer_html_task_page_method", "HTML-TASK-DISPLAYER-HTML-TASK-PAGE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "html_plan_displayer_initialize_method", "HTML-PLAN-DISPLAYER-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "html_plan_displayer_init_with_plan_method", "HTML-PLAN-DISPLAYER-INIT-WITH-PLAN-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "html_plan_displayer_prepare_task_for_display_method", "HTML-PLAN-DISPLAYER-PREPARE-TASK-FOR-DISPLAY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "html_plan_displayer_html_hierarchical_form_method", "HTML-PLAN-DISPLAYER-HTML-HIERARCHICAL-FORM-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "html_plan_displayer_html_primitive_form_method", "HTML-PLAN-DISPLAYER-HTML-PRIMITIVE-FORM-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "html_plan_displayer_html_multibinding_values_method", "HTML-PLAN-DISPLAYER-HTML-MULTIBINDING-VALUES-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "html_plan_displayer_html_mbinding_form_method", "HTML-PLAN-DISPLAYER-HTML-MBINDING-FORM-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "html_plan_displayer_html_form_method", "HTML-PLAN-DISPLAYER-HTML-FORM-METHOD", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_shop_displayers_file()
  {
    $cb_plan_task_examiner_link_image$ = SubLFiles.deflexical( "*CB-PLAN-TASK-EXAMINER-LINK-IMAGE*", $kw0$TE_LINK );
    $cb_plan_task_examiner_method_image$ = SubLFiles.deflexical( "*CB-PLAN-TASK-EXAMINER-METHOD-IMAGE*", $kw2$TE_METHOD );
    $cb_plan_task_examiner_operator_image$ = SubLFiles.deflexical( "*CB-PLAN-TASK-EXAMINER-OPERATOR-IMAGE*", $kw4$TE_OPERATOR );
    $cb_plan_task_examiner_scond_image$ = SubLFiles.deflexical( "*CB-PLAN-TASK-EXAMINER-SCOND-IMAGE*", $kw6$TE_EXAMINER );
    return NIL;
  }

  public static SubLObject setup_shop_displayers_file()
  {
    Hashtables.sethash( $kw0$TE_LINK, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str1$bl_sdi_gif, NIL ) );
    Hashtables.sethash( $kw2$TE_METHOD, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str3$gr_sdi_gif, NIL ) );
    Hashtables.sethash( $kw4$TE_OPERATOR, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str5$yl_sdi_gif, NIL ) );
    Hashtables.sethash( $kw6$TE_EXAMINER, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str7$red_diam_gif, NIL ) );
    classes.subloop_new_class( $sym8$HTML_TASK_DISPLAYER, $sym9$SHOP_INDEXED_OBJECT, NIL, NIL, $list10 );
    classes.class_set_implements_slot_listeners( $sym8$HTML_TASK_DISPLAYER, NIL );
    classes.subloop_note_class_initialization_function( $sym8$HTML_TASK_DISPLAYER, $sym16$SUBLOOP_RESERVED_INITIALIZE_HTML_TASK_DISPLAYER_CLASS );
    classes.subloop_note_instance_initialization_function( $sym8$HTML_TASK_DISPLAYER, $sym19$SUBLOOP_RESERVED_INITIALIZE_HTML_TASK_DISPLAYER_INSTANCE );
    subloop_reserved_initialize_html_task_displayer_class( $sym8$HTML_TASK_DISPLAYER );
    classes.subloop_new_class( $sym20$HTML_PLAN_DISPLAYER, $sym9$SHOP_INDEXED_OBJECT, $list21, NIL, $list22 );
    classes.class_set_implements_slot_listeners( $sym20$HTML_PLAN_DISPLAYER, NIL );
    classes.subloop_note_class_initialization_function( $sym20$HTML_PLAN_DISPLAYER, $sym28$SUBLOOP_RESERVED_INITIALIZE_HTML_PLAN_DISPLAYER_CLASS );
    classes.subloop_note_instance_initialization_function( $sym20$HTML_PLAN_DISPLAYER, $sym29$SUBLOOP_RESERVED_INITIALIZE_HTML_PLAN_DISPLAYER_INSTANCE );
    subloop_reserved_initialize_html_plan_displayer_class( $sym20$HTML_PLAN_DISPLAYER );
    classes.subloop_new_class( $sym30$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY, $sym31$SHOP_PLAN_DISPLAYER_FACTORY, NIL, NIL, NIL );
    classes.class_set_implements_slot_listeners( $sym30$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY, NIL );
    classes.subloop_note_class_initialization_function( $sym30$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY, $sym32$SUBLOOP_RESERVED_INITIALIZE_CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTOR );
    classes.subloop_note_instance_initialization_function( $sym30$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY, $sym33$SUBLOOP_RESERVED_INITIALIZE_CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTOR );
    subloop_reserved_initialize_cyc_development_plan_displayer_factory_class( $sym30$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY );
    methods.methods_incorporate_class_method( $sym34$CREATE_PLAN_DISPLAYER, $sym30$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY, $list35, $list36, $list37 );
    methods.subloop_register_class_method( $sym30$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY, $sym34$CREATE_PLAN_DISPLAYER, $sym39$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY_CREATE_PLAN_DISPLAYER_METH );
    methods.methods_incorporate_class_method( $sym40$CREATE_TASK_DISPLAYER, $sym30$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY, $list35, $list41, $list42 );
    methods.subloop_register_class_method( $sym30$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY, $sym40$CREATE_TASK_DISPLAYER, $sym43$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY_CREATE_TASK_DISPLAYER_METH );
    methods.methods_incorporate_instance_method( $sym44$INITIALIZE, $sym8$HTML_TASK_DISPLAYER, $list45, NIL, $list46 );
    methods.subloop_register_instance_method( $sym8$HTML_TASK_DISPLAYER, $sym44$INITIALIZE, $sym47$HTML_TASK_DISPLAYER_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym48$INIT_WITH_TASK, $sym8$HTML_TASK_DISPLAYER, $list35, $list49, $list50 );
    methods.subloop_register_instance_method( $sym8$HTML_TASK_DISPLAYER, $sym48$INIT_WITH_TASK, $sym52$HTML_TASK_DISPLAYER_INIT_WITH_TASK_METHOD );
    methods.methods_incorporate_class_method( $sym53$FIND_INSTANCE_BY_ID_STRING, $sym8$HTML_TASK_DISPLAYER, $list35, $list54, $list55 );
    methods.subloop_register_class_method( $sym8$HTML_TASK_DISPLAYER, $sym53$FIND_INSTANCE_BY_ID_STRING, $sym56$HTML_TASK_DISPLAYER_FIND_INSTANCE_BY_ID_STRING_METHOD );
    methods.methods_incorporate_instance_method( $sym57$TASK_EXAMINER_LINK_IMAGE, $sym8$HTML_TASK_DISPLAYER, $list45, NIL, $list58 );
    methods.subloop_register_instance_method( $sym8$HTML_TASK_DISPLAYER, $sym57$TASK_EXAMINER_LINK_IMAGE, $sym61$HTML_TASK_DISPLAYER_TASK_EXAMINER_LINK_IMAGE_METHOD );
    methods.methods_incorporate_instance_method( $sym62$CB_TASK_EXAMINER_LINK, $sym8$HTML_TASK_DISPLAYER, $list45, NIL, $list63 );
    methods.subloop_register_instance_method( $sym8$HTML_TASK_DISPLAYER, $sym62$CB_TASK_EXAMINER_LINK, $sym67$HTML_TASK_DISPLAYER_CB_TASK_EXAMINER_LINK_METHOD );
    methods.methods_incorporate_instance_method( $sym68$HTML_FORM, $sym8$HTML_TASK_DISPLAYER, $list35, $list69, $list70 );
    methods.subloop_register_instance_method( $sym8$HTML_TASK_DISPLAYER, $sym68$HTML_FORM, $sym76$HTML_TASK_DISPLAYER_HTML_FORM_METHOD );
    methods.methods_incorporate_instance_method( $sym74$FORMULA, $sym8$HTML_TASK_DISPLAYER, $list35, NIL, $list77 );
    methods.subloop_register_instance_method( $sym8$HTML_TASK_DISPLAYER, $sym74$FORMULA, $sym79$HTML_TASK_DISPLAYER_FORMULA_METHOD );
    methods.methods_incorporate_instance_method( $sym80$BINDINGS, $sym8$HTML_TASK_DISPLAYER, $list35, NIL, $list81 );
    methods.subloop_register_instance_method( $sym8$HTML_TASK_DISPLAYER, $sym80$BINDINGS, $sym83$HTML_TASK_DISPLAYER_BINDINGS_METHOD );
    methods.methods_incorporate_instance_method( $sym84$DISPLAY_BINDINGS, $sym8$HTML_TASK_DISPLAYER, $list85, $list69, $list86 );
    methods.subloop_register_instance_method( $sym8$HTML_TASK_DISPLAYER, $sym84$DISPLAY_BINDINGS, $sym91$HTML_TASK_DISPLAYER_DISPLAY_BINDINGS_METHOD );
    methods.methods_incorporate_instance_method( $sym92$HTML_TASK_PAGE, $sym8$HTML_TASK_DISPLAYER, $list35, $list69, $list93 );
    methods.subloop_register_instance_method( $sym8$HTML_TASK_DISPLAYER, $sym92$HTML_TASK_PAGE, $sym112$HTML_TASK_DISPLAYER_HTML_TASK_PAGE_METHOD );
    methods.methods_incorporate_instance_method( $sym44$INITIALIZE, $sym20$HTML_PLAN_DISPLAYER, $list113, NIL, $list114 );
    methods.subloop_register_instance_method( $sym20$HTML_PLAN_DISPLAYER, $sym44$INITIALIZE, $sym115$HTML_PLAN_DISPLAYER_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym38$INIT_WITH_PLAN, $sym20$HTML_PLAN_DISPLAYER, $list35, $list116, $list117 );
    methods.subloop_register_instance_method( $sym20$HTML_PLAN_DISPLAYER, $sym38$INIT_WITH_PLAN, $sym121$HTML_PLAN_DISPLAYER_INIT_WITH_PLAN_METHOD );
    methods.methods_incorporate_instance_method( $sym73$PREPARE_TASK_FOR_DISPLAY, $sym20$HTML_PLAN_DISPLAYER, $list45, $list41, $list122 );
    methods.subloop_register_instance_method( $sym20$HTML_PLAN_DISPLAYER, $sym73$PREPARE_TASK_FOR_DISPLAY, $sym125$HTML_PLAN_DISPLAYER_PREPARE_TASK_FOR_DISPLAY_METHOD );
    methods.methods_incorporate_instance_method( $sym126$HTML_HIERARCHICAL_FORM, $sym20$HTML_PLAN_DISPLAYER, $list45, $list69, $list127 );
    methods.subloop_register_instance_method( $sym20$HTML_PLAN_DISPLAYER, $sym126$HTML_HIERARCHICAL_FORM, $sym130$HTML_PLAN_DISPLAYER_HTML_HIERARCHICAL_FORM_METHOD );
    methods.methods_incorporate_instance_method( $sym131$HTML_PRIMITIVE_FORM, $sym20$HTML_PLAN_DISPLAYER, $list85, $list69, $list132 );
    methods.subloop_register_instance_method( $sym20$HTML_PLAN_DISPLAYER, $sym131$HTML_PRIMITIVE_FORM, $sym137$HTML_PLAN_DISPLAYER_HTML_PRIMITIVE_FORM_METHOD );
    methods.methods_incorporate_instance_method( $sym138$HTML_MULTIBINDING_VALUES, $sym20$HTML_PLAN_DISPLAYER, $list45, $list139, $list140 );
    methods.subloop_register_instance_method( $sym20$HTML_PLAN_DISPLAYER, $sym138$HTML_MULTIBINDING_VALUES, $sym144$HTML_PLAN_DISPLAYER_HTML_MULTIBINDING_VALUES_METHOD );
    methods.methods_incorporate_instance_method( $sym145$HTML_MBINDING_FORM, $sym20$HTML_PLAN_DISPLAYER, $list45, $list69, $list146 );
    methods.subloop_register_instance_method( $sym20$HTML_PLAN_DISPLAYER, $sym145$HTML_MBINDING_FORM, $sym149$HTML_PLAN_DISPLAYER_HTML_MBINDING_FORM_METHOD );
    methods.methods_incorporate_instance_method( $sym68$HTML_FORM, $sym20$HTML_PLAN_DISPLAYER, $list35, $list69, $list150 );
    methods.subloop_register_instance_method( $sym20$HTML_PLAN_DISPLAYER, $sym68$HTML_FORM, $sym152$HTML_PLAN_DISPLAYER_HTML_FORM_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_shop_displayers_file();
  }

  @Override
  public void initializeVariables()
  {
    init_shop_displayers_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_shop_displayers_file();
  }
  static
  {
    me = new shop_displayers();
    $cb_plan_task_examiner_link_image$ = null;
    $cb_plan_task_examiner_method_image$ = null;
    $cb_plan_task_examiner_operator_image$ = null;
    $cb_plan_task_examiner_scond_image$ = null;
    $kw0$TE_LINK = makeKeyword( "TE-LINK" );
    $str1$bl_sdi_gif = makeString( "bl_sdi.gif" );
    $kw2$TE_METHOD = makeKeyword( "TE-METHOD" );
    $str3$gr_sdi_gif = makeString( "gr_sdi.gif" );
    $kw4$TE_OPERATOR = makeKeyword( "TE-OPERATOR" );
    $str5$yl_sdi_gif = makeString( "yl_sdi.gif" );
    $kw6$TE_EXAMINER = makeKeyword( "TE-EXAMINER" );
    $str7$red_diam_gif = makeString( "red_diam.gif" );
    $sym8$HTML_TASK_DISPLAYER = makeSymbol( "HTML-TASK-DISPLAYER" );
    $sym9$SHOP_INDEXED_OBJECT = makeSymbol( "SHOP-INDEXED-OBJECT" );
    $list10 = ConsesLow.list( ConsesLow.list( makeSymbol( "TASK" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "PLAN-DISPLAYER" ), makeKeyword( "INSTANCE" ), makeKeyword(
        "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "FIND-INSTANCE-BY-ID-STRING" ), ConsesLow.list( makeSymbol( "ID" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
            "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INIT-WITH-TASK" ), ConsesLow.list( makeSymbol(
                "TASK" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CB-TASK-EXAMINER-LINK" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                    "DEF-INSTANCE-METHOD" ), makeSymbol( "HTML-TASK-PAGE" ), ConsesLow.list( makeSymbol( "STYLE-ARGS" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                        "TASK-EXAMINER-LINK-IMAGE" ), NIL, makeKeyword( "PROTECTED" ) ) );
    $sym11$PLAN_DISPLAYER = makeSymbol( "PLAN-DISPLAYER" );
    $sym12$TASK = makeSymbol( "TASK" );
    $sym13$OBJECT = makeSymbol( "OBJECT" );
    $sym14$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym15$INSTANCE_INDEX = makeSymbol( "INSTANCE-INDEX" );
    $sym16$SUBLOOP_RESERVED_INITIALIZE_HTML_TASK_DISPLAYER_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-HTML-TASK-DISPLAYER-CLASS" );
    $sym17$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym18$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym19$SUBLOOP_RESERVED_INITIALIZE_HTML_TASK_DISPLAYER_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-HTML-TASK-DISPLAYER-INSTANCE" );
    $sym20$HTML_PLAN_DISPLAYER = makeSymbol( "HTML-PLAN-DISPLAYER" );
    $list21 = ConsesLow.list( makeSymbol( "SHOP-PLAN-I" ) );
    $list22 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "PLAN" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "TASK-DISPLAYER-HASH-TABLE" ), makeKeyword(
        "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "MBINDING" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "OPEN-VARIABLES" ), makeKeyword(
            "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DISPLAY-VARIABLE-SUBSTITUTION" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "HTML-FORM" ), ConsesLow.list( makeSymbol(
                    "STYLE-ARGS" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "HTML-HIERARCHICAL-FORM" ), ConsesLow.list( makeSymbol( "STYLE-ARGS" ) ), makeKeyword(
                        "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "HTML-PRIMITIVE-FORM" ), ConsesLow.list( makeSymbol( "STYLE-ARGS" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow
                            .list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "HTML-MBINDING-FORM" ), ConsesLow.list( makeSymbol( "STYLE-ARGS" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                                "DEF-INSTANCE-METHOD" ), makeSymbol( "HTML-MULTIBINDING-VALUES" ), ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "MBINDING" ), makeSymbol( "STYLE-ARGS" ) ), makeKeyword(
                                    "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PREPARE-TASK-FOR-DISPLAY" ), ConsesLow.list( makeSymbol( "TASK" ) ), makeKeyword( "PROTECTED" ) )
    } );
    $sym23$DISPLAY_VARIABLE_SUBSTITUTION = makeSymbol( "DISPLAY-VARIABLE-SUBSTITUTION" );
    $sym24$OPEN_VARIABLES = makeSymbol( "OPEN-VARIABLES" );
    $sym25$MBINDING = makeSymbol( "MBINDING" );
    $sym26$TASK_DISPLAYER_HASH_TABLE = makeSymbol( "TASK-DISPLAYER-HASH-TABLE" );
    $sym27$PLAN = makeSymbol( "PLAN" );
    $sym28$SUBLOOP_RESERVED_INITIALIZE_HTML_PLAN_DISPLAYER_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-HTML-PLAN-DISPLAYER-CLASS" );
    $sym29$SUBLOOP_RESERVED_INITIALIZE_HTML_PLAN_DISPLAYER_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-HTML-PLAN-DISPLAYER-INSTANCE" );
    $sym30$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY = makeSymbol( "CYC-DEVELOPMENT-PLAN-DISPLAYER-FACTORY" );
    $sym31$SHOP_PLAN_DISPLAYER_FACTORY = makeSymbol( "SHOP-PLAN-DISPLAYER-FACTORY" );
    $sym32$SUBLOOP_RESERVED_INITIALIZE_CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTOR = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-CYC-DEVELOPMENT-PLAN-DISPLAYER-FACTORY-CLASS" );
    $sym33$SUBLOOP_RESERVED_INITIALIZE_CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTOR = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-CYC-DEVELOPMENT-PLAN-DISPLAYER-FACTORY-INSTANCE" );
    $sym34$CREATE_PLAN_DISPLAYER = makeSymbol( "CREATE-PLAN-DISPLAYER" );
    $list35 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list36 = ConsesLow.list( makeSymbol( "PLAN" ) );
    $list37 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PLAN-DISPLAYER" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "NEW" ),
        makeSymbol( "HTML-PLAN-DISPLAYER" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "HTML-PLAN-DISPLAYER" ) ) ) ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol(
            "INIT-WITH-PLAN" ), makeSymbol( "HTML-PLAN-DISPLAYER" ) ), makeSymbol( "PLAN-DISPLAYER" ), makeSymbol( "PLAN" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                "PLAN-DISPLAYER" ) ) ) );
    $sym38$INIT_WITH_PLAN = makeSymbol( "INIT-WITH-PLAN" );
    $sym39$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY_CREATE_PLAN_DISPLAYER_METH = makeSymbol( "CYC-DEVELOPMENT-PLAN-DISPLAYER-FACTORY-CREATE-PLAN-DISPLAYER-METHOD" );
    $sym40$CREATE_TASK_DISPLAYER = makeSymbol( "CREATE-TASK-DISPLAYER" );
    $list41 = ConsesLow.list( makeSymbol( "TASK" ) );
    $list42 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TASK-DISPLAYER" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "NEW" ),
        makeSymbol( "HTML-TASK-DISPLAYER" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "HTML-TASK-DISPLAYER" ) ) ) ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol(
            "INIT-WITH-TASK" ), makeSymbol( "HTML-TASK-DISPLAYER" ) ), makeSymbol( "TASK-DISPLAYER" ), makeSymbol( "TASK" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TASK-DISPLAYER" ) ) ) );
    $sym43$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY_CREATE_TASK_DISPLAYER_METH = makeSymbol( "CYC-DEVELOPMENT-PLAN-DISPLAYER-FACTORY-CREATE-TASK-DISPLAYER-METHOD" );
    $sym44$INITIALIZE = makeSymbol( "INITIALIZE" );
    $list45 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list46 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym47$HTML_TASK_DISPLAYER_INITIALIZE_METHOD = makeSymbol( "HTML-TASK-DISPLAYER-INITIALIZE-METHOD" );
    $sym48$INIT_WITH_TASK = makeSymbol( "INIT-WITH-TASK" );
    $list49 = ConsesLow.list( makeSymbol( "NEW-TASK" ) );
    $list50 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TASK" ), makeSymbol( "NEW-TASK" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym51$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-HTML-TASK-DISPLAYER-METHOD" );
    $sym52$HTML_TASK_DISPLAYER_INIT_WITH_TASK_METHOD = makeSymbol( "HTML-TASK-DISPLAYER-INIT-WITH-TASK-METHOD" );
    $sym53$FIND_INSTANCE_BY_ID_STRING = makeSymbol( "FIND-INSTANCE-BY-ID-STRING" );
    $list54 = ConsesLow.list( makeSymbol( "ID-STRING" ) );
    $list55 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ID" ), ConsesLow.list( makeSymbol( "READ-FROM-STRING-IGNORING-ERRORS" ), makeSymbol( "ID-STRING" ) ) ) ),
        ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIND-INSTANCE" ), makeSymbol( "SELF" ), makeSymbol( "ID" ) ) ) ) );
    $sym56$HTML_TASK_DISPLAYER_FIND_INSTANCE_BY_ID_STRING_METHOD = makeSymbol( "HTML-TASK-DISPLAYER-FIND-INSTANCE-BY-ID-STRING-METHOD" );
    $sym57$TASK_EXAMINER_LINK_IMAGE = makeSymbol( "TASK-EXAMINER-LINK-IMAGE" );
    $list58 = ConsesLow.list( makeString( "@param TASK shop-task-p\n   @return keywordp ;; cb-icon to use for image" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PLANNER-RULE" ),
        ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "PLANNER-RULE" ), makeSymbol( "TASK" ) ), makeSymbol( "TASK" ) ) ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow
            .list( makeSymbol( "SHOP-METHOD-P" ), makeSymbol( "PLANNER-RULE" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "*CB-PLAN-TASK-EXAMINER-METHOD-IMAGE*" ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol(
                "SHOP-PRECONDITION-P" ), makeSymbol( "PLANNER-RULE" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "*CB-PLAN-TASK-EXAMINER-OPERATOR-IMAGE*" ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol(
                    "SHOP-SUFFICIENCY-CONDITION-P" ), makeSymbol( "PLANNER-RULE" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "*CB-PLAN-TASK-EXAMINER-SCOND-IMAGE*" ) ) ), ConsesLow.list( T, ConsesLow.list(
                        makeSymbol( "RET" ), makeSymbol( "*CB-PLAN-TASK-EXAMINER-LINK-IMAGE*" ) ) ) ) ) );
    $sym59$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-HTML-TASK-DISPLAYER-METHOD" );
    $sym60$PLANNER_RULE = makeSymbol( "PLANNER-RULE" );
    $sym61$HTML_TASK_DISPLAYER_TASK_EXAMINER_LINK_IMAGE_METHOD = makeSymbol( "HTML-TASK-DISPLAYER-TASK-EXAMINER-LINK-IMAGE-METHOD" );
    $sym62$CB_TASK_EXAMINER_LINK = makeSymbol( "CB-TASK-EXAMINER-LINK" );
    $list63 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ID-STRING" ), ConsesLow.list( makeSymbol( "WRITE-TO-STRING" ), ConsesLow.list( makeSymbol( "GET-SLOT" ),
        makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INSTANCE-NUMBER" ) ) ) ) ), ConsesLow.list( makeSymbol( "HREF" ), ConsesLow.list( makeSymbol( "CCONCATENATE" ), makeString(
            "cg?plan-task-examiner&" ), makeSymbol( "ID-STRING" ) ) ), ConsesLow.list( makeSymbol( "IMAGE" ), ConsesLow.list( makeSymbol( "TASK-EXAMINER-LINK-IMAGE" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list(
                makeSymbol( "HTML-FANCY-ANCHOR" ), ConsesLow.list( makeKeyword( "HREF" ), makeSymbol( "HREF" ) ), ConsesLow.list( makeSymbol( "CB-ICON" ), makeSymbol( "IMAGE" ), makeKeyword( "BORDER-OVERRIDE" ),
                    ZERO_INTEGER ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym64$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-HTML-TASK-DISPLAYER-METHOD" );
    $str65$cg_plan_task_examiner_ = makeString( "cg?plan-task-examiner&" );
    $kw66$TOP = makeKeyword( "TOP" );
    $sym67$HTML_TASK_DISPLAYER_CB_TASK_EXAMINER_LINK_METHOD = makeSymbol( "HTML-TASK-DISPLAYER-CB-TASK-EXAMINER-LINK-METHOD" );
    $sym68$HTML_FORM = makeSymbol( "HTML-FORM" );
    $list69 = ConsesLow.list( makeSymbol( "STYLE-ARGS" ) );
    $list70 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "MEMBER?" ), makeKeyword( "TASK-EXAMINER-LINKS" ), makeSymbol( "STYLE-ARGS" ) ), ConsesLow.list( makeSymbol(
        "CB-TASK-EXAMINER-LINK" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "DISPLAY-FORM" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ),
            makeSymbol( "PLAN-DISPLAYER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PREPARE-TASK-FOR-DISPLAY" ) ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "TASK" ), ConsesLow.list( makeSymbol(
                "QUOTE" ), makeSymbol( "FORMULA" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "MEMBER?" ), makeKeyword( "CYCL" ), makeSymbol( "STYLE-ARGS" ) ), ConsesLow.list( makeSymbol(
                    "CB-FORM" ), makeSymbol( "DISPLAY-FORM" ) ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "*PPH-QUANTIFY-VARS?*" ), NIL ) ),
                        ConsesLow.list( makeSymbol( "HTML-TEXT-WITH-TARGET" ), makeSymbol( "DISPLAY-FORM" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) );
    $sym71$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-HTML-TASK-DISPLAYER-METHOD" );
    $kw72$TASK_EXAMINER_LINKS = makeKeyword( "TASK-EXAMINER-LINKS" );
    $sym73$PREPARE_TASK_FOR_DISPLAY = makeSymbol( "PREPARE-TASK-FOR-DISPLAY" );
    $sym74$FORMULA = makeSymbol( "FORMULA" );
    $kw75$CYCL = makeKeyword( "CYCL" );
    $sym76$HTML_TASK_DISPLAYER_HTML_FORM_METHOD = makeSymbol( "HTML-TASK-DISPLAYER-HTML-FORM-METHOD" );
    $list77 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "TASK" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FORMULA" ) ) ) ) );
    $sym78$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-HTML-TASK-DISPLAYER-METHOD" );
    $sym79$HTML_TASK_DISPLAYER_FORMULA_METHOD = makeSymbol( "HTML-TASK-DISPLAYER-FORMULA-METHOD" );
    $sym80$BINDINGS = makeSymbol( "BINDINGS" );
    $list81 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "TASK" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "BINDINGS" ) ) ) ) );
    $sym82$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-HTML-TASK-DISPLAYER-METHOD" );
    $sym83$HTML_TASK_DISPLAYER_BINDINGS_METHOD = makeSymbol( "HTML-TASK-DISPLAYER-BINDINGS-METHOD" );
    $sym84$DISPLAY_BINDINGS = makeSymbol( "DISPLAY-BINDINGS" );
    $list85 = ConsesLow.list( makeKeyword( "PRIVATE" ) );
    $list86 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "STYLE-ARGS" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "VAR-MANAGER" ), ConsesLow.list(
        makeSymbol( "GET-COMPOSED-SLOTS" ), makeSymbol( "SELF" ), makeSymbol( "VARIABLE-MANAGER" ), makeSymbol( "PLAN" ), makeSymbol( "PLAN-DISPLAYER" ) ) ), ConsesLow.list( makeSymbol( "MBIND" ), ConsesLow.list(
            makeSymbol( "BINDINGS" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "MBIND" ), ConsesLow.list( makeSymbol( "HTML-FANCY-TABLE" ), ConsesLow.list( makeKeyword( "BORDER" ),
                ZERO_INTEGER ), ConsesLow.list( makeSymbol( "DO-MBIND" ), ConsesLow.list( makeSymbol( "CUR-VAR" ), makeSymbol( "CUR-VALUES" ), makeSymbol( "MBIND" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow
                    .list( ConsesLow.list( makeSymbol( "EL-VAR" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "VAR-MANAGER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "RECOVER-EL" ) ), makeSymbol(
                        "CUR-VAR" ) ) ), ConsesLow.list( makeSymbol( "EL-VALUES" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "VAR-MANAGER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "RECOVER-EL" ) ),
                            makeSymbol( "CUR-VALUES" ) ) ) ), ConsesLow.list( makeSymbol( "HTML-TABLE-ROW" ), ConsesLow.list( makeSymbol( "HTML-TABLE-DATA" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeSymbol(
                                "EL-VAR" ) ) ), ConsesLow.list( makeSymbol( "HTML-TABLE-DATA" ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "SINGLETON?" ), makeSymbol( "EL-VALUES" ) ), ConsesLow
                                    .list( makeSymbol( "CB-FORM" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "EL-VALUES" ) ) ), ConsesLow.list( makeSymbol( "CB-FORM" ), makeSymbol( "EL-VALUES" ) ) ) ) ) ) ) ),
                ConsesLow.list( makeSymbol( "HTML-NEWLINE" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym87$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-HTML-TASK-DISPLAYER-METHOD" );
    $sym88$VARIABLE_MANAGER = makeSymbol( "VARIABLE-MANAGER" );
    $sym89$FIRST = makeSymbol( "FIRST" );
    $sym90$RECOVER_EL = makeSymbol( "RECOVER-EL" );
    $sym91$HTML_TASK_DISPLAYER_DISPLAY_BINDINGS_METHOD = makeSymbol( "HTML-TASK-DISPLAYER-DISPLAY-BINDINGS-METHOD" );
    $sym92$HTML_TASK_PAGE = makeSymbol( "HTML-TASK-PAGE" );
    $list93 = ConsesLow.list( makeString( "This method displays the contents of the Task Examiner Page for the\n   displayer's associated TASK." ), ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "STYLE-ARGS" ) ),
        ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PREPARED-FORM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PLAN-DISPLAYER" ), ConsesLow.list( makeSymbol( "QUOTE" ),
            makeSymbol( "PREPARE-TASK-FOR-DISPLAY" ) ), ConsesLow.list( makeSymbol( "FORMULA" ), makeSymbol( "SELF" ) ) ) ) ), ConsesLow.list( new SubLObject[]
            { makeSymbol( "CB-SIMPLE-MAIN-DOCUMENT" ), ConsesLow.list( makeString( "Task Examiner" ), makeKeyword( "COMPLETION?" ), T ), ConsesLow.list( makeSymbol( "HTML-HR" ) ), ConsesLow.list( makeSymbol(
                "HTML-STRONG" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString( "Task: " ) ), ConsesLow.list( makeSymbol( "HTML-NEWLINE" ) ) ), ConsesLow.list( makeSymbol( "CB-FORM" ), makeSymbol(
                    "PREPARED-FORM" ) ), ConsesLow.list( makeSymbol( "HTML-NEWLINE" ) ), ConsesLow.list( makeSymbol( "HTML-STRONG" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString( "Translation: " ) ), ConsesLow
                        .list( makeSymbol( "HTML-NEWLINE" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "*PPH-QUANTIFY-VARS?*" ), NIL ) ), ConsesLow.list( makeSymbol(
                            "HTML-TEXT-WITH-TARGET" ), makeSymbol( "PREPARED-FORM" ) ) ), ConsesLow.list( makeSymbol( "HTML-NEWLINE" ) ), ConsesLow.list( makeSymbol( "HTML-STRONG" ), ConsesLow.list( makeSymbol(
                                "HTML-PRINC" ), makeString( "Assertion: " ) ), ConsesLow.list( makeSymbol( "HTML-NEWLINE" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                                    "PLANNER-RULES" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "PLANNER-RULE" ), makeSymbol( "SHOP-BASIC-TASK" ) ), makeSymbol( "TASK" ) ) ) ), ConsesLow
                                        .list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "LISTP" ), makeSymbol( "PLANNER-RULES" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PLANNER-RULES" ),
                                            ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "PLANNER-RULES" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CUR-RULE" ), makeSymbol(
                                                "PLANNER-RULES" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CUR-ASSERTION" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list(
                                                    makeSymbol( "ASSERTIONS" ), makeSymbol( "SHOP-PLANNER-RULE" ) ), makeSymbol( "CUR-RULE" ) ) ), ConsesLow.list( makeSymbol( "CB-ASSERTION-LINK" ), makeSymbol(
                                                        "CUR-ASSERTION" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "BINDINGS" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol(
                                                            "HTML-STRONG" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString( "Bindings: " ) ), ConsesLow.list( makeSymbol( "HTML-NEWLINE" ) ) ), ConsesLow.list(
                                                                makeSymbol( "DISPLAY-BINDINGS" ), makeSymbol( "SELF" ), makeSymbol( "STYLE-ARGS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL )
        } ) ) );
    $sym94$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-HTML-TASK-DISPLAYER-METHOD" );
    $str95$Task_Examiner = makeString( "Task Examiner" );
    $str96$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str97$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw98$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw99$CB_CYC = makeKeyword( "CB-CYC" );
    $kw100$SAM_AUTOCOMPLETE_CSS = makeKeyword( "SAM-AUTOCOMPLETE-CSS" );
    $kw101$SHA1 = makeKeyword( "SHA1" );
    $str102$yui_skin_sam = makeString( "yui-skin-sam" );
    $str103$reloadFrameButton = makeString( "reloadFrameButton" );
    $str104$button = makeString( "button" );
    $str105$reload = makeString( "reload" );
    $str106$Refresh_Frames = makeString( "Refresh Frames" );
    $str107$Task__ = makeString( "Task: " );
    $str108$Translation__ = makeString( "Translation: " );
    $str109$Assertion__ = makeString( "Assertion: " );
    $sym110$ASSERTIONS = makeSymbol( "ASSERTIONS" );
    $str111$Bindings__ = makeString( "Bindings: " );
    $sym112$HTML_TASK_DISPLAYER_HTML_TASK_PAGE_METHOD = makeSymbol( "HTML-TASK-DISPLAYER-HTML-TASK-PAGE-METHOD" );
    $list113 = ConsesLow.list( makeKeyword( "PROTECTED" ), makeKeyword( "NO-MEMBER-VARIABLES" ) );
    $list114 = ConsesLow.list( makeString( "@returns html-plan-displayer-p; initialized object" ), ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ),
        makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "TASK-DISPLAYER-HASH-TABLE" ) ), ConsesLow.list( makeSymbol( "MAKE-HASH-TABLE" ), TEN_INTEGER ) ), ConsesLow.list( makeSymbol( "RET" ),
            makeSymbol( "SELF" ) ) );
    $sym115$HTML_PLAN_DISPLAYER_INITIALIZE_METHOD = makeSymbol( "HTML-PLAN-DISPLAYER-INITIALIZE-METHOD" );
    $list116 = ConsesLow.list( makeSymbol( "NEW-PLAN" ), makeSymbol( "DISPLAYER-FACTORY" ) );
    $list117 = ConsesLow.list( makeString( "@param NEW-PLAN          shop-basic-plan-p\n   @param DISPLAYER-FACTORY shop-plan-displayer-factory-p\n   @return html-plan-displayer-p" ), ConsesLow.list( makeSymbol(
        "CSETQ" ), makeSymbol( "PLAN" ), makeSymbol( "NEW-PLAN" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "VAR-MANAGER" ), ConsesLow.list( makeSymbol( "GET-SLOT" ),
            makeSymbol( "NEW-PLAN" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "VARIABLE-MANAGER" ) ) ) ), ConsesLow.list( makeSymbol( "NEW-MBINDING" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol(
                "NEW-PLAN" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "BINDINGS" ) ) ) ), ConsesLow.list( makeSymbol( "OPEN-VARS" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "NEW-PLAN" ),
                    ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "OPEN-VARIABLES" ) ) ) ), makeSymbol( "DISPLAY-SUB" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CUR-VAR" ),
                        makeSymbol( "OPEN-VARS" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "EL-VAR" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol(
                            "VAR-MANAGER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "RECOVER-EL-VARIABLE" ) ), makeSymbol( "CUR-VAR" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol(
                                "CONS" ), makeSymbol( "CUR-VAR" ), makeSymbol( "EL-VAR" ) ), makeSymbol( "DISPLAY-SUB" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "MBINDING" ), makeSymbol(
                                    "NEW-MBINDING" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "OPEN-VARIABLES" ), makeSymbol( "OPEN-VARS" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                                        "DISPLAY-VARIABLE-SUBSTITUTION" ), makeSymbol( "DISPLAY-SUB" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "STEP" ), ConsesLow.list( makeSymbol(
                                            "GET-SLOT" ), makeSymbol( "NEW-PLAN" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PRE-ORDERING" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list(
                                                ConsesLow.list( makeSymbol( "TASK-DISPLAYER" ), ConsesLow.list( makeSymbol( "FUNCALL-CLASS-METHOD" ), makeSymbol( "DISPLAYER-FACTORY" ), ConsesLow.list( makeSymbol(
                                                    "QUOTE" ), makeSymbol( "CREATE-TASK-DISPLAYER" ) ), makeSymbol( "STEP" ) ) ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol(
                                                        "INIT-WITH-TASK" ), makeSymbol( "HTML-TASK-DISPLAYER" ) ), makeSymbol( "TASK-DISPLAYER" ), makeSymbol( "STEP" ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ),
                                                            makeSymbol( "TASK-DISPLAYER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PLAN-DISPLAYER" ) ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol(
                                                                "CSETF" ), ConsesLow.list( makeSymbol( "GETHASH" ), makeSymbol( "STEP" ), makeSymbol( "TASK-DISPLAYER-HASH-TABLE" ) ), makeSymbol( "TASK-DISPLAYER" ) ) ) ),
            ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ) );
    $sym118$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-HTML-PLAN-DISPLAYER-METHOD" );
    $sym119$RECOVER_EL_VARIABLE = makeSymbol( "RECOVER-EL-VARIABLE" );
    $sym120$PRE_ORDERING = makeSymbol( "PRE-ORDERING" );
    $sym121$HTML_PLAN_DISPLAYER_INIT_WITH_PLAN_METHOD = makeSymbol( "HTML-PLAN-DISPLAYER-INIT-WITH-PLAN-METHOD" );
    $list122 = ConsesLow.list( makeString( "@param TASK listp; a task formula in CycL." ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-TASK" ), ConsesLow.list( makeSymbol(
        "SUBLIS" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "PLAN" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SIMPLE-BINDING-LIST" ) ) ), makeSymbol( "TASK" ) ) ), ConsesLow.list( makeSymbol(
            "VAR-MANAGER" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "PLAN" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "VARIABLE-MANAGER" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow
                .list( makeSymbol( "FIM" ), makeSymbol( "VAR-MANAGER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "RECOVER-EL" ) ), makeSymbol( "NEW-TASK" ) ) ) ) );
    $sym123$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-HTML-PLAN-DISPLAYER-METHOD" );
    $sym124$SIMPLE_BINDING_LIST = makeSymbol( "SIMPLE-BINDING-LIST" );
    $sym125$HTML_PLAN_DISPLAYER_PREPARE_TASK_FOR_DISPLAY_METHOD = makeSymbol( "HTML-PLAN-DISPLAYER-PREPARE-TASK-FOR-DISPLAY-METHOD" );
    $sym126$HTML_HIERARCHICAL_FORM = makeSymbol( "HTML-HIERARCHICAL-FORM" );
    $list127 = ConsesLow.list( makeString( "Displays all the tasks in the plan, indicating decompositon relationships\n   with tree-like indentation." ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow
        .list( makeSymbol( "PRE" ), ConsesLow.list( makeSymbol( "REVERSE" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "PLAN" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PRE-ORDERING" ) ) ) ) ),
        ConsesLow.list( makeSymbol( "POST" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "PLAN" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "POST-ORDERING" ) ) ) ) ), ConsesLow.list( makeSymbol(
            "HTML-NEWLINE" ), TWO_INTEGER ), ConsesLow.list( makeSymbol( "DO-PPO-TREE-DEPTH" ), ConsesLow.list( makeSymbol( "STEP" ), makeSymbol( "INDENT-COUNT" ), makeSymbol( "PRE" ), makeSymbol( "POST" ), ConsesLow
                .list( makeSymbol( "FUNCTION" ), EQUAL ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CUR-TASK" ), ConsesLow.list( makeSymbol( "GETHASH" ), makeSymbol( "STEP" ),
                    makeSymbol( "TASK-DISPLAYER-HASH-TABLE" ) ) ) ), ConsesLow.list( makeSymbol( "HTML-INDENT" ), ConsesLow.list( makeSymbol( "*" ), FIVE_INTEGER, makeSymbol( "INDENT-COUNT" ) ) ), ConsesLow.list(
                        makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "HTML-FORM" ), makeSymbol( "HTML-TASK-DISPLAYER" ) ), makeSymbol( "CUR-TASK" ), makeSymbol( "STYLE-ARGS" ) ), ConsesLow.list( makeSymbol(
                            "HTML-NEWLINE" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) );
    $sym128$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-HTML-PLAN-DISPLAYER-METHOD" );
    $sym129$POST_ORDERING = makeSymbol( "POST-ORDERING" );
    $sym130$HTML_PLAN_DISPLAYER_HTML_HIERARCHICAL_FORM_METHOD = makeSymbol( "HTML-PLAN-DISPLAYER-HTML-HIERARCHICAL-FORM-METHOD" );
    $sym131$HTML_PRIMITIVE_FORM = makeSymbol( "HTML-PRIMITIVE-FORM" );
    $list132 = ConsesLow.list( makeString( "Displays only the primitive tasks of the plan." ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "STEP-DISPLAY-FORM" ), NIL ) ), ConsesLow
        .list( makeSymbol( "HTML-NEWLINE" ), TWO_INTEGER ), ConsesLow.list( makeSymbol( "CDOLIST-NUMBERED" ), ConsesLow.list( makeSymbol( "STEP" ), makeSymbol( "NUM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
            "PLAN" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PRIMITIVE-FORM" ) ) ) ), ConsesLow.list( makeSymbol( "HTML-STRONG" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString( "  Step " ) ),
                ConsesLow.list( makeSymbol( "HTML-PRIN1" ), ConsesLow.list( makeSymbol( "1+" ), makeSymbol( "NUM" ) ) ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString( ".  " ) ) ), ConsesLow.list( makeSymbol(
                    "CSETQ" ), makeSymbol( "STEP-DISPLAY-FORM" ), ConsesLow.list( makeSymbol( "PREPARE-TASK-FOR-DISPLAY" ), makeSymbol( "SELF" ), makeSymbol( "STEP" ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow
                        .list( makeSymbol( "MEMBER?" ), makeKeyword( "CYCL" ), makeSymbol( "STYLE-ARGS" ) ), ConsesLow.list( makeSymbol( "CB-FORM" ), makeSymbol( "STEP-DISPLAY-FORM" ) ), ConsesLow.list( makeSymbol(
                            "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "*PPH-QUANTIFY-VARS?*" ), NIL ) ), ConsesLow.list( makeSymbol( "HTML-TEXT-WITH-TARGET" ), makeSymbol( "STEP-DISPLAY-FORM" ) ) ) ),
            ConsesLow.list( makeSymbol( "HTML-NEWLINE" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym133$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-HTML-PLAN-DISPLAYER-METHOD" );
    $sym134$PRIMITIVE_FORM = makeSymbol( "PRIMITIVE-FORM" );
    $str135$__Step_ = makeString( "  Step " );
    $str136$___ = makeString( ".  " );
    $sym137$HTML_PLAN_DISPLAYER_HTML_PRIMITIVE_FORM_METHOD = makeSymbol( "HTML-PLAN-DISPLAYER-HTML-PRIMITIVE-FORM-METHOD" );
    $sym138$HTML_MULTIBINDING_VALUES = makeSymbol( "HTML-MULTIBINDING-VALUES" );
    $list139 = ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "STYLE-ARGS" ) );
    $list140 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "EL-VAR" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), ConsesLow.list( makeSymbol(
        "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "PLAN" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "VARIABLE-MANAGER" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "RECOVER-EL-VARIABLE" ) ),
        makeSymbol( "VAR" ) ) ), ConsesLow.list( makeSymbol( "VALUES" ), ConsesLow.list( makeSymbol( "MB-VAR-VALUES" ), makeSymbol( "VAR" ), makeSymbol( "MBINDING" ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ),
            ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "VALUES" ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "MEMBER?" ), makeKeyword( "CYCL" ), makeSymbol( "STYLE-ARGS" ) ), ConsesLow
                .list( makeSymbol( "CB-FORM" ), makeSymbol( "EL-VAR" ) ), ConsesLow.list( makeSymbol( "HTML-PHRASE-WITH-TARGET" ), makeSymbol( "EL-VAR" ) ) ), ConsesLow.list( makeSymbol( "HTML-STRONG" ), ConsesLow.list(
                    makeSymbol( "HTML-INDENT" ), THREE_INTEGER ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString( "is one of" ) ), ConsesLow.list( makeSymbol( "HTML-INDENT" ), THREE_INTEGER ) ), ConsesLow.list(
                        makeSymbol( "HTML-PHRASE-WITH-TARGET" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "VALUES" ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CUR-VAL" ),
                            ConsesLow.list( makeSymbol( "REST" ), makeSymbol( "VALUES" ) ) ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString( "," ) ), ConsesLow.list( makeSymbol( "HTML-INDENT" ), TWO_INTEGER ),
                            ConsesLow.list( makeSymbol( "HTML-PHRASE-WITH-TARGET" ), makeSymbol( "CUR-VAL" ) ) ), ConsesLow.list( makeSymbol( "HTML-NEWLINE" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) );
    $sym141$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-HTML-PLAN-DISPLAYER-METHOD" );
    $str142$is_one_of = makeString( "is one of" );
    $str143$_ = makeString( "," );
    $sym144$HTML_PLAN_DISPLAYER_HTML_MULTIBINDING_VALUES_METHOD = makeSymbol( "HTML-PLAN-DISPLAYER-HTML-MULTIBINDING-VALUES-METHOD" );
    $sym145$HTML_MBINDING_FORM = makeSymbol( "HTML-MBINDING-FORM" );
    $list146 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "OPEN-VARIABLES" ), ConsesLow.list( makeSymbol( "HTML-NEWLINE" ) ), ConsesLow.list( makeSymbol( "HTML-STRONG" ), ConsesLow.list(
        makeSymbol( "HTML-PRINC" ), makeString( "for any of the following values..." ) ) ), ConsesLow.list( makeSymbol( "HTML-NEWLINE" ), TWO_INTEGER ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list(
            makeSymbol( "CUR-VAR" ), makeSymbol( "OPEN-VARIABLES" ) ), ConsesLow.list( makeSymbol( "HTML-MULTIBINDING-VALUES" ), makeSymbol( "SELF" ), makeSymbol( "CUR-VAR" ), makeSymbol( "STYLE-ARGS" ) ) ), ConsesLow
                .list( makeSymbol( "HTML-NEWLINE" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym147$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-HTML-PLAN-DISPLAYER-METHOD" );
    $str148$for_any_of_the_following_values__ = makeString( "for any of the following values..." );
    $sym149$HTML_PLAN_DISPLAYER_HTML_MBINDING_FORM_METHOD = makeSymbol( "HTML-PLAN-DISPLAYER-HTML-MBINDING-FORM-METHOD" );
    $list150 = ConsesLow.list( ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "MEMBER?" ), makeKeyword( "PRIMITIVE" ), makeSymbol( "STYLE-ARGS" ) ), ConsesLow.list( makeSymbol( "HTML-PRIMITIVE-FORM" ),
        makeSymbol( "SELF" ), makeSymbol( "STYLE-ARGS" ) ), ConsesLow.list( makeSymbol( "HTML-HIERARCHICAL-FORM" ), makeSymbol( "SELF" ), makeSymbol( "STYLE-ARGS" ) ) ), ConsesLow.list( makeSymbol(
            "HTML-MBINDING-FORM" ), makeSymbol( "SELF" ), makeSymbol( "STYLE-ARGS" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $kw151$PRIMITIVE = makeKeyword( "PRIMITIVE" );
    $sym152$HTML_PLAN_DISPLAYER_HTML_FORM_METHOD = makeSymbol( "HTML-PLAN-DISPLAYER-HTML-FORM-METHOD" );
  }
}
/*
 * 
 * Total time: 750 ms
 * 
 */