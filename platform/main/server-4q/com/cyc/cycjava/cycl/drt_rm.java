package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class drt_rm
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.drt_rm";
  public static final String myFingerPrint = "fd59d1f917864a6320cc402a2bd9e104682bbdf9b5330ec656028a358ee371cd";
  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 6058L)
  private static SubLSymbol $drt_rm_wrapper_fns$;
  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 6386L)
  private static SubLSymbol $drt_rm_wrapper_fns_to_keywords$;
  private static final SubLSymbol $sym0$TARGET_TERM;
  private static final SubLString $str1$_______________________RM_MAPPING;
  private static final SubLString $str2$_A_has_been_mapped_to__A__;
  private static final SubLString $str3$map_rm___A_was_mapped_to__A__now_;
  private static final SubLSymbol $sym4$RM;
  private static final SubLSymbol $sym5$OBJECT;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$SYNTACTIC_ROLE;
  private static final SubLSymbol $sym8$NUMBER;
  private static final SubLSymbol $sym9$GENDER;
  private static final SubLSymbol $sym10$QUANT;
  private static final SubLSymbol $sym11$DEFINITENESS;
  private static final SubLSymbol $sym12$CONDITIONS;
  private static final SubLSymbol $sym13$SCOPE;
  private static final SubLSymbol $sym14$TARGET_VAR;
  private static final SubLSymbol $sym15$TYPE;
  private static final SubLSymbol $sym16$SUB_RMS;
  private static final SubLSymbol $sym17$SUPER_RM;
  private static final SubLSymbol $sym18$ROOT_TERM;
  private static final SubLSymbol $sym19$MAPPED_FORMULA;
  private static final SubLSymbol $sym20$FORMULA;
  private static final SubLSymbol $sym21$INSTANCE_COUNT;
  private static final SubLSymbol $sym22$SUBLOOP_RESERVED_INITIALIZE_RM_CLASS;
  private static final SubLSymbol $sym23$ISOLATED_P;
  private static final SubLSymbol $sym24$INSTANCE_NUMBER;
  private static final SubLSymbol $sym25$SUBLOOP_RESERVED_INITIALIZE_RM_INSTANCE;
  private static final SubLSymbol $sym26$SET_PROPERTY;
  private static final SubLList $list27;
  private static final SubLList $list28;
  private static final SubLSymbol $sym29$OUTER_CATCH_FOR_RM_METHOD;
  private static final SubLSymbol $kw30$TYPE;
  private static final SubLSymbol $kw31$DEFINITENESS;
  private static final SubLObject $const32$Definite_NLAttr;
  private static final SubLSymbol $kw33$DEFINITE;
  private static final SubLSymbol $kw34$QUANT;
  private static final SubLObject $const35$ProperName_NLAttr;
  private static final SubLSymbol $kw36$GENDER;
  private static final SubLSymbol $kw37$NUMBER;
  private static final SubLSymbol $kw38$SYNTACTIC_ROLE;
  private static final SubLString $str39$___rm_set_property_method__A__pro;
  private static final SubLSymbol $sym40$RM_SET_PROPERTY_METHOD;
  private static final SubLSymbol $sym41$CONSTRUCT_CYCL;
  private static final SubLList $list42;
  private static final SubLSymbol $sym43$OUTER_CATCH_FOR_RM_METHOD;
  private static final SubLString $str44$___rm_construct_cycl_method__A__b;
  private static final SubLString $str45$___rm_construct_cycl_method__A__n;
  private static final SubLString $str46$___rm_construct_cycl_method__A__n;
  private static final SubLSymbol $sym47$RM_CONSTRUCT_CYCL_METHOD;
  private static final SubLSymbol $sym48$COREFERENCE_PROBABILITY;
  private static final SubLList $list49;
  private static final SubLList $list50;
  private static final SubLSymbol $sym51$OUTER_CATCH_FOR_RM_METHOD;
  private static final SubLFloat $float52$0_0;
  private static final SubLFloat $float53$0_5;
  private static final SubLSymbol $sym54$RM_COREFERENCE_PROBABILITY_METHOD;
  private static final SubLList $list55;
  private static final SubLList $list56;
  private static final SubLSymbol $sym57$DRT_POSSIBLE_RM_FORMULA;
  private static final SubLObject $const58$SubcollectionFunction;
  private static final SubLList $list59;
  private static final SubLSymbol $kw60$PRONOMIAL;
  private static final SubLSymbol $kw61$SOMEFN;
  private static final SubLString $str62$drt_rm_formula_properties___A_has;
  private static final SubLSymbol $sym63$NEW;
  private static final SubLList $list64;

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 761L)
  public static SubLObject real_rm(final SubLObject rm)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject new_rm = drt.drt_get_coreference( rm );
    final SubLObject existsP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == existsP )
    {
      return rm;
    }
    if( rm.eql( new_rm ) )
    {
      return rm;
    }
    return real_rm( new_rm );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1127L)
  public static SubLObject map_rm(final SubLObject rm, final SubLObject target)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != forts.fort_p( target ) )
    {
      instances.set_slot( rm, $sym0$TARGET_TERM, target );
      if( !drt.$drt_trace_level$.getDynamicValue( thread ).isNumber() || drt.$drt_trace_level$.getDynamicValue( thread ).numGE( TWO_INTEGER ) )
      {
        if( !drt.$drt_trace_level$.getDynamicValue( thread ).isNumber() || drt.$drt_trace_level$.getDynamicValue( thread ).numGE( TWO_INTEGER ) )
        {
          drt.drt_tracer_output( TWO_INTEGER, ConsesLow.list( $str1$_______________________RM_MAPPING ) );
        }
        if( !drt.$drt_trace_level$.getDynamicValue( thread ).isNumber() || drt.$drt_trace_level$.getDynamicValue( thread ).numGE( TWO_INTEGER ) )
        {
          drt.drt_tracer_output( TWO_INTEGER, ConsesLow.list( $str2$_A_has_been_mapped_to__A__, rm, target ) );
        }
      }
    }
    else if( NIL != rm_p( target ) )
    {
      thread.resetMultipleValues();
      final SubLObject old_rm = drt.drt_get_coreference( rm );
      final SubLObject existsP = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != existsP && drt.$drt_trace_level$.getDynamicValue( thread ).numGE( ONE_INTEGER ) )
      {
        Errors.warn( $str3$map_rm___A_was_mapped_to__A__now_, rm, old_rm, target );
      }
      final SubLObject result = drt.drt_set_coreference( rm, target );
      if( !drt.$drt_trace_level$.getDynamicValue( thread ).isNumber() || drt.$drt_trace_level$.getDynamicValue( thread ).numGE( TWO_INTEGER ) )
      {
        if( !drt.$drt_trace_level$.getDynamicValue( thread ).isNumber() || drt.$drt_trace_level$.getDynamicValue( thread ).numGE( TWO_INTEGER ) )
        {
          drt.drt_tracer_output( TWO_INTEGER, ConsesLow.list( $str1$_______________________RM_MAPPING ) );
        }
        if( !drt.$drt_trace_level$.getDynamicValue( thread ).isNumber() || drt.$drt_trace_level$.getDynamicValue( thread ).numGE( TWO_INTEGER ) )
        {
          drt.drt_tracer_output( TWO_INTEGER, ConsesLow.list( $str2$_A_has_been_mapped_to__A__, rm, target ) );
        }
      }
      return result;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
  public static SubLObject get_rm_syntactic_role(final SubLObject rm)
  {
    return classes.subloop_get_access_protected_instance_slot( rm, FIFTEEN_INTEGER, $sym7$SYNTACTIC_ROLE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
  public static SubLObject set_rm_syntactic_role(final SubLObject rm, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( rm, value, FIFTEEN_INTEGER, $sym7$SYNTACTIC_ROLE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
  public static SubLObject get_rm_number(final SubLObject rm)
  {
    return classes.subloop_get_access_protected_instance_slot( rm, FOURTEEN_INTEGER, $sym8$NUMBER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
  public static SubLObject set_rm_number(final SubLObject rm, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( rm, value, FOURTEEN_INTEGER, $sym8$NUMBER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
  public static SubLObject get_rm_gender(final SubLObject rm)
  {
    return classes.subloop_get_access_protected_instance_slot( rm, THIRTEEN_INTEGER, $sym9$GENDER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
  public static SubLObject set_rm_gender(final SubLObject rm, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( rm, value, THIRTEEN_INTEGER, $sym9$GENDER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
  public static SubLObject get_rm_quant(final SubLObject rm)
  {
    return classes.subloop_get_access_protected_instance_slot( rm, TWELVE_INTEGER, $sym10$QUANT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
  public static SubLObject set_rm_quant(final SubLObject rm, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( rm, value, TWELVE_INTEGER, $sym10$QUANT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
  public static SubLObject get_rm_definiteness(final SubLObject rm)
  {
    return classes.subloop_get_access_protected_instance_slot( rm, ELEVEN_INTEGER, $sym11$DEFINITENESS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
  public static SubLObject set_rm_definiteness(final SubLObject rm, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( rm, value, ELEVEN_INTEGER, $sym11$DEFINITENESS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
  public static SubLObject get_rm_conditions(final SubLObject rm)
  {
    return classes.subloop_get_access_protected_instance_slot( rm, TEN_INTEGER, $sym12$CONDITIONS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
  public static SubLObject set_rm_conditions(final SubLObject rm, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( rm, value, TEN_INTEGER, $sym12$CONDITIONS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
  public static SubLObject get_rm_scope(final SubLObject rm)
  {
    return classes.subloop_get_access_protected_instance_slot( rm, NINE_INTEGER, $sym13$SCOPE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
  public static SubLObject set_rm_scope(final SubLObject rm, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( rm, value, NINE_INTEGER, $sym13$SCOPE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
  public static SubLObject get_rm_target_term(final SubLObject rm)
  {
    return classes.subloop_get_access_protected_instance_slot( rm, EIGHT_INTEGER, $sym0$TARGET_TERM );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
  public static SubLObject set_rm_target_term(final SubLObject rm, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( rm, value, EIGHT_INTEGER, $sym0$TARGET_TERM );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
  public static SubLObject get_rm_target_var(final SubLObject rm)
  {
    return classes.subloop_get_access_protected_instance_slot( rm, SEVEN_INTEGER, $sym14$TARGET_VAR );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
  public static SubLObject set_rm_target_var(final SubLObject rm, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( rm, value, SEVEN_INTEGER, $sym14$TARGET_VAR );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
  public static SubLObject get_rm_type(final SubLObject rm)
  {
    return classes.subloop_get_access_protected_instance_slot( rm, SIX_INTEGER, $sym15$TYPE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
  public static SubLObject set_rm_type(final SubLObject rm, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( rm, value, SIX_INTEGER, $sym15$TYPE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
  public static SubLObject get_rm_sub_rms(final SubLObject rm)
  {
    return classes.subloop_get_access_protected_instance_slot( rm, FIVE_INTEGER, $sym16$SUB_RMS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
  public static SubLObject set_rm_sub_rms(final SubLObject rm, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( rm, value, FIVE_INTEGER, $sym16$SUB_RMS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
  public static SubLObject get_rm_super_rm(final SubLObject rm)
  {
    return classes.subloop_get_access_protected_instance_slot( rm, FOUR_INTEGER, $sym17$SUPER_RM );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
  public static SubLObject set_rm_super_rm(final SubLObject rm, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( rm, value, FOUR_INTEGER, $sym17$SUPER_RM );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
  public static SubLObject get_rm_root_term(final SubLObject rm)
  {
    return classes.subloop_get_access_protected_instance_slot( rm, THREE_INTEGER, $sym18$ROOT_TERM );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
  public static SubLObject set_rm_root_term(final SubLObject rm, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( rm, value, THREE_INTEGER, $sym18$ROOT_TERM );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
  public static SubLObject get_rm_mapped_formula(final SubLObject rm)
  {
    return classes.subloop_get_access_protected_instance_slot( rm, TWO_INTEGER, $sym19$MAPPED_FORMULA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
  public static SubLObject set_rm_mapped_formula(final SubLObject rm, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( rm, value, TWO_INTEGER, $sym19$MAPPED_FORMULA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
  public static SubLObject get_rm_formula(final SubLObject rm)
  {
    return classes.subloop_get_access_protected_instance_slot( rm, ONE_INTEGER, $sym20$FORMULA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
  public static SubLObject set_rm_formula(final SubLObject rm, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( rm, value, ONE_INTEGER, $sym20$FORMULA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
  public static SubLObject subloop_reserved_initialize_rm_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym5$OBJECT, $sym21$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
  public static SubLObject subloop_reserved_initialize_rm_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym5$OBJECT, $sym23$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$OBJECT, $sym24$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$RM, $sym20$FORMULA, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$RM, $sym19$MAPPED_FORMULA, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$RM, $sym18$ROOT_TERM, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$RM, $sym17$SUPER_RM, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$RM, $sym16$SUB_RMS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$RM, $sym15$TYPE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$RM, $sym14$TARGET_VAR, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$RM, $sym0$TARGET_TERM, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$RM, $sym13$SCOPE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$RM, $sym12$CONDITIONS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$RM, $sym11$DEFINITENESS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$RM, $sym10$QUANT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$RM, $sym9$GENDER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$RM, $sym8$NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$RM, $sym7$SYNTACTIC_ROLE, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
  public static SubLObject rm_p(final SubLObject rm)
  {
    return classes.subloop_instanceof_class( rm, $sym4$RM );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 3784L)
  public static SubLObject rm_set_property_method(final SubLObject self, final SubLObject property_keyword, final SubLObject new_property_value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_rm_method = NIL;
    SubLObject syntactic_role = get_rm_syntactic_role( self );
    SubLObject number = get_rm_number( self );
    SubLObject gender = get_rm_gender( self );
    SubLObject quant = get_rm_quant( self );
    SubLObject definiteness = get_rm_definiteness( self );
    SubLObject target_term = get_rm_target_term( self );
    SubLObject type = get_rm_type( self );
    final SubLObject root_term = get_rm_root_term( self );
    try
    {
      thread.throwStack.push( $sym29$OUTER_CATCH_FOR_RM_METHOD );
      try
      {
        if( property_keyword.eql( $kw30$TYPE ) )
        {
          type = new_property_value;
        }
        else if( property_keyword.eql( $kw31$DEFINITENESS ) )
        {
          definiteness = new_property_value;
          if( new_property_value.eql( $const32$Definite_NLAttr ) )
          {
            type = $kw33$DEFINITE;
          }
        }
        else if( property_keyword.eql( $kw34$QUANT ) )
        {
          quant = new_property_value;
          if( new_property_value.eql( $const35$ProperName_NLAttr ) )
          {
            target_term = root_term;
          }
        }
        else if( property_keyword.eql( $kw36$GENDER ) )
        {
          gender = new_property_value;
        }
        else if( property_keyword.eql( $kw37$NUMBER ) )
        {
          number = new_property_value;
        }
        else if( property_keyword.eql( $kw38$SYNTACTIC_ROLE ) )
        {
          syntactic_role = new_property_value;
        }
        else if( drt.$drt_trace_level$.getDynamicValue( thread ).numGE( ONE_INTEGER ) )
        {
          Errors.warn( $str39$___rm_set_property_method__A__pro, self, property_keyword, new_property_value );
        }
        Dynamic.sublisp_throw( $sym29$OUTER_CATCH_FOR_RM_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_rm_syntactic_role( self, syntactic_role );
          set_rm_number( self, number );
          set_rm_gender( self, gender );
          set_rm_quant( self, quant );
          set_rm_definiteness( self, definiteness );
          set_rm_target_term( self, target_term );
          set_rm_type( self, type );
          set_rm_root_term( self, root_term );
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
      catch_var_for_rm_method = Errors.handleThrowable( ccatch_env_var, $sym29$OUTER_CATCH_FOR_RM_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_rm_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 4736L)
  public static SubLObject rm_construct_cycl_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_rm_method = NIL;
    final SubLObject target_term = get_rm_target_term( self );
    final SubLObject target_var = get_rm_target_var( self );
    final SubLObject root_term = get_rm_root_term( self );
    try
    {
      thread.throwStack.push( $sym43$OUTER_CATCH_FOR_RM_METHOD );
      try
      {
        if( NIL != target_var && NIL != target_term && drt.$drt_trace_level$.getDynamicValue( thread ).numGE( ONE_INTEGER ) )
        {
          Errors.warn( $str44$___rm_construct_cycl_method__A__b, self, target_var, target_term );
        }
        if( NIL != target_var )
        {
          Dynamic.sublisp_throw( $sym43$OUTER_CATCH_FOR_RM_METHOD, target_var );
        }
        else if( NIL != target_term )
        {
          Dynamic.sublisp_throw( $sym43$OUTER_CATCH_FOR_RM_METHOD, target_term );
        }
        else if( NIL != root_term )
        {
          if( drt.$drt_trace_level$.getDynamicValue( thread ).numGE( ONE_INTEGER ) )
          {
            Errors.warn( $str45$___rm_construct_cycl_method__A__n, self, root_term );
          }
          Dynamic.sublisp_throw( $sym43$OUTER_CATCH_FOR_RM_METHOD, root_term );
        }
        else
        {
          if( drt.$drt_trace_level$.getDynamicValue( thread ).numGE( ONE_INTEGER ) )
          {
            Errors.warn( $str46$___rm_construct_cycl_method__A__n, self );
          }
          Dynamic.sublisp_throw( $sym43$OUTER_CATCH_FOR_RM_METHOD, NIL );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_rm_target_term( self, target_term );
          set_rm_target_var( self, target_var );
          set_rm_root_term( self, root_term );
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
      catch_var_for_rm_method = Errors.handleThrowable( ccatch_env_var, $sym43$OUTER_CATCH_FOR_RM_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_rm_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 5364L)
  public static SubLObject rm_coreference_probability_method(final SubLObject self, final SubLObject target_rm)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_rm_method = NIL;
    final SubLObject number = get_rm_number( self );
    final SubLObject gender = get_rm_gender( self );
    final SubLObject formula = get_rm_formula( self );
    try
    {
      thread.throwStack.push( $sym51$OUTER_CATCH_FOR_RM_METHOD );
      try
      {
        if( self.eql( target_rm ) )
        {
          Dynamic.sublisp_throw( $sym51$OUTER_CATCH_FOR_RM_METHOD, NIL );
        }
        if( NIL != list_utilities.tree_find( formula, instances.get_slot( target_rm, $sym20$FORMULA ), Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
        {
          Dynamic.sublisp_throw( $sym51$OUTER_CATCH_FOR_RM_METHOD, $float52$0_0 );
        }
        SubLObject probability = $float52$0_0;
        if( gender.eql( instances.get_slot( target_rm, $sym9$GENDER ) ) )
        {
          probability = Numbers.add( probability, $float53$0_5 );
        }
        if( number.eql( instances.get_slot( target_rm, $sym8$NUMBER ) ) )
        {
          probability = Numbers.add( probability, $float53$0_5 );
        }
        Dynamic.sublisp_throw( $sym51$OUTER_CATCH_FOR_RM_METHOD, probability );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_rm_number( self, number );
          set_rm_gender( self, gender );
          set_rm_formula( self, formula );
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
      catch_var_for_rm_method = Errors.handleThrowable( ccatch_env_var, $sym51$OUTER_CATCH_FOR_RM_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_rm_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 6765L)
  public static SubLObject drt_rm_wrapper_fn_p(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return subl_promotions.memberP( fort, $drt_rm_wrapper_fns$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 7030L)
  public static SubLObject drt_rm_wrapper_fn_to_keyword(final SubLObject wrapper_fn)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject assoc_pair = conses_high.assoc( wrapper_fn, $drt_rm_wrapper_fns_to_keywords$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
    if( NIL != assoc_pair )
    {
      return conses_high.second( assoc_pair );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 7284L)
  public static SubLObject drt_possible_rm_formula(final SubLObject poss_rm_formula)
  {
    if( poss_rm_formula.isCons() )
    {
      return list_utilities.sublisp_boolean( drt_rm_wrapper_fn_p( poss_rm_formula.first() ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 7576L)
  public static SubLObject drt_find_rm_formulas(final SubLObject formula)
  {
    final SubLObject poss_rm_formulas = list_utilities.tree_gather( formula, Symbols.symbol_function( $sym57$DRT_POSSIBLE_RM_FORMULA ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject last_poss_formula = NIL;
    SubLObject result = NIL;
    SubLObject cdolist_list_var = poss_rm_formulas;
    SubLObject poss_rm_formula = NIL;
    poss_rm_formula = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == subl_promotions.memberP( poss_rm_formula, last_poss_formula, Symbols.symbol_function( EQUAL ), UNPROVIDED ) || NIL != isa.isaP( cycl_utilities.formula_arg0( last_poss_formula ),
          $const58$SubcollectionFunction, UNPROVIDED, UNPROVIDED ) )
      {
        result = ConsesLow.cons( poss_rm_formula, result );
      }
      last_poss_formula = poss_rm_formula;
      cdolist_list_var = cdolist_list_var.rest();
      poss_rm_formula = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 8700L)
  public static SubLObject drt_pronoun_formula_to_property_pairs(final SubLObject pronoun_formula)
  {
    if( Sequences.length( pronoun_formula ).eql( FIVE_INTEGER ) )
    {
      final SubLObject number = conses_high.third( pronoun_formula );
      final SubLObject gender = conses_high.fourth( pronoun_formula );
      return ConsesLow.list( $list59, ConsesLow.list( $kw37$NUMBER, number ), ConsesLow.list( $kw36$GENDER, gender ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 9256L)
  public static SubLObject drt_rm_formula_properties(final SubLObject rm_formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !rm_formula.isCons() )
    {
      return Values.values( NIL, rm_formula );
    }
    final SubLObject poss_rm_wrapper_keyword = drt_rm_wrapper_fn_to_keyword( rm_formula.first() );
    if( poss_rm_wrapper_keyword == $kw60$PRONOMIAL )
    {
      return Values.values( drt_pronoun_formula_to_property_pairs( rm_formula ), NIL );
    }
    if( poss_rm_wrapper_keyword == $kw61$SOMEFN )
    {
      return Values.values( NIL, conses_high.second( rm_formula ) );
    }
    if( poss_rm_wrapper_keyword.isKeyword() )
    {
      thread.resetMultipleValues();
      final SubLObject recurse_property_pairs = drt_rm_formula_properties( conses_high.third( rm_formula ) );
      final SubLObject recurse_root_term = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != conses_high.assoc( poss_rm_wrapper_keyword, recurse_property_pairs, UNPROVIDED, UNPROVIDED ) && drt.$drt_trace_level$.getDynamicValue( thread ).numGE( ONE_INTEGER ) )
      {
        Errors.warn( $str62$drt_rm_formula_properties___A_has, rm_formula, poss_rm_wrapper_keyword );
      }
      return Values.values( ConsesLow.cons( ConsesLow.list( poss_rm_wrapper_keyword, conses_high.second( rm_formula ) ), recurse_property_pairs ), recurse_root_term );
    }
    return Values.values( NIL, rm_formula );
  }

  @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 10377L)
  public static SubLObject create_rm_from_rm_formula(final SubLObject rm_formula, SubLObject rm_formula_to_rm_mappings)
  {
    if( rm_formula_to_rm_mappings == UNPROVIDED )
    {
      rm_formula_to_rm_mappings = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject property_pairs = drt_rm_formula_properties( rm_formula );
    final SubLObject root_term = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject rm = methods.funcall_class_method_with_0_args( $sym4$RM, $sym63$NEW );
    SubLObject rm_mapped_formula = conses_high.copy_tree( root_term );
    SubLObject cdolist_list_var = rm_formula_to_rm_mappings;
    SubLObject rm_formula_to_rm_mapping = NIL;
    rm_formula_to_rm_mapping = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = rm_formula_to_rm_mapping;
      SubLObject prev_rm_formula = NIL;
      SubLObject prev_rm = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
      prev_rm_formula = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
      prev_rm = current.first();
      current = current.rest();
      if( NIL == current )
      {
        rm_mapped_formula = conses_high.subst( prev_rm, prev_rm_formula, rm_mapped_formula, Symbols.symbol_function( EQUAL ), UNPROVIDED );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list64 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      rm_formula_to_rm_mapping = cdolist_list_var.first();
    }
    instances.set_slot( rm, $sym20$FORMULA, rm_formula );
    instances.set_slot( rm, $sym19$MAPPED_FORMULA, rm_mapped_formula );
    instances.set_slot( rm, $sym18$ROOT_TERM, root_term );
    cdolist_list_var = property_pairs;
    SubLObject property_pair = NIL;
    property_pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject property_keyword = property_pair.first();
      final SubLObject property_value = conses_high.second( property_pair );
      methods.funcall_instance_method_with_2_args( rm, $sym26$SET_PROPERTY, property_keyword, property_value );
      cdolist_list_var = cdolist_list_var.rest();
      property_pair = cdolist_list_var.first();
    }
    return rm;
  }

  public static SubLObject declare_drt_rm_file()
  {
    SubLFiles.declareFunction( me, "real_rm", "REAL-RM", 1, 0, false );
    SubLFiles.declareFunction( me, "map_rm", "MAP-RM", 2, 0, false );
    SubLFiles.declareFunction( me, "get_rm_syntactic_role", "GET-RM-SYNTACTIC-ROLE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_rm_syntactic_role", "SET-RM-SYNTACTIC-ROLE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_rm_number", "GET-RM-NUMBER", 1, 0, false );
    SubLFiles.declareFunction( me, "set_rm_number", "SET-RM-NUMBER", 2, 0, false );
    SubLFiles.declareFunction( me, "get_rm_gender", "GET-RM-GENDER", 1, 0, false );
    SubLFiles.declareFunction( me, "set_rm_gender", "SET-RM-GENDER", 2, 0, false );
    SubLFiles.declareFunction( me, "get_rm_quant", "GET-RM-QUANT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_rm_quant", "SET-RM-QUANT", 2, 0, false );
    SubLFiles.declareFunction( me, "get_rm_definiteness", "GET-RM-DEFINITENESS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_rm_definiteness", "SET-RM-DEFINITENESS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_rm_conditions", "GET-RM-CONDITIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_rm_conditions", "SET-RM-CONDITIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_rm_scope", "GET-RM-SCOPE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_rm_scope", "SET-RM-SCOPE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_rm_target_term", "GET-RM-TARGET-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "set_rm_target_term", "SET-RM-TARGET-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "get_rm_target_var", "GET-RM-TARGET-VAR", 1, 0, false );
    SubLFiles.declareFunction( me, "set_rm_target_var", "SET-RM-TARGET-VAR", 2, 0, false );
    SubLFiles.declareFunction( me, "get_rm_type", "GET-RM-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_rm_type", "SET-RM-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_rm_sub_rms", "GET-RM-SUB-RMS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_rm_sub_rms", "SET-RM-SUB-RMS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_rm_super_rm", "GET-RM-SUPER-RM", 1, 0, false );
    SubLFiles.declareFunction( me, "set_rm_super_rm", "SET-RM-SUPER-RM", 2, 0, false );
    SubLFiles.declareFunction( me, "get_rm_root_term", "GET-RM-ROOT-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "set_rm_root_term", "SET-RM-ROOT-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "get_rm_mapped_formula", "GET-RM-MAPPED-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "set_rm_mapped_formula", "SET-RM-MAPPED-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "get_rm_formula", "GET-RM-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "set_rm_formula", "SET-RM-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_rm_class", "SUBLOOP-RESERVED-INITIALIZE-RM-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_rm_instance", "SUBLOOP-RESERVED-INITIALIZE-RM-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "rm_p", "RM-P", 1, 0, false );
    SubLFiles.declareFunction( me, "rm_set_property_method", "RM-SET-PROPERTY-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "rm_construct_cycl_method", "RM-CONSTRUCT-CYCL-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "rm_coreference_probability_method", "RM-COREFERENCE-PROBABILITY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "drt_rm_wrapper_fn_p", "DRT-RM-WRAPPER-FN-P", 1, 0, false );
    SubLFiles.declareFunction( me, "drt_rm_wrapper_fn_to_keyword", "DRT-RM-WRAPPER-FN-TO-KEYWORD", 1, 0, false );
    SubLFiles.declareFunction( me, "drt_possible_rm_formula", "DRT-POSSIBLE-RM-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "drt_find_rm_formulas", "DRT-FIND-RM-FORMULAS", 1, 0, false );
    SubLFiles.declareFunction( me, "drt_pronoun_formula_to_property_pairs", "DRT-PRONOUN-FORMULA-TO-PROPERTY-PAIRS", 1, 0, false );
    SubLFiles.declareFunction( me, "drt_rm_formula_properties", "DRT-RM-FORMULA-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "create_rm_from_rm_formula", "CREATE-RM-FROM-RM-FORMULA", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_drt_rm_file()
  {
    $drt_rm_wrapper_fns$ = SubLFiles.defparameter( "*DRT-RM-WRAPPER-FNS*", $list55 );
    $drt_rm_wrapper_fns_to_keywords$ = SubLFiles.defparameter( "*DRT-RM-WRAPPER-FNS-TO-KEYWORDS*", $list56 );
    return NIL;
  }

  public static SubLObject setup_drt_rm_file()
  {
    classes.subloop_new_class( $sym4$RM, $sym5$OBJECT, NIL, NIL, $list6 );
    classes.class_set_implements_slot_listeners( $sym4$RM, NIL );
    classes.subloop_note_class_initialization_function( $sym4$RM, $sym22$SUBLOOP_RESERVED_INITIALIZE_RM_CLASS );
    classes.subloop_note_instance_initialization_function( $sym4$RM, $sym25$SUBLOOP_RESERVED_INITIALIZE_RM_INSTANCE );
    subloop_reserved_initialize_rm_class( $sym4$RM );
    methods.methods_incorporate_instance_method( $sym26$SET_PROPERTY, $sym4$RM, NIL, $list27, $list28 );
    methods.subloop_register_instance_method( $sym4$RM, $sym26$SET_PROPERTY, $sym40$RM_SET_PROPERTY_METHOD );
    methods.methods_incorporate_instance_method( $sym41$CONSTRUCT_CYCL, $sym4$RM, NIL, NIL, $list42 );
    methods.subloop_register_instance_method( $sym4$RM, $sym41$CONSTRUCT_CYCL, $sym47$RM_CONSTRUCT_CYCL_METHOD );
    methods.methods_incorporate_instance_method( $sym48$COREFERENCE_PROBABILITY, $sym4$RM, NIL, $list49, $list50 );
    methods.subloop_register_instance_method( $sym4$RM, $sym48$COREFERENCE_PROBABILITY, $sym54$RM_COREFERENCE_PROBABILITY_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_drt_rm_file();
  }

  @Override
  public void initializeVariables()
  {
    init_drt_rm_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_drt_rm_file();
  }
  static
  {
    me = new drt_rm();
    $drt_rm_wrapper_fns$ = null;
    $drt_rm_wrapper_fns_to_keywords$ = null;
    $sym0$TARGET_TERM = makeSymbol( "TARGET-TERM" );
    $str1$_______________________RM_MAPPING = makeString( "~%******************** RM MAPPING ********************~%" );
    $str2$_A_has_been_mapped_to__A__ = makeString( "~A has been mapped to ~A~%" );
    $str3$map_rm___A_was_mapped_to__A__now_ = makeString( "map-rm: ~A was mapped to ~A, now to ~A~%" );
    $sym4$RM = makeSymbol( "RM" );
    $sym5$OBJECT = makeSymbol( "OBJECT" );
    $list6 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "FORMULA" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "MAPPED-FORMULA" ), makeKeyword( "INSTANCE" ),
        makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "ROOT-TERM" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "SUPER-RM" ), makeKeyword( "INSTANCE" ), makeKeyword(
            "PROTECTED" ) ), ConsesLow.list( makeSymbol( "SUB-RMS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "TYPE" ), makeKeyword( "INSTANCE" ), makeKeyword(
                "PROTECTED" ) ), ConsesLow.list( makeSymbol( "TARGET-VAR" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "TARGET-TERM" ), makeKeyword( "INSTANCE" ), makeKeyword(
                    "PROTECTED" ) ), ConsesLow.list( makeSymbol( "SCOPE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "CONDITIONS" ), makeKeyword( "INSTANCE" ), makeKeyword(
                        "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEFINITENESS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "QUANT" ), makeKeyword( "INSTANCE" ),
                            makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "GENDER" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "NUMBER" ), makeKeyword(
                                "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "SYNTACTIC-ROLE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                                    "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-PROPERTY" ), ConsesLow.list( makeSymbol( "PROPERTY-KEYWORD" ), makeSymbol( "NEW-PROPERTY-VALUE" ) ), makeKeyword( "NO-MEMBER-VARIABLES" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "COREFERENCE-PROBABILITY" ), ConsesLow.list( makeSymbol( "TARGET-RM" ) ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
          "CONSTRUCT-CYCL" ), NIL )
    } );
    $sym7$SYNTACTIC_ROLE = makeSymbol( "SYNTACTIC-ROLE" );
    $sym8$NUMBER = makeSymbol( "NUMBER" );
    $sym9$GENDER = makeSymbol( "GENDER" );
    $sym10$QUANT = makeSymbol( "QUANT" );
    $sym11$DEFINITENESS = makeSymbol( "DEFINITENESS" );
    $sym12$CONDITIONS = makeSymbol( "CONDITIONS" );
    $sym13$SCOPE = makeSymbol( "SCOPE" );
    $sym14$TARGET_VAR = makeSymbol( "TARGET-VAR" );
    $sym15$TYPE = makeSymbol( "TYPE" );
    $sym16$SUB_RMS = makeSymbol( "SUB-RMS" );
    $sym17$SUPER_RM = makeSymbol( "SUPER-RM" );
    $sym18$ROOT_TERM = makeSymbol( "ROOT-TERM" );
    $sym19$MAPPED_FORMULA = makeSymbol( "MAPPED-FORMULA" );
    $sym20$FORMULA = makeSymbol( "FORMULA" );
    $sym21$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym22$SUBLOOP_RESERVED_INITIALIZE_RM_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-RM-CLASS" );
    $sym23$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym24$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym25$SUBLOOP_RESERVED_INITIALIZE_RM_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-RM-INSTANCE" );
    $sym26$SET_PROPERTY = makeSymbol( "SET-PROPERTY" );
    $list27 = ConsesLow.list( makeSymbol( "PROPERTY-KEYWORD" ), makeSymbol( "NEW-PROPERTY-VALUE" ) );
    $list28 = ConsesLow.list( makeString( "Sets the property of this RM indicated by PROPERTY-KEYWORD to NEW-PROPERTY-VALUE." ), ConsesLow.list( new SubLObject[] { makeSymbol( "PCASE" ), makeSymbol( "PROPERTY-KEYWORD" ),
      ConsesLow.list( makeKeyword( "TYPE" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TYPE" ), makeSymbol( "NEW-PROPERTY-VALUE" ) ) ), ConsesLow.list( makeKeyword( "DEFINITENESS" ), ConsesLow.list( makeSymbol(
          "CSETQ" ), makeSymbol( "DEFINITENESS" ), makeSymbol( "NEW-PROPERTY-VALUE" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( EQ, makeSymbol( "NEW-PROPERTY-VALUE" ), constant_handles
              .reader_make_constant_shell( makeString( "Definite-NLAttr" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TYPE" ), makeKeyword( "DEFINITE" ) ) ) ), ConsesLow.list( makeKeyword( "QUANT" ),
                  ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "QUANT" ), makeSymbol( "NEW-PROPERTY-VALUE" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( EQ, makeSymbol( "NEW-PROPERTY-VALUE" ),
                      constant_handles.reader_make_constant_shell( makeString( "ProperName-NLAttr" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TARGET-TERM" ), makeSymbol( "ROOT-TERM" ) ) ) ), ConsesLow
                          .list( makeKeyword( "GENDER" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "GENDER" ), makeSymbol( "NEW-PROPERTY-VALUE" ) ) ), ConsesLow.list( makeKeyword( "NUMBER" ), ConsesLow.list(
                              makeSymbol( "CSETQ" ), makeSymbol( "NUMBER" ), makeSymbol( "NEW-PROPERTY-VALUE" ) ) ), ConsesLow.list( makeKeyword( "SYNTACTIC-ROLE" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                                  "SYNTACTIC-ROLE" ), makeSymbol( "NEW-PROPERTY-VALUE" ) ) ), ConsesLow.list( makeSymbol( "OTHERWISE" ), ConsesLow.list( makeSymbol( "DRT-WARN" ), makeString(
                                      "~%(rm-set-property-method ~A) property keyword/value ~A/~A invalid" ), makeSymbol( "SELF" ), makeSymbol( "PROPERTY-KEYWORD" ), makeSymbol( "NEW-PROPERTY-VALUE" ) ) )
    } ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym29$OUTER_CATCH_FOR_RM_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-RM-METHOD" );
    $kw30$TYPE = makeKeyword( "TYPE" );
    $kw31$DEFINITENESS = makeKeyword( "DEFINITENESS" );
    $const32$Definite_NLAttr = constant_handles.reader_make_constant_shell( makeString( "Definite-NLAttr" ) );
    $kw33$DEFINITE = makeKeyword( "DEFINITE" );
    $kw34$QUANT = makeKeyword( "QUANT" );
    $const35$ProperName_NLAttr = constant_handles.reader_make_constant_shell( makeString( "ProperName-NLAttr" ) );
    $kw36$GENDER = makeKeyword( "GENDER" );
    $kw37$NUMBER = makeKeyword( "NUMBER" );
    $kw38$SYNTACTIC_ROLE = makeKeyword( "SYNTACTIC-ROLE" );
    $str39$___rm_set_property_method__A__pro = makeString( "~%(rm-set-property-method ~A) property keyword/value ~A/~A invalid" );
    $sym40$RM_SET_PROPERTY_METHOD = makeSymbol( "RM-SET-PROPERTY-METHOD" );
    $sym41$CONSTRUCT_CYCL = makeSymbol( "CONSTRUCT-CYCL" );
    $list42 = ConsesLow.list( makeString( "Constructs the cycl that this RM can be represented with." ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "TARGET-VAR" ),
        makeSymbol( "TARGET-TERM" ) ), ConsesLow.list( makeSymbol( "DRT-WARN" ), makeString( "~%(rm-construct-cycl-method ~A) both target-var (~A) and target-term (~A) are set: using target-var" ), makeSymbol( "SELF" ),
            makeSymbol( "TARGET-VAR" ), makeSymbol( "TARGET-TERM" ) ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( makeSymbol( "TARGET-VAR" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                "TARGET-VAR" ) ) ), ConsesLow.list( makeSymbol( "TARGET-TERM" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TARGET-TERM" ) ) ), ConsesLow.list( makeSymbol( "ROOT-TERM" ), ConsesLow.list(
                    makeSymbol( "DRT-WARN" ), makeString( "~%(rm-construct-cycl-method ~A) niether target-var nor target-term are set: using root-term (~A)" ), makeSymbol( "SELF" ), makeSymbol( "ROOT-TERM" ) ), ConsesLow
                        .list( makeSymbol( "RET" ), makeSymbol( "ROOT-TERM" ) ) ), ConsesLow.list( T, ConsesLow.list( makeSymbol( "DRT-WARN" ), makeString( "~%(rm-construct-cycl-method ~A) no match." ), makeSymbol(
                            "SELF" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) ) );
    $sym43$OUTER_CATCH_FOR_RM_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-RM-METHOD" );
    $str44$___rm_construct_cycl_method__A__b = makeString( "~%(rm-construct-cycl-method ~A) both target-var (~A) and target-term (~A) are set: using target-var" );
    $str45$___rm_construct_cycl_method__A__n = makeString( "~%(rm-construct-cycl-method ~A) niether target-var nor target-term are set: using root-term (~A)" );
    $str46$___rm_construct_cycl_method__A__n = makeString( "~%(rm-construct-cycl-method ~A) no match." );
    $sym47$RM_CONSTRUCT_CYCL_METHOD = makeSymbol( "RM-CONSTRUCT-CYCL-METHOD" );
    $sym48$COREFERENCE_PROBABILITY = makeSymbol( "COREFERENCE-PROBABILITY" );
    $list49 = ConsesLow.list( makeSymbol( "TARGET-RM" ) );
    $list50 = ConsesLow.list( makeString(
        "Determines the probability that this RM can corefer to TARGET-RM.\n@returns a number between 0 and 1, or nil if no coreference is possible.\n@note This is a simple initial implementation..." ), ConsesLow.list(
            makeSymbol( "PWHEN" ), ConsesLow.list( EQ, makeSymbol( "SELF" ), makeSymbol( "TARGET-RM" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol(
                "TREE-FIND" ), makeSymbol( "FORMULA" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "TARGET-RM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FORMULA" ) ) ), ConsesLow.list( makeSymbol(
                    "FUNCTION" ), EQUAL ) ), ConsesLow.list( makeSymbol( "RET" ), makeDouble( 0.0 ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PROBABILITY" ), makeDouble(
                        0.0 ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( EQ, makeSymbol( "GENDER" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "TARGET-RM" ), ConsesLow.list( makeSymbol(
                            "QUOTE" ), makeSymbol( "GENDER" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PROBABILITY" ), ConsesLow.list( makeSymbol( "+" ), makeSymbol( "PROBABILITY" ), makeDouble(
                                0.5 ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( EQ, makeSymbol( "NUMBER" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "TARGET-RM" ), ConsesLow.list(
                                    makeSymbol( "QUOTE" ), makeSymbol( "NUMBER" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PROBABILITY" ), ConsesLow.list( makeSymbol( "+" ), makeSymbol( "PROBABILITY" ),
                                        makeDouble( 0.5 ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "PROBABILITY" ) ) ) );
    $sym51$OUTER_CATCH_FOR_RM_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-RM-METHOD" );
    $float52$0_0 = makeDouble( 0.0 );
    $float53$0_5 = makeDouble( 0.5 );
    $sym54$RM_COREFERENCE_PROBABILITY_METHOD = makeSymbol( "RM-COREFERENCE-PROBABILITY-METHOD" );
    $list55 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NLSemFn" ) ), constant_handles.reader_make_constant_shell( makeString( "NLNumberFn" ) ), constant_handles
        .reader_make_constant_shell( makeString( "NLQuantFn-3" ) ), constant_handles.reader_make_constant_shell( makeString( "NLDefinitenessFn-3" ) ), constant_handles.reader_make_constant_shell( makeString(
            "NLTagFn" ) ), constant_handles.reader_make_constant_shell( makeString( "PronounFn" ) ), constant_handles.reader_make_constant_shell( makeString( "SomeFn" ) ) );
    $list56 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NLSemFn" ) ), makeKeyword( "SEM" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "NLNumberFn" ) ), makeKeyword( "NUMBER" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NLDefinitenessFn-3" ) ), makeKeyword( "DEFINITENESS" ) ), ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "NLQuantFn-3" ) ), makeKeyword( "QUANT" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NLTagFn" ) ), makeKeyword( "ANY" ) ), ConsesLow
                .list( constant_handles.reader_make_constant_shell( makeString( "PronounFn" ) ), makeKeyword( "PRONOMIAL" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SomeFn" ) ),
                    makeKeyword( "SOMEFN" ) ) );
    $sym57$DRT_POSSIBLE_RM_FORMULA = makeSymbol( "DRT-POSSIBLE-RM-FORMULA" );
    $const58$SubcollectionFunction = constant_handles.reader_make_constant_shell( makeString( "SubcollectionFunction" ) );
    $list59 = ConsesLow.list( makeKeyword( "TYPE" ), makeKeyword( "PRONOMIAL" ) );
    $kw60$PRONOMIAL = makeKeyword( "PRONOMIAL" );
    $kw61$SOMEFN = makeKeyword( "SOMEFN" );
    $str62$drt_rm_formula_properties___A_has = makeString( "drt-rm-formula-properties: ~A has multiple ~A properties" );
    $sym63$NEW = makeSymbol( "NEW" );
    $list64 = ConsesLow.list( makeSymbol( "PREV-RM-FORMULA" ), makeSymbol( "PREV-RM" ) );
  }
}
/*
 * 
 * Total time: 211 ms
 * 
 */